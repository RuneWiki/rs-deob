import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class92 {

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1462 = 0;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "Lti;")
    public static class5 field1468 = new class5(128);

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1470 = null;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field1469 = -1;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public int field1461;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public int field1465;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public int field1467;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static final void method639(int arg0) {
        field1466++;
        class195.field3156.method275((byte) -103);
        if (arg0 <= 32) {
            method644((byte) -21, (class104) null);
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class175.field2917[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class173.field2898[var2] = 0L;
        }
        class173.field2901 = 0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILfj;)V")
    public final void method640(int arg0, class274 arg1) {
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method1849(arg0 ^ 0xFF);
            if (var3 == 0) {
                field1459++;
                return;
            }
            this.method645(var3, arg1, 10529);
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
    public static void method641(int arg0) {
        if (arg0 >= -22) {
            method641(-20);
        }
        field1470 = null;
        field1468 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)V")
    public static final void method642(byte arg0, int arg1) {
        field1460++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class242.field3840[arg1];
        int var3 = class144.field2320[arg1];
        int var4 = class26.field478[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        long var5 = class215.field3392[arg1];
        int var7 = (int) class215.field3392[arg1];
        if (var4 == 7) {
            class104 var8 = class131.field2113[var7];
            if (var8 != null) {
                class26.field468 = 2;
                class224.field3521 = class16.field302;
                class115.field1750 = 0;
                class124.field1969++;
                class40.field610 = class295.field4806;
                class311.field5027.method2081(false, 151);
                class311.field5027.method1865(class8.field170[82] ? 1 : 0, -95);
                class311.field5027.method1844(-1, var7);
                class74.method539(0, class217.field3408.field965[0], 0, var2, var3, var8.method101(false), true, -3, var8.method101(false), 0, class217.field3408.field956[0]);
            }
        }
        if (var4 == 34) {
            class40.field610 = class295.field4806;
            class229.field3586++;
            class26.field468 = 2;
            class224.field3521 = class16.field302;
            class115.field1750 = 0;
            class311.field5027.method2081(false, 76);
            class311.field5027.method1832(class145.field2327 + var3, (byte) 62);
            class311.field5027.method1832(class75.field1211 + var2, (byte) 62);
            class311.field5027.method1814(class8.field170[82] ? 1 : 0, (byte) -12);
            class311.field5027.method1824(var7, 28357);
            class74.method539(0, class217.field3408.field965[0], 0, var2, var3, 0, true, -3, 0, 0, class217.field3408.field956[0]);
        }
        if (var4 == 1010) {
            class248 var9 = class281.method1913(var3, (byte) 70);
            if (var9 == null || var9.field4054[var2] < 100000) {
                class311.field5027.method2081(false, 114);
                class311.field5027.method1832(var7, (byte) 62);
                class261.field4265++;
            } else {
                class74.method536(var9.field4054[var2] + " x " + class107.method754(-20563, var7).field2532, "", (byte) -54, 0);
            }
            class191.field3124 = 0;
            class114.field1744 = class281.method1913(var3, (byte) 107);
            class239.field3745 = var2;
        }
        if (var4 == 37) {
            class285.method1935(0);
        }
        if (var4 == 31) {
            class224.field3521 = class16.field302;
            class40.field610 = class295.field4806;
            class11.field210++;
            class26.field468 = 2;
            class115.field1750 = 0;
            class311.field5027.method2081(false, 100);
            class311.field5027.method1865(class8.field170[82] ? 1 : 0, 64);
            class311.field5027.method1844(-1, class75.field1211 + var2);
            class311.field5027.method1844(-1, class145.field2327 + var3);
            class311.field5027.method1844(-1, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class189.method1333(var5, var3, var2, (byte) -106);
        }
        if (var4 == 39) {
            class12 var10 = class28.field494[var7];
            if (var10 != null) {
                class80.field1300++;
                class224.field3521 = class16.field302;
                class40.field610 = class295.field4806;
                class115.field1750 = 0;
                class26.field468 = 2;
                class311.field5027.method2081(false, 193);
                class311.field5027.method1844(-1, var7);
                class311.field5027.method1860(class8.field170[82] ? 1 : 0, 8239);
                class74.method539(0, class217.field3408.field965[0], 0, var2, var3, var10.method101(false), true, -3, var10.method101(false), 0, class217.field3408.field956[0]);
            }
        }
        if (var4 == 11) {
            class115.field1750 = 0;
            class224.field3521 = class16.field302;
            class234.field3681++;
            class26.field468 = 2;
            class40.field610 = class295.field4806;
            class311.field5027.method2081(false, 35);
            class311.field5027.method1823(1617348648, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class311.field5027.method1823(1617348648, class243.field3847);
            class311.field5027.method1823(1617348648, class145.field2327 + var3);
            class311.field5027.method1823(1617348648, class75.field1211 + var2);
            class311.field5027.method1831(class122.field1940, 119690440);
            class311.field5027.method1827(class8.field170[82] ? 1 : 0, -719196768);
            class189.method1333(var5, var3, var2, (byte) -106);
        }
        if (var4 == 60) {
            class26.field468 = 2;
            class115.field1750 = 0;
            class224.field3521 = class16.field302;
            class122.field1919++;
            class40.field610 = class295.field4806;
            class311.field5027.method2081(false, 26);
            class311.field5027.method1832(var2 + class75.field1211, (byte) 62);
            class311.field5027.method1844(-1, var7);
            class311.field5027.method1860(class8.field170[82] ? 1 : 0, 8239);
            class311.field5027.method1832(class145.field2327 + var3, (byte) 62);
            class74.method539(0, class217.field3408.field965[0], 0, var2, var3, 0, true, -3, 0, 0, class217.field3408.field956[0]);
        }
        if (var4 == 15) {
            class224.field3521 = class16.field302;
            class40.field610 = class295.field4806;
            class244.field3870++;
            class26.field468 = 2;
            class115.field1750 = 0;
            class311.field5027.method2081(false, 140);
            class311.field5027.method1832(var2 + class75.field1211, (byte) 62);
            class311.field5027.method1824(var3 + class145.field2327, 28357);
            class311.field5027.method1823(1617348648, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class311.field5027.method1865(class8.field170[82] ? 1 : 0, 89);
            class189.method1333(var5, var3, var2, (byte) -106);
        }
        if (var4 == 26) {
            class12 var11 = class28.field494[var7];
            if (var11 != null) {
                class246.field3877++;
                class40.field610 = class295.field4806;
                class26.field468 = 2;
                class224.field3521 = class16.field302;
                class115.field1750 = 0;
                class311.field5027.method2081(false, 78);
                class311.field5027.method1860(class8.field170[82] ? 1 : 0, 8239);
                class311.field5027.method1823(1617348648, var7);
                class74.method539(0, class217.field3408.field965[0], 0, var2, var3, var11.method101(false), true, -3, var11.method101(false), 0, class217.field3408.field956[0]);
            }
        }
        if (var4 == 19) {
            if (var7 == 0) {
                class123.field1959 = 1;
                class54.method337(class214.field3389, var2, var3);
            } else if (class117.field1796 > 0 && class8.field170[82] && class8.field170[81]) {
                class85.method608(class75.field1211 + var2, class145.field2327 + var3, (byte) -128, class214.field3389);
            } else {
                class311.field5027.method2081(false, 212);
                class311.field5027.method1824(class75.field1211 + var2, 28357);
                class311.field5027.method1823(1617348648, class145.field2327 + var3);
                class148.field2363++;
            }
        }
        if (var4 == 33) {
            class95.field1514++;
            class311.field5027.method2081(false, 135);
            class311.field5027.method1844(-1, class243.field3847);
            class311.field5027.method1823(1617348648, var2);
            class311.field5027.method1831(var3, 119690440);
            class311.field5027.method1851((byte) 81, class122.field1940);
        }
        if (var4 == 49) {
            class270.field4352++;
            class311.field5027.method2081(false, 220);
            class311.field5027.method1831(var3, 119690440);
            class248 var12 = class281.method1913(var3, (byte) 38);
            if (var12.field3899 != null && var12.field3899[0][0] == 5) {
                int var13 = var12.field3899[0][1];
                class68.field1090[var13] = 1 - class68.field1090[var13];
                class43.method291(var13, -125);
            }
        }
        if (var4 == 1008) {
            class241.field3768++;
            class115.field1750 = 0;
            class26.field468 = 2;
            class224.field3521 = class16.field302;
            class40.field610 = class295.field4806;
            class311.field5027.method2081(false, 27);
            class311.field5027.method1814(class8.field170[82] ? 1 : 0, (byte) -12);
            class311.field5027.method1823(1617348648, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class311.field5027.method1844(-1, var3 + class145.field2327);
            class311.field5027.method1823(1617348648, class75.field1211 + var2);
            class189.method1333(var5, var3, var2, (byte) -106);
        }
        if (var4 == 28) {
            class248 var14 = class281.method1913(var3, (byte) -128);
            boolean var15 = true;
            if (var14.field3957 > 0) {
                var15 = class186.method1313(124, var14);
            }
            if (var15) {
                class270.field4352++;
                class311.field5027.method2081(false, 220);
                class311.field5027.method1831(var3, 119690440);
            }
        }
        if (var4 == 57) {
            class311.field5027.method2081(false, 109);
            class193.field3150++;
            class311.field5027.method1824(var2, 28357);
            class311.field5027.method1831(var3, 119690440);
            class311.field5027.method1844(-1, var7);
            class191.field3124 = 0;
            class114.field1744 = class281.method1913(var3, (byte) -95);
            class239.field3745 = var2;
        }
        if (var4 == 36 || var4 == 1005) {
            class134.method914(var7, var3, class226.field3550[arg1], false, var2);
        }
        if (var4 == 10) {
            class51.method325(-62);
            class248 var16 = class281.method1913(var3, (byte) 79);
            class121.field1915 = var7;
            class45.field669 = 1;
            class119.field1878 = var2;
            class272.field4386 = var3;
            class111.method776(var16, (byte) 25);
            class259.field4248 = "<col=ff9040>" + class107.method754(-20563, var7).field2532 + "<col=ffffff>";
            if (class259.field4248 == null) {
                class259.field4248 = "null";
            }
        } else if (arg0 < -52) {
            if (var4 == 25) {
                if (var7 == 0) {
                    class54.method337(class214.field3389, var2, var3);
                } else if (var7 == 1) {
                    if (class117.field1796 > 0 && class8.field170[82] && class8.field170[81]) {
                        class85.method608(class75.field1211 + var2, class145.field2327 + var3, (byte) -115, class214.field3389);
                    } else {
                        class220.method1498(false, var2, 1, var3);
                        class311.field5027.method1865(class310.field5023, -115);
                        class311.field5027.method1865(class119.field1888, -100);
                        class311.field5027.method1824((int) class114.field1742, 28357);
                        class311.field5027.method1865(57, -113);
                        class311.field5027.method1865(class278.field4540, 25);
                        class311.field5027.method1865(class150.field2394, 116);
                        class311.field5027.method1865(89, -119);
                        class311.field5027.method1824(class217.field3408.field994, 28357);
                        class311.field5027.method1824(class217.field3408.field929, 28357);
                        class311.field5027.method1865(class280.field4556, 73);
                        class311.field5027.method1865(63, -117);
                        class74.method539(0, class217.field3408.field965[0], 0, var2, var3, 0, true, -3, 0, 0, class217.field3408.field956[0]);
                    }
                }
            }
            if (var4 == 12) {
                class12 var17 = class28.field494[var7];
                if (var17 != null) {
                    class26.field468 = 2;
                    class40.field610 = class295.field4806;
                    class115.field1750 = 0;
                    class229.field3590++;
                    class224.field3521 = class16.field302;
                    class311.field5027.method2081(false, 195);
                    class311.field5027.method1860(class8.field170[82] ? 1 : 0, 8239);
                    class311.field5027.method1824(var7, 28357);
                    class74.method539(0, class217.field3408.field965[0], 0, var2, var3, var17.method101(false), true, -3, var17.method101(false), 0, class217.field3408.field956[0]);
                }
            }
            if (var4 == 59) {
                class104 var18 = class131.field2113[var7];
                if (var18 != null) {
                    class26.field468 = 2;
                    class300.field4922++;
                    class40.field610 = class295.field4806;
                    class224.field3521 = class16.field302;
                    class115.field1750 = 0;
                    class311.field5027.method2081(false, 138);
                    class311.field5027.method1844(-1, var7);
                    class311.field5027.method1865(class8.field170[82] ? 1 : 0, -107);
                    class74.method539(0, class217.field3408.field965[0], 0, var2, var3, var18.method101(false), true, -3, var18.method101(false), 0, class217.field3408.field956[0]);
                }
            }
            if (var4 == 1002) {
                class40.field610 = class295.field4806;
                class115.field1750 = 0;
                class26.field468 = 2;
                class224.field3521 = class16.field302;
                class104 var19 = class131.field2113[var7];
                if (var19 != null) {
                    class242 var20 = var19.field1645;
                    if (var20.field3779 != null) {
                        var20 = var20.method1649(false);
                    }
                    if (var20 != null) {
                        class311.field5027.method2081(false, 44);
                        class40.field615++;
                        class311.field5027.method1823(1617348648, var20.field3835);
                    }
                }
            }
            if (var4 == 23 && class221.field3485 == null) {
                class144.method990(var2, var3, true);
                class221.field3485 = class79.method571(var2, var3, (byte) -74);
                class111.method776(class221.field3485, (byte) 25);
            }
            if (var4 == 35) {
                class104 var21 = class131.field2113[var7];
                if (var21 != null) {
                    class14.field294++;
                    class26.field468 = 2;
                    class40.field610 = class295.field4806;
                    class115.field1750 = 0;
                    class224.field3521 = class16.field302;
                    class311.field5027.method2081(false, 59);
                    class311.field5027.method1832(var7, (byte) 62);
                    class311.field5027.method1827(class8.field170[82] ? 1 : 0, -719196768);
                    class74.method539(0, class217.field3408.field965[0], 0, var2, var3, var21.method101(false), true, -3, var21.method101(false), 0, class217.field3408.field956[0]);
                }
            }
            if (var4 == 22) {
                class12 var22 = class28.field494[var7];
                if (var22 != null) {
                    class26.field468 = 2;
                    class224.field3521 = class16.field302;
                    class193.field3147++;
                    class40.field610 = class295.field4806;
                    class115.field1750 = 0;
                    class311.field5027.method2081(false, 45);
                    class311.field5027.method1824(class243.field3847, 28357);
                    class311.field5027.method1827(class8.field170[82] ? 1 : 0, -719196768);
                    class311.field5027.method1869(class122.field1940, false);
                    class311.field5027.method1832(var7, (byte) 62);
                    class74.method539(0, class217.field3408.field965[0], 0, var2, var3, var22.method101(false), true, -3, var22.method101(false), 0, class217.field3408.field956[0]);
                }
            }
            if (var4 == 42) {
                class115.field1750 = 0;
                class224.field3521 = class16.field302;
                class299.field4892++;
                class40.field610 = class295.field4806;
                class26.field468 = 2;
                class311.field5027.method2081(false, 98);
                class311.field5027.method1832(class121.field1915, (byte) 62);
                class311.field5027.method1832(class119.field1878, (byte) 62);
                class311.field5027.method1832(class145.field2327 + var3, (byte) 62);
                class311.field5027.method1824(class75.field1211 + var2, 28357);
                class311.field5027.method1869(class272.field4386, false);
                class311.field5027.method1814(class8.field170[82] ? 1 : 0, (byte) -12);
                class311.field5027.method1823(1617348648, (int) (var5 >>> 32) & Integer.MAX_VALUE);
                class189.method1333(var5, var3, var2, (byte) -106);
            }
            if (var4 == 51) {
                class40.field610 = class295.field4806;
                class26.field468 = 2;
                class115.field1750 = 0;
                class224.field3521 = class16.field302;
                class144.field2315++;
                class311.field5027.method2081(false, 127);
                class311.field5027.method1844(-1, class75.field1211 + var2);
                class311.field5027.method1844(-1, class145.field2327 + var3);
                class311.field5027.method1832(var7, (byte) 62);
                class311.field5027.method1814(class8.field170[82] ? 1 : 0, (byte) -12);
                class74.method539(0, class217.field3408.field965[0], 0, var2, var3, 0, true, -3, 0, 0, class217.field3408.field956[0]);
            }
            if (var4 == 32) {
                class233.field3640++;
                class311.field5027.method2081(false, 53);
                class311.field5027.method1851((byte) 107, var3);
                class311.field5027.method1823(1617348648, var2);
                class311.field5027.method1844(-1, var7);
                class191.field3124 = 0;
                class114.field1744 = class281.method1913(var3, (byte) 68);
                class239.field3745 = var2;
            }
            if (var4 == 50) {
                class311.field5027.method2081(false, 220);
                class311.field5027.method1831(var3, 119690440);
                class248 var23 = class281.method1913(var3, (byte) 78);
                class270.field4352++;
                if (var23.field3899 != null && var23.field3899[0][0] == 5) {
                    int var24 = var23.field3899[0][1];
                    if (class68.field1090[var24] != var23.field3966[0]) {
                        class68.field1090[var24] = var23.field3966[0];
                        class43.method291(var24, 23);
                    }
                }
            }
            if (var4 == 13) {
                class12 var25 = class28.field494[var7];
                if (var25 != null) {
                    class26.field468 = 2;
                    class217.field3407++;
                    class224.field3521 = class16.field302;
                    class115.field1750 = 0;
                    class40.field610 = class295.field4806;
                    class311.field5027.method2081(false, 80);
                    class311.field5027.method1844(-1, var7);
                    class311.field5027.method1814(class8.field170[82] ? 1 : 0, (byte) -12);
                    class74.method539(0, class217.field3408.field965[0], 0, var2, var3, var25.method101(false), true, -3, var25.method101(false), 0, class217.field3408.field956[0]);
                }
            }
            if (var4 == 1012) {
                class40.field610 = class295.field4806;
                class224.field3521 = class16.field302;
                class26.field468 = 2;
                class295.field4807++;
                class115.field1750 = 0;
                class311.field5027.method2081(false, 234);
                class311.field5027.method1844(-1, var7);
            }
            if (var4 == 29) {
                class311.field5027.method2081(false, 160);
                class311.field5027.method1844(-1, var2);
                class135.field2181++;
                class311.field5027.method1851((byte) 62, var3);
                class311.field5027.method1832(var7, (byte) 62);
                class191.field3124 = 0;
                class114.field1744 = class281.method1913(var3, (byte) 63);
                class239.field3745 = var2;
            }
            if (var4 == 1001 || var4 == 1003 || var4 == 1009 || var4 == 1011 || var4 == 1006) {
                class175.method1239(var2, var4, var7, 1006);
            }
            if (var4 == 48) {
                class115.field1750 = 0;
                class40.field610 = class295.field4806;
                class224.field3521 = class16.field302;
                class26.field468 = 2;
                class311.field5027.method2081(false, 49);
                class311.field5027.method1824(var7, 28357);
                class311.field5027.method1824(class119.field1878, 28357);
                class180.field2969++;
                class311.field5027.method1823(1617348648, class121.field1915);
                class311.field5027.method1860(class8.field170[82] ? 1 : 0, 8239);
                class311.field5027.method1832(class75.field1211 + var2, (byte) 62);
                class311.field5027.method1869(class272.field4386, false);
                class311.field5027.method1823(1617348648, var3 + class145.field2327);
                class74.method539(0, class217.field3408.field965[0], 0, var2, var3, 0, true, -3, 0, 0, class217.field3408.field956[0]);
            }
            if (var4 == 20) {
                class26.field468 = 2;
                class115.field1750 = 0;
                class40.field610 = class295.field4806;
                class26.field476++;
                class224.field3521 = class16.field302;
                class311.field5027.method2081(false, 31);
                class311.field5027.method1865(class8.field170[82] ? 1 : 0, 40);
                class311.field5027.method1823(1617348648, class75.field1211 + var2);
                class311.field5027.method1844(-1, class145.field2327 + var3);
                class311.field5027.method1824(var7, 28357);
                class74.method539(0, class217.field3408.field965[0], 0, var2, var3, 0, true, -3, 0, 0, class217.field3408.field956[0]);
            }
            if (var4 == 30) {
                class104 var26 = class131.field2113[var7];
                if (var26 != null) {
                    class224.field3521 = class16.field302;
                    class40.field610 = class295.field4806;
                    class26.field468 = 2;
                    class115.field1750 = 0;
                    class311.field5027.method2081(false, 237);
                    class298.field4866++;
                    class311.field5027.method1827(class8.field170[82] ? 1 : 0, -719196768);
                    class311.field5027.method1844(-1, var7);
                    class311.field5027.method1831(class122.field1940, 119690440);
                    class311.field5027.method1832(class243.field3847, (byte) 62);
                    class74.method539(0, class217.field3408.field965[0], 0, var2, var3, var26.method101(false), true, -3, var26.method101(false), 0, class217.field3408.field956[0]);
                }
            }
            if (var4 == 14) {
                class104 var27 = class131.field2113[var7];
                if (var27 != null) {
                    class26.field468 = 2;
                    class115.field1750 = 0;
                    class31.field529++;
                    class224.field3521 = class16.field302;
                    class40.field610 = class295.field4806;
                    class311.field5027.method2081(false, 51);
                    class311.field5027.method1860(class8.field170[82] ? 1 : 0, 8239);
                    class311.field5027.method1823(1617348648, var7);
                    class74.method539(0, class217.field3408.field965[0], 0, var2, var3, var27.method101(false), true, -3, var27.method101(false), 0, class217.field3408.field956[0]);
                }
            }
            if (var4 == 41) {
                class43.field640++;
                class311.field5027.method2081(false, 91);
                class311.field5027.method1828(var3, 0);
                class311.field5027.method1823(1617348648, var7);
                class311.field5027.method1844(-1, var2);
                class191.field3124 = 0;
                class114.field1744 = class281.method1913(var3, (byte) -80);
                class239.field3745 = var2;
            }
            if (var4 == 58) {
                class12 var28 = class28.field494[var7];
                if (var28 != null) {
                    class40.field610 = class295.field4806;
                    class26.field468 = 2;
                    class41.field631++;
                    class224.field3521 = class16.field302;
                    class115.field1750 = 0;
                    class311.field5027.method2081(false, 154);
                    class311.field5027.method1832(var7, (byte) 62);
                    class311.field5027.method1860(class8.field170[82] ? 1 : 0, 8239);
                    class74.method539(0, class217.field3408.field965[0], 0, var2, var3, var28.method101(false), true, -3, var28.method101(false), 0, class217.field3408.field956[0]);
                }
            }
            if (var4 == 24) {
                class248 var29 = class79.method571(var2, var3, (byte) -74);
                if (var29 != null) {
                    class51.method325(-31);
                    class22 var30 = client.method1126(var29);
                    class224.method1556(var2, var29.field3900, 0, var3, var30.field411, var30.method176(2), var29.field3961);
                    class45.field669 = 0;
                    class205.field3297 = class157.method1063(var29, -1);
                    if (var29.field3952) {
                        class211.field3367 = var29.field4064 + "<col=ffffff>";
                    } else {
                        class211.field3367 = "<col=00ff00>" + var29.field4008 + "<col=ffffff>";
                    }
                    if (class205.field3297 == null) {
                        class205.field3297 = "Null";
                    }
                }
            } else {
                if (var4 == 3) {
                    class12 var31 = class28.field494[var7];
                    if (var31 != null) {
                        class121.field1910++;
                        class115.field1750 = 0;
                        class40.field610 = class295.field4806;
                        class224.field3521 = class16.field302;
                        class26.field468 = 2;
                        class311.field5027.method2081(false, 12);
                        class311.field5027.method1824(var7, 28357);
                        class311.field5027.method1865(class8.field170[82] ? 1 : 0, 116);
                        class74.method539(0, class217.field3408.field965[0], 0, var2, var3, var31.method101(false), true, -3, var31.method101(false), 0, class217.field3408.field956[0]);
                    }
                }
                if (var4 == 16) {
                    class12 var32 = class28.field494[var7];
                    if (var32 != null) {
                        class219.field3450++;
                        class26.field468 = 2;
                        class115.field1750 = 0;
                        class40.field610 = class295.field4806;
                        class224.field3521 = class16.field302;
                        class311.field5027.method2081(false, 187);
                        class311.field5027.method1824(class121.field1915, 28357);
                        class311.field5027.method1860(class8.field170[82] ? 1 : 0, 8239);
                        class311.field5027.method1832(var7, (byte) 62);
                        class311.field5027.method1831(class272.field4386, 119690440);
                        class311.field5027.method1824(class119.field1878, 28357);
                        class74.method539(0, class217.field3408.field965[0], 0, var2, var3, var32.method101(false), true, -3, var32.method101(false), 0, class217.field3408.field956[0]);
                    }
                }
                if (var4 == 44) {
                    class224.field3521 = class16.field302;
                    class269.field4349++;
                    class26.field468 = 2;
                    class115.field1750 = 0;
                    class40.field610 = class295.field4806;
                    class311.field5027.method2081(false, 66);
                    class311.field5027.method1827(class8.field170[82] ? 1 : 0, -719196768);
                    class311.field5027.method1832(class75.field1211 + var2, (byte) 62);
                    class311.field5027.method1823(1617348648, var3 + class145.field2327);
                    class311.field5027.method1823(1617348648, (int) (var5 >>> 32) & Integer.MAX_VALUE);
                    class189.method1333(var5, var3, var2, (byte) -106);
                }
                if (var4 == 5) {
                    class115.field1750 = 0;
                    class150.field2387++;
                    class40.field610 = class295.field4806;
                    class224.field3521 = class16.field302;
                    class26.field468 = 2;
                    class311.field5027.method2081(false, 19);
                    class311.field5027.method1828(class122.field1940, 0);
                    class311.field5027.method1832(class145.field2327 + var3, (byte) 62);
                    class311.field5027.method1844(-1, class75.field1211 + var2);
                    class311.field5027.method1824(var7, 28357);
                    class311.field5027.method1827(class8.field170[82] ? 1 : 0, -719196768);
                    class311.field5027.method1832(class243.field3847, (byte) 62);
                    class74.method539(0, class217.field3408.field965[0], 0, var2, var3, 0, true, -3, 0, 0, class217.field3408.field956[0]);
                }
                if (var4 == 4) {
                    class224.field3521 = class16.field302;
                    class115.field1750 = 0;
                    class26.field468 = 2;
                    class40.field610 = class295.field4806;
                    class311.field5027.method2081(false, 153);
                    class272.field4374++;
                    class311.field5027.method1844(-1, var3 + class145.field2327);
                    class311.field5027.method1823(1617348648, Integer.MAX_VALUE & (int) (var5 >>> 32));
                    class311.field5027.method1844(-1, var2 + class75.field1211);
                    class311.field5027.method1865(class8.field170[82] ? 1 : 0, -115);
                    class189.method1333(var5, var3, var2, (byte) -106);
                }
                if (var4 == 45) {
                    if (var7 == 0) {
                        class285.field4620 = 1;
                        class54.method337(class214.field3389, var2, var3);
                    } else if (var7 == 1) {
                        class311.field5027.method2081(false, 235);
                        class147.field2351++;
                        class311.field5027.method1823(1617348648, class145.field2327 + var3);
                        class311.field5027.method1824(class75.field1211 + var2, 28357);
                        class311.field5027.method1844(-1, class243.field3847);
                        class311.field5027.method1831(class122.field1940, 119690440);
                    }
                }
                if (var4 == 6) {
                    class311.field5027.method2081(false, 41);
                    class137.field2213++;
                    class311.field5027.method1844(-1, var2);
                    class311.field5027.method1831(var3, 119690440);
                    class311.field5027.method1832(var7, (byte) 62);
                    class191.field3124 = 0;
                    class114.field1744 = class281.method1913(var3, (byte) -107);
                    class239.field3745 = var2;
                }
                if (var4 == 2) {
                    class231.field3622++;
                    class311.field5027.method2081(false, 122);
                    class311.field5027.method1824(var2, 28357);
                    class311.field5027.method1869(var3, false);
                    class311.field5027.method1844(-1, var7);
                    class191.field3124 = 0;
                    class114.field1744 = class281.method1913(var3, (byte) -89);
                    class239.field3745 = var2;
                }
                if (var4 == 1) {
                    class59.field858++;
                    class311.field5027.method2081(false, 55);
                    class311.field5027.method1823(1617348648, var7);
                    class311.field5027.method1832(var2, (byte) 62);
                    class311.field5027.method1831(var3, 119690440);
                    class191.field3124 = 0;
                    class114.field1744 = class281.method1913(var3, (byte) 78);
                    class239.field3745 = var2;
                }
                if (var4 == 8) {
                    class135.field2183++;
                    class311.field5027.method2081(false, 105);
                    class311.field5027.method1832(var2, (byte) 62);
                    class311.field5027.method1831(var3, 119690440);
                    class311.field5027.method1844(-1, class119.field1878);
                    class311.field5027.method1844(-1, var7);
                    class311.field5027.method1828(class272.field4386, 0);
                    class311.field5027.method1832(class121.field1915, (byte) 62);
                    class191.field3124 = 0;
                    class114.field1744 = class281.method1913(var3, (byte) 116);
                    class239.field3745 = var2;
                }
                if (var4 == 38) {
                    class104 var33 = class131.field2113[var7];
                    if (var33 != null) {
                        class26.field468 = 2;
                        class115.field1750 = 0;
                        class60.field868++;
                        class40.field610 = class295.field4806;
                        class224.field3521 = class16.field302;
                        class311.field5027.method2081(false, 34);
                        class311.field5027.method1832(var7, (byte) 62);
                        class311.field5027.method1865(class8.field170[82] ? 1 : 0, 49);
                        class74.method539(0, class217.field3408.field965[0], 0, var2, var3, var33.method101(false), true, -3, var33.method101(false), 0, class217.field3408.field956[0]);
                    }
                }
                if (var4 == 9) {
                    class26.field468 = 2;
                    class224.field3521 = class16.field302;
                    class307.field4985++;
                    class115.field1750 = 0;
                    class40.field610 = class295.field4806;
                    class311.field5027.method2081(false, 178);
                    class311.field5027.method1824(var7, 28357);
                    class311.field5027.method1832(class145.field2327 + var3, (byte) 62);
                    class311.field5027.method1865(class8.field170[82] ? 1 : 0, 31);
                    class311.field5027.method1823(1617348648, class75.field1211 + var2);
                    class74.method539(0, class217.field3408.field965[0], 0, var2, var3, 0, true, -3, 0, 0, class217.field3408.field956[0]);
                }
                if (var4 == 47) {
                    class12 var34 = class28.field494[var7];
                    if (var34 != null) {
                        class224.field3521 = class16.field302;
                        class26.field468 = 2;
                        class40.field610 = class295.field4806;
                        class153.field2446++;
                        class115.field1750 = 0;
                        class311.field5027.method2081(false, 108);
                        class311.field5027.method1832(var7, (byte) 62);
                        class311.field5027.method1865(class8.field170[82] ? 1 : 0, -113);
                        class74.method539(0, class217.field3408.field965[0], 0, var2, var3, var34.method101(false), true, -3, var34.method101(false), 0, class217.field3408.field956[0]);
                    }
                }
                if (var4 == 18) {
                    class311.field5027.method2081(false, 164);
                    class311.field5027.method1869(var3, false);
                    class311.field5027.method1844(-1, var7);
                    class36.field577++;
                    class311.field5027.method1823(1617348648, var2);
                    class191.field3124 = 0;
                    class114.field1744 = class281.method1913(var3, (byte) 96);
                    class239.field3745 = var2;
                }
                if (var4 == 21) {
                    class12 var35 = class28.field494[var7];
                    if (var35 != null) {
                        class224.field3521 = class16.field302;
                        class26.field468 = 2;
                        class115.field1750 = 0;
                        class304.field4953++;
                        class40.field610 = class295.field4806;
                        class311.field5027.method2081(false, 254);
                        class311.field5027.method1823(1617348648, var7);
                        class311.field5027.method1827(class8.field170[82] ? 1 : 0, -719196768);
                        class74.method539(0, class217.field3408.field965[0], 0, var2, var3, var35.method101(false), true, -3, var35.method101(false), 0, class217.field3408.field956[0]);
                    }
                }
                if (var4 == 46) {
                    class104 var36 = class131.field2113[var7];
                    if (var36 != null) {
                        class26.field468 = 2;
                        class224.field3521 = class16.field302;
                        class115.field1750 = 0;
                        class75.field1210++;
                        class40.field610 = class295.field4806;
                        class311.field5027.method2081(false, 162);
                        class311.field5027.method1823(1617348648, var7);
                        class311.field5027.method1851((byte) 84, class272.field4386);
                        class311.field5027.method1844(-1, class121.field1915);
                        class311.field5027.method1827(class8.field170[82] ? 1 : 0, -719196768);
                        class311.field5027.method1823(1617348648, class119.field1878);
                        class74.method539(0, class217.field3408.field965[0], 0, var2, var3, var36.method101(false), true, -3, var36.method101(false), 0, class217.field3408.field956[0]);
                    }
                }
                if (var4 == 40) {
                    class29.field522++;
                    class311.field5027.method2081(false, 159);
                    class311.field5027.method1869(var3, false);
                    class311.field5027.method1832(var7, (byte) 62);
                    class311.field5027.method1832(var2, (byte) 62);
                    class191.field3124 = 0;
                    class114.field1744 = class281.method1913(var3, (byte) -68);
                    class239.field3745 = var2;
                }
                if (var4 == 1007) {
                    class261.field4265++;
                    class40.field610 = class295.field4806;
                    class26.field468 = 2;
                    class115.field1750 = 0;
                    class224.field3521 = class16.field302;
                    class311.field5027.method2081(false, 114);
                    class311.field5027.method1832(var7, (byte) 62);
                }
                if (var4 == 17) {
                    class311.field5027.method2081(false, 141);
                    class306.field4979++;
                    class311.field5027.method1824(var7, 28357);
                    class311.field5027.method1828(var3, 0);
                    class311.field5027.method1832(var2, (byte) 62);
                    class191.field3124 = 0;
                    class114.field1744 = class281.method1913(var3, (byte) -89);
                    class239.field3745 = var2;
                }
                if (var4 == 43) {
                    class311.field5027.method2081(false, 218);
                    class158.field2540++;
                    class311.field5027.method1869(class122.field1940, false);
                    class311.field5027.method1824(var7, 28357);
                    class311.field5027.method1823(1617348648, class243.field3847);
                    class311.field5027.method1831(var3, 119690440);
                    class311.field5027.method1832(var2, (byte) 62);
                    class191.field3124 = 0;
                    class114.field1744 = class281.method1913(var3, (byte) -80);
                    class239.field3745 = var2;
                }
                if (class45.field669 != 0) {
                    class45.field669 = 0;
                    class111.method776(class281.method1913(class272.field4386, (byte) 109), (byte) 25);
                }
                if (class101.field1579) {
                    class51.method325(124);
                }
                if (class114.field1744 != null && class191.field3124 == 0) {
                    class111.method776(class114.field1744, (byte) 25);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILec;I)V")
    public static final void method643(int arg0, class25 arg1, int arg2) {
        if (arg2 > -122) {
            method644((byte) 1, (class104) null);
        }
        int var3 = 0;
        field1464++;
        class146.field2349 = 0;
        int var4 = 0;
        int var5 = -1;
        int[] var6 = arg1.field467;
        byte var7 = -1;
        int[] var8 = arg1.field466;
        try {
            int var9 = 0;
            label4039: while (true) {
                var9++;
                if (arg0 < var9) {
                    throw new RuntimeException("slow");
                }
                var5++;
                int var526 = var6[var5];
                if (var526 < 100) {
                    if (var526 == 0) {
                        class146.field2346[var3++] = var8[var5];
                        continue;
                    }
                    if (var526 == 1) {
                        int var10 = var8[var5];
                        class146.field2346[var3++] = class68.field1090[var10];
                        continue;
                    }
                    if (var526 == 2) {
                        int var11 = var8[var5];
                        var3--;
                        class298.method2043(class146.field2346[var3], var11, 0);
                        continue;
                    }
                    if (var526 == 3) {
                        class53.field778[var4++] = arg1.field464[var5];
                        continue;
                    }
                    if (var526 == 6) {
                        var5 += var8[var5];
                        continue;
                    }
                    if (var526 == 7) {
                        var3 -= 2;
                        if (class146.field2346[var3 + 1] != class146.field2346[var3]) {
                            var5 += var8[var5];
                        }
                        continue;
                    }
                    if (var526 == 8) {
                        var3 -= 2;
                        if (class146.field2346[var3 + 1] == class146.field2346[var3]) {
                            var5 += var8[var5];
                        }
                        continue;
                    }
                    if (var526 == 9) {
                        var3 -= 2;
                        if (class146.field2346[var3] < class146.field2346[var3 + 1]) {
                            var5 += var8[var5];
                        }
                        continue;
                    }
                    if (var526 == 10) {
                        var3 -= 2;
                        if (class146.field2346[var3 + 1] < class146.field2346[var3]) {
                            var5 += var8[var5];
                        }
                        continue;
                    }
                    if (var526 == 21) {
                        if (class146.field2349 == 0) {
                            return;
                        }
                        class72 var12 = class236.field3712[--class146.field2349];
                        arg1 = var12.field1153;
                        class247.field3882 = var12.field1145;
                        var5 = var12.field1155;
                        var8 = arg1.field466;
                        var6 = arg1.field467;
                        class213.field3382 = var12.field1148;
                        continue;
                    }
                    if (var526 == 25) {
                        int var13 = var8[var5];
                        class146.field2346[var3++] = class119.method821(var13, 1929);
                        continue;
                    }
                    if (var526 == 27) {
                        int var14 = var8[var5];
                        var3--;
                        class208.method1430(15741, var14, class146.field2346[var3]);
                        continue;
                    }
                    if (var526 == 31) {
                        var3 -= 2;
                        if (class146.field2346[var3] <= class146.field2346[var3 + 1]) {
                            var5 += var8[var5];
                        }
                        continue;
                    }
                    if (var526 == 32) {
                        var3 -= 2;
                        if (class146.field2346[var3 + 1] <= class146.field2346[var3]) {
                            var5 += var8[var5];
                        }
                        continue;
                    }
                    if (var526 == 33) {
                        class146.field2346[var3++] = class213.field3382[var8[var5]];
                        continue;
                    }
                    int var10001;
                    if (var526 == 34) {
                        var10001 = var8[var5];
                        var3--;
                        class213.field3382[var10001] = class146.field2346[var3];
                        continue;
                    }
                    if (var526 == 35) {
                        class53.field778[var4++] = class247.field3882[var8[var5]];
                        continue;
                    }
                    if (var526 == 36) {
                        var10001 = var8[var5];
                        var4--;
                        class247.field3882[var10001] = class53.field778[var4];
                        continue;
                    }
                    if (var526 == 37) {
                        int var15 = var8[var5];
                        var4 -= var15;
                        String var16 = class90.method627(var4, class53.field778, var15, true);
                        class53.field778[var4++] = var16;
                        continue;
                    }
                    if (var526 == 38) {
                        var3--;
                        continue;
                    }
                    if (var526 == 39) {
                        var4--;
                        continue;
                    }
                    if (var526 == 40) {
                        int var17 = var8[var5];
                        class25 var18 = class274.method1856(var17, 0);
                        int[] var19 = new int[var18.field459];
                        String[] var20 = new String[var18.field465];
                        for (int var21 = 0; var21 < var18.field460; var21++) {
                            var19[var21] = class146.field2346[var21 + var3 - var18.field460];
                        }
                        for (int var22 = 0; var22 < var18.field456; var22++) {
                            var20[var22] = class53.field778[var4 + var22 - var18.field456];
                        }
                        var4 -= var18.field456;
                        var3 -= var18.field460;
                        class72 var23 = new class72();
                        var23.field1155 = var5;
                        var23.field1145 = class247.field3882;
                        var23.field1153 = arg1;
                        var23.field1148 = class213.field3382;
                        if (class236.field3712.length <= class146.field2349) {
                            throw new RuntimeException();
                        }
                        arg1 = var18;
                        var5 = -1;
                        class236.field3712[class146.field2349++] = var23;
                        class247.field3882 = var20;
                        var8 = var18.field466;
                        var6 = var18.field467;
                        class213.field3382 = var19;
                        continue;
                    }
                    if (var526 == 42) {
                        class146.field2346[var3++] = class218.field3433[var8[var5]];
                        continue;
                    }
                    if (var526 == 43) {
                        int var24 = var8[var5];
                        var3--;
                        class218.field3433[var24] = class146.field2346[var3];
                        class140.method972((byte) -98, var24);
                        continue;
                    }
                    if (var526 == 44) {
                        int var25 = var8[var5] >> 16;
                        int var26 = var8[var5] & 0xFFFF;
                        var3--;
                        int var27 = class146.field2346[var3];
                        if (var27 >= 0 && var27 <= 5000) {
                            class295.field4812[var25] = var27;
                            byte var28 = -1;
                            if (var26 == 105) {
                                var28 = 0;
                            }
                            int var29 = 0;
                            while (true) {
                                if (var29 >= var27) {
                                    continue label4039;
                                }
                                class115.field1747[var25][var29] = var28;
                                var29++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var526 == 45) {
                        var3--;
                        int var30 = class146.field2346[var3];
                        int var31 = var8[var5];
                        if (var30 >= 0 && var30 < class295.field4812[var31]) {
                            class146.field2346[var3++] = class115.field1747[var31][var30];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var526 == 46) {
                        var3 -= 2;
                        int var32 = var8[var5];
                        int var33 = class146.field2346[var3];
                        if (var33 >= 0 && var33 < class295.field4812[var32]) {
                            class115.field1747[var32][var33] = class146.field2346[var3 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var526 == 47) {
                        String var34 = class120.field1902[var8[var5]];
                        if (var34 == null) {
                            var34 = "null";
                        }
                        class53.field778[var4++] = var34;
                        continue;
                    }
                    if (var526 == 48) {
                        int var35 = var8[var5];
                        var4--;
                        class120.field1902[var35] = class53.field778[var4];
                        class149.method1013(var35, true);
                        continue;
                    }
                    if (var526 == 51) {
                        class58 var36 = arg1.field453[var8[var5]];
                        var3--;
                        class71 var37 = (class71) var36.method371(81, (long) class146.field2346[var3]);
                        if (var37 != null) {
                            var5 += var37.field1138;
                        }
                        continue;
                    }
                }
                boolean var38;
                if (var8[var5] == 1) {
                    var38 = true;
                } else {
                    var38 = false;
                }
                if (var526 < 300) {
                    if (var526 == 100) {
                        var3 -= 3;
                        int var506 = class146.field2346[var3];
                        int var507 = class146.field2346[var3 + 1];
                        int var508 = class146.field2346[var3 + 2];
                        if (var507 == 0) {
                            throw new RuntimeException();
                        }
                        class248 var509 = class281.method1913(var506, (byte) 82);
                        if (var509.field4068 == null) {
                            var509.field4068 = new class248[var508 + 1];
                        }
                        if (var509.field4068.length <= var508) {
                            class248[] var510 = new class248[var508 + 1];
                            for (int var511 = 0; var511 < var509.field4068.length; var511++) {
                                var510[var511] = var509.field4068[var511];
                            }
                            var509.field4068 = var510;
                        }
                        if (var508 > 0 && var509.field4068[var508 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var508 - 1));
                        }
                        class248 var512 = new class248();
                        var512.field3974 = var512.field3968 = var509.field3968;
                        var512.field4038 = var507;
                        var512.field3952 = true;
                        var512.field4019 = var508;
                        var509.field4068[var508] = var512;
                        if (var38) {
                            class88.field1379 = var512;
                        } else {
                            class164.field2720 = var512;
                        }
                        class111.method776(var509, (byte) 25);
                        continue;
                    }
                    if (var526 == 101) {
                        class248 var513 = var38 ? class88.field1379 : class164.field2720;
                        if (var513.field4019 == -1) {
                            if (!var38) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class248 var514 = class281.method1913(var513.field3968, (byte) 51);
                        var514.field4068[var513.field4019] = null;
                        class111.method776(var514, (byte) 25);
                        continue;
                    }
                    if (var526 == 102) {
                        var3--;
                        class248 var515 = class281.method1913(class146.field2346[var3], (byte) 57);
                        var515.field4068 = null;
                        class111.method776(var515, (byte) 25);
                        continue;
                    }
                    if (var526 == 200) {
                        var3 -= 2;
                        int var516 = class146.field2346[var3];
                        int var517 = class146.field2346[var3 + 1];
                        class248 var518 = class79.method571(var517, var516, (byte) -74);
                        if (var518 != null && var517 != -1) {
                            class146.field2346[var3++] = 1;
                            if (var38) {
                                class88.field1379 = var518;
                            } else {
                                class164.field2720 = var518;
                            }
                            continue;
                        }
                        class146.field2346[var3++] = 0;
                        continue;
                    }
                    if (var526 == 201) {
                        var3--;
                        int var519 = class146.field2346[var3];
                        class248 var520 = class281.method1913(var519, (byte) 75);
                        if (var520 == null) {
                            class146.field2346[var3++] = 0;
                        } else {
                            class146.field2346[var3++] = 1;
                            if (var38) {
                                class88.field1379 = var520;
                            } else {
                                class164.field2720 = var520;
                            }
                        }
                        continue;
                    }
                } else if (var526 < 500) {
                    if (var526 == 403) {
                        var3 -= 2;
                        int var499 = class146.field2346[var3];
                        int var500 = class146.field2346[var3 + 1];
                        for (int var501 = 0; var501 < class250.field4108.length; var501++) {
                            if (class250.field4108[var501] == var499) {
                                class217.field3408.field232.method1909(var501, var500, -1);
                                continue label4039;
                            }
                        }
                        int var502 = 0;
                        while (true) {
                            if (class169.field2770.length <= var502) {
                                continue label4039;
                            }
                            if (class169.field2770[var502] == var499) {
                                class217.field3408.field232.method1909(var502, var500, -1);
                                continue label4039;
                            }
                            var502++;
                        }
                    }
                    if (var526 == 404) {
                        var3 -= 2;
                        int var503 = class146.field2346[var3];
                        int var504 = class146.field2346[var3 + 1];
                        class217.field3408.field232.method1908(517827280, var504, var503);
                        continue;
                    }
                    if (var526 == 410) {
                        var3--;
                        boolean var505 = class146.field2346[var3] != 0;
                        class217.field3408.field232.method1906(-667828049, var505);
                        continue;
                    }
                } else if (var526 >= 1000 && var526 < 1100 || var526 >= 2000 && var526 < 2100) {
                    class248 var39;
                    if (var526 < 2000) {
                        var39 = var38 ? class88.field1379 : class164.field2720;
                    } else {
                        var3--;
                        var39 = class281.method1913(class146.field2346[var3], (byte) -102);
                        var526 -= 1000;
                    }
                    if (var526 == 1000) {
                        var3 -= 4;
                        var39.field4003 = class146.field2346[var3];
                        var39.field4026 = class146.field2346[var3 + 1];
                        int var40 = class146.field2346[var3 + 3];
                        int var41 = class146.field2346[var3 + 2];
                        if (var40 < 0) {
                            var40 = 0;
                        } else if (var40 > 5) {
                            var40 = 5;
                        }
                        if (var41 < 0) {
                            var41 = 0;
                        } else if (var41 > 5) {
                            var41 = 5;
                        }
                        var39.field3894 = (byte) var40;
                        var39.field3972 = (byte) var41;
                        class111.method776(var39, (byte) 25);
                        class243.method1654(var39, (byte) 127);
                        if (var39.field4019 == -1) {
                            class21.method164((byte) 117, var39.field3968);
                        }
                        continue;
                    }
                    if (var526 == 1001) {
                        var3 -= 4;
                        var39.field3911 = class146.field2346[var3];
                        var39.field4029 = class146.field2346[var3 + 1];
                        var39.field4053 = 0;
                        var39.field3933 = 0;
                        int var42 = class146.field2346[var3 + 2];
                        if (var42 < 0) {
                            var42 = 0;
                        } else if (var42 > 4) {
                            var42 = 4;
                        }
                        int var43 = class146.field2346[var3 + 3];
                        var39.field4040 = (byte) var42;
                        if (var43 < 0) {
                            var43 = 0;
                        } else if (var43 > 4) {
                            var43 = 4;
                        }
                        var39.field3893 = (byte) var43;
                        class111.method776(var39, (byte) 25);
                        class243.method1654(var39, (byte) 127);
                        if (var39.field4038 == 0) {
                            class255.method1725((byte) -10, var39, false);
                        }
                        continue;
                    }
                    if (var526 == 1003) {
                        var3--;
                        boolean var44 = class146.field2346[var3] == 1;
                        if (var39.field4023 != var44) {
                            var39.field4023 = var44;
                            class111.method776(var39, (byte) 25);
                        }
                        if (var39.field4019 == -1) {
                            class106.method749(126, var39.field3968);
                        }
                        continue;
                    }
                    if (var526 == 1004) {
                        var3 -= 2;
                        var39.field4024 = class146.field2346[var3];
                        var39.field3959 = class146.field2346[var3 + 1];
                        class111.method776(var39, (byte) 25);
                        class243.method1654(var39, (byte) -74);
                        if (var39.field4038 == 0) {
                            class255.method1725((byte) -10, var39, false);
                        }
                        continue;
                    }
                    if (var526 == 1005) {
                        var3--;
                        var39.field4039 = class146.field2346[var3] == 1;
                        continue;
                    }
                } else if (var526 >= 1100 && var526 < 1200 || var526 >= 2100 && var526 < 2200) {
                    class248 var495;
                    if (var526 >= 2000) {
                        var3--;
                        var495 = class281.method1913(class146.field2346[var3], (byte) 78);
                        var526 -= 1000;
                    } else {
                        var495 = var38 ? class88.field1379 : class164.field2720;
                    }
                    if (var526 == 1100) {
                        var3 -= 2;
                        var495.field3944 = class146.field2346[var3];
                        if ((var495.field3914 - var495.field4016) < var495.field3944) {
                            var495.field3944 = var495.field3914 - var495.field4016;
                        }
                        if (var495.field3944 < 0) {
                            var495.field3944 = 0;
                        }
                        var495.field3953 = class146.field2346[var3 + 1];
                        if (var495.field3994 - var495.field4057 < var495.field3953) {
                            var495.field3953 = var495.field3994 - var495.field4057;
                        }
                        if (var495.field3953 < 0) {
                            var495.field3953 = 0;
                        }
                        class111.method776(var495, (byte) 25);
                        if (var495.field4019 == -1) {
                            class224.method1558(-506, var495.field3968);
                        }
                        continue;
                    }
                    if (var526 == 1101) {
                        var3--;
                        var495.field3976 = class146.field2346[var3];
                        class111.method776(var495, (byte) 25);
                        if (var495.field4019 == -1) {
                            class40.method280(var495.field3968, (byte) 101);
                        }
                        continue;
                    }
                    if (var526 == 1102) {
                        var3--;
                        var495.field3924 = class146.field2346[var3] == 1;
                        class111.method776(var495, (byte) 25);
                        continue;
                    }
                    if (var526 == 1103) {
                        var3--;
                        var495.field3939 = class146.field2346[var3];
                        class111.method776(var495, (byte) 25);
                        continue;
                    }
                    if (var526 == 1104) {
                        var3--;
                        var495.field3982 = class146.field2346[var3];
                        class111.method776(var495, (byte) 25);
                        continue;
                    }
                    if (var526 == 1105) {
                        var3--;
                        var495.field3895 = class146.field2346[var3];
                        class111.method776(var495, (byte) 25);
                        continue;
                    }
                    if (var526 == 1106) {
                        var3--;
                        var495.field3889 = class146.field2346[var3];
                        class111.method776(var495, (byte) 25);
                        continue;
                    }
                    if (var526 == 1107) {
                        var3--;
                        var495.field4000 = class146.field2346[var3] == 1;
                        class111.method776(var495, (byte) 25);
                        continue;
                    }
                    if (var526 == 1108) {
                        var495.field4042 = 1;
                        var3--;
                        var495.field4055 = class146.field2346[var3];
                        class111.method776(var495, (byte) 25);
                        if (var495.field4019 == -1) {
                            class153.method1038(var495.field3968, 4);
                        }
                        continue;
                    }
                    if (var526 == 1109) {
                        var3 -= 6;
                        var495.field4047 = class146.field2346[var3];
                        var495.field3923 = class146.field2346[var3 + 1];
                        var495.field4035 = class146.field2346[var3 + 2];
                        var495.field4062 = class146.field2346[var3 + 3];
                        var495.field4011 = class146.field2346[var3 + 4];
                        var495.field4022 = class146.field2346[var3 + 5];
                        class111.method776(var495, (byte) 25);
                        if (var495.field4019 == -1) {
                            class99.method706(false, var495.field3968);
                            class117.method808(var495.field3968, (byte) -18);
                        }
                        continue;
                    }
                    if (var526 == 1110) {
                        var3--;
                        int var496 = class146.field2346[var3];
                        if (var495.field3940 != var496) {
                            var495.field3940 = var496;
                            var495.field3969 = 1;
                            var495.field3927 = 0;
                            var495.field4031 = 0;
                            class111.method776(var495, (byte) 25);
                        }
                        if (var495.field4019 == -1) {
                            class135.method924(var495.field3968, 5);
                        }
                        continue;
                    }
                    if (var526 == 1111) {
                        var3--;
                        var495.field4018 = class146.field2346[var3] == 1;
                        class111.method776(var495, (byte) 25);
                        continue;
                    }
                    if (var526 == 1112) {
                        var4--;
                        String var497 = class53.field778[var4];
                        if (!var497.equals(var495.field4046)) {
                            var495.field4046 = var497;
                            class111.method776(var495, (byte) 25);
                        }
                        if (var495.field4019 == -1) {
                            class75.method541(var495.field3968, -87);
                        }
                        continue;
                    }
                    if (var526 == 1113) {
                        var3--;
                        var495.field3999 = class146.field2346[var3];
                        class111.method776(var495, (byte) 25);
                        continue;
                    }
                    if (var526 == 1114) {
                        var3 -= 3;
                        var495.field3987 = class146.field2346[var3];
                        var495.field3963 = class146.field2346[var3 + 1];
                        var495.field3971 = class146.field2346[var3 + 2];
                        class111.method776(var495, (byte) 25);
                        continue;
                    }
                    if (var526 == 1115) {
                        var3--;
                        var495.field4048 = class146.field2346[var3] == 1;
                        class111.method776(var495, (byte) 25);
                        continue;
                    }
                    if (var526 == 1116) {
                        var3--;
                        var495.field4050 = class146.field2346[var3];
                        class111.method776(var495, (byte) 25);
                        continue;
                    }
                    if (var526 == 1117) {
                        var3--;
                        var495.field3921 = class146.field2346[var3];
                        class111.method776(var495, (byte) 25);
                        continue;
                    }
                    if (var526 == 1118) {
                        var3--;
                        var495.field4015 = class146.field2346[var3] == 1;
                        class111.method776(var495, (byte) 25);
                        continue;
                    }
                    if (var526 == 1119) {
                        var3--;
                        var495.field3918 = class146.field2346[var3] == 1;
                        class111.method776(var495, (byte) 25);
                        continue;
                    }
                    if (var526 == 1120) {
                        var3 -= 2;
                        var495.field3914 = class146.field2346[var3];
                        var495.field3994 = class146.field2346[var3 + 1];
                        class111.method776(var495, (byte) 25);
                        if (var495.field4038 == 0) {
                            class255.method1725((byte) -10, var495, false);
                        }
                        continue;
                    }
                    if (var526 == 1121) {
                        class111.method776(var495, (byte) 25);
                        var3 -= 2;
                        continue;
                    }
                    if (var526 == 1122) {
                        var3--;
                        var495.field3950 = class146.field2346[var3] == 1;
                        class111.method776(var495, (byte) 25);
                        continue;
                    }
                    if (var526 == 1123) {
                        var3--;
                        var495.field4022 = class146.field2346[var3];
                        class111.method776(var495, (byte) 25);
                        if (var495.field4019 == -1) {
                            class99.method706(false, var495.field3968);
                        }
                        continue;
                    }
                    if (var526 == 1124) {
                        var3--;
                        int var498 = class146.field2346[var3];
                        var495.field3973 = var498 == 1;
                        class111.method776(var495, (byte) 25);
                        continue;
                    }
                } else if (!(var526 < 1200 || var526 >= 1300) || !(var526 < 2200 || var526 >= 2300)) {
                    class248 var45;
                    if (var526 < 2000) {
                        var45 = var38 ? class88.field1379 : class164.field2720;
                    } else {
                        var3--;
                        var45 = class281.method1913(class146.field2346[var3], (byte) -72);
                        var526 -= 1000;
                    }
                    class111.method776(var45, (byte) 25);
                    if (var526 == 1200 || var526 == 1205 || var526 == 1208 || var526 == 1209) {
                        var3 -= 2;
                        int var46 = class146.field2346[var3 + 1];
                        int var47 = class146.field2346[var3];
                        if (var45.field4019 == -1) {
                            class178.method1252(var45.field3968, 0);
                            class99.method706(false, var45.field3968);
                            class117.method808(var45.field3968, (byte) -18);
                        }
                        if (var47 == -1) {
                            var45.field4055 = -1;
                            var45.field4049 = -1;
                            var45.field4042 = 1;
                        } else {
                            if (var526 == 1208 || var526 == 1209) {
                                var45.field4061 = true;
                            } else {
                                var45.field4061 = false;
                            }
                            var45.field3902 = var46;
                            var45.field4049 = var47;
                            class158 var48 = class107.method754(-20563, var47);
                            var45.field3923 = var48.field2566;
                            var45.field4035 = var48.field2545;
                            var45.field4022 = var48.field2591;
                            var45.field4047 = var48.field2553;
                            if (var45.field4053 > 0) {
                                var45.field4022 = var45.field4022 * 32 / var45.field4053;
                            } else if (var45.field3911 > 0) {
                                var45.field4022 = var45.field4022 * 32 / var45.field3911;
                            }
                            var45.field4062 = var48.field2585;
                            if (var526 == 1205) {
                                var45.field4059 = false;
                            } else {
                                var45.field4059 = true;
                            }
                            var45.field4011 = var48.field2520;
                        }
                        continue;
                    }
                    if (var526 == 1201) {
                        var45.field4042 = 2;
                        var3--;
                        var45.field4055 = class146.field2346[var3];
                        if (var45.field4019 == -1) {
                            class153.method1038(var45.field3968, 4);
                        }
                        continue;
                    }
                    if (var526 == 1202) {
                        var45.field4042 = 3;
                        var45.field4055 = class217.field3408.field232.method1907((byte) -95);
                        if (var45.field4019 == -1) {
                            class153.method1038(var45.field3968, 4);
                        }
                        continue;
                    }
                    if (var526 == 1203) {
                        var45.field4042 = 6;
                        var3--;
                        var45.field4055 = class146.field2346[var3];
                        if (var45.field4019 == -1) {
                            class153.method1038(var45.field3968, 4);
                        }
                        continue;
                    }
                    if (var526 == 1204) {
                        var45.field4042 = 5;
                        var3--;
                        var45.field4055 = class146.field2346[var3];
                        if (var45.field4019 == -1) {
                            class153.method1038(var45.field3968, 4);
                        }
                        continue;
                    }
                    if (var526 == 1206) {
                        var3 -= 4;
                        var45.field4017 = class146.field2346[var3];
                        var45.field3997 = class146.field2346[var3 + 1];
                        var45.field4025 = class146.field2346[var3 + 2];
                        var45.field4012 = class146.field2346[var3 + 3];
                        class111.method776(var45, (byte) 25);
                        continue;
                    }
                    if (var526 == 1207) {
                        var3 -= 2;
                        var45.field3977 = class146.field2346[var3];
                        var45.field3995 = class146.field2346[var3 + 1];
                        class111.method776(var45, (byte) 25);
                        continue;
                    }
                } else if (var526 >= 1300 && var526 < 1400 || var526 >= 2300 && var526 < 2400) {
                    class248 var489;
                    if (var526 < 2000) {
                        var489 = var38 ? class88.field1379 : class164.field2720;
                    } else {
                        var526 -= 1000;
                        var3--;
                        var489 = class281.method1913(class146.field2346[var3], (byte) -115);
                    }
                    if (var526 == 1300) {
                        var3--;
                        int var490 = class146.field2346[var3] - 1;
                        if (var490 >= 0 && var490 <= 9) {
                            var4--;
                            var489.method1680(var490, class53.field778[var4], 0);
                            continue;
                        }
                        var4--;
                        continue;
                    }
                    if (var526 == 1301) {
                        var3 -= 2;
                        int var491 = class146.field2346[var3];
                        int var492 = class146.field2346[var3 + 1];
                        var489.field3922 = class79.method571(var492, var491, (byte) -74);
                        continue;
                    }
                    if (var526 == 1302) {
                        var3--;
                        var489.field3941 = class146.field2346[var3] == 1;
                        continue;
                    }
                    if (var526 == 1303) {
                        var3--;
                        var489.field4001 = class146.field2346[var3];
                        continue;
                    }
                    if (var526 == 1304) {
                        var3--;
                        var489.field3945 = class146.field2346[var3];
                        continue;
                    }
                    if (var526 == 1305) {
                        var4--;
                        var489.field4064 = class53.field778[var4];
                        continue;
                    }
                    if (var526 == 1306) {
                        var4--;
                        var489.field3951 = class53.field778[var4];
                        continue;
                    }
                    if (var526 == 1307) {
                        var489.field3991 = null;
                        continue;
                    }
                    if (var526 == 1308) {
                        var3--;
                        var489.field3900 = class146.field2346[var3];
                        var3--;
                        var489.field3961 = class146.field2346[var3];
                        continue;
                    }
                    if (var526 == 1309) {
                        var3--;
                        int var493 = class146.field2346[var3];
                        var3--;
                        int var494 = class146.field2346[var3];
                        if (var494 >= 1 && var494 <= 10) {
                            var489.method1682(var493, (byte) 87, var494 - 1);
                        }
                        continue;
                    }
                    if (var526 == 1310) {
                        var4--;
                        var489.field3947 = class53.field778[var4];
                        continue;
                    }
                } else {
                    if (var526 >= 1400 && var526 < 1500 || var526 >= 2400 && var526 < 2500) {
                        class248 var482;
                        if (var526 >= 2000) {
                            var3--;
                            var482 = class281.method1913(class146.field2346[var3], (byte) -73);
                            var526 -= 1000;
                        } else {
                            var482 = var38 ? class88.field1379 : class164.field2720;
                        }
                        var4--;
                        String var483 = class53.field778[var4];
                        int[] var484 = null;
                        if (var483.length() > 0 && var483.charAt(var483.length() - 1) == 'Y') {
                            var3--;
                            int var485 = class146.field2346[var3];
                            if (var485 > 0) {
                                var484 = new int[var485];
                                while (var485-- > 0) {
                                    var3--;
                                    var484[var485] = class146.field2346[var3];
                                }
                            }
                            var483 = var483.substring(0, var483.length() - 1);
                        }
                        Object[] var486 = new Object[var483.length() + 1];
                        for (int var487 = var486.length - 1; var487 >= 1; var487--) {
                            if (var483.charAt(var487 - 1) == 's') {
                                var4--;
                                var486[var487] = class53.field778[var4];
                            } else {
                                var3--;
                                var486[var487] = Integer.valueOf(class146.field2346[var3]);
                            }
                        }
                        var3--;
                        int var488 = class146.field2346[var3];
                        if (var488 == -1) {
                            var486 = null;
                        } else {
                            var486[0] = Integer.valueOf(var488);
                        }
                        var482.field4065 = true;
                        if (var526 == 1400) {
                            var482.field3975 = var486;
                        } else if (var526 == 1401) {
                            var482.field4067 = var486;
                        } else if (var526 == 1402) {
                            var482.field3904 = var486;
                        } else if (var526 == 1403) {
                            var482.field3980 = var486;
                        } else if (var526 == 1404) {
                            var482.field3967 = var486;
                        } else if (var526 == 1405) {
                            var482.field3908 = var486;
                        } else if (var526 == 1406) {
                            var482.field3962 = var486;
                        } else if (var526 == 1407) {
                            var482.field4014 = var484;
                            var482.field3928 = var486;
                        } else if (var526 == 1408) {
                            var482.field3990 = var486;
                        } else if (var526 == 1409) {
                            var482.field3986 = var486;
                        } else if (var526 == 1410) {
                            var482.field3942 = var486;
                        } else if (var526 == 1411) {
                            var482.field3998 = var486;
                        } else if (var526 == 1412) {
                            var482.field3905 = var486;
                        } else if (var526 == 1414) {
                            var482.field3981 = var484;
                            var482.field3909 = var486;
                        } else if (var526 == 1415) {
                            var482.field4034 = var486;
                            var482.field4006 = var484;
                        } else if (var526 == 1416) {
                            var482.field3919 = var486;
                        } else if (var526 == 1417) {
                            var482.field3931 = var486;
                        } else if (var526 == 1418) {
                            var482.field3943 = var486;
                        } else if (var526 == 1419) {
                            var482.field3948 = var486;
                        } else if (var526 == 1420) {
                            var482.field3932 = var486;
                        } else if (var526 == 1421) {
                            var482.field4010 = var486;
                        } else if (var526 == 1422) {
                            var482.field3926 = var486;
                        } else if (var526 == 1423) {
                            var482.field3906 = var486;
                        } else if (var526 == 1424) {
                            var482.field3983 = var486;
                        } else if (var526 == 1425) {
                            var482.field4073 = var486;
                        } else if (var526 == 1426) {
                            var482.field3985 = var486;
                        } else if (var526 == 1427) {
                            var482.field3964 = var486;
                        } else if (var526 == 1428) {
                            var482.field3958 = var486;
                            var482.field3984 = var484;
                        } else if (var526 == 1429) {
                            var482.field4013 = var484;
                            var482.field4060 = var486;
                        }
                        continue;
                    }
                    if (var526 < 1600) {
                        class248 var49 = var38 ? class88.field1379 : class164.field2720;
                        if (var526 == 1500) {
                            class146.field2346[var3++] = var49.field4037;
                            continue;
                        }
                        if (var526 == 1501) {
                            class146.field2346[var3++] = var49.field3916;
                            continue;
                        }
                        if (var526 == 1502) {
                            class146.field2346[var3++] = var49.field4016;
                            continue;
                        }
                        if (var526 == 1503) {
                            class146.field2346[var3++] = var49.field4057;
                            continue;
                        }
                        if (var526 == 1504) {
                            class146.field2346[var3++] = var49.field4023 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 1505) {
                            class146.field2346[var3++] = var49.field3974;
                            continue;
                        }
                    } else if (var526 < 1700) {
                        class248 var481 = var38 ? class88.field1379 : class164.field2720;
                        if (var526 == 1600) {
                            class146.field2346[var3++] = var481.field3944;
                            continue;
                        }
                        if (var526 == 1601) {
                            class146.field2346[var3++] = var481.field3953;
                            continue;
                        }
                        if (var526 == 1602) {
                            class53.field778[var4++] = var481.field4046;
                            continue;
                        }
                        if (var526 == 1603) {
                            class146.field2346[var3++] = var481.field3914;
                            continue;
                        }
                        if (var526 == 1604) {
                            class146.field2346[var3++] = var481.field3994;
                            continue;
                        }
                        if (var526 == 1605) {
                            class146.field2346[var3++] = var481.field4022;
                            continue;
                        }
                        if (var526 == 1606) {
                            class146.field2346[var3++] = var481.field4035;
                            continue;
                        }
                        if (var526 == 1607) {
                            class146.field2346[var3++] = var481.field4011;
                            continue;
                        }
                        if (var526 == 1608) {
                            class146.field2346[var3++] = var481.field4062;
                            continue;
                        }
                        if (var526 == 1609) {
                            class146.field2346[var3++] = var481.field3939;
                            continue;
                        }
                        if (var526 == 1610) {
                            class146.field2346[var3++] = var481.field4047;
                            continue;
                        }
                        if (var526 == 1611) {
                            class146.field2346[var3++] = var481.field3923;
                            continue;
                        }
                        if (var526 == 1612) {
                            class146.field2346[var3++] = var481.field3895;
                            continue;
                        }
                    } else if (var526 < 1800) {
                        class248 var480 = var38 ? class88.field1379 : class164.field2720;
                        if (var526 == 1700) {
                            class146.field2346[var3++] = var480.field4049;
                            continue;
                        }
                        if (var526 == 1701) {
                            if (var480.field4049 == -1) {
                                class146.field2346[var3++] = 0;
                            } else {
                                class146.field2346[var3++] = var480.field3902;
                            }
                            continue;
                        }
                        if (var526 == 1702) {
                            class146.field2346[var3++] = var480.field4019;
                            continue;
                        }
                    } else if (var526 < 1900) {
                        class248 var478 = var38 ? class88.field1379 : class164.field2720;
                        if (var526 == 1800) {
                            class146.field2346[var3++] = client.method1126(var478).method176(2);
                            continue;
                        }
                        if (var526 == 1801) {
                            var3--;
                            int var479 = class146.field2346[var3];
                            int var528 = var479 - 1;
                            if (var478.field3991 != null && var528 < var478.field3991.length && var478.field3991[var528] != null) {
                                class53.field778[var4++] = var478.field3991[var528];
                                continue;
                            }
                            class53.field778[var4++] = "";
                            continue;
                        }
                        if (var526 == 1802) {
                            if (var478.field4064 == null) {
                                class53.field778[var4++] = "";
                            } else {
                                class53.field778[var4++] = var478.field4064;
                            }
                            continue;
                        }
                    } else if (var526 < 2600) {
                        var3--;
                        class248 var50 = class281.method1913(class146.field2346[var3], (byte) -73);
                        if (var526 == 2500) {
                            class146.field2346[var3++] = var50.field4037;
                            continue;
                        }
                        if (var526 == 2501) {
                            class146.field2346[var3++] = var50.field3916;
                            continue;
                        }
                        if (var526 == 2502) {
                            class146.field2346[var3++] = var50.field4016;
                            continue;
                        }
                        if (var526 == 2503) {
                            class146.field2346[var3++] = var50.field4057;
                            continue;
                        }
                        if (var526 == 2504) {
                            class146.field2346[var3++] = var50.field4023 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 2505) {
                            class146.field2346[var3++] = var50.field3974;
                            continue;
                        }
                    } else if (var526 < 2700) {
                        var3--;
                        class248 var477 = class281.method1913(class146.field2346[var3], (byte) 82);
                        if (var526 == 2600) {
                            class146.field2346[var3++] = var477.field3944;
                            continue;
                        }
                        if (var526 == 2601) {
                            class146.field2346[var3++] = var477.field3953;
                            continue;
                        }
                        if (var526 == 2602) {
                            class53.field778[var4++] = var477.field4046;
                            continue;
                        }
                        if (var526 == 2603) {
                            class146.field2346[var3++] = var477.field3914;
                            continue;
                        }
                        if (var526 == 2604) {
                            class146.field2346[var3++] = var477.field3994;
                            continue;
                        }
                        if (var526 == 2605) {
                            class146.field2346[var3++] = var477.field4022;
                            continue;
                        }
                        if (var526 == 2606) {
                            class146.field2346[var3++] = var477.field4035;
                            continue;
                        }
                        if (var526 == 2607) {
                            class146.field2346[var3++] = var477.field4011;
                            continue;
                        }
                        if (var526 == 2608) {
                            class146.field2346[var3++] = var477.field4062;
                            continue;
                        }
                        if (var526 == 2609) {
                            class146.field2346[var3++] = var477.field3939;
                            continue;
                        }
                        if (var526 == 2610) {
                            class146.field2346[var3++] = var477.field4047;
                            continue;
                        }
                        if (var526 == 2611) {
                            class146.field2346[var3++] = var477.field3923;
                            continue;
                        }
                        if (var526 == 2612) {
                            class146.field2346[var3++] = var477.field3895;
                            continue;
                        }
                    } else if (var526 < 2800) {
                        if (var526 == 2700) {
                            var3--;
                            class248 var51 = class281.method1913(class146.field2346[var3], (byte) -103);
                            class146.field2346[var3++] = var51.field4049;
                            continue;
                        }
                        if (var526 == 2701) {
                            var3--;
                            class248 var52 = class281.method1913(class146.field2346[var3], (byte) 90);
                            if (var52.field4049 == -1) {
                                class146.field2346[var3++] = 0;
                            } else {
                                class146.field2346[var3++] = var52.field3902;
                            }
                            continue;
                        }
                        if (var526 == 2702) {
                            var3--;
                            int var53 = class146.field2346[var3];
                            class109 var54 = (class109) class74.field1192.method371(92, (long) var53);
                            if (var54 == null) {
                                class146.field2346[var3++] = 0;
                            } else {
                                class146.field2346[var3++] = 1;
                            }
                            continue;
                        }
                        if (var526 == 2703) {
                            var3--;
                            class248 var55 = class281.method1913(class146.field2346[var3], (byte) -111);
                            if (var55.field4068 == null) {
                                class146.field2346[var3++] = 0;
                                continue;
                            }
                            int var56 = var55.field4068.length;
                            for (int var57 = 0; var57 < var55.field4068.length; var57++) {
                                if (var55.field4068[var57] == null) {
                                    var56 = var57;
                                    break;
                                }
                            }
                            class146.field2346[var3++] = var56;
                            continue;
                        }
                        if (var526 == 2704 || var526 == 2705) {
                            var3 -= 2;
                            int var58 = class146.field2346[var3 + 1];
                            int var59 = class146.field2346[var3];
                            class109 var60 = (class109) class74.field1192.method371(-120, (long) var59);
                            if (var60 != null && var60.field1689 == var58) {
                                class146.field2346[var3++] = 1;
                                continue;
                            }
                            class146.field2346[var3++] = 0;
                            continue;
                        }
                    } else if (var526 < 2900) {
                        var3--;
                        class248 var61 = class281.method1913(class146.field2346[var3], (byte) 89);
                        if (var526 == 2800) {
                            class146.field2346[var3++] = client.method1126(var61).method176(2);
                            continue;
                        }
                        if (var526 == 2801) {
                            var3--;
                            int var62 = class146.field2346[var3];
                            int var527 = var62 - 1;
                            if (var61.field3991 != null && var527 < var61.field3991.length && var61.field3991[var527] != null) {
                                class53.field778[var4++] = var61.field3991[var527];
                                continue;
                            }
                            class53.field778[var4++] = "";
                            continue;
                        }
                        if (var526 == 2802) {
                            if (var61.field4064 == null) {
                                class53.field778[var4++] = "";
                            } else {
                                class53.field778[var4++] = var61.field4064;
                            }
                            continue;
                        }
                    } else if (var526 < 3200) {
                        if (var526 == 3100) {
                            var4--;
                            String var63 = class53.field778[var4];
                            class74.method536(var63, "", (byte) -118, 0);
                            continue;
                        }
                        if (var526 == 3101) {
                            var3 -= 2;
                            class36.method262(class146.field2346[var3], class217.field3408, true, class146.field2346[var3 + 1]);
                            continue;
                        }
                        if (var526 == 3103) {
                            class285.method1935(0);
                            continue;
                        }
                        if (var526 == 3104) {
                            class119.field1887++;
                            var4--;
                            String var64 = class53.field778[var4];
                            int var65 = 0;
                            if (class248.method1681(var64, (byte) 105)) {
                                var65 = class122.method841(5262, var64);
                            }
                            class311.field5027.method2081(false, 242);
                            class311.field5027.method1831(var65, 119690440);
                            continue;
                        }
                        if (var526 == 3105) {
                            class65.field1048++;
                            var4--;
                            String var66 = class53.field778[var4];
                            class311.field5027.method2081(false, 37);
                            class311.field5027.method1840((byte) 47, class162.method1114((byte) -120, var66));
                            continue;
                        }
                        if (var526 == 3106) {
                            var4--;
                            String var67 = class53.field778[var4];
                            class286.field4630++;
                            class311.field5027.method2081(false, 36);
                            class311.field5027.method1865(var67.length() + 1, 41);
                            class311.field5027.method1859((byte) 58, var67);
                            continue;
                        }
                        if (var526 == 3107) {
                            var3--;
                            int var68 = class146.field2346[var3];
                            var4--;
                            String var69 = class53.field778[var4];
                            class168.method1194(var68, var69, -1701);
                            continue;
                        }
                        if (var526 == 3108) {
                            var3 -= 3;
                            int var70 = class146.field2346[var3];
                            int var71 = class146.field2346[var3 + 1];
                            int var72 = class146.field2346[var3 + 2];
                            class248 var73 = class281.method1913(var72, (byte) -102);
                            class304.method2070(-88, var73, var70, var71);
                            continue;
                        }
                        if (var526 == 3109) {
                            var3 -= 2;
                            int var74 = class146.field2346[var3 + 1];
                            class248 var75 = var38 ? class88.field1379 : class164.field2720;
                            int var76 = class146.field2346[var3];
                            class304.method2070(-100, var75, var76, var74);
                            continue;
                        }
                        if (var526 == 3110) {
                            class80.field1294++;
                            var3--;
                            int var77 = class146.field2346[var3];
                            class311.field5027.method2081(false, 25);
                            class311.field5027.method1824(var77, 28357);
                            continue;
                        }
                    } else if (var526 < 3300) {
                        if (var526 == 3200) {
                            var3 -= 3;
                            class60.method385(class146.field2346[var3 + 1], (byte) 119, class146.field2346[var3 + 2], class146.field2346[var3], 255);
                            continue;
                        }
                        if (var526 == 3201) {
                            var3--;
                            class144.method989(255, false, class146.field2346[var3]);
                            continue;
                        }
                        if (var526 == 3202) {
                            var3 -= 2;
                            class124.method849(class146.field2346[var3 + 1], 255, (byte) -48, class146.field2346[var3]);
                            continue;
                        }
                    } else if (var526 < 3400) {
                        if (var526 == 3300) {
                            class146.field2346[var3++] = class274.field4472;
                            continue;
                        }
                        if (var526 == 3301) {
                            var3 -= 2;
                            int var78 = class146.field2346[var3];
                            int var79 = class146.field2346[var3 + 1];
                            class146.field2346[var3++] = class267.method1786(var79, var78, 256);
                            continue;
                        }
                        if (var526 == 3302) {
                            var3 -= 2;
                            int var80 = class146.field2346[var3 + 1];
                            int var81 = class146.field2346[var3];
                            class146.field2346[var3++] = class156.method1052(var81, 0, var80);
                            continue;
                        }
                        if (var526 == 3303) {
                            var3 -= 2;
                            int var82 = class146.field2346[var3];
                            int var83 = class146.field2346[var3 + 1];
                            class146.field2346[var3++] = class306.method2077(255, var83, var82);
                            continue;
                        }
                        if (var526 == 3304) {
                            var3--;
                            int var84 = class146.field2346[var3];
                            class146.field2346[var3++] = class164.method1166((byte) 103, var84).field2951;
                            continue;
                        }
                        if (var526 == 3305) {
                            var3--;
                            int var85 = class146.field2346[var3];
                            class146.field2346[var3++] = class72.field1147[var85];
                            continue;
                        }
                        if (var526 == 3306) {
                            var3--;
                            int var86 = class146.field2346[var3];
                            class146.field2346[var3++] = class89.field1382[var86];
                            continue;
                        }
                        if (var526 == 3307) {
                            var3--;
                            int var87 = class146.field2346[var3];
                            class146.field2346[var3++] = class139.field2243[var87];
                            continue;
                        }
                        if (var526 == 3308) {
                            int var88 = class214.field3389;
                            int var89 = (class217.field3408.field994 >> 7) + class75.field1211;
                            int var90 = (class217.field3408.field929 >> 7) + class145.field2327;
                            class146.field2346[var3++] = (var88 << 28) + var90 + (var89 << 14);
                            continue;
                        }
                        if (var526 == 3309) {
                            var3--;
                            int var91 = class146.field2346[var3];
                            class146.field2346[var3++] = class233.method1609(var91, 268420634) >> 14;
                            continue;
                        }
                        if (var526 == 3310) {
                            var3--;
                            int var92 = class146.field2346[var3];
                            class146.field2346[var3++] = var92 >> 28;
                            continue;
                        }
                        if (var526 == 3311) {
                            var3--;
                            int var93 = class146.field2346[var3];
                            class146.field2346[var3++] = class233.method1609(var93, 16383);
                            continue;
                        }
                        if (var526 == 3312) {
                            class146.field2346[var3++] = class213.field3383 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3313) {
                            var3 -= 2;
                            int var94 = class146.field2346[var3 + 1];
                            int var95 = class146.field2346[var3] + 32768;
                            class146.field2346[var3++] = class267.method1786(var94, var95, 256);
                            continue;
                        }
                        if (var526 == 3314) {
                            var3 -= 2;
                            int var96 = class146.field2346[var3] + 32768;
                            int var97 = class146.field2346[var3 + 1];
                            class146.field2346[var3++] = class156.method1052(var96, 0, var97);
                            continue;
                        }
                        if (var526 == 3315) {
                            var3 -= 2;
                            int var98 = class146.field2346[var3] + 32768;
                            int var99 = class146.field2346[var3 + 1];
                            class146.field2346[var3++] = class306.method2077(255, var99, var98);
                            continue;
                        }
                        if (var526 == 3316) {
                            if (class117.field1796 >= 2) {
                                class146.field2346[var3++] = class117.field1796;
                            } else {
                                class146.field2346[var3++] = 0;
                            }
                            continue;
                        }
                        if (var526 == 3317) {
                            class146.field2346[var3++] = class84.field1342;
                            continue;
                        }
                        if (var526 == 3318) {
                            class146.field2346[var3++] = class62.field916;
                            continue;
                        }
                        if (var526 == 3321) {
                            class146.field2346[var3++] = class217.field3410;
                            continue;
                        }
                        if (var526 == 3322) {
                            class146.field2346[var3++] = class64.field1039;
                            continue;
                        }
                        if (var526 == 3323) {
                            if (class27.field486 >= 5 && class27.field486 <= 9) {
                                class146.field2346[var3++] = 1;
                                continue;
                            }
                            class146.field2346[var3++] = 0;
                            continue;
                        }
                        if (var526 == 3324) {
                            if (class27.field486 >= 5 && class27.field486 <= 9) {
                                class146.field2346[var3++] = class27.field486;
                                continue;
                            }
                            class146.field2346[var3++] = 0;
                            continue;
                        }
                        if (var526 == 3325) {
                            class146.field2346[var3++] = class89.field1396 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3326) {
                            class146.field2346[var3++] = class217.field3408.field224;
                            continue;
                        }
                        if (var526 == 3327) {
                            class146.field2346[var3++] = class217.field3408.field232.field4550 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3328) {
                            class146.field2346[var3++] = class86.field1357 && !class91.field1450 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3329) {
                            class146.field2346[var3++] = class25.field457 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3330) {
                            var3--;
                            int var100 = class146.field2346[var3];
                            class146.field2346[var3++] = client.method1122(var100, 0);
                            continue;
                        }
                        if (var526 == 3331) {
                            var3 -= 2;
                            int var101 = class146.field2346[var3];
                            int var102 = class146.field2346[var3 + 1];
                            class146.field2346[var3++] = class153.method1037(var102, var101, false, -23564);
                            continue;
                        }
                        if (var526 == 3332) {
                            var3 -= 2;
                            int var103 = class146.field2346[var3 + 1];
                            int var104 = class146.field2346[var3];
                            class146.field2346[var3++] = class153.method1037(var103, var104, true, -23564);
                            continue;
                        }
                        if (var526 == 3333) {
                            class146.field2346[var3++] = class122.field1937;
                            continue;
                        }
                        if (var526 == 3335) {
                            class146.field2346[var3++] = class84.field1339;
                            continue;
                        }
                        if (var526 == 3336) {
                            var3 -= 4;
                            int var105 = class146.field2346[var3];
                            int var106 = class146.field2346[var3 + 1];
                            int var107 = (var106 << 14) + var105;
                            int var108 = class146.field2346[var3 + 2];
                            int var109 = (var108 << 28) + var107;
                            int var110 = class146.field2346[var3 + 3];
                            int var111 = var109 + var110;
                            class146.field2346[var3++] = var111;
                            continue;
                        }
                        if (var526 == 3337) {
                            class146.field2346[var3++] = class215.field3396;
                            continue;
                        }
                    } else if (var526 < 3500) {
                        if (var526 == 3400) {
                            var3 -= 2;
                            int var460 = class146.field2346[var3];
                            int var461 = class146.field2346[var3 + 1];
                            class18 var462 = class144.method987((byte) 5, var460);
                            class53.field778[var4++] = var462.method140((byte) -102, var461);
                            continue;
                        }
                        if (var526 == 3408) {
                            var3 -= 4;
                            int var463 = class146.field2346[var3];
                            int var464 = class146.field2346[var3 + 1];
                            int var465 = class146.field2346[var3 + 3];
                            int var466 = class146.field2346[var3 + 2];
                            class18 var467 = class144.method987((byte) 5, var466);
                            if (var467.field334 == var463 && var467.field330 == var464) {
                                if (var464 == 115) {
                                    class53.field778[var4++] = var467.method140((byte) -102, var465);
                                } else {
                                    class146.field2346[var3++] = var467.method148(var465, -15812);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var526 == 3409) {
                            var3 -= 3;
                            int var468 = class146.field2346[var3];
                            int var469 = class146.field2346[var3 + 1];
                            int var470 = class146.field2346[var3 + 2];
                            if (var469 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class18 var471 = class144.method987((byte) 5, var469);
                            if (var471.field330 != var468) {
                                throw new RuntimeException("C3409-1");
                            }
                            class146.field2346[var3++] = var471.method144(2, var470) ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3410) {
                            var4--;
                            String var472 = class53.field778[var4];
                            var3--;
                            int var473 = class146.field2346[var3];
                            if (var473 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class18 var474 = class144.method987((byte) 5, var473);
                            if (var474.field330 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class146.field2346[var3++] = var474.method141(var472, 117) ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3411) {
                            var3--;
                            int var475 = class146.field2346[var3];
                            class18 var476 = class144.method987((byte) 5, var475);
                            class146.field2346[var3++] = var476.field319.method375(false);
                            continue;
                        }
                    } else if (var526 < 3700) {
                        if (var526 == 3600) {
                            if (class249.field4099 == 0) {
                                class146.field2346[var3++] = -2;
                            } else if (class249.field4099 == 1) {
                                class146.field2346[var3++] = -1;
                            } else {
                                class146.field2346[var3++] = class146.field2345;
                            }
                            continue;
                        }
                        if (var526 == 3601) {
                            var3--;
                            int var112 = class146.field2346[var3];
                            if (class249.field4099 == 2 && var112 < class146.field2345) {
                                class53.field778[var4++] = class240.field3748[var112];
                                continue;
                            }
                            class53.field778[var4++] = "";
                            continue;
                        }
                        if (var526 == 3602) {
                            var3--;
                            int var113 = class146.field2346[var3];
                            if (class249.field4099 == 2 && class146.field2345 > var113) {
                                class146.field2346[var3++] = class135.field2186[var113];
                                continue;
                            }
                            class146.field2346[var3++] = 0;
                            continue;
                        }
                        if (var526 == 3603) {
                            var3--;
                            int var114 = class146.field2346[var3];
                            if (class249.field4099 == 2 && class146.field2345 > var114) {
                                class146.field2346[var3++] = class210.field3359[var114];
                                continue;
                            }
                            class146.field2346[var3++] = 0;
                            continue;
                        }
                        if (var526 == 3604) {
                            var4--;
                            String var115 = class53.field778[var4];
                            var3--;
                            int var116 = class146.field2346[var3];
                            class152.method1033(var116, 9068, var115);
                            continue;
                        }
                        if (var526 == 3605) {
                            var4--;
                            String var117 = class53.field778[var4];
                            class83.method598(0, class162.method1114((byte) -117, var117));
                            continue;
                        }
                        if (var526 == 3606) {
                            var4--;
                            String var118 = class53.field778[var4];
                            class33.method247(24, class162.method1114((byte) -116, var118));
                            continue;
                        }
                        if (var526 == 3607) {
                            var4--;
                            String var119 = class53.field778[var4];
                            class104.method739(class162.method1114((byte) -117, var119), (byte) -32, false);
                            continue;
                        }
                        if (var526 == 3608) {
                            var4--;
                            String var120 = class53.field778[var4];
                            class172.method1218(-2895, class162.method1114((byte) -120, var120));
                            continue;
                        }
                        if (var526 == 3609) {
                            var4--;
                            String var121 = class53.field778[var4];
                            if (var121.startsWith("<img=0>") || var121.startsWith("<img=1>")) {
                                var121 = var121.substring(7);
                            }
                            class146.field2346[var3++] = class119.method817(-12704, var121) ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3610) {
                            var3--;
                            int var122 = class146.field2346[var3];
                            if (class249.field4099 == 2 && var122 < class146.field2345) {
                                class53.field778[var4++] = class6.field128[var122];
                                continue;
                            }
                            class53.field778[var4++] = "";
                            continue;
                        }
                        if (var526 == 3611) {
                            if (class220.field3472 == null) {
                                class53.field778[var4++] = "";
                            } else {
                                class53.field778[var4++] = class179.method1260(class220.field3472, 0);
                            }
                            continue;
                        }
                        if (var526 == 3612) {
                            if (class220.field3472 == null) {
                                class146.field2346[var3++] = 0;
                            } else {
                                class146.field2346[var3++] = class191.field3106;
                            }
                            continue;
                        }
                        if (var526 == 3613) {
                            var3--;
                            int var123 = class146.field2346[var3];
                            if (class220.field3472 != null && class191.field3106 > var123) {
                                class53.field778[var4++] = class179.method1260(class7.field167[var123].field728, 0);
                                continue;
                            }
                            class53.field778[var4++] = "";
                            continue;
                        }
                        if (var526 == 3614) {
                            var3--;
                            int var124 = class146.field2346[var3];
                            if (class220.field3472 != null && var124 < class191.field3106) {
                                class146.field2346[var3++] = class7.field167[var124].field724;
                                continue;
                            }
                            class146.field2346[var3++] = 0;
                            continue;
                        }
                        if (var526 == 3615) {
                            var3--;
                            int var125 = class146.field2346[var3];
                            if (class220.field3472 != null && class191.field3106 > var125) {
                                class146.field2346[var3++] = class7.field167[var125].field722;
                                continue;
                            }
                            class146.field2346[var3++] = 0;
                            continue;
                        }
                        if (var526 == 3616) {
                            class146.field2346[var3++] = class150.field2399;
                            continue;
                        }
                        if (var526 == 3617) {
                            var4--;
                            String var126 = class53.field778[var4];
                            class155.method1051(var126, (byte) -45);
                            continue;
                        }
                        if (var526 == 3618) {
                            class146.field2346[var3++] = class311.field5029;
                            continue;
                        }
                        if (var526 == 3619) {
                            var4--;
                            String var127 = class53.field778[var4];
                            class71.method498((byte) -15, class162.method1114((byte) -114, var127));
                            continue;
                        }
                        if (var526 == 3620) {
                            class55.method341(-4);
                            continue;
                        }
                        if (var526 == 3621) {
                            if (class249.field4099 == 0) {
                                class146.field2346[var3++] = -1;
                            } else {
                                class146.field2346[var3++] = class34.field562;
                            }
                            continue;
                        }
                        if (var526 == 3622) {
                            var3--;
                            int var128 = class146.field2346[var3];
                            if (class249.field4099 != 0 && var128 < class34.field562) {
                                class53.field778[var4++] = class125.method857(class161.field2634[var128], (byte) -115);
                                continue;
                            }
                            class53.field778[var4++] = "";
                            continue;
                        }
                        if (var526 == 3623) {
                            var4--;
                            String var129 = class53.field778[var4];
                            if (var129.startsWith("<img=0>") || var129.startsWith("<img=1>")) {
                                var129 = var129.substring(7);
                            }
                            class146.field2346[var3++] = class148.method1006((byte) -110, var129) ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3624) {
                            var3--;
                            int var130 = class146.field2346[var3];
                            if (class7.field167 != null && var130 < class191.field3106 && class7.field167[var130].field728.equalsIgnoreCase(class217.field3408.field222)) {
                                class146.field2346[var3++] = 1;
                                continue;
                            }
                            class146.field2346[var3++] = 0;
                            continue;
                        }
                        if (var526 == 3625) {
                            if (class172.field2834 == null) {
                                class53.field778[var4++] = "";
                            } else {
                                class53.field778[var4++] = class179.method1260(class172.field2834, 0);
                            }
                            continue;
                        }
                        if (var526 == 3626) {
                            var3--;
                            int var131 = class146.field2346[var3];
                            if (class220.field3472 != null && class191.field3106 > var131) {
                                class53.field778[var4++] = class7.field167[var131].field733;
                                continue;
                            }
                            class53.field778[var4++] = "";
                            continue;
                        }
                        if (var526 == 3627) {
                            var3--;
                            int var132 = class146.field2346[var3];
                            if (class249.field4099 == 2 && var132 >= 0 && var132 < class146.field2345) {
                                class146.field2346[var3++] = class112.field1721[var132] ? 1 : 0;
                                continue;
                            }
                            class146.field2346[var3++] = 0;
                            continue;
                        }
                        if (var526 == 3628) {
                            var4--;
                            String var133 = class53.field778[var4];
                            if (var133.startsWith("<img=0>") || var133.startsWith("<img=1>")) {
                                var133 = var133.substring(7);
                            }
                            class146.field2346[var3++] = class202.method1410(25, var133);
                            continue;
                        }
                        if (var526 == 3629) {
                            class146.field2346[var3++] = class52.field767;
                            continue;
                        }
                        if (var526 == 3630) {
                            var4--;
                            String var134 = class53.field778[var4];
                            class104.method739(class162.method1114((byte) -118, var134), (byte) -32, true);
                            continue;
                        }
                        if (var526 == 3631) {
                            var3--;
                            int var135 = class146.field2346[var3];
                            class146.field2346[var3++] = class29.field526[var135] ? 1 : 0;
                            continue;
                        }
                    } else if (var526 < 4000) {
                        if (var526 == 3903) {
                            var3--;
                            int var136 = class146.field2346[var3];
                            class146.field2346[var3++] = class307.field4992[var136].method77(-102);
                            continue;
                        }
                        if (var526 == 3904) {
                            var3--;
                            int var137 = class146.field2346[var3];
                            class146.field2346[var3++] = class307.field4992[var137].field175;
                            continue;
                        }
                        if (var526 == 3905) {
                            var3--;
                            int var138 = class146.field2346[var3];
                            class146.field2346[var3++] = class307.field4992[var138].field177;
                            continue;
                        }
                        if (var526 == 3906) {
                            var3--;
                            int var139 = class146.field2346[var3];
                            class146.field2346[var3++] = class307.field4992[var139].field178;
                            continue;
                        }
                        if (var526 == 3907) {
                            var3--;
                            int var140 = class146.field2346[var3];
                            class146.field2346[var3++] = class307.field4992[var140].field186;
                            continue;
                        }
                        if (var526 == 3908) {
                            var3--;
                            int var141 = class146.field2346[var3];
                            class146.field2346[var3++] = class307.field4992[var141].field172;
                            continue;
                        }
                        if (var526 == 3910) {
                            var3--;
                            int var142 = class146.field2346[var3];
                            int var143 = class307.field4992[var142].method80(7);
                            class146.field2346[var3++] = var143 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3911) {
                            var3--;
                            int var144 = class146.field2346[var3];
                            int var145 = class307.field4992[var144].method80(7);
                            class146.field2346[var3++] = var145 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3912) {
                            var3--;
                            int var146 = class146.field2346[var3];
                            int var147 = class307.field4992[var146].method80(7);
                            class146.field2346[var3++] = var147 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3913) {
                            var3--;
                            int var148 = class146.field2346[var3];
                            int var149 = class307.field4992[var148].method80(7);
                            class146.field2346[var3++] = var149 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var526 < 4100) {
                        if (var526 == 4000) {
                            var3 -= 2;
                            int var150 = class146.field2346[var3];
                            int var151 = class146.field2346[var3 + 1];
                            class146.field2346[var3++] = var150 + var151;
                            continue;
                        }
                        if (var526 == 4001) {
                            var3 -= 2;
                            int var152 = class146.field2346[var3];
                            int var153 = class146.field2346[var3 + 1];
                            class146.field2346[var3++] = var152 - var153;
                            continue;
                        }
                        if (var526 == 4002) {
                            var3 -= 2;
                            int var154 = class146.field2346[var3 + 1];
                            int var155 = class146.field2346[var3];
                            class146.field2346[var3++] = var154 * var155;
                            continue;
                        }
                        if (var526 == 4003) {
                            var3 -= 2;
                            int var156 = class146.field2346[var3 + 1];
                            int var157 = class146.field2346[var3];
                            class146.field2346[var3++] = var157 / var156;
                            continue;
                        }
                        if (var526 == 4004) {
                            var3--;
                            int var158 = class146.field2346[var3];
                            class146.field2346[var3++] = (int) ((double) var158 * Math.random());
                            continue;
                        }
                        if (var526 == 4005) {
                            var3--;
                            int var159 = class146.field2346[var3];
                            class146.field2346[var3++] = (int) ((double) (var159 + 1) * Math.random());
                            continue;
                        }
                        if (var526 == 4006) {
                            var3 -= 5;
                            int var160 = class146.field2346[var3 + 1];
                            int var161 = class146.field2346[var3];
                            int var162 = class146.field2346[var3 + 2];
                            int var163 = class146.field2346[var3 + 3];
                            int var164 = class146.field2346[var3 + 4];
                            class146.field2346[var3++] = var161 + ((var160 - var161) * (var164 - var162) / (var163 - var162));
                            continue;
                        }
                        if (var526 == 4007) {
                            var3 -= 2;
                            long var165 = (long) class146.field2346[var3];
                            long var167 = (long) class146.field2346[var3 + 1];
                            class146.field2346[var3++] = (int) (var165 * var167 / 100L + var165);
                            continue;
                        }
                        if (var526 == 4008) {
                            var3 -= 2;
                            int var169 = class146.field2346[var3 + 1];
                            int var170 = class146.field2346[var3];
                            class146.field2346[var3++] = class76.method555(0x1 << var169, var170);
                            continue;
                        }
                        if (var526 == 4009) {
                            var3 -= 2;
                            int var171 = class146.field2346[var3];
                            int var172 = class146.field2346[var3 + 1];
                            class146.field2346[var3++] = class233.method1609(var171, -(0x1 << var172) - 1);
                            continue;
                        }
                        if (var526 == 4010) {
                            var3 -= 2;
                            int var173 = class146.field2346[var3];
                            int var174 = class146.field2346[var3 + 1];
                            class146.field2346[var3++] = class233.method1609(0x1 << var174, var173) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var526 == 4011) {
                            var3 -= 2;
                            int var175 = class146.field2346[var3];
                            int var176 = class146.field2346[var3 + 1];
                            class146.field2346[var3++] = var175 % var176;
                            continue;
                        }
                        if (var526 == 4012) {
                            var3 -= 2;
                            int var177 = class146.field2346[var3];
                            int var178 = class146.field2346[var3 + 1];
                            if (var177 == 0) {
                                class146.field2346[var3++] = 0;
                            } else {
                                class146.field2346[var3++] = (int) Math.pow((double) var177, (double) var178);
                            }
                            continue;
                        }
                        if (var526 == 4013) {
                            var3 -= 2;
                            int var179 = class146.field2346[var3];
                            int var180 = class146.field2346[var3 + 1];
                            if (var179 == 0) {
                                class146.field2346[var3++] = 0;
                            } else if (var180 == 0) {
                                class146.field2346[var3++] = Integer.MAX_VALUE;
                            } else {
                                class146.field2346[var3++] = (int) Math.pow((double) var179, 1.0D / (double) var180);
                            }
                            continue;
                        }
                        if (var526 == 4014) {
                            var3 -= 2;
                            int var181 = class146.field2346[var3 + 1];
                            int var182 = class146.field2346[var3];
                            class146.field2346[var3++] = class233.method1609(var181, var182);
                            continue;
                        }
                        if (var526 == 4015) {
                            var3 -= 2;
                            int var183 = class146.field2346[var3];
                            int var184 = class146.field2346[var3 + 1];
                            class146.field2346[var3++] = class76.method555(var183, var184);
                            continue;
                        }
                        if (var526 == 4016) {
                            var3 -= 2;
                            int var185 = class146.field2346[var3];
                            int var186 = class146.field2346[var3 + 1];
                            class146.field2346[var3++] = var186 > var185 ? var185 : var186;
                            continue;
                        }
                        if (var526 == 4017) {
                            var3 -= 2;
                            int var187 = class146.field2346[var3];
                            int var188 = class146.field2346[var3 + 1];
                            class146.field2346[var3++] = var187 <= var188 ? var188 : var187;
                            continue;
                        }
                        if (var526 == 4018) {
                            var3 -= 3;
                            long var189 = (long) class146.field2346[var3];
                            long var191 = (long) class146.field2346[var3 + 2];
                            long var193 = (long) class146.field2346[var3 + 1];
                            class146.field2346[var3++] = (int) (var189 * var191 / var193);
                            continue;
                        }
                    } else if (var526 < 4200) {
                        if (var526 == 4100) {
                            var4--;
                            String var195 = class53.field778[var4];
                            var3--;
                            int var196 = class146.field2346[var3];
                            class53.field778[var4++] = var195 + var196;
                            continue;
                        }
                        if (var526 == 4101) {
                            var4 -= 2;
                            String var197 = class53.field778[var4];
                            String var198 = class53.field778[var4 + 1];
                            class53.field778[var4++] = var197 + var198;
                            continue;
                        }
                        if (var526 == 4102) {
                            var4--;
                            String var199 = class53.field778[var4];
                            var3--;
                            int var200 = class146.field2346[var3];
                            class53.field778[var4++] = var199 + class191.method1341(117, var200, true);
                            continue;
                        }
                        if (var526 == 4103) {
                            var4--;
                            String var201 = class53.field778[var4];
                            class53.field778[var4++] = var201.toLowerCase();
                            continue;
                        }
                        if (var526 == 4104) {
                            var3--;
                            int var202 = class146.field2346[var3];
                            long var203 = (long) var202 * 86400000L + 1014768000000L;
                            class63.field1023.setTime(new Date(var203));
                            int var205 = class63.field1023.get(5);
                            int var206 = class63.field1023.get(2);
                            int var207 = class63.field1023.get(1);
                            class53.field778[var4++] = var205 + "-" + class129.field2062[var206] + "-" + var207;
                            continue;
                        }
                        if (var526 == 4105) {
                            var4 -= 2;
                            String var208 = class53.field778[var4 + 1];
                            String var209 = class53.field778[var4];
                            if (class217.field3408.field232 != null && class217.field3408.field232.field4550) {
                                class53.field778[var4++] = var208;
                                continue;
                            }
                            class53.field778[var4++] = var209;
                            continue;
                        }
                        if (var526 == 4106) {
                            var3--;
                            int var210 = class146.field2346[var3];
                            class53.field778[var4++] = Integer.toString(var210);
                            continue;
                        }
                        if (var526 == 4107) {
                            var4 -= 2;
                            class146.field2346[var3++] = class132.method897((byte) 55, class281.method1914(class84.field1339, class53.field778[var4 + 1], class53.field778[var4], 3));
                            continue;
                        }
                        if (var526 == 4108) {
                            var3 -= 2;
                            int var211 = class146.field2346[var3];
                            int var212 = class146.field2346[var3 + 1];
                            var4--;
                            String var213 = class53.field778[var4];
                            class146.field2346[var3++] = class25.method200(var212, (byte) 63).method504(var213, var211);
                            continue;
                        }
                        if (var526 == 4109) {
                            var4--;
                            String var214 = class53.field778[var4];
                            var3 -= 2;
                            int var215 = class146.field2346[var3];
                            int var216 = class146.field2346[var3 + 1];
                            class146.field2346[var3++] = class25.method200(var216, (byte) 63).method520(var214, var215);
                            continue;
                        }
                        if (var526 == 4110) {
                            var4 -= 2;
                            String var217 = class53.field778[var4 + 1];
                            String var218 = class53.field778[var4];
                            var3--;
                            if (class146.field2346[var3] == 1) {
                                class53.field778[var4++] = var218;
                            } else {
                                class53.field778[var4++] = var217;
                            }
                            continue;
                        }
                        if (var526 == 4111) {
                            var4--;
                            String var219 = class53.field778[var4];
                            class53.field778[var4++] = class73.method529(var219);
                            continue;
                        }
                        if (var526 == 4112) {
                            var4--;
                            String var220 = class53.field778[var4];
                            var3--;
                            int var221 = class146.field2346[var3];
                            if (var221 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class53.field778[var4++] = var220 + (char) var221;
                            continue;
                        }
                        if (var526 == 4113) {
                            var3--;
                            int var222 = class146.field2346[var3];
                            class146.field2346[var3++] = class298.method2044((char) var222, -29292) ? 1 : 0;
                            continue;
                        }
                        if (var526 == 4114) {
                            var3--;
                            int var223 = class146.field2346[var3];
                            class146.field2346[var3++] = class256.method1730((char) var223, -93) ? 1 : 0;
                            continue;
                        }
                        if (var526 == 4115) {
                            var3--;
                            int var224 = class146.field2346[var3];
                            class146.field2346[var3++] = class91.method638(false, (char) var224) ? 1 : 0;
                            continue;
                        }
                        if (var526 == 4116) {
                            var3--;
                            int var225 = class146.field2346[var3];
                            class146.field2346[var3++] = class188.method1329((byte) 12, (char) var225) ? 1 : 0;
                            continue;
                        }
                        if (var526 == 4117) {
                            var4--;
                            String var226 = class53.field778[var4];
                            if (var226 == null) {
                                class146.field2346[var3++] = 0;
                            } else {
                                class146.field2346[var3++] = var226.length();
                            }
                            continue;
                        }
                        if (var526 == 4118) {
                            var3 -= 2;
                            var4--;
                            String var227 = class53.field778[var4];
                            int var228 = class146.field2346[var3];
                            int var229 = class146.field2346[var3 + 1];
                            class53.field778[var4++] = var227.substring(var228, var229);
                            continue;
                        }
                        if (var526 == 4119) {
                            boolean var230 = false;
                            var4--;
                            String var231 = class53.field778[var4];
                            StringBuffer var232 = new StringBuffer(var231.length());
                            for (int var233 = 0; var231.length() > var233; var233++) {
                                char var234 = var231.charAt(var233);
                                if (var234 == '<') {
                                    var230 = true;
                                } else if (var234 == '>') {
                                    var230 = false;
                                } else if (!var230) {
                                    var232.append(var234);
                                }
                            }
                            class53.field778[var4++] = var232.toString();
                            continue;
                        }
                        if (var526 == 4120) {
                            var3 -= 2;
                            var4--;
                            String var235 = class53.field778[var4];
                            int var236 = class146.field2346[var3];
                            int var237 = class146.field2346[var3 + 1];
                            class146.field2346[var3++] = var235.indexOf(var236, var237);
                            continue;
                        }
                        if (var526 == 4121) {
                            var4 -= 2;
                            String var238 = class53.field778[var4];
                            String var239 = class53.field778[var4 + 1];
                            var3--;
                            int var240 = class146.field2346[var3];
                            class146.field2346[var3++] = var238.indexOf(var239, var240);
                            continue;
                        }
                        if (var526 == 4122) {
                            var3--;
                            int var241 = class146.field2346[var3];
                            class146.field2346[var3++] = Character.toLowerCase((char) var241);
                            continue;
                        }
                        if (var526 == 4123) {
                            var3--;
                            int var242 = class146.field2346[var3];
                            class146.field2346[var3++] = Character.toUpperCase((char) var242);
                            continue;
                        }
                        if (var526 == 4124) {
                            var3--;
                            boolean var243 = class146.field2346[var3] != 0;
                            var3--;
                            int var244 = class146.field2346[var3];
                            class53.field778[var4++] = class61.method395(class84.field1339, var243, 0, 0, (long) var244);
                            continue;
                        }
                    } else if (var526 < 4300) {
                        if (var526 == 4200) {
                            var3--;
                            int var245 = class146.field2346[var3];
                            class53.field778[var4++] = class107.method754(-20563, var245).field2532;
                            continue;
                        }
                        if (var526 == 4201) {
                            var3 -= 2;
                            int var246 = class146.field2346[var3 + 1];
                            int var247 = class146.field2346[var3];
                            class158 var248 = class107.method754(-20563, var247);
                            if (var246 >= 1 && var246 <= 5 && var248.field2531[var246 - 1] != null) {
                                class53.field778[var4++] = var248.field2531[var246 - 1];
                                continue;
                            }
                            class53.field778[var4++] = "";
                            continue;
                        }
                        if (var526 == 4202) {
                            var3 -= 2;
                            int var249 = class146.field2346[var3];
                            int var250 = class146.field2346[var3 + 1];
                            class158 var251 = class107.method754(-20563, var249);
                            if (var250 >= 1 && var250 <= 5 && var251.field2565[var250 - 1] != null) {
                                class53.field778[var4++] = var251.field2565[var250 - 1];
                                continue;
                            }
                            class53.field778[var4++] = "";
                            continue;
                        }
                        if (var526 == 4203) {
                            var3--;
                            int var252 = class146.field2346[var3];
                            class146.field2346[var3++] = class107.method754(-20563, var252).field2526;
                            continue;
                        }
                        if (var526 == 4204) {
                            var3--;
                            int var253 = class146.field2346[var3];
                            class146.field2346[var3++] = class107.method754(-20563, var253).field2539 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 4205) {
                            var3--;
                            int var254 = class146.field2346[var3];
                            class158 var255 = class107.method754(-20563, var254);
                            if (var255.field2525 == -1 && var255.field2562 >= 0) {
                                class146.field2346[var3++] = var255.field2562;
                                continue;
                            }
                            class146.field2346[var3++] = var254;
                            continue;
                        }
                        if (var526 == 4206) {
                            var3--;
                            int var256 = class146.field2346[var3];
                            class158 var257 = class107.method754(-20563, var256);
                            if (var257.field2525 >= 0 && var257.field2562 >= 0) {
                                class146.field2346[var3++] = var257.field2562;
                                continue;
                            }
                            class146.field2346[var3++] = var256;
                            continue;
                        }
                        if (var526 == 4207) {
                            var3--;
                            int var258 = class146.field2346[var3];
                            class146.field2346[var3++] = class107.method754(-20563, var258).field2576 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 4208) {
                            var3 -= 2;
                            int var259 = class146.field2346[var3];
                            int var260 = class146.field2346[var3 + 1];
                            class11 var261 = class177.method1251(var260, (byte) -102);
                            if (var261.method87((byte) 119)) {
                                class53.field778[var4++] = class107.method754(-20563, var259).method1080(var261.field206, var260, true);
                            } else {
                                class146.field2346[var3++] = class107.method754(-20563, var259).method1073(var260, var261.field204, -52);
                            }
                            continue;
                        }
                        if (var526 == 4210) {
                            var3--;
                            int var262 = class146.field2346[var3];
                            var4--;
                            String var263 = class53.field778[var4];
                            class134.method921(2, var263, var262 == 1);
                            class146.field2346[var3++] = class46.field674;
                            continue;
                        }
                        if (var526 == 4211) {
                            if (class101.field1594 != null && class53.field773 < class46.field674) {
                                class146.field2346[var3++] = class233.method1609(class101.field1594[class53.field773++], 65535);
                                continue;
                            }
                            class146.field2346[var3++] = -1;
                            continue;
                        }
                        if (var526 == 4212) {
                            class53.field773 = 0;
                            continue;
                        }
                    } else if (var526 < 4400) {
                        if (var526 == 4300) {
                            var3 -= 2;
                            int var264 = class146.field2346[var3];
                            int var265 = class146.field2346[var3 + 1];
                            class11 var266 = class177.method1251(var265, (byte) -99);
                            if (var266.method87((byte) 118)) {
                                class53.field778[var4++] = class206.method1422(var264, (byte) 70).method1648(var266.field206, var265, false);
                            } else {
                                class146.field2346[var3++] = class206.method1422(var264, (byte) 63).method1641(var265, var266.field204, -2686);
                            }
                            continue;
                        }
                    } else if (var526 >= 4500) {
                        if (var526 < 4600) {
                            if (var526 == 4500) {
                                var3 -= 2;
                                int var267 = class146.field2346[var3 + 1];
                                int var268 = class146.field2346[var3];
                                class11 var269 = class177.method1251(var267, (byte) -78);
                                if (var269.method87((byte) -57)) {
                                    class53.field778[var4++] = class193.method1351(var268, 1).method168(var269.field206, var267, 206);
                                } else {
                                    class146.field2346[var3++] = class193.method1351(var268, 1).method172(var269.field204, -127, var267);
                                }
                                continue;
                            }
                        } else if (var526 < 5100) {
                            if (var526 == 5000) {
                                class146.field2346[var3++] = class203.field3287;
                                continue;
                            }
                            if (var526 == 5001) {
                                class79.field1267++;
                                var3 -= 3;
                                class203.field3287 = class146.field2346[var3];
                                class153.field2458 = class146.field2346[var3 + 1];
                                class280.field4560 = class146.field2346[var3 + 2];
                                class311.field5027.method2081(false, 8);
                                class311.field5027.method1865(class203.field3287, 40);
                                class311.field5027.method1865(class153.field2458, 120);
                                class311.field5027.method1865(class280.field4560, -105);
                                continue;
                            }
                            if (var526 == 5002) {
                                var4--;
                                String var270 = class53.field778[var4];
                                var3 -= 2;
                                class265.field4314++;
                                int var271 = class146.field2346[var3];
                                int var272 = class146.field2346[var3 + 1];
                                class311.field5027.method2081(false, 57);
                                class311.field5027.method1840((byte) 47, class162.method1114((byte) -128, var270));
                                class311.field5027.method1865(var271 - 1, -99);
                                class311.field5027.method1865(var272, 60);
                                continue;
                            }
                            if (var526 == 5003) {
                                var3--;
                                int var273 = class146.field2346[var3];
                                String var274 = null;
                                if (var273 < 100) {
                                    var274 = class232.field3627[var273];
                                }
                                if (var274 == null) {
                                    var274 = "";
                                }
                                class53.field778[var4++] = var274;
                                continue;
                            }
                            if (var526 == 5004) {
                                var3--;
                                int var275 = class146.field2346[var3];
                                int var276 = -1;
                                if (var275 < 100 && class232.field3627[var275] != null) {
                                    var276 = class232.field3633[var275];
                                }
                                class146.field2346[var3++] = var276;
                                continue;
                            }
                            if (var526 == 5005) {
                                class146.field2346[var3++] = class153.field2458;
                                continue;
                            }
                            if (var526 == 5008) {
                                var4--;
                                String var277 = class53.field778[var4];
                                if (var277.startsWith("::")) {
                                    class309.method2097(var277, 4643);
                                    continue;
                                }
                                if (class117.field1796 == 0 && (class86.field1357 && !class91.field1450 || class25.field457)) {
                                    continue;
                                }
                                class123.field1944++;
                                String var278 = var277.toLowerCase();
                                byte var279 = 0;
                                byte var280 = 0;
                                if (var278.startsWith(class236.field3692)) {
                                    var277 = var277.substring(class236.field3692.length());
                                    var279 = 0;
                                } else if (var278.startsWith(class13.field275)) {
                                    var279 = 1;
                                    var277 = var277.substring(class13.field275.length());
                                } else if (var278.startsWith(class145.field2332)) {
                                    var279 = 2;
                                    var277 = var277.substring(class145.field2332.length());
                                } else if (var278.startsWith(class153.field2453)) {
                                    var279 = 3;
                                    var277 = var277.substring(class153.field2453.length());
                                } else if (var278.startsWith(class208.field3319)) {
                                    var277 = var277.substring(class208.field3319.length());
                                    var279 = 4;
                                } else if (var278.startsWith(class290.field4754)) {
                                    var277 = var277.substring(class290.field4754.length());
                                    var279 = 5;
                                } else if (var278.startsWith(class249.field4075)) {
                                    var279 = 6;
                                    var277 = var277.substring(class249.field4075.length());
                                } else if (var278.startsWith(class74.field1183)) {
                                    var277 = var277.substring(class74.field1183.length());
                                    var279 = 7;
                                } else if (var278.startsWith(class150.field2426)) {
                                    var277 = var277.substring(class150.field2426.length());
                                    var279 = 8;
                                } else if (var278.startsWith(class138.field2220)) {
                                    var277 = var277.substring(class138.field2220.length());
                                    var279 = 9;
                                } else if (var278.startsWith(class157.field2512)) {
                                    var279 = 10;
                                    var277 = var277.substring(class157.field2512.length());
                                } else if (var278.startsWith(class31.field528)) {
                                    var277 = var277.substring(class31.field528.length());
                                    var279 = 11;
                                } else if (class84.field1339 != 0) {
                                    if (var278.startsWith(class183.field3034)) {
                                        var279 = 0;
                                        var277 = var277.substring(class183.field3034.length());
                                    } else if (var278.startsWith(class192.field3140)) {
                                        var277 = var277.substring(class192.field3140.length());
                                        var279 = 1;
                                    } else if (var278.startsWith(class120.field1906)) {
                                        var279 = 2;
                                        var277 = var277.substring(class120.field1906.length());
                                    } else if (var278.startsWith(class302.field4942)) {
                                        var277 = var277.substring(class302.field4942.length());
                                        var279 = 3;
                                    } else if (var278.startsWith(class99.field1564)) {
                                        var277 = var277.substring(class99.field1564.length());
                                        var279 = 4;
                                    } else if (var278.startsWith(class120.field1903)) {
                                        var277 = var277.substring(class120.field1903.length());
                                        var279 = 5;
                                    } else if (var278.startsWith(class87.field1363)) {
                                        var277 = var277.substring(class87.field1363.length());
                                        var279 = 6;
                                    } else if (var278.startsWith(class43.field647)) {
                                        var279 = 7;
                                        var277 = var277.substring(class43.field647.length());
                                    } else if (var278.startsWith(class174.field2914)) {
                                        var279 = 8;
                                        var277 = var277.substring(class174.field2914.length());
                                    } else if (var278.startsWith(class24.field446)) {
                                        var277 = var277.substring(class24.field446.length());
                                        var279 = 9;
                                    } else if (var278.startsWith(class205.field3300)) {
                                        var277 = var277.substring(class205.field3300.length());
                                        var279 = 10;
                                    } else if (var278.startsWith(class25.field458)) {
                                        var279 = 11;
                                        var277 = var277.substring(class25.field458.length());
                                    }
                                }
                                String var281 = var277.toLowerCase();
                                if (var281.startsWith(class273.field4407)) {
                                    var277 = var277.substring(class273.field4407.length());
                                    var280 = 1;
                                } else if (var281.startsWith(class170.field2794)) {
                                    var277 = var277.substring(class170.field2794.length());
                                    var280 = 2;
                                } else if (var281.startsWith(class296.field4842)) {
                                    var280 = 3;
                                    var277 = var277.substring(class296.field4842.length());
                                } else if (var281.startsWith(class266.field4320)) {
                                    var280 = 4;
                                    var277 = var277.substring(class266.field4320.length());
                                } else if (var281.startsWith(class294.field4799)) {
                                    var280 = 5;
                                    var277 = var277.substring(class294.field4799.length());
                                } else if (class84.field1339 != 0) {
                                    if (var281.startsWith(class229.field3594)) {
                                        var277 = var277.substring(class229.field3594.length());
                                        var280 = 1;
                                    } else if (var281.startsWith(class238.field3734)) {
                                        var277 = var277.substring(class238.field3734.length());
                                        var280 = 2;
                                    } else if (var281.startsWith(class90.field1404)) {
                                        var280 = 3;
                                        var277 = var277.substring(class90.field1404.length());
                                    } else if (var281.startsWith(class310.field5020)) {
                                        var277 = var277.substring(class310.field5020.length());
                                        var280 = 4;
                                    } else if (var281.startsWith(class148.field2369)) {
                                        var280 = 5;
                                        var277 = var277.substring(class148.field2369.length());
                                    }
                                }
                                class311.field5027.method2081(false, 104);
                                class311.field5027.method1865(0, -120);
                                int var282 = class311.field5027.field4458;
                                class311.field5027.method1865(var279, -96);
                                class311.field5027.method1865(var280, -124);
                                class18.method137(var277, (byte) 111, class311.field5027);
                                class311.field5027.method1843(14058, class311.field5027.field4458 - var282);
                                continue;
                            }
                            if (var526 == 5009) {
                                var4 -= 2;
                                String var283 = class53.field778[var4];
                                String var284 = class53.field778[var4 + 1];
                                if (class117.field1796 != 0 || (!class86.field1357 || class91.field1450) && !class25.field457) {
                                    class51.field738++;
                                    class311.field5027.method2081(false, 252);
                                    class311.field5027.method1865(0, -119);
                                    int var285 = class311.field5027.field4458;
                                    class311.field5027.method1840((byte) 47, class162.method1114((byte) -120, var283));
                                    class18.method137(var284, (byte) 83, class311.field5027);
                                    class311.field5027.method1843(14058, class311.field5027.field4458 - var285);
                                }
                                continue;
                            }
                            if (var526 == 5010) {
                                var3--;
                                int var286 = class146.field2346[var3];
                                String var287 = null;
                                if (var286 < 100) {
                                    var287 = class12.field240[var286];
                                }
                                if (var287 == null) {
                                    var287 = "";
                                }
                                class53.field778[var4++] = var287;
                                continue;
                            }
                            if (var526 == 5011) {
                                var3--;
                                int var288 = class146.field2346[var3];
                                String var289 = null;
                                if (var288 < 100) {
                                    var289 = class186.field3065[var288];
                                }
                                if (var289 == null) {
                                    var289 = "";
                                }
                                class53.field778[var4++] = var289;
                                continue;
                            }
                            if (var526 == 5012) {
                                var3--;
                                int var290 = class146.field2346[var3];
                                int var291 = -1;
                                if (var290 < 100) {
                                    var291 = class310.field5018[var290];
                                }
                                class146.field2346[var3++] = var291;
                                continue;
                            }
                            if (var526 == 5015) {
                                String var292;
                                if (class217.field3408 == null || class217.field3408.field222 == null) {
                                    var292 = class211.field3368;
                                } else {
                                    var292 = class217.field3408.method105(-773);
                                }
                                class53.field778[var4++] = var292;
                                continue;
                            }
                            if (var526 == 5016) {
                                class146.field2346[var3++] = class280.field4560;
                                continue;
                            }
                            if (var526 == 5017) {
                                class146.field2346[var3++] = class240.field3747;
                                continue;
                            }
                            if (var526 == 5050) {
                                var3--;
                                int var293 = class146.field2346[var3];
                                class53.field778[var4++] = class165.method1177(0, var293).field3036;
                                continue;
                            }
                            if (var526 == 5051) {
                                var3--;
                                int var294 = class146.field2346[var3];
                                class183 var295 = class165.method1177(0, var294);
                                if (var295.field3038 == null) {
                                    class146.field2346[var3++] = 0;
                                } else {
                                    class146.field2346[var3++] = var295.field3038.length;
                                }
                                continue;
                            }
                            if (var526 == 5052) {
                                var3 -= 2;
                                int var296 = class146.field2346[var3];
                                int var297 = class146.field2346[var3 + 1];
                                class183 var298 = class165.method1177(0, var296);
                                int var299 = var298.field3038[var297];
                                class146.field2346[var3++] = var299;
                                continue;
                            }
                            if (var526 == 5053) {
                                var3--;
                                int var300 = class146.field2346[var3];
                                class183 var301 = class165.method1177(0, var300);
                                if (var301.field3044 == null) {
                                    class146.field2346[var3++] = 0;
                                } else {
                                    class146.field2346[var3++] = var301.field3044.length;
                                }
                                continue;
                            }
                            if (var526 == 5054) {
                                var3 -= 2;
                                int var302 = class146.field2346[var3];
                                int var303 = class146.field2346[var3 + 1];
                                class146.field2346[var3++] = class165.method1177(0, var302).field3044[var303];
                                continue;
                            }
                            if (var526 == 5055) {
                                var3--;
                                int var304 = class146.field2346[var3];
                                class53.field778[var4++] = class297.method2037(var304, -15736).method1740(0);
                                continue;
                            }
                            if (var526 == 5056) {
                                var3--;
                                int var305 = class146.field2346[var3];
                                class259 var306 = class297.method2037(var305, -15736);
                                if (var306.field4256 == null) {
                                    class146.field2346[var3++] = 0;
                                } else {
                                    class146.field2346[var3++] = var306.field4256.length;
                                }
                                continue;
                            }
                            if (var526 == 5057) {
                                var3 -= 2;
                                int var307 = class146.field2346[var3];
                                int var308 = class146.field2346[var3 + 1];
                                class146.field2346[var3++] = class297.method2037(var307, -15736).field4256[var308];
                                continue;
                            }
                            if (var526 == 5058) {
                                class286.field4638 = new class148();
                                var3--;
                                class286.field4638.field2361 = class146.field2346[var3];
                                class286.field4638.field2362 = class297.method2037(class286.field4638.field2361, -15736);
                                class286.field4638.field2364 = new int[class286.field4638.field2362.method1748((byte) 7)];
                                continue;
                            }
                            if (var526 == 5059) {
                                class164.field2686++;
                                class311.field5027.method2081(false, 106);
                                class311.field5027.method1865(0, -103);
                                int var309 = class311.field5027.field4458;
                                class311.field5027.method1865(0, -118);
                                class311.field5027.method1824(class286.field4638.field2361, 28357);
                                class286.field4638.field2362.method1744(class311.field5027, (byte) -24, class286.field4638.field2364);
                                class311.field5027.method1843(14058, class311.field5027.field4458 - var309);
                                continue;
                            }
                            if (var526 == 5060) {
                                var4--;
                                String var310 = class53.field778[var4];
                                class58.field844++;
                                class311.field5027.method2081(false, 147);
                                class311.field5027.method1865(0, 102);
                                int var311 = class311.field5027.field4458;
                                class311.field5027.method1840((byte) 47, class162.method1114((byte) -127, var310));
                                class311.field5027.method1824(class286.field4638.field2361, 28357);
                                class286.field4638.field2362.method1744(class311.field5027, (byte) -24, class286.field4638.field2364);
                                class311.field5027.method1843(14058, class311.field5027.field4458 - var311);
                                continue;
                            }
                            if (var526 == 5061) {
                                class311.field5027.method2081(false, 106);
                                class164.field2686++;
                                class311.field5027.method1865(0, -113);
                                int var312 = class311.field5027.field4458;
                                class311.field5027.method1865(1, -121);
                                class311.field5027.method1824(class286.field4638.field2361, 28357);
                                class286.field4638.field2362.method1744(class311.field5027, (byte) -24, class286.field4638.field2364);
                                class311.field5027.method1843(14058, class311.field5027.field4458 - var312);
                                continue;
                            }
                            if (var526 == 5062) {
                                var3 -= 2;
                                int var313 = class146.field2346[var3];
                                int var314 = class146.field2346[var3 + 1];
                                class146.field2346[var3++] = class165.method1177(0, var313).field3039[var314];
                                continue;
                            }
                            if (var526 == 5063) {
                                var3 -= 2;
                                int var315 = class146.field2346[var3];
                                int var316 = class146.field2346[var3 + 1];
                                class146.field2346[var3++] = class165.method1177(0, var315).field3032[var316];
                                continue;
                            }
                            if (var526 == 5064) {
                                var3 -= 2;
                                int var317 = class146.field2346[var3 + 1];
                                int var318 = class146.field2346[var3];
                                if (var317 == -1) {
                                    class146.field2346[var3++] = -1;
                                } else {
                                    class146.field2346[var3++] = class165.method1177(0, var318).method1292(-1, (char) var317);
                                }
                                continue;
                            }
                            if (var526 == 5065) {
                                var3 -= 2;
                                int var319 = class146.field2346[var3];
                                int var320 = class146.field2346[var3 + 1];
                                if (var320 == -1) {
                                    class146.field2346[var3++] = -1;
                                } else {
                                    class146.field2346[var3++] = class165.method1177(0, var319).method1297((char) var320, false);
                                }
                                continue;
                            }
                            if (var526 == 5066) {
                                var3--;
                                int var321 = class146.field2346[var3];
                                class146.field2346[var3++] = class297.method2037(var321, -15736).method1748((byte) 26);
                                continue;
                            }
                            if (var526 == 5067) {
                                var3 -= 2;
                                int var322 = class146.field2346[var3];
                                int var323 = class146.field2346[var3 + 1];
                                int var324 = class297.method2037(var322, -15736).method1739(var323, false);
                                class146.field2346[var3++] = var324;
                                continue;
                            }
                            if (var526 == 5068) {
                                var3 -= 2;
                                int var325 = class146.field2346[var3];
                                int var326 = class146.field2346[var3 + 1];
                                class286.field4638.field2364[var325] = var326;
                                continue;
                            }
                            if (var526 == 5069) {
                                var3 -= 2;
                                int var327 = class146.field2346[var3];
                                int var328 = class146.field2346[var3 + 1];
                                class286.field4638.field2364[var327] = var328;
                                continue;
                            }
                            if (var526 == 5070) {
                                var3 -= 3;
                                int var329 = class146.field2346[var3 + 1];
                                int var330 = class146.field2346[var3 + 2];
                                int var331 = class146.field2346[var3];
                                class259 var332 = class297.method2037(var331, -15736);
                                if (var332.method1739(var329, false) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class146.field2346[var3++] = var332.method1741(var330, var329, (byte) -53);
                                continue;
                            }
                            if (var526 == 5071) {
                                var4--;
                                String var333 = class53.field778[var4];
                                var3--;
                                boolean var334 = class146.field2346[var3] == 1;
                                class248.method1678(var333, -4, var334);
                                class146.field2346[var3++] = class46.field674;
                                continue;
                            }
                            if (var526 == 5072) {
                                if (class101.field1594 != null && class46.field674 > class53.field773) {
                                    class146.field2346[var3++] = class233.method1609(class101.field1594[class53.field773++], 65535);
                                    continue;
                                }
                                class146.field2346[var3++] = -1;
                                continue;
                            }
                            if (var526 == 5073) {
                                class53.field773 = 0;
                                continue;
                            }
                        } else if (var526 < 5200) {
                            if (var526 == 5100) {
                                if (class8.field170[86]) {
                                    class146.field2346[var3++] = 1;
                                } else {
                                    class146.field2346[var3++] = 0;
                                }
                                continue;
                            }
                            if (var526 == 5101) {
                                if (class8.field170[82]) {
                                    class146.field2346[var3++] = 1;
                                } else {
                                    class146.field2346[var3++] = 0;
                                }
                                continue;
                            }
                            if (var526 == 5102) {
                                if (class8.field170[81]) {
                                    class146.field2346[var3++] = 1;
                                } else {
                                    class146.field2346[var3++] = 0;
                                }
                                continue;
                            }
                        } else if (var526 < 5300) {
                            if (var526 == 5200) {
                                var3--;
                                class144.method988(class146.field2346[var3], (byte) 106);
                                continue;
                            }
                            if (var526 == 5201) {
                                class146.field2346[var3++] = class206.method1425((byte) -100);
                                continue;
                            }
                            if (var526 == 5205) {
                                var3--;
                                class82.method587(-11774, -1, false, -1, class146.field2346[var3]);
                                continue;
                            }
                            if (var526 == 5206) {
                                var3--;
                                int var335 = class146.field2346[var3];
                                class166 var336 = class262.method1764(var335 >> 14 & 0x3FFF, var335 & 0x3FFF);
                                if (var336 == null) {
                                    class146.field2346[var3++] = -1;
                                } else {
                                    class146.field2346[var3++] = var336.field2735;
                                }
                                continue;
                            }
                            if (var526 == 5207) {
                                var3--;
                                class166 var337 = class262.method1765(class146.field2346[var3]);
                                if (var337 != null && var337.field2744 != null) {
                                    class53.field778[var4++] = var337.field2744;
                                    continue;
                                }
                                class53.field778[var4++] = "";
                                continue;
                            }
                            if (var526 == 5208) {
                                class146.field2346[var3++] = class210.field3358;
                                class146.field2346[var3++] = client.field2676;
                                continue;
                            }
                            if (var526 == 5209) {
                                class146.field2346[var3++] = class262.field4275 + class249.field4095;
                                class146.field2346[var3++] = class262.field4278 - (class45.field667 - class262.field4276) - 1;
                                continue;
                            }
                            if (var526 == 5210) {
                                var3--;
                                int var338 = class146.field2346[var3];
                                class166 var339 = class262.method1765(var338);
                                if (var339 == null) {
                                    class146.field2346[var3++] = 0;
                                    class146.field2346[var3++] = 0;
                                } else {
                                    class146.field2346[var3++] = class233.method1609(var339.field2751 >> 14, 16383);
                                    class146.field2346[var3++] = class233.method1609(16383, var339.field2751);
                                }
                                continue;
                            }
                            if (var526 == 5211) {
                                var3--;
                                int var340 = class146.field2346[var3];
                                class166 var341 = class262.method1765(var340);
                                if (var341 == null) {
                                    class146.field2346[var3++] = 0;
                                    class146.field2346[var3++] = 0;
                                } else {
                                    class146.field2346[var3++] = var341.field2741 - var341.field2754;
                                    class146.field2346[var3++] = var341.field2745 - var341.field2748;
                                }
                                continue;
                            }
                            if (var526 == 5212) {
                                class119 var342 = class49.method317((byte) -79);
                                if (var342 == null) {
                                    class146.field2346[var3++] = -1;
                                    class146.field2346[var3++] = -1;
                                } else {
                                    class146.field2346[var3++] = var342.field1877;
                                    int var343 = class262.field4275 + var342.field1883 << 14 | var342.field1882 << 28 | class262.field4278 + class262.field4276 - var342.field1886 - 1;
                                    class146.field2346[var3++] = var343;
                                }
                                continue;
                            }
                            if (var526 == 5213) {
                                class119 var344 = class146.method998(-1);
                                if (var344 == null) {
                                    class146.field2346[var3++] = -1;
                                    class146.field2346[var3++] = -1;
                                } else {
                                    class146.field2346[var3++] = var344.field1877;
                                    int var345 = class262.field4275 + var344.field1883 << 14 | var344.field1882 << 28 | class262.field4278 + class262.field4276 - var344.field1886 - 1;
                                    class146.field2346[var3++] = var345;
                                }
                                continue;
                            }
                            if (var526 == 5214) {
                                var3--;
                                int var346 = class146.field2346[var3];
                                class166 var347 = class28.method228(false);
                                if (var347 != null) {
                                    boolean var348 = var347.method1186(var346 & 0x3FFF, var346 >> 28 & 0x3, 2048, class174.field2915, var346 >> 14 & 0x3FFF);
                                    if (var348) {
                                        class155.method1047(class174.field2915[2], class174.field2915[1], true);
                                    }
                                }
                                continue;
                            }
                            if (var526 == 5215) {
                                var3 -= 2;
                                int var349 = class146.field2346[var3 + 1];
                                boolean var350 = false;
                                int var351 = class146.field2346[var3];
                                class61 var352 = class262.method1768((var351 & 0xFFFCD5B) >> 14, var351 & 0x3FFF);
                                for (class166 var353 = (class166) var352.method391((byte) -123); var353 != null; var353 = (class166) var352.method394((byte) 65)) {
                                    if (var353.field2735 == var349) {
                                        var350 = true;
                                        break;
                                    }
                                }
                                if (var350) {
                                    class146.field2346[var3++] = 1;
                                } else {
                                    class146.field2346[var3++] = 0;
                                }
                                continue;
                            }
                            if (var526 == 5218) {
                                var3--;
                                int var354 = class146.field2346[var3];
                                class166 var355 = class262.method1765(var354);
                                if (var355 == null) {
                                    class146.field2346[var3++] = -1;
                                } else {
                                    class146.field2346[var3++] = var355.field2755;
                                }
                                continue;
                            }
                            if (var526 == 5220) {
                                class146.field2346[var3++] = field1462 == 100 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 5221) {
                                var3--;
                                int var356 = class146.field2346[var3];
                                class155.method1047(var356 & 0x3FFF, (var356 & 0xFFFED1B) >> 14, true);
                                continue;
                            }
                            if (var526 == 5222) {
                                class166 var357 = class28.method228(false);
                                if (var357 == null) {
                                    class146.field2346[var3++] = -1;
                                    class146.field2346[var3++] = -1;
                                } else {
                                    boolean var358 = var357.method1179(class262.field4278 - class45.field667 - (-class262.field4276 + 1), (byte) 125, class262.field4275 + class249.field4095, class174.field2915);
                                    if (var358) {
                                        class146.field2346[var3++] = class174.field2915[1];
                                        class146.field2346[var3++] = class174.field2915[2];
                                    } else {
                                        class146.field2346[var3++] = -1;
                                        class146.field2346[var3++] = -1;
                                    }
                                }
                                continue;
                            }
                            if (var526 == 5223) {
                                var3 -= 2;
                                int var359 = class146.field2346[var3];
                                int var360 = class146.field2346[var3 + 1];
                                class82.method587(-11774, var360 & 0x3FFF, false, (var360 & 0xFFFF55A) >> 14, var359);
                                continue;
                            }
                            if (var526 == 5224) {
                                var3--;
                                int var361 = class146.field2346[var3];
                                class166 var362 = class28.method228(false);
                                if (var362 == null) {
                                    class146.field2346[var3++] = -1;
                                    class146.field2346[var3++] = -1;
                                } else {
                                    boolean var363 = var362.method1186(var361 & 0x3FFF, var361 >> 28 & 0x3, 2048, class174.field2915, var361 >> 14 & 0x3FFF);
                                    if (var363) {
                                        class146.field2346[var3++] = class174.field2915[1];
                                        class146.field2346[var3++] = class174.field2915[2];
                                    } else {
                                        class146.field2346[var3++] = -1;
                                        class146.field2346[var3++] = -1;
                                    }
                                }
                                continue;
                            }
                            if (var526 == 5225) {
                                var3--;
                                int var364 = class146.field2346[var3];
                                class166 var365 = class28.method228(false);
                                if (var365 == null) {
                                    class146.field2346[var3++] = -1;
                                    class146.field2346[var3++] = -1;
                                } else {
                                    boolean var366 = var365.method1179(var364 & 0x3FFF, (byte) 117, (var364 & 0xFFFF9E2) >> 14, class174.field2915);
                                    if (var366) {
                                        class146.field2346[var3++] = class174.field2915[1];
                                        class146.field2346[var3++] = class174.field2915[2];
                                    } else {
                                        class146.field2346[var3++] = -1;
                                        class146.field2346[var3++] = -1;
                                    }
                                }
                                continue;
                            }
                            if (var526 == 5226) {
                                var3--;
                                class170.method1207((byte) -84, class146.field2346[var3]);
                                continue;
                            }
                            if (var526 == 5227) {
                                var3 -= 2;
                                int var367 = class146.field2346[var3 + 1];
                                int var368 = class146.field2346[var3];
                                class82.method587(-11774, var367 & 0x3FFF, true, var367 >> 14 & 0x3FFF, var368);
                                continue;
                            }
                            if (var526 == 5228) {
                                var3--;
                                class219.field3443 = class146.field2346[var3] == 1;
                                continue;
                            }
                            if (var526 == 5229) {
                                class146.field2346[var3++] = class219.field3443 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 5230) {
                                var3--;
                                int var369 = class146.field2346[var3];
                                class286.method1947(var369, -97);
                                continue;
                            }
                            if (var526 == 5231) {
                                var3 -= 2;
                                int var370 = class146.field2346[var3];
                                boolean var371 = class146.field2346[var3 + 1] == 1;
                                if (class226.field3546 == null) {
                                    continue;
                                }
                                class137 var372 = class226.field3546.method371(29, (long) var370);
                                if (var372 != null && !var371) {
                                    var372.method952((byte) 65);
                                    continue;
                                }
                                if (var372 == null && var371) {
                                    class137 var373 = new class137();
                                    class226.field3546.method368((long) var370, var373, -93);
                                }
                                continue;
                            }
                            if (var526 == 5232) {
                                var3--;
                                int var374 = class146.field2346[var3];
                                if (class226.field3546 == null) {
                                    class146.field2346[var3++] = 0;
                                } else {
                                    class137 var375 = class226.field3546.method371(60, (long) var374);
                                    class146.field2346[var3++] = var375 == null ? 0 : 1;
                                }
                                continue;
                            }
                            if (var526 == 5233) {
                                var3 -= 2;
                                int var376 = class146.field2346[var3];
                                boolean var377 = class146.field2346[var3 + 1] == 1;
                                if (class60.field867 == null) {
                                    continue;
                                }
                                class137 var378 = class60.field867.method371(73, (long) var376);
                                if (var378 != null && !var377) {
                                    var378.method952((byte) 91);
                                    continue;
                                }
                                if (var378 == null && var377) {
                                    class137 var379 = new class137();
                                    class60.field867.method368((long) var376, var379, -121);
                                }
                                continue;
                            }
                            if (var526 == 5234) {
                                var3--;
                                int var380 = class146.field2346[var3];
                                if (class60.field867 == null) {
                                    class146.field2346[var3++] = 0;
                                } else {
                                    class137 var381 = class60.field867.method371(27, (long) var380);
                                    class146.field2346[var3++] = var381 == null ? 0 : 1;
                                }
                                continue;
                            }
                            if (var526 == 5235) {
                                class146.field2346[var3++] = class262.field4273 == null ? -1 : class262.field4273.field2735;
                                continue;
                            }
                        } else if (var526 < 5400) {
                            if (var526 == 5300) {
                                var3 -= 2;
                                class146.field2346[var3++] = 0;
                                continue;
                            }
                            if (var526 == 5301) {
                                continue;
                            }
                            if (var526 == 5302) {
                                class146.field2346[var3++] = 0;
                                continue;
                            }
                            if (var526 == 5303) {
                                var3--;
                                class146.field2346[var3++] = 0;
                                class146.field2346[var3++] = 0;
                                continue;
                            }
                            if (var526 == 5305) {
                                byte var454 = -1;
                                class146.field2346[var3++] = var454;
                                continue;
                            }
                            if (var526 == 5306) {
                                class146.field2346[var3++] = class28.method215(15174);
                                continue;
                            }
                            if (var526 == 5307) {
                                var3--;
                                int var455 = class146.field2346[var3];
                                if (var455 < 0 || var455 > 2) {
                                    var455 = 0;
                                }
                                class254.method1722(-1, false, -1, (byte) -80, var455);
                                continue;
                            }
                            if (var526 == 5308) {
                                class146.field2346[var3++] = class147.field2352;
                                continue;
                            }
                            if (var526 == 5309) {
                                var3--;
                                int var456 = class146.field2346[var3];
                                if (var456 < 0 || var456 > 2) {
                                    var456 = 0;
                                }
                                class147.field2352 = var456;
                                class302.method2065(class44.field659, (byte) 93);
                                continue;
                            }
                        } else if (var526 < 5500) {
                            if (var526 == 5400) {
                                class219.field3441++;
                                var4 -= 2;
                                String var432 = class53.field778[var4 + 1];
                                String var433 = class53.field778[var4];
                                var3--;
                                int var434 = class146.field2346[var3];
                                class311.field5027.method2081(false, 39);
                                class311.field5027.method1865(class113.method784(var433, (byte) -80) + class113.method784(var432, (byte) -80) + 1, -125);
                                class311.field5027.method1859((byte) 58, var433);
                                class311.field5027.method1859((byte) 58, var432);
                                class311.field5027.method1865(var434, 67);
                                continue;
                            }
                            if (var526 == 5401) {
                                var3 -= 2;
                                class74.field1193[class146.field2346[var3]] = (short) class36.method263(class146.field2346[var3 + 1], -229);
                                class54.method335(1648141766);
                                class24.method192(1);
                                class13.method122(-71);
                                class18.method146((byte) -29);
                                class297.method2040(false);
                                continue;
                            }
                            if (var526 == 5405) {
                                var3 -= 2;
                                int var435 = class146.field2346[var3];
                                int var436 = class146.field2346[var3 + 1];
                                if (var435 >= 0 && var435 < 2) {
                                    class26.field469[var435] = new int[var436 << 1][4];
                                }
                                continue;
                            }
                            if (var526 == 5406) {
                                var3 -= 7;
                                int var437 = class146.field2346[var3 + 1] << 1;
                                int var438 = class146.field2346[var3];
                                int var439 = class146.field2346[var3 + 2];
                                int var440 = class146.field2346[var3 + 4];
                                int var441 = class146.field2346[var3 + 3];
                                int var442 = class146.field2346[var3 + 5];
                                int var443 = class146.field2346[var3 + 6];
                                if (var438 >= 0 && var438 < 2 && class26.field469[var438] != null && var437 >= 0 && class26.field469[var438].length > var437) {
                                    class26.field469[var438][var437] = new int[] { class233.method1609(var439 >> 14, 16383) * 128, var441, class233.method1609(16383, var439) * 128, var443 };
                                    class26.field469[var438][var437 + 1] = new int[] { (class233.method1609(268426266, var440) >> 14) * 128, var442, class233.method1609(var440, 16383) * 128 };
                                }
                                continue;
                            }
                            if (var526 == 5407) {
                                var3--;
                                int var444 = class26.field469[class146.field2346[var3]].length >> 1;
                                class146.field2346[var3++] = var444;
                                continue;
                            }
                            if (var526 == 5411) {
                                if (class53.field776 == null) {
                                    class168.method1196(class8.method81(-83), false, 78);
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var526 == 5419) {
                                String var445 = "";
                                if (class35.field564 != null) {
                                    if (class35.field564.field4930 == null) {
                                        var445 = class273.method1806((byte) 108, class35.field564.field4934);
                                    } else {
                                        var445 = (String) class35.field564.field4930;
                                    }
                                }
                                class53.field778[var4++] = var445;
                                continue;
                            }
                            if (var526 == 5420) {
                                class146.field2346[var3++] = class69.field1112 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 5421) {
                                var4--;
                                String var446 = class53.field778[var4];
                                var3--;
                                boolean var447 = class146.field2346[var3] == 1;
                                String var448 = class8.method81(-19) + var446;
                                if (class53.field776 != null || var447 && class69.field1112 != 3 && class69.field1109.startsWith("win") && !class5.field109) {
                                    class21.field405 = var448;
                                    class169.field2774 = var447;
                                    class87.field1368 = class44.field659.method470(var448, true);
                                    continue;
                                }
                                class168.method1196(var448, var447, 78);
                                continue;
                            }
                            if (var526 == 5422) {
                                var4 -= 2;
                                String var449 = class53.field778[var4 + 1];
                                String var450 = class53.field778[var4];
                                var3--;
                                int var451 = class146.field2346[var3];
                                if (var450.length() > 0) {
                                    if (class184.field3056 == null) {
                                        class184.field3056 = new String[class272.field4387[class106.field1656]];
                                    }
                                    class184.field3056[var451] = var450;
                                }
                                if (var449.length() > 0) {
                                    if (class134.field2173 == null) {
                                        class134.field2173 = new String[class272.field4387[class106.field1656]];
                                    }
                                    class134.field2173[var451] = var449;
                                }
                                continue;
                            }
                            if (var526 == 5423) {
                                var4--;
                                System.out.println(class53.field778[var4]);
                                continue;
                            }
                            if (var526 == 5424) {
                                var3 -= 11;
                                class101.field1583 = class146.field2346[var3];
                                class280.field4564 = class146.field2346[var3 + 1];
                                class168.field2762 = class146.field2346[var3 + 2];
                                class26.field471 = class146.field2346[var3 + 3];
                                class78.field1262 = class146.field2346[var3 + 4];
                                class57.field826 = class146.field2346[var3 + 5];
                                class290.field4735 = class146.field2346[var3 + 6];
                                class54.field791 = class146.field2346[var3 + 7];
                                class65.field1054 = class146.field2346[var3 + 8];
                                class189.field3101 = class146.field2346[var3 + 9];
                                class244.field3871 = class146.field2346[var3 + 10];
                                class118.field1844.method1168(0, class78.field1262);
                                class118.field1844.method1168(0, class57.field826);
                                class118.field1844.method1168(0, class290.field4735);
                                class118.field1844.method1168(0, class54.field791);
                                class118.field1844.method1168(0, class65.field1054);
                                class248.field3903 = true;
                                continue;
                            }
                            if (var526 == 5425) {
                                class14.method125(-32734);
                                class248.field3903 = false;
                                continue;
                            }
                            if (var526 == 5426) {
                                var3--;
                                class274.field4428 = class146.field2346[var3];
                                continue;
                            }
                            if (var526 == 5427) {
                                var3 -= 2;
                                class90.field1409 = class146.field2346[var3];
                                class63.field1026 = class146.field2346[var3 + 1];
                                continue;
                            }
                            if (var526 == 5428) {
                                var3 -= 2;
                                int var452 = class146.field2346[var3];
                                int var453 = class146.field2346[var3 + 1];
                                class146.field2346[var3++] = class175.method1240((byte) 95, var453, var452) ? 1 : 0;
                                continue;
                            }
                        } else if (var526 < 5600) {
                            if (var526 == 5500) {
                                var3 -= 4;
                                int var382 = class146.field2346[var3];
                                int var383 = class146.field2346[var3 + 1];
                                int var384 = class146.field2346[var3 + 2];
                                int var385 = class146.field2346[var3 + 3];
                                class297.method2036((var382 & 0x3FFF) - class145.field2327, var384, var383, var385, false, (var382 >> 14 & 0x3FFF) - class75.field1211, 18120);
                                continue;
                            }
                            if (var526 == 5501) {
                                var3 -= 4;
                                int var386 = class146.field2346[var3];
                                int var387 = class146.field2346[var3 + 1];
                                int var388 = class146.field2346[var3 + 2];
                                int var389 = class146.field2346[var3 + 3];
                                class109.method767(true, (var386 >> 14 & 0x3FFF) - class75.field1211, var388, var387, (var386 & 0x3FFF) - class145.field2327, var389);
                                continue;
                            }
                            if (var526 == 5502) {
                                var3 -= 6;
                                int var390 = class146.field2346[var3];
                                if (var390 >= 2) {
                                    throw new RuntimeException();
                                }
                                class311.field5026 = var390;
                                int var391 = class146.field2346[var3 + 1];
                                if ((class26.field469[class311.field5026].length >> 1) <= (var391 + 1)) {
                                    throw new RuntimeException();
                                }
                                class170.field2789 = 0;
                                class112.field1717 = var391;
                                class119.field1885 = class146.field2346[var3 + 2];
                                class51.field734 = class146.field2346[var3 + 3];
                                int var392 = class146.field2346[var3 + 4];
                                if (var392 >= 2) {
                                    throw new RuntimeException();
                                }
                                class22.field424 = var392;
                                int var393 = class146.field2346[var3 + 5];
                                if ((class26.field469[class22.field424].length >> 1) <= (var393 + 1)) {
                                    throw new RuntimeException();
                                }
                                class59.field866 = var393;
                                class231.field3613 = 3;
                                continue;
                            }
                            if (var526 == 5503) {
                                class294.method2019(-25488);
                                continue;
                            }
                            if (var526 == 5504) {
                                var3 -= 2;
                                class82.method585(class146.field2346[var3], (byte) 84, class146.field2346[var3 + 1]);
                                continue;
                            }
                            if (var526 == 5505) {
                                class146.field2346[var3++] = (int) class226.field3554;
                                continue;
                            }
                            if (var526 == 5506) {
                                class146.field2346[var3++] = (int) class114.field1742;
                                continue;
                            }
                            if (var526 == 5507) {
                                class72.method503((byte) 5);
                                continue;
                            }
                            if (var526 == 5508) {
                                class55.method348((byte) -127);
                                continue;
                            }
                            if (var526 == 5509) {
                                class95.method688(false);
                                continue;
                            }
                            if (var526 == 5510) {
                                class64.method425(-65);
                                continue;
                            }
                            if (var526 == 5512) {
                                class290.method2002(2048);
                                continue;
                            }
                        } else if (var526 < 5700) {
                            if (var526 == 5600) {
                                var4 -= 2;
                                var3--;
                                int var428 = class146.field2346[var3];
                                String var429 = class53.field778[var4 + 1];
                                String var430 = class53.field778[var4];
                                if (class238.field3741 == 10 && class140.field2280 == 0 && class199.field3195 == 0 && class112.field1719 == 0 && class48.field713 == 0) {
                                    class143.method984(2, var430, var429, var428);
                                }
                                continue;
                            }
                            if (var526 == 5601) {
                                class249.method1695(false);
                                continue;
                            }
                            if (var526 == 5602) {
                                if (class199.field3195 == 0) {
                                    class191.field3120 = -2;
                                }
                                continue;
                            }
                            if (var526 == 5603) {
                                var3 -= 4;
                                if (class238.field3741 == 10 && class140.field2280 == 0 && class199.field3195 == 0 && class112.field1719 == 0 && class48.field713 == 0) {
                                    class256.method1731(class146.field2346[var3 + 3], class146.field2346[var3 + 1], class146.field2346[var3], 0, class146.field2346[var3 + 2]);
                                }
                                continue;
                            }
                            if (var526 == 5604) {
                                var4--;
                                if (class238.field3741 == 10 && class140.field2280 == 0 && class199.field3195 == 0 && class112.field1719 == 0 && class48.field713 == 0) {
                                    class35.method260(class162.method1114((byte) -112, class53.field778[var4]), (byte) -50);
                                }
                                continue;
                            }
                            if (var526 == 5605) {
                                var3 -= 7;
                                var4 -= 3;
                                if (class238.field3741 == 10 && class140.field2280 == 0 && class199.field3195 == 0 && class112.field1719 == 0 && class48.field713 == 0) {
                                    class161.method1111(class162.method1114((byte) -111, class53.field778[var4]), class53.field778[var4 + 1], class146.field2346[var3 + 6] == 1, class146.field2346[var3], (byte) -93, class146.field2346[var3 + 3], class146.field2346[var3 + 1], class53.field778[var4 + 2], class146.field2346[var3 + 4] == 1, class146.field2346[var3 + 5] == 1, class146.field2346[var3 + 2]);
                                }
                                continue;
                            }
                            if (var526 == 5606) {
                                if (class112.field1719 == 0) {
                                    class24.field444 = -2;
                                }
                                continue;
                            }
                            if (var526 == 5607) {
                                class146.field2346[var3++] = class191.field3120;
                                continue;
                            }
                            if (var526 == 5608) {
                                class146.field2346[var3++] = class309.field5003;
                                continue;
                            }
                            if (var526 == 5609) {
                                class146.field2346[var3++] = class24.field444;
                                continue;
                            }
                            if (var526 == 5610) {
                                for (int var431 = 0; var431 < 5; var431++) {
                                    class53.field778[var4++] = var431 < class80.field1288.length ? class179.method1260(class80.field1288[var431], 0) : "";
                                }
                                class80.field1288 = null;
                                continue;
                            }
                            if (var526 == 5611) {
                                class146.field2346[var3++] = class163.field2650;
                                continue;
                            }
                        } else if (var526 < 6100) {
                            if (var526 == 6001) {
                                var3--;
                                int var394 = class146.field2346[var3];
                                if (var394 < 1) {
                                    var394 = 1;
                                }
                                if (var394 > 4) {
                                    var394 = 4;
                                }
                                class288.field4664 = var394;
                                if (class288.field4664 == 1) {
                                    class136.method939(0.9F);
                                }
                                if (class288.field4664 == 2) {
                                    class136.method939(0.8F);
                                }
                                if (class288.field4664 == 3) {
                                    class136.method939(0.7F);
                                }
                                if (class288.field4664 == 4) {
                                    class136.method939(0.6F);
                                }
                                class24.method192(1);
                                class302.method2065(class44.field659, (byte) 93);
                                class295.field4817 = false;
                                continue;
                            }
                            if (var526 == 6002) {
                                var3--;
                                class191.method1339((byte) -108, class146.field2346[var3] == 1);
                                class50.method323((byte) -127);
                                class140.method964((byte) 76);
                                class89.method623((byte) 117);
                                class302.method2065(class44.field659, (byte) 93);
                                class295.field4817 = false;
                                continue;
                            }
                            if (var526 == 6003) {
                                var3--;
                                class33.field545 = class146.field2346[var3] == 1;
                                class89.method623((byte) 117);
                                class302.method2065(class44.field659, (byte) 93);
                                class295.field4817 = false;
                                continue;
                            }
                            if (var526 == 6005) {
                                var3--;
                                class296.field4835 = class146.field2346[var3] == 1;
                                class140.method964((byte) 56);
                                class302.method2065(class44.field659, (byte) 93);
                                class295.field4817 = false;
                                continue;
                            }
                            if (var526 == 6006) {
                                var3--;
                                class236.field3701 = class146.field2346[var3] == 1;
                                ((class220) class136.field2196).method1495(70, !class236.field3701);
                                class302.method2065(class44.field659, (byte) 93);
                                class295.field4817 = false;
                                continue;
                            }
                            if (var526 == 6007) {
                                var3--;
                                class101.field1586 = class146.field2346[var3] == 1;
                                class302.method2065(class44.field659, (byte) 93);
                                class295.field4817 = false;
                                continue;
                            }
                            if (var526 == 6008) {
                                var3--;
                                class117.field1804 = class146.field2346[var3] == 1;
                                class302.method2065(class44.field659, (byte) 93);
                                class295.field4817 = false;
                                continue;
                            }
                            if (var526 == 6009) {
                                var3--;
                                class4.field95 = class146.field2346[var3] == 1;
                                class302.method2065(class44.field659, (byte) 93);
                                class295.field4817 = false;
                                continue;
                            }
                            if (var526 == 6010) {
                                var3--;
                                class277.field4524 = class146.field2346[var3] == 1;
                                class302.method2065(class44.field659, (byte) 93);
                                class295.field4817 = false;
                                continue;
                            }
                            if (var526 == 6011) {
                                var3--;
                                int var395 = class146.field2346[var3];
                                if (var395 < 0 || var395 > 2) {
                                    var395 = 0;
                                }
                                class240.field3761 = var395;
                                class302.method2065(class44.field659, (byte) 93);
                                class295.field4817 = false;
                                continue;
                            }
                            if (var526 == 6012) {
                                var3--;
                                class244.field3867 = class146.field2346[var3] == 1;
                                if (class288.field4664 == 1) {
                                    class136.method939(0.9F);
                                }
                                if (class288.field4664 == 2) {
                                    class136.method939(0.8F);
                                }
                                if (class288.field4664 == 3) {
                                    class136.method939(0.7F);
                                }
                                if (class288.field4664 == 4) {
                                    class136.method939(0.6F);
                                }
                                class140.method964((byte) 90);
                                class302.method2065(class44.field659, (byte) 93);
                                class295.field4817 = false;
                                continue;
                            }
                            if (var526 == 6014) {
                                var3--;
                                class131.field2101 = class146.field2346[var3] == 1;
                                class302.method2065(class44.field659, (byte) 93);
                                class295.field4817 = false;
                                continue;
                            }
                            if (var526 == 6015) {
                                var3--;
                                class143.field2314 = class146.field2346[var3] == 1;
                                class302.method2065(class44.field659, (byte) 93);
                                class295.field4817 = false;
                                continue;
                            }
                            if (var526 == 6016) {
                                var3--;
                                int var396 = class146.field2346[var3];
                                if (var396 < 0 || var396 > 2) {
                                    var396 = 0;
                                }
                                class275.field4503 = var396;
                                continue;
                            }
                            if (var526 == 6017) {
                                var3--;
                                class127.field2032 = class146.field2346[var3] == 1;
                                class285.method1938(22050);
                                class302.method2065(class44.field659, (byte) 93);
                                class295.field4817 = false;
                                continue;
                            }
                            if (var526 == 6018) {
                                var3--;
                                int var397 = class146.field2346[var3];
                                if (var397 < 0) {
                                    var397 = 0;
                                }
                                if (var397 > 127) {
                                    var397 = 127;
                                }
                                class129.field2066 = var397;
                                class302.method2065(class44.field659, (byte) 93);
                                class295.field4817 = false;
                                continue;
                            }
                            if (var526 == 6019) {
                                var3--;
                                int var398 = class146.field2346[var3];
                                if (var398 < 0) {
                                    var398 = 0;
                                }
                                if (var398 > 255) {
                                    var398 = 255;
                                }
                                if (class44.field654 != var398) {
                                    if (class44.field654 == 0 && class215.field3393 != -1) {
                                        class251.method1707(-28138, false, class215.field3393, var398, class203.field3290, 0);
                                        class85.field1355 = false;
                                    } else if (var398 == 0) {
                                        class149.method1010((byte) -115);
                                        class85.field1355 = false;
                                    } else {
                                        class165.method1175(-114, var398);
                                    }
                                    class44.field654 = var398;
                                }
                                class302.method2065(class44.field659, (byte) 93);
                                class295.field4817 = false;
                                continue;
                            }
                            if (var526 == 6020) {
                                var3--;
                                int var399 = class146.field2346[var3];
                                if (var399 < 0) {
                                    var399 = 0;
                                }
                                if (var399 > 127) {
                                    var399 = 127;
                                }
                                class66.field1067 = var399;
                                class302.method2065(class44.field659, (byte) 93);
                                class295.field4817 = false;
                                continue;
                            }
                            if (var526 == 6021) {
                                var3--;
                                class251.field4131 = class146.field2346[var3] == 1;
                                class89.method623((byte) 117);
                                continue;
                            }
                            if (var526 == 6023) {
                                var3--;
                                int var400 = class146.field2346[var3];
                                boolean var401 = false;
                                if (var400 < 0) {
                                    var400 = 0;
                                }
                                if (var400 > 2) {
                                    var400 = 2;
                                }
                                if (class9.field197 < 96) {
                                    var401 = true;
                                    var400 = 0;
                                }
                                class181.method1281(var400);
                                class302.method2065(class44.field659, (byte) 93);
                                class295.field4817 = false;
                                class146.field2346[var3++] = var401 ? 0 : 1;
                                continue;
                            }
                            if (var526 == 6024) {
                                var3--;
                                int var402 = class146.field2346[var3];
                                if (var402 < 0 || var402 > 2) {
                                    var402 = 0;
                                }
                                class46.field689 = var402;
                                class302.method2065(class44.field659, (byte) 93);
                                continue;
                            }
                            if (var526 == 6027) {
                                var3--;
                                continue;
                            }
                            if (var526 == 6028) {
                                var3--;
                                class186.field3077 = class146.field2346[var3] != 0;
                                class302.method2065(class44.field659, (byte) 93);
                                continue;
                            }
                        } else if (var526 < 6200) {
                            if (var526 == 6101) {
                                class146.field2346[var3++] = class288.field4664;
                                continue;
                            }
                            if (var526 == 6102) {
                                class146.field2346[var3++] = class143.method981(22351) ? 1 : 0;
                                continue;
                            }
                            if (var526 == 6103) {
                                class146.field2346[var3++] = class33.field545 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 6105) {
                                class146.field2346[var3++] = class296.field4835 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 6106) {
                                class146.field2346[var3++] = class236.field3701 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 6107) {
                                class146.field2346[var3++] = class101.field1586 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 6108) {
                                class146.field2346[var3++] = class117.field1804 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 6109) {
                                class146.field2346[var3++] = class4.field95 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 6110) {
                                class146.field2346[var3++] = class277.field4524 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 6111) {
                                class146.field2346[var3++] = class240.field3761;
                                continue;
                            }
                            if (var526 == 6112) {
                                class146.field2346[var3++] = class244.field3867 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 6114) {
                                class146.field2346[var3++] = class131.field2101 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 6115) {
                                class146.field2346[var3++] = class143.field2314 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 6116) {
                                class146.field2346[var3++] = class275.field4503;
                                continue;
                            }
                            if (var526 == 6117) {
                                class146.field2346[var3++] = class127.field2032 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 6118) {
                                class146.field2346[var3++] = class129.field2066;
                                continue;
                            }
                            if (var526 == 6119) {
                                class146.field2346[var3++] = class44.field654;
                                continue;
                            }
                            if (var526 == 6120) {
                                class146.field2346[var3++] = class66.field1067;
                                continue;
                            }
                            if (var526 == 6121) {
                                class146.field2346[var3++] = 0;
                                continue;
                            }
                            if (var526 == 6123) {
                                class146.field2346[var3++] = class181.method1272();
                                continue;
                            }
                            if (var526 == 6124) {
                                class146.field2346[var3++] = class46.field689;
                                continue;
                            }
                            if (var526 == 6126) {
                                class146.field2346[var3++] = 0;
                                continue;
                            }
                            if (var526 == 6127) {
                                class146.field2346[var3++] = class91.field1432 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 6128) {
                                class146.field2346[var3++] = class186.field3077 ? 1 : 0;
                                continue;
                            }
                        } else if (var526 < 6300) {
                            if (var526 == 6200) {
                                var3 -= 2;
                                class267.field4329 = (short) class146.field2346[var3];
                                if (class267.field4329 <= 0) {
                                    class267.field4329 = 256;
                                }
                                class292.field4782 = (short) class146.field2346[var3 + 1];
                                if (class292.field4782 <= 0) {
                                    class292.field4782 = 205;
                                }
                                continue;
                            }
                            if (var526 == 6201) {
                                var3 -= 2;
                                class152.field2441 = (short) class146.field2346[var3];
                                if (class152.field2441 <= 0) {
                                    class152.field2441 = 256;
                                }
                                class248.field4069 = (short) class146.field2346[var3 + 1];
                                if (class248.field4069 <= 0) {
                                    class248.field4069 = 320;
                                }
                                continue;
                            }
                            if (var526 == 6202) {
                                var3 -= 4;
                                class109.field1690 = (short) class146.field2346[var3];
                                if (class109.field1690 <= 0) {
                                    class109.field1690 = 1;
                                }
                                class104.field1636 = (short) class146.field2346[var3 + 1];
                                if (class104.field1636 <= 0) {
                                    class104.field1636 = 32767;
                                } else if (class104.field1636 < class109.field1690) {
                                    class104.field1636 = class109.field1690;
                                }
                                class175.field2921 = (short) class146.field2346[var3 + 2];
                                if (class175.field2921 <= 0) {
                                    class175.field2921 = 1;
                                }
                                class307.field4989 = (short) class146.field2346[var3 + 3];
                                if (class307.field4989 <= 0) {
                                    class307.field4989 = 32767;
                                } else if (class175.field2921 > class307.field4989) {
                                    class307.field4989 = class175.field2921;
                                }
                                continue;
                            }
                            if (var526 == 6203) {
                                class16.method131(0, false, 1, 0, class170.field2790.field4057, class170.field2790.field4016);
                                class146.field2346[var3++] = class236.field3700;
                                class146.field2346[var3++] = class249.field4084;
                                continue;
                            }
                            if (var526 == 6204) {
                                class146.field2346[var3++] = class152.field2441;
                                class146.field2346[var3++] = class248.field4069;
                                continue;
                            }
                            if (var526 == 6205) {
                                class146.field2346[var3++] = class267.field4329;
                                class146.field2346[var3++] = class292.field4782;
                                continue;
                            }
                        } else if (var526 < 6400) {
                            if (var526 == 6300) {
                                class146.field2346[var3++] = (int) (class264.method1778(6573) / 60000L);
                                continue;
                            }
                            if (var526 == 6301) {
                                class146.field2346[var3++] = (int) (class264.method1778(6573) / 86400000L) - 11745;
                                continue;
                            }
                            if (var526 == 6302) {
                                var3 -= 3;
                                int var423 = class146.field2346[var3];
                                int var424 = class146.field2346[var3 + 2];
                                int var425 = class146.field2346[var3 + 1];
                                class63.field1023.clear();
                                class63.field1023.set(11, 12);
                                class63.field1023.set(var424, var425, var423);
                                class146.field2346[var3++] = (int) (class63.field1023.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var526 == 6303) {
                                class63.field1023.clear();
                                class63.field1023.setTime(new Date(class264.method1778(6573)));
                                class146.field2346[var3++] = class63.field1023.get(1);
                                continue;
                            }
                            if (var526 == 6304) {
                                var3--;
                                int var426 = class146.field2346[var3];
                                boolean var427 = true;
                                if (var426 < 0) {
                                    var427 = ((var426 + 1) % 4) == 0;
                                } else if (var426 < 1582) {
                                    var427 = var426 % 4 == 0;
                                } else if ((var426 % 4) != 0) {
                                    var427 = false;
                                } else if ((var426 % 100) != 0) {
                                    var427 = true;
                                } else if (var426 % 400 != 0) {
                                    var427 = false;
                                }
                                class146.field2346[var3++] = var427 ? 1 : 0;
                                continue;
                            }
                        } else if (var526 < 6500) {
                            if (var526 == 6405) {
                                class146.field2346[var3++] = class90.method628(0) ? 1 : 0;
                                continue;
                            }
                            if (var526 == 6406) {
                                class146.field2346[var3++] = class24.method194(3595) ? 1 : 0;
                                continue;
                            }
                        } else if (var526 < 6600) {
                            if (var526 == 6500) {
                                if (class238.field3741 == 10 && class140.field2280 == 0 && class199.field3195 == 0 && class112.field1719 == 0) {
                                    class146.field2346[var3++] = class128.method877((byte) 8) == -1 ? 0 : 1;
                                    continue;
                                }
                                class146.field2346[var3++] = 1;
                                continue;
                            }
                            if (var526 == 6501) {
                                class241 var403 = class178.method1258(52);
                                if (var403 == null) {
                                    class146.field2346[var3++] = -1;
                                    class146.field2346[var3++] = 0;
                                    class53.field778[var4++] = "";
                                    class146.field2346[var3++] = 0;
                                    class53.field778[var4++] = "";
                                    class146.field2346[var3++] = 0;
                                } else {
                                    class146.field2346[var3++] = var403.field3764;
                                    class146.field2346[var3++] = var403.field3612;
                                    class53.field778[var4++] = var403.field3767;
                                    class177 var404 = var403.method1636(true);
                                    class146.field2346[var3++] = var404.field2948;
                                    class53.field778[var4++] = var404.field2946;
                                    class146.field2346[var3++] = var403.field3601;
                                }
                                continue;
                            }
                            if (var526 == 6502) {
                                class241 var405 = class284.method1926(32309);
                                if (var405 == null) {
                                    class146.field2346[var3++] = -1;
                                    class146.field2346[var3++] = 0;
                                    class53.field778[var4++] = "";
                                    class146.field2346[var3++] = 0;
                                    class53.field778[var4++] = "";
                                    class146.field2346[var3++] = 0;
                                } else {
                                    class146.field2346[var3++] = var405.field3764;
                                    class146.field2346[var3++] = var405.field3612;
                                    class53.field778[var4++] = var405.field3767;
                                    class177 var406 = var405.method1636(true);
                                    class146.field2346[var3++] = var406.field2948;
                                    class53.field778[var4++] = var406.field2946;
                                    class146.field2346[var3++] = var405.field3601;
                                }
                                continue;
                            }
                            if (var526 == 6503) {
                                var3--;
                                int var407 = class146.field2346[var3];
                                if (class238.field3741 == 10 && class140.field2280 == 0 && class199.field3195 == 0 && class112.field1719 == 0) {
                                    class146.field2346[var3++] = class36.method264((byte) 111, var407) ? 1 : 0;
                                    continue;
                                }
                                class146.field2346[var3++] = 0;
                                continue;
                            }
                            if (var526 == 6504) {
                                var3--;
                                class57.field827 = class146.field2346[var3];
                                class302.method2065(class44.field659, (byte) 93);
                                continue;
                            }
                            if (var526 == 6505) {
                                class146.field2346[var3++] = class57.field827;
                                continue;
                            }
                            if (var526 == 6506) {
                                var3--;
                                int var408 = class146.field2346[var3];
                                class241 var409 = class90.method626(var408, -32260);
                                if (var409 == null) {
                                    class146.field2346[var3++] = -1;
                                    class53.field778[var4++] = "";
                                    class146.field2346[var3++] = 0;
                                    class53.field778[var4++] = "";
                                    class146.field2346[var3++] = 0;
                                } else {
                                    class146.field2346[var3++] = var409.field3612;
                                    class53.field778[var4++] = var409.field3767;
                                    class177 var410 = var409.method1636(true);
                                    class146.field2346[var3++] = var410.field2948;
                                    class53.field778[var4++] = var410.field2946;
                                    class146.field2346[var3++] = var409.field3601;
                                }
                                continue;
                            }
                            if (var526 == 6507) {
                                var3 -= 4;
                                int var411 = class146.field2346[var3];
                                boolean var412 = class146.field2346[var3 + 1] == 1;
                                int var413 = class146.field2346[var3 + 2];
                                boolean var414 = class146.field2346[var3 + 3] == 1;
                                class79.method569(var414, var411, var412, var413, 71);
                                continue;
                            }
                        } else if (var526 < 6700) {
                            if (var526 == 6600) {
                                var3--;
                                class184.field3053 = class146.field2346[var3] == 1;
                                class302.method2065(class44.field659, (byte) 93);
                                continue;
                            }
                            if (var526 == 6601) {
                                class146.field2346[var3++] = class184.field3053 ? 1 : 0;
                                continue;
                            }
                        } else if (var526 < 6900) {
                            if (var526 == 6800) {
                                var3--;
                                int var415 = class146.field2346[var3];
                                class125 var416 = class223.method1550((byte) 91, var415);
                                if (var416.field1999 == null) {
                                    class53.field778[var4++] = "";
                                } else {
                                    class53.field778[var4++] = var416.field1999;
                                }
                                continue;
                            }
                            if (var526 == 6801) {
                                var3--;
                                int var417 = class146.field2346[var3];
                                class125 var418 = class223.method1550((byte) 86, var417);
                                class146.field2346[var3++] = var418.field1982;
                                continue;
                            }
                            if (var526 == 6802) {
                                var3--;
                                int var419 = class146.field2346[var3];
                                class125 var420 = class223.method1550((byte) -52, var419);
                                class146.field2346[var3++] = var420.field2007;
                                continue;
                            }
                            if (var526 == 6803) {
                                var3--;
                                int var421 = class146.field2346[var3];
                                class125 var422 = class223.method1550((byte) 95, var421);
                                class146.field2346[var3++] = var422.field1983;
                                continue;
                            }
                        }
                    } else if (var526 == 4400) {
                        var3 -= 2;
                        int var457 = class146.field2346[var3];
                        int var458 = class146.field2346[var3 + 1];
                        class11 var459 = class177.method1251(var458, (byte) -68);
                        if (var459.method87((byte) 123)) {
                            class53.field778[var4++] = class49.method319(var457, 0).method1226(var458, 0, var459.field206);
                        } else {
                            class146.field2346[var3++] = class49.method319(var457, 0).method1230(var459.field204, var458, false);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var525) {
            if (arg1.field451 == null) {
                if (class41.field625 != 0) {
                    class74.method536("Clientscript error - check log for details", "", (byte) -59, 0);
                }
                class284.method1930(50, "CS2 - scr:" + arg1.field2209 + " op:" + var7, var525);
            } else {
                StringBuffer var522 = new StringBuffer(30);
                var522.append("%0a - in: ").append(arg1.field451);
                for (int var523 = class146.field2349 - 1; var523 >= 0; var523--) {
                    var522.append("%0a - via: ").append(class236.field3712[var523].field1153.field451);
                }
                if (var7 == 40) {
                    int var524 = var8[var5];
                    var522.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var524));
                }
                if (class41.field625 != 0) {
                    class74.method536("Clientscript error in: " + arg1.field451, "", (byte) -53, 0);
                }
                class284.method1930(-105, "CS2 - scr:" + arg1.field2209 + " op:" + var7 + var522.toString(), var525);
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLuk;)I")
    public static final int method644(byte arg0, class104 arg1) {
        field1458++;
        class242 var2 = arg1.field1645;
        if (var2.field3779 != null) {
            var2 = var2.method1649(false);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field3803;
        if (arg0 != 120) {
            method644((byte) 71, (class104) null);
        }
        class254 var4 = arg1.method403((byte) 97);
        if (arg1.field947 == var4.field4180) {
            var3 = var2.field3774;
        } else if (arg1.field947 == var4.field4183 || arg1.field947 == var4.field4174 || arg1.field947 == var4.field4196 || arg1.field947 == var4.field4195) {
            var3 = var2.field3825;
        } else if (arg1.field947 == var4.field4176 || arg1.field947 == var4.field4194 || arg1.field947 == var4.field4175 || arg1.field947 == var4.field4168) {
            var3 = var2.field3772;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILfj;I)V")
    private final void method645(int arg0, class274 arg1, int arg2) {
        field1463++;
        if (arg0 == 1) {
            this.field1465 = arg1.method1837(252);
            this.field1461 = arg1.method1849(255);
            this.field1467 = arg1.method1849(255);
        }
        if (arg2 != 10529) {
            field1470 = null;
        }
    }
}
