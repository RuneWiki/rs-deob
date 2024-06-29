import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class237 extends class273 {

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "Z")
    private boolean field4271 = true;

    @OriginalMember(owner = "client!sc", name = "W", descriptor = "Z")
    private boolean field4274 = true;

    @OriginalMember(owner = "client!sc", name = "Y", descriptor = "Luk;")
    public static class96 field4276 = new class96(5);

    @OriginalMember(owner = "client!sc", name = "bb", descriptor = "I")
    public static int field4279 = 0;

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!sc", name = "X", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!sc", name = "cb", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!sc", name = "db", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!sc", name = "Z", descriptor = "[I")
    public static int[] field4277;

    @OriginalMember(owner = "client!sc", name = "ab", descriptor = "[Lod;")
    public static class90[] field4278;

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class237() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method29(int arg0, byte arg1) {
        int var3 = -20 / ((12 - arg1) / 58);
        ++field4281;
        int[][] var4 = super.field4787.method1657(arg0, (byte) -108);
        if (super.field4787.field4355) {
            int[][] var5 = this.method1859(!this.field4274 ? arg0 : -arg0 + class274.field4808, 0, 3);
            int[] var6 = var5[1];
            int[] var7 = var5[0];
            int[] var8 = var5[2];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int[] var11 = var4[0];
            if (this.field4271) {
                for (int var12 = 0; ~class176.field3200 < ~var12; ++var12) {
                    var11[var12] = var7[-var12 + class90.field1844];
                    var9[var12] = var6[class90.field1844 - var12];
                    var10[var12] = var8[-var12 + class90.field1844];
                }
            } else {
                for (int var13 = 0; class176.field3200 > var13; ++var13) {
                    var11[var13] = var7[var13];
                    var9[var13] = var6[var13];
                    var10[var13] = var8[var13];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(III)V")
    public static final void method1634(int arg0, int arg1, int arg2) {
        if (class208.field3766 > 0) {
            class20.method155(class208.field3766, (byte) -40);
            class208.field3766 = 0;
        }
        if (arg1 >= -107) {
            field4279 = -9;
        }
        ++field4272;
        short var3 = 256;
        int var4 = 0;
        int var5 = 0;
        int var6 = class131.field2495 * arg0;
        for (int var7 = 1; ~var7 > ~(var3 + -1); ++var7) {
            int var8 = (var3 - var7) * class118.field2320[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; ~var9 > -129; ++var9) {
                int var11 = class194.field3483[var4++];
                int var12 = class131.field2493[arg2 + var6++];
                if (~var11 != -1) {
                    int var13 = 256 - (var11 - -18);
                    int var14 = var11 + 18;
                    if (~var14 < -256) {
                        var14 = 255;
                    }
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var15 = class168.field3108[var11];
                    class83.field1619.field3098[var5++] = class1.method5(16711680, var13 * class1.method5(var12, 65280) + var14 * class1.method5(var15, 65280)) + class1.method5(var14 * class1.method5(16711935, var15) + var13 * class1.method5(16711935, var12), -16711936) >> 8;
                } else {
                    class83.field1619.field3098[var5++] = var12;
                }
            }
            for (int var10 = 0; ~var10 > ~var8; ++var10) {
                class83.field1619.field3098[var5++] = class131.field2493[var6++ + arg2];
            }
            var6 += class131.field2495 - 128;
        }
        class83.field1619.method670(arg2, arg0);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        if (arg0 != -7420) {
            field4276 = null;
        }
        ++field4273;
        int[] var3 = super.field4800.method1224(arg1, 0);
        if (super.field4800.field3160) {
            int[] var4 = this.method1863(-121, 0, !this.field4274 ? arg1 : class274.field4808 - arg1);
            if (!this.field4271) {
                class250.method1693(var4, 0, var3, 0, class176.field3200);
            } else {
                for (int var5 = 0; class176.field3200 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class90.field1844];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)V")
    public static final void method1635(int arg0) {
        int var1 = -23 / ((arg0 - 58) / 51);
        ++field4275;
        if (class84.field1634 == 30) {
            class138.method983(25, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)V")
    public static void method1636(int arg0) {
        field4278 = null;
        field4276 = null;
        field4277 = null;
        if (arg0 < 100) {
            field4276 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field4778 = arg1.method1408((byte) -38) == 1;
                }
            } else {
                this.field4274 = ~arg1.method1408((byte) -40) == -2;
            }
        } else {
            this.field4271 = ~arg1.method1408((byte) -84) == -2;
        }
        ++field4280;
        if (arg2 > -16) {
            field4278 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(IB)V")
    public static final void method1637(int arg0, byte arg1) {
        if (class12.field393 == null) {
            class12.field393 = new byte[4][104][104];
        }
        ++field4270;
        for (int var2 = 0; ~var2 > -5; ++var2) {
            for (int var3 = 0; ~var3 > -105; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    class12.field393[var2][var3][var4] = arg1;
                }
            }
        }
        if (arg0 != 18) {
            field4277 = null;
        }
    }
}
