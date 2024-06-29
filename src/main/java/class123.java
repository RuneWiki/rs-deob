import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class123 {

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "Leia;")
    public static class243 field1662 = new class243();

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "Lmia;")
    public static class63 field1665 = new class63(7, 6);

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "Lec;")
    public static class236 field1667;

    @OriginalMember(owner = "client!ej", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1663++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z[[[Lffa;IIII)Z")
    public static final boolean method883(boolean arg0, class186[][][] arg1, int arg2, int arg3, int arg4, int arg5) {
        field1664++;
        byte var6 = arg0 ? 1 : (byte) (class412.field6195 & 0xFF);
        if (class238.field3469[class341.field4946][arg3][arg2] == var6) {
            return false;
        } else if ((class60.field847[class341.field4946][arg3][arg2] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            if (arg5 != 12434) {
                method884(false);
            }
            class384.field5805[var7] = arg3;
            int var8 = 0;
            int var35 = var7 + 1;
            class657.field9204[var7] = arg2;
            class238.field3469[class341.field4946][arg3][arg2] = var6;
            while (var35 != var8) {
                int var9 = class384.field5805[var8] & 0xFFFF;
                int var10 = class384.field5805[var8] >> 16 & 0xFF;
                int var11 = class384.field5805[var8] >> 24 & 0xFF;
                int var12 = class657.field9204[var8] & 0xFFFF;
                int var13 = class657.field9204[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class60.field847[class341.field4946][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                if (arg1 != null) {
                    label244: for (int var16 = class341.field4946 + 1; var16 <= 3; var16++) {
                        if (arg1[var16] != null && (class60.field847[var16][var9][var12] & 0x8) == 0) {
                            if (var14 && arg1[var16][var9][var12] != null) {
                                if (arg1[var16][var9][var12].field2834 != null) {
                                    int var17 = class296.method1873(arg5 - 12526, var10);
                                    if (arg1[var16][var9][var12].field2834.field168 == var17 || arg1[var16][var9][var12].field2841 != null && arg1[var16][var9][var12].field2841.field168 == var17) {
                                        continue;
                                    }
                                    if (var11 != 0) {
                                        int var18 = class296.method1873(-122, var11);
                                        if (arg1[var16][var9][var12].field2834.field168 == var18 || arg1[var16][var9][var12].field2841 != null && arg1[var16][var9][var12].field2841.field168 == var18) {
                                            continue;
                                        }
                                    }
                                    if (var13 != 0) {
                                        int var19 = class296.method1873(arg5 - 12530, var13);
                                        if (arg1[var16][var9][var12].field2834.field168 == var19 || arg1[var16][var9][var12].field2841 != null && arg1[var16][var9][var12].field2841.field168 == var19) {
                                            continue;
                                        }
                                    }
                                }
                                class186 var20 = arg1[var16][var9][var12];
                                if (var20.field2830 != null) {
                                    for (class754 var21 = var20.field2830; var21 != null; var21 = var21.field10537) {
                                        class119 var22 = var21.field10542;
                                        if (var22 instanceof class721) {
                                            class721 var23 = (class721) var22;
                                            int var24 = var23.method309((byte) -86);
                                            int var25 = var23.method327(-119);
                                            if (var24 == 21) {
                                                var24 = 19;
                                            }
                                            int var26 = var25 << 6 | var24;
                                            if (var10 == var26 || var11 != 0 && var11 == var26 || var13 != 0 && var13 == var26) {
                                                continue label244;
                                            }
                                        }
                                    }
                                }
                            }
                            class186 var27 = arg1[var16][var9][var12];
                            if (var27 != null && var27.field2830 != null) {
                                for (class754 var28 = var27.field2830; var28 != null; var28 = var28.field10537) {
                                    class119 var29 = var28.field10542;
                                    if (var29.field1632 != var29.field1628 || var29.field1626 != var29.field1624) {
                                        for (int var30 = var29.field1628; var30 <= var29.field1632; var30++) {
                                            for (int var31 = var29.field1626; var31 <= var29.field1624; var31++) {
                                                class238.field3469[var16][var30][var31] = var6;
                                            }
                                        }
                                    }
                                }
                            }
                            class238.field3469[var16][var9][var12] = var6;
                            var15 = true;
                        }
                    }
                }
                if (var15) {
                    int var32 = class582.field8287[class341.field4946 + 1].method1787(var9, 19646, var12);
                    if (class193.field2931[arg4] < var32) {
                        class193.field2931[arg4] = var32;
                    }
                    int var33 = var9 << 9;
                    if (var33 < class640.field8989[arg4]) {
                        class640.field8989[arg4] = var33;
                    } else if (class375.field5687[arg4] < var33) {
                        class375.field5687[arg4] = var33;
                    }
                    int var34 = var12 << 9;
                    if (var34 < class242.field3535[arg4]) {
                        class242.field3535[arg4] = var34;
                    } else if (var34 > class421.field6281[arg4]) {
                        class421.field6281[arg4] = var34;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class238.field3469[class341.field4946][var9 - 1][var12] != var6) {
                        class384.field5805[var35] = class625.method3600(-754974720, class625.method3600(1179648, var9 - 1));
                        class657.field9204[var35] = class625.method3600(1245184, var12);
                        class238.field3469[class341.field4946][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < class255.field3656) {
                        if (var9 - 1 >= 0 && class238.field3469[class341.field4946][var9 - 1][var12] != var6 && (class60.field847[class341.field4946][var9][var12] & 0x4) == 0 && (class60.field847[class341.field4946][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class384.field5805[var35] = class625.method3600(class625.method3600(1179648, var9 - 1), 1375731712);
                            class657.field9204[var35] = class625.method3600(var12, 1245184);
                            class238.field3469[class341.field4946][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class238.field3469[class341.field4946][var9][var12] != var6) {
                            class384.field5805[var35] = class625.method3600(318767104, class625.method3600(5373952, var9));
                            class657.field9204[var35] = class625.method3600(var12, 5439488);
                            class238.field3469[class341.field4946][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class194.field2946 > (var9 + 1) && class238.field3469[class341.field4946][var9 + 1][var12] != var6 && (class60.field847[class341.field4946][var9][var12] & 0x4) == 0 && (class60.field847[class341.field4946][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class384.field5805[var35] = class625.method3600(-1845493760, class625.method3600(var9 + 1, 5373952));
                            class657.field9204[var35] = class625.method3600(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class238.field3469[class341.field4946][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (class194.field2946 > (var9 + 1) && class238.field3469[class341.field4946][var9 + 1][var12] != var6) {
                        class384.field5805[var35] = class625.method3600(1392508928, class625.method3600(9568256, var9 + 1));
                        class657.field9204[var35] = class625.method3600(9633792, var12);
                        class238.field3469[class341.field4946][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class238.field3469[class341.field4946][var9 - 1][var12] != var6 && (class60.field847[class341.field4946][var9][var12] & 0x4) == 0 && (class60.field847[class341.field4946][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class384.field5805[var35] = class625.method3600(301989888, class625.method3600(13762560, var9 - 1));
                            class657.field9204[var35] = class625.method3600(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class238.field3469[class341.field4946][var9 - 1][var12] = var6;
                        }
                        if (class238.field3469[class341.field4946][var9][var12] != var6) {
                            class384.field5805[var35] = class625.method3600(class625.method3600(13762560, var9), -1828716544);
                            class657.field9204[var35] = class625.method3600(var12, 13828096);
                            class238.field3469[class341.field4946][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < class194.field2946 && class238.field3469[class341.field4946][var9 + 1][var12] != var6 && (class60.field847[class341.field4946][var9][var12] & 0x4) == 0 && (class60.field847[class341.field4946][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class384.field5805[var35] = class625.method3600(class625.method3600(var9 + 1, 9568256), -771751936);
                            class657.field9204[var35] = class625.method3600(var12, 9633792);
                            var35 = var35 + 1 & 0xFFF;
                            class238.field3469[class341.field4946][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class193.field2931[arg4] != -1000000) {
                class193.field2931[arg4] += 40;
                class640.field8989[arg4] -= 512;
                class375.field5687[arg4] += 512;
                class421.field6281[arg4] += 512;
                class242.field3535[arg4] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
    public static void method884(boolean arg0) {
        field1662 = null;
        field1667 = null;
        field1665 = null;
        if (!arg0) {
            field1662 = null;
        }
    }
}
