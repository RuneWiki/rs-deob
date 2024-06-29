import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class67 {

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "I")
    private int field1032;

    @OriginalMember(owner = "client!vha", name = "k", descriptor = "[Lob;")
    private class4[] field1041;

    @OriginalMember(owner = "client!vha", name = "g", descriptor = "S")
    public static short field1037 = 256;

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "[I")
    public static int[] field1031 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!vha", name = "j", descriptor = "Lms;")
    public static class404 field1040 = new class404();

    @OriginalMember(owner = "client!vha", name = "m", descriptor = "Lmaa;")
    public static class508 field1043 = new class508(1, 8);

    @OriginalMember(owner = "client!vha", name = "e", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!vha", name = "h", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!vha", name = "i", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!vha", name = "l", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!vha", name = "d", descriptor = "J")
    private long field1034;

    @OriginalMember(owner = "client!vha", name = "f", descriptor = "Lob;")
    private class4 field1036;

    @OriginalMember(owner = "client!vha", name = "c", descriptor = "Lbea;")
    public static class543 field1033;

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(JZ)Lob;")
    public final class4 method533(long arg0, boolean arg1) {
        field1039++;
        this.field1034 = arg0;
        class4 var4 = this.field1041[(int) ((long) (this.field1032 - 1) & arg0)];
        this.field1036 = var4.field33;
        if (!arg1) {
            field1033 = null;
        }
        while (this.field1036 != var4) {
            if (this.field1036.field40 == arg0) {
                class4 var5 = this.field1036;
                this.field1036 = this.field1036.field33;
                return var5;
            }
            this.field1036 = this.field1036.field33;
        }
        this.field1036 = null;
        return null;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(B)Lob;")
    public final class4 method534(byte arg0) {
        field1042++;
        if (arg0 != -123) {
            return null;
        } else if (this.field1036 == null) {
            return null;
        } else {
            class4 var2 = this.field1041[(int) (this.field1034 & (long) (this.field1032 - 1))];
            while (this.field1036 != var2) {
                if (this.field1036.field40 == this.field1034) {
                    class4 var3 = this.field1036;
                    this.field1036 = this.field1036.field33;
                    return var3;
                }
                this.field1036 = this.field1036.field33;
            }
            this.field1036 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(JLob;B)V")
    public final void method535(long arg0, class4 arg1, byte arg2) {
        if (arg2 > -100) {
            method537(43, -55, 28, -11, null, false, -98L);
        }
        if (arg1.field35 != null) {
            arg1.method21(104);
        }
        field1038++;
        class4 var5 = this.field1041[(int) ((long) (this.field1032 - 1) & arg0)];
        arg1.field33 = var5;
        arg1.field35 = var5.field35;
        arg1.field35.field33 = arg1;
        arg1.field40 = arg0;
        arg1.field33.field35 = arg1;
    }

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "(B)V")
    public static void method536(byte arg0) {
        field1031 = null;
        if (arg0 != -47) {
            field1033 = null;
        }
        field1043 = null;
        field1033 = null;
        field1040 = null;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(IIIILuu;ZJ)V")
    public static final void method537(int arg0, int arg1, int arg2, int arg3, class237 arg4, boolean arg5, long arg6) {
        class646.method3609(arg0, arg4, (byte) -125, arg5, arg6, 0, arg1, arg2);
        field1035++;
        if (arg3 != -14041) {
            method537(-115, 122, -19, -26, null, true, -2L);
        }
    }

    @OriginalMember(owner = "client!vha", name = "<init>", descriptor = "(I)V")
    public class67(int arg0) {
        this.field1032 = arg0;
        this.field1041 = new class4[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class4 var3 = this.field1041[var2] = new class4();
            var3.field35 = var3;
            var3.field33 = var3;
        }
    }
}
