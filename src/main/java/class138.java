import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class138 {

    @OriginalMember(owner = "client!b", name = "b", descriptor = "Lhn;")
    public static class317 field2365 = new class317(260);

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field2373 = 127;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "Lhi;")
    public static class82 field2367 = class95.method664((byte) -94, ")4l=");

    @OriginalMember(owner = "client!b", name = "g", descriptor = "Lhi;")
    public static class82 field2370 = class95.method664((byte) -110, ":");

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Lhi;")
    public static class82 field2375 = class95.method664((byte) -100, " s(West d-Bconnect-B)3");

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field2369 = 0;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Lhi;")
    public static class82 field2374 = class95.method664((byte) -97, "http:)4)4");

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field2377 = -1;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "Lbh;")
    public static class18 field2364;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "[I")
    public static int[] field2368;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "[[[B")
    public static byte[][][] field2371;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "[[[B")
    public static byte[][][] field2376;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)I", line = 5)
    public static final int method936(int arg0, int arg1) {
        if (arg0 == 255) {
            field2378++;
            return arg1 & 0xFF;
        } else {
            return -92;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lme;I)V", line = 21)
    public static final void method937(class75 arg0, int arg1) {
        if (class287.field4829 == arg0.field1154) {
            class276.field4639[arg0.field1212] = true;
        }
        field2366++;
        if (arg1 != 16) {
            field2374 = (class82) null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V", line = 42)
    public static final void method938(int arg0) {
        class230.field3973 = arg0;
        for (int var1 = 0; var1 < class89.field1605; var1++) {
            for (int var2 = 0; var2 < class38.field658; var2++) {
                if (class15.field120[arg0][var1][var2] == null) {
                    class15.field120[arg0][var1][var2] = new class16(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZIIIII)V", line = 69)
    public static final void method939(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2372++;
        int var6 = arg3;
        if (arg0) {
            method938(89);
        }
        while (arg2 >= var6) {
            class114.method780(-69, arg4, arg5, arg1, class73.field1117[var6]);
            var6++;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lhm;IIIIIIIZ)V", line = 102)
    public static final void method940(class88 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class129.field2252;
        int var11;
        int var12 = var11 = (arg7 << 7) - class37.field621;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class245.field4255[arg1][arg6][arg7] - class191.field3210;
        int var18 = class245.field4255[arg1][arg6 + 1][arg7] - class191.field3210;
        int var19 = class245.field4255[arg1][arg6 + 1][arg7 + 1] - class191.field3210;
        int var20 = class245.field4255[arg1][arg6][arg7 + 1] - class191.field3210;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class102.field1817;
        int var46 = (var24 << 9) / var25 + class102.field1811;
        int var47 = (var27 << 9) / var31 + class102.field1817;
        int var48 = (var30 << 9) / var31 + class102.field1811;
        int var49 = (var33 << 9) / var37 + class102.field1817;
        int var50 = (var36 << 9) / var37 + class102.field1811;
        int var51 = (var39 << 9) / var43 + class102.field1817;
        int var52 = (var42 << 9) / var43 + class102.field1811;
        class102.field1814 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class257.field4414 && class44.method328(class133.field2310 + class102.field1817, class39.field673 + class102.field1811, var50, var52, var48, var49, var51, var47)) {
                class100.field1799 = arg6;
                class257.field4419 = arg7;
            }
            if (!class147.field2485 && !arg8) {
                class102.field1806 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class102.field1807 || var51 > class102.field1807 || var47 > class102.field1807) {
                    class102.field1806 = true;
                }
                if (arg0.field1568 == -1) {
                    if (arg0.field1564 != 12345678) {
                        class102.method692(var50, var52, var48, var49, var51, var47, arg0.field1564, arg0.field1571, arg0.field1566);
                    }
                } else if (!class113.field2040) {
                    int var53 = class102.field1821.method627(arg0.field1568, -116);
                    class102.method692(var50, var52, var48, var49, var51, var47, class25.method159(var53, arg0.field1564), class25.method159(var53, arg0.field1571), class25.method159(var53, arg0.field1566));
                } else if (arg0.field1574) {
                    class102.method705(var50, var52, var48, var49, var51, var47, arg0.field1564, arg0.field1571, arg0.field1566, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1568);
                } else {
                    class102.method705(var50, var52, var48, var49, var51, var47, arg0.field1564, arg0.field1571, arg0.field1566, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field1568);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class257.field4414 && class44.method328(class133.field2310 + class102.field1817, class39.field673 + class102.field1811, var46, var48, var52, var45, var47, var51)) {
            class100.field1799 = arg6;
            class257.field4419 = arg7;
        }
        if (class147.field2485 || arg8) {
            return;
        }
        class102.field1806 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class102.field1807 || var47 > class102.field1807 || var51 > class102.field1807) {
            class102.field1806 = true;
        }
        if (arg0.field1568 == -1) {
            if (arg0.field1575 != 12345678) {
                class102.method692(var46, var48, var52, var45, var47, var51, arg0.field1575, arg0.field1566, arg0.field1571);
            }
        } else if (class113.field2040) {
            class102.method705(var46, var48, var52, var45, var47, var51, arg0.field1575, arg0.field1566, arg0.field1571, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1568);
        } else {
            int var54 = class102.field1821.method627(arg0.field1568, -120);
            class102.method692(var46, var48, var52, var45, var47, var51, class25.method159(var54, arg0.field1575), class25.method159(var54, arg0.field1566), class25.method159(var54, arg0.field1571));
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V", line = 271)
    public static void method941(int arg0) {
        if (arg0 > -9) {
            return;
        }
        field2376 = (byte[][][]) null;
        field2368 = null;
        field2371 = (byte[][][]) null;
        field2367 = null;
        field2365 = null;
        field2370 = null;
        field2374 = null;
        field2364 = null;
        field2375 = null;
    }
}
