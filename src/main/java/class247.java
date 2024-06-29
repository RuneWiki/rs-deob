import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class247 {

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Lfs;")
    private class356 field3622;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "Ldk;")
    private class506 field3620;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field3617;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field3616;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Lpaa;")
    private class318 field3613;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Z")
    public static boolean field3610 = false;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Lps;")
    private class428 field3614;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "Lpo;")
    public static class476 field3618;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "[Lko;")
    private class241[] field3621;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 5)
    public static void method1574(int arg0) {
        field3618 = null;
        if (arg0 != 6) {
            field3610 = false;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lsaa;Lsaa;IB)Lko;", line = 17)
    public final class241 method1575(class18 arg0, class18 arg1, int arg2, byte arg3) {
        field3611++;
        int var5 = 109 / ((arg3 + 5) / 55);
        return this.method1577(arg1, 64, true, arg0, arg2);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)Z", line = 27)
    public final boolean method1576(int arg0) {
        field3609++;
        if (this.field3614 != null) {
            return true;
        }
        if (this.field3613 == null) {
            if (this.field3622.method2198(false)) {
                return false;
            }
            this.field3613 = this.field3622.method2192(255, (byte) 0, true, 255, (byte) 44);
        }
        if (this.field3613.field9003) {
            return false;
        }
        class428 var2 = new class428(this.field3613.method1999(-8820));
        var2.field6221 = 5;
        int var3 = var2.method2561((byte) 109);
        var2.field6221 += var3 * 72;
        byte[] var4 = new byte[var2.field6162.length - var2.field6221];
        if (arg0 != -28120) {
            this.field3617 = null;
        }
        var2.method2575(arg0 + 56757, var4.length, var4, 0);
        byte[] var7;
        if (this.field3616 == null || this.field3617 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field3616, this.field3617);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class239.method1533(5, var2.field6221 - var4.length - 5, var2.field6162, -83);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field3614 = var2;
        this.field3621 = new class241[var3];
        return true;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lsaa;IZLsaa;I)Lko;", line = 111)
    private final class241 method1577(class18 arg0, int arg1, boolean arg2, class18 arg3, int arg4) {
        field3619++;
        if (this.field3614 == null) {
            throw new RuntimeException();
        } else if (arg4 < 0 || arg4 >= this.field3621.length) {
            throw new RuntimeException();
        } else if (this.field3621[arg4] == null) {
            this.field3614.field6221 = arg4 * 72 + 6;
            int var6 = this.field3614.method2589(-11179);
            int var7 = this.field3614.method2589(arg1 - 11243);
            byte[] var8 = new byte[arg1];
            this.field3614.method2575(28637, 64, var8, 0);
            class241 var9 = new class241(arg4, arg3, arg0, this.field3622, this.field3620, var6, var8, var7, arg2);
            this.field3621[arg4] = var9;
            return var9;
        } else {
            return this.field3621[arg4];
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V", line = 155)
    public final void method1578(byte arg0) {
        field3615++;
        if (this.field3621 == null) {
            return;
        }
        int var2 = -5 % ((arg0 - 24) / 57);
        for (int var3 = 0; var3 < this.field3621.length; var3++) {
            if (this.field3621[var3] != null) {
                this.field3621[var3].method1556(true);
            }
        }
        for (int var4 = 0; var4 < this.field3621.length; var4++) {
            if (this.field3621[var4] != null) {
                this.field3621[var4].method1558(32396);
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lfs;Ldk;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 193)
    public class247(class356 arg0, class506 arg1, BigInteger arg2, BigInteger arg3) {
        this.field3622 = arg0;
        this.field3620 = arg1;
        this.field3617 = arg3;
        this.field3616 = arg2;
        if (!this.field3622.method2198(false)) {
            this.field3613 = this.field3622.method2192(255, (byte) 0, true, 255, (byte) 44);
        }
    }
}
