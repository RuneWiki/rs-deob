import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class163 extends class38 implements class103 {

    @OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "Lpk;")
    private class133 field2296 = new class133();

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "I")
    private int field2305 = 4096;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
    private int field2302 = 4096;

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "Lib;")
    private class106 field2314 = new class106(4);

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "Z")
    private boolean field2315 = false;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "Lc;")
    private class122 field2303;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "[I")
    private static int[] field2295 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field2300 = Boolean.FALSE;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "[I")
    public static int[] field2298 = new int[6];

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "[I")
    private static int[] field2301 = field2295;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "[I")
    private static int[] field2299 = new int[8191];

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "[I")
    public static int[] field2307 = field2295;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "[I")
    private static int[] field2304 = new int[8191];

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "[B")
    private static byte[] field2306 = new byte[8191];

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "[I")
    private static int[] field2312 = field2295;

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "[S")
    private static short[] field2309 = new short[8191];

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "[F")
    private static float[] field2308 = new float[20];

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "[F")
    private static float[] field2313 = field2308;

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "I")
    private int field2316;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "Lza;")
    private class285 field2311;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "Lna;")
    private class35 field2297;

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2310;

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "[Ln;")
    private class15[] field2317;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lma;", line = 4)
    public final class10 method355(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class137(this, this.field2297, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 9)
    public final void method363(Rectangle[] arg0, int arg1) {
        int var3 = 0;
        while (var3 < 9) {
            try {
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        synchronized (this.field2310.getTreeLock()) {
                            this.field2311.method1816(var5.x, var5.y, var5.width, var5.height);
                        }
                    }
                }
                return;
            } catch (Exception var12) {
                class213.method1462(200L, -5184);
                ++var3;
            }
        }
        for (int var7 = 0; var7 < arg1; ++var7) {
            Rectangle var8 = arg0[var7];
            if (var8.width > 0 && var8.height > 0) {
                synchronized (this.field2310.getTreeLock()) {
                    this.field2311.method1816(var8.x, var8.y, var8.width, var8.height);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lmc;Z)V", line = 57)
    private final void method1145(class88 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class26 var8 = (class26) arg0.field1190.method2292(50); var8 != null; var8 = (class26) arg0.field1190.method2289(true)) {
            field2312[var3++] = var8.field305;
            field2312[var3++] = var8.field316;
            field2312[var3++] = var8.field312;
            field2304[var4++] = var8.field311;
            field2309[var6++] = (short) var8.field317;
            field2299[var5++] = var8.field306;
            if (arg1) {
                field2306[var7++] = var8.field309;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lbb;Z)Ll;", line = 90)
    public final class16 method389(class218 arg0, boolean arg1) {
        int[] var3 = arg0.field3144;
        byte[] var4 = arg0.field3141;
        int var5 = arg0.field3140;
        int var6 = arg0.field3139;
        class16 var7;
        if (arg1 && arg0.field3145 == null) {
            var7 = new class395(this, this.field2297, var3, var4, 0, arg0.field3140, arg0.field3140, arg0.field3139);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field3145;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class71(this, this.field2297, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field3144[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class71(this, this.field2297, var9, 0, arg0.field3140, arg0.field3140, arg0.field3139);
                } else {
                    var7 = new class414(this, this.field2297, var9, 0, arg0.field3140, arg0.field3140, arg0.field3139);
                }
            }
        }
        var7.method113(arg0.field3142, arg0.field3146, arg0.field3143, arg0.field3147);
        return var7;
    }

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "()Lc;", line = 164)
    public final class122 method341() {
        return new class31();
    }

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "()V", line = 166)
    public final void method396() {
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V", line = 174)
    public final void method317(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIIIII)V", line = 177)
    public final void method397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method391(arg0, arg1, arg2, arg4, arg5);
        this.method391(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method310(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method310(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Ll;", line = 186)
    public final class16 method349(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class71(this, this.field2297, arg0, arg1, arg2, arg3) : new class414(this, this.field2297, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "()Z", line = 193)
    public final boolean method312() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z", line = 199)
    public final boolean method318() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V", line = 202)
    public final void method315(boolean arg0) {
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lta;", line = 208)
    public final class142 method374(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class42(this, this.field2297, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 212)
    public final void method304(Canvas arg0) {
        class285 var2 = (class285) this.field2314.method875((long) arg0.hashCode(), 127);
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class285 var5 = new class285(this, arg0);
            this.field2314.method878((long) arg0.hashCode(), -2301, var5);
        }
    }

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "()I", line = 231)
    public final int method322() {
        return 4;
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "()Z", line = 237)
    public final boolean method298() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "()Z", line = 244)
    public final boolean method377() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V", line = 248)
    protected final void finalize() {
        this.method101();
    }

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "()Z", line = 256)
    public final boolean method326() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "()Z", line = 260)
    public final boolean method348() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Ll;", line = 264)
    public final class16 method330(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class71(this, this.field2297, arg0, arg1, arg2, arg3, arg4) : new class414(this, this.field2297, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class71(this, this.field2297, arg0, arg1, arg2, arg3, arg4) : new class414(this, this.field2297, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "()V", line = 298)
    public final void method350() {
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lt;Lmc;Lc;[Lmi;I)V", line = 301)
    public final void method376(class471[] arg0, class88 arg1, class122 arg2, class341[] arg3, int arg4) {
        this.method1145(arg1, true);
        if (arg3 == null) {
            this.method1159().method102(this, arg0, arg2, (int[]) null, arg4, field2312, field2304, field2299, field2309, field2306, arg1.field1190.method2293(-75), field2307);
        } else {
            class341 var6 = arg3[0];
            field2298[5] = 0;
            this.method1159().method102(this, arg0, arg2, field2298, arg4, field2312, field2304, field2299, field2309, field2306, arg1.field1190.method2293(64), field2307);
            var6.field4728 = field2298[0];
            var6.field4726 = field2298[1];
            var6.field4730 = field2298[2];
            var6.field4727 = field2298[3];
            var6.field4731 = field2298[4];
            var6.field4729 = field2298[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class43 var9 = (class43) arg0[var8];
                var9.method474(var7, arg2);
                if (var9.field494 != null) {
                    var7 += var9.field494.length * 9;
                }
                if (var9.field493 != null) {
                    var7 += var9.field493.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)V", line = 343)
    public final void method387(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILma;II)V", line = 346)
    public final void method357(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class10 arg6, int arg7, int arg8) {
        this.method1146(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()Z", line = 350)
    public final boolean method297() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V", line = 359)
    public final void method344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 363)
    public final void method301(int arg0) {
        class260.method1671(true);
        this.method1148(arg0);
        for (class35 var2 = (class35) this.field2296.method1018(115); var2 != null; var2 = (class35) this.field2296.method1022((byte) -112)) {
            var2.method274();
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I", line = 376)
    public final int method351(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V", line = 379)
    public final void method290(boolean arg0) {
    }

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "()Z", line = 383)
    public final boolean method303() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V", line = 390)
    public final void method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1159().method100(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "()V", line = 392)
    public final void method347() {
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()V", line = 398)
    public final void method292() {
        for (class35 var1 = (class35) this.field2296.method1018(89); var1 != null; var1 = (class35) this.field2296.method1022((byte) -112)) {
            var1.method275();
        }
        this.field2296.method1016(-90);
        this.method1147();
        if (this.field2315) {
            class176.method1236(false, 478210754, true);
            this.field2315 = false;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)Ltb;", line = 415)
    public final class274 method334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I", line = 420)
    public final int method335(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lga;Let;)V", line = 672)
    public class163(int arg0, Canvas arg1, class277 arg2, class419 arg3) {
        super(arg0, arg2);
        try {
            if (!field2300) {
                if (arg3 != null) {
                    arg3.method2563(this.getClass(), 83);
                    field2300 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("sw3d");
                    field2300 = Boolean.TRUE;
                }
            }
            if (!field2300) {
                throw new RuntimeException("");
            } else {
                this.method1153(super.field425, 0, 0);
                class281.method1798(false, false, true);
                this.field2315 = true;
                if (arg1 != null) {
                    this.method304(arg1);
                    this.method307(arg1);
                }
                this.field2303 = new class31();
                this.method308(new class31());
                this.method353(1);
                this.method340(0);
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z", line = 433)
    public final boolean method323() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lvp;)V", line = 437)
    public final void method291(int arg0, class124[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field2301[var3++] = arg1[var4].method980(false);
            field2301[var3++] = arg1[var4].method981((byte) 27);
            field2301[var3++] = arg1[var4].method983((byte) -96);
            field2301[var3++] = arg1[var4].method984(116);
            field2313[var4] = arg1[var4].method979(false);
            field2301[var3++] = arg1[var4].method982((byte) -117);
        }
        this.method1150(arg0, field2301, field2313);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lt;Lc;[Lmi;I)V", line = 455)
    public final void method388(class471[] arg0, class122 arg1, class341[] arg2, int arg3) {
        if (arg2 == null) {
            this.method1159().method91(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class341 var5 = arg2[0];
            field2298[5] = 0;
            this.method1159().method91(this, arg0, arg1, field2298, -1, arg3);
            var5.field4728 = field2298[0];
            var5.field4726 = field2298[1];
            var5.field4730 = field2298[2];
            var5.field4727 = field2298[3];
            var5.field4731 = field2298[4];
            var5.field4729 = field2298[5] != 0;
        }
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 475)
    public final void method338(Canvas arg0) {
        class285 var2 = (class285) this.field2314.method875((long) arg0.hashCode(), 127);
        Dimension var3 = arg0.getSize();
        var2.method1818(arg0, var3.width, var3.height);
        if (arg0 != null && this.field2310 == arg0) {
            this.method307(arg0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "()Z", line = 484)
    public final boolean method378() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lt;Lmc;Lc;Lmi;I)V", line = 487)
    public final void method324(class471 arg0, class88 arg1, class122 arg2, class341 arg3, int arg4) {
        this.method1145(arg1, true);
        if (arg3 == null) {
            this.method1159().method97(this, arg0, arg2, (int[]) null, arg4, field2312, field2304, field2299, field2309, field2306, arg1.field1190.method2293(-77), field2307);
        } else {
            field2298[5] = 0;
            this.method1159().method97(this, arg0, arg2, field2298, arg4, field2312, field2304, field2299, field2309, field2306, arg1.field1190.method2293(52), field2307);
            arg3.field4728 = field2298[0];
            arg3.field4726 = field2298[1];
            arg3.field4730 = field2298[2];
            arg3.field4727 = field2298[3];
            arg3.field4731 = field2298[4];
            arg3.field4729 = field2298[5] != 0;
        }
        class43 var6 = (class43) arg0;
        var6.method474(0, arg2);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lmc;)V", line = 508)
    public final void method345(class88 arg0) {
        this.method1145(arg0, false);
        this.method1159().method94(this, field2312, field2304, field2299, field2309, arg0.field1190.method2293(103));
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V", line = 513)
    public final void method289() {
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V", line = 518)
    public final void method369(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lvp;", line = 521)
    public final class124 method392(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class87(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V", line = 527)
    public final void method340(int arg0) {
        this.field2317[arg0].method103();
    }

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "()V", line = 532)
    public final void method302() {
        int var1 = 0;
        while (var1 < 9) {
            try {
                synchronized (this.field2310.getTreeLock()) {
                    this.field2311.method1819();
                    return;
                }
            } catch (Exception var6) {
                class213.method1462(200L, -5184);
                ++var1;
            }
        }
        synchronized (this.field2310.getTreeLock()) {
            this.field2311.method1819();
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ltb;)V", line = 558)
    public final void method359(class274 arg0) {
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V", line = 561)
    public final void method353(int arg0) {
        this.field2316 = arg0;
        this.field2317 = new class15[this.field2316];
        for (int var2 = 0; var2 < this.field2316; ++var2) {
            this.field2317[var2] = new class15(this, this.field2302, this.field2305);
        }
    }

    @OriginalMember(owner = "client!qa", name = "SA", descriptor = "()Ljava/lang/Object;", line = 575)
    private final Object method1156() {
        return new class145();
    }

    @OriginalMember(owner = "client!qa", name = "ha", descriptor = "()V", line = 578)
    private final void method1157() {
        System.gc();
        System.runFinalization();
        class260.method1671(true);
    }

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "()V", line = 582)
    public final void method331() {
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 585)
    public final void method307(Canvas arg0) {
        if (arg0 != null) {
            class285 var2 = (class285) this.field2314.method875((long) arg0.hashCode(), 126);
            this.field2310 = arg0;
            this.field2311 = var2;
            this.method1152(var2);
        } else {
            this.field2310 = null;
            this.field2311 = null;
            this.method1152((class285) null);
        }
    }

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "(S)Z", line = 603)
    private final boolean method1158(short arg0) {
        synchronized (this) {
            class104 var3 = super.field425.method1780(-31305, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method1154(arg0, var3.field1444, var3.field1438, var3.field1440, var3.field1439, var3.field1448, var3.field1445, var3.field1450, var3.field1443, var3.field1454, var3.field1441, var3.field1452, var3.field1453);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)Lu;", line = 615)
    public final class53 method354(int arg0) {
        class35 var2 = new class35(this, arg0);
        this.field2296.method1015(false, var2);
        return var2;
    }

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "()Z", line = 620)
    public final boolean method321() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z", line = 623)
    public final boolean method364() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V", line = 626)
    public final void method382(int arg0) {
        this.field2317[arg0].method96();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lu;)V", line = 629)
    public final void method299(class53 arg0) {
        this.field2297 = (class35) arg0;
        this.method1149(arg0);
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)V", line = 634)
    public final void method379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1151(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljq;IIII)Lt;", line = 637)
    public final class471 method314(class353 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class43(this, this.field2297, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "()Z", line = 640)
    public final boolean method356() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "()Lc;", line = 643)
    public final class122 method362() {
        return this.field2303;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lgt;[Lbb;Z)Lla;", line = 646)
    public final class314 method343(class316 arg0, class218[] arg1, boolean arg2) {
        return arg2 ? new class184(this, this.field2297, arg0, arg1, (class16[]) null) : new class329(this, this.field2297, arg0, arg1, (class16[]) null);
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(Z)V", line = 652)
    public final void method390(boolean arg0) {
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "()Z", line = 655)
    public final boolean method300() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 658)
    public final void method325(Canvas arg0) {
        if (this.field2310 == arg0) {
            this.method307((Canvas) null);
        }
        class285 var2 = (class285) this.field2314.method875((long) arg0.hashCode(), 127);
        if (var2 != null) {
            var2.method1525((byte) -78);
        }
        var2.method1817();
    }

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "()Ln;", line = 715)
    public final class15 method1159() {
        for (int var1 = 0; var1 < this.field2316; ++var1) {
            if (this.field2317[var1].field171 == Thread.currentThread()) {
                return this.field2317[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ltb;Ltb;FLtb;)Ltb;", line = 734)
    public final class274 method375(class274 arg0, class274 arg1, float arg2, class274 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!qa", name = "sa", descriptor = "(S)Z", line = 770)
    private final boolean method1160(short arg0) {
        class277 var2 = super.field425;
        synchronized (super.field425) {
            if (!super.field425.method1776(arg0, 19378)) {
                return false;
            } else {
                class104 var4 = super.field425.method1780(-31305, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field1439 && var4.field1440) {
                        var6 = super.field425.method1777(true, 5754, arg0, 0.7F, 128, 128);
                    } else {
                        var6 = super.field425.method1779(true, arg0, false, 0.7F, 128, 128);
                    }
                    this.method1155(arg0, var4.field1444, var4.field1438, var4.field1440, var4.field1439, var4.field1448, var4.field1445, var4.field1450, var4.field1443, var4.field1454, var4.field1441, var4.field1452, var4.field1453, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "()Z", line = 804)
    public final boolean method311() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "ea", descriptor = "(Lc;)V")
    public final native void method308(class122 arg0);

    @OriginalMember(owner = "client!qa", name = "AA", descriptor = "(IIII)V")
    public final native void method295(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "(IIIIIILma;II)V")
    private final native void method1146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class10 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
    public final native void method391(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "NA", descriptor = "(IIIII)V")
    public final native void method329(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "(IIII)V")
    public final native void method394(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "DA", descriptor = "(IIIIII[BII)V")
    public final native void method373(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "FA", descriptor = "()V")
    private final native void method1147();

    @OriginalMember(owner = "client!qa", name = "ia", descriptor = "(II)V")
    public final native void method346(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "ca", descriptor = "(ILma;II)V")
    public final native void method358(int arg0, class10 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "xa", descriptor = "()F")
    public final native float method361();

    @OriginalMember(owner = "client!qa", name = "UA", descriptor = "(III)V")
    public final native void method368(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "()F")
    public final native float method395();

    @OriginalMember(owner = "client!qa", name = "MA", descriptor = "(I)V")
    public final native void method360(int arg0);

    @OriginalMember(owner = "client!qa", name = "ma", descriptor = "(I)V")
    private final native void method1148(int arg0);

    @OriginalMember(owner = "client!qa", name = "OA", descriptor = "(IIII)V")
    public final native void method380(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "(Lu;)V")
    private final native void method1149(class53 arg0);

    @OriginalMember(owner = "client!qa", name = "za", descriptor = "(I[I[F)V")
    private final native void method1150(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!qa", name = "fa", descriptor = "(IIII)V")
    public final native void method306(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "()V")
    public final native void method339();

    @OriginalMember(owner = "client!qa", name = "RA", descriptor = "(IIIIII)V")
    private final native void method1151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "IA", descriptor = "()I")
    public final native int method320();

    @OriginalMember(owner = "client!qa", name = "PA", descriptor = "(Lza;)V")
    private final native void method1152(class285 arg0);

    @OriginalMember(owner = "client!qa", name = "TA", descriptor = "(IIIII)V")
    public final native void method310(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "YA", descriptor = "()I")
    public final native int method309();

    @OriginalMember(owner = "client!qa", name = "EA", descriptor = "()V")
    public final native void method101();

    @OriginalMember(owner = "client!qa", name = "GA", descriptor = "(IIII)V")
    public final native void method352(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "(Lga;II)V")
    private final native void method1153(class277 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "(I)V")
    public final native void method381(int arg0);

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "(III[I)V")
    public final native void method372(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(FF)V")
    public final native void method319(float arg0, float arg1);

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "(F)V")
    public final native void method293(float arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()I")
    public final native int method383();

    @OriginalMember(owner = "client!qa", name = "ZA", descriptor = "()I")
    public final native int method342();

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "()V")
    public final native void method328();

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "(IFFFFF)V")
    public final native void method305(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "aa", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method1154(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!qa", name = "da", descriptor = "([I)V")
    public final native void method332(int[] arg0);

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method1155(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "(IIII)[I")
    public final native int[] method393(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "JA", descriptor = "(IIIIII)Z")
    public final native boolean method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "(IIIIII)V")
    public final native void method386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "()I")
    public final native int method327();
}
