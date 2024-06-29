import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class200 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    private int field3306 = 0;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Lfe;")
    private class97 field3315;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Lph;")
    public static class229 field3311 = class266.method1858("Polices charg-Bes", 0);

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Lph;")
    public static class229 field3309 = class266.method1858("0", 0);

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Lph;")
    public static class229 field3317 = class266.method1858("huffman", 0);

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Z")
    public static boolean field3307 = false;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Ll;")
    private class80 field3312;

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lfe;)V", line = 397)
    public class200(class97 arg0) {
        this.field3315 = arg0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Ll;", line = 21)
    public final class80 method1401(int arg0) {
        field3313++;
        this.field3306 = 0;
        return arg0 == 1 ? this.method1403(-1) : (class80) null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIII)V", line = 42)
    public static final void method1402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3308++;
        if (class317.field5381 == 0) {
            class121.field2038++;
            int var7 = class26.field340;
            int var8 = class111.field1884;
            int var9 = class208.field3433;
            int var10 = (arg4 - arg2) * (var9 - var7) / arg3 + var7;
            int var11 = class175.field2874;
            int var12 = (var11 - var8) * (arg5 - arg0) / arg6 + var8;
            if (class8.field103 && (class208.field3434 & 0x40) == 64) {
                class301 var13 = class167.method1224(class165.field2701, 109, class45.field689);
                if (var13 == null) {
                    class135.method959((byte) 122);
                } else {
                    class306.method2067(var12, class192.field3170, class116.field1965, var10, (short) 1, 0L, 0);
                }
            } else {
                if (class166.field2710 == 1) {
                    class306.method2067(var12, class134.field2172, class97.field1630, var10, (short) 25, 0L, 0);
                }
                class306.method2067(var12, class134.field2172, class230.field3828, var10, (short) 48, 0L, 0);
            }
        }
        if (arg1 >= -119) {
            method1406(-50, 24, false);
        }
        long var14 = -1L;
        for (int var16 = 0; var16 < class168.field2783; var16++) {
            long var17 = class43.field667[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            int var21 = ((int) var17 & 0x3FB2) >> 7;
            int var22 = ((int) var17 & 0x77A8F651) >> 29;
            if (var14 != var17) {
                var14 = var17;
                if (var22 == 2 && class313.method2116(class298.field4849, var19, var21, var17)) {
                    class83 var23 = class260.method1807(false, var20);
                    if (var23.field1373 != null) {
                        var23 = var23.method613((byte) -65);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class317.field5381 == 1) {
                        class167.field2731++;
                        class306.method2067(var21, class248.method1746(8528, new class229[] { class208.field3431, class262.field4384, var23.field1429 }), class143.field2321, var19, (short) 36, var17, 0);
                    } else if (!class8.field103) {
                        class98.field1661++;
                        class229[] var24 = var23.field1415;
                        if (class177.field2923) {
                            var24 = class222.method1552((byte) -16, var24);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    class52.field738++;
                                    short var26 = 0;
                                    if (var25 == 0) {
                                        var26 = 19;
                                    }
                                    if (var25 == 1) {
                                        var26 = 58;
                                    }
                                    if (var25 == 2) {
                                        var26 = 10;
                                    }
                                    if (var25 == 3) {
                                        var26 = 60;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1007;
                                    }
                                    class306.method2067(var21, class248.method1746(8528, new class229[] { class301.field4983, var23.field1429 }), var24[var25], var19, var26, var17, 0);
                                }
                            }
                        }
                        class306.method2067(var21, class248.method1746(8528, new class229[] { class301.field4983, var23.field1429 }), class39.field618, var19, (short) 1003, (long) var23.field1421, 0);
                    } else if ((class208.field3434 & 0x4) == 4) {
                        class306.method2067(var21, class248.method1746(8528, new class229[] { class205.field3388, class262.field4384, var23.field1429 }), class116.field1965, var19, (short) 33, var17, 0);
                        class205.field3382++;
                    }
                }
                if (var22 == 1) {
                    class217 var27 = class187.field3035[var20];
                    if (var27.field3559.field5304 == 1 && (var27.field5147 & 0x7F) == 64 && (var27.field5168 & 0x7F) == 64) {
                        for (int var28 = 0; var28 < class253.field4233; var28++) {
                            class217 var29 = class187.field3035[class162.field2620[var28]];
                            if (var29 != null && var27 != var29 && var29.field3559.field5304 == 1 && var27.field5147 == var29.field5147 && var27.field5168 == var29.field5168) {
                                class161.method1139(-23296, var19, var29.field3559, var21, class162.field2620[var28]);
                            }
                        }
                        for (int var30 = 0; var30 < class139.field2248; var30++) {
                            class209 var31 = class114.field1931[class166.field2708[var30]];
                            if (var31 != null && var27.field5147 == var31.field5147 && var27.field5168 == var31.field5168) {
                                class317.method2144(var21, (byte) 114, var31, var19, class166.field2708[var30]);
                            }
                        }
                    }
                    class161.method1139(-23296, var19, var27.field3559, var21, var20);
                }
                if (var22 == 0) {
                    class209 var32 = class114.field1931[var20];
                    if ((var32.field5147 & 0x7F) == 64 && (var32.field5168 & 0x7F) == 64) {
                        for (int var33 = 0; var33 < class253.field4233; var33++) {
                            class217 var34 = class187.field3035[class162.field2620[var33]];
                            if (var34 != null && var34.field3559.field5304 == 1 && var32.field5147 == var34.field5147 && var32.field5168 == var34.field5168) {
                                class161.method1139(-23296, var19, var34.field3559, var21, class162.field2620[var33]);
                            }
                        }
                        for (int var35 = 0; var35 < class139.field2248; var35++) {
                            class209 var36 = class114.field1931[class166.field2708[var35]];
                            if (var36 != null && var32 != var36 && var32.field5147 == var36.field5147 && var32.field5168 == var36.field5168) {
                                class317.method2144(var21, (byte) 53, var36, var19, class166.field2708[var35]);
                            }
                        }
                    }
                    class317.method2144(var21, (byte) 31, var32, var19, var20);
                }
                if (var22 == 3) {
                    class227 var37 = class8.field108[class298.field4849][var19][var21];
                    if (var37 != null) {
                        for (class37 var38 = (class37) var37.method1575(-97); var38 != null; var38 = (class37) var37.method1577(true)) {
                            int var39 = var38.field605.field2505;
                            class191 var40 = class124.method920(-84, var39);
                            if (class317.field5381 == 1) {
                                class306.method2067(var21, class248.method1746(8528, new class229[] { class208.field3431, class325.field5566, var40.field3154 }), class143.field2321, var19, (short) 42, (long) var39, 0);
                                class57.field806++;
                            } else if (!class8.field103) {
                                class6.field77++;
                                class229[] var41 = var40.field3149;
                                if (class177.field2923) {
                                    var41 = class222.method1552((byte) -16, var41);
                                }
                                for (int var42 = 4; var42 >= 0; var42--) {
                                    if (var41 != null && var41[var42] != null) {
                                        class77.field1285++;
                                        byte var43 = 0;
                                        if (var42 == 0) {
                                            var43 = 41;
                                        }
                                        if (var42 == 1) {
                                            var43 = 8;
                                        }
                                        if (var42 == 2) {
                                            var43 = 20;
                                        }
                                        if (var42 == 3) {
                                            var43 = 5;
                                        }
                                        if (var42 == 4) {
                                            var43 = 32;
                                        }
                                        class306.method2067(var21, class248.method1746(8528, new class229[] { class77.field1287, var40.field3154 }), var41[var42], var19, var43, (long) var39, 0);
                                    } else if (var42 == 2) {
                                        class143.field2326++;
                                        class306.method2067(var21, class248.method1746(8528, new class229[] { class77.field1287, var40.field3154 }), class108.field1839, var19, (short) 20, (long) var39, 0);
                                    }
                                }
                                class306.method2067(var21, class248.method1746(8528, new class229[] { class77.field1287, var40.field3154 }), class39.field618, var19, (short) 1005, (long) var39, 0);
                            } else if ((class208.field3434 & 0x1) == 1) {
                                class61.field865++;
                                class306.method2067(var21, class248.method1746(8528, new class229[] { class205.field3388, class325.field5566, var40.field3154 }), class116.field1965, var19, (short) 35, (long) var39, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Ll;", line = 369)
    public final class80 method1403(int arg0) {
        field3318++;
        if (~this.field3306 < arg0 && this.field3315.field1642[this.field3306 - 1] != this.field3312) {
            class80 var2 = this.field3312;
            this.field3312 = var2.field1317;
            return var2;
        }
        class80 var3;
        do {
            if (this.field3315.field1637 <= this.field3306) {
                return null;
            }
            var3 = this.field3315.field1642[this.field3306++].field1317;
        } while (this.field3315.field1642[this.field3306 - 1] == var3);
        this.field3312 = var3.field1317;
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lce;III)V", line = 416)
    public static final void method1404(class209 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field5136 == arg3 && arg3 != -1) {
            class312 var4 = class53.method362((byte) 107, arg3);
            int var5 = var4.field5229;
            if (var5 == 1) {
                arg0.field5111 = 0;
                arg0.field5116 = 0;
                arg0.field5172 = 0;
                arg0.field5135 = arg1;
                class176.method1265(-100, class230.field3820 == arg0, arg0.field5116, arg0.field5168, var4, arg0.field5147);
            }
            if (var5 == 2) {
                arg0.field5111 = 0;
            }
        } else if (arg3 == -1 || arg0.field5136 == -1 || class53.method362((byte) -68, arg3).field5244 >= class53.method362((byte) 110, arg0.field5136).field5244) {
            arg0.field5111 = 0;
            arg0.field5135 = arg1;
            arg0.field5116 = 0;
            arg0.field5156 = arg0.field5171;
            arg0.field5136 = arg3;
            arg0.field5172 = 0;
            if (arg0.field5136 != -1) {
                class176.method1265(37, class230.field3820 == arg0, arg0.field5116, arg0.field5168, class53.method362((byte) -30, arg0.field5136), arg0.field5147);
            }
        }
        if (arg2 != 1) {
            method1406(-122, 61, true);
        }
        field3314++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V", line = 463)
    public static void method1405(byte arg0) {
        field3311 = null;
        int var1 = -20 % ((54 - arg0) / 49);
        field3317 = null;
        field3309 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIZ)V", line = 478)
    public static final void method1406(int arg0, int arg1, boolean arg2) {
        field3319++;
        if (!arg2) {
            method1406(96, -7, false);
        }
        for (int var3 = 0; var3 < class100.field1714; var3++) {
            class282 var4 = class110.method838(var3, !arg2);
            if (var4 != null) {
                int var5 = var4.field4681;
                if (var5 >= 0 && !class310.field5207.method106(0, var5)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field4683 >= 0) {
                    int var6 = var4.field4683;
                    int var7 = (var6 & 0x7F) + arg0;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (var6 + arg1 & 0xFC00) + (var6 & 0x380) + var7;
                    var9 = class310.field5203[class60.method407((byte) 112, 96, var8)];
                } else if (var5 >= 0) {
                    var9 = class310.field5203[class60.method407((byte) 84, 96, class310.field5207.method109(123, var5))];
                } else if (var4.field4676 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field4676;
                    int var11 = (var10 & 0x7F) + arg0;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg1 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var9 = class310.field5203[class60.method407((byte) 80, 96, var12)];
                }
                class293.field4793[var3 + 1] = var9;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Lph;", line = 553)
    public static final class229 method1407(int arg0, int arg1) {
        if (arg1 != -23345) {
            field3307 = true;
        }
        field3310++;
        return class248.method1746(8528, new class229[] { class50.method354(0, arg0 >> 24 & 0xFF), class186.field3033, class50.method354(0, arg0 >> 16 & 0xFF), class186.field3033, class50.method354(0, (arg0 & 0xFF4F) >> 8), class186.field3033, class50.method354(0, arg0 & 0xFF) });
    }
}
