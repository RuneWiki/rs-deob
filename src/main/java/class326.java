import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class326 extends class167 implements class438 {

    @OriginalMember(owner = "client!a", name = "u", descriptor = "Z")
    private boolean field4686 = false;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!a", name = "D", descriptor = "Lfea;")
    private class47 field4695 = new class47();

    @OriginalMember(owner = "client!a", name = "M", descriptor = "I")
    private int field4703 = 4096;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "I")
    private int field4699 = 4096;

    @OriginalMember(owner = "client!a", name = "I", descriptor = "Lcb;")
    private class78 field4700 = new class78(4);

    @OriginalMember(owner = "client!a", name = "P", descriptor = "Z")
    private boolean field4706 = false;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "Lm;")
    private class105 field4704;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "[I")
    private static int[] field4685 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!a", name = "x", descriptor = "[I")
    public static int[] field4689 = field4685;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "[S")
    private static short[] field4692 = new short[8191];

    @OriginalMember(owner = "client!a", name = "y", descriptor = "[I")
    private static int[] field4690 = new int[8191];

    @OriginalMember(owner = "client!a", name = "z", descriptor = "[F")
    private static float[] field4691 = new float[20];

    @OriginalMember(owner = "client!a", name = "w", descriptor = "[F")
    private static float[] field4688 = field4691;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "[I")
    private static int[] field4693 = field4685;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "[I")
    private static int[] field4694 = new int[8191];

    @OriginalMember(owner = "client!a", name = "F", descriptor = "[I")
    private static int[] field4697 = field4685;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "[B")
    private static byte[] field4696 = new byte[8191];

    @OriginalMember(owner = "client!a", name = "G", descriptor = "[I")
    public static int[] field4698 = new int[6];

    @OriginalMember(owner = "client!a", name = "O", descriptor = "I")
    private int field4705;

    @OriginalMember(owner = "client!a", name = "L", descriptor = "Lm;")
    private class105 field4702;

    @OriginalMember(owner = "client!a", name = "J", descriptor = "Lb;")
    private class572 field4701;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Lc;")
    private class618 field4687;

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "[Lv;")
    private class556[] field4707;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)V", line = 2)
    public final void method99(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I", line = 8)
    public final int method560(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()Z", line = 15)
    public final boolean method650() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V", line = 17)
    public final void method142() {
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(Z)V", line = 20)
    public final void method525(boolean arg0) {
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "()V", line = 23)
    public final void method124() {
    }

    @OriginalMember(owner = "client!a", name = "WA", descriptor = "(S)Z", line = 27)
    private final boolean method2018(short arg0) {
        synchronized (this) {
            class576 var3 = super.field2443.method2387((byte) 127, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method2027(arg0, var3.field8212, var3.field8216, var3.field8213, var3.field8222, var3.field8204, var3.field8215, var3.field8214, var3.field8203, var3.field8209, var3.field8220, var3.field8207, var3.field8218);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIII)V", line = 38)
    public final void method393(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2024().method3128(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lfba;Z)Lha;", line = 42)
    public final class116 method548(class518 arg0, boolean arg1) {
        int[] var3 = arg0.field7198;
        byte[] var4 = arg0.field7197;
        int var5 = arg0.field7202;
        int var6 = arg0.field7195;
        class116 var7;
        if (arg1 && arg0.field7196 == null) {
            var7 = new class288(this, this.field4687, var3, var4, 0, arg0.field7202, arg0.field7202, arg0.field7195);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field7196;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class588(this, this.field4687, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field7198[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class588(this, this.field4687, var9, 0, arg0.field7202, arg0.field7202, arg0.field7195);
                } else {
                    var7 = new class478(this, this.field4687, var9, 0, arg0.field7202, arg0.field7202, arg0.field7195);
                }
            }
        }
        var7.method963(arg0.field7199, arg0.field7200, arg0.field7203, arg0.field7201);
        return var7;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 118)
    public final void method402(Canvas arg0) {
        class572 var2 = (class572) this.field4700.method740(0, (long) arg0.hashCode());
        Dimension var3 = arg0.getSize();
        var2.method3268(arg0, var3.width, var3.height);
        if (arg0 != null && this.field4701.field8154 == arg0) {
            this.method394(arg0);
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)Lu;", line = 128)
    public final class424 method614(int arg0) {
        class618 var2 = new class618(this, arg0);
        this.field4695.method414(var2, (byte) 90);
        return var2;
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V", line = 134)
    protected final synchronized void finalize() {
        this.method1163(6510);
        if (this.nativeid != 0L) {
            class124.method989(-107, this);
        }
    }

    @OriginalMember(owner = "client!a", name = "k", descriptor = "()Z", line = 142)
    public final boolean method645() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "A", descriptor = "()Z", line = 145)
    public final boolean method524() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "g", descriptor = "(I)V", line = 149)
    public final void method101(int arg0) {
        class124.method987((byte) 123);
        this.method2026(arg0);
        for (class618 var2 = (class618) this.field4695.method427(true); var2 != null; var2 = (class618) this.field4695.method420(false)) {
            var2.method3497();
        }
    }

    @OriginalMember(owner = "client!a", name = "i", descriptor = "()Ldp;", line = 162)
    public final class425 method85() {
        return new class425(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!a", name = "GA", descriptor = "(S)Z", line = 167)
    private final boolean method2019(short arg0) {
        class472 var2 = super.field2443;
        synchronized (super.field2443) {
            if (!super.field2443.method2389(-90, arg0)) {
                return false;
            } else {
                class576 var4 = super.field2443.method2387((byte) 127, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (!var4.field8217) {
                        var6 = super.field2443.method2388(128, 128, true, arg0, 0.7F, (byte) -64);
                    } else {
                        var6 = super.field2443.method2385(0.7F, 128, true, arg0, true, 128);
                    }
                    this.method2017(arg0, var4.field8212, var4.field8216, var4.field8213, var4.field8222, var4.field8204, var4.field8215, var4.field8214, var4.field8203, var4.field8209, var4.field8220, var4.field8207, var4.field8218, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "s", descriptor = "()V", line = 190)
    public final void method83() {
    }

    @OriginalMember(owner = "client!a", name = "z", descriptor = "()Z", line = 195)
    public final boolean method595() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "u", descriptor = "()V", line = 197)
    public final void method153() {
    }

    @OriginalMember(owner = "client!a", name = "B", descriptor = "()Z", line = 200)
    public final boolean method407() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIF)Luca;", line = 203)
    public final class637 method601(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class166(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "h", descriptor = "(I)V", line = 206)
    public final void method399(int arg0) {
        this.field4707[arg0].method3127();
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 210)
    public final void method394(Canvas arg0) {
        if (arg0 != null) {
            class572 var2 = (class572) this.field4700.method740(0, (long) arg0.hashCode());
            this.field4701 = var2;
            this.method2021(var2);
        } else {
            this.field4701 = null;
            this.method2021((class572) null);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIIII)V", line = 231)
    public final void method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!a", name = "D", descriptor = "()V", line = 233)
    public final void method122() {
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([IIIII)Lha;", line = 238)
    public final class116 method528(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class588(this, this.field4687, arg0, arg1, arg2, arg3, arg4) : new class478(this, this.field4687, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class588(this, this.field4687, arg0, arg1, arg2, arg3, arg4) : new class478(this, this.field4687, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "C", descriptor = "()Z", line = 273)
    public final boolean method555() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lrl;[Lfba;Z)Lra;", line = 280)
    public final class259 method626(class633 arg0, class518[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field7202;
            var5[var7] = arg1[var7].field7195;
            if (arg1[var7].field7196 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class91(this, this.field4687, arg0, arg1, (class116[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class281(this, this.field4687, arg0, arg1, (class116[]) null);
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;)V", line = 317)
    public class326(Canvas arg0, class472 arg1) {
        super(arg1);
        try {
            if (!class8.method31(false, "sw3d")) {
                throw new RuntimeException("");
            } else {
                class124.method988(false);
                this.method2030(super.field2443, 0, 0);
                class327.method2034(2, true, false);
                this.field4706 = true;
                this.field4704 = new class447();
                this.method587(new class447());
                this.method403(1);
                this.method398(0);
                if (arg0 != null) {
                    this.method624(arg0);
                    this.method394(arg0);
                }
            }
        } catch (Throwable var3) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lu;)V", line = 346)
    public final void method593(class424 arg0) {
        this.field4687 = (class618) arg0;
        this.method2025(arg0);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lm;)V", line = 350)
    public final void method587(class105 arg0) {
        this.field4702 = arg0;
        this.method2031(arg0);
    }

    @OriginalMember(owner = "client!a", name = "l", descriptor = "()V", line = 355)
    public final void method567() {
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 361)
    public final void method624(Canvas arg0) {
        class572 var2 = (class572) this.field4700.method740(0, (long) arg0.hashCode());
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class572 var5 = new class572(this, arg0);
            this.field4700.method737((long) arg0.hashCode(), (byte) 92, var5);
        }
    }

    @OriginalMember(owner = "client!a", name = "o", descriptor = "()V", line = 380)
    public final void method94() throws class354 {
        if (this.field4701 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field4701.method3269();
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([Lr;Lsh;Lm;[Lpaa;I)V", line = 391)
    public final void method397(class519[] arg0, class616 arg1, class105 arg2, class315[] arg3, int arg4) {
        this.method2033(arg1, true);
        if (arg3 == null) {
            this.method2024().method3118(this, arg0, arg2, (int[]) null, arg4, field4697, field4690, field4694, field4692, field4696, arg1.field8719.method2798(true), field4689);
        } else {
            class315 var6 = arg3[0];
            field4698[5] = 0;
            this.method2024().method3118(this, arg0, arg2, field4698, arg4, field4697, field4690, field4694, field4692, field4696, arg1.field8719.method2798(true), field4689);
            var6.field4597 = field4698[0];
            var6.field4600 = field4698[1];
            var6.field4599 = field4698[2];
            var6.field4598 = field4698[3];
            var6.field4596 = field4698[4];
            var6.field4595 = field4698[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class312 var9 = (class312) arg0[var8];
                var9.method1936(var7, arg2);
                if (var9.field4560 != null) {
                    var7 += var9.field4560.length * 9;
                }
                if (var9.field4562 != null) {
                    var7 += var9.field4562.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIII)V", line = 435)
    public final void method638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method589(arg0, arg1, arg2, arg4, arg5);
        this.method589(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method573(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method573(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(IIIIII)V", line = 444)
    public final void method628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2028(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "r", descriptor = "()I", line = 448)
    public final int method612() {
        return 4;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V", line = 450)
    public final void method621(boolean arg0) {
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)I", line = 453)
    public final int method649(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lkk;Lkk;FLkk;)Lkk;", line = 456)
    public final class149 method104(class149 arg0, class149 arg1, float arg2, class149 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 460)
    public final void method158(Rectangle[] arg0, int arg1) throws class354 {
        if (this.field4701 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field4701.method3273(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V", line = 471)
    public final void method403(int arg0) {
        this.field4705 = arg0;
        this.field4707 = new class556[this.field4705];
        for (int var2 = 0; var2 < this.field4705; ++var2) {
            this.field4707[var2] = new class556(this, this.field4703, this.field4699);
        }
    }

    @OriginalMember(owner = "client!a", name = "g", descriptor = "()Z", line = 484)
    public final boolean method618() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "()Ljava/lang/Object;", line = 488)
    private final Object method2022() {
        return new class351(this);
    }

    @OriginalMember(owner = "client!a", name = "XA", descriptor = "()V", line = 491)
    private final void method2023() {
        System.gc();
        System.runFinalization();
        class124.method987((byte) 89);
    }

    @OriginalMember(owner = "client!a", name = "E", descriptor = "()Lv;", line = 498)
    public final class556 method2024() {
        for (int var1 = 0; var1 < this.field4705; ++var1) {
            if (this.field4707[var1].field7866 == Thread.currentThread()) {
                return this.field4707[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lld;IIII)Lr;", line = 510)
    public final class519 method400(class560 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class312(this, this.field4687, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II[[I[[IIII)Lsa;", line = 517)
    public final class542 method405(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class203(this, this.field4687, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V", line = 519)
    public final void method131(boolean arg0) {
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II[I[I)Lpa;", line = 522)
    public final class593 method582(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class415(this, this.field4687, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "h", descriptor = "()Lm;", line = 526)
    public final class105 method623() {
        return new class447();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I[Luca;)V", line = 537)
    public final void method586(int arg0, class637[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field4693[var3++] = arg1[var4].method3681(-27102);
            field4693[var3++] = arg1[var4].method3682(false);
            field4693[var3++] = arg1[var4].method3677(-26984);
            field4693[var3++] = arg1[var4].method3683(0);
            field4688[var4] = arg1[var4].method3678(-23151);
            field4693[var3++] = arg1[var4].method3679(1705);
        }
        this.method2029(arg0, field4693, field4688);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lr;Lsh;Lm;Lpaa;I)V", line = 555)
    public final void method553(class519 arg0, class616 arg1, class105 arg2, class315 arg3, int arg4) {
        this.method2033(arg1, true);
        if (arg3 == null) {
            this.method2024().method3121(this, arg0, arg2, (int[]) null, arg4, field4697, field4690, field4694, field4692, field4696, arg1.field8719.method2798(true), field4689);
        } else {
            field4698[5] = 0;
            this.method2024().method3121(this, arg0, arg2, field4698, arg4, field4697, field4690, field4694, field4692, field4696, arg1.field8719.method2798(true), field4689);
            arg3.field4597 = field4698[0];
            arg3.field4600 = field4698[1];
            arg3.field4599 = field4698[2];
            arg3.field4598 = field4698[3];
            arg3.field4596 = field4698[4];
            arg3.field4595 = field4698[5] != 0;
        }
        class312 var6 = (class312) arg0;
        var6.method1936(0, arg2);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()Lm;", line = 576)
    public final class105 method637() {
        return this.field4704;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIZ)Lha;", line = 585)
    public final class116 method580(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class588(this, this.field4687, arg0, arg1, arg2, arg3) : new class478(this, this.field4687, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "p", descriptor = "()Z", line = 601)
    public final boolean method157() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(FFF)V", line = 604)
    public final void method139(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIILpa;II)V", line = 608)
    public final void method633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class593 arg6, int arg7, int arg8) {
        this.method2032(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lkk;)V", line = 615)
    public final void method556(class149 arg0) {
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 618)
    public final void method605(Canvas arg0) {
        if (this.field4701.field8154 == arg0) {
            this.method394((Canvas) null);
        }
        class572 var2 = (class572) this.field4700.method740(0, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method911(-52);
            var2.method3270();
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 631)
    public final void method521(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V", line = 641)
    public final void method398(int arg0) {
        this.field4707[arg0].method3116();
    }

    @OriginalMember(owner = "client!a", name = "x", descriptor = "()Z", line = 650)
    public final boolean method594() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([Lr;Lm;[Lpaa;I)V", line = 653)
    public final void method406(class519[] arg0, class105 arg1, class315[] arg2, int arg3) {
        if (arg2 == null) {
            this.method2024().method3126(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class315 var5 = arg2[0];
            field4698[5] = 0;
            this.method2024().method3126(this, arg0, arg1, field4698, -1, arg3);
            var5.field4597 = field4698[0];
            var5.field4600 = field4698[1];
            var5.field4599 = field4698[2];
            var5.field4598 = field4698[3];
            var5.field4596 = field4698[4];
            var5.field4595 = field4698[5] != 0;
        }
    }

    @OriginalMember(owner = "client!a", name = "m", descriptor = "()Z", line = 671)
    public final boolean method629() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "j", descriptor = "()Z", line = 676)
    public final boolean method660() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lsh;)V", line = 679)
    public final void method563(class616 arg0) {
        this.method2033(arg0, false);
        this.method2024().method3120(this, field4697, field4690, field4694, field4692, arg0.field8719.method2798(true));
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "()Z", line = 684)
    public final boolean method559() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "y", descriptor = "()Z", line = 692)
    public final boolean method635() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lsh;Z)V", line = 697)
    private final void method2033(class616 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class521 var8 = (class521) arg0.field8719.method2802(0); var8 != null; var8 = (class521) arg0.field8719.method2800((byte) -121)) {
            field4697[var3++] = var8.field7240;
            field4697[var3++] = var8.field7242;
            field4697[var3++] = var8.field7246;
            field4690[var4++] = var8.field7235;
            field4692[var6++] = (short) var8.field7243;
            field4694[var5++] = var8.field7237;
            if (arg1) {
                field4696[var7++] = var8.field7244;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "v", descriptor = "()Z", line = 727)
    public final boolean method529() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(IIIIII)Lkk;", line = 733)
    public final class149 method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!a", name = "q", descriptor = "()Z", line = 747)
    public final boolean method141() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "t", descriptor = "()V", line = 767)
    public final void method95() {
        if (!this.field4686) {
            this.field4707 = null;
            this.field4701 = null;
            this.field4687 = null;
            this.field4704 = null;
            this.field4700.method739(2048);
            for (class618 var1 = (class618) this.field4695.method427(true); var1 != null; var1 = (class618) this.field4695.method420(false)) {
                var1.method3496();
            }
            this.field4695.method425(-104);
            this.method2020();
            if (this.field4706) {
                class246.method1560((byte) -96, false, true);
                this.field4706 = false;
            }
            this.method2023();
            class124.method986(0);
            this.field4686 = true;
        }
    }

    @OriginalMember(owner = "client!a", name = "m", descriptor = "(IFFFFF)V")
    public final native void method600(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!a", name = "h", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method2017(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!a", name = "A", descriptor = "(IIIII)V")
    public final native void method652(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "v", descriptor = "(IIII)[I")
    public final native int[] method103(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "n", descriptor = "()V")
    public final native void method657();

    @OriginalMember(owner = "client!a", name = "JA", descriptor = "(IIII)V")
    public final native void method572(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(III)V")
    public final native void method562(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!a", name = "N", descriptor = "(IIII)V")
    public final native void method615(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(IIIIII)V")
    public final native void method653(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(IIIII)V")
    public final native void method573(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "za", descriptor = "(IIIIII[BII)V")
    public final native void method661(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "la", descriptor = "(FF)V")
    public final native void method517(float arg0, float arg1);

    @OriginalMember(owner = "client!a", name = "P", descriptor = "()F")
    public final native float method542();

    @OriginalMember(owner = "client!a", name = "ra", descriptor = "()F")
    public final native float method613();

    @OriginalMember(owner = "client!a", name = "w", descriptor = "()V")
    private final native void method2020();

    @OriginalMember(owner = "client!a", name = "ba", descriptor = "()I")
    public final native int method604();

    @OriginalMember(owner = "client!a", name = "B", descriptor = "(IIIIII)Z")
    public final native boolean method558(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(F)V")
    public final native void method569(float arg0);

    @OriginalMember(owner = "client!a", name = "U", descriptor = "()I")
    public final native int method565();

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(II)V")
    public final native void method557(int arg0, int arg1);

    @OriginalMember(owner = "client!a", name = "NA", descriptor = "(Z)V")
    public final native void method810(boolean arg0);

    @OriginalMember(owner = "client!a", name = "YA", descriptor = "()I")
    public final native int method120();

    @OriginalMember(owner = "client!a", name = "MA", descriptor = "(Lb;)V")
    private final native void method2021(class572 arg0);

    @OriginalMember(owner = "client!a", name = "L", descriptor = "(I)V")
    public final native void method642(int arg0);

    @OriginalMember(owner = "client!a", name = "ea", descriptor = "(Lu;)V")
    private final native void method2025(class424 arg0);

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(I)V")
    private final native void method2026(int arg0);

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(IIII)V")
    public final native void method519(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "RA", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method2027(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!a", name = "t", descriptor = "(IIIIII)V")
    private final native void method2028(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "CA", descriptor = "()I")
    public final native int method531();

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(IIIII)V")
    public final native void method589(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "xa", descriptor = "()V")
    public final native void method585();

    @OriginalMember(owner = "client!a", name = "G", descriptor = "(ILpa;II)V")
    public final native void method592(int arg0, class593 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(I)V")
    public final native void method121(int arg0);

    @OriginalMember(owner = "client!a", name = "IA", descriptor = "(III[I)V")
    public final native void method568(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!a", name = "F", descriptor = "(IIII)V")
    public final native void method581(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "oa", descriptor = "(I[I[F)V")
    private final native void method2029(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!a", name = "Y", descriptor = "(Ln;II)V")
    private final native void method2030(class472 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!a", name = "TA", descriptor = "(Lm;)V")
    private final native void method2031(class105 arg0);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()I")
    public final native int method537();

    @OriginalMember(owner = "client!a", name = "ca", descriptor = "(IIIIIILpa;II)V")
    private final native void method2032(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class593 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "d", descriptor = "([I)V")
    public final native void method640(int[] arg0);

    @OriginalMember(owner = "client!a", name = "q", descriptor = "(IIII)V")
    public final native void method658(int arg0, int arg1, int arg2, int arg3);
}
