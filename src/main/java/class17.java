import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class17 extends class73 {

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    public static int field281 = 0;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public int field273;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public int field275;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "[I")
    public int[] field274;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "[I")
    public int[] field276;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "[I")
    public int[] field277;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "[Lkc;")
    public class29[] field271;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "[Lkc;")
    public class29[] field278;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "[[[B")
    public byte[][][] field279;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZLhi;Lja;Lhi;Z)V")
    public static final void method122(boolean arg0, class250 arg1, class53 arg2, class250 arg3, boolean arg4) {
        class256.field4559 = arg3;
        class184.field3392 = arg1;
        if (!arg4) {
            field281 = 79;
        }
        class259.field4598 = arg0;
        int var5 = class184.field3392.method1699((byte) 16) - 1;
        field280++;
        class142.field2676 = class184.field3392.method1693(var5, 0) + var5 * 256;
        class236.field4226 = arg2;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lbk;Lhi;BLhi;Lhi;)Z")
    public static final boolean method123(class52 arg0, class250 arg1, byte arg2, class250 arg3, class250 arg4) {
        class197.field3612 = arg3;
        class46.field731 = arg4;
        class113.field2052 = arg0;
        class215.field3949 = arg1;
        if (arg2 != 100) {
            field281 = 62;
        }
        field282++;
        return true;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public static final void method124(int arg0) {
        field283++;
        class150.field2830++;
        class182.field3349.method577(39, arg0);
        for (class271 var1 = (class271) class87.field1715.method192(111); var1 != null; var1 = (class271) class87.field1715.method189(arg0)) {
            if (var1.field4810 == 0) {
                class58.method402((byte) 38, var1, true);
            }
        }
        if (class225.field4118 != null) {
            class229.method1581(class225.field4118, false);
            class225.field4118 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)Z")
    public static final boolean method125(int arg0) {
        field272++;
        return arg0 < 12 ? false : class156.field2962;
    }
}
