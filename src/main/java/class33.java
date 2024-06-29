import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public abstract class class33 {

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "Lce;")
    private static class126 field489 = class206.method1445(-7923, " more options");

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field477 = 0;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "Lce;")
    public static class126 field493 = class206.method1445(-7923, ":");

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "Lce;")
    private static class126 field498 = class206.method1445(-7923, "flash2:");

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "Lce;")
    public static class126 field494 = field489;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "Lce;")
    public static class126 field482 = field498;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "Lce;")
    public static class126 field478 = field498;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "Lce;")
    public static class126 field485 = class206.method1445(-7923, "headicons_pk");

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "Lce;")
    public static class126 field491 = class206.method1445(-7923, "(Y<)4col>");

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public int field479;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public int field495;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "Lcc;")
    public static class313 field481;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)Z", line = 7)
    public final boolean method175(byte arg0) {
        field502++;
        if (arg0 != -98) {
            field482 = (class126) null;
        }
        return (this.field480 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V", line = 31)
    public static final void method176(byte arg0) {
        field492++;
        for (int var1 = 0; var1 < class282.field4683; var1++) {
            int var10002 = class160.field2902[var1]--;
            if (class160.field2902[var1] >= -10) {
                class271 var2 = class291.field4826[var1];
                if (var2 == null) {
                    var2 = class271.method1820(class273.field4598, class91.field1428[var1], 0);
                    if (var2 == null) {
                        continue;
                    }
                    class160.field2902[var1] += var2.method1819();
                    class291.field4826[var1] = var2;
                }
                if (class160.field2902[var1] < 0) {
                    int var9;
                    if (class318.field5445[var1] == 0) {
                        var9 = class69.field1144;
                    } else {
                        int var3 = (class318.field5445[var1] & 0xFF) * 128;
                        int var4 = (class318.field5445[var1] & 0xFF6FEB) >> 16;
                        int var5 = var4 * 128 - (class286.field4744.field2461 - 64);
                        int var6 = (class318.field5445[var1] & 0xFF3B) >> 8;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var7 = var6 * 128 + 64 - class286.field4744.field2487;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var3 < var8) {
                            class160.field2902[var1] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = (var3 - var8) * class205.field3523 / var3;
                    }
                    if (var9 > 0) {
                        class156 var10 = var2.method1818().method1140(class84.field1340);
                        class295 var11 = class295.method1974(var10, 100, var9);
                        var11.method1972(class280.field4658[var1] - 1);
                        class278.field4633.method566(var11);
                    }
                    class160.field2902[var1] = -100;
                }
            } else {
                class282.field4683--;
                for (int var12 = var1; var12 < class282.field4683; var12++) {
                    class91.field1428[var12] = class91.field1428[var12 + 1];
                    class291.field4826[var12] = class291.field4826[var12 + 1];
                    class280.field4658[var12] = class280.field4658[var12 + 1];
                    class160.field2902[var12] = class160.field2902[var12 + 1];
                    class318.field5445[var12] = class318.field5445[var12 + 1];
                }
                var1--;
            }
        }
        if (arg0 <= 11) {
            field497 = -100;
        }
        if (class51.field785 && !class98.method668((byte) 103)) {
            if (class159.field2866 != 0 && class200.field3412 != -1) {
                class257.method1743(false, class4.field28, 0, class200.field3412, class159.field2866, 2);
            }
            class51.field785 = false;
        } else if (class159.field2866 != 0 && class200.field3412 != -1 && !class98.method668((byte) 67)) {
            class103.field1645.method1238(253, 125);
            class123.field2093++;
            class103.field1645.method947(class200.field3412, (byte) 111);
            class200.field3412 = -1;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIZ)V", line = 161)
    public static final void method177(int arg0, int arg1, int arg2, boolean arg3) {
        field487++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        if (arg0 != -29991) {
            method187(100);
        }
        class192.field3283 = arg2;
        class102.field1633 = arg1;
        class142.field2572 = arg3;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIIIIIIZI)Z", line = 185)
    public static final boolean method178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        if (arg5 != -1001) {
            method178(115, 66, -94, -68, -48, 25, -18, 116, -64, -85, false, 116);
        }
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class53.field811[var12][var13] = 0;
                class244.field4127[var12][var13] = 99999999;
            }
        }
        class53.field811[arg6][arg3] = 99;
        class244.field4127[arg6][arg3] = 0;
        byte var14 = 0;
        field483++;
        class205.field3520[var14] = arg6;
        int var15 = arg6;
        int var32 = var14 + 1;
        class140.field2564[var14] = arg3;
        int var16 = arg3;
        int var17 = 0;
        boolean var18 = false;
        int[][] var19 = class94.field1475[class131.field2250].field460;
        while (var32 != var17) {
            var16 = class140.field2564[var17];
            var15 = class205.field3520[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg4 == var15 && arg8 == var16) {
                var18 = true;
                break;
            }
            if (arg0 != 0) {
                if ((arg0 < 5 || arg0 == 10) && class94.field1475[class131.field2250].method155(-126, arg1, arg4, arg8, 1, arg0 - 1, var15, var16)) {
                    var18 = true;
                    break;
                }
                if (arg0 < 10 && class94.field1475[class131.field2250].method166(1, 0, arg1, var16, arg8, arg0 - 1, var15, arg4)) {
                    var18 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg11 != 0 && class94.field1475[class131.field2250].method170(arg11, (byte) -64, 1, arg9, var16, arg8, arg7, arg4, var15)) {
                var18 = true;
                break;
            }
            int var20 = class244.field4127[var15][var16] + 1;
            if (var15 > 0 && class53.field811[var15 - 1][var16] == 0 && (var19[var15 - 1][var16] & 0x12C0108) == 0) {
                class205.field3520[var32] = var15 - 1;
                class140.field2564[var32] = var16;
                var32 = var32 + 1 & 0xFFF;
                class53.field811[var15 - 1][var16] = 2;
                class244.field4127[var15 - 1][var16] = var20;
            }
            if (var15 < 103 && class53.field811[var15 + 1][var16] == 0 && (var19[var15 + 1][var16] & 0x12C0180) == 0) {
                class205.field3520[var32] = var15 + 1;
                class140.field2564[var32] = var16;
                var32 = var32 + 1 & 0xFFF;
                class53.field811[var15 + 1][var16] = 8;
                class244.field4127[var15 + 1][var16] = var20;
            }
            if (var16 > 0 && class53.field811[var15][var16 - 1] == 0 && (var19[var15][var16 - 1] & 0x12C0102) == 0) {
                class205.field3520[var32] = var15;
                class140.field2564[var32] = var16 - 1;
                class53.field811[var15][var16 - 1] = 1;
                class244.field4127[var15][var16 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var16 < 103 && class53.field811[var15][var16 + 1] == 0 && (var19[var15][var16 + 1] & 0x12C0120) == 0) {
                class205.field3520[var32] = var15;
                class140.field2564[var32] = var16 + 1;
                var32 = var32 + 1 & 0xFFF;
                class53.field811[var15][var16 + 1] = 4;
                class244.field4127[var15][var16 + 1] = var20;
            }
            if (var15 > 0 && var16 > 0 && class53.field811[var15 - 1][var16 - 1] == 0 && (var19[var15 - 1][var16 - 1] & 0x12C010E) == 0 && (var19[var15 - 1][var16] & 0x12C0108) == 0 && (var19[var15][var16 - 1] & 0x12C0102) == 0) {
                class205.field3520[var32] = var15 - 1;
                class140.field2564[var32] = var16 - 1;
                var32 = var32 + 1 & 0xFFF;
                class53.field811[var15 - 1][var16 - 1] = 3;
                class244.field4127[var15 - 1][var16 - 1] = var20;
            }
            if (var15 < 103 && var16 > 0 && class53.field811[var15 + 1][var16 - 1] == 0 && (var19[var15 + 1][var16 - 1] & 0x12C0183) == 0 && (var19[var15 + 1][var16] & 0x12C0180) == 0 && (var19[var15][var16 - 1] & 0x12C0102) == 0) {
                class205.field3520[var32] = var15 + 1;
                class140.field2564[var32] = var16 - 1;
                var32 = var32 + 1 & 0xFFF;
                class53.field811[var15 + 1][var16 - 1] = 9;
                class244.field4127[var15 + 1][var16 - 1] = var20;
            }
            if (var15 > 0 && var16 < 103 && class53.field811[var15 - 1][var16 + 1] == 0 && (var19[var15 - 1][var16 + 1] & 0x12C0138) == 0 && (var19[var15 - 1][var16] & 0x12C0108) == 0 && (var19[var15][var16 + 1] & 0x12C0120) == 0) {
                class205.field3520[var32] = var15 - 1;
                class140.field2564[var32] = var16 + 1;
                var32 = var32 + 1 & 0xFFF;
                class53.field811[var15 - 1][var16 + 1] = 6;
                class244.field4127[var15 - 1][var16 + 1] = var20;
            }
            if (var15 < 103 && var16 < 103 && class53.field811[var15 + 1][var16 + 1] == 0 && (var19[var15 + 1][var16 + 1] & 0x12C01E0) == 0 && (var19[var15 + 1][var16] & 0x12C0180) == 0 && (var19[var15][var16 + 1] & 0x12C0120) == 0) {
                class205.field3520[var32] = var15 + 1;
                class140.field2564[var32] = var16 + 1;
                class53.field811[var15 + 1][var16 + 1] = 12;
                var32 = var32 + 1 & 0xFFF;
                class244.field4127[var15 + 1][var16 + 1] = var20;
            }
        }
        class195.field3354 = 0;
        if (!var18) {
            if (!arg10) {
                return false;
            }
            int var21 = 1000;
            byte var22 = 10;
            int var23 = 100;
            for (int var24 = arg4 - var22; var24 <= arg4 + var22; var24++) {
                for (int var25 = arg8 - var22; var25 <= arg8 + var22; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class244.field4127[var24][var25] < 100) {
                        int var26 = 0;
                        if (arg4 > var24) {
                            var26 = arg4 - var24;
                        } else if (arg4 + arg7 - 1 < var24) {
                            var26 = -arg7 - arg4 - (-1 - var24);
                        }
                        int var27 = 0;
                        if (arg8 > var25) {
                            var27 = arg8 - var25;
                        } else if ((arg8 + arg11 - 1) < var25) {
                            var27 = var25 - (arg11 + arg8 - 1);
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var21 || var21 == var28 && class244.field4127[var24][var25] < var23) {
                            var23 = class244.field4127[var24][var25];
                            var21 = var28;
                            var16 = var25;
                            var15 = var24;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg6 == var15 && arg3 == var16) {
                return false;
            }
            class195.field3354 = 1;
        }
        byte var29 = 0;
        class205.field3520[var29] = var15;
        int var33 = var29 + 1;
        class140.field2564[var29] = var16;
        int var30;
        int var31 = var30 = class53.field811[var15][var16];
        while (arg6 != var15 || arg3 != var16) {
            if (var30 != var31) {
                class205.field3520[var33] = var15;
                class140.field2564[var33++] = var16;
                var30 = var31;
            }
            if ((var31 & 0x2) != 0) {
                var15++;
            } else if ((var31 & 0x8) != 0) {
                var15--;
            }
            if ((var31 & 0x1) != 0) {
                var16++;
            } else if ((var31 & 0x4) != 0) {
                var16--;
            }
            var31 = class53.field811[var15][var16];
        }
        if (var33 > 0) {
            class97.method660((byte) 35, var33, arg2);
            return true;
        } else if (arg2 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)Z", line = 472)
    public final boolean method179(int arg0) {
        field499++;
        if (arg0 != 4) {
            method187(-30);
        }
        return (this.field480 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIILih;)V", line = 483)
    public static final void method180(int arg0, int arg1, int arg2, int arg3, class304 arg4) {
        field488++;
        if (class173.field3067 >= 400) {
            return;
        }
        if (arg4.field5059 != null) {
            arg4 = arg4.method2038((byte) -55);
        }
        if (arg0 < 123) {
            field481 = (class313) null;
        }
        if (arg4 == null || !arg4.field5055) {
            return;
        }
        class126 var5 = arg4.field5100;
        if (arg4.field5078 != 0) {
            class126 var6 = class23.field335 == 1 ? class226.field3800 : class28.field388;
            var5 = class12.method69(new class126[] { var5, class58.method399(14609, class286.field4744.field5020, arg4.field5078), class194.field3303, var6, class195.method1386((byte) 20, arg4.field5078), class15.field210 }, (byte) 121);
        }
        if (class257.field4316 == 1) {
            class304.field5095++;
            class224.method1536(class12.method69(new class126[] { class279.field4640, class219.field3680, var5 }, (byte) 121), class286.field4731, -124, arg2, (short) 50, (long) arg1, class96.field1538, arg3);
        } else if (!class313.field5371) {
            class126[] var7 = arg4.field5073;
            class286.field4748++;
            if (class91.field1447) {
                var7 = class190.method1361(var7, 0);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class23.field335 != 0 || !var7[var8].method881(class13.field175, (byte) 92))) {
                        class159.field2881++;
                        byte var9 = 0;
                        int var10 = -1;
                        if (var8 == 0) {
                            var9 = 47;
                        }
                        if (arg4.field5102 == var8) {
                            var10 = arg4.field5113;
                        }
                        if (arg4.field5061 == var8) {
                            var10 = arg4.field5053;
                        }
                        if (var8 == 1) {
                            var9 = 34;
                        }
                        if (var8 == 2) {
                            var9 = 26;
                        }
                        if (var8 == 3) {
                            var9 = 9;
                        }
                        if (var8 == 4) {
                            var9 = 40;
                        }
                        class224.method1536(class12.method69(new class126[] { class305.field5129, var5 }, (byte) 121), var7[var8], -115, arg2, var9, (long) arg1, var10, arg3);
                    }
                }
            }
            if (class23.field335 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].method881(class13.field175, (byte) 92)) {
                        short var12 = 0;
                        if (class286.field4744.field5020 < arg4.field5078) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        class177.field3118++;
                        if (var11 == 0) {
                            var13 = 47;
                        }
                        if (var11 == 1) {
                            var13 = 34;
                        }
                        if (var11 == 2) {
                            var13 = 26;
                        }
                        if (var11 == 3) {
                            var13 = 9;
                        }
                        if (var11 == 4) {
                            var13 = 40;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class224.method1536(class12.method69(new class126[] { class305.field5129, var5 }, (byte) 117), var7[var11], -114, arg2, var13, (long) arg1, arg4.field5094, arg3);
                    }
                }
            }
            class224.method1536(class12.method69(new class126[] { class305.field5129, var5 }, (byte) 124), class207.field3547, -128, arg2, (short) 1006, (long) arg1, class265.field4442, arg3);
        } else if ((class9.field105 & 0x2) == 2) {
            class305.field5122++;
            class224.method1536(class12.method69(new class126[] { class187.field3236, class219.field3680, var5 }, (byte) 120), class85.field1345, -122, arg2, (short) 59, (long) arg1, -1, arg3);
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)Z", line = 645)
    public final boolean method181(int arg0) {
        if (arg0 != 24497) {
            this.method181(112);
        }
        field496++;
        return (this.field480 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)Z", line = 656)
    public final boolean method182(int arg0) {
        if (arg0 != 0) {
            method186(98, (class112[]) null, (byte) 105);
        }
        field484++;
        return (this.field480 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lwd;II)I", line = 667)
    public static final int method183(class112 arg0, int arg1, int arg2) {
        field501++;
        if (arg1 != -9680) {
            method185(false);
        }
        if (!class294.method1951(client.method804(arg0), arg2, -18617) && arg0.field1782 == null) {
            return -1;
        } else if (arg0.field1856 == null || arg0.field1856.length <= arg2) {
            return -1;
        } else {
            return arg0.field1856[arg2];
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZB)V", line = 698)
    public static final void method184(boolean arg0, byte arg1) {
        field486++;
        for (class314 var2 = (class314) class185.field3202.method898((byte) -60); var2 != null; var2 = (class314) class185.field3202.method893((byte) 34)) {
            if (var2.field5382 != null) {
                class278.field4633.method562(var2.field5382);
                var2.field5382 = null;
            }
            if (var2.field5398 != null) {
                class278.field4633.method562(var2.field5398);
                var2.field5398 = null;
            }
            var2.method499((byte) 64);
        }
        if (arg0) {
            for (class314 var3 = (class314) class82.field1322.method898((byte) -100); var3 != null; var3 = (class314) class82.field1322.method893((byte) 55)) {
                if (var3.field5382 != null) {
                    class278.field4633.method562(var3.field5382);
                    var3.field5382 = null;
                }
                var3.method499((byte) 64);
            }
            for (class314 var4 = (class314) class199.field3389.method1630((byte) 56); var4 != null; var4 = (class314) class199.field3389.method1632(-120)) {
                if (var4.field5382 != null) {
                    class278.field4633.method562(var4.field5382);
                    var4.field5382 = null;
                }
                var4.method499((byte) 64);
            }
        }
        if (arg1 != -5) {
            field497 = -118;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V", line = 781)
    public static void method185(boolean arg0) {
        field493 = null;
        field485 = null;
        field478 = null;
        field494 = null;
        field498 = null;
        field489 = null;
        field482 = null;
        field491 = null;
        field481 = null;
        if (!arg0) {
            method176((byte) -5);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[Lwd;B)V", line = 805)
    public static final void method186(int arg0, class112[] arg1, byte arg2) {
        field500++;
        if (arg2 != 114) {
            field498 = (class126) null;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class112 var4 = arg1[var3];
            if (var4 != null && var4.field1865 == arg0 && (!var4.field1916 || !client.method814(var4))) {
                if (var4.field1780 == 0) {
                    if (!var4.field1916 && client.method814(var4) && class74.field1197 != var4) {
                        continue;
                    }
                    method186(var4.field1833, arg1, (byte) 114);
                    if (var4.field1810 != null) {
                        method186(var4.field1833, var4.field1810, (byte) 114);
                    }
                    class65 var5 = (class65) class16.field222.method1631(false, (long) var4.field1833);
                    if (var5 != null) {
                        class152.method1128(var5.field1097, arg2 - 215);
                    }
                }
                if (var4.field1780 == 6) {
                    if (var4.field1824 != -1 || var4.field1788 != -1) {
                        boolean var6 = class143.method1044((byte) -108, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field1788;
                        } else {
                            var7 = var4.field1824;
                        }
                        if (var7 != -1) {
                            class294 var8 = class110.method721(-127, var7);
                            if (var8 != null) {
                                var4.field1764 += class303.field5038;
                                while (var8.field4905[var4.field1793] < var4.field1764) {
                                    var4.field1764 -= var8.field4905[var4.field1793];
                                    var4.field1793++;
                                    if (var4.field1793 >= var8.field4890.length) {
                                        var4.field1793 -= var8.field4896;
                                        if (var4.field1793 < 0 || var8.field4890.length <= var4.field1793) {
                                            var4.field1793 = 0;
                                        }
                                    }
                                    class23.method114(var4, (byte) 94);
                                }
                            }
                        }
                    }
                    if (var4.field1797 != 0 && !var4.field1916) {
                        int var9 = var4.field1797 << 16 >> 16;
                        int var10 = var4.field1797 >> 16;
                        int var11 = class303.field5038 * var10;
                        int var12 = class303.field5038 * var9;
                        var4.field1891 = var4.field1891 + var12 & 0x7FF;
                        var4.field1843 = var4.field1843 + var11 & 0x7FF;
                        class23.method114(var4, (byte) 94);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V", line = 910)
    public static final void method187(int arg0) {
        field490++;
        if (arg0 != -24696) {
            return;
        }
        if (class110.field1723 > 0) {
            class189.method1356((byte) -103);
        } else {
            class143.field2605 = class59.field953;
            class59.field953 = null;
            class280.method1872(-102, 40);
        }
    }
}
