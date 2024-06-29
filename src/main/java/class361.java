import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class361 extends class194 {

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    private int field4886 = 4096;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
    private int field4884 = 0;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "[Z")
    public static boolean[] field4893 = new boolean[100];

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "[C")
    public static char[] field4890 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V")
    public static final void method2267(byte arg0) {
        if (arg0 >= 28) {
            if (~class174.field2017 == -11) {
                class259.method1637(28, (byte) 79);
            }
            ++field4895;
            if (class174.field2017 == 30) {
                class259.method1637(25, (byte) 79);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)I")
    public static final int method2268(byte arg0, int arg1) {
        ++field4891;
        if (arg0 > -41) {
            method2272(-83, 4, -48);
        }
        return arg1 & 255;
    }

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "(I)V")
    public static void method2269(int arg0) {
        field4893 = null;
        field4890 = null;
        if (arg0 != -18519) {
            method2271((byte) 62);
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class361() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)[[I")
    public final int[][] method59(int arg0, int arg1) {
        ++field4885;
        int[][] var3 = super.field2283.method1667(arg1, arg0 ^ 645);
        if (arg0 != -730) {
            this.method59(-61, 100);
        }
        if (super.field2283.field3451) {
            int[][] var4 = this.method1200(60, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class138.field1579; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field4884 <= var12) {
                    if (this.field4886 < var12) {
                        var8[var11] = this.field4886;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field4884;
                }
                if (var13 < this.field4884) {
                    var9[var11] = this.field4884;
                } else if (~var13 < ~this.field4886) {
                    var9[var11] = this.field4886;
                } else {
                    var9[var11] = var13;
                }
                if (~this.field4884 < ~var14) {
                    var10[var11] = this.field4884;
                } else if (~this.field4886 > ~var14) {
                    var10[var11] = this.field4886;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
    public static final void method2270(String arg0, int arg1, int arg2, String arg3) {
        class252.field3305 = arg0;
        class352.field4786 = arg3;
        class158.field1849 = arg2;
        ++field4889;
        if (!class252.field3305.equals("") && !class352.field4786.equals("")) {
            if (~class388.field5290 != 0) {
                class280.method1748(false);
            } else {
                class18.field194 = 0;
                class212.field2594 = 0;
                class190.field2233 = 1;
                class406.field5620 = arg1;
                class242 var4 = new class242(128);
                var4.method1593(10, -112);
                var4.method1560(-26356, (int) (9.9999999E7D * Math.random()));
                var4.method1591(2013886536, class412.method2551(class252.field3305, (byte) -100));
                var4.method1560(-26356, (int) (9.9999999E7D * Math.random()));
                var4.method1562(114, class352.field4786);
                var4.method1560(-26356, (int) (Math.random() * 9.9999999E7D));
                var4.method1594(-60, class4.field28, class349.field4747);
                class427.field5837.field3211 = 0;
                class427.field5837.method1593(24, -112);
                class427.field5837.method1593(var4.field3211 + 2, -126);
                class427.field5837.method1573(-6266, 568);
                class427.field5837.method1544(var4.field3211, -85, 0, var4.field3188);
            }
        } else {
            class406.field5620 = 3;
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(B)V")
    public static final void method2271(byte arg0) {
        ++field4892;
        class303.method1923(class264.field3404, 10240);
        ++class56.field644;
        if (class262.field3369 && class143.field1683) {
            int var1 = class358.field4866.method1860(16);
            int var2 = class358.field4866.method1858(-18493);
            int var3 = var2 - class20.field214;
            int var4 = var1 - class356.field4829;
            if (class56.field644 > class264.field3404.field6397) {
                int var5 = var4 - class94.field1109;
                int var6 = -class438.field6008 + var3;
                if (var5 > class264.field3404.field6429 || ~(-class264.field3404.field6429) < ~var5 || var6 > class264.field3404.field6429 || ~(-class264.field3404.field6429) < ~var6) {
                    class11.field131 = true;
                }
            }
            if (class325.field4340 > var4) {
                var4 = class325.field4340;
            }
            if (var4 - -class264.field3404.field6377 > class325.field4340 + class137.field1559.field6377) {
                var4 = class325.field4340 + class137.field1559.field6377 - class264.field3404.field6377;
            }
            if (~var3 > ~class395.field5379) {
                var3 = class395.field5379;
            }
            if (var3 - -class264.field3404.field6432 > class395.field5379 - -class137.field1559.field6432) {
                var3 = -class264.field3404.field6432 + class395.field5379 + class137.field1559.field6432;
            }
            int var7 = -class325.field4340 + var4 + class137.field1559.field6345;
            int var8 = -class395.field5379 + var3 + class137.field1559.field6386;
            if (arg0 <= 112) {
                field4893 = null;
            }
            if (class264.field3404.field6329 != null && class11.field131) {
                class221 var9 = new class221();
                var9.field2735 = class264.field3404.field6329;
                var9.field2736 = var7;
                var9.field2732 = class264.field3404;
                var9.field2738 = var8;
                class93.method578(var9);
            }
            if (!class358.field4866.method2620((byte) 111)) {
                if (class11.field131) {
                    if (class264.field3404.field6404 != null) {
                        class221 var10 = new class221();
                        var10.field2738 = var8;
                        var10.field2736 = var7;
                        var10.field2735 = class264.field3404.field6404;
                        var10.field2732 = class264.field3404;
                        var10.field2741 = class334.field4561;
                        class93.method578(var10);
                    }
                    if (class334.field4561 != null && client.method2687(class264.field3404) != null) {
                        class223.method1356(class334.field4561, class264.field3404, 127);
                    }
                } else if ((class396.field5388 == 1 || client.method2703(127)) && ~class57.field660 < -3) {
                    class263.method1660(2, -105, class94.field1109 + class356.field4829, class438.field6008 + class20.field214);
                } else if (class310.method1966(true)) {
                    class263.method1660(0, -92, class356.field4829 - -class94.field1109, class20.field214 - -class438.field6008);
                }
                class264.field3404 = null;
            }
        } else {
            if (~class56.field644 < -2) {
                class264.field3404 = null;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field4888;
        int var3 = -54 / ((57 - arg1) / 46);
        int[] var4 = super.field2292.method1781(arg0, false);
        if (super.field2292.field3708) {
            int[] var5 = this.method1203(0, 80, arg0);
            for (int var6 = 0; var6 < class138.field1579; ++var6) {
                int var7 = var5[var6];
                if (var7 < this.field4884) {
                    var4[var6] = this.field4884;
                } else if (this.field4886 < var7) {
                    var4[var6] = this.field4886;
                } else {
                    var4[var6] = var7;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(III)Z")
    public static final boolean method2272(int arg0, int arg1, int arg2) {
        int var3 = class354.field4820[arg0][arg1][arg2];
        if (-class49.field566 == var3) {
            return false;
        } else if (class49.field566 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class423.method2593(var4 + 1, class304.field4096[arg0].method1050(arg1, arg2), var5 + 1) && class423.method2593(var4 + 128 - 1, class304.field4096[arg0].method1050(arg1 + 1, arg2), var5 + 1) && class423.method2593(var4 + 128 - 1, class304.field4096[arg0].method1050(arg1 + 1, arg2 + 1), var5 + 128 - 1) && class423.method2593(var4 + 1, class304.field4096[arg0].method1050(arg1, arg2 + 1), var5 + 128 - 1)) {
                class354.field4820[arg0][arg1][arg2] = class49.field566;
                return true;
            } else {
                class354.field4820[arg0][arg1][arg2] = -class49.field566;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILbg;)V")
    public final void method54(int arg0, int arg1, class242 arg2) {
        ++field4894;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field2278 = ~arg2.method1563(-128) == -2;
                }
            } else {
                this.field4886 = arg2.method1587((byte) -102);
            }
        } else {
            this.field4884 = arg2.method1587((byte) -102);
        }
        int var5 = 11 / ((arg1 - 52) / 61);
    }
}
