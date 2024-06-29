import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class11 {

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "[I")
    private int[] field229;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "[I")
    private int[] field235;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "Ljl;")
    private class242 field233;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "Ljl;")
    private class242 field232;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "[Ljl;")
    private class242[] field231;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "[I")
    public static int[] field230 = new int[5];

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "Lp;")
    public static class280 field236 = class18.method140((byte) -123, "<col=00ffff>");

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "[Lp;")
    public static class280[] field237 = new class280[100];

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field240 = -1;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Lp;")
    public static class280 field239 = class18.method140((byte) -117, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lg;Ltg;I)Z")
    public final boolean method103(class272 arg0, class180 arg1, int arg2) {
        field228++;
        if (class19.field363 <= arg2) {
            for (int var4 = 0; var4 < this.field229.length; var4++) {
                if (!arg1.method1262(this.field229[var4], (byte) 93)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field229.length; var5++) {
                if (!arg1.method1248((byte) 107, this.field229[var5], class19.field363)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field235.length; var6++) {
            if (!arg0.method1437(5, this.field235[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static void method104(byte arg0) {
        field239 = null;
        field230 = null;
        field237 = null;
        if (arg0 != -9) {
            method106((class25) null, 64);
        }
        field236 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)Lsc;")
    public static final class245 method105(int arg0, int arg1, int arg2) {
        class162 var3 = class220.field3787[arg0][arg1][arg2];
        return var3 == null || var3.field2839 == null ? null : var3.field2839;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Llj;I)V")
    public static final void method106(class25 arg0, int arg1) {
        field238++;
        if (arg0.field475.length - arg0.field481 < 1) {
            return;
        }
        int var2 = arg0.method189((byte) -103);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if ((arg0.field475.length - arg0.field481) < var3) {
            return;
        }
        class120.field2126 = arg0.method189((byte) -103);
        if (class120.field2126 < 1) {
            class120.field2126 = 1;
        } else if (class120.field2126 > 4) {
            class120.field2126 = 4;
        }
        class250.method1688(-18, ~arg0.method189((byte) -103) == -2);
        class140.field2430 = arg0.method189((byte) -103) == 1;
        class12.field252 = arg0.method189((byte) -103) == 1;
        class83.field1376 = arg0.method189((byte) -103) == 1;
        class160.field2810 = arg0.method189((byte) -103) == 1;
        class2.field80 = arg0.method189((byte) -103) == 1;
        class81.field1332 = arg0.method189((byte) -103) == 1;
        class215.field3720 = arg0.method189((byte) -103) == 1;
        class17.field316 = arg0.method189((byte) -103);
        if (class17.field316 > 2) {
            class17.field316 = 2;
        }
        if (var2 >= 2) {
            class273.field4754 = arg0.method189((byte) -103) == 1;
        } else {
            class273.field4754 = arg0.method189((byte) -103) == 1;
            arg0.method189((byte) -103);
        }
        class183.field3219 = arg0.method189((byte) -103) == 1;
        class3.field101 = arg0.method189((byte) -103) == 1;
        class9.field190 = arg0.method189((byte) -103);
        if (class9.field190 > 2) {
            class9.field190 = 2;
        }
        if (arg1 >= -85) {
            method104((byte) -14);
        }
        class128.field2234 = class9.field190;
        class157.field2752 = arg0.method189((byte) -103) == 1;
        class261.field4617 = arg0.method189((byte) -103);
        if (class261.field4617 > 127) {
            class261.field4617 = 127;
        }
        class188.field3307 = arg0.method189((byte) -103);
        class54.field892 = arg0.method189((byte) -103);
        if (class54.field892 > 127) {
            class54.field892 = 127;
        }
        if (var2 >= 1) {
            class175.field3029 = arg0.method193((byte) 77);
            class222.field3854 = arg0.method193((byte) 77);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method189((byte) -103);
        }
        if (var2 >= 4) {
            int var4 = arg0.method189((byte) -103);
            if (class142.field2494 < 96) {
                var4 = 0;
            }
            class95.method670(var4);
        }
        if (var2 >= 5) {
            class64.field1053 = arg0.method199((byte) -85);
        }
        if (var2 >= 6) {
            class98.field1573 = arg0.method189((byte) -103);
        }
        if (var2 >= 7) {
            class242.field4247 = arg0.method189((byte) -103) == 1;
        }
        if (var2 >= 8) {
            class185.field3267 = arg0.method189((byte) -103) == 1;
        }
        if (var2 >= 9) {
            class50.field817 = arg0.method189((byte) -103);
        }
        if (var2 >= 10) {
            class9.field193 = arg0.method189((byte) -103) != 0;
        }
        if (var2 >= 11) {
            class190.field3332 = arg0.method189((byte) -103) != 0;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(DZLg;Ltg;IIZI)[I")
    public final int[] method107(double arg0, boolean arg1, class272 arg2, class180 arg3, int arg4, int arg5, boolean arg6, int arg7) {
        class261.method1763(arg0, true);
        field234++;
        int[] var10 = new int[arg4 * arg7];
        class100.field1626 = arg2;
        class182.field3205 = arg3;
        class37.method298(-122, arg4, arg7);
        for (int var11 = 0; var11 < this.field231.length; var11++) {
            this.field231[var11].method1645(52, arg4, arg7);
        }
        int var12;
        byte var13;
        int var14;
        if (arg6) {
            var13 = -1;
            var14 = arg7 - 1;
            var12 = -1;
        } else {
            var12 = arg7;
            var13 = 1;
            var14 = 0;
        }
        int var15 = 0;
        if (arg5 != -7611) {
            method105(-4, -30, -95);
        }
        for (int var16 = 0; var16 < arg4; var16++) {
            if (arg1) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field233.field4248) {
                int[] var22 = this.field233.method54(var16, 121);
                var21 = var22;
                var19 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field233.method71(true, var16);
                var19 = var18[0];
                var20 = var18[1];
                var21 = var18[2];
            }
            for (int var23 = var14; var23 != var12; var23 += var13) {
                int var24 = var19[var23] >> 4;
                int var25 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var26 = var21[var23] >> 4;
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                int var27 = class118.field2120[var24];
                int var28 = class118.field2120[var26];
                if (var25 < 0) {
                    var25 = 0;
                }
                int var29 = class118.field2120[var25];
                var10[var15++] = (var27 << 16) + (var29 << 8) + var28;
                if (arg1) {
                    var15 += arg7 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field231.length; var17++) {
            this.field231[var17].method1091(0);
        }
        return var10;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
    public class11() {
        this.field229 = new int[0];
        this.field235 = new int[0];
        this.field233 = new class181();
        this.field233.field4255 = 1;
        this.field232 = new class181();
        this.field231 = new class242[] { this.field233, this.field232 };
        this.field232.field4255 = 1;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Llj;)V")
    public class11(class25 arg0) {
        int var2 = 0;
        int var3 = arg0.method189((byte) -103);
        int[][] var4 = new int[var3][];
        this.field231 = new class242[var3];
        int var5 = 0;
        for (int var6 = 0; var6 < var3; var6++) {
            class242 var16 = class20.method157(arg0, -22973);
            if (var16.method1094(5727) >= 0) {
                var2++;
            }
            if (var16.method1554(61) >= 0) {
                var5++;
            }
            int var17 = var16.field4256.length;
            var4[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var4[var6][var18] = arg0.method189((byte) -103);
            }
            this.field231[var6] = var16;
        }
        this.field229 = new int[var2];
        int var7 = 0;
        this.field235 = new int[var5];
        int var8 = 0;
        for (int var9 = 0; var9 < var3; var9++) {
            class242 var11 = this.field231[var9];
            int var12 = var11.field4256.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4256[var13] = this.field231[var4[var9][var13]];
            }
            int var14 = var11.method1094(5727);
            int var15 = var11.method1554(112);
            if (var14 > 0) {
                this.field229[var7++] = var14;
            }
            if (var15 > 0) {
                this.field235[var8++] = var15;
            }
            var4[var9] = null;
        }
        Object var10 = null;
        this.field233 = this.field231[arg0.method189((byte) -103)];
        this.field232 = this.field231[arg0.method189((byte) -103)];
    }
}
