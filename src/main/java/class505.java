import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class505 implements class81 {

    @OriginalMember(owner = "client!er", name = "k", descriptor = "Llga;")
    private class47 field7389;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "Lqj;")
    public class232 field7393;

    @OriginalMember(owner = "client!er", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7400 = new String[] { method3865(method3864(" O\u001dp\u001a")), method3865(method3864("+H_Y")), method3865(method3864(">\u0013\u001d\u001bO")), method3865(method3864(" O\u001d\t[+TG\u000b\u001a")), method3865(method3864(" O\u001dw\u001a")), method3865(method3864(" O\u001dv\u001a")), method3865(method3864(" O\u001dt\u001a")), method3865(method3864(" O\u001dq\u001a")), method3865(method3864(" O\u001d~\u001a")), method3865(method3864(" O\u001ds\u001a")) };

    @OriginalMember(owner = "client!er", name = "d", descriptor = "Lop;")
    public static class574 field7395 = new class574("", 14);

    @OriginalMember(owner = "client!er", name = "j", descriptor = "[I")
    public static int[] field7398 = new int[256];

    @OriginalMember(owner = "client!er", name = "f", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field7399;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    public static int field7390;

    @OriginalMember(owner = "client!er", name = "n", descriptor = "I")
    public static int field7391;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "Ldaa;")
    public static class226 field7397;

    @OriginalMember(owner = "client!er", name = "i", descriptor = "Ltb;")
    public class392 field7388;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "Lqea;")
    public static class580 field7396;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
    public final void method802(int arg0) {
        try {
            int var2 = -48 / ((arg0 - 38) / 41);
            field7394++;
            this.field7388 = class304.method2443(true, this.field7389, this.field7393.field3350);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7400[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)Z")
    public final boolean method800(byte arg0) {
        try {
            if (arg0 > -2) {
                return true;
            } else {
                field7387++;
                return this.field7389.method530(false, this.field7393.field3350);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7400[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IBIZZ)V")
    public static final void method3860(int arg0, byte arg1, int arg2, boolean arg3, boolean arg4) {
        try {
            field7391++;
            if (arg1 < 121) {
                field7397 = null;
            }
            class228.method1895(arg0, arg4, 0, class390.field5689.length - 1, arg2, arg3, true);
            class536.field7771 = null;
            class474.field6955 = 0;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7400[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)V")
    public static final void method3861(int arg0, int arg1) {
        try {
            if (class740.field10522 == null || class740.field10522.length < arg1) {
                class740.field10522 = new int[arg1];
            }
            if (arg0 > -96) {
                field7396 = null;
            }
            field7392++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7400[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IZ)V")
    public void method801(int arg0, boolean arg1) {
        try {
            if (arg1) {
                int var3 = this.field7393.field3357.method2058(this.field7388.method1378(), class500.field7304, 0) + this.field7393.field3353;
                int var4 = this.field7393.field3352.method4767(23467, this.field7388.method1380(), class791.field11507) + this.field7393.field3349;
                this.field7388.method3074(var3, var4);
            }
            field7386++;
            int var5 = 48 / ((arg0 - 15) / 60);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field7400[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
    public static void method3862(int arg0) {
        try {
            if (arg0 != 10) {
                method3863(null, -43, null, 25, true);
            }
            field7396 = null;
            field7399 = null;
            field7397 = null;
            field7395 = null;
            field7398 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7400[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lha;ILvo;IZ)V")
    public static final void method3863(class18 arg0, int arg1, class782 arg2, int arg3, boolean arg4) {
        try {
            if (!arg4) {
                method3861(-4, 37);
            }
            field7390++;
            class685 var5 = arg2.method5630((byte) -33, arg0);
            if (var5 != null) {
                arg0.method208(arg3, arg1, arg2.field11295 + arg3, arg2.field11244 + arg1);
                if (class345.field5028 == 2 || class345.field5028 == 5 || class483.field7103 == null) {
                    arg0.method153(-16777216, var5, arg3, arg1);
                } else {
                    int var6;
                    int var7;
                    int var8;
                    int var9;
                    if (class596.field8579 == 4) {
                        var6 = class138.field1805;
                        var7 = (int) (-class349.field5057) & 0x3FFF;
                        var8 = class36.field439;
                        var9 = 4096;
                    } else {
                        var9 = 4096 - (class398.field5794 * 16);
                        var6 = class203.field2988.field2984;
                        var8 = class203.field2988.field2969;
                        var7 = (int) (-class349.field5057) + class801.field11658 & 0x3FFF;
                    }
                    int var10 = 48 - (class625.field8929 * 2) - (-var8 / 128 - 208);
                    int var11 = (class14.field187 * 4) + 48 + 208 - (var6 / 128) - (class14.field187 * 2);
                    class483.field7103.method3066((float) arg2.field11295 / 2.0F + (float) arg3, (float) arg2.field11244 / 2.0F + (float) arg1, (float) var10, (float) var11, var9, var7 << 2, var5, arg3, arg1);
                    for (class529 var12 = (class529) class721.field10269.method3977((byte) -66); var12 != null; var12 = (class529) class721.field10269.method3987(0)) {
                        int var13 = var12.field7679;
                        int var14 = (class293.field4126.field9374[var13] >> 14 & 0x3FFF) - class537.field7895;
                        int var15 = (class293.field4126.field9374[var13] & 0x3FFF) - class655.field9286;
                        int var16 = var14 * 4 + 2 - (var8 / 128);
                        int var17 = var15 * 4 + 2 - (var6 / 128);
                        class685.method4904(arg1, class293.field4126.field9377[var13], var17, var5, arg0, 2, arg3, arg2, var16);
                    }
                    for (int var18 = 0; var18 < class445.field6560; var18++) {
                        int var19 = class55.field774[var18] * 4 + 2 - (var8 / 128);
                        int var20 = class104.field1374[var18] * 4 + 2 - var6 / 128;
                        class789 var21 = class101.field1359.method2832(127, class650.field9231[var18]);
                        if (var21.field11465 != null) {
                            var21 = var21.method5688(-81, class734.field10459);
                            if (var21 == null || var21.field11398 == -1) {
                                continue;
                            }
                        }
                        class685.method4904(arg1, var21.field11398, var20, var5, arg0, 2, arg3, arg2, var19);
                    }
                    for (class413 var22 = (class413) class414.field5965.method3696(0); var22 != null; var22 = (class413) class414.field5965.method3697(-62)) {
                        int var23 = (int) (var22.field8378 >> 28 & 0x3L);
                        if (class232.field3348 == var23) {
                            int var24 = (int) (var22.field8378 & 0x3FFFL) - class537.field7895;
                            int var25 = (int) (var22.field8378 >> 14 & 0x3FFFL) - class655.field9286;
                            int var26 = var24 * 4 - (var8 / 128 - 2);
                            int var27 = var25 * 4 + 2 - (var6 / 128);
                            class620.method4560(var5, arg2, class348.field5051[0], 16383, arg1, var26, arg3, var27);
                        }
                    }
                    for (int var28 = 0; var28 < class438.field6458; var28++) {
                        class527 var29 = (class527) class479.field7063.method3693(!arg4, (long) class343.field4987[var28]);
                        if (var29 != null) {
                            class717 var30 = var29.field7672;
                            if (var30.method5204(22) && class203.field2988.field2981 == var30.field2981) {
                                class134 var31 = var30.field10229;
                                if (var31 != null && var31.field1659 != null) {
                                    var31 = var31.method1178(class734.field10459, (byte) -104);
                                }
                                if (var31 != null && var31.field1715 && var31.field1678) {
                                    int var32 = var30.field2969 / 128 - (var8 / 128);
                                    int var33 = var30.field2984 / 128 - (var6 / 128);
                                    if (var31.field1680 == -1) {
                                        class620.method4560(var5, arg2, class348.field5051[1], 16383, arg1, var32, arg3, var33);
                                    } else {
                                        class685.method4904(arg1, var31.field1680, var33, var5, arg0, 2, arg3, arg2, var32);
                                    }
                                }
                            }
                        }
                    }
                    int var34 = class689.field9642;
                    int[] var35 = class599.field8595;
                    for (int var36 = 0; var36 < var34; var36++) {
                        class339 var37 = class748.field10666[var35[var36]];
                        if (var37 != null && var37.method2726(62) && !var37.field4937 && class203.field2988 != var37 && class203.field2988.field2981 == var37.field2981) {
                            int var38 = var37.field2969 / 128 - (var8 / 128);
                            int var39 = var37.field2984 / 128 - var6 / 128;
                            boolean var40 = false;
                            for (int var41 = 0; var41 < class210.field3062; var41++) {
                                if (var37.field4905.equals(class591.field8497[var41]) && class336.field4867[var41] != 0) {
                                    var40 = true;
                                    break;
                                }
                            }
                            boolean var42 = false;
                            for (int var43 = 0; var43 < class322.field4393; var43++) {
                                if (var37.field4905.equals(class625.field8931[var43].field5218)) {
                                    var42 = true;
                                    break;
                                }
                            }
                            boolean var44 = false;
                            if (class203.field2988.field4936 != 0 && var37.field4936 != 0 && class203.field2988.field4936 == var37.field4936) {
                                var44 = true;
                            }
                            if (var37.field4909) {
                                class620.method4560(var5, arg2, class348.field5051[6], 16383, arg1, var38, arg3, var39);
                            } else if (var44) {
                                class620.method4560(var5, arg2, class348.field5051[4], 16383, arg1, var38, arg3, var39);
                            } else if (var37.field4910) {
                                class620.method4560(var5, arg2, class348.field5051[7], 16383, arg1, var38, arg3, var39);
                            } else if (var40) {
                                class620.method4560(var5, arg2, class348.field5051[3], 16383, arg1, var38, arg3, var39);
                            } else if (var42) {
                                class620.method4560(var5, arg2, class348.field5051[5], 16383, arg1, var38, arg3, var39);
                            } else {
                                class620.method4560(var5, arg2, class348.field5051[2], 16383, arg1, var38, arg3, var39);
                            }
                        }
                    }
                    class337[] var45 = class99.field1336;
                    for (int var46 = 0; var46 < var45.length; var46++) {
                        class337 var47 = var45[var46];
                        if (var47 != null && var47.field4876 != 0 && (class694.field9700 % 20) < 10) {
                            if (var47.field4876 == 1) {
                                class527 var48 = (class527) class479.field7063.method3693(!arg4, (long) var47.field4877);
                                if (var48 != null) {
                                    class717 var49 = var48.field7672;
                                    int var50 = var49.field2969 / 128 - (var8 / 128);
                                    int var51 = var49.field2984 / 128 - (var6 / 128);
                                    class46.method492(arg1, var5, var47.field4874, var51, var50, arg2, (byte) 68, arg3, 360000L);
                                }
                            }
                            if (var47.field4876 == 2) {
                                int var52 = var47.field4879 / 128 - (var8 / 128);
                                int var53 = var47.field4887 / 128 - var6 / 128;
                                long var54 = (long) (var47.field4878 << 7);
                                long var56 = var54 * var54;
                                class46.method492(arg1, var5, var47.field4874, var53, var52, arg2, (byte) 68, arg3, var56);
                            }
                            if (var47.field4876 == 10 && var47.field4877 >= 0 && class748.field10666.length > var47.field4877) {
                                class339 var58 = class748.field10666[var47.field4877];
                                if (var58 != null) {
                                    int var59 = var58.field2969 / 128 - (var8 / 128);
                                    int var60 = var58.field2984 / 128 - (var6 / 128);
                                    class46.method492(arg1, var5, var47.field4874, var60, var59, arg2, (byte) 68, arg3, 360000L);
                                }
                            }
                        }
                    }
                    if (class596.field8579 != 4) {
                        if (class477.field7028 != 0) {
                            int var61 = class477.field7028 * 4 - (var8 / 128 - (class203.field2988.method1437((byte) -28) * 2) - 2) - 2;
                            int var62 = class346.field5032 * 4 + (class203.field2988.method1437((byte) -28) + -1) * 2 + 2 - (var6 / 128);
                            class620.method4560(var5, arg2, class341.field4962[class369.field5344 ? 1 : 0], 16383, arg1, var61, arg3, var62);
                        }
                        if (!class203.field2988.field4937) {
                            arg0.method121(3, arg2.field11295 / 2 + arg3 - 1, -65, 3, -1, arg1 + (arg2.field11244 / 2) - 1);
                            return;
                        }
                    }
                }
            }
        } catch (RuntimeException var64) {
            throw class665.method4799(var64, field7400[5] + (arg0 == null ? field7400[1] : field7400[2]) + ',' + arg1 + ',' + (arg2 == null ? field7400[1] : field7400[2]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Llga;Lqj;)V")
    public class505(class47 arg0, class232 arg1) {
        try {
            this.field7389 = arg0;
            this.field7393 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7400[3] + (arg0 == null ? field7400[1] : field7400[2]) + ',' + (arg1 == null ? field7400[1] : field7400[2]) + ')');
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field7398[var0] = var1;
        }
        field7399 = new BigInteger(method3865(method3864("'\u000f\u0006V\u0007uYU\u0000\u0006s\u0004\u0002\u0003\u0002}\u0005\u0000\u0005SvY\u0007W\u0003'\b\u0002V\u0000![\u0002\u0002\u0006s\u000bUP\u0007q\rUS\u000bw\f\u0007TQ#[\u000bW\u0003$^V\u0000\u0002u^\u0004PV|\u0004\n\u0003\u0005r\u000eV\u0006T&\nR\u0003W&\t\u0007P\u0001r\u000bR\u0007\nr\r\u0006QW'\u0005\u0004\u0003P Y\u0000\f\u0001}\u000b\u0000V\u0006q\f\u000b\u0000\u0006}\r\u0005Q\u0007s\f\u000bSPw_\n\u0007Qt[\u0007VV$\n\u0003P\u0006u^\u0000WWsXP\u0001\u0000p\f\u000b\u0000\u0004q\u000b\u0007\u0005Pv\u0004\u0003\u0004\u0006'[\u0002\r\u0005q[\u0005W\u0005$_\u0006\u0001\u0002'\u0004\u0003P\np\u000b\u0007V\u0000s\u000e\u0007PW \u000f\u0003\u0001\u0003v\u0005U\u0000P&X\u0003\rVs\r\u000b\r\u0005$\bV\u0006W!XWP\u0005#\\V\u0003\u0003q\r\u0006P\u0003rX\n\u0000Sr\u000e\u0006V\u0000pYQ\u0007\n#\u000fP\u0004\u0002|\u000fVV\u0003w\u000b\u0002\fW \u000b\u0000\u0004\u0000!\u000b\u0005\u0006\u0000s\r\u0001V\nw\u000bQ\u0003\u0005|_\u0001\u0001Pq\u0005Q\u0006S$Y\u000b\u0002\nt_\u0007\u0002\n'\u000f\u0002\u0004\u0004&\tU\fW|\n\u0006WVt\u0004\u0003\u0001\u0007'Y\u0003\u0004\u0000|\\V\u0004\nu[R\f\u0004rY\u0005\fSs\u0005P\fSw\r\u000bWV$\bU\u0003V|\r\u0004\u0002\u0003q\u000fUW\u0003p\u000b\u0007SW!_\u000b\u0000W \u0004\u0004PPv_\u0001\u0000\u0001t[\u0003\f\u0003 \fVQ\u0004'\nRS\u0003!\nPW\u0003!\tUTPv\\V\u0000Vq\bV\u0005\u0007|\u000e\u0007\u0004V X\u0006\f\u000buYW\u0005\u0007u\fWQ\u0001 Y\u0000WVw^W\r\u000b&\t\u0000TVw\\\u0005\u0005\u0003 \\VT\u0003|\f\u0004W\u0002#\r\u0004SP#^R\u0001Qu\u0005Q\f\u0002r\u000f\u0007\f\u0002'\f\u0003\u0002V&\u000eR\u0006Pr\\\u0000Q\u0004v\f\u0006PP \r\nPT$[\u0002P\ns[\u000b\u0005\u0005|\bR\r\u0007}\u0004\n\r\u0007|\u0005\u0007\u0007VqY\n\r\u0004 _\u0007\u0001\u0003$\u000e\u0005\u0007\nsYU\u0005S \tP\fQ|\b\u0006\u0004Wu\nV\u0006\nt\u0005\u0007VVr\u0005\u0005TPr\u000fPPS|\\RWPt\u0005Q\u0003\u0003u\t\u0000\u0000Vt\n\u000b\fQtY\u0005VS$\tR\u0004\u0006u\u0005\u0007\u0007\u0006}\u000bVT\u0006'\f\u0004PWuX\u0000\u0007Ss\u000e\u000bP\u0005|\u000f\u0004\u0000Pw^\u0001\f\u0001'XPS\u0004$\bV\rW#\u000eR\u0004P$\bW\u0006QpY\u0006\r\u0004!\u0005\u0006\f\u0002$\u000e\u0003\u0005\u0005|^RS\u0000|\u0005\u0002\u0006\u0003$^V\u0000\u0004q_P\r\u0006'_P\u0001\u0003 \u000b\u0003\u0005WtX\u0007TV$\u000e\u0000WQv\u000fQ\u0003\u0002 \u000bV\u0001\u000br\u0005\u0001\f\u000b#\f\nT\u000br\u000e\u0000\u0003\u0006q\n\u0005\u0001\u0000sY\u0005PWv\u000e\u0004Q\u0001t_PP\u0002u\\\u0006\u0005\u0002u_VTQp\nQQQv\t\u000b\u0005\u0000$\u0004Q\u0004Qt\f\u0006T\u0006s\tV\u0001V!\f\u0005\u0003\u0003#\u0005\u0002\u0002Wu_\u0002\u0006\n&\\W\u0007Qs\u000b\u0006SSp_U\u0000\u0000 \u000fW\u0000\n'\f\u0005P\u0001#\fVTT#\b\u0000\u0002\u0007}\u0004\u000b\u0005\u0002v^\u0002\u0007Qv^\u0003V\u000b}\b\u0002\fS#\bUS\u0001q\u0004\n\u0002Pw\u000e\u0001V\nw\r\u0000\u0006\u0003|\u000f\n\u0004\u0005|\u000bV\u0005\n&\t\u0006S\u0001s\tV\u0004S#\fWP\u0005'^Q\u0007\u0007#\\U\u0004Pt\rR\u0000\u0007p\n\u0006\u0004\u0003!\f\u000bT\u0003t\u000e\n\u0004\u0005v\f\u0002Q\u0001s^Q\u0002\u0007'XUP\u0002w\u0004\u0002\u0000\u0004'\u0004\u0000\u0006\u0000tXPQ\u0000!^\u0002Q\u0003u\b\u0004\u0003Pr\nW\u0005\u0002r\bU\u0003\u0003 \u000f\u0007\u0002\u0001v\r\u0006S\u0006$Y\u0005\u0006")), 16);
    }

    @OriginalMember(owner = "client!er", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3864(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x32);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!er", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3865(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 69;
                    break;
                case 1:
                    var10005 = 61;
                    break;
                case 2:
                    var10005 = 51;
                    break;
                case 3:
                    var10005 = 53;
                    break;
                default:
                    var10005 = 50;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
