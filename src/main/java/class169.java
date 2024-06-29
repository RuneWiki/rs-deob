import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class169 extends class59 {

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
    private int field2789 = 0;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "I")
    private int field2785 = 0;

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "I")
    private int field2794 = 2000;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
    private int field2788 = 4096;

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "I")
    private int field2797 = 16;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "I")
    public static int field2786 = 0;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "Lph;")
    public static class229 field2791 = class266.method1858(" zuerst von Ihrer Ignorieren)2Liste(Q", 0);

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "Lue;")
    public static class235 field2795;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "(I)V", line = 8)
    public static void method1237(int arg0) {
        field2791 = null;
        field2795 = null;
        if (arg0 < 98) {
            method1237(-32);
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(ZI)Lkm;", line = 19)
    public static final class59 method1238(boolean arg0, int arg1) {
        field2793++;
        if (arg1 == 0) {
            return new class185();
        } else if (arg1 == 1) {
            return new class272();
        } else if (arg1 == 2) {
            return new class121();
        } else if (arg1 == 3) {
            return new class234();
        } else if (arg1 == 4) {
            return new class10();
        } else if (arg1 == 5) {
            return new class294();
        } else if (arg1 == 6) {
            return new class232();
        } else if (arg1 == 7) {
            return new class241();
        } else if (arg1 == 8) {
            return new class167();
        } else if (arg1 == 9) {
            return new class238();
        } else if (arg1 == 10) {
            return new class287();
        } else if (arg1 == 11) {
            return new class19();
        } else if (arg1 == 12) {
            return new class290();
        } else if (arg1 == 13) {
            return new class135();
        } else if (arg1 == 14) {
            return new class175();
        } else if (arg1 == 15) {
            return new class325();
        } else if (arg1 == 16) {
            return new class52();
        } else if (arg1 == 17) {
            return new class122();
        } else if (arg1 == 18) {
            return new class304();
        } else if (arg1 == 19) {
            return new class171();
        } else if (arg1 == 20) {
            return new class181();
        } else if (arg1 == 21) {
            return new class132();
        } else if (arg1 == 22) {
            return new class131();
        } else if (arg1 == 23) {
            return new class75();
        } else if (arg1 == 24) {
            return new class147();
        } else if (arg1 == 25) {
            return new class213();
        } else if (arg1 == 26) {
            return new class94();
        } else if (arg1 == 27) {
            return new class95();
        } else if (arg1 == 28) {
            return new class176();
        } else if (arg1 == 29) {
            return new class257();
        } else if (arg1 == 30) {
            return new class113();
        } else if (arg1 == 31) {
            return new class177();
        } else if (arg1 == 32) {
            return new class190();
        } else if (arg1 == 33) {
            return new class320();
        } else if (arg1 == 34) {
            return new class262();
        } else if (arg1 == 35) {
            return new class255();
        } else if (arg1 == 36) {
            return new class146();
        } else if (arg1 == 37) {
            return new class280();
        } else if (arg1 == 38) {
            return new class169();
        } else if (arg1 == 39) {
            return new class329();
        } else {
            if (arg0) {
                method1239(88, 51, 1, 86, 48, -119, (class301[]) null, -107, 110, -98);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V", line = 339)
    public class169() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BILhb;)V", line = 345)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        if (arg0 != 115) {
            return;
        }
        if (arg1 == 0) {
            this.field2785 = arg2.method1178(8);
        } else if (arg1 == 1) {
            this.field2794 = arg2.method1161(true);
        } else if (arg1 == 2) {
            this.field2797 = arg2.method1178(arg0 - 107);
        } else if (arg1 == 3) {
            this.field2789 = arg2.method1161(true);
        } else if (arg1 == 4) {
            this.field2788 = arg2.method1161(true);
        }
        field2787++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIII[Lri;III)V", line = 409)
    public static final void method1239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class301[] arg6, int arg7, int arg8, int arg9) {
        field2792++;
        if (class99.field1675) {
            class212.method1502(arg2, arg5, arg0, arg1);
        } else {
            class210.method1472(arg2, arg5, arg0, arg1);
            class310.method2095();
        }
        int var10 = 0;
        if (arg7 != -1) {
            method1239(77, -45, 38, -64, 124, 52, (class301[]) null, 95, 107, 49);
        }
        while (var10 < arg6.length) {
            class301 var11 = arg6[var10];
            if (var11 != null && (var11.field5040 == arg4 || arg4 == -1412584499 && class233.field3851 == var11)) {
                int var12;
                if (arg3 == -1) {
                    class311.field5222[class15.field186] = var11.field5049 + arg8;
                    class300.field4875[class15.field186] = var11.field4991 + arg9;
                    class113.field1921[class15.field186] = var11.field4923;
                    class45.field691[class15.field186] = var11.field4882;
                    var12 = class15.field186++;
                } else {
                    var12 = arg3;
                }
                var11.field5012 = class319.field5393;
                var11.field4964 = var12;
                if (!var11.field5043 || !client.method2171(var11)) {
                    label1102: {
                        if (var11.field4996 > 0) {
                            class88.method660(var11, 0);
                        }
                        int var13 = var11.field4991 + arg9;
                        int var14 = var11.field5049 + arg8;
                        int var15 = var11.field4986;
                        if (class40.field647 && (client.method2168(var11) != 0 || var11.field4920 == 0) && var15 > 127) {
                            var15 = 127;
                        }
                        if (class233.field3851 == var11) {
                            if (arg4 != -1412584499 && !var11.field4997) {
                                class235.field3866 = arg9;
                                class184.field2993 = arg6;
                                class129.field2113 = arg8;
                                break label1102;
                            }
                            if (class185.field2999 && class44.field679) {
                                int var16 = class118.field1985;
                                int var17 = var16 - class138.field2235;
                                if (var17 < class107.field1815) {
                                    var17 = class107.field1815;
                                }
                                if (class107.field1815 + class126.field2098.field4923 < var17 - -var11.field4923) {
                                    var17 = class107.field1815 + class126.field2098.field4923 - var11.field4923;
                                }
                                var14 = var17;
                                int var18 = class220.field3617;
                                int var19 = var18 - class105.field1790;
                                if (class58.field817 > var19) {
                                    var19 = class58.field817;
                                }
                                if (var11.field4882 + var19 > class58.field817 - -class126.field2098.field4882) {
                                    var19 = class58.field817 + class126.field2098.field4882 - var11.field4882;
                                }
                                var13 = var19;
                            }
                            if (!var11.field4997) {
                                var15 = 128;
                            }
                        }
                        int var20;
                        int var21;
                        int var24;
                        int var25;
                        if (var11.field4920 == 2) {
                            var20 = arg5;
                            var21 = arg2;
                            var24 = arg0;
                            var25 = arg1;
                        } else {
                            var20 = arg5 < var13 ? var13 : arg5;
                            var21 = arg2 < var14 ? var14 : arg2;
                            int var22 = var11.field4923 + var14;
                            int var23 = var11.field4882 + var13;
                            if (var11.field4920 == 9) {
                                var23++;
                                var22++;
                            }
                            var24 = arg0 > var22 ? var22 : arg0;
                            var25 = var23 < arg1 ? var23 : arg1;
                        }
                        if (!var11.field5043 || var21 < var24 && var25 > var20) {
                            label1113: {
                                if (var11.field4996 != 0) {
                                    if (var11.field4996 == 1337 || var11.field4996 == 1403 && class99.field1675) {
                                        class173.field2826 = var13;
                                        class52.field742 = var11;
                                        class257.field4299 = var14;
                                        class164.method1201(var11.field4923, var13, var11.field4996 == 1403, true, var11.field4882, var14);
                                        if (class99.field1675) {
                                            class212.method1502(arg2, arg5, arg0, arg1);
                                        } else {
                                            class210.method1472(arg2, arg5, arg0, arg1);
                                        }
                                        break label1113;
                                    }
                                    if (var11.field4996 == 1338) {
                                        if (!var11.method2027(-25616)) {
                                            break label1113;
                                        }
                                        class227.method1583(var14, var11, (byte) -77, var12, var13);
                                        if (class99.field1675) {
                                            class212.method1502(arg2, arg5, arg0, arg1);
                                        } else {
                                            class210.method1472(arg2, arg5, arg0, arg1);
                                        }
                                        if (class7.field97 != 0 && class7.field97 != 3 || class186.field3027 || var21 > class18.field248 || var20 > class312.field5254 || var24 <= class18.field248 || class312.field5254 >= var25) {
                                            break label1113;
                                        }
                                        int var26 = class312.field5254 - var13;
                                        int var27 = class18.field248 - var14;
                                        int var28 = var11.field4886[var26];
                                        if (var28 > var27 || (var11.field4974[var26] + var28) < var27) {
                                            break label1113;
                                        }
                                        int var29 = var27 - var11.field4923 / 2;
                                        int var30 = var26 - var11.field4882 / 2;
                                        int var31 = class249.field4134 + class147.field2379 & 0x7FF;
                                        int var32 = class310.field5197[var31];
                                        int var33 = (class260.field4341 + 256) * var32 >> 8;
                                        int var34 = class310.field5199[var31];
                                        int var35 = (class260.field4341 + 256) * var34 >> 8;
                                        int var36 = var29 * var33 + var30 * var35 >> 11;
                                        int var37 = class230.field3820.field5147 + var36 >> 7;
                                        int var38 = var30 * var33 - (var29 * var35) >> 11;
                                        int var39 = class230.field3820.field5168 - var38 >> 7;
                                        if (class8.field103 && (class208.field3434 & 0x40) != 0) {
                                            class301 var40 = class167.method1224(class165.field2701, 107, class45.field689);
                                            if (var40 == null) {
                                                class135.method959((byte) 126);
                                            } else {
                                                class306.method2067(var39, class192.field3170, class116.field1965, var37, (short) 1, 1L, 0);
                                            }
                                            break label1113;
                                        }
                                        if (class166.field2710 == 1) {
                                            class306.method2067(var39, class134.field2172, class97.field1630, var37, (short) 25, 1L, 0);
                                        }
                                        class306.method2067(var39, class134.field2172, class230.field3828, var37, (short) 48, 1L, 0);
                                        break label1113;
                                    }
                                    if (var11.field4996 == 1339) {
                                        if (var11.method2027(arg7 - 25615)) {
                                            class319.method2154(var14, var13, (byte) 57, var12, var11);
                                            if (class99.field1675) {
                                                class212.method1502(arg2, arg5, arg0, arg1);
                                            } else {
                                                class210.method1472(arg2, arg5, arg0, arg1);
                                            }
                                        }
                                        break label1113;
                                    }
                                    if (var11.field4996 == 1400) {
                                        class114.method867(var11.field4923, var14, var13, 49, var11.field4882);
                                        class187.field3036[var12] = true;
                                        class189.field3067[var12] = true;
                                        if (class99.field1675) {
                                            class212.method1502(arg2, arg5, arg0, arg1);
                                        } else {
                                            class210.method1472(arg2, arg5, arg0, arg1);
                                        }
                                        break label1113;
                                    }
                                    if (var11.field4996 == 1401) {
                                        class290.method1984(false, var11.field4882, var13, var11.field4923, var14);
                                        class187.field3036[var12] = true;
                                        class189.field3067[var12] = true;
                                        if (class99.field1675) {
                                            class212.method1502(arg2, arg5, arg0, arg1);
                                        } else {
                                            class210.method1472(arg2, arg5, arg0, arg1);
                                        }
                                        break label1113;
                                    }
                                    if (var11.field4996 == 1402) {
                                        if (!class99.field1675) {
                                            class136.method974((byte) -122, var14, var13);
                                            class187.field3036[var12] = true;
                                            class189.field3067[var12] = true;
                                        }
                                        break label1113;
                                    }
                                    if (var11.field4996 == 1405) {
                                        if (!class54.field785) {
                                            break label1113;
                                        }
                                        int var41 = var13 + 15;
                                        int var42 = 16776960;
                                        int var43 = var11.field4923 + var14;
                                        class237.field3905.method250(class248.method1746(8528, new class229[] { class72.field1235, class50.method354(arg7 + 1, class16.field189) }), var43, var41, 16776960, -1);
                                        int var141 = var41 + 15;
                                        Runtime var44 = Runtime.getRuntime();
                                        int var45 = (int) ((var44.totalMemory() - var44.freeMemory()) / 1024L);
                                        if (var45 > 65536) {
                                            var42 = 16711680;
                                        }
                                        class237.field3905.method250(class248.method1746(arg7 ^ 0xFFFFDEAF, new class229[] { class83.field1425, class50.method354(0, var45), class329.field5609 }), var43, var141, var42, -1);
                                        var41 = var141 + 15;
                                        if (class99.field1675) {
                                            int var46 = (class274.field4581 + class274.field4580 + class274.field4578) / 1024;
                                            int var47 = 16776960;
                                            if (var46 > 65536) {
                                                var47 = 16711680;
                                            }
                                            class237.field3905.method250(class248.method1746(8528, new class229[] { class177.field2919, class50.method354(0, var46), class329.field5609 }), var43, var41, var47, -1);
                                            var41 += 15;
                                        }
                                        int var48 = 16776960;
                                        int var49 = 0;
                                        int var50 = 0;
                                        int var51 = 0;
                                        for (int var52 = 0; var52 < 28; var52++) {
                                            var49 += class180.field2955[var52].method1679((byte) 1);
                                            var50 += class180.field2955[var52].method1671(0);
                                            var51 += class180.field2955[var52].method1669((byte) -1);
                                        }
                                        int var53 = var51 * 100 / var49;
                                        int var54 = var50 * 10000 / var49;
                                        class229 var55 = class248.method1746(8528, new class229[] { class36.field598, class205.method1432(2, 0, (long) var54, -102, true), class48.field707, class50.method354(~arg7, var53), class193.field3189 });
                                        class325.field5552.method250(var55, var43, var41, var48, -1);
                                        var41 += 12;
                                        if (class194.field3198 > 0) {
                                            class325.field5552.method250(class248.method1746(arg7 + 8529, new class229[] { class259.field4328, class50.method354(0, class194.field3206), class29.field475, class50.method354(0, class194.field3198) }), var43, var41, var48, -1);
                                        }
                                        var41 += 12;
                                        class187.field3036[var12] = true;
                                        class189.field3067[var12] = true;
                                        break label1113;
                                    }
                                    if (var11.field4996 == 1406) {
                                        class82.field1336 = var11;
                                        class114.field1941 = var13;
                                        class147.field2382 = var14;
                                        break label1113;
                                    }
                                }
                                if (!class186.field3027) {
                                    if (var11.field4920 == 0 && var11.field4935 && var21 <= class18.field248 && class312.field5254 >= var20 && var24 > class18.field248 && class312.field5254 < var25 && !class40.field647) {
                                        class53.field748[0] = 1006;
                                        class314.field5337 = 1;
                                        class94.field1579[0] = class135.field2188;
                                        class141.field2282[0] = class134.field2172;
                                    }
                                    if (class18.field248 >= var21 && var20 <= class312.field5254 && var24 > class18.field248 && class312.field5254 < var25) {
                                        class153.method1113(class312.field5254 - var13, (byte) -56, var11, class18.field248 - var14);
                                    }
                                }
                                if (var11.field4920 == 0) {
                                    if (!var11.field5043 && client.method2171(var11) && class181.field2967 != var11) {
                                        break label1113;
                                    }
                                    if (!var11.field5043) {
                                        if (var11.field4897 > (var11.field4877 - var11.field4882)) {
                                            var11.field4897 = var11.field4877 - var11.field4882;
                                        }
                                        if (var11.field4897 < 0) {
                                            var11.field4897 = 0;
                                        }
                                    }
                                    method1239(var24, var25, var21, var12, var11.field4948, var20, arg6, arg7 ^ 0x0, var14 - var11.field4937, -var11.field4897 + var13);
                                    if (var11.field4955 != null) {
                                        method1239(var24, var25, var21, var12, var11.field4948, var20, var11.field4955, -1, var14 - var11.field4937, -var11.field4897 + var13);
                                    }
                                    class48 var56 = (class48) class251.field4176.method713(3365, (long) var11.field4948);
                                    if (var56 != null) {
                                        if (var56.field699 == 0 && !class186.field3027 && var21 <= class18.field248 && var20 <= class312.field5254 && class18.field248 < var24 && var25 > class312.field5254 && !class40.field647) {
                                            class53.field748[0] = 1006;
                                            class314.field5337 = 1;
                                            class94.field1579[0] = class135.field2188;
                                            class141.field2282[0] = class134.field2172;
                                        }
                                        class184.method1298(var21, var24, var13, 24, var12, var25, var56.field700, var14, var20);
                                    }
                                    if (class99.field1675) {
                                        class212.method1502(arg2, arg5, arg0, arg1);
                                    } else {
                                        class210.method1472(arg2, arg5, arg0, arg1);
                                        class310.method2095();
                                    }
                                }
                                if (class214.field3529[var12] || class114.field1934 > 1) {
                                    if (var11.field4920 == 0 && !var11.field5043 && var11.field4877 > var11.field4882) {
                                        class213.method1512(var11.field4897, var13, 127, var11.field4923 + var14, var11.field4882, var11.field4877);
                                    }
                                    if (var11.field4920 != 1) {
                                        if (var11.field4920 == 2) {
                                            int var124 = 0;
                                            for (int var125 = 0; var125 < var11.field5026; var125++) {
                                                for (int var126 = 0; var126 < var11.field5037; var126++) {
                                                    int var127 = (var11.field5046 + 32) * var126 + var14;
                                                    int var128 = (var11.field4904 + 32) * var125 + var13;
                                                    if (var124 < 20) {
                                                        var128 += var11.field4906[var124];
                                                        var127 += var11.field4958[var124];
                                                    }
                                                    if (var11.field4922[var124] > 0) {
                                                        boolean var129 = false;
                                                        int var130 = var11.field4922[var124] - 1;
                                                        boolean var131 = false;
                                                        if (var127 + 32 > arg2 && arg0 > var127 && var128 + 32 > arg5 && var128 < arg1 || class253.field4234 == var11 && class8.field105 == var124) {
                                                            class293 var132;
                                                            if (class317.field5381 == 1 && class228.field3743 == var124 && class43.field658 == var11.field4948) {
                                                                var132 = class63.method466(var130, -5584, var11.field4945, 0, var11.field4909[var124], 2);
                                                            } else {
                                                                var132 = class63.method466(var130, -5584, var11.field4945, 3153952, var11.field4909[var124], 1);
                                                            }
                                                            if (class310.field5209) {
                                                                class187.field3036[var12] = true;
                                                            }
                                                            if (var132 == null) {
                                                                class296.method2006(var11, 125);
                                                            } else if (class253.field4234 == var11 && class8.field105 == var124) {
                                                                int var133 = class220.field3617 - class244.field4032;
                                                                if (var133 < 5 && var133 > -5) {
                                                                    var133 = 0;
                                                                }
                                                                int var134 = class118.field1985 - class108.field1821;
                                                                if (var134 < 5 && var134 > -5) {
                                                                    var134 = 0;
                                                                }
                                                                if (class118.field1987 < 5) {
                                                                    var134 = 0;
                                                                    var133 = 0;
                                                                }
                                                                var132.method646(var127 + var134, var128 + var133, 128);
                                                                if (arg4 != -1) {
                                                                    class301 var135 = arg6[arg4 & 0xFFFF];
                                                                    int var136;
                                                                    int var137;
                                                                    if (class99.field1675) {
                                                                        var137 = class212.field3498;
                                                                        var136 = class212.field3501;
                                                                    } else {
                                                                        var136 = class210.field3481;
                                                                        var137 = class210.field3486;
                                                                    }
                                                                    if (var137 > (var128 + var133) && var135.field4897 > 0) {
                                                                        int var138 = (var137 - var128 - var133) * class69.field1106 / 3;
                                                                        if ((class69.field1106 * 10) < var138) {
                                                                            var138 = class69.field1106 * 10;
                                                                        }
                                                                        if (var135.field4897 < var138) {
                                                                            var138 = var135.field4897;
                                                                        }
                                                                        class244.field4032 += var138;
                                                                        var135.field4897 -= var138;
                                                                        class296.method2006(var135, 123);
                                                                    }
                                                                    if (var136 < var128 + var133 + 32 && (var135.field4877 - var135.field4882) > var135.field4897) {
                                                                        int var139 = (var128 + var133 + 32 - var136) * class69.field1106 / 3;
                                                                        if ((class69.field1106 * 10) < var139) {
                                                                            var139 = class69.field1106 * 10;
                                                                        }
                                                                        if (var139 > (var135.field4877 - var135.field4897 - var135.field4882)) {
                                                                            var139 = var135.field4877 - var135.field4897 - var135.field4882;
                                                                        }
                                                                        class244.field4032 -= var139;
                                                                        var135.field4897 += var139;
                                                                        class296.method2006(var135, 126);
                                                                    }
                                                                }
                                                            } else if (class205.field3390 == var11 && class88.field1492 == var124) {
                                                                var132.method646(var127, var128, 128);
                                                            } else {
                                                                var132.method653(var127, var128);
                                                            }
                                                        }
                                                    } else if (var11.field5033 != null && var124 < 20) {
                                                        class293 var140 = var11.method2030(arg7 - 2, var124);
                                                        if (var140 != null) {
                                                            var140.method653(var127, var128);
                                                        } else if (class255.field4257) {
                                                            class296.method2006(var11, 125);
                                                        }
                                                    }
                                                    var124++;
                                                }
                                            }
                                        } else if (var11.field4920 == 3) {
                                            int var57;
                                            if (class314.method2129((byte) 40, var11)) {
                                                var57 = var11.field4888;
                                                if (class181.field2967 == var11 && var11.field4910 != 0) {
                                                    var57 = var11.field4910;
                                                }
                                            } else {
                                                var57 = var11.field4926;
                                                if (class181.field2967 == var11 && var11.field5023 != 0) {
                                                    var57 = var11.field5023;
                                                }
                                            }
                                            if (var15 == 0) {
                                                if (var11.field4919) {
                                                    if (class99.field1675) {
                                                        class212.method1494(var14, var13, var11.field4923, var11.field4882, var57);
                                                    } else {
                                                        class210.method1465(var14, var13, var11.field4923, var11.field4882, var57);
                                                    }
                                                } else if (class99.field1675) {
                                                    class212.method1501(var14, var13, var11.field4923, var11.field4882, var57);
                                                } else {
                                                    class210.method1463(var14, var13, var11.field4923, var11.field4882, var57);
                                                }
                                            } else if (var11.field4919) {
                                                if (class99.field1675) {
                                                    class212.method1503(var14, var13, var11.field4923, var11.field4882, var57, 256 - (var15 & 0xFF));
                                                } else {
                                                    class210.method1461(var14, var13, var11.field4923, var11.field4882, var57, 256 - (var15 & 0xFF));
                                                }
                                            } else if (class99.field1675) {
                                                class212.method1504(var14, var13, var11.field4923, var11.field4882, var57, 256 - (var15 & 0xFF));
                                            } else {
                                                class210.method1482(var14, var13, var11.field4923, var11.field4882, var57, 256 - (var15 & 0xFF));
                                            }
                                        } else if (var11.field4920 == 4) {
                                            class31 var120 = var11.method2019(class260.field4346, true);
                                            if (var120 != null) {
                                                class229 var121 = var11.field4963;
                                                int var122;
                                                if (class314.method2129((byte) 40, var11)) {
                                                    var122 = var11.field4888;
                                                    if (class181.field2967 == var11 && var11.field4910 != 0) {
                                                        var122 = var11.field4910;
                                                    }
                                                    if (var11.field4980.method1642(69) > 0) {
                                                        var121 = var11.field4980;
                                                    }
                                                } else {
                                                    var122 = var11.field4926;
                                                    if (class181.field2967 == var11 && var11.field5023 != 0) {
                                                        var122 = var11.field5023;
                                                    }
                                                }
                                                if (var11.field5043 && var11.field5009 != -1) {
                                                    class191 var123 = class124.method920(arg7 - 83, var11.field5009);
                                                    var121 = var123.field3154;
                                                    if (var121 == null) {
                                                        var121 = class250.field4164;
                                                    }
                                                    if ((var123.field3134 == 1 || var11.field5002 != 1) && var11.field5002 != -1) {
                                                        var121 = class248.method1746(8528, new class229[] { class77.field1287, var121, class300.field4871, class78.method583(var11.field5002, false) });
                                                    }
                                                }
                                                if (class156.field2535 == var11) {
                                                    var121 = class275.field4591;
                                                    var122 = var11.field4926;
                                                }
                                                if (!var11.field5043) {
                                                    var121 = class108.method827(var11, (byte) 117, var121);
                                                }
                                                var120.method248(var121, var14, var13, var11.field4923, var11.field4882, var122, var11.field4907 ? 0 : -1, var11.field5021, var11.field4915, var11.field4943);
                                            } else if (class255.field4257) {
                                                class296.method2006(var11, 125);
                                            }
                                        } else if (var11.field4920 == 5) {
                                            if (var11.field5043) {
                                                class293 var105;
                                                if (var11.field5009 == -1) {
                                                    var105 = var11.method2032((byte) 5, false);
                                                } else {
                                                    var105 = class63.method466(var11.field5009, -5584, var11.field4945, var11.field4925, var11.field5002, var11.field4912);
                                                }
                                                if (var105 != null) {
                                                    int var106 = var105.field4782;
                                                    int var107 = var105.field4781;
                                                    if (var11.field4975) {
                                                        int var108 = (var106 + var11.field4923 - 1) / var106;
                                                        int var109 = (var107 + var11.field4882 - 1) / var107;
                                                        if (class99.field1675) {
                                                            class212.method1491(var14, var13, var14 + var11.field4923, var11.field4882 + var13);
                                                            boolean var110 = class114.method869(-40, var105.field4785);
                                                            boolean var111 = class114.method869(-82, var105.field4786);
                                                            class87 var112 = (class87) var105;
                                                            if (var110 && var111) {
                                                                if (var15 == 0) {
                                                                    var112.method649(var14, var13, var108, var109);
                                                                } else {
                                                                    var112.method650(var14, var13, 256 - (var15 & 0xFF), var108, var109);
                                                                }
                                                            } else if (var110) {
                                                                for (int var113 = 0; var113 < var109; var113++) {
                                                                    if (var15 == 0) {
                                                                        var112.method649(var14, var107 * var113 + var13, var108, 1);
                                                                    } else {
                                                                        var112.method650(var14, var107 * var113 + var13, -(var15 & 0xFF) + 256, var108, 1);
                                                                    }
                                                                }
                                                            } else if (var111) {
                                                                for (int var116 = 0; var116 < var108; var116++) {
                                                                    if (var15 == 0) {
                                                                        var112.method649(var106 * var116 + var14, var13, 1, var109);
                                                                    } else {
                                                                        var112.method650(var106 * var116 + var14, var13, 256 - (var15 & 0xFF), 1, var109);
                                                                    }
                                                                }
                                                            } else {
                                                                for (int var114 = 0; var114 < var108; var114++) {
                                                                    for (int var115 = 0; var115 < var109; var115++) {
                                                                        if (var15 == 0) {
                                                                            var105.method653(var106 * var114 + var14, var13 - -(var107 * var115));
                                                                        } else {
                                                                            var105.method646(var106 * var114 + var14, var107 * var115 + var13, 256 - (var15 & 0xFF));
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            class212.method1502(arg2, arg5, arg0, arg1);
                                                        } else {
                                                            class210.method1471(var14, var13, var11.field4923 + var14, var11.field4882 + var13);
                                                            int var117 = 0;
                                                            while (true) {
                                                                if (var117 >= var108) {
                                                                    class210.method1472(arg2, arg5, arg0, arg1);
                                                                    break;
                                                                }
                                                                for (int var118 = 0; var118 < var109; var118++) {
                                                                    if (var11.field4978 != 0) {
                                                                        var105.method1993(arg7 ^ 0x6FB6, var11.field4978, var107 / 2 + var13 + (var107 * var118), 4096, var106 / 2 + var106 * var117 + var14);
                                                                    } else if (var15 == 0) {
                                                                        var105.method653(var14 + (var106 * var117), var107 * var118 + var13);
                                                                    } else {
                                                                        var105.method646(var106 * var117 + var14, var107 * var118 + var13, 256 - (var15 & 0xFF));
                                                                    }
                                                                }
                                                                var117++;
                                                            }
                                                        }
                                                    } else {
                                                        int var119 = var11.field4923 * 4096 / var106;
                                                        if (var11.field4978 != 0) {
                                                            var105.method1993(-28599, var11.field4978, var11.field4882 / 2 + var13, var119, var14 + (var11.field4923 / 2));
                                                        } else if (var15 != 0) {
                                                            var105.method652(var14, var13, var11.field4923, var11.field4882, 256 - (var15 & 0xFF));
                                                        } else if (var11.field4923 == var106 && var11.field4882 == var107) {
                                                            var105.method653(var14, var13);
                                                        } else {
                                                            var105.method644(var14, var13, var11.field4923, var11.field4882);
                                                        }
                                                    }
                                                } else if (class255.field4257) {
                                                    class296.method2006(var11, 126);
                                                }
                                            } else {
                                                class293 var104 = var11.method2032((byte) 5, class314.method2129((byte) 40, var11));
                                                if (var104 != null) {
                                                    var104.method653(var14, var13);
                                                } else if (class255.field4257) {
                                                    class296.method2006(var11, arg7 ^ 0xFFFFFF82);
                                                }
                                            }
                                        } else if (var11.field4920 == 6) {
                                            int var58 = 0;
                                            class286 var59 = null;
                                            boolean var60 = class314.method2129((byte) 40, var11);
                                            int var61;
                                            if (var60) {
                                                var61 = var11.field4928;
                                            } else {
                                                var61 = var11.field4973;
                                            }
                                            if (var11.field5009 != -1) {
                                                class191 var62 = class124.method920(-84, var11.field5009);
                                                if (var62 != null) {
                                                    class191 var63 = var62.method1332(arg7 ^ 0xFFFFB7F7, var11.field5002);
                                                    class312 var64 = var61 == -1 ? null : class53.method362((byte) -123, var61);
                                                    var59 = var63.method1337(var64, 1, var11.field5000, false);
                                                    if (var59 == null) {
                                                        class296.method2006(var11, 125);
                                                    } else {
                                                        var58 = -var59.method182() / 2;
                                                    }
                                                }
                                            } else if (var11.field5016 == 5) {
                                                if (var11.field4932 == -1) {
                                                    var59 = class147.field2377.method965(true, -1, -1, 16711680, (class312) null, (class312) null);
                                                } else {
                                                    int var65 = var11.field4932 & 0x7FF;
                                                    if (class145.field2354 == var65) {
                                                        var65 = 2047;
                                                    }
                                                    class209 var66 = class114.field1931[var65];
                                                    class312 var67 = var61 == -1 ? null : class53.method362((byte) -64, var61);
                                                    if (var66 != null && (int) var66.field3463.method1634(false) << 11 == (var11.field4932 & 0xFFFFF800)) {
                                                        var59 = var66.field3446.method965(true, var11.field5000, 0, arg7 + 16711681, var67, (class312) null);
                                                    }
                                                }
                                            } else if (var61 == -1) {
                                                var59 = var11.method2029(-16635, (class312) null, var60, class230.field3820.field3446, -1);
                                                if (var59 == null && class255.field4257) {
                                                    class296.method2006(var11, arg7 + 128);
                                                }
                                            } else {
                                                class312 var68 = class53.method362((byte) 5, var61);
                                                var59 = var11.method2029(-16635, var68, var60, class230.field3820.field3446, var11.field5000);
                                                if (var59 == null && class255.field4257) {
                                                    class296.method2006(var11, 122);
                                                }
                                            }
                                            if (var59 != null) {
                                                int var69;
                                                if (var11.field4994 <= 0) {
                                                    var69 = 256;
                                                } else {
                                                    var69 = (var11.field4923 << 8) / var11.field4994;
                                                }
                                                int var70;
                                                if (var11.field4960 > 0) {
                                                    var70 = (var11.field4882 << 8) / var11.field4960;
                                                } else {
                                                    var70 = 256;
                                                }
                                                int var71 = var11.field4882 / 2 + var13 + (var11.field4965 * var70 >> 8);
                                                int var72 = var11.field4923 / 2 + var14 + (var11.field4934 * var69 >> 8);
                                                if (class99.field1675) {
                                                    if (var11.field4966) {
                                                        class99.method756(var72, var71, var11.field4933, var11.field4939, var69, var70);
                                                    } else {
                                                        class99.method746(var72, var71, var69, var70);
                                                        class99.method739((float) var11.field4976, (float) var11.field4939 * 1.5F);
                                                    }
                                                    class99.method764();
                                                    class99.method734(true);
                                                    class99.method736(false);
                                                    class331.method2268(class191.field3153, -1);
                                                    if (class132.field2145) {
                                                        class212.method1498();
                                                        class99.method751();
                                                        class212.method1502(arg2, arg5, arg0, arg1);
                                                        class132.field2145 = false;
                                                    }
                                                    if (var11.field4908) {
                                                        class99.method743();
                                                    }
                                                    int var73 = class310.field5199[var11.field5034] * var11.field4933 >> 16;
                                                    int var74 = class310.field5197[var11.field5034] * var11.field4933 >> 16;
                                                    if (var11.field5043) {
                                                        var59.method1731(0, var11.field4916, var11.field4918, var11.field5034, var11.field4894, var58 + var73 + var11.field4951, var11.field4951 + var74, -1L);
                                                    } else {
                                                        var59.method1731(0, var11.field4916, 0, var11.field5034, 0, var73, var74, -1L);
                                                    }
                                                    if (var11.field4908) {
                                                        class99.method755();
                                                    }
                                                } else {
                                                    class310.method2099(var72, var71);
                                                    int var75 = class310.field5199[var11.field5034] * var11.field4933 >> 16;
                                                    int var76 = class310.field5197[var11.field5034] * var11.field4933 >> 16;
                                                    if (!var11.field5043) {
                                                        var59.method1731(0, var11.field4916, 0, var11.field5034, 0, var75, var76, -1L);
                                                    } else if (var11.field4966) {
                                                        ((class246) var59).method1741(0, var11.field4916, var11.field4918, var11.field5034, var11.field4894, var75 - (-var58 - var11.field4951), var76 - -var11.field4951, var11.field4933);
                                                    } else {
                                                        var59.method1731(0, var11.field4916, var11.field4918, var11.field5034, var11.field4894, var58 + var75 + var11.field4951, var11.field4951 + var76, -1L);
                                                    }
                                                    class310.method2091();
                                                }
                                            }
                                        } else {
                                            label1091: {
                                                if (var11.field4920 == 7) {
                                                    class31 var77 = var11.method2019(class260.field4346, true);
                                                    if (var77 == null) {
                                                        if (class255.field4257) {
                                                            class296.method2006(var11, 125);
                                                        }
                                                        break label1091;
                                                    }
                                                    int var78 = 0;
                                                    for (int var79 = 0; var79 < var11.field5026; var79++) {
                                                        for (int var80 = 0; var80 < var11.field5037; var80++) {
                                                            if (var11.field4922[var78] > 0) {
                                                                class191 var81 = class124.method920(-84, var11.field4922[var78] - 1);
                                                                class229 var82;
                                                                if (var81.field3134 != 1 && var11.field4909[var78] == 1) {
                                                                    var82 = class248.method1746(8528, new class229[] { class77.field1287, var81.field3154, class112.field1910 });
                                                                } else {
                                                                    var82 = class248.method1746(8528, new class229[] { class77.field1287, var81.field3154, class300.field4871, class78.method583(var11.field4909[var78], false) });
                                                                }
                                                                int var83 = (var11.field5046 + 115) * var80 + var14;
                                                                int var84 = var13 + ((var11.field4904 + 12) * var79);
                                                                if (var11.field5021 == 0) {
                                                                    var77.method260(var82, var83, var84, var11.field4926, var11.field4907 ? 0 : -1);
                                                                } else if (var11.field5021 == 1) {
                                                                    var77.method261(var82, var83 + 57, var84, var11.field4926, var11.field4907 ? 0 : -1);
                                                                } else {
                                                                    var77.method250(var82, var83 + 115 - 1, var84, var11.field4926, var11.field4907 ? 0 : -1);
                                                                }
                                                            }
                                                            var78++;
                                                        }
                                                    }
                                                }
                                                if (var11.field4920 == 8 && class254.field4247 == var11 && class68.field1082 == class43.field665) {
                                                    int var85 = 0;
                                                    class31 var86 = class237.field3905;
                                                    int var87 = 0;
                                                    class229 var88 = var11.field4963;
                                                    class229 var89 = class108.method827(var11, (byte) -120, var88);
                                                    while (var89.method1642(67) > 0) {
                                                        int var90 = var89.method1611(class294.field4810, 24104);
                                                        class229 var91;
                                                        if (var90 == -1) {
                                                            var91 = var89;
                                                            var89 = class134.field2172;
                                                        } else {
                                                            var91 = var89.method1623(0, -30201, var90);
                                                            var89 = var89.method1640(var90 + 4, -107);
                                                        }
                                                        int var92 = var86.method258(var91);
                                                        var85 += var86.field504 + 1;
                                                        if (var92 > var87) {
                                                            var87 = var92;
                                                        }
                                                    }
                                                    var87 += 6;
                                                    int var93 = var11.field4923 + var14 - var87 - 5;
                                                    int var94 = var11.field4882 + var13 + 5;
                                                    if (var14 + 5 > var93) {
                                                        var93 = var14 + 5;
                                                    }
                                                    var85 += 7;
                                                    if (arg0 < (var87 + var93)) {
                                                        var93 = arg0 - var87;
                                                    }
                                                    if ((var85 + var94) > arg1) {
                                                        var94 = arg1 - var85;
                                                    }
                                                    if (class99.field1675) {
                                                        class212.method1494(var93, var94, var87, var85, 16777120);
                                                        class212.method1501(var93, var94, var87, var85, 0);
                                                    } else {
                                                        class210.method1465(var93, var94, var87, var85, 16777120);
                                                        class210.method1463(var93, var94, var87, var85, 0);
                                                    }
                                                    class229 var95 = var11.field4963;
                                                    int var96 = var94 + var86.field504 + 2;
                                                    class229 var97 = class108.method827(var11, (byte) 112, var95);
                                                    while (var97.method1642(32) > 0) {
                                                        int var98 = var97.method1611(class294.field4810, 24104);
                                                        class229 var99;
                                                        if (var98 == -1) {
                                                            var99 = var97;
                                                            var97 = class134.field2172;
                                                        } else {
                                                            var99 = var97.method1623(0, -30201, var98);
                                                            var97 = var97.method1640(var98 + 4, -118);
                                                        }
                                                        var86.method260(var99, var93 + 3, var96, 0, -1);
                                                        var96 += var86.field504 + 1;
                                                    }
                                                }
                                                if (var11.field4920 == 9) {
                                                    int var100;
                                                    int var101;
                                                    int var102;
                                                    int var103;
                                                    if (var11.field4969) {
                                                        var100 = var13;
                                                        var101 = var11.field4882 + var13;
                                                        var102 = var14;
                                                        var103 = var14 + var11.field4923;
                                                    } else {
                                                        var103 = var11.field4923 + var14;
                                                        var101 = var13;
                                                        var102 = var14;
                                                        var100 = var11.field4882 + var13;
                                                    }
                                                    if (var11.field4982 == 1) {
                                                        if (class99.field1675) {
                                                            class212.method1497(var102, var101, var103, var100, var11.field4926);
                                                        } else {
                                                            class210.method1478(var102, var101, var103, var100, var11.field4926);
                                                        }
                                                    } else if (class99.field1675) {
                                                        class212.method1499(var102, var101, var103, var100, var11.field4926, var11.field4982);
                                                    } else {
                                                        class210.method1473(var102, var101, var103, var100, var11.field4926, var11.field4982);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI)[I", line = 1688)
    public final int[] method63(boolean arg0, int arg1) {
        field2796++;
        int[] var3 = this.field846.method383(3583, arg1);
        if (!arg0) {
            method1238(true, 102);
        }
        if (this.field846.field811) {
            int var4 = this.field2788 >> 1;
            int[][] var5 = this.field846.method386((byte) -28);
            Random var6 = new Random((long) this.field2785);
            for (int var7 = 0; var7 < this.field2794; var7++) {
                int var8 = this.field2788 > 0 ? this.field2789 + class113.method861(this.field2788, (byte) -24, var6) - var4 : this.field2789;
                int var9 = (var8 & 0xFFB) >> 4;
                int var10 = class113.method861(class293.field4789, (byte) -24, var6);
                int var11 = class113.method861(class241.field3993, (byte) -24, var6);
                int var12 = var10 + (class51.field730[var9] * this.field2797 >> 12);
                int var13 = (class198.field3288[var9] * this.field2797 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = var12 - var10;
                if (var15 != 0 || var14 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var12 = var13;
                        var13 = var18;
                        var11 = var17;
                    }
                    if (var12 < var10) {
                        int var19 = var11;
                        int var20 = var10;
                        var11 = var13;
                        var13 = var19;
                        var10 = var12;
                        var12 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = var13 - var11;
                    int var24 = 2048 / var22;
                    int var25 = -var22 / 2;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var26 = 1024 - (class113.method861(4096, (byte) -24, var6) >> 2);
                    int var27 = var11 >= var13 ? -1 : 1;
                    for (int var28 = var10; var28 < var12; var28++) {
                        var25 += var23;
                        int var29 = (var28 - var10) * var24 + var26 + 1024;
                        int var30 = class4.field51 & var28;
                        int var31 = var21 & class33.field544;
                        if (var25 > 0) {
                            var25 += -var22;
                            var21 += var27;
                        }
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "(I)V", line = 1824)
    public final void method65(int arg0) {
        class189.method1320(4096);
        if (arg0 <= 110) {
            field2791 = (class229) null;
        }
        field2790++;
    }
}
