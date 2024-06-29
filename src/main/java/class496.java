import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class496 {

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    private int field6829;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    private int field6837;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    private int field6826;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    private int field6824;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    private int field6831;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    private int field6828;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    private int field6832;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    private int field6822;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    private int field6836;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    private int field6833;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6827 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "F")
    public static float field6838;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZII)I", line = 4)
    public static final int method2770(int arg0, boolean arg1, int arg2, int arg3) {
        field6825++;
        class421 var4 = class172.method1175(true, arg1, arg0);
        if (arg3 > -4) {
            field6827 = null;
        }
        if (var4 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field5946.length; var6++) {
                if (var4.field5945[var6] == arg2) {
                    var5 += var4.field5946[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I", line = 40)
    public static final int method2771(int arg0, int arg1) {
        return class198.field2927 == null ? 0 : class198.field2927[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLjr;)Ldba;", line = 45)
    public static final class80 method2772(byte arg0, class96 arg1) {
        field6830++;
        class52 var2 = class495.method2768((byte) -81)[arg1.method718(-77)];
        class377 var3 = class428.method2425((byte) -26)[arg1.method718(-100)];
        int var4 = arg1.method722(4);
        if (arg0 > 0) {
            method2776(null, 42);
        }
        int var5 = arg1.method722(4);
        int var6 = arg1.method743((byte) -14);
        int var7 = arg1.method743((byte) -47);
        int var8 = arg1.method714(false);
        return new class80(var2, var3, var4, var5, var6, var7, var8);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIIBII)V", line = 70)
    public final void method2773(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10) {
        field6834++;
        if (arg8 <= 1) {
            return;
        }
        this.field6837 = arg1 * arg1;
        this.field6824 = arg7;
        this.field6826 = arg2;
        this.field6829 = arg3;
        this.field6828 = this.field6826 + arg0;
        this.field6831 = this.field6829 + arg4;
        this.field6822 = this.field6829 + arg10;
        this.field6836 = this.field6824 + arg9;
        this.field6833 = this.field6824 + arg6;
        this.field6832 = this.field6826 + arg5;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V", line = 99)
    public static void method2774(byte arg0) {
        field6827 = null;
        if (arg0 >= -120) {
            method2772((byte) 68, null);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)Z", line = 113)
    public final boolean method2775(int arg0, int arg1, int arg2, int arg3) {
        field6835++;
        if (arg3 < this.field6832 || this.field6828 < arg3) {
            return false;
        } else if (arg1 < this.field6831 || this.field6822 < arg1) {
            return false;
        } else if (this.field6833 <= arg2 && this.field6836 >= arg2) {
            int var5 = arg3 - this.field6826;
            if (arg0 < 61) {
                return true;
            } else {
                int var6 = arg2 - this.field6824;
                return var5 * var5 + var6 * var6 < this.field6837;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljr;I)V", line = 140)
    public static final void method2776(class96 arg0, int arg1) {
        field6823++;
        byte[] var2 = new byte[24];
        if (class432.field6076 != null) {
            try {
                class432.field6076.method2337(arg1, 0L);
                class432.field6076.method2332((byte) -60, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method724(24, -16054, var2, arg1);
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 185)
    public class496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field6829 = arg1;
        this.field6837 = arg3 * arg3;
        this.field6826 = arg0;
        this.field6824 = arg2;
        this.field6831 = this.field6829 + arg6;
        this.field6828 = this.field6826 + arg5;
        this.field6832 = this.field6826 + arg4;
        this.field6822 = this.field6829 + arg7;
        this.field6836 = this.field6824 + arg9;
        this.field6833 = this.field6824 + arg8;
    }
}
