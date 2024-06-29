import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class505 extends class270 {

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
    public int field7274 = 0;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "Low;")
    private class314 field7273;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "F")
    public float field7275;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "[I")
    private int[] field7277;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public int field7261;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "I")
    public int field7280;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "Lfo;")
    private class473 field7263;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
    public int field7266;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public int field7262;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
    public static int field7264 = 0;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "Lkfa;")
    public static class549 field7271 = new class549(49, 8);

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
    public static int field7276;

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
    public static int field7279;

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "I")
    public static int field7282;

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "I")
    public static int field7283;

    @OriginalMember(owner = "client!ii", name = "J", descriptor = "Ltfa;")
    private class31 field7284;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "Ljaclib/memory/Stream;")
    private Stream field7281;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field7265;

    @OriginalMember(owner = "client!ii", name = "K", descriptor = "[I")
    public static int[] field7285;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "[S")
    public static short[] field7270;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)V", line = 3)
    public final void method2902(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -1457990960) {
            this.field7263 = null;
        }
        this.field7277[this.field7273.field1558 * arg0 + arg3] = class139.method776(this.field7277[this.field7273.field1558 * arg0 + arg3], 0x1 << arg2);
        field7283++;
        this.field7274++;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)Lep;", line = 18)
    public static final class382 method2903(int arg0, int arg1) {
        field7279++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & arg1;
        if (class271.field3434[var2] == null || class271.field3434[var2][var3] == null) {
            boolean var4 = class315.method1784(var2, arg1 - 61266);
            if (!var4) {
                return null;
            }
        }
        return class271.field3434[var2][var3];
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)V", line = 42)
    public final void method2904(byte arg0, int arg1) {
        this.field7265 = this.field7263.method2684((byte) -96, arg1 * 4, true);
        field7278++;
        if (arg0 <= -77) {
            this.field7281 = new Stream(this.field7265, 0, arg1 * 4);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZ)V", line = 59)
    public final void method2905(int arg0, boolean arg1) {
        if (arg1) {
            this.method2904((byte) 77, -47);
        }
        field7276++;
        this.field7281.method3432(arg0 * 4 + 3);
        this.field7281.method3445(-1);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB[I)V", line = 72)
    public final void method2906(int arg0, byte arg1, int[] arg2) {
        field7272++;
        class180 var4 = this.field7263.method2698(-109, this.field7274 * 3);
        Buffer var5 = var4.method167(18829, true);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field7263.method2714(var5, (byte) -122);
        int var7 = 0;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method3440()) {
            label97: for (int var18 = 0; var18 < arg0; var18++) {
                int var21 = arg2[var18];
                int var22 = this.field7277[var21];
                short[] var23 = this.field7273.field4076[var21];
                if (var22 != 0 && var23 != null) {
                    int var24 = 0;
                    int var25 = 0;
                    while (true) {
                        while (true) {
                            if (var25 >= var23.length) {
                                continue label97;
                            }
                            if ((var22 & 0x1 << var24++) == 0) {
                                var25 += 3;
                            } else {
                                var7++;
                                for (int var26 = 0; var26 < 3; var26++) {
                                    int var27 = var23[var25++] & 0xFFFF;
                                    var6.method3435(var27);
                                    if (var27 < var8) {
                                        var8 = var27;
                                    }
                                    if (var9 < var27) {
                                        var9 = var27;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            label123: for (int var10 = 0; var10 < arg0; var10++) {
                int var11 = arg2[var10];
                short[] var12 = this.field7273.field4076[var11];
                int var13 = this.field7277[var11];
                if (var13 != 0 && var12 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var12.length <= var15) {
                                continue label123;
                            }
                            if ((0x1 << var14++ & var13) == 0) {
                                var15 += 3;
                            } else {
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var12[var15++] & 0xFFFF;
                                    if (var17 < var8) {
                                        var8 = var17;
                                    }
                                    var6.method3439(var17);
                                    if (var17 > var9) {
                                        var9 = var17;
                                    }
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        }
        var6.method3434();
        int var19 = 33 % ((-arg1 - 62) / 55);
        if (!var4.method170(9406) || var7 <= 0) {
            return;
        }
        this.field7263.method2733(this.field7280, 94, (this.field7273.field4064 & 0x7) != 0, (this.field7273.field4064 & 0x8) != 0);
        if (this.field7263.field6806) {
            this.field7263.method299(Integer.MAX_VALUE, this.field7266, this.field7262, this.field7261);
        }
        class667 var20 = this.field7263.method2730(115);
        var20.method3759(1.0F / this.field7275, 1.0F / this.field7275, (byte) 43, 1.0F);
        this.field7263.method2689(false, class170.field2044);
        this.field7263.method1198(1, (byte) 109, this.field7284);
        this.field7263.method1174(0, this.field7273.field4082);
        this.field7263.method1154(0, var8, (byte) 73, class565.field8009, var4, var7, var9 - (var8 - 1));
        this.field7263.method2699((byte) -51);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B[B)Lxa;", line = 227)
    public static final class458 method2907(byte arg0, byte[] arg1) {
        if (arg0 >= -116) {
            field7271 = null;
        }
        field7282++;
        try {
            Image var2 = Toolkit.getDefaultToolkit().createImage(arg1);
            MediaTracker var3 = new MediaTracker(class239.field3025);
            var3.addImage(var2, 0);
            var3.waitForAll();
            int var4 = var2.getWidth(class239.field3025);
            int var5 = var2.getHeight(class239.field3025);
            int[] var6 = new int[var4 * var5];
            PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
            var7.grabPixels();
            return class453.field6284.method326(var6, 0, var4, var4, var5);
        } catch (InterruptedException var8) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIFB)V", line = 263)
    public final void method2908(int arg0, int arg1, int arg2, float arg3, byte arg4) {
        if (this.field7280 != -1) {
            class414 var6 = this.field7263.field8990.method846((byte) -111, this.field7280);
            int var7 = var6.field5484 & 0xFF;
            if (var7 != 0 && var6.field5486 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 <= 127) {
                    var8 = arg1 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg2 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg2 = ((var8 & 0xFF00FF) * var7 + ((arg2 & 0xFF00FF) * var10) & 0xFF00FF00) + ((arg2 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field5482 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg2 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg2 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg2 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg2 = (var13 & 0xFF00) + (var14 >> 8) + (var12 << 8 & 0xFF006B);
            }
        }
        if (arg4 >= -42) {
            this.field7275 = 1.170195F;
        }
        field7268++;
        if (arg3 != 1.0F) {
            int var15 = arg2 >> 16 & 0xFF;
            int var16 = (arg2 & 0xFF93) >> 8;
            int var17 = (int) ((float) var15 * arg3);
            int var18 = arg2 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg3);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var18 * arg3);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg2 = var20 | var19 << 8 | var17 << 16;
        }
        this.field7281.method3432(arg0 * 4);
        if (this.field7263.field6825 == 0) {
            this.field7281.method3445((byte) arg2);
            this.field7281.method3445((byte) (arg2 >> 8));
            this.field7281.method3445((byte) (arg2 >> 16));
        } else {
            this.field7281.method3445((byte) (arg2 >> 16));
            this.field7281.method3445((byte) (arg2 >> 8));
            this.field7281.method3445((byte) arg2);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lok;B)V", line = 384)
    public static final void method2909(class231 arg0, byte arg1) {
        arg0.field2949 = null;
        field7267++;
        int var2 = arg0.field2947.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field2947[var3].field1462 = false;
        }
        class21[] var4 = class169.field2023;
        synchronized (class169.field2023) {
            if (arg1 != 123) {
                method2907((byte) -99, null);
            }
            if (var2 < class169.field2023.length && class144.field1620[var2] < 200) {
                class169.field2023[var2].method87(81, arg0);
                int var10002 = class144.field1620[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZI)V", line = 415)
    public final void method2910(boolean arg0, int arg1) {
        field7269++;
        this.field7281.method3434();
        this.field7284 = this.field7263.method1203(false, arg0);
        this.field7284.method168(this.field7265, 4, (byte) -105, arg1 * 4);
        this.field7265 = null;
        this.field7281 = null;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Low;IIIII)V", line = 453)
    public class505(class314 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7273 = arg0;
        this.field7275 = arg2;
        this.field7277 = new int[this.field7273.field1562 * this.field7273.field1558];
        this.field7261 = arg5;
        this.field7280 = arg1;
        this.field7263 = this.field7273.field4075;
        this.field7266 = arg3;
        this.field7262 = arg4;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 438)
    public static void method2911(int arg0) {
        field7285 = null;
        if (arg0 > -101) {
            method2907((byte) 99, null);
        }
        field7270 = null;
        field7271 = null;
    }
}
