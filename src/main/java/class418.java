import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class418 {

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Lr;")
    private class167 field6390;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Lufa;")
    private class632 field6387;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "Lhga;")
    public static class158 field6400 = new class158(97, -1);

    @OriginalMember(owner = "client!la", name = "t", descriptor = "Z")
    public static boolean field6405 = false;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BIIIILjava/lang/String;I)V")
    public final void method2652(byte arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field6392++;
        if (arg5 == null) {
            return;
        }
        this.method2666(arg4, arg1, 29716);
        if (arg0 <= 11) {
            method2669(null, -27);
        }
        int var8 = arg5.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg2 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg2 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2667(var9, arg6, arg5, var10, arg3 - (this.field6387.method3672(arg5, false) / 2), null, 60, null);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;II[Lf;II[II)V")
    public final void method2653(String arg0, int arg1, int arg2, class702[] arg3, int arg4, int arg5, int[] arg6, int arg7) {
        if (arg7 != -18622) {
            this.method2670(-46, -116, null, -33, -19, 103, -47, -53, 95, (byte) 33, -106, -43, -128, null, null, null, -46);
        }
        field6389++;
        if (arg0 != null) {
            this.method2666(arg4, arg1, arg7 ^ 0xFFFFC356);
            this.method2656(null, arg3, arg0, arg2, 215, 0, arg6, 0, arg5);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;IZ)V")
    public final void method2654(int arg0, int arg1, int arg2, String arg3, int arg4, boolean arg5) {
        if (!arg5) {
            this.method2653(null, -70, -100, null, 34, -25, null, 92);
        }
        field6408++;
        if (arg3 != null) {
            this.method2666(arg1, arg2, 29716);
            this.method2656(null, null, arg3, arg0, 215, 0, null, 0, arg4 - (this.field6387.method3672(arg3, !arg5) / 2));
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;B)V")
    public final void method2655(int arg0, int arg1, int arg2, int arg3, String arg4, byte arg5) {
        field6386++;
        if (arg4 == null) {
            return;
        }
        this.method2666(arg1, arg3, 29716);
        if (arg5 != 71) {
            this.method2652((byte) -42, 27, -38, 105, 126, null, 114);
        }
        this.method2656(null, null, arg4, arg0, 215, 0, null, 0, arg2 - this.field6387.method3672(arg4, false));
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lua;[Lf;Ljava/lang/String;III[III)V")
    private final void method2656(class617 arg0, class702[] arg1, String arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8) {
        field6395++;
        int var10 = arg3 - this.field6387.field8898;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg2.length();
        int var14 = 0;
        if (arg4 != 215) {
            this.field6390 = null;
        }
        while (var14 < var13) {
            char var15 = (char) (class132.method1149(-256, arg2.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                label106: {
                    if (var15 == '>' && var11 != -1) {
                        String var16 = arg2.substring(var11 + 1, var14);
                        var11 = -1;
                        if (var16.equals("lt")) {
                            var15 = '<';
                        } else if (var16.equals("gt")) {
                            var15 = '>';
                        } else if (var16.equals("nbsp")) {
                            var15 = ' ';
                        } else if (var16.equals("shy")) {
                            var15 = '\u00AD';
                        } else if (var16.equals("times")) {
                            var15 = '×';
                        } else if (var16.equals("euro")) {
                            var15 = '€';
                        } else if (var16.equals("copy")) {
                            var15 = '©';
                        } else {
                            if (!var16.equals("reg")) {
                                if (var16.startsWith("img=")) {
                                    try {
                                        int var17 = class566.method3354((byte) -101, var16.substring(4));
                                        class702 var18 = arg1[var17];
                                        int var19 = arg6 == null ? var18.method1079() : arg6[var17];
                                        if ((class240.field3807 & 0xFF000000) == -16777216) {
                                            var18.method1086(arg8, this.field6387.field8898 + var10 - var19, 1, 0, 1);
                                        } else {
                                            var18.method1086(arg8, this.field6387.field8898 + var10 - var19, 0, class240.field3807 & 0xFF000000 | 0xFFFFFF, 1);
                                        }
                                        var12 = -1;
                                        arg8 += arg1[var17].method1076();
                                    } catch (Exception var21) {
                                    }
                                } else {
                                    this.method2663(var16, true);
                                }
                                break label106;
                            }
                            var15 = '®';
                        }
                    }
                    if (var11 == -1) {
                        if (var12 != -1) {
                            arg8 += this.field6387.method3673(var15, var12, arg4 ^ 0xD7);
                        }
                        if (var15 == ' ') {
                            if (class379.field5913 > 0) {
                                class589.field8374 += class379.field5913;
                                arg8 += class589.field8374 >> 8;
                                class589.field8374 &= 0xFF;
                            }
                        } else if (arg0 == null) {
                            if ((client.field4447 & 0xFF000000) != 0) {
                                this.method1408(var15, arg8 + 1, var10 + 1, client.field4447, true);
                            }
                            this.method1408(var15, arg8, var10, class240.field3807, false);
                        } else {
                            if ((client.field4447 & 0xFF000000) != 0) {
                                this.method1410(var15, arg8 + 1, var10 + 1, client.field4447, true, arg0, arg7, arg5);
                            }
                            this.method1410(var15, arg8, var10, class240.field3807, false, arg0, arg7, arg5);
                        }
                        int var20 = this.field6387.method3676((byte) 114, var15);
                        if (class146.field2454 != -1) {
                            this.field6390.method1348(class146.field2454, var20, arg8, 3, (int) ((double) this.field6387.field8898 * 0.7D) + var10);
                        }
                        if (class55.field727 != -1) {
                            this.field6390.method1348(class55.field727, var20, arg8, 3, var10 + this.field6387.field8898 + 1);
                        }
                        var12 = var15;
                        arg8 += var20;
                    }
                }
            }
            var14++;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIIIB)V")
    public final void method2657(String arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 > -66) {
            field6400 = null;
        }
        field6396++;
        if (arg0 != null) {
            this.method2666(arg1, arg3, 29716);
            this.method2656(null, null, arg0, arg4, 215, 0, null, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII[IILjava/lang/String;IIIIIILua;[Lf;I)I")
    public final int method2658(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, String arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class617 arg13, class702[] arg14, int arg15) {
        if (arg9 < 70) {
            field6405 = false;
        }
        field6394++;
        return this.method2670(arg1, arg8, arg6, arg7, arg11, arg15, arg12, arg0, arg2, (byte) 73, arg5, arg3, 0, arg13, arg14, arg4, arg10);
    }

    @OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
    public abstract void method1408(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
    public static final void method2659(boolean arg0) {
        field6399++;
        if (class706.field9988 == 0 || class706.field9988 == 6) {
            return;
        }
        try {
            if (++class16.field248 > 2000) {
                if (class499.field7329 != null) {
                    class499.field7329.method588(24331);
                    class499.field7329 = null;
                }
                if (class127.field2072 >= 2) {
                    class706.field9988 = 0;
                    class235.method1702(-5, (byte) 112);
                    return;
                }
                if (class665.field9421 == 2 || class665.field9421 == 3) {
                    class221.field3591.method2919((byte) -100);
                } else {
                    class464.field6931.method2919((byte) -100);
                }
                class127.field2072++;
                class706.field9988 = 1;
                class16.field248 = 0;
            }
            if (class706.field9988 == 1) {
                if (class665.field9421 == 2 || class665.field9421 == 3) {
                    class161.field2737 = class221.field3591.method2917((byte) 88, class402.field6207);
                } else {
                    class161.field2737 = class464.field6931.method2917((byte) 88, class402.field6207);
                }
                class706.field9988 = 2;
            }
            if (class706.field9988 == 2) {
                if (class161.field2737.field9884 == 2) {
                    throw new IOException();
                }
                if (class161.field2737.field9884 != 1) {
                    return;
                }
                class499.field7329 = class581.method3411((Socket) class161.field2737.field9885, true, 7500);
                class161.field2737 = null;
                long var1 = class193.field3203 = class595.method3477(31485, class63.field808);
                class262.method1861((byte) 97);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class165 var4 = class641.method3717(8592);
                var4.field2776.method65(class434.field6597.field7155, -77);
                var4.field2776.method65(var3, -77);
                class642.method3726(-684096285, var4);
                class132.method1151(0);
                class706.field9988 = 3;
            }
            if (class706.field9988 == 3) {
                if (!class499.field7329.method593(1, -125)) {
                    return;
                }
                class499.field7329.method589(-112, class558.field8066.field96, 1, 0);
                int var5 = class558.field8066.field96[0] & 0xFF;
                if (var5 != 0) {
                    class706.field9988 = 0;
                    class235.method1702(var5, (byte) 112);
                    class499.field7329.method588(24331);
                    class499.field7329 = null;
                    class387.method2520(arg0);
                    return;
                }
                class706.field9988 = 4;
            }
            if (class706.field9988 == 4) {
                if (!class499.field7329.method593(8, -123)) {
                    return;
                }
                class499.field7329.method589(-101, class558.field8066.field96, 8, 0);
                class558.field8066.field57 = 0;
                class107.field1750 = class558.field8066.method69(1282265952);
                class6 var6 = new class6(518);
                int[] var7 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class107.field1750 >> 32), (int) class107.field1750 };
                var6.method65(10, -77);
                var6.method82(!arg0, var7[0]);
                var6.method82(false, var7[1]);
                var6.method82(false, var7[2]);
                var6.method82(false, var7[3]);
                var6.method38(class595.method3477(31485, class63.field808), -18631);
                var6.method28(class521.field7550, 0);
                var6.method38(class658.field9172, -18631);
                var6.method38(class698.field9765, -18631);
                var6.method91(class293.field4612, (byte) 64, class63.field814);
                class262.method1861((byte) 71);
                class165 var8 = class641.method3717(8592);
                class580 var9 = var8.field2776;
                if (class665.field9421 == 2 || class665.field9421 == 3) {
                    if (class682.field9564 == 13) {
                        var9.method65(class434.field6603.field7155, -77);
                    } else {
                        var9.method65(class434.field6601.field7155, -77);
                    }
                    var9.method25(true, 0);
                    int var11 = var9.field57;
                    var9.method82(false, 625);
                    var9.method65(class700.field9878, -77);
                    var9.method65(class33.method452(2), -77);
                    var9.method25(true, class56.field732);
                    var9.method25(true, class259.field4147);
                    var9.method65(class17.field282.field4846, -77);
                    class218.method1627(3, var9);
                    var9.method28(class98.field1592, 0);
                    var9.method82(!arg0, class611.field8698);
                    class6 var12 = new class6(class641.method3718(false));
                    class17.field282.method2130(false, var12);
                    var9.method65(var12.field57, -77);
                    var9.method80(255, var12.field96, var12.field57, 0);
                    class644.field9057 = true;
                    class6 var13 = new class6(class359.field5698.method3525((byte) -42));
                    class359.field5698.method3528(-123, var13);
                    var9.method80(255, var13.field96, var13.field96.length, 0);
                    var9.method25(true, class413.field6347);
                    var9.method38(class73.field920, -18631);
                    var9.method65(class154.field2630 == null ? 0 : 1, -77);
                    if (class154.field2630 != null) {
                        var9.method28(class154.field2630, 0);
                    }
                    class646.method3738(78, var9);
                    var9.method80(255, var6.field96, var6.field57, 0);
                    var9.method84(var9.field57 - var11, -2);
                } else {
                    var9.method65(class434.field6604.field7155, -77);
                    var9.method25(arg0, 0);
                    int var10 = var9.field57;
                    var9.method82(false, 625);
                    var9.method65(class99.field1647.field2742, -77);
                    var9.method65(class135.field2206, -77);
                    class218.method1627(3, var9);
                    var9.method28(class98.field1592, 0);
                    var9.method82(false, class611.field8698);
                    class646.method3738(-88, var9);
                    var9.method80(255, var6.field96, var6.field57, 0);
                    var9.method84(var9.field57 - var10, -2);
                }
                class642.method3726(-684096285, var8);
                class132.method1151(0);
                class420.field6424 = new class46(var7);
                for (int var14 = 0; var14 < 4; var14++) {
                    var7[var14] += 50;
                }
                class558.field8066.method3407((byte) 45, var7);
                class706.field9988 = 5;
            }
            if (class706.field9988 == 5) {
                if (!class499.field7329.method593(1, -121)) {
                    return;
                }
                class499.field7329.method589(-115, class558.field8066.field96, 1, 0);
                int var15 = class558.field8066.field96[0] & 0xFF;
                if (var15 == 21) {
                    class706.field9988 = 8;
                } else if (var15 == 29) {
                    class706.field9988 = 14;
                } else if (var15 == 1) {
                    class706.field9988 = 6;
                    class235.method1702(var15, (byte) 112);
                    return;
                } else if (var15 == 2) {
                    class706.field9988 = 9;
                } else if (var15 == 15) {
                    class344.field5550 = -2;
                    class706.field9988 = 15;
                } else if (var15 == 23 && class127.field2072 < 2) {
                    class127.field2072++;
                    class16.field248 = 0;
                    class706.field9988 = 1;
                    class499.field7329.method588(24331);
                    class499.field7329 = null;
                    return;
                } else {
                    class706.field9988 = 0;
                    class235.method1702(var15, (byte) 112);
                    class499.field7329.method588(24331);
                    class499.field7329 = null;
                    class387.method2520(arg0);
                    return;
                }
            }
            if (!arg0) {
                field6400 = null;
            }
            if (class706.field9988 == 7) {
                class262.method1861((byte) 101);
                class165 var16 = class641.method3717(8592);
                class580 var17 = var16.field2776;
                var17.method3401(false, class420.field6424);
                var17.method3409((byte) -73, class434.field6611.field7155);
                class642.method3726(-684096285, var16);
                class132.method1151(0);
                class706.field9988 = 5;
            } else if (class706.field9988 == 8) {
                if (class499.field7329.method593(1, -118)) {
                    class499.field7329.method589(35, class558.field8066.field96, 1, 0);
                    int var18 = class558.field8066.field96[0] & 0xFF;
                    class213.field3539 = var18 * 60 + 180;
                    class706.field9988 = 0;
                    class235.method1702(21, (byte) 112);
                    class499.field7329.method588(24331);
                    class499.field7329 = null;
                    class387.method2520(true);
                }
            } else if (class706.field9988 == 14) {
                if (class499.field7329.method593(1, -118)) {
                    class499.field7329.method589(-100, class558.field8066.field96, 1, 0);
                    class17.field295 = class558.field8066.field96[0] & 0xFF;
                    class706.field9988 = 0;
                    class235.method1702(29, (byte) 112);
                    class499.field7329.method588(24331);
                    class499.field7329 = null;
                    class387.method2520(true);
                }
            } else if (class706.field9988 != 9) {
                if (class706.field9988 == 10) {
                    class580 var19 = class558.field8066;
                    if (class665.field9421 == 3) {
                        class440.field6707 = true;
                    } else {
                        class440.field6707 = false;
                    }
                    if (class665.field9421 == 2 || class665.field9421 == 3) {
                        if (!class499.field7329.method593(class246.field3930, -128)) {
                            return;
                        }
                        class499.field7329.method589(-112, var19.field96, class246.field3930, 0);
                        var19.field57 = 0;
                        class139.field2342 = var19.method70(-9059);
                        class30.field447 = var19.method70(-9059);
                        class622.field8788 = var19.method70(-9059) == 1;
                        class193.field3197 = var19.method70(-9059) == 1;
                        class530.field7723 = var19.method70(-9059) == 1;
                        class519.field7509 = var19.method70(-9059) == 1;
                        class114.field1793 = var19.method67(12021);
                        class303.field4715 = var19.method70(-9059) == 1;
                        class192.field3179 = var19.method32((byte) 52);
                        class609.field8649 = var19.method70(-9059) == 1;
                        if (class665.field9421 == 3) {
                            boolean var20 = var19.method70(-9059) == 1;
                            if (var20) {
                                long var21 = var19.method69(1282265952);
                                String var23 = class357.method2398(var21, -15775);
                                int var24 = var19.method70(-9059);
                                byte[] var25 = new byte[var24];
                                var19.method3406(var25, var24, 0, -121);
                                String var26 = class432.method2745(var25, false);
                                class441 var27 = null;
                                try {
                                    class701 var28 = class402.field6207.method3169(0, "3", false);
                                    while (var28.field9884 == 0) {
                                        class549.method3313(1L, 126);
                                    }
                                    if (var28.field9884 == 1) {
                                        var27 = (class441) var28.field9885;
                                        int var29 = (3 - (-var23.length() - var26.length())) + 8 + 9;
                                        if (class154.field2630 != null) {
                                            var29 += class154.field2630.length() + 2;
                                        }
                                        if (var29 > 120) {
                                            throw new RuntimeException(">120");
                                        }
                                        class6 var30 = new class6(var29 + 1);
                                        var30.method65(var29, -77);
                                        var30.method65(3, -77);
                                        var30.method79(var23, arg0);
                                        var30.method79(var26, true);
                                        var30.method25(true, class611.field8698);
                                        var30.method38(class73.field920, -18631);
                                        var30.method65(class154.field2630 == null ? 0 : 1, -77);
                                        if (class154.field2630 != null) {
                                            var30.method79(class154.field2630, true);
                                        }
                                        var30.method89(0);
                                        var27.method2783(var30.field96, 0, var30.field57, 113);
                                    }
                                } catch (Exception var40) {
                                }
                                try {
                                    if (var27 != null) {
                                        var27.method2785(-1856);
                                    }
                                } catch (Exception var38) {
                                }
                                try {
                                    class358.method2403("demoaccountcreated", class450.field6772, -29103);
                                } catch (Throwable var37) {
                                }
                            }
                        }
                        class213.field3537.method96(30, class609.field8649);
                        class91.field1083.method2849((byte) 48, class609.field8649);
                        class538.field7860.method3226((byte) 116, class609.field8649);
                    } else if (class499.field7329.method593(class246.field3930, -119)) {
                        class499.field7329.method589(24, var19.field96, class246.field3930, 0);
                        var19.field57 = 0;
                        class139.field2342 = var19.method70(-9059);
                        class30.field447 = var19.method70(-9059);
                        class622.field8788 = var19.method70(-9059) == 1;
                        class193.field3197 = var19.method70(-9059) == 1;
                        class530.field7723 = var19.method70(-9059) == 1;
                        class500.field7339 = var19.method45(-8652);
                        class303.field4715 = class500.field7339 > 0;
                        class470.field6973 = var19.method67(12021);
                        class312.field4908 = var19.method67(12021);
                        class388.field6012 = var19.method67(12021);
                        class7.field112 = var19.method72(-54);
                        class578.field8243 = class402.field6207.method3183((byte) 115, class7.field112);
                        class78.field989 = var19.method70(-9059);
                        class303.field4732 = var19.method67(12021);
                        class112.field1783 = var19.method67(12021);
                        class407.field6291 = var19.method70(-9059) == 1;
                        class567.field8141.field4792 = class567.field8141.field4759 = var19.method53((byte) 40);
                        class293.field4613 = var19.method70(-9059);
                        class559.field8075 = var19.method72(-38);
                        class331.field5115 = new class470();
                        class331.field5115.field6971 = var19.method67(12021);
                        if (class331.field5115.field6971 == 65535) {
                            class331.field5115.field6971 = -1;
                        }
                        class331.field5115.field6959 = var19.method53((byte) 40);
                        if (class660.field9192 != class182.field3060) {
                            class331.field5115.field6966 = class331.field5115.field6971 + 50000;
                            class331.field5115.field6960 = class331.field5115.field6971 + 40000;
                        }
                        if (class660.field9192 != class31.field451 && (class221.field3591.method2920(class255.field4053, (byte) 124) || class221.field3591.method2920(class623.field8794, (byte) 120))) {
                            class184.method1498(true);
                        }
                    } else {
                        return;
                    }
                    if ((!class622.field8788 || class530.field7723) && !class303.field4715) {
                        try {
                            class358.method2403("unzap", class450.field6772, -29103);
                        } catch (Throwable var35) {
                        }
                    } else {
                        try {
                            class358.method2403("zap", class450.field6772, -29103);
                        } catch (Throwable var39) {
                            if (class476.field7057) {
                                try {
                                    class450.field6772.getAppletContext().showDocument(new URL(class450.field6772.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var36) {
                                }
                            }
                        }
                    }
                    if (class660.field9192 == class182.field3060) {
                        try {
                            class358.method2403("loggedin", class450.field6772, -29103);
                        } catch (Throwable var34) {
                        }
                    }
                    if (class665.field9421 != 2 && class665.field9421 != 3) {
                        class706.field9988 = 0;
                        class235.method1702(2, (byte) 112);
                        class574.method3372((byte) 67);
                        class68.method715(7, (byte) -66);
                        class253.field4038 = null;
                        return;
                    }
                    class706.field9988 = 12;
                }
                if (class706.field9988 == 12) {
                    if (!class499.field7329.method593(3, -127)) {
                        return;
                    }
                    class499.field7329.method589(-127, class558.field8066.field96, 3, 0);
                    class706.field9988 = 13;
                }
                if (class706.field9988 == 13) {
                    class580 var31 = class558.field8066;
                    var31.field57 = 0;
                    if (var31.method3408((byte) 66)) {
                        if (!class499.field7329.method593(1, -118)) {
                            return;
                        }
                        class499.field7329.method589(99, var31.field96, 1, 3);
                    }
                    class253.field4038 = class658.method3780((byte) -3)[var31.method3399((byte) 0)];
                    class344.field5550 = var31.method67(12021);
                    class706.field9988 = 11;
                }
                if (class706.field9988 == 11) {
                    if (class499.field7329.method593(class344.field5550, -117)) {
                        class499.field7329.method589(-120, class558.field8066.field96, class344.field5550, 0);
                        class558.field8066.field57 = 0;
                        int var32 = class344.field5550;
                        class706.field9988 = 0;
                        class235.method1702(2, (byte) 112);
                        class443.method2797(!arg0);
                        class419.method2672(-75, class558.field8066);
                        class456.field6843 = -1;
                        if (class478.field7073 == class253.field4038) {
                            class49.method557(5424);
                        } else {
                            class163.method1323(!arg0);
                        }
                        if (class558.field8066.field57 != var32) {
                            throw new RuntimeException("lswp pos:" + class558.field8066.field57 + " psize:" + var32);
                        }
                        class253.field4038 = null;
                    }
                } else if (class706.field9988 == 15) {
                    if (class344.field5550 == -2) {
                        if (!class499.field7329.method593(2, -120)) {
                            return;
                        }
                        class499.field7329.method589(-110, class558.field8066.field96, 2, 0);
                        class558.field8066.field57 = 0;
                        class344.field5550 = class558.field8066.method67(12021);
                    }
                    if (class499.field7329.method593(class344.field5550, -119)) {
                        class499.field7329.method589(-98, class558.field8066.field96, class344.field5550, 0);
                        class558.field8066.field57 = 0;
                        int var33 = class344.field5550;
                        class706.field9988 = 0;
                        class235.method1702(15, (byte) 112);
                        class260.method1844((byte) 2);
                        class419.method2672(-76, class558.field8066);
                        if (class558.field8066.field57 != var33) {
                            throw new RuntimeException("lswpr pos:" + class558.field8066.field57 + " psize:" + var33);
                        }
                        class253.field4038 = null;
                    }
                }
            } else if (class499.field7329.method593(1, -128)) {
                class499.field7329.method589(35, class558.field8066.field96, 1, 0);
                class706.field9988 = 10;
                class246.field3930 = class558.field8066.field96[0] & 0xFF;
            }
        } catch (IOException var41) {
            if (class499.field7329 != null) {
                class499.field7329.method588(24331);
                class499.field7329 = null;
            }
            if (class127.field2072 >= 2) {
                class706.field9988 = 0;
                class235.method1702(-4, (byte) 112);
                class387.method2520(true);
            } else {
                if (class665.field9421 == 2 || class665.field9421 == 3) {
                    class221.field3591.method2919((byte) -100);
                } else {
                    class464.field6931.method2919((byte) -100);
                }
                class706.field9988 = 1;
                class127.field2072++;
                class16.field248 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[IILjava/lang/String;II[Lf;ILjava/util/Random;I)I")
    public final int method2660(int arg0, int[] arg1, int arg2, String arg3, int arg4, int arg5, class702[] arg6, int arg7, Random arg8, int arg9) {
        field6397++;
        if (arg3 == null) {
            return 0;
        }
        arg8.setSeed((long) arg4);
        int var11 = (arg8.nextInt() & 0x1F) + 192;
        this.method2666(var11 << 24 | arg0 & 0xFFFFFF, var11 << 24 | arg9 & 0xFFFFFF, 29716);
        int var12 = arg3.length();
        int[] var13 = new int[var12];
        if (arg2 > -101) {
            return 63;
        }
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg8.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2667(var13, arg7, arg3, null, arg5, arg6, 60, arg1);
        return var14;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BILjava/lang/String;)V")
    private final void method2661(byte arg0, int arg1, String arg2) {
        field6388++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; arg2.length() > var6; var6++) {
            char var7 = arg2.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (var4 > 0) {
            class379.field5913 = (arg1 - this.field6387.method3672(arg2, false) << 8) / var4;
        }
        if (arg0 <= 13) {
            field6405 = true;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZILjava/lang/String;IIII)V")
    public final void method2662(int arg0, boolean arg1, int arg2, String arg3, int arg4, int arg5, int arg6, int arg7) {
        field6404++;
        if (arg3 == null) {
            return;
        }
        this.method2666(arg0, arg4, 29716);
        double var9 = 7.0D - (double) arg2 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg3.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg7) * var9);
        }
        this.method2667(null, arg6, arg3, var12, arg5 - (this.field6387.method3672(arg3, arg1) / 2), null, 60, null);
        if (arg1) {
            field6400 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    private final void method2663(String arg0, boolean arg1) {
        field6393++;
        try {
            if (arg0.startsWith("col=")) {
                class240.field3807 = class240.field3807 & 0xFF000000 | class428.method2716(16, 512, arg0.substring(4)) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class240.field3807 = class240.field3807 & 0xFF000000 | class28.field440 & 0xFFFFFF;
            }
            if (arg0.startsWith("argb=")) {
                class240.field3807 = class428.method2716(16, 512, arg0.substring(5));
            } else if (arg0.equals("/argb")) {
                class240.field3807 = class28.field440;
            } else if (arg0.startsWith("str=")) {
                class146.field2454 = class240.field3807 & 0xFF000000 | class428.method2716(16, 512, arg0.substring(4));
            } else if (arg0.equals("str")) {
                class146.field2454 = class240.field3807 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class146.field2454 = -1;
            } else if (arg0.startsWith("u=")) {
                class55.field727 = class240.field3807 & 0xFF000000 | class428.method2716(16, 512, arg0.substring(2));
            } else if (arg0.equals("u")) {
                class55.field727 = class240.field3807 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class55.field727 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                client.field4447 = 0;
            } else if (arg0.startsWith("shad=")) {
                client.field4447 = class240.field3807 & 0xFF000000 | class428.method2716(16, 512, arg0.substring(5));
            } else if (arg0.equals("shad")) {
                client.field4447 = class240.field3807 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                client.field4447 = class454.field6831;
            } else if (arg0.equals("br")) {
                this.method2666(class454.field6831, class28.field440, 29716);
            }
            if (!arg1) {
                this.method2662(-25, false, -16, null, 123, -93, 19, 82);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method2664(int arg0) {
        field6400 = null;
        if (arg0 != 4) {
            method2664(-96);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
    public final void method2665(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        int var8 = 3 / ((83 - arg3) / 41);
        field6406++;
        if (arg6 == null) {
            return;
        }
        this.method2666(arg1, arg2, 29716);
        int var9 = arg6.length();
        int[] var10 = new int[var9];
        for (int var11 = 0; var11 < var9; var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 2.0D) * 5.0D);
        }
        this.method2667(null, arg4, arg6, var10, arg0 - (this.field6387.method3672(arg6, false) / 2), null, 60, null);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
    private final void method2666(int arg0, int arg1, int arg2) {
        class55.field727 = -1;
        if (arg2 != 29716) {
            return;
        }
        class589.field8374 = 0;
        class28.field440 = arg1;
        class240.field3807 = arg1;
        field6391++;
        class146.field2454 = -1;
        if (arg0 == -1) {
            arg0 = 0;
        }
        class379.field5913 = 0;
        class454.field6831 = arg0;
        client.field4447 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([IILjava/lang/String;[II[Lf;I[I)V")
    private final void method2667(int[] arg0, int arg1, String arg2, int[] arg3, int arg4, class702[] arg5, int arg6, int[] arg7) {
        int var9 = arg1 - this.field6387.field8898;
        field6407++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg6 != 60) {
            field6405 = true;
        }
        int var13 = arg2.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class132.method1149(-256, arg2.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg2.substring(var10 + 1, var14);
                    var10 = -1;
                    if (var16.equals("lt")) {
                        var15 = '<';
                    } else if (var16.equals("gt")) {
                        var15 = '>';
                    } else if (var16.equals("nbsp")) {
                        var15 = ' ';
                    } else if (var16.equals("shy")) {
                        var15 = '\u00AD';
                    } else if (var16.equals("times")) {
                        var15 = '×';
                    } else if (var16.equals("euro")) {
                        var15 = '€';
                    } else if (var16.equals("copy")) {
                        var15 = '©';
                    } else {
                        if (!var16.equals("reg")) {
                            if (var16.startsWith("img=")) {
                                try {
                                    int var17;
                                    if (arg0 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg0[var12];
                                    }
                                    int var18;
                                    if (arg3 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg3[var12];
                                    }
                                    var12++;
                                    int var19 = class566.method3354((byte) 40, var16.substring(4));
                                    class702 var20 = arg5[var19];
                                    int var21 = arg7 == null ? var20.method1079() : arg7[var19];
                                    var20.method1086(arg4 + var17, -var21 + var18 + this.field6387.field8898 + var9, 1, 0, 1);
                                    var11 = -1;
                                    arg4 += arg5[var19].method1076();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2663(var16, true);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg4 += this.field6387.method3673(var15, var11, 0);
                    }
                    int var22;
                    if (arg0 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg0[var12];
                    }
                    int var23;
                    if (arg3 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg3[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((client.field4447 & 0xFF000000) != 0) {
                            this.method1408(var15, arg4 + var22 + 1, var9 + var23 + 1, client.field4447, true);
                        }
                        this.method1408(var15, arg4 + var22, var9 + var23, class240.field3807, false);
                    } else if (class379.field5913 > 0) {
                        class589.field8374 += class379.field5913;
                        arg4 += class589.field8374 >> 8;
                        class589.field8374 &= 0xFF;
                    }
                    int var24 = this.field6387.method3676((byte) 114, var15);
                    if (class146.field2454 != -1) {
                        this.field6390.method1348(class146.field2454, var24, arg4, 3, (int) ((double) this.field6387.field8898 * 0.7D) + var9);
                    }
                    if (class55.field727 != -1) {
                        this.field6390.method1348(class55.field727, var24, arg4, 3, this.field6387.field8898 + var9);
                    }
                    arg4 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[IIII[IIIILjava/util/Random;IIILjava/lang/String;[Lf;)I")
    public final int method2668(int arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, Random arg9, int arg10, int arg11, int arg12, String arg13, class702[] arg14) {
        field6398++;
        if (arg13 == null) {
            return 0;
        }
        arg9.setSeed((long) arg10);
        int var16 = (arg9.nextInt() & 0x1F) + 192;
        this.method2666(arg3 & 0xFFFFFF | var16 << 24, var16 << 24 | arg6 & 0xFFFFFF, arg2 ^ 0x7428);
        int var17 = arg13.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        if (arg2 != 60) {
            this.method2666(-39, 61, -124);
        }
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg9.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg0;
        int var22 = this.field6387.field8890 + arg12;
        if (arg11 == 1) {
            var22 += (arg4 - (this.field6387.field8890 + this.field6387.field8893)) / 2;
        } else if (arg11 == 2) {
            var22 = arg4 + arg12 - this.field6387.field8893;
        }
        int var23 = -1;
        if (arg8 == 1) {
            var23 = var19 + this.field6387.method3672(arg13, false);
            var21 = (arg7 - var23) / 2 + arg0;
        } else if (arg8 == 2) {
            var23 = var19 + this.field6387.method3672(arg13, false);
            var21 = arg7 + arg0 - var23;
        }
        this.method2667(var18, var22, arg13, null, var21, arg14, 60, arg1);
        if (arg5 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field6387.method3672(arg13, false);
            }
            arg5[1] = var22 - this.field6387.field8890;
            arg5[3] = this.field6387.field8893 + this.field6387.field8890;
            arg5[0] = var21;
            arg5[2] = var23;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lr;I)V")
    public static final void method2669(class167 arg0, int arg1) {
        if (arg1 == 256) {
            field6402++;
            if (class416.field6365 != class567.field8141.field9695 && class454.field6818 != null && class436.method2770(class567.field8141.field9695, -10, arg0)) {
                class416.field6365 = class567.field8141.field9695;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;IIIIIIBIIILua;[Lf;[II)I")
    public final int method2670(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10, int arg11, int arg12, class617 arg13, class702[] arg14, int[] arg15, int arg16) {
        field6403++;
        if (arg2 == null) {
            return 0;
        }
        this.method2666(arg6, arg0, 29716);
        if (arg16 == 0) {
            arg16 = this.field6387.field8898;
        }
        int[] var18;
        if ((this.field6387.field8893 + this.field6387.field8890 + arg16) > arg5 && arg16 + arg16 > arg5) {
            var18 = null;
        } else {
            var18 = new int[] { arg7 };
        }
        if (arg12 == -1) {
            arg12 = arg5 / arg16;
            if (arg12 <= 0) {
                arg12 = 1;
            }
        }
        int var19 = this.field6387.method3675(arg2, arg9 ^ 0xFFFFFFCB, arg14, var18, class499.field7330);
        if (arg12 > 0 && var19 >= arg12) {
            var19 = arg12;
            class499.field7330[arg12 - 1] = this.field6387.method3671(arg14, class499.field7330[arg12 - 1], arg7, (byte) 49);
        }
        if (arg8 == 3 && var19 == 1) {
            arg8 = 1;
        }
        if (arg9 != 73) {
            method2671(null, 104, -47, 64, false, null, -27, null);
        }
        int var20;
        if (arg8 == 0) {
            var20 = this.field6387.field8890 + arg10;
        } else if (arg8 == 1) {
            var20 = this.field6387.field8890 + ((arg5 - this.field6387.field8893 - (var19 - 1) * arg16 - this.field6387.field8890) / 2) + arg10;
        } else if (arg8 == 2) {
            var20 = arg5 + arg10 - ((var19 - 1) * arg16) - this.field6387.field8893;
        } else {
            int var21 = (arg5 - ((var19 - 1) * arg16) - this.field6387.field8890 - this.field6387.field8893) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg16 += var21;
            var20 = arg10 + var21 + this.field6387.field8890;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg3 == 0) {
                this.method2656(arg13, arg14, class499.field7330[var22], var20, 215, arg11, arg15, arg4, arg1);
            } else if (arg3 == 1) {
                this.method2656(arg13, arg14, class499.field7330[var22], var20, 215, arg11, arg15, arg4, (arg7 - this.field6387.method3672(class499.field7330[var22], false)) / 2 + arg1);
            } else if (arg3 == 2) {
                this.method2656(arg13, arg14, class499.field7330[var22], var20, 215, arg11, arg15, arg4, arg1 + arg7 - this.field6387.method3672(class499.field7330[var22], false));
            } else if (var19 - 1 == var22) {
                this.method2656(arg13, arg14, class499.field7330[var22], var20, 215, arg11, arg15, arg4, arg1);
            } else {
                this.method2661((byte) 44, arg7, class499.field7330[var22]);
                this.method2656(arg13, arg14, class499.field7330[var22], var20, 215, arg11, arg15, arg4, arg1);
                class379.field5913 = 0;
            }
            var20 += arg16;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lua;IIIZLpca;ILf;)V")
    public static final void method2671(class617 arg0, int arg1, int arg2, int arg3, boolean arg4, class665 arg5, int arg6, class702 arg7) {
        field6401++;
        if (arg7 == null) {
            return;
        }
        int var8;
        if (class126.field2062 == 4) {
            var8 = (int) class37.field514 & 0x3FFF;
        } else {
            var8 = (int) class37.field514 + class44.field616 & 0x3FFF;
        }
        int var9 = Math.max(arg5.field9411 / 2, arg5.field9282 / 2) + 10;
        int var10 = arg1 * arg1 + arg6 * arg6;
        if (var10 > (var9 * var9)) {
            return;
        }
        int var11 = class567.field8139[var8];
        int var12 = class567.field8138[var8];
        if (class126.field2062 != 4) {
            var12 = var12 * 256 / (class64.field820 + 256);
            var11 = var11 * 256 / (class64.field820 + 256);
        }
        int var13 = arg1 * var12 + arg6 * var11 >> 14;
        int var14 = arg6 * var12 - (arg1 * var11) >> 14;
        if (arg4) {
            arg7.method1080(arg2 + (arg5.field9411 / 2) + var13 - (arg7.method1076() / 2), -var14 + arg5.field9282 / 2 + arg3 + -(arg7.method1079() / 2), arg0, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lr;Lufa;)V")
    public class418(class167 arg0, class632 arg1) {
        this.field6390 = arg0;
        this.field6387 = arg1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLua;II)V")
    public abstract void method1410(char arg0, int arg1, int arg2, int arg3, boolean arg4, class617 arg5, int arg6, int arg7);
}
