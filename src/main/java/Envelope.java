import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ac")
public class Envelope {

    @OriginalMember(owner = "ac", name = "a", descriptor = "B")
    private byte field874 = 89;

    @OriginalMember(owner = "ac", name = "b", descriptor = "I")
    private int field875 = 658;

    @OriginalMember(owner = "ac", name = "c", descriptor = "Z")
    private boolean field876 = true;

    @OriginalMember(owner = "ac", name = "d", descriptor = "I")
    private int field877;

    @OriginalMember(owner = "ac", name = "g", descriptor = "I")
    public int field880;

    @OriginalMember(owner = "ac", name = "h", descriptor = "I")
    public int field881;

    @OriginalMember(owner = "ac", name = "i", descriptor = "I")
    public int field882;

    @OriginalMember(owner = "ac", name = "j", descriptor = "I")
    private int field883;

    @OriginalMember(owner = "ac", name = "k", descriptor = "I")
    private int field884;

    @OriginalMember(owner = "ac", name = "l", descriptor = "I")
    private int field885;

    @OriginalMember(owner = "ac", name = "m", descriptor = "I")
    private int field886;

    @OriginalMember(owner = "ac", name = "n", descriptor = "I")
    private int field887;

    @OriginalMember(owner = "ac", name = "o", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "ac", name = "e", descriptor = "[I")
    private int[] field878;

    @OriginalMember(owner = "ac", name = "f", descriptor = "[I")
    private int[] field879;

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Llb;I)V")
    public final void method304(Packet arg0, int arg1) {
        this.field882 = arg0.method224();
        if (arg1 != -32477) {
            this.field876 = !this.field876;
        }
        this.field880 = arg0.method229();
        this.field881 = arg0.method229();
        this.method305(this.field874, arg0);
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(BLlb;)V")
    public final void method305(byte arg0, Packet arg1) {
        this.field877 = arg1.method224();
        this.field878 = new int[this.field877];
        this.field879 = new int[this.field877];
        if (arg0 == 89) {
            for (int var3 = 0; var3 < this.field877; var3++) {
                this.field878[var3] = arg1.method226();
                this.field879[var3] = arg1.method226();
            }
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(I)V")
    public final void method306(int arg0) {
        this.field883 = 0;
        this.field884 = 0;
        if (arg0 != 39192) {
            this.field876 = !this.field876;
        }
        this.field885 = 0;
        this.field886 = 0;
        this.field887 = 0;
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(II)I")
    public final int method307(int arg0, int arg1) {
        while (arg0 >= 0) {
            this.field875 = -155;
        }
        if (this.field887 >= this.field883) {
            this.field886 = this.field879[this.field884++] << 15;
            if (this.field884 >= this.field877) {
                this.field884 = this.field877 - 1;
            }
            this.field883 = (int) ((double) this.field878[this.field884] / 65536.0D * (double) arg1);
            if (this.field883 > this.field887) {
                this.field885 = ((this.field879[this.field884] << 15) - this.field886) / (this.field883 - this.field887);
            }
        }
        this.field886 += this.field885;
        this.field887++;
        return this.field886 - this.field885 >> 15;
    }
}
