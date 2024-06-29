import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 extends class25 {

    @OriginalMember(owner = "client!f", name = "Uc", descriptor = "Z")
    public static boolean field1058 = false;

    @OriginalMember(owner = "client!f", name = "Qc", descriptor = "Lrd;")
    public static class117 field1054 = class95.method812(" zuerst von Ihrer Freunde)2Liste(Q", (byte) 8);

    @OriginalMember(owner = "client!f", name = "Tc", descriptor = "I")
    public static int field1057 = 20;

    @OriginalMember(owner = "client!f", name = "Vc", descriptor = "Lrd;")
    private static class117 field1059 = class95.method812("System update in: ", (byte) 8);

    @OriginalMember(owner = "client!f", name = "Wc", descriptor = "I")
    public static volatile int field1060 = 0;

    @OriginalMember(owner = "client!f", name = "bd", descriptor = "Lrd;")
    public static class117 field1065 = class95.method812(")2", (byte) 8);

    @OriginalMember(owner = "client!f", name = "Pc", descriptor = "Lrd;")
    public static class117 field1053 = field1059;

    @OriginalMember(owner = "client!f", name = "Rc", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!f", name = "Yc", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!f", name = "ad", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!f", name = "cd", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!f", name = "Xc", descriptor = "Lcb;")
    public class17 field1061;

    @OriginalMember(owner = "client!f", name = "Sc", descriptor = "[I")
    public static int[] field1056;

    @OriginalMember(owner = "client!f", name = "Zc", descriptor = "[I")
    public static int[] field1063;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lge;ILge;)V")
    public static final void method446(class47 arg0, int arg1, class47 arg2) {
        class65.field1855 = arg2;
        if (arg1 == 11182) {
            class74.field2061 = arg0;
            ++field1066;
        }
    }

    @OriginalMember(owner = "client!f", name = "l", descriptor = "(I)V")
    public static void method447(int arg0) {
        field1065 = null;
        field1054 = null;
        field1059 = null;
        if (arg0 != 4) {
            method447(101);
        }
        field1053 = null;
        field1063 = null;
        field1056 = null;
    }

    @OriginalMember(owner = "client!f", name = "g", descriptor = "(I)Ldf;")
    public final class28 method448(int arg0) {
        ++field1064;
        if (arg0 != -16777217) {
            return null;
        } else if (this.field1061 == null) {
            return null;
        } else {
            class46 var2 = ~super.field703 != 0 && super.field712 == 0 ? class33.method387(super.field703, 7455) : null;
            class46 var3 = ~super.field704 == 0 || super.field726 == super.field704 && var2 != null ? null : class33.method387(super.field704, 7455);
            class28 var4 = this.field1061.method189(25071, super.field693, var3, var2, super.field727);
            if (var4 == null) {
                return null;
            } else {
                var4.method298();
                super.field753 = var4.field1693;
                if (super.field732 != -1 && super.field746 != -1) {
                    class28 var5 = class62.method636(super.field732, (byte) -99).method780(6, super.field746);
                    if (var5 != null) {
                        var5.method303(0, -super.field725, 0);
                        class28[] var6 = new class28[] { var4, var5 };
                        var4 = new class28(var6, 2);
                    }
                }
                if (~this.field1061.field397 == -2) {
                    var4.field815 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II[Lhc;III[B)V")
    public static final void method449(int arg0, int arg1, class52[] arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        for (int var7 = 0; ~var7 > -5; ++var7) {
            for (int var12 = 0; ~var12 > -65; ++var12) {
                for (int var13 = 0; ~var13 > -65; ++var13) {
                    if (arg1 - -var12 > 0 && arg1 + var12 < 103 && ~(arg4 - -var13) < -1 && arg4 + var13 < 103) {
                        arg2[var7].field1455[arg1 + var12][arg4 + var13] = class66.method660(arg2[var7].field1455[arg1 + var12][arg4 + var13], -16777217);
                    }
                }
            }
        }
        ++field1055;
        if (arg3 == 2909) {
            class14 var8 = new class14(arg6);
            for (int var9 = 0; var9 < 4; ++var9) {
                for (int var10 = 0; var10 < 64; ++var10) {
                    for (int var11 = 0; ~var11 > -65; ++var11) {
                        class37.method453(arg1 + var10, var11 - -arg4, var9, arg5, var8, arg0, 0, (byte) 44);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "j", descriptor = "(I)Z")
    public final boolean method265(int arg0) {
        if (arg0 >= -35) {
            return true;
        } else {
            ++field1062;
            return this.field1061 != null;
        }
    }
}
