import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class52 extends class314 {

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
    public int field1094 = 0;

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "Lud;")
    private static class279 field1080 = class130.method1024("Discard", 255);

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    public static volatile int field1090 = -1;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "Z")
    public static volatile boolean field1097 = true;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "Lud;")
    public static class279 field1095 = field1080;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public static int field1077 = 0;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "Lud;")
    public static class279 field1092 = class130.method1024("zap", 255);

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "Lud;")
    public static class279 field1088 = class130.method1024("scape main", 255);

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "[I")
    public static int[] field1100 = new int[1000];

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "F")
    public static float field1071;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public int field1076;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "I")
    public int field1084;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "I")
    public int field1086;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
    public int field1089;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "I")
    public int field1098;

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
    public int field1102;

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "Lqb;")
    public class102 field1073;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "Lok;")
    public static class149 field1085;

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "Lqg;")
    public class239 field1101;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "Lcn;")
    public class264 field1069;

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "Lom;")
    public static class70 field1087;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "Lwa;")
    public class82 field1083;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "Lwa;")
    public class82 field1096;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "Z")
    public boolean field1075;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "[I")
    public int[] field1081;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "[[[B")
    public static byte[][][] field1082;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V", line = 8)
    public final void method434(byte arg0) {
        int var2 = this.field1084;
        if (this.field1069 != null) {
            class264 var3 = this.field1069.method1896(127);
            if (var3 == null) {
                this.field1102 = 0;
                this.field1081 = null;
                this.field1086 = 0;
                this.field1072 = 0;
                this.field1084 = -1;
            } else {
                this.field1086 = var3.field4711 * 128;
                this.field1084 = var3.field4755;
                this.field1102 = var3.field4697;
                this.field1072 = var3.field4713;
                this.field1081 = var3.field4702;
            }
        } else if (this.field1073 != null) {
            int var4 = class130.method1027(this.field1073, (byte) -71);
            if (var2 != var4) {
                class125 var5 = this.field1073.field1921;
                this.field1084 = var4;
                if (var5.field2321 != null) {
                    var5 = var5.method999(13102);
                }
                if (var5 == null) {
                    this.field1086 = 0;
                } else {
                    this.field1086 = var5.field2264 * 128;
                }
            }
        } else if (this.field1101 != null) {
            this.field1084 = class253.method1810(false, this.field1101);
            this.field1086 = this.field1101.field4199 * 128;
        }
        if (arg0 != 30) {
            this.field1073 = (class102) null;
        }
        field1099++;
        if (this.field1084 != var2 && this.field1083 != null) {
            class322.field5630.method1957(this.field1083);
            this.field1083 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()V", line = 85)
    public static final void method435() {
        if (class251.field4491 != null) {
            for (int var0 = 0; var0 < class251.field4491.length; var0++) {
                for (int var1 = 0; var1 < class207.field3668; var1++) {
                    for (int var2 = 0; var2 < class54.field1193; var2++) {
                        class251.field4491[var0][var1][var2] = null;
                    }
                }
            }
        }
        class215.field3786 = (class168[][]) null;
        if (class295.field5263 != null) {
            for (int var3 = 0; var3 < class295.field5263.length; var3++) {
                for (int var4 = 0; var4 < class207.field3668; var4++) {
                    for (int var5 = 0; var5 < class54.field1193; var5++) {
                        class295.field5263[var3][var4][var5] = null;
                    }
                }
            }
        }
        class101.field1897 = (class168[][]) null;
        class167.field3013 = 0;
        if (class37.field840 != null) {
            for (int var6 = 0; var6 < class167.field3013; var6++) {
                class37.field840[var6] = null;
            }
        }
        if (class180.field3264 != null) {
            for (int var7 = 0; var7 < class272.field4849; var7++) {
                class180.field3264[var7] = null;
            }
            class272.field4849 = 0;
        }
        if (class51.field1066 != null) {
            for (int var8 = 0; var8 < class51.field1066.length; var8++) {
                class51.field1066[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 195)
    public static final void method436(int arg0) {
        if (class121.field2172 == 2) {
            if (class132.field2412 == class100.field1876 && class200.field3573 == class163.field2941) {
                class121.field2172 = 0;
                if (class243.field4321 && class284.field5075[81] && class194.field3488 > 2) {
                    class253.method1811(arg0 ^ 0xFFFFFF94, class194.field3488 - 2);
                } else {
                    class253.method1811(-105, class194.field3488 - 1);
                }
            }
        } else if (class232.field4074 == class100.field1876 && class64.field1307 == class200.field3573) {
            class121.field2172 = 0;
            if (class243.field4321 && class284.field5075[81] && class194.field3488 > 2) {
                class253.method1811(-114, class194.field3488 - 2);
            } else {
                class253.method1811(-119, class194.field3488 - 1);
            }
        } else {
            class132.field2412 = class232.field4074;
            class163.field2941 = class64.field1307;
            class121.field2172 = 2;
        }
        if (arg0 != 0) {
            field1071 = 0.62062514F;
        }
        field1067++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)V", line = 254)
    public static final void method437(int arg0, int arg1) {
        field1093++;
        class104 var2 = class293.method2085(arg0, arg1, false);
        var2.method875(12466);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lud;I)V", line = 264)
    public static final void method438(class279 arg0, int arg1) {
        field1103++;
        if (class145.field2623 >= 2) {
            if (arg0.method2010(class185.field3398, (byte) 125)) {
                class322.method2269((byte) -1);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class59.method532(class115.method929(new class279[] { class211.field3702, class191.method1447(arg1 + 209, var4), class209.field3691 }, (byte) 60), (class279) null, 0, 29437);
            }
            if (arg0.method2010(class64.field1314, (byte) 115)) {
                class322.method2269((byte) -1);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class59.method532(class115.method929(new class279[] { class28.field677, class191.method1447(5, var7), class209.field3691 }, (byte) 60), (class279) null, 0, 29437);
                class285.method2042(2209);
                class322.method2269((byte) -1);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class59.method532(class115.method929(new class279[] { class273.field4865, class191.method1447(5, var9), class209.field3691 }, (byte) 60), (class279) null, 0, arg1 ^ 0xFFFF8DC9);
            }
            if (arg0.method2010(class207.field3665, (byte) 85)) {
                class59.method532(class115.method929(new class279[] { class195.field3526, class191.method1447(5, class261.method1870(-92)) }, (byte) 60), (class279) null, 0, 29437);
            }
            if (class97.field1824 && arg0.method2010(class33.field736, (byte) 114)) {
                System.out.println("oncard_geometry:" + class308.field5468);
                System.out.println("oncard_2d:" + class308.field5473);
                System.out.println("oncard_texture:" + class308.field5471);
            }
            if (arg0.method2010(class159.field2892, (byte) 98)) {
                class141.method1084(0);
            }
            if (arg0.method2010(class189.field3419, (byte) 83)) {
                class255.field4552.method1386(-18);
            }
            if (arg0.method2010(class20.field567, (byte) 123)) {
                class255.field4552.method1384(arg1 ^ 0xB6);
            }
            if (arg0.method2010(class279.field4963, (byte) 98)) {
                class110.field2022.method2159(16128);
                class202.field3603.method2027(-104);
                class255.field4552.method1370((byte) -56);
            }
            if (arg0.method2010(class210.field3695, (byte) 88)) {
                class43.field897 = true;
            }
            if (arg0.method2010(class117.field2126, (byte) 96)) {
                class172.method1343(25, -29401);
            }
            if (arg0.method2010(class120.field2167, (byte) 86)) {
                class140.field2549 = true;
            }
            if (arg0.method2010(class155.field2800, (byte) 123)) {
                class140.field2549 = false;
            }
            if (arg0.method2010(class141.field2562, (byte) 90)) {
                class103.method867(-1, 115, false, -1, 0);
            }
            if (arg0.method2010(class139.field2522, (byte) 122)) {
                class103.method867(-1, -121, false, -1, 1);
            }
            if (arg0.method2010(class251.field4492, (byte) 120)) {
                class103.method867(-1, 87, false, -1, 2);
            }
            if (arg0.method2010(class275.field4880, (byte) 106)) {
                class103.method867(768, -114, false, 1024, 3);
            }
            if (arg0.method2010(class38.field851, (byte) 86)) {
                for (int var10 = 0; var10 < 4; var10++) {
                    for (int var11 = 1; var11 < 103; var11++) {
                        for (int var12 = 1; var12 < 103; var12++) {
                            class90.field1702[var10].field2215[var11][var12] = 0;
                        }
                    }
                }
            }
            if (arg0.method1999(class144.field2621, 86)) {
                class208.method1530(arg0.method1988((byte) -48, 15).method2011(10));
                class54.method507(class110.field2022, arg1 + 198);
                class113.field2077 = false;
            }
            if (arg0.method1999(class312.field5515, 33) && class124.field2261 != 0) {
                class117.method943(1000, arg0.method1988((byte) -45, 6).method2011(10));
            }
            if (arg0.method2010(class251.field4487, (byte) 121) && class124.field2261 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method1999(class78.field1499, arg1 + 271)) {
                class157.field2885 = arg0.method1988((byte) -92, 12).method2006((byte) 112).method2011(10);
                class59.method532(class115.method929(new class279[] { class261.field4642, class191.method1447(5, class157.field2885) }, (byte) 60), (class279) null, 0, 29437);
            }
            if (arg0.method2010(class73.field1430, (byte) 100)) {
                class205.field3641 = true;
            }
            if (arg0.method2010(class68.field1351, (byte) 93)) {
                if (class293.field5234) {
                    class293.field5234 = false;
                    class59.method532(class171.field3083, (class279) null, 0, arg1 + 29641);
                } else {
                    class293.field5234 = true;
                    class59.method532(class115.field2095, (class279) null, 0, 29437);
                }
            }
            if (arg0.method2010(class286.field5092, (byte) 117)) {
                if (class243.field4321) {
                    class235.field4096.method2012((byte) -106);
                    class243.field4321 = false;
                } else {
                    client.field4474.method2012((byte) -104);
                    class243.field4321 = true;
                }
            }
        }
        class314.field5534.method1634(1, arg1 ^ arg1);
        class29.field679++;
        class314.field5534.method464(arg0.method1984(8) - 1, false);
        class314.field5534.method481(arg0.method1988((byte) -115, 2), (byte) 117);
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(B)V", line = 485)
    public static void method439(byte arg0) {
        field1087 = null;
        field1100 = null;
        field1085 = null;
        field1082 = (byte[][][]) null;
        field1092 = null;
        field1095 = null;
        field1080 = null;
        if (arg0 <= 18) {
            field1092 = (class279) null;
        }
        field1088 = null;
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(B)V", line = 504)
    public static final void method440(byte arg0) {
        class314.field5534.method1634(222, 0);
        field1074++;
        int var1 = -76 % ((7 - arg0) / 56);
        class141.field2567++;
        class314.field5534.method505(class230.field4021, (byte) 7);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BII)V", line = 534)
    public static final void method441(byte arg0, int arg1, int arg2) {
        field1070++;
        if (arg0 < 61) {
            method439((byte) -76);
        }
        class314.field5534.method1634(217, 0);
        class314.field5534.method505(arg1, (byte) 7);
        class314.field5534.method445((byte) 39, arg2);
        class180.field3277++;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)I", line = 550)
    public static int method442(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
