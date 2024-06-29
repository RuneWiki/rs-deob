import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class125 {

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    private int field2087 = 2;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "[I")
    private int[] field2086 = new int[2];

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "[I")
    private int[] field2090 = new int[2];

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public int field2088;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public int field2089;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public int field2091;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    private int field2092;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    private int field2093;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    private int field2094;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    private int field2095;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    private int field2096;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "()V", line = 5)
    public final void method921() {
        this.field2096 = 0;
        this.field2092 = 0;
        this.field2095 = 0;
        this.field2093 = 0;
        this.field2094 = 0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)I", line = 12)
    public final int method922(int arg0) {
        if (this.field2094 >= this.field2096) {
            this.field2093 = this.field2090[this.field2092++] << 15;
            if (this.field2092 >= this.field2087) {
                this.field2092 = this.field2087 - 1;
            }
            this.field2096 = (int) ((double) this.field2086[this.field2092] / 65536.0D * (double) arg0);
            if (this.field2096 > this.field2094) {
                this.field2095 = ((this.field2090[this.field2092] << 15) - this.field2093) / (this.field2096 - this.field2094);
            }
        }
        this.field2093 += this.field2095;
        this.field2094++;
        return this.field2093 - this.field2095 >> 15;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lhb;)V", line = 30)
    public final void method923(class164 arg0) {
        this.field2091 = arg0.method1178(8);
        this.field2088 = arg0.method1191(31776);
        this.field2089 = arg0.method1191(31776);
        this.method924(arg0);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lhb;)V", line = 38)
    public final void method924(class164 arg0) {
        this.field2087 = arg0.method1178(8);
        this.field2086 = new int[this.field2087];
        this.field2090 = new int[this.field2087];
        for (int var2 = 0; var2 < this.field2087; var2++) {
            this.field2086[var2] = arg0.method1161(true);
            this.field2090[var2] = arg0.method1161(true);
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V", line = 56)
    public class125() {
        this.field2086[0] = 0;
        this.field2086[1] = 65535;
        this.field2090[0] = 0;
        this.field2090[1] = 65535;
    }
}
