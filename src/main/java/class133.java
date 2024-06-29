import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class133 extends class190 {

    @OriginalMember(owner = "client!lca", name = "m", descriptor = "Z")
    private boolean field2140 = false;

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "Z")
    private boolean field2134;

    @OriginalMember(owner = "client!lca", name = "o", descriptor = "[Loj;")
    private class498[] field2142;

    @OriginalMember(owner = "client!lca", name = "v", descriptor = "I")
    public static int field2149 = 10;

    @OriginalMember(owner = "client!lca", name = "p", descriptor = "Lpp;")
    public static class464 field2143 = new class464(51, 4);

    @OriginalMember(owner = "client!lca", name = "w", descriptor = "Lne;")
    public static class175 field2150 = new class175();

    @OriginalMember(owner = "client!lca", name = "y", descriptor = "I")
    public static int field2152 = 0;

    @OriginalMember(owner = "client!lca", name = "z", descriptor = "Lnn;")
    public static class214 field2153 = new class214(8, 4);

    @OriginalMember(owner = "client!lca", name = "A", descriptor = "I")
    public static int field2154 = -2;

    @OriginalMember(owner = "client!lca", name = "x", descriptor = "B")
    public static byte field2151;

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!lca", name = "i", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!lca", name = "j", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!lca", name = "k", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!lca", name = "l", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!lca", name = "n", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!lca", name = "r", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!lca", name = "s", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!lca", name = "t", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!lca", name = "u", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!lca", name = "q", descriptor = "Lab;")
    private class290 field2144;

    @OriginalMember(owner = "client!lca", name = "B", descriptor = "Lbea;")
    public static class644 field2155;

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(B)V")
    public static void method1025(byte arg0) {
        if (arg0 != -4) {
            method1026(-100, 48, 8);
        }
        field2150 = null;
        field2143 = null;
        field2153 = null;
        field2155 = null;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILaba;I)V")
    public final void method927(int arg0, class222 arg1, int arg2) {
        ++field2146;
        super.field2722.method648(-106, arg1);
        super.field2722.method634(-27, arg0);
        if (arg2 != 20731) {
            this.method921(true, 53);
        }
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(III)V")
    public static final void method1026(int arg0, int arg1, int arg2) {
        ++field2138;
        if (arg2 == 12137) {
            class21 var3 = class601.method3413(arg0, 7, (byte) 124);
            var3.method230(18340);
            var3.field308 = arg1;
        }
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Ljj;)V")
    public class133(class66 arg0) {
        super(arg0);
        if (arg0.field1185) {
            this.field2134 = ~arg0.field1227 > -4;
            int var2 = this.field2134 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var13;
                        } else if (var14 != 1) {
                            if (~var14 != -3) {
                                if (~var14 == -4) {
                                    var15 = -var12;
                                } else if (var14 != 4) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = var12;
                            }
                        } else {
                            var15 = var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
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
            this.field2142 = new class498[3];
            this.field2142[0] = new class498(super.field2722, 6406, 64, false, var4, 6406);
            this.field2142[1] = new class498(super.field2722, 6406, 64, false, var5, 6406);
            this.field2142[2] = new class498(super.field2722, 6406, 64, false, var3, 6406);
            this.method1028(6406);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lbda;Z)I")
    public static final int method1027(class400 arg0, boolean arg1) {
        ++field2137;
        int var2 = arg0.field5964;
        if (arg1) {
            field2152 = 107;
        }
        class298 var3 = arg0.method772(0);
        if (arg0.field1489) {
            var2 = arg0.field5957;
        } else if (arg0.field1531 != var3.field4275 && ~arg0.field1531 != ~var3.field4301 && ~arg0.field1531 != ~var3.field4297 && ~arg0.field1531 != ~var3.field4305) {
            if (arg0.field1531 == var3.field4310 || ~arg0.field1531 == ~var3.field4283 || ~arg0.field1531 == ~var3.field4300 || ~arg0.field1531 == ~var3.field4282) {
                var2 = arg0.field5972;
            }
        } else {
            var2 = arg0.field5966;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)Z")
    public final boolean method928(int arg0) {
        int var2 = 112 % ((-7 - arg0) / 57);
        ++field2147;
        return true;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ZI)V")
    public final void method921(boolean arg0, int arg1) {
        ++field2145;
        if (arg1 != 25747) {
            method1025((byte) -43);
        }
        super.field2722.method656(-12645, 7681, 8448);
    }

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "(I)V")
    private final void method1028(int arg0) {
        ++field2141;
        this.field2144 = new class290(super.field2722, 2);
        this.field2144.method1833((byte) 125, 0);
        super.field2722.method654(false, 1);
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
        if (this.field2134) {
            super.field2722.method656(arg0 + -19051, 7681, 260);
            super.field2722.method607(5890, 0, 770, arg0 ^ 6426);
            super.field2722.method643(770, 0, -31364, 34167);
        } else {
            super.field2722.method656(-12645, 8448, 7681);
            super.field2722.method607(34168, 0, 768, arg0 ^ -6516);
            super.field2722.method654(false, 2);
            super.field2722.method656(-12645, 7681, 260);
            super.field2722.method607(34168, 0, 768, arg0 ^ -6505);
            super.field2722.method607(34168, 1, 770, 62);
            super.field2722.method643(770, 0, -31364, 34167);
        }
        super.field2722.method654(false, 0);
        this.field2144.method1838(0);
        this.field2144.method1833((byte) 88, 1);
        super.field2722.method654(false, 1);
        OpenGL.glDisable(3168);
        if (arg0 != 6406) {
            this.method927(116, (class222) null, 60);
        }
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field2134) {
            super.field2722.method656(arg0 + -19051, 8448, 8448);
            super.field2722.method607(5890, 0, 768, 30);
            super.field2722.method654(false, 2);
            super.field2722.method656(arg0 + -19051, 8448, 8448);
            super.field2722.method607(5890, 0, 768, 39);
            super.field2722.method607(34168, 1, 768, 90);
            super.field2722.method643(770, 0, -31364, 5890);
        } else {
            super.field2722.method656(-12645, 8448, 8448);
            super.field2722.method607(5890, 0, 768, 42);
            super.field2722.method643(770, 0, arg0 ^ -25478, 5890);
        }
        super.field2722.method654(false, 0);
        this.field2144.method1838(arg0 + -6406);
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ZB)V")
    public final void method919(boolean arg0, byte arg1) {
        ++field2135;
        int var3 = -46 % ((arg1 - -55) / 47);
        if (this.field2144 != null && arg0) {
            if (!this.field2134) {
                super.field2722.method654(false, 2);
                super.field2722.method648(80, super.field2722.field1168);
                super.field2722.method654(false, 0);
            }
            this.field2144.method1835((byte) -99, '\u0000');
            this.field2140 = true;
        } else {
            super.field2722.method643(770, 0, -31364, 34168);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)V")
    public final void method926(byte arg0) {
        ++field2148;
        if (!this.field2140) {
            super.field2722.method643(770, 0, -31364, 5890);
        } else {
            if (!this.field2134) {
                super.field2722.method654(false, 2);
                super.field2722.method648(-44, (class222) null);
            }
            super.field2722.method654(false, 1);
            super.field2722.method648(-15, (class222) null);
            super.field2722.method654(false, 0);
            this.field2144.method1835((byte) 108, '\u0001');
            this.field2140 = false;
        }
        if (arg0 >= -102) {
            method1027((class400) null, true);
        }
        super.field2722.method656(-12645, 8448, 8448);
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(III)V")
    public final void method925(int arg0, int arg1, int arg2) {
        if (this.field2140) {
            super.field2722.method654(false, 1);
            super.field2722.method648(-26, this.field2142[arg0 + -1]);
            super.field2722.method654(false, 0);
        }
        if (arg1 != 0) {
            method1026(31, -117, 67);
        }
        ++field2139;
    }
}
