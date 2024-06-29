import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LSSFLBMP")
public class class32 {

    @OriginalMember(owner = "client!LSSFLBMP", name = "b", descriptor = "Z")
    private boolean field943 = true;

    @OriginalMember(owner = "client!LSSFLBMP", name = "c", descriptor = "Z")
    private boolean field944 = true;

    @OriginalMember(owner = "client!LSSFLBMP", name = "a", descriptor = "I")
    private int field942;

    @OriginalMember(owner = "client!LSSFLBMP", name = "d", descriptor = "I")
    private int field945;

    @OriginalMember(owner = "client!LSSFLBMP", name = "g", descriptor = "I")
    public int field948;

    @OriginalMember(owner = "client!LSSFLBMP", name = "h", descriptor = "I")
    public int field949;

    @OriginalMember(owner = "client!LSSFLBMP", name = "i", descriptor = "I")
    public int field950;

    @OriginalMember(owner = "client!LSSFLBMP", name = "j", descriptor = "I")
    private int field951;

    @OriginalMember(owner = "client!LSSFLBMP", name = "k", descriptor = "I")
    private int field952;

    @OriginalMember(owner = "client!LSSFLBMP", name = "l", descriptor = "I")
    private int field953;

    @OriginalMember(owner = "client!LSSFLBMP", name = "m", descriptor = "I")
    private int field954;

    @OriginalMember(owner = "client!LSSFLBMP", name = "n", descriptor = "I")
    private int field955;

    @OriginalMember(owner = "client!LSSFLBMP", name = "o", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!LSSFLBMP", name = "e", descriptor = "[I")
    private int[] field946;

    @OriginalMember(owner = "client!LSSFLBMP", name = "f", descriptor = "[I")
    private int[] field947;

    @OriginalMember(owner = "client!LSSFLBMP", name = "a", descriptor = "(ILWNCFPLWV;)V")
    public final void method323(int arg0, class63 arg1) {
        this.field950 = arg1.method502();
        this.field948 = arg1.method507();
        this.field949 = arg1.method507();
        this.method324(arg1, this.field943);
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!LSSFLBMP", name = "a", descriptor = "(LWNCFPLWV;Z)V")
    public final void method324(class63 arg0, boolean arg1) {
        this.field945 = arg0.method502();
        this.field946 = new int[this.field945];
        this.field947 = new int[this.field945];
        for (int var3 = 0; var3 < this.field945; var3++) {
            this.field946[var3] = arg0.method504();
            this.field947[var3] = arg0.method504();
        }
        if (!arg1) {
            this.field942 = 395;
        }
    }

    @OriginalMember(owner = "client!LSSFLBMP", name = "a", descriptor = "(Z)V")
    public final void method325(boolean arg0) {
        this.field951 = 0;
        this.field952 = 0;
        if (!arg0) {
            this.field953 = 0;
            this.field954 = 0;
            this.field955 = 0;
        }
    }

    @OriginalMember(owner = "client!LSSFLBMP", name = "a", descriptor = "(IB)I")
    public final int method326(int arg0, byte arg1) {
        if (this.field955 >= this.field951) {
            this.field954 = this.field947[this.field952++] << 15;
            if (this.field952 >= this.field945) {
                this.field952 = this.field945 - 1;
            }
            this.field951 = (int) ((double) this.field946[this.field952] / 65536.0D * (double) arg0);
            if (this.field951 > this.field955) {
                this.field953 = ((this.field947[this.field952] << 15) - this.field954) / (this.field951 - this.field955);
            }
        }
        this.field954 += this.field953;
        if (arg1 == -2) {
            this.field955++;
            return this.field954 - this.field953 >> 15;
        } else {
            return 4;
        }
    }
}
