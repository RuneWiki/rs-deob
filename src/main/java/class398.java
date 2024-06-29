import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class398 {

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "[I")
    public static int[] field5459 = new int[25];

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "Z")
    public static boolean field5461 = true;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "[Lqp;")
    public static class303[] field5462 = new class303[14];

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public static int field5463 = 0;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "Lrc;")
    public static class108 field5460 = new class108(57, 3);

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "[I")
    public static int[] field5457;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIILa;La;)V", line = 9)
    public static final void method2393(int arg0, int arg1, int arg2, class421 arg3, class421 arg4) {
        class52 var5 = class360.method2214(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field772 = arg3;
            var5.field752 = arg4;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V", line = 35)
    public static void method2394(byte arg0) {
        field5462 = null;
        if (arg0 < -56) {
            field5459 = null;
            field5460 = null;
            field5457 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILid;Lwe;IILvc;)Z", line = 54)
    public static final boolean method2395(int arg0, class266 arg1, class76 arg2, int arg3, int arg4, class89 arg5) {
        field5458++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg2.field1111 != null) {
            var6 = (arg1.field3825 + arg2.field1115 - class330.field4585) * (class330.field4594 - class330.field4592) / (class330.field4582 - class330.field4585) + class330.field4592;
            var8 = class330.field4595 - ((arg1.field3828 + arg2.field1104 - class330.field4584) * (class330.field4595 - class330.field4587) / (class330.field4586 - class330.field4584));
            var9 = class330.field4595 - ((arg1.field3828 + arg2.field1095 - class330.field4584) * (class330.field4595 - class330.field4587) / (class330.field4586 - class330.field4584));
            var7 = class330.field4592 + ((class330.field4594 - class330.field4592) * (arg1.field3825 + arg2.field1135 - class330.field4585) / (class330.field4582 - class330.field4585));
        }
        class417 var10 = null;
        int var11 = 0;
        int var12 = 0;
        if (arg4 != -16025) {
            method2396(80, 124, 57);
        }
        int var13 = 0;
        int var14 = 0;
        if (arg2.field1086 != -1) {
            if (arg1.field3829 && arg2.field1112 != -1) {
                var10 = arg2.method668(-24659, true, arg5);
            } else {
                var10 = arg2.method668(-24659, false, arg5);
            }
            if (var10 != null) {
                var11 = arg1.field3830 - (var10.method1294() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var12 = arg1.field3830 + (var10.method1294() + 1 >> 1);
                var13 = arg1.field3827 - (var10.method1295() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                if (var8 > var13) {
                    var8 = var13;
                }
                var14 = arg1.field3827 + (var10.method1295() + 1 >> 1);
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class226 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg2.field1102 != null) {
            var15 = class395.method2386(true, arg2.field1120);
            if (var15 != null) {
                var16 = class473.field6660.method1353((int[]) null, class200.field2970, (class417[]) null, (byte) 77, arg2.field1102);
                int var23 = arg1.field3827;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method1540() / 2;
                } else {
                    var17 = var23 - ((var10.method1295() >> 1) + var15.method1539() * var16);
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class200.field2970[var24];
                    if ((var16 - 1) > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method1538(var25);
                    if (var26 > var18) {
                        var18 = var26;
                    }
                }
                var19 = arg0 + arg1.field3830 - (var18 / 2);
                var20 = arg1.field3830 + arg0 + (var18 / 2);
                if (var6 > var19) {
                    var6 = var19;
                }
                if (var20 > var7) {
                    var7 = var20;
                }
                var21 = arg3 + var17;
                var22 = var16 * var15.method1539() + (var17 + arg3);
                if (var21 < var8) {
                    var8 = var21;
                }
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (var7 < class330.field4592 || var6 > class330.field4594 || class330.field4587 > var9 || var8 > class330.field4595) {
            return true;
        }
        if (arg2.field1111 != null) {
            int[] var27 = new int[arg2.field1111.length];
            for (int var28 = 0; var28 < var27.length / 2; var28++) {
                int var30 = arg2.field1111[var28 * 2] + arg1.field3825;
                int var31 = arg2.field1111[var28 * 2 + 1] + arg1.field3828;
                var27[var28 * 2] = (var30 - class330.field4585) * (class330.field4594 - class330.field4592) / (class330.field4582 - class330.field4585) + class330.field4592;
                var27[var28 * 2 + 1] = class330.field4595 - ((var31 - class330.field4584) * (class330.field4595 - class330.field4587) / (class330.field4586 - class330.field4584));
            }
            class72.method650(arg5, var27, arg2.field1110);
            for (int var29 = 0; var29 < var27.length / 2 - 1; var29++) {
                arg5.method747(1, var27[var29 * 2 + 1], var27[(var29 + 1) * 2 + 1], arg2.field1093, var27[var29 * 2], var27[(var29 + 1) * 2]);
            }
            arg5.method747(1, var27[var27.length - 1], var27[1], arg2.field1093, var27[var27.length - 2], var27[0]);
        }
        if (var10 != null) {
            if (class349.field4804 > 0 && (class480.field6802 != -1 && class480.field6802 == arg1.field3826 || class221.field3193 != -1 && class221.field3193 == arg2.field1100)) {
                int var32;
                if (class182.field2752 > 50) {
                    var32 = 200 - (class182.field2752 * 2);
                } else {
                    var32 = class182.field2752 * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg5.method754(arg1.field3827, arg4 + 16025, var33, arg1.field3830, var10.method1293() / 2 + 7);
                arg5.method754(arg1.field3827, 0, var33, arg1.field3830, var10.method1293() / 2 + 5);
                arg5.method754(arg1.field3827, arg4 + 16025, var33, arg1.field3830, var10.method1293() / 2 + 3);
                arg5.method754(arg1.field3827, 0, var33, arg1.field3830, var10.method1293() / 2 + 1);
                arg5.method754(arg1.field3827, 0, var33, arg1.field3830, var10.method1293() / 2);
            }
            var10.method2493(arg1.field3830 - (var10.method1294() >> 1), arg1.field3827 + -(var10.method1295() >> 1));
        }
        if (arg2.field1102 != null && var15 != null) {
            class428.method2558(arg1, var16, var17, 0, var15, var18, arg5, arg2);
        }
        if (arg2.field1086 != -1 || arg2.field1102 != null) {
            class88 var34 = new class88(arg1);
            var34.field1237 = var12;
            var34.field1249 = var21;
            var34.field1235 = var19;
            var34.field1242 = var14;
            var34.field1241 = var20;
            var34.field1240 = var22;
            var34.field1247 = var11;
            var34.field1244 = var13;
            class135.field1887.method766(var34, arg4 + 16024);
        }
        return false;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)B", line = 273)
    public static final byte method2396(int arg0, int arg1, int arg2) {
        field5456++;
        if (arg1 >= -112) {
            method2393(-125, 40, -98, (class421) null, (class421) null);
        }
        if (arg0 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
