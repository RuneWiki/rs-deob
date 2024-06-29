import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public abstract class class115 extends class179 {

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "[C")
    public static char[] field1830 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    public static int field1831 = 0;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "Ldp;")
    public static class174 field1828;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "[Lhs;")
    public static class420[] field1834;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V", line = 7)
    public static void method981(boolean arg0) {
        field1828 = null;
        field1834 = null;
        if (arg0) {
            method982(114, -12);
        }
        field1830 = null;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)V", line = 21)
    public static final void method982(int arg0, int arg1) {
        field1833++;
        if (arg1 < 0 && class355.field5054 == null || class355.field5054.length < arg0) {
            class355.field5054 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(B)V", line = 41)
    public static final void method983(byte arg0) {
        field1832++;
        class319.field4606.method1228(-30653);
        int var1 = -96 / ((-arg0 - 42) / 34);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIII)I", line = 51)
    public static final int method984(int arg0, int arg1, int arg2, int arg3) {
        field1835++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (arg2 == 7) {
            return var4 == 2 ? 7 - arg3 : arg0;
        } else {
            return -84;
        }
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method980(int arg0);

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(Z)Z")
    public abstract boolean method985(boolean arg0);
}
