import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class423 {

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "Lff;")
    private class9 field6085;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field6078;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field6083;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "Lcr;")
    private class598 field6073;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "Lqga;")
    private class197 field6076;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "S")
    public static short field6086 = 320;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
    public static int field6082;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "Ldt;")
    private class254 field6081;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "[Lmha;")
    private class435[] field6075;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
    public final void method2546(int arg0) {
        field6084++;
        if (this.field6075 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field6075.length; var2++) {
            if (this.field6075[var2] != null) {
                this.field6075[var2].method2608(true);
            }
        }
        if (arg0 != -123) {
            method2550(-22, -91, -54);
        }
        for (int var3 = 0; var3 < this.field6075.length; var3++) {
            if (this.field6075[var3] != null) {
                this.field6075[var3].method2605((byte) -110);
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)Z")
    public final boolean method2547(boolean arg0) {
        field6079++;
        if (this.field6081 != null) {
            return true;
        }
        if (this.field6076 == null) {
            if (this.field6085.method56(20)) {
                return false;
            }
            this.field6076 = this.field6085.method52(255, 255, (byte) 0, true, (byte) -87);
        }
        if (this.field6076.field295) {
            return false;
        }
        class254 var2 = new class254(this.field6076.method171((byte) 90));
        var2.field3725 = 5;
        int var3 = var2.method1731((byte) 64);
        var2.field3725 += var3 * 72;
        byte[] var4 = new byte[var2.field3789.length - var2.field3725];
        var2.method1735(0, -124, var4, var4.length);
        byte[] var7;
        if (this.field6083 == null || this.field6078 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field6083, this.field6078);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class514.method3005(var2.field3789, arg0, var2.field3725 - var4.length - 5, 5);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field6075 = new class435[var3];
        this.field6081 = var2;
        return true;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILnaa;ILnaa;)Lmha;")
    public final class435 method2548(int arg0, class79 arg1, int arg2, class79 arg3) {
        if (arg2 != 255) {
            field6086 = 96;
        }
        field6077++;
        return this.method2551(arg0, arg3, true, arg1, 0);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
    public static final void method2549(byte arg0) {
        class311.field4406.method408(true);
        field6080++;
        if (arg0 != -100) {
            method2550(-108, -68, 41);
        }
        class348.field5049 = null;
        class765.field10514 = null;
        class289.field4115 = 1;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)Z")
    public static final boolean method2550(int arg0, int arg1, int arg2) {
        field6082++;
        if (arg1 == 29903) {
            return (arg2 & 0x70000) != 0 | class357.method2267(arg0, false, arg2) || class429.method2579(arg0, arg2, (byte) 97);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lff;Lcr;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class423(class9 arg0, class598 arg1, BigInteger arg2, BigInteger arg3) {
        this.field6085 = arg0;
        this.field6078 = arg3;
        this.field6083 = arg2;
        this.field6073 = arg1;
        if (!this.field6085.method56(20)) {
            this.field6076 = this.field6085.method52(255, 255, (byte) 0, true, (byte) -87);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILnaa;ZLnaa;I)Lmha;")
    private final class435 method2551(int arg0, class79 arg1, boolean arg2, class79 arg3, int arg4) {
        field6074++;
        if (this.field6081 == null) {
            throw new RuntimeException();
        } else if (arg0 < 0 || arg0 >= this.field6075.length) {
            throw new RuntimeException();
        } else if (this.field6075[arg0] == null) {
            this.field6081.field3725 = arg0 * 72 + 6;
            int var6 = this.field6081.method1672(-16516);
            int var7 = this.field6081.method1672(-16516);
            byte[] var8 = new byte[64];
            this.field6081.method1735(arg4, 69, var8, 64);
            class435 var9 = new class435(arg0, arg3, arg1, this.field6085, this.field6073, var6, var8, var7, arg2);
            this.field6075[arg0] = var9;
            return var9;
        } else {
            return this.field6075[arg0];
        }
    }
}
