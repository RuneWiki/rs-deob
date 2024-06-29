import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class85 {

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    private int field2199 = 2;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "[I")
    private int[] field2194 = new int[2];

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "[I")
    private int[] field2196 = new int[2];

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public int field2195;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public int field2197;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public int field2198;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    private int field2200;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    private int field2201;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    private int field2202;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    private int field2203;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    private int field2204;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkd;)V", line = 4)
    public final void method679(class64 arg0) {
        this.field2199 = arg0.method520(-123);
        this.field2194 = new int[this.field2199];
        this.field2196 = new int[this.field2199];
        for (int var2 = 0; var2 < this.field2199; var2++) {
            this.field2194[var2] = arg0.method506((byte) -90);
            this.field2196[var2] = arg0.method506((byte) -90);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()V", line = 20)
    public final void method680() {
        this.field2200 = 0;
        this.field2204 = 0;
        this.field2203 = 0;
        this.field2202 = 0;
        this.field2201 = 0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)I", line = 28)
    public final int method681(int arg0) {
        if (this.field2201 >= this.field2200) {
            this.field2202 = this.field2196[this.field2204++] << 15;
            if (this.field2204 >= this.field2199) {
                this.field2204 = this.field2199 - 1;
            }
            this.field2200 = (int) ((double) this.field2194[this.field2204] / 65536.0D * (double) arg0);
            if (this.field2200 > this.field2201) {
                this.field2203 = ((this.field2196[this.field2204] << 15) - this.field2202) / (this.field2200 - this.field2201);
            }
        }
        this.field2202 += this.field2203;
        this.field2201++;
        return this.field2202 - this.field2203 >> 15;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Lkd;)V", line = 50)
    public final void method682(class64 arg0) {
        this.field2197 = arg0.method520(-126);
        this.field2195 = arg0.method487(128);
        this.field2198 = arg0.method487(128);
        this.method679(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V", line = 55)
    public class85() {
        this.field2194[0] = 0;
        this.field2194[1] = 65535;
        this.field2196[0] = 0;
        this.field2196[1] = 65535;
    }
}
