import java.awt.Point;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class72 extends class283 {

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
    private int field1107 = 4;

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
    private int field1103 = 4;

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "Lna;")
    public static class26 field1108 = class69.method505("null", (byte) -123);

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "I")
    public static int field1106 = 0;

    @OriginalMember(owner = "client!gg", name = "db", descriptor = "I")
    public static int field1115 = -1;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "Lna;")
    public static class26 field1102 = class69.method505(" s(West connect-B)3", (byte) -128);

    @OriginalMember(owner = "client!gg", name = "Y", descriptor = "Lna;")
    public static class26 field1110 = class69.method505("::gc", (byte) -120);

    @OriginalMember(owner = "client!gg", name = "jb", descriptor = "Lna;")
    public static class26 field1121 = class69.method505(" est d-Bj-9 dans votre liste noire)3", (byte) -124);

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!gg", name = "X", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!gg", name = "Z", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!gg", name = "bb", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!gg", name = "cb", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!gg", name = "eb", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!gg", name = "fb", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!gg", name = "gb", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!gg", name = "hb", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!gg", name = "ib", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!gg", name = "ab", descriptor = "Lve;")
    public static class266 field1112;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(II)V", line = 5)
    public static final void method513(int arg0, int arg1) {
        if (!class59.field960) {
            arg0 = -1;
        }
        field1105++;
        if (arg1 != 20827 || class64.field1024 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class208 var2 = class240.method1655(arg0, 5);
            class256 var3 = var2.method1388((byte) 95);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class45.field712.method1058(var3.method1801(), 10000, var3.field2309, class250.field4085, new Point(var2.field3225, var2.field3223), var3.field2319);
                class64.field1024 = arg0;
            }
        }
        if (arg0 == -1 && class64.field1024 != -1) {
            class45.field712.method1058((int[]) null, 10000, -1, class250.field4085, new Point(), -1);
            class64.field1024 = -1;
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V", line = 54)
    public class72() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILwa;Z)V", line = 58)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        field1101++;
        if (!arg2) {
            field1106 = -117;
        }
        if (arg0 == 0) {
            this.field1107 = arg1.method642((byte) -69);
        } else if (arg0 == 1) {
            this.field1103 = arg1.method642((byte) -80);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([[IZ)V", line = 99)
    public static final void method514(int[][] arg0, boolean arg1) {
        field1116++;
        class45.field710 = arg0;
        if (!arg1) {
            method518(20);
        }
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(II)Ldm;", line = 111)
    public static final class284 method515(int arg0, int arg1) {
        field1119++;
        class284 var2 = (class284) class241.field3929.method1989((long) arg0, (byte) 121);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class68.field1062.method1889(3, (byte) -122, arg0);
        class284 var4 = new class284();
        if (var3 != null) {
            var4.method2009(-31957, new class82(var3));
        }
        class241.field3929.method1978((byte) -89, var4, (long) arg0);
        if (arg1 != 0) {
            field1112 = (class266) null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(II)V", line = 137)
    public static final void method516(int arg0, int arg1) {
        field1118++;
        if (!class71.method509(arg0, 104)) {
            return;
        }
        class297[] var2 = class86.field1416[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class297 var4 = var2[var3];
            if (var4 != null) {
                var4.field5066 = 1;
                var4.field5093 = 0;
                var4.field5073 = 0;
            }
        }
        if (arg1 != 16182) {
            method513(25, -86);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)[I", line = 173)
    public final int[] method8(int arg0, byte arg1) {
        field1114++;
        int var3 = 39 % ((30 - arg1) / 36);
        int[] var4 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            int var5 = class101.field1632 / this.field1107;
            int var6 = class225.field3574 / this.field1103;
            int[] var7;
            if (var6 <= 0) {
                var7 = this.method1990(0, 0, 32755);
            } else {
                int var8 = arg0 % var6;
                var7 = this.method1990(0, class225.field3574 * var8 / var6, 32755);
            }
            for (int var9 = 0; var9 < class101.field1632; var9++) {
                if (var5 <= 0) {
                    var4[var9] = var7[0];
                } else {
                    int var10 = var9 % var5;
                    var4[var9] = var7[class101.field1632 * var10 / var5];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILve;)V", line = 224)
    public static final void method517(int arg0, class266 arg1) {
        field1120++;
        if (arg0 != 28280) {
            field1112 = (class266) null;
        }
        class324.field5598 = arg1.method1876(class92.field1498, (byte) -30);
    }

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "(I)V", line = 239)
    public static void method518(int arg0) {
        field1121 = null;
        field1108 = null;
        if (arg0 != -3) {
            method517(-114, (class266) null);
        }
        field1102 = null;
        field1112 = null;
        field1110 = null;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)[[I", line = 258)
    public final int[][] method3(int arg0, int arg1) {
        field1117++;
        if (arg0 != -1) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field4719.method2182((byte) -123, arg1);
        if (this.field4719.field5381) {
            int var4 = class101.field1632 / this.field1107;
            int var5 = class225.field3574 / this.field1103;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method1994(class225.field3574 * var6 / var5, 0, (byte) -109);
            } else {
                var7 = this.method1994(0, 0, (byte) -120);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[2];
            int[] var10 = var3[0];
            int[] var11 = var7[1];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class101.field1632; var14++) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class101.field1632 * var16 / var4;
                }
                var10[var14] = var8[var15];
                var12[var14] = var11[var15];
                var13[var14] = var9[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V", line = 341)
    public static final void method519(boolean arg0) {
        if (class80.field1262 > 0) {
            class80.field1262--;
        }
        if (class11.field155 > 1) {
            class11.field155--;
            class319.field5463 = class74.field1144;
        }
        field1104++;
        if (class27.field459) {
            class27.field459 = false;
            class185.method1270(false);
            return;
        }
        for (int var1 = 0; var1 < 100 && class320.method2225(-15450); var1++) {
        }
        if (class207.field3217 != 30) {
            return;
        }
        class252.method1746(class114.field1789, 163, -116);
        Object var2 = class25.field363.field2135;
        synchronized (class25.field363.field2135) {
            if (!class71.field1089) {
                class25.field363.field2140 = 0;
            } else if (class277.field4639 != 0 || class25.field363.field2140 >= 40) {
                class26.field378++;
                class114.field1789.method1431(0, 123);
                int var3 = 0;
                class114.field1789.method591((byte) -14, 0);
                int var4 = class114.field1789.field1301;
                for (int var5 = 0; class25.field363.field2140 > var5 && (class114.field1789.field1301 - var4) < 240; var5++) {
                    var3++;
                    int var6 = class25.field363.field2141[var5];
                    int var7 = class25.field363.field2143[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class25.field363.field2141[var5] == -1 && class25.field363.field2143[var5] == -1) {
                        var8 = true;
                        var6 = -1;
                        var7 = -1;
                    }
                    if (class53.field844 != var7 || class127.field1958 != var6) {
                        int var9 = var7 - class53.field844;
                        class53.field844 = var7;
                        int var10 = var6 - class127.field1958;
                        class127.field1958 = var6;
                        if (class301.field5186 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class114.field1789.method643(-20037, (var9 << 6) + (class301.field5186 << 12) + var10);
                            class301.field5186 = 0;
                        } else if (class301.field5186 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class114.field1789.method591((byte) -97, class301.field5186 + 128);
                            var10 += 128;
                            var9 += 128;
                            class114.field1789.method643(-20037, (var9 << 8) + var10);
                            class301.field5186 = 0;
                        } else if (class301.field5186 < 32) {
                            class114.field1789.method591((byte) -13, class301.field5186 + 192);
                            if (var8) {
                                class114.field1789.method577(-123, Integer.MIN_VALUE);
                            } else {
                                class114.field1789.method577(-124, var7 | var6 << 16);
                            }
                            class301.field5186 = 0;
                        } else {
                            class114.field1789.method643(-20037, class301.field5186 + 57344);
                            if (var8) {
                                class114.field1789.method577(-120, Integer.MIN_VALUE);
                            } else {
                                class114.field1789.method577(-124, var7 | var6 << 16);
                            }
                            class301.field5186 = 0;
                        }
                    } else if (class301.field5186 < 2047) {
                        class301.field5186++;
                    }
                }
                class114.field1789.method608((byte) -126, class114.field1789.field1301 - var4);
                if (class25.field363.field2140 > var3) {
                    class25.field363.field2140 -= var3;
                    for (int var11 = 0; var11 < class25.field363.field2140; var11++) {
                        class25.field363.field2143[var11] = class25.field363.field2143[var3 + var11];
                        class25.field363.field2141[var11] = class25.field363.field2141[var3 + var11];
                    }
                } else {
                    class25.field363.field2140 = 0;
                }
            }
        }
        if (class277.field4639 != 0) {
            class117.field1838++;
            long var13 = (class222.field3514 - class150.field2346) / 50L;
            int var15 = class11.field152;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            int var16 = class205.field3210;
            class150.field2346 = class222.field3514;
            byte var17 = 0;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var18 = (int) var13;
            if (class277.field4639 == 2) {
                var17 = 1;
            }
            class114.field1789.method1431(0, 75);
            class114.field1789.method604(var17 << 15 | var18, (byte) 3);
            class114.field1789.method598(-105, var16 | var15 << 16);
        }
        if (class327.field5670 > 0) {
            class327.field5670--;
        }
        if (class316.field5411) {
            for (int var19 = 0; var19 < class323.field5556; var19++) {
                int var20 = class37.field616[var19];
                if (var20 == 98 || var20 == 99 || var20 == 96 || var20 == 97) {
                    class103.field1651 = true;
                    break;
                }
            }
        } else if (class78.field1183[96] || class78.field1183[97] || class78.field1183[98] || class78.field1183[99]) {
            class103.field1651 = true;
        }
        if (class103.field1651 && class327.field5670 <= 0) {
            class327.field5670 = 20;
            class103.field1651 = false;
            class37.field617++;
            class114.field1789.method1431(0, 21);
            class114.field1789.method622(class224.field3534, -268435456);
            class114.field1789.method635(-1, class300.field5156);
        }
        if (class98.field1598 == arg0 && !class241.field3911) {
            class303.field5230++;
            class241.field3911 = true;
            class114.field1789.method1431(0, 22);
            class114.field1789.method591((byte) -41, 1);
        }
        if (!class98.field1598 && class241.field3911) {
            class303.field5230++;
            class241.field3911 = false;
            class114.field1789.method1431(0, 22);
            class114.field1789.method591((byte) -43, 0);
        }
        if (!class272.field4543) {
            class133.field2024++;
            class114.field1789.method1431(0, 98);
            class114.field1789.method577(-126, class124.method851(-2));
            class272.field4543 = true;
        }
        class139.method929(0);
        if (class207.field3217 != 30) {
            return;
        }
        class305.method2138((byte) -82);
        class79.method567((byte) -91);
        class294.method2071((byte) -92);
        class148.field2311++;
        if (class148.field2311 > 750) {
            class185.method1270(false);
            return;
        }
        class45.method346(-102);
        class177.method1223(-72);
        class84.method654((byte) -62);
        if (class66.field1033 != null) {
            class92.method707(4);
        }
        for (int var21 = class265.method1866(true, -1); var21 != -1; var21 = class265.method1866(false, -1)) {
            class191.method1299(40, var21);
            class229.field3639[class4.method23(class260.field4258++, 31)] = var21;
        }
        for (class120 var22 = class233.method1569((byte) -36); var22 != null; var22 = class233.method1569((byte) -36)) {
            int var23 = var22.method827(2063817568);
            int var24 = var22.method828((byte) 117);
            if (var23 == 1) {
                class187.field2935[var24] = var22.field1877;
                class324.field5575[class4.method23(31, class163.field2539++)] = var24;
            } else if (var23 == 2) {
                class108.field1699[var24] = var22.field1878;
                class252.field4147[class4.method23(31, class224.field3543++)] = var24;
            } else if (var23 == 3) {
                class297 var45 = class178.method1226((byte) 118, var24);
                if (!var22.field1878.method159((byte) -42, var45.field5037)) {
                    var45.field5037 = var22.field1878;
                    class318.method2209(107, var45);
                }
            } else if (var23 == 4) {
                class297 var25 = class178.method1226((byte) 109, var24);
                int var26 = var22.field1877;
                int var27 = var22.field1875;
                int var28 = var22.field1876;
                if (var25.field5005 != var26 || var25.field5004 != var28 || var25.field5071 != var27) {
                    var25.field5004 = var28;
                    var25.field5071 = var27;
                    var25.field5005 = var26;
                    class318.method2209(120, var25);
                }
            } else if (var23 == 5) {
                class297 var29 = class178.method1226((byte) 117, var24);
                if (var22.field1877 != var29.field5117 || var22.field1877 == -1) {
                    var29.field5066 = 1;
                    var29.field5073 = 0;
                    var29.field5117 = var22.field1877;
                    var29.field5093 = 0;
                    class318.method2209(-117, var29);
                }
            } else if (var23 == 6) {
                int var39 = var22.field1877;
                int var40 = (var39 & 0x7DC3) >> 10;
                int var41 = var39 & 0x1F;
                int var42 = (var39 & 0x3E8) >> 5;
                class297 var43 = class178.method1226((byte) 120, var24);
                int var44 = (var40 << 19) + (var41 << 3) + (var42 << 11);
                if (var43.field5022 != var44) {
                    var43.field5022 = var44;
                    class318.method2209(123, var43);
                }
            } else if (var23 == 7) {
                class297 var37 = class178.method1226((byte) 124, var24);
                boolean var38 = var22.field1877 == 1;
                if (var38 != var37.field4954) {
                    var37.field4954 = var38;
                    class318.method2209(119, var37);
                }
            } else if (var23 == 8) {
                class297 var36 = class178.method1226((byte) 122, var24);
                if (var22.field1877 != var36.field4983 || var22.field1876 != var36.field5120 || var22.field1875 != var36.field4963) {
                    var36.field4983 = var22.field1877;
                    var36.field4963 = var22.field1875;
                    var36.field5120 = var22.field1876;
                    if (var36.field4995 != -1) {
                        if (var36.field4985 > 0) {
                            var36.field4963 = var36.field4963 * 32 / var36.field4985;
                        } else if (var36.field4976 > 0) {
                            var36.field4963 = var36.field4963 * 32 / var36.field4976;
                        }
                    }
                    class318.method2209(112, var36);
                }
            } else if (var23 == 9) {
                class297 var35 = class178.method1226((byte) 119, var24);
                if (var22.field1877 != var35.field4995 || var22.field1876 != var35.field5078) {
                    var35.field4995 = var22.field1877;
                    var35.field5078 = var22.field1876;
                    class318.method2209(127, var35);
                }
            } else if (var23 == 10) {
                class297 var30 = class178.method1226((byte) 121, var24);
                if (var22.field1877 != var30.field5064 || var22.field1876 != var30.field5070 || var22.field1875 != var30.field5089) {
                    var30.field5070 = var22.field1876;
                    var30.field5089 = var22.field1875;
                    var30.field5064 = var22.field1877;
                    class318.method2209(-69, var30);
                }
            } else if (var23 == 11) {
                class297 var31 = class178.method1226((byte) 124, var24);
                var31.field5118 = var31.field5130 = var22.field1877;
                var31.field5082 = 0;
                var31.field4961 = 0;
                var31.field5014 = var31.field4965 = var22.field1876;
                class318.method2209(110, var31);
            } else if (var23 == 12) {
                class297 var32 = class178.method1226((byte) 116, var24);
                int var33 = var22.field1877;
                if (var32 != null && var32.field4988 == 0) {
                    if (var33 > var32.field5058 - var32.field4996) {
                        var33 = var32.field5058 - var32.field4996;
                    }
                    if (var33 < 0) {
                        var33 = 0;
                    }
                    if (var32.field5012 != var33) {
                        var32.field5012 = var33;
                        class318.method2209(-71, var32);
                    }
                }
            } else if (var23 == 13) {
                class297 var34 = class178.method1226((byte) 124, var24);
                var34.field5042 = var22.field1877;
            }
        }
        if (class260.field4255 != 0) {
            class203.field3178 += 20;
            if (class203.field3178 >= 400) {
                class260.field4255 = 0;
            }
        }
        class25.field366++;
        if (class73.field1123 != null) {
            class224.field3557++;
            if (class224.field3557 >= 15) {
                class318.method2209(-30, class73.field1123);
                class73.field1123 = null;
            }
        }
        if (class140.field2138 != null) {
            class318.method2209(117, class140.field2138);
            if ((class50.field790 + 5) < class136.field2090 || class136.field2090 < class50.field790 - 5 || (class61.field986 + 5) < class259.field4235 || class61.field986 - 5 > class259.field4235) {
                class149.field2332 = true;
            }
            class308.field5304++;
            if (class310.field5325 == 0) {
                if (class149.field2332 && class308.field5304 >= 5) {
                    if (class67.field1058 == class140.field2138 && class272.field4537 != class163.field2538) {
                        class323.field5560++;
                        class297 var46 = class140.field2138;
                        byte var47 = 0;
                        if (class127.field1959 == 1 && var46.field4990 == 206) {
                            var47 = 1;
                        }
                        if (var46.field5060[class272.field4537] <= 0) {
                            var47 = 0;
                        }
                        if (client.method1730(var46).method2284(572878952)) {
                            int var50 = class163.field2538;
                            int var51 = class272.field4537;
                            var46.field5060[var51] = var46.field5060[var50];
                            var46.field5131[var51] = var46.field5131[var50];
                            var46.field5060[var50] = -1;
                            var46.field5131[var50] = 0;
                        } else if (var47 == 1) {
                            int var48 = class272.field4537;
                            int var49 = class163.field2538;
                            while (var48 != var49) {
                                if (var49 > var48) {
                                    var46.method2098(var49 - 1, var49, -71);
                                    var49--;
                                } else if (var48 > var49) {
                                    var46.method2098(var49 + 1, var49, -95);
                                    var49++;
                                }
                            }
                        } else {
                            var46.method2098(class272.field4537, class163.field2538, -93);
                        }
                        class114.field1789.method1431(0, 231);
                        class114.field1789.method643(-20037, class163.field2538);
                        class114.field1789.method624(class140.field2138.field5088, (byte) -125);
                        class114.field1789.method622(class272.field4537, -268435456);
                        class114.field1789.method582(10213, var47);
                    }
                } else if ((class28.field475 == 1 || class261.method1840(class126.field1955 - 1, 0)) && class126.field1955 > 2) {
                    class108.method768((byte) -116);
                } else if (class126.field1955 > 0) {
                    class158.method1073(56);
                }
                class277.field4639 = 0;
                class224.field3557 = 10;
                class140.field2138 = null;
            }
        }
        class123.field1913 = false;
        class322.field5544 = null;
        class168.field2596 = false;
        class323.field5556 = 0;
        class297 var52 = class204.field3193;
        class204.field3193 = null;
        class297 var53 = class318.field5445;
        class318.field5445 = null;
        while (class304.method2133(72) && class323.field5556 < 128) {
            class37.field616[class323.field5556] = class33.field562;
            class251.field4106[class323.field5556] = class309.field5319;
            class323.field5556++;
        }
        class66.field1033 = null;
        if (class250.field4095 != -1) {
            class300.method2115(0, 0, 2, 0, class38.field622, class250.field4095, 0, class141.field2153);
        }
        class74.field1144++;
        while (true) {
            class263 var54;
            class297 var55;
            class297 var56;
            do {
                var54 = (class263) class163.field2533.method262((byte) -3);
                if (var54 == null) {
                    while (true) {
                        class263 var57;
                        class297 var58;
                        class297 var59;
                        do {
                            var57 = (class263) class64.field1012.method262((byte) -3);
                            if (var57 == null) {
                                while (true) {
                                    class263 var60;
                                    class297 var61;
                                    class297 var62;
                                    do {
                                        var60 = (class263) class100.field1610.method262((byte) -3);
                                        if (var60 == null) {
                                            if (class66.field1033 == null) {
                                                class131.field1991 = 0;
                                            }
                                            if (class95.field1549 != null) {
                                                class163.method1116(-1);
                                            }
                                            if (class201.field3119 > 0 && class78.field1183[82] && class78.field1183[81] && class167.field2591 != 0) {
                                                int var63 = class279.field4651 - class167.field2591;
                                                if (var63 < 0) {
                                                    var63 = 0;
                                                } else if (var63 > 3) {
                                                    var63 = 3;
                                                }
                                                class41.method331(class13.field221.field3904[0] + class12.field157, class13.field221.field3890[0] + class165.field2568, var63, (byte) -4);
                                            }
                                            if (class201.field3119 > 0 && class78.field1183[82] && class78.field1183[81]) {
                                                if (class322.field5533 != -1) {
                                                    class41.method331(class322.field5533 + class12.field157, class165.field2568 - -class28.field477, class279.field4651, (byte) -4);
                                                }
                                                class78.field1219 = 0;
                                                class263.field4297 = 0;
                                            } else if (class263.field4297 == 2) {
                                                if (class322.field5533 != -1) {
                                                    class114.field1789.method1431(0, 131);
                                                    class276.field4607++;
                                                    class114.field1789.method598(-123, class29.field501);
                                                    class114.field1789.method622(class322.field5533 + class12.field157, -268435456);
                                                    class114.field1789.method604(class297.field5087, (byte) 3);
                                                    class114.field1789.method622(class28.field477 + class165.field2568, -268435456);
                                                    class260.field4255 = 1;
                                                    class203.field3178 = 0;
                                                    class304.field5243 = class11.field152;
                                                    class267.field4414 = class205.field3210;
                                                }
                                                class263.field4297 = 0;
                                            } else if (class78.field1219 == 2) {
                                                if (class322.field5533 != -1) {
                                                    class114.field1789.method1431(0, 179);
                                                    class114.field1789.method643(-20037, class28.field477 + class165.field2568);
                                                    class13.field193++;
                                                    class114.field1789.method643(-20037, class322.field5533 + class12.field157);
                                                    class203.field3178 = 0;
                                                    class260.field4255 = 1;
                                                    class267.field4414 = class205.field3210;
                                                    class304.field5243 = class11.field152;
                                                }
                                                class78.field1219 = 0;
                                            } else if (class322.field5533 != -1 && class263.field4297 == 0 && class78.field1219 == 0) {
                                                boolean var64 = class33.method269(class13.field221.field3890[0], 0, 0, true, 0, 2, class322.field5533, 0, 0, 0, class28.field477, class13.field221.field3904[0]);
                                                if (var64) {
                                                    class304.field5243 = class11.field152;
                                                    class203.field3178 = 0;
                                                    class267.field4414 = class205.field3210;
                                                    class260.field4255 = 1;
                                                }
                                            }
                                            class322.field5533 = -1;
                                            class205.method1384(-48);
                                            if (class204.field3193 != var52) {
                                                if (var52 != null) {
                                                    class318.method2209(-52, var52);
                                                }
                                                if (class204.field3193 != null) {
                                                    class318.method2209(119, class204.field3193);
                                                }
                                            }
                                            if (class318.field5445 != var53 && class222.field3523 == class201.field3122) {
                                                if (var53 != null) {
                                                    class318.method2209(112, var53);
                                                }
                                                if (class318.field5445 != null) {
                                                    class318.method2209(-22, class318.field5445);
                                                }
                                            }
                                            if (class318.field5445 == null) {
                                                if (class222.field3523 > 0) {
                                                    class222.field3523--;
                                                }
                                            } else if (class222.field3523 < class201.field3122) {
                                                class222.field3523++;
                                                if (class222.field3523 == class201.field3122) {
                                                    class318.method2209(-48, class318.field5445);
                                                }
                                            }
                                            if (class37.field614 == 1) {
                                                class22.method142((byte) 68);
                                            } else if (class37.field614 == 2) {
                                                class263.method1853(1024);
                                            } else {
                                                class120.method824(65535);
                                            }
                                            for (int var65 = 0; var65 < 5; var65++) {
                                                int var10002 = class139.field2124[var65]++;
                                            }
                                            int var66 = class165.method1120((byte) -43);
                                            int var67 = class112.method783((byte) -119);
                                            if (var66 > 15000 && var67 > 15000) {
                                                class80.field1262 = 250;
                                                class38.method315(112, 14500);
                                                class282.field4708++;
                                                class114.field1789.method1431(0, 245);
                                            }
                                            if (class316.field5417 != null && class316.field5417.field2811 == 1) {
                                                if (class316.field5417.field2812 != null) {
                                                    class67.method497(class185.field2881, (byte) 126, class26.field421);
                                                }
                                                class185.field2881 = null;
                                                class316.field5417 = null;
                                                class26.field421 = false;
                                            }
                                            class76.field1149++;
                                            class215.field3379++;
                                            class122.field1908++;
                                            if (class122.field1908 > 500) {
                                                class122.field1908 = 0;
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x4) == 4) {
                                                    class56.field921 += class244.field4008;
                                                }
                                                if ((var68 & 0x2) == 2) {
                                                    class61.field988 += class55.field872;
                                                }
                                                if ((var68 & 0x1) == 1) {
                                                    class113.field1781 += class189.field2967;
                                                }
                                            }
                                            if (class215.field3379 > 500) {
                                                class215.field3379 = 0;
                                                int var69 = (int) (Math.random() * 8.0D);
                                                if ((var69 & 0x1) == 1) {
                                                    class158.field2465 += class262.field4283;
                                                }
                                                if ((var69 & 0x2) == 2) {
                                                    class51.field797 += class127.field1971;
                                                }
                                            }
                                            if (class113.field1781 < -50) {
                                                class189.field2967 = 2;
                                            }
                                            if (class158.field2465 < -60) {
                                                class262.field4283 = 2;
                                            }
                                            if (class51.field797 < -20) {
                                                class127.field1971 = 1;
                                            }
                                            if (class61.field988 < -55) {
                                                class55.field872 = 2;
                                            }
                                            if (class61.field988 > 55) {
                                                class55.field872 = -2;
                                            }
                                            if (class56.field921 < -40) {
                                                class244.field4008 = 1;
                                            }
                                            if (class113.field1781 > 50) {
                                                class189.field2967 = -2;
                                            }
                                            if (class56.field921 > 40) {
                                                class244.field4008 = -1;
                                            }
                                            if (class51.field797 > 10) {
                                                class127.field1971 = -1;
                                            }
                                            if (class158.field2465 > 60) {
                                                class262.field4283 = -2;
                                            }
                                            if (class76.field1149 > 50) {
                                                class281.field4679++;
                                                class114.field1789.method1431(0, 93);
                                            }
                                            if (class236.field3790) {
                                                class45.method347(0);
                                                class236.field3790 = false;
                                            }
                                            try {
                                                if (class88.field1449 != null && class114.field1789.field1301 > 0) {
                                                    class88.field1449.method2014(!arg0, 0, class114.field1789.field1280, class114.field1789.field1301);
                                                    class76.field1149 = 0;
                                                    class114.field1789.field1301 = 0;
                                                }
                                            } catch (IOException var71) {
                                                class185.method1270(false);
                                            }
                                            return;
                                        }
                                        var61 = var60.field4307;
                                        if (var61.field4994 < 0) {
                                            break;
                                        }
                                        var62 = class178.method1226((byte) 118, var61.field4993);
                                    } while (var62 == null || var62.field5068 == null || var61.field4994 >= var62.field5068.length || var62.field5068[var61.field4994] != var61);
                                    class215.method1442(1073376993, var60);
                                }
                            }
                            var58 = var57.field4307;
                            if (var58.field4994 < 0) {
                                break;
                            }
                            var59 = class178.method1226((byte) 120, var58.field4993);
                        } while (var59 == null || var59.field5068 == null || var59.field5068.length <= var58.field4994 || var59.field5068[var58.field4994] != var58);
                        class215.method1442(1073376993, var57);
                    }
                }
                var55 = var54.field4307;
                if (var55.field4994 < 0) {
                    break;
                }
                var56 = class178.method1226((byte) 127, var55.field4993);
            } while (var56 == null || var56.field5068 == null || var55.field4994 >= var56.field5068.length || var56.field5068[var55.field4994] != var55);
            class215.method1442(1073376993, var54);
        }
    }
}
