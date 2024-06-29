import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class274 {

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Lok;")
    public static class41 field5140 = class137.method956("<img=1>", 45);

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Lok;")
    public static class41 field5149 = class137.method956("Spieler kann nicht gefunden werden: ", 45);

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Z")
    public static boolean field5150;

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 17)
    private final void method2114(int arg0) {
        field5141++;
        if (class174.field2831.field1943 > class116.field1680) {
            class302.field5024 = (class174.field2831.field1943 * 50 - 50) * 5;
            if (class234.field3737 == class2.field32) {
                class2.field32 = class63.field928;
            } else {
                class2.field32 = class234.field3737;
            }
            if (class302.field5024 > 3000) {
                class302.field5024 = 3000;
            }
            if (class174.field2831.field1943 >= 2 && class174.field2831.field1942 == 6) {
                this.method1938("js5connect_outofdate", (byte) 90);
                class94.field1377 = 1000;
                return;
            }
            if (class174.field2831.field1943 >= 4 && class174.field2831.field1942 == -1) {
                this.method1938("js5crc", (byte) 82);
                class94.field1377 = 1000;
                return;
            }
            if (class174.field2831.field1943 >= 4 && (class94.field1377 == 0 || class94.field1377 == 5)) {
                if (class174.field2831.field1942 == 7 || class174.field2831.field1942 == 9) {
                    this.method1938("js5connect_full", (byte) 85);
                } else if (class174.field2831.field1942 > 0) {
                    this.method1938("js5connect", (byte) 61);
                } else {
                    this.method1938("js5io", (byte) 68);
                }
                class94.field1377 = 1000;
                return;
            }
        }
        class116.field1680 = class174.field2831.field1943;
        if (class302.field5024 > 0) {
            class302.field5024--;
            return;
        }
        try {
            if (class294.field4749 == 0) {
                class120.field1763 = class138.field2065.method1483(arg0 - 26902, class177.field2872, class2.field32);
                class294.field4749++;
            }
            if (arg0 != 12423) {
                this.method1941((byte) -128);
            }
            if (class294.field4749 == 1) {
                if (class120.field1763.field2948 == 2) {
                    this.method2120(1000, arg0 ^ 0x30E6);
                    return;
                }
                if (class120.field1763.field2948 == 1) {
                    class294.field4749++;
                }
            }
            if (class294.field4749 == 2) {
                class186.field3038 = new class218((Socket) class120.field1763.field2945, class138.field2065);
                class112 var2 = new class112(5);
                var2.method797(15, -22096);
                var2.method787(853918096, 520);
                class186.field3038.method1572(arg0 ^ 0x3093, 5, 0, var2.field1607);
                class294.field4749++;
                class45.field709 = class247.method1762(19166);
            }
            if (class294.field4749 == 3) {
                if (class94.field1377 == 0 || class94.field1377 == 5 || class186.field3038.method1571(arg0 - 12512) > 0) {
                    int var3 = class186.field3038.method1567(-15806);
                    if (var3 != 0) {
                        this.method2120(var3, arg0 - 12319);
                        return;
                    }
                    class294.field4749++;
                } else if (class247.method1762(arg0 + 6743) - class45.field709 > 30000L) {
                    this.method2120(1001, arg0 - 12317);
                    return;
                }
            }
            if (class294.field4749 == 4) {
                boolean var4 = class94.field1377 == 5 || class94.field1377 == 10 || class94.field1377 == 28;
                class174.field2831.method913(class186.field3038, 121, !var4);
                class186.field3038 = null;
                class120.field1763 = null;
                class294.field4749 = 0;
            }
        } catch (IOException var6) {
            this.method2120(1002, arg0 - 12307);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lbc;)Lbc;", line = 163)
    public static final class302 method2115(class302 arg0) {
        int var1 = class230.method1648(method2119(arg0), (byte) -110);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class165.method1157(false, arg0.field4999);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([I[IIII)V", line = 202)
    public static final void method2116(int[] arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if (arg3 > arg2) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var6;
            int var7 = arg2;
            int var8 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var8;
            for (int var9 = arg2; var9 < arg3; var9++) {
                if (arg1[var9] > (var9 & 0x1) + var6) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var7];
                    arg1[var7] = var10;
                    int var11 = arg0[var9];
                    arg0[var9] = arg0[var7];
                    arg0[var7++] = var11;
                }
            }
            arg1[arg3] = arg1[var7];
            arg1[var7] = var6;
            arg0[arg3] = arg0[var7];
            arg0[var7] = var8;
            method2116(arg0, arg1, arg2, var7 - 1, -82);
            method2116(arg0, arg1, var7 + 1, arg3, -73);
        }
        if (arg4 < -51) {
            field5139++;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 268)
    public final void method1941(byte arg0) {
        if (class166.field2625) {
            class166.method1180();
        }
        field5135++;
        if (class55.field803 != null) {
            class147.method1018(class55.field803, class138.field2065, 1);
            class55.field803 = null;
        }
        if (class138.field2065 != null) {
            class138.field2065.method1480(0, this.getClass());
        }
        if (class148.field2301 != null) {
            class148.field2301.field3994 = false;
        }
        class148.field2301 = null;
        if (class118.field1724 != null) {
            class118.field1724.method1570((byte) -104);
            class118.field1724 = null;
        }
        class298.method2061((byte) 118, class283.field4602);
        class68.method497((byte) -112, class283.field4602);
        if (class180.field2920 != null) {
            class180.field2920.method263(class283.field4602, -30331);
        }
        class52.method360(-15842);
        class145.method1002(-22841);
        class180.field2920 = null;
        if (class20.field313 != null) {
            class20.field313.method242(0);
        }
        if (class77.field1145 != null) {
            class77.field1145.method242(0);
        }
        class174.field2831.method903((byte) -95);
        int var2 = -91 % ((arg0 - 57) / 44);
        class95.field1409.method450(false);
        try {
            if (class161.field2548 != null) {
                class161.field2548.method674(255);
            }
            if (class45.field713 != null) {
                for (int var3 = 0; var3 < class45.field713.length; var3++) {
                    if (class45.field713[var3] != null) {
                        class45.field713[var3].method674(255);
                    }
                }
            }
            if (class285.field4626 != null) {
                class285.field4626.method674(255);
            }
            if (class10.field135 != null) {
                class10.field135.method674(255);
            }
        } catch (IOException var5) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 353)
    public final void method1949(boolean arg0) {
        field5146++;
        if (class94.field1377 == 1000) {
            return;
        }
        boolean var2 = class206.method1459(true);
        if (var2 && class265.field4193 && class20.field313 != null) {
            class20.field313.method236(false);
        }
        if ((class94.field1377 == 30 || class94.field1377 == 10) && (class85.field1224 || class26.field381 != 0L && class26.field381 < class247.method1762(19166))) {
            class105.method725(class167.field2655, false, class33.method228((byte) 126), class85.field1224, class226.field3616);
        }
        if (class55.field803 == null) {
            Container var3;
            if (class55.field803 != null) {
                var3 = class55.field803;
            } else if (class238.field3817 == null) {
                var3 = class138.field2065.field3390;
            } else {
                var3 = class238.field3817;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class238.field3817 == var3) {
                Insets var6 = class238.field3817.getInsets();
                var4 -= var6.left + var6.right;
                var5 -= var6.top + var6.bottom;
            }
            if (class3.field39 != var4 || class98.field1434 != var5) {
                if (class211.field3400.startsWith("mac")) {
                    class98.field1434 = var5;
                    class3.field39 = var4;
                } else {
                    class44.method325(0);
                }
                class26.field381 = class247.method1762(19166) + 500L;
            }
        }
        boolean var7 = arg0;
        if (class55.field803 != null && !class301.field4880 && (class94.field1377 == 30 || class94.field1377 == 10)) {
            class105.method725(-1, false, class314.field5298, false, -1);
        }
        if (class101.field1437) {
            var7 = true;
            class101.field1437 = false;
        }
        if (var7) {
            class266.method1884(17153);
        }
        if (class166.field2625) {
            for (int var8 = 0; var8 < 100; var8++) {
                class195.field3151[var8] = true;
            }
        }
        if (class94.field1377 == 0) {
            class140.method982(class98.field1436, 121, var7, (Color) null, class92.field1346);
        } else if (class94.field1377 == 5) {
            class308.method2142(false, (byte) 112, class140.field2165);
        } else if (class94.field1377 == 10) {
            class250.method1773(-111);
        } else if (class94.field1377 == 25 || class94.field1377 == 28) {
            if (class125.field1864 == 1) {
                if (class93.field1374 > class294.field4755) {
                    class294.field4755 = class93.field1374;
                }
                int var9 = (class294.field4755 - class93.field1374) * 50 / class294.field4755;
                class305.method2105(false, class187.method1346(new class41[] { class217.field3477, class295.field4777, class1.method4(var9, (byte) 88), class159.field2491 }, 0), -19861);
            } else if (class125.field1864 == 2) {
                if (class283.field4601 > class222.field3551) {
                    class222.field3551 = class283.field4601;
                }
                int var10 = (class222.field3551 - class283.field4601) * 50 / class222.field3551 + 50;
                class305.method2105(false, class187.method1346(new class41[] { class217.field3477, class295.field4777, class1.method4(var10, (byte) 43), class159.field2491 }, 0), -19861);
            } else {
                class305.method2105(false, class217.field3477, -19861);
            }
        } else if (class94.field1377 == 30) {
            class153.method1094(-221);
        } else if (class94.field1377 == 40) {
            class305.method2105(false, class187.method1346(new class41[] { class202.field3247, class274.field4466, class265.field4192 }, 0), -19861);
        }
        if (class166.field2625 && class94.field1377 != 0) {
            class166.method1181();
            for (int var17 = 0; var17 < class75.field1120; var17++) {
                class165.field2615[var17] = false;
            }
        } else if ((class94.field1377 == 30 || class94.field1377 == 10) && class256.field4107 == 0 && !var7) {
            try {
                Graphics var11 = class283.field4602.getGraphics();
                for (int var12 = 0; var12 < class75.field1120; var12++) {
                    if (class165.field2615[var12]) {
                        class217.field3485.method179(false, var11, class237.field3804[var12], class201.field3212[var12], class62.field904[var12], class92.field1353[var12]);
                        class165.field2615[var12] = false;
                    }
                }
            } catch (Exception var19) {
                class283.field4602.repaint();
            }
        } else if (class94.field1377 != 0) {
            try {
                Graphics var14 = class283.field4602.getGraphics();
                class217.field3485.method178(0, 0, var14, (byte) -117);
                for (int var15 = 0; var15 < class75.field1120; var15++) {
                    class165.field2615[var15] = false;
                }
            } catch (Exception var18) {
                class283.field4602.repaint();
            }
        }
        if (class228.field3630) {
            class187.method1347(false);
        }
        if (class241.field3848 && class94.field1377 == 10 && class136.field2015 != -1) {
            class241.field3848 = false;
            class246.method1760((byte) 32, class138.field2065);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lbc;)Z", line = 571)
    public static final boolean method2117(class302 arg0) {
        if (class150.field2331) {
            if (method2119(arg0) != 0) {
                return false;
            }
            if (arg0.field4951 == 0) {
                return false;
            }
        }
        return arg0.field4984;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 601)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class109.method732("argument count", 108);
            }
            int var1 = -1;
            class37.field578 = Integer.parseInt(arg0[0]);
            class51.field774 = 2;
            if (arg0[1].equals("live")) {
                class271.field4383 = 0;
            } else if (arg0[1].equals("rc")) {
                class271.field4383 = 1;
            } else if (arg0[1].equals("wip")) {
                class271.field4383 = 2;
            } else {
                class109.method732("modewhat", 117);
            }
            class298.field4824 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class95.method681(class213.method1507(var2.length, 0, false, var2), -2957);
            } catch (Exception var6) {
            }
            if (var1 != -1) {
                class246.field3954 = var1;
            } else if (arg0[2].equals("english")) {
                class246.field3954 = 0;
            } else if (arg0[2].equals("german")) {
                class246.field3954 = 1;
            } else {
                class109.method732("language", 108);
            }
            class120.method859(class246.field3954, 26149);
            class89.field1306 = false;
            class111.field1579 = false;
            if (arg0[3].equals("game0")) {
                class110.field1564 = 0;
            } else if (arg0[3].equals("game1")) {
                class110.field1564 = 1;
            } else {
                class109.method732("game", 121);
            }
            class255.field4096 = 0;
            class92.field1332 = class266.field4233;
            class126.field1881 = false;
            client var4 = new client();
            class177.field2878 = var4;
            var4.method1945(520, 768, "runescape", 0, 1024, class271.field4383 + 32, 27);
            class238.field3817.setLocation(40, 40);
        } catch (Exception var7) {
            class104.method719((String) null, var7, false);
        }
        field5147++;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 672)
    public static void method2118(int arg0) {
        field5149 = null;
        if (arg0 > -55) {
            field5140 = (class41) null;
        }
        field5140 = null;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 683)
    public final void method1950(int arg0) {
        class44.method325(arg0 - 20972);
        class95.field1409 = new class64();
        class174.field2831 = new class129();
        field5137++;
        if (class271.field4383 != 0) {
        }
        if (arg0 != 20972) {
            field5140 = (class41) null;
        }
        class187.method1350(class138.field2065, (byte) -44);
        if (class51.field774 == 0) {
            class290.field4714 = this.getCodeBase().getHost();
            class175.field2844 = 443;
            class139.field2135 = 43594;
        } else if (class51.field774 == 1) {
            class290.field4714 = this.getCodeBase().getHost();
            class175.field2844 = class37.field578 + 50000;
            class139.field2135 = class37.field578 + 40000;
        } else if (class51.field774 == 2) {
            class175.field2844 = class37.field578 + 50000;
            class290.field4714 = "127.0.0.1";
            class139.field2135 = class37.field578 + 40000;
        }
        class24.field365 = class290.field4713 = class189.field3069 = class284.field4614 = new short[256];
        class177.field2872 = class290.field4714;
        class234.field3737 = class139.field2135;
        if (class211.field3397 == 3 && class51.field774 != 2) {
            class218.field3495 = class37.field578;
        }
        if (class110.field1564 == 1) {
            class223.field3563 = class70.field1061;
            class58.field835 = 0;
            class58.field831 = 16777215;
            class204.field3303 = class244.field3893;
            class127.field1889 = class250.field3984;
            class199.field3203 = class113.field1659;
        } else {
            class127.field1889 = class194.field3127;
            class223.field3563 = class298.field4838;
            class204.field3303 = class44.field691;
            class199.field3203 = class43.field681;
        }
        class147.field2286 = class139.field2135;
        class2.field32 = class147.field2286;
        class63.field928 = class175.field2844;
        class46.method339(false);
        class144.method998(13156, class283.field4602);
        class192.method1377(class283.field4602, false);
        class180.field2920 = class153.method1085(-197);
        if (class180.field2920 != null) {
            class180.field2920.method265(class283.field4602, 41);
        }
        class91.field1316 = class211.field3397;
        try {
            if (class138.field2065.field3401 != null) {
                class161.field2548 = new class94(class138.field2065.field3401, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class45.field713[var2] = new class94(class138.field2065.field3398[var2], 6000, 0);
                }
                class285.field4626 = new class94(class138.field2065.field3396, 6000, 0);
                class276.field4534 = new class134(255, class161.field2548, class285.field4626, 500000);
                class10.field135 = new class94(class138.field2065.field3388, 24, 0);
                class138.field2065.field3396 = null;
                class138.field2065.field3398 = null;
                class138.field2065.field3388 = null;
                class138.field2065.field3401 = null;
            }
        } catch (IOException var4) {
            class10.field135 = null;
            class276.field4534 = null;
            class161.field2548 = null;
            class285.field4626 = null;
        }
        if (class51.field774 != 0) {
            class46.field728 = true;
        }
        class195.field3150 = class226.field3613;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 809)
    public final void method1947(int arg0) {
        field5145++;
        if (class94.field1377 == 1000) {
            return;
        }
        class18.field234++;
        if ((class18.field234 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class117.field1704 = var2.get(11) * 600 - (-(var2.get(12) * 10) - (var2.get(13) / 6));
            class88.field1293.setSeed((long) class117.field1704);
        }
        this.method2125(-95);
        if (class110.field1562 != null) {
            class110.field1562.method1213((byte) 100);
        }
        int var3 = 55 % ((54 - arg0) / 42);
        class88.method630(-104);
        class234.method1685(-20783);
        class78.method562((byte) 76);
        class153.method1088(0);
        if (class166.field2625) {
            class103.method714();
        }
        if (class180.field2920 != null) {
            int var4 = class180.field2920.method264(9);
            class160.field2514 = var4;
        }
        if (class94.field1377 == 0) {
            this.method2124(40);
            class32.method216(65);
        } else if (class94.field1377 == 5) {
            this.method2124(40);
            class32.method216(109);
        } else if (class94.field1377 == 25 || class94.field1377 == 28) {
            class252.method1782(-21538);
        }
        if (class94.field1377 == 10) {
            this.method2122(100);
            class121.method865(31803);
            class283.method1994(17);
            class213.method1508((byte) 111);
        } else if (class94.field1377 == 30) {
            class159.method1123((byte) -51);
        } else if (class94.field1377 == 40) {
            class213.method1508((byte) -126);
            if (class134.field2001 != -3) {
                if (class134.field2001 == 15) {
                    class317.method2187(1);
                } else if (class134.field2001 != 2) {
                    class238.method1705(116);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lbc;)I", line = 910)
    public static final int method2119(class302 arg0) {
        class55 var1 = (class55) class292.field4723.method617(((long) arg0.field4910 << 32) + (long) arg0.field4996, false);
        return var1 == null ? arg0.field5058 : var1.field804;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 923)
    private final void method2120(int arg0, int arg1) {
        class174.field2831.field1942 = arg0;
        class174.field2831.field1943++;
        class186.field3038 = null;
        class294.field4749 = 0;
        field5142++;
        int var3 = -19 / ((arg1 - 34) / 54);
        class120.field1763 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIZ)V", line = 937)
    public static final void method2121(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class272.field4434 = arg1;
        class65.field996 = arg2;
        class122.field1816 = arg3;
        class97.field1425 = new class308[arg0][class272.field4434][class65.field996];
        class214.field3443 = new int[arg0][class272.field4434 + 1][class65.field996 + 1];
        if (class166.field2625) {
            class236.field3791 = new class6[4][];
        }
        if (arg4) {
            class207.field3356 = new class308[1][class272.field4434][class65.field996];
            class208.field3365 = new int[class272.field4434][class65.field996];
            class184.field3008 = new int[1][class272.field4434 + 1][class65.field996 + 1];
            if (class166.field2625) {
                class256.field4114 = new class6[1][];
            }
        } else {
            class207.field3356 = (class308[][][]) null;
            class208.field3365 = (int[][]) null;
            class184.field3008 = (int[][][]) null;
            class256.field4114 = (class6[][]) null;
        }
        class201.method1427(false);
        class62.field920 = new class234[500];
        class236.field3793 = 0;
        class150.field2337 = new class234[500];
        class284.field4610 = 0;
        class153.field2441 = new int[arg0][class272.field4434 + 1][class65.field996 + 1];
        class241.field3857 = new class232[5000];
        class234.field3732 = 0;
        class310.field5226 = new class232[100];
        class113.field1668 = new boolean[class122.field1816 + class122.field1816 + 1][class122.field1816 + class122.field1816 + 1];
        class141.field2173 = new boolean[class122.field1816 + class122.field1816 + 2][class122.field1816 + class122.field1816 + 2];
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 1023)
    private final void method2122(int arg0) {
        field5136++;
        for (class298.field4828 = 0; class221.method1584(127) && class298.field4828 < 128; class298.field4828++) {
            class132.field1970[class298.field4828] = class18.field239;
            class44.field695[class298.field4828] = class136.field2017;
        }
        class140.field2163++;
        if (class136.field2015 != -1) {
            class180.method1293(class14.field182, class188.field3055, 0, (byte) 10, class136.field2015, 0, 0, 0);
        }
        class33.field493++;
        if (class166.field2625) {
            int var2 = 19137023;
            label195: for (int var3 = 0; var3 < 32768; var3++) {
                class50 var4 = class216.field3471[var3];
                if (var4 != null) {
                    byte var5 = var4.field758.field2231;
                    if ((var5 & 0x2) > 0 && var4.field4322 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field4341[0] = (var4.field4280 >> 7) + var6;
                            var4.field4306[0] = (var4.field4311 >> 7) + var7;
                            class222.field3548[class55.field807].method1613(false, 0, var4.method1753((byte) -15), false, var4.method1753((byte) -15), var4.field4311 >> 7, var4.field4280 >> 7);
                            if (var4.field4341[0] >= 0 && var4.field4341[0] <= 104 - var4.method1753((byte) -15) && var4.field4306[0] >= 0 && var4.field4306[0] <= 104 - var4.method1753((byte) -15) && class222.field3548[class55.field807].method1603(var4.field4306[0], var4.field4280 >> 7, var4.field4341[0], var4.field4311 >> 7, false)) {
                                if (var4.method1753((byte) -15) > 1) {
                                    for (int var8 = var4.field4341[0]; var4.field4341[0] + var4.method1753((byte) -15) > var8; var8++) {
                                        for (int var9 = var4.field4306[0]; (var4.field4306[0] + var4.method1753((byte) -15)) > var9; var9++) {
                                            if ((var2 & class222.field3548[class55.field807].field3570[var8][var9]) != 0) {
                                                continue label195;
                                            }
                                        }
                                    }
                                }
                                var4.field4322 = 1;
                            }
                        }
                    }
                    class188.method1352(var4, 30728);
                    class111.method751(var4, -82);
                    class299.method2065(var4, arg0 + 14775);
                    class222.field3548[class55.field807].method1599(false, var4.field4311 >> 7, (byte) 74, var4.field4280 >> 7, var4.method1753((byte) -15), var4.method1753((byte) -15));
                }
            }
        }
        if (arg0 != 100) {
            return;
        }
        if (!class166.field2625) {
            class111.method752(arg0 - 182);
        } else if (class259.field4132 == 0 && class32.field479 == 0) {
            if (class28.field416 == 2) {
                class301.method2074(arg0 ^ 0x864);
            } else {
                class63.method439(true);
            }
            if (class235.field3779 >> 7 < 14 || class235.field3779 >> 7 >= 90 || class251.field3990 >> 7 < 14 || class251.field3990 >> 7 >= 90) {
                class198.method1410((byte) 23);
            }
        }
        while (true) {
            class73 var10;
            class302 var11;
            class302 var12;
            do {
                var10 = (class73) class70.field1054.method1497((byte) 123);
                if (var10 == null) {
                    while (true) {
                        class73 var13;
                        class302 var17;
                        class302 var18;
                        do {
                            var13 = (class73) class185.field3014.method1497((byte) 110);
                            if (var13 == null) {
                                while (true) {
                                    class73 var14;
                                    class302 var15;
                                    class302 var16;
                                    do {
                                        var14 = (class73) class110.field1569.method1497((byte) 122);
                                        if (var14 == null) {
                                            if (class317.field5361 != null) {
                                                class259.method1828((byte) 113);
                                            }
                                            if (class308.field5183 != null && class308.field5183.field2948 == 1) {
                                                if (class308.field5183.field2945 != null) {
                                                    class144.method997(class265.field4201, class77.field1146, (byte) 77);
                                                }
                                                class265.field4201 = false;
                                                class77.field1146 = null;
                                                class308.field5183 = null;
                                            }
                                            if ((class18.field234 % 1500) == 0) {
                                                class107.method730(115);
                                            }
                                            return;
                                        }
                                        var15 = var14.field1079;
                                        if (var15.field4996 < 0) {
                                            break;
                                        }
                                        var16 = class165.method1157(false, var15.field4999);
                                    } while (var16 == null || var16.field4988 == null || var15.field4996 >= var16.field4988.length || var16.field4988[var15.field4996] != var15);
                                    class161.method1141(var14, true);
                                }
                            }
                            var17 = var13.field1079;
                            if (var17.field4996 < 0) {
                                break;
                            }
                            var18 = class165.method1157(false, var17.field4999);
                        } while (var18 == null || var18.field4988 == null || var18.field4988.length <= var17.field4996 || var18.field4988[var17.field4996] != var17);
                        class161.method1141(var13, true);
                    }
                }
                var11 = var10.field1079;
                if (var11.field4996 < 0) {
                    break;
                }
                var12 = class165.method1157(false, var11.field4999);
            } while (var12 == null || var12.field4988 == null || var11.field4996 >= var12.field4988.length || var12.field4988[var11.field4996] != var11);
            class161.method1141(var10, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1252)
    public final void init() {
        field5143++;
        if (!this.method1948(true)) {
            return;
        }
        class37.field578 = Integer.parseInt(this.getParameter("worldid"));
        class51.field774 = Integer.parseInt(this.getParameter("modewhere"));
        if (class51.field774 < 0 || class51.field774 > 1) {
            class51.field774 = 0;
        }
        class271.field4383 = Integer.parseInt(this.getParameter("modewhat"));
        if (class271.field4383 < 0 || class271.field4383 > 2) {
            class271.field4383 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class298.field4824 = true;
        } else {
            class298.field4824 = false;
        }
        try {
            class246.field3954 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class246.field3954 = 0;
        }
        class120.method859(class246.field3954, 26149);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class89.field1306 = true;
        } else {
            class89.field1306 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class111.field1579 = true;
        } else {
            class111.field1579 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class110.field1564 = 1;
        } else {
            class110.field1564 = 0;
        }
        try {
            class255.field4096 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class255.field4096 = 0;
        }
        class92.field1332 = class195.field3155.method273(this, -14711);
        if (class92.field1332 == null) {
            class92.field1332 = class266.field4233;
        }
        String var7 = this.getParameter("haveie6");
        if (var7 != null && var7.equals("1")) {
            class126.field1881 = true;
        } else {
            class126.field1881 = false;
        }
        class177.field2878 = this;
        this.method1937(class271.field4383 + 32, 765, 520, 503, -79);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lbc;IIIIIII)V", line = 1332)
    public static final void method2123(class302[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class302 var9 = arg0[var8];
            if (var9 != null && var9.field4999 == arg1 && (!var9.field4964 || var9.field4951 == 0 || var9.field4920 || method2119(var9) != 0 || class86.field1264 == var9 || var9.field4924 == 1338) && (!var9.field4964 || !method2117(var9))) {
                int var10 = var9.field4944 + arg6;
                int var11 = var9.field4953 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field4951 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field4936 + var10;
                    int var17 = var9.field4949 + var11;
                    if (var9.field4951 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class317.field5361 == var9) {
                    class20.field309 = true;
                    class191.field3094 = var10;
                    class95.field1408 = var11;
                }
                if (!var9.field4964 || var12 < var14 && var13 < var15) {
                    if (var9.field4951 == 0) {
                        if (!var9.field4964 && method2117(var9) && class260.field4147 != var9) {
                            continue;
                        }
                        if (var9.field5018 && class129.field1929 >= var12 && class53.field789 >= var13 && class129.field1929 < var14 && class53.field789 < var15) {
                            for (class73 var18 = (class73) class110.field1569.method1495(-312); var18 != null; var18 = (class73) class110.field1569.method1501(-118)) {
                                if (var18.field1074) {
                                    var18.method418(6971);
                                }
                            }
                            if (class171.field2757 == 0) {
                                class317.field5361 = null;
                                class86.field1264 = null;
                            }
                            class43.field683 = false;
                            class125.field1857 = null;
                        }
                    }
                    if (var9.field4964) {
                        boolean var19;
                        if (class129.field1929 >= var12 && class53.field789 >= var13 && class129.field1929 < var14 && class53.field789 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class269.field4349 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class95.field1416 == 1 && class151.field2358 >= var12 && class245.field3941 >= var13 && class151.field2358 < var14 && class245.field3941 < var15) {
                            var21 = true;
                        }
                        if (class298.field4828 > 0 && var9.field5033 != null) {
                            for (int var22 = 0; var22 < var9.field5033.length; var22++) {
                                for (int var23 = 0; var23 < class298.field4828; var23++) {
                                    int var24 = var9.field5033[var22] & 0xFF;
                                    if (class132.field1970[var23] == var24) {
                                        if (var9.field5034 != null) {
                                            byte var25 = var9.field5034[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class85.field1225[86] || (var25 & 0x1) != 0 && !class85.field1225[82] || (var25 & 0x4) != 0 && !class85.field1225[81])) {
                                                continue;
                                            }
                                        }
                                        class275.method1953(90, var22 + 1, var9.field4910, -1, class266.field4233);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class307.method2132(-75, class151.field2358 - var10, var9, class245.field3941 - var11);
                        }
                        if (class317.field5361 != null && class317.field5361 != var9 && var19 && class249.method1765(method2119(var9), true)) {
                            class235.field3772 = var9;
                        }
                        if (class86.field1264 == var9) {
                            class180.field2921 = true;
                            class205.field3304 = var10;
                            class296.field4789 = var11;
                        }
                        if (var9.field4920 || var9.field4924 != 0) {
                            if (var19 && class160.field2514 != 0 && var9.field5042 != null) {
                                class73 var26 = new class73();
                                var26.field1074 = true;
                                var26.field1079 = var9;
                                var26.field1071 = class160.field2514;
                                var26.field1083 = var9.field5042;
                                class110.field1569.method1503(var26, (byte) -95);
                            }
                            if (class317.field5361 != null || class284.field4622 != null || class251.field3993 || var9.field4924 != 1400 && class43.field683) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field4924 != 0) {
                                if (var9.field4924 == 1337) {
                                    class186.field3039 = var9;
                                    class18.method91(28515, var9);
                                    continue;
                                }
                                if (var9.field4924 == 1338) {
                                    if (var21) {
                                        class125.field1857 = var9;
                                        class234.field3727 = class151.field2358 - var10;
                                        class35.field533 = class245.field3941 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field4924 == 1400) {
                                    class67.field1009 = var9;
                                    if (var21) {
                                        if (class85.field1225[82] && class62.field919 > 0) {
                                            int var27 = (int) ((double) (class151.field2358 - var10 - var9.field4936 / 2) * 2.0D / (double) class178.field2886);
                                            int var28 = (int) ((double) (class245.field3941 - var11 - var9.field4949 / 2) * 2.0D / (double) class178.field2886);
                                            int var29 = class45.field707 + var27;
                                            int var30 = class110.field1565 + var28;
                                            int var31 = class120.field1773 + var29;
                                            int var32 = class212.field3414 + class177.field2876 - var30 - 1;
                                            class111.method750(0, var32, var31, 0);
                                            class216.method1562(206);
                                            continue;
                                        }
                                        class43.field683 = true;
                                        class124.field1842 = class129.field1929;
                                        class1.field9 = class53.field789;
                                        class20.field315 = class45.field707;
                                        class186.field3042 = class110.field1565;
                                        continue;
                                    }
                                    if (var20 && class43.field683) {
                                        class137.method957(15398, (int) ((double) (class124.field1842 - class129.field1929) * 2.0D / (double) class129.field1915) + class20.field315);
                                        class176.method1260(-26, (int) ((double) (class1.field9 - class53.field789) * 2.0D / (double) class129.field1915) + class186.field3042);
                                        continue;
                                    }
                                    class43.field683 = false;
                                    continue;
                                }
                                if (var9.field4924 == 1401) {
                                    if (var20) {
                                        class73.method541(class129.field1929 - var10, var9.field4949, class53.field789 - var11, true, var9.field4936);
                                    }
                                    continue;
                                }
                                if (var9.field4924 == 1402) {
                                    if (!class166.field2625) {
                                        class18.method91(28515, var9);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field4980 && var21) {
                                var9.field4980 = true;
                                if (var9.field4947 != null) {
                                    class73 var33 = new class73();
                                    var33.field1074 = true;
                                    var33.field1079 = var9;
                                    var33.field1088 = class151.field2358 - var10;
                                    var33.field1071 = class245.field3941 - var11;
                                    var33.field1083 = var9.field4947;
                                    class110.field1569.method1503(var33, (byte) -119);
                                }
                            }
                            if (var9.field4980 && var20 && var9.field4985 != null) {
                                class73 var34 = new class73();
                                var34.field1074 = true;
                                var34.field1079 = var9;
                                var34.field1088 = class129.field1929 - var10;
                                var34.field1071 = class53.field789 - var11;
                                var34.field1083 = var9.field4985;
                                class110.field1569.method1503(var34, (byte) -105);
                            }
                            if (var9.field4980 && !var20) {
                                var9.field4980 = false;
                                if (var9.field4979 != null) {
                                    class73 var35 = new class73();
                                    var35.field1074 = true;
                                    var35.field1079 = var9;
                                    var35.field1088 = class129.field1929 - var10;
                                    var35.field1071 = class53.field789 - var11;
                                    var35.field1083 = var9.field4979;
                                    class185.field3014.method1503(var35, (byte) -73);
                                }
                            }
                            if (var20 && var9.field4938 != null) {
                                class73 var36 = new class73();
                                var36.field1074 = true;
                                var36.field1079 = var9;
                                var36.field1088 = class129.field1929 - var10;
                                var36.field1071 = class53.field789 - var11;
                                var36.field1083 = var9.field4938;
                                class110.field1569.method1503(var36, (byte) -66);
                            }
                            if (!var9.field4923 && var19) {
                                var9.field4923 = true;
                                if (var9.field4991 != null) {
                                    class73 var37 = new class73();
                                    var37.field1074 = true;
                                    var37.field1079 = var9;
                                    var37.field1088 = class129.field1929 - var10;
                                    var37.field1071 = class53.field789 - var11;
                                    var37.field1083 = var9.field4991;
                                    class110.field1569.method1503(var37, (byte) -86);
                                }
                            }
                            if (var9.field4923 && var19 && var9.field4916 != null) {
                                class73 var38 = new class73();
                                var38.field1074 = true;
                                var38.field1079 = var9;
                                var38.field1088 = class129.field1929 - var10;
                                var38.field1071 = class53.field789 - var11;
                                var38.field1083 = var9.field4916;
                                class110.field1569.method1503(var38, (byte) -97);
                            }
                            if (var9.field4923 && !var19) {
                                var9.field4923 = false;
                                if (var9.field4981 != null) {
                                    class73 var39 = new class73();
                                    var39.field1074 = true;
                                    var39.field1079 = var9;
                                    var39.field1088 = class129.field1929 - var10;
                                    var39.field1071 = class53.field789 - var11;
                                    var39.field1083 = var9.field4981;
                                    class185.field3014.method1503(var39, (byte) -96);
                                }
                            }
                            if (var9.field4974 != null) {
                                class73 var40 = new class73();
                                var40.field1079 = var9;
                                var40.field1083 = var9.field4974;
                                class70.field1054.method1503(var40, (byte) -73);
                            }
                            if (var9.field5010 != null && class226.field3626 > var9.field5039) {
                                if (var9.field5028 == null || class226.field3626 - var9.field5039 > 32) {
                                    class73 var45 = new class73();
                                    var45.field1079 = var9;
                                    var45.field1083 = var9.field5010;
                                    class110.field1569.method1503(var45, (byte) -72);
                                } else {
                                    label548: for (int var41 = var9.field5039; var41 < class226.field3626; var41++) {
                                        int var42 = class159.field2494[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field5028.length; var43++) {
                                            if (var9.field5028[var43] == var42) {
                                                class73 var44 = new class73();
                                                var44.field1079 = var9;
                                                var44.field1083 = var9.field5010;
                                                class110.field1569.method1503(var44, (byte) -89);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field5039 = class226.field3626;
                            }
                            if (var9.field5047 != null && class241.field3849 > var9.field4930) {
                                if (var9.field4940 == null || class241.field3849 - var9.field4930 > 32) {
                                    class73 var50 = new class73();
                                    var50.field1079 = var9;
                                    var50.field1083 = var9.field5047;
                                    class110.field1569.method1503(var50, (byte) -105);
                                } else {
                                    label524: for (int var46 = var9.field4930; var46 < class241.field3849; var46++) {
                                        int var47 = class169.field2692[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field4940.length; var48++) {
                                            if (var9.field4940[var48] == var47) {
                                                class73 var49 = new class73();
                                                var49.field1079 = var9;
                                                var49.field1083 = var9.field5047;
                                                class110.field1569.method1503(var49, (byte) -110);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field4930 = class241.field3849;
                            }
                            if (var9.field5026 != null && class237.field3802 > var9.field5060) {
                                if (var9.field4927 == null || class237.field3802 - var9.field5060 > 32) {
                                    class73 var55 = new class73();
                                    var55.field1079 = var9;
                                    var55.field1083 = var9.field5026;
                                    class110.field1569.method1503(var55, (byte) -126);
                                } else {
                                    label500: for (int var51 = var9.field5060; var51 < class237.field3802; var51++) {
                                        int var52 = class251.field3992[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field4927.length; var53++) {
                                            if (var9.field4927[var53] == var52) {
                                                class73 var54 = new class73();
                                                var54.field1079 = var9;
                                                var54.field1083 = var9.field5026;
                                                class110.field1569.method1503(var54, (byte) -75);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field5060 = class237.field3802;
                            }
                            if (var9.field4989 != null && class129.field1909 > var9.field4957) {
                                if (var9.field4933 == null || class129.field1909 - var9.field4957 > 32) {
                                    class73 var60 = new class73();
                                    var60.field1079 = var9;
                                    var60.field1083 = var9.field4989;
                                    class110.field1569.method1503(var60, (byte) -119);
                                } else {
                                    label476: for (int var56 = var9.field4957; var56 < class129.field1909; var56++) {
                                        int var57 = class171.field2769[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field4933.length; var58++) {
                                            if (var9.field4933[var58] == var57) {
                                                class73 var59 = new class73();
                                                var59.field1079 = var9;
                                                var59.field1083 = var9.field4989;
                                                class110.field1569.method1503(var59, (byte) -125);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field4957 = class129.field1909;
                            }
                            if (var9.field4956 != null && class128.field1904 > var9.field4894) {
                                if (var9.field4897 == null || class128.field1904 - var9.field4894 > 32) {
                                    class73 var65 = new class73();
                                    var65.field1079 = var9;
                                    var65.field1083 = var9.field4956;
                                    class110.field1569.method1503(var65, (byte) -111);
                                } else {
                                    label452: for (int var61 = var9.field4894; var61 < class128.field1904; var61++) {
                                        int var62 = class162.field2575[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field4897.length; var63++) {
                                            if (var9.field4897[var63] == var62) {
                                                class73 var64 = new class73();
                                                var64.field1079 = var9;
                                                var64.field1083 = var9.field4956;
                                                class110.field1569.method1503(var64, (byte) -95);
                                                break label452;
                                            }
                                        }
                                    }
                                }
                                var9.field4894 = class128.field1904;
                            }
                            if (class52.field781 > var9.field4902 && var9.field4978 != null) {
                                class73 var66 = new class73();
                                var66.field1079 = var9;
                                var66.field1083 = var9.field4978;
                                class110.field1569.method1503(var66, (byte) -122);
                            }
                            if (class275.field4508 > var9.field4902 && var9.field5022 != null) {
                                class73 var67 = new class73();
                                var67.field1079 = var9;
                                var67.field1083 = var9.field5022;
                                class110.field1569.method1503(var67, (byte) -91);
                            }
                            if (class225.field3607 > var9.field4902 && var9.field5019 != null) {
                                class73 var68 = new class73();
                                var68.field1079 = var9;
                                var68.field1083 = var9.field5019;
                                class110.field1569.method1503(var68, (byte) -114);
                            }
                            if (class24.field369 > var9.field4902 && var9.field4917 != null) {
                                class73 var69 = new class73();
                                var69.field1079 = var9;
                                var69.field1083 = var9.field4917;
                                class110.field1569.method1503(var69, (byte) -87);
                            }
                            if (class284.field4613 > var9.field4902 && var9.field4925 != null) {
                                class73 var70 = new class73();
                                var70.field1079 = var9;
                                var70.field1083 = var9.field4925;
                                class110.field1569.method1503(var70, (byte) -91);
                            }
                            var9.field4902 = class33.field493;
                            if (var9.field4955 != null) {
                                for (int var71 = 0; var71 < class298.field4828; var71++) {
                                    class73 var72 = new class73();
                                    var72.field1079 = var9;
                                    var72.field1080 = class132.field1970[var71];
                                    var72.field1084 = class44.field695[var71];
                                    var72.field1083 = var9.field4955;
                                    class110.field1569.method1503(var72, (byte) -73);
                                }
                            }
                            if (class67.field1014 && var9.field4971 != null) {
                                class73 var73 = new class73();
                                var73.field1079 = var9;
                                var73.field1083 = var9.field4971;
                                class110.field1569.method1503(var73, (byte) -115);
                            }
                        }
                    }
                    if (!var9.field4964 && class317.field5361 == null && class284.field4622 == null && !class251.field3993) {
                        if ((var9.field4986 >= 0 || var9.field4934 != 0) && class129.field1929 >= var12 && class53.field789 >= var13 && class129.field1929 < var14 && class53.field789 < var15) {
                            if (var9.field4986 >= 0) {
                                class260.field4147 = arg0[var9.field4986];
                            } else {
                                class260.field4147 = var9;
                            }
                        }
                        if (var9.field4951 == 8 && class129.field1929 >= var12 && class53.field789 >= var13 && class129.field1929 < var14 && class53.field789 < var15) {
                            class262.field4163 = var9;
                        }
                        if (var9.field4952 > var9.field4949) {
                            class315.method2176(class53.field789, class129.field1929, var9, var9.field4936 + var10, 6149, var11, var9.field4952, var9.field4949);
                        }
                    }
                    if (var9.field4951 == 0) {
                        method2123(arg0, var9.field4910, var12, var13, var14, var15, var10 - var9.field4912, var11 - var9.field4918);
                        if (var9.field4988 != null) {
                            method2123(var9.field4988, var9.field4910, var12, var13, var14, var15, var10 - var9.field4912, var11 - var9.field4918);
                        }
                        class187 var74 = (class187) class113.field1658.method617((long) var9.field4910, false);
                        if (var74 != null) {
                            class180.method1293(var15, var14, var10, (byte) 10, var74.field3052, var12, var13, var11);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 2082)
    public final void method1940(int arg0) {
        method2118(arg0 ^ 0xFFFF85BC);
        field5138++;
        class41.method316(65);
        class292.method2023(29582);
        class161.method1137(255);
        class294.method2034(false);
        class274.method1944(0);
        class166.method1170();
        class67.method493(true);
        class251.method1779((byte) 6);
        class162.method1145((byte) -89);
        class112.method796(112);
        class218.method1569((byte) 125);
        class129.method902(117);
        class64.method451(arg0 - 31283);
        class169.method1211((byte) 40);
        class92.method658(false);
        class65.method468((byte) -6);
        class94.method676(arg0 ^ 0xFFFFDC84);
        class134.method946((byte) -115);
        class20.method130(-127);
        class50.method352((byte) -103);
        class118.method842(false);
        class223.method1600(true);
        class302.method2089(0);
        class83.method586(0);
        class245.method1748((byte) -36);
        class212.method1500(4);
        class86.method611(1);
        class111.method754(arg0 - 31155);
        class283.method1993(true);
        class282.method1986((byte) 101);
        class199.method1411(63);
        class152.method1074(false);
        class36.method251((byte) 57);
        class164.method1147(-92);
        class69.method508(10205);
        class205.method1455(arg0 ^ 0x153EFC0);
        class268.method1907((byte) -122);
        class308.method2143(35);
        class125.method879((byte) -126);
        class147.method1016((byte) -83);
        class187.method1349(0);
        class59.method420((byte) -109);
        class298.method2060(-15739);
        class30.method187((byte) 114);
        class95.method682(-106);
        class256.method1817(125);
        class10.method38(0);
        class173.method1241((byte) 109);
        class77.method558(-1);
        class177.method1263(-19234);
        class255.method1814(false);
        class275.method1954((byte) 70);
        class119.method851(16193);
        class171.method1218(121);
        class105.method727(-9190);
        class214.method1515(-2241);
        class58.method408();
        class18.method92((byte) -126);
        class233.method1670();
        class175.method1256((byte) -127);
        class183.method1312();
        class138.method974((byte) 87);
        class19.method123();
        class189.method1354(-21388);
        class252.method1781(arg0 ^ 0x7A3A);
        class192.method1379(arg0 - 31397);
        class133.method930(127);
        class103.method711();
        class124.method877(-77);
        class225.method1618((byte) -80);
        class139.method977((byte) 18);
        class314.method2173(0);
        class253.method1795();
        class203.method1440(1);
        class84.method602();
        class180.method1285(true);
        class207.method1463(arg0 ^ 0xFFFF85B0);
        class246.method1759((byte) 29);
        class154.method1098();
        class179.method1278();
        class297.method2048(-116);
        class184.method1338(arg0 - 31286);
        class2.method7(arg0 ^ 0x7A09);
        class224.method1616((byte) -96);
        class313.method2168(-114);
        class54.method376();
        class281.method1980((byte) -18);
        class150.method1039((byte) -77);
        class37.method257(arg0 ^ 0x7A31);
        class3.method10(0);
        class75.method549(-51);
        class206.method1458(85);
        class266.method1888(arg0 + 16680400);
        class307.method2128((byte) 11);
        class239.method1710((byte) 72);
        class128.method894(-121);
        class98.method700((byte) -53);
        class57.method398((byte) 125);
        class222.method1588(true);
        class85.method608((byte) -102);
        class238.method1704(200);
        class130.method914((byte) 59);
        class88.method626(arg0 - 36538);
        class174.method1248(arg0 ^ 0x7A30);
        class242.method1734(-120);
        class262.method1845(0);
        class305.method2096(123);
        class60.method423(arg0 - 31227);
        class81.method580(true);
        class31.method203();
        class44.method323(-19963);
        class91.method643(false);
        class63.method440(-2);
        class79.method569(0);
        class156.method1112(-21558);
        class71.method520();
        class269.method1909(76);
        class264.method1870((byte) 118);
        class146.method1008(112);
        class73.method542(-128);
        class126.method883(150);
        class284.method1995(arg0 - 31235);
        class6.method23();
        class232.method1651(80);
        class234.method1688((byte) 116);
        class241.method1729((byte) 22);
        class198.method1409(-1);
        class107.method729(true);
        class285.method2001((byte) 66);
        class289.method2016(-120);
        class170.method1217();
        class148.method1028(-1038590712);
        class240.method1722(-124);
        class93.method664(1);
        class4.method12();
        class235.method1691(0);
        class263.method1854();
        class172.method1235();
        class68.method499(4);
        class237.method1700(true);
        class248.method1764((byte) -20);
        class46.method332(arg0 - 31186);
        class306.method2110(true);
        class149.method1034(128);
        class78.method561(true);
        class137.method955(1);
        class228.method1630(0);
        class254.method1809();
        class196.method1400(0);
        class190.method1360();
        class70.method512(arg0 - 31396);
        class185.method1341(false);
        class160.method1127((byte) -35);
        class311.method2158(-32768);
        class216.method1559((byte) -52);
        class55.method391(0);
        class204.method1446(0);
        class272.method1926(-1518588095);
        class153.method1086(120);
        class141.method986((byte) -91);
        class167.method1197(-16480);
        class89.method639((byte) 122);
        class250.method1775(26836);
        class15.method68(true);
        class131.method921(19529);
        class288.method2013(arg0 ^ 0x1B04);
        class27.method174((byte) 44);
        class97.method698((byte) 76);
        class310.method2147(2);
        class230.method1646(108);
        class43.method319(true);
        class229.method1638();
        class271.method1919(-29322);
        class221.method1585(-92);
        class181.method1297(false);
        class249.method1769(0);
        class140.method979(115);
        class145.method1001((byte) 61);
        class47.method340();
        class168.method1204();
        class39.method262();
        class244.method1742(arg0 ^ 0xFFFF8593);
        class143.method995(18595);
        class260.method1830(5);
        class9.method33(true);
        class267.method1896();
        class12.method53();
        class201.method1428((byte) -64);
        class132.method928(243);
        class120.method855((byte) -84);
        class109.method735(4095);
        class123.method872(-32723);
        class121.method861(-2);
        class277.method1959(arg0 ^ 0xFFFF858C);
        class312.method2159((byte) -55);
        class193.method1388((byte) -91);
        class273.method1931(arg0 - 10650);
        class48.method343(3664);
        class195.method1399(118);
        class33.method230(arg0 ^ 0x7A5A);
        class38.method259((byte) 124);
        class127.method891(false);
        class303.method2090();
        class270.method1910();
        class22.method157((byte) -94);
        class32.method220(89);
        class265.method1877((byte) -3);
        class13.method54((byte) 117);
        class208.method1468(false);
        class316.method2183((byte) -7);
        class236.method1695(118);
        class213.method1506(10);
        class186.method1344((byte) 127);
        class136.method953((byte) 73);
        class101.method703(arg0 - 31176);
        class116.method828(arg0 ^ 0xFF7A30);
        class76.method556(true);
        class113.method821(arg0 ^ 0xFFFF859E);
        class217.method1566((byte) 60);
        class210.method1472(true);
        class191.method1372((byte) -102);
        class122.method867(true);
        class110.method749(true);
        class304.method2093(false);
        class62.method436((byte) 49);
        class52.method358(0);
        class290.method2018(1);
        class158.method1119(arg0 ^ 0x7A4C);
        class144.method999(arg0 ^ 0x7A31);
        class74.method544(-1);
        class5.method18((byte) -53);
        class26.method170(false);
        class301.method2073(true);
        class315.method2177(false);
        class300.method2072(-126);
        class276.method1955(false);
        class202.method1432(-128);
        class14.method65(-108);
        class194.method1391(-99);
        class45.method330((byte) 72);
        class278.method1962(-2916);
        class80.method573((byte) 115);
        class23.method162((byte) 25);
        class8.method32(arg0 ^ arg0);
        class24.method163(0);
        class1.method2(true);
        class165.method1153(25424);
        class53.method364(-12128);
        class142.method992(false);
        class159.method1125((byte) -75);
        class295.method2039(-80);
        class35.method234(arg0 ^ 0x7A34);
        class66.method486(64);
        class176.method1259(arg0 - 31281);
        class296.method2043((byte) 89);
        class226.method1627(arg0 - 31157);
        class28.method184(-32283);
        class317.method2184(arg0 ^ 0xFFFF85A6);
        class259.method1829((byte) 96);
        class51.method356(0);
        class16.method76(4);
        class151.method1041((byte) -61);
        class104.method718(arg0 ^ 0xB57);
        class286.method2006((byte) -123);
        if (class274.field4502) {
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 2355)
    private final void method2124(int arg0) {
        if (!class241.field3848) {
            label233: while (true) {
                do {
                    if (!class221.method1584(127)) {
                        break label233;
                    }
                } while (class136.field2017 != 115 && class136.field2017 != 83);
                class241.field3848 = true;
            }
        }
        field5148++;
        if (class196.field3159 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class247.method1762(19166);
            if (class94.field1382 == 0L) {
                class94.field1382 = var4;
            }
            if (var3 > 16384 && (var4 - class94.field1382) < 5000L) {
                if (var4 - class22.field337 > 1000L) {
                    System.gc();
                    class22.field337 = var4;
                }
                class98.field1436 = 5;
                class92.field1346 = class195.field3145;
            } else {
                class98.field1436 = 5;
                class92.field1346 = class139.field2137;
                class196.field3159 = 10;
            }
        } else if (class196.field3159 == 10) {
            class179.method1282(4, 104, 104);
            for (int var28 = 0; var28 < 4; var28++) {
                class222.field3548[var28] = new class223(104, 104);
            }
            class92.field1346 = class128.field1902;
            class98.field1436 = 10;
            class196.field3159 = 30;
        } else if (class196.field3159 == 30) {
            if (class110.field1562 == null) {
                class110.field1562 = new class169(class174.field2831, class95.field1409);
            }
            if (class110.field1562.method1210(arg0 ^ 0x20)) {
                class60.field884 = class234.method1687(1000000, true, true, false, 0);
                class63.field929 = class234.method1687(1000000, true, true, false, 1);
                class85.field1245 = class234.method1687(1000000, true, false, true, 2);
                class167.field2657 = class234.method1687(1000000, true, true, false, 3);
                class44.field693 = class234.method1687(1000000, true, true, false, 4);
                class245.field3938 = class234.method1687(1000000, true, true, true, 5);
                class294.field4763 = class234.method1687(1000000, false, true, true, 6);
                class45.field711 = class234.method1687(1000000, true, true, false, 7);
                class212.field3423 = class234.method1687(1000000, true, true, false, 8);
                class18.field232 = class234.method1687(1000000, true, true, false, 9);
                class201.field3220 = class234.method1687(1000000, true, true, false, 10);
                class81.field1201 = class234.method1687(1000000, true, true, false, 11);
                class113.field1670 = class234.method1687(1000000, true, true, false, 12);
                class181.field2937 = class234.method1687(1000000, true, true, false, 13);
                class13.field170 = class234.method1687(1000000, false, true, false, 14);
                class64.field947 = class234.method1687(1000000, true, true, false, 15);
                class16.field213 = class234.method1687(1000000, true, true, false, 16);
                class45.field706 = class234.method1687(1000000, true, true, false, 17);
                class173.field2807 = class234.method1687(1000000, true, true, false, 18);
                class314.field5289 = class234.method1687(1000000, true, true, false, 19);
                class272.field4427 = class234.method1687(1000000, true, true, false, 20);
                class298.field4820 = class234.method1687(1000000, true, true, false, 21);
                class216.field3473 = class234.method1687(1000000, true, true, false, 22);
                class3.field42 = class234.method1687(arg0 ^ 0xF4268, true, true, true, 23);
                class148.field2297 = class234.method1687(1000000, true, true, false, 24);
                class164.field2605 = class234.method1687(arg0 ^ 0xF4268, true, true, false, 25);
                class119.field1757 = class234.method1687(1000000, true, true, true, 26);
                class98.field1436 = 15;
                class196.field3159 = 40;
                class92.field1346 = class201.field3216;
            } else {
                class92.field1346 = class18.field230;
                class98.field1436 = 12;
            }
        } else if (class196.field3159 == arg0) {
            int var26 = 0;
            for (int var27 = 0; var27 < 27; var27++) {
                var26 += class198.field3179[var27].method657((byte) -128) * class151.field2341[var27] / 100;
            }
            if (var26 == 100) {
                class98.field1436 = 20;
                class92.field1346 = class130.field1949;
                class158.method1117(class212.field3423, (byte) -124);
                class207.method1465(class212.field3423, arg0 ^ 0x8);
                class314.method2170((byte) -126, class212.field3423);
                class196.field3159 = 45;
            } else {
                if (var26 != 0) {
                    class92.field1346 = class187.method1346(new class41[] { class194.field3131, class1.method4(var26, (byte) 104), class15.field191 }, 0);
                }
                class98.field1436 = 20;
            }
        } else if (class196.field3159 == 45) {
            class274.method1943(22050, class235.field3760, 2, -58);
            class273.field4462 = new class152();
            class273.field4462.method1076(false, 128, 9);
            class20.field313 = class266.method1883(arg0 + 73, class283.field4602, class138.field2065, 0, 22050);
            class20.field313.method248(false, class273.field4462);
            class305.method2104(0, class44.field693, class64.field947, class273.field4462, class13.field170);
            class77.field1145 = class266.method1883(arg0 ^ 0x5C, class283.field4602, class138.field2065, 1, 2048);
            class225.field3596 = new class200();
            class77.field1145.method248(false, class225.field3596);
            class13.field163 = new class164(22050, class202.field3240);
            class89.field1307 = class294.field4763.method476(class184.field3005, (byte) -18);
            class92.field1346 = class288.field4664;
            class98.field1436 = 30;
            class196.field3159 = 50;
        } else if (class196.field3159 == 50) {
            int var24 = class312.method2163(class212.field3423, 27585, class181.field2937);
            int var25 = class59.method417(6);
            if (var24 < var25) {
                class92.field1346 = class187.method1346(new class41[] { class48.field741, class1.method4(var24 * 100 / var25, (byte) 121), class15.field191 }, 0);
                class98.field1436 = 35;
            } else {
                class196.field3159 = 60;
                class92.field1346 = class113.field1675;
                class98.field1436 = 35;
            }
        } else if (class196.field3159 == 60) {
            int var6 = class169.method1214(class212.field3423, (byte) 84);
            int var7 = class134.method945(arg0 + 44);
            if (var7 <= var6) {
                class92.field1346 = class315.field5322;
                class196.field3159 = 65;
                class98.field1436 = 40;
            } else {
                class92.field1346 = class187.method1346(new class41[] { class122.field1812, class1.method4(var6 * 100 / var7, (byte) 42), class15.field191 }, arg0 - 40);
                class98.field1436 = 40;
            }
        } else if (class196.field3159 == 65) {
            class128.method896(class212.field3423, (byte) -127, class181.field2937);
            class92.field1346 = class37.field572;
            class98.field1436 = 45;
            class282.method1991(-8, 5);
            class196.field3159 = 70;
        } else if (class196.field3159 == 70) {
            class85.field1245.method467((byte) 72);
            byte var8 = 0;
            int var9 = var8 + class85.field1245.method474(-54);
            class16.field213.method467((byte) 127);
            int var10 = var9 + class16.field213.method474(-87);
            class45.field706.method467((byte) 92);
            int var11 = var10 + class45.field706.method474(-61);
            class173.field2807.method467((byte) 33);
            int var12 = var11 + class173.field2807.method474(-75);
            class314.field5289.method467((byte) 117);
            int var13 = var12 + class314.field5289.method474(arg0 - 161);
            class272.field4427.method467((byte) 39);
            int var14 = var13 + class272.field4427.method474(-109);
            class298.field4820.method467((byte) 108);
            int var15 = var14 + class298.field4820.method474(arg0 ^ 0xFFFFFFC6);
            class216.field3473.method467((byte) 23);
            int var16 = var15 + class216.field3473.method474(-32);
            class148.field2297.method467((byte) 36);
            int var17 = var16 + class148.field2297.method474(-91);
            class164.field2605.method467((byte) 115);
            int var18 = var17 + class164.field2605.method474(-124);
            if (var18 >= 1000) {
                class150.method1040(class85.field1245, (byte) -90);
                class299.method2063((byte) 127, class85.field1245);
                class146.method1010(class85.field1245, 255);
                class312.method2164(class85.field1245, class45.field711, 100);
                class284.method1996(10573, class16.field213, true, class45.field711);
                class299.method2066(class173.field2807, (byte) -75, class45.field711);
                class274.method1935(-14718, class88.field1296, class314.field5289, class45.field711, true);
                class158.method1121(class85.field1245, arg0 ^ 0x60000028);
                class239.method1711(class60.field884, (byte) 68, class272.field4427, class63.field929);
                class218.method1573(class45.field711, (byte) -118, class298.field4820);
                class32.method217(-1, class216.field3473);
                class127.method893(11586, class85.field1245);
                class300.method2070((byte) -118, class212.field3423, class181.field2937, class45.field711, class167.field2657);
                class207.method1464((byte) 108, class85.field1245);
                class67.method491((byte) 19, class45.field706);
                class76.method557(class148.field2297, new class242(), 0, class164.field2605);
                class193.method1389(class164.field2605, class148.field2297, -111);
                class92.field1346 = class104.field1477;
                class98.field1436 = 50;
                class24.method165(-6418);
                class196.field3159 = 80;
            } else {
                class92.field1346 = class187.method1346(new class41[] { class101.field1444, class1.method4(var18 / 10, (byte) 30), class15.field191 }, arg0 ^ 0x28);
                class98.field1436 = 50;
            }
        } else if (class196.field3159 == 80) {
            int var19 = class140.method980(class212.field3423, (byte) -72);
            int var20 = class20.method134(-112);
            if (var19 >= var20) {
                class180.method1289((byte) 120, class212.field3423);
                class98.field1436 = 60;
                class92.field1346 = class140.field2162;
                class196.field3159 = 90;
            } else {
                class92.field1346 = class187.method1346(new class41[] { class204.field3298, class1.method4(var19 * 100 / var20, (byte) 43), class15.field191 }, 0);
                class98.field1436 = 60;
            }
        } else if (class196.field3159 == 90) {
            if (class119.field1757.method467((byte) 68)) {
                class305 var23 = new class305(class18.field232, class119.field1757, class212.field3423, 20, !class81.field1200);
                class31.method204(var23);
                if (class262.field4171 == 1) {
                    class31.method207(0.9F);
                }
                if (class262.field4171 == 2) {
                    class31.method207(0.8F);
                }
                if (class262.field4171 == 3) {
                    class31.method207(0.7F);
                }
                if (class262.field4171 == 4) {
                    class31.method207(0.6F);
                }
                class98.field1436 = 70;
                class92.field1346 = class30.field431;
                class196.field3159 = 100;
            } else {
                class92.field1346 = class187.method1346(new class41[] { class256.field4102, class1.method4(class119.field1757.method474(-21), (byte) 45), class15.field191 }, arg0 - 40);
                class98.field1436 = 70;
            }
        } else if (class196.field3159 == 100) {
            if (class214.method1513(class212.field3423, (byte) 125)) {
                class196.field3159 = 110;
            }
        } else if (class196.field3159 == 110) {
            class148.field2301 = new class251();
            class138.field2065.method1479(class148.field2301, 67, 10);
            class196.field3159 = 120;
            class92.field1346 = class70.field1055;
            class98.field1436 = 75;
        } else if (class196.field3159 == 120) {
            if (class201.field3220.method458((byte) -84, class191.field3084, class266.field4233)) {
                class44 var21 = new class44(class201.field3220.method464(class266.field4233, (byte) -90, class191.field3084));
                class284.method1997(var21, -1);
                class98.field1436 = 80;
                class196.field3159 = 130;
                class92.field1346 = class120.field1765;
            } else {
                class92.field1346 = class187.method1346(new class41[] { class20.field312, class314.field5296 }, 0);
                class98.field1436 = 80;
            }
        } else if (class196.field3159 == 130) {
            if (!class167.field2657.method467((byte) 43)) {
                class92.field1346 = class187.method1346(new class41[] { class298.field4831, class1.method4(class167.field2657.method474(-33) * 3 / 4, (byte) 99), class15.field191 }, 0);
                class98.field1436 = 85;
            } else if (!class113.field1670.method467((byte) 101)) {
                class92.field1346 = class187.method1346(new class41[] { class298.field4831, class1.method4(class113.field1670.method474(-63) / 10 + 75, (byte) 24), class15.field191 }, arg0 - 40);
                class98.field1436 = 85;
            } else if (!class181.field2937.method467((byte) 75)) {
                class92.field1346 = class187.method1346(new class41[] { class298.field4831, class1.method4((class181.field2937.method474(-47) / 20) + 85, (byte) 15), class15.field191 }, arg0 ^ 0x28);
                class98.field1436 = 85;
            } else if (class3.field42.method482(class123.field1820, arg0 - 41)) {
                class278.method1964(class60.field890, 3066, class89.field1303, class75.field1121, class3.field42, class35.field530, class104.field1470);
                class196.field3159 = 135;
                class98.field1436 = 95;
                class92.field1346 = class180.field2924;
            } else {
                class92.field1346 = class187.method1346(new class41[] { class298.field4831, class1.method4(class3.field42.method452(0, class123.field1820) / 10 + 90, (byte) 59), class15.field191 }, 0);
                class98.field1436 = 85;
            }
        } else if (class196.field3159 == 135) {
            int var22 = class28.method183(-1);
            if (var22 == -1) {
                class92.field1346 = class216.field3468;
                class98.field1436 = 95;
            } else if (var22 == 7 || var22 == 9) {
                this.method1938("worldlistfull", (byte) -97);
                class282.method1991(-8, 1000);
            } else if (class92.field1343) {
                class196.field3159 = 140;
                class98.field1436 = 96;
                class92.field1346 = class160.field2507;
            } else {
                this.method1938("worldlistio_" + var22, (byte) 85);
                class282.method1991(-8, 1000);
            }
        } else if (class196.field3159 == 140) {
            class191.field3081 = class167.field2657.method476(class213.field3438, (byte) 126);
            class245.field3938.method469(true, false, (byte) -95);
            class294.field4763.method469(true, true, (byte) -95);
            class212.field3423.method469(true, true, (byte) -95);
            class181.field2937.method469(true, true, (byte) -95);
            class201.field3220.method469(true, true, (byte) -95);
            class167.field2657.method469(true, true, (byte) -95);
            class98.field1436 = 97;
            class92.field1346 = class131.field1964;
            class196.field3159 = 150;
            class228.field3630 = true;
        } else if (class196.field3159 == 150) {
            class71.method518();
            if (class241.field3848) {
                class285.field4641 = 0;
                class314.field5298 = 0;
            }
            class241.field3848 = true;
            class246.method1760((byte) 17, class138.field2065);
            class105.method725(-1, false, class314.field5298, false, -1);
            class92.field1346 = class26.field387;
            class98.field1436 = 100;
            class196.field3159 = 160;
        } else if (class196.field3159 == 160) {
            class146.method1007(false, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 2858)
    private final void method2125(int arg0) {
        if (arg0 > -47) {
            field5140 = (class41) null;
        }
        boolean var2 = class174.field2831.method904(-69);
        field5144++;
        if (!var2) {
            this.method2114(12423);
        }
    }
}
