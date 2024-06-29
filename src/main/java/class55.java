import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class55 {

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    private int field777 = 32;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "Z")
    private boolean field774 = false;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "J")
    private long field770 = class58.method427((byte) -19);

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "Z")
    private boolean field790 = true;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "[Lwq;")
    private class115[] field789 = new class115[8];

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
    private int field793 = 0;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "[Lwq;")
    private class115[] field794 = new class115[8];

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "I")
    private int field791 = 0;

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "I")
    private int field797 = 0;

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "I")
    private int field798 = 0;

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "J")
    private long field796 = 0L;

    @OriginalMember(owner = "client!kl", name = "I", descriptor = "J")
    private long field799 = 0L;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "[I")
    public static int[] field778 = new int[2048];

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "[I")
    public static int[] field782 = new int[16];

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "I")
    public int field788;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "I")
    public int field792;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "I")
    private int field795;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "Lwq;")
    private class115 field786;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "Lju;")
    public static class82 field768;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "[I")
    public int[] field785;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "[Laa;")
    public static class341[] field776;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 3)
    public void method397(Component arg0) throws Exception {
        field784++;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "()V", line = 10)
    public void method398() throws Exception {
        field766++;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "()V", line = 17)
    public void method399() {
        field787++;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "()V", line = 25)
    public void method400() throws Exception {
        field773++;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V", line = 32)
    public final synchronized void method401(boolean arg0) {
        this.field790 = true;
        field780++;
        try {
            if (arg0) {
                this.field796 = -123L;
            }
            this.method400();
        } catch (Exception var2) {
            this.method399();
            this.field799 = class58.method427((byte) -19) + 2000L;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V", line = 56)
    public final synchronized void method402(byte arg0) {
        field783++;
        if (class248.field3454 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class248.field3454.field2016[var3] == this) {
                    class248.field3454.field2016[var3] = null;
                }
                if (class248.field3454.field2016[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class248.field3454.field2022 = true;
                while (class248.field3454.field2020) {
                    class388.method2433(50L, -128);
                }
                class248.field3454 = null;
            }
        }
        this.method399();
        if (arg0 != 36) {
            this.field789 = null;
        }
        this.field774 = true;
        this.field785 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 105)
    public static final void method403(int arg0) {
        field765++;
        class330 var1 = class160.field2086;
        synchronized (class160.field2086) {
            class160.field2086.method2135(0);
        }
        if (arg0 <= 114) {
            field778 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILwq;)V", line = 118)
    public final synchronized void method404(int arg0, class115 arg1) {
        if (arg0 != 0) {
            field768 = null;
        }
        this.field786 = arg1;
        field767++;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V", line = 132)
    public void method405(int arg0) throws Exception {
        field775++;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V", line = 141)
    public static void method406(int arg0) {
        field768 = null;
        field776 = null;
        if (arg0 != 256) {
            field782 = null;
        }
        field782 = null;
        field778 = null;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)V", line = 155)
    public final synchronized void method407(byte arg0) {
        field771++;
        if (this.field774) {
            return;
        }
        long var2 = class58.method427((byte) -19);
        try {
            if (this.field770 + 500000L < var2) {
                this.field770 = var2 - 500000L;
            }
            while (var2 > this.field770 + 5000L) {
                this.method412((byte) 127, 256);
                this.field770 += (256000 / class56.field818);
            }
        } catch (Exception var7) {
            this.field770 = var2;
        }
        if (this.field785 == null) {
            return;
        }
        try {
            if (this.field799 != 0L) {
                if (var2 < this.field799) {
                    return;
                }
                this.method405(this.field788);
                this.field799 = 0L;
                this.field790 = true;
            }
            int var4 = this.method411();
            if (arg0 <= -110) {
                if ((this.field791 - var4) > this.field797) {
                    this.field797 = this.field791 - var4;
                }
                int var5 = this.field795 + this.field792;
                if (var5 + 256 > 16384) {
                    var5 = 16128;
                }
                if (this.field788 < (var5 + 256)) {
                    this.field788 += 1024;
                    if (this.field788 > 16384) {
                        this.field788 = 16384;
                    }
                    this.method399();
                    var4 = 0;
                    this.method405(this.field788);
                    this.field790 = true;
                    if (var5 + 256 > this.field788) {
                        var5 = this.field788 - 256;
                        this.field795 = var5 - this.field792;
                    }
                }
                while (var5 > var4) {
                    this.method409(this.field785, 256);
                    var4 += 256;
                    this.method398();
                }
                if (var2 > this.field796) {
                    if (this.field790) {
                        this.field790 = false;
                    } else if (this.field797 == 0 && this.field798 == 0) {
                        this.method399();
                        this.field799 = var2 + 2000L;
                        return;
                    } else {
                        this.field795 = Math.min(this.field798, this.field797);
                        this.field798 = this.field797;
                    }
                    this.field797 = 0;
                    this.field796 = var2 + 2000L;
                }
                this.field791 = var4;
            }
        } catch (Exception var6) {
            this.method399();
            this.field799 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(Z)V", line = 276)
    public static final void method408(boolean arg0) {
        field769++;
        if (class485.field7175 > 1) {
            class485.field7175--;
            class402.field6122 = class145.field1932;
        }
        if (class458.field6861) {
            class458.field6861 = false;
            class300.method1905(0);
            return;
        }
        if (!class139.field1850) {
            class47.method368((byte) -106);
        }
        for (int var1 = 0; var1 < 100 && class116.method716(14815); var1++) {
        }
        if (class435.field6596 != 9) {
            return;
        }
        class32.method274(class2.field17.method2337(false), 84, class538.field7879);
        if (class203.field2719 == null) {
            if (class515.field7569 <= class58.method427((byte) -19)) {
                class203.field2719 = class150.field1972.method2632((byte) -38, class139.field1851.field2603);
            }
        } else if (class203.field2719.field5598 != -1) {
            class424.method2582(class385.field5858, -1);
            class538.field7879.method1114(class203.field2719.field5598, 126);
            class203.field2719 = null;
            class515.field7569 = class58.method427((byte) -19) + 30000L;
        }
        class245 var2 = (class245) class212.field3001.method445(33);
        if (var2 != null || class58.method427((byte) -19) - 2000L > class183.field2485) {
            boolean var3 = false;
            int var4 = class538.field7879.field2185;
            for (class245 var5 = (class245) class324.field4684.method445(33); var5 != null && class538.field7879.field2185 - var4 < 240; var5 = (class245) class324.field4684.method451(arg0)) {
                var5.method25(-13489);
                int var6 = var5.method1567(-20707);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method1571(!arg0);
                if (var7 < 0) {
                    var7 = 0;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                boolean var8 = false;
                if (var5.method1567(-20707) == -1 && var5.method1571(true) == -1) {
                    var8 = true;
                    var6 = -1;
                    var7 = -1;
                }
                if (class392.field5983 != var7 || class522.field7683 != var6) {
                    if (!var3) {
                        class64.field914++;
                        class424.method2582(class136.field1815, -1);
                        class538.field7879.method1072((byte) 102, 0);
                        var3 = true;
                        var4 = class538.field7879.field2185;
                    }
                    int var9 = var7 - class392.field5983;
                    class392.field5983 = var7;
                    int var10 = var6 - class522.field7683;
                    class522.field7683 = var6;
                    int var11 = (int) ((var5.method1568(-14188) - class183.field2485) / 20L);
                    if (var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                        var9 += 32;
                        var10 += 32;
                        class538.field7879.method1114((var9 << 6) + ((var11 << 12) + var10), 92);
                    } else if (var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                        var10 += 128;
                        class538.field7879.method1072((byte) 102, var11 + 128);
                        var9 += 128;
                        class538.field7879.method1114((var9 << 8) + var10, 112);
                    } else if (var11 < 32) {
                        class538.field7879.method1072((byte) 102, var11 + 192);
                        if (var8) {
                            class538.field7879.method1073(326170192, Integer.MIN_VALUE);
                        } else {
                            class538.field7879.method1073(326170192, var7 | var6 << 16);
                        }
                    } else {
                        class538.field7879.method1114(var11 + 57344, 121);
                        if (var8) {
                            class538.field7879.method1073(326170192, Integer.MIN_VALUE);
                        } else {
                            class538.field7879.method1073(326170192, var6 << 16 | var7);
                        }
                    }
                    class183.field2485 = var5.method1568(-14188);
                }
            }
            if (var3) {
                class538.field7879.method1082(-32769, class538.field7879.field2185 - var4);
            }
        }
        if (var2 != null) {
            long var12 = (var2.method1568(-14188) - class425.field6478) / 50L;
            class425.field6478 = var2.method1568(-14188);
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var14 = var2.method1567(-20707);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = var2.method1571(true);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (var2.method1569(3) == 2) {
                var16 = 1;
            }
            class137.field1823++;
            class424.method2582(class175.field2346, -1);
            int var17 = (int) var12;
            class538.field7879.method1068(27, var16 << 15 | var17);
            class538.field7879.method1073(326170192, var14 << 16 | var15);
        }
        if (class328.field5110 > 0) {
            class499.field7359++;
            class424.method2582(class251.field3499, -1);
            class538.field7879.method1072((byte) 102, class328.field5110 * 3);
            for (int var18 = 0; var18 < class328.field5110; var18++) {
                class438 var19 = class460.field6890[var18];
                long var20 = (var19.method347(false) - class45.field644) / 50L;
                if (var20 > 65535L) {
                    var20 = 65535L;
                }
                class45.field644 = var19.method347(false);
                class538.field7879.method1072((byte) 102, var19.method348((byte) 116));
                class538.field7879.method1114((int) var20, 104);
            }
        }
        if (class282.field4149 > 0) {
            class282.field4149--;
        }
        if (class508.field7475 && class282.field4149 <= 0) {
            class508.field7475 = false;
            class282.field4149 = 20;
            class191.field2566++;
            class424.method2582(class84.field1226, -1);
            class538.field7879.method1114((int) class53.field744 >> 3, 127);
            class538.field7879.method1084(-3577, (int) class536.field7870 >> 3);
        }
        if (class519.field7632 && !class376.field5725) {
            class475.field7050++;
            class376.field5725 = true;
            class424.method2582(class278.field3940, -1);
            class538.field7879.method1072((byte) 102, 1);
        }
        if (!class519.field7632 && class376.field5725) {
            class376.field5725 = false;
            class475.field7050++;
            class424.method2582(class278.field3940, -1);
            class538.field7879.method1072((byte) 102, 0);
        }
        if (!class502.field7416) {
            class424.method2582(class298.field4399, -1);
            class22.field326++;
            class538.field7879.method1072((byte) 102, 0);
            int var22 = class538.field7879.field2185;
            class164 var23 = class203.field2716.method14(2);
            class538.field7879.method1089(0, var23.field2219, -4516, var23.field2185);
            class538.field7879.method1082(-32769, class538.field7879.field2185 - var22);
            class502.field7416 = true;
        }
        if (class443.field6672 != null) {
            if (class340.field5269 == 2) {
                class177.method1192((byte) 108);
            } else if (class340.field5269 == 3) {
                class297.method1897(-61);
            }
        }
        if (class373.field5676) {
            class373.field5676 = false;
        } else {
            class138.field1845 /= 2.0F;
        }
        if (class256.field3541) {
            class256.field3541 = false;
        } else {
            class172.field2319 /= 2.0F;
        }
        class187.method1256((byte) -82);
        if (class435.field6596 != 9) {
            return;
        }
        class461.method2790(-114);
        class277.method1783(6509);
        class74.method510((byte) -83);
        class167.method1133(true);
        class14.field261++;
        if (class14.field261 > 750) {
            class300.method1905(0);
            return;
        }
        class137.method922(-481);
        class391.method2441((byte) -111);
        class466.method2802(arg0);
        for (int var24 = class288.field4208.method573(true, -121); var24 != -1; var24 = class288.field4208.method573(false, -124)) {
            class33.method288(0, var24);
            class283.field4157[class519.method3092(class221.field3084++, 31)] = var24;
        }
        for (class177 var25 = class405.method2501(false); var25 != null; var25 = class405.method2501(false)) {
            int var26 = var25.method1190(-73);
            int var27 = var25.method1193(23030);
            if (var26 == 1) {
                class331.field5170[var27] = var25.field2372;
                class298.field4388 |= class534.field7852[var27];
                class250.field3475[class519.method3092(31, class256.field3540++)] = var27;
            } else if (var26 == 2) {
                class429.field6543[var27] = var25.field2367;
                class174.field2335[class519.method3092(31, class235.field3330++)] = var27;
            } else if (var26 == 3) {
                class282 var49 = class21.method194(-106, var27);
                if (!var25.field2367.equals(var49.field4073)) {
                    var49.field4073 = var25.field2367;
                    class206.method1385(2, var49);
                }
            } else if (var26 == 4) {
                class282 var28 = class21.method194(-125, var27);
                int var29 = var25.field2372;
                int var30 = var25.field2369;
                int var31 = var25.field2374;
                if (var28.field4069 != var29 || var28.field4080 != var30 || var28.field4140 != var31) {
                    var28.field4069 = var29;
                    var28.field4140 = var31;
                    var28.field4080 = var30;
                    class206.method1385(2, var28);
                }
            } else if (var26 == 5) {
                class282 var32 = class21.method194(-105, var27);
                if (var25.field2372 != var32.field4061 || var25.field2372 == -1) {
                    var32.field4135 = 0;
                    var32.field4061 = var25.field2372;
                    var32.field4050 = 1;
                    var32.field4015 = 0;
                    class206.method1385(2, var32);
                }
            } else if (var26 == 6) {
                int var43 = var25.field2372;
                int var44 = (var43 & 0x7D9C) >> 10;
                int var45 = var43 >> 5 & 0x1F;
                int var46 = var43 & 0x1F;
                int var47 = (var45 << 11) + (var44 << 19) + (var46 << 3);
                class282 var48 = class21.method194(-125, var27);
                if (var48.field4146 != var47) {
                    var48.field4146 = var47;
                    class206.method1385(2, var48);
                }
            } else if (var26 == 7) {
                class282 var33 = class21.method194(-119, var27);
                boolean var34 = var25.field2372 == 1;
                if (var33.field4020 != var34) {
                    var33.field4020 = var34;
                    class206.method1385(2, var33);
                }
            } else if (var26 == 8) {
                class282 var35 = class21.method194(-118, var27);
                if (var25.field2372 != var35.field4068 || var25.field2369 != var35.field4003 || var25.field2374 != var35.field4090) {
                    var35.field4090 = var25.field2374;
                    var35.field4068 = var25.field2372;
                    var35.field4003 = var25.field2369;
                    if (var35.field4012 != -1) {
                        if (var35.field4105 > 0) {
                            var35.field4090 = var35.field4090 * 32 / var35.field4105;
                        } else if (var35.field4143 > 0) {
                            var35.field4090 = var35.field4090 * 32 / var35.field4143;
                        }
                    }
                    class206.method1385(2, var35);
                }
            } else if (var26 == 9) {
                class282 var42 = class21.method194(-117, var27);
                if (var25.field2372 != var42.field4012 || var25.field2369 != var42.field4042) {
                    var42.field4042 = var25.field2369;
                    var42.field4012 = var25.field2372;
                    class206.method1385(2, var42);
                }
            } else if (var26 == 10) {
                class282 var41 = class21.method194(-105, var27);
                if (var25.field2372 != var41.field4110 || var25.field2369 != var41.field4066 || var25.field2374 != var41.field3992) {
                    var41.field3992 = var25.field2374;
                    var41.field4066 = var25.field2369;
                    var41.field4110 = var25.field2372;
                    class206.method1385(2, var41);
                }
            } else if (var26 == 11) {
                class282 var36 = class21.method194(-116, var27);
                var36.field4127 = 0;
                var36.field4032 = var36.field4130 = var25.field2372;
                var36.field4010 = var36.field4155 = var25.field2369;
                var36.field3993 = 0;
                class206.method1385(2, var36);
            } else if (var26 == 12) {
                class282 var37 = class21.method194(-120, var27);
                int var38 = var25.field2372;
                if (var37 != null && var37.field4103 == 0) {
                    if (var38 > (var37.field4096 - var37.field4043)) {
                        var38 = var37.field4096 - var37.field4043;
                    }
                    if (var38 < 0) {
                        var38 = 0;
                    }
                    if (var37.field4129 != var38) {
                        var37.field4129 = var38;
                        class206.method1385(2, var37);
                    }
                }
            } else if (var26 == 14) {
                class282 var39 = class21.method194(-116, var27);
                var39.field4104 = var25.field2372;
            } else if (var26 == 15) {
                class75.field1103 = var25.field2372;
                class309.field4501 = var25.field2369;
                class176.field2357 = true;
            } else if (var26 == 16) {
                class282 var40 = class21.method194(-111, var27);
                var40.field4113 = var25.field2372;
            }
        }
        class205.field2728++;
        if (class418.field6370 != 0) {
            class194.field2595 += 20;
            if (class194.field2595 >= 400) {
                class418.field6370 = 0;
            }
        }
        if (class269.field3742 != null) {
            class491.field7251++;
            if (class491.field7251 >= 15) {
                class206.method1385(2, class269.field3742);
                class269.field3742 = null;
            }
        }
        class120.field1643 = null;
        class291.field4257 = false;
        class384.field5829 = false;
        class179.field2389 = null;
        class385.method2407(null, -1, -1, (byte) 83);
        class453.method2763(-1, 4, -1, null);
        if (!class44.field641) {
            class449.field6752 = -1;
        }
        class482.method2895(0);
        class145.field1932++;
        if (class208.field2874) {
            class300.field4402++;
            class424.method2582(class392.field6004, -1);
            class538.field7879.method1073(326170192, class81.field1185 | class112.field1567 << 14 | class406.field6160 << 28);
            class208.field2874 = false;
        }
        while (true) {
            class143 var50;
            class282 var51;
            class282 var52;
            do {
                var50 = (class143) class48.field694.method447(8);
                if (var50 == null) {
                    while (true) {
                        class143 var53;
                        class282 var54;
                        class282 var55;
                        do {
                            var53 = (class143) class389.field5942.method447(8);
                            if (var53 == null) {
                                while (true) {
                                    class143 var56;
                                    class282 var57;
                                    class282 var58;
                                    do {
                                        var56 = (class143) class518.field7619.method447(8);
                                        if (var56 == null) {
                                            if (class120.field1643 == null) {
                                                class268.field3734 = 0;
                                            }
                                            if (class466.field6949 != null) {
                                                class201.method1361(!arg0);
                                            }
                                            if (class257.field3562 > 0 && class35.field515.method1970(true, 82) && class35.field515.method1970(true, 81) && class322.field4674 != 0) {
                                                int var59 = class56.field800.field1866 - class322.field4674;
                                                if (var59 < 0) {
                                                    var59 = 0;
                                                } else if (var59 > 3) {
                                                    var59 = 3;
                                                }
                                                class72.method501((byte) -74, class56.field800.field3917[0] + class331.field5162, class56.field800.field3915[0] + class328.field5099, var59);
                                            }
                                            class455.method2769((byte) 113);
                                            for (int var60 = 0; var60 < 5; var60++) {
                                                int var10002 = class508.field7477[var60]++;
                                            }
                                            if (class298.field4388 && (class58.method427((byte) -19) - 60000L) > class439.field6627) {
                                                class141.method943(0);
                                            }
                                            for (class75 var61 = (class75) class345.field5327.method3040(false); var61 != null; var61 = (class75) class345.field5327.method3043((byte) -125)) {
                                                if (class58.method427((byte) -19) / 1000L - 5L > (long) var61.field1097) {
                                                    if (var61.field1100 > 0) {
                                                        class71.method494(0, "", 5, (byte) 122, "", var61.field1104 + class24.field350.method2705((byte) 69, class257.field3556));
                                                    }
                                                    if (var61.field1100 == 0) {
                                                        class71.method494(0, "", 5, (byte) 82, "", var61.field1104 + class501.field7396.method2705((byte) 69, class257.field3556));
                                                    }
                                                    var61.method1184(-19);
                                                }
                                            }
                                            class538.field7895++;
                                            if (class538.field7895 > 500) {
                                                class538.field7895 = 0;
                                                int var62 = (int) (Math.random() * 8.0D);
                                                if ((var62 & 0x2) == 2) {
                                                    class434.field6591 += class132.field1785;
                                                }
                                                if ((var62 & 0x4) == 4) {
                                                    class147.field1957 += class501.field7395;
                                                }
                                                if ((var62 & 0x1) == 1) {
                                                    class76.field1109 += class168.field2262;
                                                }
                                            }
                                            if (class76.field1109 < -50) {
                                                class168.field2262 = 2;
                                            }
                                            if (class76.field1109 > 50) {
                                                class168.field2262 = -2;
                                            }
                                            if (class434.field6591 < -55) {
                                                class132.field1785 = 2;
                                            }
                                            if (class434.field6591 > 55) {
                                                class132.field1785 = -2;
                                            }
                                            if (class147.field1957 < -40) {
                                                class501.field7395 = 1;
                                            }
                                            if (class147.field1957 > 40) {
                                                class501.field7395 = -1;
                                            }
                                            class453.field6826++;
                                            if (class453.field6826 > 500) {
                                                class453.field6826 = 0;
                                                int var63 = (int) (Math.random() * 8.0D);
                                                if ((var63 & 0x1) == 1) {
                                                    class303.field4433 += class41.field604;
                                                }
                                                if ((var63 & 0x2) == 2) {
                                                    class514.field7549 += class153.field2003;
                                                }
                                            }
                                            if (class303.field4433 < -60) {
                                                class41.field604 = 2;
                                            }
                                            if (class514.field7549 < -20) {
                                                class153.field2003 = 1;
                                            }
                                            if (class303.field4433 > 60) {
                                                class41.field604 = -2;
                                            }
                                            if (class514.field7549 > 10) {
                                                class153.field2003 = -1;
                                            }
                                            class106.field1498++;
                                            if (class106.field1498 > 50) {
                                                class118.field1627++;
                                                class424.method2582(class199.field2652, -1);
                                            }
                                            if (class282.field4074) {
                                                class10.method100(-100);
                                                class282.field4074 = false;
                                            }
                                            try {
                                                if (class374.field5695 != null && class538.field7879.field2185 > 0) {
                                                    class132.field1786 += class538.field7879.field2185;
                                                    class374.field5695.method1936(class538.field7879.field2185, true, class538.field7879.field2219, 0);
                                                    class106.field1498 = 0;
                                                    class538.field7879.field2185 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var64) {
                                                class300.method1905(0);
                                                return;
                                            }
                                        }
                                        var57 = var56.field1903;
                                        if (var57.field4031 < 0) {
                                            break;
                                        }
                                        var58 = class21.method194(-119, var57.field4122);
                                    } while (var58 == null || var58.field4108 == null || var58.field4108.length <= var57.field4031 || var58.field4108[var57.field4031] != var57);
                                    class343.method2227(var56);
                                }
                            }
                            var54 = var53.field1903;
                            if (var54.field4031 < 0) {
                                break;
                            }
                            var55 = class21.method194(-114, var54.field4122);
                        } while (var55 == null || var55.field4108 == null || var55.field4108.length <= var54.field4031 || var55.field4108[var54.field4031] != var54);
                        class343.method2227(var53);
                    }
                }
                var51 = var50.field1903;
                if (var51.field4031 < 0) {
                    break;
                }
                var52 = class21.method194(-109, var51.field4122);
            } while (var52 == null || var52.field4108 == null || var52.field4108.length <= var51.field4031 || var52.field4108[var51.field4031] != var51);
            class343.method2227(var50);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([II)V", line = 1131)
    private final void method409(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class103.field1483) {
            var3 = arg1 << 1;
        }
        class192.method1301(arg0, 0, var3);
        this.field793 -= arg1;
        if (this.field786 != null && this.field793 <= 0) {
            this.field793 += class56.field818 >> 4;
            class489.method2923(0, this.field786);
            this.method410((byte) 55, this.field786, this.field786.method711());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class115 var10 = null;
                        class115 var11 = this.field789[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class123 var12 = var11.field1591;
                                if (var12 == null || var12.field1659 <= var8) {
                                    var11.field1592 = true;
                                    int var13 = var11.method709();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1659 += var13;
                                    }
                                    if (var4 >= this.field777) {
                                        break label107;
                                    }
                                    class115 var14 = var11.method714();
                                    if (var14 != null) {
                                        int var15 = var11.field1589;
                                        while (var14 != null) {
                                            this.method410((byte) 92, var14, var15 * var14.method711() >> 8);
                                            var14 = var11.method710();
                                        }
                                    }
                                    class115 var16 = var11.field1590;
                                    var11.field1590 = null;
                                    if (var10 == null) {
                                        this.field789[var7] = var16;
                                    } else {
                                        var10.field1590 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field794[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1590;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class115 var18 = this.field789[var17];
                this.field789[var17] = this.field794[var17] = null;
                while (var18 != null) {
                    class115 var19 = var18.field1590;
                    var18.field1590 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field793 < 0) {
            this.field793 = 0;
        }
        if (this.field786 != null) {
            this.field786.method708(arg0, 0, arg1);
        }
        this.field770 = class58.method427((byte) -19);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BLwq;I)V", line = 1290)
    private final void method410(byte arg0, class115 arg1, int arg2) {
        field779++;
        int var4 = arg2 >> 5;
        if (arg0 < 54) {
            this.method404(-47, null);
        }
        class115 var5 = this.field794[var4];
        if (var5 == null) {
            this.field789[var4] = arg1;
        } else {
            var5.field1590 = arg1;
        }
        this.field794[var4] = arg1;
        arg1.field1589 = arg2;
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "()I", line = 1313)
    public int method411() throws Exception {
        field772++;
        return this.field788;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)V", line = 1324)
    private final void method412(byte arg0, int arg1) {
        field781++;
        this.field793 -= arg1;
        if (this.field793 < 0) {
            this.field793 = 0;
        }
        if (arg0 < 125) {
            this.method401(true);
        }
        if (this.field786 != null) {
            this.field786.method712(arg1);
        }
    }
}
