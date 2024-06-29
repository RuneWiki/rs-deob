import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class433 {

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    private int field6415 = -1;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "Z")
    private boolean field6431 = false;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    private int field6439 = -32768;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    private int field6441 = -1;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "Z")
    private boolean field6436 = false;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public int field6429;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    private int field6420;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public int field6432;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "B")
    private byte field6424;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "B")
    private byte field6443;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    private int field6412;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public int field6421;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "Z")
    private boolean field6417;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field6411 = 0;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "[I")
    public static int[] field6426 = new int[32];

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Lrp;")
    public static class455 field6416 = new class455(8192);

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    private int field6418;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    private int field6425;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    private int field6427;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    private int field6433;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public static int field6446;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "Lli;")
    public class134 field6448;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "Lc;")
    private class201 field6437;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "Lj;")
    private class229 field6445;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "Ltq;")
    private class270 field6447;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "[Lwr;")
    public static class60[] field6419;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "[Z")
    private boolean[] field6438;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZIILqa;ZLc;)V")
    public final void method2589(int arg0, int arg1, boolean arg2, int arg3, int arg4, class496 arg5, boolean arg6, class201 arg7) {
        if (!arg6) {
            return;
        }
        field6423++;
        class525[] var9 = arg7.method296();
        class439[] var10 = arg7.method283();
        if ((this.field6448 == null || this.field6448.field1932) && (var9 != null || var10 != null)) {
            class130 var11 = class56.field755.method2031(-78, this.field6429);
            if (var11.field1823 != null) {
                var11 = var11.method832((byte) -127, class36.field583);
            }
            if (var11 != null) {
                this.field6448 = new class134(class405.field6116);
            }
        }
        if (this.field6448 == null) {
            return;
        }
        if (arg2) {
            this.field6448.method869(arg5, (long) class405.field6116, var9, var10, false);
        } else {
            this.field6448.method874((long) class405.field6116);
        }
        this.field6448.method862(this.field6424, arg3, arg1, arg0, arg4);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZILqa;ZIII)Lc;")
    public final class201 method2590(boolean arg0, int arg1, class496 arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field6422++;
        class130 var8 = class56.field755.method2031(120, this.field6429);
        if (var8.field1823 != null) {
            var8 = var8.method832((byte) -121, class36.field583);
        }
        if (var8 == null) {
            this.method2599((byte) 86, arg2);
            this.field6415 = this.field6418;
            this.field6441 = -1;
            return null;
        }
        if (!this.field6436 && this.field6441 != var8.field1826) {
            this.field6437 = null;
            this.method2592(-1, arg1 ^ 0x6D);
        }
        this.method2597((byte) -58, arg4, arg6);
        boolean var9 = arg0 & this.field6417 & class96.field1399.method2170(class441.field6563, true) != 0;
        boolean var10 = var9 & (this.field6441 != var8.field1826 || (this.field6418 != this.field6415 || this.field6447 != null && (this.field6447.field3751 || class58.field786) && this.field6433 != this.field6418) && class96.field1399.method2170(class441.field6563, true) >= 2);
        if (arg3 && !var10) {
            this.field6441 = var8.field1826;
            this.field6415 = this.field6418;
            return null;
        }
        if (var10) {
            class220.method1489(this.field6445, this.field6443, this.field6412, this.field6420, this.field6438);
        }
        if (arg1 != 10) {
            return null;
        }
        class206 var11 = class455.field6683[this.field6443];
        class206 var12;
        if (this.field6431) {
            var12 = class204.field2871[0];
        } else {
            var12 = this.field6443 >= 3 ? null : class455.field6683[this.field6443 + 1];
        }
        class201 var13 = null;
        if (this.field6447 != null) {
            if (var10) {
                arg5 |= 0x40000;
            }
            var13 = var8.method826(this.field6418, this.field6433, this.field6447, this.field6432 == 11 ? 10 : this.field6432, 35, arg5, this.field6420, this.field6432 == 11 ? this.field6421 + 4 : this.field6421, this.field6412, var11.method853(this.field6412, this.field6420), arg2, this.field6427, var11, var12);
            if (var13 == null) {
                this.field6445 = null;
                this.field6438 = null;
                this.field6439 = 0;
            } else {
                if (var10) {
                    if (this.field6438 == null) {
                        this.field6438 = new boolean[4];
                    }
                    this.field6445 = var13.method285(this.field6445);
                    class457.method2753(this.field6445, this.field6443, arg6, arg4, this.field6438);
                }
                this.field6439 = var13.method306();
            }
            this.field6437 = null;
        } else if (this.field6437 != null && (arg5 & this.field6437.method279()) == arg5 && this.field6441 == var8.field1826) {
            var13 = this.field6437;
        } else {
            if (this.field6437 != null) {
                arg5 |= this.field6437.method279();
            }
            class454 var14 = var8.method831(arg1 - 7, arg5, this.field6432 == 11 ? 10 : this.field6432, this.field6412, this.field6420, this.field6432 == 11 ? this.field6421 + 4 : this.field6421, var11, var12, var10, arg2, var11.method853(this.field6412, this.field6420));
            if (var14 == null) {
                this.field6439 = 0;
                this.field6438 = null;
                this.field6437 = null;
                this.field6445 = null;
            } else {
                var13 = var14.field6670;
                this.field6437 = var14.field6670;
                if (var10) {
                    this.field6438 = null;
                    this.field6445 = var14.field6667;
                    class457.method2753(this.field6445, this.field6443, arg6, arg4, null);
                }
                this.field6439 = var13.method306();
            }
        }
        this.field6415 = this.field6418;
        this.field6441 = var8.field1826;
        this.field6412 = arg6;
        this.field6420 = arg4;
        return var13;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V")
    public static final void method2591(int arg0, int arg1, int arg2) {
        field6434++;
        class20 var3 = class98.field1415[arg0][arg1];
        if (var3 != null) {
            class154.field2250 = var3.field313;
            class377.field5752 = var3.field311;
            class17.field276 = var3.field305;
        }
        class421.method2534(27699);
        if (arg2 != 0) {
            field6416 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
    private final void method2592(int arg0, int arg1) {
        field6413++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg1 <= 10) {
            this.field6431 = true;
        }
        if (arg0 == -1) {
            class130 var5 = class56.field755.method2031(-93, this.field6429);
            class130 var6 = var5;
            if (var5.field1823 != null) {
                var5 = var5.method832((byte) -122, class36.field583);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field1860 != null) {
                if (this.field6447 != null && var5.method824((byte) -31, this.field6447.field3757)) {
                    return;
                }
                var3 = var5.method829((byte) 15);
                if (this.field6441 != var5.field1826) {
                    var4 = var5.field1854;
                }
            } else if (var5.field1848 == -1) {
                if (var6 != null && var6.field1860 != null) {
                    if (this.field6447 != null && var6.method824((byte) 25, this.field6447.field3757)) {
                        return;
                    }
                    var3 = var6.method829((byte) -93);
                    if (this.field6441 != var6.field1826) {
                        var4 = var6.field1854;
                    }
                } else if (var6 != null && var6.field1848 != -1 && this.field6441 != var6.field1826) {
                    var3 = var6.field1848;
                    var4 = var6.field1854;
                }
            } else if (this.field6441 != var5.field1826) {
                var4 = var5.field1854;
                var3 = var5.field1848;
            }
        }
        if (var3 == -1) {
            this.field6447 = null;
            return;
        }
        this.field6437 = null;
        if (this.field6447 == null || this.field6447.field3757 != var3) {
            this.field6447 = class260.field3621.method1934(116, var3);
        } else if (this.field6447.field3735 == 0) {
            return;
        }
        if (this.field6447.field3765 == null) {
            this.field6447 = null;
            return;
        }
        if (var4) {
            this.field6418 = (int) ((double) this.field6447.field3765.length * Math.random());
            this.field6427 = (int) ((double) this.field6447.field3746[this.field6418] * Math.random()) + 1;
        } else {
            this.field6427 = 1;
            this.field6418 = 0;
        }
        this.field6433 = this.field6418 + 1;
        if (this.field6433 < 0 || this.field6433 >= this.field6447.field3765.length) {
            this.field6433 = -1;
        }
        this.field6425 = class405.field6116 - this.field6427;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)Z")
    public final boolean method2593(int arg0) {
        field6446++;
        if (arg0 != 10) {
            this.method2590(true, 94, null, true, -41, -48, 40);
        }
        return this.field6417;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIZJ)Ljava/lang/String;")
    public static final String method2594(int arg0, int arg1, int arg2, boolean arg3, long arg4) {
        field6428++;
        char var6 = ',';
        char var7 = '.';
        if (arg0 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg0 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if ((long) arg1 > arg4) {
            arg4 = -arg4;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg2 > 0) {
            for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = (int) arg4;
                arg4 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg4 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg4;
            arg4 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg4 * 10)));
            if (arg4 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg3) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public static void method2595(byte arg0) {
        field6419 = null;
        if (arg0 < 104) {
            method2595((byte) 83);
        }
        field6426 = null;
        field6416 = null;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)V")
    public final void method2596(int arg0, int arg1) {
        field6442++;
        this.field6436 = true;
        if (arg1 != -1) {
            field6411 = 74;
        }
        this.method2592(arg0, 53);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BII)V")
    private final void method2597(byte arg0, int arg1, int arg2) {
        if (arg0 != -58) {
            return;
        }
        field6444++;
        label92: while (true) {
            if (this.field6447 == null) {
                if (this.field6436) {
                    return;
                }
                this.method2592(-1, 101);
                if (this.field6447 == null) {
                    return;
                }
            }
            int var4 = class405.field6116 - this.field6425;
            if (var4 > 100 && this.field6447.field3737 > 0) {
                int var5 = this.field6447.field3765.length - this.field6447.field3737;
                while (this.field6418 < var5 && this.field6447.field3746[this.field6418] < var4) {
                    var4 -= this.field6447.field3746[this.field6418];
                    this.field6418++;
                }
                if (var5 <= this.field6418) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field6447.field3765.length; var7++) {
                        var6 += this.field6447.field3746[var7];
                    }
                    var4 %= var6;
                }
                this.field6433 = this.field6418 + 1;
                if (this.field6447.field3765.length <= this.field6433) {
                    this.field6433 -= this.field6447.field3737;
                    if (this.field6433 < 0 || this.field6433 >= this.field6447.field3765.length) {
                        this.field6433 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field6447.field3746[this.field6418]) {
                            this.field6425 = class405.field6116 - var4;
                            this.field6427 = var4;
                            return;
                        }
                        class445.method2678(false, this.field6418, this.field6424, this.field6447, arg2, (byte) -116, arg1);
                        var4 -= this.field6447.field3746[this.field6418];
                        this.field6418++;
                        if (this.field6418 >= this.field6447.field3765.length) {
                            this.field6418 -= this.field6447.field3737;
                            if (this.field6418 < 0 || this.field6418 >= this.field6447.field3765.length) {
                                this.field6447 = null;
                                continue label92;
                            }
                        }
                        this.field6433 = this.field6418 + 1;
                    } while (this.field6433 < this.field6447.field3765.length);
                    this.field6433 -= this.field6447.field3737;
                } while (this.field6433 >= 0 && this.field6433 < this.field6447.field3765.length);
                this.field6433 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILqa;)V")
    public final void method2598(int arg0, class496 arg1) {
        this.method2590(true, 10, arg1, true, this.field6420, 262144, this.field6412);
        field6435++;
        if (arg0 <= 2) {
            this.method2590(false, 53, null, true, 109, 117, -100);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLqa;)V")
    public final void method2599(byte arg0, class496 arg1) {
        if (this.field6445 != null) {
            class220.method1489(this.field6445, this.field6443, this.field6412, this.field6420, this.field6438);
            this.field6438 = null;
            this.field6445 = null;
        }
        field6414++;
        if (arg0 != 86) {
            this.field6412 = 35;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
    public static final void method2600(int arg0) {
        if (arg0 != -1) {
            field6426 = null;
        }
        field6430++;
        class15.field250.method1015((byte) 86);
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)I")
    public final int method2601(int arg0) {
        if (arg0 > -6) {
            method2600(103);
        }
        field6440++;
        return this.field6439;
    }

    @OriginalMember(owner = "client!pd", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field6448 != null) {
            this.field6448.method872();
        }
        field6410++;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lqa;Leu;IIIIIIZI)V")
    public class433(class496 arg0, class130 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field6429 = arg1.field1826;
        this.field6420 = arg7;
        this.field6432 = arg2;
        this.field6424 = (byte) arg4;
        this.field6443 = (byte) arg5;
        this.field6412 = arg6;
        this.field6421 = arg3;
        this.field6431 = arg8;
        this.field6417 = arg0.method1145() && arg1.field1884 && !this.field6431;
        if (arg9 != -1) {
            this.field6436 = true;
        }
        this.method2592(arg9, 122);
    }
}
