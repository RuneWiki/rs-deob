import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class class206 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Lpg;")
    public static class735 field2728;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Z")
    public static boolean field2729;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(JI)I", line = 5)
    public final int method1329(long arg0, int arg1) {
        if (arg1 < 96) {
            return -109;
        }
        field2730++;
        long var4 = this.method68(-93);
        if (var4 > 0L) {
            class149.method1052(var4, true);
        }
        return this.method71(arg0, 0);
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V", line = 28)
    public static void method1330(int arg0) {
        field2728 = null;
        if (arg0 != 0) {
            method1331((byte) 109);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V", line = 39)
    public static final void method1331(byte arg0) {
        field2727++;
        class687.field9574.method3064(false);
        class60.field844.method3064(false);
        class272.field3411.method3064(false);
        class327.field4192.method3064(false);
        if (arg0 >= -68) {
            method1330(-67);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)J")
    public abstract long method68(int arg0);

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(JI)I")
    public abstract int method71(long arg0, int arg1);

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public abstract void method69(int arg0);

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)J")
    public abstract long method70(int arg0);
}
