import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class89 {

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    private int field995 = 2;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "[I")
    private int[] field998 = new int[2];

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "[I")
    private int[] field996 = new int[2];

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public int field1000;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    private int field1001;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    private int field1002;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    private int field1003;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    private int field1004;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    private int field1005;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public int field997;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public int field999;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lbk;)V")
    public final void method482(class211 arg0) {
        this.field995 = arg0.method1342((byte) -127);
        this.field998 = new int[this.field995];
        this.field996 = new int[this.field995];
        for (int var2 = 0; var2 < this.field995; var2++) {
            this.field998[var2] = arg0.method1355(32136);
            this.field996[var2] = arg0.method1355(32136);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)I")
    public final int method483(int arg0) {
        if (this.field1005 >= this.field1003) {
            this.field1001 = this.field996[this.field1002++] << 15;
            if (this.field1002 >= this.field995) {
                this.field1002 = this.field995 - 1;
            }
            this.field1003 = (int) ((double) this.field998[this.field1002] / 65536.0D * (double) arg0);
            if (this.field1003 > this.field1005) {
                this.field1004 = ((this.field996[this.field1002] << 15) - this.field1001) / (this.field1003 - this.field1005);
            }
        }
        this.field1001 += this.field1004;
        this.field1005++;
        return this.field1001 - this.field1004 >> 15;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(Lbk;)V")
    public final void method484(class211 arg0) {
        this.field999 = arg0.method1342((byte) -126);
        this.field997 = arg0.method1336((byte) -51);
        this.field1000 = arg0.method1336((byte) -44);
        this.method482(arg0);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "()V")
    public final void method485() {
        this.field1003 = 0;
        this.field1002 = 0;
        this.field1004 = 0;
        this.field1001 = 0;
        this.field1005 = 0;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
    public class89() {
        this.field998[0] = 0;
        this.field998[1] = 65535;
        this.field996[0] = 0;
        this.field996[1] = 65535;
    }
}
