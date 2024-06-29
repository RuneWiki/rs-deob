import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class376 extends class747 {

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    private int field5278 = 3216;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "[I")
    private int[] field5280 = new int[3];

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
    private int field5279 = 4096;

    @OriginalMember(owner = "client!nl", name = "J", descriptor = "I")
    private int field5283 = 3216;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "Lkr;")
    public static class602 field5282 = new class602(77, -1);

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "Lst;")
    public static class335 field5288 = new class335(11, 3);

    @OriginalMember(owner = "client!nl", name = "P", descriptor = "Ljn;")
    public static class324 field5289 = new class324(10, 2, 2, 0);

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!nl", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field5290;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)[I")
    public final int[] method182(int arg0, int arg1) {
        if (arg1 > -89) {
            field5290 = null;
        }
        ++field5284;
        int[] var3 = super.field10279.method3479(true, arg0);
        if (super.field10279.field8263) {
            int var4 = class708.field9888 * this.field5279 >> 12;
            int[] var5 = this.method4156(-122, class415.field5878 & arg0 + -1, 0);
            int[] var6 = this.method4156(-125, arg0, 0);
            int[] var7 = this.method4156(11, class415.field5878 & arg0 + 1, 0);
            for (int var8 = 0; var8 < class73.field1095; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 - 1 & class73.field1097] - var6[var8 + 1 & class73.field1097]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class260.field3755[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var9 * var13 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field5280[2] * var16 >> 12;
                int var18 = this.field5280[0] * var15 >> 12;
                int var19 = this.field5280[1] * var14 >> 12;
                var3[var8] = var17 + var19 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
    public class376() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
    public final void method184(int arg0) {
        this.method2355(~arg0);
        ++field5287;
        if (arg0 != -2) {
            this.field5283 = 97;
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V")
    private final void method2355(int arg0) {
        ++field5285;
        double var2 = Math.cos((double) ((float) this.field5278 / 4096.0F));
        this.field5280[0] = (int) (Math.sin((double) ((float) this.field5283 / 4096.0F)) * var2 * 4096.0D);
        this.field5280[arg0] = (int) (Math.cos((double) ((float) this.field5283 / 4096.0F)) * var2 * 4096.0D);
        this.field5280[2] = (int) (Math.sin((double) ((float) this.field5278 / 4096.0F)) * 4096.0D);
        int var4 = this.field5280[0] * this.field5280[0] >> 12;
        int var5 = this.field5280[1] * this.field5280[1] >> 12;
        int var6 = this.field5280[2] * this.field5280[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field5280[2] = (this.field5280[2] << 12) / var7;
            this.field5280[1] = (this.field5280[1] << 12) / var7;
            this.field5280[0] = (this.field5280[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ldc;II)V")
    public final void method183(class63 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field5278 = arg0.method482(-772591672);
                }
            } else {
                this.field5283 = arg0.method482(arg1 + -772603280);
            }
        } else {
            this.field5279 = arg0.method482(arg1 + -772603280);
        }
        ++field5281;
        if (arg1 != 11608) {
            method2358(-123);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lmfa;B)I")
    public static final int method2356(class409 arg0, byte arg1) {
        ++field5286;
        if (arg1 > -76) {
            field5288 = null;
        }
        int var2 = arg0.method2560(-39, 2);
        int var3;
        if (~var2 == -1) {
            var3 = 0;
        } else if (~var2 == -2) {
            var3 = arg0.method2560(-119, 5);
        } else if (~var2 != -3) {
            var3 = arg0.method2560(-127, 11);
        } else {
            var3 = arg0.method2560(-99, 8);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(III)Lpn;")
    public static final class91 method2357(int arg0, int arg1, int arg2) {
        class262 var3 = class137.field1948[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3845;
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V")
    public static void method2358(int arg0) {
        field5290 = null;
        field5282 = null;
        int var1 = -22 % ((arg0 - 37) / 51);
        field5288 = null;
        field5289 = null;
    }
}
