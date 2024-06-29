import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class390 extends class213 {

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "Ljava/lang/Object;")
    private Object field5871;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "[I")
    public static int[] field5865 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "[I")
    public static int[] field5867 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!qi", name = "F", descriptor = "Ldp;")
    public static class347 field5873 = new class347("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!qi", name = "G", descriptor = "[Llu;")
    public static class427[] field5874 = new class427[8];

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!qi", name = "E", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "(I)V", line = 5)
    public static final void method2336(int arg0) {
        class206.field2995 = new class474(8);
        field5869++;
        class30.field428 = arg0;
        for (class387 var1 = (class387) class534.field7857.method3089(28); var1 != null; var1 = (class387) class534.field7857.method3088((byte) -65)) {
            var1.method2321();
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lmh;II)V", line = 23)
    public static final void method2337(class112 arg0, int arg1, int arg2) {
        if (class174.field2551) {
            arg2 = 0;
            class174.field2551 = false;
        }
        if (arg1 != 4) {
            method2336(-68);
        }
        field5870++;
        if (class181.field2696 != null && class181.field2696.method869(arg0, 16)) {
            return;
        }
        class181.field2696 = arg0;
        class21.field315 = class381.method2281((byte) -125);
        class310.field4799 = arg2;
        class471.field6897 = arg2;
        if (class471.field6897 == 0) {
            class206.method1349(false);
            return;
        }
        class19.field289 = class167.field2476;
        class458.field6697 = class480.field7086;
        class170.field2500 = class378.field5692;
        class180.field2665 = class265.field3958;
        class233.field3280 = class351.field5403;
        class494.field7345 = class317.field4900;
        class492.field7332 = class23.field333;
        class68.field904 = class385.field5803;
        class281.field4242 = class503.field7412;
        class489.field7289 = class170.field2495;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILec;I)I", line = 67)
    public static final int method2338(int arg0, class109 arg1, int arg2) {
        field5866++;
        if (arg2 < 86) {
            method2337(null, -124, -96);
        }
        return -1;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)V", line = 83)
    public static void method2339(boolean arg0) {
        if (arg0) {
            field5873 = null;
            field5867 = null;
            field5874 = null;
            field5865 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)I", line = 96)
    public static int method2340(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 106)
    public final Object method462(int arg0) {
        field5864++;
        if (arg0 != 29793) {
            this.method462(-107);
        }
        return this.field5871;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 119)
    public class390(Object arg0, int arg1) {
        super(arg1);
        this.field5871 = arg0;
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)Z", line = 127)
    public final boolean method463(byte arg0) {
        int var2 = -79 / ((arg0 - 15) / 50);
        field5868++;
        return false;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIIIBI)V", line = 141)
    public static final void method2341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        if (arg8 != 89) {
            field5867 = null;
        }
        field5872++;
        if (arg2 == arg3 && arg5 == arg7 && arg0 == arg1 && arg4 == arg6) {
            class382.method2295(arg9, arg4, (byte) -96, arg2, arg1, arg7);
            return;
        }
        int var10 = arg2;
        int var11 = arg7;
        int var12 = arg2 * 3;
        int var13 = arg7 * 3;
        int var14 = arg3 * 3;
        int var15 = arg5 * 3;
        int var16 = arg0 * 3;
        int var17 = arg6 * 3;
        int var18 = arg1 + var14 - var16 - arg2;
        int var19 = arg4 + var15 - var17 - arg7;
        int var20 = var16 + var12 - var14 - var14;
        int var21 = var17 + var13 - var15 - var15;
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var29 + var31 + var27 >> 12) + arg2;
            int var34 = (var28 - (-var30 - var32) >> 12) + arg7;
            class382.method2295(arg9, var34, (byte) -96, var10, var33, var11);
            var10 = var33;
            var11 = var34;
        }
    }
}
