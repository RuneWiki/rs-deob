import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class55 extends class48 {

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "[I")
    public static int[] field810 = new int[50];

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "Z")
    public static boolean field808 = false;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
    public static int field811 = 0;

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "I")
    public static int field815 = -1;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
    public static int field812 = -1;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)V")
    public static final void method390(byte arg0) {
        class283.field4558.method1420((byte) 122);
        field813++;
        if (arg0 <= 16) {
            field812 = -6;
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)V")
    public static final void method391(int arg0, int arg1) {
        if (arg1 != -4097) {
            method390((byte) -83);
        }
        class294.field4677.method1416(arg0, 0);
        field816++;
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(II)V")
    public static final void method392(int arg0, int arg1) {
        class136.field2219.method1416(arg0, arg1 ^ arg1);
        field809++;
        class275.field4452.method1416(arg0, 0);
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(Z)Lhf;")
    public static final class159 method393(boolean arg0) {
        field814++;
        if (class46.field625 == null) {
            return null;
        }
        class221.field3225.method813((byte) -16, class46.field625);
        class159 var1 = (class159) class221.field3225.method816((byte) -109);
        if (arg0) {
            method390((byte) -109);
        }
        class66 var2 = class206.method1458(var1.field2466, 22464);
        return var2 != null && var2.field1013 && var2.method491(0) ? var1 : class249.method1716((byte) -41);
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(B)V")
    public static void method394(byte arg0) {
        field810 = null;
        if (arg0 != 53) {
            method393(true);
        }
    }
}
