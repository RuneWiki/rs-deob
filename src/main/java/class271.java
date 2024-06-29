import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class271 {

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "Lfj;")
    public static class274 field4362 = new class274(new byte[5000]);

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "F")
    public static float field4364 = 0.0F;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field4366 = 0;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "Z")
    public static boolean field4369 = false;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field4370 = 1;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "F")
    public static float field4363;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "Loc;")
    public static class63 field4368;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static final void method1797(int arg0) {
        if (arg0 != 64) {
            field4370 = 26;
        }
        field4361++;
        if (class48.field715) {
            class48.field715 = false;
            class287.field4641 = null;
            class148.field2373 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1798(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = -119 % ((44 - arg6) / 37);
        if (arg4 == arg9 && arg0 == arg7 && arg2 == arg3 && arg5 == arg8) {
            class91.method636(arg7, arg3, arg1, (byte) -118, arg9, arg5);
        } else {
            int var11 = arg9;
            int var12 = arg7;
            int var13 = arg9 * 3;
            int var14 = arg4 * 3;
            int var15 = arg7 * 3;
            int var16 = arg0 * 3;
            int var17 = arg2 * 3;
            int var18 = arg8 * 3;
            int var19 = arg3 + var14 - var17 - arg9;
            int var20 = var17 + var13 - var14 - var14;
            int var21 = var15 + var18 - var16 - var16;
            int var22 = arg5 + var16 - var18 - arg7;
            int var23 = var16 - var15;
            int var24 = var14 - var13;
            for (int var25 = 128; var25 <= 4096; var25 += 128) {
                int var26 = var25 * var25 >> 12;
                int var27 = var25 * var26 >> 12;
                int var28 = var19 * var27;
                int var29 = var22 * var27;
                int var30 = var20 * var26;
                int var31 = var24 * var25;
                int var32 = var23 * var25;
                int var33 = var21 * var26;
                int var34 = (var32 + var33 + var29 >> 12) + arg7;
                int var35 = (var28 - (-var30 - var31) >> 12) + arg9;
                class91.method636(var12, var35, arg1, (byte) -118, var11, var34);
                var12 = var34;
                var11 = var35;
            }
        }
        field4358++;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
    public static void method1799(int arg0) {
        field4368 = null;
        field4362 = null;
        if (arg0 != 15189) {
            field4363 = 1.1017256F;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lvb;B)V")
    public static final void method1800(class62 arg0, byte arg1) {
        field4359++;
        if (arg1 > -44) {
            method1797(-30);
        }
        if (class274.field4472 == arg0.field967 || arg0.field900 == -1 || arg0.field973 != 0 || (arg0.field951 + 1) > class159.method1085((byte) -63, arg0.field900).field1452[arg0.field934]) {
            int var2 = arg0.field967 - arg0.field912;
            int var3 = class274.field4472 - arg0.field912;
            int var4 = arg0.field960 * 128 + arg0.method101(false) * 64;
            int var5 = arg0.field985 * 128 + arg0.method101(false) * 64;
            int var6 = arg0.field989 * 128 + arg0.method101(false) * 64;
            int var7 = arg0.field928 * 128 + (arg0.method101(false) * 64);
            arg0.field994 = ((var2 - var3) * var4 + (var3 * var6)) / var2;
            arg0.field929 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        if (arg0.field953 == 0) {
            arg0.field963 = 1024;
        }
        if (arg0.field953 == 1) {
            arg0.field963 = 1536;
        }
        if (arg0.field953 == 2) {
            arg0.field963 = 0;
        }
        arg0.field931 = 0;
        if (arg0.field953 == 3) {
            arg0.field963 = 512;
        }
        arg0.field954 = arg0.field963;
    }
}
