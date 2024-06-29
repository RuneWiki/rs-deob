import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class218 extends class287 {

    @OriginalMember(owner = "client!mu", name = "v", descriptor = "Lju;")
    public static class102 field3081 = new class102(75, 16);

    @OriginalMember(owner = "client!mu", name = "D", descriptor = "Z")
    public static boolean field3089 = false;

    @OriginalMember(owner = "client!mu", name = "A", descriptor = "Z")
    public static boolean field3086 = false;

    @OriginalMember(owner = "client!mu", name = "H", descriptor = "[[Z")
    public static boolean[][] field3093 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!mu", name = "t", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!mu", name = "y", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!mu", name = "z", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!mu", name = "E", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!mu", name = "F", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!mu", name = "G", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!mu", name = "I", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!mu", name = "B", descriptor = "Ljava/lang/String;")
    public String field3087;

    @OriginalMember(owner = "client!mu", name = "x", descriptor = "[C")
    public char[] field3083;

    @OriginalMember(owner = "client!mu", name = "C", descriptor = "[C")
    public char[] field3088;

    @OriginalMember(owner = "client!mu", name = "u", descriptor = "[I")
    public int[] field3080;

    @OriginalMember(owner = "client!mu", name = "w", descriptor = "[I")
    public int[] field3082;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BII)Z")
    public static final boolean method1424(byte arg0, int arg1, int arg2) {
        field3092++;
        if (arg0 != -41) {
            method1424((byte) -15, 88, 66);
        }
        return (arg2 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(CI)I")
    public final int method1425(char arg0, int arg1) {
        field3091++;
        if (this.field3080 == null) {
            return -1;
        }
        for (int var3 = arg1; var3 < this.field3080.length; var3++) {
            if (this.field3083[var3] == arg0) {
                return this.field3080[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(B)V")
    public static void method1426(byte arg0) {
        field3093 = null;
        int var1 = 30 % ((33 - arg0) / 41);
        field3081 = null;
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(BII)Z")
    public static final boolean method1427(byte arg0, int arg1, int arg2) {
        if (arg0 >= -46) {
            field3081 = null;
        }
        field3084++;
        return (arg2 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
    public static final void method1428(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class238.field3315 = true;
        class561.field7980 = class646.field9160.method2124() > 0;
        class22.field251 = arg15;
        class126.field1717 = arg1 >> class509.field7106;
        class157.field2139 = arg3 >> class509.field7106;
        class310.field3978 = arg1;
        class125.field1705 = arg3;
        class60.field821 = arg2;
        class422.field5839 = class126.field1717 - class707.field9874;
        if (class422.field5839 < 0) {
            class661.field9318 = -class422.field5839;
            class422.field5839 = 0;
        } else {
            class661.field9318 = 0;
        }
        class625.field8925 = class157.field2139 - class707.field9874;
        if (class625.field8925 < 0) {
            class105.field1534 = -class625.field8925;
            class625.field8925 = 0;
        } else {
            class105.field1534 = 0;
        }
        class400.field5535 = class707.field9874 + class126.field1717;
        if (class400.field5535 > class485.field6556) {
            class400.field5535 = class485.field6556;
        }
        class207.field2953 = class707.field9874 + class157.field2139;
        if (class207.field2953 > class314.field4059) {
            class207.field2953 = class314.field4059;
        }
        boolean[][] var19 = class359.field4594;
        boolean[][] var20 = class419.field5809;
        if (class22.field251) {
            for (int var21 = 0; var21 < class707.field9874 + class707.field9874 + 2; var21++) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class707.field9874 + class707.field9874 + 2; var24++) {
                    if (var24 > 1) {
                        class48.field704[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class126.field1717 + var21 - class707.field9874;
                    int var26 = class157.field2139 + var24 - class707.field9874;
                    if (var25 >= 0 && var26 >= 0 && var25 < class485.field6556 && var26 < class314.field4059) {
                        int var27 = var25 << class509.field7106;
                        int var28 = var26 << class509.field7106;
                        int var29 = class155.field2126[class155.field2126.length - 1].method1959(126, var26, var25) - (0x3E8 << class509.field7106 - 7);
                        int var30 = class435.field5969 == null ? class155.field2126[0].method1959(126, var26, var25) + class96.field1402 : class435.field5969[0].method1959(125, var26, var25) + class96.field1402;
                        var23 = arg16 >= 0 ? class646.field9160.method2156(var27, var29, var28, var27, var30, var28, arg16) : class646.field9160.method2189(var27, var29, var28, var27, var30, var28);
                        class419.field5809[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        class419.field5809[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class48.field704[var24 - 1] & class48.field704[var24] & var22 & var23;
                        class359.field4594[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class48.field704[class707.field9874 + class707.field9874] = var22;
                class48.field704[class707.field9874 + class707.field9874 + 1] = var23;
            }
            if (arg16 >= 0) {
                class238.field3315 = false;
            } else {
                class404.field5605 = arg5;
                class646.field9154 = arg6;
                class71.field993 = arg7;
                class569.field8067 = arg8;
                class271.field3667 = arg9;
                class442.method2642(arg10, class646.field9160, -108);
            }
        } else {
            if (class730.field10227 == null) {
                class730.field10227 = new boolean[class485.field6556 + class485.field6556 + 1][class485.field6556 + class314.field4059 + 1];
            }
            for (int var32 = 0; var32 < class730.field10227.length; var32++) {
                for (int var42 = 0; var42 < class730.field10227[0].length; var42++) {
                    class730.field10227[var32][var42] = true;
                }
            }
            class419.field5809 = class730.field10227;
            class359.field4594 = class730.field10227;
            class422.field5839 = 0;
            class625.field8925 = 0;
            class400.field5535 = class485.field6556;
            class207.field2953 = class314.field4059;
            class238.field3315 = false;
        }
        class225.method1460(class646.field9160, 8735);
        if (!class365.field4690.field4136) {
            class336 var33 = class365.field4690.field4135;
            for (class596 var34 = (class596) var33.method1945(false); var34 != null; var34 = (class596) var33.method1944(9408)) {
                var34.method1(-57);
                class149.method957(var34, 0);
            }
        }
        if (class561.field7980) {
            for (int var35 = 0; var35 < class442.field6068; var35++) {
                class146.field2026[var35].method3081(arg14, 28268, arg0);
            }
        }
        if (class659.field9305) {
            class190.field2759 = class646.field9160.method2107();
            class646.field9160.method2163(class644.field9143);
            int var36 = (class644.field9143[2] - class644.field9143[0]) / class314.field4050;
            for (int var37 = 0; var37 < class314.field4050 - 1; var37++) {
                class678.field9554[var37] = (var37 + 1) * var36 + class619.field8818[var37];
            }
            for (int var38 = 0; var38 < class523.field7347.length; var38++) {
                class523.field7347[var38].method3394();
            }
        }
        if (class192.field2787 != null) {
            if (class659.field9305) {
                class182.method1218(0);
            }
            class557.method3329(true);
            class646.field9160.method2151(-1, 1583160, 40, 127);
            class676.method3871(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class659.field9305) {
                class28.method205();
            }
            class646.field9160.method2200();
            class557.method3329(false);
        }
        class676.method3871(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class659.field9305) {
            for (int var39 = 0; var39 < class214.field3021; var39++) {
                class35.field502[var39] = class534.field7490[var39];
            }
            class182.method1218(0);
            for (int var40 = 0; var40 < class523.field7347.length; var40++) {
                class523.field7347[var40].method3394();
            }
        }
        if (class659.field9305) {
            class28.method205();
            for (int var41 = 0; var41 < class214.field3021; var41++) {
                class534.field7490[var41] = class35.field502[var41];
            }
            if (class188.field2742 == 2) {
                int var10002;
                if (class638.field9070[0] < class638.field9070[1]) {
                    if (class678.field9554[0] + class619.field8818[0] > class644.field9143[0]) {
                        var10002 = class619.field8818[0]++;
                    }
                } else if (class638.field9070[0] > class638.field9070[1] && class678.field9554[0] + class619.field8818[0] < class644.field9143[2]) {
                    var10002 = class619.field8818[0]--;
                }
            }
        }
        if (!class22.field251) {
            class359.field4594 = var19;
            class419.field5809 = var20;
        }
        class137.method889();
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILvj;)V")
    public final void method1429(int arg0, class26 arg1) {
        while (true) {
            int var3 = arg1.method194((byte) 119);
            if (var3 == 0) {
                if (arg0 != 4) {
                    this.method1430('\u000f', -38);
                }
                field3090++;
                return;
            }
            this.method1431(arg1, (byte) 50, var3);
        }
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(CI)I")
    public final int method1430(char arg0, int arg1) {
        field3094++;
        int var3 = -125 % ((46 - arg1) / 51);
        if (this.field3082 == null) {
            return -1;
        }
        for (int var4 = 0; var4 < this.field3082.length; var4++) {
            if (this.field3088[var4] == arg0) {
                return this.field3082[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lvj;BI)V")
    private final void method1431(class26 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field3087 = arg0.method196((byte) -92);
        } else if (arg2 == 2) {
            int var7 = arg0.method194((byte) 119);
            this.field3088 = new char[var7];
            this.field3082 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3082[var8] = arg0.method193(class450.method2703(arg1, 48));
                byte var9 = arg0.method195(128);
                this.field3088[var8] = var9 == 0 ? 0 : class503.method3005(true, var9);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method194((byte) 119);
            this.field3083 = new char[var4];
            this.field3080 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3080[var5] = arg0.method193(2);
                byte var6 = arg0.method195(128);
                this.field3083[var5] = var6 == 0 ? 0 : class503.method3005(true, var6);
            }
        }
        field3085++;
        if (arg1 != 50) {
            this.method1430((char) 65534, -57);
        }
    }

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "(B)V")
    public final void method1432(byte arg0) {
        field3079++;
        if (this.field3080 != null) {
            for (int var2 = 0; var2 < this.field3080.length; var2++) {
                this.field3080[var2] = class747.method4153(this.field3080[var2], 32768);
            }
        }
        if (arg0 <= -53 && this.field3082 != null) {
            for (int var3 = 0; var3 < this.field3082.length; var3++) {
                this.field3082[var3] = class747.method4153(this.field3082[var3], 32768);
            }
        }
    }
}
