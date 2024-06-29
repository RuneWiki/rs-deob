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
public class client extends class132 {

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static volatile int field2185 = 0;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Lhc;")
    public static class235 field2186;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Z")
    public static boolean field2199;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "[[[B")
    public static byte[][][] field2180;

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
    private final void method1039(boolean arg0, int arg1) {
        if (!arg0) {
            field2185 = -78;
        }
        class280.field4341 = null;
        class214.field3229.field1339 = arg1;
        class159.field2218 = null;
        class49.field714 = 0;
        class214.field3229.field1338++;
        field2184++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lse;)Lt;")
    public static final class203 method1040(class211 arg0) {
        class203 var1 = (class203) class247.field3784.method23(216, ((long) arg0.field3093 << 32) + (long) arg0.field3042);
        return var1 == null ? arg0.field3022 : var1;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    private final void method1041(boolean arg0) {
        boolean var2 = class214.field3229.method625(0);
        if (!var2) {
            this.method1046(-57);
        }
        if (!arg0) {
            field2185 = -52;
        }
        field2189++;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method1042(int arg0) {
        if (arg0 != 9017) {
            this.method898(20);
        }
        field2191++;
        if (!class235.field3553) {
            label240: while (true) {
                do {
                    if (!class13.method79(127)) {
                        break label240;
                    }
                } while (class178.field2499 != 's' && class178.field2499 != 'S');
                class235.field3553 = true;
            }
        }
        if (class261.field3952 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class223.method1433((byte) 33);
            if (class111.field1615 == 0L) {
                class111.field1615 = var4;
            }
            if (var3 > 16384 && (var4 - class111.field1615) < 5000L) {
                if ((var4 - class257.field3925) > 1000L) {
                    System.gc();
                    class257.field3925 = var4;
                }
                class92.field1276 = 5;
                class215.field3250 = class239.field3644;
            } else {
                class92.field1276 = 5;
                class261.field3952 = 10;
                class215.field3250 = class296.field4667;
            }
        } else if (class261.field3952 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class122.field1703[var6] = new class276(104, 104);
            }
            class215.field3250 = class164.field2276;
            class92.field1276 = 10;
            class261.field3952 = 30;
        } else if (class261.field3952 == 30) {
            if (class273.field4216 == null) {
                class273.field4216 = new class39(class214.field3229, class221.field3309);
            }
            if (class273.field4216.method254((byte) -116)) {
                class36.field560 = class274.method1830(0, true, -128, true, false);
                class225.field3413 = class274.method1830(1, true, -118, true, false);
                class42.field638 = class274.method1830(2, false, arg0 ^ 0xFFFFDCBA, true, true);
                class96.field1353 = class274.method1830(3, true, -127, true, false);
                class10.field94 = class274.method1830(4, true, arg0 - 9134, true, false);
                class197.field2726 = class274.method1830(5, true, arg0 ^ 0xFFFFDCBB, true, true);
                class23.field324 = class274.method1830(6, true, -118, false, true);
                class224.field3400 = class274.method1830(7, true, -127, true, false);
                class21.field299 = class274.method1830(8, true, -118, true, false);
                class237.field3602 = class274.method1830(9, true, -127, true, false);
                class232.field3510 = class274.method1830(10, true, -121, true, false);
                class50.field726 = class274.method1830(11, true, -119, true, false);
                class184.field2551 = class274.method1830(12, true, -115, true, false);
                class50.field724 = class274.method1830(13, true, -118, true, false);
                class241.field3694 = class274.method1830(14, true, -120, false, false);
                class199.field2771 = class274.method1830(15, true, -124, true, false);
                class41.field619 = class274.method1830(16, true, -123, true, false);
                class246.field3768 = class274.method1830(17, true, -119, true, false);
                class180.field2525 = class274.method1830(18, true, -126, true, false);
                class250.field3827 = class274.method1830(19, true, arg0 ^ 0xFFFFDCBC, true, false);
                class138.field1931 = class274.method1830(20, true, -124, true, false);
                class186.field2559 = class274.method1830(21, true, -116, true, false);
                class246.field3780 = class274.method1830(22, true, arg0 ^ 0xFFFFDCB9, true, false);
                class174.field2455 = class274.method1830(23, true, -117, true, true);
                class295.field4637 = class274.method1830(24, true, -128, true, false);
                class116.field1650 = class274.method1830(25, true, arg0 ^ 0xFFFFDCBA, true, false);
                class213.field3204 = class274.method1830(26, true, -118, true, true);
                class195.field2701 = class274.method1830(27, true, -117, true, false);
                class42.field627 = class274.method1830(28, true, arg0 - 9132, true, true);
                class92.field1276 = 15;
                class215.field3250 = class164.field2280;
                class261.field3952 = 40;
            } else {
                class215.field3250 = class256.field3919;
                class92.field1276 = 12;
            }
        } else if (class261.field3952 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 29; var8++) {
                var7 += class160.field2246[var8].method1103((byte) -116) * class1.field4[var8] / 100;
            }
            if (var7 == 100) {
                class215.field3250 = class103.field1435;
                class92.field1276 = 20;
                class283.method1902((byte) -124, class21.field299);
                class253.method1689((byte) 25, class21.field299);
                class29.method188(class21.field299, (byte) 68);
                class261.field3952 = 41;
            } else {
                class92.field1276 = 20;
                if (var7 != 0) {
                    class215.field3250 = class171.field2375 + var7 + "%";
                }
            }
        } else if (class261.field3952 == 41) {
            if (class42.field627.method1562((byte) -121)) {
                this.method1047(30376, class42.field627.method1565(1, -121));
                class215.field3250 = class81.field1109;
                class92.field1276 = 25;
                class261.field3952 = 45;
            } else {
                class215.field3250 = class224.field3378 + class42.field627.method1550(true) + "%";
                class92.field1276 = 25;
            }
        } else if (class261.field3952 == 45) {
            class229.method1514(22050, 2, class261.field3954, arg0 - 17018);
            class181.field2544 = new class208();
            class181.field2544.method1332(9, 128, false);
            class139.field1933 = class13.method84(class156.field2177, class200.field2784, 22050, 0, false);
            class139.field1933.method856((byte) -60, class181.field2544);
            class293.method1961(class10.field94, class241.field3694, -33, class181.field2544, class199.field2771);
            class234.field3537 = class13.method84(class156.field2177, class200.field2784, 2048, 1, false);
            class21.field298 = new class58();
            class234.field3537.method856((byte) -107, class21.field298);
            class181.field2543 = new class175(22050, class60.field845);
            class105.field1461 = class23.field324.method1568("scape main", arg0 ^ 0xFFFFC1B8);
            class92.field1276 = 30;
            class261.field3952 = 50;
            class215.field3250 = class164.field2274;
        } else if (class261.field3952 == 50) {
            int var9 = class76.method488(class50.field724, class21.field299, 0);
            int var10 = class123.method810(-116);
            if (var9 < var10) {
                class92.field1276 = 35;
                class215.field3250 = class6.field52 + var9 * 100 / var10 + "%";
            } else {
                class261.field3952 = 60;
                class215.field3250 = class240.field3661;
                class92.field1276 = 35;
            }
        } else if (class261.field3952 == 60) {
            int var11 = class104.method679(class21.field299, arg0 - 9017);
            int var12 = class27.method179(127);
            if (var12 > var11) {
                class92.field1276 = 40;
                class215.field3250 = class275.field4254 + var11 * 100 / var12 + "%";
            } else {
                class92.field1276 = 40;
                class261.field3952 = 65;
                class215.field3250 = class156.field2168;
            }
        } else if (class261.field3952 == 65) {
            class256.method1710(class21.field299, class50.field724, false);
            class92.field1276 = 45;
            class215.field3250 = class290.field4572;
            class145.method977(111, 5);
            class261.field3952 = 70;
        } else if (class261.field3952 == 70) {
            byte var13 = 0;
            class42.field638.method1562((byte) -42);
            int var14 = var13 + class42.field638.method1550(true);
            class41.field619.method1562((byte) 103);
            int var15 = var14 + class41.field619.method1550(true);
            class246.field3768.method1562((byte) -82);
            int var16 = var15 + class246.field3768.method1550(true);
            class180.field2525.method1562((byte) 110);
            int var17 = var16 + class180.field2525.method1550(true);
            class250.field3827.method1562((byte) 113);
            int var18 = var17 + class250.field3827.method1550(true);
            class138.field1931.method1562((byte) 112);
            int var19 = var18 + class138.field1931.method1550(true);
            class186.field2559.method1562((byte) -128);
            int var20 = var19 + class186.field2559.method1550(true);
            class246.field3780.method1562((byte) 122);
            int var21 = var20 + class246.field3780.method1550(true);
            class295.field4637.method1562((byte) 114);
            int var22 = var21 + class295.field4637.method1550(true);
            class116.field1650.method1562((byte) -74);
            int var23 = var22 + class116.field1650.method1550(true);
            class195.field2701.method1562((byte) -124);
            int var24 = var23 + class195.field2701.method1550(true);
            if (var24 < 1100) {
                class92.field1276 = 50;
                class215.field3250 = class141.field1958 + var24 / 11 + "%";
            } else {
                class21.method154(class42.field638, (byte) -63);
                class197.method1253(class42.field638, -16200);
                class36.method243(false, class42.field638);
                class256.method1711(class224.field3400, class42.field638, false);
                class146.method979(class41.field619, true, (byte) 53, class224.field3400);
                class79.method507(2, class224.field3400, class180.field2525);
                class169.method1109(true, (byte) 117, class224.field3400, class7.field65, class250.field3827);
                class37.method246(class42.field638, 30640);
                class170.method1111(class36.field560, true, class138.field1931, class225.field3413);
                class101.method664((byte) 0, class42.field638);
                class86.method545(class224.field3400, (byte) -74, class186.field2559);
                class189.method1211((byte) 79, class246.field3780);
                class289.method1944((byte) 96, class42.field638);
                class173.method1135(class96.field1353, class50.field724, class224.field3400, 17055, class21.field299);
                class142.method950(112, class42.field638);
                class95.method635(class246.field3768, false);
                class186.method1196(class295.field4637, new class37(), arg0 ^ 0x2351, class116.field1650);
                class27.method178(class116.field1650, 0, class295.field4637);
                class231.method1524(class42.field638, (byte) -8);
                class264.method1733(class42.field638, 9);
                class42.method277(class42.field638, (byte) -79);
                class275.method1835(class21.field299, (byte) 63, class42.field638);
                class187.method1198(class42.field638, class21.field299, 10770);
                class92.field1276 = 50;
                class215.field3250 = class269.field4127;
                class62.method381(1);
                class261.field3952 = 80;
            }
        } else if (class261.field3952 == 80) {
            int var25 = class21.method155(class21.field299, 0);
            int var26 = class176.method1158((byte) -43);
            if (var26 > var25) {
                class215.field3250 = class222.field3325 + var25 * 100 / var26 + "%";
                class92.field1276 = 60;
            } else {
                class137.method930(41, class21.field299);
                class261.field3952 = 90;
                class215.field3250 = class51.field738;
                class92.field1276 = 60;
            }
        } else if (class261.field3952 == 90) {
            if (class213.field3204.method1562((byte) 127)) {
                class206 var27 = new class206(class237.field3602, class213.field3204, class21.field299, 20, !class86.field1174);
                class90.method582(var27);
                if (class266.field3984 == 1) {
                    class90.method572(0.9F);
                }
                if (class266.field3984 == 2) {
                    class90.method572(0.8F);
                }
                if (class266.field3984 == 3) {
                    class90.method572(0.7F);
                }
                if (class266.field3984 == 4) {
                    class90.method572(0.6F);
                }
                class215.field3250 = class158.field2211;
                class92.field1276 = 70;
                class261.field3952 = 100;
            } else {
                class215.field3250 = class285.field4457 + class213.field3204.method1550(true) + "%";
                class92.field1276 = 70;
            }
        } else if (class261.field3952 == 100) {
            if (class212.method1384(class21.field299, (byte) -12)) {
                class261.field3952 = 110;
            }
        } else if (class261.field3952 == 110) {
            class54.field784 = new class200();
            class200.field2784.method1638(2, class54.field784, 10);
            class261.field3952 = 120;
            class92.field1276 = 75;
            class215.field3250 = class82.field1119;
        } else if (class261.field3952 == 120) {
            if (class232.field3510.method1547("", "huffman", 2)) {
                class8 var28 = new class8(class232.field3510.method1552(-2017, "", "huffman"));
                class10.method68(var28, arg0 - 9018);
                class261.field3952 = 130;
                class92.field1276 = 80;
                class215.field3250 = class47.field691;
            } else {
                class92.field1276 = 80;
                class215.field3250 = class11.field111 + "0%";
            }
        } else if (class261.field3952 == 130) {
            if (!class96.field1353.method1562((byte) -116)) {
                class215.field3250 = class202.field2799 + class96.field1353.method1550(true) * 3 / 4 + "%";
                class92.field1276 = 85;
            } else if (!class184.field2551.method1562((byte) 86)) {
                class215.field3250 = class202.field2799 + (class184.field2551.method1550(true) / 10 + 75) + "%";
                class92.field1276 = 85;
            } else if (!class50.field724.method1562((byte) -119)) {
                class215.field3250 = class202.field2799 + (class50.field724.method1550(true) / 20 + 85) + "%";
                class92.field1276 = 85;
            } else if (class174.field2455.method1553((byte) -118, "details")) {
                class191.method1227(class174.field2455, class195.field2699, false);
                class130.method888(class224.field3400);
                class215.field3250 = class206.field2868;
                class92.field1276 = 95;
                class261.field3952 = 135;
            } else {
                class215.field3250 = class202.field2799 + (class174.field2455.method1559(-94, "details") / 10 + 90) + "%";
                class92.field1276 = 85;
            }
        } else if (class261.field3952 == 135) {
            int var29 = class290.method1951((byte) 15);
            if (var29 == -1) {
                class92.field1276 = 95;
                class215.field3250 = class47.field692;
            } else if (var29 == 7 || var29 == 9) {
                this.method894("worldlistfull", (byte) -63);
                class145.method977(121, 1000);
            } else if (class257.field3927) {
                class261.field3952 = 140;
                class215.field3250 = class295.field4647;
                class92.field1276 = 96;
            } else {
                this.method894("worldlistio_" + var29, (byte) -87);
                class145.method977(-79, 1000);
            }
        } else if (class261.field3952 == 140) {
            class280.field4344 = class96.field1353.method1568("loginscreen", arg0 - 16568);
            class197.field2726.method1557(false, true, 100);
            class23.field324.method1557(true, true, arg0 ^ 0x235D);
            class21.field299.method1557(true, true, 100);
            class50.field724.method1557(true, true, 100);
            class232.field3510.method1557(true, true, arg0 ^ 0x235D);
            class96.field1353.method1557(true, true, 100);
            class215.field3250 = class60.field848;
            class261.field3952 = 150;
            class240.field3660 = true;
            class92.field1276 = 97;
        } else if (class261.field3952 == 150) {
            if (class235.field3553) {
                class111.field1617 = 0;
                class221.field3321 = 0;
                class219.field3294 = 0;
                class77.field1079 = 0;
            }
            class235.field3553 = true;
            class7.method45(class200.field2784, (byte) 61);
            class180.method1174(false, -1, 97, -1, class221.field3321);
            class261.field3952 = 160;
            class92.field1276 = 100;
            class215.field3250 = class227.field3436;
        } else if (class261.field3952 == 160) {
            class167.method1095(true, -6025);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2188++;
        if (!this.method907(false)) {
            return;
        }
        class213.field3203 = Integer.parseInt(this.getParameter("worldid"));
        class34.field533 = Integer.parseInt(this.getParameter("modewhere"));
        if (class34.field533 < 0 || class34.field533 > 1) {
            class34.field533 = 0;
        }
        class160.field2247 = Integer.parseInt(this.getParameter("modewhat"));
        if (class160.field2247 < 0 || class160.field2247 > 2) {
            class160.field2247 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class286.field4521 = true;
        } else {
            class286.field4521 = false;
        }
        try {
            class218.field3288 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class218.field3288 = 0;
        }
        class15.method86(class218.field3288, 2000);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class249.field3806 = true;
        } else {
            class249.field3806 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class282.field4371 = true;
        } else {
            class282.field4371 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class124.field1746 = 1;
        } else {
            class124.field1746 = 0;
        }
        try {
            class230.field3491 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class230.field3491 = 0;
        }
        class218.field3287 = this.getParameter("settings");
        if (class218.field3287 == null) {
            class218.field3287 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class87.field1185 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class87.field1185 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class16.field167 = true;
        } else {
            class16.field167 = false;
        }
        class250.field3826 = this;
        this.method895(535, 503, -38, 765, class160.field2247 + 32);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class228.method1508((byte) 27, "argument count");
            }
            class213.field3203 = Integer.parseInt(arg0[0]);
            class34.field533 = 2;
            if (arg0[1].equals("live")) {
                class160.field2247 = 0;
            } else if (arg0[1].equals("rc")) {
                class160.field2247 = 1;
            } else if (arg0[1].equals("wip")) {
                class160.field2247 = 2;
            } else {
                class228.method1508((byte) 27, "modewhat");
            }
            class286.field4521 = false;
            class218.field3288 = class289.method1945(arg0[2], (byte) -113);
            if (class218.field3288 == -1) {
                if (arg0[2].equals("english")) {
                    class218.field3288 = 0;
                } else if (arg0[2].equals("german")) {
                    class218.field3288 = 1;
                } else {
                    class228.method1508((byte) 27, "language");
                }
            }
            class15.method86(class218.field3288, 2000);
            class249.field3806 = false;
            class282.field4371 = false;
            if (arg0[3].equals("game0")) {
                class124.field1746 = 0;
            } else if (arg0[3].equals("game1")) {
                class124.field1746 = 1;
            } else {
                class228.method1508((byte) 27, "game");
            }
            class16.field167 = false;
            class87.field1185 = 0;
            class218.field3287 = "";
            class230.field3491 = 0;
            client var1 = new client();
            class250.field3826 = var1;
            var1.method902(false, 768, "runescape", class160.field2247 + 32, 535, true, 1024, 29);
            class17.field179.setLocation(40, 40);
        } catch (Exception var3) {
            class221.method1426((String) null, -1, var3);
        }
        field2195++;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method1043(int arg0) {
        field2196++;
        for (class269.field4126 = 0; class13.method79(127) && class269.field4126 < 128; class269.field4126++) {
            class60.field850[class269.field4126] = class269.field4129;
            class139.field1936[class269.field4126] = class178.field2499;
        }
        class225.field3409++;
        if (class212.field3193 != -1) {
            class198.method1264(0, 0, class275.field4263, 0, class197.field2739, 0, class212.field3193, true);
        }
        class35.field548++;
        class264.method1731((byte) 126);
        while (true) {
            class27 var2;
            class211 var3;
            class211 var4;
            do {
                var2 = (class27) class145.field2020.method997((byte) -123);
                if (var2 == null) {
                    while (true) {
                        class27 var5;
                        class211 var6;
                        class211 var7;
                        do {
                            var5 = (class27) class197.field2736.method997((byte) -115);
                            if (var5 == null) {
                                while (true) {
                                    class27 var8;
                                    class211 var9;
                                    class211 var10;
                                    do {
                                        var8 = (class27) class216.field3257.method997((byte) -118);
                                        if (var8 == null) {
                                            if (arg0 != 5) {
                                                this.method1043(-53);
                                            }
                                            if (class208.field2967 != null) {
                                                class56.method350((byte) 21);
                                            }
                                            if (class143.field1981 != null && class143.field1981.field1663 == 1) {
                                                if (class143.field1981.field1665 != null) {
                                                    class16.method94(class83.field1130, false, class136.field1903);
                                                }
                                                class136.field1903 = false;
                                                class143.field1981 = null;
                                                class83.field1130 = null;
                                            }
                                            if ((class52.field740 % 1500) == 0) {
                                                class290.method1950(106);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field338;
                                        if (var9.field3042 < 0) {
                                            break;
                                        }
                                        var10 = class67.method421(var9.field3127, 0);
                                    } while (var10 == null || var10.field3180 == null || var9.field3042 >= var10.field3180.length || var10.field3180[var9.field3042] != var9);
                                    class213.method1392(var8, 120);
                                }
                            }
                            var6 = var5.field338;
                            if (var6.field3042 < 0) {
                                break;
                            }
                            var7 = class67.method421(var6.field3127, 0);
                        } while (var7 == null || var7.field3180 == null || var6.field3042 >= var7.field3180.length || var7.field3180[var6.field3042] != var6);
                        class213.method1392(var5, -87);
                    }
                }
                var3 = var2.field338;
                if (var3.field3042 < 0) {
                    break;
                }
                var4 = class67.method421(var3.field3127, arg0 - 5);
            } while (var4 == null || var4.field3180 == null || var4.field3180.length <= var3.field3042 || var4.field3180[var3.field3042] != var3);
            class213.method1392(var2, arg0 - 101);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lse;IIIIIII)V")
    public static final void method1044(class211[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class211 var9 = arg0[var8];
            if (var9 != null && var9.field3127 == arg1 && (!var9.field3011 || var9.field3035 == 0 || var9.field3143 || method1040(var9).field2828 != 0 || class225.field3414 == var9 || var9.field3062 == 1338) && (!var9.field3011 || !method1045(var9))) {
                int var10 = var9.field3137 + arg6;
                int var11 = var9.field3101 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3035 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3112 + var10;
                    int var17 = var9.field3166 + var11;
                    if (var9.field3035 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class208.field2967 == var9) {
                    class125.field1756 = true;
                    class170.field2362 = var10;
                    class173.field2405 = var11;
                }
                if (!var9.field3011 || var12 < var14 && var13 < var15) {
                    if (var9.field3035 == 0) {
                        if (!var9.field3011 && method1045(var9) && class270.field4147 != var9) {
                            continue;
                        }
                        if (var9.field3154 && class12.field124 >= var12 && class287.field4543 >= var13 && class12.field124 < var14 && class287.field4543 < var15) {
                            for (class27 var18 = (class27) class216.field3257.method990(-126); var18 != null; var18 = (class27) class216.field3257.method993(-55)) {
                                if (var18.field350) {
                                    var18.method1115(14);
                                    var18.field338.field3030 = false;
                                }
                            }
                            if (class241.field3702 == 0) {
                                class208.field2967 = null;
                                class225.field3414 = null;
                            }
                            class180.field2523 = 0;
                        }
                    }
                    if (var9.field3011) {
                        boolean var19;
                        if (class12.field124 >= var12 && class287.field4543 >= var13 && class12.field124 < var14 && class287.field4543 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class104.field1455 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class202.field2798 == 1 && class27.field344 >= var12 && class81.field1112 >= var13 && class27.field344 < var14 && class81.field1112 < var15) {
                            var21 = true;
                        }
                        if (var9.field3181 != null) {
                            for (int var22 = 0; var22 < var9.field3181.length; var22++) {
                                if (class138.field1928[var9.field3181[var22]]) {
                                    if (var9.field3102 == null || class52.field740 >= var9.field3102[var22]) {
                                        byte var23 = var9.field3096[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class138.field1928[86] && !class138.field1928[82] && !class138.field1928[81]) && ((var23 & 0x2) == 0 || class138.field1928[86]) && ((var23 & 0x1) == 0 || class138.field1928[82]) && ((var23 & 0x4) == 0 || class138.field1928[81])) {
                                            class176.method1157(var22 + 1, var9.field3093, -1, 6336, "");
                                            int var24 = var9.field3080[var22];
                                            if (var9.field3102 == null) {
                                                var9.field3102 = new int[var9.field3181.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field3102[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field3102[var22] = class52.field740 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field3102 != null) {
                                    var9.field3102[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class159.method1056(class81.field1112 - var11, false, class27.field344 - var10, var9);
                        }
                        if (class208.field2967 != null && class208.field2967 != var9 && var19 && method1040(var9).method1294(-90)) {
                            class296.field4658 = var9;
                        }
                        if (class225.field3414 == var9) {
                            class30.field409 = true;
                            class202.field2812 = var10;
                            class297.field4683 = var11;
                        }
                        if (var9.field3143 || var9.field3062 != 0) {
                            if (var19 && class215.field3248 != 0 && var9.field3077 != null) {
                                class27 var25 = new class27();
                                var25.field350 = true;
                                var25.field338 = var9;
                                var25.field348 = class215.field3248;
                                var25.field341 = var9.field3077;
                                class216.field3257.method988(var25, (byte) -77);
                            }
                            if (class208.field2967 != null || class52.field758 != null || class15.field146 || var9.field3062 != 1400 && class180.field2523 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field3062 != 0) {
                                if (var9.field3062 == 1337) {
                                    class47.field690 = var9;
                                    continue;
                                }
                                if (var9.field3062 == 1338) {
                                    if (var21) {
                                        class287.field4550 = class27.field344 - var10;
                                        class12.field121 = class81.field1112 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field3062 == 1400) {
                                    class124.field1748 = var9;
                                    if (var21) {
                                        if (class138.field1928[82] && class229.field3470 > 0) {
                                            int var26 = (int) ((double) (class27.field344 - var10 - var9.field3112 / 2) * 2.0D / (double) class221.field3310);
                                            int var27 = (int) ((double) (class81.field1112 - var11 - var9.field3166 / 2) * 2.0D / (double) class221.field3310);
                                            int var28 = field2181 + var26;
                                            int var29 = class234.field3529 + var27;
                                            int var30 = class164.field2273 + var28;
                                            int var31 = class41.field605 + class142.field1972 - var29 - 1;
                                            class254 var32 = class241.method1622(true);
                                            int[] var33 = var32.method1697((byte) -127, var31, var30);
                                            if (var33 != null) {
                                                class273.method1824(var33[2], var33[1], 32, var33[0]);
                                                class297.method1985(-1);
                                            }
                                            continue;
                                        }
                                        class180.field2523 = 1;
                                        class42.field642 = class12.field124;
                                        class294.field4625 = class287.field4543;
                                        continue;
                                    }
                                    if (var20 && class180.field2523 > 0) {
                                        if (class180.field2523 == 1 && (class42.field642 != class12.field124 || class294.field4625 != class287.field4543)) {
                                            class76.field1066 = field2181;
                                            class63.field864 = class234.field3529;
                                            class180.field2523 = 2;
                                        }
                                        if (class180.field2523 == 2) {
                                            class4.method27(38, (int) ((double) (class42.field642 - class12.field124) * 2.0D / (double) class179.field2513) + class76.field1066);
                                            class49.method320((int) ((double) (class294.field4625 - class287.field4543) * 2.0D / (double) class179.field2513) + class63.field864, (byte) -103);
                                        }
                                        continue;
                                    }
                                    class180.field2523 = 0;
                                    continue;
                                }
                                if (var9.field3062 == 1401) {
                                    if (var20) {
                                        class110.method709(var9.field3112, class12.field124 - var10, class287.field4543 - var11, var9.field3166, 124);
                                    }
                                    continue;
                                }
                                if (var9.field3062 == 1402) {
                                    class236.method1583(var9, 0);
                                    continue;
                                }
                            }
                            if (!var9.field3060 && var21) {
                                var9.field3060 = true;
                                if (var9.field3175 != null) {
                                    class27 var34 = new class27();
                                    var34.field350 = true;
                                    var34.field338 = var9;
                                    var34.field337 = class27.field344 - var10;
                                    var34.field348 = class81.field1112 - var11;
                                    var34.field341 = var9.field3175;
                                    class216.field3257.method988(var34, (byte) -77);
                                }
                            }
                            if (var9.field3060 && var20 && var9.field3105 != null) {
                                class27 var35 = new class27();
                                var35.field350 = true;
                                var35.field338 = var9;
                                var35.field337 = class12.field124 - var10;
                                var35.field348 = class287.field4543 - var11;
                                var35.field341 = var9.field3105;
                                class216.field3257.method988(var35, (byte) -77);
                            }
                            if (var9.field3060 && !var20) {
                                var9.field3060 = false;
                                if (var9.field3028 != null) {
                                    class27 var36 = new class27();
                                    var36.field350 = true;
                                    var36.field338 = var9;
                                    var36.field337 = class12.field124 - var10;
                                    var36.field348 = class287.field4543 - var11;
                                    var36.field341 = var9.field3028;
                                    class197.field2736.method988(var36, (byte) -77);
                                }
                            }
                            if (var20 && var9.field3020 != null) {
                                class27 var37 = new class27();
                                var37.field350 = true;
                                var37.field338 = var9;
                                var37.field337 = class12.field124 - var10;
                                var37.field348 = class287.field4543 - var11;
                                var37.field341 = var9.field3020;
                                class216.field3257.method988(var37, (byte) -77);
                            }
                            if (!var9.field3030 && var19) {
                                var9.field3030 = true;
                                if (var9.field3044 != null) {
                                    class27 var38 = new class27();
                                    var38.field350 = true;
                                    var38.field338 = var9;
                                    var38.field337 = class12.field124 - var10;
                                    var38.field348 = class287.field4543 - var11;
                                    var38.field341 = var9.field3044;
                                    class216.field3257.method988(var38, (byte) -77);
                                }
                            }
                            if (var9.field3030 && var19 && var9.field3064 != null) {
                                class27 var39 = new class27();
                                var39.field350 = true;
                                var39.field338 = var9;
                                var39.field337 = class12.field124 - var10;
                                var39.field348 = class287.field4543 - var11;
                                var39.field341 = var9.field3064;
                                class216.field3257.method988(var39, (byte) -77);
                            }
                            if (var9.field3030 && !var19) {
                                var9.field3030 = false;
                                if (var9.field3076 != null) {
                                    class27 var40 = new class27();
                                    var40.field350 = true;
                                    var40.field338 = var9;
                                    var40.field337 = class12.field124 - var10;
                                    var40.field348 = class287.field4543 - var11;
                                    var40.field341 = var9.field3076;
                                    class197.field2736.method988(var40, (byte) -77);
                                }
                            }
                            if (var9.field3024 != null) {
                                class27 var41 = new class27();
                                var41.field338 = var9;
                                var41.field341 = var9.field3024;
                                class145.field2020.method988(var41, (byte) -77);
                            }
                            if (var9.field3063 != null && class247.field3794 > var9.field3038) {
                                if (var9.field3108 == null || class247.field3794 - var9.field3038 > 32) {
                                    class27 var46 = new class27();
                                    var46.field338 = var9;
                                    var46.field341 = var9.field3063;
                                    class216.field3257.method988(var46, (byte) -77);
                                } else {
                                    label572: for (int var42 = var9.field3038; var42 < class247.field3794; var42++) {
                                        int var43 = class284.field4426[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field3108.length; var44++) {
                                            if (var9.field3108[var44] == var43) {
                                                class27 var45 = new class27();
                                                var45.field338 = var9;
                                                var45.field341 = var9.field3063;
                                                class216.field3257.method988(var45, (byte) -77);
                                                break label572;
                                            }
                                        }
                                    }
                                }
                                var9.field3038 = class247.field3794;
                            }
                            if (var9.field3078 != null && class28.field375 > var9.field3128) {
                                if (var9.field3039 == null || class28.field375 - var9.field3128 > 32) {
                                    class27 var51 = new class27();
                                    var51.field338 = var9;
                                    var51.field341 = var9.field3078;
                                    class216.field3257.method988(var51, (byte) -77);
                                } else {
                                    label548: for (int var47 = var9.field3128; var47 < class28.field375; var47++) {
                                        int var48 = class28.field361[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field3039.length; var49++) {
                                            if (var9.field3039[var49] == var48) {
                                                class27 var50 = new class27();
                                                var50.field338 = var9;
                                                var50.field341 = var9.field3078;
                                                class216.field3257.method988(var50, (byte) -77);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field3128 = class28.field375;
                            }
                            if (var9.field3168 != null && class179.field2508 > var9.field3092) {
                                if (var9.field3088 == null || class179.field2508 - var9.field3092 > 32) {
                                    class27 var56 = new class27();
                                    var56.field338 = var9;
                                    var56.field341 = var9.field3168;
                                    class216.field3257.method988(var56, (byte) -77);
                                } else {
                                    label524: for (int var52 = var9.field3092; var52 < class179.field2508; var52++) {
                                        int var53 = class211.field3072[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field3088.length; var54++) {
                                            if (var9.field3088[var54] == var53) {
                                                class27 var55 = new class27();
                                                var55.field338 = var9;
                                                var55.field341 = var9.field3168;
                                                class216.field3257.method988(var55, (byte) -77);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field3092 = class179.field2508;
                            }
                            if (var9.field3052 != null && class36.field554 > var9.field3158) {
                                if (var9.field3085 == null || class36.field554 - var9.field3158 > 32) {
                                    class27 var61 = new class27();
                                    var61.field338 = var9;
                                    var61.field341 = var9.field3052;
                                    class216.field3257.method988(var61, (byte) -77);
                                } else {
                                    label500: for (int var57 = var9.field3158; var57 < class36.field554; var57++) {
                                        int var58 = class116.field1659[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field3085.length; var59++) {
                                            if (var9.field3085[var59] == var58) {
                                                class27 var60 = new class27();
                                                var60.field338 = var9;
                                                var60.field341 = var9.field3052;
                                                class216.field3257.method988(var60, (byte) -77);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field3158 = class36.field554;
                            }
                            if (var9.field3033 != null && class241.field3692 > var9.field3120) {
                                if (var9.field3050 == null || class241.field3692 - var9.field3120 > 32) {
                                    class27 var66 = new class27();
                                    var66.field338 = var9;
                                    var66.field341 = var9.field3033;
                                    class216.field3257.method988(var66, (byte) -77);
                                } else {
                                    label476: for (int var62 = var9.field3120; var62 < class241.field3692; var62++) {
                                        int var63 = class256.field3920[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field3050.length; var64++) {
                                            if (var9.field3050[var64] == var63) {
                                                class27 var65 = new class27();
                                                var65.field338 = var9;
                                                var65.field341 = var9.field3033;
                                                class216.field3257.method988(var65, (byte) -77);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field3120 = class241.field3692;
                            }
                            if (class75.field1046 > var9.field3037 && var9.field3056 != null) {
                                class27 var67 = new class27();
                                var67.field338 = var9;
                                var67.field341 = var9.field3056;
                                class216.field3257.method988(var67, (byte) -77);
                            }
                            if (class66.field892 > var9.field3037 && var9.field3161 != null) {
                                class27 var68 = new class27();
                                var68.field338 = var9;
                                var68.field341 = var9.field3161;
                                class216.field3257.method988(var68, (byte) -77);
                            }
                            if (class154.field2131 > var9.field3037 && var9.field3179 != null) {
                                class27 var69 = new class27();
                                var69.field338 = var9;
                                var69.field341 = var9.field3179;
                                class216.field3257.method988(var69, (byte) -77);
                            }
                            if (class180.field2529 > var9.field3037 && var9.field3149 != null) {
                                class27 var70 = new class27();
                                var70.field338 = var9;
                                var70.field341 = var9.field3149;
                                class216.field3257.method988(var70, (byte) -77);
                            }
                            if (class7.field57 > var9.field3037 && var9.field3157 != null) {
                                class27 var71 = new class27();
                                var71.field338 = var9;
                                var71.field341 = var9.field3157;
                                class216.field3257.method988(var71, (byte) -77);
                            }
                            var9.field3037 = class35.field548;
                            if (var9.field3095 != null) {
                                for (int var72 = 0; var72 < class269.field4126; var72++) {
                                    class27 var73 = new class27();
                                    var73.field338 = var9;
                                    var73.field343 = class60.field850[var72];
                                    var73.field352 = class139.field1936[var72];
                                    var73.field341 = var9.field3095;
                                    class216.field3257.method988(var73, (byte) -77);
                                }
                            }
                            if (class295.field4646 && var9.field3115 != null) {
                                class27 var74 = new class27();
                                var74.field338 = var9;
                                var74.field341 = var9.field3115;
                                class216.field3257.method988(var74, (byte) -77);
                            }
                        }
                    }
                    if (!var9.field3011 && class208.field2967 == null && class52.field758 == null && !class15.field146) {
                        if ((var9.field3176 >= 0 || var9.field3139 != 0) && class12.field124 >= var12 && class287.field4543 >= var13 && class12.field124 < var14 && class287.field4543 < var15) {
                            if (var9.field3176 >= 0) {
                                class270.field4147 = arg0[var9.field3176];
                            } else {
                                class270.field4147 = var9;
                            }
                        }
                        if (var9.field3035 == 8 && class12.field124 >= var12 && class287.field4543 >= var13 && class12.field124 < var14 && class287.field4543 < var15) {
                            class206.field2884 = var9;
                        }
                        if (var9.field3146 > var9.field3166) {
                            class253.method1690(var9.field3146, class12.field124, var9, var11, -16, var9.field3166, class287.field4543, var9.field3112 + var10);
                        }
                    }
                    if (var9.field3035 == 0) {
                        method1044(arg0, var9.field3093, var12, var13, var14, var15, var10 - var9.field3066, var11 - var9.field3031);
                        if (var9.field3180 != null) {
                            method1044(var9.field3180, var9.field3093, var12, var13, var14, var15, var10 - var9.field3066, var11 - var9.field3031);
                        }
                        class56 var75 = (class56) class289.field4559.method23(216, (long) var9.field3093);
                        if (var75 != null) {
                            class198.method1264(var11, var13, var14, var12, var15, var10, var75.field808, true);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method904(byte arg0) {
        field2182++;
        method1048(50);
        class124.method816(-8781);
        class254.method1698(-17368);
        class172.method1131((byte) 125);
        class36.method241(123);
        class62.method379(98);
        class81.method510(true);
        class219.method1412(-32);
        class132.method892(-244);
        class13.method82(-113);
        class296.method1982(50);
        class200.method1275(0);
        class275.method1837(43);
        class224.method1438(255);
        class293.method1965(false);
        class94.method624((byte) 116);
        class9.method55((byte) 119);
        class39.method258(1);
        class168.method1105((byte) 103);
        class235.method1546(true);
        class174.method1144(-16777216);
        class54.method338((byte) 124);
        class86.method541((byte) -37);
        class140.method944((byte) 81);
        class278.method1859((byte) -120);
        class276.method1845(true);
        class211.method1367(0);
        class148.method998(113);
        class1.method3(117);
        class227.method1505((byte) 85);
        class77.method494(70);
        class208.method1353((byte) -125);
        class127.method858(39);
        class175.method1155((byte) -57);
        class144.method962(20076);
        class240.method1602(16025);
        class266.method1737(17);
        class89.method565(1);
        class111.method724(72);
        class215.method1400(-2);
        class284.method1912((byte) -66);
        class56.method347(-14649);
        class203.method1291((byte) 127);
        class171.method1117(0);
        class281.method1885(54);
        class154.method1027(true);
        class153.method1019((byte) -126);
        class159.method1060(false);
        class212.method1383(false);
        class103.method674(-109);
        class210.method1360((byte) 44);
        class145.method974((byte) -122);
        class242.method1626(7);
        class95.method636(16);
        class78.method501(19304);
        class33.method219((byte) -113);
        class2.method8(true);
        class282.method1896(256);
        class19.method145(54);
        class229.method1515((byte) -62);
        class192.method1228((byte) -67);
        class6.method38(-17994);
        class271.method1791();
        class120.method798((byte) 103);
        class32.method208(-23445);
        class18.method138();
        class236.method1582((byte) 101);
        class269.method1781(-7883);
        class11.method69(1);
        class178.method1164((byte) 19);
        class261.method1725((byte) -51);
        class44.method292((byte) 68);
        class126.method846();
        class61.method377(-1662);
        class52.method327((byte) -52);
        class267.method1764();
        class225.method1496((byte) 34);
        class205.method1304(false);
        class180.method1175(-108);
        class220.method1419();
        class7.method46((byte) 123);
        class287.method1934((byte) 23);
        class109.method701((byte) 118);
        class164.method1086(true);
        class64.method387();
        class65.method411((byte) 114);
        class222.method1430(-72);
        class230.method1522((byte) 56);
        class84.method523(86);
        class143.method959((byte) 127);
        class188.method1202((byte) 108);
        class102.method672(false);
        class35.method236((byte) -126);
        class241.method1618(-6986);
        class176.method1159(-29126);
        class288.method1942(10);
        class151.method1014(true);
        class191.method1222(7301);
        class216.method1406(0);
        class67.method419(65535);
        class130.method886();
        class137.method933(112);
        class74.method476((byte) -26);
        class93.method614((byte) -71);
        class59.method370((byte) -55);
        class255.method1708(84);
        class196.method1244();
        class295.method1976(7254);
        class41.method274(72);
        class85.method535(8);
        class40.method267(false);
        class206.method1310((byte) -59);
        class108.method695(false);
        class251.method1684(0);
        class34.method224(0);
        class258.method1721();
        class90.method581();
        class8.method54((byte) 33);
        class96.method638((byte) 27);
        class250.method1676(256);
        class234.method1544((byte) 118);
        class245.method1650(-401);
        class181.method1181((byte) -116);
        class82.method514(57);
        class107.method689((byte) -120);
        class264.method1730(-122);
        class268.method1770(20572);
        class198.method1267(22581);
        class173.method1132(0);
        class197.method1257(true);
        class228.method1509((byte) -128);
        class23.method167((byte) -90);
        class186.method1195(0);
        class66.method415((byte) -18);
        class106.method687();
        class142.method951(-36);
        class50.method322(-24876);
        class209.method1358();
        class237.method1589(true);
        class60.method374(-80);
        class195.method1236((byte) -118);
        class248.method1666(-115);
        class280.method1875(false);
        class69.method433((byte) -97);
        class71.method441(true);
        class204.method1296(22);
        class57.method352(5);
        class70.method438();
        class213.method1393(4363);
        class135.method915(-1);
        class286.method1930((byte) -114);
        class246.method1656(-1);
        class125.method819(0);
        class217.method1408(true);
        class123.method807(0);
        class47.method307(65535);
        class83.method516(20);
        class15.method89((byte) -59);
        class46.method304((byte) -104);
        class43.method289(true);
        class101.method671((byte) 84);
        class155.method1030((byte) 121);
        class158.method1051((byte) -99);
        class149.method1003(0);
        class48.method315(-120);
        class232.method1532(true);
        class161.method1071();
        class239.method1598((byte) -99);
        class92.method600(8937);
        class226.method1501((byte) 113);
        class119.method793((byte) -111);
        class20.method150(-28475);
        class291.method1953();
        class55.method346();
        class76.method487(1152644744);
        class105.method686((byte) -14);
        class177.method1160(61);
        class139.method941(291646527);
        class98.method649();
        class190.method1216();
        class273.method1821(-30572);
        class138.method936((byte) -53);
        class68.method426(-14332);
        class28.method185(true);
        class285.method1917(5681);
        class277.method1851(-4);
        class256.method1709((byte) -96);
        class257.method1716(-96);
        class214.method1395(0);
        class21.method152((byte) 89);
        class42.method279(-70);
        class122.method799(-17256);
        class49.method317(2);
        class75.method479(-50);
        class150.method1007(114);
        class265.method1734((byte) 66);
        class129.method884(-14782);
        class146.method983(1);
        class194.method1234((byte) 100);
        class104.method684(false);
        class202.method1278((byte) -37);
        class156.method1033(-126);
        class53.method332(-125);
        class165.method1090(24688);
        class297.method1988(false);
        class289.method1946((byte) -116);
        class10.method65(-116);
        if (arg0 >= -71) {
            field2180 = null;
        }
        class249.method1672((byte) -83);
        class114.method770(11452);
        class160.method1063((byte) -115);
        class17.method103(4080);
        class247.method1662((byte) -115);
        class179.method1173(false);
        class16.method97(2614);
        class238.method1597((byte) 80);
        class163.method1084(false);
        class252.method1686(2);
        class184.method1193(65536);
        class167.method1097(30165);
        class274.method1832((byte) 123);
        class193.method1230((byte) 65);
        class221.method1427((byte) 112);
        class131.method891(true);
        class283.method1899(16974);
        class116.method784((byte) 127);
        class233.method1536(-112);
        class5.method31(-87);
        class73.method462((byte) 27);
        class51.method326(false);
        class118.method790((byte) -95);
        class141.method949((byte) 91);
        class31.method199((byte) 106);
        class100.method656(110);
        class169.method1108(-98);
        class207.method1316((byte) -50);
        class79.method505(7);
        class199.method1268(55);
        class294.method1969(1000);
        class218.method1411(13518);
        class279.method1867(false);
        class63.method386((byte) -105);
        class30.method195((byte) 125);
        class231.method1523(20421);
        class87.method549(-104);
        class290.method1948(0);
        class253.method1693((byte) 89);
        class270.method1788(-82);
        class292.method1955((byte) -20);
        if (class132.field1891) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lse;)Z")
    public static final boolean method1045(class211 arg0) {
        if (class19.field269) {
            if (method1040(arg0).field2828 != 0) {
                return false;
            }
            if (arg0.field3035 == 0) {
                return false;
            }
        }
        return arg0.field3091;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method1046(int arg0) {
        field2197++;
        if (class95.field1346 < class214.field3229.field1338) {
            if (class56.field810 == class285.field4466) {
                class56.field810 = class198.field2766;
            } else {
                class56.field810 = class285.field4466;
            }
            class202.field2794 = (class214.field3229.field1338 - 1) * 50 * 5;
            if (class202.field2794 > 3000) {
                class202.field2794 = 3000;
            }
            if (class214.field3229.field1338 >= 2 && class214.field3229.field1339 == 6) {
                this.method894("js5connect_outofdate", (byte) -111);
                class79.field1097 = 1000;
                return;
            }
            if (class214.field3229.field1338 >= 4 && class214.field3229.field1339 == -1) {
                this.method894("js5crc", (byte) -102);
                class79.field1097 = 1000;
                return;
            }
            if (class214.field3229.field1338 >= 4 && (class79.field1097 == 0 || class79.field1097 == 5)) {
                if (class214.field3229.field1339 == 7 || class214.field3229.field1339 == 9) {
                    this.method894("js5connect_full", (byte) -66);
                } else if (class214.field3229.field1339 <= 0) {
                    this.method894("js5io", (byte) -67);
                } else {
                    this.method894("js5connect", (byte) -44);
                }
                class79.field1097 = 1000;
                return;
            }
        }
        class95.field1346 = class214.field3229.field1338;
        if (class202.field2794 > 0) {
            class202.field2794--;
            return;
        }
        try {
            if (class49.field714 == 0) {
                class159.field2218 = class200.field2784.method1637(class56.field810, false, class19.field273);
                class49.field714++;
            }
            if (class49.field714 == 1) {
                if (class159.field2218.field1663 == 2) {
                    this.method1039(true, 1000);
                    return;
                }
                if (class159.field2218.field1663 == 1) {
                    class49.field714++;
                }
            }
            if (arg0 < -25) {
                if (class49.field714 == 2) {
                    class280.field4341 = new class293((Socket) class159.field2218.field1665, class200.field2784);
                    class224 var2 = new class224(5);
                    var2.method1447(15, 17363472);
                    var2.method1435(-112, 535);
                    class280.field4341.method1967(var2.field3336, 0, 5, 0);
                    class49.field714++;
                    class48.field700 = class223.method1433((byte) -84);
                }
                if (class49.field714 == 3) {
                    if (class79.field1097 == 0 || class79.field1097 == 5 || class280.field4341.method1960(-1) > 0) {
                        int var3 = class280.field4341.method1959(-108);
                        if (var3 != 0) {
                            this.method1039(true, var3);
                            return;
                        }
                        class49.field714++;
                    } else if (class223.method1433((byte) -105) - class48.field700 > 30000L) {
                        this.method1039(true, 1001);
                        return;
                    }
                }
                if (class49.field714 == 4) {
                    boolean var4 = class79.field1097 == 5 || class79.field1097 == 10 || class79.field1097 == 28;
                    class214.field3229.method622(class280.field4341, !var4, -21503);
                    class280.field4341 = null;
                    class159.field2218 = null;
                    class49.field714 = 0;
                }
            }
        } catch (IOException var5) {
            this.method1039(true, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method893(int arg0) {
        field2183++;
        if (class79.field1097 == 1000) {
            return;
        }
        long var2 = class223.method1433((byte) 34) - class27.field346;
        class27.field346 = class223.method1433((byte) 0);
        boolean var4 = class273.method1822(0);
        if (var4 && class49.field709 && class139.field1933 != null) {
            class139.field1933.method848(1582);
        }
        if ((class79.field1097 == 30 || class79.field1097 == 10) && (class37.field562 || class273.field4222 != 0L && class273.field4222 < class223.method1433((byte) -88))) {
            class180.method1174(class37.field562, class30.field408, 102, class108.field1501, class89.method568(-20891));
        }
        if (class11.field110 == null) {
            Container var5;
            if (class11.field110 != null) {
                var5 = class11.field110;
            } else if (class17.field179 == null) {
                var5 = class200.field2784.field3715;
            } else {
                var5 = class17.field179;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class17.field179 == var5) {
                Insets var8 = class17.field179.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class33.field501 != var6 || field2194 != var7) {
                if (class244.field3728.startsWith("mac")) {
                    class33.field501 = var6;
                    field2194 = var7;
                } else {
                    class165.method1091((byte) -114);
                }
                class273.field4222 = class223.method1433((byte) 69) + 500L;
            }
        }
        int var9 = 26 % ((9 - arg0) / 34);
        boolean var10 = false;
        if (class210.field3001) {
            class210.field3001 = false;
            var10 = true;
        }
        if (var10) {
            class84.method524(-1);
        }
        if (class79.field1097 == 0) {
            class207.method1315(class215.field3250, class92.field1276, var10, (byte) 118, (Color) null);
        } else if (class79.field1097 == 5) {
            class114.method772(false, class54.field787, 2);
        } else if (class79.field1097 == 10) {
            class62.method382(false);
        } else if (class79.field1097 == 25 || class79.field1097 == 28) {
            if (class231.field3496 == 1) {
                if (class68.field934 > class193.field2658) {
                    class193.field2658 = class68.field934;
                }
                int var11 = (class193.field2658 - class68.field934) * 50 / class193.field2658;
                class22.method165(false, class13.field128 + "<br>(" + var11 + "%)", 1);
            } else if (class231.field3496 == 2) {
                if (class92.field1279 > class194.field2687) {
                    class194.field2687 = class92.field1279;
                }
                int var12 = ((class194.field2687 - class92.field1279) * 50 / class194.field2687) + 50;
                class22.method165(false, class13.field128 + "<br>(" + var12 + "%)", 1);
            } else {
                class22.method165(false, class13.field128, 1);
            }
        } else if (class79.field1097 == 30) {
            class9.method58(var2, -102);
        } else if (class79.field1097 == 40) {
            class22.method165(false, class73.field1003 + "<br>" + class235.field3565, 1);
        }
        if ((class79.field1097 == 30 || class79.field1097 == 10) && class193.field2669 == 0 && !var10) {
            try {
                Graphics var15 = class156.field2177.getGraphics();
                for (int var16 = 0; var16 < class265.field3979; var16++) {
                    if (class293.field4607[var16]) {
                        class207.field2889.method663(class123.field1713[var16], 100, var15, class150.field2074[var16], class101.field1420[var16], class118.field1670[var16]);
                        class293.field4607[var16] = false;
                    }
                }
            } catch (Exception var17) {
                class156.field2177.repaint();
            }
        } else if (class79.field1097 != 0) {
            try {
                Graphics var13 = class156.field2177.getGraphics();
                class207.field2889.method662(0, 0, (byte) -69, var13);
                for (int var14 = 0; var14 < class265.field3979; var14++) {
                    class293.field4607[var14] = false;
                }
            } catch (Exception var18) {
                class156.field2177.repaint();
            }
        }
        if (class240.field3660) {
            class171.method1120((byte) -123);
        }
        if (class235.field3553 && class79.field1097 == 10 && class212.field3193 != -1) {
            class235.field3553 = false;
            class7.method45(class200.field2784, (byte) 51);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method908(boolean arg0) {
        field2187++;
        if (class79.field1097 == 1000) {
            return;
        }
        class52.field740++;
        if (class52.field740 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class122.field1702 = var2.get(11) * 600 - (-(var2.get(12) * 10) - (var2.get(13) / 6));
            class48.field696.setSeed((long) class122.field1702);
        }
        this.method1041(arg0);
        if (class273.field4216 != null) {
            class273.field4216.method264((byte) -128);
        }
        class231.method1528(107);
        class156.method1038(false);
        class231.method1529(-101);
        class99.method655(arg0);
        if (class178.field2503 != null) {
            int var3 = class178.field2503.method2(-218);
            class215.field3248 = var3;
        }
        if (class79.field1097 == 0) {
            this.method1042(9017);
            class139.method942((byte) 113);
        } else if (class79.field1097 == 5) {
            this.method1042(9017);
            class139.method942((byte) -90);
        } else if (class79.field1097 == 25 || class79.field1097 == 28) {
            class210.method1362(26424);
        }
        if (class79.field1097 == 10) {
            this.method1043(5);
            class236.method1586((byte) -88);
            class6.method34(-3);
            class144.method970(0);
        } else if (class79.field1097 == 30) {
            class288.method1938((byte) -20);
        } else if (class79.field1097 == 40) {
            class144.method970(0);
            if (class274.field4241 != -3) {
                if (class274.field4241 == 15) {
                    class171.method1119(-120);
                    return;
                }
                if (class274.field4241 != 2) {
                    class22.method162((byte) -110);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
    private final void method1047(int arg0, byte[] arg1) {
        field2193++;
        if (arg0 != 30376) {
            return;
        }
        class224 var3 = new class224(arg1);
        while (true) {
            int var4 = var3.method1453((byte) -128);
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                var3.method1445(false);
                var3.method1445(false);
                var3.method1445(false);
                var3.method1445(false);
                var3.method1445(false);
                var3.method1445(false);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static void method1048(int arg0) {
        field2180 = null;
        if (arg0 < 33) {
            main((String[]) null);
        }
        field2186 = null;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method898(int arg0) {
        if (class54.field784 != null) {
            class54.field784.field2789 = false;
        }
        field2198++;
        if (arg0 != 1) {
            this.method904((byte) 5);
        }
        class54.field784 = null;
        if (class290.field4567 != null) {
            class290.field4567.method1958(5000);
            class290.field4567 = null;
        }
        class50.method321(class156.field2177, arg0 + 32);
        class253.method1691((byte) -43, class156.field2177);
        if (class178.field2503 != null) {
            class178.field2503.method6(class156.field2177, 22830);
        }
        class34.method233(32384);
        class116.method786(-1);
        class178.field2503 = null;
        if (class139.field1933 != null) {
            class139.field1933.method859(98);
        }
        if (class234.field3537 != null) {
            class234.field3537.method859(93);
        }
        class214.field3229.method629(true);
        class221.field3309.method56((byte) 15);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
    public static final void method1049(boolean arg0, int arg1) {
        if (arg0) {
            method1048(95);
        }
        field2190++;
        class280 var2 = class181.method1180(arg1, 0, 6);
        var2.method1871((byte) 26);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lse;)Lse;")
    public static final class211 method1050(class211 arg0) {
        int var1 = method1040(arg0).method1284(-1161391458);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class67.method421(arg0.field3127, 0);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method900(int arg0) {
        field2192++;
        class165.method1091((byte) 97);
        class221.field3309 = new class9();
        class214.field3229 = new class94();
        if (class160.field2247 != 0) {
            class35.field535 = new byte[50][];
        }
        class17.method99(arg0 ^ 0x36B6, class200.field2784);
        if (class34.field533 == 0) {
            class141.field1960 = this.getCodeBase().getHost();
            class43.field646 = 443;
            class140.field1951 = 43594;
        } else if (class34.field533 == 1) {
            class141.field1960 = this.getCodeBase().getHost();
            class140.field1951 = class213.field3203 + 40000;
            class43.field646 = class213.field3203 + 50000;
        } else if (class34.field533 == 2) {
            class140.field1951 = class213.field3203 + 40000;
            class141.field1960 = "127.0.0.1";
            class43.field646 = class213.field3203 + 50000;
        }
        class198.field2766 = class43.field646;
        class19.field273 = class141.field1960;
        if (class244.field3717 == 3 && class34.field533 != 2) {
            class13.field130 = class213.field3203;
        }
        class284.field4405 = class103.field1443 = class43.field648 = class282.field4367 = new short[arg0];
        class251.field3835 = class140.field1951;
        class285.field4466 = class140.field1951;
        class56.field810 = class251.field3835;
        if (class124.field1746 == 1) {
            class276.field4274 = class202.field2814;
            class273.field4202 = true;
            class199.field2767 = class53.field765;
            class248.field3795 = class13.field129;
            class11.field109 = class177.field2485;
        } else {
            class11.field109 = class87.field1183;
            class248.field3795 = class285.field4476;
            class199.field2767 = class188.field2598;
            class276.field4274 = class2.field9;
        }
        class174.method1146(true);
        class129.method885(arg0 - 257, class156.field2177);
        class137.method934((byte) -117, class156.field2177);
        class178.field2503 = class122.method803(16850);
        if (class178.field2503 != null) {
            class178.field2503.method4(class156.field2177, arg0 ^ 0x104);
        }
        class198.field2756 = class244.field3717;
        try {
            if (class200.field2784.field3732 != null) {
                class66.field901 = new class174(class200.field2784.field3732, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class288.field4551[var2] = new class174(class200.field2784.field3729[var2], 6000, 0);
                }
                class60.field847 = new class174(class200.field2784.field3725, 6000, 0);
                class36.field552 = new class54(255, class66.field901, class60.field847, 500000);
                class268.field4105 = new class174(class200.field2784.field3731, 24, 0);
                class200.field2784.field3729 = null;
                class200.field2784.field3731 = null;
                class200.field2784.field3725 = null;
                class200.field2784.field3732 = null;
            }
        } catch (IOException var3) {
            class36.field552 = null;
            class268.field4105 = null;
            class66.field901 = null;
            class60.field847 = null;
        }
        if (class34.field533 != 0) {
            class172.field2389 = true;
        }
        class245.field3750 = class277.field4291;
    }
}
