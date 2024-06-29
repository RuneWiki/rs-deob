import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class518 extends class165 {

    @OriginalMember(owner = "client!iaa", name = "v", descriptor = "Lle;")
    public static class321 field7401 = null;

    @OriginalMember(owner = "client!iaa", name = "p", descriptor = "I")
    public static int field7395;

    @OriginalMember(owner = "client!iaa", name = "q", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!iaa", name = "s", descriptor = "I")
    private int field7398;

    @OriginalMember(owner = "client!iaa", name = "t", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!iaa", name = "w", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!iaa", name = "x", descriptor = "I")
    public static int field7403;

    @OriginalMember(owner = "client!iaa", name = "y", descriptor = "I")
    public static int field7404;

    @OriginalMember(owner = "client!iaa", name = "r", descriptor = "J")
    private long field7397;

    @OriginalMember(owner = "client!iaa", name = "u", descriptor = "Lcb;")
    public static class544 field7400;

    @OriginalMember(owner = "client!iaa", name = "z", descriptor = "Lip;")
    public static class734 field7405;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)V", line = 5)
    public static final void method3013(int arg0, int arg1) {
        field7404++;
        int var2 = class673.field9441 - class179.field2718;
        if (var2 >= 100) {
            class763.field10510 = 1;
            class180.field2732 = -1;
            class406.field5746 = -1;
            return;
        }
        int var3 = (int) class509.field7256;
        if ((class288.field4400 >> 8) > var3) {
            var3 = class288.field4400 >> 8;
        }
        if (class259.field3641[4] && var3 < class369.field5311[4] + 128) {
            var3 = class369.field5311[4] + 128;
        }
        int var4 = (int) class562.field8001 + class87.field1122 & 0x3FFF;
        if (arg0 != 6606) {
            method3014(125, -114);
        }
        class1.method11(var4, (byte) -108, (var3 >> 3) * 3 + 600 << 2, class238.field3434, arg1, class4.field54, var3, class580.method3366(class410.field5771, (byte) -95, class251.field3549.field7719, class251.field3549.field7718) - 200);
        float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
        class655.field9241 = (int) ((float) (class655.field9241 - class277.field3867) * var5 + (float) class277.field3867);
        class277.field3866 = (int) ((float) (class277.field3866 - class303.field4542) * var5 + (float) class303.field4542);
        class689.field9757 = (int) ((float) (class689.field9757 - class180.field2733) * var5 + (float) class180.field2733);
        class359.field5216 = (int) ((float) (class359.field5216 - class277.field3864) * var5 + (float) class277.field3864);
        int var6 = class118.field1478 - class672.field9412;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class118.field1478 = (int) ((float) var6 * var5 + (float) class672.field9412);
        class118.field1478 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(II)Lwq;", line = 53)
    public static final class176 method3014(int arg0, int arg1) {
        field7403++;
        int var2 = -9 % ((25 - arg1) / 50);
        int var3 = arg0 >> 16;
        int var4 = arg0 & 0xFFFF;
        if (class110.field1382[var3] == null || class110.field1382[var3][var4] == null) {
            boolean var5 = class420.method2512((byte) 43, var3);
            if (!var5) {
                return null;
            }
        }
        return class110.field1382[var3][var4];
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ILmia;)V", line = 81)
    public final void method612(int arg0, class69 arg1) {
        field7402++;
        if (arg0 >= -100) {
            this.method612(-94, null);
        }
        arg1.method544(-18121, this.field7398, this.field7397);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)V", line = 97)
    public static final void method3015(int arg0) {
        if (arg0 > -48) {
            field7401 = null;
        }
        if (class576.field8143 > 1) {
            class145.field1852.method3632(class145.field1852.field9006, true, 4);
        } else {
            class145.field1852.method3632(class145.field1852.field9006, true, 2);
        }
        field7395++;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZILts;)V", line = 122)
    public static final void method3016(boolean arg0, int arg1, class559 arg2) {
        field7399++;
        if (arg1 != 5385) {
            method3014(54, -33);
        }
        if (class543.field7608 >= 400) {
            return;
        }
        if (class251.field3549 != arg2) {
            String var3;
            if (arg2.field7971 == 0) {
                boolean var4 = true;
                if (class251.field3549.field7970 != -1 && arg2.field7970 != -1) {
                    int var5 = arg2.field7970 > class251.field3549.field7970 ? class251.field3549.field7970 : arg2.field7970;
                    int var6 = class251.field3549.field7975 - arg2.field7975;
                    if (var6 < 0) {
                        var6 = -var6;
                    }
                    if (var6 > var5) {
                        var4 = false;
                    }
                }
                String var7 = class536.field7555 == class23.field344 ? class674.field9581.method3825((byte) -10, class526.field7494) : class674.field9579.method3825((byte) -10, class526.field7494);
                if (arg2.field7975 < arg2.field7962) {
                    var3 = arg2.method3239(true, -64) + (var4 ? class653.method3740(arg2.field7975, (byte) 33, class251.field3549.field7975) : "<col=ffffff>") + " (" + var7 + arg2.field7975 + "+" + (arg2.field7962 - arg2.field7975) + ")";
                } else {
                    var3 = arg2.method3239(true, -47) + (var4 ? class653.method3740(arg2.field7975, (byte) 122, class251.field3549.field7975) : "<col=ffffff>") + " (" + var7 + arg2.field7975 + ")";
                }
            } else if (arg2.field7971 == -1) {
                var3 = arg2.method3239(true, arg1 - 5510);
            } else {
                var3 = arg2.method3239(true, -5) + " (" + class674.field9580.method3825((byte) -10, class526.field7494) + arg2.field7971 + ")";
            }
            if (class26.field382 && !arg0 && (class641.field9043 & 0x8) != 0) {
                class272.field3802++;
                class502.method2933(45, class373.field5373 + " -> <col=ffffff>" + var3, true, -1, arg1 ^ 0xE2A, class361.field5239, class75.field1013, (long) arg2.field6361, false, false, 0, 0, (long) arg2.field6361);
            }
            if (arg0) {
                class502.method2933(-1, "", false, 0, 6947, "<col=cccccc>" + var3, -1, (long) arg2.field6361, true, false, 0, 0, 0L);
            } else {
                for (int var8 = 7; var8 >= 0; var8--) {
                    if (class651.field9180[var8] != null) {
                        short var9 = 0;
                        if (class536.field7555 == class234.field3384 && class651.field9180[var8].equalsIgnoreCase(class674.field9574.method3825((byte) -10, class526.field7494))) {
                            if (class634.field8938 && class251.field3549.field7975 < arg2.field7975) {
                                var9 = 2000;
                            }
                            if (class251.field3549.field7952 == 0 || arg2.field7952 == 0) {
                                if (arg2.field7948) {
                                    var9 = 2000;
                                }
                            } else if (class251.field3549.field7952 == arg2.field7952) {
                                var9 = 2000;
                            } else {
                                var9 = 0;
                            }
                        } else if (class262.field3707[var8]) {
                            var9 = 2000;
                        }
                        short var10 = (short) (class763.field10507[var8] + var9);
                        int var11 = class147.field1888[var8] == -1 ? class23.field347 : class147.field1888[var8];
                        class648.field9115++;
                        class502.method2933(var10, "<col=ffffff>" + var3, true, -1, 6947, class651.field9180[var8], var11, (long) arg2.field6361, false, false, 0, 0, (long) arg2.field6361);
                    }
                }
            }
            if (!arg0) {
                for (class312 var12 = (class312) class551.field7826.method2508((byte) 108); var12 != null; var12 = (class312) class551.field7826.method2505((byte) -55)) {
                    if (var12.field4640 == 18) {
                        var12.field4636 = "<col=ffffff>" + var3;
                        return;
                    }
                }
            }
        } else if (class26.field382 && (class641.field9043 & 0x10) != 0) {
            class751.field10413++;
            class502.method2933(13, class373.field5373 + " -> <col=ffffff>" + class674.field9588.method3825((byte) -10, class526.field7494), true, -1, 6947, class361.field5239, class75.field1013, (long) arg2.field6361, false, false, 0, 0, 0L);
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lrv;I)V", line = 285)
    public final void method614(class120 arg0, int arg1) {
        field7396++;
        this.field7398 = arg0.method871(23995);
        if (arg1 != 1070) {
            this.field7397 = 36L;
        }
        this.field7397 = arg0.method834(arg1 ^ 0xFFFFDA76);
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(I)V", line = 297)
    public static void method3017(int arg0) {
        if (arg0 != -128) {
            field7400 = null;
        }
        field7401 = null;
        field7400 = null;
        field7405 = null;
    }
}
