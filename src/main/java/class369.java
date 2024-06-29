import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class369 {

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field4516;

    @OriginalMember(owner = "client!mda", name = "o", descriptor = "Lqv;")
    private class116 field4528;

    @OriginalMember(owner = "client!mda", name = "h", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field4521;

    @OriginalMember(owner = "client!mda", name = "e", descriptor = "Lhh;")
    private class554 field4518;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "Lkd;")
    private class106 field4514;

    @OriginalMember(owner = "client!mda", name = "k", descriptor = "F")
    public static float field4524;

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!mda", name = "g", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!mda", name = "i", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!mda", name = "j", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!mda", name = "l", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!mda", name = "n", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!mda", name = "p", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!mda", name = "q", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!mda", name = "f", descriptor = "Lmc;")
    private class234 field4519;

    @OriginalMember(owner = "client!mda", name = "m", descriptor = "[Llda;")
    private class594[] field4526;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IZLcr;Lcr;I)Llda;")
    private final class594 method2117(int arg0, boolean arg1, class310 arg2, class310 arg3, int arg4) {
        field4530++;
        if (this.field4519 == null) {
            throw new RuntimeException();
        } else if (arg4 < 0 || this.field4526.length <= arg4) {
            throw new RuntimeException();
        } else if (this.field4526[arg4] == null) {
            this.field4519.field3133 = arg4 * 72 + 6;
            int var6 = this.field4519.method1497((byte) 61);
            int var7 = this.field4519.method1497((byte) 51);
            byte[] var8 = new byte[64];
            int var9 = 12 / ((arg0 - 19) / 63);
            this.field4519.method1495(64, 0, (byte) -126, var8);
            class594 var10 = new class594(arg4, arg3, arg2, this.field4528, this.field4518, var6, var8, var7, arg1);
            this.field4526[arg4] = var10;
            return var10;
        } else {
            return this.field4526[arg4];
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lmc;I)Lwja;")
    public static final class7 method2118(class234 arg0, int arg1) {
        int var2 = 127 % ((arg1 + 71) / 42);
        field4515++;
        class7 var3 = new class7();
        var3.field67 = arg0.method1553((byte) -123);
        var3.field70 = class389.field4977.method2859((byte) -116, var3.field67);
        return var3;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)V")
    public final void method2119(byte arg0) {
        field4517++;
        if (this.field4526 == null) {
            return;
        }
        int var2 = 0;
        if (arg0 != -12) {
            this.field4514 = null;
        }
        while (this.field4526.length > var2) {
            if (this.field4526[var2] != null) {
                this.field4526[var2].method3198((byte) -126);
            }
            var2++;
        }
        for (int var3 = 0; var3 < this.field4526.length; var3++) {
            if (this.field4526[var3] != null) {
                this.field4526[var3].method3194((byte) 0);
            }
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;)V")
    public static final void method2120(String arg0, int arg1, byte arg2, String arg3) {
        class530.field6723 = arg1;
        class1.field6 = 2;
        field4520++;
        if (arg2 != -13) {
            field4522 = 67;
        }
        class181.method1210(arg0, arg3, false, (byte) 37);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILcr;ILcr;)Llda;")
    public final class594 method2121(int arg0, class310 arg1, int arg2, class310 arg3) {
        field4523++;
        if (arg2 != -5) {
            this.method2121(-28, null, -83, null);
        }
        return this.method2117(-55, true, arg1, arg3, arg0);
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(B)Z")
    public final boolean method2122(byte arg0) {
        field4525++;
        if (this.field4519 != null) {
            return true;
        }
        if (this.field4514 == null) {
            if (this.field4528.method682((byte) 9)) {
                return false;
            }
            this.field4514 = this.field4528.method681(true, 255, (byte) 0, 255, 20);
        }
        if (this.field4514.field10779) {
            return false;
        }
        class234 var2 = new class234(this.field4514.method629(arg0 ^ 0xFFFFFFB1));
        var2.field3133 = 5;
        int var3 = var2.method1509(true);
        var2.field3133 += var3 * 72;
        byte[] var4 = new byte[var2.field3193.length - var2.field3133];
        var2.method1495(var4.length, 0, (byte) -128, var4);
        byte[] var7;
        if (this.field4516 == null || this.field4521 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field4516, this.field4521);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class172.method1082(var2.field3193, var2.field3133 - var4.length - 5, arg0 ^ 0xFFFFFF8F, 5);
        if (arg0 != -79) {
            return false;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field4526 = new class594[var3];
        this.field4519 = var2;
        return true;
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lqv;Lhh;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class369(class116 arg0, class554 arg1, BigInteger arg2, BigInteger arg3) {
        this.field4516 = arg2;
        this.field4528 = arg0;
        this.field4521 = arg3;
        this.field4518 = arg1;
        if (!this.field4528.method682((byte) 42)) {
            this.field4514 = this.field4528.method681(true, 255, (byte) 0, 255, 20);
        }
    }
}
