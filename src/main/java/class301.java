import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class301 extends class132 {

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "I")
    private int field4457 = -32768;

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "Ltj;")
    private class258 field4449 = null;

    @OriginalMember(owner = "client!bj", name = "P", descriptor = "I")
    private int field4462 = -1;

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "I")
    private int field4460 = 0;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
    private int field4446 = -1;

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "I")
    private int field4454 = 0;

    @OriginalMember(owner = "client!bj", name = "U", descriptor = "Z")
    private boolean field4467 = false;

    @OriginalMember(owner = "client!bj", name = "bb", descriptor = "I")
    private int field4474 = 0;

    @OriginalMember(owner = "client!bj", name = "X", descriptor = "Z")
    private boolean field4470 = true;

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "I")
    private int field4458;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "I")
    private int field4456;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    private int field4440;

    @OriginalMember(owner = "client!bj", name = "cb", descriptor = "I")
    private int field4475;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
    private int field4443;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    private int field4438;

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "Lom;")
    private class125 field4453;

    @OriginalMember(owner = "client!bj", name = "S", descriptor = "I")
    private int field4465;

    @OriginalMember(owner = "client!bj", name = "ab", descriptor = "I")
    private int field4473;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    private int field4439;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "I")
    private int field4445;

    @OriginalMember(owner = "client!bj", name = "R", descriptor = "Z")
    public static boolean field4464 = true;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4444 = "flash2:";

    @OriginalMember(owner = "client!bj", name = "T", descriptor = "Z")
    public static boolean field4466 = false;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!bj", name = "E", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!bj", name = "O", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!bj", name = "Q", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!bj", name = "V", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!bj", name = "W", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!bj", name = "Y", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!bj", name = "Z", descriptor = "Lsa;")
    private class265 field4472;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "[I")
    public static int[] field4441;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "[I")
    public static int[] field4447;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(III)V", line = 6)
    private final void method2044(int arg0, int arg1, int arg2) {
        field4448++;
        if (this.field4453 != null) {
            int var4 = class329.field4966 - this.field4439;
            if (var4 > 100 && this.field4453.field1687 > 0) {
                int var5 = this.field4453.field1707.length - this.field4453.field1687;
                while (var5 > this.field4465 && var4 > this.field4453.field1706[this.field4465]) {
                    var4 -= this.field4453.field1706[this.field4465];
                    this.field4465++;
                }
                if (this.field4465 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field4453.field1707.length; var7++) {
                        var6 += this.field4453.field1706[var7];
                    }
                    var4 %= var6;
                }
                this.field4473 = this.field4465 + 1;
                if (this.field4453.field1707.length <= this.field4473) {
                    this.field4473 -= this.field4453.field1687;
                    if (this.field4473 < 0 || this.field4453.field1707.length <= this.field4473) {
                        this.field4473 = -1;
                    }
                }
            }
            while (this.field4453.field1706[this.field4465] < var4) {
                class241.method1651(this.field4465, false, arg1, this.field4453, arg0, -76);
                var4 -= this.field4453.field1706[this.field4465];
                this.field4465++;
                if (this.field4453.field1707.length <= this.field4465) {
                    this.field4465 -= this.field4453.field1687;
                    if (this.field4465 < 0 || this.field4453.field1707.length <= this.field4465) {
                        this.field4453 = null;
                        break;
                    }
                }
                this.field4473 = this.field4465 + 1;
                if (this.field4473 >= this.field4453.field1707.length) {
                    this.field4473 -= this.field4453.field1687;
                    if (this.field4473 < 0 || this.field4473 >= this.field4453.field1707.length) {
                        this.field4473 = -1;
                    }
                }
            }
            this.field4439 = class329.field4966 - var4;
            this.field4445 = var4;
        }
        if (arg2 != 770) {
            this.field4470 = true;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V", line = 95)
    public static void method2045(byte arg0) {
        field4441 = null;
        if (arg0 > -74) {
            field4447 = (int[]) null;
        }
        field4447 = null;
        field4444 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([Lkn;ILkm;)V", line = 108)
    public static final void method2046(class178[] arg0, int arg1, class133 arg2) {
        class217.field3110 = arg2;
        field4442++;
        class78.field1125 = arg0;
        class36.field418 = new boolean[class78.field1125.length];
        class122.field1656.method118((byte) -66);
        int var3 = class217.field3110.method964(19, "details");
        int[] var4 = class217.field3110.method954(0, var3);
        for (int var5 = 0; var5 < var4.length; var5++) {
            class122.field1656.method120((long) var4[var5], class236.method1622(new class316(class217.field3110.method955(var3, var4[var5], -21853)), -29136, var4[var5]), -22851);
        }
        int var6 = 0 / ((arg1 - 26) / 48);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIIIIJILsa;)V", line = 137)
    public final void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class265 arg10) {
        field4452++;
        class132 var13 = this.method2048(false);
        if (var13 != null) {
            var13.method108(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4472);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIII)V", line = 154)
    public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class67.field908) {
            this.method2047(12954, true);
        } else {
            this.method2044(arg4, arg3, 770);
        }
        field4461++;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZ)Ldn;", line = 177)
    private final class132 method2047(int arg0, boolean arg1) {
        field4450++;
        boolean var3 = class333.field5020 != class269.field3994;
        class302 var4 = class153.method1106(this.field4443, (byte) -112);
        int var5 = var4.field4550;
        if (var4.field4519 != null) {
            var4 = var4.method2066((byte) -84);
        }
        if (var4 == null) {
            if (class67.field908 && !var3) {
                this.method2050(0);
            }
            return null;
        }
        if (class39.field448 != 0 && this.field4467 && (this.field4453 == null || this.field4453 != null && this.field4453.field1686 != var4.field4550)) {
            int var6 = var4.field4550;
            if (var4.field4550 == -1) {
                var6 = var5;
            }
            if (var6 == -1) {
                this.field4453 = null;
            } else {
                this.field4453 = class52.method361(true, var6);
            }
            if (this.field4453 != null) {
                if (var4.field4508 && this.field4453.field1687 != -1) {
                    this.field4465 = (int) ((double) this.field4453.field1707.length * Math.random());
                    this.field4439 -= (int) ((double) this.field4453.field1706[this.field4465] * Math.random());
                } else {
                    this.field4439 = class329.field4966 - 1;
                    this.field4465 = 0;
                }
            }
        }
        int var7 = this.field4475 & 0x3;
        int var8;
        int var9;
        if (var7 == 1 || var7 == 3) {
            var8 = var4.field4520;
            var9 = var4.field4479;
        } else {
            var8 = var4.field4479;
            var9 = var4.field4520;
        }
        if (arg0 != 12954) {
            return (class132) null;
        }
        int var10 = (var9 + 1 >> 1) + this.field4440;
        int var11 = (var8 >> 1) + this.field4438;
        int var12 = this.field4440 + (var9 >> 1);
        int var13 = this.field4438 + (var8 + 1 >> 1);
        this.method2044(var11 * 128, var12 * 128, 770);
        boolean var14 = !var3 && var4.field4507 && (this.field4446 != var4.field4549 || (this.field4465 != this.field4462 || this.field4453 != null && (this.field4453.field1702 || class101.field1396) && this.field4473 != this.field4465) && class216.field3091 >= 2);
        if (arg1 && !var14) {
            return null;
        }
        int[][] var15 = class333.field5020[this.field4456];
        int var16 = var15[var10][var11] + var15[var12][var11] + var15[var12][var13] + var15[var10][var13] >> 2;
        int var17 = (this.field4440 << 7) + (var9 << 6);
        int[][] var18 = (int[][]) null;
        if (var3) {
            var18 = class269.field3994[0];
        } else if (this.field4456 < 3) {
            var18 = class333.field5020[this.field4456 + 1];
        }
        int var19 = (this.field4438 << 7) + (var8 << 6);
        if (class67.field908 && var14) {
            class322.method2252(this.field4449, this.field4460, this.field4474, this.field4454);
        }
        boolean var20 = this.field4449 == null;
        class44 var21;
        if (this.field4453 == null) {
            var21 = var4.method2054((byte) 1, var17, var18, var15, var14, var16, false, var20 ? class332.field4993 : this.field4449, var19, this.field4458, this.field4475);
        } else {
            var21 = var4.method2069(this.field4453, var17, this.field4465, var19, this.field4445, var15, var20 ? class332.field4993 : this.field4449, var18, this.field4475, this.field4458, var14, this.field4473, var16, -512380438);
        }
        if (var21 == null) {
            return null;
        }
        if (class67.field908 && var14) {
            if (var20) {
                class332.field4993 = var21.field532;
            }
            int var22 = 0;
            if (this.field4456 != 0) {
                int[][] var23 = class333.field5020[0];
                var22 = var16 - (var23[var10][var11] + var23[var10][var13] + var23[var12][var11] + var23[var12][var13] >> 2);
            }
            class258 var24 = var21.field532;
            if (this.field4470 && class322.method2254(var24, var17, var22, var19)) {
                this.field4470 = false;
            }
            if (!this.field4470) {
                class322.method2257(var24, var17, var22, var19);
                this.field4449 = var24;
                this.field4460 = var17;
                this.field4454 = var19;
                if (var20) {
                    class332.field4993 = null;
                }
                this.field4474 = var22;
            }
            this.field4462 = this.field4465;
            this.field4446 = var4.field4549;
        }
        return var21.field531;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)Ldn;", line = 347)
    public final class132 method2048(boolean arg0) {
        if (arg0) {
            this.field4458 = -118;
        }
        field4451++;
        return this.method2047(12954, false);
    }

    @OriginalMember(owner = "client!bj", name = "finalize", descriptor = "()V", line = 369)
    protected final void finalize() {
        field4469++;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(IIIII)V", line = 376)
    public static final void method2049(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 92) {
            method2051(-47, 99, 97, 93, 81, -27, 111, 84, 26, 83, 77, 64, 77, -71, 17, 90, -45, -27, 119, 114);
        }
        field4463++;
        if (class45.field554 == 1) {
            class269.field3997[class213.field3077 / 100].method840(class203.field2907 - 8, class266.field3867 + -8);
        }
        if (class45.field554 == 2) {
            class269.field3997[class213.field3077 / 100 + 4].method840(class203.field2907 - 8, class266.field3867 - 8);
        }
        class129.method927(111);
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(IIIIIIIZLdn;)V", line = 578)
    public class301(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class132 arg8) {
        this.field4458 = arg1;
        this.field4456 = arg3;
        this.field4440 = arg4;
        this.field4475 = arg2;
        this.field4443 = arg0;
        this.field4438 = arg5;
        if (class67.field908 && arg8 != null) {
            if ((arg8 instanceof class301)) {
                ((class301) arg8).method2050(0);
            } else {
                class302 var10 = class153.method1106(this.field4443, (byte) -84);
                if (var10.field4519 != null) {
                    var10 = var10.method2066((byte) -84);
                }
                if (var10 != null) {
                    class338.method2340(this.field4475, this.field4456, true, var10, this.field4438, 0, 0, this.field4458, this.field4440);
                }
            }
        }
        if (arg6 != -1) {
            this.field4453 = class52.method361(true, arg6);
            this.field4465 = 0;
            if (this.field4453.field1707.length <= 1) {
                this.field4473 = 0;
            } else {
                this.field4473 = 1;
            }
            this.field4439 = class329.field4966 - 1;
            this.field4445 = 1;
            if (this.field4453.field1681 == 0 && arg8 != null && arg8 instanceof class301) {
                class301 var11 = (class301) arg8;
                if (this.field4453 == var11.field4453) {
                    this.field4465 = var11.field4465;
                    this.field4473 = var11.field4473;
                    this.field4439 = var11.field4439;
                    this.field4445 = var11.field4445;
                    return;
                }
            }
            if (arg7 && this.field4453.field1687 != -1) {
                this.field4465 = (int) ((double) this.field4453.field1707.length * Math.random());
                this.field4473 = this.field4465 + 1;
                if (this.field4453.field1707.length <= this.field4473) {
                    this.field4473 -= this.field4453.field1687;
                    if (this.field4473 < 0 || this.field4453.field1707.length <= this.field4473) {
                        this.field4473 = -1;
                    }
                }
                this.field4445 = ((int) ((double) this.field4453.field1706[this.field4465] * Math.random())) + 1;
                this.field4439 = class329.field4966 - this.field4445;
            }
        }
        if (class67.field908 && arg8 != null) {
            this.method2047(12954, true);
        }
        if (arg8 == null) {
            class302 var12 = class153.method1106(this.field4443, (byte) -89);
            if (var12.field4519 != null) {
                this.field4467 = true;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V", line = 405)
    public final void method2050(int arg0) {
        if (this.field4449 != null) {
            class322.method2252(this.field4449, this.field4460, this.field4474, this.field4454);
        }
        this.field4449 = null;
        if (arg0 != 0) {
            method2046((class178[]) null, 64, (class133) null);
        }
        this.field4462 = -1;
        this.field4446 = -1;
        field4459++;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 426)
    public static final void method2051(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class149 var20 = new class149(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class142.field1940[var21][arg1][arg2] == null) {
                    class142.field1940[var21][arg1][arg2] = new class202(var21, arg1, arg2);
                }
            }
            class142.field1940[arg0][arg1][arg2].field2886 = var20;
        } else if (arg3 == 1) {
            class149 var22 = new class149(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class142.field1940[var23][arg1][arg2] == null) {
                    class142.field1940[var23][arg1][arg2] = new class202(var23, arg1, arg2);
                }
            }
            class142.field1940[arg0][arg1][arg2].field2886 = var22;
        } else {
            class144 var24 = new class144(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class142.field1940[var25][arg1][arg2] == null) {
                    class142.field1940[var25][arg1][arg2] = new class202(var25, arg1, arg2);
                }
            }
            class142.field1940[arg0][arg1][arg2].field2872 = var24;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "()I", line = 480)
    public final int method105() {
        field4455++;
        return this.field4457;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZBLjava/lang/String;)V", line = 496)
    public static final void method2052(boolean arg0, byte arg1, String arg2) {
        byte var3 = 4;
        field4471++;
        int var4 = var3 + 6;
        int var5 = class312.field4716.method1919(arg2, 250);
        int var6 = var3 + 6;
        int var7 = class312.field4716.method1922(arg2, 250) * 13;
        if (class67.field908) {
            class102.method738(var6 - var3, -var3 + var4, var3 + var5 + var3, var7 - -var3 - -var3, 0);
            class102.method750(var6 - var3, -var3 + var4, var3 + var5 + var3, var7 - -var3 - -var3, 16777215);
        } else {
            class38.method224(var6 - var3, -var3 + var4, var5 + var3 + var3, var3 + var7 + var3, 0);
            class38.method216(var6 - var3, -var3 + var4, var3 + var5 + var3, var3 + var3 + var7, 16777215);
        }
        class312.field4716.method1902(arg2, var6, var4, var5, var7, 16777215, -1, 1, 1, 0);
        class253.method1728(var3 + var5 + var3, var3 + var7 + var3, (byte) 124, var4 - var3, -var3 + var6);
        if (arg1 > -111) {
            method2051(-106, -17, 83, 1, 46, -80, 53, 103, -45, -105, -110, 10, -13, -28, -125, 73, -91, -3, -96, 124);
        }
        if (!arg0) {
            class279.method1934(var4, -54, var7, var6, var5);
        } else if (class67.field908) {
            class67.method490();
        } else {
            try {
                Graphics var8 = class150.field2079.getGraphics();
                class272.field4079.method1109(0, 30364, var8, 0);
            } catch (Exception var10) {
                class150.field2079.repaint();
            }
        }
    }
}
