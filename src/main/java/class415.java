import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class415 extends class519 {

    @OriginalMember(owner = "client!iu", name = "Zb", descriptor = "Lqt;")
    public static class459 field5883 = new class459(39, -1);

    @OriginalMember(owner = "client!iu", name = "Nb", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!iu", name = "Ob", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!iu", name = "Pb", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!iu", name = "Qb", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!iu", name = "Rb", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!iu", name = "Sb", descriptor = "I")
    private int field5876;

    @OriginalMember(owner = "client!iu", name = "Tb", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!iu", name = "Ub", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!iu", name = "Vb", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!iu", name = "Wb", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!iu", name = "Xb", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!iu", name = "Yb", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!iu", name = "ac", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!iu", name = "bc", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!iu", name = "dc", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!iu", name = "Mb", descriptor = "Lph;")
    private class464 field5870;

    @OriginalMember(owner = "client!iu", name = "cc", descriptor = "Lgm;")
    public static class81 field5886;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(III)Lpl;", line = 4)
    public static final class469 method2475(int arg0, int arg1, int arg2) {
        class188 var3 = class461.field6675[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2755;
    }

    @OriginalMember(owner = "client!iu", name = "y", descriptor = "(I)Z", line = 11)
    public final boolean method2476(int arg0) {
        ++field5875;
        if (arg0 != 8) {
            return true;
        } else {
            int var2 = super.field7545[super.field7558] - this.field5870.method2752(-2) & 255;
            return ~var2 <= -129;
        }
    }

    @OriginalMember(owner = "client!iu", name = "z", descriptor = "(I)V", line = 30)
    public final void method2477(int arg0) {
        this.field5876 = super.field7558 * 8;
        if (arg0 == -129) {
            ++field5880;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I[I)V", line = 46)
    public final void method2478(int arg0, int[] arg1) {
        ++field5872;
        this.field5870 = new class464(arg1);
        int var3 = 100 % ((50 - arg0) / 52);
    }

    @OriginalMember(owner = "client!iu", name = "A", descriptor = "(I)I", line = 58)
    public final int method2479(int arg0) {
        ++field5879;
        int var2 = 255 & super.field7545[super.field7558++] + -this.field5870.method2755(arg0 + 1209616167);
        return arg0 < ~var2 ? var2 : (super.field7545[super.field7558++] + -this.field5870.method2755(1209616038) & 255) + (var2 - 128 << 8);
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(ZI)V", line = 71)
    public final void method2480(boolean arg0, int arg1) {
        if (!arg0) {
            this.method2487(-87, 47);
        }
        ++field5881;
        super.field7545[super.field7558++] = (byte) (arg1 + this.field5870.method2755(1209616038));
    }

    @OriginalMember(owner = "client!iu", name = "r", descriptor = "(II)I", line = 88)
    public final int method2481(int arg0, int arg1) {
        ++field5877;
        if (arg0 != -5) {
            this.field5870 = null;
        }
        return arg1 * 8 + -this.field5876;
    }

    @OriginalMember(owner = "client!iu", name = "B", descriptor = "(I)V", line = 99)
    public final void method2482(int arg0) {
        super.field7558 = (this.field5876 + 7) / arg0;
        ++field5884;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lqa;ILgw;II)V", line = 110)
    public static final void method2483(class167 arg0, int arg1, class118 arg2, int arg3, int arg4) {
        ++field5874;
        class241.field3617.method861(-1);
        if (!class138.field2155) {
            for (class528 var5 = (class528) arg2.method863(-1); var5 != null; var5 = (class528) arg2.method865(-1)) {
                class463 var6 = class382.field5447.method1429(var5.field7723, -3708);
                if (class53.method470(var6, 32478)) {
                    boolean var7 = class257.method1661(var6, -97, arg4, arg0, var5, arg1);
                    if (var7) {
                        class283.method1827(arg0, var5, var6, (byte) -123);
                    }
                }
            }
            if (arg3 <= 85) {
                field5886 = null;
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "(Z)V", line = 146)
    public static final void method2484(boolean arg0) {
        ++field5873;
        class536 var1 = null;
        try {
            class81 var2 = class280.field4173.method2463(false, "3", false);
            if (!arg0) {
                return;
            }
            while (~var2.field1314 == -1) {
                class477.method2826(1L, 0);
            }
            if (var2.field1314 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class536) var2.field1311;
            byte[] var3 = new byte[(int) var1.method3160((byte) 74)];
            if (~var3.length == -1) {
                class451.field6587 = "";
                class315.field4692 = "";
            } else {
                int var5;
                for (int var4 = 0; ~var3.length < ~var4; var4 += var5) {
                    var5 = var1.method3161(var3, var3.length + -var4, 127, var4);
                    if (~var5 == 0) {
                        throw new IOException("EOF");
                    }
                }
                class519 var6 = new class519(var3);
                int var7 = var6.method3072((byte) -128);
                if (var7 > 50) {
                    throw new RuntimeException("Bad length");
                }
                var6.field7558 = var7 + 1;
                if (!var6.method3055(-107)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field7558 = 1;
                int var8 = var6.method3072((byte) -122);
                if (~var8 != -1) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class315.field4692 = var6.method3027(0);
                class451.field6587 = var6.method3027(0);
            }
        } catch (Exception var10) {
            class451.field6587 = "";
            class315.field4692 = "";
        }
        try {
            if (var1 != null) {
                var1.method3165(-7527);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(I)V", line = 225)
    public class415(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!iu", name = "C", descriptor = "(I)V", line = 234)
    public static void method2485(int arg0) {
        field5886 = null;
        field5883 = null;
        if (arg0 != 19486) {
            method2475(39, 56, -64);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II[BZ)V", line = 248)
    public final void method2486(int arg0, int arg1, byte[] arg2, boolean arg3) {
        for (int var5 = 0; var5 < arg1; ++var5) {
            arg2[var5 - -arg0] = (byte) (super.field7545[super.field7558++] + -this.field5870.method2755(1209616038));
        }
        if (arg3) {
            field5883 = null;
        }
        ++field5871;
    }

    @OriginalMember(owner = "client!iu", name = "s", descriptor = "(II)I", line = 266)
    public final int method2487(int arg0, int arg1) {
        ++field5882;
        int var3 = this.field5876 >> 3;
        int var4 = -(this.field5876 & 7) + 8;
        this.field5876 += arg0;
        if (arg1 >= 0) {
            return 86;
        } else {
            int var5 = 0;
            while (~var4 > ~arg0) {
                var5 += (super.field7545[var3++] & class18.field204[var4]) << -var4 + arg0;
                arg0 -= var4;
                var4 = 8;
            }
            int var6;
            if (arg0 != var4) {
                var6 = (super.field7545[var3] >> -arg0 + var4 & class18.field204[arg0]) + var5;
            } else {
                var6 = (class18.field204[var4] & super.field7545[var3]) + var5;
            }
            return var6;
        }
    }
}
