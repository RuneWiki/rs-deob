import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class426 {

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZIBII[[[Lhg;)Z")
    public static final boolean method2542(boolean arg0, int arg1, byte arg2, int arg3, int arg4, class468[][][] arg5) {
        field6286++;
        byte var6 = arg0 ? 1 : (byte) (class287.field4103 & 0xFF);
        if (class449.field6546[class355.field5121][arg1][arg4] == var6) {
            return false;
        } else if ((class379.field5661[class355.field5121][arg1][arg4] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class428.field6311[var7] = arg1;
            if (arg2 < 55) {
                method2542(true, -75, (byte) -20, -8, -24, null);
            }
            int var8 = 0;
            int var35 = var7 + 1;
            class457.field6665[var7] = arg4;
            class449.field6546[class355.field5121][arg1][arg4] = var6;
            while (var35 != var8) {
                int var9 = class428.field6311[var8] & 0xFFFF;
                int var10 = (class428.field6311[var8] & 0xFF7462) >> 16;
                int var11 = class428.field6311[var8] >> 24 & 0xFF;
                int var12 = class457.field6665[var8] & 0xFFFF;
                int var13 = (class457.field6665[var8] & 0xFFEB11) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class379.field5661[class355.field5121][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class355.field5121 + 1; var16 <= 3; var16++) {
                    if ((class379.field5661[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg5[var16][var9][var12] != null) {
                            if (arg5[var16][var9][var12].field6778 != null) {
                                int var20 = class221.method1368(var10, 4);
                                if (arg5[var16][var9][var12].field6778.field5933 == var20 || arg5[var16][var9][var12].field6766 != null && arg5[var16][var9][var12].field6766.field5933 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class221.method1368(var11, 4);
                                    if (arg5[var16][var9][var12].field6778.field5933 == var21 || arg5[var16][var9][var12].field6766 != null && arg5[var16][var9][var12].field6766.field5933 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class221.method1368(var13, 4);
                                    if (arg5[var16][var9][var12].field6778.field5933 == var22 || arg5[var16][var9][var12].field6766 != null && arg5[var16][var9][var12].field6766.field5933 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class468 var23 = arg5[var16][var9][var12];
                            if (var23.field6769 != null) {
                                for (class323 var24 = var23.field6769; var24 != null; var24 = var24.field4727) {
                                    class210 var25 = var24.field4726;
                                    if (var25 instanceof class113) {
                                        class113 var26 = (class113) var25;
                                        int var27 = var26.method362((byte) -72);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method359(13228);
                                        int var29 = var28 << 6 | var27;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class468 var30 = arg5[var16][var9][var12];
                        if (var30 != null && var30.field6769 != null) {
                            for (class323 var31 = var30.field6769; var31 != null; var31 = var31.field4727) {
                                class210 var32 = var31.field4726;
                                if (var32.field2972 != var32.field2962 || var32.field2975 != var32.field2957) {
                                    for (int var33 = var32.field2972; var33 <= var32.field2962; var33++) {
                                        for (int var34 = var32.field2975; var34 <= var32.field2957; var34++) {
                                            class449.field6546[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class449.field6546[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class311.field4527[class355.field5121 + 1].method848(var9, var12);
                    if (class67.field1008[arg3] < var17) {
                        class67.field1008[arg3] = var17;
                    }
                    int var18 = var9 << 7;
                    if (var18 < class389.field5778[arg3]) {
                        class389.field5778[arg3] = var18;
                    } else if (class157.field2058[arg3] < var18) {
                        class157.field2058[arg3] = var18;
                    }
                    int var19 = var12 << 7;
                    if (var19 < class16.field233[arg3]) {
                        class16.field233[arg3] = var19;
                    } else if (var19 > class498.field7586[arg3]) {
                        class498.field7586[arg3] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class449.field6546[class355.field5121][var9 - 1][var12] != var6) {
                        class428.field6311[var35] = class51.method379(-754974720, class51.method379(var9 - 1, 1179648));
                        class457.field6665[var35] = class51.method379(var12, 1245184);
                        class449.field6546[class355.field5121][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < class203.field2813) {
                        if (var9 - 1 >= 0 && class449.field6546[class355.field5121][var9 - 1][var12] != var6 && (class379.field5661[class355.field5121][var9][var12] & 0x4) == 0 && (class379.field5661[class355.field5121][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class428.field6311[var35] = class51.method379(1375731712, class51.method379(1179648, var9 - 1));
                            class457.field6665[var35] = class51.method379(1245184, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class449.field6546[class355.field5121][var9 - 1][var12] = var6;
                        }
                        if (class449.field6546[class355.field5121][var9][var12] != var6) {
                            class428.field6311[var35] = class51.method379(class51.method379(var9, 5373952), 318767104);
                            class457.field6665[var35] = class51.method379(var12, 5439488);
                            class449.field6546[class355.field5121][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class362.field5442 > var9 + 1 && class449.field6546[class355.field5121][var9 + 1][var12] != var6 && (class379.field5661[class355.field5121][var9][var12] & 0x4) == 0 && (class379.field5661[class355.field5121][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class428.field6311[var35] = class51.method379(class51.method379(5373952, var9 + 1), -1845493760);
                            class457.field6665[var35] = class51.method379(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class449.field6546[class355.field5121][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if ((var9 + 1) < class362.field5442 && class449.field6546[class355.field5121][var9 + 1][var12] != var6) {
                        class428.field6311[var35] = class51.method379(class51.method379(var9 + 1, 9568256), 1392508928);
                        class457.field6665[var35] = class51.method379(9633792, var12);
                        class449.field6546[class355.field5121][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class449.field6546[class355.field5121][var9 - 1][var12] != var6 && (class379.field5661[class355.field5121][var9][var12] & 0x4) == 0 && (class379.field5661[class355.field5121][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class428.field6311[var35] = class51.method379(class51.method379(13762560, var9 - 1), 301989888);
                            class457.field6665[var35] = class51.method379(var12, 13828096);
                            class449.field6546[class355.field5121][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class449.field6546[class355.field5121][var9][var12] != var6) {
                            class428.field6311[var35] = class51.method379(class51.method379(13762560, var9), -1828716544);
                            class457.field6665[var35] = class51.method379(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class449.field6546[class355.field5121][var9][var12] = var6;
                        }
                        if ((var9 + 1) < class362.field5442 && class449.field6546[class355.field5121][var9 + 1][var12] != var6 && (class379.field5661[class355.field5121][var9][var12] & 0x4) == 0 && (class379.field5661[class355.field5121][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class428.field6311[var35] = class51.method379(-771751936, class51.method379(9568256, var9 + 1));
                            class457.field6665[var35] = class51.method379(var12, 9633792);
                            var35 = var35 + 1 & 0xFFF;
                            class449.field6546[class355.field5121][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class67.field1008[arg3] != -1000000) {
                class67.field1008[arg3] += 10;
                class389.field5778[arg3] -= 50;
                class157.field2058[arg3] += 50;
                class498.field7586[arg3] += 50;
                class16.field233[arg3] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)Ljava/lang/String;")
    public static final String method2543(int arg0) {
        field6287++;
        String var1 = "www";
        if (arg0 != 14055) {
            return null;
        }
        if (class371.field5567 == class31.field525) {
            var1 = "www-wtrc";
        } else if (class384.field5699 == class371.field5567) {
            var1 = "www-wtqa";
        } else if (class371.field5567 == class153.field1964) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class477.field6870 != null) {
            var2 = "/p=" + class477.field6870;
        }
        return "http://" + var1 + "." + class156.field1996.field4339 + ".com/l=" + class81.field1122 + "/a=" + class111.field1456 + var2 + "/";
    }

    @OriginalMember(owner = "client!tq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6285++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(II)V")
    public class426(int arg0, int arg1) {
    }
}
