import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JZEFIVMF")
public class class25 {

    @OriginalMember(owner = "client!JZEFIVMF", name = "a", descriptor = "Z")
    private boolean field772 = false;

    @OriginalMember(owner = "client!JZEFIVMF", name = "b", descriptor = "I")
    private int field773;

    @OriginalMember(owner = "client!JZEFIVMF", name = "c", descriptor = "I")
    private int field774;

    @OriginalMember(owner = "client!JZEFIVMF", name = "f", descriptor = "I")
    public int field777;

    @OriginalMember(owner = "client!JZEFIVMF", name = "g", descriptor = "I")
    public int field778;

    @OriginalMember(owner = "client!JZEFIVMF", name = "h", descriptor = "I")
    public int field779;

    @OriginalMember(owner = "client!JZEFIVMF", name = "i", descriptor = "I")
    private int field780;

    @OriginalMember(owner = "client!JZEFIVMF", name = "j", descriptor = "I")
    private int field781;

    @OriginalMember(owner = "client!JZEFIVMF", name = "k", descriptor = "I")
    private int field782;

    @OriginalMember(owner = "client!JZEFIVMF", name = "l", descriptor = "I")
    private int field783;

    @OriginalMember(owner = "client!JZEFIVMF", name = "m", descriptor = "I")
    private int field784;

    @OriginalMember(owner = "client!JZEFIVMF", name = "n", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!JZEFIVMF", name = "d", descriptor = "[I")
    private int[] field775;

    @OriginalMember(owner = "client!JZEFIVMF", name = "e", descriptor = "[I")
    private int[] field776;

    @OriginalMember(owner = "client!JZEFIVMF", name = "a", descriptor = "(LFTMSICIZ;I)V")
    public final void method309(class13 arg0, int arg1) {
        this.field779 = arg0.method213();
        this.field777 = arg0.method218();
        this.field778 = arg0.method218();
        this.method310(false, arg0);
        int var3 = 45 / arg1;
    }

    @OriginalMember(owner = "client!JZEFIVMF", name = "a", descriptor = "(ZLFTMSICIZ;)V")
    public final void method310(boolean arg0, class13 arg1) {
        if (arg0) {
            this.field772 = !this.field772;
        }
        this.field774 = arg1.method213();
        this.field775 = new int[this.field774];
        this.field776 = new int[this.field774];
        for (int var3 = 0; var3 < this.field774; var3++) {
            this.field775[var3] = arg1.method215();
            this.field776[var3] = arg1.method215();
        }
    }

    @OriginalMember(owner = "client!JZEFIVMF", name = "a", descriptor = "(Z)V")
    public final void method311(boolean arg0) {
        this.field780 = 0;
        if (arg0) {
            this.field772 = !this.field772;
        }
        this.field781 = 0;
        this.field782 = 0;
        this.field783 = 0;
        this.field784 = 0;
    }

    @OriginalMember(owner = "client!JZEFIVMF", name = "a", descriptor = "(II)I")
    public final int method312(int arg0, int arg1) {
        if (this.field784 >= this.field780) {
            this.field783 = this.field776[this.field781++] << 15;
            if (this.field781 >= this.field774) {
                this.field781 = this.field774 - 1;
            }
            this.field780 = (int) ((double) this.field775[this.field781] / 65536.0D * (double) arg0);
            if (this.field780 > this.field784) {
                this.field782 = ((this.field776[this.field781] << 15) - this.field783) / (this.field780 - this.field784);
            }
        }
        this.field783 += this.field782;
        if (arg1 == 0) {
            this.field784++;
            return this.field783 - this.field782 >> 15;
        } else {
            return this.field773;
        }
    }
}
