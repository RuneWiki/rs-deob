import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class54 {

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field815 = 0;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Lce;")
    public static class126 field822 = class206.method1445(-7923, "Fps:");

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "[I")
    public static int[] field825 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2 };

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Lmd;")
    public static class229 field819;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 10)
    public static void method338(byte arg0) {
        field819 = null;
        if (arg0 < -117) {
            field822 = null;
            field825 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lcc;Lcc;BLcc;)V", line = 64)
    public static final void method339(class313 arg0, class313 arg1, byte arg2, class313 arg3) {
        if (arg2 != 27) {
            field822 = (class126) null;
        }
        class303.field5045 = arg0;
        class33.field481 = arg3;
        class273.field4591 = arg1;
        field823++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBI)V", line = 78)
    public static final void method340(int arg0, byte arg1, int arg2) {
        field824++;
        class27.field379 = class243.field4121[arg2][arg0].field1584;
        class301.field5003 = class243.field4121[arg2][arg0].field1578;
        class93.field1458 = class243.field4121[arg2][arg0].field1583;
        class235.method1603((float) class27.field379, (float) class301.field5003, (float) class93.field1458);
        int var3 = 123 % ((arg1 + 54) / 56);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 96)
    private static final void method341(String arg0, int arg1) {
        if (arg1 != -3) {
            field822 = (class126) null;
        }
        field818++;
        for (int var2 = arg0.indexOf("%0a"); var2 != -1; var2 = arg0.indexOf("%0a", var2)) {
            arg0 = arg0.substring(0, var2) + "\n" + arg0.substring(var2 + 3);
        }
        System.out.println("Error: " + arg0);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 155)
    public static final void method342(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class195.field3355[var1] = false;
        }
        class23.field323 = 0;
        class252.field4210 = 0;
        field820++;
        class163.field2927 = -1;
        class26.field372 = -1;
        class254.field4261 = 1;
        if (arg0 != -6) {
            field825 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZLce;)V", line = 188)
    public static final void method343(int arg0, boolean arg1, class126 arg2) {
        short[] var3 = new short[16];
        int var4 = 0;
        class126 var5 = arg2.method838((byte) -61);
        field817++;
        for (int var6 = arg0; var6 < class68.field1118; var6++) {
            class137 var7 = class68.method498(arg0 ^ 0x3D, var6);
            if ((!arg1 || var7.field2402) && var7.field2368 == -1 && var7.field2433 == -1 && var7.field2391 == 0 && var7.field2396.method838((byte) -93).method875(var5, -104) != -1) {
                if (var4 >= 250) {
                    class240.field4048 = -1;
                    class73.field1176 = null;
                    return;
                }
                if (var3.length <= var4) {
                    short[] var8 = new short[var3.length * 2];
                    for (int var9 = 0; var9 < var4; var9++) {
                        var8[var9] = var3[var9];
                    }
                    var3 = var8;
                }
                var3[var4++] = (short) var6;
            }
        }
        class73.field1176 = var3;
        class240.field4048 = var4;
        class73.field1175 = 0;
        class126[] var10 = new class126[class240.field4048];
        for (int var11 = 0; var11 < class240.field4048; var11++) {
            var10[var11] = class68.method498(22, var3[var11]).field2396;
        }
        class266.method1797(class73.field1176, var10, true);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)Lih;", line = 256)
    public static final class304 method344(int arg0, byte arg1) {
        field814++;
        class304 var2 = (class304) class189.field3244.method1173(-19839, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class321.field5495.method2173(class111.method732(arg0, 99), class168.method1225(1922, arg0), (byte) -122);
        class304 var4 = new class304();
        var4.field5057 = arg0;
        int var5 = 2 % ((arg1 + 54) / 61);
        if (var3 != null) {
            var4.method2046((byte) 120, new class134(var3));
        }
        var4.method2047(false);
        class189.field3244.method1179(var4, (long) arg0, (byte) -72);
        return var4;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V", line = 293)
    public static final void method345(String arg0, int arg1, Throwable arg2) {
        field821++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class272.method1826(arg2, 32);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            method341(var3, -3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            if (arg1 >= -21) {
                return;
            }
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class152.field2788.field2705 == null) {
                return;
            }
            class60 var8 = class152.field2788.method1107(new URL(class152.field2788.field2705.getCodeBase(), "clienterror.ws?c=" + class73.field1177 + "&u=" + class89.field1395 + "&v1=" + class147.field2706 + "&v2=" + class147.field2711 + "&e=" + var7), -2);
            while (var8.field965 == 0) {
                class313.method2158(1L, true);
            }
            if (var8.field965 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field967;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }
}
