import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class295 extends class45 {

    @OriginalMember(owner = "client!il", name = "s", descriptor = "I")
    public int field4751;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public int field4748;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public static int field4750 = -1;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "I")
    public static int field4754 = -1;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "Ljava/lang/String;")
    public static String field4755 = "Unable to find ";

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "[[I")
    public static int[][] field4752;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V", line = 10)
    public static void method2120(boolean arg0) {
        field4755 = null;
        if (!arg0) {
            field4752 = (int[][]) ((int[][]) null);
        }
        field4752 = (int[][]) null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIBLth;)[Llb;", line = 23)
    public static final class341[] method2121(int arg0, int arg1, byte arg2, class57 arg3) {
        if (arg2 <= 118) {
            method2122(true, -64, -113, -14, 112, true, -62);
        }
        field4753++;
        return class315.method2233(arg1, (byte) 111, arg3, arg0) ? class56.method448((byte) 112) : null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZIIIIZI)V", line = 40)
    public static final void method2122(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg4 > arg2) {
            int var7 = (arg2 + arg4) / 2;
            int var8 = arg2;
            class201 var9 = class118.field1999[var7];
            class118.field1999[var7] = class118.field1999[arg4];
            class118.field1999[arg4] = var9;
            for (int var10 = arg2; var10 < arg4; var10++) {
                if (class20.method119(arg5, arg6, class118.field1999[var10], arg0, arg3, var9, (byte) 32) <= 0) {
                    class201 var11 = class118.field1999[var10];
                    class118.field1999[var10] = class118.field1999[var8];
                    class118.field1999[var8++] = var11;
                }
            }
            class118.field1999[arg4] = class118.field1999[var8];
            class118.field1999[var8] = var9;
            method2122(arg0, -26996, arg2, arg3, var8 - 1, arg5, arg6);
            method2122(arg0, -26996, var8 + 1, arg3, arg4, arg5, arg6);
        }
        if (arg1 == -26996) {
            field4749++;
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(II)V", line = 83)
    public class295(int arg0, int arg1) {
        this.field4751 = arg0;
        this.field4748 = arg1;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIZI)V", line = 100)
    public static final void method2123(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field4747++;
        if (arg0 < 1) {
            arg0 = 1;
        }
        if (~arg2 > arg3) {
            arg2 = 1;
        }
        if (class42.field607) {
            int var6 = arg0 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = class65.field1151 + ((class87.field1497 - class65.field1151) * var6 / 100);
            if (var7 < class94.field1587) {
                var7 = class94.field1587;
            } else if (var7 > class172.field2745) {
                var7 = class172.field2745;
            }
            int var8 = arg0 * var7 * 512 / (arg2 * 334);
            if (class198.field3167 > var8) {
                short var12 = class198.field3167;
                var7 = arg2 * var12 * 334 / (arg0 * 512);
                if (class172.field2745 < var7) {
                    var7 = class172.field2745;
                    int var13 = var7 * 512 * arg0 / (var12 * 334);
                    int var14 = (arg2 - var13) / 2;
                    if (arg4) {
                        class244.method1863();
                        class244.method1862(arg1, arg5, var14, arg0, 0);
                        class244.method1862(arg2 + arg1 - var14, arg5, var14, arg0, 0);
                    }
                    arg1 += var14;
                    arg2 -= var14 * 2;
                }
            } else if (var8 > class78.field1350) {
                short var9 = class78.field1350;
                var7 = arg2 * var9 * 334 / (arg0 * 512);
                if (var7 < class94.field1587) {
                    var7 = class94.field1587;
                    int var10 = arg2 * 334 * var9 / (var7 * 512);
                    int var11 = (arg0 - var10) / 2;
                    if (arg4) {
                        class244.method1863();
                        class244.method1862(arg1, arg5, arg2, var11, 0);
                        class244.method1862(arg1, arg5 + arg0 - var11, arg2, var11, 0);
                    }
                    arg0 -= var11 * 2;
                    arg5 += var11;
                }
            }
            class308.field4916 = arg0 * var7 / 334;
        }
        class169.field2686 = arg5;
        class117.field1974 = arg1;
        class254.field4294 = (short) arg2;
        class118.field1984 = (short) arg0;
    }
}
