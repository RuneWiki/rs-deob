import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class85 {

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "J")
    public static long field1469 = 0L;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field1471 = 0;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Lqd;")
    public static class40 field1475 = class147.method1106("Ausw-=hlen", (byte) -119);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Lqd;")
    public static class40 field1467 = class147.method1106("_labels", (byte) -43);

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Lce;")
    public static class239 field1472;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIII)V", line = 7)
    public static final void method653(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 > -93) {
            method655(-1, 31, 67, 32);
        }
        field1476++;
        if (arg3 > arg0) {
            class150.method1124(arg3, arg0, arg4, true, class37.field694[arg2]);
        } else {
            class150.method1124(arg0, arg3, arg4, true, class37.field694[arg2]);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 26)
    public static void method654(int arg0) {
        field1472 = null;
        if (arg0 == 23183) {
            field1475 = null;
            field1467 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIII)I", line = 39)
    public static final int method655(int arg0, int arg1, int arg2, int arg3) {
        field1474++;
        if (arg3 != -6681) {
            method656(-33, -49, -119, 4, 56, -5);
        }
        if ((class274.field4564[arg0][arg2][arg1] & 0x8) == 0) {
            return arg0 <= 0 || (class274.field4564[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIII)V", line = 108)
    public static final void method656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var9 = arg0 + 1;
        class150.method1124(arg1, arg4, arg5, true, class37.field694[arg0]);
        field1468++;
        int var10 = arg3 - 1;
        class150.method1124(arg1, arg4, arg5, true, class37.field694[arg3]);
        int var6 = var9;
        if (arg2 < 13) {
            field1467 = (class40) null;
        }
        while (var10 >= var6) {
            int[] var7 = class37.field694[var6];
            var7[arg4] = var7[arg1] = arg5;
            var6++;
        }
    }
}
