import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class150 extends class252 {

    @OriginalMember(owner = "client!ib", name = "ib", descriptor = "I")
    private int field2538 = 0;

    @OriginalMember(owner = "client!ib", name = "eb", descriptor = "[S")
    private short[] field2534 = new short[257];

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "Ljd;")
    public static class85 field2527 = class221.method1499("event_opbase", (byte) 90);

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "Ljd;")
    public static class85 field2529 = class221.method1499("::clientdrop", (byte) 89);

    @OriginalMember(owner = "client!ib", name = "hb", descriptor = "I")
    public static int field2537 = -1;

    @OriginalMember(owner = "client!ib", name = "nb", descriptor = "I")
    public static int field2543 = 0;

    @OriginalMember(owner = "client!ib", name = "mb", descriptor = "Ljd;")
    public static class85 field2542 = null;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!ib", name = "bb", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!ib", name = "cb", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!ib", name = "db", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!ib", name = "fb", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!ib", name = "gb", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!ib", name = "jb", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!ib", name = "lb", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!ib", name = "ob", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!ib", name = "pb", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "Lok;")
    public static class38 field2530;

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "[I")
    private int[] field2524;

    @OriginalMember(owner = "client!ib", name = "kb", descriptor = "[I")
    private int[] field2540;

    @OriginalMember(owner = "client!ib", name = "qb", descriptor = "[[I")
    private int[][] field2546;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(BI)Z")
    public static final boolean method975(byte arg0, int arg1) {
        if (arg0 >= -61) {
            method983(34);
        }
        ++field2528;
        if (~class23.field325 == ~arg1) {
            ++class23.field325;
            if (class23.field325 > 65535) {
                class23.field325 = 0;
            }
            class15.field227 = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILge;)V")
    public static final void method976(int arg0, class68 arg1) {
        ++field2545;
        class212.field3720 = class73.method518(110, 0, class203.field3540, arg1);
        class159.field2707 = new class103[class212.field3720.length];
        class156.field2675 = new class103[class212.field3720.length];
        class97.field1751 = new class103[class212.field3720.length];
        for (int var2 = 0; ~class212.field3720.length < ~var2; ++var2) {
            class212.field3720[var2].method709();
            class159.field2707[var2] = class212.field3720[var2].method711();
            class212.field3720[var2].method709();
            class156.field2675[var2] = class212.field3720[var2].method711();
            class212.field3720[var2].method709();
            class97.field1751[var2] = class212.field3720[var2].method711();
            class212.field3720[var2].method709();
        }
        class134.field2342 = class54.method364(114, arg1, 0, class184.field3160);
        class268.field4768 = class85.method606((byte) -119, 0, class244.field4178, arg1);
        class187.field3203 = class85.method606((byte) 38, 0, class24.field340, arg1);
        class94.field1731 = class85.method606((byte) -128, 0, class175.field3007, arg1);
        class205.field3587 = class85.method606((byte) 34, 0, class119.field2122, arg1);
        class182.field3112 = class269.method1848((byte) -6, arg1, 0, class56.field981);
        class144.field2473 = class269.method1848((byte) 100, arg1, 0, class111.field1941);
        class253.field4365 = class198.method1350(class183.field3137, arg0 + -90, 0, arg1);
        class216.field3799 = class269.method1848((byte) -126, arg1, arg0, class185.field3190);
        class76.field1406 = class269.method1848((byte) -128, arg1, 0, class70.field1306);
        class44.field774 = class151.method986(0, arg1, arg0 ^ 24, class246.field4207);
        class45.field798 = class151.method986(0, arg1, -112, class56.field989);
        class130.field2280.method80(class45.field798, (int[]) null);
        class30.field457.method80(class45.field798, (int[]) null);
        class180.field3092.method80(class45.field798, (int[]) null);
        class266 var3 = class66.method441(arg1, 0, -27067, class197.field3386);
        var3.method1829();
        class22.field313 = var3;
        class266[] var4 = class54.method364(-9, arg1, 0, class115.field2060);
        for (int var5 = 0; ~var5 > ~var4.length; ++var5) {
            var4[var5].method1829();
        }
        class94.field1732 = var4;
        int var6 = -10 + (int) (21.0D * Math.random());
        int var7 = -20 + (int) (Math.random() * 41.0D);
        int var8 = -10 + (int) (21.0D * Math.random());
        int var9 = (int) (21.0D * Math.random()) + -10;
        for (int var10 = 0; ~class134.field2342.length < ~var10; ++var10) {
            class134.field2342[var10].method1840(var7 + var9, var6 + var7, var7 + var8);
        }
        class212.field3720[0].method715(var7 + var9, var6 + var7, var7 + var8);
        class219.field3854 = class134.field2342;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(BI)Ljd;")
    public static final class85 method977(byte arg0, int arg1) {
        ++field2539;
        if (arg0 <= 73) {
            method975((byte) 81, 10);
        }
        return class172.method1150(new class85[] { class68.method451(255 & arg1 >> 24, -12572), class115.field2055, class68.method451(255 & arg1 >> 16, -12572), class115.field2055, class68.method451(arg1 >> 8 & 255, -12572), class115.field2055, class68.method451(255 & arg1, -12572) }, 0);
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
    public final void method230(int arg0) {
        ++field2535;
        if (this.field2546 == null) {
            this.field2546 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field2546.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field2538 == -3) {
                this.method984(arg0 + -4095);
            }
            if (arg0 != 3906) {
                method976(-55, (class68) null);
            }
            class195.method1328(40);
            this.method979(0);
        }
    }

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)V")
    public static void method978(int arg0) {
        if (arg0 != -24941) {
            method980(16);
        }
        field2527 = null;
        field2542 = null;
        field2530 = null;
        field2529 = null;
    }

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "(I)V")
    private final void method979(int arg0) {
        int var2 = this.field2538;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field2546.length + -1) < ~var5 && ~this.field2546[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field2546[var5 + -1];
                    int[] var7 = this.field2546[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = 4096 - class97.field1757[(var8 & 8171) >> 5] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field2534[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field2546.length + -1) < ~var14 && ~this.field2546[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field2546[var14 + -1];
                    int[] var16 = this.field2546[var14];
                    int var17 = (var13 - var15[0] << 12) / (var16[0] - var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field2534[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field2546.length + -1 > var22 && ~var21 <= ~this.field2546[var22][0]; ++var22) {
                }
                int[] var23 = this.field2546[var22 + -1];
                int[] var24 = this.field2546[var22];
                int var25 = this.method981(var22 + -2, false)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method981(var22 - -1, false)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var27;
                int var32 = -var27 + var28 + -var25 + var26;
                int var33 = (var29 * var32 >> 12) * var30 >> 12;
                int var35 = -var32 + var25 - var26;
                int var36 = var30 * var35 >> 12;
                int var37 = var29 * var31 >> 12;
                int var38 = var33 - -var37 + var26 + var36;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field2534[var20] = (short) var38;
            }
        }
        if (arg0 != 0) {
            field2527 = null;
        }
        ++field2533;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        ++field2523;
        if (arg1 != -55) {
            return null;
        } else {
            int[] var3 = super.field4356.method868(arg0, (byte) 119);
            if (super.field4356.field2258) {
                int[] var4 = this.method1742((byte) 8, 0, arg0);
                for (int var5 = 0; class5.field63 > var5; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (~var6 < -257) {
                        var6 = 256;
                    }
                    var3[var5] = this.field2534[var6];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "(I)I")
    public static final int method980(int arg0) {
        ++field2536;
        int var1 = 76 % ((arg0 - -66) / 46);
        return 6;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(IZ)[I")
    private final int[] method981(int arg0, boolean arg1) {
        if (arg1) {
            this.field2546 = null;
        }
        ++field2526;
        if (arg0 < 0) {
            return this.field2524;
        } else {
            return ~this.field2546.length >= ~arg0 ? this.field2540 : this.field2546[arg0];
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
    public class150() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V")
    public static final void method982(boolean arg0) {
        ++field2531;
        if (class146.field2491 != -1 && ~class154.field2663 != 0) {
            float[] var1 = new float[3];
            int var2 = ((-class45.field797 + class56.field988) * class61.field1144 >> 16) + class45.field797;
            class61.field1144 += var2;
            if (class61.field1144 >= 65535) {
                class61.field1144 = 65535;
                if (class20.field293) {
                    class270.field4792 = false;
                } else {
                    class270.field4792 = true;
                }
                class20.field293 = true;
            } else {
                class20.field293 = false;
                class270.field4792 = false;
            }
            int var3 = class56.field980 * 2;
            float var4 = (float) class61.field1144 / 65535.0F;
            for (int var5 = 0; ~var5 > -4; ++var5) {
                int var21 = class240.field4132[class146.field2491][var3 - -1][var5] * 3;
                int var22 = class240.field4132[class146.field2491][var3][var5];
                int var23 = class240.field4132[class146.field2491][var3][var5] * 3;
                int var24 = (class240.field4132[class146.field2491][var3 - -2][var5] + class240.field4132[class146.field2491][var3 - -2][var5] + -class240.field4132[class146.field2491][var3 + 3][var5]) * 3;
                int var25 = -var23 + var21;
                int var26 = var23 + var24 + -(var21 * 2);
                int var27 = class240.field4132[class146.field2491][var3 + 2][var5] + -var22 + -var24 + var21;
                var1[var5] = (((float) var27 * var4 + (float) var26) * var4 + (float) var25) * var4 + (float) var22;
            }
            class231.field3987 = (int) var1[1] * -1;
            if (~class244.field4172 == -1 && class213.field3742 == 0) {
                class244.field4172 = ((int) var1[0] >> 10) * 8 + -48;
                class213.field3742 = (((int) var1[2] >> 10) + -6) * 8;
            }
            class272.field4809 = (int) var1[2] - class213.field3742 * 128;
            class267.field4762 = (int) var1[0] + -(class244.field4172 * 128);
            float[] var6 = new float[3];
            int var7 = class234.field4046 * 2;
            for (int var8 = 0; ~var8 > -4; ++var8) {
                int var14 = class240.field4132[class154.field2663][var7][var8] * 3;
                int var15 = class240.field4132[class154.field2663][var7 + 1][var8] * 3;
                int var16 = (class240.field4132[class154.field2663][var7 + 2][var8] - (class240.field4132[class154.field2663][var7 - -3][var8] + -class240.field4132[class154.field2663][var7 + 2][var8])) * 3;
                int var17 = class240.field4132[class154.field2663][var7][var8];
                int var18 = var14 - var15 * 2 + var16;
                int var19 = -var14 + var15;
                int var20 = -var17 - -var15 + class240.field4132[class154.field2663][var7 + 2][var8] - var16;
                var6[var8] = (((float) var20 * var4 + (float) var18) * var4 + (float) var19) * var4 + (float) var17;
            }
            if (!arg0) {
                method978(-42);
            }
            float var9 = var6[0] + -var1[0];
            float var10 = var6[2] + -var1[2];
            float var11 = (var6[1] + -var1[1]) * -1.0F;
            double var12 = Math.sqrt((double) (var9 * var9 + var10 * var10));
            class153.field2641 = (float) Math.atan2((double) var11, var12);
            class202.field3528 = -((float) Math.atan2((double) var9, (double) var10));
            class35.field547 = 2047 & (int) ((double) class202.field3528 * 325.949D);
            class252.field4347 = (int) ((double) class153.field2641 * 325.949D) & 2047;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        if (arg2 == -99) {
            ++field2541;
            if (arg1 == 0) {
                this.field2538 = arg0.method1711((byte) -67);
                this.field2546 = new int[arg0.method1711((byte) -67)][2];
                for (int var4 = 0; this.field2546.length > var4; ++var4) {
                    this.field2546[var4][0] = arg0.method1694((byte) -100);
                    this.field2546[var4][1] = arg0.method1694((byte) -100);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "(I)V")
    public static final void method983(int arg0) {
        ++field2532;
        if (arg0 != -19493) {
            field2537 = -42;
        }
        class23.field330.method1270((byte) 107);
    }

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "(I)V")
    private final void method984(int arg0) {
        ++field2525;
        int[] var2 = this.field2546[0];
        int[] var3 = this.field2546[1];
        int[] var4 = this.field2546[this.field2546.length + -1];
        if (arg0 != -189) {
            method978(-108);
        }
        int[] var5 = this.field2546[this.field2546.length + -2];
        this.field2540 = new int[] { var5[0] - (var4[0] + -var5[0]), var5[1] + -var4[1] + var5[1] };
        this.field2524 = new int[] { var2[0] - -var2[0] + -var3[0], var2[1] + var2[1] + -var3[1] };
    }
}
