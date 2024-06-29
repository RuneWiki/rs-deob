import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class165 extends OutputStream {

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "[I")
    public static int[] field2504 = new int[5];

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Lgb;")
    public static class149 field2499 = new class149();

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "F")
    public static float field2501;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZLka;)V")
    public static final void method1094(boolean arg0, class264 arg1) {
        if (!arg0) {
            return;
        }
        int var2 = arg1.field4201 - class267.field4256;
        field2506++;
        int var3 = arg1.field4126 * 128 + (arg1.method226((byte) -97) * 64);
        int var4 = arg1.field4142 * 128 + arg1.method226((byte) -97) * 64;
        arg1.field4178 = 0;
        if (arg1.field4218 == 0) {
            arg1.field4199 = 1024;
        }
        arg1.field4123 += (var4 - arg1.field4123) / var2;
        if (arg1.field4218 == 1) {
            arg1.field4199 = 1536;
        }
        if (arg1.field4218 == 2) {
            arg1.field4199 = 0;
        }
        if (arg1.field4218 == 3) {
            arg1.field4199 = 512;
        }
        arg1.field4176 += (var3 - arg1.field4176) / var2;
    }

    @OriginalMember(owner = "client!sg", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field2500++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)Lgd;")
    public static final class75 method1095(int arg0, byte arg1) {
        field2505++;
        class75 var2 = (class75) class258.field3949.method1780((long) arg0, (byte) -122);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class65.field1038.method1163(30, arg0, 48);
        if (arg1 != 53) {
            field2501 = -1.236315F;
        }
        class75 var4 = new class75();
        if (var3 != null) {
            var4.method599(arg0, new class37(var3), (byte) -128);
        }
        class258.field3949.method1784(var4, false, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IS)Z")
    public static final boolean method1096(int arg0, short arg1) {
        field2503++;
        if (arg0 != 3) {
            field2501 = -1.0320987F;
        }
        if (arg1 == 34 || arg1 == 57 || arg1 == 29 || arg1 == 1 || arg1 == 8 || arg1 == 12 || arg1 == 7 || arg1 == 41) {
            return true;
        } else if (arg1 == 6 || arg1 == 5 || arg1 == 1003 || arg1 == 1001) {
            return true;
        } else if (arg1 == 32 || arg1 == 50 || arg1 == 11 || arg1 == 45 || arg1 == 38) {
            return true;
        } else {
            return arg1 == 28 || arg1 == 13 || arg1 == 33 || arg1 == 24 || arg1 == 60 || arg1 == 30;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static void method1097(int arg0) {
        field2504 = null;
        field2499 = null;
        if (arg0 != 1003) {
            method1096(-36, (short) -100);
        }
    }
}
