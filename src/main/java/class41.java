import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class41 extends class89 {

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "I")
    private int field678 = 5;

    @OriginalMember(owner = "client!ig", name = "ab", descriptor = "[S")
    private short[] field686 = new short[512];

    @OriginalMember(owner = "client!ig", name = "jb", descriptor = "I")
    private int field695 = 1;

    @OriginalMember(owner = "client!ig", name = "hb", descriptor = "I")
    private int field693 = 2;

    @OriginalMember(owner = "client!ig", name = "kb", descriptor = "I")
    private int field696 = 0;

    @OriginalMember(owner = "client!ig", name = "gb", descriptor = "I")
    private int field692 = 5;

    @OriginalMember(owner = "client!ig", name = "mb", descriptor = "I")
    private int field698 = 2048;

    @OriginalMember(owner = "client!ig", name = "nb", descriptor = "[B")
    private byte[] field699 = new byte[512];

    @OriginalMember(owner = "client!ig", name = "bb", descriptor = "I")
    public static int field687 = -1;

    @OriginalMember(owner = "client!ig", name = "ib", descriptor = "Lda;")
    private static class275 field694 = class255.method1672(94, "glow3:");

    @OriginalMember(owner = "client!ig", name = "Y", descriptor = "Lda;")
    public static class275 field684 = class255.method1672(121, "(U4");

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "Lda;")
    public static class275 field677 = field694;

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "Lda;")
    public static class275 field680 = field694;

    @OriginalMember(owner = "client!ig", name = "ob", descriptor = "Lfd;")
    public static class229 field700 = null;

    @OriginalMember(owner = "client!ig", name = "Z", descriptor = "Lne;")
    public static class137 field685 = new class137(260);

    @OriginalMember(owner = "client!ig", name = "qb", descriptor = "Lda;")
    public static class275 field702 = class255.method1672(120, "");

    @OriginalMember(owner = "client!ig", name = "pb", descriptor = "Lne;")
    public static class137 field701 = new class137(64);

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!ig", name = "X", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!ig", name = "cb", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!ig", name = "db", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!ig", name = "eb", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!ig", name = "fb", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!ig", name = "lb", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!ig", name = "rb", descriptor = "Lma;")
    public static class105 field703;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "(I)V")
    public static final void method233(int arg0) {
        class34.field536.method993(122);
        class267.field4639.method993(106);
        class92.field1558.method993(118);
        ++field697;
        if (arg0 != -3193) {
            field703 = null;
        }
        class75.field1234.method993(108);
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)V")
    public final void method234(int arg0) {
        this.field699 = class160.method1120(this.field696, -15246);
        if (arg0 != 1) {
            field685 = null;
        }
        ++field681;
        this.method241(arg0 + -2);
    }

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "(I)V")
    public static final void method235(int arg0) {
        ++field690;
        if (!(class153.field2683 < class199.field3397)) {
            if (class153.field2683 > class199.field3397) {
                class153.field2683 = (float) ((double) class153.field2683 - (double) class153.field2683 / 30.0D);
                if (class199.field3397 > class153.field2683) {
                    class153.field2683 = class199.field3397;
                }
                class138.method994((byte) 110);
            }
        } else {
            class153.field2683 = (float) ((double) class153.field2683 / 30.0D + (double) class153.field2683);
            if (class199.field3397 < class153.field2683) {
                class153.field2683 = class199.field3397;
            }
            class138.method994((byte) 120);
        }
        if (class163.field2840 != -1 && class51.field842 != -1) {
            int var1 = -class261.field4531 + class163.field2840;
            if (var1 < 2 || ~var1 < -3) {
                var1 >>= 4;
            }
            int var2 = class51.field842 - class258.field4521;
            if (~var2 > -3 || var2 > 2) {
                var2 >>= 4;
            }
            if (~var1 == -1 && ~var2 == -1) {
                class51.field842 = -1;
                class163.field2840 = -1;
            }
            class258.field4521 += var2;
            class261.field4531 -= -var1;
            class138.method994((byte) 78);
        }
        if (arg0 != 27525) {
            field684 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILda;)V")
    public static final void method236(int arg0, class275 arg1) {
        class199.field3394 = arg1;
        ++field679;
        if (arg0 != 260) {
            method237(-29, -86, 69, 1, -30, 97, -43, -6, -49, -58);
        }
        if (class3.field24.field970 != null) {
            try {
                class275 var2 = class39.field657.method1832(-122, class3.field24.field970);
                class275 var3 = class249.field4403.method1832(-124, class3.field24.field970);
                class275 var4 = class197.method1291(new class275[] { var2, class42.field725, arg1, class109.field1898, var3 }, arg0 ^ -29773);
                class275 var5;
                if (~arg1.method1838(3) != -1) {
                    var5 = class197.method1291(new class275[] { var4, class109.field1920, class167.method1143(arg0 + -250, class121.method888((byte) -119) - -94608000000L), class192.field3314, class203.method1329(1, 94608000L) }, -30025);
                } else {
                    var5 = class197.method1291(new class275[] { var4, class171.field2983 }, arg0 ^ -29773);
                }
                class197.method1291(new class275[] { class201.field3439, var5, class52.field871 }, -30025).method1808(class3.field24.field970, (byte) 92);
            } catch (Throwable var6) {
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
    public class41() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (~arg3 == ~arg7 && ~arg5 == ~arg9 && arg6 == arg8 && arg0 == arg1) {
            class108.method801(-29, arg2, arg5, arg8, arg0, arg7);
        } else {
            int var10 = arg7 * 3;
            int var11 = arg7;
            int var12 = arg5 * 3;
            int var13 = arg5;
            int var14 = arg9 * 3;
            int var15 = arg3 * 3;
            int var16 = arg6 * 3;
            int var17 = arg1 * 3;
            int var18 = arg8 + var15 - (var16 - -arg7);
            int var19 = var17 - (var14 - -var14) + var12;
            int var20 = arg0 - var17 + -arg5 + var14;
            int var21 = -var15 + var10 + -var15 + var16;
            int var22 = -var10 + var15;
            int var23 = -var12 + var14;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var25;
                int var29 = var22 * var24;
                int var30 = var20 * var26;
                int var31 = var21 * var25;
                int var32 = var23 * var24;
                int var33 = arg7 - -(var27 - -var29 + var31 >> 12);
                int var34 = (var28 + var32 + var30 >> 12) + arg5;
                class108.method801(-30, arg2, var13, var33, var34, var11);
                var11 = var33;
                var13 = var34;
            }
        }
        ++field691;
        if (arg4 != 128) {
            field703 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "(I)V")
    public static void method238(int arg0) {
        field703 = null;
        if (arg0 < 37) {
            method236(95, (class275) null);
        }
        field702 = null;
        field700 = null;
        field685 = null;
        field677 = null;
        field694 = null;
        field680 = null;
        field684 = null;
        field701 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        ++field688;
        if (arg0 != -20503) {
            field684 = null;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field692 = arg1.method564((byte) 49);
                                }
                            } else {
                                this.field678 = arg1.method564((byte) 117);
                            }
                        } else {
                            this.field695 = arg1.method564((byte) 118);
                        }
                    } else {
                        this.field693 = arg1.method564((byte) 66);
                    }
                } else {
                    this.field698 = arg1.method608(106);
                }
            } else {
                this.field696 = arg1.method564((byte) 96);
            }
        } else {
            this.field678 = this.field692 = arg1.method564((byte) 68);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        ++field689;
        if (arg1) {
            return null;
        } else {
            int[] var3 = super.field1503.method229(arg0, (byte) -71);
            if (super.field1503.field664) {
                int var4 = class91.field1552[arg0] * this.field692 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; var7 < class65.field1070; ++var7) {
                    class207.field3500 = Integer.MAX_VALUE;
                    class45.field758 = Integer.MAX_VALUE;
                    class216.field3697 = Integer.MAX_VALUE;
                    class139.field2438 = Integer.MAX_VALUE;
                    int var8 = class185.field3172[var7] * this.field678 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                        int var13 = this.field699[255 & (var11 < this.field692 ? var11 : -this.field692 + var11)] & 255;
                        for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                            int var15 = (255 & this.field699[var13 - -(~this.field678 >= ~var14 ? -this.field678 + var14 : var14) & 255]) * 2;
                            int var10000 = -(var14 << 12);
                            int var27 = var15 + 1;
                            int var16 = var10000 - this.field686[var15] + var8;
                            int var17 = var4 - (this.field686[var27] - -(var11 << 12));
                            int var18 = this.field695;
                            int var19;
                            if (var18 != 1) {
                                if (~var18 != -4) {
                                    if (~var18 != -5) {
                                        if (var18 != 5) {
                                            if (var18 == 2) {
                                                var19 = (~var16 > -1 ? -var16 : var16) - -(var17 >= 0 ? var17 : -var17);
                                            } else {
                                                var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                            }
                                        } else {
                                            int var20 = var17 * var17;
                                            int var21 = var16 * var16;
                                            var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 - -var20) / 1.6777216E7F))) * 4096.0D);
                                        }
                                    } else {
                                        int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)));
                                        int var23 = (int) (Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                        int var24 = var22 - -var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = var16 >= 0 ? var16 : -var16;
                                    int var26 = ~var17 <= -1 ? var17 : -var17;
                                    var19 = ~var25 < ~var26 ? var25 : var26;
                                }
                            } else {
                                var19 = var16 * var16 - -(var17 * var17) >> 12;
                            }
                            if (var19 < class139.field2438) {
                                class207.field3500 = class45.field758;
                                class45.field758 = class216.field3697;
                                class216.field3697 = class139.field2438;
                                class139.field2438 = var19;
                            } else if (class216.field3697 <= var19) {
                                if (class45.field758 <= var19) {
                                    if (~var19 > ~class207.field3500) {
                                        class207.field3500 = var19;
                                    }
                                } else {
                                    class207.field3500 = class45.field758;
                                    class45.field758 = var19;
                                }
                            } else {
                                class207.field3500 = class45.field758;
                                class45.field758 = class216.field3697;
                                class216.field3697 = var19;
                            }
                        }
                    }
                    int var12 = this.field693;
                    if (var12 != 0) {
                        if (~var12 != -2) {
                            if (~var12 != -4) {
                                if (var12 != 4) {
                                    if (~var12 == -3) {
                                        var3[var7] = -class139.field2438 + class216.field3697;
                                    }
                                } else {
                                    var3[var7] = class207.field3500;
                                }
                            } else {
                                var3[var7] = class45.field758;
                            }
                        } else {
                            var3[var7] = class216.field3697;
                        }
                    } else {
                        var3[var7] = class139.field2438;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(JZ)V")
    public static final void method240(long arg0, boolean arg1) {
        ++field683;
        if (~arg0 != -1L) {
            if (arg1) {
                field680 = null;
            }
            for (int var3 = 0; class63.field1053 > var3; ++var3) {
                if (class135.field2393[var3] == arg0) {
                    ++class76.field1251;
                    --class63.field1053;
                    for (int var4 = var3; ~var4 > ~class63.field1053; ++var4) {
                        class148.field2585[var4] = class148.field2585[var4 - -1];
                        class102.field1694[var4] = class102.field1694[var4 + 1];
                        class86.field1450[var4] = class86.field1450[var4 + 1];
                        class135.field2393[var4] = class135.field2393[var4 + 1];
                        class25.field408[var4] = class25.field408[var4 + 1];
                        class157.field2760[var4] = class157.field2760[var4 + 1];
                    }
                    class156.field2753 = class209.field3533;
                    class149.field2597.method526((byte) -111, 49);
                    class149.field2597.method560(arg0, -47);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "(I)V")
    private final void method241(int arg0) {
        ++field682;
        Random var2 = new Random((long) this.field696);
        this.field686 = new short[512];
        if (~this.field698 < arg0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field686[var3] = (short) class116.method845((byte) -115, var2, this.field698);
            }
        }
    }
}
