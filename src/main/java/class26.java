import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class26 {

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public int field452;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "Lff;")
    public static class9 field447 = new class9(44, 12);

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "Ljb;")
    public static class340 field449;

    @OriginalMember(owner = "client!wv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field451++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
    public static void method223(int arg0) {
        if (arg0 != 12) {
            field449 = null;
        }
        field447 = null;
        field449 = null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIIII)V")
    public static final void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 79 % ((arg0 + 19) / 47);
        field453++;
        if (class308.field4055 <= arg1 - arg3 && class71.field1077 >= (arg1 + arg3) && (arg6 - arg3) >= class353.field4777 && arg6 + arg3 <= class300.field3971) {
            class426.method2457(false, arg1, arg5, arg4, arg6, arg3, arg2);
        } else {
            class360.method2101(arg3, arg1, 117, arg5, arg4, arg6, arg2);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Z)V")
    public static final void method225(boolean arg0) {
        class212.method1341((byte) -41);
        field450++;
        class88.method641((byte) 115);
        if (!arg0) {
            method223(86);
        }
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)V")
    public static final void method226(int arg0) {
        class236 var1 = class388.field5270;
        synchronized (class388.field5270) {
            class388.field5270.method1458((byte) 127);
        }
        field448++;
        if (arg0 != 12) {
            field449 = null;
        }
        class236 var2 = class165.field2408;
        synchronized (class165.field2408) {
            class165.field2408.method1458((byte) 66);
        }
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class26(String arg0, int arg1) {
        this.field452 = arg1;
    }
}
