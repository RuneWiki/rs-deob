import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public abstract class class139 extends class673 {

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public int field1589;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    public int field1595;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "I")
    public int field1596;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "Lq;")
    public static class389 field1593;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "Z")
    public boolean field1591;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ILhk;)Z")
    public static final boolean method774(int arg0, class89 arg1) {
        field1597++;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field953) {
            return false;
        } else if (!arg1.method552(true, class637.field9011)) {
            return false;
        } else if (class170.field2033.method3234((byte) -124, (long) arg1.field976) == null) {
            int var2 = -41 % ((-arg0 - 77) / 40);
            return class109.field1265.method3234((byte) -65, (long) arg1.field967) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ZIZIILfl;Loa;)V")
    public final void method453(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, class673 arg5, class635 arg6) {
        field1590++;
        if (arg2) {
            this.method448(-60);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(B)V")
    public static void method775(byte arg0) {
        field1593 = null;
        int var1 = 96 / ((arg0 - 38) / 59);
    }

    @OriginalMember(owner = "client!as", name = "d", descriptor = "(I)V")
    public final void method448(int arg0) {
        int var2 = 3 / ((arg0 - 12) / 56);
        field1594++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(II)I")
    public static int method776(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!as", name = "d", descriptor = "(B)Z")
    public final boolean method449(byte arg0) {
        field1592++;
        return arg0 == -126 ? false : false;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "([FII)[F")
    public static final float[] method777(float[] arg0, int arg1, int arg2) {
        field1588++;
        float[] var3 = new float[arg2];
        class652.method3678(arg0, arg1, var3, 0, arg2);
        return var3;
    }
}
