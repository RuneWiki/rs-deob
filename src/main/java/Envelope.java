import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class Envelope {

    @OriginalMember(owner = "bc", name = "a", descriptor = "Z")
    private boolean field864 = true;

    @OriginalMember(owner = "bc", name = "b", descriptor = "I")
    private int field865;

    @OriginalMember(owner = "bc", name = "c", descriptor = "I")
    private int field866;

    @OriginalMember(owner = "bc", name = "f", descriptor = "I")
    public int field869;

    @OriginalMember(owner = "bc", name = "g", descriptor = "I")
    public int field870;

    @OriginalMember(owner = "bc", name = "h", descriptor = "I")
    public int field871;

    @OriginalMember(owner = "bc", name = "i", descriptor = "I")
    private int field872;

    @OriginalMember(owner = "bc", name = "j", descriptor = "I")
    private int field873;

    @OriginalMember(owner = "bc", name = "k", descriptor = "I")
    private int field874;

    @OriginalMember(owner = "bc", name = "l", descriptor = "I")
    private int field875;

    @OriginalMember(owner = "bc", name = "m", descriptor = "I")
    private int field876;

    @OriginalMember(owner = "bc", name = "d", descriptor = "[I")
    private int[] field867;

    @OriginalMember(owner = "bc", name = "e", descriptor = "[I")
    private int[] field868;

    @OriginalMember(owner = "bc", name = "a", descriptor = "(ILmb;)V")
    public final void method309(int arg0, Packet arg1) {
        this.field871 = arg1.method231();
        this.field869 = arg1.method236();
        this.field870 = arg1.method236();
        this.field866 = arg1.method231();
        if (arg0 != 3251) {
            this.field865 = -438;
        }
        this.field867 = new int[this.field866];
        this.field868 = new int[this.field866];
        for (int var3 = 0; var3 < this.field866; var3++) {
            this.field867[var3] = arg1.method233();
            this.field868[var3] = arg1.method233();
        }
        if (Linkable.field369) {
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Z)V")
    public final void method310(boolean arg0) {
        this.field872 = 0;
        this.field873 = 0;
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field874 = 0;
        this.field875 = 0;
        this.field876 = 0;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(II)I")
    public final int method311(int arg0, int arg1) {
        if (this.field876 >= this.field872) {
            this.field875 = this.field868[this.field873++] << 15;
            if (this.field873 >= this.field866) {
                this.field873 = this.field866 - 1;
            }
            this.field872 = (int) ((double) this.field867[this.field873] / 65536.0D * (double) arg1);
            if (this.field872 > this.field876) {
                this.field874 = ((this.field868[this.field873] << 15) - this.field875) / (this.field872 - this.field876);
            }
        }
        this.field875 += this.field874;
        this.field876++;
        if (arg0 != 0) {
            this.field864 = !this.field864;
        }
        return this.field875 - this.field874 >> 15;
    }
}
