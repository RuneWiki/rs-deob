import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class91 {

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "Leb;")
    public static class230 field1649 = class68.method589(0, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field1647 = 0;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Leb;")
    public static class230 field1650 = class68.method589(0, "welle:");

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "[[B")
    public static byte[][] field1646;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lf;IIIIIIIZ)V")
    public static final void method769(class36 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class274.field4817;
        int var11;
        int var12 = var11 = (arg7 << 7) - class79.field1439;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class106.field1912[arg1][arg6][arg7] - class72.field1317;
        int var18 = class106.field1912[arg1][arg6 + 1][arg7] - class72.field1317;
        int var19 = class106.field1912[arg1][arg6 + 1][arg7 + 1] - class72.field1317;
        int var20 = class106.field1912[arg1][arg6][arg7 + 1] - class72.field1317;
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
        int var45 = (var21 << 9) / var25 + class3.field19;
        int var46 = (var24 << 9) / var25 + class3.field25;
        int var47 = (var27 << 9) / var31 + class3.field19;
        int var48 = (var30 << 9) / var31 + class3.field25;
        int var49 = (var33 << 9) / var37 + class3.field19;
        int var50 = (var36 << 9) / var37 + class3.field25;
        int var51 = (var39 << 9) / var43 + class3.field19;
        int var52 = (var42 << 9) / var43 + class3.field25;
        class3.field29 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class267.field4748 && class8.method81(class3.field19 + class219.field3772, class95.field1721 + class3.field25, var50, var52, var48, var49, var51, var47)) {
                client.field2718 = arg6;
                class37.field694 = arg7;
            }
            if (!arg8) {
                class3.field16 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class3.field23 || var51 > class3.field23 || var47 > class3.field23) {
                    class3.field16 = true;
                }
                if (arg0.field680 == -1) {
                    if (arg0.field672 != 12345678) {
                        class3.method18(var50, var52, var48, var49, var51, var47, arg0.field672, arg0.field671, arg0.field669);
                    }
                } else if (!class99.field1833) {
                    int var53 = class3.field15.method729(76, arg0.field680);
                    class3.method18(var50, var52, var48, var49, var51, var47, class29.method267(var53, arg0.field672), class29.method267(var53, arg0.field671), class29.method267(var53, arg0.field669));
                } else if (arg0.field679) {
                    class3.method35(var50, var52, var48, var49, var51, var47, arg0.field672, arg0.field671, arg0.field669, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field680);
                } else {
                    class3.method35(var50, var52, var48, var49, var51, var47, arg0.field672, arg0.field671, arg0.field669, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field680);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class267.field4748 && class8.method81(class3.field19 + class219.field3772, class95.field1721 + class3.field25, var46, var48, var52, var45, var47, var51)) {
            client.field2718 = arg6;
            class37.field694 = arg7;
        }
        if (arg8) {
            return;
        }
        class3.field16 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class3.field23 || var47 > class3.field23 || var51 > class3.field23) {
            class3.field16 = true;
        }
        if (arg0.field680 != -1) {
            if (class99.field1833) {
                class3.method35(var46, var48, var52, var45, var47, var51, arg0.field673, arg0.field669, arg0.field671, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field680);
                return;
            }
            int var54 = class3.field15.method729(97, arg0.field680);
            class3.method18(var46, var48, var52, var45, var47, var51, class29.method267(var54, arg0.field673), class29.method267(var54, arg0.field669), class29.method267(var54, arg0.field671));
        } else if (arg0.field673 != 12345678) {
            class3.method18(var46, var48, var52, var45, var47, var51, arg0.field673, arg0.field669, arg0.field671);
            return;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
    public static void method770(boolean arg0) {
        field1649 = null;
        field1650 = null;
        if (!arg0) {
            field1647 = 30;
        }
        field1646 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lfk;I)V")
    public static final void method771(class14 arg0, int arg1) {
        field1648++;
        int var2 = arg0.method202(33);
        class61.field1171 = new class203[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class61.field1171[var3] = new class203();
            class61.field1171[var3].field3577 = arg0.method202(19);
            class61.field1171[var3].field3579 = arg0.method194(arg1 ^ 0xFFFFBB74);
        }
        class109.field1962 = arg0.method202(64);
        class178.field3136 = arg0.method202(17);
        class68.field1269 = arg0.method202(20);
        class139.field2484 = new class23[class178.field3136 + 1 - class109.field1962];
        for (int var4 = arg1; var4 < class68.field1269; var4++) {
            int var5 = arg0.method202(104);
            class23 var6 = class139.field2484[var5] = new class23();
            var6.field2123 = arg0.method200(arg1 ^ 0xFF);
            var6.field2130 = arg0.method187((byte) 61);
            var6.field442 = class109.field1962 + var5;
            var6.field438 = arg0.method194(arg1 - 17548);
            var6.field436 = arg0.method194(-17548);
        }
        class207.field3641 = arg0.method187((byte) 61);
        class166.field2931 = true;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static final void method772(int arg0) {
        field1653++;
        class6.field83.method1122(10);
        class247.field4381.method1122(10);
        if (arg0 != 19815) {
            method769((class36) null, 46, -59, 78, 29, 96, -94, 49, false);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BZ)V")
    public static final void method773(byte arg0, boolean arg1) {
        field1652++;
        byte var2 = 4;
        byte[][] var3 = field1646;
        for (int var4 = 0; var4 < var2; var4++) {
            class154.method1175(95);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class125.field2195[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x369847E) >> 24;
                        if (!arg1 || var9 == 0) {
                            int var10 = var8 >> 14 & 0x3FF;
                            int var11 = var8 >> 1 & 0x3;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var10 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class13.field262.length; var14++) {
                                if (class13.field262[var14] == var13 && var3[var14] != null) {
                                    class38.method342(var6 * 8, (var12 & 0x7) * 8, var11, var3[var14], var4, (var10 & 0x7) * 8, class112.field2007, var9, var5 * 8, -107, arg1);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class153.method1174(8, 8, true, var6 * 8, var5 * 8, var4);
                    }
                }
            }
        }
        if (arg0 != -111) {
            field1649 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)V")
    public static final void method774(int arg0, int arg1, int arg2, int arg3) {
        field1651++;
        class197 var4 = class164.method1228(arg0, arg2, arg0 - 1665874468);
        var4.method1402((byte) -102);
        var4.field3527 = arg1;
        var4.field3532 = arg3;
    }
}
