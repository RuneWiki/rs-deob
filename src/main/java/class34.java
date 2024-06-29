import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class34 extends class200 {

    @OriginalMember(owner = "client!va", name = "V", descriptor = "I")
    private int field495 = 4096;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "I")
    private int field493 = 4096;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "[I")
    private int[] field489 = new int[3];

    @OriginalMember(owner = "client!va", name = "W", descriptor = "I")
    private int field496 = 4096;

    @OriginalMember(owner = "client!va", name = "R", descriptor = "I")
    private int field491 = 409;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
    public static int field490 = 1;

    @OriginalMember(owner = "client!va", name = "S", descriptor = "Lid;")
    public static class149 field492 = class60.method382(":tradereq:", (byte) 34);

    @OriginalMember(owner = "client!va", name = "N", descriptor = "Lid;")
    public static class149 field487 = class60.method382("::rect_debug", (byte) 18);

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "Lnc;")
    public static class85 field499 = new class85(8);

    @OriginalMember(owner = "client!va", name = "U", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!va", name = "X", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "Lcg;")
    public static class166 field488;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIBII)V")
    public static final void method195(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -95) {
            field487 = null;
        }
        ++field497;
        if (class257.field4496 <= arg4 && arg4 <= class192.field3449) {
            int var5 = class47.method303(arg1, class94.field1655, class224.field3940, arg2 ^ -65442);
            int var6 = class47.method303(arg0, class94.field1655, class224.field3940, 65535);
            class82.method611(var6, var5, 8, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    public class34() {
        super(1, false);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        if (arg1) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (~arg2 != -3) {
                        if (~arg2 != -4) {
                            if (arg2 == 4) {
                                int var5 = arg0.method525(65280);
                                this.field489[0] = class136.method953(var5, 16711680) << 4;
                                this.field489[1] = class136.method953(4080, var5 >> 4);
                                this.field489[2] = class136.method953(var5, 255) >> 12;
                            }
                        } else {
                            this.field493 = arg0.method485(-2386);
                        }
                    } else {
                        this.field496 = arg0.method485(-2386);
                    }
                } else {
                    this.field495 = arg0.method485(-2386);
                }
            } else {
                this.field491 = arg0.method485(-2386);
            }
            ++field498;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method24(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field494;
            int[][] var3 = super.field3632.method965(arg1, 100);
            if (super.field3632.field2550) {
                int[][] var4 = this.method1366(arg1, false, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[2];
                int[] var7 = var4[1];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class137.field2515; ++var11) {
                    int var12 = var5[var11];
                    int var13 = -this.field489[0] + var12;
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (~this.field491 > ~var13) {
                        var8[var11] = var12;
                        var9[var11] = var7[var11];
                        var10[var11] = var6[var11];
                    } else {
                        int var14 = var7[var11];
                        int var15 = -this.field489[1] + var14;
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (this.field491 < var15) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var6[var11];
                        } else {
                            int var16 = var6[var11];
                            int var17 = -this.field489[2] + var16;
                            if (~var17 > -1) {
                                var17 = -var17;
                            }
                            if (~var17 < ~this.field491) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field493 * var12 >> 12;
                                var9[var11] = this.field496 * var14 >> 12;
                                var10[var11] = this.field495 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(I)V")
    public static void method196(int arg0) {
        field492 = null;
        if (arg0 >= -124) {
            field499 = null;
        }
        field488 = null;
        field487 = null;
        field499 = null;
    }
}
