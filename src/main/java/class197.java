import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class197 extends class287 implements class350 {

    @OriginalMember(owner = "client!w", name = "u", descriptor = "Z")
    private boolean field2530 = false;

    @OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "Lsr;")
    private class167 field2531 = new class167();

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    private int field2535 = 4096;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    private int field2547 = 4096;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "Lqh;")
    private class50 field2544 = new class50(4);

    @OriginalMember(owner = "client!w", name = "N", descriptor = "Z")
    private boolean field2549 = false;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "Lc;")
    private class124 field2537;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "[I")
    private static int[] field2532 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!w", name = "y", descriptor = "[B")
    private static byte[] field2534 = new byte[8191];

    @OriginalMember(owner = "client!w", name = "E", descriptor = "[I")
    private static int[] field2540 = field2532;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "[I")
    private static int[] field2541 = new int[8191];

    @OriginalMember(owner = "client!w", name = "H", descriptor = "[I")
    private static int[] field2543 = new int[8191];

    @OriginalMember(owner = "client!w", name = "C", descriptor = "[I")
    private static int[] field2538 = field2532;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "[F")
    private static float[] field2536 = new float[20];

    @OriginalMember(owner = "client!w", name = "D", descriptor = "[S")
    private static short[] field2539 = new short[8191];

    @OriginalMember(owner = "client!w", name = "K", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field2546 = Boolean.FALSE;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "[F")
    private static float[] field2545 = field2536;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "[I")
    public static int[] field2548 = new int[6];

    @OriginalMember(owner = "client!w", name = "G", descriptor = "[I")
    public static int[] field2542 = field2532;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "I")
    private int field2551;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Lg;")
    private class108 field2529;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "Lb;")
    private class221 field2533;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "[Lk;")
    private class399[] field2550;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "()Lc;", line = 3)
    public final class124 method1125() {
        return new class165();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIILta;II)V", line = 6)
    public final void method1126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class144 arg6, int arg7, int arg8) {
        this.method1150(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Leu;Z)V", line = 10)
    private final void method1127(class336 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class94 var8 = (class94) arg0.field4453.method2512(-5114); var8 != null; var8 = (class94) arg0.field4453.method2514((byte) -39)) {
            field2540[var3++] = var8.field1130;
            field2540[var3++] = var8.field1135;
            field2540[var3++] = var8.field1122;
            field2543[var4++] = var8.field1133;
            field2539[var6++] = (short) var8.field1124;
            field2541[var5++] = var8.field1129;
            if (arg1) {
                field2534[var7++] = var8.field1126;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "i", descriptor = "()Z", line = 41)
    public final boolean method1129() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Leu;)V", line = 47)
    public final void method1131(class336 arg0) {
        this.method1127(arg0, false);
        this.method1148().method2471(this, field2540, field2543, field2541, field2539, arg0.field4453.method2516(true));
    }

    @OriginalMember(owner = "client!w", name = "A", descriptor = "()Z", line = 51)
    public final boolean method1132() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "z", descriptor = "()Z", line = 57)
    public final boolean method1135() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "qa", descriptor = "()Ljava/lang/Object;", line = 65)
    private final Object method1138() {
        return new class251(this);
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "()Z", line = 74)
    public final boolean method1142() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V", line = 79)
    public final void method1143(int arg0) {
        class269.method1637((byte) -101);
        this.method1186(arg0);
        for (class108 var2 = (class108) this.field2531.method970(12); var2 != null; var2 = (class108) this.field2531.method976((byte) -125)) {
            var2.method671();
        }
    }

    @OriginalMember(owner = "client!w", name = "q", descriptor = "()Z", line = 93)
    public final boolean method1144() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I[Lbn;)V", line = 100)
    public final void method1146(int arg0, class309[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field2538[var3++] = arg1[var4].method1840((byte) 82);
            field2538[var3++] = arg1[var4].method1841(0);
            field2538[var3++] = arg1[var4].method1842((byte) 124);
            field2538[var3++] = arg1[var4].method1845((byte) -98);
            field2545[var4] = arg1[var4].method1849(117);
            field2538[var3++] = arg1[var4].method1847(8);
        }
        this.method1219(arg0, field2538, field2545);
    }

    @OriginalMember(owner = "client!w", name = "k", descriptor = "()V", line = 117)
    public final void method1147() {
    }

    @OriginalMember(owner = "client!w", name = "C", descriptor = "()Lk;", line = 122)
    public final class399 method1148() {
        for (int var1 = 0; var1 < this.field2551; ++var1) {
            if (this.field2550[var1].field5797 == Thread.currentThread()) {
                return this.field2550[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!w", name = "o", descriptor = "()Z", line = 134)
    public final boolean method1149() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 141)
    public final void method1152(Rectangle[] arg0, int arg1) {
        if (this.field2533 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field2533.method1394(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()Z", line = 152)
    public final boolean method1154() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Le;Leu;Lc;[Lut;I)V", line = 156)
    public final void method1156(class373[] arg0, class336 arg1, class124 arg2, class82[] arg3, int arg4) {
        this.method1127(arg1, true);
        if (arg3 == null) {
            this.method1148().method2472(this, arg0, arg2, (int[]) null, arg4, field2540, field2543, field2541, field2539, field2534, arg1.field4453.method2516(true), field2542);
        } else {
            class82 var6 = arg3[0];
            field2548[5] = 0;
            this.method1148().method2472(this, arg0, arg2, field2548, arg4, field2540, field2543, field2541, field2539, field2534, arg1.field4453.method2516(true), field2542);
            var6.field996 = field2548[0];
            var6.field995 = field2548[1];
            var6.field992 = field2548[2];
            var6.field997 = field2548[3];
            var6.field993 = field2548[4];
            var6.field994 = field2548[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class348 var9 = (class348) arg0[var8];
                var9.method2033(var7, arg2);
                if (var9.field4637 != null) {
                    var7 += var9.field4637.length * 9;
                }
                if (var9.field4636 != null) {
                    var7 += var9.field4636.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(IIIIII)V", line = 198)
    public final void method1157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1128(arg0, arg1, arg2, arg4, arg5);
        this.method1128(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1185(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method1185(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!w", name = "l", descriptor = "()V", line = 203)
    public final void method1158() {
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lob;)V", line = 205)
    public final void method1159(class521 arg0) {
    }

    @OriginalMember(owner = "client!w", name = "m", descriptor = "(S)Z", line = 208)
    private final boolean method1160(short arg0) {
        class16 var2 = super.field3772;
        synchronized (super.field3772) {
            if (!super.field3772.method91(arg0, -1221)) {
                return false;
            } else {
                class433 var4 = super.field3772.method94(arg0, (byte) -72);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field6305 && var4.field6311) {
                        var6 = super.field3772.method90(0.7F, true, false, arg0, 128, 128);
                    } else {
                        var6 = super.field3772.method92(2384, 128, 128, arg0, 0.7F, true);
                    }
                    this.method1192(arg0, var4.field6317, var4.field6303, var4.field6311, var4.field6305, var4.field6310, var4.field6315, var4.field6313, var4.field6320, var4.field6309, var4.field6306, var4.field6322, var4.field6316, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 232)
    public final void method1161(Canvas arg0) {
        if (arg0 != null) {
            class221 var2 = (class221) this.field2544.method295((long) arg0.hashCode(), -125);
            this.field2533 = var2;
            this.method1178(var2);
        } else {
            this.field2533 = null;
            this.method1178((class221) null);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lob;Lob;FLob;)Lob;", line = 247)
    public final class521 method1162(class521 arg0, class521 arg1, float arg2, class521 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!w", name = "R", descriptor = "()V", line = 251)
    private final void method1164() {
        System.gc();
        System.runFinalization();
        class269.method1637((byte) 120);
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(Z)V", line = 256)
    public final void method1166(boolean arg0) {
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "()Z", line = 261)
    public final boolean method1168() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Le;Lc;[Lut;I)V", line = 268)
    public final void method1170(class373[] arg0, class124 arg1, class82[] arg2, int arg3) {
        if (arg2 == null) {
            this.method1148().method2467(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class82 var5 = arg2[0];
            field2548[5] = 0;
            this.method1148().method2467(this, arg0, arg1, field2548, -1, arg3);
            var5.field996 = field2548[0];
            var5.field995 = field2548[1];
            var5.field992 = field2548[2];
            var5.field997 = field2548[3];
            var5.field993 = field2548[4];
            var5.field994 = field2548[5] != 0;
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V", line = 287)
    public final void method1171(int arg0) {
        this.field2550[arg0].method2461();
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(ILjava/awt/Canvas;Ll;Lfq;)V", line = 292)
    public class197(int arg0, Canvas arg1, class16 arg2, class137 arg3) {
        super(arg0, arg2);
        try {
            if (!field2546) {
                if (arg3 != null) {
                    arg3.method844(this.getClass(), -5);
                    field2546 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("sw3d");
                    field2546 = Boolean.TRUE;
                }
            }
            if (!field2546) {
                throw new RuntimeException("");
            } else {
                this.method1194(super.field3772, 0, 0);
                class66.method388(false, true, 0);
                this.field2549 = true;
                this.field2537 = new class165();
                this.method1227(new class165());
                this.method1173(1);
                this.method1187(0);
                if (arg1 != null) {
                    this.method1217(arg1);
                    this.method1161(arg1);
                }
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V", line = 333)
    public final void method1173(int arg0) {
        this.field2551 = arg0;
        this.field2550 = new class399[this.field2551];
        for (int var2 = 0; var2 < this.field2551; ++var2) {
            this.field2550[var2] = new class399(this, this.field2547, this.field2535);
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V", line = 346)
    public final void method1175(boolean arg0) {
    }

    @OriginalMember(owner = "client!w", name = "B", descriptor = "()I", line = 349)
    public final int method1176() {
        return 4;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(FFF)V", line = 351)
    public final void method1177(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!w", name = "w", descriptor = "()V", line = 356)
    public final void method1179() {
        if (!this.field2530) {
            this.method1164();
            this.field2550 = null;
            this.field2533 = null;
            this.field2529 = null;
            this.field2537 = null;
            this.field2544.method293((byte) -116);
            for (class108 var1 = (class108) this.field2531.method970(12); var1 != null; var1 = (class108) this.field2531.method976((byte) 3)) {
                var1.method672();
            }
            this.field2531.method984(false);
            this.method1224();
            if (this.field2549) {
                class392.method2366(false, (byte) -100, true);
                this.field2549 = false;
            }
            this.field2530 = true;
        }
    }

    @OriginalMember(owner = "client!w", name = "g", descriptor = "()Lc;", line = 389)
    public final class124 method1183() {
        return this.field2537;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V", line = 391)
    public final void method1184(boolean arg0) {
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 397)
    public final void method1187(int arg0) {
        this.field2550[arg0].method2469();
    }

    @OriginalMember(owner = "client!w", name = "x", descriptor = "()V", line = 399)
    public final void method1188() {
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(IIII)V", line = 402)
    public final void method1189(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!w", name = "h", descriptor = "()Z", line = 405)
    public final boolean method1190() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I", line = 409)
    public final int method1191(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!w", name = "t", descriptor = "()Z", line = 419)
    public final boolean method1193() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 425)
    public final void method1195(Canvas arg0) {
        class221 var2 = (class221) this.field2544.method295((long) arg0.hashCode(), -97);
        Dimension var3 = arg0.getSize();
        var2.method1388(arg0, var3.width, var3.height);
        if (arg0 != null && this.field2533.field2975 == arg0) {
            this.method1161(arg0);
        }
    }

    @OriginalMember(owner = "client!w", name = "y", descriptor = "()V", line = 434)
    public final void method1196() {
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIII)V", line = 438)
    public final void method1197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1148().method2468(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!w", name = "u", descriptor = "()V", line = 440)
    public final void method1198() {
    }

    @OriginalMember(owner = "client!w", name = "s", descriptor = "()Z", line = 443)
    public final boolean method1199() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lgf;[Lev;Z)Lla;", line = 447)
    public final class316 method1201(class183 arg0, class491[] arg1, boolean arg2) {
        return arg2 ? new class72(this, this.field2529, arg0, arg1, (class24[]) null) : new class278(this, this.field2529, arg0, arg1, (class24[]) null);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()Z", line = 454)
    public final boolean method1202() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Le;Leu;Lc;Lut;I)V", line = 457)
    public final void method1203(class373 arg0, class336 arg1, class124 arg2, class82 arg3, int arg4) {
        this.method1127(arg1, true);
        if (arg3 == null) {
            this.method1148().method2466(this, arg0, arg2, (int[]) null, arg4, field2540, field2543, field2541, field2539, field2534, arg1.field4453.method2516(true), field2542);
        } else {
            field2548[5] = 0;
            this.method1148().method2466(this, arg0, arg2, field2548, arg4, field2540, field2543, field2541, field2539, field2534, arg1.field4453.method2516(true), field2542);
            arg3.field996 = field2548[0];
            arg3.field995 = field2548[1];
            arg3.field992 = field2548[2];
            arg3.field997 = field2548[3];
            arg3.field993 = field2548[4];
            arg3.field994 = field2548[5] != 0;
        }
        class348 var6 = (class348) arg0;
        var6.method2033(0, arg2);
    }

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V", line = 477)
    protected final synchronized void finalize() {
        this.method1724(1);
        if (this.nativeid != 0L) {
            class269.method1636(this, true);
        }
    }

    @OriginalMember(owner = "client!w", name = "g", descriptor = "(I)Ln;", line = 484)
    public final class15 method1204(int arg0) {
        class108 var2 = new class108(this, arg0);
        this.field2531.method975(0, var2);
        return var2;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 490)
    public final void method1205(Canvas arg0) {
        if (this.field2533.field2975 == arg0) {
            this.method1161((Canvas) null);
        }
        class221 var2 = (class221) this.field2544.method295((long) arg0.hashCode(), -103);
        if (var2 != null) {
            var2.method2674(true);
            var2.method1390();
        }
    }

    @OriginalMember(owner = "client!w", name = "v", descriptor = "()V", line = 505)
    public final void method1208() {
        if (this.field2533 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field2533.method1389();
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II)I", line = 517)
    public final int method1211(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIII)V", line = 520)
    public final void method1212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lpq;IIII)Le;", line = 526)
    public final class373 method1213(class131 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class348(this, this.field2529, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II[[I[[IIII)Lya;", line = 529)
    public final class38 method1214(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class158(this, this.field2529, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II[I[I)Lta;", line = 532)
    public final class144 method1215(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class345(this, this.field2529, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(IIIIZ)Lo;", line = 535)
    public final class24 method1216(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class411(this, this.field2529, arg0, arg1, arg2, arg3) : new class201(this, this.field2529, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 543)
    public final void method1217(Canvas arg0) {
        class221 var2 = (class221) this.field2544.method295((long) arg0.hashCode(), -114);
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class221 var5 = new class221(this, arg0);
            this.field2544.method291((long) arg0.hashCode(), var5, -101);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([IIIII)Lo;", line = 563)
    public final class24 method1218(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class411(this, this.field2529, arg0, arg1, arg2, arg3, arg4) : new class201(this, this.field2529, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class411(this, this.field2529, arg0, arg1, arg2, arg3, arg4) : new class201(this, this.field2529, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ln;)V", line = 608)
    public final void method1225(class15 arg0) {
        this.field2529 = (class108) arg0;
        this.method1222(arg0);
    }

    @OriginalMember(owner = "client!w", name = "X", descriptor = "(S)Z", line = 612)
    private final boolean method1226(short arg0) {
        synchronized (this) {
            class433 var3 = super.field3772.method94(arg0, (byte) -72);
            if (var3 == null) {
                return false;
            } else {
                this.method1133(arg0, var3.field6317, var3.field6303, var3.field6311, var3.field6305, var3.field6310, var3.field6315, var3.field6313, var3.field6320, var3.field6309, var3.field6306, var3.field6322, var3.field6316);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(IIIIII)V", line = 624)
    public final void method1228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1174(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!w", name = "j", descriptor = "()Z", line = 627)
    public final boolean method1229() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(IIIIII)Lob;", line = 630)
    public final class521 method1230(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIF)Lbn;", line = 633)
    public final class309 method1231(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class60(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V", line = 646)
    public final void method1233(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "()Z", line = 655)
    public final boolean method1235() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lev;Z)Lo;", line = 660)
    public final class24 method1236(class491 arg0, boolean arg1) {
        int[] var3 = arg0.field7197;
        byte[] var4 = arg0.field7192;
        int var5 = arg0.field7196;
        int var6 = arg0.field7191;
        class24 var7;
        if (arg1 && arg0.field7198 == null) {
            var7 = new class296(this, this.field2529, var3, var4, 0, arg0.field7196, arg0.field7196, arg0.field7191);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field7198;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class411(this, this.field2529, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field7197[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class411(this, this.field2529, var9, 0, arg0.field7196, arg0.field7196, arg0.field7191);
                } else {
                    var7 = new class201(this, this.field2529, var9, 0, arg0.field7196, arg0.field7196, arg0.field7191);
                }
            }
        }
        var7.method147(arg0.field7195, arg0.field7199, arg0.field7193, arg0.field7194);
        return var7;
    }

    @OriginalMember(owner = "client!w", name = "m", descriptor = "()Z", line = 756)
    public final boolean method1237() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "ma", descriptor = "(IIIII)V")
    public final native void method1128(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "ya", descriptor = "(I)V")
    public final native void method1130(int arg0);

    @OriginalMember(owner = "client!w", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method1133(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!w", name = "HA", descriptor = "(IIII)V")
    public final native void method1134(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "ZA", descriptor = "(IIIII)V")
    public final native void method1136(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)V")
    public final native void method1137(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "JA", descriptor = "(F)V")
    public final native void method1139(float arg0);

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(FF)V")
    public final native void method1140(float arg0, float arg1);

    @OriginalMember(owner = "client!w", name = "r", descriptor = "()I")
    public final native int method1141();

    @OriginalMember(owner = "client!w", name = "t", descriptor = "(I)V")
    public final native void method1145(int arg0);

    @OriginalMember(owner = "client!w", name = "NA", descriptor = "(IIIIIILta;II)V")
    private final native void method1150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class144 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!w", name = "sa", descriptor = "(IIII)[I")
    public final native int[] method1151(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "P", descriptor = "(IIIIII)V")
    public final native void method1153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!w", name = "aa", descriptor = "()F")
    public final native float method1155();

    @OriginalMember(owner = "client!w", name = "MA", descriptor = "([I)V")
    public final native void method1163(int[] arg0);

    @OriginalMember(owner = "client!w", name = "pa", descriptor = "()I")
    public final native int method1165();

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "(III)V")
    public final native void method1167(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!w", name = "OA", descriptor = "()I")
    public final native int method1169();

    @OriginalMember(owner = "client!w", name = "K", descriptor = "(IIIIII[BII)V")
    public final native void method1172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!w", name = "A", descriptor = "(IIIIII)V")
    private final native void method1174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(Lb;)V")
    private final native void method1178(class221 arg0);

    @OriginalMember(owner = "client!w", name = "s", descriptor = "(IIII)V")
    public final native void method1180(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "B", descriptor = "(IFFFFF)V")
    public final native void method1181(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!w", name = "ba", descriptor = "(IIII)V")
    public final native void method1182(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "IA", descriptor = "(IIIII)V")
    public final native void method1185(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "u", descriptor = "(I)V")
    private final native void method1186(int arg0);

    @OriginalMember(owner = "client!w", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method1192(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!w", name = "W", descriptor = "(Ll;II)V")
    private final native void method1194(class16 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!w", name = "p", descriptor = "()V")
    public final native void method426();

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(II)V")
    public final native void method1200(int arg0, int arg1);

    @OriginalMember(owner = "client!w", name = "va", descriptor = "()V")
    public final native void method1206();

    @OriginalMember(owner = "client!w", name = "v", descriptor = "(III[I)V")
    public final native void method1207(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!w", name = "VA", descriptor = "(IIIIII)Z")
    public final native boolean method1209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!w", name = "Y", descriptor = "()I")
    public final native int method1210();

    @OriginalMember(owner = "client!w", name = "WA", descriptor = "(I[I[F)V")
    private final native void method1219(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!w", name = "ra", descriptor = "(ILta;II)V")
    public final native void method1220(int arg0, class144 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "GA", descriptor = "(IIII)V")
    public final native void method1221(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "QA", descriptor = "(Ln;)V")
    private final native void method1222(class15 arg0);

    @OriginalMember(owner = "client!w", name = "T", descriptor = "()F")
    public final native float method1223();

    @OriginalMember(owner = "client!w", name = "ua", descriptor = "()V")
    private final native void method1224();

    @OriginalMember(owner = "client!w", name = "SA", descriptor = "(Lc;)V")
    public final native void method1227(class124 arg0);

    @OriginalMember(owner = "client!w", name = "n", descriptor = "()V")
    public final native void method1232();

    @OriginalMember(owner = "client!w", name = "AA", descriptor = "()I")
    public final native int method1234();
}
