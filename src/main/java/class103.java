import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class103 {

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Lhj;")
    public static class596 field1331 = new class596(125, -1);

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V", line = 3)
    public static void method851(byte arg0) {
        field1331 = null;
        if (arg0 >= -8) {
            method852(-4, null);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/lang/String;)V", line = 16)
    public static final void method852(int arg0, String arg1) {
        field1328++;
        System.out.println("Error: " + class12.method185("%0a", "\n", (byte) -115, arg1));
        if (arg0 <= 0) {
            method854(126, null, true, 57, 59, null, -122, -3, -85);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZII[[[Ldq;I)Z", line = 27)
    public static final boolean method853(int arg0, boolean arg1, int arg2, int arg3, class727[][][] arg4, int arg5) {
        field1330++;
        if (arg0 != 11806) {
            method853(118, false, -93, 27, null, 55);
        }
        byte var6 = arg1 ? 1 : (byte) (class471.field6571 & 0xFF);
        if (class267.field3162[class581.field7921][arg3][arg2] == var6) {
            return false;
        } else if ((class124.field1585[class581.field7921][arg3][arg2] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class392.field5079[var7] = arg3;
            int var35 = var7 + 1;
            class390.field5058[var7] = arg2;
            class267.field3162[class581.field7921][arg3][arg2] = var6;
            while (var35 != var8) {
                int var9 = class392.field5079[var8] & 0xFFFF;
                int var10 = class392.field5079[var8] >> 16 & 0xFF;
                int var11 = class392.field5079[var8] >> 24 & 0xFF;
                int var12 = class390.field5058[var8] & 0xFFFF;
                int var13 = class390.field5058[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class124.field1585[class581.field7921][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                if (arg4 != null) {
                    label244: for (int var16 = class581.field7921 + 1; var16 <= 3; var16++) {
                        if (arg4[var16] != null && (class124.field1585[var16][var9][var12] & 0x8) == 0) {
                            if (var14 && arg4[var16][var9][var12] != null) {
                                if (arg4[var16][var9][var12].field10173 != null) {
                                    int var17 = class369.method2153(-92, var10);
                                    if (arg4[var16][var9][var12].field10173.field8524 == var17 || arg4[var16][var9][var12].field10187 != null && arg4[var16][var9][var12].field10187.field8524 == var17) {
                                        continue;
                                    }
                                    if (var11 != 0) {
                                        int var18 = class369.method2153(arg0 ^ 0xFFFFD18E, var11);
                                        if (arg4[var16][var9][var12].field10173.field8524 == var18 || arg4[var16][var9][var12].field10187 != null && arg4[var16][var9][var12].field10187.field8524 == var18) {
                                            continue;
                                        }
                                    }
                                    if (var13 != 0) {
                                        int var19 = class369.method2153(-116, var13);
                                        if (arg4[var16][var9][var12].field10173.field8524 == var19 || arg4[var16][var9][var12].field10187 != null && arg4[var16][var9][var12].field10187.field8524 == var19) {
                                            continue;
                                        }
                                    }
                                }
                                class727 var20 = arg4[var16][var9][var12];
                                if (var20.field10174 != null) {
                                    for (class10 var21 = var20.field10174; var21 != null; var21 = var21.field186) {
                                        class712 var22 = var21.field187;
                                        if (var22 instanceof class238) {
                                            class238 var23 = (class238) var22;
                                            int var24 = var23.method929((byte) -45);
                                            if (var24 == 21) {
                                                var24 = 19;
                                            }
                                            int var25 = var23.method928(13272);
                                            int var26 = var24 | var25 << 6;
                                            if (var10 == var26 || var11 != 0 && var11 == var26 || var13 != 0 && var13 == var26) {
                                                continue label244;
                                            }
                                        }
                                    }
                                }
                            }
                            class727 var27 = arg4[var16][var9][var12];
                            if (var27 != null && var27.field10174 != null) {
                                for (class10 var28 = var27.field10174; var28 != null; var28 = var28.field186) {
                                    class712 var29 = var28.field187;
                                    if (var29.field9994 != var29.field9991 || var29.field9997 != var29.field9990) {
                                        for (int var30 = var29.field9994; var30 <= var29.field9991; var30++) {
                                            for (int var31 = var29.field9997; var31 <= var29.field9990; var31++) {
                                                class267.field3162[var16][var30][var31] = var6;
                                            }
                                        }
                                    }
                                }
                            }
                            var15 = true;
                            class267.field3162[var16][var9][var12] = var6;
                        }
                    }
                }
                if (var15) {
                    int var32 = class621.field8523[class581.field7921 + 1].method1728(var12, (byte) -86, var9);
                    if (class353.field4383[arg5] < var32) {
                        class353.field4383[arg5] = var32;
                    }
                    int var33 = var9 << 9;
                    int var34 = var12 << 9;
                    if (var33 < class789.field10869[arg5]) {
                        class789.field10869[arg5] = var33;
                    } else if (class450.field6371[arg5] < var33) {
                        class450.field6371[arg5] = var33;
                    }
                    if (var34 < class473.field6599[arg5]) {
                        class473.field6599[arg5] = var34;
                    } else if (var34 > class375.field4709[arg5]) {
                        class375.field4709[arg5] = var34;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class267.field3162[class581.field7921][var9 - 1][var12] != var6) {
                        class392.field5079[var35] = class5.method105(-754974720, class5.method105(var9 - 1, 1179648));
                        class390.field5058[var35] = class5.method105(1245184, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class267.field3162[class581.field7921][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (class107.field1350 > var12) {
                        if (var9 - 1 >= 0 && class267.field3162[class581.field7921][var9 - 1][var12] != var6 && (class124.field1585[class581.field7921][var9][var12] & 0x4) == 0 && (class124.field1585[class581.field7921][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class392.field5079[var35] = class5.method105(1375731712, class5.method105(1179648, var9 - 1));
                            class390.field5058[var35] = class5.method105(1245184, var12);
                            class267.field3162[class581.field7921][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class267.field3162[class581.field7921][var9][var12] != var6) {
                            class392.field5079[var35] = class5.method105(318767104, class5.method105(5373952, var9));
                            class390.field5058[var35] = class5.method105(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class267.field3162[class581.field7921][var9][var12] = var6;
                        }
                        if ((var9 + 1) < class596.field8090 && class267.field3162[class581.field7921][var9 + 1][var12] != var6 && (class124.field1585[class581.field7921][var9][var12] & 0x4) == 0 && (class124.field1585[class581.field7921][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class392.field5079[var35] = class5.method105(class5.method105(5373952, var9 + 1), -1845493760);
                            class390.field5058[var35] = class5.method105(5439488, var12);
                            class267.field3162[class581.field7921][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (var9 + 1 < class596.field8090 && class267.field3162[class581.field7921][var9 + 1][var12] != var6) {
                        class392.field5079[var35] = class5.method105(1392508928, class5.method105(9568256, var9 + 1));
                        class390.field5058[var35] = class5.method105(var12, 9633792);
                        class267.field3162[class581.field7921][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class267.field3162[class581.field7921][var9 - 1][var12] != var6 && (class124.field1585[class581.field7921][var9][var12] & 0x4) == 0 && (class124.field1585[class581.field7921][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class392.field5079[var35] = class5.method105(class5.method105(13762560, var9 - 1), 301989888);
                            class390.field5058[var35] = class5.method105(13828096, var12);
                            class267.field3162[class581.field7921][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class267.field3162[class581.field7921][var9][var12] != var6) {
                            class392.field5079[var35] = class5.method105(class5.method105(13762560, var9), -1828716544);
                            class390.field5058[var35] = class5.method105(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class267.field3162[class581.field7921][var9][var12] = var6;
                        }
                        if (var9 + 1 < class596.field8090 && class267.field3162[class581.field7921][var9 + 1][var12] != var6 && (class124.field1585[class581.field7921][var9][var12] & 0x4) == 0 && (class124.field1585[class581.field7921][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class392.field5079[var35] = class5.method105(class5.method105(var9 + 1, 9568256), -771751936);
                            class390.field5058[var35] = class5.method105(9633792, var12);
                            class267.field3162[class581.field7921][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class353.field4383[arg5] != -1000000) {
                class353.field4383[arg5] += 40;
                class789.field10869[arg5] -= 512;
                class450.field6371[arg5] += 512;
                class375.field4709[arg5] += 512;
                class473.field6599[arg5] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I[BZII[BIII)V", line = 362)
    public static final void method854(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        field1329++;
        if (arg2) {
            method853(111, true, 80, -33, null, 117);
        }
        int var9 = -(arg3 >> 2);
        int var10 = -(arg3 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg7++;
                arg5[var10001] = (byte) (arg5[var10001] - arg1[arg8++]);
                int var14 = arg7++;
                arg5[var14] = (byte) (arg5[var14] - arg1[arg8++]);
                int var15 = arg7++;
                arg5[var15] = (byte) (arg5[var15] - arg1[arg8++]);
                int var16 = arg7++;
                arg5[var16] = (byte) (arg5[var16] - arg1[arg8++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg5[var10001] = (byte) (arg5[var10001] - arg1[arg8++]);
            }
            arg7 += arg0;
            arg8 += arg4;
        }
    }
}
