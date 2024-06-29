import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class112 extends class276 {

    @OriginalMember(owner = "client!wu", name = "p", descriptor = "[I")
    public int[] field1971 = new int[] { -1 };

    @OriginalMember(owner = "client!wu", name = "r", descriptor = "[I")
    public int[] field1973 = new int[1];

    @OriginalMember(owner = "client!wu", name = "n", descriptor = "Lrr;")
    public static class280 field1969 = new class280(12, 0, 1, 0);

    @OriginalMember(owner = "client!wu", name = "v", descriptor = "I")
    public static int field1977 = -1;

    @OriginalMember(owner = "client!wu", name = "u", descriptor = "Lfr;")
    public static class231 field1976 = new class231(8);

    @OriginalMember(owner = "client!wu", name = "o", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!wu", name = "q", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!wu", name = "s", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!wu", name = "t", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!wu", name = "w", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILch;)I", line = 11)
    public static final int method802(int arg0, class166 arg1) {
        field1972++;
        int var2 = -68 / ((arg0 - 90) / 32);
        int var3 = arg1.field2642;
        class49 var4 = arg1.method1308(-13076);
        if (arg1.field3111) {
            var3 = arg1.field2637;
        } else if (arg1.field3078 == var4.field781 || arg1.field3078 == var4.field797 || arg1.field3078 == var4.field824 || arg1.field3078 == var4.field809) {
            var3 = arg1.field2655;
        } else if (arg1.field3078 == var4.field805 || arg1.field3078 == var4.field788 || arg1.field3078 == var4.field811 || arg1.field3078 == var4.field772) {
            var3 = arg1.field2664;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V", line = 37)
    public static final void method803(int arg0) {
        field1974++;
        class91.method633(2, false, 22050, class510.field7403.field5094);
        class37.field547 = new class374();
        class37.field547.method2378(128, (byte) -124, 9);
        class177.field2811 = class442.method2662(0, class419.field6342, 22050, class270.field4495, -1);
        class177.field2811.method527(class37.field547, -126);
        class320.method2027(class316.field4978, class298.field4799, class37.field547, class471.field6971, 8);
        class429.field6435 = class442.method2662(1, class419.field6342, 2048, class270.field4495, -1);
        if (arg0 <= -103) {
            class510.field7455 = new class258();
            class429.field6435.method527(class510.field7455, -126);
            class247.field4238 = new class495(22050, class12.field141);
            class434.field6483 = class29.field472.method2927("scape main", -91);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lza;IILsq;IIILqp;IZ)Le;", line = 58)
    public final class530 method804(class491 arg0, int arg1, int arg2, class145 arg3, int arg4, int arg5, int arg6, class333 arg7, int arg8, boolean arg9) {
        field1978++;
        class530 var11 = null;
        int var12 = arg4;
        class49 var13 = null;
        if (arg6 != -1) {
            var13 = class224.field3870.method1934(122, arg6);
        }
        int[] var14 = this.field1971;
        if (var13 != null && var13.field782 != null) {
            var14 = new int[var13.field782.length];
            for (int var15 = 0; var15 < var13.field782.length; var15++) {
                int var16 = var13.field782[var15];
                if (var16 >= 0 && this.field1971.length > var16) {
                    var14[var15] = this.field1971[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class48 var24 = null;
        class48 var25 = null;
        if (arg3 != null) {
            int var26 = arg3.field2377[arg1];
            var12 = arg4 | 0x20;
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class130.field2232.method637(var27, false);
            if (var24 != null) {
                var18 |= var24.method340(-2, var21);
                var17 |= var24.method346(false, var21);
                var20 |= var24.method348(arg2 ^ 0x5E, var21);
                var19 |= arg3.field2362;
            }
            if ((arg3.field2358 || class230.field4004) && arg8 != -1 && arg8 < arg3.field2377.length) {
                int var28 = arg3.field2377[arg8];
                var23 = arg3.field2375[arg1];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class130.field2232.method637(var22 >>> 16, false);
                }
                if (var25 != null) {
                    var18 |= var25.method340(-2, var22);
                    var17 |= var25.method346(false, var22);
                    var20 |= var25.method348(82, var22);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
            if (var20) {
                var12 |= 0x400;
            }
        }
        long var30 = this.method806(arg6, var14, true, arg9, arg7 == null ? null : arg7.field5243);
        if (arg2 != 12) {
            return null;
        }
        if (class303.field4852 != null) {
            var11 = (class530) class303.field4852.method1593((byte) 14, var30);
        }
        if (var11 == null || arg0.method902(var11.method741(), var12) != 0) {
            if (var11 != null) {
                var12 = arg0.method878(var12, var11.method741());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class20.field218.method2221(var14[var34], arg2 ^ 0xFFFFFFF3).method716(arg9, -101)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class227[] var35 = new class227[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class20.field218.method2221(var14[var36], class53.method369(arg2, -13)).method717((byte) 126, arg9);
                }
            }
            if (var13 != null && var13.field814 != null) {
                for (int var37 = 0; var37 < var13.field814.length; var37++) {
                    if (var13.field814[var37] != null && var35[var37] != null) {
                        int var38 = var13.field814[var37][0];
                        int var39 = var13.field814[var37][1];
                        int var40 = var13.field814[var37][2];
                        int var41 = var13.field814[var37][3];
                        int var42 = var13.field814[var37][4];
                        int var43 = var13.field814[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method1576(var42, var41, var43, false);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method1567(var40, var38, (byte) 122, var39);
                        }
                    }
                }
            }
            class227 var44 = new class227(var35, var35.length);
            if (arg7 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg0.method875(var44, var32, class471.field6974, 64, 850);
            if (arg7 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (class73.field1253[var45].length > arg7.field5243[var45]) {
                        var11.method728(class300.field4816[var45], class73.field1253[var45][arg7.field5243[var45]]);
                    }
                    if (arg7.field5243[var45] < class146.field2389[var45].length) {
                        var11.method728(class175.field2775[var45], class146.field2389[var45][arg7.field5243[var45]]);
                    }
                }
            }
            if (class303.field4852 != null) {
                var11.method762(var12);
                class303.field4852.method1595(var11, var30, (byte) 21);
            }
        }
        if (arg3 == null || var24 == null) {
            return var11;
        } else {
            class530 var46 = var11.method739((byte) 1, var12, true);
            var46.method3138(var24, var23, var21, var22, arg3.field2362, var25, 0, arg2 ^ 0xC, arg5 - 1);
            return var46;
        }
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(I)V", line = 310)
    public static void method805(int arg0) {
        field1976 = null;
        field1969 = null;
        if (arg0 != 32) {
            method802(-74, null);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I[IZZ[I)J", line = 336)
    private final long method806(int arg0, int[] arg1, boolean arg2, boolean arg3, int[] arg4) {
        field1975++;
        long[] var6 = class397.field6075;
        long var7 = -1L;
        long var9 = var6[(int) (((long) (arg0 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var6[(int) ((var9 ^ (long) arg0) & 0xFFL)];
        if (!arg2) {
            return -114L;
        }
        for (int var13 = 0; var13 < arg1.length; var13++) {
            long var17 = var6[(int) ((var11 ^ (long) (arg1[var13] >> 24)) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var6[(int) ((var17 ^ (long) (arg1[var13] >> 16)) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var19 >>> 8 ^ var6[(int) (((long) (arg1[var13] >> 8) ^ var19) & 0xFFL)];
            var11 = var6[(int) (((long) arg1[var13] ^ var21) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg4 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) (((long) arg4[var14] ^ var11) & 0xFFL)];
            }
        }
        return var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
    }
}
