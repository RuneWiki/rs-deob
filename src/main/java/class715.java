import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class715 {

    @OriginalMember(owner = "client!jga", name = "e", descriptor = "I")
    private int field9939 = 2;

    @OriginalMember(owner = "client!jga", name = "f", descriptor = "[I")
    private int[] field9940 = new int[2];

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "[I")
    private int[] field9937 = new int[2];

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "I")
    public int field9935;

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "I")
    public int field9936;

    @OriginalMember(owner = "client!jga", name = "d", descriptor = "I")
    public int field9938;

    @OriginalMember(owner = "client!jga", name = "g", descriptor = "I")
    private int field9941;

    @OriginalMember(owner = "client!jga", name = "h", descriptor = "I")
    private int field9942;

    @OriginalMember(owner = "client!jga", name = "i", descriptor = "I")
    private int field9943;

    @OriginalMember(owner = "client!jga", name = "j", descriptor = "I")
    private int field9944;

    @OriginalMember(owner = "client!jga", name = "k", descriptor = "I")
    private int field9945;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "()V")
    public final void method4029() {
        this.field9945 = 0;
        this.field9944 = 0;
        this.field9941 = 0;
        this.field9943 = 0;
        this.field9942 = 0;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lee;)V")
    public final void method4030(class675 arg0) {
        this.field9935 = arg0.method3750((byte) 35);
        this.field9936 = arg0.method3703(92);
        this.field9938 = arg0.method3703(127);
        this.method4032(arg0);
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)I")
    public final int method4031(int arg0) {
        if (this.field9942 >= this.field9945) {
            this.field9943 = this.field9937[this.field9944++] << 15;
            if (this.field9944 >= this.field9939) {
                this.field9944 = this.field9939 - 1;
            }
            this.field9945 = (int) ((double) this.field9940[this.field9944] / 65536.0D * (double) arg0);
            if (this.field9945 > this.field9942) {
                this.field9941 = ((this.field9937[this.field9944] << 15) - this.field9943) / (this.field9945 - this.field9942);
            }
        }
        this.field9943 += this.field9941;
        this.field9942++;
        return this.field9943 - this.field9941 >> 15;
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(Lee;)V")
    public final void method4032(class675 arg0) {
        this.field9939 = arg0.method3750((byte) 35);
        this.field9940 = new int[this.field9939];
        this.field9937 = new int[this.field9939];
        for (int var2 = 0; var2 < this.field9939; var2++) {
            this.field9940[var2] = arg0.method3757((byte) -65);
            this.field9937[var2] = arg0.method3757((byte) -65);
        }
    }

    @OriginalMember(owner = "client!jga", name = "<init>", descriptor = "()V")
    public class715() {
        this.field9940[0] = 0;
        this.field9940[1] = 65535;
        this.field9937[0] = 0;
        this.field9937[1] = 65535;
    }
}
