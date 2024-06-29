import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class383 {

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field5062;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Lgq;")
    private class436 field5056;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field5061;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Lbj;")
    private class201 field5059;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "Lpm;")
    private class499 field5066;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "Lrg;")
    public static class548 field5068 = new class548(49, 4);

    @OriginalMember(owner = "client!la", name = "n", descriptor = "Lcea;")
    public static class180 field5069 = new class180("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "Los;")
    private class374 field5065;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "[Lqc;")
    private class631[] field5063;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "[[[Ldg;")
    public static class349[][][] field5070;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 6)
    public static void method2210(int arg0) {
        field5069 = null;
        int var1 = -76 / ((arg0 + 35) / 42);
        field5070 = null;
        field5068 = null;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V", line = 19)
    public final void method2211(int arg0) {
        field5067++;
        if (this.field5063 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field5063.length; var2++) {
            if (this.field5063[var2] != null) {
                this.field5063[var2].method3624(true);
            }
        }
        for (int var3 = 0; var3 < this.field5063.length; var3++) {
            if (this.field5063[var3] != null) {
                this.field5063[var3].method3630(29892);
            }
        }
        int var4 = -99 % ((19 - arg0) / 61);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BIZLes;Les;)Lqc;", line = 62)
    private final class631 method2212(byte arg0, int arg1, boolean arg2, class320 arg3, class320 arg4) {
        field5064++;
        if (this.field5065 == null) {
            throw new RuntimeException();
        } else if (arg1 < 0 || arg1 >= this.field5063.length) {
            throw new RuntimeException();
        } else if (arg0 != 94) {
            return null;
        } else if (this.field5063[arg1] == null) {
            this.field5065.field4966 = arg1 * 72 + 6;
            int var6 = this.field5065.method2123(false);
            int var7 = this.field5065.method2123(false);
            byte[] var8 = new byte[64];
            this.field5065.method2147(var8, (byte) -88, 0, 64);
            class631 var9 = new class631(arg1, arg4, arg3, this.field5056, this.field5059, var6, var8, var7, arg2);
            this.field5063[arg1] = var9;
            return var9;
        } else {
            return this.field5063[arg1];
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)Z", line = 105)
    public final boolean method2213(int arg0) {
        field5058++;
        if (this.field5065 != null) {
            return true;
        }
        if (this.field5066 == null) {
            if (this.field5056.method2523(0)) {
                return false;
            }
            this.field5066 = this.field5056.method2519((byte) 0, 255, 255, true, false);
        }
        if (this.field5066.field8322) {
            return false;
        }
        class374 var2 = new class374(this.field5066.method244(124));
        var2.field4966 = 5;
        int var3 = var2.method2129(-114);
        var2.field4966 += var3 * 72;
        byte[] var4 = new byte[var2.field4929.length - var2.field4966];
        var2.method2147(var4, (byte) -104, 0, var4.length);
        byte[] var7;
        if (this.field5062 == null || this.field5061 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field5062, this.field5061);
            var7 = var6.toByteArray();
        }
        if (var7.length != arg0) {
            throw new RuntimeException();
        }
        byte[] var8 = class256.method1443(5, var2.field4966 - var4.length - 5, var2.field4929, 0);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field5063 = new class631[var3];
        this.field5065 = var2;
        return true;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILes;ILes;)Lqc;", line = 182)
    public final class631 method2214(int arg0, class320 arg1, int arg2, class320 arg3) {
        if (arg0 > -101) {
            field5069 = null;
        }
        field5057++;
        return this.method2212((byte) 94, arg2, true, arg3, arg1);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)Z", line = 194)
    public static final boolean method2215(int arg0, int arg1, int arg2) {
        if (arg1 == 64) {
            field5060++;
            return (class213.method1216(arg0, arg2, 0) | class307.method1698((byte) -128, arg2, arg0) | class594.method3446(arg1 ^ 0x40, arg0, arg2)) & class114.method678(arg2, -20042, arg0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lgq;Lbj;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 209)
    public class383(class436 arg0, class201 arg1, BigInteger arg2, BigInteger arg3) {
        this.field5062 = arg2;
        this.field5056 = arg0;
        this.field5061 = arg3;
        this.field5059 = arg1;
        if (!this.field5056.method2523(0)) {
            this.field5066 = this.field5056.method2519((byte) 0, 255, 255, true, false);
        }
    }
}
