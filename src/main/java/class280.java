import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wja")
public abstract class class280 {

    @OriginalMember(owner = "client!wja", name = "c", descriptor = "I")
    public static int field4069 = 0;

    @OriginalMember(owner = "client!wja", name = "e", descriptor = "Lwn;")
    public static class753 field4071 = null;

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!wja", name = "b", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!wja", name = "f", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!wja", name = "d", descriptor = "Lwia;")
    public static class791 field4070;

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(B)V", line = 4)
    public static void method1819(byte arg0) {
        if (arg0 != -120) {
            method1819((byte) -36);
        }
        field4071 = null;
        field4070 = null;
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(IJ)I", line = 20)
    public final int method1820(int arg0, long arg1) {
        field4067++;
        if (arg0 >= -118) {
            return -109;
        }
        long var4 = this.method1521((byte) 121);
        if (var4 > 0L) {
            class107.method828(var4, (byte) 88);
        }
        return this.method1522(-37, arg1);
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(I)V")
    public abstract void method1519(int arg0);

    @OriginalMember(owner = "client!wja", name = "b", descriptor = "(I)J")
    public abstract long method1520(int arg0);

    @OriginalMember(owner = "client!wja", name = "b", descriptor = "(IJ)I")
    public abstract int method1522(int arg0, long arg1);

    @OriginalMember(owner = "client!wja", name = "b", descriptor = "(B)J")
    public abstract long method1521(byte arg0);
}
