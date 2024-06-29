import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class227 {

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "Lq;")
    private class104 field3241 = new class104();

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "Lvm;")
    private class84 field3251 = new class84();

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    private int field3250;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    private int field3253;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "Llb;")
    private class224 field3252;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3239 = "Allocated memory";

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public static int field3248 = 0;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "Z")
    public static boolean field3242;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)Lsi;", line = 4)
    public final class332 method1560(int arg0) {
        if (arg0 != 81) {
            this.method1564(125);
        }
        field3246++;
        return this.field3252.method1540(-127);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIII)V", line = 18)
    public static final void method1561(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class247.field3751; var5++) {
            if (class228.field3291[var5] + class17.field234[var5] > arg1 && arg0 + arg1 > class228.field3291[var5] && class78.field984[var5] + class115.field1625[var5] > arg3 && class78.field984[var5] < (arg2 + arg3)) {
                class211.field2985[var5] = true;
            }
        }
        int var6 = 24 / ((-arg4 - 43) / 36);
        field3237++;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IJ)Lq;", line = 36)
    public final class104 method1562(int arg0, long arg1) {
        if (arg0 != 0) {
            return (class104) null;
        }
        class104 var4 = (class104) this.field3252.method1537(arg1, -22708);
        field3244++;
        if (var4 != null) {
            this.field3251.method495((byte) -121, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V", line = 64)
    public static final void method1563(int arg0) {
        field3247++;
        boolean var1 = true;
        class293.method2085(125, false);
        class161.field2225 = 0;
        for (int var2 = 0; var2 < class106.field1347.length; var2++) {
            if (class186.field2691[var2] != -1 && class106.field1347[var2] == null) {
                class106.field1347[var2] = class222.field3133.method1199(28815, 0, class186.field2691[var2]);
                if (class106.field1347[var2] == null) {
                    class161.field2225++;
                    var1 = false;
                }
            }
            if (class61.field754[var2] != -1 && class239.field3574[var2] == null) {
                class239.field3574[var2] = class222.field3133.method1184((byte) -101, class343.field5326[var2], 0, class61.field754[var2]);
                if (class239.field3574[var2] == null) {
                    var1 = false;
                    class161.field2225++;
                }
            }
            if (class250.field3787) {
                if (class295.field4613[var2] != -1 && class110.field1545[var2] == null) {
                    class110.field1545[var2] = class222.field3133.method1199(28815, 0, class295.field4613[var2]);
                    if (class110.field1545[var2] == null) {
                        class161.field2225++;
                        var1 = false;
                    }
                }
                if (class150.field2082[var2] != -1 && class230.field3361[var2] == null) {
                    class230.field3361[var2] = class222.field3133.method1199(class312.method2192(arg0, 28807), 0, class150.field2082[var2]);
                    if (class230.field3361[var2] == null) {
                        var1 = false;
                        class161.field2225++;
                    }
                }
            }
            if (class61.field750 != null && class272.field4270[var2] == null && class61.field750[var2] != -1) {
                class272.field4270[var2] = class222.field3133.method1184((byte) 121, class343.field5326[var2], 0, class61.field750[var2]);
                if (class272.field4270[var2] == null) {
                    class161.field2225++;
                    var1 = false;
                }
            }
        }
        if (class27.field352 == null) {
            if (class161.field2213 == null || !class206.field2889.method1191((byte) 119, class161.field2213.field1010 + "_labels")) {
                class27.field352 = new class269(0);
            } else if (class206.field2889.method1207(class161.field2213.field1010 + "_labels", false)) {
                class27.field352 = class67.method416(0, class206.field2889, class161.field2213.field1010 + "_labels");
            } else {
                var1 = false;
                class161.field2225++;
            }
        }
        if (!var1) {
            class219.field3078 = 1;
            return;
        }
        boolean var3 = true;
        class132.field1818 = 0;
        for (int var4 = 0; var4 < class106.field1347.length; var4++) {
            byte[] var5 = class239.field3574[var4];
            if (var5 != null) {
                int var6 = (class120.field1694[var4] >> 8) * 64 - class142.field1992;
                int var7 = (class120.field1694[var4] & 0xFF) * 64 - class118.field1668;
                if (class300.field4674) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class157.method1045(var5, var6, (byte) -104, var7);
            }
            if (class250.field3787) {
                byte[] var8 = class230.field3361[var4];
                if (var8 != null) {
                    int var9 = (class120.field1694[var4] >> 8) * 64 - class142.field1992;
                    int var10 = (class120.field1694[var4] & 0xFF) * 64 - class118.field1668;
                    if (class300.field4674) {
                        var9 = 10;
                        var10 = 10;
                    }
                    var3 &= class157.method1045(var8, var9, (byte) -100, var10);
                }
            }
        }
        if (!var3) {
            class219.field3078 = 2;
            return;
        }
        if (class219.field3078 != 0) {
            class23.method154((byte) -32, class163.field2251 + "<br>(100%)", true);
        }
        boolean var11 = false;
        class239.method1713(arg0 ^ 0x7B24);
        if (arg0 != 8) {
            field3239 = (String) null;
        }
        class191.method1324(arg0 ^ 0x67);
        if (class250.field3787 && class172.field2481) {
            for (int var12 = 0; var12 < class106.field1347.length; var12++) {
                if (class230.field3361[var12] != null || class110.field1545[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class158.method1052(4, 104, 104, class250.field3787 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class149.field2072[var13].method139(-119);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class264.field4163[var14][var15][var16] = 0;
                }
            }
        }
        class150.method1011(false, arg0 ^ 0x9);
        if (class250.field3787) {
            class178.field2584.method1654();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class178.field2582[var17][var18].field1622 = true;
                }
            }
        }
        if (class250.field3787) {
            class193.method1340();
        }
        if (class250.field3787) {
            class225.method1551((byte) 124);
        }
        class239.method1713(31532);
        System.gc();
        class293.method2085(arg0 ^ 0x72, true);
        class135.method900(false, -124);
        if (!class300.field4674) {
            class235.method1671(false, (byte) -112);
            class293.method2085(121, true);
            if (class250.field3787) {
                int var19 = class118.field1664.field2359[0] >> 3;
                int var20 = class118.field1664.field2403[0] >> 3;
                class282.method2014(31, var20, var19);
            }
            class340.method2355(1084939752, false);
            if (class272.field4270 != null) {
                class186.method1293((byte) -84);
            }
        }
        if (class300.field4674) {
            class5.method21(false, false);
            class293.method2085(-30, true);
            if (class250.field3787) {
                int var21 = class118.field1664.field2359[0] >> 3;
                int var22 = class118.field1664.field2403[0] >> 3;
                class282.method2014(75, var22, var21);
            }
            class134.method890(0, false);
        }
        class191.method1324(117);
        class293.method2085(arg0 ^ 0x72, true);
        class213.method1456((byte) 113, false, class149.field2072, class300.field4674 ? class252.field3836 : (int[][][]) null);
        if (class250.field3787) {
            class193.method1331();
        }
        class293.method2085(123, true);
        int var23 = class311.field4822;
        if (class138.field1940 < var23) {
            var23 = class138.field1940;
        }
        if ((class138.field1940 - 1) > var23) {
            int var24 = class138.field1940 - 1;
        }
        if (class339.method2348((byte) 69)) {
            class224.method1534(0);
        } else {
            class224.method1534(class311.field4822);
        }
        class136.method908(125);
        if (class250.field3787 && var11) {
            class325.method2255(true);
            class135.method900(true, arg0 ^ 0xFFFFFFDF);
            if (!class300.field4674) {
                class235.method1671(true, (byte) -68);
                class293.method2085(-31, true);
                class340.method2355(arg0 ^ 0x40AADDE0, true);
            }
            if (class300.field4674) {
                class5.method21(true, false);
                class293.method2085(125, true);
                class134.method890(0, true);
            }
            class191.method1324(121);
            class293.method2085(arg0 + 119, true);
            class213.method1456((byte) -19, true, class149.field2072, class300.field4674 ? class252.field3836 : (int[][][]) null);
            class293.method2085(-50, true);
            class136.method908(127);
            class325.method2255(false);
        }
        if (class250.field3787) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class178.field2582[var25][var26].method782(class167.field2324[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class221.method1521(-88, var27, var28);
            }
        }
        class23.method148((byte) -89);
        class239.method1713(31532);
        method1569(127);
        class191.method1324(109);
        class188.field2710 = false;
        if (class250.field3787) {
            class340.method2354(255, true);
        }
        if (class329.field5029 != null && class236.field3463 != null && class17.field236 == 25) {
            class140.field1954.method573(122, 81);
            class342.field5307++;
            class140.field1954.method641(1773202520, 1057001181);
        }
        if (!class300.field4674) {
            int var29 = (class146.field2033 - 6) / 8;
            int var30 = (class146.field2033 + 6) / 8;
            int var31 = (class328.field4999 - 6) / 8;
            int var32 = (class328.field4999 + 6) / 8;
            for (int var33 = var29 - 1; var33 <= var30 + 1; var33++) {
                for (int var34 = var31 - 1; var34 <= (var32 + 1); var34++) {
                    if (var29 > var33 || var33 > var30 || var31 > var34 || var32 < var34) {
                        class222.field3133.method1192("m" + var33 + "_" + var34, false);
                        class222.field3133.method1192("l" + var33 + "_" + var34, false);
                    }
                }
            }
        }
        if (class17.field236 == 28) {
            class97.method587(-15525, 10);
        } else {
            class97.method587(-15525, 30);
            if (class236.field3463 != null) {
                class140.field1954.method573(115, 75);
            }
        }
        class213.method1458(2);
        class239.method1713(arg0 ^ 0x7B24);
        class339.method2350(0);
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V", line = 568)
    public final void method1564(int arg0) {
        field3249++;
        this.field3251.method491(-91);
        this.field3252.method1533(9);
        if (arg0 >= 31) {
            this.field3241 = new class104();
            this.field3250 = this.field3253;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(JLq;B)V", line = 586)
    public final void method1565(long arg0, class104 arg1, byte arg2) {
        int var5 = 13 % ((-arg2 - 33) / 56);
        if (this.field3250 == 0) {
            class104 var6 = this.field3251.method494(10425);
            var6.method2285(true);
            var6.method610(-1);
            if (this.field3241 == var6) {
                class104 var7 = this.field3251.method494(10425);
                var7.method2285(true);
                var7.method610(-1);
            }
        } else {
            this.field3250--;
        }
        field3240++;
        this.field3252.method1541(false, arg1, arg0);
        this.field3251.method495((byte) -114, arg1);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)Lha;", line = 629)
    public static final class318 method1566(int arg0, int arg1) {
        field3243++;
        class318 var2 = (class318) class20.field258.method1562(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class110.field1560.method1199(28815, arg0, arg1);
        class318 var4 = new class318();
        if (var3 != null) {
            var4.method2215(new class107(var3), 23745);
        }
        class20.field258.method1565((long) arg0, var4, (byte) 65);
        return var4;
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)Lsi;", line = 659)
    public final class332 method1567(int arg0) {
        if (arg0 >= -115) {
            return (class332) null;
        } else {
            field3245++;
            return this.field3252.method1544(25);
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(I)V", line = 719)
    public class227(int arg0) {
        this.field3250 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field3253 = arg0;
        this.field3252 = new class224(var2);
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V", line = 682)
    public static void method1568(int arg0) {
        if (arg0 != 0) {
            method1563(-27);
        }
        field3239 = null;
    }

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)V", line = 693)
    private static final void method1569(int arg0) {
        int var1 = 23 % ((-arg0 - 34) / 62);
        field3238++;
        for (class7 var2 = (class7) class74.field955.method2331((byte) 74); var2 != null; var2 = (class7) class74.field955.method2332(-65)) {
            if (var2.field92 == -1) {
                var2.field97 = 0;
                class20.method123((byte) -105, var2);
            } else {
                var2.method2285(true);
            }
        }
    }
}
