import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class205 {

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public int field3306 = -1;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public int field3314 = 2;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public int field3320 = -1;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public int field3310 = -1;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public int field3319 = -1;

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "Z")
    public boolean field3329 = false;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "Z")
    private boolean field3328 = false;

    @OriginalMember(owner = "client!rk", name = "D", descriptor = "I")
    public int field3333 = -1;

    @OriginalMember(owner = "client!rk", name = "C", descriptor = "I")
    public int field3332 = 99;

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
    public int field3326 = 5;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field3304 = -1;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field3315 = 0;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "J")
    public static long field3324;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "[I")
    private int[] field3322;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "[I")
    public int[] field3323;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "[I")
    private int[] field3327;

    @OriginalMember(owner = "client!rk", name = "B", descriptor = "[I")
    public int[] field3331;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "[[I")
    public int[][] field3313;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "[[[Lnh;")
    public static class308[][][] field3312;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BILlb;)V", line = 12)
    private final void method1447(byte arg0, int arg1, class112 arg2) {
        field3325++;
        if (arg1 == 1) {
            int var4 = arg2.method759((byte) -92);
            this.field3331 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3331[var5] = arg2.method759((byte) -85);
            }
            this.field3323 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3323[var6] = arg2.method759((byte) -53);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3323[var7] += arg2.method759((byte) -125) << 16;
            }
        } else if (arg1 == 2) {
            this.field3306 = arg2.method759((byte) -117);
        } else if (arg1 == 3) {
            int var15 = arg2.method792(2);
            this.field3327 = new int[var15 + 1];
            for (int var16 = 0; var16 < var15; var16++) {
                this.field3327[var16] = arg2.method792(2);
            }
            this.field3327[var15] = 9999999;
        } else if (arg1 == 4) {
            this.field3329 = true;
        } else if (arg1 == 5) {
            this.field3326 = arg2.method792(2);
        } else if (arg1 == 6) {
            this.field3333 = arg2.method759((byte) -98);
        } else if (arg1 == 7) {
            this.field3319 = arg2.method759((byte) -36);
        } else if (arg1 == 8) {
            this.field3332 = arg2.method792(2);
        } else if (arg1 == 9) {
            this.field3310 = arg2.method792(2);
        } else if (arg1 == 10) {
            this.field3320 = arg2.method792(2);
        } else if (arg1 == 11) {
            this.field3314 = arg2.method792(2);
        } else if (arg1 == 12) {
            int var8 = arg2.method792(2);
            this.field3322 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3322[var9] = arg2.method759((byte) -60);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field3322[var10] = (arg2.method759((byte) -83) << 16) + this.field3322[var10];
            }
        } else if (arg1 == 13) {
            int var11 = arg2.method759((byte) -109);
            this.field3313 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg2.method792(2);
                if (var13 > 0) {
                    this.field3313[var12] = new int[var13];
                    this.field3313[var12][0] = arg2.method757(11997);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field3313[var12][var14] = arg2.method759((byte) -89);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field3328 = true;
        }
        if (arg0 <= 117) {
            this.method1448(56, (class112) null);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILlb;)V", line = 163)
    public final void method1448(int arg0, class112 arg1) {
        field3330++;
        while (true) {
            int var3 = arg1.method792(2);
            if (var3 == 0) {
                if (arg0 != 65535) {
                    this.method1453(5);
                }
                return;
            }
            this.method1447((byte) 127, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljc;II)Ljc;", line = 193)
    public final class287 method1449(class287 arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            field3312 = (class308[][][]) ((class308[][][]) null);
        }
        int var4 = this.field3323[arg1];
        field3309++;
        class57 var5 = class271.method1915(var4 >> 16, arg2 - 3);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method113(true, true);
        } else {
            class287 var7 = arg0.method113(!var5.method396(var6, arg2 ^ 0xFFFFFFEF), !this.field3328);
            var7.method116(var5, var6, this.field3328);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILjc;I)Ljc;", line = 215)
    public final class287 method1450(int arg0, int arg1, class287 arg2, int arg3) {
        int var5 = this.field3323[arg0];
        field3311++;
        class57 var6 = class271.method1915(var5 >> 16, 0);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method108(true, true);
        } else if (arg3 >= -78) {
            return (class287) null;
        } else {
            int var8 = arg1 & 0x3;
            class287 var9 = arg2.method108(!var6.method396(var7, -100), !this.field3328);
            if (var8 == 1) {
                var9.method115();
            } else if (var8 == 2) {
                var9.method95();
            } else if (var8 == 3) {
                var9.method104();
            }
            var9.method116(var6, var7, this.field3328);
            if (var8 == 1) {
                var9.method104();
            } else if (var8 == 2) {
                var9.method95();
            } else if (var8 == 3) {
                var9.method115();
            }
            return var9;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBLmh;I)[Laf;", line = 277)
    public static final class72[] method1451(int arg0, byte arg1, class65 arg2, int arg3) {
        field3308++;
        if (class10.method40(arg0, true, arg3, arg2)) {
            if (arg1 >= -2) {
                method1455(26);
            }
            return class67.method488(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILjc;I)Ljc;", line = 292)
    public final class287 method1452(int arg0, class287 arg1, int arg2) {
        field3305++;
        int var4 = this.field3323[arg0];
        class57 var5 = class271.method1915(var4 >> 16, arg2 - 9);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method108(true, true);
        } else if (arg2 == 9) {
            class57 var7 = null;
            int var8 = 0;
            if (this.field3322 != null && this.field3322.length > arg0) {
                int var9 = this.field3322[arg0];
                var7 = class271.method1915(var9 >> 16, 0);
                var8 = var9 & 0xFFFF;
            }
            if (var7 == null || var8 == 65535) {
                class287 var11 = arg1.method108(!var5.method396(var6, -48), !this.field3328);
                var11.method116(var5, var6, this.field3328);
                return var11;
            } else {
                class287 var10 = arg1.method108(!var5.method396(var6, -19) & !var7.method396(var8, -72), !this.field3328);
                var10.method116(var5, var6, this.field3328);
                var10.method116(var7, var8, this.field3328);
                return var10;
            }
        } else {
            return (class287) null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 345)
    public final void method1453(int arg0) {
        field3307++;
        if (this.field3310 == -1) {
            if (this.field3327 == null) {
                this.field3310 = 0;
            } else {
                this.field3310 = 2;
            }
        }
        if (arg0 < 120 || this.field3320 != -1) {
            return;
        }
        if (this.field3327 == null) {
            this.field3320 = 0;
        } else {
            this.field3320 = 2;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILrk;IILjc;)Ljc;", line = 374)
    public final class287 method1454(int arg0, class205 arg1, int arg2, int arg3, class287 arg4) {
        int var6 = this.field3323[arg3];
        field3316++;
        class57 var7 = class271.method1915(var6 >> 16, 0);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg1.method1456(arg2, 0, arg4);
        }
        int var9 = arg1.field3323[arg2];
        class57 var10 = class271.method1915(var9 >> 16, arg0);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class287 var13 = arg4.method108(!var7.method396(var8, -102), !this.field3328);
            var13.method116(var7, var8, this.field3328);
            return var13;
        } else {
            class287 var12 = arg4.method108(!var7.method396(var8, -68) & !var10.method396(var11, arg0 - 22), !this.field3328 & !arg1.field3328);
            var12.method127(var7, var8, var10, var11, this.field3327, arg1.field3328 | this.field3328);
            return var12;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V", line = 407)
    public static void method1455(int arg0) {
        field3312 = (class308[][][]) null;
        if (arg0 != 22255088) {
            field3324 = 89L;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILjc;)Ljc;", line = 432)
    public final class287 method1456(int arg0, int arg1, class287 arg2) {
        field3321++;
        int var4 = this.field3323[arg0];
        class57 var5 = class271.method1915(var4 >> 16, arg1 + arg1);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method108(true, true);
        } else {
            class287 var7 = arg2.method108(!var5.method396(var6, -92), !this.field3328);
            var7.method116(var5, var6, this.field3328);
            return var7;
        }
    }
}
