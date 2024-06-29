import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class64 extends class331 {

    @OriginalMember(owner = "client!di", name = "L", descriptor = "I")
    private int field737;

    @OriginalMember(owner = "client!di", name = "G", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!di", name = "I", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!di", name = "K", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!di", name = "M", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!di", name = "N", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!di", name = "F", descriptor = "[Lac;")
    public class320[] field731;

    @OriginalMember(owner = "client!di", name = "H", descriptor = "[[B")
    private byte[][] field733;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)Z")
    public final boolean method362(byte arg0, int arg1) {
        if (arg0 != -85) {
            method365(-86);
        }
        field734++;
        return this.field731[arg1].field4559;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IILon;ILhb;IIII)V")
    public static final void method363(int arg0, int arg1, class184 arg2, int arg3, class433 arg4, int arg5, int arg6, int arg7, int arg8) {
        field739++;
        int var9 = arg5 * arg5 + arg7 * arg7;
        if (arg1 < var9) {
            return;
        }
        int var10 = Math.min(arg2.field2618 / 2, arg2.field2516 / 2);
        if (arg8 > -90) {
            method365(105);
        }
        if (var10 * var10 >= var9) {
            class435.method2730(arg7, class7.field98[arg6], arg2, arg0, (byte) 76, arg4, arg5, arg3);
            return;
        }
        var10 -= 10;
        int var11;
        if (class129.field1568 == 4) {
            var11 = (int) class441.field6333 & 0x3FFF;
        } else {
            var11 = (int) class441.field6333 + class297.field4137 & 0x3FFF;
        }
        int var12 = class158.field2055[var11];
        int var13 = class158.field2059[var11];
        if (class129.field1568 != 4) {
            var12 = var12 * 256 / (class292.field4089 + 256);
            var13 = var13 * 256 / (class292.field4089 + 256);
        }
        int var14 = arg7 * var12 + (arg5 * var13) >> 15;
        int var15 = arg7 * var13 - (arg5 * var12) >> 15;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) (Math.sin(var16) * (double) var10);
        int var19 = (int) (Math.cos(var16) * (double) var10);
        class279.field3953[arg6].method2448((float) arg2.field2618 / 2.0F + (float) arg0 + (float) var18, (float) arg2.field2516 / 2.0F + (float) arg3 + (float) (-var19), 4096, (int) (-var16 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(B)Lgk;")
    public static final class278 method364(byte arg0) {
        field736++;
        class278 var1 = (class278) class153.field1895.method2512((byte) 46);
        if (var1 == null) {
            if (arg0 > -89) {
                method363(97, -43, (class184) null, -74, (class433) null, 0, -37, -83, 16);
            }
            return new class278();
        } else {
            class3.field23--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "(I)V")
    public static final void method365(int arg0) {
        field735++;
        class209 var1 = (class209) class257.field3687.method2509((byte) 51);
        if (arg0 == 12044) {
            while (var1 != null) {
                var1.method1366();
                var1 = (class209) class257.field3687.method2515(arg0 ^ 0x2F0C);
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)Z")
    public final boolean method366(int arg0, int arg1) {
        field738++;
        if (arg0 != 255) {
            method363(32, 106, (class184) null, 56, (class433) null, -124, -125, -45, 96);
        }
        return this.field731[arg1].field4567;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(B)Z")
    public final boolean method367(byte arg0) {
        field732++;
        if (this.field731 != null) {
            return true;
        } else if (arg0 <= 45) {
            return false;
        } else {
            if (this.field733 == null) {
                if (!class435.field6273.method2429((byte) -75, this.field737)) {
                    return false;
                }
                int[] var2 = class435.field6273.method2419((byte) 95, this.field737);
                this.field733 = new byte[var2.length][];
                for (int var3 = 0; var3 < var2.length; var3++) {
                    this.field733[var3] = class435.field6273.method2431((byte) 71, this.field737, var2[var3]);
                }
            }
            boolean var4 = true;
            for (int var5 = 0; var5 < this.field733.length; var5++) {
                byte[] var14 = this.field733[var5];
                int var15 = var14[0] & 0xFF << 8 | var14[1] & 0xFF;
                var4 &= class337.field4792.method2412(var15, 121);
            }
            if (!var4) {
                return false;
            }
            class92 var6 = new class92();
            int var7 = class435.field6273.method2415(this.field737, (byte) 56);
            this.field731 = new class320[var7];
            int[] var8 = class435.field6273.method2419((byte) 95, this.field737);
            for (int var9 = 0; var9 < var8.length; var9++) {
                byte[] var10 = this.field733[var9];
                int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
                class33 var12 = null;
                for (class33 var13 = (class33) var6.method506((byte) -128); var13 != null; var13 = (class33) var6.method514(true)) {
                    if (var13.field378 == var11) {
                        var12 = var13;
                        break;
                    }
                }
                if (var12 == null) {
                    var12 = new class33(var11, class337.field4792.method2420(var11, -1));
                    var6.method509((byte) 119, var12);
                }
                this.field731[var8[var9]] = new class320(var10, var12);
            }
            this.field733 = null;
            return true;
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(I)V")
    public class64(int arg0) {
        this.field737 = arg0;
    }
}
