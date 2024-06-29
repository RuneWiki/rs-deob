import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class256 {

    @OriginalMember(owner = "client!so", name = "f", descriptor = "B")
    private byte field3743;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public int field3742;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public int field3739;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public int field3744;

    @OriginalMember(owner = "client!so", name = "h", descriptor = "I")
    public int field3745;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public int field3738;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!so", name = "i", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "[I")
    public static int[] field3741;

    static {
        new class487("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)I", line = 5)
    public final int method1620(boolean arg0) {
        if (arg0) {
            return 107;
        } else {
            field3740++;
            return this.field3743 & 0x7;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)I", line = 16)
    public final int method1621(int arg0) {
        field3746++;
        if (arg0 <= 65) {
            return 65;
        } else if ((this.field3743 & 0x8) == 8) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V", line = 35)
    public static void method1622(int arg0) {
        if (arg0 != 17497) {
            field3741 = null;
        }
        field3741 = null;
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V", line = 47)
    public class256() {
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lps;)V", line = 50)
    public class256(class428 arg0) {
        this.field3743 = arg0.method2570((byte) 57);
        this.field3742 = arg0.method2620(86);
        this.field3739 = arg0.method2589(-11179);
        this.field3744 = arg0.method2589(-11179);
        this.field3745 = arg0.method2589(-11179);
        this.field3738 = arg0.method2589(-11179);
    }
}
