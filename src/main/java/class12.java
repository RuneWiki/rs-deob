import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class12 {

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    private int field228 = 2;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "[I")
    private int[] field227 = new int[2];

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "[I")
    private int[] field225 = new int[2];

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public int field224;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public int field226;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public int field229;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    private int field230;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    private int field234;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Laa;)V")
    public final void method115(class8 arg0) {
        this.field228 = arg0.method63((byte) 98);
        this.field227 = new int[this.field228];
        this.field225 = new int[this.field228];
        for (int var2 = 0; var2 < this.field228; var2++) {
            this.field227[var2] = arg0.method65((byte) 125);
            this.field225[var2] = arg0.method65((byte) 122);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)I")
    public final int method116(int arg0) {
        if (this.field234 >= this.field233) {
            this.field232 = this.field225[this.field230++] << 15;
            if (this.field230 >= this.field228) {
                this.field230 = this.field228 - 1;
            }
            this.field233 = (int) ((double) this.field227[this.field230] / 65536.0D * (double) arg0);
            if (this.field233 > this.field234) {
                this.field231 = ((this.field225[this.field230] << 15) - this.field232) / (this.field233 - this.field234);
            }
        }
        this.field232 += this.field231;
        this.field234++;
        return this.field232 - this.field231 >> 15;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "()V")
    public final void method117() {
        this.field233 = 0;
        this.field230 = 0;
        this.field231 = 0;
        this.field232 = 0;
        this.field234 = 0;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(Laa;)V")
    public final void method118(class8 arg0) {
        this.field229 = arg0.method63((byte) 77);
        this.field224 = arg0.method70(65280);
        this.field226 = arg0.method70(65280);
        this.method115(arg0);
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class12() {
        this.field227[0] = 0;
        this.field227[1] = 65535;
        this.field225[0] = 0;
        this.field225[1] = 65535;
    }
}
