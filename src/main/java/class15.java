import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class15 extends class41 {

    @OriginalMember(owner = "client!c", name = "x", descriptor = "[B")
    public byte[] field354;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "Lu;")
    public static class135 field357 = class87.method676((byte) -114, "Texturen geladen)3");

    @OriginalMember(owner = "client!c", name = "I", descriptor = "Lu;")
    private static class135 field364 = class87.method676((byte) -48, "You have only just left another world)3");

    @OriginalMember(owner = "client!c", name = "y", descriptor = "Lu;")
    public static class135 field355 = field364;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "Lu;")
    private static class135 field363 = class87.method676((byte) -39, "Unexpected server response");

    @OriginalMember(owner = "client!c", name = "J", descriptor = "I")
    public static int field365 = -1;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "Lu;")
    public static class135 field356 = field363;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "Lpd;")
    public static class108 field360;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "Lpe;")
    public static class109 field352;

    @OriginalMember(owner = "client!c", name = "B", descriptor = "Lg;")
    public static class43 field358;

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "([B)V")
    public class15(byte[] arg0) {
        this.field354 = arg0;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
    public static void method98(byte arg0) {
        if (arg0 <= 2) {
            field358 = null;
        }
        field356 = null;
        field358 = null;
        field352 = null;
        field363 = null;
        field364 = null;
        field355 = null;
        field360 = null;
        field357 = null;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)I")
    public static final int method99(int arg0) {
        if (arg0 > -74) {
            return 9;
        } else {
            field361++;
            return class56.field1358++;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public static final void method100(boolean arg0) {
        field362++;
        if (!arg0) {
            class50.field1196 = null;
            class43.field1051 = null;
            class29.field700 = null;
        }
    }
}
