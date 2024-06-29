import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class179 extends class7 {

    @OriginalMember(owner = "client!s", name = "V", descriptor = "Lob;")
    public static class141 field3526 = class175.method1195(40, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

    @OriginalMember(owner = "client!s", name = "R", descriptor = "Lob;")
    public static class141 field3522 = null;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "Lob;")
    public static class141 field3524 = class175.method1195(40, "Fps:");

    @OriginalMember(owner = "client!s", name = "db", descriptor = "[I")
    public static int[] field3534 = new int[5];

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "D")
    public static double field3532 = -1.0D;

    @OriginalMember(owner = "client!s", name = "U", descriptor = "Lob;")
    public static class141 field3525 = class175.method1195(40, "Nehmen");

    @OriginalMember(owner = "client!s", name = "S", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!s", name = "X", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!s", name = "eb", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!s", name = "W", descriptor = "[Ldc;")
    private class34[] field3527;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "(I)V")
    public static void method1213(int arg0) {
        field3524 = null;
        int var1 = 95 / ((arg0 - 57) / 59);
        field3534 = null;
        field3526 = null;
        field3525 = null;
        field3522 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I[[I)V")
    private final void method1214(int arg0, int[][] arg1) {
        ++field3530;
        int var3 = class60.field1174;
        int var4 = class117.field2272;
        class36.method249(arg1, -26);
        class161.method1124(class106.field2030, arg0, 0, (byte) 55, class54.field1050);
        if (this.field3527 != null) {
            for (int var5 = 0; ~this.field3527.length < ~var5; ++var5) {
                class34 var6 = this.field3527[var5];
                int var7 = var6.field689;
                int var8 = var6.field697;
                if (var8 < 0) {
                    if (~var7 <= -1) {
                        var6.method27((byte) 94, var3, var4);
                    }
                } else if (~var7 > -1) {
                    var6.method22(var4, var3, true);
                } else {
                    var6.method24(var3, (byte) 114, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        int[] var3 = super.field100.method842(arg1, 12);
        ++field3535;
        if (arg0 < 13) {
            return null;
        } else {
            if (super.field100.field2534) {
                this.method1214(0, super.field100.method845(2));
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        int var4 = -27 / ((arg1 - 66) / 57);
        if (arg0 == 0) {
            this.field3527 = new class34[arg2.method991(255)];
            for (int var5 = 0; this.field3527.length > var5; ++var5) {
                int var6 = arg2.method991(255);
                if (var6 != 0) {
                    if (~var6 != -2) {
                        if (~var6 != -3) {
                            if (~var6 == -4) {
                                this.field3527[var5] = class129.method817(arg2, 86);
                            }
                        } else {
                            this.field3527[var5] = class110.method724((byte) 117, arg2);
                        }
                    } else {
                        this.field3527[var5] = class42.method274(arg2, 0);
                    }
                } else {
                    this.field3527[var5] = class25.method178(108, arg2);
                }
            }
        } else if (~arg0 == -2) {
            super.field99 = arg2.method991(255) == 1;
        }
        ++field3531;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Log;Z)Lob;")
    public static final class141 method1216(class146 arg0, boolean arg1) {
        ++field3533;
        if (!arg1) {
            method1215(-76, -41, 62, -73, 18, -71, -88, -110);
        }
        return class117.method755((byte) 66, arg0, 32767);
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(IB)[[I")
    public final int[][] method51(int arg0, byte arg1) {
        int var3 = -101 % ((-42 - arg1) / 41);
        ++field3523;
        int[][] var4 = super.field97.method1396(arg0, (byte) 45);
        if (super.field97.field4093) {
            int var5 = class60.field1174;
            int var6 = class117.field2272;
            int[][][] var7 = super.field97.method1394(9924);
            int[][] var8 = new int[var5][var6];
            this.method1214(0, var8);
            for (int var9 = 0; var9 < class60.field1174; ++var9) {
                int[] var10 = var8[var9];
                int[][] var11 = var7[var9];
                int[] var12 = var11[0];
                int[] var13 = var11[1];
                int[] var14 = var11[2];
                for (int var15 = 0; ~var15 > ~class117.field2272; ++var15) {
                    int var16 = var10[var15];
                    var14[var15] = class15.method94(4080, var16 << 4);
                    var13[var15] = class15.method94(65280, var16) >> 4;
                    var12[var15] = class15.method94(var16, 16711680) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
    public class179() {
        super(0, true);
    }
}
