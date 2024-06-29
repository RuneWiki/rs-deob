import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class44 extends class60 {

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "[J")
    private long[] field773 = new long[10];

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    private int field777 = 1;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    private int field774 = 256;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    private int field764 = 0;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "J")
    private long field765 = class231.method1513(94);

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Loa;")
    public static class99 field766 = class221.method1463(2844, ",Mcran)2titre charg-B");

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field775 = -1;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Lng;")
    public static class76 field772 = new class76();

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    private int field767;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Lge;")
    public static class70 field768;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Loa;")
    public static class99 field776;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "[I")
    public static int[] field769;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public static void method329(int arg0) {
        if (arg0 <= 27) {
            field766 = null;
        }
        field769 = null;
        field766 = null;
        field772 = null;
        field768 = null;
        field776 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)I")
    public final int method330(int arg0, int arg1, int arg2) {
        if (arg2 != 10931) {
            return -85;
        }
        int var4 = this.field777;
        this.field777 = 1;
        int var5 = this.field774;
        this.field774 = 300;
        this.field765 = class231.method1513(arg2 ^ 0xFFFFD539);
        field770++;
        if (this.field773[this.field767] == 0L) {
            this.field777 = var4;
            this.field774 = var5;
        } else if (this.field773[this.field767] < this.field765) {
            this.field774 = (int) ((long) (arg0 * 2560) / (this.field765 - this.field773[this.field767]));
        }
        if (this.field774 < 25) {
            this.field774 = 25;
        }
        if (this.field774 > 256) {
            this.field774 = 256;
            this.field777 = (int) ((long) arg0 - ((this.field765 - this.field773[this.field767]) / 10L));
        }
        if (this.field777 > arg0) {
            this.field777 = arg0;
        }
        this.field773[this.field767] = this.field765;
        this.field767 = (this.field767 + 1) % 10;
        if (this.field777 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field773[var6] != 0L) {
                    this.field773[var6] -= -((long) this.field777);
                }
            }
        }
        if (arg1 > this.field777) {
            this.field777 = arg1;
        }
        class100.method711(0, (long) this.field777);
        int var7 = 0;
        while (this.field764 < 256) {
            var7++;
            this.field764 += this.field774;
        }
        this.field764 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public final void method331(int arg0) {
        if (arg0 != 9995) {
            this.method331(-95);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field773[var2] = 0L;
        }
        field771++;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class44() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field773[var1] = this.field765;
        }
    }
}
