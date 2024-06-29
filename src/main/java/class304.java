import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class304 extends class107 {

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "[[I")
    public static int[][] field4955;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIZI)V")
    public static final void method2068(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            field4955 = null;
        }
        ++field4950;
        class291 var5 = class61.method389(arg2, 4, 0);
        var5.method2009(-45);
        var5.field4768 = arg4;
        var5.field4763 = arg0;
        var5.field4773 = arg1;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        int var3 = 83 / ((arg0 - -34) / 49);
        int[] var4 = super.field1661.method894(110, arg1);
        ++field4956;
        if (super.field1661.field2115) {
            class282.method1920(var4, 0, class24.field443, class259.field4254[arg1]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lgi;B)V")
    public static final void method2069(class164 arg0, byte arg1) {
        ++field4952;
        class49.field721 = arg0.method1160("titlebg", -1);
        if (arg1 < 120) {
            field4955 = null;
        }
        class34.field560 = arg0.method1160("logo", -1);
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class304() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILrg;II)V")
    public static final void method2070(int arg0, class248 arg1, int arg2, int arg3) {
        ++field4954;
        if (class218.field3430 == null && !class41.field633) {
            if (arg1 != null && class102.method734((byte) 0, arg1) != null) {
                if (arg0 >= -73) {
                    method2070(-118, (class248) null, 81, 5);
                }
                class218.field3430 = arg1;
                class263.field4304 = class102.method734((byte) 0, arg1);
                class300.field4918 = false;
                class64.field1035 = arg3;
                class269.field4347 = 0;
                class100.field1573 = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIII)V")
    public static final void method2071(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg3; class128.field2054 > var5; ++var5) {
            if (~(class270.field4353[var5] + class169.field2779[var5]) < ~arg1 && class270.field4353[var5] < arg1 - -arg2 && class248.field4071[var5] + class165.field2732[var5] > arg4 && class248.field4071[var5] < arg0 + arg4) {
                class197.field3170[var5] = true;
            }
        }
        ++field4949;
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
    public static final void method2072(int arg0) {
        ++field4951;
        if (class233.field3644 != arg0) {
            class82.method587(-11774, -1, false, -1, class233.field3644);
            class233.field3644 = -1;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
    public static void method2073(boolean arg0) {
        if (arg0) {
            field4955 = null;
        }
        field4955 = null;
    }
}
