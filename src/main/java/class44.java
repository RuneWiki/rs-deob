import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class44 {

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    private int field906 = 2;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "[I")
    private int[] field904 = new int[2];

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "[I")
    private int[] field903 = new int[2];

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public int field901;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public int field905;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    private int field907;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    private int field908;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    private int field909;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    private int field910;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    private int field911;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lid;)V")
    public final void method311(class60 arg0) {
        this.field905 = arg0.method462((byte) 116);
        this.field902 = arg0.method442((byte) -85);
        this.field901 = arg0.method442((byte) -114);
        this.method312(arg0);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Lid;)V")
    public final void method312(class60 arg0) {
        this.field906 = arg0.method462((byte) 116);
        this.field904 = new int[this.field906];
        this.field903 = new int[this.field906];
        for (int var2 = 0; var2 < this.field906; var2++) {
            this.field904[var2] = arg0.method467(255);
            this.field903[var2] = arg0.method467(255);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)I")
    public final int method313(int arg0) {
        if (this.field907 >= this.field911) {
            this.field908 = this.field903[this.field910++] << 15;
            if (this.field910 >= this.field906) {
                this.field910 = this.field906 - 1;
            }
            this.field911 = (int) ((double) this.field904[this.field910] / 65536.0D * (double) arg0);
            if (this.field911 > this.field907) {
                this.field909 = ((this.field903[this.field910] << 15) - this.field908) / (this.field911 - this.field907);
            }
        }
        this.field908 += this.field909;
        this.field907++;
        return this.field908 - this.field909 >> 15;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "()V")
    public final void method314() {
        this.field911 = 0;
        this.field910 = 0;
        this.field909 = 0;
        this.field908 = 0;
        this.field907 = 0;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    public class44() {
        this.field904[0] = 0;
        this.field904[1] = 65535;
        this.field903[0] = 0;
        this.field903[1] = 65535;
    }
}
