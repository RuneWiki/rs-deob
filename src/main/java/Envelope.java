import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ac")
public class Envelope {

    @OriginalMember(owner = "ac", name = "a", descriptor = "I")
    private int field882 = 344;

    @OriginalMember(owner = "ac", name = "b", descriptor = "I")
    private int field883 = 309;

    @OriginalMember(owner = "ac", name = "c", descriptor = "I")
    private int field884;

    @OriginalMember(owner = "ac", name = "f", descriptor = "I")
    public int field887;

    @OriginalMember(owner = "ac", name = "g", descriptor = "I")
    public int field888;

    @OriginalMember(owner = "ac", name = "h", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "ac", name = "i", descriptor = "I")
    private int field890;

    @OriginalMember(owner = "ac", name = "j", descriptor = "I")
    private int field891;

    @OriginalMember(owner = "ac", name = "k", descriptor = "I")
    private int field892;

    @OriginalMember(owner = "ac", name = "l", descriptor = "I")
    private int field893;

    @OriginalMember(owner = "ac", name = "m", descriptor = "I")
    private int field894;

    @OriginalMember(owner = "ac", name = "n", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "ac", name = "d", descriptor = "[I")
    private int[] field885;

    @OriginalMember(owner = "ac", name = "e", descriptor = "[I")
    private int[] field886;

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Llb;I)V")
    public final void method309(Packet arg0, int arg1) {
        this.field889 = arg0.method229();
        this.field887 = arg0.method234();
        int var3 = 86 / arg1;
        this.field888 = arg0.method234();
        this.method310(arg0, true);
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Llb;Z)V")
    public final void method310(Packet arg0, boolean arg1) {
        if (!arg1) {
            this.field882 = -486;
        }
        this.field884 = arg0.method229();
        this.field885 = new int[this.field884];
        this.field886 = new int[this.field884];
        for (int var3 = 0; var3 < this.field884; var3++) {
            this.field885[var3] = arg0.method231();
            this.field886[var3] = arg0.method231();
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(B)V")
    public final void method311(byte arg0) {
        this.field890 = 0;
        this.field891 = 0;
        this.field892 = 0;
        this.field893 = 0;
        if (arg0 == 7) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field894 = 0;
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(II)I")
    public final int method312(int arg0, int arg1) {
        if (this.field894 >= this.field890) {
            this.field893 = this.field886[this.field891++] << 15;
            if (this.field891 >= this.field884) {
                this.field891 = this.field884 - 1;
            }
            this.field890 = (int) ((double) this.field885[this.field891] / 65536.0D * (double) arg0);
            if (this.field890 > this.field894) {
                this.field892 = ((this.field886[this.field891] << 15) - this.field893) / (this.field890 - this.field894);
            }
        }
        this.field893 += this.field892;
        int var3 = 76 / arg1;
        this.field894++;
        int var10000 = this.field893 - this.field892 >> 15;
        if (Linkable.field364) {
        }
        return var10000;
    }
}
