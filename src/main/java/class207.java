import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class207 extends class23 {

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "[Llc;")
    public static class143[] field3802 = new class143[8];

    @OriginalMember(owner = "client!ck", name = "W", descriptor = "Llc;")
    public static class143 field3812 = class66.method374("Chargement des fichiers config )2 ", -1);

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "Lff;")
    public static class42 field3805 = new class42(0, 0);

    @OriginalMember(owner = "client!ck", name = "X", descriptor = "Llc;")
    public static class143 field3813 = class66.method374(":tradereq:", -1);

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "[Llc;")
    public static class143[] field3811;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIBIII)V")
    public static final void method1442(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var8 = arg0 + 1;
        class289.method1927(class15.field268[arg0], arg1, arg4, -65, arg5);
        int var9 = arg3 - 1;
        class289.method1927(class15.field268[arg3], arg1, arg4, -82, arg5);
        ++field3804;
        if (arg2 <= -125) {
            for (int var6 = var8; var9 >= var6; ++var6) {
                int[] var7 = class15.field268[var6];
                var7[arg4] = var7[arg5] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
    public class207() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lfi;I)V")
    public static final void method1443(class228 arg0, int arg1) {
        if (~class146.field2635 == ~arg0.field4128 || arg0.field4131 == -1 || arg0.field4156 != 0 || arg0.field4166 + 1 > class164.method1081(arg0.field4131, -21331).field1824[arg0.field4153]) {
            int var2 = class146.field2635 - arg0.field4139;
            int var3 = arg0.field4128 - arg0.field4139;
            int var4 = arg0.field4180 * 128 - -(64 * arg0.method218((byte) 20));
            int var5 = arg0.field4167 * 128 + arg0.method218((byte) -128) * 64;
            int var6 = arg0.field4179 * 128 + 64 * arg0.method218((byte) -124);
            int var7 = arg0.field4120 * 128 - -(64 * arg0.method218((byte) 127));
            arg0.field4178 = ((-var2 + var3) * var4 + var2 * var6) / var3;
            arg0.field4108 = ((-var2 + var3) * var5 + var2 * var7) / var3;
        }
        if (arg0.field4118 == 0) {
            arg0.field4168 = 1024;
        }
        if (~arg0.field4118 == -2) {
            arg0.field4168 = 1536;
        }
        arg0.field4136 = arg1;
        if (~arg0.field4118 == -3) {
            arg0.field4168 = 0;
        }
        if (arg0.field4118 == 3) {
            arg0.field4168 = 512;
        }
        ++field3800;
        arg0.field4183 = arg0.field4168;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(III)V")
    public static final void method1444(int arg0, int arg1, int arg2) {
        ++field3809;
        int var3 = -52 / ((41 - arg2) / 42);
        class145.field2603[arg0] = arg1;
        class208 var4 = (class208) class55.field1062.method1824((long) arg0, 0);
        if (var4 == null) {
            class208 var5 = new class208(4611686018427387905L);
            class55.field1062.method1825(var5, (byte) 64, (long) arg0);
        } else if (~var4.field3820 != -4611686018427387906L) {
            var4.field3820 = class205.method1403(103) - -500L | 4611686018427387904L;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        ++field3803;
        if (arg0 >= -13) {
            field3805 = null;
        }
        int[] var3 = super.field369.method306(arg1, -23179);
        if (super.field369.field1005) {
            int[] var4 = this.method155(arg1, (byte) 127, 0);
            for (int var5 = 0; ~class72.field1359 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)[[I")
    public final int[][] method131(int arg0, int arg1) {
        ++field3798;
        if (arg1 != 1) {
            method1442(81, -36, (byte) -21, 101, 105, 77);
        }
        int[][] var3 = super.field366.method209(0, arg0);
        if (super.field366.field508) {
            int[][] var4 = this.method161(arg0, 0, 0);
            int[] var5 = var4[0];
            int[] var6 = var3[0];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class72.field1359 < ~var11; ++var11) {
                var6[var11] = 4096 - var5[var11];
                var8[var11] = -var7[var11] + 4096;
                var10[var11] = -var9[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(I)Lek;")
    public static final class160 method1445(int arg0) {
        ++field3810;
        byte[] var1 = class282.field4961[0];
        int var2 = class41.field697[0] * class153.field2766[0];
        int[] var3 = new int[var2];
        for (int var4 = 0; var4 < var2; ++var4) {
            var3[var4] = class111.field1961[class129.method777(var1[var4], 255)];
        }
        if (arg0 != 128) {
            method1442(-29, 10, (byte) -66, -56, 71, -58);
        }
        class160 var5 = new class160(class257.field4628, class70.field1332, class126.field2226[0], class32.field536[0], class41.field697[0], class153.field2766[0], var3);
        class258.method1708(0);
        return var5;
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(I)V")
    public static void method1446(int arg0) {
        field3813 = null;
        if (arg0 != 23955) {
            field3811 = null;
        }
        field3811 = null;
        field3805 = null;
        field3812 = null;
        field3802 = null;
    }

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "(I)V")
    public static final void method1447(int arg0) {
        ++field3807;
        for (class249 var1 = (class249) class57.field1107.method1294(false); var1 != null; var1 = (class249) class57.field1107.method1292((byte) 105)) {
            if (~var1.field4489 < -1) {
                --var1.field4489;
            }
            if (var1.field4489 == 0) {
                if (~var1.field4497 > -1 || class17.method132(-123, var1.field4497, var1.field4487)) {
                    class140.method843(var1.field4487, var1.field4494, var1.field4485, -53, var1.field4500, var1.field4491, var1.field4502, var1.field4497);
                    var1.method349(0);
                }
            } else {
                if (var1.field4486 > 0) {
                    --var1.field4486;
                }
                if (var1.field4486 == 0 && ~var1.field4502 <= -2 && ~var1.field4494 <= -2 && var1.field4502 <= 102 && var1.field4494 <= 102 && (~var1.field4495 > -1 || class17.method132(-99, var1.field4495, var1.field4496))) {
                    class140.method843(var1.field4496, var1.field4494, var1.field4492, 112, var1.field4500, var1.field4491, var1.field4502, var1.field4495);
                    var1.field4486 = -1;
                    if (~var1.field4497 == ~var1.field4495 && ~var1.field4497 == 0) {
                        var1.method349(0);
                    } else if (var1.field4497 == var1.field4495 && var1.field4492 == var1.field4485 && var1.field4496 == var1.field4487) {
                        var1.method349(0);
                    }
                }
            }
        }
        int var2 = 93 % ((59 - arg0) / 37);
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(II)Lwb;")
    public static final class133 method1448(int arg0, int arg1) {
        int var2 = 26 % ((91 - arg0) / 32);
        ++field3799;
        return class270.field4825 && ~arg1 <= ~class158.field2854 && ~arg1 >= ~class234.field4268 ? class154.field2789[-class158.field2854 + arg1] : null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        if (~arg1 == -1) {
            super.field373 = arg0.method1265(125) == 1;
        }
        if (arg2) {
            ++field3808;
        }
    }
}
