import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class188 {

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    private int field2911 = 2;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "[I")
    private int[] field2913 = new int[2];

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "[I")
    private int[] field2910 = new int[2];

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public int field2908;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public int field2909;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public int field2912;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    private int field2914;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    private int field2915;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    private int field2916;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    private int field2917;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    private int field2918;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lai;)V")
    public final void method1268(class88 arg0) {
        this.field2908 = arg0.method633(84);
        this.field2909 = arg0.method641(-1);
        this.field2912 = arg0.method641(-1);
        this.method1271(arg0);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)I")
    public final int method1269(int arg0) {
        if (this.field2917 >= this.field2916) {
            this.field2915 = this.field2910[this.field2914++] << 15;
            if (this.field2914 >= this.field2911) {
                this.field2914 = this.field2911 - 1;
            }
            this.field2916 = (int) ((double) this.field2913[this.field2914] / 65536.0D * (double) arg0);
            if (this.field2916 > this.field2917) {
                this.field2918 = ((this.field2910[this.field2914] << 15) - this.field2915) / (this.field2916 - this.field2917);
            }
        }
        this.field2915 += this.field2918;
        this.field2917++;
        return this.field2915 - this.field2918 >> 15;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()V")
    public final void method1270() {
        this.field2916 = 0;
        this.field2914 = 0;
        this.field2918 = 0;
        this.field2915 = 0;
        this.field2917 = 0;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Lai;)V")
    public final void method1271(class88 arg0) {
        this.field2911 = arg0.method633(65);
        this.field2913 = new int[this.field2911];
        this.field2910 = new int[this.field2911];
        for (int var2 = 0; var2 < this.field2911; var2++) {
            this.field2913[var2] = arg0.method645(11596);
            this.field2910[var2] = arg0.method645(11596);
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class188() {
        this.field2913[0] = 0;
        this.field2913[1] = 65535;
        this.field2910[0] = 0;
        this.field2910[1] = 65535;
    }
}
