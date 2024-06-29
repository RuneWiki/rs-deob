import java.awt.Container;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class217 extends class84 {

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "I")
    private int field3446 = 0;

    @OriginalMember(owner = "client!gl", name = "V", descriptor = "I")
    private int field3451 = 1;

    @OriginalMember(owner = "client!gl", name = "U", descriptor = "I")
    private int field3450 = 0;

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "Z")
    public static boolean field3444 = false;

    @OriginalMember(owner = "client!gl", name = "R", descriptor = "[I")
    public static int[] field3447 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!gl", name = "ab", descriptor = "I")
    public static int field3456 = 0;

    @OriginalMember(owner = "client!gl", name = "db", descriptor = "[S")
    public static short[] field3459 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!gl", name = "S", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!gl", name = "T", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!gl", name = "W", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!gl", name = "X", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!gl", name = "Y", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!gl", name = "Z", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!gl", name = "cb", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!gl", name = "eb", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!gl", name = "bb", descriptor = "[I")
    public static int[] field3457;

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "[Lqi;")
    public static class131[] field3442;

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "[Lak;")
    public static class140[] field3443;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(Z)V")
    public final void method481(boolean arg0) {
        class239.method1677((byte) 50);
        if (arg0) {
            this.field3450 = 112;
        }
        ++field3452;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIZBIIZ)V")
    public static final void method1560(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        ++field3458;
        if (arg0 == 3) {
            method1560(class2.field8, arg1, true, (byte) 103, -1, -1, true);
        } else {
            Container var7;
            if (class175.field2847 != null) {
                var7 = class175.field2847;
            } else if (class85.field1240 == null) {
                var7 = class138.field2241.field63;
            } else {
                var7 = class85.field1240;
            }
            class80.field1168 = var7.getSize().width;
            class164.field2670 = var7.getSize().height;
            if (class85.field1240 == var7) {
                Insets var8 = class85.field1240.getInsets();
                class80.field1168 -= var8.right + var8.left;
                class164.field2670 -= var8.top + var8.bottom;
            }
            if (~arg0 <= -3) {
                class61.field853 = 0;
                class154.field2543 = class164.field2670;
                class23.field265 = class80.field1168;
                class178.field2886 = 0;
            } else {
                class178.field2886 = 0;
                class61.field853 = (class80.field1168 + -765) / 2;
                class23.field265 = 765;
                class154.field2543 = 503;
            }
            if (!arg2) {
                class10.field89.setSize(class23.field265, class154.field2543);
                if (class85.field1240 == var7) {
                    Insets var9 = class85.field1240.getInsets();
                    class10.field89.setLocation(class61.field853 + var9.left, var9.top - -class178.field2886);
                } else {
                    class10.field89.setLocation(class61.field853, class178.field2886);
                }
            } else {
                class17.method118(class10.field89, 118);
                class201.method1474(7558, class10.field89);
                if (class148.field2417 != null) {
                    class148.field2417.method842(class10.field89, (byte) -125);
                }
                class18.field202.method855(-32586);
                class146.method1048(class10.field89, -65);
                class121.method888(class10.field89, false);
                if (class148.field2417 != null) {
                    class148.field2417.method840(7, class10.field89);
                }
            }
            if (~arg0 < -1) {
                method1560(0, arg1, true, (byte) 85, -1, -1, true);
            } else {
                if (arg3 <= 51) {
                    method1560(-123, -54, false, (byte) -64, -121, 53, false);
                }
                class229.field3678 = !class77.method566((byte) -87);
                if (class211.field3384 != -1) {
                    class152.method1115(true, -97);
                }
                if (class180.field2901 != null && (class38.field533 == 30 || class38.field533 == 25)) {
                    class59.method423(98);
                }
                for (int var10 = 0; var10 < 100; ++var10) {
                    class190.field3070[var10] = true;
                }
                class208.field3341 = true;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1561(int arg0, String arg1) {
        int var2 = arg1.length();
        ++field3448;
        char[] var3 = new char[var2];
        if (arg0 != -22880) {
            field3444 = true;
        }
        byte var4 = 2;
        for (int var5 = 0; var2 > var5; ++var5) {
            char var6 = arg1.charAt(var5);
            if (~var4 == -1) {
                var6 = Character.toLowerCase(var6);
            } else if (~var4 == -3 || Character.isUpperCase(var6)) {
                var6 = class239.method1676(402, var6);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 != '.' && var6 != '?' && ~var6 != -34) {
                if (Character.isSpaceChar(var6)) {
                    if (var4 != 2) {
                        var4 = 1;
                    }
                } else {
                    var4 = 1;
                }
            } else {
                var4 = 2;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIILwd;)V")
    public static final void method1562(int arg0, int arg1, int arg2, int arg3, int arg4, class23 arg5) {
        ++field3455;
        if (~arg5.field249 != 0 || arg5.field250 != null) {
            int var6 = class212.field3402 * arg5.field258 >> 8;
            int var7 = 0;
            if (arg4 <= arg5.field247) {
                if (arg5.field248 > arg4) {
                    var7 += -arg4 + arg5.field248;
                }
            } else {
                var7 += arg4 - arg5.field247;
            }
            if (~arg2 >= ~arg5.field266) {
                if (arg2 < arg5.field252) {
                    var7 += -arg2 + arg5.field252;
                }
            } else {
                var7 += -arg5.field266 + arg2;
            }
            if (arg5.field268 != 0 && var7 + -64 <= arg5.field268 && ~class212.field3402 != -1 && arg5.field269 == arg3) {
                var7 -= 64;
                if (arg0 < ~var7) {
                    var7 = 0;
                }
                int var8 = (-var7 + arg5.field268) * var6 / arg5.field268;
                if (arg5.field251 != null) {
                    arg5.field251.method708(var8);
                } else if (~arg5.field249 <= -1) {
                    class74 var9 = class74.method540(class257.field4235, arg5.field249, 0);
                    if (var9 != null) {
                        class15 var10 = var9.method539().method109(class119.field1723);
                        class89 var11 = class89.method678(var10, 100, var8);
                        var11.method704(-1);
                        class73.field1057.method793(var11);
                        arg5.field251 = var11;
                    }
                }
                if (arg5.field261 != null) {
                    arg5.field261.method708(var8);
                    if (!arg5.field261.method1919(arg0 ^ -5)) {
                        arg5.field261 = null;
                        return;
                    }
                } else {
                    if (arg5.field250 == null || ~(arg5.field256 -= arg1) < -1) {
                        return;
                    }
                    int var12 = (int) (Math.random() * (double) arg5.field250.length);
                    class74 var13 = class74.method540(class257.field4235, arg5.field250[var12], 0);
                    if (var13 == null) {
                        return;
                    }
                    class15 var14 = var13.method539().method109(class119.field1723);
                    class89 var15 = class89.method678(var14, 100, var8);
                    var15.method704(0);
                    class73.field1057.method793(var15);
                    arg5.field261 = var15;
                    arg5.field256 = (int) ((double) (-arg5.field275 + arg5.field271) * Math.random()) + arg5.field275;
                }
            } else {
                if (arg5.field251 != null) {
                    class73.field1057.method795(arg5.field251);
                    arg5.field251 = null;
                }
                if (arg5.field261 != null) {
                    class73.field1057.method795(arg5.field261);
                    arg5.field261 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZC)Z")
    public static final boolean method1563(boolean arg0, char arg1) {
        if (arg0) {
            field3443 = null;
        }
        ++field3449;
        return arg1 >= '0' && ~arg1 >= -58;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(Z)V")
    public static void method1564(boolean arg0) {
        field3457 = null;
        if (arg0) {
            method1564(true);
        }
        field3447 = null;
        field3443 = null;
        field3459 = null;
        field3442 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        if (arg0 >= -125) {
            method1563(true, (char) 65517);
        }
        int[] var3 = super.field1228.method1627(-1, arg1);
        if (super.field1228.field3651) {
            int var4 = class26.field301[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; var6 < class20.field221; ++var6) {
                int var7 = class184.field2967[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (this.field3446 == 0) {
                    var9 = (-var4 + var7) * this.field3451;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field3451 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (this.field3450 == 0) {
                    var12 = class239.field3823[(var12 & 4095) >> 4] + 4096 >> 1;
                } else if (this.field3450 == 2) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        ++field3454;
        return var3;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
    public class217() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)I")
    public static final int method1565(byte arg0) {
        ++field3445;
        try {
            if (~class182.field2939 == -1) {
                if (~class91.field1351 < ~(class197.method1454((byte) -104) - 5000L)) {
                    return 0;
                }
                class160.field2622 = class138.field2241.method47(class205.field3287, arg0 + 22, class143.field2298);
                class277.field4438 = class197.method1454((byte) -104);
                class182.field2939 = 1;
            }
            if (~class197.method1454((byte) -104) < ~(class277.field4438 + 30000L)) {
                return class270.method1874(1000, 0);
            } else {
                if (arg0 != 101) {
                    method1564(false);
                }
                if (~class182.field2939 == -2) {
                    if (~class160.field2622.field4450 == -3) {
                        return class270.method1874(1001, arg0 ^ 101);
                    }
                    if (~class160.field2622.field4450 != -2) {
                        return -1;
                    }
                    class180.field2901 = new class92((Socket) class160.field2622.field4449, class138.field2241);
                    class220.field3532.field2511 = 0;
                    class160.field2622 = null;
                    int var1 = 0;
                    if (class244.field3964) {
                        var1 = class19.field210;
                    }
                    class220.field3532.method1074(23, arg0 ^ 20);
                    class220.field3532.method1119(var1, (byte) -118);
                    class180.field2901.method726(0, class220.field3532.field2511, 29023, class220.field3532.field2523);
                    if (class240.field3830 != null) {
                        class240.field3830.method1600((byte) 117);
                    }
                    if (class223.field3572 != null) {
                        class223.field3572.method1600((byte) 100);
                    }
                    int var2 = class180.field2901.method719(true);
                    if (class240.field3830 != null) {
                        class240.field3830.method1600((byte) 97);
                    }
                    if (class223.field3572 != null) {
                        class223.field3572.method1600((byte) 120);
                    }
                    if (var2 != 0) {
                        return class270.method1874(var2, 0);
                    }
                    class182.field2939 = 2;
                }
                if (class182.field2939 == 2) {
                    if (class180.field2901.method727(arg0 ^ 100) < 2) {
                        return -1;
                    }
                    class52.field766 = class180.field2901.method719(true);
                    class52.field766 <<= 8;
                    class52.field766 += class180.field2901.method719(true);
                    class183.field2944 = new byte[class52.field766];
                    class182.field2939 = 3;
                    class216.field3424 = 0;
                }
                if (~class182.field2939 == -4) {
                    int var3 = class180.field2901.method727(arg0 + -100);
                    if (~var3 > -2) {
                        return -1;
                    } else {
                        if (class52.field766 - class216.field3424 < var3) {
                            var3 = -class216.field3424 + class52.field766;
                        }
                        class180.field2901.method724(class183.field2944, 0, class216.field3424, var3);
                        class216.field3424 += var3;
                        if (class52.field766 > class216.field3424) {
                            return -1;
                        } else if (!class196.method1453(arg0 + -106, class183.field2944)) {
                            return class270.method1874(1002, arg0 ^ 101);
                        } else {
                            int var4 = 0;
                            class169.field2725 = new class223[class290.field4599];
                            for (int var5 = class38.field541; ~class78.field1135 <= ~var5; ++var5) {
                                class223 var6 = class223.method1596(-23578, var5);
                                if (var6 != null) {
                                    class169.field2725[var4++] = var6;
                                }
                            }
                            class180.field2901.method728((byte) 126);
                            class182.field2939 = 0;
                            class183.field2944 = null;
                            class156.field2562 = 0;
                            class180.field2901 = null;
                            class91.field1351 = class197.method1454((byte) -104);
                            return 0;
                        }
                    }
                } else {
                    return -1;
                }
            }
        } catch (IOException var7) {
            return class270.method1874(1003, 0);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        if (arg1 > 87) {
            ++field3460;
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (~arg2 == -4) {
                        this.field3451 = arg0.method1111(255);
                    }
                } else {
                    this.field3450 = arg0.method1111(255);
                }
            } else {
                this.field3446 = arg0.method1111(255);
            }
        }
    }
}
