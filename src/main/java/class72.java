import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class72 {

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
    private int field1071 = 2;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "[I")
    private int[] field1069 = new int[2];

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "[I")
    private int[] field1073 = new int[2];

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
    public int field1070;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
    private int field1074;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
    private int field1075;

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
    private int field1076;

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
    private int field1077;

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
    private int field1078;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "()V", line = 5)
    public final void method414() {
        this.field1075 = 0;
        this.field1078 = 0;
        this.field1076 = 0;
        this.field1077 = 0;
        this.field1074 = 0;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Ldh;)V", line = 13)
    public final void method415(class209 arg0) {
        this.field1071 = arg0.method1428(32122);
        this.field1069 = new int[this.field1071];
        this.field1073 = new int[this.field1071];
        for (int var2 = 0; var2 < this.field1071; var2++) {
            this.field1069[var2] = arg0.method1450((byte) 60);
            this.field1073[var2] = arg0.method1450((byte) 120);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)I", line = 28)
    public final int method416(int arg0) {
        if (this.field1074 >= this.field1075) {
            this.field1077 = this.field1073[this.field1078++] << 15;
            if (this.field1078 >= this.field1071) {
                this.field1078 = this.field1071 - 1;
            }
            this.field1075 = (int) ((double) this.field1069[this.field1078] / 65536.0D * (double) arg0);
            if (this.field1075 > this.field1074) {
                this.field1076 = ((this.field1073[this.field1078] << 15) - this.field1077) / (this.field1075 - this.field1074);
            }
        }
        this.field1077 += this.field1076;
        this.field1074++;
        return this.field1077 - this.field1076 >> 15;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(Ldh;)V", line = 47)
    public final void method417(class209 arg0) {
        this.field1070 = arg0.method1428(32122);
        this.field1068 = arg0.method1452(65280);
        this.field1072 = arg0.method1452(65280);
        this.method415(arg0);
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V", line = 56)
    public class72() {
        this.field1069[0] = 0;
        this.field1069[1] = 65535;
        this.field1073[0] = 0;
        this.field1073[1] = 65535;
    }
}
