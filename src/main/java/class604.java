import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class604 {

    @OriginalMember(owner = "client!vw", name = "j", descriptor = "Ll;")
    private class291 field8578;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field8570;

    @OriginalMember(owner = "client!vw", name = "n", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field8582;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "Lcda;")
    private class595 field8569;

    @OriginalMember(owner = "client!vw", name = "l", descriptor = "Lfu;")
    private class80 field8580;

    @OriginalMember(owner = "client!vw", name = "k", descriptor = "Lsv;")
    public static class570 field8579 = new class570(20, -1);

    @OriginalMember(owner = "client!vw", name = "m", descriptor = "Lsaa;")
    public static class657 field8581 = new class657();

    @OriginalMember(owner = "client!vw", name = "o", descriptor = "[I")
    public static int[] field8583 = new int[1];

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "I")
    public static int field8571;

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "I")
    public static int field8572;

    @OriginalMember(owner = "client!vw", name = "f", descriptor = "I")
    public static int field8574;

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "I")
    public static int field8575;

    @OriginalMember(owner = "client!vw", name = "i", descriptor = "I")
    public static int field8577;

    @OriginalMember(owner = "client!vw", name = "q", descriptor = "I")
    public static int field8585;

    @OriginalMember(owner = "client!vw", name = "h", descriptor = "Lol;")
    private class431 field8576;

    @OriginalMember(owner = "client!vw", name = "p", descriptor = "[Lgda;")
    public static class544[] field8584;

    @OriginalMember(owner = "client!vw", name = "e", descriptor = "[Lrn;")
    private class677[] field8573;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lce;ILce;B)Lrn;", line = 3)
    public final class677 method3503(class590 arg0, int arg1, class590 arg2, byte arg3) {
        if (arg3 < 100) {
            method3506(26, -4);
        }
        field8575++;
        return this.method3509(true, arg0, arg1, arg2, true);
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V", line = 18)
    public final void method3504(int arg0) {
        field8574++;
        if (this.field8573 == null || arg0 != 255) {
            return;
        }
        for (int var2 = 0; var2 < this.field8573.length; var2++) {
            if (this.field8573[var2] != null) {
                this.field8573[var2].method3797((byte) 24);
            }
        }
        for (int var3 = 0; var3 < this.field8573.length; var3++) {
            if (this.field8573[var3] != null) {
                this.field8573[var3].method3799(arg0 ^ 0xFFFFFF00);
            }
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Z)V", line = 55)
    public static void method3505(boolean arg0) {
        field8583 = null;
        field8584 = null;
        if (!arg0) {
            field8579 = null;
            field8581 = null;
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(II)Luf;", line = 68)
    public static final class519 method3506(int arg0, int arg1) {
        field8585++;
        int var2 = arg0 >> 16;
        if (arg1 != 255) {
            return null;
        }
        int var3 = arg0 & 0xFFFF;
        if (class610.field8661[var2] == null || class610.field8661[var2][var3] == null) {
            boolean var4 = class484.method2853(var2, (byte) -93);
            if (!var4) {
                return null;
            }
        }
        return class610.field8661[var2][var3];
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(II)V", line = 95)
    public static final void method3507(int arg0, int arg1) {
        field8577++;
        if (arg0 != arg1 && class120.field2047[arg0]) {
            class720.field10061.method3003(-29588, arg0);
            class610.field8661[arg0] = null;
            class556.field7720[arg0] = null;
            class120.field2047[arg0] = false;
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)Z", line = 113)
    public final boolean method3508(byte arg0) {
        field8571++;
        if (this.field8576 != null) {
            return true;
        }
        if (this.field8580 == null) {
            if (this.field8578.method1847((byte) -121)) {
                return false;
            }
            this.field8580 = this.field8578.method1839((byte) 0, 255, 255, 123, true);
        }
        if (this.field8580.field10169) {
            return false;
        }
        class431 var2 = new class431(this.field8580.method713(117));
        var2.field5983 = 5;
        int var3 = var2.method2557(14929);
        var2.field5983 += var3 * 72;
        int var4 = 103 % ((-arg0 - 30) / 43);
        byte[] var5 = new byte[var2.field6002.length - var2.field5983];
        var2.method2530(-51, var5, 0, var5.length);
        byte[] var8;
        if (this.field8582 == null || this.field8570 == null) {
            var8 = var5;
        } else {
            BigInteger var6 = new BigInteger(var5);
            BigInteger var7 = var6.modPow(this.field8582, this.field8570);
            var8 = var7.toByteArray();
        }
        if (var8.length != 65) {
            throw new RuntimeException();
        }
        byte[] var9 = class65.method652(var2.field6002, 5, var2.field5983 - var5.length - 5, (byte) -60);
        for (int var10 = 0; var10 < 64; var10++) {
            if (var8[var10 + 1] != var9[var10]) {
                throw new RuntimeException();
            }
        }
        this.field8576 = var2;
        this.field8573 = new class677[var3];
        return true;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ZLce;ILce;Z)Lrn;", line = 205)
    private final class677 method3509(boolean arg0, class590 arg1, int arg2, class590 arg3, boolean arg4) {
        field8572++;
        if (this.field8576 == null) {
            throw new RuntimeException();
        } else if (arg2 < 0 || arg2 >= this.field8573.length) {
            throw new RuntimeException();
        } else if (this.field8573[arg2] == null) {
            this.field8576.field5983 = arg2 * 72 + 6;
            int var6 = this.field8576.method2526(17);
            int var7 = this.field8576.method2526(17);
            byte[] var8 = new byte[64];
            this.field8576.method2530(-56, var8, 0, 64);
            class677 var9 = new class677(arg2, arg3, arg1, this.field8578, this.field8569, var6, var8, var7, arg0);
            this.field8573[arg2] = var9;
            if (!arg4) {
                method3506(-67, 9);
            }
            return var9;
        } else {
            return this.field8573[arg2];
        }
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Ll;Lcda;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 246)
    public class604(class291 arg0, class595 arg1, BigInteger arg2, BigInteger arg3) {
        this.field8578 = arg0;
        this.field8570 = arg3;
        this.field8582 = arg2;
        this.field8569 = arg1;
        if (!this.field8578.method1847((byte) -114)) {
            this.field8580 = this.field8578.method1839((byte) 0, 255, 255, 122, true);
        }
    }
}
