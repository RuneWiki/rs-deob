import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class201 extends class381 {

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "I")
    public int field2729;

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!hv", name = "n", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!hv", name = "o", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!hv", name = "p", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!hv", name = "s", descriptor = "I")
    public int field2736;

    @OriginalMember(owner = "client!hv", name = "t", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "[I")
    public int[] field2727;

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "[I")
    public int[] field2728;

    @OriginalMember(owner = "client!hv", name = "q", descriptor = "[I")
    public int[] field2734;

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "[Lae;")
    public class254[] field2726;

    @OriginalMember(owner = "client!hv", name = "r", descriptor = "[Lae;")
    public class254[] field2735;

    @OriginalMember(owner = "client!hv", name = "u", descriptor = "[[[B")
    public byte[][][] field2738;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIII)V", line = 6)
    public static final void method1304(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2732++;
        if (arg3 != 25221) {
            return;
        }
        if (arg1 - arg0 >= class175.field2455 && (arg0 + arg1) <= class375.field5631 && arg4 - arg0 >= class323.field4704 && (arg0 + arg4) <= class148.field2106) {
            class347.method2152(arg2, arg4, arg0, 0, arg1);
        } else {
            class384.method2376(-90, arg4, arg0, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lmv;ZI)Lf;", line = 27)
    public static final class256 method1305(class295 arg0, boolean arg1, int arg2) {
        field2725++;
        if (!arg1) {
            return null;
        }
        class256 var3 = (class256) class73.field1152.method3901((long) arg2, -58);
        if (var3 == null) {
            if (class409.field6099) {
                var3 = class332.field4821.method660(class616.method3517(arg0, arg2), true);
            } else {
                var3 = class220.method1384(arg0.method1830(false, arg2), (byte) 116);
            }
            class73.field1152.method3894(var3, (byte) 60, (long) arg2);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)I", line = 58)
    public static final int method1306(int arg0, int arg1, int arg2) {
        field2733++;
        if (arg1 == 3845) {
            int var3 = arg2 >>> 24;
            int var4 = 255 - var3;
            int var5 = ((arg2 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg2 & 0xFF00) * var3 & 0xFF0000) >>> 8;
            return (((arg0 & 0xFF00) * var4 & 0xFF0000 | (arg0 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
        } else {
            return 10;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BZI)V", line = 75)
    public static final void method1307(byte arg0, boolean arg1, int arg2) {
        if (arg0 != -119) {
            return;
        }
        field2737++;
        class15 var3 = class262.method1577((byte) -17, arg2, arg1);
        if (var3 != null) {
            var3.method2360((byte) 66);
        }
    }
}
