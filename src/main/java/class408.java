import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class408 extends class11 {

    @OriginalMember(owner = "client!v", name = "J", descriptor = "Lwj;")
    public static class270 field5963 = new class270(16, 0);

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "Lwj;")
    public static class270 field5970;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "Lem;")
    public static class150 field5971;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    private int field5962;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    private int field5964;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    private int field5966;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    public static int field5969;

    static {
        new class466("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field5970 = new class270(51, 3);
        field5971 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lsi;II)V", line = 10)
    public final void method43(class391 arg0, int arg1, int arg2) {
        ++field5967;
        if (arg2 == 0) {
            this.method2441((byte) -76, arg0.method2338(true));
        }
        if (arg1 >= -40) {
            method2442(6);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lsk;IZ)V", line = 37)
    public static final void method2440(class438 arg0, int arg1, boolean arg2) {
        ++field5965;
        if (class274.field3764 < 400) {
            if (class316.field4324 == arg0) {
                if (class59.field720 && ~(16 & class13.field199) != -1) {
                    ++class433.field6354;
                    class407.method2438(30, class352.field5167, true, 0L, class78.field1131, 0, class253.field3513 + " -> <col=ffffff>" + class453.field6661.method2731(62, class372.field5455), -1, 500, false, 0);
                }
            } else {
                if (arg1 != 5) {
                    field5971 = null;
                }
                String var3;
                if (arg0.field6424 != 0) {
                    var3 = arg0.method2588((byte) 91, true) + " (" + class209.field2907.method2731(62, class372.field5455) + arg0.field6424 + ")";
                } else {
                    boolean var4 = true;
                    if (class316.field4324.field6430 != -1 && ~arg0.field6430 != 0) {
                        int var5 = ~class316.field4324.field6415 < ~arg0.field6415 ? class316.field4324.field6415 : arg0.field6415;
                        int var6 = ~arg0.field6430 >= ~class316.field4324.field6430 ? arg0.field6430 : class316.field4324.field6430;
                        int var7 = var5 * 10 / 100 + var6 + 5;
                        int var8 = -arg0.field6415 + class316.field4324.field6415;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        if (var8 > var7) {
                            var4 = false;
                        }
                    }
                    String var9 = class323.field4400 != class11.field173 ? class233.field3285.method2731(62, class372.field5455) : class490.field7166.method2731(62, class372.field5455);
                    if (arg0.field6450 > arg0.field6415) {
                        var3 = arg0.method2588((byte) 77, true) + (!var4 ? "<col=ffffff>" : class336.method1924(arg0.field6415, class316.field4324.field6415, (byte) -125)) + " (" + var9 + arg0.field6415 + "+" + (-arg0.field6415 + arg0.field6450) + ")";
                    } else {
                        var3 = arg0.method2588((byte) 117, true) + (!var4 ? "<col=ffffff>" : class336.method1924(arg0.field6415, class316.field4324.field6415, (byte) -125)) + " (" + var9 + arg0.field6415 + ")";
                    }
                }
                if (class59.field720) {
                    if (!arg2 && (class13.field199 & 8) != 0) {
                        ++class84.field1256;
                        class407.method2438(12, class352.field5167, true, (long) arg0.field1035, class78.field1131, 0, class253.field3513 + " -> <col=ffffff>" + var3, -1, 500, false, 0);
                    }
                } else if (!arg2) {
                    for (int var10 = 7; ~var10 <= -1; --var10) {
                        if (class166.field2507[var10] != null) {
                            short var11 = 0;
                            if (class323.field4400 == class166.field2502 && class166.field2507[var10].equalsIgnoreCase(class211.field2939.method2731(62, class372.field5455))) {
                                if (class316.field4324.field6415 < arg0.field6415) {
                                    var11 = 2000;
                                }
                                if (~class316.field4324.field6412 != -1 && arg0.field6412 != 0) {
                                    if (~class316.field4324.field6412 != ~arg0.field6412) {
                                        var11 = 0;
                                    } else {
                                        var11 = 2000;
                                    }
                                }
                            } else if (class476.field6945[var10]) {
                                var11 = 2000;
                            }
                            short var12 = (short) (class22.field307[var10] + var11);
                            int var13 = ~class97.field1473[var10] == 0 ? class380.field5557 : class97.field1473[var10];
                            ++class67.field915;
                            class407.method2438(var12, var13, true, (long) arg0.field1035, class166.field2507[var10], 0, "<col=ffffff>" + var3, -1, 500, false, 0);
                        }
                    }
                } else {
                    class407.method2438(-1, -1, false, 0L, "<col=cccccc>" + var3, 0, "", 0, arg1 + 495, true, 0);
                }
                if (!arg2) {
                    for (class82 var14 = (class82) class526.field7778.method2818((byte) -73); var14 != null; var14 = (class82) class526.field7778.method2820((byte) -58)) {
                        if (var14.field1230 == 59) {
                            var14.field1240 = "<col=ffffff>" + var3;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)V", line = 184)
    private final void method2441(byte arg0, int arg1) {
        this.field5962 = (arg1 & 16711680) >> 12;
        this.field5966 = 4080 & arg1 << 4;
        this.field5964 = arg1 >> 4 & 4080;
        ++field5961;
        if (arg0 > -33) {
            this.field5962 = -56;
        }
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V", line = 197)
    public static void method2442(int arg0) {
        if (arg0 != -1) {
            method2442(-24);
        }
        field5970 = null;
        field5963 = null;
        field5971 = null;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(I)V", line = 210)
    private class408(int arg0) {
        super(0, false);
        this.method2441((byte) -45, arg0);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLsi;)V", line = 219)
    public static final void method2443(boolean arg0, class391 arg1) {
        ++field5960;
        int var2 = arg1.method2332(2);
        class296.field4077 = new class229[var2];
        for (int var3 = 0; var3 < var2; ++var3) {
            class296.field4077[var3] = new class229();
            class296.field4077[var3].field3248 = arg1.method2332(2);
            class296.field4077[var3].field3247 = arg1.method2320(!arg0);
        }
        class90.field1314 = arg1.method2332(2);
        class413.field6032 = arg1.method2332(2);
        class124.field1847 = arg1.method2332(2);
        class126.field1884 = new class61[-class90.field1314 + class413.field6032 - -1];
        for (int var4 = 0; ~class124.field1847 < ~var4; ++var4) {
            int var5 = arg1.method2332(2);
            class61 var6 = class126.field1884[var5] = new class61();
            var6.field3397 = arg1.method2348(-2);
            var6.field3399 = arg1.method2361((byte) -56);
            var6.field760 = class90.field1314 + var5;
            var6.field758 = arg1.method2320(false);
            var6.field762 = arg1.method2320(false);
        }
        class371.field5421 = arg1.method2361((byte) -56);
        class93.field1367 = arg0;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)[[I", line = 263)
    public final int[][] method41(int arg0, int arg1) {
        ++field5969;
        int[][] var3 = super.field156.method1719(arg1, 3);
        if (super.field156.field4001) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class90.field1316 > var7; ++var7) {
                var4[var7] = this.field5962;
                var5[var7] = this.field5964;
                var6[var7] = this.field5966;
            }
        }
        int var8 = 69 / ((arg0 - -75) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V", line = 304)
    public class408() {
        this(0);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILdr;ILsi;)V", line = 307)
    public static final void method2444(int arg0, class504 arg1, int arg2, class391 arg3) {
        ++field5968;
        class89 var4 = new class89();
        var4.field1296 = arg3.method2348(-2);
        var4.field1298 = arg3.method2361((byte) -56);
        var4.field1299 = new class56[var4.field1296];
        var4.field1297 = new class56[var4.field1296];
        var4.field1295 = new int[var4.field1296];
        var4.field1294 = new int[var4.field1296];
        var4.field1300 = new byte[var4.field1296][][];
        var4.field1293 = new int[var4.field1296];
        for (int var5 = arg0; var4.field1296 > var5; ++var5) {
            try {
                int var6 = arg3.method2348(-2);
                if (var6 != 0 && ~var6 != -2 && ~var6 != -3) {
                    if (~var6 == -4 || ~var6 == -5) {
                        String var10 = arg3.method2347((byte) -41);
                        String var11 = arg3.method2347((byte) 47);
                        int var12 = arg3.method2348(arg0 ^ -2);
                        String[] var13 = new String[var12];
                        for (int var14 = 0; ~var14 > ~var12; ++var14) {
                            var13[var14] = arg3.method2347((byte) 84);
                        }
                        byte[][] var15 = new byte[var12][];
                        if (var6 == 3) {
                            for (int var16 = 0; var12 > var16; ++var16) {
                                int var17 = arg3.method2361((byte) -56);
                                var15[var16] = new byte[var17];
                                arg3.method2362(var17, var15[var16], 0, (byte) -54);
                            }
                        }
                        var4.field1293[var5] = var6;
                        Class[] var18 = new Class[var12];
                        for (int var19 = 0; var12 > var19; ++var19) {
                            var18[var19] = class398.method2398(var13[var19], 0);
                        }
                        var4.field1297[var5] = arg1.method2973(8, var11, class398.method2398(var10, 0), var18);
                        var4.field1300[var5] = var15;
                    }
                } else {
                    String var7 = arg3.method2347((byte) 58);
                    String var8 = arg3.method2347((byte) 42);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg3.method2361((byte) -56);
                    }
                    var4.field1293[var5] = var6;
                    var4.field1294[var5] = var9;
                    var4.field1299[var5] = arg1.method2974((byte) -107, class398.method2398(var7, 0), var8);
                }
            } catch (ClassNotFoundException var20) {
                var4.field1295[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1295[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1295[var5] = -3;
            } catch (Exception var23) {
                var4.field1295[var5] = -4;
            } catch (Throwable var24) {
                var4.field1295[var5] = -5;
            }
        }
        class269.field3717.method2809(var4, arg0 + 2);
    }
}
