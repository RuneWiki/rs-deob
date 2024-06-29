import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class4 extends class45 {

    @OriginalMember(owner = "client!ar", name = "C", descriptor = "Lal;")
    private class303 field40;

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "Lag;")
    private class469 field20;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "I")
    public int field24;

    @OriginalMember(owner = "client!ar", name = "t", descriptor = "F")
    public float field31;

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "I")
    public int field25;

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "I")
    public int field37;

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "[I")
    private int[] field21;

    @OriginalMember(owner = "client!ar", name = "E", descriptor = "I")
    public int field42;

    @OriginalMember(owner = "client!ar", name = "u", descriptor = "Lhd;")
    private class290 field32;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ar", name = "v", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!ar", name = "w", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ar", name = "x", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ar", name = "A", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ar", name = "D", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ar", name = "y", descriptor = "J")
    public static long field36;

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "Lfe;")
    private class199 field30;

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "Ljaclib/memory/Stream;")
    private Stream field26;

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field28;

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "[Z")
    public static boolean[] field29;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(BIII)V")
    public final void method20(byte arg0, int arg1, int arg2, int arg3) {
        this.field21[this.field40.field3524 * arg1 + arg3] = class665.method3789(this.field21[this.field40.field3524 * arg1 + arg3], 0x1 << arg2);
        if (arg0 > 67) {
            field39++;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZFIII)V")
    public final void method21(boolean arg0, float arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            this.method21(false, 1.5155832F, 90, -36, 45);
        }
        if (this.field37 != -1) {
            class105 var6 = this.field20.field7682.method2959(112, this.field37);
            int var7 = var6.field1244 & 0xFF;
            if (var7 != 0 && var6.field1255 != 4) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 <= 127) {
                    var8 = arg2 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((arg3 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg3 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field1263 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg3 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg3 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg3 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg3 = (var14 >> 8) + (var12 << 8 & 0xFF00B3) + (var13 & 0xFF00);
            }
        }
        field34++;
        if (arg1 != 1.0F) {
            int var15 = (arg3 & 0xFF1AAB) >> 16;
            int var16 = arg3 >> 8 & 0xFF;
            int var17 = arg3 & 0xFF;
            int var18 = (int) ((float) var15 * arg1);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg1);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg1);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var20 | var18 << 16 | var19 << 8;
        }
        this.field26.method3435(arg4 * 4);
        this.field26.method3437((byte) (arg3 >> 16));
        this.field26.method3437((byte) (arg3 >> 8));
        this.field26.method3437((byte) arg3);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIIIB)V")
    public static final void method22(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field27++;
        int var6 = 0;
        int var7 = 123 / ((-arg5 - 65) / 46);
        int var8 = arg3;
        int var9 = arg2 * arg2;
        int var10 = arg3 * arg3;
        int var11 = var10 << 1;
        int var12 = var9 << 1;
        int var13 = arg3 << 1;
        int var14 = (1 - var13) * var9 + var11;
        int var15 = var10 - ((var13 - 1) * var12);
        int var16 = var9 << 2;
        int var17 = var10 << 2;
        int var18 = ((var6 << 1) + 3) * var11;
        int var19 = ((arg3 << 1) - 3) * var12;
        int var20 = (var6 + 1) * var17;
        int var21 = (arg3 - 1) * var16;
        class285.method1691(arg2 + arg4, class315.field4224[arg0], -7, arg4 - arg2, arg1);
        while (var8 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var14 += var18;
                    var15 += var20;
                    var18 += var17;
                    var20 += var17;
                    var6++;
                }
            }
            if (var15 < 0) {
                var15 += var20;
                var14 += var18;
                var18 += var17;
                var6++;
                var20 += var17;
            }
            var14 += -var21;
            var15 += -var19;
            var8--;
            var21 -= var16;
            var19 -= var16;
            int var22 = arg0 - var8;
            int var23 = arg0 + var8;
            int var24 = arg4 + var6;
            int var25 = arg4 - var6;
            class285.method1691(var24, class315.field4224[var22], -7, var25, arg1);
            class285.method1691(var24, class315.field4224[var23], -7, var25, arg1);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)V")
    public final void method23(int arg0, int arg1) {
        field22++;
        if (arg0 >= -14) {
            this.field30 = null;
        }
        this.field26.method3435(arg1 * 4 + 3);
        this.field26.method3437(-1);
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(II)V")
    public final void method24(int arg0, int arg1) {
        field38++;
        this.field26.method3440();
        class511 var3 = this.field20.method2670(false, arg0 * 4, 4, this.field28, arg1 ^ 0xFFFFFF98);
        this.field30 = new class199(var3, 5121, 4, arg1);
        this.field28 = null;
        this.field26 = null;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IBIII)V")
    public static final void method25(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 33) {
            return;
        }
        if (class646.field8933 == 1) {
            class410.field5399[class328.field4411 / 100].method2990(class323.field4359 - 8, class242.field3184 + -8);
        }
        field33++;
        if (class646.field8933 == 2) {
            class410.field5399[class328.field4411 / 100 + 4].method2990(class323.field4359 - 8, class242.field3184 + -8);
        }
        class159.method992(3139);
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(II)V")
    public final void method26(int arg0, int arg1) {
        field35++;
        this.field28 = this.field20.field6398.method3428(arg1 * 4, true);
        this.field26 = new Stream(this.field28);
        if (arg0 != 127) {
            this.field20 = null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "([III)V")
    public final void method27(int[] arg0, int arg1, int arg2) {
        field41++;
        int var4 = 0;
        class210 var5 = this.field20.field6523;
        var5.field2219 = 0;
        if (arg1 <= 55) {
            this.field37 = 93;
        }
        if (this.field20.field6466) {
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg0[var12];
                short[] var14 = this.field40.field4004[var13];
                int var15 = this.field21[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var14.length) {
                        if ((0x1 << var16++ & var15) == 0) {
                            var17 += 3;
                        } else {
                            var5.method918(24551, var14[var17++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method918(24551, var14[var17++] & 0xFFFF);
                            var5.method918(24551, var14[var17++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg2; var6++) {
                int var7 = arg0[var6];
                int var8 = this.field21[var7];
                short[] var9 = this.field40.field4004[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var9.length) {
                        if ((var8 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var5.method913(var9[var11++] & 0xFFFF, true);
                            var4++;
                            var5.method913(var9[var11++] & 0xFFFF, true);
                            var4++;
                            var4++;
                            var5.method913(var9[var11++] & 0xFFFF, true);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field32.method1241(var5.field2219, (byte) -23, 5123, var5.field2199);
        this.field20.method2677(this.field40.field4038, this.field40.field4035, 17560, this.field30, this.field40.field4042);
        this.field20.method2647(this.field37, (this.field40.field4019 & 0x8) != 0, 3647, (this.field40.field4019 & 0x7) != 0);
        if (this.field20.field6482) {
            this.field20.method1064(Integer.MAX_VALUE, this.field25, this.field24, this.field42);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field31, 1.0F / this.field31, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field20.method2677(this.field40.field4038, this.field40.field4035, 17560, this.field30, this.field40.field4042);
        this.field20.method2674(0, 4, this.field32, 8704, var4);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
    public static void method28(int arg0) {
        if (arg0 <= 101) {
            method28(-113);
        }
        field29 = null;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lal;IIIII)V")
    public class4(class303 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field40 = arg0;
        this.field20 = this.field40.field4031;
        this.field24 = arg4;
        this.field31 = arg2;
        this.field25 = arg3;
        this.field37 = arg1;
        this.field21 = new int[this.field40.field3525 * this.field40.field3524];
        this.field42 = arg5;
        this.field32 = new class290(this.field20, 5123, null, 1);
    }
}
