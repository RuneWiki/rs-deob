import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public abstract class class96 extends class55 {

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
    public static int field1282 = 0;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field1286 = new String[100];

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method382(int arg0);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IJ)V")
    public static final void method572(int arg0, long arg1) {
        if (class4.field61 == 1 || class4.field61 == 5) {
            class118.method761(arg1, -88);
        } else if (class4.field61 == 2) {
            class123.method804(false);
        } else {
            class246.method1589(-2);
        }
        if (arg0 < 65) {
            method575(true, (String) null, 62);
        }
        field1285++;
        if (!class177.field2518) {
            class153.field2217[0] = class247.field3597;
            class209.field2944[0] = class241.field3500;
            class240.field3482[0] = "";
            class112.field1496 = 1;
            class190.field2749[0] = 1002;
            if (class253.field3661 != 0) {
                class72.field866 = class257.field3719;
                class17.field215 = class152.field2199;
            } else if (class52.field599 == 0) {
                class17.field215 = class104.field1417;
                class72.field866 = class37.field431;
            } else {
                class17.field215 = class76.field905;
                class72.field866 = class190.field2736;
            }
        }
        if (class123.field1776 != -1) {
            class101.method619(264, class123.field1776);
        }
        for (int var3 = 0; var3 < class216.field3044; var3++) {
            if (class129.field1862[var3]) {
                class163.field2341[var3] = true;
            }
            class59.field705[var3] = class129.field1862[var3];
            class129.field1862[var3] = false;
        }
        class149.field2172 = null;
        class156.field2256 = class198.field2819;
        class161.field2319 = -1;
        class223.field3151 = null;
        class211.field2962 = -1;
        if (class123.field1776 != -1) {
            class216.field3044 = 0;
            class197.method1270(0);
        }
        class155.method1034();
        class271.method1735(120);
        if (class177.field2518) {
            if (class154.field2226) {
                class15.method95((byte) -97);
            } else {
                class167.method1099(123);
            }
        } else if (class223.field3151 != null) {
            class219.method1423(class97.field1296, (byte) 9, class167.field2408, class223.field3151);
        } else if (class211.field2962 != -1) {
            class219.method1423(class161.field2319, (byte) 9, class211.field2962, (class82) null);
        }
        int var4 = class177.field2518 ? -1 : class100.method610(62);
        if (var4 == -1) {
            var4 = class41.field504;
        }
        class51.method306((byte) 101, var4);
        if (class38.field454 == 1) {
            class38.field454 = 2;
        }
        if (class182.field2617 == 1) {
            class182.field2617 = 2;
        }
        if (class21.field253 == 3) {
            for (int var5 = 0; var5 < class216.field3044; var5++) {
                if (class59.field705[var5]) {
                    class155.method1030(class182.field2618[var5], class247.field3595[var5], class124.field1788[var5], class21.field259[var5], 16711935, 128);
                } else if (class163.field2341[var5]) {
                    class155.method1030(class182.field2618[var5], class247.field3595[var5], class124.field1788[var5], class21.field259[var5], 16711680, 128);
                }
            }
        }
        class9.method68(class123.field1771, class177.field2507.field4563, class199.field2833, class177.field2507.field4553, -26233);
        class123.field1771 = 0;
    }

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)Z")
    public abstract boolean method383(int arg0);

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "(I)V")
    public static void method573(int arg0) {
        if (arg0 == 31576) {
            field1286 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "(I)V")
    public static final void method574(int arg0) {
        class222.method1444((byte) -128, false);
        field1284++;
        System.gc();
        class17.method105(25, (byte) -106);
        if (arg0 != -2870) {
            field1282 = 87;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method575(boolean arg0, String arg1, int arg2) {
        if (arg2 != 1) {
            method575(false, (String) null, 15);
        }
        if (arg0) {
            try {
                class288.field4486.getAppletContext().showDocument(new URL(class288.field4486.getCodeBase(), arg1), "_blank");
            } catch (Exception var5) {
            }
        } else {
            try {
                class208.method1328(-24232, class115.field1592.field664, "loggedout");
            } catch (Throwable var4) {
            }
            try {
                class288.field4486.getAppletContext().showDocument(new URL(class288.field4486.getCodeBase(), arg1), "_top");
            } catch (Exception var3) {
            }
        }
        field1283++;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)Lpg;")
    public static final class187 method576(byte arg0) {
        byte[] var1 = class277.field4210[0];
        field1280++;
        int var2 = class91.field1236[0] * class296.field4677[0];
        class187 var5;
        if (class151.field2192[0]) {
            byte[] var6 = class255.field3682[0];
            int[] var7 = new int[var2];
            for (int var8 = 0; var8 < var2; var8++) {
                var7[var8] = class220.method1432(class5.method26(-16777216, var6[var8] << 24), class165.field2367[class5.method26(var1[var8], 255)]);
            }
            var5 = new class201(class238.field3435, class118.field1660, class233.field3367[0], class273.field4041[0], class296.field4677[0], class91.field1236[0], var7);
        } else {
            int[] var3 = new int[var2];
            for (int var4 = 0; var4 < var2; var4++) {
                var3[var4] = class165.field2367[class5.method26(var1[var4], 255)];
            }
            var5 = new class187(class238.field3435, class118.field1660, class233.field3367[0], class273.field4041[0], class296.field4677[0], class91.field1236[0], var3);
        }
        if (arg0 < 89) {
            field1282 = -91;
        }
        class294.method1965(true);
        return var5;
    }
}
