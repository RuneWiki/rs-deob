import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class197 extends class221 {

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    private final int field3839;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    private final int field3833;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    private final int field3841;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    private final int field3835;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public static int field3834 = 0;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    public static int field3836 = 0;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "Lrd;")
    private static class173 field3851 = class133.method843("Walk here", 42);

    @OriginalMember(owner = "client!th", name = "x", descriptor = "Lrd;")
    private static class173 field3842 = class133.method843("RuneScape is loading )2 please wait)3)3)3", 87);

    @OriginalMember(owner = "client!th", name = "C", descriptor = "Lrd;")
    public static class173 field3847 = field3842;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "Lrd;")
    public static class173 field3844 = field3851;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "Lrd;")
    public static class173 field3850 = class133.method843("Zu viele Anmelde)2Versuche von Ihrer Adresse", 39);

    @OriginalMember(owner = "client!th", name = "n", descriptor = "Lrd;")
    public static class173 field3832 = class133.method843("jolt", -125);

    @OriginalMember(owner = "client!th", name = "E", descriptor = "I")
    public static int field3849 = 0;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public static int field3854 = -1;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!th", name = "D", descriptor = "Llb;")
    public static class111 field3848;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(III)V")
    public final void method394(int arg0, int arg1, int arg2) {
        ++field3838;
        int var4 = this.field3839 * arg2 >> 12;
        int var5 = this.field3835 * arg2 >> 12;
        if (arg0 != 0) {
            field3842 = null;
        }
        int var6 = this.field3833 * arg1 >> 12;
        int var7 = this.field3841 * arg1 >> 12;
        class82.method516(var7, 9760, var6, var4, var5, super.field4248);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
    public static final void method1310(int arg0) {
        ++field3853;
        class165.field3175.method1023(194, -21822);
        ++class152.field2883;
        for (class157 var1 = (class157) client.field637.method684((byte) -76); var1 != null; var1 = (class157) client.field637.method678(false)) {
            if (~var1.field2947 == -1) {
                class176.method1170(true, var1, 1540);
            }
        }
        if (class93.field1749 != null) {
            class209.method1379(1, class93.field1749);
            class93.field1749 = null;
        }
        int var2 = -89 / ((arg0 - -89) / 36);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIB)V")
    public final void method399(int arg0, int arg1, byte arg2) {
        ++field3846;
        int var4 = this.field3839 * arg0 >> 12;
        int var5 = this.field3835 * arg0 >> 12;
        int var6 = this.field3833 * arg1 >> 12;
        int var7 = 37 % ((arg2 - -50) / 44);
        int var8 = this.field3841 * arg1 >> 12;
        class186.method1249(var4, var8, super.field4251, super.field4246, -89, var5, super.field4248, var6);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V")
    public final void method393(int arg0, int arg1, int arg2) {
        ++field3840;
        int var4 = this.field3839 * arg1 >> 12;
        if (arg2 == 0) {
            int var5 = this.field3833 * arg0 >> 12;
            int var6 = this.field3835 * arg1 >> 12;
            int var7 = this.field3841 * arg0 >> 12;
            class179.method1205(var5, (byte) -30, var4, super.field4251, super.field4246, var6, var7);
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(IIIIIII)V")
    public class197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3839 = arg0;
        this.field3833 = arg1;
        this.field3841 = arg3;
        this.field3835 = arg2;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V")
    public static void method1311(boolean arg0) {
        field3848 = null;
        if (arg0) {
            field3850 = null;
            field3847 = null;
            field3832 = null;
            field3842 = null;
            field3851 = null;
            field3844 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILmb;)Lrd;")
    public static final class173 method1312(int arg0, class121 arg1) {
        if (arg0 < 58) {
            field3832 = null;
        }
        ++field3837;
        return class118.method718(32767, true, arg1);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BI[Lrh;[BI)V")
    public static final void method1313(byte arg0, int arg1, class177[] arg2, byte[] arg3, int arg4) {
        ++field3852;
        class121 var5 = new class121(arg3);
        int var6 = -1;
        if (arg0 > -94) {
            field3844 = null;
        }
        while (true) {
            int var7 = var5.method737(1086075528);
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method734(-1);
                if (~var9 == -1) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 >> 6 & 63;
                int var11 = var8 >> 12;
                int var12 = 63 & var8;
                int var13 = var5.method751((byte) -91);
                int var14 = var13 >> 2;
                int var15 = arg4 + var10;
                int var16 = arg1 + var12;
                int var17 = 3 & var13;
                if (var15 > 0 && var16 > 0 && ~var15 > -104 && ~var16 > -104) {
                    class177 var18 = null;
                    int var19 = var11;
                    if ((2 & class21.field462[1][var15][var16]) == 2) {
                        var19 = var11 - 1;
                    }
                    if (~var19 <= -1) {
                        var18 = arg2[var19];
                    }
                    class89.method568(var18, var14, var17, var16, var6, (byte) -9, var11, var15);
                }
            }
        }
    }
}
