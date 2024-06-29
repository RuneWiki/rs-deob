import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class157 extends class61 {

    @OriginalMember(owner = "client!sm", name = "T", descriptor = "Z")
    public boolean field2504 = true;

    @OriginalMember(owner = "client!sm", name = "E", descriptor = "Z")
    public static boolean field2489 = false;

    @OriginalMember(owner = "client!sm", name = "bb", descriptor = "I")
    public static int field2512 = 0;

    @OriginalMember(owner = "client!sm", name = "Z", descriptor = "Lwm;")
    public static class152 field2510 = method1048("Konfig geladen)3", 113);

    @OriginalMember(owner = "client!sm", name = "U", descriptor = "I")
    public static int field2505 = 0;

    @OriginalMember(owner = "client!sm", name = "ab", descriptor = "Lwm;")
    public static class152 field2511 = method1048("weiss:", 122);

    @OriginalMember(owner = "client!sm", name = "F", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!sm", name = "G", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!sm", name = "H", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!sm", name = "K", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!sm", name = "N", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!sm", name = "O", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!sm", name = "Q", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!sm", name = "R", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!sm", name = "S", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!sm", name = "V", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!sm", name = "W", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!sm", name = "X", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!sm", name = "Y", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!sm", name = "cb", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!sm", name = "db", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!sm", name = "J", descriptor = "Ldc;")
    public static class109 field2494;

    @OriginalMember(owner = "client!sm", name = "P", descriptor = "Lah;")
    public static class205 field2500;

    @OriginalMember(owner = "client!sm", name = "D", descriptor = "[I")
    private int[] field2488;

    @OriginalMember(owner = "client!sm", name = "M", descriptor = "[I")
    public int[] field2497;

    @OriginalMember(owner = "client!sm", name = "I", descriptor = "[Lwm;")
    private class152[] field2493;

    @OriginalMember(owner = "client!sm", name = "L", descriptor = "[[I")
    private int[][] field2496;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLhi;[I)V", line = 7)
    public final void method1043(byte arg0, class291 arg1, int[] arg2) {
        field2490++;
        if (this.field2488 == null) {
            return;
        }
        int var4 = -113 / ((38 - arg0) / 62);
        for (int var5 = 0; var5 < this.field2488.length && var5 < arg2.length; var5++) {
            int var6 = class72.field1050[this.method1057((byte) -126, var5)];
            if (var6 > 0) {
                arg1.method1966(var6, (long) arg2[var5], 2);
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "(I)I", line = 34)
    public final int method1044(int arg0) {
        if (arg0 != -1) {
            this.field2497 = (int[]) null;
        }
        field2491++;
        return this.field2488 == null ? 0 : this.field2488.length;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IILhi;)V", line = 49)
    private final void method1045(int arg0, int arg1, class291 arg2) {
        if (arg1 != 30358) {
            field2512 = 124;
        }
        if (arg0 == 1) {
            this.field2493 = arg2.method2017(true).method993(60, (byte) -6);
        } else if (arg0 == 2) {
            int var4 = arg2.method2011(arg1 ^ 0xFFFF891E);
            this.field2497 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2497[var5] = arg2.method2021((byte) 74);
            }
        } else if (arg0 == 3) {
            int var6 = arg2.method2011(-39);
            this.field2496 = new int[var6][];
            this.field2488 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method2021((byte) 74);
                this.field2488[var7] = var8;
                this.field2496[var7] = new int[class101.field1470[var8]];
                for (int var9 = 0; var9 < class101.field1470[var8]; var9++) {
                    this.field2496[var7][var9] = arg2.method2021((byte) 74);
                }
            }
        } else if (arg0 == 4) {
            this.field2504 = false;
        }
        field2508++;
    }

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "(I)V", line = 116)
    public final void method1046(int arg0) {
        if (this.field2497 != null) {
            for (int var2 = 0; var2 < this.field2497.length; var2++) {
                this.field2497[var2] = class72.method493(this.field2497[var2], 32768);
            }
        }
        field2499++;
        int var3 = 66 / ((19 - arg0) / 48);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZII)I", line = 135)
    public final int method1047(boolean arg0, int arg1, int arg2) {
        field2492++;
        if (this.field2488 == null || arg1 < 0 || arg1 > this.field2488.length) {
            return -1;
        } else {
            if (!arg0) {
                field2512 = -95;
            }
            return this.field2496[arg1] == null || arg2 < 0 || this.field2496[arg1].length < arg2 ? -1 : this.field2496[arg1][arg2];
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/lang/String;I)Lwm;", line = 157)
    public static final class152 method1048(String arg0, int arg1) {
        byte[] var2 = arg0.getBytes();
        field2509++;
        int var3 = var2.length;
        class152 var4 = new class152();
        var4.field2389 = new byte[var3];
        if (arg1 < 91) {
            field2512 = 76;
        }
        int var5 = 0;
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field2389[var4.field2371++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field2389[var4.field2371++] = (byte) var6;
            }
        }
        var4.method1024(0);
        return var4.method1012(false);
    }

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "(I)Lwm;", line = 204)
    public final class152 method1049(int arg0) {
        field2501++;
        class152 var2 = class97.method652(80, (byte) -54);
        if (this.field2493 == null) {
            return class225.field3659;
        }
        var2.method1008(-9, this.field2493[arg0]);
        for (int var3 = 1; var3 < this.field2493.length; var3++) {
            var2.method1008(-9, class179.field2857);
            var2.method1008(arg0 ^ 0xFFFFFFF7, this.field2493[var3]);
        }
        return var2.method1024(0);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLhi;)V", line = 240)
    public final void method1050(byte arg0, class291 arg1) {
        while (true) {
            int var3 = arg1.method2011(-117);
            if (var3 == 0) {
                if (arg0 > -99) {
                    field2512 = 66;
                }
                field2507++;
                return;
            }
            this.method1045(var3, 30358, arg1);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 273)
    public static final void method1051(Component arg0, int arg1) {
        field2502++;
        Method var2 = class151.field2366;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        if (arg1 == 1) {
            arg0.addKeyListener(class236.field3866);
            arg0.addFocusListener(class236.field3866);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lgi;IIIIIIIZ)V", line = 302)
    public static final void method1052(class215 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class27.field460;
        int var11;
        int var12 = var11 = (arg7 << 7) - class239.field3916;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class65.field984[arg1][arg6][arg7] - class3.field54;
        int var18 = class65.field984[arg1][arg6 + 1][arg7] - class3.field54;
        int var19 = class65.field984[arg1][arg6 + 1][arg7 + 1] - class3.field54;
        int var20 = class65.field984[arg1][arg6][arg7 + 1] - class3.field54;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class181.field2883;
        int var46 = (var24 << 9) / var25 + class181.field2880;
        int var47 = (var27 << 9) / var31 + class181.field2883;
        int var48 = (var30 << 9) / var31 + class181.field2880;
        int var49 = (var33 << 9) / var37 + class181.field2883;
        int var50 = (var36 << 9) / var37 + class181.field2880;
        int var51 = (var39 << 9) / var43 + class181.field2883;
        int var52 = (var42 << 9) / var43 + class181.field2880;
        class181.field2893 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class240.field3937 && class199.method1327(class181.field2883 + class108.field1548, class302.field5207 + class181.field2880, var50, var52, var48, var49, var51, var47)) {
                class233.field3815 = arg6;
                class258.field4422 = arg7;
            }
            if (!class217.field3516 && !arg8) {
                class181.field2876 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class181.field2888 || var51 > class181.field2888 || var47 > class181.field2888) {
                    class181.field2876 = true;
                }
                if (arg0.field3492 == -1) {
                    if (arg0.field3500 != 12345678) {
                        class181.method1198(var50, var52, var48, var49, var51, var47, arg0.field3500, arg0.field3503, arg0.field3491);
                    }
                } else if (!class92.field1307) {
                    int var53 = class181.field2878.method1773(arg0.field3492, (byte) 78);
                    class181.method1198(var50, var52, var48, var49, var51, var47, class94.method624(var53, arg0.field3500), class94.method624(var53, arg0.field3503), class94.method624(var53, arg0.field3491));
                } else if (arg0.field3502) {
                    class181.method1185(var50, var52, var48, var49, var51, var47, arg0.field3500, arg0.field3503, arg0.field3491, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3492);
                } else {
                    class181.method1185(var50, var52, var48, var49, var51, var47, arg0.field3500, arg0.field3503, arg0.field3491, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field3492);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class240.field3937 && class199.method1327(class181.field2883 + class108.field1548, class302.field5207 + class181.field2880, var46, var48, var52, var45, var47, var51)) {
            class233.field3815 = arg6;
            class258.field4422 = arg7;
        }
        if (class217.field3516 || arg8) {
            return;
        }
        class181.field2876 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class181.field2888 || var47 > class181.field2888 || var51 > class181.field2888) {
            class181.field2876 = true;
        }
        if (arg0.field3492 == -1) {
            if (arg0.field3494 != 12345678) {
                class181.method1198(var46, var48, var52, var45, var47, var51, arg0.field3494, arg0.field3491, arg0.field3503);
            }
        } else if (class92.field1307) {
            class181.method1185(var46, var48, var52, var45, var47, var51, arg0.field3494, arg0.field3491, arg0.field3503, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3492);
        } else {
            int var54 = class181.field2878.method1773(arg0.field3492, (byte) 78);
            class181.method1198(var46, var48, var52, var45, var47, var51, class94.method624(var54, arg0.field3494), class94.method624(var54, arg0.field3491), class94.method624(var54, arg0.field3503));
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZIIIIIIIIII)Z", line = 467)
    public static final boolean method1053(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class310.field5306[var12][var13] = 0;
                class269.field4533[var12][var13] = 99999999;
            }
        }
        if (arg8 != 1) {
            return true;
        }
        class310.field5306[arg5][arg2] = 99;
        int var14 = arg5;
        class269.field4533[arg5][arg2] = 0;
        byte var15 = 0;
        field2506++;
        class160.field2552[var15] = arg5;
        int var32 = var15 + 1;
        class258.field4430[var15] = arg2;
        int var16 = arg2;
        int var17 = 0;
        boolean var18 = false;
        int[][] var19 = class135.field2076[class23.field400].field384;
        while (var32 != var17) {
            var14 = class160.field2552[var17];
            var16 = class258.field4430[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg6 == var14 && arg7 == var16) {
                var18 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && class135.field2076[class23.field400].method182(arg6, arg11 - 1, var16, arg7, 1, var14, arg8 ^ 0xFFFFCBB6, arg4)) {
                    var18 = true;
                    break;
                }
                if (arg11 < 10 && class135.field2076[class23.field400].method174(1, arg6, arg7, var14, arg11 - 1, -1, var16, arg4)) {
                    var18 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg10 != 0 && class135.field2076[class23.field400].method176(arg7, var14, arg6, 1, (byte) 119, var16, arg3, arg9, arg10)) {
                var18 = true;
                break;
            }
            int var20 = class269.field4533[var14][var16] + 1;
            if (var14 > 0 && class310.field5306[var14 - 1][var16] == 0 && (var19[var14 - 1][var16] & 0x12C0108) == 0) {
                class160.field2552[var32] = var14 - 1;
                class258.field4430[var32] = var16;
                var32 = var32 + 1 & 0xFFF;
                class310.field5306[var14 - 1][var16] = 2;
                class269.field4533[var14 - 1][var16] = var20;
            }
            if (var14 < 103 && class310.field5306[var14 + 1][var16] == 0 && (var19[var14 + 1][var16] & 0x12C0180) == 0) {
                class160.field2552[var32] = var14 + 1;
                class258.field4430[var32] = var16;
                var32 = var32 + 1 & 0xFFF;
                class310.field5306[var14 + 1][var16] = 8;
                class269.field4533[var14 + 1][var16] = var20;
            }
            if (var16 > 0 && class310.field5306[var14][var16 - 1] == 0 && (var19[var14][var16 - 1] & 0x12C0102) == 0) {
                class160.field2552[var32] = var14;
                class258.field4430[var32] = var16 - 1;
                class310.field5306[var14][var16 - 1] = 1;
                var32 = var32 + 1 & 0xFFF;
                class269.field4533[var14][var16 - 1] = var20;
            }
            if (var16 < 103 && class310.field5306[var14][var16 + 1] == 0 && (var19[var14][var16 + 1] & 0x12C0120) == 0) {
                class160.field2552[var32] = var14;
                class258.field4430[var32] = var16 + 1;
                class310.field5306[var14][var16 + 1] = 4;
                class269.field4533[var14][var16 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 > 0 && var16 > 0 && class310.field5306[var14 - 1][var16 - 1] == 0 && (var19[var14 - 1][var16 - 1] & 0x12C010E) == 0 && (var19[var14 - 1][var16] & 0x12C0108) == 0 && (var19[var14][var16 - 1] & 0x12C0102) == 0) {
                class160.field2552[var32] = var14 - 1;
                class258.field4430[var32] = var16 - 1;
                var32 = var32 + 1 & 0xFFF;
                class310.field5306[var14 - 1][var16 - 1] = 3;
                class269.field4533[var14 - 1][var16 - 1] = var20;
            }
            if (var14 < 103 && var16 > 0 && class310.field5306[var14 + 1][var16 - 1] == 0 && (var19[var14 + 1][var16 - 1] & 0x12C0183) == 0 && (var19[var14 + 1][var16] & 0x12C0180) == 0 && (var19[var14][var16 - 1] & 0x12C0102) == 0) {
                class160.field2552[var32] = var14 + 1;
                class258.field4430[var32] = var16 - 1;
                class310.field5306[var14 + 1][var16 - 1] = 9;
                class269.field4533[var14 + 1][var16 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 > 0 && var16 < 103 && class310.field5306[var14 - 1][var16 + 1] == 0 && (var19[var14 - 1][var16 + 1] & 0x12C0138) == 0 && (var19[var14 - 1][var16] & 0x12C0108) == 0 && (var19[var14][var16 + 1] & 0x12C0120) == 0) {
                class160.field2552[var32] = var14 - 1;
                class258.field4430[var32] = var16 + 1;
                class310.field5306[var14 - 1][var16 + 1] = 6;
                var32 = var32 + 1 & 0xFFF;
                class269.field4533[var14 - 1][var16 + 1] = var20;
            }
            if (var14 < 103 && var16 < 103 && class310.field5306[var14 + 1][var16 + 1] == 0 && (var19[var14 + 1][var16 + 1] & 0x12C01E0) == 0 && (var19[var14 + 1][var16] & 0x12C0180) == 0 && (var19[var14][var16 + 1] & 0x12C0120) == 0) {
                class160.field2552[var32] = var14 + 1;
                class258.field4430[var32] = var16 + 1;
                class310.field5306[var14 + 1][var16 + 1] = 12;
                class269.field4533[var14 + 1][var16 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
        }
        class226.field3671 = 0;
        if (!var18) {
            if (!arg1) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg6 - var23; var24 <= (arg6 + var23); var24++) {
                for (int var25 = arg7 - var23; var25 <= (arg7 + var23); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class269.field4533[var24][var25] < 100) {
                        int var26 = 0;
                        if (var24 < arg6) {
                            var26 = arg6 - var24;
                        } else if (var24 > (arg3 + arg6 - 1)) {
                            var26 = 1 - arg3 - (arg6 - var24);
                        }
                        int var27 = 0;
                        if (var25 < arg7) {
                            var27 = arg7 - var25;
                        } else if ((arg7 + arg10 - 1) < var25) {
                            var27 = var25 - (arg7 + arg10 - 1);
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var21 > var28 || var21 == var28 && var22 > class269.field4533[var24][var25]) {
                            var14 = var24;
                            var16 = var25;
                            var22 = class269.field4533[var24][var25];
                            var21 = var28;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg5 == var14 && arg2 == var16) {
                return false;
            }
            class226.field3671 = 1;
        }
        byte var29 = 0;
        class160.field2552[var29] = var14;
        int var33 = var29 + 1;
        class258.field4430[var29] = var16;
        int var30;
        int var31 = var30 = class310.field5306[var14][var16];
        while (arg5 != var14 || arg2 != var16) {
            if (var30 != var31) {
                var30 = var31;
                class160.field2552[var33] = var14;
                class258.field4430[var33++] = var16;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            if ((var31 & 0x1) != 0) {
                var16++;
            } else if ((var31 & 0x4) != 0) {
                var16--;
            }
            var31 = class310.field5306[var14][var16];
        }
        if (var33 > 0) {
            class170.method1118(arg0, (byte) 124, var33);
            return true;
        } else if (arg0 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIBLdd;)V", line = 757)
    public static final void method1054(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class249 arg6) {
        if (arg5 != 119) {
            field2512 = -29;
        }
        class232.method1595(arg3, arg6.field4231, arg4, arg2, arg6.field4162, (byte) 74, arg0, arg1);
        field2503++;
    }

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "(I)V", line = 768)
    public static void method1055(int arg0) {
        field2500 = null;
        field2494 = null;
        if (arg0 != 29893) {
            method1053(100, false, -43, -44, 80, -62, -128, -101, -28, -126, -101, 127);
        }
        field2511 = null;
        field2510 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lhi;I)Lwm;", line = 783)
    public final class152 method1056(class291 arg0, int arg1) {
        field2495++;
        class152 var3 = class97.method652(80, (byte) -22);
        if (arg1 != 0) {
            this.method1046(-97);
        }
        if (this.field2488 != null) {
            for (int var4 = 0; var4 < this.field2488.length; var4++) {
                var3.method1008(arg1 ^ 0xFFFFFFF7, this.field2493[var4]);
                var3.method1008(-9, class92.method602(arg0.method1972((byte) 100, class294.field5022[this.field2488[var4]]), this.field2488[var4], -102, this.field2496[var4]));
            }
        }
        var3.method1008(arg1 - 9, this.field2493[this.field2493.length + -1]);
        return var3.method1024(0);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BI)I", line = 810)
    public final int method1057(byte arg0, int arg1) {
        field2513++;
        if (arg0 >= -117) {
            return -77;
        } else if (this.field2488 == null || arg1 < 0 || arg1 > this.field2488.length) {
            return -1;
        } else {
            return this.field2488[arg1];
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)V", line = 828)
    public static final void method1058(int arg0, int arg1, int arg2) {
        field2498++;
        int var3 = 85 / ((arg1 + 85) / 38);
        if (class197.method1315(71, arg2)) {
            class44.method302(class215.field3501[arg2], (byte) 100, arg0);
        }
    }
}
