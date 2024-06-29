import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class448 extends class330 {

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "I")
    private int field6267 = 4096;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    private int field6266 = 409;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
    private int field6268 = 4096;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "[I")
    private int[] field6269 = new int[3];

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    private int field6275 = 4096;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "[I")
    public static int[] field6265 = new int[16384];

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "[I")
    public static int[] field6270 = new int[16384];

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "Ljava/util/Calendar;")
    public static Calendar field6277;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "Ljava/util/Calendar;")
    public static Calendar field6278;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "Ljn;")
    public static class134 field6280;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "Lnf;")
    public static class136 field6274;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "Lae;")
    public static class283 field6272;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "[[B")
    public static byte[][] field6279;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lgga;IB)V")
    public final void method466(class511 arg0, int arg1, byte arg2) {
        ++field6271;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            int var5 = arg0.method2983(true);
                            this.field6269[2] = class407.method2490(0, var5 >> 12);
                            this.field6269[1] = class407.method2490(var5, 65280) >> 4;
                            this.field6269[0] = class407.method2490(var5 << 4, 267386880);
                        }
                    } else {
                        this.field6275 = arg0.method3002(-1);
                    }
                } else {
                    this.field6267 = arg0.method3002(-1);
                }
            } else {
                this.field6268 = arg0.method3002(-1);
            }
        } else {
            this.field6266 = arg0.method3002(-1);
        }
        int var6 = 19 / ((-41 - arg2) / 42);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)[[I")
    public final int[][] method537(int arg0, int arg1) {
        ++field6273;
        int[][] var3 = super.field4621.method1597(arg1, true);
        if (arg0 != 0) {
            return null;
        } else {
            if (super.field4621.field3510) {
                int[][] var4 = this.method2082(arg1, 0, 125);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class80.field901 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = -this.field6269[0] + var12;
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (~var13 < ~this.field6266) {
                        var8[var11] = var12;
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var6[var11];
                        int var15 = -this.field6269[1] + var14;
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        if (var15 > this.field6266) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = var16 - this.field6269[2];
                            if (~var17 > -1) {
                                var17 = -var17;
                            }
                            if (var17 > this.field6266) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field6275 * var12 >> 12;
                                var9[var11] = this.field6267 * var14 >> 12;
                                var10[var11] = this.field6268 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public static void method2715(int arg0) {
        field6278 = null;
        field6280 = null;
        field6279 = null;
        field6272 = null;
        field6265 = null;
        field6274 = null;
        if (arg0 != 1223622372) {
            field6277 = null;
        }
        field6277 = null;
        field6270 = null;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class448() {
        super(1, false);
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; ++var2) {
            field6265[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field6270[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
        field6276 = -1;
        field6277 = Calendar.getInstance();
        field6278 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field6280 = new class134(47, 6);
    }
}
