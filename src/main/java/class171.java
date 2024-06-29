import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class171 {

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field2373 = 0;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2375 = "Checking for updates - ";

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field2372 = 1;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "[Lgk;")
    public static class159[] field2370 = new class159[14];

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2368 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "J")
    public long field2369;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "Ljg;")
    public class171 field2367;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "Ljg;")
    public class171 field2378;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I[Lse;I)V")
    public static final void method1114(int arg0, class211[] arg1, int arg2) {
        int var3 = 0;
        if (arg0 >= -111) {
            return;
        }
        while (var3 < arg1.length) {
            class211 var4 = arg1[var3];
            if (var4 != null && var4.field3127 == arg2 && (!var4.field3011 || !client.method1045(var4))) {
                label112: {
                    if (var4.field3035 == 0) {
                        if (!var4.field3011 && client.method1045(var4) && class270.field4147 != var4) {
                            break label112;
                        }
                        method1114(-112, arg1, var4.field3093);
                        if (var4.field3180 != null) {
                            method1114(-112, var4.field3180, var4.field3093);
                        }
                        class56 var5 = (class56) class289.field4559.method23(216, (long) var4.field3093);
                        if (var5 != null) {
                            class208.method1322(var5.field808, (byte) -45);
                        }
                    }
                    if (var4.field3035 == 6) {
                        if (var4.field3083 != -1 || var4.field3034 != -1) {
                            boolean var6 = class175.method1150((byte) 75, var4);
                            int var7;
                            if (var6) {
                                var7 = var4.field3034;
                            } else {
                                var7 = var4.field3083;
                            }
                            if (var7 != -1) {
                                class240 var8 = class132.method905(true, var7);
                                if (var8 != null) {
                                    var4.field3051 += class225.field3409;
                                    while (var4.field3051 > var8.field3673[var4.field3074]) {
                                        var4.field3051 -= var8.field3673[var4.field3074];
                                        var4.field3074++;
                                        if (var8.field3665.length <= var4.field3074) {
                                            var4.field3074 -= var8.field3682;
                                            if (var4.field3074 < 0 || var8.field3665.length <= var4.field3074) {
                                                var4.field3074 = 0;
                                            }
                                        }
                                        var4.field3021 = var4.field3074 + 1;
                                        if (var8.field3665.length <= var4.field3021) {
                                            var4.field3021 -= var8.field3682;
                                            if (var4.field3021 < 0 || var4.field3021 >= var8.field3665.length) {
                                                var4.field3021 = -1;
                                            }
                                        }
                                        class236.method1583(var4, 0);
                                    }
                                }
                            }
                        }
                        if (var4.field3099 != 0 && !var4.field3011) {
                            int var9 = var4.field3099 << 16 >> 16;
                            int var10 = var4.field3099 >> 16;
                            int var11 = class225.field3409 * var10;
                            var4.field3040 = var4.field3040 + var11 & 0x7FF;
                            int var12 = class225.field3409 * var9;
                            var4.field3041 = var4.field3041 + var12 & 0x7FF;
                            class236.method1583(var4, 0);
                        }
                    }
                }
            }
            var3++;
        }
        field2377++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public final void method1115(int arg0) {
        field2374++;
        if (this.field2367 == null) {
            return;
        }
        this.field2367.field2378 = this.field2378;
        this.field2378.field2367 = this.field2367;
        this.field2378 = null;
        int var2 = 76 / ((-arg0 - 86) / 34);
        this.field2367 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)Z")
    public final boolean method1116(byte arg0) {
        field2379++;
        if (this.field2367 == null) {
            return false;
        } else if (arg0 < 106) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public static void method1117(int arg0) {
        if (arg0 == 0) {
            field2375 = null;
            field2368 = null;
            field2370 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIII)V")
    public static final void method1118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2371++;
        int var6 = arg4 - arg1;
        int var7 = arg5 - arg2;
        if (var6 == 0) {
            if (var7 != 0) {
                class76.method486(arg0, arg5, arg2, arg1, arg3 - 25500);
            }
        } else if (var7 == 0) {
            class270.method1786(arg0, arg4, false, arg2, arg1);
        } else {
            if (arg3 != 25478) {
                field2370 = null;
            }
            int var8 = (var7 << 12) / var6;
            int var9 = arg2 - (arg1 * var8 >> 12);
            int var10;
            int var11;
            if (class93.field1294 > arg4) {
                var10 = (class93.field1294 * var8 >> 12) + var9;
                var11 = class93.field1294;
            } else if (class296.field4668 >= arg4) {
                var11 = arg4;
                var10 = arg5;
            } else {
                var11 = class296.field4668;
                var10 = var9 + (class296.field4668 * var8 >> 12);
            }
            int var12;
            int var13;
            if (arg1 < class93.field1294) {
                var12 = class93.field1294;
                var13 = var9 + (class93.field1294 * var8 >> 12);
            } else if (class296.field4668 < arg1) {
                var12 = class296.field4668;
                var13 = (class296.field4668 * var8 >> 12) + var9;
            } else {
                var13 = arg2;
                var12 = arg1;
            }
            if (var10 < class273.field4228) {
                var10 = class273.field4228;
                var11 = (class273.field4228 - var9 << 12) / var8;
            } else if (var10 > class127.field1782) {
                var10 = class127.field1782;
                var11 = (class127.field1782 - var9 << 12) / var8;
            }
            if (var13 < class273.field4228) {
                var12 = (class273.field4228 - var9 << 12) / var8;
                var13 = class273.field4228;
            } else if (var13 > class127.field1782) {
                var13 = class127.field1782;
                var12 = (class127.field1782 - var9 << 12) / var8;
            }
            class211.method1365(var11, arg0, var10, var13, -121, var12);
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
    public static final void method1119(int arg0) {
        class88.field1210 = -1;
        field2366++;
        class15.field146 = false;
        class281.field4359.field3402 = 0;
        class68.field925 = 0;
        class214.field3226 = 0;
        class253.field3868 = -1;
        class261.field3946 = 0;
        class286.field4481 = 0;
        class233.field3518.field3402 = 0;
        int var1 = 23 / ((arg0 + 62) / 55);
        class203.field2819 = -1;
        class105.field1460 = 0;
        class234.field3535 = 0;
        class151.field2100 = -1;
        for (int var2 = 0; var2 < class154.field2133.length; var2++) {
            if (class154.field2133[var2] != null) {
                class154.field2133[var2].field4014 = -1;
            }
        }
        for (int var3 = 0; var3 < class119.field1679.length; var3++) {
            if (class119.field1679[var3] != null) {
                class119.field1679[var3].field4014 = -1;
            }
        }
        class266.method1742(107);
        class51.field734 = 1;
        class145.method977(-36, 30);
        for (int var4 = 0; var4 < 100; var4++) {
            class42.field640[var4] = true;
        }
        class294.method1970(102);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
    public static final void method1120(byte arg0) {
        field2380++;
        class279.method1868(5, 32);
        class210.method1364(5, 0);
        class22.method166(10, 5);
        class56.method348((byte) -89, 5);
        class131.method890(5, (byte) -110);
        class219.method1414(12411, 5);
        class268.method1769(5, (byte) -103);
        class241.method1615(-106, 5);
        class35.method239(5, 1936963112);
        class101.method670((byte) 119, 5);
        class127.method849(90, 5);
        class234.method1538((byte) 93, 5);
        class34.method229(false, 5);
        class248.method1664(5, -118);
        class189.method1210(5, (byte) -97);
        class189.method1209((byte) 124, 5);
        if (arg0 >= -118) {
            return;
        }
        class268.method1768(5, (byte) -125);
        class250.method1678(50, (byte) -116);
        class127.method852(5, false);
        class210.method1361(5, 118);
        class239.field3636.method536(74, 5);
        class78.field1090.method536(93, 5);
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)V")
    public static final void method1121(int arg0) {
        for (int var1 = arg0; var1 < class242.field3711; var1++) {
            int var2 = class63.field870[var1];
            class88 var3 = class154.field2133[var2];
            int var4 = class233.field3518.method1453((byte) -128);
            if ((var4 & 0x80) != 0) {
                var4 += class233.field3518.method1453((byte) -127) << 8;
            }
            class199.method1269(var2, var4, var3, false);
        }
        field2365++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljg;ZLjg;)V")
    public static final void method1122(class171 arg0, boolean arg1, class171 arg2) {
        field2376++;
        if (arg0.field2367 != null) {
            arg0.method1115(-120);
        }
        arg0.field2367 = arg2.field2367;
        arg0.field2378 = arg2;
        arg0.field2367.field2378 = arg0;
        arg0.field2378.field2367 = arg0;
        if (arg1) {
            field2370 = null;
        }
    }
}
