import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class18 extends class167 implements class201 {

    @OriginalMember(owner = "client!l", name = "u", descriptor = "Z")
    private boolean field804 = false;

    @OriginalMember(owner = "client!l", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Lhga;")
    private class158 field803 = new class158();

    @OriginalMember(owner = "client!l", name = "J", descriptor = "I")
    private int field819 = 4096;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "I")
    private int field814 = 4096;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "Lsl;")
    private class427 field820 = new class427(4);

    @OriginalMember(owner = "client!l", name = "P", descriptor = "Z")
    private boolean field825 = false;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "Lq;")
    private class396 field821;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "[I")
    private static int[] field806 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!l", name = "x", descriptor = "[S")
    private static short[] field807 = new short[8191];

    @OriginalMember(owner = "client!l", name = "z", descriptor = "[I")
    public static int[] field809 = field806;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "[B")
    private static byte[] field811 = new byte[8191];

    @OriginalMember(owner = "client!l", name = "H", descriptor = "[I")
    private static int[] field817 = field806;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "[F")
    private static float[] field812 = new float[20];

    @OriginalMember(owner = "client!l", name = "G", descriptor = "[I")
    private static int[] field816 = new int[8191];

    @OriginalMember(owner = "client!l", name = "A", descriptor = "[I")
    private static int[] field810 = field806;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "[I")
    public static int[] field815 = new int[6];

    @OriginalMember(owner = "client!l", name = "I", descriptor = "[F")
    private static float[] field818 = field812;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "[I")
    private static int[] field808 = new int[8191];

    @OriginalMember(owner = "client!l", name = "N", descriptor = "I")
    public int field823;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "Lm;")
    private class176 field805;

    @OriginalMember(owner = "client!l", name = "M", descriptor = "Lta;")
    private class196 field822;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "Lq;")
    private class396 field813;

    @OriginalMember(owner = "client!l", name = "O", descriptor = "[Lqa;")
    private class227[] field824;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "(I[I[F)V")
    private final native void method412(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
    public final void method146(int arg0) {
        this.field823 = arg0;
        this.field824 = new class227[this.field823];
        for (int var2 = 0; var2 < this.field823; ++var2) {
            this.field824[var2] = new class227(this, this.field819, this.field814);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lfi;Z)V")
    private final void method413(class518 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class332 var8 = (class332) arg0.field7307.method1446((byte) 109); var8 != null; var8 = (class332) arg0.field7307.method1452(26832)) {
            field817[var3++] = var8.field4831;
            field817[var3++] = var8.field4833;
            field817[var3++] = var8.field4837;
            field816[var4++] = var8.field4835;
            field807[var6++] = (short) var8.field4840;
            field808[var5++] = var8.field4838;
            if (arg1) {
                field811[var7++] = var8.field4834;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "u", descriptor = "()Lmp;")
    public final class706 method19() {
        return new class706(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!l", name = "A", descriptor = "()Z")
    public final boolean method25() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIII)Lf;")
    public final class702 method54(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class622(this, this.field805, arg0, arg1, arg2, arg3, arg4) : new class464(this, this.field805, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class622(this, this.field805, arg0, arg1, arg2, arg3, arg4) : new class464(this, this.field805, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!l", name = "ra", descriptor = "(F)V")
    public final native void method143(float arg0);

    @OriginalMember(owner = "client!l", name = "FA", descriptor = "(ILua;II)V")
    public final native void method120(int arg0, class619 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "CA", descriptor = "(IIII)V")
    public final native void method180(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "L", descriptor = "()V")
    public final native void method59();

    @OriginalMember(owner = "client!l", name = "pa", descriptor = "(III)V")
    public final native void method152(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!l", name = "U", descriptor = "()I")
    public final native int method86();

    @OriginalMember(owner = "client!l", name = "EA", descriptor = "(Le;)V")
    private final native void method414(class495 arg0);

    @OriginalMember(owner = "client!l", name = "JA", descriptor = "()V")
    public final native void method107();

    @OriginalMember(owner = "client!l", name = "v", descriptor = "()[I")
    public final native int[] method109();

    @OriginalMember(owner = "client!l", name = "a", descriptor = "()Lq;")
    public final class396 method169() {
        return this.field813;
    }

    @OriginalMember(owner = "client!l", name = "p", descriptor = "()V")
    public final void method94() {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lf;Z)V")
    public final void method132(class702 arg0, boolean arg1) {
        if (arg0 instanceof class464) {
            this.method426((class464) arg0);
        } else if (arg0 instanceof class622) {
            this.method427((class622) arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V")
    public final void method41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method416(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V")
    public final void method52(boolean arg0) {
    }

    @OriginalMember(owner = "client!l", name = "R", descriptor = "()V")
    private final native void method415();

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[Lff;)V")
    public final void method75(int arg0, class9[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field810[var3++] = arg1[var4].method276(-1);
            field810[var3++] = arg1[var4].method273(false);
            field810[var3++] = arg1[var4].method270(-112);
            field810[var3++] = arg1[var4].method274((byte) 34);
            field818[var4] = arg1[var4].method277(-1);
            field810[var3++] = arg1[var4].method269(true);
        }
        this.method412(arg0, field810, field818);
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "()Z")
    public final boolean method114() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "B", descriptor = "()Z")
    public final boolean method162() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "w", descriptor = "(IIIIII)V")
    private final native void method416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "m", descriptor = "(IIIII)V")
    public final native void method69(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "h", descriptor = "()Z")
    public final boolean method127() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method185(Canvas arg0) {
        if (arg0 != null) {
            class196 var2 = (class196) this.field820.method2596((long) arg0.hashCode(), 72);
            this.field822 = var2;
            this.method419(var2);
        } else {
            this.field822 = null;
            this.method419((class196) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "D", descriptor = "()Lqa;")
    public final class227 method417() {
        for (int var1 = 0; var1 < this.field823; ++var1) {
            if (this.field824[var1].field3376 == Thread.currentThread()) {
                return this.field824[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!l", name = "j", descriptor = "()I")
    public final int method151() {
        return 4;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
    public final native int method149();

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V")
    public final void method64(int arg0) {
        this.field824[arg0].method1541();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljs;Ljs;FLjs;)Ljs;")
    public final class304 method89(class304 arg0, class304 arg1, float arg2, class304 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V")
    public final void method92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method417().method1552(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "i", descriptor = "()V")
    public final void method2() {
    }

    @OriginalMember(owner = "client!l", name = "AA", descriptor = "(III[I)V")
    public final native void method93(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
    public final void method177(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!l", name = "qa", descriptor = "(I)V")
    private final native void method418(int arg0);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ldaa;[Lvw;Z)Lla;")
    public final class421 method160(class11 arg0, class279[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field4174;
            var5[var7] = arg1[var7].field4171;
            if (arg1[var7].field4170 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class171(this, this.field805, arg0, arg1, (class702[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class280(this, this.field805, arg0, arg1, (class702[]) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;)V")
    public class18(Canvas arg0, class214 arg1) {
        super(arg1);
        try {
            if (!class251.method1681("sw3d", 334)) {
                throw new RuntimeException("");
            } else {
                class541.method3119((byte) 105);
                this.method423(super.field2768, 0, 0);
                class377.method2364(false, true, -40);
                this.field825 = true;
                this.field821 = new class94();
                this.method145(new class94());
                this.method146(1);
                this.method134(0);
                if (arg0 != null) {
                    this.method46(arg0);
                    this.method185(arg0);
                }
            }
        } catch (Throwable var3) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!l", name = "ia", descriptor = "(Lta;)V")
    private final native void method419(class196 arg0);

    @OriginalMember(owner = "client!l", name = "GA", descriptor = "(II)V")
    public final native void method11(int arg0, int arg1);

    @OriginalMember(owner = "client!l", name = "O", descriptor = "(IIIIII)Z")
    public final native boolean method33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
    public final int method35(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(IIIIII)Ljs;")
    public final class304 method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!l", name = "IA", descriptor = "(IIIIII[BII)V")
    public final native void method76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "YA", descriptor = "(IIII)V")
    public final native void method39(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Le;)V")
    public final void method84(class495 arg0) {
        this.field805 = (class176) arg0;
        this.method414(arg0);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lnda;IIII)Lda;")
    public final class55 method37(class519 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class538(this, this.field805, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "()V")
    public final void method111() {
        this.method185(this.field822.field3071);
    }

    @OriginalMember(owner = "client!l", name = "UA", descriptor = "(Z)V")
    public final native void method420(boolean arg0);

    @OriginalMember(owner = "client!l", name = "l", descriptor = "()Z")
    public final boolean method98() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "W", descriptor = "(S)Z")
    private final boolean method421(short arg0) {
        class214 var2 = super.field2768;
        synchronized (super.field2768) {
            if (!super.field2768.method1499(arg0, -24052)) {
                return false;
            } else {
                class699 var4 = super.field2768.method1500(arg0, -121);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (!var4.field9840) {
                        var6 = super.field2768.method1495(arg0, true, 0.7F, 128, 128, 32682);
                    } else {
                        var6 = super.field2768.method1496(arg0, 128, 0.7F, true, 128, -15473);
                    }
                    this.method425(arg0, var4.field9843, var4.field9838, var4.field9846, var4.field9844, var4.field9839, var4.field9852, var4.field9834, var4.field9829, var4.field9828, var4.field9835, var4.field9847, var4.field9832, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(IIIIII)V")
    public final void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method126(arg0, arg1, arg2, arg4, arg5);
        this.method126(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method69(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method69(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "MA", descriptor = "(III[I)V")
    public final native void method178(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
    public final void method163(boolean arg0) {
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "()Z")
    public final boolean method173() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZ)Lf;")
    public final class702 method182(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class622(this, this.field805, arg0, arg1, arg2, arg3) : new class464(this, this.field805, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!l", name = "V", descriptor = "(IIII)V")
    public final native void method144(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lvw;Z)Lf;")
    public final class702 method170(class279 arg0, boolean arg1) {
        int[] var3 = arg0.field4169;
        byte[] var4 = arg0.field4167;
        int var5 = arg0.field4174;
        int var6 = arg0.field4171;
        class702 var7;
        if (arg1 && arg0.field4170 == null) {
            var7 = new class274(this, this.field805, var3, var4, 0, arg0.field4174, arg0.field4174, arg0.field4171);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field4170;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class622(this, this.field805, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field4169[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class622(this, this.field805, var9, 0, arg0.field4174, arg0.field4174, arg0.field4171);
                } else {
                    var7 = new class464(this, this.field805, var9, 0, arg0.field4174, arg0.field4174, arg0.field4171);
                }
            }
        }
        var7.method1787(arg0.field4168, arg0.field4172, arg0.field4173, arg0.field4175);
        return var7;
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "()Z")
    public final boolean method159() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIF)Lff;")
    public final class9 method139(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class465(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)Lf;")
    public final class702 method186(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class622(this, this.field805, arg0, arg1) : new class464(this, this.field805, arg0, arg1);
    }

    @OriginalMember(owner = "client!l", name = "q", descriptor = "()Z")
    public final boolean method12() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V")
    public final void method122(int arg0) {
        class541.method3121(0);
        this.method418(arg0);
        for (class176 var2 = (class176) this.field803.method1224(-2); var2 != null; var2 = (class176) this.field803.method1232(-2)) {
            var2.method1317();
        }
    }

    @OriginalMember(owner = "client!l", name = "r", descriptor = "()Z")
    public final boolean method147() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)I")
    public final int method34(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!l", name = "va", descriptor = "(I)V")
    public final native void method48(int arg0);

    @OriginalMember(owner = "client!l", name = "x", descriptor = "()V")
    public final void method63() throws class105 {
        if (this.field822 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field822.method1407();
        }
    }

    @OriginalMember(owner = "client!l", name = "k", descriptor = "()Lq;")
    public final class396 method168() {
        return new class94();
    }

    @OriginalMember(owner = "client!l", name = "ja", descriptor = "(I)V")
    public final native void method42(int arg0);

    @OriginalMember(owner = "client!l", name = "DA", descriptor = "()I")
    public final native int method116();

    @OriginalMember(owner = "client!l", name = "VA", descriptor = "(IFFFFF)V")
    public final native void method95(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!l", name = "fa", descriptor = "()Ljava/lang/Object;")
    private final Object method422() {
        return new class618(this);
    }

    @OriginalMember(owner = "client!l", name = "OA", descriptor = "(Lfa;II)V")
    private final native void method423(class214 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!l", name = "A", descriptor = "(S)Z")
    private final boolean method424(short arg0) {
        synchronized (this) {
            class699 var3 = super.field2768.method1500(arg0, -70);
            if (var3 == null) {
                return false;
            } else {
                this.method431(arg0, var3.field9843, var3.field9838, var3.field9846, var3.field9844, var3.field9839, var3.field9852, var3.field9834, var3.field9829, var3.field9828, var3.field9835, var3.field9847, var3.field9832);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "xa", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method425(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!l", name = "q", descriptor = "(Lva;)V")
    private final native void method426(class464 arg0);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljs;)V")
    public final void method165(class304 arg0) {
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIII)V")
    public final native void method85(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "la", descriptor = "(IIII)V")
    public final native void method62(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method44(Canvas arg0) {
        class196 var2 = (class196) this.field820.method2596((long) arg0.hashCode(), 74);
        Dimension var3 = arg0.getSize();
        var2.method1403(arg0, var3.width, var3.height);
        if (arg0 != null && this.field822.field3071 == arg0) {
            this.method185(arg0);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public final void method134(int arg0) {
        this.field824[arg0].method1542();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFF)V")
    public final void method27(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method1265((byte) -67);
        if (this.nativeid != 0L) {
            class541.method3123(14336, this);
        }
    }

    @OriginalMember(owner = "client!l", name = "BA", descriptor = "()I")
    public final native int method66();

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method23(Canvas arg0) {
        if (this.field822.field3071 == arg0) {
            this.method185((Canvas) null);
        }
        class196 var2 = (class196) this.field820.method2596((long) arg0.hashCode(), 91);
        if (var2 != null) {
            var2.method2588(300);
            var2.method1410();
        }
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(I)Le;")
    public final class495 method32(int arg0) {
        class176 var2 = new class176(this, arg0);
        this.field803.method1229(var2, (byte) 120);
        return var2;
    }

    @OriginalMember(owner = "client!l", name = "ma", descriptor = "(Lt;)V")
    private final native void method427(class622 arg0);

    @OriginalMember(owner = "client!l", name = "ya", descriptor = "()V")
    public final native void method28();

    @OriginalMember(owner = "client!l", name = "J", descriptor = "(IIIIII)V")
    public final native void method4(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "w", descriptor = "()Z")
    public final boolean method74() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "t", descriptor = "()Z")
    public final boolean method181() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "n", descriptor = "()V")
    public final void method40() {
        if (!this.field804) {
            this.field824 = null;
            this.field822 = null;
            this.field805 = null;
            this.field821 = null;
            this.field820.method2600((byte) -114);
            for (class176 var1 = (class176) this.field803.method1224(-2); var1 != null; var1 = (class176) this.field803.method1232(-2)) {
                var1.method1316();
            }
            this.field803.method1222((byte) -117);
            this.method415();
            if (this.field825) {
                class543.method3130(true, false, 123);
                this.field825 = false;
            }
            this.method428();
            class541.method3120((byte) 92);
            this.field804 = true;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V")
    public final void method140(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method29(Rectangle[] arg0, int arg1) throws class105 {
        if (this.field822 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field822.method1408(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([I)V")
    public final void method119(int[] arg0) {
        Dimension var2 = this.field822.field3071.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!l", name = "WA", descriptor = "()V")
    private final void method428() {
        System.gc();
        System.runFinalization();
        class541.method3121(0);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIILua;II)V")
    public final void method24(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class619 arg6, int arg7, int arg8) {
        this.method429(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!l", name = "y", descriptor = "()V")
    public final void method103() {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lq;)V")
    public final void method145(class396 arg0) {
        this.field813 = arg0;
        this.method430(arg0);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[I[I)Lua;")
    public final class619 method158(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class383(this, this.field805, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "(IIIIIILua;II)V")
    private final native void method429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class619 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "m", descriptor = "()Z")
    public final boolean method171() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lfi;I)V")
    public final void method72(class518 arg0, int arg1) {
        this.method413(arg0, false);
        this.method417().method1545(this, field817, field816, field808, field807, arg0.field7307.method1449(85));
    }

    @OriginalMember(owner = "client!l", name = "o", descriptor = "()Z")
    public final boolean method17() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lfi;)V")
    public final void method123(class518 arg0) {
        this.method413(arg0, false);
        this.method417().method1545(this, field817, field816, field808, field807, arg0.field7307.method1449(105));
    }

    @OriginalMember(owner = "client!l", name = "XA", descriptor = "(IIIII)V")
    public final native void method126(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "da", descriptor = "(IIII)V")
    public final native void method142(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public final class37 method113(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class256(this, this.field805, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "T", descriptor = "()I")
    public final native int method102();

    @OriginalMember(owner = "client!l", name = "NA", descriptor = "(Lq;)V")
    private final native void method430(class396 arg0);

    @OriginalMember(owner = "client!l", name = "oa", descriptor = "([I)V")
    public final native void method131(int[] arg0);

    @OriginalMember(owner = "client!l", name = "h", descriptor = "(IIII)[I")
    public final native int[] method50(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "ZA", descriptor = "(Z)V")
    public final native void method81(boolean arg0);

    @OriginalMember(owner = "client!l", name = "c", descriptor = "()Lq;")
    public final class396 method53() {
        return this.field821;
    }

    @OriginalMember(owner = "client!l", name = "C", descriptor = "()Z")
    public final boolean method31() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method46(Canvas arg0) {
        class196 var2 = (class196) this.field820.method2596((long) arg0.hashCode(), 116);
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class196 var5 = new class196(this, arg0);
            this.field820.method2598(var5, (long) arg0.hashCode(), (byte) 8);
        }
    }

    @OriginalMember(owner = "client!l", name = "z", descriptor = "()V")
    public final void method174() {
    }

    @OriginalMember(owner = "client!l", name = "s", descriptor = "()V")
    public final void method106() {
    }

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method431(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);
}
