import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class206 {

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "Z")
    public boolean field4054 = true;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public int field4055;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public int field4057;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public int field4050;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public int field4053;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public int field4046;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public int field4049;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field4051 = 0;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field4056 = 0;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Lpa;")
    public static class136 field4058 = new class136(200);

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "Leh;")
    private static class47 field4059 = class195.method1282((byte) -4, "Connecting to update server");

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "Leh;")
    private static class47 field4061 = class195.method1282((byte) -4, "Error connecting to server)3");

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "Leh;")
    public static class47 field4062 = field4059;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "Leh;")
    public static class47 field4060 = field4061;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "Lfd;")
    public static class52 field4048;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static void method1353(int arg0) {
        if (arg0 != 9073) {
            field4059 = null;
        }
        field4048 = null;
        field4060 = null;
        field4062 = null;
        field4058 = null;
        field4061 = null;
        field4059 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Leh;")
    public static final class47 method1354(int arg0, int arg1) {
        field4047++;
        if (arg1 != 0) {
            field4058 = null;
        }
        return class5.method24(new class47[] { class167.method1133(arg0 >> 24 & 0xFF, (byte) 66), class165.field3215, class167.method1133(arg0 >> 16 & 0xFF, (byte) -109), class165.field3215, class167.method1133(arg0 >> 8 & 0xFF, (byte) 25), class165.field3215, class167.method1133(arg0 & 0xFF, (byte) -108) }, (byte) 63);
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field4055 = arg3;
        this.field4057 = arg1;
        this.field4050 = arg4;
        this.field4053 = arg0;
        this.field4046 = arg5;
        this.field4054 = arg6;
        this.field4049 = arg2;
    }
}
