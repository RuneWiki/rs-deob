import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class353 {

    @OriginalMember(owner = "client!th", name = "g", descriptor = "B")
    public byte field5438;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public int field5439;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "Ljava/lang/String;")
    public String field5440;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "Ljava/lang/String;")
    public String field5444;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "Ljava/lang/String;")
    public String field5445;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "[I")
    public static int[] field5441;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)V", line = 6)
    public static final void method2296(int arg0, byte arg1) {
        field5437++;
        class196.field3181.method337(arg0, (byte) -119);
        if (arg1 > -106) {
            method2300((class279) null, (byte) 42);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V", line = 19)
    public static final void method2297(boolean arg0) {
        if (arg0) {
            method2299(29);
        }
        for (int var1 = 0; var1 < class21.field274; var1++) {
            int var2 = class208.field3349[var1];
            class50 var3 = class39.field499[var2];
            int var4 = class158.field2514.method1322(arg0);
            if ((var4 & 0x20) != 0) {
                var4 += class158.field2514.method1322(false) << 8;
            }
            if ((var4 & 0x200) != 0) {
                var3.field1848 = class158.field2514.method1272((byte) -105);
                var3.field1844 = class158.field2514.method1272((byte) -105);
            }
            if ((var4 & 0x4) != 0) {
                if (var3.field615.method1624((byte) 31)) {
                    class337.method2222(arg0, var3);
                }
                var3.method316(class395.method2493(arg0, class158.field2514.method1314(!arg0)), 0);
                var3.method910(var3.field615.field3779, -13034);
                var3.field1833 = var3.field615.field3753 << 3;
                if (var3.field615.method1624((byte) -120)) {
                    class224.method1609(var3.field1906[0], (class219) null, class266.field4286, 0, var3, (class127) null, 8500, var3.field1916[0]);
                }
            }
            if ((var4 & 0x400) != 0) {
                int var5 = class158.field2514.method1322(false);
                int[] var6 = new int[var5];
                int[] var7 = new int[var5];
                int[] var8 = new int[var5];
                for (int var9 = 0; var9 < var5; var9++) {
                    int var10 = class158.field2514.method1314(true);
                    if (var10 == 65535) {
                        var10 = -1;
                    }
                    var6[var9] = var10;
                    var7[var9] = class158.field2514.method1322(false);
                    var8[var9] = class158.field2514.method1279(255);
                }
                class298.method2016(var7, -30076, var8, var6, var3);
            }
            if ((var4 & 0x80) != 0) {
                var3.field1832 = class158.field2514.method1273((byte) -27);
                if (var3.field1832 == 65535) {
                    var3.field1832 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                int var11 = class158.field2514.method1314(true);
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = class158.field2514.method1326(true);
                boolean var13 = true;
                if (var11 != -1 && var3.field1873 != -1) {
                    if (var3.field1873 == var11) {
                        class379 var18 = class115.method839((byte) -57, var11);
                        if (var18.field5731 && var18.field5734 != -1) {
                            class417 var19 = class156.method1099(var18.field5734, 74);
                            int var20 = var19.field6172;
                            if (var20 == 0) {
                                var13 = false;
                            } else if (var20 == 1) {
                                var13 = true;
                            } else if (var20 == 2) {
                                var3.field1858 = 0;
                                var13 = false;
                            }
                        }
                    } else {
                        class379 var14 = class115.method839((byte) -57, var11);
                        class379 var15 = class115.method839((byte) -57, var3.field1873);
                        if (var14.field5734 != -1 && var15.field5734 != -1) {
                            class417 var16 = class156.method1099(var14.field5734, 61);
                            class417 var17 = class156.method1099(var15.field5734, 79);
                            if (var16.field6166 < var17.field6166) {
                                var13 = false;
                            }
                        }
                    }
                }
                if (var13) {
                    var3.field1866 = 0;
                    var3.field1867 = 1;
                    var3.field1826 = var12 >> 16;
                    var3.field1886 = class183.field2987 + (var12 & 0xFFFF);
                    var3.field1879 = 0;
                    var3.field1873 = var11;
                    if (var3.field1886 > class183.field2987) {
                        var3.field1879 = -1;
                    }
                    if (var3.field1873 != -1 && class183.field2987 == var3.field1886) {
                        int var21 = class115.method839((byte) -57, var3.field1873).field5734;
                        if (var21 != -1) {
                            class417 var22 = class156.method1099(var21, 115);
                            if (var22 != null && var22.field6177 != null) {
                                class196.method1374(var3.field722, (byte) -104, 0, var3.field724, false, var22);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x40) != 0) {
                int var23 = class158.field2514.method1299(-113);
                int var24 = class158.field2514.method1322(false);
                var3.method913(var24, class183.field2987, -5, var23);
            }
            if ((var4 & 0x2) != 0) {
                var3.field1823 = class158.field2514.method1270(-9970);
                var3.field1846 = 100;
            }
            if ((var4 & 0x1) != 0) {
                int var25 = class158.field2514.method1299(-94);
                int var26 = class158.field2514.method1322(arg0);
                var3.method913(var26, class183.field2987, -5, var25);
                var3.field1863 = class183.field2987 + 300;
                var3.field1884 = class158.field2514.method1287(false);
            }
            if ((var4 & 0x100) != 0) {
                int var27 = class158.field2514.method1279(255);
                var3.field1822 = class158.field2514.method1285((byte) -33);
                var3.field1856 = class158.field2514.method1285((byte) -33);
                var3.field1877 = (var27 & 0x8000) != 0;
                var3.field1887 = var27 & 0x7FFF;
                var3.field1820 = class183.field2987 + var3.field1822 + var3.field1887;
            }
            if ((var4 & 0x8) != 0) {
                int var28 = class158.field2514.method1279(255);
                if (var28 == 65535) {
                    var28 = -1;
                }
                int var29 = class158.field2514.method1313(-36);
                class223.method1599(var28, var3, -27449, var29);
            }
        }
        field5433++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V", line = 265)
    public static final void method2298(int arg0) {
        class191.field3116.method336(arg0 ^ 0x663E);
        if (arg0 != -26235) {
            field5441 = null;
        }
        field5432++;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V", line = 278)
    public static void method2299(int arg0) {
        field5441 = null;
        if (arg0 != 1) {
            field5441 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lap;B)[Lwa;", line = 294)
    public static final class364[] method2300(class279 arg0, byte arg1) {
        field5434++;
        if (!arg0.method1896(true)) {
            return new class364[0];
        }
        class26 var2 = arg0.method1889(0);
        if (arg1 <= 99) {
            method2301(-124, -38);
        }
        while (var2.field304 == 0) {
            class84.method517((byte) -17, 10L);
        }
        if (var2.field304 == 2) {
            return new class364[0];
        }
        int[] var3 = (int[]) var2.field305;
        class364[] var4 = new class364[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class364 var6 = new class364();
            var4[var5] = var6;
            var6.field5540 = var3[var5 << 2];
            var6.field5544 = var3[(var5 << 2) + 1];
            var6.field5545 = var3[(var5 << 2) + 2];
            var6.field5539 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V", line = 335)
    public static final void method2301(int arg0, int arg1) {
        field5443++;
        class211 var2 = class281.method1921(4, arg0, (byte) -110);
        var2.method1489((byte) -100);
        if (arg1 >= -6) {
            field5441 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 352)
    public static final String method2302(long arg0, int arg1) {
        field5442++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class250.field4084[(int) (var7 - arg0 * 37L)]);
            }
            if (arg1 != 4) {
                method2299(-126);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(Z)Z", line = 390)
    public static final boolean method2303(boolean arg0) {
        field5435++;
        if (arg0) {
            method2296(120, (byte) -12);
        }
        try {
            return class81.method506(237);
        } catch (IOException var4) {
            class342.method2248(-1);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class208.field3345 + "," + class281.field4507 + "," + class433.field6397 + " - " + class345.field5331 + "," + (class261.field4201.field1906[0] + class409.field6048) + "," + (class261.field4201.field1916[0] + class444.field6481) + " - ";
            for (int var3 = 0; var3 < class345.field5331 && var3 < 50; var3++) {
                var2 = var2 + class158.field2514.field3066[var3] + ",";
            }
            class272.method1845(var5, 125, var2);
            class392.method2474((byte) 115);
            return true;
        }
    }
}
