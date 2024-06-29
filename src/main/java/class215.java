import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class215 {

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "C")
    public static char field2859;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "Lqj;")
    public static class296 field2857;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "Lqj;")
    public static class296 field2861;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)V")
    public static final void method1376(int arg0, byte arg1) {
        class155.field2186 = 0;
        if (arg1 > -63) {
            return;
        }
        class410.field5952 = false;
        class399.field5832 = 1;
        field2858++;
        class202.field2761 = null;
        class395.field5780 = -1;
        class227.field3031 = arg0;
        class2.field28 = -1;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BIIIII)V")
    public static final void method1377(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2860++;
        if (arg0 != 79) {
            method1378(-89);
        }
        int var6 = arg3 - arg1;
        int var7 = arg5 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class157.method1057(arg5, arg2, arg4, false, arg1);
            }
        } else if (var7 == 0) {
            class389.method2543(-25509, arg4, arg1, arg2, arg3);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg4 - (arg1 * var8 >> 12);
            int var10;
            int var11;
            if (class379.field5397 > arg3) {
                var10 = class379.field5397;
                var11 = (class379.field5397 * var8 >> 12) + var9;
            } else if (class43.field659 >= arg3) {
                var10 = arg3;
                var11 = arg5;
            } else {
                var10 = class43.field659;
                var11 = (class43.field659 * var8 >> 12) + var9;
            }
            int var12;
            int var13;
            if (arg1 < class379.field5397) {
                var13 = var9 + (class379.field5397 * var8 >> 12);
                var12 = class379.field5397;
            } else if (class43.field659 >= arg1) {
                var12 = arg1;
                var13 = arg4;
            } else {
                var13 = var9 + (class43.field659 * var8 >> 12);
                var12 = class43.field659;
            }
            if (var13 < class300.field4164) {
                var12 = (class300.field4164 - var9 << 12) / var8;
                var13 = class300.field4164;
            } else if (var13 > class398.field5827) {
                var13 = class398.field5827;
                var12 = (class398.field5827 - var9 << 12) / var8;
            }
            if (class300.field4164 > var11) {
                var10 = (class300.field4164 - var9 << 12) / var8;
                var11 = class300.field4164;
            } else if (class398.field5827 < var11) {
                var10 = (class398.field5827 - var9 << 12) / var8;
                var11 = class398.field5827;
            }
            class414.method2648(var11, arg2, var12, (byte) -114, var13, var10);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public static void method1378(int arg0) {
        field2857 = null;
        if (arg0 == 0) {
            field2861 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(IB)I")
    public static final int method1379(int arg0, byte arg1) {
        field2862++;
        if (arg1 <= 31) {
            field2857 = null;
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;BC)I")
    public static final int method1380(String arg0, byte arg1, char arg2) {
        field2856++;
        int var3 = 0;
        int var4 = arg0.length();
        if (arg1 != 29) {
            method1378(-11);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2 == arg0.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }
}
