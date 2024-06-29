import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class338 {

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "[S")
    private static short[] field4734 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "[S")
    private static short[] field4735 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!fda", name = "f", descriptor = "[S")
    private static short[] field4737 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!fda", name = "i", descriptor = "Z")
    public static boolean field4740 = false;

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "[[S")
    public static short[][] field4736 = new short[][] { field4737, field4734, field4735 };

    @OriginalMember(owner = "client!fda", name = "j", descriptor = "Lbu;")
    public static class21 field4741 = new class21(79, -1);

    @OriginalMember(owner = "client!fda", name = "l", descriptor = "Lpha;")
    public static class174 field4743 = new class174("", 13);

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!fda", name = "g", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!fda", name = "h", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!fda", name = "k", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "[Lje;")
    public static class421[] field4733;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V", line = 4)
    public static void method2143(int arg0) {
        field4735 = null;
        field4734 = null;
        field4733 = null;
        field4741 = null;
        field4737 = null;
        field4736 = null;
        field4743 = null;
        if (arg0 != 13052) {
            field4743 = null;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZLvn;)V", line = 27)
    public static final void method2144(boolean arg0, class330 arg1) {
        field4738++;
        boolean var2 = false;
        if (class192.field2961 == arg1.field4658 || arg1.field4604 == -1 || arg1.field4580 != 0) {
            var2 = true;
        } else {
            class607 var3 = class563.field7993.method651(arg1.field4604, (byte) 98);
            if (var3.field8504 || var3.field8494[arg1.field4583] < arg1.field4575 + 1) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field4658 - arg1.field4629;
            int var5 = class192.field2961 - arg1.field4629;
            int var6 = arg1.field4586 * 512 + (arg1.method2102(true) * 256);
            int var7 = arg1.field4591 * 512 + arg1.method2102(arg0) * 256;
            int var8 = arg1.field4655 * 512 + (arg1.method2102(true) * 256);
            int var9 = arg1.field4602 * 512 + arg1.method2102(true) * 256;
            arg1.field5742 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg1.field5746 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg1.field4676 = 0;
        if (arg1.field4594 == 0) {
            arg1.method2103(!arg0, false, 8192);
        }
        if (!arg0) {
            return;
        }
        if (arg1.field4594 == 1) {
            arg1.method2103(false, false, 12288);
        }
        if (arg1.field4594 == 2) {
            arg1.method2103(false, false, 0);
        }
        if (arg1.field4594 == 3) {
            arg1.method2103(!arg0, false, 4096);
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(BZ)Z", line = 93)
    public static final boolean method2145(byte arg0, boolean arg1) {
        field4732++;
        boolean var2 = class37.field491.method451();
        if (arg0 > -6) {
            method2143(57);
        }
        if (arg1 == var2) {
            return true;
        }
        if (!arg1) {
            class37.field491.method447();
        } else if (!class37.field491.method431()) {
            arg1 = false;
        }
        if (var2 == arg1) {
            return false;
        } else {
            class21.field353.method4080(true, class21.field353.field10090, arg1 ? 1 : 0);
            class580.method3397((byte) 13);
            return true;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIIBLha;III)V", line = 141)
    public static final void method2146(int arg0, int arg1, int arg2, byte arg3, class65 arg4, int arg5, int arg6, int arg7) {
        field4739++;
        arg4.method436(arg0, arg5, arg2, arg6, true, arg1);
        arg4.method436(arg0 + 1, arg5 + -2, arg7, arg6 + 1, true, 16);
        arg4.method540(arg1 - 19, arg0 + 1, 25951, arg7, arg6 + 18, arg5 + -2);
        if (arg3 <= 119) {
            field4743 = null;
        }
    }
}
