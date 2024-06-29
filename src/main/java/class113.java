import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class113 {

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    private int field2115 = 2;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "[I")
    private int[] field2112 = new int[2];

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "[I")
    private int[] field2114 = new int[2];

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public int field2111;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public int field2113;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public int field2116;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    private int field2117;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    private int field2118;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    private int field2119;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    private int field2120;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    private int field2121;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)I")
    public final int method758(int arg0) {
        if (this.field2117 >= this.field2121) {
            this.field2119 = this.field2114[this.field2118++] << 15;
            if (this.field2118 >= this.field2115) {
                this.field2118 = this.field2115 - 1;
            }
            this.field2121 = (int) ((double) this.field2112[this.field2118] / 65536.0D * (double) arg0);
            if (this.field2121 > this.field2117) {
                this.field2120 = ((this.field2114[this.field2118] << 15) - this.field2119) / (this.field2121 - this.field2117);
            }
        }
        this.field2119 += this.field2120;
        this.field2117++;
        return this.field2119 - this.field2120 >> 15;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lnc;)V")
    public final void method759(class145 arg0) {
        this.field2115 = arg0.method998(86);
        this.field2112 = new int[this.field2115];
        this.field2114 = new int[this.field2115];
        for (int var2 = 0; var2 < this.field2115; var2++) {
            this.field2112[var2] = arg0.method1049((byte) 91);
            this.field2114[var2] = arg0.method1049((byte) 125);
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Lnc;)V")
    public final void method760(class145 arg0) {
        this.field2113 = arg0.method998(90);
        this.field2111 = arg0.method1018(-1068451600);
        this.field2116 = arg0.method1018(-1068451600);
        this.method759(arg0);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()V")
    public final void method761() {
        this.field2121 = 0;
        this.field2118 = 0;
        this.field2120 = 0;
        this.field2119 = 0;
        this.field2117 = 0;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
    public class113() {
        this.field2112[0] = 0;
        this.field2112[1] = 65535;
        this.field2114[0] = 0;
        this.field2114[1] = 65535;
    }
}
