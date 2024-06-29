import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class652 extends class401 {

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "Lhca;")
    private class453 field9053;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "I")
    public int field9052;

    @OriginalMember(owner = "client!gn", name = "K", descriptor = "I")
    public int field9073;

    @OriginalMember(owner = "client!gn", name = "F", descriptor = "F")
    public float field9068;

    @OriginalMember(owner = "client!gn", name = "B", descriptor = "I")
    public int field9064;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "Llj;")
    private class565 field9047;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
    public int field9050;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "[I")
    private int[] field9056;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "Ler;")
    private class92 field9055;

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "[I")
    public static int[] field9062 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!gn", name = "H", descriptor = "Z")
    public static boolean field9070 = false;

    @OriginalMember(owner = "client!gn", name = "E", descriptor = "Z")
    public static boolean field9067 = false;

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "Lem;")
    public static class206 field9049 = new class206(38, 20);

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
    public static int field9046;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
    public static int field9048;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
    public static int field9051;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
    public static int field9054;

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
    public static int field9057;

    @OriginalMember(owner = "client!gn", name = "x", descriptor = "I")
    public static int field9060;

    @OriginalMember(owner = "client!gn", name = "y", descriptor = "I")
    public static int field9061;

    @OriginalMember(owner = "client!gn", name = "C", descriptor = "I")
    public static int field9065;

    @OriginalMember(owner = "client!gn", name = "I", descriptor = "I")
    public static int field9071;

    @OriginalMember(owner = "client!gn", name = "J", descriptor = "I")
    public static int field9072;

    @OriginalMember(owner = "client!gn", name = "D", descriptor = "Lgb;")
    public static class197 field9066;

    @OriginalMember(owner = "client!gn", name = "G", descriptor = "Lmq;")
    private class470 field9069;

    @OriginalMember(owner = "client!gn", name = "A", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9063;

    @OriginalMember(owner = "client!gn", name = "w", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field9059;

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "[J")
    public static long[] field9058;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IBLin;I)V")
    public static final void method3670(int arg0, byte arg1, class78 arg2, int arg3) {
        field9065++;
        class618 var4 = arg2.method608(class334.field4506, (byte) -117);
        if (var4 == null) {
            return;
        }
        class334.field4506.method200(arg3, arg0, arg3 + arg2.field1104, arg2.field1050 + arg0);
        if (class533.field7214 >= 3) {
            class334.field4506.method112(-16777216, var4, arg3, arg0);
        } else {
            class628.field8704.method3935((float) arg2.field1104 / 2.0F + (float) arg3, (float) arg2.field1050 / 2.0F + (float) arg0, 4096, (int) (-class705.field9964) & 0x3FFF << 2, var4, arg3, arg0);
        }
        int var5 = -52 % ((arg1 + 75) / 50);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)V")
    public final void method3671(int arg0, int arg1) {
        this.field9059 = this.field9047.field7835.method3474(arg0 * 4, true);
        field9048++;
        if (arg1 <= 89) {
            this.field9052 = -63;
        }
        this.field9063 = new Stream(this.field9059);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIFII)V")
    public final void method3672(int arg0, int arg1, float arg2, int arg3, int arg4) {
        field9054++;
        if (this.field9052 != -1) {
            class686 var6 = this.field9047.field2418.method1365(-17951, this.field9052);
            int var7 = var6.field9791 & 0xFF;
            if (var7 != 0 && var6.field9797 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 <= 127) {
                    var8 = arg1 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((var8 & 0xFF00FF) * var7 + ((arg4 & 0xFF00FF) * var10) & 0xFF00FF00) + ((arg4 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field9783 & 0xFF;
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
                arg4 = (var13 & 0xFF00) + (var14 >> 8) + (var12 << 8 & 0xFF0032);
            }
        }
        if (arg2 != 1.0F) {
            int var15 = (arg4 & 0xFFCFE8) >> 16;
            int var16 = arg4 >> 8 & 0xFF;
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
            arg4 = var19 << 8 | var18 << 16 | var20;
        }
        this.field9063.method3480(arg3 * 4);
        this.field9063.method3481((byte) (arg4 >> 16));
        if (arg0 <= 6) {
            this.field9052 = 12;
        }
        this.field9063.method3481((byte) (arg4 >> 8));
        this.field9063.method3481((byte) arg4);
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(II)V")
    public final void method3673(int arg0, int arg1) {
        field9072++;
        this.field9063.method3480(arg0 * arg1 + 3);
        this.field9063.method3481(-1);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
    public static void method3674(int arg0) {
        field9049 = null;
        if (arg0 == 65280) {
            field9062 = null;
            field9058 = null;
            field9066 = null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lr;ILko;)I")
    public static final int method3675(class166 arg0, int arg1, class466 arg2) {
        field9046++;
        if (arg2.field6414 != -1) {
            return arg2.field6414;
        }
        if (arg2.field6399 != -1) {
            class686 var3 = arg0.field2418.method1365(-17951, arg2.field6399);
            if (!var3.field9794) {
                return var3.field9777;
            }
        }
        int var4 = -114 % ((arg1 - 63) / 39);
        return arg2.field6403;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[II)V")
    public final void method3676(int arg0, int[] arg1, int arg2) {
        field9060++;
        int var4 = 0;
        if (arg0 != 5123) {
            field9066 = null;
        }
        class340 var5 = this.field9047.field7899;
        var5.field6892 = 0;
        if (this.field9047.field7921) {
            for (int var6 = 0; var6 < arg2; var6++) {
                int var7 = arg1[var6];
                int var8 = this.field9056[var7];
                short[] var9 = this.field9053.field6250[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var9.length) {
                        if ((0x1 << var10++ & var8) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method2837(var9[var11++] & 0xFFFF, arg0 - 5125);
                            var4++;
                            var5.method2837(var9[var11++] & 0xFFFF, -2);
                            var5.method2837(var9[var11++] & 0xFFFF, -2);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg1[var12];
                int var14 = this.field9056[var13];
                short[] var15 = this.field9053.field6250[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var15.length) {
                        if ((var14 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var5.method2848((byte) -121, var15[var17++] & 0xFFFF);
                            var4++;
                            var5.method2848((byte) -126, var15[var17++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method2848((byte) -117, var15[var17++] & 0xFFFF);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field9055.method670(var5.field6892, -89, 5123, var5.field6855);
        this.field9047.method3208(this.field9053.field6277, (byte) -125, this.field9053.field6275, this.field9053.field6284, this.field9069);
        this.field9047.method3196((this.field9053.field6248 & 0x8) != 0, (this.field9053.field6248 & 0x7) != 0, this.field9052, (byte) 88);
        if (this.field9047.field7881) {
            this.field9047.method153(Integer.MAX_VALUE, this.field9064, this.field9050, this.field9073);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field9068, 1.0F / this.field9068, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field9047.method3208(this.field9053.field6277, (byte) 21, this.field9053.field6275, this.field9053.field6284, this.field9069);
        this.field9047.method3235(var4, 0, this.field9055, false, 4);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(II)V")
    public final void method3677(int arg0, int arg1) {
        field9057++;
        this.field9063.method3477();
        class194 var3 = this.field9047.method3239(4, arg1 * 4, false, true, this.field9059);
        this.field9069 = new class470(var3, 5121, 4, 0);
        if (arg0 != 226) {
            method3675(null, -22, null);
        }
        this.field9063 = null;
        this.field9059 = null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method3678(byte arg0, long arg1) {
        class444.field6143.setTime(new Date(arg1));
        field9071++;
        int var3 = class444.field6143.get(7);
        int var4 = class444.field6143.get(5);
        int var5 = class444.field6143.get(2);
        int var6 = class444.field6143.get(1);
        if (arg0 <= 94) {
            field9067 = false;
        }
        int var7 = class444.field6143.get(11);
        int var8 = class444.field6143.get(12);
        int var9 = class444.field6143.get(13);
        return class41.field483[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class558.field7530[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BIII)V")
    public final void method3679(byte arg0, int arg1, int arg2, int arg3) {
        field9061++;
        this.field9056[this.field9053.field446 * arg3 + arg1] = class647.method3617(this.field9056[this.field9053.field446 * arg3 + arg1], 0x1 << arg2);
        int var5 = 10 % ((arg0 + 31) / 57);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIB[BII)V")
    public static final void method3680(int arg0, int arg1, byte arg2, byte[] arg3, int arg4, int arg5) {
        field9051++;
        if (arg2 != 1) {
            method3675(null, -111, null);
        }
        if (arg5 >= arg4) {
            return;
        }
        int var6 = arg1 + arg5;
        int var7 = arg4 - arg5 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg4 - arg5 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg3[var6++] = 1;
                }
            }
            arg3[var6++] = 1;
            arg3[var6++] = 1;
            arg3[var6++] = 1;
            arg3[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lhca;IIIII)V")
    public class652(class453 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field9053 = arg0;
        this.field9052 = arg1;
        this.field9073 = arg5;
        this.field9068 = arg2;
        this.field9064 = arg3;
        this.field9047 = this.field9053.field6245;
        this.field9050 = arg4;
        this.field9056 = new int[this.field9053.field446 * this.field9053.field438];
        this.field9055 = new class92(this.field9047, 5123, null, 1);
    }
}
