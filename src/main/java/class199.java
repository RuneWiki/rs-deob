import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public abstract class class199 {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Lhn;")
    public static class509 field3320 = new class509(1, -1);

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field3322 = 0;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)V", line = 4)
    public static void method1395(boolean arg0) {
        if (!arg0) {
            field3323 = -123;
        }
        field3320 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)I", line = 20)
    public static final int method1396(int arg0, int arg1) {
        field3321++;
        return arg1 == 1013964455 ? arg0 >>> 7 : 93;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)Z", line = 37)
    public final boolean method1397(int arg0) {
        field3319++;
        if (arg0 != 1013964455) {
            field3323 = 106;
        }
        return this.method540(arg0 ^ 0x3C6FDEC6) || this.method536((byte) 67) || this.method531(false);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)I")
    public abstract int method543(boolean arg0);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)Lbh;")
    public abstract class28 method529(byte arg0);

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(Z)I")
    public abstract int method542(boolean arg0);

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(Z)Z")
    public abstract boolean method531(boolean arg0);

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V")
    public abstract void method537(byte arg0);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)Z")
    public abstract boolean method540(int arg0);

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)V")
    public abstract void method541(byte arg0);

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)Z")
    public abstract boolean method536(byte arg0);
}
