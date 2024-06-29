import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public class class380 extends class189 {

    @OriginalMember(owner = "client!aha", name = "z", descriptor = "Lio;")
    private class437 field5450;

    @OriginalMember(owner = "client!aha", name = "B", descriptor = "I")
    public int field5452;

    @OriginalMember(owner = "client!aha", name = "l", descriptor = "I")
    public int field5436;

    @OriginalMember(owner = "client!aha", name = "A", descriptor = "[I")
    private int[] field5451;

    @OriginalMember(owner = "client!aha", name = "q", descriptor = "I")
    public int field5441;

    @OriginalMember(owner = "client!aha", name = "C", descriptor = "F")
    public float field5453;

    @OriginalMember(owner = "client!aha", name = "G", descriptor = "I")
    public int field5457;

    @OriginalMember(owner = "client!aha", name = "r", descriptor = "Leea;")
    private class131 field5442;

    @OriginalMember(owner = "client!aha", name = "o", descriptor = "Lal;")
    private class99 field5439;

    @OriginalMember(owner = "client!aha", name = "v", descriptor = "[I")
    public static int[] field5446 = new int[32];

    @OriginalMember(owner = "client!aha", name = "m", descriptor = "I")
    public static int field5437 = 1403;

    @OriginalMember(owner = "client!aha", name = "p", descriptor = "Z")
    public static boolean field5440 = false;

    @OriginalMember(owner = "client!aha", name = "E", descriptor = "[I")
    public static int[] field5455 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!aha", name = "j", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!aha", name = "k", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!aha", name = "s", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!aha", name = "t", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!aha", name = "w", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!aha", name = "x", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!aha", name = "y", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!aha", name = "F", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!aha", name = "u", descriptor = "J")
    public static long field5445;

    @OriginalMember(owner = "client!aha", name = "H", descriptor = "Lvp;")
    private class186 field5458;

    @OriginalMember(owner = "client!aha", name = "n", descriptor = "Ljaclib/memory/Stream;")
    private Stream field5438;

    @OriginalMember(owner = "client!aha", name = "D", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field5454;

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IZ)I", line = 3)
    public static final int method2418(int arg0, boolean arg1) {
        if (!arg1) {
            method2422(-115);
        }
        field5456++;
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IB)V", line = 22)
    public final void method2419(int arg0, byte arg1) {
        this.field5438.method3660(arg0 * 4 + 3);
        if (arg1 != 46) {
            this.field5438 = null;
        }
        field5435++;
        this.field5438.method3664(-1);
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IFIII)V", line = 34)
    public final void method2420(int arg0, float arg1, int arg2, int arg3, int arg4) {
        field5448++;
        if (this.field5457 != -1) {
            class502 var6 = this.field5442.field715.method532((byte) 127, this.field5457);
            int var7 = var6.field7192 & 0xFF;
            if (var7 != 0 && var6.field7204 != 4) {
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
                    arg3 = ((var8 & 0xFF00) * var7 + ((arg3 & 0xFF00) * var10) & 0xFF0000) + ((var8 & 0xFF00FF) * var7 + ((arg3 & 0xFF00FF) * var10) & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field7196 & 0xFF;
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
                arg3 = (var14 >> 8) + (var12 << 8 & 0xFF0076) + (var13 & 0xFF00);
            }
        }
        if (arg1 != 1.0F) {
            int var15 = (arg3 & 0xFFA9C3) >> 16;
            int var16 = (arg3 & 0xFF1C) >> 8;
            int var17 = arg3 & 0xFF;
            int var18 = (int) ((float) var15 * arg1);
            int var19 = (int) ((float) var16 * arg1);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var20 = (int) ((float) var17 * arg1);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var18 << 16 | var19 << 8 | var20;
        }
        this.field5438.method3660(arg4 * 4);
        this.field5438.method3664((byte) (arg3 >> 16));
        if (arg0 != 255) {
            field5440 = true;
        }
        this.field5438.method3664((byte) (arg3 >> 8));
        this.field5438.method3664((byte) arg3);
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IB[I)V", line = 147)
    public final void method2421(int arg0, byte arg1, int[] arg2) {
        field5444++;
        int var4 = 0;
        class267 var5 = this.field5442.field1923;
        var5.field9146 = 0;
        int var6 = -109 % ((-arg1 - 12) / 60);
        if (this.field5442.field1865) {
            for (int var7 = 0; var7 < arg0; var7++) {
                int var8 = arg2[var7];
                short[] var9 = this.field5450.field6205[var8];
                int var10 = this.field5451[var8];
                if (var10 != 0 && var9 != null) {
                    int var11 = 0;
                    int var12 = 0;
                    while (var9.length > var12) {
                        if ((var10 & 0x1 << var11++) == 0) {
                            var12 += 3;
                        } else {
                            var4++;
                            var5.method3745(-117, var9[var12++] & 0xFFFF);
                            var4++;
                            var5.method3745(-123, var9[var12++] & 0xFFFF);
                            var4++;
                            var5.method3745(-113, var9[var12++] & 0xFFFF);
                        }
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < arg0; var13++) {
                int var14 = arg2[var13];
                short[] var15 = this.field5450.field6205[var14];
                int var16 = this.field5451[var14];
                if (var16 != 0 && var15 != null) {
                    int var17 = 0;
                    int var18 = 0;
                    while (var18 < var15.length) {
                        if ((0x1 << var17++ & var16) == 0) {
                            var18 += 3;
                        } else {
                            var5.method3737(var15[var18++] & 0xFFFF, -1682769048);
                            var4++;
                            var4++;
                            var5.method3737(var15[var18++] & 0xFFFF, -1682769048);
                            var5.method3737(var15[var18++] & 0xFFFF, -1682769048);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field5439.method724(5123, var5.field9146, var5.field9154, -83);
        this.field5442.method935(this.field5450.field6232, this.field5450.field6229, this.field5458, (byte) 117, this.field5450.field6231);
        this.field5442.method941(this.field5457, (this.field5450.field6199 & 0x8) != 0, (this.field5450.field6199 & 0x7) != 0, (byte) -91);
        if (this.field5442.field1930) {
            this.field5442.method444(Integer.MAX_VALUE, this.field5452, this.field5436, this.field5441);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field5453, 1.0F / this.field5453, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field5442.method935(this.field5450.field6232, this.field5450.field6229, this.field5458, (byte) 94, this.field5450.field6231);
        this.field5442.method919(109, 0, 4, var4, this.field5439);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(I)V", line = 272)
    public static final void method2422(int arg0) {
        field5443++;
        for (class9 var1 = (class9) class230.field3099.method2303((byte) -37); var1 != null; var1 = (class9) class230.field3099.method2303((byte) -37)) {
            class331.method2167((byte) -98, var1);
        }
        if (arg0 >= -121) {
            method2422(97);
        }
        int var2;
        int var3;
        if (class557.field7812.field6532.method1419(false) == 1) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class310.field4320;
            var3 = class310.field4320;
        }
        client.method1970();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method1948();
            client.method1954(var4);
            client.method1949(var4);
        }
        client.method1965();
        client.method1969();
    }

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "(B)V", line = 315)
    public static void method2423(byte arg0) {
        if (arg0 < 29) {
            method2423((byte) 16);
        }
        field5446 = null;
        field5455 = null;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(BI)V", line = 336)
    public final void method2424(byte arg0, int arg1) {
        this.field5438.method3656();
        field5449++;
        class126 var3 = this.field5442.method920(4, this.field5454, 5890, false, arg1 * 4);
        this.field5458 = new class186(var3, 5121, 4, 0);
        int var4 = 112 / ((28 - arg0) / 36);
        this.field5454 = null;
        this.field5438 = null;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIB)V", line = 358)
    public final void method2425(int arg0, int arg1, int arg2, byte arg3) {
        this.field5451[this.field5450.field3935 * arg1 + arg0] = class325.method2116(this.field5451[this.field5450.field3935 * arg1 + arg0], 0x1 << arg2);
        field5447++;
        int var5 = -9 % ((arg3 + 60) / 38);
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(II)V", line = 372)
    public final void method2426(int arg0, int arg1) {
        if (arg0 <= -58) {
            this.field5454 = this.field5442.field1788.method3649(arg1 * 4, true);
            field5434++;
            this.field5438 = new Stream(this.field5454);
        }
    }

    @OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(Lio;IIIII)V", line = 386)
    public class380(class437 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5450 = arg0;
        this.field5452 = arg3;
        this.field5436 = arg4;
        this.field5451 = new int[this.field5450.field3935 * this.field5450.field3930];
        this.field5441 = arg5;
        this.field5453 = arg2;
        this.field5457 = arg1;
        this.field5442 = this.field5450.field6223;
        this.field5439 = new class99(this.field5442, 5123, null, 1);
    }
}
