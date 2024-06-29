import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class56 extends class635 implements class142 {

    @OriginalMember(owner = "client!da", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "Z")
    private boolean field578 = false;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "Lmfa;")
    private class562 field568 = new class562();

    @OriginalMember(owner = "client!da", name = "E", descriptor = "I")
    private int field582 = 4096;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "I")
    private int field586 = 4096;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "Ltq;")
    private class572 field585 = new class572(4);

    @OriginalMember(owner = "client!da", name = "J", descriptor = "Z")
    private boolean field587 = false;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "Lq;")
    private class389 field584;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "[I")
    private static int[] field569 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!da", name = "v", descriptor = "[I")
    public static int[] field573 = field569;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "[S")
    private static short[] field577 = new short[8191];

    @OriginalMember(owner = "client!da", name = "y", descriptor = "[I")
    private static int[] field576 = new int[8191];

    @OriginalMember(owner = "client!da", name = "t", descriptor = "[I")
    private static int[] field571 = field569;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "[I")
    public static int[] field575 = new int[6];

    @OriginalMember(owner = "client!da", name = "u", descriptor = "[I")
    private static int[] field572 = new int[8191];

    @OriginalMember(owner = "client!da", name = "B", descriptor = "[B")
    private static byte[] field579 = new byte[8191];

    @OriginalMember(owner = "client!da", name = "C", descriptor = "[F")
    private static float[] field580 = new float[20];

    @OriginalMember(owner = "client!da", name = "s", descriptor = "[I")
    private static int[] field570 = field569;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "[F")
    private static float[] field574 = field580;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "I")
    private int field589;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "Lq;")
    private class389 field581;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "Lv;")
    private class528 field583;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "La;")
    private class564 field567;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "[Lt;")
    private class611[] field588;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 3)
    public final void method273(Canvas arg0) {
        if (this.field583.field7534 == arg0) {
            this.method284((Canvas) null);
        }
        class528 var2 = (class528) this.field585.method3234((byte) -127, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method1519((byte) 121);
            var2.method3005();
        }
    }

    @OriginalMember(owner = "client!da", name = "r", descriptor = "()Z", line = 18)
    public final boolean method275() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "w", descriptor = "()Z", line = 21)
    public final boolean method276() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIZ)Lxa;", line = 27)
    public final class458 method279(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class444(this, this.field567, arg0, arg1, arg2, arg3) : new class251(this, this.field567, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()V", line = 33)
    public final void method280() {
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[[I[[IIII)Ld;", line = 37)
    public final class137 method282(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class49(this, this.field567, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ltg;)V", line = 40)
    public final void method283(class211 arg0) {
        this.method340(arg0, false);
        this.method364().method3418(this, field571, field572, field576, field577, arg0.field2558.method3121((byte) -123));
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 45)
    public final void method284(Canvas arg0) {
        if (arg0 != null) {
            class528 var2 = (class528) this.field585.method3234((byte) -88, (long) arg0.hashCode());
            this.field583 = var2;
            this.method379(var2);
        } else {
            this.field583 = null;
            this.method379((class528) null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 60)
    public final void method285(Rectangle[] arg0, int arg1) throws class295 {
        if (this.field583 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field583.method3004(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "(I)V", line = 74)
    public final void method288(int arg0) {
        this.field588[arg0].method3417();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ldga;Ldga;FLdga;)Ldga;", line = 78)
    public final class190 method290(class190 arg0, class190 arg1, float arg2, class190 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!da", name = "z", descriptor = "()Z", line = 81)
    public final boolean method291() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Li;)V", line = 85)
    public final void method292(class37 arg0) {
        this.field567 = (class564) arg0;
        this.method287(arg0);
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(Z)V", line = 88)
    public final void method293(boolean arg0) {
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "()V", line = 92)
    public final void method295() {
        if (!this.field578) {
            this.field588 = null;
            this.field583 = null;
            this.field567 = null;
            this.field584 = null;
            this.field585.method3227((byte) -119);
            for (class564 var1 = (class564) this.field568.method3174((byte) 49); var1 != null; var1 = (class564) this.field568.method3168(false)) {
                var1.method3192();
            }
            this.field568.method3170((byte) -52);
            this.method309();
            if (this.field587) {
                class462.method2627((byte) 83, true, false);
                this.field587 = false;
            }
            this.method359();
            class409.method2218(0);
            this.field578 = true;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V", line = 121)
    public final void method296(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "()Lq;", line = 124)
    public final class389 method297() {
        return this.field584;
    }

    @OriginalMember(owner = "client!da", name = "p", descriptor = "()Lhl;", line = 127)
    public final class482 method298() {
        return new class482(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIII)V", line = 131)
    public final void method300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lba;Ltg;Lq;Lmr;I)V", line = 134)
    public final void method301(class350 arg0, class211 arg1, class389 arg2, class130 arg3, int arg4) {
        this.method340(arg1, true);
        if (arg3 == null) {
            this.method364().method3411(this, arg0, arg2, (int[]) null, arg4, field571, field572, field576, field577, field579, arg1.field2558.method3121((byte) -115), field573);
        } else {
            field575[5] = 0;
            this.method364().method3411(this, arg0, arg2, field575, arg4, field571, field572, field576, field577, field579, arg1.field2558.method3121((byte) -111), field573);
            arg3.field1460 = field575[0];
            arg3.field1457 = field575[1];
            arg3.field1458 = field575[2];
            arg3.field1459 = field575[3];
            arg3.field1461 = field575[4];
            arg3.field1462 = field575[5] != 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V", line = 153)
    public final void method304(int arg0) {
        class409.method2216(true);
        this.method289(arg0);
        for (class564 var2 = (class564) this.field568.method3174((byte) 49); var2 != null; var2 = (class564) this.field568.method3168(false)) {
            var2.method3191();
        }
    }

    @OriginalMember(owner = "client!da", name = "i", descriptor = "()V", line = 165)
    public final void method305() {
    }

    @OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V", line = 168)
    protected final synchronized void finalize() {
        this.method3548(false);
        if (this.nativeid != 0L) {
            class409.method2220(this, (byte) 83);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 175)
    public final void method307(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)Li;", line = 179)
    public final class37 method308(int arg0) {
        class564 var2 = new class564(this, arg0);
        this.field568.method3164(var2, 256);
        return var2;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()Z", line = 185)
    public final boolean method310() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;)V", line = 188)
    public final void method311(class389 arg0) {
        this.field581 = arg0;
        this.method348(arg0);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)I", line = 193)
    public final int method312(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILfa;II)V", line = 202)
    public final void method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class213 arg6, int arg7, int arg8) {
        this.method350(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!da", name = "A", descriptor = "()Z", line = 207)
    public final boolean method315() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "y", descriptor = "()Z", line = 210)
    public final boolean method316() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(FFF)V", line = 212)
    public final void method317(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!da", name = "HA", descriptor = "()Ljava/lang/Object;", line = 215)
    private final Object method318() {
        return new class336(this);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIF)Lod;", line = 218)
    public final class463 method319(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class662(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V", line = 224)
    public final void method322(int arg0) {
        this.field588[arg0].method3408();
    }

    @OriginalMember(owner = "client!da", name = "q", descriptor = "()Z", line = 227)
    public final boolean method323() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "t", descriptor = "()V", line = 229)
    public final void method324() {
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 233)
    public final void method325(Canvas arg0) {
        class528 var2 = (class528) this.field585.method3234((byte) -60, (long) arg0.hashCode());
        Dimension var3 = arg0.getSize();
        var2.method3002(arg0, var3.width, var3.height);
        if (arg0 != null && this.field583.field7534 == arg0) {
            this.method284(arg0);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIII)Lxa;", line = 243)
    public final class458 method326(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class444(this, this.field567, arg0, arg1, arg2, arg3, arg4) : new class251(this, this.field567, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class444(this, this.field567, arg0, arg1, arg2, arg3, arg4) : new class251(this, this.field567, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!da", name = "qa", descriptor = "(S)Z", line = 279)
    private final boolean method327(short arg0) {
        synchronized (this) {
            class414 var3 = super.field8990.method846((byte) -105, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method294(arg0, var3.field5484, var3.field5482, var3.field5481, var3.field5492, var3.field5498, var3.field5491, var3.field5501, var3.field5486, var3.field5480, var3.field5495, var3.field5494, var3.field5490);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(Z)V", line = 290)
    public final void method329(boolean arg0) {
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "()Z", line = 299)
    public final boolean method332() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V", line = 302)
    public final void method333(int arg0) {
        this.field589 = arg0;
        this.field588 = new class611[this.field589];
        for (int var2 = 0; var2 < this.field589; ++var2) {
            this.field588[var2] = new class611(this, this.field582, this.field586);
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(IIIIII)V", line = 315)
    public final void method334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method361(arg0, arg1, arg2, arg4, arg5);
        this.method361(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method344(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method344(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!da", name = "D", descriptor = "()Z", line = 322)
    public final boolean method336() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "l", descriptor = "()Z", line = 327)
    public final boolean method338() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ltg;Z)V", line = 334)
    private final void method340(class211 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class663 var8 = (class663) arg0.field2558.method3124(false); var8 != null; var8 = (class663) arg0.field2558.method3122(-58)) {
            field571[var3++] = var8.field9426;
            field571[var3++] = var8.field9421;
            field571[var3++] = var8.field9423;
            field572[var4++] = var8.field9427;
            field577[var6++] = (short) var8.field9425;
            field576[var5++] = var8.field9418;
            if (arg1) {
                field579[var7++] = var8.field9428;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "()V", line = 364)
    public final void method341() throws class295 {
        if (this.field583 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field583.method3008();
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(Z)V", line = 378)
    public final void method346(boolean arg0) {
    }

    @OriginalMember(owner = "client!da", name = "j", descriptor = "()V", line = 380)
    public final void method347() {
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Led;[Laaa;Z)Lta;", line = 389)
    public final class195 method349(class645 arg0, class563[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field8002;
            var5[var7] = arg1[var7].field8005;
            if (arg1[var7].field8001 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class302(this, this.field567, arg0, arg1, (class458[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class12(this, this.field567, arg0, arg1, (class458[]) null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Laaa;Z)Lxa;", line = 431)
    public final class458 method351(class563 arg0, boolean arg1) {
        int[] var3 = arg0.field8000;
        byte[] var4 = arg0.field8006;
        int var5 = arg0.field8002;
        int var6 = arg0.field8005;
        class458 var7;
        if (arg1 && arg0.field8001 == null) {
            var7 = new class413(this, this.field567, var3, var4, 0, arg0.field8002, arg0.field8002, arg0.field8005);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field8001;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class444(this, this.field567, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field8000[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class444(this, this.field567, var9, 0, arg0.field8002, arg0.field8002, arg0.field8005);
                } else {
                    var7 = new class251(this, this.field567, var9, 0, arg0.field8002, arg0.field8002, arg0.field8005);
                }
            }
        }
        var7.method409(arg0.field8004, arg0.field8007, arg0.field8003, arg0.field7999);
        return var7;
    }

    @OriginalMember(owner = "client!da", name = "m", descriptor = "()I", line = 506)
    public final int method352() {
        return 4;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(IIIIII)V", line = 511)
    public final void method353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method382(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)V", line = 514)
    public final void method354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method364().method3415(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lod;)V", line = 518)
    public final void method355(int arg0, class463[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field570[var3++] = arg1[var4].method2640(-2049);
            field570[var3++] = arg1[var4].method2638((byte) -128);
            field570[var3++] = arg1[var4].method2641((byte) -14);
            field570[var3++] = arg1[var4].method2637(100);
            field574[var4] = arg1[var4].method2635(-31);
            field570[var3++] = arg1[var4].method2634(true);
        }
        this.method356(arg0, field570, field574);
    }

    @OriginalMember(owner = "client!da", name = "n", descriptor = "()V", line = 537)
    public final void method358() {
    }

    @OriginalMember(owner = "client!da", name = "s", descriptor = "()V", line = 540)
    private final void method359() {
        System.gc();
        System.runFinalization();
        class409.method2216(true);
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;)V", line = 545)
    public class56(Canvas arg0, class486 arg1) {
        super(arg1);
        try {
            if (!class527.method2998("sw3d", (byte) 14)) {
                throw new RuntimeException("");
            } else {
                class409.method2219(-27438);
                this.method303(super.field8990, 0, 0);
                class672.method3769(-127, true, false);
                this.field587 = true;
                this.field584 = new class558();
                this.method311(new class558());
                this.method333(1);
                this.method288(0);
                if (arg0 != null) {
                    this.method374(arg0);
                    this.method284(arg0);
                }
            }
        } catch (Throwable var3) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!da", name = "x", descriptor = "()Z", line = 571)
    public final boolean method360() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I)Lfa;", line = 575)
    public final class213 method362(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class688(this, this.field567, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!da", name = "E", descriptor = "()Lt;", line = 581)
    public final class611 method364() {
        for (int var1 = 0; var1 < this.field589; ++var1) {
            if (this.field588[var1].field8647 == Thread.currentThread()) {
                return this.field588[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(IIIIII)Ldga;", line = 594)
    public final class190 method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!da", name = "C", descriptor = "()V", line = 597)
    public final void method367() {
    }

    @OriginalMember(owner = "client!da", name = "u", descriptor = "()Lq;", line = 611)
    public final class389 method371() {
        return new class558();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I", line = 614)
    public final int method372(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lba;Ltg;Lq;[Lmr;I)V", line = 619)
    public final void method373(class350[] arg0, class211 arg1, class389 arg2, class130[] arg3, int arg4) {
        this.method340(arg1, true);
        if (arg3 == null) {
            this.method364().method3410(this, arg0, arg2, (int[]) null, arg4, field571, field572, field576, field577, field579, arg1.field2558.method3121((byte) -122), field573);
        } else {
            class130 var6 = arg3[0];
            field575[5] = 0;
            this.method364().method3410(this, arg0, arg2, field575, arg4, field571, field572, field576, field577, field579, arg1.field2558.method3121((byte) -102), field573);
            var6.field1460 = field575[0];
            var6.field1457 = field575[1];
            var6.field1458 = field575[2];
            var6.field1459 = field575[3];
            var6.field1461 = field575[4];
            var6.field1462 = field575[5] != 0;
        }
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                class494 var8 = (class494) arg0[var7];
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 664)
    public final void method374(Canvas arg0) {
        class528 var2 = (class528) this.field585.method3234((byte) -109, (long) arg0.hashCode());
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class528 var5 = new class528(this, arg0);
            this.field585.method3235((long) arg0.hashCode(), -1, var5);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lqda;IIII)Lba;", line = 684)
    public final class350 method375(class90 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class494(this, this.field567, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!da", name = "o", descriptor = "()Z", line = 691)
    public final boolean method376() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()Z", line = 698)
    public final boolean method377() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "B", descriptor = "()Z", line = 704)
    public final boolean method380() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lba;Lq;[Lmr;I)V", line = 719)
    public final void method381(class350[] arg0, class389 arg1, class130[] arg2, int arg3) {
        if (arg2 == null) {
            this.method364().method3419(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class130 var5 = arg2[0];
            field575[5] = 0;
            this.method364().method3419(this, arg0, arg1, field575, -1, arg3);
            var5.field1460 = field575[0];
            var5.field1457 = field575[1];
            var5.field1458 = field575[2];
            var5.field1459 = field575[3];
            var5.field1461 = field575[4];
            var5.field1462 = field575[5] != 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(S)Z", line = 745)
    private final boolean method383(short arg0) {
        class486 var2 = super.field8990;
        synchronized (super.field8990) {
            if (!super.field8990.method843(arg0, 31340)) {
                return false;
            } else {
                class414 var4 = super.field8990.method846((byte) -120, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (!var4.field5496) {
                        var6 = super.field8990.method854(0.7F, -4476, true, 128, arg0, 128);
                    } else {
                        var6 = super.field8990.method845(arg0, 0.7F, 128, true, 128, true);
                    }
                    this.method335(arg0, var4.field5484, var4.field5482, var4.field5481, var4.field5492, var4.field5498, var4.field5491, var4.field5501, var4.field5486, var4.field5480, var4.field5495, var4.field5494, var4.field5490, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ldga;)V", line = 771)
    public final void method384(class190 arg0) {
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()Z", line = 791)
    public final boolean method386() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "A", descriptor = "([I)V")
    public final native void method274(int[] arg0);

    @OriginalMember(owner = "client!da", name = "KA", descriptor = "(IIII)[I")
    public final native int[] method277(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "AA", descriptor = "(IIII)V")
    public final native void method278(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "ma", descriptor = "(IIIIII[BII)V")
    public final native void method281(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!da", name = "C", descriptor = "(IIIIII)V")
    public final native void method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Li;)V")
    private final native void method287(class37 arg0);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    private final native void method289(int arg0);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method294(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!da", name = "LA", descriptor = "(IIII)V")
    public final native void method299(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "v", descriptor = "()I")
    public final native int method302();

    @OriginalMember(owner = "client!da", name = "PA", descriptor = "(Le;II)V")
    private final native void method303(class486 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "m", descriptor = "(IIII)V")
    public final native void method306(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "()V")
    private final native void method309();

    @OriginalMember(owner = "client!da", name = "ca", descriptor = "(IIII)V")
    public final native void method314(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "YA", descriptor = "(IFFFFF)V")
    public final native void method320(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!da", name = "IA", descriptor = "()I")
    public final native int method321();

    @OriginalMember(owner = "client!da", name = "L", descriptor = "(ILfa;II)V")
    public final native void method328(int arg0, class213 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "(IIII)V")
    public final native void method330(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "na", descriptor = "(III[I)V")
    public final native void method331(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!da", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method335(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!da", name = "U", descriptor = "()I")
    public final native int method337();

    @OriginalMember(owner = "client!da", name = "k", descriptor = "()V")
    public final native void method339();

    @OriginalMember(owner = "client!da", name = "sa", descriptor = "(II)V")
    public final native void method342(int arg0, int arg1);

    @OriginalMember(owner = "client!da", name = "D", descriptor = "(I)V")
    public final native void method343(int arg0);

    @OriginalMember(owner = "client!da", name = "ya", descriptor = "(IIIII)V")
    public final native void method344(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "H", descriptor = "(Z)V")
    public final native void method59(boolean arg0);

    @OriginalMember(owner = "client!da", name = "SA", descriptor = "()I")
    public final native int method345();

    @OriginalMember(owner = "client!da", name = "o", descriptor = "(Lq;)V")
    private final native void method348(class389 arg0);

    @OriginalMember(owner = "client!da", name = "ra", descriptor = "(IIIIIILfa;II)V")
    private final native void method350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class213 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I[I[F)V")
    private final native void method356(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!da", name = "FA", descriptor = "(IIIIII)Z")
    public final native boolean method357(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(IIIII)V")
    public final native void method361(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "X", descriptor = "(III)V")
    public final native void method363(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "ka", descriptor = "(FF)V")
    public final native void method366(float arg0, float arg1);

    @OriginalMember(owner = "client!da", name = "ha", descriptor = "(F)V")
    public final native void method368(float arg0);

    @OriginalMember(owner = "client!da", name = "JA", descriptor = "(I)V")
    public final native void method369(int arg0);

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(IIIII)V")
    public final native void method370(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "F", descriptor = "()V")
    public final native void method378();

    @OriginalMember(owner = "client!da", name = "P", descriptor = "(Lv;)V")
    private final native void method379(class528 arg0);

    @OriginalMember(owner = "client!da", name = "BA", descriptor = "(IIIIII)V")
    private final native void method382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!da", name = "aa", descriptor = "()I")
    public final native int method385();
}
