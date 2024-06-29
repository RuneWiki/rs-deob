import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class226 {

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    private int field4079 = -1;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    private int field4083 = 0;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "Ldb;")
    private class36 field4078 = new class36();

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "Z")
    public boolean field4085 = false;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    private int field4072;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "[Lj;")
    private class98[] field4074;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    private int field4070;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "[[I")
    private int[][] field4082;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Lkh;")
    public static class117 field4069 = class224.method1450((byte) 124, "mem=");

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "Z")
    public static boolean field4081 = false;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "Lkh;")
    public static class117 field4068 = class224.method1450((byte) 7, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "Lkh;")
    public static class117 field4084 = class224.method1450((byte) -57, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static final void method1460(int arg0) {
        field4080++;
        if (class19.field537 != null) {
            return;
        }
        if (arg0 != 23907) {
            method1462(-32, true, null, false, 26, 84, 5);
        }
        if (class67.field1290 != null) {
            return;
        }
        int var1 = class215.field3907;
        if (class182.field3289) {
            if (var1 != 1) {
                int var2 = class137.field2479;
                int var3 = class199.field3571;
                if (var2 < class98.field1809 - 10 || class98.field1809 + class120.field2266 + 10 < var2 || class111.field2092 - 10 > var3 || class32.field761 + class111.field2092 + 10 < var3) {
                    class182.field3289 = false;
                    class214.method1407(class32.field761, class111.field2092, arg0 - 5587, class120.field2266, class98.field1809);
                }
            }
            if (var1 == 1) {
                int var4 = class98.field1809;
                int var5 = class120.field2266;
                int var6 = class111.field2092;
                int var7 = class187.field3353;
                int var8 = class41.field929;
                int var9 = -1;
                for (int var10 = 0; var10 < class100.field1825; var10++) {
                    int var11 = (class100.field1825 - var10 - 1) * 15 + var6 + 31;
                    if (var4 < var7 && var4 + var5 > var7 && var8 > var11 - 13 && var8 < var11 + 3) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    class72.method511(var9, 119);
                }
                class182.field3289 = false;
                class214.method1407(class32.field761, class111.field2092, 18320, class120.field2266, class98.field1809);
                return;
            }
            return;
        }
        if (var1 == 1 && class100.field1825 > 0) {
            short var12 = class194.field3462[class100.field1825 - 1];
            if (var12 == 5 || var12 == 35 || var12 == 24 || var12 == 38 || var12 == 25 || var12 == 1 || var12 == 58 || var12 == 22 || var12 == 2 || var12 == 51 || var12 == 18 || var12 == 1003) {
                int var13 = class40.field907[class100.field1825 - 1];
                int var14 = class227.field4094[class100.field1825 - 1];
                class9 var15 = class119.method837((byte) 94, var13);
                if (class56.method428(1561541148, class187.method1269(var15, (byte) 16)) || class213.method1400(class187.method1269(var15, (byte) 16), (byte) -84)) {
                    class193.field3457 = false;
                    class74.field1404 = 0;
                    if (class19.field537 != null) {
                        class62.method457(class19.field537, 0);
                    }
                    class19.field537 = class119.method837((byte) 114, var13);
                    class130.field2396 = class41.field929;
                    class40.field908 = class187.field3353;
                    class30.field713 = var14;
                    class62.method457(class19.field537, 0);
                    return;
                }
            }
        }
        if (var1 == 1 && (class196.field3493 == 1 && class100.field1825 > 2 || class171.method1201((byte) -112, class100.field1825 - 1))) {
            var1 = 2;
        }
        if (var1 == 1 && class100.field1825 > 0) {
            class72.method511(class100.field1825 - 1, -114);
        }
        if (var1 != 2 || class100.field1825 <= 0) {
            return;
        }
        class184.method1261(121);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class13 var20 = new class13(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class109.field2063[var21][arg1][arg2] == null) {
                    class109.field2063[var21][arg1][arg2] = new class170(var21, arg1, arg2);
                }
            }
            class109.field2063[arg0][arg1][arg2].field3057 = var20;
        } else if (arg3 == 1) {
            class13 var22 = new class13(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class109.field2063[var23][arg1][arg2] == null) {
                    class109.field2063[var23][arg1][arg2] = new class170(var23, arg1, arg2);
                }
            }
            class109.field2063[arg0][arg1][arg2].field3057 = var22;
        } else {
            class238 var24 = new class238(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class109.field2063[var25][arg1][arg2] == null) {
                    class109.field2063[var25][arg1][arg2] = new class170(var25, arg1, arg2);
                }
            }
            class109.field2063[arg0][arg1][arg2].field3070 = var24;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZLai;ZIII)V")
    public static final void method1462(int arg0, boolean arg1, class10 arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class154.field2765 = arg5;
        class213.field3879 = arg2;
        class176.field3183 = arg6;
        if (arg3) {
            return;
        }
        class69.field1328 = arg1;
        field4073++;
        class66.field1273 = arg4;
        class39.field905 = arg0;
        class209.field3751 = 1;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)[I")
    public final int[] method1463(byte arg0, int arg1) {
        field4067++;
        if (arg0 != -115) {
            return null;
        } else if (this.field4072 == this.field4070) {
            this.field4085 = this.field4074[arg1] == null;
            this.field4074[arg1] = class34.field795;
            return this.field4082[arg1];
        } else if (this.field4070 == 1) {
            this.field4085 = this.field4079 != arg1;
            this.field4079 = arg1;
            return this.field4082[0];
        } else {
            class98 var3 = this.field4074[arg1];
            if (var3 == null) {
                this.field4085 = true;
                if (this.field4083 >= this.field4070) {
                    class98 var4 = (class98) this.field4078.method318(-78);
                    var3 = new class98(arg1, var4.field1799);
                    this.field4074[var4.field1797] = null;
                    var4.method123((byte) -126);
                } else {
                    var3 = new class98(arg1, this.field4083);
                    this.field4083++;
                }
                this.field4074[arg1] = var3;
            } else {
                this.field4085 = false;
            }
            this.field4078.method323(-64, var3);
            return this.field4082[var3.field1799];
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILsb;)V")
    public static final void method1464(int arg0, class199 arg1) {
        if (arg0 != -1637) {
            field4081 = false;
        }
        field4071++;
        if (class215.field3907 != 1) {
            return;
        }
        short var2 = 280;
        if (var2 <= class187.field3353 && class187.field3353 <= var2 + 14 && class41.field929 >= 4 && class41.field929 <= 18) {
            class233.method1506(0, 0, (byte) -38);
            return;
        }
        if (class187.field3353 >= var2 + 15 && var2 + 80 >= class187.field3353 && class41.field929 >= 4 && class41.field929 <= 18) {
            class233.method1506(1, 0, (byte) -115);
            return;
        }
        short var3 = 390;
        if (class187.field3353 >= var3 && class187.field3353 <= var3 + 14 && class41.field929 >= 4 && class41.field929 <= 18) {
            class233.method1506(0, 1, (byte) -43);
            return;
        }
        if (class187.field3353 >= var3 + 15 && class187.field3353 <= var3 + 80 && class41.field929 >= 4 && class41.field929 <= 18) {
            class233.method1506(1, 1, (byte) -31);
            return;
        }
        short var4 = 500;
        if (var4 <= class187.field3353 && class187.field3353 <= var4 + 14 && class41.field929 >= 4 && class41.field929 <= 18) {
            class233.method1506(0, 2, (byte) -59);
            return;
        }
        if (class187.field3353 >= var4 + 15 && var4 + 80 >= class187.field3353 && class41.field929 >= 4 && class41.field929 <= 18) {
            class233.method1506(1, 2, (byte) -18);
            return;
        }
        short var5 = 610;
        if (class187.field3353 >= var5 && var5 + 14 >= class187.field3353 && class41.field929 >= 4 && class41.field929 <= 18) {
            class233.method1506(0, 3, (byte) -80);
            return;
        }
        if (var5 + 15 <= class187.field3353 && var5 + 80 >= class187.field3353 && class41.field929 >= 4 && class41.field929 <= 18) {
            class233.method1506(1, 3, (byte) -89);
            return;
        }
        if (class187.field3353 >= 700 && class41.field929 >= 4 && class187.field3353 <= 758 && class41.field929 <= 20) {
            class45.field987 = false;
            class184.method1262(120);
            return;
        }
        if (class100.field1826 == -1) {
            return;
        }
        class128 var6 = class202.field3655[class100.field1826];
        if (field4081 == var6.field2363) {
            byte[] var7 = class36.method316((byte) -34, new class117[] { var6.field2377, class14.field441 }).method815((byte) 122);
            class201.field3648 = new String(var7, 0, var7.length);
            class45.field987 = false;
            if (class30.field723 != 0) {
                class182.field3295 = 443;
                class42.field943 = 43594;
                class36.field844 = 43594;
                class30.field723 = 0;
            }
            class10.field361 = var6.field2378;
            class184.method1262(arg0 ^ 0xFFFFF9EF);
            return;
        }
        class117 var8 = class36.method316((byte) -34, new class117[] { class67.field1297, var6.field2377, class84.field1600, class42.method358(class233.field4193, (byte) 34), class20.field557, class42.method358(class167.field3021 ? 1 : 0, (byte) 34), class232.field4162, class42.method358(class143.field2588, (byte) 34), class18.field531, class42.method358(class111.field2094, (byte) 34) });
        try {
            arg1.getAppletContext().showDocument(var8.method823(arg0 ^ 0x665), "_self");
            return;
        } catch (Exception var9) {
            return;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)[[I")
    public final int[][] method1465(int arg0) {
        field4066++;
        if (this.field4072 != this.field4070) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (arg0 < 17) {
            this.field4079 = 102;
        }
        while (var2 < this.field4070) {
            this.field4074[var2] = class34.field795;
            var2++;
        }
        return this.field4082;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
    public final void method1466(int arg0) {
        field4076++;
        if (arg0 != 21744) {
            return;
        }
        for (int var2 = 0; var2 < this.field4070; var2++) {
            this.field4082[var2] = null;
        }
        this.field4082 = null;
        this.field4074 = null;
        this.field4078.method324(-82);
        this.field4078 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
    public static void method1467(boolean arg0) {
        field4084 = null;
        field4069 = null;
        field4068 = null;
        if (arg0) {
            method1468((byte) 71);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)Ldi;")
    public static final class43 method1468(byte arg0) {
        if (arg0 >= -39) {
            return null;
        }
        field4077++;
        try {
            return (class43) Class.forName("eb").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIBIII)V")
    public static final void method1469(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field4075++;
        if (arg5 <= 39) {
            field4069 = null;
        }
        if (class223.method1446(arg7, 6)) {
            class223.field4023 = null;
            class167.method1183(arg2, arg6, arg1, class90.field1675[arg7], 420588875, -1, arg3, arg4, arg0, arg8);
            if (class223.field4023 != null) {
                class167.method1183(arg2, class75.field1431, arg1, class223.field4023, 420588875, -1412584499, arg3, class170.field3054, arg0, arg8);
                class223.field4023 = null;
            }
        } else if (arg8 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class173.field3126[var9] = true;
            }
        } else {
            class173.field3126[arg8] = true;
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(III)V")
    public class226(int arg0, int arg1, int arg2) {
        this.field4072 = arg1;
        this.field4074 = new class98[this.field4072];
        this.field4070 = arg0;
        this.field4082 = new int[this.field4070][arg2];
    }
}
