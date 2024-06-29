import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class279 extends class128 {

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "Ljava/lang/String;")
    public static String field4327 = "Please remove ";

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "Ljava/lang/String;")
    public static String field4328 = "Face here";

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "Lii;")
    public static class227 field4330 = new class227(128);

    @OriginalMember(owner = "client!jl", name = "T", descriptor = "Ljava/lang/String;")
    public static String field4338 = "level: ";

    @OriginalMember(owner = "client!jl", name = "U", descriptor = "Ljava/lang/String;")
    public static String field4339 = "Cancel";

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!jl", name = "K", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!jl", name = "M", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!jl", name = "N", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!jl", name = "O", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!jl", name = "P", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!jl", name = "Q", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!jl", name = "R", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!jl", name = "S", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V", line = 3)
    public class279() {
        super(3, false);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIII[I)V", line = 9)
    public static final void method1997(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        arg2--;
        field4336++;
        if (arg1 != -824384948) {
            return;
        }
        int var6 = arg0 - 1;
        int var5 = var6 - 7;
        while (arg2 < var5) {
            int var7 = arg2 + 1;
            arg4[var7] = arg3;
            int var8 = var7 + 1;
            arg4[var8] = arg3;
            int var9 = var8 + 1;
            arg4[var9] = arg3;
            int var10 = var9 + 1;
            arg4[var10] = arg3;
            int var11 = var10 + 1;
            arg4[var11] = arg3;
            int var12 = var11 + 1;
            arg4[var12] = arg3;
            int var13 = var12 + 1;
            arg4[var13] = arg3;
            arg2 = var13 + 1;
            arg4[arg2] = arg3;
        }
        while (var6 > arg2) {
            arg2++;
            arg4[arg2] = arg3;
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(BI)[I", line = 38)
    public final int[] method126(byte arg0, int arg1) {
        int[] var3 = this.field1748.method902(arg1, true);
        if (arg0 <= 100) {
            return (int[]) null;
        }
        if (this.field1748.field1878) {
            int[] var4 = this.method851((byte) -64, 0, arg1);
            int[] var5 = this.method851((byte) -78, 1, arg1);
            int[] var6 = this.method851((byte) -78, 2, arg1);
            for (int var7 = 0; var7 < class10.field141; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        field4329++;
        return var3;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)V", line = 90)
    public static void method1998(byte arg0) {
        if (arg0 <= 109) {
            method1999(true, (class175) null, (class175) null, -3);
        }
        field4327 = null;
        field4330 = null;
        field4338 = null;
        field4328 = null;
        field4339 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)[[I", line = 119)
    public final int[][] method102(int arg0, int arg1) {
        field4335++;
        if (arg1 != 5110) {
            method1999(true, (class175) null, (class175) null, -26);
        }
        int[][] var3 = this.field1755.method875(100, arg0);
        if (this.field1755.field1815) {
            int[] var4 = this.method851((byte) -124, 2, arg0);
            int[][] var5 = this.method855(-3102, arg0, 0);
            int[][] var6 = this.method855(-3102, arg0, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var5[0];
            int[] var10 = var3[2];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class10.field141; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var9[var16];
                    var8[var16] = var11[var16];
                    var10[var16] = var12[var16];
                } else if (var17 == 0) {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var10[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var9[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var10[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZLlc;Llc;I)V", line = 200)
    public static final void method1999(boolean arg0, class175 arg1, class175 arg2, int arg3) {
        field4326++;
        class97.field1262 = arg2;
        if (arg3 != -15311) {
            field4330 = (class227) null;
        }
        class227.field3242 = arg0;
        class121.field1704 = arg1;
    }

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "(I)V", line = 214)
    public static final void method2000(int arg0) {
        class21.field278 = 0;
        field4331++;
        class128.field1749 = 0;
        class1.method3(1);
        class21.method129((byte) 90);
        class232.method1636(false);
        class181.method1250((byte) -114);
        for (int var1 = 0; var1 < class128.field1749; var1++) {
            int var2 = class330.field5038[var1];
            if (class38.field463 != class328.field5009[var2].field2422) {
                if (class328.field5009[var2].field1522 > 0) {
                    class25.method159(class328.field5009[var2], arg0 + 5262);
                }
                class328.field5009[var2] = null;
            }
        }
        if (arg0 != -5262) {
            field4330 = (class227) null;
        }
        if (class132.field1817 != class307.field4742.field1400) {
            throw new RuntimeException("gpp1 pos:" + class307.field4742.field1400 + " psize:" + class132.field1817);
        }
        for (int var3 = 0; var3 < class204.field2864; var3++) {
            if (class328.field5009[class180.field2612[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class204.field2864);
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lp;II)V", line = 267)
    public final void method107(class107 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field1753 = arg0.method661(-1) == 1;
        }
        if (arg2 > -85) {
            method2001((byte) -28);
        }
        field4332++;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(B)I", line = 301)
    public static final int method2001(byte arg0) {
        field4337++;
        try {
            if (class41.field489 == 0) {
                if (class280.field4345 > class200.method1375(arg0 - 16082) - 5000L) {
                    return 0;
                }
                class163.field2259 = class9.field131.method1915(class311.field4823, class230.field3364, false);
                class133.field1832 = class200.method1375(arg0 - 16082);
                class41.field489 = 1;
            }
            if (class133.field1832 + 30000L < class200.method1375(-16185)) {
                return class17.method118(1000, false);
            }
            if (arg0 != -103) {
                method1999(true, (class175) null, (class175) null, -3);
            }
            if (class41.field489 == 1) {
                if (class163.field2259.field238 == 2) {
                    return class17.method118(1001, false);
                }
                if (class163.field2259.field238 != 1) {
                    return -1;
                }
                class236.field3463 = new class167((Socket) class163.field2259.field241, class9.field131);
                class163.field2259 = null;
                int var1 = 0;
                class140.field1954.field1400 = 0;
                if (class192.field2764) {
                    var1 = class98.field1279;
                }
                class140.field1954.method648(23, (byte) 38);
                class140.field1954.method641(1773202520, var1);
                class236.field3463.method1097(class140.field1954.field1388, 0, true, class140.field1954.field1400);
                if (class170.field2380 != null) {
                    class170.field2380.method1717(-7234);
                }
                if (class224.field3186 != null) {
                    class224.field3186.method1717(-7234);
                }
                int var2 = class236.field3463.method1094((byte) 67);
                if (class170.field2380 != null) {
                    class170.field2380.method1717(-7234);
                }
                if (class224.field3186 != null) {
                    class224.field3186.method1717(-7234);
                }
                if (var2 != 0) {
                    return class17.method118(var2, false);
                }
                class41.field489 = 2;
            }
            if (class41.field489 == 2) {
                if (class236.field3463.method1091((byte) 18) < 2) {
                    return -1;
                }
                class99.field1309 = class236.field3463.method1094((byte) 67);
                class99.field1309 <<= 0x8;
                class99.field1309 += class236.field3463.method1094((byte) 67);
                class7.field108 = new byte[class99.field1309];
                class41.field489 = 3;
                class318.field4893 = 0;
            }
            if (class41.field489 != 3) {
                return -1;
            }
            int var3 = class236.field3463.method1091((byte) 18);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > class99.field1309 - class318.field4893) {
                var3 = class99.field1309 - class318.field4893;
            }
            class236.field3463.method1092(class318.field4893, var3, -1, class7.field108);
            class318.field4893 += var3;
            if (class318.field4893 < class99.field1309) {
                return -1;
            } else if (class49.method298((byte) 118, class7.field108)) {
                int var4 = 0;
                class184.field2649 = new class163[class29.field367];
                for (int var5 = class254.field3858; var5 <= class85.field1089; var5++) {
                    class163 var6 = class293.method2087(var5, (byte) -53);
                    if (var6 != null) {
                        class184.field2649[var4++] = var6;
                    }
                }
                class236.field3463.method1096((byte) 87);
                class236.field3463 = null;
                class7.field108 = null;
                class270.field4252 = 0;
                class41.field489 = 0;
                class280.field4345 = class200.method1375(arg0 - 16082);
                return 0;
            } else {
                return class17.method118(1002, false);
            }
        } catch (IOException var8) {
            return class17.method118(1003, false);
        }
    }
}
