import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class247 {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Z")
    public static boolean field4392 = false;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Lsg;")
    public static class30 field4400 = class167.method1221((byte) 33, "<img=1>");

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "[I")
    public static int[] field4395 = new int[32];

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Z")
    public static boolean field4402 = false;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "[J")
    public static long[] field4403 = new long[1000];

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lva;")
    public static class120 field4394;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZZ[BI[Lue;)V")
    public static final void method1733(int arg0, boolean arg1, boolean arg2, byte[] arg3, int arg4, class13[] arg5) {
        int var6 = -1;
        class8 var7 = new class8(arg3);
        if (arg1) {
            method1737(82);
        }
        while (true) {
            int var8 = var7.method55((byte) -112);
            if (var8 == 0) {
                field4397++;
                return;
            }
            var6 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var7.method45(false);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = (var9 & 0xFF2) >> 6;
                int var14 = var7.method63((byte) 77);
                int var15 = var14 >> 2;
                int var16 = var14 & 0x3;
                int var17 = arg0 + var13;
                int var18 = arg4 + var11;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class13 var19 = null;
                    if (!arg2) {
                        int var20 = var12;
                        if ((class272.field4771[1][var17][var18] & 0x2) == 2) {
                            var20 = var12 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg5[var20];
                        }
                    }
                    class255.method1774(var19, var16, var12, var17, !arg2, true, var6, arg2, var15, var18, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1734(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)Z")
    public static final boolean method1735(int arg0) {
        field4398++;
        if (class40.field991) {
            try {
                class125.field2447.method294(class190.field3452.field1449, 0);
                return true;
            } catch (Throwable var2) {
            }
        }
        int var1 = 19 / ((arg0 - 59) / 57);
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static final void method1736(byte arg0) {
        field4393++;
        int var1 = -58 / ((63 - arg0) / 54);
        for (int var2 = 0; var2 < 100; var2++) {
            class14.field288[var2] = true;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public static void method1737(int arg0) {
        if (arg0 != 1) {
            method1735(13);
        }
        field4395 = null;
        field4400 = null;
        field4403 = null;
        field4394 = null;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
    public static final void method1738(int arg0) {
        field4401++;
        if (class110.field2204 == 5 && arg0 == 30313) {
            class110.field2204 = 6;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V")
    public static final void method1739(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class182.field3347; var3++) {
            for (int var4 = 0; var4 < class209.field3759; var4++) {
                for (int var5 = 0; var5 < class44.field1050; var5++) {
                    class195 var6 = class71.field1613[var3][var4][var5];
                    if (var6 != null) {
                        class225 var7 = var6.field3532;
                        if (var7 != null && var7.field4031.method192()) {
                            class22.method204(var7.field4031, var3, var4, var5, 1, 1);
                            if (var7.field4029 != null && var7.field4029.method192()) {
                                class22.method204(var7.field4029, var3, var4, var5, 1, 1);
                                var7.field4031.method196(var7.field4029, 0, 0, 0, false);
                                var7.field4029 = var7.field4029.method193(arg0, arg1, arg2);
                            }
                            var7.field4031 = var7.field4031.method193(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field3522; var8++) {
                            class35 var10 = var6.field3540[var8];
                            if (var10 != null && var10.field857.method192()) {
                                class22.method204(var10.field857, var3, var4, var5, var10.field844 + 1 - var10.field854, var10.field853 - var10.field856 + 1);
                                var10.field857 = var10.field857.method193(arg0, arg1, arg2);
                            }
                        }
                        class104 var9 = var6.field3541;
                        if (var9 != null && var9.field2089.method192()) {
                            class272.method1857(var9.field2089, var3, var4, var5);
                            var9.field2089 = var9.field2089.method193(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }
}
