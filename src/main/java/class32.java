import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public abstract class class32 extends class687 {

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
    public int field380;

    @OriginalMember(owner = "client!wv", name = "m", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!wv", name = "n", descriptor = "I")
    public int field382;

    @OriginalMember(owner = "client!wv", name = "o", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!wv", name = "p", descriptor = "Lpj;")
    public static class132 field384;

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "Z")
    public boolean field378;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "(I)Z", line = 3)
    public final boolean method140(int arg0) {
        field377++;
        if (arg0 != 0) {
            this.method140(-85);
        }
        return false;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V", line = 15)
    public static void method141(int arg0) {
        field384 = null;
        if (arg0 <= 96) {
            field383 = 73;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Z)V", line = 25)
    public final void method142(boolean arg0) {
        if (!arg0) {
            field379++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IILgfa;IIZLoa;)V", line = 52)
    public final void method143(int arg0, int arg1, class687 arg2, int arg3, int arg4, boolean arg5, class638 arg6) {
        int var8 = 30 / (arg3 / 54);
        field381++;
        throw new IllegalStateException();
    }
}
