import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class119 extends class29 {

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "Lwd;")
    public class88 field1830;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "Z")
    public static boolean field1827 = false;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "Lqg;")
    public static class256 field1831 = new class256();

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
    public static int field1832 = 0;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "Lpm;")
    public static class111 field1834 = new class111(64);

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "F")
    public static float field1835;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "Lva;")
    public static class156 field1825;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "Lok;")
    public static class160 field1829;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "Lmf;")
    public static class53 field1833;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V", line = 6)
    public static void method830(int arg0) {
        field1834 = null;
        field1825 = null;
        if (arg0 != -989) {
            field1832 = 24;
        }
        field1833 = null;
        field1831 = null;
        field1829 = null;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)V", line = 23)
    public static final void method831(int arg0, int arg1) {
        field1826++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class19.field270[arg1];
        int var3 = class300.field4675[arg1];
        int var4 = class50.field686[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        long var5 = class214.field3464[arg1];
        int var7 = (int) class214.field3464[arg1];
        if (var4 == 1007) {
            class231.field3699 = class221.field3521;
            class8.field91 = class144.field2158;
            class258.field4081 = 2;
            class342.field5336++;
            class233.field3728 = 0;
            class21.field313.method1541(57, 166);
            class21.field313.method1361(var7, arg0 - 488903776);
        }
        if (var4 == 20) {
            class272.field4316++;
            class21.field313.method1541(-107, 194);
            class21.field313.method1361(var7, arg0 ^ 0xE2DBEBA0);
            class21.field313.method1361(var2, -488903776);
            class21.field313.method1395((byte) 0, var3);
            client.field4230 = 0;
            class169.field2710 = class37.method238((byte) 123, var3);
            class221.field3525 = var2;
        }
        if (var4 == 42) {
            class196 var8 = class297.field4657[var7];
            if (var8 != null) {
                class231.field3699 = class221.field3521;
                class233.field3728 = 0;
                class258.field4081 = 2;
                class95.field1457++;
                class8.field91 = class144.field2158;
                class21.field313.method1541(-113, 221);
                class21.field313.method1344((byte) 74, class333.field5177[82] ? 1 : 0);
                class21.field313.method1359(arg0 ^ 0xFFFFFF80, var7);
            }
        }
        if (var4 == 49) {
            class320 var9 = class100.field1523[var7];
            if (var9 != null) {
                class231.field3699 = class221.field3521;
                class209.field3425++;
                class8.field91 = class144.field2158;
                class233.field3728 = 0;
                class258.field4081 = 2;
                class21.field313.method1541(arg0 ^ 0xFFFFFFAF, 60);
                class21.field313.method1401(var7, -16384);
                class21.field313.method1344((byte) 74, class333.field5177[82] ? 1 : 0);
            }
        }
        if (var4 == 15) {
            class196 var10 = class297.field4657[var7];
            if (var10 != null) {
                class231.field3699 = class221.field3521;
                class341.field5310++;
                class233.field3728 = 0;
                class258.field4081 = 2;
                class8.field91 = class144.field2158;
                class21.field313.method1541(-70, 242);
                class21.field313.method1359(114, var7);
                class21.field313.method1365(-32769, class333.field5177[82] ? 1 : 0);
            }
        }
        if (var4 == 33) {
            class10.method58((byte) 87);
            class160 var11 = class37.method238((byte) 82, var3);
            class228.field3619 = var7;
            class105.field1597 = var2;
            class49.field676 = 1;
            class18.field255 = var3;
            class219.method1600(var11, 98);
            class318.field4930 = "<col=ff9040>" + class31.method198(false, var7).field996 + "<col=ffffff>";
            if (class318.field4930 == null) {
                class318.field4930 = "null";
            }
            return;
        }
        if (var4 == 44) {
            class320 var12 = class100.field1523[var7];
            if (var12 != null) {
                class8.field91 = class144.field2158;
                class258.field4081 = 2;
                class225.field3579++;
                class233.field3728 = 0;
                class231.field3699 = class221.field3521;
                class21.field313.method1541(-98, 195);
                class21.field313.method1401(var7, -16384);
                class21.field313.method1370(-88, class333.field5177[82] ? 1 : 0);
            }
        }
        if (var4 == 14) {
            class196 var13 = class297.field4657[var7];
            if (var13 != null) {
                class258.field4081 = 2;
                class233.field3728 = 0;
                class8.field91 = class144.field2158;
                class231.field3699 = class221.field3521;
                class21.field313.method1541(arg0 ^ 0x6D, 139);
                class21.field313.method1406(class333.field5177[82] ? 1 : 0, (byte) 100);
                class280.field4397++;
                class21.field313.method1368(var7, 4796);
            }
        }
        if (var4 == 47) {
            class103.field1578++;
            class21.field313.method1541(105, 101);
            class21.field313.method1382(true, var3);
            class21.field313.method1401(var2, arg0 - 16384);
            class21.field313.method1401(var7, -16384);
            client.field4230 = 0;
            class169.field2710 = class37.method238((byte) -86, var3);
            class221.field3525 = var2;
        }
        if (var4 == 41) {
            class258.field4081 = 2;
            class8.field91 = class144.field2158;
            class202.field3300++;
            class231.field3699 = class221.field3521;
            class233.field3728 = 0;
            class21.field313.method1541(arg0 - 114, 249);
            class21.field313.method1401(var7, -16384);
            class21.field313.method1401(class181.field2925 + var2, arg0 ^ 0xFFFFC000);
            class21.field313.method1401(class24.field351 + var3, -16384);
            class21.field313.method1370(-128, class333.field5177[82] ? 1 : 0);
        }
        if (var4 == 7) {
            class21.field313.method1541(arg0 ^ 0x33, 220);
            class21.field313.method1401(var2, -16384);
            class21.field313.method1359(62, var7);
            class280.field4412++;
            class21.field313.method1382(true, var3);
            client.field4230 = 0;
            class169.field2710 = class37.method238((byte) -107, var3);
            class221.field3525 = var2;
        }
        if (var4 == 21) {
            class21.field313.method1541(127, 184);
            class21.field313.method1350(var3, -71);
            class258.field4084++;
            class21.field313.method1359(arg0 ^ 0xFFFFFF84, var2);
            class21.field313.method1359(90, var7);
            client.field4230 = 0;
            class169.field2710 = class37.method238((byte) 41, var3);
            class221.field3525 = var2;
        }
        if (var4 == 58) {
            class231.field3699 = class221.field3521;
            class95.field1456++;
            class233.field3728 = 0;
            class8.field91 = class144.field2158;
            class258.field4081 = 2;
            class21.field313.method1541(-93, 56);
            class21.field313.method1368(var3 + class24.field351, 4796);
            class21.field313.method1401(class181.field2925 + var2, -16384);
            class21.field313.method1365(-32769, class333.field5177[82] ? 1 : 0);
            class21.field313.method1401(var7, arg0 ^ 0xFFFFC000);
        }
        if (var4 == 34) {
            class320 var14 = class100.field1523[var7];
            if (var14 != null) {
                class100.field1531++;
                class233.field3728 = 0;
                class258.field4081 = 2;
                class231.field3699 = class221.field3521;
                class8.field91 = class144.field2158;
                class21.field313.method1541(104, 177);
                class21.field313.method1359(114, var7);
                class21.field313.method1344((byte) 74, class333.field5177[82] ? 1 : 0);
                class21.field313.method1359(arg0 - 105, class228.field3619);
                class21.field313.method1401(class105.field1597, arg0 - 16384);
                class21.field313.method1395((byte) 0, class18.field255);
            }
        }
        if (var4 == 16) {
            class233.field3728 = 0;
            class173.field2759++;
            class258.field4081 = 2;
            class231.field3699 = class221.field3521;
            class8.field91 = class144.field2158;
            class21.field313.method1541(88, 168);
            class21.field313.method1359(71, class228.field3619);
            class21.field313.method1368(class181.field2925 + var2, arg0 + 4796);
            class21.field313.method1361(class105.field1597, -488903776);
            class21.field313.method1395((byte) 0, class18.field255);
            class21.field313.method1359(-102, class24.field351 + var3);
            class21.field313.method1365(-32769, class333.field5177[82] ? 1 : 0);
            class21.field313.method1361((int) (var5 >>> 32) & Integer.MAX_VALUE, -488903776);
        }
        if (var4 == 60) {
            class233.field3719++;
            class21.field313.method1541(-100, 107);
            class21.field313.method1350(var3, -83);
            class160 var15 = class37.method238((byte) 85, var3);
            if (var15.field2504 != null && var15.field2504[0][0] == 5) {
                int var16 = var15.field2504[0][1];
                class29.field422[var16] = 1 - class29.field422[var16];
                class276.method1966(var16, (byte) 82);
            }
        }
        if (var4 == 6) {
            class8.field91 = class144.field2158;
            class233.field3728 = 0;
            class231.field3699 = class221.field3521;
            class258.field4081 = 2;
            class101.field1537++;
            class21.field313.method1541(-94, 245);
            class21.field313.method1368(var7, 4796);
            class21.field313.method1368(class288.field4531, 4796);
            class21.field313.method1401(var2 + class181.field2925, -16384);
            class21.field313.method1370(-123, class333.field5177[82] ? 1 : 0);
            class21.field313.method1359(-120, class24.field351 + var3);
            class21.field313.method1404(349082664, class131.field1933);
        }
        if (var4 == 11) {
            class324.field5059++;
            class21.field313.method1541(arg0 ^ 0xFFFFFF9C, 3);
            class21.field313.method1361(class105.field1597, -488903776);
            class21.field313.method1359(-123, class228.field3619);
            class21.field313.method1395((byte) 0, class18.field255);
            class21.field313.method1368(var7, 4796);
            class21.field313.method1359(90, var2);
            class21.field313.method1404(349082664, var3);
            client.field4230 = 0;
            class169.field2710 = class37.method238((byte) -79, var3);
            class221.field3525 = var2;
        }
        if (var4 == 5) {
            class21.field313.method1541(-125, 35);
            class41.field566++;
            class21.field313.method1395((byte) 0, var3);
            class21.field313.method1359(121, var2);
            class21.field313.method1368(var7, 4796);
            client.field4230 = 0;
            class169.field2710 = class37.method238((byte) -107, var3);
            class221.field3525 = var2;
        }
        if (var4 == 9) {
            if (var7 == 0) {
                class26.field375 = 1;
                class172.method1176(class148.field2209, var2, var3);
            } else if (class254.field4033 > 0 && class333.field5177[82] && class333.field5177[81]) {
                class3.method12((byte) 100, class148.field2209, class181.field2925 + var2, class24.field351 + var3);
            } else {
                class172.field2743++;
                class21.field313.method1541(arg0 ^ 0x7E, 161);
                class21.field313.method1359(-128, class181.field2925 + var2);
                class21.field313.method1359(-122, class24.field351 + var3);
            }
        }
        if (var4 == 1001) {
            class231.field3699 = class221.field3521;
            class233.field3728 = 0;
            class258.field4081 = 2;
            class8.field91 = class144.field2158;
            class193.field3169++;
            class21.field313.method1541(-127, 28);
            class21.field313.method1401(var7, arg0 ^ 0xFFFFC000);
        }
        if (var4 == 43) {
            class320 var17 = class100.field1523[var7];
            if (var17 != null) {
                class233.field3728 = 0;
                class8.field91 = class144.field2158;
                class281.field4423++;
                class231.field3699 = class221.field3521;
                class258.field4081 = 2;
                class21.field313.method1541(-55, 43);
                class21.field313.method1361(var7, -488903776);
                class21.field313.method1370(-102, class333.field5177[82] ? 1 : 0);
            }
        }
        if (var4 == 51) {
            class231.field3699 = class221.field3521;
            class258.field4081 = 2;
            class233.field3728 = 0;
            class71.field912++;
            class8.field91 = class144.field2158;
            class21.field313.method1541(-56, 253);
            class21.field313.method1401(class181.field2925 + var2, -16384);
            class21.field313.method1370(-84, class333.field5177[82] ? 1 : 0);
            class21.field313.method1401(class24.field351 + var3, -16384);
            class21.field313.method1368(Integer.MAX_VALUE & (int) (var5 >>> 32), 4796);
        }
        if (var4 == 12) {
            class196 var18 = class297.field4657[var7];
            if (var18 != null) {
                class333.field5179++;
                class233.field3728 = 0;
                class8.field91 = class144.field2158;
                class231.field3699 = class221.field3521;
                class258.field4081 = 2;
                class21.field313.method1541(126, 72);
                class21.field313.method1370(-62, class333.field5177[82] ? 1 : 0);
                class21.field313.method1368(var7, 4796);
            }
        }
        if (var4 == 10) {
            class21.field313.method1541(-82, 178);
            class21.field313.method1361(var7, -488903776);
            class21.field313.method1361(var2, -488903776);
            class243.field3863++;
            class21.field313.method1350(var3, -124);
            client.field4230 = 0;
            class169.field2710 = class37.method238((byte) 76, var3);
            class221.field3525 = var2;
        }
        if (var4 == 57) {
            class233.field3728 = 0;
            class8.field91 = class144.field2158;
            class40.field560++;
            class258.field4081 = 2;
            class231.field3699 = class221.field3521;
            class21.field313.method1541(38, 19);
            class21.field313.method1359(-120, class181.field2925 + var2);
            class21.field313.method1406(class333.field5177[82] ? 1 : 0, (byte) 108);
            class21.field313.method1368((int) (var5 >>> 32) & Integer.MAX_VALUE, 4796);
            class21.field313.method1359(124, var3 + class24.field351);
        }
        if (var4 == 19) {
            class21.field313.method1541(76, 244);
            class290.field4568++;
            class21.field313.method1382(true, var3);
            class21.field313.method1382(true, class131.field1933);
            class21.field313.method1359(arg0 ^ 0xFFFFFF90, var2);
            class21.field313.method1359(-106, class288.field4531);
        }
        if (var4 == 8) {
            class8.field91 = class144.field2158;
            class233.field3728 = 0;
            class312.field4855++;
            class258.field4081 = 2;
            class231.field3699 = class221.field3521;
            class21.field313.method1541(arg0 ^ 0xFFFFFFC5, 87);
            class21.field313.method1359(123, var7);
            class21.field313.method1365(-32769, class333.field5177[82] ? 1 : 0);
            class21.field313.method1361(class181.field2925 + var2, arg0 + -488903776);
            class21.field313.method1368(class24.field351 + var3, 4796);
        }
        if (var4 == 35) {
            class21.field313.method1541(arg0 ^ 0xFFFFFFB6, 57);
            class201.field3295++;
            class21.field313.method1359(56, var2);
            class21.field313.method1382(true, var3);
            class21.field313.method1368(var7, arg0 + 4796);
            client.field4230 = 0;
            class169.field2710 = class37.method238((byte) 94, var3);
            class221.field3525 = var2;
        }
        if (var4 == 1005) {
            class8.field91 = class144.field2158;
            class231.field3699 = class221.field3521;
            class233.field3728 = 0;
            class49.field679++;
            class258.field4081 = 2;
            class21.field313.method1541(-86, 227);
            class21.field313.method1370(arg0 ^ 0xFFFFFFA9, class333.field5177[82] ? 1 : 0);
            class21.field313.method1401(class181.field2925 + var2, -16384);
            class21.field313.method1368((int) (var5 >>> 32) & Integer.MAX_VALUE, arg0 ^ 0x12BC);
            class21.field313.method1368(class24.field351 + var3, 4796);
        }
        if (var4 == 39) {
            class320 var19 = class100.field1523[var7];
            if (var19 != null) {
                class233.field3728 = 0;
                class231.field3699 = class221.field3521;
                class231.field3691++;
                class258.field4081 = 2;
                class8.field91 = class144.field2158;
                class21.field313.method1541(arg0 ^ 0x47, 186);
                class21.field313.method1361(var7, -488903776);
                class21.field313.method1370(arg0 - 85, class333.field5177[82] ? 1 : 0);
            }
        }
        if (var4 == 48) {
            class258.field4081 = 2;
            class115.field1725++;
            class8.field91 = class144.field2158;
            class231.field3699 = class221.field3521;
            class233.field3728 = 0;
            class21.field313.method1541(arg0 + 106, 33);
            class21.field313.method1344((byte) 74, class333.field5177[82] ? 1 : 0);
            class21.field313.method1401(Integer.MAX_VALUE & (int) (var5 >>> 32), -16384);
            class21.field313.method1361(class181.field2925 + var2, arg0 ^ 0xE2DBEBA0);
            class21.field313.method1401(class24.field351 + var3, -16384);
        }
        if (var4 == 13) {
            class196 var20 = class297.field4657[var7];
            if (var20 != null) {
                class8.field91 = class144.field2158;
                class258.field4081 = 2;
                class90.field1376++;
                class231.field3699 = class221.field3521;
                class233.field3728 = 0;
                class21.field313.method1541(121, 47);
                class21.field313.method1368(var7, arg0 + 4796);
                class21.field313.method1370(-63, class333.field5177[82] ? 1 : 0);
            }
        }
        if (var4 == 24) {
            if (var7 == 0) {
                class274.field4351 = 1;
                class172.method1176(class148.field2209, var2, var3);
            } else if (var7 == 1) {
                class210.field3434++;
                class21.field313.method1541(82, 147);
                class21.field313.method1368(class181.field2925 + var2, 4796);
                class21.field313.method1395((byte) 0, class131.field1933);
                class21.field313.method1401(class288.field4531, -16384);
                class21.field313.method1401(class24.field351 + var3, -16384);
            }
        }
        if (var4 == 32) {
            class320 var21 = class100.field1523[var7];
            if (var21 != null) {
                class320.field5020++;
                class8.field91 = class144.field2158;
                class258.field4081 = 2;
                class233.field3728 = 0;
                class231.field3699 = class221.field3521;
                class21.field313.method1541(-85, 193);
                class21.field313.method1370(arg0 ^ 0xFFFFFFB5, class333.field5177[82] ? 1 : 0);
                class21.field313.method1359(88, var7);
            }
        }
        if (var4 == 1) {
            class95.field1458++;
            class231.field3699 = class221.field3521;
            class233.field3728 = 0;
            class8.field91 = class144.field2158;
            class258.field4081 = 2;
            class21.field313.method1541(127, 46);
            class21.field313.method1395((byte) 0, class18.field255);
            class21.field313.method1370(-61, class333.field5177[82] ? 1 : 0);
            class21.field313.method1361(class181.field2925 + var2, -488903776);
            class21.field313.method1361(class105.field1597, arg0 ^ 0xE2DBEBA0);
            class21.field313.method1368(class228.field3619, arg0 + 4796);
            class21.field313.method1359(-109, var3 + class24.field351);
            class21.field313.method1361(var7, -488903776);
        }
        if (var4 == 18) {
            class320 var22 = class100.field1523[var7];
            if (var22 != null) {
                class233.field3728 = 0;
                class8.field91 = class144.field2158;
                class231.field3699 = class221.field3521;
                class131.field1937++;
                class258.field4081 = 2;
                class21.field313.method1541(arg0 ^ 0xFFFFFF88, 202);
                class21.field313.method1361(class288.field4531, -488903776);
                class21.field313.method1350(class131.field1933, -115);
                class21.field313.method1344((byte) 74, class333.field5177[82] ? 1 : 0);
                class21.field313.method1368(var7, 4796);
            }
        }
        if (var4 == 17) {
            class320 var23 = class100.field1523[var7];
            if (var23 != null) {
                class231.field3699 = class221.field3521;
                class238.field3768++;
                class258.field4081 = 2;
                class8.field91 = class144.field2158;
                class233.field3728 = 0;
                class21.field313.method1541(-84, 150);
                class21.field313.method1344((byte) 74, class333.field5177[82] ? 1 : 0);
                class21.field313.method1359(-126, var7);
            }
        }
        if (var4 == 3) {
            class260.field4141++;
            class21.field313.method1541(arg0 - 71, 240);
            class21.field313.method1404(349082664, var3);
            class21.field313.method1401(var2, -16384);
            class21.field313.method1361(var7, -488903776);
            client.field4230 = 0;
            class169.field2710 = class37.method238((byte) 23, var3);
            class221.field3525 = var2;
        }
        if (var4 == 29) {
            if (var7 == 0) {
                class172.method1176(class148.field2209, var2, var3);
            } else if (var7 == 1) {
                if (class254.field4033 > 0 && class333.field5177[82] && class333.field5177[81]) {
                    class3.method12((byte) 100, class148.field2209, class181.field2925 + var2, class24.field351 + var3);
                } else {
                    class184.method1264(1, var3, var2, (byte) 95);
                    class21.field313.method1365(-32769, class107.field1615);
                    class21.field313.method1365(arg0 - 32769, class20.field289);
                    class21.field313.method1368((int) class312.field4862, 4796);
                    class21.field313.method1365(-32769, 57);
                    class21.field313.method1365(arg0 ^ 0xFFFF7FFF, class339.field5253);
                    class21.field313.method1365(arg0 ^ 0xFFFF7FFF, class313.field4882);
                    class21.field313.method1365(-32769, 89);
                    class21.field313.method1368(class13.field159.field1980, 4796);
                    class21.field313.method1368(class13.field159.field1944, 4796);
                    class21.field313.method1365(-32769, class288.field4537);
                    class21.field313.method1365(-32769, 63);
                }
            }
        }
        if (var4 == 30) {
            class21.field313.method1541(-66, 107);
            class21.field313.method1350(var3, -54);
            class160 var24 = class37.method238((byte) -125, var3);
            class233.field3719++;
            if (var24.field2504 != null && var24.field2504[0][0] == 5) {
                int var25 = var24.field2504[0][1];
                if (class29.field422[var25] != var24.field2490[0]) {
                    class29.field422[var25] = var24.field2490[0];
                    class276.method1966(var25, (byte) 82);
                }
            }
        }
        if (var4 == 1004) {
            class231.field3699 = class221.field3521;
            class258.field4081 = 2;
            class233.field3728 = 0;
            class8.field91 = class144.field2158;
            class196 var26 = class297.field4657[var7];
            if (var26 != null) {
                class118 var27 = var26.field3210;
                if (var27.field1786 != null) {
                    var27 = var27.method819((byte) -9);
                }
                if (var27 != null) {
                    class50.field694++;
                    class21.field313.method1541(-78, 39);
                    class21.field313.method1359(-122, var27.field1801);
                }
            }
        }
        if (var4 == 25) {
            class320 var28 = class100.field1523[var7];
            if (var28 != null) {
                class258.field4081 = 2;
                class8.field91 = class144.field2158;
                class233.field3728 = 0;
                class231.field3699 = class221.field3521;
                class21.field313.method1541(-106, 207);
                class175.field2816++;
                class21.field313.method1344((byte) 74, class333.field5177[82] ? 1 : 0);
                class21.field313.method1359(arg0 ^ 0x21, var7);
            }
        }
        if (var4 == 46) {
            class200.field3288++;
            class21.field313.method1541(-70, 110);
            class21.field313.method1395((byte) 0, var3);
            class21.field313.method1361(var7, arg0 - 488903776);
            class21.field313.method1368(var2, 4796);
            client.field4230 = 0;
            class169.field2710 = class37.method238((byte) 115, var3);
            class221.field3525 = var2;
        }
        if (var4 == 28) {
            class160 var29 = class37.method238((byte) -99, var3);
            boolean var30 = true;
            if (var29.field2461 > 0) {
                var30 = class339.method2335(var29, true);
            }
            if (var30) {
                class21.field313.method1541(arg0 ^ 0x25, 107);
                class21.field313.method1350(var3, arg0 ^ 0xFFFFFFCF);
                class233.field3719++;
            }
        }
        if (var4 == 23) {
            class233.field3728 = 0;
            class8.field91 = class144.field2158;
            class258.field4081 = 2;
            class253.field4025++;
            class231.field3699 = class221.field3521;
            class21.field313.method1541(110, 12);
            class21.field313.method1401(var3 + class24.field351, -16384);
            class21.field313.method1361(var7, -488903776);
            class21.field313.method1361(class181.field2925 + var2, -488903776);
            class21.field313.method1365(-32769, class333.field5177[82] ? 1 : 0);
        }
        if (var4 == 40) {
            class196 var31 = class297.field4657[var7];
            if (var31 != null) {
                class233.field3728 = 0;
                class215.field3476++;
                class8.field91 = class144.field2158;
                class231.field3699 = class221.field3521;
                class258.field4081 = 2;
                class21.field313.method1541(81, 175);
                class21.field313.method1401(var7, -16384);
                class21.field313.method1406(class333.field5177[82] ? 1 : 0, (byte) 85);
                class21.field313.method1361(class288.field4531, arg0 - 488903776);
                class21.field313.method1350(class131.field1933, arg0 ^ 0xFFFFFFD6);
            }
        }
        if (var4 == 2 || var4 == 1006) {
            class184.method1268(var2, class147.field2199[arg1], var3, arg0 + 4, var7);
        }
        if (var4 == 31 && class10.field109 == null) {
            class121.method840(var3, arg0 ^ 0x7F, var2);
            class10.field109 = class241.method1709(var2, arg0 + 89, var3);
            class219.method1600(class10.field109, arg0 ^ 0x6C);
        }
        if (var4 == 45) {
            class320 var32 = class100.field1523[var7];
            if (var32 != null) {
                class231.field3699 = class221.field3521;
                class233.field3728 = 0;
                class8.field91 = class144.field2158;
                class258.field4081 = 2;
                class291.field4578++;
                class21.field313.method1541(-56, 180);
                class21.field313.method1401(var7, arg0 - 16384);
                class21.field313.method1370(arg0 ^ 0xFFFFFFA6, class333.field5177[82] ? 1 : 0);
            }
        }
        if (var4 == 4) {
            class21.field313.method1541(62, 13);
            class231.field3695++;
            class21.field313.method1368(var7, 4796);
            class21.field313.method1368(var2, 4796);
            class21.field313.method1395((byte) 0, var3);
            class21.field313.method1404(349082664, class131.field1933);
            class21.field313.method1359(arg0 + 96, class288.field4531);
            client.field4230 = 0;
            class169.field2710 = class37.method238((byte) -125, var3);
            class221.field3525 = var2;
        }
        if (var4 == 36) {
            class231.field3699 = class221.field3521;
            class238.field3767++;
            class258.field4081 = 2;
            class233.field3728 = 0;
            class8.field91 = class144.field2158;
            class21.field313.method1541(-104, 116);
            class21.field313.method1361(Integer.MAX_VALUE & (int) (var5 >>> 32), -488903776);
            class21.field313.method1350(class131.field1933, -93);
            class21.field313.method1368(class181.field2925 + var2, 4796);
            class21.field313.method1368(class288.field4531, 4796);
            class21.field313.method1406(class333.field5177[82] ? 1 : 0, (byte) -90);
            class21.field313.method1361(class24.field351 + var3, -488903776);
        }
        if (var4 == 50) {
            class114.field1719++;
            class231.field3699 = class221.field3521;
            class8.field91 = class144.field2158;
            class233.field3728 = 0;
            class258.field4081 = 2;
            class21.field313.method1541(arg0 + 52, 74);
            class21.field313.method1370(-128, class333.field5177[82] ? 1 : 0);
            class21.field313.method1368(var3 + class24.field351, 4796);
            class21.field313.method1401(var7, -16384);
            class21.field313.method1361(class181.field2925 + var2, arg0 + -488903776);
        }
        if (var4 == 26) {
            class196 var33 = class297.field4657[var7];
            if (var33 != null) {
                class231.field3699 = class221.field3521;
                class329.field5123++;
                class258.field4081 = 2;
                class8.field91 = class144.field2158;
                class233.field3728 = 0;
                class21.field313.method1541(114, 8);
                class21.field313.method1365(-32769, class333.field5177[82] ? 1 : 0);
                class21.field313.method1401(class228.field3619, -16384);
                class21.field313.method1401(var7, arg0 ^ 0xFFFFC000);
                class21.field313.method1350(class18.field255, -83);
                class21.field313.method1401(class105.field1597, -16384);
            }
        }
        if (var4 == 59) {
            class160 var35 = class241.method1709(var2, arg0 ^ 0x50, var3);
            if (var35 != null) {
                class10.method58((byte) 103);
                class170 var36 = client.method1913(var35);
                class189.method1337(var2, (byte) 73, var35.field2475, var36.method1172((byte) -57), var3, var36.field2712, var35.field2536);
                class49.field676 = 0;
                class282.field4458 = class93.method673(0, var35);
                if (var35.field2551) {
                    class315.field4903 = var35.field2525 + "<col=ffffff>";
                } else {
                    class315.field4903 = "<col=00ff00>" + var35.field2547 + "<col=ffffff>";
                }
                if (class282.field4458 == null) {
                    class282.field4458 = "Null";
                }
            }
            return;
        }
        if (var4 == 37) {
            class206.field3373++;
            class258.field4081 = 2;
            class8.field91 = class144.field2158;
            class231.field3699 = class221.field3521;
            class233.field3728 = 0;
            class21.field313.method1541(arg0 ^ 0x19, 52);
            class21.field313.method1359(126, class24.field351 + var3);
            class21.field313.method1344((byte) 74, class333.field5177[82] ? 1 : 0);
            class21.field313.method1368(Integer.MAX_VALUE & (int) (var5 >>> 32), 4796);
            class21.field313.method1361(class181.field2925 + var2, -488903776);
        }
        if (var4 == 1002) {
            class160 var34 = class37.method238((byte) 86, var3);
            if (var34 == null || var34.field2559[var2] < 100000) {
                class193.field3169++;
                class21.field313.method1541(arg0 + 109, 28);
                class21.field313.method1401(var7, -16384);
            } else {
                class245.method1740((byte) 79, 0, "", var34.field2559[var2] + " x " + class31.method198(false, var7).field996);
            }
            client.field4230 = 0;
            class169.field2710 = class37.method238((byte) -105, var3);
            class221.field3525 = var2;
        }
        if (var4 == 38) {
            class142.field2122++;
            class21.field313.method1541(46, 170);
            class21.field313.method1404(349082664, var3);
            class21.field313.method1359(-128, var7);
            class21.field313.method1368(var2, 4796);
            client.field4230 = 0;
            class169.field2710 = class37.method238((byte) 64, var3);
            class221.field3525 = var2;
        }
        if (var4 == 22) {
            class48.method333(arg0);
        }
        if (class49.field676 != arg0) {
            class49.field676 = 0;
            class219.method1600(class37.method238((byte) -122, class18.field255), 112);
        }
        if (class313.field4874) {
            class10.method58((byte) 54);
        }
        if (class169.field2710 != null && client.field4230 == 0) {
            class219.method1600(class169.field2710, arg0 ^ 0x62);
        }
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V", line = 1051)
    public static final void method832(int arg0) {
        class5.field54.method1623(1);
        field1828++;
        class308.field4813.method1623(1);
        class189.field3075.method1623(arg0 + 20718);
        if (arg0 != -20717) {
            method830(-111);
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lwd;)V", line = 1068)
    public class119(class88 arg0) {
        this.field1830 = arg0;
    }
}
