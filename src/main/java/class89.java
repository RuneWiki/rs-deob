import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class89 {

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "[Ldf;")
    public static class51[] field1476 = new class51[100];

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Lqh;")
    public static class189 field1477 = new class189(64);

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field1482 = 0;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Ldf;")
    public static class51 field1484 = class46.method233("Versteckt", 100);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "Lhc;")
    public static class212 field1483;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ldf;Z)V")
    public static final void method673(class51 arg0, boolean arg1) {
        field1479++;
        if (class153.field2547 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg0.method316(80);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class153.field2547.length && class153.field2547[var2].field1760 != var3) {
            var2++;
        }
        if (var2 >= class153.field2547.length || class153.field2547[var2] == null) {
            return;
        }
        class95.field1575.method424((byte) 71, 150);
        class95.field1575.method885(class153.field2547[var2].field1760, (byte) -111);
        if (!arg1) {
            method676((byte) -56);
        }
        class30.field426++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
    public static final void method674(Throwable arg0, String arg1, int arg2) {
        field1481++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class49.method249(arg0, -26);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', (char) arg2);
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class216.field3750.field3999 != null) {
                class150 var8 = class216.field3750.method1574(new URL(class216.field3750.field3999.getCodeBase(), "clienterror.ws?c=" + class124.field2106 + "&u=" + class30.field443 + "&v1=" + class229.field4003 + "&v2=" + class229.field3986 + "&e=" + var7), -22708);
                while (var8.field2504 == 0) {
                    class147.method1066(1L, 0);
                }
                if (var8.field2504 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field2505;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[Ldf;)[Ldf;")
    public static final class51[] method675(int arg0, class51[] arg1) {
        field1478++;
        class51[] var2 = new class51[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class20.method104(-115, new class51[] { class51.method311(var3, 10), class159.field2612 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class20.method104(class167.method1163(arg0, -14161), new class51[] { var2[var3], arg1[var3] });
            }
        }
        if (arg0 != -14182) {
            method675(-71, (class51[]) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static void method676(byte arg0) {
        field1483 = null;
        field1484 = null;
        field1477 = null;
        field1476 = null;
        if (arg0 != -55) {
            method675(-68, (class51[]) null);
        }
    }
}
