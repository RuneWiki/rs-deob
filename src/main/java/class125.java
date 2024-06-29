import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class125 extends class167 implements class416 {

    @OriginalMember(owner = "client!c", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "Z")
    private boolean field1947 = false;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "Lgw;")
    private class118 field1948 = new class118();

    @OriginalMember(owner = "client!c", name = "J", descriptor = "I")
    private int field1964 = 4096;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    private int field1965 = 4096;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "Lhl;")
    private class375 field1962 = new class375(4);

    @OriginalMember(owner = "client!c", name = "M", descriptor = "Z")
    private boolean field1967 = false;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "Ln;")
    private class15 field1963;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
    private static int[] field1949 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!c", name = "w", descriptor = "[F")
    private static float[] field1951 = new float[20];

    @OriginalMember(owner = "client!c", name = "x", descriptor = "[B")
    private static byte[] field1952 = new byte[8191];

    @OriginalMember(owner = "client!c", name = "z", descriptor = "[F")
    private static float[] field1954 = field1951;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "[I")
    private static int[] field1957 = new int[8191];

    @OriginalMember(owner = "client!c", name = "A", descriptor = "[I")
    private static int[] field1955 = new int[8191];

    @OriginalMember(owner = "client!c", name = "D", descriptor = "[I")
    private static int[] field1958 = field1949;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "[S")
    private static short[] field1959 = new short[8191];

    @OriginalMember(owner = "client!c", name = "v", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field1950 = Boolean.FALSE;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "[I")
    public static int[] field1960 = field1949;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
    public static int[] field1953 = new int[6];

    @OriginalMember(owner = "client!c", name = "B", descriptor = "[I")
    private static int[] field1956 = field1949;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "I")
    private int field1969;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "Lca;")
    private class204 field1966;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "Lk;")
    private class404 field1961;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "[Lwa;")
    private class443[] field1968;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lw;)V", line = 3)
    public final void method299(class200 arg0) {
        this.field1961 = (class404) arg0;
        this.method919(arg0);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(FFF)V", line = 6)
    public final void method247(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II[[I[[IIII)Lo;", line = 9)
    public final class24 method223(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class43(this, this.field1961, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "()Z", line = 13)
    public final boolean method346() {
        return true;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "()Z", line = 20)
    public final boolean method326() {
        return false;
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "()V", line = 23)
    public final void method280() {
        if (this.field1966 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field1966.method1412();
        }
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(IIIIII)V", line = 35)
    public final void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method925(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!c", name = "p", descriptor = "()V", line = 37)
    public final void method268() {
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ln;)V", line = 45)
    public final void method209(class15 arg0) {
        this.method924(arg0);
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(ILjava/awt/Canvas;Ll;Lul;)V", line = 672)
    public class125(int arg0, Canvas arg1, class16 arg2, class411 arg3) {
        super(arg0, arg2);
        try {
            if (!field1950) {
                if (arg3 != null) {
                    arg3.method2462((byte) -69, this.getClass());
                    field1950 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("sw3d");
                    field1950 = Boolean.TRUE;
                }
            }
            if (!field1950) {
                throw new RuntimeException("");
            } else {
                this.method931(super.field2505, 0, 0);
                class89.method660(0, false, true);
                this.field1967 = true;
                this.field1963 = new class187();
                this.method209(new class187());
                this.method317(1);
                this.method192(0);
                if (arg1 != null) {
                    this.method311(arg1);
                    this.method264(arg1);
                }
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 53)
    public final void method362(Canvas arg0) {
        class204 var2 = (class204) this.field1962.method2284(true, (long) arg0.hashCode());
        Dimension var3 = arg0.getSize();
        var2.method1408(arg0, var3.width, var3.height);
        if (arg0 != null && this.field1966.field3137 == arg0) {
            this.method264(arg0);
        }
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)V", line = 62)
    public final void method231(int arg0) {
        class493.method2892(105);
        this.method930(arg0);
        for (class404 var2 = (class404) this.field1948.method863(-1); var2 != null; var2 = (class404) this.field1948.method865(-1)) {
            var2.method2414();
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I[Lni;)V", line = 76)
    public final void method226(int arg0, class369[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field1956[var3++] = arg1[var4].method2264((byte) -62);
            field1956[var3++] = arg1[var4].method2262(6);
            field1956[var3++] = arg1[var4].method2261((byte) 96);
            field1956[var3++] = arg1[var4].method2260(true);
            field1954[var4] = arg1[var4].method2258((byte) 35);
            field1956[var3++] = arg1[var4].method2259(-68);
        }
        this.method923(arg0, field1956, field1954);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V", line = 96)
    public final void method213(int arg0) {
        this.field1968[arg0].method2620();
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()Z", line = 99)
    public final boolean method350() {
        return false;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lkv;)V", line = 104)
    public final void method294(class181 arg0) {
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIII)V", line = 107)
    public final void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method922().method2615(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(Z)V", line = 109)
    public final void method273(boolean arg0) {
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([Lka;Lwg;Ln;[Lwc;I)V", line = 112)
    public final void method274(class336[] arg0, class300 arg1, class15 arg2, class48[] arg3, int arg4) {
        this.method926(arg1, true);
        if (arg3 == null) {
            this.method922().method2619(this, arg0, arg2, (int[]) null, arg4, field1958, field1955, field1957, field1959, field1952, arg1.field4470.method28(-21544), field1960);
        } else {
            class48 var6 = arg3[0];
            field1953[5] = 0;
            this.method922().method2619(this, arg0, arg2, field1953, arg4, field1958, field1955, field1957, field1959, field1952, arg1.field4470.method28(-21544), field1960);
            var6.field907 = field1953[0];
            var6.field908 = field1953[1];
            var6.field906 = field1953[2];
            var6.field903 = field1953[3];
            var6.field905 = field1953[4];
            var6.field904 = field1953[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class160 var9 = (class160) arg0[var8];
                var9.method1132(var7, arg2);
                if (var9.field2452 != null) {
                    var7 += var9.field2452.length * 9;
                }
                if (var9.field2450 != null) {
                    var7 += var9.field2450.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "m", descriptor = "()Z", line = 154)
    public final boolean method187() {
        return true;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lkv;Lkv;FLkv;)Lkv;", line = 157)
    public final class181 method238(class181 arg0, class181 arg1, float arg2, class181 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!c", name = "A", descriptor = "()Ln;", line = 160)
    public final class15 method245() {
        return new class187();
    }

    @OriginalMember(owner = "client!c", name = "w", descriptor = "()Z", line = 163)
    public final boolean method354() {
        return false;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "()V", line = 166)
    public final void method283() {
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "()V", line = 171)
    public final void method241() {
    }

    @OriginalMember(owner = "client!c", name = "v", descriptor = "()Z", line = 174)
    public final boolean method236() {
        return false;
    }

    @OriginalMember(owner = "client!c", name = "h", descriptor = "()Z", line = 178)
    public final boolean method336() {
        return true;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 181)
    public final void method270(Canvas arg0) {
        if (this.field1966.field3137 == arg0) {
            this.method264((Canvas) null);
        }
        class204 var2 = (class204) this.field1962.method2284(true, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method421(22071);
            var2.method1406();
        }
    }

    @OriginalMember(owner = "client!c", name = "ZA", descriptor = "()V", line = 194)
    private final void method920() {
        System.gc();
        System.runFinalization();
        class493.method2892(75);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 199)
    public final void method198(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II)I", line = 204)
    public final int method217(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!c", name = "C", descriptor = "()Lwa;", line = 211)
    public final class443 method922() {
        for (int var1 = 0; var1 < this.field1969; ++var1) {
            if (this.field1968[var1].field6310 == Thread.currentThread()) {
                return this.field1968[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lch;IIII)Lka;", line = 229)
    public final class336 method225(class330 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class160(this, this.field1961, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V", line = 236)
    public final void method269(boolean arg0) {
    }

    @OriginalMember(owner = "client!c", name = "finalize", descriptor = "()V", line = 240)
    protected final synchronized void finalize() {
        this.method1197((byte) -48);
        if (this.nativeid != 0L) {
            class493.method2895(this, false);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 246)
    public final void method206(Rectangle[] arg0, int arg1) {
        if (this.field1966 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field1966.method1411(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIIIII)V", line = 256)
    public final void method259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(IIIIII)V", line = 265)
    public final void method327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method293(arg0, arg1, arg2, arg4, arg5);
        this.method293(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method324(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method324(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!c", name = "y", descriptor = "()Z", line = 271)
    public final boolean method340() {
        return true;
    }

    @OriginalMember(owner = "client!c", name = "u", descriptor = "()Ln;", line = 275)
    public final class15 method312() {
        return this.field1963;
    }

    @OriginalMember(owner = "client!c", name = "z", descriptor = "()Z", line = 278)
    public final boolean method182() {
        return true;
    }

    @OriginalMember(owner = "client!c", name = "x", descriptor = "()V", line = 281)
    public final void method316() {
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V", line = 291)
    public final void method317(int arg0) {
        this.field1969 = arg0;
        this.field1968 = new class443[this.field1969];
        for (int var2 = 0; var2 < this.field1969; ++var2) {
            this.field1968[var2] = new class443(this, this.field1964, this.field1965);
        }
    }

    @OriginalMember(owner = "client!c", name = "B", descriptor = "()I", line = 304)
    public final int method303() {
        return 4;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lwg;)V", line = 311)
    public final void method253(class300 arg0) {
        this.method926(arg0, false);
        this.method922().method2610(this, field1958, field1955, field1957, field1959, arg0.field4470.method28(-21544));
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIII)Lkv;", line = 315)
    public final class181 method218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([Lka;Ln;[Lwc;I)V", line = 319)
    public final void method323(class336[] arg0, class15 arg1, class48[] arg2, int arg3) {
        if (arg2 == null) {
            this.method922().method2613(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class48 var5 = arg2[0];
            field1953[5] = 0;
            this.method922().method2613(this, arg0, arg1, field1953, -1, arg3);
            var5.field907 = field1953[0];
            var5.field908 = field1953[1];
            var5.field906 = field1953[2];
            var5.field903 = field1953[3];
            var5.field905 = field1953[4];
            var5.field904 = field1953[5] != 0;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lgg;[Lho;Z)Lba;", line = 337)
    public final class269 method279(class119 arg0, class104[] arg1, boolean arg2) {
        return arg2 ? new class225(this, this.field1961, arg0, arg1, (class343[]) null) : new class480(this, this.field1961, arg0, arg1, (class343[]) null);
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "()Z", line = 344)
    public final boolean method292() {
        return false;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lho;Z)Laa;", line = 349)
    public final class343 method308(class104 arg0, boolean arg1) {
        int[] var3 = arg0.field1588;
        byte[] var4 = arg0.field1587;
        int var5 = arg0.field1590;
        int var6 = arg0.field1594;
        class343 var7;
        if (arg1 && arg0.field1589 == null) {
            var7 = new class351(this, this.field1961, var3, var4, 0, arg0.field1590, arg0.field1590, arg0.field1594);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field1589;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class35(this, this.field1961, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field1588[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class35(this, this.field1961, var9, 0, arg0.field1590, arg0.field1590, arg0.field1594);
                } else {
                    var7 = new class301(this, this.field1961, var9, 0, arg0.field1590, arg0.field1590, arg0.field1594);
                }
            }
        }
        var7.method375(arg0.field1592, arg0.field1595, arg0.field1593, arg0.field1591);
        return var7;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIF)Lni;", line = 429)
    public final class369 method334(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class374(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!c", name = "l", descriptor = "()V", line = 435)
    public final void method300() {
        if (!this.field1947) {
            this.field1968 = null;
            this.field1966 = null;
            this.field1961 = null;
            this.field1963 = null;
            this.field1962.method2286((byte) 19);
            for (class404 var1 = (class404) this.field1948.method863(-1); var1 != null; var1 = (class404) this.field1948.method865(-1)) {
                var1.method2412();
            }
            this.field1948.method861(-1);
            this.method916();
            if (this.field1967) {
                class86.method645(false, (byte) -74, true);
                this.field1967 = false;
            }
            this.method920();
            class493.method2893(3228);
            this.field1947 = true;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I", line = 467)
    public final int method252(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lwg;Z)V", line = 478)
    private final void method926(class300 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class197 var8 = (class197) arg0.field4470.method30((byte) -126); var8 != null; var8 = (class197) arg0.field4470.method26(1)) {
            field1958[var3++] = var8.field2874;
            field1958[var3++] = var8.field2882;
            field1958[var3++] = var8.field2876;
            field1955[var4++] = var8.field2875;
            field1959[var6++] = (short) var8.field2879;
            field1957[var5++] = var8.field2878;
            if (arg1) {
                field1952[var7++] = var8.field2873;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II[I[I)Li;", line = 509)
    public final class31 method224(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class109(this, this.field1961, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!c", name = "t", descriptor = "()Z", line = 512)
    public final boolean method329() {
        return true;
    }

    @OriginalMember(owner = "client!c", name = "i", descriptor = "()Z", line = 515)
    public final boolean method184() {
        return true;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V", line = 522)
    public final void method192(int arg0) {
        this.field1968[arg0].method2607();
    }

    @OriginalMember(owner = "client!c", name = "j", descriptor = "()Ljava/lang/Object;", line = 527)
    private final Object method927() {
        return new class105(this);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)V", line = 530)
    public final void method265(boolean arg0) {
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V", line = 533)
    public final void method251(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([IIIII)Laa;", line = 539)
    public final class343 method284(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class35(this, this.field1961, arg0, arg1, arg2, arg3, arg4) : new class301(this, this.field1961, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class35(this, this.field1961, arg0, arg1, arg2, arg3, arg4) : new class301(this, this.field1961, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)Lw;", line = 575)
    public final class200 method262(int arg0) {
        class404 var2 = new class404(this, arg0);
        this.field1948.method866((byte) 10, var2);
        return var2;
    }

    @OriginalMember(owner = "client!c", name = "k", descriptor = "(S)Z", line = 582)
    private final boolean method928(short arg0) {
        synchronized (this) {
            class39 var3 = super.field2505.method93((byte) 41, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method917(arg0, var3.field816, var3.field822, var3.field830, var3.field814, var3.field831, var3.field832, var3.field817, var3.field819, var3.field828, var3.field813, var3.field826, var3.field820);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "q", descriptor = "()V", line = 594)
    public final void method250() {
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 598)
    public final void method264(Canvas arg0) {
        if (arg0 != null) {
            class204 var2 = (class204) this.field1962.method2284(true, (long) arg0.hashCode());
            this.field1966 = var2;
            this.method915(var2);
        } else {
            this.field1966 = null;
            this.method915((class204) null);
        }
    }

    @OriginalMember(owner = "client!c", name = "n", descriptor = "()Z", line = 614)
    public final boolean method220() {
        return true;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 618)
    public final void method311(Canvas arg0) {
        class204 var2 = (class204) this.field1962.method2284(true, (long) arg0.hashCode());
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class204 var5 = new class204(this, arg0);
            this.field1962.method2292((long) arg0.hashCode(), var5, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!c", name = "k", descriptor = "()Z", line = 639)
    public final boolean method189() {
        return false;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lka;Lwg;Ln;Lwc;I)V", line = 650)
    public final void method332(class336 arg0, class300 arg1, class15 arg2, class48 arg3, int arg4) {
        this.method926(arg1, true);
        if (arg3 == null) {
            this.method922().method2606(this, arg0, arg2, (int[]) null, arg4, field1958, field1955, field1957, field1959, field1952, arg1.field4470.method28(-21544), field1960);
        } else {
            field1953[5] = 0;
            this.method922().method2606(this, arg0, arg2, field1953, arg4, field1958, field1955, field1957, field1959, field1952, arg1.field4470.method28(-21544), field1960);
            arg3.field907 = field1953[0];
            arg3.field908 = field1953[1];
            arg3.field906 = field1953[2];
            arg3.field903 = field1953[3];
            arg3.field905 = field1953[4];
            arg3.field904 = field1953[5] != 0;
        }
        class160 var6 = (class160) arg0;
        var6.method1132(0, arg2);
    }

    @OriginalMember(owner = "client!c", name = "wa", descriptor = "(S)Z", line = 715)
    private final boolean method929(short arg0) {
        class16 var2 = super.field2505;
        synchronized (super.field2505) {
            if (!super.field2505.method92(12624, arg0)) {
                return false;
            } else {
                class39 var4 = super.field2505.method93((byte) 71, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field814 && var4.field830) {
                        var6 = super.field2505.method94((byte) -54, 0.7F, true, 128, 128, arg0);
                    } else {
                        var6 = super.field2505.method91(128, true, 128, arg0, 0.7F, (byte) 26);
                    }
                    this.method918(arg0, var4.field816, var4.field822, var4.field830, var4.field814, var4.field831, var4.field832, var4.field817, var4.field819, var4.field828, var4.field813, var4.field826, var4.field820, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIZ)Laa;", line = 740)
    public final class343 method255(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class35(this, this.field1961, arg0, arg1, arg2, arg3) : new class301(this, this.field1961, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!c", name = "o", descriptor = "()Z", line = 747)
    public final boolean method318() {
        return false;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIILi;II)V", line = 750)
    public final void method228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class31 arg6, int arg7, int arg8) {
        this.method921(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!c", name = "ga", descriptor = "(Lca;)V")
    private final native void method915(class204 arg0);

    @OriginalMember(owner = "client!c", name = "I", descriptor = "()F")
    public final native float method272();

    @OriginalMember(owner = "client!c", name = "sa", descriptor = "()I")
    public final native int method237();

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IIII)V")
    public final native void method325(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "ja", descriptor = "()V")
    private final native void method916();

    @OriginalMember(owner = "client!c", name = "R", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method917(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!c", name = "A", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method918(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!c", name = "BA", descriptor = "(IIIII)V")
    public final native void method324(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!c", name = "l", descriptor = "(I)V")
    public final native void method233(int arg0);

    @OriginalMember(owner = "client!c", name = "xa", descriptor = "()I")
    public final native int method358();

    @OriginalMember(owner = "client!c", name = "ta", descriptor = "(Lw;)V")
    private final native void method919(class200 arg0);

    @OriginalMember(owner = "client!c", name = "ha", descriptor = "(III)V")
    public final native void method314(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "GA", descriptor = "(ILi;II)V")
    public final native void method322(int arg0, class31 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "da", descriptor = "(IIIIIILi;II)V")
    private final native void method921(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class31 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "()I")
    public final native int method338();

    @OriginalMember(owner = "client!c", name = "IA", descriptor = "(IIII)V")
    public final native void method185(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "la", descriptor = "(IFFFFF)V")
    public final native void method194(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!c", name = "h", descriptor = "(II)V")
    public final native void method306(int arg0, int arg1);

    @OriginalMember(owner = "client!c", name = "F", descriptor = "(I[I[F)V")
    private final native void method923(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!c", name = "p", descriptor = "([I)V")
    public final native void method246(int[] arg0);

    @OriginalMember(owner = "client!c", name = "s", descriptor = "()F")
    public final native float method212();

    @OriginalMember(owner = "client!c", name = "va", descriptor = "(Ln;)V")
    private final native void method924(class15 arg0);

    @OriginalMember(owner = "client!c", name = "H", descriptor = "()V")
    public final native void method179();

    @OriginalMember(owner = "client!c", name = "TA", descriptor = "(IIIIII)Z")
    public final native boolean method328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!c", name = "KA", descriptor = "(IIII)V")
    public final native void method203(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "na", descriptor = "()I")
    public final native int method197();

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(IIIII)V")
    public final native void method293(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!c", name = "r", descriptor = "()V")
    public final native void method305();

    @OriginalMember(owner = "client!c", name = "MA", descriptor = "(F)V")
    public final native void method331(float arg0);

    @OriginalMember(owner = "client!c", name = "LA", descriptor = "(IIIIII)V")
    private final native void method925(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!c", name = "U", descriptor = "()I")
    public final native int method360();

    @OriginalMember(owner = "client!c", name = "PA", descriptor = "(FF)V")
    public final native void method221(float arg0, float arg1);

    @OriginalMember(owner = "client!c", name = "S", descriptor = "(IIIII)V")
    public final native void method361(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!c", name = "N", descriptor = "(IIII)[I")
    public final native int[] method304(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "pa", descriptor = "()V")
    public final native void method382();

    @OriginalMember(owner = "client!c", name = "q", descriptor = "(IIII)V")
    public final native void method190(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "XA", descriptor = "(III[I)V")
    public final native void method359(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!c", name = "w", descriptor = "(IIII)V")
    public final native void method345(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "M", descriptor = "(IIIIII)V")
    public final native void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!c", name = "ba", descriptor = "(I)V")
    private final native void method930(int arg0);

    @OriginalMember(owner = "client!c", name = "ua", descriptor = "(IIIIII[BII)V")
    public final native void method335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!c", name = "K", descriptor = "(I)V")
    public final native void method351(int arg0);

    @OriginalMember(owner = "client!c", name = "OA", descriptor = "(Ll;II)V")
    private final native void method931(class16 arg0, int arg1, int arg2);
}
