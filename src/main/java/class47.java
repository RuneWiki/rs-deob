import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class47 {

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    private int field1016 = 0;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    private int field1026 = -1;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "Lli;")
    private class277 field1021 = new class277();

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "Z")
    public boolean field1029 = false;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    private int field1007;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "[[I")
    private int[][] field1023;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    private int field1014;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "[Lnh;")
    private class52[] field1017;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "Loh;")
    public static class263 field1019 = class253.method1681(-117, "compass");

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field1009 = 0;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field1013 = 0;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "Llb;")
    public static class127 field1010 = new class127(20);

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "Lue;")
    public static class86 field1025;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "Ljava/awt/Image;")
    public static Image field1024;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "[Loe;")
    public static class140[] field1028;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)Lhe;")
    public static final class19 method297(int arg0, int arg1) {
        field1011++;
        class19 var2 = (class19) class150.field2704.method828(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class11.field248.method596(53, 1, arg0);
        if (arg1 != 21758) {
            field1013 = -54;
        }
        class19 var4 = new class19();
        if (var3 != null) {
            var4.method137(arg1 ^ 0x548A, arg0, new class194(var3));
        }
        class150.field2704.method826((long) arg0, 9815, var4);
        return var4;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method298(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class71.field1434++;
        class9.field192 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = field1009; var12 < class7.field120; var12++) {
            class2[][] var38 = class18.field417[var12];
            for (int var39 = class87.field1754; var39 < class30.field753; var39++) {
                for (int var40 = class83.field1649; var40 < class121.field2244; var40++) {
                    class2 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class22.field647[var39 + class263.field4590 - class121.field2239][var40 + class263.field4590 - class186.field3359] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field39 = true;
                            var41.field34 = true;
                            if (var41.field27 > 0) {
                                var41.field44 = true;
                            } else {
                                var41.field44 = false;
                            }
                            class9.field192++;
                        } else {
                            var41.field39 = false;
                            var41.field34 = false;
                            var41.field35 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field43 != null) {
                                    class22 var42 = var41.field43;
                                    var42.field633.method556(var42.field648, 71, var42.field632, var42.field648, var42.field632);
                                    if (var42.field641 != null) {
                                        var42.field641.method556(var42.field648, 125, var42.field632, var42.field648, var42.field632);
                                    }
                                }
                                if (var41.field45 != null) {
                                    class138 var43 = var41.field45;
                                    var43.field2546.method556(var43.field2543, 114, var43.field2555, var43.field2543, var43.field2555);
                                    if (var43.field2559 != null) {
                                        var43.field2559.method556(var43.field2543, 88, var43.field2555, var43.field2543, var43.field2555);
                                    }
                                }
                                if (var41.field52 != null) {
                                    class165 var44 = var41.field52;
                                    var44.field3002.method556(var44.field3008, 77, var44.field3014, var44.field3008, var44.field3014);
                                }
                                if (var41.field37 != null) {
                                    for (int var45 = 0; var45 < var41.field27; var45++) {
                                        class70 var46 = var41.field37[var45];
                                        var46.field1398.method556(var46.field1413, 76, var46.field1418, var46.field1403, var46.field1405);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class157.field2825 == class112.field2102;
        for (int var14 = field1009; var14 < class7.field120; var14++) {
            class2[][] var27 = class18.field417[var14];
            for (int var28 = -class263.field4590; var28 <= 0; var28++) {
                int var29 = class121.field2239 + var28;
                int var30 = class121.field2239 - var28;
                if (var29 >= class87.field1754 || var30 < class30.field753) {
                    for (int var31 = -class263.field4590; var31 <= 0; var31++) {
                        int var32 = class186.field3359 + var31;
                        int var33 = class186.field3359 - var31;
                        if (var29 >= class87.field1754) {
                            if (var32 >= class83.field1649) {
                                class2 var34 = var27[var29][var32];
                                if (var34 != null && var34.field39) {
                                    class249.method1669(var34, true);
                                }
                            }
                            if (var33 < class121.field2244) {
                                class2 var35 = var27[var29][var33];
                                if (var35 != null && var35.field39) {
                                    class249.method1669(var35, true);
                                }
                            }
                        }
                        if (var30 < class30.field753) {
                            if (var32 >= class83.field1649) {
                                class2 var36 = var27[var30][var32];
                                if (var36 != null && var36.field39) {
                                    class249.method1669(var36, true);
                                }
                            }
                            if (var33 < class121.field2244) {
                                class2 var37 = var27[var30][var33];
                                if (var37 != null && var37.field39) {
                                    class249.method1669(var37, true);
                                }
                            }
                        }
                        if (class9.field192 == 0) {
                            if (!var13) {
                                class207.field3745 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = field1009; var15 < class7.field120; var15++) {
            class2[][] var16 = class18.field417[var15];
            for (int var17 = -class263.field4590; var17 <= 0; var17++) {
                int var18 = class121.field2239 + var17;
                int var19 = class121.field2239 - var17;
                if (var18 >= class87.field1754 || var19 < class30.field753) {
                    for (int var20 = -class263.field4590; var20 <= 0; var20++) {
                        int var21 = class186.field3359 + var20;
                        int var22 = class186.field3359 - var20;
                        if (var18 >= class87.field1754) {
                            if (var21 >= class83.field1649) {
                                class2 var23 = var16[var18][var21];
                                if (var23 != null && var23.field39) {
                                    class249.method1669(var23, false);
                                }
                            }
                            if (var22 < class121.field2244) {
                                class2 var24 = var16[var18][var22];
                                if (var24 != null && var24.field39) {
                                    class249.method1669(var24, false);
                                }
                            }
                        }
                        if (var19 < class30.field753) {
                            if (var21 >= class83.field1649) {
                                class2 var25 = var16[var19][var21];
                                if (var25 != null && var25.field39) {
                                    class249.method1669(var25, false);
                                }
                            }
                            if (var22 < class121.field2244) {
                                class2 var26 = var16[var19][var22];
                                if (var26 != null && var26.field39) {
                                    class249.method1669(var26, false);
                                }
                            }
                        }
                        if (class9.field192 == 0) {
                            if (!var13) {
                                class207.field3745 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class207.field3745 = false;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
    public final void method299(byte arg0) {
        field1012++;
        for (int var2 = 0; var2 < this.field1007; var2++) {
            this.field1023[var2] = null;
        }
        this.field1023 = null;
        this.field1017 = null;
        if (arg0 != 85) {
            method303(-86, (class194) null);
        }
        this.field1021.method1884(-33);
        this.field1021 = null;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)V")
    public static final void method300(int arg0, int arg1) {
        field1018++;
        class122.field2258.method829(arg0, (byte) 119);
        class93.field1835.method829(arg0, (byte) -54);
        if (arg1 != 2047) {
            field1024 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public static void method301(int arg0) {
        field1019 = null;
        field1010 = null;
        field1028 = null;
        field1024 = null;
        field1025 = null;
        if (arg0 != 0) {
            field1024 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZZIII)V")
    public static final void method302(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5) {
        class150.field2711++;
        if (!arg2) {
            class112.method737(true, false);
            class224.method1528(40, true);
            class112.method737(false, false);
        }
        field1027++;
        class224.method1528(-86, arg1);
        if (!arg2) {
            class96.method667(-47);
        }
        class143.method950(-30486);
        if (class89.field1772 == 1) {
            int var6 = class256.field4464;
            int var7 = class241.field4230 + class158.field2860 & 0x7FF;
            if (var6 < (class43.field928 / 256)) {
                var6 = class43.field928 / 256;
            }
            if (class49.field1062[4] && var6 < class165.field2998[4] + 128) {
                var6 = class165.field2998[4] + 128;
            }
            class168.method1112(var6, arg3, (var6 * 3) + 600, class120.method781(class12.field321, class229.field4018.field4688, false, class229.field4018.field4705) + -50, var7, class53.field1116, class207.field3743, (byte) -126);
        }
        int var8 = class127.field2357;
        int var9 = class152.field2738;
        int var10 = class87.field1750;
        int var11 = class73.field1528;
        int var12 = class215.field3816;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class49.field1062[var13]) {
                int var19 = (int) ((double) (class50.field1064[var13] * 2 + 1) * Math.random() + Math.sin((double) class208.field3770[var13] / 100.0D * (double) class161.field2944[var13]) * (double) class165.field2998[var13] - (double) class50.field1064[var13]);
                if (var13 == 2) {
                    class152.field2738 += var19;
                }
                if (var13 == 4) {
                    class73.field1528 += var19;
                    if (class73.field1528 < 128) {
                        class73.field1528 = 128;
                    }
                    if (class73.field1528 > 383) {
                        class73.field1528 = 383;
                    }
                }
                if (var13 == 0) {
                    class127.field2357 += var19;
                }
                if (var13 == 1) {
                    class87.field1750 += var19;
                }
                if (var13 == 3) {
                    class215.field3816 = class215.field3816 + var19 & 0x7FF;
                }
            }
        }
        class84.method561((byte) -74);
        class133.method881(arg4, arg5, arg0 + arg4, arg3 + arg5);
        class270.method1831();
        if (class2.field53 || arg4 > class122.field2269 || arg4 + arg0 <= class122.field2269 || arg5 > class5.field95 || class5.field95 >= (arg3 + arg5)) {
            class30.field743 = false;
            class228.field4002 = 0;
        } else {
            class228.field4002 = 0;
            class30.field743 = true;
            int var14 = class12.field337;
            int var15 = class126.field2332;
            class27.field708 = (class122.field2269 - arg4) * (var15 - var14) / arg0 + var14;
            int var16 = class99.field1907;
            int var17 = class111.field2094;
            class136.field2488 = (class5.field95 - arg5) * (var16 - var17) / arg3 + var17;
        }
        class61.method371((byte) 77);
        byte var18 = class100.method679((byte) -108) == 2 ? (byte) class150.field2711 : 1;
        class133.method865(arg4, arg5, arg0, arg3, 0);
        class180.method1206(class127.field2357, class87.field1750, class152.field2738, class73.field1528, class215.field3816, class214.field3812, class154.field2783, class145.field2651, class187.field3364, class77.field1580, class41.field917, class12.field321 + 1, var18, class229.field4018.field4688 >> 7, class229.field4018.field4705 >> 7);
        class61.method371((byte) 77);
        class126.method817();
        class194.method1278(256, 256, arg5, -7958, arg3, arg0, arg4);
        class71.method452(arg0, arg4, !arg1, arg3, arg5, 256, 256);
        ((class8) class270.field4764).method58(class187.field3369, 105);
        class164.method1079(arg4, arg5, arg3, arg0, 114);
        class127.field2357 = var8;
        class152.field2738 = var9;
        class73.field1528 = var11;
        class215.field3816 = var12;
        class87.field1750 = var10;
        if (class239.field4172 && class33.field806.method1037(-68) == 0) {
            class239.field4172 = false;
        }
        if (class239.field4172) {
            class133.method865(arg4, arg5, arg0, arg3, 0);
            class93.method656(-19472, class127.field2359, false);
        }
        if (!arg2 && !class239.field4172 && !class2.field53 && class122.field2269 >= arg4 && (arg0 + arg4) > class122.field2269 && class5.field95 >= arg5 && (arg5 + arg3) > class5.field95) {
            class19.method135(class122.field2269, arg3, arg5, 22899, class5.field95, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILsi;)Lrk;")
    public static final class259 method303(int arg0, class194 arg1) {
        if (arg0 != -29745) {
            method302(-34, true, false, -41, 94, 114);
        }
        field1015++;
        return new class259(arg1.method1298((byte) -103), arg1.method1298((byte) -85), arg1.method1298((byte) -77), arg1.method1298((byte) -92), arg1.method1277((byte) 27), arg1.method1301(-8317));
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZ)[I")
    public final int[] method304(int arg0, boolean arg1) {
        field1008++;
        if (arg1) {
            this.field1016 = -11;
        }
        if (this.field1014 == this.field1007) {
            this.field1029 = this.field1017[arg0] == null;
            this.field1017[arg0] = class1.field3;
            return this.field1023[arg0];
        } else if (this.field1007 == 1) {
            this.field1029 = this.field1026 != arg0;
            this.field1026 = arg0;
            return this.field1023[0];
        } else {
            class52 var3 = this.field1017[arg0];
            if (var3 == null) {
                this.field1029 = true;
                if (this.field1016 >= this.field1007) {
                    class52 var4 = (class52) this.field1021.method1877((byte) -98);
                    var3 = new class52(arg0, var4.field1113);
                    this.field1017[var4.field1108] = null;
                    var4.method1614(-1204826926);
                } else {
                    var3 = new class52(arg0, this.field1016);
                    this.field1016++;
                }
                this.field1017[arg0] = var3;
            } else {
                this.field1029 = false;
            }
            this.field1021.method1880((byte) -90, var3);
            return this.field1023[var3.field1113];
        }
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(II)Z")
    public static final boolean method305(int arg0, int arg1) {
        int var2 = -88 / ((arg0 - 48) / 61);
        field1020++;
        return (arg1 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)[[I")
    public final int[][] method306(byte arg0) {
        if (arg0 != -59) {
            method301(19);
        }
        field1022++;
        if (this.field1014 != this.field1007) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1007; var2++) {
            this.field1017[var2] = class1.field3;
        }
        return this.field1023;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(III)V")
    public class47(int arg0, int arg1, int arg2) {
        this.field1007 = arg0;
        this.field1023 = new int[this.field1007][arg2];
        this.field1014 = arg1;
        this.field1017 = new class52[this.field1014];
    }
}
