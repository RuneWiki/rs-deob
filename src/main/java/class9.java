import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class9 {

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "J")
    public long field86 = 0L;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "Le;")
    private static class191 field87 = class54.method368("Loaded interfaces", 2047);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "Le;")
    public static class191 field85 = field87;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "Lsi;")
    public static class204 field99 = null;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public int field103;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public int field104;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public int field92;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public int field96;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public int field97;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "Lbe;")
    public class16 field88;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "Lbe;")
    public class16 field94;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "Lwa;")
    public static class226 field98;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static void method66(int arg0) {
        field85 = null;
        field87 = null;
        field99 = null;
        if (arg0 == 4) {
            field98 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)I")
    public static final int method67(int arg0, int arg1, int arg2, int arg3) {
        field93++;
        if (arg1 != 1) {
            return -49;
        }
        if (arg0 > 243) {
            arg3 >>= 0x4;
        } else if (arg0 > 217) {
            arg3 >>= 0x3;
        } else if (arg0 > 192) {
            arg3 >>= 0x2;
        } else if (arg0 > 179) {
            arg3 >>= 0x1;
        }
        return (arg2 >> 2 << 10) - (-(arg3 >> 5 << 7) - (arg0 >> 1));
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    public static final void method68(byte arg0) {
        field89++;
        int var1 = class5.field48 * 128 + 64;
        int var2 = class67.field1168 * 128 + 64;
        int var3 = class222.method1546(class261.field4598, var1, var2, 247425607) - class17.field224;
        if (class267.field4719 < 100) {
            if (var2 > class244.field4353) {
                class244.field4353 += (var2 - class244.field4353) * class267.field4719 / 1000 + class101.field1617;
                if (class244.field4353 > var2) {
                    class244.field4353 = var2;
                }
            }
            if (var1 > class137.field2306) {
                class137.field2306 += (var1 - class137.field2306) * class267.field4719 / 1000 + class101.field1617;
                if (var1 < class137.field2306) {
                    class137.field2306 = var1;
                }
            }
            if (var3 > class229.field4116) {
                class229.field4116 += (var3 - class229.field4116) * class267.field4719 / 1000 + class101.field1617;
                if (var3 < class229.field4116) {
                    class229.field4116 = var3;
                }
            }
            if (class229.field4116 > var3) {
                class229.field4116 -= class101.field1617 + ((class229.field4116 - var3) * class267.field4719 / 1000);
                if (var3 > class229.field4116) {
                    class229.field4116 = var3;
                }
            }
            if (var1 < class137.field2306) {
                class137.field2306 -= class101.field1617 + ((class137.field2306 - var1) * class267.field4719 / 1000);
                if (var1 > class137.field2306) {
                    class137.field2306 = var1;
                }
            }
            if (class244.field4353 > var2) {
                class244.field4353 -= class101.field1617 + ((class244.field4353 - var2) * class267.field4719 / 1000);
                if (var2 > class244.field4353) {
                    class244.field4353 = var2;
                }
            }
        } else {
            class137.field2306 = class5.field48 * 128 + 64;
            class244.field4353 = class67.field1168 * 128 + 64;
            class229.field4116 = class222.method1546(class261.field4598, class137.field2306, class244.field4353, 247425607) - class17.field224;
        }
        int var4 = class164.field2774 * 128 + 64;
        int var5 = class97.field1550 * 128 + 64;
        int var6 = class222.method1546(class261.field4598, var5, var4, 247425607) - class56.field1033;
        int var7 = var5 - class137.field2306;
        int var8 = var6 - class229.field4116;
        int var9 = var4 - class244.field4353;
        if (arg0 >= -54) {
            field85 = null;
        }
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var7, (double) var9)) & 0x7FF;
        int var13 = var12 - class81.field1371;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (class170.field2876 < var11) {
            class170.field2876 += (var11 - class170.field2876) * class224.field3990 / 1000 + class70.field1236;
            if (class170.field2876 > var11) {
                class170.field2876 = var11;
            }
        }
        if (var11 < class170.field2876) {
            class170.field2876 -= (class170.field2876 - var11) * class224.field3990 / 1000 + class70.field1236;
            if (var11 > class170.field2876) {
                class170.field2876 = var11;
            }
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class81.field1371 += class70.field1236 + (class224.field3990 * var13 / 1000);
            class81.field1371 &= 0x7FF;
        }
        if (var13 < 0) {
            class81.field1371 -= class70.field1236 + (-var13 * class224.field3990 / 1000);
            class81.field1371 &= 0x7FF;
        }
        int var14 = var12 - class81.field1371;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class81.field1371 = var12;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZLji;)V")
    public static final void method69(boolean arg0, class225 arg1) {
        if (arg0) {
            method69(false, (class225) null);
        }
        while (true) {
            while (arg1.field3996 < arg1.field3995.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1580(-63) == 1) {
                    var3 = arg1.method1580(-28);
                    var4 = arg1.method1580(-81);
                    var2 = true;
                }
                int var5 = arg1.method1580(-79);
                int var6 = arg1.method1580(-16);
                int var7 = class161.field2728 + class76.field1319 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class54.field1009;
                if (var8 >= 0 && var7 - 63 >= 0 && class189.field3327 > var8 + 63 && var7 < class161.field2728) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && var11 < (var3 * 8 + 8) && var4 * 8 <= var12 && var12 < var4 * 8 + 8) {
                                int var13 = arg1.method1580(-19);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method1580(-15);
                                        if (class21.field301[var9][var10] == null) {
                                            class21.field301[var9][var10] = new byte[4096];
                                        }
                                        class21.field301[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method1593(true);
                                        if (class205.field3633[var9][var10] == null) {
                                            class205.field3633[var9][var10] = new short[4096];
                                        }
                                        class205.field3633[var9][var10][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = (arg1.method1580(-112) & 0xFF << 16) + (((arg1.method1580(-15) & 0xFF) << 8) + (arg1.method1580(-45) & 0xFF));
                                        if (class68.field1190[var9][var10] == null) {
                                            class68.field1190[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class102 var17 = class31.method216(var16, (byte) 121);
                                        if (var17.field1649 != null) {
                                            var17 = var17.method643(10853);
                                            if (var17 == null || var17.field1681 == -1) {
                                                continue;
                                            }
                                        }
                                        class68.field1190[var9][var10][(63 - var12 << 6) + var11] = var17.field1690 + 1;
                                        class36 var18 = new class36();
                                        var18.field665 = var8;
                                        var18.field664 = var7;
                                        var18.field666 = var17.field1681;
                                        class226.field4067.method1176(var18, (byte) 38);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg1.method1580(-31);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field3996++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field3996 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field3996 += 3;
                            }
                        }
                    }
                }
            }
            field102++;
            return;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILeg;ILcg;IILcg;)V")
    public static final void method70(int arg0, int arg1, class33 arg2, int arg3, class44 arg4, int arg5, int arg6, class44 arg7) {
        class196.field3499 = arg5;
        field101++;
        class163.field2757 = arg6;
        class210.field3730 = arg2;
        class175.field2927 = arg1;
        class234.field4173 = arg0;
        if (class28.field404 != null) {
            return;
        }
        class163.field2762 = true;
        if (class153.field2624 == null) {
            class153.field2624 = class3.method11(class262.field4648, class215.field3792, arg3 ^ 0x43, 0);
        }
        if (class4.field33 == null) {
            class4.field33 = class145.method977((byte) -57, 0, class215.field3792, class169.field2854);
        }
        if (class165.field2792 == null) {
            class165.field2792 = class145.method977((byte) -57, 0, class215.field3792, class114.field1889);
        }
        if (class104.field1718 == null) {
            class104.field1718 = class145.method977((byte) -57, 0, class215.field3792, class27.field394);
        }
        int var8 = class175.field2927 / 5 * 4;
        int var9 = class175.field2927 / 5;
        class7.method57(class196.field3499, class234.field4173, class175.field2927, class163.field2757, arg3, 168);
        class7.method39(class196.field3499, class234.field4173, var9, 23, 12425273, 9135624);
        class7.method39(class196.field3499 + var9, class234.field4173, var8, 23, 5197647, 2697513);
        arg4.method288(class87.field1426, class196.field3499 + (var9 / 2), class234.field4173 + 15, 0, -1);
        if (class104.field1718 != null) {
            class104.field1718[1].method404(class196.field3499 + var9 + 2, class234.field4173 + 1);
            arg7.method296(class243.field4328, var9 + class196.field3499 + 12, class234.field4173 + 10, 16777215, -1);
            class104.field1718[0].method404(class196.field3499 + var9 + 2, class234.field4173 + 12);
            arg7.method296(class273.field4831, class196.field3499 + var9 + 12, class234.field4173 + 21, 16777215, -1);
        }
        if (class165.field2792 != null) {
            int var10 = class196.field3499 + var9 + 140;
            if (class121.field1965[0] == 0 && class267.field4722[0] == 0) {
                class165.field2792[2].method404(var10, class234.field4173 + 4);
            } else {
                class165.field2792[0].method404(var10, class234.field4173 + 4);
            }
            if (class121.field1965[0] == 0 && class267.field4722[0] == 1) {
                class165.field2792[3].method404(var10 + 15, class234.field4173 - -4);
            } else {
                class165.field2792[1].method404(var10 + 15, class234.field4173 + 4);
            }
            arg4.method296(class263.field4664, var10 + 32, class234.field4173 - -17, 16777215, -1);
            int var11 = class196.field3499 - (-var9 - 250);
            if (class121.field1965[0] == 1 && class267.field4722[0] == 0) {
                class165.field2792[2].method404(var11, class234.field4173 + 4);
            } else {
                class165.field2792[0].method404(var11, class234.field4173 + 4);
            }
            if (class121.field1965[0] == 1 && class267.field4722[0] == 1) {
                class165.field2792[3].method404(var11 + 15, class234.field4173 - -4);
            } else {
                class165.field2792[1].method404(var11 + 15, class234.field4173 + 4);
            }
            arg4.method296(class146.field2456, var11 + 32, class234.field4173 - -17, 16777215, -1);
            int var12 = var9 + class196.field3499 + 360;
            if (class121.field1965[0] == 2 && class267.field4722[0] == 0) {
                class165.field2792[2].method404(var12, class234.field4173 + 4);
            } else {
                class165.field2792[0].method404(var12, class234.field4173 + 4);
            }
            if (class121.field1965[0] == 2 && class267.field4722[0] == 1) {
                class165.field2792[3].method404(var12 + 15, class234.field4173 - -4);
            } else {
                class165.field2792[1].method404(var12 + 15, class234.field4173 + 4);
            }
            arg4.method296(class221.field3935, var12 + 32, class234.field4173 + 17, 16777215, -1);
            int var13 = var9 + class196.field3499 + 470;
            if (class121.field1965[0] == 3 && class267.field4722[0] == 0) {
                class165.field2792[2].method404(var13, class234.field4173 + 4);
            } else {
                class165.field2792[0].method404(var13, class234.field4173 + 4);
            }
            if (class121.field1965[0] == 3 && class267.field4722[0] == 1) {
                class165.field2792[3].method404(var13 + 15, class234.field4173 + 4);
            } else {
                class165.field2792[1].method404(var13 + 15, class234.field4173 - -4);
            }
            arg4.method296(class220.field3871, var13 + 32, class234.field4173 + 17, 16777215, -1);
        }
        class7.method55(class175.field2927 - 10 - 58, class234.field4173 + 4, 58, 16, 0);
        class188.field3314 = -1;
        if (class153.field2624 == null) {
            return;
        }
        byte var14 = 19;
        byte var15 = 88;
        int var16 = (class163.field2757 - 23) / (var14 + 1);
        int var17 = class175.field2927 / (var15 + 1);
        int var18;
        int var19;
        do {
            var18 = var16;
            var19 = var17;
            if (((var17 - 1) * var16) >= class19.field265) {
                var17--;
            }
            if (((var16 - 1) * var17) >= class19.field265) {
                var16--;
            }
            if (class19.field265 <= (var16 - 1) * var17) {
                var16--;
            }
        } while (var16 != var18 || var17 != var19);
        int var20 = (class163.field2757 - var14 * var16 - 23) / (var16 + 1);
        if (var20 > 5) {
            var20 = 5;
        }
        int var21 = (class175.field2927 - (var15 * var17)) / (var17 + 1);
        int var22 = (class163.field2757 - ((var16 - 1) * var20) - var14 * var16 - 23) / 2;
        int var23 = var22 + 23;
        if (var21 > 5) {
            var21 = 5;
        }
        int var24 = 0;
        int var25 = (class175.field2927 - (var17 - 1) * var21 - (var15 * var17)) / 2;
        int var26 = var25;
        for (int var27 = 0; var27 < class19.field265; var27++) {
            boolean var28 = true;
            class262 var29 = class261.field4612[var27];
            class191 var30 = class92.method563(-71, var29.field4644);
            if (var29.field4644 == -1) {
                var28 = false;
                var30 = class92.field1501;
            } else if (var29.field4644 > 1980) {
                var30 = class159.field2696;
                var28 = false;
            }
            if (var26 <= class189.field3325 && class133.field2229 >= var23 && var26 + var15 > class189.field3325 && class133.field2229 < var14 + var23 && var28) {
                class188.field3314 = var27;
                class153.field2624[var29.field4642 ? 1 : 0].method1060(class196.field3499 + var26, class234.field4173 - -var23, 128, 16777215);
            } else {
                class153.field2624[var29.field4642 ? 1 : 0].method598(class196.field3499 + var26, class234.field4173 + var23);
            }
            if (class4.field33 != null) {
                class4.field33[var29.field4635 + (var29.field4642 ? class4.field33.length / 2 : 0)].method404(class196.field3499 + var26 + 29, class234.field4173 + var23);
            }
            arg4.method288(class92.method563(-127, var29.field4645), class196.field3499 + var26 + 15, var14 / 2 + 5 + class234.field4173 + var23, 0, -1);
            arg7.method288(var30, class196.field3499 + var26 + 60, var14 / 2 + var23 + class234.field4173 - -5, 268435455, -1);
            var23 += var14 + var20;
            var24++;
            if (var24 >= var16) {
                var23 = var22 + 23;
                var26 += var15 + var21;
                var24 = 0;
            }
        }
    }
}
