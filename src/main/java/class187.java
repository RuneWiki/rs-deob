import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class187 extends class272 {

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "[I")
    private int[] field3459 = new int[257];

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "I")
    public static int field3462 = -1;

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "Z")
    public static boolean field3463 = false;

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "I")
    public static int field3471 = 0;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "Lhi;")
    public static class250 field3465;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "Lhi;")
    public static class250 field3472;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "[I")
    public static int[] field3473;

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "[[I")
    private int[][] field3460;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V")
    private final void method1347(int arg0) {
        ++field3467;
        int var2 = 29 % ((arg0 - 77) / 41);
        int var3 = this.field3460.length;
        if (~var3 < -1) {
            for (int var4 = 0; var4 < 257; ++var4) {
                int var5 = 0;
                int var6 = var4 << 4;
                for (int var7 = 0; var3 > var7 && this.field3460[var7][0] <= var6; ++var7) {
                    ++var5;
                }
                int var12;
                int var13;
                int var14;
                if (var5 < var3) {
                    int[] var8 = this.field3460[var5];
                    if (~var5 < -1) {
                        int[] var9 = this.field3460[var5 + -1];
                        int var10 = (-var9[0] + var6 << 12) / (var8[0] + -var9[0]);
                        int var11 = -var10 + 4096;
                        var12 = var8[1] * var10 - -(var9[1] * var11) >> 12;
                        var13 = var8[3] * var10 + var9[3] * var11 >> 12;
                        var14 = var8[2] * var10 + var9[2] * var11 >> 12;
                    } else {
                        var14 = var8[2];
                        var13 = var8[3];
                        var12 = var8[1];
                    }
                } else {
                    int[] var15 = this.field3460[var3 + -1];
                    var12 = var15[1];
                    var13 = var15[3];
                    var14 = var15[2];
                }
                int var16 = var13 >> 4;
                if (var16 >= 0) {
                    if (~var16 < -256) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                int var17 = var12 >> 4;
                if (~var17 > -1) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                int var18 = var14 >> 4;
                if (var18 >= 0) {
                    if (var18 > 255) {
                        var18 = 255;
                    }
                } else {
                    var18 = 0;
                }
                this.field3459[var4] = class21.method150(var16, class21.method150(var17 << 16, var18 << 8));
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "(I)V")
    public static void method1348(int arg0) {
        if (arg0 == 1363) {
            field3472 = null;
            field3465 = null;
            field3473 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class187() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        int var4 = -80 % ((arg1 - -21) / 55);
        if (arg2 == 0) {
            int var5 = arg0.method867(false);
            if (var5 == 0) {
                this.field3460 = new int[arg0.method867(false)][4];
                for (int var6 = 0; ~var6 > ~this.field3460.length; ++var6) {
                    this.field3460[var6][0] = arg0.method827(255);
                    this.field3460[var6][1] = arg0.method867(false) << 4;
                    this.field3460[var6][2] = arg0.method867(false) << 4;
                    this.field3460[var6][3] = arg0.method867(false) << 4;
                }
            } else {
                this.method1350(var5, -76);
            }
        }
        ++field3466;
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
    public final void method113(int arg0) {
        if (this.field3460 == null) {
            this.method1350(1, -106);
        }
        this.method1347(-68);
        ++field3468;
        if (arg0 != 0) {
            field3464 = -66;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lk;Z)V")
    public static final void method1349(class198 arg0, boolean arg1) {
        class135.field2473.method1382(arg0, (byte) -120);
        while (true) {
            class198 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class198[][] var7;
            class198 var66;
            do {
                class198 var65;
                do {
                    class198 var64;
                    do {
                        class198 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class198) class135.field2473.method1376(-122);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3645);
                                            var3 = var2.field3629;
                                            var4 = var2.field3630;
                                            var5 = var2.field3642;
                                            var6 = var2.field3644;
                                            var7 = class153.field2896[var5];
                                            if (!var2.field3632) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class198 var8 = class153.field2896[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field3645) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class267.field4732 && var3 > class256.field4558) {
                                                    class198 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field3645 && (var9.field3632 || (var2.field3647 & 1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class267.field4732 && var3 < class79.field1380 - 1) {
                                                    class198 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field3645 && (var10.field3632 || (var2.field3647 & 4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class9.field193 && var4 > class134.field2432) {
                                                    class198 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field3645 && (var11.field3632 || (var2.field3647 & 8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class9.field193 && var4 < class94.field1791 - 1) {
                                                    class198 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field3645 && (var12.field3632 || (var2.field3647 & 2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field3632 = false;
                                            if (var2.field3634 != null) {
                                                class198 var13 = var2.field3634;
                                                if (var13.field3648 != null) {
                                                    if (!class248.method1667(0, var3, var4)) {
                                                        class48.method307(var13.field3648, 0, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var3, var4, false);
                                                    } else {
                                                        class48.method307(var13.field3648, 0, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var3, var4, true);
                                                    }
                                                } else if (var13.field3633 != null) {
                                                    if (!class248.method1667(0, var3, var4)) {
                                                        client.method1501(var13.field3633, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var3, var4, false);
                                                    } else {
                                                        client.method1501(var13.field3633, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var3, var4, true);
                                                    }
                                                }
                                                class206 var14 = var13.field3640;
                                                if (var14 != null) {
                                                    var14.field3787.method48(0, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var14.field3784 - class6.field144, var14.field3783 - class150.field2847, var14.field3774 - class185.field3447, var14.field3781, var5, (class16) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field3627; ++var15) {
                                                    class49 var16 = var13.field3646[var15];
                                                    if (var16 != null) {
                                                        var16.field800.method48(var16.field804, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var16.field794 - class6.field144, var16.field815 - class150.field2847, var16.field808 - class185.field3447, var16.field802, var5, (class16) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field3648 != null) {
                                                if (!class248.method1667(var6, var3, var4)) {
                                                    var17 = true;
                                                    if (var2.field3648.field4720 != 12345678 || class87.field1702 && var5 <= class262.field4644) {
                                                        class48.method307(var2.field3648, var6, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var3, var4, false);
                                                    }
                                                } else {
                                                    class48.method307(var2.field3648, var6, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var3, var4, true);
                                                }
                                            } else if (var2.field3633 != null) {
                                                if (!class248.method1667(var6, var3, var4)) {
                                                    var17 = true;
                                                    client.method1501(var2.field3633, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var3, var4, false);
                                                } else {
                                                    client.method1501(var2.field3633, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var3, var4, true);
                                                }
                                            }
                                            if (var17) {
                                                class251 var18 = var2.field3631;
                                                if (var18 != null && (var18.field4466 & 2147483648L) != 0L) {
                                                    var18.field4467.method48(0, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var18.field4474 - class6.field144, var18.field4473 - class150.field2847, var18.field4469 - class185.field3447, var18.field4466, var5, (class16) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class206 var21 = var2.field3640;
                                            class38 var22 = var2.field3636;
                                            if (var21 != null || var22 != null) {
                                                if (class267.field4732 == var3) {
                                                    ++var19;
                                                } else if (class267.field4732 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class9.field193 == var4) {
                                                    var19 += 3;
                                                } else if (class9.field193 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class217.field3971[var19];
                                                var2.field3641 = class134.field2411[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field3788 & class111.field1987[var19]) != 0) {
                                                    if (var21.field3788 == 16) {
                                                        var2.field3628 = 3;
                                                        var2.field3643 = class263.field4664[var19];
                                                        var2.field3637 = 3 - var2.field3643;
                                                    } else if (var21.field3788 == 32) {
                                                        var2.field3628 = 6;
                                                        var2.field3643 = class280.field4952[var19];
                                                        var2.field3637 = 6 - var2.field3643;
                                                    } else if (var21.field3788 == 64) {
                                                        var2.field3628 = 12;
                                                        var2.field3643 = class195.field3585[var19];
                                                        var2.field3637 = 12 - var2.field3643;
                                                    } else {
                                                        var2.field3628 = 9;
                                                        var2.field3643 = class153.field2901[var19];
                                                        var2.field3637 = 9 - var2.field3643;
                                                    }
                                                } else {
                                                    var2.field3628 = 0;
                                                }
                                                if ((var21.field3788 & var20) != 0 && !class273.method1875(var6, var3, var4, var21.field3788)) {
                                                    var21.field3787.method48(0, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var21.field3784 - class6.field144, var21.field3783 - class150.field2847, var21.field3774 - class185.field3447, var21.field3781, var5, (class16) null);
                                                }
                                                if ((var21.field3778 & var20) != 0 && !class273.method1875(var6, var3, var4, var21.field3778)) {
                                                    var21.field3780.method48(0, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var21.field3784 - class6.field144, var21.field3783 - class150.field2847, var21.field3774 - class185.field3447, var21.field3781, var5, (class16) null);
                                                }
                                            }
                                            if (var22 != null && !class15.method112(var6, var3, var4, var22.field595.method62())) {
                                                if ((var22.field601 & var20) != 0) {
                                                    var22.field595.method48(0, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var22.field592 - class6.field144 + var22.field609, var22.field600 - class150.field2847, var22.field596 - class185.field3447 + var22.field603, var22.field597, var5, (class16) null);
                                                } else if (var22.field601 == 256) {
                                                    int var23 = var22.field592 - class6.field144;
                                                    int var24 = var22.field600 - class150.field2847;
                                                    int var25 = var22.field596 - class185.field3447;
                                                    int var26 = var22.field610;
                                                    int var27;
                                                    if (var26 != 1 && var26 != 2) {
                                                        var27 = var23;
                                                    } else {
                                                        var27 = -var23;
                                                    }
                                                    int var28;
                                                    if (var26 != 2 && var26 != 3) {
                                                        var28 = var25;
                                                    } else {
                                                        var28 = -var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field595.method48(0, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var22.field609 + var23, var24, var22.field603 + var25, var22.field597, var5, (class16) null);
                                                    } else if (var22.field594 != null) {
                                                        var22.field594.method48(0, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var23, var24, var25, var22.field597, var5, (class16) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class251 var29 = var2.field3631;
                                                if (var29 != null && (var29.field4466 & 2147483648L) == 0L) {
                                                    var29.field4467.method48(0, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var29.field4474 - class6.field144, var29.field4473 - class150.field2847, var29.field4469 - class185.field3447, var29.field4466, var5, (class16) null);
                                                }
                                                class64 var30 = var2.field3639;
                                                if (var30 != null && var30.field1111 == 0) {
                                                    if (var30.field1119 != null) {
                                                        var30.field1119.method48(0, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var30.field1116 - class6.field144, var30.field1114 - class150.field2847, var30.field1121 - class185.field3447, var30.field1117, var5, (class16) null);
                                                    }
                                                    if (var30.field1120 != null) {
                                                        var30.field1120.method48(0, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var30.field1116 - class6.field144, var30.field1114 - class150.field2847, var30.field1121 - class185.field3447, var30.field1117, var5, (class16) null);
                                                    }
                                                    if (var30.field1110 != null) {
                                                        var30.field1110.method48(0, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var30.field1116 - class6.field144, var30.field1114 - class150.field2847, var30.field1121 - class185.field3447, var30.field1117, var5, (class16) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field3647;
                                            if (var31 != 0) {
                                                if (var3 < class267.field4732 && (var31 & 4) != 0) {
                                                    class198 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field3645) {
                                                        class135.field2473.method1382(var32, (byte) -62);
                                                    }
                                                }
                                                if (var4 < class9.field193 && (var31 & 2) != 0) {
                                                    class198 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field3645) {
                                                        class135.field2473.method1382(var33, (byte) -109);
                                                    }
                                                }
                                                if (var3 > class267.field4732 && (var31 & 1) != 0) {
                                                    class198 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field3645) {
                                                        class135.field2473.method1382(var34, (byte) -88);
                                                    }
                                                }
                                                if (var4 > class9.field193 && (var31 & 8) != 0) {
                                                    class198 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field3645) {
                                                        class135.field2473.method1382(var35, (byte) -103);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3628 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field3627; ++var37) {
                                                if (class232.field4172 != var2.field3646[var37].field797 && (var2.field3638[var37] & var2.field3628) == var2.field3643) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class206 var38 = var2.field3640;
                                                if (!class273.method1875(var6, var3, var4, var38.field3788)) {
                                                    var38.field3787.method48(0, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var38.field3784 - class6.field144, var38.field3783 - class150.field2847, var38.field3774 - class185.field3447, var38.field3781, var5, (class16) null);
                                                }
                                                var2.field3628 = 0;
                                            }
                                        }
                                        if (!var2.field3635) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field3627;
                                            var2.field3635 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; ++var41) {
                                                class49 var42 = var2.field3646[var41];
                                                if (class232.field4172 != var42.field797) {
                                                    for (int var43 = var42.field816; var43 <= var42.field812; ++var43) {
                                                        for (int var44 = var42.field796; var44 <= var42.field793; ++var44) {
                                                            class198 var45 = var7[var43][var44];
                                                            if (var45.field3632) {
                                                                var2.field3635 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field3628 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field816) {
                                                                    ++var46;
                                                                }
                                                                if (var43 < var42.field812) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field796) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field793) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field3628) == var2.field3637) {
                                                                    var2.field3635 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class182.field3345[var40++] = var42;
                                                    int var47 = class267.field4732 - var42.field816;
                                                    int var48 = var42.field812 - class267.field4732;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class9.field193 - var42.field796;
                                                    int var50 = var42.field793 - class9.field193;
                                                    if (var50 > var49) {
                                                        var42.field799 = var47 + var50;
                                                    } else {
                                                        var42.field799 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; ++var53) {
                                                    class49 var54 = class182.field3345[var53];
                                                    if (class232.field4172 != var54.field797) {
                                                        if (var54.field799 > var51) {
                                                            var51 = var54.field799;
                                                            var52 = var53;
                                                        } else if (var54.field799 == var51) {
                                                            int var55 = var54.field794 - class6.field144;
                                                            int var56 = var54.field808 - class185.field3447;
                                                            int var57 = class182.field3345[var52].field794 - class6.field144;
                                                            int var58 = class182.field3345[var52].field808 - class185.field3447;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class49 var59 = class182.field3345[var52];
                                                var59.field797 = class232.field4172;
                                                if (!class81.method518(var6, var59.field816, var59.field812, var59.field796, var59.field793, var59.field800.method62())) {
                                                    var59.field800.method48(var59.field804, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var59.field794 - class6.field144, var59.field815 - class150.field2847, var59.field808 - class185.field3447, var59.field802, var5, (class16) null);
                                                }
                                                for (int var60 = var59.field816; var60 <= var59.field812; ++var60) {
                                                    for (int var61 = var59.field796; var61 <= var59.field793; ++var61) {
                                                        class198 var62 = var7[var60][var61];
                                                        if (var62.field3628 != 0) {
                                                            class135.field2473.method1382(var62, (byte) -120);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field3645) {
                                                            class135.field2473.method1382(var62, (byte) -36);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field3635) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field3635 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field3645);
                            } while (var2.field3628 != 0);
                            if (var3 > class267.field4732 || var3 <= class256.field4558) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field3645);
                        if (var3 < class267.field4732 || var3 >= class79.field1380 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field3645);
                    if (var4 > class9.field193 || var4 <= class134.field2432) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field3645);
                if (var4 < class9.field193 || var4 >= class94.field1791 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field3645);
            var2.field3645 = false;
            --class12.field215;
            class64 var67 = var2.field3639;
            if (var67 != null && var67.field1111 != 0) {
                if (var67.field1119 != null) {
                    var67.field1119.method48(0, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var67.field1116 - class6.field144, var67.field1114 - class150.field2847 - var67.field1111, var67.field1121 - class185.field3447, var67.field1117, var5, (class16) null);
                }
                if (var67.field1120 != null) {
                    var67.field1120.method48(0, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var67.field1116 - class6.field144, var67.field1114 - class150.field2847 - var67.field1111, var67.field1121 - class185.field3447, var67.field1117, var5, (class16) null);
                }
                if (var67.field1110 != null) {
                    var67.field1110.method48(0, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var67.field1116 - class6.field144, var67.field1114 - class150.field2847 - var67.field1111, var67.field1121 - class185.field3447, var67.field1117, var5, (class16) null);
                }
            }
            if (var2.field3641 != 0) {
                class38 var68 = var2.field3636;
                if (var68 != null && !class15.method112(var6, var3, var4, var68.field595.method62())) {
                    if ((var68.field601 & var2.field3641) != 0) {
                        var68.field595.method48(0, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var68.field592 - class6.field144 + var68.field609, var68.field600 - class150.field2847, var68.field596 - class185.field3447 + var68.field603, var68.field597, var5, (class16) null);
                    } else if (var68.field601 == 256) {
                        int var69 = var68.field592 - class6.field144;
                        int var70 = var68.field600 - class150.field2847;
                        int var71 = var68.field596 - class185.field3447;
                        int var72 = var68.field610;
                        int var73;
                        if (var72 != 1 && var72 != 2) {
                            var73 = var69;
                        } else {
                            var73 = -var69;
                        }
                        int var74;
                        if (var72 != 2 && var72 != 3) {
                            var74 = var71;
                        } else {
                            var74 = -var71;
                        }
                        if (var74 >= var73) {
                            var68.field595.method48(0, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var68.field609 + var69, var70, var68.field603 + var71, var68.field597, var5, (class16) null);
                        } else if (var68.field594 != null) {
                            var68.field594.method48(0, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var69, var70, var71, var68.field597, var5, (class16) null);
                        }
                    }
                }
                class206 var75 = var2.field3640;
                if (var75 != null) {
                    if ((var75.field3778 & var2.field3641) != 0 && !class273.method1875(var6, var3, var4, var75.field3778)) {
                        var75.field3780.method48(0, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var75.field3784 - class6.field144, var75.field3783 - class150.field2847, var75.field3774 - class185.field3447, var75.field3781, var5, (class16) null);
                    }
                    if ((var75.field3788 & var2.field3641) != 0 && !class273.method1875(var6, var3, var4, var75.field3788)) {
                        var75.field3787.method48(0, class68.field1210, class242.field4324, class144.field2750, class257.field4580, var75.field3784 - class6.field144, var75.field3783 - class150.field2847, var75.field3774 - class185.field3447, var75.field3781, var5, (class16) null);
                    }
                }
            }
            if (var5 < class42.field641 - 1) {
                class198 var76 = class153.field2896[var5 + 1][var3][var4];
                if (var76 != null && var76.field3645) {
                    class135.field2473.method1382(var76, (byte) -48);
                }
            }
            if (var3 < class267.field4732) {
                class198 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field3645) {
                    class135.field2473.method1382(var77, (byte) -82);
                }
            }
            if (var4 < class9.field193) {
                class198 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field3645) {
                    class135.field2473.method1382(var78, (byte) -37);
                }
            }
            if (var3 > class267.field4732) {
                class198 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field3645) {
                    class135.field2473.method1382(var79, (byte) -103);
                }
            }
            if (var4 > class9.field193) {
                class198 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field3645) {
                    class135.field2473.method1382(var80, (byte) -71);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)V")
    private final void method1350(int arg0, int arg1) {
        if (arg1 <= -66) {
            ++field3461;
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (arg0 != 2) {
                        if (arg0 != 3) {
                            if (~arg0 != -5) {
                                if (~arg0 != -6) {
                                    if (arg0 == 6) {
                                        this.field3460 = new int[4][4];
                                        this.field3460[0][1] = 0;
                                        this.field3460[1][1] = 4096;
                                        this.field3460[0][0] = 2048;
                                        this.field3460[0][2] = 4096;
                                        this.field3460[0][3] = 0;
                                        this.field3460[1][2] = 4096;
                                        this.field3460[1][0] = 2867;
                                        this.field3460[2][1] = 4096;
                                        this.field3460[2][0] = 3276;
                                        this.field3460[2][2] = 4096;
                                        this.field3460[1][3] = 0;
                                        this.field3460[3][1] = 4096;
                                        this.field3460[2][3] = 0;
                                        this.field3460[3][0] = 4096;
                                        this.field3460[3][3] = 0;
                                        this.field3460[3][2] = 0;
                                    } else {
                                        throw new RuntimeException("Invalid gradient preset");
                                    }
                                } else {
                                    this.field3460 = new int[16][4];
                                    this.field3460[0][0] = 0;
                                    this.field3460[0][1] = 80;
                                    this.field3460[0][3] = 321;
                                    this.field3460[1][3] = 562;
                                    this.field3460[1][0] = 155;
                                    this.field3460[1][1] = 321;
                                    this.field3460[2][1] = 578;
                                    this.field3460[0][2] = 192;
                                    this.field3460[2][3] = 803;
                                    this.field3460[2][0] = 389;
                                    this.field3460[1][2] = 449;
                                    this.field3460[2][2] = 690;
                                    this.field3460[3][2] = 995;
                                    this.field3460[3][0] = 671;
                                    this.field3460[3][1] = 947;
                                    this.field3460[4][1] = 1285;
                                    this.field3460[4][2] = 1397;
                                    this.field3460[5][2] = 1429;
                                    this.field3460[5][1] = 1525;
                                    this.field3460[6][2] = 1461;
                                    this.field3460[6][1] = 1734;
                                    this.field3460[7][1] = 1413;
                                    this.field3460[8][1] = 1108;
                                    this.field3460[4][0] = 897;
                                    this.field3460[9][1] = 1766;
                                    this.field3460[7][2] = 1525;
                                    this.field3460[5][0] = 1175;
                                    this.field3460[10][1] = 2409;
                                    this.field3460[11][1] = 3116;
                                    this.field3460[3][3] = 1140;
                                    this.field3460[8][2] = 1590;
                                    this.field3460[6][0] = 1368;
                                    this.field3460[4][3] = 1509;
                                    this.field3460[5][3] = 1413;
                                    this.field3460[7][0] = 1507;
                                    this.field3460[12][1] = 3806;
                                    this.field3460[8][0] = 1736;
                                    this.field3460[13][1] = 3437;
                                    this.field3460[9][0] = 2088;
                                    this.field3460[9][2] = 2056;
                                    this.field3460[14][1] = 3116;
                                    this.field3460[15][1] = 2377;
                                    this.field3460[10][0] = 2355;
                                    this.field3460[10][2] = 2586;
                                    this.field3460[6][3] = 1333;
                                    this.field3460[7][3] = 1702;
                                    this.field3460[11][0] = 2691;
                                    this.field3460[12][0] = 3031;
                                    this.field3460[11][2] = 3148;
                                    this.field3460[12][2] = 3710;
                                    this.field3460[13][0] = 3522;
                                    this.field3460[14][0] = 3727;
                                    this.field3460[13][2] = 3421;
                                    this.field3460[8][3] = 2056;
                                    this.field3460[9][3] = 2666;
                                    this.field3460[14][2] = 3148;
                                    this.field3460[10][3] = 3276;
                                    this.field3460[15][0] = 4096;
                                    this.field3460[15][2] = 2505;
                                    this.field3460[11][3] = 3228;
                                    this.field3460[12][3] = 3196;
                                    this.field3460[13][3] = 3019;
                                    this.field3460[14][3] = 3228;
                                    this.field3460[15][3] = 2746;
                                }
                            } else {
                                this.field3460 = new int[6][4];
                                this.field3460[0][3] = 0;
                                this.field3460[0][1] = 0;
                                this.field3460[1][3] = 1493;
                                this.field3460[0][0] = 0;
                                this.field3460[0][2] = 0;
                                this.field3460[1][1] = 0;
                                this.field3460[1][0] = 1843;
                                this.field3460[1][2] = 0;
                                this.field3460[2][0] = 2457;
                                this.field3460[2][3] = 2939;
                                this.field3460[3][3] = 3565;
                                this.field3460[3][0] = 2781;
                                this.field3460[2][1] = 0;
                                this.field3460[2][2] = 0;
                                this.field3460[3][1] = 0;
                                this.field3460[4][0] = 3481;
                                this.field3460[3][2] = 1124;
                                this.field3460[4][3] = 4031;
                                this.field3460[5][0] = 4096;
                                this.field3460[5][3] = 4096;
                                this.field3460[4][2] = 3084;
                                this.field3460[5][2] = 4096;
                                this.field3460[4][1] = 546;
                                this.field3460[5][1] = 4096;
                            }
                        } else {
                            this.field3460 = new int[7][4];
                            this.field3460[0][1] = 0;
                            this.field3460[1][1] = 0;
                            this.field3460[0][0] = 0;
                            this.field3460[0][2] = 0;
                            this.field3460[2][1] = 0;
                            this.field3460[0][3] = 4096;
                            this.field3460[1][2] = 4096;
                            this.field3460[1][3] = 4096;
                            this.field3460[2][2] = 4096;
                            this.field3460[3][2] = 4096;
                            this.field3460[4][2] = 0;
                            this.field3460[1][0] = 663;
                            this.field3460[3][1] = 4096;
                            this.field3460[5][2] = 0;
                            this.field3460[6][2] = 0;
                            this.field3460[4][1] = 4096;
                            this.field3460[5][1] = 4096;
                            this.field3460[2][3] = 0;
                            this.field3460[3][3] = 0;
                            this.field3460[2][0] = 1363;
                            this.field3460[3][0] = 2048;
                            this.field3460[4][3] = 0;
                            this.field3460[6][1] = 0;
                            this.field3460[5][3] = 4096;
                            this.field3460[6][3] = 4096;
                            this.field3460[4][0] = 2727;
                            this.field3460[5][0] = 3411;
                            this.field3460[6][0] = 4096;
                        }
                    } else {
                        this.field3460 = new int[8][4];
                        this.field3460[0][0] = 0;
                        this.field3460[0][1] = 2650;
                        this.field3460[0][3] = 2361;
                        this.field3460[0][2] = 2602;
                        this.field3460[1][3] = 1558;
                        this.field3460[1][2] = 1799;
                        this.field3460[2][3] = 1413;
                        this.field3460[2][2] = 1734;
                        this.field3460[1][0] = 2867;
                        this.field3460[1][1] = 2313;
                        this.field3460[2][0] = 3072;
                        this.field3460[3][0] = 3276;
                        this.field3460[3][3] = 947;
                        this.field3460[4][0] = 3481;
                        this.field3460[2][1] = 2618;
                        this.field3460[3][1] = 2296;
                        this.field3460[4][3] = 722;
                        this.field3460[4][1] = 2072;
                        this.field3460[5][3] = 1766;
                        this.field3460[5][0] = 3686;
                        this.field3460[6][3] = 915;
                        this.field3460[5][1] = 2730;
                        this.field3460[3][2] = 1220;
                        this.field3460[6][0] = 3891;
                        this.field3460[4][2] = 963;
                        this.field3460[6][1] = 2232;
                        this.field3460[7][0] = 4096;
                        this.field3460[5][2] = 2152;
                        this.field3460[7][3] = 1140;
                        this.field3460[6][2] = 1060;
                        this.field3460[7][2] = 1413;
                        this.field3460[7][1] = 1686;
                    }
                } else {
                    this.field3460 = new int[2][4];
                    this.field3460[0][3] = 0;
                    this.field3460[0][1] = 0;
                    this.field3460[0][2] = 0;
                    this.field3460[1][2] = 4096;
                    this.field3460[0][0] = 0;
                    this.field3460[1][1] = 4096;
                    this.field3460[1][3] = 4096;
                    this.field3460[1][0] = 4096;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZI)I")
    public static final int method1351(boolean arg0, int arg1) {
        if (arg0) {
            field3472 = null;
        }
        int var2 = 0;
        if (~arg1 > -1 || arg1 >= 65536) {
            arg1 >>>= 16;
            var2 += 16;
        }
        ++field3469;
        if (~arg1 <= -257) {
            var2 += 8;
            arg1 >>>= 8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 1;
            ++var2;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IJIZ)Lli;")
    public static final class185 method1352(int arg0, long arg1, int arg2, boolean arg3) {
        ++field3474;
        if (arg2 >= 2 && arg2 <= 36) {
            int var5 = 1;
            for (long var6 = arg1 / (long) arg2; ~var6 != -1L; var6 /= (long) arg2) {
                ++var5;
            }
            int var8 = var5;
            if (arg1 < 0L || arg3) {
                var8 = var5 + 1;
            }
            byte[] var9 = new byte[var8];
            if (arg1 >= 0L) {
                if (arg3) {
                    var9[0] = 43;
                }
            } else {
                var9[0] = 45;
            }
            for (int var10 = 0; var10 < var5; ++var10) {
                int var12 = (int) (arg1 % (long) arg2);
                arg1 /= (long) arg2;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (~var12 < -10) {
                    var12 += 39;
                }
                var9[-var10 + var8 + -1] = (byte) (var12 + 48);
            }
            if (arg0 <= 60) {
                field3462 = -9;
            }
            class185 var11 = new class185();
            var11.field3411 = var9;
            var11.field3437 = var8;
            return var11;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(IB)[[I")
    public final int[][] method32(int arg0, byte arg1) {
        int[][] var3 = super.field4818.method1514(-2, arg0);
        int var4 = -17 / ((arg1 - -60) / 45);
        ++field3470;
        if (super.field4818.field3954) {
            int[] var5 = this.method1866(arg0, 0, 115);
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int[] var8 = var3[0];
            for (int var9 = 0; var9 < class246.field4385; ++var9) {
                int var10 = var5[var9] >> 4;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (~var10 < -257) {
                    var10 = 256;
                }
                int var11 = this.field3459[var10];
                var8[var9] = class220.method1526(16711680, var11) >> 12;
                var6[var9] = class220.method1526(4080, var11 >> 4);
                var7[var9] = class220.method1526(255, var11) << 4;
            }
        }
        return var3;
    }
}
