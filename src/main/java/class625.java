import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class625 extends class129 {

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "Z")
    private boolean field9137 = false;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "Z")
    private boolean field9144;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "[Lrr;")
    private class380[] field9135;

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field9148 = new String[] { method4644(method4643("cu\u001cF-")), method4644(method4643("li^n")), method4644(method4643("y2\u001c,x")), method4644(method4643("cu\u001cC-")), method4644(method4643("cu\u001cH-")), method4644(method4643("cu\u001cK-")), method4644(method4643("cu\u001cD-")), method4644(method4643("cu\u001cA-")), method4644(method4643("cu\u001c>lluF<-")), method4644(method4643("cu\u001cJ-")), method4644(method4643("cu\u001cE-")) };

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "Lvaa;")
    public static class494 field9136 = new class494(5, 1);

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "Lel;")
    public static class573 field9143 = new class573(24, 6);

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "Lwq;")
    public static class178 field9146 = new class178(128, 4);

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "F")
    public static float field9147;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public static int field9134;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public static int field9139;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    public static int field9140;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "I")
    public static int field9141;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
    public static int field9142;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    public static int field9145;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIB)V")
    public final void method786(int arg0, int arg1, byte arg2) {
        try {
            if (this.field9137) {
                super.field1509.method2453(1, 13);
                super.field1509.method2467(12, this.field9135[arg1 + -1]);
                super.field1509.method2453(0, 13);
            }
            int var4 = -39 / ((21 - arg2) / 56);
            ++field9134;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9148[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZI)V")
    public final void method781(boolean arg0, int arg1) {
        try {
            if (arg1 == 1) {
                ++field9145;
                if (this.field9135 != null && arg0) {
                    super.field1509.method2453(1, 13);
                    super.field1509.method897(class211.field3233, arg1 ^ 1);
                    class770 var3 = super.field1509.method2479(-1);
                    var3.method2387(1024);
                    super.field1509.method2474(2, class735.field10700);
                    if (!this.field9144) {
                        super.field1509.method2417(-60, class684.field9909, class206.field3175);
                        super.field1509.method2498(0, class185.field2557, (byte) -86);
                        super.field1509.method2453(2, 13);
                        super.field1509.method2417(-121, class206.field3175, class362.field5530);
                        super.field1509.method2498(0, class185.field2557, (byte) -83);
                        super.field1509.method889(false, 1, true, 108, class185.field2557);
                        super.field1509.method2443(0, class335.field5233, false);
                        super.field1509.method2467(arg1 ^ 13, super.field1509.field4553);
                    } else {
                        super.field1509.method2417(arg1 ^ -80, class206.field3175, class362.field5530);
                        super.field1509.method889(false, 0, true, 118, class48.field546);
                        super.field1509.method2443(0, class335.field5233, false);
                    }
                    super.field1509.method2453(0, arg1 ^ 12);
                    this.field9137 = true;
                } else {
                    super.field1509.method2443(0, class335.field5233, false);
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9148[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILrca;)V")
    public final void method788(int arg0, int arg1, class479 arg2) {
        try {
            if (arg1 <= -3) {
                super.field1509.method2467(12, arg2);
                ++field9140;
                super.field1509.method2433(-16075, arg0);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9148[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9148[2] : field9148[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)V")
    public static void method4641(int arg0) {
        try {
            field9136 = null;
            field9146 = null;
            if (arg0 != 0) {
                field9136 = null;
            }
            field9143 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9148[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZB)V")
    public final void method784(boolean arg0, byte arg1) {
        try {
            if (arg1 != -34) {
                this.method790(false);
            }
            super.field1509.method2417(-112, class206.field3175, class684.field9909);
            ++field9141;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9148[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lic;I[II)V")
    public static final void method4642(class726 arg0, int arg1, int[] arg2, int arg3) {
        try {
            ++field9139;
            if (arg0.field3841 != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < arg0.field3841.length; ++var5) {
                    if (~arg2[var5] != ~arg0.field3841[var5]) {
                        var4 = false;
                        break;
                    }
                }
                if (var4 && ~arg0.field3814 != 0) {
                    class344 var6 = class272.field4122.method2242(arg0.field3814, 100);
                    int var7 = var6.field5364;
                    if (~var7 == -2) {
                        arg0.field3851 = 0;
                        arg0.field3763 = 1;
                        arg0.field3850 = arg1;
                        arg0.field3794 = 0;
                        arg0.field3821 = 0;
                        if (!arg0.field3800) {
                            class418.method3242(-256, var6, arg0, arg0.field3821);
                        }
                    }
                    if (~var7 == -3) {
                        arg0.field3851 = 0;
                    }
                }
            }
            boolean var8 = true;
            for (int var9 = 0; arg2.length > var9; ++var9) {
                if (arg2[var9] != -1) {
                    var8 = false;
                }
                if (arg0.field3841 == null || arg0.field3841[var9] == -1 || class272.field4122.method2242(arg2[var9], 100).field5348 >= class272.field4122.method2242(arg0.field3841[var9], 100).field5348) {
                    arg0.field3841 = arg2;
                    arg0.field3850 = arg1;
                    break;
                }
            }
            if (var8) {
                arg0.field3850 = arg1;
                arg0.field3841 = arg2;
            }
            int var10 = -74 / ((37 - arg3) / 58);
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field9148[4] + (arg0 != null ? field9148[2] : field9148[1]) + ',' + arg1 + ',' + (arg2 != null ? field9148[2] : field9148[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lkd;)V")
    public class625(class296 arg0) {
        super(arg0);
        try {
            if (arg0.field4640) {
                this.field9144 = ~arg0.field4593 > -4;
                int var2 = !this.field9144 ? 127 : 48;
                int[][] var3 = new int[6][4096];
                int[][] var4 = new int[6][4096];
                int[][] var5 = new int[6][4096];
                int var6 = 0;
                for (int var7 = 0; var7 < 64; ++var7) {
                    for (int var8 = 0; ~var8 > -65; ++var8) {
                        float var9 = (float) var7 * 2.0F / 64.0F - 1.0F;
                        float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                        float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                        float var12 = var10 * var11;
                        float var13 = var9 * var11;
                        for (int var14 = 0; ~var14 > -7; ++var14) {
                            float var15;
                            if (var14 != 0) {
                                if (~var14 != -2) {
                                    if (var14 != 2) {
                                        if (~var14 == -4) {
                                            var15 = -var13;
                                        } else if (~var14 != -5) {
                                            var15 = -var11;
                                        } else {
                                            var15 = var11;
                                        }
                                    } else {
                                        var15 = var13;
                                    }
                                } else {
                                    var15 = var12;
                                }
                            } else {
                                var15 = -var12;
                            }
                            int var16;
                            int var17;
                            int var18;
                            if (var15 > 0.0F) {
                                var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                                var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                                var18 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                            } else {
                                var18 = 0;
                                var17 = 0;
                                var16 = 0;
                            }
                            var4[var14][var6] = var16 << 24;
                            var5[var14][var6] = var17 << 24;
                            var3[var14][var6] = var18 << 24;
                        }
                        ++var6;
                    }
                }
                this.field9135 = new class380[3];
                this.field9135[0] = super.field1509.method904(var4, -113, false, 64);
                this.field9135[1] = super.field1509.method904(var5, -113, false, 64);
                this.field9135[2] = super.field1509.method904(var3, -108, false, 64);
            }
        } catch (RuntimeException var20) {
            throw class759.method5498(var20, field9148[8] + (arg0 != null ? field9148[2] : field9148[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public final void method783(int arg0) {
        try {
            if (!this.field9137) {
                super.field1509.method2443(0, class48.field546, false);
            } else {
                super.field1509.method2453(1, 13);
                super.field1509.method2467(12, (class479) null);
                super.field1509.method897(class194.field2608, 0);
                super.field1509.method2489(0);
                if (this.field9144) {
                    super.field1509.method2417(-88, class684.field9909, class684.field9909);
                    super.field1509.method2498(0, class48.field546, (byte) 48);
                    super.field1509.method2443(0, class48.field546, false);
                } else {
                    super.field1509.method2417(-87, class684.field9909, class684.field9909);
                    super.field1509.method2498(0, class48.field546, (byte) -96);
                    super.field1509.method2453(2, 13);
                    super.field1509.method2417(-80, class684.field9909, class684.field9909);
                    super.field1509.method2498(0, class48.field546, (byte) -124);
                    super.field1509.method2498(1, class185.field2557, (byte) 93);
                    super.field1509.method2443(0, class48.field546, false);
                    super.field1509.method2467(12, (class479) null);
                }
                super.field1509.method2453(0, 13);
                this.field9137 = false;
            }
            ++field9138;
            super.field1509.method2417(-80, class684.field9909, class684.field9909);
            if (arg0 != 1) {
                this.method790(true);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9148[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)Z")
    public final boolean method790(boolean arg0) {
        try {
            ++field9142;
            return !arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9148[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4643(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 5);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4644(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 2;
                    break;
                case 1:
                    var10005 = 28;
                    break;
                case 2:
                    var10005 = 50;
                    break;
                case 3:
                    var10005 = 2;
                    break;
                default:
                    var10005 = 5;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
