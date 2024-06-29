import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class204 {

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public int field4021;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public int field4015;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public int field4025;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public int field4018;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "Lea;")
    private static class38 field4022 = class9.method46((byte) 117, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "Lea;")
    public static class38 field4019 = class9.method46((byte) 102, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "Lea;")
    private static class38 field4017 = class9.method46((byte) 105, "wishes to duel with you)3");

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Lea;")
    public static class38 field4020 = field4022;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "Lea;")
    public static class38 field4014 = field4017;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "Lea;")
    public static class38 field4016 = class9.method46((byte) 101, "::");

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "J")
    public static long field4023 = 0L;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static void method1336(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field4016 = null;
        field4020 = null;
        field4019 = null;
        field4014 = null;
        field4022 = null;
        field4017 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ldd;II)Z")
    public static final boolean method1337(class32 arg0, int arg1, int arg2) {
        field4024++;
        byte[] var3 = arg0.method195(arg2, (byte) 94);
        if (var3 == null) {
            return false;
        } else {
            class126.method936(false, var3);
            return arg1 > 55;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
    public class204() {
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lwg;)V")
    public class204(class204 arg0) {
        this.field4021 = arg0.field4021;
        this.field4015 = arg0.field4015;
        this.field4025 = arg0.field4025;
        this.field4018 = arg0.field4018;
    }
}
