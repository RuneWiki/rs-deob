import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class277 {

    @OriginalMember(owner = "client!am", name = "r", descriptor = "Lgd;")
    public class141 field4665 = new class141();

    @OriginalMember(owner = "client!am", name = "l", descriptor = "Lhi;")
    public static class82 field4659 = class95.method664((byte) -77, "::serverjs5drop");

    @OriginalMember(owner = "client!am", name = "h", descriptor = "Lhi;")
    public static class82 field4655 = class95.method664((byte) -125, "::fps ");

    @OriginalMember(owner = "client!am", name = "n", descriptor = "Lhi;")
    public static class82 field4661 = class95.method664((byte) -104, "<col=00ffff>");

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "Lgd;")
    private class141 field4668;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "Lum;")
    public static class222 field4662;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "[[Lme;")
    public static class75[][] field4660;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 10)
    public static final void method1925(int arg0) {
        class61.field957.method1504(arg0, arg0 ^ 0xFFFFFFB8);
        class61.field957.method1075(class284.method1972((byte) -127), -1);
        class197.field3374++;
        class61.field957.method1102((byte) -125, class260.field4462);
        class61.field957.method1102((byte) -118, class180.field3078);
        field4663++;
        class61.field957.method1075(class146.field2467, -1);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)Lgd;", line = 39)
    public final class141 method1926(byte arg0) {
        field4667++;
        class141 var2 = this.field4668;
        if (arg0 != 90) {
            field4662 = (class222) null;
        }
        if (this.field4665 == var2) {
            this.field4668 = null;
            return null;
        } else {
            this.field4668 = var2.field2423;
            return var2;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)Lgd;", line = 64)
    public final class141 method1927(int arg0) {
        if (arg0 != 0) {
            this.method1932(50);
        }
        field4666++;
        class141 var2 = this.field4668;
        if (this.field4665 == var2) {
            this.field4668 = null;
            return null;
        } else {
            this.field4668 = var2.field2422;
            return var2;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)I", line = 89)
    public static final int method1928(int arg0, int arg1) {
        field4650++;
        if (arg1 != -8015) {
            method1934((byte) 102, 83);
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V", line = 100)
    public static void method1929(byte arg0) {
        field4661 = null;
        if (arg0 < 17) {
            field4655 = (class82) null;
        }
        field4659 = null;
        field4660 = (class75[][]) null;
        field4662 = null;
        field4655 = null;
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(B)I", line = 114)
    public static final int method1930(byte arg0) {
        field4657++;
        try {
            if (class209.field3674 == 0) {
                if ((class57.method391(19211) - 5000L) < class265.field4525) {
                    return 0;
                }
                class133.field2297 = class55.field881.method831(class34.field516, (byte) 118, class261.field4469);
                class81.field1385 = class57.method391(19211);
                class209.field3674 = 1;
            }
            if ((class81.field1385 + 30000L) < class57.method391(19211)) {
                return class47.method339(1000, (byte) -125);
            }
            if (class209.field3674 == 1) {
                if (class133.field2297.field5121 == 2) {
                    return class47.method339(1001, (byte) -125);
                }
                if (class133.field2297.field5121 != 1) {
                    return -1;
                }
                class66.field1036 = new class302((Socket) class133.field2297.field5122, class55.field881);
                class61.field957.field2611 = 0;
                class133.field2297 = null;
                int var1 = 0;
                if (class35.field572) {
                    var1 = class293.field4920;
                }
                class61.field957.method1075(51, -1);
                class61.field957.method1065(178808912, var1);
                class66.field1036.method2083(true, class61.field957.field2611, class61.field957.field2598, 0);
                if (class67.field1048 != null) {
                    class67.field1048.method752((byte) -71);
                }
                if (class142.field2435 != null) {
                    class142.field2435.method752((byte) -96);
                }
                int var2 = class66.field1036.method2089(-119);
                if (class67.field1048 != null) {
                    class67.field1048.method752((byte) -94);
                }
                if (class142.field2435 != null) {
                    class142.field2435.method752((byte) -36);
                }
                if (var2 != 0) {
                    return class47.method339(var2, (byte) -125);
                }
                class209.field3674 = 2;
            }
            if (class209.field3674 == 2) {
                if (class66.field1036.method2088((byte) 91) < 2) {
                    return -1;
                }
                class330.field5625 = class66.field1036.method2089(-106);
                class330.field5625 <<= 0x8;
                class330.field5625 += class66.field1036.method2089(-95);
                class260.field4452 = new byte[class330.field5625];
                class75.field1230 = 0;
                class209.field3674 = 3;
            }
            if (class209.field3674 == 3) {
                int var3 = class66.field1036.method2088((byte) 91);
                if (var3 < 1) {
                    return -1;
                }
                if (var3 > (class330.field5625 - class75.field1230)) {
                    var3 = class330.field5625 - class75.field1230;
                }
                class66.field1036.method2087(var3, class260.field4452, class75.field1230, (byte) 117);
                class75.field1230 += var3;
                if (class330.field5625 <= class75.field1230) {
                    if (class17.method99(class260.field4452, 1259039367)) {
                        class189.field3187 = new class67[class104.field1849];
                        int var4 = 0;
                        for (int var5 = class126.field2210; var5 <= class51.field833; var5++) {
                            class67 var6 = class44.method329(3283, var5);
                            if (var6 != null) {
                                class189.field3187[var4++] = var6;
                            }
                        }
                        class66.field1036.method2085(true);
                        class260.field4452 = null;
                        class161.field2812 = 0;
                        class66.field1036 = null;
                        class209.field3674 = 0;
                        class265.field4525 = class57.method391(19211);
                        return 0;
                    }
                    return class47.method339(1002, (byte) -125);
                }
                return -1;
            }
        } catch (IOException var9) {
            return class47.method339(1003, (byte) -125);
        }
        int var8 = 84 / ((arg0 - 26) / 52);
        return -1;
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(B)Lgd;", line = 247)
    public final class141 method1931(byte arg0) {
        field4648++;
        if (arg0 != -73) {
            this.method1927(122);
        }
        class141 var2 = this.field4665.field2422;
        if (this.field4665 == var2) {
            this.field4668 = null;
            return null;
        } else {
            this.field4668 = var2.field2422;
            return var2;
        }
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)Lgd;", line = 273)
    public final class141 method1932(int arg0) {
        field4654++;
        class141 var2 = this.field4665.field2423;
        if (this.field4665 == var2) {
            return null;
        } else {
            var2.method961((byte) 104);
            return arg0 == -1 ? var2 : (class141) null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILgd;)V", line = 291)
    public final void method1933(int arg0, class141 arg1) {
        if (arg0 != 9988) {
            this.method1927(-100);
        }
        if (arg1.field2422 != null) {
            arg1.method961((byte) 69);
        }
        arg1.field2423 = this.field4665.field2423;
        arg1.field2422 = this.field4665;
        field4664++;
        arg1.field2422.field2423 = arg1;
        arg1.field2423.field2422 = arg1;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)V", line = 313)
    public static final void method1934(byte arg0, int arg1) {
        if (arg1 == 37) {
            class119.field2106 = 3.0F;
        } else if (arg1 == 50) {
            class119.field2106 = 4.0F;
        } else if (arg1 == 75) {
            class119.field2106 = 6.0F;
        } else {
            class119.field2106 = 8.0F;
        }
        class78.field1330 = -1;
        class78.field1330 = -1;
        field4651++;
        if (arg0 != -91) {
            field4662 = (class222) null;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(II)I", line = 353)
    public static int method1935(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(I)Lgd;", line = 361)
    public final class141 method1936(int arg0) {
        if (arg0 != 16173) {
            this.method1940((byte) 90, (class141) null);
        }
        field4656++;
        class141 var2 = this.field4665.field2423;
        if (this.field4665 == var2) {
            this.field4668 = null;
            return null;
        } else {
            this.field4668 = var2.field2423;
            return var2;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "([[ILuk;Z[Z[[FII[[FIZ[[FZIIBZ[[I[IIIII)V", line = 386)
    public static final void method1937(int[][] arg0, class108 arg1, boolean arg2, boolean[] arg3, float[][] arg4, int arg5, int arg6, float[][] arg7, int arg8, boolean arg9, float[][] arg10, boolean arg11, int arg12, int arg13, byte arg14, boolean arg15, int[][] arg16, int[] arg17, int arg18, int arg19, int arg20, int arg21) {
        int var22 = (arg8 << 8) + (arg11 ? 255 : 0);
        int var23 = (arg9 ? 255 : 0) + (arg12 << 8);
        field4658++;
        if (arg20 <= 31) {
            method1934((byte) 62, -4);
        }
        int var24 = (arg15 ? 255 : 0) + (arg18 << 8);
        int[] var25 = new int[arg17.length / 2];
        int var26 = (arg2 ? 255 : 0) + (arg6 << 8);
        for (int var27 = 0; var27 < var25.length; var27++) {
            int var28 = arg17[var27 + var27];
            int[][] var29 = arg16 == null || arg3 == null || !arg3[var27] ? arg0 : arg16;
            int var30 = arg17[var27 + var27 + 1];
            var25[var27] = class87.method610(var22, var29, false, var26, (float) arg21, var30, var24, arg7, arg13, arg10, var23, arg16, arg4, var28, -117, arg14, arg1, arg19);
        }
        arg1.method740(arg5, arg19, arg13, var25, (int[]) null, false);
    }

    @OriginalMember(owner = "client!am", name = "e", descriptor = "(I)V", line = 426)
    public final void method1938(int arg0) {
        while (true) {
            class141 var2 = this.field4665.field2423;
            if (this.field4665 == var2) {
                if (arg0 != 71) {
                    return;
                }
                this.field4668 = null;
                field4649++;
                return;
            }
            var2.method961((byte) 91);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIZ)V", line = 444)
    public static final void method1939(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class89.field1605 = arg1;
        class38.field658 = arg2;
        class71.field1095 = arg3;
        class142.field2431 = new class16[arg0][class89.field1605][class38.field658];
        class180.field3073 = new int[arg0][class89.field1605 + 1][class38.field658 + 1];
        if (class147.field2485) {
            class112.field2029 = new class108[4][];
        }
        if (arg4) {
            class238.field4139 = new class16[1][class89.field1605][class38.field658];
            class283.field4746 = new int[class89.field1605][class38.field658];
            class150.field2560 = new int[1][class89.field1605 + 1][class38.field658 + 1];
            if (class147.field2485) {
                class260.field4439 = new class108[1][];
            }
        } else {
            class238.field4139 = (class16[][][]) null;
            class283.field4746 = (int[][]) null;
            class150.field2560 = (int[][][]) null;
            class260.field4439 = (class108[][]) null;
        }
        class90.method640(false);
        class171.field2952 = new class60[500];
        class181.field3097 = 0;
        class286.field4811 = new class60[500];
        class312.field5328 = 0;
        class286.field4816 = new int[arg0][class89.field1605 + 1][class38.field658 + 1];
        class164.field2878 = new class69[5000];
        class33.field491 = 0;
        class226.field3907 = new class69[100];
        class42.field743 = new boolean[class71.field1095 + class71.field1095 + 1][class71.field1095 + class71.field1095 + 1];
        class292.field4900 = new boolean[class71.field1095 + class71.field1095 + 2][class71.field1095 + class71.field1095 + 2];
        class153.field2608 = new byte[arg0][class89.field1605][class38.field658];
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V", line = 516)
    public class277() {
        this.field4665.field2422 = this.field4665;
        this.field4665.field2423 = this.field4665;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BLgd;)V", line = 500)
    public final void method1940(byte arg0, class141 arg1) {
        if (arg1.field2422 != null) {
            arg1.method961((byte) 111);
        }
        arg1.field2422 = this.field4665.field2422;
        arg1.field2423 = this.field4665;
        field4652++;
        arg1.field2422.field2423 = arg1;
        int var3 = -62 % ((-arg0 - 42) / 46);
        arg1.field2423.field2422 = arg1;
    }
}
