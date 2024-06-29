import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class60 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "Loh;")
    public static class263 field1231 = class253.method1681(-126, ")2");

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field1233 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "[I")
    public static int[] field1236 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "[Z")
    public static boolean[] field1237 = new boolean[100];

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field1232 = 0;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field1239 = 0;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "Loh;")
    public static class263 field1242 = class253.method1681(-122, "Versteckt");

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "J")
    public static long field1234;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static final void method368(int arg0) {
        if (arg0 > -116) {
            method369(true);
        }
        while (class189.field3394.method1518(class36.field826, 8) >= 11) {
            int var1 = class189.field3394.method1512(11, 126);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class151.field2725[var1] == null) {
                class151.field2725[var1] = new class137();
                if (class8.field142[var1] != null) {
                    class151.field2725[var1].method895(-13, class8.field142[var1]);
                }
                var2 = true;
            }
            class249.field4354[class41.field911++] = var1;
            class137 var3 = class151.field2725[var1];
            var3.field4670 = class228.field4012;
            int var4 = class254.field4422[class189.field3394.method1512(3, 127)];
            if (var2) {
                var3.field4674 = var3.field4700 = var4;
            }
            int var5 = class189.field3394.method1512(1, 127);
            int var6 = class189.field3394.method1512(1, 126);
            if (var6 == 1) {
                class21.field627[class249.field4355++] = var1;
            }
            int var7 = class189.field3394.method1512(5, 126);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class189.field3394.method1512(5, 127);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method897(var5 == 1, class229.field4018.field4714[0] + var7, 125, class229.field4018.field4713[0] + var8);
        }
        field1238++;
        class189.field3394.method1513(103);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
    public static void method369(boolean arg0) {
        if (!arg0) {
            field1231 = null;
        }
        field1236 = null;
        field1242 = null;
        field1237 = null;
        field1231 = null;
    }
}
