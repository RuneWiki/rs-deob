import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class232 extends class85 {

    @OriginalMember(owner = "client!im", name = "S", descriptor = "I")
    public static int field3674 = -1;

    @OriginalMember(owner = "client!im", name = "Y", descriptor = "B")
    public byte field3680;

    @OriginalMember(owner = "client!im", name = "N", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!im", name = "O", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!im", name = "P", descriptor = "I")
    public int field3671;

    @OriginalMember(owner = "client!im", name = "R", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!im", name = "T", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!im", name = "U", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!im", name = "W", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!im", name = "X", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!im", name = "V", descriptor = "Lha;")
    public class31 field3677;

    @OriginalMember(owner = "client!im", name = "Q", descriptor = "Lub;")
    public static class92 field3672;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "(I)V")
    public static final void method1595(int arg0) {
        ++field3678;
        class221 var1 = (class221) class262.field4152.method6(-119);
        if (arg0 == 1) {
            while (var1 != null) {
                if (var1.field3378 > 0) {
                    --var1.field3378;
                }
                if (var1.field3378 != 0) {
                    if (var1.field3370 > 0) {
                        --var1.field3370;
                    }
                    if (var1.field3370 == 0 && var1.field3376 >= 1 && var1.field3372 >= 1 && ~var1.field3376 >= -103 && var1.field3372 <= 102 && (var1.field3371 < 0 || class37.method340(var1.field3385, true, var1.field3371))) {
                        class170.method1228(var1.field3376, var1.field3385, 96, var1.field3374, var1.field3372, var1.field3375, var1.field3371, var1.field3380);
                        var1.field3370 = -1;
                        if (~var1.field3373 == ~var1.field3371 && var1.field3373 == -1) {
                            var1.method995((byte) 18);
                        } else if (~var1.field3373 == ~var1.field3371 && var1.field3384 == var1.field3380 && var1.field3385 == var1.field3379) {
                            var1.method995((byte) 102);
                        }
                    }
                } else if (~var1.field3373 > -1 || class37.method340(var1.field3379, true, var1.field3373)) {
                    class170.method1228(var1.field3376, var1.field3379, 33, var1.field3374, var1.field3372, var1.field3375, var1.field3373, var1.field3384);
                    var1.method995((byte) 24);
                }
                var1 = (class221) class262.field4152.method11((byte) 26);
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IZI)V")
    public static final void method1596(int arg0, boolean arg1, int arg2) {
        ++field3676;
        class69 var3 = class255.method1723((byte) 32, arg2, 7);
        var3.method556((byte) -103);
        var3.field1091 = arg0;
        if (arg1) {
            field3672 = null;
        }
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(I)[B")
    public final byte[] method249(int arg0) {
        ++field3673;
        if (arg0 != 256) {
            return null;
        } else if (!super.field1264 && this.field3677.field541 >= this.field3677.field560.length + -this.field3680) {
            return this.field3677.field560;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!im", name = "f", descriptor = "(I)I")
    public final int method253(int arg0) {
        ++field3670;
        if (this.field3677 == null) {
            return 0;
        } else {
            return arg0 != -12 ? -80 : this.field3677.field541 * 100 / (this.field3677.field560.length + -this.field3680);
        }
    }

    @OriginalMember(owner = "client!im", name = "h", descriptor = "(I)V")
    public static void method1597(int arg0) {
        if (arg0 != -1) {
            method1599(30, 5);
        }
        field3672 = null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "([IIII[I)V")
    public static final void method1598(int[] arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field3675;
        int var5 = -127 % ((arg2 - -33) / 46);
        if (arg1 < arg3) {
            int var6 = (arg1 - -arg3) / 2;
            int var7 = arg0[var6];
            int var8 = arg1;
            arg0[var6] = arg0[arg3];
            arg0[arg3] = var7;
            int var9 = arg4[var6];
            arg4[var6] = arg4[arg3];
            arg4[arg3] = var9;
            for (int var10 = arg1; var10 < arg3; ++var10) {
                if (~((var10 & 1) + var7) > ~arg0[var10]) {
                    int var11 = arg0[var10];
                    arg0[var10] = arg0[var8];
                    arg0[var8] = var11;
                    int var12 = arg4[var10];
                    arg4[var10] = arg4[var8];
                    arg4[var8++] = var12;
                }
            }
            arg0[arg3] = arg0[var8];
            arg0[var8] = var7;
            arg4[arg3] = arg4[var8];
            arg4[var8] = var9;
            method1598(arg0, arg1, -125, var8 + -1, arg4);
            method1598(arg0, var8 - -1, -106, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)V")
    public static final void method1599(int arg0, int arg1) {
        ++field3679;
        if (arg1 < -85) {
            class149.field2207 = 1000 / arg0;
        }
    }
}
