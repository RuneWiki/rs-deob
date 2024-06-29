import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class163 {

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field2588 = 0;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "[I")
    public static int[] field2600 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2598 = "glow3:";

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public int field2583;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public int field2584;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public int field2593;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public int field2594;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public int field2595;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public int field2596;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public int field2597;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Lrn;")
    public static class18 field2587;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "Lrn;")
    public static class18 field2599;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "[B")
    public byte[] field2591;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "[B")
    public byte[] field2592;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)Lbb;", line = 6)
    public static final class44 method1301(int arg0, int arg1, int arg2) {
        class329 var3 = class170.field2689[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class44 var4 = var3.field5062;
            var3.field5062 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIBI)V", line = 23)
    public static final void method1302(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg5 != 51) {
            field2600 = (int[]) null;
        }
        field2586++;
        class68[] var7 = class301.field4677;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class68 var9 = var7[var8];
            if (var9 != null && var9.field1036 == 2) {
                class174.method1367(var9.field1042 * 2, arg4, 15112, (var9.field1051 - class358.field5696 << 7) + var9.field1040, arg3 >> 1, arg0, (var9.field1041 - class49.field755 << 7) + var9.field1034, arg1 >> 1);
                if (class18.field292 > -1 && (class360.field5718 % 20) < 10) {
                    class221.field3434[var9.field1044].method17(arg6 - (12 - class18.field292), class59.field925 + -28 + arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 52)
    public static void method1303(int arg0) {
        field2599 = null;
        if (arg0 != -1) {
            method1301(-45, 2, 36);
        }
        field2587 = null;
        field2600 = null;
        field2598 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)V", line = 69)
    public static final void method1304(int arg0, byte arg1) {
        field2601++;
        class36.field544 = -1;
        class191.field3006 = -1;
        if (arg1 == -63) {
            class335.field5120 = arg0;
            class71.method679((byte) -34);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILrn;II)Lkk;", line = 88)
    public static final class77 method1305(int arg0, class18 arg1, int arg2, int arg3) {
        field2585++;
        return class282.method2056(arg2, arg3 ^ arg3, arg1, arg0) ? class348.method2447(0) : null;
    }
}
