import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class317 extends class53 {

    @OriginalMember(owner = "client!td", name = "u", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field4046;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "Lap;")
    public static class335 field4049 = new class335("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    public static int field4050 = 0;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "[I")
    public static int[] field4051 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "Lga;")
    public static class278 field4044;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V", line = 4)
    public final void method1867(int arg0) {
        if (arg0 != 28441) {
            method1869(-57);
        }
        field4047++;
        this.field4046.method2604();
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIILqd;Lqd;)V", line = 16)
    public static final void method1868(int arg0, int arg1, int arg2, class314 arg3, class314 arg4) {
        class490 var5 = class119.method862(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field7126 = arg3;
            var5.field7130 = arg4;
        }
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V", line = 26)
    public static void method1869(int arg0) {
        field4051 = null;
        field4049 = null;
        if (arg0 == -5285) {
            field4044 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIZ)V", line = 41)
    public static final void method1870(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (class407.field5817.field3619 != 0 && arg1 != 0 && class189.field2475 < 50 && arg0 != -1) {
            class466.field6728[class189.field2475++] = new class212((byte) 2, arg0, arg1, arg2, arg3, 0);
        }
        if (arg4) {
            field4049 = null;
        }
        field4045++;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(I)V", line = 57)
    public class317(int arg0) {
        this.field4046 = new NativeHeap(arg0);
    }
}
