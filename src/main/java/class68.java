import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class68 {

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field1277 = 0;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field1275 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Lvd;")
    private static class222 field1282 = class212.method1357("Players", 10731);

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Lvd;")
    public static class222 field1278 = field1282;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Lvd;")
    public static class222 field1281 = class212.method1357("RuneScape wurde aktualisiert(Q", 10731);

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "Lvd;")
    private static class222 field1286 = class212.method1357("Your profile will be transferred in:", 10731);

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field1283 = 0;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "Lvd;")
    public static class222 field1284 = field1286;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Lw;")
    public static class228 field1274;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Lg;")
    public static class66 field1280;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)I")
    public static final int method462(int arg0, int arg1) {
        field1285++;
        if (arg1 != 255) {
            method466((byte) -127);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static final void method463(byte arg0) {
        field1279++;
        for (class149 var1 = (class149) class76.field1479.method236(0); var1 != null; var1 = (class149) class76.field1479.method237(true)) {
            class37 var2 = var1.field2842;
            if (class217.field4036 != var2.field794 || class175.field3280 > var2.field823) {
                var1.method826(-22101);
            } else if (var2.field800 <= class175.field3280) {
                if (var2.field826 > 0) {
                    class193 var3 = class202.field3696[var2.field826 - 1];
                    if (var3 != null && var3.field1353 >= 0 && var3.field1353 < 13312 && var3.field1360 >= 0 && var3.field1360 < 13312) {
                        var2.method298(arg0 + 17940, class175.field3280, var3.field1353, var3.field1360, class71.method482(var3.field1360, var3.field1353, var2.field794, (byte) 120) - var2.field806);
                    }
                }
                if (var2.field826 < 0) {
                    int var4 = -var2.field826 - 1;
                    class38 var5;
                    if (class35.field773 == var4) {
                        var5 = class17.field432;
                    } else {
                        var5 = class54.field1024[var4];
                    }
                    if (var5 != null && var5.field1353 >= 0 && var5.field1353 < 13312 && var5.field1360 >= 0 && var5.field1360 < 13312) {
                        var2.method298(arg0 ^ 0xFFFFBA14, class175.field3280, var5.field1353, var5.field1360, class71.method482(var5.field1360, var5.field1353, var2.field794, (byte) 119) - var2.field806);
                    }
                }
                var2.method304(class121.field2305, false);
                class6.method57(class217.field4036, (int) var2.field819, (int) var2.field798, (int) var2.field804, 60, var2, var2.field809, -1L, false);
            }
        }
        if (arg0 != -93) {
            method463((byte) 58);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V")
    public static final void method464(Throwable arg0, int arg1, String arg2) {
        field1276++;
        try {
            if (arg1 != 128) {
                method463((byte) -109);
            }
            String var3 = "";
            if (arg0 != null) {
                var3 = class52.method378(arg0, (byte) 84);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class23.field542.field730 != null) {
                class141 var8 = class23.field542.method279(new URL(class23.field542.field730.getCodeBase(), "clienterror.ws?c=" + class151.field2932 + "&u=" + class66.field1245 + "&v1=" + class33.field729 + "&v2=" + class33.field715 + "&e=" + var7), (byte) 124);
                while (var8.field2716 == 0) {
                    class225.method1471(1L, -23364);
                }
                if (var8.field2716 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field2714;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)Lbg;")
    public static final class19 method465(boolean arg0) {
        field1273++;
        class19 var1 = new class19();
        var1.field450 = class218.field4050[0];
        var1.field447 = class102.field1892;
        byte[] var2 = class157.field3020[0];
        var1.field444 = class223.field4182;
        var1.field446 = class83.field1584[0];
        var1.field448 = class185.field3429[0];
        if (arg0) {
            field1278 = null;
        }
        int var3 = var1.field448 * var1.field446;
        var1.field449 = class174.field3279[0];
        var1.field445 = new int[var3];
        for (int var4 = 0; var4 < var3; var4++) {
            var1.field445[var4] = class235.field4398[class139.method876(var2[var4], 255)];
        }
        class160.method1009(!arg0);
        return var1;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
    public static void method466(byte arg0) {
        field1274 = null;
        if (arg0 < 104) {
            return;
        }
        field1278 = null;
        field1280 = null;
        field1286 = null;
        field1282 = null;
        field1281 = null;
        field1284 = null;
    }
}
