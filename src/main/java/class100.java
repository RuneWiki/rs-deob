import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class100 implements Runnable {

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Z")
    public boolean field1613 = true;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "Ljava/lang/Object;")
    public Object field1615 = new Object();

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "[I")
    public int[] field1619 = new int[500];

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public int field1618 = 0;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "[I")
    public int[] field1620 = new int[500];

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field1617 = 0;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "[Ltd;")
    public static class190[] field1623 = new class190[4];

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field1621 = -1;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Lvc;")
    public static class129 field1616 = new class129();

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field1624 = -1;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Lcc;")
    public static class313 field1608;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)V", line = 8)
    public static final void method674(byte arg0, int arg1) {
        field1611++;
        class74.method540(0);
        class158.method1165((byte) -103);
        int var2 = class130.method906(arg1, -125).field166;
        if (var2 == 0) {
            return;
        }
        int var3 = class138.field2462[arg1];
        if (var2 == 5) {
            class36.field527 = var3;
        }
        if (var2 == 9) {
            class251.field4202 = var3;
        }
        if (arg0 <= -86 && var2 == 6) {
            class244.field4141 = var3;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 38)
    public static final void method675(int arg0) {
        field1614++;
        class318.method2211(false, 50);
        class244.field4130 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class128.field2200.length; var2++) {
            if (class213.field3622[var2] != -1 && class128.field2200[var2] == null) {
                class128.field2200[var2] = class168.field3000.method2173(class213.field3622[var2], 0, (byte) -119);
                if (class128.field2200[var2] == null) {
                    class244.field4130++;
                    var1 = false;
                }
            }
            if (class140.field2555[var2] != -1 && class322.field5502[var2] == null) {
                class322.field5502[var2] = class168.field3000.method2163(class314.field5392[var2], 0, -2426, class140.field2555[var2]);
                if (class322.field5502[var2] == null) {
                    var1 = false;
                    class244.field4130++;
                }
            }
            if (class56.field846) {
                if (class45.field697[var2] != -1 && class314.field5388[var2] == null) {
                    class314.field5388[var2] = class168.field3000.method2173(class45.field697[var2], 0, (byte) -124);
                    if (class314.field5388[var2] == null) {
                        class244.field4130++;
                        var1 = false;
                    }
                }
                if (class122.field2049[var2] != -1 && class69.field1132[var2] == null) {
                    class69.field1132[var2] = class168.field3000.method2173(class122.field2049[var2], 0, (byte) -16);
                    if (class69.field1132[var2] == null) {
                        var1 = false;
                        class244.field4130++;
                    }
                }
            }
            if (class68.field1125 != null && class243.field4116[var2] == null && class68.field1125[var2] != -1) {
                class243.field4116[var2] = class168.field3000.method2163(class314.field5392[var2], 0, -2426, class68.field1125[var2]);
                if (class243.field4116[var2] == null) {
                    class244.field4130++;
                    var1 = false;
                }
            }
        }
        if (class274.field4611 == null) {
            if (class54.field819 == null || !class165.field2942.method2167(class12.method69(new class126[] { class54.field819.field3859, class5.field48 }, (byte) 120), (byte) -121)) {
                class274.field4611 = new class57(0);
            } else if (class165.field2942.method2161(class12.method69(new class126[] { class54.field819.field3859, class5.field48 }, (byte) 125), -79)) {
                class274.field4611 = class195.method1376((byte) -17, class12.method69(new class126[] { class54.field819.field3859, class5.field48 }, (byte) 117), class165.field2942);
            } else {
                class244.field4130++;
                var1 = false;
            }
        }
        if (!var1) {
            class267.field4529 = 1;
            return;
        }
        class41.field660 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class128.field2200.length; var4++) {
            byte[] var5 = class322.field5502[var4];
            if (var5 != null) {
                int var6 = (class148.field2732[var4] >> 8) * 64 - class58.field914;
                int var7 = (class148.field2732[var4] & 0xFF) * 64 - class138.field2473;
                if (class16.field219) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class73.method534(var7, var5, var6, (byte) 79);
            }
            if (class56.field846) {
                byte[] var8 = class69.field1132[var4];
                if (var8 != null) {
                    int var9 = (class148.field2732[var4] >> 8) * 64 - class58.field914;
                    int var10 = (class148.field2732[var4] & 0xFF) * 64 - class138.field2473;
                    if (class16.field219) {
                        var9 = 10;
                        var10 = 10;
                    }
                    var3 &= class73.method534(var10, var8, var9, (byte) 79);
                }
            }
        }
        if (!var3) {
            class267.field4529 = 2;
            return;
        }
        if (class267.field4529 != 0) {
            class250.method1693(true, class12.method69(new class126[] { class302.field5036, class170.field3030 }, (byte) 115), true);
        }
        class181.method1294(true);
        class57.method393(-31678);
        boolean var11 = false;
        if (class56.field846 && class40.field640) {
            for (int var12 = 0; var12 < class128.field2200.length; var12++) {
                if (class69.field1132[var12] != null || class314.field5388[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class274.method1833(4, 104, 104, class56.field846 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class94.field1475[var13].method171(-128);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class301.field4992[var14][var15][var16] = 0;
                }
            }
        }
        class33.method184(false, (byte) -5);
        if (class56.field846) {
            class66.field1107.method13();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class66.field1108[var17][var18].field2353 = true;
                }
            }
        }
        if (class56.field846) {
            class256.method1734();
        }
        if (class56.field846) {
            class221.method1518(-115);
        }
        class181.method1294(true);
        System.gc();
        class318.method2211(true, 50);
        class290.method1923(false, 32);
        if (!class16.field219) {
            class35.method192(true, false);
            class318.method2211(true, 50);
            if (class56.field846) {
                int var19 = class286.field4744.field2460[0] >> 3;
                int var20 = class286.field4744.field2471[0] >> 3;
                class54.method340(var20, (byte) -124, var19);
            }
            class32.method153(false, 101);
            if (class243.field4116 != null) {
                class96.method655(-105);
            }
        }
        if (class16.field219) {
            class254.method1720((byte) 99, false);
            class318.method2211(true, 50);
            if (class56.field846) {
                int var21 = class286.field4744.field2460[0] >> 3;
                int var22 = class286.field4744.field2471[0] >> 3;
                class54.method340(var22, (byte) 93, var21);
            }
            class228.method1551((byte) 74, false);
        }
        class57.method393(-31678);
        class318.method2211(true, 50);
        class320.method2230(false, 70, class94.field1475);
        if (class56.field846) {
            class256.method1729();
        }
        if (arg0 <= 24) {
            field1624 = 100;
        }
        class318.method2211(true, 50);
        int var23 = class245.field4147;
        if (var23 > class131.field2250) {
            var23 = class131.field2250;
        }
        if (var23 < (class131.field2250 - 1)) {
            int var24 = class131.field2250 - 1;
        }
        if (class22.method109(4096)) {
            class122.method798(0);
        } else {
            class122.method798(class245.field4147);
        }
        class75.method543(0);
        if (class56.field846 && var11) {
            class309.method2112(true);
            class290.method1923(true, 32);
            if (!class16.field219) {
                class35.method192(true, true);
                class318.method2211(true, 50);
                class32.method153(true, 96);
            }
            if (class16.field219) {
                class254.method1720((byte) 119, true);
                class318.method2211(true, 50);
                class228.method1551((byte) 74, true);
            }
            class57.method393(-31678);
            class318.method2211(true, 50);
            class320.method2230(true, 127, class94.field1475);
            class318.method2211(true, 50);
            class75.method543(0);
            class309.method2112(false);
        }
        if (class56.field846) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class66.field1108[var25][var26].method983(class264.field4396[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class213.method1480(86, var27, var28);
            }
        }
        class136.method990(255);
        class181.method1294(true);
        class158.method1161(8528);
        class57.method393(-31678);
        class116.field1952 = false;
        if (class253.field4250 != null && class59.field953 != null && class280.field4662 == 25) {
            class103.field1645.method1238(232, 96);
            class35.field518++;
            class103.field1645.method947(1057001181, (byte) 107);
        }
        if (!class16.field219) {
            int var29 = (class23.field329 - 6) / 8;
            int var30 = (class23.field329 + 6) / 8;
            int var31 = (class107.field1691 - 6) / 8;
            int var32 = (class107.field1691 + 6) / 8;
            for (int var33 = var29 - 1; var33 <= (var30 + 1); var33++) {
                for (int var34 = var31 - 1; var34 <= (var32 + 1); var34++) {
                    if (var33 < var29 || var30 < var33 || var34 < var31 || var34 > var32) {
                        class168.field3000.method2164(class12.method69(new class126[] { class117.field1972, class195.method1386((byte) 20, var33), class105.field1663, class195.method1386((byte) 20, var34) }, (byte) 120), -123);
                        class168.field3000.method2164(class12.method69(new class126[] { class26.field373, class195.method1386((byte) 20, var33), class105.field1663, class195.method1386((byte) 20, var34) }, (byte) 116), 119);
                    }
                }
            }
        }
        if (class280.field4662 == 28) {
            class280.method1872(-112, 10);
        } else {
            class280.method1872(-118, 30);
            if (class59.field953 != null) {
                class103.field1645.method1238(40, 124);
            }
        }
        class93.method637(64);
        class181.method1294(true);
        class9.method55(0);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V", line = 538)
    public static final void method676(int arg0) {
        int var1 = -103 / ((arg0 - 35) / 52);
        field1609++;
        class149.method1112();
        class24.field351 = new class215[7];
        class24.field351[1] = new class3();
        class24.field351[2] = new class179();
        class24.field351[3] = new class42();
        class24.field351[4] = new class191();
        class24.field351[5] = new class292();
        class24.field351[6] = new class216();
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V", line = 554)
    public static void method677(int arg0) {
        if (arg0 != 26442) {
            field1608 = (class313) null;
        }
        field1608 = null;
        field1623 = null;
        field1616 = null;
    }

    @OriginalMember(owner = "client!ae", name = "run", descriptor = "()V", line = 571)
    public final void run() {
        field1612++;
        while (this.field1613) {
            Object var1 = this.field1615;
            synchronized (this.field1615) {
                if (this.field1618 < 500) {
                    this.field1620[this.field1618] = class138.field2493;
                    this.field1619[this.field1618] = class260.field4366;
                    this.field1618++;
                }
            }
            class313.method2158(50L, true);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)I", line = 597)
    public static final int method678(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field1610++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 1023 - arg2;
        } else if (var4 == 2) {
            return 1023 - arg3;
        } else {
            if (arg0 < 48) {
                field1617 = -64;
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)V", line = 632)
    public static final void method679(boolean arg0, int arg1) {
        if (arg1 != -14575) {
            field1616 = (class129) null;
        }
        field1622++;
        class187.method1350(class182.field3162, arg1 ^ 0xFFFFC710, class1.field6, class7.field87, arg0);
    }
}
