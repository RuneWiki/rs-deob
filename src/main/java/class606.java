import java.awt.Canvas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class606 extends class511 {

    @OriginalMember(owner = "client!ip", name = "yb", descriptor = "[J")
    public static long[] field8729 = new long[100];

    @OriginalMember(owner = "client!ip", name = "Hb", descriptor = "Z")
    public static boolean field8738 = false;

    @OriginalMember(owner = "client!ip", name = "Cb", descriptor = "I")
    public static int field8733 = 0;

    @OriginalMember(owner = "client!ip", name = "sb", descriptor = "I")
    public static int field8723;

    @OriginalMember(owner = "client!ip", name = "tb", descriptor = "I")
    public static int field8724;

    @OriginalMember(owner = "client!ip", name = "ub", descriptor = "I")
    public static int field8725;

    @OriginalMember(owner = "client!ip", name = "vb", descriptor = "I")
    public static int field8726;

    @OriginalMember(owner = "client!ip", name = "wb", descriptor = "I")
    public static int field8727;

    @OriginalMember(owner = "client!ip", name = "xb", descriptor = "I")
    public static int field8728;

    @OriginalMember(owner = "client!ip", name = "zb", descriptor = "I")
    public static int field8730;

    @OriginalMember(owner = "client!ip", name = "Ab", descriptor = "I")
    public static int field8731;

    @OriginalMember(owner = "client!ip", name = "Bb", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!ip", name = "Db", descriptor = "I")
    public static int field8734;

    @OriginalMember(owner = "client!ip", name = "Eb", descriptor = "I")
    public static int field8735;

    @OriginalMember(owner = "client!ip", name = "Fb", descriptor = "I")
    public static int field8736;

    @OriginalMember(owner = "client!ip", name = "Gb", descriptor = "I")
    public static int field8737;

    @OriginalMember(owner = "client!ip", name = "Ib", descriptor = "I")
    public static int field8739;

    @OriginalMember(owner = "client!ip", name = "Jb", descriptor = "I")
    public static int field8740;

    @OriginalMember(owner = "client!ip", name = "Kb", descriptor = "I")
    public static int field8741;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "([Lr;Lhp;Lm;[Lkn;I)V")
    public final void method1288(class157[] arg0, class274 arg1, class163 arg2, class631[] arg3, int arg4) {
        ++field8739;
        class247[] var6 = new class247[arg0.length];
        for (int var7 = 0; ~var7 > ~arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class247) arg0[var7];
            }
        }
        class247 var8 = class247.method1530(this, var6);
        var8.method289(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1275(Canvas arg0) {
        ++field8741;
        class316 var2 = (class316) super.field7145.method1242(0, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method1117(0);
            class316 var3 = class496.method2873(arg0, (byte) 7);
            super.field7145.method1241(var3, (long) arg0.hashCode(), -128);
            if (super.field7149 == arg0 && super.field7181 == null) {
                super.field7182 = var3.field4243;
                super.field7147 = var3;
                super.field7162 = var3.field4242;
                super.field7159 = var3.field4248;
                this.method2956();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "x", descriptor = "()Z")
    public final boolean method1340() {
        ++field8726;
        return false;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public final class174 method1270(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field8737;
        return new class520(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "([Lr;Lm;[Lkn;I)V")
    public final void method1360(class157[] arg0, class163 arg1, class631[] arg2, int arg3) {
        ++field8740;
        class247[] var5 = new class247[arg0.length];
        for (int var6 = 0; ~var6 > ~arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class247) arg0[var6];
            }
        }
        class247 var7 = class247.method1530(this, var5);
        var7.method289(arg1, arg2 == null ? null : arg2[0], (class274) null, arg3);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ljava/lang/Runnable;)Lch;")
    public final class394 method1372(Runnable arg0) {
        ++field8725;
        for (int var2 = 0; ~var2 > ~super.field7178; ++var2) {
            if (super.field7177[var2].field5554 == arg0) {
                return super.field7177[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "(I)V")
    public static void method3559(int arg0) {
        field8729 = null;
        if (arg0 <= 94) {
            field8734 = 81;
        }
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)V")
    public final void method1280(int arg0) {
        ++field8731;
        super.field7177[arg0].method2364(Thread.currentThread(), 8190);
    }

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "(I)V")
    public final void method1330(int arg0) {
        super.field7177[arg0].method2364((Runnable) null, 8190);
        ++field8735;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field8723;
        class16 var11 = (class16) this.method1372(Thread.currentThread());
        class36 var12 = var11.field211;
        var12.field762 = false;
        var12.field759 = true;
        int var13 = arg6 >>> 24;
        if (~arg9 == -1 || ~arg9 == -2 && ~var13 == -256) {
            var12.field753 = 0;
            var12.field750 = false;
            var12.method372(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else if (~arg9 != -2) {
            if (~arg9 != -3) {
                throw new IllegalArgumentException();
            }
            var12.field750 = true;
            var12.field753 = 128;
            var12.method372(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            var12.field753 = -var13 + 255;
            var12.field750 = false;
            var12.method372(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field762 = true;
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;)V")
    public class606(Canvas arg0, class17 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V")
    public final void method1272(int arg0) {
        ++field8728;
        super.field7178 = arg0;
        super.field7177 = new class16[super.field7178];
        for (int var2 = 0; ~var2 > ~super.field7178; ++var2) {
            super.field7177[var2] = new class16(this);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method3560(int arg0, Throwable arg1) throws IOException {
        ++field8724;
        String var3;
        if (arg1 instanceof class286) {
            class286 var2 = (class286) arg1;
            var3 = var2.field3932 + " | ";
            arg1 = var2.field3936;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        if (arg0 != -1) {
            method3559(-55);
        }
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 - -1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(1 + var13.lastIndexOf(32));
            String var15 = var14.substring(1 + var14.lastIndexOf(9));
            String var16 = var3 + var15;
            if (var10 != -1 && ~var11 != 0) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lln;IIII)Lr;")
    public final class157 method1293(class317 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8736;
        return new class247(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIII)V")
    public final void method1278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8727;
        class16 var8 = (class16) this.method1372(Thread.currentThread());
        class36 var9 = var8.field211;
        int var10 = -arg0 + arg2;
        int var11 = -arg1 + arg3;
        int var12 = ~var10 > -1 ? -var10 : var10;
        int var13 = ~var11 > -1 ? -var11 : var11;
        int var14 = var12;
        if (~var12 > ~var13) {
            var14 = var13;
        }
        if (var14 != 0) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var11 << 16) / var14;
            int var17 = (var15 >> 16) + var10;
            int var18 = (var16 >> 16) + var11;
            if (~var16 < ~var15) {
                var16 = -var16;
            } else {
                var15 = -var15;
            }
            int var19 = arg5 * var16 >> 17;
            int var20 = arg5 * var16 + 1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg5 * var15 + 1 >> 17;
            int var23 = arg0 - var9.method375();
            int var24 = arg1 - var9.method383();
            int var25 = var19 + var23;
            int var26 = -var20 + var23;
            int var27 = -var20 + var17 + var23;
            int var28 = var17 + var23 - -var19;
            int var29 = var24 - -var21;
            int var30 = -var22 + var24;
            int var31 = var18 + var24 + -var22;
            int var32 = var18 + var24 + var21;
            if (arg6 != 0) {
                if (~arg6 != -2) {
                    throw new IllegalArgumentException();
                }
                var9.field753 = -(arg4 >>> 24) + 255;
            } else {
                var9.field753 = 0;
            }
            var9.field759 = var25 < 0 || var9.field757 < var25 || ~var26 > -1 || ~var26 < ~var9.field757 || ~var27 > -1 || ~var27 < ~var9.field757;
            var9.method373(var29, var30, var31, var25, var26, var27, arg4);
            var9.field759 = var25 < 0 || var9.field757 < var25 || ~var26 > -1 || ~var26 < ~var9.field757 || var28 < 0 || var9.field757 < var28;
            var9.method373(var29, var31, var32, var25, var27, var28, arg4);
        }
    }

    @OriginalMember(owner = "client!ip", name = "G", descriptor = "()V")
    public final void method1374() {
        super.field7183 = -super.field7184 + super.field7165;
        ++field8730;
        super.field7188 = -super.field7184 + super.field7170;
        super.field7185 = -super.field7157 + super.field7160;
        super.field7191 = -super.field7157 + super.field7173;
        for (int var1 = 0; var1 < super.field7178; ++var1) {
            class36 var5 = ((class16) super.field7177[var1]).field211;
            var5.field760 = -super.field7165 + super.field7184;
            var5.field755 = -super.field7160 + super.field7173;
            var5.field757 = super.field7170 - super.field7165;
            var5.field754 = super.field7157 - super.field7160;
        }
        int var2 = super.field7182 * super.field7160 - -super.field7165;
        for (int var3 = super.field7160; super.field7173 > var3; ++var3) {
            for (int var4 = 0; super.field7178 > var4; ++var4) {
                ((class16) super.field7177[var4]).field211.field758[-super.field7160 + var3] = var2;
            }
            var2 += super.field7182;
        }
    }

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1343(Canvas arg0) {
        if (arg0 != null) {
            class316 var2 = (class316) super.field7145.method1242(0, (long) arg0.hashCode());
            if (var2 != null) {
                super.field7147 = var2;
                super.field7149 = arg0;
                if (super.field7181 == null) {
                    super.field7182 = var2.field4243;
                    super.field7159 = var2.field4248;
                    super.field7162 = var2.field4242;
                    this.method2956();
                }
            }
        } else {
            super.field7147 = null;
            super.field7149 = null;
            if (super.field7181 == null) {
                super.field7182 = super.field7159 = 1;
                super.field7162 = null;
                this.method2956();
            }
        }
        ++field8732;
    }
}
