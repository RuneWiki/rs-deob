import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class482 {

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    private int field7031 = 2;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "[I")
    private int[] field7033 = new int[2];

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "[I")
    private int[] field7034 = new int[2];

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public int field7032;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
    public int field7035;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
    public int field7036;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
    private int field7037;

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "I")
    private int field7038;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "I")
    private int field7039;

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "I")
    private int field7040;

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
    private int field7041;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lsi;)V", line = 3)
    public final void method2827(class391 arg0) {
        this.field7032 = arg0.method2348(-2);
        this.field7036 = arg0.method2361((byte) -56);
        this.field7035 = arg0.method2361((byte) -56);
        this.method2829(arg0);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)I", line = 10)
    public final int method2828(int arg0) {
        if (this.field7037 >= this.field7041) {
            this.field7040 = this.field7034[this.field7038++] << 15;
            if (this.field7038 >= this.field7031) {
                this.field7038 = this.field7031 - 1;
            }
            this.field7041 = (int) ((double) this.field7033[this.field7038] / 65536.0D * (double) arg0);
            if (this.field7041 > this.field7037) {
                this.field7039 = ((this.field7034[this.field7038] << 15) - this.field7040) / (this.field7041 - this.field7037);
            }
        }
        this.field7040 += this.field7039;
        this.field7037++;
        return this.field7040 - this.field7039 >> 15;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(Lsi;)V", line = 34)
    public final void method2829(class391 arg0) {
        this.field7031 = arg0.method2348(-2);
        this.field7033 = new int[this.field7031];
        this.field7034 = new int[this.field7031];
        for (int var2 = 0; var2 < this.field7031; var2++) {
            this.field7033[var2] = arg0.method2353((byte) 120);
            this.field7034[var2] = arg0.method2353((byte) 76);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "()V", line = 50)
    public final void method2830() {
        this.field7041 = 0;
        this.field7038 = 0;
        this.field7039 = 0;
        this.field7040 = 0;
        this.field7037 = 0;
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V", line = 56)
    public class482() {
        this.field7033[0] = 0;
        this.field7033[1] = 65535;
        this.field7034[0] = 0;
        this.field7034[1] = 65535;
    }
}
