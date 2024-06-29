import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class143 extends class123 {

    @OriginalMember(owner = "client!wc", name = "Y", descriptor = "I")
    public int field3366 = -1;

    @OriginalMember(owner = "client!wc", name = "X", descriptor = "I")
    public int field3365 = 5;

    @OriginalMember(owner = "client!wc", name = "bb", descriptor = "I")
    public int field3369 = -1;

    @OriginalMember(owner = "client!wc", name = "ab", descriptor = "I")
    public int field3368 = 2;

    @OriginalMember(owner = "client!wc", name = "mb", descriptor = "I")
    public int field3380 = -1;

    @OriginalMember(owner = "client!wc", name = "eb", descriptor = "I")
    public int field3372 = -1;

    @OriginalMember(owner = "client!wc", name = "ub", descriptor = "I")
    public int field3388 = -1;

    @OriginalMember(owner = "client!wc", name = "lb", descriptor = "I")
    public int field3379 = 99;

    @OriginalMember(owner = "client!wc", name = "Cb", descriptor = "Z")
    public boolean field3396 = false;

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "Lvc;")
    public static class137 field3358 = class45.method325("Lade Sprites )2 ", -46);

    @OriginalMember(owner = "client!wc", name = "hb", descriptor = "Lvc;")
    private static class137 field3375 = class45.method325("Enter name of player to add to list", -46);

    @OriginalMember(owner = "client!wc", name = "Z", descriptor = "I")
    public static int field3367 = 0;

    @OriginalMember(owner = "client!wc", name = "W", descriptor = "Lvc;")
    public static class137 field3364 = field3375;

    @OriginalMember(owner = "client!wc", name = "sb", descriptor = "I")
    public static int field3386 = 1;

    @OriginalMember(owner = "client!wc", name = "db", descriptor = "Lvc;")
    public static class137 field3371 = class45.method325("Welt", -46);

    @OriginalMember(owner = "client!wc", name = "wb", descriptor = "I")
    public static int field3390 = 0;

    @OriginalMember(owner = "client!wc", name = "zb", descriptor = "Lvc;")
    public static class137 field3393 = class45.method325("", -46);

    @OriginalMember(owner = "client!wc", name = "qb", descriptor = "Lvc;")
    public static class137 field3384 = class45.method325("Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1", -46);

    @OriginalMember(owner = "client!wc", name = "Db", descriptor = "I")
    public static int field3397 = 0;

    @OriginalMember(owner = "client!wc", name = "vb", descriptor = "Lvc;")
    public static class137 field3389 = class45.method325("Registrierter Benutzer", -46);

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!wc", name = "V", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!wc", name = "cb", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!wc", name = "fb", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!wc", name = "ib", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!wc", name = "jb", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!wc", name = "kb", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!wc", name = "nb", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!wc", name = "pb", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!wc", name = "xb", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!wc", name = "Ab", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "J")
    public static long field3361;

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "Lre;")
    public static class115 field3362;

    @OriginalMember(owner = "client!wc", name = "gb", descriptor = "Lcf;")
    public static class21 field3374;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "Leb;")
    public static class31 field3357;

    @OriginalMember(owner = "client!wc", name = "ob", descriptor = "[I")
    public int[] field3382;

    @OriginalMember(owner = "client!wc", name = "rb", descriptor = "[I")
    private int[] field3385;

    @OriginalMember(owner = "client!wc", name = "tb", descriptor = "[I")
    private int[] field3387;

    @OriginalMember(owner = "client!wc", name = "yb", descriptor = "[I")
    public int[] field3392;

    @OriginalMember(owner = "client!wc", name = "Bb", descriptor = "[I")
    public int[] field3395;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILbf;II)Lbf;")
    public final class14 method1095(int arg0, class14 arg1, int arg2, int arg3) {
        field3370++;
        int var5 = this.field3395[arg0];
        class25 var6 = class139.method1074(true, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method102(true);
        }
        int var8 = arg2 & 0x3;
        class14 var9 = arg1.method102(!var6.method212(arg3 ^ arg3, var7));
        if (var8 == 1) {
            var9.method107();
        } else if (var8 == 2) {
            var9.method98();
        } else if (var8 == 3) {
            var9.method99();
        }
        var9.method101(var6, var7);
        if (var8 == 1) {
            var9.method99();
        } else if (var8 == 2) {
            var9.method98();
        } else if (var8 == 3) {
            var9.method107();
        }
        return var9;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(B)V")
    public static void method1096(byte arg0) {
        if (arg0 > -4) {
            field3357 = null;
        }
        field3384 = null;
        field3358 = null;
        field3364 = null;
        field3374 = null;
        field3362 = null;
        field3389 = null;
        field3393 = null;
        field3371 = null;
        field3375 = null;
        field3357 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lbf;II)Lbf;")
    public final class14 method1097(class14 arg0, int arg1, int arg2) {
        field3378++;
        int var4 = this.field3395[arg2];
        class25 var5 = class139.method1074(true, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method111(true);
        }
        if (arg1 != 3992) {
            this.method1097(null, -16, 74);
        }
        class14 var7 = arg0.method111(!var5.method212(0, var6));
        var7.method101(var5, var6);
        return var7;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIBLwc;Lbf;)Lbf;")
    public final class14 method1098(int arg0, int arg1, byte arg2, class143 arg3, class14 arg4) {
        field3373++;
        int var6 = this.field3395[arg0];
        class25 var7 = class139.method1074(true, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg3.method1102(arg1, arg4, (byte) 55);
        }
        int var9 = arg3.field3395[arg1];
        class25 var10 = class139.method1074(true, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class14 var12 = arg4.method102(!var7.method212(0, var8));
            var12.method101(var7, var8);
            return var12;
        }
        if (arg2 < 124) {
            field3357 = null;
        }
        class14 var13 = arg4.method102(!var7.method212(0, var8) & !var10.method212(0, var11));
        var13.method96(var7, var8, var10, var11, this.field3385);
        return var13;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II[Lme;IIIIIIB)V")
    public static final void method1099(int arg0, int arg1, class85[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        field3377++;
        int var10 = 0;
        if (arg9 != -45) {
            method1106(63);
        }
        while (var10 < arg2.length) {
            class85 var11 = arg2[var10];
            if (var11 != null && (var11.field1952 == 0 || var11.field2028) && var11 != null && var11.field1945 == arg5 && !class8.method58(var11, arg9 + 1837)) {
                int var12 = arg8 + var11.field1985 - arg3;
                int var13 = var11.field2007 + arg6 - arg0;
                int var14 = var11.field1929 + var12;
                int var15 = var12 <= arg8 ? arg8 : var12;
                int var16 = arg6 < var13 ? var13 : arg6;
                int var17 = var11.field1975 + var13;
                int var18 = var17 < arg7 ? var17 : arg7;
                int var19 = var14 >= arg1 ? arg1 : var14;
                if (var11.field1952 == 0) {
                    method1099(var16 + var11.field1927 - var13, var19, arg2, var15 + var11.field1932 - var12, arg4, var11.field1910, var16, var18, var15, (byte) -45);
                    if (var11.field1980 != null) {
                        method1099(var16 + var11.field1927 - var13, var19, var11.field1980, var15 + var11.field1932 - var12, arg4, var11.field1910, var16, var18, var15, (byte) -45);
                    }
                }
                if (var11.field2028) {
                    boolean var20;
                    if (class126.field2956 >= var15 && class32.field693 >= var16 && var19 > class126.field2956 && class32.field693 < var18) {
                        var20 = true;
                    } else {
                        var20 = false;
                    }
                    boolean var21 = false;
                    boolean var22 = false;
                    if (class78.field1747 == 1 && class36.field788 >= var15 && class38.field835 >= var16 && class36.field788 < var19 && var18 > class38.field835) {
                        var22 = true;
                    }
                    if (class131.field3049 == 1 && var20) {
                        var21 = true;
                    }
                    if (var22 && class98.field2272 == null && (arg4 & 0x200) != 0 && !class77.field1718 && class86.method638(var11, 255) != null) {
                        class98.field2272 = var11;
                        class125.field2913 = false;
                        class108.field2520 = 0;
                        class53.field1180 = class32.field693;
                        class82.field1837 = class126.field2956;
                    }
                    if (class98.field2272 != null || class77.field1718) {
                        var20 = false;
                        var21 = false;
                        var22 = false;
                    }
                    if (!var11.field2023 && var22 && (arg4 & 0x1) != 0) {
                        var11.field2023 = true;
                        if (var11.field1976 != null) {
                            class63.method461(class38.field835 - var13, null, var11.field1976, 0, (byte) 95, class36.field788 - var12, var11);
                        }
                    }
                    if (var11.field2023 && var21 && (arg4 & 0x4) != 0 && var11.field1919 != null) {
                        class63.method461(class32.field693 - var13, null, var11.field1919, 0, (byte) 65, class126.field2956 - var12, var11);
                    }
                    if (var11.field2023 && !var21 && (arg4 & 0x2) != 0) {
                        var11.field2023 = false;
                        if (var11.field1987 != null) {
                            class63.method461(class32.field693 - var13, null, var11.field1987, 0, (byte) 87, class126.field2956 - var12, var11);
                        }
                    }
                    if (var21 && (arg4 & 0x8) != 0 && var11.field2018 != null) {
                        class63.method461(class32.field693 - var13, null, var11.field2018, 0, (byte) 82, class126.field2956 - var12, var11);
                    }
                    if (!var11.field2002 && var20 && (arg4 & 0x10) != 0) {
                        var11.field2002 = true;
                        if (var11.field1977 != null) {
                            class63.method461(class32.field693 - var13, null, var11.field1977, 0, (byte) 82, class126.field2956 - var12, var11);
                        }
                    }
                    if (var11.field2002 && var20 && (arg4 & 0x40) != 0 && var11.field1937 != null) {
                        class63.method461(class32.field693 - var13, null, var11.field1937, 0, (byte) 69, class126.field2956 - var12, var11);
                    }
                    if (var11.field2002 && !var20 && (arg4 & 0x20) != 0) {
                        var11.field2002 = false;
                        if (var11.field1956 != null) {
                            class63.method461(class32.field693 - var13, null, var11.field1956, 0, (byte) 106, class126.field2956 - var12, var11);
                        }
                    }
                    if (var11.field1930 != null && (arg4 & 0x80) != 0) {
                        class63.method461(0, null, var11.field1930, 0, (byte) 84, 0, var11);
                    }
                    if (var20 && class114.field2706 != 0 && var11.field2003 != null && (arg4 & 0x400) != 0) {
                        class63.method461(class114.field2706, null, var11.field2003, 0, (byte) 83, 0, var11);
                    }
                    if ((arg4 & 0x100) != 0) {
                        if (class11.field240 > var11.field2005 && var11.field2015 != null) {
                            class63.method461(0, null, var11.field2015, 0, (byte) 114, 0, var11);
                        }
                        if (var11.field2005 < class19.field391 && var11.field1983 != null) {
                            class63.method461(0, null, var11.field1983, 0, (byte) 84, 0, var11);
                        }
                        if (var11.field2005 < class139.field3238 && var11.field1959 != null) {
                            class63.method461(0, null, var11.field1959, 0, (byte) 55, 0, var11);
                        }
                        var11.field2005 = class112.field2667;
                    }
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)Z")
    public static final boolean method1100(int arg0, int arg1) {
        field3394++;
        if (arg0 < 106) {
            method1096((byte) 99);
        }
        return (arg1 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(B)V")
    public final void method1101(byte arg0) {
        if (this.field3388 == -1) {
            if (this.field3385 == null) {
                this.field3388 = 0;
            } else {
                this.field3388 = 2;
            }
        }
        if (this.field3380 == -1) {
            if (this.field3385 == null) {
                this.field3380 = 0;
            } else {
                this.field3380 = 2;
            }
        }
        field3383++;
        int var2 = 96 % ((arg0 + 15) / 33);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILbf;B)Lbf;")
    public final class14 method1102(int arg0, class14 arg1, byte arg2) {
        if (arg2 < 42) {
            this.field3368 = 101;
        }
        int var4 = this.field3395[arg0];
        field3363++;
        class25 var5 = class139.method1074(true, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method102(true);
        } else {
            class14 var7 = arg1.method102(!var5.method212(0, var6));
            var7.method101(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZILbf;)Lbf;")
    public final class14 method1103(boolean arg0, int arg1, class14 arg2) {
        if (arg0) {
            field3390 = -56;
        }
        field3391++;
        int var4 = this.field3395[arg1];
        class25 var5 = class139.method1074(true, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method102(true);
        }
        class25 var7 = null;
        int var8 = 0;
        if (this.field3387 != null && arg1 < this.field3387.length) {
            int var9 = this.field3387[arg1];
            var7 = class139.method1074(true, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class14 var11 = arg2.method102(!var5.method212(0, var6));
            var11.method101(var5, var6);
            return var11;
        } else {
            class14 var10 = arg2.method102(!var5.method212(0, var6) & !var7.method212(0, var8));
            var10.method101(var5, var6);
            var10.method101(var7, var8);
            return var10;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lqe;II)V")
    private final void method1104(class109 arg0, int arg1, int arg2) {
        field3360++;
        if (arg1 == 1) {
            int var4 = arg0.method838(255);
            this.field3382 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3382[var5] = arg0.method835(2);
            }
            this.field3395 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3395[var6] = arg0.method835(2);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3395[var7] += arg0.method835(2) << 16;
            }
        } else if (arg1 == 2) {
            this.field3369 = arg0.method835(2);
        } else if (arg1 == 3) {
            int var8 = arg0.method838(255);
            this.field3385 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3385[var9] = arg0.method838(255);
            }
            this.field3385[var8] = 9999999;
        } else if (arg1 == 4) {
            this.field3396 = true;
        } else if (arg1 == 5) {
            this.field3365 = arg0.method838(255);
        } else if (arg1 == 6) {
            this.field3372 = arg0.method835(2);
        } else if (arg1 == 7) {
            this.field3366 = arg0.method835(2);
        } else if (arg1 == 8) {
            this.field3379 = arg0.method838(255);
        } else if (arg1 == 9) {
            this.field3380 = arg0.method838(255);
        } else if (arg1 == 10) {
            this.field3388 = arg0.method838(255);
        } else if (arg1 == 11) {
            this.field3368 = arg0.method838(255);
        } else if (arg1 == 12) {
            int var12 = arg0.method838(255);
            this.field3387 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3387[var13] = arg0.method835(2);
            }
            for (int var14 = 0; var14 < var12; var14++) {
                this.field3387[var14] += arg0.method835(2) << 16;
            }
        } else if (arg1 == 13) {
            int var10 = arg0.method838(255);
            this.field3392 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field3392[var11] = arg0.method822((byte) 43);
            }
        }
        int var15 = 125 / ((-arg2 - 5) / 52);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILqe;)V")
    public final void method1105(int arg0, class109 arg1) {
        if (arg0 != -1) {
            this.method1101((byte) -51);
        }
        while (true) {
            int var3 = arg1.method838(arg0 ^ 0xFFFFFF00);
            if (var3 == 0) {
                field3381++;
                return;
            }
            this.method1104(arg1, var3, arg0 ^ 0xFFFFFFC7);
        }
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)I")
    public static final int method1106(int arg0) {
        if (arg0 != 31116048) {
            field3364 = null;
        }
        field3359++;
        return class112.field2686++;
    }
}
