import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class206 {

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    public int field2859 = -1;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field2857 = 52;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "[F")
    public static float[] field2861 = new float[4];

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Liu;")
    public static class390 field2846 = new class390(6, 18);

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public static int field2864 = 0;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    private int field2845;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "J")
    private long field2850;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "J")
    private long field2854;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Lih;")
    public static class474 field2851;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Z")
    public boolean field2844;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "[I")
    private int[] field2858;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "[I")
    public int[] field2862;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "[[I")
    private int[][] field2849;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
    private final void method1268(boolean arg0) {
        if (!arg0) {
            this.method1270(null, null, null, -12, -55, -86, 81, null, 69, 67, 52, false);
        }
        field2865++;
        long[] var2 = class156.field2026;
        this.field2854 = -1L;
        this.field2854 = var2[(int) (((long) (this.field2845 >> 8) ^ this.field2854) & 0xFFL)] ^ this.field2854 >>> 8;
        this.field2854 = this.field2854 >>> 8 ^ var2[(int) (((long) this.field2845 ^ this.field2854) & 0xFFL)];
        for (int var3 = 0; var3 < 12; var3++) {
            this.field2854 = this.field2854 >>> 8 ^ var2[(int) ((this.field2854 ^ (long) (this.field2858[var3] >> 24)) & 0xFFL)];
            this.field2854 = var2[(int) ((this.field2854 ^ (long) (this.field2858[var3] >> 16)) & 0xFFL)] ^ this.field2854 >>> 8;
            this.field2854 = this.field2854 >>> 8 ^ var2[(int) ((this.field2854 ^ (long) (this.field2858[var3] >> 8)) & 0xFFL)];
            this.field2854 = var2[(int) ((this.field2854 ^ (long) this.field2858[var3]) & 0xFFL)] ^ this.field2854 >>> 8;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field2854 = var2[(int) ((this.field2854 ^ (long) this.field2862[var4]) & 0xFFL)] ^ this.field2854 >>> 8;
        }
        this.field2854 = this.field2854 >>> 8 ^ var2[(int) ((this.field2854 ^ (long) (this.field2844 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILeq;Ljl;ILno;ILwk;Ltf;Lb;ILrs;I)Lva;")
    public final class327 method1269(int arg0, class134 arg1, class168 arg2, int arg3, class476 arg4, int arg5, class90 arg6, class184 arg7, class209 arg8, int arg9, class445 arg10, int arg11) {
        field2853++;
        if (this.field2859 != -1) {
            return arg6.method565(27114, this.field2859).method1661(arg4, arg9, arg10, arg1, arg5, arg0, arg3, 121, arg2);
        }
        int var13 = arg3;
        if (arg2 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg2.field2219[arg9];
            var13 = arg3 | 0x20;
            Object var22 = null;
            int var23 = var21 >>> 16;
            class103 var24 = arg10.method2603(-1281, var23);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method621(var25, 0);
                var14 |= var24.method619(57, var25);
                var17 |= var24.method618(var25, 17712);
                var16 |= arg2.field2204;
            }
            if ((arg2.field2206 || class360.field5338) && arg0 != -1 && arg2.field2219.length > arg0) {
                int var26 = arg2.field2219[arg0];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class103 var29 = var23 == var27 ? var24 : arg10.method2603(-1281, var27);
                if (var29 != null) {
                    var15 |= var29.method621(var28, 0);
                    var14 |= var29.method619(95, var28);
                    var17 |= var29.method618(var28, 17712);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        class5 var30 = class124.field1607;
        class327 var31;
        synchronized (class124.field1607) {
            var31 = (class327) class124.field1607.method40(0, this.field2854);
        }
        if (var31 == null || arg1.method819(var31.method200(), var13) != 0) {
            if (var31 != null) {
                var13 = arg1.method828(var13, var31.method200());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field2858[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((var35 & Integer.MIN_VALUE) != 0 && !arg8.method1289(27615, var35 & 0x3FFFFFFF).method2526(true)) {
                        var33 = true;
                    }
                } else if (!arg7.method1162(var35 & 0x3FFFFFFF, arg11 ^ 0x3FFFFFFF).method2205(this.field2844, 22463)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class499[] var36 = new class499[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field2858[var38];
                if ((var39 & 0x40000000) != 0) {
                    class499 var41 = arg7.method1162(var39 & 0x3FFFFFFF, 0).method2191(105, this.field2844);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((var39 & Integer.MIN_VALUE) != 0) {
                    class499 var40 = arg8.method1289(arg11 - 1073714208, var39 & 0x3FFFFFFF).method2537((byte) 97);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            int var42 = var13 | 0x4000;
            class499 var43 = new class499(var36, var37);
            var31 = arg1.method737(var43, var42, class221.field3113, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (class157.field2056[var44].length > this.field2862[var44]) {
                    var31.method175(class152.field1955[var44], class157.field2056[var44][this.field2862[var44]]);
                }
                if (this.field2862[var44] < class445.field6488[var44].length) {
                    var31.method175(class39.field593[var44], class445.field6488[var44][this.field2862[var44]]);
                }
            }
            var31.method197(var13);
            class5 var45 = class124.field1607;
            synchronized (class124.field1607) {
                class124.field1607.method36(arg11 ^ 0xC00051DF, var31, this.field2854);
            }
        }
        if (arg2 == null) {
            return var31;
        }
        if (arg11 != 1073741823) {
            this.field2859 = 127;
        }
        var31.method194((byte) 4, var13, true);
        return arg2.method1056(var31, arg0, 12045, arg5, arg3, arg9);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Leq;Lb;Lrs;IIIILjl;IIIZ)Lva;")
    public final class327 method1270(class134 arg0, class209 arg1, class445 arg2, int arg3, int arg4, int arg5, int arg6, class168 arg7, int arg8, int arg9, int arg10, boolean arg11) {
        field2847++;
        int var13 = arg3;
        if (arg7 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg3 | 0x20;
            Object var21 = null;
            int var22 = arg7.field2219[arg4];
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class103 var25 = arg2.method2603(-1281, var23);
            if (var25 != null) {
                var15 |= var25.method621(var24, 0);
                var14 |= var25.method619(42, var24);
                var17 |= var25.method618(var24, 17712);
                var16 |= arg7.field2204;
            }
            if ((arg7.field2206 || class360.field5338) && arg9 != -1 && arg7.field2219.length > arg9) {
                int var26 = arg7.field2219[arg9];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class103 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg2.method2603(-1281, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method621(var28, 0);
                    var14 |= var29.method619(80, var28);
                    var17 |= var29.method618(var28, 17712);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        long var30 = (long) arg5 << 32 | (long) (arg10 << 16) | (long) arg6;
        class5 var32 = class124.field1607;
        class327 var33;
        synchronized (class124.field1607) {
            var33 = (class327) class124.field1607.method40(0, var30);
        }
        if (var33 == null || arg0.method819(var33.method200(), var13) != 0) {
            if (var33 != null) {
                var13 = arg0.method828(var13, var33.method200());
            }
            class499[] var35 = new class499[3];
            int var36 = 0;
            if (!arg1.method1289(27615, arg6).method2526(arg11) || !arg1.method1289(27615, arg10).method2526(true) || !arg1.method1289(27615, arg5).method2526(true)) {
                return null;
            }
            class499 var37 = arg1.method1289(27615, arg6).method2537((byte) 63);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class499 var38 = arg1.method1289(27615, arg10).method2537((byte) 91);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class499 var39 = arg1.method1289(27615, arg5).method2537((byte) 78);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class499 var41 = new class499(var35, var36);
            var33 = arg0.method737(var41, var40, class221.field3113, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (this.field2862[var42] < class157.field2056[var42].length) {
                    var33.method175(class152.field1955[var42], class157.field2056[var42][this.field2862[var42]]);
                }
                if (this.field2862[var42] < class445.field6488[var42].length) {
                    var33.method175(class39.field593[var42], class445.field6488[var42][this.field2862[var42]]);
                }
            }
            var33.method197(var13);
            class5 var43 = class124.field1607;
            synchronized (class124.field1607) {
                class124.field1607.method36(-20960, var33, var30);
            }
        }
        if (arg7 == null) {
            return var33;
        } else {
            class327 var44 = var33.method194((byte) 4, var13, arg11);
            return arg7.method1056(var44, arg9, 12045, arg8, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILjava/lang/String;ZI)I")
    public static final int method1271(int arg0, String arg1, boolean arg2, int arg3) {
        field2863++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        if (arg3 != 3869) {
            field2846 = null;
        }
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg0) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if (var10 / arg0 != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZI)V")
    public final void method1272(boolean arg0, int arg1) {
        if (arg1 < -7) {
            field2852++;
            this.field2844 = arg0;
            this.method1268(true);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static void method1273(byte arg0) {
        field2861 = null;
        field2846 = null;
        if (arg0 >= -66) {
            field2864 = -104;
        }
        field2851 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([IIZ[III)V")
    public final void method1274(int[] arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5) {
        if (this.field2845 != arg4) {
            this.field2845 = arg4;
            this.field2849 = null;
        }
        this.field2862 = arg0;
        this.field2844 = arg2;
        if (arg5 != 449603976) {
            this.method1268(true);
        }
        field2856++;
        this.field2858 = arg3;
        this.field2859 = arg1;
        this.method1268(true);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILtf;ILeq;Lwk;Lrs;I[Ltn;ILb;ILjl;Ljl;Lno;Lbm;IZI)Lva;")
    public final class327 method1275(int arg0, int arg1, class184 arg2, int arg3, class134 arg4, class90 arg5, class445 arg6, int arg7, class55[] arg8, int arg9, class209 arg10, int arg11, class168 arg12, class168 arg13, class476 arg14, class70 arg15, int arg16, boolean arg17, int arg18) {
        field2855++;
        if (this.field2859 != -1) {
            return arg5.method565(arg16 + 27115, this.field2859).method1660(arg12, arg6, arg14, arg11, arg0, arg4, arg9, arg18, arg8, arg7, 850, arg13, arg15, arg3, arg1);
        }
        int var20 = arg11;
        long var21 = this.field2854;
        int[] var23 = this.field2858;
        if (arg12 != null && (arg12.field2222 >= 0 || arg12.field2229 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field2858[var24];
            }
            if (arg12.field2222 >= 0) {
                if (arg12.field2222 == 65535) {
                    var23[5] = 0;
                    var21 ^= 0xFFFFFFFF00000000L;
                } else {
                    var23[5] = class51.method379(arg12.field2222, 1073741824);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg12.field2229 >= 0) {
                if (arg12.field2229 == 65535) {
                    var21 ^= 0xFFFFFFFFL;
                    var23[3] = 0;
                } else {
                    var23[3] = class51.method379(1073741824, arg12.field2229);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg12 != null || arg13 != null;
        int var29 = arg8 == null ? 0 : arg8.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class352.field5107[var30] = null;
            if (arg8[var30] != null) {
                class168 var31 = arg6.method2602(-24462, arg8[var30].field848);
                if (var31.field2219 != null) {
                    class430.field6324[var30] = var31;
                    var28 = true;
                    int var32 = arg8[var30].field850;
                    int var33 = arg8[var30].field846;
                    int var34 = var31.field2219[var32];
                    class352.field5107[var30] = arg6.method2603(-1281, var34 >>> 16);
                    int var35 = var34 & 0xFFFF;
                    class39.field595[var30] = var35;
                    if (class352.field5107[var30] != null) {
                        var26 |= class352.field5107[var30].method621(var35, 0);
                        var25 |= class352.field5107[var30].method619(arg16 + 111, var35);
                        var27 |= class352.field5107[var30].method618(var35, 17712);
                    }
                    if ((var31.field2206 || class360.field5338) && var33 != -1 && var31.field2219.length > var33) {
                        class373.field5579[var30] = var31.field2205[var32];
                        class137.field1788[var30] = arg8[var30].field856;
                        int var36 = var31.field2219[var33];
                        class42.field632[var30] = arg6.method2603(-1281, var36 >>> 16);
                        int var37 = var36 & 0xFFFF;
                        class379.field5663[var30] = var37;
                        if (class42.field632[var30] != null) {
                            var26 |= class42.field632[var30].method621(var37, 0);
                            var25 |= class42.field632[var30].method619(38, var37);
                            var27 |= class42.field632[var30].method618(var37, 17712);
                        }
                    } else {
                        class373.field5579[var30] = 0;
                        class137.field1788[var30] = 0;
                        class42.field632[var30] = null;
                        class379.field5663[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class103 var41 = null;
        class103 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class103 var46 = null;
        class103 var47 = null;
        if (var28) {
            var20 = arg11 | 0x20;
            if (arg12 != null) {
                int var48 = arg12.field2219[arg18];
                int var49 = var48 >>> 16;
                var38 = var48 & 0xFFFF;
                var41 = arg6.method2603(-1281, var49);
                if (var41 != null) {
                    var26 |= var41.method621(var38, 0);
                    var25 |= var41.method619(95, var38);
                    var27 |= var41.method618(var38, arg16 ^ 0xFFFFBACF);
                }
                if ((arg12.field2206 || class360.field5338) && arg0 != -1 && arg0 < arg12.field2219.length) {
                    int var50 = arg12.field2219[arg0];
                    var40 = arg12.field2205[arg18];
                    int var51 = var50 >>> 16;
                    var39 = var50 & 0xFFFF;
                    var42 = var49 == var51 ? var41 : arg6.method2603(-1281, var51);
                    if (var42 != null) {
                        var26 |= var42.method621(var39, ~arg16);
                        var25 |= var42.method619(111, var39);
                        var27 |= var42.method618(var39, 17712);
                    }
                }
            }
            if (arg13 != null) {
                int var52 = arg13.field2219[arg9];
                int var53 = var52 >>> 16;
                var46 = arg6.method2603(-1281, var53);
                var43 = var52 & 0xFFFF;
                if (var46 != null) {
                    var26 |= var46.method621(var43, 0);
                    var25 |= var46.method619(62, var43);
                    var27 |= var46.method618(var43, arg16 ^ 0xFFFFBACF);
                }
                if ((arg13.field2206 || class360.field5338) && arg7 != -1 && arg7 < arg13.field2219.length) {
                    var45 = arg13.field2205[arg9];
                    int var54 = arg13.field2219[arg7];
                    int var55 = var54 >>> 16;
                    var44 = var54 & 0xFFFF;
                    var47 = var53 == var55 ? var46 : arg6.method2603(-1281, var55);
                    if (var47 != null) {
                        var26 |= var47.method621(var44, arg16 + 1);
                        var25 |= var47.method619(arg16 ^ 0xFFFFFFA0, var44);
                        var27 |= var47.method618(var44, arg16 ^ 0xFFFFBACF);
                    }
                }
            }
            if (var26) {
                var20 |= 0x80;
            }
            if (var25) {
                var20 |= 0x100;
            }
            if (var27) {
                var20 |= 0x400;
            }
        }
        class5 var56 = class151.field1951;
        class327 var57;
        synchronized (class151.field1951) {
            var57 = (class327) class151.field1951.method40(0, var21);
        }
        class171 var58 = null;
        if (this.field2845 != arg16) {
            var58 = arg15.method473(this.field2845, (byte) -91);
        }
        if (var57 == null || arg4.method819(var57.method200(), var20) != 0 || var58 != null && var58.field2313 != null && this.field2849 == null) {
            if (var57 != null) {
                var20 = arg4.method828(var20, var57.method200());
            }
            boolean var60 = false;
            int var61 = 0;
            while (true) {
                if (var61 >= 12) {
                    if (var60) {
                        if (this.field2850 != -1L) {
                            class5 var88 = class151.field1951;
                            synchronized (class151.field1951) {
                                var57 = (class327) class151.field1951.method40(0, this.field2850);
                            }
                        }
                        if (var57 == null || arg4.method819(var57.method200(), var20) != 0 || var58 != null && var58.field2313 != null && this.field2849 == null) {
                            return null;
                        }
                    } else {
                        class499[] var63 = new class499[12];
                        for (int var64 = 0; var64 < 12; var64++) {
                            int var65 = var23[var64];
                            if ((var65 & 0x40000000) != 0) {
                                class499 var66 = arg2.method1162(var65 & 0x3FFFFFFF, 0).method2188((byte) -72, this.field2844);
                                if (var66 != null) {
                                    var63[var64] = var66;
                                }
                            } else if ((var65 & Integer.MIN_VALUE) != 0) {
                                class499 var67 = arg10.method1289(27615, var65 & 0x3FFFFFFF).method2527(-119);
                                if (var67 != null) {
                                    var63[var64] = var67;
                                }
                            }
                        }
                        if (var58 != null && var58.field2313 != null) {
                            for (int var68 = 0; var68 < var58.field2313.length; var68++) {
                                if (var58.field2313[var68] != null && var63[var68] != null) {
                                    int var69 = var58.field2313[var68][0];
                                    int var70 = var58.field2313[var68][1];
                                    int var71 = var58.field2313[var68][2];
                                    int var72 = var58.field2313[var68][3] << 3;
                                    int var73 = var58.field2313[var68][4] << 3;
                                    int var74 = var58.field2313[var68][5] << 3;
                                    if (this.field2849 == null) {
                                        this.field2849 = new int[var58.field2313.length][];
                                    }
                                    if (this.field2849[var68] == null) {
                                        int[] var75 = this.field2849[var68] = new int[15];
                                        if (var72 == 0 && var73 == 0 && var74 == 0) {
                                            var75[13] = -var70;
                                            var75[0] = var75[4] = var75[8] = 32768;
                                            var75[14] = -var71;
                                            var75[12] = -var69;
                                        } else {
                                            int var76 = class323.field4733[var72];
                                            int var77 = class323.field4731[var72];
                                            int var78 = class323.field4733[var73];
                                            int var79 = class323.field4731[var73];
                                            int var80 = class323.field4733[var74];
                                            int var81 = class323.field4731[var74];
                                            int var82 = var77 * var80 + 16384 >> 15;
                                            int var83 = var77 * var81 + 16384 >> 15;
                                            var75[8] = var76 * var78 + 16384 >> 15;
                                            var75[7] = var78 * var82 + -var79 * -var81 + 16384 >> 15;
                                            var75[4] = var76 * var80 + 16384 >> 15;
                                            var75[1] = -var81 * var78 + var79 * var82 + 16384 >> 15;
                                            var75[0] = var78 * var80 + var79 * var83 + 16384 >> 15;
                                            var75[2] = var76 * var79 + 16384 >> 15;
                                            var75[5] = -var77;
                                            var75[6] = -var79 * var80 + var78 * var83 + 16384 >> 15;
                                            var75[3] = var76 * var81 + 16384 >> 15;
                                            var75[14] = var75[2] * -var69 + (var75[5] * -var70) + var75[8] * -var71 + 16384 >> 15;
                                            var75[12] = var75[0] * -var69 + var75[6] * -var71 + var75[3] * -var70 + 16384 >> 15;
                                            var75[13] = var75[7] * -var71 + var75[4] * -var70 + var75[1] * -var69 + 16384 >> 15;
                                        }
                                        var75[10] = var70;
                                        var75[9] = var69;
                                        var75[11] = var71;
                                    }
                                    if (var72 != 0 || var73 != 0 || var74 != 0) {
                                        var63[var68].method3001(var74, arg16 ^ 0xEC2D4C70, var73, var72);
                                    }
                                    if (var69 != 0 || var70 != 0 || var71 != 0) {
                                        var63[var68].method3002((byte) 118, var71, var70, var69);
                                    }
                                }
                            }
                        }
                        class499 var84 = new class499(var63, var63.length);
                        int var85 = var20 | 0x4000;
                        var57 = arg4.method737(var84, var85, class221.field3113, 64, 850);
                        for (int var86 = 0; var86 < 5; var86++) {
                            if (class157.field2056[var86].length > this.field2862[var86]) {
                                var57.method175(class152.field1955[var86], class157.field2056[var86][this.field2862[var86]]);
                            }
                            if (this.field2862[var86] < class445.field6488[var86].length) {
                                var57.method175(class39.field593[var86], class445.field6488[var86][this.field2862[var86]]);
                            }
                        }
                        if (arg17) {
                            var57.method197(var20);
                            class5 var87 = class151.field1951;
                            synchronized (class151.field1951) {
                                class151.field1951.method36(-20960, var57, var21);
                            }
                            this.field2850 = var21;
                        }
                    }
                    break;
                }
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var62) != 0 && !arg10.method1289(27615, var62 & 0x3FFFFFFF).method2536(0)) {
                        var60 = true;
                    }
                } else if (!arg2.method1162(var62 & 0x3FFFFFFF, ~arg16).method2208(84, this.field2844)) {
                    var60 = true;
                }
                var61++;
            }
        }
        class327 var89 = var57.method194((byte) 4, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var90 < var29) {
            if (class352.field5107[var90] != null) {
                var89.method1961(class42.field632[var90], this.field2849 == null ? null : this.field2849[var90], class379.field5663[var90], class137.field1788[var90] - 1, class39.field595[var90], false, class373.field5579[var90], var91, 0, class352.field5107[var90], -88);
            }
            var90++;
            var91 <<= 0x1;
        }
        if (var41 != null && var46 != null) {
            var89.method1959(var47, var42, arg12.field2218, var39, var40, var41, 124, false, var44, var45, arg1 - 1, var46, var43, arg3 - 1, var38);
        } else if (var41 != null) {
            var89.method1956(0, false, var41, var38, var39, var42, 65535, arg3 - 1, var40);
        } else if (var46 != null) {
            var89.method1956(0, false, var46, var43, var44, var47, 65535, arg1 - 1, var45);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class352.field5107[var92] = null;
            class42.field632[var92] = null;
            class430.field6324[var92] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZILb;)V")
    public final void method1276(int arg0, boolean arg1, int arg2, class209 arg3) {
        field2848++;
        int var5 = class41.field630[arg2];
        if (this.field2858[var5] == 0 || arg3.method1289(27615, arg0) == null) {
            return;
        }
        this.field2858[var5] = class51.method379(arg0, Integer.MIN_VALUE);
        if (!arg1) {
            this.method1268(true);
        }
        this.method1268(arg1);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
    public final void method1277(int arg0, int arg1, int arg2) {
        field2860++;
        this.field2862[arg1] = arg2;
        this.method1268(true);
        if (arg0 != -683537784) {
            this.field2849 = null;
        }
    }
}
