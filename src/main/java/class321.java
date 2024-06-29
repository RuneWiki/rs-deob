import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class321 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "Z")
    public static boolean field3945 = true;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Lki;")
    public class321 field3946;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "Lki;")
    public class321 field3948;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "[I")
    public static int[] field3949;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
    public final void method1821(int arg0) {
        if (arg0 <= 63) {
            method1824(-71, -31);
        }
        field3947++;
        if (this.field3946 != null) {
            this.field3946.field3948 = this.field3948;
            this.field3948.field3946 = this.field3946;
            this.field3946 = null;
            this.field3948 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)V")
    public static void method1822(int arg0) {
        if (arg0 == -24801) {
            field3949 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)V")
    public static final void method1823(int arg0) {
        field3951++;
        int var1 = 9 % ((37 - arg0) / 37);
        for (class323 var2 = (class323) class412.field5527.method3434((byte) 2); var2 != null; var2 = (class323) class412.field5527.method3430(true)) {
            if (var2.field3967 > 0) {
                var2.field3967--;
            }
            if (var2.field3967 != 0) {
                if (var2.field3972 > 0) {
                    var2.field3972--;
                }
                if (var2.field3972 == 0 && var2.field3971 >= 1 && var2.field3968 >= 1 && class142.field1574 - 2 >= var2.field3971 && var2.field3968 <= class140.field1550 - 2 && (var2.field3976 < 0 || class205.method1230(var2.field3979, var2.field3976, 14726))) {
                    class697.method3833(var2.field3975, var2.field3979, var2.field3968, var2.field3973, -1, var2.field3976, var2.field3971, (byte) -128, var2.field3978);
                    var2.field3972 = -1;
                    if (var2.field3977 == var2.field3976 && var2.field3977 == -1) {
                        var2.method1922(120);
                    } else if (var2.field3977 == var2.field3976 && var2.field3978 == var2.field3969 && var2.field3979 == var2.field3970) {
                        var2.method1922(108);
                    }
                }
            } else if (var2.field3977 < 0 || class205.method1230(var2.field3970, var2.field3977, 14726)) {
                class697.method3833(var2.field3975, var2.field3970, var2.field3968, var2.field3973, -1, var2.field3977, var2.field3971, (byte) -126, var2.field3969);
                var2.method1922(115);
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)V")
    public static final void method1824(int arg0, int arg1) {
        field3950++;
        int var2 = 45 / ((arg0 + 41) / 57);
        class76 var3 = class3.method28(11, (byte) 42, arg1);
        var3.method406(-975503968);
    }
}
