import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class88 {

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Lpe;")
    public static class109 field1857 = class141.method1120("compass", 0);

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field1861 = 0;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field1864 = 0;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Lcd;")
    public static class19 field1863 = new class19();

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field1865 = 0;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "Lpe;")
    public static class109 field1867 = class141.method1120(" )2> <col=ffffff>", 0);

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field1866 = 0;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "[S")
    public static short[] field1871 = new short[] { -1, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Lpe;")
    public static class109 field1868 = class141.method1120("Cabbage", 0);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "Lpc;")
    public static class107 field1869;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static void method727(int arg0) {
        field1857 = null;
        field1868 = null;
        field1863 = null;
        field1867 = null;
        field1871 = null;
        field1869 = null;
        if (arg0 >= -12) {
            field1868 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIB)I")
    public static final int method728(int arg0, int arg1, byte arg2) {
        field1859++;
        if (arg0 < arg1) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        if (arg2 != 27) {
            method731(-22);
        }
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)Lpe;")
    public static final class109 method729(int arg0, byte arg1) {
        if (arg1 > -41) {
            return null;
        } else {
            field1860++;
            return arg0 < 999999999 ? class143.method1132(arg0, 96) : class19.field464;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILl;)V")
    public static final void method730(int arg0, class76 arg1) {
        field1856++;
        if (class79.field1660) {
            class76.method604(arg1, arg0 ^ 0x3E);
            return;
        }
        if (class19.field484 == 1 && class115.field2538 >= 715 && class120.field2671 >= 453) {
            class43.field903 = !class43.field903;
            if (class43.field903) {
                class45.method408(-65);
            } else {
                class20.method205(class107.field2241, false, arg0 - 31709, 255, class72.field1473, class3.field74);
            }
        }
        if (class153.field3373 == 5) {
            return;
        }
        class126.field2804++;
        if (arg0 != -2) {
            field1865 = -57;
        }
        if (class153.field3373 != 10) {
            return;
        }
        if (class86.field1833 != 2 && class89.field1887 == 0) {
            if (class19.field484 == 1) {
                byte var2 = 35;
                byte var3 = 100;
                short var4 = 463;
                byte var5 = 5;
                if (class115.field2538 >= var5 && class115.field2538 <= var3 + var5 && var4 <= class120.field2671 && var2 + var4 >= class120.field2671) {
                    class149.method1169(94);
                    return;
                }
            }
            if (class125.field2756 != null) {
                class149.method1169(arg0 + 103);
            }
        }
        int var6 = class115.field2538;
        int var7 = class19.field484;
        int var8 = class120.field2671;
        if (class145.field3187 == 0) {
            short var17 = 291;
            short var18 = 302;
            if (var7 == 1 && var6 >= var18 - 75 && var18 + 75 >= var6 && var8 >= var17 - 20 && var17 + 20 >= var8) {
                class145.field3187 = 3;
                class123.field2715 = 0;
            }
            short var19 = 462;
            if (var7 != 1 || var19 - 75 > var6 || var6 > var19 + 75 || var8 < var17 - 20 || var8 > var17 + 20) {
                return;
            }
            class145.field3187 = 2;
            class72.field1477 = class25.field615;
            class72.field1456 = class76.field1567;
            class123.field2715 = 0;
            class72.field1475 = class76.field1522;
            return;
        }
        if (class145.field3187 == 2) {
            short var9 = 231;
            int var20 = var9 + 30;
            if (var7 == 1 && var20 - 15 <= var8 && var8 < var20) {
                class123.field2715 = 0;
            }
            short var10 = 302;
            var20 += 15;
            short var11 = 321;
            if (var7 == 1 && var20 - 15 <= var8 && var20 > var8) {
                class123.field2715 = 1;
            }
            var20 += 15;
            if (var7 == 1 && var10 - 75 <= var6 && var10 + 75 >= var6 && var11 - 20 <= var8 && var8 <= var11 + 20) {
                class72.field1468 = class72.field1468.method877(arg0 ^ 0xFFFFFF8C).method902((byte) 42);
                if (class72.field1468.method898((byte) 121) == 0) {
                    class49.method421(class122.field2697, -8453, class76.field1580, class76.field1575);
                    return;
                }
                if (class72.field1478.method898((byte) 126) == 0) {
                    class49.method421(class135.field2949, arg0 - 8451, class76.field1582, class76.field1523);
                    return;
                }
                class49.method421(class131.field2875, arg0 - 8451, class76.field1583, class76.field1581);
                class118.method958(false, 20);
                return;
            }
            short var12 = 462;
            if (var7 == 1 && var6 >= var12 - 75 && var12 + 75 >= var6 && var11 - 20 <= var8 && var11 + 20 >= var8) {
                class72.field1478 = class72.field1473;
                class145.field3187 = 0;
                class72.field1468 = class72.field1473;
            }
            while (true) {
                while (class137.method1088(false)) {
                    boolean var13 = false;
                    for (int var14 = 0; var14 < class139.field3029.method898((byte) 125); var14++) {
                        if (class113.field2467 == class139.field3029.method906(var14, false)) {
                            var13 = true;
                            break;
                        }
                    }
                    if (class123.field2715 == 0) {
                        if (class86.field1831 == 85 && class72.field1468.method898((byte) 124) > 0) {
                            class72.field1468 = class72.field1468.method872(class72.field1468.method898((byte) 127) - 1, -122, 0);
                        }
                        if (class86.field1831 == 84 || class86.field1831 == 80) {
                            class123.field2715 = 1;
                        }
                        if (var13 && class72.field1468.method898((byte) 127) < 12) {
                            class72.field1468 = class72.field1468.method871(false, class113.field2467);
                        }
                    } else if (class123.field2715 == 1) {
                        if (class86.field1831 == 85 && class72.field1478.method898((byte) 126) > 0) {
                            class72.field1478 = class72.field1478.method872(class72.field1478.method898((byte) 122) - 1, arg0 ^ 0x7D, 0);
                        }
                        if (class86.field1831 == 84 || class86.field1831 == 80) {
                            class123.field2715 = 0;
                        }
                        if (class83.field1774 == 2 && class86.field1831 == 84) {
                            class72.field1468 = class72.field1468.method877(arg0 ^ 0xFFFFFF9E).method902((byte) 42);
                            if (class72.field1468.method898((byte) 126) == 0) {
                                class49.method421(class122.field2697, -8453, class76.field1580, class76.field1575);
                                return;
                            }
                            if (class72.field1478.method898((byte) 123) == 0) {
                                class49.method421(class135.field2949, -8453, class76.field1582, class76.field1523);
                                return;
                            }
                            class49.method421(class131.field2875, -8453, class76.field1583, class76.field1581);
                            class118.method958(false, 20);
                            return;
                        }
                        if (var13 && class72.field1478.method898((byte) 127) < 20) {
                            class72.field1478 = class72.field1478.method871(false, class113.field2467);
                        }
                    }
                }
                return;
            }
        }
        if (class145.field3187 != 3) {
            return;
        }
        short var15 = 382;
        short var16 = 321;
        if (var7 == 1 && var6 >= var15 - 75 && var6 <= var15 + 75 && var8 >= var16 - 20 && var16 + 20 >= var8) {
            class145.field3187 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public static final void method731(int arg0) {
        if (arg0 != 0) {
            field1864 = -34;
        }
        for (class79 var1 = (class79) class134.field2916.method508(-90); var1 != null; var1 = (class79) class134.field2916.method506((byte) 127)) {
            int var2 = var1.field1655;
            if (class113.method941(var2, (byte) -85)) {
                boolean var3 = true;
                class154[] var4 = class114.field2525[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field3473;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field267;
                    class154 var7 = class44.method403(var6, true);
                    if (var7 != null) {
                        class138.method1092(0, var7);
                    }
                }
            }
        }
        field1862++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method732(byte arg0, byte[] arg1) {
        field1858++;
        int var2 = 83 / ((-arg0 - 84) / 36);
        int var3 = arg1.length;
        byte[] var4 = new byte[var3];
        class26.method237(arg1, 0, var4, 0, var3);
        return var4;
    }
}
