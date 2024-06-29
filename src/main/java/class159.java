import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class159 {

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "[Lkf;")
    public static class170[] field2605 = new class170[4];

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "Ldf;")
    public static class51 field2612 = class46.method233(": ", 100);

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "[I")
    public static int[] field2609 = new int[4096];

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "Ldf;")
    public static class51 field2614 = class46.method233("(U(Y", 100);

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Ldf;")
    public static class51 field2613 = class46.method233("gleiten:", 100);

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Ldf;")
    public static class51 field2607 = class46.method233("_", 100);

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public int field2610;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Lrf;")
    public class259 field2604;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "[I")
    public int[] field2616;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "[I")
    public static int[] field2617;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static void method1130(byte arg0) {
        if (arg0 != 36) {
            field2614 = null;
        }
        field2609 = null;
        field2613 = null;
        field2607 = null;
        field2612 = null;
        field2614 = null;
        field2605 = null;
        field2617 = null;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
    public static final void method1131(byte arg0) {
        if (arg0 <= 28) {
            field2607 = null;
        }
        field2611++;
        while (true) {
            class252 var1 = class14.field207;
            class124 var2;
            synchronized (class14.field207) {
                var2 = (class124) class245.field4249.method1714(58);
            }
            if (var2 == null) {
                return;
            }
            var2.field2100.method349(var2.field2102, (int) var2.field1760, var2.field2098, false, -98);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lu;B)V")
    public static final void method1132(class111 arg0, byte arg1) {
        field2615++;
        if (arg1 <= -91) {
            class208.field3481 = arg0;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)Ldf;")
    public static final class51 method1133(byte arg0, int arg1) {
        field2608++;
        class51 var2 = class51.method311(arg1, 10);
        if (arg0 > -45) {
            return null;
        }
        for (int var3 = var2.method293(false) - 3; var3 > 0; var3 -= 3) {
            var2 = class20.method104(-92, new class51[] { var2.method269((byte) -74, 0, var3), class166.field2708, var2.method279((byte) -55, var3) });
        }
        if (var2.method293(false) > 9) {
            return class20.method104(51, new class51[] { class264.field4621, var2.method269((byte) -74, 0, var2.method293(false) - 8), class188.field3150, class265.field4643, var2, class132.field2199 });
        } else if (var2.method293(false) > 6) {
            return class20.method104(-108, new class51[] { class75.field1204, var2.method269((byte) -74, 0, var2.method293(false) - 4), class218.field3782, class265.field4643, var2, class132.field2199 });
        } else {
            return class20.method104(29, new class51[] { class183.field3029, var2, class99.field1654 });
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method1134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        class130.method960(arg0, (byte) -27);
        int var7 = 0;
        field2606++;
        if (arg6 <= 0) {
            field2613 = null;
        }
        int var8 = arg0 - arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg5 >= class36.field542 && class175.field2867 >= arg5) {
            int[] var14 = class80.field1324[arg5];
            int var15 = class149.method1074(-93, class115.field1954, class28.field408, arg1 - arg0);
            int var16 = class149.method1074(75, class115.field1954, class28.field408, arg0 + arg1);
            int var17 = class149.method1074(75, class115.field1954, class28.field408, arg1 - var8);
            int var18 = class149.method1074(80, class115.field1954, class28.field408, arg1 + var8);
            class242.method1660((byte) -79, var14, arg4, var17, var15);
            class242.method1660((byte) -79, var14, arg2, var18, var17);
            class242.method1660((byte) -79, var14, arg4, var16, var18);
        }
        int var19 = -1;
        while (var7 < var9) {
            var19 += 2;
            var12 += var19;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class121.field2030[var11] = var7;
            }
            var7++;
            var13 += 2;
            var10 += var13;
            if (var10 >= 0) {
                var9--;
                int var20 = arg5 + var9;
                int var21 = arg5 - var9;
                if (class36.field542 <= var20 && class175.field2867 >= var21) {
                    if (var8 > var9) {
                        int var22 = class121.field2030[var9];
                        int var23 = class149.method1074(115, class115.field1954, class28.field408, arg1 + var7);
                        int var24 = class149.method1074(-41, class115.field1954, class28.field408, arg1 - var7);
                        int var25 = class149.method1074(112, class115.field1954, class28.field408, arg1 + var22);
                        int var26 = class149.method1074(-50, class115.field1954, class28.field408, arg1 - var22);
                        if (var20 <= class175.field2867) {
                            int[] var27 = class80.field1324[var20];
                            class242.method1660((byte) -79, var27, arg4, var26, var24);
                            class242.method1660((byte) -79, var27, arg2, var25, var26);
                            class242.method1660((byte) -79, var27, arg4, var23, var25);
                        }
                        if (class36.field542 <= var21) {
                            int[] var28 = class80.field1324[var21];
                            class242.method1660((byte) -79, var28, arg4, var26, var24);
                            class242.method1660((byte) -79, var28, arg2, var25, var26);
                            class242.method1660((byte) -79, var28, arg4, var23, var25);
                        }
                    } else {
                        int var29 = class149.method1074(105, class115.field1954, class28.field408, arg1 + var7);
                        int var30 = class149.method1074(-52, class115.field1954, class28.field408, arg1 - var7);
                        if (var20 <= class175.field2867) {
                            class242.method1660((byte) -79, class80.field1324[var20], arg4, var29, var30);
                        }
                        if (class36.field542 <= var21) {
                            class242.method1660((byte) -79, class80.field1324[var21], arg4, var29, var30);
                        }
                    }
                }
                var10 -= var9 << 1;
            }
            int var31 = arg5 - var7;
            int var32 = arg5 + var7;
            if (class36.field542 <= var32 && var31 <= class175.field2867) {
                int var33 = arg1 + var9;
                int var34 = arg1 - var9;
                if (class28.field408 <= var33 && class115.field1954 >= var34) {
                    int var35 = class149.method1074(-67, class115.field1954, class28.field408, var33);
                    int var36 = class149.method1074(-62, class115.field1954, class28.field408, var34);
                    if (var8 > var7) {
                        int var37 = var7 > var11 ? class121.field2030[var7] : var11;
                        int var38 = class149.method1074(113, class115.field1954, class28.field408, arg1 + var37);
                        int var39 = class149.method1074(-124, class115.field1954, class28.field408, arg1 - var37);
                        if (var32 <= class175.field2867) {
                            int[] var40 = class80.field1324[var32];
                            class242.method1660((byte) -79, var40, arg4, var39, var36);
                            class242.method1660((byte) -79, var40, arg2, var38, var39);
                            class242.method1660((byte) -79, var40, arg4, var35, var38);
                        }
                        if (class36.field542 <= var31) {
                            int[] var41 = class80.field1324[var31];
                            class242.method1660((byte) -79, var41, arg4, var39, var36);
                            class242.method1660((byte) -79, var41, arg2, var38, var39);
                            class242.method1660((byte) -79, var41, arg4, var35, var38);
                        }
                    } else {
                        if (var32 <= class175.field2867) {
                            class242.method1660((byte) -79, class80.field1324[var32], arg4, var35, var36);
                        }
                        if (class36.field542 <= var31) {
                            class242.method1660((byte) -79, class80.field1324[var31], arg4, var35, var36);
                        }
                    }
                }
            }
        }
    }
}
