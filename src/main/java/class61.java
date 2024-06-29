import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class class61 {

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "Lea;")
    private class58 field830;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Lci;")
    private class389 field825;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    public static int field835;

    static {
        new class368("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field834 = -50;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILjava/lang/String;IIIIILjava/util/Random;[Lwn;I[II[IIB)I", line = 3)
    public final int method482(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Random arg7, class77[] arg8, int arg9, int[] arg10, int arg11, int[] arg12, int arg13, byte arg14) {
        field826++;
        if (arg14 != 57) {
            this.method491(23, (String) null, 11, (int[]) null, (int[]) null, (int[]) null, 69, (class77[]) null);
        }
        if (arg1 == null) {
            return 0;
        }
        arg7.setSeed((long) arg5);
        int var16 = (arg7.nextInt() & 0x1F) + 192;
        this.method483(-55, arg4 & 0xFFFFFF | var16 << 24, arg6 & 0xFFFFFF | var16 << 24);
        int var17 = arg1.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg7.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg0;
        int var22 = this.field825.field5406 + arg9;
        int var23 = -1;
        if (arg2 == 1) {
            var22 += (arg13 - this.field825.field5406 - this.field825.field5419) / 2;
        } else if (arg2 == 2) {
            var22 = arg9 + arg13 - this.field825.field5419;
        }
        if (arg11 == 1) {
            var23 = this.field825.method2419(arg1, (byte) -91) + var19;
            var21 = (arg3 - var23) / 2 + arg0;
        } else if (arg11 == 2) {
            var23 = this.field825.method2419(arg1, (byte) -118) + var19;
            var21 = arg3 + arg0 - var23;
        }
        this.method491(var21, arg1, arg14 ^ 0x2129, (int[]) null, var18, arg12, var22, arg8);
        if (arg10 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field825.method2419(arg1, (byte) -122);
            }
            arg10[1] = var22 - this.field825.field5406;
            arg10[2] = var23;
            arg10[3] = this.field825.field5419 + this.field825.field5406;
            arg10[0] = var21;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)V", line = 82)
    private final void method483(int arg0, int arg1, int arg2) {
        class339.field4580 = arg2;
        class424.field5913 = arg2;
        class316.field4298 = -1;
        class268.field3673 = -1;
        class34.field466 = 0;
        if (arg0 > -31) {
            return;
        }
        if (arg1 == -1) {
            arg1 = 0;
        }
        field835++;
        class217.field3056 = 0;
        class304.field4143 = arg1;
        class48.field619 = arg1;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILjava/lang/String;IIII)V", line = 106)
    public final void method484(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field821++;
        int var7 = 10 / ((arg5 - 5) / 55);
        if (arg1 != null) {
            this.method483(-102, arg0, arg2);
            this.method492(110, arg4, (class77[]) null, 0, arg1, 0, arg3 - (this.field825.method2419(arg1, (byte) -123) / 2), (int[]) null, (class165) null);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([ILjava/lang/String;BI[Lwn;III)V", line = 124)
    public final void method485(int[] arg0, String arg1, byte arg2, int arg3, class77[] arg4, int arg5, int arg6, int arg7) {
        if (arg2 <= 62) {
            this.method373((char) 65449, 103, -16, -117, true, (class165) null, 60, 47);
        }
        field818++;
        if (arg1 != null) {
            this.method483(-86, arg3, arg5);
            this.method492(125, arg6, arg4, 0, arg1, 0, arg7, arg0, (class165) null);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIBIILjava/lang/String;)V", line = 139)
    public final void method486(int arg0, int arg1, byte arg2, int arg3, int arg4, String arg5) {
        field822++;
        if (arg5 != null && arg2 == 44) {
            this.method483(-115, arg4, arg1);
            this.method492(111, arg3, (class77[]) null, 0, arg5, 0, arg0, (int[]) null, (class165) null);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBIIILjava/lang/String;I)V", line = 161)
    public final void method487(int arg0, byte arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field833++;
        if (arg5 == null) {
            return;
        }
        this.method483(-88, arg6, arg3);
        int var8 = arg5.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        if (arg1 != 67) {
            return;
        }
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg2 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg2 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method491(arg0 - (this.field825.method2419(arg5, (byte) -126) / 2), arg5, 8464, var10, var9, (int[]) null, arg4, (class77[]) null);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([Lwn;IIII[IILjava/lang/String;ILjava/util/Random;)I", line = 194)
    public final int method488(class77[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, String arg7, int arg8, Random arg9) {
        field820++;
        if (arg7 == null) {
            return 0;
        }
        arg9.setSeed((long) arg6);
        int var11 = (arg9.nextInt() & 0x1F) + 192;
        this.method483(arg8 - 73, arg4 & 0xFFFFFF | var11 << 24, arg1 & 0xFFFFFF | var11 << 24);
        int var12 = arg7.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        int var15 = 0;
        if (arg8 != 1) {
            method499(-23, 11, -46, -57, true, false);
        }
        while (var15 < var12) {
            var13[var15] = var14;
            if ((arg9.nextInt() & 0x3) == 0) {
                var14++;
            }
            var15++;
        }
        this.method491(arg2, arg7, 8464, (int[]) null, var13, arg5, arg3, arg0);
        return var14;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IILjava/lang/String;)V", line = 237)
    private final void method489(int arg0, int arg1, String arg2) {
        field815++;
        int var4 = 0;
        boolean var5 = false;
        if (arg0 >= -127) {
            return;
        }
        for (int var6 = 0; var6 < arg2.length(); var6++) {
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
            class34.field466 = (arg1 - this.field825.method2419(arg2, (byte) -127) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IILjava/lang/String;IIII[IIBLde;[Lwn;IIII)I", line = 276)
    public final int method490(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, byte arg9, class165 arg10, class77[] arg11, int arg12, int arg13, int arg14, int arg15) {
        field828++;
        if (arg2 == null) {
            return 0;
        }
        this.method483(-78, arg0, arg3);
        if (arg9 >= -90) {
            field834 = 122;
        }
        if (arg4 == 0) {
            arg4 = this.field825.field5407;
        }
        int[] var17;
        if (arg5 < (this.field825.field5419 + arg4 + this.field825.field5406) && (arg4 + arg4) > arg5) {
            var17 = null;
        } else {
            var17 = new int[] { arg15 };
        }
        int var18 = this.field825.method2423(arg11, class403.field5563, (byte) 120, arg2, var17);
        if (arg1 == 3 && var18 == 1) {
            arg1 = 1;
        }
        int var19;
        if (arg1 == 0) {
            var19 = this.field825.field5406 + arg12;
        } else if (arg1 == 1) {
            var19 = (arg5 - this.field825.field5406 - this.field825.field5419 - ((var18 + -1) * arg4)) / 2 + this.field825.field5406 + arg12;
        } else if (arg1 == 2) {
            var19 = arg12 + arg5 - this.field825.field5419 - ((var18 + -1) * arg4);
        } else {
            int var20 = (arg5 - this.field825.field5406 - ((var18 - 1) * arg4) - this.field825.field5419) / (var18 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            var19 = arg12 + this.field825.field5406 + var20;
            arg4 += var20;
        }
        for (int var21 = 0; var21 < var18; var21++) {
            if (arg6 == 0) {
                this.method492(119, var19, arg11, arg13, class403.field5563[var21], arg14, arg8, arg7, arg10);
            } else if (arg6 == 1) {
                this.method492(126, var19, arg11, arg13, class403.field5563[var21], arg14, (arg15 - this.field825.method2419(class403.field5563[var21], (byte) -99)) / 2 + arg8, arg7, arg10);
            } else if (arg6 == 2) {
                this.method492(121, var19, arg11, arg13, class403.field5563[var21], arg14, arg8 + arg15 - this.field825.method2419(class403.field5563[var21], (byte) -121), arg7, arg10);
            } else if ((var18 - 1) == var21) {
                this.method492(119, var19, arg11, arg13, class403.field5563[var21], arg14, arg8, arg7, arg10);
            } else {
                this.method489(-128, arg15, class403.field5563[var21]);
                this.method492(127, var19, arg11, arg13, class403.field5563[var21], arg14, arg8, arg7, arg10);
                class34.field466 = 0;
            }
            var19 += arg4;
        }
        return var18;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILjava/lang/String;I[I[I[II[Lwn;)V", line = 360)
    private final void method491(int arg0, String arg1, int arg2, int[] arg3, int[] arg4, int[] arg5, int arg6, class77[] arg7) {
        if (arg2 != 8464) {
            return;
        }
        field816++;
        int var9 = arg6 - this.field825.field5407;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg1.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class311.method1888((byte) 70, arg1.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg1.substring(var10 + 1, var14);
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
                                    if (arg4 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg4[var12];
                                    }
                                    int var18;
                                    if (arg3 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg3[var12];
                                    }
                                    var12++;
                                    int var19 = class388.method2418(111, var16.substring(4));
                                    class77 var20 = arg7[var19];
                                    int var21 = arg5 == null ? var20.method619() : arg5[var19];
                                    var20.method617(arg0 + var17, -var21 + var18 + var9 + this.field825.field5407, 0, 0, 1);
                                    arg0 += arg7[var19].method632();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method500(var16, arg2 ^ 0x2112);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg0 += this.field825.method2427(0, var15, var11);
                    }
                    int var22;
                    if (arg4 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg4[var12];
                    }
                    int var23;
                    if (arg3 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg3[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class48.field619 & 0xFF000000) != 0) {
                            this.method374(var15, arg0 + var22 + 1, var9 + 1 - -var23, class48.field619, true);
                        }
                        this.method374(var15, arg0 + var22, var9 + var23, class424.field5913, false);
                    } else if (class34.field466 > 0) {
                        class217.field3056 += class34.field466;
                        arg0 += class217.field3056 >> 8;
                        class217.field3056 &= 0xFF;
                    }
                    int var24 = this.field825.method2428(var15, (byte) 70);
                    if (class316.field4298 != -1) {
                        this.field830.method459(var24, (int) ((double) this.field825.field5407 * 0.7D) + var9, class316.field4298, arg0, true);
                    }
                    if (class268.field3673 != -1) {
                        this.field830.method459(var24, this.field825.field5407 + var9, class268.field3673, arg0, true);
                    }
                    arg0 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II[Lwn;ILjava/lang/String;II[ILde;)V", line = 522)
    private final void method492(int arg0, int arg1, class77[] arg2, int arg3, String arg4, int arg5, int arg6, int[] arg7, class165 arg8) {
        field829++;
        if (arg0 <= 109) {
            this.field825 = null;
        }
        int var10 = arg1 - this.field825.field5407;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg4.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class311.method1888((byte) 70, arg4.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg4.substring(var11 + 1, var14);
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
                                    int var17 = class388.method2418(105, var16.substring(4));
                                    class77 var18 = arg2[var17];
                                    int var19 = arg7 == null ? var18.method619() : arg7[var17];
                                    if ((class424.field5913 & 0xFF000000) == -16777216) {
                                        var18.method617(arg6, var10 + this.field825.field5407 - var19, 0, 0, 1);
                                    } else {
                                        var18.method617(arg6, this.field825.field5407 + var10 - var19, 1, class424.field5913 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg6 += arg2[var17].method632();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method500(var16, 2);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg6 += this.field825.method2427(0, var15, var12);
                    }
                    if (var15 == ' ') {
                        if (class34.field466 > 0) {
                            class217.field3056 += class34.field466;
                            arg6 += class217.field3056 >> 8;
                            class217.field3056 &= 0xFF;
                        }
                    } else if (arg8 == null) {
                        if ((class48.field619 & 0xFF000000) != 0) {
                            this.method374(var15, arg6 + 1, var10 + 1, class48.field619, true);
                        }
                        this.method374(var15, arg6, var10, class424.field5913, false);
                    } else {
                        if ((class48.field619 & 0xFF000000) != 0) {
                            this.method373(var15, arg6 + 1, var10 + 1, class48.field619, true, arg8, arg5, arg3);
                        }
                        this.method373(var15, arg6, var10, class424.field5913, false, arg8, arg5, arg3);
                    }
                    int var20 = this.field825.method2428(var15, (byte) 117);
                    if (class316.field4298 != -1) {
                        this.field830.method459(var20, var10 + ((int) ((double) this.field825.field5407 * 0.7D)), class316.field4298, arg6, true);
                    }
                    if (class268.field3673 != -1) {
                        this.field830.method459(var20, this.field825.field5407 + var10 + 1, class268.field3673, arg6, true);
                    }
                    arg6 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILjava/lang/String;IIIII)V", line = 672)
    public final void method493(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field824++;
        if (arg1 == null) {
            return;
        }
        this.method483(arg2 ^ 0xFFFFFFA4, arg3, arg4);
        int var8 = arg1.length();
        int[] var9 = new int[var8];
        for (int var10 = arg2; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method491(arg6 - this.field825.method2419(arg1, (byte) -116) / 2, arg1, 8464, var9, (int[]) null, (int[]) null, arg0, (class77[]) null);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Lms;", line = 698)
    public static final class450 method494(int arg0, int arg1) {
        field823++;
        class399[] var2 = class30.field417;
        synchronized (class30.field417) {
            if (arg0 >= -26) {
                method494(18, -24);
            }
            class450 var3;
            if (arg1 >= class30.field417.length || class30.field417[arg1].method2472((byte) 98)) {
                var3 = new class450();
                var3.field6451 = new class153[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field6451[var4] = new class153();
                }
            } else {
                var3 = (class450) class30.field417[arg1].method2478((byte) -101);
                var3.method2695(0);
                int var10002 = class185.field2625[arg1]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(ILjava/lang/String;IIII)V", line = 733)
    public final void method495(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field817++;
        if (arg1 == null) {
            return;
        }
        this.method483(-89, arg3, arg5);
        if (arg4 != 350) {
            this.field830 = null;
        }
        this.method492(arg4 ^ 0x128, arg0, (class77[]) null, 0, arg1, 0, arg2 - this.field825.method2419(arg1, (byte) -123), (int[]) null, (class165) null);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILea;)V", line = 749)
    public static final void method496(int arg0, class58 arg1) {
        arg1.method227(0, 0, class373.field5174, 350);
        field827++;
        arg1.method245(0, 0, class373.field5174, 350, class213.field2983 << 24 | 0x332277, 1);
        if (arg0 > -73) {
            return;
        }
        for (int var2 = 0; var2 < 100; var2++) {
            int var13 = class88.field1250[var2];
            int var14 = class334.field4532[var2];
            arg1.method245(var13, var14, 2, 2, class359.field4975[var2] << 24 | 0xFFFFFF, 1);
        }
        int var3 = 350 / class118.field1799;
        if (class395.field5486 > 0) {
            int var4 = 342 - class118.field1799;
            int var5 = var3 * var4 / (class395.field5486 + var3 - 1);
            int var6 = 4;
            if (class395.field5486 > 1) {
                var6 += (class395.field5486 - class210.field2937 - 1) * (var4 - var5) / (class395.field5486 - 1);
            }
            arg1.method245(class373.field5174 - 16, var6, 12, var5, class213.field2983 << 24 | 0x332277, 2);
            for (int var7 = class210.field2937; var7 < class210.field2937 + var3 && class395.field5486 > var7; var7++) {
                String[] var8 = class6.method27((byte) 112, class178.field2543[var7], '\b');
                int var9 = (class373.field5174 - 8 - 16) / var8.length;
                for (int var10 = 0; var10 < var8.length; var10++) {
                    int var11 = var9 * var10 + 8;
                    arg1.method227(var11, 0, var9 + var11 - 8, 350);
                    class31.field432.method486(var11, -1, (byte) 44, 350 - class82.field1135 - class387.field5363.field5419 - ((var7 - class210.field2937) * class118.field1799) - 2, -16777216, var8[var10]);
                }
            }
        }
        arg1.method227(0, 0, class373.field5174, 350);
        arg1.method459(class373.field5174, 350 - class82.field1135, -1, 0, true);
        class269.field3685.method486(10, -1, (byte) 44, 350 - class280.field3810.field5419 - 1, -16777216, "--> " + class80.field1116);
        int var12 = -1;
        if ((class246.field3467 % 30) > 15) {
            var12 = 16777215;
        }
        arg1.method451((byte) -44, var12, class280.field3810.method2419("--> " + class80.field1116.substring(0, class317.field4311), (byte) -124) + 10, 12, 350 - class280.field3810.field5419 - 11);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIBILjava/lang/String;III)V", line = 826)
    public final void method497(int arg0, int arg1, byte arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        field831++;
        if (arg4 == null) {
            return;
        }
        this.method483(-128, arg3, arg0);
        double var9 = 7.0D - ((double) arg7 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        if (arg2 != 120) {
            this.field830 = null;
        }
        int var11 = arg4.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg5) * var9);
        }
        this.method491(arg6 - (this.field825.method2419(arg4, (byte) -122) / 2), arg4, 8464, var12, (int[]) null, (int[]) null, arg1, (class77[]) null);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIIIII)V", line = 862)
    public static final void method498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field832++;
        if (class387.method2400(arg2, 176)) {
            class133.method993(arg1, arg4, arg3, arg8, -1, arg6, arg0, 0, class103.field1425[arg2], arg7);
            if (arg5 != -10289) {
                field834 = -23;
            }
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class363.field4998[var9] = true;
            }
        } else {
            class363.field4998[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIZZ)V", line = 892)
    public static final void method499(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        class284.field3862 = arg1;
        class354.field4768 = arg2;
        class244.field3440 = arg3;
        class255.field3554 = new class63[arg0][class284.field3862][class354.field4768];
        class82.field1130 = new class323[arg0];
        if (arg4) {
            class304.field4147 = new class63[1][class284.field3862][class354.field4768];
            class124.field1876 = new int[class284.field3862][class354.field4768];
            class125.field1879 = new class323[1];
        } else {
            class304.field4147 = null;
            class124.field1876 = null;
            class125.field1879 = null;
        }
        if (arg5) {
            class296.field4069 = new int[arg0][arg1][arg2];
            class122.field1838 = new class271[255];
            class356.field4782 = new boolean[255];
            class406.field5615 = 0;
        } else {
            class296.field4069 = null;
            class122.field1838 = null;
            class356.field4782 = null;
            class406.field5615 = 0;
        }
        class171.method1227(false);
        class150.field2178 = new class186[500];
        class249.field3494 = 0;
        class273.field3723 = new class186[500];
        class447.field6344 = 0;
        class134.field1997 = new int[arg0][class284.field3862 + 1][class354.field4768 + 1];
        class419.field5818 = new class5[5000];
        class340.field4602 = 0;
        class6.field62 = new boolean[class244.field3440 + class244.field3440 + 1][class244.field3440 + class244.field3440 + 1];
        class450.field6457 = new boolean[class244.field3440 + class244.field3440 + 2][class244.field3440 + class244.field3440 + 2];
        class316.field4283 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 941)
    private final void method500(String arg0, int arg1) {
        field819++;
        if (arg1 != 2) {
            field834 = -106;
        }
        try {
            if (arg0.startsWith("col=")) {
                class424.field5913 = class424.field5913 & 0xFF000000 | class174.method1235((byte) 100, arg0.substring(4), 16) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class424.field5913 = class424.field5913 & 0xFF000000 | class339.field4580 & 0xFFFFFF;
            }
            if (arg0.startsWith("argb=")) {
                class424.field5913 = class174.method1235((byte) 100, arg0.substring(5), 16);
            } else if (arg0.equals("/argb")) {
                class424.field5913 = class339.field4580;
            } else if (arg0.startsWith("str=")) {
                class316.field4298 = class174.method1235((byte) 100, arg0.substring(4), 16) | 0xFF000000;
            } else if (arg0.equals("str")) {
                class316.field4298 = -8388608;
            } else if (arg0.equals("/str")) {
                class316.field4298 = -1;
            } else if (arg0.startsWith("u=")) {
                class268.field3673 = class174.method1235((byte) 100, arg0.substring(2), 16) | 0xFF000000;
            } else if (arg0.equals("u")) {
                class268.field3673 = -16777216;
            } else if (arg0.equals("/u")) {
                class268.field3673 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class48.field619 = 0;
            } else if (arg0.startsWith("shad=")) {
                class48.field619 = class174.method1235((byte) 100, arg0.substring(5), 16) | 0xFF000000;
            } else if (arg0.equals("shad")) {
                class48.field619 = -16777216;
            } else if (arg0.equals("/shad")) {
                class48.field619 = class304.field4143;
                return;
            } else if (arg0.equals("br")) {
                this.method483(arg1 - 84, class304.field4143, class339.field4580);
                return;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lea;Lci;)V", line = 1028)
    public class61(class58 arg0, class389 arg1) {
        this.field830 = arg0;
        this.field825 = arg1;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(CIIIZLde;II)V")
    public abstract void method373(char arg0, int arg1, int arg2, int arg3, boolean arg4, class165 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(CIIIZ)V")
    public abstract void method374(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
