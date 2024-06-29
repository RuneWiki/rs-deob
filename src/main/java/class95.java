import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class95 {

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "Lvd;")
    public static class222 field1783 = class212.method1357("RuneScape wird geladen )2 bitte warten)3)3)3", 10731);

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field1781 = 0;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public int field1777;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public int field1778;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public int field1784;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public int field1787;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public int field1788;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public int field1789;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public int field1790;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "[B")
    public byte[] field1785;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "[B")
    public byte[] field1786;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
    public static void method605(byte arg0) {
        field1783 = null;
        if (arg0 < 109) {
            method606(43, -29, 9, 21);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)V")
    public static final void method606(int arg0, int arg1, int arg2, int arg3) {
        field1780++;
        if (arg3 != -32077) {
            field1779 = -98;
        }
        class13 var4 = class197.method1215(arg2, arg1, -118);
        if (var4 != null && var4.field357 != null) {
            class191 var5 = new class191();
            var5.field3521 = var4;
            var5.field3510 = var4.field357;
            class52.method373(-32560, var5);
        }
        class125.field2389 = arg1;
        class16.field423 = arg2;
        class22.field522 = arg0;
        class79.field1522 = true;
        class80.method527(var4, 31702);
    }
}
