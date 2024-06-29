import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class75 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "[I")
    public static int[] field1441 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "[Lle;")
    public static class125[] field1435;

    @OriginalMember(owner = "client!gi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1439++;
        if (class17.field309 != null) {
            class111.field2006 = -1;
        }
    }

    @OriginalMember(owner = "client!gi", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field1438++;
        if (class17.field309 != null) {
            class146.field2568 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class78.field1507.length) {
                var3 = class78.field1507[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class111.field2006 >= 0 && var3 >= 0) {
                class151.field2622[class111.field2006] = ~var3;
                class111.field2006 = class111.field2006 + 1 & 0x7F;
                if (class230.field4313 == class111.field2006) {
                    class111.field2006 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!gi", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class17.field309 != null) {
            int var2 = class74.method572(-1, arg0);
            if (var2 >= 0) {
                int var3 = class55.field1006 + 1 & 0x7F;
                if (class197.field3496 != var3) {
                    class89.field1697[class55.field1006] = -1;
                    class84.field1633[class55.field1006] = var2;
                    class55.field1006 = var3;
                }
            }
        }
        field1440++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public static void method582(int arg0) {
        field1435 = null;
        field1441 = null;
        if (arg0 >= -4) {
            method583(-8, -4, -19, -71, null, 66L, null, null);
        }
    }

    @OriginalMember(owner = "client!gi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1442++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIILwd;JLwd;Lwd;)V")
    public static final void method583(int arg0, int arg1, int arg2, int arg3, class234 arg4, long arg5, class234 arg6, class234 arg7) {
        class174 var9 = new class174();
        var9.field3019 = arg4;
        var9.field3014 = arg1 * 128 + 64;
        var9.field3023 = arg2 * 128 + 64;
        var9.field3020 = arg3;
        var9.field3015 = arg5;
        var9.field3022 = arg6;
        var9.field3024 = arg7;
        int var10 = 0;
        class68 var11 = class32.field567[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1300; var12++) {
                class106 var13 = var11.field1314[var12];
                if ((var13.field1953 & 0x400000L) == 4194304L) {
                    int var14 = var13.field1947.method67();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field3021 = -var10;
        if (class32.field567[arg0][arg1][arg2] == null) {
            class32.field567[arg0][arg1][arg2] = new class68(arg0, arg1, arg2);
        }
        class32.field567[arg0][arg1][arg2].field1302 = var9;
    }

    @OriginalMember(owner = "client!gi", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field1436++;
        if (class17.field309 == null) {
            return;
        }
        class146.field2568 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class78.field1507.length) {
            var3 = class78.field1507[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class111.field2006 >= 0 && var3 >= 0) {
            class151.field2622[class111.field2006] = var3;
            class111.field2006 = class111.field2006 + 1 & 0x7F;
            if (class230.field4313 == class111.field2006) {
                class111.field2006 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class55.field1006 + 1 & 0x7F;
            if (class197.field3496 != var4) {
                class89.field1697[class55.field1006] = var3;
                class84.field1633[class55.field1006] = -1;
                class55.field1006 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIII)V")
    public static final void method584(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1434++;
        int var6 = arg5 - arg0;
        int var7 = arg1 - arg3;
        if (var7 == 0) {
            if (var6 != 0) {
                class15.method126(arg0, arg2, arg5, arg3, -121);
            }
        } else if (var6 == 0) {
            class212.method1373(arg2, (byte) 116, arg0, arg1, arg3);
        } else {
            int var8 = (var6 << 12) / var7;
            if (arg4 <= 85) {
                field1435 = null;
            }
            int var9 = arg0 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (arg3 < class70.field1337) {
                var10 = (class70.field1337 * var8 >> 12) + var9;
                var11 = class70.field1337;
            } else if (class70.field1321 >= arg3) {
                var10 = arg0;
                var11 = arg3;
            } else {
                var10 = (class70.field1321 * var8 >> 12) + var9;
                var11 = class70.field1321;
            }
            int var12;
            int var13;
            if (class70.field1337 > arg1) {
                var12 = (class70.field1337 * var8 >> 12) + var9;
                var13 = class70.field1337;
            } else if (class70.field1321 < arg1) {
                var12 = var9 + (class70.field1321 * var8 >> 12);
                var13 = class70.field1321;
            } else {
                var13 = arg1;
                var12 = arg5;
            }
            if (var12 < class14.field267) {
                var13 = (class14.field267 - var9 << 12) / var8;
                var12 = class14.field267;
            } else if (var12 > class57.field1068) {
                var13 = (class57.field1068 - var9 << 12) / var8;
                var12 = class57.field1068;
            }
            if (var10 < class14.field267) {
                var11 = (class14.field267 - var9 << 12) / var8;
                var10 = class14.field267;
            } else if (class57.field1068 < var10) {
                var11 = (class57.field1068 - var9 << 12) / var8;
                var10 = class57.field1068;
            }
            class131.method890(var10, var13, var12, arg2, 4, var11);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "([BI)V")
    public static final void method585(byte[] arg0, int arg1) {
        int var2 = class192.field3331 >> 2 << 10;
        field1437++;
        if (arg1 != -1059288212) {
            method582(109);
        }
        int var3 = class102.field1863 >> 1;
        int var4 = 0;
        byte[][] var5 = new byte[class168.field2896][class214.field3851];
        while (true) {
            while (arg0.length > var4) {
                int var34 = (arg0[var4++] & 0xFF) * 64 - class198.field3502;
                int var35 = (arg0[var4++] & 0xFF) * 64 - class136.field2431;
                if (var34 > 0 && var35 > 0 && var34 + 64 < class168.field2896 && var35 + 64 < class214.field3851) {
                    for (int var36 = 0; var36 < 64; var36++) {
                        byte[] var37 = var5[var34 + var36];
                        int var38 = class214.field3851 - var35 - 1;
                        for (int var39 = -64; var39 < 0; var39++) {
                            var37[var38--] = arg0[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            int var6 = class168.field2896;
            int var7 = class214.field3851;
            int[] var8 = new int[var7];
            int[] var9 = new int[var7];
            int[] var10 = new int[var7];
            int[] var11 = new int[var7];
            int[] var12 = new int[var7];
            for (int var13 = -5; var13 < var6; var13++) {
                for (int var14 = 0; var14 < var7; var14++) {
                    int var28 = var13 + 5;
                    int var10002;
                    if (var6 > var28) {
                        int var29 = var5[var28][var14] & 0xFF;
                        if (var29 > 0) {
                            class162 var30 = class42.method288(arg1 ^ 0xC0DC8B6D, var29 - 1);
                            var8[var14] += var30.field2796;
                            var10[var14] += var30.field2803;
                            var9[var14] += var30.field2794;
                            var11[var14] += var30.field2804;
                            var10002 = var12[var14]++;
                        }
                    }
                    int var31 = var13 - 5;
                    if (var31 >= 0) {
                        int var32 = var5[var31][var14] & 0xFF;
                        if (var32 > 0) {
                            class162 var33 = class42.method288(1, var32 - 1);
                            var8[var14] -= var33.field2796;
                            var10[var14] -= var33.field2803;
                            var9[var14] -= var33.field2794;
                            var11[var14] -= var33.field2804;
                            var10002 = var12[var14]--;
                        }
                    }
                }
                if (var13 >= 0) {
                    int[][] var15 = class95.field1772[var13 >> 6];
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; var21 < var7; var21++) {
                        int var22 = var21 + 5;
                        if (var7 > var22) {
                            var16 += var10[var22];
                            var17 += var9[var22];
                            var20 += var12[var22];
                            var18 += var11[var22];
                            var19 += var8[var22];
                        }
                        int var23 = var21 - 5;
                        if (var23 >= 0) {
                            var16 -= var10[var23];
                            var17 -= var9[var23];
                            var19 -= var8[var23];
                            var20 -= var12[var23];
                            var18 -= var11[var23];
                        }
                        if (var21 >= 0 && var20 > 0) {
                            int var24 = var21 >> 6;
                            int var25 = var18 == 0 ? 0 : class27.method196(var19 * 256 / var18, var16 / var20, -218, var17 / var20);
                            if (var5[var13][var21] != 0) {
                                int var26 = (var25 & 0x7F) + var3;
                                if (var26 < 0) {
                                    var26 = 0;
                                } else if (var26 > 127) {
                                    var26 = 127;
                                }
                                int var27 = (var25 + var2 & 0xFC00) + (var25 & 0x380) + var26;
                                if (var15[var24] == null) {
                                    var15[var24] = class95.field1772[var13 >> 6][var24] = new int[4096];
                                }
                                var15[var24][class29.method202(63, var13) + class29.method202(4032, var21 << 6)] = class206.field3697[class63.method471(96, arg1 + 1059288339, var27)];
                            } else if (var15[var24] != null) {
                                var15[var24][(class29.method202(var21, 63) << 6) + class29.method202(63, var13)] = 0;
                            }
                        }
                    }
                }
            }
            return;
        }
    }
}
