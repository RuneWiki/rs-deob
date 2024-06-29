import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class238 {

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "Lgg;")
    private class61 field3796 = new class61(256);

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "Lgg;")
    private class61 field3814 = new class61(256);

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "Ljj;")
    private class134 field3802;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "Ljj;")
    private class134 field3795;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "Z")
    public static boolean field3793 = false;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field3797 = -1;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "[I")
    public static int[] field3800 = new int[5];

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field3807 = 0;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3804 = "Loaded wordpack";

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "J")
    public static long field3812 = 0L;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "Leb;")
    public static class103 field3815 = null;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "Ljj;")
    public static class134 field3805;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "[Lfd;")
    public static class219[] field3803;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1564(int arg0, int arg1) {
        field3798++;
        if (arg0 <= 55) {
            method1570((String) null, (byte) -5);
        }
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZIII)I")
    public static final int method1565(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg1) {
            field3803 = null;
        }
        int var5 = 65536 - class145.field2348[arg4 * 1024 / arg0] >> 1;
        field3813++;
        return ((65536 - var5) * arg2 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
    public static final void method1566(int arg0) {
        field3809++;
        if (!class290.field4632) {
            return;
        }
        class103 var1 = class122.method859(class221.field3526, (byte) -3, class254.field4063);
        if (var1 != null && var1.field1621 != null) {
            class173 var2 = new class173();
            var2.field2796 = var1;
            var2.field2798 = var1.field1621;
            class223.method1480(8170, var2);
        }
        class290.field4632 = false;
        field3797 = -1;
        int var3 = 18 / ((1 - arg0) / 56);
        class45.method346((byte) 29, var1);
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V")
    public static void method1567(int arg0) {
        field3800 = null;
        int var1 = -70 / ((arg0 + 31) / 59);
        field3805 = null;
        field3803 = null;
        field3804 = null;
        field3815 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I[II)Lwc;")
    public final class91 method1568(int arg0, int[] arg1, int arg2) {
        field3810++;
        if (this.field3795.method924(122) == 1) {
            return this.method1574(true, arg2, 0, arg1);
        } else if (this.field3795.method948((byte) -97, arg2) == 1) {
            return this.method1574(true, 0, arg2, arg1);
        } else if (arg0 == 1024) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(III[I)Lwc;")
    private final class91 method1569(int arg0, int arg1, int arg2, int[] arg3) {
        field3806++;
        int var5 = ((arg2 & 0xD0000FFF) << 4 | arg2 >>> 12) ^ arg1;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class91 var9 = (class91) this.field3814.method457(var7, (byte) -115);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            if (arg0 != 0) {
                field3804 = null;
            }
            class282 var10 = class282.method1889(this.field3802, arg2, arg1);
            if (var10 == null) {
                return null;
            }
            class91 var11 = var10.method1891();
            this.field3814.method466(var7, var11, (byte) 93);
            if (arg3 != null) {
                arg3[0] -= var11.field1302.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static final long method1570(String arg0, byte arg1) {
        if (arg1 <= 77) {
            return 119L;
        }
        field3801++;
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljj;Ljj;Ljj;BLjj;)V")
    public static final void method1571(class134 arg0, class134 arg1, class134 arg2, byte arg3, class134 arg4) {
        class151.field2447 = arg2;
        class287.field4584 = arg4;
        int var5 = 25 / ((11 - arg3) / 55);
        class128.field2138 = arg1;
        field3808++;
        class230.field3651 = arg0;
        class133.field2204 = new class103[class151.field2447.method924(126)][];
        class110.field1901 = new boolean[class151.field2447.method924(123)];
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method1572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field3794++;
        if (arg4 < 128 || arg1 < 128 || arg4 > 13056 || arg1 > 13056) {
            class236.field3775 = -1;
            class54.field773 = -1;
            return;
        }
        int var8 = class220.method1461(arg4, class28.field336, arg1, 80) - arg0;
        int var9 = arg4 - class44.field522;
        int var10 = arg1 - class119.field2014;
        int var11 = var8 - class193.field3108;
        int var12 = class145.field2348[class8.field119];
        int var13 = class145.field2338[class244.field3910];
        if (arg7 <= 40) {
            method1575((class264) null, (byte) -76);
        }
        int var14 = class145.field2348[class244.field3910];
        int var15 = class145.field2338[class8.field119];
        int var16 = var9 * var14 + var10 * var13 >> 16;
        int var17 = var10 * var14 - (var9 * var13) >> 16;
        int var19 = var11 * var12 - (var15 * var17) >> 16;
        int var20 = var11 * var15 + (var12 * var17) >> 16;
        if (var20 >= 50) {
            class54.field773 = (var19 << 9) / var20 + arg5;
            class236.field3775 = (var16 << 9) / var20 + arg6;
        } else {
            class54.field773 = -1;
            class236.field3775 = -1;
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I[II)Lwc;")
    public final class91 method1573(int arg0, int[] arg1, int arg2) {
        field3811++;
        if (this.field3802.method924(127) == 1) {
            return this.method1569(0, arg0, 0, arg1);
        } else if (this.field3802.method948((byte) -97, arg0) == 1) {
            return this.method1569(0, 0, arg0, arg1);
        } else {
            if (arg2 < 75) {
                method1567(52);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZII[I)Lwc;")
    private final class91 method1574(boolean arg0, int arg1, int arg2, int[] arg3) {
        if (!arg0) {
            this.method1569(81, 114, -4, (int[]) null);
        }
        field3816++;
        int var5 = (arg2 << 4 & 0xFFF5 | arg2 >>> 12) ^ arg1;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class91 var9 = (class91) this.field3814.method457(var7, (byte) -115);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class165 var10 = (class165) this.field3796.method457(var7, (byte) -115);
            if (var10 == null) {
                var10 = class165.method1153(this.field3795, arg2, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field3796.method466(var7, var10, (byte) 93);
            }
            class91 var11 = var10.method1147(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method544(-113);
                this.field3814.method466(var7, var11, (byte) 93);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Ljj;Ljj;)V")
    public class238(class134 arg0, class134 arg1) {
        this.field3802 = arg0;
        this.field3795 = arg1;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lhi;B)V")
    public static final void method1575(class264 arg0, byte arg1) {
        field3799++;
        if (arg0.field4198.length - arg0.field4195 < 1) {
            return;
        }
        int var2 = arg0.method1779(-83);
        if (arg1 != 38 || var2 < 0 || var2 > 11) {
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
        if (arg0.field4198.length - arg0.field4195 < var3) {
            return;
        }
        class257.field4109 = arg0.method1779(-86);
        if (class257.field4109 < 1) {
            class257.field4109 = 1;
        } else if (class257.field4109 > 4) {
            class257.field4109 = 4;
        }
        class101.method713(arg0.method1779(-75) == 1, -21793);
        class38.field468 = arg0.method1779(-53) == 1;
        class205.field3279 = arg0.method1779(-104) == 1;
        class168.field2735 = arg0.method1779(-122) == 1;
        class183.field2928 = arg0.method1779(-95) == 1;
        class96.field1442 = arg0.method1779(arg1 ^ 0xFFFFFF99) == 1;
        class9.field138 = arg0.method1779(-86) == 1;
        class22.field270 = arg0.method1779(-82) == 1;
        class96.field1454 = arg0.method1779(-95);
        if (class96.field1454 > 2) {
            class96.field1454 = 2;
        }
        if (var2 < 2) {
            class28.field339 = arg0.method1779(-71) == 1;
            arg0.method1779(-67);
        } else {
            class28.field339 = arg0.method1779(-99) == 1;
        }
        class133.field2207 = arg0.method1779(arg1 - 142) == 1;
        class235.field3744 = arg0.method1779(arg1 ^ 0xFFFFFF91) == 1;
        class239.field3819 = arg0.method1779(arg1 ^ 0xFFFFFF83);
        if (class239.field3819 > 2) {
            class239.field3819 = 2;
        }
        class108.field1877 = class239.field3819;
        class195.field3161 = arg0.method1779(-55) == 1;
        class153.field2469 = arg0.method1779(arg1 ^ 0xFFFFFFAD);
        if (class153.field2469 > 127) {
            class153.field2469 = 127;
        }
        class92.field1319 = arg0.method1779(-106);
        class45.field548 = arg0.method1779(-49);
        if (class45.field548 > 127) {
            class45.field548 = 127;
        }
        if (var2 >= 1) {
            class285.field4549 = arg0.method1777(-48);
            class283.field4508 = arg0.method1777(-61);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method1779(-105);
        }
        if (var2 >= 4) {
            int var4 = arg0.method1779(-93);
            if (class30.field370 < 96) {
                var4 = 0;
            }
            class4.method31(var4);
        }
        if (var2 >= 5) {
            class71.field981 = arg0.method1765((byte) 123);
        }
        if (var2 >= 6) {
            class207.field3332 = arg0.method1779(-105);
        }
        if (var2 >= 7) {
            class119.field2006 = arg0.method1779(-55) == 1;
        }
        if (var2 >= 8) {
            class107.field1867 = arg0.method1779(-82) == 1;
        }
        if (var2 >= 9) {
            class105.field1819 = arg0.method1779(-104);
        }
        if (var2 >= 10) {
            class79.field1093 = arg0.method1779(-62) != 0;
        }
        if (var2 >= 11) {
            class94.field1376 = arg0.method1779(-52) != 0;
        }
    }
}
