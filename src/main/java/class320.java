import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class320 extends class381 {

    @OriginalMember(owner = "client!eca", name = "s", descriptor = "Lvfa;")
    private class436 field4661;

    @OriginalMember(owner = "client!eca", name = "w", descriptor = "I")
    public int field4665;

    @OriginalMember(owner = "client!eca", name = "h", descriptor = "I")
    public int field4650;

    @OriginalMember(owner = "client!eca", name = "x", descriptor = "F")
    public float field4666;

    @OriginalMember(owner = "client!eca", name = "z", descriptor = "[I")
    private int[] field4668;

    @OriginalMember(owner = "client!eca", name = "k", descriptor = "I")
    public int field4653;

    @OriginalMember(owner = "client!eca", name = "p", descriptor = "I")
    public int field4658;

    @OriginalMember(owner = "client!eca", name = "m", descriptor = "Luca;")
    private class287 field4655;

    @OriginalMember(owner = "client!eca", name = "u", descriptor = "Loj;")
    private class588 field4663;

    @OriginalMember(owner = "client!eca", name = "i", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!eca", name = "j", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!eca", name = "n", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!eca", name = "q", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!eca", name = "r", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!eca", name = "t", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!eca", name = "v", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!eca", name = "A", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!eca", name = "o", descriptor = "Lgv;")
    private class39 field4657;

    @OriginalMember(owner = "client!eca", name = "y", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4667;

    @OriginalMember(owner = "client!eca", name = "l", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field4654;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(II[I)V")
    public final void method1980(int arg0, int arg1, int[] arg2) {
        int var4 = 91 / ((arg0 - 1) / 52);
        field4656++;
        int var5 = 0;
        class449 var6 = this.field4655.field4073;
        var6.field7956 = 0;
        if (this.field4655.field4060) {
            for (int var13 = 0; var13 < arg1; var13++) {
                int var14 = arg2[var13];
                short[] var15 = this.field4661.field6341[var14];
                int var16 = this.field4668[var14];
                if (var16 != 0 && var15 != null) {
                    int var17 = 0;
                    int var18 = 0;
                    while (var18 < var15.length) {
                        if ((var16 & 0x1 << var17++) == 0) {
                            var18 += 3;
                        } else {
                            var6.method3162(-2003712696, var15[var18++] & 0xFFFF);
                            var5++;
                            var6.method3162(-2003712696, var15[var18++] & 0xFFFF);
                            var5++;
                            var6.method3162(-2003712696, var15[var18++] & 0xFFFF);
                            var5++;
                        }
                    }
                }
            }
        } else {
            for (int var7 = 0; var7 < arg1; var7++) {
                int var8 = arg2[var7];
                short[] var9 = this.field4661.field6341[var8];
                int var10 = this.field4668[var8];
                if (var10 != 0 && var9 != null) {
                    int var11 = 0;
                    int var12 = 0;
                    while (var12 < var9.length) {
                        if ((var10 & 0x1 << var11++) == 0) {
                            var12 += 3;
                        } else {
                            var6.method3120(var9[var12++] & 0xFFFF, -23026);
                            var5++;
                            var6.method3120(var9[var12++] & 0xFFFF, -23026);
                            var5++;
                            var5++;
                            var6.method3120(var9[var12++] & 0xFFFF, -23026);
                        }
                    }
                }
            }
        }
        if (var5 <= 0) {
            return;
        }
        this.field4663.method1791(var6.field7956, var6.field7952, 5123, 23);
        this.field4655.method1714(this.field4661.field6364, -1, this.field4661.field6367, this.field4657, this.field4661.field6366);
        this.field4655.method1722((this.field4661.field6342 & 0x7) != 0, (this.field4661.field6342 & 0x8) != 0, this.field4658, -10708);
        if (this.field4655.field4071) {
            this.field4655.method657(Integer.MAX_VALUE, this.field4665, this.field4653, this.field4650);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field4666, 1.0F / this.field4666, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field4655.method1714(this.field4661.field6364, -1, this.field4661.field6367, this.field4657, this.field4661.field6366);
        this.field4655.method1702(4, 0, var5, 28498, this.field4663);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IFIII)V")
    public final void method1981(int arg0, float arg1, int arg2, int arg3, int arg4) {
        field4652++;
        if (this.field4658 != -1) {
            class457 var6 = this.field4655.field1491.method955(-1330, this.field4658);
            int var7 = var6.field6603 & 0xFF;
            if (var7 != 0 && var6.field6600 != 4) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg2 * 131586;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((var8 & 0xFF00) * var7 + ((arg3 & 0xFF00) * var10) & 0xFF0000) + ((arg3 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field6611 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg3 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg3 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg3 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg3 = (var14 >> 8) + ((var12 & 0xB300FF00) << 8) + (var13 & 0xFF00);
            }
        }
        if (arg0 >= -73) {
            this.method1980(-108, -7, null);
        }
        if (arg1 != 1.0F) {
            int var15 = (arg3 & 0xFF11C8) >> 16;
            int var16 = (arg3 & 0xFF48) >> 8;
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
            arg3 = var19 << 8 | var18 << 16 | var20;
        }
        this.field4667.method2078(arg4 * 4);
        this.field4667.method2082((byte) (arg3 >> 16));
        this.field4667.method2082((byte) (arg3 >> 8));
        this.field4667.method2082((byte) arg3);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IZ)V")
    public final void method1982(int arg0, boolean arg1) {
        this.field4667.method2084();
        field4664++;
        class558 var3 = this.field4655.method1707(arg1, arg0 * 4, 4, 5126, this.field4654);
        this.field4657 = new class39(var3, 5121, 4, 0);
        this.field4667 = null;
        this.field4654 = null;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZLjava/lang/String;[BI)I")
    public static final int method1983(boolean arg0, String arg1, byte[] arg2, int arg3) {
        field4651++;
        int var4 = arg1.length();
        int var5 = arg3;
        if (arg0) {
            method1985(false, true, null, 65, null, -22, 62);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 <= '\u007F') {
                arg2[var5++] = (byte) var7;
            } else if (var7 > '߿') {
                arg2[var5++] = (byte) class151.method1076(var7 >> 12, 224);
                arg2[var5++] = (byte) class151.method1076(class425.method2563(63, var7 >> 6), 128);
                arg2[var5++] = (byte) class151.method1076(class425.method2563(var7, 63), 128);
            } else {
                arg2[var5++] = (byte) (class151.method1076(var7, 12313) >> 6);
                arg2[var5++] = (byte) class151.method1076(128, class425.method2563(var7, 63));
            }
        }
        return var5 - arg3;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIBI)V")
    public final void method1984(int arg0, int arg1, byte arg2, int arg3) {
        field4669++;
        if (arg2 != 127) {
            this.field4661 = null;
        }
        this.field4668[this.field4661.field9628 * arg1 + arg3] = class151.method1076(this.field4668[this.field4661.field9628 * arg1 + arg3], 0x1 << arg0);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZZLjava/lang/String;ILjava/lang/String;II)V")
    public static final void method1985(boolean arg0, boolean arg1, String arg2, int arg3, String arg4, int arg5, int arg6) {
        class394.field5968.field4344 = 1;
        field4660++;
        String var7 = arg2.toLowerCase();
        short[] var8 = new short[16];
        int var9 = arg5;
        String var10 = null;
        if (arg3 != -1) {
            class278 var11 = class141.field2041.method1503(true, arg3);
            if (var11 == null || arg1 != var11.method1651((byte) 76)) {
                return;
            }
            if (var11.method1651((byte) 76)) {
                var10 = var11.field3617;
            } else {
                var9 = var11.field3615;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class259.field3355.field5795; var13++) {
            class390 var16 = class259.field3355.method2382(var13, (byte) 28);
            if ((!arg0 || var16.field5871) && var16.field5886 == -1 && var16.field5906 == -1 && var16.field5851 == 0 && var16.field5869.toLowerCase().indexOf(var7) != -1) {
                if (arg3 != -1) {
                    if (arg1) {
                        if (!arg4.equals(var16.method2419(true, arg3, var10))) {
                            continue;
                        }
                    } else if (arg6 != var16.method2410(var9, -15881, arg3)) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class547.field8067 = -1;
                    class274.field3591 = null;
                    return;
                }
                if (var12 >= var8.length) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; var18 < var12; var18++) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        class547.field8067 = var12;
        class274.field3591 = var8;
        class245.field3239 = 0;
        String[] var14 = new String[class547.field8067];
        for (int var15 = 0; var15 < class547.field8067; var15++) {
            var14[var15] = class259.field3355.method2382(var8[var15], (byte) 28).field5869;
        }
        class304.method1914((byte) -46, var14, class274.field3591);
        class394.field5968.method1829(0);
        class394.field5968.field4344 = 2;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(BI)V")
    public final void method1986(byte arg0, int arg1) {
        this.field4667.method2078(arg1 * 4 + 3);
        if (arg0 != -98) {
            this.method1987(79, 76);
        }
        field4662++;
        this.field4667.method2082(-1);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(II)V")
    public final void method1987(int arg0, int arg1) {
        int var3 = -51 % ((-arg1 - 83) / 34);
        field4659++;
        this.field4654 = this.field4655.field4018.method2073(arg0 * 4, true);
        this.field4667 = new Stream(this.field4654);
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lvfa;IIIII)V")
    public class320(class436 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4661 = arg0;
        this.field4665 = arg3;
        this.field4650 = arg5;
        this.field4666 = arg2;
        this.field4668 = new int[this.field4661.field9630 * this.field4661.field9628];
        this.field4653 = arg4;
        this.field4658 = arg1;
        this.field4655 = this.field4661.field6323;
        this.field4663 = new class588(this.field4655, 5123, null, 1);
    }
}
