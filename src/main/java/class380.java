import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class380 {

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field5546;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "Ltv;")
    private class587 field5549;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field5554;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "Lnja;")
    private class458 field5550;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "Lfea;")
    private class152 field5547;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "Lgia;")
    public static class285 field5545 = new class285("runescape", "RuneScape", 0);

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "I")
    public static int field5556 = -1;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "Ljp;")
    private class376 field5558;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "[Ltf;")
    private class312[] field5551;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V", line = 5)
    public static void method2424(int arg0) {
        if (arg0 > -122) {
            method2424(-35);
        }
        field5545 = null;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZIZLtk;Ltk;)Ltf;", line = 20)
    private final class312 method2425(boolean arg0, int arg1, boolean arg2, class364 arg3, class364 arg4) {
        field5552++;
        if (this.field5558 == null) {
            throw new RuntimeException();
        } else if (arg1 < 0 || this.field5551.length <= arg1) {
            throw new RuntimeException();
        } else if (this.field5551[arg1] == null) {
            this.field5558.field5459 = arg1 * 72 + 6;
            int var6 = this.field5558.method2384(22);
            int var7 = this.field5558.method2384(19);
            byte[] var8 = new byte[64];
            this.field5558.method2389(0, 689125352, 64, var8);
            class312 var9 = new class312(arg1, arg4, arg3, this.field5549, this.field5550, var6, var8, var7, arg0);
            this.field5551[arg1] = var9;
            if (!arg2) {
                this.method2428((byte) -49);
            }
            return var9;
        } else {
            return this.field5551[arg1];
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)Z", line = 67)
    public final boolean method2426(int arg0) {
        field5555++;
        if (this.field5558 != null) {
            return true;
        }
        if (this.field5547 == null) {
            if (this.field5549.method3275(true)) {
                return false;
            }
            this.field5547 = this.field5549.method3274((byte) 0, 44, true, 255, 255);
        }
        if (this.field5547.field10051) {
            return false;
        }
        class376 var2 = new class376(this.field5547.method1123((byte) -117));
        var2.field5459 = 5;
        int var3 = var2.method2398(-1372747256);
        var2.field5459 += var3 * 72;
        byte[] var4 = new byte[var2.field5518.length - var2.field5459];
        var2.method2389(0, arg0 + 689105446, var4.length, var4);
        byte[] var7;
        if (this.field5554 == null || this.field5546 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field5554, this.field5546);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class537.method3069(-117, 5, var2.field5518, var2.field5459 - var4.length - 5);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field5558 = var2;
        this.field5551 = new class312[var3];
        if (arg0 != 19906) {
            this.method2425(false, -45, false, null, null);
        }
        return true;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BILtk;Ltk;)Ltf;", line = 141)
    public final class312 method2427(byte arg0, int arg1, class364 arg2, class364 arg3) {
        field5553++;
        if (arg0 <= 123) {
            this.method2426(3);
        }
        return this.method2425(true, arg1, true, arg3, arg2);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V", line = 153)
    public final void method2428(byte arg0) {
        field5548++;
        if (arg0 >= -62) {
            this.field5549 = null;
        }
        if (this.field5551 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field5551.length; var2++) {
            if (this.field5551[var2] != null) {
                this.field5551[var2].method1961(false);
            }
        }
        for (int var3 = 0; var3 < this.field5551.length; var3++) {
            if (this.field5551[var3] != null) {
                this.field5551[var3].method1967(1000);
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Ltv;Lnja;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 198)
    public class380(class587 arg0, class458 arg1, BigInteger arg2, BigInteger arg3) {
        this.field5546 = arg3;
        this.field5549 = arg0;
        this.field5554 = arg2;
        this.field5550 = arg1;
        if (!this.field5549.method3275(true)) {
            this.field5547 = this.field5549.method3274((byte) 0, 72, true, 255, 255);
        }
    }
}
