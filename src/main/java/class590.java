import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class590 {

    @OriginalMember(owner = "client!eba", name = "k", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field8270;

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "Lsw;")
    private class757 field8263;

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field8264;

    @OriginalMember(owner = "client!eba", name = "j", descriptor = "Lfi;")
    private class558 field8269;

    @OriginalMember(owner = "client!eba", name = "l", descriptor = "Lue;")
    private class235 field8271;

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "Lhg;")
    public static class693 field8261 = new class693(77, 7);

    @OriginalMember(owner = "client!eba", name = "p", descriptor = "I")
    public static int field8275 = 0;

    @OriginalMember(owner = "client!eba", name = "n", descriptor = "Lhg;")
    public static class693 field8273 = new class693(82, 4);

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "I")
    public static int field8262;

    @OriginalMember(owner = "client!eba", name = "f", descriptor = "I")
    public static int field8265;

    @OriginalMember(owner = "client!eba", name = "g", descriptor = "I")
    public static int field8266;

    @OriginalMember(owner = "client!eba", name = "h", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!eba", name = "o", descriptor = "I")
    public static int field8274;

    @OriginalMember(owner = "client!eba", name = "i", descriptor = "Lsl;")
    private class461 field8268;

    @OriginalMember(owner = "client!eba", name = "m", descriptor = "Liea;")
    public static class481 field8272;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "[Lmaa;")
    private class473[] field8260;

    @OriginalMember(owner = "client!eba", name = "q", descriptor = "[Lhb;")
    public static class728[] field8276;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(II)V")
    public static final void method3349(int arg0, int arg1) {
        field8274++;
        int var2 = class463.field6224 - field8275;
        if (var2 >= 100) {
            class650.field9023 = 1;
            class35.field560 = -1;
            class746.field10437 = -1;
            return;
        }
        int var3 = (int) class101.field1404;
        if (arg0 != -2017809272) {
            field8275 = 50;
        }
        if (var3 < (class538.field7468 >> 8)) {
            var3 = class538.field7468 >> 8;
        }
        if (class193.field2644[4] && (class332.field4237[4] + 128) > var3) {
            var3 = class332.field4237[4] + 128;
        }
        int var4 = (int) class521.field7309 + class216.field2926 & 0x3FFF;
        class348.method2044((var3 >> 3) * 3 + 600 << 2, class225.method1448(class472.field6329, class380.field4847.field5801, class380.field4847.field5797, (byte) 28) - 200, arg1, var3, class758.field10586, var4, 125, class347.field4454);
        float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
        class450.field5953 = (int) ((float) (class450.field5953 - class140.field1994) * var5 + (float) class140.field1994);
        class318.field4121 = (int) ((float) (class318.field4121 - class179.field2503) * var5 + (float) class179.field2503);
        class66.field954 = (int) ((float) (class66.field954 - class52.field748) * var5 + (float) class52.field748);
        class33.field544 = (int) ((float) (class33.field544 - class264.field3340) * var5 + (float) class264.field3340);
        int var6 = class206.field2731 - class407.field5172;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class206.field2731 = (int) ((float) var6 * var5 + (float) class407.field5172);
        class206.field2731 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V")
    public final void method3350(int arg0) {
        field8266++;
        if (this.field8260 == null || arg0 != -23539) {
            return;
        }
        for (int var2 = 0; var2 < this.field8260.length; var2++) {
            if (this.field8260[var2] != null) {
                this.field8260[var2].method2692(arg0 + 23653);
            }
        }
        for (int var3 = 0; var3 < this.field8260.length; var3++) {
            if (this.field8260[var3] != null) {
                this.field8260[var3].method2690((byte) 102);
            }
        }
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(I)V")
    public static void method3351(int arg0) {
        if (arg0 <= -115) {
            field8261 = null;
            field8273 = null;
            field8276 = null;
            field8272 = null;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Luj;BLuj;I)Lmaa;")
    public final class473 method3352(class387 arg0, byte arg1, class387 arg2, int arg3) {
        field8267++;
        if (arg1 > -21) {
            this.method3354((byte) -107);
        }
        return this.method3353(arg2, 107, true, arg0, arg3);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Luj;IZLuj;I)Lmaa;")
    private final class473 method3353(class387 arg0, int arg1, boolean arg2, class387 arg3, int arg4) {
        field8262++;
        if (this.field8268 == null) {
            throw new RuntimeException();
        } else if (arg4 < 0 || arg4 >= this.field8260.length) {
            throw new RuntimeException();
        } else if (this.field8260[arg4] == null) {
            this.field8268.field6193 = arg4 * 72 + 6;
            int var6 = this.field8268.method2622(-539564808);
            int var7 = this.field8268.method2622(-539564808);
            byte[] var8 = new byte[64];
            this.field8268.method2573(var8, (byte) -77, 64, 0);
            if (arg1 < 87) {
                field8261 = null;
            }
            class473 var9 = new class473(arg4, arg3, arg0, this.field8263, this.field8269, var6, var8, var7, arg2);
            this.field8260[arg4] = var9;
            return var9;
        } else {
            return this.field8260[arg4];
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)Z")
    public final boolean method3354(byte arg0) {
        field8265++;
        if (this.field8268 != null) {
            return true;
        }
        if (this.field8271 == null) {
            if (this.field8263.method4204(-95)) {
                return false;
            }
            this.field8271 = this.field8263.method4203(255, true, 255, 106, (byte) 0);
        }
        if (this.field8271.field1745) {
            return false;
        }
        class461 var2 = new class461(this.field8271.method921((byte) 127));
        var2.field6193 = 5;
        int var3 = var2.method2600((byte) -128);
        var2.field6193 += var3 * 72;
        if (arg0 != 0) {
            return false;
        }
        byte[] var4 = new byte[var2.field6180.length - var2.field6193];
        var2.method2573(var4, (byte) -77, var4.length, 0);
        byte[] var7;
        if (this.field8264 == null || this.field8270 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field8264, this.field8270);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class289.method1732(var2.field6193 - var4.length - 5, 5, var2.field6180, false);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field8260 = new class473[var3];
        this.field8268 = var2;
        return true;
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lsw;Lfi;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class590(class757 arg0, class558 arg1, BigInteger arg2, BigInteger arg3) {
        this.field8270 = arg3;
        this.field8263 = arg0;
        this.field8264 = arg2;
        this.field8269 = arg1;
        if (!this.field8263.method4204(-99)) {
            this.field8271 = this.field8263.method4203(255, true, 255, 127, (byte) 0);
        }
    }
}
