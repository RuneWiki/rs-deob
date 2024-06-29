import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class168 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2717 = " from your friend list first.";

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field2724 = 0;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "Ljd;")
    public static class95 field2723;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2728;

    @OriginalMember(owner = "client!oj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 4)
    public final synchronized void focusLost(FocusEvent arg0) {
        field2719++;
        if (class121.field1857 != null) {
            class4.field60 = -1;
        }
    }

    @OriginalMember(owner = "client!oj", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 19)
    public final void keyTyped(KeyEvent arg0) {
        field2722++;
        if (class121.field1857 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class158.method1186(true, var2)) {
                int var3 = class90.field1309 + 1 & 0x7F;
                if (class284.field4434 != var3) {
                    class90.field1298[class90.field1309] = -1;
                    class293.field4529[class90.field1309] = var2;
                    class90.field1309 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 49)
    public static final void method1272(int arg0) {
        class49.field670.method191(0);
        field2726++;
        for (int var1 = 0; var1 < 32; var1++) {
            class305.field4772[var1] = 0L;
        }
        if (arg0 > 79) {
            for (int var2 = 0; var2 < 32; var2++) {
                class248.field3728[var2] = 0L;
            }
            class25.field280 = 0;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(FIIZIIII)[I", line = 76)
    public static final int[] method1273(float arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field2725++;
        int[] var8 = new int[arg2];
        class313 var9 = new class313();
        var9.field4859 = arg5;
        var9.field4851 = arg4;
        var9.field4854 = arg3;
        var9.field4849 = arg6;
        var9.field4847 = arg1;
        var9.field4861 = (int) (arg0 * 4096.0F);
        var9.method100(true);
        class5.method38(arg2, arg7, 927531564);
        var9.method2139(0, 3228, var8);
        return var8;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lwm;I)V", line = 98)
    public static final void method1274(class254 arg0, int arg1) {
        field2718++;
        int var2 = class258.field3976 >> 2 << 10;
        byte[][] var3 = new byte[class243.field3691][class229.field3494];
        int var4 = class63.field837 >> 1;
        while (arg0.field3866 < arg0.field3840.length) {
            int var5 = 0;
            int var6 = 0;
            boolean var7 = false;
            if (arg0.method1774((byte) 28) == 1) {
                var7 = true;
                var5 = arg0.method1774((byte) 75);
                var6 = arg0.method1774((byte) -127);
            }
            int var8 = arg0.method1774((byte) -1);
            int var9 = arg0.method1774((byte) 58);
            int var10 = var8 * 64 - class196.field3024;
            int var11 = class229.field3494 - (1 - class176.field2822) - var9 * 64;
            if (var10 >= 0 && (var11 - 63) >= 0 && class243.field3691 > var10 + 63 && var11 < class229.field3494) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var3[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var7 || var5 * 8 <= var12 && var12 < var5 * 8 + 8 && (var6 * 8) <= var14 && var6 * 8 + 8 > var14) {
                            var13[var11 - var14] = arg0.method1733(2023893896);
                        }
                    }
                }
            } else if (var7) {
                arg0.field3866 += 64;
            } else {
                arg0.field3866 += 4096;
            }
        }
        int var15 = class229.field3494;
        int[] var16 = new int[var15];
        int var17 = class243.field3691;
        int[] var18 = new int[var15];
        int[] var19 = new int[var15];
        int[] var20 = new int[var15];
        int[] var21 = new int[var15];
        for (int var22 = -5; var22 < var17; var22++) {
            for (int var23 = 0; var23 < var15; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var17 > var24) {
                    int var25 = var3[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class47 var26 = class260.method1830(var25 - 1, 262144);
                        var16[var23] += var26.field645;
                        var18[var23] += var26.field643;
                        var20[var23] += var26.field653;
                        var19[var23] += var26.field648;
                        var10002 = var21[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var3[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class47 var29 = class260.method1830(var28 - 1, 262144);
                        var16[var23] -= var29.field645;
                        var18[var23] -= var29.field643;
                        var20[var23] -= var29.field653;
                        var19[var23] -= var29.field648;
                        var10002 = var21[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int var30 = 0;
                int[][] var31 = class157.field2389[var22 >> 6];
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var15; var36++) {
                    int var37 = var36 + 5;
                    if (var37 < var15) {
                        var34 += var21[var37];
                        var30 += var16[var37];
                        var32 += var20[var37];
                        var33 += var18[var37];
                        var35 += var19[var37];
                    }
                    int var38 = var36 - 5;
                    if (var38 >= 0) {
                        var33 -= var18[var38];
                        var34 -= var21[var38];
                        var32 -= var20[var38];
                        var35 -= var19[var38];
                        var30 -= var16[var38];
                    }
                    if (var36 >= 0 && var34 > 0) {
                        int[] var39 = var31[var36 >> 6];
                        int var40 = var35 == 0 ? 0 : class298.method2054(var30 * 256 / var35, (byte) 78, var33 / var34, var32 / var34);
                        if (var3[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var31[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var4;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var2 + var40 & 0xFC00) - (-(var40 & 0x380) - var41);
                            var39[class149.method1117(var22, 63) + class149.method1117(var36 << 6, 4032)] = class164.field2659[class56.method402(96, (byte) 108, var42)];
                        } else if (var39 != null) {
                            var39[(class149.method1117(63, var36) << 6) + class149.method1117(var22, 63)] = 0;
                        }
                    }
                }
            }
        }
        int var43 = -70 % ((arg1 + 26) / 38);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)[Lrj;", line = 327)
    public static final class269[] method1275(boolean arg0) {
        field2727++;
        if (arg0) {
            return (class269[]) null;
        }
        class269[] var1 = new class269[class131.field2005];
        for (int var2 = 0; var2 < class131.field2005; var2++) {
            int var3 = class209.field3191[var2] * class133.field2028[var2];
            byte[] var4 = class220.field3362[var2];
            if (class136.field2057[var2]) {
                byte[] var7 = class250.field3765[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class261.method1835(class149.method1117(var7[var9], 255) << 24, class82.field1212[class149.method1117(var4[var9], 255)]);
                }
                if (class73.field1058) {
                    var1[var2] = new class334(class233.field3554, class38.field559, class304.field4666[var2], class27.field293[var2], class133.field2028[var2], class209.field3191[var2], var8);
                } else {
                    var1[var2] = new class17(class233.field3554, class38.field559, class304.field4666[var2], class27.field293[var2], class133.field2028[var2], class209.field3191[var2], var8);
                }
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class82.field1212[class149.method1117(var4[var6], 255)];
                }
                if (class73.field1058) {
                    var1[var2] = new class44(class233.field3554, class38.field559, class304.field4666[var2], class27.field293[var2], class133.field2028[var2], class209.field3191[var2], var5);
                } else {
                    var1[var2] = new class195(class233.field3554, class38.field559, class304.field4666[var2], class27.field293[var2], class133.field2028[var2], class209.field3191[var2], var5);
                }
            }
        }
        class245.method1684(255);
        return var1;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V", line = 392)
    public static void method1276(int arg0) {
        field2728 = null;
        field2717 = null;
        int var1 = -62 % ((-arg0 - 1) / 49);
        field2723 = null;
    }

    @OriginalMember(owner = "client!oj", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 403)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2721++;
        if (class121.field1857 == null) {
            return;
        }
        class28.field321 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class319.field4932.length) {
            var3 = class319.field4932[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class4.field60 >= 0 && var3 >= 0) {
            class190.field2977[class4.field60] = var3;
            class4.field60 = class4.field60 + 1 & 0x7F;
            if (class4.field60 == class260.field4008) {
                class4.field60 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class90.field1309 + 1 & 0x7F;
            if (class284.field4434 != var4) {
                class90.field1298[class90.field1309] = var3;
                class293.field4529[class90.field1309] = '\u0000';
                class90.field1309 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!oj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 469)
    public final void focusGained(FocusEvent arg0) {
        field2720++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)Leh;", line = 476)
    public static final class158 method1277(int arg0, int arg1, int arg2) {
        class79 var3 = class213.field3262[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1175;
    }

    @OriginalMember(owner = "client!oj", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 488)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class121.field1857 != null) {
            class28.field321 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class319.field4932.length) {
                var3 = class319.field4932[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class4.field60 >= 0 && var3 >= 0) {
                class190.field2977[class4.field60] = ~var3;
                class4.field60 = class4.field60 + 1 & 0x7F;
                if (class4.field60 == class260.field4008) {
                    class4.field60 = -1;
                }
            }
        }
        field2729++;
        arg0.consume();
    }
}
