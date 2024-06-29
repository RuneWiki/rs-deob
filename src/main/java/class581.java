import java.awt.Canvas;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class581 {

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "Ljd;")
    private class232 field8138;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field8139;

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field8135;

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "Lpt;")
    private class531 field8150;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "Lgb;")
    private class216 field8145;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
    public static int field8134 = -1;

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "Z")
    public static boolean field8149 = false;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "Z")
    public static boolean field8146 = false;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
    public static int field8137;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "I")
    public static int field8141;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
    public static int field8143;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
    public static int field8144;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
    public static int field8147;

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
    public static int field8148;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "Lji;")
    private class611 field8140;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "[Llw;")
    private class660[] field8142;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IBILjava/awt/Canvas;Ld;)Lha;", line = 5)
    public static final class60 method3246(int arg0, byte arg1, int arg2, Canvas arg3, class152 arg4) {
        field8144++;
        int var5 = -64 % ((arg1 + 25) / 57);
        return new class694(arg3, arg4, arg0, arg2);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(BIILni;)Lmv;", line = 24)
    public static final class377 method3247(byte arg0, int arg1, int arg2, class522 arg3) {
        field8141++;
        byte[] var4 = arg3.method2885(arg1, arg2, false);
        if (var4 == null) {
            return null;
        } else if (arg0 <= 108) {
            return null;
        } else {
            return new class377(var4);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILbg;Lbg;I)Llw;", line = 41)
    public final class660 method3248(int arg0, class465 arg1, class465 arg2, int arg3) {
        if (arg0 == 72) {
            field8147++;
            return this.method3252(true, arg2, arg3, arg1, 96);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)Z", line = 54)
    public final boolean method3249(int arg0) {
        field8137++;
        if (this.field8140 != null) {
            return true;
        }
        if (this.field8145 == null) {
            if (this.field8138.method1375(arg0 + 108)) {
                return false;
            }
            this.field8145 = this.field8138.method1374(255, (byte) 0, 255, 112, true);
        }
        if (this.field8145.field741) {
            return false;
        }
        class611 var2 = new class611(this.field8145.method511(87));
        var2.field8520 = 5;
        int var3 = var2.method3428((byte) -99);
        var2.field8520 += var3 * 72;
        byte[] var4 = new byte[var2.field8529.length - var2.field8520];
        var2.method3389(var4, true, var4.length, 0);
        byte[] var7;
        if (this.field8135 == null || this.field8139 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field8135, this.field8139);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class721.method4054(arg0, (byte) -128, var2.field8529, var2.field8520 - var4.length - 5);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field8140 = var2;
        this.field8142 = new class660[var3];
        return true;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V", line = 128)
    public final void method3250(int arg0) {
        field8143++;
        if (this.field8142 == null) {
            return;
        }
        for (int var2 = arg0; var2 < this.field8142.length; var2++) {
            if (this.field8142[var2] != null) {
                this.field8142[var2].method3736(-1);
            }
        }
        for (int var3 = 0; var3 < this.field8142.length; var3++) {
            if (this.field8142[var3] != null) {
                this.field8142[var3].method3735(7899);
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)Lpca;", line = 165)
    public static final class715 method3251(int arg0) {
        field8136++;
        try {
            return new class398();
        } catch (Throwable var2) {
            if (arg0 != 72) {
                field8134 = 33;
            }
            try {
                return (class715) Class.forName("qk").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class524();
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Ljd;Lpt;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 198)
    public class581(class232 arg0, class531 arg1, BigInteger arg2, BigInteger arg3) {
        this.field8138 = arg0;
        this.field8139 = arg3;
        this.field8135 = arg2;
        this.field8150 = arg1;
        if (!this.field8138.method1375(92)) {
            this.field8145 = this.field8138.method1374(255, (byte) 0, 255, 105, true);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZLbg;ILbg;I)Llw;", line = 216)
    private final class660 method3252(boolean arg0, class465 arg1, int arg2, class465 arg3, int arg4) {
        field8148++;
        if (this.field8140 == null) {
            throw new RuntimeException();
        } else if (arg2 < 0 || this.field8142.length <= arg2) {
            throw new RuntimeException();
        } else if (this.field8142[arg2] == null) {
            this.field8140.field8520 = arg2 * 72 + 6;
            int var6 = this.field8140.method3418(-2);
            int var7 = this.field8140.method3418(-2);
            int var8 = 9 / ((arg4 - 46) / 43);
            byte[] var9 = new byte[64];
            this.field8140.method3389(var9, true, 64, 0);
            class660 var10 = new class660(arg2, arg1, arg3, this.field8138, this.field8150, var6, var9, var7, arg0);
            this.field8142[arg2] = var10;
            return var10;
        } else {
            return this.field8142[arg2];
        }
    }
}
