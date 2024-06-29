import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class29 extends class656 {

    @OriginalMember(owner = "client!iha", name = "F", descriptor = "Ltn;")
    private class87 field470;

    @OriginalMember(owner = "client!iha", name = "m", descriptor = "Lrv;")
    private class111 field451;

    @OriginalMember(owner = "client!iha", name = "v", descriptor = "Lvia;")
    private class564 field460;

    @OriginalMember(owner = "client!iha", name = "j", descriptor = "I")
    private int field448;

    @OriginalMember(owner = "client!iha", name = "t", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client!iha", name = "l", descriptor = "I")
    private int field450;

    @OriginalMember(owner = "client!iha", name = "C", descriptor = "I")
    private int field467;

    @OriginalMember(owner = "client!iha", name = "G", descriptor = "[[F")
    private float[][] field471;

    @OriginalMember(owner = "client!iha", name = "x", descriptor = "[[F")
    private float[][] field462;

    @OriginalMember(owner = "client!iha", name = "I", descriptor = "[[F")
    private float[][] field473;

    @OriginalMember(owner = "client!iha", name = "r", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "client!iha", name = "o", descriptor = "Ldu;")
    private class360 field453;

    @OriginalMember(owner = "client!iha", name = "i", descriptor = "Lrh;")
    private class268 field447;

    @OriginalMember(owner = "client!iha", name = "H", descriptor = "Ljaclib/memory/Stream;")
    private Stream field472;

    @OriginalMember(owner = "client!iha", name = "s", descriptor = "Ljaclib/memory/Stream;")
    private Stream field457;

    @OriginalMember(owner = "client!iha", name = "z", descriptor = "Lam;")
    private class633 field464;

    @OriginalMember(owner = "client!iha", name = "w", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client!iha", name = "A", descriptor = "[I")
    public static int[] field465 = new int[14];

    @OriginalMember(owner = "client!iha", name = "k", descriptor = "Lkaa;")
    public static class47 field449 = new class47(43, 8);

    @OriginalMember(owner = "client!iha", name = "K", descriptor = "[Lbe;")
    public static class37[] field475 = new class37[14];

    @OriginalMember(owner = "client!iha", name = "J", descriptor = "I")
    public static int field474 = 0;

    @OriginalMember(owner = "client!iha", name = "n", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!iha", name = "p", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!iha", name = "q", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!iha", name = "u", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!iha", name = "B", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!iha", name = "D", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!iha", name = "E", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!iha", name = "L", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!iha", name = "y", descriptor = "Lnt;")
    public static class224 field463;

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(ZS)V")
    private final void method257(boolean arg0, short arg1) {
        if (!arg0) {
            this.method262(-40, null, -47, 7, 108);
        }
        field468++;
        if (Stream.method3739()) {
            this.field457.method3735(arg1);
        } else {
            this.field457.method3737(arg1);
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IIIIIII)V")
    private final void method258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field459++;
        long var8 = -1L;
        int var10 = arg3 + (arg4 << this.field460.field3990);
        int var11 = (arg5 << this.field460.field3990) + arg2;
        int var12 = this.field460.method1750((byte) 124, var10, var11);
        if ((arg3 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | 0xFFFFL << 16 & (long) var11 << 16;
            class656 var13 = this.field453.method2135(var8, (byte) 31);
            if (var13 != null) {
                this.method257(true, ((class361) var13).field5089);
                return;
            }
        }
        short var14 = (short) (this.field461++);
        if ((long) arg6 != var8) {
            this.field453.method2143(-1, new class361(var14), var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg3 == 0 && arg2 == 0) {
            var15 = this.field471[arg1][arg0];
            var16 = this.field462[arg1][arg0];
            var17 = this.field473[arg1][arg0];
        } else if (this.field460.field3989 == arg3 && arg2 == 0) {
            var17 = this.field473[arg1 + 1][arg0];
            var15 = this.field471[arg1 + 1][arg0];
            var16 = this.field462[arg1 + 1][arg0];
        } else if (this.field460.field3989 == arg3 && this.field460.field3989 == arg2) {
            var17 = this.field473[arg1 + 1][arg0 + 1];
            var16 = this.field462[arg1 + 1][arg0 + 1];
            var15 = this.field471[arg1 + 1][arg0 + 1];
        } else if (arg3 == 0 && this.field460.field3989 == arg2) {
            var15 = this.field471[arg1][arg0 + 1];
            var16 = this.field462[arg1][arg0 + 1];
            var17 = this.field473[arg1][arg0 + 1];
        } else {
            float var18 = (float) arg3 / (float) this.field460.field3989;
            float var19 = (float) arg2 / (float) this.field460.field3989;
            float var20 = this.field473[arg1][arg0];
            float var21 = this.field471[arg1][arg0];
            float var22 = this.field462[arg1][arg0];
            float var23 = this.field473[arg1 + 1][arg0];
            float var24 = this.field471[arg1 + 1][arg0];
            float var25 = (this.field462[arg1][arg0 + 1] - var22) * var18 + var22;
            float var26 = (this.field473[arg1][arg0 + 1] - var20) * var18 + var20;
            float var27 = (this.field473[arg1 + 1][arg0 + 1] - var23) * var18 + var23;
            float var28 = (this.field471[arg1 + 1][arg0 + 1] - var24) * var18 + var24;
            float var29 = (this.field471[arg1][arg0 + 1] - var21) * var18 + var21;
            float var30 = this.field462[arg1 + 1][arg0];
            var15 = (var28 - var29) * var19 + var29;
            float var31 = (this.field462[arg1 + 1][arg0 + 1] - var30) * var18 + var30;
            var17 = (var27 - var26) * var19 + var26;
            var16 = (var31 - var25) * var19 + var25;
        }
        float var32 = (float) (this.field470.method665(127) - var10);
        float var33 = (float) (this.field470.method669(-22096) - var12);
        float var34 = (float) (this.field470.method670((byte) -84) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var34 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field470.method673(-9);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var38 + var15 * var37 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field470.method671(false);
        int var45 = (int) ((float) ((var44 & 0xFF5D16) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF3B) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (Stream.method3739()) {
            this.field472.method3733((float) var10);
            this.field472.method3733((float) var12);
            this.field472.method3733((float) var11);
        } else {
            this.field472.method3741((float) var10);
            this.field472.method3741((float) var12);
            this.field472.method3741((float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field451.field1823 == 0) {
            this.field472.method3745(var47);
            this.field472.method3745(var46);
            this.field472.method3745(var45);
        } else {
            this.field472.method3745(var45);
            this.field472.method3745(var46);
            this.field472.method3745(var47);
        }
        this.field472.method3745(255);
        this.method257(true, var14);
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lkk;ILjava/lang/Object;)V")
    public static final void method259(class192 arg0, int arg1, Object arg2) {
        field469++;
        if (arg0.field2880 == null) {
            return;
        }
        for (int var3 = arg1; var3 < 50 && arg0.field2880.peekEvent() != null; var3++) {
            class226.method1447((byte) -124, 1L);
        }
        try {
            if (arg2 != null) {
                arg0.field2880.postEvent(new ActionEvent(arg2, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(FBFF)F")
    public static final float method260(float arg0, byte arg1, float arg2, float arg3) {
        field455++;
        int var4 = 13 / ((-arg1 - 45) / 50);
        return (arg2 - arg0) * arg3 + arg0;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)V")
    public static void method261(int arg0) {
        if (arg0 == -491) {
            field463 = null;
            field475 = null;
            field465 = null;
            field449 = null;
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(I[[ZIII)V")
    public final void method262(int arg0, boolean[][] arg1, int arg2, int arg3, int arg4) {
        field452++;
        int var6 = -59 / ((39 - arg3) / 57);
        if (this.field447 == null || (arg0 + arg4) < this.field448 || this.field458 < (arg0 - arg4) || (arg2 + arg4) < this.field450 || arg2 - arg4 > this.field467) {
            return;
        }
        for (int var7 = this.field450; var7 <= this.field467; var7++) {
            for (int var8 = this.field448; var8 <= this.field458; var8++) {
                int var9 = var8 - arg0;
                int var10 = var7 - arg2;
                if (var9 > -arg4 && arg4 > var9 && var10 > -arg4 && var10 < arg4 && arg1[arg4 + var9][arg4 + var10]) {
                    this.field451.method889((byte) 116, (byte) ((int) (this.field470.method666((byte) 110) * 255.0F)));
                    this.field451.method825(0, 8, this.field464);
                    this.field451.method898(this.field451.field1835, (byte) -15);
                    this.field451.method900(this.field447, class322.field4583, this.field456 / 3, 0, this.field461, 0, -229);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(BI)V")
    public static final void method263(byte arg0, int arg1) {
        class347.field4871 = -1;
        class663.field8853 = -1;
        class194.field2929 = arg1;
        field466++;
        if (arg0 > -38) {
            field463 = null;
        }
        class229.method1457((byte) -7);
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(B)V")
    public static final void method264(byte arg0) {
        class164.field2494.method486(((float) class411.field5711.field3893.method692(true) * 0.1F + 0.7F) * 1.1523438F);
        if (arg0 == 73) {
            field454++;
            class164.field2494.method423(class213.field3119, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
            class164.field2494.method476(class412.field5715, -1, 0);
            class164.field2494.method440(class201.field3013);
        }
    }

    @OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(Lrv;Lvia;Ltn;[I)V")
    public class29(class111 arg0, class564 arg1, class87 arg2, int[] arg3) {
        this.field470 = arg2;
        this.field451 = arg0;
        this.field460 = arg1;
        int var5 = this.field470.method673(-49) - (arg1.field3989 >> 1);
        this.field448 = this.field470.method665(108) - var5 >> arg1.field3990;
        this.field458 = var5 + this.field470.method665(114) >> arg1.field3990;
        this.field450 = this.field470.method670((byte) -87) - var5 >> arg1.field3990;
        this.field467 = var5 + this.field470.method670((byte) -98) >> arg1.field3990;
        int var6 = this.field458 + 1 - this.field448;
        int var7 = this.field467 + 1 - this.field450;
        this.field471 = new float[var6 + 1][var7 + 1];
        this.field462 = new float[var6 + 1][var7 + 1];
        this.field473 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field450 + var8;
            if (var27 > 0 && var27 < this.field460.field3996 - 1) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field448 + var28;
                    if (var29 > 0 && (this.field460.field3992 - 1) > var29) {
                        int var30 = arg1.method1742(var29 + 1, 57, var27) - arg1.method1742(var29 - 1, 108, var27);
                        int var31 = arg1.method1742(var29, 60, var27 + 1) - arg1.method1742(var29, 46, var27 - 1);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var31 * var31 + var30 * var30 + 65536)));
                        this.field473[var28][var8] = (float) var30 * var32;
                        this.field471[var28][var8] = var32 * -256.0F;
                        this.field462[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field450; var10 <= this.field467; var10++) {
            if (var10 >= 0 && arg1.field3996 > var10) {
                for (int var23 = this.field448; var23 <= this.field458; var23++) {
                    if (var23 >= 0 && arg1.field3992 > var23) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field7403[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var25.length > var26) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field456 += 3;
                                    }
                                }
                            } else {
                                this.field456 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field458 - this.field448;
            }
        }
        if (this.field456 > 0) {
            this.field453 = new class360(class737.method4119(this.field456, (byte) -128));
            this.field447 = this.field451.method818(-23469, false);
            this.field447.method585(this.field456, (byte) 102);
            NativeHeapBuffer var11 = this.field451.method829(this.field456 * 16, false, (byte) -35);
            this.field472 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field447.method587(30907, true);
                } while (var12 == null);
                this.field457 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field450; var15 <= this.field467; var15++) {
                    if (var15 >= 0 && var15 < arg1.field3996) {
                        int var16 = 0;
                        for (int var17 = this.field448; var17 <= this.field458; var17++) {
                            if (var17 >= 0 && var17 < arg1.field3992) {
                                int var18 = arg3[var14];
                                int[] var19 = arg1.field7403[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field7392[var17][var15];
                                        int[] var21 = arg1.field7401[var17][var15];
                                        int var22 = 0;
                                        label123: while (true) {
                                            while (true) {
                                                if (var19.length <= var22) {
                                                    break label123;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method258(var13, var16, var21[var22], var20[var22], var17, var15, -1);
                                                    var22++;
                                                    this.method258(var13, var16, var21[var22], var20[var22], var17, var15, -1);
                                                    var22++;
                                                    this.method258(var13, var16, var21[var22], var20[var22], var17, var15, -1);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method258(var13, var16, 0, 0, var17, var15, -1);
                                        this.method258(var13, var16, 0, arg1.field3989, var17, var15, -1);
                                        this.method258(var13, var16, arg1.field3989, 0, var17, var15, -1);
                                    } else if (var18 == 2) {
                                        this.method258(var13, var16, 0, arg1.field3989, var17, var15, -1);
                                        this.method258(var13, var16, arg1.field3989, arg1.field3989, var17, var15, -1);
                                        this.method258(var13, var16, 0, 0, var17, var15, -1);
                                    } else if (var18 == 5) {
                                        this.method258(var13, var16, arg1.field3989, arg1.field3989, var17, var15, -1);
                                        this.method258(var13, var16, arg1.field3989, 0, var17, var15, -1);
                                        this.method258(var13, var16, 0, arg1.field3989, var17, var15, -1);
                                    } else if (var18 == 4) {
                                        this.method258(var13, var16, arg1.field3989, 0, var17, var15, -1);
                                        this.method258(var13, var16, 0, 0, var17, var15, -1);
                                        this.method258(var13, var16, arg1.field3989, arg1.field3989, var17, var15, -1);
                                    }
                                }
                            }
                            var16++;
                            var14++;
                        }
                    } else {
                        var14 += this.field458 - this.field448;
                    }
                    var13++;
                }
                this.field457.method3734();
                if (this.field447.method586(-17694)) {
                    this.field472.method3734();
                    this.field464 = this.field451.method904(38, false);
                    this.field464.method2600(this.field461 * 16, var11, 24689, 16);
                    break;
                }
                this.field472.method3738(0);
                this.field453.method2138(-1);
            }
        } else {
            this.field447 = null;
            this.field464 = null;
        }
        this.field473 = this.field471 = this.field462 = null;
        this.field457 = null;
        this.field472 = null;
        this.field453 = null;
    }
}
