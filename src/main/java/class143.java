import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public abstract class class143 {

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Ldc;")
    public static class37 field2750 = class185.method1233((byte) 86, " GMT");

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Ldc;")
    public static class37 field2754 = class185.method1233((byte) 86, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Ldc;")
    public static class37 field2756 = class185.method1233((byte) 86, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Lqb;")
    public static class176 field2753 = new class176(50);

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "[Lji;")
    public static class106[] field2755;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)I")
    public abstract int method395(int arg0);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIII)V")
    public static final void method995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2752++;
        int var8 = arg1 + 1;
        class29.method242(arg3, (byte) -30, arg4, class11.field156[arg1], arg0);
        int var9 = arg2 - 1;
        class29.method242(arg3, (byte) -30, arg4, class11.field156[arg2], arg0);
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class11.field156[var6];
            var7[arg0] = var7[arg3] = arg4;
        }
        if (arg5 != 8622) {
            method996(-27);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method396(Component arg0, byte arg1);

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public static void method996(int arg0) {
        field2756 = null;
        field2753 = null;
        field2755 = null;
        field2754 = null;
        if (arg0 != 3) {
            method996(-118);
        }
        field2750 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method397(int arg0, Component arg1);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILmf;III)V")
    public static final void method997(int arg0, class136 arg1, int arg2, int arg3, int arg4) {
        field2751++;
        if (arg0 != 3395) {
            return;
        }
        if (class239.field4389 < 3) {
            ((class182) class18.field277).method1212(arg4, arg3, arg1.field2638, arg1.field2509, class18.field277.field1837 / 2, class18.field277.field1833 / 2, class82.field1454, 256, arg1.field2574, arg1.field2619);
        } else {
            class48.method414(arg4, arg3, 0, arg1.field2574, arg1.field2619);
        }
        class85.field1505[arg2] = true;
    }
}
