import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class108 {

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    private int field1899 = 2;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "[I")
    private int[] field1903 = new int[2];

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "[I")
    private int[] field1902 = new int[2];

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public int field1900;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public int field1901;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public int field1904;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    private int field1905;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    private int field1906;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    private int field1907;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    private int field1908;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    private int field1909;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lh;)V")
    public final void method650(class190 arg0) {
        this.field1901 = arg0.method1265(117);
        this.field1900 = arg0.method1269(94);
        this.field1904 = arg0.method1269(100);
        this.method653(arg0);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)I")
    public final int method651(int arg0) {
        if (this.field1908 >= this.field1907) {
            this.field1905 = this.field1902[this.field1906++] << 15;
            if (this.field1906 >= this.field1899) {
                this.field1906 = this.field1899 - 1;
            }
            this.field1907 = (int) ((double) this.field1903[this.field1906] / 65536.0D * (double) arg0);
            if (this.field1907 > this.field1908) {
                this.field1909 = ((this.field1902[this.field1906] << 15) - this.field1905) / (this.field1907 - this.field1908);
            }
        }
        this.field1905 += this.field1909;
        this.field1908++;
        return this.field1905 - this.field1909 >> 15;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "()V")
    public final void method652() {
        this.field1907 = 0;
        this.field1906 = 0;
        this.field1909 = 0;
        this.field1905 = 0;
        this.field1908 = 0;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
    public class108() {
        this.field1903[0] = 0;
        this.field1903[1] = 65535;
        this.field1902[0] = 0;
        this.field1902[1] = 65535;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(Lh;)V")
    public final void method653(class190 arg0) {
        this.field1899 = arg0.method1265(121);
        this.field1903 = new int[this.field1899];
        this.field1902 = new int[this.field1899];
        for (int var2 = 0; var2 < this.field1899; var2++) {
            this.field1903[var2] = arg0.method1275(128);
            this.field1902[var2] = arg0.method1275(128);
        }
    }
}
