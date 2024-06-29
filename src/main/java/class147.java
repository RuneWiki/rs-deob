import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class147 extends class303 {

    @OriginalMember(owner = "client!va", name = "T", descriptor = "[I")
    private int[] field2378 = new int[257];

    @OriginalMember(owner = "client!va", name = "L", descriptor = "I")
    public static int field2370 = 0;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "I")
    public static int field2373 = 0;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "I")
    public static int field2374 = 0;

    @OriginalMember(owner = "client!va", name = "R", descriptor = "I")
    public static int field2376 = 0;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!va", name = "H", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!va", name = "S", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "[Lda;")
    public static class120[] field2367;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "[[I")
    private int[][] field2380;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILpe;I)V", line = 5)
    public final void method65(int arg0, class101 arg1, int arg2) {
        field2375++;
        if (arg0 != -4004 || arg2 != 0) {
            return;
        }
        int var4 = arg1.method741(113);
        if (var4 != 0) {
            this.method1140((byte) 119, var4);
            return;
        }
        this.field2380 = new int[arg1.method741(90)][4];
        for (int var5 = 0; var5 < this.field2380.length; var5++) {
            this.field2380[var5][0] = arg1.method731(false);
            this.field2380[var5][1] = arg1.method741(21) << 4;
            this.field2380[var5][2] = arg1.method741(class29.method193(arg0, -3998)) << 4;
            this.field2380[var5][3] = arg1.method741(11) << 4;
        }
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)V", line = 50)
    private final void method1139(int arg0) {
        field2368++;
        int var2 = this.field2380.length;
        if (var2 > 0) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var6 < var2 && this.field2380[var6][0] <= var5; var6++) {
                    var4++;
                }
                int var8;
                int var9;
                int var10;
                if (var4 >= var2) {
                    int[] var7 = this.field2380[var2 - 1];
                    var8 = var7[1];
                    var9 = var7[3];
                    var10 = var7[2];
                } else {
                    int[] var11 = this.field2380[var4];
                    if (var4 > 0) {
                        int[] var12 = this.field2380[var4 - 1];
                        int var13 = (var5 - var12[0] << 12) / (var11[0] - var12[0]);
                        int var14 = 4096 - var13;
                        var10 = var11[2] * var13 + (var12[2] * var14) >> 12;
                        var8 = var11[1] * var13 + var12[1] * var14 >> 12;
                        var9 = var11[3] * var13 + var12[3] * var14 >> 12;
                    } else {
                        var9 = var11[3];
                        var8 = var11[1];
                        var10 = var11[2];
                    }
                }
                int var15 = var8 >> 4;
                int var16 = var10 >> 4;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 255) {
                    var15 = 255;
                }
                int var17 = var9 >> 4;
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                this.field2378[var3] = class94.method673(class94.method673(var16 << 8, var15 << 16), var17);
            }
        }
        if (arg0 != -256) {
            field2376 = -89;
        }
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(I)V", line = 154)
    public final void method70(int arg0) {
        if (this.field2380 == null) {
            this.method1140((byte) 119, 1);
        }
        field2369++;
        if (arg0 <= 13) {
            field2367 = (class120[]) null;
        }
        this.method1139(-256);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)[[I", line = 171)
    public final int[][] method74(int arg0, int arg1) {
        if (arg1 != 82) {
            field2374 = 22;
        }
        field2377++;
        int[][] var3 = this.field4772.method1175(-46, arg0);
        if (this.field4772.field2488) {
            int[] var4 = this.method2107(arg0, arg1 ^ 0x52, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class70.field1108; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field2378[var9];
                var5[var8] = class280.method2001(16711680, var10) >> 12;
                var6[var8] = class280.method2001(65280, var10) >> 4;
                var7[var8] = class280.method2001(255, var10) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(BI)V", line = 228)
    private final void method1140(byte arg0, int arg1) {
        field2365++;
        if (arg0 != 119) {
            field2370 = -87;
        }
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            this.field2380 = new int[2][4];
            this.field2380[0][3] = 0;
            this.field2380[0][2] = 0;
            this.field2380[0][1] = 0;
            this.field2380[1][3] = 4096;
            this.field2380[0][0] = 0;
            this.field2380[1][1] = 4096;
            this.field2380[1][0] = 4096;
            this.field2380[1][2] = 4096;
        } else if (arg1 == 2) {
            this.field2380 = new int[8][4];
            this.field2380[0][0] = 0;
            this.field2380[1][0] = 2867;
            this.field2380[0][2] = 2602;
            this.field2380[2][0] = 3072;
            this.field2380[1][2] = 1799;
            this.field2380[2][2] = 1734;
            this.field2380[0][1] = 2650;
            this.field2380[0][3] = 2361;
            this.field2380[1][3] = 1558;
            this.field2380[3][0] = 3276;
            this.field2380[4][0] = 3481;
            this.field2380[5][0] = 3686;
            this.field2380[3][2] = 1220;
            this.field2380[4][2] = 963;
            this.field2380[5][2] = 2152;
            this.field2380[1][1] = 2313;
            this.field2380[6][2] = 1060;
            this.field2380[2][3] = 1413;
            this.field2380[7][2] = 1413;
            this.field2380[3][3] = 947;
            this.field2380[2][1] = 2618;
            this.field2380[3][1] = 2296;
            this.field2380[6][0] = 3891;
            this.field2380[4][3] = 722;
            this.field2380[4][1] = 2072;
            this.field2380[5][1] = 2730;
            this.field2380[6][1] = 2232;
            this.field2380[5][3] = 1766;
            this.field2380[7][0] = 4096;
            this.field2380[6][3] = 915;
            this.field2380[7][1] = 1686;
            this.field2380[7][3] = 1140;
        } else if (arg1 == 3) {
            this.field2380 = new int[7][4];
            this.field2380[0][3] = 4096;
            this.field2380[0][1] = 0;
            this.field2380[0][0] = 0;
            this.field2380[1][0] = 663;
            this.field2380[2][0] = 1363;
            this.field2380[3][0] = 2048;
            this.field2380[4][0] = 2727;
            this.field2380[1][3] = 4096;
            this.field2380[2][3] = 0;
            this.field2380[3][3] = 0;
            this.field2380[1][1] = 0;
            this.field2380[0][2] = 0;
            this.field2380[1][2] = 4096;
            this.field2380[2][1] = 0;
            this.field2380[4][3] = 0;
            this.field2380[5][0] = 3411;
            this.field2380[6][0] = 4096;
            this.field2380[2][2] = 4096;
            this.field2380[3][1] = 4096;
            this.field2380[5][3] = 4096;
            this.field2380[4][1] = 4096;
            this.field2380[3][2] = 4096;
            this.field2380[5][1] = 4096;
            this.field2380[6][3] = 4096;
            this.field2380[6][1] = 0;
            this.field2380[4][2] = 0;
            this.field2380[5][2] = 0;
            this.field2380[6][2] = 0;
        } else if (arg1 == 4) {
            this.field2380 = new int[6][4];
            this.field2380[0][0] = 0;
            this.field2380[0][2] = 0;
            this.field2380[0][3] = 0;
            this.field2380[1][0] = 1843;
            this.field2380[1][3] = 1493;
            this.field2380[2][3] = 2939;
            this.field2380[1][2] = 0;
            this.field2380[2][2] = 0;
            this.field2380[0][1] = 0;
            this.field2380[3][2] = 1124;
            this.field2380[4][2] = 3084;
            this.field2380[2][0] = 2457;
            this.field2380[3][3] = 3565;
            this.field2380[3][0] = 2781;
            this.field2380[5][2] = 4096;
            this.field2380[4][0] = 3481;
            this.field2380[1][1] = 0;
            this.field2380[2][1] = 0;
            this.field2380[3][1] = 0;
            this.field2380[5][0] = 4096;
            this.field2380[4][1] = 546;
            this.field2380[4][3] = 4031;
            this.field2380[5][1] = 4096;
            this.field2380[5][3] = 4096;
        } else if (arg1 == 5) {
            this.field2380 = new int[16][4];
            this.field2380[0][1] = 80;
            this.field2380[0][2] = 192;
            this.field2380[1][2] = 449;
            this.field2380[0][0] = 0;
            this.field2380[0][3] = 321;
            this.field2380[1][0] = 155;
            this.field2380[1][1] = 321;
            this.field2380[2][0] = 389;
            this.field2380[3][0] = 671;
            this.field2380[4][0] = 897;
            this.field2380[2][1] = 578;
            this.field2380[1][3] = 562;
            this.field2380[2][2] = 690;
            this.field2380[3][1] = 947;
            this.field2380[4][1] = 1285;
            this.field2380[3][2] = 995;
            this.field2380[2][3] = 803;
            this.field2380[5][1] = 1525;
            this.field2380[6][1] = 1734;
            this.field2380[7][1] = 1413;
            this.field2380[3][3] = 1140;
            this.field2380[5][0] = 1175;
            this.field2380[4][3] = 1509;
            this.field2380[5][3] = 1413;
            this.field2380[4][2] = 1397;
            this.field2380[5][2] = 1429;
            this.field2380[6][0] = 1368;
            this.field2380[7][0] = 1507;
            this.field2380[6][3] = 1333;
            this.field2380[8][0] = 1736;
            this.field2380[6][2] = 1461;
            this.field2380[7][2] = 1525;
            this.field2380[9][0] = 2088;
            this.field2380[8][1] = 1108;
            this.field2380[8][2] = 1590;
            this.field2380[9][1] = 1766;
            this.field2380[9][2] = 2056;
            this.field2380[10][2] = 2586;
            this.field2380[7][3] = 1702;
            this.field2380[10][0] = 2355;
            this.field2380[11][0] = 2691;
            this.field2380[12][0] = 3031;
            this.field2380[11][2] = 3148;
            this.field2380[13][0] = 3522;
            this.field2380[12][2] = 3710;
            this.field2380[8][3] = 2056;
            this.field2380[9][3] = 2666;
            this.field2380[10][1] = 2409;
            this.field2380[11][1] = 3116;
            this.field2380[14][0] = 3727;
            this.field2380[12][1] = 3806;
            this.field2380[13][1] = 3437;
            this.field2380[10][3] = 3276;
            this.field2380[15][0] = 4096;
            this.field2380[13][2] = 3421;
            this.field2380[11][3] = 3228;
            this.field2380[14][1] = 3116;
            this.field2380[15][1] = 2377;
            this.field2380[12][3] = 3196;
            this.field2380[13][3] = 3019;
            this.field2380[14][3] = 3228;
            this.field2380[14][2] = 3148;
            this.field2380[15][3] = 2746;
            this.field2380[15][2] = 2505;
        } else if (arg1 == 6) {
            this.field2380 = new int[4][4];
            this.field2380[0][0] = 2048;
            this.field2380[0][3] = 0;
            this.field2380[1][0] = 2867;
            this.field2380[2][0] = 3276;
            this.field2380[1][3] = 0;
            this.field2380[0][1] = 0;
            this.field2380[1][1] = 4096;
            this.field2380[2][1] = 4096;
            this.field2380[3][0] = 4096;
            this.field2380[3][1] = 4096;
            this.field2380[0][2] = 4096;
            this.field2380[1][2] = 4096;
            this.field2380[2][3] = 0;
            this.field2380[2][2] = 4096;
            this.field2380[3][2] = 0;
            this.field2380[3][3] = 0;
        } else {
            throw new RuntimeException("Invalid gradient preset");
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 478)
    public class147() {
        super(1, false);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIII)I", line = 482)
    public static final int method1141(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2379++;
        if (arg3 != 2) {
            field2374 = 68;
        }
        if (class300.field4722) {
            arg0 = 1000000;
            class300.field4722 = false;
        }
        class124 var5 = class259.field4026[arg2][arg4];
        float var6 = ((float) arg1 * 0.1F + 0.7F) * var5.field1983;
        int var7 = var5.field1978;
        float var8 = var5.field1984;
        int var9 = var5.field1979;
        int var10 = var5.field1982;
        float var11 = var5.field1981;
        if (!class307.field4846) {
            var10 = 0;
        }
        if (class249.field3850 != var7 || class31.field530 != var6 || class236.field3709 != var8 || class200.field3156 != var11 || class175.field2762 != var9 || class215.field3420 != var10) {
            class249.field3850 = var7;
            class149.field2402 = class268.field4157;
            class215.field3420 = var10;
            class31.field530 = var6;
            class236.field3709 = var8;
            class41.field732 = class23.field400;
            class235.field3702 = 0;
            class6.field67 = class78.field1198;
            class104.field1765 = class260.field4039;
            class191.field3052 = class126.field2006;
            class175.field2762 = var9;
            class193.field3075 = class81.field1220;
            class200.field3156 = var11;
        }
        if (class235.field3702 < 65536) {
            class235.field3702 += arg0 * 250;
            if (class235.field3702 >= 65536) {
                class235.field3702 = 65536;
            }
            int var12 = class235.field3702 >> 8;
            float var13 = (float) class235.field3702 / 65536.0F;
            float var14 = (float) (65536 - class235.field3702) / 65536.0F;
            class260.field4039 = class31.field530 * var13 + class104.field1765 * var14;
            class78.field1198 = class6.field67 * var14 + class236.field3709 * var13;
            class23.field400 = class41.field732 * var14 + class200.field3156 * var13;
            int var15 = 65536 - class235.field3702 >> 8;
            class268.field4157 = ((class175.field2762 & 0xFF00) * var12 + (class149.field2402 & 0xFF00) * var15 & 0xFF0000) + ((class175.field2762 & 0xFF00FF) * var12 + (class149.field2402 & 0xFF00FF) * var15 & 0xFF00FF00) >> 8;
            class81.field1220 = class215.field3420 * var12 + class193.field3075 * var15 >> 8;
            class126.field2006 = ((class249.field3850 & 0xFF00FF) * var12 + (class191.field3052 & 0xFF00FF) * var15 & 0xFF00FF00) + ((class249.field3850 & 0xFF00) * var12 + (class191.field3052 & 0xFF00) * var15 & 0xFF0000) >> 8;
        }
        class97.method707(class126.field2006, class260.field4039, class78.field1198, class23.field400);
        class97.method701(class268.field4157, class81.field1220);
        class97.method709((float) class300.field4724, (float) class160.field2522, (float) class256.field3959);
        class97.method708();
        return class268.field4157;
    }

    @OriginalMember(owner = "client!va", name = "g", descriptor = "(I)V", line = 563)
    public static final void method1142(int arg0) {
        if (arg0 != -29242) {
            method1144(true);
        }
        field2366++;
        if (class264.field4092 != null) {
            class136.method1043(class264.field4092, true);
            class264.field4092 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 595)
    public static final void method1143(Component arg0, int arg1) {
        if (arg1 <= 78) {
            field2372 = 23;
        }
        Method var2 = class325.field5053;
        field2381++;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class302.field4752);
        arg0.addFocusListener(class302.field4752);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V", line = 623)
    public static void method1144(boolean arg0) {
        if (arg0) {
            field2367 = null;
        }
    }
}
