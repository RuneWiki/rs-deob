import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class45 {

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    private int field1088 = 2;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "[I")
    private int[] field1085 = new int[2];

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "[I")
    private int[] field1089 = new int[2];

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public int field1084;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public int field1086;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public int field1087;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    private int field1090;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    private int field1091;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    private int field1092;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    private int field1093;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    private int field1094;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()V")
    public final void method349() {
        this.field1093 = 0;
        this.field1092 = 0;
        this.field1090 = 0;
        this.field1091 = 0;
        this.field1094 = 0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lic;)V")
    public final void method350(class59 arg0) {
        this.field1084 = arg0.method480(0);
        this.field1086 = arg0.method498((byte) 126);
        this.field1087 = arg0.method498((byte) 122);
        this.method351(arg0);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lic;)V")
    public final void method351(class59 arg0) {
        this.field1088 = arg0.method480(0);
        this.field1085 = new int[this.field1088];
        this.field1089 = new int[this.field1088];
        for (int var2 = 0; var2 < this.field1088; var2++) {
            this.field1085[var2] = arg0.method483((byte) 24);
            this.field1089[var2] = arg0.method483((byte) 24);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)I")
    public final int method352(int arg0) {
        if (this.field1094 >= this.field1093) {
            this.field1091 = this.field1089[this.field1092++] << 15;
            if (this.field1092 >= this.field1088) {
                this.field1092 = this.field1088 - 1;
            }
            this.field1093 = (int) ((double) this.field1085[this.field1092] / 65536.0D * (double) arg0);
            if (this.field1093 > this.field1094) {
                this.field1090 = ((this.field1089[this.field1092] << 15) - this.field1091) / (this.field1093 - this.field1094);
            }
        }
        this.field1091 += this.field1090;
        this.field1094++;
        return this.field1091 - this.field1090 >> 15;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class45() {
        this.field1085[0] = 0;
        this.field1085[1] = 65535;
        this.field1089[0] = 0;
        this.field1089[1] = 65535;
    }
}
