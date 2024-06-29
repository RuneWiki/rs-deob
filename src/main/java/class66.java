import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class66 {

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    private int field1004 = 2;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "[I")
    private int[] field1007 = new int[2];

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "[I")
    private int[] field1003 = new int[2];

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public int field1002;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public int field1005;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public int field1006;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    private int field1008;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    private int field1009;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    private int field1010;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    private int field1011;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    private int field1012;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)I", line = 4)
    public final int method542(int arg0) {
        if (this.field1011 >= this.field1009) {
            this.field1008 = this.field1003[this.field1010++] << 15;
            if (this.field1010 >= this.field1004) {
                this.field1010 = this.field1004 - 1;
            }
            this.field1009 = (int) ((double) this.field1007[this.field1010] / 65536.0D * (double) arg0);
            if (this.field1009 > this.field1011) {
                this.field1012 = ((this.field1003[this.field1010] << 15) - this.field1008) / (this.field1009 - this.field1011);
            }
        }
        this.field1008 += this.field1012;
        this.field1011++;
        return this.field1008 - this.field1012 >> 15;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "()V", line = 24)
    public final void method543() {
        this.field1009 = 0;
        this.field1010 = 0;
        this.field1012 = 0;
        this.field1008 = 0;
        this.field1011 = 0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ls;)V", line = 35)
    public final void method544(class170 arg0) {
        this.field1002 = arg0.method1221(84);
        this.field1006 = arg0.method1233((byte) -77);
        this.field1005 = arg0.method1233((byte) -77);
        this.method545(arg0);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(Ls;)V", line = 41)
    public final void method545(class170 arg0) {
        this.field1004 = arg0.method1221(118);
        this.field1007 = new int[this.field1004];
        this.field1003 = new int[this.field1004];
        for (int var2 = 0; var2 < this.field1004; var2++) {
            this.field1007[var2] = arg0.method1214(-18254);
            this.field1003[var2] = arg0.method1214(-18254);
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V", line = 56)
    public class66() {
        this.field1007[0] = 0;
        this.field1007[1] = 65535;
        this.field1003[0] = 0;
        this.field1003[1] = 65535;
    }
}
