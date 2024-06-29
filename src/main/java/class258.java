import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class258 extends class544 {

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "Z")
    public boolean field3316 = false;

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "I")
    public int field3313 = -1;

    @OriginalMember(owner = "client!wt", name = "v", descriptor = "[C")
    public static char[] field3322;

    @OriginalMember(owner = "client!wt", name = "r", descriptor = "Lvj;")
    public static class373 field3318;

    @OriginalMember(owner = "client!wt", name = "w", descriptor = "Lrg;")
    public static class548 field3323;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
    public int field3314;

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
    public int field3315;

    @OriginalMember(owner = "client!wt", name = "q", descriptor = "I")
    public int field3317;

    @OriginalMember(owner = "client!wt", name = "s", descriptor = "I")
    public int field3319;

    @OriginalMember(owner = "client!wt", name = "t", descriptor = "I")
    public int field3320;

    @OriginalMember(owner = "client!wt", name = "u", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!wt", name = "x", descriptor = "Lha;")
    public static class52 field3324;

    @OriginalMember(owner = "client!wt", name = "y", descriptor = "Lqca;")
    public static class96 field3325;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
    public static void method1450(int arg0) {
        field3323 = null;
        field3322 = null;
        field3325 = null;
        field3324 = null;
        if (arg0 != 53) {
            method1450(-18);
        }
        field3318 = null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method1451(boolean arg0, Object arg1, int arg2) {
        if (arg2 != 15) {
            return null;
        }
        field3321++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class252.method1428(arg2 + 28711, var3) : var3;
        } else if (arg1 instanceof class124) {
            class124 var4 = (class124) arg1;
            return var4.method711(0);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(I)V")
    public class258(int arg0) {
        this.field3313 = arg0;
    }

    static {
        new class180("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field3322 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        field3318 = new class373(13, -2);
        field3323 = new class548(55, 15);
    }
}
