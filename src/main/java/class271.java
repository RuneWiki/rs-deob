import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class271 extends class93 {

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    private int field4033 = 0;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "Lik;")
    private class17 field4034 = new class17(16);

    @OriginalMember(owner = "client!hn", name = "R", descriptor = "I")
    private int field4068 = 0;

    @OriginalMember(owner = "client!hn", name = "Q", descriptor = "Lhi;")
    private class192 field4067 = new class192();

    @OriginalMember(owner = "client!hn", name = "W", descriptor = "J")
    private long field4073 = 0L;

    @OriginalMember(owner = "client!hn", name = "F", descriptor = "Lng;")
    private class330 field4056;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    private int field4031;

    @OriginalMember(owner = "client!hn", name = "U", descriptor = "Z")
    private boolean field4071;

    @OriginalMember(owner = "client!hn", name = "T", descriptor = "Lhi;")
    private class192 field4070;

    @OriginalMember(owner = "client!hn", name = "G", descriptor = "Lng;")
    private class330 field4057;

    @OriginalMember(owner = "client!hn", name = "v", descriptor = "I")
    private int field4046;

    @OriginalMember(owner = "client!hn", name = "V", descriptor = "Z")
    private boolean field4072;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "Lpk;")
    private class25 field4042;

    @OriginalMember(owner = "client!hn", name = "J", descriptor = "Lue;")
    private class13 field4060;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    private int field4038;

    @OriginalMember(owner = "client!hn", name = "u", descriptor = "Lkd;")
    private class11 field4045;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "Lmf;")
    public static class166 field4041 = new class166(0, 0);

    @OriginalMember(owner = "client!hn", name = "A", descriptor = "I")
    public static int field4051 = -1;

    @OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
    public static int field4052 = 10;

    @OriginalMember(owner = "client!hn", name = "O", descriptor = "Ljava/lang/String;")
    public static String field4065 = "Checking for updates - ";

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!hn", name = "t", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!hn", name = "w", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!hn", name = "y", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!hn", name = "D", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!hn", name = "E", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!hn", name = "H", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!hn", name = "I", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!hn", name = "K", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!hn", name = "L", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!hn", name = "M", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!hn", name = "N", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!hn", name = "P", descriptor = "Lki;")
    private class160 field4066;

    @OriginalMember(owner = "client!hn", name = "x", descriptor = "Z")
    public static boolean field4048;

    @OriginalMember(owner = "client!hn", name = "S", descriptor = "Z")
    private boolean field4069;

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "[B")
    private byte[] field4043;

    @OriginalMember(owner = "client!hn", name = "C", descriptor = "[[[B")
    public static byte[][][] field4053;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)Lkd;", line = 7)
    private final class11 method1864(int arg0, int arg1, int arg2) {
        class11 var4 = (class11) this.field4034.method111(-118, (long) arg0);
        field4063++;
        if (var4 != null && arg2 == 0 && !var4.field120 && var4.field115) {
            var4.method1274((byte) -26);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field4056 == null || this.field4043[arg0] == -1) {
                    if (this.field4060.method80(-17907)) {
                        return null;
                    }
                    var4 = this.field4060.method77(arg0, (byte) 2, false, this.field4031, true);
                } else {
                    var4 = this.field4042.method151(this.field4056, 24628, arg0);
                }
            } else if (arg2 == 1) {
                if (this.field4056 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field4042.method148(arg0, (byte) 69, this.field4056);
            } else if (arg2 == 2) {
                if (this.field4056 == null) {
                    throw new RuntimeException();
                }
                if (this.field4043[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4060.method82(true)) {
                    return null;
                }
                var4 = this.field4060.method77(arg0, (byte) 2, false, this.field4031, false);
            } else {
                throw new RuntimeException();
            }
            this.field4034.method120((long) arg0, var4, -22851);
        }
        int var5 = -127 / ((arg1 + 73) / 53);
        if (var4.field115) {
            return null;
        }
        byte[] var6 = var4.method66((byte) -115);
        if (!var4 instanceof class79) {
            try {
                if (var6 == null || var6.length <= 2) {
                    throw new RuntimeException();
                }
                class8.field78.reset();
                class8.field78.update(var6, 0, var6.length - 2);
                int var7 = (int) class8.field78.getValue();
                if (this.field4066.field2187[arg0] != var7) {
                    throw new RuntimeException();
                }
                this.field4060.field158 = 0;
                this.field4060.field159 = 0;
            } catch (RuntimeException var15) {
                this.field4060.method78(true);
                var4.method1274((byte) -26);
                if (var4.field120 && !this.field4060.method80(-17907)) {
                    class59 var9 = this.field4060.method77(arg0, (byte) 2, false, this.field4031, true);
                    this.field4034.method120((long) arg0, var9, -22851);
                }
                return null;
            }
            var6[var6.length - 2] = (byte) (this.field4066.field2198[arg0] >>> 8);
            var6[var6.length - 1] = (byte) this.field4066.field2198[arg0];
            if (this.field4056 != null) {
                this.field4042.method150(this.field4056, arg0, (byte) 16, var6);
                if (this.field4043[arg0] != 1) {
                    this.field4033++;
                    this.field4043[arg0] = 1;
                }
            }
            if (!var4.field120) {
                var4.method1274((byte) -26);
            }
            return var4;
        }
        try {
            if (var6 == null || var6.length <= 2) {
                throw new RuntimeException();
            }
            class8.field78.reset();
            class8.field78.update(var6, 0, var6.length - 2);
            int var10 = (int) class8.field78.getValue();
            if (this.field4066.field2187[arg0] != var10) {
                throw new RuntimeException();
            }
            int var11 = (var6[var6.length - 2] & 0xFF << 8) + (var6[var6.length - 1] & 0xFF);
            if ((this.field4066.field2198[arg0] & 0xFFFF) != var11) {
                throw new RuntimeException();
            }
            if (this.field4043[arg0] != 1) {
                if (this.field4043[arg0] != 0) {
                }
                this.field4033++;
                this.field4043[arg0] = 1;
            }
            if (!var4.field120) {
                var4.method1274((byte) -26);
            }
            return var4;
        } catch (Exception var14) {
            this.field4043[arg0] = -1;
            var4.method1274((byte) -26);
            if (var4.field120 && !this.field4060.method80(-17907)) {
                class59 var13 = this.field4060.method77(arg0, (byte) 2, false, this.field4031, true);
                this.field4034.method120((long) arg0, var13, -22851);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(ILng;Lng;Lue;Lpk;IIZ)V", line = 1121)
    public class271(int arg0, class330 arg1, class330 arg2, class13 arg3, class25 arg4, int arg5, int arg6, boolean arg7) {
        this.field4056 = arg1;
        this.field4031 = arg0;
        if (this.field4056 == null) {
            this.field4071 = false;
        } else {
            this.field4071 = true;
            this.field4070 = new class192();
        }
        this.field4057 = arg2;
        this.field4046 = arg5;
        this.field4072 = arg7;
        this.field4042 = arg4;
        this.field4060 = arg3;
        this.field4038 = arg6;
        if (this.field4057 != null) {
            this.field4045 = this.field4042.method151(this.field4057, 24628, this.field4031);
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)Z", line = 224)
    public static final boolean method1865(byte arg0) {
        field4064++;
        if (arg0 <= 10) {
            method1877(-75, 30, 41, 119, -123, -95, 76);
        }
        try {
            return class72.method539((byte) -94);
        } catch (IOException var5) {
            class11.method65((byte) -21);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class159.field2179 + "," + class326.field4931 + "," + class199.field2843 + " - " + class199.field2833 + "," + (class173.field2356.field3706[0] + class132.field1809) + "," + (class173.field2356.field3768[0] + class296.field4394) + " - ";
            for (int var4 = 0; var4 < class199.field2833 && var4 < 50; var4++) {
                var3 = var3 + class157.field2165.field4798[var4] + ",";
            }
            class187.method1307(var3, var6, 108);
            class37.method209(-100);
            return true;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V", line = 254)
    public final void method1866(boolean arg0) {
        if (arg0) {
            field4052 = -125;
        }
        field4050++;
        if (this.field4070 == null || this.method696((byte) -106) == null) {
            return;
        }
        for (class183 var2 = this.field4067.method1335(1); var2 != null; var2 = this.field4067.method1336(3)) {
            int var3 = (int) var2.field2522;
            if (var3 < 0 || this.field4066.field2195 <= var3 || this.field4066.field2200[var3] == 0) {
                var2.method1274((byte) -26);
            } else {
                if (this.field4043[var3] == 0) {
                    this.method1864(var3, 57, 1);
                }
                if (this.field4043[var3] == -1) {
                    this.method1864(var3, -127, 2);
                }
                if (this.field4043[var3] == 1) {
                    var2.method1274((byte) -26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(BI)V", line = 303)
    public final void method701(byte arg0, int arg1) {
        field4039++;
        if (this.field4056 == null) {
            return;
        }
        for (class183 var3 = this.field4067.method1335(1); var3 != null; var3 = this.field4067.method1336(3)) {
            if ((long) arg1 == var3.field2522) {
                return;
            }
        }
        class183 var4 = new class183();
        var4.field2522 = (long) arg1;
        if (arg0 >= -70) {
            method1872(125, true, -53);
        }
        this.field4067.method1339((byte) 123, var4);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)Lnk;", line = 334)
    public static final class26 method1867(int arg0, int arg1) {
        field4044++;
        class26 var2 = (class26) class101.field1392.method365((long) arg0, 35);
        if (var2 != null) {
            return var2;
        }
        int var3 = 88 / ((arg1 - 27) / 60);
        byte[] var4 = class287.field4267.method955(5, arg0, -21853);
        class26 var5 = new class26();
        if (var4 != null) {
            var5.method152(-82, new class316(var4));
        }
        class101.field1392.method369(0, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)I", line = 362)
    public final int method1868(int arg0) {
        if (arg0 != 8984) {
            this.method1871(124);
        }
        field4049++;
        return this.field4066 == null ? 0 : this.field4066.field2192;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BI)I", line = 394)
    public final int method698(byte arg0, int arg1) {
        if (arg0 != -12) {
            this.method1871(-14);
        }
        field4061++;
        class11 var3 = (class11) this.field4034.method111(arg0 ^ 0xFFFFFFD1, (long) arg1);
        return var3 == null ? 0 : var3.method64((byte) -73);
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(B)V", line = 414)
    public final void method1869(byte arg0) {
        field4035++;
        if (arg0 != -122) {
            this.field4034 = (class17) null;
        }
        if (this.field4070 != null) {
            if (this.method696((byte) -106) == null) {
                return;
            }
            if (this.field4071) {
                boolean var6 = true;
                for (class183 var7 = this.field4070.method1335(1); var7 != null; var7 = this.field4070.method1336(3)) {
                    int var8 = (int) var7.field2522;
                    if (this.field4043[var8] == 0) {
                        this.method1864(var8, -8, 1);
                    }
                    if (this.field4043[var8] == 0) {
                        var6 = false;
                    } else {
                        var7.method1274((byte) -26);
                    }
                }
                while (this.field4066.field2200.length > this.field4068) {
                    if (this.field4066.field2200[this.field4068] == 0) {
                        this.field4068++;
                    } else {
                        if (this.field4042.field323 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field4043[this.field4068] == 0) {
                            this.method1864(this.field4068, -128, 1);
                        }
                        if (this.field4043[this.field4068] == 0) {
                            class183 var9 = new class183();
                            var9.field2522 = (long) this.field4068;
                            this.field4070.method1339((byte) 43, var9);
                            var6 = false;
                        }
                        this.field4068++;
                    }
                }
                if (var6) {
                    this.field4071 = false;
                    this.field4068 = 0;
                }
            } else if (this.field4069) {
                boolean var2 = true;
                for (class183 var3 = this.field4070.method1335(1); var3 != null; var3 = this.field4070.method1336(arg0 ^ 0xFFFFFF85)) {
                    int var4 = (int) var3.field2522;
                    if (this.field4043[var4] != 1) {
                        this.method1864(var4, -128, 2);
                    }
                    if (this.field4043[var4] == 1) {
                        var3.method1274((byte) -26);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field4068 < this.field4066.field2200.length) {
                    if (this.field4066.field2200[this.field4068] == 0) {
                        this.field4068++;
                    } else {
                        if (this.field4060.method82(true)) {
                            var2 = false;
                            break;
                        }
                        if (this.field4043[this.field4068] != 1) {
                            this.method1864(this.field4068, 28, 2);
                        }
                        if (this.field4043[this.field4068] != 1) {
                            var2 = false;
                            class183 var5 = new class183();
                            var5.field2522 = (long) this.field4068;
                            this.field4070.method1339((byte) 14, var5);
                        }
                        this.field4068++;
                    }
                }
                if (var2) {
                    this.field4069 = false;
                    this.field4068 = 0;
                }
            } else {
                this.field4070 = null;
            }
        }
        if (!this.field4072 || class29.method174(27763) < this.field4073) {
            return;
        }
        for (class11 var10 = (class11) this.field4034.method110(arg0 + 122); var10 != null; var10 = (class11) this.field4034.method115(0)) {
            if (!var10.field115) {
                if (var10.field118) {
                    if (!var10.field120) {
                        throw new RuntimeException();
                    }
                    var10.method1274((byte) -26);
                } else {
                    var10.field118 = true;
                }
            }
        }
        this.field4073 = class29.method174(27763) + 1000L;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)I", line = 596)
    public final int method1870(int arg0) {
        if (arg0 != 255) {
            this.method1868(17);
        }
        field4062++;
        return this.field4033;
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V", line = 607)
    public final void method1871(int arg0) {
        field4058++;
        if (this.field4056 != null && arg0 == -13395) {
            this.field4069 = true;
            if (this.field4070 == null) {
                this.field4070 = new class192();
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZI)I", line = 625)
    public static final int method1872(int arg0, boolean arg1, int arg2) {
        field4036++;
        if (arg1) {
            return 65;
        }
        int var3 = 0;
        while (arg0 > 0) {
            var3 = arg2 & 0x1 | var3 << 1;
            arg0--;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)I", line = 651)
    public final int method1873(int arg0) {
        field4030++;
        if (arg0 != 100) {
            method1872(-57, true, -87);
        }
        if (this.method696((byte) -106) == null) {
            return this.field4045 == null ? 0 : this.field4045.method64((byte) -73);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "(I)I", line = 671)
    public final int method1874(int arg0) {
        field4047++;
        if (this.field4066 == null) {
            return 0;
        } else if (this.field4071) {
            class183 var2 = this.field4070.method1335(1);
            if (arg0 != 0) {
                this.field4068 = -1;
            }
            return var2 == null ? 0 : (int) var2.field2522;
        } else {
            return this.field4066.field2192;
        }
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(B)V", line = 696)
    public static final void method1875(byte arg0) {
        field4055++;
        class103.method757(class96.field1297, false);
        if (arg0 < 34) {
            field4048 = false;
        }
        int var1 = (class275.field4123 >> 10) + (class296.field4394 >> 3);
        byte var2 = 0;
        int var3 = (class198.field2820 >> 10) + (class132.field1809 >> 3);
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class11.field119 = new int[var6];
        class231.field3270 = new byte[var6][];
        class47.field589 = new int[var6][4];
        class256.field3702 = new int[var6];
        class41.field468 = new byte[var6][];
        class66.field867 = new int[var6];
        class37.field425 = new byte[var6][];
        class266.field3883 = new byte[var6][];
        class203.field2905 = new int[var6];
        class202.field2866 = new int[var6];
        class71.field964 = new byte[var6][];
        class7.field58 = new int[var6];
        int var7 = 0;
        for (int var8 = (var3 - 6) / 8; var8 <= (var3 + 6) / 8; var8++) {
            for (int var9 = (var1 - 6) / 8; var9 <= ((var1 + 6) / 8); var9++) {
                int var10 = (var8 << 8) + var9;
                class256.field3702[var7] = var10;
                class11.field119[var7] = class92.field1281.method964(102, "m" + var8 + "_" + var9);
                class202.field2866[var7] = class92.field1281.method964(81, "l" + var8 + "_" + var9);
                class7.field58[var7] = class92.field1281.method964(35, "n" + var8 + "_" + var9);
                class203.field2905[var7] = class92.field1281.method964(52, "um" + var8 + "_" + var9);
                class66.field867[var7] = class92.field1281.method964(78, "ul" + var8 + "_" + var9);
                if (class7.field58[var7] == -1) {
                    class11.field119[var7] = -1;
                    class202.field2866[var7] = -1;
                    class203.field2905[var7] = -1;
                    class66.field867[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class7.field58.length; var11++) {
            class7.field58[var11] = -1;
            class11.field119[var11] = -1;
            class202.field2866[var11] = -1;
            class203.field2905[var11] = -1;
            class66.field867[var11] = -1;
        }
        class85.method661(var3, 13184, true, false, var5, var2, var4, var1);
    }

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "(I)V", line = 781)
    public static void method1876(int arg0) {
        int var1 = 78 % ((arg0 - 90) / 34);
        field4041 = null;
        field4053 = (byte[][][]) null;
        field4065 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIIII)V", line = 798)
    public static final void method1877(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class197.method1394(124, arg3);
        field4054++;
        int var7 = 0;
        if (arg2 != -2) {
            return;
        }
        int var8 = arg3;
        int var9 = -arg3;
        int var10 = arg3 - arg4;
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = var10;
        int var12 = -var10;
        if (class101.field1397 <= arg6 && arg6 <= class44.field536) {
            int[] var13 = class126.field1723[arg6];
            int var14 = class185.method1299(arg0 - arg3, (byte) 122, class259.field3813, class206.field2952);
            int var15 = class185.method1299(arg0 + arg3, (byte) 124, class259.field3813, class206.field2952);
            int var16 = class185.method1299(arg0 - var10, (byte) 106, class259.field3813, class206.field2952);
            int var17 = class185.method1299(arg0 + var10, (byte) 112, class259.field3813, class206.field2952);
            class190.method1329(var13, var16, arg1, (byte) -103, var14);
            class190.method1329(var13, var17, arg5, (byte) -124, var16);
            class190.method1329(var13, var15, arg1, (byte) -95, var17);
        }
        int var18 = -1;
        int var19 = -1;
        while (var7 < var8) {
            var18 += 2;
            var12 += var18;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class301.field4441[var11] = var7;
                var12 -= var11 << 1;
            }
            var19 += 2;
            var7++;
            var9 += var19;
            if (var9 >= 0) {
                var8--;
                int var20 = arg6 - var8;
                int var21 = arg6 + var8;
                var9 -= var8 << 1;
                if (var21 >= class101.field1397 && var20 <= class44.field536) {
                    if (var10 > var8) {
                        int var22 = class301.field4441[var8];
                        int var23 = class185.method1299(arg0 + var7, (byte) 115, class259.field3813, class206.field2952);
                        int var24 = class185.method1299(arg0 - var7, (byte) 111, class259.field3813, class206.field2952);
                        int var25 = class185.method1299(arg0 + var22, (byte) 111, class259.field3813, class206.field2952);
                        int var26 = class185.method1299(arg0 - var22, (byte) 108, class259.field3813, class206.field2952);
                        if (class44.field536 >= var21) {
                            int[] var27 = class126.field1723[var21];
                            class190.method1329(var27, var26, arg1, (byte) -109, var24);
                            class190.method1329(var27, var25, arg5, (byte) -126, var26);
                            class190.method1329(var27, var23, arg1, (byte) -106, var25);
                        }
                        if (class101.field1397 <= var20) {
                            int[] var28 = class126.field1723[var20];
                            class190.method1329(var28, var26, arg1, (byte) -82, var24);
                            class190.method1329(var28, var25, arg5, (byte) -92, var26);
                            class190.method1329(var28, var23, arg1, (byte) -111, var25);
                        }
                    } else {
                        int var29 = class185.method1299(arg0 + var7, (byte) 107, class259.field3813, class206.field2952);
                        int var30 = class185.method1299(arg0 - var7, (byte) 113, class259.field3813, class206.field2952);
                        if (class44.field536 >= var21) {
                            class190.method1329(class126.field1723[var21], var29, arg1, (byte) -120, var30);
                        }
                        if (class101.field1397 <= var20) {
                            class190.method1329(class126.field1723[var20], var29, arg1, (byte) -96, var30);
                        }
                    }
                }
            }
            int var31 = arg6 - var7;
            int var32 = arg6 + var7;
            if (var32 >= class101.field1397 && var31 <= class44.field536) {
                int var33 = arg0 + var8;
                int var34 = arg0 - var8;
                if (var33 >= class206.field2952 && class259.field3813 >= var34) {
                    int var35 = class185.method1299(var33, (byte) 124, class259.field3813, class206.field2952);
                    int var36 = class185.method1299(var34, (byte) 114, class259.field3813, class206.field2952);
                    if (var10 > var7) {
                        int var37 = var11 < var7 ? class301.field4441[var7] : var11;
                        int var38 = class185.method1299(arg0 + var37, (byte) 118, class259.field3813, class206.field2952);
                        int var39 = class185.method1299(arg0 - var37, (byte) 123, class259.field3813, class206.field2952);
                        if (var32 <= class44.field536) {
                            int[] var40 = class126.field1723[var32];
                            class190.method1329(var40, var39, arg1, (byte) -124, var36);
                            class190.method1329(var40, var38, arg5, (byte) -80, var39);
                            class190.method1329(var40, var35, arg1, (byte) -108, var38);
                        }
                        if (class101.field1397 <= var31) {
                            int[] var41 = class126.field1723[var31];
                            class190.method1329(var41, var39, arg1, (byte) -106, var36);
                            class190.method1329(var41, var38, arg5, (byte) -119, var39);
                            class190.method1329(var41, var35, arg1, (byte) -100, var38);
                        }
                    } else {
                        if (class44.field536 >= var32) {
                            class190.method1329(class126.field1723[var32], var35, arg1, (byte) -79, var36);
                        }
                        if (var31 >= class101.field1397) {
                            class190.method1329(class126.field1723[var31], var35, arg1, (byte) -122, var36);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)Lki;", line = 979)
    public final class160 method696(byte arg0) {
        field4040++;
        if (this.field4066 != null) {
            return this.field4066;
        }
        if (arg0 != -106) {
            field4053 = (byte[][][]) ((byte[][][]) null);
        }
        if (this.field4045 == null) {
            if (this.field4060.method80(arg0 - 17801)) {
                return null;
            }
            this.field4045 = this.field4060.method77(this.field4031, (byte) 0, false, 255, true);
        }
        if (this.field4045.field115) {
            return null;
        }
        byte[] var2 = this.field4045.method66((byte) -115);
        if (this.field4045 instanceof class79) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4066 = new class160(var2, this.field4046);
                if (this.field4066.field2197 != this.field4038) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var5) {
                this.field4066 = null;
                if (this.field4060.method80(-17907)) {
                    this.field4045 = null;
                } else {
                    this.field4045 = this.field4060.method77(this.field4031, (byte) 0, false, 255, true);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4066 = new class160(var2, this.field4046);
            } catch (RuntimeException var6) {
                this.field4060.method78(true);
                this.field4066 = null;
                if (this.field4060.method80(-17907)) {
                    this.field4045 = null;
                } else {
                    this.field4045 = this.field4060.method77(this.field4031, (byte) 0, false, 255, true);
                }
                return null;
            }
            if (this.field4057 != null) {
                this.field4042.method150(this.field4057, this.field4031, (byte) 16, var2);
            }
        }
        if (this.field4056 != null) {
            this.field4043 = new byte[this.field4066.field2195];
            this.field4033 = 0;
        }
        this.field4045 = null;
        return this.field4066;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)[B", line = 1080)
    public final byte[] method700(int arg0, byte arg1) {
        field4032++;
        class11 var3 = this.method1864(arg0, -128, 0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.method66((byte) -115);
        if (arg1 != 54) {
            this.method696((byte) -84);
        }
        var3.method1274((byte) -26);
        return var4;
    }
}
