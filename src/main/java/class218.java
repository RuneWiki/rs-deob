import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class218 {

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "Lgda;")
    public static class53 field2844 = new class53(83, 4);

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "Lct;")
    public static class144 field2849;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2845;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IB)I")
    public static final int method1336(int arg0, byte arg1) {
        field2847++;
        if (arg1 != -68) {
            method1340(null, true, 82);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I[FI)[F")
    public static final float[] method1337(int arg0, float[] arg1, int arg2) {
        int var3 = -105 % ((46 - arg0) / 61);
        field2848++;
        float[] var4 = new float[arg2];
        class255.method1689(arg1, 0, var4, 0, arg2);
        return var4;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIII)V")
    public static final void method1338(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2846++;
        if (arg4 != -8220) {
            return;
        }
        if (arg3 <= arg1) {
            for (int var5 = arg3; var5 < arg1; var5++) {
                class445.field6320[var5][arg0] = arg2;
            }
        } else {
            for (int var6 = arg1; var6 < arg3; var6++) {
                class445.field6320[var6][arg0] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
    public static void method1339(int arg0) {
        if (arg0 != 255) {
            field2844 = null;
        }
        field2849 = null;
        field2845 = null;
        field2844 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lct;ZI)V")
    public static final void method1340(class144 arg0, boolean arg1, int arg2) {
        if (arg1) {
            method1340(null, false, -107);
        }
        field2843++;
        if (class2.field16) {
            class2.field16 = false;
            arg2 = 0;
        }
        if (class97.field1170 != null && class97.field1170.method1004(arg0, (byte) 115)) {
            return;
        }
        class97.field1170 = arg0;
        class460.field6489 = class479.method2864((byte) -66);
        class332.field4622 = arg2;
        class526.field7426 = arg2;
        if (class526.field7426 == 0) {
            class661.method3625(5);
            return;
        }
        class506.field7247 = class196.field2614;
        class700.field9765 = class441.field6287;
        class647.field8902 = class279.field3943;
        class344.field4850 = class68.field838;
        class686.field9383 = class267.field3810;
        class314.field4352 = class428.field6109;
        class455.field6431 = class307.field4294;
        class448.field6361 = class544.field7589;
        class561.field7877 = class452.field6397;
        class421.field5930 = class567.field8047;
    }
}
