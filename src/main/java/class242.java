import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class242 {

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "[I")
    private int[] field3881;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "[I")
    private int[] field3878;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "Lwb;")
    private class195 field3893;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Lwb;")
    private class195 field3886;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "[Lwb;")
    private class195[] field3883;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field3877 = -1;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Ltf;")
    public static class57 field3888 = new class57();

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Lck;")
    public static class119 field3892 = class298.method1987((byte) 29, "s3 graphics");

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "Lck;")
    public static class119 field3894 = class298.method1987((byte) 73, "<)4col>");

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field3891 = 1;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "Z")
    public static boolean field3895;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZDZLva;IILll;I)[I", line = 15)
    public final int[] method1571(boolean arg0, double arg1, boolean arg2, class36 arg3, int arg4, int arg5, class17 arg6, int arg7) {
        class3.method55(true, arg1);
        class109.field1664 = arg6;
        class273.field4478 = arg3;
        field3879++;
        class273.method1806(arg4, (byte) 120, arg5);
        int[] var10 = new int[arg4 * arg5];
        for (int var11 = 0; var11 < this.field3883.length; var11++) {
            this.field3883[var11].method1252(arg4, arg5, false);
        }
        int var12;
        int var13;
        byte var14;
        if (arg0) {
            var13 = arg4 - 1;
            var14 = -1;
            var12 = -1;
        } else {
            var12 = arg4;
            var13 = 0;
            var14 = 1;
        }
        int var15 = 0;
        if (arg7 != 2) {
            return (int[]) null;
        }
        for (int var16 = 0; var16 < arg5; var16++) {
            if (arg2) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field3893.field3127) {
                int[] var17 = this.field3893.method11(var16, false);
                var18 = var17;
                var19 = var17;
                var20 = var17;
            } else {
                int[][] var21 = this.field3893.method9((byte) 3, var16);
                var18 = var21[2];
                var19 = var21[1];
                var20 = var21[0];
            }
            for (int var22 = var13; var22 != var12; var22 += var14) {
                int var23 = var19[var22] >> 4;
                int var24 = var18[var22] >> 4;
                int var25 = var20[var22] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class69.field1073[var23];
                if (var25 < 0) {
                    var25 = 0;
                }
                int var27 = class69.field1073[var25];
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var28 = class69.field1073[var24];
                var10[var15++] = (var26 << 8) + ((var27 << 16) + var28);
                if (arg2) {
                    var15 += arg4 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field3883.length; var29++) {
            this.field3883[var29].method350(50);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZLva;Lll;)Z", line = 152)
    public final boolean method1572(boolean arg0, class36 arg1, class17 arg2) {
        field3887++;
        for (int var4 = 0; var4 < this.field3881.length; var4++) {
            if (!arg1.method267((byte) 4, this.field3881[var4])) {
                return false;
            }
        }
        int var5 = 0;
        if (!arg0) {
            this.method1577(-105, (class36) null, -94, -1.093482191345099D, true, (class17) null, false);
        }
        while (var5 < this.field3878.length) {
            if (!arg2.method135((byte) 106, this.field3878[var5])) {
                return false;
            }
            var5++;
        }
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 187)
    public static final void method1573(byte arg0) {
        field3890++;
        int var1 = class67.field1035;
        int var2 = class59.field949;
        int var3 = class104.field1599;
        int var4 = 6116423;
        int var5 = class257.field4128;
        class121.method811(var3, var1, var2, var5, var4);
        class121.method811(var3 + 1, var1 - -1, var2 - 2, 16, 0);
        class121.method813(var3 + 1, var1 + 18, var2 - 2, var5 + -19, 0);
        class110.field1683.method1827(class152.field2429, var3 + 3, var1 + 14, var4, -1);
        int var6 = class129.field1984;
        int var7 = class65.field1024;
        int var8 = 0;
        int var9 = 18 / ((70 - arg0) / 33);
        while (class272.field4474 > var8) {
            int var10 = var1 + ((class272.field4474 - var8 - 1) * 15) + 31;
            int var11 = 16777215;
            if (var3 < var6 && var6 < var2 + var3 && var7 > var10 - 13 && var10 + 3 > var7) {
                var11 = 16776960;
            }
            class110.field1683.method1827(class50.method388(-1, var8), var3 + 3, var10, var11, 0);
            var8++;
        }
        class193.method1240(class59.field949, class67.field1035, (byte) 108, class257.field4128, class104.field1599);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V", line = 242)
    public static void method1574(boolean arg0) {
        field3888 = null;
        field3894 = null;
        if (arg0) {
            method1573((byte) -31);
        }
        field3892 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V", line = 254)
    public static final void method1575(int arg0, int arg1) {
        field3882++;
        if (arg0 > -64) {
            method1573((byte) 105);
        }
        class64.field1012.method491(-125, arg1);
        class184.field2917.method491(-105, arg1);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Llh;IZ)V", line = 271)
    public static final void method1576(class282 arg0, int arg1, boolean arg2) {
        if (arg1 < 111) {
            return;
        }
        field3889++;
        if (arg2) {
            class99.field1503 = 3;
            class118.method747(-30439, false);
            class185.field2934 = false;
            class10.field183 = 0;
            class146.field2349 = 0;
            class4.field120 = 127;
            class281.field4640 = false;
            class78.field1205 = 255;
            class14.field226 = false;
            class10.field184 = false;
            class198.field3168 = false;
            class153.field2434 = 0;
            class6.field146 = false;
            class129.field1979 = false;
            class29.field417 = false;
            class244.field3943 = false;
            class78.field1199 = false;
            class27.field407 = 0;
            class184.field2916 = 127;
            class224.field3598 = false;
            class270.method1794(arg0, 1);
            return;
        }
        class99.field1503 = 3;
        class118.method747(-30439, true);
        class14.field226 = true;
        class244.field3943 = true;
        class146.field2349 = 0;
        class10.field183 = 0;
        class153.field2434 = 2;
        class184.field2916 = 127;
        class133 var3 = null;
        class185.field2934 = true;
        class29.field417 = true;
        class129.field1979 = true;
        class281.field4640 = true;
        class78.field1205 = 255;
        class27.field407 = 0;
        class78.field1199 = true;
        class224.field3598 = true;
        class198.field3168 = true;
        class6.field146 = true;
        class10.field184 = true;
        class4.field120 = 127;
        try {
            class275 var4 = arg0.method1882(8, "runescape");
            while (var4.field4496 == 0) {
                class232.method1493(1L, (byte) -51);
            }
            if (var4.field4496 == 1) {
                int var5 = 0;
                var3 = (class133) var4.field4499;
                byte[] var6 = new byte[(int) var3.method875((byte) 29)];
                while (var6.length > var5) {
                    int var7 = var3.method874(var6, (byte) 70, var5, var6.length - var5);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                    var5 += var7;
                }
                class13.method114(new class3(var6), -2);
            }
        } catch (Exception var11) {
        }
        try {
            if (var3 != null) {
                var3.method879(13943);
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILva;IDZLll;Z)[B", line = 372)
    public final byte[] method1577(int arg0, class36 arg1, int arg2, double arg3, boolean arg4, class17 arg5, boolean arg6) {
        class3.method55(arg6, arg3);
        field3885++;
        class109.field1664 = arg5;
        class273.field4478 = arg1;
        byte[] var9 = new byte[arg0 * arg2 * 4];
        class273.method1806(arg0, (byte) 120, arg2);
        for (int var10 = 0; var10 < this.field3883.length; var10++) {
            this.field3883[var10].method1252(arg0, arg2, false);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg2; var12++) {
            if (arg4) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field3893.field3127) {
                int[] var13 = this.field3893.method11(var12, false);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field3893.method9((byte) 3, var12);
                var16 = var17[0];
                var15 = var17[2];
                var14 = var17[1];
            }
            int[] var18;
            if (this.field3886.field3127) {
                var18 = this.field3886.method11(var12, false);
            } else {
                var18 = this.field3886.method9((byte) 3, var12)[0];
            }
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = var16[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var21 = class69.field1073[var20];
                int var22 = var15[var19] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = class69.field1073[var22];
                int var24 = var14[var19] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class69.field1073[var24];
                int var26;
                if (var21 == 0 && var25 == 0 && var23 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9[var11++] = (byte) var21;
                var9[var11++] = (byte) var25;
                var9[var11++] = (byte) var23;
                var9[var11++] = (byte) var26;
                if (arg4) {
                    var11 += (arg0 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field3883.length; var27++) {
            this.field3883[var27].method350(91);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([Lud;IZI)V", line = 505)
    public static final void method1578(class158[] arg0, int arg1, boolean arg2, int arg3) {
        field3880++;
        if (!arg2) {
            method1575(-99, -117);
        }
        if (arg1 <= arg3) {
            return;
        }
        int var4 = arg3 - 1;
        int var5 = (arg1 + arg3) / 2;
        int var6 = arg1 + 1;
        class158 var7 = arg0[var5];
        arg0[var5] = arg0[arg3];
        arg0[arg3] = var7;
        while (var6 > var4) {
            boolean var8 = true;
            do {
                var6--;
                for (int var9 = 0; var9 < 4; var9++) {
                    int var10;
                    int var11;
                    if (class7.field157[var9] == 2) {
                        var11 = var7.field2518;
                        var10 = arg0[var6].field2518;
                    } else if (class7.field157[var9] == 1) {
                        var10 = arg0[var6].field2510;
                        if (var10 == -1 && class287.field4732[var9] == 1) {
                            var10 = 2001;
                        }
                        var11 = var7.field2510;
                        if (var11 == -1 && class287.field4732[var9] == 1) {
                            var11 = 2001;
                        }
                    } else if (class7.field157[var9] == 3) {
                        var11 = var7.field2515 ? 1 : 0;
                        var10 = arg0[var6].field2515 ? 1 : 0;
                    } else {
                        var11 = var7.field2520;
                        var10 = arg0[var6].field2520;
                    }
                    if (var10 != var11) {
                        if ((class287.field4732[var9] != 1 || var11 >= var10) && (class287.field4732[var9] != 0 || var10 >= var11)) {
                            var8 = false;
                        }
                        break;
                    }
                    if (var9 == 3) {
                        var8 = false;
                    }
                }
            } while (var8);
            boolean var12 = true;
            do {
                var4++;
                for (int var13 = 0; var13 < 4; var13++) {
                    int var14;
                    int var15;
                    if (class7.field157[var13] == 2) {
                        var14 = var7.field2518;
                        var15 = arg0[var4].field2518;
                    } else if (class7.field157[var13] == 1) {
                        var14 = var7.field2510;
                        if (var14 == -1 && class287.field4732[var13] == 1) {
                            var14 = 2001;
                        }
                        var15 = arg0[var4].field2510;
                        if (var15 == -1 && class287.field4732[var13] == 1) {
                            var15 = 2001;
                        }
                    } else if (class7.field157[var13] == 3) {
                        var15 = arg0[var4].field2515 ? 1 : 0;
                        var14 = var7.field2515 ? 1 : 0;
                    } else {
                        var14 = var7.field2520;
                        var15 = arg0[var4].field2520;
                    }
                    if (var14 != var15) {
                        if ((class287.field4732[var13] != 1 || var15 >= var14) && (class287.field4732[var13] != 0 || var15 <= var14)) {
                            var12 = false;
                        }
                        break;
                    }
                    if (var13 == 3) {
                        var12 = false;
                    }
                }
            } while (var12);
            if (var6 > var4) {
                class158 var16 = arg0[var4];
                arg0[var4] = arg0[var6];
                arg0[var6] = var16;
            }
        }
        method1578(arg0, var6, true, arg3);
        method1578(arg0, arg1, true, var6 + 1);
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V", line = 691)
    public class242() {
        this.field3881 = new int[0];
        this.field3878 = new int[0];
        this.field3893 = new class4();
        this.field3893.field3117 = 1;
        this.field3886 = new class4();
        this.field3883 = new class195[] { this.field3893, this.field3886 };
        this.field3886.field3117 = 1;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lfj;)V", line = 704)
    public class242(class3 arg0) {
        int var2 = 0;
        int var3 = arg0.method64((byte) 113);
        int var4 = 0;
        this.field3883 = new class195[var3];
        int[][] var5 = new int[var3][];
        for (int var6 = 0; var6 < var3; var6++) {
            class195 var7 = class205.method1293(-103, arg0);
            if (var7.method351((byte) 98) >= 0) {
                var2++;
            }
            if (var7.method1081(96) >= 0) {
                var4++;
            }
            int var8 = var7.field3120.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method64((byte) 16);
            }
            this.field3883[var6] = var7;
        }
        this.field3878 = new int[var4];
        int var10 = 0;
        this.field3881 = new int[var2];
        int var11 = 0;
        for (int var12 = 0; var12 < var3; var12++) {
            class195 var13 = this.field3883[var12];
            int var14 = var13.field3120.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field3120[var15] = this.field3883[var5[var12][var15]];
            }
            int var16 = var13.method351((byte) 99);
            int var17 = var13.method1081(126);
            if (var16 > 0) {
                this.field3881[var11++] = var16;
            }
            if (var17 > 0) {
                this.field3878[var10++] = var17;
            }
            var5[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field3893 = this.field3883[arg0.method64((byte) 55)];
        this.field3886 = this.field3883[arg0.method64((byte) 100)];
    }
}
