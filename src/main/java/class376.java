import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public abstract class class376 extends class59 {

    @OriginalMember(owner = "client!si", name = "j", descriptor = "Z")
    private boolean field5479 = false;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "Z")
    private boolean field5485 = false;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public int field5477;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public int field5486;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "I")
    public int field5490;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "[I")
    public static int[] field5476 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!si", name = "m", descriptor = "Z")
    public static boolean field5482 = false;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "F")
    public static float field5483 = 1024.0F;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "I")
    public static int field5488 = 0;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "Llt;")
    public static class458 field5487;

    // $FF: synthetic field
    @OriginalMember(owner = "client!si", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field5491;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5480;

    // $FF: synthetic method
    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2268(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZIIIIIII)Z", line = 4)
    public static final boolean method2262(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5484++;
        int var9 = class286.field4329.field2232[0];
        int var10 = class286.field4329.field2239[0];
        if (var9 < 0 || var9 >= class150.field2422 || var10 < 0 || var10 >= class21.field272) {
            return false;
        } else if (arg4 >= 0 && arg4 < class150.field2422 && arg5 >= 0 && arg5 < class21.field272) {
            int var11 = -88 / ((arg6 - 58) / 52);
            int var12 = class418.method2449(arg0, var10, arg5, arg1, arg8, var9, arg7, class286.field4329.method337(0), class377.field5498, 10, arg3, class91.field1641[class286.field4329.field3217], arg4, arg2, class266.field4032);
            if (var12 < 1) {
                return false;
            }
            class402.field5846 = class266.field4032[var12 - 1];
            class312.field4695 = class377.field5498[var12 - 1];
            class395.field5764 = false;
            class228.method1375((byte) -49);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!si", name = "g", descriptor = "(I)V", line = 37)
    public static final void method2263(int arg0) {
        for (class142 var1 = (class142) class86.field1443.method8((byte) -98); var1 != null; var1 = (class142) class86.field1443.method17((byte) 39)) {
            if (class321.field4830 == null) {
                var1.method1121(false);
            } else if (class369.field5424 >= var1.field2302) {
                int var2 = class369.field5422[var1.field2303];
                if (var2 == 0) {
                    class455 var9 = class307.method1842(var1.field2297, var1.field2295, var1.field2300);
                    if (var9 instanceof class220) {
                        class447.method2674(var1.field2297, var1.field2295, var1.field2300);
                        class220 var10 = (class220) var9;
                        if (var10.field3378 != null) {
                            class398.method2362(var1.field2297, var1.field2295, var1.field2300, var10.field3378, null);
                        }
                    }
                } else if (var2 == 1) {
                    class431 var3 = class98.method741(var1.field2297, var1.field2295, var1.field2300);
                    if (var3 instanceof class175) {
                        class420.method2460(var1.field2297, var1.field2295, var1.field2300);
                        class175 var4 = (class175) var3;
                        if (var4.field2745 != null) {
                            class135.method901(var1.field2297, var1.field2295, var1.field2300, var4.field2745, null);
                        }
                    }
                } else if (var2 == 2) {
                    class205 var7 = class86.method607(var1.field2297, var1.field2295, var1.field2300, field5491 == null ? (field5491 = method2268("tf")) : field5491);
                    if (var7 instanceof class290) {
                        class273.method1657(var1.field2297, var1.field2295, var1.field2300, field5491 == null ? (field5491 = method2268("tf")) : field5491);
                        class290 var8 = (class290) var7;
                        if (var8.field4385 != null) {
                            class408.method2418(var8.field4385, false);
                        }
                    }
                } else if (var2 == 3) {
                    class376 var5 = class368.method2232(var1.field2297, var1.field2295, var1.field2300);
                    if (var5 instanceof class31) {
                        class158.method1010(var1.field2297, var1.field2295, var1.field2300);
                        class31 var6 = (class31) var5;
                        if (var6.field413 != null) {
                            class167.method1054(var1.field2297, var1.field2295, var1.field2300, var6.field413);
                        }
                    }
                }
                var1.method1121(false);
            } else if (class369.field5424 == var1.field2301) {
                int var11 = class369.field5422[var1.field2303];
                if (var11 == 0) {
                    class455 var21 = class307.method1842(var1.field2297, var1.field2295, var1.field2300);
                    if (var21 instanceof class220) {
                        var1.method1121(false);
                    } else if (class491.method2950(var1.field2297, var1.field2295, var1.field2300) == null) {
                        class220 var22 = new class220(var1.field2303, var1.field2294, var1.field2308, var1.field2296, var1.field2304, var21);
                        class398.method2362(var1.field2297, var1.field2295, var1.field2300, var22, null);
                    } else {
                        var1.method1121(false);
                    }
                } else if (var11 == 1) {
                    class431 var19 = class98.method741(var1.field2297, var1.field2295, var1.field2300);
                    if (var19 instanceof class175) {
                        var1.method1121(false);
                    } else if (class82.method592(var1.field2297, var1.field2295, var1.field2300) == null) {
                        class175 var20 = new class175(var1.field2303, var1.field2294, var1.field2308, var1.field2296, var1.field2304, var19);
                        class135.method901(var1.field2297, var1.field2295, var1.field2300, var20, null);
                    } else {
                        var1.method1121(false);
                    }
                } else if (var11 == 2) {
                    class205 var14 = class86.method607(var1.field2297, var1.field2295, var1.field2300, field5491 == null ? (field5491 = method2268("tf")) : field5491);
                    if (var14 instanceof class290) {
                        var1.method1121(false);
                    } else {
                        class273.method1657(var1.field2297, var1.field2295, var1.field2300, field5491 == null ? (field5491 = method2268("tf")) : field5491);
                        class56 var15 = class128.field2070.method916((byte) -15, var1.field2291);
                        int var16;
                        int var17;
                        if (var1.field2294 == 1 || var1.field2294 == 3) {
                            var16 = var15.field967;
                            var17 = var15.field915;
                        } else {
                            var16 = var15.field915;
                            var17 = var15.field967;
                        }
                        class290 var18 = new class290(var1.field2303, var1.field2294, var1.field2297, var1.field2308, var1.field2296, var1.field2304, var1.field2295, var1.field2295 + var16 - 1, var1.field2300, var1.field2300 + var17 - 1, var14);
                        class408.method2418(var18, false);
                    }
                } else if (var11 == 3) {
                    class376 var12 = class368.method2232(var1.field2297, var1.field2295, var1.field2300);
                    if (var12 instanceof class31) {
                        var1.method1121(false);
                    } else {
                        class31 var13 = new class31(var1.field2308, var1.field2296, var1.field2304, var12);
                        class167.method1054(var1.field2297, var1.field2295, var1.field2300, var13);
                    }
                }
            }
        }
        field5481++;
        if (arg0 <= 8) {
            method2264((byte) -70, 20);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)Z", line = 261)
    public static final boolean method2264(byte arg0, int arg1) {
        field5478++;
        if (class70.field1229[arg1]) {
            return true;
        } else if (class274.field4161.method2737(1, arg1)) {
            int var2 = class274.field4161.method2726((byte) 113, arg1);
            if (var2 == 0) {
                class70.field1229[arg1] = true;
                return true;
            }
            if (class409.field5933[arg1] == null) {
                class409.field5933[arg1] = new class427[var2];
            }
            if (arg0 >= -101) {
                return true;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class409.field5933[arg1][var3] == null) {
                    byte[] var4 = class274.field4161.method2715(var3, arg1, false);
                    if (var4 != null) {
                        class427 var5 = class409.field5933[arg1][var3] = new class427();
                        var5.field6157 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method2508(79, new class40(var4));
                    }
                }
            }
            class70.field1229[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIZZ)V", line = 321)
    public static final void method2265(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class239.field3602 = arg0;
        class434.field6362 = 0x1 << class239.field3602;
        class42.field621 = class434.field6362 >> 1;
        class160.field2519 = (int) Math.sqrt((double) (class42.field621 * class42.field621 + class42.field621 * class42.field621));
        class128.field2066 = class434.field6362 >> 2;
        class208.field3261 = class434.field6362;
        class377.field5492 = arg2;
        class347.field5132 = arg3;
        class320.field4826 = arg4;
        class20.field253 = new class268[arg1][class377.field5492][class347.field5132];
        class201.field3195 = new class343[arg1];
        if (arg5) {
            class280.field4251 = new int[class377.field5492][class347.field5132];
            class31.field407 = new byte[class377.field5492][class347.field5132];
            class226.field3467 = new byte[class377.field5492][class347.field5132];
            class471.field7206 = new class268[1][class377.field5492][class347.field5132];
            class262.field3978 = new class343[1];
        } else {
            class280.field4251 = null;
            class31.field407 = null;
            class226.field3467 = null;
            class471.field7206 = null;
            class262.field3978 = null;
        }
        if (arg6) {
            class155.field2450 = new long[arg1][arg2][arg3];
            class162.field2532 = new class233[65535];
            class467.field7164 = new boolean[65535];
            class51.field766 = 0;
        } else {
            class155.field2450 = null;
            class162.field2532 = null;
            class467.field7164 = null;
            class51.field766 = 0;
        }
        class7.method37(false);
        class150.field2419 = new class168[1000];
        class370.field5434 = 0;
        class299.field4532 = new class168[1000];
        class483.field7380 = 0;
        class17.field237 = new int[arg1][class377.field5492 + 1][class347.field5132 + 1];
        class355.field5297 = new class205[5000];
        class103.field1830 = 0;
        class358.field5313 = new boolean[class320.field4826 + class320.field4826 + 1][class320.field4826 + class320.field4826 + 1];
        class323.field4845 = new boolean[class320.field4826 + class320.field4826 + 2][class320.field4826 + class320.field4826 + 2];
        class100.field1810 = null;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(IIIZZ)V", line = 1518)
    public class376(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field5477 = arg0;
        this.field5485 = arg3;
        this.field5486 = arg2;
        this.field5479 = arg4;
        this.field5490 = arg1;
    }

    @OriginalMember(owner = "client!si", name = "h", descriptor = "(I)V", line = 381)
    public static void method2266(int arg0) {
        if (arg0 != -26958) {
            method2263(19);
        }
        field5487 = null;
        field5480 = null;
        field5476 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lpi;Loh;)V", line = 401)
    public static final void method2267(class329 arg0, class268 arg1) {
        if (!arg1.field4053) {
            return;
        }
        short var2 = arg1.field4057;
        short var3 = arg1.field4054;
        byte var4 = arg1.field4039;
        byte var5 = arg1.field4062;
        int var6 = (var2 << class239.field3602) + class42.field621;
        int var7 = (var3 << class239.field3602) + class42.field621;
        class268[][] var8 = class321.field4830[var4];
        float var9;
        if (class99.field1801 == class262.field3978) {
            class179.field2801.method1977(class201.field3195[0].method314(var6, var7), class399.method2368(var2, var3), class173.method1084(var2, var3), class347.method2120(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class179.field2801.method1993(3000.0F, var9 * 1.5F);
        if (arg1.field4044) {
            if (class114.field1933) {
                if (var4 > 0) {
                    class268 var10 = class321.field4830[var4 - 1][var2][var3];
                    if (var10 != null && var10.field4053) {
                        return;
                    }
                }
                if (var2 <= class7.field82 && var2 > class56.field916) {
                    class268 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field4053 && (var11.field4044 || (arg1.field4038 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class7.field82 && var2 < class255.field3886 - 1) {
                    class268 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field4053 && (var12.field4044 || (arg1.field4038 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class248.field3812 && var3 > class72.field1287) {
                    class268 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field4053 && (var13.field4044 || (arg1.field4038 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class248.field3812 && var3 < class14.field197 - 1) {
                    class268 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field4053 && (var14.field4044 || (arg1.field4038 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class114.field1933 = true;
            }
            arg1.field4044 = false;
            if (arg1.field4049 != null) {
                class268 var15 = arg1.field4049;
                class179.field2801.method1993(3000.0F, (201.5F - (float) (var15.field4062 + 1) * 50.0F) * 1.5F);
                if (!class39.method218(var15.field4062, var2, var3)) {
                    class99.field1801[var15.field4062].method306(var2, var3);
                }
                class455 var16 = var15.field4059;
                if (var16 != null) {
                    if (class311.field4687) {
                        if ((var16.field6979 & arg1.field4046) == 0) {
                            class28.method142(arg0, var4, var2, var3);
                        } else {
                            class19.method99(arg0, var16.field6979, var5, var2, var3);
                        }
                        class179.field2801.method1916(arg0.field4923, arg0.field4926);
                    }
                    var16.method169((byte) -56, class179.field2801);
                }
                for (class297 var17 = var15.field4045; var17 != null; var17 = var17.field4500) {
                    class205 var18 = var17.field4505;
                    if (var18 != null) {
                        if (class311.field4687) {
                            class28.method142(arg0, var4, var2, var3);
                            class179.field2801.method1916(arg0.field4923, arg0.field4926);
                        }
                        var18.method169((byte) -102, class179.field2801);
                    }
                }
                class179.field2801.method1993(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class39.method218(var5, var2, var3);
            if (var19) {
                class99.field1801[var5].method306(var2, var3);
                class376 var20 = arg1.field4042;
                if (var20 != null && var20.field5479) {
                    if (var20.field5485) {
                        class179.field2801.method1993(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class311.field4687) {
                        class28.method142(arg0, var4, var2, var3);
                        class179.field2801.method1916(arg0.field4923, arg0.field4926);
                    }
                    class227 var21 = var20.method169((byte) -114, class179.field2801);
                    if (var21 != null) {
                        var21.field3475 = var20;
                        var21.field3482 = var4;
                        var21.field3483 = var2;
                        var21.field3480 = var3;
                        class359.field5315.method1321((byte) 0, var21);
                    }
                    if (var20.field5485) {
                        class179.field2801.method1993(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class455 var24 = arg1.field4059;
            class431 var25 = arg1.field4052;
            if (var24 != null || var25 != null) {
                if (class7.field82 == var2) {
                    var22++;
                } else if (class7.field82 < var2) {
                    var22 += 2;
                }
                if (class248.field3812 == var3) {
                    var22 += 3;
                } else if (class248.field3812 > var3) {
                    var22 += 6;
                }
                var23 = class460.field7086[var22];
                arg1.field4046 = class410.field5947[var22];
            }
            if (var24 != null) {
                if ((var24.field6979 & class141.field2290[var22]) == 0) {
                    arg1.field4041 = 0;
                } else if (var24.field6979 == 16) {
                    arg1.field4041 = 3;
                    arg1.field4047 = class217.field3342[var22];
                    arg1.field4058 = (byte) (3 - arg1.field4047);
                } else if (var24.field6979 == 32) {
                    arg1.field4041 = 6;
                    arg1.field4047 = class403.field5865[var22];
                    arg1.field4058 = (byte) (6 - arg1.field4047);
                } else if (var24.field6979 == 64) {
                    arg1.field4041 = 12;
                    arg1.field4047 = class187.field2956[var22];
                    arg1.field4058 = (byte) (12 - arg1.field4047);
                } else {
                    arg1.field4041 = 9;
                    arg1.field4047 = class215.field3334[var22];
                    arg1.field4058 = (byte) (9 - arg1.field4047);
                }
                if ((var24.field6979 & var23) != 0 && !class203.method1258(var5, var2, var3, var24.field6979)) {
                    if (class311.field4687) {
                        class28.method142(arg0, var4, var2, var3);
                        class179.field2801.method1916(arg0.field4923, arg0.field4926);
                    }
                    class227 var26 = var24.method169((byte) -30, class179.field2801);
                    if (var26 != null) {
                        var26.field3475 = var24;
                        var26.field3482 = var4;
                        var26.field3483 = var2;
                        var26.field3480 = var3;
                        class359.field5315.method1321((byte) 0, var26);
                    }
                }
                class455 var27 = arg1.field4063;
                if (var27 != null && (var27.field6979 & var23) != 0 && !class203.method1258(var5, var2, var3, var27.field6979)) {
                    if (class311.field4687) {
                        class28.method142(arg0, var4, var2, var3);
                        class179.field2801.method1916(arg0.field4923, arg0.field4926);
                    }
                    class227 var28 = var27.method169((byte) -60, class179.field2801);
                    if (var28 != null) {
                        var28.field3475 = var27;
                        var28.field3482 = var4;
                        var28.field3483 = var2;
                        var28.field3480 = var3;
                        class359.field5315.method1321((byte) 0, var28);
                    }
                }
            }
            if (var25 != null && !class174.method1092(var5, var2, var3, var25.method1099((byte) 82))) {
                class431 var29 = arg1.field4051;
                class179.field2801.method1993(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field6337 & var23) != 0) {
                    if (class311.field4687) {
                        class28.method142(arg0, var4, var2, var3);
                        class179.field2801.method1916(arg0.field4923, arg0.field4926);
                    }
                    class227 var30 = var25.method169((byte) -58, class179.field2801);
                    if (var30 != null) {
                        var30.field3475 = var25;
                        var30.field3482 = var4;
                        var30.field3483 = var2;
                        var30.field3480 = var3;
                        class359.field5315.method1321((byte) 0, var30);
                    }
                } else if (var25.field6337 == 256) {
                    int var31 = var25.field6346 - class421.field6042;
                    int var32 = var25.field6339 - class168.field2618;
                    int var33 = var25.field6345;
                    int var34;
                    if (var33 == 1 || var33 == 2) {
                        var34 = -var31;
                    } else {
                        var34 = var31;
                    }
                    int var35;
                    if (var33 == 2 || var33 == 3) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    if (class311.field4687) {
                        class28.method142(arg0, var4, var2, var3);
                        class179.field2801.method1916(arg0.field4923, arg0.field4926);
                    }
                    if (var35 < var34) {
                        class227 var36 = var25.method169((byte) -117, class179.field2801);
                        if (var36 != null) {
                            var36.field3475 = var25;
                            var36.field3482 = var4;
                            var36.field3483 = var2;
                            var36.field3480 = var3;
                            class359.field5315.method1321((byte) 0, var36);
                        }
                    } else if (var29 != null) {
                        class227 var37 = var29.method169((byte) -14, class179.field2801);
                        if (var37 != null) {
                            var37.field3475 = var29;
                            var37.field3482 = var4;
                            var37.field3483 = var2;
                            var37.field3480 = var3;
                            class359.field5315.method1321((byte) 0, var37);
                        }
                    }
                }
                class179.field2801.method1993(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class376 var38 = arg1.field4042;
                if (var38 != null && !var38.field5479) {
                    if (var38.field5485) {
                        class179.field2801.method1993(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class311.field4687) {
                        class28.method142(arg0, var4, var2, var3);
                        class179.field2801.method1916(arg0.field4923, arg0.field4926);
                    }
                    class227 var39 = var38.method169((byte) -101, class179.field2801);
                    if (var39 != null) {
                        var39.field3475 = var38;
                        var39.field3482 = var4;
                        var39.field3483 = var2;
                        var39.field3480 = var3;
                        class359.field5315.method1321((byte) 0, var39);
                    }
                    if (var38.field5485) {
                        class179.field2801.method1993(3000.0F, var9 * 1.5F);
                    }
                }
                class412 var40 = arg1.field4056;
                if (var40 != null && !var40.field5976) {
                    if (class311.field4687) {
                        class28.method142(arg0, var4, var2, var3);
                        class179.field2801.method1916(arg0.field4923, arg0.field4926);
                    }
                    class227 var41 = var40.method169((byte) -102, class179.field2801);
                    if (var41 != null) {
                        var41.field3475 = var40;
                        var41.field3482 = var4;
                        var41.field3483 = var2;
                        var41.field3480 = var3;
                        class359.field5315.method1321((byte) 0, var41);
                    }
                }
            }
            byte var42 = arg1.field4038;
            if (var42 != 0) {
                if (var2 < class7.field82 && (var42 & 0x4) != 0) {
                    class268 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field4053) {
                        class100.field1810.method864(var43, 116);
                    }
                }
                if (var3 < class248.field3812 && (var42 & 0x2) != 0) {
                    class268 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field4053) {
                        class100.field1810.method864(var44, 112);
                    }
                }
                if (var2 > class7.field82 && (var42 & 0x1) != 0) {
                    class268 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field4053) {
                        class100.field1810.method864(var45, 105);
                    }
                }
                if (var3 > class248.field3812 && (var42 & 0x8) != 0) {
                    class268 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field4053) {
                        class100.field1810.method864(var46, 109);
                    }
                }
            }
        }
        if (arg1.field4041 != 0) {
            boolean var47 = true;
            for (class297 var48 = arg1.field4045; var48 != null; var48 = var48.field4500) {
                if (class321.field4828 != var48.field4505.field3221 && (var48.field4506 & arg1.field4041) == arg1.field4047) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class455 var49 = arg1.field4059;
                if (!class203.method1258(var5, var2, var3, var49.field6979)) {
                    if (class311.field4687) {
                        label682: {
                            if (var49.field6979 >= 16) {
                                int var50 = var2 - class7.field82;
                                int var51 = var3 - class248.field3812;
                                if (var49.field6979 == 16) {
                                    int var52 = var50 - class42.field621;
                                    int var53 = class42.field621 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class347.field5132) {
                                        class28.method142(arg0, var4, var2 - 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field6979 == 32) {
                                    int var54 = class42.field621 + var50;
                                    int var55 = class42.field621 + var51;
                                    if (var55 < -var54 && var2 < class377.field5492 && var3 < class347.field5132) {
                                        class28.method142(arg0, var4, var2 + 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field6979 == 64) {
                                    int var56 = class42.field621 + var50;
                                    int var57 = var51 - class42.field621;
                                    if (var57 > var56 && var2 < class377.field5492 && var3 > 0) {
                                        class28.method142(arg0, var4, var2 + 1, var3 - 1);
                                        break label682;
                                    }
                                } else if (var49.field6979 == 128) {
                                    int var58 = var50 - class42.field621;
                                    int var59 = var51 - class42.field621;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class28.method142(arg0, var4, var2 - 1, var3 - 1);
                                        break label682;
                                    }
                                }
                            }
                            class28.method142(arg0, var4, var2, var3);
                        }
                        class179.field2801.method1916(arg0.field4923, arg0.field4926);
                    }
                    class227 var60 = var49.method169((byte) -54, class179.field2801);
                    if (var60 != null) {
                        var60.field3475 = var49;
                        var60.field3482 = var4;
                        var60.field3483 = var2;
                        var60.field3480 = var3;
                        class359.field5315.method1321((byte) 0, var60);
                    }
                }
                arg1.field4041 = 0;
            }
        }
        if (arg1.field4048) {
            try {
                arg1.field4048 = false;
                int var61 = 0;
                label625: for (class297 var62 = arg1.field4045; var62 != null; var62 = var62.field4500) {
                    class205 var63 = var62.field4505;
                    if (class321.field4828 != var63.field3221) {
                        for (int var64 = var63.field3225; var64 <= var63.field3227; var64++) {
                            for (int var65 = var63.field3219; var65 <= var63.field3220; var65++) {
                                class268 var66 = var8[var64][var65];
                                if (var66.field4044) {
                                    arg1.field4048 = true;
                                    continue label625;
                                }
                                if (var66.field4041 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field3225) {
                                        var67++;
                                    }
                                    if (var64 < var63.field3227) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field3219) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field3220) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field4041) == arg1.field4058) {
                                        arg1.field4048 = true;
                                        continue label625;
                                    }
                                }
                            }
                        }
                        int var68 = class7.field82 - var63.field3225;
                        int var69 = var63.field3227 - class7.field82;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class248.field3812 - var63.field3219;
                        int var71 = var63.field3220 - class248.field3812;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field4930[var61] = var63;
                        arg0.field4931[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class205 var75 = arg0.field4930[var74];
                        if (class321.field4828 != var75.field3221) {
                            int var76 = arg0.field4931[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field3218 - class421.field6042;
                                int var78 = var75.field3222 - class168.field2618;
                                int var79 = arg0.field4930[var73].field3218 - class421.field6042;
                                int var80 = arg0.field4930[var73].field3222 - class168.field2618;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class205 var81 = arg0.field4930[var73];
                    var81.field3221 = class321.field4828;
                    if (!class72.method533(var5, var81.field3225, var81.field3227, var81.field3219, var81.field3220, var81.method333(0))) {
                        if (class311.field4687) {
                            if (var81.field3226 == 0) {
                                class458.method2740(arg0, var4, var81.field3225, var81.field3219, var81.field3227, var81.field3220);
                            } else {
                                class28.method142(arg0, var4, var2, var3);
                                int var82 = var2 - class7.field82;
                                int var83 = var3 - class248.field3812;
                                if (var81.field3226 == 2) {
                                    if (var83 > -var82) {
                                        class100.method753(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class100.method753(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class100.method753(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class100.method753(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class179.field2801.method1916(arg0.field4923, arg0.field4926);
                        }
                        class227 var84 = var81.method169((byte) -46, class179.field2801);
                        if (var84 != null) {
                            var84.field3475 = var81;
                            var84.field3482 = var4;
                            var84.field3483 = var81.field3225;
                            var84.field3480 = var81.field3219;
                            class359.field5315.method1321((byte) 0, var84);
                        }
                    }
                    for (int var85 = var81.field3225; var85 <= var81.field3227; var85++) {
                        for (int var86 = var81.field3219; var86 <= var81.field3220; var86++) {
                            class268 var87 = var8[var85][var86];
                            if (var87.field4041 != 0) {
                                class100.field1810.method864(var87, 123);
                            } else if ((var2 != var85 || var3 != var86) && var87.field4053) {
                                class100.field1810.method864(var87, 126);
                            }
                        }
                    }
                }
                if (arg1.field4048) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field4048 = false;
            }
        }
        if (arg1.field4060 != null && (byte) (class67.field1095 & 0xFF) == arg1.field4050) {
            class372 var88 = arg1.field4060;
            int var89 = class99.field1801[var4].method318(var2, var3);
            int var90;
            if (var4 < class483.field7381 - 1) {
                var90 = class99.field1801[var4].method318(var2, var3) - class99.field1801[var4 + 1].method318(var2, var3);
            } else {
                var90 = 0x8 << class239.field3602;
            }
            class144.field2346.method186(var6, var89, var7, arg0.field4925);
            int var91 = arg0.field4925[2];
            class144.field2346.method186(var6, var89 - var90, var7, arg0.field4925);
            int var92 = arg0.field4925[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class160.field2519;
            int var96 = class160.field2519 + var94;
            var88.field5450 = var95;
            var88.field5451 = var96;
            var88.field5449 = true;
            class179.field2801.method1900(var88);
        }
        if (!arg1.field4053) {
            return;
        }
        if (arg1.field4041 != 0) {
            return;
        }
        if (var2 <= class7.field82 && var2 > class56.field916) {
            class268 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field4053) {
                return;
            }
        }
        if (var2 >= class7.field82 && var2 < class255.field3886 - 1) {
            class268 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field4053) {
                return;
            }
        }
        if (var3 <= class248.field3812 && var3 > class72.field1287) {
            class268 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field4053) {
                return;
            }
        }
        if (var3 >= class248.field3812 && var3 < class14.field197 - 1) {
            class268 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field4053) {
                return;
            }
        }
        arg1.field4053 = false;
        class65.field1074--;
        class412 var101 = arg1.field4056;
        if (var101 != null && var101.field5976) {
            if (class311.field4687) {
                class28.method142(arg0, var4, var2, var3);
                class179.field2801.method1916(arg0.field4923, arg0.field4926);
            }
            class227 var102 = var101.method169((byte) -43, class179.field2801);
            if (var102 != null) {
                var102.field3475 = var101;
                var102.field3482 = var4;
                var102.field3483 = var2;
                var102.field3480 = var3;
                class359.field5315.method1321((byte) 0, var102);
            }
        }
        if (arg1.field4046 != 0) {
            class431 var103 = arg1.field4052;
            if (var103 != null && !class174.method1092(var5, var2, var3, var103.method1099((byte) -73))) {
                if ((var103.field6337 & arg1.field4046) != 0) {
                    if (class311.field4687) {
                        class28.method142(arg0, var4, var2, var3);
                        class179.field2801.method1916(arg0.field4923, arg0.field4926);
                    }
                    class227 var104 = var103.method169((byte) -25, class179.field2801);
                    if (var104 != null) {
                        var104.field3475 = var103;
                        var104.field3482 = var4;
                        var104.field3483 = var2;
                        var104.field3480 = var3;
                        class359.field5315.method1321((byte) 0, var104);
                    }
                } else if (var103.field6337 == 256) {
                    int var105 = var103.field6346 - class421.field6042;
                    int var106 = var103.field6339 - class168.field2618;
                    int var107 = var103.field6345;
                    int var108;
                    if (var107 == 1 || var107 == 2) {
                        var108 = -var105;
                    } else {
                        var108 = var105;
                    }
                    int var109;
                    if (var107 == 2 || var107 == 3) {
                        var109 = -var106;
                    } else {
                        var109 = var106;
                    }
                    if (class311.field4687) {
                        class28.method142(arg0, var4, var2, var3);
                        class179.field2801.method1916(arg0.field4923, arg0.field4926);
                    }
                    class431 var110 = arg1.field4051;
                    if (var109 > var108) {
                        class227 var111 = var103.method169((byte) -47, class179.field2801);
                        if (var111 != null) {
                            var111.field3475 = var103;
                            var111.field3482 = var4;
                            var111.field3483 = var2;
                            var111.field3480 = var3;
                            class359.field5315.method1321((byte) 0, var111);
                        }
                    } else if (var110 != null) {
                        class227 var112 = var110.method169((byte) -59, class179.field2801);
                        if (var112 != null) {
                            var112.field3475 = var110;
                            var112.field3482 = var4;
                            var112.field3483 = var2;
                            var112.field3480 = var3;
                            class359.field5315.method1321((byte) 0, var112);
                        }
                    }
                }
            }
            class455 var113 = arg1.field4059;
            class455 var114 = arg1.field4063;
            if (var114 != null && (var114.field6979 & arg1.field4046) != 0 && !class203.method1258(var5, var2, var3, var114.field6979)) {
                if (class311.field4687) {
                    class19.method99(arg0, var114.field6979, var4, var2, var3);
                    class179.field2801.method1916(arg0.field4923, arg0.field4926);
                }
                class227 var115 = var114.method169((byte) -14, class179.field2801);
                if (var115 != null) {
                    var115.field3475 = var114;
                    var115.field3482 = var4;
                    var115.field3483 = var2;
                    var115.field3480 = var3;
                    class359.field5315.method1321((byte) 0, var115);
                }
            }
            if (var113 != null && (var113.field6979 & arg1.field4046) != 0 && !class203.method1258(var5, var2, var3, var113.field6979)) {
                if (class311.field4687) {
                    class19.method99(arg0, var113.field6979, var4, var2, var3);
                    class179.field2801.method1916(arg0.field4923, arg0.field4926);
                }
                class227 var116 = var113.method169((byte) -127, class179.field2801);
                if (var116 != null) {
                    var116.field3475 = var113;
                    var116.field3482 = var4;
                    var116.field3483 = var2;
                    var116.field3480 = var3;
                    class359.field5315.method1321((byte) 0, var116);
                }
            }
        }
        if (var4 < class483.field7381 - 1) {
            class268 var117 = class321.field4830[var4 + 1][var2][var3];
            if (var117 != null && var117.field4053) {
                class100.field1810.method857(var117, 0);
            }
        }
        if (var2 < class7.field82) {
            class268 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field4053) {
                class100.field1810.method864(var118, 123);
            }
        }
        if (var3 < class248.field3812) {
            class268 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field4053) {
                class100.field1810.method864(var119, 118);
            }
        }
        if (var2 > class7.field82) {
            class268 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field4053) {
                class100.field1810.method864(var120, 117);
            }
        }
        if (var3 > class248.field3812) {
            class268 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field4053) {
                class100.field1810.method864(var121, 108);
            }
        }
    }
}
