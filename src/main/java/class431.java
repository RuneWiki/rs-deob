import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class431 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Lol;")
    public static class187 field6327 = new class187("", 12);

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "[I")
    public static int[] field6338 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Lwj;")
    public static class270 field6334 = new class270(87, 1);

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "Lqp;")
    public static class466 field6339 = new class466("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public int field6329;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public int field6330;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public int field6331;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public int field6333;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public int field6335;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public int field6337;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V")
    public static void method2553(boolean arg0) {
        field6338 = null;
        if (arg0) {
            method2553(false);
        }
        field6334 = null;
        field6339 = null;
        field6327 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIB)B")
    public static final byte method2554(int arg0, int arg1, byte arg2) {
        if (arg2 != 50) {
            field6339 = null;
        }
        field6336++;
        if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static final void method2555(int arg0) {
        for (int var1 = 0; var1 < class275.field3772; var1++) {
            int var2 = class65.field899[var1];
            class502 var3 = class378.field5533[var2];
            if (var3 != null) {
                class263.method1578(var3.field7387.field1168, var3, true);
            }
        }
        field6332++;
        if (arg0 <= 10) {
            method2554(42, 80, (byte) -119);
        }
    }
}
