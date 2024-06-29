import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FGSQUADF")
public class class12 {

    @OriginalMember(owner = "client!FGSQUADF", name = "a", descriptor = "I")
    private int field645 = 4;

    @OriginalMember(owner = "client!FGSQUADF", name = "b", descriptor = "I")
    private int field646;

    @OriginalMember(owner = "client!FGSQUADF", name = "e", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "client!FGSQUADF", name = "f", descriptor = "I")
    public int field650;

    @OriginalMember(owner = "client!FGSQUADF", name = "g", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "client!FGSQUADF", name = "h", descriptor = "I")
    private int field652;

    @OriginalMember(owner = "client!FGSQUADF", name = "i", descriptor = "I")
    private int field653;

    @OriginalMember(owner = "client!FGSQUADF", name = "j", descriptor = "I")
    private int field654;

    @OriginalMember(owner = "client!FGSQUADF", name = "k", descriptor = "I")
    private int field655;

    @OriginalMember(owner = "client!FGSQUADF", name = "l", descriptor = "I")
    private int field656;

    @OriginalMember(owner = "client!FGSQUADF", name = "m", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!FGSQUADF", name = "c", descriptor = "[I")
    private int[] field647;

    @OriginalMember(owner = "client!FGSQUADF", name = "d", descriptor = "[I")
    private int[] field648;

    @OriginalMember(owner = "client!FGSQUADF", name = "a", descriptor = "(BLNQUAUMDT;)V")
    public final void method176(byte arg0, class36 arg1) {
        this.field651 = arg1.method339();
        this.field649 = arg1.method344();
        if (arg0 == 6) {
            boolean var3 = false;
        } else {
            this.field645 = 317;
        }
        this.field650 = arg1.method344();
        this.method177(674, arg1);
    }

    @OriginalMember(owner = "client!FGSQUADF", name = "a", descriptor = "(ILNQUAUMDT;)V")
    public final void method177(int arg0, class36 arg1) {
        this.field646 = arg1.method339();
        this.field647 = new int[this.field646];
        this.field648 = new int[this.field646];
        for (int var3 = 0; var3 < this.field646; var3++) {
            this.field647[var3] = arg1.method341();
            this.field648[var3] = arg1.method341();
        }
        int var4 = 53 / arg0;
    }

    @OriginalMember(owner = "client!FGSQUADF", name = "a", descriptor = "(Z)V")
    public final void method178(boolean arg0) {
        if (arg0) {
            return;
        }
        this.field652 = 0;
        this.field653 = 0;
        this.field654 = 0;
        this.field655 = 0;
        this.field656 = 0;
    }

    @OriginalMember(owner = "client!FGSQUADF", name = "a", descriptor = "(IZ)I")
    public final int method179(int arg0, boolean arg1) {
        if (this.field656 >= this.field652) {
            this.field655 = this.field648[this.field653++] << 15;
            if (this.field653 >= this.field646) {
                this.field653 = this.field646 - 1;
            }
            this.field652 = (int) ((double) this.field647[this.field653] / 65536.0D * (double) arg0);
            if (this.field652 > this.field656) {
                this.field654 = ((this.field648[this.field653] << 15) - this.field655) / (this.field652 - this.field656);
            }
        }
        this.field655 += this.field654;
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field656++;
        return this.field655 - this.field654 >> 15;
    }
}
