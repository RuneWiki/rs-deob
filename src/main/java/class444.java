import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public abstract class class444 {

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "Z")
    public static boolean field6475 = false;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Liu;")
    public static class390 field6474 = new class390(63, -1);

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field6477 = 0;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field6479 = 0;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field6481 = 0;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "Lhe;")
    public static class239 field6480;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static void method2592(int arg0) {
        field6474 = null;
        int var1 = -26 / ((-arg0 - 53) / 39);
        field6480 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)I")
    public static final int method2593(int arg0, int arg1) {
        int var2 = -13 % ((arg1 - 56) / 60);
        field6476++;
        return (arg0 & 0x3FBB0) >> 11;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)[B")
    public abstract byte[] method378(byte arg0);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)[B")
    public abstract byte[] method376(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B[B)V")
    public abstract void method377(byte arg0, byte[] arg1);
}
