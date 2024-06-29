import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class125 {

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field1550;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Lgw;")
    private class140 field1559;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "Lbw;")
    private class411 field1548;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field1549;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "Lfca;")
    private class135 field1561;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Lim;")
    public static class353 field1554 = new class353(52, 8);

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "F")
    public static float field1557;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "Lge;")
    private class551 field1553;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "[I")
    public static int[] field1560;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "[Lvba;")
    private class231[] field1552;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)Z")
    public final boolean method671(boolean arg0) {
        field1562++;
        if (this.field1553 != null) {
            return true;
        }
        if (this.field1561 == null) {
            if (this.field1559.method740(122)) {
                return false;
            }
            this.field1561 = this.field1559.method749((byte) 0, 255, 255, true, -2057161616);
        }
        if (this.field1561.field2732) {
            return false;
        }
        class551 var2 = new class551(this.field1561.method712((byte) 81));
        var2.field7707 = 5;
        int var3 = var2.method3045(-125);
        var2.field7707 += var3 * 72;
        byte[] var4 = new byte[var2.field7693.length - var2.field7707];
        var2.method3086(0, var4, true, var4.length);
        byte[] var7;
        if (this.field1550 == null || this.field1549 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field1550, this.field1549);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        if (arg0) {
            field1557 = -0.743676F;
        }
        byte[] var8 = class622.method3567(var2.field7707 - var4.length - 5, 5, 19, var2.field7693);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field1553 = var2;
        this.field1552 = new class231[var3];
        return true;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILkm;ILkm;Z)Lvba;")
    private final class231 method672(int arg0, class120 arg1, int arg2, class120 arg3, boolean arg4) {
        field1556++;
        if (this.field1553 == null) {
            throw new RuntimeException();
        } else if (arg0 < 0 || arg0 >= this.field1552.length) {
            throw new RuntimeException();
        } else if (this.field1552[arg0] == null) {
            this.field1553.field7707 = arg0 * 72 + 6;
            if (arg2 < 35) {
                this.field1548 = null;
            }
            int var6 = this.field1553.method3048(-4);
            int var7 = this.field1553.method3048(-4);
            byte[] var8 = new byte[64];
            this.field1553.method3086(0, var8, true, 64);
            class231 var9 = new class231(arg0, arg1, arg3, this.field1559, this.field1548, var6, var8, var7, arg4);
            this.field1552[arg0] = var9;
            return var9;
        } else {
            return this.field1552[arg0];
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static void method673(int arg0) {
        int var1 = -36 / ((-arg0 - 32) / 48);
        field1554 = null;
        field1560 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILkm;ILkm;)Lvba;")
    public final class231 method674(int arg0, class120 arg1, int arg2, class120 arg3) {
        if (arg2 != 8539) {
            this.field1561 = null;
        }
        field1555++;
        return this.method672(arg0, arg3, 84, arg1, true);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)Z")
    public static final boolean method675(int arg0, byte arg1) {
        field1558++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            return false;
        } else {
            return var2 < arg0 || var2 >= 160 || class149.field1935[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lgw;Lbw;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class125(class140 arg0, class411 arg1, BigInteger arg2, BigInteger arg3) {
        this.field1550 = arg2;
        this.field1559 = arg0;
        this.field1548 = arg1;
        this.field1549 = arg3;
        if (!this.field1559.method740(-43)) {
            this.field1561 = this.field1559.method749((byte) 0, 255, 255, true, -2057161616);
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    public final void method676(int arg0) {
        field1551++;
        if (this.field1552 == null) {
            return;
        }
        for (int var2 = arg0; var2 < this.field1552.length; var2++) {
            if (this.field1552[var2] != null) {
                this.field1552[var2].method1463(arg0 + 26084);
            }
        }
        for (int var3 = 0; var3 < this.field1552.length; var3++) {
            if (this.field1552[var3] != null) {
                this.field1552[var3].method1458(0);
            }
        }
    }
}
