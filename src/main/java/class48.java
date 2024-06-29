import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class48 implements class69 {

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "[Lhg;")
    private class486[] field721 = new class486[9];

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    private int field729 = 0;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
    private int field741 = -1;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "Lbo;")
    private class511 field739;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "I")
    private int field745;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "Lcu;")
    public static class145 field724 = new class145(32, -1);

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "I")
    public static int field747 = 0;

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "Lvj;")
    public static class304 field749 = new class304("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "Lff;")
    public static class9 field751 = new class9(97, 6);

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "F")
    public static float field754 = 0.0F;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    private int field730;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    private int field735;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    private int field738;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "Lpc;")
    public static class473 field752;

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "Lpc;")
    public static class473 field753;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)V", line = 3)
    public final void method348(int arg0, byte arg1) {
        field740++;
        if (this.field741 == -1) {
            throw new RuntimeException();
        }
        if (arg1 < 90) {
            field754 = -1.272026F;
        }
        OpenGL.glReadBuffer(class73.field1104[arg0]);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V", line = 20)
    public final void method349(int arg0, int arg1) {
        if (arg1 > -88) {
            field754 = 1.1681247F;
        }
        field746++;
        if (this.field741 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class73.field1104[arg0]);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLcj;I)V", line = 34)
    public final void method350(byte arg0, class488 arg1, int arg2) {
        field737++;
        if (this.field741 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg2;
        if ((this.field730 & ~var4) == 0) {
            this.field735 = arg1.field6781;
            this.field738 = arg1.field6772;
        } else if (this.field738 != arg1.field6772 || this.field735 != arg1.field6781) {
            throw new RuntimeException();
        }
        arg1.method2803(this.field741, class73.field1104[arg2], 36161);
        int var5 = 119 % ((56 - arg0) / 34);
        this.field721[arg2] = arg1;
        this.field730 |= var4;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V", line = 67)
    public final void method351(boolean arg0) {
        field723++;
        if (arg0) {
            field751 = null;
        }
        OpenGL.glBindFramebufferEXT(36009, this.field745);
        this.field729 |= 0x2;
        this.field741 = this.method360(-1);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIILef;I)V", line = 82)
    private final void method352(int arg0, int arg1, int arg2, class336 arg3, int arg4) {
        field734++;
        if (this.field741 == -1) {
            throw new RuntimeException();
        }
        int var6 = 86 / ((-arg0 - 24) / 57);
        int var7 = 0x1 << arg2;
        if ((this.field730 & ~var7) == 0) {
            this.field735 = arg3.field4404;
            this.field738 = arg3.field4404;
        } else if (this.field738 != arg3.field4404 || this.field735 != arg3.field4404) {
            throw new RuntimeException();
        }
        arg3.method1924(this.field741, arg4, class73.field1104[arg2], arg1, -122);
        this.field721[arg2] = arg3;
        this.field730 |= var7;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILwr;IB)V", line = 117)
    private final void method353(int arg0, class316 arg1, int arg2, byte arg3) {
        field733++;
        int var5 = -112 % ((arg3 - 57) / 53);
        if (this.field741 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg2;
        if ((this.field730 & ~var6) == 0) {
            this.field735 = arg1.field4143;
            this.field738 = arg1.field4144;
        } else if (this.field738 != arg1.field4144 || this.field735 != arg1.field4143) {
            throw new RuntimeException();
        }
        arg1.method1833(this.field741, 6409, arg0, class73.field1104[arg2]);
        this.field721[arg2] = arg1;
        this.field730 |= var6;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lmk;I)I", line = 149)
    public static final int method354(class39 arg0, int arg1) {
        field722++;
        String var2 = class493.method2836(arg0, (byte) -125);
        int[] var3 = null;
        if (class54.method401(arg0.field590, false)) {
            var3 = class127.field1852.method2390(98, (int) arg0.field596).field6693;
        } else if (arg0.field591 != -1) {
            var3 = class127.field1852.method2390(124, arg0.field591).field6693;
        } else if (class195.method1246((byte) 125, arg0.field590)) {
            class117 var4 = class291.field3822[(int) arg0.field596];
            if (var4 != null) {
                class506 var5 = var4.field1661;
                if (var5.field6971 != null) {
                    var5 = var5.method2885(110, class301.field3980);
                }
                if (var5 != null) {
                    var3 = var5.field6989;
                }
            }
        } else if (class298.method1745(arg0.field590, -36)) {
            Object var6 = null;
            class1 var7;
            if (arg0.field590 == 1012) {
                var7 = class402.field5388.method1994(-17294, (int) arg0.field596);
            } else {
                var7 = class402.field5388.method1994(-17294, (int) (arg0.field596 >>> 32 & 0x7FFFFFFFL));
            }
            if (var7.field58 != null) {
                var7 = var7.method17(class301.field3980, -52);
            }
            if (var7 != null) {
                var3 = var7.field73;
            }
        }
        if (var3 != null) {
            var2 = var2 + class379.method2205(var3, 112);
        }
        if (arg1 < 49) {
            method354(null, 18);
        }
        int var8 = class173.field2525.method2456(544, var2, class9.field220);
        if (arg0.field601) {
            var8 += class413.field5714.method154() + 4;
        }
        return var8;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(Z)V", line = 220)
    public static final void method355(boolean arg0) {
        field720++;
        int var1 = class202.field2799 * 128 + 64;
        int var2 = class438.field6001 * 128 + 64;
        int var3 = class210.method1330(class411.field5656, (byte) -86, var1, var2) - class330.field4348;
        if (class462.field6387 < 100) {
            if (class430.field5888 < var1) {
                class430.field5888 += (var1 - class430.field5888) * class462.field6387 / 1000 + class473.field6544;
                if (class430.field5888 > var1) {
                    class430.field5888 = var1;
                }
            }
            if (var1 < class430.field5888) {
                class430.field5888 -= (class430.field5888 - var1) * class462.field6387 / 1000 + class473.field6544;
                if (var1 > class430.field5888) {
                    class430.field5888 = var1;
                }
            }
            if (var3 > class365.field4937) {
                class365.field4937 += class473.field6544 + ((var3 - class365.field4937) * class462.field6387 / 1000);
                if (var3 < class365.field4937) {
                    class365.field4937 = var3;
                }
            }
            if (class365.field4937 > var3) {
                class365.field4937 -= (class365.field4937 - var3) * class462.field6387 / 1000 + class473.field6544;
                if (var3 > class365.field4937) {
                    class365.field4937 = var3;
                }
            }
            if (class168.field2438 < var2) {
                class168.field2438 += class473.field6544 + ((var2 - class168.field2438) * class462.field6387 / 1000);
                if (var2 < class168.field2438) {
                    class168.field2438 = var2;
                }
            }
            if (var2 < class168.field2438) {
                class168.field2438 -= (class168.field2438 - var2) * class462.field6387 / 1000 + class473.field6544;
                if (class168.field2438 < var2) {
                    class168.field2438 = var2;
                }
            }
        } else {
            class430.field5888 = class202.field2799 * 128 + 64;
            class168.field2438 = class438.field6001 * 128 + 64;
            class365.field4937 = class210.method1330(class411.field5656, (byte) -55, class430.field5888, class168.field2438) - class330.field4348;
        }
        int var4 = class31.field511 * 128 + 64;
        int var5 = class315.field4134 * 128 + 64;
        int var6 = class210.method1330(class411.field5656, (byte) -123, var4, var5) - class40.field606;
        int var7 = var4 - class430.field5888;
        int var8 = var6 - class365.field4937;
        int var9 = var5 - class168.field2438;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (!arg0) {
            return;
        }
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class168.field2439) {
            class168.field2439 += (var11 - class168.field2439 >> 3) * class60.field945 / 1000 + class154.field2242 << 3;
            if (class168.field2439 > var11) {
                class168.field2439 = var11;
            }
        }
        if (var11 < class168.field2439) {
            class168.field2439 -= (class168.field2439 - var11 >> 3) * class60.field945 / 1000 + class154.field2242 << 3;
            if (var11 > class168.field2439) {
                class168.field2439 = var11;
            }
        }
        int var13 = var12 - class207.field2854;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class207.field2854 += class60.field945 * var14 / 1000 + class154.field2242 << 3;
            class207.field2854 &= 0x3FFF;
        }
        if (var14 < 0) {
            class207.field2854 -= -var14 * class60.field945 / 1000 + class154.field2242 << 3;
            class207.field2854 &= 0x3FFF;
        }
        int var15 = var12 - class207.field2854;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class207.field2854 = var12;
        }
        class47.field699 = 0;
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)V", line = 378)
    public final void method356(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field745);
        field742++;
        this.field729 |= 0x1;
        if (arg0 != 7797) {
            this.field721 = null;
        }
        this.field741 = this.method360(arg0 - 7798);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ldm;Z)Z", line = 392)
    public static final boolean method357(class37 arg0, boolean arg1) {
        boolean var2 = class37.field582 == class141.field2049;
        int var3 = 0;
        byte var4 = 0;
        byte var5 = 0;
        arg0.method287(40);
        if (arg0.field581 < 0 || arg0.field587 < 0 || arg0.field580 >= class439.field6036 || arg0.field569 >= class318.field4170) {
            return false;
        }
        for (int var6 = arg0.field581; var6 <= arg0.field580; var6++) {
            for (int var9 = arg0.field587; var9 <= arg0.field569; var9++) {
                class409 var10 = class185.method1204(arg0.field573, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field581) {
                        var11++;
                    }
                    if (var6 < arg0.field580) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field587) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field569) {
                        var11 += 2;
                    }
                    class165 var12 = class331.method1909(var11, arg0, 0);
                    class165 var13 = var10.field5630;
                    if (var13 == null) {
                        var10.field5630 = var12;
                    } else {
                        while (var13.field2400 != null) {
                            var13 = var13.field2400;
                        }
                        var13.field2400 = var12;
                    }
                    var10.field5622 = (byte) (var10.field5622 | var11);
                    if (var2 && (class209.field2863[var6][var9] & 0xFF000000) != 0) {
                        var3 = class209.field2863[var6][var9];
                        var4 = class257.field3401[var6][var9];
                        var5 = class156.field2280[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field581; var7 <= arg0.field580; var7++) {
                for (int var8 = arg0.field587; var8 <= arg0.field569; var8++) {
                    if ((class209.field2863[var7][var8] & 0xFF000000) == 0) {
                        class209.field2863[var7][var8] = var3;
                        class257.field3401[var7][var8] = var4;
                        class156.field2280[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class32.field525[class238.field3189++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IBILef;)V", line = 498)
    public final void method358(int arg0, byte arg1, int arg2, class336 arg3) {
        this.method352(88, 0, arg0, arg3, arg2);
        field726++;
        if (arg1 > -109) {
            this.method358(79, (byte) 21, -86, null);
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lbo;)V", line = 797)
    public class48(class511 arg0) {
        if (!arg0.field7510) {
            throw new IllegalStateException("");
        }
        this.field739 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class292.field3831, 0);
        this.field745 = class292.field3831[0];
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 514)
    public final void method359(int arg0) {
        field731++;
        if (arg0 != -6728) {
            this.method356(-33);
        }
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field729 &= 0xFFFFFFFB;
        this.field741 = this.method360(-1);
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)I", line = 528)
    private final int method360(int arg0) {
        field748++;
        if (~(this.field729 & 0x4) != arg0) {
            return 36160;
        } else if ((this.field729 & 0x2) == 0) {
            return (this.field729 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)I", line = 549)
    public final int method361(byte arg0) {
        field736++;
        return arg0 < 116 ? 20 : this.field735;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)V", line = 560)
    public final void method362(int arg0, int arg1) {
        field743++;
        if (this.field721[arg1] != null) {
            this.field721[arg1].method1503(127);
        }
        if (arg0 != 7553) {
            field754 = -0.15641186F;
        }
        this.field730 &= ~(0x1 << arg1);
        this.field721[arg1] = null;
    }

    @OriginalMember(owner = "client!qh", name = "finalize", descriptor = "()V", line = 577)
    protected final void finalize() throws Throwable {
        field728++;
        this.field739.method2934(117, this.field745);
        super.finalize();
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZILwr;)V", line = 590)
    public final void method363(boolean arg0, int arg1, class316 arg2) {
        if (arg0) {
            this.method353(0, arg2, arg1, (byte) -41);
            field750++;
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(Z)Z", line = 603)
    public static final boolean method364(boolean arg0) {
        for (int var1 = class71.field1089; var1 < class508.field7055; var1++) {
            class409[][] var2 = class497.field6886[var1];
            for (int var3 = -class22.field388; var3 <= 0; var3++) {
                int var4 = class95.field1428 + var3;
                int var5 = class95.field1428 - var3;
                if (var4 >= class414.field5728 || var5 < class260.field3439) {
                    for (int var6 = -class22.field388; var6 <= 0; var6++) {
                        int var7 = class259.field3429 + var6;
                        int var8 = class259.field3429 - var6;
                        if (var4 >= class414.field5728) {
                            if (var7 >= class65.field1017) {
                                class409 var9 = var2[var4][var7];
                                if (var9 != null && var9.field5614) {
                                    class23.field413 = arg0;
                                    class399.field5370.method1042(0, var9);
                                    class399.field5370.method1039((byte) 92);
                                }
                            }
                            if (var8 < class380.field5200) {
                                class409 var10 = var2[var4][var8];
                                if (var10 != null && var10.field5614) {
                                    class23.field413 = arg0;
                                    class399.field5370.method1042(0, var10);
                                    class399.field5370.method1039((byte) 87);
                                }
                            }
                        }
                        if (var5 < class260.field3439) {
                            if (var7 >= class65.field1017) {
                                class409 var11 = var2[var5][var7];
                                if (var11 != null && var11.field5614) {
                                    class23.field413 = arg0;
                                    class399.field5370.method1042(0, var11);
                                    class399.field5370.method1039((byte) 97);
                                }
                            }
                            if (var8 < class380.field5200) {
                                class409 var12 = var2[var5][var8];
                                if (var12 != null && var12.field5614) {
                                    class23.field413 = arg0;
                                    class399.field5370.method1042(0, var12);
                                    class399.field5370.method1039((byte) 115);
                                }
                            }
                        }
                        if (class363.field4921 == 0) {
                            if (class219.field2963) {
                                class399.field5370.method1038(24, (byte) -110);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V", line = 710)
    public static void method365(int arg0) {
        field752 = null;
        field751 = null;
        if (arg0 != 18654) {
            method365(38);
        }
        field749 = null;
        field753 = null;
        field724 = null;
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)Z", line = 728)
    public final boolean method366(byte arg0) {
        if (arg0 != 23) {
            this.field729 = 28;
        }
        field744++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field741);
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V", line = 751)
    public final void method367(byte arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        field732++;
        if (arg0 <= 37) {
            this.method361((byte) -128);
        }
        this.field729 &= 0xFFFFFFFD;
        this.field741 = this.method360(-1);
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V", line = 767)
    public final void method368(int arg0) {
        field727++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        int var2 = 78 / ((arg0 + 37) / 47);
        this.field729 &= 0xFFFFFFFE;
        this.field741 = this.method360(-1);
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V", line = 783)
    public final void method369(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field745);
        if (arg0 > 82) {
            field725++;
            this.field729 |= 0x4;
            this.field741 = this.method360(-1);
        }
    }
}
