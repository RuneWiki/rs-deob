import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class252 implements class4 {

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Ljava/lang/String;")
    private String field3645;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "[I")
    public static int[] field3642 = new int[3];

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Lau;")
    public static class692 field3643 = new class692();

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "Z")
    public static boolean field3653 = false;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3651 = null;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "Z")
    private boolean field3652;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "[Lf;")
    public static class257[] field3646;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)Lsba;", line = 4)
    public final class387 method21(byte arg0) {
        field3638++;
        if (arg0 != -44) {
            this.method1607(-3);
        }
        return class387.field5671;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)Z", line = 15)
    public final boolean method1607(int arg0) {
        if (arg0 != 16523) {
            this.method1607(121);
        }
        field3641++;
        return this.field3652;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)Z", line = 35)
    public static final boolean method1608(int arg0, int arg1, int arg2) {
        int var3 = -1 % ((64 - arg0) / 38);
        field3639++;
        return (arg2 & 0x70000) != 0 | class176.method1287(arg1, arg2, (byte) 118) || class619.method3497(arg2, arg1, 0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/lang/String;)I", line = 45)
    public static final int method1609(int arg0, String arg1) {
        field3649++;
        if (arg0 != 0) {
            method1612(108);
        }
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIII)V", line = 57)
    public static final void method1610(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class396.field5739 = arg4;
        class294.field4106 = arg5;
        class98.field1461 = arg1;
        if (arg0 == 100) {
            class622.field8859 = arg2;
            class270.field3860 = arg6;
            field3644++;
            class456.field6561 = arg3;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 76)
    public static final int method1611(String arg0, byte arg1) {
        field3648++;
        return arg1 <= 14 ? -28 : class79.method612(true, (byte) -123, arg0, 10);
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V", line = 98)
    public static void method1612(int arg0) {
        field3646 = null;
        field3651 = null;
        field3642 = null;
        if (arg0 == 10) {
            field3643 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 110)
    public class252(String arg0) {
        this.field3645 = arg0;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)I", line = 118)
    public final int method20(int arg0) {
        field3640++;
        int var2 = 34 % ((arg0 + 32) / 59);
        int var3 = class82.method635((byte) -119, this.field3645);
        if (var3 >= 0 && var3 <= 100) {
            return var3;
        } else {
            this.field3652 = true;
            return 100;
        }
    }
}
