import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class125 {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Lkl;")
    public static class56 field1855 = new class56("LIVE", 0);

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Lcd;")
    public static class208 field1856;

    static {
        new class234("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V", line = 3)
    public static void method922(byte arg0) {
        if (arg0 >= 53) {
            field1855 = null;
            field1856 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILta;)V", line = 19)
    public static final void method923(int arg0, class145 arg1) {
        class491.field7059[arg0] = arg1;
    }

    @OriginalMember(owner = "client!c", name = "za", descriptor = "(Lc;)V")
    public abstract void method214(class125 arg0);

    @OriginalMember(owner = "client!c", name = "p", descriptor = "(III[I)V")
    public abstract void method217(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()Lc;")
    public abstract class125 method205();

    @OriginalMember(owner = "client!c", name = "xa", descriptor = "()V")
    public abstract void method209();

    @OriginalMember(owner = "client!c", name = "o", descriptor = "(III)V")
    public abstract void method207(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "ja", descriptor = "(I)V")
    public abstract void method210(int arg0);

    @OriginalMember(owner = "client!c", name = "s", descriptor = "(IIIIII)V")
    public abstract void method218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!c", name = "m", descriptor = "([I)V")
    public abstract void method215(int[] arg0);

    @OriginalMember(owner = "client!c", name = "O", descriptor = "(I)V")
    public abstract void method211(int arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III[I)V")
    public abstract void method220(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!c", name = "ka", descriptor = "(I)V")
    public abstract void method208(int arg0);

    @OriginalMember(owner = "client!c", name = "j", descriptor = "(III)V")
    public abstract void method206(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "N", descriptor = "(I)V")
    public abstract void method219(int arg0);

    @OriginalMember(owner = "client!c", name = "ra", descriptor = "(I)V")
    public abstract void method216(int arg0);
}
