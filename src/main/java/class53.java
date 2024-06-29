import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class53 {

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    private int field751 = 2;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "[I")
    private int[] field750 = new int[2];

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "[I")
    private int[] field752 = new int[2];

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public int field753;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public int field754;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    private int field755;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    private int field756;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    private int field757;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    private int field758;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    private int field759;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "()V", line = 3)
    public final void method357() {
        this.field756 = 0;
        this.field757 = 0;
        this.field758 = 0;
        this.field755 = 0;
        this.field759 = 0;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)I", line = 12)
    public final int method358(int arg0) {
        if (this.field759 >= this.field756) {
            this.field755 = this.field752[this.field757++] << 15;
            if (this.field757 >= this.field751) {
                this.field757 = this.field751 - 1;
            }
            this.field756 = (int) ((double) this.field750[this.field757] / 65536.0D * (double) arg0);
            if (this.field756 > this.field759) {
                this.field758 = ((this.field752[this.field757] << 15) - this.field755) / (this.field756 - this.field759);
            }
        }
        this.field755 += this.field758;
        this.field759++;
        return this.field755 - this.field758 >> 15;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V", line = 35)
    public class53() {
        this.field750[0] = 0;
        this.field750[1] = 65535;
        this.field752[0] = 0;
        this.field752[1] = 65535;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lgn;)V", line = 46)
    public final void method359(class303 arg0) {
        this.field751 = arg0.method2043((byte) -112);
        this.field750 = new int[this.field751];
        this.field752 = new int[this.field751];
        for (int var2 = 0; var2 < this.field751; var2++) {
            this.field750[var2] = arg0.method1994(false);
            this.field752[var2] = arg0.method1994(false);
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(Lgn;)V", line = 62)
    public final void method360(class303 arg0) {
        this.field749 = arg0.method2043((byte) -126);
        this.field754 = arg0.method1996(86);
        this.field753 = arg0.method1996(-48);
        this.method359(arg0);
    }
}
