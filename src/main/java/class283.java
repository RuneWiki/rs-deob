import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class283 {

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    private int field4983 = 2;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "[I")
    private int[] field4986 = new int[2];

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "[I")
    private int[] field4981 = new int[2];

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public int field4982;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public int field4984;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public int field4985;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    private int field4987;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    private int field4988;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    private int field4989;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    private int field4990;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    private int field4991;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljd;)V")
    public final void method1923(class118 arg0) {
        this.field4983 = arg0.method867(false);
        this.field4986 = new int[this.field4983];
        this.field4981 = new int[this.field4983];
        for (int var2 = 0; var2 < this.field4983; var2++) {
            this.field4986[var2] = arg0.method827(255);
            this.field4981[var2] = arg0.method827(255);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()V")
    public final void method1924() {
        this.field4989 = 0;
        this.field4990 = 0;
        this.field4988 = 0;
        this.field4991 = 0;
        this.field4987 = 0;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Ljd;)V")
    public final void method1925(class118 arg0) {
        this.field4984 = arg0.method867(false);
        this.field4985 = arg0.method875((byte) 122);
        this.field4982 = arg0.method875((byte) 31);
        this.method1923(arg0);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)I")
    public final int method1926(int arg0) {
        if (this.field4987 >= this.field4989) {
            this.field4991 = this.field4981[this.field4990++] << 15;
            if (this.field4990 >= this.field4983) {
                this.field4990 = this.field4983 - 1;
            }
            this.field4989 = (int) ((double) this.field4986[this.field4990] / 65536.0D * (double) arg0);
            if (this.field4989 > this.field4987) {
                this.field4988 = ((this.field4981[this.field4990] << 15) - this.field4991) / (this.field4989 - this.field4987);
            }
        }
        this.field4991 += this.field4988;
        this.field4987++;
        return this.field4991 - this.field4988 >> 15;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
    public class283() {
        this.field4986[0] = 0;
        this.field4986[1] = 65535;
        this.field4981[0] = 0;
        this.field4981[1] = 65535;
    }
}
