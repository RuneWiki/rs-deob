import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class483 {

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field7059 = 0;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Lkg;")
    public static class179 field7067 = new class179(33, 18);

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field7062;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field7065;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public int field7066;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Ll;")
    public static class16 field7061;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Luj;")
    public class261 field7064;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "Lqn;")
    public static class47 field7068;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "[I")
    public int[] field7063;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
    public static final void method2939(boolean arg0) {
        class520 var1 = (class520) class201.field2616.method153(0);
        if (!arg0) {
            method2941(122);
        }
        while (var1 != null) {
            if (class474.method2860(var1.field7508, 4)) {
                class277.method1635(var1, (byte) 88);
            }
            var1 = (class520) class201.field2616.method161(-56);
        }
        field7060++;
        if (class2.field24 == 1) {
            class293.method1720(8526);
            return;
        }
        class501.method3018((byte) -122, class337.field4242, class325.field4128, class14.field229, class117.field1580);
        int var2 = class274.field3437.method1757((byte) 55, class128.field1699.method1936(-26539, class11.field177));
        for (class520 var3 = (class520) class201.field2616.method153(0); var3 != null; var3 = (class520) class201.field2616.method161(-125)) {
            int var4 = class113.method818(116, var3);
            if (var4 > var2) {
                var2 = var4;
            }
        }
        class117.field1580 = var2 + 8;
        class337.field4242 = class2.field24 * 16 + (class163.field2075 ? 26 : 22);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIZII)V")
    public static final void method2940(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field7065++;
        long var6 = (long) ((arg3 ? Integer.MIN_VALUE : 0) | arg0);
        class529 var8 = (class529) class339.field4254.method2022(-1, var6);
        if (var8 == null) {
            var8 = new class529();
            class339.field4254.method2019((byte) -108, var8, var6);
        }
        if (var8.field7796.length <= arg5) {
            int[] var9 = new int[arg5 + 1];
            int[] var10 = new int[arg5 + 1];
            for (int var11 = 0; var11 < var8.field7796.length; var11++) {
                var9[var11] = var8.field7796[var11];
                var10[var11] = var8.field7794[var11];
            }
            for (int var12 = var8.field7796.length; var12 < arg5; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field7794 = var10;
            var8.field7796 = var9;
        }
        var8.field7796[arg5] = arg1;
        if (arg2 != 1) {
            method2941(23);
        }
        var8.field7794[arg5] = arg4;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method2941(int arg0) {
        field7067 = null;
        field7061 = null;
        if (arg0 == -1) {
            field7068 = null;
        }
    }
}
