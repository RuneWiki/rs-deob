import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class71 extends class171 {

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "I")
    public int field977 = 0;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "Llc;")
    public static class86 field991 = new class86(30);

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "Z")
    public static boolean field993 = false;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "[I")
    public static int[] field994 = new int[50];

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "Ljava/lang/String;")
    public static String field996 = "scroll:";

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public int field969;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public int field970;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public int field972;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "I")
    public int field974;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
    public int field980;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
    public int field983;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
    public int field987;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    public int field988;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    public int field990;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "Lde;")
    public class111 field986;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "Lfi;")
    public class112 field989;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "Lfi;")
    public class112 field992;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "Lak;")
    public class140 field971;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "Lai;")
    public class88 field975;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "Z")
    public boolean field982;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "[I")
    public int[] field978;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "[I")
    public static int[] field995;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)V")
    public final void method439(int arg0) {
        if (arg0 != 22387) {
            return;
        }
        int var2 = this.field973;
        field984++;
        if (this.field986 != null) {
            class111 var3 = this.field986.method726((byte) -124);
            if (var3 == null) {
                this.field985 = 0;
                this.field969 = 0;
                this.field987 = 0;
                this.field978 = null;
                this.field990 = 0;
                this.field973 = -1;
            } else {
                this.field990 = var3.field1588 * 128;
                this.field987 = var3.field1562;
                this.field978 = var3.field1542;
                this.field985 = var3.field1593;
                this.field973 = var3.field1550;
                this.field969 = var3.field1592;
            }
        } else if (this.field971 != null) {
            int var4 = class13.method78(this.field971, (byte) 96);
            if (var2 != var4) {
                this.field973 = var4;
                class284 var5 = this.field971.field1946;
                if (var5.field4450 != null) {
                    var5 = var5.method1905((byte) -26);
                }
                if (var5 == null) {
                    this.field985 = this.field990 = 0;
                } else {
                    this.field985 = var5.field4439;
                    this.field990 = var5.field4441 * 128;
                }
            }
        } else if (this.field975 != null) {
            this.field973 = class204.method1299(this.field975, 77);
            this.field990 = this.field975.field1202 * 128;
            this.field985 = this.field975.field1218;
        }
        if (this.field973 != var2 && this.field989 != null) {
            class21.field298.method360(this.field989);
            this.field989 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILql;)V")
    public static final void method440(int arg0, class224 arg1) {
        if (arg0 != 0) {
            field994 = null;
        }
        field979++;
        while (true) {
            while (arg1.field3336.length > arg1.field3402) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1453((byte) -128) == 1) {
                    var3 = arg1.method1453((byte) -127);
                    var4 = arg1.method1453((byte) -127);
                    var2 = true;
                }
                int var5 = arg1.method1453((byte) -127);
                int var6 = arg1.method1453((byte) -127);
                int var7 = class142.field1972 + class41.field605 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class164.field2273;
                if (var8 >= 0 && var7 - 63 >= 0 && class138.field1929 > (var8 + 63) && var7 < class41.field605) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var3 * 8) <= var11 && var11 < (var3 * 8 + 8) && var12 >= var4 * 8 && var12 < (var4 * 8 + 8)) {
                                byte var13 = arg1.method1437((byte) -120);
                                if (var13 != 0) {
                                    if (class297.field4697[var9][var10] == null) {
                                        class297.field4697[var9][var10] = new byte[4096];
                                    }
                                    class297.field4697[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1437((byte) -121);
                                    if (class123.field1716[var9][var10] == null) {
                                        class123.field1716[var9][var10] = new byte[4096];
                                    }
                                    class123.field1716[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method1437((byte) -73);
                        if (var16 != 0) {
                            arg1.field3402++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
    public static void method441(boolean arg0) {
        field991 = null;
        field994 = null;
        field996 = null;
        if (!arg0) {
            field996 = null;
        }
        field995 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)Lcc;")
    public static final class216 method442(int arg0, int arg1) {
        field981++;
        class216 var2 = (class216) class193.field2657.method540((byte) -115, (long) arg1);
        if (arg0 != 8) {
            method443((byte[]) null, 39);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class39.field589.method1576(-107, class208.method1333((byte) -106, arg1), class175.method1152(0, arg1));
        class216 var4 = new class216();
        if (var3 != null) {
            var4.method1405(126, new class224(var3));
        }
        class193.field2657.method543(var4, (long) arg1, 858993459);
        return var4;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([BI)Z")
    public static final boolean method443(byte[] arg0, int arg1) {
        class224 var2 = new class224(arg0);
        field976++;
        int var3 = var2.method1453((byte) -127);
        if (var3 != 1) {
            return false;
        }
        if (arg1 >= -107) {
            field993 = true;
        }
        boolean var4 = var2.method1453((byte) -127) == 1;
        if (var4) {
            class88.method557(var2, (byte) 127);
        }
        class129.method883(var2, (byte) -119);
        return true;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method444(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class44.field662++;
        class199.field2774 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class208.field2969; var12 < class27.field342; var12++) {
            class89[][] var38 = class194.field2682[var12];
            for (int var39 = class142.field1969; var39 < class132.field1883; var39++) {
                for (int var40 = class250.field3829; var40 < class93.field1286; var40++) {
                    class89 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class76.field1059[var39 + class153.field2123 - class213.field3206][var40 + class153.field2123 - class266.field4044] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field1239 = true;
                            var41.field1222 = true;
                            if (var41.field1240 > 0) {
                                var41.field1236 = true;
                            } else {
                                var41.field1236 = false;
                            }
                            class199.field2774++;
                        } else {
                            var41.field1239 = false;
                            var41.field1222 = false;
                            var41.field1231 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field1244 != null) {
                                    class197 var42 = var41.field1244;
                                    var42.field2725.method170(0, var12, var42.field2722, var42.field2729, var42.field2721);
                                    if (var42.field2727 != null) {
                                        var42.field2727.method170(0, var12, var42.field2722, var42.field2729, var42.field2721);
                                    }
                                }
                                if (var41.field1235 != null) {
                                    class228 var43 = var41.field1235;
                                    var43.field3459.method170(var43.field3462, var12, var43.field3452, var43.field3450, var43.field3451);
                                    if (var43.field3463 != null) {
                                        var43.field3463.method170(var43.field3462, var12, var43.field3452, var43.field3450, var43.field3451);
                                    }
                                }
                                if (var41.field1237 != null) {
                                    class23 var44 = var41.field1237;
                                    var44.field328.method170(0, var12, var44.field323, var44.field325, var44.field326);
                                }
                                if (var41.field1226 != null) {
                                    for (int var45 = 0; var45 < var41.field1240; var45++) {
                                        class198 var46 = var41.field1226[var45];
                                        var46.field2752.method170(var46.field2762, var12, var46.field2745, var46.field2760, var46.field2757);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class95.field1341 == class200.field2788;
        for (int var14 = class208.field2969; var14 < class27.field342; var14++) {
            class89[][] var27 = class194.field2682[var14];
            for (int var28 = -class153.field2123; var28 <= 0; var28++) {
                int var29 = class213.field3206 + var28;
                int var30 = class213.field3206 - var28;
                if (var29 >= class142.field1969 || var30 < class132.field1883) {
                    for (int var31 = -class153.field2123; var31 <= 0; var31++) {
                        int var32 = class266.field4044 + var31;
                        int var33 = class266.field4044 - var31;
                        if (var29 >= class142.field1969) {
                            if (var32 >= class250.field3829) {
                                class89 var34 = var27[var29][var32];
                                if (var34 != null && var34.field1239) {
                                    class197.method1256(var34, true);
                                }
                            }
                            if (var33 < class93.field1286) {
                                class89 var35 = var27[var29][var33];
                                if (var35 != null && var35.field1239) {
                                    class197.method1256(var35, true);
                                }
                            }
                        }
                        if (var30 < class132.field1883) {
                            if (var32 >= class250.field3829) {
                                class89 var36 = var27[var30][var32];
                                if (var36 != null && var36.field1239) {
                                    class197.method1256(var36, true);
                                }
                            }
                            if (var33 < class93.field1286) {
                                class89 var37 = var27[var30][var33];
                                if (var37 != null && var37.field1239) {
                                    class197.method1256(var37, true);
                                }
                            }
                        }
                        if (class199.field2774 == 0) {
                            if (!var13) {
                                class65.field885 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class208.field2969; var15 < class27.field342; var15++) {
            class89[][] var16 = class194.field2682[var15];
            for (int var17 = -class153.field2123; var17 <= 0; var17++) {
                int var18 = class213.field3206 + var17;
                int var19 = class213.field3206 - var17;
                if (var18 >= class142.field1969 || var19 < class132.field1883) {
                    for (int var20 = -class153.field2123; var20 <= 0; var20++) {
                        int var21 = class266.field4044 + var20;
                        int var22 = class266.field4044 - var20;
                        if (var18 >= class142.field1969) {
                            if (var21 >= class250.field3829) {
                                class89 var23 = var16[var18][var21];
                                if (var23 != null && var23.field1239) {
                                    class197.method1256(var23, false);
                                }
                            }
                            if (var22 < class93.field1286) {
                                class89 var24 = var16[var18][var22];
                                if (var24 != null && var24.field1239) {
                                    class197.method1256(var24, false);
                                }
                            }
                        }
                        if (var19 < class132.field1883) {
                            if (var21 >= class250.field3829) {
                                class89 var25 = var16[var19][var21];
                                if (var25 != null && var25.field1239) {
                                    class197.method1256(var25, false);
                                }
                            }
                            if (var22 < class93.field1286) {
                                class89 var26 = var16[var19][var22];
                                if (var26 != null && var26.field1239) {
                                    class197.method1256(var26, false);
                                }
                            }
                        }
                        if (class199.field2774 == 0) {
                            if (!var13) {
                                class65.field885 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class65.field885 = false;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIII)Lnk;")
    public static final class130 method445(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = (long) arg4 & 0xFFFFL | 0xFFFFL << 32 & (long) arg3 << 32 | 0xFFFFL << 48 & (long) arg0 << 48 | (long) arg1 << 16 & 0xFFFFL << 16;
        class130 var7 = (class130) class227.field3445.method540((byte) -126, var5);
        field968++;
        if (arg2 != -211334896) {
            method441(false);
        }
        if (var7 != null) {
            return var7;
        }
        class196[] var8 = null;
        class255 var9 = class6.method39(29, arg4);
        if (var9.field3907 != null) {
            var8 = new class196[var9.field3907.length];
            for (int var10 = 0; var10 < var8.length; var10++) {
                class295 var11 = class65.method414(0, var9.field3907[var10]);
                var8[var10] = new class196(var11.field4644, var11.field4634, var11.field4636, var11.field4641, var11.field4639, var11.field4652, var11.field4648, var11.field4643);
            }
        }
        class130 var12 = new class130(var9.field3903, var8, var9.field3910, arg0, arg3, arg1);
        class227.field3445.method543(var12, var5, 858993459);
        return var12;
    }
}
