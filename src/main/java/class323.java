import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class323 {

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    private int field4851 = 2;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "[I")
    private int[] field4849 = new int[2];

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "[I")
    private int[] field4850 = new int[2];

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public int field4852;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public int field4853;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public int field4854;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    private int field4855;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
    private int field4856;

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
    private int field4857;

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
    private int field4858;

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
    private int field4859;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)I")
    public final int method1991(int arg0) {
        if (this.field4856 >= this.field4857) {
            this.field4855 = this.field4850[this.field4858++] << 15;
            if (this.field4858 >= this.field4851) {
                this.field4858 = this.field4851 - 1;
            }
            this.field4857 = (int) ((double) this.field4849[this.field4858] / 65536.0D * (double) arg0);
            if (this.field4857 > this.field4856) {
                this.field4859 = ((this.field4850[this.field4858] << 15) - this.field4855) / (this.field4857 - this.field4856);
            }
        }
        this.field4855 += this.field4859;
        this.field4856++;
        return this.field4855 - this.field4859 >> 15;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lre;)V")
    public final void method1992(class446 arg0) {
        this.field4851 = arg0.method2628(49152);
        this.field4849 = new int[this.field4851];
        this.field4850 = new int[this.field4851];
        for (int var2 = 0; var2 < this.field4851; var2++) {
            this.field4849[var2] = arg0.method2631(2530);
            this.field4850[var2] = arg0.method2631(2530);
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(Lre;)V")
    public final void method1993(class446 arg0) {
        this.field4852 = arg0.method2628(49152);
        this.field4854 = arg0.method2604(34);
        this.field4853 = arg0.method2604(80);
        this.method1992(arg0);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "()V")
    public final void method1994() {
        this.field4857 = 0;
        this.field4858 = 0;
        this.field4859 = 0;
        this.field4855 = 0;
        this.field4856 = 0;
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
    public class323() {
        this.field4849[0] = 0;
        this.field4849[1] = 65535;
        this.field4850[0] = 0;
        this.field4850[1] = 65535;
    }
}
