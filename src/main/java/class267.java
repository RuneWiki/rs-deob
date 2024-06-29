import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public abstract class class267 implements class440 {

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "Lie;")
    private class6 field3466 = class178.field2158;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public int field3482;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Lg;")
    public class135 field3465;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    private int field3469;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "Ltm;")
    public class327 field3489;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "Z")
    private boolean field3467;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "Lvp;")
    public class160 field3475;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    private int field3476;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "Lcu;")
    public static class185 field3484;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "[[B")
    public static byte[][] field3488;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "Ldn;")
    public static class438 field3487;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field3471;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
    public static void method1489(int arg0) {
        field3488 = null;
        field3484 = null;
        field3487 = null;
        if (arg0 == 255) {
            field3471 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
    private final void method1490(int arg0, int arg1) {
        if (arg0 != -16777216) {
            this.field3475 = null;
        }
        this.field3489.field5686 -= arg1;
        field3479++;
        this.field3489.field5686 += this.method1492((byte) 103);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III[FI)V")
    public final void method1491(int arg0, int arg1, int arg2, float[] arg3, int arg4) {
        if (arg2 != -31772) {
            this.method1274((byte) -39);
        }
        field3477++;
        if (arg0 > 0 && !class415.method2366(-125, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class415.method2366(arg2 + 31646, arg1)) {
            int var6 = this.field3465.field1649;
            int var7 = 0;
            int var8 = arg1 > arg0 ? arg0 : arg1;
            int var9 = arg0 >> 1;
            int var10 = arg1 >> 1;
            float[] var11 = arg3;
            float[] var12 = new float[var6 * var9 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg4, var7, this.method1497((byte) 76), arg0, arg1, 0, class354.method1986(arg2 + 31651, this.field3465), 5126, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg0 * var6;
                float[] var14 = var12;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = var15;
                    int var17 = var15;
                    int var18 = var13 + var15;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            float var21 = var11[var17];
                            int var22 = var6 + var17;
                            float var23 = var11[var22] + var21;
                            float var24 = var11[var18] + var23;
                            var17 = var6 + var22;
                            int var25 = var6 + var18;
                            float var26 = var11[var25] + var24;
                            var18 = var6 + var25;
                            var12[var16] = var26 * 0.25F;
                            var16 += var6;
                        }
                        var18 += var13;
                        var17 += var13;
                    }
                }
                var12 = var11;
                var11 = var14;
                arg0 = var9;
                arg1 = var10;
                var7++;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var8 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(B)I")
    private final int method1492(byte arg0) {
        field3470++;
        int var2 = this.field3465.field1649 * this.field3469 * this.field3475.field1924;
        if (arg0 != 103) {
            field3488 = null;
        }
        return this.field3467 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIB[II)V")
    public final void method1493(int arg0, int arg1, byte arg2, int[] arg3, int arg4) {
        field3474++;
        if (arg1 > 0 && !class415.method2366(-122, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > 0 && !class415.method2366(-128, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 122) {
            if (class10.field80 != this.field3465) {
                throw new IllegalArgumentException("");
            }
            int var6 = 0;
            int var7 = arg1 >= arg4 ? arg4 : arg1;
            int var8 = arg1 >> 1;
            int var9 = arg4 >> 1;
            int[] var10 = arg3;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg0, var6, this.method1497((byte) 76), arg1, arg4, 0, 32993, this.field3489.field4261, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = arg1 + var13;
                int[] var15 = var11;
                for (int var16 = 0; var16 < var9; var16++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var13++];
                        int var20 = var10[var14++];
                        int var21 = (var18 & 0xFF41) >> 8;
                        int var22 = var10[var14++];
                        int var23 = var18 >> 24 & 0xFF;
                        int var24 = (var18 & 0xFF06D5) >> 16;
                        int var25 = var18 & 0xFF;
                        int var26 = (var19 >> 16 & 0xFF) + var24;
                        int var27 = (var19 & 0xFF) + var25;
                        int var28 = ((var19 & 0xFF97) >> 8) + var21;
                        int var29 = (var19 >> 24 & 0xFF) + var23;
                        int var30 = (var20 & 0xFF) + var27;
                        int var31 = ((var20 & 0xFFCD98) >> 16) + var26;
                        int var32 = (var20 >> 24 & 0xFF) + var29;
                        int var33 = (var20 >> 8 & 0xFF) + var28;
                        int var34 = (var22 >> 8 & 0xFF) + var33;
                        int var35 = (var22 >> 24 & 0xFF) + var32;
                        int var36 = (var22 >> 16 & 0xFF) + var31;
                        int var37 = (var22 & 0xFF) + var30;
                        var11[var12++] = class42.method223(class42.method223(class42.method223(class288.method1624(16711680, var36 << 14), class288.method1624(var35 << 22, -16777216)), class288.method1624(1020, var34) << 6), class288.method1624(var37, 1020) >> 2);
                    }
                    var14 += arg1;
                    var13 += arg1;
                }
                var11 = var10;
                var10 = var15;
                arg4 = var9;
                arg1 = var8;
                var9 >>= 0x1;
                var7 >>= 0x1;
                var8 >>= 0x1;
                var6++;
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(B)I")
    public static final int method1494(byte arg0) {
        if (arg0 != -78) {
            field3487 = null;
        }
        field3472++;
        return class602.field8691;
    }

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "(B)V")
    private final void method1495(byte arg0) {
        if (this.field3476 > 0) {
            this.field3489.method1787(this.field3476, this.method1492((byte) 103), 15556);
            this.field3476 = 0;
        }
        field3468++;
        if (arg0 != -72) {
            this.method1493(57, -126, (byte) 5, null, -89);
        }
    }

    @OriginalMember(owner = "client!dh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3483++;
        this.method1495((byte) -72);
        super.finalize();
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III[BI)V")
    public final void method1496(int arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        field3480++;
        if (arg1 > 0 && !class415.method2366(-125, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class415.method2366(arg0 ^ 0xFFFFD469, arg4)) {
            int var6 = this.field3465.field1649;
            int var7 = 0;
            int var8 = arg1 >= arg4 ? arg4 : arg1;
            int var9 = arg1 >> 1;
            int var10 = arg4 >> 1;
            byte[] var11 = arg3;
            if (arg0 != 11240) {
                method1494((byte) -87);
            }
            byte[] var12 = new byte[var6 * var10 * var9];
            while (true) {
                OpenGL.glTexImage2Dub(arg2, var7, this.method1497((byte) 76), arg1, arg4, 0, class354.method1986(-120, this.field3465), 5121, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg1 * var6;
                for (int var14 = 0; var14 < var6; var14++) {
                    int var16 = var14;
                    int var17 = var14;
                    int var18 = var14 + var13;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            byte var21 = var11[var17];
                            int var22 = var6 + var17;
                            int var23 = var11[var22] + var21;
                            var17 = var6 + var22;
                            int var24 = var11[var18] + var23;
                            int var25 = var6 + var18;
                            int var26 = var11[var25] + var24;
                            var12[var16] = (byte) (var26 >> 2);
                            var18 = var6 + var25;
                            var16 += var6;
                        }
                        var18 += var13;
                        var17 += var13;
                    }
                }
                byte[] var15 = var12;
                var12 = var11;
                arg1 = var9;
                var11 = var15;
                arg4 = var10;
                var9 >>= 0x1;
                var8 >>= 0x1;
                var7++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "(B)I")
    public final int method1497(byte arg0) {
        field3473++;
        if (class160.field1932 == this.field3475) {
            if (class147.field1765 == this.field3465) {
                return 6407;
            }
            if (class10.field80 == this.field3465) {
                return 6408;
            }
            if (class37.field293 == this.field3465) {
                return 6406;
            }
            if (class638.field9183 == this.field3465) {
                return 6409;
            }
            if (class127.field1570 == this.field3465) {
                return 6410;
            }
            if (class101.field1252 == this.field3465) {
                return 6145;
            }
        } else if (class160.field1935 == this.field3475) {
            if (class147.field1765 == this.field3465) {
                return 34843;
            }
            if (class10.field80 == this.field3465) {
                return 34842;
            }
            if (class37.field293 == this.field3465) {
                return 34844;
            }
            if (class638.field9183 == this.field3465) {
                return 34846;
            }
            if (class127.field1570 == this.field3465) {
                return 34847;
            }
            if (class101.field1252 == this.field3465) {
                return 6145;
            }
        } else if (class160.field1936 == this.field3475) {
            if (class147.field1765 == this.field3465) {
                return 34837;
            }
            if (class10.field80 == this.field3465) {
                return 34836;
            }
            if (class37.field293 == this.field3465) {
                return 34838;
            }
            if (class638.field9183 == this.field3465) {
                return 34840;
            }
            if (class127.field1570 == this.field3465) {
                return 34841;
            }
            if (class101.field1252 == this.field3465) {
                return 6145;
            }
        }
        if (arg0 != 76) {
            method1489(-62);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILie;)V")
    public final void method1272(int arg0, class6 arg1) {
        if (this.field3466 != arg1) {
            this.field3466 = arg1;
            this.method1498(84);
        }
        field3481++;
        if (arg0 != 13027) {
            this.field3469 = -28;
        }
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(B)V")
    public final void method1274(byte arg0) {
        field3485++;
        if (arg0 != 57) {
            method1494((byte) -81);
        }
        int var2 = this.field3489.method2444(30505);
        int var3 = this.field3489.field4265[var2];
        if (this.field3482 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field3482);
            this.field3489.field4265[var2] = this.field3482;
        }
        OpenGL.glBindTexture(this.field3482, this.field3476);
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V")
    private final void method1498(int arg0) {
        int var2 = -54 / ((arg0 - 5) / 33);
        this.field3489.method2459(78, this);
        field3478++;
        if (class178.field2158 == this.field3466) {
            OpenGL.glTexParameteri(this.field3482, 10241, this.field3467 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field3482, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field3482, 10241, this.field3467 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field3482, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Ltm;ILg;Lvp;IZ)V")
    public class267(class327 arg0, int arg1, class135 arg2, class160 arg3, int arg4, boolean arg5) {
        this.field3482 = arg1;
        this.field3465 = arg2;
        this.field3469 = arg4;
        this.field3489 = arg0;
        this.field3467 = arg5;
        this.field3475 = arg3;
        OpenGL.glGenTextures(1, class393.field5191, 0);
        this.field3476 = class393.field5191[0];
        this.method1498(-42);
        this.method1490(-16777216, 0);
    }

    static {
        new class180(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
        field3484 = new class185(14, 7);
        field3488 = new byte[1000][];
        field3486 = 0;
    }
}
