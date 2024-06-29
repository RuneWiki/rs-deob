import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class142 {

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "Lkha;")
    private class580 field2183;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field2187;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field2179;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "Ltl;")
    private class617 field2178;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "Lgq;")
    private class511 field2182;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "Ltaa;")
    public static class405 field2176 = new class405();

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "[I")
    public static int[] field2181 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
    public static int field2184 = 0;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "Z")
    public static boolean field2188 = false;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "Lud;")
    private class35 field2175;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "[Lrfa;")
    private class197[] field2180;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
    public static void method1115(int arg0) {
        int var1 = 38 % ((arg0 - 68) / 56);
        field2181 = null;
        field2176 = null;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lpk;ILpk;IZ)Lrfa;")
    private final class197 method1116(class195 arg0, int arg1, class195 arg2, int arg3, boolean arg4) {
        field2185++;
        if (this.field2175 == null) {
            throw new RuntimeException();
        } else if (arg1 < 0 || arg1 >= this.field2180.length) {
            throw new RuntimeException();
        } else if (this.field2180[arg1] == null) {
            this.field2175.field469 = arg1 * 72 + 6;
            if (arg3 != 17431) {
                this.method1119((byte) -8);
            }
            int var6 = this.field2175.method234((byte) -126);
            int var7 = this.field2175.method234((byte) -98);
            byte[] var8 = new byte[64];
            this.field2175.method260(var8, -59, 64, 0);
            class197 var9 = new class197(arg1, arg0, arg2, this.field2183, this.field2178, var6, var8, var7, arg4);
            this.field2180[arg1] = var9;
            return var9;
        } else {
            return this.field2180[arg1];
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZLpk;ILpk;)Lrfa;")
    public final class197 method1117(boolean arg0, class195 arg1, int arg2, class195 arg3) {
        field2177++;
        if (arg0) {
            this.field2183 = null;
        }
        return this.method1116(arg3, arg2, arg1, 17431, true);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
    public final void method1118(byte arg0) {
        field2186++;
        if (this.field2180 == null) {
            return;
        }
        int var2 = -55 / ((56 - arg0) / 48);
        for (int var3 = 0; var3 < this.field2180.length; var3++) {
            if (this.field2180[var3] != null) {
                this.field2180[var3].method1386(-5939);
            }
        }
        for (int var4 = 0; var4 < this.field2180.length; var4++) {
            if (this.field2180[var4] != null) {
                this.field2180[var4].method1385(2);
            }
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)Z")
    public final boolean method1119(byte arg0) {
        field2189++;
        if (this.field2175 != null) {
            return true;
        }
        if (this.field2182 == null) {
            if (this.field2183.method3362(0)) {
                return false;
            }
            this.field2182 = this.field2183.method3356((byte) 0, 27840, 255, 255, true);
        }
        if (this.field2182.field2336) {
            return false;
        }
        class35 var2 = new class35(this.field2182.method1187((byte) -92));
        var2.field469 = 5;
        int var3 = var2.method273(255);
        var2.field469 += var3 * 72;
        byte[] var4 = new byte[var2.field483.length - var2.field469];
        var2.method260(var4, 111, var4.length, 0);
        byte[] var7;
        if (this.field2187 == null || this.field2179 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field2187, this.field2179);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class259.method1761(var2.field469 - var4.length - 5, -5766, var2.field483, 5);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field2180 = new class197[var3];
        this.field2175 = var2;
        return arg0 < 116 ? true : true;
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lkha;Ltl;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class142(class580 arg0, class617 arg1, BigInteger arg2, BigInteger arg3) {
        this.field2183 = arg0;
        this.field2187 = arg2;
        this.field2179 = arg3;
        this.field2178 = arg1;
        if (!this.field2183.method3362(0)) {
            this.field2182 = this.field2183.method3356((byte) 0, 27840, 255, 255, true);
        }
    }
}
