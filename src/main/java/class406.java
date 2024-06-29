import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class406 extends class544 implements class2 {

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "Z")
    private boolean field6007 = false;

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "Ltg;")
    private class605 field6006 = new class605();

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
    private int field6020 = 4096;

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "I")
    private int field6025 = 4096;

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "Lpl;")
    private class616 field6024 = new class616(4);

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "Z")
    private boolean field6028 = false;

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "Ltc;")
    private class73 field6022;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "[I")
    private static int[] field6008 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "[I")
    private static int[] field6011 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "[S")
    private static short[] field6010 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "[I")
    private static int[] field6012 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "[I")
    private static int[] field6013 = field6008;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "[I")
    private static int[] field6017 = field6008;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "[I")
    public static int[] field6014 = field6008;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "[F")
    private static float[] field6015 = new float[20];

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "[F")
    private static float[] field6016 = field6015;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "[B")
    private static byte[] field6009 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "[I")
    public static int[] field6018 = new int[6];

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "I")
    public int field6027;

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "Lp;")
    private class102 field6023;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "Lya;")
    private class71 field6019;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "Ltc;")
    private class73 field6021;

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "[La;")
    private class163[] field6026;

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z", line = 4)
    private final boolean method2500(short arg0) {
        class267 var2 = super.field7764;
        synchronized (super.field7764) {
            if (!super.field7764.method1772(-5919, arg0)) {
                return false;
            } else {
                class569 var4 = super.field7764.method1774(48, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field8072 != 2) {
                        var6 = super.field7764.method1771(0.7F, 128, arg0, 128, (byte) 70, true);
                    } else {
                        var6 = super.field7764.method1776(true, 0.7F, 128, (byte) 45, 128, arg0);
                    }
                    this.method2501(arg0, var6, var4.field8071, var4.field8072, var4.field8079, var4.field8065, var4.field8080, var4.field8067, var4.field8069, var4.field8077, var4.field8058, var4.field8066, var4.field8062, var4.field8068, var4.field8076, var4.field8063, var4.field8078, var4.field8061, var4.field8070, var4.field8059, var4.field8074);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z", line = 28)
    public final boolean method268() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 34)
    public final void method261(int arg0) {
        class389.method2429(-1);
        this.method2508(arg0);
        for (class71 var2 = (class71) this.field6006.method3463((byte) -50); var2 != null; var2 = (class71) this.field6006.method3469((byte) 107)) {
            var2.method655();
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)I", line = 51)
    public final int method273(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()Z", line = 55)
    public final boolean method239() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lmp;)V", line = 61)
    public final void method420(class315 arg0) {
        if (arg0.field4735.method1459(4) != 0) {
            this.method2504(arg0, false);
            this.method2509().method1226(this, field6013, field6012, field6011, field6010, arg0.field4735.method1459(4));
        }
    }

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()Z", line = 68)
    public final boolean method1237() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lmp;Z)V", line = 73)
    private final void method2504(class315 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class176 var8 = (class176) arg0.field4735.method1462(0); var8 != null; var8 = (class176) arg0.field4735.method1460((byte) 69)) {
            field6013[var3++] = var8.field3015;
            field6013[var3++] = var8.field3022;
            field6013[var3++] = var8.field3016;
            field6012[var4++] = var8.field3021;
            field6010[var6++] = (short) var8.field3018;
            field6011[var5++] = var8.field3017;
            if (arg1) {
                field6009[var7++] = var8.field3014;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V", line = 106)
    public final void method285(class254 arg0) {
        this.field6019 = (class71) arg0;
        this.method2511(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lvt;", line = 113)
    public final class759 method409(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class3(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 116)
    public final class339 method419(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class507(this, this.field6019, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V", line = 119)
    public final void method348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class570 arg6, int arg7, int arg8) {
        this.method2510(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V", line = 122)
    public final void method1268(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)V", line = 125)
    public final void method1261(int arg0, int arg1) throws class556 {
        if (this.field6023 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field6023.method845(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z", line = 135)
    private final boolean method2505(short arg0) {
        synchronized (this) {
            class569 var3 = super.field7764.method1774(65, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method2515(arg0, var3.field8071, var3.field8072, var3.field8079, var3.field8065, var3.field8080, var3.field8067, var3.field8069, var3.field8077, var3.field8058, var3.field8066, var3.field8062, var3.field8068, var3.field8076, var3.field8063, var3.field8078, var3.field8061, var3.field8070, var3.field8059, var3.field8074);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 145)
    public final void method275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ltc;)V", line = 148)
    public final void method244(class73 arg0) {
        this.field6021 = arg0;
        this.method2516(((class132) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z", line = 152)
    public final boolean method370() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z", line = 158)
    public final boolean method392() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V", line = 520)
    public class406(Canvas arg0, class267 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class541.method3169("sw3d", -72)) {
                throw new RuntimeException("");
            } else {
                class389.method2432(0);
                this.method2507(super.field7764, 0, 0);
                class614.method3506(true, (byte) 80, false);
                this.field6028 = true;
                this.field6022 = new class132();
                this.method244(new class132());
                this.method322(1);
                this.method229(0);
                if (arg0 != null) {
                    this.method308(arg0, arg2, arg3);
                    this.method317(arg0);
                }
            }
        } catch (Throwable var5) {
            this.method3190((byte) 121);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()Z", line = 167)
    public final boolean method1292() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V", line = 174)
    private final void method2506() {
        System.gc();
        System.runFinalization();
        class389.method2429(-1);
    }

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()V", line = 180)
    public final void method1274() {
        this.method317(this.field6023.field1525);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)Lhu;", line = 184)
    public final class224 method1288(int arg0, int arg1) {
        return this.method406(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z", line = 187)
    public final boolean method218() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lpea;)V", line = 197)
    public final void method1340(class456 arg0) {
        class587 var2 = (class587) arg0;
        this.method2503(var2.field8285.nativeid, var2.field8284.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V", line = 204)
    public final void method280(int[] arg0) {
        Dimension var2 = this.field6023.field1525.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lit;", line = 209)
    public final class34 method231(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class307(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()V", line = 211)
    public final void method1285() {
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z", line = 214)
    public final boolean method379() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lmp;I)V", line = 217)
    public final void method380(class315 arg0, int arg1) {
        this.method2504(arg0, false);
        this.method2509().method1226(this, field6013, field6012, field6011, field6010, arg0.field4735.method1459(4));
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lgu;Z)Lit;", line = 222)
    public final class34 method310(class726 arg0, boolean arg1) {
        class307 var3 = new class307(this, arg0.field10183, arg0.field10181, arg0.field10185, 0, arg0.field10184, arg0.field10184, arg0.field10186);
        var3.method185(arg0.field10179, arg0.field10182, arg0.field10187, arg0.field10180);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lvt;)V", line = 230)
    public final void method339(int arg0, class759[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field6017[var3++] = arg1[var4].method4228(-119);
            field6017[var3++] = arg1[var4].method4221((byte) -7);
            field6017[var3++] = arg1[var4].method4223((byte) -51);
            field6017[var3++] = arg1[var4].method4224((byte) 127);
            field6016[var4] = arg1[var4].method4226(5);
            field6017[var3++] = arg1[var4].method4227(false);
        }
        this.method2517(arg0, field6017, field6016);
    }

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()V", line = 248)
    public final void method427() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;", line = 253)
    public final class570 method282(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class276(this, this.field6019, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()La;", line = 258)
    public final class163 method2509() {
        for (int var1 = 0; var1 < this.field6027; ++var1) {
            if (this.field6026[var1].field2526 == Thread.currentThread()) {
                return this.field6026[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 269)
    public final void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class570 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 272)
    public final void method317(Canvas arg0) {
        if (arg0 != null) {
            class102 var2 = (class102) this.field6024.method3512(true, (long) arg0.hashCode());
            this.field6023 = var2;
            this.method2513(var2);
        } else {
            this.field6023 = null;
            this.method2513((class102) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()Lqm;", line = 287)
    public final class429 method1308() {
        return new class429(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(II)Lwm;", line = 290)
    public final class28 method1276(int arg0, int arg1) {
        return new class600(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lvm;Lvm;FLvm;)Lvm;", line = 294)
    public final class72 method1242(class72 arg0, class72 arg1, float arg2, class72 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I", line = 298)
    public final int method351(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 308)
    public final void method1272(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class556 {
        if (this.field6023 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field6023.method844(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V", line = 318)
    public final void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method264(arg0, arg1, arg2, arg4, arg5);
        this.method264(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method292(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method292(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lb;IIII)Lka;", line = 325)
    public final class282 method301(class352 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class244(this, this.field6019, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z", line = 330)
    public final boolean method220() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 336)
    public final void method322(int arg0) {
        this.field6027 = arg0;
        this.field6026 = new class163[this.field6027];
        for (int var2 = 0; var2 < this.field6027; ++var2) {
            this.field6026[var2] = new class163(this, this.field6020, this.field6025);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lit;", line = 349)
    public final class34 method406(int arg0, int arg1, boolean arg2) {
        return new class307(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 353)
    public final void method361(Canvas arg0, int arg1, int arg2) {
        class102 var4 = (class102) this.field6024.method3512(true, (long) arg0.hashCode());
        var4.method840(arg0, arg1, arg2);
        if (arg0 != null && this.field6023.field1525 == arg0) {
            this.method317(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()V", line = 361)
    public final void method1258() {
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V", line = 364)
    public final void method295(int arg0) {
        this.field6020 = this.field6025 = arg0;
        if (this.field6027 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method322(this.field6027);
            this.method229(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()V", line = 371)
    public final void method1265() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lpia;[Lgu;Z)Lda;", line = 375)
    public final class400 method424(class54 arg0, class726[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field10184;
            var5[var7] = arg1[var7].field10186;
            if (arg1[var7].field10185 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class579(this, this.field6019, arg0, arg1, (class34[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class727(this, this.field6019, arg0, arg1, (class34[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V", line = 417)
    public final void method229(int arg0) {
        this.field6026[arg0].method1222();
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V", line = 419)
    public final void method1301(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIIII)Lvm;", line = 423)
    public final class72 method266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lvm;)V", line = 425)
    public final void method238(class72 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V", line = 427)
    public final void method354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 431)
    public final void method308(Canvas arg0, int arg1, int arg2) {
        class102 var4 = (class102) this.field6024.method3512(true, (long) arg0.hashCode());
        if (var4 == null) {
            try {
                Class var5 = Class.forName("java.awt.Canvas");
                Method var6 = var5.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class102 var7 = new class102(this, arg0, arg1, arg2);
            this.field6024.method3516(255, (long) arg0.hashCode(), var7);
        } else {
            if (var4.field1526 != arg1 || var4.field1523 != arg2) {
                var4.method840(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V", line = 457)
    public final void method283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2509().method1221(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z", line = 462)
    public final boolean method254() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z", line = 466)
    public final boolean method381() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 469)
    public final void method390(Canvas arg0) {
        if (this.field6023.field1525 == arg0) {
            this.method317((Canvas) null);
        }
        class102 var2 = (class102) this.field6024.method3512(true, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method636((byte) 97);
            var2.method842();
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V", line = 482)
    public final void method246(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lhu;Lwm;)Lpea;", line = 499)
    public final class456 method1344(class224 arg0, class28 arg1) {
        return new class587(this, (class307) arg0, (class600) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()Ltc;", line = 504)
    public final class73 method343() {
        return this.field6022;
    }

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;", line = 507)
    private final Object method2512() {
        return new class309(this);
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)Lza;", line = 511)
    public final class254 method260(int arg0) {
        class71 var2 = new class71(this, arg0);
        this.field6006.method3472(85, var2);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()Ltc;", line = 547)
    public final class73 method236() {
        return this.field6021;
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z", line = 551)
    public final boolean method320() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()Ltc;", line = 555)
    public final class73 method414() {
        return new class132();
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()V", line = 558)
    public final void method1338() {
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V", line = 564)
    protected final synchronized void finalize() {
        this.method3190((byte) 76);
        if (this.nativeid != 0L) {
            class389.method2431(this, -53);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 570)
    public final void method423(int arg0) {
        this.field6026[arg0].method1214();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lit;", line = 574)
    public final class34 method270(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class307(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V", line = 577)
    public final void method216(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()Z", line = 580)
    public final boolean method400() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V", line = 592)
    public final void method1281(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()V", line = 596)
    public final void method248() {
        if (!this.field6007) {
            this.field6026 = null;
            this.field6023 = null;
            this.field6019 = null;
            this.field6022 = null;
            this.field6024.method3517(-111);
            for (class71 var1 = (class71) this.field6006.method3463((byte) -50); var1 != null; var1 = (class71) this.field6006.method3469((byte) 107)) {
                var1.method657();
            }
            this.field6006.method3465(0);
            this.method2514();
            if (this.field6028) {
                class342.method2203(true, false, 5438);
                this.field6028 = false;
            }
            this.method2506();
            class389.method2430(false);
            this.field6007 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)V", line = 626)
    public final void method315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2502(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()I", line = 636)
    public final int method356() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method2501(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method352(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method1287();

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method2502(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method2503(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method350(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method294();

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method1278(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method249(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method5(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method288(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method332();

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method223(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method326(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method264(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method1262(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method1290(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method287(int arg0, class570 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method2507(class267 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method1328(int arg0);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method2508(int arg0);

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method217();

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method316(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method2510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class570 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method259(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method1273();

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method297(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method300();

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method395(int arg0);

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method355(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method2511(class254 arg0);

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method298(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method374();

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method2513(class102 arg0);

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method328(float arg0);

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method292(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method2514();

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method2515(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method377();

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method240(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method337(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method253(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method2516(long arg0);

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method2517(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method331(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method305();
}
