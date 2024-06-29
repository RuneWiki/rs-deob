import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class234 {

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    private int field4058 = 2;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "[I")
    private int[] field4055 = new int[2];

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "[I")
    private int[] field4056 = new int[2];

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public int field4053;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public int field4054;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public int field4057;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    private int field4059;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    private int field4060;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    private int field4061;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    private int field4062;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    private int field4063;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lnj;)V")
    public final void method1564(class226 arg0) {
        this.field4058 = arg0.method1471(255);
        this.field4055 = new int[this.field4058];
        this.field4056 = new int[this.field4058];
        for (int var2 = 0; var2 < this.field4058; var2++) {
            this.field4055[var2] = arg0.method1447(0);
            this.field4056[var2] = arg0.method1447(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)I")
    public final int method1565(int arg0) {
        if (this.field4062 >= this.field4059) {
            this.field4060 = this.field4056[this.field4063++] << 15;
            if (this.field4063 >= this.field4058) {
                this.field4063 = this.field4058 - 1;
            }
            this.field4059 = (int) ((double) this.field4055[this.field4063] / 65536.0D * (double) arg0);
            if (this.field4059 > this.field4062) {
                this.field4061 = ((this.field4056[this.field4063] << 15) - this.field4060) / (this.field4059 - this.field4062);
            }
        }
        this.field4060 += this.field4061;
        this.field4062++;
        return this.field4060 - this.field4061 >> 15;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()V")
    public final void method1566() {
        this.field4059 = 0;
        this.field4063 = 0;
        this.field4061 = 0;
        this.field4060 = 0;
        this.field4062 = 0;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Lnj;)V")
    public final void method1567(class226 arg0) {
        this.field4054 = arg0.method1471(255);
        this.field4053 = arg0.method1478(-32053);
        this.field4057 = arg0.method1478(-32053);
        this.method1564(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
    public class234() {
        this.field4055[0] = 0;
        this.field4055[1] = 65535;
        this.field4056[0] = 0;
        this.field4056[1] = 65535;
    }
}
