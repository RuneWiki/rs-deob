import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class133 {

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    private int field1938 = 2;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "[I")
    private int[] field1937 = new int[2];

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "[I")
    private int[] field1941 = new int[2];

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public int field1936;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public int field1939;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public int field1940;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    private int field1942;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    private int field1943;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    private int field1944;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    private int field1945;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    private int field1946;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)I")
    public final int method904(int arg0) {
        if (this.field1946 >= this.field1944) {
            this.field1942 = this.field1941[this.field1945++] << 15;
            if (this.field1945 >= this.field1938) {
                this.field1945 = this.field1938 - 1;
            }
            this.field1944 = (int) ((double) this.field1937[this.field1945] / 65536.0D * (double) arg0);
            if (this.field1944 > this.field1946) {
                this.field1943 = ((this.field1941[this.field1945] << 15) - this.field1942) / (this.field1944 - this.field1946);
            }
        }
        this.field1942 += this.field1943;
        this.field1946++;
        return this.field1942 - this.field1943 >> 15;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Llj;)V")
    public final void method905(class25 arg0) {
        this.field1938 = arg0.method201(255);
        this.field1937 = new int[this.field1938];
        this.field1941 = new int[this.field1938];
        for (int var2 = 0; var2 < this.field1938; var2++) {
            this.field1937[var2] = arg0.method190(-3);
            this.field1941[var2] = arg0.method190(-3);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "()V")
    public final void method906() {
        this.field1944 = 0;
        this.field1945 = 0;
        this.field1943 = 0;
        this.field1942 = 0;
        this.field1946 = 0;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(Llj;)V")
    public final void method907(class25 arg0) {
        this.field1940 = arg0.method201(255);
        this.field1939 = arg0.method214((byte) 44);
        this.field1936 = arg0.method214((byte) 44);
        this.method905(arg0);
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    public class133() {
        this.field1937[0] = 0;
        this.field1937[1] = 65535;
        this.field1941[0] = 0;
        this.field1941[1] = 65535;
    }
}
