import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class251 {

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Ldp;")
    private class514 field3596;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    private int field3586;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    private int field3597;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Ldfa;")
    private class477 field3594;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3598 = new String[] { method2057(method2056("VVK\u000b")), method2057(method2056("C\r\tI[")), method2057(method2056("MJ\t.\u000e")), method2057(method2056("K\u001dD\u0014")), method2057(method2056("MJ\t/\u000e")), method2057(method2056("MJ\t&\u000e")), method2057(method2056("MJ\t[OVJSY\u000e")), method2057(method2056("MJ\t6\u000e")), method2057(method2056("UJD\u0015IKLA\u0013")), method2057(method2056("MJ\t \u000e")), method2057(method2056("MJ\t!\u000e")), method2057(method2056("MJ\t%\u000e")), method2057(method2056("MJ\t$\u000e")), method2057(method2056("MJ\t(\u000e")), method2057(method2056("MJ\t5\u000e")), method2057(method2056("MJ\t-\u000e")), method2057(method2056("MJ\t)\u000e")), method2057(method2056("MJ\t,\u000e")), method2057(method2056("MJ\t\"\u000e")), method2057(method2056("MJ\t#\u000e")), method2057(method2056("MJ\t7\u000e")), method2057(method2056("MJ\t+\u000e")) };

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V", line = 5)
    public final void method2038(int arg0, int arg1) {
        try {
            if (class229.field3319 != null) {
                for (class683 var3 = (class683) this.field3596.method3932((byte) -102); var3 != null; var3 = (class683) this.field3596.method3939((byte) -75)) {
                    if (var3.method3373(115)) {
                        if (var3.method3374((byte) 26) == null) {
                            var3.method4294(0);
                            var3.method4911(arg0 + 126);
                            this.field3586 += var3.field9580;
                        }
                    } else if ((long) arg1 < ++var3.field9630) {
                        class683 var4 = class229.field3319.method984(var3, arg0 + 127);
                        this.field3594.method3691(var4, var3.field8378, ~arg0);
                        class603.method4461(114, var4, var3);
                        var3.method4294(0);
                        var3.method4911(121);
                    }
                }
            }
            if (arg0 != 0) {
                method2045(null, 114, (byte) -33);
            }
            field3595++;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field3598[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/Object;IIJ)V", line = 54)
    public final void method2039(Object arg0, int arg1, int arg2, long arg3) {
        try {
            field3588++;
            int var6 = -60 % ((32 - arg1) / 42);
            if (this.field3597 < arg2) {
                throw new IllegalStateException(field3598[3]);
            }
            this.method2041(0, arg3);
            this.field3586 -= arg2;
            while (this.field3586 < 0) {
                class683 var7 = (class683) this.field3596.method3938((byte) 119);
                this.method2052((byte) -69, var7);
            }
            class433 var8 = new class433(arg0, arg2);
            this.field3594.method3691(var8, arg3, -1);
            this.field3596.method3937(true, var8);
            var8.field9630 = 0L;
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field3598[2] + (arg0 == null ? field3598[0] : field3598[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II[B)[B", line = 84)
    public static final byte[] method2040(int arg0, int arg1, byte[] arg2) {
        try {
            field3591++;
            byte[] var3 = new byte[arg0];
            if (arg1 == Integer.MAX_VALUE) {
                class569.method4247(arg2, 0, var3, 0, arg0);
                return var3;
            } else {
                return null;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3598[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field3598[0] : field3598[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IJ)V", line = 101)
    private final void method2041(int arg0, long arg1) {
        try {
            if (arg0 == 0) {
                field3593++;
                class683 var4 = (class683) this.field3594.method3693(false, arg1);
                this.method2052((byte) -69, var4);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field3598[20] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)V", line = 117)
    public static final void method2042(int arg0) {
        try {
            field3580++;
            if (class188.field2488.toLowerCase().indexOf(field3598[8]) == -1) {
                class432.field6268[47] = 73;
                class432.field6268[45] = 26;
                class432.field6268[93] = 43;
                class432.field6268[46] = 72;
                class432.field6268[92] = 74;
                if (class188.field2480 == null) {
                    class432.field6268[222] = 59;
                    class432.field6268[192] = 58;
                } else {
                    class432.field6268[520] = 59;
                    class432.field6268[192] = 28;
                    class432.field6268[222] = 58;
                }
                class432.field6268[59] = 57;
                class432.field6268[91] = 42;
                class432.field6268[61] = 27;
                class432.field6268[44] = 71;
            } else {
                class432.field6268[187] = 27;
                class432.field6268[222] = 59;
                class432.field6268[191] = 73;
                class432.field6268[221] = 43;
                class432.field6268[220] = 74;
                class432.field6268[219] = 42;
                class432.field6268[223] = 28;
                class432.field6268[192] = 58;
                class432.field6268[186] = 57;
                class432.field6268[188] = 71;
                class432.field6268[189] = 26;
                class432.field6268[190] = 72;
            }
            if (arg0 <= -90) {
                ;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3598[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(Z)V", line = 167)
    public final void method2043(boolean arg0) {
        try {
            this.field3596.method3936((byte) 61);
            field3587++;
            this.field3594.method3690((byte) 35);
            if (arg0) {
                method2042(6);
            }
            this.field3586 = this.field3597;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3598[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(I)V", line = 181)
    public static final void method2044(int arg0) {
        try {
            field3584++;
            class431.method3354((byte) 82);
            if (arg0 != 22213) {
                method2048(25, -125, 55);
            }
            class203.method1741(2, class451.field6612.field9111.method4346(3) == 1, 22050, 48000);
            class499.field7298 = class292.method2363(class651.field9249, class560.field8153, (byte) 113, 22050, 0);
            class474.method3663(7728, true, class403.method3164(111, null));
            class591.field8505 = class292.method2363(class651.field9249, class560.field8153, (byte) 106, 2048, 1);
            class591.field8505.method3425(class261.field3699, 88);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3598[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lha;IB)V", line = 198)
    public static final void method2045(class18 arg0, int arg1, byte arg2) {
        try {
            field3583++;
            if (!class721.field10272 || !class793.field11533) {
                class694.field9701 = 0;
            } else if (arg2 == -127) {
                if (class448.field6574) {
                    class755.field10801 = class552.field8052.method1763((byte) -7);
                }
                class15.field200 = 0;
                class53.field740 = 0;
                class322.field4389 = 0;
                int[] var3 = arg0.method157();
                class667.field9417 = (int) ((float) var3[3] / 3.0F);
                class599.field8599 = (int) ((float) var3[2] / 3.0F);
                arg0.method170(class347.field5043);
                if (((int) ((float) class347.field5043[0] / 3.0F)) != class29.field372 || (int) ((float) class347.field5043[1] / 3.0F) != class518.field7582) {
                    class29.field372 = (int) ((float) class347.field5043[0] / 3.0F);
                    class518.field7582 = (int) ((float) class347.field5043[1] / 3.0F);
                    class433.field6277 = class29.field372 >> 1;
                    class796.field11573 = class518.field7582 >> 1;
                    class715.field10184 = new int[class518.field7582 * class29.field372];
                }
                class795.field11567 = arg0.method129();
                class694.field9701 = 0;
                for (int var4 = 0; var4 < class740.field10526; var4++) {
                    class758.method5495(class376.field5495[var4], arg1, arg0, 0);
                }
                for (int var5 = 0; var5 < class119.field1510; var5++) {
                    class758.method5495(class601.field8604[var5], arg1, arg0, arg2 ^ 0xFFFFFF81);
                }
                for (int var6 = 0; var6 < class151.field1936; var6++) {
                    class758.method5495(class503.field7357[var6], arg1, arg0, arg2 + 127);
                }
                class459.field6696 = 0;
                if (class694.field9701 > 0) {
                    int var7 = class715.field10184.length;
                    int var8 = var7 - var7 & 0x7;
                    int var9 = 0;
                    while (var8 > var9) {
                        class715.field10184[var9++] = Integer.MAX_VALUE;
                        class715.field10184[var9++] = Integer.MAX_VALUE;
                        class715.field10184[var9++] = Integer.MAX_VALUE;
                        class715.field10184[var9++] = Integer.MAX_VALUE;
                        class715.field10184[var9++] = Integer.MAX_VALUE;
                        class715.field10184[var9++] = Integer.MAX_VALUE;
                        class715.field10184[var9++] = Integer.MAX_VALUE;
                        class715.field10184[var9++] = Integer.MAX_VALUE;
                    }
                    while (var9 < var7) {
                        class715.field10184[var9++] = Integer.MAX_VALUE;
                    }
                    class404.field5873 = 1;
                    for (int var10 = 0; var10 < class694.field9701; var10++) {
                        class182 var11 = class654.field9283[var10];
                        class358.method2863(false, var11.field2350[3], var11.field2350[0], var11.field2355[0], var11.field2355[3], var11.field2346[3], var11.field2355[1], var11.field2350[1], var11.field2346[1], var11.field2346[0]);
                        class358.method2863(false, var11.field2350[3], var11.field2350[1], var11.field2355[1], var11.field2355[3], var11.field2346[3], var11.field2355[2], var11.field2350[2], var11.field2346[2], var11.field2346[1]);
                    }
                    class404.field5873 = 2;
                }
                if (class448.field6574) {
                    class434.field6286 = class552.field8052.method1763((byte) -46) - class755.field10801;
                }
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field3598[9] + (arg0 == null ? field3598[0] : field3598[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)I", line = 304)
    public final int method2046(int arg0) {
        try {
            if (arg0 != 219) {
                this.method2049(100);
            }
            field3577++;
            return this.field3597;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3598[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(I)V", line = 317)
    public class251(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V", line = 320)
    public final void method2047(int arg0) {
        try {
            field3592++;
            if (arg0 != 11914) {
                this.method2051(94L, null, -3);
            }
            for (class683 var2 = (class683) this.field3596.method3932((byte) -107); var2 != null; var2 = (class683) this.field3596.method3939((byte) -75)) {
                if (var2.method3373(61)) {
                    var2.method4294(0);
                    var2.method4911(118);
                    this.field3586 += var2.field9580;
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3598[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V", line = 347)
    public static final void method2048(int arg0, int arg1, int arg2) {
        class621 var3 = class608.field8715[arg0][arg1][arg2];
        if (var3 != null) {
            class478.method3703(var3.field8850);
            if (var3.field8850 != null) {
                var3.field8850 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 359)
    public final Object method2049(int arg0) {
        try {
            field3589++;
            if (arg0 > -16) {
                this.method2049(-59);
            }
            class683 var2 = (class683) this.field3594.method3696(0);
            while (var2 != null) {
                Object var3 = var2.method3374((byte) 26);
                if (var3 != null) {
                    return var3;
                }
                class683 var4 = var2;
                var2 = (class683) this.field3594.method3697(-103);
                var4.method4294(0);
                var4.method4911(127);
                this.field3586 += var4.field9580;
            }
            return null;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field3598[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)I", line = 390)
    public final int method2050(int arg0) {
        try {
            field3582++;
            int var2 = 0;
            if (arg0 != 7) {
                this.method2039(null, 16, -6, 18L);
            }
            for (class683 var3 = (class683) this.field3596.method3932((byte) -75); var3 != null; var3 = (class683) this.field3596.method3939((byte) -75)) {
                if (!var3.method3373(40)) {
                    var2++;
                }
            }
            return var2;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3598[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(JLjava/lang/Object;I)V", line = 414)
    public final void method2051(long arg0, Object arg1, int arg2) {
        try {
            this.method2039(arg1, arg2 + 19, 1, arg0);
            field3585++;
            if (arg2 != 93) {
                method2042(118);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field3598[17] + arg0 + ',' + (arg1 == null ? field3598[0] : field3598[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLbs;)V", line = 429)
    private final void method2052(byte arg0, class683 arg1) {
        try {
            field3581++;
            if (arg0 != -69) {
                this.field3594 = null;
            }
            if (arg1 != null) {
                arg1.method4294(arg0 ^ 0xFFFFFFBB);
                arg1.method4911(127);
                this.field3586 += arg1.field9580;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3598[15] + arg0 + ',' + (arg1 == null ? field3598[0] : field3598[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(IJ)Ljava/lang/Object;", line = 446)
    public final Object method2053(int arg0, long arg1) {
        try {
            field3578++;
            class683 var4 = (class683) this.field3594.method3693(false, arg1);
            if (var4 == null) {
                return null;
            }
            Object var5 = var4.method3374((byte) 26);
            if (var5 == null) {
                var4.method4294(0);
                var4.method4911(117);
                this.field3586 += var4.field9580;
                return null;
            }
            if (arg0 != 0) {
                this.method2055((byte) -41);
            }
            if (var4.method3373(65)) {
                class433 var6 = new class433(var5, var4.field9580);
                this.field3594.method3691(var6, var4.field8378, -1);
                this.field3596.method3937(true, var6);
                var6.field9630 = 0L;
                var4.method4294(0);
                var4.method4911(arg0 + 120);
            } else {
                this.field3596.method3937(true, var4);
                var4.field9630 = 0L;
            }
            return var5;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field3598[21] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)Ljava/lang/Object;", line = 490)
    public final Object method2054(boolean arg0) {
        try {
            field3590++;
            if (arg0) {
                return null;
            }
            class683 var2 = (class683) this.field3594.method3697(-105);
            while (var2 != null) {
                Object var3 = var2.method3374((byte) 26);
                if (var3 != null) {
                    return var3;
                }
                class683 var4 = var2;
                var2 = (class683) this.field3594.method3697(-121);
                var4.method4294(0);
                var4.method4911(118);
                this.field3586 += var4.field9580;
            }
            return null;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field3598[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)I", line = 522)
    public final int method2055(byte arg0) {
        try {
            field3579++;
            return arg0 == 46 ? this.field3586 : -94;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3598[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(II)V", line = 536)
    public class251(int arg0, int arg1) {
        this.field3596 = new class514();
        try {
            this.field3586 = arg0;
            this.field3597 = arg0;
            int var3;
            for (var3 = 1; var3 + var3 < arg0 && arg1 > var3; var3 += var3) {
            }
            this.field3594 = new class477(var3);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3598[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2056(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x26);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2057(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 56;
                    break;
                case 1:
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 39;
                    break;
                case 3:
                    var10005 = 103;
                    break;
                default:
                    var10005 = 38;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
