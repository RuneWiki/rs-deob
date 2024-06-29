import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class37 extends class12 {

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "I")
    private int field692 = 3216;

    @OriginalMember(owner = "client!dg", name = "fb", descriptor = "I")
    private int field702 = 4096;

    @OriginalMember(owner = "client!dg", name = "ib", descriptor = "I")
    private int field705 = 3216;

    @OriginalMember(owner = "client!dg", name = "hb", descriptor = "[I")
    private int[] field704 = new int[3];

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "Ltg;")
    public static class184 field684 = class135.method812("lila:", 3);

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "Ltg;")
    public static class184 field694 = class135.method812("::clientdrop", 3);

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "Ltg;")
    public static class184 field695 = class135.method812("auf der Hautpseite)3", 3);

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "Ltg;")
    public static class184 field688 = class135.method812("p12_full", 3);

    @OriginalMember(owner = "client!dg", name = "kb", descriptor = "Ltg;")
    public static class184 field707 = class135.method812("Ung-Ultige Session)2ID)3", 3);

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "[Z")
    public static boolean[] field691 = new boolean[5];

    @OriginalMember(owner = "client!dg", name = "nb", descriptor = "Ltg;")
    private static class184 field710 = class135.method812("Please try using a different world)3", 3);

    @OriginalMember(owner = "client!dg", name = "cb", descriptor = "Ltg;")
    public static class184 field699 = field710;

    @OriginalMember(owner = "client!dg", name = "mb", descriptor = "Ltg;")
    public static class184 field709 = field710;

    @OriginalMember(owner = "client!dg", name = "jb", descriptor = "Ltg;")
    public static class184 field706 = field710;

    @OriginalMember(owner = "client!dg", name = "db", descriptor = "Ltg;")
    public static class184 field700 = field710;

    @OriginalMember(owner = "client!dg", name = "lb", descriptor = "Ltg;")
    public static class184 field708 = field710;

    @OriginalMember(owner = "client!dg", name = "ab", descriptor = "Ltg;")
    public static class184 field697 = field710;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!dg", name = "eb", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!dg", name = "gb", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "Led;")
    public static class44 field693;

    @OriginalMember(owner = "client!dg", name = "bb", descriptor = "[I")
    public static int[] field698;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)V")
    private final void method220(boolean arg0) {
        ++field701;
        if (arg0) {
            this.method62(-63, (byte) -123);
        }
        double var2 = Math.cos((double) (this.field705 / 4096));
        this.field704[0] = (int) (Math.sin((double) (this.field692 / 4096)) * var2 * 4096.0D);
        this.field704[1] = (int) (Math.cos((double) (this.field692 / 4096)) * var2 * 4096.0D);
        this.field704[2] = (int) (Math.sin((double) (this.field705 / 4096)) * 4096.0D);
        int var4 = this.field704[1] * this.field704[1] >> 12;
        int var5 = this.field704[2] * this.field704[2] >> 12;
        int var6 = this.field704[0] * this.field704[0] >> 12;
        int var7 = (int) (Math.sqrt((double) (var6 - -var4 + var5 >> 12)) * 4096.0D);
        if (~var7 != -1) {
            this.field704[1] = (this.field704[1] << 12) / var7;
            this.field704[0] = (this.field704[0] << 12) / var7;
            this.field704[2] = (this.field704[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)V")
    public static final void method221(int arg0) {
        ++field703;
        class57.method305(-120, class34.field591);
        ++class150.field2693;
        if (class208.field3997 && class18.field328) {
            int var1 = class195.field3793;
            int var2 = class39.field736;
            if (arg0 != 427130092) {
                field684 = null;
            }
            int var3 = var1 - class173.field3282;
            if (~class145.field2620 < ~var3) {
                var3 = class145.field2620;
            }
            if (class34.field591.field3089 + var3 > class145.field2620 - -class6.field115.field3089) {
                var3 = -class34.field591.field3089 + class145.field2620 + class6.field115.field3089;
            }
            int var4 = var2 - class10.field182;
            int var5 = -class182.field3505 + var3;
            if (~class24.field438 < ~var4) {
                var4 = class24.field438;
            }
            int var6 = class34.field591.field3019;
            if (~(class34.field591.field3045 + var4) < ~(class24.field438 + class6.field115.field3045)) {
                var4 = -class34.field591.field3045 + class6.field115.field3045 + class24.field438;
            }
            int var7 = -class167.field3028 + var4;
            if (~class150.field2693 < ~class34.field591.field3084 && (var6 < var7 || -var6 > var7 || var5 > var6 || ~var5 > ~(-var6))) {
                class74.field1384 = true;
            }
            int var8 = class6.field115.field3109 + var4 + -class24.field438;
            int var9 = var3 - (class145.field2620 - class6.field115.field3073);
            if (class34.field591.field3017 != null && class74.field1384) {
                class5 var10 = new class5();
                var10.field96 = class34.field591.field3017;
                var10.field79 = var9;
                var10.field99 = var8;
                var10.field101 = class34.field591;
                class54.method293(var10, -115);
            }
            if (~class1.field12 == -1) {
                if (!class74.field1384) {
                    if ((~class43.field822 == -2 || class81.method453(false, class133.field2404 + -1)) && ~class133.field2404 < -3) {
                        class113.method698(2);
                    } else if (~class133.field2404 < -1) {
                        class43.method249(true, class133.field2404 - 1);
                    }
                } else {
                    if (class34.field591.field3025 != null) {
                        class5 var11 = new class5();
                        var11.field101 = class34.field591;
                        var11.field102 = class94.field1717;
                        var11.field99 = var8;
                        var11.field79 = var9;
                        var11.field96 = class34.field591.field3025;
                        class54.method293(var11, 33);
                    }
                    if (class94.field1717 != null && class107.method666(class34.field591, -950) != null) {
                        ++class57.field1016;
                        class117.field2122.method106(176, -124);
                        class117.field2122.method580(class94.field1717.field3069, false);
                        class117.field2122.method580(class34.field591.field3069, false);
                        class117.field2122.method589((byte) -104, class94.field1717.field2989);
                        class117.field2122.method573(92, class34.field591.field2989);
                    }
                }
                class34.field591 = null;
            }
        } else {
            if (class150.field2693 > 1) {
                class34.field591 = null;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        this.method220(false);
        if (arg0 != 57) {
            field695 = null;
        }
        ++field686;
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)V")
    public static void method222(int arg0) {
        field700 = null;
        field697 = null;
        field699 = null;
        field708 = null;
        field684 = null;
        field695 = null;
        field691 = null;
        field698 = null;
        if (arg0 >= -17) {
            field707 = null;
        }
        field707 = null;
        field688 = null;
        field709 = null;
        field706 = null;
        field694 = null;
        field693 = null;
        field710 = null;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class37() {
        super(1, true);
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)V")
    public static final void method223(byte arg0) {
        if (arg0 != -60) {
            method223((byte) -74);
        }
        for (int var1 = 0; ~class91.field1700 < ~var1; ++var1) {
            int var10002 = class198.field3867[var1]--;
            if (~class198.field3867[var1] <= 9) {
                class48 var3 = class179.field3421[var1];
                if (var3 == null) {
                    var3 = class48.method274(class7.field128, class189.field3663[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class198.field3867[var1] += var3.method272();
                    class179.field3421[var1] = var3;
                }
                if (~class198.field3867[var1] > -1) {
                    int var10;
                    if (class57.field1025[var1] != 0) {
                        int var4 = (255 & class57.field1025[var1]) * 128;
                        int var5 = (class57.field1025[var1] & 16733647) >> 16;
                        int var6 = var5 * 128 + -class46.field872.field635 + 64;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = (class57.field1025[var1] & 65462) >> 8;
                        int var8 = var7 * 128 - class46.field872.field614 + 64;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var8 + -128 + var6;
                        if (var4 < var9) {
                            class198.field3867[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class170.field3230 / var4;
                    } else {
                        var10 = class19.field353;
                    }
                    if (~var10 < -1) {
                        class33 var11 = var3.method275().method204(field693);
                        class165 var12 = class165.method1022(var11, 100, var10);
                        var12.method1004(class131.field2383[var1] + -1);
                        class26.field467.method142(var12);
                    }
                    class198.field3867[var1] = -100;
                }
            } else {
                --class91.field1700;
                for (int var2 = var1; ~var2 > ~class91.field1700; ++var2) {
                    class189.field3663[var2] = class189.field3663[var2 + 1];
                    class179.field3421[var2] = class179.field3421[var2 + 1];
                    class131.field2383[var2] = class131.field2383[var2 + 1];
                    class198.field3867[var2] = class198.field3867[var2 - -1];
                    class57.field1025[var2] = class57.field1025[var2 + 1];
                }
                --var1;
            }
        }
        if (class159.field2856 && !class59.method329(91)) {
            if (~class136.field2480 != -1 && class7.field131 != -1) {
                class196.method1245(0, -122, false, class7.field131, class180.field3427, class136.field2480);
            }
            class159.field2856 = false;
        } else if (~class136.field2480 != -1 && ~class7.field131 != 0 && !class59.method329(76)) {
            ++class151.field2718;
            class117.field2122.method106(95, -114);
            class117.field2122.method580(class7.field131, false);
            class7.field131 = -1;
        }
        ++field689;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        ++field696;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field705 = arg0.method611(arg2);
                }
            } else {
                this.field692 = arg0.method611(false);
            }
        } else {
            this.field702 = arg0.method611(false);
        }
        if (arg2) {
            this.method59((class97) null, -62, true);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ltg;IILtg;Ltg;)V")
    public static final void method224(class184 arg0, int arg1, int arg2, class184 arg3, class184 arg4) {
        for (int var5 = 99; ~var5 < -1; --var5) {
            class87.field1599[var5] = class87.field1599[var5 + -1];
            class154.field2768[var5] = class154.field2768[var5 + -1];
            class76.field1397[var5] = class76.field1397[var5 - 1];
            class207.field3982[var5] = class207.field3982[var5 - 1];
        }
        int var6 = 42 / ((arg1 - -49) / 53);
        ++field685;
        class154.field2768[0] = arg4;
        class76.field1397[0] = arg3;
        class21.field407 = class136.field2471;
        class87.field1599[0] = arg2;
        class207.field3982[0] = arg0;
        ++class55.field976;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        ++field690;
        int[] var3 = super.field224.method7((byte) 126, arg0);
        if (super.field224.field53) {
            int[] var4 = this.method77(0, arg0 - 1 & class173.field3274, -121);
            int[] var5 = this.method77(0, arg0, arg1 ^ -112);
            int[] var6 = this.method77(0, arg0 - -1 & class173.field3274, -127);
            for (int var7 = 0; ~class201.field3889 < ~var7; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field702;
                int var9 = (var5[var7 + 1 & class51.field937] + -var5[class51.field937 & var7 - 1]) * this.field702;
                int var10 = var9 >> 12;
                int var11 = var10 * var10 >> 12;
                int var12 = var8 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((var11 + var13 + 4096) / 4096)));
                int var15;
                int var16;
                int var17;
                if (~var14 != -1) {
                    var15 = var8 / var14;
                    var16 = var9 / var14;
                    var17 = 16777216 / var14;
                } else {
                    var15 = 0;
                    var17 = 0;
                    var16 = 0;
                }
                int var18 = this.field704[1] * var15 >> 12;
                int var19 = this.field704[2] * var17 >> 12;
                int var20 = this.field704[0] * var16 >> 12;
                var3[var7] = var19 + var20 + var18;
            }
        }
        return arg1 != 17 ? null : var3;
    }
}
