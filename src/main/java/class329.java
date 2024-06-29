import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class329 extends class183 {

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "I")
    private int field5588 = 409;

    @OriginalMember(owner = "client!rc", name = "eb", descriptor = "I")
    private int field5595 = 4096;

    @OriginalMember(owner = "client!rc", name = "ab", descriptor = "I")
    private int field5591 = 4096;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "[I")
    private int[] field5585 = new int[3];

    @OriginalMember(owner = "client!rc", name = "jb", descriptor = "I")
    private int field5600 = 4096;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "[I")
    public static int[] field5584 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!rc", name = "ib", descriptor = "I")
    public static int field5599 = 0;

    @OriginalMember(owner = "client!rc", name = "kb", descriptor = "I")
    public static int field5601 = -1;

    @OriginalMember(owner = "client!rc", name = "fb", descriptor = "I")
    public static int field5596 = -1;

    @OriginalMember(owner = "client!rc", name = "bb", descriptor = "Ljf;")
    public static class229 field5592 = class212.method1457((byte) 78, "<col=ff7000>");

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "Lui;")
    public static class268 field5586 = new class268(16);

    @OriginalMember(owner = "client!rc", name = "ob", descriptor = "Z")
    public static boolean field5605 = true;

    @OriginalMember(owner = "client!rc", name = "qb", descriptor = "Z")
    public static boolean field5607 = true;

    @OriginalMember(owner = "client!rc", name = "sb", descriptor = "Ljf;")
    public static class229 field5609 = class212.method1457((byte) 126, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!rc", name = "tb", descriptor = "Z")
    public static boolean field5610 = false;

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!rc", name = "Z", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!rc", name = "cb", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!rc", name = "db", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!rc", name = "gb", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!rc", name = "lb", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!rc", name = "mb", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!rc", name = "nb", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!rc", name = "pb", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "Lnf;")
    public static class67 field5589;

    @OriginalMember(owner = "client!rc", name = "hb", descriptor = "Lvm;")
    public static class77 field5598;

    @OriginalMember(owner = "client!rc", name = "rb", descriptor = "Lwa;")
    public static class82 field5608;

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V", line = 266)
    public class329() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIBIIII)V", line = 23)
    public static final void method2240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg9 - arg10;
        field5603++;
        int var12 = arg5 - arg2;
        boolean var13;
        if (class48.field867 > 0 && class48.field867 % 10 < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = 983040 / arg3;
        int var15 = 983040 / arg8;
        for (int var16 = -var14; var16 < (var11 + var14); var16++) {
            int var17 = (var16 + 1) * arg3 + arg7 >> 16;
            int var18 = arg3 * var16 + arg7 >> 16;
            int var19 = var17 - var18;
            if (var19 > 0) {
                int var10000 = arg1 + var17;
                int var21 = arg10 + var16 >> 6;
                int var22 = arg1 + var18;
                if (var21 >= 0 && var21 <= class270.field4639.length - 1) {
                    int[][] var23 = class270.field4639[var21];
                    for (int var24 = -var15; var24 < var12 + var15; var24++) {
                        int var25 = arg8 * var24 + arg0 >> 16;
                        int var26 = arg0 + ((var24 + 1) * arg8) >> 16;
                        int var27 = var26 - var25;
                        if (var27 > 0) {
                            var10000 = arg4 + var26;
                            int var29 = arg4 + var25;
                            int var30 = arg2 + var24 >> 6;
                            if (var30 >= 0 && (var23.length - 1) >= var30 && var23[var30] != null) {
                                int var31 = (arg2 + var24 & 0x3F << 6) + (arg10 + var16 & 0x3F);
                                int var32 = var23[var30][var31];
                                if (var32 != 0) {
                                    class83 var33 = class271.method1909(-111, var32 - 1);
                                    if (var13 && class16.field243 == var33.field1578) {
                                        class152 var34 = new class152();
                                        var34.field2632 = var29;
                                        var34.field2626 = var22;
                                        var34.field2623 = var33.field1578;
                                        class244.field4351.method2079(var34, 42);
                                    }
                                    class5.field51[var33.field1578].method314(var22 - 7, var29 + -7);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class152 var35 = (class152) class244.field4351.method2078(-121); var35 != null; var35 = (class152) class244.field4351.method2080(5)) {
            class5.field51[var35.field2623].method314(var35.field2626 - 7, var35.field2632 + -7);
            class114.method812(var35.field2626, var35.field2632, 15, 16776960, 128);
            class114.method812(var35.field2626, var35.field2632, 7, 16777215, 256);
        }
        int var36 = 87 % ((arg6 + 32) / 39);
        class244.field4351.method2073(true);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)V", line = 138)
    public static final void method2241(byte arg0, int arg1) {
        field5606++;
        class167.method1140(-54);
        class296.method2048(-121);
        int var2 = class301.method2062((byte) 122, arg1).field2283;
        if (var2 == 0) {
            return;
        }
        int var3 = class286.field4908[arg1];
        if (var2 == 5) {
            class189.field3292 = var3;
        }
        int var4 = -21 / ((34 - arg0) / 43);
        if (var2 == 6) {
            class106.field1830 = var3;
        }
        if (var2 == 9) {
            class12.field147 = var3;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z[Ljf;[S)V", line = 167)
    public static final void method2242(boolean arg0, class229[] arg1, short[] arg2) {
        if (!arg0) {
            field5597++;
            class203.method1416(1, arg1, arg2, 0, arg1.length - 1);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V", line = 189)
    public static final void method2243(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5602++;
        if (arg1 < arg3) {
            for (int var5 = arg1; var5 < arg3; var5++) {
                class173.field3021[var5][arg4] = arg0;
            }
        } else {
            for (int var6 = arg3; var6 < arg1; var6++) {
                class173.field3021[var6][arg4] = arg0;
            }
        }
        if (arg2 != -7) {
            field5609 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(II)V", line = 224)
    public static final void method2244(int arg0, int arg1) {
        class223.field3801.method231((byte) 113, arg0);
        field5593++;
        if (arg1 <= 117) {
            field5599 = -90;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(BI)Ljf;", line = 237)
    public static final class229 method2245(byte arg0, int arg1) {
        field5594++;
        if (arg1 >= 100000) {
            if (arg0 != 10) {
                field5607 = false;
            }
            return arg1 >= 10000000 ? class142.method989(new class229[] { class126.field2249, class84.method607(-90, arg1 / 1000000), class312.field5240, class74.field1398 }, -39) : class142.method989(new class229[] { class222.field3787, class84.method607(-77, arg1 / 1000), class229.field3928, class74.field1398 }, -23);
        } else {
            return class142.method989(new class229[] { class95.field1687, class84.method607(arg0 + 63, arg1), class74.field1398 }, -97);
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(Z)V", line = 276)
    public static void method2246(boolean arg0) {
        if (!arg0) {
            return;
        }
        field5589 = null;
        field5586 = null;
        field5592 = null;
        field5584 = null;
        field5598 = null;
        field5608 = null;
        field5609 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILkh;I)V", line = 292)
    public final void method14(int arg0, class14 arg1, int arg2) {
        if (arg0 > -43) {
            return;
        }
        if (arg2 == 0) {
            this.field5588 = arg1.method116(-1);
        } else if (arg2 == 1) {
            this.field5595 = arg1.method116(-1);
        } else if (arg2 == 2) {
            this.field5591 = arg1.method116(-1);
        } else if (arg2 == 3) {
            this.field5600 = arg1.method116(-1);
        } else if (arg2 == 4) {
            int var5 = arg1.method114(0);
            this.field5585[0] = class305.method2086(var5 << 4, 267386880);
            this.field5585[1] = class305.method2086(var5, 65280) >> 4;
            this.field5585[2] = class305.method2086(0, var5 >> 12);
        }
        field5604++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZIIIBIIIIII)Z", line = 366)
    public static final boolean method2247(int arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field5587++;
        int var12 = 100 / ((arg5 - 24) / 58);
        if (class301.field5124.method299(true) == 2) {
            return class311.method2108(arg10, arg11, arg2, arg9, arg7, arg3, arg4, arg8, false, arg6, arg1, arg0);
        } else if (class301.field5124.method299(true) <= 2) {
            return class44.method377(arg1, arg0, arg9, arg2, arg6, arg10, arg11, 73, arg7, arg8, arg4, arg3);
        } else {
            return class62.method463(arg11, arg0, arg3, arg9, class301.field5124.method299(true), arg7, arg4, (byte) 53, arg6, arg8, arg10, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)[[I", line = 390)
    public final int[][] method12(int arg0, int arg1) {
        field5590++;
        int[][] var3 = this.field3160.method1057(-20449, arg1);
        if (this.field3160.field2689) {
            int[][] var4 = this.method1250(arg1, 0, (byte) 125);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class22.field393; var11++) {
                int var12 = var5[var11];
                int var13 = var12 - this.field5585[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 <= this.field5588) {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field5585[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 > this.field5588) {
                        var7[var11] = var12;
                        var8[var11] = var14;
                        var10[var11] = var9[var11];
                    } else {
                        int var16 = var9[var11];
                        int var17 = var16 - this.field5585[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field5588 < var17) {
                            var7[var11] = var12;
                            var8[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var7[var11] = this.field5600 * var12 >> 12;
                            var8[var11] = this.field5591 * var14 >> 12;
                            var10[var11] = this.field5595 * var16 >> 12;
                        }
                    }
                } else {
                    var7[var11] = var12;
                    var8[var11] = var6[var11];
                    var10[var11] = var9[var11];
                }
            }
        }
        int var18 = -58 % ((18 - arg0) / 61);
        return var3;
    }
}
