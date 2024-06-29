import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class87 extends class86 {

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "I")
    public int field1272 = 0;

    @OriginalMember(owner = "client!jk", name = "y", descriptor = "Lta;")
    public static class197 field1275 = new class197(64);

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "Lad;")
    public static class128 field1276 = new class128();

    @OriginalMember(owner = "client!jk", name = "G", descriptor = "Z")
    public static boolean field1282 = false;

    @OriginalMember(owner = "client!jk", name = "C", descriptor = "Lvj;")
    public static class106 field1278 = new class106(64);

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "Z")
    public static boolean field1285 = false;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!jk", name = "A", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!jk", name = "E", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "Llb;")
    public static class211 field1281;

    @OriginalMember(owner = "client!jk", name = "I", descriptor = "Lob;")
    public static class292 field1283;

    @OriginalMember(owner = "client!jk", name = "D", descriptor = "[I")
    public static int[] field1279;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lsf;IIIIIIIZ)V", line = 5)
    public static final void method715(class107 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class163.field2430;
        int var11;
        int var12 = var11 = (arg7 << 7) - class35.field444;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class41.field612[arg1][arg6][arg7] - class6.field57;
        int var18 = class41.field612[arg1][arg6 + 1][arg7] - class6.field57;
        int var19 = class41.field612[arg1][arg6 + 1][arg7 + 1] - class6.field57;
        int var20 = class41.field612[arg1][arg6][arg7 + 1] - class6.field57;
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
        int var45 = (var21 << 9) / var25 + class56.field834;
        int var46 = (var24 << 9) / var25 + class56.field828;
        int var47 = (var27 << 9) / var31 + class56.field834;
        int var48 = (var30 << 9) / var31 + class56.field828;
        int var49 = (var33 << 9) / var37 + class56.field834;
        int var50 = (var36 << 9) / var37 + class56.field828;
        int var51 = (var39 << 9) / var43 + class56.field834;
        int var52 = (var42 << 9) / var43 + class56.field828;
        class56.field841 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class244.field3682 && class22.method149(class63.field952 + class56.field834, class91.field1318 + class56.field828, var50, var52, var48, var49, var51, var47)) {
                class207.field3265 = arg6;
                class160.field2385 = arg7;
            }
            if (!class36.field534 && !arg8) {
                class56.field833 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class56.field825 || var51 > class56.field825 || var47 > class56.field825) {
                    class56.field833 = true;
                }
                if (arg0.field1637 == -1) {
                    if (arg0.field1638 != 12345678) {
                        class56.method499(var50, var52, var48, var49, var51, var47, arg0.field1638, arg0.field1636, arg0.field1645);
                    }
                } else if (!class101.field1512) {
                    int var53 = class56.field829.method1744(-65536, arg0.field1637);
                    class56.method499(var50, var52, var48, var49, var51, var47, class253.method1760(var53, arg0.field1638), class253.method1760(var53, arg0.field1636), class253.method1760(var53, arg0.field1645));
                } else if (arg0.field1641) {
                    class56.method493(var50, var52, var48, var49, var51, var47, arg0.field1638, arg0.field1636, arg0.field1645, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1637);
                } else {
                    class56.method493(var50, var52, var48, var49, var51, var47, arg0.field1638, arg0.field1636, arg0.field1645, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field1637);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class244.field3682 && class22.method149(class63.field952 + class56.field834, class91.field1318 + class56.field828, var46, var48, var52, var45, var47, var51)) {
            class207.field3265 = arg6;
            class160.field2385 = arg7;
        }
        if (class36.field534 || arg8) {
            return;
        }
        class56.field833 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class56.field825 || var47 > class56.field825 || var51 > class56.field825) {
            class56.field833 = true;
        }
        if (arg0.field1637 == -1) {
            if (arg0.field1639 != 12345678) {
                class56.method499(var46, var48, var52, var45, var47, var51, arg0.field1639, arg0.field1645, arg0.field1636);
            }
        } else if (class101.field1512) {
            class56.method493(var46, var48, var52, var45, var47, var51, arg0.field1639, arg0.field1645, arg0.field1636, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1637);
        } else {
            int var54 = class56.field829.method1744(-65536, arg0.field1637);
            class56.method499(var46, var48, var52, var45, var47, var51, class253.method1760(var54, arg0.field1639), class253.method1760(var54, arg0.field1645), class253.method1760(var54, arg0.field1636));
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I[BII)Z", line = 163)
    public static final boolean method716(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg2 != 50) {
            method715((class107) null, -51, -9, -107, -70, -34, -50, -80, false);
        }
        field1270++;
        class35 var4 = new class35(arg1);
        int var5 = -1;
        boolean var6 = true;
        label76: while (true) {
            int var7 = var4.method283(-3);
            if (var7 == 0) {
                return var6;
            }
            boolean var8 = false;
            var5 += var7;
            int var9 = 0;
            while (true) {
                int var13;
                class101 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var8) {
                                        int var17 = var4.method241(0);
                                        if (var17 == 0) {
                                            continue label76;
                                        }
                                        var4.method273(arg2 + 65230);
                                    }
                                    int var10 = var4.method241(arg2 - 50);
                                    if (var10 == 0) {
                                        continue label76;
                                    }
                                    var9 += var10 - 1;
                                    int var11 = var9 & 0x3F;
                                    int var12 = var9 >> 6 & 0x3F;
                                    var13 = var4.method273(65280) >> 2;
                                    var14 = arg3 + var12;
                                    var15 = arg0 + var11;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class281.method1984(var5, false);
                } while (var13 == 22 && !class11.field127 && var16.field1538 == 0 && var16.field1514 != 1 && !var16.field1574);
                var8 = true;
                if (!var16.method798(-82)) {
                    class163.field2427++;
                    var6 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILhb;)V", line = 249)
    private final void method717(int arg0, int arg1, class35 arg2) {
        if (arg0 == 16) {
            if (arg1 == 2) {
                this.field1272 = arg2.method300(arg0 - 1394191648);
            }
            field1271++;
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(IB)V", line = 266)
    public static final void method718(int arg0, byte arg1) {
        if (arg1 != 81) {
            field1283 = (class292) null;
        }
        class12.field136 = arg0;
        class257.field3832 = -1;
        class45.field713 = -1;
        class62.method546(arg1 ^ 0xFFFFFFD8);
        field1274++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)V", line = 281)
    public static void method719(boolean arg0) {
        field1276 = null;
        if (!arg0) {
            return;
        }
        field1275 = null;
        field1281 = null;
        field1279 = null;
        field1283 = null;
        field1278 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lhb;B)V", line = 309)
    public final void method720(class35 arg0, byte arg1) {
        int var3 = 87 % ((-arg1 - 38) / 52);
        field1273++;
        while (true) {
            int var4 = arg0.method273(65280);
            if (var4 == 0) {
                return;
            }
            this.method717(16, var4, arg0);
        }
    }
}
