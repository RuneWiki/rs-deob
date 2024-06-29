import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class260 {

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "Z")
    public static boolean field4647 = false;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "Ljd;")
    public static class86 field4652 = class122.method868(")4p=", true);

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public static int field4653 = 0;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "Ljd;")
    public static class86 field4643 = class122.method868(" weitere Optionen", true);

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "Ljd;")
    public static class86 field4651 = class122.method868("headicons_pk", true);

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field4650 = 1;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public static int field4655 = 0;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "Ljd;")
    public static class86 field4662 = class122.method868("Ladevorgang )2 bitte warten Sie)3", true);

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "Ljd;")
    public static class86 field4659 = class122.method868("titlebg", true);

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static volatile int field4657 = 0;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public int field4640;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "Ljd;")
    public class86 field4641;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "[I")
    public static int[] field4658;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)Laa;")
    public static final class164 method1773(byte arg0) {
        if (arg0 != -8) {
            method1774((byte) -36, 1);
        }
        field4649++;
        try {
            return (class164) Class.forName("fb").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)V")
    public static final void method1774(byte arg0, int arg1) {
        field4646++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class137.field2612[arg1];
        int var3 = class273.field4784[arg1];
        int var4 = (int) class68.field1333[arg1];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        int var5 = class241.field4321[arg1];
        long var6 = class68.field1333[arg1];
        if (var3 == 1) {
            class170 var8 = class233.field4217[var4];
            if (var8 != null) {
                class1.field1++;
                class48.method375(1, 0, false, class124.field2412.field707[0], var8.field707[0], 0, 0, 2, var8.field705[0], class124.field2412.field705[0], 1, -24761);
                class162.field3051 = class185.field3288;
                class187.field3316 = class39.field906;
                class198.field3523 = 2;
                class141.field2673 = 0;
                class36.field809.method1356(142, true);
                class36.field809.method1396(var4, -718541592);
            }
        }
        if (var3 == 5) {
            class6 var9 = class229.method1596(var5, var2, (byte) -27);
            if (var9 != null) {
                class138.method985(26797);
                class105.method748(class86.method629(-124, client.method1111(var9)), var5, var2, 1);
                class51.field1078 = 0;
                class93.field1883 = class129.method910(var9, 32515);
                if (class93.field1883 == null) {
                    class93.field1883 = class5.field72;
                }
                if (!var9.field217) {
                    class133.field2519 = class109.method783(2, new class86[] { class82.field1614, var9.field84, class96.field1913 });
                    return;
                }
                class133.field2519 = class109.method783(2, new class86[] { var9.field170, class96.field1913 });
            }
            return;
        }
        if (var3 == 21) {
            class36.field809.method1356(197, true);
            class36.field809.method1396(var4, -718541592);
            class36.field809.method1428((byte) -109, class20.field526);
            class36.field809.method1418(96, var5);
            class155.field2932++;
            class36.field809.method1394(var2, 128);
            class36.field809.method1380(class226.field4095, -2097152);
            class24.field595 = 0;
            client.field2855 = class25.method178(73, var2);
            class35.field800 = var5;
        }
        if (var3 == 11) {
            class224 var10 = class186.field3294[var4];
            if (var10 != null) {
                class48.method375(1, 0, false, class124.field2412.field707[0], var10.field707[0], 0, 0, 2, var10.field705[0], class124.field2412.field705[0], 1, -24761);
                class187.field3316 = class39.field906;
                class141.field2673 = 0;
                class198.field3523 = 2;
                class162.field3051 = class185.field3288;
                class36.field809.method1356(248, true);
                class36.field809.method1396(var4, -718541592);
                class116.field2202++;
            }
        }
        if (var3 == 17) {
            class76.field1513++;
            class36.field809.method1356(242, true);
            class36.field809.method1406(1472534024, var2);
            class36.field809.method1428((byte) 122, var4);
            class36.field809.method1420((byte) 124, var5);
            class24.field595 = 0;
            client.field2855 = class25.method178(107, var2);
            class35.field800 = var5;
        }
        if (var3 == 28 && class36.method272(var5, (byte) -126, var2, var6)) {
            class79.field1550++;
            class36.field809.method1356(119, true);
            class36.field809.method1420((byte) 119, class252.field4481 + var5);
            class36.field809.method1396(var2 + class79.field1554, -718541592);
            class36.field809.method1380(class25.field599, -2097152);
            class36.field809.method1420((byte) 127, client.field2867);
            class36.field809.method1396(Integer.MAX_VALUE & (int) (var6 >>> 32), -718541592);
            class36.field809.method1428((byte) -93, class42.field952);
        }
        if (var3 == 19) {
            class138.method985(26797);
            class6 var11 = class25.method178(105, var2);
            class42.field952 = var4;
            client.field2867 = var5;
            class25.field599 = var2;
            class51.field1078 = 1;
            class62.method441(-29481, var11);
            class157.field2963 = class109.method783(2, new class86[] { class90.field1833, class272.method1853(0, var4).field1421, class96.field1913 });
            if (class157.field2963 == null) {
                class157.field2963 = class4.field55;
            }
            return;
        }
        if (var3 == 24) {
            class23.field574++;
            class36.field809.method1356(169, true);
            class36.field809.method1380(var2, -2097152);
            class36.field809.method1428((byte) -98, client.field2867);
            class36.field809.method1428((byte) 87, var5);
            class36.field809.method1418(108, var4);
            class36.field809.method1382(-30860, class25.field599);
            class36.field809.method1420((byte) 119, class42.field952);
            class24.field595 = 0;
            client.field2855 = class25.method178(62, var2);
            class35.field800 = var5;
        }
        if (var3 == 1006) {
            class36.method272(var5, (byte) -128, var2, var6);
            class36.field809.method1356(59, true);
            class36.field809.method1396(class79.field1554 + var2, -718541592);
            class67.field1318++;
            class36.field809.method1418(90, class252.field4481 + var5);
            class36.field809.method1418(87, (int) (var6 >>> 32) & Integer.MAX_VALUE);
        }
        if (var3 == 1005) {
            class162.field3051 = class185.field3288;
            class112.field2135++;
            class187.field3316 = class39.field906;
            class198.field3523 = 2;
            class141.field2673 = 0;
            class36.field809.method1356(183, true);
            class36.field809.method1420((byte) 123, var4);
        }
        if (var3 == 40) {
            class36.field809.method1356(188, true);
            class36.field809.method1394(var2, 128);
            class124.field2409++;
            class36.field809.method1428((byte) -1, var4);
            class36.field809.method1396(var5, -718541592);
            class24.field595 = 0;
            client.field2855 = class25.method178(118, var2);
            class35.field800 = var5;
        }
        if (var3 == 2 && class36.method272(var5, (byte) -123, var2, var6)) {
            class36.field809.method1356(121, true);
            class130.field2483++;
            class36.field809.method1396(var2 + class79.field1554, -718541592);
            class36.field809.method1382(-30860, class226.field4095);
            class36.field809.method1420((byte) 122, var5 + class252.field4481);
            class36.field809.method1428((byte) 69, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class36.field809.method1418(118, class20.field526);
        }
        if (var3 == 32) {
            class170 var12 = class233.field4217[var4];
            if (var12 != null) {
                class115.field2198++;
                class48.method375(1, 0, false, class124.field2412.field707[0], var12.field707[0], 0, 0, 2, var12.field705[0], class124.field2412.field705[0], 1, -24761);
                class198.field3523 = 2;
                class162.field3051 = class185.field3288;
                class141.field2673 = 0;
                class187.field3316 = class39.field906;
                class36.field809.method1356(230, true);
                class36.field809.method1396(var4, -718541592);
            }
        }
        if (var3 == 12) {
            class97.field1935++;
            boolean var13 = class48.method375(0, 0, false, class124.field2412.field707[0], var5, 0, 0, 2, var2, class124.field2412.field705[0], 0, -24761);
            if (!var13) {
                class48.method375(1, 0, false, class124.field2412.field707[0], var5, 0, 0, 2, var2, class124.field2412.field705[0], 1, -24761);
            }
            class141.field2673 = 0;
            class198.field3523 = 2;
            class187.field3316 = class39.field906;
            class162.field3051 = class185.field3288;
            class36.field809.method1356(254, true);
            class36.field809.method1418(119, class79.field1554 + var2);
            class36.field809.method1420((byte) 117, var5 + class252.field4481);
            class36.field809.method1420((byte) 117, var4);
        }
        int var15 = -106 / ((arg0 + 57) / 58);
        if (var3 == 42) {
            class72.field1462++;
            class36.field809.method1356(101, true);
            class36.field809.method1428((byte) 122, var5);
            class36.field809.method1418(123, var4);
            class36.field809.method1394(var2, 128);
            class24.field595 = 0;
            client.field2855 = class25.method178(76, var2);
            class35.field800 = var5;
        }
        if (var3 == 4) {
            class270.field4753++;
            class36.field809.method1356(153, true);
            class36.field809.method1418(93, var5);
            class36.field809.method1396(var4, -718541592);
            class36.field809.method1382(-30860, var2);
            class24.field595 = 0;
            client.field2855 = class25.method178(116, var2);
            class35.field800 = var5;
        }
        if (var3 == 1001) {
            class178.field3216++;
            class141.field2673 = 0;
            class187.field3316 = class39.field906;
            class198.field3523 = 2;
            class162.field3051 = class185.field3288;
            class36.field809.method1356(7, true);
            class36.field809.method1418(104, var4);
        }
        if (var3 == 7) {
            class36.method272(var5, (byte) -128, var2, var6);
            class81.field1579++;
            class36.field809.method1356(68, true);
            class36.field809.method1428((byte) -119, class252.field4481 + var5);
            class36.field809.method1418(108, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class36.field809.method1396(class79.field1554 + var2, -718541592);
        }
        if (var3 == 20) {
            class170 var16 = class233.field4217[var4];
            if (var16 != null) {
                class48.method375(1, 0, false, class124.field2412.field707[0], var16.field707[0], 0, 0, 2, var16.field705[0], class124.field2412.field705[0], 1, -24761);
                class227.field4121++;
                class141.field2673 = 0;
                class198.field3523 = 2;
                class187.field3316 = class39.field906;
                class162.field3051 = class185.field3288;
                class36.field809.method1356(201, true);
                class36.field809.method1428((byte) -96, class42.field952);
                class36.field809.method1428((byte) -116, var4);
                class36.field809.method1394(class25.field599, 128);
                class36.field809.method1428((byte) -124, client.field2867);
            }
        }
        if (var3 == 44) {
            class170 var17 = class233.field4217[var4];
            if (var17 != null) {
                class48.method375(1, 0, false, class124.field2412.field707[0], var17.field707[0], 0, 0, 2, var17.field705[0], class124.field2412.field705[0], 1, -24761);
                class187.field3316 = class39.field906;
                class198.field3523 = 2;
                class178.field3221++;
                class141.field2673 = 0;
                class162.field3051 = class185.field3288;
                class36.field809.method1356(234, true);
                class36.field809.method1428((byte) 41, var4);
            }
        }
        if (var3 == 38) {
            class36.field809.method1356(94, true);
            class36.field809.method1406(1472534024, var2);
            class96.field1910++;
            class6 var18 = class25.method178(78, var2);
            if (var18.field99 != null && var18.field99[0][0] == 5) {
                int var19 = var18.field99[0][1];
                class273.field4805[var19] = 1 - class273.field4805[var19];
                class67.method477((byte) 127, var19);
            }
        }
        if (var3 == 10) {
            class238.field4282++;
            boolean var20 = class48.method375(0, 0, false, class124.field2412.field707[0], var5, 0, 0, 2, var2, class124.field2412.field705[0], 0, -24761);
            if (!var20) {
                class48.method375(1, 0, false, class124.field2412.field707[0], var5, 0, 0, 2, var2, class124.field2412.field705[0], 1, -24761);
            }
            class187.field3316 = class39.field906;
            class198.field3523 = 2;
            class162.field3051 = class185.field3288;
            class141.field2673 = 0;
            class36.field809.method1356(180, true);
            class36.field809.method1420((byte) 114, class79.field1554 + var2);
            class36.field809.method1418(96, class20.field526);
            class36.field809.method1396(var4, -718541592);
            class36.field809.method1428((byte) -117, class252.field4481 + var5);
            class36.field809.method1394(class226.field4095, 128);
        }
        if (var3 == 9) {
            boolean var22 = class48.method375(0, 0, false, class124.field2412.field707[0], var5, 0, 0, 2, var2, class124.field2412.field705[0], 0, -24761);
            if (!var22) {
                class48.method375(1, 0, false, class124.field2412.field707[0], var5, 0, 0, 2, var2, class124.field2412.field705[0], 1, -24761);
            }
            class187.field3316 = class39.field906;
            class198.field3523 = 2;
            class141.field2673 = 0;
            class213.field3845++;
            class162.field3051 = class185.field3288;
            class36.field809.method1356(106, true);
            class36.field809.method1420((byte) 116, class252.field4481 + var5);
            class36.field809.method1382(-30860, class25.field599);
            class36.field809.method1420((byte) 116, var4);
            class36.field809.method1428((byte) -91, client.field2867);
            class36.field809.method1420((byte) 126, var2 + class79.field1554);
            class36.field809.method1396(class42.field952, -718541592);
        }
        if (var3 == 35 || var3 == 1002) {
            class179.method1256(class188.field3332[arg1], var4, var5, 65, var2);
        }
        if (var3 == 25) {
            class224 var24 = class186.field3294[var4];
            if (var24 != null) {
                class21.field541++;
                class48.method375(1, 0, false, class124.field2412.field707[0], var24.field707[0], 0, 0, 2, var24.field705[0], class124.field2412.field705[0], 1, -24761);
                class187.field3316 = class39.field906;
                class141.field2673 = 0;
                class162.field3051 = class185.field3288;
                class198.field3523 = 2;
                class36.field809.method1356(84, true);
                class36.field809.method1428((byte) -118, var4);
            }
        }
        if (var3 == 1004) {
            class141.field2673 = 0;
            class198.field3523 = 2;
            class162.field3051 = class185.field3288;
            class187.field3316 = class39.field906;
            class170 var25 = class233.field4217[var4];
            if (var25 != null) {
                class11 var26 = var25.field3130;
                if (var26.field348 != null) {
                    var26 = var26.method87(true);
                }
                if (var26 != null) {
                    class194.field3477++;
                    class36.field809.method1356(24, true);
                    class36.field809.method1428((byte) 37, var26.field362);
                }
            }
        }
        if (var3 == 58) {
            boolean var27 = class48.method375(0, 0, false, class124.field2412.field707[0], var5, 0, 0, 2, var2, class124.field2412.field705[0], 0, -24761);
            if (!var27) {
                class48.method375(1, 0, false, class124.field2412.field707[0], var5, 0, 0, 2, var2, class124.field2412.field705[0], 1, -24761);
            }
            class198.field3523 = 2;
            class187.field3316 = class39.field906;
            class162.field3051 = class185.field3288;
            class141.field2673 = 0;
            class36.field809.method1356(79, true);
            class43.field953++;
            class36.field809.method1428((byte) -1, var4);
            class36.field809.method1418(80, class252.field4481 + var5);
            class36.field809.method1428((byte) 77, class79.field1554 + var2);
        }
        if (var3 == 45) {
            class224 var29 = class186.field3294[var4];
            if (var29 != null) {
                class48.method375(1, 0, false, class124.field2412.field707[0], var29.field707[0], 0, 0, 2, var29.field705[0], class124.field2412.field705[0], 1, -24761);
                class187.field3316 = class39.field906;
                class198.field3523 = 2;
                class141.field2673 = 0;
                class41.field934++;
                class162.field3051 = class185.field3288;
                class36.field809.method1356(133, true);
                class36.field809.method1418(81, var4);
            }
        }
        if (var3 == 15) {
            class224 var30 = class186.field3294[var4];
            if (var30 != null) {
                class48.method375(1, 0, false, class124.field2412.field707[0], var30.field707[0], 0, 0, 2, var30.field705[0], class124.field2412.field705[0], 1, -24761);
                class141.field2673 = 0;
                class187.field3316 = class39.field906;
                class162.field3051 = class185.field3288;
                class198.field3523 = 2;
                class36.field809.method1356(32, true);
                class112.field2137++;
                class36.field809.method1428((byte) -102, var4);
            }
        }
        if (var3 == 34) {
            class170 var31 = class233.field4217[var4];
            if (var31 != null) {
                class159.field2988++;
                class48.method375(1, 0, false, class124.field2412.field707[0], var31.field707[0], 0, 0, 2, var31.field705[0], class124.field2412.field705[0], 1, -24761);
                class141.field2673 = 0;
                class187.field3316 = class39.field906;
                class162.field3051 = class185.field3288;
                class198.field3523 = 2;
                class36.field809.method1356(228, true);
                class36.field809.method1420((byte) 114, var4);
            }
        }
        if (var3 == 57) {
            class36.method272(var5, (byte) -127, var2, var6);
            class184.field3268++;
            class36.field809.method1356(75, true);
            class36.field809.method1428((byte) -95, var2 + class79.field1554);
            class36.field809.method1418(102, var5 + class252.field4481);
            class36.field809.method1420((byte) 117, Integer.MAX_VALUE & (int) (var6 >>> 32));
        }
        if (var3 == 29) {
            class6 var32 = class25.method178(125, var2);
            boolean var33 = true;
            if (var32.field100 > 0) {
                var33 = class4.method25((byte) -119, var32);
            }
            if (var33) {
                class36.field809.method1356(94, true);
                class96.field1910++;
                class36.field809.method1406(1472534024, var2);
            }
        }
        if (var3 == 46) {
            class234.field4220++;
            boolean var34 = class48.method375(0, 0, false, class124.field2412.field707[0], var5, 0, 0, 2, var2, class124.field2412.field705[0], 0, -24761);
            if (!var34) {
                class48.method375(1, 0, false, class124.field2412.field707[0], var5, 0, 0, 2, var2, class124.field2412.field705[0], 1, -24761);
            }
            class162.field3051 = class185.field3288;
            class187.field3316 = class39.field906;
            class141.field2673 = 0;
            class198.field3523 = 2;
            class36.field809.method1356(80, true);
            class36.field809.method1396(class252.field4481 + var5, -718541592);
            class36.field809.method1396(var2 + class79.field1554, -718541592);
            class36.field809.method1396(var4, -718541592);
        }
        if (var3 == 18) {
            field4654++;
            class36.field809.method1356(255, true);
            class36.field809.method1406(1472534024, var2);
            class36.field809.method1396(var5, -718541592);
            class36.field809.method1418(85, var4);
            class24.field595 = 0;
            client.field2855 = class25.method178(78, var2);
            class35.field800 = var5;
        }
        if (var3 == 1007) {
            class6 var36 = class25.method178(95, var2);
            if (var36 == null || var36.field201[var5] < 100000) {
                class36.field809.method1356(7, true);
                class36.field809.method1418(94, var4);
                class178.field3216++;
            } else {
                class58.method423(class109.method783(2, new class86[] { class4.method26(false, var36.field201[var5]), class228.field4126, class272.method1853(0, var4).field1421 }), false, 0, class56.field1155);
            }
            class24.field595 = 0;
            client.field2855 = class25.method178(78, var2);
            class35.field800 = var5;
        }
        if (var3 == 31) {
            class34.field790++;
            boolean var37 = class48.method375(0, 0, false, class124.field2412.field707[0], var5, 0, 0, 2, var2, class124.field2412.field705[0], 0, -24761);
            if (!var37) {
                class48.method375(1, 0, false, class124.field2412.field707[0], var5, 0, 0, 2, var2, class124.field2412.field705[0], 1, -24761);
            }
            class141.field2673 = 0;
            class162.field3051 = class185.field3288;
            class198.field3523 = 2;
            class187.field3316 = class39.field906;
            class36.field809.method1356(40, true);
            class36.field809.method1396(class252.field4481 + var5, -718541592);
            class36.field809.method1396(var4, -718541592);
            class36.field809.method1428((byte) -124, class79.field1554 + var2);
        }
        if (var3 == 51) {
            class36.field809.method1356(165, true);
            class36.field809.method1420((byte) 120, var5);
            class36.field809.method1380(var2, -2097152);
            class98.field1939++;
            class36.field809.method1418(113, var4);
            class24.field595 = 0;
            client.field2855 = class25.method178(115, var2);
            class35.field800 = var5;
        }
        if (var3 == 23) {
            class224 var39 = class186.field3294[var4];
            if (var39 != null) {
                class48.method375(1, 0, false, class124.field2412.field707[0], var39.field707[0], 0, 0, 2, var39.field705[0], class124.field2412.field705[0], 1, -24761);
                class162.field3051 = class185.field3288;
                class73.field1479++;
                class198.field3523 = 2;
                class187.field3316 = class39.field906;
                class141.field2673 = 0;
                class36.field809.method1356(56, true);
                class36.field809.method1428((byte) -120, var4);
            }
        }
        if (var3 == 26) {
            class36.field809.method1356(94, true);
            class96.field1910++;
            class36.field809.method1406(1472534024, var2);
            class6 var40 = class25.method178(78, var2);
            if (var40.field99 != null && var40.field99[0][0] == 5) {
                int var41 = var40.field99[0][1];
                if (class273.field4805[var41] != var40.field161[0]) {
                    class273.field4805[var41] = var40.field161[0];
                    class67.method477((byte) 126, var41);
                }
            }
        }
        if (var3 == 50) {
            class224 var42 = class186.field3294[var4];
            if (var42 != null) {
                class27.field619++;
                class48.method375(1, 0, false, class124.field2412.field707[0], var42.field707[0], 0, 0, 2, var42.field705[0], class124.field2412.field705[0], 1, -24761);
                class198.field3523 = 2;
                class187.field3316 = class39.field906;
                class162.field3051 = class185.field3288;
                class141.field2673 = 0;
                class36.field809.method1356(205, true);
                class36.field809.method1394(class226.field4095, 128);
                class36.field809.method1396(var4, -718541592);
                class36.field809.method1420((byte) 114, class20.field526);
            }
        }
        if (var3 == 36) {
            class36.method272(var5, (byte) -123, var2, var6);
            class36.field809.method1356(35, true);
            class201.field3627++;
            class36.field809.method1428((byte) 33, class252.field4481 + var5);
            class36.field809.method1420((byte) 117, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class36.field809.method1428((byte) -97, class79.field1554 + var2);
        }
        if (var3 == 43) {
            class51.method389(true);
        }
        if (var3 == 3) {
            class36.field809.method1356(27, true);
            field4656++;
            class36.field809.method1406(1472534024, var2);
            class36.field809.method1418(100, var5);
            class36.field809.method1420((byte) 114, var4);
            class24.field595 = 0;
            client.field2855 = class25.method178(62, var2);
            class35.field800 = var5;
        }
        if (var3 == 41) {
            class224 var43 = class186.field3294[var4];
            if (var43 != null) {
                class144.field2726++;
                class48.method375(1, 0, false, class124.field2412.field707[0], var43.field707[0], 0, 0, 2, var43.field705[0], class124.field2412.field705[0], 1, -24761);
                class187.field3316 = class39.field906;
                class162.field3051 = class185.field3288;
                class141.field2673 = 0;
                class198.field3523 = 2;
                class36.field809.method1356(109, true);
                class36.field809.method1418(87, var4);
            }
        }
        if (var3 == 30) {
            class36.method272(var5, (byte) -124, var2, var6);
            class36.field809.method1356(10, true);
            class211.field3823++;
            class36.field809.method1420((byte) 115, class252.field4481 + var5);
            class36.field809.method1428((byte) -90, var2 + class79.field1554);
            class36.field809.method1396((int) (var6 >>> 32) & Integer.MAX_VALUE, -718541592);
        }
        if (var3 == 13 && class162.field3045 == null) {
            class118.method842(var5, var2, (byte) -98);
            class162.field3045 = class229.method1596(var5, var2, (byte) -27);
            class62.method441(-29481, class162.field3045);
        }
        if (var3 == 48) {
            class224 var44 = class186.field3294[var4];
            if (var44 != null) {
                class48.method375(1, 0, false, class124.field2412.field707[0], var44.field707[0], 0, 0, 2, var44.field705[0], class124.field2412.field705[0], 1, -24761);
                class141.field2673 = 0;
                class162.field3051 = class185.field3288;
                class198.field3523 = 2;
                class187.field3316 = class39.field906;
                class36.field809.method1356(78, true);
                class189.field3354++;
                class36.field809.method1396(client.field2867, -718541592);
                class36.field809.method1380(class25.field599, -2097152);
                class36.field809.method1418(90, var4);
                class36.field809.method1420((byte) 114, class42.field952);
            }
        }
        if (var3 == 47) {
            class224 var45 = class186.field3294[var4];
            if (var45 != null) {
                class6.field106++;
                class48.method375(1, 0, false, class124.field2412.field707[0], var45.field707[0], 0, 0, 2, var45.field705[0], class124.field2412.field705[0], 1, -24761);
                class162.field3051 = class185.field3288;
                class187.field3316 = class39.field906;
                class198.field3523 = 2;
                class141.field2673 = 0;
                class36.field809.method1356(83, true);
                class36.field809.method1396(var4, -718541592);
            }
        }
        if (var3 == 49) {
            class170 var46 = class233.field4217[var4];
            if (var46 != null) {
                class252.field4487++;
                class48.method375(1, 0, false, class124.field2412.field707[0], var46.field707[0], 0, 0, 2, var46.field705[0], class124.field2412.field705[0], 1, -24761);
                class162.field3051 = class185.field3288;
                class187.field3316 = class39.field906;
                class141.field2673 = 0;
                class198.field3523 = 2;
                class36.field809.method1356(207, true);
                class36.field809.method1396(class20.field526, -718541592);
                class36.field809.method1418(109, var4);
                class36.field809.method1406(1472534024, class226.field4095);
            }
        }
        if (var3 == 8) {
            class170 var47 = class233.field4217[var4];
            if (var47 != null) {
                class275.field4831++;
                class48.method375(1, 0, false, class124.field2412.field707[0], var47.field707[0], 0, 0, 2, var47.field705[0], class124.field2412.field705[0], 1, -24761);
                class198.field3523 = 2;
                class141.field2673 = 0;
                class162.field3051 = class185.field3288;
                class187.field3316 = class39.field906;
                class36.field809.method1356(177, true);
                class36.field809.method1418(83, var4);
            }
        }
        if (var3 == 33) {
            class36.field809.method1356(139, true);
            class36.field809.method1396(class20.field526, -718541592);
            class44.field973++;
            class36.field809.method1396(var5, -718541592);
            class36.field809.method1394(var2, 128);
            class36.field809.method1380(class226.field4095, -2097152);
        }
        if (var3 == 39) {
            class162.field3030++;
            class36.field809.method1356(244, true);
            class36.field809.method1396(var5, -718541592);
            class36.field809.method1418(123, var4);
            class36.field809.method1380(var2, -2097152);
            class24.field595 = 0;
            client.field2855 = class25.method178(119, var2);
            class35.field800 = var5;
        }
        if (var3 == 22) {
            class224 var48 = class186.field3294[var4];
            if (var48 != null) {
                class48.method375(1, 0, false, class124.field2412.field707[0], var48.field707[0], 0, 0, 2, var48.field705[0], class124.field2412.field705[0], 1, -24761);
                class162.field3051 = class185.field3288;
                class129.field2471++;
                class187.field3316 = class39.field906;
                class198.field3523 = 2;
                class141.field2673 = 0;
                class36.field809.method1356(199, true);
                class36.field809.method1396(var4, -718541592);
            }
        }
        if (var3 == 37) {
            client.field2858++;
            boolean var49 = class48.method375(0, 0, false, class124.field2412.field707[0], var5, 0, 0, 2, var2, class124.field2412.field705[0], 0, -24761);
            if (!var49) {
                class48.method375(1, 0, false, class124.field2412.field707[0], var5, 0, 0, 2, var2, class124.field2412.field705[0], 1, -24761);
            }
            class162.field3051 = class185.field3288;
            class141.field2673 = 0;
            class187.field3316 = class39.field906;
            class198.field3523 = 2;
            class36.field809.method1356(39, true);
            class36.field809.method1418(103, var4);
            class36.field809.method1418(114, class252.field4481 + var5);
            class36.field809.method1420((byte) 122, class79.field1554 + var2);
        }
        if (var3 == 6) {
            class184.method1270(class180.field3244, var5, var2);
        }
        if (var3 == 59) {
            class118.field2321 = true;
            class184.method1270(class180.field3244, var5, var2);
        }
        if (var3 == 14) {
            class107.field2056++;
            class36.field809.method1356(63, true);
            class36.field809.method1428((byte) -93, var5);
            class36.field809.method1428((byte) 83, var4);
            class36.field809.method1382(-30860, var2);
            class24.field595 = 0;
            client.field2855 = class25.method178(112, var2);
            class35.field800 = var5;
        }
        if (var3 == 16) {
            class104.field1991++;
            class36.field809.method1356(62, true);
            class36.field809.method1428((byte) -102, var5);
            class36.field809.method1418(107, var4);
            class36.field809.method1382(-30860, var2);
            class24.field595 = 0;
            client.field2855 = class25.method178(70, var2);
            class35.field800 = var5;
        }
        if (class51.field1078 != 0) {
            class51.field1078 = 0;
            class62.method441(-29481, class25.method178(61, class25.field599));
        }
        if (class11.field336) {
            class138.method985(26797);
        }
        if (client.field2855 != null && class24.field595 == 0) {
            class62.method441(-29481, client.field2855);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIILwj;)V")
    public static final void method1775(int arg0, int arg1, int arg2, int arg3, class6 arg4) {
        field4645++;
        if (arg1 < 7) {
            field4658 = null;
        }
        class7.method51(21966);
        class131.method936(arg0, arg3, arg4.field163 + arg0, arg4.field131 + arg3);
        if (class186.field3299 == 2 || class186.field3299 == 5 || class66.field1297 == null) {
            class131.method934(arg0, arg3, 0, arg4.field209, arg4.field200);
        } else {
            int var5 = class86.field1664 + class56.field1145 & 0x7FF;
            int var6 = class124.field2412.field676 / 32 + 48;
            int var7 = 464 - (class124.field2412.field685 / 32);
            ((class167) class66.field1297).method714(arg0, arg3, arg4.field163, arg4.field131, var6, var7, var5, class76.field1515 + 256, arg4.field209, arg4.field200);
            if (class23.field579 != null) {
                for (int var8 = 0; var8 < class23.field579.field1177; var8++) {
                    if (class23.field579.method424(false, var8)) {
                        int var9 = class145.field2742[var5];
                        int var10 = (class23.field579.field1179[var8] - class252.field4481) * 4 + 2 - (class124.field2412.field676 / 32);
                        int var11 = (class23.field579.field1182[var8] - class79.field1554) * 4 + 2 - (class124.field2412.field685 / 32);
                        int var12 = var9 * 256 / (class76.field1515 + 256);
                        int var13 = class145.field2746[var5];
                        int var14 = var13 * 256 / (class76.field1515 + 256);
                        int var15 = var11 * var12 - (var10 * var14) >> 16;
                        int var16 = var10 * var12 + var11 * var14 >> 16;
                        class259 var17 = class45.field1014;
                        if (class23.field579.method422(94, var8) == 1) {
                            var17 = class211.field3820;
                        }
                        if (class23.field579.method422(96, var8) == 2) {
                            var17 = class141.field2684;
                        }
                        int var18 = var17.method1749(class23.field579.field1170[var8], 100);
                        int var19 = var16 - var18 / 2;
                        if ((-arg4.field163) <= var19 && var19 <= arg4.field163 && var15 >= (-arg4.field131) && arg4.field131 >= var15) {
                            int var20 = 16777215;
                            if (class23.field579.field1181[var8] != -1) {
                                var20 = class23.field579.field1181[var8];
                            }
                            class131.method923(arg4.field209, arg4.field200);
                            var17.method1764(class23.field579.field1170[var8], var19 - (-(arg4.field163 / 2) - arg0), arg4.field131 / 2 + arg3 + -var15, var18, 50, var20, 0, 256, 1, 0, 0);
                            class131.method919();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class158.field2965; var21++) {
                int var56 = class198.field3525[var21] * 4 + 2 - (class124.field2412.field676 / 32);
                int var57 = class64.field1272[var21] * 4 + 2 - (class124.field2412.field685 / 32);
                class117 var58 = class268.method1845(class87.field1735[var21], (byte) -86);
                if (var58.field2295 != null) {
                    var58 = var58.method840(-1);
                    if (var58 == null || var58.field2287 == -1) {
                        continue;
                    }
                }
                class235.method1628(arg4, arg3, var56, -182785264, class43.field959[var58.field2287], arg0, var57);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var52 = 0; var52 < 104; var52++) {
                    class257 var53 = class238.field4284[class180.field3244][var22][var52];
                    if (var53 != null) {
                        int var54 = var22 * 4 + 2 - class124.field2412.field676 / 32;
                        int var55 = var52 * 4 + 2 - (class124.field2412.field685 / 32);
                        class235.method1628(arg4, arg3, var54, -182785264, class206.field3723[0], arg0, var55);
                    }
                }
            }
            for (int var23 = 0; var23 < class61.field1207; var23++) {
                class170 var48 = class233.field4217[class189.field3350[var23]];
                if (var48 != null && var48.method238(-24869)) {
                    class11 var49 = var48.field3130;
                    if (var49 != null && var49.field348 != null) {
                        var49 = var49.method87(true);
                    }
                    if (var49 != null && var49.field377 && var49.field363) {
                        int var50 = var48.field676 / 32 - (class124.field2412.field676 / 32);
                        int var51 = var48.field685 / 32 - (class124.field2412.field685 / 32);
                        class235.method1628(arg4, arg3, var50, -182785264, class206.field3723[1], arg0, var51);
                    }
                }
            }
            for (int var24 = 0; var24 < class209.field3786; var24++) {
                class224 var38 = class186.field3294[class142.field2689[var24]];
                if (var38 != null && var38.method238(-24869)) {
                    int var39 = var38.field676 / 32 - (class124.field2412.field676 / 32);
                    int var40 = var38.field685 / 32 - (class124.field2412.field685 / 32);
                    boolean var41 = false;
                    long var42 = var38.field4029.method622(-2);
                    for (int var44 = 0; var44 < class97.field1928; var44++) {
                        if (class209.field3780[var44] == var42 && class98.field1944[var44] != 0) {
                            var41 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    for (int var46 = 0; var46 < class144.field2738; var46++) {
                        if (class162.field3053[var46].field3759 == var42) {
                            var45 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    if (class124.field2412.field4025 != 0 && var38.field4025 != 0 && class124.field2412.field4025 == var38.field4025) {
                        var47 = true;
                    }
                    if (var41) {
                        class235.method1628(arg4, arg3, var39, -182785264, class206.field3723[3], arg0, var40);
                    } else if (var45) {
                        class235.method1628(arg4, arg3, var39, -182785264, class206.field3723[5], arg0, var40);
                    } else if (var47) {
                        class235.method1628(arg4, arg3, var39, -182785264, class206.field3723[4], arg0, var40);
                    } else {
                        class235.method1628(arg4, arg3, var39, -182785264, class206.field3723[2], arg0, var40);
                    }
                }
            }
            int var25 = 0;
            class20[] var26 = class180.field3247;
            while (var25 < var26.length) {
                class20 var29 = var26[var25];
                if (var29 != null && var29.field516 != 0 && (class236.field4265 % 20) < 10) {
                    if (var29.field516 == 1 && var29.field531 >= 0 && class233.field4217.length > var29.field531) {
                        class170 var30 = class233.field4217[var29.field531];
                        if (var30 != null) {
                            int var31 = var30.field676 / 32 - (class124.field2412.field676 / 32);
                            int var32 = var30.field685 / 32 - class124.field2412.field685 / 32;
                            class249.method1686(arg0, var29.field529, var31, arg4, var32, 2, arg3);
                        }
                    }
                    if (var29.field516 == 2) {
                        int var33 = (var29.field521 - class79.field1554) * 4 - ((class124.field2412.field685 / 32) - 2);
                        int var34 = (var29.field535 - class252.field4481) * 4 + 2 - (class124.field2412.field676 / 32);
                        class249.method1686(arg0, var29.field529, var34, arg4, var33, 2, arg3);
                    }
                    if (var29.field516 == 10 && var29.field531 >= 0 && class186.field3294.length > var29.field531) {
                        class224 var35 = class186.field3294[var29.field531];
                        if (var35 != null) {
                            int var36 = var35.field676 / 32 - (class124.field2412.field676 / 32);
                            int var37 = var35.field685 / 32 - class124.field2412.field685 / 32;
                            class249.method1686(arg0, var29.field529, var36, arg4, var37, 2, arg3);
                        }
                    }
                }
                var25++;
            }
            if (class133.field2514 != 0) {
                int var27 = class133.field2514 * 4 + 2 - (class124.field2412.field676 / 32);
                int var28 = class193.field3459 * 4 + 2 - (class124.field2412.field685 / 32);
                class235.method1628(arg4, arg3, var27, -182785264, class150.field2795, arg0, var28);
            }
            class131.method927(arg4.field163 / 2 + arg0 - 1, arg3 + -1 - -(arg4.field131 / 2), 3, 3, 16777215);
        }
        class204.field3686[arg2] = true;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIII)V")
    public static final void method1776(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4660++;
        for (int var6 = arg3; var6 <= arg4; var6++) {
            class56.method412(arg2, (byte) -105, arg1, class249.field4420[var6], arg0);
        }
        if (arg5 != -1006) {
            method1773((byte) -8);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI[Lwj;)V")
    public static final void method1777(byte arg0, int arg1, class6[] arg2) {
        int var3 = 0;
        if (arg0 != 63) {
            method1778((byte) 95);
        }
        while (var3 < arg2.length) {
            class6 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field184 == 0) {
                    if (var4.field216 != null) {
                        method1777((byte) 63, arg1, var4.field216);
                    }
                    class1 var5 = (class1) class1.field15.method1698((long) var4.field222, (byte) -77);
                    if (var5 != null) {
                        class67.method476((byte) 112, arg1, var5.field2);
                    }
                }
                if (arg1 == 0 && var4.field241 != null) {
                    class55 var6 = new class55();
                    var6.field1128 = var4.field241;
                    var6.field1114 = var4;
                    class59.method427(var6, 200000);
                }
                if (arg1 == 1 && var4.field105 != null) {
                    label62: {
                        if (var4.field177 >= 0) {
                            class6 var7 = class25.method178(126, var4.field222);
                            if (var7 == null || var7.field216 == null || var4.field177 >= var7.field216.length || var7.field216[var4.field177] != var4) {
                                break label62;
                            }
                        }
                        class55 var8 = new class55();
                        var8.field1114 = var4;
                        var8.field1128 = var4.field105;
                        class59.method427(var8, 200000);
                    }
                }
            }
            var3++;
        }
        field4644++;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)V")
    public static void method1778(byte arg0) {
        field4659 = null;
        field4651 = null;
        field4658 = null;
        if (arg0 != -99) {
            field4647 = true;
        }
        field4662 = null;
        field4652 = null;
        field4643 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIBLdh;I)V")
    public static final void method1779(int arg0, int arg1, byte arg2, class117 arg3, int arg4) {
        field4642++;
        class14 var5 = (class14) class258.field4574.method1737((byte) 74);
        if (arg2 != -111) {
            field4651 = null;
        }
        while (var5 != null) {
            if (var5.field429 == arg4 && arg1 * 128 == var5.field432 && (arg0 * 128) == var5.field409 && var5.field413.field2261 == arg3.field2261) {
                if (var5.field420 != null) {
                    class2.field18.method366(var5.field420);
                    var5.field420 = null;
                }
                if (var5.field424 != null) {
                    class2.field18.method366(var5.field424);
                    var5.field424 = null;
                }
                var5.method1477(arg2 + 112);
                return;
            }
            var5 = (class14) class258.field4574.method1740(-8843);
        }
    }
}
