import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class550 extends class31 implements class269 {

    @OriginalMember(owner = "client!lca", name = "F", descriptor = "Lwv;")
    public class31 field8079;

    @OriginalMember(owner = "client!lca", name = "w", descriptor = "I")
    public static int field8070;

    @OriginalMember(owner = "client!lca", name = "x", descriptor = "I")
    public static int field8071;

    @OriginalMember(owner = "client!lca", name = "y", descriptor = "I")
    public static int field8072;

    @OriginalMember(owner = "client!lca", name = "z", descriptor = "I")
    public static int field8073;

    @OriginalMember(owner = "client!lca", name = "A", descriptor = "I")
    public static int field8074;

    @OriginalMember(owner = "client!lca", name = "B", descriptor = "I")
    public static int field8075;

    @OriginalMember(owner = "client!lca", name = "C", descriptor = "I")
    public static int field8076;

    @OriginalMember(owner = "client!lca", name = "D", descriptor = "I")
    public static int field8077;

    @OriginalMember(owner = "client!lca", name = "E", descriptor = "I")
    public static int field8078;

    @OriginalMember(owner = "client!lca", name = "G", descriptor = "I")
    public static int field8080;

    @OriginalMember(owner = "client!lca", name = "H", descriptor = "I")
    public static int field8081;

    @OriginalMember(owner = "client!lca", name = "I", descriptor = "I")
    public static int field8082;

    @OriginalMember(owner = "client!lca", name = "J", descriptor = "I")
    public static int field8083;

    @OriginalMember(owner = "client!lca", name = "K", descriptor = "I")
    public static int field8084;

    @OriginalMember(owner = "client!lca", name = "L", descriptor = "I")
    public static int field8085;

    @OriginalMember(owner = "client!lca", name = "M", descriptor = "I")
    public static int field8086;

    @OriginalMember(owner = "client!lca", name = "O", descriptor = "I")
    public static int field8088;

    @OriginalMember(owner = "client!lca", name = "N", descriptor = "[[B")
    public static byte[][] field8087;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(II)I")
    public static final int method3219(int arg0, int arg1) {
        field8082++;
        int var2 = -122 / ((arg0 - 72) / 43);
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "(B)V")
    public static void method3220(byte arg0) {
        field8087 = null;
        if (arg0 != -94) {
            field8087 = null;
        }
    }

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "(I)Z")
    public final boolean method317(int arg0) {
        if (arg0 == 64) {
            field8076++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Z)I")
    public final int method337(boolean arg0) {
        if (!arg0) {
            method3220((byte) 98);
        }
        field8081++;
        return 0;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lqa;Z)V")
    public final void method341(class206 arg0, boolean arg1) {
        if (arg1) {
            field8087 = null;
        }
        field8083++;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILqa;II)Z")
    public final boolean method318(int arg0, class206 arg1, int arg2, int arg3) {
        field8080++;
        if (arg0 != -21851) {
            this.method317(-78);
        }
        return false;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILqa;)V")
    public final void method326(int arg0, class206 arg1) {
        if (arg0 == 29657) {
            field8088++;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILqa;Z)Lr;")
    public final class157 method335(int arg0, class206 arg1, boolean arg2) {
        field8071++;
        if (!arg2) {
            this.field8079 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "(B)V")
    public final void method314(byte arg0) {
        field8086++;
        if (arg0 <= 23) {
            this.field8079 = null;
        }
    }

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "(ILqa;)Loj;")
    public final class318 method320(int arg0, class206 arg1) {
        field8085++;
        if (arg0 != -1) {
            field8087 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(IIILwv;)V")
    public class550(int arg0, int arg1, int arg2, class31 arg3) {
        super(arg0, arg1, arg2, arg3.field235, false, false);
        this.field8079 = arg3;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(B)V")
    public final void method339(byte arg0) {
        if (arg0 > -114) {
            field8087 = null;
        }
        field8078++;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)Z")
    public final boolean method332(int arg0) {
        field8070++;
        int var2 = -4 / ((arg0 - 1) / 49);
        return false;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)I")
    public final int method342(int arg0) {
        field8074++;
        return arg0 == -2329 ? 0 : -71;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ZLqa;)V")
    public final void method336(boolean arg0, class206 arg1) {
        field8077++;
        if (arg0) {
            field8087 = null;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)I")
    public final int method333(byte arg0) {
        field8073++;
        if (arg0 != 70) {
            this.method314((byte) -104);
        }
        return 0;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(BIII)I")
    public static final int method3221(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field8084++;
        if (var4 == 0) {
            return arg2;
        }
        if (arg0 != 87) {
            field8087 = null;
        }
        if (var4 == 1) {
            return 1023 - arg1;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(ILqa;)Lso;")
    public final class398 method328(int arg0, class206 arg1) {
        if (arg0 == 12) {
            field8075++;
            return this.field8079.method328(12, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ZLoe;ILqa;III)V")
    public final void method312(boolean arg0, class170 arg1, int arg2, class206 arg3, int arg4, int arg5, int arg6) {
        field8072++;
        if (arg5 != 13915) {
            this.method333((byte) -80);
        }
    }
}
