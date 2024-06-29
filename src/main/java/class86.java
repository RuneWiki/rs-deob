import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class86 extends class116 {

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "[B")
    public static byte[] field2149 = new byte[520];

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "Lic;")
    private static class59 field2155 = class59.method433(0, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "[I")
    public static int[] field2154 = new int[32];

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "Lic;")
    public static class59 field2161 = class59.method433(0, "Diese Betatest)2Welt ist nur f-Ur eingeladene");

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "[I")
    public static int[] field2153 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "Lic;")
    public static class59 field2160 = class59.method433(0, "AUS");

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
    public static int field2166 = 0;

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "Lic;")
    public static class59 field2173 = class59.method433(0, "sl_arrows");

    @OriginalMember(owner = "client!mc", name = "Z", descriptor = "[I")
    public static int[] field2177 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!mc", name = "bb", descriptor = "Lic;")
    public static class59 field2179 = field2155;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public int field2147;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public int field2148;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
    public int field2150;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
    public int field2151;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
    public int field2158;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
    public int field2162;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    public int field2164;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
    public int field2170;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "I")
    public int field2171;

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!mc", name = "W", descriptor = "I")
    public int field2174;

    @OriginalMember(owner = "client!mc", name = "X", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!mc", name = "Y", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!mc", name = "ab", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "Lcd;")
    public class19 field2156;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "Lkb;")
    public class71 field2146;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "Lkb;")
    public class71 field2157;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "[I")
    public int[] field2167;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "[S")
    public static short[] field2169;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
    public static final void method704(Throwable arg0, String arg1, int arg2) {
        field2159++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class29.method233(9, arg0);
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
            if (arg2 != 4436) {
                field2161 = null;
            }
            if (class149.field3266.field1679 != null) {
                class13 var8 = class149.field3266.method539(new URL(class149.field3266.field1679.getCodeBase(), "clienterror.ws?c=" + class134.field2975 + "&u=" + class94.field2404 + "&v1=" + class67.field1667 + "&v2=" + class67.field1669 + "&e=" + var7), (byte) 127);
                while (var8.field252 == 0) {
                    class126.method962(false, 1L);
                }
                if (var8.field252 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field254;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lpd;[BII)V")
    public static final void method705(class108 arg0, byte[] arg1, int arg2, int arg3) {
        field2175++;
        class52 var4 = new class52();
        var4.field1295 = arg0;
        var4.field1290 = 0;
        if (arg3 < 87) {
            method704(null, null, -52);
        }
        var4.field1293 = arg1;
        var4.field2736 = arg2;
        class83 var5 = class152.field3301;
        synchronized (class152.field3301) {
            class152.field3301.method689(var4, (byte) -125);
        }
        class139.method1053((byte) 85);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
    public static final void method706(boolean arg0) {
        int var1 = -1;
        if (arg0) {
            return;
        }
        while (var1 < class43.field1092) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class31.field842[var1];
            }
            class49 var3 = class91.field2323[var2];
            if (var3 != null) {
                class21.method118(var3, 1218, 1);
            }
            var1++;
        }
        field2163++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lic;B)V")
    public static final void method707(class59 arg0, byte arg1) {
        field2176++;
        if (class26.field677 == null) {
            return;
        }
        int var2 = 46 % ((arg1 - 48) / 56);
        int var3 = 0;
        long var4 = arg0.method447(12074);
        if (var4 == 0L) {
            return;
        }
        while (var3 < class26.field677.length && class26.field677[var3].field2736 != var4) {
            var3++;
        }
        if (var3 < class26.field677.length && class26.field677[var3] != null) {
            class125.field2842.method1072(219, -1);
            class125.field2842.method1201(class26.field677[var3].field2736, (byte) 38);
            class96.field2435++;
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)V")
    public final void method708(byte arg0) {
        field2172++;
        int var2 = this.field2162;
        if (arg0 != -73) {
            return;
        }
        class19 var3 = this.field2156.method102(-19992);
        if (var3 == null) {
            this.field2147 = 0;
            this.field2164 = 0;
            this.field2162 = -1;
            this.field2167 = null;
            this.field2170 = 0;
        } else {
            this.field2170 = var3.field377 * 128;
            this.field2167 = var3.field407;
            this.field2164 = var3.field401;
            this.field2147 = var3.field376;
            this.field2162 = var3.field397;
        }
        if (this.field2162 != var2 && this.field2146 != null) {
            class120.field2766.method1081(this.field2146);
            this.field2146 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public static final void method709(int arg0) {
        if (arg0 > -85) {
            return;
        }
        for (class41 var1 = (class41) class33.field889.method37(-1); var1 != null; var1 = (class41) class33.field889.method36(-1)) {
            int var2 = var1.field1044;
            if (class114.method923(var2, (byte) -128)) {
                boolean var3 = true;
                class159[] var4 = class46.field1173[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field3596;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2736;
                    class159 var7 = class134.method1032(var6, 499749840);
                    if (var7 != null) {
                        class42.method320(false, var7);
                    }
                }
            }
        }
        field2165++;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)V")
    public static void method710(byte arg0) {
        field2179 = null;
        field2149 = null;
        field2155 = null;
        field2154 = null;
        field2169 = null;
        field2160 = null;
        if (arg0 >= 30) {
            field2173 = null;
            field2161 = null;
            field2177 = null;
            field2153 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(JI)V")
    public static final void method711(long arg0, int arg1) {
        field2178++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class65.field1649; var3++) {
            if (class84.field2114[var3] == arg0) {
                class65.field1649--;
                class137.field3051++;
                for (int var4 = var3; var4 < class65.field1649; var4++) {
                    class102.field2486[var4] = class102.field2486[var4 + 1];
                    class90.field2284[var4] = class90.field2284[var4 + 1];
                    class84.field2114[var4] = class84.field2114[var4 + 1];
                    class23.field537[var4] = class23.field537[var4 + 1];
                }
                class127.field2884 = class94.field2400;
                class125.field2842.method1072(211, arg1 - 2);
                class125.field2842.method1201(arg0, (byte) 38);
                break;
            }
        }
        if (arg1 != 1) {
            method706(false);
        }
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(B)V")
    public static final void method712(byte arg0) {
        field2144++;
        class53.field1317.method16(0);
        for (int var1 = 0; var1 < 32; var1++) {
            class152.field3305[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class130.field2928[var2] = 0L;
        }
        if (arg0 >= -9) {
            field2161 = null;
        }
        class65.field1645 = 0;
    }
}
