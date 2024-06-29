import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public abstract class class263 {

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Lng;")
    public static class226 field3855 = new class226(32);

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "Lst;")
    public static class296 field3857 = new class296();

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "[I")
    public static int[] field3858;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "[S")
    public static short[] field3856;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 3)
    public static void method1743(int arg0) {
        field3858 = null;
        field3857 = null;
        if (arg0 != 32) {
            method1743(64);
        }
        field3855 = null;
        field3856 = null;
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)Z", line = 26)
    public final boolean method1747(int arg0) {
        field3854++;
        int var2 = 98 % ((arg0 - 48) / 50);
        return this.method1748((byte) -90) || this.method1750(-22375) || this.method1744(32);
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)Z")
    public abstract boolean method1744(int arg0);

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V")
    public abstract void method1745(int arg0);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
    public abstract void method1746(byte arg0);

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)Z")
    public abstract boolean method1748(byte arg0);

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(B)I")
    public abstract int method1749(byte arg0);

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)Z")
    public abstract boolean method1750(int arg0);

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)I")
    public abstract int method1751(int arg0);

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "(I)Lvq;")
    public abstract class320 method1752(int arg0);
}
