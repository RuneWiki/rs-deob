import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class176 {

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field2603 = 0;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "Z")
    public static boolean field2605 = false;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2602 = "scroll:";

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "Z")
    public static boolean field2610 = false;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "[I")
    public static int[] field2606 = new int[32];

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Llm;")
    public static class210 field2604;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "Lfa;")
    public static class95 field2601;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLlm;II)[Lbk;", line = 10)
    public static final class157[] method1217(byte arg0, class210 arg1, int arg2, int arg3) {
        field2611++;
        if (arg0 == 53) {
            return class249.method1680(arg2, arg1, arg3, (byte) 116) ? class272.method1919(true) : null;
        } else {
            return (class157[]) null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 27)
    public static final void method1218(byte arg0) {
        field2608++;
        for (int var1 = 0; var1 < class168.field2522; var1++) {
            int var10002 = class201.field3003[var1]--;
            if (class201.field3003[var1] >= -10) {
                class65 var3 = class48.field608[var1];
                if (var3 == null) {
                    var3 = class65.method431(class113.field1744, class116.field1783[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class201.field3003[var1] += var3.method429();
                    class48.field608[var1] = var3;
                }
                if (class201.field3003[var1] < 0) {
                    int var4;
                    if (class309.field4693[var1] == 0) {
                        var4 = class287.field4341;
                    } else {
                        int var5 = (class309.field4693[var1] & 0xFF) * 128;
                        int var6 = class309.field4693[var1] >> 16 & 0xFF;
                        int var7 = var6 * 128 - (class114.field1750.field1566 - 64);
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = class309.field4693[var1] >> 8 & 0xFF;
                        int var9 = var8 * 128 + 64 - class114.field1750.field1505;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var10 > var5) {
                            class201.field3003[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class272.field4183 / var5;
                    }
                    if (var4 > 0) {
                        class220 var11 = var3.method432().method1547(class185.field2766);
                        class219 var12 = class219.method1515(var11, 100, var4);
                        var12.method1533(class81.field1145[var1] - 1);
                        class72.field936.method2234(var12);
                    }
                    class201.field3003[var1] = -100;
                }
            } else {
                class168.field2522--;
                for (int var2 = var1; var2 < class168.field2522; var2++) {
                    class116.field1783[var2] = class116.field1783[var2 + 1];
                    class48.field608[var2] = class48.field608[var2 + 1];
                    class81.field1145[var2] = class81.field1145[var2 + 1];
                    class201.field3003[var2] = class201.field3003[var2 + 1];
                    class309.field4693[var2] = class309.field4693[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 != 46) {
            field2604 = (class210) null;
        }
        if (class146.field2205 && !class43.method283(2)) {
            if (class115.field1760 != 0 && class195.field2943 != -1) {
                class104.method732(0, class195.field2943, class48.field613, class115.field1760, arg0 ^ 0xFFFFFFAD, false);
            }
            class146.field2205 = false;
        } else if (class115.field1760 != 0 && class195.field2943 != -1 && !class43.method283(arg0 ^ 0x2C)) {
            class234.field3507.method28(50, false);
            class150.field2250++;
            class234.field3507.method1815(97, class195.field2943);
            class195.field2943 = -1;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IILqg;I)V", line = 156)
    public static final void method1219(int arg0, int arg1, class195 arg2, int arg3) {
        field2607++;
        if ((arg3 & 0x80) != 0) {
            arg2.field1499 = class207.field3137.method1838((byte) 2);
            arg2.field1545 = class207.field3137.method1794(-121);
        }
        if (arg0 > -57) {
            return;
        }
        if ((arg3 & 0x100) != 0) {
            int var4 = class207.field3137.method1830((byte) -77);
            int var5 = class207.field3137.method1819(-1);
            boolean var6 = true;
            if (var4 == 65535) {
                var4 = -1;
            }
            if (var4 != -1 && arg2.field1490 != -1 && class72.method468(class8.method31(var4, (byte) -126).field615, 44).field4158 < class72.method468(class8.method31(arg2.field1490, (byte) -126).field615, -125).field4158) {
                var6 = false;
            }
            if (var6) {
                arg2.field1514 = (var5 & 0xFFFF) + class304.field4641;
                arg2.field1490 = var4;
                arg2.field1550 = 1;
                arg2.field1563 = 0;
                arg2.field1561 = var5 >> 16;
                arg2.field1529 = 0;
                if (arg2.field1514 > class304.field4641) {
                    arg2.field1563 = -1;
                }
                if (arg2.field1490 != -1 && class304.field4641 == arg2.field1514) {
                    int var7 = class8.method31(arg2.field1490, (byte) -126).field615;
                    if (var7 != -1) {
                        class272 var8 = class72.method468(var7, -123);
                        if (var8 != null && var8.field4160 != null) {
                            class167.method1170(arg2.field1505, var8, 0, -64, arg2.field1566, class114.field1750 == arg2);
                        }
                    }
                }
            }
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field1508 = class207.field3137.method1830((byte) -77);
            if (arg2.field1508 == 65535) {
                arg2.field1508 = -1;
            }
        }
        if ((arg3 & 0x8) != 0) {
            int var9 = class207.field3137.method1835(false);
            if (var9 == 65535) {
                var9 = -1;
            }
            int var10 = class207.field3137.method1849(72);
            class157.method1120((byte) -82, arg2, var9, var10);
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field1526 = class207.field3137.method1801(-30054);
            if (arg2.field1526.charAt(0) == '~') {
                arg2.field1526 = arg2.field1526.substring(1);
                class92.method656(2, arg2.field1526, arg2.method1344(-1), -1);
            } else if (class114.field1750 == arg2) {
                class92.method656(2, arg2.field1526, arg2.method1344(-1), -1);
            }
            arg2.field1509 = 0;
            arg2.field1488 = 0;
            arg2.field1511 = 150;
        }
        if ((arg3 & 0x40) != 0) {
            int var11 = class207.field3137.method1835(false);
            int var12 = class207.field3137.method1787(false);
            int var13 = class207.field3137.method1790(128);
            int var14 = class207.field3137.field4025;
            boolean var15 = (var11 & 0x8000) != 0;
            if (arg2.field2934 != null && arg2.field2912 != null) {
                long var16 = class242.method1638(arg2.field2934, -14393);
                boolean var18 = false;
                if (var12 <= 1) {
                    if (var15 || (!class261.field3955 || class70.field927) && !class154.field2311) {
                        for (int var19 = 0; var19 < class247.field3687; var19++) {
                            if (class212.field3220[var19] == var16) {
                                var18 = true;
                                break;
                            }
                        }
                    } else {
                        var18 = true;
                    }
                }
                if (!var18 && class121.field1895 == 0) {
                    class288.field4347.field4025 = 0;
                    class207.field3137.method1808(0, var13, (byte) -99, class288.field4347.field3986);
                    class288.field4347.field4025 = 0;
                    int var20 = -1;
                    String var21;
                    if (var15) {
                        var11 &= 0x7FFF;
                        class189 var22 = class22.method141(class288.field4347, 102);
                        var20 = var22.field2817;
                        var21 = var22.field2813.method63(class288.field4347, true);
                    } else {
                        var21 = class89.method610(class212.method1471(0, class68.method451(class288.field4347, (byte) -104)));
                    }
                    arg2.field1526 = var21.trim();
                    arg2.field1509 = var11 >> 8;
                    arg2.field1511 = 150;
                    arg2.field1488 = var11 & 0xFF;
                    if (var12 == 2) {
                        class189.method1289(var15 ? 17 : 1, var21, "<img=1>" + arg2.method1344(-1), (byte) -95, (String) null, var20);
                    } else if (var12 == 1) {
                        class189.method1289(var15 ? 17 : 1, var21, "<img=0>" + arg2.method1344(-1), (byte) -95, (String) null, var20);
                    } else {
                        class189.method1289(var15 ? 17 : 2, var21, arg2.method1344(-1), (byte) -95, (String) null, var20);
                    }
                }
            }
            class207.field3137.field4025 = var13 + var14;
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field1525 = class207.field3137.method1849(-97);
            arg2.field1556 = class207.field3137.method1790(128);
            arg2.field1493 = class207.field3137.method1787(false);
            arg2.field1568 = class207.field3137.method1807(115);
            arg2.field1547 = class207.field3137.method1838((byte) 123) + class304.field4641;
            arg2.field1537 = class207.field3137.method1794(-113) + class304.field4641;
            arg2.field1523 = class207.field3137.method1787(false);
            arg2.field1569 = 0;
            arg2.field1483 = 1;
        }
        if ((arg3 & 0x2) != 0) {
            int var23 = class207.field3137.method1832(-32768);
            int var24 = class207.field3137.method1849(-61);
            arg2.method700(var23, class304.field4641, -126, var24);
            arg2.field1532 = class304.field4641 + 300;
            arg2.field1503 = class207.field3137.method1787(false);
        }
        if ((arg3 & 0x20) != 0) {
            int var25 = class207.field3137.method1849(-112);
            byte[] var26 = new byte[var25];
            class263 var27 = new class263(var26);
            class207.field3137.method1792(-62, var26, var25, 0);
            class295.field4526[arg1] = var27;
            arg2.method1346((byte) 68, var27);
        }
        if ((arg3 & 0x800) != 0) {
            int var28 = class207.field3137.method1790(128);
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            for (int var32 = 0; var32 < var28; var32++) {
                int var33 = class207.field3137.method1830((byte) -77);
                if (var33 == 65535) {
                    var33 = -1;
                }
                var30[var32] = var33;
                var31[var32] = class207.field3137.method1807(100);
                var29[var32] = class207.field3137.method1838((byte) 102);
            }
            class144.method1026(var31, var29, false, arg2, var30);
        }
        if ((arg3 & 0x400) != 0) {
            int var34 = class207.field3137.method1832(-32768);
            int var35 = class207.field3137.method1787(false);
            arg2.method700(var34, class304.field4641, -124, var35);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lre;I)V", line = 445)
    public static final void method1220(class263 arg0, int arg1) {
        field2600++;
        for (int var2 = arg1; var2 < class61.field813; var2++) {
            int var3 = arg0.method1832(-32768);
            int var4 = arg0.method1830((byte) -77);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class74.field962[var3] != null) {
                class74.field962[var3].field165 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 474)
    public static void method1221(int arg0) {
        field2601 = null;
        field2604 = null;
        field2602 = null;
        if (arg0 != 0) {
            method1221(8);
        }
        field2606 = null;
    }
}
