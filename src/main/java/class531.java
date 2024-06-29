import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class531 {

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "Lqr;")
    private class65 field7022 = new class65(128);

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "Lwu;")
    private class376 field7025;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "I")
    public static int field7020;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
    public static int field7024;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
    public static int field7026;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IB)Lnb;", line = 7)
    public final class305 method2959(int arg0, byte arg1) {
        if (arg1 >= -52) {
            method2963(88, -84, 71, -47, -44, (byte) -2);
        }
        field7024++;
        class65 var3 = this.field7022;
        class305 var4;
        synchronized (this.field7022) {
            var4 = (class305) this.field7022.method552(4, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field7025.method2218((byte) 120, class419.method2430(arg0, (byte) -86), class646.method3538(arg0, (byte) -112));
        class305 var6 = new class305();
        if (var5 != null) {
            var6.method1889(88, new class677(var5));
        }
        class65 var7 = this.field7022;
        synchronized (this.field7022) {
            this.field7022.method556((byte) 0, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V", line = 35)
    public static final void method2960(byte arg0) {
        field7026++;
        if (class594.field7712 == 0) {
            return;
        }
        try {
            if (++class763.field10628 > 2000) {
                if (class209.field3089 != null) {
                    class209.field3089.method1439(-1);
                    class209.field3089 = null;
                }
                if (class704.field9766 >= 2) {
                    class594.field7712 = 0;
                    class31.field489 = -5;
                    return;
                }
                class202.field3033.method3103((byte) -89);
                class763.field10628 = 0;
                class704.field9766++;
                class594.field7712 = 1;
            }
            if (arg0 == -33) {
                if (class594.field7712 == 1) {
                    class739.field10201 = class202.field3033.method3104(43594, class66.field828);
                    class594.field7712 = 2;
                }
                if (class594.field7712 == 2) {
                    if (class739.field10201.field2987 == 2) {
                        throw new IOException();
                    }
                    if (class739.field10201.field2987 != 1) {
                        return;
                    }
                    class209.field3089 = class654.method3562(7500, (byte) -113, (Socket) class739.field10201.field2986);
                    class739.field10201 = null;
                    class539.method3007(7388);
                    class594.field7712 = 4;
                }
                if (class594.field7712 == 4 && class209.field3089.method1436(1, 1)) {
                    class209.field3089.method1435(class3.field63.field9399, 1, -125, 0);
                    int var1 = class3.field63.field9399[0] & 0xFF;
                    class31.field489 = var1;
                    class594.field7712 = 0;
                    class209.field3089.method1439(-1);
                    class209.field3089 = null;
                }
            }
        } catch (IOException var2) {
            if (class209.field3089 != null) {
                class209.field3089.method1439(-1);
                class209.field3089 = null;
            }
            if (class704.field9766 >= 2) {
                class594.field7712 = 0;
                class31.field489 = -4;
            } else {
                class202.field3033.method3103((byte) -65);
                class704.field9766++;
                class594.field7712 = 1;
                class763.field10628 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)V", line = 140)
    public static final void method2961(int arg0, int arg1) {
        class727.field10098 = new int[arg1];
        class419.field5774 = new int[arg1];
        field7023++;
        class564.field7411 = new int[arg1];
        class756.field10508 = new int[arg1];
        if (arg0 != 255) {
            method2960((byte) -106);
        }
        class227.field3232 = new int[arg1];
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lee;Z)Lhc;", line = 160)
    public static final class142 method2962(class677 arg0, boolean arg1) {
        field7021++;
        int var2 = arg0.method3799(arg1);
        return new class142(var2);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIIIB)V", line = 170)
    public static final void method2963(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field7020++;
        for (int var6 = arg1; var6 <= arg2; var6++) {
            class717.method4012(arg3, -99, arg4, class690.field9616[var6], arg0);
        }
        if (arg5 < -40) {
            ;
        }
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lms;ILwu;)V", line = 196)
    public class531(class763 arg0, int arg1, class376 arg2) {
        this.field7025 = arg2;
        if (this.field7025 != null) {
            int var4 = this.field7025.method2198(0) - 1;
            this.field7025.method2195(var4, 0);
        }
    }
}
