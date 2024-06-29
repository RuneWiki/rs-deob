import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class152 extends class266 {

    @OriginalMember(owner = "client!e", name = "A", descriptor = "B")
    private byte field2550 = 0;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    private int field2551 = 0;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "B")
    private byte field2558 = 0;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    private int field2540 = 0;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "I")
    public int field2554 = 0;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "Z")
    public boolean field2566 = false;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "[I")
    private int[] field2561;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "[I")
    public int[] field2568;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "[I")
    public int[] field2547;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "[I")
    public int[] field2563;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "[I")
    private int[] field2541;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "[S")
    private short[] field2567;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "[S")
    private short[] field2542;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "[S")
    private short[] field2569;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "[S")
    private short[] field2534;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "[F")
    private float[] field2535;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "[F")
    private float[] field2536;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "[S")
    private short[] field2537;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "[B")
    private byte[] field2533;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "[S")
    private short[] field2556;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "[S")
    private short[] field2562;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "[S")
    private short[] field2539;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "[S")
    private short[] field2565;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "[B")
    private byte[] field2532;

    @OriginalMember(owner = "client!e", name = "kb", descriptor = "Lmi;")
    public class260 field2586;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "Lfd;")
    public class235 field2544;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "Lfd;")
    private class235 field2555;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "Lfd;")
    private class235 field2545;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "Lfd;")
    private class235 field2549;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "Lfd;")
    private class235 field2560;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "S")
    private short field2543;

    @OriginalMember(owner = "client!e", name = "H", descriptor = "S")
    private short field2557;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "[S")
    private short[] field2553;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "[I")
    private int[] field2546;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "Lsd;")
    private static class26 field2538 = new class26(10000);

    @OriginalMember(owner = "client!e", name = "W", descriptor = "Le;")
    private static class152 field2572 = new class152();

    @OriginalMember(owner = "client!e", name = "X", descriptor = "Le;")
    private static class152 field2573 = new class152();

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "Le;")
    private static class152 field2574 = new class152();

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "Le;")
    private static class152 field2575 = new class152();

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "[I")
    private static int[] field2578 = new int[1];

    @OriginalMember(owner = "client!e", name = "gb", descriptor = "[I")
    private static int[] field2582 = new int[1];

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "F")
    private static float field2576;

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "F")
    private static float field2577;

    @OriginalMember(owner = "client!e", name = "eb", descriptor = "F")
    private static float field2580;

    @OriginalMember(owner = "client!e", name = "hb", descriptor = "F")
    private static float field2583;

    @OriginalMember(owner = "client!e", name = "jb", descriptor = "F")
    private static float field2585;

    @OriginalMember(owner = "client!e", name = "lb", descriptor = "F")
    private static float field2587;

    @OriginalMember(owner = "client!e", name = "db", descriptor = "I")
    private static int field2579;

    @OriginalMember(owner = "client!e", name = "fb", descriptor = "I")
    private static int field2581;

    @OriginalMember(owner = "client!e", name = "ib", descriptor = "I")
    private static int field2584;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "Lt;")
    private class245 field2564;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "Lgm;")
    private class283 field2559;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2570;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "[J")
    private static long[] field2548;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "[[I")
    private int[][] field2552;

    @OriginalMember(owner = "client!e", name = "V", descriptor = "[[I")
    private int[][] field2571;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "()V", line = 7)
    public final void method1135() {
        for (int var1 = 0; var1 < this.field2554; var1++) {
            this.field2568[var1] = -this.field2568[var1];
            this.field2563[var1] = -this.field2563[var1];
        }
        this.field2586.field4378 = false;
        this.field2544.field3854 = false;
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "()I", line = 19)
    public final int method1136() {
        if (!this.field2586.field4378) {
            this.method1152();
        }
        return this.field2586.field4379;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZZLe;Le;)Lrf;", line = 27)
    private final class266 method1137(boolean arg0, boolean arg1, class152 arg2, class152 arg3) {
        arg2.field2554 = this.field2554;
        arg2.field2540 = this.field2540;
        arg2.field2551 = this.field2551;
        arg2.field2543 = this.field2543;
        arg2.field2557 = this.field2557;
        arg2.field2550 = (byte) ((arg0 ? 0 : 2) | 0x1 | (arg1 ? 0 : 4));
        if (arg2.field2568 == null || arg2.field2568.length < this.field2554) {
            arg2.field2568 = new int[this.field2554 + 100];
            arg2.field2547 = new int[this.field2554 + 100];
            arg2.field2563 = new int[this.field2554 + 100];
        }
        for (int var5 = 0; var5 < this.field2554; var5++) {
            arg2.field2568[var5] = this.field2568[var5];
            arg2.field2547[var5] = this.field2547[var5];
            arg2.field2563[var5] = this.field2563[var5];
        }
        if (arg2.field2544 == null) {
            arg2.field2544 = new class235();
        }
        arg2.field2544.field3854 = false;
        if (arg2.field2586 == null) {
            arg2.field2586 = new class260();
        }
        arg2.field2586.field4378 = false;
        if (arg0) {
            arg2.field2533 = this.field2533;
            arg2.field2555 = this.field2555;
        } else {
            if (arg3.field2533 == null || arg3.field2533.length < this.field2551) {
                arg3.field2533 = new byte[this.field2551 + 100];
            }
            arg2.field2533 = arg3.field2533;
            for (int var6 = 0; var6 < this.field2551; var6++) {
                arg2.field2533[var6] = this.field2533[var6];
            }
            if (arg3.field2555 == null) {
                arg3.field2555 = new class235();
            }
            arg2.field2555 = arg3.field2555;
            arg2.field2555.field3854 = false;
        }
        if (arg1) {
            arg2.field2567 = this.field2567;
            arg2.field2542 = this.field2542;
            arg2.field2569 = this.field2569;
            arg2.field2534 = this.field2534;
            arg2.field2545 = this.field2545;
        } else {
            if (arg3.field2567 == null || arg3.field2567.length < this.field2540) {
                arg3.field2567 = new short[this.field2540 + 100];
                arg3.field2542 = new short[this.field2540 + 100];
                arg3.field2569 = new short[this.field2540 + 100];
                arg3.field2534 = new short[this.field2540 + 100];
            }
            arg2.field2567 = arg3.field2567;
            arg2.field2542 = arg3.field2542;
            arg2.field2569 = arg3.field2569;
            arg2.field2534 = arg3.field2534;
            for (int var7 = 0; var7 < this.field2540; var7++) {
                arg2.field2567[var7] = this.field2567[var7];
                arg2.field2542[var7] = this.field2542[var7];
                arg2.field2569[var7] = this.field2569[var7];
                arg2.field2534[var7] = this.field2534[var7];
            }
            if (class1.field8) {
                if (arg3.field2545 == null) {
                    arg3.field2545 = new class235();
                }
                arg2.field2545 = arg3.field2545;
                arg2.field2545.field3854 = false;
            } else {
                arg2.field2545 = null;
            }
        }
        arg2.field2535 = this.field2535;
        arg2.field2536 = this.field2536;
        arg2.field2541 = this.field2541;
        arg2.field2571 = this.field2571;
        arg2.field2537 = this.field2537;
        arg2.field2556 = this.field2556;
        arg2.field2562 = this.field2562;
        arg2.field2539 = this.field2539;
        arg2.field2565 = this.field2565;
        arg2.field2532 = this.field2532;
        arg2.field2552 = this.field2552;
        arg2.field2549 = this.field2549;
        arg2.field2560 = this.field2560;
        arg2.field2546 = this.field2546;
        arg2.field2553 = this.field2553;
        arg2.field2561 = this.field2561;
        arg2.field4451 = this.field4451;
        return arg2;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lwa;IZ)V", line = 151)
    public final void method1138(class76 arg0, int arg1, boolean arg2) {
        if (this.field2571 == null || arg1 == -1) {
            return;
        }
        class215 var4 = arg0.field1311[arg1];
        class110 var5 = var4.field3598;
        for (int var6 = 0; var6 < this.field2554; var6++) {
            this.field2568[var6] <<= 0x4;
            this.field2547[var6] <<= 0x4;
            this.field2563[var6] <<= 0x4;
        }
        field2579 = 0;
        field2581 = 0;
        field2584 = 0;
        for (int var7 = 0; var7 < var4.field3597; var7++) {
            short var8 = var4.field3593[var7];
            if (var4.field3600[var7] != -1) {
                this.method1177(0, var5.field1919[var4.field3600[var7]], 0, 0, 0, arg2);
            }
            this.method1177(var5.field1932[var8], var5.field1919[var8], var4.field3594[var7], var4.field3605[var7], var4.field3601[var7], arg2);
        }
        for (int var9 = 0; var9 < this.field2554; var9++) {
            this.field2568[var9] >>= 0x4;
            this.field2547[var9] >>= 0x4;
            this.field2563[var9] >>= 0x4;
        }
        this.field2586.field4378 = false;
        this.field2544.field3854 = false;
    }

    @OriginalMember(owner = "client!e", name = "k", descriptor = "()I", line = 204)
    public final int method1139() {
        return this.field2557;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 207)
    private static final void method1140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
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
        field2583 = var18;
        field2576 = var19;
    }

    @OriginalMember(owner = "client!e", name = "l", descriptor = "()V", line = 285)
    public final void method1141() {
        if (this.field2567 == null) {
            this.method1135();
            return;
        }
        for (int var1 = 0; var1 < this.field2554; var1++) {
            this.field2568[var1] = -this.field2568[var1];
            this.field2563[var1] = -this.field2563[var1];
        }
        for (int var2 = 0; var2 < this.field2540; var2++) {
            this.field2567[var2] = (short) (-this.field2567[var2]);
            this.field2569[var2] = (short) (-this.field2569[var2]);
        }
        this.field2586.field4378 = false;
        this.field2544.field3854 = false;
        if (this.field2545 != null) {
            this.field2545.field3854 = false;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ISIB)I", line = 320)
    private static final int method1142(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class203.field3212[class175.method1277(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class203.field3217.method574(arg1 & 0xFFFF, -51);
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
            int var9 = class203.field3217.method569(-39, arg1 & 0xFFFF);
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

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V", line = 381)
    public final void method1143(int arg0) {
        if (this.field2567 == null) {
            this.method1148(arg0);
            return;
        }
        int var2 = class203.field3208[arg0];
        int var3 = class203.field3216[arg0];
        for (int var4 = 0; var4 < this.field2554; var4++) {
            int var5 = this.field2568[var4] * var3 + this.field2563[var4] * var2 >> 16;
            this.field2563[var4] = this.field2563[var4] * var3 - this.field2568[var4] * var2 >> 16;
            this.field2568[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field2540; var6++) {
            int var7 = this.field2569[var6] * var2 + this.field2567[var6] * var3 >> 16;
            this.field2569[var6] = (short) (this.field2569[var6] * var3 - this.field2567[var6] * var2 >> 16);
            this.field2567[var6] = (short) var7;
        }
        this.field2586.field4378 = false;
        this.field2544.field3854 = false;
        if (this.field2545 != null) {
            this.field2545.field3854 = false;
        }
    }

    @OriginalMember(owner = "client!e", name = "j", descriptor = "()V", line = 424)
    public final void method1144() {
        for (int var1 = 0; var1 < this.field2554; var1++) {
            int var2 = this.field2563[var1];
            this.field2563[var1] = this.field2568[var1];
            this.field2568[var1] = -var2;
        }
        this.field2586.field4378 = false;
        this.field2544.field3854 = false;
    }

    @OriginalMember(owner = "client!e", name = "i", descriptor = "()V", line = 440)
    public final void method1145() {
        for (int var1 = 0; var1 < this.field2554; var1++) {
            int var2 = this.field2568[var1];
            this.field2568[var1] = this.field2563[var1];
            this.field2563[var1] = -var2;
        }
        this.field2586.field4378 = false;
        this.field2544.field3854 = false;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)V", line = 454)
    private final void method1146(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field2579 = 0;
            field2581 = 0;
            field2584 = 0;
            for (int var6 = 0; var6 < this.field2554; var6++) {
                field2579 += this.field2568[var6];
                field2581 += this.field2547[var6];
                field2584 += this.field2563[var6];
                var5++;
            }
            if (var5 > 0) {
                field2579 = field2579 / var5 + arg1;
                field2581 = field2581 / var5 + arg2;
                field2584 = field2584 / var5 + arg3;
            } else {
                field2579 = arg1;
                field2581 = arg2;
                field2584 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field2554; var7++) {
                this.field2568[var7] += arg1;
                this.field2547[var7] += arg2;
                this.field2563[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field2554; var8++) {
                this.field2568[var8] -= field2579;
                this.field2547[var8] -= field2581;
                this.field2563[var8] -= field2584;
                if (arg3 != 0) {
                    int var9 = class203.field3208[arg3];
                    int var10 = class203.field3216[arg3];
                    int var11 = this.field2568[var8] * var10 + this.field2547[var8] * var9 + 32767 >> 16;
                    this.field2547[var8] = this.field2547[var8] * var10 + 32767 - this.field2568[var8] * var9 >> 16;
                    this.field2568[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class203.field3208[arg1];
                    int var13 = class203.field3216[arg1];
                    int var14 = this.field2547[var8] * var13 + 32767 - this.field2563[var8] * var12 >> 16;
                    this.field2563[var8] = this.field2563[var8] * var13 + this.field2547[var8] * var12 + 32767 >> 16;
                    this.field2547[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class203.field3208[arg2];
                    int var16 = class203.field3216[arg2];
                    int var17 = this.field2568[var8] * var16 + this.field2563[var8] * var15 + 32767 >> 16;
                    this.field2563[var8] = this.field2563[var8] * var16 + 32767 - this.field2568[var8] * var15 >> 16;
                    this.field2568[var8] = var17;
                }
                this.field2568[var8] += field2579;
                this.field2547[var8] += field2581;
                this.field2563[var8] += field2584;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field2554; var18++) {
                this.field2568[var18] -= field2579;
                this.field2547[var18] -= field2581;
                this.field2563[var18] -= field2584;
                this.field2568[var18] = this.field2568[var18] * arg1 / 128;
                this.field2547[var18] = this.field2547[var18] * arg2 / 128;
                this.field2563[var18] = this.field2563[var18] * arg3 / 128;
                this.field2568[var18] += field2579;
                this.field2547[var18] += field2581;
                this.field2563[var18] += field2584;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field2551; var19++) {
                int var20 = (this.field2533[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field2533[var19] = (byte) var20;
            }
            this.field2555.field3854 = false;
        }
    }

    @OriginalMember(owner = "client!e", name = "m", descriptor = "()I", line = 608)
    public final int method1147() {
        return this.field2543;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V", line = 612)
    public final void method1148(int arg0) {
        int var2 = class203.field3208[arg0];
        int var3 = class203.field3216[arg0];
        for (int var4 = 0; var4 < this.field2554; var4++) {
            int var5 = this.field2568[var4] * var3 + this.field2563[var4] * var2 >> 16;
            this.field2563[var4] = this.field2563[var4] * var3 - this.field2568[var4] * var2 >> 16;
            this.field2568[var4] = var5;
        }
        this.field2586.field4378 = false;
        this.field2544.field3854 = false;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "()I", line = 631)
    public final int method1149() {
        if (!this.field2586.field4378) {
            this.method1152();
        }
        return this.field2586.field4374;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(III)V", line = 640)
    public final void method1150(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2554; var4++) {
            this.field2568[var4] += arg0;
            this.field2547[var4] += arg1;
            this.field2563[var4] += arg2;
        }
        this.field2586.field4378 = false;
        this.field2544.field3854 = false;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lal;IJIIIIFF)S", line = 655)
    private final short method1151(class311 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field2561[arg1];
        int var12 = this.field2561[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field2553[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field2548[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field2553[var13] = (short) (this.field2540 + 1);
        field2548[var13] = arg2;
        this.field2567[this.field2540] = (short) arg3;
        this.field2542[this.field2540] = (short) arg4;
        this.field2569[this.field2540] = (short) arg5;
        this.field2534[this.field2540] = (short) arg6;
        this.field2535[this.field2540] = arg7;
        this.field2536[this.field2540] = arg8;
        return (short) (this.field2540++);
    }

    @OriginalMember(owner = "client!e", name = "n", descriptor = "()V", line = 692)
    private final void method1152() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field2554; var9++) {
            int var10 = this.field2568[var9];
            int var11 = this.field2547[var9];
            int var12 = this.field2563[var9];
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
        this.field2586.field4379 = (short) var1;
        this.field2586.field4375 = (short) var4;
        this.field2586.field4380 = (short) var2;
        this.field2586.field4376 = (short) var5;
        this.field2586.field4377 = (short) var3;
        this.field2586.field4381 = (short) var6;
        this.field2586.field4374 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field2586.field4378 = true;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)Lbg;", line = 761)
    public final class196 method1153(int arg0, int arg1, int arg2) {
        this.field2566 = false;
        if (this.field2559 != null) {
            this.field2567 = this.field2559.field4761;
            this.field2542 = this.field2559.field4760;
            this.field2569 = this.field2559.field4759;
            this.field2534 = this.field2559.field4758;
            this.field2559 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "()I", line = 774)
    public final int method1154() {
        if (!this.field2586.field4378) {
            this.method1152();
        }
        return this.field2586.field4375;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V", line = 782)
    public final void method1155(int arg0) {
        int var2 = class203.field3208[arg0];
        int var3 = class203.field3216[arg0];
        for (int var4 = 0; var4 < this.field2554; var4++) {
            int var5 = this.field2547[var4] * var3 - this.field2563[var4] * var2 >> 16;
            this.field2563[var4] = this.field2563[var4] * var3 + this.field2547[var4] * var2 >> 16;
            this.field2547[var4] = var5;
        }
        this.field2586.field4378 = false;
        this.field2544.field3854 = false;
    }

    @OriginalMember(owner = "client!e", name = "o", descriptor = "()V", line = 802)
    public final void method1156() {
        if (this.field2567 == null) {
            this.method1144();
            return;
        }
        for (int var1 = 0; var1 < this.field2554; var1++) {
            int var2 = this.field2563[var1];
            this.field2563[var1] = this.field2568[var1];
            this.field2568[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field2540; var3++) {
            short var4 = this.field2569[var3];
            this.field2569[var3] = this.field2567[var3];
            this.field2567[var3] = (short) (-var4);
        }
        this.field2586.field4378 = false;
        this.field2544.field3854 = false;
        if (this.field2545 != null) {
            this.field2545.field3854 = false;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lwa;I)V", line = 839)
    public final void method1157(class76 arg0, int arg1) {
        if (this.field2571 == null || arg1 == -1) {
            return;
        }
        class215 var3 = arg0.field1311[arg1];
        class110 var4 = var3.field3598;
        field2579 = 0;
        field2581 = 0;
        field2584 = 0;
        for (int var5 = 0; var5 < var3.field3597; var5++) {
            short var6 = var3.field3593[var5];
            if (var4.field1927[var6]) {
                if (var3.field3600[var5] != -1) {
                    this.method1146(0, 0, 0, 0);
                }
                this.method1146(var4.field1932[var6], var3.field3594[var5], var3.field3605[var5], var3.field3601[var5]);
            }
        }
        this.field2544.field3854 = false;
        this.field2586.field4378 = false;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V", line = 877)
    public final void method1158(int arg0) {
        int var2 = class203.field3208[arg0];
        int var3 = class203.field3216[arg0];
        for (int var4 = 0; var4 < this.field2554; var4++) {
            int var5 = this.field2568[var4] * var3 + this.field2547[var4] * var2 >> 16;
            this.field2547[var4] = this.field2547[var4] * var3 - this.field2568[var4] * var2 >> 16;
            this.field2568[var4] = var5;
        }
        this.field2586.field4378 = false;
        this.field2544.field3854 = false;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lbg;IIIZ)V", line = 898)
    public final void method1159(class196 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class152 var6 = (class152) arg0;
        if (this.field2551 == 0 || var6.field2551 == 0) {
            return;
        }
        int var7 = var6.field2554;
        int[] var8 = var6.field2568;
        int[] var9 = var6.field2547;
        int[] var10 = var6.field2563;
        short[] var11 = var6.field2567;
        short[] var12 = var6.field2542;
        short[] var13 = var6.field2569;
        short[] var14 = var6.field2534;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field2559 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field2559.field4761;
            var16 = this.field2559.field4760;
            var17 = this.field2559.field4759;
            var18 = this.field2559.field4758;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field2559 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field2559.field4761;
            var20 = var6.field2559.field4760;
            var21 = var6.field2559.field4759;
            var22 = var6.field2559.field4758;
        }
        int[] var23 = var6.field2561;
        short[] var24 = var6.field2553;
        if (!var6.field2586.field4378) {
            var6.method1152();
        }
        short var25 = var6.field2586.field4380;
        short var26 = var6.field2586.field4376;
        short var27 = var6.field2586.field4379;
        short var28 = var6.field2586.field4375;
        short var29 = var6.field2586.field4377;
        short var30 = var6.field2586.field4381;
        for (int var31 = 0; var31 < this.field2554; var31++) {
            int var32 = this.field2547[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field2568[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field2563[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field2561[var31];
                        int var37 = this.field2561[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field2553[var38] - 1;
                            if (var35 == -1 || this.field2534[var35] != 0) {
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
                                            this.field2559 = new class283();
                                            var15 = this.field2559.field4761 = class41.method383(false, this.field2567);
                                            var16 = this.field2559.field4760 = class41.method383(false, this.field2542);
                                            var17 = this.field2559.field4759 = class41.method383(false, this.field2569);
                                            var18 = this.field2559.field4758 = class41.method383(false, this.field2534);
                                        }
                                        if (var19 == null) {
                                            class283 var44 = var6.field2559 = new class283();
                                            var19 = var44.field4761 = class41.method383(false, var11);
                                            var20 = var44.field4760 = class41.method383(false, var12);
                                            var21 = var44.field4759 = class41.method383(false, var13);
                                            var22 = var44.field4758 = class41.method383(false, var14);
                                        }
                                        short var45 = this.field2567[var35];
                                        short var46 = this.field2542[var35];
                                        short var47 = this.field2569[var35];
                                        short var48 = this.field2534[var35];
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
                                        int var57 = this.field2561[var31];
                                        int var58 = this.field2561[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field2553[var59] - 1;
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

    @OriginalMember(owner = "client!e", name = "p", descriptor = "()V", line = 1136)
    private final void method1160() {
        GL var1 = class21.field377;
        if (this.field2551 == 0) {
            return;
        }
        if (this.field2550 != 0) {
            this.method1164(true, !this.field2544.field3854 && (this.field2550 & 0x1) != 0, !this.field2555.field3854 && (this.field2550 & 0x2) != 0, this.field2545 != null && !this.field2545.field3854 && (this.field2550 & 0x4) != 0, false);
        }
        this.method1164(false, !this.field2544.field3854, !this.field2555.field3854, this.field2545 != null && !this.field2545.field3854, !this.field2549.field3854);
        if (!this.field2560.field3854) {
            this.method1175();
        }
        if (this.field2558 != 0) {
            if ((this.field2558 & 0x1) != 0) {
                this.field2568 = null;
                this.field2547 = null;
                this.field2563 = null;
                this.field2553 = null;
                this.field2561 = null;
            }
            if ((this.field2558 & 0x2) != 0) {
                this.field2537 = null;
                this.field2533 = null;
            }
            if ((this.field2558 & 0x4) != 0) {
                this.field2567 = null;
                this.field2542 = null;
                this.field2569 = null;
                this.field2534 = null;
            }
            if ((this.field2558 & 0x8) != 0) {
                this.field2535 = null;
                this.field2536 = null;
            }
            if ((this.field2558 & 0x10) != 0) {
                this.field2556 = null;
                this.field2562 = null;
                this.field2539 = null;
            }
            this.field2558 = 0;
        }
        class245 var2 = null;
        if (this.field2544.field3849 != null) {
            this.field2544.field3849.method1738();
            var2 = this.field2544.field3849;
            var1.glVertexPointer(3, 5126, this.field2544.field3850, (long) this.field2544.field3857);
        }
        if (this.field2555.field3849 != null) {
            if (this.field2555.field3849 != var2) {
                this.field2555.field3849.method1738();
                var2 = this.field2555.field3849;
            }
            var1.glColorPointer(4, 5121, this.field2555.field3850, (long) this.field2555.field3857);
        }
        if (class1.field8 && this.field2545.field3849 != null) {
            if (this.field2545.field3849 != var2) {
                this.field2545.field3849.method1738();
                var2 = this.field2545.field3849;
            }
            var1.glNormalPointer(5126, this.field2545.field3850, (long) this.field2545.field3857);
        }
        if (this.field2549.field3849 != null) {
            if (this.field2549.field3849 != var2) {
                this.field2549.field3849.method1738();
                class245 var3 = this.field2549.field3849;
            }
            var1.glTexCoordPointer(2, 5126, this.field2549.field3850, (long) this.field2549.field3857);
        }
        if (this.field2560.field3849 != null) {
            this.field2560.field3849.method1734();
        }
        if (this.field2544.field3849 == null || this.field2555.field3849 == null || class1.field8 && this.field2545.field3849 == null || this.field2549.field3849 == null) {
            if (class21.field367) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field2544.field3849 == null) {
                this.field2544.field3858.position(this.field2544.field3857);
                var1.glVertexPointer(3, 5126, this.field2544.field3850, this.field2544.field3858);
            }
            if (this.field2555.field3849 == null) {
                this.field2555.field3858.position(this.field2555.field3857);
                var1.glColorPointer(4, 5121, this.field2555.field3850, this.field2555.field3858);
            }
            if (class1.field8 && this.field2545.field3849 == null) {
                this.field2545.field3858.position(this.field2545.field3857);
                var1.glNormalPointer(5126, this.field2545.field3850, this.field2545.field3858);
            }
            if (this.field2549.field3849 == null) {
                this.field2549.field3858.position(this.field2549.field3857);
                var1.glTexCoordPointer(2, 5126, this.field2549.field3850, this.field2549.field3858);
            }
        }
        if (this.field2560.field3849 == null && class21.field367) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field2546.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field2546[var5];
            int var7 = this.field2546[var5 + 1];
            short var8 = this.field2565[var6];
            if (var8 == -1) {
                class21.method140(-1);
                class60.method504(0, 0, 20789);
            } else {
                class203.field3217.method567(10, var8 & 0xFFFF);
            }
            if (this.field2560.field3849 == null) {
                this.field2560.field3858.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field2560.field3858);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZZ)Lrf;", line = 1307)
    public final class266 method1161(boolean arg0, boolean arg1) {
        return this.method1137(arg0, arg1, field2575, field2574);
    }

    @OriginalMember(owner = "client!e", name = "q", descriptor = "()V", line = 1312)
    public final void method1162() {
        for (int var1 = 0; var1 < this.field2554; var1++) {
            this.field2563[var1] = -this.field2563[var1];
        }
        if (this.field2569 != null) {
            for (int var2 = 0; var2 < this.field2540; var2++) {
                this.field2569[var2] = (short) (-this.field2569[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field2551; var3++) {
            short var4 = this.field2556[var3];
            this.field2556[var3] = this.field2539[var3];
            this.field2539[var3] = var4;
        }
        this.field2586.field4378 = false;
        this.field2544.field3854 = false;
        if (this.field2545 != null) {
            this.field2545.field3854 = false;
        }
        this.field2560.field3854 = false;
    }

    @OriginalMember(owner = "client!e", name = "h", descriptor = "()I", line = 1351)
    public final int method1163() {
        if (!this.field2586.field4378) {
            this.method1152();
        }
        return this.field2586.field4381;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZZZZZ)V", line = 1358)
    private final void method1164(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field2544.field3857 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field2555.field3857 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field2545.field3857 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field2549.field3857 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field2538.field472.length < this.field2540 * var6) {
            field2538 = new class26((this.field2540 + 100) * var6);
        } else {
            field2538.field478 = 0;
        }
        if (arg1) {
            if (class21.field349) {
                for (int var7 = 0; var7 < this.field2554; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field2568[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field2547[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field2563[var7]);
                    int var11 = this.field2561[var7];
                    int var12 = this.field2561[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field2553[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field2538.field478 = var6 * var14;
                        field2538.method239((byte) 115, var8);
                        field2538.method239((byte) 107, var9);
                        field2538.method239((byte) 121, var10);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field2554; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field2568[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field2547[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field2563[var15]);
                    int var19 = this.field2561[var15];
                    int var20 = this.field2561[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field2553[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field2538.field478 = var6 * var22;
                        field2538.method248((byte) 117, var16);
                        field2538.method248((byte) 114, var17);
                        field2538.method248((byte) 121, var18);
                    }
                }
            }
        }
        if (arg2) {
            if (class1.field8) {
                for (int var42 = 0; var42 < this.field2551; var42++) {
                    int var43 = method1142(this.field2537[var42], this.field2565[var42], this.field2543, this.field2533[var42]);
                    field2538.field478 = this.field2556[var42] * var6 + this.field2555.field3857;
                    field2538.method239((byte) -91, var43);
                    field2538.field478 = this.field2562[var42] * var6 + this.field2555.field3857;
                    field2538.method239((byte) 113, var43);
                    field2538.field478 = this.field2539[var42] * var6 + this.field2555.field3857;
                    field2538.method239((byte) -86, var43);
                }
            } else {
                int var23 = (int) class273.field4537[0];
                int var24 = (int) class273.field4537[1];
                int var25 = (int) class273.field4537[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field2543 * 1.3F);
                int var28 = this.field2557 * var26 >> 8;
                for (int var29 = 0; var29 < this.field2551; var29++) {
                    short var30 = this.field2556[var29];
                    short var31 = this.field2534[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field2569[var30] * var25 + this.field2567[var30] * var23 + this.field2542[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field2569[var30] * var25 + this.field2567[var30] * var23 + this.field2542[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field2534[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field2562[var29];
                    short var34 = this.field2534[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field2569[var33] * var25 + this.field2567[var33] * var23 + this.field2542[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field2569[var33] * var25 + this.field2567[var33] * var23 + this.field2542[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field2534[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field2539[var29];
                    short var37 = this.field2534[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field2569[var36] * var25 + this.field2567[var36] * var23 + this.field2542[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field2569[var36] * var25 + this.field2567[var36] * var23 + this.field2542[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field2534[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method1142(this.field2537[var29], this.field2565[var29], var32, this.field2533[var29]);
                    int var40 = method1142(this.field2537[var29], this.field2565[var29], var35, this.field2533[var29]);
                    int var41 = method1142(this.field2537[var29], this.field2565[var29], var38, this.field2533[var29]);
                    field2538.field478 = var6 * var30 + this.field2555.field3857;
                    field2538.method239((byte) 101, var39);
                    field2538.field478 = var6 * var33 + this.field2555.field3857;
                    field2538.method239((byte) -26, var40);
                    field2538.field478 = var6 * var36 + this.field2555.field3857;
                    field2538.method239((byte) 93, var41);
                }
                this.field2567 = null;
                this.field2542 = null;
                this.field2569 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field2557;
            float var45 = 3.0F / (float) (this.field2557 / 2 + this.field2557);
            field2538.field478 = this.field2545.field3857;
            if (class21.field349) {
                for (int var46 = 0; var46 < this.field2540; var46++) {
                    short var47 = this.field2534[var46];
                    if (var47 == 0) {
                        field2538.method227((float) this.field2567[var46] * var45, -89);
                        field2538.method227((float) this.field2542[var46] * var45, 66);
                        field2538.method227((float) this.field2569[var46] * var45, 103);
                    } else {
                        float var48 = var44 / (float) var47;
                        field2538.method227((float) this.field2567[var46] * var48, 45);
                        field2538.method227((float) this.field2542[var46] * var48, -120);
                        field2538.method227((float) this.field2569[var46] * var48, -111);
                    }
                    field2538.field478 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field2540; var49++) {
                    short var50 = this.field2534[var49];
                    if (var50 == 0) {
                        field2538.method214(126, (float) this.field2567[var49] * var45);
                        field2538.method214(125, (float) this.field2542[var49] * var45);
                        field2538.method214(124, (float) this.field2569[var49] * var45);
                    } else {
                        float var51 = var44 / (float) var50;
                        field2538.method214(127, (float) this.field2567[var49] * var51);
                        field2538.method214(125, (float) this.field2542[var49] * var51);
                        field2538.method214(124, (float) this.field2569[var49] * var51);
                    }
                    field2538.field478 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field2538.field478 = this.field2549.field3857;
            if (class21.field349) {
                for (int var52 = 0; var52 < this.field2540; var52++) {
                    field2538.method227(this.field2535[var52], -110);
                    field2538.method227(this.field2536[var52], 74);
                    field2538.field478 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field2540; var53++) {
                    field2538.method214(126, this.field2535[var53]);
                    field2538.method214(125, this.field2536[var53]);
                    field2538.field478 += var6 - 8;
                }
            }
        }
        field2538.field478 = this.field2540 * var6;
        if (arg0) {
            if (class21.field359) {
                ByteBuffer var54 = ByteBuffer.wrap(field2538.field472, 0, field2538.field478);
                if (this.field2564 == null) {
                    this.field2564 = new class245(true);
                    this.field2564.method1736(var54);
                } else {
                    this.field2564.method1735(var54);
                }
                if (arg1) {
                    this.field2544.field3854 = true;
                    this.field2544.field3858 = null;
                    this.field2544.field3849 = this.field2564;
                    this.field2544.field3850 = var6;
                }
                if (arg2) {
                    this.field2555.field3854 = true;
                    this.field2555.field3858 = null;
                    this.field2555.field3849 = this.field2564;
                    this.field2555.field3850 = var6;
                }
                if (arg3) {
                    this.field2545.field3854 = true;
                    this.field2545.field3858 = null;
                    this.field2545.field3849 = this.field2564;
                    this.field2545.field3850 = var6;
                }
                if (arg4) {
                    this.field2549.field3854 = true;
                    this.field2549.field3858 = null;
                    this.field2549.field3849 = this.field2564;
                    this.field2549.field3850 = var6;
                }
            } else {
                if (field2570 == null || field2570.capacity() < field2538.field478) {
                    field2570 = ByteBuffer.allocateDirect(var6 * 100 + field2538.field478);
                } else {
                    field2570.clear();
                }
                field2570.put(field2538.field472, 0, field2538.field478);
                field2570.flip();
                if (arg1) {
                    this.field2544.field3854 = true;
                    this.field2544.field3858 = field2570;
                    this.field2544.field3849 = null;
                    this.field2544.field3850 = var6;
                }
                if (arg2) {
                    this.field2555.field3854 = true;
                    this.field2555.field3858 = field2570;
                    this.field2544.field3849 = null;
                    this.field2555.field3850 = var6;
                }
                if (arg3) {
                    this.field2545.field3854 = true;
                    this.field2545.field3858 = field2570;
                    this.field2545.field3849 = null;
                    this.field2545.field3850 = var6;
                }
                if (arg4) {
                    this.field2549.field3854 = true;
                    this.field2549.field3858 = field2570;
                    this.field2549.field3849 = null;
                    this.field2549.field3850 = var6;
                }
            }
        } else if (class21.field367) {
            class245 var55 = new class245();
            ByteBuffer var56 = ByteBuffer.wrap(field2538.field472, 0, field2538.field478);
            var55.method1736(var56);
            if (arg1) {
                this.field2544.field3854 = true;
                this.field2544.field3858 = null;
                this.field2544.field3849 = var55;
                this.field2544.field3850 = var6;
            }
            if (arg2) {
                this.field2555.field3854 = true;
                this.field2555.field3858 = null;
                this.field2555.field3849 = var55;
                this.field2555.field3850 = var6;
            }
            if (arg3) {
                this.field2545.field3854 = true;
                this.field2545.field3858 = null;
                this.field2545.field3849 = var55;
                this.field2545.field3850 = var6;
            }
            if (arg4) {
                this.field2549.field3854 = true;
                this.field2549.field3858 = null;
                this.field2549.field3849 = var55;
                this.field2549.field3850 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field2538.field478);
            var57.put(field2538.field472, 0, field2538.field478);
            var57.flip();
            if (arg1) {
                this.field2544.field3854 = true;
                this.field2544.field3858 = var57;
                this.field2544.field3849 = null;
                this.field2544.field3850 = var6;
            }
            if (arg2) {
                this.field2555.field3854 = true;
                this.field2555.field3858 = var57;
                this.field2544.field3849 = null;
                this.field2555.field3850 = var6;
            }
            if (arg3) {
                this.field2545.field3854 = true;
                this.field2545.field3858 = var57;
                this.field2545.field3849 = null;
                this.field2545.field3850 = var6;
            }
            if (arg4) {
                this.field2549.field3854 = true;
                this.field2549.field3858 = var57;
                this.field2549.field3849 = null;
                this.field2549.field3850 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "r", descriptor = "()V", line = 1886)
    public static void method1165() {
        field2548 = null;
        field2538 = null;
        field2570 = null;
        field2572 = null;
        field2573 = null;
        field2574 = null;
        field2575 = null;
        field2578 = null;
        field2582 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([SI)[S", line = 1900)
    private static final short[] method1166(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class234.method1628(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "()I", line = 1906)
    public final int method74() {
        if (!this.field2586.field4378) {
            this.method1152();
        }
        return this.field2586.field4380;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIII)Z", line = 1912)
    private final boolean method1167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIII)V", line = 1928)
    public final void method1168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2540 == 0) {
            return;
        }
        GL var8 = class21.field377;
        var8.glPushMatrix();
        if (arg3 != 0) {
            var8.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var8.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var8.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var8.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var8.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method1160();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIFFF)[F", line = 1952)
    private static final float[] method1169(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
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

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V", line = 3762)
    private class152() {
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lal;IIZ)V", line = 3765)
    public class152(class311 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field5221];
        this.field2561 = new int[arg0.field5232 + 1];
        for (int var6 = 0; var6 < arg0.field5221; var6++) {
            if ((arg0.field5240 == null || arg0.field5240[var6] != 2) && (arg0.field5257 == null || arg0.field5257[var6] == -1 || !class203.field3217.method572(6, arg0.field5257[var6] & 0xFFFF))) {
                var5[this.field2551++] = var6;
                this.field2561[arg0.field5254[var6]]++;
                this.field2561[arg0.field5217[var6]]++;
                this.field2561[arg0.field5239[var6]]++;
            }
        }
        long[] var7 = new long[this.field2551];
        for (int var8 = 0; var8 < this.field2551; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field5257 != null) {
                var14 = arg0.field5257[var9];
                if (var14 != -1) {
                    var12 = class203.field3217.method571((byte) -110, var14 & 0xFFFF);
                    var13 = class203.field3217.method577(-128, var14 & 0xFFFF);
                }
            }
            boolean var15 = arg0.field5256 != null && arg0.field5256[var9] != 0 || var14 != -1 && !class203.field3217.method573(var14 & 0xFFFF, -8850);
            if ((arg3 || var15) && arg0.field5248 != null) {
                var10 += arg0.field5248[var9] << 17;
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
        class159.method1220(var5, (byte) 99, var7);
        this.field2554 = arg0.field5232;
        this.field2568 = arg0.field5233;
        this.field2547 = arg0.field5213;
        this.field2563 = arg0.field5250;
        this.field2541 = arg0.field5229;
        int var20 = this.field2551 * 3;
        this.field2567 = new short[var20];
        this.field2542 = new short[var20];
        this.field2569 = new short[var20];
        this.field2534 = new short[var20];
        this.field2535 = new float[var20];
        this.field2536 = new float[var20];
        this.field2537 = new short[this.field2551];
        this.field2533 = new byte[this.field2551];
        this.field2556 = new short[this.field2551];
        this.field2562 = new short[this.field2551];
        this.field2539 = new short[this.field2551];
        this.field2565 = new short[this.field2551];
        if (arg0.field5258 != null) {
            this.field2532 = new byte[this.field2551];
        }
        this.field2586 = new class260();
        this.field2544 = new class235();
        this.field2555 = new class235();
        if (class1.field8) {
            this.field2545 = new class235();
        }
        this.field2549 = new class235();
        this.field2560 = new class235();
        this.field2543 = (short) arg1;
        this.field2557 = (short) arg2;
        this.field2553 = new short[var20];
        field2548 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field5232; var22++) {
            int var23 = this.field2561[var22];
            this.field2561[var22] = var21;
            var21 += var23;
        }
        this.field2561[arg0.field5232] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field5237 != null) {
            int var28 = arg0.field5222;
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
            for (int var36 = 0; var36 < this.field2551; var36++) {
                int var37 = var5[var36];
                if (arg0.field5237[var37] != -1) {
                    int var38 = arg0.field5237[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field5254[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field5217[var37];
                        } else {
                            var40 = arg0.field5239[var37];
                        }
                        int var41 = arg0.field5233[var40];
                        int var42 = arg0.field5213[var40];
                        int var43 = arg0.field5250[var40];
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
                byte var45 = arg0.field5255[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field5251[var44];
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
                        var49 = 64.0F / (float) (arg0.field5227[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field5251[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field5227[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field5214[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field5251[var44] / 1024.0F;
                        var49 = (float) arg0.field5227[var44] / 1024.0F;
                        var48 = (float) arg0.field5214[var44] / 1024.0F;
                    }
                    var27[var44] = method1169(arg0.field5235[var44], arg0.field5236[var44], arg0.field5220[var44], arg0.field5212[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field2551; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field5211[var51] & 0xFFFF;
            short var53;
            if (arg0.field5257 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field5257[var51];
            }
            int var54;
            if (arg0.field5237 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field5237[var51];
            }
            int var55;
            if (arg0.field5256 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field5256[var51] & 0xFF;
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
                    byte var65 = arg0.field5255[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field5254[var51];
                        int var67 = arg0.field5217[var51];
                        int var68 = arg0.field5239[var51];
                        short var69 = arg0.field5235[var54];
                        short var70 = arg0.field5236[var54];
                        short var71 = arg0.field5220[var54];
                        float var72 = (float) arg0.field5233[var69];
                        float var73 = (float) arg0.field5213[var69];
                        float var74 = (float) arg0.field5250[var69];
                        float var75 = (float) arg0.field5233[var70] - var72;
                        float var76 = (float) arg0.field5213[var70] - var73;
                        float var77 = (float) arg0.field5250[var70] - var74;
                        float var78 = (float) arg0.field5233[var71] - var72;
                        float var79 = (float) arg0.field5213[var71] - var73;
                        float var80 = (float) arg0.field5250[var71] - var74;
                        float var81 = (float) arg0.field5233[var66] - var72;
                        float var82 = (float) arg0.field5213[var66] - var73;
                        float var83 = (float) arg0.field5250[var66] - var74;
                        float var84 = (float) arg0.field5233[var67] - var72;
                        float var85 = (float) arg0.field5213[var67] - var73;
                        float var86 = (float) arg0.field5250[var67] - var74;
                        float var87 = (float) arg0.field5233[var68] - var72;
                        float var88 = (float) arg0.field5213[var68] - var73;
                        float var89 = (float) arg0.field5250[var68] - var74;
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
                        int var101 = arg0.field5254[var51];
                        int var102 = arg0.field5217[var51];
                        int var103 = arg0.field5239[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field5245[var54];
                        float var109 = (float) arg0.field5253[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field5214[var54] & 0xFFFF) / 1024.0F;
                            method1189(arg0.field5233[var101], arg0.field5213[var101], arg0.field5250[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field2585;
                            var57 = field2577;
                            method1189(arg0.field5233[var102], arg0.field5213[var102], arg0.field5250[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field2585;
                            var59 = field2577;
                            method1189(arg0.field5233[var103], arg0.field5213[var103], arg0.field5250[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field2585;
                            var61 = field2577;
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
                            float var112 = (float) arg0.field5234[var54] / 256.0F;
                            float var113 = (float) arg0.field5244[var54] / 256.0F;
                            int var114 = arg0.field5233[var102] - arg0.field5233[var101];
                            int var115 = arg0.field5213[var102] - arg0.field5213[var101];
                            int var116 = arg0.field5250[var102] - arg0.field5250[var101];
                            int var117 = arg0.field5233[var103] - arg0.field5233[var101];
                            int var118 = arg0.field5213[var103] - arg0.field5213[var101];
                            int var119 = arg0.field5250[var103] - arg0.field5250[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field5251[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field5227[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field5214[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method1190(var126, var127, var128);
                            method1140(arg0.field5233[var101], arg0.field5213[var101], arg0.field5250[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field2583;
                            var57 = field2576;
                            method1140(arg0.field5233[var102], arg0.field5213[var102], arg0.field5250[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field2583;
                            var59 = field2576;
                            method1140(arg0.field5233[var103], arg0.field5213[var103], arg0.field5250[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field2583;
                            var61 = field2576;
                        } else if (var65 == 3) {
                            method1183(arg0.field5233[var101], arg0.field5213[var101], arg0.field5250[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field2587;
                            var57 = field2580;
                            method1183(arg0.field5233[var102], arg0.field5213[var102], arg0.field5250[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field2587;
                            var59 = field2580;
                            method1183(arg0.field5233[var103], arg0.field5213[var103], arg0.field5250[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field2587;
                            var61 = field2580;
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
            arg0.method2137();
            byte var129;
            if (arg0.field5240 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field5240[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field5254[var51];
                class298 var133 = arg0.field5246[var132];
                this.field2556[var50] = this.method1151(arg0, var132, var130, var133.field4969, var133.field4981, var133.field4972, var133.field4983, var56, var57);
                int var134 = arg0.field5217[var51];
                class298 var135 = arg0.field5246[var134];
                this.field2562[var50] = this.method1151(arg0, var134, (long) var62 + var130, var135.field4969, var135.field4981, var135.field4972, var135.field4983, var58, var59);
                int var136 = arg0.field5239[var51];
                class298 var137 = arg0.field5246[var136];
                this.field2539[var50] = this.method1151(arg0, var136, (long) var63 + var130, var137.field4969, var137.field4981, var137.field4972, var137.field4983, var60, var61);
            } else if (var129 == 1) {
                class81 var138 = arg0.field5223[var51];
                long var139 = (long) ((var54 << 2) + (var138.field1421 > 0 ? 1024 : 2048) + (var138.field1423 + 256 << 12) + (var138.field1419 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field2556[var50] = this.method1151(arg0, arg0.field5254[var51], var139, var138.field1421, var138.field1423, var138.field1419, 0, var56, var57);
                this.field2562[var50] = this.method1151(arg0, arg0.field5217[var51], (long) var62 + var139, var138.field1421, var138.field1423, var138.field1419, 0, var58, var59);
                this.field2539[var50] = this.method1151(arg0, arg0.field5239[var51], (long) var63 + var139, var138.field1421, var138.field1423, var138.field1419, 0, var60, var61);
            }
            if (arg0.field5257 == null) {
                this.field2565[var50] = -1;
            } else {
                this.field2565[var50] = arg0.field5257[var51];
            }
            if (this.field2532 != null) {
                this.field2532[var50] = (byte) arg0.field5258[var51];
            }
            this.field2537[var50] = arg0.field5211[var51];
            if (arg0.field5256 != null) {
                this.field2533[var50] = arg0.field5256[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field2551; var143++) {
            short var144 = this.field2565[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field2546 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field2551; var147++) {
            short var148 = this.field2565[var147];
            if (var146 != var148) {
                this.field2546[var145++] = var147;
                var146 = var148;
            }
        }
        this.field2546[var145] = this.field2551;
        field2548 = null;
        this.field2567 = method1166(this.field2567, this.field2540);
        this.field2542 = method1166(this.field2542, this.field2540);
        this.field2569 = method1166(this.field2569, this.field2540);
        this.field2534 = method1166(this.field2534, this.field2540);
        this.field2535 = method1188(this.field2535, this.field2540);
        this.field2536 = method1188(this.field2536, this.field2540);
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V", line = 2030)
    public final void method1170(int arg0) {
        this.field2543 = (short) arg0;
        this.field2555.field3854 = false;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(SS)V", line = 2038)
    public final void method1171(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2551; var3++) {
            if (this.field2537[var3] == arg0) {
                this.field2537[var3] = arg1;
            }
        }
        this.field2555.field3854 = false;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZZZZZZZZZZZ)Le;", line = 2053)
    public final class152 method1172(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class152 var12 = new class152();
        var12.field2554 = this.field2554;
        var12.field2540 = this.field2540;
        var12.field2551 = this.field2551;
        if (arg0) {
            var12.field2568 = this.field2568;
            var12.field2563 = this.field2563;
        } else {
            var12.field2568 = class109.method823(this.field2568, 0);
            var12.field2563 = class109.method823(this.field2563, 0);
        }
        if (arg1) {
            var12.field2547 = this.field2547;
        } else {
            var12.field2547 = class109.method823(this.field2547, 0);
        }
        if (arg0 && arg1) {
            var12.field2544 = this.field2544;
            var12.field2586 = this.field2586;
        } else {
            var12.field2544 = new class235();
            var12.field2586 = new class260();
        }
        if (arg2) {
            var12.field2537 = this.field2537;
        } else {
            var12.field2537 = class41.method383(false, this.field2537);
        }
        if (arg3) {
            var12.field2533 = this.field2533;
        } else {
            var12.field2533 = class223.method1561(0, this.field2533);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class1.field8) {
            var12.field2555 = new class235();
        } else {
            var12.field2555 = this.field2555;
        }
        if (arg5) {
            var12.field2567 = this.field2567;
            var12.field2542 = this.field2542;
            var12.field2569 = this.field2569;
            var12.field2534 = this.field2534;
        } else {
            var12.field2567 = class41.method383(false, this.field2567);
            var12.field2542 = class41.method383(false, this.field2542);
            var12.field2569 = class41.method383(false, this.field2569);
            var12.field2534 = class41.method383(false, this.field2534);
        }
        if (!class1.field8) {
            var12.field2545 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field2545 = this.field2545;
        } else {
            var12.field2545 = new class235();
        }
        if (arg8) {
            var12.field2535 = this.field2535;
            var12.field2536 = this.field2536;
            var12.field2549 = this.field2549;
        } else {
            var12.field2535 = class54.method466(12771, this.field2535);
            var12.field2536 = class54.method466(12771, this.field2536);
            var12.field2549 = new class235();
        }
        if (arg9) {
            var12.field2556 = this.field2556;
            var12.field2562 = this.field2562;
            var12.field2539 = this.field2539;
            var12.field2560 = this.field2560;
        } else {
            var12.field2556 = class41.method383(false, this.field2556);
            var12.field2562 = class41.method383(false, this.field2562);
            var12.field2539 = class41.method383(false, this.field2539);
            var12.field2560 = new class235();
        }
        if (arg10) {
            var12.field2565 = this.field2565;
        } else {
            var12.field2565 = class41.method383(false, this.field2565);
        }
        var12.field2541 = this.field2541;
        var12.field2571 = this.field2571;
        var12.field2532 = this.field2532;
        var12.field2552 = this.field2552;
        var12.field2546 = this.field2546;
        var12.field2553 = this.field2553;
        var12.field2561 = this.field2561;
        var12.field2543 = this.field2543;
        var12.field2557 = this.field2557;
        return var12;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(SS)V", line = 2188)
    public final void method1173(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2551; var3++) {
            if (this.field2565[var3] == arg0) {
                this.field2565[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class203.field3217.method574(arg0 & 0xFFFF, 106);
            var5 = class203.field3217.method569(-50, arg0 & 0xFFFF);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class203.field3217.method574(arg1 & 0xFFFF, 122);
            var7 = class203.field3217.method569(-67, arg1 & 0xFFFF);
        }
        if (var4 != var6 || var5 != var7) {
            this.field2555.field3854 = false;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILe;[[I[[IIII)V", line = 2226)
    public final void method1174(int arg0, int arg1, class152 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field2586.field4378) {
            arg2.method1152();
        }
        int var9 = arg2.field2586.field4379 + arg5;
        int var10 = arg2.field2586.field4375 + arg5;
        int var11 = arg2.field2586.field4377 + arg7;
        int var12 = arg2.field2586.field4381 + arg7;
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
            for (int var17 = 0; var17 < this.field2554; var17++) {
                int var18 = this.field2568[var17] + arg5;
                int var19 = this.field2563[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field2547[var17] = this.field2547[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field2586.field4380;
            for (int var28 = 0; var28 < this.field2554; var28++) {
                int var29 = (this.field2547[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field2568[var28] + arg5;
                    int var31 = this.field2563[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field2547[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method1859(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field2586.field4376 - arg2.field2586.field4380;
            for (int var42 = 0; var42 < this.field2554; var42++) {
                int var43 = this.field2568[var42] + arg5;
                int var44 = this.field2563[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field2547[var42] = var51 + this.field2547[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field2586.field4376 - arg2.field2586.field4380;
            for (int var53 = 0; var53 < this.field2554; var53++) {
                int var54 = this.field2568[var53] + arg5;
                int var55 = this.field2563[var53] + arg7;
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
                this.field2547[var53] = ((this.field2547[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field2544.field3854 = false;
        this.field2586.field4378 = false;
    }

    @OriginalMember(owner = "client!e", name = "s", descriptor = "()V", line = 2425)
    private final void method1175() {
        if (field2538.field472.length < this.field2540 * 12) {
            field2538 = new class26((this.field2540 + 100) * 12);
        } else {
            field2538.field478 = 0;
        }
        if (class21.field349) {
            for (int var1 = 0; var1 < this.field2551; var1++) {
                field2538.method239((byte) 108, this.field2556[var1]);
                field2538.method239((byte) -27, this.field2562[var1]);
                field2538.method239((byte) -24, this.field2539[var1]);
            }
        } else {
            for (int var2 = 0; var2 < this.field2551; var2++) {
                field2538.method248((byte) 121, this.field2556[var2]);
                field2538.method248((byte) 116, this.field2562[var2]);
                field2538.method248((byte) 120, this.field2539[var2]);
            }
        }
        if (!class21.field367) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field2538.field478);
            var5.put(field2538.field472, 0, field2538.field478);
            var5.flip();
            this.field2560.field3854 = true;
            this.field2560.field3858 = var5;
            this.field2560.field3849 = null;
            return;
        }
        class245 var3 = new class245();
        ByteBuffer var4 = ByteBuffer.wrap(field2538.field472, 0, field2538.field478);
        var3.method1736(var4);
        this.field2560.field3854 = true;
        this.field2560.field3858 = null;
        this.field2560.field3849 = var3;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lwa;ILwa;I[IZ)V", line = 2490)
    public final void method1176(class76 arg0, int arg1, class76 arg2, int arg3, int[] arg4, boolean arg5) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1138(arg0, arg1, arg5);
            return;
        }
        class215 var7 = arg0.field1311[arg1];
        class215 var8 = arg2.field1311[arg3];
        class110 var9 = var7.field3598;
        for (int var10 = 0; var10 < this.field2554; var10++) {
            this.field2568[var10] <<= 0x4;
            this.field2547[var10] <<= 0x4;
            this.field2563[var10] <<= 0x4;
        }
        field2579 = 0;
        field2581 = 0;
        field2584 = 0;
        byte var11 = 0;
        int var20 = var11 + 1;
        int var12 = arg4[var11];
        for (int var13 = 0; var13 < var7.field3597; var13++) {
            short var14 = var7.field3593[var13];
            while (var14 > var12) {
                var12 = arg4[var20++];
            }
            if (var12 != var14 || var9.field1932[var14] == 0) {
                if (var7.field3600[var13] != -1) {
                    this.method1177(0, var9.field1919[var7.field3600[var13]], 0, 0, 0, arg5);
                }
                this.method1177(var9.field1932[var14], var9.field1919[var14], var7.field3594[var13], var7.field3605[var13], var7.field3601[var13], arg5);
            }
        }
        field2579 = 0;
        field2581 = 0;
        field2584 = 0;
        byte var15 = 0;
        int var21 = var15 + 1;
        int var16 = arg4[var15];
        for (int var17 = 0; var17 < var8.field3597; var17++) {
            short var18 = var8.field3593[var17];
            while (var18 > var16) {
                var16 = arg4[var21++];
            }
            if (var16 == var18 || var9.field1932[var18] == 0) {
                if (var8.field3600[var17] != -1) {
                    this.method1177(0, var9.field1919[var8.field3600[var17]], 0, 0, 0, arg5);
                }
                this.method1177(var9.field1932[var18], var9.field1919[var18], var8.field3594[var17], var8.field3605[var17], var8.field3601[var17], arg5);
            }
        }
        for (int var19 = 0; var19 < this.field2554; var19++) {
            this.field2568[var19] >>= 0x4;
            this.field2547[var19] >>= 0x4;
            this.field2563[var19] >>= 0x4;
        }
        this.field2586.field4378 = false;
        this.field2544.field3854 = false;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I[IIIIZ)V", line = 2588)
    private final void method1177(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field2579 = 0;
            field2581 = 0;
            field2584 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field2571.length) {
                    int[] var14 = this.field2571[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field2579 += this.field2568[var16];
                        field2581 += this.field2547[var16];
                        field2584 += this.field2563[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field2579 = field2579 / var11 + var8;
                field2581 = field2581 / var11 + var9;
                field2584 = field2584 / var11 + var10;
            } else {
                field2579 = var8;
                field2581 = var9;
                field2584 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field2571.length) {
                    int[] var22 = this.field2571[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field2568[var24] += var17;
                        this.field2547[var24] += var18;
                        this.field2563[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field2571.length) {
                    int[] var27 = this.field2571[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field2568[var29] -= field2579;
                        this.field2547[var29] -= field2581;
                        this.field2563[var29] -= field2584;
                        if (arg4 != 0) {
                            int var30 = class203.field3208[arg4];
                            int var31 = class203.field3216[arg4];
                            int var32 = this.field2568[var29] * var31 + this.field2547[var29] * var30 + 32767 >> 16;
                            this.field2547[var29] = this.field2547[var29] * var31 + 32767 - this.field2568[var29] * var30 >> 16;
                            this.field2568[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class203.field3208[arg2];
                            int var34 = class203.field3216[arg2];
                            int var35 = this.field2547[var29] * var34 + 32767 - this.field2563[var29] * var33 >> 16;
                            this.field2563[var29] = this.field2563[var29] * var34 + this.field2547[var29] * var33 + 32767 >> 16;
                            this.field2547[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class203.field3208[arg3];
                            int var37 = class203.field3216[arg3];
                            int var38 = this.field2568[var29] * var37 + this.field2563[var29] * var36 + 32767 >> 16;
                            this.field2563[var29] = this.field2563[var29] * var37 + 32767 - this.field2568[var29] * var36 >> 16;
                            this.field2568[var29] = var38;
                        }
                        this.field2568[var29] += field2579;
                        this.field2547[var29] += field2581;
                        this.field2563[var29] += field2584;
                    }
                }
            }
            if (arg5 && this.field2567 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field2571.length) {
                        int[] var41 = this.field2571[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field2561[var43];
                            int var45 = this.field2561[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field2553[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class203.field3208[arg4];
                                    int var49 = class203.field3216[arg4];
                                    int var50 = this.field2567[var47] * var49 + this.field2542[var47] * var48 + 32767 >> 16;
                                    this.field2542[var47] = (short) (this.field2542[var47] * var49 + 32767 - this.field2567[var47] * var48 >> 16);
                                    this.field2567[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class203.field3208[arg2];
                                    int var52 = class203.field3216[arg2];
                                    int var53 = this.field2542[var47] * var52 + 32767 - this.field2569[var47] * var51 >> 16;
                                    this.field2569[var47] = (short) (this.field2569[var47] * var52 + this.field2542[var47] * var51 + 32767 >> 16);
                                    this.field2542[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class203.field3208[arg3];
                                    int var55 = class203.field3216[arg3];
                                    int var56 = this.field2569[var47] * var54 + this.field2567[var47] * var55 + 32767 >> 16;
                                    this.field2569[var47] = (short) (this.field2569[var47] * var55 + 32767 - this.field2567[var47] * var54 >> 16);
                                    this.field2567[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field2545 != null) {
                    this.field2545.field3854 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field2571.length) {
                    int[] var59 = this.field2571[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field2568[var61] -= field2579;
                        this.field2547[var61] -= field2581;
                        this.field2563[var61] -= field2584;
                        this.field2568[var61] = this.field2568[var61] * arg2 >> 7;
                        this.field2547[var61] = this.field2547[var61] * arg3 >> 7;
                        this.field2563[var61] = this.field2563[var61] * arg4 >> 7;
                        this.field2568[var61] += field2579;
                        this.field2547[var61] += field2581;
                        this.field2563[var61] += field2584;
                    }
                }
            }
        } else if (arg0 == 5 && this.field2552 != null && this.field2533 != null) {
            for (int var62 = 0; var62 < var7; var62++) {
                int var63 = arg1[var62];
                if (var63 < this.field2552.length) {
                    int[] var64 = this.field2552[var63];
                    for (int var65 = 0; var65 < var64.length; var65++) {
                        int var66 = var64[var65];
                        int var67 = (this.field2533[var66] & 0xFF) + arg2 * 8;
                        if (var67 < 0) {
                            var67 = 0;
                        } else if (var67 > 255) {
                            var67 = 255;
                        }
                        this.field2533[var66] = (byte) var67;
                    }
                    if (var64.length > 0) {
                        this.field2555.field3854 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "()I", line = 2932)
    public final int method1178() {
        if (!this.field2586.field4378) {
            this.method1152();
        }
        return this.field2586.field4377;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(ZZ)Lrf;", line = 2938)
    public final class266 method1179(boolean arg0, boolean arg1) {
        return this.method1137(arg0, arg1, field2573, field2572);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()Z", line = 2942)
    public final boolean method1180() {
        return this.field2566 && this.field2568 != null && this.field2567 != null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lda;)Lda;", line = 2947)
    public final class114 method1181(class114 arg0) {
        if (this.field2540 == 0) {
            return null;
        }
        if (!this.field2586.field4378) {
            this.method1152();
        }
        int var2;
        int var3;
        if (class273.field4530 > 0) {
            var2 = this.field2586.field4379 - (class273.field4530 * this.field2586.field4376 >> 8) >> 3;
            var3 = this.field2586.field4375 - (class273.field4530 * this.field2586.field4380 >> 8) >> 3;
        } else {
            var2 = this.field2586.field4379 - (class273.field4530 * this.field2586.field4380 >> 8) >> 3;
            var3 = this.field2586.field4375 - (class273.field4530 * this.field2586.field4376 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class273.field4538 > 0) {
            var4 = this.field2586.field4377 - (class273.field4538 * this.field2586.field4376 >> 8) >> 3;
            var5 = this.field2586.field4381 - (class273.field4538 * this.field2586.field4380 >> 8) >> 3;
        } else {
            var4 = this.field2586.field4377 - (class273.field4538 * this.field2586.field4380 >> 8) >> 3;
            var5 = this.field2586.field4381 - (class273.field4538 * this.field2586.field4376 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class114 var8;
        if (arg0 == null || arg0.field1976.length < var6 * var7) {
            var8 = new class114(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field4114 = arg0.field4116 = var6;
            arg0.field4124 = arg0.field4128 = var7;
            arg0.method851();
        }
        var8.field4122 = var2;
        var8.field4119 = var4;
        if (field2578.length < this.field2540) {
            field2578 = new int[this.field2540];
            field2582 = new int[this.field2540];
        }
        for (int var9 = 0; var9 < this.field2554; var9++) {
            int var10 = (this.field2568[var9] - (this.field2547[var9] * class273.field4530 >> 8) >> 3) - var2;
            int var11 = (this.field2563[var9] - (this.field2547[var9] * class273.field4538 >> 8) >> 3) - var4;
            int var12 = this.field2561[var9];
            int var13 = this.field2561[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field2553[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field2578[var15] = var10;
                field2582[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field2551; var16++) {
            if (this.field2533[var16] <= 128) {
                short var17 = this.field2556[var16];
                short var18 = this.field2562[var16];
                short var19 = this.field2539[var16];
                int var20 = field2578[var17];
                int var21 = field2578[var18];
                int var22 = field2578[var19];
                int var23 = field2582[var17];
                int var24 = field2582[var18];
                int var25 = field2582[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class203.method1412(var8.field1976, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(III)V", line = 3072)
    public final void method1182(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2554; var4++) {
            this.field2568[var4] = this.field2568[var4] * arg0 >> 7;
            this.field2547[var4] = this.field2547[var4] * arg1 >> 7;
            this.field2563[var4] = this.field2563[var4] * arg2 >> 7;
        }
        this.field2586.field4378 = false;
        this.field2544.field3854 = false;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIII[FIF)V", line = 3085)
    private static final void method1183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
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
        field2587 = var16;
        field2580 = var17;
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(I)V", line = 3129)
    public final void method1184(int arg0) {
        this.field2557 = (short) arg0;
        if (this.field2545 != null) {
            this.field2545.field3854 = false;
        }
    }

    @OriginalMember(owner = "client!e", name = "t", descriptor = "()V", line = 3135)
    public static final void method1185() {
        field2572 = new class152();
        field2573 = new class152();
        field2574 = new class152();
        field2575 = new class152();
    }

    @OriginalMember(owner = "client!e", name = "u", descriptor = "()V", line = 3143)
    public final void method1186() {
        if (this.field2567 == null) {
            this.method1145();
            return;
        }
        for (int var1 = 0; var1 < this.field2554; var1++) {
            int var2 = this.field2568[var1];
            this.field2568[var1] = this.field2563[var1];
            this.field2563[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field2540; var3++) {
            short var4 = this.field2567[var3];
            this.field2567[var3] = this.field2569[var3];
            this.field2569[var3] = (short) (-var4);
        }
        this.field2586.field4378 = false;
        this.field2544.field3854 = false;
        if (this.field2545 != null) {
            this.field2545.field3854 = false;
        }
    }

    @OriginalMember(owner = "client!e", name = "v", descriptor = "()V", line = 3180)
    public final void method1187() {
        int var10002;
        if (this.field2541 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2554; var3++) {
                int var4 = this.field2541[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2571 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2571[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2554) {
                int var7 = this.field2541[var6] & 0xFF;
                this.field2571[var7][var1[var7]++] = var6++;
            }
            this.field2541 = null;
        }
        if (this.field2532 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2551; var10++) {
            int var11 = this.field2532[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2552 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2552[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2551) {
            int var14 = this.field2532[var13] & 0xFF;
            this.field2552[var14][var8[var14]++] = var13++;
        }
        this.field2532 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([FI)[F", line = 3273)
    private static final float[] method1188(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class234.method1622(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIII[FFIF)V", line = 3278)
    private static final void method1189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
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
        field2585 = var16;
        field2577 = var17;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIIIJ)V", line = 3324)
    public final void method77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (this.field2540 == 0) {
            return;
        }
        if (!this.field2586.field4378) {
            this.method1152();
        }
        short var11 = this.field2586.field4374;
        short var12 = this.field2586.field4380;
        short var13 = this.field2586.field4376;
        int var14 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var15 = arg1 * arg6 + arg2 * var14 >> 16;
        int var16 = (arg1 * var13 + arg2 * var11 >> 16) + var15;
        if (var16 <= 50) {
            return;
        }
        int var17 = (-var11 * arg2 + arg1 * var12 >> 16) + var15;
        if (var17 >= 3584) {
            return;
        }
        int var18 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var19 = var11 + var18 << 9;
        if (var19 / var16 <= class186.field3011) {
            return;
        }
        int var20 = var18 - var11 << 9;
        if (var20 / var16 >= class162.field2695) {
            return;
        }
        int var21 = arg2 * arg6 - arg1 * var14 >> 16;
        int var22 = (arg1 * var11 + arg2 * var13 >> 16) + var21 << 9;
        if (var22 / var16 <= class188.field3042) {
            return;
        }
        int var23 = (-var11 * arg1 + arg2 * var12 >> 16) + var21 << 9;
        if (var23 / var16 >= class218.field3630) {
            return;
        }
        int var24 = 0;
        int var25 = 0;
        if (arg0 != 0) {
            var24 = class203.field3208[arg0];
            var25 = class203.field3216[arg0];
        }
        if (arg8 > 0L && class14.field227 && var17 > 0) {
            int var26;
            int var27;
            if (var18 > 0) {
                var26 = var20 / var16;
                var27 = var19 / var17;
            } else {
                var26 = var20 / var17;
                var27 = var19 / var16;
            }
            int var28;
            int var29;
            if (var21 > 0) {
                var28 = var23 / var16;
                var29 = var22 / var17;
            } else {
                var28 = var23 / var17;
                var29 = var22 / var16;
            }
            if (class280.field4744 >= var26 && class280.field4744 <= var27 && class208.field3324 >= var28 && class208.field3324 <= var29) {
                int var30 = 999999;
                int var31 = -999999;
                int var32 = 999999;
                int var33 = -999999;
                short var34 = this.field2586.field4379;
                short var35 = this.field2586.field4375;
                short var36 = this.field2586.field4377;
                short var37 = this.field2586.field4381;
                int[] var38 = new int[] { var34, var35, var34, var35, var34, var35, var34, var35 };
                int[] var39 = new int[] { var36, var36, var37, var37, var36, var36, var37, var37 };
                int[] var40 = new int[] { var12, var12, var12, var12, var13, var13, var13, var13 };
                for (int var41 = 0; var41 < 8; var41++) {
                    int var42 = var38[var41];
                    int var43 = var40[var41];
                    int var44 = var39[var41];
                    if (arg0 != 0) {
                        int var45 = var24 * var44 + var25 * var42 >> 16;
                        var44 = var25 * var44 - var24 * var42 >> 16;
                        var42 = var45;
                    }
                    int var46 = arg5 + var42;
                    int var47 = arg6 + var43;
                    int var48 = arg7 + var44;
                    int var49 = arg3 * var48 + arg4 * var46 >> 16;
                    int var50 = arg4 * var48 - arg3 * var46 >> 16;
                    int var52 = arg2 * var47 - arg1 * var50 >> 16;
                    int var53 = arg1 * var47 + arg2 * var50 >> 16;
                    if (var53 > 0) {
                        int var55 = (var49 << 9) / var53;
                        int var56 = (var52 << 9) / var53;
                        if (var55 < var30) {
                            var30 = var55;
                        }
                        if (var55 > var31) {
                            var31 = var55;
                        }
                        if (var56 < var32) {
                            var32 = var56;
                        }
                        if (var56 > var33) {
                            var33 = var56;
                        }
                    }
                }
                if (class280.field4744 >= var30 && class280.field4744 <= var31 && class208.field3324 >= var32 && class208.field3324 <= var33) {
                    if (this.field4451) {
                        class28.field597[class293.field4929++] = arg8;
                    } else {
                        if (field2578.length < this.field2540) {
                            field2578 = new int[this.field2540];
                            field2582 = new int[this.field2540];
                        }
                        int var57 = 0;
                        label118: while (true) {
                            if (var57 >= this.field2554) {
                                int var77 = 0;
                                while (true) {
                                    if (var77 >= this.field2551) {
                                        break label118;
                                    }
                                    short var78 = this.field2556[var77];
                                    short var79 = this.field2562[var77];
                                    short var80 = this.field2539[var77];
                                    if (this.method1167(class280.field4744, class208.field3324, field2582[var78], field2582[var79], field2582[var80], field2578[var78], field2578[var79], field2578[var80])) {
                                        class28.field597[class293.field4929++] = arg8;
                                        break label118;
                                    }
                                    var77++;
                                }
                            }
                            int var58 = this.field2568[var57];
                            int var59 = this.field2547[var57];
                            int var60 = this.field2563[var57];
                            if (arg0 != 0) {
                                int var61 = var24 * var60 + var25 * var58 >> 16;
                                var60 = var25 * var60 - var24 * var58 >> 16;
                                var58 = var61;
                            }
                            int var62 = arg5 + var58;
                            int var63 = arg6 + var59;
                            int var64 = arg7 + var60;
                            int var65 = arg3 * var64 + arg4 * var62 >> 16;
                            int var66 = arg4 * var64 - arg3 * var62 >> 16;
                            int var68 = arg2 * var63 - arg1 * var66 >> 16;
                            int var69 = arg1 * var63 + arg2 * var66 >> 16;
                            if (var69 < 50) {
                                break;
                            }
                            int var71 = (var65 << 9) / var69;
                            int var72 = (var68 << 9) / var69;
                            int var73 = this.field2561[var57];
                            int var74 = this.field2561[var57 + 1];
                            for (int var75 = var73; var75 < var74; var75++) {
                                int var76 = this.field2553[var75] - 1;
                                if (var76 == -1) {
                                    break;
                                }
                                field2578[var76] = var71;
                                field2582[var76] = var72;
                            }
                            var57++;
                        }
                    }
                }
            }
        }
        GL var81 = class21.field377;
        var81.glPushMatrix();
        var81.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var81.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method1160();
        var81.glPopMatrix();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(FFF)I", line = 3593)
    private static final int method1190(float arg0, float arg1, float arg2) {
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

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZZZZZZZ)V", line = 3627)
    public final void method1191(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field2550 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field2540 != 0) {
            if (arg6) {
                boolean var8 = !this.field2555.field3854 && (arg1 || arg2 && !class1.field8);
                this.method1164(false, !this.field2544.field3854 && arg0, var8, this.field2545 != null && !this.field2545.field3854 && arg2, !this.field2549.field3854 && arg3);
                if (!this.field2560.field3854 && arg4 && arg1) {
                    this.method1175();
                }
            }
            if (arg0) {
                if (this.field2544.field3854) {
                    this.field2568 = null;
                    this.field2547 = null;
                    this.field2563 = null;
                    this.field2553 = null;
                    this.field2561 = null;
                } else {
                    this.field2558 = (byte) (this.field2558 | 0x1);
                }
            }
            if (arg1) {
                if (this.field2555.field3854) {
                    this.field2537 = null;
                    this.field2533 = null;
                } else {
                    this.field2558 = (byte) (this.field2558 | 0x2);
                }
            }
            if (arg2 && class1.field8) {
                if (this.field2545.field3854) {
                    this.field2567 = null;
                    this.field2542 = null;
                    this.field2569 = null;
                    this.field2534 = null;
                } else {
                    this.field2558 = (byte) (this.field2558 | 0x4);
                }
            }
            if (arg3) {
                if (this.field2549.field3854) {
                    this.field2535 = null;
                    this.field2536 = null;
                } else {
                    this.field2558 = (byte) (this.field2558 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field2560.field3854 && this.field2555.field3854) {
                    this.field2556 = null;
                    this.field2562 = null;
                    this.field2539 = null;
                } else {
                    this.field2558 = (byte) (this.field2558 | 0x10);
                }
            }
            if (arg5) {
                this.field2541 = null;
                this.field2532 = null;
                this.field2571 = (int[][]) null;
                this.field2552 = (int[][]) null;
            }
        }
    }
}
