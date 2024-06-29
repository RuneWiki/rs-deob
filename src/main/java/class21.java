import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class21 extends class109 {

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public int field413 = -1;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "I")
    public int field424 = 0;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "Ldd;")
    private static class35 field416 = class180.method1196((byte) 126, "Walk here");

    @OriginalMember(owner = "client!c", name = "v", descriptor = "Ldd;")
    public static class35 field421 = field416;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
    public static int[] field422 = new int[50];

    @OriginalMember(owner = "client!c", name = "A", descriptor = "Ldd;")
    public static class35 field426 = class180.method1196((byte) -51, " loggt sich ein)3");

    @OriginalMember(owner = "client!c", name = "J", descriptor = "Ldd;")
    public static class35 field435 = class180.method1196((byte) 127, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!c", name = "o", descriptor = "Ldd;")
    public static class35 field414 = class180.method1196((byte) -91, "Hier wechseln");

    @OriginalMember(owner = "client!c", name = "H", descriptor = "I")
    public static int field433 = 1;

    @OriginalMember(owner = "client!c", name = "D", descriptor = "[Lnf;")
    public static class131[] field429 = new class131[5000];

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public int field415;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public int field417;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public int field420;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "I")
    public int field423;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "client!c", name = "B", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "I")
    public int field432;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "I")
    public int field434;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "I")
    public int field437;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)V")
    public static final void method189(boolean arg0, int arg1) {
        field431++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class34.field701[arg1];
        if (arg0) {
            field435 = null;
        }
        int var3 = class165.field3340[arg1];
        int var4 = class72.field1709[arg1];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        int var5 = (int) class143.field3001[arg1];
        long var6 = class143.field3001[arg1];
        if (var3 == 58) {
            boolean var8 = true;
            class55 var9 = class131.method903(609074640, var4);
            if (var9.field1299 > 0) {
                var8 = class54.method475((byte) -38, var9);
            }
            if (var8) {
                class1.field11.method659(112, true);
                class1.field11.method249(var4, 115);
                class184.field3779++;
            }
        }
        if (var3 == 33) {
            class121.method859(92);
        }
        if (var3 == 18) {
            boolean var10 = class55.method476(arg0, class71.field1704.field1605[0], 0, 0, false, var2, var4, 2, 0, class71.field1704.field1603[0], 0, 0);
            class52.field1177++;
            if (!var10) {
                class55.method476(false, class71.field1704.field1605[0], 1, 0, false, var2, var4, 2, 0, class71.field1704.field1603[0], 0, 1);
            }
            class110.field2427 = 2;
            class113.field2535 = 0;
            class170.field3399 = class134.field2859;
            class131.field2833 = class9.field187;
            class1.field11.method659(9, true);
            class1.field11.method264(class172.field3444 + var2, -128);
            class1.field11.method228(class67.field1552 + var4, 15358);
            class1.field11.method264(var5, -117);
        }
        if (var3 == 4) {
            class72.method574(class175.field3585, var2, var4);
        }
        if (var3 == 57 && class116.method841(var2, var6, var4, (byte) 55)) {
            class113.field2473++;
            class1.field11.method659(116, true);
            class1.field11.method228(var4 + class67.field1552, 15358);
            class1.field11.method264((int) (var6 >>> 32) & Integer.MAX_VALUE, -102);
            class1.field11.method246(var2 + class172.field3444, false);
            class1.field11.method220((byte) -119, class158.field3225);
            class1.field11.method246(class175.field3578, false);
            class1.field11.method228(class141.field2983, 15358);
        }
        if (var3 == 20) {
            class102 var12 = class51.field1154[var5];
            if (var12 != null) {
                class55.method476(false, class71.field1704.field1605[0], 1, 0, false, var12.field1603[0], var12.field1605[0], 2, 0, class71.field1704.field1603[0], 0, 1);
                class170.field3399 = class134.field2859;
                class131.field2833 = class9.field187;
                class110.field2427 = 2;
                class69.field1640++;
                class113.field2535 = 0;
                class1.field11.method659(226, true);
                class1.field11.method246(var5, false);
            }
        }
        if (var3 == 5) {
            class200.field4016++;
            class1.field11.method659(121, true);
            class1.field11.method246(var2, false);
            class1.field11.method254(true, var4);
            class1.field11.method246(var5, arg0);
            class9.field177 = 0;
            class52.field1186 = class131.method903(609074640, var4);
            class78.field1826 = var2;
        }
        if (var3 == 29) {
            class102 var13 = class51.field1154[var5];
            if (var13 != null) {
                class55.method476(false, class71.field1704.field1605[0], 1, 0, false, var13.field1603[0], var13.field1605[0], 2, 0, class71.field1704.field1603[0], 0, 1);
                class170.field3399 = class134.field2859;
                class131.field2833 = class9.field187;
                class113.field2535 = 0;
                class175.field3575++;
                class110.field2427 = 2;
                class1.field11.method659(243, true);
                class1.field11.method243(var5, -9440);
            }
        }
        if (var3 == 51) {
            class39.field861++;
            class1.field11.method659(61, true);
            class1.field11.method235(125, var4);
            class1.field11.method246(var5, false);
            class1.field11.method243(var2, -9440);
            class9.field177 = 0;
            class52.field1186 = class131.method903(609074640, var4);
            class78.field1826 = var2;
        }
        if (var3 == 8) {
            class3.field44++;
            class1.field11.method659(247, true);
            class1.field11.method264(var2, -117);
            class1.field11.method264(var5, -118);
            class1.field11.method249(var4, 108);
            class9.field177 = 0;
            class52.field1186 = class131.method903(609074640, var4);
            class78.field1826 = var2;
        }
        if (var3 == 38) {
            class200.field4008++;
            class1.field11.method659(68, true);
            class1.field11.method243(var5, -9440);
            class1.field11.method243(var2, -9440);
            class1.field11.method220((byte) -100, var4);
            class9.field177 = 0;
            class52.field1186 = class131.method903(609074640, var4);
            class78.field1826 = var2;
        }
        if (var3 == 9) {
            class1.field11.method659(20, true);
            class1.field11.method249(var4, -118);
            class1.field11.method228(var5, 15358);
            class1.field11.method243(var2, -9440);
            class9.field177 = 0;
            class52.field1186 = class131.method903(609074640, var4);
            class78.field1826 = var2;
            class161.field3276++;
        }
        if (var3 == 2 || var3 == 1007) {
            class51.method455(var5, var2, class183.field3756[arg1], var4, true);
        }
        if (var3 == 34) {
            class102 var14 = class51.field1154[var5];
            if (var14 != null) {
                class8.field142++;
                class55.method476(false, class71.field1704.field1605[0], 1, 0, false, var14.field1603[0], var14.field1605[0], 2, 0, class71.field1704.field1603[0], 0, 1);
                class110.field2427 = 2;
                class131.field2833 = class9.field187;
                class170.field3399 = class134.field2859;
                class113.field2535 = 0;
                class1.field11.method659(66, true);
                class1.field11.method228(class175.field3578, 15358);
                class1.field11.method228(class141.field2983, 15358);
                class1.field11.method228(var5, 15358);
                class1.field11.method220((byte) -76, class158.field3225);
            }
        }
        if (var3 == 49) {
            boolean var15 = class55.method476(false, class71.field1704.field1605[0], 0, 0, false, var2, var4, 2, 0, class71.field1704.field1603[0], 0, 0);
            if (!var15) {
                class55.method476(false, class71.field1704.field1605[0], 1, 0, false, var2, var4, 2, 0, class71.field1704.field1603[0], 0, 1);
            }
            class113.field2535 = 0;
            class170.field3399 = class134.field2859;
            class110.field2427 = 2;
            class58.field1462++;
            class131.field2833 = class9.field187;
            class1.field11.method659(155, true);
            class1.field11.method264(var5, -128);
            class1.field11.method264(var2 + class172.field3444, -126);
            class1.field11.method243(class67.field1552 + var4, -9440);
        }
        if (var3 == 11) {
            boolean var17 = class55.method476(false, class71.field1704.field1605[0], 0, 0, false, var2, var4, 2, 0, class71.field1704.field1603[0], 0, 0);
            if (!var17) {
                class55.method476(arg0, class71.field1704.field1605[0], 1, 0, false, var2, var4, 2, 0, class71.field1704.field1603[0], 0, 1);
            }
            class170.field3399 = class134.field2859;
            class113.field2535 = 0;
            class110.field2427 = 2;
            class131.field2833 = class9.field187;
            class19.field362++;
            class1.field11.method659(252, true);
            class1.field11.method228(class67.field1552 + var4, 15358);
            class1.field11.method264(var2 + class172.field3444, -112);
            class1.field11.method246(class141.field2983, false);
            class1.field11.method249(class158.field3225, -90);
            class1.field11.method264(var5, -117);
            class1.field11.method228(class175.field3578, 15358);
        }
        if (var3 == 1002) {
            class167.field3372++;
            class113.field2535 = 0;
            class110.field2427 = 2;
            class170.field3399 = class134.field2859;
            class131.field2833 = class9.field187;
            class1.field11.method659(176, true);
            class1.field11.method243(var5, -9440);
        }
        if (var3 == 45) {
            class19 var19 = class204.field4058[var5];
            if (var19 != null) {
                class157.field3203++;
                class55.method476(false, class71.field1704.field1605[0], 1, 0, false, var19.field1603[0], var19.field1605[0], 2, 0, class71.field1704.field1603[0], 0, 1);
                class170.field3399 = class134.field2859;
                class113.field2535 = 0;
                class110.field2427 = 2;
                class131.field2833 = class9.field187;
                class1.field11.method659(220, !arg0);
                class1.field11.method228(var5, 15358);
            }
        }
        if (var3 == 15) {
            class205.field4066++;
            class116.method841(var2, var6, var4, (byte) 84);
            class1.field11.method659(92, !arg0);
            class1.field11.method243(Integer.MAX_VALUE & (int) (var6 >>> 32), -9440);
            class1.field11.method228(class172.field3444 + var2, 15358);
            class1.field11.method243(class67.field1552 + var4, -9440);
        }
        if (var3 == 47) {
            class102 var20 = class51.field1154[var5];
            if (var20 != null) {
                class55.method476(arg0, class71.field1704.field1605[0], 1, 0, false, var20.field1603[0], var20.field1605[0], 2, 0, class71.field1704.field1603[0], 0, 1);
                class131.field2833 = class9.field187;
                class93.field2057++;
                class113.field2535 = 0;
                class170.field3399 = class134.field2859;
                class110.field2427 = 2;
                class1.field11.method659(69, !arg0);
                class1.field11.method228(var5, 15358);
            }
        }
        if (var3 == 32) {
            class102 var21 = class51.field1154[var5];
            if (var21 != null) {
                class55.method476(false, class71.field1704.field1605[0], 1, 0, false, var21.field1603[0], var21.field1605[0], 2, 0, class71.field1704.field1603[0], 0, 1);
                class113.field2535 = 0;
                class7.field111++;
                class170.field3399 = class134.field2859;
                class131.field2833 = class9.field187;
                class110.field2427 = 2;
                class1.field11.method659(13, true);
                class1.field11.method264(var5, -105);
            }
        }
        if (var3 == 24) {
            class102 var22 = class51.field1154[var5];
            if (var22 != null) {
                class98.field2165++;
                class55.method476(false, class71.field1704.field1605[0], 1, 0, false, var22.field1603[0], var22.field1605[0], 2, 0, class71.field1704.field1603[0], 0, 1);
                class110.field2427 = 2;
                class170.field3399 = class134.field2859;
                class131.field2833 = class9.field187;
                class113.field2535 = 0;
                class1.field11.method659(196, true);
                class1.field11.method246(var5, false);
            }
        }
        if (var3 == 48) {
            class116.method841(var2, var6, var4, (byte) 56);
            class170.field3401++;
            class1.field11.method659(74, !arg0);
            class1.field11.method246(Integer.MAX_VALUE & (int) (var6 >>> 32), false);
            class1.field11.method243(var2 + class172.field3444, -9440);
            class1.field11.method243(class67.field1552 + var4, -9440);
        }
        if (var3 == 30 && class101.field2218 == null) {
            class116.method842(var4, (byte) 1, var2);
            class101.field2218 = class19.method171((byte) -120, var4, var2);
            class137.method937(class101.field2218, (byte) -85);
        }
        if (var3 == 42) {
            class1.field11.method659(157, true);
            class1.field11.method249(var4, 95);
            class1.field11.method228(var5, 15358);
            class1.field11.method264(var2, -122);
            class9.field177 = 0;
            class52.field1186 = class131.method903(609074640, var4);
            class128.field2767++;
            class78.field1826 = var2;
        }
        if (var3 == 50) {
            class102 var23 = class51.field1154[var5];
            if (var23 != null) {
                class55.method476(false, class71.field1704.field1605[0], 1, 0, false, var23.field1603[0], var23.field1605[0], 2, 0, class71.field1704.field1603[0], 0, 1);
                class170.field3399 = class134.field2859;
                class110.field2427 = 2;
                class113.field2535 = 0;
                class131.field2833 = class9.field187;
                class1.field11.method659(118, !arg0);
                class102.field2266++;
                class1.field11.method228(var5, 15358);
            }
        }
        if (var3 == 12) {
            class113.field2511++;
            class1.field11.method659(42, true);
            class1.field11.method228(var2, 15358);
            class1.field11.method228(class29.field592, 15358);
            class1.field11.method254(true, var4);
            class1.field11.method254(!arg0, class176.field3596);
        }
        if (var3 == 7) {
            class19 var24 = class204.field4058[var5];
            if (var24 != null) {
                class55.method476(false, class71.field1704.field1605[0], 1, 0, false, var24.field1603[0], var24.field1605[0], 2, 0, class71.field1704.field1603[0], 0, 1);
                class113.field2535 = 0;
                class88.field1968++;
                class170.field3399 = class134.field2859;
                class131.field2833 = class9.field187;
                class110.field2427 = 2;
                class1.field11.method659(249, true);
                class1.field11.method243(var5, -9440);
            }
        }
        if (var3 == 13) {
            class34.field698++;
            class1.field11.method659(111, !arg0);
            class1.field11.method243(var5, -9440);
            class1.field11.method246(var2, false);
            class1.field11.method235(42, var4);
            class9.field177 = 0;
            class52.field1186 = class131.method903(609074640, var4);
            class78.field1826 = var2;
        }
        if (var3 == 28) {
            class15.field268++;
            class1.field11.method659(142, true);
            class1.field11.method264(var5, -113);
            class1.field11.method220((byte) -57, var4);
            class1.field11.method264(var2, -103);
            class9.field177 = 0;
            class52.field1186 = class131.method903(609074640, var4);
            class78.field1826 = var2;
        }
        if (var3 == 6) {
            class19 var25 = class204.field4058[var5];
            if (var25 != null) {
                class141.field2977++;
                class55.method476(false, class71.field1704.field1605[0], 1, 0, false, var25.field1603[0], var25.field1605[0], 2, 0, class71.field1704.field1603[0], 0, 1);
                class170.field3399 = class134.field2859;
                class131.field2833 = class9.field187;
                class110.field2427 = 2;
                class113.field2535 = 0;
                class1.field11.method659(47, true);
                class1.field11.method243(var5, -9440);
            }
        }
        if (var3 == 1006) {
            class110.field2427 = 2;
            class170.field3399 = class134.field2859;
            class131.field2833 = class9.field187;
            class113.field2535 = 0;
            class19 var26 = class204.field4058[var5];
            if (var26 != null) {
                class182 var27 = var26.field377;
                if (var27.field3719 != null) {
                    var27 = var27.method1211(101);
                }
                if (var27 != null) {
                    class36.field791++;
                    class1.field11.method659(59, true);
                    class1.field11.method264(var27.field3752, -126);
                }
            }
        }
        if (var3 == 41) {
            boolean var28 = class55.method476(false, class71.field1704.field1605[0], 0, 0, false, var2, var4, 2, 0, class71.field1704.field1603[0], 0, 0);
            if (!var28) {
                class55.method476(arg0, class71.field1704.field1605[0], 1, 0, false, var2, var4, 2, 0, class71.field1704.field1603[0], 0, 1);
            }
            class131.field2833 = class9.field187;
            class110.field2427 = 2;
            class50.field1101++;
            class170.field3399 = class134.field2859;
            class113.field2535 = 0;
            class1.field11.method659(26, true);
            class1.field11.method249(class176.field3596, 72);
            class1.field11.method264(class29.field592, -99);
            class1.field11.method246(var2 + class172.field3444, false);
            class1.field11.method246(class67.field1552 + var4, false);
            class1.field11.method246(var5, false);
        }
        if (var3 == 16) {
            class19 var30 = class204.field4058[var5];
            if (var30 != null) {
                class55.method476(arg0, class71.field1704.field1605[0], 1, 0, false, var30.field1603[0], var30.field1605[0], 2, 0, class71.field1704.field1603[0], 0, 1);
                class131.field2833 = class9.field187;
                class170.field3399 = class134.field2859;
                class113.field2535 = 0;
                class110.field2427 = 2;
                class1.field11.method659(79, true);
                class1.field11.method243(var5, -9440);
                class1.field11.method243(class29.field592, -9440);
                class1.field11.method249(class176.field3596, -111);
                class55.field1241++;
            }
        }
        if (var3 == 39) {
            class102 var31 = class51.field1154[var5];
            if (var31 != null) {
                class55.method476(arg0, class71.field1704.field1605[0], 1, 0, false, var31.field1603[0], var31.field1605[0], 2, 0, class71.field1704.field1603[0], 0, 1);
                class58.field1457++;
                class170.field3399 = class134.field2859;
                class131.field2833 = class9.field187;
                class113.field2535 = 0;
                class110.field2427 = 2;
                class1.field11.method659(138, true);
                class1.field11.method246(var5, false);
            }
        }
        if (var3 == 26) {
            class102 var32 = class51.field1154[var5];
            if (var32 != null) {
                class55.method476(arg0, class71.field1704.field1605[0], 1, 0, false, var32.field1603[0], var32.field1605[0], 2, 0, class71.field1704.field1603[0], 0, 1);
                class100.field2209++;
                class170.field3399 = class134.field2859;
                class110.field2427 = 2;
                class131.field2833 = class9.field187;
                class113.field2535 = 0;
                class1.field11.method659(225, true);
                class1.field11.method264(var5, -103);
            }
        }
        if (var3 == 14) {
            class107.field2380++;
            class116.method841(var2, var6, var4, (byte) 114);
            class1.field11.method659(171, true);
            class1.field11.method243(class67.field1552 + var4, -9440);
            class1.field11.method228(Integer.MAX_VALUE & (int) (var6 >>> 32), 15358);
            class1.field11.method243(class172.field3444 + var2, -9440);
        }
        if (var3 == 19) {
            boolean var33 = class55.method476(arg0, class71.field1704.field1605[0], 0, 0, false, var2, var4, 2, 0, class71.field1704.field1603[0], 0, 0);
            if (!var33) {
                class55.method476(arg0, class71.field1704.field1605[0], 1, 0, false, var2, var4, 2, 0, class71.field1704.field1603[0], 0, 1);
            }
            class113.field2535 = 0;
            class131.field2833 = class9.field187;
            class170.field3399 = class134.field2859;
            class110.field2427 = 2;
            class154.field3169++;
            class1.field11.method659(136, true);
            class1.field11.method243(class67.field1552 + var4, -9440);
            class1.field11.method228(class172.field3444 + var2, 15358);
            class1.field11.method243(var5, -9440);
        }
        if (var3 == 10) {
            class1.field11.method659(32, true);
            class1.field11.method243(var2, -9440);
            class1.field11.method249(var4, -86);
            class107.field2383++;
            class1.field11.method246(var5, arg0);
            class9.field177 = 0;
            class52.field1186 = class131.method903(609074640, var4);
            class78.field1826 = var2;
        }
        if (var3 == 36) {
            class19 var35 = class204.field4058[var5];
            if (var35 != null) {
                class55.method476(arg0, class71.field1704.field1605[0], 1, 0, false, var35.field1603[0], var35.field1605[0], 2, 0, class71.field1704.field1603[0], 0, 1);
                class170.field3399 = class134.field2859;
                class91.field2030++;
                class110.field2427 = 2;
                class131.field2833 = class9.field187;
                class113.field2535 = 0;
                class1.field11.method659(34, true);
                class1.field11.method246(var5, false);
            }
        }
        if (var3 == 43) {
            class19 var36 = class204.field4058[var5];
            if (var36 != null) {
                class54.field1228++;
                class55.method476(false, class71.field1704.field1605[0], 1, 0, false, var36.field1603[0], var36.field1605[0], 2, 0, class71.field1704.field1603[0], 0, 1);
                class113.field2535 = 0;
                class170.field3399 = class134.field2859;
                class110.field2427 = 2;
                class131.field2833 = class9.field187;
                class1.field11.method659(140, true);
                class1.field11.method228(var5, 15358);
            }
        }
        if (var3 == 35) {
            class116.method841(var2, var6, var4, (byte) 51);
            class39.field863++;
            class1.field11.method659(40, true);
            class1.field11.method228(class67.field1552 + var4, 15358);
            class1.field11.method264((int) (var6 >>> 32) & Integer.MAX_VALUE, -115);
            class1.field11.method246(class172.field3444 + var2, false);
        }
        if (var3 == 22) {
            class184.field3779++;
            class1.field11.method659(112, true);
            class1.field11.method249(var4, 64);
            class55 var37 = class131.method903(609074640, var4);
            if (var37.field1288 != null && var37.field1288[0][0] == 5) {
                int var38 = var37.field1288[0][1];
                if (class115.field2557[var38] != var37.field1325[0]) {
                    class115.field2557[var38] = var37.field1325[0];
                    class163.method1080((byte) 101, var38);
                }
            }
        }
        if (var3 == 37) {
            class1.field11.method659(112, true);
            class1.field11.method249(var4, 102);
            class55 var39 = class131.method903(609074640, var4);
            if (var39.field1288 != null && var39.field1288[0][0] == 5) {
                int var40 = var39.field1288[0][1];
                class115.field2557[var40] = 1 - class115.field2557[var40];
                class163.method1080((byte) 123, var40);
            }
            class184.field3779++;
        }
        if (var3 == 1005) {
            class170.field3399 = class134.field2859;
            class131.field2833 = class9.field187;
            class1.field7++;
            class110.field2427 = 2;
            class113.field2535 = 0;
            class1.field11.method659(122, !arg0);
            class1.field11.method228(var5, 15358);
        }
        if (var3 == 23) {
            class102 var41 = class51.field1154[var5];
            if (var41 != null) {
                class121.field2655++;
                class55.method476(false, class71.field1704.field1605[0], 1, 0, false, var41.field1603[0], var41.field1605[0], 2, 0, class71.field1704.field1603[0], 0, 1);
                class131.field2833 = class9.field187;
                class170.field3399 = class134.field2859;
                class110.field2427 = 2;
                class113.field2535 = 0;
                class1.field11.method659(90, true);
                class1.field11.method243(class29.field592, -9440);
                class1.field11.method220((byte) -121, class176.field3596);
                class1.field11.method243(var5, -9440);
            }
        }
        if (var3 == 40 && class116.method841(var2, var6, var4, (byte) 85)) {
            class1.field11.method659(187, true);
            class101.field2247++;
            class1.field11.method264((int) (var6 >>> 32) & Integer.MAX_VALUE, -101);
            class1.field11.method246(class29.field592, false);
            class1.field11.method220((byte) -47, class176.field3596);
            class1.field11.method246(class67.field1552 + var4, false);
            class1.field11.method264(class172.field3444 + var2, -107);
        }
        if (var3 == 21) {
            class43.field938++;
            boolean var42 = class55.method476(false, class71.field1704.field1605[0], 0, 0, false, var2, var4, 2, 0, class71.field1704.field1603[0], 0, 0);
            if (!var42) {
                class55.method476(false, class71.field1704.field1605[0], 1, 0, false, var2, var4, 2, 0, class71.field1704.field1603[0], 0, 1);
            }
            class131.field2833 = class9.field187;
            class110.field2427 = 2;
            class170.field3399 = class134.field2859;
            class113.field2535 = 0;
            class1.field11.method659(190, !arg0);
            class1.field11.method228(var5, 15358);
            class1.field11.method246(class67.field1552 + var4, false);
            class1.field11.method246(class172.field3444 + var2, false);
        }
        if (var3 == 31) {
            class55 var44 = class19.method171((byte) 21, var4, var2);
            if (var44 != null) {
                class74.method587(18);
                class126.method888(var4, (byte) -24, class60.method513(class59.method508(var44, (byte) 32), -91), var2);
                class128.field2765 = 0;
                class125.field2736 = method190(1, var44);
                if (class125.field2736 == null) {
                    class125.field2736 = class120.field2639;
                }
                if (!var44.field1291) {
                    class165.field3343 = class63.method529(new class35[] { class84.field1925, var44.field1271, class115.field2569 }, (byte) 72);
                    return;
                }
                class165.field3343 = class63.method529(new class35[] { var44.field1263, class115.field2569 }, (byte) 53);
            }
            return;
        }
        if (var3 == 17) {
            class1.field11.method659(83, true);
            class136.field2913++;
            class1.field11.method228(var5, 15358);
            class1.field11.method249(var4, -86);
            class1.field11.method243(class29.field592, -9440);
            class1.field11.method254(true, class176.field3596);
            class1.field11.method246(var2, false);
            class9.field177 = 0;
            class52.field1186 = class131.method903(609074640, var4);
            class78.field1826 = var2;
        }
        if (var3 == 1004) {
            class55 var45 = class131.method903(609074640, var4);
            if (var45 == null || var45.field1242[var2] < 100000) {
                class1.field7++;
                class1.field11.method659(122, true);
                class1.field11.method228(var5, 15358);
            } else {
                class190.method1252(class20.field387, 0, class63.method529(new class35[] { class3.method19(var45.field1242[var2], -29578), class93.field2054, class207.method1370((byte) -73, var5).field995 }, (byte) 89), 0);
            }
            class9.field177 = 0;
            class52.field1186 = class131.method903(609074640, var4);
            class78.field1826 = var2;
        }
        if (var3 == 1) {
            class19 var46 = class204.field4058[var5];
            if (var46 != null) {
                class96.field2117++;
                class55.method476(false, class71.field1704.field1605[0], 1, 0, false, var46.field1603[0], var46.field1605[0], 2, 0, class71.field1704.field1603[0], 0, 1);
                class131.field2833 = class9.field187;
                class170.field3399 = class134.field2859;
                class113.field2535 = 0;
                class110.field2427 = 2;
                class1.field11.method659(128, true);
                class1.field11.method228(var5, 15358);
                class1.field11.method254(true, class158.field3225);
                class1.field11.method243(class175.field3578, -9440);
                class1.field11.method246(class141.field2983, false);
            }
        }
        if (var3 == 1003) {
            class116.method841(var2, var6, var4, (byte) 54);
            class1.field11.method659(248, !arg0);
            class1.field11.method246(class172.field3444 + var2, false);
            class141.field2985++;
            class1.field11.method264(class67.field1552 + var4, -120);
            class1.field11.method228(Integer.MAX_VALUE & (int) (var6 >>> 32), 15358);
        }
        if (var3 == 44) {
            class102.field2269++;
            class1.field11.method659(25, true);
            class1.field11.method235(87, var4);
            class1.field11.method246(var2, arg0);
            class1.field11.method243(var5, -9440);
            class9.field177 = 0;
            class52.field1186 = class131.method903(609074640, var4);
            class78.field1826 = var2;
        }
        if (var3 == 3) {
            class1.field11.method659(132, !arg0);
            class1.field11.method243(var2, -9440);
            class122.field2677++;
            class1.field11.method243(class141.field2983, -9440);
            class1.field11.method235(98, class158.field3225);
            class1.field11.method264(class175.field3578, -119);
            class1.field11.method246(var5, false);
            class1.field11.method254(true, var4);
            class9.field177 = 0;
            class52.field1186 = class131.method903(609074640, var4);
            class78.field1826 = var2;
        }
        if (var3 == 46) {
            boolean var47 = class55.method476(false, class71.field1704.field1605[0], 0, 0, false, var2, var4, 2, 0, class71.field1704.field1603[0], 0, 0);
            class134.field2853++;
            if (!var47) {
                class55.method476(arg0, class71.field1704.field1605[0], 1, 0, false, var2, var4, 2, 0, class71.field1704.field1603[0], 0, 1);
            }
            class131.field2833 = class9.field187;
            class113.field2535 = 0;
            class110.field2427 = 2;
            class170.field3399 = class134.field2859;
            class1.field11.method659(80, true);
            class1.field11.method246(var5, false);
            class1.field11.method243(class67.field1552 + var4, -9440);
            class1.field11.method264(class172.field3444 + var2, -111);
        }
        if (var3 != 25) {
            if (class128.field2765 != 0) {
                class128.field2765 = 0;
                class137.method937(class131.method903(609074640, class158.field3225), (byte) -85);
            }
            if (class130.field2799) {
                class74.method587(58);
            }
            if (class52.field1186 != null && class9.field177 == 0) {
                class137.method937(class52.field1186, (byte) -85);
            }
            return;
        }
        class74.method587(-127);
        class55 var49 = class131.method903(609074640, var4);
        class128.field2765 = 1;
        class141.field2983 = var5;
        class175.field3578 = var2;
        class158.field3225 = var4;
        class137.method937(var49, (byte) -85);
        class159.field3233 = class63.method529(new class35[] { class208.field4133, class207.method1370((byte) -73, var5).field995, class115.field2569 }, (byte) 119);
        if (class159.field3233 == null) {
            class159.field3233 = class4.field80;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILfd;)Ldd;")
    public static final class35 method190(int arg0, class55 arg1) {
        if (arg0 != 1) {
            field422 = null;
        }
        field427++;
        if (class60.method513(class59.method508(arg1, (byte) 32), -91) == 0) {
            return null;
        } else if (arg1.field1369 == null || arg1.field1369.method340(-122).method347((byte) -103) == 0) {
            return class207.field4117 ? class88.field1961 : null;
        } else {
            return arg1.field1369;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Z")
    public static final boolean method191(int arg0, int arg1) {
        field418++;
        if (arg1 != -7914) {
            method195((byte) -41);
        }
        return (arg0 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
    public static final void method192(int arg0) {
        field430++;
        class131.field2823.method813(-127);
        if (arg0 != 0) {
            method194((byte) 119);
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)Lda;")
    public static final class32 method193(int arg0) {
        if (class9.field191 == null) {
            class9.field191 = new class32();
        }
        if (arg0 == 42) {
            field438++;
            return class9.field191;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
    public static void method194(byte arg0) {
        field421 = null;
        field422 = null;
        field414 = null;
        if (arg0 < -40) {
            field429 = null;
            field416 = null;
            field426 = null;
            field435 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(B)V")
    public static final void method195(byte arg0) {
        class31.field639.method813(-122);
        if (arg0 <= 37) {
            field422 = null;
        }
        field419++;
    }
}
