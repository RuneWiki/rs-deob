import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class222 extends class183 {

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public int field4014;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "Ldj;")
    public static class44 field4012 = class89.method650(255, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "[I")
    public static int[] field4013 = new int[99];

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "Z")
    public static boolean field4011 = false;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "Ldj;")
    public static class44 field4017 = class89.method650(255, "<col=ffffff>");

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "Ldj;")
    public static class44 field4015 = class89.method650(255, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)I")
    public static final int method1431(int arg0, int arg1) {
        if (arg0 >= -127) {
            method1433((byte) 102);
        }
        field4019++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIILwd;IJ)Z")
    public static final boolean method1432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class234 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class143.method947(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
    public class222() {
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(I)V")
    public class222(int arg0) {
        this.field4014 = arg0;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
    public static void method1433(byte arg0) {
        if (arg0 < 5) {
            method1431(114, -20);
        }
        field4017 = null;
        field4012 = null;
        field4013 = null;
        field4015 = null;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field4013[var1] = var0 / 4;
        }
    }
}
