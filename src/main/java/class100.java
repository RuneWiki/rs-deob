import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class100 {

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field1119 = 50;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field1124 = 0;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1130 = null;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field1129 = new String[100];

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public int field1121;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public int field1123;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public int field1131;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "Lkh;")
    public static class11 field1125;

    // $FF: synthetic field
    @OriginalMember(owner = "client!c", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field1132;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Len;ZI)Z")
    public static final boolean method536(class174 arg0, boolean arg1, int arg2) {
        field1127++;
        int var3 = (class279.field3935 - 104) / 2;
        int var4 = (class164.field2287 - 104) / 2;
        boolean var5 = arg1;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var51 = var4; var51 < var4 + 104; var51++) {
                for (int var52 = arg2; var52 <= 3; var52++) {
                    if (class139.method831(var6, arg2, var52, var51, (byte) -126)) {
                        int var53 = var52;
                        if (class278.method1759(var51, 26002, var6)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class181.method1178(var53, var6, 0, var51);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class196.field2672 = arg0.method1008(var7, 0, 512, 512, 512);
        class236.method1501(-122);
        int var9 = -(-((int) (Math.random() * 20.0D)) - 238) + ((int) (Math.random() * 20.0D) + 228 << 8) + (228 - -((int) (Math.random() * 20.0D)) << 16) - 10 | 0xFF000000;
        int var10 = (int) (Math.random() * 20.0D) + 228 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
        boolean[][] var12 = new boolean[class139.field1979][class139.field1979];
        for (int var13 = var3; var13 < (var3 + 104); var13 += class139.field1979) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class139.field1979) {
                arg0.method968(0, 0, class139.field1979 * 4, class139.field1979 * 4);
                arg0.method929(-16777216);
                for (int var37 = arg2; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class139.field1979; var44++) {
                        for (int var50 = 0; var50 < class139.field1979; var50++) {
                            var12[var44][var50] = class139.method831(var13 + var44, arg2, var37, var36 + var50, (byte) -94);
                        }
                    }
                    class78.field887[var37].method1986(0, 0, 1024, var13, var36, class139.field1979 + var13, class139.field1979 + var36, var12);
                    if (!class56.field643) {
                        for (int var45 = -4; var45 < class139.field1979; var45++) {
                            for (int var46 = -4; var46 < class139.field1979; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var3 <= var47 && var48 >= var4 && class139.method831(var47, arg2, var37, var48, (byte) -117)) {
                                    int var49 = var37;
                                    if (class278.method1759(var48, 26002, var47)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class362.method2304((class139.field1979 - var46) * 4 - 4, 19487, var10, var47, var48, var9, var49, var45 * 4, arg0);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class56.field643) {
                    class39 var38 = class54.field613[arg2];
                    for (int var39 = 0; var39 < class139.field1979; var39++) {
                        for (int var40 = 0; var40 < class139.field1979; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field394[var41 - var38.field413][var42 - var38.field398];
                            if ((var43 & 0x40240000) != 0) {
                                arg0.method1150((byte) 106, (class139.field1979 - var40) * 4 - 4, var39 * 4, 4, 4, -1713569622);
                            } else if ((var43 & 0x800000) != 0) {
                                arg0.method1146(-1713569622, (byte) 60, (class139.field1979 - var40) * 4 - 4, 4, var39 * 4);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg0.method1148(var39 * 4 + 3, 1, -1713569622, 4, (class139.field1979 - var40) * 4 - 4);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg0.method1146(-1713569622, (byte) 60, (class139.field1979 - var40) * 4 - 1, 4, var39 * 4);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg0.method1148(var39 * 4, 1, -1713569622, 4, (class139.field1979 - var40) * 4 - 4);
                            }
                        }
                    }
                }
                arg0.method995(0, 0, class139.field1979 * 4, class139.field1979 * 4, var11, 2);
                class196.field2672.method54((var13 - var3) * 4 + 48, -((-var4 + var36) * 4) + -(class139.field1979 * 4) + 464, class139.field1979 * 4, class139.field1979 * 4, 0, 0);
            }
        }
        arg0.method957();
        arg0.method929(-16777215);
        class109.method609(-75);
        class26.field253 = 0;
        class93.field1027.method1116((byte) 125);
        if (!class56.field643) {
            for (int var14 = var3; var14 < (var3 + 104); var14++) {
                for (int var20 = var4; var20 < (var4 + 104); var20++) {
                    for (int var21 = arg2; var21 <= (arg2 + 1) && var21 <= 3; var21++) {
                        if (class139.method831(var14, arg2, var21, var20, (byte) -103)) {
                            class265 var22 = (class265) class122.method689(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class265) class310.method1944(var21, var14, var20, field1132 == null ? (field1132 = method542("sl")) : field1132);
                            }
                            if (var22 == null) {
                                var22 = (class265) class204.method1300(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class265) class338.method2176(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class327 var23 = class157.method1036(0, var22.method225(100));
                                if (!var23.field4664 || class166.field2325) {
                                    int var24 = var23.field4648;
                                    if (var23.field4645 != null) {
                                        for (int var25 = 0; var25 < var23.field4645.length; var25++) {
                                            if (var23.field4645[var25] != -1) {
                                                class327 var26 = class157.method1036(0, var23.field4645[var25]);
                                                if (var26.field4648 >= 0) {
                                                    var24 = var26.field4648;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class290 var28 = class117.method661((byte) 34, var24);
                                            if (var28 != null && var28.field4137) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class54.field613[var21].field394;
                                            int var32 = class54.field613[var21].field413;
                                            int var33 = class54.field613[var21].field398;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var3 < var29 && var14 - 3 < var29 && (var31[var29 - (var32 + 1)][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && (var3 + 104 - 1) > var29 && var29 < var14 + 3 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var30 > (var20 - 3) && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < var4 + 104 - 1 && var30 < (var20 + 3) && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class21.field227[class26.field253] = var23.field4592;
                                        class366.field5350[class26.field253] = var29;
                                        class138.field1968[class26.field253] = var30;
                                        class26.field253++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class407.field5911 != null) {
                class324.field4574.field665 = 1;
                class57.method337(1024, (byte) 108, 64);
                for (int var15 = 0; var15 < class407.field5911.field3017; var15++) {
                    int var16 = class407.field5911.field3015[var15];
                    if (var16 >> 28 == class410.field5931) {
                        int var17 = ((var16 & 0xFFFC02E) >> 14) - class40.field427;
                        int var18 = (var16 & 0x3FFF) - class217.field2975;
                        if (var17 >= 0 && var17 < class279.field3935 && var18 >= 0 && var18 < class164.field2287) {
                            class93.field1027.method1125(-1, new class193(var15));
                        } else {
                            class290 var19 = class117.method661((byte) 39, class407.field5911.field3016[var15]);
                            if (var19.field4158 != null && var19.field4153 + var17 >= 0 && class279.field3935 > (var19.field4155 + var17) && (var19.field4156 + var18) >= 0 && class164.field2287 > (var19.field4148 + var18)) {
                                class93.field1027.method1125(-1, new class193(var15));
                            }
                        }
                    }
                }
                class57.method337(128, (byte) 127, 64);
                class324.field4574.field665 = 2;
                class324.field4574.method338(-33);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BLbk;I)V")
    private final void method537(byte arg0, class211 arg1, int arg2) {
        if (arg0 != -108) {
            this.method537((byte) 122, (class211) null, 117);
        }
        if (arg2 == 1) {
            this.field1123 = arg1.method1355(32136);
            this.field1131 = arg1.method1342((byte) -128);
            this.field1121 = arg1.method1342((byte) -126);
        }
        field1120++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static final void method538(int arg0) {
        field1126++;
        class331 var1 = class139.field1976;
        synchronized (class139.field1976) {
            class139.field1976.method2052(0);
        }
        class331 var2 = class444.field6487;
        synchronized (class444.field6487) {
            if (arg0 != -1) {
                field1118 = 117;
            }
            class444.field6487.method2052(0);
        }
        class331 var3 = class360.field5262;
        synchronized (class360.field5262) {
            class360.field5262.method2052(arg0 + 1);
        }
        class331 var4 = class173.field2412;
        synchronized (class173.field2412) {
            class173.field2412.method2052(0);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lbk;I)V")
    public final void method539(class211 arg0, int arg1) {
        if (arg1 != 4) {
            field1129 = null;
        }
        field1128++;
        while (true) {
            int var3 = arg0.method1342((byte) -127);
            if (var3 == 0) {
                return;
            }
            this.method537((byte) -108, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public static void method540(int arg0) {
        field1125 = null;
        field1130 = null;
        field1129 = null;
        if (arg0 != 0) {
            field1124 = 92;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
    public static final String method541(int arg0, int arg1, boolean arg2, int arg3) {
        field1122++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg2 && arg0 >= 0) {
            if (arg3 > -56) {
                method538(5);
            }
            int var4 = 2;
            int var5 = arg0 / arg1;
            while (var5 != 0) {
                var5 /= arg1;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg0;
                arg0 /= arg1;
                int var9 = var8 - (arg0 * arg1);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg0, arg1);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method542(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
