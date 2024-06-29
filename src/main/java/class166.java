import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class166 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field2441 = new String[100];

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "Ltm;")
    public static class112 field2443 = new class112("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Lbd;")
    public static class464 field2445 = new class464(0, -1);

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Lop;")
    public static class63 field2446;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)I")
    public static final int method1019(int arg0, int arg1) {
        field2444++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        if (arg0 != -20703) {
            field2445 = null;
        }
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg1 & ~var7;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static void method1020(int arg0) {
        field2443 = null;
        field2441 = null;
        if (arg0 >= 17) {
            field2445 = null;
            field2446 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
    public static final void method1021(int arg0) {
        field2442++;
        if (class237.field3339 != null) {
            class237.field3339.method2632(32214);
            class237.field3339 = null;
        }
        class441.method2559(true);
        class11.method107();
        for (int var1 = 0; var1 < 4; var1++) {
            class308.field4209[var1].method1704(true);
        }
        int var2 = -110 / ((-arg0 - 48) / 42);
        class432.method2527(20809, false);
        System.gc();
        class310.method1875(2, -7);
        class7.field122 = false;
        class282.field3867 = -1;
        class284.method1760(true, (byte) 59);
        class287.field3914 = false;
        class325.field4472 = 0;
        class182.field2643 = 0;
        class153.field2204 = 0;
        class275.field3810 = 0;
        for (int var3 = 0; var3 < class51.field860.length; var3++) {
            class51.field860[var3] = null;
        }
        class234.method1473((byte) 115);
        for (int var4 = 0; var4 < 2048; var4++) {
            class310.field4235[var4] = null;
        }
        class32.field520 = 0;
        for (int var5 = 0; var5 < 32768; var5++) {
            class256.field3581[var5] = null;
        }
        class135.field1898.method2623((byte) 117);
        class422.method2449(92);
        class421.field5795 = 0;
        class320.field4376.method1490(128);
        class305.method1849(-108);
        class467.method2749(-119);
        class35.method295((byte) -117, true);
        try {
            class207.method1299(class343.field4703.field234, 19639, "loggedout");
        } catch (Throwable var6) {
        }
        class473.field6627 = null;
        class343.field4705 = 0L;
    }

    static {
        new class112((String) null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", (String) null, (String) null);
        field2447 = 0;
    }
}
