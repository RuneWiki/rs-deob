import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class182 {

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lvj;")
    public static class115 field2860 = new class115();

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field2867 = 0;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field2866 = -1;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field2863 = 500;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "[I")
    public static int[] field2864;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;ILf;)Ljava/lang/String;")
    public static final String method1234(String arg0, int arg1, class36 arg2) {
        int var3 = -25 / ((arg1 + 48) / 45);
        if (arg0.indexOf("%") != -1) {
            label52: while (true) {
                int var4 = arg0.indexOf("%1");
                if (var4 == -1) {
                    while (true) {
                        int var5 = arg0.indexOf("%2");
                        if (var5 == -1) {
                            while (true) {
                                int var6 = arg0.indexOf("%3");
                                if (var6 == -1) {
                                    while (true) {
                                        int var7 = arg0.indexOf("%4");
                                        if (var7 == -1) {
                                            while (true) {
                                                int var8 = arg0.indexOf("%5");
                                                if (var8 == -1) {
                                                    while (true) {
                                                        int var9 = arg0.indexOf("%dns");
                                                        if (var9 == -1) {
                                                            break label52;
                                                        }
                                                        String var10 = "";
                                                        if (class98.field1619 != null) {
                                                            if (class98.field1619.field2594 == null) {
                                                                var10 = class203.method1394(-1608752296, class98.field1619.field2592);
                                                            } else {
                                                                var10 = (String) class98.field1619.field2594;
                                                            }
                                                        }
                                                        arg0 = arg0.substring(0, var9) + var10 + arg0.substring(var9 + 4);
                                                    }
                                                }
                                                arg0 = arg0.substring(0, var8) + class271.method1837(class127.method902((byte) -52, 4, arg2), -94) + arg0.substring(var8 + 2);
                                            }
                                        }
                                        arg0 = arg0.substring(0, var7) + class271.method1837(class127.method902((byte) -52, 3, arg2), -97) + arg0.substring(var7 + 2);
                                    }
                                }
                                arg0 = arg0.substring(0, var6) + class271.method1837(class127.method902((byte) -52, 2, arg2), -121) + arg0.substring(var6 + 2);
                            }
                        }
                        arg0 = arg0.substring(0, var5) + class271.method1837(class127.method902((byte) -52, 1, arg2), -82) + arg0.substring(var5 + 2);
                    }
                }
                arg0 = arg0.substring(0, var4) + class271.method1837(class127.method902((byte) -52, 0, arg2), -90) + arg0.substring(var4 + 2);
            }
        }
        field2859++;
        return arg0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static final void method1235(int arg0) {
        field2861++;
        int var1 = class73.field1192 * 128 + 64;
        int var2 = class1.field29 * 128 + 64;
        int var3 = class225.method1583(var1, var2, class250.field3980, 0) - field2865;
        if (arg0 != 1) {
            method1236(86);
        }
        if (class256.field4071 < 100) {
            if (class17.field301 < var3) {
                class17.field301 += (var3 - class17.field301) * class256.field4071 / 1000 + class213.field3476;
                if (class17.field301 > var3) {
                    class17.field301 = var3;
                }
            }
            if (class99.field1625 < var1) {
                class99.field1625 += class213.field3476 + ((var1 - class99.field1625) * class256.field4071 / 1000);
                if (var1 < class99.field1625) {
                    class99.field1625 = var1;
                }
            }
            if (class99.field1625 > var1) {
                class99.field1625 -= (class99.field1625 - var1) * class256.field4071 / 1000 + class213.field3476;
                if (class99.field1625 < var1) {
                    class99.field1625 = var1;
                }
            }
            if (var2 > class54.field925) {
                class54.field925 += (var2 - class54.field925) * class256.field4071 / 1000 + class213.field3476;
                if (var2 < class54.field925) {
                    class54.field925 = var2;
                }
            }
            if (var2 < class54.field925) {
                class54.field925 -= (class54.field925 - var2) * class256.field4071 / 1000 + class213.field3476;
                if (var2 > class54.field925) {
                    class54.field925 = var2;
                }
            }
            if (var3 < class17.field301) {
                class17.field301 -= class213.field3476 + ((class17.field301 - var3) * class256.field4071 / 1000);
                if (var3 > class17.field301) {
                    class17.field301 = var3;
                }
            }
        } else {
            class99.field1625 = class73.field1192 * 128 + 64;
            class54.field925 = class1.field29 * 128 + 64;
            class17.field301 = class225.method1583(class99.field1625, class54.field925, class250.field3980, 0) - field2865;
        }
        int var4 = class97.field1590 * 128 + 64;
        int var5 = class19.field327 * 128 + 64;
        int var6 = class225.method1583(var4, var5, class250.field3980, 0) - class145.field2331;
        int var7 = var5 - class54.field925;
        int var8 = var6 - class17.field301;
        int var9 = var4 - class99.field1625;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -325.949D) & 0x7FF;
        int var13 = var12 - class202.field3242;
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class202.field3242 += class213.field3486 * var13 / 1000 + class101.field1661;
            class202.field3242 &= 0x7FF;
        }
        if (var11 > class200.field3187) {
            class200.field3187 += class101.field1661 + ((var11 - class200.field3187) * class213.field3486 / 1000);
            if (class200.field3187 > var11) {
                class200.field3187 = var11;
            }
        }
        if (var13 < 0) {
            class202.field3242 -= class101.field1661 + (-var13 * class213.field3486 / 1000);
            class202.field3242 &= 0x7FF;
        }
        if (var11 < class200.field3187) {
            class200.field3187 -= (class200.field3187 - var11) * class213.field3486 / 1000 + class101.field1661;
            if (var11 > class200.field3187) {
                class200.field3187 = var11;
            }
        }
        int var14 = var12 - class202.field3242;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class202.field3242 = var12;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public static void method1236(int arg0) {
        field2860 = null;
        if (arg0 == 0) {
            field2864 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method1237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field2862++;
        int var8 = arg6;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg5 - arg1;
        int var12 = arg6 - arg1;
        int var13 = arg5 * arg5;
        int var14 = arg6 * arg6;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = 13 / ((60 - arg7) / 55);
        int var19 = var15 << 1;
        int var20 = var16 << 1;
        int var21 = var13 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var22) * var15 + var20;
        int var24 = var16 - ((var22 - 1) * var19);
        int var25 = var13 << 2;
        int var26 = var14 << 2;
        int var27 = var15 << 2;
        int var28 = var16 << 2;
        int var29 = arg6 << 1;
        int var30 = var14 - ((var29 - 1) * var21);
        int var31 = var17 * 3;
        int var32 = (1 - var29) * var13 + var17;
        int var33 = (var29 - 3) * var21;
        int var34 = var26;
        int var35 = (arg6 - 1) * var25;
        int var36 = (var22 - 3) * var19;
        int var37 = var20 * 3;
        int var38 = var28;
        int var39 = (var12 - 1) * var27;
        int[] var40 = class29.field452[arg3];
        class56.method420(var40, arg2, -7, arg4 - arg5, -var11 + arg4);
        class56.method420(var40, arg0, -7, arg4 - var11, arg4 + var11);
        class56.method420(var40, arg2, -7, arg4 + var11, arg4 + arg5);
        while (var8 > 0) {
            if (var32 < 0) {
                while (var32 < 0) {
                    var9++;
                    var32 += var31;
                    var31 += var26;
                    var30 += var34;
                    var34 += var26;
                }
            }
            boolean var41 = var12 >= var8;
            if (var41) {
                if (var23 < 0) {
                    while (var23 < 0) {
                        var23 += var37;
                        var37 += var28;
                        var10++;
                        var24 += var38;
                        var38 += var28;
                    }
                }
                if (var24 < 0) {
                    var10++;
                    var24 += var38;
                    var38 += var28;
                    var23 += var37;
                    var37 += var28;
                }
                var24 += -var36;
                var23 += -var39;
                var36 -= var27;
                var39 -= var27;
            }
            var8--;
            if (var30 < 0) {
                var9++;
                var32 += var31;
                var31 += var26;
                var30 += var34;
                var34 += var26;
            }
            var30 += -var33;
            int var42 = arg3 - var8;
            var32 += -var35;
            var33 -= var25;
            int var43 = arg4 + var9;
            int var44 = arg3 + var8;
            var35 -= var25;
            int var45 = arg4 - var9;
            if (var41) {
                int var46 = arg4 + var10;
                int var47 = arg4 - var10;
                class56.method420(class29.field452[var42], arg2, -7, var45, var47);
                class56.method420(class29.field452[var42], arg0, -7, var47, var46);
                class56.method420(class29.field452[var42], arg2, -7, var46, var43);
                class56.method420(class29.field452[var44], arg2, -7, var45, var47);
                class56.method420(class29.field452[var44], arg0, -7, var47, var46);
                class56.method420(class29.field452[var44], arg2, -7, var46, var43);
            } else {
                class56.method420(class29.field452[var42], arg2, -7, var45, var43);
                class56.method420(class29.field452[var44], arg2, -7, var45, var43);
            }
        }
    }
}
