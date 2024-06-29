import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class270 {

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "[I")
    private int[] field3989 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "[I")
    private int[] field3982 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "Z")
    public boolean field3990;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "Lkb;")
    private class485 field3999;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "I")
    public int field3993;

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "Lqd;")
    private class312 field3991;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public int field3975;

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "I")
    public int field4002;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "[[[B")
    private byte[][][] field3978;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "[[[B")
    private byte[][][] field3988;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "[[[B")
    private byte[][][] field3983;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "[[[I")
    public int[][][] field3996;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "[[[B")
    public byte[][][] field3973;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "[[[B")
    private byte[][][] field3987;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "Lgk;")
    public static class331 field3979 = new class331("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "I")
    public static int field3997 = 1;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "F")
    public static float field3986;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "Lro;")
    public static class2 field3995;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "[[[B")
    public byte[][][] field3981;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "[[[J")
    public static long[][][] field3980;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIII)V")
    public final void method1730(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = 0; var6 < this.field4002; var6++) {
            this.method1731(true, arg4, var6, arg3, arg2, arg0);
        }
        field3976++;
        if (arg1 != 228) {
            this.method1734(84, -38, -54, null, -91, null, -103);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZIIIII)V")
    public final void method1731(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var7 = arg4; var7 < arg1 + arg4; var7++) {
            for (int var10 = arg5; var10 < (arg3 + arg5); var10++) {
                if (var10 >= 0 && var10 < this.field3993 && var7 >= 0 && this.field3975 > var7) {
                    this.field3996[arg2][var10][var7] = arg2 <= 0 ? 0 : this.field3996[arg2 - 1][var10][var7] - 240;
                }
            }
        }
        field4003++;
        if (arg5 > 0 && arg5 < this.field3993) {
            for (int var8 = arg4 + 1; var8 < arg1 + arg4; var8++) {
                if (var8 >= 0 && var8 < this.field3975) {
                    this.field3996[arg2][arg5][var8] = this.field3996[arg2][arg5 - 1][var8];
                }
            }
        }
        if (!arg0) {
            this.field3990 = false;
        }
        if (arg4 > 0 && arg4 < this.field3975) {
            for (int var9 = arg5 + 1; var9 < arg3 + arg5; var9++) {
                if (var9 >= 0 && var9 < this.field3993) {
                    this.field3996[arg2][var9][arg4] = this.field3996[arg2][var9][arg4 - 1];
                }
            }
        }
        if (arg5 < 0 || arg4 < 0 || arg5 >= this.field3993 || this.field3975 <= arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 <= 0 || this.field3996[arg2][arg5 - 1][arg4] == 0) {
                if (arg4 > 0 && this.field3996[arg2][arg5][arg4 - 1] != 0) {
                    this.field3996[arg2][arg5][arg4] = this.field3996[arg2][arg5][arg4 - 1];
                    return;
                }
                if (arg5 > 0 && arg4 > 0 && this.field3996[arg2][arg5 - 1][arg4 - 1] != 0) {
                    this.field3996[arg2][arg5][arg4] = this.field3996[arg2][arg5 - 1][arg4 - 1];
                    return;
                }
                return;
            }
            this.field3996[arg2][arg5][arg4] = this.field3996[arg2][arg5 - 1][arg4];
        } else if (arg5 <= 0 || this.field3996[arg2 - 1][arg5 - 1][arg4] == this.field3996[arg2][arg5 - 1][arg4]) {
            if (arg4 > 0 && this.field3996[arg2 - 1][arg5][arg4 - 1] != this.field3996[arg2][arg5][arg4 - 1]) {
                this.field3996[arg2][arg5][arg4] = this.field3996[arg2][arg5][arg4 - 1];
                return;
            }
            if (arg5 > 0 && arg4 > 0 && this.field3996[arg2 - 1][arg5 - 1][arg4 - 1] != this.field3996[arg2][arg5 - 1][arg4 - 1]) {
                this.field3996[arg2][arg5][arg4] = this.field3996[arg2][arg5 - 1][arg4 - 1];
                return;
            }
        } else {
            this.field3996[arg2][arg5][arg4] = this.field3996[arg2][arg5 - 1][arg4];
            return;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLfs;Lfs;)I")
    public static final int method1732(byte arg0, class387 arg1, class387 arg2) {
        field3985++;
        int var3 = 0;
        if (arg2.method2384(-1, class65.field814)) {
            var3++;
        }
        if (arg2.method2384(-1, class398.field5888)) {
            var3++;
        }
        if (arg0 > -42) {
            return 1;
        }
        if (arg2.method2384(-1, class486.field7139)) {
            var3++;
        }
        if (arg1.method2384(-1, class65.field814)) {
            var3++;
        }
        if (arg1.method2384(-1, class398.field5888)) {
            var3++;
        }
        if (arg1.method2384(-1, class486.field7139)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I[[II)V")
    public final void method1733(int arg0, int[][] arg1, int arg2) {
        field3998++;
        int[][] var4 = this.field3996[arg2];
        if (arg0 != -1) {
            this.method1731(false, -67, 54, -32, -82, 123);
        }
        for (int var5 = 0; var5 < (this.field3993 + 1); var5++) {
            for (int var6 = 0; var6 < (this.field3975 + 1); var6++) {
                var4[var5][var6] += arg1[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIILiv;I[Lsd;I)V")
    public final void method1734(int arg0, int arg1, int arg2, class65 arg3, int arg4, class62[] arg5, int arg6) {
        field3972++;
        if (arg0 > -75) {
            this.field3981 = null;
        }
        if (!this.field3990) {
            for (int var8 = 0; var8 < 4; var8++) {
                class62 var9 = arg5[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg4 + var10;
                        int var13 = arg6 + var11;
                        if (var12 >= 0 && var12 < this.field3993 && var13 >= 0 && this.field3975 > var13) {
                            var9.method551(var12, var13, 99);
                        }
                    }
                }
            }
        }
        int var14 = arg1 + arg4;
        int var15 = arg2 + arg6;
        for (int var16 = 0; var16 < this.field4002; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method1737(arg6 + var18, var15 - -var18, var17 + arg4, var14 + var17, 0, false, var16, 0, 0, 19108, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([[[IB[Lsd;Lya;)V")
    public final void method1735(int[][][] arg0, byte arg1, class62[] arg2, class38 arg3) {
        if (!this.field3990) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field3993; var6++) {
                    for (int var7 = 0; var7 < this.field3975; var7++) {
                        if ((class238.field3497[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class238.field3497[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method565(var7, 2097152, var6);
                            }
                        }
                    }
                }
            }
        }
        field3992++;
        if (arg1 > -16) {
            this.method1733(46, null, 98);
        }
        for (int var9 = 0; var9 < this.field4002; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field3990) {
                if (class521.field7663) {
                    var11 |= 0x8;
                }
                if (class288.field4150) {
                    var10 |= 0x2;
                }
                if (class120.field1672 != 0) {
                    if (var9 == 0 | class200.field2936) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class288.field4150) {
                var11 |= 0x7;
            }
            if (!class195.field2847) {
                var11 |= 0x20;
            }
            int[][] var12 = arg0 == null || var9 >= arg0.length ? this.field3996[var9] : arg0[var9];
            class525.method3115(var9, arg3.method374(this.field3993, this.field3975, this.field3996[var9], var12, 128, var10, var11));
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILta;Lta;Lya;)V")
    public final void method1736(int arg0, class142 arg1, class142 arg2, class38 arg3) {
        field3974++;
        if (class377.field5587 == null || class377.field5587.length != this.field3975) {
            class350.field4847 = new int[this.field3975];
            class65.field776 = new int[this.field3975];
            class325.field4560 = new int[this.field3975];
            class272.field4027 = new int[this.field3975];
            class377.field5587 = new int[this.field3975];
        }
        int[][] var5 = new int[this.field3993][this.field3975];
        for (int var6 = 0; var6 < this.field4002; var6++) {
            for (int var8 = 0; var8 < this.field3975; var8++) {
                class377.field5587[var8] = 0;
                class350.field4847[var8] = 0;
                class65.field776[var8] = 0;
                class272.field4027[var8] = 0;
                class325.field4560[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field3993; var9++) {
                for (int var10 = 0; var10 < this.field3975; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field3993 > var19) {
                        int var20 = this.field3987[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class165 var21 = this.field3991.method1942(-18411, var20 - 1);
                            class377.field5587[var10] += var21.field2342;
                            class350.field4847[var10] += var21.field2334;
                            class65.field776[var10] += var21.field2336;
                            class272.field4027[var10] += var21.field2335;
                            var10002 = class325.field4560[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field3987[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class165 var24 = this.field3991.method1942(arg0 - 39890, var23 - 1);
                            class377.field5587[var10] -= var24.field2342;
                            class350.field4847[var10] -= var24.field2334;
                            class65.field776[var10] -= var24.field2336;
                            class272.field4027[var10] -= var24.field2335;
                            var10002 = class325.field4560[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field3975; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field3975) {
                            var12 += class350.field4847[var17];
                            var15 += class325.field4560[var17];
                            var11 += class377.field5587[var17];
                            var14 += class272.field4027[var17];
                            var13 += class65.field776[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var14 -= class272.field4027[var18];
                            var11 -= class377.field5587[var18];
                            var15 -= class325.field4560[var18];
                            var12 -= class350.field4847[var18];
                            var13 -= class65.field776[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class117.method925(var12 / var15, var11 * 256 / var14, arg0 - 21477, var13 / var15);
                        }
                    }
                }
            }
            if (class510.field7523) {
                this.method1739(var6, var6 == 0 ? arg1 : null, var5, arg3, (byte) -73, class131.field1899[var6], var6 == 0 ? arg2 : null);
            } else {
                this.method1738(arg3, var6 == 0 ? arg2 : null, var6 == 0 ? arg1 : null, var5, 8228, var6, class131.field1899[var6]);
            }
            this.field3987[var6] = null;
            this.field3983[var6] = null;
            this.field3978[var6] = null;
            this.field3988[var6] = null;
        }
        if (!this.field3990) {
            if (class120.field1672 != 0) {
                class348.method2101();
            }
            if (class288.field4150) {
                class56.method526();
            }
        }
        if (arg0 == 21479) {
            for (int var7 = 0; var7 < this.field4002; var7++) {
                class131.field1899[var7].method419();
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIZIIIILiv;)V")
    private final void method1737(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
        if (arg9 != 19108) {
            this.field3991 = null;
        }
        field3984++;
        if (arg4 == 1) {
            arg7 = 1;
        } else if (arg4 == 2) {
            arg8 = 1;
            arg7 = 1;
        } else if (arg4 == 3) {
            arg8 = 1;
        }
        if (arg2 < 0 || arg2 >= this.field3993 || arg0 < 0 || arg0 >= this.field3975) {
            while (true) {
                int var14 = arg10.method577(255);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg10.method577(255);
                    return;
                }
                if (var14 <= 49) {
                    arg10.method577(255);
                }
            }
        }
        if (!this.field3990 && !arg5) {
            class238.field3497[arg6][arg2][arg0] = 0;
        }
        while (true) {
            int var12 = arg10.method577(255);
            if (var12 == 0) {
                if (this.field3990) {
                    this.field3996[0][arg2 + arg8][arg0 + arg7] = 0;
                    return;
                } else if (arg6 == 0) {
                    this.field3996[0][arg2 + arg8][arg0 + arg7] = -class353.method2139((byte) -84, arg3 + 932731, arg1 + 556238) * 8 << 0;
                    return;
                } else {
                    this.field3996[arg6][arg2 + arg8][arg0 + arg7] = this.field3996[arg6 - 1][arg2 + arg8][arg0 + arg7] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg10.method577(255);
                if (!this.field3990) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg6 != 0) {
                        this.field3996[arg6][arg2 + arg8][arg0 + arg7] = this.field3996[arg6 - 1][arg2 + arg8][arg0 + arg7] - (var13 * 8 << 0);
                        return;
                    }
                    this.field3996[0][arg2 + arg8][arg0 + arg7] = -var13 * 8 << 0;
                    return;
                }
                this.field3996[0][arg2 + arg8][arg0 + arg7] = var13 * 8 << 0;
                return;
            }
            if (var12 <= 49) {
                if (arg5) {
                    arg10.method577(arg9 ^ 0x4A5B);
                } else {
                    this.field3983[arg6][arg2][arg0] = arg10.method629(false);
                    this.field3978[arg6][arg2][arg0] = (byte) ((var12 - 2) / 4);
                    this.field3988[arg6][arg2][arg0] = (byte) class345.method2089(3, var12 + arg4 - 2);
                }
            } else if (var12 <= 81) {
                if (!this.field3990 && !arg5) {
                    class238.field3497[arg6][arg2][arg0] = (byte) (var12 - 49);
                }
            } else if (!arg5) {
                this.field3987[arg6][arg2][arg0] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lya;Lta;Lta;[[IIILta;)V")
    private final void method1738(class38 arg0, class142 arg1, class142 arg2, int[][] arg3, int arg4, int arg5, class142 arg6) {
        field3971++;
        if (arg4 != 8228) {
            field3986 = 0.76392615F;
        }
        for (int var8 = 0; var8 < this.field3993; var8++) {
            for (int var9 = 0; var9 < this.field3975; var9++) {
                if (class380.field5612 == -1 || class389.method2392(var8, class380.field5612, (byte) 56, arg5, var9)) {
                    byte var10 = this.field3978[arg5][var8][var9];
                    byte var11 = this.field3988[arg5][var8][var9];
                    int var12 = this.field3983[arg5][var8][var9] & 0xFF;
                    int var13 = this.field3987[arg5][var8][var9] & 0xFF;
                    class345 var14 = var12 == 0 ? null : this.field3999.method2918(4, var12 - 1);
                    class165 var15 = var13 == 0 ? null : this.field3991.method1942(arg4 ^ 0xFFFF9831, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class365.field5291[var10];
                        var16 = var15 == null ? 0 : class430.field6326[var10];
                    } else if (var14 != null) {
                        var17 = class365.field5291[var10];
                    } else if (var15 != null) {
                        var16 = class365.field5291[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field4791 == -1 && var14.field4778 == -1 && var14.field4786 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg0.method298() ? var14.field4786 : var14.field4783;
                            if (class138.field1974) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field4782;
                                if (var14.field4791 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field4791;
                                }
                                if (var14.field4778 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field4778;
                                    var24 = true;
                                }
                                var19++;
                            }
                            if (!this.field3990 && arg5 == 0) {
                                class356.method2150(var8, var9, var14.field4784, var14.field4793 * 8, var14.field4794);
                            }
                        }
                        if (!var24) {
                            var21 = null;
                        }
                        if (var15 == null) {
                            for (int var28 = 0; var28 < var16; var28++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var29 = var15.field2339;
                            if (class138.field1974) {
                                var29 = -1;
                            }
                            for (int var30 = 0; var30 < var16; var30++) {
                                var22[var19] = var29;
                                var23[var19] = var15.field2349;
                                var20[var19] = arg3[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field3982.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg2 == null ? null : new int[var31];
                        int[] var35 = arg2 == null && arg1 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field3982[var36];
                            int var46 = this.field3989[var36];
                            if (var11 == 0) {
                                var32[var36] = var45;
                                var33[var36] = var46;
                            } else if (var11 == 1) {
                                var32[var36] = var46;
                                var33[var36] = 128 - var45;
                            } else if (var11 == 2) {
                                var32[var36] = 128 - var45;
                                var33[var36] = 128 - var46;
                            } else if (var11 == 3) {
                                var32[var36] = 128 - var46;
                                var33[var36] = var45;
                            }
                            if (var34 != null && class220.field3158[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg2.method426(var49, var50) - arg6.method426(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg2 != null && !class220.field3158[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg6.method426(var51, var52) - arg2.method426(var51, var52);
                                } else if (arg1 != null && !class315.field4485[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg1.method426(var53, var54) - arg6.method426(var53, var54);
                                }
                            }
                        }
                        int var37 = arg6.method430(var8, var9);
                        int var38 = arg6.method430(var8 + 1, var9);
                        int var39 = arg6.method430(var8 + 1, var9 + 1);
                        int var40 = arg6.method430(var8, var9 + 1);
                        if (arg5 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field4797) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field3973[arg5][var8][var9] = (byte) class244.method1606(this.field3973[arg5][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field3990) {
                            var42 = class121.method965(var8, var9);
                            var43 = class101.method866(var8, var9);
                            var44 = class220.method1501(var8, var9);
                        }
                        arg6.method422(var8, var9, var32, var34, var33, var35, class448.field6611[var10], class460.field6747[var10], class394.field5790[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class429.method2610(arg5, var8, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILta;[[ILya;BLta;Lta;)V")
    private final void method1739(int arg0, class142 arg1, int[][] arg2, class38 arg3, byte arg4, class142 arg5, class142 arg6) {
        field4004++;
        byte[][] var8 = this.field3978[arg0];
        if (arg4 > -54) {
            this.method1735(null, (byte) 24, null, null);
        }
        byte[][] var9 = this.field3988[arg0];
        byte[][] var10 = this.field3987[arg0];
        byte[][] var11 = this.field3983[arg0];
        for (int var12 = 0; var12 < this.field3993; var12++) {
            int var13 = (this.field3993 - 1) > var12 ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field3975; var14++) {
                int var15 = var14 >= this.field3975 - 1 ? var14 : var14 + 1;
                if (class380.field5612 == -1 || class389.method2392(var12, class380.field5612, (byte) 56, arg0, var14)) {
                    boolean var16 = false;
                    boolean var17 = false;
                    boolean[] var18 = new boolean[4];
                    int var19 = var8[var12][var14];
                    int var20 = var9[var12][var14];
                    int var21 = var11[var12][var14] & 0xFF;
                    int var22 = var10[var12][var14] & 0xFF;
                    int var23 = var10[var12][var15] & 0xFF;
                    int var24 = var10[var13][var15] & 0xFF;
                    int var25 = var10[var13][var14] & 0xFF;
                    if (var21 != 0 || var22 != 0) {
                        class345 var26 = var21 == 0 ? null : this.field3999.method2918(4, var21 - 1);
                        class165 var27 = var22 == 0 ? null : this.field3991.method1942(-18411, var22 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class345 var28 = var26;
                        if (var26 != null) {
                            if (var26.field4791 == -1 && var26.field4778 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field4788;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field3993 > var12 && this.field3975 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var33 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var34 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            byte var35 = 0;
                            int var36 = var35 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var33++;
                                var34++;
                            } else {
                                var34--;
                                var33--;
                            }
                            if (var10[var13][var14] == var22) {
                                var33++;
                                var32++;
                            } else {
                                var33--;
                                var32--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var32++;
                            } else {
                                var36--;
                                var32--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var34++;
                                var36++;
                            } else {
                                var36--;
                                var34--;
                            }
                            int var37 = var34 - var32;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var33 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg5.method430(var12, var14) - arg5.method430(var13, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg5.method430(var13, var14) - arg5.method430(var12, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 > var37 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class109.field1551[var39] = -1;
                            class473.field6978[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field4788 ? class435.field6377[var19] : class60.field696[var19];
                        this.method1742(this.field3975, 22245, var11, var19, var14, var20, var18, this.field3993, var12, var26, var8, var27, var9, arg3);
                        boolean var41 = var26 != null && var26.field4791 != var26.field4778;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class109.field1551[var42] >= 0 && class397.field5827[var42] != class212.field3056[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class519.method3086(var18[1], class345.method2089(class473.field6978[2], class473.field6978[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class519.method3086(var18[3], class345.method2089(class473.field6978[6], class473.field6978[0]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class519.method3086(var18[0], class345.method2089(class473.field6978[0], class473.field6978[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class519.method3086(var18[2], class345.method2089(class473.field6978[4], class473.field6978[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var18[0] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 0;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var20 = 3;
                                var18[0] = var18[1] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var20 = 2;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[1] = var18[2] = false;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var20 = 1;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[2] = var18[3] = false;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int[] var46;
                        int[] var47;
                        int var48;
                        int var49;
                        if (var43) {
                            var49 = var27 == null ? 0 : class430.field6326[var19];
                            var45 = class448.field6611[var19];
                            var47 = class460.field6747[var19];
                            var48 = var26 == null ? 0 : class365.field5291[var19];
                            var46 = class394.field5790[var19];
                        } else if (var17) {
                            var48 = var26 == null ? 0 : class365.field5261[var19];
                            var45 = class504.field7478[var19];
                            var47 = class386.field5679[var19];
                            var46 = class220.field3161[var19];
                            var49 = var27 == null ? 0 : class209.field3038[var19];
                            var44 = class208.field3016[var19];
                        } else {
                            var44 = class503.field7466[var19];
                            var45 = class89.field1220[var19];
                            var46 = class203.field2945[var19];
                            var47 = class319.field4519[var19];
                            var48 = var26 == null ? 0 : class376.field5560[var19];
                            var49 = var27 == null ? 0 : class348.field4833[var19];
                        }
                        int var50 = var48 + var49;
                        if (var50 <= 0) {
                            class429.method2610(arg0, var12, var14);
                        } else {
                            if (var18[0]) {
                                var50++;
                            }
                            if (var18[2]) {
                                var50++;
                            }
                            if (var18[1]) {
                                var50++;
                            }
                            if (var18[3]) {
                                var50++;
                            }
                            int var51 = 0;
                            int var52 = 0;
                            int var53 = var50 * 3;
                            int[] var54 = var41 ? new int[var53] : null;
                            int[] var55 = new int[var53];
                            int[] var56 = new int[var53];
                            int[] var57 = new int[var53];
                            int[] var58 = new int[var53];
                            int[] var59 = new int[var53];
                            int[] var60 = arg1 == null ? null : new int[var53];
                            int[] var61 = arg1 == null && arg6 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field4791;
                                var63 = arg3.method298() ? var26.field4786 : var26.field4783;
                                var64 = var26.field4782;
                                int var65 = class87.method772(var26, arg3, (byte) -31);
                                for (int var66 = 0; var66 < var48; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class233.field3426[0] = var45[var51];
                                        class233.field3426[1] = 1;
                                        class233.field3426[2] = var46[var51];
                                        class233.field3426[3] = 1;
                                        class233.field3426[4] = var47[var51];
                                        var68 = 6;
                                        class233.field3426[5] = var46[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class233.field3426[0] = var45[var51];
                                        class233.field3426[1] = 5;
                                        class233.field3426[2] = var46[var51];
                                        class233.field3426[3] = 5;
                                        class233.field3426[4] = var47[var51];
                                        class233.field3426[5] = var46[var51];
                                        var68 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class233.field3426[0] = var45[var51];
                                        class233.field3426[1] = 3;
                                        class233.field3426[2] = var46[var51];
                                        class233.field3426[3] = 3;
                                        class233.field3426[4] = var47[var51];
                                        var68 = 6;
                                        class233.field3426[5] = var46[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class233.field3426[0] = var45[var51];
                                        class233.field3426[1] = 7;
                                        class233.field3426[2] = var46[var51];
                                        class233.field3426[3] = 7;
                                        class233.field3426[4] = var47[var51];
                                        class233.field3426[5] = var46[var51];
                                        var68 = 6;
                                    } else {
                                        class233.field3426[0] = var45[var51];
                                        class233.field3426[1] = var47[var51];
                                        class233.field3426[2] = var46[var51];
                                        var68 = 3;
                                    }
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class233.field3426[var69];
                                        int var71 = var70 - (var20 * 2) & 0x7;
                                        int var72 = this.field3982[var70];
                                        int var73 = this.field3989[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var74 = var73;
                                            var75 = 128 - var72;
                                        } else if (var20 == 2) {
                                            var75 = 128 - var73;
                                            var74 = 128 - var72;
                                        } else if (var20 == 3) {
                                            var74 = 128 - var73;
                                            var75 = var72;
                                        } else {
                                            var74 = var72;
                                            var75 = var73;
                                        }
                                        var55[var52] = var74;
                                        var56[var52] = var75;
                                        if (var60 != null && class220.field3158[var19][var70]) {
                                            int var76 = (var12 << 7) + var74;
                                            int var77 = (var14 << 7) + var75;
                                            var60[var52] = arg1.method426(var76, var77) - arg5.method426(var76, var77);
                                        }
                                        if (var61 != null) {
                                            if (arg1 != null && !class220.field3158[var19][var70]) {
                                                int var78 = (var12 << 7) + var74;
                                                int var79 = (var14 << 7) + var75;
                                                var61[var52] = arg5.method426(var78, var79) - arg1.method426(var78, var79);
                                            } else if (arg6 != null && !class315.field4485[var19][var70]) {
                                                int var80 = (var12 << 7) + var74;
                                                int var81 = (var14 << 7) + var75;
                                                var61[var52] = arg6.method426(var80, var81) - arg5.method426(var80, var81);
                                            }
                                        }
                                        if (var70 < 8 && class109.field1551[var71] > var26.field4781) {
                                            if (var54 != null) {
                                                var54[var52] = class212.field3056[var71];
                                            }
                                            var59[var52] = class236.field3463[var71];
                                            var58[var52] = class220.field3159[var71];
                                            var57[var52] = class397.field5827[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg3.method298() ? var26.field4786 : var26.field4783;
                                            var59[var52] = var26.field4782;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field3990 && arg0 == 0) {
                                    class356.method2150(var12, var14, var26.field4784, var26.field4793 * 8, var26.field4794);
                                }
                                if (var19 != 12 && var26.field4791 != -1 && var26.field4790) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class365.field5291[var19];
                            } else if (var17) {
                                var51 += class365.field5261[var19];
                            } else {
                                var51 += class376.field5560[var19];
                            }
                            if (var27 != null) {
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                class165 var82 = this.field3991.method1942(-18411, var22 - 1);
                                class165 var83 = this.field3991.method1942(-18411, var23 - 1);
                                class165 var84 = this.field3991.method1942(-18411, var24 - 1);
                                class165 var85 = this.field3991.method1942(-18411, var25 - 1);
                                for (int var86 = 0; var86 < var49; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class233.field3426[0] = var45[var51];
                                        class233.field3426[1] = 1;
                                        class233.field3426[2] = var46[var51];
                                        class233.field3426[3] = 1;
                                        class233.field3426[4] = var47[var51];
                                        class233.field3426[5] = var46[var51];
                                        var88 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class233.field3426[0] = var45[var51];
                                        class233.field3426[1] = 5;
                                        class233.field3426[2] = var46[var51];
                                        class233.field3426[3] = 5;
                                        class233.field3426[4] = var47[var51];
                                        var88 = 6;
                                        class233.field3426[5] = var46[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class233.field3426[0] = var45[var51];
                                        class233.field3426[1] = 3;
                                        class233.field3426[2] = var46[var51];
                                        class233.field3426[3] = 3;
                                        class233.field3426[4] = var47[var51];
                                        class233.field3426[5] = var46[var51];
                                        var88 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class233.field3426[0] = var45[var51];
                                        class233.field3426[1] = 7;
                                        class233.field3426[2] = var46[var51];
                                        class233.field3426[3] = 7;
                                        class233.field3426[4] = var47[var51];
                                        var88 = 6;
                                        class233.field3426[5] = var46[var51];
                                    } else {
                                        class233.field3426[0] = var45[var51];
                                        class233.field3426[1] = var47[var51];
                                        var88 = 3;
                                        class233.field3426[2] = var46[var51];
                                    }
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class233.field3426[var89];
                                        int var91 = var90 - var20 * 2 & 0x7;
                                        int var92 = this.field3982[var90];
                                        int var93 = this.field3989[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var95 = var93;
                                            var94 = 128 - var92;
                                        } else if (var20 == 2) {
                                            var94 = 128 - var93;
                                            var95 = 128 - var92;
                                        } else if (var20 == 3) {
                                            var94 = var92;
                                            var95 = 128 - var93;
                                        } else {
                                            var95 = var92;
                                            var94 = var93;
                                        }
                                        var55[var52] = var95;
                                        var56[var52] = var94;
                                        if (var60 != null && class220.field3158[var19][var90]) {
                                            int var96 = (var12 << 7) + var95;
                                            int var97 = (var14 << 7) + var94;
                                            var60[var52] = arg1.method426(var96, var97) - arg5.method426(var96, var97);
                                        }
                                        if (var61 != null) {
                                            if (arg1 != null && !class220.field3158[var19][var90]) {
                                                int var98 = (var12 << 7) + var95;
                                                int var99 = (var14 << 7) + var94;
                                                var61[var52] = arg5.method426(var98, var99) - arg1.method426(var98, var99);
                                            } else if (arg6 != null && !class315.field4485[var19][var90]) {
                                                int var100 = (var12 << 7) + var95;
                                                int var101 = (var14 << 7) + var94;
                                                var61[var52] = arg6.method426(var100, var101) - arg5.method426(var100, var101);
                                            }
                                        }
                                        if (var90 < 8 && class109.field1551[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class212.field3056[var91];
                                            }
                                            var59[var52] = class236.field3463[var91];
                                            var58[var52] = class220.field3159[var91];
                                            var57[var52] = class397.field5827[var91];
                                        } else {
                                            if (var17 && class220.field3158[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var95 == 0 && var94 == 0) {
                                                var57[var52] = arg2[var12][var14];
                                                var58[var52] = var82.field2339;
                                                var59[var52] = var82.field2349;
                                            } else if (var95 == 0 && var94 == 128) {
                                                var57[var52] = arg2[var12][var15];
                                                var58[var52] = var83.field2339;
                                                var59[var52] = var83.field2349;
                                            } else if (var95 == 128 && var94 == 128) {
                                                var57[var52] = arg2[var13][var15];
                                                var58[var52] = var84.field2339;
                                                var59[var52] = var84.field2349;
                                            } else if (var95 == 128 && var94 == 0) {
                                                var57[var52] = arg2[var13][var14];
                                                var58[var52] = var85.field2339;
                                                var59[var52] = var85.field2349;
                                            } else {
                                                if (var95 < 64) {
                                                    if (var94 >= 64) {
                                                        var58[var52] = var83.field2339;
                                                        var59[var52] = var83.field2349;
                                                    } else {
                                                        var58[var52] = var82.field2339;
                                                        var59[var52] = var82.field2349;
                                                    }
                                                } else if (var94 < 64) {
                                                    var58[var52] = var85.field2339;
                                                    var59[var52] = var85.field2349;
                                                } else {
                                                    var58[var52] = var84.field2339;
                                                    var59[var52] = var84.field2349;
                                                }
                                                int var102 = class3.method18((byte) 86, var95 << 7 >> 7, arg2[var12][var14], arg2[var13][var14]);
                                                int var103 = class3.method18((byte) 86, var95 << 7 >> 7, arg2[var12][var15], arg2[var13][var15]);
                                                var57[var52] = class3.method18((byte) 86, var94 << 7 >> 7, var102, var103);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field2338) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg5.method430(var12, var14);
                            int var105 = arg5.method430(var13, var14);
                            int var106 = arg5.method430(var13, var15);
                            int var107 = arg5.method430(var12, var15);
                            if (arg0 > 0) {
                                boolean var108 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var108 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field4797) {
                                    var108 = false;
                                }
                                if (var108 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field3973[arg0][var12][var14] = (byte) class244.method1606(this.field3973[arg0][var12][var14], 4);
                                }
                            }
                            int var109 = 0;
                            int var110 = 0;
                            int var111 = 0;
                            if (this.field3990) {
                                var109 = class121.method965(var12, var14);
                                var110 = class101.method866(var12, var14);
                                var111 = class220.method1501(var12, var14);
                            }
                            arg5.method421(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var109, var110, var111, var16);
                            class429.method2610(arg0, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILiv;I[Lsd;BIIIII)V")
    public final void method1740(int arg0, class65 arg1, int arg2, class62[] arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4000++;
        int var11 = (arg9 & 0x7) * 8;
        if (!this.field3990) {
            class62 var12 = arg3[arg6];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = arg8 + class291.method1839(var14 & 0x7, arg0, 103, var13 & 0x7);
                    int var16 = arg7 + class531.method3132(arg0, (byte) -122, var13 & 0x7, var14 & 0x7);
                    if (var15 > 0 && var15 < this.field3993 - 1 && var16 > 0 && var16 < this.field3975 - 1) {
                        var12.method551(var15, var16, -48);
                    }
                }
            }
        }
        int var17 = (arg5 & 0x7) * 8;
        int var18 = (arg9 & 0xFFFFFFF8) << 3;
        int var19 = arg5 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        if (arg4 != -12) {
            this.field3983 = null;
        }
        byte var21 = 0;
        if (arg0 == 1) {
            var21 = 1;
        } else if (arg0 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg0 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field4002; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg2 != var22 || var23 < var11 || var23 > var11 + 8 || var24 < var17 || (var17 + 8) < var24) {
                        this.method1737(-1, 0, -1, 0, 0, false, 0, 0, 0, 19108, arg1);
                    } else if ((var11 + 8) == var23 || (var17 + 8) == var24) {
                        int var31;
                        int var32;
                        if (arg0 == 0) {
                            var31 = -var17 - (-var24 - arg7);
                            var32 = var23 + arg8 - var11;
                        } else if (arg0 == 1) {
                            var32 = arg8 - (var17 - var24);
                            var31 = var11 + arg7 + 8 - var23;
                        } else if (arg0 == 2) {
                            var31 = arg7 + var17 + 8 - var24;
                            var32 = arg8 + var11 + 8 - var23;
                        } else {
                            var31 = var23 + arg7 - var11;
                            var32 = arg8 - (var24 - var17 - 8);
                        }
                        this.method1737(var31, var19 + var24, var32, var18 + var23, 0, true, arg6, 0, 0, 19108, arg1);
                    } else {
                        int var25 = arg8 + class291.method1839(var24 & 0x7, arg0, 108, var23 & 0x7);
                        int var26 = class531.method3132(arg0, (byte) -113, var23 & 0x7, var24 & 0x7) + arg7;
                        this.method1737(var26, var19 + var24, var25, var18 + var23, arg0, false, arg6, var21, var20, 19108, arg1);
                        if (var23 == 63 || var24 == 63) {
                            int var27 = var23 == 63 ? 64 : var23;
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29;
                            int var30;
                            if (arg0 == 0) {
                                var30 = var27 + arg8 - var11;
                                var29 = -var17 - (-var28 - arg7);
                            } else if (arg0 == 1) {
                                var30 = var28 - (var17 - arg8);
                                var29 = var11 + arg7 + 8 - var27;
                            } else if (arg0 == 2) {
                                var30 = arg8 + var11 + 8 - var27;
                                var29 = arg7 + var17 + 8 - var28;
                            } else {
                                var29 = var27 + arg7 - var11;
                                var30 = arg8 + var17 + 8 - var28;
                            }
                            if (var30 >= 0 && this.field3993 > var30 && var29 >= 0 && var29 < this.field3975) {
                                this.field3996[arg6][var30][var29] = this.field3996[arg6][var25 + var20][var21 + var26];
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)Z")
    public static final boolean method1741(int arg0, int arg1) {
        if (arg0 == 4) {
            field4001++;
            return arg1 == 48 || arg1 == 47 || arg1 == 1002 || arg1 == 9 || arg1 == 60;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II[[BIII[ZIILis;[[BLsr;[[BLya;)V")
    private final void method1742(int arg0, int arg1, byte[][] arg2, int arg3, int arg4, int arg5, boolean[] arg6, int arg7, int arg8, class345 arg9, byte[][] arg10, class165 arg11, byte[][] arg12, class38 arg13) {
        field3977++;
        if (arg9 != null && arg11 != null || arg11 != null && arg3 == 12 || arg9 != null && arg3 == 0) {
            boolean[] var15 = arg9 != null && arg9.field4788 ? class435.field6377[arg3] : class60.field696[arg3];
            if (arg4 > 0) {
                if (arg8 > 0) {
                    int var16 = arg2[arg8 - 1][arg4 - 1] & 0xFF;
                    if (var16 > 0) {
                        class345 var17 = this.field3999.method2918(arg1 ^ 0x56E1, var16 - 1);
                        if (var17.field4791 != -1 && var17.field4788) {
                            byte var18 = arg10[arg8 - 1][arg4 - 1];
                            int var19 = arg12[arg8 - 1][arg4 - 1] * 2 + 4 & 0x7;
                            int var20 = class87.method772(var17, arg13, (byte) -31);
                            if (class220.field3158[var18][var19]) {
                                class397.field5827[0] = var17.field4791;
                                class212.field3056[0] = var20;
                                class220.field3159[0] = arg13.method298() ? var17.field4786 : var17.field4783;
                                class236.field3463[0] = var17.field4782;
                                class109.field1551[0] = var17.field4781;
                                class473.field6978[0] = 256;
                            }
                        }
                    }
                }
                if ((arg7 - 1) > arg8) {
                    int var21 = arg2[arg8 + 1][arg4 - 1] & 0xFF;
                    if (var21 > 0) {
                        class345 var22 = this.field3999.method2918(arg1 ^ 0x56E1, var21 - 1);
                        if (var22.field4791 != -1 && var22.field4788) {
                            byte var23 = arg10[arg8 + 1][arg4 - 1];
                            int var24 = arg12[arg8 + 1][arg4 - 1] * 2 + 6 & 0x7;
                            int var25 = class87.method772(var22, arg13, (byte) -31);
                            if (class220.field3158[var23][var24]) {
                                class397.field5827[2] = var22.field4791;
                                class212.field3056[2] = var25;
                                class220.field3159[2] = arg13.method298() ? var22.field4786 : var22.field4783;
                                class236.field3463[2] = var22.field4782;
                                class109.field1551[2] = var22.field4781;
                                class473.field6978[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg4 < (arg0 - 1)) {
                if (arg8 > 0) {
                    int var26 = arg2[arg8 - 1][arg4 + 1] & 0xFF;
                    if (var26 > 0) {
                        class345 var27 = this.field3999.method2918(4, var26 - 1);
                        if (var27.field4791 != -1 && var27.field4788) {
                            byte var28 = arg10[arg8 - 1][arg4 + 1];
                            int var29 = arg12[arg8 - 1][arg4 + 1] * 2 + 2 & 0x7;
                            int var30 = class87.method772(var27, arg13, (byte) -31);
                            if (class220.field3158[var28][var29]) {
                                class397.field5827[6] = var27.field4791;
                                class212.field3056[6] = var30;
                                class220.field3159[6] = arg13.method298() ? var27.field4786 : var27.field4783;
                                class236.field3463[6] = var27.field4782;
                                class109.field1551[6] = var27.field4781;
                                class473.field6978[6] = 64;
                            }
                        }
                    }
                }
                if (arg8 < (arg7 - 1)) {
                    int var31 = arg2[arg8 + 1][arg4 + 1] & 0xFF;
                    if (var31 > 0) {
                        class345 var32 = this.field3999.method2918(arg1 ^ 0x56E1, var31 - 1);
                        if (var32.field4791 != -1 && var32.field4788) {
                            byte var33 = arg10[arg8 + 1][arg4 + 1];
                            int var34 = arg12[arg8 + 1][arg4 + 1] * 2 & 0x7;
                            int var35 = class87.method772(var32, arg13, (byte) -31);
                            if (class220.field3158[var33][var34]) {
                                class397.field5827[4] = var32.field4791;
                                class212.field3056[4] = var35;
                                class220.field3159[4] = arg13.method298() ? var32.field4786 : var32.field4783;
                                class236.field3463[4] = var32.field4782;
                                class109.field1551[4] = var32.field4781;
                                class473.field6978[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg4 > 0) {
                int var36 = arg2[arg8][arg4 - 1] & 0xFF;
                if (var36 > 0) {
                    class345 var37 = this.field3999.method2918(4, var36 - 1);
                    if (var37.field4791 != -1) {
                        byte var38 = arg10[arg8][arg4 - 1];
                        byte var39 = arg12[arg8][arg4 - 1];
                        if (var37.field4788) {
                            int var40 = 2;
                            int var41 = (var39 * 2) + 4;
                            int var42 = class87.method772(var37, arg13, (byte) -31);
                            for (int var43 = 0; var43 < 3; var43++) {
                                var40 &= 0x7;
                                var41 &= 0x7;
                                if (class220.field3158[var38][var41] && class109.field1551[var40] <= var37.field4781) {
                                    class397.field5827[var40] = var37.field4791;
                                    class212.field3056[var40] = var42;
                                    class220.field3159[var40] = arg13.method298() ? var37.field4786 : var37.field4783;
                                    class236.field3463[var40] = var37.field4782;
                                    if (class109.field1551[var40] == var37.field4781) {
                                        class473.field6978[var40] = class244.method1606(class473.field6978[var40], 32);
                                    } else {
                                        class473.field6978[var40] = 32;
                                    }
                                    class109.field1551[var40] = var37.field4781;
                                }
                                var41++;
                                var40--;
                            }
                            if (!var15[arg5 & 0x3]) {
                                arg6[0] = class435.field6377[var38][class345.method2089(var39 + 2, 3)];
                            }
                        } else if (!var15[-(-arg5) & 0x3]) {
                            arg6[0] = class60.field696[var38][class345.method2089(3, var39 + 2)];
                        }
                    }
                }
            }
            if (arg4 < arg0 - 1) {
                int var44 = arg2[arg8][arg4 + 1] & 0xFF;
                if (var44 > 0) {
                    class345 var45 = this.field3999.method2918(arg1 ^ 0x56E1, var44 - 1);
                    if (var45.field4791 != -1) {
                        byte var46 = arg10[arg8][arg4 + 1];
                        byte var47 = arg12[arg8][arg4 + 1];
                        if (var45.field4788) {
                            int var48 = 4;
                            int var49 = var47 * 2 + 2;
                            int var50 = class87.method772(var45, arg13, (byte) -31);
                            for (int var51 = 0; var51 < 3; var51++) {
                                var49 &= 0x7;
                                var48 &= 0x7;
                                if (class220.field3158[var46][var49] && var45.field4781 >= class109.field1551[var48]) {
                                    class397.field5827[var48] = var45.field4791;
                                    class212.field3056[var48] = var50;
                                    class220.field3159[var48] = arg13.method298() ? var45.field4786 : var45.field4783;
                                    class236.field3463[var48] = var45.field4782;
                                    if (class109.field1551[var48] == var45.field4781) {
                                        class473.field6978[var48] = class244.method1606(class473.field6978[var48], 16);
                                    } else {
                                        class473.field6978[var48] = 16;
                                    }
                                    class109.field1551[var48] = var45.field4781;
                                }
                                var48++;
                                var49--;
                            }
                            if (!var15[arg5 + 2 & 0x3]) {
                                arg6[2] = class435.field6377[var46][class345.method2089(var47, 3)];
                            }
                        } else if (!var15[arg5 + 2 & 0x3]) {
                            arg6[2] = class60.field696[var46][class345.method2089(3, var47)];
                        }
                    }
                }
            }
            if (arg8 > 0) {
                int var52 = arg2[arg8 - 1][arg4] & 0xFF;
                if (var52 > 0) {
                    class345 var53 = this.field3999.method2918(arg1 - 22241, var52 + -1);
                    if (var53.field4791 != -1) {
                        byte var54 = arg10[arg8 - 1][arg4];
                        byte var55 = arg12[arg8 - 1][arg4];
                        if (var53.field4788) {
                            int var56 = 6;
                            int var57 = var55 * 2 + 4;
                            int var58 = class87.method772(var53, arg13, (byte) -31);
                            for (int var59 = 0; var59 < 3; var59++) {
                                var56 &= 0x7;
                                var57 &= 0x7;
                                if (class220.field3158[var54][var57] && var53.field4781 >= class109.field1551[var56]) {
                                    class397.field5827[var56] = var53.field4791;
                                    class212.field3056[var56] = var58;
                                    class220.field3159[var56] = arg13.method298() ? var53.field4786 : var53.field4783;
                                    class236.field3463[var56] = var53.field4782;
                                    if (class109.field1551[var56] == var53.field4781) {
                                        class473.field6978[var56] = class244.method1606(class473.field6978[var56], 8);
                                    } else {
                                        class473.field6978[var56] = 8;
                                    }
                                    class109.field1551[var56] = var53.field4781;
                                }
                                var57--;
                                var56++;
                            }
                            if (!var15[arg5 + 3 & 0x3]) {
                                arg6[3] = class435.field6377[var54][class345.method2089(var55 + 1, 3)];
                            }
                        } else if (!var15[arg5 + 3 & 0x3]) {
                            arg6[3] = class60.field696[var54][class345.method2089(3, var55 + 1)];
                        }
                    }
                }
            }
            if (arg8 < arg7 - 1) {
                int var60 = arg2[arg8 + 1][arg4] & 0xFF;
                if (var60 > 0) {
                    class345 var61 = this.field3999.method2918(4, var60 - 1);
                    if (var61.field4791 != -1) {
                        byte var62 = arg10[arg8 + 1][arg4];
                        byte var63 = arg12[arg8 + 1][arg4];
                        if (var61.field4788) {
                            int var64 = 4;
                            int var65 = var63 * 2 + 6;
                            int var66 = class87.method772(var61, arg13, (byte) -31);
                            for (int var67 = 0; var67 < 3; var67++) {
                                var64 &= 0x7;
                                var65 &= 0x7;
                                if (class220.field3158[var62][var65] && class109.field1551[var64] <= var61.field4781) {
                                    class397.field5827[var64] = var61.field4791;
                                    class212.field3056[var64] = var66;
                                    class220.field3159[var64] = arg13.method298() ? var61.field4786 : var61.field4783;
                                    class236.field3463[var64] = var61.field4782;
                                    if (class109.field1551[var64] == var61.field4781) {
                                        class473.field6978[var64] = class244.method1606(class473.field6978[var64], 4);
                                    } else {
                                        class473.field6978[var64] = 4;
                                    }
                                    class109.field1551[var64] = var61.field4781;
                                }
                                var64--;
                                var65++;
                            }
                            if (!var15[arg5 + 1 & 0x3]) {
                                arg6[1] = class435.field6377[var62][class345.method2089(3, var63 + 3)];
                            }
                        } else if (!var15[arg5 + 1 & 0x3]) {
                            arg6[1] = class60.field696[var62][class345.method2089(var63 + 3, 3)];
                        }
                    }
                }
            }
        }
        if (arg1 != 22245 || arg9 == null) {
            return;
        }
        int var68 = class87.method772(arg9, arg13, (byte) -31);
        if (!arg9.field4788) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg5 * 2) & 0x7;
            if (class220.field3158[arg3][var69] && arg9.field4781 >= class109.field1551[var70]) {
                class397.field5827[var70] = arg9.field4791;
                class212.field3056[var70] = var68;
                class220.field3159[var70] = arg13.method298() ? arg9.field4786 : arg9.field4783;
                class236.field3463[var70] = arg9.field4782;
                if (class109.field1551[var70] == arg9.field4781) {
                    class473.field6978[var70] = class244.method1606(class473.field6978[var70], 2);
                } else {
                    class473.field6978[var70] = 2;
                }
                class109.field1551[var70] = arg9.field4781;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public static void method1743(byte arg0) {
        field3995 = null;
        field3980 = null;
        if (arg0 == 119) {
            field3979 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(IIIZLkb;Lqd;)V")
    public class270(int arg0, int arg1, int arg2, boolean arg3, class485 arg4, class312 arg5) {
        this.field3990 = arg3;
        this.field3999 = arg4;
        this.field3993 = arg1;
        this.field3991 = arg5;
        this.field3975 = arg2;
        this.field4002 = arg0;
        this.field3978 = new byte[this.field4002][this.field3993][this.field3975];
        this.field3988 = new byte[this.field4002][this.field3993][this.field3975];
        this.field3983 = new byte[this.field4002][this.field3993][this.field3975];
        this.field3996 = new int[this.field4002][this.field3993 + 1][this.field3975 + 1];
        this.field3973 = new byte[this.field4002][this.field3993 + 1][this.field3975 + 1];
        this.field3987 = new byte[this.field4002][this.field3993][this.field3975];
    }
}
