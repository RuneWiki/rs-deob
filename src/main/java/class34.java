import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class34 extends class170 {

    @OriginalMember(owner = "client!va", name = "hb", descriptor = "I")
    private int field682 = -1;

    @OriginalMember(owner = "client!va", name = "X", descriptor = "[I")
    public static int[] field672 = new int[32];

    @OriginalMember(owner = "client!va", name = "eb", descriptor = "[I")
    public static int[] field679 = new int[200];

    @OriginalMember(owner = "client!va", name = "fb", descriptor = "I")
    public static int field680 = 0;

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "I")
    private int field674;

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "I")
    private int field675;

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!va", name = "db", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!va", name = "gb", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!va", name = "ib", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!va", name = "jb", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "Loc;")
    public static class60 field677;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "Lpk;")
    public static class99 field671;

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "[I")
    private int[] field673;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method32(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field676;
            int[][] var3 = super.field3002.method427(arg0, 239);
            if (super.field3002.field1077 && this.method253((byte) -127)) {
                int var4 = this.field674 * (class30.field620 == this.field675 ? arg0 : this.field675 * arg0 / class30.field620);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                if (class88.field1595 != this.field674) {
                    for (int var8 = 0; ~var8 > ~class88.field1595; ++var8) {
                        int var9 = this.field674 * var8 / class88.field1595;
                        int var10 = this.field673[var4 - -var9];
                        var7[var8] = class121.method860(var10 << 4, 4080);
                        var6[var8] = class121.method860(var10 >> 4, 4080);
                        var5[var8] = class121.method860(var10, 16711680) >> 12;
                    }
                } else {
                    for (int var11 = 0; var11 < class88.field1595; ++var11) {
                        int var12 = this.field673[var4++];
                        var7[var11] = class121.method860(var12 << 4, 4080);
                        var6[var11] = class121.method860(var12 >> 4, 4080);
                        var5[var11] = class121.method860(var12, 16711680) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    public class34() {
        super(0, false);
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(B)Z")
    private final boolean method253(byte arg0) {
        ++field683;
        if (this.field673 != null) {
            return true;
        } else if (~this.field682 <= -1) {
            int var2 = class30.field620;
            int var3 = class88.field1595;
            int var4 = !class225.field4099.method341(true, this.field682) ? 128 : 64;
            this.field673 = class225.field4099.method343(0, this.field682);
            this.field675 = var4;
            this.field674 = var4;
            class115.method814(var2, false, var3);
            return this.field673 != null;
        } else {
            if (arg0 > -87) {
                field679 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!va", name = "h", descriptor = "(I)V")
    public static void method254(int arg0) {
        field677 = null;
        if (arg0 == 1516307684) {
            field672 = null;
            field679 = null;
            field671 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        if (arg1 != 5877) {
            field680 = 114;
        }
        if (arg2 == 0) {
            this.field682 = arg0.method1050(arg1 ^ 1272009053);
        }
        ++field681;
    }

    @OriginalMember(owner = "client!va", name = "g", descriptor = "(I)I")
    public final int method255(int arg0) {
        ++field678;
        if (arg0 != -25529) {
            this.method29((class149) null, 18, -15);
        }
        return this.field682;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V")
    public final void method256(int arg0) {
        ++field684;
        super.method256(arg0);
        this.field673 = null;
    }
}
