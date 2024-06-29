import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class396 extends class43 implements class128 {

    @OriginalMember(owner = "client!da", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "Z")
    private boolean field5027 = false;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "Lki;")
    private class364 field5026 = new class364();

    @OriginalMember(owner = "client!da", name = "C", descriptor = "I")
    private int field5038 = 4096;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "I")
    private int field5041 = 4096;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "Lbc;")
    private class9 field5042 = new class9(4);

    @OriginalMember(owner = "client!da", name = "K", descriptor = "Z")
    private boolean field5046 = false;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "Lq;")
    private class151 field5043;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "[I")
    private static int[] field5025 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!da", name = "u", descriptor = "[I")
    public static int[] field5030 = field5025;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "[I")
    private static int[] field5034 = new int[8191];

    @OriginalMember(owner = "client!da", name = "z", descriptor = "[I")
    public static int[] field5035 = new int[6];

    @OriginalMember(owner = "client!da", name = "x", descriptor = "[F")
    private static float[] field5033 = new float[20];

    @OriginalMember(owner = "client!da", name = "w", descriptor = "[F")
    private static float[] field5032 = field5033;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "[I")
    private static int[] field5031 = field5025;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "[I")
    private static int[] field5036 = new int[8191];

    @OriginalMember(owner = "client!da", name = "s", descriptor = "[B")
    private static byte[] field5028 = new byte[8191];

    @OriginalMember(owner = "client!da", name = "B", descriptor = "[S")
    private static short[] field5037 = new short[8191];

    @OriginalMember(owner = "client!da", name = "t", descriptor = "[I")
    private static int[] field5029 = field5025;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "I")
    private int field5045;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "Lv;")
    private class146 field5040;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "Lq;")
    private class151 field5039;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "La;")
    private class613 field5024;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "[Lt;")
    private class606[] field5044;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "()V", line = 3)
    public final void method173() {
        this.method374(this.field5040.field1900);
    }

    @OriginalMember(owner = "client!da", name = "i", descriptor = "()Z", line = 6)
    public final boolean method344() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V", line = 9)
    public final void method209(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "()Z", line = 12)
    public final boolean method340() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lpn;)V", line = 17)
    public final void method412(int arg0, class296[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field5031[var3++] = arg1[var4].method1754(15);
            field5031[var3++] = arg1[var4].method1753((byte) 127);
            field5031[var3++] = arg1[var4].method1755(101);
            field5031[var3++] = arg1[var4].method1752(60);
            field5032[var4] = arg1[var4].method1756((byte) 124);
            field5031[var3++] = arg1[var4].method1751(120);
        }
        this.method2252(arg0, field5031, field5032);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lkn;)V", line = 34)
    public final void method403(class307 arg0) {
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "()Z", line = 37)
    public final boolean method338() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "G", descriptor = "()Lt;", line = 42)
    public final class606 method2251() {
        for (int var1 = 0; var1 < this.field5045; ++var1) {
            if (this.field5044[var1].field8196 == Thread.currentThread()) {
                return this.field5044[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)V", line = 54)
    public final void method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2251().method3296(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lfca;IIII)Lba;", line = 57)
    public final class107 method410(class645 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class300(this, this.field5024, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!da", name = "E", descriptor = "()V", line = 60)
    public final void method216() throws class381 {
        if (this.field5040 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field5040.method1089();
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIF)Lpn;", line = 70)
    public final class296 method385(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class363(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!da", name = "C", descriptor = "()V", line = 75)
    public final void method408() {
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lba;Lq;[Lht;I)V", line = 78)
    public final void method366(class107[] arg0, class151 arg1, class108[] arg2, int arg3) {
        if (arg2 == null) {
            this.method2251().method3282(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class108 var5 = arg2[0];
            field5035[5] = 0;
            this.method2251().method3282(this, arg0, arg1, field5035, -1, arg3);
            var5.field1405 = field5035[0];
            var5.field1406 = field5035[1];
            var5.field1407 = field5035[2];
            var5.field1403 = field5035[3];
            var5.field1402 = field5035[4];
            var5.field1404 = field5035[5] != 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "m", descriptor = "()Z", line = 99)
    public final boolean method355() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 103)
    public final void method374(Canvas arg0) {
        if (arg0 != null) {
            class146 var2 = (class146) this.field5042.method39((long) arg0.hashCode(), 31750);
            this.field5040 = var2;
            this.method2268(var2);
        } else {
            this.field5040 = null;
            this.method2268((class146) null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lba;Lqu;Lq;[Lht;I)V", line = 120)
    public final void method349(class107[] arg0, class282 arg1, class151 arg2, class108[] arg3, int arg4) {
        this.method2266(arg1, true);
        if (arg3 == null) {
            this.method2251().method3294(this, arg0, arg2, (int[]) null, arg4, field5029, field5036, field5034, field5037, field5028, arg1.field3673.method3183((byte) -85), field5030);
        } else {
            class108 var6 = arg3[0];
            field5035[5] = 0;
            this.method2251().method3294(this, arg0, arg2, field5035, arg4, field5029, field5036, field5034, field5037, field5028, arg1.field3673.method3183((byte) -99), field5030);
            var6.field1405 = field5035[0];
            var6.field1406 = field5035[1];
            var6.field1407 = field5035[2];
            var6.field1403 = field5035[3];
            var6.field1402 = field5035[4];
            var6.field1404 = field5035[5] != 0;
        }
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                class300 var8 = (class300) arg0[var7];
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()V", line = 164)
    public final void method180() {
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Law;Z)Lxa;", line = 169)
    public final class511 method325(class506 arg0, boolean arg1) {
        int[] var3 = arg0.field6648;
        byte[] var4 = arg0.field6647;
        int var5 = arg0.field6651;
        int var6 = arg0.field6650;
        class511 var7;
        if (arg1 && arg0.field6649 == null) {
            var7 = new class394(this, this.field5024, var3, var4, 0, arg0.field6651, arg0.field6651, arg0.field6650);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field6649;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class74(this, this.field5024, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field6648[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class74(this, this.field5024, var9, 0, arg0.field6651, arg0.field6651, arg0.field6650);
                } else {
                    var7 = new class599(this, this.field5024, var9, 0, arg0.field6651, arg0.field6651, arg0.field6650);
                }
            }
        }
        var7.method610(arg0.field6646, arg0.field6652, arg0.field6645, arg0.field6653);
        return var7;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I", line = 243)
    public final int method370(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V", line = 246)
    public final void method373(int arg0) {
        this.field5044[arg0].method3299();
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "()V", line = 248)
    public final void method194() {
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 251)
    public final void method348(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(Z)V", line = 258)
    public final void method167(boolean arg0) {
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 265)
    public final void method219(Rectangle[] arg0, int arg1) throws class381 {
        if (this.field5040 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field5040.method1087(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZ)Lxa;", line = 278)
    public final class511 method364(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class74(this, this.field5024, arg0, arg1) : new class599(this, this.field5024, arg0, arg1);
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(S)Z", line = 285)
    private final boolean method2255(short arg0) {
        class702 var2 = super.field598;
        synchronized (super.field598) {
            if (!super.field598.method3164((byte) -31, arg0)) {
                return false;
            } else {
                class59 var4 = super.field598.method3162((byte) -104, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (!var4.field812) {
                        var6 = super.field598.method3158(128, true, 0.7F, 128, arg0, (byte) -56);
                    } else {
                        var6 = super.field598.method3160(true, 128, arg0, 128, 0.7F, 83);
                    }
                    this.method2264(arg0, var4.field798, var4.field811, var4.field800, var4.field799, var4.field810, var4.field807, var4.field806, var4.field805, var4.field804, var4.field797, var4.field809, var4.field808, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(FFF)V", line = 309)
    public final void method201(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 313)
    public final void method367(Canvas arg0) {
        class146 var2 = (class146) this.field5042.method39((long) arg0.hashCode(), 31750);
        Dimension var3 = arg0.getSize();
        var2.method1091(arg0, var3.width, var3.height);
        if (arg0 != null && this.field5040.field1900 == arg0) {
            this.method374(arg0);
        }
    }

    @OriginalMember(owner = "client!da", name = "y", descriptor = "()Z", line = 322)
    public final boolean method387() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()Z", line = 325)
    public final boolean method329() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(IIIIII)V", line = 328)
    public final void method406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2265(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 333)
    public final void method407(Canvas arg0) {
        if (this.field5040.field1900 == arg0) {
            this.method374((Canvas) null);
        }
        class146 var2 = (class146) this.field5042.method39((long) arg0.hashCode(), 31750);
        if (var2 != null) {
            var2.method2438((byte) -9);
            var2.method1090();
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Li;)V", line = 347)
    public final void method345(class686 arg0) {
        this.field5024 = (class613) arg0;
        this.method2256(arg0);
    }

    @OriginalMember(owner = "client!da", name = "u", descriptor = "()Z", line = 353)
    public final boolean method382() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[[I[[IIII)Ld;", line = 358)
    public final class88 method413(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class286(this, this.field5024, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lkn;Lkn;FLkn;)Lkn;", line = 361)
    public final class307 method188(class307 arg0, class307 arg1, float arg2, class307 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)I", line = 366)
    public final int method377(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V", line = 372)
    public final void method224(int arg0) {
        class29.method242((byte) -85);
        this.method2253(arg0);
        for (class613 var2 = (class613) this.field5026.method2090(true); var2 != null; var2 = (class613) this.field5026.method2088(-152)) {
            var2.method3326();
        }
    }

    @OriginalMember(owner = "client!da", name = "l", descriptor = "()V", line = 385)
    public final void method179() {
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lba;Lqu;Lq;Lht;I)V", line = 388)
    public final void method365(class107 arg0, class282 arg1, class151 arg2, class108 arg3, int arg4) {
        this.method2266(arg1, true);
        if (arg3 == null) {
            this.method2251().method3289(this, arg0, arg2, (int[]) null, arg4, field5029, field5036, field5034, field5037, field5028, arg1.field3673.method3183((byte) -94), field5030);
        } else {
            field5035[5] = 0;
            this.method2251().method3289(this, arg0, arg2, field5035, arg4, field5029, field5036, field5034, field5037, field5028, arg1.field3673.method3183((byte) -95), field5030);
            arg3.field1405 = field5035[0];
            arg3.field1406 = field5035[1];
            arg3.field1407 = field5035[2];
            arg3.field1403 = field5035[3];
            arg3.field1402 = field5035[4];
            arg3.field1404 = field5035[5] != 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(IIIIII)V", line = 408)
    public final void method388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method347(arg0, arg1, arg2, arg4, arg5);
        this.method347(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method378(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method378(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIII)Lxa;", line = 415)
    public final class511 method381(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class74(this, this.field5024, arg0, arg1, arg2, arg3, arg4) : new class599(this, this.field5024, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class74(this, this.field5024, arg0, arg1, arg2, arg3, arg4) : new class599(this, this.field5024, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!da", name = "qa", descriptor = "(S)Z", line = 450)
    private final boolean method2260(short arg0) {
        synchronized (this) {
            class59 var3 = super.field598.method3162((byte) -104, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method2258(arg0, var3.field798, var3.field811, var3.field800, var3.field799, var3.field810, var3.field807, var3.field806, var3.field805, var3.field804, var3.field797, var3.field809, var3.field808);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "x", descriptor = "()Z", line = 463)
    public final boolean method386() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "o", descriptor = "()V", line = 468)
    public final void method225() {
        if (!this.field5027) {
            this.field5044 = null;
            this.field5040 = null;
            this.field5024 = null;
            this.field5043 = null;
            this.field5042.method41(62);
            for (class613 var1 = (class613) this.field5026.method2090(true); var1 != null; var1 = (class613) this.field5026.method2088(-152)) {
                var1.method3325();
            }
            this.field5026.method2085((byte) 9);
            this.method2263();
            if (this.field5046) {
                class260.method1621(false, true, false);
                this.field5046 = false;
            }
            this.method2262();
            class29.method240(43);
            this.field5027 = true;
        }
    }

    @OriginalMember(owner = "client!da", name = "HA", descriptor = "()Ljava/lang/Object;", line = 499)
    private final Object method2261() {
        return new class591(this);
    }

    @OriginalMember(owner = "client!da", name = "j", descriptor = "()Lq;", line = 502)
    public final class151 method346() {
        return new class321();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 507)
    public final void method336(Canvas arg0) {
        class146 var2 = (class146) this.field5042.method39((long) arg0.hashCode(), 31750);
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class146 var5 = new class146(this, arg0);
            this.field5042.method38(var5, 94, (long) arg0.hashCode());
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIII)V", line = 526)
    public final void method352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()Z", line = 533)
    public final boolean method327() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "r", descriptor = "()Z", line = 536)
    public final boolean method380() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(IIIIII)Lkn;", line = 539)
    public final class307 method383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!da", name = "s", descriptor = "()V", line = 542)
    private final void method2262() {
        System.gc();
        System.runFinalization();
        class29.method242((byte) -84);
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)Li;", line = 549)
    public final class686 method369(int arg0) {
        class613 var2 = new class613(this, arg0);
        this.field5026.method2087(var2, 103);
        return var2;
    }

    @OriginalMember(owner = "client!da", name = "q", descriptor = "()Z", line = 556)
    public final boolean method379() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lqu;)V", line = 559)
    public final void method326(class282 arg0) {
        this.method2266(arg0, false);
        this.method2251().method3295(this, field5029, field5036, field5034, field5037, arg0.field3673.method3183((byte) 122));
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()Log;", line = 563)
    public final class463 method189() {
        return new class463(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V", line = 566)
    public final void method332(boolean arg0) {
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;)V", line = 570)
    public class396(Canvas arg0, class702 arg1) {
        super(arg1);
        try {
            if (!client.method709("sw3d", (byte) -127)) {
                throw new RuntimeException("");
            } else {
                class29.method239(11302);
                this.method2254(super.field598, 0, 0);
                class315.method1837(-1753516255, true, false);
                this.field5046 = true;
                this.field5043 = new class321();
                this.method342(new class321());
                this.method359(1);
                this.method373(0);
                if (arg0 != null) {
                    this.method336(arg0);
                    this.method374(arg0);
                }
            }
        } catch (Throwable var3) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I)Lfa;", line = 598)
    public final class619 method363(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class257(this, this.field5024, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!da", name = "z", descriptor = "()Z", line = 601)
    public final boolean method389() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "()Z", line = 604)
    public final boolean method334() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;)V", line = 610)
    public final void method342(class151 arg0) {
        this.field5039 = arg0;
        this.method2259(arg0);
    }

    @OriginalMember(owner = "client!da", name = "p", descriptor = "()Z", line = 618)
    public final boolean method231() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "A", descriptor = "()V", line = 623)
    public final void method205() {
    }

    @OriginalMember(owner = "client!da", name = "B", descriptor = "()Lq;", line = 626)
    public final class151 method402() {
        return this.field5043;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILfa;II)V", line = 629)
    public final void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class619 arg6, int arg7, int arg8) {
        this.method2250(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lqu;Z)V", line = 634)
    private final void method2266(class282 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class66 var8 = (class66) arg0.field3673.method3179(true); var8 != null; var8 = (class66) arg0.field3673.method3181(0)) {
            field5029[var3++] = var8.field899;
            field5029[var3++] = var8.field894;
            field5029[var3++] = var8.field895;
            field5036[var4++] = var8.field902;
            field5037[var6++] = (short) var8.field905;
            field5034[var5++] = var8.field903;
            if (arg1) {
                field5028[var7++] = var8.field896;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lsga;[Law;Z)Lta;", line = 678)
    public final class597 method405(class547 arg0, class506[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field6651;
            var5[var7] = arg1[var7].field6650;
            if (arg1[var7].field6649 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class177(this, this.field5024, arg0, arg1, (class511[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class598(this, this.field5024, arg0, arg1, (class511[]) null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIZ)Lxa;", line = 720)
    public final class511 method341(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class74(this, this.field5024, arg0, arg1, arg2, arg3) : new class599(this, this.field5024, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!da", name = "D", descriptor = "()V", line = 726)
    public final void method208() {
    }

    @OriginalMember(owner = "client!da", name = "w", descriptor = "()I", line = 731)
    public final int method384() {
        return 4;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)V", line = 738)
    public final void method391(boolean arg0) {
    }

    @OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V", line = 741)
    protected final synchronized void finalize() {
        this.method392((byte) -39);
        if (this.nativeid != 0L) {
            class29.method241(-127, this);
        }
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "(I)V", line = 747)
    public final void method398(int arg0) {
        this.field5044[arg0].method3285();
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V", line = 750)
    public final void method359(int arg0) {
        this.field5045 = arg0;
        this.field5044 = new class606[this.field5045];
        for (int var2 = 0; var2 < this.field5045; ++var2) {
            this.field5044[var2] = new class606(this, this.field5041, this.field5038);
        }
    }

    @OriginalMember(owner = "client!da", name = "t", descriptor = "()Z", line = 763)
    public final boolean method211() {
        return false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lxa;Z)V", line = 803)
    public final void method234(class511 arg0, boolean arg1) {
        if (arg0 instanceof class599) {
            this.method2267((class599) arg0);
        } else if (arg0 instanceof class74) {
            this.method2257((class74) arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!da", name = "ra", descriptor = "(IIIIIILfa;II)V")
    private final native void method2250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class619 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!da", name = "C", descriptor = "(IIIIII)V")
    public final native void method353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!da", name = "AA", descriptor = "(IIII)V")
    public final native void method394(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I[I[F)V")
    private final native void method2252(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "(IIII)V")
    public final native void method339(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    private final native void method2253(int arg0);

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(IIIII)V")
    public final native void method411(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "ca", descriptor = "(IIII)V")
    public final native void method376(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "IA", descriptor = "()I")
    public final native int method361();

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(IIIII)V")
    public final native void method347(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "v", descriptor = "()I")
    public final native int method399();

    @OriginalMember(owner = "client!da", name = "FA", descriptor = "(IIIIII)Z")
    public final native boolean method328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!da", name = "PA", descriptor = "(Le;II)V")
    private final native void method2254(class702 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "ya", descriptor = "(IIIII)V")
    public final native void method378(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Li;)V")
    private final native void method2256(class686 arg0);

    @OriginalMember(owner = "client!da", name = "N", descriptor = "(Laa;)V")
    private final native void method2257(class74 arg0);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method2258(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!da", name = "D", descriptor = "(I)V")
    public final native void method162(int arg0);

    @OriginalMember(owner = "client!da", name = "sa", descriptor = "(II)V")
    public final native void method335(int arg0, int arg1);

    @OriginalMember(owner = "client!da", name = "o", descriptor = "(Lq;)V")
    private final native void method2259(class151 arg0);

    @OriginalMember(owner = "client!da", name = "X", descriptor = "(III)V")
    public final native void method404(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "ka", descriptor = "(FF)V")
    public final native void method371(float arg0, float arg1);

    @OriginalMember(owner = "client!da", name = "na", descriptor = "(III[I)V")
    public final native void method350(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!da", name = "ha", descriptor = "(F)V")
    public final native void method360(float arg0);

    @OriginalMember(owner = "client!da", name = "A", descriptor = "([I)V")
    public final native void method356(int[] arg0);

    @OriginalMember(owner = "client!da", name = "YA", descriptor = "(IFFFFF)V")
    public final native void method390(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "()V")
    private final native void method2263();

    @OriginalMember(owner = "client!da", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method2264(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!da", name = "H", descriptor = "(Z)V")
    public final native void method599(boolean arg0);

    @OriginalMember(owner = "client!da", name = "m", descriptor = "(IIII)V")
    public final native void method393(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "BA", descriptor = "(IIIIII)V")
    private final native void method2265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!da", name = "k", descriptor = "()V")
    public final native void method351();

    @OriginalMember(owner = "client!da", name = "SA", descriptor = "()I")
    public final native int method168();

    @OriginalMember(owner = "client!da", name = "U", descriptor = "()I")
    public final native int method343();

    @OriginalMember(owner = "client!da", name = "ma", descriptor = "(IIIIII[BII)V")
    public final native void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!da", name = "TA", descriptor = "(Lja;)V")
    private final native void method2267(class599 arg0);

    @OriginalMember(owner = "client!da", name = "P", descriptor = "(Lv;)V")
    private final native void method2268(class146 arg0);

    @OriginalMember(owner = "client!da", name = "KA", descriptor = "(IIII)[I")
    public final native int[] method157(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "aa", descriptor = "()I")
    public final native int method401();

    @OriginalMember(owner = "client!da", name = "F", descriptor = "()V")
    public final native void method396();

    @OriginalMember(owner = "client!da", name = "LA", descriptor = "(IIII)V")
    public final native void method358(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "JA", descriptor = "(I)V")
    public final native void method330(int arg0);

    @OriginalMember(owner = "client!da", name = "L", descriptor = "(ILfa;II)V")
    public final native void method357(int arg0, class619 arg1, int arg2, int arg3);
}
