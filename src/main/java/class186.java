import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class186 extends class253 {

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "[I")
    public int[] field3198 = new int[] { -1 };

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "[I")
    public int[] field3191 = new int[1];

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
    public static int field3197 = 0;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "Llc;")
    public static class82 field3192;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)V")
    public static final void method1280(boolean arg0) {
        field3200++;
        if (class254.field4383 == 5) {
            if (!arg0) {
                method1282(-104, (byte) -107);
            }
            class254.field4383 = 6;
        }
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)V")
    public static void method1281(int arg0) {
        field3192 = null;
        if (arg0 >= -19) {
            field3197 = -10;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)V")
    public static final void method1282(int arg0, byte arg1) {
        field3193++;
        class18.field255.method1267(arg0, (byte) -118);
        if (arg1 > -45) {
            field3196 = 41;
        }
        class132.field2303.method1267(arg0, (byte) -62);
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(I)V")
    public static final void method1283(int arg0) {
        field3199++;
        class185.field3165.method286(5000);
        if (arg0 != 0) {
            field3192 = null;
        }
    }
}
