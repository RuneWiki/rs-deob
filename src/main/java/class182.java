import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class182 extends class142 {

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
    private int field3470 = 2048;

    @OriginalMember(owner = "client!ua", name = "eb", descriptor = "I")
    private int field3478 = 1024;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
    private int field3468 = 3072;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "Lai;")
    public static class10 field3466 = class44.method278("null", -51);

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
    public static int field3471 = 0;

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "Lai;")
    public static class10 field3476 = class44.method278("Spieler kann nicht gefunden werden: ", 92);

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "[Z")
    public static boolean[] field3477 = new boolean[112];

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
    public class182() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        ++field3475;
        if (arg0) {
            return null;
        } else {
            int[] var3 = super.field2683.method1186((byte) -114, arg1);
            if (super.field2683.field3516) {
                int[] var4 = this.method963((byte) -121, 0, arg1);
                for (int var5 = 0; ~class133.field2499 < ~var5; ++var5) {
                    var3[var5] = (var4[var5] * this.field3470 >> 12) + this.field3478;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIII)V")
    public static final void method1178(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3473;
        class131 var5 = (class131) class101.field1882.method213(127, (long) arg4);
        if (var5 == null) {
            var5 = new class131();
            class101.field1882.method214(var5, (byte) 124, (long) arg4);
        }
        if (~var5.field2482.length >= ~arg3) {
            int[] var6 = new int[arg3 + 1];
            int[] var7 = new int[arg3 + 1];
            for (int var8 = 0; var8 < var5.field2482.length; ++var8) {
                var6[var8] = var5.field2482[var8];
                var7[var8] = var5.field2479[var8];
            }
            for (int var9 = var5.field2482.length; ~arg3 < ~var9; ++var9) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2482 = var6;
            var5.field2479 = var7;
        }
        var5.field2482[arg3] = arg2;
        var5.field2479[arg3] = arg0;
        if (arg1 != 0) {
            method1180((byte) -46);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        if (arg2 < -34) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        super.field2684 = ~arg0.method767(true) == -2;
                    }
                } else {
                    this.field3468 = arg0.method762((byte) 75);
                }
            } else {
                this.field3478 = arg0.method762((byte) 120);
            }
            ++field3467;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
    public final void method80(int arg0) {
        ++field3472;
        if (arg0 != -1) {
            this.method86(51, false);
        }
        this.field3470 = this.field3468 - this.field3478;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method86(int arg0, boolean arg1) {
        ++field3469;
        if (arg1) {
            method1178(-49, -20, 22, -2, -104);
        }
        int[][] var3 = super.field2666.method956(arg0, -110);
        if (super.field2666.field2664) {
            int[][] var4 = this.method961(2, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class133.field2499 > var11; ++var11) {
                var7[var11] = (var5[var11] * this.field3470 >> 12) + this.field3478;
                var9[var11] = (var6[var11] * this.field3470 >> 12) + this.field3478;
                var10[var11] = this.field3478 - -(var8[var11] * this.field3470 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V")
    public static void method1179(byte arg0) {
        field3466 = null;
        field3476 = null;
        field3477 = null;
        if (arg0 != 105) {
            field3471 = 53;
        }
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(B)V")
    public static final void method1180(byte arg0) {
        if (arg0 != 12) {
            field3471 = -31;
        }
        if (field3477[98]) {
            class2.field13 += (-class2.field13 + 12) / 2;
        } else if (!field3477[99]) {
            class2.field13 /= 2;
        } else {
            class2.field13 += (-12 - class2.field13) / 2;
        }
        class36.field577 += class2.field13 / 2;
        if (class36.field577 < 128) {
            class36.field577 = 128;
        }
        ++field3474;
        if (!field3477[96]) {
            if (field3477[97]) {
                class20.field301 += (24 - class20.field301) / 2;
            } else {
                class20.field301 /= 2;
            }
        } else {
            class20.field301 += (-class20.field301 + -24) / 2;
        }
        int var1 = class145.field2767.field1097 - -class70.field1209;
        int var2 = class104.field1951 + class145.field2767.field1100;
        if (~(class78.field1367 - var2) > 499 || ~(class78.field1367 - var2) < -501 || -var1 + class114.field2171 < -500 || ~(-var1 + class114.field2171) < -501) {
            class114.field2171 = var1;
            class78.field1367 = var2;
        }
        class171.field3316 = 2047 & class20.field301 / 2 + class171.field3316;
        if (class114.field2171 != var1) {
            class114.field2171 += (-class114.field2171 + var1) / 16;
        }
        if (~class36.field577 < -384) {
            class36.field577 = 383;
        }
        int var3 = class114.field2171 >> 7;
        int var4 = 0;
        if (class78.field1367 != var2) {
            class78.field1367 += (-class78.field1367 + var2) / 16;
        }
        int var5 = class78.field1367 >> 7;
        int var6 = class145.method1003((byte) -110, class78.field1367, class114.field2171, class42.field687);
        if (var5 > 3 && ~var3 < -4 && ~var5 > -101 && ~var3 > -101) {
            for (int var7 = var5 + -4; var7 <= var5 + 4; ++var7) {
                for (int var8 = var3 - 4; var3 + 4 >= var8; ++var8) {
                    int var9 = class42.field687;
                    if (~var9 > -4 && (2 & class185.field3527[1][var7][var8]) == 2) {
                        ++var9;
                    }
                    int var10 = -class186.field3556[var9][var7][var8] + var6;
                    if (~var10 < ~var4) {
                        var4 = var10;
                    }
                }
            }
        }
        int var11 = var4 * 192;
        if (~var11 < -98049) {
            var11 = 98048;
        }
        if (~var11 > -32769) {
            var11 = 32768;
        }
        if (var11 > class82.field1428) {
            class82.field1428 += (-class82.field1428 + var11) / 24;
        } else if (~var11 > ~class82.field1428) {
            class82.field1428 += (-class82.field1428 + var11) / 80;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
    public static final void method1181(int arg0, int arg1) {
        ++field3464;
        if (class42.method270(arg1, (byte) -125)) {
            class200[] var2 = class205.field3990[arg1];
            if (arg0 <= -5) {
                for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
                    class200 var4 = var2[var3];
                    if (var4 != null) {
                        var4.field3893 = 0;
                        var4.field3860 = 0;
                    }
                }
            }
        }
    }
}
