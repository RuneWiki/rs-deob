import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class164 {

    @OriginalMember(owner = "client!dca", name = "l", descriptor = "I")
    public int field2570;

    @OriginalMember(owner = "client!dca", name = "g", descriptor = "[I")
    public int[] field2565;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "[I")
    public int[] field2559;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "Ldb;")
    public static class298 field2560 = new class298(15, 3);

    @OriginalMember(owner = "client!dca", name = "i", descriptor = "Llj;")
    public static class570 field2567 = new class570(12, 0, 1, 0);

    @OriginalMember(owner = "client!dca", name = "m", descriptor = "Ldb;")
    public static class298 field2571 = new class298(27, 17);

    @OriginalMember(owner = "client!dca", name = "n", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!dca", name = "h", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!dca", name = "j", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!dca", name = "k", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!dca", name = "o", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!dca", name = "f", descriptor = "Lek;")
    public static class474 field2564;

    static {
        new class73("", 73);
        field2572 = -1;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 3)
    public static final String method1128(int arg0, byte arg1) {
        int var2 = 83 % ((arg1 - 79) / 42);
        field2566++;
        return (arg0 >> 24 & 0xFF) + "." + ((arg0 & 0xFF1D64) >> 16) + "." + ((arg0 & 0xFF70) >> 8) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZIIIIIIII)V", line = 13)
    public static final void method1129(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2562++;
        class188.method1234(arg1, arg5, arg3, (byte) 109, 0, arg8, arg7, arg4, arg6, arg2);
        if (!arg0) {
            method1128(-31, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(III)Z", line = 42)
    public static final boolean method1130(int arg0, int arg1, int arg2) {
        field2568++;
        if (arg1 != -1) {
            method1131((byte) -42);
        }
        return (arg2 & 0x800) != 0 | class480.method2681(arg2, 23978, arg0) || class271.method1648(0, arg0, arg2);
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)V", line = 55)
    public static void method1131(byte arg0) {
        field2560 = null;
        field2564 = null;
        if (arg0 < 78) {
            method1129(false, -43, -59, 109, -84, -80, -5, 74, 49);
        }
        field2571 = null;
        field2567 = null;
    }

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(III)I", line = 69)
    public static final int method1132(int arg0, int arg1, int arg2) {
        field2561++;
        int var3 = class635.method3511(arg2 - 1, arg1 - 1, (byte) -21) - (-class635.method3511(arg2 - 1, arg1 - -1, (byte) -15) - class635.method3511(arg2 + 1, arg1 + -1, (byte) -28) - class635.method3511(arg2 - -1, arg1 + 1, (byte) -45));
        int var4 = class635.method3511(arg2, arg1 - 1, (byte) -92) - (-class635.method3511(arg2, arg1 + 1, (byte) -28) - class635.method3511(arg2 - 1, arg1, (byte) -61)) + class635.method3511(arg2 + 1, arg1, (byte) -12);
        int var5 = class635.method3511(arg2, arg1, (byte) -34);
        if (arg0 != 0) {
            field2571 = null;
        }
        return var4 / 8 + var3 / 16 + var5 / 4;
    }

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(I)V", line = 97)
    public class164(int arg0) {
        this.field2570 = arg0;
        this.field2565 = new int[this.field2570];
        this.field2559 = new int[this.field2570];
    }
}
