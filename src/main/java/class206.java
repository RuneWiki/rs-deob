import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class206 {

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "[Ljb;")
    public static class224[] field3079 = new class224[29];

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "Lfl;")
    public static class85 field3080 = new class85();

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field3081 = new String[200];

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V")
    public static void method1286(boolean arg0) {
        field3080 = null;
        field3081 = null;
        field3079 = null;
        if (arg0) {
            field3081 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(JI)V")
    public static final void method1287(long arg0, int arg1) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 > -64) {
            field3081 = null;
        }
        field3078++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public static final void method1288(int arg0) {
        class167.field2392.method948((byte) 58);
        int var1 = -80 / ((arg0 + 13) / 40);
        class106.field1520.method948((byte) 58);
        class260.field4192.method948((byte) 58);
        field3076++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZB)V")
    public static final void method1289(boolean arg0, byte arg1) {
        if (arg1 < 38) {
            field3079 = null;
        }
        for (class309 var2 = (class309) class153.field2128.method369((byte) -121); var2 != null; var2 = (class309) class153.field2128.method362(false)) {
            if (var2.field4979 != null) {
                class116.field1671.method910(var2.field4979);
                var2.field4979 = null;
            }
            if (var2.field4978 != null) {
                class116.field1671.method910(var2.field4978);
                var2.field4978 = null;
            }
            var2.method962(128);
        }
        field3077++;
        if (!arg0) {
            return;
        }
        for (class309 var3 = (class309) class75.field1056.method369((byte) -82); var3 != null; var3 = (class309) class75.field1056.method362(false)) {
            if (var3.field4979 != null) {
                class116.field1671.method910(var3.field4979);
                var3.field4979 = null;
            }
            var3.method962(128);
        }
        for (class309 var4 = (class309) class274.field4357.method1458(0); var4 != null; var4 = (class309) class274.field4357.method1462(-10000001)) {
            if (var4.field4979 != null) {
                class116.field1671.method910(var4.field4979);
                var4.field4979 = null;
            }
            var4.method962(128);
        }
    }
}
