import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GJKLDIZT")
public class class15 {

    @OriginalMember(owner = "GJKLDIZT", name = "a", descriptor = "Z")
    private boolean field683 = true;

    @OriginalMember(owner = "GJKLDIZT", name = "b", descriptor = "Z")
    private boolean field684 = false;

    @OriginalMember(owner = "GJKLDIZT", name = "c", descriptor = "I")
    private int field685;

    @OriginalMember(owner = "GJKLDIZT", name = "f", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "GJKLDIZT", name = "g", descriptor = "I")
    public int field689;

    @OriginalMember(owner = "GJKLDIZT", name = "h", descriptor = "I")
    public int field690;

    @OriginalMember(owner = "GJKLDIZT", name = "i", descriptor = "I")
    private int field691;

    @OriginalMember(owner = "GJKLDIZT", name = "j", descriptor = "I")
    private int field692;

    @OriginalMember(owner = "GJKLDIZT", name = "k", descriptor = "I")
    private int field693;

    @OriginalMember(owner = "GJKLDIZT", name = "l", descriptor = "I")
    private int field694;

    @OriginalMember(owner = "GJKLDIZT", name = "m", descriptor = "I")
    private int field695;

    @OriginalMember(owner = "GJKLDIZT", name = "n", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "GJKLDIZT", name = "d", descriptor = "[I")
    private int[] field686;

    @OriginalMember(owner = "GJKLDIZT", name = "e", descriptor = "[I")
    private int[] field687;

    @OriginalMember(owner = "GJKLDIZT", name = "a", descriptor = "(LDNRIFKTO;I)V")
    public final void method247(class11 arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        this.field690 = arg0.method189();
        this.field688 = arg0.method194();
        this.field689 = arg0.method194();
        this.method248((byte) -76, arg0);
    }

    @OriginalMember(owner = "GJKLDIZT", name = "a", descriptor = "(BLDNRIFKTO;)V")
    public final void method248(byte arg0, class11 arg1) {
        this.field685 = arg1.method189();
        if (arg0 != -76) {
            this.field684 = !this.field684;
        }
        this.field686 = new int[this.field685];
        this.field687 = new int[this.field685];
        for (int var3 = 0; var3 < this.field685; var3++) {
            this.field686[var3] = arg1.method191();
            this.field687[var3] = arg1.method191();
        }
    }

    @OriginalMember(owner = "GJKLDIZT", name = "a", descriptor = "(B)V")
    public final void method249(byte arg0) {
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            this.field684 = !this.field684;
        }
        this.field691 = 0;
        this.field692 = 0;
        this.field693 = 0;
        this.field694 = 0;
        this.field695 = 0;
    }

    @OriginalMember(owner = "GJKLDIZT", name = "a", descriptor = "(IB)I")
    public final int method250(int arg0, byte arg1) {
        if (this.field695 >= this.field691) {
            this.field694 = this.field687[this.field692++] << 15;
            if (this.field692 >= this.field685) {
                this.field692 = this.field685 - 1;
            }
            this.field691 = (int) ((double) this.field686[this.field692] / 65536.0D * (double) arg0);
            if (this.field691 > this.field695) {
                this.field693 = ((this.field687[this.field692] << 15) - this.field694) / (this.field691 - this.field695);
            }
        }
        this.field694 += this.field693;
        this.field695++;
        if (arg1 != 8) {
            this.field683 = !this.field683;
        }
        return this.field694 - this.field693 >> 15;
    }
}
