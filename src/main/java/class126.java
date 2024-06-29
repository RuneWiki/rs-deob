import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class126 {

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public int field2922 = -1;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static volatile int field2917 = -1;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Lve;")
    public static class151 field2920 = new class151();

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Lja;")
    public static class63 field2924 = new class63(50);

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "[I")
    public static int[] field2925 = new int[50];

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "Lec;")
    public static class32 field2926 = null;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "Lec;")
    public static class32 field2929 = class73.method594("huffman", true);

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field2932 = -1;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Lud;")
    public class143 field2923;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "Z")
    public static boolean field2928;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "[I")
    public int[] field2919;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "[I")
    public static int[] field2927;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "[Lec;")
    public class32[] field2918;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZBBIILga;I)V")
    public static final void method987(boolean arg0, byte arg1, byte arg2, int arg3, int arg4, class44 arg5, int arg6) {
        long var7 = (long) ((arg4 << 16) + arg3);
        field2921++;
        class110 var9 = (class110) class97.field2214.method1198(var7, (byte) -106);
        if (var9 != null) {
            return;
        }
        class110 var10 = (class110) class112.field2618.method1198(var7, (byte) -106);
        if (var10 != null) {
            return;
        }
        class110 var11 = (class110) class132.field3031.method1198(var7, (byte) -106);
        if (arg1 >= -105) {
            field2925 = null;
        }
        if (var11 == null) {
            if (!arg0) {
                class110 var12 = (class110) class31.field593.method1198(var7, (byte) -106);
                if (var12 != null) {
                    return;
                }
            }
            class110 var13 = new class110();
            var13.field2589 = arg2;
            var13.field2591 = arg5;
            var13.field2580 = arg6;
            if (arg0) {
                class97.field2214.method1203(true, var7, var13);
                class158.field3629++;
            } else {
                field2920.method1173(var13, 2048);
                class132.field3031.method1203(true, var7, var13);
                class33.field698++;
            }
        } else if (arg0) {
            var11.method68(false);
            class97.field2214.method1203(true, var7, var11);
            class158.field3629++;
            class33.field698--;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method988(int arg0) {
        if (arg0 != 0) {
            method989(null, -65);
        }
        field2927 = null;
        field2929 = null;
        field2926 = null;
        field2925 = null;
        field2920 = null;
        field2924 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method989(Component arg0, int arg1) {
        arg0.removeMouseListener(class38.field910);
        arg0.removeMouseMotionListener(class38.field910);
        field2931++;
        arg0.removeFocusListener(class38.field910);
        class82.field1918 = 0;
        if (arg1 != -1) {
            field2932 = 29;
        }
    }
}
