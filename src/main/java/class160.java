import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class160 {

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
    private int field2426 = 2;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "[I")
    private int[] field2421 = new int[2];

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "[I")
    private int[] field2422 = new int[2];

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
    public int field2423;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    public int field2424;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "I")
    public int field2425;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
    private int field2427;

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
    private int field2428;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
    private int field2429;

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
    private int field2430;

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "I")
    private int field2431;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lfh;)V", line = 6)
    public final void method1151(class194 arg0) {
        this.field2426 = arg0.method1337((byte) -120);
        this.field2421 = new int[this.field2426];
        this.field2422 = new int[this.field2426];
        for (int var2 = 0; var2 < this.field2426; var2++) {
            this.field2421[var2] = arg0.method1396(81);
            this.field2422[var2] = arg0.method1396(55);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)I", line = 22)
    public final int method1152(int arg0) {
        if (this.field2430 >= this.field2431) {
            this.field2427 = this.field2422[this.field2428++] << 15;
            if (this.field2428 >= this.field2426) {
                this.field2428 = this.field2426 - 1;
            }
            this.field2431 = (int) ((double) this.field2421[this.field2428] / 65536.0D * (double) arg0);
            if (this.field2431 > this.field2430) {
                this.field2429 = ((this.field2422[this.field2428] << 15) - this.field2427) / (this.field2431 - this.field2430);
            }
        }
        this.field2427 += this.field2429;
        this.field2430++;
        return this.field2427 - this.field2429 >> 15;
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(Lfh;)V", line = 40)
    public final void method1153(class194 arg0) {
        this.field2425 = arg0.method1337((byte) 79);
        this.field2424 = arg0.method1401(127);
        this.field2423 = arg0.method1401(123);
        this.method1151(arg0);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "()V", line = 46)
    public final void method1154() {
        this.field2431 = 0;
        this.field2428 = 0;
        this.field2429 = 0;
        this.field2427 = 0;
        this.field2430 = 0;
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "()V", line = 56)
    public class160() {
        this.field2421[0] = 0;
        this.field2421[1] = 65535;
        this.field2422[0] = 0;
        this.field2422[1] = 65535;
    }
}
