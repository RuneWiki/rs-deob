import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class213 extends class138 {

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "B")
    private byte field3596 = 0;

    @OriginalMember(owner = "client!ph", name = "L", descriptor = "I")
    private int field3598 = 0;

    @OriginalMember(owner = "client!ph", name = "P", descriptor = "Z")
    public boolean field3602 = false;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "B")
    private byte field3586 = 0;

    @OriginalMember(owner = "client!ph", name = "cb", descriptor = "I")
    private int field3615 = 0;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    public int field3590 = 0;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "[I")
    private int[] field3594;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "[I")
    public int[] field3581;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "[I")
    public int[] field3587;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "[I")
    public int[] field3583;

    @OriginalMember(owner = "client!ph", name = "Y", descriptor = "[I")
    private int[] field3611;

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "[S")
    private short[] field3593;

    @OriginalMember(owner = "client!ph", name = "T", descriptor = "[S")
    private short[] field3606;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "[S")
    private short[] field3585;

    @OriginalMember(owner = "client!ph", name = "V", descriptor = "[S")
    private short[] field3608;

    @OriginalMember(owner = "client!ph", name = "Q", descriptor = "[F")
    private float[] field3603;

    @OriginalMember(owner = "client!ph", name = "W", descriptor = "[F")
    private float[] field3609;

    @OriginalMember(owner = "client!ph", name = "N", descriptor = "[S")
    private short[] field3600;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "[B")
    private byte[] field3580;

    @OriginalMember(owner = "client!ph", name = "O", descriptor = "[S")
    private short[] field3601;

    @OriginalMember(owner = "client!ph", name = "S", descriptor = "[S")
    private short[] field3605;

    @OriginalMember(owner = "client!ph", name = "R", descriptor = "[S")
    private short[] field3604;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "[S")
    private short[] field3576;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "[B")
    private byte[] field3592;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "Lqc;")
    public class157 field3588;

    @OriginalMember(owner = "client!ph", name = "fb", descriptor = "Lua;")
    public class259 field3618;

    @OriginalMember(owner = "client!ph", name = "M", descriptor = "Lua;")
    private class259 field3599;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "Lua;")
    private class259 field3582;

    @OriginalMember(owner = "client!ph", name = "ab", descriptor = "Lua;")
    private class259 field3613;

    @OriginalMember(owner = "client!ph", name = "db", descriptor = "Lua;")
    private class259 field3616;

    @OriginalMember(owner = "client!ph", name = "K", descriptor = "S")
    private short field3597;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "S")
    private short field3589;

    @OriginalMember(owner = "client!ph", name = "X", descriptor = "[S")
    private short[] field3610;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "[I")
    private int[] field3584;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "Lmi;")
    private static class92 field3595 = new class92(10000);

    @OriginalMember(owner = "client!ph", name = "U", descriptor = "Lph;")
    private static class213 field3607 = new class213();

    @OriginalMember(owner = "client!ph", name = "eb", descriptor = "Lph;")
    private static class213 field3617 = new class213();

    @OriginalMember(owner = "client!ph", name = "gb", descriptor = "Lph;")
    private static class213 field3619 = new class213();

    @OriginalMember(owner = "client!ph", name = "hb", descriptor = "Lph;")
    private static class213 field3620 = new class213();

    @OriginalMember(owner = "client!ph", name = "jb", descriptor = "[I")
    private static int[] field3622 = new int[1];

    @OriginalMember(owner = "client!ph", name = "rb", descriptor = "[I")
    private static int[] field3630 = new int[1];

    @OriginalMember(owner = "client!ph", name = "ib", descriptor = "F")
    private static float field3621;

    @OriginalMember(owner = "client!ph", name = "kb", descriptor = "F")
    private static float field3623;

    @OriginalMember(owner = "client!ph", name = "mb", descriptor = "F")
    private static float field3625;

    @OriginalMember(owner = "client!ph", name = "nb", descriptor = "F")
    private static float field3626;

    @OriginalMember(owner = "client!ph", name = "pb", descriptor = "F")
    private static float field3628;

    @OriginalMember(owner = "client!ph", name = "qb", descriptor = "F")
    private static float field3629;

    @OriginalMember(owner = "client!ph", name = "lb", descriptor = "I")
    private static int field3624;

    @OriginalMember(owner = "client!ph", name = "ob", descriptor = "I")
    private static int field3627;

    @OriginalMember(owner = "client!ph", name = "sb", descriptor = "I")
    private static int field3631;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "Lcb;")
    private class34 field3578;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "Lia;")
    private class86 field3579;

    @OriginalMember(owner = "client!ph", name = "bb", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3614;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "[J")
    private static long[] field3577;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "[[I")
    private int[][] field3591;

    @OriginalMember(owner = "client!ph", name = "Z", descriptor = "[[I")
    private int[][] field3612;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "()I", line = 5)
    public final int method489() {
        if (!this.field3588.field2532) {
            this.method1514();
        }
        return this.field3588.field2528;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljm;IIIZ)V", line = 12)
    public final void method572(class123 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class213 var6 = (class213) arg0;
        if (this.field3598 == 0 || var6.field3598 == 0) {
            return;
        }
        int var7 = var6.field3590;
        int[] var8 = var6.field3581;
        int[] var9 = var6.field3587;
        int[] var10 = var6.field3583;
        short[] var11 = var6.field3593;
        short[] var12 = var6.field3606;
        short[] var13 = var6.field3585;
        short[] var14 = var6.field3608;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field3579 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field3579.field1392;
            var16 = this.field3579.field1391;
            var17 = this.field3579.field1389;
            var18 = this.field3579.field1390;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field3579 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field3579.field1392;
            var20 = var6.field3579.field1391;
            var21 = var6.field3579.field1389;
            var22 = var6.field3579.field1390;
        }
        int[] var23 = var6.field3594;
        short[] var24 = var6.field3610;
        if (!var6.field3588.field2532) {
            var6.method1514();
        }
        short var25 = var6.field3588.field2531;
        short var26 = var6.field3588.field2527;
        short var27 = var6.field3588.field2526;
        short var28 = var6.field3588.field2530;
        short var29 = var6.field3588.field2529;
        short var30 = var6.field3588.field2525;
        for (int var31 = 0; var31 < this.field3590; var31++) {
            int var32 = this.field3587[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field3581[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field3583[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field3594[var31];
                        int var37 = this.field3594[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field3610[var38] - 1;
                            if (var35 == -1 || this.field3608[var35] != 0) {
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
                                            this.field3579 = new class86();
                                            var15 = this.field3579.field1392 = class94.method755(this.field3593, -31168);
                                            var16 = this.field3579.field1391 = class94.method755(this.field3606, -31168);
                                            var17 = this.field3579.field1389 = class94.method755(this.field3585, -31168);
                                            var18 = this.field3579.field1390 = class94.method755(this.field3608, -31168);
                                        }
                                        if (var19 == null) {
                                            class86 var44 = var6.field3579 = new class86();
                                            var19 = var44.field1392 = class94.method755(var11, -31168);
                                            var20 = var44.field1391 = class94.method755(var12, -31168);
                                            var21 = var44.field1389 = class94.method755(var13, -31168);
                                            var22 = var44.field1390 = class94.method755(var14, -31168);
                                        }
                                        short var45 = this.field3593[var35];
                                        short var46 = this.field3606[var35];
                                        short var47 = this.field3585[var35];
                                        short var48 = this.field3608[var35];
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
                                        int var57 = this.field3594[var31];
                                        int var58 = this.field3594[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field3610[var59] - 1;
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

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "()V", line = 251)
    private final void method1480() {
        GL var1 = class154.field2479;
        if (this.field3598 == 0) {
            return;
        }
        if (this.field3596 != 0) {
            this.method1512(true, !this.field3618.field4367 && (this.field3596 & 0x1) != 0, !this.field3599.field4367 && (this.field3596 & 0x2) != 0, this.field3582 != null && !this.field3582.field4367 && (this.field3596 & 0x4) != 0, false);
        }
        this.method1512(false, !this.field3618.field4367, !this.field3599.field4367, this.field3582 != null && !this.field3582.field4367, !this.field3613.field4367);
        if (!this.field3616.field4367) {
            this.method1504();
        }
        if (this.field3586 != 0) {
            if ((this.field3586 & 0x1) != 0) {
                this.field3581 = null;
                this.field3587 = null;
                this.field3583 = null;
                this.field3610 = null;
                this.field3594 = null;
            }
            if ((this.field3586 & 0x2) != 0) {
                this.field3600 = null;
                this.field3580 = null;
            }
            if ((this.field3586 & 0x4) != 0) {
                this.field3593 = null;
                this.field3606 = null;
                this.field3585 = null;
                this.field3608 = null;
            }
            if ((this.field3586 & 0x8) != 0) {
                this.field3603 = null;
                this.field3609 = null;
            }
            if ((this.field3586 & 0x10) != 0) {
                this.field3601 = null;
                this.field3605 = null;
                this.field3604 = null;
            }
            this.field3586 = 0;
        }
        class34 var2 = null;
        if (this.field3618.field4366 != null) {
            this.field3618.field4366.method221();
            var2 = this.field3618.field4366;
            var1.glVertexPointer(3, 5126, this.field3618.field4364, (long) this.field3618.field4369);
        }
        if (this.field3599.field4366 != null) {
            if (this.field3599.field4366 != var2) {
                this.field3599.field4366.method221();
                var2 = this.field3599.field4366;
            }
            var1.glColorPointer(4, 5121, this.field3599.field4364, (long) this.field3599.field4369);
        }
        if (client.field5162 && this.field3582.field4366 != null) {
            if (this.field3582.field4366 != var2) {
                this.field3582.field4366.method221();
                var2 = this.field3582.field4366;
            }
            var1.glNormalPointer(5126, this.field3582.field4364, (long) this.field3582.field4369);
        }
        if (this.field3613.field4366 != null) {
            if (this.field3613.field4366 != var2) {
                this.field3613.field4366.method221();
                class34 var3 = this.field3613.field4366;
            }
            var1.glTexCoordPointer(2, 5126, this.field3613.field4364, (long) this.field3613.field4369);
        }
        if (this.field3616.field4366 != null) {
            this.field3616.field4366.method224();
        }
        if (this.field3618.field4366 == null || this.field3599.field4366 == null || client.field5162 && this.field3582.field4366 == null || this.field3613.field4366 == null) {
            if (class154.field2461) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field3618.field4366 == null) {
                this.field3618.field4362.position(this.field3618.field4369);
                var1.glVertexPointer(3, 5126, this.field3618.field4364, this.field3618.field4362);
            }
            if (this.field3599.field4366 == null) {
                this.field3599.field4362.position(this.field3599.field4369);
                var1.glColorPointer(4, 5121, this.field3599.field4364, this.field3599.field4362);
            }
            if (client.field5162 && this.field3582.field4366 == null) {
                this.field3582.field4362.position(this.field3582.field4369);
                var1.glNormalPointer(5126, this.field3582.field4364, this.field3582.field4362);
            }
            if (this.field3613.field4366 == null) {
                this.field3613.field4362.position(this.field3613.field4369);
                var1.glTexCoordPointer(2, 5126, this.field3613.field4364, this.field3613.field4362);
            }
        }
        if (this.field3616.field4366 == null && class154.field2461) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field3584.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field3584[var5];
            int var7 = this.field3584[var5 + 1];
            short var8 = this.field3576[var6];
            if (var8 == -1) {
                class154.method1141(-1);
                class135.method1024(0, -111, 0);
            } else {
                class23.field248.method183(var8 & 0xFFFF, -27048);
            }
            if (this.field3616.field4366 == null) {
                this.field3616.field4362.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field3616.field4362);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(SS)V", line = 424)
    public final void method1481(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3598; var3++) {
            if (this.field3576[var3] == arg0) {
                this.field3576[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class23.field248.method179(arg0 & 0xFFFF, (byte) -46);
            var5 = class23.field248.method188(arg0 & 0xFFFF, 0);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class23.field248.method179(arg1 & 0xFFFF, (byte) -64);
            var7 = class23.field248.method188(arg1 & 0xFFFF, 0);
        }
        if (var4 != var6 || var5 != var7) {
            this.field3599.field4367 = false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "()I", line = 458)
    public final int method504() {
        if (!this.field3588.field2532) {
            this.method1514();
        }
        return this.field3588.field2526;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIII[FIF)V", line = 464)
    private static final void method1482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
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
        field3628 = var16;
        field3623 = var17;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZZZZZZZZZZZ)Lph;", line = 513)
    public final class213 method1483(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class213 var12 = new class213();
        var12.field3590 = this.field3590;
        var12.field3615 = this.field3615;
        var12.field3598 = this.field3598;
        if (arg0) {
            var12.field3581 = this.field3581;
            var12.field3583 = this.field3583;
        } else {
            var12.field3581 = class22.method100(this.field3581, 0);
            var12.field3583 = class22.method100(this.field3583, 0);
        }
        if (arg1) {
            var12.field3587 = this.field3587;
        } else {
            var12.field3587 = class22.method100(this.field3587, 0);
        }
        if (arg0 && arg1) {
            var12.field3618 = this.field3618;
            var12.field3588 = this.field3588;
        } else {
            var12.field3618 = new class259();
            var12.field3588 = new class157();
        }
        if (arg2) {
            var12.field3600 = this.field3600;
        } else {
            var12.field3600 = class94.method755(this.field3600, -31168);
        }
        if (arg3) {
            var12.field3580 = this.field3580;
        } else {
            var12.field3580 = class7.method29((byte) 27, this.field3580);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !client.field5162) {
            var12.field3599 = new class259();
        } else {
            var12.field3599 = this.field3599;
        }
        if (arg5) {
            var12.field3593 = this.field3593;
            var12.field3606 = this.field3606;
            var12.field3585 = this.field3585;
            var12.field3608 = this.field3608;
        } else {
            var12.field3593 = class94.method755(this.field3593, -31168);
            var12.field3606 = class94.method755(this.field3606, -31168);
            var12.field3585 = class94.method755(this.field3585, -31168);
            var12.field3608 = class94.method755(this.field3608, -31168);
        }
        if (!client.field5162) {
            var12.field3582 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field3582 = this.field3582;
        } else {
            var12.field3582 = new class259();
        }
        if (arg8) {
            var12.field3603 = this.field3603;
            var12.field3609 = this.field3609;
            var12.field3613 = this.field3613;
        } else {
            var12.field3603 = class60.method390(this.field3603, 53);
            var12.field3609 = class60.method390(this.field3609, -128);
            var12.field3613 = new class259();
        }
        if (arg9) {
            var12.field3601 = this.field3601;
            var12.field3605 = this.field3605;
            var12.field3604 = this.field3604;
            var12.field3616 = this.field3616;
        } else {
            var12.field3601 = class94.method755(this.field3601, -31168);
            var12.field3605 = class94.method755(this.field3605, -31168);
            var12.field3604 = class94.method755(this.field3604, -31168);
            var12.field3616 = new class259();
        }
        if (arg10) {
            var12.field3576 = this.field3576;
        } else {
            var12.field3576 = class94.method755(this.field3576, -31168);
        }
        var12.field3611 = this.field3611;
        var12.field3591 = this.field3591;
        var12.field3592 = this.field3592;
        var12.field3612 = this.field3612;
        var12.field3584 = this.field3584;
        var12.field3610 = this.field3610;
        var12.field3594 = this.field3594;
        var12.field3597 = this.field3597;
        var12.field3589 = this.field3589;
        return var12;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)Ljm;", line = 646)
    public final class123 method588(int arg0, int arg1, int arg2) {
        this.field3602 = false;
        if (this.field3579 != null) {
            this.field3593 = this.field3579.field1392;
            this.field3606 = this.field3579.field1391;
            this.field3585 = this.field3579.field1389;
            this.field3608 = this.field3579.field1390;
            this.field3579 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)V", line = 659)
    public final void method1484(int arg0) {
        this.field3597 = (short) arg0;
        this.field3599.field4367 = false;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(SS)V", line = 665)
    public final void method1485(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3598; var3++) {
            if (this.field3600[var3] == arg0) {
                this.field3600[var3] = arg1;
            }
        }
        this.field3599.field4367 = false;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V", line = 678)
    public final void method497(int arg0) {
        int var2 = class23.field245[arg0];
        int var3 = class23.field254[arg0];
        for (int var4 = 0; var4 < this.field3590; var4++) {
            int var5 = this.field3587[var4] * var3 - this.field3583[var4] * var2 >> 16;
            this.field3583[var4] = this.field3587[var4] * var2 + this.field3583[var4] * var3 >> 16;
            this.field3587[var4] = var5;
        }
        this.field3588.field2532 = false;
        this.field3618.field4367 = false;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIII)V", line = 699)
    public final void method483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3615 == 0) {
            return;
        }
        GL var8 = class154.field2479;
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
        this.method1480();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)V", line = 722)
    public final void method1486(int arg0) {
        this.field3589 = (short) arg0;
        if (this.field3582 != null) {
            this.field3582.field4367 = false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[IIIIZ)V", line = 730)
    private final void method1487(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field3624 = 0;
            field3631 = 0;
            field3627 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field3591.length) {
                    int[] var14 = this.field3591[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field3624 += this.field3581[var16];
                        field3631 += this.field3587[var16];
                        field3627 += this.field3583[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field3624 = field3624 / var11 + var8;
                field3631 = field3631 / var11 + var9;
                field3627 = field3627 / var11 + var10;
            } else {
                field3624 = var8;
                field3631 = var9;
                field3627 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field3591.length) {
                    int[] var22 = this.field3591[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field3581[var24] += var17;
                        this.field3587[var24] += var18;
                        this.field3583[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field3591.length) {
                    int[] var27 = this.field3591[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field3581[var29] -= field3624;
                        this.field3587[var29] -= field3631;
                        this.field3583[var29] -= field3627;
                        if (arg4 != 0) {
                            int var30 = class23.field245[arg4];
                            int var31 = class23.field254[arg4];
                            int var32 = this.field3587[var29] * var30 + this.field3581[var29] * var31 + 32767 >> 16;
                            this.field3587[var29] = this.field3587[var29] * var31 + 32767 - this.field3581[var29] * var30 >> 16;
                            this.field3581[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class23.field245[arg2];
                            int var34 = class23.field254[arg2];
                            int var35 = this.field3587[var29] * var34 + 32767 - this.field3583[var29] * var33 >> 16;
                            this.field3583[var29] = this.field3587[var29] * var33 + this.field3583[var29] * var34 + 32767 >> 16;
                            this.field3587[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class23.field245[arg3];
                            int var37 = class23.field254[arg3];
                            int var38 = this.field3583[var29] * var36 + this.field3581[var29] * var37 + 32767 >> 16;
                            this.field3583[var29] = this.field3583[var29] * var37 + 32767 - this.field3581[var29] * var36 >> 16;
                            this.field3581[var29] = var38;
                        }
                        this.field3581[var29] += field3624;
                        this.field3587[var29] += field3631;
                        this.field3583[var29] += field3627;
                    }
                }
            }
            if (arg5 && this.field3593 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field3591.length) {
                        int[] var41 = this.field3591[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field3594[var43];
                            int var45 = this.field3594[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field3610[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class23.field245[arg4];
                                    int var49 = class23.field254[arg4];
                                    int var50 = this.field3606[var47] * var48 + this.field3593[var47] * var49 + 32767 >> 16;
                                    this.field3606[var47] = (short) (this.field3606[var47] * var49 + 32767 - this.field3593[var47] * var48 >> 16);
                                    this.field3593[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class23.field245[arg2];
                                    int var52 = class23.field254[arg2];
                                    int var53 = this.field3606[var47] * var52 + 32767 - this.field3585[var47] * var51 >> 16;
                                    this.field3585[var47] = (short) (this.field3606[var47] * var51 + this.field3585[var47] * var52 + 32767 >> 16);
                                    this.field3606[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class23.field245[arg3];
                                    int var55 = class23.field254[arg3];
                                    int var56 = this.field3593[var47] * var55 + this.field3585[var47] * var54 + 32767 >> 16;
                                    this.field3585[var47] = (short) (this.field3585[var47] * var55 + 32767 - this.field3593[var47] * var54 >> 16);
                                    this.field3593[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field3582 != null) {
                    this.field3582.field4367 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field3591.length) {
                    int[] var59 = this.field3591[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field3581[var61] -= field3624;
                        this.field3587[var61] -= field3631;
                        this.field3583[var61] -= field3627;
                        this.field3581[var61] = this.field3581[var61] * arg2 >> 7;
                        this.field3587[var61] = this.field3587[var61] * arg3 >> 7;
                        this.field3583[var61] = this.field3583[var61] * arg4 >> 7;
                        this.field3581[var61] += field3624;
                        this.field3587[var61] += field3631;
                        this.field3583[var61] += field3627;
                    }
                }
            }
        } else if (arg0 == 5 && this.field3612 != null && this.field3580 != null) {
            for (int var62 = 0; var62 < var7; var62++) {
                int var63 = arg1[var62];
                if (var63 < this.field3612.length) {
                    int[] var64 = this.field3612[var63];
                    for (int var65 = 0; var65 < var64.length; var65++) {
                        int var66 = var64[var65];
                        int var67 = (this.field3580[var66] & 0xFF) + arg2 * 8;
                        if (var67 < 0) {
                            var67 = 0;
                        } else if (var67 > 255) {
                            var67 = 255;
                        }
                        this.field3580[var66] = (byte) var67;
                    }
                    if (var64.length > 0) {
                        this.field3599.field4367 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lqd;IZ)V", line = 1073)
    public final void method475(class170 arg0, int arg1, boolean arg2) {
        if (this.field3591 == null || arg1 == -1) {
            return;
        }
        class83 var4 = arg0.field2766[arg1];
        class289 var5 = var4.field1370;
        for (int var6 = 0; var6 < this.field3590; var6++) {
            this.field3581[var6] <<= 0x4;
            this.field3587[var6] <<= 0x4;
            this.field3583[var6] <<= 0x4;
        }
        field3624 = 0;
        field3631 = 0;
        field3627 = 0;
        for (int var7 = 0; var7 < var4.field1371; var7++) {
            short var8 = var4.field1372[var7];
            if (var4.field1364[var7] != -1) {
                this.method1487(0, var5.field4918[var4.field1364[var7]], 0, 0, 0, arg2);
            }
            this.method1487(var5.field4921[var8], var5.field4918[var8], var4.field1374[var7], var4.field1368[var7], var4.field1365[var7], arg2);
        }
        for (int var9 = 0; var9 < this.field3590; var9++) {
            this.field3581[var9] >>= 0x4;
            this.field3587[var9] >>= 0x4;
            this.field3583[var9] >>= 0x4;
        }
        this.field3588.field2532 = false;
        this.field3618.field4367 = false;
    }

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "()V", line = 1128)
    public final void method486() {
        for (int var1 = 0; var1 < this.field3590; var1++) {
            int var2 = this.field3583[var1];
            this.field3583[var1] = this.field3581[var1];
            this.field3581[var1] = -var2;
        }
        this.field3588.field2532 = false;
        this.field3618.field4367 = false;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(III)V", line = 1146)
    public final void method477(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3590; var4++) {
            this.field3581[var4] += arg0;
            this.field3587[var4] += arg1;
            this.field3583[var4] += arg2;
        }
        this.field3588.field2532 = false;
        this.field3618.field4367 = false;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lqa;IJIIIIFF)S", line = 1160)
    private final short method1488(class76 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field3594[arg1];
        int var12 = this.field3594[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field3610[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field3577[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field3610[var13] = (short) (this.field3615 + 1);
        field3577[var13] = arg2;
        this.field3593[this.field3615] = (short) arg3;
        this.field3606[this.field3615] = (short) arg4;
        this.field3585[this.field3615] = (short) arg5;
        this.field3608[this.field3615] = (short) arg6;
        this.field3603[this.field3615] = arg7;
        this.field3609[this.field3615] = arg8;
        return (short) (this.field3615++);
    }

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "()V", line = 1195)
    public static void method1489() {
        field3577 = null;
        field3595 = null;
        field3614 = null;
        field3607 = null;
        field3617 = null;
        field3619 = null;
        field3620 = null;
        field3630 = null;
        field3622 = null;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(III)V", line = 1208)
    public final void method499(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3590; var4++) {
            this.field3581[var4] = this.field3581[var4] * arg0 >> 7;
            this.field3587[var4] = this.field3587[var4] * arg1 >> 7;
            this.field3583[var4] = this.field3583[var4] * arg2 >> 7;
        }
        this.field3588.field2532 = false;
        this.field3618.field4367 = false;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 1221)
    private static final void method1490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
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
        field3626 = var18;
        field3621 = var19;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIII)Z", line = 1300)
    private final boolean method1491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "()V", line = 1317)
    public final void method1492() {
        for (int var1 = 0; var1 < this.field3590; var1++) {
            this.field3583[var1] = -this.field3583[var1];
        }
        if (this.field3585 != null) {
            for (int var2 = 0; var2 < this.field3615; var2++) {
                this.field3585[var2] = (short) (-this.field3585[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field3598; var3++) {
            short var4 = this.field3601[var3];
            this.field3601[var3] = this.field3604[var3];
            this.field3604[var3] = var4;
        }
        this.field3588.field2532 = false;
        this.field3618.field4367 = false;
        if (this.field3582 != null) {
            this.field3582.field4367 = false;
        }
        this.field3616.field4367 = false;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "()I", line = 1353)
    public final int method478() {
        if (!this.field3588.field2532) {
            this.method1514();
        }
        return this.field3588.field2525;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([SI)[S", line = 1360)
    private static final short[] method1493(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class231.method1638(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIII[FFIF)V", line = 1366)
    private static final void method1494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
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
        field3629 = var16;
        field3625 = var17;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIII)V", line = 1412)
    private final void method1495(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field3624 = 0;
            field3631 = 0;
            field3627 = 0;
            for (int var6 = 0; var6 < this.field3590; var6++) {
                field3624 += this.field3581[var6];
                field3631 += this.field3587[var6];
                field3627 += this.field3583[var6];
                var5++;
            }
            if (var5 > 0) {
                field3624 = field3624 / var5 + arg1;
                field3631 = field3631 / var5 + arg2;
                field3627 = field3627 / var5 + arg3;
            } else {
                field3624 = arg1;
                field3631 = arg2;
                field3627 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field3590; var7++) {
                this.field3581[var7] += arg1;
                this.field3587[var7] += arg2;
                this.field3583[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field3590; var8++) {
                this.field3581[var8] -= field3624;
                this.field3587[var8] -= field3631;
                this.field3583[var8] -= field3627;
                if (arg3 != 0) {
                    int var9 = class23.field245[arg3];
                    int var10 = class23.field254[arg3];
                    int var11 = this.field3587[var8] * var9 + this.field3581[var8] * var10 + 32767 >> 16;
                    this.field3587[var8] = this.field3587[var8] * var10 + 32767 - this.field3581[var8] * var9 >> 16;
                    this.field3581[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class23.field245[arg1];
                    int var13 = class23.field254[arg1];
                    int var14 = this.field3587[var8] * var13 + 32767 - this.field3583[var8] * var12 >> 16;
                    this.field3583[var8] = this.field3587[var8] * var12 + this.field3583[var8] * var13 + 32767 >> 16;
                    this.field3587[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class23.field245[arg2];
                    int var16 = class23.field254[arg2];
                    int var17 = this.field3583[var8] * var15 + this.field3581[var8] * var16 + 32767 >> 16;
                    this.field3583[var8] = this.field3583[var8] * var16 + 32767 - this.field3581[var8] * var15 >> 16;
                    this.field3581[var8] = var17;
                }
                this.field3581[var8] += field3624;
                this.field3587[var8] += field3631;
                this.field3583[var8] += field3627;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field3590; var18++) {
                this.field3581[var18] -= field3624;
                this.field3587[var18] -= field3631;
                this.field3583[var18] -= field3627;
                this.field3581[var18] = this.field3581[var18] * arg1 / 128;
                this.field3587[var18] = this.field3587[var18] * arg2 / 128;
                this.field3583[var18] = this.field3583[var18] * arg3 / 128;
                this.field3581[var18] += field3624;
                this.field3587[var18] += field3631;
                this.field3583[var18] += field3627;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field3598; var19++) {
                int var20 = (this.field3580[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field3580[var19] = (byte) var20;
            }
            this.field3599.field4367 = false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V", line = 1567)
    public final void method487(int arg0) {
        int var2 = class23.field245[arg0];
        int var3 = class23.field254[arg0];
        for (int var4 = 0; var4 < this.field3590; var4++) {
            int var5 = this.field3587[var4] * var2 + this.field3581[var4] * var3 >> 16;
            this.field3587[var4] = this.field3587[var4] * var3 - this.field3581[var4] * var2 >> 16;
            this.field3581[var4] = var5;
        }
        this.field3588.field2532 = false;
        this.field3618.field4367 = false;
    }

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "()V", line = 1587)
    public final void method1496() {
        if (this.field3593 == null) {
            this.method501();
            return;
        }
        for (int var1 = 0; var1 < this.field3590; var1++) {
            int var2 = this.field3581[var1];
            this.field3581[var1] = this.field3583[var1];
            this.field3583[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field3615; var3++) {
            short var4 = this.field3593[var3];
            this.field3593[var3] = this.field3585[var3];
            this.field3585[var3] = (short) (-var4);
        }
        this.field3588.field2532 = false;
        this.field3618.field4367 = false;
        if (this.field3582 != null) {
            this.field3582.field4367 = false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "()I", line = 1625)
    public final int method479() {
        if (!this.field3588.field2532) {
            this.method1514();
        }
        return this.field3588.field2529;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lfd;)Lfd;", line = 1633)
    public final class61 method1497(class61 arg0) {
        if (this.field3615 == 0) {
            return null;
        }
        if (!this.field3588.field2532) {
            this.method1514();
        }
        int var2;
        int var3;
        if (class179.field2861 > 0) {
            var2 = this.field3588.field2526 - (class179.field2861 * this.field3588.field2527 >> 8) >> 3;
            var3 = this.field3588.field2530 - (class179.field2861 * this.field3588.field2531 >> 8) >> 3;
        } else {
            var2 = this.field3588.field2526 - (class179.field2861 * this.field3588.field2531 >> 8) >> 3;
            var3 = this.field3588.field2530 - (class179.field2861 * this.field3588.field2527 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class179.field2853 > 0) {
            var4 = this.field3588.field2529 - (class179.field2853 * this.field3588.field2527 >> 8) >> 3;
            var5 = this.field3588.field2525 - (class179.field2853 * this.field3588.field2531 >> 8) >> 3;
        } else {
            var4 = this.field3588.field2529 - (class179.field2853 * this.field3588.field2531 >> 8) >> 3;
            var5 = this.field3588.field2525 - (class179.field2853 * this.field3588.field2527 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class61 var8;
        if (arg0 == null || arg0.field880.length < var6 * var7) {
            var8 = new class61(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field262 = arg0.field276 = var6;
            arg0.field259 = arg0.field261 = var7;
            arg0.method396();
        }
        var8.field270 = var2;
        var8.field265 = var4;
        if (field3630.length < this.field3615) {
            field3630 = new int[this.field3615];
            field3622 = new int[this.field3615];
        }
        for (int var9 = 0; var9 < this.field3590; var9++) {
            int var10 = (this.field3581[var9] - (this.field3587[var9] * class179.field2861 >> 8) >> 3) - var2;
            int var11 = (this.field3583[var9] - (this.field3587[var9] * class179.field2853 >> 8) >> 3) - var4;
            int var12 = this.field3594[var9];
            int var13 = this.field3594[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field3610[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field3630[var15] = var10;
                field3622[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field3598; var16++) {
            if (this.field3580[var16] <= 128) {
                short var17 = this.field3601[var16];
                short var18 = this.field3605[var16];
                short var19 = this.field3604[var16];
                int var20 = field3630[var17];
                int var21 = field3630[var18];
                int var22 = field3630[var19];
                int var23 = field3622[var17];
                int var24 = field3622[var18];
                int var25 = field3622[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class23.method106(var8.field880, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "()Z", line = 1759)
    public final boolean method578() {
        return this.field3602 && this.field3581 != null && this.field3593 != null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([FI)[F", line = 1763)
    private static final float[] method1498(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class231.method1636(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V", line = 3756)
    private class213() {
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lqa;IIZ)V", line = 3759)
    public class213(class76 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field1262];
        this.field3594 = new int[arg0.field1240 + 1];
        for (int var6 = 0; var6 < arg0.field1262; var6++) {
            if ((arg0.field1271 == null || arg0.field1271[var6] != 2) && (arg0.field1243 == null || arg0.field1243[var6] == -1 || !class23.field248.method191((byte) 69, arg0.field1243[var6] & 0xFFFF))) {
                var5[this.field3598++] = var6;
                this.field3594[arg0.field1257[var6]]++;
                this.field3594[arg0.field1254[var6]]++;
                this.field3594[arg0.field1239[var6]]++;
            }
        }
        long[] var7 = new long[this.field3598];
        for (int var8 = 0; var8 < this.field3598; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field1243 != null) {
                var14 = arg0.field1243[var9];
                if (var14 != -1) {
                    var12 = class23.field248.method192(var14 & 0xFFFF, 255);
                    var13 = class23.field248.method181(var14 & 0xFFFF, 255);
                }
            }
            boolean var15 = arg0.field1250 != null && arg0.field1250[var9] != 0 || var14 != -1 && !class23.field248.method180((byte) 75, var14 & 0xFFFF);
            if ((arg3 || var15) && arg0.field1232 != null) {
                var10 += arg0.field1232[var9] << 17;
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
        class182.method1278(var7, var5, (byte) -63);
        this.field3590 = arg0.field1240;
        this.field3581 = arg0.field1263;
        this.field3587 = arg0.field1245;
        this.field3583 = arg0.field1268;
        this.field3611 = arg0.field1238;
        int var20 = this.field3598 * 3;
        this.field3593 = new short[var20];
        this.field3606 = new short[var20];
        this.field3585 = new short[var20];
        this.field3608 = new short[var20];
        this.field3603 = new float[var20];
        this.field3609 = new float[var20];
        this.field3600 = new short[this.field3598];
        this.field3580 = new byte[this.field3598];
        this.field3601 = new short[this.field3598];
        this.field3605 = new short[this.field3598];
        this.field3604 = new short[this.field3598];
        this.field3576 = new short[this.field3598];
        if (arg0.field1264 != null) {
            this.field3592 = new byte[this.field3598];
        }
        this.field3588 = new class157();
        this.field3618 = new class259();
        this.field3599 = new class259();
        if (client.field5162) {
            this.field3582 = new class259();
        }
        this.field3613 = new class259();
        this.field3616 = new class259();
        this.field3597 = (short) arg1;
        this.field3589 = (short) arg2;
        this.field3610 = new short[var20];
        field3577 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field1240; var22++) {
            int var23 = this.field3594[var22];
            this.field3594[var22] = var21;
            var21 += var23;
        }
        this.field3594[arg0.field1240] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field1256 != null) {
            int var28 = arg0.field1266;
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
            for (int var36 = 0; var36 < this.field3598; var36++) {
                int var37 = var5[var36];
                if (arg0.field1256[var37] != -1) {
                    int var38 = arg0.field1256[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field1257[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field1254[var37];
                        } else {
                            var40 = arg0.field1239[var37];
                        }
                        int var41 = arg0.field1263[var40];
                        int var42 = arg0.field1245[var40];
                        int var43 = arg0.field1268[var40];
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
                byte var45 = arg0.field1236[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field1241[var44];
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
                        var49 = 64.0F / (float) (arg0.field1259[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field1241[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field1259[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field1244[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field1241[var44] / 1024.0F;
                        var49 = (float) arg0.field1259[var44] / 1024.0F;
                        var48 = (float) arg0.field1244[var44] / 1024.0F;
                    }
                    var27[var44] = method1502(arg0.field1237[var44], arg0.field1265[var44], arg0.field1226[var44], arg0.field1225[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field3598; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field1248[var51] & 0xFFFF;
            short var53;
            if (arg0.field1243 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field1243[var51];
            }
            int var54;
            if (arg0.field1256 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field1256[var51];
            }
            int var55;
            if (arg0.field1250 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field1250[var51] & 0xFF;
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
                    byte var65 = arg0.field1236[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field1257[var51];
                        int var67 = arg0.field1254[var51];
                        int var68 = arg0.field1239[var51];
                        short var69 = arg0.field1237[var54];
                        short var70 = arg0.field1265[var54];
                        short var71 = arg0.field1226[var54];
                        float var72 = (float) arg0.field1263[var69];
                        float var73 = (float) arg0.field1245[var69];
                        float var74 = (float) arg0.field1268[var69];
                        float var75 = (float) arg0.field1263[var70] - var72;
                        float var76 = (float) arg0.field1245[var70] - var73;
                        float var77 = (float) arg0.field1268[var70] - var74;
                        float var78 = (float) arg0.field1263[var71] - var72;
                        float var79 = (float) arg0.field1245[var71] - var73;
                        float var80 = (float) arg0.field1268[var71] - var74;
                        float var81 = (float) arg0.field1263[var66] - var72;
                        float var82 = (float) arg0.field1245[var66] - var73;
                        float var83 = (float) arg0.field1268[var66] - var74;
                        float var84 = (float) arg0.field1263[var67] - var72;
                        float var85 = (float) arg0.field1245[var67] - var73;
                        float var86 = (float) arg0.field1268[var67] - var74;
                        float var87 = (float) arg0.field1263[var68] - var72;
                        float var88 = (float) arg0.field1245[var68] - var73;
                        float var89 = (float) arg0.field1268[var68] - var74;
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
                        int var101 = arg0.field1257[var51];
                        int var102 = arg0.field1254[var51];
                        int var103 = arg0.field1239[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field1255[var54];
                        float var109 = (float) arg0.field1233[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field1244[var54] & 0xFFFF) / 1024.0F;
                            method1494(arg0.field1263[var101], arg0.field1245[var101], arg0.field1268[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field3629;
                            var57 = field3625;
                            method1494(arg0.field1263[var102], arg0.field1245[var102], arg0.field1268[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field3629;
                            var59 = field3625;
                            method1494(arg0.field1263[var103], arg0.field1245[var103], arg0.field1268[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field3629;
                            var61 = field3625;
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
                            float var112 = (float) arg0.field1230[var54] / 256.0F;
                            float var113 = (float) arg0.field1247[var54] / 256.0F;
                            int var114 = arg0.field1263[var102] - arg0.field1263[var101];
                            int var115 = arg0.field1245[var102] - arg0.field1245[var101];
                            int var116 = arg0.field1268[var102] - arg0.field1268[var101];
                            int var117 = arg0.field1263[var103] - arg0.field1263[var101];
                            int var118 = arg0.field1245[var103] - arg0.field1245[var101];
                            int var119 = arg0.field1268[var103] - arg0.field1268[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field1241[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field1259[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field1244[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method1506(var126, var127, var128);
                            method1490(arg0.field1263[var101], arg0.field1245[var101], arg0.field1268[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field3626;
                            var57 = field3621;
                            method1490(arg0.field1263[var102], arg0.field1245[var102], arg0.field1268[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field3626;
                            var59 = field3621;
                            method1490(arg0.field1263[var103], arg0.field1245[var103], arg0.field1268[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field3626;
                            var61 = field3621;
                        } else if (var65 == 3) {
                            method1482(arg0.field1263[var101], arg0.field1245[var101], arg0.field1268[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field3628;
                            var57 = field3623;
                            method1482(arg0.field1263[var102], arg0.field1245[var102], arg0.field1268[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field3628;
                            var59 = field3623;
                            method1482(arg0.field1263[var103], arg0.field1245[var103], arg0.field1268[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field3628;
                            var61 = field3623;
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
            arg0.method590();
            byte var129;
            if (arg0.field1271 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field1271[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field1257[var51];
                class124 var133 = arg0.field1228[var132];
                this.field3601[var50] = this.method1488(arg0, var132, var130, var133.field2048, var133.field2057, var133.field2054, var133.field2051, var56, var57);
                int var134 = arg0.field1254[var51];
                class124 var135 = arg0.field1228[var134];
                this.field3605[var50] = this.method1488(arg0, var134, (long) var62 + var130, var135.field2048, var135.field2057, var135.field2054, var135.field2051, var58, var59);
                int var136 = arg0.field1239[var51];
                class124 var137 = arg0.field1228[var136];
                this.field3604[var50] = this.method1488(arg0, var136, (long) var63 + var130, var137.field2048, var137.field2057, var137.field2054, var137.field2051, var60, var61);
            } else if (var129 == 1) {
                class156 var138 = arg0.field1227[var51];
                long var139 = (long) ((var54 << 2) + (var138.field2506 > 0 ? 1024 : 2048) + (var138.field2518 + 256 << 12) + (var138.field2521 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field3601[var50] = this.method1488(arg0, arg0.field1257[var51], var139, var138.field2506, var138.field2518, var138.field2521, 0, var56, var57);
                this.field3605[var50] = this.method1488(arg0, arg0.field1254[var51], (long) var62 + var139, var138.field2506, var138.field2518, var138.field2521, 0, var58, var59);
                this.field3604[var50] = this.method1488(arg0, arg0.field1239[var51], (long) var63 + var139, var138.field2506, var138.field2518, var138.field2521, 0, var60, var61);
            }
            if (arg0.field1243 == null) {
                this.field3576[var50] = -1;
            } else {
                this.field3576[var50] = arg0.field1243[var51];
            }
            if (this.field3592 != null) {
                this.field3592[var50] = (byte) arg0.field1264[var51];
            }
            this.field3600[var50] = arg0.field1248[var51];
            if (arg0.field1250 != null) {
                this.field3580[var50] = arg0.field1250[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field3598; var143++) {
            short var144 = this.field3576[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field3584 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field3598; var147++) {
            short var148 = this.field3576[var147];
            if (var146 != var148) {
                this.field3584[var145++] = var147;
                var146 = var148;
            }
        }
        this.field3584[var145] = this.field3598;
        field3577 = null;
        this.field3593 = method1493(this.field3593, this.field3615);
        this.field3606 = method1493(this.field3606, this.field3615);
        this.field3585 = method1493(this.field3585, this.field3615);
        this.field3608 = method1493(this.field3608, this.field3615);
        this.field3603 = method1498(this.field3603, this.field3615);
        this.field3609 = method1498(this.field3609, this.field3615);
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(ZZ)Lab;", line = 1772)
    public final class138 method482(boolean arg0, boolean arg1) {
        return this.method1510(arg0, arg1, field3620, field3619);
    }

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "()V", line = 1776)
    public final void method1499() {
        if (this.field3593 == null) {
            this.method486();
            return;
        }
        for (int var1 = 0; var1 < this.field3590; var1++) {
            int var2 = this.field3583[var1];
            this.field3583[var1] = this.field3581[var1];
            this.field3581[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field3615; var3++) {
            short var4 = this.field3585[var3];
            this.field3585[var3] = this.field3593[var3];
            this.field3593[var3] = (short) (-var4);
        }
        this.field3588.field2532 = false;
        this.field3618.field4367 = false;
        if (this.field3582 != null) {
            this.field3582.field4367 = false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "()V", line = 1814)
    public final void method1500() {
        int var10002;
        if (this.field3611 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3590; var3++) {
                int var4 = this.field3611[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field3591 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field3591[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field3590) {
                int var7 = this.field3611[var6] & 0xFF;
                this.field3591[var7][var1[var7]++] = var6++;
            }
            this.field3611 = null;
        }
        if (this.field3592 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3598; var10++) {
            int var11 = this.field3592[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field3612 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field3612[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field3598) {
            int var14 = this.field3592[var13] & 0xFF;
            this.field3612[var14][var8[var14]++] = var13++;
        }
        this.field3592 = null;
    }

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "()V", line = 1909)
    public static final void method1501() {
        field3607 = new class213();
        field3617 = new class213();
        field3619 = new class213();
        field3620 = new class213();
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIIIJ)V", line = 1915)
    public final void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (this.field3615 == 0) {
            return;
        }
        if (!this.field3588.field2532) {
            this.method1514();
        }
        short var11 = this.field3588.field2528;
        short var12 = this.field3588.field2531;
        short var13 = this.field3588.field2527;
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
        if (var19 / var16 <= class244.field4160) {
            return;
        }
        int var20 = var18 - var11 << 9;
        if (var20 / var16 >= class221.field3804) {
            return;
        }
        int var21 = arg2 * arg6 - arg1 * var14 >> 16;
        int var22 = (arg1 * var11 + arg2 * var13 >> 16) + var21 << 9;
        if (var22 / var16 <= class24.field263) {
            return;
        }
        int var23 = (-var11 * arg1 + arg2 * var12 >> 16) + var21 << 9;
        if (var23 / var16 >= class8.field90) {
            return;
        }
        int var24 = 0;
        int var25 = 0;
        if (arg0 != 0) {
            var24 = class23.field245[arg0];
            var25 = class23.field254[arg0];
        }
        if (arg8 > 0L && class221.field3790 && var17 > 0) {
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
            if (class41.field631 >= var26 && class41.field631 <= var27 && class218.field3743 >= var28 && class218.field3743 <= var29) {
                int var30 = 999999;
                int var31 = -999999;
                int var32 = 999999;
                int var33 = -999999;
                short var34 = this.field3588.field2526;
                short var35 = this.field3588.field2530;
                short var36 = this.field3588.field2529;
                short var37 = this.field3588.field2525;
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
                if (class41.field631 >= var30 && class41.field631 <= var31 && class218.field3743 >= var32 && class218.field3743 <= var33) {
                    if (this.field2236) {
                        class243.field4129[class288.field4910++] = arg8;
                    } else {
                        if (field3630.length < this.field3615) {
                            field3630 = new int[this.field3615];
                            field3622 = new int[this.field3615];
                        }
                        int var57 = 0;
                        label118: while (true) {
                            if (var57 >= this.field3590) {
                                int var77 = 0;
                                while (true) {
                                    if (var77 >= this.field3598) {
                                        break label118;
                                    }
                                    short var78 = this.field3601[var77];
                                    short var79 = this.field3605[var77];
                                    short var80 = this.field3604[var77];
                                    if (this.method1491(class41.field631, class218.field3743, field3622[var78], field3622[var79], field3622[var80], field3630[var78], field3630[var79], field3630[var80])) {
                                        class243.field4129[class288.field4910++] = arg8;
                                        break label118;
                                    }
                                    var77++;
                                }
                            }
                            int var58 = this.field3581[var57];
                            int var59 = this.field3587[var57];
                            int var60 = this.field3583[var57];
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
                            int var73 = this.field3594[var57];
                            int var74 = this.field3594[var57 + 1];
                            for (int var75 = var73; var75 < var74; var75++) {
                                int var76 = this.field3610[var75] - 1;
                                if (var76 == -1) {
                                    break;
                                }
                                field3630[var76] = var71;
                                field3622[var76] = var72;
                            }
                            var57++;
                        }
                    }
                }
            }
        }
        GL var81 = class154.field2479;
        var81.glPushMatrix();
        var81.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var81.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method1480();
        var81.glPopMatrix();
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIFFF)[F", line = 2192)
    private static final float[] method1502(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
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

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "()I", line = 2266)
    public final int method1503() {
        return this.field3589;
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)V", line = 2271)
    public final void method500(int arg0) {
        int var2 = class23.field245[arg0];
        int var3 = class23.field254[arg0];
        for (int var4 = 0; var4 < this.field3590; var4++) {
            int var5 = this.field3583[var4] * var2 + this.field3581[var4] * var3 >> 16;
            this.field3583[var4] = this.field3583[var4] * var3 - this.field3581[var4] * var2 >> 16;
            this.field3581[var4] = var5;
        }
        this.field3588.field2532 = false;
        this.field3618.field4367 = false;
    }

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "()V", line = 2292)
    public final void method488() {
        for (int var1 = 0; var1 < this.field3590; var1++) {
            this.field3581[var1] = -this.field3581[var1];
            this.field3583[var1] = -this.field3583[var1];
        }
        this.field3588.field2532 = false;
        this.field3618.field4367 = false;
    }

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "()V", line = 2307)
    private final void method1504() {
        if (field3595.field1495.length < this.field3615 * 12) {
            field3595 = new class92((this.field3615 + 100) * 12);
        } else {
            field3595.field1476 = 0;
        }
        if (class154.field2468) {
            for (int var1 = 0; var1 < this.field3598; var1++) {
                field3595.method712(this.field3601[var1], 127);
                field3595.method712(this.field3605[var1], -37);
                field3595.method712(this.field3604[var1], 115);
            }
        } else {
            for (int var2 = 0; var2 < this.field3598; var2++) {
                field3595.method715(true, this.field3601[var2]);
                field3595.method715(true, this.field3605[var2]);
                field3595.method715(true, this.field3604[var2]);
            }
        }
        if (!class154.field2461) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field3595.field1476);
            var5.put(field3595.field1495, 0, field3595.field1476);
            var5.flip();
            this.field3616.field4367 = true;
            this.field3616.field4362 = var5;
            this.field3616.field4366 = null;
            return;
        }
        class34 var3 = new class34();
        ByteBuffer var4 = ByteBuffer.wrap(field3595.field1495, 0, field3595.field1476);
        var3.method220(var4);
        this.field3616.field4367 = true;
        this.field3616.field4362 = null;
        this.field3616.field4366 = var3;
    }

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "()I", line = 2368)
    public final int method1505() {
        return this.field3597;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(FFF)I", line = 2372)
    private static final int method1506(float arg0, float arg1, float arg2) {
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

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "()V", line = 2406)
    public final void method1507() {
        if (this.field3593 == null) {
            this.method488();
            return;
        }
        for (int var1 = 0; var1 < this.field3590; var1++) {
            this.field3581[var1] = -this.field3581[var1];
            this.field3583[var1] = -this.field3583[var1];
        }
        for (int var2 = 0; var2 < this.field3615; var2++) {
            this.field3593[var2] = (short) (-this.field3593[var2]);
            this.field3585[var2] = (short) (-this.field3585[var2]);
        }
        this.field3588.field2532 = false;
        this.field3618.field4367 = false;
        if (this.field3582 != null) {
            this.field3582.field4367 = false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZZZZZZZ)V", line = 2442)
    public final void method1508(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field3596 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field3615 != 0) {
            if (arg6) {
                boolean var8 = !this.field3599.field4367 && (arg1 || arg2 && !client.field5162);
                this.method1512(false, !this.field3618.field4367 && arg0, var8, this.field3582 != null && !this.field3582.field4367 && arg2, !this.field3613.field4367 && arg3);
                if (!this.field3616.field4367 && arg4 && arg1) {
                    this.method1504();
                }
            }
            if (arg0) {
                if (this.field3618.field4367) {
                    this.field3581 = null;
                    this.field3587 = null;
                    this.field3583 = null;
                    this.field3610 = null;
                    this.field3594 = null;
                } else {
                    this.field3586 = (byte) (this.field3586 | 0x1);
                }
            }
            if (arg1) {
                if (this.field3599.field4367) {
                    this.field3600 = null;
                    this.field3580 = null;
                } else {
                    this.field3586 = (byte) (this.field3586 | 0x2);
                }
            }
            if (arg2 && client.field5162) {
                if (this.field3582.field4367) {
                    this.field3593 = null;
                    this.field3606 = null;
                    this.field3585 = null;
                    this.field3608 = null;
                } else {
                    this.field3586 = (byte) (this.field3586 | 0x4);
                }
            }
            if (arg3) {
                if (this.field3613.field4367) {
                    this.field3603 = null;
                    this.field3609 = null;
                } else {
                    this.field3586 = (byte) (this.field3586 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field3616.field4367 && this.field3599.field4367) {
                    this.field3601 = null;
                    this.field3605 = null;
                    this.field3604 = null;
                } else {
                    this.field3586 = (byte) (this.field3586 | 0x10);
                }
            }
            if (arg5) {
                this.field3611 = null;
                this.field3592 = null;
                this.field3591 = (int[][]) null;
                this.field3612 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILph;[[I[[IIII)V", line = 2535)
    public final void method1509(int arg0, int arg1, class213 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field3588.field2532) {
            arg2.method1514();
        }
        int var9 = arg2.field3588.field2526 + arg5;
        int var10 = arg2.field3588.field2530 + arg5;
        int var11 = arg2.field3588.field2529 + arg7;
        int var12 = arg2.field3588.field2525 + arg7;
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
            for (int var17 = 0; var17 < this.field3590; var17++) {
                int var18 = this.field3581[var17] + arg5;
                int var19 = this.field3583[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field3587[var17] = this.field3587[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field3588.field2531;
            for (int var28 = 0; var28 < this.field3590; var28++) {
                int var29 = (this.field3587[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field3581[var28] + arg5;
                    int var31 = this.field3583[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field3587[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method1043(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field3588.field2527 - arg2.field3588.field2531;
            for (int var42 = 0; var42 < this.field3590; var42++) {
                int var43 = this.field3581[var42] + arg5;
                int var44 = this.field3583[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field3587[var42] = var51 + this.field3587[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field3588.field2527 - arg2.field3588.field2531;
            for (int var53 = 0; var53 < this.field3590; var53++) {
                int var54 = this.field3581[var53] + arg5;
                int var55 = this.field3583[var53] + arg7;
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
                this.field3587[var53] = ((this.field3587[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field3618.field4367 = false;
        this.field3588.field2532 = false;
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "()I", line = 2738)
    public final int method503() {
        if (!this.field3588.field2532) {
            this.method1514();
        }
        return this.field3588.field2530;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZZLph;Lph;)Lab;", line = 2744)
    private final class138 method1510(boolean arg0, boolean arg1, class213 arg2, class213 arg3) {
        arg2.field3590 = this.field3590;
        arg2.field3615 = this.field3615;
        arg2.field3598 = this.field3598;
        arg2.field3597 = this.field3597;
        arg2.field3589 = this.field3589;
        arg2.field3596 = (byte) ((arg0 ? 0 : 2) | 0x1 | (arg1 ? 0 : 4));
        if (arg2.field3581 == null || arg2.field3581.length < this.field3590) {
            arg2.field3581 = new int[this.field3590 + 100];
            arg2.field3587 = new int[this.field3590 + 100];
            arg2.field3583 = new int[this.field3590 + 100];
        }
        for (int var5 = 0; var5 < this.field3590; var5++) {
            arg2.field3581[var5] = this.field3581[var5];
            arg2.field3587[var5] = this.field3587[var5];
            arg2.field3583[var5] = this.field3583[var5];
        }
        if (arg2.field3618 == null) {
            arg2.field3618 = new class259();
        }
        arg2.field3618.field4367 = false;
        if (arg2.field3588 == null) {
            arg2.field3588 = new class157();
        }
        arg2.field3588.field2532 = false;
        if (arg0) {
            arg2.field3580 = this.field3580;
            arg2.field3599 = this.field3599;
        } else {
            if (arg3.field3580 == null || arg3.field3580.length < this.field3598) {
                arg3.field3580 = new byte[this.field3598 + 100];
            }
            arg2.field3580 = arg3.field3580;
            for (int var6 = 0; var6 < this.field3598; var6++) {
                arg2.field3580[var6] = this.field3580[var6];
            }
            if (arg3.field3599 == null) {
                arg3.field3599 = new class259();
            }
            arg2.field3599 = arg3.field3599;
            arg2.field3599.field4367 = false;
        }
        if (arg1) {
            arg2.field3593 = this.field3593;
            arg2.field3606 = this.field3606;
            arg2.field3585 = this.field3585;
            arg2.field3608 = this.field3608;
            arg2.field3582 = this.field3582;
        } else {
            if (arg3.field3593 == null || arg3.field3593.length < this.field3615) {
                arg3.field3593 = new short[this.field3615 + 100];
                arg3.field3606 = new short[this.field3615 + 100];
                arg3.field3585 = new short[this.field3615 + 100];
                arg3.field3608 = new short[this.field3615 + 100];
            }
            arg2.field3593 = arg3.field3593;
            arg2.field3606 = arg3.field3606;
            arg2.field3585 = arg3.field3585;
            arg2.field3608 = arg3.field3608;
            for (int var7 = 0; var7 < this.field3615; var7++) {
                arg2.field3593[var7] = this.field3593[var7];
                arg2.field3606[var7] = this.field3606[var7];
                arg2.field3585[var7] = this.field3585[var7];
                arg2.field3608[var7] = this.field3608[var7];
            }
            if (client.field5162) {
                if (arg3.field3582 == null) {
                    arg3.field3582 = new class259();
                }
                arg2.field3582 = arg3.field3582;
                arg2.field3582.field4367 = false;
            } else {
                arg2.field3582 = null;
            }
        }
        arg2.field3603 = this.field3603;
        arg2.field3609 = this.field3609;
        arg2.field3611 = this.field3611;
        arg2.field3591 = this.field3591;
        arg2.field3600 = this.field3600;
        arg2.field3601 = this.field3601;
        arg2.field3605 = this.field3605;
        arg2.field3604 = this.field3604;
        arg2.field3576 = this.field3576;
        arg2.field3592 = this.field3592;
        arg2.field3612 = this.field3612;
        arg2.field3613 = this.field3613;
        arg2.field3616 = this.field3616;
        arg2.field3584 = this.field3584;
        arg2.field3610 = this.field3610;
        arg2.field3594 = this.field3594;
        arg2.field2236 = this.field2236;
        return arg2;
    }

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "(I)V", line = 2868)
    public final void method1511(int arg0) {
        if (this.field3593 == null) {
            this.method500(arg0);
            return;
        }
        int var2 = class23.field245[arg0];
        int var3 = class23.field254[arg0];
        for (int var4 = 0; var4 < this.field3590; var4++) {
            int var5 = this.field3583[var4] * var2 + this.field3581[var4] * var3 >> 16;
            this.field3583[var4] = this.field3583[var4] * var3 - this.field3581[var4] * var2 >> 16;
            this.field3581[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field3615; var6++) {
            int var7 = this.field3593[var6] * var3 + this.field3585[var6] * var2 >> 16;
            this.field3585[var6] = (short) (this.field3585[var6] * var3 - this.field3593[var6] * var2 >> 16);
            this.field3593[var6] = (short) var7;
        }
        this.field3588.field2532 = false;
        this.field3618.field4367 = false;
        if (this.field3582 != null) {
            this.field3582.field4367 = false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZZZZZ)V", line = 2911)
    private final void method1512(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field3618.field4369 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field3599.field4369 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field3582.field4369 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field3613.field4369 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field3595.field1495.length < this.field3615 * var6) {
            field3595 = new class92((this.field3615 + 100) * var6);
        } else {
            field3595.field1476 = 0;
        }
        if (arg1) {
            if (class154.field2468) {
                for (int var7 = 0; var7 < this.field3590; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field3581[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field3587[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field3583[var7]);
                    int var11 = this.field3594[var7];
                    int var12 = this.field3594[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field3610[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field3595.field1476 = var6 * var14;
                        field3595.method712(var8, -1);
                        field3595.method712(var9, 123);
                        field3595.method712(var10, 126);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field3590; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field3581[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field3587[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field3583[var15]);
                    int var19 = this.field3594[var15];
                    int var20 = this.field3594[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field3610[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field3595.field1476 = var6 * var22;
                        field3595.method715(true, var16);
                        field3595.method715(true, var17);
                        field3595.method715(true, var18);
                    }
                }
            }
        }
        if (arg2) {
            if (client.field5162) {
                for (int var42 = 0; var42 < this.field3598; var42++) {
                    int var43 = method1513(this.field3600[var42], this.field3576[var42], this.field3597, this.field3580[var42]);
                    field3595.field1476 = this.field3601[var42] * var6 + this.field3599.field4369;
                    field3595.method712(var43, -126);
                    field3595.field1476 = this.field3605[var42] * var6 + this.field3599.field4369;
                    field3595.method712(var43, -75);
                    field3595.field1476 = this.field3604[var42] * var6 + this.field3599.field4369;
                    field3595.method712(var43, 5);
                }
            } else {
                int var23 = (int) class179.field2849[0];
                int var24 = (int) class179.field2849[1];
                int var25 = (int) class179.field2849[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field3597 * 1.3F);
                int var28 = this.field3589 * var26 >> 8;
                for (int var29 = 0; var29 < this.field3598; var29++) {
                    short var30 = this.field3601[var29];
                    short var31 = this.field3608[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field3585[var30] * var25 + this.field3606[var30] * var24 + this.field3593[var30] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field3585[var30] * var25 + this.field3606[var30] * var24 + this.field3593[var30] * var23) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field3608[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field3605[var29];
                    short var34 = this.field3608[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field3585[var33] * var25 + this.field3606[var33] * var24 + this.field3593[var33] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field3585[var33] * var25 + this.field3606[var33] * var24 + this.field3593[var33] * var23) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field3608[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field3604[var29];
                    short var37 = this.field3608[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field3585[var36] * var25 + this.field3606[var36] * var24 + this.field3593[var36] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field3585[var36] * var25 + this.field3606[var36] * var24 + this.field3593[var36] * var23) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field3608[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method1513(this.field3600[var29], this.field3576[var29], var32, this.field3580[var29]);
                    int var40 = method1513(this.field3600[var29], this.field3576[var29], var35, this.field3580[var29]);
                    int var41 = method1513(this.field3600[var29], this.field3576[var29], var38, this.field3580[var29]);
                    field3595.field1476 = var6 * var30 + this.field3599.field4369;
                    field3595.method712(var39, 114);
                    field3595.field1476 = var6 * var33 + this.field3599.field4369;
                    field3595.method712(var40, -44);
                    field3595.field1476 = var6 * var36 + this.field3599.field4369;
                    field3595.method712(var41, -35);
                }
                this.field3593 = null;
                this.field3606 = null;
                this.field3585 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field3589;
            float var45 = 3.0F / (float) (this.field3589 / 2 + this.field3589);
            field3595.field1476 = this.field3582.field4369;
            if (class154.field2468) {
                for (int var46 = 0; var46 < this.field3615; var46++) {
                    short var47 = this.field3608[var46];
                    if (var47 == 0) {
                        field3595.method701(12327, (float) this.field3593[var46] * var45);
                        field3595.method701(12327, (float) this.field3606[var46] * var45);
                        field3595.method701(12327, (float) this.field3585[var46] * var45);
                    } else {
                        float var48 = var44 / (float) var47;
                        field3595.method701(12327, (float) this.field3593[var46] * var48);
                        field3595.method701(12327, (float) this.field3606[var46] * var48);
                        field3595.method701(12327, (float) this.field3585[var46] * var48);
                    }
                    field3595.field1476 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field3615; var49++) {
                    short var50 = this.field3608[var49];
                    if (var50 == 0) {
                        field3595.method735((float) this.field3593[var49] * var45, -3);
                        field3595.method735((float) this.field3606[var49] * var45, -3);
                        field3595.method735((float) this.field3585[var49] * var45, -3);
                    } else {
                        float var51 = var44 / (float) var50;
                        field3595.method735((float) this.field3593[var49] * var51, -3);
                        field3595.method735((float) this.field3606[var49] * var51, -3);
                        field3595.method735((float) this.field3585[var49] * var51, -3);
                    }
                    field3595.field1476 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field3595.field1476 = this.field3613.field4369;
            if (class154.field2468) {
                for (int var52 = 0; var52 < this.field3615; var52++) {
                    field3595.method701(12327, this.field3603[var52]);
                    field3595.method701(12327, this.field3609[var52]);
                    field3595.field1476 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field3615; var53++) {
                    field3595.method735(this.field3603[var53], -3);
                    field3595.method735(this.field3609[var53], -3);
                    field3595.field1476 += var6 - 8;
                }
            }
        }
        field3595.field1476 = this.field3615 * var6;
        if (arg0) {
            if (class154.field2460) {
                ByteBuffer var54 = ByteBuffer.wrap(field3595.field1495, 0, field3595.field1476);
                if (this.field3578 == null) {
                    this.field3578 = new class34(true);
                    this.field3578.method220(var54);
                } else {
                    this.field3578.method223(var54);
                }
                if (arg1) {
                    this.field3618.field4367 = true;
                    this.field3618.field4362 = null;
                    this.field3618.field4366 = this.field3578;
                    this.field3618.field4364 = var6;
                }
                if (arg2) {
                    this.field3599.field4367 = true;
                    this.field3599.field4362 = null;
                    this.field3599.field4366 = this.field3578;
                    this.field3599.field4364 = var6;
                }
                if (arg3) {
                    this.field3582.field4367 = true;
                    this.field3582.field4362 = null;
                    this.field3582.field4366 = this.field3578;
                    this.field3582.field4364 = var6;
                }
                if (arg4) {
                    this.field3613.field4367 = true;
                    this.field3613.field4362 = null;
                    this.field3613.field4366 = this.field3578;
                    this.field3613.field4364 = var6;
                }
            } else {
                if (field3614 == null || field3614.capacity() < field3595.field1476) {
                    field3614 = ByteBuffer.allocateDirect(var6 * 100 + field3595.field1476);
                } else {
                    field3614.clear();
                }
                field3614.put(field3595.field1495, 0, field3595.field1476);
                field3614.flip();
                if (arg1) {
                    this.field3618.field4367 = true;
                    this.field3618.field4362 = field3614;
                    this.field3618.field4366 = null;
                    this.field3618.field4364 = var6;
                }
                if (arg2) {
                    this.field3599.field4367 = true;
                    this.field3599.field4362 = field3614;
                    this.field3618.field4366 = null;
                    this.field3599.field4364 = var6;
                }
                if (arg3) {
                    this.field3582.field4367 = true;
                    this.field3582.field4362 = field3614;
                    this.field3582.field4366 = null;
                    this.field3582.field4364 = var6;
                }
                if (arg4) {
                    this.field3613.field4367 = true;
                    this.field3613.field4362 = field3614;
                    this.field3613.field4366 = null;
                    this.field3613.field4364 = var6;
                }
            }
        } else if (class154.field2461) {
            class34 var55 = new class34();
            ByteBuffer var56 = ByteBuffer.wrap(field3595.field1495, 0, field3595.field1476);
            var55.method220(var56);
            if (arg1) {
                this.field3618.field4367 = true;
                this.field3618.field4362 = null;
                this.field3618.field4366 = var55;
                this.field3618.field4364 = var6;
            }
            if (arg2) {
                this.field3599.field4367 = true;
                this.field3599.field4362 = null;
                this.field3599.field4366 = var55;
                this.field3599.field4364 = var6;
            }
            if (arg3) {
                this.field3582.field4367 = true;
                this.field3582.field4362 = null;
                this.field3582.field4366 = var55;
                this.field3582.field4364 = var6;
            }
            if (arg4) {
                this.field3613.field4367 = true;
                this.field3613.field4362 = null;
                this.field3613.field4366 = var55;
                this.field3613.field4364 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field3595.field1476);
            var57.put(field3595.field1495, 0, field3595.field1476);
            var57.flip();
            if (arg1) {
                this.field3618.field4367 = true;
                this.field3618.field4362 = var57;
                this.field3618.field4366 = null;
                this.field3618.field4364 = var6;
            }
            if (arg2) {
                this.field3599.field4367 = true;
                this.field3599.field4362 = var57;
                this.field3618.field4366 = null;
                this.field3599.field4364 = var6;
            }
            if (arg3) {
                this.field3582.field4367 = true;
                this.field3582.field4362 = var57;
                this.field3582.field4366 = null;
                this.field3582.field4364 = var6;
            }
            if (arg4) {
                this.field3613.field4367 = true;
                this.field3613.field4362 = var57;
                this.field3613.field4366 = null;
                this.field3613.field4364 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lqd;ILqd;I[IZ)V", line = 3443)
    public final void method491(class170 arg0, int arg1, class170 arg2, int arg3, int[] arg4, boolean arg5) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method475(arg0, arg1, arg5);
            return;
        }
        class83 var7 = arg0.field2766[arg1];
        class83 var8 = arg2.field2766[arg3];
        class289 var9 = var7.field1370;
        for (int var10 = 0; var10 < this.field3590; var10++) {
            this.field3581[var10] <<= 0x4;
            this.field3587[var10] <<= 0x4;
            this.field3583[var10] <<= 0x4;
        }
        field3624 = 0;
        field3631 = 0;
        field3627 = 0;
        byte var11 = 0;
        int var20 = var11 + 1;
        int var12 = arg4[var11];
        for (int var13 = 0; var13 < var7.field1371; var13++) {
            short var14 = var7.field1372[var13];
            while (var14 > var12) {
                var12 = arg4[var20++];
            }
            if (var12 != var14 || var9.field4921[var14] == 0) {
                if (var7.field1364[var13] != -1) {
                    this.method1487(0, var9.field4918[var7.field1364[var13]], 0, 0, 0, arg5);
                }
                this.method1487(var9.field4921[var14], var9.field4918[var14], var7.field1374[var13], var7.field1368[var13], var7.field1365[var13], arg5);
            }
        }
        field3624 = 0;
        field3631 = 0;
        field3627 = 0;
        byte var15 = 0;
        int var21 = var15 + 1;
        int var16 = arg4[var15];
        for (int var17 = 0; var17 < var8.field1371; var17++) {
            short var18 = var8.field1372[var17];
            while (var18 > var16) {
                var16 = arg4[var21++];
            }
            if (var16 == var18 || var9.field4921[var18] == 0) {
                if (var8.field1364[var17] != -1) {
                    this.method1487(0, var9.field4918[var8.field1364[var17]], 0, 0, 0, arg5);
                }
                this.method1487(var9.field4921[var18], var9.field4918[var18], var8.field1374[var17], var8.field1368[var17], var8.field1365[var17], arg5);
            }
        }
        for (int var19 = 0; var19 < this.field3590; var19++) {
            this.field3581[var19] >>= 0x4;
            this.field3587[var19] >>= 0x4;
            this.field3583[var19] >>= 0x4;
        }
        this.field3588.field2532 = false;
        this.field3618.field4367 = false;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lqd;I)V", line = 3539)
    public final void method493(class170 arg0, int arg1) {
        if (this.field3591 == null || arg1 == -1) {
            return;
        }
        class83 var3 = arg0.field2766[arg1];
        class289 var4 = var3.field1370;
        field3624 = 0;
        field3631 = 0;
        field3627 = 0;
        for (int var5 = 0; var5 < var3.field1371; var5++) {
            short var6 = var3.field1372[var5];
            if (var4.field4922[var6]) {
                if (var3.field1364[var5] != -1) {
                    this.method1495(0, 0, 0, 0);
                }
                this.method1495(var4.field4921[var6], var3.field1374[var5], var3.field1368[var5], var3.field1365[var5]);
            }
        }
        this.field3618.field4367 = false;
        this.field3588.field2532 = false;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZZ)Lab;", line = 3574)
    public final class138 method495(boolean arg0, boolean arg1) {
        return this.method1510(arg0, arg1, field3617, field3607);
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "()I", line = 3578)
    public final int method278() {
        if (!this.field3588.field2532) {
            this.method1514();
        }
        return this.field3588.field2531;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ISIB)I", line = 3588)
    private static final int method1513(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class23.field246[class67.method496(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class23.field248.method179(arg1 & 0xFFFF, (byte) 122);
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
            int var9 = class23.field248.method188(arg1 & 0xFFFF, 0);
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

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "()V", line = 3656)
    public final void method501() {
        for (int var1 = 0; var1 < this.field3590; var1++) {
            int var2 = this.field3581[var1];
            this.field3581[var1] = this.field3583[var1];
            this.field3583[var1] = -var2;
        }
        this.field3588.field2532 = false;
        this.field3618.field4367 = false;
    }

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "()V", line = 3687)
    private final void method1514() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field3590; var9++) {
            int var10 = this.field3581[var9];
            int var11 = this.field3587[var9];
            int var12 = this.field3583[var9];
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
        this.field3588.field2526 = (short) var1;
        this.field3588.field2530 = (short) var4;
        this.field3588.field2531 = (short) var2;
        this.field3588.field2527 = (short) var5;
        this.field3588.field2529 = (short) var3;
        this.field3588.field2525 = (short) var6;
        this.field3588.field2528 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field3588.field2532 = true;
    }
}
