import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class718 {

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "[I")
    public static int[] field10072 = new int[4];

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "Lvu;")
    public static class677 field10075 = new class677();

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public static int field10070;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public static int field10071;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public static int field10073;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "Lgu;")
    public static class726 field10074;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)Z", line = 4)
    public static final boolean method3961(int arg0, int arg1) {
        if (arg0 != 2) {
            method3964(-24, -103);
        }
        field10073++;
        return arg1 == 0 || arg1 == 2;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V", line = 19)
    public static void method3962(byte arg0) {
        field10072 = null;
        if (arg0 < 8) {
            method3961(-43, -92);
        }
        field10074 = null;
        field10075 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZLjava/io/File;)[B", line = 41)
    public static final byte[] method3963(boolean arg0, File arg1) {
        field10071++;
        if (!arg0) {
            field10072 = null;
        }
        return class303.method1993(0, (int) arg1.length(), arg1);
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)S", line = 54)
    public static final short method3964(int arg0, int arg1) {
        field10070++;
        int var2 = (arg1 & 0xFFDB) >> 10;
        int var3 = (arg1 & arg0) >> 3;
        int var4 = arg1 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var2 << 10 | var7 >> 4 << 7);
    }
}
