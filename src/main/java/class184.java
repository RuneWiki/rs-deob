import java.io.DataInputStream;
import java.math.BigInteger;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class184 {

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field2575 = -1;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "Lng;")
    public static class190 field2576 = new class190(30);

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public static int field2579 = 0;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2577 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "[I")
    public static int[] field2570;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "[[B")
    public static byte[][] field2574;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "[[Lsh;")
    public static class44[][] field2571;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V")
    public static final void method1212(int arg0, int arg1, int arg2) {
        field2573++;
        if (class77.method545(true, arg2)) {
            class142.method969(class333.field4511[arg2], -1, arg1);
            int var3 = 59 / ((arg0 - 60) / 47);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
    public static void method1213(int arg0) {
        field2574 = null;
        field2577 = null;
        field2570 = null;
        field2576 = null;
        field2571 = null;
        if (arg0 != 8912) {
            method1213(-123);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method1214(int arg0, String arg1, Throwable arg2) {
        field2572++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class120.method814(arg2, 9);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class68.method463(var3, 115);
            String var4 = class97.method686(":", -18715, var3, "%3a");
            String var5 = class97.method686("@", -18715, var4, "%40");
            String var6 = class97.method686("&", -18715, var5, "%26");
            String var7 = class97.method686("#", -18715, var6, "%23");
            if (class359.field5058.field4888 != null) {
                class295 var8 = class359.field5058.method2241(new URL(class359.field5058.field4888.getCodeBase(), "clienterror.ws?c=" + class364.field5101 + "&u=" + class153.field2161 + "&v1=" + class351.field4903 + "&v2=" + class351.field4897 + "&e=" + var7), -24458);
                while (var8.field4068 == 0) {
                    class4.method28(1L, 77);
                }
                int var9 = 35 % ((48 - arg0) / 56);
                if (var8.field4068 == 1) {
                    DataInputStream var10 = (DataInputStream) var8.field4070;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }
}
