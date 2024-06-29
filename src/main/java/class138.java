import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class138 {

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field3299 = 2;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field3303 = 0;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "Lkc;")
    public static class67 field3305 = class19.method144("backbase2", 104);

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field3298 = 0;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "Lkc;")
    private static class67 field3306 = class19.method144("glow1:", 74);

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "Z")
    public static boolean field3304 = false;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Lkc;")
    public static class67 field3301 = class19.method144(" (X", 116);

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Lkc;")
    public static class67 field3295 = field3306;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "[I")
    public static int[] field3308 = new int[2048];

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "Lab;")
    public static class3 field3309;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZ)V", line = 9)
    public static final synchronized void method1067(int arg0, boolean arg1) {
        if (class112.field2598 != null) {
            class112.field2598.method198(arg0);
        }
        if (!arg1) {
            method1068(100);
        }
        field3297++;
        class67.method550(true, arg0);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 24)
    public static void method1068(int arg0) {
        field3306 = null;
        if (arg0 != 0) {
            method1069(null, 76);
        }
        field3301 = null;
        field3305 = null;
        field3295 = null;
        field3309 = null;
        field3308 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(J)V", line = 53)
    public void method295(long arg0) {
        field3302++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([II)V", line = 75)
    public static final synchronized void method1069(int[] arg0, int arg1) {
        int var2 = arg1;
        if (class45.field1098) {
            var2 = arg1 << 1;
        }
        int var3 = 0;
        var2 -= 7;
        while (var3 < var2) {
            arg0[var3++] = 0;
            arg0[var3++] = 0;
            arg0[var3++] = 0;
            arg0[var3++] = 0;
            arg0[var3++] = 0;
            arg0[var3++] = 0;
            arg0[var3++] = 0;
            arg0[var3++] = 0;
        }
        var2 += 7;
        while (var3 < var2) {
            arg0[var3++] = 0;
        }
        if (class112.field2598 != null) {
            class112.field2598.method196(arg0, 0, arg1);
        }
        class67.method550(true, arg1);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ldd;I)V", line = 112)
    public static final synchronized void method1070(class26 arg0, int arg1) {
        class112.field2598 = arg0;
        if (arg1 != 4165) {
            field3295 = null;
        }
        field3294++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()V", line = 138)
    public void method299() {
        field3296++;
    }
}
