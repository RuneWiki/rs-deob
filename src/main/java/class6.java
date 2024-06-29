import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class6 {

    @OriginalMember(owner = "client!er", name = "d", descriptor = "Lcq;")
    private class106 field52;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field54;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "Lpt;")
    private class372 field51;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field61;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "Lii;")
    private class474 field56;

    @OriginalMember(owner = "client!er", name = "o", descriptor = "I")
    public static int field63 = 0;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!er", name = "n", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!er", name = "k", descriptor = "Lkk;")
    public static class149 field59;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "Lco;")
    private class268 field50;

    @OriginalMember(owner = "client!er", name = "i", descriptor = "[Lef;")
    private class531[] field57;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
    public static void method17(byte arg0) {
        field59 = null;
        if (arg0 != -41) {
            method17((byte) -124);
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(B)V")
    public final void method18(byte arg0) {
        field62++;
        if (this.field57 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field57.length; var2++) {
            if (this.field57[var2] != null) {
                this.field57[var2].method2990((byte) -91);
            }
        }
        int var3 = -61 / ((arg0 - 24) / 42);
        for (int var4 = 0; var4 < this.field57.length; var4++) {
            if (this.field57[var4] != null) {
                this.field57[var4].method2985(1);
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILgg;Lgg;IZ)Lef;")
    private final class531 method19(int arg0, class270 arg1, class270 arg2, int arg3, boolean arg4) {
        field58++;
        if (this.field50 == null) {
            throw new RuntimeException();
        } else if (arg3 < 0 || arg3 >= this.field57.length) {
            throw new RuntimeException();
        } else if (this.field57[arg3] == null) {
            this.field50.field3913 = arg3 * 72 + 6;
            int var6 = this.field50.method1748(90);
            int var7 = this.field50.method1748(-64);
            byte[] var8 = new byte[arg0];
            this.field50.method1695(var8, (byte) -52, 64, 0);
            class531 var9 = new class531(arg3, arg1, arg2, this.field52, this.field51, var6, var8, var7, arg4);
            this.field57[arg3] = var9;
            return var9;
        } else {
            return this.field57[arg3];
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IILgg;Lgg;)Lef;")
    public final class531 method20(int arg0, int arg1, class270 arg2, class270 arg3) {
        if (arg0 == 1) {
            field60++;
            return this.method19(arg0 + 63, arg2, arg3, arg1, true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)Z")
    public final boolean method21(int arg0) {
        field53++;
        if (this.field50 != null) {
            return true;
        }
        if (this.field56 == null) {
            if (this.field52.method898((byte) -112)) {
                return false;
            }
            this.field56 = this.field52.method908(512, (byte) 0, true, 255, 255);
        }
        if (this.field56.field6814) {
            return false;
        }
        class268 var2 = new class268(this.field56.method2526(-14568));
        var2.field3913 = 5;
        int var3 = var2.method1738(arg0 ^ 0xF9);
        var2.field3913 += var3 * 72;
        byte[] var4 = new byte[var2.field3952.length - var2.field3913];
        var2.method1695(var4, (byte) -52, var4.length, 0);
        byte[] var7;
        if (this.field54 == null || this.field61 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field54, this.field61);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        if (arg0 != 6) {
            field59 = null;
        }
        byte[] var8 = class454.method2672(var2.field3913 - var4.length - 5, var2.field3952, 5, 64);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field50 = var2;
        this.field57 = new class531[var3];
        return true;
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lcq;Lpt;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class6(class106 arg0, class372 arg1, BigInteger arg2, BigInteger arg3) {
        this.field52 = arg0;
        this.field54 = arg2;
        this.field51 = arg1;
        this.field61 = arg3;
        if (!this.field52.method898((byte) -112)) {
            this.field56 = this.field52.method908(512, (byte) 0, true, 255, 255);
        }
    }
}
