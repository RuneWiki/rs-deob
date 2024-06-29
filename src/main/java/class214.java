import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class214 extends class53 {

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "Z")
    public boolean field3531 = false;

    @OriginalMember(owner = "client!gl", name = "C", descriptor = "I")
    public int field3543 = 0;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "Ldi;")
    private class170 field3533 = new class170();

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
    private int field3550 = 0;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "Len;")
    public class49 field3547 = new class49();

    @OriginalMember(owner = "client!gl", name = "V", descriptor = "Z")
    private boolean field3562 = false;

    @OriginalMember(owner = "client!gl", name = "cb", descriptor = "I")
    private int field3569 = 0;

    @OriginalMember(owner = "client!gl", name = "fb", descriptor = "Z")
    private boolean field3572 = false;

    @OriginalMember(owner = "client!gl", name = "bb", descriptor = "I")
    private int field3568;

    @OriginalMember(owner = "client!gl", name = "W", descriptor = "I")
    private int field3563;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "[Lqb;")
    public class118[] field3535;

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "J")
    private long field3539;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "Z")
    public static boolean field3534 = false;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public static int field3532 = 0;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
    public static int field3540 = 0;

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
    public static int field3538 = 0;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "Z")
    public static boolean field3544 = false;

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "I")
    public static int field3546 = 0;

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "Ltj;")
    public static class201 field3541 = new class201(8);

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "[Z")
    private static boolean[] field3554 = new boolean[8];

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
    private static int field3548 = 0;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "I")
    public static int field3549 = 2;

    @OriginalMember(owner = "client!gl", name = "Y", descriptor = "I")
    public static int field3565 = 0;

    @OriginalMember(owner = "client!gl", name = "hb", descriptor = "[Z")
    private static boolean[] field3574 = new boolean[8];

    @OriginalMember(owner = "client!gl", name = "L", descriptor = "Loe;")
    private static class146 field3552 = new class146(131056);

    @OriginalMember(owner = "client!gl", name = "jb", descriptor = "F")
    public static float field3576 = 1.0F;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "I")
    public int field3556;

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "I")
    public int field3557;

    @OriginalMember(owner = "client!gl", name = "R", descriptor = "I")
    public int field3558;

    @OriginalMember(owner = "client!gl", name = "S", descriptor = "I")
    public int field3559;

    @OriginalMember(owner = "client!gl", name = "T", descriptor = "I")
    public int field3560;

    @OriginalMember(owner = "client!gl", name = "U", descriptor = "I")
    public int field3561;

    @OriginalMember(owner = "client!gl", name = "X", descriptor = "I")
    public int field3564;

    @OriginalMember(owner = "client!gl", name = "Z", descriptor = "I")
    public int field3566;

    @OriginalMember(owner = "client!gl", name = "db", descriptor = "I")
    public int field3570;

    @OriginalMember(owner = "client!gl", name = "eb", descriptor = "I")
    public int field3571;

    @OriginalMember(owner = "client!gl", name = "gb", descriptor = "I")
    public int field3573;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "J")
    private long field3529;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "J")
    public long field3537;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "Ldi;")
    private static class170 field3536;

    @OriginalMember(owner = "client!gl", name = "ib", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3575;

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "[I")
    public static int[] field3555;

    @OriginalMember(owner = "client!gl", name = "ab", descriptor = "[I")
    public static int[] field3567;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "[Lqb;")
    public static class118[] field3528;

    @OriginalMember(owner = "client!gl", name = "K", descriptor = "[[S")
    public static short[][] field3551;

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "[[S")
    public static short[][] field3553;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([Lue;Z[I[I[I)V", line = 9)
    private final void method1472(class19[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field3554[var6] = false;
        }
        label88: for (class36 var7 = (class36) this.field3547.method431(0); var7 != null; var7 = (class36) this.field3547.method439(-28512)) {
            if (arg0 != null) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    if (arg0[var8] == var7.field797) {
                        field3554[var8] = true;
                        continue label88;
                    }
                }
            }
            if (!arg1) {
                var7.method535(-2801);
                this.field3569--;
                if (var7.method2153(true)) {
                    var7.method2152((byte) 56);
                    field3548--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var9 = 0; var9 < arg0.length && this.field3569 != 8; var9++) {
            if (!field3554[var9]) {
                class36 var10 = null;
                if (arg0[var9].field503.field4135 == 1 && field3548 < 32) {
                    var10 = new class36(arg0[var9], this);
                    field3541.method1376(true, var10, (long) arg0[var9].field503.field4153);
                    field3548++;
                }
                if (var10 == null) {
                    var10 = new class36(arg0[var9], this);
                }
                this.field3547.method437(var10, (byte) 51);
                this.field3569++;
                field3554[var9] = true;
            }
        }
        for (class36 var11 = (class36) this.field3547.method431(0); var11 != null; var11 = (class36) this.field3547.method439(-28512)) {
            for (int var12 = 0; var12 < arg0.length; var12++) {
                if (field3554[var12] && arg0[var12] == var11.field797) {
                    var11.method264(arg3[var11.field797.field509], arg2[var11.field797.field509], arg4[var11.field797.field509], 108);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "()V", line = 119)
    public static final void method1473() {
        GL var0 = class241.field4012;
        if (var0.isExtensionAvailable("GL_ARB_point_parameters")) {
            float[] var1 = new float[] { 1.0F, 0.0F, 5.0E-7F };
            var0.glPointParameterfvARB(33065, var1, 0);
            FloatBuffer var2 = FloatBuffer.allocate(1);
            var0.glGetFloatv(33063, var2);
            float var3 = var2.get(0);
            if (var3 > 64.0F) {
                var3 = 64.0F;
            }
            var0.glPointParameterfARB(33062, 1.0F);
            var0.glPointParameterfARB(33063, var3);
        }
        if (var0.isExtensionAvailable("GL_ARB_point_sprite")) {
            field3544 = true;
        }
        field3551 = new short[1600][32];
        field3553 = new short[32][768];
        field3555 = new int[1600];
        field3567 = new int[32];
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([Lvf;Z[I[I[I)V", line = 149)
    private final void method1474(class341[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field3574[var6] = false;
        }
        label79: for (class172 var7 = (class172) this.field3533.method1205(93); var7 != null; var7 = (class172) this.field3533.method1207(true)) {
            if (arg0 != null) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    if (arg0[var8] == var7.field2857) {
                        field3574[var8] = true;
                        var7.field2851 = false;
                        continue label79;
                    }
                }
            }
            if (!arg1) {
                if (var7.field2866 == 0) {
                    var7.method460(false);
                    this.field3550--;
                } else {
                    var7.field2851 = true;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var9 = 0; var9 < arg0.length && this.field3550 != 8; var9++) {
            if (!field3574[var9]) {
                class172 var10 = new class172(arg0[var9], this, this.field3537);
                this.field3533.method1208(77, var10);
                this.field3550++;
                field3574[var9] = true;
            }
        }
        for (class172 var11 = (class172) this.field3533.method1205(97); var11 != null; var11 = (class172) this.field3533.method1207(true)) {
            for (int var12 = 0; var12 < arg0.length; var12++) {
                if (field3574[var12] && arg0[var12] == var11.field2857) {
                    var11.method1223(arg2[var11.field2857.field5409], arg4[var11.field2857.field5398], arg3[var11.field2857.field5407], 3, arg2[var11.field2857.field5398], arg4[var11.field2857.field5407], arg2[var11.field2857.field5407], arg3[var11.field2857.field5409], arg4[var11.field2857.field5409], arg3[var11.field2857.field5398]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "()V", line = 242)
    public static void method1475() {
        field3536 = null;
        field3528 = null;
        field3541 = null;
        field3574 = null;
        field3554 = null;
        field3551 = (short[][]) null;
        field3553 = (short[][]) null;
        field3555 = null;
        field3567 = null;
        field3552 = null;
        field3575 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIIIII)V", line = 255)
    public final void method1476(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field3531 || !this.field3572 || !class241.field4016) {
            return;
        }
        GL var10 = class241.field4012;
        int var11 = class1.field3;
        int var12 = class267.field4370;
        int var13 = class105.field1915;
        method1494(var11, var12, var13);
        int var14 = arg4 * arg8 - arg3 * arg6 >> 16;
        int var15 = arg1 * arg7 + arg2 * var14 >> 16;
        int var16 = this.method1485();
        int var17 = (arg1 * 0 + arg2 * var16 >> 16) + var15;
        int var18 = (-var16 * arg2 - (this.field3558 - this.field3573) * arg1 >> 16) + var15;
        int var19 = var17 + 2 - var18;
        if (var19 >= 1600) {
            if (field3534) {
                System.out.println("Model too big for particles - radixsize:" + var19 + " maxmodelsize:" + 1600);
            }
            method1493();
            return;
        }
        class53 var20 = this.field3533.field2813;
        for (class53 var21 = var20.field1064; var21 != var20; var21 = var21.field1064) {
            class172 var22 = (class172) var21;
            for (int var23 = 0; var23 < var19; var23++) {
                field3555[var23] = 0;
            }
            for (int var24 = 0; var24 < 32; var24++) {
                field3567[var24] = 0;
            }
            field3565 = 0;
            class53 var25 = var22.field2836.field2813;
            for (class53 var26 = var25.field1064; var26 != var25; var26 = var26.field1064) {
                class118 var27 = (class118) var26;
                if (!var27.field2103) {
                    int var28 = (var27.field2097 >> 12) - var11;
                    int var29 = (var27.field2098 >> 12) - var12;
                    int var30 = (var27.field2093 >> 12) - var13;
                    int var31 = arg4 * var30 - arg3 * var28 >> 16;
                    int var32 = (arg1 * var29 + arg2 * var31 >> 16) - var18;
                    if (var32 < 0) {
                        var32 = 0;
                    } else if (var32 >= var19) {
                        var32 = var19 - 1;
                    }
                    if (field3555[var32] < 32) {
                        field3551[var32][field3555[var32]++] = var27.field2101;
                    } else {
                        if (field3555[var32] == 32) {
                            if (field3565 == 32) {
                                if (field3534) {
                                    System.out.println("Overflowed model-based radix sort");
                                }
                                continue;
                            }
                            field3555[var32] += field3565++ + 1;
                        }
                        short[] var10000 = field3553[field3555[var32] - 32 - 1];
                        int var10002 = field3555[var32] - 32 - 1;
                        int var10004 = field3567[field3555[var32] - 32 - 1];
                        field3567[var10002] = field3567[field3555[var32] - 32 - 1] + 1;
                        var10000[var10004] = var27.field2101;
                    }
                }
            }
            boolean var33 = false;
            if (field3544 && var22.field2846.field637 != -1) {
                class305.field4968.method77((byte) -121, var22.field2846.field637);
                var33 = true;
            } else {
                class241.method1687(-1);
            }
            float var34 = (float) var22.field2846.field593 * field3576;
            if (var34 > 64.0F) {
                var34 = 64.0F;
            }
            var10.glPointSize(var34);
            this.method1482(var10, var19, var33, var22.field2846.field597);
        }
        method1493();
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "()V", line = 393)
    public static final void method1477() {
        field3541 = new class201(8);
        field3548 = 0;
        for (class214 var0 = (class214) field3536.method1205(64); var0 != null; var0 = (class214) field3536.method1207(true)) {
            var0.method1486();
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(II)V", line = 408)
    private final void method1478(int arg0, int arg1) {
        for (class36 var3 = (class36) this.field3547.method431(0); var3 != null; var3 = (class36) this.field3547.method439(-28512)) {
            var3.field788 = this.field3557 + var3.field798;
            var3.field791 = this.field3561 + var3.field795;
            var3.field801 = this.field3564 + var3.field792;
            if (this.field3571 == 0) {
                var3.field802 = var3.field797.field503.field4145;
                var3.field803 = var3.field797.field503.field4151;
            } else {
                int var4 = var3.field797.field503.field4145;
                int var5 = var3.field797.field503.field4151;
                var3.field802 = arg0 * var5 + arg1 * var4 >> 16;
                var3.field803 = arg1 * var5 - arg0 * var4 >> 16;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIII)V", line = 434)
    public final void method1479(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1483(arg0, arg1, class1.field3 + arg2, class267.field4370 + arg3, class105.field1915 + arg4);
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "()V", line = 437)
    public final void method1480() {
        this.field3562 = true;
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(II)V", line = 440)
    public static final void method1481(int arg0, int arg1) {
        field3576 = (float) arg1 / 334.0F;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljavax/media/opengl/GL;IZZ)V", line = 447)
    public final void method1482(GL arg0, int arg1, boolean arg2, boolean arg3) {
        if (!arg3 && class281.field4606) {
            arg0.glDisable(2896);
        }
        field3552.field2435 = 0;
        if (class241.field4007) {
            for (int var5 = arg1 - 1; var5 >= 0; var5--) {
                int var6 = field3555[var5] > 32 ? 32 : field3555[var5];
                if (var6 > 0) {
                    for (int var7 = var6 - 1; var7 >= 0; var7--) {
                        class118 var8 = this.field3535[field3551[var5][var7]];
                        field3552.method1006((byte) 126, (float) (var8.field2097 >> 12));
                        field3552.method1006((byte) 108, (float) (var8.field2098 >> 12));
                        field3552.method1006((byte) 125, (float) (var8.field2093 >> 12));
                        int var9 = var8.field2099;
                        field3552.method1027((byte) (var9 >> 16), -20374);
                        field3552.method1027((byte) (var9 >> 8), -20374);
                        field3552.method1027((byte) var9, -20374);
                        field3552.method1027((byte) (var9 >> 24), -20374);
                    }
                    if (field3555[var5] > 32) {
                        int var10 = field3555[var5] - 32 - 1;
                        for (int var11 = field3567[var10] - 1; var11 >= 0; var11--) {
                            class118 var12 = this.field3535[field3553[var10][var11]];
                            field3552.method1006((byte) 126, (float) (var12.field2097 >> 12));
                            field3552.method1006((byte) 114, (float) (var12.field2098 >> 12));
                            field3552.method1006((byte) 122, (float) (var12.field2093 >> 12));
                            int var13 = var12.field2099;
                            field3552.method1027((byte) (var13 >> 16), -20374);
                            field3552.method1027((byte) (var13 >> 8), -20374);
                            field3552.method1027((byte) var13, -20374);
                            field3552.method1027((byte) (var13 >> 24), -20374);
                        }
                    }
                }
            }
        } else {
            for (int var14 = arg1 - 1; var14 >= 0; var14--) {
                int var15 = field3555[var14] > 32 ? 32 : field3555[var14];
                if (var15 > 0) {
                    for (int var16 = var15 - 1; var16 >= 0; var16--) {
                        class118 var17 = this.field3535[field3551[var14][var16]];
                        field3552.method1001(-23, (float) (var17.field2097 >> 12));
                        field3552.method1001(-93, (float) (var17.field2098 >> 12));
                        field3552.method1001(-61, (float) (var17.field2093 >> 12));
                        int var18 = var17.field2099;
                        field3552.method1027((byte) (var18 >> 16), -20374);
                        field3552.method1027((byte) (var18 >> 8), -20374);
                        field3552.method1027((byte) var18, -20374);
                        field3552.method1027((byte) (var18 >> 24), -20374);
                    }
                    if (field3555[var14] > 32) {
                        int var19 = field3555[var14] - 32 - 1;
                        for (int var20 = field3567[var19] - 1; var20 >= 0; var20--) {
                            class118 var21 = this.field3535[field3553[var19][var20]];
                            field3552.method1001(-19, (float) (var21.field2097 >> 12));
                            field3552.method1001(-97, (float) (var21.field2098 >> 12));
                            field3552.method1001(-127, (float) (var21.field2093 >> 12));
                            int var22 = var21.field2099;
                            field3552.method1027((byte) (var22 >> 16), -20374);
                            field3552.method1027((byte) (var22 >> 8), -20374);
                            field3552.method1027((byte) var22, -20374);
                            field3552.method1027((byte) (var22 >> 24), -20374);
                        }
                    }
                }
            }
        }
        if (field3552.field2435 != 0) {
            if (class241.field4020) {
                arg0.glBindBufferARB(34962, 0);
            }
            if (field3575 == null || field3575.capacity() < field3552.field2435) {
                field3575 = ByteBuffer.allocateDirect(field3552.field2435).order(ByteOrder.nativeOrder());
            } else {
                field3575.clear();
            }
            field3575.put(field3552.field2496, 0, field3552.field2435);
            field3575.flip();
            field3575.position(0);
            arg0.glVertexPointer(3, 5126, 16, field3575);
            field3575.position(12);
            arg0.glColorPointer(4, 5121, 16, field3575);
            arg0.glDrawArrays(0, 0, field3552.field2435 >> 4);
        }
        if (!arg3 && class281.field4606) {
            arg0.glEnable(2896);
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(IIIII)V", line = 598)
    public final void method1483(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field3531) {
            return;
        }
        if (this.field3571 != arg0) {
            for (class172 var6 = (class172) this.field3533.method1205(120); var6 != null; var6 = (class172) this.field3533.method1207(true)) {
                var6.field2870 = true;
            }
        }
        this.field3529 = this.field3537;
        this.field3571 = arg0;
        this.field3566 = arg1;
        this.field3557 = arg2;
        this.field3561 = arg3;
        this.field3564 = arg4;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(J)Z", line = 626)
    private final boolean method1484(long arg0) {
        long var3;
        if (this.field3539 > this.field3529) {
            var3 = this.field3539;
        } else {
            var3 = this.field3529;
        }
        int var5 = (int) (this.field3537 - var3);
        if (var5 > 750) {
            this.method1486();
            return false;
        }
        if (this.field3529 > 0L) {
            this.field3556 = this.field3557 - (this.field3568 << 6) >> 7;
            this.field3560 = ((this.field3568 << 6) + this.field3557 >> 7) - 1;
            this.field3559 = this.field3564 - (this.field3563 << 6) >> 7;
            this.field3570 = ((this.field3563 << 6) + this.field3564 >> 7) - 1;
            this.field3558 = this.field3561;
            if (this.field3566 < 3) {
                this.field3573 = class144.field2427[this.field3566 + 1][this.field3560][this.field3559] + class144.field2427[this.field3566 + 1][this.field3556][this.field3559] + class144.field2427[this.field3566 + 1][this.field3556][this.field3570] + class144.field2427[this.field3566 + 1][this.field3560][this.field3570] >> 2;
            } else {
                this.field3573 = this.field3558 - 1024;
            }
            this.field3572 = true;
            int var6 = class305.field4959[this.field3571];
            int var7 = class305.field4957[this.field3571];
            this.method1478(var6, var7);
            if (this.field3562) {
                class172 var8 = (class172) this.field3533.method1205(84);
                while (true) {
                    if (var8 == null) {
                        this.field3562 = false;
                        break;
                    }
                    for (int var9 = 0; var9 < var8.field2846.field636; var9++) {
                        var8.method1226(1, true, var7, (byte) 90, this.field3537, var6);
                    }
                    var8 = (class172) this.field3533.method1207(true);
                }
            }
            int var10 = (int) (arg0 - this.field3537);
            for (class172 var11 = (class172) this.field3533.method1205(73); var11 != null; var11 = (class172) this.field3533.method1207(true)) {
                var11.method1226(var10, var5 < 10, var7, (byte) 96, arg0, var6);
            }
        }
        this.field3537 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "()I", line = 696)
    public final int method1485() {
        if (this.field3560 == this.field3556 && this.field3570 == this.field3559) {
            return 92;
        }
        int var1 = this.field3556 << 7;
        int var2 = (this.field3560 << 7) + 128;
        int var3 = this.field3559 << 7;
        int var4 = (this.field3570 << 7) + 128;
        int var5 = this.field3557 - var1;
        int var6 = var2 - this.field3557;
        if (var5 > var6) {
            int var7 = this.field3564 - var3;
            int var8 = var4 - this.field3564;
            return var7 > var8 ? (int) (Math.sqrt((double) (var5 * var5 + var7 * var7)) + 0.99D) : (int) (Math.sqrt((double) (var5 * var5 + var8 * var8)) + 0.99D);
        } else {
            int var9 = this.field3564 - var3;
            int var10 = var4 - this.field3564;
            return var9 > var10 ? (int) (Math.sqrt((double) (var6 * var6 + var9 * var9)) + 0.99D) : (int) (Math.sqrt((double) (var6 * var6 + var10 * var10)) + 0.99D);
        }
    }

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "()V", line = 746)
    public final void method1486() {
        this.field3531 = true;
        for (class36 var1 = (class36) this.field3547.method431(0); var1 != null; var1 = (class36) this.field3547.method439(-28512)) {
            if (var1.field797.field503.field4135 == 1) {
                var1.method2152((byte) 93);
            }
        }
        this.field3535 = new class118[8192];
        this.field3543 = 0;
        this.field3533 = new class170();
        this.field3550 = 0;
        this.field3547 = new class49();
        this.field3569 = 0;
        this.method460(false);
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(III)V", line = 955)
    public class214(int arg0, int arg1, int arg2) {
        this.field3568 = arg1;
        this.field3563 = arg2;
        this.field3535 = new class118[8192];
        this.field3539 = (long) arg0;
        this.field3562 = true;
        field3536.method1208(114, this);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lek;)V", line = 772)
    public static final void method1487(class206 arg0) {
        field3532 = 0;
        field3546 = 0;
        field3536 = new class170();
        field3528 = new class118[1024];
        class159.method1144((byte) -84, arg0);
        class308.method2248(arg0, false);
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V", line = 780)
    public static final void method1488(int arg0) {
        field3549 = arg0;
    }

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "()I", line = 787)
    public static final int method1489() {
        return field3549;
    }

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "()V", line = 793)
    public static final void method1490() {
        field3551 = (short[][]) null;
        field3553 = (short[][]) null;
        field3555 = null;
        field3567 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([Lvf;[Lue;Z[I[I[I)V", line = 804)
    public final void method1491(class341[] arg0, class19[] arg1, boolean arg2, int[] arg3, int[] arg4, int[] arg5) {
        if (!this.field3531) {
            this.method1474(arg0, arg2, arg3, arg4, arg5);
            this.method1472(arg1, arg2, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(J)V", line = 812)
    public static final void method1492(long arg0) {
        field3538 = field3530;
        field3540 = 0;
        field3530 = 0;
        long var2 = class218.method1520((byte) 39);
        for (class214 var4 = (class214) field3536.method1205(84); var4 != null; var4 = (class214) field3536.method1207(true)) {
            if (var4.method1484(arg0)) {
                field3540++;
            }
        }
        if (field3534 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + field3536.method1209(0) + ", running: " + field3540 + ". Particles: " + field3530 + ". Time taken: " + (class218.method1520((byte) 78) - var2) + "ms");
        }
    }

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "()V", line = 837)
    public static final void method1493() {
        GL var0 = class241.field4012;
        if (class281.field4606) {
            var0.glEnableClientState(32885);
        }
        var0.glEnableClientState(32888);
        var0.glDepthMask(true);
        var0.glColorMaterial(1028, 5634);
        var0.glPopMatrix();
        if (!class241.field4000) {
            var0.glEnable(2912);
        }
        if (field3544) {
            var0.glTexEnvi(34913, 34914, 0);
            var0.glDisable(34913);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V", line = 859)
    public static final void method1494(int arg0, int arg1, int arg2) {
        GL var3 = class241.field4012;
        if (field3544) {
            var3.glEnable(34913);
            var3.glTexEnvi(34913, 34914, 1);
        }
        var3.glDepthMask(false);
        class109.method815(-122, 0, 0);
        var3.glColorMaterial(1028, 4609);
        var3.glMaterialfv(1028, 4608, class231.field3791, 0);
        if (class281.field4606) {
            var3.glDisableClientState(32885);
        }
        var3.glDisableClientState(32888);
        var3.glPushMatrix();
        var3.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
        var3.glNormal3f(0.0F, -1.0F, 0.0F);
        if (!class241.field4000) {
            var3.glDisable(2912);
        }
    }
}
