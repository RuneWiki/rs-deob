import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class46 {

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
    public int field703;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public int field704;

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "I")
    public int field709;

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "I")
    private int field712;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "B")
    public byte field699;

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "Lqr;")
    public class46 field710;

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "[I")
    public static int[] field711 = new int[500];

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public int field701;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public int field702;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    public int field705;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public int field706;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
    public int field707;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
    public int field708;

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "I")
    public int field714;

    @OriginalMember(owner = "client!qr", name = "q", descriptor = "I")
    public int field715;

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
    public int field716;

    @OriginalMember(owner = "client!qr", name = "s", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IBII)Lqr;")
    public final class46 method348(int arg0, byte arg1, int arg2, int arg3) {
        field717++;
        int var5 = -86 / ((38 - arg1) / 44);
        return new class46(this.field712, arg2, arg0, arg3, this.field699);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)Lrm;")
    public final class281 method349(byte arg0) {
        if (arg0 != -88) {
            this.field704 = 78;
        }
        field700++;
        return class217.method1446(false, this.field712);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
    public static void method350(int arg0) {
        if (arg0 != -1913087156) {
            field711 = null;
        }
        field711 = null;
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(IIIIB)V")
    public class46(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field703 = arg1;
        this.field704 = arg2;
        this.field709 = arg3;
        this.field712 = arg0;
        this.field699 = arg4;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIIIIIIBI)V")
    public static final void method351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        if (arg1 == arg2 && arg5 == arg7 && arg3 == arg6 && arg0 == arg4) {
            class145.method1042(arg6, arg1, 6113, arg7, arg4, arg9);
        } else {
            int var10 = arg1;
            int var11 = arg7;
            int var12 = arg1 * 3;
            int var13 = arg7 * 3;
            int var14 = arg2 * 3;
            int var15 = arg5 * 3;
            int var16 = arg3 * 3;
            int var17 = arg0 * 3;
            int var18 = var14 + arg6 - var16 - arg1;
            int var19 = arg4 + var15 - var17 - arg7;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var13 + var17 - (var15 + var15);
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 - (-var29 - var31) >> 12) + arg1;
                int var34 = (var28 + var30 + var32 >> 12) + arg7;
                class145.method1042(var33, var10, 6113, var11, var34, arg9);
                var10 = var33;
                var11 = var34;
            }
        }
        field713++;
        if (arg8 != -39) {
            field711 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lqr;I)V")
    public class46(class46 arg0, int arg1) {
        this.field710 = arg0;
        this.field703 = this.field710.field703 + arg1;
        this.field712 = this.field710.field712;
        this.field709 = this.field710.field709 + arg1;
        this.field699 = this.field710.field699;
        this.field704 = this.field710.field704 + arg1;
    }
}
