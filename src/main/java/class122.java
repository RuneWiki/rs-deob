import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class122 {

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    private int field1943 = 2;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "[I")
    private int[] field1940 = new int[2];

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "[I")
    private int[] field1938 = new int[2];

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public int field1939;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public int field1941;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public int field1942;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    private int field1944;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    private int field1945;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    private int field1946;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    private int field1947;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    private int field1948;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lwd;)V")
    public final void method859(class162 arg0) {
        this.field1943 = arg0.method1133((byte) 53);
        this.field1940 = new int[this.field1943];
        this.field1938 = new int[this.field1943];
        for (int var2 = 0; var2 < this.field1943; var2++) {
            this.field1940[var2] = arg0.method1142(-18970);
            this.field1938[var2] = arg0.method1142(-18970);
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Lwd;)V")
    public final void method860(class162 arg0) {
        this.field1939 = arg0.method1133((byte) 53);
        this.field1941 = arg0.method1157(65280);
        this.field1942 = arg0.method1157(65280);
        this.method859(arg0);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()V")
    public final void method861() {
        this.field1944 = 0;
        this.field1948 = 0;
        this.field1947 = 0;
        this.field1946 = 0;
        this.field1945 = 0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)I")
    public final int method862(int arg0) {
        if (this.field1945 >= this.field1944) {
            this.field1946 = this.field1938[this.field1948++] << 15;
            if (this.field1948 >= this.field1943) {
                this.field1948 = this.field1943 - 1;
            }
            this.field1944 = (int) ((double) this.field1940[this.field1948] / 65536.0D * (double) arg0);
            if (this.field1944 > this.field1945) {
                this.field1947 = ((this.field1938[this.field1948] << 15) - this.field1946) / (this.field1944 - this.field1945);
            }
        }
        this.field1946 += this.field1947;
        this.field1945++;
        return this.field1946 - this.field1947 >> 15;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class122() {
        this.field1940[0] = 0;
        this.field1940[1] = 65535;
        this.field1938[0] = 0;
        this.field1938[1] = 65535;
    }
}
