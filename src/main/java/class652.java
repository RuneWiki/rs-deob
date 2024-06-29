import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class652 extends class325 {

    @OriginalMember(owner = "client!lha", name = "H", descriptor = "I")
    private int field9042 = 4096;

    @OriginalMember(owner = "client!lha", name = "N", descriptor = "I")
    private int field9047 = 8192;

    @OriginalMember(owner = "client!lha", name = "F", descriptor = "I")
    private int field9040 = 2048;

    @OriginalMember(owner = "client!lha", name = "I", descriptor = "I")
    private int field9043 = 2048;

    @OriginalMember(owner = "client!lha", name = "O", descriptor = "I")
    private int field9048 = 0;

    @OriginalMember(owner = "client!lha", name = "U", descriptor = "I")
    private int field9054 = 0;

    @OriginalMember(owner = "client!lha", name = "V", descriptor = "I")
    private int field9055 = 12288;

    @OriginalMember(owner = "client!lha", name = "G", descriptor = "Ljava/lang/String;")
    public static String field9041 = "";

    @OriginalMember(owner = "client!lha", name = "D", descriptor = "I")
    public static int field9038;

    @OriginalMember(owner = "client!lha", name = "E", descriptor = "I")
    public static int field9039;

    @OriginalMember(owner = "client!lha", name = "J", descriptor = "I")
    public static int field9044;

    @OriginalMember(owner = "client!lha", name = "K", descriptor = "I")
    public static int field9045;

    @OriginalMember(owner = "client!lha", name = "L", descriptor = "I")
    public static int field9046;

    @OriginalMember(owner = "client!lha", name = "P", descriptor = "I")
    public static int field9049;

    @OriginalMember(owner = "client!lha", name = "Q", descriptor = "I")
    public static int field9050;

    @OriginalMember(owner = "client!lha", name = "R", descriptor = "I")
    public static int field9051;

    @OriginalMember(owner = "client!lha", name = "S", descriptor = "I")
    public static int field9052;

    @OriginalMember(owner = "client!lha", name = "T", descriptor = "I")
    public static int field9053;

    @OriginalMember(owner = "client!lha", name = "W", descriptor = "I")
    public static int field9056;

    @OriginalMember(owner = "client!lha", name = "C", descriptor = "Ldn;")
    public static class544 field9037;

    @OriginalMember(owner = "client!lha", name = "<init>", descriptor = "()V", line = 4)
    public class652() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(BII)Z", line = 8)
    private final boolean method3626(byte arg0, int arg1, int arg2) {
        ++field9044;
        if (arg0 != 94) {
            return false;
        } else {
            int var4 = (-arg1 + arg2) * this.field9055 >> 12;
            int var5 = class224.field3075[255 & var4 * 255 >> 12];
            int var6 = (var5 << 12) / this.field9055;
            int var7 = (var6 << 12) / this.field9047;
            int var8 = this.field9042 * var7 >> 12;
            return ~(arg1 + arg2) > ~var8 && ~(arg1 + arg2) < ~(-var8);
        }
    }

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "(I)V", line = 26)
    public static final void method3627(int arg0) {
        ++field9038;
        if (arg0 != -4) {
            field9037 = null;
        }
        int var1 = class712.field9959.field1313.method1949(17);
        if (var1 != 0) {
            if (var1 == 1) {
                class352.method2222((byte) 120, (byte) 0);
                class393.method2485((byte) -82, 512);
                if (class66.field931 != null) {
                    class763.method4231(-124);
                }
            } else {
                class352.method2222((byte) 113, (byte) (255 & class320.field4604 + -4));
                class393.method2485((byte) -82, 2);
            }
        } else {
            class625.field8439 = null;
            class393.method2485((byte) -82, 0);
        }
        class731.field10140 = class610.field8296;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(Ljp;Z)Lpaa;", line = 64)
    public static final class651 method3628(class376 arg0, boolean arg1) {
        ++field9046;
        class564 var2 = class706.method3954(69)[arg0.method2398(-1372747256)];
        if (arg1) {
            return null;
        } else {
            class631 var3 = class709.method3970(-1)[arg0.method2398(-1372747256)];
            int var4 = arg0.method2355(3);
            int var5 = arg0.method2355(3);
            int var6 = arg0.method2359(-1);
            int var7 = arg0.method2359(-1);
            int var8 = arg0.method2355(3);
            int var9 = arg0.method2384(108);
            int var10 = arg0.method2384(2);
            return new class651(var2, var3, var4, var5, var6, var7, var8, var9, var10);
        }
    }

    @OriginalMember(owner = "client!lha", name = "d", descriptor = "(III)Z", line = 94)
    private final boolean method3629(int arg0, int arg1, int arg2) {
        ++field9049;
        int var4 = (arg0 + arg2) * this.field9055 >> 12;
        int var5 = class224.field3075[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field9055;
        int var7 = (var6 << 12) / this.field9047;
        int var8 = this.field9042 * var7 >> 12;
        if (arg1 >= -52) {
            return true;
        } else {
            return ~var8 < ~(arg2 - arg0) && -arg0 + arg2 > -var8;
        }
    }

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 113)
    public static final String method3630(byte arg0, String arg1) {
        ++field9050;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var2 > var4; ++var4) {
            char var8 = arg1.charAt(var4);
            if (~var8 == -61 || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        int var6 = 0;
        if (arg0 != -10) {
            field9037 = null;
        }
        while (~var6 > ~var2) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 != '>') {
                var5.append(var7);
            } else {
                var5.append("<gt>");
            }
            ++var6;
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(Ljp;IB)V", line = 163)
    public final void method95(class376 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field9047 = arg0.method2359(-1);
                                }
                            } else {
                                this.field9042 = arg0.method2359(-1);
                            }
                        } else {
                            this.field9055 = arg0.method2359(-1);
                        }
                    } else {
                        this.field9043 = arg0.method2359(-1);
                    }
                } else {
                    this.field9048 = arg0.method2359(-1);
                }
            } else {
                this.field9054 = arg0.method2359(-1);
            }
        } else {
            this.field9040 = arg0.method2359(-1);
        }
        ++field9052;
        if (arg2 > -41) {
            this.field9055 = -2;
        }
    }

    @OriginalMember(owner = "client!lha", name = "e", descriptor = "(B)V", line = 241)
    public static void method3631(byte arg0) {
        field9037 = null;
        field9041 = null;
        if (arg0 != -1) {
            field9037 = null;
        }
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(ZLwp;B)V", line = 252)
    public static final void method3632(boolean arg0, class192 arg1, byte arg2) {
        ++field9056;
        if (~class746.field10297 > -401) {
            class220 var3 = arg1.field2577;
            String var4 = arg1.field2553;
            if (var3.field2995 != null) {
                var3 = var3.method1449(class382.field5602, -1);
                if (var3 == null) {
                    return;
                }
                var4 = var3.field2948;
            }
            if (var3.field2958) {
                if (arg1.field2578 != 0) {
                    String var5 = class21.field332 == class180.field2393 ? class474.field6569.method2780(104, class38.field589) : class474.field6567.method2780(121, class38.field589);
                    var4 = var4 + class669.method3720(9, class551.field7456.field1051, arg1.field2578) + " (" + var5 + arg1.field2578 + ")";
                }
                if (class497.field6870 && !arg0) {
                    class486 var6 = class648.field8998 == -1 ? null : class206.field2703.method3905(true, class648.field8998);
                    if (~(class344.field5067 & 2) != -1 && (var6 == null || var3.method1452(class648.field8998, var6.field6728, (byte) 111) != var6.field6728)) {
                        ++class608.field8274;
                        class251.method1684(false, class66.field942, false, -1, class341.field4924 + " -> <col=ffff00>" + var4, (byte) 61, true, 0, 5, (long) arg1.field1812, 0, class678.field9483, (long) arg1.field1812);
                    }
                }
                if (!arg0) {
                    String[] var7 = var3.field2974;
                    if (class23.field364) {
                        var7 = class713.method3991(true, var7);
                    }
                    if (var7 != null) {
                        for (int var8 = 4; var8 >= 0; --var8) {
                            if (var7[var8] != null && (var3.field2935 == 0 || !var7[var8].equalsIgnoreCase(class474.field6562.method2780(86, class38.field589)))) {
                                byte var9 = 0;
                                if (var8 == 0) {
                                    var9 = 12;
                                }
                                int var10 = class607.field8248;
                                if (var8 == 1) {
                                    var9 = 45;
                                }
                                if (~var8 == -3) {
                                    var9 = 50;
                                }
                                if (var8 == 3) {
                                    var9 = 9;
                                }
                                if (var3.field2977 == var8) {
                                    var10 = var3.field2980;
                                }
                                if (var8 == 4) {
                                    var9 = 25;
                                }
                                if (~var3.field2925 == ~var8) {
                                    var10 = var3.field2952;
                                }
                                ++class679.field9490;
                                class251.method1684(false, var7[var8], false, -1, "<col=ffff00>" + var4, (byte) -98, true, 0, var9, (long) arg1.field1812, 0, !var7[var8].equalsIgnoreCase(class474.field6562.method2780(114, class38.field589)) ? var10 : var3.field2989, (long) arg1.field1812);
                            }
                        }
                    }
                    if (var3.field2935 == 1 && var7 != null) {
                        for (int var11 = 4; ~var11 <= -1; --var11) {
                            if (var7[var11] != null && var7[var11].equalsIgnoreCase(class474.field6562.method2780(arg2 + 76, class38.field589))) {
                                short var12 = 0;
                                if (~class551.field7456.field1051 > ~arg1.field2578) {
                                    var12 = 2000;
                                }
                                short var13 = 0;
                                if (~var11 == -1) {
                                    var13 = 12;
                                }
                                if (~var11 == -2) {
                                    var13 = 45;
                                }
                                if (~var11 == -3) {
                                    var13 = 50;
                                }
                                if (var11 == 3) {
                                    var13 = 9;
                                }
                                if (var11 == 4) {
                                    var13 = 25;
                                }
                                if (~var13 != -1) {
                                    var13 += var12;
                                }
                                class251.method1684(false, var7[var11], false, -1, "<col=ffff00>" + var4, (byte) -97, true, 0, var13, (long) arg1.field1812, 0, var3.field2989, (long) arg1.field1812);
                                ++class49.field731;
                            }
                        }
                    }
                }
                class251.method1684(arg0, class474.field6561.method2780(arg2 + 82, class38.field589), false, -1, "<col=ffff00>" + var4, (byte) 100, true, 0, 1009, (long) arg1.field1812, 0, class16.field246, (long) arg1.field1812);
                ++class284.field4202;
                if (arg2 != 16) {
                    field9037 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(IIIII)V", line = 425)
    public static final void method3633(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9039;
        if (arg0 <= arg1) {
            class138.method1069(class785.field10808[arg4], (byte) 123, arg0, arg1, arg3);
        } else {
            class138.method1069(class785.field10808[arg4], (byte) 93, arg1, arg0, arg3);
        }
        int var5 = 108 / ((-40 - arg2) / 44);
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(BI)[I", line = 444)
    public final int[] method100(byte arg0, int arg1) {
        ++field9053;
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (arg0 <= 21) {
            this.field9055 = 84;
        }
        if (super.field4727.field6067) {
            int var4 = class621.field8370[arg1] - 2048;
            for (int var5 = 0; ~var5 > ~class261.field3874; ++var5) {
                int var6 = class556.field7498[var5] - 2048;
                int var7 = var6 - -this.field9040;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = this.field9054 + var4;
                int var11 = ~var10 <= 2047 ? var10 : var10 - -4096;
                int var12 = var11 <= 2048 ? var11 : var11 + -4096;
                int var13 = this.field9048 + var6;
                int var14 = var13 < -2048 ? var13 + 4096 : var13;
                int var15 = var14 > 2048 ? var14 + -4096 : var14;
                int var16 = this.field9043 + var4;
                int var17 = ~var16 > 2047 ? var16 + 4096 : var16;
                int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                var3[var5] = !this.method3626((byte) 94, var9, var12) && !this.method3629(var15, -78, var18) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(Z)V", line = 495)
    public final void method101(boolean arg0) {
        ++field9051;
        class38.method266(arg0);
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(ILha;)V", line = 509)
    public static final void method3634(int arg0, class65 arg1) {
        ++field9045;
        class541.field7353 = class599.method3331(arg1, true, class691.field9699, 0);
        if (arg0 != -1719661332) {
            field9041 = null;
        }
        class22.field336 = class279.method1806(class691.field9699, true, arg1);
        class105.field1452 = class599.method3331(arg1, true, class229.field3121, 0);
        class7.field76 = class279.method1806(class229.field3121, true, arg1);
        class251.field3716 = class599.method3331(arg1, true, class45.field676, 0);
        class548.field7413 = class279.method1806(class45.field676, true, arg1);
    }
}
