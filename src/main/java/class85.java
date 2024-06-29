import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class85 extends class471 {

    @OriginalMember(owner = "client!we", name = "O", descriptor = "Lsi;")
    public static class512 field1165 = new class512(10, 6);

    @OriginalMember(owner = "client!we", name = "P", descriptor = "I")
    public static int field1166 = 0;

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "Lgl;")
    public static class432 field1167 = new class432("", 10);

    @OriginalMember(owner = "client!we", name = "R", descriptor = "Lcm;")
    public static class449 field1168 = new class449(68, -1);

    @OriginalMember(owner = "client!we", name = "J", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!we", name = "M", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "Lns;")
    public static class438 field1161;

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IIIIIF)V")
    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII)V")
    public final void method428(int arg0, int arg1, int arg2, int arg3) {
        super.field6882 = arg0;
        super.field6890 = arg2;
        ++field1160;
        super.field6889 = arg1;
        if (arg3 != -20104) {
            this.method423(-2.3516762F, 113);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
    public static void method552(byte arg0) {
        field1165 = null;
        field1161 = null;
        if (arg0 >= -91) {
            field1161 = null;
        }
        field1167 = null;
        field1168 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(FI)V")
    public final void method423(float arg0, int arg1) {
        super.field6885 = arg0;
        ++field1162;
        if (arg1 > -112) {
            method554(-7, (String) null, (String) null, -122);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IILeu;ZLqa;I)V")
    public static final void method553(int arg0, int arg1, class130 arg2, boolean arg3, class496 arg4, int arg5) {
        ++field1163;
        class498 var6 = class471.field6878.method329(arg2.field1838, -23316);
        if (var6.field7273 != -1) {
            int var7;
            if (!arg2.field1880) {
                var7 = 0;
            } else {
                int var8 = arg2.field1844 + arg0;
                var7 = var8 & 3;
            }
            class191 var9 = var6.method2964(-119, arg4, arg2.field1845, var7);
            if (var9 != null) {
                int var10 = arg2.field1843;
                int var11 = arg2.field1898;
                if (arg3) {
                    if (~(var7 & 1) == -2) {
                        var10 = arg2.field1898;
                        var11 = arg2.field1843;
                    }
                    int var12 = var9.method209();
                    int var13 = var9.method219();
                    if (var6.field7268) {
                        var12 = var10 * 4;
                        var13 = var11 * 4;
                    }
                    if (~var6.field7270 != -1) {
                        var9.method34(arg1, -((var11 + -1) * 4) + arg5, var12, var13, 0, -16777216 | var6.field7270, 1);
                    } else {
                        var9.method1339(arg1, -((var11 - 1) * 4) + arg5, var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method554(int arg0, String arg1, String arg2, int arg3) {
        class313.field4781 = arg2;
        ++field1164;
        class329.field5070 = arg0;
        class245.field3429 = arg1;
        if (!class245.field3429.equals("") && !class313.field4781.equals("")) {
            if (class12.field195 != -1) {
                class487.method2901(-47);
            } else {
                class215.field2993 = 1;
                class332.field5129 = 0;
                class383.field5833 = 0;
                class376.field5748 = -3;
                class91 var4 = new class91(128);
                var4.method625(10, false);
                var4.method615(28010, (int) (Math.random() * 9.9999999E7D));
                var4.method614(class220.method1486(class245.field3429, -48), false);
                if (arg3 != -9413) {
                    method553(-49, -41, (class130) null, false, (class496) null, 78);
                }
                var4.method615(arg3 + 37423, (int) (Math.random() * 9.9999999E7D));
                var4.method603(83, class313.field4781);
                var4.method615(28010, (int) (9.9999999E7D * Math.random()));
                var4.method604(class353.field5470, class62.field883, true);
                class75.field1006.field1292 = 0;
                class75.field1006.method625(class442.field6585.field2934, false);
                class75.field1006.method625(2 - -var4.field1292, false);
                class75.field1006.method600(587, arg3 + -3478);
                class75.field1006.method597(0, var4.field1277, false, var4.field1292);
            }
        } else {
            class376.field5748 = 3;
        }
    }
}
