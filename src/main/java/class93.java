import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class93 extends class59 {

    @OriginalMember(owner = "client!kc", name = "U", descriptor = "I")
    private int field1819 = -1;

    @OriginalMember(owner = "client!kc", name = "X", descriptor = "I")
    public static int field1822 = -2;

    @OriginalMember(owner = "client!kc", name = "Z", descriptor = "Lsd;")
    public static class166 field1824 = class135.method935("::gc", 0);

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!kc", name = "V", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!kc", name = "W", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!kc", name = "Y", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!kc", name = "bb", descriptor = "I")
    private int field1826;

    @OriginalMember(owner = "client!kc", name = "eb", descriptor = "I")
    private int field1829;

    @OriginalMember(owner = "client!kc", name = "fb", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!kc", name = "db", descriptor = "Z")
    public static boolean field1828;

    @OriginalMember(owner = "client!kc", name = "cb", descriptor = "[I")
    private int[] field1827;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)I")
    public final int method505(byte arg0) {
        if (arg0 != 66) {
            this.method37(true, -17);
        }
        ++field1823;
        return this.field1819;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Z)Z")
    private final boolean method723(boolean arg0) {
        ++field1825;
        if (!arg0) {
            this.method723(false);
        }
        if (this.field1827 != null) {
            return true;
        } else if (this.field1819 >= 0) {
            int var2 = class28.field492.method823(-115, this.field1819) ? 64 : 128;
            this.field1827 = class28.field492.method824(-15732, this.field1819);
            this.field1829 = var2;
            this.field1826 = var2;
            return this.field1827 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    public class93() {
        super(0, false);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lsd;Lf;ZLsd;II)V")
    public static final void method724(class166 arg0, class47 arg1, boolean arg2, class166 arg3, int arg4, int arg5) {
        ++field1830;
        if (arg4 >= 50) {
            int var6 = arg1.method363(arg3, 0);
            int var7 = arg1.method362(var6, arg0, 91);
            class79.method647(var7, arg2, (byte) 68, arg1, var6, arg5);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method37(boolean arg0, int arg1) {
        ++field1820;
        if (!arg0) {
            return null;
        } else {
            int[][] var3 = super.field1207.method528(100, arg1);
            if (super.field1207.field1320 && this.method723(true)) {
                int var4 = (class171.field3285 == this.field1829 ? arg1 : this.field1829 * arg1 / class171.field3285) * this.field1826;
                int[] var5 = var3[1];
                int[] var6 = var3[0];
                int[] var7 = var3[2];
                if (class98.field1879 != this.field1826) {
                    for (int var8 = 0; class98.field1879 > var8; ++var8) {
                        int var9 = this.field1826 * var8 / class98.field1879;
                        int var10 = this.field1827[var4 + var9];
                        var7[var8] = class22.method151(4080, var10 << 4);
                        var5[var8] = class22.method151(var10 >> 4, 4080);
                        var6[var8] = class22.method151(16711680, var10) >> 12;
                    }
                } else {
                    for (int var11 = 0; ~class98.field1879 < ~var11; ++var11) {
                        int var12 = this.field1827[var4++];
                        var7[var11] = class22.method151(255, var12) << 4;
                        var5[var11] = class22.method151(4080, var12 >> 4);
                        var6[var11] = class22.method151(var12, 16711680) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field1819 = arg0.method405(2);
        }
        if (arg1 <= 18) {
            this.method37(false, -50);
        }
        ++field1818;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)V")
    public static void method725(byte arg0) {
        if (arg0 > 25) {
            field1824 = null;
        }
    }
}
