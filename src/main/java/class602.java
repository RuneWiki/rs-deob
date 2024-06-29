import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public abstract class class602 implements class764 {

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "Ltd;")
    private class457 field8637 = class350.field5072;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    private int field8630;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "Z")
    private boolean field8631;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "Lon;")
    public class496 field8626;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "Lhh;")
    public class250 field8635;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public int field8634;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Ldga;")
    public class713 field8615;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    private int field8627;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field8639 = new String[] { method4457(method4456("\u0013#9|[\u0012\"c~\u001a")), method4457(method4456("\u0012>{,")), method4457(method4456("\u0007e9nO")), method4457(method4456("\u0013#9\u0010\u001a")), method4457(method4456("\u0013#9\u0012\u001a")), method4457(method4456("\u0013#9\u0016\u001a")), method4457(method4456("\u0013#9\u0003sT")), method4457(method4456("\u0013#9\u000b\u001a")), method4457(method4456("\u0013#9\u0002sT")), method4457(method4456("\u0013#9\u0017\u001a")), method4457(method4456("\u0013#9&[\u0012*{)H\u0019c")), method4457(method4456("\u0013#9\u0011\u001a")), method4457(method4456("\u0013#9\u0014\u001a")), method4457(method4456("\u0013#9\u0015\u001a")), method4457(method4456("\u0013#9\u0001sT")), method4457(method4456("\u0013#9\u0006\u001a")), method4457(method4456("\u0013#9\u0013\u001a")) };

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "Lmv;")
    public static class125 field8621 = new class125(13, 8);

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field8628 = 0;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "S")
    public static short field8633 = 1;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "Lsb;")
    public static class261 field8632 = new class261(122, -1);

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field8613;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field8614;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    public static int field8616;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field8617;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field8618;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public static int field8619;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field8620;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    public static int field8622;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public static int field8623;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field8624;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field8625;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    public static int field8629;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field8636;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "Ltb;")
    public static class392 field8638;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)V")
    public static final void method4445(int arg0, int arg1, int arg2) {
        try {
            field8625++;
            int var3 = 54 / ((arg0 - 30) / 59);
            class132.method1151((byte) -78, arg1, arg2);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8639[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI[BII)V")
    public final void method4446(byte arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        try {
            field8616++;
            int var6 = -5 % ((arg0 - 73) / 48);
            if (arg4 > 0 && !class357.method2858(arg4, false)) {
                throw new IllegalArgumentException("");
            } else if (arg3 <= 0 || class357.method2858(arg3, false)) {
                int var7 = this.field8635.field3568;
                int var8 = 0;
                int var9 = arg4 >= arg3 ? arg3 : arg4;
                int var10 = arg4 >> 1;
                int var11 = arg3 >> 1;
                byte[] var12 = arg2;
                byte[] var13 = new byte[var10 * var11 * var7];
                while (true) {
                    OpenGL.glTexImage2Dub(arg1, var8, this.method4454(false), arg4, arg3, 0, class341.method2740((byte) 87, this.field8635), 5121, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = arg4 * var7;
                    for (int var15 = 0; var15 < var7; var15++) {
                        int var16 = var15;
                        int var17 = var15;
                        int var18 = var15 + var14;
                        for (int var19 = 0; var19 < var11; var19++) {
                            for (int var20 = 0; var20 < var10; var20++) {
                                byte var21 = var12[var17];
                                int var22 = var7 + var17;
                                int var23 = var12[var22] + var21;
                                int var24 = var12[var18] + var23;
                                var17 = var7 + var22;
                                int var25 = var7 + var18;
                                int var26 = var12[var25] + var24;
                                var18 = var7 + var25;
                                var13[var16] = (byte) (var26 >> 2);
                                var16 += var7;
                            }
                            var18 += var14;
                            var17 += var14;
                        }
                    }
                    byte[] var27 = var13;
                    var13 = var12;
                    arg4 = var10;
                    var12 = var27;
                    arg3 = var11;
                    var8++;
                    var9 >>= 0x1;
                    var10 >>= 0x1;
                    var11 >>= 0x1;
                }
            } else {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var29) {
            throw class665.method4799(var29, field8639[11] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field8639[1] : field8639[2]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)I")
    private final int method4447(int arg0) {
        try {
            field8622++;
            int var2 = this.field8635.field3568 * this.field8630 * this.field8626.field7279;
            if (arg0 <= 6) {
                field8628 = 61;
            }
            return this.field8631 ? var2 * 4 / 3 : var2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8639[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
    public static void method4448(boolean arg0) {
        try {
            field8638 = null;
            field8632 = null;
            if (!arg0) {
                field8632 = null;
            }
            field8621 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8639[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(IZ)V")
    private final void method4449(int arg0, boolean arg1) {
        try {
            if (!arg1) {
                field8638 = null;
            }
            this.field8615.field4711 -= arg0;
            field8619++;
            this.field8615.field4711 += this.method4447(55);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8639[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        try {
            this.method4453(22);
            field8629++;
            super.finalize();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8639[10] + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B[IIII)V")
    public final void method4450(byte arg0, int[] arg1, int arg2, int arg3, int arg4) {
        try {
            field8614++;
            if (arg3 > 0 && !class357.method2858(arg3, false)) {
                throw new IllegalArgumentException("");
            } else if (arg4 > 0 && !class357.method2858(arg4, false)) {
                throw new IllegalArgumentException("");
            } else if (class385.field5635 == this.field8635) {
                int var6 = 0;
                int var7 = arg3 >= arg4 ? arg4 : arg3;
                int var8 = arg3 >> 1;
                int var9 = arg4 >> 1;
                int[] var10 = arg1;
                int[] var11 = new int[var8 * var9];
                if (arg0 >= -65) {
                    this.method4453(33);
                }
                while (true) {
                    OpenGL.glTexImage2Di(arg2, var6, this.method4454(false), arg3, arg4, 0, 32993, this.field8615.field10126, var10, 0);
                    if (var7 <= 1) {
                        return;
                    }
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = arg3 + var13;
                    int[] var15 = var11;
                    for (int var16 = 0; var16 < var9; var16++) {
                        for (int var17 = 0; var17 < var8; var17++) {
                            int var18 = var10[var13++];
                            int var19 = var10[var13++];
                            int var20 = var10[var14++];
                            int var21 = (var18 & 0xFF81) >> 8;
                            int var22 = var18 >> 16 & 0xFF;
                            int var23 = var18 >> 24 & 0xFF;
                            int var24 = var10[var14++];
                            int var25 = var18 & 0xFF;
                            int var26 = (var19 >> 16 & 0xFF) + var22;
                            int var27 = (var19 & 0xFF) + var25;
                            int var28 = (var19 >> 24 & 0xFF) + var23;
                            int var29 = ((var19 & 0xFFF8) >> 8) + var21;
                            int var30 = (var20 & 0xFF) + var27;
                            int var31 = (var20 >> 8 & 0xFF) + var29;
                            int var32 = (var20 >> 16 & 0xFF) + var26;
                            int var33 = (var20 >> 24 & 0xFF) + var28;
                            int var34 = ((var24 & 0xFFC2) >> 8) + var31;
                            int var35 = (var24 & 0xFF) + var30;
                            int var36 = (var24 >> 24 & 0xFF) + var33;
                            int var37 = (var24 >> 16 & 0xFF) + var32;
                            var11[var12++] = class10.method71(class434.method3377(1020, var35) >> 2, class10.method71(class434.method3377(1020, var34) << 6, class10.method71(class434.method3377(var37 << 14, 16711680), class434.method3377(var36 << 22, -16777216))));
                        }
                        var13 += arg3;
                        var14 += arg3;
                    }
                    var11 = var10;
                    arg3 = var8;
                    var10 = var15;
                    arg4 = var9;
                    var7 >>= 0x1;
                    var9 >>= 0x1;
                    var8 >>= 0x1;
                    var6++;
                }
            } else {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var39) {
            throw class665.method4799(var39, field8639[4] + arg0 + ',' + (arg1 == null ? field8639[1] : field8639[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ltd;I)V")
    public final void method2250(class457 arg0, int arg1) {
        try {
            if (arg1 == 18475) {
                field8617++;
                if (this.field8637 != arg0) {
                    this.field8637 = arg0;
                    this.method4455(arg1 ^ 0xFFFFD821);
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8639[7] + (arg0 == null ? field8639[1] : field8639[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "([FIIII)V")
    public final void method4451(float[] arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field8624++;
            if (arg3 > 0 && !class357.method2858(arg3, false)) {
                throw new IllegalArgumentException("");
            } else if (arg4 <= 0 || class357.method2858(arg4, false)) {
                int var6 = this.field8635.field3568;
                int var7 = 0;
                int var8 = arg3 < arg4 ? arg3 : arg4;
                int var9 = arg3 >> 1;
                if (arg2 <= 111) {
                    this.field8631 = true;
                }
                int var10 = arg4 >> 1;
                float[] var11 = arg0;
                float[] var12 = new float[var6 * var9 * var10];
                while (true) {
                    OpenGL.glTexImage2Df(arg1, var7, this.method4454(false), arg3, arg4, 0, class341.method2740((byte) -83, this.field8635), 5126, var11, 0);
                    if (var8 <= 1) {
                        return;
                    }
                    int var13 = arg3 * var6;
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
                                var12[var16] = var26 * 0.25F;
                                var18 = var6 + var25;
                                var16 += var6;
                            }
                            var17 += var13;
                            var18 += var13;
                        }
                    }
                    var12 = var11;
                    arg3 = var9;
                    arg4 = var10;
                    var11 = var14;
                    var8 >>= 0x1;
                    var9 >>= 0x1;
                    var7++;
                    var10 >>= 0x1;
                }
            } else {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var28) {
            throw class665.method4799(var28, field8639[16] + (arg0 == null ? field8639[1] : field8639[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ)I")
    public static final int method4452(int arg0, boolean arg1) {
        try {
            field8618++;
            return arg1 ? arg0 >>> 10 : -97;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8639[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)V")
    private final void method4453(int arg0) {
        try {
            field8636++;
            if (arg0 < 5) {
                field8633 = -96;
            }
            if (this.field8627 > 0) {
                this.field8615.method5163(true, this.field8627, this.method4447(117));
                this.field8627 = 0;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8639[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(Z)I")
    public final int method4454(boolean arg0) {
        try {
            field8613++;
            if (arg0) {
                return 108;
            }
            if (class496.field7281 == this.field8626) {
                if (class210.field3057 == this.field8635) {
                    return 6407;
                }
                if (class385.field5635 == this.field8635) {
                    return 6408;
                }
                if (class18.field235 == this.field8635) {
                    return 6406;
                }
                if (class101.field1356 == this.field8635) {
                    return 6409;
                }
                if (class518.field7566 == this.field8635) {
                    return 6410;
                }
                if (class167.field2133 == this.field8635) {
                    return 6145;
                }
            } else if (class496.field7284 == this.field8626) {
                if (class210.field3057 == this.field8635) {
                    return 34843;
                }
                if (class385.field5635 == this.field8635) {
                    return 34842;
                }
                if (class18.field235 == this.field8635) {
                    return 34844;
                }
                if (class101.field1356 == this.field8635) {
                    return 34846;
                }
                if (class518.field7566 == this.field8635) {
                    return 34847;
                }
                if (class167.field2133 == this.field8635) {
                    return 6145;
                }
            } else if (class496.field7285 == this.field8626) {
                if (class210.field3057 == this.field8635) {
                    return 34837;
                }
                if (class385.field5635 == this.field8635) {
                    return 34836;
                }
                if (class18.field235 == this.field8635) {
                    return 34838;
                }
                if (class101.field1356 == this.field8635) {
                    return 34840;
                }
                if (class518.field7566 == this.field8635) {
                    return 34841;
                }
                if (class167.field2133 == this.field8635) {
                    return 6145;
                }
            }
            throw new IllegalStateException();
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8639[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V")
    private final void method4455(int arg0) {
        try {
            field8623++;
            if (arg0 != -28662) {
                this.method4453(124);
            }
            this.field8615.method2668(24, this);
            if (class350.field5072 == this.field8637) {
                OpenGL.glTexParameteri(this.field8634, 10241, this.field8631 ? 9987 : 9729);
                OpenGL.glTexParameteri(this.field8634, 10240, 9729);
            } else {
                OpenGL.glTexParameteri(this.field8634, 10241, this.field8631 ? 9984 : 9728);
                OpenGL.glTexParameteri(this.field8634, 10240, 9728);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8639[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public final void method2251(int arg0) {
        try {
            field8620++;
            int var2 = this.field8615.method2635(false);
            if (arg0 != 14436) {
                this.method4454(false);
            }
            int var3 = this.field8615.field10129[var2];
            if (this.field8634 != var3) {
                if (var3 != 0) {
                    OpenGL.glBindTexture(var3, 0);
                    OpenGL.glDisable(var3);
                }
                OpenGL.glEnable(this.field8634);
                this.field8615.field10129[var2] = this.field8634;
            }
            OpenGL.glBindTexture(this.field8634, this.field8627);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8639[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Ldga;ILhh;Lon;IZ)V")
    public class602(class713 arg0, int arg1, class250 arg2, class496 arg3, int arg4, boolean arg5) {
        try {
            this.field8630 = arg4;
            this.field8631 = arg5;
            this.field8626 = arg3;
            this.field8635 = arg2;
            this.field8634 = arg1;
            this.field8615 = arg0;
            OpenGL.glGenTextures(1, class687.field9625, 0);
            this.field8627 = class687.field9625[0];
            this.method4455(-28662);
            this.method4449(0, true);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field8639[0] + (arg0 == null ? field8639[1] : field8639[2]) + ',' + arg1 + ',' + (arg2 == null ? field8639[1] : field8639[2]) + ',' + (arg3 == null ? field8639[1] : field8639[2]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4456(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x32);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4457(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 124;
                    break;
                case 1:
                    var10005 = 75;
                    break;
                case 2:
                    var10005 = 23;
                    break;
                case 3:
                    var10005 = 64;
                    break;
                default:
                    var10005 = 50;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
