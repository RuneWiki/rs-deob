import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public abstract class class330 {

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "[C")
    public static char[] field4713 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "Lfi;")
    public static class331 field4714 = new class331(8);

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    public static int field4717 = -1;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
    public static int field4718 = 0;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "F")
    public static float field4712;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "Lfr;")
    public static class236 field4719;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "[[[B")
    public static byte[][][] field4716;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)V", line = 7)
    public static void method2039(byte arg0) {
        field4716 = null;
        field4719 = null;
        field4713 = null;
        if (arg0 != -50) {
            field4713 = null;
        }
        field4714 = null;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)V", line = 26)
    public static final void method2040(boolean arg0) {
        if (arg0) {
            field4713 = null;
        }
        class238.field3241.method2043(-122);
        field4715++;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Len;I)V")
    public abstract void method211(class174 arg0, int arg1);

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILen;IBLfs;IZ)V")
    public abstract void method206(int arg0, class174 arg1, int arg2, byte arg3, class330 arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "(I)Z")
    public abstract boolean method217(int arg0);

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIZLen;)Z")
    public abstract boolean method208(int arg0, int arg1, boolean arg2, class174 arg3);

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "(I)V")
    public abstract void method224(int arg0);

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILen;)Lir;")
    public abstract class19 method213(int arg0, class174 arg1);
}
