import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class53 {

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "[I")
    public static int[] field855 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "B")
    public static byte field858 = 0;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Lgj;")
    public static class226 field849 = new class226(64);

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "Lsb;")
    public static class98 field859 = class47.method368("cross", 0);

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "Lwa;")
    public static class219 field861 = new class219(4096);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public int field850;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public int field853;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "J")
    public long field852;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Lsc;")
    public class119 field851;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Lnj;")
    public static class82 field854;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static void method395(byte arg0) {
        field861 = null;
        if (arg0 == -35) {
            field859 = null;
            field854 = null;
            field855 = null;
            field849 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)Lkb;")
    public static final class247 method396(int arg0) {
        field857++;
        int var1 = -96 % ((-arg0 - 49) / 60);
        int var2 = class245.field4326[0] * class164.field2958[0];
        byte[] var3 = class204.field3491[0];
        class247 var6;
        if (class220.field3791[0]) {
            int[] var7 = new int[var2];
            byte[] var8 = class1.field5[0];
            for (int var9 = 0; var9 < var2; var9++) {
                var7[var9] = class67.method471(class214.method1427(var8[var9], 255) << 24, class33.field572[class214.method1427(255, var3[var9])]);
            }
            var6 = new class179(class144.field2538, class101.field1790, class253.field4422[0], class9.field207[0], class245.field4326[0], class164.field2958[0], var7);
        } else {
            int[] var4 = new int[var2];
            for (int var5 = 0; var5 < var2; var5++) {
                var4[var5] = class33.field572[class214.method1427(var3[var5], 255)];
            }
            var6 = new class247(class144.field2538, class101.field1790, class253.field4422[0], class9.field207[0], class245.field4326[0], class164.field2958[0], var4);
        }
        class125.method932(true);
        return var6;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)V")
    public static final void method397(byte arg0, int arg1) {
        field856++;
        if (arg0 != 22) {
            field860 = 11;
        }
        for (class224 var2 = (class224) client.field1771.method1514((byte) 66); var2 != null; var2 = (class224) client.field1771.method1515(arg0 + 91)) {
            if ((long) arg1 == (var2.field4061 >> 48 & 0xFFFFL)) {
                var2.method1611((byte) -125);
            }
        }
    }
}
