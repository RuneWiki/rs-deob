import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class245 {

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Z")
    private boolean field3562 = false;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public int field3578 = 0;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    public int field3581 = 0;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "[I")
    public static int[] field3577 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field3574 = 0;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    public static int field3585 = 0;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
    public static int field3589 = 0;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public int field3563;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    private int field3564;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public int field3566;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public int field3570;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public int field3572;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public int field3575;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public int field3576;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public int field3579;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
    public int field3580;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    public int field3584;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "J")
    public long field3588;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Lwf;")
    public static class333 field3568;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lfd;II)V", line = 9)
    private final void method1724(class299 arg0, int arg1, int arg2) {
        field3569++;
        if (arg2 == 1) {
            this.field3564 = arg0.method2083((byte) -102);
        } else if (arg2 == 2) {
            arg0.method2096((byte) -122);
        } else if (arg2 == 3) {
            this.field3570 = arg0.method2062(-25795);
            this.field3575 = arg0.method2062(-25795);
            this.field3563 = arg0.method2062(-25795);
        } else if (arg2 == 4) {
            this.field3566 = arg0.method2096((byte) -122);
            this.field3584 = arg0.method2062(-25795);
        } else if (arg2 == 6) {
            this.field3580 = arg0.method2096((byte) -122);
        } else if (arg2 == 8) {
            this.field3581 = 1;
        } else if (arg2 == 9) {
            this.field3578 = 1;
        } else if (arg2 == 10) {
            this.field3562 = true;
        }
        if (arg1 != 2) {
            this.field3581 = 119;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 73)
    public static void method1725(int arg0) {
        if (arg0 == -20507) {
            field3568 = null;
            field3577 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 87)
    public static final String method1726(long arg0, int arg1) {
        class82.field1055.setTime(new Date(arg0));
        int var3 = class82.field1055.get(7);
        field3582++;
        int var4 = class82.field1055.get(5);
        int var5 = class82.field1055.get(2);
        int var6 = class82.field1055.get(arg1);
        int var7 = class82.field1055.get(11);
        int var8 = class82.field1055.get(12);
        int var9 = class82.field1055.get(13);
        return class93.field1205[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class242.field3509[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V", line = 110)
    public final void method1727(byte arg0) {
        field3571++;
        if (arg0 < 38) {
            this.method1727((byte) -40);
        }
        this.field3579 = class350.field5474[this.field3564];
        this.field3576 = (int) Math.sqrt((double) (this.field3570 * this.field3570 + this.field3563 * this.field3563 + (this.field3575 * this.field3575)));
        if (this.field3584 == 0) {
            this.field3584 = 1;
        }
        if (this.field3566 == 0) {
            this.field3588 = 2147483647L;
        } else if (this.field3566 == 1) {
            this.field3588 = (long) (this.field3576 * 8 / this.field3584);
            this.field3588 *= this.field3588;
        } else if (this.field3566 == 2) {
            this.field3588 = (long) (this.field3576 * 8 / this.field3584);
        }
        if (this.field3562) {
            this.field3576 *= -1;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;", line = 154)
    public static final String method1728(boolean arg0, Throwable arg1) throws IOException {
        field3586++;
        if (arg0) {
            field3573 = -122;
        }
        String var2;
        if ((arg1 instanceof class101)) {
            class101 var3 = (class101) arg1;
            var2 = var3.field1318 + " | ";
            arg1 = var3.field1323;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var11 = var9.indexOf(40);
            int var12 = var9.indexOf(41, var11 + 1);
            String var13;
            if (var11 == -1) {
                var13 = var9;
            } else {
                var13 = var9.substring(0, var11);
            }
            String var14 = var13.trim();
            String var15 = var14.substring(var14.lastIndexOf(32) + 1);
            String var16 = var15.substring(var15.lastIndexOf(9) + 1);
            String var17 = var2 + var16;
            if (var11 != -1 && var12 != -1) {
                int var18 = var9.indexOf(".java:", var11);
                if (var18 >= 0) {
                    var17 = var17 + var9.substring(var18 + 5, var12);
                }
            }
            var2 = var17 + ' ';
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILeg;IIILvg;IIIZIII)Lvg;", line = 236)
    public static final class81 method1729(int arg0, int arg1, class314 arg2, int arg3, int arg4, int arg5, class81 arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11, int arg12, int arg13) {
        long var14 = ((long) arg11 << 32) + ((long) ((arg5 << 24) + (arg12 << 16) + arg4) + ((long) arg0 << 48));
        field3567++;
        class81 var16 = (class81) class318.field4684.method2265(var14, (byte) -95);
        if (var16 == null) {
            byte var17;
            if (arg4 == 1) {
                var17 = 9;
            } else if (arg4 == 2) {
                var17 = 12;
            } else if (arg4 == 3) {
                var17 = 15;
            } else if (arg4 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19 = 3;
            int[][] var20 = new int[var19][var17];
            class197 var21 = new class197(var17 * var19 + 1, var17 * 2 * var19 + -var17, 0);
            int var22 = var21.method1441(0, 0, 0);
            for (int var23 = 0; var23 < var19; var23++) {
                int var24 = var18[var23];
                int var25 = var18[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = class350.field5476[var27] * var24 + arg13 >> 16;
                    int var29 = class350.field5474[var27] * var25 + arg9 >> 16;
                    var20[var23][var26] = var21.method1441(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var19; var30++) {
                int var31 = (var30 * 256 + 128) / var19;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg5 * var31 + arg12 * var32 >> 8);
                short var34 = (short) (((arg0 & 0xFC00) * var31 + (arg11 & 0xFC00) * var32 & 0xFC0000) + ((arg0 & 0x380) * var31 + (arg11 & 0x380) * var32 & 0x38000) + ((arg0 & 0x7F) * var31 + (arg11 & 0x7F) * var32 & 0x7F00) >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var21.method1434(var22, var20[0][(var35 + 1) % var17], var20[0][var35], (byte) 1, var34, var33);
                    } else {
                        var21.method1434(var20[var30 - 1][var35], var20[var30 - 1][(var35 + 1) % var17], var20[var30][(var35 + 1) % var17], (byte) 1, var34, var33);
                        var21.method1434(var20[var30 - 1][var35], var20[var30][(var35 + 1) % var17], var20[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var21.method1439(64, 768, -50, -10, -50);
            class318.field4684.method2257(-128, var16, var14);
        }
        int var36 = arg4 * 64 - 1;
        int var37 = -var36;
        if (arg1 != 2) {
            method1725(2);
        }
        int var38 = var36;
        int var39 = -var36;
        int var40 = var36;
        if (arg10) {
            if (arg3 > 128 && arg3 < 896) {
                var37 -= 128;
            }
            if (arg3 > 1664 || arg3 < 384) {
                var39 -= 128;
            }
            if (arg3 > 1152 && arg3 < 1920) {
                var38 = var36 + 128;
            }
            if (arg3 > 640 && arg3 < 1408) {
                var40 = var36 + 128;
            }
        }
        int var41 = arg6.method588();
        int var42 = arg6.method597();
        int var43 = arg6.method575();
        if (var38 < var42) {
            var42 = var38;
        }
        if (var39 > var43) {
            var43 = var39;
        }
        int var44 = arg6.method600();
        if (var41 < var37) {
            var41 = var37;
        }
        if (var44 > var40) {
            var44 = var40;
        }
        class261 var45 = null;
        if (arg2 != null) {
            int var46 = arg2.field4631[arg7];
            var45 = class270.method1843(var46 >> 16, -1);
            arg7 = var46 & 0xFFFF;
        }
        class81 var47;
        if (var45 == null) {
            var47 = var16.method595(true, true, true);
            var47.method581((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method580((var41 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method595(!var45.method1796((byte) -39, arg7), !var45.method1797(3, arg7), true);
            var47.method581((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method580((var41 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method603(var45, arg7);
        }
        if (arg3 != 0) {
            var47.method571(arg3);
        }
        if (class47.field623) {
            class128 var48 = (class128) var47;
            if (arg8 != class271.method1847(arg9 + var43, true, arg13 + var41, class56.field724) || class271.method1847(arg9 + var44, true, arg13 + var42, class56.field724) != arg8) {
                for (int var49 = 0; var49 < var48.field1716; var49++) {
                    var48.field1710[var49] += class271.method1847(var48.field1699[var49] + arg9, true, var48.field1732[var49] + arg13, class56.field724) - arg8;
                }
                var48.field1701.field5506 = false;
                var48.field1724.field5221 = false;
            }
        } else {
            class332 var50 = (class332) var47;
            if (arg8 != class271.method1847(arg9 + var43, true, arg13 + var41, class56.field724) || arg8 != class271.method1847(arg9 + var44, true, arg13 + var42, class56.field724)) {
                for (int var51 = 0; var51 < var50.field4982; var51++) {
                    var50.field4964[var51] += class271.method1847(var50.field4953[var51] + arg9, true, var50.field4973[var51] + arg13, class56.field724) - arg8;
                }
                var50.field4944 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lfd;B)V", line = 480)
    public final void method1730(class299 arg0, byte arg1) {
        if (arg1 < 38) {
            method1725(-66);
        }
        while (true) {
            int var3 = arg0.method2096((byte) -122);
            if (var3 == 0) {
                field3583++;
                return;
            }
            this.method1724(arg0, 2, var3);
        }
    }
}
