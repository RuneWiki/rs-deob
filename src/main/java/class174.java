import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class174 {

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    private int field2875 = 0;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "Lsba;")
    private class200 field2877;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "I")
    public static int field2878 = 0;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "Lu;")
    private class66 field2881;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "[I")
    public static int[] field2873;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZLri;JBIII)V")
    public static final void method1415(boolean arg0, class97 arg1, long arg2, byte arg3, int arg4, int arg5, int arg6) {
        class691.method3913(arg2, arg5, arg1, arg0, arg4, 0, -110, arg6);
        if (arg3 != -38) {
            field2878 = 37;
        }
        field2874++;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)Lu;")
    public final class66 method1416(byte arg0) {
        if (arg0 != 116) {
            method1418((byte) -92, null);
        }
        this.field2875 = 0;
        field2872++;
        return this.method1419((byte) -94);
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(B)V")
    public static void method1417(byte arg0) {
        field2873 = null;
        if (arg0 >= -74) {
            method1420(12, true, -107, null, 91, 0, null, 0);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(BLpba;)I")
    public static final int method1418(byte arg0, class304 arg1) {
        field2876++;
        if (arg0 >= -21) {
            return 75;
        }
        int var2 = arg1.field4770;
        class642 var3 = arg1.method1856(1208);
        if (arg1.field4183 == -1 || arg1.field4217) {
            var2 = arg1.field4750;
        } else if (arg1.field4183 == var3.field9024 || arg1.field4183 == var3.field9042 || arg1.field4183 == var3.field9011 || arg1.field4183 == var3.field9046) {
            var2 = arg1.field4788;
        } else if (arg1.field4183 == var3.field9002 || arg1.field4183 == var3.field9023 || arg1.field4183 == var3.field9029 || arg1.field4183 == var3.field9015) {
            var2 = arg1.field4784;
        }
        return var2;
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(B)Lu;")
    public final class66 method1419(byte arg0) {
        field2879++;
        if (this.field2875 > 0 && this.field2877.field3259[this.field2875 - 1] != this.field2881) {
            class66 var2 = this.field2881;
            this.field2881 = var2.field848;
            return var2;
        }
        int var3 = 108 / ((arg0 - 12) / 61);
        while (this.field2877.field3264 > this.field2875) {
            class66 var4 = this.field2877.field3259[this.field2875++].field848;
            if (this.field2877.field3259[this.field2875 - 1] != var4) {
                this.field2881 = var4.field848;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IZI[BIILer;I)Lcea;")
    public static final class197 method1420(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4, int arg5, class92 arg6, int arg7) {
        if (arg5 != 0) {
            field2873 = null;
        }
        field2880++;
        if (!arg6.field1376 && (!class416.method2649(arg0, true) || !class416.method2649(arg4, true))) {
            return arg6.field1428 ? new class197(arg6, 34037, arg2, arg0, arg4, arg1, arg3, arg7) : new class197(arg6, arg2, arg0, arg4, class413.method2636(arg0, 127), class413.method2636(arg4, arg5 + 127), arg3, arg7);
        } else {
            return new class197(arg6, 3553, arg2, arg0, arg4, arg1, arg3, arg7);
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V")
    public class174() {
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lsba;)V")
    public class174(class200 arg0) {
        this.field2877 = arg0;
    }
}
