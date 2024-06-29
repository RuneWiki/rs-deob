import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class180 {

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "[I")
    private int[] field3307;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "[I")
    private int[] field3303;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "Lnd;")
    private class272 field3310;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Lnd;")
    private class272 field3308;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "[Lnd;")
    private class272[] field3313;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Lli;")
    public static class185 field3302 = class245.method1649("k", 127);

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Z")
    public static boolean field3305 = false;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "Lli;")
    public static class185 field3312 = class245.method1649(")1", -76);

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lw;BLhi;)Z")
    public final boolean method1270(class230 arg0, byte arg1, class250 arg2) {
        field3306++;
        if (class158.field2989 <= 0) {
            for (int var4 = 0; var4 < this.field3303.length; var4++) {
                if (!arg2.method1701(this.field3303[var4], -2)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3303.length; var5++) {
                if (!arg2.method1687(5, this.field3303[var5], class158.field2989)) {
                    return false;
                }
            }
        }
        if (arg1 > -30) {
            method1271(15, 63, -101, 26, (class75) null, 11L, (class75) null, (class75) null);
        }
        for (int var6 = 0; var6 < this.field3307.length; var6++) {
            if (!arg0.method392(this.field3307[var6], (byte) 93)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIILbb;JLbb;Lbb;)V")
    public static final void method1271(int arg0, int arg1, int arg2, int arg3, class75 arg4, long arg5, class75 arg6, class75 arg7) {
        class64 var9 = new class64();
        var9.field1110 = arg4;
        var9.field1116 = arg1 * 128 + 64;
        var9.field1121 = arg2 * 128 + 64;
        var9.field1114 = arg3;
        var9.field1117 = arg5;
        var9.field1119 = arg6;
        var9.field1120 = arg7;
        int var10 = 0;
        class198 var11 = class153.field2896[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field3627; var12++) {
                class49 var13 = var11.field3646[var12];
                if ((var13.field802 & 0x400000L) == 4194304L) {
                    int var14 = var13.field800.method62();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1111 = -var10;
        if (class153.field2896[arg0][arg1][arg2] == null) {
            class153.field2896[arg0][arg1][arg2] = new class198(arg0, arg1, arg2);
        }
        class153.field2896[arg0][arg1][arg2].field3639 = var9;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V")
    public static void method1272(boolean arg0) {
        field3302 = null;
        field3312 = null;
        if (!arg0) {
            method1271(123, 27, -85, -89, (class75) null, 61L, (class75) null, (class75) null);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIB)V")
    public static final void method1273(int arg0, int arg1, byte arg2) {
        field3314++;
        class174 var3 = class249.method1671(6, arg1, (byte) 25);
        var3.method1233(0);
        if (arg2 == 62) {
            var3.field3186 = arg0;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZILw;ZDLhi;IB)[I")
    public final int[] method1274(boolean arg0, int arg1, class230 arg2, boolean arg3, double arg4, class250 arg5, int arg6, byte arg7) {
        field3315++;
        class130.method929(arg4, -256);
        class9.field180 = arg5;
        int[] var10 = new int[arg1 * arg6];
        int var11 = 64 / ((-arg7 - 45) / 62);
        class120.field2187 = arg2;
        class45.method277(arg1, 0, arg6);
        for (int var12 = 0; var12 < this.field3313.length; var12++) {
            this.field3313[var12].method1867(arg1, false, arg6);
        }
        int var13;
        byte var14;
        int var15;
        if (arg0) {
            var13 = -1;
            var14 = -1;
            var15 = arg1 - 1;
        } else {
            var14 = 1;
            var13 = arg1;
            var15 = 0;
        }
        int var16 = 0;
        for (int var17 = 0; var17 < arg6; var17++) {
            if (arg3) {
                var16 = var17;
            }
            int[] var20;
            int[] var21;
            int[] var22;
            if (this.field3310.field4832) {
                int[] var19 = this.field3310.method35(var17, 4421);
                var20 = var19;
                var21 = var19;
                var22 = var19;
            } else {
                int[][] var23 = this.field3310.method32(var17, (byte) 97);
                var22 = var23[2];
                var21 = var23[1];
                var20 = var23[0];
            }
            for (int var24 = var15; var24 != var13; var24 += var14) {
                int var25 = var20[var24] >> 4;
                int var26 = var22[var24] >> 4;
                int var27 = var21[var24] >> 4;
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var28 = class139.field2610[var25];
                if (var27 < 0) {
                    var27 = 0;
                }
                int var29 = class139.field2610[var27];
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var30 = class139.field2610[var26];
                var10[var16++] = (var28 << 16) + (var29 << 8) + var30;
                if (arg3) {
                    var16 += arg1 - 1;
                }
            }
        }
        for (int var18 = 0; var18 < this.field3313.length; var18++) {
            this.field3313[var18].method231(-4);
        }
        return var10;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIII)V")
    public static final void method1275(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 83) {
            method1275(47, -47, 76, -96, 25);
        }
        if (class207.field3810 <= arg0 && class66.field1163 >= arg0) {
            int var5 = class42.method260(class113.field2040, class216.field3964, (byte) 98, arg4);
            int var6 = class42.method260(class113.field2040, class216.field3964, (byte) 98, arg3);
            class171.method1220(arg0, var6, var5, (byte) 127, arg1);
        }
        field3304++;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class180() {
        this.field3307 = new int[0];
        this.field3303 = new int[0];
        this.field3310 = new class96();
        this.field3310.field4831 = 1;
        this.field3308 = new class96();
        this.field3308.field4831 = 1;
        this.field3313 = new class272[] { this.field3310, this.field3308 };
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Ljd;)V")
    public class180(class118 arg0) {
        int var2 = arg0.method867(false);
        int var3 = 0;
        this.field3313 = new class272[var2];
        int[][] var4 = new int[var2][];
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class272 var16 = class184.method1297(0, arg0);
            if (var16.method1122(-119) >= 0) {
                var3++;
            }
            if (var16.method236(-1) >= 0) {
                var5++;
            }
            int var17 = var16.field4824.length;
            var4[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var4[var6][var18] = arg0.method867(false);
            }
            this.field3313[var6] = var16;
        }
        this.field3303 = new int[var3];
        this.field3307 = new int[var5];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class272 var11 = this.field3313[var9];
            int var12 = var11.field4824.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4824[var13] = this.field3313[var4[var9][var13]];
            }
            int var14 = var11.method1122(-92);
            int var15 = var11.method236(-1);
            if (var14 > 0) {
                this.field3303[var7++] = var14;
            }
            if (var15 > 0) {
                this.field3307[var8++] = var15;
            }
            var4[var9] = null;
        }
        this.field3310 = this.field3313[arg0.method867(false)];
        Object var10 = null;
        this.field3308 = this.field3313[arg0.method867(false)];
    }
}
