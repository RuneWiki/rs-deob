import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class297 {

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "J")
    private long field3814;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
    private int field3821;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "[Z")
    public static boolean[] field3824;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "Lrg;")
    public static class548 field3823;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "[[[I")
    public static int[][][] field3815;

    static {
        new class180("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field3824 = new boolean[200];
        field3825 = 0;
        field3823 = new class548(39, 6);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V", line = 8)
    public static void method1651(int arg0) {
        field3815 = null;
        field3824 = null;
        if (arg0 != 39) {
            field3824 = null;
        }
        field3823 = null;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)I", line = 23)
    private final int method1652(int arg0, int arg1) {
        if (arg1 == -8278) {
            field3822++;
            return (int) (this.field3814 >> class44.field370 * arg0) & 0xF;
        } else {
            return 109;
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(II)Lwba;", line = 36)
    public final class44 method1653(int arg0, int arg1) {
        if (arg1 != 1023) {
            method1656(-23, (byte) -28, 41, 31);
        }
        field3817++;
        return class44.method230(-12149)[this.method1652(arg0, -8278)];
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)I", line = 47)
    public final int method1654(int arg0) {
        if (arg0 != 15) {
            field3824 = null;
        }
        field3816++;
        return this.field3821;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILwba;)V", line = 59)
    private final void method1655(int arg0, class44 arg1) {
        field3820++;
        int var3 = 50 / ((arg0 - 83) / 38);
        this.field3814 |= (arg1.field363 << class44.field370 * this.field3821++);
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lwba;)V", line = 68)
    public class297(class44 arg0) {
        this.field3814 = arg0.field363;
        this.field3821 = 1;
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "([Lwba;)V", line = 82)
    public class297(class44[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method1655(-27, arg0[var2]);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IBII)I", line = 97)
    public static final int method1656(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field3818++;
        int var5 = -14 % (-arg1 / 48);
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            return 1023 - arg0;
        }
    }
}
