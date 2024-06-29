import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class123 {

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public int field1594 = -1;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field1592 = 13156520;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "Luc;")
    public static class51 field1589 = new class51(16);

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "[I")
    public static int[] field1596 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "F")
    public static float field1593;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Lir;")
    public static class185 field1586;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Lsj;")
    public static class248 field1585;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "Lqg;")
    public class335 field1595;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "[I")
    public int[] field1591;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "[Ljava/lang/String;")
    public String[] field1587;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([BBZ)Ljava/lang/Object;", line = 3)
    public static final Object method878(byte[] arg0, byte arg1, boolean arg2) {
        field1588++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != 124) {
            method878((byte[]) null, (byte) -12, false);
        }
        if (arg0.length > 136 && !class7.field91) {
            try {
                class190 var3 = (class190) Class.forName("np").getDeclaredConstructor().newInstance();
                var3.method1267(arg0, false);
                return var3;
            } catch (Throwable var4) {
                class7.field91 = true;
            }
        }
        return arg2 ? class101.method775(0, arg0) : arg0;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 42)
    public static void method879(int arg0) {
        field1589 = null;
        field1585 = null;
        if (arg0 != 7597) {
            method878((byte[]) null, (byte) 8, false);
        }
        field1596 = null;
        field1586 = null;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)Lka;", line = 55)
    public static final class379 method880(int arg0) {
        field1590++;
        if (arg0 != 22137) {
            method878((byte[]) null, (byte) -66, false);
        }
        return class200.field2758;
    }
}
