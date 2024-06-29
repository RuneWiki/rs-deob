import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public abstract class class83 extends class96 {

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "Z")
    public volatile boolean field1128 = true;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "Liu;")
    public static class390 field1129 = new class390(36, 3);

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public static int field1130 = -1;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "[I")
    public static int[] field1131 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "[I")
    public static int[] field1134 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "[I")
    public static int[] field1133 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "Lkp;")
    public static class323 field1132;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "Z")
    public boolean field1126;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "Z")
    public boolean field1127;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)[B")
    public abstract byte[] method524(int arg0);

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V")
    public static void method525(int arg0) {
        field1133 = null;
        field1129 = null;
        field1134 = null;
        if (arg0 != 21133) {
            method525(117);
        }
        field1131 = null;
        field1132 = null;
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(B)I")
    public abstract int method526(byte arg0);
}
