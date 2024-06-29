import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class788 {

    @OriginalMember(owner = "client!f", name = "g", descriptor = "[[I")
    public static int[][] field10820 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Lfba;")
    public static class27 field10822 = new class27(33, 3);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field10814;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field10815;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field10816;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field10817;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field10818;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field10819;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field10821;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", line = 3)
    public static final void method4313(String arg0, byte arg1, String arg2, String arg3, int arg4, int arg5, String arg6) {
        if (arg1 != 51) {
            method4314(-17, null);
        }
        class457.method2725(arg5, arg3, arg4, arg0, null, arg6, arg2, 115, -1);
        field10818++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILso;)Lom;", line = 14)
    public static final class393 method4314(int arg0, class494 arg1) {
        field10821++;
        String var2 = arg1.method2996(arg0 ^ 0x7B);
        class97 var3 = class391.method2424((byte) -61)[arg1.method2964((byte) 116)];
        class463 var4 = class670.method3807((byte) -124)[arg1.method2964((byte) 102)];
        int var5 = arg1.method2988(-3);
        int var6 = arg1.method2988(arg0 - 3);
        int var7 = arg1.method2964((byte) 116);
        int var8 = arg1.method2964((byte) 78);
        int var9 = arg1.method2964((byte) 92);
        int var10 = arg1.method2998(true);
        int var11 = arg1.method2998(true);
        if (arg0 == 0) {
            int var12 = arg1.method2976(-124);
            int var13 = arg1.method2976(-126);
            int var14 = arg1.method2976(-127);
            return new class393(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIZ)Ljava/lang/String;", line = 51)
    public static final String method4315(int arg0, int arg1, boolean arg2) {
        field10819++;
        if (arg2 && arg0 >= 0) {
            return arg1 >= -96 ? null : class751.method4182(false, 10, arg2, arg0);
        } else {
            return Integer.toString(arg0);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILlq;Llq;)V", line = 66)
    public static final void method4316(int arg0, class577 arg1, class577 arg2) {
        if (arg1.field8128 != null) {
            arg1.method3387((byte) 109);
        }
        if (arg0 >= -76) {
            field10822 = null;
        }
        field10816++;
        arg1.field8128 = arg2.field8128;
        arg1.field8131 = arg2;
        arg1.field8128.field8131 = arg1;
        arg1.field8131.field8128 = arg1;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V", line = 84)
    public static final void method4317(int arg0) {
        field10815++;
        if (!class626.field8777) {
            class378.field5223 = class617.field8632 != -1 && class618.field8644 >= class617.field8632 || class714.field9895 < (class463.field6530 ? 26 : 22) + class618.field8644 * 16;
        }
        class488.field6868.method1729((byte) -93);
        class422.field5781.method1729((byte) 50);
        for (class746 var1 = (class746) class239.field3583.method1731((byte) -105); var1 != null; var1 = (class746) class239.field3583.method1724(0)) {
            int var38 = var1.field10340;
            if (var38 < 1000) {
                var1.method3387((byte) 121);
                if (var38 == 51 || var38 == 9 || var38 == 45 || var38 == 48 || var38 == 18 || var38 == 49 || var38 == 6) {
                    class422.field5781.method1727(var1, (byte) 103);
                } else {
                    class488.field6868.method1727(var1, (byte) 95);
                }
            }
        }
        class488.field6868.method1730(class239.field3583, (byte) -73);
        class422.field5781.method1730(class239.field3583, (byte) -103);
        if (class618.field8644 > 1) {
            if (class548.field7872 && class629.field8820.method2138(81, -6759) && class618.field8644 > 2) {
                class694.field9692 = (class746) class239.field3583.field3876.field8128.field8128;
            } else {
                class694.field9692 = (class746) class239.field3583.field3876.field8128;
            }
            class762.field10498 = (class746) class239.field3583.field3876.field8128;
        } else {
            class694.field9692 = null;
            class762.field10498 = null;
        }
        int var2 = -1;
        if (arg0 > -103) {
            return;
        }
        class430 var3 = (class430) class772.field10602.method1731((byte) -125);
        if (var3 != null) {
            var2 = var3.method993(-1);
        }
        if (!class626.field8777) {
            if (var2 == 0 && (class16.field303 == 1 && class618.field8644 > 2 || class296.method1929(2000))) {
                var2 = 2;
            }
            if (var2 == 2 && class618.field8644 > 0 && var3 != null) {
                if (class265.field3871 == null && class651.field9094 == 0) {
                    class93.method686(var3.method991(7), 8, var3.method992((byte) 67));
                } else {
                    class635.field8929 = 2;
                }
            }
            if (var2 == 0) {
                if (class694.field9692 != null) {
                    class182.method1294(12164);
                } else if (class691.field9660) {
                    class337.method2136(-161);
                }
            }
            if (class265.field3871 == null && class651.field9094 == 0) {
                class713.field9890 = null;
                class635.field8929 = 0;
                return;
            }
            return;
        }
        if (var2 == -1) {
            int var4 = class152.field2154.method2646(9);
            int var5 = class152.field2154.method2650((byte) -108);
            boolean var6 = false;
            if (class280.field4071 != null) {
                if (class55.field705 - 10 <= var4 && (class55.field705 + class545.field7847 + 10) >= var4 && class724.field10026 - 10 <= var5 && var5 <= (class724.field10026 + class295.field4298 + 10)) {
                    var6 = true;
                } else {
                    class245.method1625(true);
                }
            }
            if (!var6) {
                if (var4 < class109.field1608 - 10 || (class54.field679 + class109.field1608 + 10) < var4 || var5 < (class407.field5549 - 10) || class42.field549 + class407.field5549 + 10 < var5) {
                    class751.method4180(6);
                } else if (class378.field5223) {
                    int var7 = -1;
                    int var8 = -1;
                    for (int var9 = 0; var9 < class310.field4426; var9++) {
                        if (class463.field6530) {
                            int var10 = class407.field5549 - (-(var9 * 16) - 33);
                            if (var5 > var10 - 13 && (var10 + 4) > var5) {
                                var7 = var9;
                                var8 = var10 - 13;
                                break;
                            }
                        } else {
                            int var11 = var9 * 16 + class407.field5549 + 31;
                            if (var5 > (var11 - 13) && var5 < (var11 + 3)) {
                                var8 = var11 - 13;
                                var7 = var9;
                                break;
                            }
                        }
                    }
                    if (var7 != -1) {
                        int var12 = 0;
                        class774 var13 = new class774(class371.field5135);
                        for (class753 var14 = (class753) var13.method4266((byte) -127); var14 != null; var14 = (class753) var13.method4263(-2900)) {
                            if (var7 == var12) {
                                if (var14.field10409 > 1) {
                                    class273.method1760(var5, 0, var8, var14);
                                }
                                break;
                            }
                            var12++;
                        }
                    }
                }
            }
        }
        if (var2 != 0) {
            return;
        }
        int var15 = var3.method992((byte) 67);
        int var16 = var3.method991(7);
        if (class280.field4071 != null && var15 >= class55.field705 && (class55.field705 + class545.field7847) >= var15 && class724.field10026 <= var16 && (class724.field10026 + class295.field4298) >= var16) {
            int var17 = -1;
            for (int var18 = 0; var18 < class280.field4071.field10409; var18++) {
                if (class463.field6530) {
                    int var22 = class724.field10026 + (var18 * 16) + 33;
                    if (var16 > var22 - 13 && var22 + 4 > var16) {
                        var17 = var18;
                    }
                } else {
                    int var23 = class724.field10026 + (var18 * 16) + 31;
                    if (var16 > var23 - 13 && var16 < (var23 + 3)) {
                        var17 = var18;
                    }
                }
            }
            if (var17 != -1) {
                int var19 = 0;
                class774 var20 = new class774(class280.field4071.field10411);
                for (class746 var21 = (class746) var20.method4266((byte) -127); var21 != null; var21 = (class746) var20.method4263(-2900)) {
                    if (var17 == var19) {
                        class625.method3596(1, var15, var16, var21);
                        break;
                    }
                    var19++;
                }
            }
            class751.method4180(6);
            return;
        }
        if (class109.field1608 > var15 || var15 > (class54.field679 + class109.field1608) || class407.field5549 > var16 || var16 > (class42.field549 + class407.field5549)) {
            return;
        }
        if (!class378.field5223) {
            int var31 = -1;
            for (int var32 = 0; var32 < class618.field8644; var32++) {
                if (class463.field6530) {
                    int var36 = (class618.field8644 - var32 - 1) * 16 + class407.field5549 + 33;
                    if (var36 - 13 < var16 && var36 + 4 > var16) {
                        var31 = var32;
                    }
                } else {
                    int var37 = (class618.field8644 - var32 - 1) * 16 + class407.field5549 + 31;
                    if (var16 > var37 - 13 && var16 < var37 + 3) {
                        var31 = var32;
                    }
                }
            }
            if (var31 != -1) {
                int var33 = 0;
                class226 var34 = new class226(class239.field3583);
                for (class746 var35 = (class746) var34.method1543(-256); var35 != null; var35 = (class746) var34.method1544(false)) {
                    if (var31 == var33) {
                        class625.method3596(1, var15, var16, var35);
                        break;
                    }
                    var33++;
                }
            }
            class751.method4180(6);
            return;
        }
        int var24 = -1;
        for (int var25 = 0; var25 < class310.field4426; var25++) {
            if (class463.field6530) {
                int var26 = class407.field5549 - (-(var25 * 16) - 33);
                if (var16 > (var26 - 13) && var16 < var26 + 4) {
                    var24 = var25;
                    break;
                }
            } else {
                int var27 = var25 * 16 + class407.field5549 + 31;
                if ((var27 - 13) < var16 && (var27 + 3) > var16) {
                    var24 = var25;
                    break;
                }
            }
        }
        if (var24 == -1) {
            return;
        }
        int var28 = 0;
        class774 var29 = new class774(class371.field5135);
        for (class753 var30 = (class753) var29.method4266((byte) -125); var30 != null; var30 = (class753) var29.method4263(-2900)) {
            if (var24 == var28) {
                class625.method3596(1, var15, var16, (class746) var30.field10411.field923.field1600);
                class751.method4180(6);
                return;
            }
            var28++;
        }
        return;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V", line = 475)
    public static void method4318(int arg0) {
        int var1 = 0 % ((49 - arg0) / 59);
        field10820 = null;
        field10822 = null;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)J")
    public abstract long method1512(int arg0);
}
