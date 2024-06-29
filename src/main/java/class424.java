import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class424 extends class120 {

    @OriginalMember(owner = "client!og", name = "m", descriptor = "Z")
    public boolean field5923 = false;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "Z")
    private boolean field5946 = false;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    private int field5955 = 0;

    @OriginalMember(owner = "client!og", name = "z", descriptor = "J")
    private long field5936;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "Lvq;")
    public class295 field5951;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "Lg;")
    public class97 field5954;

    @OriginalMember(owner = "client!og", name = "F", descriptor = "Lvt;")
    public class182 field5942;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "Lbc;")
    public class225 field5922;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "Lba;")
    public static class240 field5949 = new class240(64);

    @OriginalMember(owner = "client!og", name = "N", descriptor = "Lus;")
    public static class1 field5950 = new class1(30, -1);

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    private int field5921;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    private int field5925;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public int field5926;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "I")
    public int field5927;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "I")
    private int field5930;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "I")
    private int field5931;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "I")
    private int field5932;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "I")
    public int field5933;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "I")
    private int field5934;

    @OriginalMember(owner = "client!og", name = "y", descriptor = "I")
    private int field5935;

    @OriginalMember(owner = "client!og", name = "A", descriptor = "I")
    private int field5937;

    @OriginalMember(owner = "client!og", name = "B", descriptor = "I")
    private int field5938;

    @OriginalMember(owner = "client!og", name = "C", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!og", name = "D", descriptor = "I")
    private int field5940;

    @OriginalMember(owner = "client!og", name = "E", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!og", name = "G", descriptor = "I")
    private int field5943;

    @OriginalMember(owner = "client!og", name = "H", descriptor = "I")
    private int field5944;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "I")
    private int field5945;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "I")
    public int field5947;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    private int field5948;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    private int field5952;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    private int field5953;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BJ)V")
    public final void method2487(byte arg0, long arg1) {
        int var4 = 79 % ((42 - arg0) / 45);
        for (class468 var5 = (class468) this.field5922.method1449(119); var5 != null; var5 = (class468) this.field5922.method1450(0)) {
            var5.method2752(arg1);
        }
        field5941++;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
    public final void method2488(int arg0) {
        this.field5925 = this.field5951.field4271;
        field5956++;
        this.field5935 = this.field5951.field4272;
        this.field5921 = this.field5951.field4260;
        this.field5940 = this.field5951.field4274;
        if (arg0 != 0) {
            this.method2488(-67);
        }
        this.field5952 = this.field5951.field4267;
        this.field5934 = this.field5951.field4277;
        this.field5930 = this.field5951.field4268;
        this.field5948 = this.field5951.field4262;
        this.field5937 = this.field5951.field4270;
        if (this.field5940 == this.field5935 && this.field5935 == this.field5934 && this.field5948 == this.field5925 && this.field5948 == this.field5937 && this.field5952 == this.field5930 && this.field5952 == this.field5921) {
            this.field5946 = true;
            return;
        }
        this.field5946 = false;
        int var2 = (this.field5940 + this.field5935 + this.field5934) / 3;
        int var3 = (this.field5925 + this.field5948 + this.field5937) / 3;
        int var4 = (this.field5952 + this.field5930 + this.field5921) / 3;
        if (this.field5947 == var2 && this.field5927 == var3 && this.field5933 == var4) {
            return;
        }
        this.field5933 = var4;
        this.field5927 = var3;
        this.field5947 = var2;
        int var5 = this.field5935 - this.field5940;
        int var6 = this.field5948 - this.field5925;
        int var7 = this.field5952 - this.field5930;
        int var8 = this.field5934 - this.field5940;
        int var9 = this.field5937 - this.field5925;
        int var10 = this.field5921 - this.field5930;
        this.field5932 = var6 * var10 - var7 * var9;
        this.field5945 = var5 * var9 - (var6 * var8);
        this.field5953 = var7 * var8 - (var5 * var10);
        while (this.field5932 > 32767 || this.field5953 > 32767 || this.field5945 > 32767 || this.field5932 < -32767 || this.field5953 < -32767 || this.field5945 < -32767) {
            this.field5953 >>= 0x1;
            this.field5945 >>= 0x1;
            this.field5932 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field5932 * this.field5932 + this.field5953 * this.field5953 + this.field5945 * this.field5945));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field5932 = this.field5932 * 32767 / var11;
        this.field5945 = this.field5945 * 32767 / var11;
        this.field5953 = this.field5953 * 32767 / var11;
        if (this.field5942.field2701 <= 0 && this.field5942.field2700 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field5945, (double) this.field5932) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field5953, Math.sqrt((double) (this.field5945 * this.field5945 + this.field5932 * this.field5932))) * 2607.5945876176133D);
        this.field5944 = this.field5942.field2701 - this.field5942.field2648;
        this.field5943 = this.field5942.field2700 - this.field5942.field2694;
        this.field5938 = var12 + this.field5942.field2648 - (this.field5944 >> 1);
        this.field5931 = var13 + this.field5942.field2694 - (this.field5943 >> 1);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V")
    public static final void method2489(int arg0, int arg1) {
        field5939++;
        if (class171.field2491 == null || class171.field2491.length < arg0) {
            class171.field2491 = new int[arg0];
        }
        if (arg1 != 1) {
            method2490(-6, -32);
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)Z")
    public static final boolean method2490(int arg0, int arg1) {
        field5929++;
        if (arg1 >= -80) {
            return false;
        } else if (arg0 == 60 || arg0 == 19 || arg0 == 21 || arg0 == 25 || arg0 == 1003) {
            return true;
        } else {
            return arg0 == 49 || arg0 == 1007;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lqc;Lct;)V")
    public static final void method2491(class483 arg0, class88 arg1) {
        if (!arg1.field1089) {
            return;
        }
        short var2 = arg1.field1079;
        short var3 = arg1.field1077;
        byte var4 = arg1.field1074;
        byte var5 = arg1.field1080;
        int var6 = (var2 << class216.field3242) + class248.field3674;
        int var7 = (var3 << class216.field3242) + class248.field3674;
        class88[][] var8 = class330.field4786[var4];
        float var9;
        if (class53.field725 == class28.field388) {
            class456.field6417.method631(class178.field2556[0].method1209(var6, var7), class401.method2391(var2, var3), class347.method2171(var2, var3), class289.method1808(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class456.field6417.method686(3000.0F, var9 * 1.5F);
        if (arg1.field1084) {
            if (class427.field5976) {
                if (var4 > 0) {
                    class88 var10 = class330.field4786[var4 - 1][var2][var3];
                    if (var10 != null && var10.field1089) {
                        return;
                    }
                }
                if (var2 <= class58.field770 && var2 > class398.field5653) {
                    class88 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field1089 && (var11.field1084 || (arg1.field1075 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class58.field770 && var2 < class3.field32 - 1) {
                    class88 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field1089 && (var12.field1084 || (arg1.field1075 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class214.field3218 && var3 > class120.field1505) {
                    class88 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field1089 && (var13.field1084 || (arg1.field1075 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class214.field3218 && var3 < class466.field6557 - 1) {
                    class88 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field1089 && (var14.field1084 || (arg1.field1075 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class427.field5976 = true;
            }
            arg1.field1084 = false;
            if (arg1.field1088 != null) {
                class88 var15 = arg1.field1088;
                class456.field6417.method686(3000.0F, (201.5F - (float) (var15.field1080 + 1) * 50.0F) * 1.5F);
                if (!class320.method2050(var15.field1080, var2, var3)) {
                    class53.field725[var15.field1080].method1219(var2, var3);
                }
                class237 var16 = var15.field1078;
                if (var16 != null) {
                    if (class30.field400) {
                        if ((var16.field3560 & arg1.field1071) == 0) {
                            class135.method853(arg0, var4, var2, var3);
                        } else {
                            class276.method1736(arg0, var16.field3560, var5, var2, var3);
                        }
                        class456.field6417.method637(arg0.field6802, arg0.field6799);
                    }
                    var16.method120(0, class456.field6417);
                }
                for (class93 var17 = var15.field1068; var17 != null; var17 = var17.field1178) {
                    class304 var18 = var17.field1177;
                    if (var18 != null) {
                        if (class30.field400) {
                            class135.method853(arg0, var4, var2, var3);
                            class456.field6417.method637(arg0.field6802, arg0.field6799);
                        }
                        var18.method120(0, class456.field6417);
                    }
                }
                class456.field6417.method686(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class320.method2050(var5, var2, var3);
            if (var19) {
                class53.field725[var5].method1219(var2, var3);
                class405 var20 = arg1.field1070;
                if (var20 != null && var20.field5706) {
                    if (var20.field5707) {
                        class456.field6417.method686(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class30.field400) {
                        class135.method853(arg0, var4, var2, var3);
                        class456.field6417.method637(arg0.field6802, arg0.field6799);
                    }
                    class477 var21 = var20.method120(0, class456.field6417);
                    if (var21 != null) {
                        var21.field6694 = var20;
                        var21.field6695 = var4;
                        var21.field6693 = var2;
                        var21.field6697 = var3;
                        class437.field6070.method1444(var21, (byte) 111);
                    }
                    if (var20.field5707) {
                        class456.field6417.method686(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class237 var24 = arg1.field1078;
            class364 var25 = arg1.field1087;
            if (var24 != null || var25 != null) {
                if (class58.field770 == var2) {
                    var22++;
                } else if (class58.field770 < var2) {
                    var22 += 2;
                }
                if (class214.field3218 == var3) {
                    var22 += 3;
                } else if (class214.field3218 > var3) {
                    var22 += 6;
                }
                var23 = class204.field3043[var22];
                arg1.field1071 = class143.field1894[var22];
            }
            if (var24 != null) {
                if ((var24.field3560 & class163.field2414[var22]) == 0) {
                    arg1.field1083 = 0;
                } else if (var24.field3560 == 16) {
                    arg1.field1083 = 3;
                    arg1.field1085 = class81.field994[var22];
                    arg1.field1067 = (byte) (3 - arg1.field1085);
                } else if (var24.field3560 == 32) {
                    arg1.field1083 = 6;
                    arg1.field1085 = class279.field4121[var22];
                    arg1.field1067 = (byte) (6 - arg1.field1085);
                } else if (var24.field3560 == 64) {
                    arg1.field1083 = 12;
                    arg1.field1085 = class343.field4992[var22];
                    arg1.field1067 = (byte) (12 - arg1.field1085);
                } else {
                    arg1.field1083 = 9;
                    arg1.field1085 = class454.field6396[var22];
                    arg1.field1067 = (byte) (9 - arg1.field1085);
                }
                if ((var24.field3560 & var23) != 0 && !class362.method2241(var5, var2, var3, var24.field3560)) {
                    if (class30.field400) {
                        class135.method853(arg0, var4, var2, var3);
                        class456.field6417.method637(arg0.field6802, arg0.field6799);
                    }
                    class477 var26 = var24.method120(0, class456.field6417);
                    if (var26 != null) {
                        var26.field6694 = var24;
                        var26.field6695 = var4;
                        var26.field6693 = var2;
                        var26.field6697 = var3;
                        class437.field6070.method1444(var26, (byte) 112);
                    }
                }
                class237 var27 = arg1.field1082;
                if (var27 != null && (var27.field3560 & var23) != 0 && !class362.method2241(var5, var2, var3, var27.field3560)) {
                    if (class30.field400) {
                        class135.method853(arg0, var4, var2, var3);
                        class456.field6417.method637(arg0.field6802, arg0.field6799);
                    }
                    class477 var28 = var27.method120(0, class456.field6417);
                    if (var28 != null) {
                        var28.field6694 = var27;
                        var28.field6695 = var4;
                        var28.field6693 = var2;
                        var28.field6697 = var3;
                        class437.field6070.method1444(var28, (byte) 120);
                    }
                }
            }
            if (var25 != null && !class99.method564(var5, var2, var3, var25.method105(-111))) {
                class364 var29 = arg1.field1066;
                class456.field6417.method686(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field5241 & var23) != 0) {
                    if (class30.field400) {
                        class135.method853(arg0, var4, var2, var3);
                        class456.field6417.method637(arg0.field6802, arg0.field6799);
                    }
                    class477 var30 = var25.method120(0, class456.field6417);
                    if (var30 != null) {
                        var30.field6694 = var25;
                        var30.field6695 = var4;
                        var30.field6693 = var2;
                        var30.field6697 = var3;
                        class437.field6070.method1444(var30, (byte) 100);
                    }
                } else if (var25.field5241 == 256) {
                    int var31 = var25.field5244 - class132.field1743;
                    int var32 = var25.field5243 - class2.field21;
                    int var33 = var25.field5233;
                    int var34;
                    if (var33 == 1 || var33 == 2) {
                        var34 = -var31;
                    } else {
                        var34 = var31;
                    }
                    int var35;
                    if (var33 == 2 || var33 == 3) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    if (class30.field400) {
                        class135.method853(arg0, var4, var2, var3);
                        class456.field6417.method637(arg0.field6802, arg0.field6799);
                    }
                    if (var35 < var34) {
                        class477 var36 = var25.method120(0, class456.field6417);
                        if (var36 != null) {
                            var36.field6694 = var25;
                            var36.field6695 = var4;
                            var36.field6693 = var2;
                            var36.field6697 = var3;
                            class437.field6070.method1444(var36, (byte) 110);
                        }
                    } else if (var29 != null) {
                        class477 var37 = var29.method120(0, class456.field6417);
                        if (var37 != null) {
                            var37.field6694 = var29;
                            var37.field6695 = var4;
                            var37.field6693 = var2;
                            var37.field6697 = var3;
                            class437.field6070.method1444(var37, (byte) 102);
                        }
                    }
                }
                class456.field6417.method686(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class405 var38 = arg1.field1070;
                if (var38 != null && !var38.field5706) {
                    if (var38.field5707) {
                        class456.field6417.method686(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class30.field400) {
                        class135.method853(arg0, var4, var2, var3);
                        class456.field6417.method637(arg0.field6802, arg0.field6799);
                    }
                    class477 var39 = var38.method120(0, class456.field6417);
                    if (var39 != null) {
                        var39.field6694 = var38;
                        var39.field6695 = var4;
                        var39.field6693 = var2;
                        var39.field6697 = var3;
                        class437.field6070.method1444(var39, (byte) 125);
                    }
                    if (var38.field5707) {
                        class456.field6417.method686(3000.0F, var9 * 1.5F);
                    }
                }
                class37 var40 = arg1.field1086;
                if (var40 != null && !var40.field489) {
                    if (class30.field400) {
                        class135.method853(arg0, var4, var2, var3);
                        class456.field6417.method637(arg0.field6802, arg0.field6799);
                    }
                    class477 var41 = var40.method120(0, class456.field6417);
                    if (var41 != null) {
                        var41.field6694 = var40;
                        var41.field6695 = var4;
                        var41.field6693 = var2;
                        var41.field6697 = var3;
                        class437.field6070.method1444(var41, (byte) 115);
                    }
                }
            }
            byte var42 = arg1.field1075;
            if (var42 != 0) {
                if (var2 < class58.field770 && (var42 & 0x4) != 0) {
                    class88 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field1089) {
                        class405.field5702.method1050(0, var43);
                    }
                }
                if (var3 < class214.field3218 && (var42 & 0x2) != 0) {
                    class88 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field1089) {
                        class405.field5702.method1050(0, var44);
                    }
                }
                if (var2 > class58.field770 && (var42 & 0x1) != 0) {
                    class88 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field1089) {
                        class405.field5702.method1050(0, var45);
                    }
                }
                if (var3 > class214.field3218 && (var42 & 0x8) != 0) {
                    class88 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field1089) {
                        class405.field5702.method1050(0, var46);
                    }
                }
            }
        }
        if (arg1.field1083 != 0) {
            boolean var47 = true;
            for (class93 var48 = arg1.field1068; var48 != null; var48 = var48.field1178) {
                if (class258.field3772 != var48.field1177.field4321 && (var48.field1174 & arg1.field1083) == arg1.field1085) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class237 var49 = arg1.field1078;
                if (!class362.method2241(var5, var2, var3, var49.field3560)) {
                    if (class30.field400) {
                        label687: {
                            if (var49.field3560 >= 16) {
                                int var50 = var2 - class58.field770;
                                int var51 = var3 - class214.field3218;
                                if (var49.field3560 == 16) {
                                    int var52 = var50 - class248.field3674;
                                    int var53 = class248.field3674 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class360.field5188) {
                                        class135.method853(arg0, var4, var2 - 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var49.field3560 == 32) {
                                    int var54 = class248.field3674 + var50;
                                    int var55 = class248.field3674 + var51;
                                    if (var55 < -var54 && var2 < class287.field4186 && var3 < class360.field5188) {
                                        class135.method853(arg0, var4, var2 + 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var49.field3560 == 64) {
                                    int var56 = class248.field3674 + var50;
                                    int var57 = var51 - class248.field3674;
                                    if (var57 > var56 && var2 < class287.field4186 && var3 > 0) {
                                        class135.method853(arg0, var4, var2 + 1, var3 - 1);
                                        break label687;
                                    }
                                } else if (var49.field3560 == 128) {
                                    int var58 = var50 - class248.field3674;
                                    int var59 = var51 - class248.field3674;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class135.method853(arg0, var4, var2 - 1, var3 - 1);
                                        break label687;
                                    }
                                }
                            }
                            class135.method853(arg0, var4, var2, var3);
                        }
                        class456.field6417.method637(arg0.field6802, arg0.field6799);
                    }
                    class477 var60 = var49.method120(0, class456.field6417);
                    if (var60 != null) {
                        var60.field6694 = var49;
                        var60.field6695 = var4;
                        var60.field6693 = var2;
                        var60.field6697 = var3;
                        class437.field6070.method1444(var60, (byte) 122);
                    }
                }
                arg1.field1083 = 0;
            }
        }
        if (arg1.field1072) {
            try {
                arg1.field1072 = false;
                int var61 = 0;
                label630: for (class93 var62 = arg1.field1068; var62 != null; var62 = var62.field1178) {
                    class304 var63 = var62.field1177;
                    if (class258.field3772 != var63.field4321) {
                        for (int var64 = var63.field4330; var64 <= var63.field4328; var64++) {
                            for (int var65 = var63.field4324; var65 <= var63.field4334; var65++) {
                                class88 var66 = var8[var64][var65];
                                if (var66.field1084) {
                                    arg1.field1072 = true;
                                    continue label630;
                                }
                                if (var66.field1083 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field4330) {
                                        var67++;
                                    }
                                    if (var64 < var63.field4328) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field4324) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field4334) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field1083) == arg1.field1067) {
                                        arg1.field1072 = true;
                                        continue label630;
                                    }
                                }
                            }
                        }
                        int var68 = class58.field770 - var63.field4330;
                        int var69 = var63.field4328 - class58.field770;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class214.field3218 - var63.field4324;
                        int var71 = var63.field4334 - class214.field3218;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field6797[var61] = var63;
                        arg0.field6796[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class304 var75 = arg0.field6797[var74];
                        if (class258.field3772 != var75.field4321) {
                            int var76 = arg0.field6796[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field4331 - class132.field1743;
                                int var78 = var75.field4317 - class2.field21;
                                int var79 = arg0.field6797[var73].field4331 - class132.field1743;
                                int var80 = arg0.field6797[var73].field4317 - class2.field21;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class304 var81 = arg0.field6797[var73];
                    var81.field4321 = class258.field3772;
                    if (!class475.method2781(var5, var81.field4330, var81.field4328, var81.field4324, var81.field4334, var81.method323(0))) {
                        if (class30.field400) {
                            if (var81.field4336 == 0) {
                                class256.method1604(arg0, var4, var81.field4330, var81.field4324, var81.field4328, var81.field4334);
                            } else {
                                class135.method853(arg0, var4, var2, var3);
                                int var82 = var2 - class58.field770;
                                int var83 = var3 - class214.field3218;
                                if (var81.field4336 == 2) {
                                    if (var83 > -var82) {
                                        class48.method319(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class48.method319(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class48.method319(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class48.method319(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class456.field6417.method637(arg0.field6802, arg0.field6799);
                        }
                        class477 var84 = var81.method120(0, class456.field6417);
                        if (var84 != null) {
                            var84.field6694 = var81;
                            var84.field6695 = var4;
                            var84.field6693 = var81.field4330;
                            var84.field6697 = var81.field4324;
                            class437.field6070.method1444(var84, (byte) 110);
                        }
                    }
                    for (int var85 = var81.field4330; var85 <= var81.field4328; var85++) {
                        for (int var86 = var81.field4324; var86 <= var81.field4334; var86++) {
                            class88 var87 = var8[var85][var86];
                            if (var87.field1083 != 0) {
                                class405.field5702.method1050(0, var87);
                            } else if ((var2 != var85 || var3 != var86) && var87.field1089) {
                                class405.field5702.method1050(0, var87);
                            }
                        }
                    }
                }
                if (arg1.field1072) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field1072 = false;
            }
        }
        if (arg1.field1081 != null) {
            if ((byte) (class99.field1265 & 0xFF) == arg1.field1069) {
                class207 var88 = arg1.field1081;
                int var89 = class53.field725[var4].method1218(var2, var3);
                int var90;
                if (var4 < class314.field4441 - 1) {
                    var90 = class53.field725[var4].method1218(var2, var3) - class53.field725[var4 + 1].method1218(var2, var3);
                } else {
                    var90 = 1024;
                }
                class295.field4269.method1016(var6, var89, var7, arg0.field6801);
                int var91 = arg0.field6801[2];
                class295.field4269.method1016(var6, var89 - var90, var7, arg0.field6801);
                int var92 = arg0.field6801[2];
                int var93 = var91;
                int var94 = var92;
                if (var91 > var92) {
                    var93 = var92;
                    var94 = var91;
                }
                int var95 = var93 - class190.field2823;
                int var96 = class190.field2823 + var94;
                if (var95 < var96 - 1597) {
                    var95 = var96 - 1597;
                }
                var88.field3167 = var95;
                var88.field3169 = var96;
                var88.field3168 = true;
                class456.field6417.method621(var88);
            } else {
                arg1.field1081 = null;
            }
        }
        if (!arg1.field1089) {
            return;
        }
        if (arg1.field1083 != 0) {
            return;
        }
        if (var2 <= class58.field770 && var2 > class398.field5653) {
            class88 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field1089) {
                return;
            }
        }
        if (var2 >= class58.field770 && var2 < class3.field32 - 1) {
            class88 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field1089) {
                return;
            }
        }
        if (var3 <= class214.field3218 && var3 > class120.field1505) {
            class88 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field1089) {
                return;
            }
        }
        if (var3 >= class214.field3218 && var3 < class466.field6557 - 1) {
            class88 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field1089) {
                return;
            }
        }
        arg1.field1089 = false;
        class187.field2778--;
        class37 var101 = arg1.field1086;
        if (var101 != null && var101.field489) {
            if (class30.field400) {
                class135.method853(arg0, var4, var2, var3);
                class456.field6417.method637(arg0.field6802, arg0.field6799);
            }
            class477 var102 = var101.method120(0, class456.field6417);
            if (var102 != null) {
                var102.field6694 = var101;
                var102.field6695 = var4;
                var102.field6693 = var2;
                var102.field6697 = var3;
                class437.field6070.method1444(var102, (byte) 104);
            }
        }
        if (arg1.field1071 != 0) {
            class364 var103 = arg1.field1087;
            if (var103 != null && !class99.method564(var5, var2, var3, var103.method105(-109))) {
                if ((var103.field5241 & arg1.field1071) != 0) {
                    if (class30.field400) {
                        class135.method853(arg0, var4, var2, var3);
                        class456.field6417.method637(arg0.field6802, arg0.field6799);
                    }
                    class477 var104 = var103.method120(0, class456.field6417);
                    if (var104 != null) {
                        var104.field6694 = var103;
                        var104.field6695 = var4;
                        var104.field6693 = var2;
                        var104.field6697 = var3;
                        class437.field6070.method1444(var104, (byte) 126);
                    }
                } else if (var103.field5241 == 256) {
                    int var105 = var103.field5244 - class132.field1743;
                    int var106 = var103.field5243 - class2.field21;
                    int var107 = var103.field5233;
                    int var108;
                    if (var107 == 1 || var107 == 2) {
                        var108 = -var105;
                    } else {
                        var108 = var105;
                    }
                    int var109;
                    if (var107 == 2 || var107 == 3) {
                        var109 = -var106;
                    } else {
                        var109 = var106;
                    }
                    if (class30.field400) {
                        class135.method853(arg0, var4, var2, var3);
                        class456.field6417.method637(arg0.field6802, arg0.field6799);
                    }
                    class364 var110 = arg1.field1066;
                    if (var109 > var108) {
                        class477 var111 = var103.method120(0, class456.field6417);
                        if (var111 != null) {
                            var111.field6694 = var103;
                            var111.field6695 = var4;
                            var111.field6693 = var2;
                            var111.field6697 = var3;
                            class437.field6070.method1444(var111, (byte) 126);
                        }
                    } else if (var110 != null) {
                        class477 var112 = var110.method120(0, class456.field6417);
                        if (var112 != null) {
                            var112.field6694 = var110;
                            var112.field6695 = var4;
                            var112.field6693 = var2;
                            var112.field6697 = var3;
                            class437.field6070.method1444(var112, (byte) 103);
                        }
                    }
                }
            }
            class237 var113 = arg1.field1078;
            class237 var114 = arg1.field1082;
            if (var114 != null && (var114.field3560 & arg1.field1071) != 0 && !class362.method2241(var5, var2, var3, var114.field3560)) {
                if (class30.field400) {
                    class276.method1736(arg0, var114.field3560, var4, var2, var3);
                    class456.field6417.method637(arg0.field6802, arg0.field6799);
                }
                class477 var115 = var114.method120(0, class456.field6417);
                if (var115 != null) {
                    var115.field6694 = var114;
                    var115.field6695 = var4;
                    var115.field6693 = var2;
                    var115.field6697 = var3;
                    class437.field6070.method1444(var115, (byte) 114);
                }
            }
            if (var113 != null && (var113.field3560 & arg1.field1071) != 0 && !class362.method2241(var5, var2, var3, var113.field3560)) {
                if (class30.field400) {
                    class276.method1736(arg0, var113.field3560, var4, var2, var3);
                    class456.field6417.method637(arg0.field6802, arg0.field6799);
                }
                class477 var116 = var113.method120(0, class456.field6417);
                if (var116 != null) {
                    var116.field6694 = var113;
                    var116.field6695 = var4;
                    var116.field6693 = var2;
                    var116.field6697 = var3;
                    class437.field6070.method1444(var116, (byte) 99);
                }
            }
        }
        if (var4 < class314.field4441 - 1) {
            class88 var117 = class330.field4786[var4 + 1][var2][var3];
            if (var117 != null && var117.field1089) {
                class405.field5702.method1045(var117, 10389);
            }
        }
        if (var2 < class58.field770) {
            class88 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field1089) {
                class405.field5702.method1050(0, var118);
            }
        }
        if (var3 < class214.field3218) {
            class88 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field1089) {
                class405.field5702.method1050(0, var119);
            }
        }
        if (var2 > class58.field770) {
            class88 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field1089) {
                class405.field5702.method1050(0, var120);
            }
        }
        if (var3 > class214.field3218) {
            class88 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field1089) {
                class405.field5702.method1050(0, var121);
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
    public static void method2492(int arg0) {
        field5950 = null;
        field5949 = null;
        if (arg0 != 7915) {
            method2490(35, -54);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZJLnp;I)V")
    public final void method2493(int arg0, boolean arg1, long arg2, class313 arg3, int arg4) {
        if (this.field5923) {
            arg1 = false;
        } else if (class437.field6080 < this.field5942.field2652) {
            arg1 = false;
        } else if (class408.field5737 > class410.field5755[class437.field6080]) {
            arg1 = false;
        } else if (this.field5946) {
            arg1 = false;
        } else if (this.field5942.field2699 != -1) {
            int var7 = (int) (arg2 - this.field5936);
            if (this.field5942.field2653 || this.field5942.field2699 >= var7) {
                var7 %= this.field5942.field2699;
            } else {
                arg1 = false;
            }
            if (!this.field5942.field2640 && this.field5942.field2683 > var7) {
                arg1 = false;
            }
            if (this.field5942.field2640 && this.field5942.field2683 <= var7) {
                arg1 = false;
            }
        }
        field5924++;
        if (arg1) {
            this.field5955 += (int) ((double) arg0 * ((double) this.field5942.field2659 + (double) (this.field5942.field2689 - this.field5942.field2659) * Math.random()));
            if (this.field5955 > 63) {
                int var8 = this.field5955 >> 6;
                this.field5955 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field5942.field2701 <= 0 && this.field5942.field2700 <= 0) {
                        var10 = this.field5953;
                        var11 = this.field5932;
                        var12 = this.field5945;
                    } else {
                        int var13 = this.field5938 + (int) ((double) this.field5944 * Math.random());
                        int var14 = var13 & 0x3FFF;
                        int var15 = class53.field727[var14];
                        int var16 = class53.field726[var14];
                        int var17 = (int) ((double) this.field5943 * Math.random()) + this.field5931;
                        int var18 = var17 & 0x1FFF;
                        int var19 = class53.field727[var18];
                        var11 = var16 * var19 >> 15;
                        int var20 = class53.field726[var18];
                        var12 = var15 * var19 >> 15;
                        var10 = var20 * -1;
                    }
                    int var21 = (int) (Math.random() * 65535.0D);
                    int var22 = (int) (Math.random() * 65535.0D);
                    if ((var21 + var22) > 65535) {
                        var22 = 65535 - var22;
                        var21 = 65535 - var21;
                    }
                    int var23 = 65535 - var21 - var22;
                    int var24 = this.field5940 * var21 - (-(this.field5935 * var22) - this.field5934 * var23) >> 16;
                    int var25 = this.field5937 * var23 + this.field5948 * var22 + this.field5925 * var21 >> 16;
                    int var26 = this.field5930 * var21 + this.field5952 * var22 + this.field5921 * var23 >> 16;
                    int var27 = this.field5942.field2642 + ((int) (Math.random() * (double) (this.field5942.field2692 - this.field5942.field2642)));
                    int var28 = (int) ((double) (this.field5942.field2655 - this.field5942.field2649) * Math.random()) + this.field5942.field2649;
                    int var29 = this.field5942.field2670 + (int) (Math.random() * (double) (this.field5942.field2635 - this.field5942.field2670));
                    int var32;
                    if (this.field5942.field2671) {
                        double var30 = Math.random();
                        var32 = (int) ((double) this.field5942.field2643 * var30 + (double) this.field5942.field2678) | (int) ((double) this.field5942.field2686 * var30 + (double) this.field5942.field2664) << 8 | (int) ((double) this.field5942.field2687 * var30 + (double) this.field5942.field2673) << 16 | (int) ((double) this.field5942.field2682 * Math.random() + (double) this.field5942.field2638) << 24;
                    } else {
                        var32 = (int) ((double) this.field5942.field2638 + (double) this.field5942.field2682 * Math.random()) << 24 | (int) ((double) this.field5942.field2678 + (double) this.field5942.field2643 * Math.random()) | (int) (Math.random() * (double) this.field5942.field2686 + (double) this.field5942.field2664) << 8 | (int) ((double) this.field5942.field2673 + Math.random() * (double) this.field5942.field2687) << 16;
                    }
                    int var33 = this.field5942.field2657;
                    if (!arg3.method640() && !this.field5942.field2651) {
                        var33 = -1;
                    }
                    if (class262.field3841 == class167.field2444) {
                        new class468(this, var24, var25, var26, var11, var10, var12, var27, var28, var32, var29, var33, this.field5942.field2696);
                    } else {
                        class468 var35 = class164.field2424[class262.field3841];
                        class262.field3841 = class262.field3841 + 1 & 0x3FF;
                        var35.method2753(this, var24, var25, var26, var11, var10, var12, var27, var28, var32, var29, var33, this.field5942.field2696);
                    }
                }
            }
        }
        this.field5926 = 0;
        if (arg4 < 98) {
            this.field5922 = null;
        }
        for (class468 var36 = (class468) this.field5922.method1449(124); var36 != null; var36 = (class468) this.field5922.method1450(0)) {
            var36.method2756(arg2, arg0);
            this.field5926++;
        }
        class382.field5451 += this.field5926;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lnp;Lvq;Lg;J)V")
    public class424(class313 arg0, class295 arg1, class97 arg2, long arg3) {
        this.field5936 = arg3;
        this.field5951 = arg1;
        this.field5954 = arg2;
        this.field5942 = class481.method2816(this.field5951.field4278, 126);
        if (!arg0.method640() && this.field5942.field2644 != -1) {
            this.field5942 = class481.method2816(this.field5942.field2644, 100);
        }
        this.field5922 = new class225();
        this.field5955 = (int) ((double) this.field5955 + Math.random() * 64.0D);
        this.method2488(0);
    }
}
