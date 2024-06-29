import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class789 extends Exception {

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "[I")
    public static int[] field10822 = new int[1];

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "F")
    public static float field10819;

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "I")
    public static int field10820;

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "I")
    public static int field10823;

    @OriginalMember(owner = "client!rw", name = "f", descriptor = "I")
    public static int field10824;

    @OriginalMember(owner = "client!rw", name = "g", descriptor = "I")
    public static int field10825;

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "Lpr;")
    public static class472 field10821;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(BII)Z", line = 11)
    public static final boolean method4307(byte arg0, int arg1, int arg2) {
        field10825++;
        if (arg0 >= -52) {
            method4309(-64, -125);
        }
        return (arg2 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Z)V", line = 23)
    public static final void method4308(boolean arg0) {
        class205.field3095.method499(class714.field9834, class111.field1911.field6765.method330((byte) 54) == 1 ? class449.field6155 + 256 << 2 : -1, 0);
        field10824++;
        if (!arg0) {
            method4310(-66);
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)I", line = 38)
    public static final int method4309(int arg0, int arg1) {
        field10820++;
        byte var2;
        if (arg0 > 12000) {
            class358.method2208(-125);
            var2 = 4;
        } else if (arg0 > 5000) {
            class337.method2110((byte) -91);
            var2 = 3;
        } else if (arg0 > 2000) {
            class567.method3272(true);
            var2 = 2;
        } else {
            class124.method1072(true, arg1 + 16600);
            var2 = 1;
        }
        if (class111.field1911.field6725.method3784((byte) 105) != 2) {
            class111.field1911.method2823(true, class111.field1911.field6753, 2);
            class624.method3517(false, arg1 + 16602, 2);
        }
        if (arg1 == -16602) {
            class307.method1957(0);
            return var2;
        } else {
            return -25;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V", line = 87)
    public static void method4310(int arg0) {
        field10821 = null;
        int var1 = 91 / ((-arg0 - 36) / 43);
        field10822 = null;
    }
}
