import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class class103 {

    @OriginalMember(owner = "client!di", name = "b", descriptor = "Lmh;")
    public static class62 field1692 = class201.method1405(true, "Versteckt");

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field1696 = -1;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "Lmh;")
    public static class62 field1698 = class201.method1405(true, "Untersuchen");

    @OriginalMember(owner = "client!di", name = "e", descriptor = "Lmh;")
    private static class62 field1695 = class201.method1405(true, "Loading textures )2 ");

    @OriginalMember(owner = "client!di", name = "j", descriptor = "Lmh;")
    public static class62 field1700 = field1695;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "Lhi;")
    public static class26 field1691;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)I", line = 15)
    public static final int method812(int arg0, int arg1) {
        class297 var2 = class35.method230(arg1, arg0 - 101);
        int var3 = var2.field5064;
        if (arg0 != 8) {
            method818(true, true);
        }
        int var4 = var2.field5066;
        int var5 = var2.field5069;
        field1694++;
        int var6 = class218.field3751[var4 - var5];
        return class222.field3877[var3] >> var5 & var6;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 35)
    public static void method813(int arg0) {
        field1700 = null;
        field1698 = null;
        field1691 = null;
        if (arg0 == 27878) {
            field1695 = null;
            field1692 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZZ)V", line = 79)
    public static final void method818(boolean arg0, boolean arg1) {
        field1697++;
        class80.field1335 = arg1;
        if (class80.field1335) {
            class75.field1223.method1695((byte) 98);
            for (int var2 = 0; var2 < 4; var2++) {
                for (int var3 = 0; var3 < 13; var3++) {
                    for (int var4 = 0; var4 < 13; var4++) {
                        int var5 = class75.field1223.method1687(1, (byte) 26);
                        if (var5 == 1) {
                            class183.field2927[var2][var3][var4] = class75.field1223.method1687(26, (byte) 26);
                        } else {
                            class183.field2927[var2][var3][var4] = -1;
                        }
                    }
                }
            }
            class75.field1223.method1686((byte) -17);
            int var6 = (class60.field874 - class75.field1223.field1476) / 16;
            class284.field4863 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var8 = 0; var8 < 4; var8++) {
                    class284.field4863[var7][var8] = class75.field1223.method714((byte) -96);
                }
            }
            int var9 = class75.field1223.method720(true);
            int var10 = class75.field1223.method748(-3);
            int var11 = class75.field1223.method721(122);
            int var12 = class75.field1223.method721(102);
            int var13 = class75.field1223.method734(false);
            class212.field3566 = new int[var6];
            class43.field657 = new int[var6];
            class150.field2370 = null;
            class196.field3328 = new byte[var6][];
            class248.field4223 = (byte[][]) null;
            class39.field608 = new int[var6];
            class85.field1382 = new byte[var6][];
            class1.field10 = new int[var6];
            class256.field4327 = new byte[var6][];
            class235.field4043 = new int[var6];
            class244.field4140 = new byte[var6][];
            int var14 = 0;
            for (int var15 = 0; var15 < 4; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    for (int var17 = 0; var17 < 13; var17++) {
                        int var18 = class183.field2927[var15][var16][var17];
                        if (var18 != -1) {
                            int var19 = var18 >> 3 & 0x7FF;
                            int var20 = (var18 & 0xFFD74C) >> 14;
                            int var21 = (var20 / 8 << 8) + (var19 / 8);
                            for (int var22 = 0; var22 < var14; var22++) {
                                if (class39.field608[var22] == var21) {
                                    var21 = -1;
                                    break;
                                }
                            }
                            if (var21 != -1) {
                                int var23 = (var21 & 0xFF94) >> 8;
                                int var24 = var21 & 0xFF;
                                class39.field608[var14] = var21;
                                class43.field657[var14] = class113.field1874.method153((byte) 110, class254.method1772(new class62[] { class94.field1542, class42.method284(var23, -122), class155.field2498, class42.method284(var24, -117) }, 0));
                                class212.field3566[var14] = class113.field1874.method153((byte) 110, class254.method1772(new class62[] { class99.field1642, class42.method284(var23, -125), class155.field2498, class42.method284(var24, -125) }, 0));
                                class1.field10[var14] = class113.field1874.method153((byte) 110, class254.method1772(new class62[] { class62.field903, class42.method284(var23, -121), class155.field2498, class42.method284(var24, -119) }, 0));
                                class235.field4043[var14] = class113.field1874.method153((byte) 110, class254.method1772(new class62[] { class287.field4908, class42.method284(var23, -125), class155.field2498, class42.method284(var24, -125) }, 0));
                                var14++;
                            }
                        }
                    }
                }
            }
            class189.method1322(var13, 83, false, var11, var9, var10, var12);
        } else {
            int var25 = class75.field1223.method702(-1);
            int var26 = class75.field1223.method691(128);
            int var27 = class75.field1223.method734(false);
            int var28 = (class60.field874 - class75.field1223.field1476) / 16;
            class284.field4863 = new int[var28][4];
            for (int var29 = 0; var29 < var28; var29++) {
                for (int var30 = 0; var30 < 4; var30++) {
                    class284.field4863[var29][var30] = class75.field1223.method703(12646);
                }
            }
            int var31 = class75.field1223.method734(false);
            int var32 = class75.field1223.method721(101);
            class43.field657 = new int[var28];
            class244.field4140 = new byte[var28][];
            class256.field4327 = new byte[var28][];
            class1.field10 = new int[var28];
            class235.field4043 = new int[var28];
            class39.field608 = new int[var28];
            class248.field4223 = (byte[][]) null;
            class150.field2370 = null;
            boolean var33 = false;
            class212.field3566 = new int[var28];
            class196.field3328 = new byte[var28][];
            if (((var31 / 8) == 48 || (var31 / 8) == 49) && (var26 / 8) == 48) {
                var33 = true;
            }
            if (var31 / 8 == 48 && (var26 / 8) == 148) {
                var33 = true;
            }
            class85.field1382 = new byte[var28][];
            int var34 = 0;
            for (int var35 = (var31 - 6) / 8; var35 <= ((var31 + 6) / 8); var35++) {
                for (int var36 = (var26 - 6) / 8; var36 <= (var26 + 6) / 8; var36++) {
                    int var37 = (var35 << 8) + var36;
                    if (var33 && (var36 == 49 || var36 == 149 || var36 == 147 || var35 == 50 || var35 == 49 && var36 == 47)) {
                        class39.field608[var34] = var37;
                        class43.field657[var34] = -1;
                        class212.field3566[var34] = -1;
                        class1.field10[var34] = -1;
                        class235.field4043[var34] = -1;
                    } else {
                        class39.field608[var34] = var37;
                        class43.field657[var34] = class113.field1874.method153((byte) 110, class254.method1772(new class62[] { class94.field1542, class42.method284(var35, -120), class155.field2498, class42.method284(var36, -120) }, 0));
                        class212.field3566[var34] = class113.field1874.method153((byte) 110, class254.method1772(new class62[] { class99.field1642, class42.method284(var35, -121), class155.field2498, class42.method284(var36, -119) }, 0));
                        class1.field10[var34] = class113.field1874.method153((byte) 110, class254.method1772(new class62[] { class62.field903, class42.method284(var35, -119), class155.field2498, class42.method284(var36, -126) }, 0));
                        class235.field4043[var34] = class113.field1874.method153((byte) 110, class254.method1772(new class62[] { class287.field4908, class42.method284(var35, -128), class155.field2498, class42.method284(var36, -125) }, 0));
                    }
                    var34++;
                }
            }
            class189.method1322(var27, 119, false, var26, var25, var31, var32);
        }
        if (arg0) {
            method812(97, 98);
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)Lhf;")
    public abstract class276 method814(int arg0);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)V")
    public abstract void method815(byte arg0, int arg1);

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(II)I")
    public abstract int method816(int arg0, int arg1);

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(BI)[B")
    public abstract byte[] method817(byte arg0, int arg1);
}
