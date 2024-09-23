import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ac")
public class Envelope {

    @OriginalMember(owner = "ac", name = "b", descriptor = "I")
    private int field874 = -148;

    @OriginalMember(owner = "ac", name = "a", descriptor = "I")
    private int field873;

    @OriginalMember(owner = "ac", name = "c", descriptor = "I")
    private int field875;

    @OriginalMember(owner = "ac", name = "f", descriptor = "I")
    public int field878;

    @OriginalMember(owner = "ac", name = "g", descriptor = "I")
    public int field879;

    @OriginalMember(owner = "ac", name = "h", descriptor = "I")
    public int field880;

    @OriginalMember(owner = "ac", name = "i", descriptor = "I")
    private int field881;

    @OriginalMember(owner = "ac", name = "j", descriptor = "I")
    private int field882;

    @OriginalMember(owner = "ac", name = "k", descriptor = "I")
    private int field883;

    @OriginalMember(owner = "ac", name = "l", descriptor = "I")
    private int field884;

    @OriginalMember(owner = "ac", name = "m", descriptor = "I")
    private int field885;

    @OriginalMember(owner = "ac", name = "n", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "ac", name = "d", descriptor = "[I")
    private int[] field876;

    @OriginalMember(owner = "ac", name = "e", descriptor = "[I")
    private int[] field877;

    @OriginalMember(owner = "ac", name = "a", descriptor = "(ILlb;)V")
    public final void method309(int arg0, Packet arg1) {
        this.field880 = arg1.method229();
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        this.field878 = arg1.method234();
        this.field879 = arg1.method234();
        this.method310(0, arg1);
    }

    @OriginalMember(owner = "ac", name = "b", descriptor = "(ILlb;)V")
    public final void method310(int arg0, Packet arg1) {
        if (arg0 < 0 || arg0 > 0) {
            return;
        }
        this.field875 = arg1.method229();
        this.field876 = new int[this.field875];
        this.field877 = new int[this.field875];
        for (int var3 = 0; var3 < this.field875; var3++) {
            this.field876[var3] = arg1.method231();
            this.field877[var3] = arg1.method231();
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Z)V")
    public final void method311(boolean arg0) {
        this.field881 = 0;
        this.field882 = 0;
        this.field883 = 0;
        this.field884 = 0;
        this.field885 = 0;
        if (arg0) {
            this.field874 = 184;
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(II)I")
    public final int method312(int arg0, int arg1) {
        if (this.field885 >= this.field881) {
            this.field884 = this.field877[this.field882++] << 15;
            if (this.field882 >= this.field875) {
                this.field882 = this.field875 - 1;
            }
            this.field881 = (int) ((double) this.field876[this.field882] / 65536.0D * (double) arg0);
            if (this.field881 > this.field885) {
                this.field883 = ((this.field877[this.field882] << 15) - this.field884) / (this.field881 - this.field885);
            }
        }
        this.field884 += this.field883;
        if (arg1 >= 0) {
            return this.field873;
        } else {
            this.field885++;
            return this.field884 - this.field883 >> 15;
        }
    }
}
