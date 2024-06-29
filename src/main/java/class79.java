import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class79 {

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    private int field1057 = 2;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "[I")
    private int[] field1053 = new int[2];

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "[I")
    private int[] field1058 = new int[2];

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public int field1054;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public int field1056;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    private int field1059;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    private int field1060;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    private int field1061;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    private int field1062;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    private int field1063;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "()V")
    public final void method720() {
        this.field1060 = 0;
        this.field1059 = 0;
        this.field1062 = 0;
        this.field1061 = 0;
        this.field1063 = 0;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Liv;)V")
    public final void method721(class65 arg0) {
        this.field1054 = arg0.method577(255);
        this.field1055 = arg0.method616((byte) 97);
        this.field1056 = arg0.method616((byte) 107);
        this.method723(arg0);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)I")
    public final int method722(int arg0) {
        if (this.field1063 >= this.field1060) {
            this.field1061 = this.field1058[this.field1059++] << 15;
            if (this.field1059 >= this.field1057) {
                this.field1059 = this.field1057 - 1;
            }
            this.field1060 = (int) ((double) this.field1053[this.field1059] / 65536.0D * (double) arg0);
            if (this.field1060 > this.field1063) {
                this.field1062 = ((this.field1058[this.field1059] << 15) - this.field1061) / (this.field1060 - this.field1063);
            }
        }
        this.field1061 += this.field1062;
        this.field1063++;
        return this.field1061 - this.field1062 >> 15;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
    public class79() {
        this.field1053[0] = 0;
        this.field1053[1] = 65535;
        this.field1058[0] = 0;
        this.field1058[1] = 65535;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(Liv;)V")
    public final void method723(class65 arg0) {
        this.field1057 = arg0.method577(255);
        this.field1053 = new int[this.field1057];
        this.field1058 = new int[this.field1057];
        for (int var2 = 0; var2 < this.field1057; var2++) {
            this.field1053[var2] = arg0.method623((byte) -73);
            this.field1058[var2] = arg0.method623((byte) -116);
        }
    }
}
