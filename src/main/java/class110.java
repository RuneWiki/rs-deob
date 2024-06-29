import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class110 {

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "Lkh;")
    private static class117 field2068 = class224.method1450((byte) 127, "Too many connections from your address)3");

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "Z")
    public static boolean field2070 = false;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Lkh;")
    public static class117 field2066 = field2068;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "Lkh;")
    private static class117 field2074 = class224.method1450((byte) -96, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Lkh;")
    public static class117 field2067 = field2074;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "[I")
    public static int[] field2072;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)[B")
    public abstract byte[] method744(byte arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B[B)V")
    public abstract void method745(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public static void method746(int arg0) {
        field2066 = null;
        field2067 = null;
        field2068 = null;
        field2072 = null;
        if (arg0 < 16) {
            method746(-13);
        }
        field2074 = null;
    }
}
