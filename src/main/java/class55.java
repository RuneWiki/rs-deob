import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class55 {

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "Lad;")
    private static class268 field732 = new class268(16);

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "I")
    public static int field738 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!tt", name = "s", descriptor = "[B")
    private static byte[] field745 = new byte[1];

    @OriginalMember(owner = "client!tt", name = "p", descriptor = "[S")
    private static short[] field742 = new short[1];

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "I")
    public static int field740 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "Lld;")
    public static class105 field736 = new class105();

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "F")
    public static float field739;

    @OriginalMember(owner = "client!tt", name = "r", descriptor = "F")
    public static float field744;

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!tt", name = "t", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!tt", name = "u", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!tt", name = "x", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!tt", name = "y", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!tt", name = "z", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!tt", name = "B", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!tt", name = "D", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!tt", name = "E", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!tt", name = "G", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!tt", name = "H", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!tt", name = "L", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!tt", name = "N", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "Lr;")
    public static class110 field733;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "Lrh;")
    public static class159 field729;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "Lwl;")
    public static class258 field728;

    @OriginalMember(owner = "client!tt", name = "F", descriptor = "Lad;")
    private static class268 field758;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "Lvj;")
    public static class281 field727;

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "Lvq;")
    private static class295 field734;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "Lii;")
    public static class358 field730;

    @OriginalMember(owner = "client!tt", name = "q", descriptor = "Lih;")
    public static class455 field743;

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "Lki;")
    public static class461 field735;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "Lfl;")
    private static class480 field731;

    @OriginalMember(owner = "client!tt", name = "A", descriptor = "[B")
    private static byte[] field753;

    @OriginalMember(owner = "client!tt", name = "J", descriptor = "[B")
    private static byte[] field762;

    @OriginalMember(owner = "client!tt", name = "K", descriptor = "[B")
    private static byte[] field763;

    @OriginalMember(owner = "client!tt", name = "M", descriptor = "[B")
    private static byte[] field765;

    @OriginalMember(owner = "client!tt", name = "O", descriptor = "[B")
    private static byte[] field767;

    @OriginalMember(owner = "client!tt", name = "C", descriptor = "[I")
    private static int[] field755;

    @OriginalMember(owner = "client!tt", name = "v", descriptor = "[S")
    private static short[] field748;

    @OriginalMember(owner = "client!tt", name = "w", descriptor = "[S")
    private static short[] field749;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "[[[B")
    public static byte[][][] field741;

    @OriginalMember(owner = "client!tt", name = "I", descriptor = "[[[Lcm;")
    private static class472[][][] field761;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lwm;IIIIIII[S[BZ)V", line = 3)
    private static final void method384(class364 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method2003(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field755[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method2003(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class437.method2575(var12, arg1, arg2, arg0, field741, var11, (byte) -86, arg5, field737, arg3, arg7 >> 6 & 0x3, field755[arg6], arg4);
                }
            }
        }
        if (arg8 == null) {
            return;
        }
        int var14;
        if (arg3 == 1) {
            var14 = arg1;
        } else {
            var14 = arg1 + arg3 - 1;
        }
        int var15;
        if (arg4 == 1) {
            var15 = arg2;
        } else {
            var15 = arg2 + arg4 - 1;
        }
        for (int var16 = 0; var16 < arg8.length; var16++) {
            int var17 = arg9[var16] & 0x3F;
            if (var17 == 0 || var17 == 2 || var17 == 3 || var17 == 9) {
                class88 var18 = field729.method935(arg8[var16] & 0xFFFF, (byte) -121);
                if (var18.field1235 == -1) {
                    int var19 = -3355444;
                    if (var18.field1265 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method2052(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method2073(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method2052(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method2073(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method2052(arg1, arg2, arg4, -1, 0);
                            arg0.method2073(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method2052(var14, arg2, arg4, -1, 0);
                            arg0.method2073(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method2052(var14, arg2, arg4, -1, 0);
                            arg0.method2073(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method2052(arg1, arg2, arg4, -1, 0);
                            arg0.method2073(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method2073(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method2073(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method2073(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method2073(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method2073(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method2073(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lwm;Lbt;IIII[I[I)V", line = 167)
    private static final void method385(class364 arg0, class32 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method201((byte) -123);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method201((byte) -118);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field763[field756 * arg5 + arg4] = (byte) var11;
                    field767[field756 * arg5 + arg4] = 0;
                } else {
                    field767[field756 * arg5 + arg4] = (byte) var11;
                    field765[field756 * arg5 + arg4] = 0;
                    field763[field756 * arg5 + arg4] = arg1.method211(29861);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method201((byte) -117);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method201((byte) -116);
                var18 = arg1.method201((byte) -123);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method201((byte) -126);
            }
            if (var15 == 0) {
                field763[field756 * arg5 + arg4] = (byte) var16;
                field767[field756 * arg5 + arg4] = (byte) var17;
                field765[field756 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field749[field756 * arg5 + arg4] = (short) (arg1.method215((byte) 105) + 1);
                    field762[field756 * arg5 + arg4] = arg1.method211(29861);
                } else if (var19 > 1) {
                    field749[field756 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method215((byte) 103);
                        var21[var22] = arg1.method211(29861);
                    }
                    field758.method1525((byte) 19, new class57(var20, var21), (long) (arg4 << 16 | arg5));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method215((byte) 106);
                        var24[var25] = arg1.method211(29861);
                    }
                }
                if (field761[var15 - 1][arg2 - (field757 >> 6)][arg3 - (field754 >> 6)] == null) {
                    field761[var15 - 1][arg2 - (field757 >> 6)][arg3 - (field754 >> 6)] = new class472();
                }
                class211 var26 = new class211(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field761[var15 - 1][arg2 - (field757 >> 6)][arg3 - (field754 >> 6)].method2767(-1830, var26);
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "()V", line = 305)
    public static final void method386() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field743.field6168; var1++) {
            boolean var2 = field727.method1587(field743.field6167[var1] >> 28 & 0x3, 32765, var0, field743.field6167[var1] >> 14 & 0x3FFF, field743.field6167[var1] & 0x3FFF);
            if (var2) {
                class205 var3 = new class205(field743.field6169[var1]);
                var3.field2777 = var0[1] - field757;
                var3.field2780 = var0[2] - field754;
                field736.method641(var3, (byte) -93);
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lr;Lfl;Lvq;Lrh;Lki;Lii;Lwl;)V", line = 327)
    public static final void method387(class110 arg0, class480 arg1, class295 arg2, class159 arg3, class461 arg4, class358 arg5, class258 arg6) {
        field733 = arg0;
        field731 = arg1;
        field734 = arg2;
        field729 = arg3;
        field735 = arg4;
        field730 = arg5;
        field728 = arg6;
        field732.method1519(-16576);
        int var7 = field733.method688((byte) 87, "details");
        int[] var8 = field733.method690(var7, true);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class281 var10 = class209.method1192(var8[var9], var7, (byte) -26, field733);
            field732.method1525((byte) 19, var10, (long) var10.field3774);
        }
        class301.method1686((byte) 72, false, true);
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "()V", line = 354)
    public static final void method388() {
        field763 = null;
        field753 = null;
        field748 = null;
        field767 = null;
        field765 = null;
        field749 = null;
        field762 = null;
        field758 = null;
        field761 = null;
        field755 = null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)Lvj;", line = 366)
    public static final class281 method389(int arg0) {
        return (class281) field732.method1528((long) arg0, 71);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lci;III)I", line = 370)
    private static final int method390(class287 arg0, int arg1, int arg2, int arg3) {
        class91 var4 = field731.method2801(-95, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field1328;
        if (var5 >= 0 && arg0.method1621(18318, var5).field302) {
            var5 = -1;
        }
        int var9;
        if (var4.field1322 >= 0) {
            int var6 = var4.field1322;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class461.field6250[class146.method868(class231.method1290(96, 2, var8), -2045205981) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class461.field6250[class146.method868(class231.method1290(96, 2, arg0.method1621(18318, var5).field295), -2045205981) & 0xFFFF] | 0xFF000000;
        } else if (var4.field1337 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field1337;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class461.field6250[class146.method868(class231.method1290(96, 2, var12), -2045205981) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)Lwc;", line = 427)
    public static final class46 method391(int arg0, int arg1) {
        class46 var2 = new class46();
        for (class281 var3 = (class281) field732.method1518((byte) -109); var3 != null; var3 = (class281) field732.method1517(-30942)) {
            if (var3.field3786 && var3.method1589(arg1, (byte) -61, arg0)) {
                var2.method336(-111, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lwm;IIII)Lld;", line = 444)
    private static final class105 method392(class364 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class205 var5 = (class205) field736.method652((byte) 37); var5 != null; var5 = (class205) field736.method653(52)) {
            method404(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field736;
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V", line = 454)
    public static final void method393(int arg0) {
        field727 = (class281) field732.method1528((long) arg0, 84);
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "()V", line = 457)
    public static final void method394() {
        field763 = new byte[field756 * field750];
        field767 = new byte[field756 * field750];
        field765 = new byte[field756 * field750];
        field749 = new short[field756 * field750];
        field762 = new byte[field756 * field750];
        field758 = new class268(1024);
        field761 = new class472[3][field756 >> 6][field750 >> 6];
        field755 = new int[field731.field6638 + 1];
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "([B[B[SII)V", line = 468)
    private static final void method395(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field750];
        int[] var6 = new int[field750];
        int[] var7 = new int[field750];
        int[] var8 = new int[field750];
        int[] var9 = new int[field750];
        for (int var10 = -5; var10 < field756; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field750; var13++) {
                int var10002;
                if (var11 < field756) {
                    int var28 = arg0[field756 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class410 var29 = field734.method1658(1, var28 - 1);
                        var5[var13] += var29.field5620;
                        var6[var13] += var29.field5621;
                        var7[var13] += var29.field5624;
                        var8[var13] += var29.field5613;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field756 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class410 var31 = field734.method1658(1, var30 - 1);
                        var5[var13] -= var31.field5620;
                        var6[var13] -= var31.field5621;
                        var7[var13] -= var31.field5624;
                        var8[var13] -= var31.field5613;
                        var10002 = var9[var13]--;
                    }
                }
            }
            if (var10 >= 0) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                for (int var19 = -5; var19 < field750; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field750) {
                        var14 += var5[var20];
                        var15 += var6[var20];
                        var16 += var7[var20];
                        var17 += var8[var20];
                        var18 += var9[var20];
                    }
                    int var21 = var19 - 5;
                    if (var21 >= 0) {
                        var14 -= var5[var21];
                        var15 -= var6[var21];
                        var16 -= var7[var21];
                        var17 -= var8[var21];
                        var18 -= var9[var21];
                    }
                    if (var19 >= 0 && var18 > 0) {
                        if ((arg0[field756 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field756 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class461.method2712(-86, var14 * 256 / var17, var16 / var18, var15 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field756 * var19 + var10;
                            int var27 = class461.field6250[class146.method868(class259.method1458(var25, 96, -9055), -2045205981) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lwm;II)V", line = 612)
    public static final void method396(class364 arg0, int arg1, int arg2) {
        class32 var3 = new class32(field733.method697(field727.field3783, "area", -1));
        int var4 = var3.method201((byte) -113);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method201((byte) -110);
        }
        int var7 = var3.method201((byte) -128);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method201((byte) -106);
        }
        while (true) {
            while (var3.field456 < var3.field472.length) {
                if (var3.method201((byte) -109) == 0) {
                    int var22 = var3.method201((byte) -105);
                    int var23 = var3.method201((byte) -115);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field757;
                            int var27 = var23 * 64 + var25 - field754;
                            method385(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method201((byte) -123);
                    int var29 = var3.method201((byte) -112);
                    int var30 = var3.method201((byte) -128);
                    int var31 = var3.method201((byte) -127);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field757;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field754;
                            method385(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field753 = new byte[field756 * field750];
            field748 = new short[field756 * field750];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field756 * field750];
                for (int var13 = 0; var13 < field761[var11].length; var13++) {
                    for (int var19 = 0; var19 < field761[var11][0].length; var19++) {
                        class472 var20 = field761[var11][var13][var19];
                        if (var20 != null) {
                            for (class211 var21 = (class211) var20.method2764((byte) -39); var21 != null; var21 = (class211) var20.method2769(true)) {
                                var12[(var19 * 64 + var21.field2842) * field756 + var13 * 64 + var21.field2845] = (byte) var21.field2843;
                            }
                        }
                    }
                }
                method395(var12, field753, field748, arg1, arg2);
                for (int var14 = 0; var14 < field761[var11].length; var14++) {
                    for (int var15 = 0; var15 < field761[var11][0].length; var15++) {
                        class472 var16 = field761[var11][var14][var15];
                        if (var16 != null) {
                            for (class211 var17 = (class211) var16.method2764((byte) -63); var17 != null; var17 = (class211) var16.method2769(true)) {
                                int var18 = (var15 * 64 + var17.field2842) * field756 + var14 * 64 + var17.field2845;
                                var17.field2843 = (field753[var18] & 0xFF) << 16 | field748[var18] & 0xFFFF;
                                if (var17.field2843 != 0) {
                                    var17.field2843 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method395(field763, field753, field748, arg1, arg2);
            field763 = null;
            method406();
            return;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lwm;)V", line = 791)
    public static final void method397(class364 arg0) {
        int var1 = field752 - field759;
        int var2 = field764 - field760;
        int var3 = (field747 - field746 << 16) / var1;
        int var4 = (field766 - field751 << 16) / var2;
        method400(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "()V", line = 801)
    public static void method398() {
        field731 = null;
        field734 = null;
        field729 = null;
        field735 = null;
        field730 = null;
        field728 = null;
        field727 = null;
        field733 = null;
        field732 = null;
        field741 = null;
        field742 = null;
        field745 = null;
        field743 = null;
        field736 = null;
        field755 = null;
        field763 = null;
        field753 = null;
        field748 = null;
        field767 = null;
        field765 = null;
        field749 = null;
        field762 = null;
        field758 = null;
        field761 = null;
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(Lwm;)Lld;", line = 828)
    public static final class105 method399(class364 arg0) {
        int var1 = field752 - field759;
        int var2 = field764 - field760;
        int var3 = (field747 - field746 << 16) / var1;
        int var4 = (field766 - field751 << 16) / var2;
        return method392(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(Lwm;IIII)V", line = 842)
    private static final void method400(class364 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field752 - field759;
        int var6 = field764 - field760;
        if (field752 < field756) {
            var5++;
        }
        if (field764 < field750) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field746;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field746;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field759 + var7;
                if (var52 >= 0 && var52 < field756) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field766 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field766 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field760 + var53;
                            int var58 = field756 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field750) {
                                var59 = (field753[var58] & 0xFF) << 16 | field748[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field767[var58] & 0xFF;
                                var61 = field749[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field727.field3768 != -1) {
                                    var62 = field727.field3768 | 0xFF000000;
                                } else if ((field764 + var53 & 0x4) == (field759 + var7 & 0x4)) {
                                    var62 = field755[field731.field6641 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method2003(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method384(arg0, var49, var54, var51, var56, var59, var60, field765[var58], (short[]) null, (byte[]) null, true);
                            } else if (var61 == 65535) {
                                class57 var63 = (class57) field758.method1528((long) (var52 << 16 | var57), 63);
                                if (var63 != null) {
                                    method384(arg0, var49, var54, var51, var56, var59, var60, field765[var58], var63.field781, var63.field780, true);
                                }
                            } else {
                                field742[0] = (short) (var61 - 1);
                                field745[0] = field762[var58];
                                method384(arg0, var49, var54, var51, var56, var59, var60, field765[var58], field742, field745, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field766 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field766 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field727.field3768 != -1) {
                            var68 = field727.field3768 | 0xFF000000;
                        } else if ((field764 + var64 & 0x4) == (field759 + var7 & 0x4)) {
                            var68 = field755[field731.field6641 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method2003(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field746;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field746;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field759 + var8;
                if (var41 >= 0 && var41 < field756) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field766 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field766 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field760 + var42;
                            if (var46 >= 0 && var46 < field750) {
                                int var47 = field749[field756 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method401(arg0, var38, var43, var40, var45, (short[]) null, (byte[]) null);
                                } else if (var47 == 65535) {
                                    class57 var48 = (class57) field758.method1528((long) (var41 << 16 | var46), 76);
                                    if (var48 != null) {
                                        method401(arg0, var38, var43, var40, var45, var48.field781, var48.field780);
                                    }
                                } else {
                                    field742[0] = (short) (var47 - 1);
                                    field745[0] = field762[field756 * var46 + var41];
                                    method401(arg0, var38, var43, var40, var45, field742, field745);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field759 >> 6;
        int var10 = field760 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field752 >> 6;
        int var12 = field764 >> 6;
        if (var11 >= field761[0].length) {
            var11 = field761[0].length - 1;
        }
        if (var12 >= field761[0][0].length) {
            var12 = field761[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class472 var28 = field761[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field757 >> 6) + var14) * 64;
                        int var30 = ((field754 >> 6) + var27) * 64;
                        for (class211 var31 = (class211) var28.method2764((byte) -70); var31 != null; var31 = (class211) var28.method2769(true)) {
                            int var32 = var31.field2845 + var29 - field757 - field759;
                            int var33 = var31.field2842 + var30 - field754 - field760;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field746;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field746;
                            int var36 = field766 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field766 - (arg2 * var33 + arg4 >> 16);
                            method384(arg0, var34, var36, var35 - var34, var37 - var36, var31.field2843, var31.field2847 & 0xFF, var31.field2848, var31.field2846, var31.field2844, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class472 var17 = field761[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field757 >> 6) + var15) * 64;
                        int var19 = ((field754 >> 6) + var16) * 64;
                        for (class211 var20 = (class211) var17.method2764((byte) -39); var20 != null; var20 = (class211) var17.method2769(true)) {
                            int var21 = var20.field2845 + var18 - field757 - field759;
                            int var22 = var20.field2842 + var19 - field754 - field760;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field746;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field746;
                            int var25 = field766 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field766 - (arg2 * var22 + arg4 >> 16);
                            method401(arg0, var23, var25, var24 - var23, var26 - var25, var20.field2846, var20.field2844);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lwm;IIII[S[B)V", line = 1184)
    private static final void method401(class364 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class88 var8 = field729.method935(arg5[var7] & 0xFFFF, (byte) 89);
            int var9 = var8.field1235;
            if (var9 != -1) {
                class351 var10 = field730.method2198(34, var9);
                class139 var11 = var10.method2175(var8.field1297 ? var8.field1277 : false, false, var8.field1284 ? arg6[var7] >> 6 & 0x3 : 0, arg0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method777() >> 2;
                    int var13 = arg4 * var11.method774() >> 2;
                    if (var10.field4874) {
                        int var14 = var8.field1305;
                        int var15 = var8.field1249;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field4875 == 0) {
                            var11.method838(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method773(arg1, arg2 + arg4 - var13, var12, var13, 1, var10.field4875 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(II)Lvj;", line = 1244)
    public static final class281 method402(int arg0, int arg1) {
        for (class281 var2 = (class281) field732.method1518((byte) -76); var2 != null; var2 = (class281) field732.method1517(-30942)) {
            if (var2.field3786 && var2.method1589(arg1, (byte) -61, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lci;II)V", line = 1258)
    public static final void method403(class287 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field731.field6638; var3++) {
            field755[var3 + 1] = method390(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lwm;Ljg;IIII)V", line = 1272)
    private static final void method404(class364 arg0, class205 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field2776 = ((arg1.field2777 - field759) * arg2 + arg4 >> 16) + field746;
        arg1.field2772 = field766 - ((arg1.field2780 - field760) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIIIII)V", line = 1276)
    public static final void method405(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field759 = arg0 - field757;
        field764 = arg1 - field754;
        field752 = arg2 - field757;
        field760 = arg3 - field754;
        field746 = arg4;
        field751 = arg5;
        field747 = arg6;
        field766 = arg7;
    }

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "()V", line = 1288)
    private static final void method406() {
        for (int var0 = 0; var0 < field756; var0++) {
            for (int var11 = 0; var11 < field750; var11++) {
                int var12 = field749[field756 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class57 var13 = (class57) field758.method1528((long) (var0 << 16 | var11), 74);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field781.length; var14++) {
                                class88 var15 = field729.method935(var13.field781[var14] & 0xFFFF, (byte) 107);
                                int var16 = var15.field1220;
                                if (var15.field1269 != null) {
                                    class88 var17 = var15.method574(77, field728);
                                    if (var17 != null) {
                                        var16 = var17.field1220;
                                    }
                                }
                                if (var16 != -1) {
                                    class205 var18 = new class205(var16);
                                    var18.field2777 = var0;
                                    var18.field2780 = var11;
                                    field736.method641(var18, (byte) -93);
                                }
                            }
                        }
                    } else {
                        class88 var19 = field729.method935(var12 - 1, (byte) 103);
                        int var20 = var19.field1220;
                        if (var19.field1269 != null) {
                            class88 var21 = var19.method574(62, field728);
                            if (var21 != null) {
                                var20 = var21.field1220;
                            }
                        }
                        if (var20 != -1) {
                            class205 var22 = new class205(var20);
                            var22.field2777 = var0;
                            var22.field2780 = var11;
                            field736.method641(var22, (byte) -93);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field761[0].length; var2++) {
                for (int var3 = 0; var3 < field761[0][0].length; var3++) {
                    class472 var4 = field761[var1][var2][var3];
                    if (var4 != null) {
                        for (class211 var5 = (class211) var4.method2764((byte) 114); var5 != null; var5 = (class211) var4.method2769(true)) {
                            if (var5.field2846 != null) {
                                for (int var6 = 0; var6 < var5.field2846.length; var6++) {
                                    class88 var7 = field729.method935(var5.field2846[var6] & 0xFFFF, (byte) 98);
                                    int var8 = var7.field1220;
                                    if (var7.field1269 != null) {
                                        class88 var9 = var7.method574(-122, field728);
                                        if (var9 != null) {
                                            var8 = var9.field1220;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class205 var10 = new class205(var8);
                                        var10.field2777 = ((field757 >> 6) + var2) * 64 + var5.field2845 - field757;
                                        var10.field2780 = ((field754 >> 6) + var3) * 64 + var5.field2842 - field754;
                                        field736.method641(var10, (byte) -93);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
