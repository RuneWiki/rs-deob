import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class175 extends class370 {

    @OriginalMember(owner = "client!hga", name = "p", descriptor = "I")
    public static int field2642 = 2;

    @OriginalMember(owner = "client!hga", name = "r", descriptor = "Lii;")
    public static class554 field2644 = new class554();

    @OriginalMember(owner = "client!hga", name = "o", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!hga", name = "q", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!hga", name = "s", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!hga", name = "t", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!hga", name = "u", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!hga", name = "v", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "(Z)V", line = 6)
    public static void method1223(boolean arg0) {
        field2644 = null;
        if (arg0) {
            field2644 = null;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 20)
    public static final void method1224(String arg0, int arg1) {
        field2646++;
        class583 var2 = class277.method1668(arg1);
        var2.field7637.method3823(-30, class86.field1051.field4660);
        var2.field7637.method3831(1182, 0);
        int var3 = var2.field7637.field9419;
        var2.field7637.method3831(arg1 + 1182, 640);
        int[] var4 = class48.method341((byte) -103, var2);
        int var5 = var2.field7637.field9419;
        var2.field7637.method3795(arg0, (byte) -111);
        var2.field7637.method3823(-24, class713.field9854);
        var2.field7637.field9419 += 7;
        var2.field7637.method3796(var4, var2.field7637.field9419, (byte) 112, var5);
        var2.field7637.method3818(var2.field7637.field9419 - var3, arg1 + -2);
        class42.method309(var2, 0);
        class704.field9766 = arg1;
        class31.field489 = -3;
        class594.field7712 = 1;
        class763.field10628 = 0;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;Z)V", line = 51)
    public final void method1225(OggPacket arg0, boolean arg1) {
        field2648++;
        if (arg1) {
            field2642 = -122;
        }
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 62)
    public class175(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(B)V", line = 69)
    public final void method1226(byte arg0) {
        if (arg0 >= -81) {
            field2644 = null;
        }
        field2643++;
    }
}
