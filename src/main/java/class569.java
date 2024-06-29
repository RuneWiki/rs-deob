import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class569 {

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "I")
    private int field8147 = 2;

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "[I")
    private int[] field8146 = new int[2];

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "[I")
    private int[] field8145 = new int[2];

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "I")
    public int field8148;

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "I")
    public int field8149;

    @OriginalMember(owner = "client!lea", name = "f", descriptor = "I")
    public int field8150;

    @OriginalMember(owner = "client!lea", name = "g", descriptor = "I")
    private int field8151;

    @OriginalMember(owner = "client!lea", name = "h", descriptor = "I")
    private int field8152;

    @OriginalMember(owner = "client!lea", name = "i", descriptor = "I")
    private int field8153;

    @OriginalMember(owner = "client!lea", name = "j", descriptor = "I")
    private int field8154;

    @OriginalMember(owner = "client!lea", name = "k", descriptor = "I")
    private int field8155;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)I", line = 5)
    public final int method3360(int arg0) {
        if (this.field8151 >= this.field8154) {
            this.field8155 = this.field8145[this.field8152++] << 15;
            if (this.field8152 >= this.field8147) {
                this.field8152 = this.field8147 - 1;
            }
            this.field8154 = (int) ((double) this.field8146[this.field8152] / 65536.0D * (double) arg0);
            if (this.field8154 > this.field8151) {
                this.field8153 = ((this.field8145[this.field8152] << 15) - this.field8155) / (this.field8154 - this.field8151);
            }
        }
        this.field8155 += this.field8153;
        this.field8151++;
        return this.field8155 - this.field8153 >> 15;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lie;)V", line = 25)
    public final void method3361(class6 arg0) {
        this.field8147 = arg0.method70(-9059);
        this.field8146 = new int[this.field8147];
        this.field8145 = new int[this.field8147];
        for (int var2 = 0; var2 < this.field8147; var2++) {
            this.field8146[var2] = arg0.method67(12021);
            this.field8145[var2] = arg0.method67(12021);
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "()V", line = 40)
    public final void method3362() {
        this.field8154 = 0;
        this.field8152 = 0;
        this.field8153 = 0;
        this.field8155 = 0;
        this.field8151 = 0;
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(Lie;)V", line = 49)
    public final void method3363(class6 arg0) {
        this.field8149 = arg0.method70(-9059);
        this.field8148 = arg0.method72(-124);
        this.field8150 = arg0.method72(-45);
        this.method3361(arg0);
    }

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "()V", line = 55)
    public class569() {
        this.field8146[0] = 0;
        this.field8146[1] = 65535;
        this.field8145[0] = 0;
        this.field8145[1] = 65535;
    }
}
