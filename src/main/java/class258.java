import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class258 extends class18 {

    @OriginalMember(owner = "client!fj", name = "B", descriptor = "Lmk;")
    public class105 field4119;

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "Loh;")
    public static class281 field4122 = new class281(64);

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!fj", name = "D", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!fj", name = "F", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "Lhc;")
    public static class235 field4128;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lhc;Z)V")
    public static final void method1747(class235 arg0, boolean arg1) {
        if (arg1) {
            field4128 = null;
        }
        field4127++;
        class264.field4190 = arg0;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lmk;)V")
    public class258(class105 arg0) {
        this.field4119 = arg0;
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(B)Z")
    public static final boolean method1748(byte arg0) {
        if (arg0 < 54) {
            field4123 = -38;
        }
        field4120++;
        try {
            return class297.method1983(-11246);
        } catch (IOException var4) {
            class17.method164(0);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class66.field1105 + "," + class52.field761 + "," + class256.field4091 + " - " + class53.field804 + "," + (class283.field4473.field2268[0] + class46.field656) + "," + (class283.field4473.field2271[0] + class260.field4162) + " - ";
            for (int var3 = 0; class53.field804 > var3 && var3 < 50; var3++) {
                var2 = var2 + class236.field3814.field1471[var3] + ",";
            }
            class168.method1130(var2, var5, -119);
            class26.method212((byte) 87);
            return true;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIII)V")
    public static final void method1749(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 5490) {
            return;
        }
        field4126++;
        if (arg0 == arg4) {
            class77.method546((byte) 67, arg2, arg5, arg0, arg1);
        } else if (class223.field3423 <= arg5 - arg0 && arg5 + arg0 <= class148.field2338 && arg2 - arg4 >= class90.field1568 && class266.field4247 >= arg2 + arg4) {
            class93.method705(arg0, (byte) -128, arg5, arg4, arg1, arg2);
        } else {
            class53.method395(arg0, arg1, arg4, -3, arg2, arg5);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(III)I")
    public static final int method1750(int arg0, int arg1, int arg2) {
        int var3 = class129.method894(false, arg0 - 1, arg2 - 1) + class129.method894(false, arg0 + 1, arg2 + -1) - (-class129.method894(false, arg0 + -1, arg2 + 1) + -class129.method894(false, arg0 + 1, arg2 + 1));
        field4121++;
        int var4 = class129.method894(false, arg0 - arg1, arg2) + class129.method894(false, arg0 + 1, arg2) + class129.method894(false, arg0, arg2 + -1) + class129.method894(false, arg0, arg2 + 1);
        int var5 = class129.method894(false, arg0, arg2);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "(I)V")
    public static void method1751(int arg0) {
        field4128 = null;
        field4122 = null;
        if (arg0 != 15373) {
            field4128 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lhc;I)V")
    public static final void method1752(class235 arg0, int arg1) {
        class138.field2118 = arg0;
        class158.field2460 = class138.field2118.method1616(4, arg1 ^ 0xFFFFCE1D);
        if (arg1 != 1) {
            method1748((byte) -16);
        }
        field4125++;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lre;IZ)V")
    public static final void method1753(class228 arg0, int arg1, boolean arg2) {
        field4124++;
        int var3 = arg0.field3522 == 0 ? arg0.field3574 : arg0.field3522;
        int var4 = arg0.field3513 == 0 ? arg0.field3625 : arg0.field3513;
        class293.method1959(arg2, var4, 255, arg0.field3480, var3, class193.field3052[arg0.field3480 >> 16]);
        if (arg0.field3498 != null) {
            class293.method1959(arg2, var4, arg1 + 15340, arg0.field3480, var3, arg0.field3498);
        }
        if (arg1 == -15085) {
            class251 var5 = (class251) class127.field2007.method285((long) arg0.field3480, 13821);
            if (var5 != null) {
                class240.method1647(arg2, var3, var5.field4041, var4, (byte) 97);
            }
        }
    }
}
