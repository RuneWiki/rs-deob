import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class234 {

    @OriginalMember(owner = "client!er", name = "k", descriptor = "I")
    private int field3521 = -1;

    @OriginalMember(owner = "client!er", name = "p", descriptor = "Z")
    public boolean field3526 = true;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    private int field3511;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "Lbha;")
    private class273 field3513;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "I")
    private int field3520;

    @OriginalMember(owner = "client!er", name = "s", descriptor = "Llba;")
    private class223 field3529;

    @OriginalMember(owner = "client!er", name = "q", descriptor = "I")
    private int field3527;

    @OriginalMember(owner = "client!er", name = "r", descriptor = "I")
    private int field3528;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "Lpm;")
    private class614 field3517;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "I")
    public int field3512;

    @OriginalMember(owner = "client!er", name = "n", descriptor = "Lbw;")
    private class28 field3524;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "I")
    public static int field3514 = 1403;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!er", name = "i", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!er", name = "o", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILpm;I)V")
    public final void method1599(int arg0, class614 arg1, int arg2) {
        if (arg2 != 0) {
            this.field3528 = 107;
        }
        field3525++;
        if (arg0 > 0) {
            this.method1603((byte) 39);
            this.field3529.method1492(this.field3524, 2);
            this.field3529.method1430((byte) -91, 0, class625.field8750, arg1, arg0, this.field3528, this.field3527 + 1 - this.field3528);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method1600(String arg0, int arg1) {
        field3515++;
        long var2 = 0L;
        int var4 = arg0.length();
        int var5 = -75 / ((16 - arg1) / 53);
        for (int var6 = 0; var6 < var4; var6++) {
            var2 *= 37L;
            char var7 = arg0.charAt(var6);
            if (var7 >= 'A' && var7 <= 'Z') {
                var2 += (var7 - 64);
            } else if (var7 >= 'a' && var7 <= 'z') {
                var2 += (var7 + 1 - 'a');
            } else if (var7 >= '0' && var7 <= '9') {
                var2 += (var7 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IBILha;II)V")
    public static final void method1601(int arg0, byte arg1, int arg2, class473 arg3, int arg4, int arg5) {
        field3522++;
        class377.field5424 = arg3;
        class747.field10317 = class377.field5424.method159();
        class579.field8132 = class377.field5424.method159();
        class221.field3034 = class377.field5424.method159();
        class85.field1027 = null;
        int var6 = -123 % ((16 - arg1) / 52);
        class166.field2118 = 0;
        class376.field5395 = null;
        class41.field424 = arg2;
        class448.field6281 = arg5;
        class100.method714(arg0, (byte) 83, arg4);
        class593.field8350 = -1;
        class535.field7400 = -1;
        class635.field8863 = -1;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IZIII)V")
    public static final void method1602(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class122.method861(120);
        field3519++;
        class217.field2990 = 0L;
        if (arg3 != 16367) {
            field3514 = -40;
        }
        int var5 = class647.method3714(-119);
        if (arg0 == 3 || var5 == 3) {
            arg1 = true;
        }
        if (!class111.field1332.method200()) {
            arg1 = true;
        }
        class127.method875(arg1, arg4, arg2, (byte) 118, var5, arg0);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
    private final void method1603(byte arg0) {
        field3516++;
        if (!this.field3526) {
            return;
        }
        this.field3526 = false;
        byte[] var2 = this.field3513.field3952;
        int var3 = 0;
        int var4 = this.field3513.field3938;
        int var5 = this.field3520 + (this.field3513.field3938 * this.field3511);
        int var6 = -128;
        if (arg0 != 39) {
            this.method1599(-101, null, -18);
        }
        while (var6 < 0) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
            var6++;
        }
        if (this.field3524 != null && this.field3521 == var3) {
            this.field3526 = false;
            return;
        }
        this.field3521 = var3;
        int var7 = 0;
        int var8 = this.field3511 * var4 + this.field3520;
        if (!this.field3529.method1491(class612.field8616, 1, class29.field238)) {
            if (class400.field5653 == null) {
                class400.field5653 = new int[16384];
            }
            int[] var9 = class400.field5653;
            for (int var10 = -128; var10 < 0; var10++) {
                for (int var11 = -128; var11 < 0; var11++) {
                    if (var2[var8] == 0) {
                        int var12 = 0;
                        if (var2[var8 - 1] != 0) {
                            var12++;
                        }
                        if (var2[var8 + 1] != 0) {
                            var12++;
                        }
                        if (var2[var8 - var4] != 0) {
                            var12++;
                        }
                        if (var2[var4 + var8] != 0) {
                            var12++;
                        }
                        var9[var7++] = var12 * 17 << 24;
                    } else {
                        var9[var7++] = 1140850688;
                    }
                    var8++;
                }
                var8 += this.field3513.field3938 - 128;
            }
            if (this.field3524 == null) {
                this.field3524 = this.field3529.method1447((byte) -60, 128, 128, false, class400.field5653);
                this.field3524.method129(false, true, false);
            } else {
                this.field3524.method131(0, class400.field5653, 128, 0, 128, false, 0, 128);
            }
            return;
        }
        if (class514.field7063 == null) {
            class514.field7063 = new byte[16384];
        }
        byte[] var13 = class514.field7063;
        for (int var14 = -128; var14 < 0; var14++) {
            for (int var15 = -128; var15 < 0; var15++) {
                if (var2[var8] == 0) {
                    int var16 = 0;
                    if (var2[var8 - 1] != 0) {
                        var16++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var16++;
                    }
                    if (var2[var8 - var4] != 0) {
                        var16++;
                    }
                    if (var2[var4 + var8] != 0) {
                        var16++;
                    }
                    var13[var7++] = (byte) (var16 * 17);
                } else {
                    var13[var7++] = 68;
                }
                var8++;
            }
            var8 += this.field3513.field3938 - 128;
        }
        if (this.field3524 == null) {
            this.field3524 = this.field3529.method1407(128, 128, class514.field7063, (byte) 92, false, class29.field238);
            this.field3524.method129(false, true, false);
        } else {
            this.field3524.method127(0, 128, class514.field7063, class29.field238, 128, 22217, 0, 128, 0);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
    public final void method1604(int arg0) {
        this.method1599(this.field3512, this.field3517, arg0);
        field3523++;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIII[B)Z")
    public static final boolean method1605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        field3518++;
        int var7 = arg3 % arg2;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg2 - var7;
        }
        if (arg5 != -1) {
            return true;
        }
        int var9 = -((arg2 + arg4 - 1) / arg2);
        int var10 = -((arg3 - (1 - arg2)) / arg2);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg6[arg0] == 0) {
                    return true;
                }
                arg0 += arg2;
            }
            int var13 = arg0 - var8;
            if (arg6[var13 - 1] == 0) {
                return true;
            }
            arg0 = arg1 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Llba;Lbha;Laga;IIIII)V")
    public class234(class223 arg0, class273 arg1, class671 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field3511 = arg7;
        this.field3513 = arg1;
        this.field3520 = arg6;
        this.field3529 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field5827 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field9401[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field3512 = 0;
            this.field3524 = null;
        } else {
            this.field3527 = Integer.MIN_VALUE;
            this.field3528 = Integer.MAX_VALUE;
            this.field3517 = this.field3529.method1389(9, false);
            this.field3517.method1119(var10, -27671);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field3517.method1126(true, (byte) 109);
                if (var15 != null) {
                    Stream var16 = this.field3529.method1449(14, var15);
                    if (Stream.method2346()) {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field5827 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field9401[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 < this.field3528) {
                                            this.field3528 = var28;
                                        }
                                        if (this.field3527 < var28) {
                                            this.field3527 = var28;
                                        }
                                        var16.method2339(var28);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field5827 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field9401[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field3527 < var22) {
                                            this.field3527 = var22;
                                        }
                                        if (this.field3528 > var22) {
                                            this.field3528 = var22;
                                        }
                                        var16.method2343(var22);
                                    }
                                }
                            }
                        }
                    }
                    var16.method2351();
                    if (this.field3517.method1121(3104)) {
                        break;
                    }
                }
            }
            this.field3512 = var10 / 3;
        }
    }
}
