import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class29 extends class83 {

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
    private int field274 = 0;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
    private int field275 = 2000;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    private int field273 = 0;

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
    private int field286 = 16;

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "I")
    private int field287 = 4096;

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "Z")
    public static boolean field278 = true;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "Lph;")
    public static class114 field276 = new class114(64);

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "[S")
    public static short[] field285;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBLtq;)V")
    public final void method35(int arg0, byte arg1, class250 arg2) {
        int var4 = 76 % ((-27 - arg1) / 50);
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            this.field287 = arg2.method1374(-2);
                        }
                    } else {
                        this.field274 = arg2.method1374(-2);
                    }
                } else {
                    this.field286 = arg2.method1350(31351);
                }
            } else {
                this.field275 = arg2.method1374(-2);
            }
        } else {
            this.field273 = arg2.method1350(31351);
        }
        ++field281;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
    public static void method140(int arg0) {
        field276 = null;
        if (arg0 == 64) {
            field285 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        ++field284;
        int[] var3 = super.field916.method1813(arg1, (byte) 126);
        if (arg0 != 2) {
            this.field287 = -24;
        }
        if (super.field916.field4174) {
            int var4 = this.field287 >> 1;
            int[][] var5 = super.field916.method1811((byte) -123);
            Random var6 = new Random((long) this.field273);
            for (int var7 = 0; var7 < this.field275; ++var7) {
                int var8 = ~this.field287 >= -1 ? this.field274 : -var4 + this.field274 + class409.method2546(arg0 ^ 18994, var6, this.field287);
                int var9 = 255 & var8 >> 4;
                int var10 = class409.method2546(arg0 + 18990, var6, class420.field6139);
                int var11 = class409.method2546(18992, var6, class91.field1047);
                int var12 = (class204.field2764[var9] * this.field286 >> 12) + var10;
                int var13 = (class327.field4353[var9] * this.field286 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = -var10 + var12;
                if (var15 != 0 || var14 != 0) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var10 > var12) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class409.method2546(18992, var6, 4096) >> 2) + 1024;
                    int var27 = ~var11 > ~var13 ? 1 : -1;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; var28 < var12; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = class213.field2881 & var28;
                        int var31 = var21 & class109.field1348;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        var24 += var23;
                        if (var24 > 0) {
                            var24 += -var22;
                            var21 -= -var27;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(ZI)I")
    public static final int method141(boolean arg0, int arg1) {
        if (!arg0) {
            method141(true, -8);
        }
        ++field282;
        return 255 & arg1;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)V")
    public final void method120(boolean arg0) {
        if (arg0) {
            this.method37(-65, 60);
        }
        class58.method316((byte) -16);
        ++field279;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(II)V")
    public static final void method142(int arg0, int arg1) {
        ++field277;
        class7.field62 = arg0;
        class114 var2 = class414.field5971;
        synchronized (class414.field5971) {
            int var3 = -94 % ((-83 - arg1) / 39);
            class414.field5971.method613(true);
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(Z)V")
    public static final void method143(boolean arg0) {
        class338.field4509 = 0;
        ++field280;
        class388.field5553 = 0;
        class51.method247((byte) 66);
        class429.method2656(8);
        class211.method1148(-86);
        class334.method1903(65280);
        for (int var1 = 0; class388.field5553 > var1; ++var1) {
            int var3 = class270.field3664[var1];
            if (class234.field3224 != class85.field957[var3].field6071) {
                if (~class85.field957[var3].field2025 < -1) {
                    class298.method1748(class85.field957[var3], 83);
                }
                class85.field957[var3] = null;
            }
        }
        if (class161.field2065 != class448.field6514.field3389) {
            throw new RuntimeException("gpp1 pos:" + class448.field6514.field3389 + " psize:" + class161.field2065);
        } else {
            if (arg0) {
                method141(true, -122);
            }
            for (int var2 = 0; ~class293.field3991 < ~var2; ++var2) {
                if (class85.field957[class345.field4629[var2]] == null) {
                    throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class293.field3991);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    public class29() {
        super(0, true);
    }
}
