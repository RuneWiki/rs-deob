import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class530 extends class208 implements class28 {

    @OriginalMember(owner = "client!a", name = "p", descriptor = "Z")
    private boolean field7902 = false;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "Lbu;")
    private class19 field7903 = new class19();

    @OriginalMember(owner = "client!a", name = "E", descriptor = "I")
    private int field7917 = 4096;

    @OriginalMember(owner = "client!a", name = "I", descriptor = "I")
    private int field7921 = 4096;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "Llb;")
    private class465 field7920 = new class465(4);

    @OriginalMember(owner = "client!a", name = "L", descriptor = "Z")
    private boolean field7924 = false;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "Lm;")
    private class165 field7919;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "[I")
    private static int[] field7904 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!a", name = "w", descriptor = "[I")
    private static int[] field7909 = field7904;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "[S")
    private static short[] field7906 = new short[8191];

    @OriginalMember(owner = "client!a", name = "x", descriptor = "[I")
    public static int[] field7910 = new int[6];

    @OriginalMember(owner = "client!a", name = "u", descriptor = "[F")
    private static float[] field7907 = new float[20];

    @OriginalMember(owner = "client!a", name = "z", descriptor = "[I")
    public static int[] field7912 = field7904;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "[I")
    private static int[] field7908 = new int[8191];

    @OriginalMember(owner = "client!a", name = "s", descriptor = "[I")
    private static int[] field7905 = field7904;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "[I")
    private static int[] field7915 = new int[8191];

    @OriginalMember(owner = "client!a", name = "y", descriptor = "[B")
    private static byte[] field7911 = new byte[8191];

    @OriginalMember(owner = "client!a", name = "B", descriptor = "[F")
    private static float[] field7914 = field7907;

    @OriginalMember(owner = "client!a", name = "J", descriptor = "I")
    private int field7922;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "Lc;")
    private class160 field7913;

    @OriginalMember(owner = "client!a", name = "D", descriptor = "Lm;")
    private class165 field7916;

    @OriginalMember(owner = "client!a", name = "F", descriptor = "Lb;")
    private class280 field7918;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "[Lv;")
    private class497[] field7923;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lqm;Z)Lha;", line = 4)
    public final class53 method474(class126 arg0, boolean arg1) {
        int[] var3 = arg0.field1772;
        byte[] var4 = arg0.field1773;
        int var5 = arg0.field1767;
        int var6 = arg0.field1771;
        class53 var7;
        if (arg1 && arg0.field1769 == null) {
            var7 = new class256(this, this.field7913, var3, var4, 0, arg0.field1767, arg0.field1767, arg0.field1771);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field1769;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class425(this, this.field7913, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field1772[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class425(this, this.field7913, var9, 0, arg0.field1767, arg0.field1767, arg0.field1771);
                } else {
                    var7 = new class575(this, this.field7913, var9, 0, arg0.field1767, arg0.field1767, arg0.field1771);
                }
            }
        }
        var7.method324(arg0.field1766, arg0.field1770, arg0.field1765, arg0.field1768);
        return var7;
    }

    @OriginalMember(owner = "client!a", name = "h", descriptor = "()Z", line = 81)
    public final boolean method486() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "()Z", line = 84)
    public final boolean method508() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lr;Lrd;Lm;Lpr;I)V", line = 88)
    public final void method511(class159 arg0, class283 arg1, class165 arg2, class381 arg3, int arg4) {
        this.method3192(arg1, true);
        if (arg3 == null) {
            this.method3202().method2966(this, arg0, arg2, (int[]) null, arg4, field7905, field7908, field7915, field7906, field7911, arg1.field3959.method1244(-21363), field7912);
        } else {
            field7910[5] = 0;
            this.method3202().method2966(this, arg0, arg2, field7910, arg4, field7905, field7908, field7915, field7906, field7911, arg1.field3959.method1244(-21363), field7912);
            arg3.field5243 = field7910[0];
            arg3.field5245 = field7910[1];
            arg3.field5246 = field7910[2];
            arg3.field5242 = field7910[3];
            arg3.field5244 = field7910[4];
            arg3.field5247 = field7910[5] != 0;
        }
        class12 var6 = (class12) arg0;
        var6.method59(0, arg2);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIII)V", line = 108)
    public final void method445(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method432(arg0, arg1, arg2, arg4, arg5);
        this.method432(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method446(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method446(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 114)
    public final void method529(Rectangle[] arg0, int arg1) throws class416 {
        if (this.field7918 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field7918.method1748(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II[I[I)Lpa;", line = 124)
    public final class311 method526(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class181(this, this.field7913, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "p", descriptor = "()Z", line = 128)
    public final boolean method434() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "z", descriptor = "()Z", line = 131)
    public final boolean method471() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V", line = 136)
    public final void method460(boolean arg0) {
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lfd;IIII)Lr;", line = 141)
    public final class159 method491(class451 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class12(this, this.field7913, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lrd;Z)V", line = 145)
    private final void method3192(class283 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class480 var8 = (class480) arg0.field3959.method1247(10884); var8 != null; var8 = (class480) arg0.field3959.method1250(4194303)) {
            field7905[var3++] = var8.field6826;
            field7905[var3++] = var8.field6824;
            field7905[var3++] = var8.field6815;
            field7908[var4++] = var8.field6825;
            field7906[var6++] = (short) var8.field6828;
            field7915[var5++] = var8.field6829;
            if (arg1) {
                field7911[var7++] = var8.field6817;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "g", descriptor = "()Z", line = 179)
    public final boolean method437() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(IIIIII)V", line = 184)
    public final void method481(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3191(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIZ)Lha;", line = 190)
    public final class53 method442(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class425(this, this.field7913, arg0, arg1, arg2, arg3) : new class575(this, this.field7913, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "()Z", line = 197)
    public final boolean method430() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "B", descriptor = "()Z", line = 200)
    public final boolean method499() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V", line = 203)
    public final void method504() {
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(FFF)V", line = 208)
    public final void method470(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I[Lnm;)V", line = 213)
    public final void method429(int arg0, class405[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field7909[var3++] = arg1[var4].method2388((byte) 44);
            field7909[var3++] = arg1[var4].method2383(2039035457);
            field7909[var3++] = arg1[var4].method2389(-10161);
            field7909[var3++] = arg1[var4].method2390(6042);
            field7914[var4] = arg1[var4].method2382(0);
            field7909[var3++] = arg1[var4].method2384(630);
        }
        this.method3204(arg0, field7909, field7914);
    }

    @OriginalMember(owner = "client!a", name = "x", descriptor = "()V", line = 230)
    public final void method485() {
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 236)
    public final void method444(Canvas arg0) {
        if (arg0 != null) {
            class280 var2 = (class280) this.field7920.method2799((long) arg0.hashCode(), true);
            this.field7918 = var2;
            this.method3198(var2);
        } else {
            this.field7918 = null;
            this.method3198((class280) null);
        }
    }

    @OriginalMember(owner = "client!a", name = "D", descriptor = "()Lm;", line = 251)
    public final class165 method522() {
        return new class363();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIILpa;II)V", line = 256)
    public final void method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class311 arg6, int arg7, int arg8) {
        this.method3196(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "k", descriptor = "()V", line = 261)
    public final void method433() {
    }

    @OriginalMember(owner = "client!a", name = "C", descriptor = "()Lm;", line = 264)
    public final class165 method428() {
        return this.field7919;
    }

    @OriginalMember(owner = "client!a", name = "r", descriptor = "()Z", line = 269)
    public final boolean method527() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "i", descriptor = "()I", line = 273)
    public final int method513() {
        return 4;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIIII)V", line = 276)
    public final void method523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([Lr;Lm;[Lpr;I)V", line = 279)
    public final void method507(class159[] arg0, class165 arg1, class381[] arg2, int arg3) {
        if (arg2 == null) {
            this.method3202().method2964(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class381 var5 = arg2[0];
            field7910[5] = 0;
            this.method3202().method2964(this, arg0, arg1, field7910, -1, arg3);
            var5.field5243 = field7910[0];
            var5.field5245 = field7910[1];
            var5.field5246 = field7910[2];
            var5.field5242 = field7910[3];
            var5.field5244 = field7910[4];
            var5.field5247 = field7910[5] != 0;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lrd;)V", line = 297)
    public final void method488(class283 arg0) {
        this.method3192(arg0, false);
        this.method3202().method2965(this, field7905, field7908, field7915, field7906, arg0.field3959.method1244(-21363));
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lqba;)V", line = 300)
    public final void method426(class345 arg0) {
    }

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "()Ljava/lang/Object;", line = 303)
    private final Object method3195() {
        return new class456(this);
    }

    @OriginalMember(owner = "client!a", name = "v", descriptor = "()V", line = 305)
    public final void method465() {
    }

    @OriginalMember(owner = "client!a", name = "A", descriptor = "()V", line = 311)
    public final void method493() throws class416 {
        if (this.field7918 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field7918.method1749();
        }
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V", line = 321)
    public final void method419(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()Z", line = 326)
    public final boolean method438() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "y", descriptor = "()Lcr;", line = 333)
    public final class493 method480() {
        return new class493(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!a", name = "h", descriptor = "(I)V", line = 337)
    public final void method502(int arg0) {
        this.field7922 = arg0;
        this.field7923 = new class497[this.field7922];
        for (int var2 = 0; var2 < this.field7922; ++var2) {
            this.field7923[var2] = new class497(this, this.field7921, this.field7917);
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(IIIIII)Lqba;", line = 351)
    public final class345 method424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;)V", line = 570)
    public class530(Canvas arg0, class17 arg1) {
        super(arg1);
        try {
            if (!class230.method1488(-97, "sw3d")) {
                throw new RuntimeException("");
            } else {
                class292.method1800(0);
                this.method3190(super.field3092, 0, 0);
                class582.method3473(false, true, -3);
                this.field7924 = true;
                this.field7919 = new class363();
                this.method483(new class363());
                this.method502(1);
                this.method459(0);
                if (arg0 != null) {
                    this.method515(arg0);
                    this.method444(arg0);
                }
            }
        } catch (Throwable var3) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 367)
    public final void method503(Canvas arg0) {
        class280 var2 = (class280) this.field7920.method2799((long) arg0.hashCode(), true);
        Dimension var3 = arg0.getSize();
        var2.method1754(arg0, var3.width, var3.height);
        if (arg0 != null && this.field7918.field3915 == arg0) {
            this.method444(arg0);
        }
    }

    @OriginalMember(owner = "client!a", name = "t", descriptor = "()Z", line = 376)
    public final boolean method497() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lu;)V", line = 379)
    public final void method448(class65 arg0) {
        this.field7913 = (class160) arg0;
        this.method3200(arg0);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V", line = 382)
    public final void method449(boolean arg0) {
    }

    @OriginalMember(owner = "client!a", name = "m", descriptor = "()Z", line = 387)
    public final boolean method530() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)V", line = 389)
    public final void method506(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([Lr;Lrd;Lm;[Lpr;I)V", line = 402)
    public final void method452(class159[] arg0, class283 arg1, class165 arg2, class381[] arg3, int arg4) {
        this.method3192(arg1, true);
        if (arg3 == null) {
            this.method3202().method2960(this, arg0, arg2, (int[]) null, arg4, field7905, field7908, field7915, field7906, field7911, arg1.field3959.method1244(-21363), field7912);
        } else {
            class381 var6 = arg3[0];
            field7910[5] = 0;
            this.method3202().method2960(this, arg0, arg2, field7910, arg4, field7905, field7908, field7915, field7906, field7911, arg1.field3959.method1244(-21363), field7912);
            var6.field5243 = field7910[0];
            var6.field5245 = field7910[1];
            var6.field5246 = field7910[2];
            var6.field5242 = field7910[3];
            var6.field5244 = field7910[4];
            var6.field5247 = field7910[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class12 var9 = (class12) arg0[var8];
                var9.method59(var7, arg2);
                if (var9.field113 != null) {
                    var7 += var9.field113.length * 9;
                }
                if (var9.field114 != null) {
                    var7 += var9.field114.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 448)
    public final void method461(int arg0) {
        this.field7923[arg0].method2973();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lm;)V", line = 451)
    public final void method483(class165 arg0) {
        this.field7916 = arg0;
        this.method3197(arg0);
    }

    @OriginalMember(owner = "client!a", name = "o", descriptor = "()V", line = 456)
    public final void method436() {
    }

    @OriginalMember(owner = "client!a", name = "s", descriptor = "()V", line = 462)
    public final void method501() {
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lqba;Lqba;FLqba;)Lqba;", line = 465)
    public final class345 method439(class345 arg0, class345 arg1, float arg2, class345 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 468)
    public final void method477(Canvas arg0) {
        if (this.field7918.field3915 == arg0) {
            this.method444((Canvas) null);
        }
        class280 var2 = (class280) this.field7920.method2799((long) arg0.hashCode(), true);
        if (var2 != null) {
            var2.method2457(-8422);
            var2.method1752();
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II[[I[[IIII)Lsa;", line = 483)
    public final class176 method458(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class235(this, this.field7913, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I", line = 487)
    public final int method478(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)I", line = 491)
    public final int method528(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!a", name = "WA", descriptor = "(S)Z", line = 497)
    private final boolean method3201(short arg0) {
        synchronized (this) {
            class471 var3 = super.field3092.method110(arg0, (byte) 124);
            if (var3 == null) {
                return false;
            } else {
                this.method3199(arg0, var3.field6660, var3.field6657, var3.field6658, var3.field6653, var3.field6640, var3.field6656, var3.field6661, var3.field6646, var3.field6642, var3.field6643, var3.field6655, var3.field6654);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "l", descriptor = "()Z", line = 509)
    public final boolean method423() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "E", descriptor = "()Lv;", line = 514)
    public final class497 method3202() {
        for (int var1 = 0; var1 < this.field7922; ++var1) {
            if (this.field7923[var1].field7056 == Thread.currentThread()) {
                return this.field7923[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([IIIII)Lha;", line = 531)
    public final class53 method466(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class425(this, this.field7913, arg0, arg1, arg2, arg3, arg4) : new class575(this, this.field7913, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class425(this, this.field7913, arg0, arg1, arg2, arg3, arg4) : new class575(this, this.field7913, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "u", descriptor = "()Z", line = 566)
    public final boolean method464() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V", line = 596)
    public final void method459(int arg0) {
        this.field7923[arg0].method2972();
    }

    @OriginalMember(owner = "client!a", name = "g", descriptor = "(I)Lu;", line = 601)
    public final class65 method455(int arg0) {
        class160 var2 = new class160(this, arg0);
        this.field7903.method131(var2, 0);
        return var2;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V", line = 610)
    public final void method473() {
        if (!this.field7902) {
            this.field7923 = null;
            this.field7918 = null;
            this.field7913 = null;
            this.field7919 = null;
            this.field7920.method2800(0);
            for (class160 var1 = (class160) this.field7903.method124((byte) 42); var1 != null; var1 = (class160) this.field7903.method120(-119)) {
                var1.method1148();
            }
            this.field7903.method122((byte) 14);
            this.method3203();
            if (this.field7924) {
                class437.method2550(true, false, 19357);
                this.field7924 = false;
            }
            this.method3205();
            class292.method1799((byte) -114);
            this.field7902 = true;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 645)
    public final void method515(Canvas arg0) {
        class280 var2 = (class280) this.field7920.method2799((long) arg0.hashCode(), true);
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class280 var5 = new class280(this, arg0);
            this.field7920.method2797(-4234, var5, (long) arg0.hashCode());
        }
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V", line = 666)
    public final void method484(int arg0) {
        class292.method1798(118);
        this.method3194(arg0);
        for (class160 var2 = (class160) this.field7903.method124((byte) 42); var2 != null; var2 = (class160) this.field7903.method120(-88)) {
            var2.method1150();
        }
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V", line = 682)
    protected final synchronized void finalize() {
        this.method1372(4);
        if (this.nativeid != 0L) {
            class292.method1797(-117, this);
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(Z)V", line = 688)
    public final void method495(boolean arg0) {
    }

    @OriginalMember(owner = "client!a", name = "q", descriptor = "()Z", line = 691)
    public final boolean method457() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "j", descriptor = "()Z", line = 698)
    public final boolean method487() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "XA", descriptor = "()V", line = 704)
    private final void method3205() {
        System.gc();
        System.runFinalization();
        class292.method1798(90);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIII)V", line = 712)
    public final void method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3202().method2971(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!a", name = "GA", descriptor = "(S)Z", line = 716)
    private final boolean method3206(short arg0) {
        class17 var2 = super.field3092;
        synchronized (super.field3092) {
            if (!super.field3092.method109(arg0, 1680)) {
                return false;
            } else {
                class471 var4 = super.field3092.method110(arg0, (byte) 114);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (!var4.field6645) {
                        var6 = super.field3092.method113(128, true, -4074, 128, 0.7F, arg0);
                    } else {
                        var6 = super.field3092.method111(128, true, 128, 6925, arg0, 0.7F);
                    }
                    this.method3193(arg0, var4.field6660, var4.field6657, var4.field6658, var4.field6653, var4.field6640, var4.field6656, var4.field6661, var4.field6646, var4.field6642, var4.field6643, var4.field6655, var4.field6654, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIF)Lnm;", line = 748)
    public final class405 method469(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class237(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Llg;[Lqm;Z)Lra;", line = 756)
    public final class92 method492(class352 arg0, class126[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field1767;
            var5[var7] = arg1[var7].field1771;
            if (arg1[var7].field1769 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class250(this, this.field7913, arg0, arg1, (class53[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class233(this, this.field7913, arg0, arg1, (class53[]) null);
        }
    }

    @OriginalMember(owner = "client!a", name = "JA", descriptor = "(IIII)V")
    public final native void method453(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "F", descriptor = "(IIII)V")
    public final native void method512(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "Y", descriptor = "(Ln;II)V")
    private final native void method3190(class17 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!a", name = "P", descriptor = "()F")
    public final native float method450();

    @OriginalMember(owner = "client!a", name = "xa", descriptor = "()V")
    public final native void method440();

    @OriginalMember(owner = "client!a", name = "t", descriptor = "(IIIIII)V")
    private final native void method3191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "m", descriptor = "(IFFFFF)V")
    public final native void method520(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!a", name = "ra", descriptor = "()F")
    public final native float method472();

    @OriginalMember(owner = "client!a", name = "za", descriptor = "(IIIIII[BII)V")
    public final native void method517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "A", descriptor = "(IIIII)V")
    public final native void method482(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()I")
    public final native int method524();

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(IIII)V")
    public final native void method516(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(I)V")
    public final native void method421(int arg0);

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(IIIII)V")
    public final native void method432(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "G", descriptor = "(ILpa;II)V")
    public final native void method462(int arg0, class311 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(IIIIII)V")
    public final native void method498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "B", descriptor = "(IIIIII)Z")
    public final native boolean method496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "h", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method3193(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!a", name = "q", descriptor = "(IIII)V")
    public final native void method443(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(I)V")
    private final native void method3194(int arg0);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(IIIII)V")
    public final native void method446(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "YA", descriptor = "()I")
    public final native int method420();

    @OriginalMember(owner = "client!a", name = "U", descriptor = "()I")
    public final native int method454();

    @OriginalMember(owner = "client!a", name = "IA", descriptor = "(III[I)V")
    public final native void method475(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!a", name = "n", descriptor = "()V")
    public final native void method479();

    @OriginalMember(owner = "client!a", name = "L", descriptor = "(I)V")
    public final native void method463(int arg0);

    @OriginalMember(owner = "client!a", name = "v", descriptor = "(IIII)[I")
    public final native int[] method456(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "la", descriptor = "(FF)V")
    public final native void method422(float arg0, float arg1);

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(II)V")
    public final native void method451(int arg0, int arg1);

    @OriginalMember(owner = "client!a", name = "ca", descriptor = "(IIIIIILpa;II)V")
    private final native void method3196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class311 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(III)V")
    public final native void method489(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!a", name = "TA", descriptor = "(Lm;)V")
    private final native void method3197(class165 arg0);

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(F)V")
    public final native void method500(float arg0);

    @OriginalMember(owner = "client!a", name = "MA", descriptor = "(Lb;)V")
    private final native void method3198(class280 arg0);

    @OriginalMember(owner = "client!a", name = "RA", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method3199(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!a", name = "ea", descriptor = "(Lu;)V")
    private final native void method3200(class65 arg0);

    @OriginalMember(owner = "client!a", name = "NA", descriptor = "(Z)V")
    public final native void method63(boolean arg0);

    @OriginalMember(owner = "client!a", name = "CA", descriptor = "()I")
    public final native int method435();

    @OriginalMember(owner = "client!a", name = "d", descriptor = "([I)V")
    public final native void method431(int[] arg0);

    @OriginalMember(owner = "client!a", name = "w", descriptor = "()V")
    private final native void method3203();

    @OriginalMember(owner = "client!a", name = "N", descriptor = "(IIII)V")
    public final native void method510(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "oa", descriptor = "(I[I[F)V")
    private final native void method3204(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!a", name = "ba", descriptor = "()I")
    public final native int method525();
}
