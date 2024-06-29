import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class183 {

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    private int field3132 = 2;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "[I")
    private int[] field3135 = new int[2];

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "[I")
    private int[] field3134 = new int[2];

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public int field3133;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public int field3136;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public int field3137;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    private int field3138;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    private int field3139;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    private int field3140;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    private int field3141;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    private int field3142;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I")
    public final int method1222(int arg0) {
        if (this.field3138 >= this.field3140) {
            this.field3139 = this.field3134[this.field3142++] << 15;
            if (this.field3142 >= this.field3132) {
                this.field3142 = this.field3132 - 1;
            }
            this.field3140 = (int) ((double) this.field3135[this.field3142] / 65536.0D * (double) arg0);
            if (this.field3140 > this.field3138) {
                this.field3141 = ((this.field3134[this.field3142] << 15) - this.field3139) / (this.field3140 - this.field3138);
            }
        }
        this.field3139 += this.field3141;
        this.field3138++;
        return this.field3139 - this.field3141 >> 15;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lij;)V")
    public final void method1223(class85 arg0) {
        this.field3133 = arg0.method564((byte) 60);
        this.field3137 = arg0.method568(19845);
        this.field3136 = arg0.method568(19845);
        this.method1225(arg0);
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
    public class183() {
        this.field3135[0] = 0;
        this.field3135[1] = 65535;
        this.field3134[0] = 0;
        this.field3134[1] = 65535;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "()V")
    public final void method1224() {
        this.field3140 = 0;
        this.field3142 = 0;
        this.field3141 = 0;
        this.field3139 = 0;
        this.field3138 = 0;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(Lij;)V")
    public final void method1225(class85 arg0) {
        this.field3132 = arg0.method564((byte) 102);
        this.field3135 = new int[this.field3132];
        this.field3134 = new int[this.field3132];
        for (int var2 = 0; var2 < this.field3132; var2++) {
            this.field3135[var2] = arg0.method608(119);
            this.field3134[var2] = arg0.method608(50);
        }
    }
}
