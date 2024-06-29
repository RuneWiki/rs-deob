import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public abstract class class334 {

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field4988 = -1;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "[B")
    public static byte[] field4986 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Lgu;")
    public static class412 field4985 = new class412(64);

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "Z")
    public static boolean field4990 = false;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field4991 = -1;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "[I")
    public static int[] field4992;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Lhd;")
    public abstract class524 method2109(byte arg0);

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BI)V")
    public abstract void method2110(byte arg0, int arg1);

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static void method2111(int arg0) {
        field4986 = null;
        if (arg0 != 31159) {
            field4992 = null;
        }
        field4985 = null;
        field4992 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)Z")
    public static final boolean method2112(int arg0, int arg1, int arg2) {
        if (arg0 == 16534) {
            field4987++;
            return (arg1 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)[B")
    public abstract byte[] method2113(int arg0, int arg1);

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)Lgo;")
    public static final class445 method2114(boolean arg0) {
        class102.field1462 = 0;
        if (!arg0) {
            method2112(58, 6, 57);
        }
        field4984++;
        return class183.method1218(-127);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)I")
    public abstract int method2115(int arg0, int arg1);
}
