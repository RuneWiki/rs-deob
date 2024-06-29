import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class145 {

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Loh;")
    public static class263 field2656 = class253.method1681(-123, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "[I")
    public static int[] field2651 = new int[2];

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Loh;")
    public static class263 field2659 = class253.method1681(-121, "Sprites geladen)3");

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Loh;")
    public static class263 field2655 = class253.method1681(-119, "");

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "B")
    public static byte field2649;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "Ltf;")
    public static class104 field2660;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Lue;")
    public static class86 field2657;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
    public static final Object method956(byte[] arg0, boolean arg1, int arg2) {
        field2650++;
        if (arg0 == null) {
            return null;
        }
        if (~arg0.length < arg2 && !class158.field2865) {
            try {
                class258 var3 = (class258) Class.forName("fh").getDeclaredConstructor().newInstance();
                var3.method838(false, arg0);
                return var3;
            } catch (Throwable var4) {
                class158.field2865 = true;
            }
        }
        return arg1 ? class114.method746(arg0, (byte) -115) : arg0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method957(int arg0) {
        field2657 = null;
        field2659 = null;
        if (arg0 != -1) {
            method957(-4);
        }
        field2655 = null;
        field2656 = null;
        field2660 = null;
        field2651 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIIIBI)V")
    public static final void method958(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        if (arg8 != 80) {
            field2655 = null;
        }
        field2653++;
        if (arg0 == arg6 && arg7 == arg9 && arg4 == arg5 && arg1 == arg2) {
            class216.method1462(-124, arg9, arg4, arg3, arg1, arg6);
            return;
        }
        int var10 = arg6;
        int var11 = arg6 * 3;
        int var12 = arg9 * 3;
        int var13 = arg9;
        int var14 = arg0 * 3;
        int var15 = arg7 * 3;
        int var16 = arg5 * 3;
        int var17 = arg2 * 3;
        int var18 = arg1 + var15 - var17 - arg9;
        int var19 = var12 + var17 - var15 - var15;
        int var20 = var16 - var14 - (var14 - var11);
        int var21 = arg4 - var16 - (-var14 + arg6);
        int var22 = var14 - var11;
        int var23 = var15 - var12;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var21 * var26;
            int var28 = var18 * var26;
            int var29 = var19 * var25;
            int var30 = var20 * var25;
            int var31 = var22 * var24;
            int var32 = (var27 + var31 + var30 >> 12) + arg6;
            int var33 = var23 * var24;
            int var34 = arg9 + (var28 + var29 + var33 >> 12);
            class216.method1462(-127, var13, var32, arg3, var34, var10);
            var10 = var32;
            var13 = var34;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ldg;I)I")
    public static final int method959(class137 arg0, int arg1) {
        field2658++;
        int var2 = arg0.field2505;
        if (arg1 <= 97) {
            return -2;
        }
        if (arg0.field4687 == arg0.field4652) {
            var2 = arg0.field2534;
        } else if (arg0.field4707 == arg0.field4652) {
            var2 = arg0.field2506;
        }
        return var2;
    }
}
