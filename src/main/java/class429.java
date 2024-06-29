import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class429 extends class5 {

    @OriginalMember(owner = "client!sv", name = "I", descriptor = "I")
    private int field5372 = 2000;

    @OriginalMember(owner = "client!sv", name = "L", descriptor = "I")
    private int field5375 = 0;

    @OriginalMember(owner = "client!sv", name = "K", descriptor = "I")
    private int field5374 = 0;

    @OriginalMember(owner = "client!sv", name = "O", descriptor = "I")
    private int field5378 = 16;

    @OriginalMember(owner = "client!sv", name = "J", descriptor = "I")
    private int field5373 = 4096;

    @OriginalMember(owner = "client!sv", name = "P", descriptor = "Lwp;")
    public static class453 field5379 = new class453(90, 0);

    @OriginalMember(owner = "client!sv", name = "Q", descriptor = "Lwp;")
    public static class453 field5380 = new class453(116, 0);

    @OriginalMember(owner = "client!sv", name = "S", descriptor = "Z")
    public static boolean field5382 = false;

    @OriginalMember(owner = "client!sv", name = "H", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!sv", name = "M", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!sv", name = "N", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!sv", name = "R", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!sv", name = "T", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)V")
    public final void method46(int arg0) {
        int var2 = -58 / ((arg0 - 64) / 60);
        class205.method1241(0);
        ++field5377;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILes;I)V")
    public final void method47(int arg0, class630 arg1, int arg2) {
        if (arg0 == 1) {
            ++field5371;
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (~arg2 != -3) {
                        if (arg2 != 3) {
                            if (~arg2 == -5) {
                                this.field5373 = arg1.method3470(13111);
                            }
                        } else {
                            this.field5374 = arg1.method3470(13111);
                        }
                    } else {
                        this.field5378 = arg1.method3501(-9268);
                    }
                } else {
                    this.field5372 = arg1.method3470(13111);
                }
            } else {
                this.field5375 = arg1.method3501(-9268);
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BI)Lce;")
    public static final class446 method2269(byte arg0, int arg1) {
        ++field5381;
        class446 var2 = (class446) class219.field2682.method2418((long) arg1, (byte) 100);
        if (var2 != null) {
            return var2;
        } else {
            int var3 = 64 % ((arg0 - -62) / 58);
            byte[] var4 = class67.field908.method3365(arg1, 75, 0);
            class446 var5 = new class446();
            if (var4 != null) {
                var5.method2383((byte) 91, new class630(var4));
            }
            var5.method2386(-4);
            class219.field2682.method2409((long) arg1, var5, 1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field5376;
        int[] var3 = super.field126.method3280(arg1, true);
        if (super.field126.field8392) {
            int var4 = this.field5373 >> 1;
            int[][] var5 = super.field126.method3282(false);
            Random var6 = new Random((long) this.field5375);
            for (int var7 = 0; this.field5372 > var7; ++var7) {
                int var8 = this.field5373 <= 0 ? this.field5374 : this.field5374 - var4 - -class517.method2801(var6, this.field5373, 124);
                int var9 = (4086 & var8) >> 4;
                int var10 = class517.method2801(var6, class657.field9287, 123);
                int var11 = class517.method2801(var6, class622.field8706, 123);
                int var12 = var10 - -(class100.field1358[var9] * this.field5378 >> 12);
                int var13 = (class267.field3384[var9] * this.field5378 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = var12 - var10;
                if (var15 != 0 || var14 != 0) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var14 > var15;
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
                    int var26 = 1024 - (class517.method2801(var6, 4096, 122) >> 2);
                    int var27 = var11 < var13 ? 1 : -1;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; var28 < var12; ++var28) {
                        int var29 = var26 - -1024 - -((-var10 + var28) * var25);
                        int var30 = var28 & class194.field2440;
                        int var31 = class669.field9431 & var21;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        var24 += var23;
                        if (var24 > 0) {
                            var24 -= var22;
                            var21 += var27;
                        }
                    }
                }
            }
        }
        int var32 = -119 % ((arg0 - 81) / 36);
        return var3;
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "()V")
    public class429() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "(I)V")
    public static void method2270(int arg0) {
        field5380 = null;
        field5379 = null;
        if (arg0 != -1024) {
            field5379 = null;
        }
    }
}
