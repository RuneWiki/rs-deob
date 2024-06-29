import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class114 {

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    private int field2058;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "[[I")
    private int[][] field2057;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    private int field2065;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2055 = "Loading interfaces - ";

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "Lbn;")
    public static class75 field2066;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII)V", line = 5)
    public static final void method840(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 49) {
            field2055 = (String) null;
        }
        field2063++;
        class199 var4 = class173.method1231(false, 9, arg2);
        var4.method1367((byte) -10);
        var4.field3338 = arg1;
        var4.field3343 = arg3;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)I", line = 21)
    public final int method841(int arg0, byte arg1) {
        if (arg1 < 121) {
            field2059 = 48;
        }
        if (this.field2057 != null) {
            arg0 = (int) ((long) this.field2058 * (long) arg0 / (long) this.field2065);
        }
        field2060++;
        return arg0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBII)I", line = 36)
    public static final int method842(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 > -28) {
            field2055 = (String) null;
        }
        field2068++;
        return arg0 <= arg2 ? (arg2 > arg3 ? arg3 : arg2) : arg0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZ)I", line = 56)
    public final int method843(int arg0, boolean arg1) {
        field2062++;
        if (arg1) {
            method842(19, (byte) 29, -9, 21);
        }
        if (this.field2057 != null) {
            arg0 = ((int) ((long) this.field2058 * (long) arg0 / (long) this.field2065)) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIZZI)V", line = 72)
    public static final void method844(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        class223.field3692++;
        field2061++;
        if (class96.field1750 != null && (class96.field1750.field199 - (class96.field1750.method49((byte) -78) - 1) * 64 >> 7) == class92.field1637 && class96.field1750.field213 + 64 - (class96.field1750.method49((byte) -116) * 64) >> 7 == class284.field4641) {
            class92.field1637 = 0;
            class275.field4492 = false;
        }
        class46.method377(-127);
        if (!arg3) {
            class115.method855((byte) -106);
        }
        class108.method795(44);
        if (class241.field4016) {
            class73.method553(arg5, arg0, arg1, arg2, true, (byte) -67);
            arg5 = class319.field5194;
            arg0 = class269.field4376;
            arg1 = class140.field2376;
            arg2 = class204.field3396;
        }
        class214.field3545 = arg1;
        class214.field3542 = arg2;
        if (class69.field1280 == 1) {
            int var8 = (int) class87.field1523;
            if (class284.field4656 / 256 > var8) {
                var8 = class284.field4656 / 256;
            }
            if (class195.field3271[4] && var8 < class231.field3790[4] + 128) {
                var8 = class231.field3790[4] + 128;
            }
            int var9 = (int) class354.field5652 + class12.field372 & 0x7FF;
            class144.method984(var8 * 3 + 600, class33.field724, class244.field4052, var8, (byte) 29, arg0, class21.method189((byte) 39, class96.field1750.field213, class96.field1750.field199, class276.field4506) - 50, var9);
        } else if (class69.field1280 == 4) {
            int var6 = (int) class354.field5652 & 0x7FF;
            int var7 = (int) class87.field1523;
            if (var7 < class284.field4656 / 256) {
                var7 = class284.field4656 / 256;
            }
            if (class195.field3271[4] && var7 < (class231.field3790[4] + 128)) {
                var7 = class231.field3790[4] + 128;
            }
            class144.method984(var7 * 3 + 600, class33.field724, class244.field4052, var7, (byte) 29, arg0, class21.method189((byte) -49, class212.field3511, class250.field4114, class276.field4506) - 50, var6);
        } else if (class69.field1280 == 5) {
            class98.method748(-9808, arg0);
        }
        int var10 = class18.field500;
        int var11 = class298.field4847;
        int var12 = class223.field3693;
        int var13 = class141.field2380;
        int var14 = class16.field462;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class195.field3271[var15]) {
                int var16 = (int) (Math.random() * (double) (class334.field5318[var15] * 2 + 1) + Math.sin((double) class19.field507[var15] / 100.0D * (double) class219.field3642[var15]) * (double) class231.field3790[var15] - (double) class334.field5318[var15]);
                if (var15 == 1) {
                    class141.field2380 += var16;
                }
                if (var15 == 0) {
                    class223.field3693 += var16;
                }
                if (var15 == 3) {
                    class18.field500 = class18.field500 + var16 & 0x7FF;
                }
                if (var15 == 2) {
                    class16.field462 += var16;
                }
                if (var15 == 4) {
                    class298.field4847 += var16;
                    if (class298.field4847 < 128) {
                        class298.field4847 = 128;
                    }
                    if (class298.field4847 > 383) {
                        class298.field4847 = 383;
                    }
                }
            }
        }
        class51.method448((byte) 85);
        if (class241.field4016) {
            class337.method2385(arg2, arg1, arg2 + arg5, arg0 + arg1);
            float var18 = (float) class298.field4847 * 0.17578125F;
            boolean var19 = false;
            float var20 = (float) class18.field500 * 0.17578125F;
            if (class69.field1280 == 3) {
                var18 = class180.field2963 * 360.0F / 6.2831855F;
                var20 = class23.field571 * 360.0F / 6.2831855F;
            }
            int var21;
            if (class334.field5326 == 10) {
                var21 = class344.method2421(122, class16.field462 >> 10, class152.field2601, class223.field3693 >> 10, class197.field3303);
            } else {
                var21 = class344.method2421(120, class96.field1750.field170[0] >> 3, class152.field2601, class96.field1750.field139[0] >> 3, class197.field3303);
            }
            if (class86.field1494 >= 0) {
                class241.method1721();
                class17 var22 = class12.method123(class25.field650, class109.field2000, class86.field1494, (byte) 107, class162.field2724);
                var22.method170(class316.field5150, arg2, arg1, arg5, arg0, class298.field4847, class18.field500, var21);
            } else {
                class241.method1703(var21);
            }
            class241.method1710(arg2, arg1, arg5, arg0, arg5 / 2 + arg2, arg0 / 2 + arg1, var18, var20, class177.field2929, class177.field2929);
            class149.method1072(4, false);
            class241.method1695();
            class241.method1705(true);
            class241.method1696(true);
        } else {
            class270.method1891(arg2, arg1, arg2 + arg5, arg1 - -arg0);
            class305.method2226();
            if (class86.field1494 >= 0) {
                class17 var17 = class12.method123(class25.field650, class109.field2000, class86.field1494, (byte) 107, class162.field2724);
                var17.method169(class316.field5150, arg2, arg1, arg5, arg0, class298.field4847, class18.field500, 0);
            } else {
                class270.method1894(arg2, arg1, arg5, arg0, 0);
            }
        }
        if (class5.field87 || class57.field1135 < arg2 || class57.field1135 >= arg2 + arg5 || class250.field4111 < arg1 || arg0 + arg1 <= class250.field4111) {
            class285.field4657 = false;
            class99.field1817 = 0;
            class162.field2721 = true;
        } else {
            class285.field4657 = true;
            class99.field1817 = 0;
            class162.field2721 = true;
            int var23 = class349.field5581;
            int var24 = class349.field5587;
            int var25 = class22.field559;
            class306.field4980 = (class57.field1135 - arg2) * (var23 - var25) / arg5 + var25;
            int var26 = class7.field264;
            class65.field1241 = (class250.field4111 - arg1) * (var26 - var24) / arg0 + var24;
        }
        class119.method865(-4097);
        byte var27 = class213.method1469(arg4) == 2 ? (byte) class223.field3692 : 1;
        if (class241.field4016) {
            class2.method23(class267.field4371, !class359.field5723);
            class101.method761(class223.field3693, class16.field462, true, class298.field4847, class141.field2380, class18.field500);
            class241.field4024 = class267.field4371;
            class334.method2355(class223.field3693, class141.field2380, class16.field462, class298.field4847, class18.field500, class306.field4975, class144.field2421, class56.field1111, class235.field3849, class359.field5725, class280.field4577, class276.field4506 + 1, var27, class96.field1750.field199 >> 7, class96.field1750.field213 >> 7);
            class44.field911 = true;
            class2.method29();
            class101.method761(0, 0, !arg4, 0, 0, 0);
            class119.method865(-4097);
            class59.method492(class177.field2929, -63, arg5, class177.field2929, arg0, arg1, arg2);
            class295.method2119(class177.field2929, arg1, arg2, class177.field2929, arg0, (byte) 72, arg5);
            class9.method99();
        } else {
            class334.method2355(class223.field3693, class141.field2380, class16.field462, class298.field4847, class18.field500, class306.field4975, class144.field2421, class56.field1111, class235.field3849, class359.field5725, class280.field4577, class276.field4506 + 1, var27, class96.field1750.field199 >> 7, class96.field1750.field213 >> 7);
            class119.method865(-4097);
            class9.method99();
            class59.method492(256, 85, arg5, 256, arg0, arg1, arg2);
            class295.method2119(256, arg1, arg2, 256, arg0, (byte) 118, arg5);
        }
        ((class7) class305.field4968).method75(17, class197.field3303);
        class351.method2504(arg5, arg2, arg1, (byte) -68, arg0);
        class223.field3693 = var12;
        class18.field500 = var10;
        class16.field462 = var14;
        class298.field4847 = var11;
        class141.field2380 = var13;
        if (class295.field4813 && class90.field1608.method2480(128) == 0) {
            class295.field4813 = false;
        }
        if (class295.field4813) {
            if (class241.field4016) {
                class337.method2378(arg2, arg1, arg5, arg0, 0);
            } else {
                class270.method1894(arg2, arg1, arg5, arg0, 0);
            }
            class312.method2268(class284.field4645, false, (byte) 91);
        }
        if (!arg3 && !class295.field4813 && !class5.field87 && arg2 <= class57.field1135 && class57.field1135 < (arg2 + arg5) && class250.field4111 >= arg1 && class250.field4111 < (arg0 + arg1)) {
            class107.method793(class250.field4111, arg1, arg0, class57.field1135, (byte) -125, arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V", line = 322)
    public static void method845(boolean arg0) {
        field2066 = null;
        if (!arg0) {
            field2055 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)V", line = 333)
    public static final void method846(int arg0, int arg1) {
        field2056++;
        if (class215.field3584 == arg1 && arg1 != 0) {
            class67 var2 = class105.field1928[arg1];
            var2.method225(class181.field3150);
        }
        if (arg0 != 26186) {
            method845(true);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V", line = 359)
    public static final void method847(byte arg0) {
        int var1 = class332.field5298;
        field2064++;
        int var2 = class355.field5659;
        if (arg0 >= -26) {
            field2055 = (String) null;
        }
        int var3 = class276.field4505 - class133.field2287 - var1;
        int var4 = class332.field5302 - var2 - class287.field4696;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class202.field3384 != null) {
                var5 = class202.field3384;
            } else if (class274.field4469 == null) {
                var5 = class59.field1164.field2658;
            } else {
                var5 = class274.field4469;
            }
            int var6 = 0;
            int var7 = 0;
            if (class274.field4469 == var5) {
                Insets var8 = class274.field4469.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class332.field5302);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class276.field4505, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class276.field4505 + var6 - var3, var7, var3, class332.field5302);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class332.field5302 + var7 - var4, class276.field4505, var4);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(II)V", line = 421)
    public class114(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class273.method1939(arg1, -122, arg0);
            int var4 = arg1 / var3;
            this.field2058 = var4;
            int var5 = arg0 / var3;
            this.field2057 = new int[var5][14];
            this.field2065 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                double var7 = (double) var4 / (double) var5;
                int[] var9 = this.field2057[var6];
                double var10 = (double) var6 / (double) var5 + 6.0D;
                int var12 = (int) Math.floor(var10 + 1.0D - 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                int var13 = (int) Math.ceil(var10 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var12) {
                    double var14 = ((double) var12 - var10) * 3.141592653589793D;
                    double var16 = var7;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var7 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var10) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I[B)[B", line = 483)
    public final byte[] method848(int arg0, byte[] arg1) {
        field2067++;
        if (this.field2057 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field2058 / (long) this.field2065) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var8 = arg1[var7];
                int[] var9 = this.field2057[var6];
                for (int var10 = 0; var10 < 14; var10++) {
                    var4[var5 + var10] += var9[var10] * var8;
                }
                int var11 = this.field2058 + var6;
                int var12 = var11 / this.field2065;
                var6 = var11 - this.field2065 * var12;
                var5 += var12;
            }
            arg1 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var4[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg1[var13] = -128;
                } else if (var14 > 127) {
                    arg1[var13] = 127;
                } else {
                    arg1[var13] = (byte) var14;
                }
            }
        }
        if (arg0 != 32768) {
            method840(77, -46, -126, -40);
        }
        return arg1;
    }
}
