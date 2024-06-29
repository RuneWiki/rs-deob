import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public abstract class class303 extends class455 {

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "[Lg;")
    public static class109[] field4580 = new class109[8];

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
    public int field4578;

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!rp", name = "m", descriptor = "I")
    public int field4583;

    @OriginalMember(owner = "client!rp", name = "n", descriptor = "I")
    public int field4584;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "Z")
    public boolean field4577;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "(I)Z", line = 4)
    public final boolean method17(int arg0) {
        field4581++;
        return arg0 == 13651334 ? false : false;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIBII)I", line = 18)
    public static final int method1946(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = -13 % ((-arg2 - 28) / 50);
        field4576++;
        int var6 = 65536 - class281.field4279[arg3 * 8192 / arg4] >> 1;
        return ((65536 - var6) * arg1 >> 16) + (arg0 * var6 >> 16);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Z)V", line = 31)
    public final void method21(boolean arg0) {
        field4579++;
        if (arg0) {
            this.field4578 = 35;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lcg;IIII)V", line = 44)
    public static final void method1947(class93 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class175.method1170(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class497.field7147) {
            class175.method1170(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class175.method1170(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class385.field5799) {
            class175.method1170(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class385.field5799) {
            class175.method1170(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class497.field7147 && arg4 <= class385.field5799) {
            class175.method1170(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class175.method1170(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class497.field7147 && arg4 > 0) {
            class175.method1170(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IILya;ILor;IZ)V", line = 97)
    public final void method23(int arg0, int arg1, class38 arg2, int arg3, class455 arg4, int arg5, boolean arg6) {
        field4582++;
        if (arg0 != 3) {
            method1947(null, 0, -39, -126, 14);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIB)V", line = 112)
    public static final void method1948(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field4575++;
        int var5 = 0;
        if (arg4 > -1) {
            return;
        }
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        int var9 = class385.method2403(class184.field2777, class327.field4931, arg1 + arg2, true);
        int var10 = class385.method2403(class184.field2777, class327.field4931, arg1 - arg2, true);
        class359.method2255((byte) -126, class416.field6200[arg0], var9, var10, arg3);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg0 - var6;
                int var12 = arg0 + var6;
                if (class404.field5987 <= var12 && var11 <= class433.field6414) {
                    int var13 = class385.method2403(class184.field2777, class327.field4931, arg1 + var5, true);
                    int var14 = class385.method2403(class184.field2777, class327.field4931, arg1 - var5, true);
                    if (var12 <= class433.field6414) {
                        class359.method2255((byte) -122, class416.field6200[var12], var13, var14, arg3);
                    }
                    if (var11 >= class404.field5987) {
                        class359.method2255((byte) -80, class416.field6200[var11], var13, var14, arg3);
                    }
                }
            }
            var5++;
            int var15 = arg0 - var5;
            int var16 = arg0 + var5;
            if (var16 >= class404.field5987 && var15 <= class433.field6414) {
                int var17 = class385.method2403(class184.field2777, class327.field4931, arg1 + var6, true);
                int var18 = class385.method2403(class184.field2777, class327.field4931, arg1 - var6, true);
                if (class433.field6414 >= var16) {
                    class359.method2255((byte) -97, class416.field6200[var16], var17, var18, arg3);
                }
                if (class404.field5987 <= var15) {
                    class359.method2255((byte) -115, class416.field6200[var15], var17, var18, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V", line = 186)
    public static void method1949(byte arg0) {
        field4580 = null;
        if (arg0 > -6) {
            method1949((byte) -18);
        }
    }
}
