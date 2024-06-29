import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class83 {

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    private int field1142 = 2;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "[I")
    private int[] field1145 = new int[2];

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "[I")
    private int[] field1147 = new int[2];

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public int field1143;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public int field1144;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public int field1146;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    private int field1148;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    private int field1149;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    private int field1150;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    private int field1151;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    private int field1152;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lqi;)V")
    public final void method497(class216 arg0) {
        this.field1146 = arg0.method1407(115);
        this.field1143 = arg0.method1358(91);
        this.field1144 = arg0.method1358(104);
        this.method498(arg0);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(Lqi;)V")
    public final void method498(class216 arg0) {
        this.field1142 = arg0.method1407(121);
        this.field1145 = new int[this.field1142];
        this.field1147 = new int[this.field1142];
        for (int var2 = 0; var2 < this.field1142; var2++) {
            this.field1145[var2] = arg0.method1380(true);
            this.field1147[var2] = arg0.method1380(true);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)I")
    public final int method499(int arg0) {
        if (this.field1149 >= this.field1148) {
            this.field1150 = this.field1147[this.field1152++] << 15;
            if (this.field1152 >= this.field1142) {
                this.field1152 = this.field1142 - 1;
            }
            this.field1148 = (int) ((double) this.field1145[this.field1152] / 65536.0D * (double) arg0);
            if (this.field1148 > this.field1149) {
                this.field1151 = ((this.field1147[this.field1152] << 15) - this.field1150) / (this.field1148 - this.field1149);
            }
        }
        this.field1150 += this.field1151;
        this.field1149++;
        return this.field1150 - this.field1151 >> 15;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
    public class83() {
        this.field1145[0] = 0;
        this.field1145[1] = 65535;
        this.field1147[0] = 0;
        this.field1147[1] = 65535;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()V")
    public final void method500() {
        this.field1148 = 0;
        this.field1152 = 0;
        this.field1151 = 0;
        this.field1150 = 0;
        this.field1149 = 0;
    }
}
