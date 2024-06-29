import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class557 {

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!iba", name = "e", descriptor = "I")
    public static int field7858;

    @OriginalMember(owner = "client!iba", name = "i", descriptor = "I")
    public static int field7862;

    @OriginalMember(owner = "client!iba", name = "h", descriptor = "Lda;")
    public static class67 field7861;

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "[B")
    public byte[] field7855;

    @OriginalMember(owner = "client!iba", name = "g", descriptor = "[Lia;")
    public static class616[] field7860;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "[S")
    public short[] field7854;

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "[S")
    public short[] field7856;

    @OriginalMember(owner = "client!iba", name = "f", descriptor = "[S")
    public short[] field7859;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(II)V")
    public static final void method3202(int arg0, int arg1) {
        class439.field5965 = arg0;
        class428.field5845 = arg1;
        class299.field4116 = 100;
        field7857++;
        class769.field10607 = -1;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lwaa;ZILwaa;Z)I")
    public static final int method3203(class732 arg0, boolean arg1, int arg2, class732 arg3, boolean arg4) {
        if (arg4) {
            method3203(null, true, 94, null, true);
        }
        field7862++;
        if (arg2 == 1) {
            int var5 = arg0.field5326;
            int var6 = arg3.field5326;
            if (!arg1) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg2 == 2) {
            return class630.method3539(false, arg0.method4066(-127).field10800, arg3.method4066(-124).field10800, class464.field6309);
        } else if (arg2 == 3) {
            if (arg0.field10095.equals("-")) {
                if (arg3.field10095.equals("-")) {
                    return 0;
                } else if (arg1) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field10095.equals("-")) {
                return arg1 ? 1 : -1;
            } else {
                return class630.method3539(false, arg0.field10095, arg3.field10095, class464.field6309);
            }
        } else if (arg2 == 4) {
            if (arg0.method2355(114)) {
                return arg3.method2355(81) ? 0 : 1;
            } else if (arg3.method2355(107)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 5) {
            if (arg0.method2357(512)) {
                return arg3.method2357(512) ? 0 : 1;
            } else if (arg3.method2357(512)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 6) {
            if (arg0.method2354((byte) -45)) {
                return arg3.method2354((byte) -63) ? 0 : 1;
            } else if (arg3.method2354((byte) -70)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 7) {
            if (arg0.method2356(21807)) {
                return arg3.method2356(21807) ? 0 : 1;
            } else if (arg3.method2356(21807)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 8) {
            int var7 = arg0.field10097;
            int var8 = arg3.field10097;
            if (arg1) {
                if (var7 == 1000) {
                    var7 = -1;
                }
                if (var8 == 1000) {
                    var8 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg0.field10096 - arg3.field10096;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V")
    public static void method3204(int arg0) {
        field7860 = null;
        field7861 = null;
        if (arg0 <= 55) {
            field7861 = null;
        }
    }
}
