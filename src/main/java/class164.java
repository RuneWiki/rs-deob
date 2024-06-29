import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class164 extends class18 {

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public int field2772 = 0;

    @OriginalMember(owner = "client!ki", name = "B", descriptor = "Z")
    public boolean field2783 = false;

    @OriginalMember(owner = "client!ki", name = "C", descriptor = "Lic;")
    private class117 field2784 = new class117();

    @OriginalMember(owner = "client!ki", name = "U", descriptor = "I")
    private int field2802 = 0;

    @OriginalMember(owner = "client!ki", name = "N", descriptor = "Ljg;")
    public class303 field2795 = new class303();

    @OriginalMember(owner = "client!ki", name = "db", descriptor = "I")
    private int field2811 = 0;

    @OriginalMember(owner = "client!ki", name = "ab", descriptor = "Z")
    private boolean field2808 = false;

    @OriginalMember(owner = "client!ki", name = "Y", descriptor = "Z")
    private boolean field2806 = false;

    @OriginalMember(owner = "client!ki", name = "kb", descriptor = "I")
    private int field2818;

    @OriginalMember(owner = "client!ki", name = "cb", descriptor = "I")
    private int field2810;

    @OriginalMember(owner = "client!ki", name = "A", descriptor = "[Ltj;")
    public class181[] field2782;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "J")
    private long field2775;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "Z")
    public static boolean field2773 = false;

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "I")
    public static int field2779 = 0;

    @OriginalMember(owner = "client!ki", name = "D", descriptor = "I")
    public static int field2785 = 0;

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "I")
    public static int field2787 = 0;

    @OriginalMember(owner = "client!ki", name = "I", descriptor = "I")
    public static int field2790 = 0;

    @OriginalMember(owner = "client!ki", name = "G", descriptor = "Z")
    public static boolean field2788 = false;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "Lde;")
    public static class62 field2776 = new class62(8);

    @OriginalMember(owner = "client!ki", name = "K", descriptor = "[Z")
    private static boolean[] field2792 = new boolean[8];

    @OriginalMember(owner = "client!ki", name = "M", descriptor = "[Z")
    private static boolean[] field2794 = new boolean[8];

    @OriginalMember(owner = "client!ki", name = "J", descriptor = "I")
    private static int field2791 = 0;

    @OriginalMember(owner = "client!ki", name = "P", descriptor = "I")
    public static int field2797 = 0;

    @OriginalMember(owner = "client!ki", name = "S", descriptor = "I")
    public static int field2800 = 2;

    @OriginalMember(owner = "client!ki", name = "O", descriptor = "Lkh;")
    private static class14 field2796 = new class14(131056);

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!ki", name = "V", descriptor = "I")
    public int field2803;

    @OriginalMember(owner = "client!ki", name = "W", descriptor = "I")
    public int field2804;

    @OriginalMember(owner = "client!ki", name = "X", descriptor = "I")
    public int field2805;

    @OriginalMember(owner = "client!ki", name = "Z", descriptor = "I")
    public int field2807;

    @OriginalMember(owner = "client!ki", name = "bb", descriptor = "I")
    public int field2809;

    @OriginalMember(owner = "client!ki", name = "eb", descriptor = "I")
    public int field2812;

    @OriginalMember(owner = "client!ki", name = "fb", descriptor = "I")
    public int field2813;

    @OriginalMember(owner = "client!ki", name = "gb", descriptor = "I")
    public int field2814;

    @OriginalMember(owner = "client!ki", name = "hb", descriptor = "I")
    public int field2815;

    @OriginalMember(owner = "client!ki", name = "ib", descriptor = "I")
    public int field2816;

    @OriginalMember(owner = "client!ki", name = "jb", descriptor = "I")
    public int field2817;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "J")
    private long field2777;

    @OriginalMember(owner = "client!ki", name = "H", descriptor = "J")
    public long field2789;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "Lic;")
    private static class117 field2778;

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2780;

    @OriginalMember(owner = "client!ki", name = "L", descriptor = "[I")
    public static int[] field2793;

    @OriginalMember(owner = "client!ki", name = "Q", descriptor = "[I")
    public static int[] field2798;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "[Ltj;")
    public static class181[] field2774;

    @OriginalMember(owner = "client!ki", name = "R", descriptor = "[[S")
    public static short[][] field2799;

    @OriginalMember(owner = "client!ki", name = "T", descriptor = "[[S")
    public static short[][] field2801;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIII)V", line = 6)
    public final void method1108(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field2783) {
            return;
        }
        if (this.field2803 != arg0) {
            for (class292 var6 = (class292) this.field2784.method840(78); var6 != null; var6 = (class292) this.field2784.method839((byte) 68)) {
                var6.field4976 = true;
            }
        }
        this.field2777 = this.field2789;
        this.field2803 = arg0;
        this.field2813 = arg1;
        this.field2807 = arg2;
        this.field2812 = arg3;
        this.field2809 = arg4;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)V", line = 32)
    public static final void method1109(int arg0, int arg1, int arg2) {
        GL var3 = class108.field1899;
        var3.glDepthMask(false);
        class257.method1832((byte) 56, 0, 0);
        var3.glColorMaterial(1028, 4609);
        var3.glMaterialfv(1028, 4608, class235.field4068, 0);
        var3.glDisableClientState(32885);
        var3.glDisableClientState(32888);
        var3.glPushMatrix();
        var3.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
        var3.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(III)V", line = 866)
    public class164(int arg0, int arg1, int arg2) {
        this.field2818 = arg1;
        this.field2810 = arg2;
        this.field2782 = new class181[8192];
        this.field2775 = (long) arg0;
        this.field2806 = true;
        field2778.method832(true, this);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(IIIII)V", line = 52)
    public final void method1110(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1108(arg0, arg1, class331.field5639 + arg2, class42.field754 + arg3, class61.field1045 + arg4);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(J)V", line = 55)
    public static final void method1111(long arg0) {
        field2785 = 0;
        field2787 = 0;
        long var2 = class153.method1032(121);
        for (class164 var4 = (class164) field2778.method840(8); var4 != null; var4 = (class164) field2778.method839((byte) 79)) {
            if (var4.method1124(arg0)) {
                field2785++;
            }
        }
        if (field2788 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + field2778.method838((byte) 96) + ", running: " + field2785 + ". Particles: " + field2787 + ". Time taken: " + (class153.method1032(108) - var2) + "ms");
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()I", line = 77)
    public static final int method1112() {
        return field2800;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)V", line = 83)
    private final void method1113(int arg0, int arg1) {
        for (class182 var3 = (class182) this.field2795.method2078(-93); var3 != null; var3 = (class182) this.field2795.method2080(5)) {
            var3.field3153 = this.field2807 + var3.field3145;
            var3.field3150 = this.field2812 + var3.field3147;
            var3.field3152 = this.field2809 + var3.field3151;
            if (this.field2803 == 0) {
                var3.field3146 = var3.field3143.field2965.field2337;
                var3.field3148 = var3.field3143.field2965.field2333;
            } else {
                int var4 = var3.field3143.field2965.field2337;
                int var5 = var3.field3143.field2965.field2333;
                var3.field3146 = arg0 * var5 + arg1 * var4 >> 16;
                var3.field3148 = arg1 * var5 - arg0 * var4 >> 16;
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "()V", line = 109)
    public final void method1114() {
        this.field2783 = true;
        for (class182 var1 = (class182) this.field2795.method2078(-105); var1 != null; var1 = (class182) this.field2795.method2080(5)) {
            if (var1.field3143.field2965.field2342 == 1) {
                var1.method1986((byte) 86);
            }
        }
        this.field2782 = new class181[8192];
        this.field2772 = 0;
        this.field2784 = new class117();
        this.field2802 = 0;
        this.field2795 = new class303();
        this.field2811 = 0;
        this.method172(338);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljavax/media/opengl/GL;IZZ)V", line = 131)
    public final void method1115(GL arg0, int arg1, boolean arg2, boolean arg3) {
        if (!arg3) {
            arg0.glDisable(2896);
        }
        field2796.field195 = 0;
        if (class108.field1911) {
            for (int var5 = arg1 - 1; var5 >= 0; var5--) {
                int var6 = field2798[var5] > 32 ? 32 : field2798[var5];
                if (var6 > 0) {
                    for (int var7 = var6 - 1; var7 >= 0; var7--) {
                        class181 var8 = this.field2782[field2801[var5][var7]];
                        field2796.method130(false, (float) (var8.field3131 >> 12));
                        field2796.method130(false, (float) (var8.field3129 >> 12));
                        field2796.method130(false, (float) (var8.field3127 >> 12));
                        int var9 = var8.field3133;
                        field2796.method140((byte) (var9 >> 16), (byte) 75);
                        field2796.method140((byte) (var9 >> 8), (byte) 75);
                        field2796.method140((byte) var9, (byte) 75);
                        field2796.method140((byte) (var9 >> 24), (byte) 75);
                    }
                    if (field2798[var5] > 32) {
                        int var10 = field2798[var5] - 32 - 1;
                        for (int var11 = field2793[var10] - 1; var11 >= 0; var11--) {
                            class181 var12 = this.field2782[field2799[var10][var11]];
                            field2796.method130(false, (float) (var12.field3131 >> 12));
                            field2796.method130(false, (float) (var12.field3129 >> 12));
                            field2796.method130(false, (float) (var12.field3127 >> 12));
                            int var13 = var12.field3133;
                            field2796.method140((byte) (var13 >> 16), (byte) 75);
                            field2796.method140((byte) (var13 >> 8), (byte) 75);
                            field2796.method140((byte) var13, (byte) 75);
                            field2796.method140((byte) (var13 >> 24), (byte) 75);
                        }
                    }
                }
            }
        } else {
            for (int var14 = arg1 - 1; var14 >= 0; var14--) {
                int var15 = field2798[var14] > 32 ? 32 : field2798[var14];
                if (var15 > 0) {
                    for (int var16 = var15 - 1; var16 >= 0; var16--) {
                        class181 var17 = this.field2782[field2801[var14][var16]];
                        field2796.method91((float) (var17.field3131 >> 12), (byte) 65);
                        field2796.method91((float) (var17.field3129 >> 12), (byte) 58);
                        field2796.method91((float) (var17.field3127 >> 12), (byte) -30);
                        int var18 = var17.field3133;
                        field2796.method140((byte) (var18 >> 16), (byte) 75);
                        field2796.method140((byte) (var18 >> 8), (byte) 75);
                        field2796.method140((byte) var18, (byte) 75);
                        field2796.method140((byte) (var18 >> 24), (byte) 75);
                    }
                    if (field2798[var14] > 32) {
                        int var19 = field2798[var14] - 32 - 1;
                        for (int var20 = field2793[var19] - 1; var20 >= 0; var20--) {
                            class181 var21 = this.field2782[field2799[var19][var20]];
                            field2796.method91((float) (var21.field3131 >> 12), (byte) 126);
                            field2796.method91((float) (var21.field3129 >> 12), (byte) -49);
                            field2796.method91((float) (var21.field3127 >> 12), (byte) 67);
                            int var22 = var21.field3133;
                            field2796.method140((byte) (var22 >> 16), (byte) 75);
                            field2796.method140((byte) (var22 >> 8), (byte) 75);
                            field2796.method140((byte) var22, (byte) 75);
                            field2796.method140((byte) (var22 >> 24), (byte) 75);
                        }
                    }
                }
            }
        }
        if (field2796.field195 != 0) {
            if (class108.field1904) {
                arg0.glBindBufferARB(34962, 0);
            }
            this.field2780 = ByteBuffer.allocateDirect(field2796.field195).order(ByteOrder.nativeOrder());
            this.field2780.put(field2796.field174, 0, field2796.field195);
            this.field2780.flip();
            this.field2780.position(0);
            arg0.glVertexPointer(3, 5126, 16, this.field2780);
            this.field2780.position(12);
            arg0.glColorPointer(4, 5121, 16, this.field2780);
            arg0.glDrawArrays(0, 0, field2796.field195 >> 4);
        }
        if (!arg3) {
            arg0.glEnable(2896);
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "()V", line = 279)
    public static final void method1116() {
        field2801 = new short[1600][32];
        field2799 = new short[32][768];
        field2798 = new int[1600];
        field2793 = new int[32];
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "()V", line = 287)
    public static final void method1117() {
        field2801 = (short[][]) null;
        field2799 = (short[][]) null;
        field2798 = null;
        field2793 = null;
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "()V", line = 294)
    public static final void method1118() {
        GL var0 = class108.field1899;
        var0.glEnableClientState(32885);
        var0.glEnableClientState(32888);
        var0.glDepthMask(true);
        var0.glColorMaterial(1028, 5634);
        var0.glPopMatrix();
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([Lcn;Z[I[I[I)V", line = 307)
    private final void method1119(class269[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field2792[var6] = false;
        }
        label64: for (class292 var7 = (class292) this.field2784.method840(9); var7 != null; var7 = (class292) this.field2784.method839((byte) 37)) {
            if (arg0 != null) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    if (arg0[var8] == var7.field5001) {
                        field2792[var8] = true;
                        var7.field4979 = false;
                        continue label64;
                    }
                }
            }
            if (!arg1) {
                if (var7.field5008 == 0) {
                    var7.method172(338);
                    this.field2802--;
                } else {
                    var7.field4979 = true;
                }
            }
        }
        if (arg0 != null) {
            for (int var9 = 0; var9 < arg0.length && this.field2802 != 8; var9++) {
                if (!field2792[var9]) {
                    class292 var10 = new class292(arg0[var9], this, this.field2789);
                    this.field2784.method832(true, var10);
                    this.field2802++;
                }
            }
        }
        for (class292 var11 = (class292) this.field2784.method840(-126); var11 != null; var11 = (class292) this.field2784.method839((byte) 111)) {
            var11.method2024(arg3[var11.field5001.field4617], arg3[var11.field5001.field4613], arg4[var11.field5001.field4617], 91, arg2[var11.field5001.field4617], arg4[var11.field5001.field4626], arg4[var11.field5001.field4613], arg2[var11.field5001.field4626], arg2[var11.field5001.field4613], arg3[var11.field5001.field4626]);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIIIII)V", line = 387)
    public final void method1120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field2783 || !this.field2808 || !class108.field1900) {
            return;
        }
        GL var10 = class108.field1899;
        int var11 = class331.field5639;
        int var12 = class42.field754;
        int var13 = class61.field1045;
        method1109(var11, var12, var13);
        int var14 = arg4 * arg8 - arg3 * arg6 >> 16;
        int var15 = arg1 * arg7 + arg2 * var14 >> 16;
        int var16;
        if (this.field2816 == this.field2814 && this.field2817 == this.field2815) {
            var16 = 92;
        } else {
            int var17 = this.field2816 << 7;
            int var18 = (this.field2814 << 7) + 128;
            int var19 = this.field2815 << 7;
            int var20 = (this.field2817 << 7) + 128;
            int var21 = this.field2807 - var17;
            int var22 = var18 - this.field2807;
            if (var21 > var22) {
                int var23 = this.field2809 - var19;
                int var24 = var20 - this.field2809;
                if (var23 > var24) {
                    var16 = (int) (Math.sqrt((double) (var21 * var21 + var23 * var23)) + 0.99D);
                } else {
                    var16 = (int) (Math.sqrt((double) (var21 * var21 + var24 * var24)) + 0.99D);
                }
            } else {
                int var25 = this.field2809 - var19;
                int var26 = var20 - this.field2809;
                if (var25 > var26) {
                    var16 = (int) (Math.sqrt((double) (var22 * var22 + var25 * var25)) + 0.99D);
                } else {
                    var16 = (int) (Math.sqrt((double) (var22 * var22 + var26 * var26)) + 0.99D);
                }
            }
        }
        int var27 = (arg1 * 0 + arg2 * var16 >> 16) + var15;
        int var28 = (-var16 * arg2 - (this.field2805 - this.field2804) * arg1 >> 16) + var15;
        int var29 = var27 + 2 - var28;
        if (var29 >= 1600) {
            if (field2788) {
                System.out.println("Model too big for particles - radixsize:" + var29 + " maxmodelsize:" + 1600);
            }
            var10.glDepthMask(true);
            var10.glColorMaterial(1028, 5634);
            return;
        }
        class18 var30 = this.field2784.field2095;
        for (class18 var31 = var30.field287; var31 != var30; var31 = var31.field287) {
            class292 var32 = (class292) var31;
            for (int var33 = 0; var33 < var29; var33++) {
                field2798[var33] = 0;
            }
            for (int var34 = 0; var34 < 32; var34++) {
                field2793[var34] = 0;
            }
            field2797 = 0;
            class18 var35 = var32.field5010.field2095;
            for (class18 var36 = var35.field287; var36 != var35; var36 = var36.field287) {
                class181 var37 = (class181) var36;
                if (!var37.field3140) {
                    int var38 = (var37.field3131 >> 12) - var11;
                    int var39 = (var37.field3129 >> 12) - var12;
                    int var40 = (var37.field3127 >> 12) - var13;
                    int var41 = arg4 * var40 - arg3 * var38 >> 16;
                    int var42 = (arg1 * var39 + arg2 * var41 >> 16) - var28;
                    if (var42 < 0) {
                        var42 = 0;
                    } else if (var42 >= var29) {
                        var42 = var29 - 1;
                    }
                    if (field2798[var42] < 32) {
                        field2801[var42][field2798[var42]++] = var37.field3137;
                    } else {
                        if (field2798[var42] == 32) {
                            if (field2797 == 32) {
                                if (field2788) {
                                    System.out.println("Overflowed model-based radix sort");
                                }
                                continue;
                            }
                            field2798[var42] += field2797++ + 1;
                        }
                        short[] var10000 = field2799[field2798[var42] - 32 - 1];
                        int var10002 = field2798[var42] - 32 - 1;
                        int var10004 = field2793[field2798[var42] - 32 - 1];
                        field2793[var10002] = field2793[field2798[var42] - 32 - 1] + 1;
                        var10000[var10004] = var37.field3137;
                    }
                }
            }
            boolean var43 = false;
            if (field2773 && var32.field4993.field4140 != -1) {
                class227.field3904.method1504(var32.field4993.field4140, 255);
                var43 = true;
            } else {
                class108.method736(-1);
            }
            var10.glPointSize((float) var32.field4993.field4146);
            this.method1115(var10, var29, var43, var32.field4993.field4147);
        }
        method1118();
    }

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "()V", line = 565)
    public static void method1121() {
        field2778 = null;
        field2774 = null;
        field2776 = null;
        field2792 = null;
        field2794 = null;
        field2801 = (short[][]) null;
        field2799 = (short[][]) null;
        field2798 = null;
        field2793 = null;
        field2796 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([Lcn;[Ldh;Z[I[I[I)V", line = 578)
    public final void method1122(class269[] arg0, class170[] arg1, boolean arg2, int[] arg3, int[] arg4, int[] arg5) {
        if (!this.field2783) {
            this.method1119(arg0, arg2, arg3, arg4, arg5);
            this.method1123(arg1, arg2, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([Ldh;Z[I[I[I)V", line = 587)
    private final void method1123(class170[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field2794[var6] = false;
        }
        label73: for (class182 var7 = (class182) this.field2795.method2078(-122); var7 != null; var7 = (class182) this.field2795.method2080(5)) {
            if (arg0 != null) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    if (arg0[var8] == var7.field3143) {
                        field2794[var8] = true;
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var7.method1747((byte) -72);
                this.field2811--;
                if (var7.method1981(127)) {
                    var7.method1986((byte) 86);
                    field2791--;
                }
            }
        }
        if (arg0 != null) {
            for (int var9 = 0; var9 < arg0.length && this.field2811 != 8; var9++) {
                if (!field2794[var9]) {
                    class182 var10 = null;
                    if (arg0[var9].field2965.field2342 == 1 && field2791 < 32) {
                        var10 = new class182(arg0[var9], this);
                        field2776.method464(var10, (long) arg0[var9].field2965.field2351, 112);
                        field2791++;
                    }
                    if (var10 == null) {
                        var10 = new class182(arg0[var9], this);
                    }
                    this.field2795.method2079(var10, 66);
                    this.field2811++;
                }
            }
        }
        for (class182 var11 = (class182) this.field2795.method2078(-114); var11 != null; var11 = (class182) this.field2795.method2080(5)) {
            var11.method1248((byte) 3, arg4[var11.field3143.field2969], arg3[var11.field3143.field2969], arg2[var11.field3143.field2969]);
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(J)Z", line = 684)
    private final boolean method1124(long arg0) {
        long var3;
        if (this.field2775 > this.field2777) {
            var3 = this.field2775;
        } else {
            var3 = this.field2777;
        }
        int var5 = (int) (this.field2789 - var3);
        if (var5 > 750) {
            this.method1114();
            return false;
        }
        if (this.field2777 > 0L) {
            this.field2816 = this.field2807 - (this.field2818 << 6) >> 7;
            this.field2814 = ((this.field2818 << 6) + this.field2807 >> 7) - 1;
            this.field2815 = this.field2809 - (this.field2810 << 6) >> 7;
            this.field2817 = ((this.field2810 << 6) + this.field2809 >> 7) - 1;
            this.field2805 = this.field2812;
            if (this.field2813 < 3) {
                this.field2804 = class132.field2328[this.field2813 + 1][this.field2816][this.field2815] + class132.field2328[this.field2813 + 1][this.field2814][this.field2815] + class132.field2328[this.field2813 + 1][this.field2816][this.field2817] + class132.field2328[this.field2813 + 1][this.field2814][this.field2817] >> 2;
            } else {
                this.field2804 = this.field2805 - 1024;
            }
            this.field2808 = true;
            int var6 = class227.field3896[this.field2803];
            int var7 = class227.field3911[this.field2803];
            this.method1113(var6, var7);
            if (this.field2806) {
                class292 var8 = (class292) this.field2784.method840(87);
                while (true) {
                    if (var8 == null) {
                        this.field2806 = false;
                        break;
                    }
                    for (int var9 = 0; var9 < var8.field4993.field4134; var9++) {
                        var8.method2025(var6, 1, true, this.field2789, var7, -714);
                    }
                    var8 = (class292) this.field2784.method839((byte) 75);
                }
            }
            int var10 = (int) (arg0 - this.field2789);
            for (class292 var11 = (class292) this.field2784.method840(-17); var11 != null; var11 = (class292) this.field2784.method839((byte) 99)) {
                var11.method2025(var6, var10, var5 < 10, arg0, var7, -714);
            }
        }
        this.field2789 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lek;)V", line = 757)
    public static final void method1125(class185 arg0) {
        field2779 = 0;
        field2790 = 0;
        field2778 = new class117();
        field2774 = new class181[1024];
        class15.method146(arg0, -97);
        class312.method2112(arg0, true);
    }

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "()V", line = 770)
    public final void method1126() {
        this.field2806 = true;
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)V", line = 774)
    public static final void method1127(int arg0) {
        field2800 = arg0;
    }

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "()V", line = 781)
    public static final void method1128() {
        field2776 = new class62(8);
        field2791 = 0;
        for (class164 var0 = (class164) field2778.method840(-122); var0 != null; var0 = (class164) field2778.method839((byte) 78)) {
            var0.method1114();
        }
    }
}
