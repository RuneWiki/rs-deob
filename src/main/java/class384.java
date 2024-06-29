import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class384 extends class235 {

    @OriginalMember(owner = "client!oo", name = "P", descriptor = "I")
    public static int field5748 = 0;

    @OriginalMember(owner = "client!oo", name = "T", descriptor = "I")
    public static int field5752 = -50;

    @OriginalMember(owner = "client!oo", name = "A", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!oo", name = "B", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!oo", name = "E", descriptor = "I")
    public int field5738;

    @OriginalMember(owner = "client!oo", name = "F", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!oo", name = "H", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!oo", name = "K", descriptor = "I")
    public int field5743;

    @OriginalMember(owner = "client!oo", name = "M", descriptor = "I")
    public int field5745;

    @OriginalMember(owner = "client!oo", name = "N", descriptor = "I")
    public int field5746;

    @OriginalMember(owner = "client!oo", name = "Q", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!oo", name = "R", descriptor = "I")
    public int field5750;

    @OriginalMember(owner = "client!oo", name = "S", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!oo", name = "L", descriptor = "Lqj;")
    public static class238 field5744;

    @OriginalMember(owner = "client!oo", name = "C", descriptor = "Ljava/lang/String;")
    public String field5736;

    @OriginalMember(owner = "client!oo", name = "G", descriptor = "[I")
    public int[] field5740;

    @OriginalMember(owner = "client!oo", name = "U", descriptor = "[I")
    public int[] field5753;

    @OriginalMember(owner = "client!oo", name = "D", descriptor = "[Lsf;")
    public class143[] field5737;

    @OriginalMember(owner = "client!oo", name = "O", descriptor = "[Lqa;")
    public static class243[] field5747;

    @OriginalMember(owner = "client!oo", name = "I", descriptor = "[Ljava/lang/String;")
    public String[] field5742;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(II)Lfq;", line = 4)
    public static final class179 method2519(int arg0, int arg1) {
        field5749++;
        class179 var2 = (class179) class300.field4293.method2319(-12, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 == 23752) {
            byte[] var3;
            if (arg1 >= 32768) {
                var3 = class123.field1642.method1472(arg1 & 0x7FFF, 0, 0);
            } else {
                var3 = class442.field6453.method1472(arg1, 0, 0);
            }
            class179 var4 = new class179();
            if (var3 != null) {
                var4.method1099(new class265(var3), -32);
            }
            if (arg1 >= 32768) {
                var4.method1104((byte) 99);
            }
            class300.field4293.method2318(var4, false, (long) arg1);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIII)I", line = 35)
    public static final int method2520(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5741++;
        if (arg0 != 32768) {
            field5739 = -121;
        }
        int var5 = 65536 - class190.field2635[arg3 * 8192 / arg2] >> 1;
        return ((65536 - var5) * arg1 >> 16) + (arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "(I)V", line = 58)
    public static void method2521(int arg0) {
        if (arg0 == 0) {
            field5744 = null;
            field5747 = null;
        }
    }
}
