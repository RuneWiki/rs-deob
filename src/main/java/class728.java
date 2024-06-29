import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class728 {

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "[I")
    public static int[] field9996 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Z")
    public static boolean field9997 = true;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field9993;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field9994;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field9995;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)Lva;", line = 11)
    public static final class524 method4037(int arg0, int arg1, int arg2) {
        class549 var3 = class325.field4448[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7464;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lfca;I)Ldr;", line = 19)
    public static final class751 method4038(class93 arg0, int arg1) {
        field9995++;
        return arg1 == -11 ? new class751(arg0.method774(-4), arg0.method774(-4), arg0.method774(-4), arg0.method774(-4), arg0.method767((byte) -125), arg0.method767((byte) -123), arg0.method793((byte) 25)) : null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZIBI)Ljava/lang/String;", line = 33)
    public static final String method4039(boolean arg0, int arg1, byte arg2, int arg3) {
        field9994++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (arg0 && arg1 >= 0) {
            int var4 = 2;
            int var5 = arg1 / arg3;
            while (var5 != 0) {
                var5 /= arg3;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg1;
                arg1 /= arg3;
                int var9 = var8 - arg1 * arg3;
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            if (arg2 != 38) {
                field9996 = null;
            }
            return new String(var6);
        } else {
            return Integer.toString(arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZLkka;)V", line = 83)
    public static final void method4040(boolean arg0, class329 arg1) {
        for (int var2 = 0; var2 < class35.field582; var2++) {
            int var3 = class88.field1218[var2];
            class771 var4 = class527.field7150[var3];
            int var5 = arg1.method793((byte) 51);
            if ((var5 & 0x80) != 0) {
                var5 += arg1.method793((byte) 119) << 8;
            }
            if ((var5 & 0x4000) != 0) {
                var5 += arg1.method793((byte) 70) << 16;
            }
            class532.method3015(arg1, (byte) -82, var3, var5, var4);
        }
        field9993++;
        if (arg0) {
            method4041((byte) 18);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V", line = 116)
    public static void method4041(byte arg0) {
        if (arg0 >= 46) {
            field9996 = null;
        }
    }
}
