import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class353 extends class17 {

    @OriginalMember(owner = "client!is", name = "I", descriptor = "I")
    private int field5063 = 0;

    @OriginalMember(owner = "client!is", name = "N", descriptor = "I")
    private int field5068 = 16;

    @OriginalMember(owner = "client!is", name = "F", descriptor = "I")
    private int field5060 = 2000;

    @OriginalMember(owner = "client!is", name = "P", descriptor = "I")
    private int field5070 = 4096;

    @OriginalMember(owner = "client!is", name = "R", descriptor = "I")
    private int field5072 = 0;

    @OriginalMember(owner = "client!is", name = "H", descriptor = "I")
    public static int field5062 = 100;

    @OriginalMember(owner = "client!is", name = "K", descriptor = "I")
    public static int field5065 = -1;

    @OriginalMember(owner = "client!is", name = "J", descriptor = "Leh;")
    public static class246 field5064 = new class246(20, -1);

    @OriginalMember(owner = "client!is", name = "S", descriptor = "Ltn;")
    public static class60 field5073 = new class60(57, -1);

    @OriginalMember(owner = "client!is", name = "T", descriptor = "Leh;")
    public static class246 field5074 = new class246(14, 8);

    @OriginalMember(owner = "client!is", name = "L", descriptor = "F")
    public static float field5066;

    @OriginalMember(owner = "client!is", name = "G", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!is", name = "M", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!is", name = "O", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!is", name = "Q", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method27(int arg0, int arg1) {
        ++field5061;
        int[] var3 = super.field210.method2683(-17, arg0);
        if (super.field210.field6442) {
            int var4 = this.field5070 >> 1;
            int[][] var5 = super.field210.method2685((byte) 92);
            Random var6 = new Random((long) this.field5063);
            for (int var7 = 0; this.field5060 > var7; ++var7) {
                int var8 = ~this.field5070 < -1 ? this.field5072 - var4 - -class119.method802(0, this.field5070, var6) : this.field5072;
                int var9 = (var8 & 4094) >> 4;
                int var10 = class119.method802(0, class530.field7763, var6);
                int var11 = class119.method802(0, class178.field2556, var6);
                int var12 = (class475.field6607[var9] * this.field5068 >> 12) + var10;
                int var13 = var11 - -(class68.field861[var9] * this.field5068 >> 12);
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || ~var14 != -1) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var14 < ~var15;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = var13 - var11;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 + -(class119.method802(0, 4096, var6) >> 2);
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var27 = ~var13 < ~var11 ? 1 : -1;
                    for (int var28 = var10; ~var28 > ~var12; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = var28 & class43.field499;
                        int var31 = class38.field417 & var21;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        var24 += var23;
                        if (var24 > 0) {
                            var21 -= -var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        if (arg1 <= 53) {
            method2091(107);
        }
        return var3;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IILet;I)V", line = 138)
    public static final void method2090(int arg0, int arg1, class429 arg2, int arg3) {
        if (arg1 != 0) {
            field5066 = 0.57395405F;
        }
        ++field5067;
        if (~arg2.field3320 == ~arg3 && arg3 != -1) {
            class449 var4 = class62.field784.method2566(arg3, arg1 + -19);
            int var5 = var4.field6286;
            if (var5 == 1) {
                arg2.field3361 = arg0;
                arg2.field3277 = 0;
                arg2.field3288 = 0;
                arg2.field3312 = 0;
                arg2.field3284 = 1;
                class190.method1213(arg2.field3312, arg2.field1896, (byte) 116, var4, arg2.field1904, false, arg2.field1899);
            }
            if (~var5 == -3) {
                arg2.field3288 = 0;
            }
        } else {
            if (~arg3 == 0 || arg2.field3320 == -1 || class62.field784.method2566(arg3, -19).field6274 >= class62.field784.method2566(arg2.field3320, arg1 + -19).field6274) {
                arg2.field3376 = arg2.field3369;
                arg2.field3361 = arg0;
                arg2.field3284 = 1;
                arg2.field3320 = arg3;
                arg2.field3277 = 0;
                arg2.field3288 = 0;
                arg2.field3312 = 0;
                if (arg2.field3320 == -1) {
                    return;
                }
                class190.method1213(arg2.field3312, arg2.field1896, (byte) 65, class62.field784.method2566(arg2.field3320, -19), arg2.field1904, false, arg2.field1899);
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Lwm;II)V", line = 196)
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (arg2 == 5159) {
            ++field5071;
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (arg1 != 2) {
                        if (arg1 != 3) {
                            if (arg1 == 4) {
                                this.field5070 = arg0.method2338(0);
                            }
                        } else {
                            this.field5072 = arg0.method2338(0);
                        }
                    } else {
                        this.field5068 = arg0.method2357((byte) 123);
                    }
                } else {
                    this.field5060 = arg0.method2338(0);
                }
            } else {
                this.field5063 = arg0.method2357((byte) 120);
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "h", descriptor = "(I)V", line = 257)
    public static void method2091(int arg0) {
        if (arg0 >= 23) {
            field5073 = null;
            field5074 = null;
            field5064 = null;
        }
    }

    @OriginalMember(owner = "client!is", name = "g", descriptor = "(I)V", line = 274)
    public final void method31(int arg0) {
        ++field5069;
        if (arg0 != -9) {
            this.field5072 = 112;
        }
        class341.method2034(true);
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V", line = 308)
    public class353() {
        super(0, true);
    }
}
