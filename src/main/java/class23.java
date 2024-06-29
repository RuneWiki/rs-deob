import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class23 extends class21 {

    @OriginalMember(owner = "client!mm", name = "S", descriptor = "[I")
    private int[] field463 = new int[257];

    @OriginalMember(owner = "client!mm", name = "P", descriptor = "J")
    public static volatile long field460 = 0L;

    @OriginalMember(owner = "client!mm", name = "N", descriptor = "I")
    public static int field458 = 128;

    @OriginalMember(owner = "client!mm", name = "W", descriptor = "Z")
    public static boolean field467 = false;

    @OriginalMember(owner = "client!mm", name = "Z", descriptor = "I")
    public static int field470 = -1;

    @OriginalMember(owner = "client!mm", name = "X", descriptor = "[I")
    public static int[] field468 = new int[2500];

    @OriginalMember(owner = "client!mm", name = "O", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!mm", name = "Q", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!mm", name = "R", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!mm", name = "T", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!mm", name = "U", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!mm", name = "V", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!mm", name = "Y", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!mm", name = "ab", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!mm", name = "cb", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!mm", name = "bb", descriptor = "[[I")
    private int[][] field472;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "(B)V", line = 6)
    public static void method192(byte arg0) {
        field468 = null;
        if (arg0 < 87) {
            field467 = true;
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(IB)[[I", line = 34)
    public final int[][] method175(int arg0, byte arg1) {
        field466++;
        if (arg1 <= 16) {
            field468 = (int[]) null;
        }
        int[][] var3 = this.field441.method220(arg0, 17433);
        if (this.field441.field532) {
            int[] var4 = this.method171(0, 99, arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            for (int var8 = 0; var8 < class294.field4489; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field463[var9];
                var5[var8] = class61.method475(16711680, var10) >> 12;
                var7[var8] = class61.method475(var10 >> 4, 4080);
                var6[var8] = class61.method475(var10, 255) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B", line = 81)
    public static final byte[] method193(Object arg0, int arg1, boolean arg2) {
        field462++;
        if (arg0 == null) {
            return null;
        } else if ((arg0 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg0);
            return arg2 ? class140.method911(arg1 + 991056, var4) : var4;
        } else if (arg0 instanceof class159) {
            class159 var3 = (class159) arg0;
            return var3.method1026(1);
        } else {
            if (arg1 != 8944) {
                method194(55, (Component) null, -79, (class124) null, -65);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IILag;)V", line = 119)
    public final void method178(int arg0, int arg1, class202 arg2) {
        if (arg0 != -318) {
            return;
        }
        field464++;
        if (arg1 != 0) {
            return;
        }
        int var4 = arg2.method1317((byte) -123);
        if (var4 != 0) {
            this.method197(arg0 + 398, var4);
            return;
        }
        this.field472 = new int[arg2.method1317((byte) -128)][4];
        for (int var5 = 0; var5 < this.field472.length; var5++) {
            this.field472[var5][0] = arg2.method1315(14289);
            this.field472[var5][1] = arg2.method1317((byte) -102) << 4;
            this.field472[var5][2] = arg2.method1317((byte) -82) << 4;
            this.field472[var5][3] = arg2.method1317((byte) -96) << 4;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILjava/awt/Component;ILte;I)Log;", line = 157)
    public static final class225 method194(int arg0, Component arg1, int arg2, class124 arg3, int arg4) {
        field459++;
        if (class303.field4596 == 0) {
            throw new IllegalStateException();
        }
        if (arg4 <= 87) {
            field458 = -14;
        }
        if (arg2 < 0 || arg2 >= 2) {
            throw new IllegalArgumentException();
        }
        if (arg0 < 256) {
            arg0 = 256;
        }
        try {
            class225 var5 = (class225) Class.forName("kg").getDeclaredConstructor().newInstance();
            var5.field3567 = arg0;
            var5.field3540 = new int[(class119.field2071 ? 2 : 1) * 256];
            var5.method933(arg1);
            var5.field3561 = (arg0 & 0xFFFFFC00) + 1024;
            if (var5.field3561 > 16384) {
                var5.field3561 = 16384;
            }
            var5.method932(var5.field3561);
            if (class150.field2451 > 0 && class307.field4656 == null) {
                class307.field4656 = new class162();
                class307.field4656.field2621 = arg3;
                arg3.method802(class150.field2451, -48, class307.field4656);
            }
            if (class307.field4656 != null) {
                if (class307.field4656.field2616[arg2] != null) {
                    throw new IllegalArgumentException();
                }
                class307.field4656.field2616[arg2] = var5;
            }
            return var5;
        } catch (Throwable var10) {
            try {
                class181 var7 = new class181(arg3, arg2);
                var7.field3540 = new int[(class119.field2071 ? 2 : 1) * 256];
                var7.field3567 = arg0;
                var7.method933(arg1);
                var7.field3561 = 16384;
                var7.method932(var7.field3561);
                if (class150.field2451 > 0 && class307.field4656 == null) {
                    class307.field4656 = new class162();
                    class307.field4656.field2621 = arg3;
                    arg3.method802(class150.field2451, 104, class307.field4656);
                }
                if (class307.field4656 != null) {
                    if (class307.field4656.field2616[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class307.field4656.field2616[arg2] = var7;
                }
                return var7;
            } catch (Throwable var9) {
                return new class225();
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(I)V", line = 242)
    private final void method195(int arg0) {
        field469++;
        if (arg0 != 255) {
            return;
        }
        int var2 = this.field472.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var6 < var2 && this.field472[var6][0] <= var5; var6++) {
                var4++;
            }
            int var8;
            int var9;
            int var10;
            if (var4 >= var2) {
                int[] var7 = this.field472[var2 - 1];
                var8 = var7[1];
                var9 = var7[2];
                var10 = var7[3];
            } else {
                int[] var11 = this.field472[var4];
                if (var4 > 0) {
                    int[] var12 = this.field472[var4 - 1];
                    int var13 = (var5 - var12[0] << 12) / (var11[0] - var12[0]);
                    int var14 = 4096 - var13;
                    var8 = var11[1] * var13 + var12[1] * var14 >> 12;
                    var10 = var11[3] * var13 + var12[3] * var14 >> 12;
                    var9 = var11[2] * var13 + var12[2] * var14 >> 12;
                } else {
                    var8 = var11[1];
                    var9 = var11[2];
                    var10 = var11[3];
                }
            }
            int var15 = var10 >> 4;
            int var16 = var9 >> 4;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            int var17 = var8 >> 4;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            this.field463[var3] = class212.method1434(var15, class212.method1434(var16 << 8, var17 << 16));
        }
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(B)V", line = 348)
    public final void method183(byte arg0) {
        if (this.field472 == null) {
            this.method197(80, 1);
        }
        field465++;
        this.method195(255);
        if (arg0 <= 82) {
            field467 = false;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "([IIIIII)V", line = 365)
    public static final void method196(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class47 var6 = class326.field4975[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class154 var7 = var6.field970;
        if (var7 != null) {
            int var8 = var7.field2509;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class7 var10 = var6.field973;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field139;
        int var12 = var10.field141;
        int var13 = var10.field160;
        int var14 = var10.field146;
        int[] var15 = class69.field1472[var11];
        int[] var16 = class290.field4450[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V", line = 468)
    public class23() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)V", line = 475)
    private final void method197(int arg0, int arg1) {
        field473++;
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field472 = new int[2][4];
                this.field472[0][2] = 0;
                this.field472[0][1] = 0;
                this.field472[0][0] = 0;
                this.field472[1][1] = 4096;
                this.field472[0][3] = 0;
                this.field472[1][2] = 4096;
                this.field472[1][3] = 4096;
                this.field472[1][0] = 4096;
            } else if (arg1 == 2) {
                this.field472 = new int[8][4];
                this.field472[0][0] = 0;
                this.field472[0][3] = 2361;
                this.field472[1][3] = 1558;
                this.field472[1][0] = 2867;
                this.field472[2][0] = 3072;
                this.field472[0][2] = 2602;
                this.field472[2][3] = 1413;
                this.field472[0][1] = 2650;
                this.field472[1][2] = 1799;
                this.field472[3][3] = 947;
                this.field472[3][0] = 3276;
                this.field472[4][3] = 722;
                this.field472[5][3] = 1766;
                this.field472[6][3] = 915;
                this.field472[4][0] = 3481;
                this.field472[7][3] = 1140;
                this.field472[5][0] = 3686;
                this.field472[6][0] = 3891;
                this.field472[1][1] = 2313;
                this.field472[7][0] = 4096;
                this.field472[2][1] = 2618;
                this.field472[3][1] = 2296;
                this.field472[4][1] = 2072;
                this.field472[2][2] = 1734;
                this.field472[5][1] = 2730;
                this.field472[6][1] = 2232;
                this.field472[7][1] = 1686;
                this.field472[3][2] = 1220;
                this.field472[4][2] = 963;
                this.field472[5][2] = 2152;
                this.field472[6][2] = 1060;
                this.field472[7][2] = 1413;
            } else if (arg1 == 3) {
                this.field472 = new int[7][4];
                this.field472[0][2] = 0;
                this.field472[1][2] = 4096;
                this.field472[0][0] = 0;
                this.field472[0][1] = 0;
                this.field472[1][1] = 0;
                this.field472[0][3] = 4096;
                this.field472[2][2] = 4096;
                this.field472[1][0] = 663;
                this.field472[2][1] = 0;
                this.field472[3][2] = 4096;
                this.field472[4][2] = 0;
                this.field472[2][0] = 1363;
                this.field472[1][3] = 4096;
                this.field472[5][2] = 0;
                this.field472[3][1] = 4096;
                this.field472[6][2] = 0;
                this.field472[4][1] = 4096;
                this.field472[5][1] = 4096;
                this.field472[2][3] = 0;
                this.field472[3][3] = 0;
                this.field472[6][1] = 0;
                this.field472[4][3] = 0;
                this.field472[5][3] = 4096;
                this.field472[6][3] = 4096;
                this.field472[3][0] = 2048;
                this.field472[4][0] = 2727;
                this.field472[5][0] = 3411;
                this.field472[6][0] = 4096;
            } else if (arg1 == 4) {
                this.field472 = new int[6][4];
                this.field472[0][0] = 0;
                this.field472[0][1] = 0;
                this.field472[0][3] = 0;
                this.field472[0][2] = 0;
                this.field472[1][2] = 0;
                this.field472[1][0] = 1843;
                this.field472[2][2] = 0;
                this.field472[3][2] = 1124;
                this.field472[1][3] = 1493;
                this.field472[2][3] = 2939;
                this.field472[2][0] = 2457;
                this.field472[1][1] = 0;
                this.field472[2][1] = 0;
                this.field472[3][3] = 3565;
                this.field472[4][2] = 3084;
                this.field472[5][2] = 4096;
                this.field472[3][1] = 0;
                this.field472[3][0] = 2781;
                this.field472[4][0] = 3481;
                this.field472[4][1] = 546;
                this.field472[5][0] = 4096;
                this.field472[5][1] = 4096;
                this.field472[4][3] = 4031;
                this.field472[5][3] = 4096;
            } else if (arg1 == 5) {
                this.field472 = new int[16][4];
                this.field472[0][2] = 192;
                this.field472[0][0] = 0;
                this.field472[1][2] = 449;
                this.field472[0][1] = 80;
                this.field472[1][0] = 155;
                this.field472[2][0] = 389;
                this.field472[3][0] = 671;
                this.field472[4][0] = 897;
                this.field472[1][1] = 321;
                this.field472[2][2] = 690;
                this.field472[3][2] = 995;
                this.field472[4][2] = 1397;
                this.field472[0][3] = 321;
                this.field472[1][3] = 562;
                this.field472[5][2] = 1429;
                this.field472[5][0] = 1175;
                this.field472[2][3] = 803;
                this.field472[2][1] = 578;
                this.field472[3][1] = 947;
                this.field472[4][1] = 1285;
                this.field472[3][3] = 1140;
                this.field472[4][3] = 1509;
                this.field472[6][0] = 1368;
                this.field472[7][0] = 1507;
                this.field472[5][3] = 1413;
                this.field472[8][0] = 1736;
                this.field472[6][2] = 1461;
                this.field472[5][1] = 1525;
                this.field472[6][3] = 1333;
                this.field472[7][3] = 1702;
                this.field472[6][1] = 1734;
                this.field472[9][0] = 2088;
                this.field472[10][0] = 2355;
                this.field472[7][2] = 1525;
                this.field472[8][3] = 2056;
                this.field472[11][0] = 2691;
                this.field472[8][2] = 1590;
                this.field472[12][0] = 3031;
                this.field472[9][2] = 2056;
                this.field472[13][0] = 3522;
                this.field472[9][3] = 2666;
                this.field472[10][3] = 3276;
                this.field472[10][2] = 2586;
                this.field472[14][0] = 3727;
                this.field472[11][2] = 3148;
                this.field472[11][3] = 3228;
                this.field472[15][0] = 4096;
                this.field472[12][2] = 3710;
                this.field472[7][1] = 1413;
                this.field472[8][1] = 1108;
                this.field472[9][1] = 1766;
                this.field472[12][3] = 3196;
                this.field472[13][2] = 3421;
                this.field472[10][1] = 2409;
                this.field472[14][2] = 3148;
                this.field472[15][2] = 2505;
                this.field472[13][3] = 3019;
                this.field472[11][1] = 3116;
                this.field472[14][3] = 3228;
                this.field472[12][1] = 3806;
                this.field472[13][1] = 3437;
                this.field472[15][3] = 2746;
                this.field472[14][1] = 3116;
                this.field472[15][1] = 2377;
            } else if (arg1 == 6) {
                this.field472 = new int[4][4];
                this.field472[0][2] = 4096;
                this.field472[0][3] = 0;
                this.field472[1][2] = 4096;
                this.field472[0][1] = 0;
                this.field472[0][0] = 2048;
                this.field472[1][0] = 2867;
                this.field472[1][3] = 0;
                this.field472[1][1] = 4096;
                this.field472[2][1] = 4096;
                this.field472[3][1] = 4096;
                this.field472[2][0] = 3276;
                this.field472[2][2] = 4096;
                this.field472[3][2] = 0;
                this.field472[2][3] = 0;
                this.field472[3][3] = 0;
                this.field472[3][0] = 4096;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (arg0 != 80) {
            this.method175(64, (byte) -56);
        }
    }
}
