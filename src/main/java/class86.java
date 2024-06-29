import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public abstract class class86 extends class51 {

    @OriginalMember(owner = "client!jf", name = "K", descriptor = "Lhi;")
    public static class82 field1539 = class95.method664((byte) -93, ")3runescape)3com)4l=");

    @OriginalMember(owner = "client!jf", name = "N", descriptor = "I")
    public static int field1542 = 0;

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "Z")
    public static boolean field1534 = false;

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "I")
    public int field1533;

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "I")
    public int field1535;

    @OriginalMember(owner = "client!jf", name = "J", descriptor = "I")
    public int field1538;

    @OriginalMember(owner = "client!jf", name = "L", descriptor = "I")
    public int field1540;

    @OriginalMember(owner = "client!jf", name = "M", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!jf", name = "O", descriptor = "I")
    public int field1543;

    @OriginalMember(owner = "client!jf", name = "P", descriptor = "I")
    public int field1544;

    @OriginalMember(owner = "client!jf", name = "I", descriptor = "Lgk;")
    public static class203 field1537;

    @OriginalMember(owner = "client!jf", name = "H", descriptor = "[I")
    public static int[] field1536;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V", line = 9)
    public static void method599(boolean arg0) {
        if (arg0) {
            field1536 = null;
            field1537 = null;
            field1539 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIII)V", line = 31)
    public final void method601(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field1538 << 3;
        if (arg3 != -1383661629) {
            field1534 = false;
        }
        field1541++;
        int var7 = this.field1544 << 3;
        int var8 = (arg4 << 4) + (var7 & 0xF);
        int var9 = (arg2 << 4) + (var6 & 0xF);
        this.method603(var7, var6, var8, var9, arg1, arg0);
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(II)V")
    public abstract void method600(int arg0, int arg1);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)V")
    public abstract void method602(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIII)V")
    public abstract void method603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII)V")
    public abstract void method604(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(IIIII)V")
    public abstract void method605(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(II)V")
    public abstract void method606(int arg0, int arg1);
}
