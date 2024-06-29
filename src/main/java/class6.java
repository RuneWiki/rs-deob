import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class6 {

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "Lvr;")
    public static class187 field79 = new class187("LOCAL", 4);

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ldk;Ldk;I)V")
    public static final void method36(class421 arg0, class421 arg1, int arg2) {
        field77++;
        class429.field6227 = arg1;
        if (arg2 != 4) {
            field79 = null;
        }
        class403.field5760 = arg0;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)V")
    public static void method37(byte arg0) {
        if (arg0 != -112) {
            field79 = null;
        }
        field79 = null;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I[S)[S")
    public static final short[] method38(int arg0, short[] arg1) {
        field78++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class57.method376(arg1, arg0, var2, 0, arg1.length);
            return var2;
        }
    }
}
