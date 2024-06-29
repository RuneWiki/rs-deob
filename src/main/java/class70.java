import jaggl.OpenGL;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class70 extends class337 {

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "Lpda;")
    private class535 field672;

    @OriginalMember(owner = "client!gv", name = "v", descriptor = "Lsh;")
    private class60 field682;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!gv", name = "n", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!gv", name = "o", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!gv", name = "p", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!gv", name = "r", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!gv", name = "s", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!gv", name = "t", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!gv", name = "u", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!gv", name = "w", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!gv", name = "q", descriptor = "Lam;")
    private class538 field677;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIII)V")
    public static final void method383(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class523.field7333 != null) {
            class523.field7333[arg0][arg1] = -16777216 | arg2;
        }
        if (class597.field8645 != null) {
            class597.field8645[arg0][arg1] = (short) arg3;
        }
        if (class640.field9217 != null) {
            class640.field9217[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IBLuu;)V")
    public final void method253(int arg0, byte arg1, class238 arg2) {
        ++field678;
        if (arg1 != 93) {
            this.method252((byte) 103, false);
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(II)Z")
    public static final boolean method384(int arg0, int arg1) {
        ++field671;
        if (arg1 != 0) {
            method383(97, 92, 89, 0, -95);
        }
        return ~arg0 == -3 || ~arg0 == -4 || arg0 == 4 || arg0 == 5;
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)Z")
    public final boolean method257(byte arg0) {
        if (arg0 < 115) {
            this.method387(127);
        }
        ++field674;
        return true;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(III)Z")
    public static final boolean method385(int arg0, int arg1, int arg2) {
        ++field673;
        if (!class473.field6634) {
            return false;
        } else {
            if (arg1 != 8448) {
                field676 = -119;
            }
            int var3 = arg2 >> 16;
            int var4 = arg2 & 65535;
            if (class459.field6326[var3] != null && class459.field6326[var3][var4] != null) {
                class509 var5 = class459.field6326[var3][var4];
                if (~arg0 == 0 && var5.field7197 == 0) {
                    for (class99 var6 = (class99) class89.field1096.method1050((byte) 73); var6 != null; var6 = (class99) class89.field1096.method1047(arg1 ^ -15898)) {
                        if (~var6.field1227 == -49 || var6.field1227 == 1009 || var6.field1227 == 47 || var6.field1227 == 20 || ~var6.field1227 == -31) {
                            for (class509 var7 = class61.method348(var6.field1237, true); var7 != null; var7 = class285.method1606(true, var7)) {
                                if (~var5.field7045 == ~var7.field7045) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    for (class99 var8 = (class99) class89.field1096.method1050((byte) 73); var8 != null; var8 = (class99) class89.field1096.method1047(-7962)) {
                        if (var8.field1222 == arg0 && ~var5.field7045 == ~var8.field1237 && (~var8.field1227 == -49 || ~var8.field1227 == -1010 || var8.field1227 == 47 || ~var8.field1227 == -21 || ~var8.field1227 == -31)) {
                            return true;
                        }
                    }
                }
                return false;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(BII)Z")
    public static final boolean method386(byte arg0, int arg1, int arg2) {
        if (arg0 != 52) {
            method386((byte) 20, -46, -2);
        }
        ++field669;
        return ~(arg1 & 2048) != -1;
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V")
    private final void method387(int arg0) {
        this.field677 = new class538(super.field4382, 2);
        ++field675;
        this.field677.method3139(0, 0);
        super.field4382.method3078(33984, 1);
        super.field4382.method3099(260, 7681, 8);
        super.field4382.method3126(false, 0, 768, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field4382.method3078(33984, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field672.field7507) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field677.method3144(-115);
        this.field677.method3139(1, 0);
        super.field4382.method3078(33984, 1);
        if (arg0 <= 40) {
            this.method387(-94);
        }
        super.field4382.method3099(8448, 8448, 8);
        super.field4382.method3126(false, 0, 768, 5890);
        OpenGL.glDisable(3168);
        super.field4382.method3078(33984, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field672.field7507) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field677.method3144(-94);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V")
    public final void method251(byte arg0) {
        if (arg0 > -21) {
            this.field672 = null;
        }
        ++field680;
        this.field677.method3141(110, '\u0001');
        if (~super.field4382.field7794 < -1) {
            super.field4382.method3078(33984, 1);
            super.field4382.method3083((byte) 86, (class238) null);
            super.field4382.method3091((byte) 105, 1.0F, 0.0F);
            super.field4382.method3078(33984, 0);
        }
        super.field4382.method3099(8448, 8448, 8);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZI)V")
    public final void method256(boolean arg0, int arg1) {
        if (arg1 != 28300) {
            this.field677 = null;
        }
        super.field4382.method3099(8448, 260, 8);
        ++field670;
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(IBI)V")
    public static final void method388(int arg0, byte arg1, int arg2) {
        if (arg1 == -4) {
            ++field681;
            class557 var3 = class93.method564(5, -14073, arg0);
            var3.method3257(arg1 + 1952);
            var3.field8207 = arg2;
        }
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lmh;Lpda;)V")
    public class70(class537 arg0, class535 arg1) {
        super(arg0);
        this.field672 = arg1;
        this.method387(66);
        this.field682 = new class60(super.field4382, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field682.method345((byte) 116, false);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZII)V")
    public final void method258(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field679 = 31;
        }
        ++field667;
        if (~(1 & arg1) != -2) {
            if (!this.field672.field7507) {
                super.field4382.method3083((byte) 123, this.field672.field7512[0]);
            } else {
                super.field4382.method3083((byte) 111, this.field672.field7502);
                class393.field5188[0] = 0.0F;
                class393.field5188[1] = 0.0F;
                class393.field5188[2] = 0.0F;
                class393.field5188[3] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class393.field5188, 0);
            }
        } else if (this.field672.field7507) {
            super.field4382.method3083((byte) 126, this.field672.field7502);
            class393.field5188[1] = 0.0F;
            class393.field5188[2] = 0.0F;
            class393.field5188[3] = (float) (super.field4382.field7730 % 4000) / 4000.0F;
            class393.field5188[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class393.field5188, 0);
        } else {
            int var4 = super.field4382.field7730 % 4000 * 16 / 4000;
            super.field4382.method3083((byte) 95, this.field672.field7512[var4]);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(BZ)V")
    public final void method252(byte arg0, boolean arg1) {
        if (~super.field4382.field7794 < -1) {
            float var3 = -0.5F / (float) super.field4382.field7794;
            super.field4382.method3078(33984, 1);
            class393.field5188[2] = var3;
            class393.field5188[1] = 0.0F;
            class393.field5188[0] = 0.0F;
            class393.field5188[3] = super.field4382.field7842 * var3 + 0.25F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class393.field5188, 0);
            OpenGL.glPopMatrix();
            super.field4382.method3091((byte) 105, 0.5F, (float) super.field4382.field7794);
            super.field4382.method3083((byte) 78, this.field682);
            super.field4382.method3078(33984, 0);
        }
        ++field683;
        this.field677.method3141(39, '\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        if (arg0 < 10) {
            method385(35, -44, -46);
        }
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method389(int arg0, String arg1) {
        ++field668;
        if (class165.field2028 == 3) {
            return -1;
        } else if (class416.field5399.containsKey(arg1)) {
            return 100;
        } else {
            String var2 = class211.method1211(arg1, arg0 ^ -29276);
            String var3 = class544.field7969 + var2;
            if (!class532.field7489.method2567("", var3, 63)) {
                return -1;
            } else if (!class532.field7489.method2578(-127, var3)) {
                return class532.field7489.method2577(var3, 0);
            } else {
                if (arg0 != 29266) {
                    field676 = -51;
                }
                byte[] var4 = class532.field7489.method2570((byte) 108, "", var3);
                File var5 = class475.field6674.method917(arg0 + -29317, var2);
                if (var4 != null && var5 != null) {
                    boolean var6 = true;
                    byte[] var7 = class81.method479(var5, 4);
                    if (var7 != null && var4.length == var7.length) {
                        for (int var8 = 0; var7.length > var8; ++var8) {
                            if (var4[var8] != var7[var8]) {
                                var6 = false;
                                break;
                            }
                        }
                    } else {
                        var6 = false;
                    }
                    if (!var6) {
                        class475.field6674.method903(arg0 ^ 29284, var5, var4);
                    }
                    class226.method1291(0, arg1, var5);
                    return 100;
                } else {
                    return -1;
                }
            }
        }
    }
}
