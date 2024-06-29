import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class176 extends class206 {

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "J")
    public long field2822;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "Lmh;")
    private static class62 field2810 = class201.method1405(true, "green:");

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "Lmh;")
    public static class62 field2814 = field2810;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "Lmh;")
    public static class62 field2812 = field2810;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public static int field2811 = 0;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "Lmh;")
    public static class62 field2813 = class201.method1405(true, "scape main");

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public static int field2819 = 0;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public static int field2817 = 0;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "Lmh;")
    private static class62 field2821 = class201.method1405(true, "Free world");

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "Lmh;")
    public static class62 field2820 = field2821;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(B)V", line = 4)
    public static final void method1239(byte arg0) {
        field2815++;
        class272.field4626.method40(arg0 + 94);
        for (int var1 = 0; var1 < 32; var1++) {
            class31.field429[var1] = 0L;
        }
        int var2 = 0;
        if (arg0 != -94) {
            method1241(-7, -85, -19);
        }
        while (var2 < 32) {
            class134.field2186[var2] = 0L;
            var2++;
        }
        class56.field815 = 0;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V", line = 35)
    public static final void method1240(int arg0) {
        field2816++;
        class184.field2941.method1392(arg0 + arg0);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)I", line = 45)
    public static final int method1241(int arg0, int arg1, int arg2) {
        if (arg0 != 65408) {
            return 122;
        }
        field2818++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(B)V", line = 113)
    public static void method1242(byte arg0) {
        field2821 = null;
        field2812 = null;
        field2814 = null;
        if (arg0 == -115) {
            field2813 = null;
            field2810 = null;
            field2820 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V", line = 146)
    public class176() {
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(J)V", line = 151)
    public class176(long arg0) {
        this.field2822 = arg0;
    }
}
