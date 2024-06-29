import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class626 {

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Laca;")
    private class724 field8614;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field8615;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field8610;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Ltha;")
    private class295 field8609;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "Lmba;")
    private class421 field8617;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "Lej;")
    public static class124 field8620 = new class124(4, 0);

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "Lej;")
    public static class124 field8622 = new class124(43, -1);

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field8611;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field8616;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field8618;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field8619;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field8621;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "Lcea;")
    private class215 field8612;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "[Lbja;")
    private class32[] field8613;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public final void method3573(int arg0) {
        field8619++;
        if (this.field8613 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field8613.length; var2++) {
            if (this.field8613[var2] != null) {
                this.field8613[var2].method424(0);
            }
        }
        for (int var3 = arg0; var3 < this.field8613.length; var3++) {
            if (this.field8613[var3] != null) {
                this.field8613[var3].method425(-1);
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
    public static void method3574(int arg0) {
        field8622 = null;
        field8620 = null;
        if (arg0 != 0) {
            method3575(92, 5);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Z")
    public static final boolean method3575(int arg0, int arg1) {
        field8621++;
        if (arg1 >= -89) {
            return true;
        } else {
            return arg0 == 7 || arg0 == 8 || arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lnw;ILnw;I)Lbja;")
    public final class32 method3576(class586 arg0, int arg1, class586 arg2, int arg3) {
        field8616++;
        if (arg3 != 255) {
            method3574(-43);
        }
        return this.method3578((byte) -123, true, arg1, arg0, arg2);
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)Z")
    public final boolean method3577(int arg0) {
        field8611++;
        if (this.field8612 != null) {
            return true;
        }
        if (this.field8617 == null) {
            if (this.field8609.method1934(-71)) {
                return false;
            }
            this.field8617 = this.field8609.method1940((byte) -84, (byte) 0, true, 255, 255);
        }
        if (this.field8617.field2808) {
            return false;
        }
        class215 var2 = new class215(this.field8617.method680(arg0 ^ 0x17));
        var2.field3109 = 5;
        int var3 = var2.method1535(arg0 ^ 0xF8);
        var2.field3109 += var3 * 72;
        byte[] var4 = new byte[var2.field3066.length - var2.field3109];
        var2.method1537(Integer.MAX_VALUE, 0, var4.length, var4);
        if (arg0 != 7) {
            this.field8614 = null;
        }
        byte[] var7;
        if (this.field8610 == null || this.field8615 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field8610, this.field8615);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class208.method1434(4567, 5, var2.field3066, var2.field3109 - (var4.length + 5));
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field8612 = var2;
        this.field8613 = new class32[var3];
        return true;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BZILnw;Lnw;)Lbja;")
    private final class32 method3578(byte arg0, boolean arg1, int arg2, class586 arg3, class586 arg4) {
        field8618++;
        if (this.field8612 == null) {
            throw new RuntimeException();
        } else if (arg2 < 0 || arg2 >= this.field8613.length) {
            throw new RuntimeException();
        } else if (this.field8613[arg2] == null) {
            this.field8612.field3109 = arg2 * 72 + 6;
            int var6 = this.field8612.method1533((byte) -126);
            int var7 = this.field8612.method1533((byte) -126);
            byte[] var8 = new byte[64];
            this.field8612.method1537(Integer.MAX_VALUE, 0, 64, var8);
            if (arg0 >= -18) {
                method3574(103);
            }
            class32 var9 = new class32(arg2, arg3, arg4, this.field8609, this.field8614, var6, var8, var7, arg1);
            this.field8613[arg2] = var9;
            return var9;
        } else {
            return this.field8613[arg2];
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Ltha;Laca;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class626(class295 arg0, class724 arg1, BigInteger arg2, BigInteger arg3) {
        this.field8614 = arg1;
        this.field8615 = arg3;
        this.field8610 = arg2;
        this.field8609 = arg0;
        if (!this.field8609.method1934(-31)) {
            this.field8617 = this.field8609.method1940((byte) -80, (byte) 0, true, 255, 255);
        }
    }
}
