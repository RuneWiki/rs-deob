import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field20;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field8;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "Llfa;")
    private class100 field9;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "Lmu;")
    private class272 field11;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "Lqb;")
    private class205 field19;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "[C")
    public static char[] field14 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "Lem;")
    public static class206 field18 = new class206(23, -1);

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "Llh;")
    public static class487 field21 = new class487(28, 4);

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "Lac;")
    private class501 field15;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "[Lmc;")
    private class119[] field10;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)Z")
    public final boolean method3(int arg0) {
        field17++;
        if (this.field15 != null) {
            return true;
        }
        if (this.field19 == null) {
            if (this.field9.method730((byte) -79)) {
                return false;
            }
            this.field19 = this.field9.method729(203266800, true, 255, (byte) 0, 255);
        }
        if (arg0 < 112) {
            return false;
        } else if (this.field19.field8762) {
            return false;
        } else {
            class501 var2 = new class501(this.field19.method572(121));
            var2.field6892 = 5;
            int var3 = var2.method2874((byte) -75);
            var2.field6892 += var3 * 72;
            byte[] var4 = new byte[var2.field6855.length - var2.field6892];
            var2.method2857(var4, var4.length, (byte) 125, 0);
            byte[] var7;
            if (this.field20 == null || this.field8 == null) {
                var7 = var4;
            } else {
                BigInteger var5 = new BigInteger(var4);
                BigInteger var6 = var5.modPow(this.field20, this.field8);
                var7 = var6.toByteArray();
            }
            if (var7.length != 65) {
                throw new RuntimeException();
            }
            byte[] var8 = class171.method1205(var2.field6855, 5, -122, var2.field6892 - var4.length - 5);
            for (int var9 = 0; var9 < 64; var9++) {
                if (var7[var9 + 1] != var8[var9]) {
                    throw new RuntimeException();
                }
            }
            this.field15 = var2;
            this.field10 = new class119[var3];
            return true;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lsp;ILsp;IZ)Lmc;")
    private final class119 method4(class589 arg0, int arg1, class589 arg2, int arg3, boolean arg4) {
        field13++;
        if (this.field15 == null) {
            throw new RuntimeException();
        } else if (arg1 < 0 || arg1 >= this.field10.length) {
            throw new RuntimeException();
        } else if (this.field10[arg1] == null) {
            this.field15.field6892 = arg1 * 72 + 6;
            int var6 = this.field15.method2840(false);
            int var7 = this.field15.method2840(false);
            byte[] var8 = new byte[arg3];
            this.field15.method2857(var8, 64, (byte) 125, 0);
            class119 var9 = new class119(arg1, arg2, arg0, this.field9, this.field11, var6, var8, var7, arg4);
            this.field10[arg1] = var9;
            return var9;
        } else {
            return this.field10[arg1];
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)V")
    public final void method5(boolean arg0) {
        field16++;
        if (this.field10 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field10.length; var2++) {
            if (this.field10[var2] != null) {
                this.field10[var2].method851(0);
            }
        }
        int var3 = 0;
        if (!arg0) {
            return;
        }
        while (this.field10.length > var3) {
            if (this.field10[var3] != null) {
                this.field10[var3].method847(-28814);
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)V")
    public static void method6(int arg0) {
        field18 = null;
        field21 = null;
        if (arg0 != 5885) {
            method6(73);
        }
        field14 = null;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILsp;ILsp;)Lmc;")
    public final class119 method7(int arg0, class589 arg1, int arg2, class589 arg3) {
        field12++;
        if (arg2 <= 84) {
            this.field19 = null;
        }
        return this.method4(arg3, arg0, arg1, 64, true);
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Llfa;Lmu;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class3(class100 arg0, class272 arg1, BigInteger arg2, BigInteger arg3) {
        this.field20 = arg2;
        this.field8 = arg3;
        this.field9 = arg0;
        this.field11 = arg1;
        if (!this.field9.method730((byte) -73)) {
            this.field19 = this.field9.method729(203266800, true, 255, (byte) 0, 255);
        }
    }
}
