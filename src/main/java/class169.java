import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class169 extends class246 {

    @OriginalMember(owner = "client!ju", name = "t", descriptor = "Z")
    private boolean field2582 = false;

    @OriginalMember(owner = "client!ju", name = "l", descriptor = "Z")
    private boolean field2574;

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "[Lgi;")
    private class490[] field2572;

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "[I")
    public static int[] field2570 = new int[2048];

    @OriginalMember(owner = "client!ju", name = "m", descriptor = "[F")
    public static float[] field2575 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!ju", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field2579 = new String[100];

    @OriginalMember(owner = "client!ju", name = "k", descriptor = "Z")
    public static volatile boolean field2573 = false;

    @OriginalMember(owner = "client!ju", name = "r", descriptor = "Lsn;")
    public static class205 field2580 = new class205(14, 2);

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!ju", name = "n", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!ju", name = "p", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!ju", name = "s", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!ju", name = "u", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!ju", name = "v", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!ju", name = "w", descriptor = "Llo;")
    private class365 field2585;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)V", line = 3)
    private final void method1165(int arg0) {
        ++field2583;
        if (arg0 == 3882) {
            this.field2585 = new class365(super.field3361, 2);
            this.field2585.method2185(-32, 0);
            super.field3361.method1990(false, 1);
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
            if (!this.field2574) {
                super.field3361.method2023(7681, 8448, arg0 + -953);
                super.field3361.method2040(false, 0, 768, 34168);
                super.field3361.method1990(false, 2);
                super.field3361.method2023(260, 7681, 2929);
                super.field3361.method2040(false, 0, 768, 34168);
                super.field3361.method2040(false, 1, 770, 34168);
                super.field3361.method1994(0, 770, 34167, 8960);
            } else {
                super.field3361.method2023(260, 7681, arg0 ^ 1115);
                super.field3361.method2040(false, 0, 770, 5890);
                super.field3361.method1994(0, 770, 34167, 8960);
            }
            super.field3361.method1990(false, 0);
            this.field2585.method2186((byte) -105);
            this.field2585.method2185(-64, 1);
            super.field3361.method1990(false, 1);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            if (this.field2574) {
                super.field3361.method2023(8448, 8448, 2929);
                super.field3361.method2040(false, 0, 768, 5890);
                super.field3361.method1994(0, 770, 5890, 8960);
            } else {
                super.field3361.method2023(8448, 8448, 2929);
                super.field3361.method2040(false, 0, 768, 5890);
                super.field3361.method1990(false, 2);
                super.field3361.method2023(8448, 8448, 2929);
                super.field3361.method2040(false, 0, 768, 5890);
                super.field3361.method2040(false, 1, 768, 34168);
                super.field3361.method1994(0, 770, 5890, 8960);
            }
            super.field3361.method1990(false, 0);
            this.field2585.method2186((byte) -115);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IB)V", line = 75)
    public static final void method1166(int arg0, byte arg1) {
        ++field2576;
        if (class398.field5712 == null) {
            class398.field5712 = new byte[4][class9.field111][class192.field2809];
        }
        if (arg0 != -11323) {
            method1167(-110);
        }
        for (int var2 = 0; var2 < 4; ++var2) {
            for (int var3 = 0; ~var3 > ~class9.field111; ++var3) {
                for (int var4 = 0; class192.field2809 > var4; ++var4) {
                    class398.field5712[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZB)V", line = 112)
    public final void method743(boolean arg0, byte arg1) {
        if (arg1 > 83) {
            ++field2571;
            if (this.field2585 != null && arg0) {
                if (!this.field2574) {
                    super.field3361.method1990(false, 2);
                    super.field3361.method1977(super.field3361.field4855, true);
                    super.field3361.method1990(false, 0);
                }
                this.field2585.method2183((byte) -41, '\u0000');
                this.field2582 = true;
            } else {
                super.field3361.method1994(0, 770, 34168, 8960);
            }
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILfg;I)V", line = 142)
    public final void method742(int arg0, class128 arg1, int arg2) {
        super.field3361.method1977(arg1, true);
        if (arg0 != 4) {
            this.field2572 = null;
        }
        ++field2581;
        super.field3361.method1966(-1, arg2);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(BII)V", line = 154)
    public final void method744(byte arg0, int arg1, int arg2) {
        if (this.field2582) {
            super.field3361.method1990(false, 1);
            super.field3361.method1977(this.field2572[arg1 + -1], true);
            super.field3361.method1990(false, 0);
        }
        if (arg0 != 53) {
            method1168((class209) null, 90, false, 84);
        }
        ++field2584;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)Z", line = 173)
    public final boolean method738(byte arg0) {
        ++field2577;
        if (arg0 < 99) {
            this.field2582 = false;
        }
        return true;
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lpg;)V", line = 185)
    public class169(class333 arg0) {
        super(arg0);
        if (arg0.field4805) {
            this.field2574 = arg0.field4826 < 3;
            int var2 = this.field2574 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var13;
                        } else if (var14 != 1) {
                            if (var14 == 2) {
                                var15 = var12;
                            } else if (~var14 == -4) {
                                var15 = -var12;
                            } else if (~var14 == -5) {
                                var15 = var11;
                            } else {
                                var15 = -var11;
                            }
                        } else {
                            var15 = var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        }
                        var4[var14][var6] = (byte) var18;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var16;
                    }
                    ++var6;
                }
            }
            this.field2572 = new class490[3];
            this.field2572[0] = new class490(super.field3361, 6406, 64, false, var4, 6406);
            this.field2572[1] = new class490(super.field3361, 6406, 64, false, var5, 6406);
            this.field2572[2] = new class490(super.field3361, 6406, 64, false, var3, 6406);
            this.method1165(3882);
        }
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(I)V", line = 300)
    public static void method1167(int arg0) {
        field2579 = null;
        field2575 = null;
        field2570 = null;
        if (arg0 != 15639) {
            method1168((class209) null, -39, false, -15);
        }
        field2580 = null;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Ljm;IZI)V", line = 314)
    public static final void method1168(class209 arg0, int arg1, boolean arg2, int arg3) {
        if (~arg0.field166 == ~arg3 && ~arg3 != 0) {
            class55 var4 = class50.field716.method831(arg3, (byte) 54);
            int var5 = var4.field792;
            if (~var5 == -2) {
                arg0.field206 = 0;
                arg0.field212 = 1;
                arg0.field194 = 0;
                arg0.field191 = 0;
                arg0.field226 = arg1;
                class196.method1286(var4, arg0.field6287, false, (byte) 1, arg0.field6279, arg0.field6284, arg0.field194);
            }
            if (~var5 == -3) {
                arg0.field206 = 0;
            }
        } else if (arg3 == -1 || arg0.field166 == -1 || class50.field716.method831(arg3, (byte) 54).field784 >= class50.field716.method831(arg0.field166, (byte) 54).field784) {
            arg0.field166 = arg3;
            arg0.field194 = 0;
            arg0.field191 = 0;
            arg0.field206 = 0;
            arg0.field264 = arg0.field265;
            arg0.field212 = 1;
            arg0.field226 = arg1;
            if (arg0.field166 != -1) {
                class196.method1286(class50.field716.method831(arg0.field166, (byte) 54), arg0.field6287, false, (byte) 1, arg0.field6279, arg0.field6284, arg0.field194);
            }
        }
        ++field2568;
        if (!arg2) {
            field2579 = null;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZI)V", line = 373)
    public final void method740(boolean arg0, int arg1) {
        if (arg1 != 26715) {
            this.method739(-16);
        }
        super.field3361.method2023(8448, 7681, 2929);
        ++field2578;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V", line = 387)
    public final void method739(int arg0) {
        ++field2569;
        int var2 = 31 / ((arg0 - -80) / 32);
        if (!this.field2582) {
            super.field3361.method1994(0, 770, 5890, 8960);
        } else {
            if (!this.field2574) {
                super.field3361.method1990(false, 2);
                super.field3361.method1977((class128) null, true);
            }
            super.field3361.method1990(false, 1);
            super.field3361.method1977((class128) null, true);
            super.field3361.method1990(false, 0);
            this.field2585.method2183((byte) -41, '\u0001');
            this.field2582 = false;
        }
        super.field3361.method2023(8448, 8448, 2929);
    }
}
