import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class645 {

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "I")
    public static int field9135 = 0;

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "Lvi;")
    public static class560 field9137 = new class560(50);

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "Llp;")
    public static class270 field9139 = new class270(12, 0, 1, 0);

    @OriginalMember(owner = "client!mba", name = "g", descriptor = "Lnj;")
    public static class436 field9141 = new class436(64);

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "I")
    public static int field9136;

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!mba", name = "h", descriptor = "[Lefa;")
    public static class40[] field9142;

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "[[[B")
    public static byte[][][] field9140;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method3587(String arg0, byte arg1) {
        if (arg1 == -44) {
            class334.method2133("", 0, "", arg0, 0, -107, "");
            field9138++;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)V")
    public static void method3588(byte arg0) {
        field9140 = null;
        field9139 = null;
        field9141 = null;
        field9137 = null;
        if (arg0 > -101) {
            field9141 = null;
        }
        field9142 = null;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(BILfca;I)V")
    public static final void method3589(byte arg0, int arg1, class188 arg2, int arg3) {
        if (class613.field8378) {
            class579 var4 = class525.field7257 == -1 ? null : class191.field2486.method1256(class525.field7257, -3934);
            if (client.method1411(arg2).method1646(2) && (class525.field7268 & 0x20) != 0 && (var4 == null || arg2.method1201((byte) -48, class525.field7257, var4.field7999) != var4.field7999)) {
                class606.method3350(arg2.field2387, 0L, false, arg2.field2361, class306.field4114, class413.field5798, 48, class665.field9444 + " -> " + arg2.field2307, arg2.field2324, true, false);
                class350.field5118++;
            }
        }
        field9136++;
        int var5 = 9;
        int var6 = -22 % ((arg0 + 68) / 44);
        while (var5 >= 5) {
            String var10 = class144.method983(arg2, (byte) 39, var5);
            if (var10 != null) {
                class453.field6176++;
                class606.method3350(arg2.field2387, (long) (var5 + 1), false, arg2.field2361, var10, class394.method2343(var5, -1, arg2), 1009, arg2.field2307, arg2.field2324, true, false);
            }
            var5--;
        }
        String var7 = class28.method177(arg2, 64);
        if (var7 != null) {
            class90.field1107++;
            class606.method3350(arg2.field2387, 0L, false, arg2.field2361, var7, arg2.field2335, 4, arg2.field2307, arg2.field2324, true, false);
        }
        for (int var8 = 4; var8 >= 0; var8--) {
            String var9 = class144.method983(arg2, (byte) 39, var8);
            if (var9 != null) {
                class606.method3350(arg2.field2387, (long) (var8 + 1), false, arg2.field2361, var9, class394.method2343(var8, -1, arg2), 22, arg2.field2307, arg2.field2324, true, false);
                class453.field6176++;
            }
        }
        if (!client.method1411(arg2).method1648(-1)) {
            return;
        }
        if (arg2.field2367 == null) {
            class606.method3350(arg2.field2387, 0L, false, arg2.field2361, class243.field3173.method1491(class350.field5121, (byte) 127), -1, 5, "", arg2.field2324, true, false);
        } else {
            class606.method3350(arg2.field2387, 0L, false, arg2.field2361, arg2.field2367, -1, 5, "", arg2.field2324, true, false);
        }
        class125.field1604++;
    }
}
