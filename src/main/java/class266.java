import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class266 {

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "Z")
    public static boolean field3354 = false;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "Lkg;")
    public static class179 field3355 = new class179(13, 3);

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "Lcu;")
    public static class147 field3358 = new class147(14, 1);

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "Lcu;")
    public static class147 field3359 = new class147(15, 4);

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "Lcu;")
    public static class147 field3360 = new class147(16, -2);

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "Lcu;")
    public static class147 field3361 = new class147(17, 0);

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "Lcu;")
    public static class147 field3362 = new class147(18, -2);

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "Lcu;")
    public static class147 field3363 = new class147(19, -2);

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "Lcu;")
    public static class147 field3364 = new class147(20, 6);

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "Lcu;")
    public static class147 field3365 = new class147(21, 9);

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "Lcu;")
    public static class147 field3366 = new class147(22, -2);

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "Lcu;")
    public static class147 field3367 = new class147(23, 4);

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "Lcu;")
    public static class147 field3368 = new class147(24, -1);

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "Lcu;")
    public static class147 field3369 = new class147(25, -2);

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "[Lcu;")
    private static class147[] field3370 = new class147[32];

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public int field3351;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public int field3352;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public int field3353;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public int field3356;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public static int field3357;

    static {
        class147[] var0 = class429.method2513(0);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3370[var0[var1].field1865] = var0[var1];
        }
        field3371 = -1;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 7)
    public static final void method1583(int arg0) {
        class303.field3890.method343(class510.field7367, class407.field5817.field3636 ? class513.field7437 + 256 << 0 : -1, arg0);
        field3350++;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V", line = 23)
    public static void method1584(int arg0) {
        field3370 = null;
        field3358 = null;
        field3360 = null;
        field3361 = null;
        field3368 = null;
        field3367 = null;
        field3365 = null;
        field3362 = null;
        field3355 = null;
        field3369 = null;
        field3366 = null;
        if (arg0 != -12092) {
            method1584(88);
        }
        field3364 = null;
        field3363 = null;
        field3359 = null;
    }
}
