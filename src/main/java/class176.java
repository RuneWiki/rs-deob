import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class176 extends class1 {

    @OriginalMember(owner = "client!qh", name = "ob", descriptor = "Z")
    private boolean field3191 = true;

    @OriginalMember(owner = "client!qh", name = "rb", descriptor = "Z")
    private boolean field3194 = true;

    @OriginalMember(owner = "client!qh", name = "jb", descriptor = "Loc;")
    private static class151 field3186 = class137.method873(2, "shake:");

    @OriginalMember(owner = "client!qh", name = "kb", descriptor = "Loc;")
    public static class151 field3187 = class137.method873(2, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!qh", name = "nb", descriptor = "Loc;")
    public static class151 field3190 = field3186;

    @OriginalMember(owner = "client!qh", name = "hb", descriptor = "Loc;")
    public static class151 field3184 = field3186;

    @OriginalMember(owner = "client!qh", name = "qb", descriptor = "Loc;")
    public static class151 field3193 = class137.method873(2, ": ");

    @OriginalMember(owner = "client!qh", name = "gb", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!qh", name = "ib", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!qh", name = "mb", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!qh", name = "pb", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!qh", name = "lb", descriptor = "Lnd;")
    public static class142 field3188;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        if (arg0 != 107) {
            return null;
        } else {
            int[] var3 = super.field21.method1182(arg1, -31709);
            ++field3183;
            if (super.field21.field3388) {
                int[] var4 = this.method4(!this.field3191 ? arg1 : -arg1 + class155.field2804, -108, 0);
                if (this.field3194) {
                    for (int var5 = 0; var5 < class202.field3603; ++var5) {
                        var3[var5] = var4[-var5 + class78.field1510];
                    }
                } else {
                    class145.method925(var4, 0, var3, 0, class202.field3603);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V")
    public static void method1123(int arg0) {
        field3190 = null;
        field3184 = null;
        field3188 = null;
        field3193 = null;
        if (arg0 != 15150) {
            method1123(70);
        }
        field3186 = null;
        field3187 = null;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
    public class176() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field27 = ~arg2.method1475(255) == -2;
                }
            } else {
                this.field3191 = arg2.method1475(255) == 1;
            }
        } else {
            this.field3194 = ~arg2.method1475(255) == -2;
        }
        if (arg0 != 0) {
            method1124(-53, 123, -79, 84, -99, -99, 117, 34, -114, 126);
        }
        ++field3192;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1124(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class212 var10 = null;
        ++field3189;
        for (class212 var11 = (class212) class180.field3257.method1358(-29726); var11 != null; var11 = (class212) class180.field3257.method1360(true)) {
            if (~var11.field3723 == ~arg6 && ~var11.field3728 == ~arg3 && ~var11.field3713 == ~arg8 && ~var11.field3715 == ~arg1) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class212();
            var10.field3728 = arg3;
            var10.field3723 = arg6;
            var10.field3715 = arg1;
            var10.field3713 = arg8;
            class212.method1329(-37, var10);
            class180.field3257.method1361(var10, (byte) 71);
        }
        var10.field3725 = arg4;
        var10.field3719 = arg5;
        var10.field3720 = arg9;
        var10.field3711 = arg0;
        var10.field3729 = arg2;
        if (arg7 != 1) {
            field3188 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        ++field3185;
        int[][] var3 = super.field13.method578(arg0, -1);
        if (super.field13.field1658) {
            int[][] var4 = this.method8(0, (byte) -95, this.field3191 ? class155.field2804 - arg0 : arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            if (!this.field3194) {
                for (int var11 = 0; class202.field3603 > var11; ++var11) {
                    var9[var11] = var6[var11];
                    var10[var11] = var5[var11];
                    var8[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; ~class202.field3603 < ~var12; ++var12) {
                    var9[var12] = var6[class78.field1510 - var12];
                    var10[var12] = var5[class78.field1510 - var12];
                    var8[var12] = var7[-var12 + class78.field1510];
                }
            }
        }
        if (arg1 != -81) {
            field3188 = null;
        }
        return var3;
    }
}
