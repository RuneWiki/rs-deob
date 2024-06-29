import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class152 {

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Lmh;")
    private static class62 field2401 = class201.method1405(true, "Walk here");

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field2398 = 0;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Lmh;")
    public static class62 field2403 = class201.method1405(true, "Hierhin gehen");

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Lmh;")
    public static class62 field2405 = class201.method1405(true, "::qa_op_test");

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Lmh;")
    public static class62 field2406 = class201.method1405(true, "::fpson");

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "Lmh;")
    public static class62 field2407 = field2401;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Lsg;")
    public static class191 field2399;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIZLhi;)Lkb;", line = 11)
    public static final class82 method1089(int arg0, int arg1, boolean arg2, class26 arg3) {
        if (arg2) {
            return (class82) null;
        } else {
            field2402++;
            return class127.method951(arg3, arg0, -100, arg1) ? class101.method805(true) : null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILmh;)I", line = 35)
    public static final int method1090(int arg0, class62 arg1) {
        field2397++;
        if (arg0 != 21850) {
            method1092((byte) 39, (class26) null, (class26) null, (class26) null);
        }
        return arg1.method439(126) + 1;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Lbk;", line = 62)
    public static final class54 method1091(int arg0, int arg1, int arg2) {
        class166 var3 = class256.field4320[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class54 var4 = var3.field2706;
            var3.field2706 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLhi;Lhi;Lhi;)V", line = 78)
    public static final void method1092(byte arg0, class26 arg1, class26 arg2, class26 arg3) {
        class8.field89 = arg3;
        field2400++;
        class246.field4190 = arg2;
        if (arg0 > 39) {
            class24.field274 = arg1;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII)Z", line = 91)
    public static final boolean method1093(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class37.field566 * arg3 + class200.field3388 * arg0 >> 16;
        int var6 = class200.field3388 * arg3 - class37.field566 * arg0 >> 16;
        int var7 = class77.field1275 * arg1 + class55.field805 * var6 >> 16;
        int var8 = class55.field805 * arg1 - class77.field1275 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class77.field1275 * arg2 + class55.field805 * var6 >> 16;
        int var12 = class55.field805 * arg2 - class77.field1275 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class244.field4160 && var13 < class244.field4160) {
            return false;
        } else if (var9 > class221.field3804 && var13 > class221.field3804) {
            return false;
        } else if (var10 < class24.field263 && var14 < class24.field263) {
            return false;
        } else {
            return var10 <= class8.field90 || var14 <= class8.field90;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 147)
    public static void method1094(int arg0) {
        field2406 = null;
        int var1 = 115 % ((-arg0 - 12) / 54);
        field2399 = null;
        field2405 = null;
        field2403 = null;
        field2401 = null;
        field2407 = null;
    }
}
