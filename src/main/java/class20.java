import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!HCHPPCNY")
public class class20 {

    @OriginalMember(owner = "client!HCHPPCNY", name = "a", descriptor = "I")
    private int field754 = 779;

    @OriginalMember(owner = "client!HCHPPCNY", name = "b", descriptor = "Z")
    private boolean field755 = false;

    @OriginalMember(owner = "client!HCHPPCNY", name = "c", descriptor = "I")
    private int field756 = -48151;

    @OriginalMember(owner = "client!HCHPPCNY", name = "d", descriptor = "I")
    private int field757;

    @OriginalMember(owner = "client!HCHPPCNY", name = "g", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "client!HCHPPCNY", name = "h", descriptor = "I")
    public int field761;

    @OriginalMember(owner = "client!HCHPPCNY", name = "i", descriptor = "I")
    public int field762;

    @OriginalMember(owner = "client!HCHPPCNY", name = "j", descriptor = "I")
    private int field763;

    @OriginalMember(owner = "client!HCHPPCNY", name = "k", descriptor = "I")
    private int field764;

    @OriginalMember(owner = "client!HCHPPCNY", name = "l", descriptor = "I")
    private int field765;

    @OriginalMember(owner = "client!HCHPPCNY", name = "m", descriptor = "I")
    private int field766;

    @OriginalMember(owner = "client!HCHPPCNY", name = "n", descriptor = "I")
    private int field767;

    @OriginalMember(owner = "client!HCHPPCNY", name = "o", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!HCHPPCNY", name = "e", descriptor = "[I")
    private int[] field758;

    @OriginalMember(owner = "client!HCHPPCNY", name = "f", descriptor = "[I")
    private int[] field759;

    @OriginalMember(owner = "client!HCHPPCNY", name = "a", descriptor = "(ILBSNPYLEV;)V")
    public final void method316(int arg0, class7 arg1) {
        this.field762 = arg1.method47();
        if (arg0 != 7) {
            this.field756 = 247;
        }
        this.field760 = arg1.method52();
        this.field761 = arg1.method52();
        this.method317(arg1, 779);
    }

    @OriginalMember(owner = "client!HCHPPCNY", name = "a", descriptor = "(LBSNPYLEV;I)V")
    public final void method317(class7 arg0, int arg1) {
        this.field757 = arg0.method47();
        this.field758 = new int[this.field757];
        this.field759 = new int[this.field757];
        for (int var3 = 0; var3 < this.field757; var3++) {
            this.field758[var3] = arg0.method49();
            this.field759[var3] = arg0.method49();
        }
        if (arg1 <= 0) {
            this.field755 = !this.field755;
        }
    }

    @OriginalMember(owner = "client!HCHPPCNY", name = "a", descriptor = "(I)V")
    public final void method318(int arg0) {
        this.field763 = 0;
        this.field764 = 0;
        this.field765 = 0;
        this.field766 = 0;
        if (arg0 < 7 || arg0 > 7) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field767 = 0;
    }

    @OriginalMember(owner = "client!HCHPPCNY", name = "a", descriptor = "(IB)I")
    public final int method319(int arg0, byte arg1) {
        if (this.field767 >= this.field763) {
            this.field766 = this.field759[this.field764++] << 15;
            if (this.field764 >= this.field757) {
                this.field764 = this.field757 - 1;
            }
            this.field763 = (int) ((double) this.field758[this.field764] / 65536.0D * (double) arg0);
            if (this.field763 > this.field767) {
                this.field765 = ((this.field759[this.field764] << 15) - this.field766) / (this.field763 - this.field767);
            }
        }
        this.field766 += this.field765;
        if (arg1 != 81) {
            this.field754 = 305;
        }
        this.field767++;
        return this.field766 - this.field765 >> 15;
    }
}
