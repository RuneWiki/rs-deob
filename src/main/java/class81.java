import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class81 {

    @OriginalMember(owner = "client!n", name = "w", descriptor = "Z")
    public boolean field2079 = true;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public int field2075;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    public int field2078;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public int field2067;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public int field2059;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public int field2065;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public int field2057;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Lpd;")
    private static class94 field2063 = class28.method249(117, "Loaded config");

    @OriginalMember(owner = "client!n", name = "d", descriptor = "[I")
    public static int[] field2060 = new int[2048];

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Lpd;")
    public static class94 field2072 = class28.method249(34, "l");

    @OriginalMember(owner = "client!n", name = "o", descriptor = "[[B")
    public static byte[][] field2071 = new byte[1000][];

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Z")
    public static boolean field2068 = false;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Lpd;")
    public static class94 field2062 = field2063;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "Lpd;")
    private static class94 field2077 = class28.method249(68, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!n", name = "r", descriptor = "Lpd;")
    public static class94 field2074 = field2077;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "Lpd;")
    public static class94 field2070 = class28.method249(47, "(Z");

    @OriginalMember(owner = "client!n", name = "t", descriptor = "Lkd;")
    public static class64 field2076 = new class64();

    @OriginalMember(owner = "client!n", name = "x", descriptor = "La;")
    public static class4 field2080 = new class4(4096);

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public static int field2081 = -1;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Lla;")
    public static class66 field2061;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V", line = 5)
    public static void method603(byte arg0) {
        field2072 = null;
        if (arg0 > -3) {
            return;
        }
        field2076 = null;
        field2070 = null;
        field2061 = null;
        field2071 = null;
        field2062 = null;
        field2080 = null;
        field2063 = null;
        field2060 = null;
        field2077 = null;
        field2074 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 27)
    public static final void method604(int arg0) {
        if (arg0 < 15) {
            method607(null, null, (byte) -22);
        }
        class52.method409((byte) -121, false);
        class80.field2053 = 0;
        field2058++;
        boolean var1 = true;
        for (int var2 = 0; var2 < client.field482.length; var2++) {
            if (class111.field2781[var2] != -1 && client.field482[var2] == null) {
                client.field482[var2] = class8.field213.method808((byte) -93, class111.field2781[var2], 0);
                if (client.field482[var2] == null) {
                    class80.field2053++;
                    var1 = false;
                }
            }
            if (class123.field3128[var2] != -1 && class134.field3305[var2] == null) {
                class134.field3305[var2] = class8.field213.method811(class69.field1659[var2], -2353, 0, class123.field3128[var2]);
                if (class134.field3305[var2] == null) {
                    var1 = false;
                    class80.field2053++;
                }
            }
        }
        if (!var1) {
            class13.field329 = 1;
            return;
        }
        boolean var3 = true;
        class66.field1628 = 0;
        for (int var4 = 0; var4 < client.field482.length; var4++) {
            byte[] var56 = class134.field3305[var4];
            if (var56 != null) {
                int var57 = (class89.field2297[var4] & 0xFF) * 64 - class45.field1117;
                int var58 = (class89.field2297[var4] >> 8) * 64 - class31.field891;
                if (class7.field142) {
                    var58 = 10;
                    var57 = 10;
                }
                var3 &= class2.method7(22, var57, var58, var56);
            }
        }
        if (!var3) {
            class13.field329 = 2;
            return;
        }
        if (class13.field329 != 0) {
            class135.method1065(true, (byte) 124, class84.field2125, class105.field2621);
        }
        class101.method758((byte) -106);
        class64.field1585.method190();
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class12.field311[var5].method653((byte) 125);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class108.field2679[var6][var54][var55] = 0;
                }
            }
        }
        class17.method129(-69);
        int var7 = client.field482.length;
        class122.method951(-6983);
        class52.method409((byte) -102, true);
        if (!class7.field142) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class89.field2297[var8] & 0xFF) * 64 - class45.field1117;
                int var18 = (class89.field2297[var8] >> 8) * 64 - class31.field891;
                byte[] var19 = client.field482[var8];
                if (var19 != null) {
                    class42.method314(51, var18, var17, class12.field311, var19, class75.field1838 * 8 - 48, (class19.field522 + -6) * 8);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class89.field2297[var9] >> 8) * 64 - class31.field891;
                int var15 = (class89.field2297[var9] & 0xFF) * 64 - class45.field1117;
                byte[] var16 = client.field482[var9];
                if (var16 == null && class75.field1838 < 800) {
                    class27.method239(64, 64, var14, (byte) 48, var15);
                }
            }
            class52.method409((byte) -119, true);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class134.field3305[var10];
                if (var11 != null) {
                    int var12 = (class89.field2297[var10] >> 8) * 64 - class31.field891;
                    int var13 = (class89.field2297[var10] & 0xFF) * 64 - class45.field1117;
                    class2.method8(class64.field1585, var11, 0, var12, var13, class12.field311);
                }
            }
        }
        if (class7.field142) {
            for (int var20 = 0; var20 < 4; var20++) {
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        int var36 = class123.field3115[var20][var34][var35];
                        boolean var37 = false;
                        if (var36 != -1) {
                            int var38 = var36 >> 1 & 0x3;
                            int var39 = var36 >> 14 & 0x3FF;
                            int var40 = var36 >> 3 & 0x7FF;
                            int var41 = (var39 / 8 << 8) + var40 / 8;
                            int var42 = var36 >> 24 & 0x3;
                            for (int var43 = 0; var43 < class89.field2297.length; var43++) {
                                if (class89.field2297[var43] == var41 && client.field482[var43] != null) {
                                    class80.method599(class12.field311, var38, var34 * 8, client.field482[var43], (var39 & 0x7) * 8, (var40 & 0x7) * 8, var20, var35 * 8, 8, var42);
                                    var37 = true;
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            class134.method1058(12404, var35 * 8, var34 * 8, var20);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class123.field3115[0][var21][var32];
                    if (var33 == -1) {
                        class27.method239(8, 8, var21 * 8, (byte) 72, var32 * 8);
                    }
                }
            }
            class52.method409((byte) -96, true);
            for (int var22 = 0; var22 < 4; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class123.field3115[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 1 & 0x3;
                            int var28 = var25 >> 3 & 0x7FF;
                            int var29 = var25 >> 14 & 0x3FF;
                            int var30 = (var29 / 8 << 8) + var28 / 8;
                            for (int var31 = 0; var31 < class89.field2297.length; var31++) {
                                if (class89.field2297[var31] == var30 && class134.field3305[var31] != null) {
                                    class88.method652(var23 * 8, var24 * 8, class134.field3305[var31], class12.field311, var27, (var28 & 0x7) * 8, var22, class64.field1585, (var29 & 0x7) * 8, var26, 1131170534);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class52.method409((byte) -116, true);
        class101.method758((byte) -113);
        class75.method557(1, class64.field1585, class12.field311);
        class52.method409((byte) -119, true);
        int var44 = class50.field1255;
        if (var44 > class64.field1589) {
            var44 = class64.field1589;
        }
        if (class64.field1589 - 1 > var44) {
            int var45 = class64.field1589 - 1;
        }
        if (class115.field2912) {
            class64.field1585.method220(class50.field1255);
        } else {
            class64.field1585.method220(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class90.method673(7928, var53, var46);
            }
        }
        class39.method294(-1);
        class12.field302.method1013(-1);
        if (class9.field259 != null) {
            class107.field2670.method326(172, -112);
            class100.field2523++;
            class107.field2670.method917(1057001181, true);
        }
        if (!class7.field142) {
            int var47 = (class19.field522 - 6) / 8;
            int var48 = (class19.field522 + 6) / 8;
            int var49 = (class75.field1838 - 6) / 8;
            int var50 = (class75.field1838 + 6) / 8;
            for (int var51 = var47 - 1; var51 <= var48 + 1; var51++) {
                for (int var52 = var49 - 1; var52 <= var50 + 1; var52++) {
                    if (var51 < var47 || var48 < var51 || var49 > var52 || var52 > var50) {
                        class8.field213.method827(-782, class4.method20(new class94[] { class29.field842, class51.method403(var51, true), class21.field581, class51.method403(var52, true) }, true));
                        class8.field213.method827(-782, class4.method20(new class94[] { field2072, class51.method403(var51, true), class21.field581, class51.method403(var52, true) }, true));
                    }
                }
            }
        }
        if (class77.field1962 == -1) {
            class1.method6(false, 30);
        } else {
            class1.method6(false, 35);
        }
        class90.method674(-24468);
        class107.field2670.method326(40, -125);
        class126.method1000((byte) 35);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)I", line = 495)
    public static int method605(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V", line = 508)
    public static final void method606(int arg0) {
        field2066++;
        class120.field2987.method225((byte) -103);
        for (int var1 = 0; var1 < 32; var1++) {
            class63.field1554[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class133.field3250[var2] = 0L;
        }
        class90.field2330 = 0;
        if (arg0 >= -80) {
            field2074 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V", line = 560)
    public static final void method607(String arg0, Throwable arg1, byte arg2) {
        field2073++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class121.method911(arg1, (byte) 80);
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
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            class118 var8 = class94.field2435.method71(new URL(class94.field2435.field277.getCodeBase(), "clienterror.ws?c=" + class8.field202 + "&u=" + class94.field2404 + "&v1=" + class11.field282 + "&v2=" + class11.field274 + "&e=" + var7), 1048576);
            while (var8.field2944 == 0) {
                class127.method1004(1L, 117);
            }
            if (var8.field2944 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field2946;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
        int var10 = -24 % ((arg2 + 30) / 38);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(IIIIIIZ)V", line = 647)
    public class81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2075 = arg2;
        this.field2078 = arg3;
        this.field2067 = arg4;
        this.field2059 = arg0;
        this.field2079 = arg6;
        this.field2065 = arg1;
        this.field2057 = arg5;
    }
}
