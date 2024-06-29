import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class87 {

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    private int field2217 = 2;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "[I")
    private int[] field2215 = new int[2];

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "[I")
    private int[] field2218 = new int[2];

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public int field2213;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public int field2214;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public int field2216;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    private int field2219;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    private int field2220;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    private int field2221;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    private int field2222;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    private int field2223;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "()V", line = 3)
    public final void method707() {
        this.field2221 = 0;
        this.field2220 = 0;
        this.field2219 = 0;
        this.field2222 = 0;
        this.field2223 = 0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lwd;)V", line = 11)
    public final void method708(class131 arg0) {
        this.field2216 = arg0.method971(true);
        this.field2213 = arg0.method994((byte) 36);
        this.field2214 = arg0.method994((byte) 36);
        this.method710(arg0);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)I", line = 18)
    public final int method709(int arg0) {
        if (this.field2223 >= this.field2221) {
            this.field2222 = this.field2218[this.field2220++] << 15;
            if (this.field2220 >= this.field2217) {
                this.field2220 = this.field2217 - 1;
            }
            this.field2221 = (int) ((double) this.field2215[this.field2220] / 65536.0D * (double) arg0);
            if (this.field2221 > this.field2223) {
                this.field2219 = ((this.field2218[this.field2220] << 15) - this.field2222) / (this.field2221 - this.field2223);
            }
        }
        this.field2222 += this.field2219;
        this.field2223++;
        return this.field2222 - this.field2219 >> 15;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(Lwd;)V", line = 40)
    public final void method710(class131 arg0) {
        this.field2217 = arg0.method971(true);
        this.field2215 = new int[this.field2217];
        this.field2218 = new int[this.field2217];
        for (int var2 = 0; var2 < this.field2217; var2++) {
            this.field2215[var2] = arg0.method1001(65280);
            this.field2218[var2] = arg0.method1001(65280);
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V", line = 56)
    public class87() {
        this.field2215[0] = 0;
        this.field2215[1] = 65535;
        this.field2218[0] = 0;
        this.field2218[1] = 65535;
    }
}
