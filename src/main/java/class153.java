import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class153 extends class70 {

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "I")
    public int field2620;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public int field2604;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
    public int field2616;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    private int field2605;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public int field2606;

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "I")
    private int field2622;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    private int field2610;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    private int field2609;

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "I")
    private int field2623;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    private int field2603;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "Z")
    public static boolean field2612 = false;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "[[B")
    public static byte[][] field2614 = new byte[1000][];

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "I")
    public static int field2624 = -1;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "Lsm;")
    public static class178 field2617;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lla;Ljava/awt/Component;III)Lem;", line = 10)
    public static final class14 method1088(class157 arg0, Component arg1, int arg2, int arg3, int arg4) {
        field2602++;
        if (arg2 != -6764) {
            field2614 = (byte[][]) ((byte[][]) null);
        }
        if (class194.field3261 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class14 var5 = (class14) Class.forName("ik").getDeclaredConstructor().newInstance();
                var5.field427 = arg3;
                var5.field413 = new int[(class277.field4510 ? 2 : 1) * 256];
                var5.method144(arg1);
                var5.field435 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field435 > 16384) {
                    var5.field435 = 16384;
                }
                var5.method138(var5.field435);
                if (class143.field2403 > 0 && field2617 == null) {
                    field2617 = new class178();
                    field2617.field2949 = arg0;
                    arg0.method1132(class143.field2403, arg2 ^ 0xFFFFE594, field2617);
                }
                if (field2617 != null) {
                    if (field2617.field2942[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    field2617.field2942[arg4] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class329 var7 = new class329(arg0, arg4);
                    var7.field413 = new int[(class277.field4510 ? 2 : 1) * 256];
                    var7.field427 = arg3;
                    var7.method144(arg1);
                    var7.field435 = 16384;
                    var7.method138(var7.field435);
                    if (class143.field2403 > 0 && field2617 == null) {
                        field2617 = new class178();
                        field2617.field2949 = arg0;
                        arg0.method1132(class143.field2403, 0, field2617);
                    }
                    if (field2617 != null) {
                        if (field2617.field2942[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        field2617.field2942[arg4] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class14();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)Z", line = 97)
    public static final boolean method1089(int arg0) {
        if (arg0 != 0) {
            field2612 = true;
        }
        field2613++;
        if (class216.field3604) {
            try {
                class186.method1305(class59.field1164.field2658, false, "showVideoAd");
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II[II)V", line = 120)
    public final void method1090(int arg0, int arg1, int[] arg2, int arg3) {
        arg2[0] = this.field2603;
        field2615++;
        if (arg1 >= -37) {
            this.field2605 = -60;
        }
        arg2[2] = this.field2609 + arg0 - this.field2606;
        arg2[1] = arg3 - (this.field2604 - this.field2623);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)Z", line = 135)
    public final boolean method1091(int arg0, int arg1, int arg2) {
        if (arg1 != -1716) {
            method1093(4, -54, 36);
        }
        field2611++;
        return arg0 >= this.field2623 && this.field2622 >= arg0 && this.field2609 <= arg2 && this.field2610 >= arg2;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZIIILrm;I)V", line = 151)
    public static final void method1092(int arg0, boolean arg1, int arg2, int arg3, int arg4, class273 arg5, int arg6) {
        field2608++;
        long var7 = 0L;
        boolean var9 = true;
        if (arg2 == 0) {
            var7 = class272.method1923(arg0, arg3, arg6);
        } else if (arg2 == 1) {
            var7 = class23.method202(arg0, arg3, arg6);
        } else if (arg2 == 2) {
            var7 = class177.method1256(arg0, arg3, arg6);
        } else if (arg2 == 3) {
            var7 = class146.method1000(arg0, arg3, arg6);
        }
        int var10 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        boolean var11 = false;
        int var12 = (int) var7 >> 20 & 0x3;
        boolean var13 = false;
        int var14 = ((int) var7 & 0x7D5B2) >> 14;
        if (arg1) {
            return;
        }
        class238 var15 = class1.method7(var10, 25);
        if (var15.method1663(0)) {
            class292.method2076(arg3, arg6, arg0, var15, (byte) 27);
        }
        if (var7 == 0L) {
            return;
        }
        class152 var16 = null;
        class152 var17 = null;
        if (arg2 == 0) {
            class16 var18 = class299.method2137(arg0, arg3, arg6);
            if (var18 != null) {
                var16 = var18.field473;
                var17 = var18.field465;
            }
            if (var15.field3930 != 0) {
                arg5.method1928(arg6, var14, true, var15.field3940, var12, !var15.field3946, arg3);
            }
        } else if (arg2 == 1) {
            class332 var19 = class52.method456(arg0, arg3, arg6);
            if (var19 != null) {
                var17 = var19.field5305;
                var16 = var19.field5307;
            }
        } else if (arg2 == 2) {
            class278 var21 = class143.method981(arg0, arg3, arg6);
            if (var21 != null) {
                var16 = var21.field4529;
            }
            if (var15.field3930 != 0 && arg3 + var15.field3935 < 104 && (var15.field3935 + arg6) < 104 && (var15.field3890 + arg3) < 104 && (var15.field3890 + arg6) < 104) {
                arg5.method1932(var15.field3890, true, arg6, arg3, var15.field3940, !var15.field3946, var15.field3935, var12);
            }
        } else if (arg2 == 3) {
            class94 var20 = class242.method1723(arg0, arg3, arg6);
            if (var20 != null) {
                var16 = var20.field1653;
            }
            if (var15.field3930 == 1) {
                arg5.method1946(arg6, arg3, 29419);
            }
        }
        if (var15.field3937 != null) {
            var15 = var15.method1651(-123);
        }
        if (!class241.field4016 || var15 == null || !var15.field3956) {
            return;
        }
        if (var14 == 2) {
            if ((var16 instanceof class86)) {
                ((class86) var16).method661(true);
            } else {
                class86.method660(var15, arg4, arg6, 0, -8594, arg3, 0, var12 + 4, var14);
            }
            if (var17 instanceof class86) {
                ((class86) var17).method661(true);
            } else {
                class86.method660(var15, arg4, arg6, 0, -8594, arg3, 0, var12 + 1 & 0x3, var14);
            }
        } else if (var14 == 5) {
            if ((var16 instanceof class86)) {
                ((class86) var16).method661(true);
            } else {
                class86.method660(var15, arg4, arg6, class109.field2005[var12] * 8, -8594, arg3, class188.field3187[var12] * 8, var12, 4);
            }
        } else if (var14 == 6) {
            if (var16 instanceof class86) {
                ((class86) var16).method661(true);
            } else {
                class86.method660(var15, arg4, arg6, class353.field5639[var12] * 8, -8594, arg3, class98.field1808[var12] * 8, var12 + 4, 4);
            }
        } else if (var14 == 7) {
            if (var16 instanceof class86) {
                ((class86) var16).method661(true);
            } else {
                class86.method660(var15, arg4, arg6, 0, -8594, arg3, 0, (var12 + 2 & 0x3) + 4, 4);
            }
        } else if (var14 == 8) {
            if ((var16 instanceof class86)) {
                ((class86) var16).method661(true);
            } else {
                class86.method660(var15, arg4, arg6, class353.field5639[var12] * 8, -8594, arg3, class98.field1808[var12] * 8, var12 + 4, 4);
            }
            if (var17 instanceof class86) {
                ((class86) var17).method661(true);
            } else {
                class86.method660(var15, arg4, arg6, class353.field5639[var12] * 8, -8594, arg3, class98.field1808[var12] * 8, (var12 + 2 & 0x3) + 4, 4);
            }
        } else if (var14 == 11) {
            if (var16 instanceof class86) {
                ((class86) var16).method661(true);
            } else {
                class86.method660(var15, arg4, arg6, 0, -8594, arg3, 0, var12 + 4, 10);
            }
        } else if (var16 instanceof class86) {
            ((class86) var16).method661(true);
        } else {
            class86.method660(var15, arg4, arg6, 0, -8594, arg3, 0, var12, var14);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)Z", line = 346)
    public static final boolean method1093(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class238.field3952; var3++) {
            class308 var4 = class233.field3811[var3];
            if (var4.field5031 == 1) {
                int var5 = var4.field5033 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field5040 * var5 >> 8) + var4.field5029;
                    int var7 = (var4.field5036 * var5 >> 8) + var4.field5037;
                    int var8 = (var4.field5022 * var5 >> 8) + var4.field5030;
                    int var9 = (var4.field5038 * var5 >> 8) + var4.field5039;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field5031 == 2) {
                int var10 = arg0 - var4.field5033;
                if (var10 > 0) {
                    int var11 = (var4.field5040 * var10 >> 8) + var4.field5029;
                    int var12 = (var4.field5036 * var10 >> 8) + var4.field5037;
                    int var13 = (var4.field5022 * var10 >> 8) + var4.field5030;
                    int var14 = (var4.field5038 * var10 >> 8) + var4.field5039;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field5031 == 3) {
                int var15 = var4.field5029 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field5028 * var15 >> 8) + var4.field5033;
                    int var17 = (var4.field5019 * var15 >> 8) + var4.field5025;
                    int var18 = (var4.field5022 * var15 >> 8) + var4.field5030;
                    int var19 = (var4.field5038 * var15 >> 8) + var4.field5039;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field5031 == 4) {
                int var20 = arg2 - var4.field5029;
                if (var20 > 0) {
                    int var21 = (var4.field5028 * var20 >> 8) + var4.field5033;
                    int var22 = (var4.field5019 * var20 >> 8) + var4.field5025;
                    int var23 = (var4.field5022 * var20 >> 8) + var4.field5030;
                    int var24 = (var4.field5038 * var20 >> 8) + var4.field5039;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field5031 == 5) {
                int var25 = arg1 - var4.field5030;
                if (var25 > 0) {
                    int var26 = (var4.field5028 * var25 >> 8) + var4.field5033;
                    int var27 = (var4.field5019 * var25 >> 8) + var4.field5025;
                    int var28 = (var4.field5040 * var25 >> 8) + var4.field5029;
                    int var29 = (var4.field5036 * var25 >> 8) + var4.field5037;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V", line = 470)
    public static void method1094(int arg0) {
        field2617 = null;
        field2614 = (byte[][]) null;
        if (arg0 != 1) {
            field2614 = (byte[][]) ((byte[][]) null);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)V", line = 490)
    public static final void method1095(int arg0, int arg1, int arg2, int arg3) {
        field2621++;
        class199 var4 = class173.method1231(false, 11, arg3);
        var4.method1367((byte) -83);
        var4.field3343 = arg1;
        if (arg0 < 9) {
            method1092(-46, false, 92, 77, 13, (class273) null, -91);
        }
        var4.field3338 = arg2;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBII)Z", line = 511)
    public final boolean method1096(int arg0, byte arg1, int arg2, int arg3) {
        field2618++;
        if (arg1 != -73) {
            field2612 = false;
        }
        return this.field2603 == arg2 && this.field2623 <= arg0 && this.field2622 >= arg0 && this.field2609 <= arg3 && arg3 <= this.field2610;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIB)Z", line = 528)
    public final boolean method1097(int arg0, int arg1, byte arg2) {
        field2619++;
        if (arg2 != 11) {
            this.field2622 = -25;
        }
        return this.field2604 <= arg1 && this.field2616 >= arg1 && arg0 >= this.field2606 && this.field2620 >= arg0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BII[I)V", line = 545)
    public final void method1098(byte arg0, int arg1, int arg2, int[] arg3) {
        if (arg0 != -62) {
            method1094(-65);
        }
        arg3[1] = arg1 + this.field2604 - this.field2623;
        arg3[2] = arg2 - (this.field2609 - this.field2606);
        field2607++;
        arg3[0] = this.field2605;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 560)
    public class153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2620 = arg9;
        this.field2604 = arg6;
        this.field2616 = arg8;
        this.field2605 = arg1;
        this.field2606 = arg7;
        this.field2622 = arg4;
        this.field2610 = arg5;
        this.field2609 = arg3;
        this.field2623 = arg2;
        this.field2603 = arg0;
    }
}
