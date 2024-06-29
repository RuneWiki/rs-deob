import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class159 extends class175 {

    @OriginalMember(owner = "client!u", name = "L", descriptor = "I")
    private int field2731 = 4;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "I")
    private int field2739 = 4;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "Lij;")
    public static class50 field2733 = class78.method578(126, "::errortest");

    @OriginalMember(owner = "client!u", name = "V", descriptor = "[I")
    public static int[] field2741 = new int[100];

    @OriginalMember(owner = "client!u", name = "M", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!u", name = "U", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!u", name = "W", descriptor = "Lda;")
    public static class22 field2742;

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class159() {
        super(1, false);
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(B)V")
    public static final void method1121(byte arg0) {
        class205.field3395.method762((byte) 117);
        ++field2737;
        if (arg0 >= -99) {
            method1122((class22) null, -54);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lda;I)V")
    public static final void method1122(class22 arg0, int arg1) {
        ++field2740;
        if (arg1 < -13) {
            class134.field2341 = arg0;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)[[I")
    public final int[][] method32(int arg0, int arg1) {
        if (arg1 != -20740) {
            field2742 = null;
        }
        int[][] var3 = super.field2920.method117(arg0, (byte) -32);
        if (super.field2920.field356) {
            int var4 = class220.field3690 / this.field2731;
            int var5 = class211.field3514 / this.field2739;
            int[][] var6;
            if (~var4 >= -1) {
                var6 = this.method1206(0, 0, (byte) -127);
            } else {
                int var7 = arg0 % var4;
                var6 = this.method1206(0, class220.field3690 * var7 / var4, (byte) 106);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class211.field3514; ++var14) {
                int var15;
                if (var5 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var5;
                    var15 = class211.field3514 * var16 / var5;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        ++field2736;
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        ++field2735;
        if (!arg0) {
            method1121((byte) 118);
        }
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field2731 = arg2.method1487(255);
            }
        } else {
            this.field2739 = arg2.method1487(255);
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(II)Z")
    public static final boolean method1123(int arg0, int arg1) {
        ++field2732;
        int var2 = -80 % ((arg0 - -51) / 48);
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(B)V")
    public static void method1124(byte arg0) {
        if (arg0 >= 35) {
            field2741 = null;
            field2742 = null;
            field2733 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        ++field2738;
        if (arg1 != -27746) {
            method1124((byte) -42);
        }
        int[] var3 = super.field2941.method1427(-21281, arg0);
        if (super.field2941.field3565) {
            int var4 = class211.field3514 / this.field2739;
            int var5 = class220.field3690 / this.field2731;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method1210(0, class220.field3690 * var6 / var5, 16745);
            } else {
                var7 = this.method1210(0, 0, arg1 + 44491);
            }
            for (int var8 = 0; ~class211.field3514 < ~var8; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class211.field3514 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }
}
