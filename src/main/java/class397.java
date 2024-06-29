import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class397 {

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "Z")
    public static boolean field5794 = false;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "F")
    public static float field5791 = 0.0F;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
    public static int field5796 = 0;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "Z")
    public static boolean field5799 = true;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5798 = "Checking for updates - ";

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lsj;B)V", line = 11)
    public static final void method2549(class248 arg0, byte arg1) {
        field5792++;
        class248 var2 = class372.method2446(-14263, arg0);
        if (arg1 != 119) {
            method2551((byte) 11);
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class435.field6313;
            var4 = class357.field5298;
        } else {
            var4 = var2.field3531;
            var3 = var2.field3564;
        }
        class347.method2298(false, var3, -11402, arg0, var4);
        class176.method1166(arg0, var4, 1, var3);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V", line = 38)
    public static final void method2550(int arg0) {
        if (arg0 != -65) {
            return;
        }
        field5795++;
        if (class322.field4796) {
            return;
        }
        if (class331.field4880) {
            class247.field3479 = (float) ((int) class247.field3479 - 65 & 0xFFFFFF80);
        } else {
            class267.field3961 += (-class267.field3961 - 24.0F) / 2.0F;
        }
        class322.field4796 = true;
        class164.field2233 = true;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V", line = 67)
    public static void method2551(byte arg0) {
        field5798 = null;
        if (arg0 != -105) {
            method2551((byte) -102);
        }
    }
}
