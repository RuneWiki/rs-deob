import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class22 {

    @OriginalMember(owner = "client!na", name = "b", descriptor = "Lhi;")
    public static class82 field297 = class95.method664((byte) -66, "blanc:");

    @OriginalMember(owner = "client!na", name = "a", descriptor = "[I")
    public static int[] field296 = new int[25];

    @OriginalMember(owner = "client!na", name = "i", descriptor = "[I")
    public static int[] field304 = new int[5];

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Lam;")
    public static class277 field300 = new class277();

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public static int field308 = 0;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "Lhi;")
    public static class82 field306 = class95.method664((byte) -122, "Connexion au serveur de mise -9 jour en cours");

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field307 = 0;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "[B")
    public static byte[] field305 = new byte[520];

    @OriginalMember(owner = "client!na", name = "o", descriptor = "[I")
    public static int[] field310 = new int[50];

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Lrm;")
    public class175 field298;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Lti;")
    public class186 field299;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 4)
    public static final void method149(int arg0) {
        field301++;
        class20.field270 = 0;
        class106.field1877 = 0;
        class300.method2075((byte) -67);
        client.method862(-5);
        class272.method1903(false);
        for (int var1 = arg0; var1 < class20.field270; var1++) {
            int var2 = class149.field2545[var1];
            if (class212.field3708 != class99.field1777[var2].field1680) {
                if (class99.field1777[var2].field4628.method1656(-16)) {
                    class183.method1271((byte) -128, class99.field1777[var2]);
                }
                class99.field1777[var2].method1918(85, (class233) null);
                class99.field1777[var2] = null;
            }
        }
        if (class199.field3421 != class35.field545.field2611) {
            throw new RuntimeException("gnp1 pos:" + class35.field545.field2611 + " psize:" + class199.field3421);
        }
        for (int var3 = 0; var3 < class25.field333; var3++) {
            if (class99.field1777[class43.field749[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class25.field333);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lbc;I)Lj;", line = 70)
    public static final class232 method150(class153 arg0, int arg1) {
        field302++;
        arg0.method1082(-94);
        int var2 = arg0.method1082(-42);
        class232 var3 = class122.method836(var2, -10);
        var3.field4003 = arg0.method1082(-25);
        int var4 = arg0.method1082(-71);
        for (int var5 = arg1; var5 < var4; var5++) {
            int var6 = arg0.method1082(-59);
            var3.method81(var6, (byte) -19, arg0);
        }
        var3.method144(83);
        return var3;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V", line = 106)
    public static void method151(int arg0) {
        field296 = null;
        field297 = null;
        field300 = null;
        if (arg0 == 0) {
            field310 = null;
            field306 = null;
            field304 = null;
            field305 = null;
        }
    }
}
