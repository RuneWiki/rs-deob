import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class463 extends class386 {

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "[I")
    public static int[] field7112 = new int[14];

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "Lss;")
    public static class213 field7114 = new class213("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!rp", name = "m", descriptor = "Z")
    public static boolean field7118 = false;

    @OriginalMember(owner = "client!rp", name = "p", descriptor = "I")
    public static int field7121 = 0;

    @OriginalMember(owner = "client!rp", name = "o", descriptor = "Lqu;")
    public static class219 field7120 = new class219(75, 4);

    @OriginalMember(owner = "client!rp", name = "q", descriptor = "I")
    public static int field7122 = 0;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
    public static int field7113;

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "Lmn;")
    public static class162 field7117;

    @OriginalMember(owner = "client!rp", name = "n", descriptor = "Lmn;")
    public static class162 field7119;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lhw;B)Ljava/lang/String;")
    public static final String method2903(class208 arg0, byte arg1) {
        field7115++;
        int var2 = 10 / ((arg1 - 21) / 57);
        return class316.method2111(32767, -23682, arg0);
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)V")
    public static void method2904(int arg0) {
        field7119 = null;
        field7112 = null;
        field7117 = null;
        field7114 = null;
        field7120 = null;
        int var1 = 69 / ((19 - arg0) / 61);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)V")
    public static final void method2905(int arg0, int arg1, int arg2) {
        field7113++;
        class456 var3 = class233.method1654(arg0, 6, arg1 ^ 0xFFFFB59E);
        var3.method2858(10250);
        var3.field7042 = arg2;
        if (arg1 != -18973) {
            field7122 = 11;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lmn;Z)I")
    public static final int method2906(class162 arg0, boolean arg1) {
        if (arg1) {
            field7122 = 77;
        }
        field7116++;
        int var2 = 0;
        if (arg0.method1012(class426.field6447, true)) {
            var2++;
        }
        if (arg0.method1012(class349.field5405, !arg1)) {
            var2++;
        }
        return var2;
    }
}
