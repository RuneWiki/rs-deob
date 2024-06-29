import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class class13 {

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "Lnaa;")
    public static class71 field104;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)Z")
    public static final boolean method57(int arg0, int arg1, int arg2) {
        int var3 = -98 % ((-arg2 - 83) / 34);
        field106++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILtp;IZIILaa;Lhu;)V")
    public static final void method58(int arg0, class532 arg1, int arg2, boolean arg3, int arg4, int arg5, class485 arg6, class131 arg7) {
        field108++;
        if (arg7 == null) {
            return;
        }
        int var8;
        if (class496.field7014 == 4) {
            var8 = (int) class227.field2590 & 0x3FFF;
        } else {
            var8 = (int) class227.field2590 + class34.field367 & 0x3FFF;
        }
        int var9 = Math.max(arg1.field7658 / 2, arg1.field7573 / 2) + 10;
        int var10 = arg0 * arg0 + (arg5 * arg5);
        if ((var9 * var9) < var10) {
            return;
        }
        int var11 = class260.field3230[var8];
        int var12 = class260.field3229[var8];
        if (class496.field7014 != 4) {
            var12 = var12 * 256 / (class730.field10216 + 256);
            var11 = var11 * 256 / (class730.field10216 + 256);
        }
        if (arg3) {
            method64(null, 96, -13, true, -2, true, 34, null);
        }
        int var13 = arg0 * var12 + arg5 * var11 >> 14;
        int var14 = arg5 * var12 - (arg0 * var11) >> 14;
        arg7.method502(arg4 + var13 + arg1.field7658 / 2 - (arg7.method501() / 2), -var14 + (arg1.field7573 / 2 + arg2 - arg7.method510() / 2), arg6, arg4, arg2);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public static final void method59(int arg0) {
        field105++;
        if (class71.field746 == 0) {
            return;
        }
        try {
            if (++class438.field6368 > 2000) {
                if (class751.field10504 != null) {
                    class751.field10504.method1691(78);
                    class751.field10504 = null;
                }
                if (class183.field2158 >= 2) {
                    class77.field812 = -5;
                    class71.field746 = 0;
                    return;
                }
                class142.field1593.method2759((byte) -53);
                class71.field746 = 1;
                class438.field6368 = 0;
                class183.field2158++;
            }
            if (~class71.field746 == arg0) {
                class344.field4466 = class142.field1593.method2757(-12113, class289.field3549);
                class71.field746 = 2;
            }
            if (class71.field746 == 2) {
                if (class344.field4466.field3573 == 2) {
                    throw new IOException();
                }
                if (class344.field4466.field3573 != 1) {
                    return;
                }
                class751.field10504 = class643.method3665(72, (Socket) class344.field4466.field3577, 7500);
                class344.field4466 = null;
                class704.method3953(73);
                class71.field746 = 4;
            }
            if (class71.field746 == 4 && class751.field10504.method1694(1, 6406)) {
                class751.field10504.method1692(class248.field3008.field2912, 0, -127, 1);
                int var1 = class248.field3008.field2912[0] & 0xFF;
                class71.field746 = 0;
                class77.field812 = var1;
                class751.field10504.method1691(arg0 + 64);
                class751.field10504 = null;
            }
        } catch (IOException var2) {
            if (class751.field10504 != null) {
                class751.field10504.method1691(arg0 ^ 0xFFFFFFA0);
                class751.field10504 = null;
            }
            if (class183.field2158 < 2) {
                class142.field1593.method2759((byte) -53);
                class71.field746 = 1;
                class183.field2158++;
                class438.field6368 = 0;
            } else {
                class71.field746 = 0;
                class77.field812 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[B)V")
    public abstract void method60(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIB)[B")
    public abstract byte[] method61(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)[B")
    public abstract byte[] method62(byte arg0);

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)V")
    public static void method63(byte arg0) {
        if (arg0 < 75) {
            field104 = null;
        }
        field104 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "([IIIZIZILnv;)Ltea;")
    public static final class238 method64(int[] arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6, class417 arg7) {
        if (!arg3) {
            return null;
        }
        field107++;
        if (!arg7.field6061 && (!class560.method3273(-3469, arg2) || !class560.method3273(-3469, arg1))) {
            return arg7.field5996 ? new class238(arg7, 34037, arg2, arg1, arg5, arg0, arg4, arg6) : new class238(arg7, arg2, arg1, class756.method4202(arg3, arg2), class756.method4202(true, arg1), arg0);
        } else {
            return new class238(arg7, 3553, arg2, arg1, arg5, arg0, arg4, arg6);
        }
    }
}
