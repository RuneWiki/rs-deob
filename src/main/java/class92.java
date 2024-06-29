import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class92 {

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    private int field2123 = 2;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "[I")
    private int[] field2121 = new int[2];

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "[I")
    private int[] field2118 = new int[2];

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public int field2119;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public int field2120;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public int field2122;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    private int field2124;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    private int field2125;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    private int field2126;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    private int field2127;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    private int field2128;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lb;)V")
    public final void method746(class8 arg0) {
        this.field2123 = arg0.method62((byte) 95);
        this.field2121 = new int[this.field2123];
        this.field2118 = new int[this.field2123];
        for (int var2 = 0; var2 < this.field2123; var2++) {
            this.field2121[var2] = arg0.method68(-2);
            this.field2118[var2] = arg0.method68(-2);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Lb;)V")
    public final void method747(class8 arg0) {
        this.field2122 = arg0.method62((byte) 82);
        this.field2120 = arg0.method70(false);
        this.field2119 = arg0.method70(false);
        this.method746(arg0);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)I")
    public final int method748(int arg0) {
        if (this.field2128 >= this.field2124) {
            this.field2126 = this.field2118[this.field2127++] << 15;
            if (this.field2127 >= this.field2123) {
                this.field2127 = this.field2123 - 1;
            }
            this.field2124 = (int) ((double) this.field2121[this.field2127] / 65536.0D * (double) arg0);
            if (this.field2124 > this.field2128) {
                this.field2125 = ((this.field2118[this.field2127] << 15) - this.field2126) / (this.field2124 - this.field2128);
            }
        }
        this.field2126 += this.field2125;
        this.field2128++;
        return this.field2126 - this.field2125 >> 15;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()V")
    public final void method749() {
        this.field2124 = 0;
        this.field2127 = 0;
        this.field2125 = 0;
        this.field2126 = 0;
        this.field2128 = 0;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    public class92() {
        this.field2121[0] = 0;
        this.field2121[1] = 65535;
        this.field2118[0] = 0;
        this.field2118[1] = 65535;
    }
}
