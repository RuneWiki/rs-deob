import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class165 {

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "[I")
    public static int[] field2746 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "F")
    public static float field2750;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "J")
    public long field2744;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Ltf;")
    public class165 field2747;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "Ltf;")
    public class165 field2749;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "Lak;")
    public static class172 field2756;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "Lcb;")
    public static class91 field2752;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "[Ldf;")
    public static class167[] field2745;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V", line = 20)
    public final void method1212(byte arg0) {
        field2748++;
        if (arg0 <= 64) {
            field2746 = (int[]) null;
        }
        if (this.field2749 != null) {
            this.field2749.field2747 = this.field2747;
            this.field2747.field2749 = this.field2749;
            this.field2749 = null;
            this.field2747 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 41)
    public static void method1213(int arg0) {
        field2746 = null;
        field2745 = null;
        field2756 = null;
        field2752 = null;
        if (arg0 != 0) {
            field2756 = (class172) null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)Z", line = 54)
    public final boolean method1214(byte arg0) {
        field2757++;
        if (this.field2749 == null) {
            return false;
        } else {
            if (arg0 != -55) {
                field2745 = (class167[]) null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZIILsk;III)Lbf;", line = 71)
    public static final class58 method1215(boolean arg0, int arg1, int arg2, class106 arg3, int arg4, int arg5, int arg6) {
        field2751++;
        if (arg2 != 28572) {
            method1215(true, -60, -30, (class106) null, 47, 62, -112);
        }
        int var8 = (arg5 << 19) + (arg6 << 17) + (arg4 - -(arg0 ? 65536 : 0));
        long var9 = (long) arg1 * 3147483667L + (long) var8 * 3849834839L;
        class58 var11 = (class58) class193.field3141.method704((byte) 126, var9);
        if (var11 != null) {
            return var11;
        }
        class170.field2807 = false;
        class58 var12 = class153.method1105(arg1, arg5, arg6, arg3, arg0, false, 103, false, arg4);
        if (var12 != null && !class170.field2807) {
            class193.field3141.method703(var12, var9, (byte) 76);
        }
        return var12;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 99)
    public static final void method1216(int arg0) {
        field2754++;
        class54 var1 = (class54) class45.field639.method1240(arg0 ^ 0x3);
        if (arg0 != 0) {
            method1213(87);
        }
        while (var1 != null) {
            class81 var2 = var1.field761;
            if (class49.field698 != var2.field1125 || var2.field1147) {
                var1.method1212((byte) 99);
            } else if (class240.field3818 >= var2.field1150) {
                var2.method555(class36.field477, true);
                if (var2.field1147) {
                    var1.method1212((byte) 91);
                } else {
                    class67.method448(var2.field1125, var2.field1149, var2.field1123, var2.field1143, 60, var2, 0, -1L, false);
                }
            }
            var1 = (class54) class45.field639.method1235(false);
        }
    }
}
