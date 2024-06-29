import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class179 extends class29 {

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "Ljava/lang/String;")
    public static String field2896 = "Loading world list data";

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "I")
    public int field2888;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
    public int field2889;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "I")
    public int field2897;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "Ljava/lang/String;")
    public String field2898;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V", line = 6)
    public final void method1239(boolean arg0) {
        if (!arg0) {
            this.method1239(true);
        }
        this.field416 = class304.method2128((byte) -83) + 500L | this.field416 & Long.MIN_VALUE;
        class218.field3505.method2279(this, (byte) -95);
        field2886++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BIIIIII)V", line = 21)
    public static final void method1240(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2887++;
        class66.method436(arg1, (byte) -104);
        int var7 = 0;
        if (arg0 != -37) {
            field2891 = -37;
        }
        int var8 = arg1 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        int var10 = -arg1;
        int var11 = var8;
        int var12 = -1;
        int var13 = -1;
        int var14 = -var8;
        if (arg5 >= class233.field3721 && arg5 <= class235.field3735) {
            int[] var15 = class310.field4841[arg5];
            int var16 = class235.method1685(arg6 - arg1, class231.field3697, class224.field3575, 119);
            int var17 = class235.method1685(arg6 + arg1, class231.field3697, class224.field3575, arg0 ^ 0xFFFFFFAD);
            int var18 = class235.method1685(arg6 - var8, class231.field3697, class224.field3575, 105);
            int var19 = class235.method1685(arg6 + var8, class231.field3697, class224.field3575, 103);
            class245.method1738(48, var15, var18, var16, arg3);
            class245.method1738(arg0 ^ 0xFFFFFFEB, var15, var19, var18, arg4);
            class245.method1738(arg0 + 85, var15, var17, var19, arg3);
        }
        while (var7 < var9) {
            var12 += 2;
            var13 += 2;
            var14 += var13;
            if (var14 >= 0 && var11 >= 1) {
                var11--;
                class80.field1224[var11] = var7;
                var14 -= var11 << 1;
            }
            var10 += var12;
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg5 - var9;
                int var21 = arg5 + var9;
                if (var21 >= class233.field3721 && var20 <= class235.field3735) {
                    if (var8 <= var9) {
                        int var22 = class235.method1685(arg6 + var7, class231.field3697, class224.field3575, 119);
                        int var23 = class235.method1685(arg6 - var7, class231.field3697, class224.field3575, 121);
                        if (var21 <= class235.field3735) {
                            class245.method1738(48, class310.field4841[var21], var22, var23, arg3);
                        }
                        if (var20 >= class233.field3721) {
                            class245.method1738(48, class310.field4841[var20], var22, var23, arg3);
                        }
                    } else {
                        int var24 = class80.field1224[var9];
                        int var25 = class235.method1685(arg6 + var7, class231.field3697, class224.field3575, 111);
                        int var26 = class235.method1685(arg6 - var7, class231.field3697, class224.field3575, arg0 ^ 0xFFFFFFB7);
                        int var27 = class235.method1685(arg6 + var24, class231.field3697, class224.field3575, 117);
                        int var28 = class235.method1685(arg6 - var24, class231.field3697, class224.field3575, 107);
                        if (class235.field3735 >= var21) {
                            int[] var29 = class310.field4841[var21];
                            class245.method1738(48, var29, var28, var26, arg3);
                            class245.method1738(48, var29, var27, var28, arg4);
                            class245.method1738(48, var29, var25, var27, arg3);
                        }
                        if (class233.field3721 <= var20) {
                            int[] var30 = class310.field4841[var20];
                            class245.method1738(arg0 ^ 0xFFFFFFEB, var30, var28, var26, arg3);
                            class245.method1738(48, var30, var27, var28, arg4);
                            class245.method1738(48, var30, var25, var27, arg3);
                        }
                    }
                }
            }
            int var31 = arg5 - var7;
            int var32 = arg5 + var7;
            if (class233.field3721 <= var32 && class235.field3735 >= var31) {
                int var33 = arg6 + var9;
                int var34 = arg6 - var9;
                if (var33 >= class224.field3575 && class231.field3697 >= var34) {
                    int var35 = class235.method1685(var33, class231.field3697, class224.field3575, 101);
                    int var36 = class235.method1685(var34, class231.field3697, class224.field3575, 126);
                    if (var7 >= var8) {
                        if (class235.field3735 >= var32) {
                            class245.method1738(arg0 ^ 0xFFFFFFEB, class310.field4841[var32], var35, var36, arg3);
                        }
                        if (class233.field3721 <= var31) {
                            class245.method1738(48, class310.field4841[var31], var35, var36, arg3);
                        }
                    } else {
                        int var37 = var11 >= var7 ? var11 : class80.field1224[var7];
                        int var38 = class235.method1685(arg6 + var37, class231.field3697, class224.field3575, 115);
                        int var39 = class235.method1685(arg6 - var37, class231.field3697, class224.field3575, 116);
                        if (var32 <= class235.field3735) {
                            int[] var40 = class310.field4841[var32];
                            class245.method1738(arg0 + 85, var40, var39, var36, arg3);
                            class245.method1738(48, var40, var38, var39, arg4);
                            class245.method1738(48, var40, var35, var38, arg3);
                        }
                        if (class233.field3721 <= var31) {
                            int[] var41 = class310.field4841[var31];
                            class245.method1738(48, var41, var39, var36, arg3);
                            class245.method1738(48, var41, var38, var39, arg4);
                            class245.method1738(48, var41, var35, var38, arg3);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)V", line = 206)
    public static final void method1241(int arg0) {
        if (arg0 == -5280) {
            field2890++;
            class283.field4467.method1623(1);
        }
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(B)V", line = 217)
    public final void method1242(byte arg0) {
        this.field416 |= Long.MIN_VALUE;
        field2893++;
        if (this.method1244(-59) == 0L) {
            class35.field467.method2279(this, (byte) -72);
        }
        int var2 = -88 / ((arg0 - 12) / 38);
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V", line = 230)
    public static void method1243(int arg0) {
        if (arg0 == 24608) {
            field2896 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)J", line = 246)
    public final long method1244(int arg0) {
        field2894++;
        return arg0 >= -30 ? 96L : this.field416 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "(I)I", line = 258)
    public final int method1245(int arg0) {
        if (arg0 != 0) {
            this.method1245(-47);
        }
        field2895++;
        return (int) this.field916;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(Z)I", line = 272)
    public final int method1246(boolean arg0) {
        if (arg0) {
            field2892++;
            return (int) (this.field916 >>> 32 & 0xFFL);
        } else {
            return -36;
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(II)V", line = 287)
    public class179(int arg0, int arg1) {
        this.field916 = (long) arg0 << 32 | (long) arg1;
    }
}
