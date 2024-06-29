import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class470 extends class162 implements class276 {

    @OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "Lwo;")
    private class522 field6863 = new class522();

    @OriginalMember(owner = "client!h", name = "K", descriptor = "I")
    private int field6879 = 4096;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "I")
    private int field6881 = 4096;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "Lbj;")
    private class159 field6878 = new class159(4);

    @OriginalMember(owner = "client!h", name = "L", descriptor = "Lia;")
    private class415 field6880;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "[I")
    private static int[] field6864 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!h", name = "y", descriptor = "[I")
    public static int[] field6867 = new int[6];

    @OriginalMember(owner = "client!h", name = "w", descriptor = "[I")
    private static int[] field6865 = field6864;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "[S")
    private static short[] field6870 = new short[8191];

    @OriginalMember(owner = "client!h", name = "z", descriptor = "[I")
    public static int[] field6868 = field6864;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "[F")
    private static float[] field6871 = new float[20];

    @OriginalMember(owner = "client!h", name = "D", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field6872 = Boolean.FALSE;

    @OriginalMember(owner = "client!h", name = "E", descriptor = "[F")
    private static float[] field6873 = field6871;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "[I")
    private static int[] field6874 = new int[8191];

    @OriginalMember(owner = "client!h", name = "A", descriptor = "[I")
    private static int[] field6869 = new int[8191];

    @OriginalMember(owner = "client!h", name = "G", descriptor = "[B")
    private static byte[] field6875 = new byte[8191];

    @OriginalMember(owner = "client!h", name = "x", descriptor = "[I")
    private static int[] field6866 = field6864;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "I")
    private int field6883;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "Lba;")
    private class262 field6862;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "Lla;")
    private class313 field6876;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6877;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "[Lma;")
    private class10[] field6882;

    @OriginalMember(owner = "client!h", name = "EA", descriptor = "(S)Z", line = 3)
    private final boolean method2759(short arg0) {
        synchronized (this) {
            class501 var3 = super.field2312.method830(arg0, (byte) 71);
            if (var3 == null) {
                return false;
            } else {
                this.method2772(arg0, var3.field7375, var3.field7362, var3.field7381, var3.field7371, var3.field7363, var3.field7382, var3.field7358, var3.field7366, var3.field7367, var3.field7369, var3.field7359, var3.field7364);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 17)
    public final void method527(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!h", name = "D", descriptor = "()Lma;", line = 25)
    public final class10 method2761() {
        for (int var1 = 0; var1 < this.field6883; ++var1) {
            if (this.field6882[var1].field109 == Thread.currentThread()) {
                return this.field6882[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!h", name = "ZA", descriptor = "()V", line = 41)
    private final void method2762() {
        System.gc();
        System.runFinalization();
        class390.method2236(-109);
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(IIIIII)Lpv;", line = 48)
    public final class50 method521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lgv;[Lmp;Z)Loa;", line = 53)
    public final class490 method519(class56 arg0, class531[] arg1, boolean arg2) {
        return arg2 ? new class194(this, this.field6862, arg0, arg1, (class529[]) null) : new class181(this, this.field6862, arg0, arg1, (class529[]) null);
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 62)
    public final void method503(Canvas arg0) {
        if (this.field6877 == arg0) {
            this.method449((Canvas) null);
        }
        class313 var2 = (class313) this.field6878.method979((byte) 28, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2946(-121);
        }
        var2.method1770();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Lc;Lqb;Lia;[Lnh;I)V", line = 73)
    public final void method457(class121[] arg0, class148 arg1, class415 arg2, class525[] arg3, int arg4) {
        this.method2767(arg1, true);
        if (arg3 == null) {
            this.method2761().method90(this, arg0, arg2, (int[]) null, arg4, field6866, field6874, field6869, field6870, field6875, arg1.field2090.method1039(-53), field6868);
        } else {
            class525 var6 = arg3[0];
            field6867[5] = 0;
            this.method2761().method90(this, arg0, arg2, field6867, arg4, field6866, field6874, field6869, field6870, field6875, arg1.field2090.method1039(118), field6868);
            var6.field7713 = field6867[0];
            var6.field7716 = field6867[1];
            var6.field7711 = field6867[2];
            var6.field7714 = field6867[3];
            var6.field7715 = field6867[4];
            var6.field7712 = field6867[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class144 var9 = (class144) arg0[var8];
                var9.method927(var7, arg2);
                if (var9.field2062 != null) {
                    var7 += var9.field2062.length * 9;
                }
                if (var9.field2063 != null) {
                    var7 += var9.field2063.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(FFF)V", line = 115)
    public final void method483(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ll;)V", line = 118)
    public final void method478(class16 arg0) {
        this.field6862 = (class262) arg0;
        this.method2774(arg0);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Lc;Lia;[Lnh;I)V", line = 122)
    public final void method453(class121[] arg0, class415 arg1, class525[] arg2, int arg3) {
        if (arg2 == null) {
            this.method2761().method74(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class525 var5 = arg2[0];
            field6867[5] = 0;
            this.method2761().method74(this, arg0, arg1, field6867, -1, arg3);
            var5.field7713 = field6867[0];
            var5.field7716 = field6867[1];
            var5.field7711 = field6867[2];
            var5.field7714 = field6867[3];
            var5.field7715 = field6867[4];
            var5.field7712 = field6867[5] != 0;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lpv;Lpv;FLpv;)Lpv;", line = 140)
    public final class50 method464(class50 arg0, class50 arg1, float arg2, class50 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lmp;Z)Lf;", line = 144)
    public final class529 method482(class531 arg0, boolean arg1) {
        int[] var3 = arg0.field7816;
        byte[] var4 = arg0.field7817;
        int var5 = arg0.field7821;
        int var6 = arg0.field7815;
        class529 var7;
        if (arg1 && arg0.field7813 == null) {
            var7 = new class345(this, this.field6862, var3, var4, 0, arg0.field7821, arg0.field7821, arg0.field7815);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field7813;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class396(this, this.field6862, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field7816[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class396(this, this.field6862, var9, 0, arg0.field7821, arg0.field7821, arg0.field7815);
                } else {
                    var7 = new class15(this, this.field6862, var9, 0, arg0.field7821, arg0.field7821, arg0.field7815);
                }
            }
        }
        var7.method118(arg0.field7814, arg0.field7820, arg0.field7818, arg0.field7819);
        return var7;
    }

    @OriginalMember(owner = "client!h", name = "A", descriptor = "()Ljava/lang/Object;", line = 221)
    private final Object method2764() {
        return new class328();
    }

    @OriginalMember(owner = "client!h", name = "y", descriptor = "()Z", line = 224)
    public final boolean method471() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "o", descriptor = "()Z", line = 227)
    public final boolean method536() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "n", descriptor = "()Lia;", line = 231)
    public final class415 method491() {
        return new class136();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V", line = 233)
    public final void method500(boolean arg0) {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)I", line = 241)
    public final int method463(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "()V", line = 247)
    public final void method535() {
        for (class262 var1 = (class262) this.field6863.method3072((byte) 26); var1 != null; var1 = (class262) this.field6863.method3066(2)) {
            var1.method1512();
        }
        this.field6863.method3076((byte) -89);
        this.method2773();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lc;Lqb;Lia;Lnh;I)V", line = 263)
    public final void method512(class121 arg0, class148 arg1, class415 arg2, class525 arg3, int arg4) {
        this.method2767(arg1, true);
        if (arg3 == null) {
            this.method2761().method88(this, arg0, arg2, (int[]) null, arg4, field6866, field6874, field6869, field6870, field6875, arg1.field2090.method1039(-117), field6868);
        } else {
            field6867[5] = 0;
            this.method2761().method88(this, arg0, arg2, field6867, arg4, field6866, field6874, field6869, field6870, field6875, arg1.field2090.method1039(78), field6868);
            arg3.field7713 = field6867[0];
            arg3.field7716 = field6867[1];
            arg3.field7711 = field6867[2];
            arg3.field7714 = field6867[3];
            arg3.field7715 = field6867[4];
            arg3.field7712 = field6867[5] != 0;
        }
        class144 var6 = (class144) arg0;
        var6.method927(0, arg2);
    }

    @OriginalMember(owner = "client!h", name = "t", descriptor = "()Z", line = 283)
    public final boolean method495() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lwk;IIII)Lc;", line = 286)
    public final class121 method540(class94 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class144(this, this.field6862, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!h", name = "h", descriptor = "()Z", line = 289)
    public final boolean method515() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V", line = 292)
    public final void method468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2761().method91(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIZ)Lf;", line = 295)
    public final class529 method454(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class396(this, this.field6862, arg0, arg1, arg2, arg3) : new class15(this, this.field6862, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!h", name = "p", descriptor = "()Z", line = 302)
    public final boolean method481() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "C", descriptor = "()I", line = 306)
    public final int method528() {
        return 4;
    }

    @OriginalMember(owner = "client!h", name = "MA", descriptor = "(S)Z", line = 309)
    private final boolean method2766(short arg0) {
        class126 var2 = super.field2312;
        synchronized (super.field2312) {
            if (!super.field2312.method831(arg0, -107)) {
                return false;
            } else {
                class501 var4 = super.field2312.method830(arg0, (byte) 71);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field7371 && var4.field7381) {
                        var6 = super.field2312.method833(true, 128, 0.7F, -12422, 128, arg0);
                    } else {
                        var6 = super.field2312.method834(true, 0.7F, arg0, 128, -113, 128);
                    }
                    this.method2763(arg0, var4.field7375, var4.field7362, var4.field7381, var4.field7371, var4.field7363, var4.field7382, var4.field7358, var4.field7366, var4.field7367, var4.field7369, var4.field7359, var4.field7364, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "k", descriptor = "()Z", line = 335)
    public final boolean method531() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lqb;)V", line = 338)
    public final void method436(class148 arg0) {
        this.method2767(arg0, false);
        this.method2761().method84(this, field6866, field6874, field6869, field6870, arg0.field2090.method1039(-86));
    }

    @OriginalMember(owner = "client!h", name = "j", descriptor = "()V", line = 344)
    public final void method435() {
        for (int var1 = 0; var1 < 7; ++var1) {
            if (var1 == 6) {
                throw new RuntimeException();
            }
            if (this.field6877.getPeer() != null) {
                break;
            }
            class496.method2931((byte) 124, 300L);
        }
        this.field6876.method1774();
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V", line = 368)
    public final void method451(boolean arg0) {
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "()V", line = 370)
    public final void method446() {
    }

    @OriginalMember(owner = "client!h", name = "u", descriptor = "()Z", line = 374)
    public final boolean method485() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "m", descriptor = "()Z", line = 377)
    public final boolean method470() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "x", descriptor = "()V", line = 382)
    public final void method433() {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lqb;Z)V", line = 389)
    private final void method2767(class148 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class151 var8 = (class151) arg0.field2090.method1035((byte) 81); var8 != null; var8 = (class151) arg0.field2090.method1034((byte) -127)) {
            field6866[var3++] = var8.field2117;
            field6866[var3++] = var8.field2120;
            field6866[var3++] = var8.field2125;
            field6874[var4++] = var8.field2121;
            field6870[var6++] = (short) var8.field2122;
            field6869[var5++] = var8.field2128;
            if (arg1) {
                field6875[var7++] = var8.field2118;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 421)
    public final void method461(Rectangle[] arg0, int arg1) {
        for (int var3 = 0; var3 < 7; ++var3) {
            if (var3 == 6) {
                throw new RuntimeException();
            }
            if (this.field6877.getPeer() != null) {
                break;
            }
            class496.method2931((byte) 124, 300L);
        }
        for (int var4 = 0; var4 < arg1; ++var4) {
            Rectangle var5 = arg0[var4];
            if (var5.width > 0 && var5.height > 0) {
                this.field6876.method1773(var5.x, var5.y, var5.width, var5.height);
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "i", descriptor = "()Z", line = 461)
    public final boolean method450() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V", line = 464)
    public final void method486(int arg0) {
        this.field6882[arg0].method81();
    }

    @OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V", line = 467)
    protected final void finalize() {
        this.method79();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII)V", line = 470)
    public final void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method530(arg0, arg1, arg2, arg4, arg5);
        this.method530(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method511(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method511(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!h", name = "r", descriptor = "()Z", line = 476)
    public final boolean method529() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V", line = 479)
    public final void method442(int arg0) {
        this.field6883 = arg0;
        this.field6882 = new class10[this.field6883];
        for (int var2 = 0; var2 < this.field6883; ++var2) {
            this.field6882[var2] = new class10(this, this.field6881, this.field6879);
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(Z)V", line = 491)
    public final void method469(boolean arg0) {
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "()Z", line = 495)
    public final boolean method474() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)V", line = 497)
    public final void method493(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIF)Lpe;", line = 500)
    public final class432 method455(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class453(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 509)
    public final void method538(Canvas arg0) {
        class313 var2 = (class313) this.field6878.method979((byte) 28, (long) arg0.hashCode());
        Dimension var3 = arg0.getSize();
        var2.method1772(arg0, var3.width, var3.height);
        if (arg0 != null && this.field6877 == arg0) {
            this.method449(arg0);
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)Ll;", line = 519)
    public final class16 method501(int arg0) {
        class262 var2 = new class262(this, arg0);
        this.field6863.method3070(var2, (byte) -126);
        return var2;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()Z", line = 524)
    public final boolean method441() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lpv;)V", line = 529)
    public final void method524(class50 arg0) {
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(IIIIII)V", line = 532)
    public final void method504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2769(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!h", name = "q", descriptor = "()V", line = 537)
    public final void method508() {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II[[I[[IIII)Lna;", line = 543)
    public final class35 method518(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class218(this, this.field6862, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "()V", line = 545)
    public final void method505() {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIILea;II)V", line = 549)
    public final void method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class382 arg6, int arg7, int arg8) {
        this.method2771(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)I", line = 553)
    public final int method472(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!h", name = "l", descriptor = "()Lia;", line = 561)
    public final class415 method539() {
        return this.field6880;
    }

    @OriginalMember(owner = "client!h", name = "z", descriptor = "()Z", line = 572)
    public final boolean method465() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 578)
    public final void method473(Canvas arg0) {
        class313 var2 = (class313) this.field6878.method979((byte) 28, (long) arg0.hashCode());
        if (var2 == null) {
            class313 var3 = new class313(this, arg0);
            this.field6878.method990((long) arg0.hashCode(), (byte) 46, var3);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II[I[I)Lea;", line = 588)
    public final class382 method434(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class198(this, this.field6862, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!h", name = "v", descriptor = "()V", line = 593)
    public final void method498() {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([IIIII)Lf;", line = 597)
    public final class529 method476(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class396(this, this.field6862, arg0, arg1, arg2, arg3, arg4) : new class15(this, this.field6862, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class396(this, this.field6862, arg0, arg1, arg2, arg3, arg4) : new class15(this, this.field6862, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 634)
    public final void method449(Canvas arg0) {
        if (arg0 != null) {
            class313 var2 = (class313) this.field6878.method979((byte) 28, (long) arg0.hashCode());
            this.field6877 = arg0;
            this.field6876 = var2;
            this.method2760(var2);
        } else {
            this.field6877 = null;
            this.field6876 = null;
            this.method2760((class313) null);
        }
    }

    @OriginalMember(owner = "client!h", name = "s", descriptor = "()Z", line = 656)
    public final boolean method487() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I[Lpe;)V", line = 665)
    public final void method490(int arg0, class432[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field6865[var3++] = arg1[var4].method2578(true);
            field6865[var3++] = arg1[var4].method2573(106);
            field6865[var3++] = arg1[var4].method2572(false);
            field6865[var3++] = arg1[var4].method2574(false);
            field6873[var4] = arg1[var4].method2575(-86);
            field6865[var3++] = arg1[var4].method2577(127);
        }
        this.method2768(arg0, field6865, field6873);
    }

    @OriginalMember(owner = "client!h", name = "B", descriptor = "()Z", line = 683)
    public final boolean method513() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIII)V", line = 688)
    public final void method492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V", line = 691)
    public final void method496(int arg0) {
        class390.method2236(-65);
        this.method2765(arg0);
        for (class262 var2 = (class262) this.field6863.method3072((byte) 87); var2 != null; var2 = (class262) this.field6863.method3066(2)) {
            var2.method1514();
        }
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V", line = 710)
    public final void method534(int arg0) {
        this.field6882[arg0].method85();
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lm;Lkj;)V", line = 733)
    public class470(int arg0, Canvas arg1, class126 arg2, class397 arg3) {
        super(arg0, arg2);
        try {
            if (!field6872) {
                if (arg3 != null) {
                    arg3.method2287((byte) -120, this.getClass());
                    field6872 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("sw3d");
                    field6872 = Boolean.TRUE;
                }
            }
            if (!field6872) {
                throw new RuntimeException("");
            } else {
                this.method2770(super.field2312, 0, 0);
                if (arg1 != null) {
                    this.method473(arg1);
                    this.method449(arg1);
                }
                this.field6880 = new class136();
                this.method437(new class136());
                this.method442(1);
                this.method534(0);
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!h", name = "P", descriptor = "(Lla;)V")
    private final native void method2760(class313 arg0);

    @OriginalMember(owner = "client!h", name = "S", descriptor = "()V")
    public final native void method510();

    @OriginalMember(owner = "client!h", name = "va", descriptor = "()V")
    public final native void method526();

    @OriginalMember(owner = "client!h", name = "ua", descriptor = "(F)V")
    public final native void method525(float arg0);

    @OriginalMember(owner = "client!h", name = "GA", descriptor = "(IIII)V")
    public final native void method467(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method2763(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!h", name = "V", descriptor = "(III)V")
    public final native void method448(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!h", name = "xa", descriptor = "()I")
    public final native int method509();

    @OriginalMember(owner = "client!h", name = "aa", descriptor = "(IIIIII[BII)V")
    public final native void method479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!h", name = "ja", descriptor = "(I)V")
    private final native void method2765(int arg0);

    @OriginalMember(owner = "client!h", name = "pa", descriptor = "(IIII)V")
    public final native void method462(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "w", descriptor = "()F")
    public final native float method439();

    @OriginalMember(owner = "client!h", name = "O", descriptor = "(IIIII)V")
    public final native void method506(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!h", name = "IA", descriptor = "(IIII)[I")
    public final native int[] method443(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "JA", descriptor = "(II)V")
    public final native void method458(int arg0, int arg1);

    @OriginalMember(owner = "client!h", name = "ba", descriptor = "(IIII)V")
    public final native void method466(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "U", descriptor = "(IIIII)V")
    public final native void method530(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "(IIII)V")
    public final native void method516(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "M", descriptor = "(I)V")
    public final native void method532(int arg0);

    @OriginalMember(owner = "client!h", name = "VA", descriptor = "(I[I[F)V")
    private final native void method2768(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!h", name = "u", descriptor = "([I)V")
    public final native void method514(int[] arg0);

    @OriginalMember(owner = "client!h", name = "m", descriptor = "(Lia;)V")
    public final native void method437(class415 arg0);

    @OriginalMember(owner = "client!h", name = "K", descriptor = "(IIIIII)V")
    private final native void method2769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!h", name = "B", descriptor = "(Lm;II)V")
    private final native void method2770(class126 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!h", name = "ta", descriptor = "(IIIIIILea;II)V")
    private final native void method2771(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class382 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!h", name = "ia", descriptor = "(III[I)V")
    public final native void method533(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!h", name = "da", descriptor = "(IIIII)V")
    public final native void method511(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!h", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method2772(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!h", name = "ya", descriptor = "()V")
    public final native void method79();

    @OriginalMember(owner = "client!h", name = "d", descriptor = "()I")
    public final native int method447();

    @OriginalMember(owner = "client!h", name = "j", descriptor = "(ILea;II)V")
    public final native void method517(int arg0, class382 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "la", descriptor = "()F")
    public final native float method499();

    @OriginalMember(owner = "client!h", name = "I", descriptor = "()V")
    private final native void method2773();

    @OriginalMember(owner = "client!h", name = "o", descriptor = "(FF)V")
    public final native void method440(float arg0, float arg1);

    @OriginalMember(owner = "client!h", name = "na", descriptor = "(I)V")
    public final native void method522(int arg0);

    @OriginalMember(owner = "client!h", name = "fa", descriptor = "(IIII)V")
    public final native void method502(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "NA", descriptor = "(IIIIII)V")
    public final native void method459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "(Ll;)V")
    private final native void method2774(class16 arg0);

    @OriginalMember(owner = "client!h", name = "SA", descriptor = "(IIIIII)Z")
    public final native boolean method507(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!h", name = "XA", descriptor = "(IFFFFF)V")
    public final native void method520(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!h", name = "FA", descriptor = "()I")
    public final native int method484();

    @OriginalMember(owner = "client!h", name = "W", descriptor = "()I")
    public final native int method460();

    @OriginalMember(owner = "client!h", name = "g", descriptor = "()I")
    public final native int method432();
}
