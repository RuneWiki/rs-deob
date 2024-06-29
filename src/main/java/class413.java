import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class413 {

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "Z")
    public static boolean field6206 = false;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "[S")
    private static short[] field6208 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "[S")
    private static short[] field6207 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "[S")
    private static short[] field6209 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field6211 = 0;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "[[S")
    public static short[][] field6205 = new short[][] { field6209, field6207, field6208 };

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "Lef;")
    public static class489 field6213 = new class489();

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field6210;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)V", line = 21)
    public static final void method2619(int arg0, byte arg1) {
        if (class201.field3016 == null || arg0 > class201.field3016.length) {
            class201.field3016 = new int[arg0];
        }
        int var2 = -99 / ((arg1 - 73) / 50);
        field6214++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 36)
    public static void method2620(int arg0) {
        field6213 = null;
        field6210 = null;
        field6208 = null;
        field6207 = null;
        field6205 = null;
        field6209 = null;
        if (arg0 != 20796) {
            method2621(41, null);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILjava/lang/String;)V", line = 54)
    public static final void method2621(int arg0, String arg1) {
        if (arg0 != -1) {
            return;
        }
        field6204++;
        if (arg1.equals("")) {
            return;
        }
        class466.field6825++;
        class468 var2 = class93.method734(class29.field284, class346.field4997, 8174);
        var2.field6839.method3730(arg0 + 127, class574.method3322(arg1, arg0 ^ 0xFFFFC000));
        var2.field6839.method3692(119, arg1);
        class120.method872((byte) -76, var2);
    }
}
