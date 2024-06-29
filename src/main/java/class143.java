import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class143 extends class182 {

    @OriginalMember(owner = "client!na", name = "N", descriptor = "Lg;")
    public class67 field2586;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "I")
    public static int field2589 = 0;

    @OriginalMember(owner = "client!na", name = "P", descriptor = "I")
    public static int field2588 = 0;

    @OriginalMember(owner = "client!na", name = "ab", descriptor = "Z")
    public static boolean field2599 = false;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "Lkh;")
    public static class117 field2584 = class224.method1450((byte) 108, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "[[[Ldb;")
    public static class36[][][] field2597 = new class36[4][104][104];

    @OriginalMember(owner = "client!na", name = "Z", descriptor = "Lkh;")
    private static class117 field2598 = class224.method1450((byte) 114, "green:");

    @OriginalMember(owner = "client!na", name = "X", descriptor = "Lkh;")
    public static class117 field2596 = field2598;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "Lkh;")
    public static class117 field2587 = field2598;

    @OriginalMember(owner = "client!na", name = "cb", descriptor = "Lkh;")
    private static class117 field2601 = class224.method1450((byte) 6, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!na", name = "M", descriptor = "Lkh;")
    public static class117 field2585 = field2601;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!na", name = "T", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!na", name = "U", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!na", name = "V", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!na", name = "W", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!na", name = "bb", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "Lai;")
    public static class10 field2581;

    @OriginalMember(owner = "client!na", name = "J", descriptor = "Lch;")
    public static class31 field2582;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "[I")
    public static int[] field2583;

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lg;)V")
    public class143(class67 arg0) {
        this.field2586 = arg0;
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(B)V")
    public static final void method963(byte arg0) {
        if (!class182.field3289) {
            class25.field612[0] = class208.field3737;
            class100.field1825 = 1;
            class194.field3462[0] = 1004;
            class56.field1160[0] = class169.field3042;
        }
        if (class92.field1697 != -1) {
            class173.method1209(arg0 + 7115, class92.field1697);
        }
        field2595++;
        for (int var1 = 0; var1 < class139.field2530; var1++) {
            if (class173.field3126[var1]) {
                class51.field1058[var1] = true;
            }
            class17.field498[var1] = class173.field3126[var1];
            class173.field3126[var1] = false;
        }
        class38.field866 = -1;
        class97.field1775 = class44.field966;
        class240.field4339 = null;
        class33.field764 = -1;
        if (class92.field1697 != -1) {
            class139.field2530 = 0;
            class226.method1469(0, class97.field1793, class124.field2324, 0, 0, (byte) 45, 0, class92.field1697, -1);
        }
        class83.method576();
        class70.method493((byte) 76);
        if (class182.field3289) {
            class53.method406(119);
        } else if (class33.field764 != -1) {
            class247.method1619((byte) -23, class38.field866, class33.field764);
        }
        if (class93.field1711 == 3) {
            for (int var2 = 0; var2 < class139.field2530; var2++) {
                if (class17.field498[var2]) {
                    class83.method580(class7.field114[var2], class36.field843[var2], class1.field7[var2], class100.field1834[var2], 16711935, 128);
                } else if (class51.field1058[var2]) {
                    class83.method580(class7.field114[var2], class36.field843[var2], class1.field7[var2], class100.field1834[var2], 16711680, 128);
                }
            }
        }
        class10.method110(0, class93.field1712.field4221, class203.field3675, class28.field691, class93.field1712.field4244);
        if (arg0 == -56) {
            class28.field691 = 0;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IILkh;)V")
    public static final void method964(int arg0, int arg1, class117 arg2) {
        class105.field1911.method400(40, 8);
        if (arg1 != 3) {
            field2588 = -27;
        }
        class243.field4479++;
        class105.field1911.method1016(arg1 ^ 0x7D, arg2.method813((byte) 93));
        class105.field1911.method1002(false, arg0);
        field2593++;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public static void method965(int arg0) {
        field2601 = null;
        field2582 = null;
        field2581 = null;
        field2585 = null;
        field2596 = null;
        field2583 = null;
        if (arg0 != 0) {
            method963((byte) 24);
        }
        field2598 = null;
        field2597 = null;
        field2584 = null;
        field2587 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method966(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2600++;
        int var8 = arg1;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg5 - arg0;
        int var12 = arg5 * arg5;
        int var13 = arg1 - arg0;
        int var14 = var13 * var13;
        int var15 = var12 << 1;
        int var16 = arg1 * arg1;
        int var17 = var11 * var11;
        int var18 = var16 << 1;
        if (arg6 > -51) {
            field2581 = null;
        }
        int var19 = var14 << 1;
        int var20 = var17 << 1;
        int var21 = arg1 << 1;
        int var22 = var13 << 1;
        int var23 = (1 - var21) * var12 + var18;
        int var24 = var16 - (var21 - 1) * var15;
        int var25 = (1 - var22) * var17 + var19;
        int var26 = var16 << 2;
        int var27 = var17 << 2;
        int var28 = var14 << 2;
        int var29 = var18 * 3;
        int var30 = var12 << 2;
        int var31 = var14 - (var22 - 1) * var20;
        int var32 = (var22 - 3) * var20;
        int var33 = var19 * 3;
        int var34 = var26;
        int var35 = (var21 - 3) * var15;
        int var36 = (var13 - 1) * var27;
        int var37 = (arg1 - 1) * var30;
        int var38 = var28;
        int[] var39 = class167.field3030[arg2];
        class114.method762(arg3 - arg5, 102, arg3 - var11, arg4, var39);
        class114.method762(arg3 - var11, 114, arg3 + var11, arg7, var39);
        class114.method762(arg3 + var11, 121, arg3 + arg5, arg4, var39);
        while (var8 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var9++;
                    var23 += var29;
                    var24 += var34;
                    var34 += var26;
                    var29 += var26;
                }
            }
            if (var24 < 0) {
                var24 += var34;
                var34 += var26;
                var9++;
                var23 += var29;
                var29 += var26;
            }
            var23 += -var37;
            var24 += -var35;
            var37 -= var30;
            var35 -= var30;
            int var40 = arg3 + var9;
            boolean var41 = var13 >= var8;
            if (var41) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var31 += var38;
                        var10++;
                        var25 += var33;
                        var38 += var28;
                        var33 += var28;
                    }
                }
                if (var31 < 0) {
                    var10++;
                    var25 += var33;
                    var31 += var38;
                    var33 += var28;
                    var38 += var28;
                }
                var31 += -var32;
                var25 += -var36;
                var36 -= var27;
                var32 -= var27;
            }
            var8--;
            int var42 = arg3 - var9;
            int var43 = arg2 - var8;
            int var44 = arg2 + var8;
            if (var41) {
                int var45 = arg3 + var10;
                int var46 = arg3 - var10;
                class114.method762(var42, 78, var46, arg4, class167.field3030[var43]);
                class114.method762(var46, 106, var45, arg7, class167.field3030[var43]);
                class114.method762(var45, 81, var40, arg4, class167.field3030[var43]);
                class114.method762(var42, 103, var46, arg4, class167.field3030[var44]);
                class114.method762(var46, 118, var45, arg7, class167.field3030[var44]);
                class114.method762(var45, 110, var40, arg4, class167.field3030[var44]);
            } else {
                class114.method762(var42, 82, var40, arg4, class167.field3030[var43]);
                class114.method762(var42, 89, var40, arg4, class167.field3030[var44]);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIBIII)V")
    public static final void method967(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field2594++;
        int var7 = class119.method843(class159.field2910, arg3 ^ 0x56, arg4, class224.field4040);
        int var8 = class119.method843(class159.field2910, -126, arg1, class224.field4040);
        int var9 = class119.method843(class240.field4355, -113, arg2, class146.field2678);
        int var10 = class119.method843(class240.field4355, -113, arg6, class146.field2678);
        int var11 = class119.method843(class159.field2910, -121, arg4 + arg5, class224.field4040);
        int var12 = class119.method843(class159.field2910, -119, arg1 - arg5, class224.field4040);
        for (int var13 = var7; var13 < var11; var13++) {
            class114.method762(var9, 117, var10, arg0, class167.field3030[var13]);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class114.method762(var9, 108, var10, arg0, class167.field3030[var14]);
        }
        if (arg3 != -47) {
            method965(95);
        }
        int var15 = class119.method843(class240.field4355, arg3 - 77, arg2 - -arg5, class146.field2678);
        int var16 = class119.method843(class240.field4355, -128, arg6 - arg5, class146.field2678);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class167.field3030[var17];
            class114.method762(var9, arg3 ^ 0xFFFFFFA4, var15, arg0, var18);
            class114.method762(var16, 115, var10, arg0, var18);
        }
    }
}
