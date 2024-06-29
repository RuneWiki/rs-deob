import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class228 extends class726 {

    @OriginalMember(owner = "client!jda", name = "m", descriptor = "I")
    public static int field3310 = 0;

    @OriginalMember(owner = "client!jda", name = "i", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!jda", name = "j", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!jda", name = "n", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!jda", name = "o", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!jda", name = "l", descriptor = "Lga;")
    public class404 field3309;

    @OriginalMember(owner = "client!jda", name = "k", descriptor = "Z")
    public boolean field3308;

    @OriginalMember(owner = "client!jda", name = "p", descriptor = "[Liw;")
    public class317[] field3313;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILwga;[IB[II)Llp;")
    public static final class393 method1600(int arg0, class745 arg1, int[] arg2, byte arg3, int[] arg4, int arg5) {
        if (arg3 >= -32) {
            method1601(null, -18);
        }
        field3311++;
        if (!arg1.method2249(class523.field7249, class556.field7676, (byte) 125)) {
            int[] var10 = new int[arg0 * arg5];
            for (int var11 = 0; var11 < arg0; var11++) {
                int var12 = arg5 * var11 + arg2[var11];
                for (int var13 = 0; var13 < arg4[var11]; var13++) {
                    var10[var12++] = -16777216;
                }
            }
            return new class393(arg1, arg5, arg0, var10);
        }
        byte[] var6 = new byte[arg0 * arg5];
        for (int var7 = 0; var7 < arg0; var7++) {
            int var8 = arg5 * var7 + arg2[var7];
            for (int var9 = 0; var9 < arg4[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class393(arg1, arg5, arg0, var6);
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "([BI)Ljk;")
    public static final class634 method1601(byte[] arg0, int arg1) {
        if (arg1 >= -76) {
            return null;
        }
        field3312++;
        class634 var2 = new class634();
        class215 var3 = new class215(arg0);
        var3.field3109 = var3.field3066.length - 2;
        int var4 = var3.method1478(842397944);
        int var5 = var3.field3066.length - var4 - 2 - 12;
        var3.field3109 = var5;
        int var6 = var3.method1533((byte) -126);
        var2.field8708 = var3.method1478(842397944);
        var2.field8709 = var3.method1478(842397944);
        var2.field8717 = var3.method1478(842397944);
        var2.field8715 = var3.method1478(842397944);
        int var7 = var3.method1535(255);
        if (var7 > 0) {
            var2.field8713 = new class213[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method1478(842397944);
                class213 var10 = new class213(class529.method3059(var9, (byte) 108));
                var2.field8713[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method1533((byte) -126);
                    int var12 = var3.method1533((byte) -126);
                    var10.method1468((byte) 124, (long) var11, new class113(var12));
                }
            }
        }
        var3.field3109 = 0;
        var2.field8710 = var3.method1532(107);
        var2.field8714 = new int[var6];
        var2.field8716 = new int[var6];
        var2.field8712 = new String[var6];
        int var13 = 0;
        while (var5 > var3.field3109) {
            int var14 = var3.method1478(842397944);
            if (var14 == 3) {
                var2.field8712[var13] = var3.method1525((byte) -98).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field8714[var13] = var3.method1535(255);
            } else {
                var2.field8714[var13] = var3.method1533((byte) -126);
            }
            var2.field8716[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(III[BIII)Z")
    public static final boolean method1602(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        field3307++;
        int var7 = arg4 % arg2;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg2 - var7;
        }
        int var9 = -((arg2 + arg6 - 1) / arg2);
        if (arg5 != -16259) {
            method1600(-113, null, null, (byte) 40, null, -110);
        }
        int var10 = -((arg2 + arg4 - 1) / arg2);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg3[arg1] == 0) {
                    return true;
                }
                arg1 += arg2;
            }
            int var13 = arg1 - var8;
            if (arg3[var13 - 1] == 0) {
                return true;
            }
            arg1 = arg0 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IILha;I)Z")
    public final boolean method1603(int arg0, int arg1, class59 arg2, int arg3) {
        if (arg3 >= -37) {
            method1601(null, -82);
        }
        field3306++;
        int var5 = this.field3309.method54(-117);
        if (this.field3313 != null) {
            for (int var6 = 0; var6 < this.field3313.length; var6++) {
                this.field3313[var6].field4381 <<= var5;
                if (this.field3313[var6].method2047(arg1, arg0) && this.field3309.method42(arg2, arg0, arg1, 0)) {
                    this.field3313[var6].field4381 >>= var5;
                    return true;
                }
                this.field3313[var6].field4381 >>= var5;
            }
        }
        return false;
    }
}
