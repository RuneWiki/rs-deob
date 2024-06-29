import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class251 {

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public int field2940;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "Llja;")
    public static class744 field2942 = new class744(87, 2);

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field2948 = 0;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "[I")
    public static int[] field2947 = new int[2];

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "Z")
    public static boolean field2946 = false;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "Lbt;")
    public static class48 field2945;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "[Ltf;")
    public static class312[] field2949;

    @OriginalMember(owner = "client!lf", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field2943++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBLbn;)V", line = 11)
    public static final void method1499(int arg0, byte arg1, class468 arg2) {
        field2944++;
        class666.field9157 = 0;
        class636.field8672 = false;
        class740.method4157(arg2, -119);
        if (arg1 != 25) {
            method1500(87);
        }
        class218.method1355(arg1 ^ 0x11, arg2);
        if (class636.field8672) {
            System.out.println("---endgpp---");
        }
        if (arg2.field5262 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg2.field5262 + " psize:" + arg0);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 39)
    public static final void method1500(int arg0) {
        class288 var1 = class692.field9424;
        synchronized (class692.field9424) {
            class692.field9424.method1687((byte) 61);
        }
        field2941++;
        if (arg0 != -521) {
            field2942 = null;
        }
        class288 var2 = class462.field6485;
        synchronized (class462.field6485) {
            class462.field6485.method1687((byte) 61);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V", line = 55)
    public static void method1501(int arg0) {
        field2942 = null;
        field2949 = null;
        if (arg0 == 0) {
            field2947 = null;
            field2945 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(II)V", line = 67)
    public class251(int arg0, int arg1) {
        this.field2940 = arg1;
    }
}
