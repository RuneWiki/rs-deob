import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class199 extends InputStream {

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "Z")
    public static boolean field2593 = true;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "Ltl;")
    public static class439 field2592;

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "[I")
    public static int[] field2595;

    @OriginalMember(owner = "client!vt", name = "read", descriptor = "()I")
    public final int read() {
        field2594++;
        method1251(30000L, (byte) 122);
        return -1;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(JB)V")
    public static final void method1251(long arg0, byte arg1) {
        field2590++;
        int var3 = 29 % ((67 - arg1) / 32);
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class270.method1600((byte) 16, arg0 - 1L);
            class270.method1600((byte) 16, 1L);
        } else {
            class270.method1600((byte) 16, arg0);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
    public static void method1252(int arg0) {
        if (arg0 > -16) {
            field2592 = null;
        }
        field2592 = null;
        field2595 = null;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZII)I")
    public static final int method1253(boolean arg0, int arg1, int arg2) {
        field2591++;
        if (arg0) {
            return 0;
        }
        class529 var3 = class290.method1705(0, arg0, arg1);
        if (var3 == null) {
            return class19.field280.method1985(true, arg1).field1194;
        }
        int var4 = 0;
        if (arg2 != -9096) {
            method1254(-12, null);
        }
        for (int var5 = 0; var5 < var3.field7796.length; var5++) {
            if (var3.field7796[var5] == -1) {
                var4++;
            }
        }
        return var4 + (class19.field280.method1985(true, arg1).field1194 - var3.field7796.length);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILbf;)V")
    public static final void method1254(int arg0, class375 arg1) {
        field2589++;
        int var2 = arg1.field4844 - class163.field2065;
        int var3 = arg1.field4843 * 128 + (arg1.method1366((byte) -115) * 64);
        int var4 = arg1.field4917 * 128 + arg1.method1366((byte) -116) * 64;
        arg1.field2666 += (var3 - arg1.field2666) / var2;
        arg1.field2677 += (var4 - arg1.field2677) / var2;
        arg1.field4938 = 0;
        if (arg1.field4863 == 0) {
            arg1.method2123(8192, 0);
        }
        if (arg0 <= 68) {
            method1253(true, -54, 93);
        }
        if (arg1.field4863 == 1) {
            arg1.method2123(12288, 0);
        }
        if (arg1.field4863 == 2) {
            arg1.method2123(0, 0);
        }
        if (arg1.field4863 == 3) {
            arg1.method2123(4096, 0);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)I")
    public static final int method1255(int arg0, int arg1) {
        field2588++;
        if (arg1 != 313) {
            method1255(29, 124);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILhd;II)V")
    public static final void method1256(int arg0, class523 arg1, int arg2, int arg3) {
        field2596++;
        if (arg3 <= 17) {
            field2592 = null;
        }
        class10 var4 = arg1.method3122(true, class33.field416);
        if (var4 == null) {
            return;
        }
        class33.field416.method330(arg0, arg2, arg1.field7617 + arg0, arg1.field7574 + arg2);
        if (class230.field2942 < 3) {
            class48.field613.method144((float) arg1.field7617 / 2.0F + (float) arg0, (float) arg1.field7574 / 2.0F + (float) arg2, 4096, ((int) (-class463.field6626) & 0x3FFF) << 2, var4, arg0, arg2);
        } else {
            class33.field416.method324(-16777216, var4, arg0, arg2);
        }
    }
}
