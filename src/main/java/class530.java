import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class530 extends class207 implements class27 {

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Z")
    private boolean field7419 = false;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "Ldm;")
    private class46 field7427 = new class46();

    @OriginalMember(owner = "client!a", name = "L", descriptor = "I")
    private int field7434 = 4096;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "I")
    private int field7436 = 4096;

    @OriginalMember(owner = "client!a", name = "J", descriptor = "Ldea;")
    private class205 field7432 = new class205(4);

    @OriginalMember(owner = "client!a", name = "P", descriptor = "Z")
    private boolean field7438 = false;

    @OriginalMember(owner = "client!a", name = "I", descriptor = "Lm;")
    private class163 field7431;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "[I")
    private static int[] field7418 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!a", name = "x", descriptor = "[B")
    private static byte[] field7421 = new byte[8191];

    @OriginalMember(owner = "client!a", name = "y", descriptor = "[I")
    private static int[] field7422 = new int[8191];

    @OriginalMember(owner = "client!a", name = "z", descriptor = "[I")
    public static int[] field7423 = new int[6];

    @OriginalMember(owner = "client!a", name = "D", descriptor = "[I")
    private static int[] field7426 = new int[8191];

    @OriginalMember(owner = "client!a", name = "w", descriptor = "[I")
    private static int[] field7420 = field7418;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "[S")
    private static short[] field7429 = new short[8191];

    @OriginalMember(owner = "client!a", name = "F", descriptor = "[F")
    private static float[] field7428 = new float[20];

    @OriginalMember(owner = "client!a", name = "C", descriptor = "[F")
    private static float[] field7425 = field7428;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "[I")
    private static int[] field7433 = field7418;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "[I")
    public static int[] field7430 = field7418;

    @OriginalMember(owner = "client!a", name = "R", descriptor = "I")
    private int field7440;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "Lc;")
    private class158 field7424;

    @OriginalMember(owner = "client!a", name = "M", descriptor = "Lm;")
    private class163 field7435;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "Lb;")
    private class279 field7437;

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "[Lv;")
    private class497[] field7439;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "(IIIIII)V")
    private final native void method3039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;)V")
    public class530(Canvas arg0, class17 arg1) {
        super(arg1);
        try {
            if (!class336.method2038(false, "sw3d")) {
                throw new RuntimeException("");
            } else {
                class138.method925(0);
                this.method3051(super.field2924, 0, 0);
                class568.method3231(1, true, false);
                this.field7438 = true;
                this.field7431 = new class361();
                this.method1355(new class361());
                this.method1272(1);
                this.method1280(0);
                if (arg0 != null) {
                    this.method1260(arg0);
                    this.method1343(arg0);
                }
            }
        } catch (Throwable var3) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!a", name = "l", descriptor = "()V")
    public final void method1307() throws class589 {
        if (this.field7437 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field7437.method1803();
        }
    }

    @OriginalMember(owner = "client!a", name = "GA", descriptor = "(S)Z")
    private final boolean method3040(short arg0) {
        class17 var2 = super.field2924;
        synchronized (super.field2924) {
            if (!super.field2924.method188(arg0, -103)) {
                return false;
            } else {
                class211 var4 = super.field2924.method190((byte) -89, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (!var4.field2970) {
                        var6 = super.field2924.method186(true, arg0, 10350, 128, 128, 0.7F);
                    } else {
                        var6 = super.field2924.method185(true, 0.7F, 128, arg0, 128, (byte) 49);
                    }
                    this.method3052(arg0, var4.field2973, var4.field2975, var4.field2977, var4.field2969, var4.field2983, var4.field2968, var4.field2986, var4.field2984, var4.field2967, var4.field2978, var4.field2985, var4.field2974, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "t", descriptor = "()Z")
    public final boolean method1328() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "p", descriptor = "()Lla;")
    public final class384 method1317() {
        return new class384(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "()Z")
    public final boolean method1285() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
    public final void method1272(int arg0) {
        this.field7440 = arg0;
        this.field7439 = new class497[this.field7440];
        for (int var2 = 0; var2 < this.field7440; ++var2) {
            this.field7439[var2] = new class497(this, this.field7434, this.field7436);
        }
    }

    @OriginalMember(owner = "client!a", name = "NA", descriptor = "(Z)V")
    public final native void method134(boolean arg0);

    @OriginalMember(owner = "client!a", name = "r", descriptor = "()Z")
    public final boolean method1319() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1262(Canvas arg0) {
        if (this.field7437.field3857 == arg0) {
            this.method1343((Canvas) null);
        }
        class279 var2 = (class279) this.field7432.method1242(0, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method1117(0);
            var2.method1797();
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIILpa;II)V")
    public final void method1266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class310 arg6, int arg7, int arg8) {
        this.method3054(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(IIIII)V")
    public final native void method1292(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "E", descriptor = "()Lv;")
    public final class497 method3041() {
        for (int var1 = 0; var1 < this.field7440; ++var1) {
            if (this.field7439[var1].field6940 == Thread.currentThread()) {
                return this.field7439[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "()V")
    public final void method1276() {
        if (!this.field7419) {
            this.field7439 = null;
            this.field7437 = null;
            this.field7424 = null;
            this.field7431 = null;
            this.field7432.method1247(0);
            for (class158 var1 = (class158) this.field7427.method456((byte) -88); var1 != null; var1 = (class158) this.field7427.method460((byte) -122)) {
                var1.method1020();
            }
            this.field7427.method465(true);
            this.method3053();
            if (this.field7438) {
                class278.method1792(true, false, false);
                this.field7438 = false;
            }
            this.method3042();
            class138.method923(17797);
            this.field7419 = true;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)V")
    public final void method1268(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!a", name = "XA", descriptor = "()V")
    private final void method3042() {
        System.gc();
        System.runFinalization();
        class138.method924((byte) -123);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(FFF)V")
    public final void method1279(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
    public final void method1280(int arg0) {
        this.field7439[arg0].method2877();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
    public final void method1265() {
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I")
    public final int method1306(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!a", name = "g", descriptor = "()V")
    public final void method1289() {
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V")
    public final void method1267() {
    }

    @OriginalMember(owner = "client!a", name = "q", descriptor = "(IIII)V")
    public final native void method1336(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "o", descriptor = "()I")
    public final int method1313() {
        return 4;
    }

    @OriginalMember(owner = "client!a", name = "YA", descriptor = "()I")
    public final native int method1339();

    @OriginalMember(owner = "client!a", name = "C", descriptor = "()Z")
    public final boolean method1353() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(III)V")
    public final native void method1334(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(I)V")
    public final native void method1274(int arg0);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(II)I")
    public final int method1357(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lsv;)V")
    public final void method1277(class567 arg0) {
    }

    @OriginalMember(owner = "client!a", name = "oa", descriptor = "(I[I[F)V")
    private final native void method3043(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(I)V")
    private final native void method3044(int arg0);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIII)V")
    public final void method1278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3041().method2887(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!a", name = "h", descriptor = "()Z")
    public final boolean method1294() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lhp;Z)V")
    private final void method3045(class274 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class28 var8 = (class28) arg0.field3798.method1457(9); var8 != null; var8 = (class28) arg0.field3798.method1456(21)) {
            field7420[var3++] = var8.field468;
            field7420[var3++] = var8.field478;
            field7420[var3++] = var8.field479;
            field7426[var4++] = var8.field480;
            field7429[var6++] = (short) var8.field469;
            field7422[var5++] = var8.field475;
            if (arg1) {
                field7421[var7++] = var8.field473;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
    public final void method1283(boolean arg0) {
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lr;Lhp;Lm;Lkn;I)V")
    public final void method1366(class157 arg0, class274 arg1, class163 arg2, class631 arg3, int arg4) {
        this.method3045(arg1, true);
        if (arg3 == null) {
            this.method3041().method2885(this, arg0, arg2, (int[]) null, arg4, field7420, field7426, field7422, field7429, field7421, arg1.field3798.method1455(127), field7430);
        } else {
            field7423[5] = 0;
            this.method3041().method2885(this, arg0, arg2, field7423, arg4, field7420, field7426, field7422, field7429, field7421, arg1.field3798.method1455(118), field7430);
            arg3.field9236 = field7423[0];
            arg3.field9235 = field7423[1];
            arg3.field9237 = field7423[2];
            arg3.field9234 = field7423[3];
            arg3.field9233 = field7423[4];
            arg3.field9232 = field7423[5] != 0;
        }
        class12 var6 = (class12) arg0;
        var6.method153(0, arg2);
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method1284((byte) -70);
        if (this.nativeid != 0L) {
            class138.method926(this, -1);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([Lr;Lm;[Lkn;I)V")
    public final void method1360(class157[] arg0, class163 arg1, class631[] arg2, int arg3) {
        if (arg2 == null) {
            this.method3041().method2890(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class631 var5 = arg2[0];
            field7423[5] = 0;
            this.method3041().method2890(this, arg0, arg1, field7423, -1, arg3);
            var5.field9236 = field7423[0];
            var5.field9235 = field7423[1];
            var5.field9237 = field7423[2];
            var5.field9234 = field7423[3];
            var5.field9233 = field7423[4];
            var5.field9232 = field7423[5] != 0;
        }
    }

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(IIIII)V")
    public final native void method1329(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lpu;[Lbt;Z)Lra;")
    public final class91 method1348(class483 arg0, class38[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field785;
            var5[var7] = arg1[var7].field783;
            if (arg1[var7].field790 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class249(this, this.field7424, arg0, arg1, (class52[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class232(this, this.field7424, arg0, arg1, (class52[]) null);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lln;IIII)Lr;")
    public final class157 method1293(class317 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class12(this, this.field7424, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "s", descriptor = "()Z")
    public final boolean method1323() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "y", descriptor = "()V")
    public final void method1342() {
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()Z")
    public final boolean method1273() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1327(Rectangle[] arg0, int arg1) throws class589 {
        if (this.field7437 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field7437.method1796(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I[Lrh;)V")
    public final void method1311(int arg0, class223[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field7433[var3++] = arg1[var4].method1434(7);
            field7433[var3++] = arg1[var4].method1431(127);
            field7433[var3++] = arg1[var4].method1429(4330);
            field7433[var3++] = arg1[var4].method1433(4294);
            field7425[var4] = arg1[var4].method1435(0);
            field7433[var3++] = arg1[var4].method1430(true);
        }
        this.method3043(arg0, field7433, field7425);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIZ)Lha;")
    public final class52 method1300(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class423(this, this.field7424, arg0, arg1, arg2, arg3) : new class574(this, this.field7424, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "L", descriptor = "(I)V")
    public final native void method1302(int arg0);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([Lr;Lhp;Lm;[Lkn;I)V")
    public final void method1288(class157[] arg0, class274 arg1, class163 arg2, class631[] arg3, int arg4) {
        this.method3045(arg1, true);
        if (arg3 == null) {
            this.method3041().method2883(this, arg0, arg2, (int[]) null, arg4, field7420, field7426, field7422, field7429, field7421, arg1.field3798.method1455(125), field7430);
        } else {
            class631 var6 = arg3[0];
            field7423[5] = 0;
            this.method3041().method2883(this, arg0, arg2, field7423, arg4, field7420, field7426, field7422, field7429, field7421, arg1.field3798.method1455(112), field7430);
            var6.field9236 = field7423[0];
            var6.field9235 = field7423[1];
            var6.field9237 = field7423[2];
            var6.field9234 = field7423[3];
            var6.field9233 = field7423[4];
            var6.field9232 = field7423[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class12 var9 = (class12) arg0[var8];
                var9.method153(var7, arg2);
                if (var9.field182 != null) {
                    var7 += var9.field182.length * 9;
                }
                if (var9.field185 != null) {
                    var7 += var9.field185.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "([I)V")
    public final native void method1350(int[] arg0);

    @OriginalMember(owner = "client!a", name = "MA", descriptor = "(Lb;)V")
    private final native void method3046(class279 arg0);

    @OriginalMember(owner = "client!a", name = "TA", descriptor = "(Lm;)V")
    private final native void method3047(class163 arg0);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lm;)V")
    public final void method1355(class163 arg0) {
        this.field7435 = arg0;
        this.method3047(arg0);
    }

    @OriginalMember(owner = "client!a", name = "ea", descriptor = "(Lu;)V")
    private final native void method3048(class64 arg0);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lu;)V")
    public final void method1296(class64 arg0) {
        this.field7424 = (class158) arg0;
        this.method3048(arg0);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1275(Canvas arg0) {
        class279 var2 = (class279) this.field7432.method1242(0, (long) arg0.hashCode());
        Dimension var3 = arg0.getSize();
        var2.method1800(arg0, var3.width, var3.height);
        if (arg0 != null && this.field7437.field3857 == arg0) {
            this.method1343(arg0);
        }
    }

    @OriginalMember(owner = "client!a", name = "v", descriptor = "(IIII)[I")
    public final native int[] method1361(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "F", descriptor = "(IIII)V")
    public final native void method1303(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([IIIII)Lha;")
    public final class52 method1363(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class423(this, this.field7424, arg0, arg1, arg2, arg3, arg4) : new class574(this, this.field7424, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class423(this, this.field7424, arg0, arg1, arg2, arg3, arg4) : new class574(this, this.field7424, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "la", descriptor = "(FF)V")
    public final native void method1333(float arg0, float arg1);

    @OriginalMember(owner = "client!a", name = "IA", descriptor = "(III[I)V")
    public final native void method1324(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!a", name = "U", descriptor = "()I")
    public final native int method1286();

    @OriginalMember(owner = "client!a", name = "WA", descriptor = "(S)Z")
    private final boolean method3049(short arg0) {
        synchronized (this) {
            class211 var3 = super.field2924.method190((byte) -89, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method3050(arg0, var3.field2973, var3.field2975, var3.field2977, var3.field2969, var3.field2983, var3.field2968, var3.field2986, var3.field2984, var3.field2967, var3.field2978, var3.field2985, var3.field2974);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
    public final void method1330(int arg0) {
        this.field7439[arg0].method2875();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lsv;Lsv;FLsv;)Lsv;")
    public final class567 method1281(class567 arg0, class567 arg1, float arg2, class567 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II[I[I)Lpa;")
    public final class310 method1322(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class179(this, this.field7424, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lhp;)V")
    public final void method1356(class274 arg0) {
        this.method3045(arg0, false);
        this.method3041().method2881(this, field7420, field7426, field7422, field7429, arg0.field3798.method1455(103));
    }

    @OriginalMember(owner = "client!a", name = "D", descriptor = "()Z")
    public final boolean method1369() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "RA", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method3050(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!a", name = "CA", descriptor = "()I")
    public final native int method1282();

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(IIIIII)V")
    public final void method1349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3039(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "JA", descriptor = "(IIII)V")
    public final native void method1314(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "k", descriptor = "()Z")
    public final boolean method1305() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "G", descriptor = "(ILpa;II)V")
    public final native void method1347(int arg0, class310 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "z", descriptor = "()Lm;")
    public final class163 method1344() {
        return this.field7431;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(IIIIII)V")
    public final void method1325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1329(arg0, arg1, arg2, arg4, arg5);
        this.method1329(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1292(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method1292(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(IIII)V")
    public final native void method1365(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public final class174 method1270(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class234(this, this.field7424, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!a", name = "Y", descriptor = "(Ln;II)V")
    private final native void method3051(class17 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V")
    public final void method1309(boolean arg0) {
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!a", name = "xa", descriptor = "()V")
    public final native void method1352();

    @OriginalMember(owner = "client!a", name = "B", descriptor = "()Z")
    public final boolean method1346() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "g", descriptor = "(I)V")
    public final void method1362(int arg0) {
        class138.method924((byte) 48);
        this.method3044(arg0);
        for (class158 var2 = (class158) this.field7427.method456((byte) -125); var2 != null; var2 = (class158) this.field7427.method460((byte) -104)) {
            var2.method1022();
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()I")
    public final native int method1301();

    @OriginalMember(owner = "client!a", name = "N", descriptor = "(IIII)V")
    public final native void method1308(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lbt;Z)Lha;")
    public final class52 method1332(class38 arg0, boolean arg1) {
        int[] var3 = arg0.field784;
        byte[] var4 = arg0.field782;
        int var5 = arg0.field785;
        int var6 = arg0.field783;
        class52 var7;
        if (arg1 && arg0.field790 == null) {
            var7 = new class255(this, this.field7424, var3, var4, 0, arg0.field785, arg0.field785, arg0.field783);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field790;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class423(this, this.field7424, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field784[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class423(this, this.field7424, var9, 0, arg0.field785, arg0.field785, arg0.field783);
                } else {
                    var7 = new class574(this, this.field7424, var9, 0, arg0.field785, arg0.field785, arg0.field783);
                }
            }
        }
        var7.method420(arg0.field787, arg0.field786, arg0.field789, arg0.field788);
        return var7;
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(I)Lu;")
    public final class64 method1359(int arg0) {
        class158 var2 = new class158(this, arg0);
        this.field7427.method463(var2, -126);
        return var2;
    }

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(F)V")
    public final native void method1295(float arg0);

    @OriginalMember(owner = "client!a", name = "ba", descriptor = "()I")
    public final native int method1287();

    @OriginalMember(owner = "client!a", name = "za", descriptor = "(IIIIII[BII)V")
    public final native void method1264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "i", descriptor = "()V")
    public final void method1299() {
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIII)Lsv;")
    public final class567 method1261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!a", name = "A", descriptor = "(IIIII)V")
    public final native void method1312(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "h", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method3052(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!a", name = "u", descriptor = "()V")
    public final void method1337() {
    }

    @OriginalMember(owner = "client!a", name = "w", descriptor = "()V")
    private final native void method3053();

    @OriginalMember(owner = "client!a", name = "x", descriptor = "()Z")
    public final boolean method1340() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIF)Lrh;")
    public final class223 method1320(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class53(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(Z)V")
    public final void method1364(boolean arg0) {
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(IIIIII)V")
    public final native void method1321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "P", descriptor = "()F")
    public final native float method1326();

    @OriginalMember(owner = "client!a", name = "B", descriptor = "(IIIIII)Z")
    public final native boolean method1263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1260(Canvas arg0) {
        class279 var2 = (class279) this.field7432.method1242(0, (long) arg0.hashCode());
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class279 var5 = new class279(this, arg0);
            this.field7432.method1241(var5, (long) arg0.hashCode(), -127);
        }
    }

    @OriginalMember(owner = "client!a", name = "ra", descriptor = "()F")
    public final native float method1271();

    @OriginalMember(owner = "client!a", name = "q", descriptor = "()Lm;")
    public final class163 method1318() {
        return new class361();
    }

    @OriginalMember(owner = "client!a", name = "A", descriptor = "()Z")
    public final boolean method1345() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "n", descriptor = "()V")
    public final native void method1269();

    @OriginalMember(owner = "client!a", name = "j", descriptor = "()Z")
    public final boolean method1304() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "ca", descriptor = "(IIIIIILpa;II)V")
    private final native void method3054(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class310 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1343(Canvas arg0) {
        if (arg0 != null) {
            class279 var2 = (class279) this.field7432.method1242(0, (long) arg0.hashCode());
            this.field7437 = var2;
            this.method3046(var2);
        } else {
            this.field7437 = null;
            this.method3046((class279) null);
        }
    }

    @OriginalMember(owner = "client!a", name = "v", descriptor = "()Z")
    public final boolean method1338() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
    public final void method1297(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!a", name = "m", descriptor = "()Z")
    public final boolean method1310() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "m", descriptor = "(IFFFFF)V")
    public final native void method1298(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "()Ljava/lang/Object;")
    private final Object method3055() {
        return new class455(this);
    }

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(II)V")
    public final native void method1290(int arg0, int arg1);
}
