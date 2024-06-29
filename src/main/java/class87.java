import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class87 {

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    private int field1070 = 2;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "[I")
    private int[] field1068 = new int[2];

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "[I")
    private int[] field1066 = new int[2];

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public int field1067;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public int field1069;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    private int field1071;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    private int field1072;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    private int field1073;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    private int field1074;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    private int field1075;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)I")
    public final int method473(int arg0) {
        if (this.field1072 >= this.field1075) {
            this.field1074 = this.field1066[this.field1071++] << 15;
            if (this.field1071 >= this.field1070) {
                this.field1071 = this.field1070 - 1;
            }
            this.field1075 = (int) ((double) this.field1068[this.field1071] / 65536.0D * (double) arg0);
            if (this.field1075 > this.field1072) {
                this.field1073 = ((this.field1066[this.field1071] << 15) - this.field1074) / (this.field1075 - this.field1072);
            }
        }
        this.field1074 += this.field1073;
        this.field1072++;
        return this.field1074 - this.field1073 >> 15;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "()V")
    public final void method474() {
        this.field1075 = 0;
        this.field1071 = 0;
        this.field1073 = 0;
        this.field1074 = 0;
        this.field1072 = 0;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lpd;)V")
    public final void method475(class96 arg0) {
        this.field1070 = arg0.method584(255);
        this.field1068 = new int[this.field1070];
        this.field1066 = new int[this.field1070];
        for (int var2 = 0; var2 < this.field1070; var2++) {
            this.field1068[var2] = arg0.method549(255);
            this.field1066[var2] = arg0.method549(255);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(Lpd;)V")
    public final void method476(class96 arg0) {
        this.field1065 = arg0.method584(255);
        this.field1067 = arg0.method597(-1197332568);
        this.field1069 = arg0.method597(-1197332568);
        this.method475(arg0);
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class87() {
        this.field1068[0] = 0;
        this.field1068[1] = 65535;
        this.field1066[0] = 0;
        this.field1066[1] = 65535;
    }
}
