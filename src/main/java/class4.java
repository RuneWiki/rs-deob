import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BJGBRRBX")
public class class4 {

    @OriginalMember(owner = "client!BJGBRRBX", name = "a", descriptor = "Z")
    private boolean field63 = false;

    @OriginalMember(owner = "client!BJGBRRBX", name = "b", descriptor = "I")
    private int field64 = 16795;

    @OriginalMember(owner = "client!BJGBRRBX", name = "c", descriptor = "I")
    private int field65;

    @OriginalMember(owner = "client!BJGBRRBX", name = "f", descriptor = "I")
    public int field68;

    @OriginalMember(owner = "client!BJGBRRBX", name = "g", descriptor = "I")
    public int field69;

    @OriginalMember(owner = "client!BJGBRRBX", name = "h", descriptor = "I")
    public int field70;

    @OriginalMember(owner = "client!BJGBRRBX", name = "i", descriptor = "I")
    private int field71;

    @OriginalMember(owner = "client!BJGBRRBX", name = "j", descriptor = "I")
    private int field72;

    @OriginalMember(owner = "client!BJGBRRBX", name = "k", descriptor = "I")
    private int field73;

    @OriginalMember(owner = "client!BJGBRRBX", name = "l", descriptor = "I")
    private int field74;

    @OriginalMember(owner = "client!BJGBRRBX", name = "m", descriptor = "I")
    private int field75;

    @OriginalMember(owner = "client!BJGBRRBX", name = "n", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!BJGBRRBX", name = "d", descriptor = "[I")
    private int[] field66;

    @OriginalMember(owner = "client!BJGBRRBX", name = "e", descriptor = "[I")
    private int[] field67;

    @OriginalMember(owner = "client!BJGBRRBX", name = "a", descriptor = "(BLBFQIDHPO;)V")
    public final void method91(byte arg0, class3 arg1) {
        this.field70 = arg1.method54();
        this.field68 = arg1.method59();
        if (arg0 != -11) {
            this.field63 = !this.field63;
        }
        this.field69 = arg1.method59();
        this.method92(arg1, this.field64);
    }

    @OriginalMember(owner = "client!BJGBRRBX", name = "a", descriptor = "(LBFQIDHPO;I)V")
    public final void method92(class3 arg0, int arg1) {
        if (arg1 != 16795) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field65 = arg0.method54();
        this.field66 = new int[this.field65];
        this.field67 = new int[this.field65];
        for (int var4 = 0; var4 < this.field65; var4++) {
            this.field66[var4] = arg0.method56();
            this.field67[var4] = arg0.method56();
        }
    }

    @OriginalMember(owner = "client!BJGBRRBX", name = "a", descriptor = "(B)V")
    public final void method93(byte arg0) {
        this.field71 = 0;
        this.field72 = 0;
        this.field73 = 0;
        this.field74 = 0;
        if (arg0 == 6) {
            boolean var2 = false;
            this.field75 = 0;
        }
    }

    @OriginalMember(owner = "client!BJGBRRBX", name = "a", descriptor = "(ZI)I")
    public final int method94(boolean arg0, int arg1) {
        if (this.field75 >= this.field71) {
            this.field74 = this.field67[this.field72++] << 15;
            if (this.field72 >= this.field65) {
                this.field72 = this.field65 - 1;
            }
            this.field71 = (int) ((double) this.field66[this.field72] / 65536.0D * (double) arg1);
            if (this.field71 > this.field75) {
                this.field73 = ((this.field67[this.field72] << 15) - this.field74) / (this.field71 - this.field75);
            }
        }
        this.field74 += this.field73;
        if (arg0) {
            this.field75++;
            return this.field74 - this.field73 >> 15;
        } else {
            return 1;
        }
    }
}
