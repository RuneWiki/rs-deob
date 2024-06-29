import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public abstract class class493 implements class466 {

    @OriginalMember(owner = "client!fu", name = "k", descriptor = "Lmv;")
    private class688 field6509 = class652.field9201;

    @OriginalMember(owner = "client!fu", name = "o", descriptor = "Lec;")
    public class146 field6513;

    @OriginalMember(owner = "client!fu", name = "x", descriptor = "Lbt;")
    public class117 field6522;

    @OriginalMember(owner = "client!fu", name = "u", descriptor = "I")
    public int field6519;

    @OriginalMember(owner = "client!fu", name = "p", descriptor = "I")
    private int field6514;

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "Llm;")
    public class337 field6502;

    @OriginalMember(owner = "client!fu", name = "j", descriptor = "Z")
    private boolean field6508;

    @OriginalMember(owner = "client!fu", name = "i", descriptor = "I")
    private int field6507;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
    public static int field6499 = 0;

    @OriginalMember(owner = "client!fu", name = "v", descriptor = "I")
    public static int field6520 = 0;

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "Z")
    public static boolean field6504 = false;

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
    public static int field6501;

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!fu", name = "l", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!fu", name = "m", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!fu", name = "n", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!fu", name = "q", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!fu", name = "r", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!fu", name = "s", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!fu", name = "t", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!fu", name = "w", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!fu", name = "y", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!fu", name = "z", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!fu", name = "A", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!fu", name = "B", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "Lqn;")
    public static class574 field6503;

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "Lpl;")
    public static class612 field6500;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IBI[II)V", line = 3)
    public final void method2652(int arg0, byte arg1, int arg2, int[] arg3, int arg4) {
        field6510++;
        if (arg0 > 0 && !class4.method36(arg0, (byte) 98)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > 0 && !class4.method36(arg4, (byte) 98)) {
            throw new IllegalArgumentException("");
        } else if (class590.field8288 == this.field6513) {
            int var6 = 0;
            int var7 = arg0 >= arg4 ? arg4 : arg0;
            if (arg1 >= -45) {
                method2659((byte) -27, null);
            }
            int var8 = arg0 >> 1;
            int var9 = arg4 >> 1;
            int[] var10 = arg3;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg2, var6, this.method2658(26701), arg0, arg4, 0, 32993, this.field6502.field4373, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = var13 + arg0;
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var14++];
                        int var20 = var10[var13++];
                        int var21 = var18 >> 16 & 0xFF;
                        int var22 = var18 & 0xFF;
                        int var23 = var18 >> 24 & 0xFF;
                        int var24 = var10[var14++];
                        int var25 = (var18 & 0xFF7E) >> 8;
                        int var26 = (var20 & 0xFF) + var22;
                        int var27 = (var20 >> 24 & 0xFF) + var23;
                        int var28 = ((var20 & 0xFF40) >> 8) + var25;
                        int var29 = (var20 >> 16 & 0xFF) + var21;
                        int var30 = (var19 & 0xFF) + var26;
                        int var31 = (var19 >> 16 & 0xFF) + var29;
                        int var32 = (var19 >> 24 & 0xFF) + var27;
                        int var33 = (var19 >> 8 & 0xFF) + var28;
                        int var34 = (var24 >> 8 & 0xFF) + var33;
                        int var35 = (var24 & 0xFF) + var30;
                        int var36 = (var24 >> 24 & 0xFF) + var32;
                        int var37 = (var24 >> 16 & 0xFF) + var31;
                        var11[var12++] = class444.method2376(class695.method3921(var35, 1020) >> 2, class444.method2376(class444.method2376(class695.method3921(var36 << 22, -16777216), class695.method3921(var37 << 14, 16711680)), class695.method3921(1020, var34) << 6));
                    }
                    var14 += arg0;
                    var13 += arg0;
                }
                int[] var16 = var11;
                var11 = var10;
                var10 = var16;
                arg4 = var9;
                arg0 = var8;
                var6++;
                var8 >>= 0x1;
                var9 >>= 0x1;
                var7 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "(I)V", line = 110)
    private final void method2653(int arg0) {
        this.field6502.method2596(this, 0);
        if (arg0 != 1859) {
            this.method2660(-27, -32, (byte) 111, null, -94);
        }
        field6512++;
        if (class652.field9201 == this.field6509) {
            OpenGL.glTexParameteri(this.field6519, 10241, this.field6508 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field6519, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field6519, 10241, this.field6508 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field6519, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!fu", name = "finalize", descriptor = "()V", line = 135)
    protected final void finalize() throws Throwable {
        field6523++;
        this.method2662((byte) -65);
        super.finalize();
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II[BIB)V", line = 145)
    public final void method2654(int arg0, int arg1, byte[] arg2, int arg3, byte arg4) {
        field6506++;
        if (arg1 > 0 && !class4.method36(arg1, (byte) 98)) {
            throw new IllegalArgumentException("");
        } else if (arg3 > 0 && !class4.method36(arg3, (byte) 98)) {
            throw new IllegalArgumentException("");
        } else if (arg4 == -33) {
            int var6 = this.field6513.field1885;
            int var7 = 0;
            int var8 = arg3 > arg1 ? arg1 : arg3;
            int var9 = arg1 >> 1;
            int var10 = arg3 >> 1;
            byte[] var11 = arg2;
            byte[] var12 = new byte[var6 * var9 * var10];
            while (true) {
                OpenGL.glTexImage2Dub(arg0, var7, this.method2658(26701), arg1, arg3, 0, class488.method2639(6407, this.field6513), 5121, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg1 * var6;
                byte[] var14 = var12;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = var15;
                    int var17 = var15;
                    int var18 = var13 + var15;
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
                var12 = var11;
                arg1 = var9;
                var11 = var14;
                arg3 = var10;
                var7++;
                var8 >>= 0x1;
                var10 >>= 0x1;
                var9 >>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Llm;ILec;Lbt;IZ)V", line = 790)
    public class493(class337 arg0, int arg1, class146 arg2, class117 arg3, int arg4, boolean arg5) {
        this.field6513 = arg2;
        this.field6522 = arg3;
        this.field6519 = arg1;
        this.field6514 = arg4;
        this.field6502 = arg0;
        this.field6508 = arg5;
        OpenGL.glGenTextures(1, class456.field5832, 0);
        this.field6507 = class456.field5832[0];
        this.method2653(1859);
        this.method2656(0, (byte) -126);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIILev;Z)Z", line = 262)
    public static final boolean method2655(int arg0, int arg1, int arg2, class597 arg3, boolean arg4) {
        field6511++;
        if (!class68.field926) {
            return false;
        } else if (class160.field2109 < 100) {
            return false;
        } else if (class455.method2433(arg0, arg2, -1, arg1)) {
            int var5 = arg2 << class52.field775;
            int var6 = arg1 << class52.field775;
            int var7 = class491.field6485[arg0].method1562(arg1, (byte) 51, arg2) - 1;
            int var8 = arg3.method71(-108) + var7;
            if (arg3.field8397 == 1) {
                if (!class430.method2271(var8, var8, class702.field9928 + var6, 26403, var6, var6, var5, var7, var5, var5)) {
                    return false;
                } else if (class430.method2271(var7, var8, var6 + class702.field9928, 26403, var6, class702.field9928 + var6, var5, var7, var5, var5)) {
                    class463.field5901++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field8397 == 2) {
                if (!class430.method2271(var8, var8, var6 + class702.field9928, 26403, class702.field9928 + var6, var6 - -class702.field9928, class702.field9928 + var5, var7, var5, var5)) {
                    return false;
                } else if (class430.method2271(var8, var7, class702.field9928 + var6, 26403, class702.field9928 + var6, class702.field9928 + var6, class702.field9928 + var5, var7, class702.field9928 + var5, var5)) {
                    class463.field5901++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field8397 == 4) {
                if (!class430.method2271(var8, var8, class702.field9928 + var6, 26403, var6, var6, class702.field9928 + var5, var7, var5 + class702.field9928, class702.field9928 + var5)) {
                    return false;
                } else if (class430.method2271(var7, var8, class702.field9928 + var6, 26403, var6, class702.field9928 + var6, class702.field9928 + var5, var7, class702.field9928 + var5, class702.field9928 + var5)) {
                    class463.field5901++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field8397 == 8) {
                if (!class430.method2271(var8, var8, var6, 26403, var6, var6, class702.field9928 + var5, var7, var5, var5)) {
                    return false;
                } else if (class430.method2271(var8, var7, var6, 26403, var6, var6, class702.field9928 + var5, var7, class702.field9928 + var5, var5)) {
                    class463.field5901++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field8397 != 16) {
                if (!arg4) {
                    field6520 = -70;
                }
                if (arg3.field8397 == 32) {
                    if (class175.method1100(false, class238.field2979, var8, class238.field2979 + var6, var7, var5 + class238.field2979, class238.field2979)) {
                        class463.field5901++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (arg3.field8397 == 64) {
                    if (class175.method1100(false, class238.field2979, var8, var6, var7, class238.field2979 + var5, class238.field2979)) {
                        class463.field5901++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (arg3.field8397 != 128) {
                    return true;
                } else if (class175.method1100(!arg4, class238.field2979, var8, var6, var7, var5, class238.field2979)) {
                    class463.field5901++;
                    return true;
                } else {
                    return false;
                }
            } else if (class175.method1100(!arg4, class238.field2979, var8, var6 + class238.field2979, var7, var5, class238.field2979)) {
                class463.field5901++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IB)V", line = 389)
    private final void method2656(int arg0, byte arg1) {
        if (arg1 == -126) {
            this.field6502.field6228 -= arg0;
            field6517++;
            this.field6502.field6228 += this.method2663(arg1 + 233);
        }
    }

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "(I)V", line = 402)
    public static void method2657(int arg0) {
        field6500 = null;
        field6503 = null;
        if (arg0 != -865) {
            method2659((byte) 26, null);
        }
    }

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "(I)I", line = 414)
    public final int method2658(int arg0) {
        field6515++;
        if (arg0 != 26701) {
            this.field6502 = null;
        }
        if (class117.field1509 == this.field6522) {
            if (class695.field9862 == this.field6513) {
                return 6407;
            }
            if (class590.field8288 == this.field6513) {
                return 6408;
            }
            if (class586.field8227 == this.field6513) {
                return 6406;
            }
            if (class639.field8973 == this.field6513) {
                return 6409;
            }
            if (class307.field3905 == this.field6513) {
                return 6410;
            }
            if (class223.field2786 == this.field6513) {
                return 6145;
            }
        } else if (class117.field1512 == this.field6522) {
            if (class695.field9862 == this.field6513) {
                return 34843;
            }
            if (class590.field8288 == this.field6513) {
                return 34842;
            }
            if (class586.field8227 == this.field6513) {
                return 34844;
            }
            if (class639.field8973 == this.field6513) {
                return 34846;
            }
            if (class307.field3905 == this.field6513) {
                return 34847;
            }
            if (class223.field2786 == this.field6513) {
                return 6145;
            }
        } else if (class117.field1513 == this.field6522) {
            if (class695.field9862 == this.field6513) {
                return 34837;
            }
            if (class590.field8288 == this.field6513) {
                return 34836;
            }
            if (class586.field8227 == this.field6513) {
                return 34838;
            }
            if (class639.field8973 == this.field6513) {
                return 34840;
            }
            if (class307.field3905 == this.field6513) {
                return 34841;
            }
            if (class223.field2786 == this.field6513) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lmv;I)V", line = 514)
    public final void method521(class688 arg0, int arg1) {
        if (this.field6509 != arg0) {
            this.field6509 = arg0;
            this.method2653(1859);
        }
        if (arg1 == 15590) {
            field6521++;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V", line = 538)
    public final void method527(int arg0) {
        if (arg0 != 9258) {
            return;
        }
        field6525++;
        int var2 = this.field6502.method2570(arg0 - 9381);
        int var3 = this.field6502.field4380[var2];
        if (this.field6519 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field6519);
            this.field6502.field4380[var2] = this.field6519;
        }
        OpenGL.glBindTexture(this.field6519, this.field6507);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 566)
    public static final String method2659(byte arg0, String arg1) {
        field6526++;
        StringBuffer var2 = new StringBuffer();
        if (arg0 != 100) {
            return null;
        }
        int var3 = arg1.length();
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 == '%' && (var4 + 2) < var3) {
                char var6 = arg1.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - 48;
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = var6 - 87;
                } else {
                    if (var6 < 'A' || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 + '\n' - 65;
                }
                int var9 = var8 * 16;
                char var10 = arg1.charAt(var4 + 2);
                int var11;
                if (var10 >= '0' && var10 <= '9') {
                    var11 = var10 + var9 - 48;
                } else if (var10 >= 'a' && var10 <= 'f') {
                    var11 = var10 + var9 + 10 - 97;
                } else {
                    if (var10 < 'A' || var10 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var10 + var9 + '\n' - 65;
                }
                var4 += 2;
                if (var11 != 0 && class29.method194((byte) -84, (byte) var11)) {
                    var2.append(class670.method3763((byte) 94, (byte) var11));
                }
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIB[FI)V", line = 642)
    public final void method2660(int arg0, int arg1, byte arg2, float[] arg3, int arg4) {
        field6505++;
        if (arg1 > 0 && !class4.method36(arg1, (byte) 98)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class4.method36(arg0, (byte) 98)) {
            int var6 = this.field6513.field1885;
            int var7 = 0;
            int var8 = -46 / ((-arg2 - 60) / 43);
            int var9 = arg1 < arg0 ? arg1 : arg0;
            int var10 = arg1 >> 1;
            int var11 = arg0 >> 1;
            float[] var12 = arg3;
            float[] var13 = new float[var10 * var11 * var6];
            while (true) {
                OpenGL.glTexImage2Df(arg4, var7, this.method2658(26701), arg1, arg0, 0, class488.method2639(6407, this.field6513), 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg1 * var6;
                float[] var15 = var13;
                for (int var16 = 0; var16 < var6; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var16 + var14;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var6 + var18;
                            float var24 = var12[var23] + var22;
                            float var25 = var12[var19] + var24;
                            var18 = var6 + var23;
                            int var26 = var6 + var19;
                            float var27 = var12[var26] + var25;
                            var13[var17] = var27 * 0.25F;
                            var19 = var6 + var26;
                            var17 += var6;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                var13 = var12;
                arg1 = var10;
                arg0 = var11;
                var12 = var15;
                var7++;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)V", line = 741)
    public static final void method2661(int arg0, int arg1) {
        class450 var2 = class190.field2377;
        synchronized (class190.field2377) {
            class190.field2377.method2411(true, arg1);
        }
        field6516++;
        class450 var3 = class19.field290;
        synchronized (class19.field290) {
            if (arg0 == 0) {
                class19.field290.method2411(true, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(B)V", line = 758)
    private final void method2662(byte arg0) {
        if (arg0 != -65) {
            field6500 = null;
        }
        if (this.field6507 > 0) {
            this.field6502.method1897(this.field6507, 0, this.method2663(102));
            this.field6507 = 0;
        }
        field6524++;
    }

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "(I)I", line = 774)
    private final int method2663(int arg0) {
        field6518++;
        int var2 = this.field6513.field1885 * this.field6522.field1505 * this.field6514;
        if (arg0 < 62) {
            this.method527(-38);
        }
        return this.field6508 ? var2 * 4 / 3 : var2;
    }
}
