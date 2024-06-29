import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class98 {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Lcd;")
    public static class23 field2083 = class54.method414("Gegenstand f-Ur Mitglieder", -1);

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field2087 = -1;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "Lcd;")
    private static class23 field2088 = class54.method414("Checking for updates )2 ", -1);

    @OriginalMember(owner = "client!l", name = "h", descriptor = "Lcd;")
    public static class23 field2090 = field2088;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Lcd;")
    private static class23 field2084 = class54.method414("Loading textures )2 ", -1);

    @OriginalMember(owner = "client!l", name = "m", descriptor = "[Z")
    public static boolean[] field2095 = new boolean[8];

    @OriginalMember(owner = "client!l", name = "l", descriptor = "Lcd;")
    public static class23 field2094 = field2084;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "Lcd;")
    public static class23 field2097 = class54.method414("60 Sekunden noch einmal)3)3)3", -1);

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2085 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!l", name = "s", descriptor = "Lcd;")
    public static class23 field2101 = class54.method414("null", -1);

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public static int field2102 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "Lcd;")
    public static class23 field2100 = class54.method414("Ung-Ultiges Anmelde)2Paket)3", -1);

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public int field2086;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public int field2091;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public int field2092;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public int field2093;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public int field2098;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Lsh;")
    public class169 field2089;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "Lfa;")
    public static class47 field2099;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static void method662(int arg0) {
        field2101 = null;
        field2097 = null;
        field2090 = null;
        field2094 = null;
        field2100 = null;
        int var1 = -81 % ((47 - arg0) / 32);
        field2095 = null;
        field2088 = null;
        field2083 = null;
        field2085 = null;
        field2099 = null;
        field2084 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public static final void method663(byte arg0) {
        field2096++;
        int var1 = 0;
        if (arg0 != 54) {
            return;
        }
        while (var1 < class51.field1216) {
            int var10002 = class29.field621[var1]--;
            if (class29.field621[var1] >= -10) {
                label78: {
                    class123 var3 = client.field572[var1];
                    if (var3 == null) {
                        var3 = class123.method764(class113.field2375, class62.field1441[var1], 0);
                        if (var3 == null) {
                            break label78;
                        }
                        class29.field621[var1] += var3.method763();
                        client.field572[var1] = var3;
                    }
                    if (class29.field621[var1] < 0) {
                        label81: {
                            int var10;
                            if (class117.field2441[var1] == 0) {
                                var10 = class160.field3209;
                            } else {
                                int var4 = (class117.field2441[var1] & 0xFF) * 128;
                                int var5 = class117.field2441[var1] >> 16 & 0xFF;
                                int var6 = class117.field2441[var1] >> 8 & 0xFF;
                                int var7 = var6 * 128 + 64 - class134.field2790.field277;
                                if (var7 < 0) {
                                    var7 = -var7;
                                }
                                int var8 = var5 * 128 + 64 - class134.field2790.field215;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = var8 + var7 - 128;
                                if (var9 > var4) {
                                    class29.field621[var1] = -100;
                                    break label81;
                                }
                                if (var9 < 0) {
                                    var9 = 0;
                                }
                                var10 = (var4 - var9) * class205.field4031 / var4;
                            }
                            if (var10 > 0) {
                                class83 var11 = var3.method761().method558(class55.field1301);
                                class171 var12 = class171.method1056(var11, 100, var10);
                                var12.method1048(class122.field2527[var1] - 1);
                                class2.field25.method1244(var12);
                            }
                            class29.field621[var1] = -100;
                        }
                    }
                }
            } else {
                class51.field1216--;
                for (int var2 = var1; var2 < class51.field1216; var2++) {
                    class62.field1441[var2] = class62.field1441[var2 + 1];
                    client.field572[var2] = client.field572[var2 + 1];
                    class122.field2527[var2] = class122.field2527[var2 + 1];
                    class29.field621[var2] = class29.field621[var2 + 1];
                    class117.field2441[var2] = class117.field2441[var2 + 1];
                }
                var1--;
            }
            var1++;
        }
        if (class25.field531 && !class143.method914(arg0 ^ 0x6322FE56)) {
            if (class40.field848 != 0 && class28.field600 != -1) {
                class66.method489(0, class193.field3812, class40.field848, -114, class28.field600, false);
            }
            class25.field531 = false;
        }
    }
}
