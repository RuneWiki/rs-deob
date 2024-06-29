import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class26 extends class148 {

    @OriginalMember(owner = "client!wv", name = "O", descriptor = "I")
    private int field275 = 4;

    @OriginalMember(owner = "client!wv", name = "T", descriptor = "I")
    private int field280 = 4;

    @OriginalMember(owner = "client!wv", name = "M", descriptor = "Lai;")
    public static class423 field273 = new class423("runescape", 0);

    @OriginalMember(owner = "client!wv", name = "S", descriptor = "I")
    public static int field279 = 13156520;

    @OriginalMember(owner = "client!wv", name = "J", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!wv", name = "K", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!wv", name = "L", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!wv", name = "N", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!wv", name = "P", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!wv", name = "Q", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!wv", name = "R", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!wv", name = "U", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!wv", name = "V", descriptor = "Ldm;")
    public static class37 field282;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIILme;II)V")
    public static final void method160(int arg0, int arg1, int arg2, int arg3, class129 arg4, int arg5, int arg6) {
        ++field277;
        class43.method267(arg5, arg3, arg6, arg1, arg1, arg2, arg0, arg4.field1769, arg4.field1768, arg4.field1763);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIZ)V")
    public static final void method161(int arg0, int arg1, boolean arg2) {
        ++field270;
        if (!arg2) {
            field273 = null;
        }
        if (class359.field5513 == class183.field2707) {
            if (!class343.method2105(arg1, 1, arg0, 1, (byte) 114, false, 0, 0, -2)) {
                class343.method2105(arg1, 1, arg0, 1, (byte) 120, false, 0, 0, -3);
            }
        } else if (!class343.method2105(arg1, 1, arg0, 1, (byte) 88, false, 0, 0, -3)) {
            class343.method2105(arg1, 1, arg0, 1, (byte) 113, false, 0, 0, -2);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILdh;I)V")
    public final void method23(int arg0, class209 arg1, int arg2) {
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field280 = arg1.method1428(32122);
            }
        } else {
            this.field275 = arg1.method1428(32122);
        }
        int var5 = -28 % ((-88 - arg2) / 33);
        ++field276;
    }

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "(I)V")
    public static void method162(int arg0) {
        if (arg0 == 1) {
            field273 = null;
            field282 = null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(IBI)Z")
    public static final boolean method163(int arg0, byte arg1, int arg2) {
        ++field272;
        if (arg1 != -95) {
            method160(40, -10, -58, -118, (class129) null, 70, 94);
        }
        return ~(34 & arg2) != -1;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        if (arg0 > -65) {
            method163(1, (byte) -92, -122);
        }
        ++field274;
        int[] var3 = super.field2193.method497(arg1, false);
        if (super.field2193.field1312) {
            int var4 = class320.field4579 / this.field275;
            int var5 = class238.field3506 / this.field280;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method971(false, class238.field3506 * var6 / var5, 0);
            } else {
                var7 = this.method971(false, 0, 0);
            }
            for (int var8 = 0; class320.field4579 > var8; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class320.field4579 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method27(boolean arg0, int arg1) {
        if (!arg0) {
            field273 = null;
        }
        ++field281;
        int[][] var3 = super.field2189.method2422(-2, arg1);
        if (super.field2189.field6033) {
            int var4 = class320.field4579 / this.field275;
            int var5 = class238.field3506 / this.field280;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method974(arg0, 0, class238.field3506 * var6 / var5);
            } else {
                var7 = this.method974(arg0, 0, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class320.field4579; ++var14) {
                int var15;
                if (~var4 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class320.field4579 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "()V")
    public class26() {
        super(1, false);
    }
}
