import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class408 implements class241 {

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public int field6173;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    public int field6174;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public int field6176;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    public int field6177;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
    public int field6179;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
    public int field6181;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "Lwp;")
    public static class121 field6180;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "Z")
    public boolean field6178;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIILza;Lwk;Lrk;Lvp;I)V", line = 4)
    public static final void method2527(int arg0, int arg1, int arg2, class288 arg3, class97 arg4, class25 arg5, class126 arg6, int arg7) {
        field6172++;
        int var8 = arg4.field1887 - (arg0 / 2) - 5;
        int var9 = arg1 + 2;
        if (arg5.field350 != 0) {
            arg3.method1809(var9, var8, arg5.field350, (arg1 + (arg2 * arg6.method996())) + 1 - var9, arg0 + 10, -7456);
        }
        if (arg5.field384 != 0) {
            arg3.method1806(1, arg0 + 10, var8, arg5.field384, arg6.method996() * arg2 + arg1 + 1 - var9, var9);
        }
        int var10 = arg5.field344;
        if (arg7 >= -111) {
            return;
        }
        if (arg4.field1891 && arg5.field376 != -1) {
            var10 = arg5.field376;
        }
        for (int var11 = 0; var11 < arg2; var11++) {
            String var12 = class395.field6020[var11];
            if (var11 < arg2 - 1) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg6.method992(arg3, var12, arg4.field1887, arg1, var10, true);
            arg1 += arg6.method996();
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)V", line = 45)
    public static void method2528(boolean arg0) {
        field6180 = null;
        if (!arg0) {
            field6180 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(III)Z", line = 56)
    public static final boolean method2529(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field6180 = null;
        }
        field6183++;
        return (arg0 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lwk;BLrk;Lza;)V", line = 73)
    public static final void method2530(class97 arg0, byte arg1, class25 arg2, class288 arg3) {
        field6184++;
        class24 var4 = arg2.method171(-1, arg3);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method157();
        if (var5 < var4.method154()) {
            var5 = var4.method154();
        }
        byte var6 = 10;
        int var7 = arg0.field1887;
        int var8 = arg0.field1895;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg2.field370 != null) {
            var9 = class264.field4032.method2817((byte) 102, class395.field6020, arg2.field370, null, null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class395.field6020[var12];
                if (var9 - 1 > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class456.field6773.method997(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = class456.field6773.method996() * var9 + (class456.field6773.method995() / 2);
        }
        int var15 = var5 / 2 + arg0.field1887;
        int var16 = arg0.field1895;
        if (arg1 <= 23) {
            method2528(false);
        }
        if (var7 < class319.field4864 + var5) {
            var15 = var10 / 2 + var5 / 2 + class319.field4864 + var6 + 5;
            var7 = class319.field4864;
        } else if (var7 > (class319.field4875 - var5)) {
            var15 = class319.field4875 - (var10 / 2) - var6 - (var5 / 2) - 5;
            var7 = class319.field4875 - var5;
        }
        if ((class319.field4866 + var5) > var8) {
            var8 = class319.field4866;
            var16 = var5 / 2 + class319.field4866 + var6;
        } else if (class319.field4870 - var5 < var8) {
            var16 = class319.field4870 - (var5 / 2) - var6 - var11;
            var8 = class319.field4870 - var5;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg0.field1887), (double) (var8 - arg0.field1895)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method164((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg2.field370 != null) {
            var18 = var15 - var10 / 2 - 5;
            var19 = var16;
            var21 = var16 + (var9 * class456.field6773.method996()) + 3;
            var20 = var18 + var10 + 10;
            if (arg2.field350 != 0) {
                arg3.method1809(var16, var18, arg2.field350, var21 - var16, -var18 + var20, -7456);
            }
            if (arg2.field384 != 0) {
                arg3.method1806(1, var20 - var18, var18, arg2.field384, var21 - var16, var16);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class395.field6020[var22];
                if (var22 < var9 - 1) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class456.field6773.method992(arg3, var23, var15, var16, arg2.field344, true);
                var16 += class456.field6773.method996();
            }
        }
        if (arg2.field356 == -1 && arg2.field370 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class463 var25 = new class463(arg0);
        var25.field6878 = var8 + var24;
        var25.field6881 = var18;
        var25.field6882 = var7 + var24;
        var25.field6879 = var20;
        var25.field6874 = var7 - var24;
        var25.field6871 = var19;
        var25.field6877 = var21;
        var25.field6873 = var8 - var24;
        class454.field6754.method1885(false, var25);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lza;Z)V", line = 223)
    public static final void method2531(class288 arg0, boolean arg1) {
        field6182++;
        if (!(class332.field5041 >= 2 || class233.field3597) || class253.field3885 != null) {
            return;
        }
        String var2;
        if (class233.field3597 && class332.field5041 < 2) {
            var2 = class101.field1932 + class8.field121.method1977(class146.field2452, -61) + class373.field5465 + " ->";
        } else if (class479.field7063 && class179.field2912.method1458(100, 81) && class332.field5041 > 2) {
            var2 = class477.method2850(117, (class328) class373.field5469.field4458.field3976.field3976);
        } else {
            class328 var3 = (class328) class373.field5469.field4458.field3976;
            var2 = class477.method2850(63, var3);
            int[] var4 = null;
            if (class40.method251(var3.field4972, -7010)) {
                var4 = class135.field2271.method1636((int) var3.field4981, -117).field196;
            } else if (var3.field4973 != -1) {
                var4 = class135.field2271.method1636(var3.field4973, -125).field196;
            } else if (class470.method2810(-125, var3.field4972)) {
                class435 var7 = (class435) class209.field3337.method1622((long) ((int) var3.field4981), -114);
                if (var7 != null) {
                    class163 var8 = var7.field6471;
                    class51 var9 = var8.field2613;
                    if (var9.field1038 != null) {
                        var9 = var9.method475(class402.field6080, -1);
                    }
                    if (var9 != null) {
                        var4 = var9.field1053;
                    }
                }
            } else if (class473.method2826(92, var3.field4972)) {
                Object var5 = null;
                class306 var6;
                if (var3.field4972 == 1003) {
                    var6 = class123.field2142.method1530((byte) -58, (int) var3.field4981);
                } else {
                    var6 = class123.field2142.method1530((byte) -44, (int) (var3.field4981 >>> 32 & 0x7FFFFFFFL));
                }
                if (var6.field4593 != null) {
                    var6 = var6.method1951(class402.field6080, 0);
                }
                if (var6 != null) {
                    var4 = var6.field4644;
                }
            }
            if (var4 != null) {
                var2 = var2 + class444.method2658(var4, -117);
            }
        }
        if (class332.field5041 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class332.field5041 - 2) + class261.field3980.method1977(class146.field2452, -31);
        }
        if (class362.field5300 != null) {
            class317 var10 = class362.field5300.method2388(arg0, -83);
            if (var10 == null) {
                var10 = class356.field5232;
            }
            var10.method2002(class362.field5300.field5717, class362.field5300.field5674, class362.field5300.field5712, class362.field5300.field5809, (byte) -109, class120.field2102, class365.field5333, client.field3219, var2, class79.field1577, class410.field6210, class362.field5300.field5811, class447.field6657, class362.field5300.field5745, class519.field7537);
            class205.method1403(0, class519.field7537[2], class519.field7537[1], class519.field7537[3], class519.field7537[0]);
        } else if (class533.field7745 != null && class424.field6366 == class316.field4779) {
            int var11 = class356.field5232.method2014((byte) 9, class172.field2779 + 16, client.field3219, class365.field5333, class521.field7567 + 4, class410.field6210, 0, 16777215, class120.field2102, var2);
            class205.method1403(0, class272.field4126.method2808(var2, -106) + var11, class172.field2779, 16, class521.field7567 + 4);
        }
        if (!arg1) {
            method2531(null, false);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)J", line = 327)
    public final long method1577(byte arg0) {
        field6186++;
        long[] var2 = class186.field2992;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field6181 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) (((long) (this.field6176 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var2[(int) ((var7 ^ (long) this.field6176) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field6174 >> 24) ^ var9) & 0xFFL)];
        long var13 = var2[(int) (((long) (this.field6174 >> 16) ^ var11) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) ((var13 ^ (long) (this.field6174 >> 8)) & 0xFFL)];
        long var17 = var15 >>> 8 ^ var2[(int) ((var15 ^ (long) this.field6174) & 0xFFL)];
        long var19 = var2[(int) (((long) this.field6179 ^ var17) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var2[(int) ((var19 ^ (long) (this.field6177 >> 24)) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var2[(int) ((var21 ^ (long) (this.field6177 >> 16)) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var23 >>> 8 ^ var2[(int) ((var23 ^ (long) (this.field6177 >> 8)) & 0xFFL)];
        long var27 = var25 >>> 8 ^ var2[(int) (((long) this.field6177 ^ var25) & 0xFFL)];
        long var29 = var2[(int) ((var27 ^ (long) this.field6173) & 0xFFL)] ^ var27 >>> 8;
        long var31 = var29 >>> 8 ^ var2[(int) (((long) (this.field6178 ? 1 : 0) ^ var29) & 0xFFL)];
        return arg0 <= 17 ? -52L : var31;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILws;)Z", line = 357)
    public final boolean method1578(int arg0, class241 arg1) {
        field6175++;
        if (!(arg1 instanceof class408)) {
            return false;
        }
        class408 var3 = (class408) arg1;
        if (this.field6181 != var3.field6181) {
            return false;
        } else if (arg0 != 2185) {
            return true;
        } else if (this.field6176 != var3.field6176) {
            return false;
        } else if (this.field6174 != var3.field6174) {
            return false;
        } else if (this.field6179 != var3.field6179) {
            return false;
        } else if (this.field6177 != var3.field6177) {
            return false;
        } else if (this.field6173 == var3.field6173) {
            return var3.field6178 == this.field6178;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(Z)V", line = 398)
    public static final void method2532(boolean arg0) {
        field6185++;
        if (!arg0) {
            method2532(true);
        }
        class199.field3221.method2475((byte) 67);
    }
}
