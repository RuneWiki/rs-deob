import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class61 {

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "Lug;")
    private class205 field857;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Ldg;")
    private class142 field858;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Lki;")
    private class63 field850;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "[B")
    public static byte[] field852 = new byte[520];

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field855 = 0;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field853 = 0;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "J")
    public static long field851;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Lv;")
    private class152 field844;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "[Lhh;")
    private class120[] field854;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IJ)V")
    public static final void method433(int arg0, long arg1) {
        if (!class113.field1640) {
            class190.field3068 += (float) arg1 * class44.field642 / 40.0F;
            class123.field1799 += (float) arg1 * class151.field2448 / 40.0F;
        }
        field859++;
        if (arg0 != 300) {
            return;
        }
        int var3 = class12.field146 + class186.field2993.field1979;
        int var4 = class242.field3859 + class186.field2993.field1910;
        if ((class210.field3370 - var3) < -500 || class210.field3370 - var3 > 500 || class25.field290 - var4 < -500 || class25.field290 - var4 > 500) {
            class210.field3370 = var3;
            class25.field290 = var4;
        }
        if (class210.field3370 != var3) {
            int var5 = var3 - class210.field3370;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class210.field3370 += var6;
        }
        if (class25.field290 != var4) {
            int var7 = var4 - class25.field290;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class25.field290 += var8;
        }
        class97.method752((byte) 91);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)V")
    public static final void method434(int arg0, boolean arg1) {
        if (arg1) {
            method439((byte) -107);
        }
        field847++;
        class115.field1666.method1548(arg0, 0);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static final void method435(int arg0) {
        field862++;
        if (arg0 != 6330) {
            method435(-41);
        }
        for (int var1 = 0; var1 < class121.field1773; var1++) {
            int var2 = class188.field3045[var1];
            class18 var3 = class169.field2730[var2];
            int var4 = class50.field732.method1111(255);
            if ((var4 & 0x1) != 0) {
                var4 += class50.field732.method1111(arg0 ^ 0x1845) << 8;
            }
            if ((var4 & 0x200) != 0) {
                var3.field1975 = class50.field732.method1113(19226);
                var3.field1885 = class50.field732.method1072(96);
            }
            if ((var4 & 0x2) != 0) {
                int var5 = class50.field732.method1113(19226);
                int var6 = class50.field732.method1111(arg0 - 6075);
                if (var5 == 65535) {
                    var5 = -1;
                }
                class225.method1611((byte) 74, var3, var5, var6);
            }
            if ((var4 & 0x4) != 0) {
                int var7 = class50.field732.method1096((byte) -82);
                int var8 = class50.field732.method1116((byte) 83);
                var3.method922(arg0 ^ 0x18F1, class264.field4290, var7, var8);
            }
            if ((var4 & 0x100) != 0) {
                int var9 = class50.field732.method1116((byte) 108);
                int[] var10 = new int[var9];
                int[] var11 = new int[var9];
                int[] var12 = new int[var9];
                for (int var13 = 0; var13 < var9; var13++) {
                    int var14 = class50.field732.method1072(arg0 ^ 0x18D3);
                    if (var14 == 65535) {
                        var14 = -1;
                    }
                    var11[var13] = var14;
                    var10[var13] = class50.field732.method1085(class148.method1051(arg0, -6287));
                    var12[var13] = class50.field732.method1072(class148.method1051(arg0, 6351));
                }
                class291.method1971(var12, var3, var10, var11, false);
            }
            if ((var4 & 0x80) != 0) {
                boolean var15 = true;
                int var16 = class50.field732.method1126(false);
                int var17 = class50.field732.method1097(arg0 ^ 0x18C5);
                if (var16 == 65535) {
                    var16 = -1;
                }
                if (var16 != -1 && var3.field1934 != -1 && class285.method1939(class187.method1387((byte) 120, var16).field794, arg0 - 6218).field2278 < class285.method1939(class187.method1387((byte) 23, var3.field1934).field794, arg0 - 6218).field2278) {
                    var15 = false;
                }
                if (var15) {
                    var3.field1934 = var16;
                    var3.field1878 = (var17 & 0xFFFF) + class264.field4290;
                    var3.field1944 = var17 >> 16;
                    var3.field1891 = 0;
                    var3.field1923 = 1;
                    var3.field1948 = 0;
                    if (class264.field4290 < var3.field1878) {
                        var3.field1948 = -1;
                    }
                    if (var3.field1934 != -1 && class264.field4290 == var3.field1878) {
                        int var18 = class187.method1387((byte) 56, var3.field1934).field794;
                        if (var18 != -1) {
                            class141 var19 = class285.method1939(var18, 112);
                            if (var19 != null && var19.field2252 != null) {
                                class263.method1845(0, var3.field1910, false, var3.field1979, (byte) -109, var19);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field1872 = class50.field732.method1078(-1);
                var3.field1961 = 100;
            }
            if ((var4 & 0x20) != 0) {
                int var20 = class50.field732.method1096((byte) -51);
                int var21 = class50.field732.method1116((byte) 107);
                var3.method922(arg0 ^ 0x18C5, class264.field4290, var20, var21);
                var3.field1919 = class264.field4290 + 300;
                var3.field1972 = class50.field732.method1111(255);
            }
            if ((var4 & 0x40) != 0) {
                if (var3.field205.method1763((byte) 122)) {
                    class131.method941(var3, (byte) -92);
                }
                var3.method122(-3662, class234.method1657(0, class50.field732.method1126(false)));
                var3.method923(var3.field205.field3997, false);
                var3.field1940 = var3.field205.field4015;
                var3.field1927 = var3.field205.field4008;
                if (var3.field205.method1763((byte) 72)) {
                    class188.method1403(0, var3, var3.field1974[0], class58.field826, 127, (class36) null, var3.field1917[0], (class29) null);
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field1894 = class50.field732.method1071((byte) 11);
                if (var3.field1894 == 65535) {
                    var3.field1894 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static final void method436(byte arg0) {
        if (class211.field3384 != -1) {
            class75.method547(-1, class211.field3384);
        }
        if (arg0 >= -55) {
            method433(15, 35L);
        }
        for (int var1 = 0; var1 < class115.field1664; var1++) {
            if (class190.field3070[var1]) {
                class294.field4673[var1] = true;
            }
            class225.field3616[var1] = class190.field3070[var1];
            class190.field3070[var1] = false;
        }
        field861++;
        class59.field837 = class264.field4290;
        class250.field4152 = null;
        class97.field1432 = -1;
        class105.field1535 = -1;
        if (class211.field3384 != -1) {
            class115.field1664 = 0;
            class161.method1201(0);
        }
        class70.method512();
        class161.field2628 = 0;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
    public final void method437(byte arg0) {
        field846++;
        if (this.field854 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field854.length; var2++) {
            if (this.field854[var2] != null) {
                this.field854[var2].method877(-44);
            }
        }
        int var3 = 0;
        if (arg0 <= 118) {
            return;
        }
        while (var3 < this.field854.length) {
            if (this.field854[var3] != null) {
                this.field854[var3].method873(114);
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)Z")
    public final boolean method438(boolean arg0) {
        field856++;
        if (this.field844 != null) {
            return true;
        } else if (arg0) {
            if (this.field850 == null) {
                if (this.field857.method1506((byte) 93)) {
                    return false;
                }
                this.field850 = this.field857.method1502(255, true, 21863, (byte) 0, 255);
            }
            if (this.field850.field1090) {
                return false;
            } else {
                this.field844 = new class152(this.field850.method462(1));
                this.field854 = new class120[(this.field844.field2523.length - 5) / 8];
                return true;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)V")
    public static void method439(byte arg0) {
        if (arg0 <= 67) {
            method434(65, true);
        }
        field852 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZIBLii;Lii;)Lhh;")
    private final class120 method440(boolean arg0, int arg1, byte arg2, class263 arg3, class263 arg4) {
        field845++;
        if (this.field844 == null) {
            throw new RuntimeException();
        }
        this.field844.field2511 = arg1 * 8 + 5;
        int var6 = 69 % ((arg2 + 12) / 51);
        if (this.field844.field2511 >= this.field844.field2523.length) {
            throw new RuntimeException();
        } else if (this.field854[arg1] == null) {
            int var7 = this.field844.method1097(126);
            int var8 = this.field844.method1097(126);
            class120 var9 = new class120(arg1, arg4, arg3, this.field857, this.field858, var7, var8, arg0);
            this.field854[arg1] = var9;
            return var9;
        } else {
            return this.field854[arg1];
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lii;ILii;Z)Lhh;")
    public final class120 method441(class263 arg0, int arg1, class263 arg2, boolean arg3) {
        field848++;
        if (!arg3) {
            this.method441((class263) null, -100, (class263) null, true);
        }
        return this.method440(true, arg1, (byte) 84, arg0, arg2);
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lug;Ldg;)V")
    public class61(class205 arg0, class142 arg1) {
        this.field857 = arg0;
        this.field858 = arg1;
        if (!this.field857.method1506((byte) 85)) {
            this.field850 = this.field857.method1502(255, true, 21863, (byte) 0, 255);
        }
    }
}
