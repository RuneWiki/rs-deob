import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class671 {

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public static int field8997;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "I")
    public static int field8998;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    public static int field8999;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "I")
    public static int field9000;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IBII)I", line = 7)
    public static final int method3700(int arg0, byte arg1, int arg2, int arg3) {
        field8997++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else if (arg1 == 65) {
            return 7 - arg3;
        } else {
            return 14;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(BB)V", line = 31)
    public static final void method3701(byte arg0, byte arg1) {
        field8999++;
        if (class641.field8644 == null) {
            class641.field8644 = new byte[4][class102.field1467][class393.field5663];
        }
        if (arg0 >= -34) {
            return;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class102.field1467; var3++) {
                for (int var4 = 0; var4 < class393.field5663; var4++) {
                    class641.field8644[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)Z", line = 69)
    public static final boolean method3702(int arg0) {
        field8998++;
        if (arg0 != 21573) {
            method3702(-85);
        }
        return class289.field4115 != 0;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V", line = 81)
    public static final void method3703(int arg0) {
        if (!class677.field9075) {
            class30.field301 = class676.field9069 != -1 && class676.field9069 <= class269.field3929 || class693.field9222 < (class348.field5048 ? 26 : 22) + class269.field3929 * 16;
        }
        field9000++;
        class105.field1490.method690(20134);
        class37.field388.method690(arg0 - 9314);
        for (class478 var1 = (class478) class645.field8695.method679((byte) -86); var1 != null; var1 = (class478) class645.field8695.method681(-51)) {
            int var38 = var1.field6718;
            if (var38 < 1000) {
                var1.method1102((byte) 89);
                if (var38 == 3 || var38 == 4 || var38 == 13 || var38 == 49 || var38 == 30 || var38 == 10 || var38 == 57) {
                    class37.field388.method689(var1, -6);
                } else {
                    class105.field1490.method689(var1, 5);
                }
            }
        }
        class105.field1490.method682(class645.field8695, arg0 - 29448);
        class37.field388.method682(class645.field8695, 0);
        if (class269.field3929 > 1) {
            if (class186.field2437 && class235.field3128.method983(101, 81) && class269.field3929 > 2) {
                class191.field2474 = (class478) class645.field8695.field1194.field2144.field2144;
            } else {
                class191.field2474 = (class478) class645.field8695.field1194.field2144;
            }
            class138.field1863 = (class478) class645.field8695.field1194.field2144;
        } else {
            class138.field1863 = null;
            class191.field2474 = null;
        }
        int var2 = -1;
        if (arg0 != 29448) {
            method3703(-74);
        }
        class428 var3 = (class428) class318.field4527.method679((byte) -86);
        if (var3 != null) {
            var2 = var3.method376((byte) -29);
        }
        if (!class677.field9075) {
            if (var2 == 0 && (class151.field2051 == 1 && class269.field3929 > 2 || class563.method3207((byte) -48))) {
                var2 = 2;
            }
            if (var2 == 2 && class269.field3929 > 0 && var3 != null) {
                if (class528.field7306 == null && class28.field281 == 0) {
                    class202.method1332(15460, var3.method375(110), var3.method379(true));
                } else {
                    class333.field4719 = 2;
                }
            }
            if (var2 == 0) {
                if (class191.field2474 != null) {
                    class453.method2694(arg0 ^ 0xFFFF8C88);
                } else if (class506.field7094) {
                    class579.method3278(-1);
                }
            }
            if (class528.field7306 == null && class28.field281 == 0) {
                class295.field4181 = null;
                class333.field4719 = 0;
                return;
            }
            return;
        }
        if (var2 == -1) {
            int var4 = class494.field6961.method1652(0);
            int var5 = class494.field6961.method1663((byte) 118);
            boolean var6 = false;
            if (class740.field10028 != null) {
                if ((class271.field3950 - 10) <= var4 && class588.field8032 + class271.field3950 + 10 >= var4 && var5 >= class696.field9241 - 10 && class696.field9241 - (-class626.field8480 - 10) >= var5) {
                    var6 = true;
                } else {
                    class342.method2177(0);
                }
            }
            if (!var6) {
                if (var4 < (class92.field1298 - 10) || (class92.field1298 + class677.field9082 + 10) < var4 || var5 < (class632.field8551 - 10) || class632.field8551 + class625.field8477 + 10 < var5) {
                    class469.method2748((byte) -78);
                } else if (class30.field301) {
                    int var7 = -1;
                    int var8 = -1;
                    for (int var9 = 0; var9 < class382.field5558; var9++) {
                        if (class348.field5048) {
                            int var10 = var9 * 16 + (class632.field8551 + 33);
                            if ((var10 - 13) < var5 && (var10 + 4) > var5) {
                                var7 = var9;
                                var8 = var10 - 13;
                                break;
                            }
                        } else {
                            int var11 = class632.field8551 + (var9 * 16) + 31;
                            if (var11 - 13 < var5 && (var11 + 3) > var5) {
                                var7 = var9;
                                var8 = var11 - 13;
                                break;
                            }
                        }
                    }
                    if (var7 != -1) {
                        int var12 = 0;
                        class542 var13 = new class542(class716.field9763);
                        for (class641 var14 = (class641) var13.method3133((byte) -75); var14 != null; var14 = (class641) var13.method3134((byte) 54)) {
                            if (var7 == var12) {
                                if (var14.field8639 > 1) {
                                    class200.method1315(85, var8, var5, var14);
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
        int var15 = var3.method375(arg0 - 29329);
        int var16 = var3.method379(true);
        if (class740.field10028 != null && var15 >= class271.field3950 && class588.field8032 + class271.field3950 >= var15 && var16 >= class696.field9241 && var16 <= class696.field9241 + class626.field8480) {
            int var17 = -1;
            for (int var18 = 0; var18 < class740.field10028.field8639; var18++) {
                if (class348.field5048) {
                    int var23 = var18 * 16 + class696.field9241 + 33;
                    if (var16 > var23 - 13 && var16 < var23 + 4) {
                        var17 = var18;
                    }
                } else {
                    int var22 = var18 * 16 + class696.field9241 + 31;
                    if ((var22 - 13) < var16 && var16 < var22 + 3) {
                        var17 = var18;
                    }
                }
            }
            if (var17 != -1) {
                int var19 = 0;
                class542 var20 = new class542(class740.field10028.field8636);
                for (class478 var21 = (class478) var20.method3133((byte) -103); var21 != null; var21 = (class478) var20.method3134((byte) 54)) {
                    if (var17 == var19) {
                        class702.method3828(2, var21, var15, var16);
                        break;
                    }
                    var19++;
                }
            }
            class469.method2748((byte) -64);
            return;
        }
        if (var15 < class92.field1298 || var15 > (class92.field1298 + class677.field9082) || var16 < class632.field8551 || (class632.field8551 + class625.field8477) < var16) {
            return;
        }
        if (!class30.field301) {
            int var24 = -1;
            for (int var25 = 0; var25 < class269.field3929; var25++) {
                if (class348.field5048) {
                    int var30 = (class269.field3929 - var25 - 1) * 16 + class632.field8551 + 33;
                    if ((var30 - 13) < var16 && (var30 + 4) > var16) {
                        var24 = var25;
                    }
                } else {
                    int var29 = (class269.field3929 - var25 - 1) * 16 + class632.field8551 + 31;
                    if (var16 > (var29 - 13) && var16 < (var29 + 3)) {
                        var24 = var25;
                    }
                }
            }
            if (var24 != -1) {
                int var26 = 0;
                class305 var27 = new class305(class645.field8695);
                for (class478 var28 = (class478) var27.method1976(false); var28 != null; var28 = (class478) var27.method1977(-18)) {
                    if (var24 == var26) {
                        class702.method3828(arg0 ^ 0x730A, var28, var15, var16);
                        break;
                    }
                    var26++;
                }
            }
            class469.method2748((byte) 15);
            return;
        }
        int var31 = -1;
        for (int var32 = 0; var32 < class382.field5558; var32++) {
            if (class348.field5048) {
                int var33 = class632.field8551 + (var32 * 16) + 33;
                if ((var33 - 13) < var16 && var33 + 4 > var16) {
                    var31 = var32;
                    break;
                }
            } else {
                int var34 = var32 * 16 + class632.field8551 + 31;
                if ((var34 - 13) < var16 && var34 + 3 > var16) {
                    var31 = var32;
                    break;
                }
            }
        }
        if (var31 == -1) {
            return;
        }
        int var35 = 0;
        class542 var36 = new class542(class716.field9763);
        for (class641 var37 = (class641) var36.method3133((byte) -91); var37 != null; var37 = (class641) var36.method3134((byte) 54)) {
            if (var31 == var35) {
                class702.method3828(2, (class478) var37.field8636.field259.field8885, var15, var16);
                class469.method2748((byte) 19);
                return;
            }
            var35++;
        }
    }
}
