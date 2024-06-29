import java.io.DataInputStream;
import java.net.URL;
import java.util.Random;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class302 {

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field5208 = 0;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field5212 = 0;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "Lgn;")
    public static class5 field5211 = new class5(64);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "Lqf;")
    public static class148 field5204;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field5205;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "[[Z")
    public static boolean[][] field5206;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZB)V", line = 6)
    public static final void method2120(boolean arg0, byte arg1) {
        field5201++;
        byte var2;
        byte[][] var3;
        if (class255.field4184 && arg0) {
            var2 = 1;
            var3 = class2.field15;
        } else {
            var3 = class51.field808;
            var2 = 4;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class258.method1815(-16385);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class78.field1190[var4][var5][var6];
                    boolean var8 = false;
                    if (var7 != -1) {
                        int var9 = var7 >> 24 & 0x3;
                        if (!arg0 || var9 == 0) {
                            int var10 = var7 >> 3 & 0x7FF;
                            int var11 = var7 >> 1 & 0x3;
                            int var12 = var7 >> 14 & 0x3FF;
                            int var13 = (var12 / 8 << 8) + var10 / 8;
                            for (int var14 = 0; var14 < class293.field4884.length; var14++) {
                                if (class293.field4884[var14] == var13 && var3[var14] != null) {
                                    class71.method512(var11, var5 * 8, var4, class218.field3479, var6 * 8, (byte) -100, var3[var14], var9, (var10 & 0x7) * 8, (var12 & 0x7) * 8, arg0);
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class137.method917(var4, (byte) 84, var6 * 8, var5 * 8, 8, 8);
                    }
                }
            }
        }
        if (arg1 <= 49) {
            field5210 = 32;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILbe;)Lbe;", line = 110)
    public static final class297 method2121(int arg0, class297 arg1) {
        if (arg0 != 0) {
            method2122(103, 118);
        }
        field5203++;
        class297 var2 = client.method1725(arg1);
        if (var2 == null) {
            var2 = arg1.field5114;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)[B", line = 137)
    public static final byte[] method2122(int arg0, int arg1) {
        class173 var2 = (class173) class39.field633.method28((long) arg1, arg0 - 16710535);
        field5207++;
        if (var2 == null) {
            Random var3 = new Random((long) arg1);
            byte[] var4 = new byte[512];
            for (int var5 = 0; var5 < 255; var5++) {
                var4[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class24.method151((byte) 125, var7, var3);
                byte var9 = var4[var8];
                var4[var8] = var4[var7];
                var4[var7] = var4[511 - var6] = var9;
            }
            var2 = new class173(var4);
            class39.field633.method33(var2, (long) arg1, (byte) 52);
        }
        return arg0 == 16711935 ? var2.field2717 : (byte[]) null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IJIZ)Lna;", line = 187)
    public static final class26 method2123(int[] arg0, long arg1, int arg2, boolean arg3) {
        if (arg3) {
            return (class26) null;
        }
        field5196++;
        if (class258.field4210 != null) {
            class26 var5 = class258.field4210.method1228(arg2, arg0, 4936, arg1);
            if (var5 != null) {
                return var5;
            }
        }
        return class250.method1719(arg1, (byte) 124);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V", line = 209)
    public static final void method2124(String arg0, Throwable arg1, byte arg2) {
        if (arg2 <= 100) {
            field5211 = (class5) null;
        }
        field5200++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class291.method2050(-95, arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class178.method1225(104, var3);
            String var4 = class120.method830(":", "%3a", 126, var3);
            String var5 = class120.method830("@", "%40", -31, var4);
            String var6 = class120.method830("&", "%26", -16, var5);
            String var7 = class120.method830("#", "%23", 6, var6);
            if (class198.field3079.field2431 == null) {
                return;
            }
            class180 var8 = class198.field3079.method1061(false, new URL(class198.field3079.field2431.getCodeBase(), "clienterror.ws?c=" + class76.field1150 + "&u=" + class20.field283 + "&v1=" + class156.field2423 + "&v2=" + class156.field2437 + "&e=" + var7));
            while (var8.field2811 == 0) {
                class126.method862(1L, 64);
            }
            if (var8.field2811 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field2812;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V", line = 265)
    public static final void method2125(int arg0, int arg1) {
        field5198++;
        class120 var2 = class293.method2059(4, 2, arg1);
        int var3 = -67 % ((arg0 + 37) / 48);
        var2.method823(true);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 281)
    public static final void method2126(int arg0) {
        if (!class11.field153) {
            if (class133.field2025 != 0) {
                class187.field2959 = class261.field4265;
                class11.field150 = class89.field1478;
            } else if (class277.field4639 == 0) {
                class187.field2959 = class136.field2090;
                class11.field150 = class259.field4235;
            } else {
                class187.field2959 = class205.field3210;
                class11.field150 = class11.field152;
            }
            class126.field1955 = 1;
            class141.field2154[0] = class154.field2406;
            class252.field4138[0] = class2.field18;
            class142.field2178[0] = 1005;
            class85.field1404[0] = class132.field2013;
        }
        field5199++;
        if (class250.field4095 != -1) {
            class209.method1398(-113, class250.field4095);
        }
        if (arg0 != 0) {
            return;
        }
        for (int var1 = 0; var1 < class66.field1041; var1++) {
            if (class2.field21[var1]) {
                class139.field2123[var1] = true;
            }
            class259.field4239[var1] = class2.field21[var1];
            class2.field21[var1] = false;
        }
        class148.field2321 = null;
        class291.field4842 = -1;
        class96.field1561 = -1;
        class67.field1058 = null;
        if (class255.field4184) {
            class262.field4282 = true;
        }
        class323.field5553 = class229.field3626;
        if (class250.field4095 != -1) {
            class66.field1041 = 0;
            class321.method2234(true);
        }
        if (class255.field4184) {
            class326.method2269();
        } else {
            class34.method294();
        }
        class89.method702(arg0 + 122);
        if (class11.field153) {
            if (class266.field4385) {
                class83.method647((byte) 116);
            } else {
                class124.method849(-117);
            }
        } else if (class148.field2321 != null) {
            class284.method2007(class148.field2321, -120, class122.field1902, class76.field1162);
        } else if (class291.field4842 != -1) {
            class284.method2007((class297) null, -86, class96.field1561, class291.field4842);
        }
        int var2 = class11.field153 ? -1 : class219.method1475(arg0 + 16859);
        if (var2 == -1) {
            var2 = class154.field2401;
        }
        class72.method513(var2, 20827);
        if (class263.field4297 == 1) {
            class263.field4297 = 2;
        }
        if (class78.field1219 == 1) {
            class78.field1219 = 2;
        }
        if (class4.field42 == 3) {
            for (int var3 = 0; var3 < class66.field1041; var3++) {
                if (class259.field4239[var3]) {
                    if (class255.field4184) {
                        class326.method2274(class53.field827[var3], class159.field2475[var3], class27.field457[var3], class241.field3931[var3], 16711935, 128);
                    } else {
                        class34.method275(class53.field827[var3], class159.field2475[var3], class27.field457[var3], class241.field3931[var3], 16711935, 128);
                    }
                } else if (class139.field2123[var3]) {
                    if (class255.field4184) {
                        class326.method2274(class53.field827[var3], class159.field2475[var3], class27.field457[var3], class241.field3931[var3], 16711680, 128);
                    } else {
                        class34.method275(class53.field827[var3], class159.field2475[var3], class27.field457[var3], class241.field3931[var3], 16711680, 128);
                    }
                }
            }
        }
        class32.method256(class25.field366, class13.field221.field3962, class13.field221.field3972, class279.field4651, 1);
        class25.field366 = 0;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([BLwa;Z)V", line = 428)
    public final void method2127(byte[] arg0, class82 arg1, boolean arg2) {
        if (arg2) {
            field5208 = -81;
        }
        field5197++;
        if (arg1.field1280[arg1.field1301] != 31 || arg1.field1280[arg1.field1301 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field5205 == null) {
            this.field5205 = new Inflater(true);
        }
        try {
            this.field5205.setInput(arg1.field1280, arg1.field1301 + 10, -8 - (arg1.field1301 + 10) + arg1.field1280.length);
            this.field5205.inflate(arg0);
        } catch (Exception var5) {
            this.field5205.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field5205.reset();
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V", line = 454)
    public class302() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V", line = 469)
    public static final void method2128(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5202++;
        int var5 = arg3;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        int var9 = class308.method2151(class27.field454, arg2 + arg4, (byte) 0, class225.field3572);
        int var10 = class308.method2151(class27.field454, arg4 - arg2, (byte) 0, class225.field3572);
        class76.method543(class45.field710[arg1], var10, -98, var9, arg0);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                int var11 = arg1 - var6;
                var7 -= var6 << 1;
                int var12 = arg1 + var6;
                if (var12 >= class80.field1259 && var11 <= class117.field1840) {
                    int var13 = class308.method2151(class27.field454, arg4 + var5, (byte) 0, class225.field3572);
                    int var14 = class308.method2151(class27.field454, arg4 - var5, (byte) 0, class225.field3572);
                    if (class117.field1840 >= var12) {
                        class76.method543(class45.field710[var12], var14, arg3 ^ 0x6F, var13, arg0);
                    }
                    if (class80.field1259 <= var11) {
                        class76.method543(class45.field710[var11], var14, -84, var13, arg0);
                    }
                }
            }
            var5++;
            int var15 = arg1 - var5;
            int var16 = arg1 + var5;
            if (var16 >= class80.field1259 && class117.field1840 >= var15) {
                int var17 = class308.method2151(class27.field454, arg4 + var6, (byte) 0, class225.field3572);
                int var18 = class308.method2151(class27.field454, arg4 - var6, (byte) 0, class225.field3572);
                if (var16 <= class117.field1840) {
                    class76.method543(class45.field710[var16], var18, 90, var17, arg0);
                }
                if (var15 >= class80.field1259) {
                    class76.method543(class45.field710[var15], var18, -103, var17, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(III)V", line = 549)
    private class302(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V", line = 566)
    public static void method2129(int arg0) {
        field5204 = null;
        if (arg0 < 54) {
            field5212 = -109;
        }
        field5211 = null;
        field5206 = (boolean[][]) null;
    }
}
