import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class57 extends class650 implements class145 {

    @OriginalMember(owner = "client!da", name = "s", descriptor = "Z")
    private boolean field720 = false;

    @OriginalMember(owner = "client!da", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "Lws;")
    private class333 field721 = new class333();

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    private int field733 = 4096;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "I")
    private int field738 = 4096;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "Lhd;")
    private class694 field734 = new class694(4);

    @OriginalMember(owner = "client!da", name = "M", descriptor = "Z")
    private boolean field739 = false;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "Lq;")
    private class396 field737;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "[I")
    private static int[] field719 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!da", name = "y", descriptor = "[I")
    private static int[] field726 = field719;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "[I")
    private static int[] field728 = field719;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "[I")
    public static int[] field724 = new int[6];

    @OriginalMember(owner = "client!da", name = "C", descriptor = "[B")
    private static byte[] field729 = new byte[8191];

    @OriginalMember(owner = "client!da", name = "z", descriptor = "[I")
    private static int[] field727 = new int[8191];

    @OriginalMember(owner = "client!da", name = "E", descriptor = "[F")
    private static float[] field731 = new float[20];

    @OriginalMember(owner = "client!da", name = "u", descriptor = "[I")
    public static int[] field722 = field719;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "[F")
    private static float[] field723 = field731;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "[I")
    private static int[] field725 = new int[8191];

    @OriginalMember(owner = "client!da", name = "F", descriptor = "[S")
    private static short[] field732 = new short[8191];

    @OriginalMember(owner = "client!da", name = "N", descriptor = "I")
    private int field740;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "Lq;")
    private class396 field736;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "Lv;")
    private class542 field735;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "La;")
    private class579 field730;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "[Lt;")
    private class625[] field741;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I)Lfa;", line = 4)
    public final class219 method400(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class707(this, this.field730, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 7)
    public final void method345(Rectangle[] arg0, int arg1) throws class202 {
        if (this.field735 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field735.method2910(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!da", name = "i", descriptor = "()V", line = 16)
    public final void method401() {
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Liba;Z)Lxa;", line = 20)
    public final class468 method402(class495 arg0, boolean arg1) {
        int[] var3 = arg0.field6187;
        byte[] var4 = arg0.field6191;
        int var5 = arg0.field6193;
        int var6 = arg0.field6195;
        class468 var7;
        if (arg1 && arg0.field6189 == null) {
            var7 = new class421(this, this.field730, var3, var4, 0, arg0.field6193, arg0.field6193, arg0.field6195);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field6189;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class454(this, this.field730, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field6187[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class454(this, this.field730, var9, 0, arg0.field6193, arg0.field6193, arg0.field6195);
                } else {
                    var7 = new class259(this, this.field730, var9, 0, arg0.field6193, arg0.field6193, arg0.field6195);
                }
            }
        }
        var7.method1559(arg0.field6190, arg0.field6192, arg0.field6188, arg0.field6194);
        return var7;
    }

    @OriginalMember(owner = "client!da", name = "E", descriptor = "()Z", line = 96)
    public final boolean method404() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 100)
    public final void method405(Canvas arg0) {
        class542 var2 = (class542) this.field734.method3828((long) arg0.hashCode(), (byte) -91);
        Dimension var3 = arg0.getSize();
        var2.method2909(arg0, var3.width, var3.height);
        if (arg0 != null && this.field735.field6831 == arg0) {
            this.method411(arg0);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lig;Z)V", line = 111)
    private final void method407(class228 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class688 var8 = (class688) arg0.field2940.method2923(5); var8 != null; var8 = (class688) arg0.field2940.method2927(7)) {
            field728[var3++] = var8.field9471;
            field728[var3++] = var8.field9480;
            field728[var3++] = var8.field9475;
            field727[var4++] = var8.field9476;
            field732[var6++] = (short) var8.field9483;
            field725[var5++] = var8.field9469;
            if (arg1) {
                field729[var7++] = var8.field9482;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lnj;IIII)Lba;", line = 141)
    public final class359 method408(class229 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class507(this, this.field730, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!da", name = "A", descriptor = "()V", line = 147)
    public final void method312() {
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 150)
    public final void method411(Canvas arg0) {
        if (arg0 != null) {
            class542 var2 = (class542) this.field734.method3828((long) arg0.hashCode(), (byte) -91);
            this.field735 = var2;
            this.method440(var2);
        } else {
            this.field735 = null;
            this.method440((class542) null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[[I[[IIII)Ld;", line = 165)
    public final class140 method412(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class49(this, this.field730, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "(I)V", line = 168)
    public final void method413(int arg0) {
        this.field740 = arg0;
        this.field741 = new class625[this.field740];
        for (int var2 = 0; var2 < this.field740; ++var2) {
            this.field741[var2] = new class625(this, this.field738, this.field733);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lip;Lip;FLip;)Lip;", line = 183)
    public final class662 method351(class662 arg0, class662 arg1, float arg2, class662 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!da", name = "m", descriptor = "()Z", line = 186)
    public final boolean method361() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lub;[Liba;Z)Lta;", line = 190)
    public final class201 method414(class20 arg0, class495[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field6193;
            var5[var7] = arg1[var7].field6195;
            if (arg1[var7].field6189 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class312(this, this.field730, arg0, arg1, (class468[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class12(this, this.field730, arg0, arg1, (class468[]) null);
        }
    }

    @OriginalMember(owner = "client!da", name = "HA", descriptor = "()Ljava/lang/Object;", line = 228)
    private final Object method416() {
        return new class344(this);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 232)
    public final void method417(Canvas arg0) {
        class542 var2 = (class542) this.field734.method3828((long) arg0.hashCode(), (byte) -91);
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class542 var5 = new class542(this, arg0);
            this.field734.method3832(var5, (long) arg0.hashCode(), 121);
        }
    }

    @OriginalMember(owner = "client!da", name = "u", descriptor = "()Z", line = 252)
    public final boolean method419() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()Z", line = 257)
    public final boolean method422() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "C", descriptor = "()Z", line = 261)
    public final boolean method424() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V", line = 266)
    protected final synchronized void finalize() {
        this.method3623((byte) -74);
        if (this.nativeid != 0L) {
            class368.method2146((byte) -99, this);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lba;Lig;Lq;Lpo;I)V", line = 272)
    public final void method427(class359 arg0, class228 arg1, class396 arg2, class524 arg3, int arg4) {
        this.method407(arg1, true);
        if (arg3 == null) {
            this.method472().method3488(this, arg0, arg2, (int[]) null, arg4, field728, field727, field725, field732, field729, arg1.field2940.method2929((byte) 95), field722);
        } else {
            field724[5] = 0;
            this.method472().method3488(this, arg0, arg2, field724, arg4, field728, field727, field725, field732, field729, arg1.field2940.method2929((byte) 95), field722);
            arg3.field6624 = field724[0];
            arg3.field6627 = field724[1];
            arg3.field6626 = field724[2];
            arg3.field6628 = field724[3];
            arg3.field6623 = field724[4];
            arg3.field6625 = field724[5] != 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIII)Lxa;", line = 290)
    public final class468 method428(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class454(this, this.field730, arg0, arg1, arg2, arg3, arg4) : new class259(this, this.field730, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class454(this, this.field730, arg0, arg1, arg2, arg3, arg4) : new class259(this, this.field730, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!da", name = "n", descriptor = "()I", line = 326)
    public final int method430() {
        return 4;
    }

    @OriginalMember(owner = "client!da", name = "B", descriptor = "()V", line = 328)
    public final void method322() {
    }

    @OriginalMember(owner = "client!da", name = "x", descriptor = "()Lq;", line = 331)
    public final class396 method431() {
        return new class573();
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "()Z", line = 334)
    public final boolean method432() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIZ)Lxa;", line = 337)
    public final class468 method433(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class454(this, this.field730, arg0, arg1, arg2, arg3) : new class259(this, this.field730, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!da", name = "j", descriptor = "()Z", line = 344)
    public final boolean method434() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)V", line = 347)
    public final void method435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method454(arg0, arg1, arg2, arg4, arg5);
        this.method454(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method437(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method437(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIF)Lbj;", line = 353)
    public final class227 method436(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class560(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 362)
    public final void method439(Canvas arg0) {
        if (this.field735.field6831 == arg0) {
            this.method411((Canvas) null);
        }
        class542 var2 = (class542) this.field734.method3828((long) arg0.hashCode(), (byte) -91);
        if (var2 != null) {
            var2.method1566(-101);
            var2.method2912();
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZ)Lxa;", line = 378)
    public final class468 method441(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class454(this, this.field730, arg0, arg1) : new class259(this, this.field730, arg0, arg1);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)V", line = 390)
    public final void method388(boolean arg0) {
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 393)
    public final void method444(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILfa;II)V", line = 398)
    public final void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class219 arg6, int arg7, int arg8) {
        this.method474(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)V", line = 403)
    public final void method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method472().method3485(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!da", name = "t", descriptor = "()Ltaa;", line = 413)
    public final class379 method317() {
        return new class379(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!da", name = "w", descriptor = "()V", line = 417)
    public final void method327() {
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(Z)V", line = 419)
    public final void method455(boolean arg0) {
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()V", line = 421)
    public final void method374() {
    }

    @OriginalMember(owner = "client!da", name = "z", descriptor = "()Z", line = 424)
    public final boolean method393() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIII)V", line = 428)
    public final void method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;)V", line = 646)
    public class57(Canvas arg0, class498 arg1) {
        super(arg1);
        try {
            if (!class362.method2099(34167, "sw3d")) {
                throw new RuntimeException("");
            } else {
                class368.method2145(0);
                this.method479(super.field8781, 0, 0);
                class536.method2886(true, (byte) -45, false);
                this.field739 = true;
                this.field737 = new class573();
                this.method490(new class573());
                this.method413(1);
                this.method494(0);
                if (arg0 != null) {
                    this.method417(arg0);
                    this.method411(arg0);
                }
            }
        } catch (Throwable var3) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lip;)V", line = 433)
    public final void method458(class662 arg0) {
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(S)Z", line = 436)
    private final boolean method459(short arg0) {
        class498 var2 = super.field8781;
        synchronized (super.field8781) {
            if (!super.field8781.method2717(arg0, false)) {
                return false;
            } else {
                class152 var4 = super.field8781.method2718(arg0, (byte) 72);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (!var4.field1829) {
                        var6 = super.field8781.method2714(0.7F, arg0, 128, 19991, true, 128);
                    } else {
                        var6 = super.field8781.method2715(128, 128, arg0, 0.7F, true, true);
                    }
                    this.method425(arg0, var4.field1820, var4.field1816, var4.field1811, var4.field1818, var4.field1817, var4.field1806, var4.field1821, var4.field1809, var4.field1825, var4.field1805, var4.field1808, var4.field1812, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(FFF)V", line = 462)
    public final void method391(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!da", name = "qa", descriptor = "(S)Z", line = 465)
    private final boolean method463(short arg0) {
        synchronized (this) {
            class152 var3 = super.field8781.method2718(arg0, (byte) 72);
            if (var3 == null) {
                return false;
            } else {
                this.method452(arg0, var3.field1820, var3.field1816, var3.field1811, var3.field1818, var3.field1817, var3.field1806, var3.field1821, var3.field1809, var3.field1825, var3.field1805, var3.field1808, var3.field1812);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "p", descriptor = "()Z", line = 477)
    public final boolean method465() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "y", descriptor = "()Z", line = 480)
    public final boolean method466() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "r", descriptor = "()V", line = 485)
    public final void method336() {
        this.method411(this.field735.field6831);
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)Li;", line = 490)
    public final class37 method468(int arg0) {
        class579 var2 = new class579(this, arg0);
        this.field721.method1904(var2, -113);
        return var2;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I", line = 495)
    public final int method469(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!da", name = "q", descriptor = "()Lq;", line = 499)
    public final class396 method470() {
        return this.field737;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()Z", line = 502)
    public final boolean method471() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "H", descriptor = "()Lt;", line = 507)
    public final class625 method472() {
        for (int var1 = 0; var1 < this.field740; ++var1) {
            if (this.field741[var1].field8486 == Thread.currentThread()) {
                return this.field741[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lbj;)V", line = 520)
    public final void method473(int arg0, class227[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field726[var3++] = arg1[var4].method1374((byte) 72);
            field726[var3++] = arg1[var4].method1373((byte) -121);
            field726[var3++] = arg1[var4].method1370((byte) -5);
            field726[var3++] = arg1[var4].method1367(126);
            field723[var4] = arg1[var4].method1368(128);
            field726[var3++] = arg1[var4].method1372(127);
        }
        this.method496(arg0, field726, field723);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V", line = 543)
    public final void method476(int arg0) {
        this.field741[arg0].method3480();
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "()Z", line = 546)
    public final boolean method477() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lxa;Z)V", line = 549)
    public final void method369(class468 arg0, boolean arg1) {
        if (arg0 instanceof class259) {
            this.method421((class259) arg0);
        } else if (arg0 instanceof class454) {
            this.method495((class454) arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "()V", line = 563)
    public final void method392() {
        if (!this.field720) {
            this.field741 = null;
            this.field735 = null;
            this.field730 = null;
            this.field737 = null;
            this.field734.method3839((byte) -105);
            for (class579 var1 = (class579) this.field721.method1909(true); var1 != null; var1 = (class579) this.field721.method1916((byte) 122)) {
                var1.method3204();
            }
            this.field721.method1913((byte) 47);
            this.method446();
            if (this.field739) {
                class465.method2536(true, false, 0);
                this.field739 = false;
            }
            this.method486();
            class368.method2143(-20832);
            this.field720 = true;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lba;Lig;Lq;[Lpo;I)V", line = 594)
    public final void method480(class359[] arg0, class228 arg1, class396 arg2, class524[] arg3, int arg4) {
        this.method407(arg1, true);
        if (arg3 == null) {
            this.method472().method3493(this, arg0, arg2, (int[]) null, arg4, field728, field727, field725, field732, field729, arg1.field2940.method2929((byte) 95), field722);
        } else {
            class524 var6 = arg3[0];
            field724[5] = 0;
            this.method472().method3493(this, arg0, arg2, field724, arg4, field728, field727, field725, field732, field729, arg1.field2940.method2929((byte) 95), field722);
            var6.field6624 = field724[0];
            var6.field6627 = field724[1];
            var6.field6626 = field724[2];
            var6.field6628 = field724[3];
            var6.field6623 = field724[4];
            var6.field6625 = field724[5] != 0;
        }
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                class507 var8 = (class507) arg0[var7];
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "()Z", line = 638)
    public final boolean method481() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V", line = 640)
    public final void method482(boolean arg0) {
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(IIIIII)Lip;", line = 643)
    public final class662 method483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lig;)V", line = 676)
    public final void method485(class228 arg0) {
        this.method407(arg0, false);
        this.method472().method3490(this, field728, field727, field725, field732, arg0.field2940.method2929((byte) 95));
    }

    @OriginalMember(owner = "client!da", name = "s", descriptor = "()V", line = 681)
    private final void method486() {
        System.gc();
        System.runFinalization();
        class368.method2144((byte) 78);
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()Z", line = 687)
    public final boolean method488() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Li;)V", line = 694)
    public final void method489(class37 arg0) {
        this.field730 = (class579) arg0;
        this.method415(arg0);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;)V", line = 698)
    public final void method490(class396 arg0) {
        this.field736 = arg0;
        this.method462(arg0);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lba;Lq;[Lpo;I)V", line = 702)
    public final void method491(class359[] arg0, class396 arg1, class524[] arg2, int arg3) {
        if (arg2 == null) {
            this.method472().method3479(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class524 var5 = arg2[0];
            field724[5] = 0;
            this.method472().method3479(this, arg0, arg1, field724, -1, arg3);
            var5.field6624 = field724[0];
            var5.field6627 = field724[1];
            var5.field6626 = field724[2];
            var5.field6628 = field724[3];
            var5.field6623 = field724[4];
            var5.field6625 = field724[5] != 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "l", descriptor = "()V", line = 720)
    public final void method325() {
    }

    @OriginalMember(owner = "client!da", name = "D", descriptor = "()Z", line = 723)
    public final boolean method492() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)I", line = 730)
    public final int method493(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V", line = 755)
    public final void method379(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V", line = 758)
    public final void method354(int arg0) {
        class368.method2144((byte) 84);
        this.method487(arg0);
        for (class579 var2 = (class579) this.field721.method1909(true); var2 != null; var2 = (class579) this.field721.method1916((byte) 127)) {
            var2.method3203();
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V", line = 771)
    public final void method494(int arg0) {
        this.field741[arg0].method3487();
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(IIIIII)V", line = 797)
    public final void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method464(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!da", name = "o", descriptor = "()V", line = 803)
    public final void method318() throws class202 {
        if (this.field735 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field735.method2913();
        }
    }

    @OriginalMember(owner = "client!da", name = "ca", descriptor = "(IIII)V")
    public final native void method403(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "ka", descriptor = "(FF)V")
    public final native void method406(float arg0, float arg1);

    @OriginalMember(owner = "client!da", name = "k", descriptor = "()V")
    public final native void method409();

    @OriginalMember(owner = "client!da", name = "F", descriptor = "()V")
    public final native void method410();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Li;)V")
    private final native void method415(class37 arg0);

    @OriginalMember(owner = "client!da", name = "X", descriptor = "(III)V")
    public final native void method418(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "na", descriptor = "(III[I)V")
    public final native void method420(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!da", name = "TA", descriptor = "(Lja;)V")
    private final native void method421(class259 arg0);

    @OriginalMember(owner = "client!da", name = "U", descriptor = "()I")
    public final native int method423();

    @OriginalMember(owner = "client!da", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method425(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!da", name = "L", descriptor = "(ILfa;II)V")
    public final native void method426(int arg0, class219 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "v", descriptor = "()I")
    public final native int method429();

    @OriginalMember(owner = "client!da", name = "KA", descriptor = "(IIII)[I")
    public final native int[] method396(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "ya", descriptor = "(IIIII)V")
    public final native void method437(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "sa", descriptor = "(II)V")
    public final native void method438(int arg0, int arg1);

    @OriginalMember(owner = "client!da", name = "P", descriptor = "(Lv;)V")
    private final native void method440(class542 arg0);

    @OriginalMember(owner = "client!da", name = "JA", descriptor = "(I)V")
    public final native void method442(int arg0);

    @OriginalMember(owner = "client!da", name = "ma", descriptor = "(IIIIII[BII)V")
    public final native void method443(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!da", name = "SA", descriptor = "()I")
    public final native int method380();

    @OriginalMember(owner = "client!da", name = "YA", descriptor = "(IFFFFF)V")
    public final native void method445(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "()V")
    private final native void method446();

    @OriginalMember(owner = "client!da", name = "H", descriptor = "(Z)V")
    public final native void method57(boolean arg0);

    @OriginalMember(owner = "client!da", name = "ha", descriptor = "(F)V")
    public final native void method449(float arg0);

    @OriginalMember(owner = "client!da", name = "m", descriptor = "(IIII)V")
    public final native void method450(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "(IIII)V")
    public final native void method451(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method452(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(IIIII)V")
    public final native void method453(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(IIIII)V")
    public final native void method454(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "LA", descriptor = "(IIII)V")
    public final native void method456(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "aa", descriptor = "()I")
    public final native int method460();

    @OriginalMember(owner = "client!da", name = "IA", descriptor = "()I")
    public final native int method461();

    @OriginalMember(owner = "client!da", name = "o", descriptor = "(Lq;)V")
    private final native void method462(class396 arg0);

    @OriginalMember(owner = "client!da", name = "BA", descriptor = "(IIIIII)V")
    private final native void method464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!da", name = "FA", descriptor = "(IIIIII)Z")
    public final native boolean method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!da", name = "D", descriptor = "(I)V")
    public final native void method315(int arg0);

    @OriginalMember(owner = "client!da", name = "ra", descriptor = "(IIIIIILfa;II)V")
    private final native void method474(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class219 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!da", name = "C", descriptor = "(IIIIII)V")
    public final native void method475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!da", name = "A", descriptor = "([I)V")
    public final native void method478(int[] arg0);

    @OriginalMember(owner = "client!da", name = "PA", descriptor = "(Le;II)V")
    private final native void method479(class498 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "AA", descriptor = "(IIII)V")
    public final native void method484(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    private final native void method487(int arg0);

    @OriginalMember(owner = "client!da", name = "N", descriptor = "(Laa;)V")
    private final native void method495(class454 arg0);

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I[I[F)V")
    private final native void method496(int arg0, int[] arg1, float[] arg2);
}
