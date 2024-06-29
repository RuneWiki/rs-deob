import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class147 {

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "I")
    public int field1865;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "Lkg;")
    public static class179 field1866 = new class179(17, -1);

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
    public static int field1867 = 0;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
    public static int field1870 = 0;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "[Lje;")
    public static class277[] field1869 = new class277[8];

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
    public static void method977(int arg0) {
        field1866 = null;
        if (arg0 != 8) {
            field1866 = null;
        }
        field1869 = null;
    }

    @OriginalMember(owner = "client!cu", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1863++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
    public static final void method978(String arg0, int arg1, String arg2) {
        if (arg1 <= 99) {
            method978(null, 82, null);
        }
        field1868++;
        class493.field7171 = arg2;
        class361.field4657 = arg0;
        if (class325.field4122 != 3 && class493.field7171.equals("") || class361.field4657.equals("")) {
            class183.method1157(-1979328921, 3);
            return;
        }
        if (class325.field4122 != 1) {
            class462.field6605 = 0;
            class50.field663 = -1;
        }
        class178.field2348 = false;
        class183.method1157(-1979328921, -3);
        class528.field7791 = 0;
        class321.field4067 = 0;
        class495.field7198 = 1;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIII)V")
    public static final void method979(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1864++;
        int var6 = arg5;
        int var7 = arg1;
        int var8 = arg3 * arg3;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((arg5 << 1) + 3) * var10;
        int var18 = ((arg1 << 1) - 3) * var11;
        int var19 = (arg5 + 1) * var16;
        if (arg0 >= class533.field7845 && arg0 <= class289.field3694) {
            int var20 = class33.method242(arg3 + arg4, field1870, class237.field3019, (byte) -128);
            int var21 = class33.method242(arg4 - arg3, field1870, class237.field3019, (byte) -128);
            class184.method1160(class387.field5088[arg0], -7, arg2, var20, var21);
        }
        int var22 = (arg1 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var19 += var16;
                    var17 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var17 += var16;
                var6++;
                var19 += var16;
            }
            var14 += -var18;
            var13 += -var22;
            var18 -= var15;
            var22 -= var15;
            var7--;
            int var23 = arg0 - var7;
            int var24 = arg0 + var7;
            if (class533.field7845 <= var24 && var23 <= class289.field3694) {
                int var25 = class33.method242(arg4 + var6, field1870, class237.field3019, (byte) -128);
                int var26 = class33.method242(arg4 - var6, field1870, class237.field3019, (byte) -128);
                if (var23 >= class533.field7845) {
                    class184.method1160(class387.field5088[var23], -7, arg2, var25, var26);
                }
                if (var24 <= class289.field3694) {
                    class184.method1160(class387.field5088[var24], -7, arg2, var25, var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(II)V")
    public class147(int arg0, int arg1) {
        this.field1865 = arg0;
    }
}
