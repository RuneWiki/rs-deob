import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class169 extends class62 {

    @OriginalMember(owner = "client!ba", name = "ab", descriptor = "I")
    public static int field3027 = 0;

    @OriginalMember(owner = "client!ba", name = "hb", descriptor = "I")
    public static int field3034 = 0;

    @OriginalMember(owner = "client!ba", name = "ib", descriptor = "I")
    public static int field3035 = -1;

    @OriginalMember(owner = "client!ba", name = "jb", descriptor = "I")
    public static int field3036 = -1;

    @OriginalMember(owner = "client!ba", name = "kb", descriptor = "B")
    public byte field3037;

    @OriginalMember(owner = "client!ba", name = "cb", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!ba", name = "db", descriptor = "I")
    public int field3030;

    @OriginalMember(owner = "client!ba", name = "eb", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!ba", name = "fb", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!ba", name = "gb", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!ba", name = "lb", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!ba", name = "mb", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!ba", name = "bb", descriptor = "Lrm;")
    public class249 field3028;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)[B", line = 12)
    public final byte[] method433(int arg0) {
        if (arg0 <= 119) {
            return (byte[]) null;
        }
        field3032++;
        if (this.field986 || this.field3028.field4338.length - this.field3037 > this.field3028.field4314) {
            throw new RuntimeException();
        }
        return this.field3028.field4338;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III[[[Lje;ZI)Z", line = 31)
    public static final boolean method1174(int arg0, int arg1, int arg2, class74[][][] arg3, boolean arg4, int arg5) {
        if (arg0 > -7) {
            field3035 = -94;
        }
        field3039++;
        byte var6 = arg4 ? 1 : (byte) (class278.field4886 & 0xFF);
        if (class327.field5582[class295.field5159][arg2][arg5] == var6) {
            return false;
        } else if ((class166.field2980[class295.field5159][arg2][arg5] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class5.field66[var7] = arg2;
            int var31 = var7 + 1;
            class26.field405[var7] = arg5;
            class327.field5582[class295.field5159][arg2][arg5] = var6;
            while (var31 != var8) {
                int var9 = class5.field66[var8] & 0xFFFF;
                int var10 = (class5.field66[var8] & 0xFF862D) >> 16;
                int var11 = class5.field66[var8] >> 24 & 0xFF;
                int var12 = class26.field405[var8] & 0xFFFF;
                boolean var13 = false;
                int var14 = (class26.field405[var8] & 0xFFD87A) >> 16;
                boolean var15 = false;
                if ((class166.field2980[class295.field5159][var9][var12] & 0x4) == 0) {
                    var15 = true;
                }
                label235: for (int var16 = class295.field5159 + 1; var16 <= 3; var16++) {
                    if ((class166.field2980[var16][var9][var12] & 0x8) == 0) {
                        if (var15 && arg3[var16][var9][var12] != null) {
                            if (arg3[var16][var9][var12].field1117 != null) {
                                int var17 = class177.method1247(var10, (byte) -65);
                                if (arg3[var16][var9][var12].field1117.field3178 == var17 || arg3[var16][var9][var12].field1117.field3175 == var17) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var18 = class177.method1247(var11, (byte) 84);
                                    if (arg3[var16][var9][var12].field1117.field3178 == var18 || arg3[var16][var9][var12].field1117.field3175 == var18) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var19 = class177.method1247(var14, (byte) -105);
                                    if (arg3[var16][var9][var12].field1117.field3178 == var19 || arg3[var16][var9][var12].field1117.field3175 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg3[var16][var9][var12].field1118 != null) {
                                for (int var20 = 0; var20 < arg3[var16][var9][var12].field1119; var20++) {
                                    int var21 = (int) (arg3[var16][var9][var12].field1118[var20].field5563 >> 14 & 0x3FL);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var22 = (int) (arg3[var16][var9][var12].field1118[var20].field5563 >> 20 & 0x3L);
                                    int var23 = var22 << 6 | var21;
                                    if (var10 == var23 || var11 != 0 && var11 == var23 || var14 != 0 && var14 == var23) {
                                        continue label235;
                                    }
                                }
                            }
                        }
                        var13 = true;
                        class74 var24 = arg3[var16][var9][var12];
                        if (var24 != null && var24.field1119 > 0) {
                            for (int var25 = 0; var25 < var24.field1119; var25++) {
                                class326 var26 = var24.field1118[var25];
                                if (var26.field5575 != var26.field5568 || var26.field5576 != var26.field5561) {
                                    for (int var27 = var26.field5575; var27 <= var26.field5568; var27++) {
                                        for (int var28 = var26.field5576; var28 <= var26.field5561; var28++) {
                                            class327.field5582[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class327.field5582[var16][var9][var12] = var6;
                    }
                }
                var8 = var8 + 1 & 0xFFF;
                if (var13) {
                    int var29 = var9 << 7;
                    if (class9.field117[arg1] < class278.field4883[class295.field5159 + 1][var9][var12]) {
                        class9.field117[arg1] = class278.field4883[class295.field5159 + 1][var9][var12];
                    }
                    if (var29 < class137.field2418[arg1]) {
                        class137.field2418[arg1] = var29;
                    } else if (class203.field3673[arg1] < var29) {
                        class203.field3673[arg1] = var29;
                    }
                    int var30 = var12 << 7;
                    if (var30 < class185.field3402[arg1]) {
                        class185.field3402[arg1] = var30;
                    } else if (var30 > class282.field4937[arg1]) {
                        class282.field4937[arg1] = var30;
                    }
                }
                if (!var15) {
                    if (var9 >= 1 && class327.field5582[class295.field5159][var9 - 1][var12] != var6) {
                        class5.field66[var31] = class242.method1674(-754974720, class242.method1674(var9 - 1, 1179648));
                        class26.field405[var31] = class242.method1674(1245184, var12);
                        class327.field5582[class295.field5159][var9 - 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < 104) {
                        if (var9 - 1 >= 0 && class327.field5582[class295.field5159][var9 - 1][var12] != var6 && (class166.field2980[class295.field5159][var9][var12] & 0x4) == 0 && (class166.field2980[class295.field5159][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class5.field66[var31] = class242.method1674(1375731712, class242.method1674(var9 - 1, 1179648));
                            class26.field405[var31] = class242.method1674(1245184, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class327.field5582[class295.field5159][var9 - 1][var12] = var6;
                        }
                        if (class327.field5582[class295.field5159][var9][var12] != var6) {
                            class5.field66[var31] = class242.method1674(class242.method1674(5373952, var9), 318767104);
                            class26.field405[var31] = class242.method1674(var12, 5439488);
                            class327.field5582[class295.field5159][var9][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class327.field5582[class295.field5159][var9 + 1][var12] != var6 && (class166.field2980[class295.field5159][var9][var12] & 0x4) == 0 && (class166.field2980[class295.field5159][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class5.field66[var31] = class242.method1674(class242.method1674(5373952, var9 + 1), -1845493760);
                            class26.field405[var31] = class242.method1674(var12, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class327.field5582[class295.field5159][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (var9 + 1 < 104 && class327.field5582[class295.field5159][var9 + 1][var12] != var6) {
                        class5.field66[var31] = class242.method1674(class242.method1674(9568256, var9 + 1), 1392508928);
                        class26.field405[var31] = class242.method1674(9633792, var12);
                        var31 = var31 + 1 & 0xFFF;
                        class327.field5582[class295.field5159][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class327.field5582[class295.field5159][var9 - 1][var12] != var6 && (class166.field2980[class295.field5159][var9][var12] & 0x4) == 0 && (class166.field2980[class295.field5159][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class5.field66[var31] = class242.method1674(class242.method1674(var9 - 1, 13762560), 301989888);
                            class26.field405[var31] = class242.method1674(var12, 13828096);
                            class327.field5582[class295.field5159][var9 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class327.field5582[class295.field5159][var9][var12] != var6) {
                            class5.field66[var31] = class242.method1674(class242.method1674(13762560, var9), -1828716544);
                            class26.field405[var31] = class242.method1674(13828096, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class327.field5582[class295.field5159][var9][var12] = var6;
                        }
                        if (var9 + 1 < 104 && class327.field5582[class295.field5159][var9 + 1][var12] != var6 && (class166.field2980[class295.field5159][var9][var12] & 0x4) == 0 && (class166.field2980[class295.field5159][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class5.field66[var31] = class242.method1674(-771751936, class242.method1674(var9 + 1, 9568256));
                            class26.field405[var31] = class242.method1674(9633792, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class327.field5582[class295.field5159][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class9.field117[arg1] != -1000000) {
                class9.field117[arg1] += 10;
                class137.field2418[arg1] -= 50;
                class203.field3673[arg1] += 50;
                class282.field4937[arg1] += 50;
                class185.field3402[arg1] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIB)I", line = 338)
    public static final int method1175(int arg0, int arg1, int arg2, byte arg3) {
        field3038++;
        int var4 = arg1 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg0 / arg2;
        int var7 = arg0 & arg2 - 1;
        int var8 = class212.method1463(var5, 8, var6);
        int var9 = class212.method1463(var5 + 1, 29, var6);
        int var10 = class212.method1463(var5, 14, var6 + 1);
        int var11 = class212.method1463(var5 + 1, 12, var6 + 1);
        int var12 = class86.method596(var9, var8, arg2, var4, 20999);
        int var13 = class86.method596(var11, var10, arg2, var4, 20999);
        int var14 = 116 / ((arg3 - 49) / 51);
        return class86.method596(var13, var12, arg2, var7, 20999);
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)I", line = 397)
    public final int method427(int arg0) {
        field3031++;
        if (arg0 >= -83) {
            this.method427(-98);
        }
        return this.field3028 == null ? 0 : this.field3028.field4314 * 100 / (this.field3028.field4338.length - this.field3037);
    }
}
