import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class784 extends class593 {

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "Ljd;")
    private class130 field11311;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "Lhaa;")
    private class3 field11314;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "Z")
    private boolean field11324;

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11328 = new String[] { method5650(method5649("\f9w\n\u0012")), method5650(method5649("\u001e<7\rU\u0001&,<")), method5650(method5649("\u001e<7\nS\u001f")), method5650(method5649("\f9w\u000f\u0012")), method5650(method5649("\u0003&+#[\u0001\u001a8#J\u0001,+")), method5650(method5649("\b'/\u0003[\u001d\u001a8#J\u0001,+")), method5650(method5649("\u001e<7\u000bB\u001d&7+T\u0019")), method5650(method5649("\f9w\u000b\u0012")), method5650(method5649("\f9w\r\u0012")), method5650(method5649("\f9w\u0006\u0012")), method5650(method5649("\f9w\b\u0012")), method5650(method5649("\u0003<5\"")), method5650(method5649("\u0016gw`G")), method5650(method5649("\f9w\t\u0012")), method5650(method5649("\f9w\f\u0012")), method5650(method5649("\n%")), method5650(method5649("\f9wrS\u0003 -p\u0012")), method5650(method5649("\b'/'H\u0002'4+T\u0019\u00164/J\u001d,=\u0011M\f=<<e\u000b")), method5650(method5649("\b'/'H\u0002'4+T\u0019\u00164/J\u001d,=\u0011M\f=<<e\u001b")), method5650(method5649("\u001e*8\"_")), method5650(method5649("\f9w\u0007\u0012")), method5650(method5649("\u000f;</Q:(-+H),):R")), method5650(method5649("\u0019 4+")), method5650(method5649("\u000f;</Q:(-+H\"/?=_\u0019")) };

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "[I")
    public static int[] field11317 = new int[2];

    @OriginalMember(owner = "client!ap", name = "s", descriptor = "I")
    public static int field11318 = 2;

    @OriginalMember(owner = "client!ap", name = "w", descriptor = "I")
    public static int field11322 = 0;

    @OriginalMember(owner = "client!ap", name = "v", descriptor = "Lff;")
    public static class733 field11313 = new class733();

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "Loba;")
    public static class739 field11325 = new class739();

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
    public static int field11312;

    @OriginalMember(owner = "client!ap", name = "x", descriptor = "I")
    public static int field11315;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
    public static int field11316;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    public static int field11319;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
    public static int field11320;

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "I")
    public static int field11321;

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "I")
    public static int field11326;

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "I")
    public static int field11327;

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "Z")
    private boolean field11323;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lfl;I[[B)V")
    public static final void method5646(class794 arg0, int arg1, byte[][] arg2) {
        try {
            ++field11315;
            if (arg1 > -104) {
                field11322 = -66;
            }
            int var3 = class385.field5630.length;
            for (int var4 = 0; var4 < var3; ++var4) {
                byte[] var5 = arg2[var4];
                if (var5 != null) {
                    int var6 = (class136.field1754[var4] >> 8) * 64 + -class537.field7895;
                    int var7 = (class136.field1754[var4] & 255) * 64 + -class655.field9286;
                    class635.method4633(97);
                    arg0.method5725(var7, class195.field2919, var5, class236.field3418, (byte) 0, var6);
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field11328[14] + (arg0 != null ? field11328[12] : field11328[11]) + ',' + arg1 + ',' + (arg2 != null ? field11328[12] : field11328[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BZ)V")
    public final void method460(byte arg0, boolean arg1) {
        try {
            ++field11316;
            if (arg0 != -20) {
                field11322 = 11;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11328[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)Z")
    public final boolean method458(int arg0) {
        try {
            ++field11319;
            if (arg0 <= 70) {
                field11318 = 25;
            }
            return this.field11324;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11328[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIB)V")
    public final void method463(int arg0, int arg1, byte arg2) {
        try {
            if (this.field11323) {
                int var4 = 1 << (3 & arg0);
                float var5 = (float) (1 << ((arg0 & 59) >> 3)) / 32.0F;
                int var6 = 65535 & arg1;
                float var7 = (float) ((arg1 & 201386) >> 16) / 8.0F;
                long var8 = this.field11314.field48;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field11328[22]), (float) (super.field8530.field4774 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field11328[19]), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field11328[21]), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field11328[23]), var7);
            }
            if (arg2 <= -98) {
                ++field11326;
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field11328[20] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)V")
    public final void method455(int arg0) {
        try {
            ++field11327;
            if (arg0 == -15226) {
                if (this.field11323) {
                    super.field8530.method2661(125, 1);
                    super.field8530.method2668(24, (class764) null);
                    super.field8530.method2661(arg0 + 15284, 0);
                    super.field8530.method2668(arg0 ^ -15202, (class764) null);
                    OpenGL.glUseProgramObjectARB(0L);
                    this.field11323 = false;
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11328[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Ldga;Llga;Ljd;)V")
    public class784(class713 arg0, class47 arg1, class130 arg2) {
        super(arg0);
        try {
            this.field11311 = arg2;
            if (arg1 != null && arg0.field10127 && arg0.field10135) {
                class263 var4 = class550.method4118(arg0, 13787, 35633, arg1.method529(field11328[15], 1, field11328[18]));
                class263 var5 = class550.method4118(arg0, 13787, 35632, arg1.method529(field11328[15], 1, field11328[17]));
                this.field11314 = class355.method2838((byte) -115, arg0, new class263[] { var4, var5 });
                this.field11324 = this.field11314 != null && this.field11311.method1145(0);
            } else {
                this.field11324 = false;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field11328[16] + (arg0 != null ? field11328[12] : field11328[11]) + ',' + (arg1 != null ? field11328[12] : field11328[11]) + ',' + (arg2 != null ? field11328[12] : field11328[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)I")
    public static final int method5647(byte arg0) {
        try {
            ++field11321;
            if (~class101.field1360 == -2) {
                return class224.field3263;
            } else {
                if (arg0 != 105) {
                    field11318 = -51;
                }
                return 0;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field11328[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "(I)V")
    public static void method5648(int arg0) {
        try {
            if (arg0 == 59) {
                field11325 = null;
                field11313 = null;
                field11317 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field11328[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IBLah;)V")
    public final void method452(int arg0, byte arg1, class764 arg2) {
        try {
            ++field11320;
            if (arg1 == -106) {
                if (!this.field11323) {
                    super.field8530.method2668(24, arg2);
                    super.field8530.method2679(2, arg0);
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11328[13] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11328[12] : field11328[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZ)V")
    public final void method454(int arg0, boolean arg1) {
        try {
            ++field11312;
            class361 var3 = super.field8530.method2676(1);
            int var4 = 35 / ((-51 - arg0) / 39);
            if (this.field11324 && var3 != null) {
                super.field8530.method2661(80, 1);
                super.field8530.method2668(24, var3);
                super.field8530.method2661(75, 0);
                super.field8530.method2668(24, this.field11311.field1627);
                long var5 = this.field11314.field48;
                OpenGL.glUseProgramObjectARB(var5);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, field11328[4]), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, field11328[5]), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, field11328[2]), -super.field8530.field4746[0], -super.field8530.field4746[1], -super.field8530.field4746[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, field11328[1]), super.field8530.field4807, super.field8530.field4767, super.field8530.field4758, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, field11328[6]), 96.0F + Math.abs(super.field8530.field4746[1]) * 928.0F);
                this.field11323 = true;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field11328[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5649(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 58);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5650(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 109;
                    break;
                case 1:
                    var10005 = 73;
                    break;
                case 2:
                    var10005 = 89;
                    break;
                case 3:
                    var10005 = 78;
                    break;
                default:
                    var10005 = 58;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
