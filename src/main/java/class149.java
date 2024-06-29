import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class149 {

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field2397 = 0;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "Z")
    public static boolean field2398 = true;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Ltl;")
    public static class186 field2395;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "[I")
    public static int[] field2399;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)V")
    public static final void method1011(int arg0, int arg1) {
        class99 var2 = class273.field4415[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class99 var4 = class273.field4415[var3][arg0][arg1] = class273.field4415[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field1505--;
                for (int var5 = 0; var5 < var4.field1503; var5++) {
                    class138 var6 = var4.field1496[var5];
                    if ((var6.field2275 >> 29 & 0x3L) == 2L && var6.field2272 == arg0 && var6.field2284 == arg1) {
                        var6.field2287--;
                    }
                }
            }
        }
        if (class273.field4415[0][arg0][arg1] == null) {
            class273.field4415[0][arg0][arg1] = new class99(0, arg0, arg1);
        }
        class273.field4415[0][arg0][arg1].field1506 = var2;
        class273.field4415[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static final void method1012(int arg0) {
        field2394++;
        class83.field1148.method1238(arg0, -136478397);
        class151.field2423++;
        class83.field1148.method1761(class204.field3275, arg0 + 4326);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public static void method1013(byte arg0) {
        if (arg0 != 94) {
            field2398 = false;
        }
        field2399 = null;
        field2395 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIIIIIZZ)V")
    public static final void method1014(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field2396++;
        if (!arg6 && class263.field4159 == arg5 && class103.field1675 == arg4 && class109.field1891 == arg1 || class200.method1349(false)) {
            return;
        }
        class103.field1675 = arg4;
        class109.field1891 = arg1;
        class263.field4159 = arg5;
        if (class200.method1349(false)) {
            class109.field1891 = 0;
        }
        if (arg7) {
            class233.method1539(28, (byte) 32);
        } else {
            class233.method1539(25, (byte) 32);
        }
        class157.method1059(0, class21.field256, true);
        int var8 = class296.field4685;
        int var9 = class93.field1321;
        class296.field4685 = (arg5 - 6) * 8;
        class93.field1321 = (arg4 - 6) * 8;
        class173.field2801 = class256.method1685(class263.field4159 * 8, class103.field1675 * 8, false);
        class233.field3699 = null;
        int var10 = class93.field1321 - var9;
        int var11 = class93.field1321;
        int var12 = class296.field4685 - var8;
        int var13 = class296.field4685;
        if (arg7) {
            class251.field4027 = 0;
            for (int var17 = 0; var17 < 32768; var17++) {
                class275 var34 = class198.field3193[var17];
                if (var34 != null) {
                    var34.field613 -= var10 * 128;
                    var34.field614 -= var12 * 128;
                    if (var34.field614 >= 0 && var34.field614 <= 13184 && var34.field613 >= 0 && var34.field613 <= 13184) {
                        for (int var35 = 0; var35 < 10; var35++) {
                            var34.field610[var35] -= var12;
                            var34.field692[var35] -= var10;
                        }
                        class134.field2250[class251.field4027++] = var17;
                    } else {
                        class198.field3193[var17].method1857((class265) null, 7324);
                        class198.field3193[var17] = null;
                    }
                }
            }
        } else {
            for (int var14 = 0; var14 < 32768; var14++) {
                class275 var15 = class198.field3193[var14];
                if (var15 != null) {
                    for (int var16 = 0; var16 < 10; var16++) {
                        var15.field610[var16] -= var12;
                        var15.field692[var16] -= var10;
                    }
                    var15.field613 -= var10 * 128;
                    var15.field614 -= var12 * 128;
                }
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class235 var32 = class260.field4141[var18];
            if (var32 != null) {
                for (int var33 = 0; var33 < 10; var33++) {
                    var32.field610[var33] -= var12;
                    var32.field692[var33] -= var10;
                }
                var32.field613 -= var10 * 128;
                var32.field614 -= var12 * 128;
            }
        }
        class28.field336 = arg1;
        byte var19 = 0;
        byte var20 = 0;
        byte var21 = 104;
        class197.field3179.method1551(arg2, false, false, arg3);
        byte var22 = 104;
        byte var23 = 1;
        if (var12 < 0) {
            var21 = -1;
            var23 = -1;
            var19 = 103;
        }
        byte var24 = 1;
        if (var10 < 0) {
            var24 = -1;
            var20 = 103;
            var22 = -1;
        }
        int var25 = var19;
        int var26 = -10 % ((-arg0 - 18) / 60);
        while (var21 != var25) {
            for (int var28 = var20; var28 != var22; var28 += var24) {
                int var29 = var25 + var12;
                int var30 = var28 + var10;
                for (int var31 = 0; var31 < 4; var31++) {
                    if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
                        class244.field3913[var31][var25][var28] = class244.field3913[var31][var29][var30];
                    } else {
                        class244.field3913[var31][var25][var28] = null;
                    }
                }
            }
            var25 += var23;
        }
        for (class44 var27 = (class44) class144.field2328.method365(3); var27 != null; var27 = (class44) class144.field2328.method372((byte) 7)) {
            var27.field511 -= var10;
            var27.field512 -= var12;
            if (var27.field512 < 0 || var27.field511 < 0 || var27.field512 >= 104 || var27.field511 >= 104) {
                var27.method544(93);
            }
        }
        if (class5.field60 != 0) {
            class5.field60 -= var12;
            class184.field2932 -= var10;
        }
        class48.field590 = -1;
        if (arg7) {
            class214.field3450 -= var10;
            class119.field2014 -= var10 * 128;
            class233.field3702 -= var12;
            class99.field1513 -= var12;
            class78.field1064 -= var10;
            class44.field522 -= var12 * 128;
        } else {
            class92.field1316 = 1;
        }
        class104.field1750 = 0;
        class228.field3626.method371(3);
        class58.field814.method371(3);
    }
}
