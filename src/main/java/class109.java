import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class109 implements Runnable {

    @OriginalMember(owner = "client!th", name = "g", descriptor = "Loe;")
    private class139 field2087 = new class139();

    @OriginalMember(owner = "client!th", name = "l", descriptor = "Z")
    private boolean field2092 = false;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public int field2094 = 0;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field2096;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Ljd;")
    public static class86 field2085 = class122.method868("", true);

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "Lbj;")
    public static class151 field2082;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lwj;III)V")
    public static final void method774(class6 arg0, int arg1, int arg2, int arg3) {
        field2090++;
        if (class186.field3299 != 0 && class186.field3299 != 3 || !arg0.method49(arg2 ^ arg2)) {
            return;
        }
        int var4 = arg0.field209[arg1];
        if (var4 > arg3 || arg3 > arg0.field200[arg1] + var4) {
            return;
        }
        int var5 = class86.field1664 + class56.field1145 & 0x7FF;
        int var6 = arg1 - arg0.field131 / 2;
        int var7 = class145.field2742[var5];
        int var8 = (class76.field1515 + 256) * var7 >> 8;
        int var9 = arg3 - arg0.field163 / 2;
        int var10 = class145.field2746[var5];
        int var11 = (class76.field1515 + 256) * var10 >> 8;
        int var12 = var6 * var11 + var8 * var9 >> 11;
        int var13 = class124.field2412.field676 + var12 >> 7;
        int var14 = var6 * var8 - (var9 * var11) >> 11;
        int var15 = class124.field2412.field685 - var14 >> 7;
        if (class38.field905 > 0 && class9.field295[82] && class9.field295[81]) {
            class16.method115(class79.field1554 + var15, class180.field3244, class252.field4481 + var13, (byte) 124);
            return;
        }
        boolean var16 = class48.method375(0, 0, true, class124.field2412.field707[0], var13, 0, 0, 1, var15, class124.field2412.field705[0], 0, -24761);
        if (!var16) {
            return;
        }
        class36.field809.method1388(arg2 - 53, var9);
        class36.field809.method1388(-66, var6);
        class36.field809.method1428((byte) -120, class86.field1664);
        class36.field809.method1388(-122, 57);
        class36.field809.method1388(-40, class56.field1145);
        class36.field809.method1388(arg2 ^ 0xFFFFFFC9, class76.field1515);
        class36.field809.method1388(-93, 89);
        class36.field809.method1428((byte) 75, class124.field2412.field676);
        class36.field809.method1428((byte) -118, class124.field2412.field685);
        class36.field809.method1388(-105, class203.field3682);
        class36.field809.method1388(-97, 63);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILha;)V")
    private final void method775(int arg0, class30 arg1) {
        field2083++;
        class139 var3 = this.field2087;
        synchronized (this.field2087) {
            this.field2087.method991(arg1, true);
            this.field2094++;
            this.field2087.notifyAll();
        }
        if (arg0 != 0) {
            field2085 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lgb;[BII)Lha;")
    public final class30 method776(class144 arg0, byte[] arg1, int arg2, int arg3) {
        field2086++;
        class30 var5 = new class30();
        var5.field4542 = (long) arg2;
        var5.field634 = arg0;
        var5.field632 = 2;
        if (arg3 != 725608299) {
            field2085 = null;
        }
        var5.field636 = arg1;
        var5.field4101 = false;
        this.method775(0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IBLgb;)Lha;")
    public final class30 method777(int arg0, byte arg1, class144 arg2) {
        field2091++;
        class30 var4 = new class30();
        var4.field632 = 1;
        class139 var5 = this.field2087;
        synchronized (this.field2087) {
            class30 var6 = (class30) this.field2087.method995(26386);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field4542 && var6.field634 == arg2 && var6.field632 == 2) {
                    var4.field636 = var6.field636;
                    var4.field4099 = false;
                    return var4;
                }
                var6 = (class30) this.field2087.method996(-84);
            }
        }
        var4.field636 = arg2.method1027((byte) -65, arg0);
        var4.field4099 = false;
        if (arg1 < 53) {
            this.method780((byte) 75, 117, (class144) null);
        }
        var4.field4101 = true;
        return var4;
    }

    @OriginalMember(owner = "client!th", name = "run", descriptor = "()V")
    public final void run() {
        field2088++;
        while (!this.field2092) {
            class139 var1 = this.field2087;
            class30 var2;
            synchronized (this.field2087) {
                var2 = (class30) this.field2087.method990(0);
                if (var2 == null) {
                    try {
                        this.field2087.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field2094--;
            }
            try {
                if (var2.field632 == 2) {
                    var2.field634.method1029(93, var2.field636, var2.field636.length, (int) var2.field4542);
                } else if (var2.field632 == 3) {
                    var2.field636 = var2.field634.method1027((byte) -19, (int) var2.field4542);
                }
            } catch (Exception var6) {
                class143.method1018(var6, (String) null, 104);
            }
            var2.field4099 = false;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZILjd;)V")
    public static final void method778(boolean arg0, int arg1, class86 arg2) {
        field2081++;
        if (arg1 != 3031) {
            return;
        }
        if (arg0) {
            try {
                class168.field3112.getAppletContext().showDocument(arg2.method583(class168.field3112.getCodeBase(), -27), "_blank");
            } catch (Exception var4) {
            }
        } else {
            try {
                class168.field3112.getAppletContext().showDocument(arg2.method583(class168.field3112.getCodeBase(), -40), "_top");
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public final void method779(byte arg0) {
        field2089++;
        this.field2092 = true;
        class139 var2 = this.field2087;
        synchronized (this.field2087) {
            this.field2087.notifyAll();
        }
        try {
            if (arg0 != -12) {
                return;
            }
            this.field2096.join();
        } catch (InterruptedException var3) {
        }
        this.field2096 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BILgb;)Lha;")
    public final class30 method780(byte arg0, int arg1, class144 arg2) {
        field2095++;
        class30 var4 = new class30();
        var4.field632 = 3;
        var4.field4542 = (long) arg1;
        var4.field634 = arg2;
        var4.field4101 = false;
        this.method775(0, var4);
        if (arg0 > -41) {
            this.field2096 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lsa;Z)V")
    public static final void method781(class249 arg0, boolean arg1) {
        class228.field4136.method1731(-91, arg0);
        while (true) {
            class249 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class249[][] var7;
            class249 var66;
            do {
                class249 var65;
                do {
                    class249 var64;
                    do {
                        class249 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class249) class228.field4136.method1735((byte) 62);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field4440);
                                            var3 = var2.field4438;
                                            var4 = var2.field4436;
                                            var5 = var2.field4430;
                                            var6 = var2.field4441;
                                            var7 = class248.field4406[var5];
                                            if (!var2.field4423) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class249 var8 = class248.field4406[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field4440) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class106.field2032 && var3 > class6.field236) {
                                                    class249 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field4440 && (var9.field4423 || (var2.field4425 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class106.field2032 && var3 < class33.field720 - 1) {
                                                    class249 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field4440 && (var10.field4423 || (var2.field4425 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class158.field2966 && var4 > class198.field3526) {
                                                    class249 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field4440 && (var11.field4423 || (var2.field4425 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class158.field2966 && var4 < class194.field3482 - 1) {
                                                    class249 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field4440 && (var12.field4423 || (var2.field4425 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field4423 = false;
                                            if (var2.field4428 != null) {
                                                class249 var13 = var2.field4428;
                                                if (var13.field4442 == null) {
                                                    if (var13.field4444 != null) {
                                                        if (class230.method1600(0, var3, var4)) {
                                                            class129.method912(var13.field4444, class240.field4314, class54.field1102, class13.field401, class211.field3824, var3, var4, true);
                                                        } else {
                                                            class129.method912(var13.field4444, class240.field4314, class54.field1102, class13.field401, class211.field3824, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class230.method1600(0, var3, var4)) {
                                                    class163.method1184(var13.field4442, 0, class240.field4314, class54.field1102, class13.field401, class211.field3824, var3, var4, true);
                                                } else {
                                                    class163.method1184(var13.field4442, 0, class240.field4314, class54.field1102, class13.field401, class211.field3824, var3, var4, false);
                                                }
                                                class221 var14 = var13.field4435;
                                                if (var14 != null) {
                                                    var14.field3966.method230(0, class240.field4314, class54.field1102, class13.field401, class211.field3824, var14.field3977 - class81.field1591, var14.field3967 - class205.field3697, var14.field3975 - class191.field3389, var14.field3978);
                                                }
                                                for (int var15 = 0; var15 < var13.field4445; var15++) {
                                                    class228 var16 = var13.field4429[var15];
                                                    if (var16 != null) {
                                                        var16.field4134.method230(var16.field4125, class240.field4314, class54.field1102, class13.field401, class211.field3824, var16.field4129 - class81.field1591, var16.field4131 - class205.field3697, var16.field4123 - class191.field3389, var16.field4122);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field4442 == null) {
                                                if (var2.field4444 != null) {
                                                    if (class230.method1600(var6, var3, var4)) {
                                                        class129.method912(var2.field4444, class240.field4314, class54.field1102, class13.field401, class211.field3824, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class129.method912(var2.field4444, class240.field4314, class54.field1102, class13.field401, class211.field3824, var3, var4, false);
                                                    }
                                                }
                                            } else if (class230.method1600(var6, var3, var4)) {
                                                class163.method1184(var2.field4442, var6, class240.field4314, class54.field1102, class13.field401, class211.field3824, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field4442.field4264 != 12345678 || class243.field4352 && var5 <= class30.field631) {
                                                    class163.method1184(var2.field4442, var6, class240.field4314, class54.field1102, class13.field401, class211.field3824, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class107 var18 = var2.field4437;
                                                if (var18 != null && (var18.field2065 & 0x80000000L) != 0L) {
                                                    var18.field2051.method230(0, class240.field4314, class54.field1102, class13.field401, class211.field3824, var18.field2064 - class81.field1591, var18.field2058 - class205.field3697, var18.field2066 - class191.field3389, var18.field2065);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class221 var21 = var2.field4435;
                                            class258 var22 = var2.field4433;
                                            if (var21 != null || var22 != null) {
                                                if (class106.field2032 == var3) {
                                                    var19++;
                                                } else if (class106.field2032 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class158.field2966 == var4) {
                                                    var19 += 3;
                                                } else if (class158.field2966 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class159.field2989[var19];
                                                var2.field4426 = class268.field4722[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field3981 & class229.field4165[var19]) == 0) {
                                                    var2.field4432 = 0;
                                                } else if (var21.field3981 == 16) {
                                                    var2.field4432 = 3;
                                                    var2.field4427 = class213.field3856[var19];
                                                    var2.field4431 = 3 - var2.field4427;
                                                } else if (var21.field3981 == 32) {
                                                    var2.field4432 = 6;
                                                    var2.field4427 = class138.field2634[var19];
                                                    var2.field4431 = 6 - var2.field4427;
                                                } else if (var21.field3981 == 64) {
                                                    var2.field4432 = 12;
                                                    var2.field4427 = class154.field2901[var19];
                                                    var2.field4431 = 12 - var2.field4427;
                                                } else {
                                                    var2.field4432 = 9;
                                                    var2.field4427 = class97.field1932[var19];
                                                    var2.field4431 = 9 - var2.field4427;
                                                }
                                                if ((var21.field3981 & var20) != 0 && !class82.method573(var6, var3, var4, var21.field3981)) {
                                                    var21.field3966.method230(0, class240.field4314, class54.field1102, class13.field401, class211.field3824, var21.field3977 - class81.field1591, var21.field3967 - class205.field3697, var21.field3975 - class191.field3389, var21.field3978);
                                                }
                                                if ((var21.field3970 & var20) != 0 && !class82.method573(var6, var3, var4, var21.field3970)) {
                                                    var21.field3976.method230(0, class240.field4314, class54.field1102, class13.field401, class211.field3824, var21.field3977 - class81.field1591, var21.field3967 - class205.field3697, var21.field3975 - class191.field3389, var21.field3978);
                                                }
                                            }
                                            if (var22 != null && !class105.method753(var6, var3, var4, var22.field4590.method233())) {
                                                if ((var22.field4577 & var20) != 0) {
                                                    var22.field4590.method230(0, class240.field4314, class54.field1102, class13.field401, class211.field3824, var22.field4587 + var22.field4572 - class81.field1591, var22.field4584 - class205.field3697, var22.field4582 + var22.field4575 - class191.field3389, var22.field4576);
                                                } else if (var22.field4577 == 256) {
                                                    int var23 = var22.field4587 - class81.field1591;
                                                    int var24 = var22.field4584 - class205.field3697;
                                                    int var25 = var22.field4582 - class191.field3389;
                                                    int var26 = var22.field4579;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field4590.method230(0, class240.field4314, class54.field1102, class13.field401, class211.field3824, var22.field4572 + var23, var24, var22.field4575 + var25, var22.field4576);
                                                    } else if (var22.field4583 != null) {
                                                        var22.field4583.method230(0, class240.field4314, class54.field1102, class13.field401, class211.field3824, var23, var24, var25, var22.field4576);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class107 var29 = var2.field4437;
                                                if (var29 != null && (var29.field2065 & 0x80000000L) == 0L) {
                                                    var29.field2051.method230(0, class240.field4314, class54.field1102, class13.field401, class211.field3824, var29.field2064 - class81.field1591, var29.field2058 - class205.field3697, var29.field2066 - class191.field3389, var29.field2065);
                                                }
                                                class97 var30 = var2.field4443;
                                                if (var30 != null && var30.field1921 == 0) {
                                                    if (var30.field1927 != null) {
                                                        var30.field1927.method230(0, class240.field4314, class54.field1102, class13.field401, class211.field3824, var30.field1923 - class81.field1591, var30.field1920 - class205.field3697, var30.field1925 - class191.field3389, var30.field1934);
                                                    }
                                                    if (var30.field1933 != null) {
                                                        var30.field1933.method230(0, class240.field4314, class54.field1102, class13.field401, class211.field3824, var30.field1923 - class81.field1591, var30.field1920 - class205.field3697, var30.field1925 - class191.field3389, var30.field1934);
                                                    }
                                                    if (var30.field1924 != null) {
                                                        var30.field1924.method230(0, class240.field4314, class54.field1102, class13.field401, class211.field3824, var30.field1923 - class81.field1591, var30.field1920 - class205.field3697, var30.field1925 - class191.field3389, var30.field1934);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field4425;
                                            if (var31 != 0) {
                                                if (var3 < class106.field2032 && (var31 & 0x4) != 0) {
                                                    class249 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field4440) {
                                                        class228.field4136.method1731(-101, var32);
                                                    }
                                                }
                                                if (var4 < class158.field2966 && (var31 & 0x2) != 0) {
                                                    class249 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field4440) {
                                                        class228.field4136.method1731(-46, var33);
                                                    }
                                                }
                                                if (var3 > class106.field2032 && (var31 & 0x1) != 0) {
                                                    class249 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field4440) {
                                                        class228.field4136.method1731(-32, var34);
                                                    }
                                                }
                                                if (var4 > class158.field2966 && (var31 & 0x8) != 0) {
                                                    class249 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field4440) {
                                                        class228.field4136.method1731(100, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field4432 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field4445; var37++) {
                                                if (class2.field22 != var2.field4429[var37].field4138 && (var2.field4434[var37] & var2.field4432) == var2.field4427) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class221 var38 = var2.field4435;
                                                if (!class82.method573(var6, var3, var4, var38.field3981)) {
                                                    var38.field3966.method230(0, class240.field4314, class54.field1102, class13.field401, class211.field3824, var38.field3977 - class81.field1591, var38.field3967 - class205.field3697, var38.field3975 - class191.field3389, var38.field3978);
                                                }
                                                var2.field4432 = 0;
                                            }
                                        }
                                        if (!var2.field4424) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field4445;
                                            var2.field4424 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class228 var42 = var2.field4429[var41];
                                                if (class2.field22 != var42.field4138) {
                                                    for (int var43 = var42.field4137; var43 <= var42.field4135; var43++) {
                                                        for (int var44 = var42.field4127; var44 <= var42.field4128; var44++) {
                                                            class249 var45 = var7[var43][var44];
                                                            if (var45.field4423) {
                                                                var2.field4424 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field4432 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field4137) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field4135) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field4127) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field4128) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field4432) == var2.field4431) {
                                                                    var2.field4424 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class60.field1201[var40++] = var42;
                                                    int var47 = class106.field2032 - var42.field4137;
                                                    int var48 = var42.field4135 - class106.field2032;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class158.field2966 - var42.field4127;
                                                    int var50 = var42.field4128 - class158.field2966;
                                                    if (var50 > var49) {
                                                        var42.field4142 = var47 + var50;
                                                    } else {
                                                        var42.field4142 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class228 var54 = class60.field1201[var53];
                                                    if (class2.field22 != var54.field4138) {
                                                        if (var54.field4142 > var51) {
                                                            var51 = var54.field4142;
                                                            var52 = var53;
                                                        } else if (var54.field4142 == var51) {
                                                            int var55 = var54.field4129 - class81.field1591;
                                                            int var56 = var54.field4123 - class191.field3389;
                                                            int var57 = class60.field1201[var52].field4129 - class81.field1591;
                                                            int var58 = class60.field1201[var52].field4123 - class191.field3389;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class228 var59 = class60.field1201[var52];
                                                var59.field4138 = class2.field22;
                                                if (!class129.method911(var6, var59.field4137, var59.field4135, var59.field4127, var59.field4128, var59.field4134.method233())) {
                                                    var59.field4134.method230(var59.field4125, class240.field4314, class54.field1102, class13.field401, class211.field3824, var59.field4129 - class81.field1591, var59.field4131 - class205.field3697, var59.field4123 - class191.field3389, var59.field4122);
                                                }
                                                for (int var60 = var59.field4137; var60 <= var59.field4135; var60++) {
                                                    for (int var61 = var59.field4127; var61 <= var59.field4128; var61++) {
                                                        class249 var62 = var7[var60][var61];
                                                        if (var62.field4432 != 0) {
                                                            class228.field4136.method1731(119, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field4440) {
                                                            class228.field4136.method1731(-117, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field4424) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field4424 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field4440);
                            } while (var2.field4432 != 0);
                            if (var3 > class106.field2032 || var3 <= class6.field236) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field4440);
                        if (var3 < class106.field2032 || var3 >= class33.field720 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field4440);
                    if (var4 > class158.field2966 || var4 <= class198.field3526) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field4440);
                if (var4 < class158.field2966 || var4 >= class194.field3482 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field4440);
            var2.field4440 = false;
            class137.field2624--;
            class97 var67 = var2.field4443;
            if (var67 != null && var67.field1921 != 0) {
                if (var67.field1927 != null) {
                    var67.field1927.method230(0, class240.field4314, class54.field1102, class13.field401, class211.field3824, var67.field1923 - class81.field1591, var67.field1920 - class205.field3697 - var67.field1921, var67.field1925 - class191.field3389, var67.field1934);
                }
                if (var67.field1933 != null) {
                    var67.field1933.method230(0, class240.field4314, class54.field1102, class13.field401, class211.field3824, var67.field1923 - class81.field1591, var67.field1920 - class205.field3697 - var67.field1921, var67.field1925 - class191.field3389, var67.field1934);
                }
                if (var67.field1924 != null) {
                    var67.field1924.method230(0, class240.field4314, class54.field1102, class13.field401, class211.field3824, var67.field1923 - class81.field1591, var67.field1920 - class205.field3697 - var67.field1921, var67.field1925 - class191.field3389, var67.field1934);
                }
            }
            if (var2.field4426 != 0) {
                class258 var68 = var2.field4433;
                if (var68 != null && !class105.method753(var6, var3, var4, var68.field4590.method233())) {
                    if ((var68.field4577 & var2.field4426) != 0) {
                        var68.field4590.method230(0, class240.field4314, class54.field1102, class13.field401, class211.field3824, var68.field4587 + var68.field4572 - class81.field1591, var68.field4584 - class205.field3697, var68.field4582 + var68.field4575 - class191.field3389, var68.field4576);
                    } else if (var68.field4577 == 256) {
                        int var69 = var68.field4587 - class81.field1591;
                        int var70 = var68.field4584 - class205.field3697;
                        int var71 = var68.field4582 - class191.field3389;
                        int var72 = var68.field4579;
                        int var73;
                        if (var72 == 1 || var72 == 2) {
                            var73 = -var69;
                        } else {
                            var73 = var69;
                        }
                        int var74;
                        if (var72 == 2 || var72 == 3) {
                            var74 = -var71;
                        } else {
                            var74 = var71;
                        }
                        if (var74 >= var73) {
                            var68.field4590.method230(0, class240.field4314, class54.field1102, class13.field401, class211.field3824, var68.field4572 + var69, var70, var68.field4575 + var71, var68.field4576);
                        } else if (var68.field4583 != null) {
                            var68.field4583.method230(0, class240.field4314, class54.field1102, class13.field401, class211.field3824, var69, var70, var71, var68.field4576);
                        }
                    }
                }
                class221 var75 = var2.field4435;
                if (var75 != null) {
                    if ((var75.field3970 & var2.field4426) != 0 && !class82.method573(var6, var3, var4, var75.field3970)) {
                        var75.field3976.method230(0, class240.field4314, class54.field1102, class13.field401, class211.field3824, var75.field3977 - class81.field1591, var75.field3967 - class205.field3697, var75.field3975 - class191.field3389, var75.field3978);
                    }
                    if ((var75.field3981 & var2.field4426) != 0 && !class82.method573(var6, var3, var4, var75.field3981)) {
                        var75.field3966.method230(0, class240.field4314, class54.field1102, class13.field401, class211.field3824, var75.field3977 - class81.field1591, var75.field3967 - class205.field3697, var75.field3975 - class191.field3389, var75.field3978);
                    }
                }
            }
            if (var5 < class194.field3462 - 1) {
                class249 var76 = class248.field4406[var5 + 1][var3][var4];
                if (var76 != null && var76.field4440) {
                    class228.field4136.method1731(-105, var76);
                }
            }
            if (var3 < class106.field2032) {
                class249 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field4440) {
                    class228.field4136.method1731(101, var77);
                }
            }
            if (var4 < class158.field2966) {
                class249 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field4440) {
                    class228.field4136.method1731(110, var78);
                }
            }
            if (var3 > class106.field2032) {
                class249 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field4440) {
                    class228.field4136.method1731(-76, var79);
                }
            }
            if (var4 > class158.field2966) {
                class249 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field4440) {
                    class228.field4136.method1731(121, var80);
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static void method782(int arg0) {
        if (arg0 == 0) {
            field2085 = null;
            field2082 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class109() {
        class26 var1 = class157.field2954.method1724(true, 5, this);
        while (var1.field613 == 0) {
            class91.method677(0, 10L);
        }
        if (var1.field613 == 2) {
            throw new RuntimeException();
        }
        this.field2096 = (Thread) var1.field611;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I[Ljd;)Ljd;")
    public static final class86 method783(int arg0, class86[] arg1) {
        field2093++;
        if (arg1.length < arg0) {
            throw new IllegalArgumentException();
        }
        return class229.method1593(0, arg1.length, 0, arg1);
    }
}
