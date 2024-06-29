import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class166 extends class38 implements class105 {

    @OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "Loe;")
    private class137 field2436 = new class137();

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "I")
    private int field2451 = 4096;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "I")
    private int field2453 = 4096;

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "Lgu;")
    private class412 field2455 = new class412(4);

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "Z")
    private boolean field2458 = false;

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "Lc;")
    private class125 field2452;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "[I")
    private static int[] field2437 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "[S")
    private static short[] field2438 = new short[8191];

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "[F")
    private static float[] field2441 = new float[20];

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "[I")
    public static int[] field2444 = new int[6];

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "[I")
    private static int[] field2447 = new int[8191];

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field2448 = Boolean.FALSE;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "[I")
    private static int[] field2442 = field2437;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "[I")
    private static int[] field2446 = field2437;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "[I")
    public static int[] field2439 = field2437;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "[F")
    private static float[] field2440 = field2441;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "[B")
    private static byte[] field2445 = new byte[8191];

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "[I")
    private static int[] field2449 = new int[8191];

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "I")
    private int field2456;

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "Lza;")
    private class288 field2450;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "Lna;")
    private class35 field2443;

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2454;

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "[Ln;")
    private class15[] field2457;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "()F")
    public final native float method335();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lt;Lkp;Lc;[Lju;I)V")
    public final void method279(class475[] arg0, class341 arg1, class125 arg2, class83[] arg3, int arg4) {
        this.method1113(arg1, true);
        if (arg3 == null) {
            this.method1111().method109(this, arg0, arg2, (int[]) null, arg4, field2442, field2447, field2449, field2438, field2445, arg1.field5066.method2710(0), field2439);
        } else {
            class83 var6 = arg3[0];
            field2444[5] = 0;
            this.method1111().method109(this, arg0, arg2, field2444, arg4, field2442, field2447, field2449, field2438, field2445, arg1.field5066.method2710(0), field2439);
            var6.field1200 = field2444[0];
            var6.field1203 = field2444[1];
            var6.field1199 = field2444[2];
            var6.field1202 = field2444[3];
            var6.field1198 = field2444[4];
            var6.field1201 = field2444[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class44 var9 = (class44) arg0[var8];
                var9.method444(var7, arg2);
                if (var9.field561 != null) {
                    var7 += var9.field561.length * 9;
                }
                if (var9.field559 != null) {
                    var7 += var9.field559.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "da", descriptor = "([I)V")
    public final native void method351(int[] arg0);

    @OriginalMember(owner = "client!qa", name = "FA", descriptor = "()V")
    private final native void method1104();

    @OriginalMember(owner = "client!qa", name = "UA", descriptor = "(III)V")
    public final native void method371(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "(IFFFFF)V")
    public final native void method324(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()Z")
    public final boolean method283() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()I")
    public final native int method308();

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "(IIIIIILma;II)V")
    private final native void method1105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class10 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "sa", descriptor = "(S)Z")
    private final boolean method1106(short arg0) {
        class279 var2 = super.field524;
        synchronized (super.field524) {
            if (!super.field524.method579(arg0, true)) {
                return false;
            } else {
                class281 var4 = super.field524.method584(true, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field4259 && var4.field4274) {
                        var6 = super.field524.method583(128, 128, arg0, 0.7F, (byte) -122, true);
                    } else {
                        var6 = super.field524.method581(arg0, true, 128, -27, 128, 0.7F);
                    }
                    this.method1118(arg0, var4.field4273, var4.field4271, var4.field4274, var4.field4259, var4.field4256, var4.field4269, var4.field4276, var4.field4261, var4.field4263, var4.field4266, var4.field4267, var4.field4260, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "()Z")
    public final boolean method307() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "aa", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method1107(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lga;Lod;)V")
    public class166(int arg0, Canvas arg1, class279 arg2, class352 arg3) {
        super(arg0, arg2);
        try {
            if (!field2448) {
                if (arg3 != null) {
                    arg3.method2200(this.getClass(), 0);
                    field2448 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("sw3d");
                    field2448 = Boolean.TRUE;
                }
            }
            if (!field2448) {
                throw new RuntimeException("");
            } else {
                this.method1109(super.field524, 0, 0);
                class257.method1714((byte) -35, false, true);
                this.field2458 = true;
                this.field2452 = new class31();
                this.method362(new class31());
                this.method334(1);
                this.method318(0);
                if (arg1 != null) {
                    this.method300(arg1);
                    this.method272(arg1);
                }
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public final void method265(int arg0) {
        this.field2457[arg0].method103();
    }

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "(Lu;)V")
    private final native void method1108(class54 arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lqp;)V")
    public final void method359(int arg0, class470[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field2446[var3++] = arg1[var4].method2835(-30143);
            field2446[var3++] = arg1[var4].method2832(false);
            field2446[var3++] = arg1[var4].method2833((byte) 94);
            field2446[var3++] = arg1[var4].method2838((byte) -86);
            field2440[var4] = arg1[var4].method2834(114);
            field2446[var3++] = arg1[var4].method2836((byte) 54);
        }
        this.method1115(arg0, field2446, field2440);
    }

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
    public final boolean method323() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "(IIII)V")
    public final native void method268(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method294(Canvas arg0) {
        if (this.field2454 == arg0) {
            this.method272((Canvas) null);
        }
        class288 var2 = (class288) this.field2455.method2585((byte) 114, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2677(-22491);
            var2.method1862();
        }
    }

    @OriginalMember(owner = "client!qa", name = "AA", descriptor = "(IIII)V")
    public final native void method309(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lpc;Lpc;FLpc;)Lpc;")
    public final class477 method338(class477 arg0, class477 arg1, float arg2, class477 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lqp;")
    public final class470 method322(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class498(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
    public final void method302(int arg0) {
        class438.method2702((byte) 37);
        this.method1119(arg0);
        for (class35 var2 = (class35) this.field2436.method1004((byte) -81); var2 != null; var2 = (class35) this.field2436.method996(1)) {
            var2.method238();
        }
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIIIII)V")
    public final void method352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1117(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "()V")
    public final void method357() {
        int var1 = 0;
        while (var1 < 9) {
            try {
                synchronized (this.field2454.getTreeLock()) {
                    this.field2450.method1858();
                    return;
                }
            } catch (Exception var6) {
                class434.method2690(10, 200L);
                ++var1;
            }
        }
        synchronized (this.field2454.getTreeLock()) {
            this.field2450.method1858();
        }
    }

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "()V")
    public final native void method331();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)I")
    public final int method317(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "(Lga;II)V")
    private final native void method1109(class279 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILma;II)V")
    public final void method266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class10 arg6, int arg7, int arg8) {
        this.method1105(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
    public final void method318(int arg0) {
        this.field2457[arg0].method115();
    }

    @OriginalMember(owner = "client!qa", name = "NA", descriptor = "(IIIII)V")
    public final native void method336(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "xa", descriptor = "()F")
    public final native float method275();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
    public final void method319(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1111().method114(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "(I)V")
    public final native void method360(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
    public final void method287(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "()Z")
    public final boolean method354() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "(F)V")
    public final native void method271(float arg0);

    @OriginalMember(owner = "client!qa", name = "fa", descriptor = "(IIII)V")
    public final native void method344(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "ea", descriptor = "(Lc;)V")
    public final native void method362(class125 arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lta;")
    public final class145 method361(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class43(this, this.field2443, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!qa", name = "YA", descriptor = "()I")
    public final native int method299();

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "()V")
    public final void method320() {
    }

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "(IIIIII)V")
    public final native void method284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(FF)V")
    public final native void method365(float arg0, float arg1);

    @OriginalMember(owner = "client!qa", name = "ca", descriptor = "(ILma;II)V")
    public final native void method270(int arg0, class10 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "()Z")
    public final boolean method340() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lt;Lkp;Lc;Lju;I)V")
    public final void method311(class475 arg0, class341 arg1, class125 arg2, class83 arg3, int arg4) {
        this.method1113(arg1, true);
        if (arg3 == null) {
            this.method1111().method108(this, arg0, arg2, (int[]) null, arg4, field2442, field2447, field2449, field2438, field2445, arg1.field5066.method2710(0), field2439);
        } else {
            field2444[5] = 0;
            this.method1111().method108(this, arg0, arg2, field2444, arg4, field2442, field2447, field2449, field2438, field2445, arg1.field5066.method2710(0), field2439);
            arg3.field1200 = field2444[0];
            arg3.field1203 = field2444[1];
            arg3.field1199 = field2444[2];
            arg3.field1202 = field2444[3];
            arg3.field1198 = field2444[4];
            arg3.field1201 = field2444[5] != 0;
        }
        class44 var6 = (class44) arg0;
        var6.method444(0, arg2);
    }

    @OriginalMember(owner = "client!qa", name = "SA", descriptor = "()Ljava/lang/Object;")
    private final Object method1110() {
        return new class148();
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()Z")
    public final boolean method295() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Ll;")
    public final class16 method269(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class72(this, this.field2443, arg0, arg1, arg2, arg3) : new class418(this, this.field2443, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()Lc;")
    public final class125 method291() {
        return new class31();
    }

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "()I")
    public final native int method315();

    @OriginalMember(owner = "client!qa", name = "EA", descriptor = "()V")
    public final native void method119();

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
    public final boolean method347() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "()V")
    public final void method297() {
    }

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "()V")
    public final void method349() {
        this.field2457 = null;
        this.field2450 = null;
        this.field2454 = null;
        this.field2443 = null;
        this.field2452 = null;
        this.field2455.method2588(-117);
        for (class35 var1 = (class35) this.field2436.method1004((byte) -83); var1 != null; var1 = (class35) this.field2436.method996(1)) {
            var1.method237();
        }
        this.field2436.method993(99);
        this.method1114();
        this.method1104();
        if (this.field2458) {
            class130.method964((byte) -126, true, false);
            this.field2458 = false;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lu;)V")
    public final void method281(class54 arg0) {
        this.field2443 = (class35) arg0;
        this.method1108(arg0);
    }

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "()Ln;")
    public final class15 method1111() {
        for (int var1 = 0; var1 < this.field2456; ++var1) {
            if (this.field2457[var1].field211 == Thread.currentThread()) {
                return this.field2457[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "(S)Z")
    private final boolean method1112(short arg0) {
        synchronized (this) {
            class281 var3 = super.field524.method584(true, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method1107(arg0, var3.field4273, var3.field4271, var3.field4274, var3.field4259, var3.field4256, var3.field4269, var3.field4276, var3.field4261, var3.field4263, var3.field4266, var3.field4267, var3.field4260);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "()Z")
    public final boolean method328() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "ZA", descriptor = "()I")
    public final native int method341();

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
    public final void method334(int arg0) {
        this.field2456 = arg0;
        this.field2457 = new class15[this.field2456];
        for (int var2 = 0; var2 < this.field2456; ++var2) {
            this.field2457[var2] = new class15(this, this.field2453, this.field2451);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lkp;Z)V")
    private final void method1113(class341 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class456 var8 = (class456) arg0.field5066.method2707(false); var8 != null; var8 = (class456) arg0.field5066.method2706(false)) {
            field2442[var3++] = var8.field6631;
            field2442[var3++] = var8.field6633;
            field2442[var3++] = var8.field6640;
            field2447[var4++] = var8.field6641;
            field2438[var6++] = (short) var8.field6638;
            field2449[var5++] = var8.field6632;
            if (arg1) {
                field2445[var7++] = var8.field6634;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lkp;)V")
    public final void method368(class341 arg0) {
        this.method1113(arg0, false);
        this.method1111().method118(this, field2442, field2447, field2449, field2438, arg0.field5066.method2710(0));
    }

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "()Z")
    public final boolean method358() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "DA", descriptor = "(IIIIII[BII)V")
    public final native void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "IA", descriptor = "()I")
    public final native int method353();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lpc;)V")
    public final void method370(class477 arg0) {
    }

    @OriginalMember(owner = "client!qa", name = "ha", descriptor = "()V")
    private final void method1114() {
        System.gc();
        System.runFinalization();
        class438.method2702((byte) 54);
    }

    @OriginalMember(owner = "client!qa", name = "JA", descriptor = "(IIIIII)Z")
    public final native boolean method310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "OA", descriptor = "(IIII)V")
    public final native void method313(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lma;")
    public final class10 method325(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class140(this, this.field2443, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "()V")
    public final void method306() {
    }

    @OriginalMember(owner = "client!qa", name = "ia", descriptor = "(II)V")
    public final native void method292(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "()Z")
    public final boolean method346() {
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Llm;[Ldi;Z)Lla;")
    public final class317 method366(class348 arg0, class84[] arg1, boolean arg2) {
        return arg2 ? new class187(this, this.field2443, arg0, arg1, (class16[]) null) : new class332(this, this.field2443, arg0, arg1, (class16[]) null);
    }

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "()Z")
    public final boolean method327() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lt;Lc;[Lju;I)V")
    public final void method273(class475[] arg0, class125 arg1, class83[] arg2, int arg3) {
        if (arg2 == null) {
            this.method1111().method113(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class83 var5 = arg2[0];
            field2444[5] = 0;
            this.method1111().method113(this, arg0, arg1, field2444, -1, arg3);
            var5.field1200 = field2444[0];
            var5.field1203 = field2444[1];
            var5.field1199 = field2444[2];
            var5.field1202 = field2444[3];
            var5.field1198 = field2444[4];
            var5.field1201 = field2444[5] != 0;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
    public final native void method304(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
    public final int method314(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "()Z")
    public final boolean method372() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "()Z")
    public final boolean method348() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)Lpc;")
    public final class477 method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!qa", name = "za", descriptor = "(I[I[F)V")
    private final native void method1115(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
    public final void method289(boolean arg0) {
    }

    @OriginalMember(owner = "client!qa", name = "PA", descriptor = "(Lza;)V")
    private final native void method1116(class288 arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Ll;")
    public final class16 method350(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class72(this, this.field2443, arg0, arg1, arg2, arg3, arg4) : new class418(this, this.field2443, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class72(this, this.field2443, arg0, arg1, arg2, arg3, arg4) : new class418(this, this.field2443, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qa", name = "GA", descriptor = "(IIII)V")
    public final native void method342(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method264(Rectangle[] arg0, int arg1) {
        int var3 = 0;
        while (var3 < 9) {
            try {
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        synchronized (this.field2454.getTreeLock()) {
                            this.field2450.method1861(var5.x, var5.y, var5.width, var5.height);
                        }
                    }
                }
                return;
            } catch (Exception var12) {
                class434.method2690(10, 200L);
                ++var3;
            }
        }
        for (int var7 = 0; var7 < arg1; ++var7) {
            Rectangle var8 = arg0[var7];
            if (var8.width > 0 && var8.height > 0) {
                synchronized (this.field2454.getTreeLock()) {
                    this.field2450.method1861(var8.x, var8.y, var8.width, var8.height);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method272(Canvas arg0) {
        if (arg0 != null) {
            class288 var2 = (class288) this.field2455.method2585((byte) 114, (long) arg0.hashCode());
            this.field2454 = arg0;
            this.field2450 = var2;
            this.method1116(var2);
        } else {
            this.field2454 = null;
            this.field2450 = null;
            this.method1116((class288) null);
        }
    }

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "(IIII)[I")
    public final native int[] method280(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method300(Canvas arg0) {
        class288 var2 = (class288) this.field2455.method2585((byte) 114, (long) arg0.hashCode());
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class288 var5 = new class288(this, arg0);
            this.field2455.method2591((long) arg0.hashCode(), var5, (byte) 81);
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
    public final void method329(boolean arg0) {
    }

    @OriginalMember(owner = "client!qa", name = "RA", descriptor = "(IIIIII)V")
    private final native void method1117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "(III[I)V")
    public final native void method356(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ldi;Z)Ll;")
    public final class16 method345(class84 arg0, boolean arg1) {
        int[] var3 = arg0.field1208;
        byte[] var4 = arg0.field1211;
        int var5 = arg0.field1204;
        int var6 = arg0.field1207;
        class16 var7;
        if (arg1 && arg0.field1210 == null) {
            var7 = new class399(this, this.field2443, var3, var4, 0, arg0.field1204, arg0.field1204, arg0.field1207);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field1210;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class72(this, this.field2443, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field1208[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class72(this, this.field2443, var9, 0, arg0.field1204, arg0.field1204, arg0.field1207);
                } else {
                    var7 = new class418(this, this.field2443, var9, 0, arg0.field1204, arg0.field1204, arg0.field1207);
                }
            }
        }
        var7.method130(arg0.field1205, arg0.field1209, arg0.field1206, arg0.field1212);
        return var7;
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)Lu;")
    public final class54 method337(int arg0) {
        class35 var2 = new class35(this, arg0);
        this.field2436.method994(var2, -3610);
        return var2;
    }

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method119();
    }

    @OriginalMember(owner = "client!qa", name = "TA", descriptor = "(IIIII)V")
    public final native void method369(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method1118(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "()V")
    public final void method343() {
    }

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "()I")
    public final int method301() {
        return 4;
    }

    @OriginalMember(owner = "client!qa", name = "MA", descriptor = "(I)V")
    public final native void method321(int arg0);

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "()V")
    public final native void method267();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public final void method282(boolean arg0) {
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
    public final void method339(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ltp;IIII)Lt;")
    public final class475 method330(class374 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class44(this, this.field2443, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "()Lc;")
    public final class125 method296() {
        return this.field2452;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)V")
    public final void method293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method304(arg0, arg1, arg2, arg4, arg5);
        this.method304(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method369(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method369(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method274(Canvas arg0) {
        class288 var2 = (class288) this.field2455.method2585((byte) 114, (long) arg0.hashCode());
        Dimension var3 = arg0.getSize();
        var2.method1857(arg0, var3.width, var3.height);
        if (arg0 != null && this.field2454 == arg0) {
            this.method272(arg0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "ma", descriptor = "(I)V")
    private final native void method1119(int arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public final void method290(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "()V")
    public final void method367() {
    }

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
    public final boolean method333() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "()Z")
    public final boolean method355() {
        return false;
    }
}
