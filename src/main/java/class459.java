import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class459 extends class497 implements class400 {

    @OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "Z")
    private boolean field7072 = false;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "Lnj;")
    private class317 field7063 = new class317();

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    private int field7078 = 4096;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    private int field7076 = 4096;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "Lru;")
    private class177 field7080 = new class177(4);

    @OriginalMember(owner = "client!w", name = "J", descriptor = "Z")
    private boolean field7081 = false;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "Lc;")
    private class205 field7077;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "[I")
    private static int[] field7061 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!w", name = "s", descriptor = "[I")
    private static int[] field7064 = field7061;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "[S")
    private static short[] field7065 = new short[8191];

    @OriginalMember(owner = "client!w", name = "w", descriptor = "[I")
    public static int[] field7068 = new int[6];

    @OriginalMember(owner = "client!w", name = "x", descriptor = "[B")
    private static byte[] field7069 = new byte[8191];

    @OriginalMember(owner = "client!w", name = "u", descriptor = "[I")
    public static int[] field7066 = field7061;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "[F")
    private static float[] field7071 = new float[20];

    @OriginalMember(owner = "client!w", name = "y", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field7070 = Boolean.FALSE;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "[I")
    private static int[] field7074 = new int[8191];

    @OriginalMember(owner = "client!w", name = "D", descriptor = "[I")
    private static int[] field7075 = field7061;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "[F")
    private static float[] field7067 = field7071;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "[I")
    private static int[] field7073 = new int[8191];

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    private int field7082;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "Lb;")
    private class133 field7079;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "Lg;")
    private class97 field7062;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "[Lk;")
    private class28[] field7083;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)V")
    public final native void method1321(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "m", descriptor = "(S)Z")
    private final boolean method2873(short arg0) {
        class199 var2 = super.field7480;
        synchronized (super.field7480) {
            if (!super.field7480.method1364((byte) 53, arg0)) {
                return false;
            } else {
                class476 var4 = super.field7480.method1366(arg0, (byte) 126);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field7269 && var4.field7289) {
                        var6 = super.field7480.method1367(true, 0.7F, arg0, 128, -25218, 128);
                    } else {
                        var6 = super.field7480.method1368(0.7F, 128, true, false, arg0, 128);
                    }
                    this.method2879(arg0, var4.field7284, var4.field7273, var4.field7289, var4.field7269, var4.field7280, var4.field7272, var4.field7279, var4.field7282, var4.field7281, var4.field7275, var4.field7268, var4.field7283, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(IIIIII)V")
    public final void method1284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1332(arg0, arg1, arg2, arg4, arg5);
        this.method1332(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1261(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method1261(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(FF)V")
    public final native void method1309(float arg0, float arg1);

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
    public final void method1265(int arg0) {
        this.field7083[arg0].method186();
    }

    @OriginalMember(owner = "client!w", name = "sa", descriptor = "(IIII)[I")
    public final native int[] method1251(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "z", descriptor = "()Z")
    public final boolean method1312() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(ILjava/awt/Canvas;Ll;Lpb;)V")
    public class459(int arg0, Canvas arg1, class199 arg2, class2 arg3) {
        super(arg0, arg2);
        try {
            if (!field7070) {
                if (arg3 != null) {
                    arg3.method9(this.getClass(), -115);
                    field7070 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("sw3d");
                    field7070 = Boolean.TRUE;
                }
            }
            if (!field7070) {
                throw new RuntimeException("");
            } else {
                this.method2888(super.field7480, 0, 0);
                class279.method1873(25503, true, false);
                this.field7081 = true;
                this.field7077 = new class507();
                this.method1314(new class507());
                this.method1274(1);
                this.method1265(0);
                if (arg1 != null) {
                    this.method1282(arg1);
                    this.method1230(arg1);
                }
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(IIIIII)Lmt;")
    public final class321 method1300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II)I")
    public final int method1299(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1308(Canvas arg0) {
        if (this.field7079.field1802 == arg0) {
            this.method1230((Canvas) null);
        }
        class133 var2 = (class133) this.field7080.method1122((byte) 59, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method3149(71);
            var2.method823();
        }
    }

    @OriginalMember(owner = "client!w", name = "WA", descriptor = "(I[I[F)V")
    private final native void method2874(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!w", name = "P", descriptor = "(IIIIII)V")
    public final native void method1260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!w", name = "A", descriptor = "(IIIIII)V")
    private final native void method2875(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)Ln;")
    public final class517 method1285(int arg0) {
        class97 var2 = new class97(this, arg0);
        this.field7063.method2124(var2, (byte) 103);
        return var2;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Le;Lc;[Lkk;I)V")
    public final void method1289(class536[] arg0, class205 arg1, class182[] arg2, int arg3) {
        if (arg2 == null) {
            this.method2886().method181(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class182 var5 = arg2[0];
            field7068[5] = 0;
            this.method2886().method181(this, arg0, arg1, field7068, -1, arg3);
            var5.field2644 = field7068[0];
            var5.field2640 = field7068[1];
            var5.field2642 = field7068[2];
            var5.field2645 = field7068[3];
            var5.field2641 = field7068[4];
            var5.field2643 = field7068[5] != 0;
        }
    }

    @OriginalMember(owner = "client!w", name = "y", descriptor = "()Lc;")
    public final class205 method1254() {
        return new class507();
    }

    @OriginalMember(owner = "client!w", name = "B", descriptor = "()Z")
    public final boolean method1233() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lfc;IIII)Le;")
    public final class536 method1337(class438 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class395(this, this.field7062, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([IIIII)Lo;")
    public final class139 method1232(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class110(this, this.field7062, arg0, arg1, arg2, arg3, arg4) : new class90(this, this.field7062, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class110(this, this.field7062, arg0, arg1, arg2, arg3, arg4) : new class90(this, this.field7062, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1282(Canvas arg0) {
        class133 var2 = (class133) this.field7080.method1122((byte) 59, (long) arg0.hashCode());
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class133 var5 = new class133(this, arg0);
            this.field7080.method1127(var5, (byte) 59, (long) arg0.hashCode());
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(IIII)V")
    public final void method1281(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!w", name = "GA", descriptor = "(IIII)V")
    public final native void method1277(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ldm;)V")
    public final void method1306(class519 arg0) {
        this.method2882(arg0, false);
        this.method2886().method180(this, field7075, field7073, field7074, field7065, arg0.field7690.method2506((byte) -34));
    }

    @OriginalMember(owner = "client!w", name = "s", descriptor = "()I")
    public final int method1324() {
        return 4;
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(II)V")
    public final native void method1257(int arg0, int arg1);

    @OriginalMember(owner = "client!w", name = "pa", descriptor = "()I")
    public final native int method1258();

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII)V")
    public final void method1262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2875(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!w", name = "g", descriptor = "()Z")
    public final boolean method1241() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "IA", descriptor = "(IIIII)V")
    public final native void method1261(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "h", descriptor = "()Z")
    public final boolean method1239() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lmt;)V")
    public final void method1252(class321 arg0) {
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(Z)V")
    public final void method1240(boolean arg0) {
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V")
    public final void method1250(boolean arg0) {
    }

    @OriginalMember(owner = "client!w", name = "Y", descriptor = "()I")
    public final native int method1276();

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(FFF)V")
    public final void method1325(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!w", name = "X", descriptor = "(S)Z")
    private final boolean method2876(short arg0) {
        synchronized (this) {
            class476 var3 = super.field7480.method1366(arg0, (byte) 35);
            if (var3 == null) {
                return false;
            } else {
                this.method2884(arg0, var3.field7284, var3.field7273, var3.field7289, var3.field7269, var3.field7280, var3.field7272, var3.field7279, var3.field7282, var3.field7281, var3.field7275, var3.field7268, var3.field7283);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ln;)V")
    public final void method1295(class517 arg0) {
        this.field7062 = (class97) arg0;
        this.method2887(arg0);
    }

    @OriginalMember(owner = "client!w", name = "t", descriptor = "()V")
    public final void method1315() {
    }

    @OriginalMember(owner = "client!w", name = "v", descriptor = "(III[I)V")
    public final native void method1305(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!w", name = "c", descriptor = "()Z")
    public final boolean method1275() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "AA", descriptor = "()I")
    public final native int method1298();

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIILta;II)V")
    public final void method1329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class453 arg6, int arg7, int arg8) {
        this.method2878(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!w", name = "m", descriptor = "()Lc;")
    public final class205 method1231() {
        return this.field7077;
    }

    @OriginalMember(owner = "client!w", name = "T", descriptor = "()F")
    public final native float method1268();

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Le;Ldm;Lc;[Lkk;I)V")
    public final void method1302(class536[] arg0, class519 arg1, class205 arg2, class182[] arg3, int arg4) {
        this.method2882(arg1, true);
        if (arg3 == null) {
            this.method2886().method188(this, arg0, arg2, (int[]) null, arg4, field7075, field7073, field7074, field7065, field7069, arg1.field7690.method2506((byte) -39), field7066);
        } else {
            class182 var6 = arg3[0];
            field7068[5] = 0;
            this.method2886().method188(this, arg0, arg2, field7068, arg4, field7075, field7073, field7074, field7065, field7069, arg1.field7690.method2506((byte) -38), field7066);
            var6.field2644 = field7068[0];
            var6.field2640 = field7068[1];
            var6.field2642 = field7068[2];
            var6.field2645 = field7068[3];
            var6.field2641 = field7068[4];
            var6.field2643 = field7068[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class395 var9 = (class395) arg0[var8];
                var9.method2552(var7, arg2);
                if (var9.field5986 != null) {
                    var7 += var9.field5986.length * 9;
                }
                if (var9.field5988 != null) {
                    var7 += var9.field5988.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(Lb;)V")
    private final native void method2877(class133 arg0);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIII)V")
    public final void method1280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2886().method177(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!w", name = "NA", descriptor = "(IIIIIILta;II)V")
    private final native void method2878(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class453 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lok;Z)Lo;")
    public final class139 method1278(class175 arg0, boolean arg1) {
        int[] var3 = arg0.field2571;
        byte[] var4 = arg0.field2574;
        int var5 = arg0.field2576;
        int var6 = arg0.field2577;
        class139 var7;
        if (arg1 && arg0.field2572 == null) {
            var7 = new class115(this, this.field7062, var3, var4, 0, arg0.field2576, arg0.field2576, arg0.field2577);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field2572;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class110(this, this.field7062, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field2571[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class110(this, this.field7062, var9, 0, arg0.field2576, arg0.field2576, arg0.field2577);
                } else {
                    var7 = new class90(this, this.field7062, var9, 0, arg0.field2576, arg0.field2576, arg0.field2577);
                }
            }
        }
        var7.method627(arg0.field2575, arg0.field2579, arg0.field2573, arg0.field2578);
        return var7;
    }

    @OriginalMember(owner = "client!w", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method2879(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!w", name = "aa", descriptor = "()F")
    public final native float method1328();

    @OriginalMember(owner = "client!w", name = "ua", descriptor = "()V")
    private final native void method2880();

    @OriginalMember(owner = "client!w", name = "n", descriptor = "()V")
    public final native void method1245();

    @OriginalMember(owner = "client!w", name = "R", descriptor = "()V")
    private final void method2881() {
        System.gc();
        System.runFinalization();
        class431.method2718(0);
    }

    @OriginalMember(owner = "client!w", name = "x", descriptor = "()Z")
    public final boolean method1283() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "ya", descriptor = "(I)V")
    public final native void method1335(int arg0);

    @OriginalMember(owner = "client!w", name = "ma", descriptor = "(IIIII)V")
    public final native void method1332(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "K", descriptor = "(IIIIII[BII)V")
    public final native void method1271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II[I[I)Lta;")
    public final class453 method1334(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class404(this, this.field7062, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ldm;Z)V")
    private final void method2882(class519 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class113 var8 = (class113) arg0.field7690.method2503(0); var8 != null; var8 = (class113) arg0.field7690.method2510(0)) {
            field7075[var3++] = var8.field1582;
            field7075[var3++] = var8.field1588;
            field7075[var3++] = var8.field1592;
            field7073[var4++] = var8.field1584;
            field7065[var6++] = (short) var8.field1591;
            field7074[var5++] = var8.field1594;
            if (arg1) {
                field7069[var7++] = var8.field1587;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "u", descriptor = "(I)V")
    private final native void method2883(int arg0);

    @OriginalMember(owner = "client!w", name = "MA", descriptor = "([I)V")
    public final native void method1237(int[] arg0);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I[Las;)V")
    public final void method1242(int arg0, class415[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field7064[var3++] = arg1[var4].method2650(119);
            field7064[var3++] = arg1[var4].method2645(124);
            field7064[var3++] = arg1[var4].method2654(0);
            field7064[var3++] = arg1[var4].method2651(-110);
            field7067[var4] = arg1[var4].method2648(false);
            field7064[var3++] = arg1[var4].method2647(-36);
        }
        this.method2874(arg0, field7064, field7067);
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
    public final void method1244(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "OA", descriptor = "()I")
    public final native int method1327();

    @OriginalMember(owner = "client!w", name = "SA", descriptor = "(Lc;)V")
    public final native void method1314(class205 arg0);

    @OriginalMember(owner = "client!w", name = "ZA", descriptor = "(IIIII)V")
    public final native void method1235(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()Z")
    public final boolean method1318() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1253(Canvas arg0) {
        class133 var2 = (class133) this.field7080.method1122((byte) 59, (long) arg0.hashCode());
        Dimension var3 = arg0.getSize();
        var2.method825(arg0, var3.width, var3.height);
        if (arg0 != null && this.field7079.field1802 == arg0) {
            this.method1230(arg0);
        }
    }

    @OriginalMember(owner = "client!w", name = "va", descriptor = "()V")
    public final native void method1228();

    @OriginalMember(owner = "client!w", name = "i", descriptor = "()V")
    public final void method1319() {
    }

    @OriginalMember(owner = "client!w", name = "w", descriptor = "()Z")
    public final boolean method1267() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "k", descriptor = "()V")
    public final void method1293() {
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method2884(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!w", name = "s", descriptor = "(IIII)V")
    public final native void method1326(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Le;Ldm;Lc;Lkk;I)V")
    public final void method1291(class536 arg0, class519 arg1, class205 arg2, class182 arg3, int arg4) {
        this.method2882(arg1, true);
        if (arg3 == null) {
            this.method2886().method174(this, arg0, arg2, (int[]) null, arg4, field7075, field7073, field7074, field7065, field7069, arg1.field7690.method2506((byte) -87), field7066);
        } else {
            field7068[5] = 0;
            this.method2886().method174(this, arg0, arg2, field7068, arg4, field7075, field7073, field7074, field7065, field7069, arg1.field7690.method2506((byte) -78), field7066);
            arg3.field2644 = field7068[0];
            arg3.field2640 = field7068[1];
            arg3.field2642 = field7068[2];
            arg3.field2645 = field7068[3];
            arg3.field2641 = field7068[4];
            arg3.field2643 = field7068[5] != 0;
        }
        class395 var6 = (class395) arg0;
        var6.method2552(0, arg2);
    }

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "(III)V")
    public final native void method1297(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!w", name = "JA", descriptor = "(F)V")
    public final native void method1301(float arg0);

    @OriginalMember(owner = "client!w", name = "e", descriptor = "()Z")
    public final boolean method1266() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public final void method1287(int arg0) {
        class431.method2718(0);
        this.method2883(arg0);
        for (class97 var2 = (class97) this.field7063.method2123(-109); var2 != null; var2 = (class97) this.field7063.method2126((byte) 61)) {
            var2.method655();
        }
    }

    @OriginalMember(owner = "client!w", name = "j", descriptor = "()Z")
    public final boolean method1256() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "qa", descriptor = "()Ljava/lang/Object;")
    private final Object method2885() {
        return new class448(this);
    }

    @OriginalMember(owner = "client!w", name = "t", descriptor = "(I)V")
    public final native void method1317(int arg0);

    @OriginalMember(owner = "client!w", name = "VA", descriptor = "(IIIIII)Z")
    public final native boolean method1273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
    public final void method1292(boolean arg0) {
    }

    @OriginalMember(owner = "client!w", name = "r", descriptor = "()I")
    public final native int method1259();

    @OriginalMember(owner = "client!w", name = "C", descriptor = "()Lk;")
    public final class28 method2886() {
        for (int var1 = 0; var1 < this.field7082; ++var1) {
            if (this.field7083[var1].field309 == Thread.currentThread()) {
                return this.field7083[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!w", name = "v", descriptor = "()V")
    public final void method1310() {
        if (!this.field7072) {
            this.field7083 = null;
            this.field7079 = null;
            this.field7062 = null;
            this.field7077 = null;
            this.field7080.method1128(53);
            for (class97 var1 = (class97) this.field7063.method2123(-43); var1 != null; var1 = (class97) this.field7063.method2126((byte) 61)) {
                var1.method656();
            }
            this.field7063.method2120((byte) 27);
            this.method2880();
            if (this.field7081) {
                class269.method1825(true, 1, false);
                this.field7081 = false;
            }
            this.method2881();
            class431.method2720((byte) 88);
            this.field7072 = true;
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "()Z")
    public final boolean method1279() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "ba", descriptor = "(IIII)V")
    public final native void method1307(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "p", descriptor = "()V")
    public final native void method175();

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Laq;[Lok;Z)Lla;")
    public final class299 method1246(class340 arg0, class175[] arg1, boolean arg2) {
        return arg2 ? new class277(this, this.field7062, arg0, arg1, (class139[]) null) : new class47(this, this.field7062, arg0, arg1, (class139[]) null);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I")
    public final int method1294(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!w", name = "q", descriptor = "()V")
    public final void method1264() {
    }

    @OriginalMember(owner = "client!w", name = "o", descriptor = "()Z")
    public final boolean method1313() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "ra", descriptor = "(ILta;II)V")
    public final native void method1323(int arg0, class453 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1243(Rectangle[] arg0, int arg1) {
        if (this.field7079 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field7079.method824(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "()V")
    public final void method1316() {
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIZ)Lo;")
    public final class139 method1311(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class110(this, this.field7062, arg0, arg1, arg2, arg3) : new class90(this, this.field7062, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V")
    public final void method1274(int arg0) {
        this.field7082 = arg0;
        this.field7083 = new class28[this.field7082];
        for (int var2 = 0; var2 < this.field7082; ++var2) {
            this.field7083[var2] = new class28(this, this.field7076, this.field7078);
        }
    }

    @OriginalMember(owner = "client!w", name = "HA", descriptor = "(IIII)V")
    public final native void method1290(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "A", descriptor = "()Z")
    public final boolean method1304() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method3039(12755);
        if (this.nativeid != 0L) {
            class431.method2721(this, false);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1230(Canvas arg0) {
        if (arg0 != null) {
            class133 var2 = (class133) this.field7080.method1122((byte) 59, (long) arg0.hashCode());
            this.field7079 = var2;
            this.method2877(var2);
        } else {
            this.field7079 = null;
            this.method2877((class133) null);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIF)Las;")
    public final class415 method1333(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class229(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lmt;Lmt;FLmt;)Lmt;")
    public final class321 method1286(class321 arg0, class321 arg1, float arg2, class321 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!w", name = "l", descriptor = "()V")
    public final void method1255() {
        if (this.field7079 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field7079.method822();
        }
    }

    @OriginalMember(owner = "client!w", name = "QA", descriptor = "(Ln;)V")
    private final native void method2887(class517 arg0);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()Z")
    public final boolean method1238() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "B", descriptor = "(IFFFFF)V")
    public final native void method1249(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
    public final void method1288(int arg0) {
        this.field7083[arg0].method179();
    }

    @OriginalMember(owner = "client!w", name = "W", descriptor = "(Ll;II)V")
    private final native void method2888(class199 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!w", name = "u", descriptor = "()Z")
    public final boolean method1296() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II[[I[[IIII)Lya;")
    public final class223 method1236(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class469(this, this.field7062, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}
