import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class12 {

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    private int field200 = 2;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "[I")
    private int[] field199 = new int[2];

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "[I")
    private int[] field197 = new int[2];

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public int field195;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public int field196;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public int field198;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
    private int field201;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "I")
    private int field203;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
    private int field204;

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)I", line = 3)
    public final int method93(int arg0) {
        if (this.field203 >= this.field202) {
            this.field205 = this.field197[this.field201++] << 15;
            if (this.field201 >= this.field200) {
                this.field201 = this.field200 - 1;
            }
            this.field202 = (int) ((double) this.field199[this.field201] / 65536.0D * (double) arg0);
            if (this.field202 > this.field203) {
                this.field204 = ((this.field197[this.field201] << 15) - this.field205) / (this.field202 - this.field203);
            }
        }
        this.field205 += this.field204;
        this.field203++;
        return this.field205 - this.field204 >> 15;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lfb;)V", line = 24)
    public final void method94(class341 arg0) {
        this.field196 = arg0.method2233((byte) 104);
        this.field198 = arg0.method2232(109);
        this.field195 = arg0.method2232(-76);
        this.method96(arg0);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "()V", line = 31)
    public final void method95() {
        this.field202 = 0;
        this.field201 = 0;
        this.field204 = 0;
        this.field205 = 0;
        this.field203 = 0;
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(Lfb;)V", line = 39)
    public final void method96(class341 arg0) {
        this.field200 = arg0.method2233((byte) 104);
        this.field199 = new int[this.field200];
        this.field197 = new int[this.field200];
        for (int var2 = 0; var2 < this.field200; var2++) {
            this.field199[var2] = arg0.method2239(-1076227960);
            this.field197[var2] = arg0.method2239(-1076227960);
        }
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V", line = 55)
    public class12() {
        this.field199[0] = 0;
        this.field199[1] = 65535;
        this.field197[0] = 0;
        this.field197[1] = 65535;
    }
}
