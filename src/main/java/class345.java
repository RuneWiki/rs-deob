import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class345 {

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "Lwb;")
    private class518 field4415;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field4411;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "Lrs;")
    private class653 field4414;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field4408;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "Ltf;")
    private class220 field4405;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    public static int field4407 = 0;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "Lfd;")
    private class418 field4412;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "[Ldj;")
    private class455[] field4404;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V")
    public static final void method1985(byte arg0) {
        class594.field8025 = false;
        if (arg0 != 0) {
            method1985((byte) 27);
        }
        field4416++;
        class197.method1303(class399.field5100, class630.field8791, arg0 ^ 0xFFFFFFC6, class238.field3206, class539.field7003);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
    public final void method1986(int arg0) {
        field4417++;
        if (this.field4404 == null) {
            return;
        }
        if (arg0 >= -23) {
            this.field4405 = null;
        }
        for (int var2 = 0; var2 < this.field4404.length; var2++) {
            if (this.field4404[var2] != null) {
                this.field4404[var2].method2567((byte) -37);
            }
        }
        for (int var3 = 0; var3 < this.field4404.length; var3++) {
            if (this.field4404[var3] != null) {
                this.field4404[var3].method2566(-2);
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)Z")
    public final boolean method1987(byte arg0) {
        field4406++;
        if (this.field4412 != null) {
            return true;
        }
        if (this.field4405 == null) {
            if (this.field4414.method3595(10230)) {
                return false;
            }
            this.field4405 = this.field4414.method3586((byte) -10, true, 255, 255, (byte) 0);
        }
        if (this.field4405.field20) {
            return false;
        }
        class418 var2 = new class418(this.field4405.method8((byte) 2));
        var2.field5367 = 5;
        int var3 = var2.method2396(-21);
        var2.field5367 += var3 * 72;
        byte[] var4 = new byte[var2.field5393.length - var2.field5367];
        var2.method2398(var4, 0, 80, var4.length);
        byte[] var7;
        if (this.field4411 == null || this.field4408 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field4411, this.field4408);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class422.method2431(true, var2.field5367 - var4.length - 5, var2.field5393, 5);
        if (arg0 > -88) {
            return true;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field4412 = var2;
        this.field4404 = new class455[var3];
        return true;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lsd;BIZLsd;)Ldj;")
    private final class455 method1988(class264 arg0, byte arg1, int arg2, boolean arg3, class264 arg4) {
        field4409++;
        if (this.field4412 == null) {
            throw new RuntimeException();
        } else if (arg2 < 0 || arg2 >= this.field4404.length) {
            throw new RuntimeException();
        } else if (this.field4404[arg2] == null) {
            this.field4412.field5367 = arg2 * 72 + 6;
            int var6 = this.field4412.method2355(80);
            int var7 = this.field4412.method2355(78);
            if (arg1 != -48) {
                this.method1986(79);
            }
            byte[] var8 = new byte[64];
            this.field4412.method2398(var8, 0, -126, 64);
            class455 var9 = new class455(arg2, arg4, arg0, this.field4414, this.field4415, var6, var8, var7, arg3);
            this.field4404[arg2] = var9;
            return var9;
        } else {
            return this.field4404[arg2];
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BILsd;Lsd;)Ldj;")
    public final class455 method1989(byte arg0, int arg1, class264 arg2, class264 arg3) {
        if (arg0 < 13) {
            this.method1986(8);
        }
        field4413++;
        return this.method1988(arg2, (byte) -48, arg1, true, arg3);
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lrs;Lwb;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class345(class653 arg0, class518 arg1, BigInteger arg2, BigInteger arg3) {
        this.field4415 = arg1;
        this.field4411 = arg2;
        this.field4414 = arg0;
        this.field4408 = arg3;
        if (!this.field4414.method3595(10230)) {
            this.field4405 = this.field4414.method3586((byte) -10, true, 255, 255, (byte) 0);
        }
    }
}
