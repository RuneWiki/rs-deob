import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class71 extends class260 {

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "I")
    private int field1422 = -1;

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "Loh;")
    public static class263 field1427 = class253.method1681(-125, "<col=00ff80>");

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "Loh;")
    public static class263 field1428 = class253.method1681(-120, "Stufe: ");

    @OriginalMember(owner = "client!vg", name = "Z", descriptor = "Loh;")
    public static class263 field1436 = class253.method1681(-123, ")3runescape)3com)4l=");

    @OriginalMember(owner = "client!vg", name = "M", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!vg", name = "O", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!vg", name = "T", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!vg", name = "V", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!vg", name = "W", descriptor = "I")
    private int field1433;

    @OriginalMember(owner = "client!vg", name = "X", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!vg", name = "Y", descriptor = "I")
    private int field1435;

    @OriginalMember(owner = "client!vg", name = "ab", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!vg", name = "bb", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!vg", name = "U", descriptor = "Lue;")
    public static class86 field1431;

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "[I")
    private int[] field1426;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(Z)Z")
    private final boolean method451(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field1437;
            if (this.field1426 != null) {
                return true;
            } else if (~this.field1422 <= -1) {
                int var2 = class49.field1052;
                int var3 = class60.field1235;
                int var4 = !class90.field1781.method59(this.field1422, false) ? 128 : 64;
                this.field1426 = class90.field1781.method53((byte) -120, this.field1422);
                this.field1435 = var4;
                this.field1433 = var4;
                class44.method273(var2, 4269, var3);
                return this.field1426 != null;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)[[I")
    public final int[][] method174(int arg0, int arg1) {
        if (arg1 != 5) {
            this.field1422 = -85;
        }
        ++field1432;
        int[][] var3 = super.field4509.method1667(arg0, 0);
        if (super.field4509.field4346 && this.method451(false)) {
            int var4 = this.field1435 * (~class60.field1235 != ~this.field1433 ? this.field1433 * arg0 / class60.field1235 : arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class49.field1052 == ~this.field1435) {
                for (int var8 = 0; ~class49.field1052 < ~var8; ++var8) {
                    int var9 = this.field1426[var4++];
                    var7[var8] = class263.method1777(4080, var9 << 4);
                    var6[var8] = class263.method1777(65280, var9) >> 4;
                    var5[var8] = class263.method1777(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; ~class49.field1052 < ~var10; ++var10) {
                    int var11 = this.field1435 * var10 / class49.field1052;
                    int var12 = this.field1426[var4 + var11];
                    var7[var10] = class263.method1777(4080, var12 << 4);
                    var6[var10] = class263.method1777(var12, 65280) >> 4;
                    var5[var10] = class263.method1777(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIZIIII)V")
    public static final void method452(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        class50[] var7 = class1.field17;
        for (int var8 = 0; var8 < var7.length; ++var8) {
            class50 var9 = var7[var8];
            if (var9 != null && var9.field1079 == 2) {
                class120.method775((-class93.field1844 + var9.field1076 << 7) + var9.field1071, (-class142.field2596 + var9.field1081 << 7) + var9.field1088, var9.field1068 * 2, -14, arg3 >> 1, arg5, arg6, arg0 >> 1);
                if (class1.field19 > -1 && ~(class228.field4012 % 20) > -11) {
                    class105.field1981[var9.field1080].method929(arg1 + -12 + class1.field19, class130.field2394 + arg4 - 28);
                }
            }
        }
        if (!arg2) {
            field1431 = null;
        }
        ++field1429;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V")
    public final void method453(byte arg0) {
        ++field1438;
        if (arg0 <= -115) {
            super.method453((byte) -117);
            this.field1426 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
    public class71() {
        super(0, false);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        if (arg1 != 5701) {
            this.field1435 = -43;
        }
        ++field1430;
        if (~arg0 == -1) {
            this.field1422 = arg2.method1294((byte) 3);
        }
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)I")
    public final int method454(int arg0) {
        if (arg0 != 2) {
            this.method86(-15, -57, (class194) null);
        }
        ++field1424;
        return this.field1422;
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)V")
    public static void method455(int arg0) {
        field1427 = null;
        field1436 = null;
        field1431 = null;
        field1428 = null;
        int var1 = -115 / ((-27 - arg0) / 44);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lue;Lue;III)Lrc;")
    public static final class65 method456(class86 arg0, class86 arg1, int arg2, int arg3, int arg4) {
        ++field1425;
        if (arg2 != 0) {
            field1431 = null;
        }
        return !class254.method1687(arg3, (byte) -96, arg0, arg4) ? null : class116.method761(arg1.method596(-120, arg4, arg3), 1);
    }
}
