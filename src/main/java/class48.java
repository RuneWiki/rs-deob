import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class48 extends class354 {

    @OriginalMember(owner = "client!qh", name = "T", descriptor = "I")
    private int field690 = -1;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "Lps;")
    public static class63 field683 = new class63();

    @OriginalMember(owner = "client!qh", name = "X", descriptor = "Lps;")
    public static class63 field694;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
    private int field682;

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "I")
    private int field685;

    @OriginalMember(owner = "client!qh", name = "P", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!qh", name = "R", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!qh", name = "S", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!qh", name = "U", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!qh", name = "V", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!qh", name = "W", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!qh", name = "Q", descriptor = "[I")
    private int[] field687;

    static {
        new class446("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field694 = new class63();
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)[[I", line = 8)
    public final int[][] method354(int arg0, byte arg1) {
        ++field684;
        int[][] var3 = super.field5474.method2414((byte) -87, arg0);
        int var4 = 65 % ((48 - arg1) / 60);
        if (super.field5474.field5870) {
            int var5 = this.field682 * (~class33.field511 == ~this.field685 ? arg0 : this.field685 * arg0 / class33.field511);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            if (~class531.field7814 == ~this.field682) {
                for (int var9 = 0; ~class531.field7814 < ~var9; ++var9) {
                    int var10 = this.field687[var5++];
                    var8[var9] = class519.method3092(var10 << 4, 4080);
                    var7[var9] = class519.method3092(var10, 65280) >> 4;
                    var6[var9] = class519.method3092(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; class531.field7814 > var11; ++var11) {
                    int var12 = this.field682 * var11 / class531.field7814;
                    int var13 = this.field687[var5 + var12];
                    var8[var11] = class519.method3092(var13 << 4, 4080);
                    var7[var11] = class519.method3092(4080, var13 >> 4);
                    var6[var11] = class519.method3092(var13 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)I", line = 72)
    public final int method371(int arg0) {
        ++field688;
        if (arg0 != -1) {
            method372((byte) -65);
        }
        return this.field690;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 84)
    public class48() {
        super(0, false);
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V", line = 90)
    public static void method372(byte arg0) {
        field683 = null;
        int var1 = 29 % ((66 - arg0) / 59);
        field694 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V", line = 100)
    public final void method373(int arg0, int arg1, int arg2) {
        ++field681;
        super.method373(arg0, arg1, -87);
        if (this.field690 >= 0 && class281.field3984 != null) {
            int var4 = class281.field3984.method157((byte) 101, this.field690).field1516 ? 64 : 128;
            this.field687 = class281.field3984.method156(this.field690, false, var4, var4, 1.0F, (byte) 42);
            this.field685 = var4;
            this.field682 = var4;
        }
        int var5 = -14 % ((11 - arg2) / 38);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lnj;II)V", line = 120)
    public final void method272(class164 arg0, int arg1, int arg2) {
        if (arg2 == 1638) {
            ++field689;
            if (~arg1 == -1) {
                this.field690 = arg0.method1074(-635989152);
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V", line = 145)
    public static final void method374(byte arg0) {
        ++field692;
        class177 var1 = class344.method2229(15, 0, (byte) 126);
        var1.method1194(-34);
        if (arg0 != -76) {
            field691 = -67;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 158)
    public final void method375(int arg0) {
        super.method375(arg0);
        if (arg0 == 1) {
            ++field686;
            this.field687 = null;
        }
    }
}
