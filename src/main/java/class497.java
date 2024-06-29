import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class497 extends class11 {

    @OriginalMember(owner = "client!ip", name = "K", descriptor = "Ldi;")
    public static class83 field7243 = new class83(13, 3);

    @OriginalMember(owner = "client!ip", name = "G", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!ip", name = "I", descriptor = "I")
    public static int field7241;

    @OriginalMember(owner = "client!ip", name = "J", descriptor = "I")
    public static int field7242;

    @OriginalMember(owner = "client!ip", name = "L", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!ip", name = "M", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!ip", name = "N", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!ip", name = "O", descriptor = "Lmg;")
    public static class101 field7247;

    @OriginalMember(owner = "client!ip", name = "P", descriptor = "Lne;")
    public static class208 field7248;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "(II)[I", line = 3)
    public final int[] method44(int arg0, int arg1) {
        ++field7240;
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (arg0 > -42) {
            field7243 = null;
        }
        if (super.field158.field2966) {
            class91.method681(var3, 0, class90.field1316, class328.field4484[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZC)Z", line = 26)
    public static final boolean method2900(boolean arg0, char arg1) {
        if (!arg0) {
            method2904(-99, -45, 75, 56, -23, -65, (byte) -57);
        }
        ++field7245;
        return ~arg1 == -161 || ~arg1 == -33 || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(III)V", line = 40)
    public static final void method2901(int arg0, int arg1, int arg2) {
        if (arg0 < 79) {
            method2902((byte) -119);
        }
        ++field7242;
        class373 var3 = class267.field3695[arg1][arg2];
        if (var3 != null) {
            class360.field5256 = var3.field5473;
            class331.field4496 = var3.field5466;
            class48.field574 = var3.field5471;
        }
        class490.method2871(-1475793664);
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(B)V", line = 61)
    public static void method2902(byte arg0) {
        field7247 = null;
        field7243 = null;
        if (arg0 == -62) {
            field7248 = null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "()V", line = 73)
    public class497() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I[IIIIIIB)V", line = 76)
    public static final void method2903(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        ++field7246;
        if (arg5 > 0 && !class226.method1402(arg5, (byte) -123)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class226.method1402(arg2, (byte) -101)) {
            throw new IllegalArgumentException("");
        } else if (arg6 != 32993) {
            throw new IllegalArgumentException("");
        } else {
            int var8 = 0;
            int var9 = ~arg5 > ~arg2 ? arg5 : arg2;
            int var10 = arg5 >> 1;
            int var11 = arg2 >> 1;
            int[] var12 = arg1;
            int[] var13 = new int[var10 * var11];
            if (arg7 >= 80) {
                while (true) {
                    OpenGL.glTexImage2Di(arg3, var8, arg4, arg5, arg2, 0, arg6, arg0, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = arg5 + var15;
                    for (int var17 = 0; ~var17 > ~var11; ++var17) {
                        for (int var19 = 0; var10 > var19; ++var19) {
                            int var20 = var12[var15++];
                            int var21 = var12[var16++];
                            int var22 = var12[var15++];
                            int var23 = var20 >> 24 & 255;
                            int var24 = 255 & var20 >> 16;
                            int var25 = var12[var16++];
                            int var26 = var20 & 255;
                            int var27 = (65440 & var20) >> 8;
                            int var28 = (var22 & 255) + var26;
                            int var29 = ((16758646 & var22) >> 16) + var24;
                            int var30 = ((65448 & var22) >> 8) + var27;
                            int var31 = (var22 >> 24 & 255) + var23;
                            int var32 = ((65491 & var21) >> 8) + var30;
                            int var33 = (var21 & 255) + var28;
                            int var34 = ((var21 & 16732388) >> 16) + var29;
                            int var35 = (var21 >> 24 & 255) + var31;
                            int var36 = (255 & var25 >> 24) + var35;
                            int var37 = ((16721919 & var25) >> 16) + var34;
                            int var38 = (255 & var25) + var33;
                            int var39 = (var25 >> 8 & 255) + var32;
                            var13[var14++] = class255.method1532(class251.method1501(var38, 1020) >> 2, class255.method1532(class251.method1501(65280, var39 << 6), class255.method1532(class251.method1501(var37 << 14, 16711680), class251.method1501(var36 << 22, -16777216))));
                        }
                        var16 += arg5;
                        var15 += arg5;
                    }
                    int[] var18 = var13;
                    var13 = var12;
                    arg5 = var10;
                    var12 = var18;
                    arg2 = var11;
                    var10 >>= 1;
                    var9 >>= 1;
                    var11 >>= 1;
                    ++var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIIB)Lmh;", line = 198)
    public static final class444 method2904(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        ++field7241;
        long var7 = (long) arg4 * 76724863L ^ (long) arg5 * 986053L ^ (long) arg2 * 475427L ^ (long) arg0 * 67481L ^ (long) arg3 * 97549L ^ (long) arg1 * 32147369L;
        class444 var9 = (class444) class400.field5877.method1073(var7, false);
        if (var9 != null) {
            return var9;
        } else {
            if (arg6 >= -42) {
                method2904(38, -62, -46, 35, 123, 18, (byte) -46);
            }
            class444 var10 = class485.field7085.method303(arg0, arg3, arg2, arg5, arg1, arg4);
            class400.field5877.method1072(var7, var10, false);
            return var10;
        }
    }
}
