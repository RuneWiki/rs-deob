import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vja")
public class class315 extends class337 {

    @OriginalMember(owner = "client!vja", name = "n", descriptor = "Llc;")
    private class455 field3907;

    @OriginalMember(owner = "client!vja", name = "G", descriptor = "I")
    public int field3926;

    @OriginalMember(owner = "client!vja", name = "z", descriptor = "I")
    public int field3919;

    @OriginalMember(owner = "client!vja", name = "t", descriptor = "I")
    public int field3913;

    @OriginalMember(owner = "client!vja", name = "y", descriptor = "Lck;")
    private class733 field3918;

    @OriginalMember(owner = "client!vja", name = "w", descriptor = "[I")
    private int[] field3916;

    @OriginalMember(owner = "client!vja", name = "B", descriptor = "I")
    public int field3921;

    @OriginalMember(owner = "client!vja", name = "m", descriptor = "F")
    public float field3906;

    @OriginalMember(owner = "client!vja", name = "E", descriptor = "Lww;")
    private class304 field3924;

    @OriginalMember(owner = "client!vja", name = "o", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!vja", name = "p", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!vja", name = "q", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!vja", name = "r", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!vja", name = "s", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!vja", name = "u", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!vja", name = "A", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!vja", name = "C", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!vja", name = "D", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!vja", name = "F", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!vja", name = "v", descriptor = "Ldea;")
    private class375 field3915;

    @OriginalMember(owner = "client!vja", name = "l", descriptor = "Ljaclib/memory/Stream;")
    private Stream field3905;

