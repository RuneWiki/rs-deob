import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class Envelope {

    @OriginalMember(owner = "bc", name = "a", descriptor = "Z")
    private boolean field855 = true;

    @OriginalMember(owner = "bc", name = "b", descriptor = "Z")
    private boolean field856 = false;

    @OriginalMember(owner = "bc", name = "c", descriptor = "I")
    private int field857 = -491;

    @OriginalMember(owner = "bc", name = "d", descriptor = "I")
    private int field858;

    @OriginalMember(owner = "bc", name = "g", descriptor = "I")
    public int field861;

    @OriginalMember(owner = "bc", name = "h", descriptor = "I")
    public int field862;

    @OriginalMember(owner = "bc", name = "i", descriptor = "I")
    public int field863;

    @OriginalMember(owner = "bc", name = "j", descriptor = "I")
    private int field864;

    @OriginalMember(owner = "bc", name = "k", descriptor = "I")
    private int field865;

    @OriginalMember(owner = "bc", name = "l", descriptor = "I")
    private int field866;

    @OriginalMember(owner = "bc", name = "m", descriptor = "I")
    private int field867;

    @OriginalMember(owner = "bc", name = "n", descriptor = "I")
    private int field868;

    @OriginalMember(owner = "bc", name = "e", descriptor = "[I")
    private int[] field859;

    @OriginalMember(owner = "bc", name = "f", descriptor = "[I")
    private int[] field860;

    @OriginalMember(owner = "bc", name = "a", descriptor = "(ZLmb;)V")
    public final void method305(boolean arg0, Packet arg1) {
        this.field863 = arg1.method231();
        this.field861 = arg1.method236();
        this.field862 = arg1.method236();
        this.field858 = arg1.method231();
        this.field859 = new int[this.field858];
        this.field860 = new int[this.field858];
        for (int var3 = 0; var3 < this.field858; var3++) {
            this.field859[var3] = arg1.method233();
            this.field860[var3] = arg1.method233();
        }
        if (arg0) {
            this.field856 = !this.field856;
        } else if (Linkable.field365) {
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Z)V")
    public final void method306(boolean arg0) {
        this.field864 = 0;
        this.field865 = 0;
        if (arg0) {
            this.field866 = 0;
            this.field867 = 0;
            this.field868 = 0;
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IZ)I")
    public final int method307(int arg0, boolean arg1) {
        if (this.field868 >= this.field864) {
            this.field867 = this.field860[this.field865++] << 15;
            if (this.field865 >= this.field858) {
                this.field865 = this.field858 - 1;
            }
            this.field864 = (int) ((double) this.field859[this.field865] / 65536.0D * (double) arg0);
            if (this.field864 > this.field868) {
                this.field866 = ((this.field860[this.field865] << 15) - this.field867) / (this.field864 - this.field868);
            }
        }
        this.field867 += this.field866;
        this.field868++;
        if (arg1) {
            this.field857 = -83;
        }
        return this.field867 - this.field866 >> 15;
    }
}
