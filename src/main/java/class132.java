import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class132 {

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "Z")
    public static volatile boolean field2112 = false;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field2118 = 0;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "Lja;")
    public static class64 field2113;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "Lja;")
    public static class64 field2117;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1001(int arg0) {
        field2115++;
        class152.field2447.method1832((byte) -125);
        class13.field242.method1832((byte) -98);
        if (arg0 != -35) {
            method1001(-26);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILja;)V", line = 16)
    public static final void method1002(int arg0, class64 arg1) {
        field2116++;
        if (class143.field2252) {
            return;
        }
        if (class265.field4126) {
            class262.method1853();
        } else {
            class182.method1351();
        }
        class196.field3118 = class136.method1045(class202.field3178, 118, arg1);
        int var2 = class73.field1127;
        int var3 = var2 * 956 / 503;
        class196.field3118.method56((class180.field2880 - var3) / 2, 0, var3, var2);
        class9.field141 = class212.method1539(arg1, class12.field234, (byte) -117);
        int var4 = -42 % ((-arg0 - 68) / 38);
        class9.field141.method1526(class180.field2880 / 2 - (class9.field141.field4264 / 2), 18);
        class143.field2252 = true;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IB)V", line = 46)
    public static final void method1003(int arg0, byte arg1) {
        field2114++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class156.field2492[arg0];
        int var3 = class59.field930[arg0];
        int var4 = class12.field233[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = (int) class311.field4888[arg0];
        long var6 = class311.field4888[arg0];
        if (var4 == 48) {
            class94.field1530++;
            boolean var8 = class152.method1162(0, 0, class19.field356.field1388[0], 2, var2, true, class19.field356.field1386[0], 0, var3, false, 0, 0);
            if (!var8) {
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var2, true, class19.field356.field1386[0], 1, var3, false, 0, 0);
            }
            class128.field2043 = class223.field3569;
            class98.field1625 = class267.field4136;
            class159.field2514 = 0;
            class277.field4292 = 2;
            class269.field4191.method246(false, 181);
            class269.field4191.method728(class30.field493, 1234856744);
            class269.field4191.method739(class177.field2780 + var2, -50);
            class269.field4191.method739(var5, -75);
            class269.field4191.method784(121, class233.field3692);
            class269.field4191.method737(class91.field1485 + var3, 109);
        }
        if (var4 == 1003) {
            class159.field2514 = 0;
            class120.field1923++;
            class277.field4292 = 2;
            class128.field2043 = class223.field3569;
            class98.field1625 = class267.field4136;
            class269.field4191.method246(false, 64);
            class269.field4191.method728(var5, 1234856744);
        }
        if (var4 == 3) {
            class244.field3767++;
            class269.field4191.method246(false, 107);
            class269.field4191.method784(100, var3);
            class292 var10 = class215.method1555((byte) -48, var3);
            if (var10.field4556 != null && var10.field4556[0][0] == 5) {
                int var11 = var10.field4556[0][1];
                if (class278.field4304[var11] != var10.field4466[0]) {
                    class278.field4304[var11] = var10.field4466[0];
                    class141.method1076(var11, 5);
                }
            }
        }
        if (var4 == 47) {
            class30 var12 = class82.field1228[var5];
            if (var12 != null) {
                class329.field5100++;
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var12.field1386[0], true, class19.field356.field1386[0], 1, var12.field1388[0], false, 0, 0);
                class128.field2043 = class223.field3569;
                class277.field4292 = 2;
                class159.field2514 = 0;
                class98.field1625 = class267.field4136;
                class269.field4191.method246(false, 37);
                class269.field4191.method785(100, var5);
                class269.field4191.method784(-47, class233.field3692);
                class269.field4191.method737(class30.field493, 105);
            }
        }
        if (var4 == 36) {
            class27.field445++;
            boolean var13 = class152.method1162(0, 0, class19.field356.field1388[0], 2, var2, true, class19.field356.field1386[0], 0, var3, false, 0, 0);
            if (!var13) {
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var2, true, class19.field356.field1386[0], 1, var3, false, 0, 0);
            }
            class98.field1625 = class267.field4136;
            class277.field4292 = 2;
            class128.field2043 = class223.field3569;
            class159.field2514 = 0;
            class269.field4191.method246(false, 220);
            class269.field4191.method745(class284.field4367, (byte) 73);
            class269.field4191.method728(class326.field5058, 1234856744);
            class269.field4191.method737(class91.field1485 + var3, 107);
            class269.field4191.method728(class177.field2780 + var2, 1234856744);
            class269.field4191.method739(class83.field1239, 99);
            class269.field4191.method737(var5, -83);
        }
        if (var4 == 44) {
            class329.field5090++;
            class269.field4191.method246(false, 46);
            class269.field4191.method784(-60, var3);
            class269.field4191.method785(111, var2);
            class269.field4191.method737(var5, -90);
            class48.field805 = 0;
            class270.field4207 = class215.method1555((byte) -48, var3);
            class303.field4776 = var2;
        }
        if (var4 == 45) {
            class305 var15 = class138.field2196[var5];
            if (var15 != null) {
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var15.field1386[0], true, class19.field356.field1386[0], 1, var15.field1388[0], false, 0, 0);
                class277.field4292 = 2;
                class159.field2514 = 0;
                class98.field1625 = class267.field4136;
                class64.field1010++;
                class128.field2043 = class223.field3569;
                class269.field4191.method246(false, 236);
                class269.field4191.method785(127, var5);
            }
        }
        if (var4 == 9) {
            class11.field199++;
            class46.method364(10, var3, var2, var6);
            class269.field4191.method246(false, 122);
            class269.field4191.method785(119, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class269.field4191.method728(class91.field1485 + var3, 1234856744);
            class269.field4191.method737(class177.field2780 + var2, 16);
        }
        if (var4 == 30) {
            class196.field3121++;
            class269.field4191.method246(false, 57);
            class269.field4191.method745(var3, (byte) 54);
            class269.field4191.method739(var2, -127);
            class269.field4191.method737(var5, -97);
            class48.field805 = 0;
            class270.field4207 = class215.method1555((byte) -48, var3);
            class303.field4776 = var2;
        }
        if (var4 == 14 && class46.method364(10, var3, var2, var6)) {
            class223.field3594++;
            class269.field4191.method246(false, 90);
            class269.field4191.method737((int) (var6 >>> 32) & Integer.MAX_VALUE, 114);
            class269.field4191.method785(127, var3 + class91.field1485);
            class269.field4191.method784(96, class284.field4367);
            class269.field4191.method728(class83.field1239, 1234856744);
            class269.field4191.method785(111, class177.field2780 + var2);
            class269.field4191.method785(118, class326.field5058);
        }
        if (var4 == 29) {
            class305 var16 = class138.field2196[var5];
            if (var16 != null) {
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var16.field1386[0], true, class19.field356.field1386[0], 1, var16.field1388[0], false, 0, 0);
                class277.field4292 = 2;
                class159.field2514 = 0;
                class128.field2043 = class223.field3569;
                class68.field1090++;
                class98.field1625 = class267.field4136;
                class269.field4191.method246(false, 114);
                class269.field4191.method728(var5, 1234856744);
            }
        }
        if (var4 == 35) {
            if (var5 == 0) {
                class261.method1844(class41.field734, var2, var3);
            } else if (var5 == 1) {
                if (class235.field3699 > 0 && class108.field1795[82] && class108.field1795[81]) {
                    class183.method1374(class41.field734, class91.field1485 + var3, class177.field2780 + var2, (byte) -108);
                } else if (class152.method1162(0, 0, class19.field356.field1388[0], 1, var2, true, class19.field356.field1386[0], 0, var3, true, 0, 0)) {
                    class269.field4191.method772((byte) -96, class268.field4161);
                    class269.field4191.method772((byte) -91, class300.field4725);
                    class269.field4191.method728(class248.field3833, 1234856744);
                    class269.field4191.method772((byte) -74, 57);
                    class269.field4191.method772((byte) -68, class204.field3234);
                    class269.field4191.method772((byte) -60, class123.field1970);
                    class269.field4191.method772((byte) -84, 89);
                    class269.field4191.method728(class19.field356.field1442, 1234856744);
                    class269.field4191.method728(class19.field356.field1369, 1234856744);
                    class269.field4191.method772((byte) -72, class122.field1951);
                    class269.field4191.method772((byte) -72, 63);
                }
            }
        }
        if (var4 == 5) {
            if (var5 == 0) {
                class109.field1806 = 1;
                class261.method1844(class41.field734, var2, var3);
            } else if (var5 == 1) {
                class269.field4191.method246(false, 187);
                class319.field4979++;
                class269.field4191.method739(class91.field1485 + var3, 64);
                class269.field4191.method737(class177.field2780 + var2, 123);
                class269.field4191.method729((byte) 25, class233.field3692);
                class269.field4191.method728(class30.field493, 1234856744);
            }
        }
        if (var4 == 42) {
            if (class141.field2241 == 1) {
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var2, true, class19.field356.field1386[0], 1, var3, false, 0, 0);
            } else {
                boolean var17 = class152.method1162(0, 0, class19.field356.field1388[0], 2, var2, true, class19.field356.field1386[0], 0, var3, false, 0, 0);
                if (!var17) {
                    class152.method1162(0, 1, class19.field356.field1388[0], 2, var2, true, class19.field356.field1386[0], 1, var3, false, 0, 0);
                }
            }
            class277.field4292 = 2;
            class128.field2043 = class223.field3569;
            class159.field2514 = 0;
            class98.field1625 = class267.field4136;
            class269.field4191.method246(false, 252);
            class269.field4191.method728(class177.field2780 + var2, 1234856744);
            class269.field4191.method785(111, var5);
            class269.field4191.method785(117, var3 + class91.field1485);
            class124.field1974++;
        }
        if (var4 == 2) {
            class292 var50 = class41.method330(var3, var2, -1);
            if (var50 != null) {
                class107.method820(77);
                class42 var51 = client.method1786(var50);
                client.method1794(var50.field4529, var3, 0, var2, var50.field4445, var51.method345(0), var51.field746);
                class152.field2451 = 0;
                class239.field3722 = class206.method1506(false, var50);
                if (var50.field4537) {
                    class82.field1232 = var50.field4435 + "<col=ffffff>";
                } else {
                    class82.field1232 = "<col=00ff00>" + var50.field4550 + "<col=ffffff>";
                }
                if (class239.field3722 == null) {
                    class239.field3722 = "Null";
                }
            }
            return;
        }
        if (var4 == 18 || var4 == 1006) {
            class89.method642(11, var2, class13.field246[arg0], var5, var3);
        }
        if (var4 == 51) {
            class30 var19 = class82.field1228[var5];
            if (var19 != null) {
                class30.field497++;
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var19.field1386[0], true, class19.field356.field1386[0], 1, var19.field1388[0], false, 0, 0);
                class98.field1625 = class267.field4136;
                class159.field2514 = 0;
                class277.field4292 = 2;
                class128.field2043 = class223.field3569;
                class269.field4191.method246(false, 96);
                class269.field4191.method785(108, var5);
            }
        }
        if (var4 == 28) {
            class196.field3124++;
            class269.field4191.method246(false, 179);
            class269.field4191.method737(var2, 16);
            class269.field4191.method745(var3, (byte) 114);
            class269.field4191.method737(var5, -91);
            class48.field805 = 0;
            class270.field4207 = class215.method1555((byte) -48, var3);
            class303.field4776 = var2;
        }
        if (var4 == 16) {
            class30 var20 = class82.field1228[var5];
            if (var20 != null) {
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var20.field1386[0], true, class19.field356.field1386[0], 1, var20.field1388[0], false, 0, 0);
                class128.field2043 = class223.field3569;
                class277.field4292 = 2;
                class295.field4674++;
                class159.field2514 = 0;
                class98.field1625 = class267.field4136;
                class269.field4191.method246(false, 245);
                class269.field4191.method728(var5, 1234856744);
            }
        }
        if (var4 == 49) {
            class30 var21 = class82.field1228[var5];
            if (var21 != null) {
                class272.field4211++;
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var21.field1386[0], true, class19.field356.field1386[0], 1, var21.field1388[0], false, 0, 0);
                class159.field2514 = 0;
                class277.field4292 = 2;
                class128.field2043 = class223.field3569;
                class98.field1625 = class267.field4136;
                class269.field4191.method246(false, 167);
                class269.field4191.method785(103, var5);
            }
        }
        if (var4 == 6) {
            class305 var22 = class138.field2196[var5];
            if (var22 != null) {
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var22.field1386[0], true, class19.field356.field1386[0], 1, var22.field1388[0], false, 0, 0);
                class98.field1625 = class267.field4136;
                class94.field1535++;
                class128.field2043 = class223.field3569;
                class159.field2514 = 0;
                class277.field4292 = 2;
                class269.field4191.method246(false, 77);
                class269.field4191.method739(var5, 73);
            }
        }
        if (var4 == 43) {
            class30 var23 = class82.field1228[var5];
            if (var23 != null) {
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var23.field1386[0], true, class19.field356.field1386[0], 1, var23.field1388[0], false, 0, 0);
                class98.field1625 = class267.field4136;
                class128.field2043 = class223.field3569;
                class250.field3855++;
                class159.field2514 = 0;
                class277.field4292 = 2;
                class269.field4191.method246(false, 60);
                class269.field4191.method739(var5, 122);
            }
        }
        if (var4 == 38) {
            class63.field985++;
            if (class141.field2241 == 1) {
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var2, true, class19.field356.field1386[0], 1, var3, false, 0, 0);
            } else {
                boolean var24 = class152.method1162(0, 0, class19.field356.field1388[0], 2, var2, true, class19.field356.field1386[0], 0, var3, false, 0, 0);
                if (!var24) {
                    class152.method1162(0, 1, class19.field356.field1388[0], 2, var2, true, class19.field356.field1386[0], 1, var3, false, 0, 0);
                }
            }
            class277.field4292 = 2;
            class98.field1625 = class267.field4136;
            class159.field2514 = 0;
            class128.field2043 = class223.field3569;
            class269.field4191.method246(false, 11);
            class269.field4191.method737(class91.field1485 + var3, 113);
            class269.field4191.method739(var5, 103);
            class269.field4191.method737(var2 + class177.field2780, -88);
        }
        if (var4 == 1) {
            class269.field4191.method246(false, 195);
            class40.field711++;
            class269.field4191.method739(var5, 100);
            class269.field4191.method773(-92, var3);
            class269.field4191.method728(var2, 1234856744);
            class48.field805 = 0;
            class270.field4207 = class215.method1555((byte) -48, var3);
            class303.field4776 = var2;
        }
        if (var4 == 40 && class46.method364(10, var3, var2, var6)) {
            class269.field4191.method246(false, 173);
            class269.field4191.method728((int) (var6 >>> 32) & Integer.MAX_VALUE, 1234856744);
            class269.field4191.method728(class91.field1485 + var3, 1234856744);
            class269.field4191.method773(-86, class233.field3692);
            class210.field3347++;
            class269.field4191.method737(class30.field493, 9);
            class269.field4191.method728(var2 + class177.field2780, 1234856744);
        }
        if (var4 == 57) {
            class107.method820(80);
            class292 var26 = class215.method1555((byte) -48, var3);
            class152.field2451 = 1;
            class83.field1239 = var5;
            class326.field5058 = var2;
            class284.field4367 = var3;
            class143.method1091(var26, (byte) 68);
            class258.field3979 = "<col=ff9040>" + class208.method1521(-1361, var5).field2825 + "<col=ffffff>";
            if (class258.field3979 == null) {
                class258.field3979 = "null";
            }
            return;
        }
        int var27 = 116 % ((50 - arg1) / 57);
        if (var4 == 25) {
            boolean var28 = true;
            class292 var29 = class215.method1555((byte) -48, var3);
            if (var29.field4477 > 0) {
                var28 = class328.method2245(var29, -125);
            }
            if (var28) {
                class244.field3767++;
                class269.field4191.method246(false, 107);
                class269.field4191.method784(-115, var3);
            }
        }
        if (var4 == 20) {
            class30 var30 = class82.field1228[var5];
            if (var30 != null) {
                class4.field18++;
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var30.field1386[0], true, class19.field356.field1386[0], 1, var30.field1388[0], false, 0, 0);
                class128.field2043 = class223.field3569;
                class159.field2514 = 0;
                class98.field1625 = class267.field4136;
                class277.field4292 = 2;
                class269.field4191.method246(false, 172);
                class269.field4191.method737(var5, 118);
            }
        }
        if (var4 == 15) {
            class14.method124(238);
        }
        if (var4 == 1007) {
            class20.field373++;
            class46.method364(10, var3, var2, var6);
            class269.field4191.method246(false, 110);
            class269.field4191.method785(104, class177.field2780 + var2);
            class269.field4191.method739(Integer.MAX_VALUE & (int) (var6 >>> 32), 121);
            class269.field4191.method739(class91.field1485 + var3, 102);
        }
        if (var4 == 13) {
            class42.field739++;
            class46.method364(10, var3, var2, var6);
            class269.field4191.method246(false, 30);
            class269.field4191.method739(class91.field1485 + var3, 101);
            class269.field4191.method728(var2 + class177.field2780, 1234856744);
            class269.field4191.method737(Integer.MAX_VALUE & (int) (var6 >>> 32), 122);
        }
        if (var4 == 60) {
            class269.field4191.method246(false, 5);
            class269.field4191.method737(var2, -127);
            class217.field3478++;
            class269.field4191.method745(var3, (byte) 121);
            class269.field4191.method745(class233.field3692, (byte) 54);
            class269.field4191.method739(class30.field493, -64);
            class269.field4191.method737(var5, 103);
            class48.field805 = 0;
            class270.field4207 = class215.method1555((byte) -48, var3);
            class303.field4776 = var2;
        }
        if (var4 == 37) {
            class269.field4191.method246(false, 148);
            class269.field4191.method739(var2, -126);
            class269.field4191.method728(var5, 1234856744);
            class269.field4191.method729((byte) 25, var3);
            class76.field1161++;
            class48.field805 = 0;
            class270.field4207 = class215.method1555((byte) -48, var3);
            class303.field4776 = var2;
        }
        if (var4 == 19) {
            class305 var31 = class138.field2196[var5];
            if (var31 != null) {
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var31.field1386[0], true, class19.field356.field1386[0], 1, var31.field1388[0], false, 0, 0);
                class98.field1625 = class267.field4136;
                class128.field2043 = class223.field3569;
                class159.field2514 = 0;
                class277.field4292 = 2;
                class269.field4191.method246(false, 255);
                class269.field4191.method785(121, var5);
                class273.field4255++;
            }
        }
        if (var4 == 33) {
            class289.field4410++;
            class46.method364(10, var3, var2, var6);
            class269.field4191.method246(false, 237);
            class269.field4191.method728((int) (var6 >>> 32) & Integer.MAX_VALUE, 1234856744);
            class269.field4191.method728(var3 + class91.field1485, 1234856744);
            class269.field4191.method739(class177.field2780 + var2, -66);
        }
        if (var4 == 1004) {
            class328.field5073++;
            class128.field2043 = class223.field3569;
            class98.field1625 = class267.field4136;
            class159.field2514 = 0;
            class277.field4292 = 2;
            class269.field4191.method246(false, 129);
            class269.field4191.method728(var5, 1234856744);
        }
        if (var4 == 21) {
            class269.field4191.method246(false, 81);
            class12.field225++;
            class269.field4191.method739(class326.field5058, 88);
            class269.field4191.method745(var3, (byte) 61);
            class269.field4191.method785(106, var2);
            class269.field4191.method728(var5, 1234856744);
            class269.field4191.method785(116, class83.field1239);
            class269.field4191.method773(-56, class284.field4367);
            class48.field805 = 0;
            class270.field4207 = class215.method1555((byte) -48, var3);
            class303.field4776 = var2;
        }
        if (var4 == 26) {
            class305 var32 = class138.field2196[var5];
            if (var32 != null) {
                class11.field186++;
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var32.field1386[0], true, class19.field356.field1386[0], 1, var32.field1388[0], false, 0, 0);
                class98.field1625 = class267.field4136;
                class277.field4292 = 2;
                class159.field2514 = 0;
                class128.field2043 = class223.field3569;
                class269.field4191.method246(false, 164);
                class269.field4191.method784(-105, class233.field3692);
                class269.field4191.method739(var5, -124);
                class269.field4191.method785(115, class30.field493);
            }
        }
        if (var4 == 39) {
            class305 var33 = class138.field2196[var5];
            if (var33 != null) {
                class169.field2627++;
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var33.field1386[0], true, class19.field356.field1386[0], 1, var33.field1388[0], false, 0, 0);
                class277.field4292 = 2;
                class159.field2514 = 0;
                class128.field2043 = class223.field3569;
                class98.field1625 = class267.field4136;
                class269.field4191.method246(false, 154);
                class269.field4191.method739(var5, -74);
                class269.field4191.method737(class326.field5058, -3);
                class269.field4191.method729((byte) 25, class284.field4367);
                class269.field4191.method737(class83.field1239, 9);
            }
        }
        if (var4 == 1002) {
            class128.field2043 = class223.field3569;
            class159.field2514 = 0;
            class98.field1625 = class267.field4136;
            class277.field4292 = 2;
            class305 var34 = class138.field2196[var5];
            if (var34 != null) {
                class208 var35 = var34.field4778;
                if (var35.field3313 != null) {
                    var35 = var35.method1518(-4841);
                }
                if (var35 != null) {
                    class319.field4973++;
                    class269.field4191.method246(false, 67);
                    class269.field4191.method739(var35.field3299, 58);
                }
            }
        }
        if (var4 == 32 && class168.field2612 == null) {
            class247.method1756(-1941, var3, var2);
            class168.field2612 = class41.method330(var3, var2, -1);
            class143.method1091(class168.field2612, (byte) 36);
        }
        if (var4 == 7) {
            class269.field4191.method246(false, 107);
            class269.field4191.method784(81, var3);
            class244.field3767++;
            class292 var36 = class215.method1555((byte) -48, var3);
            if (var36.field4556 != null && var36.field4556[0][0] == 5) {
                int var37 = var36.field4556[0][1];
                class278.field4304[var37] = 1 - class278.field4304[var37];
                class141.method1076(var37, 5);
            }
        }
        if (var4 == 11) {
            class30 var38 = class82.field1228[var5];
            if (var38 != null) {
                client.field3909++;
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var38.field1386[0], true, class19.field356.field1386[0], 1, var38.field1388[0], false, 0, 0);
                class159.field2514 = 0;
                class98.field1625 = class267.field4136;
                class128.field2043 = class223.field3569;
                class277.field4292 = 2;
                class269.field4191.method246(false, 43);
                class269.field4191.method785(126, var5);
            }
        }
        if (var4 == 1005) {
            class292 var39 = class215.method1555((byte) -48, var3);
            if (var39 == null || var39.field4480[var2] < 100000) {
                class120.field1923++;
                class269.field4191.method246(false, 64);
                class269.field4191.method728(var5, 1234856744);
            } else {
                class252.method1782(var39.field4480[var2] + " x " + class208.method1521(-1361, var5).field2825, 0, "", false);
            }
            class48.field805 = 0;
            class270.field4207 = class215.method1555((byte) -48, var3);
            class303.field4776 = var2;
        }
        if (var4 == 22) {
            if (class141.field2241 == 1) {
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var2, true, class19.field356.field1386[0], 1, var3, false, 0, 0);
            } else {
                boolean var40 = class152.method1162(0, 0, class19.field356.field1388[0], 2, var2, true, class19.field356.field1386[0], 0, var3, false, 0, 0);
                if (!var40) {
                    class152.method1162(0, 1, class19.field356.field1388[0], 2, var2, true, class19.field356.field1386[0], 1, var3, false, 0, 0);
                }
            }
            class100.field1649++;
            class98.field1625 = class267.field4136;
            class128.field2043 = class223.field3569;
            class159.field2514 = 0;
            class277.field4292 = 2;
            class269.field4191.method246(false, 214);
            class269.field4191.method728(var3 + class91.field1485, 1234856744);
            class269.field4191.method737(var5, -114);
            class269.field4191.method737(class177.field2780 + var2, -36);
        }
        if (var4 == 24) {
            class269.field4191.method246(false, 201);
            class180.field2875++;
            class269.field4191.method773(-71, var3);
            class269.field4191.method728(var5, 1234856744);
            class269.field4191.method739(var2, 62);
            class48.field805 = 0;
            class270.field4207 = class215.method1555((byte) -48, var3);
            class303.field4776 = var2;
        }
        if (var4 == 50) {
            class30 var42 = class82.field1228[var5];
            if (var42 != null) {
                class25.field420++;
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var42.field1386[0], true, class19.field356.field1386[0], 1, var42.field1388[0], false, 0, 0);
                class277.field4292 = 2;
                class98.field1625 = class267.field4136;
                class128.field2043 = class223.field3569;
                class159.field2514 = 0;
                class269.field4191.method246(false, 189);
                class269.field4191.method728(var5, 1234856744);
            }
        }
        if (var4 == 4) {
            class233.field3691++;
            class269.field4191.method246(false, 141);
            class269.field4191.method784(-104, class233.field3692);
            class269.field4191.method784(-84, var3);
            class269.field4191.method785(126, class30.field493);
            class269.field4191.method785(108, var2);
        }
        if (var4 == 12) {
            class30 var43 = class82.field1228[var5];
            if (var43 != null) {
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var43.field1386[0], true, class19.field356.field1386[0], 1, var43.field1388[0], false, 0, 0);
                class277.field4292 = 2;
                class159.field2514 = 0;
                class98.field1625 = class267.field4136;
                class312.field4903++;
                class128.field2043 = class223.field3569;
                class269.field4191.method246(false, 247);
                class269.field4191.method739(var5, 92);
            }
        }
        if (var4 == 31) {
            class249.field3846++;
            class269.field4191.method246(false, 71);
            class269.field4191.method739(var5, 98);
            class269.field4191.method729((byte) 25, var3);
            class269.field4191.method737(var2, 23);
            class48.field805 = 0;
            class270.field4207 = class215.method1555((byte) -48, var3);
            class303.field4776 = var2;
        }
        if (var4 == 41) {
            class169.field2642++;
            class269.field4191.method246(false, 103);
            class269.field4191.method745(var3, (byte) 64);
            class269.field4191.method785(100, var5);
            class269.field4191.method785(116, var2);
            class48.field805 = 0;
            class270.field4207 = class215.method1555((byte) -48, var3);
            class303.field4776 = var2;
        }
        if (var4 == 59) {
            class39.field698++;
            class46.method364(10, var3, var2, var6);
            class269.field4191.method246(false, 168);
            class269.field4191.method785(109, var3 + class91.field1485);
            class269.field4191.method739(class177.field2780 + var2, 60);
            class269.field4191.method785(98, (int) (var6 >>> 32) & Integer.MAX_VALUE);
        }
        if (var4 == 34) {
            if (class141.field2241 == 1) {
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var2, true, class19.field356.field1386[0], 1, var3, false, 0, 0);
            } else {
                boolean var44 = class152.method1162(0, 0, class19.field356.field1388[0], 2, var2, true, class19.field356.field1386[0], 0, var3, false, 0, 0);
                if (!var44) {
                    class152.method1162(0, 1, class19.field356.field1388[0], 2, var2, true, class19.field356.field1386[0], 1, var3, false, 0, 0);
                }
            }
            class53.field836++;
            class98.field1625 = class267.field4136;
            class128.field2043 = class223.field3569;
            class277.field4292 = 2;
            class159.field2514 = 0;
            class269.field4191.method246(false, 74);
            class269.field4191.method785(107, class91.field1485 + var3);
            class269.field4191.method728(class177.field2780 + var2, 1234856744);
            class269.field4191.method728(var5, 1234856744);
        }
        if (var4 == 58) {
            class251.field3867++;
            class269.field4191.method246(false, 95);
            class269.field4191.method785(127, var5);
            class269.field4191.method737(var2, 125);
            class269.field4191.method745(var3, (byte) 66);
            class48.field805 = 0;
            class270.field4207 = class215.method1555((byte) -48, var3);
            class303.field4776 = var2;
        }
        if (var4 == 23) {
            if (var5 == 0) {
                class102.field1727 = 1;
                class261.method1844(class41.field734, var2, var3);
            } else if (class235.field3699 > 0 && class108.field1795[82] && class108.field1795[81]) {
                class183.method1374(class41.field734, class91.field1485 + var3, class177.field2780 + var2, (byte) -108);
            } else {
                class269.field4191.method246(false, 153);
                class269.field4191.method785(105, class91.field1485 + var3);
                class232.field3683++;
                class269.field4191.method737(class177.field2780 + var2, 107);
            }
        }
        if (var4 == 8) {
            class30 var46 = class82.field1228[var5];
            if (var46 != null) {
                class275.field4272++;
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var46.field1386[0], true, class19.field356.field1386[0], 1, var46.field1388[0], false, 0, 0);
                class159.field2514 = 0;
                class98.field1625 = class267.field4136;
                class277.field4292 = 2;
                class128.field2043 = class223.field3569;
                class269.field4191.method246(false, 193);
                class269.field4191.method785(105, var5);
                class269.field4191.method728(class326.field5058, 1234856744);
                class269.field4191.method773(-83, class284.field4367);
                class269.field4191.method785(124, class83.field1239);
            }
        }
        if (var4 == 17) {
            class269.field4191.method246(false, 6);
            class269.field4191.method728(var5, 1234856744);
            class269.field4191.method745(var3, (byte) 65);
            class10.field155++;
            class269.field4191.method737(var2, -73);
            class48.field805 = 0;
            class270.field4207 = class215.method1555((byte) -48, var3);
            class303.field4776 = var2;
        }
        if (var4 == 10) {
            class86.field1319++;
            if (class141.field2241 == 1) {
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var2, true, class19.field356.field1386[0], 1, var3, false, 0, 0);
            } else {
                boolean var47 = class152.method1162(0, 0, class19.field356.field1388[0], 2, var2, true, class19.field356.field1386[0], 0, var3, false, 0, 0);
                if (!var47) {
                    class152.method1162(0, 1, class19.field356.field1388[0], 2, var2, true, class19.field356.field1386[0], 1, var3, false, 0, 0);
                }
            }
            class128.field2043 = class223.field3569;
            class98.field1625 = class267.field4136;
            class277.field4292 = 2;
            class159.field2514 = 0;
            class269.field4191.method246(false, 246);
            class269.field4191.method739(class177.field2780 + var2, -41);
            class269.field4191.method785(125, class91.field1485 + var3);
            class269.field4191.method728(var5, 1234856744);
        }
        if (var4 == 46) {
            class305 var49 = class138.field2196[var5];
            if (var49 != null) {
                class152.method1162(0, 1, class19.field356.field1388[0], 2, var49.field1386[0], true, class19.field356.field1386[0], 1, var49.field1388[0], false, 0, 0);
                class128.field2043 = class223.field3569;
                class159.field2514 = 0;
                class88.field1344++;
                class277.field4292 = 2;
                class98.field1625 = class267.field4136;
                class269.field4191.method246(false, 50);
                class269.field4191.method785(108, var5);
            }
        }
        if (class152.field2451 != 0) {
            class152.field2451 = 0;
            class143.method1091(class215.method1555((byte) -48, class284.field4367), (byte) 42);
        }
        if (class219.field3514) {
            class107.method820(95);
        }
        if (class270.field4207 != null && class48.field805 == 0) {
            class143.method1091(class270.field4207, (byte) 97);
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V", line = 1120)
    public static void method1004(int arg0) {
        if (arg0 == 0) {
            field2117 = null;
            field2113 = null;
        }
    }
}
