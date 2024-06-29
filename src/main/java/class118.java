import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class118 extends class125 {

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "Z")
    private boolean field1551 = false;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "Z")
    private boolean field1547;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "[Lsa;")
    private class139[] field1553;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "Lao;")
    public static class191 field1539 = new class191(108, 0);

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "J")
    public static long field1548 = 0L;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "[F")
    public static float[] field1544 = new float[16];

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    public static int field1550 = 1;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "Lpb;")
    private class468 field1536;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(ZI)V")
    public final void method665(boolean arg0, int arg1) {
        super.field1617.method2269(8448, 8960, 7681);
        ++field1541;
        if (arg1 < 92) {
            field1544 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILhe;I)V")
    public final void method669(int arg0, class252 arg1, int arg2) {
        ++field1540;
        super.field1617.method2236(arg1, arg0 + 30);
        super.field1617.method2260(16640, arg2);
        if (arg0 != 67) {
            method709(true, -76, (byte) -72, (String) null);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)V")
    public final void method662(int arg0, int arg1, int arg2) {
        if (this.field1551) {
            super.field1617.method2250((byte) 97, 1);
            super.field1617.method2236(this.field1553[arg2 - 1], -86);
            super.field1617.method2250((byte) 70, 0);
        }
        ++field1549;
        if (arg0 > -35) {
            field1548 = 4L;
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lur;)V")
    public class118(class377 arg0) {
        super(arg0);
        if (arg0.field5430) {
            this.field1547 = ~arg0.field5410 > -4;
            int var2 = !this.field1547 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var12;
                        } else if (var14 != 1) {
                            if (var14 == 2) {
                                var15 = var13;
                            } else if (var14 != 3) {
                                if (~var14 != -5) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = -var13;
                            }
                        } else {
                            var15 = var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var18 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
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
            this.field1553 = new class139[3];
            this.field1553[0] = new class139(super.field1617, 6406, 64, false, var4, 6406);
            this.field1553[1] = new class139(super.field1617, 6406, 64, false, var5, 6406);
            this.field1553[2] = new class139(super.field1617, 6406, 64, false, var3, 6406);
            this.method707((byte) 112);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)V")
    public final void method668(boolean arg0, int arg1) {
        ++field1542;
        if (this.field1536 != null && arg0) {
            if (!this.field1547) {
                super.field1617.method2250((byte) 90, 2);
                super.field1617.method2236(super.field1617.field5428, -37);
                super.field1617.method2250((byte) 124, 0);
            }
            this.field1536.method2856('\u0000', arg1 + 1);
            this.field1551 = true;
        } else {
            super.field1617.method2277((byte) -114, 770, 0, 34168);
        }
        if (arg1 != 0) {
            field1550 = 82;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public final void method667(int arg0) {
        if (arg0 != -18112) {
            this.method665(true, 19);
        }
        ++field1552;
        if (this.field1551) {
            if (!this.field1547) {
                super.field1617.method2250((byte) 66, 2);
                super.field1617.method2236((class252) null, 117);
            }
            super.field1617.method2250((byte) 125, 1);
            super.field1617.method2236((class252) null, arg0 + 18111);
            super.field1617.method2250((byte) 105, 0);
            this.field1536.method2856('\u0001', arg0 + 18113);
            this.field1551 = false;
        } else {
            super.field1617.method2277((byte) -116, 770, 0, 5890);
        }
        super.field1617.method2269(8448, arg0 ^ -26048, 8448);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)V")
    public static final void method705(byte arg0, int arg1) {
        ++field1538;
        int var2 = 123 / ((arg0 - 23) / 53);
        class184 var3 = class277.method1682(arg1, 5, -108);
        var3.method1075((byte) -76);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static void method706(byte arg0) {
        field1544 = null;
        field1539 = null;
        int var1 = 53 % ((arg0 - 33) / 53);
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V")
    private final void method707(byte arg0) {
        this.field1536 = new class468(super.field1617, 2);
        ++field1545;
        this.field1536.method2854(-89, 0);
        super.field1617.method2250((byte) 121, 1);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        int var2 = -97 / ((-29 - arg0) / 57);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (!this.field1547) {
            super.field1617.method2269(7681, 8960, 8448);
            super.field1617.method2229(34168, (byte) -18, 0, 768);
            super.field1617.method2250((byte) 102, 2);
            super.field1617.method2269(260, 8960, 7681);
            super.field1617.method2229(34168, (byte) -18, 0, 768);
            super.field1617.method2229(34168, (byte) -18, 1, 770);
            super.field1617.method2277((byte) 93, 770, 0, 34167);
        } else {
            super.field1617.method2269(260, 8960, 7681);
            super.field1617.method2229(5890, (byte) -18, 0, 770);
            super.field1617.method2277((byte) 82, 770, 0, 34167);
        }
        super.field1617.method2250((byte) 70, 0);
        this.field1536.method2855(22228);
        this.field1536.method2854(-79, 1);
        super.field1617.method2250((byte) 105, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field1547) {
            super.field1617.method2269(8448, 8960, 8448);
            super.field1617.method2229(5890, (byte) -18, 0, 768);
            super.field1617.method2277((byte) -7, 770, 0, 5890);
        } else {
            super.field1617.method2269(8448, 8960, 8448);
            super.field1617.method2229(5890, (byte) -18, 0, 768);
            super.field1617.method2250((byte) 82, 2);
            super.field1617.method2269(8448, 8960, 8448);
            super.field1617.method2229(5890, (byte) -18, 0, 768);
            super.field1617.method2229(34168, (byte) -18, 1, 768);
            super.field1617.method2277((byte) -110, 770, 0, 5890);
        }
        super.field1617.method2250((byte) 71, 0);
        this.field1536.method2855(22228);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZB)I")
    public static final int method708(int arg0, boolean arg1, byte arg2) {
        ++field1546;
        if (arg1) {
            return 0;
        } else {
            class327 var3 = class457.method2813(arg0, arg1, -64);
            int var4 = 99 / ((arg2 - 46) / 39);
            if (var3 == null) {
                return class263.field3536.method1054(0, arg0).field1017;
            } else {
                int var5 = 0;
                for (int var6 = 0; var3.field4350.length > var6; ++var6) {
                    if (var3.field4350[var6] == -1) {
                        ++var5;
                    }
                }
                return var5 + class263.field3536.method1054(0, arg0).field1017 + -var3.field4350.length;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)Z")
    public final boolean method666(int arg0) {
        int var2 = -82 % ((11 - arg0) / 63);
        ++field1537;
        return true;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZIBLjava/lang/String;)I")
    public static final int method709(boolean arg0, int arg1, byte arg2, String arg3) {
        ++field1543;
        if (arg1 >= 2 && arg1 <= 36) {
            boolean var4 = false;
            boolean var5 = false;
            if (arg2 != 46) {
                method709(false, 81, (byte) 8, (String) null);
            }
            int var6 = 0;
            int var7 = arg3.length();
            for (int var8 = 0; ~var7 < ~var8; ++var8) {
                char var9 = arg3.charAt(var8);
                if (~var8 == -1) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }
                    if (~var9 == -44 && arg0) {
                        continue;
                    }
                }
                int var11;
                if (~var9 <= -49 && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else {
                    if (~var9 > -98 || ~var9 < -123) {
                        throw new NumberFormatException();
                    }
                    var11 = var9 - 'W';
                }
                if (~arg1 >= ~var11) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg1 * var6 + var11;
                if (var10 / arg1 != var6) {
                    throw new NumberFormatException();
                }
                var6 = var10;
                var5 = true;
            }
            if (!var5) {
                throw new NumberFormatException();
            } else {
                return var6;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
    }
}
