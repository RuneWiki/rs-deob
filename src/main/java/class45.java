import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class45 {

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    private int field1068 = 2;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "[I")
    private int[] field1065 = new int[2];

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "[I")
    private int[] field1063 = new int[2];

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public int field1066;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public int field1067;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    private int field1069;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    private int field1070;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    private int field1071;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    private int field1072;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    private int field1073;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()V")
    public final void method326() {
        this.field1069 = 0;
        this.field1070 = 0;
        this.field1073 = 0;
        this.field1072 = 0;
        this.field1071 = 0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)I")
    public final int method327(int arg0) {
        if (this.field1071 >= this.field1069) {
            this.field1072 = this.field1063[this.field1070++] << 15;
            if (this.field1070 >= this.field1068) {
                this.field1070 = this.field1068 - 1;
            }
            this.field1069 = (int) ((double) this.field1065[this.field1070] / 65536.0D * (double) arg0);
            if (this.field1069 > this.field1071) {
                this.field1073 = ((this.field1063[this.field1070] << 15) - this.field1072) / (this.field1069 - this.field1071);
            }
        }
        this.field1072 += this.field1073;
        this.field1071++;
        return this.field1072 - this.field1073 >> 15;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ltf;)V")
    public final void method328(class138 arg0) {
        this.field1066 = arg0.method1055(126);
        this.field1067 = arg0.method1062(1809568712);
        this.field1064 = arg0.method1062(1809568712);
        this.method329(arg0);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Ltf;)V")
    public final void method329(class138 arg0) {
        this.field1068 = arg0.method1055(116);
        this.field1065 = new int[this.field1068];
        this.field1063 = new int[this.field1068];
        for (int var2 = 0; var2 < this.field1068; var2++) {
            this.field1065[var2] = arg0.method1098(true);
            this.field1063[var2] = arg0.method1098(true);
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class45() {
        this.field1065[0] = 0;
        this.field1065[1] = 65535;
        this.field1063[0] = 0;
        this.field1063[1] = 65535;
    }
}
