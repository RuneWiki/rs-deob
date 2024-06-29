import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class172 {

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    private int field3068 = 2;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "[I")
    private int[] field3063 = new int[2];

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "[I")
    private int[] field3064 = new int[2];

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public int field3065;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public int field3066;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public int field3067;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    private int field3069;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    private int field3070;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    private int field3071;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    private int field3072;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    private int field3073;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lwe;)V")
    public final void method1225(class75 arg0) {
        this.field3068 = arg0.method558(1);
        this.field3063 = new int[this.field3068];
        this.field3064 = new int[this.field3068];
        for (int var2 = 0; var2 < this.field3068; var2++) {
            this.field3063[var2] = arg0.method545((byte) -83);
            this.field3064[var2] = arg0.method545((byte) -103);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "()V")
    public final void method1226() {
        this.field3069 = 0;
        this.field3072 = 0;
        this.field3073 = 0;
        this.field3071 = 0;
        this.field3070 = 0;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)I")
    public final int method1227(int arg0) {
        if (this.field3070 >= this.field3069) {
            this.field3071 = this.field3064[this.field3072++] << 15;
            if (this.field3072 >= this.field3068) {
                this.field3072 = this.field3068 - 1;
            }
            this.field3069 = (int) ((double) this.field3063[this.field3072] / 65536.0D * (double) arg0);
            if (this.field3069 > this.field3070) {
                this.field3073 = ((this.field3064[this.field3072] << 15) - this.field3071) / (this.field3069 - this.field3070);
            }
        }
        this.field3071 += this.field3073;
        this.field3070++;
        return this.field3071 - this.field3073 >> 15;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Lwe;)V")
    public final void method1228(class75 arg0) {
        this.field3067 = arg0.method558(1);
        this.field3066 = arg0.method562((byte) -71);
        this.field3065 = arg0.method562((byte) -71);
        this.method1225(arg0);
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
    public class172() {
        this.field3063[0] = 0;
        this.field3063[1] = 65535;
        this.field3064[0] = 0;
        this.field3064[1] = 65535;
    }
}
