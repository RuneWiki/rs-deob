import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class255 {

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public int field4084 = -1;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public int field4085 = -1;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field4081 = 0;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "[Lsd;")
    public static class45[] field4082 = new class45[32768];

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field4087 = 0;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "[I")
    public static int[] field4090 = new int[64];

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Lhc;")
    public static class235 field4086;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "[I")
    public int[] field4089;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lai;II)V")
    public final void method1735(class88 arg0, int arg1, int arg2) {
        field4088++;
        while (true) {
            int var4 = arg0.method633(101);
            if (var4 == 0) {
                if (arg2 == 14778) {
                    return;
                } else {
                    field4086 = null;
                    return;
                }
            }
            this.method1736(arg0, arg1, (byte) 94, var4);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lai;IBI)V")
    private final void method1736(class88 arg0, int arg1, byte arg2, int arg3) {
        field4083++;
        int var5 = -50 / ((35 - arg2) / 48);
        if (arg3 == 1) {
            this.field4085 = arg0.method645(11596);
        } else if (arg3 == 2) {
            this.field4089 = new int[arg0.method633(54)];
            for (int var6 = 0; var6 < this.field4089.length; var6++) {
                this.field4089[var6] = arg0.method645(11596);
            }
        } else if (arg3 == 3) {
            this.field4084 = arg0.method633(108);
            return;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public static void method1737(byte arg0) {
        if (arg0 >= -58) {
            method1737((byte) -10);
        }
        field4086 = null;
        field4082 = null;
        field4090 = null;
    }
}
