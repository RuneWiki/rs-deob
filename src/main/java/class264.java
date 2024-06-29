import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class264 {

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "[I")
    public static int[] field3753 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "J")
    public static long field3757 = 0L;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "Ldn;")
    public static class302 field3756;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method1756(int arg0, byte[] arg1, int arg2, int arg3) {
        field3754++;
        boolean var4 = true;
        class236 var5 = new class236(arg1);
        if (arg3 != 17934) {
            method1759(-24);
        }
        int var6 = -1;
        label72: while (true) {
            int var7 = var5.method1601(true);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class88 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method1594(-55);
                                        if (var17 == 0) {
                                            continue label72;
                                        }
                                        var5.method1574(-44);
                                    }
                                    int var10 = var5.method1594(-26);
                                    if (var10 == 0) {
                                        continue label72;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    int var12 = var8 >> 6 & 0x3F;
                                    var13 = var5.method1574(-38) >> 2;
                                    var14 = var12 + arg2;
                                    var15 = var11 + arg0;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (class176.field2403 - 1 <= var14);
                    } while ((class383.field5395 - 1) <= var15);
                    var16 = class374.method2382(var6, false);
                } while (var13 == 22 && !class332.field4706 && var16.field998 == 0 && var16.field1003 != 1 && !var16.field1073);
                var9 = true;
                if (!var16.method479(arg3 - 17813)) {
                    var4 = false;
                    class322.field4589++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
    public static void method1757(int arg0) {
        field3756 = null;
        if (arg0 != 128) {
            field3753 = null;
        }
        field3753 = null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1758(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 == arg8 && arg1 == arg2 && arg5 == arg9 && arg4 == arg6) {
            class323.method2106(arg9, arg7, arg4, false, arg1, arg8);
        } else {
            int var10 = arg8;
            int var11 = arg1;
            int var12 = arg8 * 3;
            int var13 = arg1 * 3;
            int var14 = arg3 * 3;
            int var15 = arg2 * 3;
            int var16 = arg5 * 3;
            int var17 = arg6 * 3;
            int var18 = arg9 - arg8 - (-var14 + var16);
            int var19 = arg4 - (arg1 - var15) - var17;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
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
                int var33 = (var27 + var31 + var29 >> 12) + arg8;
                int var34 = (var28 + var32 + var30 >> 12) + arg1;
                class323.method2106(var33, arg7, var34, false, var11, var10);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg0 <= -101) {
            field3755++;
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
    public static final void method1759(int arg0) {
        if (arg0 >= -91) {
            method1756(-94, (byte[]) null, -115, 110);
        }
        class72.field869 = 0;
        class22.field277 = 0;
        class152.field1884 = 0;
        class203.field2922 = 0;
        field3758++;
    }

    static {
        new class362("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
    }
}
