import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class74 extends class413 {

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "B")
    public byte field906 = 5;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "[C")
    public static char[] field912 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
    public int field907;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "client!fg", name = "F", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!fg", name = "G", descriptor = "I")
    public int field915;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V")
    public static void method436(int arg0) {
        field912 = null;
        int var1 = 0 % ((23 - arg0) / 48);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZB[B)Ljava/lang/Object;")
    public static final Object method437(boolean arg0, byte arg1, byte[] arg2) {
        field908++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class428.field6008) {
            try {
                class64 var3 = (class64) Class.forName("lc").getDeclaredConstructor().newInstance();
                var3.method397(arg2, (byte) 91);
                return var3;
            } catch (Throwable var5) {
                class428.field6008 = true;
            }
        }
        int var4 = 81 % ((arg1 + 65) / 45);
        return arg0 ? class276.method1699(-18682, arg2) : arg2;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)Z")
    public static final boolean method438(byte arg0, int arg1) {
        field914++;
        if (arg0 == -95) {
            return arg1 == 0 || arg1 == 1 || arg1 == 2;
        } else {
            return false;
        }
    }
}
