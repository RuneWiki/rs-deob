import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public abstract class class548 extends class108 {

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "Ljj;")
    public class66 field7619;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "[I")
    public static int[] field7621 = new int[8];

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field7611;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field7613;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field7615;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field7617;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field7620;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public static int field7622;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "Lsd;")
    public static class330 field7616;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "Z")
    public boolean field7614;

    static {
        new class567("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)Lbo;", line = 4)
    public static final class225 method3068(byte arg0) {
        class530.field7362 = 0;
        field7613++;
        return arg0 == 115 ? class531.method2984((byte) 65) : null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 19)
    public static void method3069(int arg0) {
        field7621 = null;
        field7616 = null;
        int var1 = 13 % ((arg0 + 34) / 44);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIIIIZ)V", line = 32)
    public static final void method3070(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        if (!arg9) {
            return;
        }
        if (class183.field2638 <= arg6 && arg6 <= class268.field3911 && arg3 >= class183.field2638 && class268.field3911 >= arg3 && class183.field2638 <= arg2 && class268.field3911 >= arg2 && arg7 >= class183.field2638 && class268.field3911 >= arg7 && arg0 >= class222.field3350 && arg0 <= class409.field6071 && class222.field3350 <= arg1 && arg1 <= class409.field6071 && arg5 >= class222.field3350 && arg5 <= class409.field6071 && class222.field3350 <= arg4 && arg4 <= class409.field6071) {
            class543.method3044(arg0, arg7, 107, arg8, arg6, arg2, arg1, arg4, arg3, arg5);
        } else {
            class582.method3334(arg6, 16079, arg3, arg1, arg5, arg7, arg0, arg4, arg2, arg8);
        }
        field7620++;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)Z", line = 58)
    public final boolean method3071(byte arg0) {
        if (arg0 != 71) {
            field7616 = null;
        }
        field7611++;
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([BIIB)[B", line = 69)
    public static final byte[] method3072(byte[] arg0, int arg1, int arg2, byte arg3) {
        field7612++;
        if (arg3 != -103) {
            method3070(-88, -127, 63, 4, 108, 22, -60, 0, 95, true);
        }
        byte[] var4 = new byte[arg2];
        class164.method1151(arg0, arg1, var4, 0, arg2);
        return var4;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(Z)I", line = 83)
    public int method57(boolean arg0) {
        field7618++;
        if (arg0) {
            this.method3074(-42);
        }
        return 0;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Ljj;)V", line = 97)
    public class548(class66 arg0) {
        this.field7619 = arg0;
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)I", line = 105)
    public final int method3073(int arg0) {
        field7617++;
        return arg0 == 1 ? 1 : 49;
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)Z", line = 116)
    public final boolean method3074(int arg0) {
        if (arg0 != 1) {
            this.field7619 = null;
        }
        field7615++;
        return this.field7614;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
    public abstract void method56(int arg0, int arg1);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILhp;ZLhp;)V")
    public abstract void method51(int arg0, class355 arg1, boolean arg2, class355 arg3);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IBI)V")
    public abstract void method54(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
    public abstract void method49(int arg0);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)Z")
    public abstract boolean method50(boolean arg0);

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)Z")
    public abstract boolean method53(int arg0);
}
