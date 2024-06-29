import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class18 extends class166 implements class200 {

    @OriginalMember(owner = "client!l", name = "r", descriptor = "Z")
    private boolean field178 = false;

    @OriginalMember(owner = "client!l", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Lgca;")
    private class227 field180 = new class227();

    @OriginalMember(owner = "client!l", name = "C", descriptor = "I")
    private int field189 = 4096;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "I")
    private int field190 = 4096;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "Lfaa;")
    private class139 field183 = new class139(4);

    @OriginalMember(owner = "client!l", name = "N", descriptor = "Z")
    private boolean field200 = false;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "Lq;")
    private class392 field184;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "[I")
    private static int[] field179 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!l", name = "B", descriptor = "[I")
    private static int[] field188 = field179;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "[I")
    public static int[] field187 = new int[6];

    @OriginalMember(owner = "client!l", name = "E", descriptor = "[S")
    private static short[] field191 = new short[8191];

    @OriginalMember(owner = "client!l", name = "F", descriptor = "[F")
    private static float[] field192 = new float[20];

    @OriginalMember(owner = "client!l", name = "y", descriptor = "[B")
    private static byte[] field185 = new byte[8191];

    @OriginalMember(owner = "client!l", name = "z", descriptor = "[I")
    public static int[] field186 = field179;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "[I")
    private static int[] field198 = new int[8191];

    @OriginalMember(owner = "client!l", name = "J", descriptor = "[I")
    private static int[] field196 = new int[8191];

    @OriginalMember(owner = "client!l", name = "I", descriptor = "[F")
    private static float[] field195 = field192;

    @OriginalMember(owner = "client!l", name = "M", descriptor = "[I")
    private static int[] field199 = field179;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "I")
    public int field194;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "Lm;")
    private class175 field181;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "Lta;")
    private class195 field193;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "Lq;")
    private class392 field182;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "[Lqa;")
    private class225[] field197;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method86(Canvas arg0) {
        if (arg0 != null) {
            class195 var2 = (class195) this.field183.method970((byte) 89, (long) arg0.hashCode());
            this.field193 = var2;
            this.method176(var2);
        } else {
            this.field193 = null;
            this.method176((class195) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "p", descriptor = "()Z")
    public final boolean method87() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "B", descriptor = "()Z")
    public final boolean method88() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "ya", descriptor = "()V")
    public final native void method89();

    @OriginalMember(owner = "client!l", name = "w", descriptor = "(IIIIII)V")
    private final native void method90(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lwn;Lwn;FLwn;)Lwn;")
    public final class674 method91(class674 arg0, class674 arg1, float arg2, class674 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method92(Rectangle[] arg0, int arg1) throws class39 {
        if (this.field193 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field193.method1296(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lq;)V")
    public final void method93(class392 arg0) {
        this.field182 = arg0;
        this.method171(arg0);
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "()Z")
    public final boolean method94() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "OA", descriptor = "(Lfa;II)V")
    private final native void method95(class212 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!l", name = "z", descriptor = "()V")
    public final void method96() {
        this.method86(this.field193.field2747);
    }

    @OriginalMember(owner = "client!l", name = "T", descriptor = "()I")
    public final native int method97();

    @OriginalMember(owner = "client!l", name = "s", descriptor = "()V")
    public final void method98() {
    }

    @OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method1168(89);
        if (this.nativeid != 0L) {
            class429.method2464(-63, this);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
    public final void method99(boolean arg0) {
    }

    @OriginalMember(owner = "client!l", name = "o", descriptor = "()V")
    public final void method100() throws class39 {
        if (this.field193 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field193.method1300();
        }
    }

    @OriginalMember(owner = "client!l", name = "ja", descriptor = "(I)V")
    public final native void method101(int arg0);

    @OriginalMember(owner = "client!l", name = "qa", descriptor = "(I)V")
    private final native void method102(int arg0);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V")
    public final void method103(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!l", name = "x", descriptor = "()V")
    public final void method104() {
    }

    @OriginalMember(owner = "client!l", name = "ra", descriptor = "(F)V")
    public final native void method105(float arg0);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lnba;IIII)Lda;")
    public final class55 method106(class270 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class537(this, this.field181, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!l", name = "i", descriptor = "()Z")
    public final boolean method107() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIF)Ltw;")
    public final class186 method108(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class15(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "()Z")
    public final boolean method109() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "J", descriptor = "(IIIIII)V")
    public final native void method110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Le;)V")
    public final void method111(class493 arg0) {
        this.field181 = (class175) arg0;
        this.method177(arg0);
    }

    @OriginalMember(owner = "client!l", name = "FA", descriptor = "(ILua;II)V")
    public final native void method112(int arg0, class618 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(IIIIII)V")
    public final void method113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method90(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
    public final int method114(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!l", name = "I", descriptor = "(I[I[F)V")
    private final native void method115(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!l", name = "c", descriptor = "()Z")
    public final boolean method116() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "VA", descriptor = "(IFFFFF)V")
    public final native void method117(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!l", name = "XA", descriptor = "(IIIII)V")
    public final native void method118(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!l", name = "h", descriptor = "()Z")
    public final boolean method120() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "A", descriptor = "(S)Z")
    private final boolean method121(short arg0) {
        synchronized (this) {
            class686 var3 = super.field2418.method1365(-17951, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method150(arg0, var3.field9791, var3.field9783, var3.field9779, var3.field9794, var3.field9796, var3.field9785, var3.field9787, var3.field9797, var3.field9777, var3.field9798, var3.field9781, var3.field9792);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "ma", descriptor = "(Lt;)V")
    private final native void method122(class621 arg0);

    @OriginalMember(owner = "client!l", name = "V", descriptor = "(IIII)V")
    public final native void method123(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "v", descriptor = "()[I")
    public final native int[] method124();

    @OriginalMember(owner = "client!l", name = "k", descriptor = "()V")
    public final void method125() {
    }

    @OriginalMember(owner = "client!l", name = "IA", descriptor = "(IIIIII[BII)V")
    public final native void method126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "q", descriptor = "()Z")
    public final boolean method127() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lwn;)V")
    public final void method128(class674 arg0) {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lvn;[Lqga;Z)Lla;")
    public final class417 method129(class283 arg0, class168[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field2445;
            var5[var7] = arg1[var7].field2449;
            if (arg1[var7].field2447 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class170(this, this.field181, arg0, arg1, (class702[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class277(this, this.field181, arg0, arg1, (class702[]) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "j", descriptor = "()Z")
    public final boolean method130() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "pa", descriptor = "(III)V")
    public final native void method131(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!l", name = "g", descriptor = "()Z")
    public final boolean method132() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "BA", descriptor = "()I")
    public final native int method133();

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)I")
    public final int method134(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!l", name = "n", descriptor = "()V")
    public final void method135() {
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "()V")
    public final void method136() {
        if (!this.field178) {
            this.field197 = null;
            this.field193 = null;
            this.field181 = null;
            this.field184 = null;
            this.field183.method974(-20470);
            for (class175 var1 = (class175) this.field180.method1436(28964); var1 != null; var1 = (class175) this.field180.method1443((byte) 6)) {
                var1.method1230();
            }
            this.field180.method1444(-27547);
            this.method198();
            if (this.field200) {
                class5.method14((byte) -121, false, true);
                this.field200 = false;
            }
            this.method172();
            class429.method2466(-125);
            this.field178 = true;
        }
    }

    @OriginalMember(owner = "client!l", name = "CA", descriptor = "(IIII)V")
    public final native void method137(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "fa", descriptor = "()Ljava/lang/Object;")
    private final Object method138() {
        return new class617(this);
    }

    @OriginalMember(owner = "client!l", name = "va", descriptor = "(I)V")
    public final native void method139(int arg0);

    @OriginalMember(owner = "client!l", name = "D", descriptor = "()Lqa;")
    public final class225 method140() {
        for (int var1 = 0; var1 < this.field194; ++var1) {
            if (this.field197[var1].field3126 == Thread.currentThread()) {
                return this.field197[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V")
    public final void method141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method140().method1423(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "U", descriptor = "()I")
    public final native int method142();

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;)V")
    public class18(Canvas arg0, class212 arg1) {
        super(arg1);
        try {
            if (!class28.method266(true, "sw3d")) {
                throw new RuntimeException("");
            } else {
                class429.method2465(-49);
                this.method95(super.field2418, 0, 0);
                class581.method3314(true, false, 114);
                this.field200 = true;
                this.field184 = new class94();
                this.method93(new class94());
                this.method191(1);
                this.method173(0);
                if (arg0 != null) {
                    this.method204(arg0);
                    this.method86(arg0);
                }
            }
        } catch (Throwable var3) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!l", name = "L", descriptor = "()V")
    public final native void method143();

    @OriginalMember(owner = "client!l", name = "w", descriptor = "()Lq;")
    public final class392 method144() {
        return this.field182;
    }

    @OriginalMember(owner = "client!l", name = "O", descriptor = "(IIIIII)Z")
    public final native boolean method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lqga;Z)Lf;")
    public final class702 method146(class168 arg0, boolean arg1) {
        int[] var3 = arg0.field2442;
        byte[] var4 = arg0.field2450;
        int var5 = arg0.field2445;
        int var6 = arg0.field2449;
        class702 var7;
        if (arg1 && arg0.field2447 == null) {
            var7 = new class271(this, this.field181, var3, var4, 0, arg0.field2445, arg0.field2445, arg0.field2449);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field2447;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class621(this, this.field181, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field2442[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class621(this, this.field181, var9, 0, arg0.field2445, arg0.field2445, arg0.field2449);
                } else {
                    var7 = new class460(this, this.field181, var9, 0, arg0.field2445, arg0.field2445, arg0.field2449);
                }
            }
        }
        var7.method1663(arg0.field2446, arg0.field2448, arg0.field2443, arg0.field2444);
        return var7;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFF)V")
    public final void method147(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!l", name = "h", descriptor = "(IIII)[I")
    public final native int[] method148(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "W", descriptor = "(S)Z")
    private final boolean method149(short arg0) {
        class212 var2 = super.field2418;
        synchronized (super.field2418) {
            if (!super.field2418.method1367(arg0, false)) {
                return false;
            } else {
                class686 var4 = super.field2418.method1365(-17951, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (!var4.field9784) {
                        var6 = super.field2418.method1366(true, arg0, 128, 0.7F, 128, (byte) -72);
                    } else {
                        var6 = super.field2418.method1370(0.7F, true, 128, (byte) -16, 128, arg0);
                    }
                    this.method186(arg0, var4.field9791, var4.field9783, var4.field9779, var4.field9794, var4.field9796, var4.field9785, var4.field9787, var4.field9797, var4.field9777, var4.field9798, var4.field9781, var4.field9792, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method150(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!l", name = "u", descriptor = "()Lho;")
    public final class134 method151() {
        return new class134(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method152(Canvas arg0) {
        if (this.field193.field2747 == arg0) {
            this.method86((Canvas) null);
        }
        class195 var2 = (class195) this.field183.method970((byte) 89, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2340(-126);
            var2.method1302();
        }
    }

    @OriginalMember(owner = "client!l", name = "YA", descriptor = "(IIII)V")
    public final native void method153(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "MA", descriptor = "(III[I)V")
    public final native void method154(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!l", name = "AA", descriptor = "(III[I)V")
    public final native void method155(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZ)Lf;")
    public final class702 method156(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class621(this, this.field181, arg0, arg1, arg2, arg3) : new class460(this, this.field181, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V")
    public final void method157(boolean arg0) {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([I)V")
    public final void method158(int[] arg0) {
        Dimension var2 = this.field193.field2747.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
    public final void method159(int arg0) {
        this.field197[arg0].method1426();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ldk;Z)V")
    private final void method160(class472 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class247 var8 = (class247) arg0.field6493.method3410(-14475); var8 != null; var8 = (class247) arg0.field6493.method3405((byte) 38)) {
            field188[var3++] = var8.field3389;
            field188[var3++] = var8.field3387;
            field188[var3++] = var8.field3381;
            field198[var4++] = var8.field3384;
            field191[var6++] = (short) var8.field3382;
            field196[var5++] = var8.field3379;
            if (arg1) {
                field185[var7++] = var8.field3383;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "la", descriptor = "(IIII)V")
    public final native void method161(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "q", descriptor = "(Lva;)V")
    private final native void method162(class460 arg0);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ldk;)V")
    public final void method163(class472 arg0) {
        this.method160(arg0, false);
        this.method140().method1429(this, field188, field198, field196, field191, arg0.field6493.method3411(true));
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lf;Z)V")
    public final void method164(class702 arg0, boolean arg1) {
        if (arg0 instanceof class460) {
            this.method162((class460) arg0);
        } else if (arg0 instanceof class621) {
            this.method122((class621) arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIIII)Lwn;")
    public final class674 method165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!l", name = "A", descriptor = "()Lq;")
    public final class392 method166() {
        return this.field184;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ldk;I)V")
    public final void method167(class472 arg0, int arg1) {
        this.method160(arg0, false);
        this.method140().method1429(this, field188, field198, field196, field191, arg0.field6493.method3411(true));
    }

    @OriginalMember(owner = "client!l", name = "r", descriptor = "()Lq;")
    public final class392 method168() {
        return new class94();
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
    public final native int method169();

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)Lf;")
    public final class702 method170(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class621(this, this.field181, arg0, arg1) : new class460(this, this.field181, arg0, arg1);
    }

    @OriginalMember(owner = "client!l", name = "NA", descriptor = "(Lq;)V")
    private final native void method171(class392 arg0);

    @OriginalMember(owner = "client!l", name = "WA", descriptor = "()V")
    private final void method172() {
        System.gc();
        System.runFinalization();
        class429.method2463((byte) -35);
    }

    @OriginalMember(owner = "client!l", name = "h", descriptor = "(I)V")
    public final void method173(int arg0) {
        this.field197[arg0].method1420();
    }

    @OriginalMember(owner = "client!l", name = "oa", descriptor = "([I)V")
    public final native void method174(int[] arg0);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIII)Lf;")
    public final class702 method175(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class621(this, this.field181, arg0, arg1, arg2, arg3, arg4) : new class460(this, this.field181, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class621(this, this.field181, arg0, arg1, arg2, arg3, arg4) : new class460(this, this.field181, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!l", name = "ia", descriptor = "(Lta;)V")
    private final native void method176(class195 arg0);

    @OriginalMember(owner = "client!l", name = "EA", descriptor = "(Le;)V")
    private final native void method177(class493 arg0);

    @OriginalMember(owner = "client!l", name = "y", descriptor = "()Z")
    public final boolean method178() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "(IIIIIILua;II)V")
    private final native void method179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class618 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[I[I)Lua;")
    public final class618 method180(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class379(this, this.field181, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIII)V")
    public final native void method181(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "GA", descriptor = "(II)V")
    public final native void method182(int arg0, int arg1);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[Ltw;)V")
    public final void method183(int arg0, class186[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field199[var3++] = arg1[var4].method1280(true);
            field199[var3++] = arg1[var4].method1282((byte) 102);
            field199[var3++] = arg1[var4].method1279(0);
            field199[var3++] = arg1[var4].method1281(77);
            field195[var4] = arg1[var4].method1285(-1120);
            field199[var3++] = arg1[var4].method1283(0);
        }
        this.method115(arg0, field199, field195);
    }

    @OriginalMember(owner = "client!l", name = "DA", descriptor = "()I")
    public final native int method184();

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(I)Le;")
    public final class493 method185(int arg0) {
        class175 var2 = new class175(this, arg0);
        this.field180.method1441(var2, 0);
        return var2;
    }

    @OriginalMember(owner = "client!l", name = "xa", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method186(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V")
    public final void method187(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!l", name = "UA", descriptor = "(Z)V")
    public final native void method188(boolean arg0);

    @OriginalMember(owner = "client!l", name = "t", descriptor = "()Z")
    public final boolean method189() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V")
    public final void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method118(arg0, arg1, arg2, arg4, arg5);
        this.method118(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method205(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method205(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V")
    public final void method191(int arg0) {
        this.field194 = arg0;
        this.field197 = new class225[this.field194];
        for (int var2 = 0; var2 < this.field194; ++var2) {
            this.field197[var2] = new class225(this, this.field190, this.field189);
        }
    }

    @OriginalMember(owner = "client!l", name = "C", descriptor = "()Z")
    public final boolean method192() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "JA", descriptor = "()V")
    public final native void method193();

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
    public final void method194(int arg0) {
        class429.method2463((byte) -35);
        this.method102(arg0);
        for (class175 var2 = (class175) this.field180.method1436(28964); var2 != null; var2 = (class175) this.field180.method1443((byte) 6)) {
            var2.method1229();
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public final class37 method195(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class253(this, this.field181, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "m", descriptor = "()V")
    public final void method196() {
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method197(Canvas arg0) {
        class195 var2 = (class195) this.field183.method970((byte) 89, (long) arg0.hashCode());
        Dimension var3 = arg0.getSize();
        var2.method1295(arg0, var3.width, var3.height);
        if (arg0 != null && this.field193.field2747 == arg0) {
            this.method86(arg0);
        }
    }

    @OriginalMember(owner = "client!l", name = "R", descriptor = "()V")
    private final native void method198();

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIILua;II)V")
    public final void method199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class618 arg6, int arg7, int arg8) {
        this.method179(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!l", name = "da", descriptor = "(IIII)V")
    public final native void method200(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "l", descriptor = "()Z")
    public final boolean method201() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "ZA", descriptor = "(Z)V")
    public final native void method202(boolean arg0);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "()I")
    public final int method203() {
        return 4;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method204(Canvas arg0) {
        class195 var2 = (class195) this.field183.method970((byte) 89, (long) arg0.hashCode());
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class195 var5 = new class195(this, arg0);
            this.field183.method968((long) arg0.hashCode(), var5, -1);
        }
    }

    @OriginalMember(owner = "client!l", name = "m", descriptor = "(IIIII)V")
    public final native void method205(int arg0, int arg1, int arg2, int arg3, int arg4);
}
