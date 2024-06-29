import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class208 extends class82 {

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
    private int field3723 = 4096;

    @OriginalMember(owner = "client!th", name = "T", descriptor = "I")
    private int field3726 = 0;

    @OriginalMember(owner = "client!th", name = "X", descriptor = "I")
    private int field3730 = 2000;

    @OriginalMember(owner = "client!th", name = "V", descriptor = "I")
    private int field3728 = 0;

    @OriginalMember(owner = "client!th", name = "fb", descriptor = "I")
    private int field3738 = 16;

    @OriginalMember(owner = "client!th", name = "cb", descriptor = "Ldj;")
    public static class44 field3735 = class89.method650(255, "Sprites geladen)3");

    @OriginalMember(owner = "client!th", name = "bb", descriptor = "[Log;")
    public static class158[] field3734 = new class158[50];

    @OriginalMember(owner = "client!th", name = "W", descriptor = "Lvh;")
    public static class228 field3729 = new class228(0, 0);

    @OriginalMember(owner = "client!th", name = "gb", descriptor = "[[B")
    public static byte[][] field3739 = new byte[50][];

    @OriginalMember(owner = "client!th", name = "hb", descriptor = "I")
    public static int field3740 = 0;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!th", name = "S", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!th", name = "U", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!th", name = "Y", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!th", name = "Z", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!th", name = "eb", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!th", name = "db", descriptor = "Lnf;")
    public static class147 field3736;

    @OriginalMember(owner = "client!th", name = "ab", descriptor = "Lwc;")
    public static class233 field3733;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "(I)V")
    public static void method1354(int arg0) {
        field3733 = null;
        field3734 = null;
        field3729 = null;
        field3739 = null;
        if (arg0 != -30952) {
            method1355((class44[]) null, (short[]) null, (byte) -16);
        }
        field3736 = null;
        field3735 = null;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field3724;
        if (arg0 != 25238) {
            this.field3723 = -54;
        }
        int[] var3 = super.field1595.method603(true, arg1);
        if (super.field1595.field1538) {
            int var4 = this.field3723 >> 1;
            int[][] var5 = super.field1595.method604(arg0 + -25238);
            Random var6 = new Random((long) this.field3726);
            for (int var7 = 0; ~var7 > ~this.field3730; ++var7) {
                int var8 = ~this.field3723 < -1 ? this.field3728 - (var4 + -class151.method979(-1, this.field3723, var6)) : this.field3728;
                int var9 = var8 >> 4 & 255;
                int var10 = class151.method979(-1, class129.field2287, var6);
                int var11 = class151.method979(-1, client.field609, var6);
                int var12 = (class214.field3863[var9] * this.field3738 >> 12) + var10;
                int var13 = (class153.field2674[var9] * this.field3738 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = var12 - var10;
                if (~var15 != -1 || var14 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        var11 = var17;
                        int var18 = var12;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var11 = var13;
                        var10 = var12;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var25 = 2048 / var22;
                    int var26 = -(class151.method979(-1, 4096, var6) >> 2) + 1024;
                    int var27 = ~var13 < ~var11 ? 1 : -1;
                    for (int var28 = var10; var28 < var12; ++var28) {
                        var24 += var23;
                        int var29 = (-var10 + var28) * var25 + var26 - -1024;
                        int var30 = class53.field943 & var28;
                        int var31 = class101.field1850 & var21;
                        if (~var24 < -1) {
                            var21 += var27;
                            var24 += -var22;
                        }
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        if (arg0 > 95) {
            ++field3731;
            class71.method558(4096);
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class208() {
        super(0, true);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "([Ldj;[SB)V")
    public static final void method1355(class44[] arg0, short[] arg1, byte arg2) {
        class187.method1161(arg0, (byte) 70, 0, arg0.length + -1, arg1);
        if (arg2 != 97) {
            method1356(-119, (byte) 68, -37);
        }
        ++field3732;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IBI)I")
    public static final int method1356(int arg0, byte arg1, int arg2) {
        if (arg1 >= -21) {
            field3737 = -77;
        }
        int var3 = arg2 + -1 & arg0 >> 31;
        ++field3727;
        return ((arg0 >>> 31) + arg0) % arg2 + var3;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        if (arg2 != 68) {
            method1354(-39);
        }
        ++field3725;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            this.field3723 = arg0.method500(63);
                        }
                    } else {
                        this.field3728 = arg0.method500(arg2 ^ 127);
                    }
                } else {
                    this.field3738 = arg0.method506(255);
                }
            } else {
                this.field3730 = arg0.method500(100);
            }
        } else {
            this.field3726 = arg0.method506(255);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIILwd;JZ)V")
    public static final void method1357(int arg0, int arg1, int arg2, int arg3, class234 arg4, long arg5, boolean arg6) {
        if (arg4 != null) {
            class220 var8 = new class220();
            var8.field3977 = arg4;
            var8.field3979 = arg1 * 128 + 64;
            var8.field3990 = arg2 * 128 + 64;
            var8.field3978 = arg3;
            var8.field3997 = arg5;
            if (class32.field567[arg0][arg1][arg2] == null) {
                class32.field567[arg0][arg1][arg2] = new class68(arg0, arg1, arg2);
            }
            class32.field567[arg0][arg1][arg2].field1304 = var8;
        }
    }
}
