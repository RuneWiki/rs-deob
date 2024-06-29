import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class620 extends class626 {

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public int field8941;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    public int field8948;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    private int field8946;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    private int field8939;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public int field8944;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    private int field8943;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
    private int field8951;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    private int field8947;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
    public int field8955;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "Lqaa;")
    public static class27 field8950 = new class27(67, 3);

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "Lnga;")
    public static class510 field8954 = new class510(32);

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public static int field8940;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public static int field8942;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public static int field8945;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public static int field8949;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    public static int field8952;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "I")
    public static int field8953;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)Z", line = 3)
    public final boolean method3582(int arg0, int arg1, int arg2) {
        int var4 = -103 / ((arg0 + 67) / 56);
        field8953++;
        return this.field8955 <= arg2 && this.field8948 >= arg2 && this.field8944 <= arg1 && arg1 <= this.field8941;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I[III)V", line = 18)
    public final void method3583(int arg0, int[] arg1, int arg2, int arg3) {
        field8940++;
        if (arg2 < 46) {
            this.method3583(-109, null, -9, -86);
        }
        arg1[0] = this.field8947;
        arg1[1] = arg3 + this.field8943 - this.field8955;
        arg1[2] = this.field8939 + arg0 - this.field8944;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIB[I)V", line = 34)
    public final void method3584(int arg0, int arg1, byte arg2, int[] arg3) {
        if (arg2 > -87) {
            method3588((byte) 60, 76, -30, 24, true, -56);
        }
        field8942++;
        arg3[1] = arg1 + this.field8955 - this.field8943;
        arg3[2] = this.field8944 + arg0 - this.field8939;
        arg3[0] = 0;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(III)Z", line = 47)
    public final boolean method3585(int arg0, int arg1, int arg2) {
        if (arg0 <= 115) {
            return false;
        } else {
            field8949++;
            return arg2 >= this.field8943 && this.field8951 >= arg2 && arg1 >= this.field8939 && this.field8946 >= arg1;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIII)Z", line = 65)
    public final boolean method3586(int arg0, int arg1, int arg2, int arg3) {
        int var5 = -65 / ((arg0 + 32) / 56);
        field8952++;
        return this.field8947 == arg3 && arg1 >= this.field8943 && this.field8951 >= arg1 && this.field8939 <= arg2 && this.field8946 >= arg2;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 90)
    public static void method3587(int arg0) {
        field8950 = null;
        if (arg0 > -54) {
            field8950 = null;
        }
        field8954 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BIIIZI)V", line = 105)
    public static final void method3588(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field8945++;
        if (arg0 < 96) {
            method3588((byte) -31, 20, -63, -16, true, 82);
        }
        long var6 = (long) ((arg4 ? Integer.MIN_VALUE : 0) | arg2);
        class380 var8 = (class380) class416.field5830.method4203(true, var6);
        if (var8 == null) {
            var8 = new class380();
            class416.field5830.method4211(var8, (byte) 115, var6);
        }
        if (arg5 >= var8.field5295.length) {
            int[] var9 = new int[arg5 + 1];
            int[] var10 = new int[arg5 + 1];
            for (int var11 = 0; var11 < var8.field5295.length; var11++) {
                var9[var11] = var8.field5295[var11];
                var10[var11] = var8.field5298[var11];
            }
            for (int var12 = var8.field5295.length; var12 < arg5; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field5295 = var9;
            var8.field5298 = var10;
        }
        var8.field5295[arg5] = arg1;
        var8.field5298[arg5] = arg3;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IIIIIIIII)V", line = 161)
    public class620(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field8941 = arg8;
        this.field8948 = arg7;
        this.field8946 = arg4;
        this.field8939 = arg2;
        this.field8944 = arg6;
        this.field8943 = arg1;
        this.field8951 = arg3;
        this.field8947 = arg0;
        this.field8955 = arg5;
    }
}
