import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class518 extends class747 {

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    private int field7227 = 4096;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    private int field7231 = 0;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "I")
    private int field7234 = 2000;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    private int field7238 = 16;

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
    private int field7237 = 0;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "S")
    public static short field7228 = 1;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!od", name = "P", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "Z")
    public static boolean field7229;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "[Z")
    public static boolean[] field7230;

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    public class518() {
        super(0, true);
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
    public static void method3093(int arg0) {
        field7230 = null;
        if (arg0 != 23173) {
            method3094(-104, -4);
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(II)V")
    public static final void method3094(int arg0, int arg1) {
        class262 var2 = class137.field1948[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class262 var4 = class137.field1948[var3][arg0][arg1] = class137.field1948[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class638 var5 = var4.field3846; var5 != null; var5 = var5.field8564) {
                    class395 var6 = var5.field8567;
                    if (var6.field5680 == arg0 && var6.field5673 == arg1) {
                        --var6.field4408;
                    }
                }
                if (var4.field3844 != null) {
                    --var4.field3844.field4408;
                }
                if (var4.field3845 != null) {
                    --var4.field3845.field4408;
                }
                if (var4.field3842 != null) {
                    --var4.field3842.field4408;
                }
                if (var4.field3841 != null) {
                    --var4.field3841.field4408;
                }
                if (var4.field3850 != null) {
                    --var4.field3850.field4408;
                }
            }
        }
        if (class137.field1948[0][arg0][arg1] == null) {
            class137.field1948[0][arg0][arg1] = new class262(0);
            class137.field1948[0][arg0][arg1].field3852 = 1;
        }
        class137.field1948[0][arg0][arg1].field3847 = var2;
        class137.field1948[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ldc;II)V")
    public final void method183(class63 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 == -5) {
                            this.field7227 = arg0.method482(-772591672);
                        }
                    } else {
                        this.field7237 = arg0.method482(-772591672);
                    }
                } else {
                    this.field7238 = arg0.method505((byte) -119);
                }
            } else {
                this.field7234 = arg0.method482(arg1 + -772603280);
            }
        } else {
            this.field7231 = arg0.method505((byte) -119);
        }
        if (arg1 != 11608) {
            method3094(-52, 63);
        }
        ++field7233;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)[I")
    public final int[] method182(int arg0, int arg1) {
        ++field7235;
        int[] var3 = super.field10279.method3479(true, arg0);
        if (arg1 > -89) {
            this.field7227 = 75;
        }
        if (super.field10279.field8263) {
            int var4 = this.field7227 >> 1;
            int[][] var5 = super.field10279.method3480(0);
            Random var6 = new Random((long) this.field7231);
            for (int var7 = 0; ~var7 > ~this.field7234; ++var7) {
                int var8 = ~this.field7227 < -1 ? this.field7237 - (var4 + -class434.method2677(this.field7227, var6, (byte) -111)) : this.field7237;
                int var9 = var8 >> 4 & 255;
                int var10 = class434.method2677(class73.field1095, var6, (byte) -104);
                int var11 = class434.method2677(class414.field5865, var6, (byte) -123);
                int var12 = (class639.field8569[var9] * this.field7238 >> 12) + var10;
                int var13 = (class472.field6541[var9] * this.field7238 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || ~var14 != -1) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var15 > ~var14;
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
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class434.method2677(4096, var6, (byte) -102) >> 2) + 1024;
                    int var27 = ~var13 < ~var11 ? 1 : -1;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; ~var28 > ~var12; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = class73.field1097 & var28;
                        int var31 = class415.field5878 & var21;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        var24 += var23;
                        if (~var24 < -1) {
                            var21 -= -var27;
                            var24 -= var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public final void method184(int arg0) {
        ++field7236;
        class654.method3655(-59);
        if (arg0 != -2) {
            method3093(19);
        }
    }
}
