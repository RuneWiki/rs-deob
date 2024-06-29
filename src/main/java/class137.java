import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public abstract class class137 extends class488 {

    @OriginalMember(owner = "client!lca", name = "x", descriptor = "S")
    public short field1776;

    @OriginalMember(owner = "client!lca", name = "E", descriptor = "S")
    public short field1783;

    @OriginalMember(owner = "client!lca", name = "w", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!lca", name = "y", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!lca", name = "z", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!lca", name = "A", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!lca", name = "B", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!lca", name = "C", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!lca", name = "F", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!lca", name = "G", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!lca", name = "D", descriptor = "[[B")
    public static byte[][] field1782;

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "(B)Z")
    public final boolean method79(byte arg0) {
        ++field1785;
        if (arg0 > -26) {
            this.field1783 = -67;
        }
        return false;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "([Lgga;I)I")
    public final int method785(class332[] arg0, int arg1) {
        int var3 = 97 % ((-87 - arg1) / 32);
        ++field1779;
        return this.method2640((byte) 111, arg0, super.field6461 >> class52.field775, super.field6464 >> class52.field775);
    }

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "(B)Z")
    public final boolean method786(byte arg0) {
        if (arg0 < 111) {
            field1782 = null;
        }
        ++field1778;
        return class700.method3929(this.method71(116), super.field6456, super.field6464 >> class52.field775, super.field6461 >> class52.field775, 55);
    }

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "(I)Z")
    public final boolean method787(int arg0) {
        if (arg0 != 4095) {
            this.method79((byte) 112);
        }
        ++field1784;
        return class354.field4511[(super.field6461 >> class52.field775) + -class516.field7041 + class479.field6372][(super.field6464 >> class52.field775) + -class204.field2599 + class479.field6372];
    }

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "(I)V")
    public final void method66(int arg0) {
        ++field1777;
        if (arg0 != -1) {
            this.field1776 = -1;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(II)V")
    public static final void method788(int arg0, int arg1) {
        ++field1780;
        class304.field3746 = arg0;
        class126.field1583 = 2;
        long var2 = (long) arg1;
        if (class180.field2319 != null) {
            class630 var4 = new class630(class384.method2072(class493.method2659((byte) 100, class180.field2319), arg1 ^ 16));
            long var5 = var4.method3527(false);
            class418.field5253 = var4.method3527(false);
            class174.method1097(true, "", arg1 ^ 122, class577.method3181((byte) -67, var5));
        } else {
            class544.method2939((byte) 117, 35);
        }
    }

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "(I)V")
    public static void method789(int arg0) {
        if (arg0 == 35) {
            field1782 = null;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ZIBLr;Llo;II)V")
    public final void method77(boolean arg0, int arg1, byte arg2, class566 arg3, class488 arg4, int arg5, int arg6) {
        int var8 = 126 / ((-50 - arg2) / 55);
        ++field1781;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(IIIIIII)V")
    public class137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super.field6456 = (byte) arg4;
        super.field6464 = arg2;
        this.field1776 = (short) arg6;
        super.field6458 = arg1;
        this.field1783 = (short) arg5;
        super.field6461 = arg0;
        super.field6470 = (byte) arg3;
    }
}
