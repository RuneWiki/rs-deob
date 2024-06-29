import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class227 extends class30 {

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "Lia;")
    public static class257 field3811 = class28.method234(-86, " )2>");

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "[I")
    public static int[] field3817 = new int[500];

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public static int field3821 = 0;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    public static int field3822 = 0;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public int field3814;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
    public int field3815;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
    public int field3818;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "[I")
    public static int[] field3816;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V")
    public static void method1484(byte arg0) {
        field3817 = null;
        field3816 = null;
        int var1 = 68 % ((arg0 + 42) / 61);
        field3811 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILia;IIJIB)V")
    public static final void method1485(int arg0, class257 arg1, int arg2, int arg3, long arg4, int arg5, byte arg6) {
        class14.method146(31945);
        field3813++;
        class152 var8 = new class152(128);
        var8.method1023(13195, 10);
        var8.method1065((int) (Math.random() * 99999.0D), 1210792072);
        var8.method1065(503, 1210792072);
        var8.method1044(false, arg4);
        var8.method1066(-1687589720, (int) (Math.random() * 9.9999999E7D));
        var8.method1068(arg1, 0);
        var8.method1066(-1687589720, (int) (Math.random() * 9.9999999E7D));
        var8.method1065(class225.field3779, 1210792072);
        var8.method1023(13195, arg0);
        var8.method1023(13195, arg5);
        var8.method1066(-1687589720, (int) (Math.random() * 9.9999999E7D));
        var8.method1065(arg3, 1210792072);
        if (arg6 >= -102) {
            method1484((byte) -60);
        }
        var8.method1065(arg2, 1210792072);
        var8.method1066(-1687589720, (int) (Math.random() * 9.9999999E7D));
        var8.method1038((byte) 84, class108.field2014, class140.field2489);
        class205.field3524.field2677 = 0;
        class205.field3524.method1023(13195, 216);
        class205.field3524.method1023(13195, var8.field2677);
        class205.field3524.method1032(var8.field2677, 0, var8.field2638, 1848138600);
        class133.field2377 = 1;
        class121.field2183 = 3;
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(II)V")
    public static final void method1486(int arg0, int arg1) {
        field3812++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class12.field236[arg0];
        int var3 = field3817[arg0];
        int var4 = class32.field616[arg0];
        int var5 = (int) class179.field3104[arg0];
        long var6 = class179.field3104[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        if (var4 == 48) {
            class114.field2053++;
            boolean var8 = class178.method1199(class137.field2441.field4119[0], (byte) 122, var2, 0, 0, 0, var3, class137.field2441.field4182[0], 0, false, 2, 0);
            if (!var8) {
                class178.method1199(class137.field2441.field4119[0], (byte) 118, var2, 0, 1, 0, var3, class137.field2441.field4182[0], 0, false, 2, 1);
            }
            class123.field2210 = class105.field1952;
            class81.field1570 = 2;
            class112.field2045 = 0;
            class180.field3123 = class74.field1430;
            class205.field3524.method908(false, 48);
            class205.field3524.method1065(class244.field4232 + var2, 1210792072);
            class205.field3524.method1065(class231.field3878 + var3, 1210792072);
            class205.field3524.method1018((byte) -11, var5);
        }
        if (var4 == 47) {
            class258.field4466++;
            class116.method826(var2, var6, var3, (byte) 67);
            class205.field3524.method908(false, 23);
            class205.field3524.method1018((byte) -11, class244.field4232 + var2);
            class205.field3524.method1018((byte) -11, class231.field3878 + var3);
            class205.field3524.method1065((int) (var6 >>> 32) & Integer.MAX_VALUE, 1210792072);
        }
        if (var4 == 57) {
            class128.field2283++;
            class205.field3524.method908(false, 240);
            class205.field3524.method1066(-1687589720, var3);
            class205.field3524.method1065(var2, 1210792072);
            class205.field3524.method1054(var5, 2);
            class125.field2246 = 0;
            class125.field2244 = class221.method1456(var3, (byte) -101);
            class199.field3404 = var2;
        }
        if (var4 == 24) {
            class29.field551++;
            class205.field3524.method908(false, 127);
            class205.field3524.method1030(class29.field556, -29);
            class205.field3524.method1018((byte) -11, class10.field191);
            class205.field3524.method1018((byte) -11, var2);
            class205.field3524.method1018((byte) -11, var5);
            class205.field3524.method1071(var3, (byte) 100);
            class125.field2246 = 0;
            class125.field2244 = class221.method1456(var3, (byte) -57);
            class199.field3404 = var2;
        }
        if (var4 == 18) {
            class180 var10 = class55.field1180[var5];
            if (var10 != null) {
                class57.field1213++;
                class178.method1199(class137.field2441.field4119[0], (byte) 111, var10.field4182[0], 0, 1, 0, var10.field4119[0], class137.field2441.field4182[0], 0, false, 2, 1);
                class112.field2045 = 0;
                class81.field1570 = 2;
                class123.field2210 = class105.field1952;
                class180.field3123 = class74.field1430;
                class205.field3524.method908(false, 205);
                class205.field3524.method1065(var5, 1210792072);
            }
        }
        if (var4 == 32) {
            class231.method1507(61);
            class44 var11 = class221.method1456(var3, (byte) -94);
            class31.field611 = 1;
            class3.field91 = var2;
            class99.field1826 = var5;
            class119.field2152 = var3;
            class257.method1718(false, var11);
            class181.field3142 = class233.method1528(new class257[] { class126.field2251, class156.method1090(var5, 0).field295, class30.field572 }, 0);
            if (class181.field3142 == null) {
                class181.field3142 = class222.field3752;
            }
            return;
        }
        if (var4 == 1003) {
            class44 var12 = class221.method1456(var3, (byte) -92);
            if (var12 == null || var12.field1008[var2] < 100000) {
                class205.field3524.method908(false, 193);
                class205.field3524.method1065(var5, 1210792072);
                class198.field3379++;
            } else {
                class197.method1317(-116, 0, class233.method1528(new class257[] { class111.method808(10, var12.field1008[var2]), class45.field1046, class156.method1090(var5, 0).field295 }, 0), class17.field378);
            }
            class125.field2246 = 0;
            class125.field2244 = class221.method1456(var3, (byte) -68);
            class199.field3404 = var2;
        }
        if (var4 == 2) {
            boolean var13 = class178.method1199(class137.field2441.field4119[0], (byte) 113, var2, 0, 0, 0, var3, class137.field2441.field4182[0], 0, false, 2, 0);
            if (!var13) {
                class178.method1199(class137.field2441.field4119[0], (byte) 125, var2, 0, 1, 0, var3, class137.field2441.field4182[0], 0, false, 2, 1);
            }
            class81.field1570 = 2;
            class8.field175++;
            class123.field2210 = class105.field1952;
            class180.field3123 = class74.field1430;
            class112.field2045 = 0;
            class205.field3524.method908(false, 144);
            class205.field3524.method1054(var5, 2);
            class205.field3524.method1047(class244.field4232 + var2, true);
            class205.field3524.method1047(class231.field3878 + var3, true);
        }
        if (var4 == 26) {
            class180 var15 = class55.field1180[var5];
            if (var15 != null) {
                class31.field607++;
                class178.method1199(class137.field2441.field4119[0], (byte) 113, var15.field4182[0], 0, 1, 0, var15.field4119[0], class137.field2441.field4182[0], 0, false, 2, 1);
                class81.field1570 = 2;
                class180.field3123 = class74.field1430;
                class123.field2210 = class105.field1952;
                class112.field2045 = 0;
                class205.field3524.method908(false, 95);
                class205.field3524.method1054(var5, 2);
            }
        }
        if (var4 == 50) {
            class19.field404++;
            class205.field3524.method908(false, 147);
            class205.field3524.method1066(-1687589720, var3);
            class44 var16 = class221.method1456(var3, (byte) -101);
            if (var16.field867 != null && var16.field867[0][0] == 5) {
                int var17 = var16.field867[0][1];
                class117.field2100[var17] = 1 - class117.field2100[var17];
                class188.method1268(-10, var17);
            }
        }
        if (var4 == 20 && class116.method826(var2, var6, var3, (byte) 69)) {
            class205.field3524.method908(false, 254);
            class39.field787++;
            class205.field3524.method1054(class10.field191, 2);
            class205.field3524.method1047(var3 + class231.field3878, true);
            class205.field3524.method1047((int) (var6 >>> 32) & Integer.MAX_VALUE, true);
            class205.field3524.method1065(var2 + class244.field4232, 1210792072);
            class205.field3524.method1073(class29.field556, (byte) 1);
        }
        if (arg1 > -85) {
            method1486(26, -123);
        }
        if (var4 == 33) {
            class180 var18 = class55.field1180[var5];
            if (var18 != null) {
                class28.field535++;
                class178.method1199(class137.field2441.field4119[0], (byte) 116, var18.field4182[0], 0, 1, 0, var18.field4119[0], class137.field2441.field4182[0], 0, false, 2, 1);
                class123.field2210 = class105.field1952;
                class81.field1570 = 2;
                class180.field3123 = class74.field1430;
                class112.field2045 = 0;
                class205.field3524.method908(false, 198);
                class205.field3524.method1065(var5, 1210792072);
                class205.field3524.method1047(class99.field1826, true);
                class205.field3524.method1047(class3.field91, true);
                class205.field3524.method1071(class119.field2152, (byte) 118);
            }
        }
        if (var4 == 49) {
            class180 var19 = class55.field1180[var5];
            if (var19 != null) {
                class71.field1396++;
                class178.method1199(class137.field2441.field4119[0], (byte) 115, var19.field4182[0], 0, 1, 0, var19.field4119[0], class137.field2441.field4182[0], 0, false, 2, 1);
                class180.field3123 = class74.field1430;
                class112.field2045 = 0;
                class123.field2210 = class105.field1952;
                class81.field1570 = 2;
                class205.field3524.method908(false, 224);
                class205.field3524.method1018((byte) -11, var5);
            }
        }
        if (var4 == 28) {
            class116.method826(var2, var6, var3, (byte) 79);
            class205.field3524.method908(false, 27);
            class138.field2472++;
            class205.field3524.method1065((int) (var6 >>> 32) & Integer.MAX_VALUE, 1210792072);
            class205.field3524.method1047(class231.field3878 + var3, true);
            class205.field3524.method1065(var2 + class244.field4232, 1210792072);
        }
        if (var4 == 29) {
            class58.field1226++;
            class205.field3524.method908(false, 164);
            class205.field3524.method1071(var3, (byte) 98);
            class205.field3524.method1065(var5, 1210792072);
            class205.field3524.method1018((byte) -11, var2);
            class125.field2246 = 0;
            class125.field2244 = class221.method1456(var3, (byte) -111);
            class199.field3404 = var2;
        }
        if (var4 == 21) {
            class180 var20 = class55.field1180[var5];
            if (var20 != null) {
                class196.field3314++;
                class178.method1199(class137.field2441.field4119[0], (byte) 119, var20.field4182[0], 0, 1, 0, var20.field4119[0], class137.field2441.field4182[0], 0, false, 2, 1);
                class180.field3123 = class74.field1430;
                class123.field2210 = class105.field1952;
                class81.field1570 = 2;
                class112.field2045 = 0;
                class205.field3524.method908(false, 170);
                class205.field3524.method1054(var5, 2);
            }
        }
        if (var4 == 14) {
            class10.field189++;
            boolean var21 = class178.method1199(class137.field2441.field4119[0], (byte) 121, var2, 0, 0, 0, var3, class137.field2441.field4182[0], 0, false, 2, 0);
            if (!var21) {
                class178.method1199(class137.field2441.field4119[0], (byte) 113, var2, 0, 1, 0, var3, class137.field2441.field4182[0], 0, false, 2, 1);
            }
            class123.field2210 = class105.field1952;
            class112.field2045 = 0;
            class180.field3123 = class74.field1430;
            class81.field1570 = 2;
            class205.field3524.method908(false, 231);
            class205.field3524.method1018((byte) -11, class231.field3878 + var3);
            class205.field3524.method1065(var5, 1210792072);
            class205.field3524.method1065(class244.field4232 + var2, 1210792072);
        }
        if (var4 == 10) {
            class197 var23 = class92.field1758[var5];
            if (var23 != null) {
                class135.field2415++;
                class178.method1199(class137.field2441.field4119[0], (byte) 126, var23.field4182[0], 0, 1, 0, var23.field4119[0], class137.field2441.field4182[0], 0, false, 2, 1);
                class81.field1570 = 2;
                class180.field3123 = class74.field1430;
                class112.field2045 = 0;
                class123.field2210 = class105.field1952;
                class205.field3524.method908(false, 238);
                class205.field3524.method1054(var5, 2);
            }
        }
        if (var4 == 36) {
            class145.field2531++;
            class205.field3524.method908(false, 135);
            class205.field3524.method1071(var3, (byte) 92);
            class205.field3524.method1018((byte) -11, var2);
            class205.field3524.method1018((byte) -11, var5);
            class125.field2246 = 0;
            class125.field2244 = class221.method1456(var3, (byte) -80);
            class199.field3404 = var2;
        }
        if (var4 == 7) {
            class209.field3569++;
            class116.method826(var2, var6, var3, (byte) 113);
            class205.field3524.method908(false, 129);
            class205.field3524.method1047(Integer.MAX_VALUE & (int) (var6 >>> 32), true);
            class205.field3524.method1054(var2 + class244.field4232, 2);
            class205.field3524.method1047(class231.field3878 + var3, true);
        }
        if (var4 == 13) {
            class205.field3524.method908(false, 181);
            class205.field3524.method1030(var3, -24);
            class205.field3524.method1054(var2, 2);
            class16.field343++;
            class205.field3524.method1065(var5, 1210792072);
            class125.field2246 = 0;
            class125.field2244 = class221.method1456(var3, (byte) -107);
            class199.field3404 = var2;
        }
        if (var4 == 42) {
            class205.field3524.method908(false, 210);
            class205.field3524.method1065(var2, 1210792072);
            class129.field2304++;
            class205.field3524.method1073(var3, (byte) 1);
            class205.field3524.method1054(var5, 2);
            class125.field2246 = 0;
            class125.field2244 = class221.method1456(var3, (byte) -113);
            class199.field3404 = var2;
        }
        if (var4 == 5) {
            class197 var24 = class92.field1758[var5];
            if (var24 != null) {
                class117.field2108++;
                class178.method1199(class137.field2441.field4119[0], (byte) 112, var24.field4182[0], 0, 1, 0, var24.field4119[0], class137.field2441.field4182[0], 0, false, 2, 1);
                class180.field3123 = class74.field1430;
                class81.field1570 = 2;
                class112.field2045 = 0;
                class123.field2210 = class105.field1952;
                class205.field3524.method908(false, 52);
                class205.field3524.method1054(var5, 2);
                class205.field3524.method1030(class119.field2152, -62);
                class205.field3524.method1065(class99.field1826, 1210792072);
                class205.field3524.method1054(class3.field91, 2);
            }
        }
        if (var4 == 34) {
            class217.field3682++;
            class205.field3524.method908(false, 136);
            class205.field3524.method1071(class29.field556, (byte) 115);
            class205.field3524.method1054(var2, 2);
            class205.field3524.method1065(class10.field191, 1210792072);
            class205.field3524.method1073(var3, (byte) 1);
        }
        if (var4 == 12 && class116.method826(var2, var6, var3, (byte) 96)) {
            class205.field3524.method908(false, 105);
            class215.field3657++;
            class205.field3524.method1047(var2 + class244.field4232, true);
            class205.field3524.method1065(class231.field3878 + var3, 1210792072);
            class205.field3524.method1047(Integer.MAX_VALUE & (int) (var6 >>> 32), true);
            class205.field3524.method1054(class99.field1826, 2);
            class205.field3524.method1066(-1687589720, class119.field2152);
            class205.field3524.method1065(class3.field91, 1210792072);
        }
        if (var4 == 4) {
            class180 var25 = class55.field1180[var5];
            if (var25 != null) {
                class57.field1215++;
                class178.method1199(class137.field2441.field4119[0], (byte) 124, var25.field4182[0], 0, 1, 0, var25.field4119[0], class137.field2441.field4182[0], 0, false, 2, 1);
                class112.field2045 = 0;
                class123.field2210 = class105.field1952;
                class180.field3123 = class74.field1430;
                class81.field1570 = 2;
                class205.field3524.method908(false, 255);
                class205.field3524.method1018((byte) -11, var5);
            }
        }
        if (var4 == 37) {
            class161.field2818++;
            boolean var26 = class178.method1199(class137.field2441.field4119[0], (byte) 114, var2, 0, 0, 0, var3, class137.field2441.field4182[0], 0, false, 2, 0);
            if (!var26) {
                class178.method1199(class137.field2441.field4119[0], (byte) 117, var2, 0, 1, 0, var3, class137.field2441.field4182[0], 0, false, 2, 1);
            }
            class112.field2045 = 0;
            class180.field3123 = class74.field1430;
            class81.field1570 = 2;
            class123.field2210 = class105.field1952;
            class205.field3524.method908(false, 106);
            class205.field3524.method1018((byte) -11, var2 + class244.field4232);
            class205.field3524.method1065(var5, 1210792072);
            class205.field3524.method1054(class231.field3878 + var3, 2);
        }
        if (var4 == 1) {
            class197 var28 = class92.field1758[var5];
            if (var28 != null) {
                class41.field842++;
                class178.method1199(class137.field2441.field4119[0], (byte) 119, var28.field4182[0], 0, 1, 0, var28.field4119[0], class137.field2441.field4182[0], 0, false, 2, 1);
                class123.field2210 = class105.field1952;
                class81.field1570 = 2;
                class180.field3123 = class74.field1430;
                class112.field2045 = 0;
                class205.field3524.method908(false, 122);
                class205.field3524.method1018((byte) -11, var5);
            }
        }
        if (var4 == 31) {
            class180 var29 = class55.field1180[var5];
            if (var29 != null) {
                class220.field3730++;
                class178.method1199(class137.field2441.field4119[0], (byte) 121, var29.field4182[0], 0, 1, 0, var29.field4119[0], class137.field2441.field4182[0], 0, false, 2, 1);
                class112.field2045 = 0;
                class123.field2210 = class105.field1952;
                class81.field1570 = 2;
                class180.field3123 = class74.field1430;
                class205.field3524.method908(false, 142);
                class205.field3524.method1054(var5, 2);
            }
        }
        if (var4 == 23) {
            class255.field4368++;
            class205.field3524.method908(false, 96);
            class205.field3524.method1065(var5, 1210792072);
            class205.field3524.method1065(var2, 1210792072);
            class205.field3524.method1030(var3, -72);
            class125.field2246 = 0;
            class125.field2244 = class221.method1456(var3, (byte) -122);
            class199.field3404 = var2;
        }
        if (var4 == 30) {
            class32.field621++;
            class116.method826(var2, var6, var3, (byte) 72);
            class205.field3524.method908(false, 67);
            class205.field3524.method1054(class244.field4232 + var2, 2);
            class205.field3524.method1065((int) (var6 >>> 32) & Integer.MAX_VALUE, 1210792072);
            class205.field3524.method1065(class231.field3878 + var3, 1210792072);
        }
        if (var4 == 58) {
            class180 var30 = class55.field1180[var5];
            if (var30 != null) {
                class178.method1199(class137.field2441.field4119[0], (byte) 124, var30.field4182[0], 0, 1, 0, var30.field4119[0], class137.field2441.field4182[0], 0, false, 2, 1);
                class180.field3123 = class74.field1430;
                class112.field2045 = 0;
                class123.field2210 = class105.field1952;
                class81.field1570 = 2;
                class95.field1793++;
                class205.field3524.method908(false, 156);
                class205.field3524.method1054(class10.field191, 2);
                class205.field3524.method1066(-1687589720, class29.field556);
                class205.field3524.method1065(var5, 1210792072);
            }
        }
        if (var4 == 41) {
            class205.field3524.method908(false, 42);
            class16.field358++;
            class205.field3524.method1065(var2, 1210792072);
            class205.field3524.method1054(var5, 2);
            class205.field3524.method1030(var3, -125);
            class125.field2246 = 0;
            class125.field2244 = class221.method1456(var3, (byte) -97);
            class199.field3404 = var2;
        }
        if (var4 == 43) {
            class180 var31 = class55.field1180[var5];
            if (var31 != null) {
                class102.field1886++;
                class178.method1199(class137.field2441.field4119[0], (byte) 120, var31.field4182[0], 0, 1, 0, var31.field4119[0], class137.field2441.field4182[0], 0, false, 2, 1);
                class112.field2045 = 0;
                class180.field3123 = class74.field1430;
                class123.field2210 = class105.field1952;
                class81.field1570 = 2;
                class205.field3524.method908(false, 46);
                class205.field3524.method1065(var5, 1210792072);
            }
        }
        if (var4 == 16) {
            class183.field3185++;
            boolean var32 = class178.method1199(class137.field2441.field4119[0], (byte) 118, var2, 0, 0, 0, var3, class137.field2441.field4182[0], 0, false, 2, 0);
            if (!var32) {
                class178.method1199(class137.field2441.field4119[0], (byte) 125, var2, 0, 1, 0, var3, class137.field2441.field4182[0], 0, false, 2, 1);
            }
            class81.field1570 = 2;
            class180.field3123 = class74.field1430;
            class123.field2210 = class105.field1952;
            class112.field2045 = 0;
            class205.field3524.method908(false, 91);
            class205.field3524.method1018((byte) -11, class231.field3878 + var3);
            class205.field3524.method1018((byte) -11, var5);
            class205.field3524.method1065(class3.field91, 1210792072);
            class205.field3524.method1071(class119.field2152, (byte) 119);
            class205.field3524.method1054(class244.field4232 + var2, 2);
            class205.field3524.method1018((byte) -11, class99.field1826);
        }
        if (var4 == 3) {
            class135.method939(class189.field3261, var2, var3);
        }
        if (var4 == 1002) {
            class123.field2210 = class105.field1952;
            class180.field3123 = class74.field1430;
            class81.field1570 = 2;
            class112.field2045 = 0;
            class197 var34 = class92.field1758[var5];
            if (var34 != null) {
                class198 var35 = var34.field3322;
                if (var35.field3393 != null) {
                    var35 = var35.method1324((byte) 125);
                }
                if (var35 != null) {
                    class29.field558++;
                    class205.field3524.method908(false, 63);
                    class205.field3524.method1047(var35.field3347, true);
                }
            }
        }
        if (var4 == 22) {
            class197 var36 = class92.field1758[var5];
            if (var36 != null) {
                class178.method1199(class137.field2441.field4119[0], (byte) 127, var36.field4182[0], 0, 1, 0, var36.field4119[0], class137.field2441.field4182[0], 0, false, 2, 1);
                class257.field4392++;
                class123.field2210 = class105.field1952;
                class112.field2045 = 0;
                class180.field3123 = class74.field1430;
                class81.field1570 = 2;
                class205.field3524.method908(false, 124);
                class205.field3524.method1054(var5, 2);
            }
        }
        if (var4 == 40) {
            class205.field3524.method908(false, 89);
            class205.field3524.method1018((byte) -11, var2);
            class205.field3524.method1018((byte) -11, var5);
            class205.field3524.method1030(var3, -33);
            class125.field2246 = 0;
            class55.field1181++;
            class125.field2244 = class221.method1456(var3, (byte) -83);
            class199.field3404 = var2;
        }
        if (var4 == 8) {
            class197 var37 = class92.field1758[var5];
            if (var37 != null) {
                class32.field615++;
                class178.method1199(class137.field2441.field4119[0], (byte) 115, var37.field4182[0], 0, 1, 0, var37.field4119[0], class137.field2441.field4182[0], 0, false, 2, 1);
                class81.field1570 = 2;
                class180.field3123 = class74.field1430;
                class112.field2045 = 0;
                class123.field2210 = class105.field1952;
                class205.field3524.method908(false, 211);
                class205.field3524.method1054(var5, 2);
            }
        }
        if (var4 == 19 && class73.field1421 == null) {
            class90.method668(-125, var2, var3);
            class73.field1421 = class148.method996(var3, -1, var2);
            class257.method1718(false, class73.field1421);
        }
        if (var4 == 39) {
            class180 var38 = class55.field1180[var5];
            if (var38 != null) {
                class59.field1241++;
                class178.method1199(class137.field2441.field4119[0], (byte) 116, var38.field4182[0], 0, 1, 0, var38.field4119[0], class137.field2441.field4182[0], 0, false, 2, 1);
                class180.field3123 = class74.field1430;
                class81.field1570 = 2;
                class112.field2045 = 0;
                class123.field2210 = class105.field1952;
                class205.field3524.method908(false, 251);
                class205.field3524.method1065(var5, 1210792072);
            }
        }
        if (var4 == 46) {
            class205.field3524.method908(false, 147);
            class205.field3524.method1066(-1687589720, var3);
            class19.field404++;
            class44 var39 = class221.method1456(var3, (byte) -80);
            if (var39.field867 != null && var39.field867[0][0] == 5) {
                int var40 = var39.field867[0][1];
                if (class117.field2100[var40] != var39.field881[0]) {
                    class117.field2100[var40] = var39.field881[0];
                    class188.method1268(-10, var40);
                }
            }
        }
        if (var4 == 38) {
            class205.field3524.method908(false, 223);
            class205.field3524.method1030(var3, -62);
            class182.field3167++;
            class205.field3524.method1018((byte) -11, var2);
            class205.field3524.method1018((byte) -11, var5);
            class125.field2246 = 0;
            class125.field2244 = class221.method1456(var3, (byte) -47);
            class199.field3404 = var2;
        }
        if (var4 == 45) {
            class119.field2139++;
            boolean var41 = class178.method1199(class137.field2441.field4119[0], (byte) 111, var2, 0, 0, 0, var3, class137.field2441.field4182[0], 0, false, 2, 0);
            if (!var41) {
                class178.method1199(class137.field2441.field4119[0], (byte) 114, var2, 0, 1, 0, var3, class137.field2441.field4182[0], 0, false, 2, 1);
            }
            class81.field1570 = 2;
            class123.field2210 = class105.field1952;
            class112.field2045 = 0;
            class180.field3123 = class74.field1430;
            class205.field3524.method908(false, 183);
            class205.field3524.method1047(var2 + class244.field4232, true);
            class205.field3524.method1054(class231.field3878 + var3, 2);
            class205.field3524.method1018((byte) -11, class10.field191);
            class205.field3524.method1018((byte) -11, var5);
            class205.field3524.method1066(-1687589720, class29.field556);
        }
        if (var4 == 25) {
            class205.field3524.method908(false, 220);
            class85.field1659++;
            class205.field3524.method1047(var5, true);
            class205.field3524.method1047(class99.field1826, true);
            class205.field3524.method1047(class3.field91, true);
            class205.field3524.method1030(class119.field2152, -75);
            class205.field3524.method1066(-1687589720, var3);
            class205.field3524.method1047(var2, true);
            class125.field2246 = 0;
            class125.field2244 = class221.method1456(var3, (byte) -93);
            class199.field3404 = var2;
        }
        if (var4 == 51) {
            field3820++;
            boolean var43 = class178.method1199(class137.field2441.field4119[0], (byte) 124, var2, 0, 0, 0, var3, class137.field2441.field4182[0], 0, false, 2, 0);
            if (!var43) {
                class178.method1199(class137.field2441.field4119[0], (byte) 115, var2, 0, 1, 0, var3, class137.field2441.field4182[0], 0, false, 2, 1);
            }
            class123.field2210 = class105.field1952;
            class180.field3123 = class74.field1430;
            class81.field1570 = 2;
            class112.field2045 = 0;
            class205.field3524.method908(false, 97);
            class205.field3524.method1047(var5, true);
            class205.field3524.method1047(class244.field4232 + var2, true);
            class205.field3524.method1018((byte) -11, class231.field3878 + var3);
        }
        if (var4 == 6) {
            class197 var45 = class92.field1758[var5];
            if (var45 != null) {
                class178.method1199(class137.field2441.field4119[0], (byte) 118, var45.field4182[0], 0, 1, 0, var45.field4119[0], class137.field2441.field4182[0], 0, false, 2, 1);
                class180.field3123 = class74.field1430;
                class112.field2045 = 0;
                class50.field1113++;
                class123.field2210 = class105.field1952;
                class81.field1570 = 2;
                class205.field3524.method908(false, 177);
                class205.field3524.method1054(var5, 2);
            }
        }
        if (var4 == 9) {
            class44 var46 = class221.method1456(var3, (byte) -57);
            boolean var47 = true;
            if (var46.field949 > 0) {
                var47 = class191.method1296(var46, 91);
            }
            if (var47) {
                class205.field3524.method908(false, 147);
                class19.field404++;
                class205.field3524.method1066(-1687589720, var3);
            }
        }
        if (var4 == 1007) {
            class81.field1570 = 2;
            class112.field2045 = 0;
            class236.field4043++;
            class180.field3123 = class74.field1430;
            class123.field2210 = class105.field1952;
            class205.field3524.method908(false, 207);
            class205.field3524.method1018((byte) -11, var5);
        }
        if (var4 == 15) {
            class44 var48 = class148.method996(var3, -1, var2);
            if (var48 != null) {
                class231.method1507(109);
                class225.method1474(var3, var2, class137.method946(client.method590(var48), (byte) 124), (byte) -42);
                class31.field611 = 0;
                class181.field3143 = class69.method525(-10182, var48);
                if (class181.field3143 == null) {
                    class181.field3143 = class136.field2440;
                }
                if (var48.field990) {
                    class72.field1405 = class233.method1528(new class257[] { var48.field923, class30.field572 }, 0);
                    return;
                }
                class72.field1405 = class233.method1528(new class257[] { class238.field4090, var48.field894, class30.field572 }, 0);
            }
            return;
        }
        if (var4 == 1004) {
            class220.field3724++;
            class116.method826(var2, var6, var3, (byte) 116);
            class205.field3524.method908(false, 73);
            class205.field3524.method1018((byte) -11, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class205.field3524.method1047(var2 + class244.field4232, true);
            class205.field3524.method1065(class231.field3878 + var3, 1210792072);
        }
        if (var4 == 11) {
            class189.method1274(false);
        }
        if (var4 == 1006) {
            class123.field2210 = class105.field1952;
            class112.field2045 = 0;
            class198.field3379++;
            class81.field1570 = 2;
            class180.field3123 = class74.field1430;
            class205.field3524.method908(false, 193);
            class205.field3524.method1065(var5, 1210792072);
        }
        if (var4 == 35 || var4 == 1005) {
            class250.method1634(var3, var2, -10, class92.field1757[arg0], var5);
        }
        if (var4 == 44) {
            class197 var49 = class92.field1758[var5];
            if (var49 != null) {
                field3819++;
                class178.method1199(class137.field2441.field4119[0], (byte) 118, var49.field4182[0], 0, 1, 0, var49.field4119[0], class137.field2441.field4182[0], 0, false, 2, 1);
                class180.field3123 = class74.field1430;
                class112.field2045 = 0;
                class123.field2210 = class105.field1952;
                class81.field1570 = 2;
                class205.field3524.method908(false, 40);
                class205.field3524.method1066(-1687589720, class29.field556);
                class205.field3524.method1018((byte) -11, class10.field191);
                class205.field3524.method1018((byte) -11, var5);
            }
        }
        if (var4 == 17) {
            class41.field841++;
            class205.field3524.method908(false, 130);
            class205.field3524.method1018((byte) -11, var5);
            class205.field3524.method1047(var2, true);
            class205.field3524.method1030(var3, -85);
            class125.field2246 = 0;
            class125.field2244 = class221.method1456(var3, (byte) -75);
            class199.field3404 = var2;
        }
        if (class31.field611 != 0) {
            class31.field611 = 0;
            class257.method1718(false, class221.method1456(class119.field2152, (byte) -11));
        }
        if (class257.field4404) {
            class231.method1507(83);
        }
        if (class125.field2244 != null && class125.field2246 == 0) {
            class257.method1718(false, class125.field2244);
        }
    }
}
