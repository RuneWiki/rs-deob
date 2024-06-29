import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class413 {

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "[[B")
    public static byte[][] field6247;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lhw;I)Lha;")
    public static final class326 method2633(class208 arg0, int arg1) {
        field6248++;
        if (arg1 <= 66) {
            field6247 = null;
        }
        return new class326(arg0.method1456(13329), arg0.method1456(13329), arg0.method1456(13329), arg0.method1456(13329), arg0.method1452(3), arg0.method1452(3), arg0.method1445(-85));
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V")
    public static void method2634(boolean arg0) {
        if (arg0) {
            field6247 = null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(BFFF)I")
    public static final int method2635(byte arg0, float arg1, float arg2, float arg3) {
        field6246++;
        float var4 = arg3 < 0.0F ? -arg3 : arg3;
        float var5 = arg1 < 0.0F ? -arg1 : arg1;
        if (arg0 > -124) {
            return -83;
        }
        float var6 = (arg2 < 0.0F) ? -arg2 : arg2;
        if (var4 < var5 && var5 > var6) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return (arg2 > 0.0F) ? 2 : 3;
        } else if ((arg3 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
    public static final void method2636(byte arg0) {
        class86.method601((byte) -18);
        field6249++;
        int var1 = 92 % ((-arg0 - 91) / 34);
    }
}
