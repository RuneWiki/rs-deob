import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public class class509 extends class692 {

    @OriginalMember(owner = "client!tha", name = "l", descriptor = "Z")
    private boolean field6993 = false;

    @OriginalMember(owner = "client!tha", name = "f", descriptor = "Z")
    private boolean field6987;

    @OriginalMember(owner = "client!tha", name = "h", descriptor = "[Loh;")
    private class653[] field6989;

    @OriginalMember(owner = "client!tha", name = "g", descriptor = "[I")
    public static int[] field6988 = new int[2];

    @OriginalMember(owner = "client!tha", name = "i", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!tha", name = "j", descriptor = "I")
    public static int field6991;

    @OriginalMember(owner = "client!tha", name = "k", descriptor = "I")
    public static int field6992;

    @OriginalMember(owner = "client!tha", name = "m", descriptor = "I")
    public static int field6994;

    @OriginalMember(owner = "client!tha", name = "n", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!tha", name = "p", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!tha", name = "q", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!tha", name = "r", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!tha", name = "s", descriptor = "I")
    public static int field7000;

    @OriginalMember(owner = "client!tha", name = "t", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!tha", name = "u", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!tha", name = "v", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!tha", name = "w", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!tha", name = "o", descriptor = "Lbfa;")
    private class264 field6996;

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(IZI)V")
    public final void method1113(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method2976(42, 25, -114, 65, 18, (byte) 64, 6);
        }
        if (this.field6993) {
            super.field9753.method3321(1, -19587);
            super.field9753.method3384(this.field6989[arg0 + -1], (byte) 125);
            super.field9753.method3321(0, -19587);
        }
        ++field7003;
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(ZI)V")
    public final void method1118(boolean arg0, int arg1) {
        if (this.field6996 != null && arg0) {
            if (!this.field6987) {
                super.field9753.method3321(2, -19587);
                super.field9753.method3384(super.field9753.field8223, (byte) 77);
                super.field9753.method3321(0, -19587);
            }
            this.field6996.method1700('\u0000', arg1 + 7537);
            this.field6993 = true;
        } else {
            super.field9753.method3374(0, 770, 34168, arg1 ^ 3786);
        }
        ++field6992;
        if (arg1 != -3826) {
            method2975(77, (byte) 12, 37);
        }
    }

    @OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(Llea;)V")
    public class509(class573 arg0) {
        super(arg0);
        if (arg0.field8176) {
            this.field6987 = ~arg0.field8216 > -4;
            int var2 = !this.field6987 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 != -1) {
                            if (var14 == 1) {
                                var15 = var12;
                            } else if (var14 != 2) {
                                if (~var14 != -4) {
                                    if (var14 != 4) {
                                        var15 = -var11;
                                    } else {
                                        var15 = var11;
                                    }
                                } else {
                                    var15 = -var13;
                                }
                            } else {
                                var15 = var13;
                            }
                        } else {
                            var15 = -var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        } else {
                            var18 = 0;
                            var17 = 0;
                            var16 = 0;
                        }
                        var4[var14][var6] = (byte) var16;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var18;
                    }
                    ++var6;
                }
            }
            this.field6989 = new class653[3];
            this.field6989[0] = new class653(super.field9753, 6406, 64, false, var4, 6406);
            this.field6989[1] = new class653(super.field9753, 6406, 64, false, var5, 6406);
            this.field6989[2] = new class653(super.field9753, 6406, 64, false, var3, 6406);
            this.method2978(94);
        }
    }

    @OriginalMember(owner = "client!tha", name = "c", descriptor = "(I)V")
    public static void method2972(int arg0) {
        field6988 = null;
        if (arg0 <= 114) {
            method2977((class160) null, -43, false);
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(BIII)I")
    public static final int method2973(byte arg0, int arg1, int arg2, int arg3) {
        ++field7000;
        if (arg0 != 28) {
            method2975(-69, (byte) 93, -2);
        }
        int var4 = 255 - arg2;
        int var5 = ((arg1 & 16711935) * arg2 & -16711936 | (65280 & arg1) * arg2 & 16711680) >>> 8;
        return (((arg3 & 65280) * var4 & 16711680 | (arg3 & 16711935) * var4 & -16711936) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(FFIIIFIIFFLlt;)[B")
    public static final byte[] method2974(float arg0, float arg1, int arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, float arg9, class323 arg10) {
        ++field6998;
        byte[] var11 = new byte[arg6 * arg7 * arg3];
        class324.method1957(arg10, arg0, arg3, arg6, 256, arg1, arg5, arg8, arg2, var11, arg9, arg7, arg4);
        return var11;
    }

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "(I)Z")
    public final boolean method1112(int arg0) {
        if (arg0 >= -124) {
            field6988 = null;
        }
        ++field6995;
        return true;
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(IBI)B")
    public static final byte method2975(int arg0, byte arg1, int arg2) {
        ++field7001;
        if (arg1 < 85) {
            return -18;
        } else if (~arg0 != -10) {
            return 0;
        } else {
            return (byte) (~(arg2 & 1) == -1 ? 1 : 2);
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(B)V")
    public final void method1111(byte arg0) {
        ++field6990;
        if (arg0 != 114) {
            this.method1119(23, (class377) null, -2);
        }
        if (this.field6993) {
            if (!this.field6987) {
                super.field9753.method3321(2, arg0 + -19701);
                super.field9753.method3384((class377) null, (byte) 111);
            }
            super.field9753.method3321(1, -19587);
            super.field9753.method3384((class377) null, (byte) 105);
            super.field9753.method3321(0, arg0 ^ -19697);
            this.field6996.method1700('\u0001', 3711);
            this.field6993 = false;
        } else {
            super.field9753.method3374(0, 770, 5890, 72);
        }
        super.field9753.method3359(8448, 8448, true);
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(ILfga;I)V")
    public final void method1119(int arg0, class377 arg1, int arg2) {
        ++field6997;
        super.field9753.method3384(arg1, (byte) 71);
        if (arg0 < 48) {
            this.field6993 = false;
        }
        super.field9753.method3375(arg2, (byte) 102);
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method2976(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg5 != -31) {
            method2975(90, (byte) -98, -104);
        }
        if (~class420.field5820.field9448.method1367(17539) != -1 && ~arg4 != -1 && ~class57.field884 > -51 && ~arg3 != 0) {
            class278.field4014[class57.field884++] = new class420((byte) 1, arg3, arg4, arg0, arg2, arg1, arg6, (class745) null);
        }
        ++field6991;
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lufa;IZ)V")
    public static final void method2977(class160 arg0, int arg1, boolean arg2) {
        ++field7004;
        if (!arg0.field2485) {
            if (arg0.field2483 && arg0.field2479 >= 1 && arg0.field2488 >= 1 && ~(class192.field2891 + -2) <= ~arg0.field2479 && class456.field6225 + -2 >= arg0.field2488 && (~arg0.field2490 > -1 || class122.method1068(arg0.field2475, 12, arg0.field2490))) {
                if (!arg2) {
                    class381.method2298(arg0.field2479, arg0.field2484, arg0.field2477, arg0.field2489, -1, arg0.field2475, -6968, arg0.field2488, arg0.field2490);
                } else {
                    class60.method624(arg0.field2484, arg0.field2489, 23104, arg0.field2480, arg0.field2479, arg0.field2488);
                }
                arg0.field2483 = false;
                if (!arg2 && ~arg0.field2490 == ~arg0.field2487 && ~arg0.field2487 == 0) {
                    arg0.method4237(arg1 ^ -2);
                } else if (!arg2 && arg0.field2490 == arg0.field2487 && arg0.field2486 == arg0.field2477 && arg0.field2478 == arg0.field2475) {
                    arg0.method4237(-1);
                }
            }
        } else if (arg0.field2487 < 0 || class122.method1068(arg0.field2478, 12, arg0.field2487)) {
            if (!arg2) {
                class381.method2298(arg0.field2479, arg0.field2484, arg0.field2486, arg0.field2489, -1, arg0.field2478, -6968, arg0.field2488, arg0.field2487);
            } else {
                class60.method624(arg0.field2484, arg0.field2489, 23104, (class685) null, arg0.field2479, arg0.field2488);
            }
            arg0.method4237(arg1 ^ -2);
        }
        if (arg1 != 1) {
            method2975(-86, (byte) 33, -81);
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(ZB)V")
    public final void method1117(boolean arg0, byte arg1) {
        super.field9753.method3359(8448, 7681, true);
        ++field6994;
        if (arg1 != 57) {
            this.field6987 = true;
        }
    }

    @OriginalMember(owner = "client!tha", name = "d", descriptor = "(I)V")
    private final void method2978(int arg0) {
        this.field6996 = new class264(super.field9753, 2);
        ++field6999;
        this.field6996.method1704(0, -118);
        super.field9753.method3321(1, -19587);
        if (arg0 >= 68) {
            OpenGL.glTexGeni(8192, 9472, 34065);
            OpenGL.glTexGeni(8193, 9472, 34065);
            OpenGL.glTexGeni(8194, 9472, 34065);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            if (!this.field6987) {
                super.field9753.method3359(7681, 8448, true);
                super.field9753.method3351(768, 0, 34168, (byte) -85);
                super.field9753.method3321(2, -19587);
                super.field9753.method3359(260, 7681, true);
                super.field9753.method3351(768, 0, 34168, (byte) -85);
                super.field9753.method3351(770, 1, 34168, (byte) -85);
                super.field9753.method3374(0, 770, 34167, -111);
            } else {
                super.field9753.method3359(260, 7681, true);
                super.field9753.method3351(770, 0, 5890, (byte) -85);
                super.field9753.method3374(0, 770, 34167, -79);
            }
            super.field9753.method3321(0, -19587);
            this.field6996.method1701((byte) 103);
            this.field6996.method1704(1, -122);
            super.field9753.method3321(1, -19587);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            if (!this.field6987) {
                super.field9753.method3359(8448, 8448, true);
                super.field9753.method3351(768, 0, 5890, (byte) -85);
                super.field9753.method3321(2, -19587);
                super.field9753.method3359(8448, 8448, true);
                super.field9753.method3351(768, 0, 5890, (byte) -85);
                super.field9753.method3351(768, 1, 34168, (byte) -85);
                super.field9753.method3374(0, 770, 5890, -78);
            } else {
                super.field9753.method3359(8448, 8448, true);
                super.field9753.method3351(768, 0, 5890, (byte) -85);
                super.field9753.method3374(0, 770, 5890, -108);
            }
            super.field9753.method3321(0, -19587);
            this.field6996.method1701((byte) 73);
        }
    }
}
