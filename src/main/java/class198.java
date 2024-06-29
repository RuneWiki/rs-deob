import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class198 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    private int field2800 = 2;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "[I")
    private int[] field2804 = new int[2];

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "[I")
    private int[] field2803 = new int[2];

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public int field2801;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public int field2802;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public int field2805;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    private int field2806;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    private int field2807;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    private int field2808;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    private int field2809;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    private int field2810;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ldaa;)V")
    public final void method1216(class11 arg0) {
        this.field2800 = arg0.method110((byte) 99);
        this.field2804 = new int[this.field2800];
        this.field2803 = new int[this.field2800];
        for (int var2 = 0; var2 < this.field2800; var2++) {
            this.field2804[var2] = arg0.method93((byte) 114);
            this.field2803[var2] = arg0.method93((byte) 105);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)I")
    public final int method1217(int arg0) {
        if (this.field2806 >= this.field2807) {
            this.field2810 = this.field2803[this.field2808++] << 15;
            if (this.field2808 >= this.field2800) {
                this.field2808 = this.field2800 - 1;
            }
            this.field2807 = (int) ((double) this.field2804[this.field2808] / 65536.0D * (double) arg0);
            if (this.field2807 > this.field2806) {
                this.field2809 = ((this.field2803[this.field2808] << 15) - this.field2810) / (this.field2807 - this.field2806);
            }
        }
        this.field2810 += this.field2809;
        this.field2806++;
        return this.field2810 - this.field2809 >> 15;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Ldaa;)V")
    public final void method1218(class11 arg0) {
        this.field2805 = arg0.method110((byte) 52);
        this.field2801 = arg0.method119(-61);
        this.field2802 = arg0.method119(-35);
        this.method1216(arg0);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "()V")
    public final void method1219() {
        this.field2807 = 0;
        this.field2808 = 0;
        this.field2809 = 0;
        this.field2810 = 0;
        this.field2806 = 0;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    public class198() {
        this.field2804[0] = 0;
        this.field2804[1] = 65535;
        this.field2803[0] = 0;
        this.field2803[1] = 65535;
    }
}
