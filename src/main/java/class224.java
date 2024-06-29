import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class224 {

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    private int field3842 = 2;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "[I")
    private int[] field3841 = new int[2];

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "[I")
    private int[] field3840 = new int[2];

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public int field3838;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public int field3839;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public int field3843;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    private int field3844;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    private int field3845;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    private int field3846;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    private int field3847;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    private int field3848;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)I")
    public final int method1462(int arg0) {
        if (this.field3848 >= this.field3845) {
            this.field3847 = this.field3840[this.field3846++] << 15;
            if (this.field3846 >= this.field3842) {
                this.field3846 = this.field3842 - 1;
            }
            this.field3845 = (int) ((double) this.field3841[this.field3846] / 65536.0D * (double) arg0);
            if (this.field3845 > this.field3848) {
                this.field3844 = ((this.field3840[this.field3846] << 15) - this.field3847) / (this.field3845 - this.field3848);
            }
        }
        this.field3847 += this.field3844;
        this.field3848++;
        return this.field3847 - this.field3844 >> 15;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lnh;)V")
    public final void method1463(class112 arg0) {
        this.field3842 = arg0.method758(true);
        this.field3841 = new int[this.field3842];
        this.field3840 = new int[this.field3842];
        for (int var2 = 0; var2 < this.field3842; var2++) {
            this.field3841[var2] = arg0.method731(false);
            this.field3840[var2] = arg0.method731(false);
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Lnh;)V")
    public final void method1464(class112 arg0) {
        this.field3843 = arg0.method758(true);
        this.field3839 = arg0.method769((byte) -86);
        this.field3838 = arg0.method769((byte) -86);
        this.method1463(arg0);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()V")
    public final void method1465() {
        this.field3845 = 0;
        this.field3846 = 0;
        this.field3844 = 0;
        this.field3847 = 0;
        this.field3848 = 0;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    public class224() {
        this.field3841[0] = 0;
        this.field3841[1] = 65535;
        this.field3840[0] = 0;
        this.field3840[1] = 65535;
    }
}
