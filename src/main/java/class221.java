import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class221 extends class179 {

    @OriginalMember(owner = "client!iq", name = "F", descriptor = "I")
    public static int field3300 = -1;

    @OriginalMember(owner = "client!iq", name = "G", descriptor = "Z")
    public static boolean field3301 = false;

    @OriginalMember(owner = "client!iq", name = "E", descriptor = "[Ljo;")
    public static class218[] field3299 = new class218[0];

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "I")
    public int field3291;

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "I")
    public int field3295;

    @OriginalMember(owner = "client!iq", name = "B", descriptor = "I")
    public int field3297;

    @OriginalMember(owner = "client!iq", name = "D", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!iq", name = "H", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!iq", name = "I", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "Lbs;")
    public static class186 field3294;

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "Ljava/lang/String;")
    public String field3290;

    @OriginalMember(owner = "client!iq", name = "A", descriptor = "[[Lbc;")
    public static class283[][] field3296;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "(I)J")
    public final long method1688(int arg0) {
        ++field3293;
        return arg0 != -32174 ? -24L : super.field2671 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "(I)V")
    public final void method1689(int arg0) {
        ++field3288;
        super.field2671 = class10.method63(-21149) - -500L | super.field2671 & Long.MIN_VALUE;
        class41.field633.method1564((byte) 106, this);
        int var2 = 19 / ((arg0 - 46) / 47);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)V")
    public static void method1690(boolean arg0) {
        field3294 = null;
        field3299 = null;
        field3296 = null;
        if (!arg0) {
            method1693(50, 73);
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)I")
    public final int method1691(boolean arg0) {
        if (!arg0) {
            return 104;
        } else {
            ++field3302;
            return (int) super.field499;
        }
    }

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "(I)V")
    public final void method1692(int arg0) {
        ++field3292;
        super.field2671 |= Long.MIN_VALUE;
        if (arg0 != 0) {
            this.method1692(-117);
        }
        if (~this.method1688(-32174) == -1L) {
            class292.field4339.method1564((byte) 106, this);
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(II)V")
    public static final void method1693(int arg0, int arg1) {
        if (arg0 >= -115) {
            field3296 = null;
        }
        ++field3289;
        class221 var2 = class447.method2795(7, (byte) -49, arg1);
        var2.method1689(94);
    }

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "(B)I")
    public final int method1694(byte arg0) {
        ++field3298;
        if (arg0 != -9) {
            this.field3295 = -2;
        }
        return (int) (super.field499 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "(I)V")
    public static final void method1695(int arg0) {
        class349.field4961.method106((byte) -105);
        ++field3303;
        class264.field3974.method106((byte) -127);
        if (arg0 != -1) {
            field3294 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(II)V")
    public class221(int arg0, int arg1) {
        super.field499 = (long) arg0 << 32 | (long) arg1;
    }
}
