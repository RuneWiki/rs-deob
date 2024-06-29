import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class27 extends class83 {

    @OriginalMember(owner = "client!sq", name = "P", descriptor = "I")
    private int field254 = 4096;

    @OriginalMember(owner = "client!sq", name = "X", descriptor = "[I")
    private int[] field262 = new int[3];

    @OriginalMember(owner = "client!sq", name = "W", descriptor = "I")
    private int field261 = 409;

    @OriginalMember(owner = "client!sq", name = "T", descriptor = "I")
    private int field258 = 4096;

    @OriginalMember(owner = "client!sq", name = "N", descriptor = "I")
    private int field252 = 4096;

    @OriginalMember(owner = "client!sq", name = "R", descriptor = "[[I")
    public static int[][] field256 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!sq", name = "V", descriptor = "I")
    public static int field260 = 0;

    @OriginalMember(owner = "client!sq", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field255 = "Connected to update server";

    @OriginalMember(owner = "client!sq", name = "S", descriptor = "I")
    public static int field257 = 0;

    @OriginalMember(owner = "client!sq", name = "bb", descriptor = "I")
    public static int field266 = 0;

    @OriginalMember(owner = "client!sq", name = "K", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!sq", name = "M", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!sq", name = "O", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!sq", name = "U", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!sq", name = "ab", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!sq", name = "Z", descriptor = "Z")
    public static boolean field264;

    @OriginalMember(owner = "client!sq", name = "Y", descriptor = "[Lwj;")
    public static class9[] field263;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIII)V")
    public static final void method132(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class6.field42 = arg1;
        class322.field4306 = arg2;
        class310.field4183 = arg3;
        int var5 = -6 / ((72 - arg4) / 54);
        class335.field4462 = arg0;
        ++field251;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IBLtq;)V")
    public final void method35(int arg0, byte arg1, class250 arg2) {
        ++field265;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 == 4) {
                            int var5 = arg2.method1372(-2);
                            this.field262[1] = class262.method1461(var5, 65280) >> 4;
                            this.field262[0] = class262.method1461(var5 << 4, 267386880);
                            this.field262[2] = class262.method1461(0, var5 >> 12);
                        }
                    } else {
                        this.field258 = arg2.method1374(-2);
                    }
                } else {
                    this.field254 = arg2.method1374(-2);
                }
            } else {
                this.field252 = arg2.method1374(-2);
            }
        } else {
            this.field261 = arg2.method1374(-2);
        }
        int var6 = -51 % ((-27 - arg1) / 50);
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(Z)V")
    public static final void method133(boolean arg0) {
        class114 var1 = class396.field5700;
        synchronized (class396.field5700) {
            class396.field5700.method606((byte) 116);
        }
        if (!arg0) {
            field257 = 101;
        }
        ++field253;
        class114 var2 = class203.field2718;
        synchronized (class203.field2718) {
            class203.field2718.method606((byte) 113);
        }
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(II)V")
    public static final void method134(int arg0, int arg1) {
        class96 var2 = class176.field2209[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class96 var4 = class176.field2209[var3][arg0][arg1] = class176.field2209[var3 + 1][arg0][arg1];
            if (var4 != null) {
                --var4.field1141;
                for (class122 var5 = var4.field1130; var5 != null; var5 = var5.field1511) {
                    class17 var6 = var5.field1505;
                    if (var6.field168 == arg0 && var6.field159 == arg1) {
                        --var6.field161;
                    }
                }
            }
        }
        if (class176.field2209[0][arg0][arg1] == null) {
            class176.field2209[0][arg0][arg1] = new class96(0, arg0, arg1);
            class176.field2209[0][arg0][arg1].field1137 = 1;
        }
        class176.field2209[0][arg0][arg1].field1139 = var2;
        class176.field2209[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        ++field250;
        if (!arg0) {
            return null;
        } else {
            int[][] var3 = super.field927.method1774((byte) -41, arg1);
            if (super.field927.field4104) {
                int[][] var4 = this.method449(0, arg0, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class420.field6139 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = -this.field262[0] + var12;
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (~this.field261 > ~var13) {
                        var8[var11] = var12;
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var6[var11];
                        int var15 = var14 - this.field262[1];
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        if (var15 > this.field261) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = -this.field262[2] + var16;
                            if (var17 < 0) {
                                var17 = -var17;
                            }
                            if (this.field261 < var17) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field258 * var12 >> 12;
                                var9[var11] = this.field254 * var14 >> 12;
                                var10[var11] = this.field252 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(I)V")
    public static void method135(int arg0) {
        field256 = null;
        field255 = null;
        if (arg0 < -56) {
            field263 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V")
    public class27() {
        super(1, false);
    }
}
