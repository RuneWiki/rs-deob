import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class110 {

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    private int field1906 = 2;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "[I")
    private int[] field1907 = new int[2];

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "[I")
    private int[] field1904 = new int[2];

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public int field1905;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public int field1908;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public int field1909;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    private int field1910;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    private int field1911;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    private int field1912;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    private int field1913;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    private int field1914;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)I", line = 5)
    public final int method974(int arg0) {
        if (this.field1911 >= this.field1912) {
            this.field1914 = this.field1904[this.field1913++] << 15;
            if (this.field1913 >= this.field1906) {
                this.field1913 = this.field1906 - 1;
            }
            this.field1912 = (int) ((double) this.field1907[this.field1913] / 65536.0D * (double) arg0);
            if (this.field1912 > this.field1911) {
                this.field1910 = ((this.field1904[this.field1913] << 15) - this.field1914) / (this.field1912 - this.field1911);
            }
        }
        this.field1914 += this.field1910;
        this.field1911++;
        return this.field1914 - this.field1910 >> 15;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lcea;)V", line = 25)
    public final void method975(class215 arg0) {
        this.field1905 = arg0.method1535(255);
        this.field1909 = arg0.method1533((byte) -126);
        this.field1908 = arg0.method1533((byte) -126);
        this.method977(arg0);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()V", line = 33)
    public final void method976() {
        this.field1912 = 0;
        this.field1913 = 0;
        this.field1910 = 0;
        this.field1914 = 0;
        this.field1911 = 0;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V", line = 41)
    public class110() {
        this.field1907[0] = 0;
        this.field1907[1] = 65535;
        this.field1904[0] = 0;
        this.field1904[1] = 65535;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Lcea;)V", line = 52)
    public final void method977(class215 arg0) {
        this.field1906 = arg0.method1535(255);
        this.field1907 = new int[this.field1906];
        this.field1904 = new int[this.field1906];
        for (int var2 = 0; var2 < this.field1906; var2++) {
            this.field1907[var2] = arg0.method1478(842397944);
            this.field1904[var2] = arg0.method1478(842397944);
        }
    }
}
