import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class92 {

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Lvd;")
    private static class222 field1723 = class212.method1357(" has logged in)3", 10731);

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "[I")
    public static int[] field1731 = new int[5];

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "Lvd;")
    public static class222 field1734 = field1723;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "Z")
    public static boolean field1729 = false;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "Lvd;")
    public static class222 field1736 = class212.method1357("60 Sekunden noch einmal)3)3)3", 10731);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "[I")
    public static int[] field1730;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        field1724++;
        int var9 = arg6;
        int var10 = arg2 - arg3;
        int var11 = arg2 * arg2;
        int var12 = arg6 - arg3;
        int var13 = var10 * var10;
        int var14 = arg6 * arg6;
        int var15 = var12 * var12;
        int var16 = 0;
        int var17 = var15 << 1;
        int var18 = var11 << 1;
        int var19 = var14 << 1;
        int var20 = var12 << 1;
        int var21 = var13 << 1;
        int var22 = arg6 << 1;
        int var23 = (1 - var22) * var11 + var19;
        int var24 = var14 - (var22 - 1) * var18;
        int var25 = (1 - var20) * var13 + var17;
        int var26 = var11 << 2;
        int var27 = var15 - (var20 - 1) * var21;
        int var28 = var14 << 2;
        int var29 = var13 << 2;
        int var30 = var19 * 3;
        int var31 = (var22 - 3) * var18;
        int var32 = var15 << 2;
        int var33 = var17 * 3;
        int var34 = (var20 - 3) * var21;
        int var35 = var28;
        if (arg1 != -18343) {
            return;
        }
        int var36 = (arg6 - 1) * var26;
        int var37 = var32;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class156.field2981[arg0];
        class81.method532(arg5 - arg2, arg4, var39, arg5 - var10, -7);
        class81.method532(arg5 - var10, arg7, var39, arg5 + var10, -7);
        class81.method532(arg5 + var10, arg4, var39, arg5 + arg2, -7);
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var8++;
                    var35 += var28;
                    var23 += var30;
                    var30 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var30;
                var8++;
                var35 += var28;
                var30 += var28;
            }
            var23 += -var36;
            var24 += -var31;
            var31 -= var26;
            var36 -= var26;
            boolean var40 = var9 <= var12;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var16++;
                        var27 += var37;
                        var25 += var33;
                        var37 += var32;
                        var33 += var32;
                    }
                }
                if (var27 < 0) {
                    var16++;
                    var27 += var37;
                    var37 += var32;
                    var25 += var33;
                    var33 += var32;
                }
                var25 += -var38;
                var38 -= var29;
                var27 += -var34;
                var34 -= var29;
            }
            var9--;
            int var41 = arg0 + var9;
            int var42 = arg5 + var8;
            int var43 = arg0 - var9;
            int var44 = arg5 - var8;
            if (var40) {
                int var45 = arg5 + var16;
                int var46 = arg5 - var16;
                class81.method532(var44, arg4, class156.field2981[var43], var46, -7);
                class81.method532(var46, arg7, class156.field2981[var43], var45, -7);
                class81.method532(var45, arg4, class156.field2981[var43], var42, arg1 + 18336);
                class81.method532(var44, arg4, class156.field2981[var41], var46, -7);
                class81.method532(var46, arg7, class156.field2981[var41], var45, arg1 ^ 0x47A0);
                class81.method532(var45, arg4, class156.field2981[var41], var42, -7);
            } else {
                class81.method532(var44, arg4, class156.field2981[var43], var42, -7);
                class81.method532(var44, arg4, class156.field2981[var41], var42, -7);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)I")
    public static final int method587(int arg0, int arg1) {
        field1732++;
        class78 var2 = class78.method517(arg0, true);
        if (arg1 != -15134) {
            return -58;
        }
        int var3 = var2.field1497;
        int var4 = var2.field1503;
        int var5 = var2.field1502;
        int var6 = class135.field2606[var5 - var3];
        return class93.field1751[var4] >> var3 & var6;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
    public static final void method588(boolean arg0) {
        if (!arg0) {
            method591((byte) -43);
        }
        class201.field3680.method596(!arg0);
        field1726++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BIII)V")
    public static final void method589(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -127) {
            field1735 = -90;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class176.field3295[arg3][arg2 + var4][arg1 + var7] = 0;
            }
        }
        field1733++;
        if (arg2 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class176.field3295[arg3][arg2][arg1 + var5] = class176.field3295[arg3][arg2 - 1][arg1 + var5];
            }
        }
        if (arg1 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class176.field3295[arg3][arg2 + var6][arg1] = class176.field3295[arg3][arg2 + var6][arg1 - 1];
            }
        }
        if (arg2 > 0 && class176.field3295[arg3][arg2 - 1][arg1] != 0) {
            class176.field3295[arg3][arg2][arg1] = class176.field3295[arg3][arg2 - 1][arg1];
        } else if (arg1 > 0 && class176.field3295[arg3][arg2][arg1 - 1] != 0) {
            class176.field3295[arg3][arg2][arg1] = class176.field3295[arg3][arg2][arg1 - 1];
        } else if (arg2 > 0 && arg1 > 0 && class176.field3295[arg3][arg2 - 1][arg1 - 1] != 0) {
            class176.field3295[arg3][arg2][arg1] = class176.field3295[arg3][arg2 - 1][arg1 - 1];
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public static final void method590(byte arg0) {
        if (arg0 > -45) {
            return;
        }
        field1728++;
        class42.field895.method1347((byte) -60, 62);
        for (class21 var1 = (class21) class208.field3863.method1517(0); var1 != null; var1 = (class21) class208.field3863.method1522(-1)) {
            if (var1.field492 == 0) {
                class168.method1081(true, (byte) -110, var1);
            }
        }
        class80.field1535++;
        if (class91.field1713 != null) {
            class80.method527(class91.field1713, 31702);
            class91.field1713 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
    public static void method591(byte arg0) {
        field1736 = null;
        field1731 = null;
        if (arg0 <= 7) {
            method591((byte) -125);
        }
        field1723 = null;
        field1734 = null;
        field1730 = null;
    }
}
