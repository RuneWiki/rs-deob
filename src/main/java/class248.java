import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class248 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Lvv;")
    public static class531 field3367 = new class531();

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field3372 = 0;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Lsv;")
    public static class319 field3370;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method1481(byte arg0, int arg1) {
        field3368++;
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class214.field3039.method1126(class486.field6998, (byte) -19) + " (" + var2 + ")</col>";
        } else {
            if (arg0 >= -45) {
                field3370 = null;
            }
            return var2.length() > 6 ? " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class419.field6073.method1126(class486.field6998, (byte) -19) + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)V")
    public static final void method1482(int arg0, int arg1, int arg2) {
        field3369++;
        if (arg2 == 2) {
            class314 var3 = class177.method1213(false, 1, arg0);
            var3.method1808(-7412);
            var3.field4253 = arg1;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static void method1483(int arg0) {
        field3370 = null;
        if (arg0 != -8) {
            field3370 = null;
        }
        field3367 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIII)V")
    public static final void method1484(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3371++;
        float var5 = (float) class472.field6833 / (float) class472.field6821;
        int var6 = arg0;
        int var7 = arg2;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg0 * var5);
        } else {
            var6 = (int) ((float) arg2 / var5);
        }
        int var8 = arg1 - (arg2 - var7) / 2;
        int var9 = arg4 - (arg0 - var6) / arg3;
        class336.field4899 = class472.field6821 * var9 / var6;
        class281.field3828 = -1;
        class321.field4414 = class472.field6833 - (class472.field6833 * var8 / var7);
        class470.field6776 = -1;
        class409.method2400((byte) 2);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)Z")
    public static final boolean method1485(byte arg0) {
        field3373++;
        if (arg0 <= 43) {
            method1483(-49);
        }
        class476 var1 = class391.field5638.field7789.field6879;
        if (var1 == null || class391.field5638.field7789 == var1) {
            return false;
        }
        class440 var2 = (class440) var1;
        if (var2.field6337 >= 2000) {
            var2.field6337 -= 2000;
        }
        return var2.field6337 == 1002;
    }
}
