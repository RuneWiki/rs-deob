import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class229 extends class122 {

    @OriginalMember(owner = "client!ck", name = "W", descriptor = "Lge;")
    public class146 field3786;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "Lqd;")
    public static class40 field3780 = class147.method1106("scrollbar", (byte) -49);

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "[Z")
    public static boolean[] field3778 = new boolean[100];

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "Lqd;")
    public static class40 field3777 = class147.method1106("Angreifen", (byte) -106);

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "Z")
    public static boolean field3784 = false;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "[I")
    public static int[] field3783;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIIIB)V", line = 8)
    public static final void method1601(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field3781++;
        if (arg3 < 128 || arg1 < 128 || arg3 > 13056 || arg1 > 13056) {
            class280.field4715 = -1;
            class46.field891 = -1;
            return;
        }
        int var8 = class293.method2012(class160.field2671, arg1, 0, arg3) - arg4;
        int var9 = arg3 - class238.field3922;
        int var10 = arg1 - class289.field4841;
        int var11 = var8 - class116.field1988;
        int var12 = class203.field3208[class58.field1107];
        int var13 = class203.field3208[class181.field2949];
        int var14 = class203.field3216[class58.field1107];
        if (arg7 != 82) {
            return;
        }
        int var15 = class203.field3216[class181.field2949];
        int var16 = var9 * var15 + var10 * var13 >> 16;
        int var17 = var10 * var15 - (var9 * var13) >> 16;
        int var19 = var11 * var14 - var12 * var17 >> 16;
        int var20 = var11 * var12 + var14 * var17 >> 16;
        if (var20 < 50) {
            class46.field891 = -1;
            class280.field4715 = -1;
        } else if (class21.field350) {
            int var22 = arg5 * 512 >> 8;
            class46.field891 = var19 * var22 / var20 + arg6;
            int var23 = arg2 * 512 >> 8;
            class280.field4715 = var16 * var23 / var20 + arg0;
        } else {
            class280.field4715 = arg0 + ((var16 << 9) / var20);
            class46.field891 = (var19 << 9) / var20 + arg6;
        }
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(I)V", line = 81)
    public static void method1602(int arg0) {
        field3780 = null;
        if (arg0 == 12546) {
            field3778 = null;
            field3783 = null;
            field3777 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ)I", line = 99)
    public static final int method1603(int arg0, boolean arg1) {
        field3782++;
        int var2 = 0;
        if (!arg1) {
            return 50;
        }
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return var2 + arg0;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIII)V", line = 152)
    public static final void method1604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3779++;
        int var6 = arg5 - arg4;
        if (arg1 != 1) {
            method1604(57, 62, -68, 62, -47, 118);
        }
        int var7 = arg2 - arg0;
        if (var7 == 0) {
            if (var6 != 0) {
                class87.method672(arg3, arg4, arg5, arg0, (byte) 112);
            }
        } else if (var6 == 0) {
            class85.method653(arg2, arg1 ^ 0xFFFFFFA1, arg4, arg0, arg3);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg0;
                arg0 = arg4;
                arg4 = var9;
                int var10 = arg2;
                arg2 = arg5;
                arg5 = var10;
            }
            if (arg2 < arg0) {
                int var11 = arg0;
                int var12 = arg4;
                arg4 = arg5;
                arg0 = arg2;
                arg2 = var11;
                arg5 = var12;
            }
            int var13 = arg4;
            int var14 = arg5 - arg4;
            int var15 = arg2 - arg0;
            int var16 = -(var15 >> 1);
            int var17 = arg4 < arg5 ? 1 : -1;
            if (var14 < 0) {
                var14 = -var14;
            }
            if (var8) {
                for (int var18 = arg0; var18 <= arg2; var18++) {
                    var16 += var14;
                    class37.field694[var18][var13] = arg3;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var15;
                    }
                }
            } else {
                for (int var19 = arg0; var19 <= arg2; var19++) {
                    class37.field694[var13][var19] = arg3;
                    var16 += var14;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var15;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lge;)V", line = 271)
    public class229(class146 arg0) {
        this.field3786 = arg0;
    }
}
