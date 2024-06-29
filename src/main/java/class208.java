import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class208 {

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    private int field2679 = 2;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "[I")
    private int[] field2674 = new int[2];

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "[I")
    private int[] field2675 = new int[2];

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public int field2676;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public int field2677;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public int field2678;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    private int field2680;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    private int field2681;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    private int field2682;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    private int field2683;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    private int field2684;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "()V", line = 3)
    public final void method1333() {
        this.field2683 = 0;
        this.field2682 = 0;
        this.field2684 = 0;
        this.field2681 = 0;
        this.field2680 = 0;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)I", line = 11)
    public final int method1334(int arg0) {
        if (this.field2680 >= this.field2683) {
            this.field2681 = this.field2675[this.field2682++] << 15;
            if (this.field2682 >= this.field2679) {
                this.field2682 = this.field2679 - 1;
            }
            this.field2683 = (int) ((double) this.field2674[this.field2682] / 65536.0D * (double) arg0);
            if (this.field2683 > this.field2680) {
                this.field2684 = ((this.field2675[this.field2682] << 15) - this.field2681) / (this.field2683 - this.field2680);
            }
        }
        this.field2681 += this.field2684;
        this.field2680++;
        return this.field2681 - this.field2684 >> 15;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lfd;)V", line = 31)
    public final void method1335(class418 arg0) {
        this.field2679 = arg0.method2396(-113);
        this.field2674 = new int[this.field2679];
        this.field2675 = new int[this.field2679];
        for (int var2 = 0; var2 < this.field2679; var2++) {
            this.field2674[var2] = arg0.method2393(-30727);
            this.field2675[var2] = arg0.method2393(-30727);
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(Lfd;)V", line = 47)
    public final void method1336(class418 arg0) {
        this.field2677 = arg0.method2396(-109);
        this.field2676 = arg0.method2355(121);
        this.field2678 = arg0.method2355(119);
        this.method1335(arg0);
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V", line = 56)
    public class208() {
        this.field2674[0] = 0;
        this.field2674[1] = 65535;
        this.field2675[0] = 0;
        this.field2675[1] = 65535;
    }
}
