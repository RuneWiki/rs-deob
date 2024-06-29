import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class271 {

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "J")
    public long field4294 = 0L;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field4291 = 0;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field4298 = 0;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public int field4285;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public int field4287;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public int field4288;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public int field4289;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public int field4292;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public int field4293;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public int field4295;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public int field4297;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
    public int field4300;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
    public int field4305;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
    public int field4306;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Lh;")
    public class232 field4286;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "Lug;")
    public static class321 field4304;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 4)
    public static void method1933(int arg0) {
        field4304 = null;
        if (arg0 != 1) {
            field4291 = 110;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIZBI[[[Li;)Z", line = 38)
    public static final boolean method1934(int arg0, int arg1, boolean arg2, byte arg3, int arg4, class230[][][] arg5) {
        field4290++;
        byte var6 = arg2 ? 1 : (byte) (class162.field2649 & 0xFF);
        if (class280.field4416[class148.field2209][arg0][arg1] == var6) {
            return false;
        } else if ((class81.field1229[class148.field2209][arg0][arg1] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            if (arg3 != -84) {
                method1933(-64);
            }
            class327.field5093[var7] = arg0;
            int var31 = var7 + 1;
            class283.field4462[var7] = arg1;
            class280.field4416[class148.field2209][arg0][arg1] = var6;
            while (var31 != var8) {
                int var9 = class327.field5093[var8] & 0xFFFF;
                int var10 = class327.field5093[var8] >> 24 & 0xFF;
                int var11 = class283.field4462[var8] & 0xFFFF;
                int var12 = class327.field5093[var8] >> 16 & 0xFF;
                int var13 = class283.field4462[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                boolean var15 = false;
                if ((class81.field1229[class148.field2209][var9][var11] & 0x4) == 0) {
                    var14 = true;
                }
                label238: for (int var16 = class148.field2209 + 1; var16 <= 3; var16++) {
                    if ((class81.field1229[var16][var9][var11] & 0x8) == 0) {
                        if (var14 && arg5[var16][var9][var11] != null) {
                            if (arg5[var16][var9][var11].field3676 != null) {
                                int var17 = class235.method1682(var12, (byte) 33);
                                if (arg5[var16][var9][var11].field3676.field258 == var17 || arg5[var16][var9][var11].field3676.field261 == var17) {
                                    continue;
                                }
                                if (var10 != 0) {
                                    int var18 = class235.method1682(var10, (byte) 93);
                                    if (arg5[var16][var9][var11].field3676.field258 == var18 || arg5[var16][var9][var11].field3676.field261 == var18) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var19 = class235.method1682(var13, (byte) 98);
                                    if (arg5[var16][var9][var11].field3676.field258 == var19 || arg5[var16][var9][var11].field3676.field261 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg5[var16][var9][var11].field3687 != null) {
                                for (int var20 = 0; var20 < arg5[var16][var9][var11].field3680; var20++) {
                                    int var21 = (int) (arg5[var16][var9][var11].field3687[var20].field4294 >> 20 & 0x3L);
                                    int var22 = (int) (arg5[var16][var9][var11].field3687[var20].field4294 >> 14 & 0x3FL);
                                    if (var22 == 21) {
                                        var22 = 19;
                                    }
                                    int var23 = var22 | var21 << 6;
                                    if (var12 == var23 || var10 != 0 && var10 == var23 || var13 != 0 && var13 == var23) {
                                        continue label238;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class230 var24 = arg5[var16][var9][var11];
                        if (var24 != null && var24.field3680 > 0) {
                            for (int var25 = 0; var25 < var24.field3680; var25++) {
                                class271 var26 = var24.field3687[var25];
                                if (var26.field4287 != var26.field4285 || var26.field4297 != var26.field4289) {
                                    for (int var27 = var26.field4285; var27 <= var26.field4287; var27++) {
                                        for (int var28 = var26.field4297; var28 <= var26.field4289; var28++) {
                                            class280.field4416[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class280.field4416[var16][var9][var11] = var6;
                    }
                }
                if (var15) {
                    int var29 = var9 << 7;
                    int var30 = var11 << 7;
                    if (class84.field1282[class148.field2209 + 1][var9][var11] > class58.field764[arg4]) {
                        class58.field764[arg4] = class84.field1282[class148.field2209 + 1][var9][var11];
                    }
                    if (var29 < class308.field4819[arg4]) {
                        class308.field4819[arg4] = var29;
                    } else if (var29 > class69.field902[arg4]) {
                        class69.field902[arg4] = var29;
                    }
                    if (var30 < class60.field789[arg4]) {
                        class60.field789[arg4] = var30;
                    } else if (class232.field3712[arg4] < var30) {
                        class232.field3712[arg4] = var30;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class280.field4416[class148.field2209][var9 - 1][var11] != var6) {
                        class327.field5093[var31] = class24.method149(class24.method149(1179648, var9 - 1), -754974720);
                        class283.field4462[var31] = class24.method149(1245184, var11);
                        var31 = var31 + 1 & 0xFFF;
                        class280.field4416[class148.field2209][var9 - 1][var11] = var6;
                    }
                    var11++;
                    if (var11 < 104) {
                        if (var9 - 1 >= 0 && class280.field4416[class148.field2209][var9 - 1][var11] != var6 && (class81.field1229[class148.field2209][var9][var11] & 0x4) == 0 && (class81.field1229[class148.field2209][var9 - 1][var11 - 1] & 0x4) == 0) {
                            class327.field5093[var31] = class24.method149(1375731712, class24.method149(var9 - 1, 1179648));
                            class283.field4462[var31] = class24.method149(1245184, var11);
                            class280.field4416[class148.field2209][var9 - 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class280.field4416[class148.field2209][var9][var11] != var6) {
                            class327.field5093[var31] = class24.method149(class24.method149(var9, 5373952), 318767104);
                            class283.field4462[var31] = class24.method149(var11, 5439488);
                            class280.field4416[class148.field2209][var9][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class280.field4416[class148.field2209][var9 + 1][var11] != var6 && (class81.field1229[class148.field2209][var9][var11] & 0x4) == 0 && (class81.field1229[class148.field2209][var9 + 1][var11 - 1] & 0x4) == 0) {
                            class327.field5093[var31] = class24.method149(-1845493760, class24.method149(var9 + 1, 5373952));
                            class283.field4462[var31] = class24.method149(var11, 5439488);
                            class280.field4416[class148.field2209][var9 + 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var11--;
                    if ((var9 + 1) < 104 && class280.field4416[class148.field2209][var9 + 1][var11] != var6) {
                        class327.field5093[var31] = class24.method149(1392508928, class24.method149(var9 + 1, 9568256));
                        class283.field4462[var31] = class24.method149(9633792, var11);
                        class280.field4416[class148.field2209][var9 + 1][var11] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var11--;
                    if (var11 >= 0) {
                        if ((var9 - 1) >= 0 && class280.field4416[class148.field2209][var9 - 1][var11] != var6 && (class81.field1229[class148.field2209][var9][var11] & 0x4) == 0 && (class81.field1229[class148.field2209][var9 - 1][var11 + 1] & 0x4) == 0) {
                            class327.field5093[var31] = class24.method149(301989888, class24.method149(var9 - 1, 13762560));
                            class283.field4462[var31] = class24.method149(var11, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class280.field4416[class148.field2209][var9 - 1][var11] = var6;
                        }
                        if (class280.field4416[class148.field2209][var9][var11] != var6) {
                            class327.field5093[var31] = class24.method149(class24.method149(var9, 13762560), -1828716544);
                            class283.field4462[var31] = class24.method149(var11, 13828096);
                            class280.field4416[class148.field2209][var9][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class280.field4416[class148.field2209][var9 + 1][var11] != var6 && (class81.field1229[class148.field2209][var9][var11] & 0x4) == 0 && (class81.field1229[class148.field2209][var9 + 1][var11 + 1] & 0x4) == 0) {
                            class327.field5093[var31] = class24.method149(class24.method149(var9 + 1, 9568256), -771751936);
                            class283.field4462[var31] = class24.method149(9633792, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class280.field4416[class148.field2209][var9 + 1][var11] = var6;
                        }
                    }
                }
            }
            if (class58.field764[arg4] != -1000000) {
                class58.field764[arg4] += 10;
                class308.field4819[arg4] -= 50;
                class69.field902[arg4] += 50;
                class232.field3712[arg4] += 50;
                class60.field789[arg4] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)V", line = 348)
    public static final void method1935(int arg0, byte arg1) {
        int var2 = 94 % ((-arg1 - 26) / 36);
        class210.field3442.method1625(arg0, (byte) 30);
        field4303++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lc;I)V", line = 366)
    public static final void method1936(class320 arg0, int arg1) {
        class197 var2 = (class197) class55.field722.method1743(class232.method1669(37, arg0.field5003), (byte) -15);
        if (arg1 != 11741) {
            return;
        }
        field4301++;
        if (var2 == null) {
            return;
        }
        if (var2.field3232 != null) {
            class107.field1622.method739(var2.field3232);
            var2.field3232 = null;
        }
        var2.method465((byte) -122);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZZ)V", line = 388)
    public static final void method1937(boolean arg0, boolean arg1) {
        field4307++;
        if (!arg1) {
            field4302 = -120;
        }
        if (class227.field3600 != arg0) {
            class227.field3600 = arg0;
            class206.method1511(29);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 406)
    public static final boolean method1938(String arg0, String arg1, int arg2) {
        field4296++;
        int var3 = arg1.length();
        int var4 = arg0.length();
        if (var4 > var3) {
            return false;
        }
        int var5 = 61 / ((arg2 - 47) / 53);
        for (int var6 = 0; var6 < var4; var6++) {
            char var7 = arg1.charAt(var6);
            char var8 = arg0.charAt(var6);
            if (var7 != var8 && Character.toLowerCase(var7) != Character.toLowerCase(var8) && Character.toUpperCase(var7) != Character.toUpperCase(var8)) {
                return false;
            }
        }
        return true;
    }
}
