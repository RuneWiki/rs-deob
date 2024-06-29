import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class283 {

    @OriginalMember(owner = "client!l", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field4121 = new String[100];

    @OriginalMember(owner = "client!l", name = "h", descriptor = "Lsd;")
    public static class74 field4122 = new class74(54, 2);

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field4124 = 3;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field4126 = -1;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "F")
    public static float field4118;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Lob;")
    public static class227 field4116;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "Lrg;")
    public static class395 field4125;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "[Lrg;")
    public static class395[] field4119;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([[[Lqa;IZIII)Z", line = 9)
    public static final boolean method1774(class263[][][] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field4120++;
        byte var6 = arg2 ? 1 : (byte) (class154.field1858 & 0xFF);
        if (class276.field3945[class100.field1217][arg1][arg3] == var6) {
            return false;
        } else if ((class140.field1686[class100.field1217][arg1][arg3] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            if (arg4 != 1) {
                method1777(-92);
            }
            class122.field1519[var7] = arg1;
            int var8 = 0;
            int var35 = var7 + 1;
            class471.field6642[var7] = arg3;
            class276.field3945[class100.field1217][arg1][arg3] = var6;
            while (var35 != var8) {
                int var9 = class122.field1519[var8] & 0xFFFF;
                int var10 = class122.field1519[var8] >> 16 & 0xFF;
                int var11 = class122.field1519[var8] >> 24 & 0xFF;
                int var12 = class471.field6642[var8] & 0xFFFF;
                int var13 = class471.field6642[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class140.field1686[class100.field1217][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class100.field1217 + 1; var16 <= 3; var16++) {
                    if ((class140.field1686[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg0[var16][var9][var12] != null) {
                            if (arg0[var16][var9][var12].field3783 != null) {
                                int var20 = class369.method2229(32481, var10);
                                if (arg0[var16][var9][var12].field3783.field3761 == var20 || arg0[var16][var9][var12].field3780 != null && arg0[var16][var9][var12].field3780.field3761 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class369.method2229(32481, var11);
                                    if (arg0[var16][var9][var12].field3783.field3761 == var21 || arg0[var16][var9][var12].field3780 != null && arg0[var16][var9][var12].field3780.field3761 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class369.method2229(arg4 ^ 0x7EE0, var13);
                                    if (arg0[var16][var9][var12].field3783.field3761 == var22 || arg0[var16][var9][var12].field3780 != null && arg0[var16][var9][var12].field3780.field3761 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class263 var23 = arg0[var16][var9][var12];
                            if (var23.field3801 != null) {
                                for (class248 var24 = var23.field3801; var24 != null; var24 = var24.field3490) {
                                    class83 var25 = var24.field3487;
                                    if (var25 instanceof class116) {
                                        class116 var26 = (class116) var25;
                                        int var27 = var26.method26((byte) 73);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method31((byte) -109);
                                        int var29 = var28 << 6 | var27;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class263 var30 = arg0[var16][var9][var12];
                        if (var30 != null && var30.field3801 != null) {
                            for (class248 var31 = var30.field3801; var31 != null; var31 = var31.field3490) {
                                class83 var32 = var31.field3487;
                                if (var32.field999 != var32.field1011 || var32.field997 != var32.field1004) {
                                    for (int var33 = var32.field999; var33 <= var32.field1011; var33++) {
                                        for (int var34 = var32.field1004; var34 <= var32.field997; var34++) {
                                            class276.field3945[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class276.field3945[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class398.field5667[class100.field1217 + 1].method1861(var9, var12);
                    if (var17 > class181.field2330[arg5]) {
                        class181.field2330[arg5] = var17;
                    }
                    int var18 = var9 << 7;
                    if (var18 < class208.field2885[arg5]) {
                        class208.field2885[arg5] = var18;
                    } else if (var18 > class173.field2087[arg5]) {
                        class173.field2087[arg5] = var18;
                    }
                    int var19 = var12 << 7;
                    if (var19 < class188.field2548[arg5]) {
                        class188.field2548[arg5] = var19;
                    } else if (var19 > class52.field682[arg5]) {
                        class52.field682[arg5] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class276.field3945[class100.field1217][var9 - 1][var12] != var6) {
                        class122.field1519[var35] = class292.method1841(class292.method1841(1179648, var9 - 1), -754974720);
                        class471.field6642[var35] = class292.method1841(1245184, var12);
                        class276.field3945[class100.field1217][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12++;
                    if (class289.field4316 > var12) {
                        if (var9 - 1 >= 0 && class276.field3945[class100.field1217][var9 - 1][var12] != var6 && (class140.field1686[class100.field1217][var9][var12] & 0x4) == 0 && (class140.field1686[class100.field1217][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class122.field1519[var35] = class292.method1841(class292.method1841(1179648, var9 - 1), 1375731712);
                            class471.field6642[var35] = class292.method1841(var12, 1245184);
                            var35 = var35 + 1 & 0xFFF;
                            class276.field3945[class100.field1217][var9 - 1][var12] = var6;
                        }
                        if (class276.field3945[class100.field1217][var9][var12] != var6) {
                            class122.field1519[var35] = class292.method1841(class292.method1841(5373952, var9), 318767104);
                            class471.field6642[var35] = class292.method1841(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class276.field3945[class100.field1217][var9][var12] = var6;
                        }
                        if (class159.field1895 > var9 + 1 && class276.field3945[class100.field1217][var9 + 1][var12] != var6 && (class140.field1686[class100.field1217][var9][var12] & 0x4) == 0 && (class140.field1686[class100.field1217][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class122.field1519[var35] = class292.method1841(-1845493760, class292.method1841(var9 + 1, 5373952));
                            class471.field6642[var35] = class292.method1841(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class276.field3945[class100.field1217][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (class159.field1895 > var9 + 1 && class276.field3945[class100.field1217][var9 + 1][var12] != var6) {
                        class122.field1519[var35] = class292.method1841(class292.method1841(var9 + 1, 9568256), 1392508928);
                        class471.field6642[var35] = class292.method1841(var12, 9633792);
                        class276.field3945[class100.field1217][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class276.field3945[class100.field1217][var9 - 1][var12] != var6 && (class140.field1686[class100.field1217][var9][var12] & 0x4) == 0 && (class140.field1686[class100.field1217][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class122.field1519[var35] = class292.method1841(class292.method1841(var9 - 1, 13762560), 301989888);
                            class471.field6642[var35] = class292.method1841(var12, 13828096);
                            class276.field3945[class100.field1217][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class276.field3945[class100.field1217][var9][var12] != var6) {
                            class122.field1519[var35] = class292.method1841(class292.method1841(var9, 13762560), -1828716544);
                            class471.field6642[var35] = class292.method1841(var12, 13828096);
                            class276.field3945[class100.field1217][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class159.field1895 > (var9 + 1) && class276.field3945[class100.field1217][var9 + 1][var12] != var6 && (class140.field1686[class100.field1217][var9][var12] & 0x4) == 0 && (class140.field1686[class100.field1217][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class122.field1519[var35] = class292.method1841(class292.method1841(var9 + 1, 9568256), -771751936);
                            class471.field6642[var35] = class292.method1841(var12, 9633792);
                            class276.field3945[class100.field1217][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class181.field2330[arg5] != -1000000) {
                class181.field2330[arg5] += 10;
                class208.field2885[arg5] -= 50;
                class173.field2087[arg5] += 50;
                class52.field682[arg5] += 50;
                class188.field2548[arg5] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)V", line = 331)
    public static final void method1775(byte arg0, int arg1) {
        field4115++;
        class273.field3883 = arg1;
        if (arg0 >= -102) {
            method1774((class263[][][]) null, 35, true, -91, -78, 106);
        }
        class282.field4114.method1165((byte) 118);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)V", line = 347)
    public static final void method1776(boolean arg0, int arg1) {
        field4123++;
        class89 var2 = class146.method695(8, arg1, (byte) -119);
        if (!arg0) {
            var2.method448(13);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 360)
    public static void method1777(int arg0) {
        field4122 = null;
        field4119 = null;
        if (arg0 > -81) {
            method1776(false, -6);
        }
        field4121 = null;
        field4125 = null;
        field4116 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)V", line = 388)
    public static final void method1778(int arg0, int arg1, int arg2) {
        class325.field4690 = arg1 - class429.field6210;
        class104.field1260 = arg2 - class429.field6205;
        if (arg0 != 14943) {
            method1778(7, 0, -29);
        }
        field4117++;
    }
}
