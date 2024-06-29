import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class182 {

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "Z")
    public static boolean field3492 = false;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "Leh;")
    public static class47 field3480 = class195.method1282((byte) -4, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field3481 = 0;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "Z")
    public static boolean field3497 = true;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "[[[B")
    public static byte[][][] field3490 = new byte[4][104][104];

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "Leh;")
    public static class47 field3503 = class195.method1282((byte) -4, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "[I")
    public static int[] field3493 = new int[128];

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Leh;")
    public static class47 field3479 = class195.method1282((byte) -4, "<col=c0ff00>");

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    private int field3483;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "J")
    private long field3499;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "J")
    private long field3508;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "Ltd;")
    public static class175 field3491;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "Lgf;")
    public static class61 field3495;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "Z")
    public boolean field3489;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "[I")
    private int[] field3485;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "[I")
    private int[] field3496;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z[IZI[I)V")
    public final void method1205(boolean arg0, int[] arg1, boolean arg2, int arg3, int[] arg4) {
        field3494++;
        if (arg0) {
            return;
        }
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class146.field2860; var7++) {
                    class26 var8 = class109.method880((byte) 72, var7);
                    if (var8 != null && !var8.field501 && var8.field507 == (arg2 ? 7 : 0) + var6) {
                        arg4[class144.field2836[var6]] = class57.method495(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        this.field3485 = arg1;
        this.field3483 = arg3;
        this.field3496 = arg4;
        this.field3489 = arg2;
        this.method1208((byte) 113);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIZ)I")
    public static final int method1206(int arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg1 - 1 & arg2;
        field3507++;
        int var5 = arg0 / arg1;
        int var6 = arg1 - 1 & arg0;
        int var7 = arg2 / arg1;
        int var8 = class199.method1308(1424, var7, var5);
        int var9 = class199.method1308(1424, var7 + 1, var5);
        int var10 = class199.method1308(1424, var7, var5 + 1);
        int var11 = class199.method1308(1424, var7 + 1, var5 + 1);
        int var12 = class181.method1202(var9, var8, var4, (byte) 103, arg1);
        if (arg3) {
            field3479 = null;
        }
        int var13 = class181.method1202(var11, var10, var4, (byte) 114, arg1);
        return class181.method1202(var13, var12, var6, (byte) 125, arg1);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZI)V")
    public final void method1207(int arg0, boolean arg1, int arg2) {
        field3506++;
        if (arg2 == 1 && this.field3489) {
            return;
        }
        int var4 = -3 / (arg0 / 59);
        int var5 = this.field3496[class144.field2836[arg2]];
        if (var5 == 0) {
            return;
        }
        int var6 = var5 & 0x3FFFFFFF;
        class26 var7;
        do {
            if (arg1) {
                var6++;
                if (class146.field2860 <= var6) {
                    var6 = 0;
                }
            } else {
                var6--;
                if (var6 < 0) {
                    var6 = class146.field2860 - 1;
                }
            }
            var7 = class109.method880((byte) 83, var6);
        } while (var7 == null || var7.field501 || (this.field3489 ? 7 : 0) + arg2 != var7.field507);
        this.field3496[class144.field2836[arg2]] = class57.method495(Integer.MIN_VALUE, var6);
        this.method1208((byte) -19);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    private final void method1208(byte arg0) {
        long[] var2 = class197.field3839;
        field3482++;
        long var3 = this.field3499;
        this.field3499 = -1L;
        int var5 = 53 % ((arg0 - 75) / 32);
        for (int var6 = 0; var6 < 12; var6++) {
            this.field3499 = var2[(int) ((this.field3499 ^ (long) (this.field3496[var6] >> 24)) & 0xFFL)] ^ this.field3499 >>> 8;
            this.field3499 = this.field3499 >>> 8 ^ var2[(int) ((this.field3499 ^ (long) (this.field3496[var6] >> 16)) & 0xFFL)];
            this.field3499 = var2[(int) ((this.field3499 ^ (long) (this.field3496[var6] >> 8)) & 0xFFL)] ^ this.field3499 >>> 8;
            this.field3499 = var2[(int) (((long) this.field3496[var6] ^ this.field3499) & 0xFFL)] ^ this.field3499 >>> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field3499 = var2[(int) (((long) this.field3485[var7] ^ this.field3499) & 0xFFL)] ^ this.field3499 >>> 8;
        }
        this.field3499 = var2[(int) ((this.field3499 ^ (long) (this.field3489 ? 1 : 0)) & 0xFFL)] ^ this.field3499 >>> 8;
        if (var3 != 0L && this.field3499 != var3) {
            class151.field2955.method990(var3, -1);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIB)V")
    public final void method1209(int arg0, int arg1, byte arg2) {
        this.field3485[arg0] = arg1;
        if (arg2 < 125) {
            this.method1209(123, -117, (byte) 107);
        }
        field3478++;
        this.method1208((byte) -21);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILca;Lca;II)Ld;")
    public final class30 method1210(int arg0, class22 arg1, class22 arg2, int arg3, int arg4) {
        if (arg3 <= 58) {
            this.method1208((byte) -37);
        }
        field3501++;
        if (this.field3483 != -1) {
            return class195.method1284(this.field3483, 43).method483(-103, arg1, arg2, arg4, arg0);
        }
        int[] var6 = this.field3496;
        long var7 = this.field3499;
        if (arg1 != null && (arg1.field441 >= 0 || arg1.field415 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field3496[var9];
            }
            if (arg1.field441 >= 0) {
                if (arg1.field441 == 65535) {
                    var6[5] = 0;
                    var7 ^= 0xFFFFFFFF00000000L;
                } else {
                    var6[5] = class57.method495(arg1.field441, 1073741824);
                    var7 ^= (long) var6[5] << 32;
                }
            }
            if (arg1.field415 >= 0) {
                if (arg1.field415 == 65535) {
                    var7 ^= 0xFFFFFFFFL;
                    var6[3] = 0;
                } else {
                    var6[3] = class57.method495(arg1.field415, 1073741824);
                    var7 ^= var6[3];
                }
            }
        }
        class30 var10 = (class30) class151.field2955.method986((byte) 50, var7);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var6[var12];
                if ((var21 & 0x40000000) == 0) {
                    if ((var21 & Integer.MIN_VALUE) != 0 && !class109.method880((byte) 115, var21 & 0x3FFFFFFF).method243((byte) 121)) {
                        var11 = true;
                    }
                } else if (!class87.method713(117, var21 & 0x3FFFFFFF).method648((byte) -89, this.field3489)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field3508 != -1L) {
                    var10 = (class30) class151.field2955.method986((byte) 50, this.field3508);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class102[] var13 = new class102[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var6[var15];
                    if ((var18 & 0x40000000) != 0) {
                        class102 var20 = class87.method713(121, var18 & 0x3FFFFFFF).method641((byte) 69, this.field3489);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    } else if ((var18 & Integer.MIN_VALUE) != 0) {
                        class102 var19 = class109.method880((byte) 70, var18 & 0x3FFFFFFF).method245(0);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                }
                class102 var16 = new class102(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (class85.field1797[var17].length > this.field3485[var17]) {
                        var16.method826(class185.field3536[var17], class85.field1797[var17][this.field3485[var17]]);
                    }
                    if (class195.field3798[var17].length > this.field3485[var17]) {
                        var16.method826(class6.field106[var17], class195.field3798[var17][this.field3485[var17]]);
                    }
                }
                var10 = var16.method838(64, 850, -30, -50, -30, true, true);
                class151.field2955.method987(var7, var10, 28842);
                this.field3508 = var7;
            }
        }
        if (arg1 == null && arg2 == null) {
            return var10;
        }
        class30 var22;
        if (arg1 != null && arg2 != null) {
            var22 = arg1.method217(65535, var10, arg0, arg2, arg4);
        } else if (arg1 == null) {
            var22 = arg2.method213(2, var10, arg0);
        } else {
            var22 = arg1.method213(2, var10, arg4);
        }
        return var22;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
    public static void method1211(byte arg0) {
        field3493 = null;
        field3480 = null;
        field3479 = null;
        field3491 = null;
        field3503 = null;
        field3490 = null;
        if (arg0 != -62) {
            method1206(-122, -62, 110, true);
        }
        field3495 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BZ)V")
    public final void method1212(byte arg0, boolean arg1) {
        field3505++;
        if (this.field3489 != arg1 && arg0 <= -56) {
            this.method1205(false, this.field3485, arg1, -1, null);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BII)V")
    public final void method1213(byte arg0, int arg1, int arg2) {
        int var4 = class144.field2836[arg1];
        field3502++;
        if (this.field3496[var4] == 0 || class109.method880((byte) 96, arg2) == null) {
            return;
        }
        if (arg0 != 67) {
            field3493 = null;
        }
        this.field3496[var4] = class57.method495(Integer.MIN_VALUE, arg2);
        this.method1208((byte) -123);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZBI)V")
    public final void method1214(boolean arg0, byte arg1, int arg2) {
        int var4 = this.field3485[arg2];
        field3488++;
        int var5 = -93 / ((arg1 + 84) / 32);
        if (arg0) {
            var4++;
            if (class85.field1797[arg2].length <= var4) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class85.field1797[arg2].length - 1;
            }
        }
        this.field3485[arg2] = var4;
        this.method1208((byte) 109);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLhd;)V")
    public final void method1215(byte arg0, class68 arg1) {
        arg1.method609(this.field3489 ? 1 : 0, (byte) -109);
        int var3 = 0;
        if (arg0 >= -29) {
            this.method1207(-13, false, -117);
        }
        while (var3 < 7) {
            int var5 = this.field3496[class144.field2836[var3]];
            if ((var5 & Integer.MIN_VALUE) == 0) {
                arg1.method590(65535, -1848441912);
            } else {
                arg1.method590(var5 & 0x3FFFFFFF, -1848441912);
            }
            var3++;
        }
        field3487++;
        for (int var4 = 0; var4 < 5; var4++) {
            arg1.method609(this.field3485[var4], (byte) -105);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILca;I)Ld;")
    public final class30 method1216(int arg0, class22 arg1, int arg2) {
        field3500++;
        if (this.field3483 != -1) {
            return class195.method1284(this.field3483, 43).method486((byte) -68, arg0, arg1);
        }
        int var4 = -70 % ((arg2 + 1) / 39);
        class30 var5 = (class30) class95.field1957.method986((byte) 50, this.field3499);
        if (var5 == null) {
            boolean var6 = false;
            for (int var7 = 0; var7 < 12; var7++) {
                int var16 = this.field3496[var7];
                if ((var16 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var16) != 0 && !class109.method880((byte) 63, var16 & 0x3FFFFFFF).method242(0)) {
                        var6 = true;
                    }
                } else if (!class87.method713(119, var16 & 0x3FFFFFFF).method637(this.field3489, false)) {
                    var6 = true;
                }
            }
            if (var6) {
                return null;
            }
            class102[] var8 = new class102[12];
            int var9 = 0;
            for (int var10 = 0; var10 < 12; var10++) {
                int var13 = this.field3496[var10];
                if ((var13 & 0x40000000) != 0) {
                    class102 var15 = class87.method713(-116, var13 & 0x3FFFFFFF).method642(128, this.field3489);
                    if (var15 != null) {
                        var8[var9++] = var15;
                    }
                } else if ((var13 & Integer.MIN_VALUE) != 0) {
                    class102 var14 = class109.method880((byte) 111, var13 & 0x3FFFFFFF).method239(-97);
                    if (var14 != null) {
                        var8[var9++] = var14;
                    }
                }
            }
            class102 var11 = new class102(var8, var9);
            for (int var12 = 0; var12 < 5; var12++) {
                if (class85.field1797[var12].length > this.field3485[var12]) {
                    var11.method826(class185.field3536[var12], class85.field1797[var12][this.field3485[var12]]);
                }
                if (this.field3485[var12] < class195.field3798[var12].length) {
                    var11.method826(class6.field106[var12], class195.field3798[var12][this.field3485[var12]]);
                }
            }
            var5 = var11.method838(64, 768, -50, -10, -50, true, true);
            class95.field1957.method987(this.field3499, var5, 28842);
        }
        if (arg1 != null) {
            var5 = arg1.method218(arg0, var5, 54);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([BLgg;II)V")
    public static final void method1217(byte[] arg0, class62 arg1, int arg2, int arg3) {
        class181 var4 = new class181();
        var4.field3463 = 0;
        field3504++;
        var4.field3475 = arg1;
        var4.field2283 = arg3;
        var4.field3467 = arg0;
        class40 var5 = class80.field1725;
        synchronized (class80.field1725) {
            class80.field1725.method337(var4, (byte) -22);
            if (arg2 != -65536) {
                method1217(null, null, 115, 50);
            }
        }
        class82.method692(true);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)V")
    public final void method1218(boolean arg0, int arg1) {
        field3498++;
        if (arg1 >= 106) {
            this.field3489 = arg0;
            this.method1208((byte) 34);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I")
    public final int method1219(int arg0) {
        if (arg0 == 214413162) {
            field3484++;
            return this.field3483 == -1 ? (this.field3496[0] << 15) + (this.field3485[4] << 20) + (this.field3485[0] << 25) + (this.field3496[8] << 10) + (this.field3496[11] << 5) + this.field3496[1] : class195.method1284(this.field3483, 43).field1077 + 305419896;
        } else {
            return -93;
        }
    }
}
