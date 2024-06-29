import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class100 {

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field1640 = 0;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "Z")
    public static boolean field1642 = false;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1644 = "wave:";

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "[[I")
    public static int[][] field1647 = new int[104][104];

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1641 = "Allocated memory";

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field1649 = 0;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)I")
    public static final int method733(int arg0, int arg1, int arg2) {
        if (arg2 > -103) {
            return -10;
        }
        field1645++;
        int var3 = class179.method1216(4, arg0 + 45365, false, arg1 + 91923) + (class179.method1216(2, arg0 + 10294, false, arg1 + 37821) - 128 >> 1) + (class179.method1216(1, arg0, false, arg1) - 128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
    public static void method734(boolean arg0) {
        if (!arg0) {
            field1647 = null;
            field1641 = null;
            field1644 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public static final void method735(int arg0) {
        class180.field2827.method481(false);
        field1651++;
        int var1 = -125 / ((-arg0 - 30) / 52);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)V")
    public static final void method736(byte arg0, int arg1) {
        field1648++;
        if (arg0 < 69) {
            field1641 = null;
        }
        class259 var2 = class213.method1464((byte) -93, arg1, 2);
        var2.method1772((byte) 118);
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(III)I")
    public static final int method737(int arg0, int arg1, int arg2) {
        field1646++;
        if (arg1 != -35) {
            return 90;
        }
        class239 var3 = (class239) class214.field3502.method1400((long) arg2, true);
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field3879.length; var5++) {
                if (var3.field3880[var5] == arg0) {
                    var4 += var3.field3879[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZC)I")
    public static final int method738(int arg0, boolean arg1, char arg2) {
        field1643++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg1) {
            return 10;
        } else {
            if (arg2 == 'ñ' && arg0 == 0) {
                var3 = 1762;
            }
            return var3;
        }
    }
}
