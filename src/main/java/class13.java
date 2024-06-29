import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class13 {

    @OriginalMember(owner = "client!be", name = "b", descriptor = "Leb;")
    public static class31 field184 = new class31(20);

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Lqf;")
    public static class117 field187 = class72.method514(118, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!be", name = "d", descriptor = "Z")
    public static volatile boolean field186 = false;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "Lqf;")
    private static class117 field189 = class72.method514(121, "Enter name of friend to delete from list");

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Lqf;")
    public static class117 field188 = field189;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Lqf;")
    private static class117 field192 = class72.method514(113, "Use");

    @OriginalMember(owner = "client!be", name = "k", descriptor = "[[B")
    public static byte[][] field193 = new byte[50][];

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Lqf;")
    public static class117 field190 = field192;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "Lqf;")
    public static class117 field191 = class72.method514(104, "Mitteilung");

    @OriginalMember(owner = "client!be", name = "m", descriptor = "[B")
    public static byte[] field195 = new byte[520];

    @OriginalMember(owner = "client!be", name = "l", descriptor = "Lqf;")
    public static class117 field194 = class72.method514(127, ": ");

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)Lma;")
    public static final class84 method109(byte arg0) {
        class84 var1 = new class84();
        field185++;
        var1.field1916 = class21.field354[0];
        var1.field1917 = class41.field806[0];
        var1.field1921 = class132.field3122;
        var1.field1920 = class42.field840[0];
        int var2 = var1.field1920 * var1.field1916;
        var1.field1915 = new int[var2];
        var1.field1919 = class99.field2384;
        var1.field1918 = class116.field2758[0];
        byte[] var3 = class3.field58[0];
        if (arg0 != -32) {
            field191 = null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var1.field1915[var4] = class144.field3536[class16.method135(var3[var4], 255)];
        }
        class73.method525(-21572);
        return var1;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
    public static final void method110(byte arg0) {
        field183++;
        class152 var1 = class116.field2740;
        synchronized (class116.field2740) {
            class68.field1421 = class66.field1381;
            if (class45.field884 >= 0) {
                while (class95.field2301 != class45.field884) {
                    int var3 = class43.field859[class95.field2301];
                    class95.field2301 = class95.field2301 + 1 & 0x7F;
                    if (var3 < 0) {
                        class130.field3095[~var3] = false;
                    } else {
                        class130.field3095[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class130.field3095[var2] = false;
                }
                class45.field884 = class95.field2301;
            }
            class66.field1381 = class136.field3257;
        }
        int var4 = 73 / ((arg0 - 41) / 50);
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(B)V")
    public static void method111(byte arg0) {
        field188 = null;
        field187 = null;
        field191 = null;
        field184 = null;
        if (arg0 <= 26) {
            return;
        }
        field195 = null;
        field194 = null;
        field189 = null;
        field190 = null;
        field192 = null;
        field193 = null;
    }
}
