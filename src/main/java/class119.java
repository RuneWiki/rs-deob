import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class119 {

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Lrn;")
    public static class633 field1602 = new class633(68, 0);

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "[I")
    public static int[] field1604 = new int[2048];

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "[Lrw;")
    public static class264[] field1603;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public static void method709(byte arg0) {
        field1602 = null;
        if (arg0 != 93) {
            method709((byte) 73);
        }
        field1604 = null;
        field1603 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)V")
    public static final void method710(int arg0, int arg1, int arg2, int arg3) {
        field1601++;
        String var4 = "tele " + arg3 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
        System.out.println(var4);
        if (arg1 == 0) {
            class458.method2591(true, var4, false, (byte) 46);
        }
    }
}
