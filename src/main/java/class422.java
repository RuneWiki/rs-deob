import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class422 {

    @OriginalMember(owner = "client!et", name = "a", descriptor = "I")
    public static int field5979 = 1406;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "Z")
    public static boolean field5983 = false;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "[Lid;")
    public static class415[] field5984 = new class415[14];

    @OriginalMember(owner = "client!et", name = "g", descriptor = "I")
    public static int field5985 = 0;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILma;Lla;ILli;IIIIILjava/lang/String;Lhd;)V")
    public static final void method2478(int arg0, class10 arg1, class316 arg2, int arg3, class297 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, String arg10, class523 arg11) {
        field5981++;
        int var12;
        if (class142.field1835 == 4) {
            var12 = (int) class463.field6626 & 0x3FFF;
        } else {
            var12 = (int) class463.field6626 + class309.field3967 & 0x3FFF;
        }
        int var13 = Math.max(arg11.field7617 / 2, arg11.field7574 / 2) + 10;
        int var14 = arg0 * arg0 + (arg9 * arg9);
        if (var14 > (var13 * var13)) {
            return;
        }
        int var15 = class36.field443[var12];
        int var16 = class36.field478[var12];
        if (class142.field1835 != 4) {
            var16 = var16 * 256 / (class317.field4050 + 256);
            var15 = var15 * 256 / (class317.field4050 + 256);
        }
        int var17 = arg0 * var16 + arg9 * var15 >> 15;
        int var18 = arg9 * var16 - arg0 * var15 >> 15;
        int var19 = arg4.method1755(100, arg8 ^ arg8, arg10, null);
        int var20 = var17 - var19 / 2;
        int var21 = arg4.method1744(0, null, arg10, arg8 ^ 0xFFFFC07A, 100);
        if (var20 >= -arg11.field7617 && var20 <= arg11.field7617 && var18 >= -arg11.field7574 && arg11.field7574 >= var18) {
            arg2.method1853(0, arg11.field7574 / 2 + arg3 - arg6 - var21 - var18, null, 65, arg5, 1, var19, 50, 0, arg11.field7617 / 2 + var20 + arg5, arg10, null, arg1, arg3, 0, arg7);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II)Z")
    public static final boolean method2479(int arg0, int arg1) {
        field5982++;
        int var2 = -116 / ((arg0 - 20) / 60);
        return arg1 != 1 && arg1 != 7;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
    public static void method2480(int arg0) {
        field5984 = null;
        int var1 = -105 / ((-arg0 - 14) / 60);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILfh;)Lvv;")
    public static final class214 method2481(int arg0, class463 arg1) {
        field5980++;
        return arg0 == 256 ? new class214(arg1.method2791(true), arg1.method2791(true), arg1.method2791(true), arg1.method2791(true), arg1.method2738(-67), arg1.method2738(arg0 ^ 0xFFFFFEAA), arg1.method2737(false)) : null;
    }
}
