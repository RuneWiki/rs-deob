import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class218 extends class146 {

    @OriginalMember(owner = "client!n", name = "w", descriptor = "Ljava/lang/String;")
    public String field3508;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3504 = "cyan:";

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public static int field3506 = 5063219;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    public static int field3507 = 0;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "Lcd;")
    public static class35 field3510;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)V")
    public static final void method1446(byte arg0, int arg1) {
        field3500++;
        class23 var2 = class91.method694(arg1, 1, -37);
        if (arg0 != -111) {
            field3510 = null;
        }
        var2.method183(arg0 ^ 0x3D);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)I")
    public static final int method1447(int arg0) {
        if (arg0 == -769845689) {
            field3501++;
            return 0;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
    public static final void method1448(int arg0, int arg1) {
        field3505++;
        if (arg1 >= 0 && arg1 < class157.field2555.length) {
            int var2 = -91 % ((arg0 - 52) / 60);
            class157.field2555[arg1] = !class157.field2555[arg1];
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method1449(String arg0, byte arg1) {
        field3509++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class45.field820; var2++) {
            if (arg0.equalsIgnoreCase(class35.field603[var2])) {
                return var2;
            }
        }
        if (arg1 != 97) {
            field3504 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIZI)I")
    public static final int method1450(int arg0, int arg1, boolean arg2, int arg3) {
        field3503++;
        if (class21.field327 == null) {
            return 0;
        }
        int var4 = arg0 >> 7;
        int var5 = arg1 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg3;
        if (!arg2) {
            field3504 = null;
        }
        if (arg3 < 3 && (class43.field790[1][var5][var4] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var7 = arg1 & 0x7F;
        int var8 = arg0 & 0x7F;
        int var9 = (128 - var7) * class21.field327[var6][var5][var4 + 1] + class21.field327[var6][var5 + 1][var4 + 1] * var7 >> 7;
        int var10 = (128 - var7) * class21.field327[var6][var5][var4] + class21.field327[var6][var5 + 1][var4] * var7 >> 7;
        return (128 - var8) * var10 + var8 * var9 >> 7;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
    public class218() {
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(B)V")
    public static void method1451(byte arg0) {
        field3504 = null;
        field3510 = null;
        if (arg0 != -20) {
            field3507 = 90;
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class218(String arg0, int arg1) {
        this.field3508 = arg0;
    }
}
