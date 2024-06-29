import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class37 extends class393 {

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "Lhb;")
    public static class250 field571 = new class250(3, -1);

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field574 = 0;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "Ldn;")
    public static class201 field572;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "Lfi;")
    public class37 field568;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "Lfi;")
    public class37 field569;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "Lmv;")
    public static class518 field573;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V", line = 7)
    public static void method238(int arg0) {
        if (arg0 != -1) {
            method239(16);
        }
        field571 = null;
        field572 = null;
        field573 = null;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V", line = 21)
    public static final void method239(int arg0) {
        field570++;
        if (arg0 != -3614) {
            field572 = null;
        }
        for (class352 var1 = (class352) class235.field3065.method49(arg0 + 3489); var1 != null; var1 = (class352) class235.field3065.method46((byte) 85)) {
            class224 var2 = var1.field4503;
            if (class366.field4715 != var2.field6220 || class264.field3353 > var2.field2886) {
                var1.method3021(arg0 + 3501);
                var2.method1427(16383);
            } else if (var2.field2914 <= class264.field3353) {
                if (var2.field2897 > 0) {
                    class295 var3 = class527.field7791[var2.field2897 - 1];
                    if (var3 != null && var3.field6239 >= 0 && var3.field6239 < (class200.field2594 * 128) && var3.field6241 >= 0 && (class118.field1647 * 128) > var3.field6241) {
                        var2.method1425(var3.field6239, class366.method2145(var2.field6220, (byte) 98, var3.field6239, var3.field6241) - var2.field2911, class264.field3353, var3.field6241, -32768);
                    }
                }
                if (var2.field2897 < 0) {
                    int var4 = -var2.field2897 - 1;
                    class518 var5;
                    if (class166.field2149 == var4) {
                        var5 = field573;
                    } else {
                        var5 = class76.field952[var4];
                    }
                    if (var5 != null && var5.field6239 >= 0 && class200.field2594 * 128 > var5.field6239 && var5.field6241 >= 0 && var5.field6241 < (class118.field1647 * 128)) {
                        var2.method1425(var5.field6239, class366.method2145(var2.field6220, (byte) 15, var5.field6239, var5.field6241) - var2.field2911, class264.field3353, var5.field6241, -32768);
                    }
                }
                var2.method1431(class314.field4050, true);
                class363.method2134(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)V", line = 81)
    public final void method240(int arg0) {
        field567++;
        if (this.field569 == null) {
            return;
        }
        this.field569.field568 = this.field568;
        this.field568.field569 = this.field569;
        this.field568 = null;
        this.field569 = null;
        if (arg0 != 3) {
            method239(-9);
        }
    }
}
