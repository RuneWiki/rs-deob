import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class136 extends class317 {

    @OriginalMember(owner = "client!cl", name = "W", descriptor = "I")
    private int field1884 = -1;

    @OriginalMember(owner = "client!cl", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field1886 = "Unable to find ";

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!cl", name = "K", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!cl", name = "M", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!cl", name = "O", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "I")
    public int field1877;

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!cl", name = "S", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!cl", name = "T", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!cl", name = "U", descriptor = "I")
    public int field1882;

    @OriginalMember(owner = "client!cl", name = "X", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!cl", name = "V", descriptor = "[I")
    public int[] field1883;

    @OriginalMember(owner = "client!cl", name = "N", descriptor = "[Lco;")
    public static class280[] field1875;

    @OriginalMember(owner = "client!cl", name = "Z", descriptor = "[[[B")
    public static byte[][][] field1887;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIII)I", line = 14)
    public static final int method986(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = -50 % ((12 - arg6) / 56);
        if ((arg1 & 0x1) == 1) {
            int var8 = arg2;
            arg2 = arg5;
            arg5 = var8;
        }
        field1880++;
        int var9 = arg0 & 0x3;
        if (var9 == 0) {
            return arg4;
        } else if (var9 == 1) {
            return arg3;
        } else if (var9 == 2) {
            return (7 - arg4) + 1 - arg2;
        } else {
            return 7 + 1 - arg5 - arg3;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V", line = 43)
    public final void method379(boolean arg0) {
        super.method379(arg0);
        field1881++;
        this.field1883 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)[[I", line = 55)
    public int[][] method53(int arg0, int arg1) {
        field1878++;
        int var3 = -71 % ((-arg0 - 31) / 37);
        int[][] var4 = this.field4840.method1625(arg1, -13241);
        if (this.field4840.field3352 && this.method988(0)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int var7 = (class340.field5109 == this.field1877 ? arg1 : this.field1877 * arg1 / class340.field5109) * this.field1882;
            int[] var8 = var4[2];
            if (class326.field4933 == this.field1882) {
                for (int var12 = 0; var12 < class326.field4933; var12++) {
                    int var13 = this.field1883[var7++];
                    var8[var12] = class47.method303(255, var13) << 4;
                    var6[var12] = class47.method303(var13 >> 4, 4080);
                    var5[var12] = class47.method303(var13, 16711680) >> 12;
                }
            } else {
                for (int var9 = 0; var9 < class326.field4933; var9++) {
                    int var10 = this.field1882 * var9 / class326.field4933;
                    int var11 = this.field1883[var7 + var10];
                    var8[var9] = class47.method303(var11 << 4, 4080);
                    var6[var9] = class47.method303(var11 >> 4, 4080);
                    var5[var9] = class47.method303(var11, 16711680) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(II)V", line = 129)
    public static final void method987(int arg0, int arg1) {
        int var2 = class292.field4352;
        field1874++;
        if (arg1 == 0) {
            var2 = 1;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class241 var4;
            if (arg1 == 0) {
                var4 = class173.field2356;
            } else {
                var4 = class169.field2306[class4.field35[var3]];
            }
            if (var4 != null && var4.method1652((byte) -50)) {
                int var5 = var4.method1653(-1);
                if (arg1 == 0 || arg1 == var5) {
                    if (var5 == 1) {
                        if ((var4.field3745 & 0x7F) == 64 && (var4.field3679 & 0x7F) == 64) {
                            int var6 = var4.field3745 >> 7;
                            int var7 = var4.field3679 >> 7;
                            if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                                var10002 = class203.field2908[var6][var7]++;
                            }
                        }
                    } else if (((var5 & 0x1) != 0 || (var4.field3745 & 0x7F) == 0 && (var4.field3679 & 0x7F) == 0) && ((var5 & 0x1) != 1 || (var4.field3745 & 0x7F) == 64 && (var4.field3679 & 0x7F) == 64)) {
                        int var8 = var4.field3679 - (var5 * 64) >> 7;
                        int var9 = var4.field3745 - (var5 * 64) >> 7;
                        int var10 = var4.method1653(-1) + var9;
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        int var11 = var8 + var4.method1653(-1);
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        if (var11 > 104) {
                            var11 = 104;
                        }
                        if (var10 > 104) {
                            var10 = 104;
                        }
                        for (int var12 = var9; var12 < var10; var12++) {
                            for (int var13 = var8; var13 < var11; var13++) {
                                var10002 = class203.field2908[var12][var13]++;
                            }
                        }
                    }
                }
            }
        }
        label221: for (int var14 = 0; var14 < var2; var14++) {
            class241 var15;
            long var16;
            if (arg1 == 0) {
                var15 = class173.field2356;
                var16 = 8791798054912L;
            } else {
                var15 = class169.field2306[class4.field35[var14]];
                var16 = (long) class4.field35[var14] << 32;
            }
            if (var15 != null && var15.method1652((byte) -50)) {
                int var18 = var15.method1653(-1);
                if (arg1 == 0 || arg1 == var18) {
                    var15.field3446 = false;
                    var15.field3736 = true;
                    if ((class99.field1354 && class292.field4352 > 200 || class292.field4352 > 50) && arg1 != 0 && var15.field3719 == var15.method1753(-1).field2665) {
                        var15.field3446 = true;
                    }
                    if (var18 == 1) {
                        if ((var15.field3745 & 0x7F) == 64 && (var15.field3679 & 0x7F) == 64) {
                            int var19 = var15.field3745 >> 7;
                            int var20 = var15.field3679 >> 7;
                            if (var19 < 0 || var19 >= 104 || var20 < 0 || var20 >= 104) {
                                continue;
                            }
                            if (class203.field2908[var19][var20] > 1) {
                                var10002 = class203.field2908[var19][var20]--;
                                continue;
                            }
                        }
                    } else if ((var18 & 0x1) == 0 && (var15.field3745 & 0x7F) == 0 && (var15.field3679 & 0x7F) == 0 || (var18 & 0x1) == 1 && (var15.field3745 & 0x7F) == 64 && (var15.field3679 & 0x7F) == 0) {
                        int var21 = var15.field3745 - (var18 * 64) >> 7;
                        int var22 = var15.field3679 - var18 * 64 >> 7;
                        int var23 = var22 + var18;
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        if (var23 > 104) {
                            var23 = 104;
                        }
                        boolean var24 = true;
                        int var25 = var18 + var21;
                        if (var25 > 104) {
                            var25 = 104;
                        }
                        if (var21 < 0) {
                            var21 = 0;
                        }
                        for (int var26 = var21; var26 < var25; var26++) {
                            for (int var27 = var22; var27 < var23; var27++) {
                                if (class203.field2908[var26][var27] <= 1) {
                                    var24 = false;
                                    break;
                                }
                            }
                        }
                        if (var24) {
                            int var28 = var21;
                            while (true) {
                                if (var25 <= var28) {
                                    continue label221;
                                }
                                for (int var29 = var22; var29 < var23; var29++) {
                                    var10002 = class203.field2908[var28][var29]--;
                                }
                                var28++;
                            }
                        }
                    }
                    if (var15.field3717 == null || var15.field3691 > class329.field4966 || class329.field4966 >= var15.field3748) {
                        var15.field3736 = false;
                        var15.field3761 = class135.method985(var15.field3679, class251.field3603, var15.field3745, (byte) -124);
                        class126.method913(class251.field3603, var15.field3745, var15.field3679, var15.field3761, (var18 - 1) * 64 + 60, var15, var15.field3746, var16, var15.field3698);
                    } else {
                        var15.field3446 = false;
                        var15.field3736 = false;
                        var15.field3761 = class135.method985(var15.field3679, class251.field3603, var15.field3745, (byte) -82);
                        class302.method2059(class251.field3603, var15.field3745, var15.field3679, var15.field3761, var15, var15.field3746, var16, var15.field3754, var15.field3764, var15.field3747, var15.field3729);
                    }
                }
            }
        }
        if (arg0 >= -103) {
            method986(-91, -99, -81, 10, 78, 74, -103);
        }
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)Z", line = 390)
    public final boolean method988(int arg0) {
        field1879++;
        if (this.field1883 != null) {
            return true;
        } else if (arg0 != 0) {
            return false;
        } else if (this.field1884 < 0) {
            return false;
        } else {
            class178 var2 = class21.field273 < 0 ? class138.method996(this.field1884, class42.field486, 59) : class315.method2151(class42.field486, class21.field273, arg0 ^ 0x79, this.field1884);
            var2.method1227();
            this.field1883 = var2.field2403;
            this.field1877 = var2.field2317;
            this.field1882 = var2.field2323;
            return true;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lkm;BLkm;)V", line = 416)
    public static final void method989(class133 arg0, byte arg1, class133 arg2) {
        class15.field173 = arg0;
        class123.field1669 = arg2;
        if (arg1 != -35) {
            method993(25);
        }
        field1885++;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)I", line = 428)
    public final int method990(int arg0) {
        if (arg0 >= -100) {
            return 44;
        } else {
            field1872++;
            return this.field1884;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BIIII)V", line = 440)
    public static final void method991(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class312.field4712 = class20.field258 * arg3 / arg2;
        class210.field3044 = -1;
        field1873++;
        class170.field2315 = class56.field765 * arg1 / arg4;
        class126.field1721 = -1;
        if (arg0 != 22) {
            method992(-52);
        }
        class93.method699(116);
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V", line = 473)
    public class136() {
        super(0, false);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lcg;II)V", line = 460)
    public final void method60(class316 arg0, int arg1, int arg2) {
        field1876++;
        if (arg2 == 0) {
            this.field1884 = arg0.method2220((byte) 46);
        }
        int var4 = -82 / ((-arg1 - 17) / 40);
    }

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "(I)I", line = 478)
    public static final int method992(int arg0) {
        field1871++;
        if (arg0 != 127) {
            method987(-61, 87);
        }
        return class106.field1427;
    }

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "(I)V", line = 493)
    public static void method993(int arg0) {
        field1887 = (byte[][][]) null;
        field1875 = null;
        if (arg0 <= 60) {
            field1886 = (String) null;
        }
        field1886 = null;
    }
}
