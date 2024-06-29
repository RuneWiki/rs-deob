import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class SoundEnvelope {

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Z")
    private boolean field885 = false;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    private int field886;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public int field890;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public int field891;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    private int field892;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    private int field893;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    private int field894;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    private int field895;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    private int field896;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "[I")
    private int[] field887;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "[I")
    private int[] field888;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLlb;)V")
    public final void method307(boolean arg0, Packet arg1) {
        this.field891 = arg1.method227();
        this.field889 = arg1.method232();
        this.field890 = arg1.method232();
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.method308(0, arg1);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILlb;)V")
    public final void method308(int arg0, Packet arg1) {
        if (arg0 != 0) {
            return;
        }
        this.field886 = arg1.method227();
        this.field887 = new int[this.field886];
        this.field888 = new int[this.field886];
        for (int var3 = 0; var3 < this.field886; var3++) {
            this.field887[var3] = arg1.method229();
            this.field888[var3] = arg1.method229();
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public final void method309(int arg0) {
        this.field892 = 0;
        this.field893 = 0;
        this.field894 = 0;
        this.field895 = 0;
        if (arg0 != -9520) {
            this.field885 = !this.field885;
        }
        this.field896 = 0;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I")
    public final int method310(int arg0, int arg1) {
        if (this.field896 >= this.field892) {
            this.field895 = this.field888[this.field893++] << 15;
            if (this.field893 >= this.field886) {
                this.field893 = this.field886 - 1;
            }
            this.field892 = (int) ((double) this.field887[this.field893] / 65536.0D * (double) arg1);
            if (this.field892 > this.field896) {
                this.field894 = ((this.field888[this.field893] << 15) - this.field895) / (this.field892 - this.field896);
            }
        }
        this.field895 += this.field894;
        this.field896++;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field895 - this.field894 >> 15;
    }
}
