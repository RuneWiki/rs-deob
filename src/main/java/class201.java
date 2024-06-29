import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class201 extends class67 {

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "Led;")
    private static class43 field3942 = class191.method1219("Loading )2 please wait)3", false);

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public static int field3944 = 0;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "Led;")
    public static class43 field3951 = field3942;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "Ltd;")
    public static class176 field3945 = new class176(64);

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "Led;")
    public static class43 field3956 = class191.method1219("", false);

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public int field3943;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "Lf;")
    public class48 field3953;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "Lig;")
    public class80 field3946;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "[B")
    public byte[] field3949;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "[[[B")
    public static byte[][][] field3955;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZILob;I)V")
    public static final void method1308(boolean arg0, int arg1, class129 arg2, int arg3) {
        field3952++;
        if (class148.field3021 != null || class186.field3665 || (arg2 == null || class47.method292(arg2, 5) == null)) {
            return;
        }
        class148.field3021 = arg2;
        class159.field3211 = class47.method292(arg2, 5);
        class191.field3727 = arg3;
        class33.field617 = 0;
        class95.field1850 = arg0;
        class108.field2084 = arg1;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
    public static void method1309(int arg0) {
        if (arg0 > -20) {
            field3956 = null;
        }
        field3945 = null;
        field3956 = null;
        field3955 = null;
        field3951 = null;
        field3942 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIILga;)Ltg;")
    public static final class179 method1310(int arg0, int arg1, int arg2, class58 arg3) {
        if (arg0 >= 0) {
            return null;
        } else {
            field3948++;
            return class184.method1185(arg1, arg2, 115, arg3) ? class101.method623((byte) 64) : null;
        }
    }
}
