import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class143 {

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "[I")
    public static int[] field2509 = new int[] { 0, 0, 4, 0, 0, 0, 0, 8, 0, 6, 3, 10, 0, 0, 0, -2, 0, 3, 0, 0, 6, 4, 0, 0, 0, 0, 0, -1, 4, 5, -2, 0, 0, 0, 5, 0, 6, 0, 0, -1, -2, 0, 0, 0, -2, 0, 1, 0, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 5, 0, 0, -1, 0, 0, 0, 2, 0, 0, 0, 8, 6, 7, 0, 0, 0, 0, 0, 0, 0, 7, 0, 3, 0, -2, 0, 0, 4, 6, 4, 0, 0, 0, 0, 7, 0, 0, 2, 0, 0, 0, 5, -2, 0, 20, 0, 0, 0, 0, -1, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 5, 0, 0, -1, -2, 0, -1, 4, 0, 0, 8, -2, 0, 0, 6, 0, 3, 2, 2, 0, 0, 10, 0, 10, 6, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 2, 15, 0, 7, 0, 6, 0, -1, 5, 24, 0, 0, -2, 0, 0, 0, 0, 0, 8, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 2, 0, 0, 14, 0, 4, 5, 0, 6, -1, 0, 4, 0, 1, 0, 0, 8, 12, 2, 0, 0, -1, 1, 0, 4, 0, 0, 0, -2, -2, 6, 0, 0, -2, 6, -1, 0, 1, 1, 0, -2, 0, 6, -1, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 15, 0 };

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "Lia;")
    public static class257 field2511 = class28.method234(-113, "rect_debug=");

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public static int field2516 = -1;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "Lia;")
    public static class257 field2508 = class28.method234(73, "details)3dat");

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field2506 = 0;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field2517 = 2301979;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "Lia;")
    public static class257 field2518 = class28.method234(-59, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "Lmf;")
    public static class63 field2510;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static void method972(int arg0) {
        field2510 = null;
        if (arg0 != 0) {
            field2506 = -36;
        }
        field2511 = null;
        field2508 = null;
        field2518 = null;
        field2509 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lmb;Lmb;BLmb;Lbh;)Z")
    public static final boolean method973(class178 arg0, class178 arg1, byte arg2, class178 arg3, class2 arg4) {
        class205.field3510 = arg0;
        int var5 = 100 % ((25 - arg2) / 59);
        field2513++;
        class5.field131 = arg3;
        class175.field2990 = arg1;
        class40.field835 = arg4;
        return true;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZIIILme;)V")
    public static final void method974(boolean arg0, int arg1, int arg2, int arg3, class44 arg4) {
        field2514++;
        class39.method319((byte) 87);
        class23.method187(arg3, arg2, arg4.field926 + arg3, arg2 - -arg4.field981);
        if (class9.field177 == 2 || class9.field177 == 5 || class19.field411 == null) {
            class23.method193(arg3, arg2, 0, arg4.field1010, arg4.field974);
        } else {
            int var5 = class25.field479 + class215.field3648 & 0x7FF;
            int var6 = class137.field2441.field4177 / 32 + 48;
            int var7 = 464 - (class137.field2441.field4143 / 32);
            ((class190) class19.field411).method484(arg3, arg2, arg4.field926, arg4.field981, var6, var7, var5, class95.field1796 + 256, arg4.field1010, arg4.field974);
            for (int var8 = 0; var8 < class17.field369; var8++) {
                int var41 = class50.field1108[var8] * 4 + 2 - (class137.field2441.field4177 / 32);
                int var42 = class1.field1[var8] * 4 + 2 - (class137.field2441.field4143 / 32);
                class233 var43 = class5.method96(class222.field3754[var8], false);
                if (var43.field3952 != null) {
                    var43 = var43.method1537((byte) 87);
                    if (var43 == null || var43.field3975 == -1) {
                        continue;
                    }
                }
                class167.method1136(-97, arg3, var41, arg2, arg4, var42, class177.field3002[var43.field3975]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var37 = 0; var37 < 104; var37++) {
                    class33 var38 = class78.field1499[class189.field3261][var9][var37];
                    if (var38 != null) {
                        int var39 = var9 * 4 + 2 - (class137.field2441.field4177 / 32);
                        int var40 = var37 * 4 + 2 - (class137.field2441.field4143 / 32);
                        class167.method1136(-102, arg3, var39, arg2, arg4, var40, class21.field440[0]);
                    }
                }
            }
            for (int var10 = 0; var10 < class140.field2487; var10++) {
                class197 var33 = class92.field1758[class199.field3412[var10]];
                if (var33 != null && var33.method1236(0)) {
                    class198 var34 = var33.field3322;
                    if (var34 != null && var34.field3393 != null) {
                        var34 = var34.method1324((byte) 125);
                    }
                    if (var34 != null && var34.field3338 && var34.field3374) {
                        int var35 = var33.field4177 / 32 - (class137.field2441.field4177 / 32);
                        int var36 = var33.field4143 / 32 - (class137.field2441.field4143 / 32);
                        class167.method1136(-114, arg3, var35, arg2, arg4, var36, class21.field440[1]);
                    }
                }
            }
            for (int var11 = 0; var11 < class231.field3880; var11++) {
                class180 var25 = class55.field1180[class132.field2362[var11]];
                if (var25 != null && var25.method1236(0)) {
                    int var26 = var25.field4143 / 32 - (class137.field2441.field4143 / 32);
                    int var27 = var25.field4177 / 32 - class137.field2441.field4177 / 32;
                    boolean var28 = false;
                    long var29 = var25.field3140.method1668(116);
                    for (int var31 = 0; var31 < class138.field2462; var31++) {
                        if (class243.field4216[var31] == var29 && class80.field1568[var31] != 0) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var32 = false;
                    if (class137.field2441.field3120 != 0 && var25.field3120 != 0 && class137.field2441.field3120 == var25.field3120) {
                        var32 = true;
                    }
                    if (var28) {
                        class167.method1136(-103, arg3, var27, arg2, arg4, var26, class21.field440[3]);
                    } else if (var32) {
                        class167.method1136(-89, arg3, var27, arg2, arg4, var26, class21.field440[4]);
                    } else {
                        class167.method1136(-117, arg3, var27, arg2, arg4, var26, class21.field440[2]);
                    }
                }
            }
            class12[] var12 = class156.field2719;
            for (int var13 = 0; var13 < var12.length; var13++) {
                class12 var16 = var12[var13];
                if (var16 != null && var16.field224 != 0 && class7.field153 % 20 < 10) {
                    if (var16.field224 == 1 && var16.field222 >= 0 && class92.field1758.length > var16.field222) {
                        class197 var17 = class92.field1758[var16.field222];
                        if (var17 != null) {
                            int var18 = var17.field4177 / 32 - (class137.field2441.field4177 / 32);
                            int var19 = var17.field4143 / 32 - (class137.field2441.field4143 / 32);
                            class39.method320(arg3, 20, arg2, var16.field220, var19, arg4, var18);
                        }
                    }
                    if (var16.field224 == 2) {
                        int var20 = (var16.field237 - class231.field3878) * 4 + 2 - class137.field2441.field4143 / 32;
                        int var21 = (var16.field223 - class244.field4232) * 4 + 2 - (class137.field2441.field4177 / 32);
                        class39.method320(arg3, 20, arg2, var16.field220, var20, arg4, var21);
                    }
                    if (var16.field224 == 10 && var16.field222 >= 0 && class55.field1180.length > var16.field222) {
                        class180 var22 = class55.field1180[var16.field222];
                        if (var22 != null) {
                            int var23 = var22.field4177 / 32 - (class137.field2441.field4177 / 32);
                            int var24 = var22.field4143 / 32 - class137.field2441.field4143 / 32;
                            class39.method320(arg3, 20, arg2, var16.field220, var24, arg4, var23);
                        }
                    }
                }
            }
            if (class132.field2369 != 0) {
                int var14 = class132.field2369 * 4 - ((class137.field2441.field4177 / 32) - 2);
                int var15 = class186.field3228 * 4 + 2 - (class137.field2441.field4143 / 32);
                class167.method1136(-103, arg3, var14, arg2, arg4, var15, class180.field3129);
            }
            class23.method198(arg4.field926 / 2 + arg3 - 1, arg2 - -(arg4.field981 / 2) + -1, 3, 3, 16777215);
        }
        class75.field1464[arg1] = arg0;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)I")
    public static final int method975(byte arg0) {
        field2512++;
        if (class32.field628 == 3.0D) {
            return 37;
        } else if (arg0 <= 71) {
            return -63;
        } else if (class32.field628 == 4.0D) {
            return 50;
        } else if (class32.field628 == 6.0D) {
            return 75;
        } else {
            return 100;
        }
    }
}
