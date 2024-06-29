import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class355 extends class600 {

    @OriginalMember(owner = "client!nu", name = "k", descriptor = "[I")
    public int[] field4530;

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "[I")
    public int[] field4526;

    @OriginalMember(owner = "client!nu", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4528 = "";

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!nu", name = "h", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!nu", name = "j", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!nu", name = "l", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!nu", name = "m", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(I)V")
    public static void method1945(int arg0) {
        field4528 = null;
        if (arg0 != -4795) {
            method1948(-69, 23, 50, 56, 99);
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method1946(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (arg5 <= 68) {
            return;
        }
        field4532++;
        int var8 = arg1 + arg4;
        int var9 = arg3 - arg4;
        for (int var10 = arg1; var10 < var8; var10++) {
            class57.method362(arg7, class550.field7650[var10], arg2, arg0, -127);
        }
        int var11 = arg0 - arg4;
        for (int var12 = arg3; var12 > var9; var12--) {
            class57.method362(arg7, class550.field7650[var12], arg2, arg0, -116);
        }
        int var13 = arg4 + arg7;
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class550.field7650[var14];
            class57.method362(arg7, var15, arg2, var13, 63);
            class57.method362(var13, var15, arg6, var11, -126);
            class57.method362(var11, var15, arg2, arg0, -122);
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IILqi;IB)V")
    public static final void method1947(int arg0, int arg1, class514 arg2, int arg3, byte arg4) {
        field4525++;
        int var5 = arg2.field9758[0];
        int var6 = -112 % ((-arg1 - 3) / 35);
        int var7 = arg2.field9754[0];
        if (var5 < 0 || class431.field5395 <= var5 || var7 < 0 || var7 >= class452.field5802 || arg3 < 0 || class431.field5395 <= arg3 || arg0 < 0 || arg0 >= class452.field5802) {
            return;
        }
        int var8 = class395.method2116(class410.field5129, 0, var5, 0, arg0, true, 0, class154.field1991[arg2.field6470], var7, arg3, true, arg2.method2785(-1), class105.field1407, -4, 0);
        if (var8 >= 1 && var8 <= 3) {
            for (int var9 = 0; var9 < (var8 - 1); var9++) {
                arg2.method2780(class105.field1407[var9], arg4, class410.field5129[var9], true);
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIII)V")
    public static final void method1948(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4529++;
        float var5 = (float) class656.field9273 / (float) class656.field9259;
        int var6 = arg4;
        int var7 = arg0;
        if ((float) arg1 > var5) {
            var7 = (int) ((float) arg4 * var5);
        } else {
            var6 = (int) ((float) arg0 / var5);
        }
        int var8 = arg3 - (arg0 - var7) / 2;
        int var9 = arg2 - (arg4 - var6) / 2;
        class635.field8898 = class656.field9273 - (class656.field9273 * var8 / var7);
        class330.field4217 = -1;
        class91.field1281 = -1;
        class198.field2501 = class656.field9259 * var9 / var6;
        class28.method189(-2488);
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(II[I[I)V")
    public class355(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field4530 = arg3;
        this.field4526 = arg2;
    }
}
