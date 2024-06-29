import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public abstract class class344 extends class15 {

    @OriginalMember(owner = "client!si", name = "E", descriptor = "Z")
    public volatile boolean field4927 = true;

    @OriginalMember(owner = "client!si", name = "z", descriptor = "Lvf;")
    public static class166 field4922 = new class166();

    @OriginalMember(owner = "client!si", name = "F", descriptor = "Lsd;")
    public static class74 field4928 = new class74(77, 8);

    @OriginalMember(owner = "client!si", name = "B", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!si", name = "C", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!si", name = "G", descriptor = "J")
    public static long field4929;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "Z")
    public boolean field4921;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "Z")
    public boolean field4923;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)V", line = 7)
    public static void method2089(boolean arg0) {
        if (arg0) {
            field4926 = -52;
        }
        field4928 = null;
        field4922 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZII)I", line = 28)
    public static final int method2090(int arg0, boolean arg1, int arg2, int arg3) {
        field4925++;
        if ((class140.field1686[arg0][arg3][arg2] & 0x8) != 0) {
            return 0;
        } else if (arg0 <= 0 || (class140.field1686[1][arg3][arg2] & 0x2) == 0) {
            return arg1 ? arg0 : 127;
        } else {
            return arg0 - 1;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)I")
    public abstract int method295(int arg0);

    @OriginalMember(owner = "client!si", name = "e", descriptor = "(B)[B")
    public abstract byte[] method294(byte arg0);
}
