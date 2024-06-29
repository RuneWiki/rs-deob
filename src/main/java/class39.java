import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class39 implements class318 {

    @OriginalMember(owner = "client!aea", name = "k", descriptor = "Ldba;")
    public class240 field400;

    @OriginalMember(owner = "client!aea", name = "h", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "client!aea", name = "l", descriptor = "Lpa;")
    public class648 field401;

    @OriginalMember(owner = "client!aea", name = "m", descriptor = "I")
    public int field402;

    @OriginalMember(owner = "client!aea", name = "i", descriptor = "[I")
    public static int[] field398 = new int[32];

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!aea", name = "g", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!aea", name = "j", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "Lcv;")
    public static class632 field394;

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "Llw;")
    public static class674 field395;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IBI)Z", line = 5)
    public static final boolean method200(int arg0, byte arg1, int arg2) {
        field393++;
        int var3 = 60 / ((arg1 - 18) / 48);
        return (arg0 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IZ)I", line = 17)
    public static final int method201(int arg0, boolean arg1) {
        field391++;
        return arg1 ? -85 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)V", line = 28)
    public static final void method202(int arg0) {
        if (arg0 != -114238164) {
            method200(-93, (byte) 41, 29);
        }
        if (class271.field3377 != null) {
            class271.field3377.method3203(5);
            class446.field6295 = null;
            class271.field3377 = null;
        }
        field390++;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)Lib;", line = 48)
    public class14 method203(byte arg0) {
        if (arg0 == -92) {
            field396++;
            return class192.field2221;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(I)V", line = 60)
    public static void method204(int arg0) {
        field395 = null;
        field394 = null;
        if (arg0 > 2) {
            field398 = null;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIII)V", line = 74)
    public static final void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field399++;
        int var6 = arg2 - arg3;
        int var7 = arg4 - arg5;
        if (var6 == 0) {
            if (var7 != 0) {
                class444.method2573(-105, arg5, arg1, arg3, arg4);
            }
        } else if (var7 == 0) {
            class123.method709(arg3, arg5, arg1, true, arg2);
        } else {
            if (arg0 >= -36) {
                field394 = null;
            }
            int var8 = (var7 << 12) / var6;
            int var9 = arg5 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (class412.field5526 > arg2) {
                var10 = class412.field5526;
                var11 = (class412.field5526 * var8 >> 12) + var9;
            } else if (class72.field740 < arg2) {
                var10 = class72.field740;
                var11 = var9 + (class72.field740 * var8 >> 12);
            } else {
                var10 = arg2;
                var11 = arg4;
            }
            int var12;
            int var13;
            if (class412.field5526 > arg3) {
                var13 = var9 + (class412.field5526 * var8 >> 12);
                var12 = class412.field5526;
            } else if (class72.field740 >= arg3) {
                var12 = arg3;
                var13 = arg5;
            } else {
                var13 = var9 + (class72.field740 * var8 >> 12);
                var12 = class72.field740;
            }
            if (var13 < class93.field949) {
                var12 = (class93.field949 - var9 << 12) / var8;
                var13 = class93.field949;
            } else if (class360.field4834 < var13) {
                var12 = (class360.field4834 - var9 << 12) / var8;
                var13 = class360.field4834;
            }
            if (class93.field949 > var11) {
                var10 = (class93.field949 - var9 << 12) / var8;
                var11 = class93.field949;
            } else if (var11 > class360.field4834) {
                var11 = class360.field4834;
                var10 = (class360.field4834 - var9 << 12) / var8;
            }
            class646.method3617(arg1, var11, (byte) -92, var13, var12, var10);
        }
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(ILdba;Lpa;II)V", line = 184)
    public class39(int arg0, class240 arg1, class648 arg2, int arg3, int arg4) {
        this.field400 = arg1;
        this.field397 = arg0;
        this.field392 = arg4;
        this.field401 = arg2;
        this.field402 = arg3;
    }
}
