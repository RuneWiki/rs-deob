import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class115 extends class199 {

    @OriginalMember(owner = "client!wk", name = "F", descriptor = "Lvl;")
    public class158 field1770;

    @OriginalMember(owner = "client!wk", name = "B", descriptor = "I")
    public static int field1766 = 0;

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "I")
    public static int field1768 = -1;

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "[I")
    public static int[] field1771 = new int[1000];

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(II)Z", line = 13)
    public static final boolean method851(int arg0, int arg1) {
        field1769++;
        int var2 = -38 % ((27 - arg0) / 61);
        class304.field4753 = arg1 + 1 & 0xFFFF;
        class134.field2141 = true;
        return true;
    }

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "(I)V", line = 28)
    public static final void method852(int arg0) {
        if (arg0 != -1) {
            method852(-8);
        }
        field1767++;
        class217.field3298.method2176((byte) 111);
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lvl;)V", line = 38)
    public class115(class158 arg0) {
        this.field1770 = arg0;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V", line = 47)
    public static void method853(byte arg0) {
        if (arg0 == -62) {
            field1771 = null;
        }
    }
}
