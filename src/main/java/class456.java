import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class456 extends class330 {

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
    private int field6373 = 3216;

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "[I")
    private int[] field6377 = new int[3];

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
    private int field6375 = 3216;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "I")
    private int field6381 = 4096;

    @OriginalMember(owner = "client!mf", name = "L", descriptor = "I")
    public static int field6378 = 765;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "Lae;")
    public static class283 field6372;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "Lae;")
    public static class283 field6376;

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "[Lmr;")
    public static class238[] field6371;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lgga;IB)V")
    public final void method466(class511 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field6373 = arg0.method3002(-1);
                }
            } else {
                this.field6375 = arg0.method3002(-1);
            }
        } else {
            this.field6381 = arg0.method3002(-1);
        }
        int var5 = -106 % ((-41 - arg2) / 42);
        ++field6383;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
    public static void method2746(int arg0) {
        field6372 = null;
        if (arg0 <= -16) {
            field6376 = null;
            field6371 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(B)V")
    public final void method653(byte arg0) {
        this.method2747(0);
        ++field6370;
        int var2 = -97 % ((50 - arg0) / 41);
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
    public class456() {
        super(1, true);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZ)[I")
    public final int[] method464(int arg0, boolean arg1) {
        ++field6374;
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (arg1) {
            method2748(-10, 114, 34);
        }
        if (super.field4630.field5704) {
            int var4 = class689.field9608 * this.field6381 >> 12;
            int[] var5 = this.method2084(0, arg0 + -1 & class385.field5505, (byte) 36);
            int[] var6 = this.method2084(0, arg0, (byte) -113);
            int[] var7 = this.method2084(0, arg0 + 1 & class385.field5505, (byte) 31);
            for (int var8 = 0; var8 < class80.field901; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class639.field8988] - var6[var8 - -1 & class639.field8988]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class275.field3974[var11 - -((var12 + 1) * var12 >> 1)];
                int var14 = var10 * var13 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field6377[0] * var14 >> 12;
                int var18 = this.field6377[1] * var15 >> 12;
                int var19 = this.field6377[2] * var16 >> 12;
                var3[var8] = var17 + var18 + var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
    private final void method2747(int arg0) {
        ++field6384;
        double var2 = Math.cos((double) ((float) this.field6373 / 4096.0F));
        this.field6377[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field6375 / 4096.0F)));
        this.field6377[1] = (int) (4096.0D * Math.cos((double) ((float) this.field6375 / 4096.0F)) * var2);
        this.field6377[2] = (int) (4096.0D * Math.sin((double) ((float) this.field6373 / 4096.0F)));
        int var4 = this.field6377[arg0] * this.field6377[0] >> 12;
        int var5 = this.field6377[1] * this.field6377[1] >> 12;
        int var6 = this.field6377[2] * this.field6377[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 + var6 >> 12)));
        if (var7 != 0) {
            this.field6377[2] = (this.field6377[2] << 12) / var7;
            this.field6377[1] = (this.field6377[1] << 12) / var7;
            this.field6377[0] = (this.field6377[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(III)V")
    public static final void method2748(int arg0, int arg1, int arg2) {
        ++field6380;
        class17 var3 = class245.method1634(1, (long) arg0, arg2);
        var3.method66((byte) -106);
        var3.field107 = arg1;
    }
}
