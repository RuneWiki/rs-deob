import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class680 {

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "I")
    public int field9622 = -1;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
    public int field9624 = -1;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "[I")
    public static int[] field9621 = new int[14];

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
    public static int field9619;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
    public static int field9623;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    public static int field9625;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "[I")
    public int[] field9620;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)V")
    public static final void method3855(int arg0, int arg1, int arg2) {
        if (arg1 == 7205) {
            field9619++;
            class47 var3 = class258.method1546(7, arg2, (byte) 121);
            var3.method271((byte) 127);
            var3.field507 = arg0;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IILig;)V")
    private final void method3856(int arg0, int arg1, class244 arg2) {
        if (arg0 > -17) {
            this.method3857(9, null);
        }
        field9623++;
        if (arg1 == 1) {
            this.field9622 = arg2.method1476(40);
        } else if (arg1 == 2) {
            this.field9620 = new int[arg2.method1423(-8)];
            for (int var4 = 0; var4 < this.field9620.length; var4++) {
                this.field9620[var4] = arg2.method1476(71);
            }
        } else if (arg1 == 3) {
            this.field9624 = arg2.method1423(-120);
            return;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILig;)V")
    public final void method3857(int arg0, class244 arg1) {
        while (true) {
            int var3 = arg1.method1423(-86);
            if (var3 == 0) {
                field9625++;
                if (arg0 != 0) {
                    this.field9622 = -101;
                    return;
                }
                return;
            }
            this.method3856(-54, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V")
    public static void method3858(byte arg0) {
        field9621 = null;
        if (arg0 < 123) {
            method3855(98, 21, 103);
        }
    }
}
