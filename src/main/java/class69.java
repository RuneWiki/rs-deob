import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class69 extends class299 implements class28 {

    @OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "Z")
    private boolean field1092 = false;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Lnv;")
    private class44 field1089 = new class44();

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    private int field1093 = 4096;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    private int field1106 = 4096;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "Lvg;")
    private class56 field1100 = new class56(4);

    @OriginalMember(owner = "client!w", name = "N", descriptor = "Z")
    private boolean field1109 = false;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "Lc;")
    private class517 field1094;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "[I")
    private static int[] field1090 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!w", name = "F", descriptor = "[I")
    private static int[] field1101 = field1090;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field1096 = Boolean.FALSE;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "[I")
    private static int[] field1102 = new int[8191];

    @OriginalMember(owner = "client!w", name = "I", descriptor = "[B")
    private static byte[] field1104 = new byte[8191];

    @OriginalMember(owner = "client!w", name = "z", descriptor = "[I")
    public static int[] field1095 = field1090;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "[I")
    private static int[] field1099 = field1090;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "[S")
    private static short[] field1105 = new short[8191];

    @OriginalMember(owner = "client!w", name = "M", descriptor = "[I")
    private static int[] field1108 = new int[8191];

    @OriginalMember(owner = "client!w", name = "H", descriptor = "[F")
    private static float[] field1103 = new float[20];

    @OriginalMember(owner = "client!w", name = "L", descriptor = "[I")
    public static int[] field1107 = new int[6];

    @OriginalMember(owner = "client!w", name = "B", descriptor = "[F")
    private static float[] field1097 = field1103;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "I")
    private int field1110;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "Lg;")
    private class427 field1091;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "Lb;")
    private class478 field1098;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "[Lk;")
    private class67[] field1111;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIII)V", line = 3)
    public final void method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method576().method481(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!w", name = "w", descriptor = "()Lc;", line = 8)
    public final class517 method496() {
        return new class131();
    }

    @OriginalMember(owner = "client!w", name = "X", descriptor = "(S)Z", line = 12)
    private final boolean method497(short arg0) {
        synchronized (this) {
            class420 var3 = super.field4588.method938(28923, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method532(arg0, var3.field6165, var3.field6162, var3.field6175, var3.field6161, var3.field6155, var3.field6166, var3.field6154, var3.field6169, var3.field6160, var3.field6158, var3.field6180, var3.field6157);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "()V", line = 23)
    public final void method499() {
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 28)
    public final void method501(Rectangle[] arg0, int arg1) {
        if (this.field1098 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field1098.method2890(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!w", name = "g", descriptor = "()V", line = 40)
    public final void method503() {
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V", line = 43)
    public final void method504(int arg0) {
        this.field1110 = arg0;
        this.field1111 = new class67[this.field1110];
        for (int var2 = 0; var2 < this.field1110; ++var2) {
            this.field1111[var2] = new class67(this, this.field1093, this.field1106);
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 60)
    public final void method507(Canvas arg0) {
        if (arg0 != null) {
            class478 var2 = (class478) this.field1100.method358((byte) 84, (long) arg0.hashCode());
            this.field1098 = var2;
            this.method579(var2);
        } else {
            this.field1098 = null;
            this.method579((class478) null);
        }
    }

    @OriginalMember(owner = "client!w", name = "l", descriptor = "()Z", line = 75)
    public final boolean method508() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V", line = 77)
    public final void method509(boolean arg0) {
    }

    @OriginalMember(owner = "client!w", name = "m", descriptor = "()Z", line = 80)
    public final boolean method510() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V", line = 86)
    protected final synchronized void finalize() {
        this.method1988((byte) -48);
        if (this.nativeid != 0L) {
            class45.method300(this, 0);
        }
    }

    @OriginalMember(owner = "client!w", name = "s", descriptor = "()Z", line = 94)
    public final boolean method515() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II[I[I)Lta;", line = 99)
    public final class340 method516(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class493(this, this.field1091, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(FFF)V", line = 101)
    public final void method517(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 105)
    public final void method518(Canvas arg0) {
        class478 var2 = (class478) this.field1100.method358((byte) 119, (long) arg0.hashCode());
        Dimension var3 = arg0.getSize();
        var2.method2891(arg0, var3.width, var3.height);
        if (arg0 != null && this.field1098.field7028 == arg0) {
            this.method507(arg0);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I[Lrd;)V", line = 115)
    public final void method519(int arg0, class344[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field1099[var3++] = arg1[var4].method2214((byte) 113);
            field1099[var3++] = arg1[var4].method2217(true);
            field1099[var3++] = arg1[var4].method2216(-1);
            field1099[var3++] = arg1[var4].method2218(921);
            field1097[var4] = arg1[var4].method2211(-76);
            field1099[var3++] = arg1[var4].method2212(-1);
        }
        this.method600(arg0, field1099, field1097);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([IIIII)Lo;", line = 134)
    public final class363 method520(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class464(this, this.field1091, arg0, arg1, arg2, arg3, arg4) : new class230(this, this.field1091, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class464(this, this.field1091, arg0, arg1, arg2, arg3, arg4) : new class230(this, this.field1091, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "i", descriptor = "()Z", line = 169)
    public final boolean method521() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "h", descriptor = "()Z", line = 172)
    public final boolean method522() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(IIII)V", line = 175)
    public final void method523(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIII)V", line = 180)
    public final void method524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V", line = 184)
    public final void method525(int arg0) {
        this.field1111[arg0].method487();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lbn;)V", line = 186)
    public final void method526(class307 arg0) {
    }

    @OriginalMember(owner = "client!w", name = "B", descriptor = "()V", line = 188)
    public final void method527() {
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(ILjava/awt/Canvas;Ll;Lgt;)V", line = 451)
    public class69(int arg0, Canvas arg1, class127 arg2, class66 arg3) {
        super(arg0, arg2);
        try {
            if (!field1096) {
                if (arg3 != null) {
                    arg3.method450(this.getClass(), 18238);
                    field1096 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("sw3d");
                    field1096 = Boolean.TRUE;
                }
            }
            if (!field1096) {
                throw new RuntimeException("");
            } else {
                this.method564(super.field4588, 0, 0);
                class488.method2946(true, false, false);
                this.field1109 = true;
                this.field1094 = new class131();
                this.method582(new class131());
                this.method504(1);
                this.method549(0);
                if (arg1 != null) {
                    this.method539(arg1);
                    this.method507(arg1);
                }
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "()Z", line = 194)
    public final boolean method528() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "R", descriptor = "()V", line = 197)
    private final void method529() {
        System.gc();
        System.runFinalization();
        class45.method299((byte) 114);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()V", line = 202)
    public final void method530() {
        if (this.field1098 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field1098.method2886();
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Le;Lvm;Lc;[Lwg;I)V", line = 212)
    public final void method531(class289[] arg0, class320 arg1, class517 arg2, class41[] arg3, int arg4) {
        this.method559(arg1, true);
        if (arg3 == null) {
            this.method576().method477(this, arg0, arg2, (int[]) null, arg4, field1101, field1108, field1102, field1105, field1104, arg1.field4847.method1447(0), field1095);
        } else {
            class41 var6 = arg3[0];
            field1107[5] = 0;
            this.method576().method477(this, arg0, arg2, field1107, arg4, field1101, field1108, field1102, field1105, field1104, arg1.field4847.method1447(0), field1095);
            var6.field668 = field1107[0];
            var6.field671 = field1107[1];
            var6.field669 = field1107[2];
            var6.field672 = field1107[3];
            var6.field670 = field1107[4];
            var6.field673 = field1107[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class473 var9 = (class473) arg0[var8];
                var9.method2865(var7, arg2);
                if (var9.field6938 != null) {
                    var7 += var9.field6938.length * 9;
                }
                if (var9.field6937 != null) {
                    var7 += var9.field6937.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIILta;II)V", line = 255)
    public final void method533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class340 arg6, int arg7, int arg8) {
        this.method505(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ln;)V", line = 259)
    public final void method535(class393 arg0) {
        this.field1091 = (class427) arg0;
        this.method586(arg0);
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 263)
    public final void method536(Canvas arg0) {
        if (this.field1098.field7028 == arg0) {
            this.method507((Canvas) null);
        }
        class478 var2 = (class478) this.field1100.method358((byte) -125, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method947((byte) 108);
            var2.method2889();
        }
    }

    @OriginalMember(owner = "client!w", name = "u", descriptor = "()Lc;", line = 278)
    public final class517 method538() {
        return this.field1094;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 282)
    public final void method539(Canvas arg0) {
        class478 var2 = (class478) this.field1100.method358((byte) -122, (long) arg0.hashCode());
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class478 var5 = new class478(this, arg0);
            this.field1100.method357(var5, 1, (long) arg0.hashCode());
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II[[I[[IIII)Lya;", line = 303)
    public final class11 method540(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class403(this, this.field1091, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lap;[Lrr;Z)Lla;", line = 310)
    public final class310 method542(class29 arg0, class309[] arg1, boolean arg2) {
        return arg2 ? new class207(this, this.field1091, arg0, arg1, (class363[]) null) : new class245(this, this.field1091, arg0, arg1, (class363[]) null);
    }

    @OriginalMember(owner = "client!w", name = "k", descriptor = "()Z", line = 319)
    public final boolean method544() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V", line = 327)
    public final void method549(int arg0) {
        this.field1111[arg0].method484();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lbn;Lbn;FLbn;)Lbn;", line = 331)
    public final class307 method550(class307 arg0, class307 arg1, float arg2, class307 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()Z", line = 336)
    public final boolean method553() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lfe;IIII)Le;", line = 340)
    public final class289 method554(class153 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class473(this, this.field1091, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(IIIIII)V", line = 343)
    public final void method555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method551(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!w", name = "z", descriptor = "()V", line = 347)
    public final void method556() {
        if (!this.field1092) {
            this.field1111 = null;
            this.field1098 = null;
            this.field1091 = null;
            this.field1094 = null;
            this.field1100.method360(-32);
            for (class427 var1 = (class427) this.field1089.method295((byte) 7); var1 != null; var1 = (class427) this.field1089.method296(true)) {
                var1.method2664();
            }
            this.field1089.method291(false);
            this.method495();
            if (this.field1109) {
                class487.method2945(false, true, (byte) -60);
                this.field1109 = false;
            }
            this.method529();
            class45.method302(30026);
            this.field1092 = true;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II)I", line = 379)
    public final int method557(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!w", name = "m", descriptor = "(S)Z", line = 385)
    private final boolean method558(short arg0) {
        class127 var2 = super.field4588;
        synchronized (super.field4588) {
            if (!super.field4588.method936(arg0, (byte) -119)) {
                return false;
            } else {
                class420 var4 = super.field4588.method938(28923, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field6161 && var4.field6175) {
                        var6 = super.field4588.method939(128, -8507, arg0, 128, true, 0.7F);
                    } else {
                        var6 = super.field4588.method937(arg0, -15746, 128, true, 128, 0.7F);
                    }
                    this.method546(arg0, var4.field6165, var4.field6162, var4.field6175, var4.field6161, var4.field6155, var4.field6166, var4.field6154, var4.field6169, var4.field6160, var4.field6158, var4.field6180, var4.field6157, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lvm;Z)V", line = 410)
    private final void method559(class320 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class471 var8 = (class471) arg0.field4847.method1444(1); var8 != null; var8 = (class471) arg0.field4847.method1449((byte) 111)) {
            field1101[var3++] = var8.field6911;
            field1101[var3++] = var8.field6919;
            field1101[var3++] = var8.field6920;
            field1108[var4++] = var8.field6908;
            field1105[var6++] = (short) var8.field6918;
            field1102[var5++] = var8.field6910;
            if (arg1) {
                field1104[var7++] = var8.field6916;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "v", descriptor = "()Z", line = 440)
    public final boolean method560() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "()Z", line = 444)
    public final boolean method562() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "q", descriptor = "()Z", line = 447)
    public final boolean method563() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "A", descriptor = "()Z", line = 499)
    public final boolean method568() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIF)Lrd;", line = 502)
    public final class344 method569(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class104(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!w", name = "t", descriptor = "()Z", line = 505)
    public final boolean method570() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "o", descriptor = "()I", line = 509)
    public final int method572() {
        return 4;
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "()Z", line = 513)
    public final boolean method573() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lrr;Z)Lo;", line = 518)
    public final class363 method574(class309 arg0, boolean arg1) {
        int[] var3 = arg0.field4709;
        byte[] var4 = arg0.field4711;
        int var5 = arg0.field4713;
        int var6 = arg0.field4717;
        class363 var7;
        if (arg1 && arg0.field4715 == null) {
            var7 = new class371(this, this.field1091, var3, var4, 0, arg0.field4713, arg0.field4713, arg0.field4717);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field4715;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class464(this, this.field1091, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field4709[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class464(this, this.field1091, var9, 0, arg0.field4713, arg0.field4713, arg0.field4717);
                } else {
                    var7 = new class230(this, this.field1091, var9, 0, arg0.field4713, arg0.field4713, arg0.field4717);
                }
            }
        }
        var7.method400(arg0.field4716, arg0.field4712, arg0.field4714, arg0.field4710);
        return var7;
    }

    @OriginalMember(owner = "client!w", name = "C", descriptor = "()Lk;", line = 595)
    public final class67 method576() {
        for (int var1 = 0; var1 < this.field1110; ++var1) {
            if (this.field1111[var1].field1072 == Thread.currentThread()) {
                return this.field1111[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!w", name = "y", descriptor = "()V", line = 610)
    public final void method580() {
    }

    @OriginalMember(owner = "client!w", name = "j", descriptor = "()Z", line = 613)
    public final boolean method581() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(IIIIII)Lbn;", line = 617)
    public final class307 method583(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Le;Lvm;Lc;Lwg;I)V", line = 620)
    public final void method584(class289 arg0, class320 arg1, class517 arg2, class41 arg3, int arg4) {
        this.method559(arg1, true);
        if (arg3 == null) {
            this.method576().method475(this, arg0, arg2, (int[]) null, arg4, field1101, field1108, field1102, field1105, field1104, arg1.field4847.method1447(0), field1095);
        } else {
            field1107[5] = 0;
            this.method576().method475(this, arg0, arg2, field1107, arg4, field1101, field1108, field1102, field1105, field1104, arg1.field4847.method1447(0), field1095);
            arg3.field668 = field1107[0];
            arg3.field671 = field1107[1];
            arg3.field669 = field1107[2];
            arg3.field672 = field1107[3];
            arg3.field670 = field1107[4];
            arg3.field673 = field1107[5] != 0;
        }
        class473 var6 = (class473) arg0;
        var6.method2865(0, arg2);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lvm;)V", line = 643)
    public final void method588(class320 arg0) {
        this.method559(arg0, false);
        this.method576().method489(this, field1101, field1108, field1102, field1105, arg0.field4847.method1447(0));
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I", line = 651)
    public final int method589(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V", line = 657)
    public final void method591(boolean arg0) {
    }

    @OriginalMember(owner = "client!w", name = "x", descriptor = "()V", line = 660)
    public final void method593() {
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V", line = 663)
    public final void method594(int arg0) {
        class45.method299((byte) 109);
        this.method552(arg0);
        for (class427 var2 = (class427) this.field1089.method295((byte) 125); var2 != null; var2 = (class427) this.field1089.method296(true)) {
            var2.method2663();
        }
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V", line = 676)
    public final void method595(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(Z)V", line = 679)
    public final void method597(boolean arg0) {
    }

    @OriginalMember(owner = "client!w", name = "qa", descriptor = "()Ljava/lang/Object;", line = 683)
    private final Object method598() {
        return new class497(this);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIZ)Lo;", line = 699)
    public final class363 method601(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class464(this, this.field1091, arg0, arg1, arg2, arg3) : new class230(this, this.field1091, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII)V", line = 706)
    public final void method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method566(arg0, arg1, arg2, arg4, arg5);
        this.method566(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method548(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method548(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Le;Lc;[Lwg;I)V", line = 713)
    public final void method603(class289[] arg0, class517 arg1, class41[] arg2, int arg3) {
        if (arg2 == null) {
            this.method576().method479(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class41 var5 = arg2[0];
            field1107[5] = 0;
            this.method576().method479(this, arg0, arg1, field1107, -1, arg3);
            var5.field668 = field1107[0];
            var5.field671 = field1107[1];
            var5.field669 = field1107[2];
            var5.field672 = field1107[3];
            var5.field670 = field1107[4];
            var5.field673 = field1107[5] != 0;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)Ln;", line = 745)
    public final class393 method605(int arg0) {
        class427 var2 = new class427(this, arg0);
        this.field1089.method292((byte) 121, var2);
        return var2;
    }

    @OriginalMember(owner = "client!w", name = "ua", descriptor = "()V")
    private final native void method495();

    @OriginalMember(owner = "client!w", name = "T", descriptor = "()F")
    public final native float method498();

    @OriginalMember(owner = "client!w", name = "ya", descriptor = "(I)V")
    public final native void method500(int arg0);

    @OriginalMember(owner = "client!w", name = "JA", descriptor = "(F)V")
    public final native void method502(float arg0);

    @OriginalMember(owner = "client!w", name = "NA", descriptor = "(IIIIIILta;II)V")
    private final native void method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class340 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!w", name = "P", descriptor = "(IIIIII)V")
    public final native void method506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!w", name = "s", descriptor = "(IIII)V")
    public final native void method511(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "K", descriptor = "(IIIIII[BII)V")
    public final native void method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!w", name = "Y", descriptor = "()I")
    public final native int method513();

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(II)V")
    public final native void method514(int arg0, int arg1);

    @OriginalMember(owner = "client!w", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method532(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "(III)V")
    public final native void method534(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!w", name = "AA", descriptor = "()I")
    public final native int method537();

    @OriginalMember(owner = "client!w", name = "GA", descriptor = "(IIII)V")
    public final native void method541(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "pa", descriptor = "()I")
    public final native int method543();

    @OriginalMember(owner = "client!w", name = "MA", descriptor = "([I)V")
    public final native void method545(int[] arg0);

    @OriginalMember(owner = "client!w", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method546(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!w", name = "r", descriptor = "()I")
    public final native int method547();

    @OriginalMember(owner = "client!w", name = "IA", descriptor = "(IIIII)V")
    public final native void method548(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "A", descriptor = "(IIIIII)V")
    private final native void method551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!w", name = "u", descriptor = "(I)V")
    private final native void method552(int arg0);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)V")
    public final native void method561(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "W", descriptor = "(Ll;II)V")
    private final native void method564(class127 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!w", name = "ZA", descriptor = "(IIIII)V")
    public final native void method565(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "ma", descriptor = "(IIIII)V")
    public final native void method566(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "t", descriptor = "(I)V")
    public final native void method567(int arg0);

    @OriginalMember(owner = "client!w", name = "ba", descriptor = "(IIII)V")
    public final native void method571(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "aa", descriptor = "()F")
    public final native float method575();

    @OriginalMember(owner = "client!w", name = "va", descriptor = "()V")
    public final native void method577();

    @OriginalMember(owner = "client!w", name = "VA", descriptor = "(IIIIII)Z")
    public final native boolean method578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(Lb;)V")
    private final native void method579(class478 arg0);

    @OriginalMember(owner = "client!w", name = "p", descriptor = "()V")
    public final native void method164();

    @OriginalMember(owner = "client!w", name = "SA", descriptor = "(Lc;)V")
    public final native void method582(class517 arg0);

    @OriginalMember(owner = "client!w", name = "n", descriptor = "()V")
    public final native void method585();

    @OriginalMember(owner = "client!w", name = "QA", descriptor = "(Ln;)V")
    private final native void method586(class393 arg0);

    @OriginalMember(owner = "client!w", name = "sa", descriptor = "(IIII)[I")
    public final native int[] method587(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "OA", descriptor = "()I")
    public final native int method590();

    @OriginalMember(owner = "client!w", name = "v", descriptor = "(III[I)V")
    public final native void method592(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!w", name = "B", descriptor = "(IFFFFF)V")
    public final native void method596(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!w", name = "HA", descriptor = "(IIII)V")
    public final native void method599(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "WA", descriptor = "(I[I[F)V")
    private final native void method600(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!w", name = "ra", descriptor = "(ILta;II)V")
    public final native void method604(int arg0, class340 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(FF)V")
    public final native void method606(float arg0, float arg1);
}
