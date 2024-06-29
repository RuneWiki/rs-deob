import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class57 extends class651 implements class144 {

    @OriginalMember(owner = "client!da", name = "s", descriptor = "Z")
    private boolean field785 = false;

    @OriginalMember(owner = "client!da", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "Lgj;")
    private class593 field787 = new class593();

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    private int field788 = 4096;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "I")
    private int field793 = 4096;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "Ljw;")
    private class520 field791 = new class520(4);

    @OriginalMember(owner = "client!da", name = "O", descriptor = "Z")
    private boolean field805 = false;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "Lq;")
    private class397 field790;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "[I")
    private static int[] field789 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!da", name = "F", descriptor = "[I")
    public static int[] field797 = field789;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "[I")
    private static int[] field799 = new int[8191];

    @OriginalMember(owner = "client!da", name = "D", descriptor = "[B")
    private static byte[] field796 = new byte[8191];

    @OriginalMember(owner = "client!da", name = "M", descriptor = "[I")
    private static int[] field803 = field789;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "[I")
    public static int[] field800 = new int[6];

    @OriginalMember(owner = "client!da", name = "C", descriptor = "[I")
    private static int[] field795 = new int[8191];

    @OriginalMember(owner = "client!da", name = "B", descriptor = "[S")
    private static short[] field794 = new short[8191];

    @OriginalMember(owner = "client!da", name = "L", descriptor = "[F")
    private static float[] field802 = new float[20];

    @OriginalMember(owner = "client!da", name = "N", descriptor = "[I")
    private static int[] field804 = field789;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "[F")
    private static float[] field801 = field802;

    @OriginalMember(owner = "client!da", name = "P", descriptor = "I")
    private int field806;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "Lq;")
    private class397 field792;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "Lv;")
    private class542 field798;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "La;")
    private class579 field786;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "[Lt;")
    private class626[] field807;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method370(Canvas arg0) {
        if (arg0 != null) {
            class542 var2 = (class542) this.field791.method2918((long) arg0.hashCode(), (byte) 110);
            this.field798 = var2;
            this.method386(var2);
        } else {
            this.field798 = null;
            this.method386((class542) null);
        }
    }

    @OriginalMember(owner = "client!da", name = "YA", descriptor = "(IFFFFF)V")
    public final native void method371(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)V")
    public final void method33(boolean arg0) {
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Li;)V")
    private final native void method372(class37 arg0);

    @OriginalMember(owner = "client!da", name = "n", descriptor = "()V")
    public final void method29() {
    }

    @OriginalMember(owner = "client!da", name = "m", descriptor = "(IIII)V")
    public final native void method373(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIII)Lxa;")
    public final class468 method374(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class455(this, this.field786, arg0, arg1, arg2, arg3, arg4) : new class257(this, this.field786, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class455(this, this.field786, arg0, arg1, arg2, arg3, arg4) : new class257(this, this.field786, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method375(Canvas arg0) {
        class542 var2 = (class542) this.field791.method2918((long) arg0.hashCode(), (byte) 64);
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class542 var5 = new class542(this, arg0);
            this.field791.method2911((long) arg0.hashCode(), var5, (byte) -28);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)I")
    public final int method376(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;)V")
    public class57(Canvas arg0, class498 arg1) {
        super(arg1);
        try {
            if (!class275.method1669(0, "sw3d")) {
                throw new RuntimeException("");
            } else {
                class550.method3056((byte) -46);
                this.method462(super.field8808, 0, 0);
                class312.method1865(false, true, (byte) -128);
                this.field805 = true;
                this.field790 = new class573();
                this.method405(new class573());
                this.method409(1);
                this.method425(0);
                if (arg0 != null) {
                    this.method375(arg0);
                    this.method370(arg0);
                }
            }
        } catch (Throwable var3) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!da", name = "JA", descriptor = "(I)V")
    public final native void method377(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public final void method378(int arg0) {
        this.field807[arg0].method3437();
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(IIIII)V")
    public final native void method379(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "r", descriptor = "()Z")
    public final boolean method380() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "x", descriptor = "()Lffa;")
    public final class173 method55() {
        return new class173(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ldn;Ldn;FLdn;)Ldn;")
    public final class483 method49(class483 arg0, class483 arg1, float arg2, class483 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!da", name = "D", descriptor = "(I)V")
    public final native void method87(int arg0);

    @OriginalMember(owner = "client!da", name = "HA", descriptor = "()Ljava/lang/Object;")
    private final Object method381() {
        return new class343(this);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
    public final void method382(boolean arg0) {
    }

    @OriginalMember(owner = "client!da", name = "o", descriptor = "(Lq;)V")
    private final native void method383(class397 arg0);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(IIIIII)V")
    public final void method384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method441(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!da", name = "ka", descriptor = "(FF)V")
    public final native void method385(float arg0, float arg1);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(FFF)V")
    public final void method70(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!da", name = "P", descriptor = "(Lv;)V")
    private final native void method386(class542 arg0);

    @OriginalMember(owner = "client!da", name = "AA", descriptor = "(IIII)V")
    public final native void method387(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "D", descriptor = "()Z")
    public final boolean method388() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lkga;[Lpga;Z)Lta;")
    public final class200 method389(class511 arg0, class500[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field6698;
            var5[var7] = arg1[var7].field6700;
            if (arg1[var7].field6696 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class309(this, this.field786, arg0, arg1, (class468[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class12(this, this.field786, arg0, arg1, (class468[]) null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()Z")
    public final boolean method390() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(IIIIII)Ldn;")
    public final class483 method391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lba;Lc;Lq;Lot;I)V")
    public final void method392(class358 arg0, class174 arg1, class397 arg2, class552 arg3, int arg4) {
        this.method393(arg1, true);
        if (arg3 == null) {
            this.method461().method3446(this, arg0, arg2, (int[]) null, arg4, field803, field799, field795, field794, field796, arg1.field2679.method2091((byte) 121), field797);
        } else {
            field800[5] = 0;
            this.method461().method3446(this, arg0, arg2, field800, arg4, field803, field799, field795, field794, field796, arg1.field2679.method2091((byte) 127), field797);
            arg3.field7346 = field800[0];
            arg3.field7345 = field800[1];
            arg3.field7343 = field800[2];
            arg3.field7342 = field800[3];
            arg3.field7344 = field800[4];
            arg3.field7341 = field800[5] != 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "t", descriptor = "()V")
    public final void method30() {
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lc;Z)V")
    private final void method393(class174 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class115 var8 = (class115) arg0.field2679.method2092(126); var8 != null; var8 = (class115) arg0.field2679.method2090(2)) {
            field803[var3++] = var8.field1973;
            field803[var3++] = var8.field1976;
            field803[var3++] = var8.field1972;
            field799[var4++] = var8.field1979;
            field794[var6++] = (short) var8.field1982;
            field795[var5++] = var8.field1983;
            if (arg1) {
                field796[var7++] = var8.field1984;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(S)Z")
    private final boolean method394(short arg0) {
        class498 var2 = super.field8808;
        synchronized (super.field8808) {
            if (!super.field8808.method2759(32700, arg0)) {
                return false;
            } else {
                class364 var4 = super.field8808.method2760(arg0, 21351);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (!var4.field4931) {
                        var6 = super.field8808.method2761((byte) 103, 128, true, arg0, 0.7F, 128);
                    } else {
                        var6 = super.field8808.method2762(0.7F, 128, true, arg0, 7814, 128);
                    }
                    this.method419(arg0, var4.field4929, var4.field4926, var4.field4924, var4.field4930, var4.field4917, var4.field4919, var4.field4932, var4.field4937, var4.field4920, var4.field4935, var4.field4936, var4.field4938, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "ma", descriptor = "(IIIIII[BII)V")
    public final native void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!da", name = "w", descriptor = "()Z")
    public final boolean method396() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "j", descriptor = "()V")
    public final void method38() {
    }

    @OriginalMember(owner = "client!da", name = "L", descriptor = "(ILfa;II)V")
    public final native void method397(int arg0, class217 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZ)Lxa;")
    public final class468 method398(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class455(this, this.field786, arg0, arg1) : new class257(this, this.field786, arg0, arg1);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)V")
    public final void method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method461().method3435(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lpv;)V")
    public final void method400(int arg0, class65[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field804[var3++] = arg1[var4].method515((byte) 125);
            field804[var3++] = arg1[var4].method516(-18736);
            field804[var3++] = arg1[var4].method518((byte) 75);
            field804[var3++] = arg1[var4].method522(-123);
            field801[var4] = arg1[var4].method519(true);
            field804[var3++] = arg1[var4].method514(110);
        }
        this.method467(arg0, field804, field801);
    }

    @OriginalMember(owner = "client!da", name = "ra", descriptor = "(IIIIIILfa;II)V")
    private final native void method401(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class217 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public final class139 method402(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class49(this, this.field786, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!da", name = "v", descriptor = "()I")
    public final native int method403();

    @OriginalMember(owner = "client!da", name = "g", descriptor = "()Z")
    public final boolean method404() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;)V")
    public final void method405(class397 arg0) {
        this.field792 = arg0;
        this.method383(arg0);
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)Li;")
    public final class37 method406(int arg0) {
        class579 var2 = new class579(this, arg0);
        this.field787.method3265(var2, (byte) -66);
        return var2;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(Z)V")
    public final void method407(boolean arg0) {
    }

    @OriginalMember(owner = "client!da", name = "TA", descriptor = "(Lja;)V")
    private final native void method408(class257 arg0);

    @OriginalMember(owner = "client!da", name = "g", descriptor = "(I)V")
    public final void method409(int arg0) {
        this.field806 = arg0;
        this.field807 = new class626[this.field806];
        for (int var2 = 0; var2 < this.field806; ++var2) {
            this.field807[var2] = new class626(this, this.field793, this.field788);
        }
    }

    @OriginalMember(owner = "client!da", name = "FA", descriptor = "(IIIIII)Z")
    public final native boolean method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!da", name = "IA", descriptor = "()I")
    public final native int method411();

    @OriginalMember(owner = "client!da", name = "aa", descriptor = "()I")
    public final native int method412();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I)Lfa;")
    public final class217 method413(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class707(this, this.field786, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!da", name = "k", descriptor = "()V")
    public final native void method414();

    @OriginalMember(owner = "client!da", name = "e", descriptor = "()V")
    public final void method76() {
    }

    @OriginalMember(owner = "client!da", name = "C", descriptor = "(IIIIII)V")
    public final native void method415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
    public final void method51(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!da", name = "p", descriptor = "()Z")
    public final boolean method416() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "o", descriptor = "()Z")
    public final boolean method93() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method417(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lba;Lq;[Lot;I)V")
    public final void method418(class358[] arg0, class397 arg1, class552[] arg2, int arg3) {
        if (arg2 == null) {
            this.method461().method3442(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class552 var5 = arg2[0];
            field800[5] = 0;
            this.method461().method3442(this, arg0, arg1, field800, -1, arg3);
            var5.field7346 = field800[0];
            var5.field7345 = field800[1];
            var5.field7343 = field800[2];
            var5.field7342 = field800[3];
            var5.field7344 = field800[4];
            var5.field7341 = field800[5] != 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method419(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method420(Canvas arg0) {
        if (this.field798.field7134 == arg0) {
            this.method370((Canvas) null);
        }
        class542 var2 = (class542) this.field791.method2918((long) arg0.hashCode(), (byte) 76);
        if (var2 != null) {
            var2.method2797(45);
            var2.method2998();
        }
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "()V")
    public final void method100() {
    }

    @OriginalMember(owner = "client!da", name = "ca", descriptor = "(IIII)V")
    public final native void method421(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "X", descriptor = "(III)V")
    public final native void method422(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)V")
    public final void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method379(arg0, arg1, arg2, arg4, arg5);
        this.method379(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method446(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method446(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!da", name = "B", descriptor = "()Z")
    public final boolean method424() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
    public final void method425(int arg0) {
        this.field807[arg0].method3436();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIZ)Lxa;")
    public final class468 method426(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class455(this, this.field786, arg0, arg1, arg2, arg3) : new class257(this, this.field786, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIF)Lpv;")
    public final class65 method427(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class259(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!da", name = "KA", descriptor = "(IIII)[I")
    public final native int[] method106(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "y", descriptor = "()Z")
    public final boolean method428() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lba;Lc;Lq;[Lot;I)V")
    public final void method429(class358[] arg0, class174 arg1, class397 arg2, class552[] arg3, int arg4) {
        this.method393(arg1, true);
        if (arg3 == null) {
            this.method461().method3450(this, arg0, arg2, (int[]) null, arg4, field803, field799, field795, field794, field796, arg1.field2679.method2091((byte) -27), field797);
        } else {
            class552 var6 = arg3[0];
            field800[5] = 0;
            this.method461().method3450(this, arg0, arg2, field800, arg4, field803, field799, field795, field794, field796, arg1.field2679.method2091((byte) 124), field797);
            var6.field7346 = field800[0];
            var6.field7345 = field800[1];
            var6.field7343 = field800[2];
            var6.field7342 = field800[3];
            var6.field7344 = field800[4];
            var6.field7341 = field800[5] != 0;
        }
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                class507 var8 = (class507) arg0[var7];
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "l", descriptor = "()Z")
    public final boolean method430() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "C", descriptor = "()Z")
    public final boolean method431() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method86(Rectangle[] arg0, int arg1) throws class26 {
        if (this.field798 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field798.method2992(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ldn;)V")
    public final void method432(class483 arg0) {
    }

    @OriginalMember(owner = "client!da", name = "A", descriptor = "([I)V")
    public final native void method433(int[] arg0);

    @OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method3574(54);
        if (this.nativeid != 0L) {
            class550.method3055((byte) -20, this);
        }
    }

    @OriginalMember(owner = "client!da", name = "qa", descriptor = "(S)Z")
    private final boolean method434(short arg0) {
        synchronized (this) {
            class364 var3 = super.field8808.method2760(arg0, 21351);
            if (var3 == null) {
                return false;
            } else {
                this.method417(arg0, var3.field4929, var3.field4926, var3.field4924, var3.field4930, var3.field4917, var3.field4919, var3.field4932, var3.field4937, var3.field4920, var3.field4935, var3.field4936, var3.field4938);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "F", descriptor = "()V")
    public final native void method435();

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(IIIII)V")
    public final native void method436(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILfa;II)V")
    public final void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class217 arg6, int arg7, int arg8) {
        this.method401(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!da", name = "na", descriptor = "(III[I)V")
    public final native void method438(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lxa;Z)V")
    public final void method80(class468 arg0, boolean arg1) {
        if (arg0 instanceof class257) {
            this.method408((class257) arg0);
        } else if (arg0 instanceof class455) {
            this.method449((class455) arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Li;)V")
    public final void method439(class37 arg0) {
        this.field786 = (class579) arg0;
        this.method372(arg0);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lpga;Z)Lxa;")
    public final class468 method440(class500 arg0, boolean arg1) {
        int[] var3 = arg0.field6702;
        byte[] var4 = arg0.field6697;
        int var5 = arg0.field6698;
        int var6 = arg0.field6700;
        class468 var7;
        if (arg1 && arg0.field6696 == null) {
            var7 = new class422(this, this.field786, var3, var4, 0, arg0.field6698, arg0.field6698, arg0.field6700);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field6696;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class455(this, this.field786, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field6702[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class455(this, this.field786, var9, 0, arg0.field6698, arg0.field6698, arg0.field6700);
                } else {
                    var7 = new class257(this, this.field786, var9, 0, arg0.field6698, arg0.field6698, arg0.field6700);
                }
            }
        }
        var7.method1029(arg0.field6695, arg0.field6699, arg0.field6694, arg0.field6701);
        return var7;
    }

    @OriginalMember(owner = "client!da", name = "BA", descriptor = "(IIIIII)V")
    private final native void method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!da", name = "ha", descriptor = "(F)V")
    public final native void method442(float arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lpf;IIII)Lba;")
    public final class358 method443(class545 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class507(this, this.field786, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!da", name = "SA", descriptor = "()I")
    public final native int method104();

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()V")
    public final void method444() {
    }

    @OriginalMember(owner = "client!da", name = "LA", descriptor = "(IIII)V")
    public final native void method445(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "ya", descriptor = "(IIIII)V")
    public final native void method446(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method447(Canvas arg0) {
        class542 var2 = (class542) this.field791.method2918((long) arg0.hashCode(), (byte) -128);
        Dimension var3 = arg0.getSize();
        var2.method2991(arg0, var3.width, var3.height);
        if (arg0 != null && this.field798.field7134 == arg0) {
            this.method370(arg0);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()V")
    public final void method107() {
        this.method370(this.field798.field7134);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!da", name = "N", descriptor = "(Laa;)V")
    private final native void method449(class455 arg0);

    @OriginalMember(owner = "client!da", name = "sa", descriptor = "(II)V")
    public final native void method450(int arg0, int arg1);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    private final native void method451(int arg0);

    @OriginalMember(owner = "client!da", name = "i", descriptor = "()Z")
    public final boolean method452() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "()V")
    private final native void method453();

    @OriginalMember(owner = "client!da", name = "u", descriptor = "()I")
    public final int method454() {
        return 4;
    }

    @OriginalMember(owner = "client!da", name = "A", descriptor = "()V")
    public final void method97() throws class26 {
        if (this.field798 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field798.method2996();
        }
    }

    @OriginalMember(owner = "client!da", name = "z", descriptor = "()Lq;")
    public final class397 method455() {
        return this.field790;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()Z")
    public final boolean method456() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
    public final void method52(int arg0) {
        class550.method3054(-122);
        this.method451(arg0);
        for (class579 var2 = (class579) this.field787.method3257(-102); var2 != null; var2 = (class579) this.field787.method3263((byte) -92)) {
            var2.method3177();
        }
    }

    @OriginalMember(owner = "client!da", name = "i", descriptor = "(I)V")
    public final void method457(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!da", name = "E", descriptor = "()Z")
    public final boolean method96() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "q", descriptor = "()Z")
    public final boolean method458() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "(IIII)V")
    public final native void method459(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
    public final int method460(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!da", name = "H", descriptor = "()Lt;")
    public final class626 method461() {
        for (int var1 = 0; var1 < this.field806; ++var1) {
            if (this.field807[var1].field8453 == Thread.currentThread()) {
                return this.field807[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!da", name = "PA", descriptor = "(Le;II)V")
    private final native void method462(class498 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "s", descriptor = "()V")
    private final void method463() {
        System.gc();
        System.runFinalization();
        class550.method3054(-118);
    }

    @OriginalMember(owner = "client!da", name = "U", descriptor = "()I")
    public final native int method464();

    @OriginalMember(owner = "client!da", name = "H", descriptor = "(Z)V")
    public final native void method132(boolean arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lc;)V")
    public final void method465(class174 arg0) {
        this.method393(arg0, false);
        this.method461().method3433(this, field803, field799, field795, field794, arg0.field2679.method2091((byte) 127));
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "()Lq;")
    public final class397 method466() {
        return new class573();
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I[I[F)V")
    private final native void method467(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!da", name = "m", descriptor = "()V")
    public final void method56() {
        if (!this.field785) {
            this.field807 = null;
            this.field798 = null;
            this.field786 = null;
            this.field790 = null;
            this.field791.method2916((byte) 108);
            for (class579 var1 = (class579) this.field787.method3257(-28); var1 != null; var1 = (class579) this.field787.method3263((byte) -71)) {
                var1.method3178();
            }
            this.field787.method3255((byte) -113);
            this.method453();
            if (this.field805) {
                class340.method2063(0, false, true);
                this.field805 = false;
            }
            this.method463();
            class550.method3052(-1);
            this.field785 = true;
        }
    }
}
