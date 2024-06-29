import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class234 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "[I")
    public static int[] field4006 = new int[128];

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lmb;")
    public static class96 field4014 = class243.method1708(")4", (byte) 109);

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public static int field4018 = 0;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "Lgd;")
    public static class123 field4017;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Leh;")
    public static class132 field4010;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method1584(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        client.field1990++;
        class220.field3760 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class58.field1023; var12 < class163.field2893; var12++) {
            class187[][] var38 = class259.field4487[var12];
            for (int var39 = class239.field4109; var39 < class231.field3971; var39++) {
                for (int var40 = class161.field2847; var40 < class78.field1325; var40++) {
                    class187 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class55.field946[var39 + class233.field3992 - class14.field224][var40 + class233.field3992 - class6.field120] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field3273 = true;
                            var41.field3270 = true;
                            if (var41.field3282 > 0) {
                                var41.field3267 = true;
                            } else {
                                var41.field3267 = false;
                            }
                            class220.field3760++;
                        } else {
                            var41.field3273 = false;
                            var41.field3270 = false;
                            var41.field3278 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field3281 != null) {
                                    class19 var42 = var41.field3281;
                                    var42.field311.method827(var42.field305, var42.field305, var42.field315, true, var42.field315);
                                    if (var42.field303 != null) {
                                        var42.field303.method827(var42.field305, var42.field305, var42.field315, true, var42.field315);
                                    }
                                }
                                if (var41.field3269 != null) {
                                    class105 var43 = var41.field3269;
                                    var43.field1754.method827(var43.field1758, var43.field1758, var43.field1760, true, var43.field1760);
                                    if (var43.field1757 != null) {
                                        var43.field1757.method827(var43.field1758, var43.field1758, var43.field1760, true, var43.field1760);
                                    }
                                }
                                if (var41.field3279 != null) {
                                    class5 var44 = var41.field3279;
                                    var44.field104.method827(var44.field106, var44.field106, var44.field108, true, var44.field108);
                                }
                                if (var41.field3274 != null) {
                                    for (int var45 = 0; var45 < var41.field3282; var45++) {
                                        class70 var46 = var41.field3274[var45];
                                        var46.field1214.method827(var46.field1205, var46.field1208, var46.field1211, true, var46.field1204);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class25.field418 == class173.field3022;
        for (int var14 = class58.field1023; var14 < class163.field2893; var14++) {
            class187[][] var27 = class259.field4487[var14];
            for (int var28 = -class233.field3992; var28 <= 0; var28++) {
                int var29 = class14.field224 + var28;
                int var30 = class14.field224 - var28;
                if (var29 >= class239.field4109 || var30 < class231.field3971) {
                    for (int var31 = -class233.field3992; var31 <= 0; var31++) {
                        int var32 = class6.field120 + var31;
                        int var33 = class6.field120 - var31;
                        if (var29 >= class239.field4109) {
                            if (var32 >= class161.field2847) {
                                class187 var34 = var27[var29][var32];
                                if (var34 != null && var34.field3273) {
                                    class99.method747(var34, true);
                                }
                            }
                            if (var33 < class78.field1325) {
                                class187 var35 = var27[var29][var33];
                                if (var35 != null && var35.field3273) {
                                    class99.method747(var35, true);
                                }
                            }
                        }
                        if (var30 < class231.field3971) {
                            if (var32 >= class161.field2847) {
                                class187 var36 = var27[var30][var32];
                                if (var36 != null && var36.field3273) {
                                    class99.method747(var36, true);
                                }
                            }
                            if (var33 < class78.field1325) {
                                class187 var37 = var27[var30][var33];
                                if (var37 != null && var37.field3273) {
                                    class99.method747(var37, true);
                                }
                            }
                        }
                        if (class220.field3760 == 0) {
                            if (!var13) {
                                class269.field4679 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class58.field1023; var15 < class163.field2893; var15++) {
            class187[][] var16 = class259.field4487[var15];
            for (int var17 = -class233.field3992; var17 <= 0; var17++) {
                int var18 = class14.field224 + var17;
                int var19 = class14.field224 - var17;
                if (var18 >= class239.field4109 || var19 < class231.field3971) {
                    for (int var20 = -class233.field3992; var20 <= 0; var20++) {
                        int var21 = class6.field120 + var20;
                        int var22 = class6.field120 - var20;
                        if (var18 >= class239.field4109) {
                            if (var21 >= class161.field2847) {
                                class187 var23 = var16[var18][var21];
                                if (var23 != null && var23.field3273) {
                                    class99.method747(var23, false);
                                }
                            }
                            if (var22 < class78.field1325) {
                                class187 var24 = var16[var18][var22];
                                if (var24 != null && var24.field3273) {
                                    class99.method747(var24, false);
                                }
                            }
                        }
                        if (var19 < class231.field3971) {
                            if (var21 >= class161.field2847) {
                                class187 var25 = var16[var19][var21];
                                if (var25 != null && var25.field3273) {
                                    class99.method747(var25, false);
                                }
                            }
                            if (var22 < class78.field1325) {
                                class187 var26 = var16[var19][var22];
                                if (var26 != null && var26.field3273) {
                                    class99.method747(var26, false);
                                }
                            }
                        }
                        if (class220.field3760 == 0) {
                            if (!var13) {
                                class269.field4679 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class269.field4679 = false;
    }

    @OriginalMember(owner = "client!eb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4007++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static final void method1585(int arg0) {
        field4004++;
        int var1 = 0;
        int var2 = -34 / ((-arg0 - 64) / 58);
        for (int var3 = 0; var3 < 104; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                if (class92.method651(var4, (byte) -55, var3, true, class259.field4487, var1)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class60.field1037 != null) {
            int var2 = class157.method1139(arg0, (byte) -127);
            if (var2 >= 0) {
                int var3 = class185.field3221 + 1 & 0x7F;
                if (class124.field2296 != var3) {
                    class114.field2104[class185.field3221] = -1;
                    class9.field160[class185.field3221] = var2;
                    class185.field3221 = var3;
                }
            }
        }
        arg0.consume();
        field4011++;
    }

    @OriginalMember(owner = "client!eb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class60.field1037 != null) {
            class268.field4664 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class78.field1331.length) {
                var3 = class78.field1331[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class272.field4721 >= 0 && var3 >= 0) {
                class209.field3606[class272.field4721] = var3;
                class272.field4721 = class272.field4721 + 1 & 0x7F;
                if (class272.field4721 == class235.field4019) {
                    class272.field4721 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class185.field3221 + 1 & 0x7F;
                if (class124.field2296 != var4) {
                    class114.field2104[class185.field3221] = var3;
                    class9.field160[class185.field3221] = -1;
                    class185.field3221 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field4009++;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
    public static void method1586(int arg0) {
        if (arg0 != -1) {
            method1585(-78);
        }
        field4014 = null;
        field4017 = null;
        field4006 = null;
        field4010 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)V")
    public static final void method1587(byte arg0, int arg1) {
        class137.field2450.method82((byte) -109, arg1);
        if (arg0 <= 4) {
            field4016 = 61;
        }
        field4005++;
        class24.field405.method82((byte) -109, arg1);
        class138.field2459.method82((byte) -109, arg1);
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(BI)Log;")
    public static final class242 method1588(byte arg0, int arg1) {
        field4008++;
        class242 var2 = (class242) class22.field366.method158((long) arg1, (byte) -122);
        if (arg0 <= 110) {
            return null;
        } else if (var2 == null) {
            byte[] var3;
            if (arg1 >= 32768) {
                var3 = class198.field3465.method23(arg1 & 0x7FFF, 103, 0);
            } else {
                var3 = class168.field2960.method23(arg1, 103, 0);
            }
            class242 var4 = new class242();
            if (var3 != null) {
                var4.method1706(true, new class239(var3));
            }
            if (arg1 >= 32768) {
                var4.method1703(-79);
            }
            class22.field366.method155((long) arg1, var4, (byte) 118);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!eb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field4015++;
        if (class60.field1037 != null) {
            class272.field4721 = -1;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)I")
    public static final int method1589(int arg0, int arg1, int arg2) {
        field4013++;
        if (arg1 < 83) {
            return 0;
        } else if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!eb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class60.field1037 != null) {
            class268.field4664 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class78.field1331.length) {
                var3 = class78.field1331[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class272.field4721 >= 0 && var3 >= 0) {
                class209.field3606[class272.field4721] = ~var3;
                class272.field4721 = class272.field4721 + 1 & 0x7F;
                if (class272.field4721 == class235.field4019) {
                    class272.field4721 = -1;
                }
            }
        }
        field4012++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIILnb;Lnb;IIJ)V")
    public static final void method1590(int arg0, int arg1, int arg2, int arg3, class108 arg4, class108 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class19 var10 = new class19();
        var10.field309 = arg8;
        var10.field305 = arg1 * 128 + 64;
        var10.field315 = arg2 * 128 + 64;
        var10.field308 = arg3;
        var10.field311 = arg4;
        var10.field303 = arg5;
        var10.field306 = arg6;
        var10.field314 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class259.field4487[var11][arg1][arg2] == null) {
                class259.field4487[var11][arg1][arg2] = new class187(var11, arg1, arg2);
            }
        }
        class259.field4487[arg0][arg1][arg2].field3281 = var10;
    }
}
