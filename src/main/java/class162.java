import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class162 extends class78 {

    @OriginalMember(owner = "client!g", name = "F", descriptor = "Lpf;")
    public class85 field2539;

    @OriginalMember(owner = "client!g", name = "I", descriptor = "I")
    public static int field2542 = 0;

    @OriginalMember(owner = "client!g", name = "H", descriptor = "I")
    public static int field2541 = -1;

    @OriginalMember(owner = "client!g", name = "O", descriptor = "Ljava/lang/String;")
    public static String field2547 = "Hidden";

    @OriginalMember(owner = "client!g", name = "N", descriptor = "[I")
    public static int[] field2546 = new int[5];

    @OriginalMember(owner = "client!g", name = "M", descriptor = "Lti;")
    public static class222 field2545 = new class222();

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "J")
    public static long field2549 = 0L;

    @OriginalMember(owner = "client!g", name = "G", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!g", name = "K", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "[Llf;")
    public static class125[] field2548;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method1200(int arg0, byte arg1) {
        field2540++;
        class4 var2 = class67.method510(1, 8, arg0);
        var2.method6(255);
        if (arg1 > -116) {
            method1200(13, (byte) -85);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIZII)V", line = 18)
    public static final void method1201(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field2544++;
        if (class213.method1543(25641, arg1)) {
            class323.method2205(arg3, arg2, class207.field3269[arg1], arg0, arg3 ^ 0xFFFFDE6B, arg4);
        }
    }

    @OriginalMember(owner = "client!g", name = "g", descriptor = "(I)V", line = 34)
    public static void method1202(int arg0) {
        field2546 = null;
        field2548 = null;
        field2547 = null;
        field2545 = null;
        if (arg0 != 0) {
            field2549 = -44L;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lpf;)V", line = 46)
    public class162(class85 arg0) {
        this.field2539 = arg0;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(Z)V", line = 56)
    public static final void method1203(boolean arg0) {
        if (!arg0) {
            method1202(-22);
        }
        field2543++;
        class317.field4934.method1837(-12);
    }
}
