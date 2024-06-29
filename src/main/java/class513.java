import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public abstract class class513 {

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "Lg;")
    public static class153 field7320 = new class153(9, 2);

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "I")
    public static int field7321;

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Z)V", line = 3)
    public static void method3022(boolean arg0) {
        if (!arg0) {
            method3024(116);
        }
        field7320 = null;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(B)[Lg;", line = 17)
    public static final class153[] method3023(byte arg0) {
        if (arg0 < 101) {
            field7322 = -14;
        }
        field7321++;
        return new class153[] { class509.field7293, class59.field723, class481.field6798, class522.field7399, class456.field6439, class626.field8698, class516.field7358, class252.field3689, class219.field2852, field7320 };
    }

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "(I)V", line = 28)
    public static final void method3024(int arg0) {
        field7323++;
        if (class650.field8937 == 1 || class650.field8937 == 3 || class650.field8937 != class466.field6609 && (class650.field8937 == 0 || class466.field6609 == 0)) {
            class438.field6239 = 0;
            class344.field4849 = 0;
            class373.field5230.method1175((byte) 69);
        }
        class466.field6609 = class650.field8937;
        if (arg0 >= -51) {
            field7320 = null;
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)V")
    public abstract void method362(int arg0);

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(III[I)V")
    public abstract void method353(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(I)V")
    public abstract void method342(int arg0);

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "()V")
    public abstract void method351();

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "()Lnga;")
    public abstract class513 method349();

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "(I)V")
    public abstract void method347(int arg0);

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(III[I)V")
    public abstract void method338(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "(III[I)V")
    public abstract void method357(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lnga;)V")
    public abstract void method344(class513 arg0);

    @OriginalMember(owner = "client!nga", name = "e", descriptor = "(I)V")
    public abstract void method356(int arg0);

    @OriginalMember(owner = "client!nga", name = "f", descriptor = "(I)V")
    public abstract void method363(int arg0);

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(III)V")
    public abstract void method360(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIII)V")
    public abstract void method340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(III)V")
    public abstract void method339(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "([I)V")
    public abstract void method348(int[] arg0);

    @OriginalMember(owner = "client!nga", name = "g", descriptor = "(I)V")
    public abstract void method350(int arg0);
}
