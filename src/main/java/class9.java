import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class9 {

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field195 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field196 = 0;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "Lmh;")
    private static class128 field198 = class22.method156(126, "Starting 3d Library");

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "Lmh;")
    public static class128 field199 = class22.method156(123, "Loading world list data");

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "Lmh;")
    public static class128 field206 = field198;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field203 = 0;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "[I")
    public static int[] field202;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "[Z")
    public static boolean[] field201;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "[[[B")
    public static byte[][][] field205;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)Lal;", line = 13)
    public static final class309 method70(int arg0) {
        field204++;
        if (arg0 > -114) {
            field199 = (class128) null;
        }
        try {
            return (class309) Class.forName("od").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lb;IIIIIIIZ)V", line = 34)
    public static final void method71(class56 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class260.field4501;
        int var11;
        int var12 = var11 = (arg7 << 7) - class156.field2682;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class250.field4334[arg1][arg6][arg7] - class166.field2847;
        int var18 = class250.field4334[arg1][arg6 + 1][arg7] - class166.field2847;
        int var19 = class250.field4334[arg1][arg6 + 1][arg7 + 1] - class166.field2847;
        int var20 = class250.field4334[arg1][arg6][arg7 + 1] - class166.field2847;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class141.field2415;
        int var46 = (var24 << 9) / var25 + class141.field2422;
        int var47 = (var27 << 9) / var31 + class141.field2415;
        int var48 = (var30 << 9) / var31 + class141.field2422;
        int var49 = (var33 << 9) / var37 + class141.field2415;
        int var50 = (var36 << 9) / var37 + class141.field2422;
        int var51 = (var39 << 9) / var43 + class141.field2415;
        int var52 = (var42 << 9) / var43 + class141.field2422;
        class141.field2410 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class173.field3065 && class223.method1538(class30.field667 + class141.field2415, class77.field1418 + class141.field2422, var50, var52, var48, var49, var51, var47)) {
                class204.field3604 = arg6;
                class260.field4511 = arg7;
            }
            if (!class247.field4247 && !arg8) {
                class141.field2420 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class141.field2416 || var51 > class141.field2416 || var47 > class141.field2416) {
                    class141.field2420 = true;
                }
                if (arg0.field1075 == -1) {
                    if (arg0.field1068 != 12345678) {
                        class141.method926(var50, var52, var48, var49, var51, var47, arg0.field1068, arg0.field1081, arg0.field1076);
                    }
                } else if (!class121.field2039) {
                    int var53 = class141.field2419.method97(arg0.field1075, 0);
                    class141.method926(var50, var52, var48, var49, var51, var47, class314.method2141(var53, arg0.field1068), class314.method2141(var53, arg0.field1081), class314.method2141(var53, arg0.field1076));
                } else if (arg0.field1067) {
                    class141.method928(var50, var52, var48, var49, var51, var47, arg0.field1068, arg0.field1081, arg0.field1076, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1075);
                } else {
                    class141.method928(var50, var52, var48, var49, var51, var47, arg0.field1068, arg0.field1081, arg0.field1076, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field1075);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class173.field3065 && class223.method1538(class30.field667 + class141.field2415, class77.field1418 + class141.field2422, var46, var48, var52, var45, var47, var51)) {
            class204.field3604 = arg6;
            class260.field4511 = arg7;
        }
        if (class247.field4247 || arg8) {
            return;
        }
        class141.field2420 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class141.field2416 || var47 > class141.field2416 || var51 > class141.field2416) {
            class141.field2420 = true;
        }
        if (arg0.field1075 == -1) {
            if (arg0.field1082 != 12345678) {
                class141.method926(var46, var48, var52, var45, var47, var51, arg0.field1082, arg0.field1076, arg0.field1081);
            }
        } else if (class121.field2039) {
            class141.method928(var46, var48, var52, var45, var47, var51, arg0.field1082, arg0.field1076, arg0.field1081, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1075);
        } else {
            int var54 = class141.field2419.method97(arg0.field1075, 0);
            class141.method926(var46, var48, var52, var45, var47, var51, class314.method2141(var54, arg0.field1082), class314.method2141(var54, arg0.field1076), class314.method2141(var54, arg0.field1081));
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)Lrl;", line = 202)
    public static final class185 method72(byte arg0, int arg1) {
        field200++;
        class185 var2 = (class185) class289.field4952.method1443((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class180.field3155.method2155(arg1, 26, (byte) 70);
        class185 var4 = new class185();
        if (var3 != null) {
            var4.method1251(new class194(var3), (byte) -108);
        }
        class289.field4952.method1442(-1, (long) arg1, var4);
        int var5 = 85 % ((13 - arg0) / 34);
        return var4;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V", line = 227)
    public static void method73(byte arg0) {
        field201 = null;
        field195 = null;
        field206 = null;
        if (arg0 >= 105) {
            field202 = null;
            field199 = null;
            field198 = null;
            field205 = (byte[][][]) null;
        }
    }
}
