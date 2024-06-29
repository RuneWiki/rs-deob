import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class220 extends class86 {

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "[I")
    public int[] field3097 = new int[] { -1 };

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "[I")
    public int[] field3101 = new int[1];

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "Lgn;")
    public static class475 field3099 = new class475(7, -1);

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "[I")
    public static int[] field3103 = new int[4096];

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "Lgn;")
    public static class475 field3104;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Leq;BIIIZILwb;ILjl;)Lva;")
    public final class327 method1351(class134 arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class206 arg7, int arg8, class168 arg9) {
        int var11 = 64 % ((arg1 - 13) / 45);
        field3100++;
        class327 var12 = null;
        int var13 = arg6;
        class171 var14 = null;
        if (arg8 != -1) {
            var14 = class89.field1220.method473(arg8, (byte) -93);
        }
        int[] var15 = this.field3097;
        if (var14 != null && var14.field2297 != null) {
            var15 = new int[var14.field2297.length];
            for (int var16 = 0; var16 < var14.field2297.length; var16++) {
                int var17 = var14.field2297[var16];
                if (var17 >= 0 && this.field3097.length > var17) {
                    var15[var16] = this.field3097[var17];
                } else {
                    var15[var16] = -1;
                }
            }
        }
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        boolean var21 = false;
        int var22 = -1;
        int var23 = -1;
        int var24 = 0;
        class103 var25 = null;
        class103 var26 = null;
        if (arg9 != null) {
            int var27 = arg9.field2219[arg3];
            var13 = arg6 | 0x20;
            int var28 = var27 >>> 16;
            var22 = var27 & 0xFFFF;
            var25 = class286.field4083.method2603(-1281, var28);
            if (var25 != null) {
                var19 |= var25.method621(var22, 0);
                var18 |= var25.method619(102, var22);
                var21 |= var25.method618(var22, 17712);
                var20 |= arg9.field2204;
            }
            if ((arg9.field2206 || class360.field5338) && arg2 != -1 && arg9.field2219.length > arg2) {
                int var29 = arg9.field2219[arg2];
                var24 = arg9.field2205[arg3];
                int var30 = var29 >>> 16;
                var23 = var29 & 0xFFFF;
                if (var28 == var30) {
                    var26 = var25;
                } else {
                    var26 = class286.field4083.method2603(-1281, var23 >>> 16);
                }
                if (var26 != null) {
                    var19 |= var26.method621(var23, 0);
                    var18 |= var26.method619(63, var23);
                    var21 |= var26.method618(var23, 17712);
                }
            }
            if (var19) {
                var13 |= 0x80;
            }
            if (var18) {
                var13 |= 0x100;
            }
            if (var20) {
                var13 |= 0x200;
            }
            if (var21) {
                var13 |= 0x400;
            }
        }
        long var31 = this.method1354(var15, arg5, arg8, 1155395016, arg7 == null ? null : arg7.field2862);
        if (class507.field7737 != null) {
            var12 = (class327) class507.field7737.method40(0, var31);
        }
        if (var12 == null || arg0.method819(var12.method200(), var13) != 0) {
            if (var12 != null) {
                var13 = arg0.method828(var13, var12.method200());
            }
            int var33 = var13;
            boolean var34 = false;
            for (int var35 = 0; var35 < var15.length; var35++) {
                if (var15[var35] != -1 && !class405.field5947.method1162(var15[var35], 0).method2208(117, arg5)) {
                    var34 = true;
                }
            }
            if (var34) {
                return null;
            }
            class499[] var36 = new class499[var15.length];
            for (int var37 = 0; var37 < var15.length; var37++) {
                if (var15[var37] != -1) {
                    var36[var37] = class405.field5947.method1162(var15[var37], 0).method2188((byte) -72, arg5);
                }
            }
            if (var14 != null && var14.field2313 != null) {
                for (int var38 = 0; var38 < var14.field2313.length; var38++) {
                    if (var14.field2313[var38] != null && var36[var38] != null) {
                        int var39 = var14.field2313[var38][0];
                        int var40 = var14.field2313[var38][1];
                        int var41 = var14.field2313[var38][2];
                        int var42 = var14.field2313[var38][3];
                        int var43 = var14.field2313[var38][4];
                        int var44 = var14.field2313[var38][5];
                        if (var42 != 0 || var43 != 0 || var44 != 0) {
                            var36[var38].method3001(var44, 332575631, var43, var42);
                        }
                        if (var39 != 0 || var40 != 0 || var41 != 0) {
                            var36[var38].method3002((byte) 118, var41, var40, var39);
                        }
                    }
                }
            }
            class499 var45 = new class499(var36, var36.length);
            if (arg7 != null) {
                var33 = var13 | 0x4000;
            }
            var12 = arg0.method737(var45, var33, class505.field7704, 64, 850);
            if (arg7 != null) {
                for (int var46 = 0; var46 < 5; var46++) {
                    if (arg7.field2862[var46] < class157.field2056[var46].length) {
                        var12.method175(class152.field1955[var46], class157.field2056[var46][arg7.field2862[var46]]);
                    }
                    if (arg7.field2862[var46] < class445.field6488[var46].length) {
                        var12.method175(class39.field593[var46], class445.field6488[var46][arg7.field2862[var46]]);
                    }
                }
            }
            if (class507.field7737 != null) {
                var12.method197(var13);
                class507.field7737.method36(-20960, var12, var31);
            }
        }
        if (arg9 == null || var25 == null) {
            return var12;
        } else {
            class327 var47 = var12.method194((byte) 1, var13, true);
            var47.method1956(0, arg9.field2204, var25, var22, var23, var26, 65535, arg4 - 1, var24);
            return var47;
        }
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(B)V")
    public static void method1352(byte arg0) {
        if (arg0 == -9) {
            field3099 = null;
            field3104 = null;
            field3103 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(B)V")
    public static final void method1353(byte arg0) {
        if (arg0 >= -45) {
            return;
        }
        field3098++;
        for (class456 var1 = (class456) class488.field7470.method2096(-21400); var1 != null; var1 = (class456) class488.field7470.method2084((byte) 19)) {
            class163 var2 = var1.field6644;
            if (var2.field2118) {
                var1.method536(false);
                var2.method1029(-116);
            } else if (class263.field3748 >= var2.field2117) {
                var2.method1034(0, class91.field1245);
                if (var2.field2118) {
                    var1.method536(false);
                } else {
                    class76.method503(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([IZII[I)J")
    private final long method1354(int[] arg0, boolean arg1, int arg2, int arg3, int[] arg4) {
        field3102++;
        if (arg3 != 1155395016) {
            return 63L;
        }
        long[] var6 = class156.field2026;
        long var7 = -1L;
        long var9 = var6[(int) (((long) (arg2 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var6[(int) ((var9 ^ (long) arg2) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg0.length; var13++) {
            long var17 = var6[(int) (((long) (arg0[var13] >> 24) ^ var11) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var17 >>> 8 ^ var6[(int) (((long) (arg0[var13] >> 16) ^ var17) & 0xFFL)];
            long var21 = var6[(int) (((long) (arg0[var13] >> 8) ^ var19) & 0xFFL)] ^ var19 >>> 8;
            var11 = var21 >>> 8 ^ var6[(int) ((var21 ^ (long) arg0[var13]) & 0xFFL)];
        }
        if (arg4 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) (((long) arg4[var14] ^ var11) & 0xFFL)];
            }
        }
        return var11 >>> 8 ^ var6[(int) (((long) (arg1 ? 1 : 0) ^ var11) & 0xFFL)];
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field3103[var0] = class343.method2074((byte) -74, var0);
        }
        field3104 = new class475(4, 11);
    }
}
