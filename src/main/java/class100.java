import java.awt.Component;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class class100 {

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lpe;")
    public static class109 field2093 = class141.method1120("leuchten3:", 0);

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Lpe;")
    private static class109 field2094 = class141.method1120("Create a free account", 0);

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Lpe;")
    public static class109 field2098 = class141.method1120("Fallen lassen", 0);

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Lpe;")
    public static class109 field2090 = class141.method1120("Update)2Liste geladen)3", 0);

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Lpe;")
    public static class109 field2096 = field2094;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Lpe;")
    public static class109 field2092 = class141.method1120("welle2:", 0);

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "Lwa;")
    public static class154 field2100 = null;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Ljb;")
    public static class64 field2095 = new class64(512);

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2101 = new CRC32();

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "Lpe;")
    public static class109 field2103 = class141.method1120("Verbindung konnte nicht hergestellt werden)3", 0);

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public static int field2102 = 0;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field2104 = 0;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Lwa;")
    public static class154 field2088;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method801(byte arg0, Component arg1);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZI)Lpe;")
    public static final class109 method802(int arg0, boolean arg1, int arg2) {
        field2099++;
        if (arg0 != 10325) {
            method806(-82, null, (byte) 37, null, null);
        }
        return class83.method709(10, arg2, arg1, 18303);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILbe;)Lpe;")
    public static final class109 method803(int arg0, int arg1, class13 arg2) {
        field2091++;
        try {
            class109 var3 = new class109();
            var3.field2295 = arg2.method147(false);
            if (arg0 != 0) {
                field2088 = null;
            }
            if (arg1 < var3.field2295) {
                var3.field2295 = arg1;
            }
            var3.field2279 = new byte[var3.field2295];
            arg2.field309 += class92.field1976.method201((byte) -118, var3.field2279, var3.field2295, arg2.field279, 0, arg2.field309);
            return var3;
        } catch (Exception var4) {
            return class88.field1868;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILna;B)Lsb;")
    public static final class127 method804(int arg0, class91 arg1, byte arg2) {
        field2089++;
        byte[] var3 = arg1.method751((byte) -92, arg0);
        if (var3 == null) {
            return null;
        } else {
            if (arg2 > -98) {
                method807(false);
            }
            return new class127(var3);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)I")
    public abstract int method805(int arg0);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILpe;BLpe;Lpe;)V")
    public static final void method806(int arg0, class109 arg1, byte arg2, class109 arg3, class109 arg4) {
        int var5 = 99;
        if (arg2 <= 8) {
            return;
        }
        while (var5 > 0) {
            class156.field3605[var5] = class156.field3605[var5 - 1];
            class116.field2573[var5] = class116.field2573[var5 - 1];
            class121.field2677[var5] = class121.field2677[var5 - 1];
            class146.field3193[var5] = class146.field3193[var5 - 1];
            var5--;
        }
        class116.field2573[0] = arg4;
        class156.field3605[0] = arg0;
        class121.field2677[0] = arg3;
        field2097++;
        class76.field1593++;
        class146.field3193[0] = arg1;
        class6.field145 = class9.field219;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
    public static void method807(boolean arg0) {
        field2092 = null;
        field2093 = null;
        field2094 = null;
        field2100 = null;
        field2095 = null;
        field2101 = null;
        field2090 = null;
        if (arg0) {
            method804(92, null, (byte) -121);
        }
        field2096 = null;
        field2088 = null;
        field2103 = null;
        field2098 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method808(Component arg0, byte arg1);
}
