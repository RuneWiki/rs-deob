import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class87 extends class202 {

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "Llc;")
    public static class84 field1383 = new class84(0, -1);

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field1390 = 0;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    public static int field1393 = 0;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field1385 = 0;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "B")
    public byte field1389;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public int field1387;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "Lqh;")
    public static class201 field1388;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "Ljava/lang/String;")
    public String field1382;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "Ljava/lang/String;")
    public String field1386;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "[Lml;")
    public static class289[] field1394;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)V")
    public static final void method630(int arg0) {
        class128.field2076.method1398(0);
        class36.field555.method770((byte) 97);
        class56.field951.method770((byte) 111);
        if (arg0 == -10340) {
            field1381++;
        }
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)V")
    public static final void method631(int arg0) {
        class6.method46(arg0 ^ 0xFFFFBE76, false);
        field1384++;
        boolean var1 = true;
        class164.field2597 = 0;
        for (int var2 = 0; var2 < class27.field426.length; var2++) {
            if (class202.field3244[var2] != -1 && class27.field426[var2] == null) {
                class27.field426[var2] = class122.field1982.method1357(0, class202.field3244[var2], -1);
                if (class27.field426[var2] == null) {
                    var1 = false;
                    class164.field2597++;
                }
            }
            if (class273.field4321[var2] != -1 && class207.field3402[var2] == null) {
                class207.field3402[var2] = class122.field1982.method1364(class40.field751[var2], 0, (byte) -19, class273.field4321[var2]);
                if (class207.field3402[var2] == null) {
                    class164.field2597++;
                    var1 = false;
                }
            }
            if (class184.field2886 != null && class178.field2806[var2] == null && class184.field2886[var2] != -1) {
                class178.field2806[var2] = class122.field1982.method1364(class40.field751[var2], 0, (byte) -84, class184.field2886[var2]);
                if (class178.field2806[var2] == null) {
                    class164.field2597++;
                    var1 = false;
                }
            }
        }
        if (class111.field1834 == null) {
            if (class185.field2906 == null || !class29.field462.method1365(class185.field2906.field930 + "_labels", arg0 - 16988)) {
                class111.field1834 = new class16(0);
            } else if (class29.field462.method1356(class185.field2906.field930 + "_labels", (byte) 121)) {
                class111.field1834 = class85.method623(class29.field462, 0, class185.field2906.field930 + "_labels");
            } else {
                class164.field2597++;
                var1 = false;
            }
        }
        if (!var1) {
            class216.field3538 = 1;
            return;
        }
        boolean var3 = true;
        class205.field3283 = 0;
        for (int var4 = 0; var4 < class27.field426.length; var4++) {
            byte[] var20 = class207.field3402[var4];
            if (var20 != null) {
                int var21 = (class99.field1620[var4] >> 8) * 64 - class50.field884;
                int var22 = (class99.field1620[var4] & 0xFF) * 64 - class214.field3501;
                if (class100.field1642) {
                    var21 = 10;
                    var22 = 10;
                }
                var3 &= class189.method1290(var20, 0, var22, var21);
            }
        }
        if (!var3) {
            class216.field3538 = 2;
            return;
        }
        if (class216.field3538 != 0) {
            class148.method1016(-31620, class1.field30 + "<br>(100%)", true);
        }
        class254.method1730(arg0 - 17000);
        class145.method993(-128);
        boolean var5 = false;
        class211.method1452(4, 104, 104, 25, var5);
        if (arg0 != 16882) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            class167.field2657[var6].method210((byte) 111);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class201.field3198[var7][var18][var19] = 0;
                }
            }
        }
        class27.method235((byte) 16, false);
        class254.method1730(arg0 - 17006);
        System.gc();
        class6.method46(arg0 - 16992, true);
        class223.method1573((byte) 71, false);
        if (!class100.field1642) {
            class111.method812(false, -13);
            class6.method46(-100, true);
            class270.method1823(false, -49);
            if (class178.field2806 != null) {
                class279.method1872(100);
            }
        }
        if (class100.field1642) {
            class10.method79((byte) 94, false);
            class6.method46(-107, true);
            class89.method675(false, 100);
        }
        class145.method993(83);
        class6.method46(-122, true);
        class257.method1758(false, (byte) -81, class167.field2657);
        class6.method46(arg0 ^ 0xFFFFBE65, true);
        int var8 = class91.field1495;
        if (class250.field3980 < var8) {
            var8 = class250.field3980;
        }
        if (var8 < class250.field3980 - 1) {
            int var9 = class250.field3980 - 1;
        }
        if (class257.method1757(-5)) {
            class173.method1184(0);
        } else {
            class173.method1184(class91.field1495);
        }
        class204.method1411(-96);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class169.method1168(-93, var10, var17);
            }
        }
        class169.method1163(arg0 ^ 0xFFFFBE73);
        class254.method1730(-84);
        class68.method470(0);
        class145.method993(40);
        if (class110.field1811 != null && class5.field69 != null && class273.field4336 == 25) {
            class68.field1113.method534((byte) -113, 28);
            class95.field1555++;
            class68.field1113.method1529((byte) 122, 1057001181);
        }
        if (!class100.field1642) {
            int var11 = (class73.field1196 + 6) / 8;
            int var12 = (class73.field1196 - 6) / 8;
            int var13 = (class155.field2507 - 6) / 8;
            int var14 = (class155.field2507 + 6) / 8;
            for (int var15 = var12 - 1; var15 <= (var11 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                    if (var12 > var15 || var15 > var11 || var16 < var13 || var16 > var14) {
                        class122.field1982.method1375("m" + var15 + "_" + var16, arg0 - 16840);
                        class122.field1982.method1375("l" + var15 + "_" + var16, 110);
                    }
                }
            }
        }
        if (class273.field4336 == 28) {
            class1.method5(10, 124);
        } else {
            class1.method5(30, arg0 - 16918);
            if (class5.field69 != null) {
                class68.field1113.method534((byte) -102, 142);
            }
        }
        class203.method1396(255);
        class254.method1730(arg0 ^ 0xFFFFBE45);
        class235.method1636((byte) 99);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)Lhl;")
    public static final class39 method632(int arg0, int arg1) {
        field1392++;
        class39 var2 = (class39) class5.field62.method1832((long) arg0, (byte) -72);
        if (var2 != null) {
            return var2;
        }
        if (arg1 <= 79) {
            field1385 = -93;
        }
        byte[] var3 = class94.field1552.method1357(arg0, 11, -1);
        class39 var4 = new class39();
        if (var3 != null) {
            var4.method344((byte) -121, new class221(var3));
        }
        class5.field62.method1831((long) arg0, var4, 128);
        return var4;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public static void method633(byte arg0) {
        field1383 = null;
        field1388 = null;
        field1394 = null;
        if (arg0 != 30) {
            method633((byte) -37);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZI)V")
    public static final void method634(boolean arg0, int arg1) {
        field1391++;
        class100.field1642 = arg0;
        if (class100.field1642) {
            class67.field1103.method530(255);
            for (int var2 = 0; var2 < 4; var2++) {
                for (int var22 = 0; var22 < 13; var22++) {
                    for (int var23 = 0; var23 < 13; var23++) {
                        int var24 = class67.field1103.method540(1, 882786883);
                        if (var24 == 1) {
                            class3.field43[var2][var22][var23] = class67.field1103.method540(26, arg1 + 882768754);
                        } else {
                            class3.field43[var2][var22][var23] = -1;
                        }
                    }
                }
            }
            class67.field1103.method539(-113);
            int var3 = (class115.field1912 - class67.field1103.field3655) / 16;
            class40.field751 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var21 = 0; var21 < 4; var21++) {
                    class40.field751[var4][var21] = class67.field1103.method1523((byte) -89);
                }
            }
            int var5 = class67.field1103.method1512((byte) -127);
            int var6 = class67.field1103.method1521((byte) 113);
            int var7 = class67.field1103.method1515(-1);
            int var8 = class67.field1103.method1553((byte) 81);
            int var9 = class67.field1103.method1521((byte) 113);
            class196.field3130 = new int[var3];
            class184.field2886 = null;
            class202.field3244 = new int[var3];
            class99.field1620 = new int[var3];
            class273.field4321 = new int[var3];
            class27.field426 = new byte[var3][];
            class178.field2806 = null;
            class207.field3402 = new byte[var3][];
            class85.field1351 = new int[var3];
            int var10 = 0;
            for (int var11 = 0; var11 < 4; var11++) {
                for (int var12 = 0; var12 < 13; var12++) {
                    for (int var13 = 0; var13 < 13; var13++) {
                        int var14 = class3.field43[var11][var12][var13];
                        if (var14 != -1) {
                            int var15 = (var14 & 0x3FFF) >> 3;
                            int var16 = (var14 & 0xFFFF50) >> 14;
                            int var17 = (var16 / 8 << 8) + (var15 / 8);
                            for (int var18 = 0; var18 < var10; var18++) {
                                if (class99.field1620[var18] == var17) {
                                    var17 = -1;
                                    break;
                                }
                            }
                            if (var17 != -1) {
                                class99.field1620[var10] = var17;
                                int var19 = (var17 & 0xFF01) >> 8;
                                int var20 = var17 & 0xFF;
                                class202.field3244[var10] = class122.field1982.method1373(61, "m" + var19 + "_" + var20);
                                class273.field4321[var10] = class122.field1982.method1373(105, "l" + var19 + "_" + var20);
                                class196.field3130[var10] = class122.field1982.method1373(96, "um" + var19 + "_" + var20);
                                class85.field1351[var10] = class122.field1982.method1373(118, "ul" + var19 + "_" + var20);
                                var10++;
                            }
                        }
                    }
                }
            }
            class261.method1783(false, -24319, var6, var5, var9, var7, var8);
        } else {
            int var25 = class67.field1103.method1512((byte) -127);
            int var26 = class67.field1103.method1527(-10661);
            int var27 = class67.field1103.method1512((byte) -126);
            int var28 = (class115.field1912 - class67.field1103.field3655) / 16;
            class40.field751 = new int[var28][4];
            for (int var29 = 0; var29 < var28; var29++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class40.field751[var29][var37] = class67.field1103.method1542(class91.method687(arg1, 18133));
                }
            }
            int var30 = class67.field1103.method1521((byte) 113);
            boolean var31 = false;
            if ((var25 / 8 == 48 || var25 / 8 == 49) && var27 / 8 == 48) {
                var31 = true;
            }
            if (var25 / 8 == 48 && var27 / 8 == 148) {
                var31 = true;
            }
            int var32 = class67.field1103.method1534(false);
            class184.field2886 = null;
            class196.field3130 = new int[var28];
            class27.field426 = new byte[var28][];
            class85.field1351 = new int[var28];
            class178.field2806 = null;
            class99.field1620 = new int[var28];
            class273.field4321 = new int[var28];
            class202.field3244 = new int[var28];
            class207.field3402 = new byte[var28][];
            int var33 = 0;
            for (int var34 = (var25 - 6) / 8; var34 <= (var25 + 6) / 8; var34++) {
                for (int var35 = (var27 - 6) / 8; var35 <= ((var27 + 6) / 8); var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (var31 && var35 == 49 || var35 == 149 || var35 == 147 || var34 == 50 || !(var34 != 49 || var35 != 47)) {
                        class99.field1620[var33] = var36;
                        class202.field3244[var33] = -1;
                        class273.field4321[var33] = -1;
                        class196.field3130[var33] = -1;
                        class85.field1351[var33] = -1;
                    } else {
                        class99.field1620[var33] = var36;
                        class202.field3244[var33] = class122.field1982.method1373(104, "m" + var34 + "_" + var35);
                        class273.field4321[var33] = class122.field1982.method1373(89, "l" + var34 + "_" + var35);
                        class196.field3130[var33] = class122.field1982.method1373(117, "um" + var34 + "_" + var35);
                        class85.field1351[var33] = class122.field1982.method1373(126, "ul" + var34 + "_" + var35);
                    }
                    var33++;
                }
            }
            class261.method1783(false, -24319, var25, var27, var30, var26, var32);
        }
        if (arg1 != 18129) {
            method634(false, -99);
        }
    }
}
