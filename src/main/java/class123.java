import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public abstract class class123 {

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Llc;")
    public static class69 field2673 = class69.method470((byte) -117, "Unable to find ");

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Llc;")
    public static class69 field2677 = class69.method470((byte) -102, "Apr");

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "Llc;")
    public static class69 field2671 = class69.method470((byte) -115, "redstone3");

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Llc;")
    public static class69 field2674 = class69.method470((byte) -124, "glow3:");

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Z")
    public static boolean field2672 = false;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Llc;")
    public static class69 field2676 = class69.method470((byte) -119, "(U");

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Llc;")
    public static class69 field2678 = class69.method470((byte) -105, "On");

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static volatile int field2681 = 0;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "[Lk;")
    public static class60[] field2682 = new class60[2048];

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field2683 = 0;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Llc;")
    public static class69 field2680 = class69.method470((byte) -112, "purple:");

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method914(int arg0) {
        field2682 = null;
        field2673 = null;
        field2674 = null;
        field2676 = null;
        field2671 = null;
        field2678 = null;
        field2680 = null;
        if (arg0 != -779477840) {
            field2678 = null;
        }
        field2677 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Llc;ILpd;)I")
    public static final int method915(class69 arg0, int arg1, class94 arg2) {
        int var3 = arg2.field2061;
        arg2.method690(arg1 ^ 0xFFFF6298, arg0.field1523);
        arg2.field2061 += class64.field1354.method620(arg0.field1523, arg2.field2077, arg2.field2061, arg1 ^ 0xFFFFE2F2, 0, arg0.field1488);
        if (arg1 != -7528) {
            method916((byte) 33, 85, 13, 8, 20, 2, 60);
        }
        field2679++;
        return arg2.field2061 - var3;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BIIIIII)V")
    public static final void method916(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 2048 - arg3 & 0x7FF;
        field2675++;
        int var8 = 2048 - arg4 & 0x7FF;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg2;
        if (var7 != 0) {
            int var12 = class44.field920[var7];
            int var13 = class44.field915[var7];
            int var14 = var10 * var12 - arg2 * var13 >> 16;
            var11 = var10 * var13 + arg2 * var12 >> 16;
            var10 = var14;
        }
        if (var8 != 0) {
            int var15 = class44.field920[var8];
            int var16 = class44.field915[var8];
            int var17 = var9 * var15 + var11 * var16 >> 16;
            var11 = var11 * var15 - var9 * var16 >> 16;
            var9 = var17;
        }
        if (arg0 < 26) {
            field2673 = null;
        }
        class108.field2395 = arg1 - var11;
        class85.field1900 = arg3;
        class70.field1561 = arg5 - var10;
        class55.field1164 = arg6 - var9;
        class24.field510 = arg4;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BII)I")
    public abstract int method63(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public abstract void method61(int arg0);
}
