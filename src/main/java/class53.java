import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class53 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "Z")
    public static volatile boolean field971 = true;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "Li;")
    private static class88 field977 = class208.method1425(105, "Jun");

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "Li;")
    private static class88 field980 = class208.method1425(105, "Sep");

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "Li;")
    private static class88 field978 = class208.method1425(105, "Aug");

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "Li;")
    private static class88 field985 = class208.method1425(105, "Dec");

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "Li;")
    private static class88 field984 = class208.method1425(105, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "Li;")
    private static class88 field987 = class208.method1425(105, "May");

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "Li;")
    private static class88 field988 = class208.method1425(105, "Jan");

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "Li;")
    public static class88 field979 = class208.method1425(105, ")1");

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "Li;")
    private static class88 field989 = class208.method1425(105, "Oct");

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "[S")
    public static short[] field994 = new short[500];

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "Li;")
    public static class88 field993 = class208.method1425(105, "Fps:");

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "Z")
    public static boolean field997 = false;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "Li;")
    private static class88 field981 = class208.method1425(105, "Mar");

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "Li;")
    private static class88 field991 = class208.method1425(105, "Nov");

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "Li;")
    private static class88 field986 = class208.method1425(105, "This computers address has been blocked");

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "Li;")
    public static class88 field983 = field986;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "Lq;")
    public static class174 field967 = null;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "Li;")
    private static class88 field995 = class208.method1425(105, "Feb");

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "[I")
    public static int[] field999 = new int[1000];

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "Li;")
    private static class88 field996 = class208.method1425(105, "Jul");

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "Li;")
    public static class88 field998 = field984;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "Li;")
    private static class88 field970 = class208.method1425(105, "Apr");

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "[I")
    public static int[] field1001 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "[Li;")
    public static class88[] field992 = new class88[] { field988, field995, field981, field970, field987, field977, field996, field978, field980, field989, field991, field985 };

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "Lij;")
    public static class97 field990;

    @OriginalMember(owner = "client!eh", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class166.field3190 != null) {
            class114.field2070 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class237.field4425.length > var2) {
                var3 = class237.field4425[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class32.field524 >= 0 && var3 >= 0) {
                class114.field2061[class32.field524] = ~var3;
                class32.field524 = class32.field524 + 1 & 0x7F;
                if (class32.field524 == class148.field2803) {
                    class32.field524 = -1;
                }
            }
        }
        field1000++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!eh", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field982++;
        if (class166.field3190 == null) {
            return;
        }
        class114.field2070 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class237.field4425.length > var2) {
            var3 = class237.field4425[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class32.field524 >= 0 && var3 >= 0) {
            class114.field2061[class32.field524] = var3;
            class32.field524 = class32.field524 + 1 & 0x7F;
            if (class32.field524 == class148.field2803) {
                class32.field524 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class191.field3683 + 1 & 0x7F;
            if (class203.field3860 != var4) {
                class174.field3440[class191.field3683] = var3;
                class105.field1910[class191.field3683] = -1;
                class191.field3683 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!eh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field975++;
        if (class166.field3190 != null) {
            class32.field524 = -1;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILnb;BZII)V")
    public static final void method388(int arg0, class144 arg1, byte arg2, boolean arg3, int arg4, int arg5) {
        class11.field159 = arg5;
        if (arg2 > -38) {
            method391(-6, -128, -9, -47, -19, 12, 24);
        }
        class158.field3041 = arg1;
        class228.field4270 = arg4;
        field976++;
        class172.field3345 = 10000;
        class122.field2232 = 1;
        class242.field4482 = arg0;
        class17.field277 = arg3;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILq;)Z")
    public static final boolean method389(int arg0, class174 arg1) {
        field972++;
        if (arg1.field3441 == 205) {
            class105.field1912 = 250;
            return true;
        } else {
            if (arg0 <= 98) {
                method393(-54, -28, (byte) -54, -49, 77, 31, -50, 100, 59);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIILnc;IJ)Z")
    public static final boolean method390(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class145 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class112.method770(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!eh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field969++;
    }

    @OriginalMember(owner = "client!eh", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class166.field3190 != null) {
            int var2 = class66.method455(arg0, -26362);
            if (var2 >= 0) {
                int var3 = class191.field3683 + 1 & 0x7F;
                if (class203.field3860 != var3) {
                    class174.field3440[class191.field3683] = -1;
                    class105.field1910[class191.field3683] = var2;
                    class191.field3683 = var3;
                }
            }
        }
        field973++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class105.field1920 = 0;
        int var7 = -83 % ((arg5 - 56) / 61);
        for (int var8 = -1; var8 < class55.field1041 + class55.field1027; var8++) {
            class218 var24;
            if (var8 == -1) {
                var24 = class240.field4458;
            } else if (var8 >= class55.field1027) {
                var24 = class225.field4225[class25.field402[var8 - class55.field1027]];
            } else {
                var24 = class244.field4493[class174.field3430[var8]];
            }
            if (var24 != null && var24.method287(-1)) {
                if (var24 instanceof class191) {
                    class126 var25 = ((class191) var24).field3684;
                    if (var25.field2329 != null) {
                        var25 = var25.method864((byte) 117);
                    }
                    if (var25 == null) {
                        continue;
                    }
                }
                if (var8 >= class55.field1027) {
                    class126 var31 = ((class191) var24).field3684;
                    if (var31.field2329 != null) {
                        var31 = var31.method864((byte) 79);
                    }
                    if (var31.field2328 >= 0 && class130.field2430.length > var31.field2328) {
                        class150.method1029(arg6 >> 1, arg4 >> 1, arg3, -4013, var24.method1477(64) + 15, var24, arg2);
                        if (class25.field401 > -1) {
                            class130.field2430[var31.field2328].method1157(class25.field401 + arg0 - 12, class33.field541 + -30 + arg1);
                        }
                    }
                    class118[] var32 = class64.field1171;
                    for (int var33 = 0; var33 < var32.length; var33++) {
                        class118 var35 = var32[var33];
                        if (var35 != null && var35.field2141 == 1 && class25.field402[var8 - class55.field1027] == var35.field2148 && class117.field2115 % 20 < 10) {
                            class150.method1029(arg6 >> 1, arg4 >> 1, arg3, -4013, var24.method1477(64) + 15, var24, arg2);
                            if (class25.field401 > -1) {
                                class176.field3545[var35.field2139].method1157(arg0 + class25.field401 - 12, class33.field541 + arg1 - 28);
                            }
                        }
                    }
                } else {
                    int var26 = 30;
                    class44 var27 = (class44) var24;
                    if (var27.field756 != -1 || var27.field750 != -1) {
                        class150.method1029(arg6 >> 1, arg4 >> 1, arg3, -4013, var24.method1477(64) + 15, var24, arg2);
                        if (class25.field401 > -1) {
                            if (var27.field756 != -1) {
                                class238.field4427[var27.field756].method1157(class25.field401 + arg0 - 12, class33.field541 + arg1 + -var26);
                                var26 += 25;
                            }
                            if (var27.field750 != -1) {
                                class130.field2430[var27.field750].method1157(arg0 + class25.field401 - 12, arg1 - -class33.field541 + -var26);
                                var26 += 25;
                            }
                        }
                    }
                    if (var8 >= 0) {
                        class118[] var28 = class64.field1171;
                        for (int var29 = 0; var29 < var28.length; var29++) {
                            class118 var30 = var28[var29];
                            if (var30 != null && var30.field2141 == 10 && class174.field3430[var8] == var30.field2148) {
                                class150.method1029(arg6 >> 1, arg4 >> 1, arg3, -4013, var24.method1477(64) + 15, var24, arg2);
                                if (class25.field401 > -1) {
                                    class176.field3545[var30.field2139].method1157(class25.field401 + arg0 - 12, arg1 - (-class33.field541 + var26));
                                }
                            }
                        }
                    }
                }
                if (var24.field4073 != null && (class55.field1027 <= var8 || class67.field1206 == 0 || class67.field1206 == 3 || class67.field1206 == 1 && class135.method903((byte) -103, ((class44) var24).field766))) {
                    class150.method1029(arg6 >> 1, arg4 >> 1, arg3, -4013, var24.method1477(64), var24, arg2);
                    if (class25.field401 > -1 && class207.field3927 > class105.field1920) {
                        class207.field3933[class105.field1920] = class54.field1011.method158(var24.field4073) / 2;
                        class207.field3931[class105.field1920] = class54.field1011.field416;
                        class207.field3940[class105.field1920] = class25.field401;
                        class207.field3942[class105.field1920] = class33.field541;
                        class207.field3939[class105.field1920] = var24.field4085;
                        class207.field3934[class105.field1920] = var24.field4140;
                        class207.field3928[class105.field1920] = var24.field4114;
                        class207.field3935[class105.field1920] = var24.field4073;
                        class105.field1920++;
                    }
                }
                if (var24.field4120 > class117.field2115) {
                    class150.method1029(arg6 >> 1, arg4 >> 1, arg3, -4013, var24.method1477(64) + 15, var24, arg2);
                    if (class25.field401 > -1) {
                        class72.method478(arg0 + class25.field401 - 15, class33.field541 + -3 + arg1, var24.field4111, 5, 65280);
                        class72.method478(class25.field401 + var24.field4111 + arg0 - 15, class33.field541 + arg1 + -3, 30 - var24.field4111, 5, 16711680);
                    }
                }
                for (int var34 = 0; var34 < 4; var34++) {
                    if (class117.field2115 < var24.field4075[var34]) {
                        class150.method1029(arg6 >> 1, arg4 >> 1, arg3, -4013, var24.method1477(64) / 2, var24, arg2);
                        if (class25.field401 > -1) {
                            if (var34 == 1) {
                                class33.field541 -= 20;
                            }
                            if (var34 == 2) {
                                class33.field541 -= 10;
                                class25.field401 -= 15;
                            }
                            if (var34 == 3) {
                                class33.field541 -= 10;
                                class25.field401 += 15;
                            }
                            class145.field2720[var24.field4080[var34]].method1157(arg0 + class25.field401 - 12, arg1 + -12 + class33.field541);
                            class49.field917.method141(class170.method1214(var24.field4133[var34], 108), arg0 + class25.field401 - 1, class33.field541 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var9 = 0; var9 < class105.field1920; var9++) {
            int var10 = class207.field3940[var9];
            int var11 = class207.field3942[var9];
            int var12 = class207.field3933[var9];
            boolean var13 = true;
            int var14 = class207.field3931[var9];
            while (var13) {
                var13 = false;
                for (int var23 = 0; var23 < var9; var23++) {
                    if (class207.field3942[var23] - class207.field3931[var23] < var11 + 2 && var11 - var14 < class207.field3942[var23] + 2 && var10 - var12 < class207.field3940[var23] - -class207.field3933[var23] && class207.field3940[var23] - class207.field3933[var23] < var10 + var12 && var11 > class207.field3942[var23] - class207.field3931[var23]) {
                        var11 = class207.field3942[var23] - class207.field3931[var23];
                        var13 = true;
                    }
                }
            }
            class25.field401 = class207.field3940[var9];
            class33.field541 = class207.field3942[var9] = var11;
            class88 var15 = class207.field3935[var9];
            if (class137.field2550 == 0) {
                int var16 = 16776960;
                if (class207.field3939[var9] < 6) {
                    var16 = class200.field3814[class207.field3939[var9]];
                }
                if (class207.field3939[var9] == 6) {
                    var16 = class210.field3992 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class207.field3939[var9] == 7) {
                    var16 = class210.field3992 % 20 >= 10 ? 65535 : 255;
                }
                if (class207.field3939[var9] == 8) {
                    var16 = class210.field3992 % 20 < 10 ? 45056 : 8454016;
                }
                if (class207.field3939[var9] == 9) {
                    int var17 = 150 - class207.field3928[var9];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16384000 + 16776960 - var17 * 327680;
                    } else if (var17 < 150) {
                        var16 = (var17 - 100) * 5 + 65280;
                    }
                }
                if (class207.field3939[var9] == 10) {
                    int var18 = 150 - class207.field3928[var9];
                    if (var18 < 50) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - (var18 - 50) * 327680;
                    } else if (var18 < 150) {
                        var16 = var18 * 327680 + 255 + 500 - var18 * 5 - 32768000;
                    }
                }
                if (class207.field3939[var9] == 11) {
                    int var19 = 150 - class207.field3928[var9];
                    if (var19 < 50) {
                        var16 = 16777215 - var19 * 327685;
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 - (var19 - 100) * 327680;
                    }
                }
                if (class207.field3934[var9] == 0) {
                    class54.field1011.method141(var15, arg0 + class25.field401, class33.field541 + arg1, var16, 0);
                }
                if (class207.field3934[var9] == 1) {
                    class54.field1011.method144(var15, class25.field401 + arg0, class33.field541 + arg1, var16, 0, class210.field3992);
                }
                if (class207.field3934[var9] == 2) {
                    class54.field1011.method145(var15, class25.field401 + arg0, arg1 - -class33.field541, var16, 0, class210.field3992);
                }
                if (class207.field3934[var9] == 3) {
                    class54.field1011.method164(var15, class25.field401 + arg0, class33.field541 + arg1, var16, 0, class210.field3992, 150 - class207.field3928[var9]);
                }
                if (class207.field3934[var9] == 4) {
                    int var20 = (150 - class207.field3928[var9]) * (class54.field1011.method158(var15) + 100) / 150;
                    class72.method493(arg0 + class25.field401 - 50, arg1, arg0 + class25.field401 + 50, arg1 + arg4);
                    class54.field1011.method154(var15, arg0 + class25.field401 + 50 - var20, arg1 - -class33.field541, var16, 0);
                    class72.method480(arg0, arg1, arg0 + arg6, arg1 + arg4);
                }
                if (class207.field3934[var9] == 5) {
                    int var21 = 0;
                    int var22 = 150 - class207.field3928[var9];
                    if (var22 < 25) {
                        var21 = var22 - 25;
                    } else if (var22 > 125) {
                        var21 = var22 - 125;
                    }
                    class72.method493(arg0, arg1 + class33.field541 - class54.field1011.field416 - 1, arg0 + arg6, arg1 + class33.field541 + 5);
                    class54.field1011.method141(var15, class25.field401 + arg0, class33.field541 - -var21 + arg1, var16, 0);
                    class72.method480(arg0, arg1, arg0 + arg6, arg1 + arg4);
                }
            } else {
                class54.field1011.method141(var15, class25.field401 + arg0, class33.field541 + arg1, 16776960, 0);
            }
        }
        field974++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method392(int arg0) {
        field967 = null;
        field991 = null;
        field996 = null;
        field970 = null;
        field981 = null;
        field999 = null;
        field988 = null;
        field1001 = null;
        field977 = null;
        field992 = null;
        field979 = null;
        field978 = null;
        field998 = null;
        field989 = null;
        field986 = null;
        field993 = null;
        field987 = null;
        field990 = null;
        if (arg0 != -3976) {
            field983 = null;
        }
        field995 = null;
        field994 = null;
        field985 = null;
        field980 = null;
        field984 = null;
        field983 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIBIIIIII)V")
    public static final void method393(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field968++;
        if (class211.method1447(0, arg1)) {
            class179.field3566 = null;
            class165.method1133(class78.field1418[arg1], arg6, arg3, true, arg4, arg0, arg7, arg5, -1, arg8);
            if (arg2 != -39) {
                method393(-28, -82, (byte) -91, -11, -2, 68, -78, -25, -81);
            }
            if (class179.field3566 != null) {
                class165.method1133(class179.field3566, arg6, arg3, true, arg4, arg0, class94.field1757, class6.field77, -1412584499, arg8);
                class179.field3566 = null;
            }
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class225.field4230[var9] = true;
            }
        } else {
            class225.field4230[arg4] = true;
        }
    }
}
