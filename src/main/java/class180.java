import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class180 {

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "J")
    public long field2585 = 0L;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field2586 = 0;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field2592 = 0;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "Ljava/lang/String;")
    public static String field2598 = "Close";

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2597 = "M";

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public int field2579;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public int field2580;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public int field2581;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public int field2588;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public int field2589;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public int field2590;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public int field2595;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public int field2596;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public int field2599;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public int field2600;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    public int field2601;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Lh;")
    public class111 field2591;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Lph;")
    public static class361 field2582;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Lph;")
    public static class361 field2584;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIZ)I", line = 11)
    public static final int method1247(int arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0 & 0x3;
        if (!arg3) {
            method1247(115, 93, -42, true);
        }
        field2587++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V", line = 47)
    public static final void method1248(int arg0, int arg1) {
        class126.field1833.method464(3398, arg1);
        class361.field5735.method464(3398, arg1);
        field2594++;
        class235.field3533.method464(3398, arg1);
        if (arg0 < 18) {
            method1247(-31, 89, -91, false);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lqm;I)I", line = 62)
    public static final int method1249(class228 arg0, int arg1) {
        field2593++;
        int var2 = arg0.field3461;
        class15 var3 = arg0.method2355(true);
        if (arg0.field5096 == var3.field262) {
            var2 = arg0.field3442;
        } else if (arg0.field5096 == var3.field232 || arg0.field5096 == var3.field253 || arg0.field5096 == var3.field240 || arg0.field5096 == var3.field220) {
            var2 = arg0.field3437;
        } else if (arg0.field5096 == var3.field241 || arg0.field5096 == var3.field238 || arg0.field5096 == var3.field257 || arg0.field5096 == var3.field252) {
            var2 = arg0.field3456;
        }
        if (arg1 != 0) {
            field2598 = (String) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 96)
    public static void method1250(int arg0) {
        field2582 = null;
        field2598 = null;
        if (arg0 != 0) {
            field2592 = -54;
        }
        field2584 = null;
        field2597 = null;
    }
}
