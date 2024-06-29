import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class534 {

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    private int field7518 = -1;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "Z")
    public boolean field7525 = true;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "Lpc;")
    private class700 field7527;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    private int field7529;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    private int field7520;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Lmj;")
    private class682 field7514;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    private int field7516;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Lbia;")
    private class525 field7515;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "Lvb;")
    private class209 field7522;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "Lld;")
    private class182 field7530;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "[I")
    public static int[] field7526 = new int[5];

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "[I")
    public static int[] field7528 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field7517 = class391.method2293((byte) -69, 1600);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field7513;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "[I")
    public static int[] field7524;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public final void method3175(int arg0) {
        field7513++;
        this.method3176(this.field7516, this.field7515, false);
        if (arg0 != 0) {
            this.field7516 = -10;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILbia;Z)V")
    private final void method3176(int arg0, class525 arg1, boolean arg2) {
        field7523++;
        if (arg0 != 0) {
            this.method3179(79);
            this.field7527.method3936(arg2, this.field7530);
            this.field7527.method3944(4, 0, (byte) 78, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lgda;IIIII)V")
    public static final void method3177(class61 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class368.field4569 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class307.field3799) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class250.field2938 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class727 var14 = class107.field1351[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class621.field8523[var11].method1728(var13, (byte) -120, var12) + class621.field8523[var11].method1728(var13, (byte) -23, var12 + 1) + class621.field8523[var11].method1728(var13 + 1, (byte) -45, var12) + class621.field8523[var11].method1728(var13 + 1, (byte) -90, var12 + 1)) / 4 - (class621.field8523[arg1].method1728(arg3, (byte) -126, arg2) + class621.field8523[arg1].method1728(arg3, (byte) -82, arg2 + 1) + class621.field8523[arg1].method1728(arg3 + 1, (byte) -97, arg2) + class621.field8523[arg1].method1728(arg3 + 1, (byte) -44, arg2 + 1)) / 4;
                                    class621 var16 = var14.field10173;
                                    class621 var17 = var14.field10187;
                                    if (var16 != null && var16.method531(false)) {
                                        arg0.method524(var16, class6.field80, (var13 - arg3) * class327.field4047 + (1 - arg5) * class343.field4301, var15, var6, (var12 - arg2) * class327.field4047 + (1 - arg4) * class343.field4301, -16);
                                    }
                                    if (var17 != null && var17.method531(false)) {
                                        arg0.method524(var17, class6.field80, (var13 - arg3) * class327.field4047 + (1 - arg5) * class343.field4301, var15, var6, (var12 - arg2) * class327.field4047 + (1 - arg4) * class343.field4301, -77);
                                    }
                                    for (class10 var18 = var14.field10174; var18 != null; var18 = var18.field186) {
                                        class712 var19 = var18.field187;
                                        if (var19 != null && var19.method531(false) && (var19.field9994 == var12 || var7 == var12) && (var19.field9997 == var13 || var9 == var13)) {
                                            int var20 = var19.field9991 + 1 - var19.field9994;
                                            int var21 = var19.field9990 + 1 - var19.field9997;
                                            arg0.method524(var19, class6.field80, (var19.field9997 - arg3) * class327.field4047 + (var21 - arg5) * class343.field4301, var15, var6, (var19.field9994 - arg2) * class327.field4047 + (var20 - arg4) * class343.field4301, -110);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI[BI)V")
    public final void method3178(byte arg0, int arg1, byte[] arg2, int arg3) {
        field7519++;
        this.field7522.method1319(this.field7527.method3946(arg3, true) * arg1, arg3, arg0 ^ 0xFFFFAD05, arg2);
        this.method3176(arg1, this.field7522, false);
        if (arg0 != 7) {
            this.field7525 = true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
    private final void method3179(int arg0) {
        field7521++;
        if (!this.field7525) {
            return;
        }
        this.field7525 = false;
        byte[] var2 = this.field7514.field9326;
        byte[] var3 = this.field7527.field9877;
        int var4 = 0;
        int var5 = this.field7514.field9323;
        if (arg0 < 20) {
            this.field7520 = 82;
        }
        int var6 = this.field7514.field9323 * this.field7529 + this.field7520;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field7530 != null && this.field7518 == var4) {
            this.field7525 = false;
            return;
        }
        this.field7518 = var4;
        int var8 = 0;
        int var9 = this.field7529 * var5 + this.field7520;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var9] == 0) {
                    int var12 = 0;
                    if (var2[var9 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var9 + var5] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field7514.field9323 - 128;
        }
        if (this.field7530 == null) {
            this.field7530 = new class182(this.field7527, 3553, 6406, 128, 128, false, this.field7527.field9877, 6406, false);
            this.field7530.method1221(false, -1, false);
            this.field7530.method2347(true, 96);
        } else {
            this.field7530.method1218(6406, false, 0, this.field7527.field9877, 0, (byte) 122, 128, 0, 0, 128);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public static void method3180(byte arg0) {
        field7524 = null;
        field7528 = null;
        field7526 = null;
        if (arg0 != -22) {
            method3177(null, -82, -93, 95, -10, 1);
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lpc;Lmj;Lcea;IIIII)V")
    public class534(class700 arg0, class682 arg1, class227 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field7527 = arg0;
        this.field7529 = arg7;
        this.field7520 = arg6;
        this.field7514 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field3533 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field2643[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field7516 = var10;
        if (var10 <= 0) {
            this.field7530 = null;
        } else {
            class403 var14 = new class403(var10 * 2);
            if (this.field7527.field9772) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field3533 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field2643[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method2369(-18090, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field3533 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field2643[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method2379(var23[var24] & 0xFFFF, -12098);
                            }
                        }
                    }
                }
            }
            this.field7515 = this.field7527.method3948((byte) -120, var14.field5262, 5123, var14.field5275, false);
            this.field7522 = new class209(this.field7527, 5123, null, 1);
        }
    }
}
