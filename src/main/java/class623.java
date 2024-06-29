import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class623 {

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Ljb;")
    public static class519 field8408 = new class519(29, -2);

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "Z")
    private static boolean field8409 = false;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Ljb;")
    public static class519 field8410 = new class519(97, -1);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field8406;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field8407;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field8411;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Luq;")
    public static class172 field8412;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(JLha;B)V")
    public static final void method3437(long arg0, class66 arg1, byte arg2) {
        class605.field8202 = 0;
        field8406++;
        class552.field7617 = class428.field6216;
        class563.field7714 = 0;
        class428.field6216 = 0;
        long var4 = class401.method2440(false);
        for (class150 var6 = (class150) class69.field954.method2189((byte) 120); var6 != null; var6 = (class150) class69.field954.method2192(0)) {
            if (var6.method1044(arg1, arg0)) {
                class605.field8202++;
            }
        }
        if (arg2 >= -97) {
            method3440((byte) 50, null, null);
        }
        if (field8409 && (arg0 % 100L) == 0L) {
            System.out.println("Particle system count: " + class69.field954.method2190((byte) -91) + ", running: " + class605.field8202);
            System.out.println("Emitters: " + class563.field7714 + " Particles: " + class428.field6216 + ". Time taken: " + (class401.method2440(false) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static void method3438(int arg0) {
        field8410 = null;
        field8412 = null;
        field8408 = null;
        if (arg0 != 0) {
            field8409 = true;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V")
    public static final void method3439(int arg0, int arg1) {
        if (arg1 <= 40) {
            field8410 = null;
        }
        field8411++;
        if (class159.field2142 == 1) {
            class323.field4591 = arg0;
        } else if (class159.field2142 == 2) {
            class14.field146 = arg0;
            return;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B[Ljava/lang/Object;[I)V")
    public static final void method3440(byte arg0, Object[] arg1, int[] arg2) {
        class16.method90(arg2.length - 1, arg1, (byte) 113, arg2, 0);
        if (arg0 >= -9) {
            field8409 = false;
        }
        field8407++;
    }
}
