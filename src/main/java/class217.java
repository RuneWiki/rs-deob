import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class217 {

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "Lvj;")
    public static class373 field2662 = new class373(25, -2);

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "B")
    public byte field2644;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "B")
    public byte field2648;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "B")
    public byte field2651;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "B")
    public byte field2654;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "B")
    public byte field2656;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "B")
    public byte field2657;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "B")
    public byte field2660;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public int field2643;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
    public int field2658;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "S")
    public short field2641;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "Z")
    public boolean field2640;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "Z")
    public boolean field2642;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "Z")
    public boolean field2645;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "Z")
    public boolean field2646;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "Z")
    public boolean field2650;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "Z")
    public boolean field2652;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "Z")
    public boolean field2653;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "Z")
    public boolean field2655;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "Z")
    public boolean field2659;

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "Z")
    public boolean field2661;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Let;I)V", line = 6)
    public static final void method1246(class509 arg0, int arg1) {
        field2649++;
        class509 var2 = class285.method1606(true, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class426.field5495;
            var4 = class185.field2239;
        } else {
            var4 = var2.field7094;
            var3 = var2.field7059;
        }
        class311.method1727(70, arg0, var4, false, var3);
        class306.method1694(2, arg0, var4, var3);
        if (arg1 != 6) {
            field2663 = -89;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V", line = 43)
    public static final void method1247(int arg0, int arg1) {
        field2647++;
        class184.method1008(-26898);
        int var2 = class29.field203.method3527((byte) -116, arg0).field5018;
        if (var2 == 0) {
            return;
        }
        int var3 = class281.field3700.field3783[arg0];
        if (var2 == 6) {
            class210.field2564 = var3;
        }
        if (var2 == 5) {
            class157.field1913 = var3;
        }
        if (arg1 != 1) {
            field2663 = 109;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V", line = 75)
    public static void method1248(boolean arg0) {
        field2662 = null;
        if (arg0) {
            method1248(true);
        }
    }
}
