import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class261 extends class95 {

    @OriginalMember(owner = "client!ln", name = "F", descriptor = "Ltn;")
    public static class60 field3851 = new class60(65, 8);

    @OriginalMember(owner = "client!ln", name = "L", descriptor = "F")
    public static float field3857;

    @OriginalMember(owner = "client!ln", name = "G", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!ln", name = "H", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!ln", name = "I", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!ln", name = "J", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!ln", name = "K", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!ln", name = "N", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!ln", name = "M", descriptor = "[[B")
    public static byte[][] field3858;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(Z)V")
    public static void method1668(boolean arg0) {
        if (!arg0) {
            method1668(true);
        }
        field3851 = null;
        field3858 = null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIZ)V")
    public static final void method1669(int arg0, int arg1, int arg2, boolean arg3) {
        ++field3853;
        if (~arg0 == -1009) {
            class495.method2873(class8.field129, arg1, arg2);
        } else if (~arg0 != -1004) {
            if (~arg0 != -1013) {
                if (~arg0 == -1012) {
                    class495.method2873(class388.field5449, arg1, arg2);
                } else if (~arg0 == -1008) {
                    class495.method2873(class443.field6224, arg1, arg2);
                }
            } else {
                class495.method2873(class75.field930, arg1, arg2);
            }
        } else {
            class495.method2873(class181.field2590, arg1, arg2);
        }
        if (!arg3) {
            method1671(-35);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIII)I")
    public static final int method1670(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -49 % ((53 - arg4) / 44);
        ++field3859;
        int var6 = -class95.field1241[arg1 * 8192 / arg0] + 65536 >> 1;
        return ((65536 - var6) * arg3 >> 16) - -(arg2 * var6 >> 16);
    }

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "(I)V")
    public static final void method1671(int arg0) {
        ++field3852;
        class232.field3407 = new class214(class488.field6833.method3116(class149.field1979, (byte) 101), "", class432.field6097, 1010, -1, 0L, 0, arg0, true, false);
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(IIIII)V")
    public static final void method1672(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class429.field6048 != null) {
            class429.field6048[arg0][arg1] = -16777216 | arg2;
        }
        if (class211.field3059 != null) {
            class211.field3059[arg0][arg1] = (short) arg3;
        }
        if (field3858 != null) {
            field3858[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(IIIIIF)V")
    public class261(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILoi;I)Lbr;")
    public static final class273 method1673(int arg0, class53 arg1, int arg2) {
        ++field3856;
        if (arg0 != -2099728144) {
            method1673(-71, (class53) null, -119);
        }
        byte[] var3 = arg1.method421(arg2, 1);
        return var3 == null ? null : new class273(var3);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIII)V")
    public final void method674(int arg0, int arg1, int arg2, int arg3) {
        super.field1243 = arg1;
        if (arg2 != 16384) {
            this.method677(1.7284182F, 94);
        }
        ++field3854;
        super.field1231 = arg0;
        super.field1239 = arg3;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(FI)V")
    public final void method677(float arg0, int arg1) {
        if (arg1 != -24673) {
            field3857 = -1.124903F;
        }
        super.field1228 = arg0;
        ++field3855;
    }

    static {
        new class530("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
    }
}
