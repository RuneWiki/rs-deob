import jaggl.OpenGL;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class95 extends class16 {

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "Z")
    private boolean field1065 = false;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "Z")
    private boolean field1060;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "[Lng;")
    private class310[] field1061;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "[I")
    public static int[] field1066 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1068 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "F")
    public static float field1056;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "J")
    public static long field1057;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "Lgq;")
    private class470 field1071;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIZ)V", line = 3)
    public final void method42(int arg0, int arg1, boolean arg2) {
        ++field1069;
        if (arg2) {
            method592((String) null, -64);
        }
        if (this.field1065) {
            super.field141.method2380(1, (byte) -93);
            super.field141.method2388((byte) -49, this.field1061[arg0 + -1]);
            super.field141.method2380(0, (byte) -122);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 20)
    public final void method48(byte arg0) {
        int var2 = 107 / ((arg0 - -29) / 51);
        ++field1067;
        if (!this.field1065) {
            super.field141.method2390(5890, true, 0, 770);
        } else {
            if (!this.field1060) {
                super.field141.method2380(2, (byte) -126);
                super.field141.method2388((byte) 77, (class412) null);
            }
            super.field141.method2380(1, (byte) -96);
            super.field141.method2388((byte) 123, (class412) null);
            super.field141.method2380(0, (byte) -106);
            this.field1071.method2666('\u0001', (byte) 110);
            this.field1065 = false;
        }
        super.field141.method2371(8448, 8448, -96);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)Z", line = 50)
    public final boolean method52(int arg0) {
        if (arg0 != 12733) {
            return true;
        } else {
            ++field1058;
            return true;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V", line = 61)
    public static void method591(int arg0) {
        if (arg0 >= -17) {
            field1056 = 1.7541735F;
        }
        field1066 = null;
        field1068 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILuda;)V", line = 72)
    public final void method44(int arg0, int arg1, class412 arg2) {
        ++field1062;
        super.field141.method2388((byte) -41, arg2);
        super.field141.method2396(arg0, arg1);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZB)V", line = 87)
    public final void method50(boolean arg0, byte arg1) {
        if (this.field1071 != null && arg0) {
            if (!this.field1060) {
                super.field141.method2380(2, (byte) -126);
                super.field141.method2388((byte) 107, super.field141.field6044);
                super.field141.method2380(0, (byte) -88);
            }
            this.field1071.method2666('\u0000', (byte) 110);
            this.field1065 = true;
        } else {
            super.field141.method2390(34168, true, 0, 770);
        }
        ++field1064;
        if (arg1 != 42) {
            this.method42(-59, 49, false);
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lap;)V", line = 140)
    public class95(class435 arg0) {
        super(arg0);
        if (arg0.field6046) {
            this.field1060 = arg0.field5986 < 3;
            int var2 = this.field1060 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var13;
                        } else if (var14 != 1) {
                            if (var14 == 2) {
                                var15 = var12;
                            } else if (~var14 != -4) {
                                if (var14 != 4) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = -var12;
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
            this.field1061 = new class310[3];
            this.field1061[0] = new class310(super.field141, 6406, 64, false, var4, 6406);
            this.field1061[1] = new class310(super.field141, 6406, 64, false, var5, 6406);
            this.field1061[2] = new class310(super.field141, 6406, 64, false, var3, 6406);
            this.method593((byte) -106);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BZ)V", line = 121)
    public final void method46(byte arg0, boolean arg1) {
        ++field1070;
        if (arg0 == -61) {
            super.field141.method2371(8448, 7681, -113);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 256)
    public static final String method592(String arg0, int arg1) {
        ++field1063;
        String var2 = class133.method746(class650.method3669(arg1 + -16578, arg0), (byte) 18);
        if (var2 == null) {
            var2 = "";
        }
        return arg1 != 64 ? null : var2;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)V", line = 275)
    private final void method593(byte arg0) {
        ++field1059;
        this.field1071 = new class470(super.field141, 2);
        this.field1071.method2667(0, -30923);
        super.field141.method2380(1, (byte) -119);
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
        if (this.field1060) {
            super.field141.method2371(260, 7681, -110);
            super.field141.method2372(0, false, 770, 5890);
            super.field141.method2390(34167, true, 0, 770);
        } else {
            super.field141.method2371(7681, 8448, -66);
            super.field141.method2372(0, false, 768, 34168);
            super.field141.method2380(2, (byte) -115);
            super.field141.method2371(260, 7681, -68);
            super.field141.method2372(0, false, 768, 34168);
            super.field141.method2372(1, false, 770, 34168);
            super.field141.method2390(34167, true, 0, 770);
        }
        super.field141.method2380(0, (byte) -109);
        this.field1071.method2668(1);
        this.field1071.method2667(1, -30923);
        super.field141.method2380(1, (byte) -125);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field1060) {
            super.field141.method2371(8448, 8448, -76);
            super.field141.method2372(0, false, 768, 5890);
            super.field141.method2390(5890, true, 0, 770);
        } else {
            super.field141.method2371(8448, 8448, -123);
            super.field141.method2372(0, false, 768, 5890);
            super.field141.method2380(2, (byte) -121);
            super.field141.method2371(8448, 8448, -70);
            super.field141.method2372(0, false, 768, 5890);
            super.field141.method2372(1, false, 768, 34168);
            super.field141.method2390(5890, true, 0, 770);
        }
        super.field141.method2380(0, (byte) -86);
        if (arg0 < -102) {
            this.field1071.method2668(1);
        }
    }
}
