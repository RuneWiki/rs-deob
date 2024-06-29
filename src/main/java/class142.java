import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class142 {

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    private int field2341 = 2;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "[I")
    private int[] field2338 = new int[2];

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "[I")
    private int[] field2339 = new int[2];

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public int field2336;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public int field2337;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public int field2340;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    private int field2342;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    private int field2343;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    private int field2344;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
    private int field2345;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    private int field2346;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)I", line = 3)
    public final int method1179(int arg0) {
        if (this.field2343 >= this.field2344) {
            this.field2346 = this.field2339[this.field2345++] << 15;
            if (this.field2345 >= this.field2341) {
                this.field2345 = this.field2341 - 1;
            }
            this.field2344 = (int) ((double) this.field2338[this.field2345] / 65536.0D * (double) arg0);
            if (this.field2344 > this.field2343) {
                this.field2342 = ((this.field2339[this.field2345] << 15) - this.field2346) / (this.field2344 - this.field2343);
            }
        }
        this.field2346 += this.field2342;
        this.field2343++;
        return this.field2346 - this.field2342 >> 15;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lug;)V", line = 24)
    public final void method1180(class25 arg0) {
        this.field2336 = arg0.method281(-127);
        this.field2340 = arg0.method262((byte) 46);
        this.field2337 = arg0.method262((byte) 126);
        this.method1181(arg0);
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(Lug;)V", line = 30)
    public final void method1181(class25 arg0) {
        this.field2341 = arg0.method281(54);
        this.field2338 = new int[this.field2341];
        this.field2339 = new int[this.field2341];
        for (int var2 = 0; var2 < this.field2341; var2++) {
            this.field2338[var2] = arg0.method314((byte) 83);
            this.field2339[var2] = arg0.method314((byte) 59);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "()V", line = 47)
    public final void method1182() {
        this.field2344 = 0;
        this.field2345 = 0;
        this.field2342 = 0;
        this.field2346 = 0;
        this.field2343 = 0;
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V", line = 56)
    public class142() {
        this.field2338[0] = 0;
        this.field2338[1] = 65535;
        this.field2339[0] = 0;
        this.field2339[1] = 65535;
    }
}
