import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class178 extends class53 {

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "[I")
    private int[] field2995 = new int[257];

    @OriginalMember(owner = "client!uc", name = "X", descriptor = "Lgb;")
    public static class158 field3003 = new class158(50);

    @OriginalMember(owner = "client!uc", name = "Z", descriptor = "I")
    public static int field3005 = 128;

    @OriginalMember(owner = "client!uc", name = "ab", descriptor = "Lwa;")
    public static class75 field3006 = class66.method560("Bitte entfernen Sie ", false);

    @OriginalMember(owner = "client!uc", name = "bb", descriptor = "I")
    public static int field3007 = 0;

    @OriginalMember(owner = "client!uc", name = "eb", descriptor = "Lwa;")
    public static class75 field3010 = class66.method560("::noclip", false);

    @OriginalMember(owner = "client!uc", name = "gb", descriptor = "J")
    public static volatile long field3012 = 0L;

    @OriginalMember(owner = "client!uc", name = "cb", descriptor = "Lwa;")
    public static class75 field3008 = class66.method560("::fullscreen", false);

    @OriginalMember(owner = "client!uc", name = "fb", descriptor = "Lwa;")
    public static class75 field3011 = class66.method560("showingVideoAd", false);

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!uc", name = "S", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!uc", name = "U", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!uc", name = "V", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!uc", name = "Y", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!uc", name = "hb", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!uc", name = "db", descriptor = "[Lwa;")
    public static class75[] field3009;

    @OriginalMember(owner = "client!uc", name = "W", descriptor = "[[I")
    private int[][] field3002;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)V", line = 7)
    private final void method1308(int arg0) {
        field2994++;
        int var2 = this.field3002.length;
        if (arg0 < 81 || var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var2 > var6 && var5 >= this.field3002[var6][0]; var6++) {
                var4++;
            }
            int var8;
            int var9;
            int var10;
            if (var4 >= var2) {
                int[] var7 = this.field3002[var2 - 1];
                var8 = var7[1];
                var9 = var7[2];
                var10 = var7[3];
            } else {
                int[] var11 = this.field3002[var4];
                if (var4 > 0) {
                    int[] var12 = this.field3002[var4 - 1];
                    int var13 = (var5 - var12[0] << 12) / (var11[0] - var12[0]);
                    int var14 = 4096 - var13;
                    var10 = var11[3] * var13 + (var12[3] * var14) >> 12;
                    var8 = var11[1] * var13 + var12[1] * var14 >> 12;
                    var9 = var11[2] * var13 + var12[2] * var14 >> 12;
                } else {
                    var8 = var11[1];
                    var9 = var11[2];
                    var10 = var11[3];
                }
            }
            int var15 = var8 >> 4;
            int var16 = var10 >> 4;
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
            int var17 = var9 >> 4;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            this.field2995[var3] = class102.method799(var16, class102.method799(var15 << 16, var17 << 8));
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILja;Z)V", line = 109)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        field2993++;
        if (arg0 == 0) {
            int var4 = arg1.method501(0);
            if (var4 == 0) {
                this.field3002 = new int[arg1.method501(0)][4];
                for (int var5 = 0; var5 < this.field3002.length; var5++) {
                    this.field3002[var5][0] = arg1.method485((byte) -2);
                    this.field3002[var5][1] = arg1.method501(0) << 4;
                    this.field3002[var5][2] = arg1.method501(0) << 4;
                    this.field3002[var5][3] = arg1.method501(0) << 4;
                }
            } else {
                this.method1311((byte) -14, var4);
            }
        }
        if (!arg2) {
            field3009 = (class75[]) null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "(I)Lja;", line = 146)
    public static final class60 method1309(int arg0) {
        field3000++;
        class60 var1 = new class60(24);
        var1.method518(120, arg0);
        var1.method518(arg0 ^ 0x64, class253.field4256);
        var1.method518(arg0 + 117, class287.field4937 ? 1 : 0);
        var1.method518(127, class74.field1239 ? 1 : 0);
        var1.method518(108, class161.field2727 ? 1 : 0);
        var1.method518(117, class273.field4709 ? 1 : 0);
        var1.method518(104, class246.field4140 ? 1 : 0);
        var1.method518(126, class125.field2088 ? 1 : 0);
        var1.method518(122, class75.field1293 ? 1 : 0);
        var1.method518(105, class75.field1286 ? 1 : 0);
        var1.method518(124, class157.field2692);
        var1.method518(111, class116.field1970 ? 1 : 0);
        var1.method518(113, class167.field2816 ? 1 : 0);
        var1.method518(119, class69.field1193 ? 1 : 0);
        var1.method518(101, class274.field4727);
        var1.method518(102, class151.field2599 ? 1 : 0);
        var1.method518(arg0 ^ 0x65, class17.field221);
        var1.method518(124, class164.field2783);
        var1.method518(126, class285.field4909);
        var1.method503(-597878072, class285.field4901);
        var1.method503(-597878072, class177.field2985);
        var1.method518(arg0 ^ 0x71, class279.field4838 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "(I)Leh;", line = 178)
    public static final class156 method1310(int arg0) {
        field2996++;
        class156 var1 = (class156) class217.field3712.method857((byte) -35);
        if (var1 != null) {
            var1.method1527(61);
            var1.method1937(arg0 ^ 0x6E);
            return var1;
        } else if (arg0 == 0) {
            class156 var2;
            do {
                var2 = (class156) class7.field96.method857((byte) -35);
                if (var2 == null) {
                    return null;
                }
                if (var2.method1185(1) > class78.method669(arg0 + 2047)) {
                    return null;
                }
                var2.method1527(arg0 ^ 0xFFFFFFC8);
                var2.method1937(120);
            } while ((Long.MIN_VALUE & var2.field4682) == 0L);
            return var2;
        } else {
            return (class156) null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)[[I", line = 223)
    public final int[][] method66(int arg0, int arg1) {
        field2998++;
        int[][] var3 = this.field882.method874(false, arg0);
        int var4 = -49 % ((arg1 - 76) / 42);
        if (this.field882.field1935) {
            int[] var5 = this.method391(0, 0, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            for (int var9 = 0; var9 < class269.field4644; var9++) {
                int var10 = var5[var9] >> 4;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var10 > 256) {
                    var10 = 256;
                }
                int var11 = this.field2995[var10];
                var6[var9] = class235.method1710(var11, 16711680) >> 12;
                var8[var9] = class235.method1710(4080, var11 >> 4);
                var7[var9] = class235.method1710(var11, 255) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)V", line = 273)
    private final void method1311(byte arg0, int arg1) {
        field2997++;
        if (arg0 != -14) {
            field3012 = -56L;
        }
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            this.field3002 = new int[2][4];
            this.field3002[0][0] = 0;
            this.field3002[0][3] = 0;
            this.field3002[1][0] = 4096;
            this.field3002[1][3] = 4096;
            this.field3002[0][1] = 0;
            this.field3002[1][1] = 4096;
            this.field3002[0][2] = 0;
            this.field3002[1][2] = 4096;
        } else if (arg1 == 2) {
            this.field3002 = new int[8][4];
            this.field3002[0][1] = 2650;
            this.field3002[0][0] = 0;
            this.field3002[1][0] = 2867;
            this.field3002[2][0] = 3072;
            this.field3002[1][1] = 2313;
            this.field3002[3][0] = 3276;
            this.field3002[0][3] = 2361;
            this.field3002[2][1] = 2618;
            this.field3002[4][0] = 3481;
            this.field3002[5][0] = 3686;
            this.field3002[6][0] = 3891;
            this.field3002[1][3] = 1558;
            this.field3002[3][1] = 2296;
            this.field3002[7][0] = 4096;
            this.field3002[2][3] = 1413;
            this.field3002[3][3] = 947;
            this.field3002[4][3] = 722;
            this.field3002[4][1] = 2072;
            this.field3002[5][3] = 1766;
            this.field3002[6][3] = 915;
            this.field3002[0][2] = 2602;
            this.field3002[1][2] = 1799;
            this.field3002[2][2] = 1734;
            this.field3002[7][3] = 1140;
            this.field3002[5][1] = 2730;
            this.field3002[3][2] = 1220;
            this.field3002[6][1] = 2232;
            this.field3002[4][2] = 963;
            this.field3002[5][2] = 2152;
            this.field3002[7][1] = 1686;
            this.field3002[6][2] = 1060;
            this.field3002[7][2] = 1413;
        } else if (arg1 == 3) {
            this.field3002 = new int[7][4];
            this.field3002[0][3] = 4096;
            this.field3002[1][3] = 4096;
            this.field3002[0][2] = 0;
            this.field3002[0][1] = 0;
            this.field3002[0][0] = 0;
            this.field3002[2][3] = 0;
            this.field3002[1][2] = 4096;
            this.field3002[2][2] = 4096;
            this.field3002[1][0] = 663;
            this.field3002[1][1] = 0;
            this.field3002[3][2] = 4096;
            this.field3002[4][2] = 0;
            this.field3002[5][2] = 0;
            this.field3002[2][0] = 1363;
            this.field3002[3][0] = 2048;
            this.field3002[3][3] = 0;
            this.field3002[4][0] = 2727;
            this.field3002[4][3] = 0;
            this.field3002[5][3] = 4096;
            this.field3002[6][3] = 4096;
            this.field3002[6][2] = 0;
            this.field3002[2][1] = 0;
            this.field3002[5][0] = 3411;
            this.field3002[3][1] = 4096;
            this.field3002[4][1] = 4096;
            this.field3002[5][1] = 4096;
            this.field3002[6][0] = 4096;
            this.field3002[6][1] = 0;
        } else if (arg1 == 4) {
            this.field3002 = new int[6][4];
            this.field3002[0][2] = 0;
            this.field3002[0][3] = 0;
            this.field3002[1][3] = 1493;
            this.field3002[1][2] = 0;
            this.field3002[2][2] = 0;
            this.field3002[0][0] = 0;
            this.field3002[1][0] = 1843;
            this.field3002[3][2] = 1124;
            this.field3002[0][1] = 0;
            this.field3002[4][2] = 3084;
            this.field3002[2][3] = 2939;
            this.field3002[1][1] = 0;
            this.field3002[3][3] = 3565;
            this.field3002[4][3] = 4031;
            this.field3002[5][3] = 4096;
            this.field3002[2][1] = 0;
            this.field3002[5][2] = 4096;
            this.field3002[3][1] = 0;
            this.field3002[4][1] = 546;
            this.field3002[2][0] = 2457;
            this.field3002[3][0] = 2781;
            this.field3002[4][0] = 3481;
            this.field3002[5][1] = 4096;
            this.field3002[5][0] = 4096;
        } else if (arg1 == 5) {
            this.field3002 = new int[16][4];
            this.field3002[0][3] = 321;
            this.field3002[0][1] = 80;
            this.field3002[0][2] = 192;
            this.field3002[0][0] = 0;
            this.field3002[1][1] = 321;
            this.field3002[1][2] = 449;
            this.field3002[2][1] = 578;
            this.field3002[1][3] = 562;
            this.field3002[1][0] = 155;
            this.field3002[2][3] = 803;
            this.field3002[2][0] = 389;
            this.field3002[3][3] = 1140;
            this.field3002[3][0] = 671;
            this.field3002[4][0] = 897;
            this.field3002[3][1] = 947;
            this.field3002[5][0] = 1175;
            this.field3002[2][2] = 690;
            this.field3002[3][2] = 995;
            this.field3002[4][1] = 1285;
            this.field3002[5][1] = 1525;
            this.field3002[6][0] = 1368;
            this.field3002[6][1] = 1734;
            this.field3002[4][3] = 1509;
            this.field3002[7][0] = 1507;
            this.field3002[8][0] = 1736;
            this.field3002[9][0] = 2088;
            this.field3002[5][3] = 1413;
            this.field3002[10][0] = 2355;
            this.field3002[4][2] = 1397;
            this.field3002[7][1] = 1413;
            this.field3002[11][0] = 2691;
            this.field3002[6][3] = 1333;
            this.field3002[7][3] = 1702;
            this.field3002[8][1] = 1108;
            this.field3002[12][0] = 3031;
            this.field3002[8][3] = 2056;
            this.field3002[9][3] = 2666;
            this.field3002[10][3] = 3276;
            this.field3002[11][3] = 3228;
            this.field3002[5][2] = 1429;
            this.field3002[12][3] = 3196;
            this.field3002[13][0] = 3522;
            this.field3002[9][1] = 1766;
            this.field3002[10][1] = 2409;
            this.field3002[14][0] = 3727;
            this.field3002[15][0] = 4096;
            this.field3002[6][2] = 1461;
            this.field3002[13][3] = 3019;
            this.field3002[11][1] = 3116;
            this.field3002[7][2] = 1525;
            this.field3002[12][1] = 3806;
            this.field3002[13][1] = 3437;
            this.field3002[14][1] = 3116;
            this.field3002[8][2] = 1590;
            this.field3002[14][3] = 3228;
            this.field3002[15][3] = 2746;
            this.field3002[9][2] = 2056;
            this.field3002[10][2] = 2586;
            this.field3002[15][1] = 2377;
            this.field3002[11][2] = 3148;
            this.field3002[12][2] = 3710;
            this.field3002[13][2] = 3421;
            this.field3002[14][2] = 3148;
            this.field3002[15][2] = 2505;
        } else if (arg1 == 6) {
            this.field3002 = new int[4][4];
            this.field3002[0][0] = 2048;
            this.field3002[0][1] = 0;
            this.field3002[1][1] = 4096;
            this.field3002[1][0] = 2867;
            this.field3002[0][3] = 0;
            this.field3002[2][0] = 3276;
            this.field3002[2][1] = 4096;
            this.field3002[0][2] = 4096;
            this.field3002[1][3] = 0;
            this.field3002[3][1] = 4096;
            this.field3002[2][3] = 0;
            this.field3002[1][2] = 4096;
            this.field3002[3][3] = 0;
            this.field3002[2][2] = 4096;
            this.field3002[3][0] = 4096;
            this.field3002[3][2] = 0;
        } else {
            throw new RuntimeException("Invalid gradient preset");
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V", line = 524)
    public final void method56(byte arg0) {
        field3001++;
        if (this.field3002 == null) {
            this.method1311((byte) -14, 1);
        }
        if (arg0 != -79) {
            method1310(64);
        }
        this.method1308(87);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ltf;Z)V", line = 538)
    public static final void method1312(class242 arg0, boolean arg1) {
        class238.field4000.method1251(arg0, -119);
        while (true) {
            class242 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class242[][] var7;
            class242 var79;
            do {
                class242 var78;
                do {
                    class242 var77;
                    do {
                        class242 var76;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class242) class238.field4000.method1258(50);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field4090);
                                            var3 = var2.field4100;
                                            var4 = var2.field4094;
                                            var5 = var2.field4087;
                                            var6 = var2.field4093;
                                            var7 = class271.field4681[var5];
                                            float var8 = 0.0F;
                                            float var13;
                                            if (class53.field879 == class156.field2669) {
                                                int var9 = class259.field4342[var3][var4];
                                                int var10 = var9 & 0xFFFFFF;
                                                if (class285.field4913 != var10) {
                                                    class285.field4913 = var10;
                                                    class180.method1322(var10, (byte) -123);
                                                    class239.method1740(class123.method931(1));
                                                }
                                                int var11 = var9 >>> 24 << 3;
                                                if (class89.field1479 != var11) {
                                                    class89.field1479 = var11;
                                                    class242.method1765(var11, (byte) 126);
                                                }
                                                int var12 = class60.field1058[0][var3 + 1][var4] + class60.field1058[0][var3][var4] + class60.field1058[0][var3][var4 + 1] + class60.field1058[0][var3 + 1][var4 + 1] >> 2;
                                                class140.method1079(3, (byte) 126, -var12);
                                                var13 = 201.5F;
                                                class47.method315(var13);
                                            } else {
                                                var13 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                class47.method315(var13);
                                            }
                                            if (!var2.field4085) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class242 var14 = class271.field4681[var5 - 1][var3][var4];
                                                    if (var14 != null && var14.field4090) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class53.field875 && var3 > class217.field3710) {
                                                    class242 var15 = var7[var3 - 1][var4];
                                                    if (var15 != null && var15.field4090 && (var15.field4085 || (var2.field4097 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class53.field875 && var3 < class182.field3039 - 1) {
                                                    class242 var16 = var7[var3 + 1][var4];
                                                    if (var16 != null && var16.field4090 && (var16.field4085 || (var2.field4097 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class188.field3131 && var4 > class255.field4270) {
                                                    class242 var17 = var7[var3][var4 - 1];
                                                    if (var17 != null && var17.field4090 && (var17.field4085 || (var2.field4097 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class188.field3131 && var4 < class260.field4360 - 1) {
                                                    class242 var18 = var7[var3][var4 + 1];
                                                    if (var18 != null && var18.field4090 && (var18.field4085 || (var2.field4097 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field4085 = false;
                                            if (var2.field4088 != null) {
                                                class242 var19 = var2.field4088;
                                                class47.method315(201.5F - (float) (var19.field4093 + 1) * 50.0F);
                                                if (var19.field4089 == null) {
                                                    if (var19.field4082 != null) {
                                                        if (class3.method18(0, var3, var4)) {
                                                            class172.method1274(var19.field4082, class42.field701, class130.field2257, class270.field4667, class34.field501, var3, var4, true);
                                                        } else {
                                                            class172.method1274(var19.field4082, class42.field701, class130.field2257, class270.field4667, class34.field501, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class3.method18(0, var3, var4)) {
                                                    class170.method1255(var19.field4089, 0, class42.field701, class130.field2257, class270.field4667, class34.field501, var3, var4, true);
                                                } else {
                                                    class170.method1255(var19.field4089, 0, class42.field701, class130.field2257, class270.field4667, class34.field501, var3, var4, false);
                                                }
                                                class167 var20 = var19.field4098;
                                                if (var20 != null) {
                                                    if ((var20.field2818 & var2.field4091) == 0) {
                                                        class209.method1544(class199.field3347, class300.field5129, class207.field3509, var5, var3, var4);
                                                    } else {
                                                        class209.method1549(var20.field2818, class199.field3347, class300.field5129, class207.field3509, var6, var3, var4);
                                                    }
                                                    var20.field2815.method409(0, class42.field701, class130.field2257, class270.field4667, class34.field501, var20.field2823 - class199.field3347, var20.field2819 - class300.field5129, var20.field2822 - class207.field3509, var20.field2814);
                                                }
                                                for (int var21 = 0; var21 < var19.field4086; var21++) {
                                                    class285 var22 = var19.field4083[var21];
                                                    if (var22 != null) {
                                                        class209.method1544(class199.field3347, class300.field5129, class207.field3509, var5, var3, var4);
                                                        var22.field4898.method409(var22.field4893, class42.field701, class130.field2257, class270.field4667, class34.field501, var22.field4908 - class199.field3347, var22.field4900 - class300.field5129, var22.field4899 - class207.field3509, var22.field4914);
                                                    }
                                                }
                                                class47.method315(var13);
                                            }
                                            boolean var23 = false;
                                            if (var2.field4089 == null) {
                                                if (var2.field4082 != null) {
                                                    if (class3.method18(var6, var3, var4)) {
                                                        class172.method1274(var2.field4082, class42.field701, class130.field2257, class270.field4667, class34.field501, var3, var4, true);
                                                    } else {
                                                        var23 = true;
                                                        class172.method1274(var2.field4082, class42.field701, class130.field2257, class270.field4667, class34.field501, var3, var4, false);
                                                    }
                                                }
                                            } else if (class3.method18(var6, var3, var4)) {
                                                class170.method1255(var2.field4089, var6, class42.field701, class130.field2257, class270.field4667, class34.field501, var3, var4, true);
                                            } else {
                                                var23 = true;
                                                if (var2.field4089.field3982 != 12345678 || class259.field4337 && var5 <= class172.field2904) {
                                                    class170.method1255(var2.field4089, var6, class42.field701, class130.field2257, class270.field4667, class34.field501, var3, var4, false);
                                                }
                                            }
                                            if (var23) {
                                                class217 var24 = var2.field4092;
                                                if (var24 != null && (var24.field3704 & 0x80000000L) != 0L) {
                                                    if (var24.field3714) {
                                                        class47.method315(var13 + 50.0F - 1.5F);
                                                    }
                                                    class209.method1544(class199.field3347, class300.field5129, class207.field3509, var5, var3, var4);
                                                    var24.field3707.method409(0, class42.field701, class130.field2257, class270.field4667, class34.field501, var24.field3709 - class199.field3347, var24.field3705 - class300.field5129, var24.field3711 - class207.field3509, var24.field3704);
                                                    if (var24.field3714) {
                                                        class47.method315(var13);
                                                    }
                                                }
                                            }
                                            int var25 = 0;
                                            int var26 = 0;
                                            class167 var27 = var2.field4098;
                                            class235 var28 = var2.field4096;
                                            if (var27 != null || var28 != null) {
                                                if (class53.field875 == var3) {
                                                    var25++;
                                                } else if (class53.field875 < var3) {
                                                    var25 += 2;
                                                }
                                                if (class188.field3131 == var4) {
                                                    var25 += 3;
                                                } else if (class188.field3131 > var4) {
                                                    var25 += 6;
                                                }
                                                var26 = class198.field3319[var25];
                                                var2.field4091 = class73.field1232[var25];
                                            }
                                            if (var27 != null) {
                                                if ((var27.field2818 & class25.field327[var25]) == 0) {
                                                    var2.field4084 = 0;
                                                } else if (var27.field2818 == 16) {
                                                    var2.field4084 = 3;
                                                    var2.field4081 = class41.field679[var25];
                                                    var2.field4101 = 3 - var2.field4081;
                                                } else if (var27.field2818 == 32) {
                                                    var2.field4084 = 6;
                                                    var2.field4081 = class261.field4366[var25];
                                                    var2.field4101 = 6 - var2.field4081;
                                                } else if (var27.field2818 == 64) {
                                                    var2.field4084 = 12;
                                                    var2.field4081 = class196.field3290[var25];
                                                    var2.field4101 = 12 - var2.field4081;
                                                } else {
                                                    var2.field4084 = 9;
                                                    var2.field4081 = class205.field3470[var25];
                                                    var2.field4101 = 9 - var2.field4081;
                                                }
                                                if ((var27.field2818 & var26) != 0 && !class65.method553(var6, var3, var4, var27.field2818)) {
                                                    class209.method1544(class199.field3347, class300.field5129, class207.field3509, var5, var3, var4);
                                                    var27.field2815.method409(0, class42.field701, class130.field2257, class270.field4667, class34.field501, var27.field2823 - class199.field3347, var27.field2819 - class300.field5129, var27.field2822 - class207.field3509, var27.field2814);
                                                }
                                                if ((var27.field2821 & var26) != 0 && !class65.method553(var6, var3, var4, var27.field2821)) {
                                                    class209.method1544(class199.field3347, class300.field5129, class207.field3509, var5, var3, var4);
                                                    var27.field2809.method409(0, class42.field701, class130.field2257, class270.field4667, class34.field501, var27.field2823 - class199.field3347, var27.field2819 - class300.field5129, var27.field2822 - class207.field3509, var27.field2814);
                                                }
                                            }
                                            if (var28 != null && !class32.method212(var6, var3, var4, var28.field3977.method443())) {
                                                class47.method315(var13 - 0.5F);
                                                if ((var28.field3972 & var26) != 0) {
                                                    class209.method1544(class199.field3347, class300.field5129, class207.field3509, var5, var3, var4);
                                                    var28.field3977.method409(0, class42.field701, class130.field2257, class270.field4667, class34.field501, var28.field3964 + var28.field3960 - class199.field3347, var28.field3970 - class300.field5129, var28.field3965 + var28.field3975 - class207.field3509, var28.field3967);
                                                } else if (var28.field3972 == 256) {
                                                    int var29 = var28.field3964 - class199.field3347;
                                                    int var30 = var28.field3970 - class300.field5129;
                                                    int var31 = var28.field3965 - class207.field3509;
                                                    int var32 = var28.field3979;
                                                    int var33;
                                                    if (var32 == 1 || var32 == 2) {
                                                        var33 = -var29;
                                                    } else {
                                                        var33 = var29;
                                                    }
                                                    int var34;
                                                    if (var32 == 2 || var32 == 3) {
                                                        var34 = -var31;
                                                    } else {
                                                        var34 = var31;
                                                    }
                                                    if (var34 < var33) {
                                                        class209.method1544(class199.field3347, class300.field5129, class207.field3509, var5, var3, var4);
                                                        var28.field3977.method409(0, class42.field701, class130.field2257, class270.field4667, class34.field501, var28.field3960 + var29, var30, var28.field3975 + var31, var28.field3967);
                                                    } else if (var28.field3963 != null) {
                                                        class209.method1544(class199.field3347, class300.field5129, class207.field3509, var5, var3, var4);
                                                        var28.field3963.method409(0, class42.field701, class130.field2257, class270.field4667, class34.field501, var29, var30, var31, var28.field3967);
                                                    }
                                                }
                                                class47.method315(var13);
                                            }
                                            if (var23) {
                                                class217 var35 = var2.field4092;
                                                if (var35 != null && (var35.field3704 & 0x80000000L) == 0L) {
                                                    if (var35.field3714) {
                                                        class47.method315(var13 + 50.0F - 1.5F);
                                                    }
                                                    class209.method1544(class199.field3347, class300.field5129, class207.field3509, var5, var3, var4);
                                                    var35.field3707.method409(0, class42.field701, class130.field2257, class270.field4667, class34.field501, var35.field3709 - class199.field3347, var35.field3705 - class300.field5129, var35.field3711 - class207.field3509, var35.field3704);
                                                    if (var35.field3714) {
                                                        class47.method315(var13);
                                                    }
                                                }
                                                class282 var36 = var2.field4095;
                                                if (var36 != null && var36.field4869 == 0) {
                                                    class209.method1544(class199.field3347, class300.field5129, class207.field3509, var5, var3, var4);
                                                    if (var36.field4860 != null) {
                                                        var36.field4860.method409(0, class42.field701, class130.field2257, class270.field4667, class34.field501, var36.field4857 - class199.field3347, var36.field4856 - class300.field5129, var36.field4870 - class207.field3509, var36.field4854);
                                                    }
                                                    if (var36.field4862 != null) {
                                                        var36.field4862.method409(0, class42.field701, class130.field2257, class270.field4667, class34.field501, var36.field4857 - class199.field3347, var36.field4856 - class300.field5129, var36.field4870 - class207.field3509, var36.field4854);
                                                    }
                                                    if (var36.field4864 != null) {
                                                        var36.field4864.method409(0, class42.field701, class130.field2257, class270.field4667, class34.field501, var36.field4857 - class199.field3347, var36.field4856 - class300.field5129, var36.field4870 - class207.field3509, var36.field4854);
                                                    }
                                                }
                                            }
                                            int var37 = var2.field4097;
                                            if (var37 != 0) {
                                                if (var3 < class53.field875 && (var37 & 0x4) != 0) {
                                                    class242 var38 = var7[var3 + 1][var4];
                                                    if (var38 != null && var38.field4090) {
                                                        class238.field4000.method1251(var38, -116);
                                                    }
                                                }
                                                if (var4 < class188.field3131 && (var37 & 0x2) != 0) {
                                                    class242 var39 = var7[var3][var4 + 1];
                                                    if (var39 != null && var39.field4090) {
                                                        class238.field4000.method1251(var39, -128);
                                                    }
                                                }
                                                if (var3 > class53.field875 && (var37 & 0x1) != 0) {
                                                    class242 var40 = var7[var3 - 1][var4];
                                                    if (var40 != null && var40.field4090) {
                                                        class238.field4000.method1251(var40, -128);
                                                    }
                                                }
                                                if (var4 > class188.field3131 && (var37 & 0x8) != 0) {
                                                    class242 var41 = var7[var3][var4 - 1];
                                                    if (var41 != null && var41.field4090) {
                                                        class238.field4000.method1251(var41, -121);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field4084 != 0) {
                                            boolean var42 = true;
                                            for (int var43 = 0; var43 < var2.field4086; var43++) {
                                                if (class158.field2713 != var2.field4083[var43].field4902 && (var2.field4099[var43] & var2.field4084) == var2.field4081) {
                                                    var42 = false;
                                                    break;
                                                }
                                            }
                                            if (var42) {
                                                class167 var44 = var2.field4098;
                                                if (!class65.method553(var6, var3, var4, var44.field2818)) {
                                                    label593: {
                                                        if ((var44.field2814 & 0xFC000L) == 16384L) {
                                                            int var45 = var44.field2823 - class199.field3347;
                                                            int var46 = var44.field2822 - class207.field3509;
                                                            int var47 = (int) (var44.field2814 >> 20 & 0x3L);
                                                            if (var47 == 0) {
                                                                var45 -= 64;
                                                                var46 += 64;
                                                                if (var46 < var45 && var3 > 0 && var4 < class262.field4440 - 1) {
                                                                    class209.method1544(class199.field3347, class300.field5129, class207.field3509, var5, var3 - 1, var4 + 1);
                                                                    break label593;
                                                                }
                                                            } else if (var47 == 1) {
                                                                var45 += 64;
                                                                var46 += 64;
                                                                if (var46 < -var45 && var3 < class150.field2573 - 1 && var4 < class262.field4440 - 1) {
                                                                    class209.method1544(class199.field3347, class300.field5129, class207.field3509, var5, var3 + 1, var4 + 1);
                                                                    break label593;
                                                                }
                                                            } else if (var47 == 2) {
                                                                var45 += 64;
                                                                var46 -= 64;
                                                                if (var46 > var45 && var3 < class150.field2573 - 1 && var4 > 0) {
                                                                    class209.method1544(class199.field3347, class300.field5129, class207.field3509, var5, var3 + 1, var4 - 1);
                                                                    break label593;
                                                                }
                                                            } else if (var47 == 3) {
                                                                var45 -= 64;
                                                                var46 -= 64;
                                                                if (var46 > -var45 && var3 > 0 && var4 > 0) {
                                                                    class209.method1544(class199.field3347, class300.field5129, class207.field3509, var5, var3 - 1, var4 - 1);
                                                                    break label593;
                                                                }
                                                            }
                                                        }
                                                        class209.method1544(class199.field3347, class300.field5129, class207.field3509, var5, var3, var4);
                                                    }
                                                    var44.field2815.method409(0, class42.field701, class130.field2257, class270.field4667, class34.field501, var44.field2823 - class199.field3347, var44.field2819 - class300.field5129, var44.field2822 - class207.field3509, var44.field2814);
                                                }
                                                var2.field4084 = 0;
                                            }
                                        }
                                        if (!var2.field4103) {
                                            break;
                                        }
                                        try {
                                            int var48 = var2.field4086;
                                            var2.field4103 = false;
                                            int var49 = 0;
                                            label677: for (int var50 = 0; var50 < var48; var50++) {
                                                class285 var51 = var2.field4083[var50];
                                                if (class158.field2713 != var51.field4902) {
                                                    for (int var52 = var51.field4907; var52 <= var51.field4911; var52++) {
                                                        for (int var53 = var51.field4895; var53 <= var51.field4896; var53++) {
                                                            class242 var54 = var7[var52][var53];
                                                            if (var54.field4085) {
                                                                var2.field4103 = true;
                                                                continue label677;
                                                            }
                                                            if (var54.field4084 != 0) {
                                                                int var55 = 0;
                                                                if (var52 > var51.field4907) {
                                                                    var55++;
                                                                }
                                                                if (var52 < var51.field4911) {
                                                                    var55 += 4;
                                                                }
                                                                if (var53 > var51.field4895) {
                                                                    var55 += 8;
                                                                }
                                                                if (var53 < var51.field4896) {
                                                                    var55 += 2;
                                                                }
                                                                if ((var55 & var54.field4084) == var2.field4101) {
                                                                    var2.field4103 = true;
                                                                    continue label677;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class81.field1363[var49++] = var51;
                                                    int var56 = class53.field875 - var51.field4907;
                                                    int var57 = var51.field4911 - class53.field875;
                                                    if (var57 > var56) {
                                                        var56 = var57;
                                                    }
                                                    int var58 = class188.field3131 - var51.field4895;
                                                    int var59 = var51.field4896 - class188.field3131;
                                                    if (var59 > var58) {
                                                        var51.field4912 = var56 + var59;
                                                    } else {
                                                        var51.field4912 = var56 + var58;
                                                    }
                                                }
                                            }
                                            while (var49 > 0) {
                                                int var60 = -50;
                                                int var61 = -1;
                                                for (int var62 = 0; var62 < var49; var62++) {
                                                    class285 var63 = class81.field1363[var62];
                                                    if (class158.field2713 != var63.field4902) {
                                                        if (var63.field4912 > var60) {
                                                            var60 = var63.field4912;
                                                            var61 = var62;
                                                        } else if (var63.field4912 == var60) {
                                                            int var64 = var63.field4908 - class199.field3347;
                                                            int var65 = var63.field4899 - class207.field3509;
                                                            int var66 = class81.field1363[var61].field4908 - class199.field3347;
                                                            int var67 = class81.field1363[var61].field4899 - class207.field3509;
                                                            if (var64 * var64 + var65 * var65 > var66 * var66 + var67 * var67) {
                                                                var61 = var62;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var61 == -1) {
                                                    break;
                                                }
                                                class285 var68 = class81.field1363[var61];
                                                var68.field4902 = class158.field2713;
                                                if (!class166.method1237(var6, var68.field4907, var68.field4911, var68.field4895, var68.field4896, var68.field4898.method443())) {
                                                    if ((var68.field4914 & 0xFC000L) == 147456L) {
                                                        class209.method1544(class199.field3347, class300.field5129, class207.field3509, var5, var3, var4);
                                                        int var69 = var68.field4908 - class199.field3347;
                                                        int var70 = var68.field4899 - class207.field3509;
                                                        int var71 = (int) (var68.field4914 >> 20 & 0x3L);
                                                        if (var71 == 1 || var71 == 3) {
                                                            if (var70 > -var69) {
                                                                class209.method1555(var5, var3, var4 - 1, var3 - 1, var4);
                                                            } else {
                                                                class209.method1555(var5, var3, var4 + 1, var3 + 1, var4);
                                                            }
                                                        } else if (var70 > var69) {
                                                            class209.method1555(var5, var3, var4 - 1, var3 + 1, var4);
                                                        } else {
                                                            class209.method1555(var5, var3, var4 + 1, var3 - 1, var4);
                                                        }
                                                    } else {
                                                        class209.method1556(class199.field3347, class300.field5129, class207.field3509, var5, var68.field4907, var68.field4895, var68.field4911, var68.field4896);
                                                    }
                                                    var68.field4898.method409(var68.field4893, class42.field701, class130.field2257, class270.field4667, class34.field501, var68.field4908 - class199.field3347, var68.field4900 - class300.field5129, var68.field4899 - class207.field3509, var68.field4914);
                                                }
                                                for (int var72 = var68.field4907; var72 <= var68.field4911; var72++) {
                                                    for (int var73 = var68.field4895; var73 <= var68.field4896; var73++) {
                                                        class242 var74 = var7[var72][var73];
                                                        if (var74.field4084 != 0) {
                                                            class238.field4000.method1251(var74, -119);
                                                        } else if ((var3 != var72 || var4 != var73) && var74.field4090) {
                                                            class238.field4000.method1251(var74, -121);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field4103) {
                                                break;
                                            }
                                        } catch (Exception var94) {
                                            var2.field4103 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field4090);
                            } while (var2.field4084 != 0);
                            if (var3 > class53.field875 || var3 <= class217.field3710) {
                                break;
                            }
                            var76 = var7[var3 - 1][var4];
                        } while (var76 != null && var76.field4090);
                        if (var3 < class53.field875 || var3 >= class182.field3039 - 1) {
                            break;
                        }
                        var77 = var7[var3 + 1][var4];
                    } while (var77 != null && var77.field4090);
                    if (var4 > class188.field3131 || var4 <= class255.field4270) {
                        break;
                    }
                    var78 = var7[var3][var4 - 1];
                } while (var78 != null && var78.field4090);
                if (var4 < class188.field3131 || var4 >= class260.field4360 - 1) {
                    break;
                }
                var79 = var7[var3][var4 + 1];
            } while (var79 != null && var79.field4090);
            var2.field4090 = false;
            class162.field2763--;
            class282 var80 = var2.field4095;
            if (var80 != null && var80.field4869 != 0) {
                class209.method1544(class199.field3347, class300.field5129, class207.field3509, var5, var3, var4);
                if (var80.field4860 != null) {
                    var80.field4860.method409(0, class42.field701, class130.field2257, class270.field4667, class34.field501, var80.field4857 - class199.field3347, var80.field4856 - class300.field5129 - var80.field4869, var80.field4870 - class207.field3509, var80.field4854);
                }
                if (var80.field4862 != null) {
                    var80.field4862.method409(0, class42.field701, class130.field2257, class270.field4667, class34.field501, var80.field4857 - class199.field3347, var80.field4856 - class300.field5129 - var80.field4869, var80.field4870 - class207.field3509, var80.field4854);
                }
                if (var80.field4864 != null) {
                    var80.field4864.method409(0, class42.field701, class130.field2257, class270.field4667, class34.field501, var80.field4857 - class199.field3347, var80.field4856 - class300.field5129 - var80.field4869, var80.field4870 - class207.field3509, var80.field4854);
                }
            }
            if (var2.field4091 != 0) {
                class235 var81 = var2.field4096;
                if (var81 != null && !class32.method212(var6, var3, var4, var81.field3977.method443())) {
                    if ((var81.field3972 & var2.field4091) != 0) {
                        class209.method1544(class199.field3347, class300.field5129, class207.field3509, var5, var3, var4);
                        var81.field3977.method409(0, class42.field701, class130.field2257, class270.field4667, class34.field501, var81.field3964 + var81.field3960 - class199.field3347, var81.field3970 - class300.field5129, var81.field3965 + var81.field3975 - class207.field3509, var81.field3967);
                    } else if (var81.field3972 == 256) {
                        int var82 = var81.field3964 - class199.field3347;
                        int var83 = var81.field3970 - class300.field5129;
                        int var84 = var81.field3965 - class207.field3509;
                        int var85 = var81.field3979;
                        int var86;
                        if (var85 == 1 || var85 == 2) {
                            var86 = -var82;
                        } else {
                            var86 = var82;
                        }
                        int var87;
                        if (var85 == 2 || var85 == 3) {
                            var87 = -var84;
                        } else {
                            var87 = var84;
                        }
                        if (var87 >= var86) {
                            class209.method1544(class199.field3347, class300.field5129, class207.field3509, var5, var3, var4);
                            var81.field3977.method409(0, class42.field701, class130.field2257, class270.field4667, class34.field501, var81.field3960 + var82, var83, var81.field3975 + var84, var81.field3967);
                        } else if (var81.field3963 != null) {
                            class209.method1544(class199.field3347, class300.field5129, class207.field3509, var5, var3, var4);
                            var81.field3963.method409(0, class42.field701, class130.field2257, class270.field4667, class34.field501, var82, var83, var84, var81.field3967);
                        }
                    }
                }
                class167 var88 = var2.field4098;
                if (var88 != null) {
                    if ((var88.field2821 & var2.field4091) != 0 && !class65.method553(var6, var3, var4, var88.field2821)) {
                        class209.method1549(var88.field2821, class199.field3347, class300.field5129, class207.field3509, var6, var3, var4);
                        var88.field2809.method409(0, class42.field701, class130.field2257, class270.field4667, class34.field501, var88.field2823 - class199.field3347, var88.field2819 - class300.field5129, var88.field2822 - class207.field3509, var88.field2814);
                    }
                    if ((var88.field2818 & var2.field4091) != 0 && !class65.method553(var6, var3, var4, var88.field2818)) {
                        class209.method1549(var88.field2818, class199.field3347, class300.field5129, class207.field3509, var6, var3, var4);
                        var88.field2815.method409(0, class42.field701, class130.field2257, class270.field4667, class34.field501, var88.field2823 - class199.field3347, var88.field2819 - class300.field5129, var88.field2822 - class207.field3509, var88.field2814);
                    }
                }
            }
            if (var5 < class28.field366 - 1) {
                class242 var89 = class271.field4681[var5 + 1][var3][var4];
                if (var89 != null && var89.field4090) {
                    class238.field4000.method1251(var89, -124);
                }
            }
            if (var3 < class53.field875) {
                class242 var90 = var7[var3 + 1][var4];
                if (var90 != null && var90.field4090) {
                    class238.field4000.method1251(var90, -118);
                }
            }
            if (var4 < class188.field3131) {
                class242 var91 = var7[var3][var4 + 1];
                if (var91 != null && var91.field4090) {
                    class238.field4000.method1251(var91, -127);
                }
            }
            if (var3 > class53.field875) {
                class242 var92 = var7[var3 - 1][var4];
                if (var92 != null && var92.field4090) {
                    class238.field4000.method1251(var92, -119);
                }
            }
            if (var4 > class188.field3131) {
                class242 var93 = var7[var3][var4 - 1];
                if (var93 != null && var93.field4090) {
                    class238.field4000.method1251(var93, -125);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V", line = 1590)
    public class178() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "(I)V", line = 1539)
    public static final void method1313(int arg0) {
        field2992++;
        if (arg0 != 21100) {
            field3006 = (class75) null;
        }
        if (class87.field1443) {
            class7.field104 = null;
            class171.field2877 = null;
            class87.field1443 = false;
        }
    }

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "(I)V", line = 1560)
    public static void method1314(int arg0) {
        field3003 = null;
        field3011 = null;
        field3009 = null;
        field3006 = null;
        field3008 = null;
        if (arg0 != 2) {
            method1315(10, -123, -60, 18);
        }
        field3010 = null;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(IIII)V", line = 1577)
    public static final void method1315(int arg0, int arg1, int arg2, int arg3) {
        field2999++;
        class75 var4 = class66.method562((byte) 124, new class75[] { class20.field268, class67.method565(arg3 + 123, arg0), class276.field4743, class67.method565(arg3 ^ 0x79, arg2 >> 6), class276.field4743, class67.method565(arg3 ^ 0x5C, arg1 >> 6), class276.field4743, class67.method565(31, arg2 & 0x3F), class276.field4743, class67.method565(95, arg1 & 0x3F) });
        var4.method656(0);
        class306.method2099(87, var4);
        if (arg3 != 1) {
            method1314(103);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III[Lnl;)V", line = 1613)
    public static final void method1316(int arg0, int arg1, int arg2, class29[] arg3) {
        if (arg1 != -1) {
            return;
        }
        if (arg2 > arg0) {
            int var4 = arg0 - 1;
            int var5 = arg2 + 1;
            int var6 = (arg0 + arg2) / 2;
            class29 var7 = arg3[var6];
            arg3[var6] = arg3[arg0];
            arg3[arg0] = var7;
            while (var5 > var4) {
                boolean var8 = true;
                do {
                    var5--;
                    for (int var9 = 0; var9 < 4; var9++) {
                        int var10;
                        int var11;
                        if (class216.field3703[var9] == 2) {
                            var10 = arg3[var5].field403;
                            var11 = var7.field403;
                        } else if (class216.field3703[var9] == 1) {
                            var11 = var7.field402;
                            var10 = arg3[var5].field402;
                            if (var10 == -1 && class288.field4948[var9] == 1) {
                                var10 = 2001;
                            }
                            if (var11 == -1 && class288.field4948[var9] == 1) {
                                var11 = 2001;
                            }
                        } else if (class216.field3703[var9] == 3) {
                            var11 = var7.field407 ? 1 : 0;
                            var10 = arg3[var5].field407 ? 1 : 0;
                        } else {
                            var11 = var7.field410;
                            var10 = arg3[var5].field410;
                        }
                        if (var10 != var11) {
                            if ((class288.field4948[var9] != 1 || var11 >= var10) && (class288.field4948[var9] != 0 || var11 <= var10)) {
                                var8 = false;
                            }
                            break;
                        }
                        if (var9 == 3) {
                            var8 = false;
                        }
                    }
                } while (var8);
                boolean var12 = true;
                do {
                    var4++;
                    for (int var13 = 0; var13 < 4; var13++) {
                        int var14;
                        int var15;
                        if (class216.field3703[var13] == 2) {
                            var15 = arg3[var4].field403;
                            var14 = var7.field403;
                        } else if (class216.field3703[var13] == 1) {
                            var14 = var7.field402;
                            var15 = arg3[var4].field402;
                            if (var14 == -1 && class288.field4948[var13] == 1) {
                                var14 = 2001;
                            }
                            if (var15 == -1 && class288.field4948[var13] == 1) {
                                var15 = 2001;
                            }
                        } else if (class216.field3703[var13] == 3) {
                            var14 = var7.field407 ? 1 : 0;
                            var15 = arg3[var4].field407 ? 1 : 0;
                        } else {
                            var14 = var7.field410;
                            var15 = arg3[var4].field410;
                        }
                        if (var14 != var15) {
                            if ((class288.field4948[var13] != 1 || var14 <= var15) && (class288.field4948[var13] != 0 || var15 <= var14)) {
                                var12 = false;
                            }
                            break;
                        }
                        if (var13 == 3) {
                            var12 = false;
                        }
                    }
                } while (var12);
                if (var5 > var4) {
                    class29 var16 = arg3[var4];
                    arg3[var4] = arg3[var5];
                    arg3[var5] = var16;
                }
            }
            method1316(arg0, arg1 ^ 0x0, var5, arg3);
            method1316(var5 + 1, arg1 ^ 0x0, arg2, arg3);
        }
        field3004++;
    }
}
