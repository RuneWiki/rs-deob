import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class223 {

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3552 = "red:";

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "[I")
    public static int[] field3559 = new int[500];

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field3558 = -1;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Lvf;")
    public static class30 field3554;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "[I")
    public static int[] field3561;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "[Lbf;")
    public static class102[] field3555;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZIZJI)Ljava/lang/String;")
    public static final String method1498(boolean arg0, int arg1, boolean arg2, long arg3, int arg4) {
        char var6 = ',';
        field3560++;
        boolean var7 = false;
        if (!arg2) {
            method1501(-74, -102, -54, 91, 42, true, -66);
        }
        if (arg3 < 0L) {
            var7 = true;
            arg3 = -arg3;
        }
        StringBuffer var8 = new StringBuffer(26);
        char var9 = '.';
        if (arg1 == 0) {
            var6 = '.';
            var9 = ',';
        }
        if (arg1 == 2) {
            var9 = ' ';
        }
        if (arg4 > 0) {
            for (int var10 = 0; var10 < arg4; var10++) {
                int var11 = (int) arg3;
                arg3 /= 10L;
                var8.append((char) (var11 + 48 - ((int) arg3 * 10)));
            }
            var8.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg3;
            arg3 /= 10L;
            var8.append((char) (var13 + 48 - ((int) arg3 * 10)));
            if (arg3 == 0L) {
                if (var7) {
                    var8.append('-');
                }
                return var8.reverse().toString();
            }
            if (arg0) {
                var12++;
                if ((var12 % 3) == 0) {
                    var8.append(var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static final void method1499(int arg0) {
        while (true) {
            if (class143.field2360.method613(-93, class222.field3547) >= 27) {
                int var1 = class143.field2360.method612(15, -124);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class3.field45[var1] == null) {
                        class3.field45[var1] = new class139();
                        var2 = true;
                    }
                    class139 var3 = class3.field45[var1];
                    class287.field4587[class7.field88++] = var1;
                    var3.field2846 = class207.field3336;
                    if (var3.field2321 != null && var3.field2321.method1197(0)) {
                        class6.method32(var3, false);
                    }
                    var3.method1038(arg0 - 17578, class128.method932(arg0 + -2074, class143.field2360.method612(14, -127)));
                    int var4 = class143.field2360.method612(1, -122);
                    int var5 = class242.field3835[class143.field2360.method612(3, -128)];
                    if (var2) {
                        var3.field2893 = var3.field2831 = var5;
                    }
                    int var6 = class143.field2360.method612(5, -121);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = class143.field2360.method612(1, -125);
                    if (var7 == 1) {
                        class200.field3251[class254.field4039++] = var1;
                    }
                    int var8 = class143.field2360.method612(5, -125);
                    var3.method1229((byte) 8, var3.field2321.field2682);
                    var3.field2835 = var3.field2321.field2702;
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.field2891 = var3.field2321.field2724;
                    if (var3.field2891 == 0) {
                        var3.field2831 = 0;
                    }
                    var3.method1220((byte) -48, var4 == 1, class48.field878.field2844[0] + var8, var3.method1226((byte) -92), class48.field878.field2813[0] + var6);
                    if (var3.field2321.method1197(0)) {
                        class255.method1707((class248) null, var3, (class213) null, (byte) 79, class92.field1448, var3.field2844[0], var3.field2813[0], 0);
                    }
                    continue;
                }
            }
            if (arg0 != 2013) {
                field3555 = null;
            }
            class143.field2360.method605((byte) -115);
            field3556++;
            return;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V")
    public static void method1500(boolean arg0) {
        field3555 = null;
        field3559 = null;
        if (!arg0) {
            field3552 = null;
        }
        field3554 = null;
        field3552 = null;
        field3561 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method1501(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class23.field364 = arg1;
        if (arg6 != -101) {
            return;
        }
        class67.field1146 = arg0;
        class11.field147 = arg3;
        class291.field4632 = arg2;
        field3563++;
        class171.field2845 = arg4;
        if (arg5 && class23.field364 >= 100) {
            class148.field2434 = class67.field1146 * 128 + 64;
            class31.field527 = class11.field147 * 128 + 64;
            class150.field2457 = class218.method1450(class148.field2434, class31.field527, true, class92.field1448) - class171.field2845;
        }
        class184.field3033 = 2;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public static final void method1502(byte arg0) {
        field3562++;
        if (class239.field3776 == -1 || class22.field334 == -1) {
            return;
        }
        int var1 = ((class194.field3172 - class38.field675) * class100.field1519 >> 16) + class38.field675;
        int var2 = -78 / ((arg0 + 30) / 58);
        class100.field1519 += var1;
        float[] var3 = new float[3];
        if (class100.field1519 < 65535) {
            class138.field2315 = false;
            class174.field2930 = false;
        } else {
            class100.field1519 = 65535;
            if (class138.field2315) {
                class174.field2930 = false;
            } else {
                class174.field2930 = true;
            }
            class138.field2315 = true;
        }
        float var4 = (float) class100.field1519 / 65535.0F;
        int var5 = class23.field367 * 2;
        for (int var6 = 0; var6 < 3; var6++) {
            int var22 = class297.field4692[class239.field3776][var5][var6] * 3;
            int var23 = (class297.field4692[class239.field3776][var5 + 2][var6] - (class297.field4692[class239.field3776][var5 + 3][var6] - class297.field4692[class239.field3776][var5 + 2][var6])) * 3;
            int var24 = class297.field4692[class239.field3776][var5 + 1][var6] * 3;
            int var25 = class297.field4692[class239.field3776][var5][var6];
            int var26 = var24 - var22;
            int var27 = var24 + class297.field4692[class239.field3776][var5 + 2][var6] - var25 - var23;
            int var28 = var22 - (var24 * 2 - var23);
            var3[var6] = (((float) var27 * var4 + (float) var28) * var4 + (float) var26) * var4 + (float) var25;
        }
        class150.field2457 = (int) var3[1] * -1;
        class31.field527 = (int) var3[0] - (class256.field4082 * 128);
        class148.field2434 = (int) var3[2] - (class170.field2787 * 128);
        float[] var7 = new float[3];
        int var8 = class289.field4614 * 2;
        for (int var9 = 0; var9 < 3; var9++) {
            int var15 = class297.field4692[class22.field334][var8][var9] * 3;
            int var16 = (class297.field4692[class22.field334][var8 + 2][var9] + class297.field4692[class22.field334][var8 + 2][var9] - class297.field4692[class22.field334][var8 + 3][var9]) * 3;
            int var17 = class297.field4692[class22.field334][var8 + 1][var9] * 3;
            int var18 = var17 - var15;
            int var19 = class297.field4692[class22.field334][var8][var9];
            int var20 = class297.field4692[class22.field334][var8 + 2][var9] + var17 - var19 - var16;
            int var21 = var15 + var16 - (var17 * 2);
            var7[var9] = (((float) var20 * var4 + (float) var21) * var4 + (float) var18) * var4 + (float) var19;
        }
        float var10 = var7[0] - var3[0];
        float var11 = (var7[1] - var3[1]) * -1.0F;
        float var12 = var7[2] - var3[2];
        double var13 = Math.sqrt((double) (var10 * var10 + var12 * var12));
        class48.field886 = (float) Math.atan2((double) var11, var13);
        class232.field3673 = -((float) Math.atan2((double) var10, (double) var12));
        class212.field3400 = (int) ((double) class232.field3673 * 325.949D) & 0x7FF;
        class146.field2408 = (int) ((double) class48.field886 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIII)I")
    public static final int method1503(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 95 % ((-arg1 - 34) / 43);
        field3553++;
        if (arg3 > 243) {
            arg0 >>= 0x4;
        } else if (arg3 > 217) {
            arg0 >>= 0x3;
        } else if (arg3 > 192) {
            arg0 >>= 0x2;
        } else if (arg3 > 179) {
            arg0 >>= 0x1;
        }
        return (arg2 >> 2 << 10) + (arg0 >> 5 << 7) + (arg3 >> 1);
    }
}
