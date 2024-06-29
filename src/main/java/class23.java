import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public abstract class class23 extends class87 {

    @OriginalMember(owner = "client!fba", name = "t", descriptor = "I")
    public int field345;

    @OriginalMember(owner = "client!fba", name = "k", descriptor = "I")
    public int field336;

    @OriginalMember(owner = "client!fba", name = "o", descriptor = "I")
    public int field340;

    @OriginalMember(owner = "client!fba", name = "l", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "client!fba", name = "q", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "client!fba", name = "m", descriptor = "I")
    public int field338;

    @OriginalMember(owner = "client!fba", name = "p", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "Lej;")
    public static class104 field334 = new class104("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!fba", name = "s", descriptor = "Lmc;")
    public static class114 field344 = null;

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!fba", name = "j", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!fba", name = "n", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!fba", name = "r", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!fba", name = "u", descriptor = "Lan;")
    public static class21 field346;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IZIILjt;ILqa;)V")
    public final void method258(int arg0, boolean arg1, int arg2, int arg3, class87 arg4, int arg5, class207 arg6) {
        if (arg2 > 79) {
            field339++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "(I)I")
    public abstract int method259(int arg0);

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(B)V")
    public static void method260(byte arg0) {
        if (arg0 >= -18) {
            method261(43, 97);
        }
        field346 = null;
        field334 = null;
        field344 = null;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(II)I")
    public static final int method261(int arg0, int arg1) {
        field330++;
        if (arg0 != 2941) {
            method263(null, -5, -20);
        }
        if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "(I)V")
    public final void method262(int arg0) {
        if (arg0 != 1) {
            this.field336 = 86;
        }
        field332++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "([BII)I")
    public static final int method263(byte[] arg0, int arg1, int arg2) {
        int var3 = 95 % ((arg1 - 62) / 40);
        field343++;
        return class278.method1793(0, (byte) 117, arg0, arg2);
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(IIIIIII)V")
    public class23(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field345 = arg1;
        this.field336 = arg4;
        this.field340 = arg3;
        this.field337 = arg0;
        this.field342 = arg5;
        this.field338 = arg6;
        this.field341 = arg2;
    }

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "(I)Z")
    public final boolean method264(int arg0) {
        if (arg0 != 1) {
            this.method259(3);
        }
        field331++;
        return false;
    }
}
