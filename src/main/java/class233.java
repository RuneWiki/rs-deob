import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class233 {

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    private int field3746;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "[[I")
    private int[][] field3748;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    private int field3734;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field3747 = 2;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3744 = "Discard";

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Lqd;")
    public static class173 field3742 = new class173(64);

    @OriginalMember(owner = "client!n", name = "p", descriptor = "[I")
    public static int[] field3749 = new int[256];

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Ldk;")
    public static class251 field3735;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "Lgl;")
    public static class289 field3750;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "[Lbl;")
    public static class146[] field3739;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)I")
    public final int method1570(byte arg0, int arg1) {
        field3738++;
        int var3 = 98 % ((48 - arg0) / 58);
        if (this.field3748 != null) {
            arg1 = (int) ((long) this.field3746 * (long) arg1 / (long) this.field3734) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([BI)[B")
    public final byte[] method1571(byte[] arg0, int arg1) {
        if (arg1 >= -93) {
            return null;
        }
        field3745++;
        if (this.field3748 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field3746 / (long) this.field3734) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field3748[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3746 + var6;
                int var14 = var13 / this.field3734;
                var5 += var14;
                var6 = var13 - this.field3734 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static final void method1572(int arg0) {
        if (arg0 == -30125) {
            field3740++;
            if (class153.field2385 == 30) {
                class262.method1760(25, -41);
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
    public static void method1573(int arg0) {
        field3739 = null;
        field3749 = null;
        field3744 = null;
        field3750 = null;
        field3735 = null;
        field3742 = null;
        if (arg0 != 13050) {
            method1576(28, 87, -21, 57, (class158) null, 25, -6);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)I")
    public final int method1574(int arg0, int arg1) {
        if (this.field3748 != null) {
            arg0 = (int) ((long) this.field3746 * (long) arg0 / (long) this.field3734);
        }
        int var3 = 19 % ((41 - arg1) / 62);
        field3741++;
        return arg0;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(II)V")
    public static final void method1575(int arg0, int arg1) {
        field3736++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class255.field4124[arg1];
        int var3 = class64.field1076[arg1];
        int var4 = class192.field3103[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = (int) class77.field1288[arg1];
        long var6 = class77.field1288[arg1];
        if (var4 == 16) {
            class314.field5061.method828(109, 128);
            class209.field3314++;
            class314.field5061.method1135(var3, (byte) -53);
            class314.field5061.method1135(class175.field2863, (byte) -53);
            class314.field5061.method1122(var5, 1162032584);
            class314.field5061.method1122(class52.field869, 1162032584);
            class314.field5061.method1123(-105, class251.field3972);
            class314.field5061.method1111((byte) -102, var2);
            class98.field1585 = 0;
            class274.field4400 = class17.method87(var2, -20055);
            class313.field4986 = var3;
        }
        if (var4 == 35) {
            class62.field1006++;
            class314.field5061.method828(119, 94);
            class314.field5061.method1125(var2, 255);
            class211 var8 = class17.method87(var2, -20055);
            if (var8.field3365 != null && var8.field3365[0][0] == 5) {
                int var9 = var8.field3365[0][1];
                if (class195.field3160[var9] != var8.field3462[0]) {
                    class195.field3160[var9] = var8.field3462[0];
                    class5.method28(var9, true);
                }
            }
        }
        if (var4 == 12 || var4 == 1005) {
            class126.method874(var2, class269.field4343[arg1], var3, (byte) 39, var5);
        }
        if (var4 == 43) {
            class18.field210++;
            class314.field5061.method828(105, 61);
            class314.field5061.method1113(8843, var2);
            class314.field5061.method1165(var5, (byte) 79);
            class314.field5061.method1135(var3, (byte) -53);
            class98.field1585 = 0;
            class274.field4400 = class17.method87(var2, -20055);
            class313.field4986 = var3;
        }
        if (var4 == 15) {
            class314.field5061.method828(124, 94);
            class314.field5061.method1125(var2, 255);
            class62.field1006++;
            class211 var10 = class17.method87(var2, -20055);
            if (var10.field3365 != null && var10.field3365[0][0] == 5) {
                int var11 = var10.field3365[0][1];
                class195.field3160[var11] = 1 - class195.field3160[var11];
                class5.method28(var11, true);
            }
        }
        if (var4 == 30) {
            class299 var12 = class270.field4355[var5];
            if (var12 != null) {
                class14.field154++;
                class287.field4600 = 0;
                class61.field992 = 2;
                class136.field2151 = class309.field4941;
                class161.field2554 = class42.field609;
                class314.field5061.method828(120, 59);
                class314.field5061.method1120(var5, true);
                class314.field5061.method1108(class100.field1627[82] ? 1 : 0, true);
                class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 110, 0, var12.method279(23397), var12.method279(23397), 0, var3);
            }
        }
        if (var4 == 1003) {
            class287.field4600 = 0;
            class61.field992 = 2;
            class161.field2554 = class42.field609;
            class136.field2151 = class309.field4941;
            class314.field5061.method828(115, 179);
            class42.field612++;
            class314.field5061.method1135(var5, (byte) -53);
        }
        if (var4 == 31) {
            class161.field2554 = class42.field609;
            class101.field1630++;
            class61.field992 = 2;
            class287.field4600 = 0;
            class136.field2151 = class309.field4941;
            class314.field5061.method828(127, 9);
            class314.field5061.method1108(class100.field1627[82] ? 1 : 0, true);
            class314.field5061.method1120(class276.field4438 + var3, true);
            class314.field5061.method1135(var5, (byte) -53);
            class314.field5061.method1135(var2 + class108.field1732, (byte) -53);
            class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 125, 0, 0, 0, 0, var3);
        }
        if (var4 == 19) {
            class131 var13 = class12.field127[var5];
            if (var13 != null) {
                class98.field1582++;
                class161.field2554 = class42.field609;
                class287.field4600 = 0;
                class61.field992 = 2;
                class136.field2151 = class309.field4941;
                class314.field5061.method828(104, 65);
                class314.field5061.method1161(4, class100.field1627[82] ? 1 : 0);
                class314.field5061.method1122(var5, 1162032584);
                class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 106, 0, var13.method279(23397), var13.method279(23397), 0, var3);
            }
        }
        if (var4 == 20) {
            class131 var14 = class12.field127[var5];
            if (var14 != null) {
                class287.field4600 = 0;
                class136.field2151 = class309.field4941;
                class61.field992 = 2;
                class3.field38++;
                class161.field2554 = class42.field609;
                class314.field5061.method828(126, 12);
                class314.field5061.method1122(var5, 1162032584);
                class314.field5061.method1118(-96, class100.field1627[82] ? 1 : 0);
                class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 107, 0, var14.method279(23397), var14.method279(23397), 0, var3);
            }
        }
        if (var4 == 26) {
            class211 var15 = class17.method87(var2, -20055);
            boolean var16 = true;
            if (var15.field3446 > 0) {
                var16 = class94.method650(var15, -30);
            }
            if (var16) {
                class62.field1006++;
                class314.field5061.method828(124, 94);
                class314.field5061.method1125(var2, 255);
            }
        }
        if (var4 == 41) {
            class61.field992 = 2;
            class12.field122++;
            class161.field2554 = class42.field609;
            class136.field2151 = class309.field4941;
            class287.field4600 = 0;
            class314.field5061.method828(101, 189);
            class314.field5061.method1120(Integer.MAX_VALUE & (int) (var6 >>> 32), true);
            class314.field5061.method1135(class276.field4438 + var3, (byte) -53);
            class314.field5061.method1108(class100.field1627[82] ? 1 : 0, true);
            class314.field5061.method1122(class108.field1732 + var2, 1162032584);
            class88.method601(var3, var2, var6, -111);
        }
        if (var4 == 23) {
            class299 var17 = class270.field4355[var5];
            if (var17 != null) {
                class287.field4600 = 0;
                class1.field11++;
                class161.field2554 = class42.field609;
                class136.field2151 = class309.field4941;
                class61.field992 = 2;
                class314.field5061.method828(105, 208);
                class314.field5061.method1108(class100.field1627[82] ? 1 : 0, true);
                class314.field5061.method1122(var5, 1162032584);
                class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 104, 0, var17.method279(23397), var17.method279(23397), 0, var3);
            }
        }
        if (var4 == 25 && class61.field994 == null) {
            class175.method1281(true, var3, var2);
            class61.field994 = class32.method217(var2, var3, 115);
            class117.method834(class61.field994, (byte) -57);
        }
        if (var4 == 22) {
            class314.field5061.method828(106, 137);
            class116.field1868++;
            class314.field5061.method1122(var3, 1162032584);
            class314.field5061.method1165(var5, (byte) 86);
            class314.field5061.method1111((byte) -102, var2);
            class98.field1585 = 0;
            class274.field4400 = class17.method87(var2, -20055);
            class313.field4986 = var3;
        }
        if (var4 == 18) {
            class314.field5061.method828(124, 28);
            class314.field5061.method1120(var5, true);
            class268.field4320++;
            class314.field5061.method1135(var3, (byte) -53);
            class314.field5061.method1125(var2, 255);
            class98.field1585 = 0;
            class274.field4400 = class17.method87(var2, -20055);
            class313.field4986 = var3;
        }
        if (var4 == 58) {
            class131.method923((byte) -41);
            class211 var18 = class17.method87(var2, -20055);
            class251.field3972 = var2;
            class175.field2863 = var5;
            class52.field869 = var3;
            class46.field778 = 1;
            class117.method834(var18, (byte) -57);
            class14.field159 = "<col=ff9040>" + class81.method562(var5, -20358).field1799 + "<col=ffffff>";
            if (class14.field159 == null) {
                class14.field159 = "null";
            }
            return;
        }
        if (var4 == 21) {
            class299 var19 = class270.field4355[var5];
            if (var19 != null) {
                class161.field2554 = class42.field609;
                class90.field1461++;
                class61.field992 = 2;
                class136.field2151 = class309.field4941;
                class287.field4600 = 0;
                class314.field5061.method828(124, 157);
                class314.field5061.method1122(var5, 1162032584);
                class314.field5061.method1117(208526064, class100.field1627[82] ? 1 : 0);
                class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 111, 0, var19.method279(23397), var19.method279(23397), 0, var3);
            }
        }
        if (var4 == 38) {
            class136.field2151 = class309.field4941;
            class61.field992 = 2;
            class161.field2554 = class42.field609;
            class287.field4600 = 0;
            class314.field5061.method828(114, 195);
            class314.field5061.method1120(var3 + class276.field4438, true);
            class99.field1590++;
            class314.field5061.method1165(class108.field1732 + var2, (byte) 68);
            class314.field5061.method1117(208526064, class100.field1627[82] ? 1 : 0);
            class314.field5061.method1165(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) 86);
            class88.method601(var3, var2, var6, -75);
        }
        if (var4 == 11) {
            if (var5 == 0) {
                class244.field3883 = 1;
                class272.method1820(class56.field941, var3, var2);
            } else if (var5 == 1) {
                class314.field5061.method828(109, 149);
                class314.field5061.method1120(class251.field3997, true);
                field3743++;
                class314.field5061.method1113(8843, class78.field1310);
                class314.field5061.method1135(class108.field1732 + var2, (byte) -53);
                class314.field5061.method1120(class276.field4438 + var3, true);
            }
        }
        if (var4 == 17) {
            class136.field2151 = class309.field4941;
            class61.field992 = 2;
            class32.field469++;
            class287.field4600 = 0;
            class161.field2554 = class42.field609;
            class314.field5061.method828(119, 162);
            class314.field5061.method1135(var5, (byte) -53);
            class314.field5061.method1117(208526064, class100.field1627[82] ? 1 : 0);
            class314.field5061.method1120(class108.field1732 + var2, true);
            class314.field5061.method1122(var3 + class276.field4438, 1162032584);
            class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 127, 0, 0, 0, 0, var3);
        }
        if (var4 == 9) {
            class314.field5061.method828(125, 7);
            class3.field35++;
            class314.field5061.method1123(-73, class78.field1310);
            class314.field5061.method1111((byte) -102, var2);
            class314.field5061.method1165(var3, (byte) 91);
            class314.field5061.method1120(class251.field3997, true);
        }
        if (var4 == 6) {
            class214.method1490(26579);
        }
        if (var4 == 1007) {
            class161.field2554 = class42.field609;
            class61.field992 = 2;
            class136.field2151 = class309.field4941;
            class282.field4504++;
            class287.field4600 = 0;
            class314.field5061.method828(101, 200);
            class314.field5061.method1122(var5, 1162032584);
        }
        if (var4 == 48) {
            class276.field4440++;
            class61.field992 = 2;
            class161.field2554 = class42.field609;
            class287.field4600 = 0;
            class136.field2151 = class309.field4941;
            class314.field5061.method828(120, 51);
            class314.field5061.method1117(208526064, class100.field1627[82] ? 1 : 0);
            class314.field5061.method1123(-94, class251.field3972);
            class314.field5061.method1120(class52.field869, true);
            class314.field5061.method1122(Integer.MAX_VALUE & (int) (var6 >>> 32), 1162032584);
            class314.field5061.method1135(class108.field1732 + var2, (byte) -53);
            class314.field5061.method1135(class276.field4438 + var3, (byte) -53);
            class314.field5061.method1165(class175.field2863, (byte) 121);
            class88.method601(var3, var2, var6, -87);
        }
        if (var4 == 1001) {
            class287.field4600 = 0;
            class161.field2554 = class42.field609;
            class136.field2151 = class309.field4941;
            class61.field992 = 2;
            class131 var20 = class12.field127[var5];
            if (var20 != null) {
                class253 var21 = var20.field2056;
                if (var21.field4062 != null) {
                    var21 = var21.method1711(true);
                }
                if (var21 != null) {
                    class314.field5061.method828(106, 216);
                    class314.field5061.method1120(var21.field4039, true);
                    class204.field3251++;
                }
            }
        }
        if (var4 == 8) {
            class287.field4600 = 0;
            class136.field2151 = class309.field4941;
            class153.field2383++;
            class61.field992 = 2;
            class161.field2554 = class42.field609;
            class314.field5061.method828(122, 206);
            class314.field5061.method1117(208526064, class100.field1627[82] ? 1 : 0);
            class314.field5061.method1135(class108.field1732 + var2, (byte) -53);
            class314.field5061.method1135(class175.field2863, (byte) -53);
            class314.field5061.method1135(var5, (byte) -53);
            class314.field5061.method1122(var3 + class276.field4438, 1162032584);
            class314.field5061.method1113(8843, class251.field3972);
            class314.field5061.method1122(class52.field869, 1162032584);
            class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 104, 0, 0, 0, 0, var3);
        }
        if (var4 == 13) {
            class314.field5061.method828(111, 70);
            class223.field3640++;
            class314.field5061.method1111((byte) -102, var2);
            class314.field5061.method1122(var5, 1162032584);
            class314.field5061.method1165(var3, (byte) 113);
            class98.field1585 = 0;
            class274.field4400 = class17.method87(var2, -20055);
            class313.field4986 = var3;
        }
        if (var4 == 46) {
            class161.field2554 = class42.field609;
            class287.field4600 = 0;
            class61.field992 = 2;
            class136.field2151 = class309.field4941;
            class14.field158++;
            class314.field5061.method828(118, 210);
            class314.field5061.method1135(class276.field4438 + var3, (byte) -53);
            class314.field5061.method1120(var5, true);
            class314.field5061.method1135(class108.field1732 + var2, (byte) -53);
            class314.field5061.method1108(class100.field1627[82] ? 1 : 0, true);
            class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 110, 0, 0, 0, 0, var3);
        }
        if (var4 == 2) {
            class299 var22 = class270.field4355[var5];
            if (var22 != null) {
                class61.field992 = 2;
                class65.field1082++;
                class136.field2151 = class309.field4941;
                class287.field4600 = 0;
                class161.field2554 = class42.field609;
                class314.field5061.method828(106, 186);
                class314.field5061.method1161(4, class100.field1627[82] ? 1 : 0);
                class314.field5061.method1122(var5, 1162032584);
                class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 106, 0, var22.method279(23397), var22.method279(23397), 0, var3);
            }
        }
        if (arg0 < 67) {
            field3747 = -44;
        }
        if (var4 == 4) {
            class161.field2554 = class42.field609;
            class136.field2151 = class309.field4941;
            class280.field4482++;
            class287.field4600 = 0;
            class61.field992 = 2;
            class314.field5061.method828(108, 8);
            class314.field5061.method1125(class78.field1310, 255);
            class314.field5061.method1118(-104, class100.field1627[82] ? 1 : 0);
            class314.field5061.method1122(class251.field3997, 1162032584);
            class314.field5061.method1135(class108.field1732 + var2, (byte) -53);
            class314.field5061.method1165(var3 + class276.field4438, (byte) 92);
            class314.field5061.method1135(var5, (byte) -53);
            class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 122, 0, 0, 0, 0, var3);
        }
        if (var4 == 47) {
            class131 var23 = class12.field127[var5];
            if (var23 != null) {
                class136.field2151 = class309.field4941;
                class287.field4600 = 0;
                class61.field992 = 2;
                class161.field2554 = class42.field609;
                class192.field3095++;
                class314.field5061.method828(108, 148);
                class314.field5061.method1120(class251.field3997, true);
                class314.field5061.method1111((byte) -102, class78.field1310);
                class314.field5061.method1161(4, class100.field1627[82] ? 1 : 0);
                class314.field5061.method1120(var5, true);
                class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 127, 0, var23.method279(23397), var23.method279(23397), 0, var3);
            }
        }
        if (var4 == 39) {
            class314.field5061.method828(118, 242);
            class314.field5061.method1111((byte) -102, var2);
            class314.field5061.method1165(class251.field3997, (byte) 124);
            class289.field4621++;
            class314.field5061.method1113(8843, class78.field1310);
            class314.field5061.method1120(var3, true);
            class314.field5061.method1122(var5, 1162032584);
            class98.field1585 = 0;
            class274.field4400 = class17.method87(var2, -20055);
            class313.field4986 = var3;
        }
        if (var4 == 57) {
            class299 var24 = class270.field4355[var5];
            if (var24 != null) {
                class61.field992 = 2;
                class22.field277++;
                class136.field2151 = class309.field4941;
                class161.field2554 = class42.field609;
                class287.field4600 = 0;
                class314.field5061.method828(105, 117);
                class314.field5061.method1123(-108, class251.field3972);
                class314.field5061.method1165(var5, (byte) 73);
                class314.field5061.method1135(class175.field2863, (byte) -53);
                class314.field5061.method1165(class52.field869, (byte) 126);
                class314.field5061.method1108(class100.field1627[82] ? 1 : 0, true);
                class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 116, 0, var24.method279(23397), var24.method279(23397), 0, var3);
            }
        }
        if (var4 == 24) {
            class131 var25 = class12.field127[var5];
            if (var25 != null) {
                class185.field3022++;
                class287.field4600 = 0;
                class61.field992 = 2;
                class161.field2554 = class42.field609;
                class136.field2151 = class309.field4941;
                class314.field5061.method828(115, 163);
                class314.field5061.method1165(class175.field2863, (byte) 98);
                class314.field5061.method1135(class52.field869, (byte) -53);
                class314.field5061.method1161(4, class100.field1627[82] ? 1 : 0);
                class314.field5061.method1125(class251.field3972, 255);
                class314.field5061.method1120(var5, true);
                class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 121, 0, var25.method279(23397), var25.method279(23397), 0, var3);
            }
        }
        if (var4 == 29) {
            class246.field3922++;
            class314.field5061.method828(104, 248);
            class314.field5061.method1120(var3, true);
            class314.field5061.method1125(var2, 255);
            class314.field5061.method1135(var5, (byte) -53);
            class98.field1585 = 0;
            class274.field4400 = class17.method87(var2, -20055);
            class313.field4986 = var3;
        }
        if (var4 == 49) {
            class211 var26 = class32.method217(var2, var3, 111);
            if (var26 != null) {
                class131.method923((byte) -104);
                class223 var27 = client.method2015(var26);
                class99.method677((byte) 66, var27.field3638, var2, var3, var27.method1529(117), var26.field3374, var26.field3407);
                class46.field778 = 0;
                class19.field230 = class257.method1729(var26, 112);
                if (class19.field230 == null) {
                    class19.field230 = "Null";
                }
                if (var26.field3337) {
                    class203.field3235 = var26.field3399 + "<col=ffffff>";
                    return;
                }
                class203.field3235 = "<col=00ff00>" + var26.field3378 + "<col=ffffff>";
            }
            return;
        }
        if (var4 == 1011 || var4 == 1010 || var4 == 1009 || var4 == 1012 || var4 == 1006) {
            class278.method1869(var5, var4, 11, var3);
        }
        if (var4 == 1002) {
            class211 var28 = class17.method87(var2, -20055);
            if (var28 == null || var28.field3500[var3] < 100000) {
                class42.field612++;
                class314.field5061.method828(120, 179);
                class314.field5061.method1135(var5, (byte) -53);
            } else {
                class99.method673(true, var28.field3500[var3] + " x " + class81.method562(var5, -20358).field1799);
            }
            class98.field1585 = 0;
            class274.field4400 = class17.method87(var2, -20055);
            class313.field4986 = var3;
        }
        if (var4 == 59) {
            class1.field5++;
            class136.field2151 = class309.field4941;
            class287.field4600 = 0;
            class61.field992 = 2;
            class161.field2554 = class42.field609;
            class314.field5061.method828(110, 180);
            class314.field5061.method1108(class100.field1627[82] ? 1 : 0, true);
            class314.field5061.method1120(class108.field1732 + var2, true);
            class314.field5061.method1135(class276.field4438 + var3, (byte) -53);
            class314.field5061.method1165(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) 100);
            class88.method601(var3, var2, var6, -123);
        }
        if (var4 == 33) {
            class299 var29 = class270.field4355[var5];
            if (var29 != null) {
                class161.field2554 = class42.field609;
                class61.field992 = 2;
                class207.field3295++;
                class136.field2151 = class309.field4941;
                class287.field4600 = 0;
                class314.field5061.method828(124, 169);
                class314.field5061.method1122(var5, 1162032584);
                class314.field5061.method1161(4, class100.field1627[82] ? 1 : 0);
                class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 111, 0, var29.method279(23397), var29.method279(23397), 0, var3);
            }
        }
        if (var4 == 45) {
            class287.field4600 = 0;
            class136.field2151 = class309.field4941;
            class304.field4873++;
            class61.field992 = 2;
            class161.field2554 = class42.field609;
            class314.field5061.method828(116, 49);
            class314.field5061.method1125(class78.field1310, 255);
            class314.field5061.method1120(class108.field1732 + var2, true);
            class314.field5061.method1120((int) (var6 >>> 32) & Integer.MAX_VALUE, true);
            class314.field5061.method1122(class251.field3997, 1162032584);
            class314.field5061.method1120(var3 + class276.field4438, true);
            class314.field5061.method1117(208526064, class100.field1627[82] ? 1 : 0);
            class88.method601(var3, var2, var6, -96);
        }
        if (var4 == 51) {
            class161.field2558++;
            class314.field5061.method828(113, 241);
            class314.field5061.method1123(-107, var2);
            class314.field5061.method1120(var3, true);
            class314.field5061.method1122(var5, 1162032584);
            class98.field1585 = 0;
            class274.field4400 = class17.method87(var2, -20055);
            class313.field4986 = var3;
        }
        if (var4 == 50) {
            if (var5 == 0) {
                class272.method1820(class56.field941, var3, var2);
            } else if (var5 == 1) {
                if (class298.field4765 > 0 && class100.field1627[82] && class100.field1627[81]) {
                    class168.method1223((byte) 93, class56.field941, class108.field1732 + var2, class276.field4438 - -var3);
                } else {
                    class89.method608(-152, var3, 1, var2);
                    class314.field5061.method1108(class79.field1315, true);
                    class314.field5061.method1108(class23.field297, true);
                    class314.field5061.method1120((int) class90.field1456, true);
                    class314.field5061.method1108(57, true);
                    if (class120.field1919 == 4) {
                        class314.field5061.method1108(0, true);
                        class314.field5061.method1108(0, true);
                    } else {
                        class314.field5061.method1108(class173.field2831, true);
                        class314.field5061.method1108(class292.field4687, true);
                    }
                    class314.field5061.method1108(89, true);
                    class314.field5061.method1120(class239.field3829.field637, true);
                    class314.field5061.method1120(class239.field3829.field710, true);
                    class314.field5061.method1108(class268.field4313, true);
                    class314.field5061.method1108(63, true);
                    class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 110, 0, 0, 0, 0, var3);
                }
            }
        }
        if (var4 == 40) {
            class51.field859++;
            class314.field5061.method828(127, 138);
            class314.field5061.method1111((byte) -102, var2);
            class314.field5061.method1122(var3, 1162032584);
            class314.field5061.method1135(var5, (byte) -53);
            class98.field1585 = 0;
            class274.field4400 = class17.method87(var2, -20055);
            class313.field4986 = var3;
        }
        if (var4 == 1) {
            class287.field4600 = 0;
            class161.field2554 = class42.field609;
            class293.field4705++;
            class136.field2151 = class309.field4941;
            class61.field992 = 2;
            class314.field5061.method828(121, 165);
            class314.field5061.method1135(var5, (byte) -53);
            class314.field5061.method1135(var2 + class108.field1732, (byte) -53);
            class314.field5061.method1165(class276.field4438 + var3, (byte) 94);
            class314.field5061.method1118(-113, class100.field1627[82] ? 1 : 0);
            class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 112, 0, 0, 0, 0, var3);
        }
        if (var4 == 3) {
            class131 var30 = class12.field127[var5];
            if (var30 != null) {
                class161.field2554 = class42.field609;
                class136.field2151 = class309.field4941;
                class287.field4600 = 0;
                class230.field3725++;
                class61.field992 = 2;
                class314.field5061.method828(106, 219);
                class314.field5061.method1117(208526064, class100.field1627[82] ? 1 : 0);
                class314.field5061.method1122(var5, 1162032584);
                class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 114, 0, var30.method279(23397), var30.method279(23397), 0, var3);
            }
        }
        if (var4 == 1004) {
            class287.field4600 = 0;
            class206.field3276++;
            class136.field2151 = class309.field4941;
            class61.field992 = 2;
            class161.field2554 = class42.field609;
            class314.field5061.method828(124, 197);
            class314.field5061.method1165(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) 70);
            class314.field5061.method1165(var3 + class276.field4438, (byte) 73);
            class314.field5061.method1122(class108.field1732 + var2, 1162032584);
            class314.field5061.method1161(4, class100.field1627[82] ? 1 : 0);
            class88.method601(var3, var2, var6, -77);
        }
        if (var4 == 5) {
            class61.field992 = 2;
            class161.field2554 = class42.field609;
            class287.field4600 = 0;
            class136.field2151 = class309.field4941;
            class314.field5061.method828(114, 135);
            class168.field2746++;
            class314.field5061.method1122(Integer.MAX_VALUE & (int) (var6 >>> 32), 1162032584);
            class314.field5061.method1165(var2 + class108.field1732, (byte) 87);
            class314.field5061.method1161(4, class100.field1627[82] ? 1 : 0);
            class314.field5061.method1135(class276.field4438 + var3, (byte) -53);
            class88.method601(var3, var2, var6, -25);
        }
        if (var4 == 7) {
            if (var5 == 0) {
                class20.field250 = 1;
                class272.method1820(class56.field941, var3, var2);
            } else if (class298.field4765 > 0 && class100.field1627[82] && class100.field1627[81]) {
                class168.method1223((byte) 91, class56.field941, class108.field1732 + var2, class276.field4438 - -var3);
            } else {
                class111.field1751++;
                class314.field5061.method828(108, 53);
                class314.field5061.method1165(class108.field1732 + var2, (byte) 112);
                class314.field5061.method1165(class276.field4438 + var3, (byte) 105);
            }
        }
        if (var4 == 36) {
            class181.field2955++;
            class314.field5061.method828(111, 109);
            class314.field5061.method1135(var3, (byte) -53);
            class314.field5061.method1120(var5, true);
            class314.field5061.method1113(8843, var2);
            class98.field1585 = 0;
            class274.field4400 = class17.method87(var2, -20055);
            class313.field4986 = var3;
        }
        if (var4 == 32) {
            class299 var31 = class270.field4355[var5];
            if (var31 != null) {
                class61.field992 = 2;
                class161.field2554 = class42.field609;
                class287.field4600 = 0;
                class136.field2151 = class309.field4941;
                class314.field5061.method828(117, 177);
                class314.field5061.method1165(var5, (byte) 126);
                class314.field5061.method1117(208526064, class100.field1627[82] ? 1 : 0);
                class223.field3633++;
                class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 126, 0, var31.method279(23397), var31.method279(23397), 0, var3);
            }
        }
        if (var4 == 10) {
            class299 var32 = class270.field4355[var5];
            if (var32 != null) {
                class287.field4600 = 0;
                class61.field992 = 2;
                class161.field2554 = class42.field609;
                class136.field2151 = class309.field4941;
                class123.field1953++;
                class314.field5061.method828(127, 146);
                class314.field5061.method1117(208526064, class100.field1627[82] ? 1 : 0);
                class314.field5061.method1122(var5, 1162032584);
                class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 120, 0, var32.method279(23397), var32.method279(23397), 0, var3);
            }
        }
        if (var4 == 28) {
            class314.field5054++;
            class314.field5061.method828(126, 220);
            class314.field5061.method1123(-118, var2);
            class314.field5061.method1122(var3, 1162032584);
            class314.field5061.method1165(var5, (byte) 86);
            class98.field1585 = 0;
            class274.field4400 = class17.method87(var2, -20055);
            class313.field4986 = var3;
        }
        if (var4 == 14) {
            class131 var33 = class12.field127[var5];
            if (var33 != null) {
                class287.field4600 = 0;
                class161.field2554 = class42.field609;
                class136.field2151 = class309.field4941;
                class61.field992 = 2;
                class158.field2460++;
                class314.field5061.method828(116, 11);
                class314.field5061.method1108(class100.field1627[82] ? 1 : 0, true);
                class314.field5061.method1122(var5, 1162032584);
                class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 104, 0, var33.method279(23397), var33.method279(23397), 0, var3);
            }
        }
        if (var4 == 37) {
            class299 var34 = class270.field4355[var5];
            if (var34 != null) {
                class268.field4318++;
                class61.field992 = 2;
                class287.field4600 = 0;
                class136.field2151 = class309.field4941;
                class161.field2554 = class42.field609;
                class314.field5061.method828(123, 120);
                class314.field5061.method1120(var5, true);
                class314.field5061.method1122(class251.field3997, 1162032584);
                class314.field5061.method1111((byte) -102, class78.field1310);
                class314.field5061.method1161(4, class100.field1627[82] ? 1 : 0);
                class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 112, 0, var34.method279(23397), var34.method279(23397), 0, var3);
            }
        }
        if (var4 == 34) {
            class314.field5061.method828(116, 129);
            class186.field3036++;
            class314.field5061.method1165(var3, (byte) 113);
            class314.field5061.method1120(var5, true);
            class314.field5061.method1125(var2, 255);
            class98.field1585 = 0;
            class274.field4400 = class17.method87(var2, -20055);
            class313.field4986 = var3;
        }
        if (var4 == 60) {
            class61.field992 = 2;
            class136.field2151 = class309.field4941;
            class219.field3592++;
            class161.field2554 = class42.field609;
            class287.field4600 = 0;
            class314.field5061.method828(126, 10);
            class314.field5061.method1165(class108.field1732 + var2, (byte) 83);
            class314.field5061.method1120(class276.field4438 + var3, true);
            class314.field5061.method1120(var5, true);
            class314.field5061.method1161(4, class100.field1627[82] ? 1 : 0);
            class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 119, 0, 0, 0, 0, var3);
        }
        if (var4 == 44) {
            class131 var35 = class12.field127[var5];
            if (var35 != null) {
                class136.field2151 = class309.field4941;
                class161.field2554 = class42.field609;
                class52.field865++;
                class287.field4600 = 0;
                class61.field992 = 2;
                class314.field5061.method828(118, 193);
                class314.field5061.method1122(var5, 1162032584);
                class314.field5061.method1117(208526064, class100.field1627[82] ? 1 : 0);
                class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 104, 0, var35.method279(23397), var35.method279(23397), 0, var3);
            }
        }
        if (var4 == 42) {
            class299 var36 = class270.field4355[var5];
            if (var36 != null) {
                class61.field992 = 2;
                class115.field1839++;
                class287.field4600 = 0;
                class136.field2151 = class309.field4941;
                class161.field2554 = class42.field609;
                class314.field5061.method828(119, 192);
                class314.field5061.method1120(var5, true);
                class314.field5061.method1117(208526064, class100.field1627[82] ? 1 : 0);
                class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], var2, 116, 0, var36.method279(23397), var36.method279(23397), 0, var3);
            }
        }
        if (class46.field778 != 0) {
            class46.field778 = 0;
            class117.method834(class17.method87(class251.field3972, -20055), (byte) -57);
        }
        if (class139.field2211) {
            class131.method923((byte) -69);
        }
        if (class274.field4400 != null && class98.field1585 == 0) {
            class117.method834(class274.field4400, (byte) -57);
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(II)V")
    public class233(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class293.method1951(arg0, -14261, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field3746 = var4;
            this.field3748 = new int[var5][14];
            this.field3734 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field3748[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                double var11 = (double) var4 / (double) var5;
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var10 < var13) {
                    double var14 = var11;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var11 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIILfc;II)Z")
    public static final boolean method1576(int arg0, int arg1, int arg2, int arg3, class158 arg4, int arg5, int arg6) {
        class285 var7 = class268.method1804(34, arg4.field2472);
        field3737++;
        if (var7.field4529 == -1) {
            return true;
        }
        int var9;
        if (arg4.field2461) {
            int var8 = arg4.field2519 + arg3;
            var9 = var8 & 0x3;
        } else {
            var9 = 0;
        }
        class260 var10 = var7.method1900(460066352, var9, arg4.field2503);
        if (var10 == null) {
            return false;
        }
        int var11 = arg4.field2507;
        int var12 = var10.field3597;
        int var13 = arg4.field2487;
        if (arg2 != 104) {
            field3747 = -48;
        }
        if ((var9 & 0x1) == 1) {
            var13 = arg4.field2507;
            var11 = arg4.field2487;
        }
        int var14 = var10.field3601;
        if (var7.field4518) {
            var14 = var13 * 4;
            var12 = var11 * 4;
        }
        if (var7.field4522 == 0) {
            var10.method1746((arg1 * 4) + 48, (-arg5 + 104 + -var13) * 4 + 48, var12, var14);
        } else {
            var10.method1744(arg1 * 4 + 48, (104 - var13 + -arg5) * 4 + 48, var12, var14, var7.field4522);
        }
        return true;
    }
}
