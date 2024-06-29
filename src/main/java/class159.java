import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class159 {

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    private int field2911 = 2;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "[I")
    private int[] field2912 = new int[2];

    @OriginalMember(owner = "client!me", name = "c", descriptor = "[I")
    private int[] field2913 = new int[2];

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public int field2914;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public int field2915;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public int field2916;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    private int field2917;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    private int field2918;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    private int field2919;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    private int field2920;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    private int field2921;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "()V")
    public final void method1062() {
        this.field2917 = 0;
        this.field2919 = 0;
        this.field2921 = 0;
        this.field2920 = 0;
        this.field2918 = 0;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)I")
    public final int method1063(int arg0) {
        if (this.field2918 >= this.field2917) {
            this.field2920 = this.field2913[this.field2919++] << 15;
            if (this.field2919 >= this.field2911) {
                this.field2919 = this.field2911 - 1;
            }
            this.field2917 = (int) ((double) this.field2912[this.field2919] / 65536.0D * (double) arg0);
            if (this.field2917 > this.field2918) {
                this.field2921 = ((this.field2913[this.field2919] << 15) - this.field2920) / (this.field2917 - this.field2918);
            }
        }
        this.field2920 += this.field2921;
        this.field2918++;
        return this.field2920 - this.field2921 >> 15;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    public class159() {
        this.field2912[0] = 0;
        this.field2912[1] = 65535;
        this.field2913[0] = 0;
        this.field2913[1] = 65535;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lng;)V")
    public final void method1064(class135 arg0) {
        this.field2916 = arg0.method920((byte) 113);
        this.field2914 = arg0.method949(3933);
        this.field2915 = arg0.method949(3933);
        this.method1065(arg0);
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(Lng;)V")
    public final void method1065(class135 arg0) {
        this.field2911 = arg0.method920((byte) 74);
        this.field2912 = new int[this.field2911];
        this.field2913 = new int[this.field2911];
        for (int var2 = 0; var2 < this.field2911; var2++) {
            this.field2912[var2] = arg0.method927(127);
            this.field2913[var2] = arg0.method927(127);
        }
    }
}
