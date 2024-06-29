import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class124 extends class165 implements class415 {

    @OriginalMember(owner = "client!c", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "Z")
    private boolean field1661 = false;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "Lps;")
    private class63 field1671 = new class63();

    @OriginalMember(owner = "client!c", name = "L", descriptor = "I")
    private int field1677 = 4096;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "I")
    private int field1679 = 4096;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "Llp;")
    private class272 field1675 = new class272(4);

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "Z")
    private boolean field1682 = false;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "Ln;")
    private class14 field1676;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
    private static int[] field1662 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!c", name = "y", descriptor = "[B")
    private static byte[] field1664 = new byte[8191];

    @OriginalMember(owner = "client!c", name = "A", descriptor = "[S")
    private static short[] field1666 = new short[8191];

    @OriginalMember(owner = "client!c", name = "E", descriptor = "[I")
    private static int[] field1670 = new int[8191];

    @OriginalMember(owner = "client!c", name = "D", descriptor = "[I")
    public static int[] field1669 = field1662;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
    public static int[] field1665 = new int[6];

    @OriginalMember(owner = "client!c", name = "G", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field1672 = Boolean.FALSE;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "[I")
    private static int[] field1668 = field1662;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "[F")
    private static float[] field1673 = new float[20];

    @OriginalMember(owner = "client!c", name = "x", descriptor = "[F")
    private static float[] field1663 = field1673;

    @OriginalMember(owner = "client!c", name = "B", descriptor = "[I")
    private static int[] field1667 = new int[8191];

    @OriginalMember(owner = "client!c", name = "I", descriptor = "[I")
    private static int[] field1674 = field1662;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "I")
    private int field1680;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "Lca;")
    private class202 field1678;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "Lk;")
    private class403 field1660;

    @OriginalMember(owner = "client!c", name = "P", descriptor = "[Lwa;")
    private class442[] field1681;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V", line = 5)
    public final void method740(int arg0) {
        this.field1681[arg0].method2674();
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 12)
    public final void method744(Canvas arg0) {
        class202 var2 = (class202) this.field1675.method1747((long) arg0.hashCode(), false);
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class202 var5 = new class202(this, arg0);
            this.field1675.method1751((long) arg0.hashCode(), -91, var5);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIII)Llo;", line = 32)
    public final class539 method746(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)Lw;", line = 39)
    public final class198 method749(int arg0) {
        class403 var2 = new class403(this, arg0);
        this.field1671.method453((byte) 118, var2);
        return var2;
    }

    @OriginalMember(owner = "client!c", name = "o", descriptor = "()Ln;", line = 45)
    public final class14 method751() {
        return this.field1676;
    }

    @OriginalMember(owner = "client!c", name = "finalize", descriptor = "()V", line = 48)
    protected final synchronized void finalize() {
        this.method1120((byte) -123);
        if (this.nativeid != 0L) {
            class93.method626(this, 0);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II[[I[[IIII)Lo;", line = 55)
    public final class23 method752(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class42(this, this.field1660, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!c", name = "z", descriptor = "()Z", line = 64)
    public final boolean method755() {
        return false;
    }

    @OriginalMember(owner = "client!c", name = "u", descriptor = "()V", line = 68)
    public final void method757() {
        if (this.field1678 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field1678.method1365();
        }
    }

    @OriginalMember(owner = "client!c", name = "k", descriptor = "()Z", line = 85)
    public final boolean method763() {
        return true;
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V", line = 90)
    public final void method766(int arg0) {
        class93.method625(0);
        this.method764(arg0);
        for (class403 var2 = (class403) this.field1671.method445(33); var2 != null; var2 = (class403) this.field1671.method451(false)) {
            var2.method2486();
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([IIIII)Laa;", line = 104)
    public final class341 method767(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class34(this, this.field1660, arg0, arg1, arg2, arg3, arg4) : new class299(this, this.field1660, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class34(this, this.field1660, arg0, arg1, arg2, arg3, arg4) : new class299(this, this.field1660, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!c", name = "ZA", descriptor = "()V", line = 139)
    private final void method768() {
        System.gc();
        System.runFinalization();
        class93.method625(0);
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "()Z", line = 147)
    public final boolean method771() {
        return false;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(IIIIII)V", line = 150)
    public final void method772(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method842(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!c", name = "C", descriptor = "()Lwa;", line = 155)
    public final class442 method773() {
        for (int var1 = 0; var1 < this.field1680; ++var1) {
            if (this.field1681[var1].field6661 == Thread.currentThread()) {
                return this.field1681[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lmn;Z)Laa;", line = 169)
    public final class341 method774(class252 arg0, boolean arg1) {
        int[] var3 = arg0.field3508;
        byte[] var4 = arg0.field3506;
        int var5 = arg0.field3512;
        int var6 = arg0.field3513;
        class341 var7;
        if (arg1 && arg0.field3511 == null) {
            var7 = new class349(this, this.field1660, var3, var4, 0, arg0.field3512, arg0.field3512, arg0.field3513);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field3511;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class34(this, this.field1660, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field3508[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class34(this, this.field1660, var9, 0, arg0.field3512, arg0.field3512, arg0.field3513);
                } else {
                    var7 = new class299(this, this.field1660, var9, 0, arg0.field3512, arg0.field3512, arg0.field3513);
                }
            }
        }
        var7.method294(arg0.field3509, arg0.field3505, arg0.field3510, arg0.field3507);
        return var7;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II)I", line = 245)
    public final int method775(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIII)V", line = 253)
    public final void method777(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method773().method2687(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!c", name = "i", descriptor = "()Z", line = 256)
    public final boolean method778() {
        return false;
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V", line = 261)
    public final void method780(int arg0) {
        this.field1680 = arg0;
        this.field1681 = new class442[this.field1680];
        for (int var2 = 0; var2 < this.field1680; ++var2) {
            this.field1681[var2] = new class442(this, this.field1679, this.field1677);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I", line = 275)
    public final int method781(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II[I[I)Li;", line = 278)
    public final class30 method782(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class108(this, this.field1660, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lfq;Z)V", line = 282)
    private final void method783(class137 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class462 var8 = (class462) arg0.field1827.method2466((byte) -97); var8 != null; var8 = (class462) arg0.field1827.method2468(-106)) {
            field1668[var3++] = var8.field6911;
            field1668[var3++] = var8.field6914;
            field1668[var3++] = var8.field6918;
            field1667[var4++] = var8.field6917;
            field1666[var6++] = (short) var8.field6913;
            field1670[var5++] = var8.field6910;
            if (arg1) {
                field1664[var7++] = var8.field6907;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V", line = 313)
    public final void method785(int arg0) {
        this.field1681[arg0].method2678();
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "()Z", line = 316)
    public final boolean method786() {
        return true;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(FFF)V", line = 321)
    public final void method789(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V", line = 323)
    public final void method790(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 331)
    public final void method791(Canvas arg0) {
        class202 var2 = (class202) this.field1675.method1747((long) arg0.hashCode(), false);
        Dimension var3 = arg0.getSize();
        var2.method1366(arg0, var3.width, var3.height);
        if (arg0 != null && this.field1678.field2711 == arg0) {
            this.method826(arg0);
        }
    }

    @OriginalMember(owner = "client!c", name = "w", descriptor = "()V", line = 341)
    public final void method792() {
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 348)
    public final void method794(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!c", name = "h", descriptor = "()Ln;", line = 351)
    public final class14 method795() {
        return new class185();
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "()Z", line = 357)
    public final boolean method797() {
        return true;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lfq;)V", line = 360)
    public final void method798(class137 arg0) {
        this.method783(arg0, false);
        this.method773().method2679(this, field1668, field1667, field1670, field1666, arg0.field1827.method2464(2));
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Llo;)V", line = 363)
    public final void method799(class539 arg0) {
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lw;)V", line = 367)
    public final void method800(class198 arg0) {
        this.field1660 = (class403) arg0;
        this.method832(arg0);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V", line = 371)
    public final void method801(boolean arg0) {
    }

    @OriginalMember(owner = "client!c", name = "x", descriptor = "()V", line = 374)
    public final void method802() {
        if (!this.field1661) {
            this.field1681 = null;
            this.field1678 = null;
            this.field1660 = null;
            this.field1676 = null;
            this.field1675.method1745(-64);
            for (class403 var1 = (class403) this.field1671.method445(33); var1 != null; var1 = (class403) this.field1671.method451(false)) {
                var1.method2487();
            }
            this.field1671.method450((byte) 73);
            this.method776();
            if (this.field1682) {
                class476.method2840(false, true, 0);
                this.field1682 = false;
            }
            this.method768();
            class93.method624(true);
            this.field1661 = true;
        }
    }

    @OriginalMember(owner = "client!c", name = "A", descriptor = "()Z", line = 404)
    public final boolean method803() {
        return true;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIIIII)V", line = 408)
    public final void method805(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([Lka;Lfq;Ln;[Lst;I)V", line = 412)
    public final void method807(class334[] arg0, class137 arg1, class14 arg2, class302[] arg3, int arg4) {
        this.method783(arg1, true);
        if (arg3 == null) {
            this.method773().method2685(this, arg0, arg2, (int[]) null, arg4, field1668, field1667, field1670, field1666, field1664, arg1.field1827.method2464(2), field1669);
        } else {
            class302 var6 = arg3[0];
            field1665[5] = 0;
            this.method773().method2685(this, arg0, arg2, field1665, arg4, field1668, field1667, field1670, field1666, field1664, arg1.field1827.method2464(2), field1669);
            var6.field4423 = field1665[0];
            var6.field4425 = field1665[1];
            var6.field4427 = field1665[2];
            var6.field4422 = field1665[3];
            var6.field4426 = field1665[4];
            var6.field4424 = field1665[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class158 var9 = (class158) arg0[var8];
                var9.method1029(var7, arg2);
                if (var9.field2046 != null) {
                    var7 += var9.field2046.length * 9;
                }
                if (var9.field2048 != null) {
                    var7 += var9.field2048.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "k", descriptor = "(S)Z", line = 454)
    private final boolean method808(short arg0) {
        synchronized (this) {
            class107 var3 = super.field2235.method157((byte) 126, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method825(arg0, var3.field1518, var3.field1505, var3.field1522, var3.field1515, var3.field1517, var3.field1520, var3.field1507, var3.field1506, var3.field1499, var3.field1512, var3.field1510, var3.field1514);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([Lka;Ln;[Lst;I)V", line = 465)
    public final void method809(class334[] arg0, class14 arg1, class302[] arg2, int arg3) {
        if (arg2 == null) {
            this.method773().method2683(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class302 var5 = arg2[0];
            field1665[5] = 0;
            this.method773().method2683(this, arg0, arg1, field1665, -1, arg3);
            var5.field4423 = field1665[0];
            var5.field4425 = field1665[1];
            var5.field4427 = field1665[2];
            var5.field4422 = field1665[3];
            var5.field4426 = field1665[4];
            var5.field4424 = field1665[5] != 0;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IIIIII)V", line = 485)
    public final void method810(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method758(arg0, arg1, arg2, arg4, arg5);
        this.method758(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method787(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method787(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!c", name = "l", descriptor = "()I", line = 491)
    public final int method811() {
        return 4;
    }

    @OriginalMember(owner = "client!c", name = "wa", descriptor = "(S)Z", line = 494)
    private final boolean method812(short arg0) {
        class15 var2 = super.field2235;
        synchronized (super.field2235) {
            if (!super.field2235.method160((byte) 23, arg0)) {
                return false;
            } else {
                class107 var4 = super.field2235.method157((byte) 121, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field1515 && var4.field1522) {
                        var6 = super.field2235.method156(arg0, true, 128, 128, 0.7F, (byte) -113);
                    } else {
                        var6 = super.field2235.method158(arg0, 128, -20, true, 128, 0.7F);
                    }
                    this.method765(arg0, var4.field1518, var4.field1505, var4.field1522, var4.field1515, var4.field1517, var4.field1520, var4.field1507, var4.field1506, var4.field1499, var4.field1512, var4.field1510, var4.field1514, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(ILjava/awt/Canvas;Ll;Ldq;)V", line = 621)
    public class124(int arg0, Canvas arg1, class15 arg2, class500 arg3) {
        super(arg0, arg2);
        try {
            if (!field1672) {
                if (arg3 != null) {
                    arg3.method2977((byte) -126, this.getClass());
                    field1672 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("sw3d");
                    field1672 = Boolean.TRUE;
                }
            }
            if (!field1672) {
                throw new RuntimeException("");
            } else {
                this.method806(super.field2235, 0, 0);
                class409.method2526(0, false, true);
                this.field1682 = true;
                this.field1676 = new class185();
                this.method821(new class185());
                this.method780(1);
                this.method740(0);
                if (arg1 != null) {
                    this.method744(arg1);
                    this.method826(arg1);
                }
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)V", line = 522)
    public final void method814(boolean arg0) {
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIF)Lbe;", line = 526)
    public final class28 method815(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class103(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIZ)Laa;", line = 530)
    public final class341 method816(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class34(this, this.field1660, arg0, arg1, arg2, arg3) : new class299(this, this.field1660, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!c", name = "q", descriptor = "()V", line = 536)
    public final void method817() {
    }

    @OriginalMember(owner = "client!c", name = "p", descriptor = "()Z", line = 540)
    public final boolean method818() {
        return true;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIILi;II)V", line = 544)
    public final void method819(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class30 arg6, int arg7, int arg8) {
        this.method745(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ln;)V", line = 550)
    public final void method821(class14 arg0) {
        this.method743(arg0);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 553)
    public final void method822(Canvas arg0) {
        if (this.field1678.field2711 == arg0) {
            this.method826((Canvas) null);
        }
        class202 var2 = (class202) this.field1675.method1747((long) arg0.hashCode(), false);
        if (var2 != null) {
            var2.method25(-13489);
            var2.method1368();
        }
    }

    @OriginalMember(owner = "client!c", name = "y", descriptor = "()Z", line = 566)
    public final boolean method823() {
        return false;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 571)
    public final void method826(Canvas arg0) {
        if (arg0 != null) {
            class202 var2 = (class202) this.field1675.method1747((long) arg0.hashCode(), false);
            this.field1678 = var2;
            this.method750(var2);
        } else {
            this.field1678 = null;
            this.method750((class202) null);
        }
    }

    @OriginalMember(owner = "client!c", name = "t", descriptor = "()Z", line = 593)
    public final boolean method827() {
        return false;
    }

    @OriginalMember(owner = "client!c", name = "v", descriptor = "()V", line = 602)
    public final void method831() {
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lnd;IIII)Lka;", line = 607)
    public final class334 method833(class387 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class158(this, this.field1660, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "()Z", line = 612)
    public final boolean method836() {
        return true;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()Z", line = 616)
    public final boolean method838() {
        return true;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lju;[Lmn;Z)Lba;", line = 662)
    public final class268 method839(class82 arg0, class252[] arg1, boolean arg2) {
        return arg2 ? new class223(this, this.field1660, arg0, arg1, (class341[]) null) : new class479(this, this.field1660, arg0, arg1, (class341[]) null);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lka;Lfq;Ln;Lst;I)V", line = 672)
    public final void method840(class334 arg0, class137 arg1, class14 arg2, class302 arg3, int arg4) {
        this.method783(arg1, true);
        if (arg3 == null) {
            this.method773().method2688(this, arg0, arg2, (int[]) null, arg4, field1668, field1667, field1670, field1666, field1664, arg1.field1827.method2464(2), field1669);
        } else {
            field1665[5] = 0;
            this.method773().method2688(this, arg0, arg2, field1665, arg4, field1668, field1667, field1670, field1666, field1664, arg1.field1827.method2464(2), field1669);
            arg3.field4423 = field1665[0];
            arg3.field4425 = field1665[1];
            arg3.field4427 = field1665[2];
            arg3.field4422 = field1665[3];
            arg3.field4426 = field1665[4];
            arg3.field4424 = field1665[5] != 0;
        }
        class158 var6 = (class158) arg0;
        var6.method1029(0, arg2);
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "()Z", line = 692)
    public final boolean method841() {
        return true;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(Z)V", line = 702)
    public final void method843(boolean arg0) {
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Llo;Llo;FLlo;)Llo;", line = 707)
    public final class539 method844(class539 arg0, class539 arg1, float arg2, class539 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "()V", line = 709)
    public final void method845() {
    }

    @OriginalMember(owner = "client!c", name = "n", descriptor = "()Z", line = 712)
    public final boolean method846() {
        return false;
    }

    @OriginalMember(owner = "client!c", name = "j", descriptor = "()Ljava/lang/Object;", line = 715)
    private final Object method847() {
        return new class104(this);
    }

    @OriginalMember(owner = "client!c", name = "B", descriptor = "()Z", line = 719)
    public final boolean method848() {
        return false;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I[Lbe;)V", line = 732)
    public final void method849(int arg0, class28[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field1674[var3++] = arg1[var4].method257(-88);
            field1674[var3++] = arg1[var4].method250((byte) 103);
            field1674[var3++] = arg1[var4].method255(-7164);
            field1674[var3++] = arg1[var4].method252(67);
            field1663[var4] = arg1[var4].method253(true);
            field1674[var3++] = arg1[var4].method254(true);
        }
        this.method835(arg0, field1674, field1663);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 762)
    public final void method851(Rectangle[] arg0, int arg1) {
        if (this.field1678 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field1678.method1369(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!c", name = "m", descriptor = "()V", line = 771)
    public final void method852() {
    }

    @OriginalMember(owner = "client!c", name = "w", descriptor = "(IIII)V")
    public final native void method739(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "s", descriptor = "()F")
    public final native float method741();

    @OriginalMember(owner = "client!c", name = "S", descriptor = "(IIIII)V")
    public final native void method742(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!c", name = "va", descriptor = "(Ln;)V")
    private final native void method743(class14 arg0);

    @OriginalMember(owner = "client!c", name = "da", descriptor = "(IIIIIILi;II)V")
    private final native void method745(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class30 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!c", name = "M", descriptor = "(IIIIII)V")
    public final native void method747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!c", name = "PA", descriptor = "(FF)V")
    public final native void method748(float arg0, float arg1);

    @OriginalMember(owner = "client!c", name = "ga", descriptor = "(Lca;)V")
    private final native void method750(class202 arg0);

    @OriginalMember(owner = "client!c", name = "H", descriptor = "()V")
    public final native void method753();

    @OriginalMember(owner = "client!c", name = "KA", descriptor = "(IIII)V")
    public final native void method754(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "na", descriptor = "()I")
    public final native int method756();

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(IIIII)V")
    public final native void method758(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!c", name = "la", descriptor = "(IFFFFF)V")
    public final native void method759(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!c", name = "ha", descriptor = "(III)V")
    public final native void method760(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "h", descriptor = "(II)V")
    public final native void method761(int arg0, int arg1);

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IIII)V")
    public final native void method762(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "ba", descriptor = "(I)V")
    private final native void method764(int arg0);

    @OriginalMember(owner = "client!c", name = "A", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method765(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!c", name = "K", descriptor = "(I)V")
    public final native void method769(int arg0);

    @OriginalMember(owner = "client!c", name = "ua", descriptor = "(IIIIII[BII)V")
    public final native void method770(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!c", name = "ja", descriptor = "()V")
    private final native void method776();

    @OriginalMember(owner = "client!c", name = "GA", descriptor = "(ILi;II)V")
    public final native void method779(int arg0, class30 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "I", descriptor = "()F")
    public final native float method784();

    @OriginalMember(owner = "client!c", name = "BA", descriptor = "(IIIII)V")
    public final native void method787(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!c", name = "r", descriptor = "()V")
    public final native void method788();

    @OriginalMember(owner = "client!c", name = "pa", descriptor = "()V")
    public final native void method304();

    @OriginalMember(owner = "client!c", name = "XA", descriptor = "(III[I)V")
    public final native void method793(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!c", name = "U", descriptor = "()I")
    public final native int method796();

    @OriginalMember(owner = "client!c", name = "TA", descriptor = "(IIIIII)Z")
    public final native boolean method804(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!c", name = "OA", descriptor = "(Ll;II)V")
    private final native void method806(class15 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "N", descriptor = "(IIII)[I")
    public final native int[] method813(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "sa", descriptor = "()I")
    public final native int method820();

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "()I")
    public final native int method824();

    @OriginalMember(owner = "client!c", name = "R", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method825(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!c", name = "IA", descriptor = "(IIII)V")
    public final native void method828(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "MA", descriptor = "(F)V")
    public final native void method829(float arg0);

    @OriginalMember(owner = "client!c", name = "q", descriptor = "(IIII)V")
    public final native void method830(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "ta", descriptor = "(Lw;)V")
    private final native void method832(class198 arg0);

    @OriginalMember(owner = "client!c", name = "l", descriptor = "(I)V")
    public final native void method834(int arg0);

    @OriginalMember(owner = "client!c", name = "F", descriptor = "(I[I[F)V")
    private final native void method835(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!c", name = "xa", descriptor = "()I")
    public final native int method837();

    @OriginalMember(owner = "client!c", name = "LA", descriptor = "(IIIIII)V")
    private final native void method842(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!c", name = "p", descriptor = "([I)V")
    public final native void method850(int[] arg0);
}
