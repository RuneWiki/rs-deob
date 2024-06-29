import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class class232 extends class141 {

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Z")
    public boolean field3990;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "[Lj;")
    public class232[] field3995;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "Lhn;")
    public static class317 field3993 = new class317(100);

    @OriginalMember(owner = "client!j", name = "I", descriptor = "I")
    public static int field4010 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!j", name = "O", descriptor = "Lhi;")
    private static class82 field4016 = class95.method664((byte) -90, " ");

    @OriginalMember(owner = "client!j", name = "K", descriptor = "I")
    public static int field4012 = 0;

    @OriginalMember(owner = "client!j", name = "M", descriptor = "Lhi;")
    public static class82 field4014 = field4016;

    @OriginalMember(owner = "client!j", name = "N", descriptor = "Lhi;")
    public static class82 field4015 = class95.method664((byte) -110, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public int field4003;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!j", name = "E", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!j", name = "H", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!j", name = "J", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!j", name = "L", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!j", name = "G", descriptor = "Lbe;")
    public class19 field4008;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "Lvd;")
    public class20 field3996;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "Lqi;")
    public static class247 field4007;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIB)[[I", line = 8)
    public final int[][] method1641(int arg0, int arg1, byte arg2) {
        if (arg2 != -98) {
            return (int[][]) ((int[][]) null);
        }
        field3988++;
        if (!this.field3995[arg0].field3990) {
            return this.field3995[arg0].method146(arg1, (byte) -82);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field3995[arg0].method80(arg1, (byte) -97);
        var4[1] = var5;
        var4[0] = var5;
        var4[2] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)[[I", line = 43)
    public int[][] method146(int arg0, byte arg1) {
        field4004++;
        if (arg1 == -82) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIIILom;)V", line = 56)
    public static final void method1642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class157 arg8) {
        field3991++;
        int var9 = arg5 & 0x3;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var11 = arg8.field2704;
            var10 = arg8.field2725;
        } else {
            var10 = arg8.field2704;
            var11 = arg8.field2725;
        }
        int var12;
        int var13;
        if (arg3 + var10 > 104) {
            var12 = arg3;
            var13 = arg3 + 1;
        } else {
            var13 = (var10 + 1 >> 1) + arg3;
            var12 = (var10 >> 1) + arg3;
        }
        int var14;
        int var15;
        if (arg4 + var11 > 104) {
            var14 = arg4 + 1;
            var15 = arg4;
        } else {
            var15 = (var11 >> 1) + arg4;
            var14 = (var11 + 1 >> 1) + arg4;
        }
        int var16 = (arg3 << 7) + (var10 << 6);
        int[][] var17 = class245.field4255[arg0];
        int var18 = var17[var12][var14] + var17[var13][var15] + var17[var12][var15] + var17[var13][var14] >> 2;
        int var19 = (arg4 << 7) + (var11 << 6);
        int var20 = 0;
        if (arg0 != 0) {
            int[][] var21 = class245.field4255[0];
            var20 = var18 - (var21[var12][var14] + var21[var12][var15] + var21[var13][var14] + var21[var13][var15] >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg0 < 3) {
            var22 = class245.field4255[arg0 + 1];
        }
        class22 var23 = arg8.method1118(arg7, true, (class186) null, var18, false, arg5, var19, var22, var16, var17, (byte) -68);
        if (arg2 < 61) {
            method1650(-123, true, (Random) null);
        }
        class248.method1785(var23.field299, var16 - arg1, var20, var19 - arg6);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)I", line = 131)
    public int method1331(int arg0) {
        if (arg0 != -1) {
            this.method1641(-57, 54, (byte) 118);
        }
        field3992++;
        return -1;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I[Luf;IZ[BIIIIII)V", line = 142)
    public static final void method1643(int arg0, class189[] arg1, int arg2, boolean arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3989++;
        int var11 = -1;
        class153 var12 = new class153(arg4);
        while (true) {
            int var13 = var12.method1062(arg7 ^ 0xFFFF5FB6);
            if (var13 == 0) {
                if (arg7 != 40960) {
                    field4015 = (class82) null;
                }
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method1050(-32768);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var12.method1082(arg7 - 41071);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg2 == var18 && var17 >= arg6 && var17 < (arg6 + 8) && arg0 <= var16 && arg0 + 8 > var16) {
                    class157 var22 = class99.method682(var11, (byte) -126);
                    int var23 = class315.method2164(var22.field2725, -58, arg10, var22.field2704, var20, var17 & 0x7, var16 & 0x7) + arg8;
                    int var24 = class69.method432(var17 & 0x7, var22.field2704, arg10, 96, var22.field2725, var16 & 0x7, var20) + arg5;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class189 var25 = null;
                        if (!arg3) {
                            int var26 = arg9;
                            if ((class204.field3567[1][var23][var24] & 0x2) == 2) {
                                var26 = arg9 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg1[var26];
                            }
                        }
                        class177.method1256(arg10 + var20 & 0x3, 20192, var21, arg3, var24, arg9, var23, var11, arg9, var25, !arg3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V", line = 234)
    public final void method1644(int arg0, int arg1, int arg2) {
        int var4 = ~this.field4003 == arg0 ? arg2 : this.field4003;
        if (this.field3990) {
            this.field4008 = new class19(var4, arg2, arg1);
        } else {
            this.field3996 = new class20(var4, arg2, arg1);
        }
        field3998++;
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V", line = 249)
    public static final void method1645(int arg0) {
        class99.field1779 = null;
        class60.field949 = null;
        class253.field4354 = null;
        class55.field877 = null;
        class272.field4584 = null;
        class20.field261 = null;
        class27.field362 = null;
        class166.field2903 = null;
        class193.field3278 = null;
        class290.field4872 = null;
        class160.field2802 = null;
        class166.field2908 = null;
        class250.field4311 = null;
        field3997++;
        class197.field3377 = null;
        int var1 = 42 % ((20 - arg0) / 39);
        class138.field2364 = null;
        class21.field283 = null;
        class259.field4430 = null;
        class42.field745 = null;
        class16.field147 = null;
        class265.field4528 = null;
        class44.field762 = null;
        class84.field1512 = null;
        class68.field1061 = null;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IB)[I", line = 284)
    public int[] method80(int arg0, byte arg1) {
        field4013++;
        int var3 = 10 % ((-arg1 - 31) / 55);
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(B)V", line = 295)
    public static void method1646(byte arg0) {
        int var1 = -124 / ((8 - arg0) / 37);
        field4014 = null;
        field3993 = null;
        field4007 = null;
        field4016 = null;
        field4015 = null;
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V", line = 308)
    public void method144(int arg0) {
        field4000++;
        if (arg0 < 48) {
            method1643(51, (class189[]) null, 109, false, (byte[]) null, 97, -82, -113, -88, -15, 88);
        }
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "(I)V", line = 329)
    public void method1328(int arg0) {
        int var2 = -12 % ((arg0 - 70) / 45);
        if (this.field3990) {
            this.field4008.method130(5641);
            this.field4008 = null;
        } else {
            this.field3996.method140(-120);
            this.field3996 = null;
        }
        field3999++;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)I", line = 352)
    public static final int method1647(int arg0, int arg1) {
        field4002++;
        int var2 = arg0 * 6 - 61440;
        int var3 = (arg0 * var2 >> 12) + 40960;
        int var4 = (arg0 * arg0 >> 12) * arg0 >> 12;
        if (arg1 != -6726) {
            field3993 = (class317) null;
        }
        return var3 * var4 >> 12;
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V", line = 370)
    public static final void method1648(int arg0) {
        if (arg0 > 46) {
            field4005++;
            class159.field2751.method2168(0);
        }
    }

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(I)I", line = 394)
    public int method1633(int arg0) {
        field4006++;
        if (arg0 != 5829) {
            method1642(-44, -69, -114, 90, 71, -48, -82, 118, (class157) null);
        }
        return -1;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IBLbc;)V", line = 416)
    public void method81(int arg0, byte arg1, class153 arg2) {
        if (arg1 != -19) {
            method1642(16, 19, 115, -31, 56, -43, -112, -41, (class157) null);
        }
        field4001++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IBI)[I", line = 434)
    public final int[] method1649(int arg0, byte arg1, int arg2) {
        if (arg1 <= 45) {
            this.field3990 = true;
        }
        field4009++;
        return this.field3995[arg0].field3990 ? this.field3995[arg0].method80(arg2, (byte) 56) : this.field3995[arg0].method146(arg2, (byte) -82)[0];
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(IZ)V", line = 454)
    public class232(int arg0, boolean arg1) {
        this.field3990 = arg1;
        this.field3995 = new class232[arg0];
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IZLjava/util/Random;)I", line = 467)
    public static final int method1650(int arg0, boolean arg1, Random arg2) {
        field3994++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class231.method1639(2, arg0)) {
            return (int) ((long) arg0 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
            if (arg1) {
                field4007 = (class247) null;
            }
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class53.method376(-953132769, var4, arg0);
        }
    }
}
