import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public abstract class class686 {

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Lgh;")
    public static class54 field8835 = new class54(0, 2, 2, 1);

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Z")
    public static boolean field8838 = false;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field8837 = new String[200];

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "[I")
    public static int[] field8839 = new int[1];

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field8834;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field8836;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field8840;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)Z", line = 7)
    public final boolean method3675(int arg0) {
        field8840++;
        if (arg0 != 2) {
            field8835 = null;
        }
        return this.method213(1) || this.method214(1929) || this.method212(1);
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)V", line = 38)
    public static void method3676(int arg0) {
        field8837 = null;
        field8835 = null;
        field8839 = null;
        if (arg0 != 27974) {
            field8837 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public abstract void method217(int arg0);

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)Z")
    public abstract boolean method214(int arg0);

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)I")
    public abstract int method210(int arg0);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)Lvt;")
    public abstract class793 method219(byte arg0);

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V")
    public abstract void method211(byte arg0);

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)I")
    public abstract int method208(int arg0);

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)Z")
    public abstract boolean method212(int arg0);

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)Z")
    public abstract boolean method213(int arg0);
}
