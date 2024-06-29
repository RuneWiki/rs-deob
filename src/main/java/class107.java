import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public class class107 {

    @OriginalMember(owner = "client!aja", name = "e", descriptor = "[I")
    public static int[] field1534 = new int[14];

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!aja", name = "c", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!aja", name = "d", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!aja", name = "f", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(ZLol;)Llu;", line = 6)
    public static final class57 method859(boolean arg0, class431 arg1) {
        if (!arg0) {
            field1534 = null;
        }
        field1533++;
        class272 var2 = class149.method1178(arg1, (byte) -79);
        int var3 = arg1.method2547(-121);
        return new class57(var2.field3820, var2.field3828, var2.field3822, var2.field3823, var2.field3821, var3);
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(B)V", line = 23)
    public static void method860(byte arg0) {
        if (arg0 <= 111) {
            field1535 = -25;
        }
        field1534 = null;
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(IIII)V", line = 35)
    public static final void method861(int arg0, int arg1, int arg2, int arg3) {
        field1532++;
        if (class163.field2508 == arg0 && class133.field2226 == arg1 && class100.field1484 == arg2) {
            return;
        }
        class163.field2508 = arg0;
        class100.field1484 = arg2;
        class87.field1297 = true;
        class133.field2226 = arg1;
        double var4 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
        double var6 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
        if (arg3 != 2) {
            field1534 = null;
        }
        double var8 = Math.cos(var6);
        double var10 = Math.sin(var6);
        double var12 = Math.cos(var4);
        double var14 = Math.sin(var4);
        class131.field2213 = -var10 * var12;
        class147.field2361 = var10;
        class249.field3580 = var8;
        class233.field3385 = 0.0D;
        class141.field2313 = var14;
        class465.field6339 = var12;
        class498.field6853 = var8 * var12;
        class286.field4205 = -var8 * var14;
        class677.field9519 = var10 * var14;
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IC)Ljava/lang/String;", line = 100)
    public static final String method862(String arg0, String arg1, int arg2, char arg3) {
        field1531++;
        int var4 = arg0.length();
        int var5 = arg1.length();
        int var6 = var4;
        int var7 = var5 - 1;
        int var8 = 99 % ((-arg2 - 9) / 34);
        if (var7 != 0) {
            int var9 = 0;
            while (true) {
                var9 = arg0.indexOf(arg3, var9);
                if (var9 < 0) {
                    break;
                }
                var6 += var7;
                var9++;
            }
        }
        StringBuffer var10 = new StringBuffer(var6);
        int var11 = 0;
        while (true) {
            int var12 = arg0.indexOf(arg3, var11);
            if (var12 < 0) {
                var10.append(arg0.substring(var11));
                return var10.toString();
            }
            var10.append(arg0.substring(var11, var12));
            var11 = var12 + 1;
            var10.append(arg1);
        }
    }
}
