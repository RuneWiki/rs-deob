import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class18 extends class166 implements class198 {

    @OriginalMember(owner = "client!l", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "Z")
    private boolean field192 = false;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "Lwba;")
    private class46 field190 = new class46();

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    private int field203 = 4096;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    private int field196 = 4096;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "Lkea;")
    private class213 field204 = new class213(4);

    @OriginalMember(owner = "client!l", name = "K", descriptor = "Z")
    private boolean field212 = false;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "Lq;")
    private class391 field205;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "[I")
    private static int[] field193 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!l", name = "t", descriptor = "[I")
    private static int[] field195 = field193;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "[I")
    private static int[] field197 = new int[8191];

    @OriginalMember(owner = "client!l", name = "w", descriptor = "[S")
    private static short[] field198 = new short[8191];

    @OriginalMember(owner = "client!l", name = "x", descriptor = "[B")
    private static byte[] field199 = new byte[8191];

    @OriginalMember(owner = "client!l", name = "z", descriptor = "[I")
    private static int[] field201 = field193;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "[I")
    private static int[] field200 = new int[8191];

    @OriginalMember(owner = "client!l", name = "F", descriptor = "[I")
    public static int[] field207 = new int[6];

    @OriginalMember(owner = "client!l", name = "E", descriptor = "[F")
    private static float[] field206 = new float[20];

    @OriginalMember(owner = "client!l", name = "H", descriptor = "[I")
    public static int[] field209 = field193;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "[F")
    private static float[] field202 = field206;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "I")
    public int field210;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "Lm;")
    private class175 field191;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "Lta;")
    private class193 field208;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "Lq;")
    private class391 field194;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "[Lqa;")
    private class222[] field211;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "()Lq;")
    public final class391 method100() {
        return new class93();
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V")
    public final void method101(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!l", name = "qa", descriptor = "(I)V")
    private final native void method102(int arg0);

    @OriginalMember(owner = "client!l", name = "m", descriptor = "(IIIII)V")
    public final native void method103(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "f", descriptor = "()Z")
    public final boolean method104() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "I", descriptor = "(I[I[F)V")
    private final native void method105(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "()Z")
    public final boolean method106() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "V", descriptor = "(IIII)V")
    public final native void method107(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "A", descriptor = "()Z")
    public final boolean method108() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "t", descriptor = "()Z")
    public final boolean method109() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "BA", descriptor = "()I")
    public final native int method110();

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method111(Canvas arg0) {
        if (this.field208.field2782 == arg0) {
            this.method143((Canvas) null);
        }
        class193 var2 = (class193) this.field204.method1405((long) arg0.hashCode(), (byte) -127);
        if (var2 != null) {
            var2.method3678(-1);
            var2.method1296();
        }
    }

    @OriginalMember(owner = "client!l", name = "xa", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method112(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V")
    public final void method113(int arg0) {
        this.field210 = arg0;
        this.field211 = new class222[this.field210];
        for (int var2 = 0; var2 < this.field210; ++var2) {
            this.field211[var2] = new class222(this, this.field203, this.field196);
        }
    }

    @OriginalMember(owner = "client!l", name = "J", descriptor = "(IIIIII)V")
    public final native void method114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "U", descriptor = "()I")
    public final native int method115();

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljba;)V")
    public final void method116(class363 arg0) {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)Ljba;")
    public final class363 method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIII)V")
    public final native void method118(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "W", descriptor = "(S)Z")
    private final boolean method119(short arg0) {
        class209 var2 = super.field2384;
        synchronized (super.field2384) {
            if (!super.field2384.method1383(arg0, -58)) {
                return false;
            } else {
                class159 var4 = super.field2384.method1386(arg0, -6514);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (!var4.field2295) {
                        var6 = super.field2384.method1381(128, arg0, 0.7F, 128, -104, true);
                    } else {
                        var6 = super.field2384.method1384(true, 128, 128, arg0, 0.7F, (byte) 125);
                    }
                    this.method112(arg0, var4.field2292, var4.field2297, var4.field2289, var4.field2305, var4.field2299, var4.field2298, var4.field2293, var4.field2300, var4.field2283, var4.field2284, var4.field2301, var4.field2285, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)Le;")
    public final class492 method120(int arg0) {
        class175 var2 = new class175(this, arg0);
        this.field190.method474(var2, 6);
        return var2;
    }

    @OriginalMember(owner = "client!l", name = "L", descriptor = "()V")
    public final native void method121();

    @OriginalMember(owner = "client!l", name = "pa", descriptor = "(III)V")
    public final native void method122(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!l", name = "x", descriptor = "()Z")
    public final boolean method123() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method124(Canvas arg0) {
        class193 var2 = (class193) this.field204.method1405((long) arg0.hashCode(), (byte) -46);
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class193 var5 = new class193(this, arg0);
            this.field204.method1403((byte) -18, var5, (long) arg0.hashCode());
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(Z)V")
    public final void method125(boolean arg0) {
    }

    @OriginalMember(owner = "client!l", name = "R", descriptor = "()V")
    private final native void method126();

    @OriginalMember(owner = "client!l", name = "k", descriptor = "()Z")
    public final boolean method127() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Luq;[Lfg;Z)Lla;")
    public final class416 method128(class146 arg0, class113[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field1706;
            var5[var7] = arg1[var7].field1708;
            if (arg1[var7].field1701 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class170(this, this.field191, arg0, arg1, (class702[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class275(this, this.field191, arg0, arg1, (class702[]) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "j", descriptor = "()Z")
    public final boolean method129() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "z", descriptor = "()Lq;")
    public final class391 method130() {
        return this.field205;
    }

    @OriginalMember(owner = "client!l", name = "UA", descriptor = "(Z)V")
    public final native void method131(boolean arg0);

    @OriginalMember(owner = "client!l", name = "ra", descriptor = "(F)V")
    public final native void method132(float arg0);

    @OriginalMember(owner = "client!l", name = "CA", descriptor = "(IIII)V")
    public final native void method133(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[Lrc;)V")
    public final void method134(int arg0, class498[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field201[var3++] = arg1[var4].method2883(126);
            field201[var3++] = arg1[var4].method2877(-1);
            field201[var3++] = arg1[var4].method2875(true);
            field201[var3++] = arg1[var4].method2880(-15);
            field202[var4] = arg1[var4].method2876(1);
            field201[var3++] = arg1[var4].method2878((byte) -111);
        }
        this.method105(arg0, field201, field202);
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
    public final void method135(int arg0) {
        this.field211[arg0].method1458();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZ)Lf;")
    public final class702 method136(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class620(this, this.field191, arg0, arg1, arg2, arg3) : new class459(this, this.field191, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!l", name = "IA", descriptor = "(IIIIII[BII)V")
    public final native void method137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lfg;Z)Lf;")
    public final class702 method138(class113 arg0, boolean arg1) {
        int[] var3 = arg0.field1702;
        byte[] var4 = arg0.field1709;
        int var5 = arg0.field1706;
        int var6 = arg0.field1708;
        class702 var7;
        if (arg1 && arg0.field1701 == null) {
            var7 = new class269(this, this.field191, var3, var4, 0, arg0.field1706, arg0.field1706, arg0.field1708);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field1701;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class620(this, this.field191, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field1702[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class620(this, this.field191, var9, 0, arg0.field1706, arg0.field1706, arg0.field1708);
                } else {
                    var7 = new class459(this, this.field191, var9, 0, arg0.field1706, arg0.field1706, arg0.field1708);
                }
            }
        }
        var7.method935(arg0.field1704, arg0.field1707, arg0.field1705, arg0.field1703);
        return var7;
    }

    @OriginalMember(owner = "client!l", name = "ja", descriptor = "(I)V")
    public final native void method139(int arg0);

    @OriginalMember(owner = "client!l", name = "y", descriptor = "()Lis;")
    public final class463 method140() {
        return new class463(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!l", name = "WA", descriptor = "()V")
    private final void method141() {
        System.gc();
        System.runFinalization();
        class509.method2925(0);
    }

    @OriginalMember(owner = "client!l", name = "GA", descriptor = "(II)V")
    public final native void method142(int arg0, int arg1);

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method143(Canvas arg0) {
        if (arg0 != null) {
            class193 var2 = (class193) this.field204.method1405((long) arg0.hashCode(), (byte) -95);
            this.field208 = var2;
            this.method199(var2);
        } else {
            this.field208 = null;
            this.method199((class193) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIILua;II)V")
    public final void method144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class617 arg6, int arg7, int arg8) {
        this.method201(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!l", name = "v", descriptor = "()[I")
    public final native int[] method145();

    @OriginalMember(owner = "client!l", name = "EA", descriptor = "(Le;)V")
    private final native void method146(class492 arg0);

    @OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
    public final native int method147();

    @OriginalMember(owner = "client!l", name = "o", descriptor = "()Z")
    public final boolean method148() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIIII)V")
    public final void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method206(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "p", descriptor = "()V")
    public final void method150() {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public final void method151(int arg0) {
        class509.method2925(0);
        this.method102(arg0);
        for (class175 var2 = (class175) this.field190.method472((byte) -101); var2 != null; var2 = (class175) this.field190.method482(118)) {
            var2.method1194();
        }
    }

    @OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method1154(false);
        if (this.nativeid != 0L) {
            class509.method2924((byte) -106, this);
        }
    }

    @OriginalMember(owner = "client!l", name = "JA", descriptor = "()V")
    public final native void method152();

    @OriginalMember(owner = "client!l", name = "l", descriptor = "()Lq;")
    public final class391 method153() {
        return this.field194;
    }

    @OriginalMember(owner = "client!l", name = "va", descriptor = "(I)V")
    public final native void method154(int arg0);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lq;)V")
    public final void method155(class391 arg0) {
        this.field194 = arg0;
        this.method207(arg0);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lvi;)V")
    public final void method156(class499 arg0) {
        this.method177(arg0, false);
        this.method187().method1463(this, field195, field200, field197, field198, arg0.field7068.method3345(true));
    }

    @OriginalMember(owner = "client!l", name = "C", descriptor = "()V")
    public final void method157() {
    }

    @OriginalMember(owner = "client!l", name = "m", descriptor = "()V")
    public final void method158() {
        if (!this.field192) {
            this.field211 = null;
            this.field208 = null;
            this.field191 = null;
            this.field205 = null;
            this.field204.method1409((byte) 119);
            for (class175 var1 = (class175) this.field190.method472((byte) -27); var1 != null; var1 = (class175) this.field190.method482(127)) {
                var1.method1193();
            }
            this.field190.method475(6);
            this.method126();
            if (this.field212) {
                class618.method3427(false, true, -83);
                this.field212 = false;
            }
            this.method141();
            class509.method2922(101);
            this.field192 = true;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V")
    public final void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method187().method1462(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)I")
    public final int method160(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "()Z")
    public final boolean method161() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "u", descriptor = "()Z")
    public final boolean method162() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V")
    public final void method163(int arg0) {
        this.field211[arg0].method1459();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[I[I)Lua;")
    public final class617 method164(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class378(this, this.field191, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lvi;I)V")
    public final void method165(class499 arg0, int arg1) {
        this.method177(arg0, false);
        this.method187().method1463(this, field195, field200, field197, field198, arg0.field7068.method3345(true));
    }

    @OriginalMember(owner = "client!l", name = "s", descriptor = "()Z")
    public final boolean method166() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "q", descriptor = "()Z")
    public final boolean method167() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "da", descriptor = "(IIII)V")
    public final native void method168(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "FA", descriptor = "(ILua;II)V")
    public final native void method169(int arg0, class617 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method170(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Llm;IIII)Lda;")
    public final class55 method171(class461 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class536(this, this.field191, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
    public final int method172(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!l", name = "w", descriptor = "()I")
    public final int method173() {
        return 4;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "()V")
    public final void method174() {
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;)V")
    public class18(Canvas arg0, class209 arg1) {
        super(arg1);
        try {
            if (!class271.method1788("sw3d", -54)) {
                throw new RuntimeException("");
            } else {
                class509.method2921((byte) -109);
                this.method217(super.field2384, 0, 0);
                class489.method2838(false, true, (byte) 58);
                this.field212 = true;
                this.field205 = new class93();
                this.method155(new class93());
                this.method113(1);
                this.method135(0);
                if (arg0 != null) {
                    this.method124(arg0);
                    this.method143(arg0);
                }
            }
        } catch (Throwable var3) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)Lf;")
    public final class702 method175(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class620(this, this.field191, arg0, arg1) : new class459(this, this.field191, arg0, arg1);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V")
    public final void method176(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lvi;Z)V")
    private final void method177(class499 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class635 var8 = (class635) arg0.field7068.method3341(false); var8 != null; var8 = (class635) arg0.field7068.method3342(118)) {
            field195[var3++] = var8.field8982;
            field195[var3++] = var8.field8988;
            field195[var3++] = var8.field8987;
            field200[var4++] = var8.field8986;
            field198[var6++] = (short) var8.field8990;
            field197[var5++] = var8.field8989;
            if (arg1) {
                field199[var7++] = var8.field8981;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "ZA", descriptor = "(Z)V")
    public final native void method178(boolean arg0);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
    public final void method179(boolean arg0) {
    }

    @OriginalMember(owner = "client!l", name = "O", descriptor = "(IIIIII)Z")
    public final native boolean method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIF)Lrc;")
    public final class498 method181(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class153(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method182(Canvas arg0) {
        class193 var2 = (class193) this.field204.method1405((long) arg0.hashCode(), (byte) -18);
        Dimension var3 = arg0.getSize();
        var2.method1300(arg0, var3.width, var3.height);
        if (arg0 != null && this.field208.field2782 == arg0) {
            this.method143(arg0);
        }
    }

    @OriginalMember(owner = "client!l", name = "B", descriptor = "()V")
    public final void method183() {
    }

    @OriginalMember(owner = "client!l", name = "la", descriptor = "(IIII)V")
    public final native void method184(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "VA", descriptor = "(IFFFFF)V")
    public final native void method185(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!l", name = "g", descriptor = "()Z")
    public final boolean method186() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "D", descriptor = "()Lqa;")
    public final class222 method187() {
        for (int var1 = 0; var1 < this.field210; ++var1) {
            if (this.field211[var1].field3131 == Thread.currentThread()) {
                return this.field211[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lf;Z)V")
    public final void method188(class702 arg0, boolean arg1) {
        if (arg0 instanceof class459) {
            this.method218((class459) arg0);
        } else if (arg0 instanceof class620) {
            this.method191((class620) arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!l", name = "fa", descriptor = "()Ljava/lang/Object;")
    private final Object method189() {
        return new class616(this);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljba;Ljba;FLjba;)Ljba;")
    public final class363 method190(class363 arg0, class363 arg1, float arg2, class363 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!l", name = "ma", descriptor = "(Lt;)V")
    private final native void method191(class620 arg0);

    @OriginalMember(owner = "client!l", name = "DA", descriptor = "()I")
    public final native int method192();

    @OriginalMember(owner = "client!l", name = "h", descriptor = "(IIII)[I")
    public final native int[] method193(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "ya", descriptor = "()V")
    public final native void method194();

    @OriginalMember(owner = "client!l", name = "YA", descriptor = "(IIII)V")
    public final native void method195(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Le;)V")
    public final void method196(class492 arg0) {
        this.field191 = (class175) arg0;
        this.method146(arg0);
    }

    @OriginalMember(owner = "client!l", name = "AA", descriptor = "(III[I)V")
    public final native void method197(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method198(Rectangle[] arg0, int arg1) throws class621 {
        if (this.field208 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field208.method1298(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!l", name = "ia", descriptor = "(Lta;)V")
    private final native void method199(class193 arg0);

    @OriginalMember(owner = "client!l", name = "T", descriptor = "()I")
    public final native int method200();

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "(IIIIIILua;II)V")
    private final native void method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class617 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "XA", descriptor = "(IIIII)V")
    public final native void method202(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "r", descriptor = "()V")
    public final void method203() throws class621 {
        if (this.field208 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field208.method1301();
        }
    }

    @OriginalMember(owner = "client!l", name = "oa", descriptor = "([I)V")
    public final native void method204(int[] arg0);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFF)V")
    public final void method205(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!l", name = "w", descriptor = "(IIIIII)V")
    private final native void method206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "NA", descriptor = "(Lq;)V")
    private final native void method207(class391 arg0);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([I)V")
    public final void method208(int[] arg0) {
        Dimension var2 = this.field208.field2782.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIII)Lf;")
    public final class702 method209(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class620(this, this.field191, arg0, arg1, arg2, arg3, arg4) : new class459(this, this.field191, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class620(this, this.field191, arg0, arg1, arg2, arg3, arg4) : new class459(this, this.field191, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "()V")
    public final void method210() {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!l", name = "A", descriptor = "(S)Z")
    private final boolean method212(short arg0) {
        synchronized (this) {
            class159 var3 = super.field2384.method1386(arg0, -6514);
            if (var3 == null) {
                return false;
            } else {
                this.method170(arg0, var3.field2292, var3.field2297, var3.field2289, var3.field2305, var3.field2299, var3.field2298, var3.field2293, var3.field2300, var3.field2283, var3.field2284, var3.field2301, var3.field2285);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "h", descriptor = "()V")
    public final void method213() {
        this.method143(this.field208.field2782);
    }

    @OriginalMember(owner = "client!l", name = "MA", descriptor = "(III[I)V")
    public final native void method214(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public final class37 method215(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class251(this, this.field191, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "i", descriptor = "()Z")
    public final boolean method216() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "OA", descriptor = "(Lfa;II)V")
    private final native void method217(class209 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!l", name = "q", descriptor = "(Lva;)V")
    private final native void method218(class459 arg0);

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(IIIIII)V")
    public final void method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method202(arg0, arg1, arg2, arg4, arg5);
        this.method202(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method103(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method103(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }
}
