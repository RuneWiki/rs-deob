import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class55 extends class638 implements class141 {

    @OriginalMember(owner = "client!da", name = "u", descriptor = "Z")
    private boolean field766 = false;

    @OriginalMember(owner = "client!da", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "Lsu;")
    private class192 field765 = new class192();

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    private int field768 = 4096;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    private int field777 = 4096;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "Loj;")
    private class346 field771 = new class346(4);

    @OriginalMember(owner = "client!da", name = "P", descriptor = "Z")
    private boolean field785 = false;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "Lq;")
    private class391 field781;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "[I")
    private static int[] field769 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!da", name = "D", descriptor = "[I")
    private static int[] field774 = field769;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "[I")
    public static int[] field775 = field769;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "[B")
    private static byte[] field770 = new byte[8191];

    @OriginalMember(owner = "client!da", name = "B", descriptor = "[I")
    public static int[] field772 = new int[6];

    @OriginalMember(owner = "client!da", name = "C", descriptor = "[S")
    private static short[] field773 = new short[8191];

    @OriginalMember(owner = "client!da", name = "I", descriptor = "[I")
    private static int[] field778 = new int[8191];

    @OriginalMember(owner = "client!da", name = "J", descriptor = "[F")
    private static float[] field779 = new float[20];

    @OriginalMember(owner = "client!da", name = "K", descriptor = "[I")
    private static int[] field780 = new int[8191];

    @OriginalMember(owner = "client!da", name = "F", descriptor = "[I")
    private static int[] field776 = field769;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "[F")
    private static float[] field782 = field779;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
    private int field786;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "Lq;")
    private class391 field767;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "Lv;")
    private class530 field783;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "La;")
    private class566 field764;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "[Lt;")
    private class613[] field784;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method396(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I[I[F)V")
    private final native void method397(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lld;)V")
    public final void method398(int arg0, class154[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field774[var3++] = arg1[var4].method1079(-868177151);
            field774[var3++] = arg1[var4].method1076(false);
            field774[var3++] = arg1[var4].method1074(0);
            field774[var3++] = arg1[var4].method1072(2);
            field782[var4] = arg1[var4].method1081(-21);
            field774[var3++] = arg1[var4].method1083(true);
        }
        this.method397(arg0, field774, field782);
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(IIIIII)V")
    public final void method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method445(arg0, arg1, arg2, arg4, arg5);
        this.method445(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method414(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method414(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!da", name = "v", descriptor = "()I")
    public final native int method400();

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(Z)V")
    public final void method387(boolean arg0) {
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()Lq;")
    public final class391 method401() {
        return this.field781;
    }

    @OriginalMember(owner = "client!da", name = "JA", descriptor = "(I)V")
    public final native void method402(int arg0);

    @OriginalMember(owner = "client!da", name = "HA", descriptor = "()Ljava/lang/Object;")
    private final Object method403() {
        return new class337(this);
    }

    @OriginalMember(owner = "client!da", name = "m", descriptor = "(IIII)V")
    public final native void method404(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "t", descriptor = "()V")
    public final void method296() {
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lmj;[Lkq;Z)Lta;")
    public final class194 method405(class599 arg0, class543[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field7377;
            var5[var7] = arg1[var7].field7373;
            if (arg1[var7].field7380 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class303(this, this.field764, arg0, arg1, (class461[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class12(this, this.field764, arg0, arg1, (class461[]) null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lba;Lq;[Lrc;I)V")
    public final void method393(class352[] arg0, class391 arg1, class494[] arg2, int arg3) {
        if (arg2 == null) {
            this.method429().method3385(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class494 var5 = arg2[0];
            field772[5] = 0;
            this.method429().method3385(this, arg0, arg1, field772, -1, arg3);
            var5.field6810 = field772[0];
            var5.field6809 = field772[1];
            var5.field6811 = field772[2];
            var5.field6812 = field772[3];
            var5.field6807 = field772[4];
            var5.field6808 = field772[5] != 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "k", descriptor = "()V")
    public final native void method406();

    @OriginalMember(owner = "client!da", name = "D", descriptor = "()V")
    public final void method306() {
        if (!this.field766) {
            this.field784 = null;
            this.field783 = null;
            this.field764 = null;
            this.field781 = null;
            this.field771.method2060(0);
            for (class566 var1 = (class566) this.field765.method1270((byte) -25); var1 != null; var1 = (class566) this.field765.method1282(0)) {
                var1.method3131();
            }
            this.field765.method1269((byte) 123);
            this.method409();
            if (this.field785) {
                class256.method1572(false, true, false);
                this.field785 = false;
            }
            this.method475();
            class373.method2175(-1);
            this.field766 = true;
        }
    }

    @OriginalMember(owner = "client!da", name = "r", descriptor = "()Z")
    public final boolean method407() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "q", descriptor = "()Z")
    public final boolean method408() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "()V")
    private final native void method409();

    @OriginalMember(owner = "client!da", name = "LA", descriptor = "(IIII)V")
    public final native void method410(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method319(Rectangle[] arg0, int arg1) throws class211 {
        if (this.field783 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field783.method2934(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()Z")
    public final boolean method411() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method395(Canvas arg0) {
        class530 var2 = (class530) this.field771.method2061(-17305, (long) arg0.hashCode());
        Dimension var3 = arg0.getSize();
        var2.method2938(arg0, var3.width, var3.height);
        if (arg0 != null && this.field783.field7235 == arg0) {
            this.method381(arg0);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lkq;Z)Lxa;")
    public final class461 method412(class543 arg0, boolean arg1) {
        int[] var3 = arg0.field7376;
        byte[] var4 = arg0.field7378;
        int var5 = arg0.field7377;
        int var6 = arg0.field7373;
        class461 var7;
        if (arg1 && arg0.field7380 == null) {
            var7 = new class416(this, this.field764, var3, var4, 0, arg0.field7377, arg0.field7377, arg0.field7373);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field7380;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class447(this, this.field764, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field7376[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class447(this, this.field764, var9, 0, arg0.field7377, arg0.field7377, arg0.field7373);
                } else {
                    var7 = new class251(this, this.field764, var9, 0, arg0.field7377, arg0.field7377, arg0.field7373);
                }
            }
        }
        var7.method34(arg0.field7375, arg0.field7374, arg0.field7381, arg0.field7379);
        return var7;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(Z)V")
    public final void method352(boolean arg0) {
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method413(Canvas arg0) {
        class530 var2 = (class530) this.field771.method2061(-17305, (long) arg0.hashCode());
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class530 var5 = new class530(this, arg0);
            this.field771.method2063((long) arg0.hashCode(), 1, var5);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(FFF)V")
    public final void method322(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!da", name = "ya", descriptor = "(IIIII)V")
    public final native void method414(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(IIIIII)V")
    public final void method415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method418(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!da", name = "A", descriptor = "([I)V")
    public final native void method416(int[] arg0);

    @OriginalMember(owner = "client!da", name = "z", descriptor = "()Z")
    public final boolean method417() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method381(Canvas arg0) {
        if (arg0 != null) {
            class530 var2 = (class530) this.field771.method2061(-17305, (long) arg0.hashCode());
            this.field783 = var2;
            this.method470(var2);
        } else {
            this.field783 = null;
            this.method470((class530) null);
        }
    }

    @OriginalMember(owner = "client!da", name = "BA", descriptor = "(IIIIII)V")
    private final native void method418(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lhfa;)V")
    public final void method419(class281 arg0) {
        this.method427(arg0, false);
        this.method429().method3380(this, field776, field778, field780, field773, arg0.field3924.method2215(858993459));
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIZ)Lxa;")
    public final class461 method420(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class447(this, this.field764, arg0, arg1, arg2, arg3) : new class251(this, this.field764, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Li;)V")
    public final void method421(class37 arg0) {
        this.field764 = (class566) arg0;
        this.method467(arg0);
    }

    @OriginalMember(owner = "client!da", name = "SA", descriptor = "()I")
    public final native int method356();

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)V")
    public final void method422(boolean arg0) {
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "()Z")
    public final boolean method423() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "()Z")
    public final boolean method424() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
    public final void method382(int arg0) {
        this.field784[arg0].method3379();
    }

    @OriginalMember(owner = "client!da", name = "i", descriptor = "()Z")
    public final boolean method297() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "L", descriptor = "(ILfa;II)V")
    public final native void method425(int arg0, class212 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "w", descriptor = "()Z")
    public final boolean method426() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lhfa;Z)V")
    private final void method427(class281 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class429 var8 = (class429) arg0.field3924.method2211((byte) 106); var8 != null; var8 = (class429) arg0.field3924.method2217(-1431655765)) {
            field776[var3++] = var8.field6025;
            field776[var3++] = var8.field6021;
            field776[var3++] = var8.field6031;
            field778[var4++] = var8.field6023;
            field773[var6++] = (short) var8.field6024;
            field780[var5++] = var8.field6028;
            if (arg1) {
                field770[var7++] = var8.field6026;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()Lfea;")
    public final class127 method340() {
        return new class127(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!da", name = "sa", descriptor = "(II)V")
    public final native void method428(int arg0, int arg1);

    @OriginalMember(owner = "client!da", name = "G", descriptor = "()Lt;")
    public final class613 method429() {
        for (int var1 = 0; var1 < this.field786; ++var1) {
            if (this.field784[var1].field8497 == Thread.currentThread()) {
                return this.field784[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    private final native void method430(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lhn;IIII)Lba;")
    public final class352 method379(class661 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class497(this, this.field764, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
    public final void method299(int arg0) {
        class373.method2179((byte) -89);
        this.method430(arg0);
        for (class566 var2 = (class566) this.field765.method1270((byte) -25); var2 != null; var2 = (class566) this.field765.method1282(0)) {
            var2.method3132();
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)I")
    public final int method431(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lka;)V")
    public final void method432(class434 arg0) {
    }

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "(IIII)V")
    public final native void method433(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "f", descriptor = "()V")
    public final void method358() {
    }

    @OriginalMember(owner = "client!da", name = "y", descriptor = "()V")
    public final void method365() throws class211 {
        if (this.field783 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field783.method2933();
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lba;Lhfa;Lq;Lrc;I)V")
    public final void method434(class352 arg0, class281 arg1, class391 arg2, class494 arg3, int arg4) {
        this.method427(arg1, true);
        if (arg3 == null) {
            this.method429().method3386(this, arg0, arg2, (int[]) null, arg4, field776, field778, field780, field773, field770, arg1.field3924.method2215(858993459), field775);
        } else {
            field772[5] = 0;
            this.method429().method3386(this, arg0, arg2, field772, arg4, field776, field778, field780, field773, field770, arg1.field3924.method2215(858993459), field775);
            arg3.field6810 = field772[0];
            arg3.field6809 = field772[1];
            arg3.field6811 = field772[2];
            arg3.field6812 = field772[3];
            arg3.field6807 = field772[4];
            arg3.field6808 = field772[5] != 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "ra", descriptor = "(IIIIIILfa;II)V")
    private final native void method435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class212 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)V")
    public final void method388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method429().method3381(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!da", name = "l", descriptor = "()Z")
    public final boolean method436() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "o", descriptor = "()Z")
    public final boolean method308() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method437(Canvas arg0) {
        if (this.field783.field7235 == arg0) {
            this.method381((Canvas) null);
        }
        class530 var2 = (class530) this.field771.method2061(-17305, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2971(1);
            var2.method2932();
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)Li;")
    public final class37 method438(int arg0) {
        class566 var2 = new class566(this, arg0);
        this.field765.method1273(var2, (byte) 122);
        return var2;
    }

    @OriginalMember(owner = "client!da", name = "o", descriptor = "(Lq;)V")
    private final native void method439(class391 arg0);

    @OriginalMember(owner = "client!da", name = "p", descriptor = "()Z")
    public final boolean method440() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILfa;II)V")
    public final void method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class212 arg6, int arg7, int arg8) {
        this.method435(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!da", name = "ca", descriptor = "(IIII)V")
    public final native void method442(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "na", descriptor = "(III[I)V")
    public final native void method443(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
    public final int method444(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(IIIII)V")
    public final native void method445(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method3554(true);
        if (this.nativeid != 0L) {
            class373.method2177(this, (byte) -27);
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
    public final void method386(int arg0) {
        this.field786 = arg0;
        this.field784 = new class613[this.field786];
        for (int var2 = 0; var2 < this.field786; ++var2) {
            this.field784[var2] = new class613(this, this.field768, this.field777);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
    public final void method394(int arg0) {
        this.field784[arg0].method3383();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;)V")
    public final void method446(class391 arg0) {
        this.field767 = arg0;
        this.method439(arg0);
    }

    @OriginalMember(owner = "client!da", name = "x", descriptor = "()Z")
    public final boolean method447() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "(I)V")
    public final void method448(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!da", name = "F", descriptor = "()V")
    public final native void method449();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lba;Lhfa;Lq;[Lrc;I)V")
    public final void method390(class352[] arg0, class281 arg1, class391 arg2, class494[] arg3, int arg4) {
        this.method427(arg1, true);
        if (arg3 == null) {
            this.method429().method3388(this, arg0, arg2, (int[]) null, arg4, field776, field778, field780, field773, field770, arg1.field3924.method2215(858993459), field775);
        } else {
            class494 var6 = arg3[0];
            field772[5] = 0;
            this.method429().method3388(this, arg0, arg2, field772, arg4, field776, field778, field780, field773, field770, arg1.field3924.method2215(858993459), field775);
            var6.field6810 = field772[0];
            var6.field6809 = field772[1];
            var6.field6811 = field772[2];
            var6.field6812 = field772[3];
            var6.field6807 = field772[4];
            var6.field6808 = field772[5] != 0;
        }
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                class497 var8 = (class497) arg0[var7];
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!da", name = "YA", descriptor = "(IFFFFF)V")
    public final native void method450(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!da", name = "U", descriptor = "()I")
    public final native int method451();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIII)Lxa;")
    public final class461 method452(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class447(this, this.field764, arg0, arg1, arg2, arg3, arg4) : new class251(this, this.field764, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class447(this, this.field764, arg0, arg1, arg2, arg3, arg4) : new class251(this, this.field764, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!da", name = "X", descriptor = "(III)V")
    public final native void method453(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)Lka;")
    public final class434 method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!da", name = "PA", descriptor = "(Le;II)V")
    private final native void method455(class489 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "FA", descriptor = "(IIIIII)Z")
    public final native boolean method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIF)Lld;")
    public final class154 method457(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class175(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!da", name = "ma", descriptor = "(IIIIII[BII)V")
    public final native void method458(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!da", name = "B", descriptor = "()Lq;")
    public final class391 method459() {
        return new class560();
    }

    @OriginalMember(owner = "client!da", name = "H", descriptor = "(Z)V")
    public final native void method58(boolean arg0);

    @OriginalMember(owner = "client!da", name = "m", descriptor = "()V")
    public final void method460() {
    }

    @OriginalMember(owner = "client!da", name = "u", descriptor = "()Z")
    public final boolean method461() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "ka", descriptor = "(FF)V")
    public final native void method462(float arg0, float arg1);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public final class136 method383(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class48(this, this.field764, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method463(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!da", name = "qa", descriptor = "(S)Z")
    private final boolean method464(short arg0) {
        synchronized (this) {
            class269 var3 = super.field9050.method588(-26679, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method463(arg0, var3.field3820, var3.field3810, var3.field3805, var3.field3821, var3.field3825, var3.field3808, var3.field3806, var3.field3803, var3.field3817, var3.field3804, var3.field3807, var3.field3824);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "ha", descriptor = "(F)V")
    public final native void method465(float arg0);

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(S)Z")
    private final boolean method466(short arg0) {
        class489 var2 = super.field9050;
        synchronized (super.field9050) {
            if (!super.field9050.method590(arg0, (byte) -50)) {
                return false;
            } else {
                class269 var4 = super.field9050.method588(-26679, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (!var4.field3813) {
                        var6 = super.field9050.method586(arg0, 128, 0.7F, 128, true, 98);
                    } else {
                        var6 = super.field9050.method582(128, 128, 23117, true, arg0, 0.7F);
                    }
                    this.method396(arg0, var4.field3820, var4.field3810, var4.field3805, var4.field3821, var4.field3825, var4.field3808, var4.field3806, var4.field3803, var4.field3817, var4.field3804, var4.field3807, var4.field3824, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "j", descriptor = "()Z")
    public final boolean method385() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "C", descriptor = "()V")
    public final void method344() {
    }

    @OriginalMember(owner = "client!da", name = "KA", descriptor = "(IIII)[I")
    public final native int[] method360(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Li;)V")
    private final native void method467(class37 arg0);

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;)V")
    public class55(Canvas arg0, class489 arg1) {
        super(arg1);
        try {
            if (!class307.method1881("sw3d", false)) {
                throw new RuntimeException("");
            } else {
                class373.method2176(-23634);
                this.method455(super.field9050, 0, 0);
                class256.method1570(true, false, -16);
                this.field785 = true;
                this.field781 = new class560();
                this.method446(new class560());
                this.method386(1);
                this.method382(0);
                if (arg0 != null) {
                    this.method413(arg0);
                    this.method381(arg0);
                }
            }
        } catch (Throwable var3) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!da", name = "AA", descriptor = "(IIII)V")
    public final native void method468(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lka;Lka;FLka;)Lka;")
    public final class434 method317(class434 arg0, class434 arg1, float arg2, class434 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I)Lfa;")
    public final class212 method469(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class692(this, this.field764, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!da", name = "D", descriptor = "(I)V")
    public final native void method310(int arg0);

    @OriginalMember(owner = "client!da", name = "P", descriptor = "(Lv;)V")
    private final native void method470(class530 arg0);

    @OriginalMember(owner = "client!da", name = "aa", descriptor = "()I")
    public final native int method471();

    @OriginalMember(owner = "client!da", name = "C", descriptor = "(IIIIII)V")
    public final native void method472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()I")
    public final int method473() {
        return 4;
    }

    @OriginalMember(owner = "client!da", name = "IA", descriptor = "()I")
    public final native int method474();

    @OriginalMember(owner = "client!da", name = "s", descriptor = "()V")
    private final void method475() {
        System.gc();
        System.runFinalization();
        class373.method2179((byte) -89);
    }

    @OriginalMember(owner = "client!da", name = "n", descriptor = "()Z")
    public final boolean method476() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "A", descriptor = "()V")
    public final void method327() {
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
    public final void method342(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(IIIII)V")
    public final native void method477(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "h", descriptor = "()V")
    public final void method325() {
    }
}
