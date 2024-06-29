import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class680 {

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field9581;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field9582;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field9583;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field9584;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field9585;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field9586;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field9587;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Lst;")
    public static class397 field9588;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 7)
    public static void method3753(int arg0) {
        if (arg0 != 8) {
            field9588 = null;
        }
        field9588 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)Z", line = 19)
    public static final boolean method3754(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class411.field5807; var3++) {
            class205 var4 = class261.field3713[var3];
            if (var4.field3011 == 1) {
                int var5 = var4.field3024 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3018 * var5 >> 8) + var4.field3015;
                    int var7 = (var4.field3020 * var5 >> 8) + var4.field3016;
                    int var8 = (var4.field3029 * var5 >> 8) + var4.field3028;
                    int var9 = (var4.field3025 * var5 >> 8) + var4.field3027;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3011 == 2) {
                int var10 = arg0 - var4.field3024;
                if (var10 > 0) {
                    int var11 = (var4.field3018 * var10 >> 8) + var4.field3015;
                    int var12 = (var4.field3020 * var10 >> 8) + var4.field3016;
                    int var13 = (var4.field3029 * var10 >> 8) + var4.field3028;
                    int var14 = (var4.field3025 * var10 >> 8) + var4.field3027;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3011 == 3) {
                int var15 = var4.field3015 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3009 * var15 >> 8) + var4.field3024;
                    int var17 = (var4.field3030 * var15 >> 8) + var4.field3013;
                    int var18 = (var4.field3029 * var15 >> 8) + var4.field3028;
                    int var19 = (var4.field3025 * var15 >> 8) + var4.field3027;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3011 == 4) {
                int var20 = arg2 - var4.field3015;
                if (var20 > 0) {
                    int var21 = (var4.field3009 * var20 >> 8) + var4.field3024;
                    int var22 = (var4.field3030 * var20 >> 8) + var4.field3013;
                    int var23 = (var4.field3029 * var20 >> 8) + var4.field3028;
                    int var24 = (var4.field3025 * var20 >> 8) + var4.field3027;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3011 == 5) {
                int var25 = arg1 - var4.field3028;
                if (var25 > 0) {
                    int var26 = (var4.field3009 * var25 >> 8) + var4.field3024;
                    int var27 = (var4.field3030 * var25 >> 8) + var4.field3013;
                    int var28 = (var4.field3018 * var25 >> 8) + var4.field3015;
                    int var29 = (var4.field3020 * var25 >> 8) + var4.field3016;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B[[[Lhl;)V", line = 143)
    public static final void method3755(byte arg0, class486[][][] arg1) {
        field9583++;
        if (arg0 > -19) {
            method3753(-37);
        }
        for (int var2 = 0; var2 < arg1.length; var2++) {
            class486[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class486 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field6748 instanceof class147) {
                            ((class147) var6.field6748).method550(-77);
                        }
                        if (var6.field6729 instanceof class147) {
                            ((class147) var6.field6729).method550(-104);
                        }
                        if (var6.field6728 instanceof class147) {
                            ((class147) var6.field6728).method550(-92);
                        }
                        if (var6.field6750 instanceof class147) {
                            ((class147) var6.field6750).method550(-106);
                        }
                        if (var6.field6741 instanceof class147) {
                            ((class147) var6.field6741).method550(-46);
                        }
                        for (class20 var7 = var6.field6751; var7 != null; var7 = var7.field284) {
                            class39 var8 = var7.field281;
                            if (var8 instanceof class147) {
                                ((class147) var8).method550(-128);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)J", line = 216)
    public static final synchronized long method3756(int arg0) {
        field9584++;
        long var1 = System.currentTimeMillis();
        if (arg0 >= -13) {
            return 106L;
        }
        if (var1 < class184.field2713) {
            class460.field6514 += class184.field2713 - var1;
        }
        class184.field2713 = var1;
        return var1 + class460.field6514;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljr;B)Loh;", line = 238)
    public static final class370 method3757(class96 arg0, byte arg1) {
        field9587++;
        String var2 = arg0.method739(-4);
        class52 var3 = class495.method2768((byte) -60)[arg0.method718(-90)];
        class377 var4 = class428.method2425((byte) -26)[arg0.method718(-74)];
        int var5 = arg0.method722(4);
        int var6 = arg0.method722(4);
        int var7 = arg0.method714(false);
        int var8 = arg0.method714(false);
        if (arg1 >= -48) {
            method3757(null, (byte) 104);
        }
        return new class370(var2, var3, var4, var5, var6, var7, var8);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIIIIII)V", line = 264)
    public static final void method3758(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field9582++;
        class81 var10 = null;
        class81 var11 = (class81) class138.field1938.method1270((byte) -25);
        if (arg5 != -25522) {
            method3754(-74, -85, 66);
        }
        while (var11 != null) {
            if (var11.field1126 == arg1 && var11.field1121 == arg0 && var11.field1127 == arg4 && var11.field1129 == arg6) {
                var10 = var11;
                break;
            }
            var11 = (class81) class138.field1938.method1282(0);
        }
        if (var10 == null) {
            var10 = new class81();
            var10.field1129 = arg6;
            var10.field1121 = arg0;
            var10.field1126 = arg1;
            var10.field1127 = arg4;
            if (arg0 >= 0 && arg4 >= 0 && arg0 < class86.field1185 && class526.field7212 > arg4) {
                class654.method3637(var10, (byte) -122);
            }
            class138.field1938.method1273(var10, (byte) 122);
        }
        var10.field1124 = arg8;
        var10.field1130 = arg7;
        var10.field1120 = arg2;
        var10.field1131 = arg9;
        var10.field1122 = arg3;
    }
}
