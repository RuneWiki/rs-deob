import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!HXORSAZH")
public class class19 {

    @OriginalMember(owner = "client!HXORSAZH", name = "a", descriptor = "Z")
    private boolean field764 = false;

    @OriginalMember(owner = "client!HXORSAZH", name = "b", descriptor = "I")
    private int field765;

    @OriginalMember(owner = "client!HXORSAZH", name = "e", descriptor = "I")
    public int field768;

    @OriginalMember(owner = "client!HXORSAZH", name = "f", descriptor = "I")
    public int field769;

    @OriginalMember(owner = "client!HXORSAZH", name = "g", descriptor = "I")
    public int field770;

    @OriginalMember(owner = "client!HXORSAZH", name = "h", descriptor = "I")
    private int field771;

    @OriginalMember(owner = "client!HXORSAZH", name = "i", descriptor = "I")
    private int field772;

    @OriginalMember(owner = "client!HXORSAZH", name = "j", descriptor = "I")
    private int field773;

    @OriginalMember(owner = "client!HXORSAZH", name = "k", descriptor = "I")
    private int field774;

    @OriginalMember(owner = "client!HXORSAZH", name = "l", descriptor = "I")
    private int field775;

    @OriginalMember(owner = "client!HXORSAZH", name = "m", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!HXORSAZH", name = "c", descriptor = "[I")
    private int[] field766;

    @OriginalMember(owner = "client!HXORSAZH", name = "d", descriptor = "[I")
    private int[] field767;

    @OriginalMember(owner = "client!HXORSAZH", name = "a", descriptor = "(ILTQYMAXSO;)V")
    public final void method222(int arg0, class53 arg1) {
        this.field770 = arg1.method468();
        this.field768 = arg1.method473();
        this.field769 = arg1.method473();
        this.method223(arg1, 36708);
        if (arg0 != 3) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!HXORSAZH", name = "a", descriptor = "(LTQYMAXSO;I)V")
    public final void method223(class53 arg0, int arg1) {
        this.field765 = arg0.method468();
        this.field766 = new int[this.field765];
        if (arg1 != 36708) {
            return;
        }
        this.field767 = new int[this.field765];
        for (int var3 = 0; var3 < this.field765; var3++) {
            this.field766[var3] = arg0.method470();
            this.field767[var3] = arg0.method470();
        }
    }

    @OriginalMember(owner = "client!HXORSAZH", name = "a", descriptor = "(Z)V")
    public final void method224(boolean arg0) {
        this.field771 = 0;
        this.field772 = 0;
        this.field773 = 0;
        if (!arg0) {
            this.field774 = 0;
            this.field775 = 0;
        }
    }

    @OriginalMember(owner = "client!HXORSAZH", name = "a", descriptor = "(IB)I")
    public final int method225(int arg0, byte arg1) {
        if (this.field775 >= this.field771) {
            this.field774 = this.field767[this.field772++] << 15;
            if (this.field772 >= this.field765) {
                this.field772 = this.field765 - 1;
            }
            this.field771 = (int) ((double) this.field766[this.field772] / 65536.0D * (double) arg0);
            if (this.field771 > this.field775) {
                this.field773 = ((this.field767[this.field772] << 15) - this.field774) / (this.field771 - this.field775);
            }
        }
        this.field774 += this.field773;
        if (arg1 != -100) {
            this.field764 = !this.field764;
        }
        this.field775++;
        return this.field774 - this.field773 >> 15;
    }
}
