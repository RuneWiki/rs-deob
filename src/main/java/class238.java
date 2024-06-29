import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class238 {

    @OriginalMember(owner = "client!f", name = "d", descriptor = "Lmh;")
    public static class62 field4073 = class201.method1405(true, "Schlie-8en");

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field4074 = 0;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "J")
    public static long field4076 = 0L;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "[Lmh;")
    public static class62[] field4070;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "[[[S")
    public static short[][][] field4075;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([JII[II)V", line = 11)
    public static final void method1674(long[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        if (arg1 != -29057) {
            return;
        }
        field4077++;
        if (arg4 >= arg2) {
            return;
        }
        int var5 = (arg4 + arg2) / 2;
        long var6 = arg0[var5];
        int var8 = arg4;
        arg0[var5] = arg0[arg2];
        arg0[arg2] = var6;
        int var9 = arg3[var5];
        arg3[var5] = arg3[arg2];
        arg3[arg2] = var9;
        for (int var10 = arg4; var10 < arg2; var10++) {
            if (((long) (var10 & 0x1) + var6) > arg0[var10]) {
                long var11 = arg0[var10];
                arg0[var10] = arg0[var8];
                arg0[var8] = var11;
                int var13 = arg3[var10];
                arg3[var10] = arg3[var8];
                arg3[var8++] = var13;
            }
        }
        arg0[arg2] = arg0[var8];
        arg0[var8] = var6;
        arg3[arg2] = arg3[var8];
        arg3[var8] = var9;
        method1674(arg0, -29057, var8 - 1, arg3, arg4);
        method1674(arg0, -29057, arg2, arg3, var8 + 1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)[F", line = 101)
    public static final float[] method1675(byte arg0, int arg1) {
        field4071++;
        float var2 = class179.method1254() + class179.method1260();
        if (arg0 != 90) {
            field4076 = 64L;
        }
        int var3 = class179.method1255();
        float var4 = (float) ((var3 & 0xFF5EAB) >> 16) / 255.0F;
        class196.field3315[3] = 1.0F;
        float var5 = (float) (var3 & 0xFF) / 255.0F;
        float var6 = (float) ((var3 & 0xFF2C) >> 8) / 255.0F;
        float var7 = 0.58823526F;
        class196.field3315[1] = var7 * var6 * ((float) (class234.method1648(65419, arg1) >> 8) / 255.0F) * var2;
        class196.field3315[2] = (float) class234.method1648(arg1, 255) / 255.0F * var5 * var7 * var2;
        class196.field3315[0] = var2 * var4 * ((float) (class234.method1648(arg1, 16760503) >> 16) / 255.0F) * var7;
        return class196.field3315;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V", line = 152)
    public static void method1676(boolean arg0) {
        if (!arg0) {
            field4075 = (short[][][]) ((short[][][]) null);
        }
        field4073 = null;
        field4070 = null;
        field4075 = (short[][][]) null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIII)V", line = 179)
    public static final void method1677(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4072++;
        class232.method1639(arg5, 104);
        int var7 = 0;
        int var8 = arg5 - arg1;
        int var9 = arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var10 = -arg5;
        int var11 = -var8;
        int var12 = -1;
        int var13 = var8;
        if (class99.field1630 <= arg2 && class81.field1348 >= arg2) {
            int[] var14 = class282.field4817[arg2];
            int var15 = class4.method17(class176.field2819, -16168, class52.field755, arg3 - arg5);
            int var16 = class4.method17(class176.field2819, arg4 - 16167, class52.field755, arg3 + arg5);
            int var17 = class4.method17(class176.field2819, -16168, class52.field755, arg3 - var8);
            int var18 = class4.method17(class176.field2819, arg4 ^ 0x3F27, class52.field755, arg3 + var8);
            class271.method1861(arg0, true, var14, var17, var15);
            class271.method1861(arg6, true, var14, var18, var17);
            class271.method1861(arg0, true, var14, var16, var18);
        }
        int var19 = arg4;
        while (var7 < var9) {
            var19 += 2;
            var11 += var19;
            if (var11 >= 0 && var13 >= 1) {
                var13--;
                var11 -= var13 << 1;
                class209.field3539[var13] = var7;
            }
            var12 += 2;
            var7++;
            var10 += var12;
            if (var10 >= 0) {
                var9--;
                int var20 = arg2 - var9;
                int var21 = arg2 + var9;
                var10 -= var9 << 1;
                if (class99.field1630 <= var21 && class81.field1348 >= var20) {
                    if (var9 >= var8) {
                        int var22 = class4.method17(class176.field2819, -16168, class52.field755, arg3 + var7);
                        int var23 = class4.method17(class176.field2819, -16168, class52.field755, arg3 - var7);
                        if (class81.field1348 >= var21) {
                            class271.method1861(arg0, true, class282.field4817[var21], var22, var23);
                        }
                        if (class99.field1630 <= var20) {
                            class271.method1861(arg0, true, class282.field4817[var20], var22, var23);
                        }
                    } else {
                        int var24 = class209.field3539[var9];
                        int var25 = class4.method17(class176.field2819, arg4 ^ 0x3F27, class52.field755, arg3 + var7);
                        int var26 = class4.method17(class176.field2819, -16168, class52.field755, arg3 - var7);
                        int var27 = class4.method17(class176.field2819, arg4 ^ 0x3F27, class52.field755, arg3 + var24);
                        int var28 = class4.method17(class176.field2819, -16168, class52.field755, arg3 - var24);
                        if (var21 <= class81.field1348) {
                            int[] var29 = class282.field4817[var21];
                            class271.method1861(arg0, true, var29, var28, var26);
                            class271.method1861(arg6, true, var29, var27, var28);
                            class271.method1861(arg0, true, var29, var25, var27);
                        }
                        if (var20 >= class99.field1630) {
                            int[] var30 = class282.field4817[var20];
                            class271.method1861(arg0, true, var30, var28, var26);
                            class271.method1861(arg6, true, var30, var27, var28);
                            class271.method1861(arg0, true, var30, var25, var27);
                        }
                    }
                }
            }
            int var31 = arg2 - var7;
            int var32 = arg2 + var7;
            if (class99.field1630 <= var32 && var31 <= class81.field1348) {
                int var33 = arg3 + var9;
                int var34 = arg3 - var9;
                if (var33 >= class176.field2819 && class52.field755 >= var34) {
                    int var35 = class4.method17(class176.field2819, -16168, class52.field755, var33);
                    int var36 = class4.method17(class176.field2819, arg4 ^ 0x3F27, class52.field755, var34);
                    if (var8 <= var7) {
                        if (var32 <= class81.field1348) {
                            class271.method1861(arg0, true, class282.field4817[var32], var35, var36);
                        }
                        if (var31 >= class99.field1630) {
                            class271.method1861(arg0, true, class282.field4817[var31], var35, var36);
                        }
                    } else {
                        int var37 = var7 <= var13 ? var13 : class209.field3539[var7];
                        int var38 = class4.method17(class176.field2819, -16168, class52.field755, arg3 + var37);
                        int var39 = class4.method17(class176.field2819, -16168, class52.field755, arg3 - var37);
                        if (var32 <= class81.field1348) {
                            int[] var40 = class282.field4817[var32];
                            class271.method1861(arg0, true, var40, var39, var36);
                            class271.method1861(arg6, true, var40, var38, var39);
                            class271.method1861(arg0, true, var40, var35, var38);
                        }
                        if (var31 >= class99.field1630) {
                            int[] var41 = class282.field4817[var31];
                            class271.method1861(arg0, true, var41, var39, var36);
                            class271.method1861(arg6, true, var41, var38, var39);
                            class271.method1861(arg0, true, var41, var35, var38);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lsg;IIB)V", line = 380)
    public static final void method1678(class191 arg0, int arg1, int arg2, byte arg3) {
        field4078++;
        if (class29.field372 != 0 && class29.field372 != 3 || !arg0.method1333(112)) {
            return;
        }
        int var4 = arg0.field3175[arg1];
        if (arg2 < var4 || arg2 > arg0.field3156[arg1] + var4) {
            return;
        }
        int var5 = arg1 - arg0.field3126 / 2;
        int var6 = arg2 - arg0.field3190 / 2;
        int var7 = class267.field4516 + class187.field2984 & 0x7FF;
        int var8 = class23.field245[var7];
        int var9 = class23.field254[var7];
        int var10 = (class149.field2350 + 256) * var8 >> 8;
        int var11 = (class149.field2350 + 256) * var9 >> 8;
        int var12 = var5 * var10 + var6 * var11 >> 11;
        int var13 = var5 * var11 - (var6 * var10) >> 11;
        int var14 = class268.field4551.field3814 - var13 >> 7;
        int var15 = class268.field4551.field3821 + var12 >> 7;
        if (class293.field4985 > 0 && class291.field4939[82] && class291.field4939[81]) {
            class159.method1165(40, class290.field4936 + var14, class7.field85, class120.field2006 + var15);
        } else {
            boolean var16 = class57.method377(true, 13581, 0, class268.field4551.field3828[0], var15, var14, 0, 0, 1, class268.field4551.field3846[0], 0, 0);
            if (var16) {
                class170.field2772.method717(1, var6);
                class170.field2772.method717(1, var5);
                class170.field2772.method738((byte) 93, class267.field4516);
                class170.field2772.method717(1, 57);
                class170.field2772.method717(1, class187.field2984);
                class170.field2772.method717(1, class149.field2350);
                class170.field2772.method717(1, 89);
                class170.field2772.method738((byte) 55, class268.field4551.field3821);
                class170.field2772.method738((byte) 109, class268.field4551.field3814);
                class170.field2772.method717(1, class69.field1059);
                class170.field2772.method717(1, 63);
            }
        }
        int var17 = 17 % ((49 - arg3) / 62);
    }
}
