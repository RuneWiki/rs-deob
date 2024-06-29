import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class123 {

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    private int field1880 = 2;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "[I")
    private int[] field1879 = new int[2];

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "[I")
    private int[] field1875 = new int[2];

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public int field1876;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public int field1877;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public int field1878;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    private int field1881;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    private int field1882;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    private int field1883;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    private int field1884;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    private int field1885;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lwm;)V", line = 7)
    public final void method917(class254 arg0) {
        this.field1876 = arg0.method1774((byte) -126);
        this.field1878 = arg0.method1741(-32769);
        this.field1877 = arg0.method1741(-32769);
        this.method918(arg0);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Lwm;)V", line = 15)
    public final void method918(class254 arg0) {
        this.field1880 = arg0.method1774((byte) 0);
        this.field1879 = new int[this.field1880];
        this.field1875 = new int[this.field1880];
        for (int var2 = 0; var2 < this.field1880; var2++) {
            this.field1879[var2] = arg0.method1755(false);
            this.field1875[var2] = arg0.method1755(false);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)I", line = 30)
    public final int method919(int arg0) {
        if (this.field1884 >= this.field1881) {
            this.field1883 = this.field1875[this.field1885++] << 15;
            if (this.field1885 >= this.field1880) {
                this.field1885 = this.field1880 - 1;
            }
            this.field1881 = (int) ((double) this.field1879[this.field1885] / 65536.0D * (double) arg0);
            if (this.field1881 > this.field1884) {
                this.field1882 = ((this.field1875[this.field1885] << 15) - this.field1883) / (this.field1881 - this.field1884);
            }
        }
        this.field1883 += this.field1882;
        this.field1884++;
        return this.field1883 - this.field1882 >> 15;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()V", line = 50)
    public final void method920() {
        this.field1881 = 0;
        this.field1885 = 0;
        this.field1882 = 0;
        this.field1883 = 0;
        this.field1884 = 0;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V", line = 56)
    public class123() {
        this.field1879[0] = 0;
        this.field1879[1] = 65535;
        this.field1875[0] = 0;
        this.field1875[1] = 65535;
    }
}
