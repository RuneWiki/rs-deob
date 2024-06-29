import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class508 implements class666 {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Ljava/lang/String;")
    private String field6981;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "Lgga;")
    private class513 field6983;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Lsv;")
    public static class570 field6982 = new class570(37, 1);

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Z")
    public static boolean field6986 = false;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field6980;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field6984;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    public static void method2969(int arg0) {
        field6982 = null;
        if (arg0 != -11922) {
            method2969(113);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)I")
    public final int method843(int arg0) {
        field6985++;
        if (this.field6983.method3010((byte) 126, this.field6981)) {
            return 100;
        } else {
            if (arg0 != 25894) {
                method2971(false);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIZIIB)V")
    public static final void method2970(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5) {
        field6979++;
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (arg1 < 1) {
            arg1 = 1;
        }
        int var6 = arg4 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class303.field4353 - class677.field9526) * var6 / 100 + class677.field9526;
        if (var7 < class288.field4215) {
            var7 = class288.field4215;
        } else if (class261.field3703 < var7) {
            var7 = class261.field3703;
        }
        int var8 = var7 * 512 * arg4 / (arg1 * 334);
        if (class116.field1992 > var8) {
            short var12 = class116.field1992;
            var7 = arg1 * var12 * 334 / (arg4 * 512);
            if (var7 > class261.field3703) {
                var7 = class261.field3703;
                int var13 = arg4 * var7 * 512 / (var12 * 334);
                int var14 = (arg1 - var13) / 2;
                if (arg2) {
                    class686.field9702.method512();
                    class686.field9702.method2765(arg3, arg4, 120, -16777216, arg0, var14);
                    class686.field9702.method2765(arg3, arg4, 106, -16777216, arg0 + arg1 - var14, var14);
                }
                arg1 -= var14 * 2;
                arg0 += var14;
            }
        } else if (class774.field10660 < var8) {
            short var9 = class774.field10660;
            var7 = var9 * 334 * arg1 / (arg4 * 512);
            if (var7 < class288.field4215) {
                var7 = class288.field4215;
                int var10 = arg1 * 334 * var9 / (var7 * 512);
                int var11 = (arg4 - var10) / 2;
                if (arg2) {
                    class686.field9702.method512();
                    class686.field9702.method2765(arg3, var11, 89, -16777216, arg0, arg1);
                    class686.field9702.method2765(arg3 + arg4 - var11, var11, 124, -16777216, arg0, arg1);
                }
                arg4 -= var11 * 2;
                arg3 += var11;
            }
        }
        class446.field6162 = arg4 * var7 / 334;
        class575.field8295 = arg3;
        class580.field8358 = (short) arg4;
        class286.field4206 = (short) arg1;
        int var15 = -10 % ((11 - arg5) / 57);
        class94.field1351 = arg0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)[Lin;")
    public static final class380[] method2971(boolean arg0) {
        if (arg0) {
            method2969(-83);
        }
        field6984++;
        return new class380[] { class785.field10757, class205.field3009, class193.field2895, class458.field6264, class443.field6137, class81.field1199, class47.field634, class561.field7764, class48.field673, class659.field9290, class653.field9245, class752.field10462, class228.field3317, class605.field8589, class645.field9173, class643.field9152, class216.field3149, class2.field42, class83.field1257, class409.field5611, class407.field5604, class30.field335, class527.field7365, class494.field6781, class413.field5673, class687.field9716, class143.field2331, class596.field8516, class695.field9787, class218.field3182, class164.field2516, class24.field270, class198.field2986, class250.field3587, class17.field182, class27.field287, class521.field7304, class307.field4385, class631.field8940, class560.field7759, class667.field9380, class351.field4976, class347.field4936, class419.field5806, class356.field5059, class425.field5905, class721.field10070, class782.field10718, class265.field3742, class168.field2553, class582.field8377, class651.field9220, class792.field10849, class136.field2260, class584.field8399, class482.field6617, class621.field8771, class466.field6346, class316.field4519, class30.field327, class163.field2504, class286.field4203, class697.field9794, class95.field1353, class542.field7496, class389.field5433, class109.field1552, class769.field10611, class262.field3707, class745.field10362, class458.field6266, class4.field51, class350.field4962, class714.field9965, class253.field3631, class125.field2143, class607.field8631, class115.field1973, class235.field3406, class507.field6976, class87.field1293, class370.field5220, class494.field6770, class582.field8372, class473.field6428, class713.field9954, class706.field9894, class427.field5924, class36.field431, class459.field6270, class455.field6219, class501.field6876, class330.field4704, class482.field6619, class272.field3818, class668.field9389, class137.field2274, class143.field2324, class113.field1625, class350.field4964, class276.field3963, class158.field2465, class595.field8499, class518.field7121, class737.field10221, class453.field6203, class713.field9949, class76.field1152, class768.field10603, class264.field3727, class141.field2308, class182.field2766, class13.field161, class479.field6587, class506.field6942, class548.field7588, class185.field2806, class710.field9931, class611.field8671, class645.field9170, class433.field6041, class591.field8477, class237.field3425, class667.field9382, class122.field2071, class745.field10353, class645.field9172, class675.field9444, class765.field10579, class392.field5451, class599.field8545, class188.field2838, class573.field8129 };
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Lpw;")
    public final class104 method842(byte arg0) {
        if (arg0 != -49) {
            this.field6983 = null;
        }
        field6980++;
        return class104.field1511;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lgga;Ljava/lang/String;)V")
    public class508(class513 arg0, String arg1) {
        this.field6981 = arg1;
        this.field6983 = arg0;
    }
}
