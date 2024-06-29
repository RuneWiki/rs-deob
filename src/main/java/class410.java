import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class410 {

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "Lrt;")
    private class485 field6054;

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field6057;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "Lih;")
    private class741 field6052;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field6049;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "Lvea;")
    private class648 field6051;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "Lofa;")
    private class301 field6046;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "Ltc;")
    public static class73 field6048;

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "[Lme;")
    private class634[] field6053;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V", line = 4)
    public final void method2525(byte arg0) {
        field6058++;
        if (arg0 != 67) {
            this.method2529((byte) 80, null, null, 37);
        }
        if (this.field6053 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field6053.length; var2++) {
            if (this.field6053[var2] != null) {
                this.field6053[var2].method3593((byte) 1);
            }
        }
        for (int var3 = 0; var3 < this.field6053.length; var3++) {
            if (this.field6053[var3] != null) {
                this.field6053[var3].method3594(126);
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIZLid;Lid;)Lme;", line = 43)
    private final class634 method2526(int arg0, int arg1, boolean arg2, class463 arg3, class463 arg4) {
        field6050++;
        if (this.field6046 == null) {
            throw new RuntimeException();
        } else if (arg1 >= -122) {
            return null;
        } else if (arg0 < 0 || arg0 >= this.field6053.length) {
            throw new RuntimeException();
        } else if (this.field6053[arg0] == null) {
            this.field6046.field4534 = arg0 * 72 + 6;
            int var6 = this.field6046.method1934(-2);
            int var7 = this.field6046.method1934(-2);
            byte[] var8 = new byte[64];
            this.field6046.method1936(0, 10046, 64, var8);
            class634 var9 = new class634(arg0, arg3, arg4, this.field6054, this.field6052, var6, var8, var7, arg2);
            this.field6053[arg0] = var9;
            return var9;
        } else {
            return this.field6053[arg0];
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)Z", line = 88)
    public final boolean method2527(boolean arg0) {
        field6047++;
        if (this.field6046 != null) {
            return true;
        }
        if (this.field6051 == null) {
            if (this.field6054.method2937((byte) 56)) {
                return false;
            }
            this.field6051 = this.field6054.method2933(true, 255, -513, (byte) 0, 255);
        }
        if (this.field6051.field6952) {
            return false;
        }
        if (!arg0) {
            this.method2529((byte) -9, null, null, -18);
        }
        class301 var2 = new class301(this.field6051.method12(24649));
        var2.field4534 = 5;
        int var3 = var2.method1987(-118);
        var2.field4534 += var3 * 72;
        byte[] var4 = new byte[var2.field4543.length - var2.field4534];
        var2.method1936(0, 10046, var4.length, var4);
        byte[] var7;
        if (this.field6057 == null || this.field6049 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field6057, this.field6049);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class38.method313(var2.field4534 - var4.length - 5, 23863, 5, var2.field4543);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field6046 = var2;
        this.field6053 = new class634[var3];
        return true;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V", line = 177)
    public static void method2528(int arg0) {
        field6048 = null;
        if (arg0 >= -85) {
            method2528(127);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(BLid;Lid;I)Lme;", line = 187)
    public final class634 method2529(byte arg0, class463 arg1, class463 arg2, int arg3) {
        int var5 = 94 / ((17 - arg0) / 63);
        field6056++;
        return this.method2526(arg3, -126, true, arg2, arg1);
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lrt;Lih;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 196)
    public class410(class485 arg0, class741 arg1, BigInteger arg2, BigInteger arg3) {
        this.field6054 = arg0;
        this.field6057 = arg2;
        this.field6052 = arg1;
        this.field6049 = arg3;
        if (!this.field6054.method2937((byte) 56)) {
            this.field6051 = this.field6054.method2933(true, 255, -513, (byte) 0, 255);
        }
    }
}
