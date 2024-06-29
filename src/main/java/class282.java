import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class282 extends class138 {

    @OriginalMember(owner = "client!rga", name = "v", descriptor = "I")
    private int field3520;

    @OriginalMember(owner = "client!rga", name = "B", descriptor = "I")
    private int field3526;

    @OriginalMember(owner = "client!rga", name = "P", descriptor = "I")
    private int field3539;

    @OriginalMember(owner = "client!rga", name = "I", descriptor = "I")
    private int field3533;

    @OriginalMember(owner = "client!rga", name = "H", descriptor = "I")
    public static int field3532 = 0;

    @OriginalMember(owner = "client!rga", name = "G", descriptor = "Lgk;")
    public static class616 field3531 = new class616();

    @OriginalMember(owner = "client!rga", name = "J", descriptor = "[Ljw;")
    public static class263[] field3534 = new class263[4];

    @OriginalMember(owner = "client!rga", name = "w", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!rga", name = "y", descriptor = "I")
    private int field3523;

    @OriginalMember(owner = "client!rga", name = "z", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!rga", name = "A", descriptor = "I")
    private int field3525;

    @OriginalMember(owner = "client!rga", name = "C", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!rga", name = "D", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!rga", name = "E", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!rga", name = "F", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!rga", name = "L", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!rga", name = "M", descriptor = "I")
    private int field3537;

    @OriginalMember(owner = "client!rga", name = "O", descriptor = "I")
    private int field3538;

    @OriginalMember(owner = "client!rga", name = "K", descriptor = "Lla;")
    public static class413 field3535;

    @OriginalMember(owner = "client!rga", name = "x", descriptor = "[B")
    private byte[] field3522;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(III)V", line = 3)
    public final void method776(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method1653(null, -123, null, null);
        }
        field3527++;
        if (arg2 == 0) {
            this.field3523 = this.field3520 - (arg0 >= 0 ? arg0 : -arg0);
            this.field3537 = 4096;
            this.field3523 = this.field3523 * this.field3523 >> 12;
            this.field3525 = this.field3523;
            return;
        }
        this.field3537 = this.field3526 * this.field3523 >> 12;
        if (this.field3537 < 0) {
            this.field3537 = 0;
        } else if (this.field3537 > 4096) {
            this.field3537 = 4096;
        }
        this.field3523 = this.field3520 - (arg0 >= 0 ? arg0 : -arg0);
        this.field3523 = this.field3523 * this.field3523 >> 12;
        this.field3523 = this.field3537 * this.field3523 >> 12;
        this.field3525 += this.field3533 * this.field3523 >> 12;
        this.field3533 = this.field3539 * this.field3533 >> 12;
    }

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(I)V", line = 45)
    public static void method1651(int arg0) {
        field3531 = null;
        if (arg0 == 8845) {
            field3535 = null;
            field3534 = null;
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(I)V", line = 57)
    public final void method772(int arg0) {
        this.field3538 = 0;
        this.field3525 = 0;
        if (arg0 != 30321) {
            field3531 = null;
        }
        field3536++;
    }

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(B)V", line = 73)
    public final void method770(byte arg0) {
        this.field3525 >>= 0x4;
        field3529++;
        this.field3533 = this.field3539;
        if (this.field3525 < 0) {
            this.field3525 = 0;
        } else if (this.field3525 > 255) {
            this.field3525 = 255;
        }
        this.method567(this.field3538++, (byte) this.field3525, (byte) 26);
        this.field3525 = 0;
        if (arg0 != -60) {
            this.method567(-14, (byte) -95, (byte) 37);
        }
    }

    @OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(IIIIIFFF)V", line = 103)
    public class282(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3520 = (int) (arg6 * 4096.0F);
        this.field3526 = (int) (arg7 * 4096.0F);
        this.field3533 = this.field3539 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(IBB)V", line = 113)
    public void method567(int arg0, byte arg1, byte arg2) {
        field3521++;
        if (arg2 != 26) {
            this.field3539 = 32;
        }
        this.field3522[arg0] = arg1;
    }

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "(I)Lgu;", line = 132)
    public static final class130 method1652(int arg0) {
        field3530++;
        if (arg0 != 0) {
            field3531 = null;
        }
        return class372.field5073 < class114.field1202.length ? class114.field1202[class372.field5073++] : null;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lkca;ILr;Lwl;)V", line = 147)
    public static final void method1653(class655 arg0, int arg1, class564 arg2, class679 arg3) {
        field3524++;
        class534 var4 = arg0.method3641(arg2, 1293700637);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method315();
        if (var4.method306() > var5) {
            var5 = var4.method306();
        }
        byte var6 = 10;
        int var7 = arg3.field9560;
        int var8 = arg3.field9564;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg0.field9214 != null) {
            var9 = class104.field1128.method2659(null, null, arg0.field9214, (byte) -91, class610.field8592);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class610.field8592[var12];
                if (var12 < (var9 - 1)) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class681.field9605.method1064(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = var9 * class681.field9605.method1062() + (class681.field9605.method1061() / 2);
        }
        int var15 = var5 / 2 + arg3.field9560;
        int var16 = arg3.field9564;
        if (var7 < (class482.field6961 + var5)) {
            var15 = var10 / 2 + (var5 / 2 + class482.field6961 + var6 + 5);
            var7 = class482.field6961;
        } else if ((class482.field6957 - var5) < var7) {
            var15 = class482.field6957 - var6 - var10 / 2 - (var5 / 2) - 5;
            var7 = class482.field6957 - var5;
        }
        if (var8 < (class482.field6945 + var5)) {
            var8 = class482.field6945;
            var16 = class482.field6945 + (var5 / 2) + var6;
        } else if (var8 > (class482.field6944 - var5)) {
            var8 = class482.field6944 - var5;
            var16 = class482.field6944 - var5 / 2 - var6 - var11;
        }
        if (arg1 <= 86) {
            field3534 = null;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg3.field9560), (double) (var8 - arg3.field9564)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method2999((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg0.field9214 != null) {
            var18 = var15 - (var10 / 2) - 5;
            var19 = var16;
            var20 = var18 + var10 + 10;
            var21 = var16 + (var9 * class681.field9605.method1062()) + 3;
            if (arg0.field9210 != 0) {
                arg2.method3206(var21 - var16, (byte) 115, var18, var16, arg0.field9210, var20 - var18);
            }
            if (arg0.field9218 != 0) {
                arg2.method3201(arg0.field9218, var20 - var18, 6195, var21 - var16, var16, var18);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class610.field8592[var22];
                if (var9 - 1 > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class681.field9605.method1060(arg2, var23, var15, var16, arg0.field9202, true);
                var16 += class681.field9605.method1062();
            }
        }
        if (arg0.field9206 == -1 && arg0.field9214 == null) {
            return;
        }
        class375 var24 = new class375(arg3);
        int var25 = var5 >> 1;
        var24.field5100 = var7 + var25;
        var24.field5102 = var19;
        var24.field5094 = var18;
        var24.field5099 = var20;
        var24.field5096 = var8 + var25;
        var24.field5093 = var8 - var25;
        var24.field5106 = var21;
        var24.field5105 = var7 - var25;
        class258.field3240.method3425(var24, false);
    }
}
