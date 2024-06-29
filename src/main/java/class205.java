import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class205 {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "[I")
    public static int[] field3135 = new int[2];

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Z")
    public static boolean field3137;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()Lc;")
    public abstract class205 method156();

    @OriginalMember(owner = "client!c", name = "wa", descriptor = "([I)V")
    public abstract void method159(int[] arg0);

    @OriginalMember(owner = "client!c", name = "ea", descriptor = "(I)V")
    public abstract void method166(int arg0);

    @OriginalMember(owner = "client!c", name = "A", descriptor = "(I)V")
    public abstract void method162(int arg0);

    @OriginalMember(owner = "client!c", name = "W", descriptor = "(III)V")
    public abstract void method163(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "K", descriptor = "(III[I)V")
    public abstract void method153(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!c", name = "YA", descriptor = "(IIIIII)V")
    public abstract void method165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public static void method1404(boolean arg0) {
        field3135 = null;
        if (arg0) {
            field3135 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1405(int arg0, int arg1, byte arg2) {
        field3136++;
        if (arg2 == -128) {
            return (arg0 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!c", name = "ha", descriptor = "(Lc;)V")
    public abstract void method157(class205 arg0);

    @OriginalMember(owner = "client!c", name = "U", descriptor = "(III)V")
    public abstract void method158(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "ca", descriptor = "(I)V")
    public abstract void method164(int arg0);

    @OriginalMember(owner = "client!c", name = "v", descriptor = "()V")
    public abstract void method161();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III[I)V")
    public abstract void method154(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V")
    public abstract void method155(int arg0);

    @OriginalMember(owner = "client!c", name = "EA", descriptor = "(I)V")
    public abstract void method160(int arg0);

    static {
        new class213("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field3137 = false;
    }
}
