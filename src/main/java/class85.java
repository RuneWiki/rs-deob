import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class85 {

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    private int field1896 = 2;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "[I")
    private int[] field1895 = new int[2];

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "[I")
    private int[] field1899 = new int[2];

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public int field1897;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public int field1898;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public int field1900;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    private int field1901;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    private int field1902;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    private int field1903;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    private int field1904;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    private int field1905;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lmc;)V")
    public final void method620(class86 arg0) {
        this.field1896 = arg0.method646(-15447);
        this.field1895 = new int[this.field1896];
        this.field1899 = new int[this.field1896];
        for (int var2 = 0; var2 < this.field1896; var2++) {
            this.field1895[var2] = arg0.method632((byte) -80);
            this.field1899[var2] = arg0.method632((byte) -80);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)I")
    public final int method621(int arg0) {
        if (this.field1903 >= this.field1904) {
            this.field1905 = this.field1899[this.field1901++] << 15;
            if (this.field1901 >= this.field1896) {
                this.field1901 = this.field1896 - 1;
            }
            this.field1904 = (int) ((double) this.field1895[this.field1901] / 65536.0D * (double) arg0);
            if (this.field1904 > this.field1903) {
                this.field1902 = ((this.field1899[this.field1901] << 15) - this.field1905) / (this.field1904 - this.field1903);
            }
        }
        this.field1905 += this.field1902;
        this.field1903++;
        return this.field1905 - this.field1902 >> 15;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Lmc;)V")
    public final void method622(class86 arg0) {
        this.field1900 = arg0.method646(-15447);
        this.field1898 = arg0.method666(1183700424);
        this.field1897 = arg0.method666(1183700424);
        this.method620(arg0);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "()V")
    public final void method623() {
        this.field1904 = 0;
        this.field1901 = 0;
        this.field1902 = 0;
        this.field1905 = 0;
        this.field1903 = 0;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class85() {
        this.field1895[0] = 0;
        this.field1895[1] = 65535;
        this.field1899[0] = 0;
        this.field1899[1] = 65535;
    }
}
