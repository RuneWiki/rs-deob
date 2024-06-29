import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class144 extends class719 {

    @OriginalMember(owner = "client!bw", name = "s", descriptor = "Z")
    public static boolean field1990 = false;

    @OriginalMember(owner = "client!bw", name = "t", descriptor = "I")
    public static int field1991 = 0;

    @OriginalMember(owner = "client!bw", name = "x", descriptor = "[I")
    public static int[] field1995 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!bw", name = "q", descriptor = "Lqk;")
    public static class148 field1988 = new class148(13, 0);

    @OriginalMember(owner = "client!bw", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field1996 = new String[100];

    @OriginalMember(owner = "client!bw", name = "z", descriptor = "Lefa;")
    public static class528 field1997 = new class528();

    @OriginalMember(owner = "client!bw", name = "r", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!bw", name = "u", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!bw", name = "v", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!bw", name = "w", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V", line = 4)
    public final void method938(OggPacket arg0, byte arg1) {
        if (arg1 != -63) {
            method941(105);
        }
        field1989++;
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)V", line = 15)
    public static final void method939(int arg0) {
        class145.field2015++;
        field1992++;
        class120 var1 = class292.method1716(class608.field8668, true, class448.field6161);
        var1.field1653.method184(0, -45);
        class471.method2805(95, var1);
        if (arg0 < 72) {
            field1997 = null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V", line = 31)
    public final void method940(int arg0) {
        if (arg0 < 32) {
            field1988 = null;
        }
        field1993++;
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 46)
    public class144(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "(I)V", line = 50)
    public static void method941(int arg0) {
        field1995 = null;
        int var1 = 120 % ((arg0 + 25) / 53);
        field1996 = null;
        field1997 = null;
        field1988 = null;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IZ)V", line = 62)
    public static final void method942(int arg0, boolean arg1) {
        field1994++;
        class674.field9500.method2250((byte) 95, 0, class674.field9500.field5159);
        if (arg0 <= 4) {
            method939(119);
        }
        class674.field9500.method2250((byte) 110, 0, class674.field9500.field5113);
        class674.field9500.method2250((byte) 95, 1, class674.field9500.field5119);
        class674.field9500.method2250((byte) 82, 1, class674.field9500.field5122);
        class674.field9500.method2250((byte) 110, 0, class674.field9500.field5131);
        class674.field9500.method2250((byte) 100, 0, class674.field9500.field5163);
        class674.field9500.method2250((byte) 111, 0, class674.field9500.field5137);
        class674.field9500.method2250((byte) 121, 0, class674.field9500.field5154);
        class674.field9500.method2250((byte) 117, 0, class674.field9500.field5168);
        class674.field9500.method2250((byte) 90, 0, class674.field9500.field5151);
        class674.field9500.method2250((byte) 126, 0, class674.field9500.field5130);
        class674.field9500.method2250((byte) 111, 0, class674.field9500.field5162);
        class674.field9500.method2250((byte) 115, 0, class674.field9500.field5134);
        class674.field9500.method2250((byte) 123, 0, class674.field9500.field5143);
        class674.field9500.method2250((byte) 118, 0, class674.field9500.field5135);
        class674.field9500.method2250((byte) 120, 0, class674.field9500.field5155);
        class674.field9500.method2250((byte) 118, 0, class674.field9500.field5148);
        class674.field9500.method2250((byte) 83, 0, class674.field9500.field5120);
        class674.field9500.method2250((byte) 92, 0, class674.field9500.field5132);
        class163.method1017(false);
        class674.field9500.method2250((byte) 103, 2, class674.field9500.field5139);
        class674.field9500.method2250((byte) 106, 1, class674.field9500.field5117);
        class469.method2794(false);
        class507.method3027(-1);
        class295.field3852 = true;
    }
}
