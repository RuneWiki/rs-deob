import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class165 extends class1 {

    @OriginalMember(owner = "client!df", name = "F", descriptor = "Z")
    public boolean field2450 = false;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    private int field2442 = 0;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public int field2438 = 0;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "B")
    private byte field2448 = 0;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "B")
    private byte field2458 = 0;

    @OriginalMember(owner = "client!df", name = "hb", descriptor = "I")
    private int field2478 = 0;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "[I")
    private int[] field2456;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "[I")
    public int[] field2446;

    @OriginalMember(owner = "client!df", name = "cb", descriptor = "[I")
    public int[] field2473;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "[I")
    public int[] field2455;

    @OriginalMember(owner = "client!df", name = "T", descriptor = "[I")
    private int[] field2464;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "[S")
    private short[] field2453;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "[S")
    private short[] field2444;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "[S")
    private short[] field2441;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "[S")
    private short[] field2436;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "[S")
    private short[] field2447;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "[F")
    private float[] field2434;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "[F")
    private float[] field2459;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "[S")
    private short[] field2460;

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "[B")
    private byte[] field2469;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "[S")
    private short[] field2437;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "[S")
    private short[] field2465;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "[S")
    private short[] field2463;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "[S")
    private short[] field2454;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "[B")
    private byte[] field2440;

    @OriginalMember(owner = "client!df", name = "eb", descriptor = "[S")
    private short[] field2475;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "Lqi;")
    public class303 field2443;

    @OriginalMember(owner = "client!df", name = "V", descriptor = "Ldg;")
    public class320 field2466;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "Ldg;")
    private class320 field2451;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "Ldg;")
    private class320 field2435;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "Ldg;")
    private class320 field2445;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "Ldg;")
    private class320 field2439;

    @OriginalMember(owner = "client!df", name = "gb", descriptor = "S")
    private short field2477;

    @OriginalMember(owner = "client!df", name = "X", descriptor = "S")
    private short field2468;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "[S")
    private short[] field2449;

    @OriginalMember(owner = "client!df", name = "W", descriptor = "[I")
    private int[] field2467;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "Lhb;")
    private static class35 field2461 = new class35(10000);

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "Ldf;")
    private static class165 field2471 = new class165();

    @OriginalMember(owner = "client!df", name = "fb", descriptor = "Ldf;")
    private static class165 field2476 = new class165();

    @OriginalMember(owner = "client!df", name = "ib", descriptor = "Ldf;")
    private static class165 field2479 = new class165();

    @OriginalMember(owner = "client!df", name = "jb", descriptor = "Ldf;")
    private static class165 field2480 = new class165();

    @OriginalMember(owner = "client!df", name = "kb", descriptor = "Ldf;")
    private static class165 field2481 = new class165();

    @OriginalMember(owner = "client!df", name = "lb", descriptor = "Ldf;")
    private static class165 field2482 = new class165();

    @OriginalMember(owner = "client!df", name = "pb", descriptor = "Z")
    private static boolean field2486 = false;

    @OriginalMember(owner = "client!df", name = "mb", descriptor = "[I")
    private static int[] field2483 = new int[1];

    @OriginalMember(owner = "client!df", name = "ub", descriptor = "[I")
    private static int[] field2491 = new int[1];

    @OriginalMember(owner = "client!df", name = "nb", descriptor = "F")
    private static float field2484;

    @OriginalMember(owner = "client!df", name = "qb", descriptor = "F")
    private static float field2487;

    @OriginalMember(owner = "client!df", name = "sb", descriptor = "F")
    private static float field2489;

    @OriginalMember(owner = "client!df", name = "tb", descriptor = "F")
    private static float field2490;

    @OriginalMember(owner = "client!df", name = "vb", descriptor = "F")
    private static float field2492;

    @OriginalMember(owner = "client!df", name = "wb", descriptor = "F")
    private static float field2493;

    @OriginalMember(owner = "client!df", name = "ob", descriptor = "I")
    private static int field2485;

    @OriginalMember(owner = "client!df", name = "rb", descriptor = "I")
    private static int field2488;

    @OriginalMember(owner = "client!df", name = "xb", descriptor = "I")
    private static int field2494;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "Led;")
    private class296 field2462;

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "Lgn;")
    private class5 field2470;

    @OriginalMember(owner = "client!df", name = "bb", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2472;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "[J")
    private static long[] field2457;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "[[I")
    private int[][] field2452;

    @OriginalMember(owner = "client!df", name = "db", descriptor = "[[I")
    private int[][] field2474;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "()V", line = 8)
    public static final void method1181() {
        field2471 = new class165();
        field2476 = new class165();
        field2479 = new class165();
        field2480 = new class165();
        field2481 = new class165();
        field2482 = new class165();
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V", line = 18)
    public final void method1182(int arg0) {
        if (this.field2444 == null) {
            this.method23(arg0);
            return;
        }
        int var2 = class56.field838[arg0];
        int var3 = class56.field830[arg0];
        for (int var4 = 0; var4 < this.field2438; var4++) {
            int var5 = this.field2455[var4] * var2 + this.field2446[var4] * var3 >> 16;
            this.field2455[var4] = this.field2455[var4] * var3 - this.field2446[var4] * var2 >> 16;
            this.field2446[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field2442; var6++) {
            int var7 = this.field2444[var6] * var3 + this.field2436[var6] * var2 >> 16;
            this.field2436[var6] = (short) (this.field2436[var6] * var3 - this.field2444[var6] * var2 >> 16);
            this.field2444[var6] = (short) var7;
        }
        this.field2443.field4749 = false;
        this.field2466.field4989 = false;
        if (this.field2435 != null) {
            this.field2435.field4989 = false;
        }
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "(I)V", line = 61)
    public final void method1183(int arg0) {
        this.field2477 = (short) arg0;
        this.field2451.field4989 = false;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(III)V", line = 67)
    public final void method2(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2438; var4++) {
            this.field2446[var4] = this.field2446[var4] * arg0 >> 7;
            this.field2473[var4] = this.field2473[var4] * arg1 >> 7;
            this.field2455[var4] = this.field2455[var4] * arg2 >> 7;
        }
        this.field2443.field4749 = false;
        this.field2466.field4989 = false;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ISIB)I", line = 82)
    private static final int method1184(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class56.field832[class85.method696(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class56.field829.method1740(96, arg1 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class56.field829.method1745(false, arg1 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 & 0xFF00 << 8) + (var11 & 0xFF00);
            }
        }
        return (var4 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()Z", line = 141)
    public final boolean method386() {
        return this.field2450 && this.field2446 != null && this.field2444 != null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII)V", line = 144)
    public final void method6(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field2494 = 0;
            field2485 = 0;
            field2488 = 0;
            for (int var6 = 0; var6 < this.field2438; var6++) {
                field2494 += this.field2446[var6];
                field2485 += this.field2473[var6];
                field2488 += this.field2455[var6];
                var5++;
            }
            if (var5 > 0) {
                field2494 = field2494 / var5 + arg1;
                field2485 = field2485 / var5 + arg2;
                field2488 = field2488 / var5 + arg3;
            } else {
                field2494 = arg1;
                field2485 = arg2;
                field2488 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field2438; var7++) {
                this.field2446[var7] += arg1;
                this.field2473[var7] += arg2;
                this.field2455[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field2438; var8++) {
                this.field2446[var8] -= field2494;
                this.field2473[var8] -= field2485;
                this.field2455[var8] -= field2488;
                if (arg3 != 0) {
                    int var9 = class56.field838[arg3];
                    int var10 = class56.field830[arg3];
                    int var11 = this.field2473[var8] * var9 + this.field2446[var8] * var10 + 32767 >> 16;
                    this.field2473[var8] = this.field2473[var8] * var10 + 32767 - this.field2446[var8] * var9 >> 16;
                    this.field2446[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class56.field838[arg1];
                    int var13 = class56.field830[arg1];
                    int var14 = this.field2473[var8] * var13 + 32767 - this.field2455[var8] * var12 >> 16;
                    this.field2455[var8] = this.field2473[var8] * var12 + this.field2455[var8] * var13 + 32767 >> 16;
                    this.field2473[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class56.field838[arg2];
                    int var16 = class56.field830[arg2];
                    int var17 = this.field2455[var8] * var15 + this.field2446[var8] * var16 + 32767 >> 16;
                    this.field2455[var8] = this.field2455[var8] * var16 + 32767 - this.field2446[var8] * var15 >> 16;
                    this.field2446[var8] = var17;
                }
                this.field2446[var8] += field2494;
                this.field2473[var8] += field2485;
                this.field2455[var8] += field2488;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field2438; var18++) {
                this.field2446[var18] -= field2494;
                this.field2473[var18] -= field2485;
                this.field2455[var18] -= field2488;
                this.field2446[var18] = this.field2446[var18] * arg1 / 128;
                this.field2473[var18] = this.field2473[var18] * arg2 / 128;
                this.field2455[var18] = this.field2455[var18] * arg3 / 128;
                this.field2446[var18] += field2494;
                this.field2473[var18] += field2485;
                this.field2455[var18] += field2488;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field2478; var19++) {
                int var20 = (this.field2469[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field2469[var19] = (byte) var20;
            }
            this.field2451.field4989 = false;
        } else if (arg0 == 7) {
            for (int var21 = 0; var21 < this.field2478; var21++) {
                int var22 = this.field2460[var21] & 0xFFFF;
                int var23 = var22 >> 10 & 0x3F;
                int var24 = var22 >> 7 & 0x7;
                int var25 = var22 & 0x7F;
                int var26 = arg1 + var23 & 0x3F;
                int var27 = arg2 / 4 + var24;
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 7) {
                    var27 = 7;
                }
                int var28 = arg3 + var25;
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 127) {
                    var28 = 127;
                }
                this.field2460[var21] = (short) (var26 << 10 | var27 << 7 | var28);
            }
            this.field2451.field4989 = false;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(ZZZ)Laj;", line = 338)
    public final class1 method26(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1196(arg0, arg1, arg2, field2480, field2479);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZZZZZZZ)V", line = 341)
    public final void method1185(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field2458 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field2442 != 0) {
            if (arg6) {
                boolean var8 = !this.field2451.field4989 && (arg1 || arg2 && !class175.field2589);
                this.method1197(false, !this.field2466.field4989 && arg0, var8, this.field2435 != null && !this.field2435.field4989 && arg2, !this.field2445.field4989 && arg3);
                if (!this.field2439.field4989 && arg4 && arg1) {
                    this.method1211();
                }
            }
            if (arg0) {
                if (this.field2466.field4989) {
                    if (!this.field2443.field4749) {
                        this.method1203();
                    }
                    this.field2446 = null;
                    this.field2473 = null;
                    this.field2455 = null;
                    this.field2449 = null;
                    this.field2456 = null;
                } else {
                    this.field2448 = (byte) (this.field2448 | 0x1);
                }
            }
            if (arg1) {
                if (this.field2451.field4989) {
                    this.field2460 = null;
                    this.field2469 = null;
                } else {
                    this.field2448 = (byte) (this.field2448 | 0x2);
                }
            }
            if (arg2 && class175.field2589) {
                if (this.field2435.field4989) {
                    this.field2444 = null;
                    this.field2441 = null;
                    this.field2436 = null;
                    this.field2447 = null;
                } else {
                    this.field2448 = (byte) (this.field2448 | 0x4);
                }
            }
            if (arg3) {
                if (this.field2445.field4989) {
                    this.field2434 = null;
                    this.field2459 = null;
                } else {
                    this.field2448 = (byte) (this.field2448 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field2439.field4989 && this.field2451.field4989) {
                    this.field2437 = null;
                    this.field2465 = null;
                    this.field2463 = null;
                } else {
                    this.field2448 = (byte) (this.field2448 | 0x10);
                }
            }
            if (arg5) {
                this.field2464 = null;
                this.field2440 = null;
                this.field2452 = (int[][]) null;
                this.field2474 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "h", descriptor = "(I)V", line = 437)
    public final void method1186(int arg0) {
        this.field2468 = (short) arg0;
        if (this.field2435 != null) {
            this.field2435.field4989 = false;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([SI)[S", line = 445)
    private static final short[] method1187(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class151.method1118(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V", line = 452)
    public final void method23(int arg0) {
        int var2 = class56.field838[arg0];
        int var3 = class56.field830[arg0];
        for (int var4 = 0; var4 < this.field2438; var4++) {
            int var5 = this.field2455[var4] * var2 + this.field2446[var4] * var3 >> 16;
            this.field2455[var4] = this.field2455[var4] * var3 - this.field2446[var4] * var2 >> 16;
            this.field2446[var4] = var5;
        }
        this.field2443.field4749 = false;
        this.field2466.field4989 = false;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIIJ)V", line = 471)
    public final void method18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field2442 == 0) {
            return;
        }
        GL var10 = class36.field518;
        var10.glPushMatrix();
        if (arg3 != 0) {
            var10.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var10.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var10.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var10.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var10.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method1192();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(SS)V", line = 496)
    public final void method1188(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2478; var3++) {
            if (this.field2460[var3] == arg0) {
                this.field2460[var3] = arg1;
            }
        }
        this.field2451.field4989 = false;
    }

    @OriginalMember(owner = "client!df", name = "n", descriptor = "()I", line = 508)
    public final int method1189() {
        return this.field2477;
    }

    @OriginalMember(owner = "client!df", name = "o", descriptor = "()V", line = 512)
    public final void method1190() {
        int var10002;
        if (this.field2464 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2438; var3++) {
                int var4 = this.field2464[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2452 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2452[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2438) {
                int var7 = this.field2464[var6] & 0xFF;
                this.field2452[var7][var1[var7]++] = var6++;
            }
            this.field2464 = null;
        }
        if (this.field2440 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2478; var10++) {
            int var11 = this.field2440[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2474 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2474[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2478) {
            int var14 = this.field2440[var13] & 0xFF;
            this.field2474[var14][var8[var14]++] = var13++;
        }
        this.field2440 = null;
    }

    @OriginalMember(owner = "client!df", name = "h", descriptor = "()V", line = 610)
    public final void method20() {
        for (int var1 = 0; var1 < this.field2438; var1++) {
            this.field2446[var1] = this.field2446[var1] + 7 >> 4;
            this.field2473[var1] = this.field2473[var1] + 7 >> 4;
            this.field2455[var1] = this.field2455[var1] + 7 >> 4;
        }
        this.field2443.field4749 = false;
        this.field2466.field4989 = false;
    }

    @OriginalMember(owner = "client!df", name = "p", descriptor = "()V", line = 626)
    public final void method1191() {
        for (int var1 = 0; var1 < this.field2438; var1++) {
            this.field2455[var1] = -this.field2455[var1];
        }
        if (this.field2436 != null) {
            for (int var2 = 0; var2 < this.field2442; var2++) {
                this.field2436[var2] = (short) (-this.field2436[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field2478; var3++) {
            short var4 = this.field2437[var3];
            this.field2437[var3] = this.field2463[var3];
            this.field2463[var3] = var4;
        }
        this.field2443.field4749 = false;
        this.field2466.field4989 = false;
        if (this.field2435 != null) {
            this.field2435.field4989 = false;
        }
        this.field2439.field4989 = false;
    }

    @OriginalMember(owner = "client!df", name = "q", descriptor = "()V", line = 664)
    private final void method1192() {
        GL var1 = class36.field518;
        if (this.field2478 == 0) {
            return;
        }
        if (this.field2458 != 0) {
            this.method1197(true, !this.field2466.field4989 && (this.field2458 & 0x1) != 0, !this.field2451.field4989 && (this.field2458 & 0x2) != 0, this.field2435 != null && !this.field2435.field4989 && (this.field2458 & 0x4) != 0, false);
        }
        this.method1197(false, !this.field2466.field4989, !this.field2451.field4989, this.field2435 != null && !this.field2435.field4989, !this.field2445.field4989);
        if (!this.field2439.field4989) {
            this.method1211();
        }
        if (this.field2448 != 0) {
            if ((this.field2448 & 0x1) != 0) {
                this.field2446 = null;
                this.field2473 = null;
                this.field2455 = null;
                this.field2449 = null;
                this.field2456 = null;
            }
            if ((this.field2448 & 0x2) != 0) {
                this.field2460 = null;
                this.field2469 = null;
            }
            if ((this.field2448 & 0x4) != 0) {
                this.field2444 = null;
                this.field2441 = null;
                this.field2436 = null;
                this.field2447 = null;
            }
            if ((this.field2448 & 0x8) != 0) {
                this.field2434 = null;
                this.field2459 = null;
            }
            if ((this.field2448 & 0x10) != 0) {
                this.field2437 = null;
                this.field2465 = null;
                this.field2463 = null;
            }
            this.field2448 = 0;
        }
        class296 var2 = null;
        if (this.field2466.field4982 != null) {
            this.field2466.field4982.method2088();
            var2 = this.field2466.field4982;
            var1.glVertexPointer(3, 5126, this.field2466.field4987, (long) this.field2466.field4981);
        }
        if (this.field2451.field4982 != null) {
            if (this.field2451.field4982 != var2) {
                this.field2451.field4982.method2088();
                var2 = this.field2451.field4982;
            }
            var1.glColorPointer(4, 5121, this.field2451.field4987, (long) this.field2451.field4981);
        }
        if (class175.field2589 && this.field2435.field4982 != null) {
            if (this.field2435.field4982 != var2) {
                this.field2435.field4982.method2088();
                var2 = this.field2435.field4982;
            }
            var1.glNormalPointer(5126, this.field2435.field4987, (long) this.field2435.field4981);
        }
        if (this.field2445.field4982 != null) {
            if (this.field2445.field4982 != var2) {
                this.field2445.field4982.method2088();
                class296 var3 = this.field2445.field4982;
            }
            var1.glTexCoordPointer(2, 5126, this.field2445.field4987, (long) this.field2445.field4981);
        }
        if (this.field2439.field4982 != null) {
            this.field2439.field4982.method2087();
        }
        if (this.field2466.field4982 == null || this.field2451.field4982 == null || class175.field2589 && this.field2435.field4982 == null || this.field2445.field4982 == null) {
            if (class36.field529) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field2466.field4982 == null) {
                this.field2466.field4984.position(this.field2466.field4981);
                var1.glVertexPointer(3, 5126, this.field2466.field4987, this.field2466.field4984);
            }
            if (this.field2451.field4982 == null) {
                this.field2451.field4984.position(this.field2451.field4981);
                var1.glColorPointer(4, 5121, this.field2451.field4987, this.field2451.field4984);
            }
            if (class175.field2589 && this.field2435.field4982 == null) {
                this.field2435.field4984.position(this.field2435.field4981);
                var1.glNormalPointer(5126, this.field2435.field4987, this.field2435.field4984);
            }
            if (this.field2445.field4982 == null) {
                this.field2445.field4984.position(this.field2445.field4981);
                var1.glTexCoordPointer(2, 5126, this.field2445.field4987, this.field2445.field4984);
            }
        }
        if (this.field2439.field4982 == null && class36.field529) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field2467.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field2467[var5];
            int var7 = this.field2467[var5 + 1];
            short var8 = this.field2454[var6];
            if (var8 == -1) {
                class36.method310(-1);
                class309.method2143(0, -127, 0);
            } else {
                class56.field829.method1735(var8 & 0xFFFF, (byte) -50);
            }
            if (this.field2439.field4982 == null) {
                this.field2439.field4984.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field2439.field4984);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "r", descriptor = "()V", line = 835)
    public final void method1193() {
        if (this.field2444 == null) {
            this.method5();
            return;
        }
        for (int var1 = 0; var1 < this.field2438; var1++) {
            this.field2446[var1] = -this.field2446[var1];
            this.field2455[var1] = -this.field2455[var1];
        }
        for (int var2 = 0; var2 < this.field2442; var2++) {
            this.field2444[var2] = (short) (-this.field2444[var2]);
            this.field2436[var2] = (short) (-this.field2436[var2]);
        }
        this.field2443.field4749 = false;
        this.field2466.field4989 = false;
        if (this.field2435 != null) {
            this.field2435.field4989 = false;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Lgd;", line = 868)
    public final class310 method381(int arg0, int arg1, int arg2) {
        this.field2450 = false;
        if (this.field2470 != null) {
            this.field2444 = this.field2470.field49;
            this.field2441 = this.field2470.field48;
            this.field2436 = this.field2470.field51;
            this.field2447 = this.field2470.field50;
            this.field2470 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lgd;IIIZ)V", line = 882)
    public final void method400(class310 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class165 var6 = (class165) arg0;
        if (this.field2478 == 0 || var6.field2478 == 0) {
            return;
        }
        int var7 = var6.field2438;
        int[] var8 = var6.field2446;
        int[] var9 = var6.field2473;
        int[] var10 = var6.field2455;
        short[] var11 = var6.field2444;
        short[] var12 = var6.field2441;
        short[] var13 = var6.field2436;
        short[] var14 = var6.field2447;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field2470 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field2470.field49;
            var16 = this.field2470.field48;
            var17 = this.field2470.field51;
            var18 = this.field2470.field50;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field2470 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field2470.field49;
            var20 = var6.field2470.field48;
            var21 = var6.field2470.field51;
            var22 = var6.field2470.field50;
        }
        int[] var23 = var6.field2456;
        short[] var24 = var6.field2449;
        if (!var6.field2443.field4749) {
            var6.method1203();
        }
        short var25 = var6.field2443.field4743;
        short var26 = var6.field2443.field4745;
        short var27 = var6.field2443.field4744;
        short var28 = var6.field2443.field4746;
        short var29 = var6.field2443.field4747;
        short var30 = var6.field2443.field4750;
        for (int var31 = 0; var31 < this.field2438; var31++) {
            int var32 = this.field2473[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field2446[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field2455[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field2456[var31];
                        int var37 = this.field2456[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field2449[var38] - 1;
                            if (var35 == -1 || this.field2447[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field2470 = new class5();
                                            var15 = this.field2470.field49 = class95.method750(this.field2444, (byte) -12);
                                            var16 = this.field2470.field48 = class95.method750(this.field2441, (byte) -12);
                                            var17 = this.field2470.field51 = class95.method750(this.field2436, (byte) -12);
                                            var18 = this.field2470.field50 = class95.method750(this.field2447, (byte) -12);
                                        }
                                        if (var19 == null) {
                                            class5 var44 = var6.field2470 = new class5();
                                            var19 = var44.field49 = class95.method750(var11, (byte) -12);
                                            var20 = var44.field48 = class95.method750(var12, (byte) -12);
                                            var21 = var44.field51 = class95.method750(var13, (byte) -12);
                                            var22 = var44.field50 = class95.method750(var14, (byte) -12);
                                        }
                                        short var45 = this.field2444[var35];
                                        short var46 = this.field2441[var35];
                                        short var47 = this.field2436[var35];
                                        short var48 = this.field2447[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        short var55 = var13[var40];
                                        short var56 = var14[var40];
                                        int var57 = this.field2456[var31];
                                        int var58 = this.field2456[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field2449[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var54;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "s", descriptor = "()V", line = 1119)
    public final void method1194() {
        if (this.field2444 == null) {
            this.method14();
            return;
        }
        for (int var1 = 0; var1 < this.field2438; var1++) {
            int var2 = this.field2455[var1];
            this.field2455[var1] = this.field2446[var1];
            this.field2446[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field2442; var3++) {
            short var4 = this.field2436[var3];
            this.field2436[var3] = this.field2444[var3];
            this.field2444[var3] = (short) (-var4);
        }
        this.field2443.field4749 = false;
        this.field2466.field4989 = false;
        if (this.field2435 != null) {
            this.field2435.field4989 = false;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(FFF)I", line = 1157)
    private static final int method1195(float arg0, float arg1, float arg2) {
        float var3 = arg0 < 0.0F ? -arg0 : arg0;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 > var3 && var4 > var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var5 > var3 && var5 > var4) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()I", line = 1193)
    public final int method19() {
        if (!this.field2443.field4749) {
            this.method1203();
        }
        return this.field2443.field4743;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V", line = 1202)
    public final void method21(int arg0) {
        int var2 = class56.field838[arg0];
        int var3 = class56.field830[arg0];
        for (int var4 = 0; var4 < this.field2438; var4++) {
            int var5 = this.field2473[var4] * var2 + this.field2446[var4] * var3 >> 16;
            this.field2473[var4] = this.field2473[var4] * var3 - this.field2446[var4] * var2 >> 16;
            this.field2446[var4] = var5;
        }
        this.field2443.field4749 = false;
        this.field2466.field4989 = false;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZZZLdf;Ldf;)Laj;", line = 1221)
    private final class1 method1196(boolean arg0, boolean arg1, boolean arg2, class165 arg3, class165 arg4) {
        arg3.field2438 = this.field2438;
        arg3.field2442 = this.field2442;
        arg3.field2478 = this.field2478;
        arg3.field2477 = this.field2477;
        arg3.field2468 = this.field2468;
        arg3.field2458 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
        if (arg3.field2446 == null || arg3.field2446.length < this.field2438) {
            arg3.field2446 = new int[this.field2438 + 100];
            arg3.field2473 = new int[this.field2438 + 100];
            arg3.field2455 = new int[this.field2438 + 100];
        }
        for (int var6 = 0; var6 < this.field2438; var6++) {
            arg3.field2446[var6] = this.field2446[var6];
            arg3.field2473[var6] = this.field2473[var6];
            arg3.field2455[var6] = this.field2455[var6];
        }
        if (arg3.field2466 == null) {
            arg3.field2466 = new class320();
        }
        arg3.field2466.field4989 = false;
        if (arg3.field2443 == null) {
            arg3.field2443 = new class303();
        }
        arg3.field2443.field4749 = false;
        if (arg0) {
            arg3.field2469 = this.field2469;
        } else {
            if (arg4.field2469 == null || arg4.field2469.length < this.field2478) {
                arg4.field2469 = new byte[this.field2478 + 100];
            }
            arg3.field2469 = arg4.field2469;
            for (int var7 = 0; var7 < this.field2478; var7++) {
                arg3.field2469[var7] = this.field2469[var7];
            }
        }
        if (arg1) {
            arg3.field2460 = this.field2460;
        } else {
            if (arg4.field2460 == null || arg4.field2460.length < this.field2478) {
                arg4.field2460 = new short[this.field2478 + 100];
            }
            arg3.field2460 = arg4.field2460;
            for (int var8 = 0; var8 < this.field2478; var8++) {
                arg3.field2460[var8] = this.field2460[var8];
            }
        }
        if (arg0 && arg1) {
            arg3.field2451 = this.field2451;
        } else {
            if (arg4.field2451 == null) {
                arg4.field2451 = new class320();
            }
            arg3.field2451 = arg4.field2451;
            arg3.field2451.field4989 = false;
        }
        if (arg2 || this.field2444 == null) {
            arg3.field2444 = this.field2444;
            arg3.field2441 = this.field2441;
            arg3.field2436 = this.field2436;
            arg3.field2447 = this.field2447;
            arg3.field2435 = this.field2435;
        } else {
            if (arg4.field2444 == null || arg4.field2444.length < this.field2442) {
                arg4.field2444 = new short[this.field2442 + 100];
                arg4.field2441 = new short[this.field2442 + 100];
                arg4.field2436 = new short[this.field2442 + 100];
                arg4.field2447 = new short[this.field2442 + 100];
            }
            arg3.field2444 = arg4.field2444;
            arg3.field2441 = arg4.field2441;
            arg3.field2436 = arg4.field2436;
            arg3.field2447 = arg4.field2447;
            for (int var9 = 0; var9 < this.field2442; var9++) {
                arg3.field2444[var9] = this.field2444[var9];
                arg3.field2441[var9] = this.field2441[var9];
                arg3.field2436[var9] = this.field2436[var9];
                arg3.field2447[var9] = this.field2447[var9];
            }
            if (class175.field2589) {
                if (arg4.field2435 == null) {
                    arg4.field2435 = new class320();
                }
                arg3.field2435 = arg4.field2435;
                arg3.field2435.field4989 = false;
            } else {
                arg3.field2435 = null;
            }
        }
        arg3.field2434 = this.field2434;
        arg3.field2459 = this.field2459;
        arg3.field2464 = this.field2464;
        arg3.field2452 = this.field2452;
        arg3.field2437 = this.field2437;
        arg3.field2465 = this.field2465;
        arg3.field2463 = this.field2463;
        arg3.field2454 = this.field2454;
        arg3.field2440 = this.field2440;
        arg3.field2474 = this.field2474;
        arg3.field2445 = this.field2445;
        arg3.field2439 = this.field2439;
        arg3.field2467 = this.field2467;
        arg3.field2449 = this.field2449;
        arg3.field2456 = this.field2456;
        arg3.field1 = this.field1;
        arg3.field2453 = this.field2453;
        arg3.field2475 = this.field2475;
        return arg3;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZZZZZ)V", line = 1373)
    private final void method1197(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field2466.field4981 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field2451.field4981 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field2435.field4981 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field2445.field4981 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field2461.field437.length < this.field2442 * var6) {
            field2461 = new class35((this.field2442 + 100) * var6);
        } else {
            field2461.field455 = 0;
        }
        if (arg1) {
            if (class36.field510) {
                for (int var7 = 0; var7 < this.field2438; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field2446[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field2473[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field2455[var7]);
                    int var11 = this.field2456[var7];
                    int var12 = this.field2456[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field2449[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field2461.field455 = var6 * var14;
                        field2461.method259(-15195, var8);
                        field2461.method259(-15195, var9);
                        field2461.method259(-15195, var10);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field2438; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field2446[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field2473[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field2455[var15]);
                    int var19 = this.field2456[var15];
                    int var20 = this.field2456[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field2449[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field2461.field455 = var6 * var22;
                        field2461.method276(var16, false);
                        field2461.method276(var17, false);
                        field2461.method276(var18, false);
                    }
                }
            }
        }
        if (arg2) {
            if (class175.field2589) {
                for (int var42 = 0; var42 < this.field2478; var42++) {
                    int var43 = method1184(this.field2460[var42], this.field2454[var42], this.field2477, this.field2469[var42]);
                    field2461.field455 = this.field2437[var42] * var6 + this.field2451.field4981;
                    field2461.method259(-15195, var43);
                    field2461.field455 = this.field2465[var42] * var6 + this.field2451.field4981;
                    field2461.method259(-15195, var43);
                    field2461.field455 = this.field2463[var42] * var6 + this.field2451.field4981;
                    field2461.method259(-15195, var43);
                }
            } else {
                int var23 = (int) class264.field3941[0];
                int var24 = (int) class264.field3941[1];
                int var25 = (int) class264.field3941[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field2477 * 1.3F);
                int var28 = this.field2468 * var26 >> 8;
                for (int var29 = 0; var29 < this.field2478; var29++) {
                    short var30 = this.field2437[var29];
                    short var31 = this.field2447[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field2436[var30] * var25 + this.field2444[var30] * var23 + this.field2441[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field2436[var30] * var25 + this.field2444[var30] * var23 + this.field2441[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field2447[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field2465[var29];
                    short var34 = this.field2447[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field2436[var33] * var25 + this.field2444[var33] * var23 + this.field2441[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field2436[var33] * var25 + this.field2444[var33] * var23 + this.field2441[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field2447[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field2463[var29];
                    short var37 = this.field2447[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field2436[var36] * var25 + this.field2444[var36] * var23 + this.field2441[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field2436[var36] * var25 + this.field2444[var36] * var23 + this.field2441[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field2447[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method1184(this.field2460[var29], this.field2454[var29], var32, this.field2469[var29]);
                    int var40 = method1184(this.field2460[var29], this.field2454[var29], var35, this.field2469[var29]);
                    int var41 = method1184(this.field2460[var29], this.field2454[var29], var38, this.field2469[var29]);
                    field2461.field455 = var6 * var30 + this.field2451.field4981;
                    field2461.method259(-15195, var39);
                    field2461.field455 = var6 * var33 + this.field2451.field4981;
                    field2461.method259(-15195, var40);
                    field2461.field455 = var6 * var36 + this.field2451.field4981;
                    field2461.method259(-15195, var41);
                }
                this.field2444 = null;
                this.field2441 = null;
                this.field2436 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field2468;
            float var45 = 3.0F / (float) (this.field2468 / 2 + this.field2468);
            field2461.field455 = this.field2435.field4981;
            if (class36.field510) {
                for (int var46 = 0; var46 < this.field2442; var46++) {
                    short var47 = this.field2447[var46];
                    if (var47 == 0) {
                        field2461.method274((byte) 28, (float) this.field2444[var46] * var45);
                        field2461.method274((byte) 28, (float) this.field2441[var46] * var45);
                        field2461.method274((byte) 28, (float) this.field2436[var46] * var45);
                    } else {
                        float var48 = var44 / (float) var47;
                        field2461.method274((byte) 28, (float) this.field2444[var46] * var48);
                        field2461.method274((byte) 28, (float) this.field2441[var46] * var48);
                        field2461.method274((byte) 28, (float) this.field2436[var46] * var48);
                    }
                    field2461.field455 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field2442; var49++) {
                    short var50 = this.field2447[var49];
                    if (var50 == 0) {
                        field2461.method297((float) this.field2444[var49] * var45, -11926);
                        field2461.method297((float) this.field2441[var49] * var45, -11926);
                        field2461.method297((float) this.field2436[var49] * var45, -11926);
                    } else {
                        float var51 = var44 / (float) var50;
                        field2461.method297((float) this.field2444[var49] * var51, -11926);
                        field2461.method297((float) this.field2441[var49] * var51, -11926);
                        field2461.method297((float) this.field2436[var49] * var51, -11926);
                    }
                    field2461.field455 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field2461.field455 = this.field2445.field4981;
            if (class36.field510) {
                for (int var52 = 0; var52 < this.field2442; var52++) {
                    field2461.method274((byte) 28, this.field2434[var52]);
                    field2461.method274((byte) 28, this.field2459[var52]);
                    field2461.field455 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field2442; var53++) {
                    field2461.method297(this.field2434[var53], -11926);
                    field2461.method297(this.field2459[var53], -11926);
                    field2461.field455 += var6 - 8;
                }
            }
        }
        field2461.field455 = this.field2442 * var6;
        if (arg0) {
            if (class36.field509) {
                ByteBuffer var54 = ByteBuffer.wrap(field2461.field437, 0, field2461.field455);
                if (this.field2462 == null) {
                    this.field2462 = new class296(true);
                    this.field2462.method2089(var54);
                } else {
                    this.field2462.method2090(var54);
                }
                if (arg1) {
                    this.field2466.field4989 = true;
                    this.field2466.field4984 = null;
                    this.field2466.field4982 = this.field2462;
                    this.field2466.field4987 = var6;
                }
                if (arg2) {
                    this.field2451.field4989 = true;
                    this.field2451.field4984 = null;
                    this.field2451.field4982 = this.field2462;
                    this.field2451.field4987 = var6;
                }
                if (arg3) {
                    this.field2435.field4989 = true;
                    this.field2435.field4984 = null;
                    this.field2435.field4982 = this.field2462;
                    this.field2435.field4987 = var6;
                }
                if (arg4) {
                    this.field2445.field4989 = true;
                    this.field2445.field4984 = null;
                    this.field2445.field4982 = this.field2462;
                    this.field2445.field4987 = var6;
                }
            } else {
                if (field2472 == null || field2472.capacity() < field2461.field455) {
                    field2472 = ByteBuffer.allocateDirect(var6 * 100 + field2461.field455);
                } else {
                    field2472.clear();
                }
                field2472.put(field2461.field437, 0, field2461.field455);
                field2472.flip();
                if (arg1) {
                    this.field2466.field4989 = true;
                    this.field2466.field4984 = field2472;
                    this.field2466.field4982 = null;
                    this.field2466.field4987 = var6;
                }
                if (arg2) {
                    this.field2451.field4989 = true;
                    this.field2451.field4984 = field2472;
                    this.field2466.field4982 = null;
                    this.field2451.field4987 = var6;
                }
                if (arg3) {
                    this.field2435.field4989 = true;
                    this.field2435.field4984 = field2472;
                    this.field2435.field4982 = null;
                    this.field2435.field4987 = var6;
                }
                if (arg4) {
                    this.field2445.field4989 = true;
                    this.field2445.field4984 = field2472;
                    this.field2445.field4982 = null;
                    this.field2445.field4987 = var6;
                }
            }
        } else if (class36.field529) {
            class296 var55 = new class296();
            ByteBuffer var56 = ByteBuffer.wrap(field2461.field437, 0, field2461.field455);
            var55.method2089(var56);
            if (arg1) {
                this.field2466.field4989 = true;
                this.field2466.field4984 = null;
                this.field2466.field4982 = var55;
                this.field2466.field4987 = var6;
            }
            if (arg2) {
                this.field2451.field4989 = true;
                this.field2451.field4984 = null;
                this.field2451.field4982 = var55;
                this.field2451.field4987 = var6;
            }
            if (arg3) {
                this.field2435.field4989 = true;
                this.field2435.field4984 = null;
                this.field2435.field4982 = var55;
                this.field2435.field4987 = var6;
            }
            if (arg4) {
                this.field2445.field4989 = true;
                this.field2445.field4984 = null;
                this.field2445.field4982 = var55;
                this.field2445.field4987 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field2461.field455);
            var57.put(field2461.field437, 0, field2461.field455);
            var57.flip();
            if (arg1) {
                this.field2466.field4989 = true;
                this.field2466.field4984 = var57;
                this.field2466.field4982 = null;
                this.field2466.field4987 = var6;
            }
            if (arg2) {
                this.field2451.field4989 = true;
                this.field2451.field4984 = var57;
                this.field2466.field4982 = null;
                this.field2451.field4987 = var6;
            }
            if (arg3) {
                this.field2435.field4989 = true;
                this.field2435.field4984 = var57;
                this.field2435.field4982 = null;
                this.field2435.field4987 = var6;
            }
            if (arg4) {
                this.field2445.field4989 = true;
                this.field2445.field4984 = var57;
                this.field2445.field4982 = null;
                this.field2445.field4987 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V", line = 4539)
    private class165() {
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lcg;IIZ)V", line = 4541)
    public class165(class42 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field640];
        this.field2456 = new int[arg0.field650 + 1];
        for (int var6 = 0; var6 < arg0.field640; var6++) {
            if ((arg0.field669 == null || arg0.field669[var6] != 2) && (arg0.field667 == null || arg0.field667[var6] == -1 || !class56.field829.method1736(1838177680, arg0.field667[var6] & 0xFFFF))) {
                var5[this.field2478++] = var6;
                this.field2456[arg0.field653[var6]]++;
                this.field2456[arg0.field636[var6]]++;
                this.field2456[arg0.field628[var6]]++;
            }
        }
        long[] var7 = new long[this.field2478];
        for (int var8 = 0; var8 < this.field2478; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field667 != null) {
                var14 = arg0.field667[var9];
                if (var14 != -1) {
                    var12 = class56.field829.method1743(var14 & 0xFFFF, (byte) -24);
                    var13 = class56.field829.method1739(18170, var14 & 0xFFFF);
                }
            }
            boolean var15 = arg0.field645 != null && arg0.field645[var9] != 0 || var14 != -1 && !class56.field829.method1741(true, var14 & 0xFFFF);
            if ((arg3 || var15) && arg0.field648 != null) {
                var10 += arg0.field648[var9] << 17;
            }
            if (var15) {
                var10 += 65536;
            }
            int var16 = ((var12 & 0xFF) << 8) + var10;
            int var17 = (var13 & 0xFF) + var16;
            int var18 = ((var14 & 0xFFFF) << 16) + var11;
            int var19 = (var8 & 0xFFFF) + var18;
            var7[var8] = ((long) var17 << 32) + (long) var19;
        }
        class60.method536(var7, var5, (byte) 61);
        this.field2438 = arg0.field650;
        this.field2446 = arg0.field624;
        this.field2473 = arg0.field652;
        this.field2455 = arg0.field672;
        this.field2464 = arg0.field662;
        this.field2453 = arg0.field658;
        int var20 = this.field2478 * 3;
        this.field2444 = new short[var20];
        this.field2441 = new short[var20];
        this.field2436 = new short[var20];
        this.field2447 = new short[var20];
        this.field2434 = new float[var20];
        this.field2459 = new float[var20];
        this.field2460 = new short[this.field2478];
        this.field2469 = new byte[this.field2478];
        this.field2437 = new short[this.field2478];
        this.field2465 = new short[this.field2478];
        this.field2463 = new short[this.field2478];
        this.field2454 = new short[this.field2478];
        if (arg0.field633 != null) {
            this.field2440 = new byte[this.field2478];
        }
        if (arg0.field654 != null) {
            this.field2475 = new short[this.field2478];
        }
        this.field2443 = new class303();
        this.field2466 = new class320();
        this.field2451 = new class320();
        if (class175.field2589) {
            this.field2435 = new class320();
        }
        this.field2445 = new class320();
        this.field2439 = new class320();
        this.field2477 = (short) arg1;
        this.field2468 = (short) arg2;
        this.field2449 = new short[var20];
        field2457 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field650; var22++) {
            int var23 = this.field2456[var22];
            this.field2456[var22] = var21;
            var21 += var23;
        }
        this.field2456[arg0.field650] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field631 != null) {
            int var28 = arg0.field638;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field2478; var36++) {
                int var37 = var5[var36];
                if (arg0.field631[var37] != -1) {
                    int var38 = arg0.field631[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field653[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field636[var37];
                        } else {
                            var40 = arg0.field628[var37];
                        }
                        int var41 = arg0.field624[var40];
                        int var42 = arg0.field652[var40];
                        int var43 = arg0.field672[var40];
                        if (var41 < var29[var38]) {
                            var29[var38] = var41;
                        }
                        if (var41 > var30[var38]) {
                            var30[var38] = var41;
                        }
                        if (var42 < var31[var38]) {
                            var31[var38] = var42;
                        }
                        if (var42 > var32[var38]) {
                            var32[var38] = var42;
                        }
                        if (var43 < var33[var38]) {
                            var33[var38] = var43;
                        }
                        if (var43 > var34[var38]) {
                            var34[var38] = var43;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var44 = 0; var44 < var28; var44++) {
                byte var45 = arg0.field668[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field671[var44];
                        if (var46 == 0) {
                            var47 = 1.0F;
                            var48 = 1.0F;
                        } else if (var46 > 0) {
                            var47 = 1.0F;
                            var48 = (float) var46 / 1024.0F;
                        } else {
                            var48 = 1.0F;
                            var47 = (float) (-var46) / 1024.0F;
                        }
                        var49 = 64.0F / (float) (arg0.field655[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field671[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field655[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field670[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field671[var44] / 1024.0F;
                        var49 = (float) arg0.field655[var44] / 1024.0F;
                        var48 = (float) arg0.field670[var44] / 1024.0F;
                    }
                    var27[var44] = method1213(arg0.field660[var44], arg0.field663[var44], arg0.field635[var44], arg0.field639[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field2478; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field627[var51] & 0xFFFF;
            short var53;
            if (arg0.field667 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field667[var51];
            }
            int var54;
            if (arg0.field631 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field631[var51];
            }
            int var55;
            if (arg0.field645 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field645[var51] & 0xFF;
            }
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            byte var62 = 0;
            byte var63 = 0;
            int var64 = 0;
            if (var53 != -1) {
                if (var54 == -1) {
                    var56 = 0.0F;
                    var57 = 1.0F;
                    var58 = 1.0F;
                    var59 = 1.0F;
                    var62 = 1;
                    var60 = 0.0F;
                    var61 = 0.0F;
                    var63 = 2;
                } else {
                    var54 &= 0xFF;
                    byte var65 = arg0.field668[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field653[var51];
                        int var67 = arg0.field636[var51];
                        int var68 = arg0.field628[var51];
                        short var69 = arg0.field660[var54];
                        short var70 = arg0.field663[var54];
                        short var71 = arg0.field635[var54];
                        float var72 = (float) arg0.field624[var69];
                        float var73 = (float) arg0.field652[var69];
                        float var74 = (float) arg0.field672[var69];
                        float var75 = (float) arg0.field624[var70] - var72;
                        float var76 = (float) arg0.field652[var70] - var73;
                        float var77 = (float) arg0.field672[var70] - var74;
                        float var78 = (float) arg0.field624[var71] - var72;
                        float var79 = (float) arg0.field652[var71] - var73;
                        float var80 = (float) arg0.field672[var71] - var74;
                        float var81 = (float) arg0.field624[var66] - var72;
                        float var82 = (float) arg0.field652[var66] - var73;
                        float var83 = (float) arg0.field672[var66] - var74;
                        float var84 = (float) arg0.field624[var67] - var72;
                        float var85 = (float) arg0.field652[var67] - var73;
                        float var86 = (float) arg0.field672[var67] - var74;
                        float var87 = (float) arg0.field624[var68] - var72;
                        float var88 = (float) arg0.field652[var68] - var73;
                        float var89 = (float) arg0.field672[var68] - var74;
                        float var90 = var76 * var80 - var77 * var79;
                        float var91 = var77 * var78 - var75 * var80;
                        float var92 = var75 * var79 - var76 * var78;
                        float var93 = var79 * var92 - var80 * var91;
                        float var94 = var80 * var90 - var78 * var92;
                        float var95 = var78 * var91 - var79 * var90;
                        float var96 = 1.0F / (var77 * var95 + var75 * var93 + var76 * var94);
                        var56 = (var83 * var95 + var81 * var93 + var82 * var94) * var96;
                        var58 = (var86 * var95 + var84 * var93 + var85 * var94) * var96;
                        var60 = (var89 * var95 + var87 * var93 + var88 * var94) * var96;
                        float var97 = var76 * var92 - var77 * var91;
                        float var98 = var77 * var90 - var75 * var92;
                        float var99 = var75 * var91 - var76 * var90;
                        float var100 = 1.0F / (var80 * var99 + var78 * var97 + var79 * var98);
                        var57 = (var83 * var99 + var81 * var97 + var82 * var98) * var100;
                        var59 = (var86 * var99 + var84 * var97 + var85 * var98) * var100;
                        var61 = (var89 * var99 + var87 * var97 + var88 * var98) * var100;
                    } else {
                        int var101 = arg0.field653[var51];
                        int var102 = arg0.field636[var51];
                        int var103 = arg0.field628[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field629[var54];
                        float var109 = (float) arg0.field651[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field670[var54] & 0xFFFF) / 1024.0F;
                            method1209(arg0.field624[var101], arg0.field652[var101], arg0.field672[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field2487;
                            var57 = field2493;
                            method1209(arg0.field624[var102], arg0.field652[var102], arg0.field672[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field2487;
                            var59 = field2493;
                            method1209(arg0.field624[var103], arg0.field652[var103], arg0.field672[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field2487;
                            var61 = field2493;
                            float var111 = var110 / 2.0F;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > var111) {
                                    var58 -= var110;
                                    var62 = 1;
                                } else if (var56 - var58 > var111) {
                                    var58 += var110;
                                    var62 = 2;
                                }
                                if (var60 - var56 > var111) {
                                    var60 -= var110;
                                    var63 = 1;
                                } else if (var56 - var60 > var111) {
                                    var60 += var110;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > var111) {
                                    var59 -= var110;
                                    var62 = 1;
                                } else if (var57 - var59 > var111) {
                                    var59 += var110;
                                    var62 = 2;
                                }
                                if (var61 - var57 > var111) {
                                    var61 -= var110;
                                    var63 = 1;
                                } else if (var57 - var61 > var111) {
                                    var61 += var110;
                                    var63 = 2;
                                }
                            }
                        } else if (var65 == 2) {
                            float var112 = (float) arg0.field664[var54] / 256.0F;
                            float var113 = (float) arg0.field623[var54] / 256.0F;
                            int var114 = arg0.field624[var102] - arg0.field624[var101];
                            int var115 = arg0.field652[var102] - arg0.field652[var101];
                            int var116 = arg0.field672[var102] - arg0.field672[var101];
                            int var117 = arg0.field624[var103] - arg0.field624[var101];
                            int var118 = arg0.field652[var103] - arg0.field652[var101];
                            int var119 = arg0.field672[var103] - arg0.field672[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field671[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field655[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field670[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method1195(var126, var127, var128);
                            method1198(arg0.field624[var101], arg0.field652[var101], arg0.field672[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field2489;
                            var57 = field2492;
                            method1198(arg0.field624[var102], arg0.field652[var102], arg0.field672[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field2489;
                            var59 = field2492;
                            method1198(arg0.field624[var103], arg0.field652[var103], arg0.field672[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field2489;
                            var61 = field2492;
                        } else if (var65 == 3) {
                            method1207(arg0.field624[var101], arg0.field652[var101], arg0.field672[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field2490;
                            var57 = field2484;
                            method1207(arg0.field624[var102], arg0.field652[var102], arg0.field672[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field2490;
                            var59 = field2484;
                            method1207(arg0.field624[var103], arg0.field652[var103], arg0.field672[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field2490;
                            var61 = field2484;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > 0.5F) {
                                    var58--;
                                    var62 = 1;
                                } else if (var56 - var58 > 0.5F) {
                                    var58++;
                                    var62 = 2;
                                }
                                if (var60 - var56 > 0.5F) {
                                    var60--;
                                    var63 = 1;
                                } else if (var56 - var60 > 0.5F) {
                                    var60++;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > 0.5F) {
                                    var59--;
                                    var62 = 1;
                                } else if (var57 - var59 > 0.5F) {
                                    var59++;
                                    var62 = 2;
                                }
                                if (var61 - var57 > 0.5F) {
                                    var61--;
                                    var63 = 1;
                                } else if (var57 - var61 > 0.5F) {
                                    var61++;
                                    var63 = 2;
                                }
                            }
                        }
                    }
                }
            }
            arg0.method384();
            byte var129;
            if (arg0.field669 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field669[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field653[var51];
                class150 var133 = arg0.field657[var132];
                this.field2437[var50] = this.method1200(arg0, var132, var130, var133.field2269, var133.field2270, var133.field2275, var133.field2266, var56, var57);
                int var134 = arg0.field636[var51];
                class150 var135 = arg0.field657[var134];
                this.field2465[var50] = this.method1200(arg0, var134, (long) var62 + var130, var135.field2269, var135.field2270, var135.field2275, var135.field2266, var58, var59);
                int var136 = arg0.field628[var51];
                class150 var137 = arg0.field657[var136];
                this.field2463[var50] = this.method1200(arg0, var136, (long) var63 + var130, var137.field2269, var137.field2270, var137.field2275, var137.field2266, var60, var61);
            } else if (var129 == 1) {
                class244 var138 = arg0.field646[var51];
                long var139 = (long) ((var54 << 2) + (var138.field3674 > 0 ? 1024 : 2048) + (var138.field3679 + 256 << 12) + (var138.field3676 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field2437[var50] = this.method1200(arg0, arg0.field653[var51], var139, var138.field3674, var138.field3679, var138.field3676, 0, var56, var57);
                this.field2465[var50] = this.method1200(arg0, arg0.field636[var51], (long) var62 + var139, var138.field3674, var138.field3679, var138.field3676, 0, var58, var59);
                this.field2463[var50] = this.method1200(arg0, arg0.field628[var51], (long) var63 + var139, var138.field3674, var138.field3679, var138.field3676, 0, var60, var61);
            }
            if (arg0.field667 == null) {
                this.field2454[var50] = -1;
            } else {
                this.field2454[var50] = arg0.field667[var51];
            }
            if (this.field2440 != null) {
                this.field2440[var50] = (byte) arg0.field633[var51];
            }
            this.field2460[var50] = arg0.field627[var51];
            if (arg0.field645 != null) {
                this.field2469[var50] = arg0.field645[var51];
            }
            if (arg0.field654 != null) {
                this.field2475[var50] = arg0.field654[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field2478; var143++) {
            short var144 = this.field2454[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field2467 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field2478; var147++) {
            short var148 = this.field2454[var147];
            if (var146 != var148) {
                this.field2467[var145++] = var147;
                var146 = var148;
            }
        }
        this.field2467[var145] = this.field2478;
        field2457 = null;
        this.field2444 = method1187(this.field2444, this.field2442);
        this.field2441 = method1187(this.field2441, this.field2442);
        this.field2436 = method1187(this.field2436, this.field2442);
        this.field2447 = method1187(this.field2447, this.field2442);
        this.field2434 = method1199(this.field2434, this.field2442);
        this.field2459 = method1199(this.field2459, this.field2442);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 1904)
    private static final void method1198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var12 + arg7[1] * (float) var13;
        float var16 = arg7[5] * (float) var14 + arg7[3] * (float) var12 + arg7[4] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var12 + arg7[7] * (float) var13;
        float var18;
        float var19;
        if (arg6 == 0) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg6 == 1) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var18 = arg9 + 0.5F - var15;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 3) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 4) {
            var18 = arg11 + var17 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else {
            var18 = arg11 + 0.5F - var17;
            var19 = arg10 + 0.5F - var16;
        }
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        field2489 = var18;
        field2492 = var19;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([FI)[F", line = 1983)
    private static final float[] method1199(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class151.method1114(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!df", name = "k", descriptor = "()I", line = 1988)
    public final int method29() {
        if (!this.field2443.field4749) {
            this.method1203();
        }
        return this.field2443.field4748;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lcg;IJIIIIFF)S", line = 1996)
    private final short method1200(class42 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field2456[arg1];
        int var12 = this.field2456[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field2449[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field2457[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field2449[var13] = (short) (this.field2442 + 1);
        field2457[var13] = arg2;
        this.field2444[this.field2442] = (short) arg3;
        this.field2441[this.field2442] = (short) arg4;
        this.field2436[this.field2442] = (short) arg5;
        this.field2447[this.field2442] = (short) arg6;
        this.field2434[this.field2442] = arg7;
        this.field2459[this.field2442] = arg8;
        return (short) (this.field2442++);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIII)Z", line = 2031)
    private final boolean method1201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZZZZZZZZZZZ)Ldf;", line = 2047)
    public final class165 method1202(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class165 var12 = new class165();
        var12.field2438 = this.field2438;
        var12.field2442 = this.field2442;
        var12.field2478 = this.field2478;
        if (arg0) {
            var12.field2446 = this.field2446;
            var12.field2455 = this.field2455;
        } else {
            var12.field2446 = class106.method815(this.field2446, -1786);
            var12.field2455 = class106.method815(this.field2455, -1786);
        }
        if (arg1) {
            var12.field2473 = this.field2473;
        } else {
            var12.field2473 = class106.method815(this.field2473, -1786);
        }
        if (arg0 && arg1) {
            var12.field2466 = this.field2466;
            var12.field2443 = this.field2443;
        } else {
            var12.field2466 = new class320();
            var12.field2443 = new class303();
        }
        if (arg2) {
            var12.field2460 = this.field2460;
        } else {
            var12.field2460 = class95.method750(this.field2460, (byte) -12);
        }
        if (arg3) {
            var12.field2469 = this.field2469;
        } else {
            var12.field2469 = class142.method1072(true, this.field2469);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class175.field2589) {
            var12.field2451 = new class320();
        } else {
            var12.field2451 = this.field2451;
        }
        if (arg5) {
            var12.field2444 = this.field2444;
            var12.field2441 = this.field2441;
            var12.field2436 = this.field2436;
            var12.field2447 = this.field2447;
        } else {
            var12.field2444 = class95.method750(this.field2444, (byte) -12);
            var12.field2441 = class95.method750(this.field2441, (byte) -12);
            var12.field2436 = class95.method750(this.field2436, (byte) -12);
            var12.field2447 = class95.method750(this.field2447, (byte) -12);
        }
        if (!class175.field2589) {
            var12.field2435 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field2435 = this.field2435;
        } else {
            var12.field2435 = new class320();
        }
        if (arg8) {
            var12.field2434 = this.field2434;
            var12.field2459 = this.field2459;
            var12.field2445 = this.field2445;
        } else {
            var12.field2434 = class51.method470(this.field2434, (byte) 62);
            var12.field2459 = class51.method470(this.field2459, (byte) 109);
            var12.field2445 = new class320();
        }
        if (arg9) {
            var12.field2437 = this.field2437;
            var12.field2465 = this.field2465;
            var12.field2463 = this.field2463;
            var12.field2439 = this.field2439;
        } else {
            var12.field2437 = class95.method750(this.field2437, (byte) -12);
            var12.field2465 = class95.method750(this.field2465, (byte) -12);
            var12.field2463 = class95.method750(this.field2463, (byte) -12);
            var12.field2439 = new class320();
        }
        if (arg10) {
            var12.field2454 = this.field2454;
        } else {
            var12.field2454 = class95.method750(this.field2454, (byte) -12);
        }
        var12.field2464 = this.field2464;
        var12.field2452 = this.field2452;
        var12.field2440 = this.field2440;
        var12.field2474 = this.field2474;
        var12.field2467 = this.field2467;
        var12.field2449 = this.field2449;
        var12.field2456 = this.field2456;
        var12.field2477 = this.field2477;
        var12.field2468 = this.field2468;
        var12.field2453 = this.field2453;
        var12.field2475 = this.field2475;
        return var12;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "()V", line = 2186)
    public final void method9() {
        for (int var1 = 0; var1 < this.field2438; var1++) {
            int var2 = this.field2446[var1];
            this.field2446[var1] = this.field2455[var1];
            this.field2455[var1] = -var2;
        }
        this.field2443.field4749 = false;
        this.field2466.field4989 = false;
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "()V", line = 2206)
    public final void method14() {
        for (int var1 = 0; var1 < this.field2438; var1++) {
            int var2 = this.field2455[var1];
            this.field2455[var1] = this.field2446[var1];
            this.field2446[var1] = -var2;
        }
        this.field2443.field4749 = false;
        this.field2466.field4989 = false;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(ZZZ)Laj;", line = 2220)
    public final class1 method30(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1196(arg0, arg1, arg2, field2476, field2471);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I[IIIIZ)V", line = 2226)
    public final void method8(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field2494 = 0;
            field2485 = 0;
            field2488 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field2452.length) {
                    int[] var14 = this.field2452[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field2494 += this.field2446[var16];
                        field2485 += this.field2473[var16];
                        field2488 += this.field2455[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field2494 = field2494 / var11 + var8;
                field2485 = field2485 / var11 + var9;
                field2488 = field2488 / var11 + var10;
            } else {
                field2494 = var8;
                field2485 = var9;
                field2488 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field2452.length) {
                    int[] var22 = this.field2452[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field2446[var24] += var17;
                        this.field2473[var24] += var18;
                        this.field2455[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field2452.length) {
                    int[] var27 = this.field2452[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field2446[var29] -= field2494;
                        this.field2473[var29] -= field2485;
                        this.field2455[var29] -= field2488;
                        if (arg4 != 0) {
                            int var30 = class56.field838[arg4];
                            int var31 = class56.field830[arg4];
                            int var32 = this.field2473[var29] * var30 + this.field2446[var29] * var31 + 32767 >> 16;
                            this.field2473[var29] = this.field2473[var29] * var31 + 32767 - this.field2446[var29] * var30 >> 16;
                            this.field2446[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class56.field838[arg2];
                            int var34 = class56.field830[arg2];
                            int var35 = this.field2473[var29] * var34 + 32767 - this.field2455[var29] * var33 >> 16;
                            this.field2455[var29] = this.field2473[var29] * var33 + this.field2455[var29] * var34 + 32767 >> 16;
                            this.field2473[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class56.field838[arg3];
                            int var37 = class56.field830[arg3];
                            int var38 = this.field2455[var29] * var36 + this.field2446[var29] * var37 + 32767 >> 16;
                            this.field2455[var29] = this.field2455[var29] * var37 + 32767 - this.field2446[var29] * var36 >> 16;
                            this.field2446[var29] = var38;
                        }
                        this.field2446[var29] += field2494;
                        this.field2473[var29] += field2485;
                        this.field2455[var29] += field2488;
                    }
                }
            }
            if (arg5 && this.field2444 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field2452.length) {
                        int[] var41 = this.field2452[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field2456[var43];
                            int var45 = this.field2456[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field2449[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class56.field838[arg4];
                                    int var49 = class56.field830[arg4];
                                    int var50 = this.field2444[var47] * var49 + this.field2441[var47] * var48 + 32767 >> 16;
                                    this.field2441[var47] = (short) (this.field2441[var47] * var49 + 32767 - this.field2444[var47] * var48 >> 16);
                                    this.field2444[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class56.field838[arg2];
                                    int var52 = class56.field830[arg2];
                                    int var53 = this.field2441[var47] * var52 + 32767 - this.field2436[var47] * var51 >> 16;
                                    this.field2436[var47] = (short) (this.field2441[var47] * var51 + this.field2436[var47] * var52 + 32767 >> 16);
                                    this.field2441[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class56.field838[arg3];
                                    int var55 = class56.field830[arg3];
                                    int var56 = this.field2444[var47] * var55 + this.field2436[var47] * var54 + 32767 >> 16;
                                    this.field2436[var47] = (short) (this.field2436[var47] * var55 + 32767 - this.field2444[var47] * var54 >> 16);
                                    this.field2444[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field2435 != null) {
                    this.field2435.field4989 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field2452.length) {
                    int[] var59 = this.field2452[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field2446[var61] -= field2494;
                        this.field2473[var61] -= field2485;
                        this.field2455[var61] -= field2488;
                        this.field2446[var61] = this.field2446[var61] * arg2 >> 7;
                        this.field2473[var61] = this.field2473[var61] * arg3 >> 7;
                        this.field2455[var61] = this.field2455[var61] * arg4 >> 7;
                        this.field2446[var61] += field2494;
                        this.field2473[var61] += field2485;
                        this.field2455[var61] += field2488;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field2474 != null && this.field2469 != null) {
                for (int var62 = 0; var62 < var7; var62++) {
                    int var63 = arg1[var62];
                    if (var63 < this.field2474.length) {
                        int[] var64 = this.field2474[var63];
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            int var66 = var64[var65];
                            int var67 = (this.field2469[var66] & 0xFF) + arg2 * 8;
                            if (var67 < 0) {
                                var67 = 0;
                            } else if (var67 > 255) {
                                var67 = 255;
                            }
                            this.field2469[var66] = (byte) var67;
                        }
                        if (var64.length > 0) {
                            this.field2451.field4989 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field2474 != null) {
            for (int var68 = 0; var68 < var7; var68++) {
                int var69 = arg1[var68];
                if (var69 < this.field2474.length) {
                    int[] var70 = this.field2474[var69];
                    for (int var71 = 0; var71 < var70.length; var71++) {
                        int var72 = var70[var71];
                        int var73 = this.field2460[var72] & 0xFFFF;
                        int var74 = var73 >> 10 & 0x3F;
                        int var75 = var73 >> 7 & 0x7;
                        int var76 = var73 & 0x7F;
                        int var77 = arg2 + var74 & 0x3F;
                        int var78 = arg3 / 4 + var75;
                        if (var78 < 0) {
                            var78 = 0;
                        } else if (var78 > 7) {
                            var78 = 7;
                        }
                        int var79 = arg4 + var76;
                        if (var79 < 0) {
                            var79 = 0;
                        } else if (var79 > 127) {
                            var79 = 127;
                        }
                        this.field2460[var72] = (short) (var77 << 10 | var78 << 7 | var79);
                    }
                    if (var70.length > 0) {
                        this.field2451.field4989 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIIIJILt;)V", line = 2640)
    public final void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class254 arg10) {
        if (this.field2442 == 0) {
            return;
        }
        if (!this.field2443.field4749) {
            this.method1203();
        }
        short var13 = this.field2443.field4748;
        short var14 = this.field2443.field4743;
        short var15 = this.field2443.field4745;
        int var16 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var17 = arg1 * arg6 + arg2 * var16 >> 16;
        int var18 = (arg1 * var15 + arg2 * var13 >> 16) + var17;
        if (var18 <= 50) {
            return;
        }
        int var19 = (-var13 * arg2 + arg1 * var14 >> 16) + var17;
        if (var19 >= 3584) {
            return;
        }
        int var20 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var21 = var13 + var20 << 9;
        if (var21 / var18 <= class288.field4476) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class307.field4796) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class257.field3834) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class142.field2202) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class56.field838[arg0];
            var27 = class56.field830[arg0];
        }
        if (arg8 > 0L && class152.field2287 && var19 > 0) {
            int var28;
            int var29;
            if (var20 > 0) {
                var28 = var22 / var18;
                var29 = var21 / var19;
            } else {
                var28 = var22 / var19;
                var29 = var21 / var18;
            }
            int var30;
            int var31;
            if (var23 > 0) {
                var30 = var25 / var18;
                var31 = var24 / var19;
            } else {
                var30 = var25 / var19;
                var31 = var24 / var18;
            }
            if (class77.field1092 >= var28 && class77.field1092 <= var29 && class15.field177 >= var30 && class15.field177 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field2443.field4744;
                short var37 = this.field2443.field4746;
                short var38 = this.field2443.field4747;
                short var39 = this.field2443.field4750;
                int[] var40 = new int[] { var36, var37, var36, var37, var36, var37, var36, var37 };
                int[] var41 = new int[] { var38, var38, var39, var39, var38, var38, var39, var39 };
                int[] var42 = new int[] { var14, var14, var14, var14, var15, var15, var15, var15 };
                for (int var43 = 0; var43 < 8; var43++) {
                    int var44 = var40[var43];
                    int var45 = var42[var43];
                    int var46 = var41[var43];
                    if (arg0 != 0) {
                        int var47 = var26 * var46 + var27 * var44 >> 16;
                        var46 = var27 * var46 - var26 * var44 >> 16;
                        var44 = var47;
                    }
                    int var48 = arg5 + var44;
                    int var49 = arg6 + var45;
                    int var50 = arg7 + var46;
                    int var51 = arg3 * var50 + arg4 * var48 >> 16;
                    int var52 = arg4 * var50 - arg3 * var48 >> 16;
                    int var54 = arg2 * var49 - arg1 * var52 >> 16;
                    int var55 = arg1 * var49 + arg2 * var52 >> 16;
                    if (var55 > 0) {
                        int var57 = (var51 << 9) / var55;
                        int var58 = (var54 << 9) / var55;
                        if (var57 < var32) {
                            var32 = var57;
                        }
                        if (var57 > var33) {
                            var33 = var57;
                        }
                        if (var58 < var34) {
                            var34 = var58;
                        }
                        if (var58 > var35) {
                            var35 = var58;
                        }
                    }
                }
                if (class77.field1092 >= var32 && class77.field1092 <= var33 && class15.field177 >= var34 && class15.field177 <= var35) {
                    if (this.field1) {
                        class245.field3699[class49.field763++] = arg8;
                    } else {
                        if (field2491.length < this.field2442) {
                            field2491 = new int[this.field2442];
                            field2483 = new int[this.field2442];
                        }
                        int var59 = 0;
                        label118: while (true) {
                            if (var59 >= this.field2438) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field2478) {
                                        break label118;
                                    }
                                    short var80 = this.field2437[var79];
                                    short var81 = this.field2465[var79];
                                    short var82 = this.field2463[var79];
                                    if (this.method1201(class77.field1092, class15.field177, field2483[var80], field2483[var81], field2483[var82], field2491[var80], field2491[var81], field2491[var82])) {
                                        class245.field3699[class49.field763++] = arg8;
                                        break label118;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field2446[var59];
                            int var61 = this.field2473[var59];
                            int var62 = this.field2455[var59];
                            if (arg0 != 0) {
                                int var63 = var26 * var62 + var27 * var60 >> 16;
                                var62 = var27 * var62 - var26 * var60 >> 16;
                                var60 = var63;
                            }
                            int var64 = arg5 + var60;
                            int var65 = arg6 + var61;
                            int var66 = arg7 + var62;
                            int var67 = arg3 * var66 + arg4 * var64 >> 16;
                            int var68 = arg4 * var66 - arg3 * var64 >> 16;
                            int var70 = arg2 * var65 - arg1 * var68 >> 16;
                            int var71 = arg1 * var65 + arg2 * var68 >> 16;
                            if (var71 < 50) {
                                break;
                            }
                            int var73 = (var67 << 9) / var71;
                            int var74 = (var70 << 9) / var71;
                            int var75 = this.field2456[var59];
                            int var76 = this.field2456[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field2449[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field2491[var78] = var73;
                                field2483[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class36.field518;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method1192();
        var83.glPopMatrix();
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "()V", line = 2914)
    public final void method5() {
        for (int var1 = 0; var1 < this.field2438; var1++) {
            this.field2446[var1] = -this.field2446[var1];
            this.field2455[var1] = -this.field2455[var1];
        }
        this.field2443.field4749 = false;
        this.field2466.field4989 = false;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZZZ)Laj;", line = 2926)
    public final class1 method15(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1196(arg0, arg1, arg2, field2482, field2481);
    }

    @OriginalMember(owner = "client!df", name = "t", descriptor = "()V", line = 2930)
    private final void method1203() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field2438; var9++) {
            int var10 = this.field2446[var9];
            int var11 = this.field2473[var9];
            int var12 = this.field2455[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field2443.field4744 = (short) var1;
        this.field2443.field4746 = (short) var4;
        this.field2443.field4743 = (short) var2;
        this.field2443.field4745 = (short) var5;
        this.field2443.field4747 = (short) var3;
        this.field2443.field4750 = (short) var6;
        this.field2443.field4748 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field2443.field4749 = true;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lom;)Lom;", line = 2999)
    public final class70 method1204(class70 arg0) {
        if (this.field2442 == 0) {
            return null;
        }
        if (!this.field2443.field4749) {
            this.method1203();
        }
        int var2;
        int var3;
        if (class264.field3946 > 0) {
            var2 = this.field2443.field4744 - (class264.field3946 * this.field2443.field4745 >> 8) >> 3;
            var3 = this.field2443.field4746 - (class264.field3946 * this.field2443.field4743 >> 8) >> 3;
        } else {
            var2 = this.field2443.field4744 - (class264.field3946 * this.field2443.field4743 >> 8) >> 3;
            var3 = this.field2443.field4746 - (class264.field3946 * this.field2443.field4745 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class264.field3945 > 0) {
            var4 = this.field2443.field4747 - (class264.field3945 * this.field2443.field4745 >> 8) >> 3;
            var5 = this.field2443.field4750 - (class264.field3945 * this.field2443.field4743 >> 8) >> 3;
        } else {
            var4 = this.field2443.field4747 - (class264.field3945 * this.field2443.field4743 >> 8) >> 3;
            var5 = this.field2443.field4750 - (class264.field3945 * this.field2443.field4745 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class70 var8;
        if (arg0 == null || arg0.field1021.length < var6 * var7) {
            var8 = new class70(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field4582 = arg0.field4579 = var6;
            arg0.field4578 = arg0.field4595 = var7;
            arg0.method584();
        }
        var8.field4589 = var2;
        var8.field4583 = var4;
        if (field2491.length < this.field2442) {
            field2491 = new int[this.field2442];
            field2483 = new int[this.field2442];
        }
        for (int var9 = 0; var9 < this.field2438; var9++) {
            int var10 = (this.field2446[var9] - (this.field2473[var9] * class264.field3946 >> 8) >> 3) - var2;
            int var11 = (this.field2455[var9] - (this.field2473[var9] * class264.field3945 >> 8) >> 3) - var4;
            int var12 = this.field2456[var9];
            int var13 = this.field2456[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field2449[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field2491[var15] = var10;
                field2483[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field2478; var16++) {
            if (this.field2469[var16] <= 128) {
                short var17 = this.field2437[var16];
                short var18 = this.field2465[var16];
                short var19 = this.field2463[var16];
                int var20 = field2491[var17];
                int var21 = field2491[var18];
                int var22 = field2491[var19];
                int var23 = field2483[var17];
                int var24 = field2483[var18];
                int var25 = field2483[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class56.method504(var8.field1021, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "()I", line = 3122)
    public final int method12() {
        if (!this.field2443.field4749) {
            this.method1203();
        }
        return this.field2443.field4747;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(SS)V", line = 3134)
    public final void method1205(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2478; var3++) {
            if (this.field2454[var3] == arg0) {
                this.field2454[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class56.field829.method1740(83, arg0 & 0xFFFF);
            var5 = class56.field829.method1745(false, arg0 & 0xFFFF);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class56.field829.method1740(115, arg1 & 0xFFFF);
            var7 = class56.field829.method1745(false, arg1 & 0xFFFF);
        }
        if (var4 != var6 || var5 != var7) {
            this.field2451.field4989 = false;
        }
    }

    @OriginalMember(owner = "client!df", name = "u", descriptor = "()V", line = 3168)
    public static void method1206() {
        field2457 = null;
        field2461 = null;
        field2472 = null;
        field2471 = null;
        field2476 = null;
        field2479 = null;
        field2480 = null;
        field2481 = null;
        field2482 = null;
        field2491 = null;
        field2483 = null;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V", line = 3182)
    public final void method4(int arg0) {
        int var2 = class56.field838[arg0];
        int var3 = class56.field830[arg0];
        for (int var4 = 0; var4 < this.field2438; var4++) {
            int var5 = this.field2473[var4] * var3 - this.field2455[var4] * var2 >> 16;
            this.field2455[var4] = this.field2473[var4] * var2 + this.field2455[var4] * var3 >> 16;
            this.field2473[var4] = var5;
        }
        this.field2443.field4749 = false;
        this.field2466.field4989 = false;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIII[FIF)V", line = 3202)
    private static final void method1207(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
        int var9 = arg0 - arg3;
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg5;
        float var12 = arg6[2] * (float) var11 + arg6[0] * (float) var9 + arg6[1] * (float) var10;
        float var13 = arg6[5] * (float) var11 + arg6[3] * (float) var9 + arg6[4] * (float) var10;
        float var14 = arg6[8] * (float) var11 + arg6[6] * (float) var9 + arg6[7] * (float) var10;
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        float var17 = (float) Math.asin((double) (var13 / var15)) / 3.1415927F + arg8 + 0.5F;
        if (arg7 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg7 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field2490 = var16;
        field2484 = var17;
    }

    @OriginalMember(owner = "client!df", name = "v", descriptor = "()I", line = 3247)
    public final int method1208() {
        return this.field2468;
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "()I", line = 3250)
    public final int method17() {
        if (!this.field2443.field4749) {
            this.method1203();
        }
        return this.field2443.field4750;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIII[FFIF)V", line = 3256)
    private static final void method1209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg1 - arg4;
        int var12 = arg2 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
        float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
        float var16 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var16 = arg7 * var16;
        }
        float var17 = var14 + arg9 + 0.5F;
        if (arg8 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg8 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field2487 = var16;
        field2493 = var17;
    }

    @OriginalMember(owner = "client!df", name = "w", descriptor = "()V", line = 3303)
    public final void method1210() {
        if (this.field2444 == null) {
            this.method9();
            return;
        }
        for (int var1 = 0; var1 < this.field2438; var1++) {
            int var2 = this.field2446[var1];
            this.field2446[var1] = this.field2455[var1];
            this.field2455[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field2442; var3++) {
            short var4 = this.field2444[var3];
            this.field2444[var3] = this.field2436[var3];
            this.field2436[var3] = (short) (-var4);
        }
        this.field2443.field4749 = false;
        this.field2466.field4989 = false;
        if (this.field2435 != null) {
            this.field2435.field4989 = false;
        }
    }

    @OriginalMember(owner = "client!df", name = "i", descriptor = "()I", line = 3345)
    public final int method22() {
        if (!this.field2443.field4749) {
            this.method1203();
        }
        return this.field2443.field4746;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I[IIIIZI[I)V", line = 3353)
    public final void method10(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            field2494 = 0;
            field2485 = 0;
            field2488 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field2452.length) {
                    int[] var16 = this.field2452[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field2453 == null || (arg6 & this.field2453[var18]) != 0) {
                            field2494 += this.field2446[var18];
                            field2485 += this.field2473[var18];
                            field2488 += this.field2455[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                field2494 = field2494 / var13 + var10;
                field2485 = field2485 / var13 + var11;
                field2488 = field2488 / var13 + var12;
                field2486 = true;
            } else {
                field2494 = var10;
                field2485 = var11;
                field2488 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 16384 >> 15;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 16384 >> 15;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 16384 >> 15;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field2452.length) {
                    int[] var27 = this.field2452[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field2453 == null || (arg6 & this.field2453[var29]) != 0) {
                            this.field2446[var29] += var22;
                            this.field2473[var29] += var23;
                            this.field2455[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field2452.length) {
                        int[] var92 = this.field2452[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field2453 == null || (arg6 & this.field2453[var94]) != 0) {
                                this.field2446[var94] -= field2494;
                                this.field2473[var94] -= field2485;
                                this.field2455[var94] -= field2488;
                                if (arg4 != 0) {
                                    int var95 = class56.field838[arg4];
                                    int var96 = class56.field830[arg4];
                                    int var97 = this.field2473[var94] * var95 + this.field2446[var94] * var96 + 32767 >> 16;
                                    this.field2473[var94] = this.field2473[var94] * var96 + 32767 - this.field2446[var94] * var95 >> 16;
                                    this.field2446[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = class56.field838[arg2];
                                    int var99 = class56.field830[arg2];
                                    int var100 = this.field2473[var94] * var99 + 32767 - this.field2455[var94] * var98 >> 16;
                                    this.field2455[var94] = this.field2473[var94] * var98 + this.field2455[var94] * var99 + 32767 >> 16;
                                    this.field2473[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = class56.field838[arg3];
                                    int var102 = class56.field830[arg3];
                                    int var103 = this.field2455[var94] * var101 + this.field2446[var94] * var102 + 32767 >> 16;
                                    this.field2455[var94] = this.field2455[var94] * var102 + 32767 - this.field2446[var94] * var101 >> 16;
                                    this.field2446[var94] = var103;
                                }
                                this.field2446[var94] += field2494;
                                this.field2473[var94] += field2485;
                                this.field2455[var94] += field2488;
                            }
                        }
                    }
                }
                if (arg5 && this.field2444 != null) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field2452.length) {
                            int[] var106 = this.field2452[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field2453 == null || (arg6 & this.field2453[var108]) != 0) {
                                    int var109 = this.field2456[var108];
                                    int var110 = this.field2456[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field2449[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = class56.field838[arg4];
                                            int var114 = class56.field830[arg4];
                                            int var115 = this.field2444[var112] * var114 + this.field2441[var112] * var113 + 32767 >> 16;
                                            this.field2441[var112] = (short) (this.field2441[var112] * var114 + 32767 - this.field2444[var112] * var113 >> 16);
                                            this.field2444[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = class56.field838[arg2];
                                            int var117 = class56.field830[arg2];
                                            int var118 = this.field2441[var112] * var117 + 32767 - this.field2436[var112] * var116 >> 16;
                                            this.field2436[var112] = (short) (this.field2441[var112] * var116 + this.field2436[var112] * var117 + 32767 >> 16);
                                            this.field2441[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = class56.field838[arg3];
                                            int var120 = class56.field830[arg3];
                                            int var121 = this.field2444[var112] * var120 + this.field2436[var112] * var119 + 32767 >> 16;
                                            this.field2436[var112] = (short) (this.field2436[var112] * var120 + 32767 - this.field2444[var112] * var119 >> 16);
                                            this.field2444[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field2435 != null) {
                        this.field2435.field4989 = false;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (field2486) {
                    int var36 = arg7[6] * field2488 + arg7[0] * field2494 + arg7[3] * field2485 + 16384 >> 15;
                    int var37 = arg7[7] * field2488 + arg7[1] * field2494 + arg7[4] * field2485 + 16384 >> 15;
                    int var38 = arg7[8] * field2488 + arg7[2] * field2494 + arg7[5] * field2485 + 16384 >> 15;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    field2494 = var39;
                    field2485 = var40;
                    field2488 = var41;
                    field2486 = false;
                }
                int[] var42 = new int[9];
                int var43 = class56.field830[arg2] >> 1;
                int var44 = class56.field838[arg2] >> 1;
                int var45 = class56.field830[arg3] >> 1;
                int var46 = class56.field838[arg3] >> 1;
                int var47 = class56.field830[arg4] >> 1;
                int var48 = class56.field838[arg4] >> 1;
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[5] = -var44;
                var42[6] = -var46 * var47 + var45 * var50 + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                int var51 = var42[2] * -field2488 + var42[0] * -field2494 + var42[1] * -field2485 + 16384 >> 15;
                int var52 = var42[5] * -field2488 + var42[3] * -field2494 + var42[4] * -field2485 + 16384 >> 15;
                int var53 = var42[8] * -field2488 + var42[6] * -field2494 + var42[7] * -field2485 + 16384 >> 15;
                int var54 = field2494 + var51;
                int var55 = field2485 + var52;
                int var56 = field2488 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var59 = 0; var59 < 3; var59++) {
                        int var60 = 0;
                        for (int var61 = 0; var61 < 3; var61++) {
                            var60 += var42[var58 * 3 + var61] * arg7[var59 * 3 + var61];
                        }
                        var57[var58 * 3 + var59] = var60 + 16384 >> 15;
                    }
                }
                int var62 = var42[2] * var35 + var42[0] * var33 + var42[1] * var34 + 16384 >> 15;
                int var63 = var42[5] * var35 + var42[3] * var33 + var42[4] * var34 + 16384 >> 15;
                int var64 = var42[8] * var35 + var42[6] * var33 + var42[7] * var34 + 16384 >> 15;
                int var65 = var54 + var62;
                int var66 = var55 + var63;
                int var67 = var56 + var64;
                int[] var68 = new int[9];
                for (int var69 = 0; var69 < 3; var69++) {
                    for (int var70 = 0; var70 < 3; var70++) {
                        int var71 = 0;
                        for (int var72 = 0; var72 < 3; var72++) {
                            var71 += arg7[var69 * 3 + var72] * var57[var72 * 3 + var70];
                        }
                        var68[var69 * 3 + var70] = var71 + 16384 >> 15;
                    }
                }
                int var73 = arg7[2] * var67 + arg7[0] * var65 + arg7[1] * var66 + 16384 >> 15;
                int var74 = arg7[5] * var67 + arg7[3] * var65 + arg7[4] * var66 + 16384 >> 15;
                int var75 = arg7[8] * var67 + arg7[6] * var65 + arg7[7] * var66 + 16384 >> 15;
                int var76 = var30 + var73;
                int var77 = var31 + var74;
                int var78 = var32 + var75;
                for (int var79 = 0; var79 < var9; var79++) {
                    int var80 = arg1[var79];
                    if (var80 < this.field2452.length) {
                        int[] var81 = this.field2452[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field2453 == null || (arg6 & this.field2453[var83]) != 0) {
                                int var84 = this.field2455[var83] * var68[2] + this.field2473[var83] * var68[1] + this.field2446[var83] * var68[0] + 16384 >> 15;
                                int var85 = this.field2455[var83] * var68[5] + this.field2473[var83] * var68[4] + this.field2446[var83] * var68[3] + 16384 >> 15;
                                int var86 = this.field2455[var83] * var68[8] + this.field2473[var83] * var68[7] + this.field2446[var83] * var68[6] + 16384 >> 15;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field2446[var83] = var87;
                                this.field2473[var83] = var88;
                                this.field2455[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field2452.length) {
                        int[] var174 = this.field2452[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field2453 == null || (arg6 & this.field2453[var176]) != 0) {
                                this.field2446[var176] -= field2494;
                                this.field2473[var176] -= field2485;
                                this.field2455[var176] -= field2488;
                                this.field2446[var176] = this.field2446[var176] * arg2 >> 7;
                                this.field2473[var176] = this.field2473[var176] * arg3 >> 7;
                                this.field2455[var176] = this.field2455[var176] * arg4 >> 7;
                                this.field2446[var176] += field2494;
                                this.field2473[var176] += field2485;
                                this.field2455[var176] += field2488;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (field2486) {
                    int var128 = arg7[6] * field2488 + arg7[0] * field2494 + arg7[3] * field2485 + 16384 >> 15;
                    int var129 = arg7[7] * field2488 + arg7[1] * field2494 + arg7[4] * field2485 + 16384 >> 15;
                    int var130 = arg7[8] * field2488 + arg7[2] * field2494 + arg7[5] * field2485 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    field2494 = var131;
                    field2485 = var132;
                    field2488 = var133;
                    field2486 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -field2494 * var134 + 16384 >> 15;
                int var138 = -field2485 * var135 + 16384 >> 15;
                int var139 = -field2488 * var136 + 16384 >> 15;
                int var140 = field2494 + var137;
                int var141 = field2485 + var138;
                int var142 = field2488 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var127 * var136 + 16384 >> 15;
                int var147 = var140 + var144;
                int var148 = var141 + var145;
                int var149 = var142 + var146;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var152 = 0; var152 < 3; var152++) {
                        int var153 = 0;
                        for (int var154 = 0; var154 < 3; var154++) {
                            var153 += arg7[var151 * 3 + var154] * var143[var154 * 3 + var152];
                        }
                        var150[var151 * 3 + var152] = var153 + 16384 >> 15;
                    }
                }
                int var155 = arg7[2] * var149 + arg7[0] * var147 + arg7[1] * var148 + 16384 >> 15;
                int var156 = arg7[5] * var149 + arg7[3] * var147 + arg7[4] * var148 + 16384 >> 15;
                int var157 = arg7[8] * var149 + arg7[6] * var147 + arg7[7] * var148 + 16384 >> 15;
                int var158 = var122 + var155;
                int var159 = var123 + var156;
                int var160 = var124 + var157;
                for (int var161 = 0; var161 < var9; var161++) {
                    int var162 = arg1[var161];
                    if (var162 < this.field2452.length) {
                        int[] var163 = this.field2452[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field2453 == null || (arg6 & this.field2453[var165]) != 0) {
                                int var166 = this.field2455[var165] * var150[2] + this.field2473[var165] * var150[1] + this.field2446[var165] * var150[0] + 16384 >> 15;
                                int var167 = this.field2455[var165] * var150[5] + this.field2473[var165] * var150[4] + this.field2446[var165] * var150[3] + 16384 >> 15;
                                int var168 = this.field2455[var165] * var150[8] + this.field2473[var165] * var150[7] + this.field2446[var165] * var150[6] + 16384 >> 15;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field2446[var165] = var169;
                                this.field2473[var165] = var170;
                                this.field2455[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field2474 != null && this.field2469 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var178 = arg1[var177];
                    if (var178 < this.field2474.length) {
                        int[] var179 = this.field2474[var178];
                        for (int var180 = 0; var180 < var179.length; var180++) {
                            int var181 = var179[var180];
                            if (this.field2475 == null || (arg6 & this.field2475[var181]) != 0) {
                                int var182 = (this.field2469[var181] & 0xFF) + arg2 * 8;
                                if (var182 < 0) {
                                    var182 = 0;
                                } else if (var182 > 255) {
                                    var182 = 255;
                                }
                                this.field2469[var181] = (byte) var182;
                            }
                        }
                        if (var179.length > 0) {
                            this.field2451.field4989 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field2474 != null) {
            for (int var183 = 0; var183 < var9; var183++) {
                int var184 = arg1[var183];
                if (var184 < this.field2474.length) {
                    int[] var185 = this.field2474[var184];
                    for (int var186 = 0; var186 < var185.length; var186++) {
                        int var187 = var185[var186];
                        if (this.field2475 == null || (arg6 & this.field2475[var187]) != 0) {
                            int var188 = this.field2460[var187] & 0xFFFF;
                            int var189 = var188 >> 10 & 0x3F;
                            int var190 = var188 >> 7 & 0x7;
                            int var191 = var188 & 0x7F;
                            int var192 = arg2 + var189 & 0x3F;
                            int var193 = arg3 / 4 + var190;
                            if (var193 < 0) {
                                var193 = 0;
                            } else if (var193 > 7) {
                                var193 = 7;
                            }
                            int var194 = arg4 + var191;
                            if (var194 < 0) {
                                var194 = 0;
                            } else if (var194 > 127) {
                                var194 = 127;
                            }
                            this.field2460[var187] = (short) (var192 << 10 | var193 << 7 | var194);
                        }
                    }
                    if (var185.length > 0) {
                        this.field2451.field4989 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(III)V", line = 4145)
    public final void method32(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2438; var4++) {
            this.field2446[var4] += arg0;
            this.field2473[var4] += arg1;
            this.field2455[var4] += arg2;
        }
        this.field2443.field4749 = false;
        this.field2466.field4989 = false;
    }

    @OriginalMember(owner = "client!df", name = "x", descriptor = "()V", line = 4162)
    private final void method1211() {
        if (field2461.field437.length < this.field2442 * 12) {
            field2461 = new class35((this.field2442 + 100) * 12);
        } else {
            field2461.field455 = 0;
        }
        if (class36.field510) {
            for (int var1 = 0; var1 < this.field2478; var1++) {
                field2461.method259(-15195, this.field2437[var1]);
                field2461.method259(-15195, this.field2465[var1]);
                field2461.method259(-15195, this.field2463[var1]);
            }
        } else {
            for (int var2 = 0; var2 < this.field2478; var2++) {
                field2461.method276(this.field2437[var2], false);
                field2461.method276(this.field2465[var2], false);
                field2461.method276(this.field2463[var2], false);
            }
        }
        if (!class36.field529) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field2461.field455);
            var5.put(field2461.field437, 0, field2461.field455);
            var5.flip();
            this.field2439.field4989 = true;
            this.field2439.field4984 = var5;
            this.field2439.field4982 = null;
            return;
        }
        class296 var3 = new class296();
        ByteBuffer var4 = ByteBuffer.wrap(field2461.field437, 0, field2461.field455);
        var3.method2089(var4);
        this.field2439.field4989 = true;
        this.field2439.field4984 = null;
        this.field2439.field4982 = var3;
    }

    @OriginalMember(owner = "client!df", name = "l", descriptor = "()Z", line = 4220)
    public final boolean method31() {
        if (this.field2452 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field2438; var1++) {
            this.field2446[var1] <<= 0x4;
            this.field2473[var1] <<= 0x4;
            this.field2455[var1] <<= 0x4;
        }
        field2494 = 0;
        field2485 = 0;
        field2488 = 0;
        return true;
    }

    @OriginalMember(owner = "client!df", name = "j", descriptor = "()I", line = 4246)
    public final int method25() {
        if (!this.field2443.field4749) {
            this.method1203();
        }
        return this.field2443.field4744;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILdf;[[I[[IIII)V", line = 4257)
    public final void method1212(int arg0, int arg1, class165 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field2443.field4749) {
            arg2.method1203();
        }
        int var9 = arg2.field2443.field4744 + arg5;
        int var10 = arg2.field2443.field4746 + arg5;
        int var11 = arg2.field2443.field4747 + arg7;
        int var12 = arg2.field2443.field4750 + arg7;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg4 == null) {
                return;
            }
            if (var9 < 0 || var10 + 128 >> 7 >= arg4.length || var11 < 0 || var12 + 128 >> 7 >= arg4[0].length) {
                return;
            }
        } else {
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            int var15 = var11 >> 7;
            int var16 = var12 + 127 >> 7;
            if (arg3[var13][var15] == arg6 && arg3[var14][var15] == arg6 && arg3[var13][var16] == arg6 && arg3[var14][var16] == arg6) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var17 = 0; var17 < this.field2438; var17++) {
                int var18 = this.field2446[var17] + arg5;
                int var19 = this.field2455[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field2473[var17] = this.field2473[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field2443.field4743;
            for (int var28 = 0; var28 < this.field2438; var28++) {
                int var29 = (this.field2473[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field2446[var28] + arg5;
                    int var31 = this.field2455[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field2473[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method27(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field2443.field4745 - arg2.field2443.field4743;
            for (int var42 = 0; var42 < this.field2438; var42++) {
                int var43 = this.field2446[var42] + arg5;
                int var44 = this.field2455[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field2473[var42] = var51 + this.field2473[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field2443.field4745 - arg2.field2443.field4743;
            for (int var53 = 0; var53 < this.field2438; var53++) {
                int var54 = this.field2446[var53] + arg5;
                int var55 = this.field2455[var53] + arg7;
                int var56 = var54 & 0x7F;
                int var57 = var55 & 0x7F;
                int var58 = var54 >> 7;
                int var59 = var55 >> 7;
                int var60 = (128 - var56) * arg3[var58][var59] + arg3[var58 + 1][var59] * var56 >> 7;
                int var61 = (128 - var56) * arg3[var58][var59 + 1] + arg3[var58 + 1][var59 + 1] * var56 >> 7;
                int var62 = (128 - var57) * var60 + var57 * var61 >> 7;
                int var63 = (128 - var56) * arg4[var58][var59] + arg4[var58 + 1][var59] * var56 >> 7;
                int var64 = (128 - var56) * arg4[var58][var59 + 1] + arg4[var58 + 1][var59 + 1] * var56 >> 7;
                int var65 = (128 - var57) * var63 + var57 * var64 >> 7;
                int var66 = var62 - var65;
                this.field2473[var53] = ((this.field2473[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field2466.field4989 = false;
        this.field2443.field4749 = false;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIFFF)[F", line = 4458)
    private static final float[] method1213(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float[] var8 = new float[9];
        float var9 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var10 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var11 = 1.0F - var9;
        var7[0] = var9;
        var7[1] = 0.0F;
        var7[2] = var10;
        var7[3] = 0.0F;
        var7[4] = 1.0F;
        var7[5] = 0.0F;
        var7[6] = -var10;
        var7[7] = 0.0F;
        var7[8] = var9;
        float[] var12 = new float[9];
        float var13 = 1.0F;
        float var14 = 0.0F;
        float var15 = (float) arg1 / 32767.0F;
        float var16 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var17 = 1.0F - var15;
        float var18 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var18 == 0.0F && var15 == 0.0F) {
            var8 = var7;
        } else {
            if (var18 != 0.0F) {
                var13 = (float) (-arg2) / var18;
                var14 = (float) arg0 / var18;
            }
            var12[0] = var13 * var13 * var17 + var15;
            var12[1] = var14 * var16;
            var12[2] = var13 * var14 * var17;
            var12[3] = -var14 * var16;
            var12[4] = var15;
            var12[5] = var13 * var16;
            var12[6] = var13 * var14 * var17;
            var12[7] = -var13 * var16;
            var12[8] = var14 * var14 * var17 + var15;
            var8[0] = var7[2] * var12[6] + var7[0] * var12[0] + var7[1] * var12[3];
            var8[1] = var7[2] * var12[7] + var7[0] * var12[1] + var7[1] * var12[4];
            var8[2] = var7[2] * var12[8] + var7[0] * var12[2] + var7[1] * var12[5];
            var8[3] = var7[5] * var12[6] + var7[3] * var12[0] + var7[4] * var12[3];
            var8[4] = var7[5] * var12[7] + var7[3] * var12[1] + var7[4] * var12[4];
            var8[5] = var7[5] * var12[8] + var7[3] * var12[2] + var7[4] * var12[5];
            var8[6] = var7[8] * var12[6] + var7[6] * var12[0] + var7[7] * var12[3];
            var8[7] = var7[8] * var12[7] + var7[6] * var12[1] + var7[7] * var12[4];
            var8[8] = var7[8] * var12[8] + var7[6] * var12[2] + var7[7] * var12[5];
        }
        var8[0] *= arg4;
        var8[1] *= arg4;
        var8[2] *= arg4;
        var8[3] *= arg5;
        var8[4] *= arg5;
        var8[5] *= arg5;
        var8[6] *= arg6;
        var8[7] *= arg6;
        var8[8] *= arg6;
        return var8;
    }
}
