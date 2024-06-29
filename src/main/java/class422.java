import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class422 extends class149 {

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "Z")
    public static boolean field6293 = false;

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "Lpg;")
    public static class492 field6301 = new class492(41, 11);

    @OriginalMember(owner = "client!wj", name = "U", descriptor = "Z")
    public static boolean field6304 = false;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "I")
    public static int field6298;

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method2538(boolean arg0, byte[] arg1) {
        ++field6298;
        if (arg0) {
            return null;
        } else {
            class91 var2 = new class91(arg1);
            int var3 = var2.method618((byte) 100);
            int var4 = var2.method626((byte) 100);
            if (var4 < 0 || class406.field6124 != 0 && ~var4 < ~class406.field6124) {
                throw new RuntimeException();
            } else if (var3 == 0) {
                byte[] var5 = new byte[var4];
                var2.method617(0, var4, arg0, var5);
                return var5;
            } else {
                int var6 = var2.method626((byte) 100);
                if (var6 >= 0 && (~class406.field6124 == -1 || var6 <= class406.field6124)) {
                    byte[] var7 = new byte[var6];
                    if (~var3 == -2) {
                        class448.method2704(var7, var6, arg1, var4, 9);
                    } else {
                        class443.field6599.method69(var7, 10, var2);
                    }
                    return var7;
                } else {
                    throw new RuntimeException();
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "(I)V")
    public static final void method2539(int arg0) {
        ++field6302;
        class123.field1752 = new class207(8);
        class217.field3013 = 0;
        for (class134 var1 = (class134) class13.field215.method2358((byte) 86); var1 != null; var1 = (class134) class13.field215.method2363(31844)) {
            var1.method866();
        }
        int var2 = -58 % ((arg0 - 67) / 39);
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(BII)I")
    public static final int method2540(byte arg0, int arg1, int arg2) {
        int var3 = 122 % ((41 - arg0) / 34);
        ++field6300;
        return ~arg1 != -2 && arg1 != 3 ? class141.field2044[arg2 & 3] : class457.field6706[arg2 & 3];
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIILbv;II)Log;")
    public static final class346 method2541(int arg0, int arg1, int arg2, class282 arg3, int arg4, int arg5) {
        int var6 = -123 / (-arg5 / 51);
        ++field6297;
        if (!arg3.field4134 && (!class124.method799(true, arg2) || !class124.method799(true, arg1))) {
            return !arg3.field4155 ? new class346(arg3, arg0, arg4, arg2, arg1, class353.method2231(arg2, (byte) -84), class353.method2231(arg1, (byte) -84), true) : new class346(arg3, 34037, arg0, arg4, arg2, arg1, true);
        } else {
            return new class346(arg3, 3553, arg0, arg4, arg2, arg1, true);
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
    public class422() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)[I")
    public final int[] method92(int arg0, int arg1) {
        ++field6292;
        if (arg0 != -10835) {
            return null;
        } else {
            int[] var3 = super.field2152.method2891(arg1, (byte) 97);
            if (super.field2152.field7051) {
                int var4 = class185.field2613[arg1];
                for (int var5 = 0; ~class316.field4838 < ~var5; ++var5) {
                    var3[var5] = this.method2545(class197.field2791[var5], (byte) -124, var4) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(III)Ldr;")
    public static final class420 method2542(int arg0, int arg1, int arg2) {
        if (class380.field5802[arg0][arg1][arg2] == null) {
            boolean var3 = class380.field5802[0][arg1][arg2] != null && class380.field5802[0][arg1][arg2].field6275 != null;
            if (var3 && arg0 >= class222.field3107 - 1) {
                return null;
            }
            class471.method2823(arg0, arg1, arg2);
        }
        return class380.field5802[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIII)V")
    public static final void method2543(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6296;
        if (arg4 == -1) {
            if (arg1 >= class396.field6021 && ~class443.field6591 <= ~arg3 && ~class410.field6176 >= ~arg2 && class158.field2302 >= arg0) {
                class111.method732(arg2, arg5, arg0, 19083, arg1, arg3);
            } else {
                class511.method3047(arg5, arg1, arg0, arg3, arg2, -2510);
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "(I)V")
    public static void method2544(int arg0) {
        field6301 = null;
        if (arg0 < 5) {
            field6304 = true;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IBI)I")
    private final int method2545(int arg0, byte arg1, int arg2) {
        ++field6295;
        if (arg1 > -105) {
            return -15;
        } else {
            int var4 = arg0 - -(arg2 * 57);
            int var5 = var4 << 1 ^ var4;
            return 4096 - (Integer.MAX_VALUE & (var5 * 15731 * var5 - -789221) * var5 + 1376312589) / 262144;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIBIII)V")
    public static final void method2546(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (~class396.field6021 >= ~(-arg5 + arg6) && class443.field6591 >= arg6 - -arg5 && ~class410.field6176 >= ~(-arg5 + arg2) && ~(arg2 + arg5) >= ~class158.field2302) {
            class530.method3128(arg0, arg2, arg6, (byte) -112, arg4, arg5, arg1);
        } else {
            class502.method3003(arg5, arg2, arg4, arg1, arg6, (byte) 97, arg0);
        }
        ++field6303;
        if (arg3 < 74) {
            field6294 = -49;
        }
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(III)Z")
    public static final boolean method2547(int arg0, int arg1, int arg2) {
        ++field6299;
        if (arg2 <= 23) {
            return false;
        } else {
            return class57.method389((byte) -98, arg1, arg0) | ~(arg0 & 393216) != -1 || class170.method1196(arg0, 45056, arg1) || class281.method1762(arg0, false, arg1);
        }
    }
}
