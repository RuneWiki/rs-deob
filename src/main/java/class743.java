import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class743 extends class159 {

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "Z")
    private boolean field10220 = false;

    @OriginalMember(owner = "client!pu", name = "w", descriptor = "Z")
    private boolean field10233;

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "[Lifa;")
    private class413[] field10225;

    @OriginalMember(owner = "client!pu", name = "v", descriptor = "Lkq;")
    public static class345 field10232 = new class345();

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "I")
    public static int field10219;

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
    public static int field10221;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "I")
    public static int field10223;

    @OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
    public static int field10224;

    @OriginalMember(owner = "client!pu", name = "p", descriptor = "I")
    public static int field10226;

    @OriginalMember(owner = "client!pu", name = "q", descriptor = "I")
    public static int field10227;

    @OriginalMember(owner = "client!pu", name = "r", descriptor = "I")
    public static int field10228;

    @OriginalMember(owner = "client!pu", name = "s", descriptor = "I")
    public static int field10229;

    @OriginalMember(owner = "client!pu", name = "t", descriptor = "I")
    public static int field10230;

    @OriginalMember(owner = "client!pu", name = "u", descriptor = "I")
    public static int field10231;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "Lhq;")
    private class367 field10222;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZB)V", line = 5)
    public final void method373(boolean arg0, byte arg1) {
        ++field10224;
        if (arg1 < -109) {
            if (this.field10222 != null && arg0) {
                if (!this.field10233) {
                    super.field2221.method3738((byte) -63, 2);
                    super.field2221.method3681(super.field2221.field9082, 0);
                    super.field2221.method3738((byte) -63, 0);
                }
                this.field10222.method2315(true, '\u0000');
                this.field10220 = true;
            } else {
                super.field2221.method3715(34168, 770, 0, (byte) -72);
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZLda;Ljava/lang/String;Lej;Lha;B)V", line = 31)
    public static final void method4138(boolean arg0, class402 arg1, String arg2, class179 arg3, class548 arg4, byte arg5) {
        int var6 = 93 % (-arg5 / 42);
        ++field10223;
        boolean var7 = !class598.field8107 || class138.method914((byte) 77);
        if (var7) {
            if (class598.field8107 && var7) {
                class179 var8 = class693.field9628;
                class402 var9 = arg4.method1392(var8, class413.field5860, true);
                int var10 = var8.method1134((class298[]) null, arg2, 1839, 250);
                int var11 = var8.method1132(250, var8.field2458, arg2, 6379, (class298[]) null);
                int var12 = class304.field4296.field767;
                int var13 = var12 - -4;
                int var14 = var13 * 2 + var10;
                int var15 = var13 * 2 + var11;
                if (class618.field8299 > var15) {
                    var15 = class618.field8299;
                }
                if (~class752.field10360 < ~var14) {
                    var14 = class752.field10360;
                }
                int var16 = class170.field2360.method3281(false, class732.field10164, var14) - -class177.field2419;
                int var17 = class45.field559.method779(var15, class84.field1195, 14) - -class699.field9760;
                if (class222.field3009) {
                    var16 += class580.method3374(24188);
                    var17 += class721.method4038(true);
                }
                arg4.method1496(class320.field4453, false).method1965(var16 - -class419.field5907.field767, class419.field5907.field766 + var17, -(class419.field5907.field767 * 2) + var14, -(class419.field5907.field766 * 2) + var15, 1, 0, 0);
                arg4.method1496(class419.field5907, true).method1970(var16, var17);
                class419.field5907.method375();
                arg4.method1496(class419.field5907, true).method1970(var14 + var16 + -var12, var17);
                class419.field5907.method378();
                arg4.method1496(class419.field5907, true).method1970(-var12 + var16 - -var14, var17 - -var15 + -var12);
                class419.field5907.method375();
                arg4.method1496(class419.field5907, true).method1970(var16, var15 + var17 + -var12);
                class419.field5907.method378();
                arg4.method1496(class304.field4296, true).method1964(var16, var17 - -class419.field5907.field766, var12, -(class419.field5907.field766 * 2) + var15);
                class304.field4296.method386();
                arg4.method1496(class304.field4296, true).method1964(class419.field5907.field767 + var16, var17, var14 - class419.field5907.field767 * 2, var12);
                class304.field4296.method386();
                arg4.method1496(class304.field4296, true).method1964(var14 - var12 + var16, class419.field5907.field766 + var17, var12, var15 - class419.field5907.field766 * 2);
                class304.field4296.method386();
                arg4.method1496(class304.field4296, true).method1964(class419.field5907.field767 + var16, -var12 + var15 + var17, -(class419.field5907.field767 * 2) + var14, var12);
                class304.field4296.method386();
                var9.method2503(1, 1, 0, -16777216 | class702.field9792, (int[]) null, -(var13 * 2) + var15, (class573) null, var16 - -var13, arg2, 0, 0, var14 - var13 * 2, (class298[]) null, -1, var13 + var17, 0);
                class282.method1882((byte) 34, var15, var17, var14, var16);
            } else {
                int var18 = arg3.method1134((class298[]) null, arg2, 1839, 250);
                int var19 = 13 * arg3.method1136(-257, arg2, 250, (class298[]) null);
                byte var20 = 4;
                int var21 = var20 + 6;
                int var22 = 6 - -var20;
                arg4.method1412(-var20 + var21, var22 - var20, var18 + var20 + var20, var19 + var20 + var20, -16777216, 0);
                arg4.method1534(var21 - var20, var22 - var20, var18 - -var20 + var20, var20 + var20 + var19, -1, 0);
                arg1.method2503(1, 1, 0, -1, (int[]) null, var19, (class573) null, var21, arg2, 0, 0, var18, (class298[]) null, -1, var22, 0);
                class282.method1882((byte) 34, var19 + var20 + var20, var22 - var20, var18 + var20 + var20, var21 - var20);
            }
            if (arg0) {
                try {
                    if (!class222.field3009) {
                        arg4.method3253((byte) -3);
                    } else {
                        class441.method2703(true);
                    }
                } catch (class692 var23) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "(B)V", line = 128)
    public static void method4139(byte arg0) {
        field10232 = null;
        if (arg0 != 96) {
            field10232 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lwu;II)V", line = 138)
    public final void method368(class559 arg0, int arg1, int arg2) {
        if (arg1 != 26264) {
            method4138(false, (class402) null, (String) null, (class179) null, (class548) null, (byte) -75);
        }
        super.field2221.method3681(arg0, 0);
        ++field10227;
        super.field2221.method3720(-26014, arg2);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(BZ)V", line = 150)
    public final void method370(byte arg0, boolean arg1) {
        super.field2221.method3729((byte) 95, 8448, 7681);
        ++field10231;
        if (arg0 < 88) {
            this.field10233 = false;
        }
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Ldw;)V", line = 205)
    public class743(class664 arg0) {
        super(arg0);
        if (arg0.field9127) {
            this.field10233 = ~arg0.field9134 > -4;
            int var2 = this.field10233 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (~var14 != -2) {
                                if (var14 != 2) {
                                    if (var14 != 3) {
                                        if (var14 == 4) {
                                            var15 = var11;
                                        } else {
                                            var15 = -var11;
                                        }
                                    } else {
                                        var15 = -var12;
                                    }
                                } else {
                                    var15 = var12;
                                }
                            } else {
                                var15 = var13;
                            }
                        } else {
                            var15 = -var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
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
            this.field10225 = new class413[3];
            this.field10225[0] = new class413(super.field2221, 6406, 64, false, var4, 6406);
            this.field10225[1] = new class413(super.field2221, 6406, 64, false, var5, 6406);
            this.field10225[2] = new class413(super.field2221, 6406, 64, false, var3, 6406);
            this.method4141((byte) -108);
        }
    }

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "(B)V", line = 164)
    public static final void method4140(byte arg0) {
        ++field10221;
        if (class186.field2534 != null) {
            try {
                class186.field2534.close();
            } catch (IOException var1) {
            }
        }
        if (arg0 >= -97) {
            field10232 = null;
        }
        class186.field2534 = null;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZII)V", line = 187)
    public final void method367(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            ++field10229;
            if (this.field10220) {
                super.field2221.method3738((byte) -63, 1);
                super.field2221.method3681(this.field10225[arg1 + -1], 0);
                super.field2221.method3738((byte) -63, 0);
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Z)Z", line = 316)
    public final boolean method372(boolean arg0) {
        ++field10226;
        return !arg0 ? true : true;
    }

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "(B)V", line = 328)
    private final void method4141(byte arg0) {
        this.field10222 = new class367(super.field2221, 2);
        ++field10230;
        this.field10222.method2311(true, 0);
        super.field2221.method3738((byte) -63, 1);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        if (arg0 > -56) {
            this.field10220 = false;
        }
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (this.field10233) {
            super.field2221.method3729((byte) 95, 260, 7681);
            super.field2221.method3718(5890, 100, 770, 0);
            super.field2221.method3715(34167, 770, 0, (byte) -90);
        } else {
            super.field2221.method3729((byte) 95, 7681, 8448);
            super.field2221.method3718(34168, 101, 768, 0);
            super.field2221.method3738((byte) -63, 2);
            super.field2221.method3729((byte) 95, 260, 7681);
            super.field2221.method3718(34168, 117, 768, 0);
            super.field2221.method3718(34168, 123, 770, 1);
            super.field2221.method3715(34167, 770, 0, (byte) -71);
        }
        super.field2221.method3738((byte) -63, 0);
        this.field10222.method2314((byte) -118);
        this.field10222.method2311(true, 1);
        super.field2221.method3738((byte) -63, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field10233) {
            super.field2221.method3729((byte) 95, 8448, 8448);
            super.field2221.method3718(5890, 100, 768, 0);
            super.field2221.method3715(5890, 770, 0, (byte) -62);
        } else {
            super.field2221.method3729((byte) 95, 8448, 8448);
            super.field2221.method3718(5890, 108, 768, 0);
            super.field2221.method3738((byte) -63, 2);
            super.field2221.method3729((byte) 95, 8448, 8448);
            super.field2221.method3718(5890, 125, 768, 0);
            super.field2221.method3718(34168, 102, 768, 1);
            super.field2221.method3715(5890, 770, 0, (byte) -55);
        }
        super.field2221.method3738((byte) -63, 0);
        this.field10222.method2314((byte) -98);
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V", line = 399)
    public final void method369(byte arg0) {
        ++field10219;
        if (this.field10220) {
            if (!this.field10233) {
                super.field2221.method3738((byte) -63, 2);
                super.field2221.method3681((class559) null, 0);
            }
            super.field2221.method3738((byte) -63, 1);
            super.field2221.method3681((class559) null, 0);
            super.field2221.method3738((byte) -63, 0);
            this.field10222.method2315(true, '\u0001');
            this.field10220 = false;
        } else {
            super.field2221.method3715(5890, 770, 0, (byte) -95);
        }
        if (arg0 >= -59) {
            this.field10233 = false;
        }
        super.field2221.method3729((byte) 95, 8448, 8448);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIILiha;II)Z", line = 429)
    public static final boolean method4142(int arg0, int arg1, int arg2, int arg3, class613 arg4, int arg5, int arg6) {
        ++field10228;
        if (class762.field10630 && class280.field4072) {
            if (class527.field7314 < 100) {
                return false;
            } else if (~arg0 == ~arg3 && arg1 == arg5) {
                if (!class409.method2565(arg5, arg2, arg3, arg6 + -16443)) {
                    return false;
                } else if (class330.method2117(arg6 ^ 16441, arg4)) {
                    ++class78.field1129;
                    return true;
                } else {
                    return false;
                }
            } else {
                for (int var7 = arg3; var7 <= arg0; ++var7) {
                    for (int var8 = arg5; arg1 >= var8; ++var8) {
                        if (~class316.field4387[arg2][var7][var8] == ~(-class463.field6452)) {
                            return false;
                        }
                    }
                }
                if (arg6 != 16443) {
                    method4139((byte) 21);
                }
                if (!class330.method2117(2, arg4)) {
                    return false;
                } else {
                    ++class78.field1129;
                    return true;
                }
            }
        } else {
            return false;
        }
    }
}
