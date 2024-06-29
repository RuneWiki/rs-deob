import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class234 {

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    private int field4028 = 2;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "[I")
    private int[] field4030 = new int[2];

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "[I")
    private int[] field4027 = new int[2];

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public int field4025;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public int field4026;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public int field4029;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    private int field4031;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    private int field4032;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    private int field4033;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    private int field4034;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    private int field4035;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lk;)V")
    public final void method1542(class152 arg0) {
        this.field4025 = arg0.method1051((byte) 105);
        this.field4029 = arg0.method1042(116);
        this.field4026 = arg0.method1042(121);
        this.method1544(arg0);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "()V")
    public final void method1543() {
        this.field4033 = 0;
        this.field4031 = 0;
        this.field4032 = 0;
        this.field4035 = 0;
        this.field4034 = 0;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Lk;)V")
    public final void method1544(class152 arg0) {
        this.field4028 = arg0.method1051((byte) 83);
        this.field4030 = new int[this.field4028];
        this.field4027 = new int[this.field4028];
        for (int var2 = 0; var2 < this.field4028; var2++) {
            this.field4030[var2] = arg0.method1063(-17162);
            this.field4027[var2] = arg0.method1063(-17162);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)I")
    public final int method1545(int arg0) {
        if (this.field4034 >= this.field4033) {
            this.field4035 = this.field4027[this.field4031++] << 15;
            if (this.field4031 >= this.field4028) {
                this.field4031 = this.field4028 - 1;
            }
            this.field4033 = (int) ((double) this.field4030[this.field4031] / 65536.0D * (double) arg0);
            if (this.field4033 > this.field4034) {
                this.field4032 = ((this.field4027[this.field4031] << 15) - this.field4035) / (this.field4033 - this.field4034);
            }
        }
        this.field4035 += this.field4032;
        this.field4034++;
        return this.field4035 - this.field4032 >> 15;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class234() {
        this.field4030[0] = 0;
        this.field4030[1] = 65535;
        this.field4027[0] = 0;
        this.field4027[1] = 65535;
    }
}
