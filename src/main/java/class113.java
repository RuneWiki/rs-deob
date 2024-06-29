import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class113 {

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    private int field2064 = 2;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "[I")
    private int[] field2060 = new int[2];

    @OriginalMember(owner = "client!me", name = "d", descriptor = "[I")
    private int[] field2063 = new int[2];

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public int field2061;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public int field2062;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public int field2065;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    private int field2066;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    private int field2067;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    private int field2068;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    private int field2069;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    private int field2070;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Loa;)V")
    public final void method694(class127 arg0) {
        this.field2064 = arg0.method819((byte) 22);
        this.field2060 = new int[this.field2064];
        this.field2063 = new int[this.field2064];
        for (int var2 = 0; var2 < this.field2064; var2++) {
            this.field2060[var2] = arg0.method785(true);
            this.field2063[var2] = arg0.method785(true);
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(Loa;)V")
    public final void method695(class127 arg0) {
        this.field2065 = arg0.method819((byte) 22);
        this.field2061 = arg0.method814(8);
        this.field2062 = arg0.method814(8);
        this.method694(arg0);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)I")
    public final int method696(int arg0) {
        if (this.field2066 >= this.field2067) {
            this.field2068 = this.field2063[this.field2070++] << 15;
            if (this.field2070 >= this.field2064) {
                this.field2070 = this.field2064 - 1;
            }
            this.field2067 = (int) ((double) this.field2060[this.field2070] / 65536.0D * (double) arg0);
            if (this.field2067 > this.field2066) {
                this.field2069 = ((this.field2063[this.field2070] << 15) - this.field2068) / (this.field2067 - this.field2066);
            }
        }
        this.field2068 += this.field2069;
        this.field2066++;
        return this.field2068 - this.field2069 >> 15;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "()V")
    public final void method697() {
        this.field2067 = 0;
        this.field2070 = 0;
        this.field2069 = 0;
        this.field2068 = 0;
        this.field2066 = 0;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    public class113() {
        this.field2060[0] = 0;
        this.field2060[1] = 65535;
        this.field2063[0] = 0;
        this.field2063[1] = 65535;
    }
}
