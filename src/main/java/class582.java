import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class582 {

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "[I")
    public static int[] field8226 = new int[16384];

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "[I")
    public static int[] field8230 = new int[16384];

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "Lcb;")
    public static class631 field8232;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "Lpl;")
    public static class616 field8233;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field8225;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public static int field8227;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public static int field8228;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public static int field8229;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public static int field8231;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
    public static int field8234;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
    public static int field8235;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field8226[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field8230[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
        field8232 = new class631(23, -1);
        field8233 = new class616(16);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIB)Z", line = 4)
    public static final boolean method3356(int arg0, int arg1, byte arg2) {
        field8227++;
        if (arg2 < 94) {
            method3361(-51);
        }
        return (arg1 & 0xC580) != 0;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIILrs;I[BIZ)Lsb;", line = 19)
    public static final class89 method3357(int arg0, int arg1, int arg2, class166 arg3, int arg4, byte[] arg5, int arg6, boolean arg7) {
        if (arg4 != 0) {
            return null;
        }
        field8225++;
        if (!arg3.field2818 && (!class668.method3743((byte) -123, arg6) || !class668.method3743((byte) -121, arg0))) {
            return arg3.field2824 ? new class89(arg3, 34037, arg1, arg6, arg0, arg7, arg5, arg2) : new class89(arg3, arg1, arg6, arg0, class567.method3292(arg6, arg4 ^ 0xFFFFFFBF), class567.method3292(arg0, -96), arg5, arg2);
        } else {
            return new class89(arg3, 3553, arg1, arg6, arg0, arg7, arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V", line = 45)
    public static final void method3358(int arg0) {
        field8228++;
        if (class364.field5573 != null) {
            if (class250.field3989) {
                class263.method1751((byte) 94);
            }
            class532.field7659.method3(32767);
            class645.method3638();
            class175.method1375(false);
            class560.method3249((byte) 111);
            class386.method2415((byte) 102);
            class458.method2804(255);
            if (class93.field1395 != null) {
                class93.field1395.method2146(125);
            }
            class228.method1592(-124);
            class127.method975((byte) -100);
            class329.method2123(2);
            class188.method1431((byte) -100);
            class520.method3097(false, arg0 ^ 0x55C2);
            for (int var1 = 0; var1 < 2048; var1++) {
                class573 var5 = class279.field4271[var1];
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.field1699.length; var6++) {
                        var5.field1699[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class271.field4162; var2++) {
                class461 var3 = class501.field7280[var2].field847;
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1699.length; var4++) {
                        var3.field1699[var4] = null;
                    }
                }
            }
            class257.field4038 = null;
            class44.field744 = null;
            class364.field5573.method3190((byte) 111);
            class364.field5573 = null;
        }
        if (arg0 != 21970) {
            method3361(-127);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(BZII)V", line = 125)
    public static final void method3359(byte arg0, boolean arg1, int arg2, int arg3) {
        field8229++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        } else if (arg0 < -123) {
            class608.field8585 = arg3;
            class411.field6064 = arg2;
            class53.field849 = arg1;
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V", line = 141)
    public static void method3360(int arg0) {
        field8232 = null;
        if (arg0 != -16385) {
            method3357(-28, -51, 97, null, 123, null, 53, false);
        }
        field8233 = null;
        field8226 = null;
        field8230 = null;
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)V", line = 155)
    public static final void method3361(int arg0) {
        field8231++;
        if (arg0 != -16385) {
            return;
        }
        for (class548 var1 = (class548) class85.field1253.method3463((byte) -50); var1 != null; var1 = (class548) class85.field1253.method3469((byte) 107)) {
            class758 var2 = var1.field7821;
            if (var2.field10552) {
                var1.method636((byte) 97);
                var2.method4217(108);
            } else if (class199.field3403 >= var2.field10551) {
                var2.method4215(class83.field1223, 109);
                if (var2.field10552) {
                    var1.method636((byte) 97);
                } else {
                    class719.method3967(var2, true);
                }
            }
        }
    }
}
