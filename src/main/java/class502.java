import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class502 extends class223 {

    @OriginalMember(owner = "client!dw", name = "o", descriptor = "Loq;")
    private class240 field7438;

    @OriginalMember(owner = "client!dw", name = "p", descriptor = "I")
    public int field7439;

    @OriginalMember(owner = "client!dw", name = "D", descriptor = "I")
    public int field7453;

    @OriginalMember(owner = "client!dw", name = "C", descriptor = "F")
    public float field7452;

    @OriginalMember(owner = "client!dw", name = "y", descriptor = "Lfd;")
    private class365 field7448;

    @OriginalMember(owner = "client!dw", name = "q", descriptor = "I")
    public int field7440;

    @OriginalMember(owner = "client!dw", name = "x", descriptor = "I")
    public int field7447;

    @OriginalMember(owner = "client!dw", name = "A", descriptor = "[I")
    private int[] field7450;

    @OriginalMember(owner = "client!dw", name = "I", descriptor = "Leo;")
    private class194 field7458;

    @OriginalMember(owner = "client!dw", name = "r", descriptor = "I")
    public static int field7441 = -1;

    @OriginalMember(owner = "client!dw", name = "t", descriptor = "Lsl;")
    public static class318 field7443 = new class318(9, -1);

    @OriginalMember(owner = "client!dw", name = "H", descriptor = "Lgk;")
    public static class331 field7457 = new class331("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!dw", name = "m", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!dw", name = "n", descriptor = "I")
    public static int field7437;

    @OriginalMember(owner = "client!dw", name = "v", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!dw", name = "w", descriptor = "I")
    public static int field7446;

    @OriginalMember(owner = "client!dw", name = "B", descriptor = "I")
    public static int field7451;

    @OriginalMember(owner = "client!dw", name = "E", descriptor = "I")
    public static int field7454;

    @OriginalMember(owner = "client!dw", name = "F", descriptor = "I")
    public static int field7455;

    @OriginalMember(owner = "client!dw", name = "G", descriptor = "Luu;")
    public static class188 field7456;

    @OriginalMember(owner = "client!dw", name = "z", descriptor = "Lsb;")
    public static class191 field7449;

    @OriginalMember(owner = "client!dw", name = "u", descriptor = "Lpc;")
    private class473 field7444;

    @OriginalMember(owner = "client!dw", name = "l", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field7435;

    @OriginalMember(owner = "client!dw", name = "s", descriptor = "Ljaggl/memory/NativeStream;")
    private NativeStream field7442;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IBI)I", line = 4)
    public static final int method3002(int arg0, byte arg1, int arg2) {
        field7454++;
        if (arg1 != 81) {
            field7449 = null;
        }
        int var3 = arg0 - 1 & arg2 >> 31;
        return (arg2 + (arg2 >>> 31)) % arg0 + var3;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)V", line = 24)
    public final void method3003(int arg0, int arg1) {
        field7445++;
        this.field7442.method2675();
        class30 var3 = this.field7448.method2185(false, 125, this.field7435, arg0 * 4, 4);
        this.field7444 = new class473(var3, 5121, 4, 0);
        this.field7442 = null;
        int var4 = -34 / ((52 - arg1) / 39);
        this.field7435 = null;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "([III)V", line = 40)
    public final void method3004(int[] arg0, int arg1, int arg2) {
        field7436++;
        int var4 = 0;
        class65 var5 = class132.field1913;
        if (arg2 > -20) {
            this.field7440 = -97;
        }
        var5.field827 = 0;
        if (this.field7448.field5443) {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg0[var6];
                short[] var8 = this.field7438.field3547[var7];
                int var9 = this.field7450[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var8.length) {
                        if ((var9 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method611((byte) 67, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method611((byte) 67, var8[var11++] & 0xFFFF);
                            var5.method611((byte) 67, var8[var11++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg0[var12];
                int var14 = this.field7450[var13];
                short[] var15 = this.field7438.field3547[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var15.length > var17) {
                        if ((0x1 << var16++ & var14) == 0) {
                            var17 += 3;
                        } else {
                            var5.method628((byte) -71, var15[var17++] & 0xFFFF);
                            var4++;
                            var5.method628((byte) -94, var15[var17++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method628((byte) -104, var15[var17++] & 0xFFFF);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field7458.method1361(var5.field783, true, 5123, var5.field827);
        this.field7448.method2217(this.field7444, 121, this.field7438.field3559, this.field7438.field3550, this.field7438.field3553);
        this.field7448.method2209((this.field7438.field3546 & 0x7) != 0, (byte) 12, this.field7453, (this.field7438.field3546 & 0x8) != 0);
        if (this.field7448.field5331) {
            this.field7448.method352(Integer.MAX_VALUE, this.field7440, this.field7439, this.field7447);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field7452, 1.0F / this.field7452, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field7448.method2217(this.field7444, 123, this.field7438.field3559, this.field7438.field3550, this.field7438.field3553);
        this.field7448.method2250(0, var4, 4, this.field7458, (byte) -95);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V", line = 163)
    public static void method3005(int arg0) {
        field7457 = null;
        field7456 = null;
        field7443 = null;
        if (arg0 != -128) {
            field7441 = 54;
        }
        field7449 = null;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIZ)V", line = 178)
    public final void method3006(int arg0, int arg1, int arg2, boolean arg3) {
        this.field7450[this.field7438.field2007 * arg0 + arg2] = class244.method1606(this.field7450[this.field7438.field2007 * arg0 + arg2], 0x1 << arg1);
        if (arg3) {
            this.method3006(79, -68, 48, true);
        }
        field7451++;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIBIF)V", line = 207)
    public final void method3007(int arg0, int arg1, byte arg2, int arg3, float arg4) {
        field7446++;
        if (this.field7453 != -1) {
            class104 var6 = this.field7448.field425.method1780(-31305, this.field7453);
            int var7 = var6.field1444 & 0xFF;
            if (var7 != 0 && var6.field1443 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 <= 127) {
                    var8 = arg0 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((arg3 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg3 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field1438 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg3 >> 16 & 0xFF) * var11;
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
                arg3 = (var14 >> 8) + ((var12 & 0xFF00) << 8) + (var13 & 0xFF00);
            }
        }
        if (arg2 < 49) {
            field7457 = null;
        }
        this.field7442.method2678(arg1 * 4);
        if (arg4 != 1.0F) {
            int var15 = (arg3 & 0xFFA1FB) >> 16;
            int var16 = arg3 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg4);
            int var18 = arg3 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg4);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var18 * arg4);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var20 | var17 << 16 | var19 << 8;
        }
        this.field7442.method2680((byte) (arg3 >> 16));
        this.field7442.method2680((byte) (arg3 >> 8));
        this.field7442.method2680((byte) arg3);
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(II)V", line = 322)
    public final void method3008(int arg0, int arg1) {
        this.field7435 = this.field7448.field5305.method2681(arg1 * 4);
        field7437++;
        this.field7442 = new NativeStream(this.field7435);
        if (arg0 >= -100) {
            this.method3009(95, true);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IZ)V", line = 334)
    public final void method3009(int arg0, boolean arg1) {
        this.field7442.method2678(arg0 * 4 + 3);
        field7455++;
        this.field7442.method2680(-1);
        if (arg1) {
            this.method3006(-35, -17, 22, true);
        }
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Loq;IIIII)V", line = 346)
    public class502(class240 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7438 = arg0;
        this.field7439 = arg4;
        this.field7453 = arg1;
        this.field7452 = arg2;
        this.field7448 = this.field7438.field3530;
        this.field7440 = arg3;
        this.field7447 = arg5;
        this.field7450 = new int[this.field7438.field2007 * this.field7438.field2003];
        this.field7458 = new class194(this.field7448, 5123, null, 1);
    }
}
