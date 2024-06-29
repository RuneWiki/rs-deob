import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class119 {

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field2805 = 0;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field2806 = 0;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "Lkc;")
    public static class67 field2809 = class19.method144("Hidden)2", 127);

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field2811 = 0;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "Lkc;")
    public static class67 field2813 = class19.method144("(Udns", 82);

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "Lkc;")
    public static class67 field2815 = class19.method144("bevor Sie den Vorgang wiederholen)3", 124);

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2808 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "[Z")
    public static boolean[] field2816 = new boolean[5];

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "[Lkc;")
    public static class67[] field2819 = new class67[100];

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "Lkc;")
    private static class67 field2817 = class19.method144("No reply from loginserver)3", 116);

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "Lkc;")
    public static class67 field2821 = class19.method144("Offline", 68);

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "[I")
    public static int[] field2820 = new int[2048];

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "Lkc;")
    public static class67 field2818 = field2817;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public int field2802;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public int field2812;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "Ljava/awt/Image;")
    public Image field2814;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "[I")
    public int[] field2807;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIILad;Lsa;II)V", line = 3)
    public static final void method937(int arg0, int arg1, int arg2, int arg3, int arg4, class5 arg5, class113 arg6, int arg7, int arg8) {
        field2799++;
        if (class45.field1105 && (class21.field443[0][arg7][arg1] & 0x2) == 0) {
            if ((class21.field443[arg8][arg7][arg1] & 0x10) != 0) {
                return;
            }
            if (class101.method777(-107, arg1, arg8, arg7) != class19.field364) {
                return;
            }
        }
        if (class67.field1618 > arg8) {
            class67.field1618 = arg8;
        }
        int var9 = class34.field823[arg8][arg7][arg1];
        int var10 = class34.field823[arg8][arg7 + 1][arg1];
        int var11 = class34.field823[arg8][arg7 + 1][arg1 + 1];
        int var12 = class34.field823[arg8][arg7][arg1 + 1];
        class106 var13 = class2.method12(arg4, arg3 ^ 0x7867);
        int var14 = var11 + var12 + var10 + var9 >> 2;
        int var15 = (arg2 << 6) + arg0;
        if (var13.field2408 == 1) {
            var15 += 256;
        }
        int var16 = (arg1 << 7) + (arg4 << 14) + arg7 + 1073741824;
        if (var13.field2389 == 0) {
            var16 += Integer.MIN_VALUE;
        }
        if (var13.method810((byte) 111)) {
            class19.method146(arg7, -112, arg1, arg2, var13, arg8);
        }
        if (arg0 == 22) {
            if (!class45.field1105 || var13.field2389 != 0 || var13.field2384) {
                class24 var17;
                if (var13.field2385 == -1 && var13.field2433 == null) {
                    var17 = var13.method813(true, var11, arg2, var10, var9, 22, var12);
                } else {
                    var17 = new class134(arg4, 22, arg2, var9, var10, var11, var12, var13.field2385, true, null);
                }
                arg6.method875(arg8, arg7, arg1, var14, var17, var16, var15);
                if (var13.field2390 && var13.field2389 == 1 && arg5 != null) {
                    arg5.method61(arg7, arg1, (byte) -128);
                }
            }
        } else if (arg0 == 10 || arg0 == 11) {
            class24 var37;
            if (var13.field2385 == -1 && var13.field2433 == null) {
                var37 = var13.method813(true, var11, arg2, var10, var9, 10, var12);
            } else {
                var37 = new class134(arg4, 10, arg2, var9, var10, var11, var12, var13.field2385, true, null);
            }
            if (var37 != null) {
                int var38;
                int var39;
                if (arg2 == 1 || arg2 == 3) {
                    var39 = var13.field2432;
                    var38 = var13.field2369;
                } else {
                    var38 = var13.field2432;
                    var39 = var13.field2369;
                }
                int var40 = 0;
                if (arg0 == 11) {
                    var40 += 256;
                }
                if (arg6.method900(arg8, arg7, arg1, var14, var38, var39, var37, var40, var16, var15) && var13.field2411) {
                    class39 var41;
                    if (var37 instanceof class39) {
                        var41 = (class39) var37;
                    } else {
                        var41 = var13.method813(true, var11, arg2, var10, var9, 10, var12);
                    }
                    if (var41 != null) {
                        for (int var42 = 0; var42 <= var38; var42++) {
                            for (int var43 = 0; var43 <= var39; var43++) {
                                int var44 = var41.method319() / 4;
                                if (var44 > 30) {
                                    var44 = 30;
                                }
                                if (var44 > class45.field1095[arg8][arg7 + var42][arg1 + var43]) {
                                    class45.field1095[arg8][arg7 + var42][arg1 + var43] = (byte) var44;
                                }
                            }
                        }
                    }
                }
            }
            if (var13.field2390 && arg5 != null) {
                arg5.method60(var13.field2369, (byte) -33, arg2, var13.field2429, var13.field2432, arg7, arg1);
            }
        } else if (arg0 >= 12) {
            class24 var18;
            if (var13.field2385 == -1 && var13.field2433 == null) {
                var18 = var13.method813(true, var11, arg2, var10, var9, arg0, var12);
            } else {
                var18 = new class134(arg4, arg0, arg2, var9, var10, var11, var12, var13.field2385, true, null);
            }
            arg6.method900(arg8, arg7, arg1, var14, 1, 1, var18, 0, var16, var15);
            if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg8 > 0) {
                class25.field532[arg8][arg7][arg1] = class65.method505(class25.field532[arg8][arg7][arg1], 2340);
            }
            if (var13.field2390 && arg5 != null) {
                arg5.method60(var13.field2369, (byte) -43, arg2, var13.field2429, var13.field2432, arg7, arg1);
            }
        } else if (arg0 == 0) {
            class24 var19;
            if (var13.field2385 == -1 && var13.field2433 == null) {
                var19 = var13.method813(true, var11, arg2, var10, var9, 0, var12);
            } else {
                var19 = new class134(arg4, 0, arg2, var9, var10, var11, var12, var13.field2385, true, null);
            }
            arg6.method861(arg8, arg7, arg1, var14, var19, null, class106.field2372[arg2], 0, var16, var15);
            if (arg2 == 0) {
                if (var13.field2411) {
                    class45.field1095[arg8][arg7][arg1] = 50;
                    class45.field1095[arg8][arg7][arg1 + 1] = 50;
                }
                if (var13.field2402) {
                    class25.field532[arg8][arg7][arg1] = class65.method505(class25.field532[arg8][arg7][arg1], 585);
                }
            } else if (arg2 == 1) {
                if (var13.field2411) {
                    class45.field1095[arg8][arg7][arg1 + 1] = 50;
                    class45.field1095[arg8][arg7 + 1][arg1 + 1] = 50;
                }
                if (var13.field2402) {
                    class25.field532[arg8][arg7][arg1 + 1] = class65.method505(class25.field532[arg8][arg7][arg1 + 1], 1170);
                }
            } else if (arg2 == 2) {
                if (var13.field2411) {
                    class45.field1095[arg8][arg7 + 1][arg1] = 50;
                    class45.field1095[arg8][arg7 + 1][arg1 + 1] = 50;
                }
                if (var13.field2402) {
                    class25.field532[arg8][arg7 + 1][arg1] = class65.method505(class25.field532[arg8][arg7 + 1][arg1], 585);
                }
            } else if (arg2 == 3) {
                if (var13.field2411) {
                    class45.field1095[arg8][arg7][arg1] = 50;
                    class45.field1095[arg8][arg7 + 1][arg1] = 50;
                }
                if (var13.field2402) {
                    class25.field532[arg8][arg7][arg1] = class65.method505(class25.field532[arg8][arg7][arg1], 1170);
                }
            }
            if (var13.field2390 && arg5 != null) {
                arg5.method50(var13.field2429, 76, arg7, arg0, arg1, arg2);
            }
            if (var13.field2387 != 16) {
                arg6.method892(arg8, arg7, arg1, var13.field2387);
            }
        } else if (arg0 == 1) {
            class24 var20;
            if (var13.field2385 == -1 && var13.field2433 == null) {
                var20 = var13.method813(true, var11, arg2, var10, var9, 1, var12);
            } else {
                var20 = new class134(arg4, 1, arg2, var9, var10, var11, var12, var13.field2385, true, null);
            }
            arg6.method861(arg8, arg7, arg1, var14, var20, null, class117.field2783[arg2], 0, var16, var15);
            if (var13.field2411) {
                if (arg2 == 0) {
                    class45.field1095[arg8][arg7][arg1 + 1] = 50;
                } else if (arg2 == 1) {
                    class45.field1095[arg8][arg7 + 1][arg1 + 1] = 50;
                } else if (arg2 == 2) {
                    class45.field1095[arg8][arg7 + 1][arg1] = 50;
                } else if (arg2 == 3) {
                    class45.field1095[arg8][arg7][arg1] = 50;
                }
            }
            if (var13.field2390 && arg5 != null) {
                arg5.method50(var13.field2429, 109, arg7, arg0, arg1, arg2);
            }
        } else if (arg0 == 2) {
            int var21 = arg2 + 1 & 0x3;
            class24 var22;
            class24 var23;
            if (var13.field2385 == -1 && var13.field2433 == null) {
                var22 = var13.method813(true, var11, arg2 + 4, var10, var9, 2, var12);
                var23 = var13.method813(true, var11, var21, var10, var9, 2, var12);
            } else {
                var22 = new class134(arg4, 2, arg2 + 4, var9, var10, var11, var12, var13.field2385, true, null);
                var23 = new class134(arg4, 2, var21, var9, var10, var11, var12, var13.field2385, true, null);
            }
            arg6.method861(arg8, arg7, arg1, var14, var22, var23, class106.field2372[arg2], class106.field2372[var21], var16, var15);
            if (var13.field2402) {
                if (arg2 == 0) {
                    class25.field532[arg8][arg7][arg1] = class65.method505(class25.field532[arg8][arg7][arg1], 585);
                    class25.field532[arg8][arg7][arg1 + 1] = class65.method505(class25.field532[arg8][arg7][arg1 + 1], 1170);
                } else if (arg2 == 1) {
                    class25.field532[arg8][arg7][arg1 + 1] = class65.method505(class25.field532[arg8][arg7][arg1 + 1], 1170);
                    class25.field532[arg8][arg7 + 1][arg1] = class65.method505(class25.field532[arg8][arg7 + 1][arg1], 585);
                } else if (arg2 == 2) {
                    class25.field532[arg8][arg7 + 1][arg1] = class65.method505(class25.field532[arg8][arg7 + 1][arg1], 585);
                    class25.field532[arg8][arg7][arg1] = class65.method505(class25.field532[arg8][arg7][arg1], 1170);
                } else if (arg2 == 3) {
                    class25.field532[arg8][arg7][arg1] = class65.method505(class25.field532[arg8][arg7][arg1], 1170);
                    class25.field532[arg8][arg7][arg1] = class65.method505(class25.field532[arg8][arg7][arg1], 585);
                }
            }
            if (var13.field2390 && arg5 != null) {
                arg5.method50(var13.field2429, 31, arg7, arg0, arg1, arg2);
            }
            if (var13.field2387 != 16) {
                arg6.method892(arg8, arg7, arg1, var13.field2387);
            }
        } else {
            if (arg3 != 11539) {
                field2809 = null;
            }
            if (arg0 == 3) {
                class24 var24;
                if (var13.field2385 == -1 && var13.field2433 == null) {
                    var24 = var13.method813(true, var11, arg2, var10, var9, 3, var12);
                } else {
                    var24 = new class134(arg4, 3, arg2, var9, var10, var11, var12, var13.field2385, true, null);
                }
                arg6.method861(arg8, arg7, arg1, var14, var24, null, class117.field2783[arg2], 0, var16, var15);
                if (var13.field2411) {
                    if (arg2 == 0) {
                        class45.field1095[arg8][arg7][arg1 + 1] = 50;
                    } else if (arg2 == 1) {
                        class45.field1095[arg8][arg7 + 1][arg1 + 1] = 50;
                    } else if (arg2 == 2) {
                        class45.field1095[arg8][arg7 + 1][arg1] = 50;
                    } else if (arg2 == 3) {
                        class45.field1095[arg8][arg7][arg1] = 50;
                    }
                }
                if (var13.field2390 && arg5 != null) {
                    arg5.method50(var13.field2429, 92, arg7, arg0, arg1, arg2);
                }
            } else if (arg0 == 9) {
                class24 var25;
                if (var13.field2385 == -1 && var13.field2433 == null) {
                    var25 = var13.method813(true, var11, arg2, var10, var9, arg0, var12);
                } else {
                    var25 = new class134(arg4, arg0, arg2, var9, var10, var11, var12, var13.field2385, true, null);
                }
                arg6.method900(arg8, arg7, arg1, var14, 1, 1, var25, 0, var16, var15);
                if (var13.field2390 && arg5 != null) {
                    arg5.method60(var13.field2369, (byte) -44, arg2, var13.field2429, var13.field2432, arg7, arg1);
                }
            } else {
                if (var13.field2424) {
                    if (arg2 == 1) {
                        int var26 = var12;
                        var12 = var11;
                        var11 = var10;
                        var10 = var9;
                        var9 = var26;
                    } else if (arg2 == 2) {
                        int var28 = var12;
                        var12 = var10;
                        var10 = var28;
                        int var29 = var11;
                        var11 = var9;
                        var9 = var29;
                    } else if (arg2 == 3) {
                        int var27 = var12;
                        var12 = var9;
                        var9 = var10;
                        var10 = var11;
                        var11 = var27;
                    }
                }
                if (arg0 == 4) {
                    class24 var30;
                    if (var13.field2385 == -1 && var13.field2433 == null) {
                        var30 = var13.method813(true, var11, 0, var10, var9, 4, var12);
                    } else {
                        var30 = new class134(arg4, 4, 0, var9, var10, var11, var12, var13.field2385, true, null);
                    }
                    arg6.method870(arg8, arg7, arg1, var14, var30, class106.field2372[arg2], arg2 * 512, 0, 0, var16, var15);
                } else if (arg0 == 5) {
                    int var31 = arg6.method879(arg8, arg7, arg1);
                    int var32 = 16;
                    if (var31 > 0) {
                        var32 = class2.method12(var31 >> 14 & 0x7FFF, 21876).field2387;
                    }
                    class24 var33;
                    if (var13.field2385 == -1 && var13.field2433 == null) {
                        var33 = var13.method813(true, var11, 0, var10, var9, 4, var12);
                    } else {
                        var33 = new class134(arg4, 4, 0, var9, var10, var11, var12, var13.field2385, true, null);
                    }
                    arg6.method870(arg8, arg7, arg1, var14, var33, class106.field2372[arg2], arg2 * 512, class48.field1162[arg2] * var32, class112.field2559[arg2] * var32, var16, var15);
                } else if (arg0 == 6) {
                    class24 var34;
                    if (var13.field2385 == -1 && var13.field2433 == null) {
                        var34 = var13.method813(true, var11, 0, var10, var9, 4, var12);
                    } else {
                        var34 = new class134(arg4, 4, 0, var9, var10, var11, var12, var13.field2385, true, null);
                    }
                    arg6.method870(arg8, arg7, arg1, var14, var34, 256, arg2, 0, 0, var16, var15);
                } else if (arg0 == 7) {
                    class24 var35;
                    if (var13.field2385 == -1 && var13.field2433 == null) {
                        var35 = var13.method813(true, var11, 0, var10, var9, 4, var12);
                    } else {
                        var35 = new class134(arg4, 4, 0, var9, var10, var11, var12, var13.field2385, true, null);
                    }
                    arg6.method870(arg8, arg7, arg1, var14, var35, 512, arg2, 0, 0, var16, var15);
                } else if (arg0 == 8) {
                    class24 var36;
                    if (var13.field2385 == -1 && var13.field2433 == null) {
                        var36 = var13.method813(true, var11, 0, var10, var9, 4, var12);
                    } else {
                        var36 = new class134(arg4, 4, 0, var9, var10, var11, var12, var13.field2385, true, null);
                    }
                    arg6.method870(arg8, arg7, arg1, var14, var36, 768, arg2, 0, 0, var16, var15);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 521)
    public static final void method938(byte arg0, Component arg1) {
        field2804++;
        arg1.removeMouseListener(class66.field1543);
        arg1.removeMouseMotionListener(class66.field1543);
        arg1.removeFocusListener(class66.field1543);
        if (arg0 != 27) {
            method941((byte) 69);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V", line = 543)
    public final void method939(byte arg0) {
        if (arg0 == -53) {
            field2800++;
            class68.method563(this.field2807, this.field2812, this.field2802);
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V", line = 559)
    public static final void method940(byte arg0) {
        field2801++;
        class32.field683 = null;
        if (arg0 <= 50) {
            field2821 = null;
        }
        class19.field379 = null;
        class121.field2845 = null;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(B)V", line = 585)
    public static void method941(byte arg0) {
        field2817 = null;
        field2815 = null;
        if (arg0 != 19) {
            return;
        }
        field2809 = null;
        field2813 = null;
        field2819 = null;
        field2818 = null;
        field2820 = null;
        field2821 = null;
        field2816 = null;
        field2808 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)Lme;", line = 611)
    public static final class81 method942(int arg0, byte arg1) {
        field2803++;
        class81 var2 = (class81) class30.field625.method373((byte) 127, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 <= 63) {
            field2813 = null;
        }
        byte[] var3 = class69.field1643.method27(arg0, true, 13);
        class81 var4 = new class81();
        var4.field1944 = arg0;
        if (var3 != null) {
            var4.method641(0, new class140(var3));
        }
        class30.field625.method374(0, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V", line = 639)
    protected class119() {
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method162(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
    public abstract void method159(Component arg0, int arg1, boolean arg2, int arg3);
}
