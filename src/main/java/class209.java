import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class209 {

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    private int field3198 = 2;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "[I")
    private int[] field3199 = new int[2];

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "[I")
    private int[] field3196 = new int[2];

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public int field3197;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public int field3200;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public int field3201;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    private int field3202;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    private int field3203;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    private int field3204;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    private int field3205;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    private int field3206;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lkh;)V", line = 3)
    public final void method1483(class166 arg0) {
        this.field3200 = arg0.method1178(0);
        this.field3197 = arg0.method1137(105);
        this.field3201 = arg0.method1137(70);
        this.method1486(arg0);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)I", line = 9)
    public final int method1484(int arg0) {
        if (this.field3206 >= this.field3205) {
            this.field3203 = this.field3196[this.field3202++] << 15;
            if (this.field3202 >= this.field3198) {
                this.field3202 = this.field3198 - 1;
            }
            this.field3205 = (int) ((double) this.field3199[this.field3202] / 65536.0D * (double) arg0);
            if (this.field3205 > this.field3206) {
                this.field3204 = ((this.field3196[this.field3202] << 15) - this.field3203) / (this.field3205 - this.field3206);
            }
        }
        this.field3203 += this.field3204;
        this.field3206++;
        return this.field3203 - this.field3204 >> 15;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "()V", line = 31)
    public final void method1485() {
        this.field3205 = 0;
        this.field3202 = 0;
        this.field3204 = 0;
        this.field3203 = 0;
        this.field3206 = 0;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V", line = 41)
    public class209() {
        this.field3199[0] = 0;
        this.field3199[1] = 65535;
        this.field3196[0] = 0;
        this.field3196[1] = 65535;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(Lkh;)V", line = 51)
    public final void method1486(class166 arg0) {
        this.field3198 = arg0.method1178(0);
        this.field3199 = new int[this.field3198];
        this.field3196 = new int[this.field3198];
        for (int var2 = 0; var2 < this.field3198; var2++) {
            this.field3199[var2] = arg0.method1151(-82);
            this.field3196[var2] = arg0.method1151(-59);
        }
    }
}
