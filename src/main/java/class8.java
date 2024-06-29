import java.util.Calendar;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class8 extends class232 {

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
    private int field87 = 0;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    private int field86 = 1024;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
    private int field89 = 2048;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
    private int field92 = 1024;

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "I")
    private int field96 = 409;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
    private int field97 = 819;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
    private int field90 = 1024;

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "I")
    private int field98 = 0;

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "I")
    private int field85 = 1024;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "[Ljava/lang/String;")
    private static final String[] field100 = new String[] { method69(method68("\u001c\u0018\u000bpm")), method69(method68("\u0001P\u000b\u001a8")), method69(method68("\u0014\u000bIX")), method69(method68("\u001c\u0018\u000bqm")), method69(method68("\u001c\u0018\u000bwm")), method69(method68("\u001c\u0018\u000bum")), method69(method68("\u001c\u0018\u000bxm")) };

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
    private int field88;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILwq;I)V")
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            ++field93;
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (arg2 != 2) {
                        if (arg2 != 3) {
                            if (~arg2 != -5) {
                                if (arg2 != 5) {
                                    if (~arg2 != -7) {
                                        if (~arg2 != -8) {
                                            if (arg2 == 8) {
                                                this.field86 = arg1.method1687((byte) -52);
                                            }
                                        } else {
                                            this.field85 = arg1.method1687((byte) -44);
                                        }
                                    } else {
                                        this.field87 = arg1.method1645((byte) -102);
                                    }
                                } else {
                                    this.field90 = arg1.method1687((byte) -99);
                                }
                            } else {
                                this.field97 = arg1.method1687((byte) -128);
                            }
                        } else {
                            this.field96 = arg1.method1687((byte) -122);
                        }
                    } else {
                        this.field89 = arg1.method1687((byte) -95);
                    }
                } else {
                    this.field92 = arg1.method1687((byte) -86);
                }
            } else {
                this.field98 = arg1.method1645((byte) -94);
            }
            if (arg0 < 96) {
                this.field96 = -22;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field100[3] + arg0 + ',' + (arg1 != null ? field100[1] : field100[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILjava/util/Random;[[IIIII)V")
    private final void method64(int arg0, Random arg1, int[][] arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field99;
            if (arg6 != 10) {
                this.method66(4, (byte) -98);
            }
            int var8 = ~this.field86 < -1 ? 4096 + -class235.method2039(arg1, this.field86, arg6 + -87) : 4096;
            int var9 = this.field88 * this.field85 >> 12;
            int var10 = this.field88 + -(var9 <= 0 ? 0 : class235.method2039(arg1, var9, -105));
            if (class449.field6969 <= arg0) {
                arg0 -= class449.field6969;
            }
            if (~var10 < -1) {
                if (arg3 > 0 && ~arg5 < -1) {
                    int var11 = arg5 / 2;
                    int var12 = arg3 / 2;
                    int var13 = var11 >= var10 ? var10 : var11;
                    int var14 = ~var10 < ~var12 ? var12 : var10;
                    int var15 = arg0 - -var13;
                    int var16 = -(var13 * 2) + arg5;
                    for (int var17 = 0; var17 < arg3; ++var17) {
                        int[] var18 = arg2[arg4 + var17];
                        if (var17 < var14) {
                            int var19 = var8 * var17 / var14;
                            if (this.field87 != 0) {
                                for (int var20 = 0; var20 < var13; ++var20) {
                                    int var21 = var8 * var20 / var13;
                                    var18[class292.method2485(arg0 + var20, class250.field3824)] = var18[class292.method2485(arg0 + arg5 + -1 + -var20, class250.field3824)] = ~var21 > ~var19 ? var21 : var19;
                                }
                            } else {
                                for (int var22 = 0; ~var13 < ~var22; ++var22) {
                                    int var23 = var8 * var22 / var13;
                                    var18[class292.method2485(arg0 - -var22, class250.field3824)] = var18[class292.method2485(-var22 - 1 + arg0 + arg5, class250.field3824)] = var19 * var23 >> 12;
                                }
                            }
                            if (~class449.field6969 <= ~(var15 + var16)) {
                                class405.method3257(var18, var15, var16, var19);
                            } else {
                                int var24 = class449.field6969 - var15;
                                class405.method3257(var18, var15, var24, var19);
                                class405.method3257(var18, 0, -var24 + var16, var19);
                            }
                        } else {
                            int var25 = -var17 + arg3 + -1;
                            if (~var14 < ~var25) {
                                int var26 = var8 * var25 / var14;
                                if (~this.field87 != -1) {
                                    for (int var27 = 0; var27 < var13; ++var27) {
                                        int var28 = var8 * var27 / var13;
                                        var18[class292.method2485(arg0 - -var27, class250.field3824)] = var18[class292.method2485(arg0 - -arg5 + -var27 - 1, class250.field3824)] = ~var26 < ~var28 ? var28 : var26;
                                    }
                                } else {
                                    for (int var29 = 0; var29 < var13; ++var29) {
                                        int var30 = var8 * var29 / var13;
                                        var18[class292.method2485(arg0 + var29, class250.field3824)] = var18[class292.method2485(arg0 + arg5 + -var29 + -1, class250.field3824)] = var26 * var30 >> 12;
                                    }
                                }
                                if (class449.field6969 < var15 - -var16) {
                                    int var31 = class449.field6969 - var15;
                                    class405.method3257(var18, var15, var31, var26);
                                    class405.method3257(var18, 0, -var31 + var16, var26);
                                } else {
                                    class405.method3257(var18, var15, var16, var26);
                                }
                            } else {
                                for (int var32 = 0; ~var32 > ~var13; ++var32) {
                                    var18[class292.method2485(arg0 + var32, class250.field3824)] = var18[class292.method2485(arg0 + arg5 + -var32 + -1, class250.field3824)] = var8 * var32 / var13;
                                }
                                if (~class449.field6969 <= ~(var15 - -var16)) {
                                    class405.method3257(var18, var15, var16, var8);
                                } else {
                                    int var33 = -var15 + class449.field6969;
                                    class405.method3257(var18, var15, var33, var8);
                                    class405.method3257(var18, 0, -var33 + var16, var8);
                                }
                            }
                        }
                    }
                }
            } else if (arg0 + arg5 <= class449.field6969) {
                for (int var34 = 0; ~arg3 < ~var34; ++var34) {
                    class405.method3257(arg2[arg4 + var34], arg0, arg5, var8);
                }
            } else {
                int var35 = -arg0 + class449.field6969;
                for (int var36 = 0; ~arg3 < ~var36; ++var36) {
                    int[] var37 = arg2[arg4 - -var36];
                    class405.method3257(var37, arg0, var35, var8);
                    class405.method3257(var37, 0, -var35 + arg5, var8);
                }
            }
        } catch (RuntimeException var39) {
            throw class590.method4333(var39, field100[0] + arg0 + ',' + (arg1 != null ? field100[1] : field100[2]) + ',' + (arg2 != null ? field100[1] : field100[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZIJI)Ljava/lang/String;")
    public static final String method65(boolean arg0, int arg1, long arg2, int arg3) {
        try {
            ++field95;
            Calendar var5;
            if (arg0) {
                class147.method1341(arg3 + 26291, arg2);
                var5 = class679.field9666;
            } else {
                class310.method2659(arg2, (byte) 109);
                var5 = class679.field9664;
            }
            int var6 = var5.get(5);
            int var7 = var5.get(2);
            int var8 = var5.get(1);
            int var9 = var5.get(11);
            int var10 = var5.get(12);
            if (~arg1 == -4) {
                return class430.method3403(arg2, arg0, arg1, (byte) 38);
            } else {
                if (arg3 != 10) {
                    method65(false, 112, -73L, -110);
                }
                return Integer.toString(var6 / 10) + var6 % 10 + "-" + class263.field4276[arg1][var7] + "-" + var8 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field100[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field91;
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (arg1 != 123) {
                this.field96 = -40;
            }
            if (super.field3601.field6907) {
                int[][] var4 = super.field3601.method3465(0);
                int var5 = 0;
                int var6 = 0;
                int var7 = 0;
                int var8 = 0;
                int var9 = 0;
                boolean var10 = true;
                boolean var11 = true;
                int var12 = 0;
                int var13 = 0;
                int var14 = class449.field6969 * this.field92 >> 12;
                int var15 = class449.field6969 * this.field89 >> 12;
                int var16 = class742.field10920 * this.field96 >> 12;
                int var17 = class742.field10920 * this.field97 >> 12;
                if (~var17 >= -2) {
                    return var4[arg0];
                } else {
                    this.field88 = class449.field6969 / 8 * this.field90 >> 12;
                    int var18 = class449.field6969 / var14 + 1;
                    int[][] var19 = new int[var18][3];
                    int[][] var20 = new int[var18][3];
                    Random var21 = new Random((long) this.field98);
                    while (true) {
                        while (true) {
                            int var22 = var14 + class235.method2039(var21, var15 - var14, -106);
                            int var23 = class235.method2039(var21, var17 - var16, -116) + var16;
                            int var24 = var8 + var22;
                            if (class449.field6969 < var24) {
                                var24 = class449.field6969;
                                var22 = -var8 + class449.field6969;
                            }
                            int var25;
                            if (var11) {
                                var25 = 0;
                            } else {
                                int var26 = var9;
                                int[] var27 = var20[var9];
                                int var28 = 0;
                                int var29 = var5 + var24;
                                if (var29 < 0) {
                                    var29 += class449.field6969;
                                }
                                if (class449.field6969 < var29) {
                                    var29 -= class449.field6969;
                                }
                                while (true) {
                                    int[] var30 = var20[var26];
                                    if (var29 >= var30[0] && var30[1] >= var29) {
                                        var25 = var27[2];
                                        if (~var9 != ~var26) {
                                            int var31 = var8 - -var5;
                                            if (var31 < 0) {
                                                var31 += class449.field6969;
                                            }
                                            if (~var31 < ~class449.field6969) {
                                                var31 -= class449.field6969;
                                            }
                                            for (int var32 = 1; var32 <= var28; ++var32) {
                                                int[] var33 = var20[(var9 - -var32) % var12];
                                                var25 = Math.max(var25, var33[2]);
                                            }
                                            for (int var34 = 0; ~var34 >= ~var28; ++var34) {
                                                int[] var35 = var20[(var9 + var34) % var12];
                                                int var36 = var35[2];
                                                if (~var25 != ~var36) {
                                                    int var37 = var35[0];
                                                    int var38 = var35[1];
                                                    int var39;
                                                    int var40;
                                                    if (var29 > var31) {
                                                        var39 = Math.max(var31, var37);
                                                        var40 = Math.min(var29, var38);
                                                    } else if (~var37 == -1) {
                                                        var39 = 0;
                                                        var40 = Math.min(var29, var38);
                                                    } else {
                                                        var39 = Math.max(var31, var37);
                                                        var40 = class449.field6969;
                                                    }
                                                    this.method64(var7 + var39, var21, var4, var25 - var36, var36, -var39 + var40, 10);
                                                }
                                            }
                                        }
                                        var9 = var26;
                                        break;
                                    }
                                    ++var28;
                                    ++var26;
                                    if (~var26 <= ~var12) {
                                        var26 = 0;
                                    }
                                }
                            }
                            if (class742.field10920 < var23 + var25) {
                                var23 = -var25 + class742.field10920;
                            } else {
                                var10 = false;
                            }
                            if (~class449.field6969 != ~var24) {
                                int[] var41 = var19[var13++];
                                var41[1] = var24;
                                var41[0] = var8;
                                var41[2] = var23 + var25;
                                this.method64(var6 + var8, var21, var4, var23, var25, var22, 10);
                                var8 = var24;
                            } else {
                                this.method64(var6 + var8, var21, var4, var23, var25, var22, 10);
                                if (var10) {
                                    return var3;
                                }
                                var10 = true;
                                int[] var42 = var19[var13++];
                                var42[0] = var8;
                                var42[2] = var25 - -var23;
                                var42[1] = var24;
                                int[][] var43 = var20;
                                var20 = var19;
                                var19 = var43;
                                var12 = var13;
                                var13 = 0;
                                var7 = var6;
                                var6 = class235.method2039(var21, class449.field6969, -127);
                                var5 = -var7 + var6;
                                var8 = 0;
                                int var44 = var5;
                                if (~var5 > -1) {
                                    var44 = class449.field6969 + var5;
                                }
                                if (~class449.field6969 > ~var44) {
                                    var44 -= class449.field6969;
                                }
                                var9 = 0;
                                var11 = false;
                                while (true) {
                                    int[] var45 = var20[var9];
                                    if (var44 >= var45[0] && var44 <= var45[1]) {
                                        break;
                                    }
                                    int var10000 = ~var12;
                                    ++var9;
                                    if (var10000 >= ~var9) {
                                        var9 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                return var3;
            }
        } catch (RuntimeException var47) {
            throw class590.method4333(var47, field100[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    public class8() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public final void method67(byte arg0) {
        try {
            ++field94;
            int var2 = -126 % ((arg0 - 73) / 34);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field100[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method68(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 69);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method69(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 122;
                    break;
                case 1:
                    var10005 = 126;
                    break;
                case 2:
                    var10005 = 37;
                    break;
                case 3:
                    var10005 = 52;
                    break;
                default:
                    var10005 = 69;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
