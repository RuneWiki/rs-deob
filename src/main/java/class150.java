import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class150 extends class53 {

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "Z")
    public boolean field2600 = true;

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "Lp;")
    public static class280 field2595 = class18.method140((byte) -117, "Connect-B au serveur de mise -9 jour");

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "I")
    public static int field2596 = 0;

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "Lp;")
    public static class280 field2599 = class18.method140((byte) -121, "(Udns");

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "Lka;")
    public static class253 field2591 = new class253(64);

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "[I")
    public static int[] field2607 = new int[32];

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "Lp;")
    public static class280 field2609;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "[I")
    public int[] field2594;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "[I")
    private int[] field2597;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "[Lp;")
    private class280[] field2592;

    @OriginalMember(owner = "client!qa", name = "Y", descriptor = "[Lud;")
    public static class2[] field2608;

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "[[I")
    private int[][] field2605;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZLph;IIZ)V")
    public static final void method1034(int arg0, boolean arg1, class78 arg2, int arg3, int arg4, boolean arg5) {
        field2593++;
        if (class79.field1304 >= 50 || arg2.field1267 == null || arg2.field1267.length <= arg3 || arg2.field1267[arg3] == null) {
            return;
        }
        int var6 = arg2.field1267[arg3][0];
        int var7 = (var6 & 0x72) >> 4;
        if (arg1) {
            field2609 = null;
        }
        int var8 = var6 >> 8;
        int var9 = var6 & 0xF;
        if (arg2.field1267[arg3].length > 1) {
            int var10 = (int) (Math.random() * (double) arg2.field1267[arg3].length);
            if (var10 > 0) {
                var8 = arg2.field1267[arg3][var10];
            }
        }
        if (var9 == 0) {
            if (arg5) {
                class2.method45(0, !arg1, var8, var7);
            }
        } else if (class54.field892 != 0) {
            class14.field274[class79.field1304] = var8;
            class153.field2658[class79.field1304] = var7;
            int var11 = (arg0 - 64) / 128;
            class208.field3591[class79.field1304] = 0;
            int var12 = (arg4 - 64) / 128;
            class64.field1051[class79.field1304] = null;
            class237.field4115[class79.field1304] = (var11 << 8) + (var12 << 16) + var9;
            class79.field1304++;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
    public final int method1035(int arg0, int arg1) {
        if (arg1 == -26430) {
            field2590++;
            return this.field2597 == null || arg0 < 0 || this.field2597.length < arg0 ? -1 : this.field2597[arg0];
        } else {
            return 60;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)V")
    public static final void method1036(byte arg0) {
        field2598++;
        if (arg0 != 81) {
            method1034(118, true, (class78) null, -26, -83, true);
        }
        if (class198.field3462.toLowerCase().indexOf("microsoft") != -1) {
            class277.field4862[192] = 58;
            class277.field4862[186] = 57;
            class277.field4862[221] = 43;
            class277.field4862[191] = 73;
            class277.field4862[189] = 26;
            class277.field4862[219] = 42;
            class277.field4862[220] = 74;
            class277.field4862[222] = 59;
            class277.field4862[187] = 27;
            class277.field4862[223] = 28;
            class277.field4862[188] = 71;
            class277.field4862[190] = 72;
            return;
        }
        class277.field4862[47] = 73;
        class277.field4862[91] = 42;
        if (class198.field3476 == null) {
            class277.field4862[192] = 58;
            class277.field4862[222] = 59;
        } else {
            class277.field4862[192] = 28;
            class277.field4862[520] = 59;
            class277.field4862[222] = 58;
        }
        class277.field4862[92] = 74;
        class277.field4862[46] = 72;
        class277.field4862[59] = 57;
        class277.field4862[61] = 27;
        class277.field4862[44] = 71;
        class277.field4862[93] = 43;
        class277.field4862[45] = 26;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Llj;I)V")
    public final void method1037(class25 arg0, int arg1) {
        field2604++;
        if (arg1 != 0) {
            return;
        }
        while (true) {
            int var3 = arg0.method189((byte) -103);
            if (var3 == 0) {
                return;
            }
            this.method1039(arg0, 31060, var3);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIB)I")
    public final int method1038(int arg0, int arg1, byte arg2) {
        field2589++;
        if (arg2 != -114) {
            this.method1035(11, 75);
        }
        if (this.field2597 == null || arg0 < 0 || arg0 > this.field2597.length) {
            return -1;
        } else if (this.field2605[arg0] == null || arg1 < 0 || this.field2605[arg0].length < arg1) {
            return -1;
        } else {
            return this.field2605[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Llj;II)V")
    private final void method1039(class25 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field2592 = arg0.method198(false).method1893(arg1 ^ 0xFFFF86CC, 60);
        } else if (arg2 == 2) {
            int var8 = arg0.method189((byte) -103);
            this.field2594 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2594[var9] = arg0.method193((byte) 77);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method189((byte) -103);
            this.field2605 = new int[var4][];
            this.field2597 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method193((byte) 77);
                this.field2597[var5] = var6;
                this.field2605[var5] = new int[class161.field2824[var6]];
                for (int var7 = 0; var7 < class161.field2824[var6]; var7++) {
                    this.field2605[var5][var7] = arg0.method193((byte) 77);
                }
            }
        } else if (arg2 == 4) {
            this.field2600 = false;
        }
        field2602++;
        if (arg1 != 31060) {
            field2599 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public static void method1040(boolean arg0) {
        field2599 = null;
        field2608 = null;
        if (!arg0) {
            field2609 = null;
        }
        field2591 = null;
        field2595 = null;
        field2609 = null;
        field2607 = null;
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)I")
    public final int method1041(int arg0) {
        if (arg0 > -90) {
            field2591 = null;
        }
        field2603++;
        return this.field2597 == null ? 0 : this.field2597.length;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(B)V")
    public final void method1042(byte arg0) {
        if (this.field2594 != null) {
            for (int var2 = 0; var2 < this.field2594.length; var2++) {
                this.field2594[var2] = class160.method1143(this.field2594[var2], 32768);
            }
        }
        field2587++;
        if (arg0 >= -87) {
            this.field2597 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZ)V")
    public static final void method1043(int arg0, boolean arg1) {
        int var2 = class205.field3554;
        if (arg1) {
            var2 = 1;
        }
        if (class262.field4631.field4791 >> 7 == class209.field3599 && class262.field4631.field4793 >> 7 == class73.field1204) {
            class209.field3599 = 0;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            long var4;
            class142 var6;
            if (arg1) {
                var6 = class262.field4631;
                var4 = 8791798054912L;
            } else {
                var4 = (long) class250.field4376[var3] << 32;
                var6 = class280.field4940[class250.field4376[var3]];
            }
            if (var6 != null && var6.method428(arg0 + 3357)) {
                var6.field2495 = false;
                int var7 = var6.field4791 >> 7;
                if ((class160.field2810 && class205.field3554 > 200 || class205.field3554 > 50) && !arg1 && var6.field4834 == var6.field4803) {
                    var6.field2495 = true;
                }
                int var8 = var6.field4793 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field2466 == null || class117.field2104 < var6.field2477 || class117.field2104 >= var6.field2467) {
                        if (var6.method984((byte) -34) == 1 && (var6.field4791 & 0x7F) == 64 && (var6.field4793 & 0x7F) == 64) {
                            if (class252.field4417[var7][var8] == class102.field1665) {
                                continue;
                            }
                            class252.field4417[var7][var8] = class102.field1665;
                        }
                        var6.field4841 = class158.method1123(class231.field4013, var6.field4791, -6230, var6.field4793);
                        class74.method559(class231.field4013, var6.field4791, var6.field4793, var6.field4841, var6.method984((byte) -34) * 64 - 4, var6, var6.field4809, var4, var6.field4836);
                    } else {
                        var6.field2495 = false;
                        var6.field4841 = class158.method1123(class231.field4013, var6.field4791, -6230, var6.field4793);
                        class228.method1533(class231.field4013, var6.field4791, var6.field4793, var6.field4841, var6, var6.field4809, var4, var6.field2468, var6.field2507, var6.field2484, var6.field2506);
                    }
                }
            }
        }
        if (arg0 == -2657) {
            field2586++;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([ILlj;I)V")
    public final void method1044(int[] arg0, class25 arg1, int arg2) {
        field2588++;
        if (this.field2597 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 119 % ((-arg2 - 32) / 55);
        while (var4 < this.field2597.length) {
            if (arg0.length <= var4) {
                return;
            }
            int var6 = class38.field679[this.method1035(var4, -26430)];
            if (var6 > 0) {
                arg1.method238((long) arg0[var4], var6, false);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILlj;)Lp;")
    public final class280 method1045(int arg0, class25 arg1) {
        class280 var3 = class52.method384((byte) -75, 80);
        if (this.field2597 != null) {
            for (int var4 = 0; var4 < this.field2597.length; var4++) {
                var3.method1902(1, this.field2592[var4]);
                var3.method1902(1, class244.method1659(arg1.method221(-93, class107.field1765[this.field2597[var4]]), this.field2597[var4], this.field2605[var4], 5));
            }
        }
        int var5 = -16 % ((arg0 - 9) / 45);
        field2601++;
        var3.method1902(1, this.field2592[this.field2592.length - 1]);
        return var3.method1876((byte) 65);
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(B)Lp;")
    public final class280 method1046(byte arg0) {
        field2606++;
        if (arg0 >= -43) {
            field2599 = null;
        }
        class280 var2 = class52.method384((byte) 102, 80);
        if (this.field2592 == null) {
            return class236.field4110;
        }
        var2.method1902(1, this.field2592[0]);
        for (int var3 = 1; var3 < this.field2592.length; var3++) {
            var2.method1902(1, class64.field1060);
            var2.method1902(1, this.field2592[var3]);
        }
        return var2.method1876((byte) 65);
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2607[var1] = var0 - 1;
            var0 += var0;
        }
        field2609 = class18.method140((byte) -118, "showingVideoAd");
    }
}
