import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class355 {

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field4664;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "Lnp;")
    private class448 field4666;

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "Lsc;")
    private class315 field4668;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field4656;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "Llba;")
    private class501 field4658;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "Ljo;")
    public static class303 field4661;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "Liaa;")
    private class452 field4659;

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "[J")
    public static long[] field4665;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "[Ljf;")
    private class198[] field4657;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 4)
    public static final void method1960(String arg0, byte arg1) {
        System.out.println("Error: " + class404.method2201("\n", "%0a", 93, arg0));
        if (arg1 != -100) {
            field4661 = null;
        }
        field4654++;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V", line = 16)
    public final void method1961(int arg0) {
        field4655++;
        if (this.field4657 == null) {
            return;
        }
        if (arg0 > -43) {
            this.method1961(59);
        }
        for (int var2 = 0; var2 < this.field4657.length; var2++) {
            if (this.field4657[var2] != null) {
                this.field4657[var2].method1209(-9395);
            }
        }
        for (int var3 = 0; var3 < this.field4657.length; var3++) {
            if (this.field4657[var3] != null) {
                this.field4657[var3].method1204((byte) 1);
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)V", line = 59)
    public static void method1962(int arg0) {
        if (arg0 < 27) {
            method1962(35);
        }
        field4665 = null;
        field4661 = null;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)Z", line = 74)
    public final boolean method1963(boolean arg0) {
        if (arg0) {
            return false;
        }
        field4660++;
        if (this.field4659 != null) {
            return true;
        }
        if (this.field4658 == null) {
            if (this.field4666.method2481(false)) {
                return false;
            }
            this.field4658 = this.field4666.method2488((byte) -83, true, 255, 255, (byte) 0);
        }
        if (this.field4658.field8252) {
            return false;
        }
        class452 var2 = new class452(this.field4658.method750(-68));
        var2.field6215 = 5;
        int var3 = var2.method2541(109);
        var2.field6215 += var3 * 72;
        byte[] var4 = new byte[var2.field6209.length - var2.field6215];
        var2.method2552(0, 4, var4.length, var4);
        byte[] var7;
        if (this.field4664 == null || this.field4656 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field4664, this.field4656);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class235.method1364(var2.field6215 - var4.length - 5, var2.field6209, (byte) 14, 5);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field4657 = new class198[var3];
        this.field4659 = var2;
        return true;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lqn;Lqn;II)Ljf;", line = 149)
    public final class198 method1964(class59 arg0, class59 arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            method1960(null, (byte) -125);
        }
        field4662++;
        return this.method1965((byte) 99, arg3, true, arg1, arg0);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(BIZLqn;Lqn;)Ljf;", line = 160)
    private final class198 method1965(byte arg0, int arg1, boolean arg2, class59 arg3, class59 arg4) {
        field4667++;
        if (this.field4659 == null) {
            throw new RuntimeException();
        } else if (arg1 < 0 || this.field4657.length <= arg1) {
            throw new RuntimeException();
        } else if (this.field4657[arg1] == null) {
            this.field4659.field6215 = arg1 * 72 + 6;
            int var6 = this.field4659.method2575((byte) -48);
            int var7 = this.field4659.method2575((byte) -48);
            byte[] var8 = new byte[64];
            if (arg0 != 99) {
                method1962(-41);
            }
            this.field4659.method2552(0, 4, 64, var8);
            class198 var9 = new class198(arg1, arg3, arg4, this.field4666, this.field4668, var6, var8, var7, arg2);
            this.field4657[arg1] = var9;
            return var9;
        } else {
            return this.field4657[arg1];
        }
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lnp;Lsc;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 208)
    public class355(class448 arg0, class315 arg1, BigInteger arg2, BigInteger arg3) {
        this.field4664 = arg2;
        this.field4666 = arg0;
        this.field4668 = arg1;
        this.field4656 = arg3;
        if (!this.field4666.method2481(false)) {
            this.field4658 = this.field4666.method2488((byte) -83, true, 255, 255, (byte) 0);
        }
    }
}
