import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class522 {

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public int field7588;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public int field7591;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "Lgl;")
    public class522 field7587;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "Lq;")
    public class364 field7590;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Lig;")
    public static class206 field7586 = new class206(13, -1);

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "Lea;")
    public static class474 field7598 = new class474("K", "T", "K", "K");

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public int field7593;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public int field7594;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public int field7595;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field7597;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lqf;B)Lqf;", line = 4)
    public static final class593 method3083(class593 arg0, byte arg1) {
        field7596++;
        class593 var2 = client.method1667(arg0);
        if (arg1 != 108) {
            field7598 = null;
        }
        if (var2 == null) {
            var2 = arg0.field8636;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IBI)Z", line = 27)
    public static final boolean method3084(int arg0, byte arg1, int arg2) {
        if (arg1 < 78) {
            method3084(82, (byte) 27, 90);
        }
        field7597++;
        return (arg0 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)Lem;", line = 39)
    public final class192 method3085(int arg0) {
        field7592++;
        if (arg0 != -1) {
            this.field7587 = null;
        }
        return class216.method1426((byte) -111, this.field7588);
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V", line = 50)
    public static void method3086(int arg0) {
        field7586 = null;
        field7598 = null;
        if (arg0 != 13) {
            field7598 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(II)V", line = 65)
    public class522(int arg0, int arg1) {
        this.field7588 = arg0;
        this.field7591 = arg1;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lgl;I)V", line = 75)
    public class522(class522 arg0, int arg1) {
        this.field7587 = arg0;
        this.field7591 = this.field7587.field7591 + arg1;
        this.field7590 = this.field7587.field7590;
        this.field7588 = this.field7587.field7588;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)Lgl;", line = 86)
    public final class522 method3087(int arg0, int arg1) {
        field7589++;
        if (arg0 < 29) {
            this.field7593 = 19;
        }
        return new class522(this.field7588, arg1);
    }
}
