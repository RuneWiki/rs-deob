import java.io.IOException;
import java.lang.reflect.Field;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class44 {

    @OriginalMember(owner = "client!sca", name = "h", descriptor = "I")
    public int field539 = 0;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "I")
    public static int field532 = -1;

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "Lqfa;")
    public static class98 field534 = new class98(119, -2);

    @OriginalMember(owner = "client!sca", name = "j", descriptor = "Lgda;")
    public static class53 field541 = new class53(54, -1);

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!sca", name = "e", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!sca", name = "g", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!sca", name = "i", descriptor = "I")
    public static int field540;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sca", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field542;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sca", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field543;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method298(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(B)V", line = 4)
    public static void method292(byte arg0) {
        field534 = null;
        field541 = null;
        if (arg0 >= -47) {
            method296(-45, 43, (byte) 118);
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(ILee;Z)V", line = 20)
    private final void method293(int arg0, class675 arg1, boolean arg2) {
        if (!arg2) {
            method296(118, 36, (byte) -70);
        }
        if (arg0 == 5) {
            this.field539 = arg1.method3757((byte) -65);
        }
        field533++;
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(B)V", line = 37)
    public static final void method294(byte arg0) {
        field535++;
        if (class215.field2831 == 0 || class215.field2831 == 5) {
            return;
        }
        try {
            short var1;
            if (class169.field2311 == 0) {
                var1 = 250;
            } else {
                var1 = 2000;
            }
            if (++class261.field3766 > var1) {
                if (class333.field4663 != null) {
                    class333.field4663.method2844(Integer.MIN_VALUE);
                    class333.field4663 = null;
                }
                if (class169.field2311 >= 3) {
                    class215.field2831 = 0;
                    class496.method2962(-5, false);
                    return;
                }
                if (class549.field7670 == 2) {
                    class584.field8222.method4163(-57);
                } else {
                    class343.field4784.method4163(-110);
                }
                class215.field2831 = 1;
                class261.field3766 = 0;
                class169.field2311++;
            }
            if (class215.field2831 == 1) {
                if (class549.field7670 == 2) {
                    class43.field531 = class584.field8222.method4160(class202.field2644, (byte) -112);
                } else {
                    class43.field531 = class343.field4784.method4160(class202.field2644, (byte) -89);
                }
                class215.field2831 = 2;
            }
            if (class215.field2831 == 2) {
                if (class43.field531.field3310 == 2) {
                    throw new IOException();
                }
                if (class43.field531.field3310 != 1) {
                    return;
                }
                class333.field4663 = class285.method1861(7500, (Socket) class43.field531.field3311, 93);
                class43.field531 = null;
                class20.method122(0);
                class519 var2 = class648.method3576(-107);
                var2.field7384.method3694(class95.field1114.field6501, -1528071456);
                class151.method1027(var2, -7);
                class390.method2455((byte) -31);
                class215.field2831 = 3;
            }
            if (class215.field2831 == 3) {
                if (!class333.field4663.method2846((byte) 53, 1)) {
                    return;
                }
                class333.field4663.method2847(-1, class89.field1072.field9154, 0, 1);
                int var3 = class89.field1072.field9154[0] & 0xFF;
                if (var3 != 0) {
                    class215.field2831 = 0;
                    class496.method2962(var3, false);
                    class333.field4663.method2844(Integer.MIN_VALUE);
                    class333.field4663 = null;
                    class413.method2540(false);
                    return;
                }
                class89.field1072.field9146 = 0;
                class675 var4 = new class675(518);
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                var4.method3694(10, -1528071456);
                var4.method3733(-49, var5[0]);
                var4.method3733(-49, var5[1]);
                var4.method3733(-49, var5[2]);
                var4.method3733(-49, var5[3]);
                var4.method3692((byte) -103, 0L);
                var4.method3747((byte) 27, class449.field6370);
                var4.method3692((byte) -103, class290.field4097);
                var4.method3692((byte) -103, class106.field1273);
                var4.method3705(class614.field8591, 22832, class465.field6586);
                class20.method122(0);
                class519 var6 = class648.method3576(-104);
                class682 var7 = var6.field7384;
                if (class549.field7670 == 2) {
                    if (class222.field2897 == 13) {
                        var7.method3694(class95.field1119.field6501, -1528071456);
                    } else {
                        var7.method3694(class95.field1117.field6501, -1528071456);
                    }
                    var7.method3745(-121, 0);
                    int var10 = var7.field9146;
                    var7.method3733(-49, 633);
                    var7.method3748(true, var4.field9154, var4.field9146, 0);
                    int var11 = var7.field9146;
                    var7.method3747((byte) 27, class209.field2755);
                    var7.method3694(class343.field4791, -1528071456);
                    var7.method3694(class605.method3408((byte) 54), -1528071456);
                    var7.method3745(-116, class446.field6323);
                    var7.method3745(-120, class172.field2348);
                    var7.method3694(class557.field7812.field6553.method3560(false), -1528071456);
                    class60.method512(var7, (byte) 104);
                    var7.method3747((byte) 27, class614.field8594);
                    var7.method3733(-49, class638.field8771);
                    class675 var12 = class557.field7812.method2752((byte) 86);
                    var7.method3694(var12.field9146, -1528071456);
                    var7.method3748(true, var12.field9154, var12.field9146, 0);
                    class673.field9128 = true;
                    class675 var13 = new class675(class470.field6666.method2475((byte) -10));
                    class470.field6666.method2474(false, var13);
                    var7.method3748(true, var13.field9154, var13.field9154.length, 0);
                    var7.method3745(-117, class270.field3865);
                    var7.method3692((byte) -103, class3.field32);
                    var7.method3694(class246.field3287 == null ? 0 : 1, -1528071456);
                    if (class246.field3287 != null) {
                        var7.method3747((byte) 27, class246.field3287);
                    }
                    var7.method3694(class29.method167((byte) -75, "jagtheora") ? 1 : 0, -1528071456);
                    class601.method3370(-3203, var7);
                    var7.method3695(var7.field9146, var5, 114, var11);
                    var7.method3741(var7.field9146 - var10, (byte) -87);
                } else {
                    var7.method3694(class95.field1120.field6501, -1528071456);
                    var7.method3745(-111, 0);
                    int var8 = var7.field9146;
                    var7.method3733(-49, 633);
                    var7.method3748(true, var4.field9154, var4.field9146, 0);
                    int var9 = var7.field9146;
                    var7.method3747((byte) 27, class209.field2755);
                    var7.method3694(class633.field8733.field4515, -1528071456);
                    var7.method3694(class549.field7669, -1528071456);
                    class60.method512(var7, (byte) 105);
                    var7.method3747((byte) 27, class614.field8594);
                    var7.method3733(-49, class638.field8771);
                    class601.method3370(-3203, var7);
                    var7.method3695(var7.field9146, var5, 100, var9);
                    var7.method3741(var7.field9146 - var8, (byte) -87);
                }
                class151.method1027(var6, -72);
                class390.method2455((byte) 125);
                class427.field5994 = new class724(var5);
                for (int var14 = 0; var14 < 4; var14++) {
                    var5[var14] += 50;
                }
                class89.field1072.method3828(var5, -16797);
                class215.field2831 = 4;
            }
            if (class215.field2831 == 4) {
                if (!class333.field4663.method2846((byte) 53, 1)) {
                    return;
                }
                class333.field4663.method2847(-1, class89.field1072.field9154, 0, 1);
                int var15 = class89.field1072.field9154[0] & 0xFF;
                if (var15 == 21) {
                    class215.field2831 = 7;
                } else if (var15 == 29) {
                    class215.field2831 = 13;
                } else if (var15 == 1) {
                    class215.field2831 = 5;
                    class496.method2962(var15, false);
                    return;
                } else if (var15 == 2) {
                    class215.field2831 = 8;
                } else if (var15 == 15) {
                    class398.field5617 = -2;
                    class215.field2831 = 14;
                } else if (var15 == 23 && class169.field2311 < 3) {
                    class261.field3766 = 0;
                    class169.field2311++;
                    class215.field2831 = 1;
                    class333.field4663.method2844(Integer.MIN_VALUE);
                    class333.field4663 = null;
                    return;
                } else {
                    class215.field2831 = 0;
                    class496.method2962(var15, false);
                    class333.field4663.method2844(Integer.MIN_VALUE);
                    class333.field4663 = null;
                    class413.method2540(false);
                    return;
                }
            }
            if (class215.field2831 == 6) {
                class20.method122(0);
                class519 var16 = class648.method3576(-115);
                class682 var17 = var16.field7384;
                var17.method3826(class427.field5994, 12693);
                var17.method3824(-16073, class95.field1126.field6501);
                class151.method1027(var16, -29);
                class390.method2455((byte) -65);
                class215.field2831 = 4;
                return;
            }
            if (class215.field2831 == 7) {
                if (!class333.field4663.method2846((byte) 53, 1)) {
                    return;
                }
                class333.field4663.method2847(-1, class89.field1072.field9154, 0, 1);
                int var18 = class89.field1072.field9154[0] & 0xFF;
                class545.field7597 = (var18 + 3) * 60;
                class215.field2831 = 0;
                class496.method2962(21, false);
                class333.field4663.method2844(Integer.MIN_VALUE);
                class333.field4663 = null;
                class413.method2540(false);
                return;
            }
            if (class215.field2831 == 13) {
                if (!class333.field4663.method2846((byte) 53, 1)) {
                    return;
                }
                class333.field4663.method2847(-1, class89.field1072.field9154, 0, 1);
                class215.field2831 = 0;
                class253.field3705 = class89.field1072.field9154[0] & 0xFF;
                class496.method2962(29, false);
                class333.field4663.method2844(Integer.MIN_VALUE);
                class333.field4663 = null;
                class413.method2540(false);
                return;
            }
            if (class215.field2831 == 8) {
                if (!class333.field4663.method2846((byte) 53, 1)) {
                    return;
                }
                class333.field4663.method2847(-1, class89.field1072.field9154, 0, 1);
                class252.field3692 = class89.field1072.field9154[0] & 0xFF;
                class215.field2831 = 9;
                return;
            }
            if (class215.field2831 == 9) {
                class682 var19 = class89.field1072;
                if (class549.field7670 == 2) {
                    if (!class333.field4663.method2846((byte) 53, class252.field3692)) {
                        return;
                    }
                    class333.field4663.method2847(-1, var19.field9154, 0, class252.field3692);
                    var19.field9146 = 0;
                    class399.field5645 = var19.method3750((byte) 35);
                    class439.field6251 = var19.method3750((byte) 35);
                    class567.field8052 = var19.method3750((byte) 35) == 1;
                    class491.field6932 = var19.method3750((byte) 35) == 1;
                    class504.field7230 = var19.method3750((byte) 35) == 1;
                    class603.field8476 = var19.method3750((byte) 35) == 1;
                    class389.field5512 = var19.method3757((byte) -65);
                    class758.field10534 = var19.method3750((byte) 35) == 1;
                    class211.field2787 = var19.method3752(19);
                    class192.field2572 = var19.method3750((byte) 35) == 1;
                    class612.field8588.method551(8, class192.field2572);
                    class682.field9361.method3415(class192.field2572, 255);
                    class231.field3110.method2799(-100, class192.field2572);
                } else if (class333.field4663.method2846((byte) 53, class252.field3692)) {
                    class333.field4663.method2847(-1, var19.field9154, 0, class252.field3692);
                    var19.field9146 = 0;
                    class399.field5645 = var19.method3750((byte) 35);
                    class439.field6251 = var19.method3750((byte) 35);
                    class567.field8052 = var19.method3750((byte) 35) == 1;
                    class491.field6932 = var19.method3750((byte) 35) == 1;
                    class504.field7230 = var19.method3750((byte) 35) == 1;
                    class377.field5297 = var19.method3706((byte) 69);
                    class758.field10534 = class377.field5297 > 0;
                    class505.field7242 = var19.method3757((byte) -65);
                    class426.field5988 = var19.method3757((byte) -65);
                    class189.field2539 = var19.method3757((byte) -65);
                    class260.field3751 = var19.method3703(107);
                    class579.field8177 = class202.field2644.method2052(class260.field3751, (byte) 0);
                    class314.field4339 = var19.method3750((byte) 35);
                    class336.field4681 = var19.method3757((byte) -65);
                    class117.field1420 = var19.method3757((byte) -65);
                    class302.field4253 = var19.method3750((byte) 35) == 1;
                    class660.field9039.field3965 = class660.field9039.field3973 = class546.field7606 = var19.method3726(-63);
                    class312.field4328 = var19.method3750((byte) 35);
                    class736.field10257 = var19.method3703(125);
                    class103.field1231 = new class748();
                    class103.field1231.field10399 = var19.method3757((byte) -65);
                    if (class103.field1231.field10399 == 65535) {
                        class103.field1231.field10399 = -1;
                    }
                    class103.field1231.field10402 = var19.method3726(-94);
                    if (class408.field5781 != class277.field3922) {
                        class103.field1231.field10395 = class103.field1231.field10399 + 50000;
                        class103.field1231.field10389 = class103.field1231.field10399 + 40000;
                    }
                    if (class277.field3922 != class209.field2756 && (class584.field8222.method4161(62, class553.field7777) || class584.field8222.method4161(-100, class552.field7772))) {
                        class41.method276((byte) 71);
                    }
                } else {
                    return;
                }
                if ((!class567.field8052 || class504.field7230) && !class758.field10534) {
                    try {
                        class113.method797("unzap", 117, class213.field2800);
                    } catch (Throwable var24) {
                    }
                } else {
                    try {
                        class113.method797("zap", 87, class213.field2800);
                    } catch (Throwable var26) {
                        if (class755.field10504) {
                            try {
                                class213.field2800.getAppletContext().showDocument(new URL(class213.field2800.getCodeBase(), "blank.ws"), "tbi");
                            } catch (Exception var25) {
                            }
                        }
                    }
                }
                if (class408.field5781 == class277.field3922) {
                    try {
                        class113.method797("loggedin", 107, class213.field2800);
                    } catch (Throwable var23) {
                    }
                }
                if (class549.field7670 != 2) {
                    class215.field2831 = 0;
                    class496.method2962(2, false);
                    class354.method2285(-28577);
                    class60.method514(false, 7);
                    class294.field4138 = null;
                    return;
                }
                class215.field2831 = 11;
            }
            if (class215.field2831 == 11) {
                if (!class333.field4663.method2846((byte) 53, 3)) {
                    return;
                }
                class333.field4663.method2847(-1, class89.field1072.field9154, 0, 3);
                class215.field2831 = 12;
            }
            if (class215.field2831 == 12) {
                class682 var20 = class89.field1072;
                var20.field9146 = 0;
                if (var20.method3822((byte) 83)) {
                    if (!class333.field4663.method2846((byte) 53, 1)) {
                        return;
                    }
                    class333.field4663.method2847(-1, var20.field9154, 3, 1);
                }
                class294.field4138 = class70.method587(-4638)[var20.method3820((byte) -21)];
                class398.field5617 = var20.method3757((byte) -65);
                class215.field2831 = 10;
            }
            if (class215.field2831 == 10) {
                if (!class333.field4663.method2846((byte) 53, class398.field5617)) {
                    return;
                }
                class333.field4663.method2847(-1, class89.field1072.field9154, 0, class398.field5617);
                class89.field1072.field9146 = 0;
                class215.field2831 = 0;
                int var21 = class398.field5617;
                class496.method2962(2, false);
                class687.method3841(true);
                class570.method3278((byte) 51, class89.field1072);
                class186.field2513 = -1;
                if (class294.field4138 == class240.field3197) {
                    class155.method1040(26);
                } else {
                    class287.method1881(28123);
                }
                if (class89.field1072.field9146 != var21) {
                    throw new RuntimeException("lswp pos:" + class89.field1072.field9146 + " psize:" + var21);
                }
                class294.field4138 = null;
                return;
            }
            if (class215.field2831 == 14) {
                if (class398.field5617 == -2) {
                    if (!class333.field4663.method2846((byte) 53, 2)) {
                        return;
                    }
                    class333.field4663.method2847(-1, class89.field1072.field9154, 0, 2);
                    class89.field1072.field9146 = 0;
                    class398.field5617 = class89.field1072.method3757((byte) -65);
                }
                if (!class333.field4663.method2846((byte) 53, class398.field5617)) {
                    return;
                }
                class333.field4663.method2847(-1, class89.field1072.field9154, 0, class398.field5617);
                class89.field1072.field9146 = 0;
                class215.field2831 = 0;
                int var22 = class398.field5617;
                class496.method2962(15, false);
                class592.method3349(-79);
                class570.method3278((byte) 17, class89.field1072);
                if (class89.field1072.field9146 != var22) {
                    throw new RuntimeException("lswpr pos:" + class89.field1072.field9146 + " psize:" + var22);
                }
                class294.field4138 = null;
                return;
            }
        } catch (IOException var27) {
            if (class333.field4663 != null) {
                class333.field4663.method2844(Integer.MIN_VALUE);
                class333.field4663 = null;
            }
            if (class169.field2311 >= 3) {
                class215.field2831 = 0;
                class496.method2962(-4, false);
                class413.method2540(false);
            } else {
                if (class549.field7670 == 2) {
                    class584.field8222.method4163(-53);
                } else {
                    class343.field4784.method4163(104);
                }
                class215.field2831 = 1;
                class169.field2311++;
                class261.field3766 = 0;
            }
        }
        if (arg0 < 114) {
            field541 = null;
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lee;B)V", line = 619)
    public final void method295(class675 arg0, byte arg1) {
        field536++;
        while (true) {
            int var3 = arg0.method3750((byte) 35);
            if (var3 == 0) {
                if (arg1 > -44) {
                    this.method293(-31, null, false);
                    return;
                } else {
                    return;
                }
            }
            this.method293(var3, arg0, true);
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIB)V", line = 644)
    public static final void method296(int arg0, int arg1, byte arg2) {
        field538++;
        if (arg2 <= 23) {
            method296(46, 64, (byte) 125);
        }
        class260.field3746 = arg1;
        class586.field8252 = arg0;
        if (class221.field2883 == 0) {
            class712.field9900 = class586.field8252 + (class335.field4673 * 2);
            class414.field5838 = class378.field5372 * 2 + class260.field3746;
        } else if (class221.field2883 == 1) {
            class224.field3008 = class260.field3746 / class338.field4700 + class499.field7162 + 2;
            class296.field4168 = class586.field8252 / class47.field555 + class587.field8277 + 2;
            class712.field9900 = class47.field555 * class296.field4168;
            class414.field5838 = class338.field4700 * class224.field3008;
            class378.field5372 = class414.field5838 - class260.field3746 >> 1;
            class335.field4673 = class712.field9900 - class586.field8252 >> 1;
        } else if (class221.field2883 == 2) {
            class414.field5838 = class260.field3746;
            class712.field9900 = class586.field8252;
            return;
        }
    }

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "(B)I", line = 690)
    public static final int method297(byte arg0) {
        field537++;
        int var1 = 0;
        Field[] var2 = (field542 == null ? (field542 = method298("ch")) : field542).getDeclaredFields();
        Field[] var3 = var2;
        int var4 = 0;
        if (arg0 != 100) {
            return -91;
        }
        while (var3.length > var4) {
            Field var5 = var3[var4];
            if ((field543 == null ? (field543 = method298("db")) : field543).isAssignableFrom(var5.getType())) {
                var1++;
            }
            var4++;
        }
        return var1 + 1;
    }
}
