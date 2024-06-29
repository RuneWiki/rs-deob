import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GTUIGVXS")
public class class25 {

    @OriginalMember(owner = "client!GTUIGVXS", name = "a", descriptor = "I")
    private int field945 = -967;

    @OriginalMember(owner = "client!GTUIGVXS", name = "b", descriptor = "Z")
    private boolean field946 = false;

    @OriginalMember(owner = "client!GTUIGVXS", name = "c", descriptor = "Z")
    private boolean field947 = false;

    @OriginalMember(owner = "client!GTUIGVXS", name = "d", descriptor = "B")
    private byte field948 = 0;

    @OriginalMember(owner = "client!GTUIGVXS", name = "e", descriptor = "I")
    private int field949;

    @OriginalMember(owner = "client!GTUIGVXS", name = "h", descriptor = "I")
    public int field952;

    @OriginalMember(owner = "client!GTUIGVXS", name = "i", descriptor = "I")
    public int field953;

    @OriginalMember(owner = "client!GTUIGVXS", name = "j", descriptor = "I")
    public int field954;

    @OriginalMember(owner = "client!GTUIGVXS", name = "k", descriptor = "I")
    private int field955;

    @OriginalMember(owner = "client!GTUIGVXS", name = "l", descriptor = "I")
    private int field956;

    @OriginalMember(owner = "client!GTUIGVXS", name = "m", descriptor = "I")
    private int field957;

    @OriginalMember(owner = "client!GTUIGVXS", name = "n", descriptor = "I")
    private int field958;

    @OriginalMember(owner = "client!GTUIGVXS", name = "o", descriptor = "I")
    private int field959;

    @OriginalMember(owner = "client!GTUIGVXS", name = "p", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!GTUIGVXS", name = "f", descriptor = "[I")
    private int[] field950;

    @OriginalMember(owner = "client!GTUIGVXS", name = "g", descriptor = "[I")
    private int[] field951;

    @OriginalMember(owner = "client!GTUIGVXS", name = "a", descriptor = "(LWBEWPIXO;I)V")
    public final void method269(class58 arg0, int arg1) {
        this.field954 = arg0.method515();
        this.field952 = arg0.method520();
        this.field953 = arg0.method520();
        if (arg1 <= 0) {
            this.field946 = !this.field946;
        }
        this.method270(arg0, -895);
    }

    @OriginalMember(owner = "client!GTUIGVXS", name = "b", descriptor = "(LWBEWPIXO;I)V")
    public final void method270(class58 arg0, int arg1) {
        this.field949 = arg0.method515();
        this.field950 = new int[this.field949];
        this.field951 = new int[this.field949];
        for (int var3 = 0; var3 < this.field949; var3++) {
            this.field950[var3] = arg0.method517();
            this.field951[var3] = arg0.method517();
        }
        if (arg1 >= 0) {
            this.field947 = !this.field947;
        }
    }

    @OriginalMember(owner = "client!GTUIGVXS", name = "a", descriptor = "(B)V")
    public final void method271(byte arg0) {
        this.field955 = 0;
        if (this.field948 != arg0) {
            this.field945 = 376;
        }
        this.field956 = 0;
        this.field957 = 0;
        this.field958 = 0;
        this.field959 = 0;
    }

    @OriginalMember(owner = "client!GTUIGVXS", name = "a", descriptor = "(II)I")
    public final int method272(int arg0, int arg1) {
        if (this.field959 >= this.field955) {
            this.field958 = this.field951[this.field956++] << 15;
            if (this.field956 >= this.field949) {
                this.field956 = this.field949 - 1;
            }
            this.field955 = (int) ((double) this.field950[this.field956] / 65536.0D * (double) arg1);
            if (this.field955 > this.field959) {
                this.field957 = ((this.field951[this.field956] << 15) - this.field958) / (this.field955 - this.field959);
            }
        }
        this.field958 += this.field957;
        this.field959++;
        return arg0 == 18303 ? this.field958 - this.field957 >> 15 : 1;
    }
}
