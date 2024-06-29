import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class431 extends class227 {

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "I")
    private int field6265 = 1024;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
    private int field6261 = 2048;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "I")
    private int field6267 = 3072;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
    public static int field6268 = 0;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "Ljk;")
    public static class450 field6266;

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    public class431() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIILch;)V")
    public static final void method2645(int arg0, int arg1, int arg2, int arg3, int arg4, class325 arg5) {
        ++field6264;
        if (arg2 > -119) {
            method2648(111, 49, -99, -127, 93);
        }
        if (~arg5.field4320 != 0 || arg5.field4329 != null) {
            int var6 = 0;
            if (~arg0 >= ~arg5.field4308) {
                if (arg5.field4313 > arg0) {
                    var6 += -arg0 + arg5.field4313;
                }
            } else {
                var6 += -arg5.field4308 + arg0;
            }
            int var7 = class319.field4256.field4650 * arg5.field4311 >> 8;
            if (~arg1 >= ~arg5.field4327) {
                if (~arg5.field4309 < ~arg1) {
                    var6 += -arg1 + arg5.field4309;
                }
            } else {
                var6 += -arg5.field4327 + arg1;
            }
            if (arg5.field4310 != 0 && ~arg5.field4310 <= ~(var6 - 64) && class319.field4256.field4650 != 0 && arg5.field4317 == arg3) {
                var6 -= 64;
                if (~var6 > -1) {
                    var6 = 0;
                }
                int var8 = (-var6 + arg5.field4310) * var7 / arg5.field4310;
                if (arg5.field4314 == null) {
                    if (arg5.field4320 >= 0) {
                        class25 var9 = class25.method159(class273.field3641, arg5.field4320, 0);
                        if (var9 != null) {
                            class77 var10 = var9.method156().method444(class266.field3571);
                            class224 var11 = class224.method1430(var10, 100, var8);
                            var11.method1407(-1);
                            class465.field6928.method1110(var11);
                            arg5.field4314 = var11;
                        }
                    }
                } else {
                    arg5.field4314.method1436(var8);
                }
                if (arg5.field4324 == null) {
                    if (arg5.field4329 != null && (arg5.field4319 -= arg4) <= 0) {
                        int var12 = (int) (Math.random() * (double) arg5.field4329.length);
                        class25 var13 = class25.method159(class273.field3641, arg5.field4329[var12], 0);
                        if (var13 != null) {
                            class77 var14 = var13.method156().method444(class266.field3571);
                            class224 var15 = class224.method1430(var14, 100, var8);
                            var15.method1407(0);
                            class465.field6928.method1110(var15);
                            arg5.field4324 = var15;
                            arg5.field4319 = (int) ((double) (-arg5.field4318 + arg5.field4328) * Math.random()) + arg5.field4318;
                            return;
                        }
                    }
                } else {
                    arg5.field4324.method1436(var8);
                    if (arg5.field4324.method2673(-122)) {
                        return;
                    }
                    arg5.field4324 = null;
                }
            } else {
                if (arg5.field4314 != null) {
                    class465.field6928.method1114(arg5.field4314);
                    arg5.field4314 = null;
                }
                if (arg5.field4324 != null) {
                    class465.field6928.method1114(arg5.field4324);
                    arg5.field4324 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V")
    public final void method877(int arg0) {
        this.field6261 = -this.field6265 + this.field6267;
        if (arg0 != 1) {
            method2648(-97, -74, 124, -34, -87);
        }
        ++field6262;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static void method2646(byte arg0) {
        if (arg0 < -35) {
            field6266 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method2647(Throwable arg0, int arg1) throws IOException {
        ++field6271;
        String var2;
        if (!(arg0 instanceof class389)) {
            var2 = "";
        } else {
            class389 var3 = (class389) arg0;
            var2 = var3.field5636 + " | ";
            arg0 = var3.field5638;
        }
        StringWriter var4 = new StringWriter();
        if (arg1 != 0) {
            return null;
        } else {
            PrintWriter var5 = new PrintWriter(var4);
            arg0.printStackTrace(var5);
            var5.close();
            String var6 = var4.toString();
            BufferedReader var7 = new BufferedReader(new StringReader(var6));
            String var8 = var7.readLine();
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                String var12;
                if (~var10 == 0) {
                    var12 = var9;
                } else {
                    var12 = var9.substring(0, var10);
                }
                String var13 = var12.trim();
                String var14 = var13.substring(1 + var13.lastIndexOf(32));
                String var15 = var14.substring(var14.lastIndexOf(9) - -1);
                String var16 = var2 + var15;
                if (~var10 != 0 && ~var11 != 0) {
                    int var17 = var9.indexOf(".java:", var10);
                    if (var17 >= 0) {
                        var16 = var16 + var9.substring(var17 + 5, var11);
                    }
                }
                var2 = var16 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIII)V")
    public static final void method2648(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class516.field7502 != null) {
            class516.field7502[arg0][arg1] = -16777216 | arg2;
        }
        if (class117.field1534 != null) {
            class117.field1534[arg0][arg1] = (short) arg3;
        }
        if (class215.field2939 != null) {
            class215.field2939[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(FFZF)F")
    public static final float method2649(float arg0, float arg1, boolean arg2, float arg3) {
        ++field6263;
        if (arg2) {
            method2649(0.5152214F, -0.12272225F, false, -1.1717595F);
        }
        return (arg1 - arg3) * arg0 + arg3;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lug;II)V")
    public final void method61(class396 arg0, int arg1, int arg2) {
        ++field6272;
        if (arg1 != 487215116) {
            this.field6261 = 64;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field3066 = ~arg0.method2388((byte) -121) == -2;
                }
            } else {
                this.field6267 = arg0.method2386(-23648);
            }
        } else {
            this.field6265 = arg0.method2386(-23648);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)[I")
    public final int[] method62(int arg0, int arg1) {
        ++field6270;
        int[] var3 = super.field3068.method1970(arg1, (byte) 29);
        if (super.field3068.field4480) {
            int[] var4 = this.method1459(arg1, -45, 0);
            for (int var5 = 0; class446.field6486 > var5; ++var5) {
                var3[var5] = (var4[var5] * this.field6261 >> 12) + this.field6265;
            }
        }
        return arg0 != 15811 ? null : var3;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method112(int arg0, boolean arg1) {
        ++field6269;
        if (!arg1) {
            field6268 = 14;
        }
        int[][] var3 = super.field3059.method28((byte) 88, arg0);
        if (super.field3059.field57) {
            int[][] var4 = this.method1460(arg0, 0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class446.field6486; ++var11) {
                var8[var11] = (var5[var11] * this.field6261 >> 12) + this.field6265;
                var9[var11] = this.field6265 - -(var6[var11] * this.field6261 >> 12);
                var10[var11] = (var7[var11] * this.field6261 >> 12) + this.field6265;
            }
        }
        return var3;
    }
}
