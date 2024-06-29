import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class62 {

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "[I")
    public static int[] field1330 = new int[32];

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "Lsg;")
    public static class30 field1335 = class167.method1221((byte) 33, "::errortest");

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "Lsg;")
    public static class30 field1332 = class167.method1221((byte) 33, "<col=ff3000>");

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "[I")
    public static int[] field1326 = new int[] { 4, 4, 1, 2, 6, 4, 2, 50, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field1334 = 0;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "Lmc;")
    public static class151 field1333;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "[I")
    public static int[] field1329;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BII)I")
    public static final int method560(byte arg0, int arg1, int arg2) {
        if (arg0 != 4) {
            method561(-93);
        }
        int var3 = (class48.method471(arg1 + 45365, 4, (byte) -97, arg2 + 91923) + (class48.method471(arg1 + 10294, 2, (byte) -32, arg2 + 37821) - 128 >> 1) + (class48.method471(arg1, 1, (byte) -32, arg2) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        field1328++;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static void method561(int arg0) {
        field1326 = null;
        if (arg0 != 12642) {
            field1326 = null;
        }
        field1332 = null;
        field1329 = null;
        field1333 = null;
        field1330 = null;
        field1335 = null;
    }
}
