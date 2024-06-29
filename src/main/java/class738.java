import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class738 extends class111 {

    @OriginalMember(owner = "client!ega", name = "s", descriptor = "[I")
    public static int[] field10012 = new int[2048];

    @OriginalMember(owner = "client!ega", name = "r", descriptor = "Lqj;")
    public static class535 field10011 = new class535(128, 4);

    @OriginalMember(owner = "client!ega", name = "w", descriptor = "Lmw;")
    public static class517 field10016 = new class517(67, -1);

    @OriginalMember(owner = "client!ega", name = "q", descriptor = "I")
    public static int field10010;

    @OriginalMember(owner = "client!ega", name = "t", descriptor = "I")
    public static int field10013;

    @OriginalMember(owner = "client!ega", name = "u", descriptor = "I")
    public static int field10014;

    @OriginalMember(owner = "client!ega", name = "v", descriptor = "I")
    public static int field10015;

    @OriginalMember(owner = "client!ega", name = "x", descriptor = "Lvf;")
    public static class162 field10017;

    @OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class738(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ltd;B)V")
    public static final void method4068(class478 arg0, byte arg1) {
        field10010++;
        if (arg1 != -15) {
            method4068(null, (byte) 67);
        }
        if (arg0 == null) {
            return;
        }
        class645.field8695.method689(arg0, 118);
        class269.field3929++;
        Object var2 = null;
        class641 var5;
        if (arg0.field6709 || "".equals(arg0.field6720)) {
            var5 = new class641(arg0.field6720);
            class382.field5558++;
        } else {
            long var3 = arg0.field6708;
            for (var5 = (class641) class533.field7395.method1248(arg1 ^ 0xFFFFFF82, var3); var5 != null && !var5.field8635.equals(arg0.field6720); var5 = (class641) class533.field7395.method1243(94)) {
            }
            if (var5 == null) {
                var5 = (class641) class497.field6990.method3109((byte) 109, var3);
                if (var5 != null && !var5.field8635.equals(arg0.field6720)) {
                    var5 = null;
                }
                if (var5 == null) {
                    var5 = new class641(arg0.field6720);
                }
                class533.field7395.method1247(4070, var3, var5);
                class382.field5558++;
            }
        }
        if (var5.method3532((byte) -59, arg0)) {
            class368.method2306(var5, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(II)V")
    public static final void method4069(int arg0, int arg1) {
        field10015++;
        class213.field2800 = -1;
        if (arg0 < -35) {
            class81.field1129 = arg1;
            class213.field2800 = -1;
            class642.method3536(1);
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V")
    public final void method646(OggPacket arg0, byte arg1) {
        field10014++;
        if (arg1 != -23) {
            field10016 = null;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(B)V")
    public static void method4070(byte arg0) {
        int var1 = 35 % ((60 - arg0) / 62);
        field10012 = null;
        field10016 = null;
        field10017 = null;
        field10011 = null;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V")
    public final void method643(int arg0) {
        field10013++;
        if (arg0 != -1) {
            field10016 = null;
        }
    }
}
