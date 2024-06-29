import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class185 {

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    private int field2728 = 2;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "[I")
    private int[] field2729 = new int[2];

    @OriginalMember(owner = "client!an", name = "b", descriptor = "[I")
    private int[] field2725 = new int[2];

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public int field2724;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public int field2726;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public int field2727;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    private int field2730;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    private int field2731;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "I")
    private int field2732;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "I")
    private int field2733;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    private int field2734;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "()V")
    public final void method1253() {
        this.field2730 = 0;
        this.field2731 = 0;
        this.field2733 = 0;
        this.field2734 = 0;
        this.field2732 = 0;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lgk;)V")
    public final void method1254(class468 arg0) {
        this.field2727 = arg0.method2765(104);
        this.field2726 = arg0.method2722(false);
        this.field2724 = arg0.method2722(false);
        this.method1256(arg0);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)I")
    public final int method1255(int arg0) {
        if (this.field2732 >= this.field2730) {
            this.field2734 = this.field2725[this.field2731++] << 15;
            if (this.field2731 >= this.field2728) {
                this.field2731 = this.field2728 - 1;
            }
            this.field2730 = (int) ((double) this.field2729[this.field2731] / 65536.0D * (double) arg0);
            if (this.field2730 > this.field2732) {
                this.field2733 = ((this.field2725[this.field2731] << 15) - this.field2734) / (this.field2730 - this.field2732);
            }
        }
        this.field2734 += this.field2733;
        this.field2732++;
        return this.field2734 - this.field2733 >> 15;
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
    public class185() {
        this.field2729[0] = 0;
        this.field2729[1] = 65535;
        this.field2725[0] = 0;
        this.field2725[1] = 65535;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(Lgk;)V")
    public final void method1256(class468 arg0) {
        this.field2728 = arg0.method2765(100);
        this.field2729 = new int[this.field2728];
        this.field2725 = new int[this.field2728];
        for (int var2 = 0; var2 < this.field2728; var2++) {
            this.field2729[var2] = arg0.method2727((byte) 43);
            this.field2725[var2] = arg0.method2727((byte) 43);
        }
    }
}
