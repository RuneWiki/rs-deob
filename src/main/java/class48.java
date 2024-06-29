import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class48 {

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "[I")
    public static int[] field604 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "Lfba;")
    public static class27 field609 = new class27(17, 8);

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "I")
    public static int field613 = 0;

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "F")
    public static float field614;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "Lbt;")
    public class48 field611;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "Lit;")
    public class672 field605;

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "Lwia;")
    public static class791 field610;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)V")
    public static final void method338(int arg0, int arg1) {
        field612++;
        class313 var2 = class312.method1998((long) arg0, 16, -1);
        if (arg1 >= 1) {
            var2.method2006(124);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lav;Z)I")
    public static final int method339(class665 arg0, boolean arg1) {
        field606++;
        class110 var2 = arg0.field9240;
        if (var2.field1657 != null) {
            var2 = var2.method840(class537.field7727, -9);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field1632;
        class539 var4 = arg0.method2096(0);
        if (arg0.field4659 == -1 || arg0.field4615) {
            var3 = var2.field1687;
        } else if (arg0.field4659 == var4.field7770 || arg0.field4659 == var4.field7776 || arg0.field4659 == var4.field7765 || arg0.field4659 == var4.field7777) {
            var3 = var2.field1673;
        } else if (arg0.field4659 == var4.field7783 || arg0.field4659 == var4.field7740 || arg0.field4659 == var4.field7753 || arg0.field4659 == var4.field7769) {
            var3 = var2.field1675;
        }
        if (!arg1) {
            field613 = -47;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(CB)Z")
    public static final boolean method340(char arg0, byte arg1) {
        if (arg1 < 12) {
            method338(3, -33);
        }
        field601++;
        return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BLjs;)V")
    public static final void method341(byte arg0, class349 arg1) {
        field603++;
        int var2 = 0;
        arg1.method2212(1163641539);
        for (int var3 = 0; var3 < class514.field7278; var3++) {
            int var16 = class522.field7381[var3];
            if ((class125.field1940[var16] & 0x1) == 0) {
                if (var2 > 0) {
                    class125.field1940[var16] = (byte) class746.method4158(class125.field1940[var16], 2);
                    var2--;
                } else {
                    int var17 = arg1.method2216(-124, 1);
                    if (var17 == 0) {
                        var2 = class173.method1260(arg1, -89);
                        class125.field1940[var16] = (byte) class746.method4158(class125.field1940[var16], 2);
                    } else {
                        class34.method278(14554, var16, arg1);
                    }
                }
            }
        }
        arg1.method2217(-7);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method2212(1163641539);
        for (int var4 = 0; var4 < class514.field7278; var4++) {
            int var14 = class522.field7381[var4];
            if ((class125.field1940[var14] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class125.field1940[var14] = (byte) class746.method4158(class125.field1940[var14], 2);
                } else {
                    int var15 = arg1.method2216(-107, 1);
                    if (var15 == 0) {
                        var2 = class173.method1260(arg1, -105);
                        class125.field1940[var14] = (byte) class746.method4158(class125.field1940[var14], 2);
                    } else {
                        class34.method278(14554, var14, arg1);
                    }
                }
            }
        }
        arg1.method2217(-7);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method2212(1163641539);
        int var5 = 14 / ((42 - arg0) / 52);
        for (int var6 = 0; var6 < class512.field7232; var6++) {
            int var12 = class347.field4857[var6];
            if ((class125.field1940[var12] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class125.field1940[var12] = (byte) class746.method4158(class125.field1940[var12], 2);
                } else {
                    int var13 = arg1.method2216(-110, 1);
                    if (var13 == 0) {
                        var2 = class173.method1260(arg1, -117);
                        class125.field1940[var12] = (byte) class746.method4158(class125.field1940[var12], 2);
                    } else if (class686.method3870((byte) -109, var12, arg1)) {
                        class125.field1940[var12] = (byte) class746.method4158(class125.field1940[var12], 2);
                    }
                }
            }
        }
        arg1.method2217(-7);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method2212(1163641539);
        for (int var7 = 0; var7 < class512.field7232; var7++) {
            int var10 = class347.field4857[var7];
            if ((class125.field1940[var10] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class125.field1940[var10] = (byte) class746.method4158(class125.field1940[var10], 2);
                } else {
                    int var11 = arg1.method2216(-123, 1);
                    if (var11 == 0) {
                        var2 = class173.method1260(arg1, -115);
                        class125.field1940[var10] = (byte) class746.method4158(class125.field1940[var10], 2);
                    } else if (class686.method3870((byte) -124, var10, arg1)) {
                        class125.field1940[var10] = (byte) class746.method4158(class125.field1940[var10], 2);
                    }
                }
            }
        }
        arg1.method2217(-7);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class512.field7232 = 0;
        class514.field7278 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            class125.field1940[var8] = (byte) (class125.field1940[var8] >> 1);
            class702 var9 = class767.field10560[var8];
            if (var9 == null) {
                class347.field4857[class512.field7232++] = var8;
            } else {
                class522.field7381[class514.field7278++] = var8;
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method342(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field602++;
        int var8 = class527.method3176(arg3, class407.field5535, class734.field10153, -2);
        if (arg4 >= -76) {
            return;
        }
        int var9 = class527.method3176(arg6, class407.field5535, class734.field10153, -2);
        int var10 = class527.method3176(arg7, class463.field6533, class618.field8645, -2);
        int var11 = class527.method3176(arg1, class463.field6533, class618.field8645, -2);
        int var12 = class527.method3176(arg2 + arg3, class407.field5535, class734.field10153, -2);
        int var13 = class527.method3176(arg6 - arg2, class407.field5535, class734.field10153, -2);
        for (int var14 = var8; var14 < var12; var14++) {
            class434.method2601(class746.field10330[var14], var10, arg0, (byte) -62, var11);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class434.method2601(class746.field10330[var15], var10, arg0, (byte) -62, var11);
        }
        int var16 = class527.method3176(arg2 + arg7, class463.field6533, class618.field8645, -2);
        int var17 = class527.method3176(arg1 - arg2, class463.field6533, class618.field8645, -2);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class746.field10330[var18];
            class434.method2601(var19, var10, arg0, (byte) -62, var16);
            class434.method2601(var19, var16, arg5, (byte) -62, var17);
            class434.method2601(var19, var17, arg0, (byte) -62, var11);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
    public static void method343(int arg0) {
        field609 = null;
        field604 = null;
        if (arg0 <= 42) {
            method339(null, true);
        }
        field610 = null;
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V")
    public final void method344(int arg0) {
        field607++;
        if (class428.field5822 >= 500) {
            return;
        }
        this.field611 = class330.field4661;
        this.field605 = null;
        if (arg0 <= -40) {
            class330.field4661 = this;
            class428.field5822++;
        }
    }
}
