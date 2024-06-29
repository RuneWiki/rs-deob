import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class79 extends class573 {

    @OriginalMember(owner = "client!tt", name = "I", descriptor = "I")
    private int field1574 = 4096;

    @OriginalMember(owner = "client!tt", name = "J", descriptor = "I")
    private int field1575 = 0;

    @OriginalMember(owner = "client!tt", name = "N", descriptor = "I")
    public static int field1579 = 1337;

    @OriginalMember(owner = "client!tt", name = "K", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!tt", name = "L", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!tt", name = "M", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!tt", name = "O", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!tt", name = "Q", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!tt", name = "P", descriptor = "Ldaa;")
    public static class11 field1581;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIILom;)Lnda;")
    public static final class519 method826(int arg0, int arg1, int arg2, class344 arg3) {
        ++field1576;
        if (arg2 != 4096) {
            field1581 = null;
        }
        byte[] var4 = arg3.method2216(arg0, arg1, true);
        return var4 == null ? null : new class519(var4);
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "()V")
    public class79() {
        super(1, true);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            method828((class17) null, (byte) 5, (class344) null);
        }
        ++field1578;
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field1574 = arg0.method723((byte) -25);
            }
        } else {
            this.field1575 = arg0.method723((byte) -25);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        if (arg1 != 1) {
            return null;
        } else {
            ++field1582;
            int[] var3 = super.field8321.method3164(arg0, arg1 ^ -127);
            if (super.field8321.field7825) {
                int[] var4 = this.method3292(0, arg1 ^ 1, arg0);
                for (int var5 = 0; class540.field7555 > var5; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = var6 >= this.field1575 && ~var6 >= ~this.field1574 ? 4096 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "([III[ILcf;B)Lpo;")
    public static final class520 method827(int[] arg0, int arg1, int arg2, int[] arg3, class562 arg4, byte arg5) {
        if (arg5 > -127) {
            field1581 = null;
        }
        ++field1580;
        if (arg4.method2848(class2.field372, class410.field5938, (byte) -87)) {
            byte[] var6 = new byte[arg1 * arg2];
            for (int var7 = 0; var7 < arg2; ++var7) {
                int var8 = arg1 * var7 + arg0[var7];
                for (int var9 = 0; arg3[var7] > var9; ++var9) {
                    var6[var8++] = -1;
                }
            }
            return new class520(arg4, arg1, arg2, var6);
        } else {
            int[] var10 = new int[arg1 * arg2];
            for (int var11 = 0; ~var11 > ~arg2; ++var11) {
                int var12 = arg1 * var11 + arg0[var11];
                for (int var13 = 0; ~var13 > ~arg3[var11]; ++var13) {
                    var10[var12++] = -16777216;
                }
            }
            return new class520(arg4, arg1, arg2, var10);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ln;BLom;)V")
    public static final void method828(class17 arg0, byte arg1, class344 arg2) {
        if (arg1 != 67) {
            method829(true);
        }
        class326.field4776 = arg2;
        class396.field5776 = arg0;
        ++field1577;
        class598.field8577 = "";
        if (class139.field2460.startsWith("win")) {
            class598.field8577 = class598.field8577 + "windows/";
        } else if (class139.field2460.startsWith("linux")) {
            class598.field8577 = class598.field8577 + "linux/";
        } else if (class139.field2460.startsWith("mac")) {
            class598.field8577 = class598.field8577 + "macos/";
        }
        if (!class396.field5776.field771) {
            if (!class139.field2458.startsWith("amd64") && !class139.field2458.startsWith("x86_64")) {
                if (!class139.field2458.startsWith("i386") && !class139.field2458.startsWith("i486") && !class139.field2458.startsWith("i586") && !class139.field2458.startsWith("x86")) {
                    if (!class139.field2458.startsWith("ppc")) {
                        class598.field8577 = class598.field8577 + "universal/";
                    } else {
                        class598.field8577 = class598.field8577 + "ppc/";
                    }
                } else {
                    class598.field8577 = class598.field8577 + "x86/";
                }
            } else {
                class598.field8577 = class598.field8577 + "x86_64/";
            }
        } else {
            class598.field8577 = class598.field8577 + "msjava/";
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)V")
    public static void method829(boolean arg0) {
        if (!arg0) {
            field1581 = null;
        }
    }
}
