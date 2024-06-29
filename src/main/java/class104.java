import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public abstract class class104 extends class203 {

    @OriginalMember(owner = "client!id", name = "K", descriptor = "Z")
    public volatile boolean field1706 = true;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "Lmh;")
    public static class62 field1708 = class201.method1405(true, "<img=1>");

    @OriginalMember(owner = "client!id", name = "J", descriptor = "[Lmh;")
    public static class62[] field1705 = new class62[1000];

    @OriginalMember(owner = "client!id", name = "L", descriptor = "Lsk;")
    public static class199 field1707 = new class199(64);

    @OriginalMember(owner = "client!id", name = "O", descriptor = "Lmh;")
    private static class62 field1710 = class201.method1405(true, "Members object");

    @OriginalMember(owner = "client!id", name = "N", descriptor = "Lmh;")
    public static class62 field1709 = field1710;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "I")
    public static int field1712 = 0;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "Lga;")
    public static class147 field1711;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "Z")
    public boolean field1703;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "Z")
    public boolean field1704;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "[[S")
    public static short[][] field1702;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "(B)V", line = 15)
    public static void method819(byte arg0) {
        field1710 = null;
        field1702 = (short[][]) null;
        field1709 = null;
        field1707 = null;
        if (arg0 >= 32) {
            field1705 = null;
            field1711 = null;
            field1708 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)I")
    public abstract int method285(int arg0);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method288(boolean arg0);
}
