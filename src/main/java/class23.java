import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class23 {

    @OriginalMember(owner = "client!ria", name = "l", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field217;

    @OriginalMember(owner = "client!ria", name = "k", descriptor = "Leda;")
    private class133 field216;

    @OriginalMember(owner = "client!ria", name = "m", descriptor = "Ldu;")
    private class424 field218;

    @OriginalMember(owner = "client!ria", name = "h", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field213;

    @OriginalMember(owner = "client!ria", name = "d", descriptor = "Lrha;")
    private class454 field209;

    @OriginalMember(owner = "client!ria", name = "j", descriptor = "[I")
    public static int[] field215 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ria", name = "g", descriptor = "B")
    public static byte field212;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!ria", name = "c", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!ria", name = "f", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!ria", name = "n", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!ria", name = "i", descriptor = "Lgga;")
    private class511 field214;

    @OriginalMember(owner = "client!ria", name = "e", descriptor = "[Lmg;")
    private class246[] field210;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(III)V", line = 4)
    public static final void method93(int arg0, int arg1, int arg2) {
        class472 var3 = class59.field688[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class543.method3219(var3.field6542);
        class543.method3219(var3.field6541);
        if (var3.field6542 != null) {
            var3.field6542 = null;
        }
        if (var3.field6541 != null) {
            var3.field6541 = null;
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(B)V", line = 21)
    public final void method94(byte arg0) {
        field211++;
        if (arg0 != -29) {
            this.field210 = null;
        }
        if (this.field210 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field210.length; var2++) {
            if (this.field210[var2] != null) {
                this.field210[var2].method1648(-16033);
            }
        }
        for (int var3 = 0; var3 < this.field210.length; var3++) {
            if (this.field210[var3] != null) {
                this.field210[var3].method1653((byte) 35);
            }
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Z)Z", line = 61)
    public final boolean method95(boolean arg0) {
        field206++;
        if (this.field214 != null) {
            return true;
        }
        if (this.field209 == null) {
            if (this.field218.method2562(20)) {
                return false;
            }
            this.field209 = this.field218.method2555(true, (byte) 0, 255, 4, 255);
        }
        if (this.field209.field8952) {
            return false;
        }
        class511 var2 = new class511(this.field209.method2735(100));
        var2.field6962 = 5;
        int var3 = var2.method3013(-117);
        var2.field6962 += var3 * 72;
        byte[] var4 = new byte[var2.field6979.length - var2.field6962];
        var2.method3014(var4.length, var4, 75212712, 0);
        byte[] var7;
        if (this.field213 == null || this.field217 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field213, this.field217);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class353.method2222(var2.field6962 - var4.length - 5, 5, 64, var2.field6979);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        if (!arg0) {
            field212 = 102;
        }
        this.field214 = var2;
        this.field210 = new class246[var3];
        return true;
    }

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "(B)V", line = 145)
    public static void method96(byte arg0) {
        field215 = null;
        if (arg0 != -3) {
            field215 = null;
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lpn;ZILpn;I)Lmg;", line = 161)
    private final class246 method97(class327 arg0, boolean arg1, int arg2, class327 arg3, int arg4) {
        field208++;
        int var6 = 41 % ((arg2 - 28) / 40);
        if (this.field214 == null) {
            throw new RuntimeException();
        } else if (arg4 < 0 || arg4 >= this.field210.length) {
            throw new RuntimeException();
        } else if (this.field210[arg4] == null) {
            this.field214.field6962 = arg4 * 72 + 6;
            int var7 = this.field214.method3008(64);
            int var8 = this.field214.method3008(64);
            byte[] var9 = new byte[64];
            this.field214.method3014(64, var9, 75212712, 0);
            class246 var10 = new class246(arg4, arg0, arg3, this.field218, this.field216, var7, var9, var8, arg1);
            this.field210[arg4] = var10;
            return var10;
        } else {
            return this.field210[arg4];
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(ILpn;Lpn;I)Lmg;", line = 201)
    public final class246 method98(int arg0, class327 arg1, class327 arg2, int arg3) {
        field219++;
        if (arg0 != 32) {
            method93(89, -4, 30);
        }
        return this.method97(arg1, true, -31, arg2, arg3);
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)V", line = 215)
    public static final void method99(int arg0) {
        if (arg0 != 100) {
            method96((byte) -46);
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class363.field5240[var1] = true;
        }
        field207++;
    }

    @OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(Ldu;Leda;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 231)
    public class23(class424 arg0, class133 arg1, BigInteger arg2, BigInteger arg3) {
        this.field217 = arg3;
        this.field216 = arg1;
        this.field218 = arg0;
        this.field213 = arg2;
        if (!this.field218.method2562(20)) {
            this.field209 = this.field218.method2555(true, (byte) 0, 255, 4, 255);
        }
    }
}
