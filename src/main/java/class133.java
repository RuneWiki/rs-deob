import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public abstract class class133 {

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "[I")
    public static int[] field2223 = new int[25];

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public static int field2226 = -1;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "[I")
    public static int[] field2228 = new int[32];

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "F")
    public static float field2232 = 0.0F;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "Lnea;")
    public static class600 field2225 = new class600(4);

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V", line = 3)
    public static void method1103(byte arg0) {
        field2228 = null;
        if (arg0 < -60) {
            field2225 = null;
            field2223 = null;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V", line = 27)
    public static final void method1104(int arg0) {
        field2224++;
        if (!class383.field5382) {
            class791.field10833 = class309.field4408 != -1 && class309.field4408 <= class624.field8863 || class624.field8863 * 16 + (class233.field3393 ? 26 : 22) > class448.field6174;
        }
        class281.field4057.method3735(-4676);
        class122.field2075.method3735(-4676);
        for (class554 var1 = (class554) class521.field7310.method3731((byte) -126); var1 != null; var1 = (class554) class521.field7310.method3729((byte) 11)) {
            int var38 = var1.field7682;
            if (var38 < 1000) {
                var1.method4237(-1);
                if (var38 == 48 || var38 == 44 || var38 == 17 || var38 == 13 || var38 == 16 || var38 == 18 || var38 == 12) {
                    class122.field2075.method3728((byte) 112, var1);
                } else {
                    class281.field4057.method3728((byte) 125, var1);
                }
            }
        }
        class281.field4057.method3734(class521.field7310, true);
        if (arg0 <= 8) {
            return;
        }
        class122.field2075.method3734(class521.field7310, true);
        if (class624.field8863 <= 1) {
            class493.field6765 = null;
            class152.field2434 = null;
        } else {
            if (class553.field7666 && class681.field9656.method681((byte) 102, 81) && class624.field8863 > 2) {
                class493.field6765 = (class554) class521.field7310.field9375.field10584.field10584;
            } else {
                class493.field6765 = (class554) class521.field7310.field9375.field10584;
            }
            class152.field2434 = (class554) class521.field7310.field9375.field10584;
        }
        int var2 = -1;
        class453 var3 = (class453) class397.field5480.method3731((byte) -66);
        if (var3 != null) {
            var2 = var3.method1868((byte) -38);
        }
        if (!class383.field5382) {
            if (var2 == 0 && (class194.field2907 == 1 && class624.field8863 > 2 || class278.method1775((byte) -101))) {
                var2 = 2;
            }
            if (var2 == 2 && class624.field8863 > 0 && var3 != null) {
                if (class766.field10586 == null && class653.field9249 == 0) {
                    class448.method2650(-11241, var3.method1869((byte) -26), var3.method1873(28));
                } else {
                    class17.field185 = 2;
                }
            }
            if (var2 == 0) {
                if (class493.field6765 != null) {
                    class707.method3948((byte) 119);
                } else if (class295.field4298) {
                    class558.method3253(90);
                }
            }
            if (class766.field10586 != null || class653.field9249 != 0) {
                return;
            }
            class409.field5612 = null;
            class17.field185 = 0;
            return;
        }
        if (var2 == -1) {
            int var4 = class754.field10496.method3065(-28062);
            int var5 = class754.field10496.method3066(72);
            boolean var6 = false;
            if (class346.field4933 != null) {
                if (var4 >= class653.field9248 - 10 && var4 <= class653.field9248 + class362.field5138 + 10 && class541.field7494 - 10 <= var5 && class778.field10681 + class541.field7494 + 10 >= var5) {
                    var6 = true;
                } else {
                    class609.method3528((byte) 5);
                }
            }
            if (!var6) {
                if (var4 < (class295.field4297 - 10) || class295.field4297 + class414.field5678 + 10 < var4 || var5 < (class389.field5438 - 10) || (class72.field1137 + class389.field5438 + 10) < var5) {
                    class95.method796(-22907);
                } else if (class791.field10833) {
                    int var7 = -1;
                    int var8 = -1;
                    for (int var9 = 0; var9 < class81.field1197; var9++) {
                        if (class233.field3393) {
                            int var10 = var9 * 16 + class389.field5438 + 33;
                            if ((var10 - 13) < var5 && var5 < (var10 + 4)) {
                                var8 = var10 - 13;
                                var7 = var9;
                                break;
                            }
                        } else {
                            int var11 = var9 * 16 + class389.field5438 + 31;
                            if (var5 > var11 - 13 && var5 < var11 + 3) {
                                var8 = var11 - 13;
                                var7 = var9;
                                break;
                            }
                        }
                    }
                    if (var7 != -1) {
                        int var12 = 0;
                        class652 var13 = new class652(class496.field6807);
                        for (class551 var14 = (class551) var13.method3671(0); var14 != null; var14 = (class551) var13.method3672(0)) {
                            if (var7 == var12) {
                                if (var14.field7643 > 1) {
                                    class678.method3809(var5, var8, (byte) 22, var14);
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
        int var15 = var3.method1873(59);
        int var16 = var3.method1869((byte) 126);
        if (class346.field4933 != null && var15 >= class653.field9248 && var15 <= (class653.field9248 + class362.field5138) && class541.field7494 <= var16 && class541.field7494 + class778.field10681 >= var16) {
            int var17 = -1;
            for (int var18 = 0; var18 < class346.field4933.field7643; var18++) {
                if (class233.field3393) {
                    int var23 = class541.field7494 + (var18 * 16) + 33;
                    if (var16 > var23 - 13 && var16 < var23 + 4) {
                        var17 = var18;
                    }
                } else {
                    int var22 = var18 * 16 + class541.field7494 + 31;
                    if (var16 > var22 - 13 && var16 < var22 + 3) {
                        var17 = var18;
                    }
                }
            }
            if (var17 != -1) {
                int var19 = 0;
                class652 var20 = new class652(class346.field4933.field7645);
                for (class554 var21 = (class554) var20.method3671(0); var21 != null; var21 = (class554) var20.method3672(0)) {
                    if (var17 == var19) {
                        class701.method3931(var15, var16, true, var21);
                        break;
                    }
                    var19++;
                }
            }
            class95.method796(-22907);
            return;
        }
        if (var15 < class295.field4297 || class295.field4297 + class414.field5678 < var15 || var16 < class389.field5438 || var16 > class72.field1137 + class389.field5438) {
            return;
        }
        if (class791.field10833) {
            int var24 = -1;
            for (int var25 = 0; var25 < class81.field1197; var25++) {
                if (class233.field3393) {
                    int var27 = var25 * 16 + class389.field5438 + 33;
                    if (var16 > (var27 - 13) && var16 < (var27 + 4)) {
                        var24 = var25;
                        break;
                    }
                } else {
                    int var26 = class389.field5438 + (var25 * 16) + 31;
                    if (var26 - 13 < var16 && var16 < var26 + 3) {
                        var24 = var25;
                        break;
                    }
                }
            }
            if (var24 != -1) {
                int var28 = 0;
                class652 var29 = new class652(class496.field6807);
                for (class551 var30 = (class551) var29.method3671(0); var30 != null; var30 = (class551) var29.method3672(0)) {
                    if (var24 == var28) {
                        class701.method3931(var15, var16, true, (class554) var30.field7645.field332.field6213);
                        class95.method796(-22907);
                        return;
                    }
                    var28++;
                }
                return;
            }
        } else {
            int var31 = -1;
            for (int var32 = 0; var32 < class624.field8863; var32++) {
                if (class233.field3393) {
                    int var37 = (class624.field8863 - var32 - 1) * 16 + class389.field5438 + 33;
                    if ((var37 - 13) < var16 && var16 < var37 + 4) {
                        var31 = var32;
                    }
                } else {
                    int var36 = (class624.field8863 - var32 - 1) * 16 + class389.field5438 + 31;
                    if (var16 > (var36 - 13) && var16 < (var36 + 3)) {
                        var31 = var32;
                    }
                }
            }
            if (var31 != -1) {
                int var33 = 0;
                class710 var34 = new class710(class521.field7310);
                for (class554 var35 = (class554) var34.method3958(98); var35 != null; var35 = (class554) var34.method3957(-121)) {
                    if (var31 == var33) {
                        class701.method3931(var15, var16, true, var35);
                        break;
                    }
                    var33++;
                }
            }
            class95.method796(-22907);
        }
        return;
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)Z", line = 431)
    public static final boolean method1105(int arg0) {
        if (arg0 != -9502) {
            field2225 = null;
        }
        field2229++;
        if (class781.field10717) {
            try {
                class154.method1204(class343.field4881, "showVideoAd", 22458);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIII)V", line = 453)
    public static final void method1106(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -13) {
            method1107(-22, -78, -64, (byte) -51, -128, 66);
        }
        field2227++;
        int var4 = arg0 * class420.field5820.field9491.method1367(arg3 ^ 0xFFFFBB70) >> 8;
        if (var4 == 0 || arg1 == -1) {
            return;
        }
        if (!class301.field4330 && class371.field5236 != -1 && class556.method3205(true) && !class365.method2195(-6021)) {
            class602.field8558 = class565.method3293(-15561);
            class477 var5 = class645.method3654(-18547, class602.field8558);
            class222.method1526(-32672, true, var5);
        }
        class531.method3095(arg1, arg3 ^ 0xFFFFFF9E, var4, class397.field5478, 0, false);
        class705.method3943(false, 255, -1);
        class301.field4330 = true;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIBII)V", line = 483)
    public static final void method1107(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field2231++;
        if (arg0 == arg1) {
            class473.method2761(arg2, 8, arg1, arg4, arg5);
        } else if (arg3 == -44) {
            if (arg2 - arg1 >= class742.field10301 && (arg1 + arg2) <= class435.field6058 && class515.field7102 <= (arg5 - arg0) && class698.field9801 >= (arg5 + arg0)) {
                class28.method232(arg3 - 82, arg5, arg1, arg2, arg0, arg4);
            } else {
                class472.method2758(arg5, (byte) 115, arg2, arg4, arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)Lww;", line = 512)
    public static final class338 method1109(int arg0, int arg1, int arg2) {
        class172 var3 = class514.field7096[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2593;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(BLtk;)Ltk;")
    public abstract class112 method1108(byte arg0, class112 arg1);
}
