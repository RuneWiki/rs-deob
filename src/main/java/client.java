import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class291 {

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2992 = 0;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field3001 = -1;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field3008;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Ljava/lang/Class;")
    public static Class field3007;

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1193(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 5)
    public final void method1169(int arg0) {
        field2989++;
        if (field2992 == 1000) {
            return;
        }
        class369.field5424++;
        if (class369.field5424 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class107.field1869 = var2.get(11) * 600 + (var2.get(12) * 10 + (var2.get(13) / 6));
            class215.field3321.setSeed((long) class107.field1869);
        }
        if (arg0 != 15290) {
            method1179();
        }
        if (class369.field5424 % 50 == 0) {
            class257.field3921 = class502.field7602;
            class320.field4809 = class51.field779;
            class502.field7602 = 0;
            class51.field779 = 0;
        }
        this.method1174(arg0 ^ 0x3BFA);
        if (class23.field305 != null) {
            class23.field305.method326(0);
        }
        class175.method1098((byte) 72);
        class308.field4662.method1651((byte) -116);
        class251.field3835.method1691((byte) 22);
        if (class158.field2484 != null) {
            int var3 = class158.field2484.method1874((byte) -15);
            class165.field2571 = var3;
        }
        if (class345.field5116 != null) {
            class345.field5116.method1956((int) class344.method2111((byte) -69));
        }
        class458.method2711(arg0 + 2630);
        class170.field2650 = 0;
        for (class494 var4 = class308.field4662.method1654((byte) 54); var4 != null && class170.field2650 < 128; var4 = class308.field4662.method1654((byte) -126)) {
            if (var4.method1073(-78) != 1) {
                char var5 = var4.method1067(-1);
                if (!class86.method608(true) || var5 != '`' && var5 != '§') {
                    class304.field4624[class170.field2650] = var4;
                    class170.field2650++;
                } else if (class110.method792(-21786)) {
                    class237.method1422(arg0 ^ 0x3BB8);
                } else {
                    class353.method2152((byte) -127);
                }
            }
        }
        for (class112 var6 = class251.field3835.method1684(-76); var6 != null; var6 = class251.field3835.method1684(-80)) {
            int var7 = var6.method805(-4);
            if (var7 == -1) {
                class137.field2269.method4(1, var6);
            } else if (class10.method56((byte) -93, var7)) {
                class91.field1638.method4(1, var6);
            }
            if (class91.field1638.method6(18328) > 10) {
                class91.field1638.method7(false);
            }
        }
        if (class110.method792(-21786)) {
            class159.method1016((byte) -78);
        }
        if (field2992 == 0) {
            this.method1185((byte) -81);
            class469.method2831(-17186);
        } else if (field2992 == 5) {
            this.method1185((byte) -89);
            class469.method2831(-17186);
        } else if (field2992 == 25 || field2992 == 28) {
            class143.method944(1);
        }
        if (field2992 == 10) {
            this.method1180((byte) -43);
            class275.method1672((byte) 43);
            class324.method2028(91);
            class310.method1857(127);
        } else if (field2992 == 30) {
            class457.method2705((byte) 122);
        } else if (field2992 == 40) {
            class310.method1857(104);
            if (class211.field3282 != -3 && class211.field3282 != 2 && class211.field3282 != 15) {
                class345.method2114(0);
            }
        }
        class195.method1218(arg0 - 15254, class345.field5116);
        class91.field1638.method7(false);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V", line = 150)
    public static final void method1170(int arg0, int arg1, int arg2, int arg3) {
        field3004++;
        String var4 = "tele " + arg3 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
        if (arg1 <= -5) {
            System.out.println(var4);
            class37.method206(var4, (byte) -73, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Z", line = 164)
    public static final boolean method1171(int arg0, int arg1, int arg2) {
        field2991++;
        if (arg0 > -105) {
            field2992 = -123;
        }
        return (arg1 & 0x800) != 0 && (arg2 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ltq;)Ltq;", line = 176)
    public static final class427 method1172(class427 arg0) {
        int var1 = method1176(arg0).method377(18881);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class413.method2435(160291920, arg0.field6253);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 197)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class487.method2922(1, "argument count");
            }
            class322.field4836 = Integer.parseInt(arg0[0]);
            class230.field3507 = class296.field4492;
            if (arg0[1].equals("live")) {
                class295.field4485 = class147.field2379;
            } else if (arg0[1].equals("rc")) {
                class295.field4485 = class286.field4343;
            } else if (arg0[1].equals("wip")) {
                class295.field4485 = class169.field2626;
            } else {
                class487.method2922(1, "modewhat");
            }
            class406.field5898 = class406.method2405(arg0[2], -10357);
            if (class406.field5898 == -1) {
                if (arg0[2].equals("english")) {
                    class406.field5898 = 0;
                } else if (arg0[2].equals("german")) {
                    class406.field5898 = 1;
                } else {
                    class487.method2922(1, "language");
                }
            }
            class264.field3986 = false;
            class112.field1907 = false;
            if (arg0[3].equals("game0")) {
                class298.field4512 = class329.field4936;
            } else if (arg0[3].equals("game1")) {
                class298.field4512 = class64.field1064;
            } else {
                class487.method2922(1, "game");
            }
            class63.field1047 = class298.field4512.field7456;
            class111.field1903 = 0;
            class90.field1620 = 0;
            class51.field778 = true;
            class137.field2256 = true;
            class138.field2274 = "";
            client var1 = new client();
            class6.field75 = var1;
            var1.method1778((byte) 119, 30, 581, false, class298.field4512.field7461, class295.field4485.method2452(25351) + 32, 1024, 768);
            class174.field2726.setLocation(40, 40);
        } catch (Exception var3) {
            class32.method177(var3, (byte) -59, null);
        }
        field2997++;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 265)
    private final void method1173(int arg0) {
        field2993++;
        if (arg0 != -21545) {
            this.method1174(-123);
        }
        if (class284.field4297.field7281 > class452.field6953) {
            if (class291.field4435 == class220.field3399) {
                class220.field3399 = class121.field2010;
            } else {
                class220.field3399 = class291.field4435;
            }
            class157.field2480 = (class284.field4297.field7281 - 1) * 50 * 5;
            if (class157.field2480 > 3000) {
                class157.field2480 = 3000;
            }
            if (class284.field4297.field7281 >= 2 && class284.field4297.field7284 == 6) {
                this.method1770((byte) 114, "js5connect_outofdate");
                field2992 = 1000;
                return;
            }
            if (class284.field4297.field7281 >= 4 && class284.field4297.field7284 == -1) {
                this.method1770((byte) -47, "js5crc");
                field2992 = 1000;
                return;
            }
            if (class284.field4297.field7281 >= 4 && (field2992 == 0 || field2992 == 5)) {
                if (class284.field4297.field7284 == 7 || class284.field4297.field7284 == 9) {
                    this.method1770((byte) 109, "js5connect_full");
                } else if (class284.field4297.field7284 > 0) {
                    this.method1770((byte) 42, "js5connect");
                } else {
                    this.method1770((byte) 105, "js5io");
                }
                field2992 = 1000;
                return;
            }
        }
        class452.field6953 = class284.field4297.field7281;
        if (class157.field2480 > 0) {
            class157.field2480--;
            return;
        }
        try {
            if (class269.field4068 == 0) {
                class280.field4257 = class7.field86.method1583(class376.field5480, class220.field3399, (byte) -96);
                class269.field4068++;
            }
            if (class269.field4068 == 1) {
                if (class280.field4257.field2802 == 2) {
                    this.method1182((byte) 118, 1000);
                    return;
                }
                if (class280.field4257.field2802 == 1) {
                    class269.field4068++;
                }
            }
            if (class269.field4068 == 2) {
                class406.field5899 = new class295((Socket) class280.field4257.field2803, class7.field86);
                class40 var2 = new class40(5);
                var2.method221(-1, class247.field3787.field3849);
                var2.method253(arg0 ^ 0x5467, 581);
                class406.field5899.method1787(var2.field536, 0, 4900, 5);
                class269.field4068++;
                class503.field7607 = class344.method2111((byte) -93);
            }
            if (class269.field4068 == 3) {
                if (field2992 == 0 || field2992 == 5 || class406.field5899.method1789(27683) > 0) {
                    int var3 = class406.field5899.method1792(0);
                    if (var3 != 0) {
                        this.method1182((byte) 75, var3);
                        return;
                    }
                    class269.field4068++;
                } else if (class344.method2111((byte) -26) - class503.field7607 > 30000L) {
                    this.method1182((byte) -89, 1001);
                    return;
                }
            }
            if (class269.field4068 == 4) {
                boolean var4 = field2992 == 5 || field2992 == 10 || field2992 == 28;
                class284.field4297.method2869(class406.field5899, false, !var4);
                class269.field4068 = 0;
                class406.field5899 = null;
                class280.field4257 = null;
            }
        } catch (IOException var5) {
            this.method1182((byte) -80, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 415)
    private final void method1174(int arg0) {
        if (arg0 != 64) {
            return;
        }
        field3006++;
        boolean var2 = class284.field4297.method2859((byte) -33);
        if (!var2) {
            this.method1173(-21545);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 436)
    public final void method1175(int arg0) {
        field2995++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class197.method1224(-1);
        class319.field4802 = new class276(class7.field86);
        class284.field4297 = new class476();
        if (class77.field1378 != class230.field3507) {
            class38.field517 = new byte[50][];
        }
        class463.field7116 = new class15(class7.field86);
        if (class77.field1378 == class230.field3507) {
            class167.field2592 = this.getCodeBase().getHost();
            class135.field2155 = 443;
            class377.field5507 = 43594;
        } else if (class115.method823(69, class230.field3507)) {
            class167.field2592 = this.getCodeBase().getHost();
            class377.field5507 = class322.field4836 + 40000;
            class135.field2155 = class322.field4836 + 50000;
        } else if (class296.field4492 == class230.field3507) {
            class167.field2592 = "127.0.0.1";
            class377.field5507 = class322.field4836 + 40000;
            class135.field2155 = class322.field4836 + 50000;
        }
        class376.field5480 = class167.field2592;
        class291.field4435 = class377.field5507;
        class331.field4965 = class377.field5507;
        class121.field2010 = class135.field2155;
        class220.field3399 = class331.field4965;
        if (class64.field1064 == class298.field4512) {
            class67.field1088 = class315.field4753;
            class76.field1369 = 0;
            class457.field7009 = class74.field1314;
            class497.field7546 = class51.field771;
            class440.field6454 = true;
            class405.field5892 = class360.field5332;
            class103.field1832 = 16777215;
        } else {
            class67.field1088 = class31.field400;
            class405.field5892 = class74.field1322;
            class497.field7546 = class42.field620;
            class457.field7009 = class409.field5940;
        }
        class449.field6920 = class6.field69 = class41.field617 = class173.field2676 = new short[arg0];
        if (class260.field3942 == 3) {
            class167.field2593 = class322.field4836;
        }
        class308.field4662 = class395.method2342(class257.field3919, 70);
        class251.field3835 = class19.method100(true, 0, class257.field3919);
        class158.field2484 = class100.method752(-21161);
        if (class158.field2484 != null) {
            class158.field2484.method1875(3, class257.field3919);
        }
        class24.field317 = class260.field3942;
        try {
            if (class7.field86.field3946 != null) {
                class462.field7100 = new class256(class7.field86.field3946, 5200, 0);
                for (int var3 = 0; var3 < 30; var3++) {
                    class146.field2368[var3] = new class256(class7.field86.field3938[var3], 6000, 0);
                }
                class146.field2364 = new class256(class7.field86.field3928, 6000, 0);
                class473.field7234 = new class319(255, class462.field7100, class146.field2364, 500000);
                class215.field3333 = new class256(class7.field86.field3927, 24, 0);
                class7.field86.field3928 = null;
                class7.field86.field3938 = null;
                class7.field86.field3946 = null;
                class7.field86.field3927 = null;
            }
        } catch (IOException var4) {
            class215.field3333 = null;
            class462.field7100 = null;
            class473.field7234 = null;
            class146.field2364 = null;
        }
        if (class77.field1378 != class230.field3507) {
            class359.field5320 = true;
        }
        class30.field393 = (class329.field4936 == class298.field4512 ? class238.field3594 : class18.field239).method2473(class406.field5898, -118);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ltq;)Lrf;", line = 549)
    public static final class54 method1176(class427 arg0) {
        class54 var1 = (class54) class437.field6439.method2409(false, ((long) arg0.field6157 << 32) + (long) arg0.field6265);
        return var1 == null ? arg0.field6281 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 554)
    public static final void method1177() {
        class116.field1960 = 0;
        for (int var0 = 0; var0 < class352.field5175; var0++) {
            class249 var1 = class195.field3085[class437.field6440[var0]];
            if (var1.field2177 && var1.method334(-128) != -1) {
                int var2 = (var1.method337(0) - 1) * 64 + 60;
                int var3 = var1.field3218 - var2 >> 7;
                int var4 = var1.field3222 - var2 >> 7;
                class135 var5 = class253.method1516(var1.field3217, (byte) -87, var4, var3);
                if (var5 != null) {
                    int var6 = var5.field2197;
                    if (var5 instanceof class249) {
                        var6 += 2048;
                    }
                    if (var5.field2145 == 0 && var5.method334(-128) != -1) {
                        class6.field76[class116.field1960] = var6;
                        class146.field2366[class116.field1960] = var6;
                        class116.field1960++;
                        var5.field2145++;
                    }
                    class6.field76[class116.field1960] = var6;
                    class146.field2366[class116.field1960] = var1.field2197 + 2048;
                    class116.field1960++;
                    var5.field2145++;
                }
            }
        }
        class132.method876(0, 121, class146.field2366, class116.field1960 - 1, class6.field76);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 604)
    public final void method1178(int arg0) {
        field2990++;
        if (field2992 == 1000) {
            return;
        }
        long var2 = class201.method1248((byte) 3) / 1000000L - class137.field2261;
        class137.field2261 = class201.method1248((byte) 113) / 1000000L;
        boolean var4 = class412.method2431((byte) 61);
        if (var4 && class127.field2053 && class462.field7108 != null) {
            class462.field7108.method1644(arg0 ^ 0x6280);
        }
        if (field2992 == 30 || field2992 == 10) {
            if (class361.field5337 != 0L && class344.method2111((byte) -125) > class361.field5337) {
                class423.method2477(false, -4, class331.method2058(arg0 ^ -30536), class463.field7116.field2954, class463.field7116.field2949);
            } else if (!class345.field5116.method1981() && class232.field3527) {
                class115.method822(true);
            }
        }
        if (class201.field3190 == null) {
            Container var5;
            if (class174.field2726 == null) {
                var5 = class7.field86.field3929;
            } else {
                var5 = class174.field2726;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class174.field2726 == var5) {
                Insets var8 = class174.field2726.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class135.field2212 != var6 || class292.field4453 != var7) {
                if (class345.field5116 == null || class345.field5116.method1967()) {
                    class197.method1224(-1);
                } else {
                    class292.field4453 = var7;
                    class135.field2212 = var6;
                }
                class361.field5337 = class344.method2111((byte) -37) + 500L;
            }
        }
        if (class201.field3190 != null && !class410.field5946 && (field2992 == 30 || field2992 == 10)) {
            class423.method2477(false, arg0 ^ 0xFFFF9D7C, class463.field7116.field2946, -1, -1);
        }
        boolean var9 = false;
        if (class345.field5120) {
            var9 = true;
            class345.field5120 = false;
        }
        if (var9) {
            class365.method2208((byte) -94);
        }
        if (class345.field5116 != null && class345.field5116.method1981() || class331.method2058(-5576) != 1) {
            class119.method831(0);
        }
        if (field2992 == 0) {
            class208.method1276(class208.field3259[class63.field1047], class108.field1880, var9, 13, class197.field3110[class63.field1047], class199.field3154, class190.field3024[class63.field1047]);
        } else if (field2992 == 5) {
            class33.method184(class208.field3259[class63.field1047].getRGB(), class345.field5116, class493.field7514, arg0 - 25312, class190.field3024[class63.field1047].getRGB(), class345.field5116.method1981() | var9, class197.field3110[class63.field1047].getRGB());
        } else if (field2992 == 10) {
            class195.method1217(-1008);
        } else if (field2992 == 25 || field2992 == 28) {
            if (class457.field7006 == 1) {
                if (class500.field7583 < class494.field7524) {
                    class500.field7583 = class494.field7524;
                }
                int var10 = (class500.field7583 - class494.field7524) * 50 / class500.field7583;
                class277.method1681(true, class217.field3343, class494.field7520.method2473(class406.field5898, -86) + "<br>(" + var10 + "%)", (byte) 70);
            } else if (class457.field7006 == 2) {
                if (class178.field2788 > class17.field231) {
                    class17.field231 = class178.field2788;
                }
                int var11 = (class17.field231 - class178.field2788) * 50 / class17.field231 + 50;
                class277.method1681(true, class217.field3343, class494.field7520.method2473(class406.field5898, -115) + "<br>(" + var11 + "%)", (byte) 112);
            } else {
                class277.method1681(true, class217.field3343, class494.field7520.method2473(class406.field5898, -96), (byte) 68);
            }
        } else if (field2992 == 30) {
            class334.method2073(var2, -21448);
        } else if (field2992 == 40) {
            class277.method1681(true, class217.field3343, class448.field6898.method2473(class406.field5898, -127) + "<br>" + class10.field137.method2473(class406.field5898, -117), (byte) 81);
        }
        if (class156.field2464 == 3) {
            for (int var12 = 0; var12 < class413.field5993; var12++) {
                Rectangle var13 = class331.field4950[var12];
                if (class78.field1386[var12]) {
                    class345.field5116.method1943(var13.x, -1996553985, var13.y, var13.height, 1, var13.width);
                } else if (class400.field5832[var12]) {
                    class345.field5116.method1943(var13.x, -1996554240, var13.y, var13.height, 1, var13.width);
                }
            }
        }
        if (class110.method792(-21786)) {
            class263.method1600(class345.field5116, 26);
        }
        if ((field2992 == 30 || field2992 == 10) && class156.field2464 == 0 && class331.method2058(arg0 ^ 0xFFFF88B8) == 1 && !var9 && class260.field3935.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class413.field5993; var15++) {
                if (class400.field5832[var15]) {
                    class400.field5832[var15] = false;
                    class139.field2281[var14++] = class331.field4950[var15];
                }
            }
            class345.field5116.method1957(class139.field2281, var14);
        } else if (field2992 != 0) {
            class345.field5116.method1915();
            for (int var16 = 0; var16 < class413.field5993; var16++) {
                class400.field5832[var16] = false;
            }
        }
        if (class463.field7116.field2940 == 0) {
            class414.method2437(15L, (byte) -122);
        } else if (class463.field7116.field2940 == 1) {
            class414.method2437(10L, (byte) -122);
        } else if (class463.field7116.field2940 == 2) {
            class414.method2437(5L, (byte) -122);
        } else if (class463.field7116.field2940 == 3) {
            class414.method2437(2L, (byte) -122);
        }
        if (class98.field1773) {
            class114.method817(arg0 - 25214);
        }
        if (arg0 != 25216) {
            field2992 = 82;
        }
        if (class463.field7116.field2958 && field2992 == 10 && class375.field5475 != -1) {
            class463.field7116.field2958 = false;
            class463.field7116.method80(class7.field86, (byte) -87);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 839)
    public static final void method1179() {
        int var0 = class328.field4921;
        int[] var1 = class280.field4247;
        int var2 = class97.field1748 ? var0 : class352.field5175 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class135 var4;
            if (var3 < var0) {
                var4 = class224.field3450[var1[var3]];
            } else {
                var4 = class195.field3085[class437.field6440[var3 - var0]];
            }
            if (var4.field2151 >= 0) {
                int var5 = var4.method337(0);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field3218 & 0x7F) == 0 && (var4.field3222 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field3218 & 0x7F) == 64 && (var4.field3222 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class47 && var4.field2236 != null && class369.field5424 >= var4.field2236.field2301 && class369.field5424 < var4.field2236.field2302) {
                    ((class47) var4).field704 = false;
                }
                var4.field3214 = class7.method38(var4.field3218, var4.field3217, var4.field3222, (byte) -54);
                class408.method2418(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 883)
    private final void method1180(byte arg0) {
        class115.field1951++;
        field3002++;
        class396.method2356(-1, -1, true, null);
        class294.method1786(-1, -1, 110, null);
        class166.method1047(-17299);
        class298.field4515++;
        for (int var2 = 0; var2 < 32768; var2++) {
            class249 var13 = class195.field3085[var2];
            if (var13 != null) {
                byte var14 = var13.field3819.field3708;
                if ((var14 & 0x1) != 0) {
                    int var15 = var13.method337(0);
                    if ((var14 & 0x2) != 0 && var13.field2231 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var17 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var16 != 0 || var17 != 0) {
                            int var18 = var13.field2232[0] + var16;
                            int var19 = var13.field2239[0] + var17;
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (var18 > (class150.field2422 - var15 - 1)) {
                                var18 = class150.field2422 - var15 - 1;
                            }
                            if (var19 < 0) {
                                var19 = 0;
                            } else if ((class21.field272 - var15 - 1) < var19) {
                                var19 = class21.field272 - var15 - 1;
                            }
                            int var20 = class418.method2449(var15, var13.field2239[0], var19, true, 0, var13.field2232[0], 0, var15, class377.field5498, 10, -1, class91.field1641[var13.field3217], var18, var15, class266.field4032);
                            if (var20 > 0) {
                                if (var20 > 9) {
                                    var20 = 9;
                                }
                                for (int var21 = 0; var21 < var20; var21++) {
                                    var13.field2232[var21] = class266.field4032[var20 - var21 - 1];
                                    var13.field2239[var21] = class377.field5498[var20 - var21 - 1];
                                    var13.field2234[var21] = 1;
                                }
                                var13.field2231 = var20;
                            }
                        }
                    }
                    class102.method757(true, 126, var13);
                    int var22 = class244.method1462(var13, false);
                    class451.method2687(var22, class245.field3686, var13, 0, class265.field4014);
                    class262.method1597(0, var13);
                }
            }
        }
        int var3 = -36 / ((arg0 + 3) / 37);
        if (class490.field7451 == 0 && class74.field1320 == 0) {
            if (class408.field5928 == 2) {
                class410.method2422(-1);
            } else {
                class85.method600(52);
            }
            if ((class243.field3655 >> 7) < 14 || (class150.field2422 - 14) <= (class243.field3655 >> 7) || class290.field4403 >> 7 < 14 || (class21.field272 - 14) <= (class290.field4403 >> 7)) {
                class160.method1029((byte) 115);
            }
        }
        while (true) {
            class298 var4;
            class427 var5;
            class427 var6;
            do {
                var4 = (class298) class220.field3397.method7(false);
                if (var4 == null) {
                    while (true) {
                        class298 var7;
                        class427 var8;
                        class427 var9;
                        do {
                            var7 = (class298) class114.field1927.method7(false);
                            if (var7 == null) {
                                while (true) {
                                    class298 var10;
                                    class427 var11;
                                    class427 var12;
                                    do {
                                        var10 = (class298) class144.field2339.method7(false);
                                        if (var10 == null) {
                                            if (class450.field6931 != null) {
                                                class323.method2014(-2);
                                            }
                                            if (class369.field5424 % 1500 == 0) {
                                                class218.method1339((byte) 108);
                                            }
                                            class254.method1524((byte) 50);
                                            if (class96.field1742 && class344.method2111((byte) -34) - 60000L > class238.field3592) {
                                                class350.method2131((byte) -127);
                                                return;
                                            }
                                            return;
                                        }
                                        var11 = var10.field4517;
                                        if (var11.field6265 < 0) {
                                            break;
                                        }
                                        var12 = class413.method2435(160291920, var11.field6253);
                                    } while (var12 == null || var12.field6193 == null || var12.field6193.length <= var11.field6265 || var12.field6193[var11.field6265] != var11);
                                    class94.method704(var10);
                                }
                            }
                            var8 = var7.field4517;
                            if (var8.field6265 < 0) {
                                break;
                            }
                            var9 = class413.method2435(160291920, var8.field6253);
                        } while (var9 == null || var9.field6193 == null || var9.field6193.length <= var8.field6265 || var9.field6193[var8.field6265] != var8);
                        class94.method704(var7);
                    }
                }
                var5 = var4.field4517;
                if (var5.field6265 < 0) {
                    break;
                }
                var6 = class413.method2435(160291920, var5.field6253);
            } while (var6 == null || var6.field6193 == null || var6.field6193.length <= var5.field6265 || var6.field6193[var5.field6265] != var5);
            class94.method704(var4);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 1082)
    public final void method1181(int arg0) {
        class12.method62(true);
        field2994++;
        class109.method788((byte) 97);
        class64.method440(4);
        class423.method2476(24978);
        class500.method3008((byte) -100);
        class414.method2440((byte) 87);
        class284.method1736((byte) 74);
        class251.method1509(29469);
        class179.method1123(-125);
        class375.method2259(-44);
        class407.method2414((byte) 65);
        class291.method1776(112);
        class13.method67((byte) 116);
        class418.method2448((byte) 31);
        class382.method2293(19499);
        class491.method2952(false);
        class318.method1906(false);
        class15.method76((byte) 124);
        class265.method1620((byte) -100);
        class4.method19(-111);
        class314.method1876(23782);
        class295.method1793(5);
        class476.method2873(0);
        class276.method1675(-106);
        class46.method322(4387);
        class458.method2727(-1);
        class256.method1541(-24617);
        class319.method1996((byte) -55);
        class288.method1747((byte) 122);
        class234.method1404((byte) 25);
        class103.method762(16521);
        class439.method2561(6970);
        class244.method1464(120);
        class237.method1428(11616);
        class144.method947((byte) 25);
        class100.method751(-32);
        class248.method1496(false);
        class137.method915(3);
        class307.method1849(-359993312);
        class160.method1030(91);
        class451.method2693((byte) -122);
        class507.method3036(-1);
        class207.method1270((byte) 104);
        class278.method1698((byte) -125);
        class21.method104(false);
        class437.method2558(20201);
        class201.method1249(30);
        class273.method1662(113);
        class420.method2459(-99);
        class395.method2343((byte) -23);
        class167.method1053((byte) 54);
        class415.method2445(2);
        class169.method1065(20970);
        class399.method2372(84);
        class188.method1167(-14468);
        class429.method2524(17402);
        class282.method1717((byte) -111);
        class72.method536((byte) -127);
        class230.method1385((byte) 75);
        class41.method292((byte) -97);
        class215.method1323(-125);
        class427.method2516(-98);
        class7.method40(-120);
        class47.method331(-30015);
        class232.method1390(-1008);
        class128.method868(13207);
        class325.method2031(-10);
        class40.method284(71);
        class135.method895((byte) 95);
        class488.method2930(32);
        class268.method1633((byte) 110);
        class366.method2213((byte) 120);
        class76.method562(-25850);
        class1.method2(-126);
        class394.method2340(-77);
        class54.method373((byte) 106);
        class310.method1855(3);
        class28.method143((byte) 123);
        class353.method2150(31993);
        class303.method1818((byte) 74);
        class198.method1226(-19330);
        class372.method2247(-26863);
        class480.method2898(27842);
        class241.method1448(18261);
        class162.method1035(39);
        class176.method1106(-25565);
        class332.method2064((byte) -125);
        class19.method98(-26);
        class57.method408(0);
        class311.method1859(24);
        class463.method2761(4907);
        class196.method1220(false);
        class157.method1007(-99);
        class187.method1158((byte) 72);
        class320.method2006(107);
        class312.method1869(true);
        class87.method619((byte) -122);
        class493.method2977(-128);
        class446.method2668((byte) -118);
        class174.method1089(-50);
        class9.method51((byte) 56);
        class56.method388(4);
        class78.method569((byte) -120);
        class245.method1473(0);
        class182.method1138((byte) 58);
        class165.method1044((byte) 108);
        class88.method638(83);
        class270.method1641(256);
        class115.method820((byte) 77);
        class456.method2703(119);
        class387.method2305((byte) -76);
        class161.method1034(false);
        class323.method2015(3);
        class433.method2533(true);
        class61.method424(-2);
        class99.method745(121);
        class218.method1338(1);
        class123.method849(24363);
        class327.method2038(16251);
        class368.method2231((byte) -81);
        class441.method2572(26338);
        class479.method2893(7884);
        class460.method2749(118);
        class432.method2529((byte) 55);
        class94.method706();
        class492.method2975();
        class334.method2072((byte) 125);
        class235.method1414();
        class254.method1523((byte) -95);
        class173.method1079(30105);
        class252.method1514((byte) 51);
        class257.method1546((byte) -117);
        class206.method1263((byte) -99);
        class274.method1667(80);
        class48.method343(57);
        class411.method2426((byte) 117);
        class269.method1636(111);
        class85.method597(124);
        class14.method72(-30);
        class159.method1023(true);
        class324.method2020(-10485);
        class448.method2676(127);
        class147.method964(0);
        class331.method2059(-101);
        class392.method2335((byte) 98);
        class121.method839(6724);
        class349.method2129(0);
        class264.method1602(-6071);
        class120.method834(-16630);
        class434.method2535((byte) -32);
        class482.method2912(-1);
        class51.method356(1);
        class380.method2285(true);
        class243.method1457((byte) -118);
        class155.method1002(false);
        class131.method874((byte) -102);
        class472.method2837((byte) -128);
        class50.method355(false);
        class214.method1314(0);
        class467.method2826(-118);
        class240.method1435();
        class345.method2112(4);
        class24.method124((byte) 65);
        class397.method2360(108);
        class213.method1310(true);
        class471.method2834(27974);
        class294.method1784(85);
        class308.method1852(76);
        class27.method137((byte) -24);
        class449.method2684((byte) 126);
        class508.method3041(13);
        class298.method1803(-79);
        class231.method1389(true);
        class195.method1215((byte) 71);
        class205.method1262((byte) -114);
        class227.method1366((byte) -49);
        class212.method1303(-20878);
        class477.method2885();
        class142.method937(2);
        class197.method1225(123);
        class168.method1058((byte) -108);
        class233.method1396((byte) -96);
        class376.method2266(-26958);
        class412.method2430(127);
        class431.method2527(110);
        class297.method1798((byte) 121);
        class329.method2047(true);
        class452.method2698((byte) -20);
        class373.method2249(true);
        class178.method1119((byte) 53);
        class146.method959(0);
        class129.method870(false);
        class289.method1763(17859);
        class322.method2012((byte) -77);
        class355.method2178((byte) -114);
        class286.method1740(93);
        class389.method2315(2);
        class447.method2672(false);
        class141.method934(-128);
        class110.method790(1);
        class32.method179(0);
        class486.method2920(7);
        class336.method2081(128);
        class378.method2277(-124);
        class26.method135((byte) 67);
        class236.method1419(true);
        class163.method1037((byte) -22);
        class444.method2663(false);
        class377.method2270(14890);
        class143.method941((byte) 127);
        class436.method2546(83);
        class435.method2541(true);
        class302.method1816(false);
        class221.method1347((byte) 86);
        class501.method3009(-1056433248);
        class107.method781(120);
        class424.method2494(59);
        class453.method2701();
        class10.method55(2);
        class272.method1652(-122);
        class277.method1694(-1);
        class483.method2914(-16809);
        class82.method593(-113462416);
        class102.method759(true);
        class462.method2758(-28859);
        class74.method555(-121);
        class22.method110((byte) 89);
        class259.method1554();
        class313.method1870(258);
        class511.method3060((byte) -128);
        class457.method2708((byte) -14);
        class30.method156((byte) 99);
        class369.method2236(28667);
        class164.method1039(12545);
        class31.method175(false);
        class75.method557(-18905);
        class290.method1769(-118);
        class98.method742(false);
        class220.method1344(-108);
        class200.method1244(false);
        class175.method1101((byte) 127);
        class58.method415(102);
        class361.method2195(458752);
        class65.method449(-30710);
        class371.method2245(50);
        class172.method1078(31215);
        class374.method2253(13159);
        class443.method2661((byte) 79);
        class465.method2806();
        class93.method692(-62);
        class52.method364(116);
        class71.method521();
        class459.method2748();
        class422.method2471();
        class202.method1255(47);
        class428.method2522();
        class478.method2890((byte) -115);
        class5.method22();
        class217.method1333((byte) 0);
        class328.method2041((byte) 25);
        class362.method2200((byte) -84);
        class17.method93((byte) 29);
        class466.method2823((byte) -43);
        class53.method369(true);
        class469.method2830(-128);
        class512.method3063((byte) -120);
        class370.method2244(true);
        class405.method2402(-16108);
        class42.method297(-1);
        class239.method1431(5);
        class33.method180(300);
        class183.method1147((byte) -51);
        class184.method1152(true);
        class481.method2907(1);
        class190.method1199(-29901);
        class296.method1797(24);
        class86.method610(true);
        class442.method2658(0);
        class70.method517((byte) -37);
        class114.method815((byte) 96);
        class8.method41((byte) -119);
        class246.method1485((byte) -60);
        class34.method197(true);
        class153.method982(false);
        class199.method1241(0);
        class96.method729((byte) -103);
        class194.method1212(10241);
        class262.method1595(1);
        class77.method565((byte) 96);
        class208.method1274(2);
        class69.method484(0);
        class400.method2378(79);
        class304.method1833((byte) -100);
        class95.method713();
        class317.method1887(false);
        class117.method830(0);
        class306.method1836((byte) -77);
        class326.method2035((byte) -80);
        class505.method3020(true);
        class383.method2297(10);
        class132.method877((byte) 96);
        class247.method1491((byte) 123);
        class193.method1202(62);
        class474.method2853(-27747);
        class226.method1364((byte) -88);
        class38.method214((byte) -116);
        class39.method216(-60);
        class461.method2756(-11566);
        class484.method2918((byte) -80);
        class18.method96(1);
        class497.method2989(0);
        class321.method2011((byte) -67);
        class402.method2384(-1644);
        class401.method2381(true);
        class16.method91((byte) 21);
        class410.method2423((byte) 121);
        class106.method779(0);
        class495.method2982(14131);
        class502.method3010(34);
        class145.method950((byte) -99);
        class506.method3022(0);
        class181.method1126(0);
        class158.method1013(-2);
        class275.method1673(-114);
        class119.method832(100);
        class386.method2300((byte) 119);
        class292.method1781(1887170476);
        class309.method1854(false);
        class341.method2106(4096);
        class150.method977(99);
        class242.method1453();
        class354.method2158();
        class388.method2311((byte) -93);
        class67.method453((byte) -57);
        class315.method1880((byte) -34);
        class166.method1046(51);
        class305.method1835(true);
        class266.method1628((byte) -76);
        class177.method1115((byte) 42);
        class91.method689(24909);
        class263.method1601((byte) -28);
        class261.method1587(127);
        class90.method667(true);
        class149.method971(0);
        class279.method1707(-123);
        class225.method1363(6);
        class475.method2856(127);
        class403.method2393(-123);
        class55.method384((byte) 121);
        class23.method119(3);
        class73.method549(false);
        class20.method102((byte) 103);
        class139.method931(-1);
        class60.method422(-10342);
        class498.method2995(false);
        class499.method2999(-17000);
        class222.method1354(81);
        class49.method345(true);
        class450.method2685(-1);
        class409.method2420(-16581);
        class152.method979(12770);
        class413.method2436(-122);
        class339.method2094((byte) 90);
        class299.method1807(-67);
        class280.method1711(-6459);
        class113.method810((byte) 25);
        class358.method2188(3);
        class156.method1003(15);
        class108.method785(3);
        class228.method1373(127);
        class359.method2190(-7019);
        class138.method924((byte) -120);
        class503.method3015(-112);
        class473.method2849(-21891);
        class223.method1356(39);
        class238.method1429(0);
        class105.method775((byte) -43);
        class381.method2287(75);
        class111.method798(-28123);
        class406.method2404(112);
        class134.method879((byte) -123);
        class490.method2948(49);
        class216.method1329((byte) -99);
        class494.method2980(false);
        class112.method804(30980);
        class379.method2282(11);
        class224.method1360(false);
        if (arg0 < 14) {
            return;
        }
        class25.method132(-22944);
        class2.method3((byte) 58);
        class170.method1070(21695);
        class63.method439(1645682511);
        class348.method2121(true);
        class419.method2455(-99);
        class338.method2090(true);
        class360.method2192(4);
        class255.method1530(false);
        class330.method2051(36064);
        class37.method205(-26);
        class189.method1194(119);
        class6.method34((byte) -11);
        class83.method595((byte) 125);
        class504.method3018((byte) 123);
        class287.method1745(32286);
        class487.method2923((byte) -53);
        if (class291.field4441) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V", line = 1499)
    private final void method1182(byte arg0, int arg1) {
        class284.field4297.field7281++;
        class406.field5899 = null;
        int var3 = 29 / ((arg0 - 17) / 46);
        class280.field4257 = null;
        class269.field4068 = 0;
        field3005++;
        class284.field4297.field7284 = arg1;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 1514)
    public static final void method1183() {
        int var0 = class328.field4921;
        int[] var1 = class280.field4247;
        boolean var2 = class463.field7116.field2942 == 1 && var0 > 200 || class463.field7116.field2942 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class47 var12 = class224.field3450[var1[var3]];
            if (var12.method339((byte) 97)) {
                var12.method891((byte) 64);
                if (var12.field3225 >= 0 && var12.field3219 >= 0 && var12.field3227 < class150.field2422 && var12.field3220 < class21.field272) {
                    var12.field704 = var12.field2196 ? var2 : false;
                    if (class286.field4329 == var12) {
                        var12.field2151 = Integer.MAX_VALUE;
                    } else {
                        int var13 = 0;
                        if (!var12.field2177) {
                            var13++;
                        }
                        if (var12.field2217 > class369.field5424) {
                            var13 += 2;
                        }
                        int var14 = var13 + (5 - var12.method337(0) << 2);
                        if (var12.field688) {
                            var14 += 512;
                        } else {
                            if (class67.field1096 == 0) {
                                var14 += 32;
                            } else {
                                var14 += 128;
                            }
                            var14 += 256;
                        }
                        var12.field2151 = var14 + 1;
                    }
                } else {
                    var12.field2151 = -1;
                }
            } else {
                var12.field2151 = -1;
            }
        }
        for (int var4 = 0; var4 < class352.field5175; var4++) {
            class249 var9 = class195.field3085[class437.field6440[var4]];
            if (var9.method1505((byte) 97) && var9.field3819.method1478((byte) 9, class273.field4144)) {
                var9.method891((byte) 64);
                if (var9.field3225 >= 0 && var9.field3219 >= 0 && var9.field3227 < class150.field2422 && var9.field3220 < class21.field272) {
                    int var10 = 0;
                    if (!var9.field2177) {
                        var10++;
                    }
                    if (var9.field2217 > class369.field5424) {
                        var10 += 2;
                    }
                    int var11 = var10 + (5 - var9.method337(0) << 2);
                    if (class67.field1096 == 0) {
                        if (var9.field3819.field3687) {
                            var11 += 64;
                        } else {
                            var11 += 128;
                        }
                    } else if (class67.field1096 == 1) {
                        if (var9.field3819.field3687) {
                            var11 += 32;
                        } else {
                            var11 += 64;
                        }
                    }
                    if (var9.field3819.field3730) {
                        var11 += 1024;
                    } else if (!var9.field3819.field3699) {
                        var11 += 256;
                    }
                    var9.field2151 = var11 + 1;
                } else {
                    var9.field2151 = -1;
                }
            } else {
                var9.field2151 = -1;
            }
        }
        for (int var5 = 0; var5 < class228.field3487.length; var5++) {
            class97 var6 = class228.field3487[var5];
            if (var6 != null) {
                if (var6.field1745 == 1) {
                    class249 var7 = class195.field3085[var6.field1747];
                    if (var7 != null && var7.field2151 >= 0) {
                        var7.field2151 += 2048;
                    }
                } else if (var6.field1745 == 10) {
                    class47 var8 = class224.field3450[var6.field1747];
                    if (var8 != null && class286.field4329 != var8 && var8.field2151 >= 0) {
                        var8.field2151 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 1675)
    public final void method1184(boolean arg0) {
        field2999++;
        if (class96.field1742) {
            class350.method2131((byte) -126);
        }
        if (class345.field5116 != null) {
            class345.field5116.method1974(-25261);
        }
        if (class201.field3190 != null) {
            class274.method1671(class7.field86, class201.field3190, true);
            class201.field3190 = null;
        }
        if (class163.field2534 != null) {
            class163.field2534.method1795((byte) 127);
            class163.field2534 = null;
        }
        if (class158.field2484 != null) {
            class158.field2484.method1877(class257.field3919, 1);
        }
        class158.field2484 = null;
        class208.method1272(arg0);
        class284.field4297.method2864(120);
        class319.field4802.method1677(false);
        if (class306.field4638 != null) {
            class306.field4638.method1163(222);
            class306.field4638 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 1716)
    private final void method1185(byte arg0) {
        field2996++;
        if (!class463.field7116.field2958) {
            for (int var2 = 0; var2 < class170.field2650; var2++) {
                if (class304.field4624[var2].method1067(-1) == 's' || class304.field4624[var2].method1067(-1) == 'S') {
                    class463.field7116.field2958 = true;
                    break;
                }
            }
        }
        if (class163.field2535 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class344.method2111((byte) -69);
            if (class483.field7379 == 0L) {
                class483.field7379 = var5;
            }
            if (var4 > 16384 && var5 - class483.field7379 < 5000L) {
                if (var5 - class501.field7591 > 1000L) {
                    System.gc();
                    class501.field7591 = var5;
                }
                class199.field3154 = class493.field7513.method2473(class406.field5898, -122);
                class108.field1880 = 5;
            } else {
                class199.field3154 = class47.field681.method2473(class406.field5898, -97);
                class163.field2535 = 10;
                class108.field1880 = 5;
            }
        } else if (class163.field2535 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class91.field1641[var7] = class336.method2082((byte) 93, class150.field2422, class21.field272);
            }
            class199.field3154 = class383.field5579.method2473(class406.field5898, -121);
            class163.field2535 = 20;
            class108.field1880 = 10;
        } else if (class163.field2535 == 20) {
            if (class23.field305 == null) {
                class23.field305 = new class46(class284.field4297, class319.field4802);
            }
            if (class23.field305.method321((byte) -55)) {
                class469.field7195 = class365.method2210(true, 0, false, 1, -106);
                class376.field5487 = class365.method2210(true, 1, false, 1, -122);
                class207.field3242 = class365.method2210(true, 2, false, 1, -109);
                class85.field1435 = class365.method2210(true, 3, false, 1, -103);
                class131.field2087 = class365.method2210(true, 4, false, 1, -103);
                class73.field1310 = class365.method2210(true, 5, true, 1, -120);
                class471.field7207 = class365.method2210(false, 6, true, 1, -118);
                class274.field4160 = class365.method2210(true, 7, false, 1, -101);
                class472.field7225 = class365.method2210(true, 8, false, 1, -101);
                class383.field5572 = class365.method2210(true, 9, false, 1, -124);
                class119.field1975 = class365.method2210(true, 10, false, 1, -125);
                class395.field5765 = class365.method2210(true, 11, false, 1, -104);
                class375.field5474 = class365.method2210(true, 12, false, 1, -101);
                class123.field2027 = class365.method2210(true, 13, false, 1, -110);
                class226.field3466 = class365.method2210(false, 14, false, 1, -122);
                class173.field2694 = class365.method2210(true, 15, false, 1, -109);
                class504.field7613 = class365.method2210(true, 16, false, 1, -127);
                class237.field3590 = class365.method2210(true, 17, false, 1, -107);
                class409.field5934 = class365.method2210(true, 18, false, 1, -123);
                class478.field7307 = class365.method2210(true, 19, false, 1, -106);
                class315.field4751 = class365.method2210(true, 20, false, 1, -110);
                class245.field3680 = class365.method2210(true, 21, false, 1, -113);
                class60.field1021 = class365.method2210(true, 22, false, 1, -116);
                class232.field3524 = class365.method2210(true, 23, true, 1, -112);
                class161.field2531 = class365.method2210(true, 24, false, 1, -109);
                class406.field5894 = class365.method2210(true, 25, false, 1, -116);
                class436.field6425 = class365.method2210(true, 26, true, 1, -101);
                class483.field7377 = class365.method2210(true, 27, false, 1, -102);
                class183.field2914 = class365.method2210(true, 28, true, 1, -123);
                class296.field4496 = class365.method2210(true, 29, false, 1, -100);
                class199.field3154 = class108.field1876.method2473(class406.field5898, -100);
                class108.field1880 = 15;
                class163.field2535 = 30;
            } else {
                class199.field3154 = class460.field7087.method2473(class406.field5898, -78);
                class108.field1880 = 12;
            }
        } else if (class163.field2535 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 30; var9++) {
                var8 += class99.field1791[var9].method2327(100) * class275.field4175[var9] / 100;
            }
            if (var8 == 100) {
                class199.field3154 = class503.field7603.method2473(class406.field5898, -92);
                class108.field1880 = 20;
                class381.method2288(-96, class472.field7225);
                class444.method2662(-126, class472.field7225);
                class163.field2535 = 40;
            } else {
                if (var8 != 0) {
                    class199.field3154 = class228.field3485.method2473(class406.field5898, -101) + var8 + "%";
                }
                class108.field1880 = 20;
            }
        } else if (class163.field2535 == 40) {
            if (class183.field2914.method2728((byte) 96)) {
                this.method1186(class183.field2914.method2734(1, (byte) 78), -11);
                class199.field3154 = class91.field1634.method2473(class406.field5898, -110);
                class108.field1880 = 25;
                class163.field2535 = 50;
            } else {
                class199.field3154 = class345.field5119.method2473(class406.field5898, -109) + class183.field2914.method2731(0) + "%";
                class108.field1880 = 25;
            }
        } else if (class163.field2535 == 50) {
            class227.method1372(-34);
            class199.field3154 = class40.field541.method2473(class406.field5898, -94);
            class163.field2535 = 60;
            class108.field1880 = 30;
        } else if (class163.field2535 == 60) {
            int var10 = class16.method88(73, class123.field2027, class472.field7225);
            int var11 = class147.method963((byte) 76);
            if (var11 > var10) {
                class199.field3154 = class105.field1844.method2473(class406.field5898, -127) + var10 * 100 / var11 + "%";
                class108.field1880 = 35;
            } else {
                class199.field3154 = class379.field5543.method2473(class406.field5898, -111);
                class108.field1880 = 35;
                class163.field2535 = 70;
            }
        } else if (class163.field2535 == 70) {
            int var12 = class370.method2243(true, class472.field7225);
            int var13 = class38.method212(-90);
            if (var12 < var13) {
                class199.field3154 = class359.field5322.method2473(class406.field5898, -109) + var12 * 100 / var13 + "%";
                class108.field1880 = 40;
            } else {
                class199.field3154 = class511.field7743.method2473(class406.field5898, -93);
                class108.field1880 = 40;
                class163.field2535 = 80;
            }
        } else if (class163.field2535 == 80) {
            if (class436.field6425.method2728((byte) 96)) {
                class218.field3349 = new class206(class436.field6425, class383.field5572, class472.field7225);
                class199.field3154 = class64.field1055.method2473(class406.field5898, -92);
                class163.field2535 = 90;
                class108.field1880 = 45;
            } else {
                class199.field3154 = class361.field5336.method2473(class406.field5898, -122) + class436.field6425.method2731(0) + "%";
                class108.field1880 = 45;
            }
        } else if (class163.field2535 == 90) {
            class199.field3154 = class108.field1883.method2473(class406.field5898, -112);
            class163.field2535 = 95;
            class108.field1880 = 50;
        } else if (class163.field2535 == 95) {
            if (class463.field7116.field2958) {
                class463.field7116.field2971 = 0;
                class463.field7116.field2959 = 0;
                class463.field7116.field2970 = 0;
                class463.field7116.field2946 = 1;
                class463.field7116.field2945 = 0;
            }
            class463.field7116.field2958 = true;
            class463.field7116.method80(class7.field86, (byte) 73);
            class239.method1434(106, false, class463.field7116.field2945);
            class199.field3154 = class244.field3666.method2473(class406.field5898, -106);
            class163.field2535 = 100;
            class108.field1880 = 55;
        } else if (class163.field2535 == 100) {
            class198.method1230(class123.field2027, class345.field5116, 127, class472.field7225);
            class199.field3154 = class280.field4252.method2473(class406.field5898, -96);
            class108.field1880 = 60;
            class189.method1196(5, -12254);
            class163.field2535 = 110;
        } else if (class163.field2535 == 110) {
            class207.field3242.method2728((byte) 96);
            byte var14 = 0;
            int var15 = var14 + class207.field3242.method2731(0);
            class504.field7613.method2728((byte) 96);
            int var16 = var15 + class504.field7613.method2731(0);
            class237.field3590.method2728((byte) 96);
            int var17 = var16 + class237.field3590.method2731(0);
            class409.field5934.method2728((byte) 96);
            int var18 = var17 + class409.field5934.method2731(0);
            class478.field7307.method2728((byte) 96);
            int var19 = var18 + class478.field7307.method2731(0);
            class315.field4751.method2728((byte) 96);
            int var20 = var19 + class315.field4751.method2731(0);
            class245.field3680.method2728((byte) 96);
            int var21 = var20 + class245.field3680.method2731(0);
            class60.field1021.method2728((byte) 96);
            int var22 = var21 + class60.field1021.method2731(0);
            class161.field2531.method2728((byte) 96);
            int var23 = var22 + class161.field2531.method2731(0);
            class406.field5894.method2728((byte) 96);
            int var24 = var23 + class406.field5894.method2731(0);
            class483.field7377.method2728((byte) 96);
            int var25 = var24 + class483.field7377.method2731(0);
            class296.field4496.method2728((byte) 96);
            int var26 = var25 + class296.field4496.method2731(0);
            if (var26 < 1200) {
                class199.field3154 = class381.field5552.method2473(class406.field5898, -93) + var26 / 12 + "%";
                class108.field1880 = 65;
            } else {
                class76.field1364 = new class207(class298.field4512, class406.field5898, class207.field3242);
                class511.field7740 = new class234(class298.field4512, class406.field5898, class207.field3242);
                class466.field7153 = new class103(class298.field4512, class406.field5898, class207.field3242, class472.field7225);
                class295.field4480 = new class439(class298.field4512, class406.field5898, class237.field3590);
                class399.field5816 = new class244(class298.field4512, class406.field5898, class207.field3242);
                class359.field5323 = new class237(class298.field4512, class406.field5898, class207.field3242);
                class56.field933 = new class144(class298.field4512, class406.field5898, class207.field3242, class274.field4160);
                class331.field4952 = new class100(class298.field4512, class406.field5898, class207.field3242);
                class193.field3050 = new class248(class298.field4512, class406.field5898, class207.field3242);
                class128.field2070 = new class137(class298.field4512, class406.field5898, true, class504.field7613, class274.field4160);
                class22.field281 = new class307(class298.field4512, class406.field5898, class207.field3242, class472.field7225);
                class164.field2542 = new class160(class298.field4512, class406.field5898, class207.field3242, class472.field7225);
                class433.field6358 = new class451(class298.field4512, class406.field5898, true, class409.field5934, class274.field4160);
                class288.field4362 = new class507(class298.field4512, class406.field5898, true, class76.field1364, class478.field7307, class274.field4160);
                class156.field2465 = new class278(class298.field4512, class406.field5898, class207.field3242);
                class429.field6302 = new class21(class298.field4512, class406.field5898, class315.field4751, class469.field7195, class376.field5487);
                class466.field7155 = new class437(class298.field4512, class406.field5898, class207.field3242);
                class507.field7670 = new class440(class298.field4512, class406.field5898, class207.field3242);
                class201.field3192 = new class201(class298.field4512, class406.field5898, class245.field3680, class274.field4160);
                class318.field4791 = new class273(class298.field4512, class406.field5898, class207.field3242);
                class201.field3196 = new class420(class298.field4512, class406.field5898, class207.field3242);
                class511.field7750 = new class395(class298.field4512, class406.field5898, class207.field3242);
                class117.field1962 = new class229(class298.field4512, class406.field5898, class60.field1021);
                class368.field5407 = new class167(class298.field4512, class406.field5898, class207.field3242);
                class100.method750(class85.field1435, class472.field7225, class274.field4160, 16, class123.field2027);
                class308.method1850(0, class296.field4496);
                class419.field6031 = new class415(class406.field5898, class161.field2531, class406.field5894);
                class47.field721 = new class169(class406.field5898, class161.field2531, class406.field5894, new class155());
                class199.field3154 = class512.field7767.method2473(class406.field5898, -126);
                class108.field1880 = 65;
                class494.method2979(108);
                class128.field2070.method918(!class463.field7116.method75(-1, class30.field395), (byte) 67);
                class273.field4144 = new class265();
                class200.method1245(0);
                class188.method1162(class483.field7377, -128);
                class6.method35(32161, class274.field4160, class218.field3349);
                class163.field2535 = 120;
            }
        } else if (class163.field2535 == 120) {
            int var27 = class142.method938(class472.field7225, 31882);
            int var28 = class40.method228(16);
            if (var28 > var27) {
                class199.field3154 = class266.field4034.method2473(class406.field5898, -95) + var27 * 100 / var28 + "%";
                class108.field1880 = 70;
            } else {
                class67.method454(false, class345.field5116, class472.field7225);
                class87.method612((byte) 85, class480.field7336);
                class199.field3154 = class108.field1884.method2473(class406.field5898, -95);
                class108.field1880 = 70;
                class163.field2535 = 130;
            }
        } else if (class163.field2535 == 130) {
            if (class119.field1975.method2724(0, "huffman", "")) {
                class24 var29 = new class24(class119.field1975.method2723(-65, "", "huffman"));
                class237.method1424(0, var29);
                class199.field3154 = class325.field4881.method2473(class406.field5898, -109);
                class108.field1880 = 75;
                class163.field2535 = 140;
            } else {
                class199.field3154 = class424.field6090.method2473(class406.field5898, -116) + "0%";
                class108.field1880 = 75;
            }
        } else if (class163.field2535 == 140) {
            if (class85.field1435.method2728((byte) 96)) {
                class199.field3154 = class100.field1809.method2473(class406.field5898, -87);
                class163.field2535 = 150;
                class108.field1880 = 80;
            } else {
                class199.field3154 = class232.field3526.method2473(class406.field5898, -106) + class85.field1435.method2731(0) + "%";
                class108.field1880 = 80;
            }
        } else if (class163.field2535 == 150) {
            if (class375.field5474.method2728((byte) 96)) {
                class199.field3154 = class431.field6350.method2473(class406.field5898, -93);
                class163.field2535 = 160;
                class108.field1880 = 82;
            } else {
                class199.field3154 = class299.field4537.method2473(class406.field5898, -117) + class375.field5474.method2731(0) + "%";
                class108.field1880 = 82;
            }
        } else if (class163.field2535 == 160) {
            if (class123.field2027.method2728((byte) 96)) {
                class199.field3154 = class73.field1296.method2473(class406.field5898, -109);
                class163.field2535 = 170;
                class108.field1880 = 85;
            } else {
                class199.field3154 = class73.field1296.method2473(class406.field5898, -128) + class123.field2027.method2731(0) + "%";
                class108.field1880 = 85;
            }
        } else if (arg0 < -63) {
            if (class163.field2535 == 170) {
                if (class232.field3524.method2710("details", -82)) {
                    class492.method2962(class232.field3524, class399.field5816, class359.field5323, class128.field2070, class22.field281, class164.field2542, class273.field4144);
                    class199.field3154 = class309.field4665.method2473(class406.field5898, -106);
                    class108.field1880 = 89;
                    class163.field2535 = 180;
                } else {
                    class199.field3154 = class497.field7535.method2473(class406.field5898, -107) + class232.field3524.method2709(1, "details") + "%";
                    class108.field1880 = 87;
                }
            } else if (class163.field2535 == 180) {
                int var30 = class511.method3056(109);
                if (var30 == -1) {
                    class199.field3154 = class142.field2309.method2473(class406.field5898, -87);
                    class108.field1880 = 90;
                } else if (var30 == 7 || var30 == 9) {
                    this.method1770((byte) 61, "worldlistfull");
                    class189.method1196(1000, -12254);
                } else if (class239.field3611) {
                    class199.field3154 = class493.field7517.method2473(class406.field5898, -106);
                    class108.field1880 = 90;
                    class163.field2535 = 190;
                } else {
                    this.method1770((byte) 91, "worldlistio_" + var30);
                    class189.method1196(1000, -12254);
                }
            } else if (class163.field2535 == 190) {
                class482.field7367 = new int[class511.field7750.field5759];
                class418.field6024 = new boolean[class511.field7750.field5759];
                class329.field4938 = new String[class201.field3196.field6040];
                for (int var31 = 0; var31 < class511.field7750.field5759; var31++) {
                    if (class511.field7750.method2345(true, var31).field768 == 0) {
                        class418.field6024[var31] = true;
                        class444.field6857++;
                    }
                    class482.field7367[var31] = -1;
                }
                class261.method1585(true);
                class315.field4750 = class85.field1435.method2720("loginscreen", 1);
                class73.field1310.method2743(true, false, (byte) 56);
                class471.field7207.method2743(true, true, (byte) 56);
                class472.field7225.method2743(true, true, (byte) 56);
                class123.field2027.method2743(true, true, (byte) 56);
                class119.field1975.method2743(true, true, (byte) 56);
                class85.field1435.method2743(true, true, (byte) 56);
                class98.field1773 = true;
                class207.field3242.field7042 = 2;
                class237.field3590.field7042 = 2;
                class504.field7613.field7042 = 2;
                class409.field5934.field7042 = 2;
                class478.field7307.field7042 = 2;
                class315.field4751.field7042 = 2;
                class245.field3680.field7042 = 2;
                class423.method2477(false, -4, class463.field7116.field2946, -1, -1);
                class199.field3154 = class484.field7399.method2473(class406.field5898, -112);
                class163.field2535 = 200;
                class108.field1880 = 95;
            } else if (class163.field2535 == 200) {
                class41.method290(-19875, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V", line = 2271)
    private final void method1186(byte[] arg0, int arg1) {
        int var3 = 45 / ((arg1 - 80) / 46);
        field2998++;
        class40 var4 = new class40(arg0);
        while (true) {
            while (true) {
                while (true) {
                    int var5 = var4.method257((byte) 71);
                    if (var5 == 0) {
                        return;
                    }
                    if (var5 == 1) {
                        int[] var10 = class444.field6858 = new int[6];
                        var10[0] = var4.method254((byte) -79);
                        var10[1] = var4.method254((byte) -50);
                        var10[2] = var4.method254((byte) -60);
                        var10[3] = var4.method254((byte) -127);
                        var10[4] = var4.method254((byte) -111);
                        var10[5] = var4.method254((byte) -95);
                    } else if (var5 == 4) {
                        int var6 = var4.method257((byte) 50);
                        class327.field4909 = new int[var6];
                        for (int var7 = 0; var7 < var6; var7++) {
                            class327.field4909[var7] = var4.method254((byte) -30);
                            if (class327.field4909[var7] == 65535) {
                                class327.field4909[var7] = -1;
                            }
                        }
                    } else if (var5 == 5) {
                        int var8 = var4.method257((byte) 51);
                        class268.field4064 = new int[var8];
                        for (int var9 = 0; var9 < var8; var9++) {
                            class268.field4064[var9] = var4.method254((byte) -81);
                            if (class268.field4064[var9] == 65535) {
                                class268.field4064[var9] = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ltq;IIIIIIIII)V", line = 2355)
    public static final void method1187(class427[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class427 var11 = arg0[var10];
            if (var11 != null && var11.field6253 == arg1) {
                int var12 = var11.field6262 + arg6;
                int var13 = var11.field6259 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field6197 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field6175 + var12;
                    int var19 = var11.field6126 + var13;
                    if (var11.field6197 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field6197 == 0 || var11.field6156 || method1176(var11).field823 != 0 || class332.field4974 == var11 || class249.field3821 == var11.field6187) {
                    if (!method1190(var11)) {
                        if (class450.field6931 == var11) {
                            class291.field4410 = true;
                            class200.field3162 = var12;
                            class113.field1909 = var13;
                        }
                        if (var11.field6199 || var14 < var16 && var15 < var17) {
                            if (var11.field6131 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class298 var20 = (class298) class144.field2339.method8((byte) -98); var20 != null; var20 = (class298) class144.field2339.method17((byte) 73)) {
                                    if (var20.field4523) {
                                        var20.method1121(false);
                                        var20.field4517.field6289 = false;
                                    }
                                }
                                if (class362.field5343 == 0) {
                                    class450.field6931 = null;
                                    class332.field4974 = null;
                                }
                                class170.field2653 = 0;
                                class201.field3199 = false;
                                class100.field1812 = false;
                                if (!class381.field5555) {
                                    class134.method886(-1);
                                }
                            }
                            boolean var21;
                            if (class251.field3835.method1686(25478) >= var14 && class251.field3835.method1690(8) >= var15 && class251.field3835.method1686(25478) < var16 && class251.field3835.method1690(8) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class306.field4636 && var21) {
                                if (var11.field6227 >= 0) {
                                    field3001 = var11.field6227;
                                } else if (var11.field6131) {
                                    field3001 = -1;
                                }
                            }
                            if (!class381.field5555 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class31.method166(0, arg9 - var13, arg8 - var12, var11);
                            }
                            boolean var22 = false;
                            if (class251.field3835.method1689((byte) 121) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class112 var24 = (class112) class91.field1638.method8((byte) -98);
                            if (var24 != null && var24.method805(-4) == 0 && var24.method801(89) >= var14 && var24.method802(6) >= var15 && var24.method801(72) < var16 && var24.method802(6) < var17) {
                                var23 = true;
                            }
                            if (var11.field6256 != null) {
                                for (int var25 = 0; var25 < var11.field6256.length; var25++) {
                                    if (class308.field4662.method1650(var11.field6256[var25], 27365)) {
                                        if (var11.field6152 == null || class369.field5424 >= var11.field6152[var25]) {
                                            byte var26 = var11.field6168[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class308.field4662.method1650(86, 27365) && !class308.field4662.method1650(82, 27365) && !class308.field4662.method1650(81, 27365)) && ((var26 & 0x2) == 0 || class308.field4662.method1650(86, 27365)) && ((var26 & 0x1) == 0 || class308.field4662.method1650(82, 27365)) && ((var26 & 0x4) == 0 || class308.field4662.method1650(81, 27365))) {
                                                if (var25 < 10) {
                                                    class377.method2271(-1, var11.field6157, -76, "", var25 + 1);
                                                } else if (var25 == 10) {
                                                    class62.method432(false);
                                                    class54 var27 = method1176(var11);
                                                    class316.method1884((byte) 72, var27.field817, var11, var27.method376(1));
                                                    class28.field357 = class362.method2202(126, var11);
                                                    if (class28.field357 == null) {
                                                        class28.field357 = "Null";
                                                    }
                                                    class200.field3175 = var11.field6136 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field6280[var25];
                                                if (var11.field6152 == null) {
                                                    var11.field6152 = new int[var11.field6256.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field6152[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field6152[var25] = class369.field5424 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field6152 != null) {
                                        var11.field6152[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class429.method2523((byte) -44, var24.method801(-113) - var12, var11, var24.method802(6) - var13);
                            }
                            if (class450.field6931 != null && class450.field6931 != var11 && var21 && method1176(var11).method375(-102)) {
                                class294.field4458 = var11;
                            }
                            if (class332.field4974 == var11) {
                                class157.field2470 = true;
                                class348.field5133 = var12;
                                class410.field5942 = var13;
                            }
                            if (var11.field6156 || var11.field6187 != 0) {
                                if (var21 && class165.field2571 != 0 && var11.field6285 != null) {
                                    class298 var29 = new class298();
                                    var29.field4523 = true;
                                    var29.field4517 = var11;
                                    var29.field4519 = class165.field2571;
                                    var29.field4520 = var11.field6285;
                                    class144.field2339.method4(1, var29);
                                }
                                if (class450.field6931 != null || class381.field5555 || class282.field4276 != var11.field6187 && class170.field2653 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field6187 != 0) {
                                    if (class441.field6470 == var11.field6187 || class432.field6355 == var11.field6187) {
                                        class427.field6181 = var11;
                                        if (class96.field1741 != null) {
                                            class96.field1741.method286(class345.field5116, 0, var11.field6126);
                                        }
                                        if (class441.field6470 == var11.field6187) {
                                            if (!class381.field5555 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class324.method2021(class345.field5116, -24190, arg8, arg9);
                                                for (class486 var30 = (class486) class382.field5559.method1319(-126); var30 != null; var30 = (class486) class382.field5559.method1320((byte) -103)) {
                                                    if (arg8 >= var30.field7401 && arg8 < var30.field7405 && arg9 >= var30.field7409 && arg9 < var30.field7404) {
                                                        class134.method886(-1);
                                                        class347.method2119(10, var30.field7403);
                                                    }
                                                }
                                            }
                                            class396.method2356(var13, var12, true, var11);
                                            continue;
                                        }
                                    }
                                    if (class249.field3821 == var11.field6187) {
                                        if (var11.method2512(class345.field5116, (byte) -21) == null || class57.field975 != 0 && class57.field975 != 3 || class381.field5555 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field6287[var32];
                                        if (var31 < var33 || var31 > var11.field6159[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field6175 / 2;
                                        int var35 = var32 - var11.field6126 / 2;
                                        int var36;
                                        if (class408.field5928 == 4) {
                                            var36 = (int) class23.field289 & 0x3FFF;
                                        } else {
                                            var36 = (int) class23.field289 + class273.field4145 & 0x3FFF;
                                        }
                                        int var37 = class195.field3075[var36];
                                        int var38 = class195.field3077[var36];
                                        if (class408.field5928 != 4) {
                                            var37 = (class222.field3427 + 256) * var37 >> 8;
                                            var38 = (class222.field3427 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class408.field5928 == 4) {
                                            var41 = (class158.field2488 >> 7) + (var39 >> 2);
                                            var42 = (class493.field7515 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class286.field4329.method337(0) - 1) * 64;
                                            var41 = (class286.field4329.field3218 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class286.field4329.field3222 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class306.field4636 && (class331.field4966 & 0x40) != 0) {
                                            class427 var44 = class59.method419(class142.field2311, 12782, class357.field5298);
                                            if (var44 == null) {
                                                class62.method432(false);
                                            } else {
                                                class221.method1345(" ->", 20, var42, var41, class217.field3347, true, class28.field357, var11.field6274, (byte) -121, 1L, false);
                                            }
                                            continue;
                                        }
                                        if (class64.field1064 == class298.field4512) {
                                            class221.method1345("", 11, var42, var41, -1, true, class156.field2463.method2473(class406.field5898, -85), -1, (byte) -121, 1L, false);
                                        }
                                        class221.method1345("", 13, var42, var41, class97.field1744, true, class14.field196, -1, (byte) -121, 1L, false);
                                        continue;
                                    }
                                    if (class282.field4276 == var11.field6187) {
                                        class450.field6928 = var11;
                                        if (var21) {
                                            class201.field3199 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method801(-94) - var12 - var11.field6175 / 2) * 2.0D / (double) class492.field7480);
                                            int var46 = (int) (-((double) (var24.method802(6) - var13 - var11.field6126 / 2) * 2.0D / (double) class492.field7480));
                                            int var47 = class466.field7158 + var45 + class492.field7497;
                                            int var48 = class264.field3989 + var46 + class492.field7494;
                                            class72 var49 = class407.method2408((byte) -127);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method535(1, var50, var48, var47);
                                            if (var50 != null) {
                                                if (class308.field4662.method1650(82, 27365) && class193.field3052 > 0) {
                                                    method1170(var50[1], -105, var50[2], var50[0]);
                                                    continue;
                                                }
                                                class100.field1812 = true;
                                                class506.field7636 = var50[0];
                                                class59.field1008 = var50[1];
                                                class246.field3758 = var50[2];
                                            }
                                            class170.field2653 = 1;
                                            class295.field4488 = false;
                                            class446.field6867 = class251.field3835.method1686(25478);
                                            class123.field2031 = class251.field3835.method1690(8);
                                            continue;
                                        }
                                        if (var22 && class170.field2653 > 0) {
                                            if (class170.field2653 == 1 && (class446.field6867 != class251.field3835.method1686(25478) || class123.field2031 != class251.field3835.method1690(8))) {
                                                class312.field4702 = class466.field7158;
                                                class233.field3548 = class264.field3989;
                                                class170.field2653 = 2;
                                            }
                                            if (class170.field2653 == 2) {
                                                class295.field4488 = true;
                                                class503.method3012((byte) -100, class312.field4702 + (int) ((double) (class446.field6867 - class251.field3835.method1686(25478)) * 2.0D / (double) class492.field7478));
                                                class341.method2103(true, class233.field3548 - (int) ((double) (class123.field2031 - class251.field3835.method1690(8)) * 2.0D / (double) class492.field7478));
                                            }
                                            continue;
                                        }
                                        if (class170.field2653 > 0 && !class295.field4488) {
                                            if ((class343.field5109 == 1 || class51.method357(23951)) && class330.field4948 > 2) {
                                                class511.method3055(class123.field2031, class446.field6867, (byte) -128);
                                            } else if (class232.method1392(-71)) {
                                                class511.method3055(class123.field2031, class446.field6867, (byte) -128);
                                            }
                                        }
                                        class170.field2653 = 0;
                                        continue;
                                    }
                                    if (class17.field238 == var11.field6187) {
                                        if (var22) {
                                            class274.method1670(class251.field3835.method1686(25478) - var12, var11.field6175, class251.field3835.method1690(8) - var13, var11.field6126, -126);
                                        }
                                        continue;
                                    }
                                    if (class317.field4777 == var11.field6187) {
                                        class294.method1786(var13, var12, 113, var11);
                                        continue;
                                    }
                                }
                                if (!var11.field6286 && var23) {
                                    var11.field6286 = true;
                                    if (var11.field6173 != null) {
                                        class298 var51 = new class298();
                                        var51.field4523 = true;
                                        var51.field4517 = var11;
                                        var51.field4527 = var24.method801(-119) - var12;
                                        var51.field4519 = var24.method802(6) - var13;
                                        var51.field4520 = var11.field6173;
                                        class144.field2339.method4(1, var51);
                                    }
                                }
                                if (var11.field6286 && var22 && var11.field6252 != null) {
                                    class298 var52 = new class298();
                                    var52.field4523 = true;
                                    var52.field4517 = var11;
                                    var52.field4527 = class251.field3835.method1686(25478) - var12;
                                    var52.field4519 = class251.field3835.method1690(8) - var13;
                                    var52.field4520 = var11.field6252;
                                    class144.field2339.method4(1, var52);
                                }
                                if (var11.field6286 && !var22) {
                                    var11.field6286 = false;
                                    if (var11.field6238 != null) {
                                        class298 var53 = new class298();
                                        var53.field4523 = true;
                                        var53.field4517 = var11;
                                        var53.field4527 = class251.field3835.method1686(25478) - var12;
                                        var53.field4519 = class251.field3835.method1690(8) - var13;
                                        var53.field4520 = var11.field6238;
                                        class114.field1927.method4(1, var53);
                                    }
                                }
                                if (var22 && var11.field6224 != null) {
                                    class298 var54 = new class298();
                                    var54.field4523 = true;
                                    var54.field4517 = var11;
                                    var54.field4527 = class251.field3835.method1686(25478) - var12;
                                    var54.field4519 = class251.field3835.method1690(8) - var13;
                                    var54.field4520 = var11.field6224;
                                    class144.field2339.method4(1, var54);
                                }
                                if (!var11.field6289 && var21) {
                                    var11.field6289 = true;
                                    if (var11.field6273 != null) {
                                        class298 var55 = new class298();
                                        var55.field4523 = true;
                                        var55.field4517 = var11;
                                        var55.field4527 = class251.field3835.method1686(25478) - var12;
                                        var55.field4519 = class251.field3835.method1690(8) - var13;
                                        var55.field4520 = var11.field6273;
                                        class144.field2339.method4(1, var55);
                                    }
                                }
                                if (var11.field6289 && var21 && var11.field6208 != null) {
                                    class298 var56 = new class298();
                                    var56.field4523 = true;
                                    var56.field4517 = var11;
                                    var56.field4527 = class251.field3835.method1686(25478) - var12;
                                    var56.field4519 = class251.field3835.method1690(8) - var13;
                                    var56.field4520 = var11.field6208;
                                    class144.field2339.method4(1, var56);
                                }
                                if (var11.field6289 && !var21) {
                                    var11.field6289 = false;
                                    if (var11.field6137 != null) {
                                        class298 var57 = new class298();
                                        var57.field4523 = true;
                                        var57.field4517 = var11;
                                        var57.field4527 = class251.field3835.method1686(25478) - var12;
                                        var57.field4519 = class251.field3835.method1690(8) - var13;
                                        var57.field4520 = var11.field6137;
                                        class114.field1927.method4(1, var57);
                                    }
                                }
                                if (var11.field6139 != null) {
                                    class298 var58 = new class298();
                                    var58.field4517 = var11;
                                    var58.field4520 = var11.field6139;
                                    class220.field3397.method4(1, var58);
                                }
                                if (var11.field6190 != null && class273.field4148 > var11.field6155) {
                                    if (var11.field6209 == null || class273.field4148 - var11.field6155 > 32) {
                                        class298 var63 = new class298();
                                        var63.field4517 = var11;
                                        var63.field4520 = var11.field6190;
                                        class144.field2339.method4(1, var63);
                                    } else {
                                        label691: for (int var59 = var11.field6155; var59 < class273.field4148; var59++) {
                                            int var60 = class9.field122[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field6209.length; var61++) {
                                                if (var11.field6209[var61] == var60) {
                                                    class298 var62 = new class298();
                                                    var62.field4517 = var11;
                                                    var62.field4520 = var11.field6190;
                                                    class144.field2339.method4(1, var62);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6155 = class273.field4148;
                                }
                                if (var11.field6241 != null && class450.field6926 > var11.field6282) {
                                    if (var11.field6132 == null || class450.field6926 - var11.field6282 > 32) {
                                        class298 var68 = new class298();
                                        var68.field4517 = var11;
                                        var68.field4520 = var11.field6241;
                                        class144.field2339.method4(1, var68);
                                    } else {
                                        label667: for (int var64 = var11.field6282; var64 < class450.field6926; var64++) {
                                            int var65 = class411.field5965[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field6132.length; var66++) {
                                                if (var11.field6132[var66] == var65) {
                                                    class298 var67 = new class298();
                                                    var67.field4517 = var11;
                                                    var67.field4520 = var11.field6241;
                                                    class144.field2339.method4(1, var67);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6282 = class450.field6926;
                                }
                                if (var11.field6270 != null && class292.field4455 > var11.field6271) {
                                    if (var11.field6189 == null || class292.field4455 - var11.field6271 > 32) {
                                        class298 var73 = new class298();
                                        var73.field4517 = var11;
                                        var73.field4520 = var11.field6270;
                                        class144.field2339.method4(1, var73);
                                    } else {
                                        label643: for (int var69 = var11.field6271; var69 < class292.field4455; var69++) {
                                            int var70 = class91.field1640[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field6189.length; var71++) {
                                                if (var11.field6189[var71] == var70) {
                                                    class298 var72 = new class298();
                                                    var72.field4517 = var11;
                                                    var72.field4520 = var11.field6270;
                                                    class144.field2339.method4(1, var72);
                                                    break label643;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6271 = class292.field4455;
                                }
                                if (var11.field6251 != null && class197.field3101 > var11.field6146) {
                                    if (var11.field6210 == null || class197.field3101 - var11.field6146 > 32) {
                                        class298 var78 = new class298();
                                        var78.field4517 = var11;
                                        var78.field4520 = var11.field6251;
                                        class144.field2339.method4(1, var78);
                                    } else {
                                        label619: for (int var74 = var11.field6146; var74 < class197.field3101; var74++) {
                                            int var75 = class441.field6477[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field6210.length; var76++) {
                                                if (var11.field6210[var76] == var75) {
                                                    class298 var77 = new class298();
                                                    var77.field4517 = var11;
                                                    var77.field4520 = var11.field6251;
                                                    class144.field2339.method4(1, var77);
                                                    break label619;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6146 = class197.field3101;
                                }
                                if (var11.field6233 != null && class217.field3340 > var11.field6163) {
                                    if (var11.field6182 == null || class217.field3340 - var11.field6163 > 32) {
                                        class298 var83 = new class298();
                                        var83.field4517 = var11;
                                        var83.field4520 = var11.field6233;
                                        class144.field2339.method4(1, var83);
                                    } else {
                                        label595: for (int var79 = var11.field6163; var79 < class217.field3340; var79++) {
                                            int var80 = class493.field7511[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field6182.length; var81++) {
                                                if (var11.field6182[var81] == var80) {
                                                    class298 var82 = new class298();
                                                    var82.field4517 = var11;
                                                    var82.field4520 = var11.field6233;
                                                    class144.field2339.method4(1, var82);
                                                    break label595;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6163 = class217.field3340;
                                }
                                if (class108.field1885 > var11.field6237 && var11.field6172 != null) {
                                    class298 var84 = new class298();
                                    var84.field4517 = var11;
                                    var84.field4520 = var11.field6172;
                                    class144.field2339.method4(1, var84);
                                }
                                if (class153.field2448 > var11.field6237 && var11.field6174 != null) {
                                    class298 var85 = new class298();
                                    var85.field4517 = var11;
                                    var85.field4520 = var11.field6174;
                                    class144.field2339.method4(1, var85);
                                }
                                if (class267.field4036 > var11.field6237 && var11.field6196 != null) {
                                    class298 var86 = new class298();
                                    var86.field4517 = var11;
                                    var86.field4520 = var11.field6196;
                                    class144.field2339.method4(1, var86);
                                }
                                if (class25.field332 > var11.field6237 && var11.field6272 != null) {
                                    class298 var87 = new class298();
                                    var87.field4517 = var11;
                                    var87.field4520 = var11.field6272;
                                    class144.field2339.method4(1, var87);
                                }
                                if (class27.field352 > var11.field6237 && var11.field6284 != null) {
                                    class298 var88 = new class298();
                                    var88.field4517 = var11;
                                    var88.field4520 = var11.field6284;
                                    class144.field2339.method4(1, var88);
                                }
                                var11.field6237 = class298.field4515;
                                if (var11.field6144 != null) {
                                    for (int var89 = 0; var89 < class170.field2650; var89++) {
                                        class298 var90 = new class298();
                                        var90.field4517 = var11;
                                        var90.field4518 = class304.field4624[var89].method1071(63);
                                        var90.field4526 = class304.field4624[var89].method1067(-1);
                                        var90.field4520 = var11.field6144;
                                        class144.field2339.method4(1, var90);
                                    }
                                }
                                if (class28.field354 && var11.field6222 != null) {
                                    class298 var91 = new class298();
                                    var91.field4517 = var11;
                                    var91.field4520 = var11.field6222;
                                    class144.field2339.method4(1, var91);
                                }
                            }
                            if (var11.field6197 == 5 && var11.field6127 != -1) {
                                var11.method2514((byte) -45, class466.field7155, class507.field7670).method286(class345.field5116, 0, var11.field6126);
                            }
                            class93.method690(6895, var11);
                            if (var11.field6197 == 0) {
                                method1187(arg0, var11.field6157, var14, var15, var16, var17, var12 - var11.field6277, var13 - var11.field6179, arg8, arg9);
                                if (var11.field6193 != null) {
                                    method1187(var11.field6193, var11.field6157, var14, var15, var16, var17, var12 - var11.field6277, var13 - var11.field6179, arg8, arg9);
                                }
                                class394 var92 = (class394) class245.field3741.method2409(false, (long) var11.field6157);
                                if (var92 != null) {
                                    if (class329.field4936 == class298.field4512 && var92.field5753 == 0 && !class381.field5555 && var21 && !class483.field7373) {
                                        class134.method886(-1);
                                    }
                                    class102.method758(var12, arg9, var92.field5750, var13, var15, var16, false, var17, var14, arg8);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class93.method690(6895, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lut;B)V", line = 3259)
    public static final void method1188(class76 arg0, byte arg1) {
        field2988++;
        if (class321.field4830 == null) {
            return;
        }
        class185 var2 = null;
        if (arg0.field1356 == 0) {
            var2 = (class185) class307.method1842(arg0.field1355, arg0.field1367, arg0.field1359);
        }
        if (arg1 < 120) {
            method1179();
        }
        if (arg0.field1356 == 1) {
            var2 = (class185) class98.method741(arg0.field1355, arg0.field1367, arg0.field1359);
        }
        if (arg0.field1356 == 2) {
            var2 = (class185) class86.method607(arg0.field1355, arg0.field1367, arg0.field1359, field3007 == null ? (field3007 = method1193("tf")) : field3007);
        }
        if (arg0.field1356 == 3) {
            var2 = (class185) class368.method2232(arg0.field1355, arg0.field1367, arg0.field1359);
        }
        if (var2 == null) {
            arg0.field1357 = -1;
            arg0.field1362 = 0;
            arg0.field1368 = 0;
        } else {
            arg0.field1357 = var2.method174((byte) 120);
            arg0.field1368 = var2.method170(true);
            arg0.field1362 = var2.method173(1438);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3305)
    public static final void method1189() {
        for (int var0 = 0; var0 < class150.field2422; var0++) {
            int[] var1 = class368.field5403[var0];
            for (int var2 = 0; var2 < class21.field272; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 3324)
    public final void init() {
        field3003++;
        if (!this.method1775((byte) 74)) {
            return;
        }
        class322.field4836 = Integer.parseInt(this.getParameter("worldid"));
        class230.field3507 = class214.method1315(0, Integer.parseInt(this.getParameter("modewhere")));
        if (!class115.method823(58, class230.field3507) && class77.field1378 != class230.field3507) {
            class230.field3507 = class77.field1378;
        }
        class295.field4485 = class37.method207(-94, Integer.parseInt(this.getParameter("modewhat")));
        if (class295.field4485 != class169.field2626 && class295.field4485 != class286.field4343 && class295.field4485 != class147.field2379) {
            class295.field4485 = class147.field2379;
        }
        try {
            class406.field5898 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var8) {
            class406.field5898 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class264.field3986 = true;
        } else {
            class264.field3986 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class112.field1907 = true;
        } else {
            class112.field1907 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class22.field282 = true;
        } else {
            class22.field282 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class298.field4512 = class64.field1064;
        } else {
            class298.field4512 = class329.field4936;
        }
        try {
            class90.field1620 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var7) {
            class90.field1620 = 0;
        }
        class413.field5986 = this.getParameter("quiturl");
        class138.field2274 = this.getParameter("settings");
        if (class138.field2274 == null) {
            class138.field2274 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class111.field1903 = Integer.parseInt(var5);
            } catch (Exception var6) {
                class111.field1903 = 0;
            }
        }
        class63.field1047 = Integer.parseInt(this.getParameter("colourid"));
        if (class63.field1047 < 0 || class63.field1047 >= class208.field3259.length) {
            class63.field1047 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class51.field778 = true;
            class137.field2256 = true;
        }
        class6.field75 = this;
        if (class329.field4936 == class298.field4512) {
            class7.field83 = 503;
            class415.field6013 = 765;
        } else if (class64.field1064 == class298.field4512) {
            class7.field83 = 480;
            class415.field6013 = 640;
        }
        this.method1772(class295.field4485.method2452(25351) + 32, (byte) -106, class7.field83, class415.field6013, 581);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Ltq;)Z", line = 3420)
    public static final boolean method1190(class427 arg0) {
        if (class483.field7373) {
            if (method1176(arg0).field823 != 0) {
                return false;
            }
            if (arg0.field6197 == 0) {
                return false;
            }
        }
        return arg0.field6141;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 3437)
    public static final void method1191(int arg0) {
        int var1 = class328.field4921;
        int[] var2 = class280.field4247;
        for (int var3 = 0; var3 < class352.field5175 + var1; var3++) {
            class135 var4;
            if (var3 < var1) {
                var4 = class224.field3450[var2[var3]];
            } else {
                var4 = class195.field3085[class437.field6440[var3 - var1]];
            }
            if (var4.field3217 == arg0 && var4.field2151 >= 0) {
                int var5 = var4.method337(0);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field3218 & 0x7F) != 0 || (var4.field3222 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field3218 & 0x7F) != 64 || (var4.field3222 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field3218 >> 7;
                    int var7 = var4.field3222 >> 7;
                    if (var4.field2151 > class368.field5403[var6][var7]) {
                        class368.field5403[var6][var7] = var4.field2151;
                        class218.field3348[var6][var7] = 1;
                    } else if (class368.field5403[var6][var7] == var4.field2151) {
                        var10002 = class218.field3348[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field3218 - var8 >> 7;
                    int var10 = var4.field3222 - var8 >> 7;
                    int var11 = var4.field3218 + var8 >> 7;
                    int var12 = var4.field3222 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field2151 > class368.field5403[var13][var14]) {
                                class368.field5403[var13][var14] = var4.field2151;
                                class218.field3348[var13][var14] = 1;
                            } else if (class368.field5403[var13][var14] == var4.field2151) {
                                var10002 = class218.field3348[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 3535)
    public static final void method1192(int arg0) {
        int var1 = class328.field4921;
        int[] var2 = class280.field4247;
        int var3 = class97.field1748 ? var1 : class352.field5175 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class135 var5;
            if (var4 < var1) {
                var5 = class224.field3450[var2[var4]];
            } else {
                var5 = class195.field3085[class437.field6440[var4 - var1]];
            }
            if (var5.field3217 == arg0) {
                var5.field2145 = 0;
                if (var5.field2151 < 0) {
                    var5.field2177 = false;
                } else {
                    int var6 = var5.method337(0);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field3218 & 0x7F) != 0 || (var5.field3222 & 0x7F) != 0) {
                            var5.field2177 = false;
                            continue;
                        }
                    } else if ((var5.field3218 & 0x7F) != 64 || (var5.field3222 & 0x7F) != 64) {
                        var5.field2177 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field3218 >> 7;
                        int var8 = var5.field3222 >> 7;
                        if (class368.field5403[var7][var8] != var5.field2151) {
                            var5.field2177 = true;
                            continue;
                        }
                        if (class218.field3348[var7][var8] > 1) {
                            var10002 = class218.field3348[var7][var8]--;
                            var5.field2177 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field3218 - var9 >> 7;
                        int var11 = var5.field3222 - var9 >> 7;
                        int var12 = var5.field3218 + var9 >> 7;
                        int var13 = var5.field3222 + var9 >> 7;
                        if (!class418.method2447(var5.field2151, var11, var13, (byte) 1, var10, var12)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class368.field5403[var14][var15] == var5.field2151) {
                                        var10002 = class218.field3348[var14][var15]--;
                                    }
                                }
                            }
                            var5.field2177 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class47 && var5.field2236 != null && class369.field5424 >= var5.field2236.field2301 && class369.field5424 < var5.field2236.field2302) {
                        ((class47) var5).field704 = false;
                    }
                    var5.field2177 = false;
                    var5.field3214 = class7.method38(var5.field3218, var5.field3217, var5.field3222, (byte) -54);
                    class408.method2418(var5, true);
                }
            }
        }
    }
}
