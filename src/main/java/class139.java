import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class139 extends class15 {

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "Z")
    public boolean field2516 = false;

    @OriginalMember(owner = "client!ng", name = "Y", descriptor = "I")
    private int field2527 = 0;

    @OriginalMember(owner = "client!ng", name = "Q", descriptor = "I")
    private int field2519 = -1;

    @OriginalMember(owner = "client!ng", name = "lb", descriptor = "Lh;")
    private class287 field2540;

    @OriginalMember(owner = "client!ng", name = "hb", descriptor = "Z")
    private boolean field2536;

    @OriginalMember(owner = "client!ng", name = "P", descriptor = "Z")
    private boolean field2518;

    @OriginalMember(owner = "client!ng", name = "ib", descriptor = "Z")
    private boolean field2537;

    @OriginalMember(owner = "client!ng", name = "pb", descriptor = "Z")
    private boolean field2544;

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "I")
    private int field2515;

    @OriginalMember(owner = "client!ng", name = "db", descriptor = "I")
    private int field2532;

    @OriginalMember(owner = "client!ng", name = "ab", descriptor = "I")
    private int field2529;

    @OriginalMember(owner = "client!ng", name = "rb", descriptor = "I")
    private int field2546;

    @OriginalMember(owner = "client!ng", name = "jb", descriptor = "Z")
    public static volatile boolean field2538 = false;

    @OriginalMember(owner = "client!ng", name = "X", descriptor = "[I")
    public static int[] field2526 = new int[2048];

    @OriginalMember(owner = "client!ng", name = "qb", descriptor = "Lce;")
    public static class126 field2545 = class206.method1445(-7923, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!ng", name = "kb", descriptor = "F")
    private float field2539;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!ng", name = "S", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!ng", name = "T", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!ng", name = "V", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!ng", name = "W", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!ng", name = "Z", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!ng", name = "bb", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!ng", name = "cb", descriptor = "I")
    private int field2531;

    @OriginalMember(owner = "client!ng", name = "eb", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!ng", name = "fb", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!ng", name = "gb", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!ng", name = "mb", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!ng", name = "nb", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!ng", name = "ob", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!ng", name = "U", descriptor = "[I")
    private int[] field2523;

    @OriginalMember(owner = "client!ng", name = "R", descriptor = "[Lk;")
    public static class240[] field2520;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILcc;I)[Lvj;", line = 10)
    public static final class184[] method1016(int arg0, int arg1, class313 arg2, int arg3) {
        field2533++;
        if (arg0 != 3057) {
            field2545 = (class126) null;
        }
        return class298.method2012(arg3, (byte) -110, arg2, arg1) ? class321.method2232((byte) 97) : null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "([JII[Ljava/lang/Object;I)V", line = 24)
    public static final void method1017(long[] arg0, int arg1, int arg2, Object[] arg3, int arg4) {
        if (arg2 > arg4) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var7;
            Object var9 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var9;
            for (int var10 = arg4; var10 < arg2; var10++) {
                if (arg0[var10] < (long) (var10 & 0x1) + var7) {
                    long var11 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6] = var11;
                    Object var13 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6++] = var13;
                }
            }
            arg0[arg2] = arg0[var6];
            arg0[var6] = var7;
            arg3[arg2] = arg3[var6];
            arg3[var6] = var9;
            method1017(arg0, arg1 ^ 0x0, var6 - 1, arg3, arg4);
            method1017(arg0, arg1, arg2, arg3, var6 + 1);
        }
        if (arg1 == 1) {
            field2517++;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lhm;BLcc;)Z", line = 85)
    public final boolean method1018(class86 arg0, byte arg1, class313 arg2) {
        field2543++;
        if (arg1 > -125) {
            this.field2516 = false;
        }
        return this.field2540.method1913(arg2, arg0, false);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILcc;)V", line = 99)
    public static final void method1019(int arg0, class313 arg1) {
        field2513++;
        class250.field4180 = class293.method1940(class33.field497, arg1, 184);
        if (arg0 > -38) {
            return;
        }
        class315.field5417 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) ((class185.field3200[var2] & 0xFF0000) >> 16);
            int var4 = class185.field3200[var2 + 1] >> 16 & 0xFF;
            float var5 = ((float) var4 - var3) / 64.0F;
            float var6 = (float) (class185.field3200[var2] >> 8 & 0xFF);
            int var7 = class185.field3200[var2 + 1] >> 8 & 0xFF;
            int var8 = class185.field3200[var2 + 1] & 0xFF;
            float var9 = ((float) var7 - var6) / 64.0F;
            float var10 = (float) (class185.field3200[var2] & 0xFF);
            float var11 = ((float) var8 - var10) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class315.field5417[var2 * 64 + var12] = class221.method1516(class221.method1516((int) var6 << 8, (int) var3 << 16), (int) var10);
                var6 += var9;
                var10 += var11;
                var3 += var5;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class315.field5417[var13] = class185.field3200[3];
        }
        class181.field3146 = new int[32768];
        class317.field5439 = new int[32768];
        class82.method581(5672, (class2) null);
        class120.field2018 = new int[32768];
        class285.field4724 = new int[32768];
        class218.field3662 = new class184(128, 254);
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(B)V", line = 164)
    public static void method1020(byte arg0) {
        field2526 = null;
        field2545 = null;
        field2520 = null;
        if (arg0 < 28) {
            field2538 = false;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIII)V", line = 177)
    public static final void method1021(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class134.field2335 = arg0;
        class100.field1624 = -1;
        class253.field4249 = class143.field2602 * arg1 / arg4;
        field2522 = class36.field521 * arg3 / arg2;
        field2528++;
        class245.method1686(false);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBI)Lim;", line = 189)
    public static final class245 method1022(int arg0, byte arg1, int arg2) {
        if (arg1 > -88) {
            return (class245) null;
        }
        field2542++;
        class245 var3 = (class245) class151.field2764.method1631(false, (long) arg2 | (long) arg0 << 32);
        if (var3 == null) {
            var3 = new class245(arg0, arg2);
            class151.field2764.method1636(11311, var3, var3.field1117);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lbb;)V", line = 691)
    public class139(class134 arg0) {
        this.field2540 = new class287(arg0);
        this.field2536 = arg0.method948(-126) == 1;
        this.field2518 = arg0.method948(-125) == 1;
        this.field2537 = arg0.method948(-128) == 1;
        this.field2544 = arg0.method948(-126) == 1;
        int var2 = arg0.method948(-126) & 0x3;
        this.field2515 = arg0.method977(19773);
        this.field2532 = arg0.method977(19773);
        int var3 = arg0.method948(-121);
        arg0.method948(-125);
        if (var2 == 1) {
            this.field2529 = 2;
        } else if (var2 == 2) {
            this.field2529 = 3;
        } else if (var2 == 3) {
            this.field2529 = 4;
        } else {
            this.field2529 = 0;
        }
        this.field2546 = var3 >> 4 & 0xF;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZLhm;Lcc;)Z", line = 219)
    public final boolean method1023(int arg0, boolean arg1, class86 arg2, class313 arg3) {
        field2541++;
        if (!this.field2540.method1913(arg3, arg2, false)) {
            return false;
        }
        if (arg0 != -65) {
            method1021(-20, -10, -78, -50, -116);
        }
        GL var5 = class56.field848;
        int var6 = arg1 ? 64 : 128;
        int var7 = class46.method287((byte) -82);
        if ((var7 & 0x1) == 0) {
            if (this.field2519 == -1) {
                int[] var8 = new int[1];
                var5.glGenTextures(1, var8, 0);
                this.field2519 = var8[0];
                this.field2531 = class121.field2023;
                class56.method354(this.field2519);
                ByteBuffer var9 = ByteBuffer.wrap(this.field2540.method1912(var6, this.field2518, 0.7D, arg2, arg3, var6, (byte) 78));
                if (this.field2546 == 2) {
                    GLU var11 = new GLU();
                    var11.gluBuild2DMipmaps(3553, 6408, var6, var6, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9987);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class121.field2025 += var9.limit() * 4 / 3 - this.field2527;
                    this.field2527 = var9.limit() * 4 / 3;
                } else if (this.field2546 == 1) {
                    int var10 = 0;
                    while (true) {
                        var5.glTexImage2D(3553, var10++, 6408, var6, var6, 0, 6408, 5121, var9);
                        var6 >>= 0x1;
                        if (var6 == 0) {
                            var5.glTexParameteri(3553, 10241, 9987);
                            var5.glTexParameteri(3553, 10240, 9729);
                            class121.field2025 += var9.limit() * 4 / 3 - this.field2527;
                            this.field2527 = var9.limit() * 4 / 3;
                            break;
                        }
                        var9 = ByteBuffer.wrap(this.field2540.method1912(var6, this.field2518, 0.7D, arg2, arg3, var6, (byte) 78));
                    }
                } else {
                    var5.glTexImage2D(3553, 0, 6408, var6, var6, 0, 6408, 5121, var9);
                    var5.glTexParameteri(3553, 10241, 9729);
                    var5.glTexParameteri(3553, 10240, 9729);
                    class121.field2025 += var9.limit() - this.field2527;
                    this.field2527 = var9.limit();
                }
                var5.glTexParameteri(3553, 10242, this.field2537 ? 10497 : 33071);
                var5.glTexParameteri(3553, 10243, this.field2544 ? 10497 : 33071);
            } else {
                class56.method354(this.field2519);
            }
        }
        if ((var7 & 0x2) == 0) {
            class56.method381(this.field2529);
        }
        if ((var7 & 0x4) == 0) {
            class56.method351(0);
        }
        if ((var7 & 0x8) == 0) {
            if (this.field2532 == 0 && this.field2515 == 0) {
                class56.method382();
            } else {
                float var12 = (float) (class56.field871 * this.field2532) / (float) var6;
                float var13 = (float) (class56.field871 * this.field2515) / (float) var6;
                class56.method357(var13, var12, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lcc;ILhm;Z)[I", line = 334)
    public final int[] method1024(class313 arg0, int arg1, class86 arg2, boolean arg3) {
        field2524++;
        if (!this.field2540.method1913(arg0, arg2, false)) {
            return null;
        }
        if (arg1 != -1991) {
            this.method1018((class86) null, (byte) 67, (class313) null);
        }
        int var5 = arg3 ? 64 : 128;
        return this.field2540.method1914(1.0D, false, this.field2518, arg0, var5, -88, var5, arg2);
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(IIIII)V", line = 355)
    public static final void method1025(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2514++;
        class192 var5 = (class192) class95.field1496.method1631(false, (long) arg4);
        if (var5 == null) {
            var5 = new class192();
            class95.field1496.method1636(11311, var5, (long) arg4);
        }
        if (arg0 < 87) {
            method1022(-54, (byte) 43, 6);
        }
        if (arg3 >= var5.field3281.length) {
            int[] var6 = new int[arg3 + 1];
            int[] var7 = new int[arg3 + 1];
            for (int var8 = 0; var8 < var5.field3281.length; var8++) {
                var7[var8] = var5.field3281[var8];
                var6[var8] = var5.field3278[var8];
            }
            for (int var9 = var5.field3281.length; var9 < arg3; var9++) {
                var7[var9] = -1;
                var6[var9] = 0;
            }
            var5.field3281 = var7;
            var5.field3278 = var6;
        }
        var5.field3281[arg3] = arg1;
        var5.field3278[arg3] = arg2;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZLhm;FILcc;)[I", line = 405)
    public final int[] method1026(boolean arg0, class86 arg1, float arg2, int arg3, class313 arg4) {
        field2525++;
        if (this.field2523 == null || this.field2539 != arg2) {
            if (!this.field2540.method1913(arg4, arg1, false)) {
                return null;
            }
            int var6 = arg0 ? 64 : 128;
            this.field2523 = this.field2540.method1914((double) arg2, true, this.field2518, arg4, var6, arg3 - 30856, var6, arg1);
            this.field2539 = arg2;
            if (this.field2536) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var12;
                int var13 = var12 = var6;
                int var15 = var6 - 1;
                int var16 = var6 * var6;
                int var17 = var6 - 1;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var19 = var15; var19 >= 0; var19--) {
                        var12--;
                        int var20 = this.field2523[var12];
                        var7[var19] += class47.method289(255, var20 >> 16);
                        var9[var19] += class47.method289(255, var20 >> 8);
                        var8[var19] += class47.method289(var20, 255);
                    }
                    if (var12 == 0) {
                        var12 = var16;
                    }
                }
                int var21 = var16;
                for (int var22 = var17; var22 >= 0; var22--) {
                    int var23 = 1;
                    int var24 = 1;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = 0;
                    for (int var28 = 2; var28 >= 0; var28--) {
                        var23--;
                        var26 += var8[var23];
                        var27 += var7[var23];
                        var25 += var9[var23];
                        if (var23 == 0) {
                            var23 = var11;
                        }
                    }
                    for (int var29 = var15; var29 >= 0; var29--) {
                        var24--;
                        int var30 = var26 / 9;
                        int var31 = var27 / 9;
                        int var32 = var25 / 9;
                        var23--;
                        var21--;
                        var10[var21] = class221.method1516(class221.method1516(var32 << 8, var31 << 16), var30);
                        var25 += var9[var23] - var9[var24];
                        var27 += var7[var23] - var7[var24];
                        var26 += var8[var23] - var8[var24];
                        if (var24 == 0) {
                            var24 = var11;
                        }
                        if (var23 == 0) {
                            var23 = var11;
                        }
                    }
                    for (int var33 = var15; var33 >= 0; var33--) {
                        var13--;
                        int var34 = this.field2523[var13];
                        var12--;
                        int var35 = this.field2523[var12];
                        var7[var33] += -(class47.method289(16734841, var34) >> 16) + (class47.method289(var35, 16714765) >> 16);
                        var9[var33] += -(class47.method289(var34, 65490) >> 8) + (class47.method289(65457, var35) >> 8);
                        var8[var33] += -class47.method289(255, var34) + class47.method289(255, var35);
                    }
                    if (var13 == 0) {
                        var13 = var16;
                    }
                    if (var12 == 0) {
                        var12 = var16;
                    }
                }
                this.field2523 = var10;
            }
        }
        if (arg3 != 30764) {
            method1027(-124, -102, -128, 75);
        }
        return this.field2523;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)I", line = 569)
    public static final int method1027(int arg0, int arg1, int arg2, int arg3) {
        field2534++;
        if (arg1 == arg2) {
            return arg2;
        } else {
            int var4 = 128 - arg3;
            int var5 = arg0 & (arg1 & 0xFF00FF) * arg3 + (arg2 & 0xFF00FF) * var4;
            int var6 = ((arg2 & 0xFF00FF00) >>> 7) * var4 + (arg1 >>> 7 & 0x1FE01FE) * arg3 & 0xFF00FF00;
            return (var5 >> 7) + var6;
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(II)V", line = 592)
    public final void method1028(int arg0, int arg1) {
        if (arg1 != 9480) {
            return;
        }
        field2535++;
        if (this.field2523 == null || this.field2532 == 0 && this.field2515 == 0) {
            return;
        }
        if (class32.field464 == null || class32.field464.length < this.field2523.length) {
            class32.field464 = new int[this.field2523.length];
        }
        int var3 = this.field2523.length == 4096 ? 64 : 128;
        int var4 = this.field2523.length;
        int var5 = this.field2515 * arg0;
        int var6 = this.field2532 * var3 * arg0;
        int var7 = var3 - 1;
        int var8 = var4 - 1;
        for (int var9 = 0; var9 < var4; var9 += var3) {
            int var10 = var9 + var6 & var8;
            for (int var11 = 0; var11 < var3; var11++) {
                int var12 = var9 + var11;
                int var13 = var10 + (var7 & var5 + var11);
                class32.field464[var12] = this.field2523[var13];
            }
        }
        int[] var14 = this.field2523;
        this.field2523 = class32.field464;
        class32.field464 = var14;
    }

    @OriginalMember(owner = "client!ng", name = "finalize", descriptor = "()V", line = 673)
    protected final void finalize() throws Throwable {
        field2530++;
        if (this.field2519 != -1) {
            class121.method794(this.field2519, this.field2527, this.field2531);
            this.field2519 = -1;
            this.field2527 = 0;
        }
        super.finalize();
    }
}
