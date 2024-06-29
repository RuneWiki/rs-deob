import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class588 {

    @OriginalMember(owner = "client!tw", name = "k", descriptor = "I")
    private int field8266 = -1;

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "Z")
    private boolean field8261 = true;

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "I")
    private int field8258;

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "[Lraa;")
    private class681[] field8259;

    @OriginalMember(owner = "client!tw", name = "m", descriptor = "I")
    private int field8268;

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "I")
    private int field8264;

    @OriginalMember(owner = "client!tw", name = "o", descriptor = "I")
    private int field8270;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "[Lraa;")
    private class681[] field8256;

    @OriginalMember(owner = "client!tw", name = "p", descriptor = "Lraa;")
    private class681 field8271;

    @OriginalMember(owner = "client!tw", name = "l", descriptor = "[Lfca;")
    public static class139[] field8267 = new class139[5];

    @OriginalMember(owner = "client!tw", name = "q", descriptor = "I")
    public static int field8272;

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "I")
    public static int field8257;

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "I")
    private int field8260;

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "I")
    public static int field8262;

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
    public static int field8263;

    @OriginalMember(owner = "client!tw", name = "j", descriptor = "I")
    private int field8265;

    @OriginalMember(owner = "client!tw", name = "n", descriptor = "Lf;")
    private class536 field8269;

    @OriginalMember(owner = "client!tw", name = "r", descriptor = "Z")
    public static boolean field8273;

    static {
        for (int var0 = 0; var0 < field8267.length; var0++) {
            field8267[var0] = new class139();
        }
        field8272 = 1;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)V", line = 3)
    public final void method3237(byte arg0) {
        int var2 = 80 % ((arg0 - 50) / 62);
        if (this.field8259 != null) {
            for (int var3 = 0; var3 < this.field8259.length; var3++) {
                this.field8259[var3].method3840();
            }
        }
        field8262++;
        this.field8269 = null;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(BILr;)Z", line = 28)
    public final boolean method3238(byte arg0, int arg1, class566 arg2) {
        field8257++;
        if (this.field8266 != arg1) {
            this.field8266 = arg1;
            int var4 = class257.method1497((byte) 114, arg1);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field8265 != var4) {
                this.field8265 = var4;
                this.field8269 = null;
            }
            if (this.field8259 != null) {
                this.field8260 = 0;
                int[] var5 = new int[this.field8259.length];
                for (int var6 = 0; var6 < this.field8259.length; var6++) {
                    class681 var7 = this.field8259[var6];
                    if (var7.method3838(this.field8258, this.field8270, this.field8268, this.field8266)) {
                        var5[this.field8260] = var7.field9571;
                        this.field8256[this.field8260++] = var7;
                    }
                }
                class601.method3297(this.field8260 - 1, var5, this.field8256, 1, 0);
            }
            this.field8261 = true;
        }
        boolean var8 = false;
        if (this.field8261) {
            this.field8261 = false;
            for (int var9 = this.field8260 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field8256[var9].method3835(arg2, this.field8271);
                var8 |= var10;
                this.field8261 |= !var10;
            }
        }
        if (arg0 != -113) {
            method3239(-84);
        }
        return var8;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V", line = 109)
    public static void method3239(int arg0) {
        field8267 = null;
        if (arg0 != 0) {
            method3239(81);
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIIBIIIILr;)V", line = 125)
    public final void method3240(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, class566 arg9) {
        int var11 = arg5 + arg7 & 0x3FFF;
        field8263++;
        if (arg4 >= -72) {
            return;
        }
        if (this.field8264 == -1) {
            arg9.method1090(arg1, arg2, arg6, arg3, arg0, 0);
        } else {
            class13 var12 = class177.field2288.method2486(this.field8264, (byte) 86);
            if (this.field8269 == null && class177.field2288.method2480(false, this.field8264)) {
                int[] var13 = var12.field244 ? class177.field2288.method2488(0.7F, this.field8265, (byte) 98, false, this.field8265, this.field8264) : class177.field2288.method2481(this.field8264, 0.7F, false, this.field8265, -5969, this.field8265);
                this.field8269 = arg9.method1025(var13, 0, this.field8265, this.field8265, this.field8265);
            }
            if (var12.field244) {
                arg9.method1090(arg1, arg2, arg6, arg3, arg0, 0);
            }
            if (this.field8269 != null) {
                int var14 = var12.field244 ? 1 : 0;
                int var15 = arg3 * arg8 / -4096;
                int var16;
                for (var16 = arg3 * var11 / 4096 + (arg6 - arg3) / 2; var16 > arg3; var16 -= arg3) {
                }
                while (var15 > arg3) {
                    var15 -= arg3;
                }
                while (var16 < 0) {
                    var16 += arg3;
                }
                while (var15 < 0) {
                    var15 += arg3;
                }
                for (int var17 = var16 - arg3; var17 < arg6; var17 += arg3) {
                    for (int var18 = var15 - arg3; var18 < arg3; var18 += arg3) {
                        this.field8269.method2901(arg1 + var17, arg2 + var18, arg3, arg3, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field8260 - 1; var19 >= 0; var19--) {
            this.field8256[var19].method3830(arg9, arg1, arg2, arg6, arg3, arg8, var11);
        }
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(I[Lraa;IIII)V", line = 227)
    public class588(int arg0, class681[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8258 = arg3;
        this.field8259 = arg1;
        this.field8268 = arg5;
        this.field8264 = arg0;
        this.field8270 = arg4;
        if (arg1 == null) {
            this.field8271 = null;
            this.field8256 = null;
        } else {
            this.field8256 = new class681[arg1.length];
            this.field8271 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
