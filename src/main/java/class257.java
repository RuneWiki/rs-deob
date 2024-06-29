import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class257 extends class264 {

    @OriginalMember(owner = "client!gj", name = "qb", descriptor = "I")
    private int field4398 = 0;

    @OriginalMember(owner = "client!gj", name = "rb", descriptor = "I")
    private int field4399 = 2000;

    @OriginalMember(owner = "client!gj", name = "sb", descriptor = "I")
    private int field4400 = 0;

    @OriginalMember(owner = "client!gj", name = "fb", descriptor = "I")
    private int field4387 = 4096;

    @OriginalMember(owner = "client!gj", name = "lb", descriptor = "I")
    private int field4393 = 16;

    @OriginalMember(owner = "client!gj", name = "ib", descriptor = "Lma;")
    public static class5 field4390 = class12.method119("VOLL", (byte) 127);

    @OriginalMember(owner = "client!gj", name = "mb", descriptor = "I")
    public static int field4394 = 0;

    @OriginalMember(owner = "client!gj", name = "nb", descriptor = "[I")
    public static int[] field4395 = new int[2];

    @OriginalMember(owner = "client!gj", name = "pb", descriptor = "Z")
    public static boolean field4397 = false;

    @OriginalMember(owner = "client!gj", name = "yb", descriptor = "Lma;")
    public static class5 field4406 = class12.method119("(U2", (byte) 82);

    @OriginalMember(owner = "client!gj", name = "vb", descriptor = "[I")
    public static int[] field4403 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!gj", name = "gb", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!gj", name = "hb", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!gj", name = "jb", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!gj", name = "kb", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!gj", name = "ob", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!gj", name = "tb", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!gj", name = "ub", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!gj", name = "zb", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!gj", name = "wb", descriptor = "[I")
    public static int[] field4404;

    @OriginalMember(owner = "client!gj", name = "xb", descriptor = "[I")
    public static int[] field4405;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(II)V", line = 5)
    public static final void method1788(int arg0, int arg1) {
        class212.field3377.method517(false, arg0);
        if (arg1 == -7409) {
            field4388++;
            class192.field2986.method517(false, arg0);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILii;)V", line = 24)
    public final void method4(int arg0, int arg1, class221 arg2) {
        if (arg1 > -27) {
            return;
        }
        if (arg0 == 0) {
            this.field4398 = arg2.method1509(true);
        } else if (arg0 == 1) {
            this.field4399 = arg2.method1524((byte) 65);
        } else if (arg0 == 2) {
            this.field4393 = arg2.method1509(true);
        } else if (arg0 == 3) {
            this.field4400 = arg2.method1524((byte) 105);
        } else if (arg0 == 4) {
            this.field4387 = arg2.method1524((byte) 69);
        }
        field4389++;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)[I", line = 94)
    public final int[] method5(int arg0, int arg1) {
        field4396++;
        if (arg0 >= -58) {
            field4395 = (int[]) null;
        }
        int[] var3 = this.field4501.method1176(arg1, 124);
        if (this.field4501.field2741) {
            int var4 = this.field4387 >> 1;
            int[][] var5 = this.field4501.method1175((byte) 86);
            Random var6 = new Random((long) this.field4398);
            for (int var7 = 0; var7 < this.field4399; var7++) {
                int var8 = this.field4387 <= 0 ? this.field4400 : this.field4400 + class81.method555((byte) -57, this.field4387, var6) - var4;
                int var9 = (var8 & 0xFFB) >> 4;
                int var10 = class81.method555((byte) -57, class226.field3716, var6);
                int var11 = class81.method555((byte) -57, class119.field1807, var6);
                int var12 = (class195.field3043[var9] * this.field4393 >> 12) + var10;
                int var13 = (field4404[var9] * this.field4393 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = var12 - var10;
                if (var15 != 0 || var14 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var12 = var13;
                        var13 = var18;
                        var10 = var11;
                        var11 = var17;
                    }
                    if (var10 > var12) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var11 = var13;
                        var13 = var20;
                        var12 = var19;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = var13 - var11;
                    int var24 = -var22 / 2;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class81.method555((byte) -57, 4096, var6) >> 2);
                    int var27 = var11 < var13 ? 1 : -1;
                    for (int var28 = var10; var28 < var12; var28++) {
                        var24 += var23;
                        int var29 = var21 & class68.field1082;
                        int var30 = var26 + ((var28 - var10) * var25) + 1024;
                        if (var24 > 0) {
                            var24 += -var22;
                            var21 += var27;
                        }
                        int var31 = var28 & class256.field4370;
                        if (var16) {
                            var5[var29][var31] = var30;
                        } else {
                            var5[var31][var29] = var30;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V", line = 237)
    public class257() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "(I)V", line = 241)
    public static void method1789(int arg0) {
        field4404 = null;
        field4395 = null;
        field4403 = null;
        if (arg0 == 1907563012) {
            field4390 = null;
            field4405 = null;
            field4406 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)V", line = 260)
    public final void method111(int arg0) {
        class90.method592(0);
        int var2 = 92 % ((66 - arg0) / 44);
        field4392++;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILni;)V", line = 280)
    public static final void method1790(int arg0, class202 arg1) {
        class201.field3196 = arg1;
        field4407++;
        if (arg0 != 4) {
            field4390 = (class5) null;
        }
    }
}
