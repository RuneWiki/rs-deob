import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class83 extends class170 {

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field1197 = new String[200];

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "Llc;")
    public static class218 field1194 = null;

    @OriginalMember(owner = "client!uo", name = "t", descriptor = "[I")
    public static int[] field1199 = new int[2];

    @OriginalMember(owner = "client!uo", name = "x", descriptor = "Ljava/lang/String;")
    public static String field1203 = null;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!uo", name = "v", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!uo", name = "w", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!uo", name = "y", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!uo", name = "A", descriptor = "Lho;")
    public static class215 field1206;

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "Luo;")
    public class83 field1195;

    @OriginalMember(owner = "client!uo", name = "u", descriptor = "Luo;")
    public class83 field1200;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)V", line = 8)
    public final void method743(byte arg0) {
        if (arg0 <= 93) {
            return;
        }
        field1196++;
        if (this.field1195 != null) {
            this.field1195.field1200 = this.field1200;
            this.field1200.field1195 = this.field1195;
            this.field1195 = null;
            this.field1200 = null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lph;B)V", line = 32)
    public static final void method744(class169 arg0, byte arg1) {
        arg0.field2677 = false;
        if (arg0.field2679 != null) {
            arg0.field2679.field1164 = 0;
        }
        field1198++;
        for (class169 var2 = arg0.method61(); var2 != null; var2 = arg0.method81()) {
            method744(var2, (byte) 99);
        }
        if (arg1 <= 51) {
            method749();
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIII)V", line = 55)
    public static final void method745(int arg0, int arg1, int arg2, int arg3) {
        class138 var4 = class149.method1242(arg3, 0, 11);
        if (arg0 > 31) {
            field1204++;
            var4.method1153((byte) 50);
            var4.field2293 = arg1;
            var4.field2282 = arg2;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZI)V", line = 70)
    public static final void method746(boolean arg0, int arg1) {
        field1202++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class41.field654[arg1];
        int var3 = class90.field1278[arg1];
        int var4 = class356.field5670[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        long var5 = class356.field5669[arg1];
        int var7 = (int) class356.field5669[arg1];
        if (var4 == 6) {
            class244 var8 = class110.field1683[var7];
            if (var8 != null) {
                class317.field4886++;
                class315.field4867 = class305.field4745;
                class317.field4884 = 2;
                class204.field3155 = class254.field3916;
                class321.field4943 = 0;
                class99.field1491.method1628((byte) -31, 231);
                class99.field1491.method273(0, class116.field1774[82] ? 1 : 0);
                class99.field1491.method258(var7, (byte) 78);
                class191.method1461(true, class173.field2746.field1300[0], 0, 0, var8.method808(-38), class173.field2746.field1290[0], var2, 0, var8.method808(-37), var3, (byte) 116);
            }
        }
        if (var4 == 50) {
            class171 var9 = class177.field2795[var7];
            if (var9 != null) {
                class315.field4867 = class305.field4745;
                class317.field4884 = 2;
                class44.field710++;
                class204.field3155 = class254.field3916;
                class321.field4943 = 0;
                class99.field1491.method1628((byte) -29, 180);
                class99.field1491.method263(var7, false);
                class99.field1491.method285(0, class116.field1774[82] ? 1 : 0);
                class191.method1461(true, class173.field2746.field1300[0], 0, 0, var9.method808(120), class173.field2746.field1290[0], var2, 0, var9.method808(102), var3, (byte) 123);
            }
        }
        if (var4 == 34) {
            class317.field4884 = 2;
            class173.field2750++;
            class321.field4943 = 0;
            class204.field3155 = class254.field3916;
            class315.field4867 = class305.field4745;
            class99.field1491.method1628((byte) -114, 117);
            class99.field1491.method315(class45.field719, 116);
            class99.field1491.method306(class18.field280, 124);
            class99.field1491.method285(0, class116.field1774[82] ? 1 : 0);
            class99.field1491.method306(class358.field5696 + var2, 125);
            class99.field1491.method304(!arg0, class33.field506);
            class99.field1491.method304(false, class49.field755 + var3);
            class99.field1491.method306((int) (var5 >>> 32) & Integer.MAX_VALUE, 125);
            class211.method1560(var3, var2, -97, var5);
        }
        if (var4 == 11) {
            class194.method1477(227670764);
        }
        if (var4 == 25) {
            class204.field3155 = class254.field3916;
            class321.field4943 = 0;
            class315.field4867 = class305.field4745;
            class317.field4884 = 2;
            class139.field2299++;
            class99.field1491.method1628((byte) -75, 46);
            class99.field1491.method263(var7, !arg0);
            class99.field1491.method304(false, class358.field5696 + var2);
            class99.field1491.method285(0, class116.field1774[82] ? 1 : 0);
            class99.field1491.method263(var3 + class49.field755, !arg0);
            class191.method1461(true, class173.field2746.field1300[0], 0, 0, 0, class173.field2746.field1290[0], var2, 0, 0, var3, (byte) 117);
        }
        if (var4 == 39) {
            class321.field4943 = 0;
            class304.field4732++;
            class315.field4867 = class305.field4745;
            class317.field4884 = 2;
            class204.field3155 = class254.field3916;
            class99.field1491.method1628((byte) -12, 154);
            class99.field1491.method263(var7, false);
            class99.field1491.method252(class259.field3969, -126);
            class99.field1491.method263(class270.field4155, false);
            class99.field1491.method263(class358.field5696 + var2, false);
            class99.field1491.method258(class49.field755 + var3, (byte) 78);
            class99.field1491.method278(-14598, class116.field1774[82] ? 1 : 0);
            class191.method1461(true, class173.field2746.field1300[0], 0, 0, 0, class173.field2746.field1290[0], var2, 0, 0, var3, (byte) -120);
        }
        if (var4 == 37) {
            class244 var10 = class110.field1683[var7];
            if (var10 != null) {
                class321.field4943 = 0;
                class315.field4867 = class305.field4745;
                class318.field4906++;
                class204.field3155 = class254.field3916;
                class317.field4884 = 2;
                class99.field1491.method1628((byte) -37, 123);
                class99.field1491.method294(class116.field1774[82] ? 1 : 0, -56);
                class99.field1491.method304(false, var7);
                class99.field1491.method263(class270.field4155, !arg0);
                class99.field1491.method252(class259.field3969, -119);
                class191.method1461(true, class173.field2746.field1300[0], 0, 0, var10.method808(118), class173.field2746.field1290[0], var2, 0, var10.method808(110), var3, (byte) -79);
            }
        }
        if (var4 == 28) {
            class317.field4884 = 2;
            class315.field4867 = class305.field4745;
            class204.field3155 = class254.field3916;
            class321.field4943 = 0;
            class99.field1491.method1628((byte) -69, 152);
            class99.field1491.method263(class358.field5696 + var2, false);
            class338.field5189++;
            class99.field1491.method258(class49.field755 + var3, (byte) 78);
            class99.field1491.method285(0, class116.field1774[82] ? 1 : 0);
            class99.field1491.method304(!arg0, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class211.method1560(var3, var2, -119, var5);
        }
        if (var4 == 44) {
            class171 var11 = class177.field2795[var7];
            if (var11 != null) {
                class315.field4867 = class305.field4745;
                class321.field4943 = 0;
                class204.field3155 = class254.field3916;
                class22.field342++;
                class317.field4884 = 2;
                class99.field1491.method1628((byte) -84, 115);
                class99.field1491.method285(0, class116.field1774[82] ? 1 : 0);
                class99.field1491.method306(var7, 127);
                class191.method1461(true, class173.field2746.field1300[0], 0, 0, var11.method808(-78), class173.field2746.field1290[0], var2, 0, var11.method808(110), var3, (byte) 109);
            }
        }
        if (var4 == 41) {
            class320.field4933++;
            class315.field4867 = class305.field4745;
            class321.field4943 = 0;
            class204.field3155 = class254.field3916;
            class317.field4884 = 2;
            class99.field1491.method1628((byte) -116, 218);
            class99.field1491.method304(false, class358.field5696 + var2);
            class99.field1491.method294(class116.field1774[82] ? 1 : 0, -90);
            class99.field1491.method304(!arg0, class49.field755 + var3);
            class99.field1491.method258(Integer.MAX_VALUE & (int) (var5 >>> 32), (byte) 78);
            class211.method1560(var3, var2, -100, var5);
        }
        if (var4 == 1) {
            class244 var12 = class110.field1683[var7];
            if (var12 != null) {
                class315.field4867 = class305.field4745;
                class94.field1442++;
                class317.field4884 = 2;
                class321.field4943 = 0;
                class204.field3155 = class254.field3916;
                class99.field1491.method1628((byte) -123, 239);
                class99.field1491.method290(false, class45.field719);
                class99.field1491.method278(-14598, class116.field1774[82] ? 1 : 0);
                class99.field1491.method258(class18.field280, (byte) 78);
                class99.field1491.method306(class33.field506, 125);
                class99.field1491.method304(false, var7);
                class191.method1461(true, class173.field2746.field1300[0], 0, 0, var12.method808(118), class173.field2746.field1290[0], var2, 0, var12.method808(117), var3, (byte) -43);
            }
        }
        if (var4 == 47) {
            class99.field1491.method1628((byte) -67, 33);
            class31.field493++;
            class99.field1491.method304(false, var2);
            class99.field1491.method306(var7, 125);
            class99.field1491.method315(var3, 102);
            class281.field4353 = 0;
            class128.field2134 = class355.method2497(0, var3);
            class316.field4876 = var2;
        }
        if (var4 == 1008 || var4 == 1004 || var4 == 1002 || var4 == 1003 || var4 == 1005) {
            class160.method1290(var2, true, var4, var7);
        }
        if (var4 == 14) {
            class171 var13 = class177.field2795[var7];
            if (var13 != null) {
                class315.field4867 = class305.field4745;
                class228.field3574++;
                class321.field4943 = 0;
                class317.field4884 = 2;
                class204.field3155 = class254.field3916;
                class99.field1491.method1628((byte) -68, 169);
                class99.field1491.method306(class270.field4155, 127);
                class99.field1491.method310(114, class259.field3969);
                class99.field1491.method278(-14598, class116.field1774[82] ? 1 : 0);
                class99.field1491.method304(false, var7);
                class191.method1461(true, class173.field2746.field1300[0], 0, 0, var13.method808(-46), class173.field2746.field1290[0], var2, 0, var13.method808(111), var3, (byte) 122);
            }
        }
        if (var4 == 49) {
            if (var7 == 0) {
                class37.method376(class119.field1826, var2, var3);
            } else if (var7 == 1) {
                if (class270.field4168 > 0 && class116.field1774[82] && class116.field1774[81]) {
                    class271.method1988(class119.field1826, 63, class49.field755 + var3, class358.field5696 + var2);
                } else {
                    class50.method480(var3, 1, var2, -29);
                    class99.field1491.method273(0, class283.field4381);
                    class99.field1491.method273(0, class50.field782);
                    class99.field1491.method304(false, (int) class313.field4846);
                    class99.field1491.method273(0, 57);
                    if (class314.field4858 == 4) {
                        class99.field1491.method273(0, 0);
                        class99.field1491.method273(0, 0);
                    } else {
                        class99.field1491.method273(0, class290.field4513);
                        class99.field1491.method273(0, class236.field3676);
                    }
                    class99.field1491.method273(0, 89);
                    class99.field1491.method304(!arg0, class173.field2746.field1359);
                    class99.field1491.method304(false, class173.field2746.field1286);
                    class99.field1491.method273(0, class163.field2588);
                    class99.field1491.method273(0, 63);
                    class191.method1461(true, class173.field2746.field1300[0], 0, 0, 0, class173.field2746.field1290[0], var2, 0, 0, var3, (byte) -80);
                }
            }
        }
        if (var4 == 24) {
            class305.field4744++;
            class99.field1491.method1628((byte) -80, 181);
            class99.field1491.method304(false, var7);
            class99.field1491.method258(var2, (byte) 78);
            class99.field1491.method290(!arg0, var3);
            class281.field4353 = 0;
            class128.field2134 = class355.method2497(0, var3);
            class316.field4876 = var2;
        }
        if (var4 == 2 || var4 == 1007) {
            class221.method1659(var2, 12832, var3, var7, class318.field4904[arg1]);
        }
        if (var4 == 59) {
            class244 var14 = class110.field1683[var7];
            if (var14 != null) {
                class194.field3061++;
                class321.field4943 = 0;
                class315.field4867 = class305.field4745;
                class317.field4884 = 2;
                class204.field3155 = class254.field3916;
                class99.field1491.method1628((byte) -32, 63);
                class99.field1491.method306(var7, 127);
                class99.field1491.method278(-14598, class116.field1774[82] ? 1 : 0);
                class191.method1461(true, class173.field2746.field1300[0], 0, 0, var14.method808(-66), class173.field2746.field1290[0], var2, 0, var14.method808(-29), var3, (byte) 107);
            }
        }
        if (var4 == 23) {
            class317.field4884 = 2;
            class315.field4867 = class305.field4745;
            class321.field4943 = 0;
            class204.field3155 = class254.field3916;
            class154.field2493++;
            class99.field1491.method1628((byte) -8, 183);
            class99.field1491.method273(0, class116.field1774[82] ? 1 : 0);
            class99.field1491.method306(class358.field5696 + var2, 124);
            class99.field1491.method258(var7, (byte) 78);
            class99.field1491.method306(var3 + class49.field755, 125);
            class191.method1461(true, class173.field2746.field1300[0], 0, 0, 0, class173.field2746.field1290[0], var2, 0, 0, var3, (byte) 110);
        }
        if (var4 == 17) {
            class171 var15 = class177.field2795[var7];
            if (var15 != null) {
                class276.field4271++;
                class321.field4943 = 0;
                class315.field4867 = class305.field4745;
                class317.field4884 = 2;
                class204.field3155 = class254.field3916;
                class99.field1491.method1628((byte) -20, 140);
                class99.field1491.method258(var7, (byte) 78);
                class99.field1491.method285(0, class116.field1774[82] ? 1 : 0);
                class191.method1461(true, class173.field2746.field1300[0], 0, 0, var15.method808(96), class173.field2746.field1290[0], var2, 0, var15.method808(-106), var3, (byte) 113);
            }
        }
        if (var4 == 4) {
            class321.field4943 = 0;
            class204.field3155 = class254.field3916;
            class317.field4884 = 2;
            class315.field4867 = class305.field4745;
            class296.field4590++;
            class99.field1491.method1628((byte) -90, 174);
            class99.field1491.method290(false, class45.field719);
            class99.field1491.method306(class18.field280, 126);
            class99.field1491.method304(false, class49.field755 + var3);
            class99.field1491.method306(class358.field5696 + var2, 125);
            class99.field1491.method304(!arg0, var7);
            class99.field1491.method273(0, class116.field1774[82] ? 1 : 0);
            class99.field1491.method263(class33.field506, !arg0);
            class191.method1461(true, class173.field2746.field1300[0], 0, 0, 0, class173.field2746.field1290[0], var2, 0, 0, var3, (byte) -116);
        }
        if (var4 == 48) {
            class171 var16 = class177.field2795[var7];
            if (var16 != null) {
                class315.field4867 = class305.field4745;
                class4.field54++;
                class321.field4943 = 0;
                class317.field4884 = 2;
                class204.field3155 = class254.field3916;
                class99.field1491.method1628((byte) -53, 229);
                class99.field1491.method263(var7, false);
                class99.field1491.method273(0, class116.field1774[82] ? 1 : 0);
                class191.method1461(true, class173.field2746.field1300[0], 0, 0, var16.method808(-96), class173.field2746.field1290[0], var2, 0, var16.method808(-124), var3, (byte) 105);
            }
        }
        if (var4 == 8) {
            class171 var17 = class177.field2795[var7];
            if (var17 != null) {
                class317.field4884 = 2;
                class204.field3155 = class254.field3916;
                class134.field2241++;
                class315.field4867 = class305.field4745;
                class321.field4943 = 0;
                class99.field1491.method1628((byte) -54, 32);
                class99.field1491.method306(var7, 125);
                class99.field1491.method285(0, class116.field1774[82] ? 1 : 0);
                class191.method1461(true, class173.field2746.field1300[0], 0, 0, var17.method808(-25), class173.field2746.field1290[0], var2, 0, var17.method808(-103), var3, (byte) -106);
            }
        }
        if (var4 == 12) {
            class266.field4122++;
            class99.field1491.method1628((byte) -122, 73);
            class99.field1491.method263(var2, !arg0);
            class99.field1491.method310(89, var3);
            class99.field1491.method304(false, var7);
            class281.field4353 = 0;
            class128.field2134 = class355.method2497(0, var3);
            class316.field4876 = var2;
        }
        if (var4 == 22) {
            class171 var18 = class177.field2795[var7];
            if (var18 != null) {
                class321.field4943 = 0;
                class317.field4884 = 2;
                class310.field4807++;
                class315.field4867 = class305.field4745;
                class204.field3155 = class254.field3916;
                class99.field1491.method1628((byte) -85, 156);
                class99.field1491.method315(class45.field719, 123);
                class99.field1491.method258(var7, (byte) 78);
                class99.field1491.method258(class18.field280, (byte) 78);
                class99.field1491.method258(class33.field506, (byte) 78);
                class99.field1491.method285(0, class116.field1774[82] ? 1 : 0);
                class191.method1461(true, class173.field2746.field1300[0], 0, 0, var18.method808(108), class173.field2746.field1290[0], var2, 0, var18.method808(3), var3, (byte) -84);
            }
        }
        if (var4 == 10) {
            class244 var19 = class110.field1683[var7];
            if (var19 != null) {
                class204.field3155 = class254.field3916;
                class192.field3015++;
                class321.field4943 = 0;
                class315.field4867 = class305.field4745;
                class317.field4884 = 2;
                class99.field1491.method1628((byte) -107, 136);
                class99.field1491.method258(var7, (byte) 78);
                class99.field1491.method294(class116.field1774[82] ? 1 : 0, -62);
                class191.method1461(true, class173.field2746.field1300[0], 0, 0, var19.method808(-95), class173.field2746.field1290[0], var2, 0, var19.method808(-124), var3, (byte) 125);
            }
        }
        if (var4 == 58 && class356.field5672 == null) {
            class292.method2112(var3, var2, -122);
            class356.field5672 = class320.method2259(var2, var3, 0);
            class339.method2380(class356.field5672, 123);
        }
        if (var4 == 1012) {
            class204.field3155 = class254.field3916;
            class317.field4884 = 2;
            class102.field1536++;
            class321.field4943 = 0;
            class315.field4867 = class305.field4745;
            class99.field1491.method1628((byte) -9, 211);
            class99.field1491.method306(var7, 124);
        }
        if (var4 == 30) {
            class244 var20 = class110.field1683[var7];
            if (var20 != null) {
                class321.field4943 = 0;
                class315.field4867 = class305.field4745;
                class204.field3155 = class254.field3916;
                class317.field4884 = 2;
                class99.field1491.method1628((byte) -86, 84);
                class99.field1491.method285(0, class116.field1774[82] ? 1 : 0);
                class248.field3850++;
                class99.field1491.method263(var7, false);
                class191.method1461(true, class173.field2746.field1300[0], 0, 0, var20.method808(5), class173.field2746.field1290[0], var2, 0, var20.method808(-119), var3, (byte) -92);
            }
        }
        if (var4 == 42) {
            class99.field1491.method1628((byte) -107, 131);
            class255.field3932++;
            class99.field1491.method310(125, var3);
            class342 var21 = class355.method2497(0, var3);
            if (var21.field5434 != null && var21.field5434[0][0] == 5) {
                int var22 = var21.field5434[0][1];
                class160.field2538[var22] = 1 - class160.field2538[var22];
                class286.method2069(36, var22);
            }
        }
        if (var4 == 5) {
            class317.field4884 = 2;
            class321.field4943 = 0;
            class204.field3155 = class254.field3916;
            class210.field3229++;
            class315.field4867 = class305.field4745;
            class99.field1491.method1628((byte) -45, 150);
            class99.field1491.method258(class358.field5696 + var2, (byte) 78);
            class99.field1491.method294(class116.field1774[82] ? 1 : 0, -63);
            class99.field1491.method306(var7, 124);
            class99.field1491.method306(class49.field755 + var3, 127);
            class191.method1461(true, class173.field2746.field1300[0], 0, 0, 0, class173.field2746.field1290[0], var2, 0, 0, var3, (byte) -105);
        }
        if (var4 == 19) {
            class99.field1491.method1628((byte) -18, 144);
            class66.field1015++;
            class99.field1491.method252(var3, -121);
            class99.field1491.method258(class270.field4155, (byte) 78);
            class99.field1491.method306(var2, 127);
            class99.field1491.method252(class259.field3969, -114);
            class99.field1491.method304(false, var7);
            class281.field4353 = 0;
            class128.field2134 = class355.method2497(0, var3);
            class316.field4876 = var2;
        }
        if (var4 == 18) {
            class317.field4884 = 2;
            class321.field4943 = 0;
            class315.field4867 = class305.field4745;
            class143.field2348++;
            class204.field3155 = class254.field3916;
            class99.field1491.method1628((byte) -67, 200);
            class99.field1491.method294(class116.field1774[82] ? 1 : 0, -86);
            class99.field1491.method290(false, class259.field3969);
            class99.field1491.method258((int) (var5 >>> 32) & Integer.MAX_VALUE, (byte) 78);
            class99.field1491.method258(class270.field4155, (byte) 78);
            class99.field1491.method304(false, class49.field755 + var3);
            class99.field1491.method263(class358.field5696 + var2, false);
            class211.method1560(var3, var2, -95, var5);
        }
        if (var4 == 20) {
            class342 var35 = class320.method2259(var2, var3, 0);
            if (var35 != null) {
                class326.method2306((byte) 64);
                class227 var36 = client.method1022(var35);
                class45.method455(var2, var35.field5405, var36.method1695(-1), var3, var35.field5388, (byte) -112, var36.field3546);
                class78.field1136 = 0;
                class202.field3130 = class211.method1559(var35, (byte) -101);
                if (var35.field5340) {
                    field1203 = var35.field5392 + "<col=ffffff>";
                } else {
                    field1203 = "<col=00ff00>" + var35.field5444 + "<col=ffffff>";
                }
                if (class202.field3130 == null) {
                    class202.field3130 = "Null";
                }
            }
            return;
        }
        if (var4 == 29) {
            class171 var23 = class177.field2795[var7];
            if (var23 != null) {
                class321.field4943 = 0;
                class204.field3155 = class254.field3916;
                class315.field4867 = class305.field4745;
                class74.field1105++;
                class317.field4884 = 2;
                class99.field1491.method1628((byte) -116, 207);
                class99.field1491.method285(0, class116.field1774[82] ? 1 : 0);
                class99.field1491.method258(var7, (byte) 78);
                class191.method1461(true, class173.field2746.field1300[0], 0, 0, var23.method808(123), class173.field2746.field1290[0], var2, 0, var23.method808(106), var3, (byte) -25);
            }
        }
        if (var4 == 7) {
            class99.field1491.method1628((byte) -53, 82);
            class33.field500++;
            class99.field1491.method258(var7, (byte) 78);
            class99.field1491.method290(!arg0, var3);
            class99.field1491.method306(var2, 126);
            class281.field4353 = 0;
            class128.field2134 = class355.method2497(0, var3);
            class316.field4876 = var2;
        }
        if (var4 == 26) {
            class99.field1491.method1628((byte) -64, 4);
            class99.field1491.method310(49, class45.field719);
            class99.field1491.method310(67, var3);
            class99.field1491.method304(false, var2);
            class143.field2352++;
            class99.field1491.method258(class18.field280, (byte) 78);
            class99.field1491.method304(false, class33.field506);
            class99.field1491.method263(var7, !arg0);
            class281.field4353 = 0;
            class128.field2134 = class355.method2497(0, var3);
            class316.field4876 = var2;
        }
        if (var4 == 35) {
            class171 var24 = class177.field2795[var7];
            if (var24 != null) {
                class204.field3155 = class254.field3916;
                class321.field4943 = 0;
                class111.field1696++;
                class317.field4884 = 2;
                class315.field4867 = class305.field4745;
                class99.field1491.method1628((byte) -10, 68);
                class99.field1491.method258(var7, (byte) 78);
                class99.field1491.method273(0, class116.field1774[82] ? 1 : 0);
                class191.method1461(true, class173.field2746.field1300[0], 0, 0, var24.method808(111), class173.field2746.field1290[0], var2, 0, var24.method808(-19), var3, (byte) -25);
            }
        }
        if (var4 == 31) {
            class244 var25 = class110.field1683[var7];
            if (var25 != null) {
                class122.field1961++;
                class317.field4884 = 2;
                class321.field4943 = 0;
                class204.field3155 = class254.field3916;
                class315.field4867 = class305.field4745;
                class99.field1491.method1628((byte) -52, 232);
                class99.field1491.method294(class116.field1774[82] ? 1 : 0, -73);
                class99.field1491.method263(var7, false);
                class191.method1461(true, class173.field2746.field1300[0], 0, 0, var25.method808(-104), class173.field2746.field1290[0], var2, 0, var25.method808(94), var3, (byte) 120);
            }
        }
        if (var4 == 15) {
            class99.field1491.method1628((byte) -124, 75);
            class99.field1491.method263(var7, false);
            class99.field1491.method258(var2, (byte) 78);
            class150.field2452++;
            class99.field1491.method310(63, var3);
            class281.field4353 = 0;
            class128.field2134 = class355.method2497(0, var3);
            class316.field4876 = var2;
        }
        if (!arg0) {
            method747((byte) -58);
        }
        if (var4 == 57) {
            class99.field1491.method1628((byte) -17, 252);
            class99.field1491.method252(class259.field3969, -123);
            class314.field4863++;
            class99.field1491.method290(false, var3);
            class99.field1491.method263(var2, !arg0);
            class99.field1491.method263(class270.field4155, false);
        }
        if (var4 == 1006) {
            class315.field4867 = class305.field4745;
            class317.field4884 = 2;
            class204.field3155 = class254.field3916;
            class321.field4943 = 0;
            class244 var26 = class110.field1683[var7];
            if (var26 != null) {
                class130 var27 = var26.field3802;
                if (var27.field2149 != null) {
                    var27 = var27.method1120((byte) -126);
                }
                if (var27 != null) {
                    class99.field1491.method1628((byte) -26, 198);
                    class99.field1491.method263(var27.field2171, !arg0);
                    class55.field810++;
                }
            }
        }
        if (var4 == 32) {
            if (var7 == 0) {
                class288.field4469 = 1;
                class37.method376(class119.field1826, var2, var3);
            } else if (var7 == 1) {
                class99.field1491.method1628((byte) -42, 7);
                class99.field1491.method304(false, class358.field5696 + var2);
                class217.field3401++;
                class99.field1491.method315(class259.field3969, 113);
                class99.field1491.method263(class49.field755 + var3, !arg0);
                class99.field1491.method263(class270.field4155, false);
            }
        }
        if (var4 == 36) {
            class255.field3932++;
            class99.field1491.method1628((byte) -15, 131);
            class99.field1491.method310(84, var3);
            class342 var28 = class355.method2497(0, var3);
            if (var28.field5434 != null && var28.field5434[0][0] == 5) {
                int var29 = var28.field5434[0][1];
                if (class160.field2538[var29] != var28.field5269[0]) {
                    class160.field2538[var29] = var28.field5269[0];
                    class286.method2069(77, var29);
                }
            }
        }
        if (var4 == 38) {
            class321.field4943 = 0;
            class204.field3155 = class254.field3916;
            class331.field5088++;
            class317.field4884 = 2;
            class315.field4867 = class305.field4745;
            class99.field1491.method1628((byte) -108, 187);
            class99.field1491.method258(class358.field5696 + var2, (byte) 78);
            class99.field1491.method294(class116.field1774[82] ? 1 : 0, -31);
            class99.field1491.method263(var7, false);
            class99.field1491.method258(var3 + class49.field755, (byte) 78);
            class191.method1461(true, class173.field2746.field1300[0], 0, 0, 0, class173.field2746.field1290[0], var2, 0, 0, var3, (byte) 118);
        }
        if (var4 == 51) {
            class99.field1491.method1628((byte) -123, 89);
            class294.field4569++;
            class99.field1491.method304(false, var2);
            class99.field1491.method252(var3, -121);
            class99.field1491.method258(var7, (byte) 78);
            class281.field4353 = 0;
            class128.field2134 = class355.method2497(0, var3);
            class316.field4876 = var2;
        }
        if (var4 == 1009) {
            class342 var30 = class355.method2497(0, var3);
            if (var30 == null || var30.field5344[var2] < 100000) {
                class99.field1491.method1628((byte) -125, 104);
                class99.field1489++;
                class99.field1491.method306(var7, 124);
            } else {
                class101.method882(-1, var30.field5344[var2] + " x " + class48.method469(10, var7).field4058);
            }
            class281.field4353 = 0;
            class128.field2134 = class355.method2497(0, var3);
            class316.field4876 = var2;
        }
        if (var4 == 1010) {
            class99.field1489++;
            class204.field3155 = class254.field3916;
            class321.field4943 = 0;
            class315.field4867 = class305.field4745;
            class317.field4884 = 2;
            class99.field1491.method1628((byte) -88, 104);
            class99.field1491.method306(var7, 125);
        }
        if (var4 == 1001) {
            class317.field4884 = 2;
            class315.field4867 = class305.field4745;
            class163.field2590++;
            class321.field4943 = 0;
            class204.field3155 = class254.field3916;
            class99.field1491.method1628((byte) -125, 103);
            class99.field1491.method304(false, class49.field755 + var3);
            class99.field1491.method258(class358.field5696 + var2, (byte) 78);
            class99.field1491.method263((int) (var5 >>> 32) & Integer.MAX_VALUE, false);
            class99.field1491.method278(-14598, class116.field1774[82] ? 1 : 0);
            class211.method1560(var3, var2, -100, var5);
        }
        if (var4 == 40) {
            class342 var31 = class355.method2497(0, var3);
            boolean var32 = true;
            if (var31.field5427 > 0) {
                var32 = class118.method1005(var31, (byte) 123);
            }
            if (var32) {
                class255.field3932++;
                class99.field1491.method1628((byte) -58, 131);
                class99.field1491.method310(93, var3);
            }
        }
        if (var4 == 33) {
            if (var7 == 0) {
                class37.field574 = 1;
                class37.method376(class119.field1826, var2, var3);
            } else if (class270.field4168 > 0 && class116.field1774[82] && class116.field1774[81]) {
                class271.method1988(class119.field1826, 63, class49.field755 + var3, class358.field5696 - -var2);
            } else {
                class217.field3399++;
                class99.field1491.method1628((byte) -35, 47);
                class99.field1491.method263(class358.field5696 + var2, false);
                class99.field1491.method306(class49.field755 + var3, 126);
            }
        }
        if (var4 == 16) {
            class326.method2306((byte) 88);
            class342 var34 = class355.method2497(0, var3);
            class18.field280 = var7;
            class45.field719 = var3;
            class33.field506 = var2;
            class78.field1136 = 1;
            class339.method2380(var34, 118);
            class352.field5626 = "<col=ff9040>" + class48.method469(10, var7).field4058 + "<col=ffffff>";
            if (class352.field5626 == null) {
                class352.field5626 = "null";
            }
            return;
        }
        if (var4 == 3) {
            class75.field1107++;
            class99.field1491.method1628((byte) -101, 182);
            class99.field1491.method258(var2, (byte) 78);
            class99.field1491.method263(var7, false);
            class99.field1491.method315(var3, 98);
            class281.field4353 = 0;
            class128.field2134 = class355.method2497(0, var3);
            class316.field4876 = var2;
        }
        if (var4 == 43) {
            class99.field1491.method1628((byte) -60, 108);
            class99.field1491.method290(false, var3);
            class326.field5001++;
            class99.field1491.method306(var2, 125);
            class99.field1491.method306(var7, 124);
            class281.field4353 = 0;
            class128.field2134 = class355.method2497(0, var3);
            class316.field4876 = var2;
        }
        if (var4 == 45) {
            class315.field4867 = class305.field4745;
            class204.field3155 = class254.field3916;
            class317.field4884 = 2;
            class154.field2499++;
            class321.field4943 = 0;
            class99.field1491.method1628((byte) -123, 162);
            class99.field1491.method258((int) (var5 >>> 32) & Integer.MAX_VALUE, (byte) 78);
            class99.field1491.method273(0, class116.field1774[82] ? 1 : 0);
            class99.field1491.method263(class358.field5696 + var2, false);
            class99.field1491.method263(var3 + class49.field755, false);
            class211.method1560(var3, var2, -112, var5);
        }
        if (var4 == 60) {
            class315.field4867 = class305.field4745;
            class317.field4884 = 2;
            class321.field4943 = 0;
            class85.field1222++;
            class204.field3155 = class254.field3916;
            class99.field1491.method1628((byte) -121, 221);
            class99.field1491.method258(var3 + class49.field755, (byte) 78);
            class99.field1491.method278(-14598, class116.field1774[82] ? 1 : 0);
            class99.field1491.method263(var2 + class358.field5696, false);
            class99.field1491.method263(var7, false);
            class191.method1461(true, class173.field2746.field1300[0], 0, 0, 0, class173.field2746.field1290[0], var2, 0, 0, var3, (byte) -36);
        }
        if (var4 == 9) {
            class239.field3703++;
            class99.field1491.method1628((byte) -46, 124);
            class99.field1491.method304(false, var2);
            class99.field1491.method263(var7, false);
            class99.field1491.method315(var3, 109);
            class281.field4353 = 0;
            class128.field2134 = class355.method2497(0, var3);
            class316.field4876 = var2;
        }
        if (var4 == 21) {
            class99.field1491.method1628((byte) -122, 201);
            class363.field5744++;
            class99.field1491.method290(false, var3);
            class99.field1491.method304(!arg0, var2);
            class99.field1491.method306(var7, 125);
            class281.field4353 = 0;
            class128.field2134 = class355.method2497(0, var3);
            class316.field4876 = var2;
        }
        if (var4 == 13) {
            class171 var33 = class177.field2795[var7];
            if (var33 != null) {
                class290.field4508++;
                class317.field4884 = 2;
                class321.field4943 = 0;
                class315.field4867 = class305.field4745;
                class204.field3155 = class254.field3916;
                class99.field1491.method1628((byte) -13, 175);
                class99.field1491.method278(-14598, class116.field1774[82] ? 1 : 0);
                class99.field1491.method304(false, var7);
                class191.method1461(true, class173.field2746.field1300[0], 0, 0, var33.method808(127), class173.field2746.field1290[0], var2, 0, var33.method808(100), var3, (byte) 127);
            }
        }
        if (var4 == 46) {
            class315.field4867 = class305.field4745;
            class321.field4943 = 0;
            class317.field4884 = 2;
            class204.field3155 = class254.field3916;
            class99.field1491.method1628((byte) -89, 148);
            class99.field1491.method304(!arg0, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class160.field2543++;
            class99.field1491.method278(-14598, class116.field1774[82] ? 1 : 0);
            class99.field1491.method304(false, class49.field755 + var3);
            class99.field1491.method263(class358.field5696 + var2, false);
            class211.method1560(var3, var2, -99, var5);
        }
        if (class78.field1136 != 0) {
            class78.field1136 = 0;
            class339.method2380(class355.method2497(0, class45.field719), 114);
        }
        if (class210.field3237) {
            class326.method2306((byte) 71);
        }
        if (class128.field2134 != null && class281.field4353 == 0) {
            class339.method2380(class128.field2134, 109);
        }
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(B)V", line = 1156)
    public static void method747(byte arg0) {
        field1203 = null;
        field1197 = null;
        field1199 = null;
        int var1 = -78 % ((arg0 - 32) / 63);
        field1194 = null;
        field1206 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIZIIIIII)V", line = 1177)
    public static final void method748(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1205++;
        if (arg0 == arg9 && arg2 == arg6 && arg1 == arg4 && arg5 == arg7) {
            class10.method100(arg1, arg5, arg0, arg8, arg6, -28776);
        } else {
            int var10 = arg6;
            int var11 = arg0;
            int var12 = arg0 * 3;
            int var13 = arg6 * 3;
            int var14 = arg9 * 3;
            int var15 = arg2 * 3;
            int var16 = arg7 * 3;
            int var17 = arg4 * 3;
            int var18 = arg1 + var14 - arg0 - var17;
            int var19 = var15 + arg5 - var16 - arg6;
            int var20 = var17 + var12 - var14 - var14;
            int var21 = var16 + var13 - var15 - var15;
            int var22 = var15 - var13;
            int var23 = var14 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var20 * var25;
                int var28 = var18 * var26;
                int var29 = var19 * var26;
                int var30 = var23 * var24;
                int var31 = var22 * var24;
                int var32 = var21 * var25;
                int var33 = (var29 + var32 + var31 >> 12) + arg6;
                int var34 = (var28 + var30 + var27 >> 12) + arg0;
                class10.method100(var34, var33, var11, arg8, var10, -28776);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg3) {
            method746(true, -95);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "()V", line = 1255)
    public static final void method749() {
        if (class233.field3638 != null) {
            for (int var0 = 0; var0 < class233.field3638.length; var0++) {
                for (int var1 = 0; var1 < class154.field2492; var1++) {
                    for (int var2 = 0; var2 < class166.field2642; var2++) {
                        class233.field3638[var0][var1][var2] = null;
                    }
                }
            }
        }
        class181.field2866 = (class125[][]) null;
        if (class72.field1087 != null) {
            for (int var3 = 0; var3 < class72.field1087.length; var3++) {
                for (int var4 = 0; var4 < class154.field2492; var4++) {
                    for (int var5 = 0; var5 < class166.field2642; var5++) {
                        class72.field1087[var3][var4][var5] = null;
                    }
                }
            }
        }
        class205.field3168 = (class125[][]) null;
        class304.field4729 = 0;
        if (class4.field57 != null) {
            for (int var6 = 0; var6 < class304.field4729; var6++) {
                class4.field57[var6] = null;
            }
        }
        if (class190.field2980 != null) {
            for (int var7 = 0; var7 < class301.field4680; var7++) {
                class190.field2980[var7] = null;
            }
            class301.field4680 = 0;
        }
        if (class203.field3146 != null) {
            for (int var8 = 0; var8 < class203.field3146.length; var8++) {
                class203.field3146[var8] = null;
            }
        }
    }
}
