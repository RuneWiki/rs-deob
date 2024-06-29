import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class85 {

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    private int field1942 = 2;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "[I")
    private int[] field1940 = new int[2];

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "[I")
    private int[] field1943 = new int[2];

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public int field1939;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public int field1941;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public int field1944;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    private int field1945;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    private int field1946;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    private int field1947;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    private int field1948;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    private int field1949;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)I")
    public final int method633(int arg0) {
        if (this.field1947 >= this.field1945) {
            this.field1949 = this.field1943[this.field1946++] << 15;
            if (this.field1946 >= this.field1942) {
                this.field1946 = this.field1942 - 1;
            }
            this.field1945 = (int) ((double) this.field1940[this.field1946] / 65536.0D * (double) arg0);
            if (this.field1945 > this.field1947) {
                this.field1948 = ((this.field1943[this.field1946] << 15) - this.field1949) / (this.field1945 - this.field1947);
            }
        }
        this.field1949 += this.field1948;
        this.field1947++;
        return this.field1949 - this.field1948 >> 15;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lce;)V")
    public final void method634(class26 arg0) {
        this.field1941 = arg0.method221(-117);
        this.field1944 = arg0.method240(8);
        this.field1939 = arg0.method240(8);
        this.method636(arg0);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "()V")
    public final void method635() {
        this.field1945 = 0;
        this.field1946 = 0;
        this.field1948 = 0;
        this.field1949 = 0;
        this.field1947 = 0;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lce;)V")
    public final void method636(class26 arg0) {
        this.field1942 = arg0.method221(-110);
        this.field1940 = new int[this.field1942];
        this.field1943 = new int[this.field1942];
        for (int var2 = 0; var2 < this.field1942; var2++) {
            this.field1940[var2] = arg0.method256((byte) -78);
            this.field1943[var2] = arg0.method256((byte) -78);
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
    public class85() {
        this.field1940[0] = 0;
        this.field1940[1] = 65535;
        this.field1943[0] = 0;
        this.field1943[1] = 65535;
    }
}
