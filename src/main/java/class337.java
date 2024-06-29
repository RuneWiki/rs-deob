import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class337 extends class172 {

    @OriginalMember(owner = "client!mt", name = "C", descriptor = "Ljava/lang/Object;")
    private Object field4826;

    @OriginalMember(owner = "client!mt", name = "v", descriptor = "[I")
    public static int[] field4819 = new int[1];

    @OriginalMember(owner = "client!mt", name = "w", descriptor = "Lig;")
    public static class206 field4820 = new class206(70, 28);

    @OriginalMember(owner = "client!mt", name = "t", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!mt", name = "u", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!mt", name = "x", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!mt", name = "y", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!mt", name = "z", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!mt", name = "A", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!mt", name = "B", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!mt", name = "D", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!mt", name = "E", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lrt;I)V", line = 4)
    public static final void method2176(class194 arg0, int arg1) {
        field4818++;
        if (arg1 != 128) {
            method2179(-106);
        }
        if ((arg0.field2622.length - arg0.field2610) < 1) {
            return;
        }
        int var2 = arg0.method1177(arg1 + 127);
        if (var2 < 0 || var2 > 1 || arg0.field2622.length - arg0.field2610 < 2) {
            return;
        }
        int var3 = arg0.method1220(-119);
        if (arg0.field2622.length - arg0.field2610 < var3 * 6) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method1220(arg1 ^ 0xF8);
            int var6 = arg0.method1178(-230315992);
            if (class285.field3942.length > var5 && class144.field1760[var5] && (class640.field9231.method910((byte) -94, var5).field6150 != '1' || var6 >= -1 && var6 <= 1)) {
                class285.field3942[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(III)B", line = 53)
    public static final byte method2177(int arg0, int arg1, int arg2) {
        field4817++;
        if (arg1 != 10299) {
            field4821 = 69;
        }
        if (arg2 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(Z)Ljava/lang/Object;", line = 74)
    public final Object method988(boolean arg0) {
        field4823++;
        if (!arg0) {
            method2176(null, -7);
        }
        return this.field4826;
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 86)
    public class337(Object arg0, int arg1) {
        super(arg1);
        this.field4826 = arg0;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lkm;I)I", line = 97)
    public static final int method2178(class299 arg0, int arg1) {
        field4827++;
        if (arg1 != -2) {
            field4820 = null;
        }
        if (class83.field935 == arg0) {
            return 5890;
        } else if (class242.field3434 == arg0) {
            return 34167;
        } else if (class577.field8332 == arg0) {
            return 34168;
        } else if (class173.field2123 == arg0) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)I", line = 124)
    public static final int method2179(int arg0) {
        field4824++;
        return arg0 >= -32 ? -126 : class434.field6442;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIIIIIBI)V", line = 140)
    public static final void method2180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field4822++;
        if (arg2 == arg4 && arg7 == arg9 && arg1 == arg3 && arg0 == arg6) {
            class289.method1871(arg5, arg2, arg7, 205, arg0, arg1);
        } else {
            int var10 = arg2;
            int var11 = arg7;
            int var12 = arg2 * 3;
            int var13 = arg7 * 3;
            int var14 = arg4 * 3;
            int var15 = arg9 * 3;
            int var16 = arg3 * 3;
            int var17 = arg6 * 3;
            int var18 = var14 + arg1 - var16 - arg2;
            int var19 = arg0 + var15 - var17 - arg7;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var29 + var31 + var27 >> 12) + arg2;
                int var34 = (var30 + var32 + var28 >> 12) + arg7;
                class289.method1871(arg5, var10, var11, 205, var34, var33);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg8 != -33) {
            method2177(122, 38, 68);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)Z", line = 216)
    public final boolean method991(byte arg0) {
        field4828++;
        return arg0 > -52;
    }

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "(I)V", line = 233)
    public static void method2181(int arg0) {
        field4819 = null;
        field4820 = null;
        if (arg0 != -1004911764) {
            field4819 = null;
        }
    }
}
