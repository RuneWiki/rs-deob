import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ISLGIOFS")
public class class21 {

    @OriginalMember(owner = "client!ISLGIOFS", name = "a", descriptor = "Z")
    private boolean field853 = false;

    @OriginalMember(owner = "client!ISLGIOFS", name = "b", descriptor = "I")
    private int field854 = -5335;

    @OriginalMember(owner = "client!ISLGIOFS", name = "c", descriptor = "I")
    private int field855;

    @OriginalMember(owner = "client!ISLGIOFS", name = "f", descriptor = "I")
    public int field858;

    @OriginalMember(owner = "client!ISLGIOFS", name = "g", descriptor = "I")
    public int field859;

    @OriginalMember(owner = "client!ISLGIOFS", name = "h", descriptor = "I")
    public int field860;

    @OriginalMember(owner = "client!ISLGIOFS", name = "i", descriptor = "I")
    private int field861;

    @OriginalMember(owner = "client!ISLGIOFS", name = "j", descriptor = "I")
    private int field862;

    @OriginalMember(owner = "client!ISLGIOFS", name = "k", descriptor = "I")
    private int field863;

    @OriginalMember(owner = "client!ISLGIOFS", name = "l", descriptor = "I")
    private int field864;

    @OriginalMember(owner = "client!ISLGIOFS", name = "m", descriptor = "I")
    private int field865;

    @OriginalMember(owner = "client!ISLGIOFS", name = "n", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!ISLGIOFS", name = "d", descriptor = "[I")
    private int[] field856;

    @OriginalMember(owner = "client!ISLGIOFS", name = "e", descriptor = "[I")
    private int[] field857;

    @OriginalMember(owner = "client!ISLGIOFS", name = "a", descriptor = "(ILEMWAMCXW;)V")
    public final void method295(int arg0, class14 arg1) {
        this.field860 = arg1.method217();
        this.field858 = arg1.method222();
        if (arg0 != 1016) {
            throw new NullPointerException();
        }
        this.field859 = arg1.method222();
        this.method296(-5335, arg1);
    }

    @OriginalMember(owner = "client!ISLGIOFS", name = "b", descriptor = "(ILEMWAMCXW;)V")
    public final void method296(int arg0, class14 arg1) {
        this.field855 = arg1.method217();
        this.field856 = new int[this.field855];
        if (this.field854 != arg0) {
            this.field853 = !this.field853;
        }
        this.field857 = new int[this.field855];
        for (int var3 = 0; var3 < this.field855; var3++) {
            this.field856[var3] = arg1.method219();
            this.field857[var3] = arg1.method219();
        }
    }

    @OriginalMember(owner = "client!ISLGIOFS", name = "a", descriptor = "(I)V")
    public final void method297(int arg0) {
        this.field861 = 0;
        this.field862 = 0;
        this.field863 = 0;
        this.field864 = 0;
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field865 = 0;
    }

    @OriginalMember(owner = "client!ISLGIOFS", name = "a", descriptor = "(II)I")
    public final int method298(int arg0, int arg1) {
        if (this.field865 >= this.field861) {
            this.field864 = this.field857[this.field862++] << 15;
            if (this.field862 >= this.field855) {
                this.field862 = this.field855 - 1;
            }
            this.field861 = (int) ((double) this.field856[this.field862] / 65536.0D * (double) arg1);
            if (this.field861 > this.field865) {
                this.field863 = ((this.field857[this.field862] << 15) - this.field864) / (this.field861 - this.field865);
            }
        }
        this.field864 += this.field863;
        if (arg0 <= 0) {
            return this.field854;
        } else {
            this.field865++;
            return this.field864 - this.field863 >> 15;
        }
    }
}
