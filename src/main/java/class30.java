import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class30 {

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "I")
    public int field360;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "Lkr;")
    public static class602 field357 = new class602(103, -1);

    @OriginalMember(owner = "client!mga", name = "e", descriptor = "Z")
    public static boolean field361 = false;

    @OriginalMember(owner = "client!mga", name = "f", descriptor = "D")
    public static double field362;

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!mga", name = "g", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!mga", name = "h", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method163(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class291.field4181 <= arg1 && arg1 <= class262.field3848) {
            int var5 = class41.method223(true, class726.field10064, class607.field8185, arg0);
            int var6 = class41.method223(true, class726.field10064, class607.field8185, arg3);
            class299.method1975(arg1, var5, arg2, var6, -121);
        }
        field363++;
        if (arg4 != -1) {
            method165(-121);
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)V", line = 24)
    public static final void method164(int arg0) {
        if (arg0 >= -20) {
            field357 = null;
        }
        field358++;
        class202.field2680 = true;
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)V", line = 37)
    public static void method165(int arg0) {
        field357 = null;
        int var1 = 113 % ((-arg0 - 40) / 45);
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", line = 48)
    public class30(String arg0, String arg1, String arg2, int arg3) {
        this.field360 = arg3;
    }

    @OriginalMember(owner = "client!mga", name = "toString", descriptor = "()Ljava/lang/String;", line = 62)
    public final String toString() {
        field359++;
        throw new IllegalStateException();
    }
}
