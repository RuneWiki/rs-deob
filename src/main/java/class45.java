import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class45 extends class673 {

    @OriginalMember(owner = "client!ll", name = "O", descriptor = "[[B")
    private byte[][] field662 = new byte[10][];

    @OriginalMember(owner = "client!ll", name = "M", descriptor = "Lvj;")
    private class26 field660 = new class26(null);

    @OriginalMember(owner = "client!ll", name = "S", descriptor = "Lvj;")
    private class26 field666 = new class26(null);

    @OriginalMember(owner = "client!ll", name = "H", descriptor = "I")
    private int field655;

    @OriginalMember(owner = "client!ll", name = "Q", descriptor = "Lwu;")
    private class557 field664;

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "Lqk;")
    public static class148 field657 = new class148(42, 8);

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!ll", name = "G", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!ll", name = "I", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!ll", name = "K", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!ll", name = "L", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!ll", name = "P", descriptor = "I")
    private int field663;

    @OriginalMember(owner = "client!ll", name = "R", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!ll", name = "N", descriptor = "[I")
    private int[] field661;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IILnt;IIIBIIIII)Z", line = 3)
    public static final boolean method304(int arg0, int arg1, class141 arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field659++;
        int var12 = arg8;
        int var13 = arg7;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg8 - var14;
        class757.field10514[var14][var15] = 99;
        int var17 = arg7 - var15;
        class757.field10517[var14][var15] = 0;
        if (arg6 <= 12) {
            return false;
        }
        byte var18 = 0;
        class52.field742[var18] = arg8;
        int var19 = 0;
        int var35 = var18 + 1;
        class501.field7003[var18] = arg7;
        int[][] var20 = arg2.field1944;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class670.field9426 = var13;
                                    class280.field3723 = var12;
                                    return false;
                                }
                                var13 = class501.field7003[var19];
                                var12 = class52.field742[var19];
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - arg2.field1940;
                                var24 = var13 - arg2.field1949;
                                if (arg11 == -4) {
                                    if (arg1 == var12 && arg0 == var13) {
                                        class280.field3723 = var12;
                                        class670.field9426 = var13;
                                        return true;
                                    }
                                } else if (arg11 == -3) {
                                    if (class275.method1669(var13, arg4, 4096, var12, arg0, arg4, arg3, arg10, arg1)) {
                                        class670.field9426 = var13;
                                        class280.field3723 = var12;
                                        return true;
                                    }
                                } else if (arg11 == -2) {
                                    if (arg2.method912(-24775, var13, arg3, arg0, arg10, arg4, var12, arg1, arg9, arg4)) {
                                        class670.field9426 = var13;
                                        class280.field3723 = var12;
                                        return true;
                                    }
                                } else if (arg11 == -1) {
                                    if (arg2.method920(arg4, var13, arg9, 0, var12, arg1, arg10, arg3, arg0)) {
                                        class280.field3723 = var12;
                                        class670.field9426 = var13;
                                        return true;
                                    }
                                } else if (arg11 == 0 || arg11 == 1 || arg11 == 2 || arg11 == 3 || arg11 == 9) {
                                    if (arg2.method910(arg11, arg4, -10800, var12, var13, arg0, arg5, arg1)) {
                                        class670.field9426 = var13;
                                        class280.field3723 = var12;
                                        return true;
                                    }
                                } else if (arg2.method924(arg1, arg0, var12, (byte) -91, arg11, var13, arg4, arg5)) {
                                    class670.field9426 = var13;
                                    class280.field3723 = var12;
                                    return true;
                                }
                                var26 = class757.field10517[var22][var21] + 1;
                                if (var22 > 0 && class757.field10514[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 - (1 - arg4)] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= (arg4 - 1)) {
                                            class52.field742[var35] = var12 - 1;
                                            class501.field7003[var35] = var13;
                                            class757.field10514[var22 - 1][var21] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class757.field10517[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if ((128 - arg4) > var22 && class757.field10514[var22 + 1][var21] == 0 && (var20[arg4 + var23][var24] & 0x60E40000) == 0 && (var20[var23 + arg4][var24 + arg4 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= arg4 - 1) {
                                            class52.field742[var35] = var12 + 1;
                                            class501.field7003[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class757.field10514[var22 + 1][var21] = 8;
                                            class757.field10517[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[arg4 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class757.field10514[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg4 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= (arg4 - 1)) {
                                            class52.field742[var35] = var12;
                                            class501.field7003[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class757.field10514[var22][var21 - 1] = 1;
                                            class757.field10517[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var21 < (128 - arg4) && class757.field10514[var22][var21 + 1] == 0 && (var20[var23][arg4 + var24] & 0x4E240000) == 0 && (var20[arg4 + var23 - 1][var24 + arg4] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (arg4 - 1 <= var30) {
                                            class52.field742[var35] = var12;
                                            class501.field7003[var35] = var13 + 1;
                                            class757.field10514[var22][var21 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class757.field10517[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg4 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class757.field10514[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg4 <= var31) {
                                            class52.field742[var35] = var12 - 1;
                                            class501.field7003[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class757.field10514[var22 - 1][var21 - 1] = 3;
                                            class757.field10517[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (128 - arg4 > var22 && var21 > 0 && class757.field10514[var22 + 1][var21 - 1] == 0 && (var20[arg4 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg4 <= var32) {
                                            class52.field742[var35] = var12 + 1;
                                            class501.field7003[var35] = var13 - 1;
                                            class757.field10514[var22 + 1][var21 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class757.field10517[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg4][var32 + var24 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && var21 < (128 - arg4) && class757.field10514[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][arg4 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg4; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][var24 + arg4] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class52.field742[var35] = var12 - 1;
                                    class501.field7003[var35] = var13 + 1;
                                    class757.field10514[var22 - 1][var21 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class757.field10517[var22 - 1][var21 + 1] = var26;
                                }
                            } while ((128 - arg4) <= var22);
                        } while (128 - arg4 <= var21);
                    } while (class757.field10514[var22 + 1][var21 + 1] != 0);
                } while ((var20[arg4 + var23][arg4 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg4; var34++) {
                    if ((var20[var23 + var34][var24 + arg4] & 0x7E240000) != 0 || (var20[arg4 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class52.field742[var35] = var12 + 1;
                class501.field7003[var35] = var13 + 1;
                class757.field10514[var22 + 1][var21 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class757.field10517[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(Z)V", line = 432)
    public final void method305(boolean arg0) {
        field654++;
        if (this.field661 == null || arg0) {
            return;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field661.length <= (this.field663 + var2)) {
                return;
            }
            if (this.field662[var2] == null && this.field664.method3321(this.field661[this.field663 + var2], (byte) 108, 0)) {
                this.field662[var2] = this.field664.method3322(this.field661[this.field663 + var2], 0, (byte) 100);
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 465)
    public static final long method306(String arg0, int arg1) {
        if (arg1 != -48) {
            return -35L;
        }
        field656++;
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 - 64);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(ILwu;I)V", line = 514)
    public class45(int arg0, class557 arg1, int arg2) {
        super(arg0);
        this.field655 = arg2;
        this.field664 = arg1;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I[B)I", line = 529)
    public final int method307(int arg0, byte[] arg1) throws IOException {
        field653++;
        if (this.field661 == null) {
            if (!this.field664.method3321(this.field655, (byte) 118, 0)) {
                return 0;
            }
            byte[] var3 = this.field664.method3322(this.field655, 0, (byte) 103);
            if (var3 == null) {
                throw new IllegalStateException("");
            }
            this.field666.field330 = 0;
            this.field666.field279 = var3;
            int var4 = var3.length >> 1;
            this.field661 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field661[var5] = this.field666.method193(arg0 + 1);
            }
        }
        if (this.field661.length <= this.field663) {
            return -1;
        }
        this.method305(false);
        this.field666.field330 = 0;
        if (arg0 != 1) {
            this.field666 = null;
        }
        this.field666.field279 = arg1;
        do {
            if (this.field666.field279.length <= this.field666.field330) {
                this.field666.field279 = null;
                return arg1.length;
            }
            if (this.field660.field279 == null) {
                if (this.field662[0] == null) {
                    this.field666.field279 = null;
                    return this.field666.field330;
                }
                this.field660.field279 = this.field662[0];
            }
            int var6 = this.field666.field279.length - this.field666.field330;
            int var7 = this.field660.field279.length - this.field660.field330;
            if (var7 > var6) {
                this.field660.method149(this.field666.field279, this.field666.field330, (byte) -77, var6);
                this.field666.field279 = null;
                return arg1.length;
            }
            this.field666.method155(this.field660.field330, var7, this.field660.field279, 88);
            this.field660.field330 = 0;
            this.field660.field279 = null;
            this.field663++;
            for (int var8 = 0; var8 < 9; var8++) {
                this.field662[var8] = this.field662[var8 + 1];
            }
            this.field662[9] = null;
        } while (this.field663 < this.field661.length);
        this.field666.field279 = null;
        return this.field666.field330;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)V", line = 622)
    public static final void method308(int arg0, int arg1) {
        field665++;
        class33.field488 = arg0;
        class93.field1268 = 2;
        long var2 = 0L;
        if (class617.field8784 == null) {
            class22.method125(1, 35);
        } else {
            class26 var4 = new class26(class724.method4058(class438.method2626(-58, class617.field8784), 1));
            long var5 = var4.method153(-123);
            class202.field2915 = var4.method153(arg1 + 37);
            class308.method1810(true, class423.method2579(var5, true), "", arg1 ^ arg1);
        }
    }

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "(I)V", line = 656)
    public static void method309(int arg0) {
        if (arg0 != -2759) {
            method306(null, -23);
        }
        field657 = null;
    }
}
