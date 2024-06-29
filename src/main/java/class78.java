import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class78 {

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    private int field1897 = 2;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "[I")
    private int[] field1896 = new int[2];

    @OriginalMember(owner = "client!n", name = "b", descriptor = "[I")
    private int[] field1893 = new int[2];

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public int field1892;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public int field1894;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public int field1895;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    private int field1898;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    private int field1899;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    private int field1900;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    private int field1901;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    private int field1902;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)I", line = 6)
    public final int method602(int arg0) {
        if (this.field1901 >= this.field1900) {
            this.field1898 = this.field1893[this.field1899++] << 15;
            if (this.field1899 >= this.field1897) {
                this.field1899 = this.field1897 - 1;
            }
            this.field1900 = (int) ((double) this.field1896[this.field1899] / 65536.0D * (double) arg0);
            if (this.field1900 > this.field1901) {
                this.field1902 = ((this.field1893[this.field1899] << 15) - this.field1898) / (this.field1900 - this.field1901);
            }
        }
        this.field1898 += this.field1902;
        this.field1901++;
        return this.field1898 - this.field1902 >> 15;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lfe;)V", line = 25)
    public final void method603(class36 arg0) {
        this.field1897 = arg0.method365((byte) -126);
        this.field1896 = new int[this.field1897];
        this.field1893 = new int[this.field1897];
        for (int var2 = 0; var2 < this.field1897; var2++) {
            this.field1896[var2] = arg0.method351((byte) -125);
            this.field1893[var2] = arg0.method351((byte) -107);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V", line = 43)
    public final void method604() {
        this.field1900 = 0;
        this.field1899 = 0;
        this.field1902 = 0;
        this.field1898 = 0;
        this.field1901 = 0;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Lfe;)V", line = 51)
    public final void method605(class36 arg0) {
        this.field1892 = arg0.method365((byte) -121);
        this.field1894 = arg0.method361((byte) 56);
        this.field1895 = arg0.method361((byte) 62);
        this.method603(arg0);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V", line = 56)
    public class78() {
        this.field1896[0] = 0;
        this.field1896[1] = 65535;
        this.field1893[0] = 0;
        this.field1893[1] = 65535;
    }
}
