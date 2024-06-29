import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class99 {

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Lid;")
    public static class149 field1750 = class60.method382("Connexion perdue)3", (byte) 89);

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field1755 = -1;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Lid;")
    public static class149 field1753 = class60.method382("<img=1>", (byte) 60);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "J")
    public static long field1749 = 0L;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Lid;")
    public static class149 field1759 = class60.method382(" loggt sich aus)3", (byte) 6);

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field1758 = 0;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public int field1752;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Lid;")
    public class149 field1760;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "[Lvc;")
    public static class190[] field1751;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILal;)V")
    public static final void method714(int arg0, class230 arg1) {
        field1754++;
        class237.field4153 = arg1;
        int var2 = -4 / ((-arg0 - 11) / 53);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public static void method715(boolean arg0) {
        field1753 = null;
        field1751 = null;
        field1759 = null;
        field1750 = null;
        if (!arg0) {
            method716(18, 50, (class74) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILgd;)Lid;")
    public static final class149 method716(int arg0, int arg1, class74 arg2) {
        field1756++;
        try {
            int var3 = arg2.method512(-119);
            if (var3 > arg0) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg2.field1340 += class10.field136.method933(arg2.field1321, (byte) -19, var4, arg2.field1340, var3, 0);
            return class37.method214(var4, arg1, var3, 0);
        } catch (Exception var6) {
            return class103.field1804;
        }
    }
}
