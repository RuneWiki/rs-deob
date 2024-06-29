import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class462 {

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "[I")
    private int[] field6257 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field6253 = 12;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "Z")
    public static boolean field6262 = false;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Lr;")
    public static class110 field6255;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Lr;")
    public static class110 field6261;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "Le;")
    public class341 field6270;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ge", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field6271;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "[I")
    private int[] field6267;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "[S")
    private short[] field6252;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "[S")
    private short[] field6254;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "[S")
    private short[] field6256;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "[S")
    private short[] field6259;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2723(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)Z", line = 5)
    public final boolean method2713(byte arg0) {
        field6251++;
        boolean var2 = true;
        class110 var3 = this.field6270.field4563;
        synchronized (this.field6270.field4563) {
            if (arg0 != 92) {
                method2722(-64, 44, 72, (String) null, 89, 49, 92, 25);
            }
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field6257[var4] != -1 && !this.field6270.field4563.method701(0, arg0 + 12955, this.field6257[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILbt;)V", line = 49)
    private final void method2714(int arg0, int arg1, class32 arg2) {
        field6258++;
        if (arg0 == 1) {
            arg2.method201((byte) -125);
        } else if (arg0 == 2) {
            int var4 = arg2.method201((byte) -106);
            this.field6267 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6267[var5] = arg2.method215((byte) 121);
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var8 = arg2.method201((byte) -125);
                this.field6256 = new short[var8];
                this.field6254 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field6254[var9] = (short) arg2.method215((byte) 107);
                    this.field6256[var9] = (short) arg2.method215((byte) 123);
                }
            } else if (arg0 == 41) {
                int var6 = arg2.method201((byte) -114);
                this.field6252 = new short[var6];
                this.field6259 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field6259[var7] = (short) arg2.method215((byte) 126);
                    this.field6252[var7] = (short) arg2.method215((byte) 95);
                }
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field6257[arg0 - 60] = arg2.method215((byte) 127);
            }
        }
        if (arg1 != -9430) {
            this.method2715(false);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)Z", line = 131)
    public final boolean method2715(boolean arg0) {
        field6264++;
        if (this.field6267 == null) {
            return true;
        }
        boolean var2 = arg0;
        class110 var3 = this.field6270.field4563;
        synchronized (this.field6270.field4563) {
            for (int var4 = 0; var4 < this.field6267.length; var4++) {
                if (!this.field6270.field4563.method701(0, 13047, this.field6267[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lbt;I)V", line = 164)
    public final void method2716(class32 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method201((byte) -128);
            if (var3 == 0) {
                field6260++;
                if (arg1 > -36) {
                    this.field6257 = null;
                    return;
                }
                return;
            }
            this.method2714(var3, -9430, arg0);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)V", line = 191)
    public static void method2717(byte arg0) {
        field6261 = null;
        field6255 = null;
        if (arg0 > -54) {
            method2722(21, -119, -102, (String) null, 105, 20, 79, 98);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)Lpr;", line = 203)
    public final class284 method2718(boolean arg0) {
        if (!arg0) {
            field6262 = true;
        }
        field6265++;
        class284[] var2 = new class284[5];
        int var3 = 0;
        class110 var4 = this.field6270.field4563;
        synchronized (this.field6270.field4563) {
            for (int var5 = 0; var5 < 5; var5++) {
                if (this.field6257[var5] != -1) {
                    var2[var3++] = class346.method2136(0, false, this.field6270.field4563, this.field6257[var5]);
                }
            }
        }
        class284 var6 = new class284(var2, var3);
        if (this.field6254 != null) {
            for (int var7 = 0; var7 < this.field6254.length; var7++) {
                var6.method1611(this.field6254[var7], this.field6256[var7], arg0);
            }
        }
        if (this.field6259 != null) {
            for (int var8 = 0; var8 < this.field6259.length; var8++) {
                var6.method1606(!arg0, this.field6252[var8], this.field6259[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V", line = 262)
    public static final void method2719(int arg0) {
        field6268++;
        if (arg0 != 17477) {
            method2717((byte) 74);
        }
        for (class160 var1 = (class160) class347.field4785.method652((byte) 37); var1 != null; var1 = (class160) class347.field4785.method653(arg0 ^ 0x444C)) {
            if (class289.field3897 == null) {
                var1.method2614((byte) -71);
            } else if (class70.field968 >= var1.field2224) {
                int var14 = class7.field92[var1.field2222];
                if (var14 == 0) {
                    class327 var15 = class413.method2478(var1.field2215, var1.field2223, var1.field2214);
                    if (var15 instanceof class173) {
                        class220.method1250(var1.field2215, var1.field2223, var1.field2214);
                        class173 var16 = (class173) var15;
                        if (var16.field2368 != null) {
                            class348.method2150(var1.field2215, var1.field2223, var1.field2214, var16.field2368, (class327) null);
                        }
                    }
                } else if (var14 == 1) {
                    class451 var17 = class425.method2509(var1.field2215, var1.field2223, var1.field2214);
                    if (var17 instanceof class127) {
                        class244.method1361(var1.field2215, var1.field2223, var1.field2214);
                        class127 var18 = (class127) var17;
                        if (var18.field1865 != null) {
                            class9.method61(var1.field2215, var1.field2223, var1.field2214, var18.field1865, (class451) null);
                        }
                    }
                } else if (var14 == 2) {
                    class471 var21 = class4.method29(var1.field2215, var1.field2223, var1.field2214, field6271 == null ? (field6271 = method2723("id")) : field6271);
                    if (var21 instanceof class94) {
                        class486.method2820(var1.field2215, var1.field2223, var1.field2214, field6271 == null ? (field6271 = method2723("id")) : field6271);
                        class94 var22 = (class94) var21;
                        if (var22.field1393 != null) {
                            class214.method1212(var22.field1393, false);
                        }
                    }
                } else if (var14 == 3) {
                    class354 var19 = class146.method870(var1.field2215, var1.field2223, var1.field2214);
                    if (var19 instanceof class183) {
                        class187.method1080(var1.field2215, var1.field2223, var1.field2214);
                        class183 var20 = (class183) var19;
                        if (var20.field2519 != null) {
                            class66.method438(var1.field2215, var1.field2223, var1.field2214, var20.field2519);
                        }
                    }
                }
                var1.method2614((byte) -125);
            } else if (class70.field968 == var1.field2205) {
                int var2 = class7.field92[var1.field2222];
                if (var2 == 0) {
                    class327 var12 = class413.method2478(var1.field2215, var1.field2223, var1.field2214);
                    if (var12 instanceof class173) {
                        var1.method2614((byte) -117);
                    } else if (class476.method2778(var1.field2215, var1.field2223, var1.field2214) == null) {
                        class173 var13 = new class173(var1.field2222, var1.field2216, var1.field2209, var1.field2219, var1.field2206, var12);
                        class348.method2150(var1.field2215, var1.field2223, var1.field2214, var13, (class327) null);
                    } else {
                        var1.method2614((byte) -96);
                    }
                } else if (var2 == 1) {
                    class451 var3 = class425.method2509(var1.field2215, var1.field2223, var1.field2214);
                    if (var3 instanceof class127) {
                        var1.method2614((byte) -116);
                    } else if (class369.method2280(var1.field2215, var1.field2223, var1.field2214) == null) {
                        class127 var4 = new class127(var1.field2222, var1.field2216, var1.field2209, var1.field2219, var1.field2206, var3);
                        class9.method61(var1.field2215, var1.field2223, var1.field2214, var4, (class451) null);
                    } else {
                        var1.method2614((byte) -98);
                    }
                } else if (var2 == 2) {
                    class471 var7 = class4.method29(var1.field2215, var1.field2223, var1.field2214, field6271 == null ? (field6271 = method2723("id")) : field6271);
                    if (var7 instanceof class94) {
                        var1.method2614((byte) -115);
                    } else {
                        class486.method2820(var1.field2215, var1.field2223, var1.field2214, field6271 == null ? (field6271 = method2723("id")) : field6271);
                        class88 var8 = class1.field23.method935(var1.field2217, (byte) 106);
                        int var9;
                        int var10;
                        if (var1.field2216 == 1 || var1.field2216 == 3) {
                            var10 = var8.field1305;
                            var9 = var8.field1249;
                        } else {
                            var9 = var8.field1305;
                            var10 = var8.field1249;
                        }
                        class94 var11 = new class94(var1.field2222, var1.field2216, var1.field2215, var1.field2209, var1.field2219, var1.field2206, var1.field2223, var1.field2223 + var9 - 1, var1.field2214, var10 + var1.field2214 - 1, var7);
                        class214.method1212(var11, false);
                    }
                } else if (var2 == 3) {
                    class354 var5 = class146.method870(var1.field2215, var1.field2223, var1.field2214);
                    if (var5 instanceof class183) {
                        var1.method2614((byte) -79);
                    } else {
                        class183 var6 = new class183(var1.field2209, var1.field2219, var1.field2206, var5);
                        class66.method438(var1.field2215, var1.field2223, var1.field2214, var6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)Lpr;", line = 471)
    public final class284 method2720(int arg0) {
        field6269++;
        if (this.field6267 == null) {
            return null;
        }
        int var2 = 72 % ((-arg0 - 27) / 55);
        class284[] var3 = new class284[this.field6267.length];
        class110 var4 = this.field6270.field4563;
        synchronized (this.field6270.field4563) {
            int var5 = 0;
            while (true) {
                if (this.field6267.length <= var5) {
                    break;
                }
                var3[var5] = class346.method2136(0, false, this.field6270.field4563, this.field6267[var5]);
                var5++;
            }
        }
        class284 var6;
        if (var3.length == 1) {
            var6 = var3[0];
        } else {
            var6 = new class284(var3, var3.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field6254 != null) {
            for (int var7 = 0; var7 < this.field6254.length; var7++) {
                var6.method1611(this.field6254[var7], this.field6256[var7], true);
            }
        }
        if (this.field6259 != null) {
            for (int var8 = 0; var8 < this.field6259.length; var8++) {
                var6.method1606(false, this.field6252[var8], this.field6259[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(Z)V", line = 534)
    public static final void method2721(boolean arg0) {
        field6266++;
        if (class193.field2616 != null) {
            return;
        }
        class193.field2616 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        if (!arg0) {
            field6262 = false;
        }
        while (var3 < 65536) {
            double var4 = (double) ((var3 & 0xFC82) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x386) >> 7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if (var8 < 0.5D) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - var6 * var8;
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if ((var4 * 6.0D < 1.0D)) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if (var4 * 3.0D < 2.0D) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if ((var24 * 3.0D < 2.0D)) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class193.field2616[var3] = var35;
            var3++;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIILjava/lang/String;IIII)V", line = 650)
    public static final void method2722(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6, int arg7) {
        field6263++;
        class64 var8 = new class64();
        var8.field847 = class70.field968 + arg0;
        if (arg5 != -11224) {
            method2721(false);
        }
        var8.field851 = arg1;
        var8.field857 = arg3;
        var8.field854 = arg2;
        var8.field856 = arg6;
        var8.field855 = arg4;
        var8.field846 = arg7;
        class367.field5048.method2767(-1830, var8);
    }
}
