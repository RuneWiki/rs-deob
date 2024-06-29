import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class262 extends class139 {

    @OriginalMember(owner = "client!sm", name = "B", descriptor = "Lgj;")
    private class593 field3609 = new class593();

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "I")
    private int field3601 = this.field2245 + -2;

    @OriginalMember(owner = "client!sm", name = "N", descriptor = "Lno;")
    public class658 field3620;

    @OriginalMember(owner = "client!sm", name = "x", descriptor = "[[I")
    private int[][] field3605;

    @OriginalMember(owner = "client!sm", name = "jb", descriptor = "[[F")
    private float[][] field3642;

    @OriginalMember(owner = "client!sm", name = "C", descriptor = "[[[I")
    public int[][][] field3610;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "[[[Lgn;")
    private class657[][][] field3596;

    @OriginalMember(owner = "client!sm", name = "G", descriptor = "[[B")
    private byte[][] field3614;

    @OriginalMember(owner = "client!sm", name = "db", descriptor = "[[F")
    private float[][] field3636;

    @OriginalMember(owner = "client!sm", name = "J", descriptor = "[[[I")
    private int[][][] field3617;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "[[S")
    public short[][] field3599;

    @OriginalMember(owner = "client!sm", name = "P", descriptor = "I")
    private int field3622;

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "[[[I")
    public int[][][] field3604;

    @OriginalMember(owner = "client!sm", name = "cb", descriptor = "[[B")
    private byte[][] field3635;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public int field3593;

    @OriginalMember(owner = "client!sm", name = "Z", descriptor = "[[F")
    private float[][] field3632;

    @OriginalMember(owner = "client!sm", name = "U", descriptor = "[[[I")
    public int[][][] field3627;

    @OriginalMember(owner = "client!sm", name = "L", descriptor = "[[[I")
    private int[][][] field3619;

    @OriginalMember(owner = "client!sm", name = "eb", descriptor = "Ljw;")
    private class520 field3637;

    @OriginalMember(owner = "client!sm", name = "A", descriptor = "Lwaa;")
    private class659 field3608;

    @OriginalMember(owner = "client!sm", name = "gb", descriptor = "Z")
    public static boolean field3639 = true;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "Lmf;")
    public static class388 field3598 = new class388();

    @OriginalMember(owner = "client!sm", name = "kb", descriptor = "Ljw;")
    public static class520 field3643 = new class520(64);

    @OriginalMember(owner = "client!sm", name = "mb", descriptor = "I")
    public static int field3645 = 0;

    @OriginalMember(owner = "client!sm", name = "nb", descriptor = "I")
    public static int field3646 = 0;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
    private int field3602;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!sm", name = "y", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!sm", name = "D", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!sm", name = "E", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!sm", name = "F", descriptor = "I")
    private int field3613;

    @OriginalMember(owner = "client!sm", name = "H", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!sm", name = "I", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!sm", name = "K", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!sm", name = "O", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!sm", name = "Q", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!sm", name = "R", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!sm", name = "S", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!sm", name = "T", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!sm", name = "W", descriptor = "I")
    private int field3629;

    @OriginalMember(owner = "client!sm", name = "ab", descriptor = "I")
    private int field3633;

    @OriginalMember(owner = "client!sm", name = "fb", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!sm", name = "V", descriptor = "Lgb;")
    private class202 field3628;

    @OriginalMember(owner = "client!sm", name = "lb", descriptor = "Ltb;")
    public static class371 field3644;

    @OriginalMember(owner = "client!sm", name = "X", descriptor = "Lgda;")
    public class51 field3630;

    @OriginalMember(owner = "client!sm", name = "bb", descriptor = "Lgda;")
    public class51 field3634;

    @OriginalMember(owner = "client!sm", name = "hb", descriptor = "Lgda;")
    public class51 field3640;

    @OriginalMember(owner = "client!sm", name = "ib", descriptor = "Lgda;")
    private class51 field3641;

    @OriginalMember(owner = "client!sm", name = "Y", descriptor = "[Lgn;")
    private class657[] field3631;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "[[[I")
    private int[][][] field3595;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)V")
    public final void method18(int arg0, int arg1) {
        ++field3606;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lno;IIII[[I[[II)V")
    public class262(class658 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field3620 = arg0;
        this.field3605 = arg5;
        this.field3642 = new float[super.field2247 + 1][super.field2248 + 1];
        this.field3610 = new int[arg3][arg4][];
        this.field3596 = new class657[arg3][arg4][];
        this.field3614 = new byte[arg3][arg4];
        this.field3636 = new float[super.field2247 + 1][super.field2248 + 1];
        this.field3617 = new int[arg3][arg4][];
        this.field3599 = new short[arg3 * arg4][];
        this.field3622 = 1 << this.field3601;
        this.field3604 = new int[arg3][arg4][];
        this.field3635 = new byte[arg3 + 1][arg4 + 1];
        this.field3593 = arg2;
        this.field3632 = new float[super.field2247 + 1][super.field2248 - -1];
        this.field3627 = new int[arg3][arg4][];
        this.field3619 = new int[arg3][arg4][];
        for (int var9 = 1; super.field2248 > var9; ++var9) {
            for (int var10 = 1; var10 < super.field2247; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 - -1] + -arg6[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (arg7 * arg7 * 4 + var11 * var11 + var12 * var12)));
                this.field3642[var10][var9] = (float) var11 * var13;
                this.field3632[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field3636[var10][var9] = (float) var12 * var13;
            }
        }
        this.field3637 = new class520(128);
        if (~(16 & this.field3593) != -1) {
            this.field3608 = new class659(this.field3620, this);
        }
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(IILw;)Lw;")
    public final class276 method199(int arg0, int arg1, class276 arg2) {
        ++field3618;
        if (~(1 & this.field3614[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field2250 >> this.field3620.field9187;
            class548 var5 = (class548) arg2;
            class548 var6;
            if (var5 != null && var5.method3050(var4, -25219, var4)) {
                var6 = var5;
                var5.method3045(true);
            } else {
                var6 = new class548(this.field3620, var4, var4);
            }
            var6.method3046(0, var4, 0, 121, var4);
            this.method1603(var6, arg1, (byte) -9, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lnw;IBI)V")
    private final void method1603(class548 arg0, int arg1, byte arg2, int arg3) {
        ++field3626;
        int var5 = -100 / ((-57 - arg2) / 42);
        int[] var6 = this.field3604[arg3][arg1];
        int[] var7 = this.field3610[arg3][arg1];
        int var8 = var6.length;
        if (~var8 < ~this.field3620.field9334.length) {
            this.field3620.field9339 = new int[var8];
            this.field3620.field9334 = new int[var8];
        }
        int[] var9 = this.field3620.field9334;
        int[] var10 = this.field3620.field9339;
        for (int var11 = 0; ~var11 > ~var8; ++var11) {
            var9[var11] = var6[var11] >> this.field3620.field9187;
            var10[var11] = var7[var11] >> this.field3620.field9187;
        }
        int var12 = 0;
        while (~var12 > ~var8) {
            int var13 = var9[var12];
            int var14 = var10[var12++];
            int var15 = var9[var12];
            int var16 = var10[var12++];
            int var17 = var9[var12];
            int var18 = var10[var12++];
            if (~((var13 - var15) * (var16 - var18) + -((-var14 + var16) * (-var15 + var17))) < -1) {
                arg0.method3049(var15, false, var18, var14, var16, var17, var13);
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "JA", descriptor = "(II)I")
    public final int method195(int arg0, int arg1) {
        ++field3638;
        return this.field3605[arg0][arg1];
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III[[ZZ)V")
    public final void method201(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method1606(arg2, arg0, arg3, arg4, arg1, 0, -1);
        ++field3625;
    }

    @OriginalMember(owner = "client!sm", name = "EA", descriptor = "(III)V")
    public final void method209(int arg0, int arg1, int arg2) {
        if (arg2 > (255 & this.field3635[arg0][arg1])) {
            this.field3635[arg0][arg1] = (byte) arg2;
        }
        ++field3611;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
    public static final void method1604(byte arg0) {
        for (int var1 = 0; var1 < 5; ++var1) {
            class141.field2262[var1] = false;
        }
        ++field3612;
        class353.field4814 = class553.field7350;
        class407.field5480 = -1;
        if (arg0 != 26) {
            field3643 = null;
        }
        class143.field2307 = -1;
        class696.field9775 = class643.field8632;
        class173.field2668 = -1;
        class376.field5068 = -1;
        class480.field6408 = 0;
        class140.field2254 = 5;
        class124.field2082 = class259.field3563;
        class62.field961 = class510.field6806;
        class2.field13 = 0;
        class328.field4520 = class642.field8626;
        class251.field3462 = class331.field4539;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method204(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field3615;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; ~var18 < ~var28; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var29];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var29];
            }
            ++var27;
            var19[var27] = arg2[var30];
            var20[var27] = arg4[var30];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var30];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var30];
            }
            ++var27;
            var19[var27] = arg2[var31];
            var20[var27] = arg4[var31];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method194(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field3616;
        if (~this.field3633 < -1) {
            this.field3620.method3613((byte) 123);
            this.field3620.method3619(false, -6137);
            this.field3620.method3653(false, 1000);
            this.field3620.method3632((byte) 73, false);
            this.field3620.method3680(-106, false);
            this.field3620.method3646(-2, 0);
            this.field3620.method3679(-71, -2);
            this.field3620.method3630((class367) null, -2);
            class82.field1284[5] = (float) arg2 / ((float) super.field2250 * 128.0F * (float) this.field3620.field9051);
            class82.field1284[1] = 0.0F;
            class82.field1284[2] = 0.0F;
            class82.field1284[8] = 0.0F;
            class82.field1284[0] = (float) arg2 / ((float) super.field2250 * 128.0F * (float) this.field3620.field9071);
            class82.field1284[3] = 0.0F;
            class82.field1284[10] = 0.0F;
            class82.field1284[7] = 0.0F;
            class82.field1284[14] = 0.0F;
            class82.field1284[6] = 0.0F;
            class82.field1284[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field3620.field9071) + -1.0F;
            class82.field1284[9] = 0.0F;
            class82.field1284[4] = 0.0F;
            class82.field1284[15] = 1.0F;
            class82.field1284[11] = 0.0F;
            class82.field1284[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field3620.field9051;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class82.field1284, 0);
            class82.field1284[15] = 1.0F;
            class82.field1284[0] = 1.0F;
            class82.field1284[3] = 0.0F;
            class82.field1284[8] = 0.0F;
            class82.field1284[14] = 0.0F;
            class82.field1284[4] = 0.0F;
            class82.field1284[1] = 0.0F;
            class82.field1284[10] = 0.0F;
            class82.field1284[2] = 0.0F;
            class82.field1284[9] = 1.0F;
            class82.field1284[11] = 0.0F;
            class82.field1284[7] = 0.0F;
            class82.field1284[5] = 0.0F;
            class82.field1284[12] = 0.0F;
            class82.field1284[6] = 1.0F;
            class82.field1284[13] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class82.field1284, 0);
            if ((this.field3593 & 7) == 0) {
                this.field3620.method3653(false, 1000);
            } else {
                this.field3620.method3653(true, 1000);
                this.field3620.method3651((byte) -121);
            }
            this.field3620.method3661(this.field3641, this.field3640, this.field3630, this.field3634, 107);
            if (~(this.field3613 * 2) < ~this.field3620.field9278.field4600.length) {
                this.field3620.field9278 = new class85(this.field3613 * 2);
            } else {
                this.field3620.field9278.field4619 = 0;
            }
            int var9 = 0;
            class85 var10 = this.field3620.field9278;
            if (this.field3620.field9272) {
                for (int var11 = arg4; ~var11 > ~arg6; ++var11) {
                    int var12 = super.field2247 * var11 + arg3;
                    for (int var13 = arg3; var13 < arg5; ++var13) {
                        if (arg7[-arg3 + var13][var11 - arg4]) {
                            short[] var14 = this.field3599[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var14.length < ~var15; ++var15) {
                                    ++var9;
                                    var10.method2031((byte) 54, var14[var15] & 65535);
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; arg6 > var16; ++var16) {
                    int var18 = super.field2247 * var16 + arg3;
                    for (int var19 = arg3; ~var19 > ~arg5; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field3599[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var21 > ~var20.length; ++var21) {
                                    var10.method2008(27798, var20[var21] & 65535);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class692 var17 = new class692(this.field3620, 5123, var10.field4600, var10.field4619);
                this.field3620.method3605(0, var17, var9, 4, (byte) 6);
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method194(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field3597;
        if (arg5 != null && this.field3595 == null) {
            this.field3595 = new int[super.field2247][super.field2248][];
        }
        if (arg3 != null && this.field3617 == null) {
            this.field3617 = new int[super.field2247][super.field2248][];
        }
        this.field3604[arg0][arg1] = arg2;
        this.field3610[arg0][arg1] = arg4;
        this.field3627[arg0][arg1] = arg6;
        this.field3619[arg0][arg1] = arg7;
        if (this.field3595 != null) {
            this.field3595[arg0][arg1] = arg5;
        }
        if (this.field3617 != null) {
            this.field3617[arg0][arg1] = arg3;
        }
        class657[] var15 = this.field3596[arg0][arg1] = new class657[arg6.length];
        for (int var16 = 0; ~arg6.length < ~var16; ++var16) {
            long var17 = (long) (arg9[var16] << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) arg8[var16];
            class504 var19;
            for (var19 = this.field3637.method2918(var17, (byte) -48); var19 != null; var19 = this.field3637.method2919((byte) 59)) {
                class657 var20 = (class657) var19;
                if (~arg8[var16] == ~var20.field8968 && (float) arg9[var16] == var20.field8973 && ~var20.field8969 == ~arg10 && ~var20.field8974 == ~arg11 && ~var20.field8970 == ~arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class657) var19;
            } else {
                var15[var16] = new class657(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field3637.method2911(var17, var15[var16], (byte) -28);
            }
        }
        if (arg13) {
            this.field3614[arg0][arg1] = (byte) class220.method1393(this.field3614[arg0][arg1], 1);
        }
        if (this.field3629 < arg6.length) {
            this.field3629 = arg6.length;
        }
        this.field3633 += arg6.length;
    }

    @OriginalMember(owner = "client!sm", name = "FA", descriptor = "(Lw;IIIIZ)V")
    public final void method208(class276 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3594;
        if (this.field3608 != null && arg0 != null) {
            int var7 = -(this.field3620.field9254 * arg2 >> 8) + arg1 >> this.field3620.field9187;
            int var8 = -(this.field3620.field9219 * arg2 >> 8) + arg3 >> this.field3620.field9187;
            this.field3608.method3692(var7, var8, arg0, -3500);
        }
    }

    @OriginalMember(owner = "client!sm", name = "aa", descriptor = "(Lw;IIIIZ)V")
    public final void method198(class276 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3600;
        if (this.field3608 != null && arg0 != null) {
            int var7 = -(this.field3620.field9254 * arg2 >> 8) + arg1 >> this.field3620.field9187;
            int var8 = arg3 - (this.field3620.field9219 * arg2 >> 8) >> this.field3620.field9187;
            this.field3608.method3694(var8, arg0, 0, var7);
        }
    }

    @OriginalMember(owner = "client!sm", name = "ba", descriptor = "()V")
    public final void method207() {
        if (~this.field3633 < -1) {
            byte[][] var1 = new byte[super.field2247 + 1][super.field2248 + 1];
            for (int var2 = 1; ~var2 > ~super.field2247; ++var2) {
                for (int var103 = 1; ~var103 > ~super.field2248; ++var103) {
                    var1[var2][var103] = (byte) ((this.field3635[var2][var103 + -1] >> 2) + (this.field3635[var2 - -1][var103] >> 3) + (this.field3635[var2 + -1][var103] >> 2) + (this.field3635[var2][var103 + 1] >> 3) + (this.field3635[var2][var103] >> 1));
                }
            }
            this.field3631 = new class657[this.field3637.method2920(false)];
            this.field3637.method2913(this.field3631, 0);
            for (int var3 = 0; ~this.field3631.length < ~var3; ++var3) {
                this.field3631[var3].method3595(4, this.field3633);
            }
            int var4 = 24;
            if (this.field3595 != null) {
                var4 += 4;
            }
            if (~(this.field3593 & 7) != -1) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field3620.field9185.method3467(this.field3633 * var4, false);
            Stream var6 = new Stream(var5);
            class657[] var7 = new class657[this.field3633];
            int var8 = class132.method996(this.field3633 / 4, 75);
            if (~var8 > -2) {
                var8 = 1;
            }
            class520 var9 = new class520(var8);
            class657[] var10 = new class657[this.field3629];
            for (int var11 = 0; var11 < super.field2247; ++var11) {
                for (int var30 = 0; super.field2248 > var30; ++var30) {
                    if (this.field3627[var11][var30] != null) {
                        class657[] var31 = this.field3596[var11][var30];
                        int[] var32 = this.field3604[var11][var30];
                        int[] var33 = this.field3610[var11][var30];
                        int[] var34 = this.field3619[var11][var30];
                        int[] var35 = this.field3627[var11][var30];
                        int[] var36 = this.field3617 == null ? null : this.field3617[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field3595 != null ? this.field3595[var11][var30] : null;
                        float var38 = this.field3642[var11][var30];
                        float var39 = this.field3632[var11][var30];
                        float var40 = this.field3636[var11][var30];
                        float var41 = this.field3642[var11][var30 - -1];
                        float var42 = this.field3632[var11][var30 + 1];
                        float var43 = this.field3636[var11][var30 + 1];
                        float var44 = this.field3642[var11 - -1][var30 - -1];
                        float var45 = this.field3632[var11 + 1][var30 - -1];
                        float var46 = this.field3636[var11 + 1][var30 - -1];
                        float var47 = this.field3642[var11 + 1][var30];
                        float var48 = this.field3632[var11 + 1][var30];
                        float var49 = this.field3636[var11 + 1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = var1[var11][var30 + 1] & 255;
                        int var52 = var1[var11 + 1][var30 + 1] & 255;
                        int var53 = 255 & var1[var11 + 1][var30];
                        int var54 = 0;
                        label339: for (int var55 = 0; var55 < var35.length; ++var55) {
                            class657 var101 = var31[var55];
                            for (int var102 = 0; ~var54 < ~var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label339;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field3599[super.field2247 * var30 - -var11] = new short[var35.length];
                        for (int var57 = 0; ~var35.length < ~var57; ++var57) {
                            int var58 = (var11 << super.field2245) - -var32[var57];
                            int var59 = (var30 << super.field2245) - -var33[var57];
                            int var60 = var58 >> this.field3601;
                            int var61 = var59 >> this.field3601;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) var61 | (long) var63 << 48 | (long) var62 << 32 | (long) (var60 << 16);
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            float var72;
                            float var73;
                            int var74;
                            float var75;
                            if (var67 == 0 && ~var68 == -1) {
                                var72 = var40;
                                var73 = var38;
                                var74 = var69 - var50;
                                var75 = var39;
                            } else if (~var67 == -1 && super.field2250 == var68) {
                                var74 = var69 - var51;
                                var75 = var42;
                                var73 = var41;
                                var72 = var43;
                            } else if (~super.field2250 == ~var67 && ~super.field2250 == ~var68) {
                                var72 = var46;
                                var75 = var45;
                                var74 = var69 - var52;
                                var73 = var44;
                            } else if (super.field2250 == var67 && var68 == 0) {
                                var75 = var48;
                                var73 = var47;
                                var72 = var49;
                                var74 = var69 - var53;
                            } else {
                                float var76 = (float) var67 / (float) super.field2250;
                                float var77 = (float) var68 / (float) super.field2250;
                                float var78 = (var47 - var38) * var76 + var38;
                                float var79 = (var48 - var39) * var76 + var39;
                                float var80 = (var49 - var40) * var76 + var40;
                                float var81 = (var44 - var41) * var76 + var41;
                                float var82 = (var45 - var42) * var76 + var42;
                                var75 = (-var79 + var82) * var77 + var79;
                                float var83 = (-var43 + var46) * var76 + var43;
                                var73 = (-var78 + var81) * var77 + var78;
                                var72 = (var83 - var80) * var77 + var80;
                                int var84 = ((var53 - var50) * var67 >> super.field2245) + var50;
                                int var85 = ((-var51 + var52) * var67 >> super.field2245) + var51;
                                var74 = var69 - (((-var84 + var85) * var68 >> super.field2245) + var84);
                            }
                            if (~var62 != 0) {
                                int var86 = (var62 & 127) * var74 >> 7;
                                if (var86 >= 2) {
                                    if (var86 > 126) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                var70 = class444.field6084[var62 & 65408 | var86];
                                if (~(7 & this.field3593) == -1) {
                                    float var87 = this.field3620.field9216[2] * var72 + this.field3620.field9216[1] * var75 + this.field3620.field9216[0] * var73;
                                    var71 = var87 * (!(var87 > 0.0F) ? this.field3620.field9235 : this.field3620.field9213) + this.field3620.field9293;
                                }
                            }
                            class504 var88 = null;
                            if ((this.field3622 + -1 & var58) == 0 && (var59 & this.field3622 - 1) == 0) {
                                var88 = var9.method2918(var65, (byte) -24);
                            }
                            int var99;
                            if (var88 == null) {
                                int var89;
                                if (var62 == var63) {
                                    var89 = var70;
                                } else {
                                    int var90 = (var63 & 127) * var74 >> 7;
                                    if (var90 >= 2) {
                                        if (~var90 < -127) {
                                            var90 = 126;
                                        }
                                    } else {
                                        var90 = 2;
                                    }
                                    var89 = class444.field6084[var63 & 65408 | var90];
                                    if (~(this.field3593 & 7) == -1) {
                                        float var91 = this.field3620.field9216[2] * var72 + this.field3620.field9216[1] * var75 + this.field3620.field9216[0] * var73;
                                        float var92 = this.field3620.field9293 + (!(var71 > 0.0F) ? this.field3620.field9235 : this.field3620.field9213) * var71;
                                        int var93 = (var89 & 16713360) >> 16;
                                        int var94 = var89 >> 8 & 255;
                                        int var95 = (int) ((float) var93 * var92);
                                        int var96 = var89 & 255;
                                        int var97 = (int) ((float) var94 * var92);
                                        if (var95 < 0) {
                                            var95 = 0;
                                        } else if (~var95 < -256) {
                                            var95 = 255;
                                        }
                                        if (~var97 <= -1) {
                                            if (var97 > 255) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        int var98 = (int) ((float) var96 * var92);
                                        if (~var98 <= -1) {
                                            if (~var98 < -256) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        var89 = var95 << 16 | var97 << 8 | var98;
                                    }
                                }
                                if (this.field3620.field9272) {
                                    var6.method3480((float) var58);
                                    var6.method3480((float) (var64 + this.method200(var58, var59)));
                                    var6.method3480((float) var59);
                                    var6.method3482((byte) (var89 >> 16));
                                    var6.method3482((byte) (var89 >> 8));
                                    var6.method3482((byte) var89);
                                    var6.method3482(-1);
                                    var6.method3480((float) var58);
                                    var6.method3480((float) var59);
                                    if (this.field3595 != null) {
                                        var6.method3480((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if ((7 & this.field3593) != 0) {
                                        var6.method3480(var73);
                                        var6.method3480(var75);
                                        var6.method3480(var72);
                                    }
                                } else {
                                    var6.method3477((float) var58);
                                    var6.method3477((float) (var64 + this.method200(var58, var59)));
                                    var6.method3477((float) var59);
                                    var6.method3482((byte) (var89 >> 16));
                                    var6.method3482((byte) (var89 >> 8));
                                    var6.method3482((byte) var89);
                                    var6.method3482(-1);
                                    var6.method3477((float) var58);
                                    var6.method3477((float) var59);
                                    if (this.field3595 != null) {
                                        var6.method3477((float) (var37 != null ? var37[var57] - 1 : 0));
                                    }
                                    if ((this.field3593 & 7) != 0) {
                                        var6.method3477(var73);
                                        var6.method3477(var75);
                                        var6.method3477(var72);
                                    }
                                }
                                var99 = this.field3602++;
                                var56[var57] = (short) var99;
                                if (~var62 != 0) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method2911(var65, new class286(var56[var57]), (byte) -28);
                            } else {
                                var56[var57] = ((class286) var88).field4030;
                                var99 = var56[var57] & 65535;
                                if (var62 != -1 && var31[var57].field6724 < var7[var99].field6724) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; var54 > var100; ++var100) {
                                var10[var100].method3597(-17792, var70, var74, var71, var99);
                            }
                            ++this.field3613;
                        }
                    }
                }
            }
            for (int var12 = 0; this.field3602 > var12; ++var12) {
                class657 var29 = var7[var12];
                if (var29 != null) {
                    var29.method3600((byte) -103, var12);
                }
            }
            for (int var13 = 0; ~var13 > ~super.field2247; ++var13) {
                for (int var18 = 0; ~var18 > ~super.field2248; ++var18) {
                    short[] var19 = this.field3599[super.field2247 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var21 > ~var19.length) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = var19[var21++] & 65535;
                            int var24 = 65535 & var19[var21++];
                            class657 var25 = var7[var22];
                            class657 var26 = var7[var23];
                            class657 var27 = var7[var24];
                            class657 var28 = null;
                            if (var25 != null) {
                                var25.method3594(var20, 1, var13, var18);
                                var28 = var25;
                            }
                            if (var26 != null) {
                                var26.method3594(var20, 1, var13, var18);
                                if (var28 == null || ~var28.field6724 < ~var26.field6724) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method3594(var20, 1, var13, var18);
                                if (var28 == null || var27.field6724 < var28.field6724) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method3600((byte) -103, var22);
                                }
                                if (var26 != null) {
                                    var28.method3600((byte) -103, var23);
                                }
                                if (var27 != null) {
                                    var28.method3600((byte) -103, var24);
                                }
                                var28.method3594(var20, 1, var13, var18);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3479();
            this.field3628 = this.field3620.method3608(false, 1, var6.method3471(), var4, var5);
            this.field3640 = new class51(this.field3628, 5126, 3, 0);
            this.field3641 = new class51(this.field3628, 5121, 4, 12);
            byte var14;
            if (this.field3595 == null) {
                this.field3634 = new class51(this.field3628, 5126, 2, 16);
                var14 = 24;
            } else {
                this.field3634 = new class51(this.field3628, 5126, 3, 16);
                var14 = 28;
            }
            if ((this.field3593 & 7) != 0) {
                this.field3630 = new class51(this.field3628, 5126, 3, var14);
            }
            long[] var15 = new long[this.field3631.length];
            for (int var16 = 0; this.field3631.length > var16; ++var16) {
                class657 var17 = this.field3631[var16];
                var15[var16] = var17.field6724;
                var17.method3598(0, this.field3602);
            }
            class28.method242(this.field3631, var15, (byte) -75);
            if (this.field3608 != null) {
                this.field3608.method3686((byte) 88);
            }
        } else {
            this.field3608 = null;
        }
        ++field3603;
        this.field3604 = this.field3610 = null;
        this.field3627 = null;
        this.field3642 = this.field3632 = this.field3636 = null;
        this.field3635 = null;
        this.field3619 = null;
        this.field3596 = null;
        this.field3637 = null;
        this.field3595 = null;
        this.field3617 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZLjava/io/File;)[B")
    public static final byte[] method1605(boolean arg0, File arg1) {
        ++field3592;
        if (!arg0) {
            method1605(false, (File) null);
        }
        return class584.method3213(73, arg1, (int) arg1.length());
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lw;IIIIZ)Z")
    public final boolean method203(class276 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3607;
        if (this.field3608 != null && arg0 != null) {
            int var7 = -(this.field3620.field9254 * arg2 >> 8) + arg1 >> this.field3620.field9187;
            int var8 = arg3 - (this.field3620.field9219 * arg2 >> 8) >> this.field3620.field9187;
            return this.field3608.method3690(arg0, -20262, var8, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lpv;[I)V")
    public final void method206(class65 arg0, int[] arg1) {
        ++field3621;
        this.field3609.method3265(new class126(this.field3620, this, arg0, arg1), (byte) -93);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II[[ZZIII)V")
    private final void method1606(int arg0, int arg1, boolean[][] arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (this.field3631 != null) {
            int var8 = arg0 + 1 - -arg0;
            int var9 = var8 * var8;
            if (this.field3620.field9337.length < var9) {
                this.field3620.field9337 = new int[var9];
            }
            if (this.field3620.field9278.field4600.length < this.field3613 * 2) {
                this.field3620.field9278 = new class85(this.field3613 * 2);
            }
            int var10 = -arg0 + arg1;
            int var11 = var10;
            if (~var10 > -1) {
                var10 = 0;
            }
            int var12 = -arg0 + arg4;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = arg0 + arg1;
            if (~(super.field2247 + -1) > ~var14) {
                var14 = super.field2247 + -1;
            }
            int var15 = arg0 + arg4;
            if (super.field2248 + -1 < var15) {
                var15 = super.field2248 + -1;
            }
            int var16 = 0;
            int[] var17 = this.field3620.field9337;
            for (int var18 = var10; var18 <= var14; ++var18) {
                boolean[] var24 = arg2[-var11 + var18];
                for (int var25 = var12; ~var25 >= ~var15; ++var25) {
                    if (var24[-var13 + var25]) {
                        var17[var16++] = super.field2247 * var25 + var18;
                    }
                }
            }
            if (~arg6 == 0) {
                this.field3620.method3660((byte) 42);
            } else {
                this.field3620.method3655((float) arg6, 97);
                this.field3620.method3676(-51);
            }
            this.field3620.method3653((this.field3593 & 7) != 0, arg5 ^ 1000);
            for (int var19 = 0; ~var19 > ~this.field3631.length; ++var19) {
                this.field3631[var19].method3599(arg5 ^ 123, var17, var16);
            }
            if (!this.field3609.method3254((byte) 32)) {
                int var20 = this.field3620.field9296;
                int var21 = this.field3620.field9332;
                this.field3620.method422(0, var21, this.field3620.field9215);
                this.field3620.method3653(false, 1000);
                this.field3620.method3680(-109, false);
                this.field3620.method3646(-2, 128);
                this.field3620.method3679(arg5 ^ -50, -2);
                this.field3620.method3630(this.field3620.field9285, -2);
                this.field3620.method3644(7681, arg5 ^ 23560, 8448);
                this.field3620.method3609((byte) 27, 770, 0, 34166);
                this.field3620.method3672(770, 0, 34167, -6491);
                for (class504 var22 = this.field3609.method3257(-45); var22 != null; var22 = this.field3609.method3263((byte) -128)) {
                    class126 var23 = (class126) var22;
                    var23.method972(arg1, false, arg0, arg4, arg2);
                }
                this.field3620.method3609((byte) 27, 768, 0, 5890);
                this.field3620.method3672(770, 0, 5890, -6491);
                this.field3620.method3630((class367) null, -2);
                this.field3620.method422(var20, var21, this.field3620.field9215);
            }
            if (this.field3608 != null) {
                this.field3620.method3661((class51) null, this.field3640, (class51) null, this.field3634, arg5 ^ 86);
                this.field3608.method3687(0, arg1, arg0, arg2, arg4, arg3);
            }
        }
        if (arg5 != 0) {
            this.field3636 = null;
        }
        ++field3623;
    }

    @OriginalMember(owner = "client!sm", name = "sa", descriptor = "(II)I")
    public final int method200(int arg0, int arg1) {
        ++field3624;
        int var3 = arg0 >> super.field2245;
        int var4 = arg1 >> super.field2245;
        if (~var3 <= -1 && ~var4 <= -1 && super.field2247 + -1 >= var3 && var4 <= super.field2248 - 1) {
            int var5 = super.field2250 - 1 & arg0;
            int var6 = super.field2250 + -1 & arg1;
            int var7 = (super.field2250 - var5) * this.field3605[var3][var4] + this.field3605[var3 + 1][var4] * var5 >> super.field2245;
            int var8 = (-var5 + super.field2250) * this.field3605[var3][var4 + 1] + this.field3605[var3 - -1][var4 + 1] * var5 >> super.field2245;
            return (-var6 + super.field2250) * var7 + var6 * var8 >> super.field2245;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V")
    public static void method1607(int arg0) {
        int var1 = -15 / ((arg0 - -65) / 37);
        field3644 = null;
        field3643 = null;
        field3598 = null;
    }
}
