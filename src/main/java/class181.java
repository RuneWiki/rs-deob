import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class181 {

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Lr;")
    private static class66 field3163 = class93.method641(43, "Free world");

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Lr;")
    public static class66 field3161 = class93.method641(43, "Fps:");

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Lr;")
    public static class66 field3162 = field3163;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field3166 = 0;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Lr;")
    public static class66 field3169 = class93.method641(43, "_labels");

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field3171 = -1;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "[I")
    public static int[] field3167 = new int[100];

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "[S")
    public static short[] field3173 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V")
    public static final void method1204(int arg0, int arg1, int arg2) {
        if (class206.field3575 > 0) {
            class17.method70(class206.field3575, (byte) 60);
            class206.field3575 = 0;
        }
        int var3 = 0;
        field3165++;
        short var4 = 256;
        int var5 = class235.field4104 * arg0;
        int var6 = 0;
        if (arg2 != 95) {
            return;
        }
        for (int var7 = 1; var7 < var4 - 1; var7++) {
            int var8 = (var4 - var7) * class240.field4168[var7] / var4;
            if (var8 < 0) {
                var8 = 0;
            }
            var3 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class102.field1995[var3++];
                int var12 = class235.field4105[arg1 + var5++];
                if (var11 == 0) {
                    class244.field4273.field3011[var6++] = var12;
                } else {
                    int var13 = var11 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = 256 - (var11 + 18);
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    int var15 = class147.field2679[var11];
                    class244.field4273.field3011[var6++] = class115.method767(class115.method767(65280, var15) * var13 + var14 * class115.method767(var12, 65280), 16711680) + class115.method767(-16711936, var13 * class115.method767(var15, 16711935) + var14 * class115.method767(var12, 16711935)) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class244.field4273.field3011[var6++] = class235.field4105[var5++ + arg1];
            }
            var5 += class235.field4104 - 128;
        }
        class244.field4273.method974(arg1, arg0);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static final void method1205(String arg0, Throwable arg1, int arg2) {
        field3164++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class101.method701(arg1, -113);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace((char) arg2, '_');
            String var7 = var6.replace('#', '_');
            if (class192.field3325.field2184 != null) {
                class232 var8 = class192.field3325.method774(new URL(class192.field3325.field2184.getCodeBase(), "clienterror.ws?c=" + class29.field431 + "&u=" + class27.field363 + "&v1=" + class117.field2178 + "&v2=" + class117.field2200 + "&e=" + var7), arg2 - 38);
                while (var8.field4066 == 0) {
                    class91.method636(arg2 ^ 0xFFFFFFDD, 1L);
                }
                if (var8.field4066 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field4069;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)V")
    public static final void method1206(int arg0, int arg1) {
        field3168++;
        if (arg1 == -1 || !class164.method1107(arg1, (byte) -2)) {
            return;
        }
        if (arg0 != -1) {
            method1206(104, 115);
        }
        class63[] var2 = class31.field466[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class63 var4 = var2[var3];
            if (var4.field1082 != null) {
                class237 var5 = new class237();
                var5.field4118 = var4.field1082;
                var5.field4120 = var4;
                class43.method311(var5, (byte) 124, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static final void method1207(byte arg0) {
        for (int var1 = -1; var1 < client.field1650; var1++) {
            int var6;
            if (var1 == -1) {
                var6 = 2047;
            } else {
                var6 = class192.field3335[var1];
            }
            class45 var7 = class59.field988[var6];
            if (var7 != null && var7.field2085 > 0) {
                var7.field2085--;
                if (var7.field2085 == 0) {
                    var7.field2092 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class160.field2869; var2++) {
            int var4 = class49.field877[var2];
            class37 var5 = class178.field3112[var4];
            if (var5 != null && var5.field2085 > 0) {
                var5.field2085--;
                if (var5.field2085 == 0) {
                    var5.field2092 = null;
                }
            }
        }
        int var3 = 49 % ((arg0 - 54) / 63);
        field3172++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
    public static void method1208(boolean arg0) {
        field3167 = null;
        field3161 = null;
        field3173 = null;
        if (arg0) {
            field3163 = null;
            field3162 = null;
            field3169 = null;
        }
    }
}
