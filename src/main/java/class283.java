import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class283 extends class112 {

    @OriginalMember(owner = "client!j", name = "L", descriptor = "I")
    public static volatile int field4812 = 0;

    @OriginalMember(owner = "client!j", name = "N", descriptor = "Lm;")
    public static class48 field4814 = new class48();

    @OriginalMember(owner = "client!j", name = "K", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!j", name = "M", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!j", name = "O", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!j", name = "R", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!j", name = "S", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!j", name = "T", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!j", name = "U", descriptor = "[I")
    public static int[] field4821;

    @OriginalMember(owner = "client!j", name = "V", descriptor = "[Z")
    public static boolean[] field4822;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)V", line = 15)
    public static final void method1916(int arg0, int arg1) {
        class34 var2 = class287.field4857[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class34 var4 = class287.field4857[var3][arg0][arg1] = class287.field4857[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field565--;
                for (int var5 = 0; var5 < var4.field579; var5++) {
                    class248 var6 = var4.field580[var5];
                    if ((var6.field4156 >> 29 & 0x3L) == 2L && var6.field4157 == arg0 && var6.field4151 == arg1) {
                        var6.field4145--;
                    }
                }
            }
        }
        if (class287.field4857[0][arg0][arg1] == null) {
            class287.field4857[0][arg0][arg1] = new class34(0, arg0, arg1);
        }
        class287.field4857[0][arg0][arg1].field582 = var2;
        class287.field4857[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(I)V", line = 53)
    public static final void method1917(int arg0) {
        field4820++;
        for (class85 var1 = (class85) class134.field2063.method1221((byte) 127); var1 != null; var1 = (class85) class134.field2063.method1223(85)) {
            if (var1.field1192 == -1) {
                var1.field1179 = 0;
                class42.method296(var1, (byte) -125);
            } else {
                var1.method1880(-25368);
            }
        }
        if (arg0 <= 23) {
            method1922(-39, (class127[]) null, -38);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIZIIIII)V", line = 90)
    public static final void method1918(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4817++;
        if (arg2 || arg0 < 1 || arg7 < 1 || arg0 > 102 || arg7 > 102) {
            return;
        }
        if (!class296.method2044(-117) && (class70.field1026[0][arg0][arg7] & 0x2) == 0) {
            int var8 = arg6;
            if ((class70.field1026[arg6][arg0][arg7] & 0x8) != 0) {
                var8 = 0;
            }
            if (class267.field4501 != var8) {
                return;
            }
        }
        int var9 = arg6;
        if (arg6 < 3 && (class70.field1026[1][arg0][arg7] & 0x2) == 2) {
            var9 = arg6 + 1;
        }
        class290.method1949(var9, arg6, arg4, arg0, class135.field2076[arg6], true, arg7);
        if (arg1 >= 0) {
            boolean var10 = class199.field3209;
            class199.field3209 = true;
            class169.method1113(arg1, arg6, false, arg5, arg3, class135.field2076[arg6], false, var9, arg7, arg0, 115);
            class199.field3209 = var10;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BI)[I", line = 138)
    public final int[] method53(byte arg0, int arg1) {
        if (arg0 != -3) {
            field4814 = (class48) null;
        }
        field4815++;
        int[] var3 = this.field1585.method1952(arg1, (byte) 86);
        if (this.field1585.field4935) {
            class187.method1245(var3, 0, class58.field889, class114.field1620[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "i", descriptor = "(I)I", line = 161)
    public static final int method1919(int arg0) {
        field4811++;
        if (arg0 != 50) {
            return -22;
        } else if ((double) class213.field3484 == 3.0D) {
            return 37;
        } else if ((double) class213.field3484 == 4.0D) {
            return 50;
        } else if ((double) class213.field3484 == 6.0D) {
            return 75;
        } else if ((double) class213.field3484 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V", line = 187)
    public class283() {
        super(0, true);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)Lnb;", line = 192)
    public static final class313 method1920(int arg0, byte arg1) {
        field4813++;
        class313 var2 = (class313) class223.field3631.method1620(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -7) {
            field4814 = (class48) null;
        }
        byte[] var3 = class294.field5021.method1381(3, arg0, 0);
        class313 var4 = new class313();
        if (var3 != null) {
            var4.method2190(new class291(var3), 0);
        }
        class223.field3631.method1614(var4, (long) arg0, (byte) 78);
        return var4;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V", line = 218)
    public static final void method1921(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class245.field4102.field4946 = 0;
        class245.field4102.method1980(false, 86);
        class245.field4102.method1980(false, arg1);
        field4816++;
        class245.field4102.method1980(false, arg0);
        class245.field4102.method1994(arg3, 2921);
        class245.field4102.method1994(arg2, 2921);
        class12.field155 = 0;
        class141.field2156 = arg4;
        class28.field477 = -3;
        class201.field3243 = 0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I[Loe;I)V", line = 236)
    public static final void method1922(int arg0, class127[] arg1, int arg2) {
        field4819++;
        int var3 = 0;
        if (arg2 != -11258) {
            return;
        }
        while (arg1.length > var3) {
            class127 var4 = arg1[var3];
            if (var4 != null && var4.field1836 == arg0 && (!var4.field1794 || !client.method1758(var4))) {
                label119: {
                    if (var4.field1902 == 0) {
                        if (!var4.field1794 && client.method1758(var4) && class120.field1694 != var4) {
                            break label119;
                        }
                        method1922(var4.field1868, arg1, -11258);
                        if (var4.field1937 != null) {
                            method1922(var4.field1868, var4.field1937, -11258);
                        }
                        class122 var5 = (class122) class107.field1519.method1586((long) var4.field1868, -85);
                        if (var5 != null) {
                            class206.method1391(1, var5.field1724);
                        }
                    }
                    if (var4.field1902 == 6) {
                        if (var4.field1943 != -1 || var4.field1778 != -1) {
                            boolean var6 = class54.method359(var4, 512);
                            int var7;
                            if (var6) {
                                var7 = var4.field1778;
                            } else {
                                var7 = var4.field1943;
                            }
                            if (var7 != -1) {
                                class141 var8 = class133.method851(var7, 112);
                                if (var8 != null) {
                                    var4.field1800 += class277.field4740;
                                    while (var4.field1800 > var8.field2150[var4.field1795]) {
                                        var4.field1800 -= var8.field2150[var4.field1795];
                                        var4.field1795++;
                                        if (var8.field2177.length <= var4.field1795) {
                                            var4.field1795 -= var8.field2162;
                                            if (var4.field1795 < 0 || var8.field2177.length <= var4.field1795) {
                                                var4.field1795 = 0;
                                            }
                                        }
                                        var4.field1874 = var4.field1795 + 1;
                                        if (var4.field1874 >= var8.field2177.length) {
                                            var4.field1874 -= var8.field2162;
                                            if (var4.field1874 < 0 || var8.field2177.length <= var4.field1874) {
                                                var4.field1874 = -1;
                                            }
                                        }
                                        class272.method1868(22889, var4);
                                    }
                                }
                            }
                        }
                        if (var4.field1834 != 0 && !var4.field1794) {
                            int var9 = var4.field1834 >> 16;
                            int var10 = class277.field4740 * var9;
                            int var11 = var4.field1834 << 16 >> 16;
                            int var12 = class277.field4740 * var11;
                            var4.field1813 = var4.field1813 + var12 & 0x7FF;
                            var4.field1820 = var4.field1820 + var10 & 0x7FF;
                            class272.method1868(22889, var4);
                        }
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V", line = 359)
    public static void method1923(byte arg0) {
        if (arg0 == 90) {
            field4821 = null;
            field4822 = null;
            field4814 = null;
        }
    }
}
