import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class83 {

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "[I")
    public static int[] field1326 = new int[128];

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Lsc;")
    public static class181 field1329 = class149.method967(255, "T");

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Ljd;")
    public static class265 field1328 = new class265(64);

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "[[[B")
    public static byte[][][] field1327;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method563(int arg0, int arg1) {
        field1331++;
        if (arg0 == 100 && class100.field1682 > 0) {
            byte[] var2 = class182.field3210[--class100.field1682];
            class182.field3210[class100.field1682] = null;
            return var2;
        } else if (arg0 == 5000 && class70.field1131 > 0) {
            byte[] var3 = class244.field4241[--class70.field1131];
            class244.field4241[class70.field1131] = null;
            return var3;
        } else if (arg0 == 30000 && class254.field4437 > 0) {
            byte[] var4 = class47.field737[--class254.field4437];
            class47.field737[class254.field4437] = null;
            return var4;
        } else if (arg1 == 0) {
            return new byte[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZI)V")
    public static final void method564(boolean arg0, int arg1) {
        field1324++;
        if (arg1 != -29350) {
            return;
        }
        int var2 = class184.field3266.length;
        byte[][] var3 = class121.field1989;
        for (int var4 = 0; var4 < var2; var4++) {
            byte[] var5 = var3[var4];
            if (var5 != null) {
                int var6 = (class78.field1264[var4] >> 8) * 64 - class253.field4420;
                int var7 = (class78.field1264[var4] & 0xFF) * 64 - class222.field3844;
                class4.method36((byte) 18);
                class185.method1292(var5, class109.field1784, (byte) 99, arg0, var7, var6);
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
    public static final void method565(Throwable arg0, String arg1, int arg2) {
        field1325++;
        try {
            if (arg2 < 115) {
                method566(false);
            }
            String var3 = "";
            if (arg0 != null) {
                var3 = class183.method1252(0, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class194.field3393.field2285 != null) {
                class118 var8 = class194.field3393.method912(new URL(class194.field3393.field2285.getCodeBase(), "clienterror.ws?c=" + class46.field730 + "&u=" + class137.field2250 + "&v1=" + class142.field2287 + "&v2=" + class142.field2295 + "&e=" + var7), true);
                while (var8.field1933 == 0) {
                    class95.method632(true, 1L);
                }
                if (var8.field1933 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field1935;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
    public static void method566(boolean arg0) {
        field1329 = null;
        field1326 = null;
        if (arg0) {
            field1327 = null;
            field1328 = null;
        }
    }
}
