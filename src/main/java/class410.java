import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class410 {

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    private int field5890 = 2;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "[I")
    private int[] field5888 = new int[2];

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "[I")
    private int[] field5891 = new int[2];

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public int field5889;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
    public int field5892;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
    public int field5893;

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
    private int field5894;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
    private int field5895;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
    private int field5896;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
    private int field5897;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
    private int field5898;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)I")
    public final int method2544(int arg0) {
        if (this.field5898 >= this.field5896) {
            this.field5894 = this.field5891[this.field5895++] << 15;
            if (this.field5895 >= this.field5890) {
                this.field5895 = this.field5890 - 1;
            }
            this.field5896 = (int) ((double) this.field5888[this.field5895] / 65536.0D * (double) arg0);
            if (this.field5896 > this.field5898) {
                this.field5897 = ((this.field5891[this.field5895] << 15) - this.field5894) / (this.field5896 - this.field5898);
            }
        }
        this.field5894 += this.field5897;
        this.field5898++;
        return this.field5894 - this.field5897 >> 15;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lat;)V")
    public final void method2545(class256 arg0) {
        this.field5890 = arg0.method1738((byte) -123);
        this.field5888 = new int[this.field5890];
        this.field5891 = new int[this.field5890];
        for (int var2 = 0; var2 < this.field5890; var2++) {
            this.field5888[var2] = arg0.method1767(1930493576);
            this.field5891[var2] = arg0.method1767(1930493576);
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(Lat;)V")
    public final void method2546(class256 arg0) {
        this.field5892 = arg0.method1738((byte) 73);
        this.field5893 = arg0.method1746(20972);
        this.field5889 = arg0.method1746(20972);
        this.method2545(arg0);
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
    public class410() {
        this.field5888[0] = 0;
        this.field5888[1] = 65535;
        this.field5891[0] = 0;
        this.field5891[1] = 65535;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "()V")
    public final void method2547() {
        this.field5896 = 0;
        this.field5895 = 0;
        this.field5897 = 0;
        this.field5894 = 0;
        this.field5898 = 0;
    }
}
