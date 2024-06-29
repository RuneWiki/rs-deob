import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class419 {

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "Lro;")
    private class2 field6276;

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "Lhfa;")
    private class312 field6271;

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field6273;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field6264;

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "Ldia;")
    private class234 field6275;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "Z")
    public static boolean field6265 = false;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "Lcs;")
    public static class342 field6268;

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "Lrg;")
    private class645 field6269;

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "[Lnca;")
    private class755[] field6274;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V", line = 8)
    public final void method2641(int arg0) {
        field6270++;
        if (this.field6274 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field6274.length; var2++) {
            if (this.field6274[var2] != null) {
                this.field6274[var2].method4216(-16217);
            }
        }
        if (arg0 != 6) {
            this.method2644(null, -9, null, (byte) -119, true);
        }
        for (int var3 = 0; var3 < this.field6274.length; var3++) {
            if (this.field6274[var3] != null) {
                this.field6274[var3].method4214(31884);
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lnp;IBLnp;)Lnca;", line = 49)
    public final class755 method2642(class492 arg0, int arg1, byte arg2, class492 arg3) {
        field6267++;
        return arg2 == 72 ? this.method2644(arg0, arg1, arg3, (byte) -48, true) : null;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V", line = 62)
    public static void method2643(byte arg0) {
        if (arg0 > -60) {
            method2643((byte) 29);
        }
        field6268 = null;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lnp;ILnp;BZ)Lnca;", line = 72)
    private final class755 method2644(class492 arg0, int arg1, class492 arg2, byte arg3, boolean arg4) {
        field6266++;
        if (this.field6269 == null) {
            throw new RuntimeException();
        }
        if (arg3 != -48) {
            this.method2644(null, 93, null, (byte) 59, true);
        }
        if (arg1 < 0 || this.field6274.length <= arg1) {
            throw new RuntimeException();
        } else if (this.field6274[arg1] == null) {
            this.field6269.field9084 = arg1 * 72 + 6;
            int var6 = this.field6269.method3720(arg3 ^ 0x4C7B);
            int var7 = this.field6269.method3720(-19541);
            byte[] var8 = new byte[64];
            this.field6269.method3736(arg3 ^ 0x58, var8, 64, 0);
            class755 var9 = new class755(arg1, arg0, arg2, this.field6276, this.field6271, var6, var8, var7, arg4);
            this.field6274[arg1] = var9;
            return var9;
        } else {
            return this.field6274[arg1];
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)Z", line = 114)
    public final boolean method2645(boolean arg0) {
        field6272++;
        if (this.field6269 != null) {
            return true;
        }
        if (this.field6275 == null) {
            if (this.field6276.method9(14879)) {
                return false;
            }
            this.field6275 = this.field6276.method19(255, (byte) 0, 106, true, 255);
        }
        if (this.field6275.field3226) {
            return false;
        }
        class645 var2 = new class645(this.field6275.method1476(false));
        var2.field9084 = 5;
        int var3 = var2.method3745(-6314);
        var2.field9084 += var3 * 72;
        byte[] var4 = new byte[var2.field9068.length - var2.field9084];
        var2.method3736(115, var4, var4.length, 0);
        byte[] var7;
        if (this.field6264 == null || this.field6273 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field6264, this.field6273);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class587.method3396(5, var2.field9068, var2.field9084 - var4.length - 5, (byte) 68);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        if (!arg0) {
            this.method2642(null, 110, (byte) 80, null);
        }
        this.field6274 = new class755[var3];
        this.field6269 = var2;
        return true;
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lro;Lhfa;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 193)
    public class419(class2 arg0, class312 arg1, BigInteger arg2, BigInteger arg3) {
        this.field6276 = arg0;
        this.field6271 = arg1;
        this.field6273 = arg3;
        this.field6264 = arg2;
        if (!this.field6276.method9(14879)) {
            this.field6275 = this.field6276.method19(255, (byte) 0, 109, true, 255);
        }
    }
}
