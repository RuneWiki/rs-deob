import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public abstract class class88 extends class443 {

    @OriginalMember(owner = "client!k", name = "t", descriptor = "Lbv;")
    public static class567 field1589 = new class567("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!k", name = "w", descriptor = "Liu;")
    public static class517 field1592 = new class517(45, 14);

    @OriginalMember(owner = "client!k", name = "x", descriptor = "Liu;")
    public static class517 field1593 = new class517(0, 8);

    @OriginalMember(owner = "client!k", name = "z", descriptor = "Z")
    public static boolean field1595 = false;

    @OriginalMember(owner = "client!k", name = "A", descriptor = "J")
    public static long field1596 = -1L;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "[Lsa;")
    public static class542[] field1594;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Loh;Z)V", line = 3)
    public static final void method795(class549 arg0, boolean arg1) {
        field1590++;
        class549 var2 = class106.method907((byte) 108, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class68.field1285;
            var4 = class442.field6464;
        } else {
            var3 = var2.field7678;
            var4 = var2.field7776;
        }
        class194.method1281(arg0, 9625, false, var3, var4);
        class179.method1214(arg0, var3, arg1, var4);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 27)
    public static void method796(int arg0) {
        if (arg0 == -1) {
            field1589 = null;
            field1592 = null;
            field1593 = null;
            field1594 = null;
        }
    }
}
