import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class271 {

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    private int field4113 = 2;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "[I")
    private int[] field4115 = new int[2];

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "[I")
    private int[] field4110 = new int[2];

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public int field4111;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public int field4112;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public int field4114;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    private int field4116;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    private int field4117;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    private int field4118;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
    private int field4119;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    private int field4120;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lsb;)V", line = 6)
    public final void method1995(class190 arg0) {
        this.field4114 = arg0.method1319(255);
        this.field4111 = arg0.method1371(-4);
        this.field4112 = arg0.method1371(-4);
        this.method1998(arg0);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "()V", line = 12)
    public final void method1996() {
        this.field4116 = 0;
        this.field4117 = 0;
        this.field4118 = 0;
        this.field4120 = 0;
        this.field4119 = 0;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)I", line = 22)
    public final int method1997(int arg0) {
        if (this.field4119 >= this.field4116) {
            this.field4120 = this.field4110[this.field4117++] << 15;
            if (this.field4117 >= this.field4113) {
                this.field4117 = this.field4113 - 1;
            }
            this.field4116 = (int) ((double) this.field4115[this.field4117] / 65536.0D * (double) arg0);
            if (this.field4116 > this.field4119) {
                this.field4118 = ((this.field4110[this.field4117] << 15) - this.field4120) / (this.field4116 - this.field4119);
            }
        }
        this.field4120 += this.field4118;
        this.field4119++;
        return this.field4120 - this.field4118 >> 15;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V", line = 40)
    public class271() {
        this.field4115[0] = 0;
        this.field4115[1] = 65535;
        this.field4110[0] = 0;
        this.field4110[1] = 65535;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(Lsb;)V", line = 54)
    public final void method1998(class190 arg0) {
        this.field4113 = arg0.method1319(255);
        this.field4115 = new int[this.field4113];
        this.field4110 = new int[this.field4113];
        for (int var2 = 0; var2 < this.field4113; var2++) {
            this.field4115[var2] = arg0.method1317((byte) 55);
            this.field4110[var2] = arg0.method1317((byte) 91);
        }
    }
}
