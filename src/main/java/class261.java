import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class261 {

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    private int field4071 = 2;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "[I")
    private int[] field4076 = new int[2];

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "[I")
    private int[] field4072 = new int[2];

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public int field4073;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public int field4074;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public int field4075;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    private int field4077;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    private int field4078;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    private int field4079;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    private int field4080;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    private int field4081;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "()V", line = 3)
    public final void method1750() {
        this.field4078 = 0;
        this.field4077 = 0;
        this.field4081 = 0;
        this.field4080 = 0;
        this.field4079 = 0;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lag;)V", line = 11)
    public final void method1751(class202 arg0) {
        this.field4073 = arg0.method1317((byte) -91);
        this.field4075 = arg0.method1346(84);
        this.field4074 = arg0.method1346(-121);
        this.method1753(arg0);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)I", line = 19)
    public final int method1752(int arg0) {
        if (this.field4079 >= this.field4078) {
            this.field4080 = this.field4072[this.field4077++] << 15;
            if (this.field4077 >= this.field4071) {
                this.field4077 = this.field4071 - 1;
            }
            this.field4078 = (int) ((double) this.field4076[this.field4077] / 65536.0D * (double) arg0);
            if (this.field4078 > this.field4079) {
                this.field4081 = ((this.field4072[this.field4077] << 15) - this.field4080) / (this.field4078 - this.field4079);
            }
        }
        this.field4080 += this.field4081;
        this.field4079++;
        return this.field4080 - this.field4081 >> 15;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(Lag;)V", line = 36)
    public final void method1753(class202 arg0) {
        this.field4071 = arg0.method1317((byte) -86);
        this.field4076 = new int[this.field4071];
        this.field4072 = new int[this.field4071];
        for (int var2 = 0; var2 < this.field4071; var2++) {
            this.field4076[var2] = arg0.method1315(14289);
            this.field4072[var2] = arg0.method1315(14289);
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V", line = 56)
    public class261() {
        this.field4076[0] = 0;
        this.field4076[1] = 65535;
        this.field4072[0] = 0;
        this.field4072[1] = 65535;
    }
}
