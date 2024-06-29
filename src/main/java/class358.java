import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class358 {

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field5478 = 0;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "[Lvk;")
    public static class209[] field5482 = new class209[14];

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field5481 = 0;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field5486 = -1;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5487 = "flash3:";

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 4)
    public static void method2479(int arg0) {
        field5487 = null;
        if (arg0 != 0) {
            method2483(false, -6, (class359) null, -126);
        }
        field5482 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 25)
    public static final void method2480(byte arg0) {
        field5479++;
        if (class261.field3949 == -1 || class174.field2507 == -1) {
            return;
        }
        int var1 = ((class177.field2535 - class160.field2311) * class296.field4449 >> 16) + class160.field2311;
        class296.field4449 += var1;
        if (class296.field4449 >= 65535) {
            if (class112.field1626) {
                class148.field2124 = false;
            } else {
                class148.field2124 = true;
            }
            class112.field1626 = true;
            class296.field4449 = 65535;
        } else {
            class148.field2124 = false;
            class112.field1626 = false;
        }
        int var2 = class75.field1099 * 2;
        float var3 = (float) class296.field4449 / 65535.0F;
        float[] var4 = new float[3];
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class213.field3076[class261.field3949][var2][var5] * 3;
            int var7 = class213.field3076[class261.field3949][var2 + 1][var5] * 3;
            int var8 = class213.field3076[class261.field3949][var2][var5];
            int var9 = (class213.field3076[class261.field3949][var2 + 2][var5] + class213.field3076[class261.field3949][var2 + 2][var5] - class213.field3076[class261.field3949][var2 + 3][var5]) * 3;
            int var10 = var7 - var6;
            int var11 = var6 + var9 - (var7 * 2);
            int var12 = var7 + class213.field3076[class261.field3949][var2 + 2][var5] - var8 - var9;
            var4[var5] = (((float) var12 * var3 + (float) var11) * var3 + (float) var10) * var3 + (float) var8;
        }
        class137.field1991 = (int) var4[0] - class272.field4123 * 128;
        class129.field1871 = (int) var4[1] * -1;
        class166.field2385 = (int) var4[2] - (class202.field2968 * 128);
        float[] var13 = new float[3];
        int var14 = class332.field5083 * 2;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class213.field3076[class174.field2507][var14][var15] * 3;
            int var17 = class213.field3076[class174.field2507][var14 + 1][var15] * 3;
            int var18 = (class213.field3076[class174.field2507][var14 + 2][var15] - (class213.field3076[class174.field2507][var14 + 3][var15] - class213.field3076[class174.field2507][var14 + 2][var15])) * 3;
            int var19 = class213.field3076[class174.field2507][var14][var15];
            int var20 = class213.field3076[class174.field2507][var14 + 2][var15] + var17 - var18 - var19;
            int var21 = var18 + var16 - (var17 * 2);
            int var22 = var17 - var16;
            var13[var15] = (((float) var20 * var3 + (float) var21) * var3 + (float) var22) * var3 + (float) var19;
        }
        float var23 = var13[0] - var4[0];
        float var24 = var13[2] - var4[2];
        int var25 = 57 % ((60 - arg0) / 40);
        float var26 = (var13[1] - var4[1]) * -1.0F;
        double var27 = Math.sqrt((double) (var23 * var23 + var24 * var24));
        class240.field3576 = (float) Math.atan2((double) var26, var27);
        class340.field5258 = -((float) Math.atan2((double) var23, (double) var24));
        class362.field5746 = (int) ((double) class240.field3576 * 325.949D) & 0x7FF;
        class335.field5216 = (int) ((double) class340.field5258 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)Lqk;", line = 131)
    public static final class1 method2481(int arg0, boolean arg1) {
        field5485++;
        class1 var2 = (class1) class57.field840.method461((byte) 120, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class107.field1550.method2520(0, arg0, (byte) -25);
        class1 var4 = new class1();
        if (var3 != null) {
            var4.method1(new class190(var3), 24416);
        }
        var4.method4(true);
        if (arg1) {
            method2479(-66);
        }
        class57.field840.method460(var4, -26089, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)I", line = 166)
    public static final int method2482(int arg0, int arg1) {
        if (arg0 != 7337) {
            method2479(-34);
        }
        field5483++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZILqf;I)V", line = 179)
    public static final void method2483(boolean arg0, int arg1, class359 arg2, int arg3) {
        if (arg0) {
            return;
        }
        if (arg2.field5489 == 0) {
            arg2.field5585 = arg2.field5577;
        } else if (arg2.field5489 == 1) {
            arg2.field5585 = (arg3 - arg2.field5560) / 2 + arg2.field5577;
        } else if (arg2.field5489 == 2) {
            arg2.field5585 = arg3 - arg2.field5577 - arg2.field5560;
        } else if (arg2.field5489 == 3) {
            arg2.field5585 = arg2.field5577 * arg3 >> 14;
        } else if (arg2.field5489 == 4) {
            arg2.field5585 = (arg3 - arg2.field5560) / 2 + (arg2.field5577 * arg3 >> 14);
        } else {
            arg2.field5585 = arg3 - (arg2.field5577 * arg3 >> 14) - arg2.field5560;
        }
        if (arg2.field5566 == 0) {
            arg2.field5495 = arg2.field5630;
        } else if (arg2.field5566 == 1) {
            arg2.field5495 = (arg1 - arg2.field5506) / 2 + arg2.field5630;
        } else if (arg2.field5566 == 2) {
            arg2.field5495 = arg1 - arg2.field5630 - arg2.field5506;
        } else if (arg2.field5566 == 3) {
            arg2.field5495 = arg2.field5630 * arg1 >> 14;
        } else if (arg2.field5566 == 4) {
            arg2.field5495 = (arg2.field5630 * arg1 >> 14) + (arg1 - arg2.field5506) / 2;
        } else {
            arg2.field5495 = arg1 - arg2.field5506 - (arg2.field5630 * arg1 >> 14);
        }
        if (class190.field2769 && (client.method347(arg2).field2901 != 0 || arg2.field5554 == 0)) {
            if (arg2.field5495 < 0) {
                arg2.field5495 = 0;
            } else if (arg2.field5506 + arg2.field5495 > arg1) {
                arg2.field5495 = arg1 - arg2.field5506;
            }
            if (arg2.field5585 < 0) {
                arg2.field5585 = 0;
            } else if ((arg2.field5585 + arg2.field5560) > arg3) {
                arg2.field5585 = arg3 - arg2.field5560;
            }
        }
        field5484++;
    }
}
