import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class96 extends class24 {

    @OriginalMember(owner = "client!nf", name = "X", descriptor = "Z")
    public boolean field2314 = false;

    @OriginalMember(owner = "client!nf", name = "Y", descriptor = "I")
    public int field2315 = -1;

    @OriginalMember(owner = "client!nf", name = "ob", descriptor = "I")
    public int field2331 = -1;

    @OriginalMember(owner = "client!nf", name = "qb", descriptor = "I")
    public int field2333 = -1;

    @OriginalMember(owner = "client!nf", name = "wb", descriptor = "I")
    public int field2339 = 99;

    @OriginalMember(owner = "client!nf", name = "mb", descriptor = "I")
    public int field2329 = -1;

    @OriginalMember(owner = "client!nf", name = "xb", descriptor = "I")
    public int field2340 = -1;

    @OriginalMember(owner = "client!nf", name = "cb", descriptor = "I")
    public int field2319 = 2;

    @OriginalMember(owner = "client!nf", name = "zb", descriptor = "I")
    public int field2342 = 5;

    @OriginalMember(owner = "client!nf", name = "Z", descriptor = "I")
    public static int field2316 = -1;

    @OriginalMember(owner = "client!nf", name = "lb", descriptor = "Leb;")
    public static class31 field2328 = new class31(64);

    @OriginalMember(owner = "client!nf", name = "ub", descriptor = "Lqf;")
    private static class117 field2337 = class72.method514(112, "Loaded config");

    @OriginalMember(owner = "client!nf", name = "tb", descriptor = "Lqf;")
    public static class117 field2336 = field2337;

    @OriginalMember(owner = "client!nf", name = "vb", descriptor = "Lra;")
    public static class119 field2338 = new class119(5000);

    @OriginalMember(owner = "client!nf", name = "yb", descriptor = "Lqf;")
    public static class117 field2341 = class72.method514(101, "<)4col>");

    @OriginalMember(owner = "client!nf", name = "Bb", descriptor = "Lqf;")
    public static class117 field2344 = class72.method514(124, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!nf", name = "Ab", descriptor = "I")
    public static int field2343 = 0;

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!nf", name = "bb", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!nf", name = "eb", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!nf", name = "fb", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!nf", name = "gb", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!nf", name = "ib", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!nf", name = "jb", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!nf", name = "kb", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!nf", name = "nb", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!nf", name = "pb", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!nf", name = "sb", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "[I")
    public int[] field2312;

    @OriginalMember(owner = "client!nf", name = "ab", descriptor = "[I")
    private int[] field2317;

    @OriginalMember(owner = "client!nf", name = "db", descriptor = "[I")
    private int[] field2320;

    @OriginalMember(owner = "client!nf", name = "hb", descriptor = "[I")
    public int[] field2324;

    @OriginalMember(owner = "client!nf", name = "rb", descriptor = "[I")
    public int[] field2334;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZILea;)Lea;")
    public final class30 method750(boolean arg0, int arg1, class30 arg2) {
        field2335++;
        if (!arg0) {
            field2343 = 44;
        }
        int var4 = this.field2312[arg1];
        class43 var5 = class48.method346(16, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method233(true);
        } else {
            class30 var7 = arg2.method233(!var5.method301(4, var6));
            var7.method240(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLjb;Ljb;)V")
    public static final void method751(byte arg0, class64 arg1, class64 arg2) {
        class22.field410 = arg2;
        if (arg0 != -108) {
            field2336 = null;
        }
        class53.field1095 = arg1;
        field2322++;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V")
    public final void method752(byte arg0) {
        if (this.field2315 == -1) {
            if (this.field2320 == null) {
                this.field2315 = 0;
            } else {
                this.field2315 = 2;
            }
        }
        field2321++;
        int var2 = 27 / ((7 - arg0) / 41);
        if (this.field2329 != -1) {
            return;
        }
        if (this.field2320 == null) {
            this.field2329 = 0;
        } else {
            this.field2329 = 2;
        }
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(B)V")
    public static void method753(byte arg0) {
        field2328 = null;
        field2338 = null;
        field2336 = null;
        field2337 = null;
        field2344 = null;
        if (arg0 == -96) {
            field2341 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljb;IZLqf;Lqf;IZ)V")
    public static final void method754(class64 arg0, int arg1, boolean arg2, class117 arg3, class117 arg4, int arg5, boolean arg6) {
        field2326++;
        if (arg6) {
            method751((byte) 49, null, null);
        }
        int var7 = arg0.method447((byte) 58, arg3);
        int var8 = arg0.method449(!arg6, var7, arg4);
        class93.method734(arg2, arg0, 1368, var8, arg1, arg5, var7);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZILea;I)Lea;")
    public final class30 method755(boolean arg0, int arg1, class30 arg2, int arg3) {
        field2332++;
        int var5 = this.field2312[arg1];
        class43 var6 = class48.method346(16, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method231(true);
        }
        int var8 = arg3 & 0x3;
        if (arg0) {
            return null;
        }
        class30 var9 = arg2.method231(!var6.method301(4, var7));
        if (var8 == 1) {
            var9.method238();
        } else if (var8 == 2) {
            var9.method241();
        } else if (var8 == 3) {
            var9.method237();
        }
        var9.method240(var6, var7);
        if (var8 == 1) {
            var9.method237();
        } else if (var8 == 2) {
            var9.method241();
        } else if (var8 == 3) {
            var9.method238();
        }
        return var9;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lea;IB)Lea;")
    public final class30 method756(class30 arg0, int arg1, byte arg2) {
        int var4 = this.field2312[arg1];
        field2327++;
        class43 var5 = class48.method346(16, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method231(true);
        }
        class30 var7 = arg0.method231(!var5.method301(4, var6));
        if (arg2 != -17) {
            method753((byte) 26);
        }
        var7.method240(var5, var6);
        return var7;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lla;IB)V")
    private final void method757(class77 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            int var4 = arg0.method597(36);
            this.field2334 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2334[var5] = arg0.method597(45);
            }
            this.field2312 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2312[var6] = arg0.method597(97);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field2312[var7] += arg0.method597(111) << 16;
            }
        } else if (arg1 == 2) {
            this.field2331 = arg0.method597(76);
        } else if (arg1 == 3) {
            int var13 = arg0.method570((byte) 123);
            this.field2320 = new int[var13 + 1];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2320[var14] = arg0.method570((byte) 123);
            }
            this.field2320[var13] = 9999999;
        } else if (arg1 == 4) {
            this.field2314 = true;
        } else if (arg1 == 5) {
            this.field2342 = arg0.method570((byte) 123);
        } else if (arg1 == 6) {
            this.field2340 = arg0.method597(76);
        } else if (arg1 == 7) {
            this.field2333 = arg0.method597(123);
        } else if (arg1 == 8) {
            this.field2339 = arg0.method570((byte) 123);
        } else if (arg1 == 9) {
            this.field2329 = arg0.method570((byte) 123);
        } else if (arg1 == 10) {
            this.field2315 = arg0.method570((byte) 123);
        } else if (arg1 == 11) {
            this.field2319 = arg0.method570((byte) 123);
        } else if (arg1 == 12) {
            int var10 = arg0.method570((byte) 123);
            this.field2317 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field2317[var11] = arg0.method597(84);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field2317[var12] = (arg0.method597(60) << 16) + this.field2317[var12];
            }
        } else if (arg1 == 13) {
            int var8 = arg0.method570((byte) 123);
            this.field2324 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2324[var9] = arg0.method557((byte) -114);
            }
        }
        if (arg2 <= -22) {
            field2330++;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZLla;)V")
    public final void method758(boolean arg0, class77 arg1) {
        if (!arg0) {
            this.field2342 = -12;
        }
        field2325++;
        while (true) {
            int var3 = arg1.method570((byte) 123);
            if (var3 == 0) {
                return;
            }
            this.method757(arg1, var3, (byte) -69);
        }
    }

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "(I)V")
    public static final void method759(int arg0) {
        field2313++;
        if (arg0 > -23) {
            field2336 = null;
        }
        for (int var1 = 0; var1 < class71.field1515; var1++) {
            int var10002 = class95.field2289[var1]--;
            if (class95.field2289[var1] >= -10) {
                class123 var3 = class115.field2720[var1];
                if (var3 == null) {
                    var3 = class123.method981(class31.field666, class41.field814[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class95.field2289[var1] += var3.method980();
                    class115.field2720[var1] = var3;
                }
                if (class95.field2289[var1] < 0) {
                    int var10;
                    if (class124.field2923[var1] == 0) {
                        var10 = class71.field1526;
                    } else {
                        int var4 = class124.field2923[var1] >> 16 & 0xFF;
                        int var5 = (class124.field2923[var1] & 0xFF) * 128;
                        int var6 = var4 * 128 + 64 - class141.field3395.field1998;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = class124.field2923[var1] >> 8 & 0xFF;
                        int var8 = var7 * 128 + 64 - class141.field3395.field1960;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var6 + var8 - 128;
                        if (var5 < var9) {
                            class95.field2289[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var5 - var9) * class27.field527 / var5;
                    }
                    if (var10 > 0) {
                        class39 var11 = var3.method979().method284(class119.field2856);
                        class9 var12 = class9.method50(var11, 100, var10);
                        var12.method42(class150.field3719[var1] - 1);
                        class147.field3592.method283(var12);
                    }
                    class95.field2289[var1] = -100;
                }
            } else {
                class71.field1515--;
                for (int var2 = var1; var2 < class71.field1515; var2++) {
                    class41.field814[var2] = class41.field814[var2 + 1];
                    class115.field2720[var2] = class115.field2720[var2 + 1];
                    class150.field3719[var2] = class150.field3719[var2 + 1];
                    class95.field2289[var2] = class95.field2289[var2 + 1];
                    class124.field2923[var2] = class124.field2923[var2 + 1];
                }
                var1--;
            }
        }
        if (class40.field796 && !class99.method774(8)) {
            if (class43.field861 != 0 && class65.field1359 != -1) {
                class141.method1100(class50.field1040, -111, 0, false, class43.field861, class65.field1359);
            }
            class40.field796 = false;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IILea;)Lea;")
    public final class30 method760(int arg0, int arg1, class30 arg2) {
        int var4 = this.field2312[arg1];
        field2311++;
        class43 var5 = class48.method346(16, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method231(true);
        }
        if (arg0 != -25963) {
            this.method756(null, 83, (byte) -66);
        }
        class43 var7 = null;
        int var8 = 0;
        if (this.field2317 != null && this.field2317.length > arg1) {
            int var9 = this.field2317[arg1];
            var7 = class48.method346(16, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class30 var11 = arg2.method231(!var5.method301(arg0 + 25967, var6));
            var11.method240(var5, var6);
            return var11;
        } else {
            class30 var10 = arg2.method231(!var5.method301(4, var6) & !var7.method301(4, var8));
            var10.method240(var5, var6);
            var10.method240(var7, var8);
            return var10;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lqf;Ljb;Lqf;B)Lma;")
    public static final class84 method761(class117 arg0, class64 arg1, class117 arg2, byte arg3) {
        if (arg3 != 123) {
            method759(-20);
        }
        int var4 = arg1.method447((byte) 53, arg0);
        field2318++;
        int var5 = arg1.method449(true, var4, arg2);
        return class121.method972(var4, var5, 9, arg1);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lnf;ILea;II)Lea;")
    public final class30 method762(class96 arg0, int arg1, class30 arg2, int arg3, int arg4) {
        field2323++;
        int var6 = this.field2312[arg4];
        class43 var7 = class48.method346(16, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg0.method756(arg2, arg1, (byte) -17);
        }
        if (arg3 != 23214) {
            this.field2315 = -55;
        }
        int var9 = arg0.field2312[arg1];
        class43 var10 = class48.method346(16, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class30 var12 = arg2.method231(!var7.method301(4, var8));
            var12.method240(var7, var8);
            return var12;
        } else {
            class30 var13 = arg2.method231(!var7.method301(4, var8) & !var10.method301(4, var11));
            var13.method228(var7, var8, var10, var11, this.field2320);
            return var13;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)I")
    public static int method763(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