    @OriginalMember(owner = "client!vja", name = "x", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field3917;

    @OriginalMember(owner = "client!vja", name = "b", descriptor = "(II)V", line = 10)
    public final void method1837(int arg0, int arg1) {
        this.field3917 = this.field3918.field9806.method2532(arg0 * 4, true);
        if (arg1 != -65536) {
            this.method1843(107, 54, -1.0917114F, 51, -70);
        }
        field3910++;
        this.field3905 = new Stream(this.field3917);
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(IZI)I", line = 27)
    public static final int method1838(int arg0, boolean arg1, int arg2) {
        field3914++;
        if (arg1) {
            return 0;
        }
        class148 var3 = class398.method2306(arg2, arg1, (byte) 41);
        if (var3 == null) {
            return class515.field6571.method2823(arg2, arg0 - 250).field8246;
        }
        int var4 = 0;
        if (arg0 != 255) {
            return 89;
        }
        for (int var5 = 0; var5 < var3.field1892.length; var5++) {
            if (var3.field1892[var5] == -1) {
                var4++;
            }
        }
        return var4 + class515.field6571.method2823(arg2, arg0 ^ 0xFA).field8246 - var3.field1892.length;
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(IBLha;)V", line = 63)
    public static final void method1839(int arg0, byte arg1, class570 arg2) {
        field3923++;
        if (!class750.field10229 || !class141.field1854) {
            class216.field2943 = 0;
            return;
        }
        if (class454.field5921) {
            class474.field6173 = class506.field6473.method1568(125);
        }
        class6.field64 = 0;
        class700.field9276 = 0;
        class34.field386 = 0;
        int[] var3 = arg2.method916();
        class364.field4458 = (int) ((float) var3[3] / 3.0F);
        class350.field4278 = (int) ((float) var3[2] / 3.0F);
        arg2.method942(class408.field5423);
        if (((int) ((float) class408.field5423[0] / 3.0F)) != class566.field7172 || (int) ((float) class408.field5423[1] / 3.0F) != class317.field3953) {
            class566.field7172 = (int) ((float) class408.field5423[0] / 3.0F);
            class317.field3953 = (int) ((float) class408.field5423[1] / 3.0F);
            class365.field4462 = class566.field7172 >> 1;
            class377.field4621 = class317.field3953 >> 1;
            class380.field4659 = new int[class566.field7172 * class317.field3953];
        }
        if (arg1 > -14) {
            return;
        }
        class435.field5711 = arg2.method880();
        class216.field2943 = 0;
        for (int var4 = 0; var4 < class269.field3552; var4++) {
            class347.method2011(0, arg0, arg2, class505.field6464[var4]);
        }
        for (int var5 = 0; var5 < class779.field10635; var5++) {
            class347.method2011(0, arg0, arg2, class75.field1067[var5]);
        }
        for (int var6 = 0; var6 < class164.field2177; var6++) {
            class347.method2011(0, arg0, arg2, class763.field10388[var6]);
        }
        class430.field5647 = 0;
        if (class216.field2943 > 0) {
            int var7 = class380.field4659.length;
            int var8 = var7 - var7 & 0x7;
            int var9 = 0;
            while (var9 < var8) {
                class380.field4659[var9++] = Integer.MAX_VALUE;
                class380.field4659[var9++] = Integer.MAX_VALUE;
                class380.field4659[var9++] = Integer.MAX_VALUE;
                class380.field4659[var9++] = Integer.MAX_VALUE;
                class380.field4659[var9++] = Integer.MAX_VALUE;
                class380.field4659[var9++] = Integer.MAX_VALUE;
                class380.field4659[var9++] = Integer.MAX_VALUE;
                class380.field4659[var9++] = Integer.MAX_VALUE;
            }
            while (var7 > var9) {
                class380.field4659[var9++] = Integer.MAX_VALUE;
            }
            class191.field2669 = 1;
            for (int var10 = 0; var10 < class216.field2943; var10++) {
                class318 var11 = class656.field8454[var10];
                class115.method668(var11.field3971[1], var11.field3967[1], var11.field3973[1], 106, var11.field3971[0], var11.field3973[3], var11.field3967[3], var11.field3973[0], var11.field3971[3], var11.field3967[0]);
                class115.method668(var11.field3971[2], var11.field3967[2], var11.field3973[2], -121, var11.field3971[1], var11.field3973[3], var11.field3967[3], var11.field3973[1], var11.field3971[3], var11.field3967[1]);
            }
            class191.field2669 = 2;
        }
        if (class454.field5921) {
            class469.field6107 = class506.field6473.method1568(123) - class474.field6173;
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(I)V", line = 172)
    public static final void method1840(int arg0) {
        class299.field3785.method2932((byte) 80);
        if (arg0 > 37) {
            field3909++;
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(IB)V", line = 184)
    public final void method1841(int arg0, byte arg1) {
        field3908++;
        this.field3905.method2523(arg0 * 4 + 3);
        this.field3905.method2527(-1);
        if (arg1 < 122) {
            this.field3921 = -114;
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(IIII)V", line = 198)
    public final void method1842(int arg0, int arg1, int arg2, int arg3) {
        this.field3916[this.field3907.field4366 * arg3 + arg1] = class77.method473(this.field3916[this.field3907.field4366 * arg3 + arg1], 0x1 << arg0);
        field3920++;
        if (arg2 < 105) {
            this.field3915 = null;
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(IIFII)V", line = 212)
    public final void method1843(int arg0, int arg1, float arg2, int arg3, int arg4) {
        field3911++;
        if (this.field3921 != -1) {
            class191 var6 = this.field3918.field7199.method1732((byte) 122, this.field3921);
            int var7 = var6.field2672 & 0xFF;
            if (var7 != 0 && var6.field2678 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg1 * 131586;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((arg4 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg4 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field2661 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg4 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg4 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg4 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg4 = (var13 & 0xFF00) + ((var12 & 0xA00FF00) << 8) + (var14 >> 8);
            }
        }
        this.field3905.method2523(arg0 * 4);
        if (arg2 != 1.0F) {
            int var15 = arg4 >> 16 & 0xFF;
            int var16 = (arg4 & 0xFFB9) >> 8;
            int var17 = arg4 & 0xFF;
            int var18 = (int) ((float) var15 * arg2);
            int var19 = (int) ((float) var16 * arg2);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg2);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg4 = var20 | var18 << 16 | var19 << 8;
        }
        this.field3905.method2527((byte) (arg4 >> 16));
        this.field3905.method2527((byte) (arg4 >> 8));
        if (arg3 != 1442011688) {
            this.field3926 = -28;
        }
        this.field3905.method2527((byte) arg4);
    }

    @OriginalMember(owner = "client!vja", name = "c", descriptor = "(II)V", line = 321)
    public final void method1844(int arg0, int arg1) {
        field3912++;
        this.field3905.method2519();
        class447 var3 = this.field3918.method3970(4, arg0 * 4, this.field3917, false, (byte) -106);
        this.field3915 = new class375(var3, 5121, 4, 0);
        if (arg1 != 545) {
            method1838(-92, true, -116);
        }
        this.field3917 = null;
        this.field3905 = null;
    }

    @OriginalMember(owner = "client!vja", name = "d", descriptor = "(II)Z", line = 337)
    public static final boolean method1845(int arg0, int arg1) {
        field3922++;
        if (arg1 != 255) {
            method1838(53, false, -5);
        }
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(I[II)V", line = 349)
    public final void method1846(int arg0, int[] arg1, int arg2) {
        field3925++;
        int var4 = 0;
        class333 var5 = this.field3918.field9928;
        var5.field3133 = arg0;
        if (this.field3918.field9865) {
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg1[var12];
                short[] var14 = this.field3907.field5928[var13];
                int var15 = this.field3916[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var14.length > var17) {
                        if ((0x1 << var16++ & var15) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method1541(374, var14[var17++] & 0xFFFF);
                            var5.method1541(arg0 ^ 0x176, var14[var17++] & 0xFFFF);
                            var4++;
                            var5.method1541(374, var14[var17++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg2; var6++) {
                int var7 = arg1[var6];
                short[] var8 = this.field3907.field5928[var7];
                int var9 = this.field3916[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var8.length > var11) {
                        if ((var9 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method1514(var8[var11++] & 0xFFFF, (byte) -59);
                            var4++;
                            var5.method1514(var8[var11++] & 0xFFFF, (byte) -59);
                            var5.method1514(var8[var11++] & 0xFFFF, (byte) -59);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field3924.method1630(5123, var5.field3133, true, var5.field3193);
        this.field3918.method3947(this.field3907.field5956, this.field3907.field5967, this.field3915, this.field3907.field5963, 32886);
        this.field3918.method3957(-83, this.field3921, (this.field3907.field5930 & 0x7) != 0, (this.field3907.field5930 & 0x8) != 0);
        if (this.field3918.field9939) {
            this.field3918.method971(Integer.MAX_VALUE, this.field3913, this.field3919, this.field3926);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field3906, 1.0F / this.field3906, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field3918.method3947(this.field3907.field5956, this.field3907.field5967, this.field3915, this.field3907.field5963, 32886);
        this.field3918.method3980(this.field3924, var4, true, 4, 0);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!vja", name = "<init>", descriptor = "(Llc;IIIII)V", line = 470)
    public class315(class455 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3907 = arg0;
        this.field3926 = arg5;
        this.field3919 = arg4;
        this.field3913 = arg3;
        this.field3918 = this.field3907.field5953;
        this.field3916 = new int[this.field3907.field4371 * this.field3907.field4366];
        this.field3921 = arg1;
        this.field3906 = arg2;
        this.field3924 = new class304(this.field3918, 5123, null, 1);
    }
}
