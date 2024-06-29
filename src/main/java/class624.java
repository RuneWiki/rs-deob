import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class624 extends class96 {

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "Lau;")
    private class113 field8917;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "Lws;")
    private class103 field8924;

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8925 = new String[] { method4584(method4583("!5-&.(,w$o")), method4584(method4583("=k-4:")), method4584(method4583("(0ov")), method4584(method4583("!5-Xo")), method4584(method4583("!5-Ro")), method4584(method4583("!5-]o")), method4584(method4583("!5-[o")), method4584(method4583("!5-^o")), method4584(method4583("!5-Yo")), method4584(method4583("!5-_o")) };

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "I")
    public static int field8914;

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "I")
    public static int field8915;

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
    public static int field8916;

    @OriginalMember(owner = "client!gp", name = "q", descriptor = "I")
    public static int field8919;

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "I")
    public static int field8920;

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "I")
    public static int field8921;

    @OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
    public static int field8923;

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "Lkca;")
    private class13 field8918;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Z)Z", line = 3)
    public final boolean method677(boolean arg0) {
        try {
            if (!arg0) {
                this.field8917 = null;
            }
            ++field8923;
            return true;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8925[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IZLica;)V", line = 15)
    public final void method679(int arg0, boolean arg1, class469 arg2) {
        try {
            if (!arg1) {
                ++field8921;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8925[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8925[1] : field8925[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V", line = 33)
    public final void method675(int arg0) {
        try {
            this.field8918.method88('\u0001', (byte) -112);
            ++field8915;
            if (super.field1301.field2828 > 0) {
                super.field1301.method1619(1, (byte) 125);
                super.field1301.method1618((byte) -100, (class469) null);
                super.field1301.method1674(0.0F, 1, 1.0F);
                super.field1301.method1619(0, (byte) 125);
            }
            super.field1301.method1628(8448, 8448, 34162);
            if (arg0 == -16265) {
                OpenGL.glMatrixMode(5890);
                OpenGL.glPopMatrix();
                OpenGL.glMatrixMode(5888);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8925[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZI)V", line = 57)
    public final void method673(boolean arg0, int arg1) {
        try {
            if (super.field1301.field2828 > 0) {
                float var3 = -0.5F / (float) super.field1301.field2828;
                super.field1301.method1619(1, (byte) 125);
                class701.field9808[0] = 0.0F;
                class701.field9808[3] = super.field1301.field2871 * var3 + 0.25F;
                class701.field9808[1] = 0.0F;
                class701.field9808[2] = var3;
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glTexGenfv(8192, 9474, class701.field9808, 0);
                OpenGL.glPopMatrix();
                super.field1301.method1674((float) super.field1301.field2828, 1, 0.5F);
                super.field1301.method1618((byte) 43, this.field8924);
                super.field1301.method1619(0, (byte) 125);
            }
            ++field8922;
            this.field8918.method88('\u0000', (byte) -112);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(0.25F, 0.25F, 1.0F);
            int var4 = -56 % ((36 - arg1) / 55);
            OpenGL.glMatrixMode(5888);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8925[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZB)V", line = 90)
    public final void method683(boolean arg0, byte arg1) {
        try {
            ++field8919;
            super.field1301.method1628(8448, 260, 34162);
            if (arg1 != -54) {
                this.method675(87);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8925[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZII)V", line = 101)
    public final void method681(boolean arg0, int arg1, int arg2) {
        try {
            if ((arg1 & 1) == 1) {
                if (!this.field8917.field1463) {
                    int var4 = super.field1301.field2763 % 4000 * 16 / 4000;
                    super.field1301.method1618((byte) -117, this.field8917.field1458[var4]);
                } else {
                    super.field1301.method1618((byte) -84, this.field8917.field1454);
                    class701.field9808[1] = 0.0F;
                    class701.field9808[2] = 0.0F;
                    class701.field9808[0] = 0.0F;
                    class701.field9808[3] = (float) (super.field1301.field2763 % 4000) / 4000.0F;
                    OpenGL.glTexGenfv(8194, 9473, class701.field9808, 0);
                }
            } else if (this.field8917.field1463) {
                super.field1301.method1618((byte) -106, this.field8917.field1454);
                class701.field9808[0] = 0.0F;
                class701.field9808[1] = 0.0F;
                class701.field9808[2] = 0.0F;
                class701.field9808[3] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class701.field9808, 0);
            } else {
                super.field1301.method1618((byte) -94, this.field8917.field1458[0]);
            }
            if (arg0) {
                this.field8924 = null;
            }
            ++field8916;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8925[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "(I)V", line = 151)
    private final void method4582(int arg0) {
        try {
            ++field8920;
            this.field8918 = new class13(super.field1301, 2);
            this.field8918.method90(0, (byte) 97);
            super.field1301.method1619(1, (byte) 125);
            super.field1301.method1628(260, 7681, 34162);
            super.field1301.method1669(768, 0, 34168, (byte) -127);
            OpenGL.glTexGeni(8192, 9472, 9216);
            OpenGL.glEnable(3168);
            super.field1301.method1619(0, (byte) 125);
            OpenGL.glTexEnvf(8960, 34163, 2.0F);
            if (this.field8917.field1463) {
                OpenGL.glTexGeni(8194, 9472, 9217);
                OpenGL.glTexGeni(8195, 9472, 9217);
                OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
                OpenGL.glEnable(3170);
                OpenGL.glEnable(3171);
            }
            this.field8918.method87((byte) 103);
            this.field8918.method90(1, (byte) 63);
            super.field1301.method1619(1, (byte) 125);
            super.field1301.method1628(arg0, 8448, 34162);
            super.field1301.method1669(768, 0, 5890, (byte) -111);
            OpenGL.glDisable(3168);
            super.field1301.method1619(0, (byte) 125);
            OpenGL.glTexEnvf(8960, 34163, 1.0F);
            if (this.field8917.field1463) {
                OpenGL.glDisable(3170);
                OpenGL.glDisable(3171);
            }
            this.field8918.method87((byte) 103);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8925[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lml;Lau;)V", line = 193)
    public class624(class194 arg0, class113 arg1) {
        super(arg0);
        try {
            this.field8917 = arg1;
            this.method4582(8448);
            this.field8924 = new class103(super.field1301, 6406, 2, new byte[] { 0, -1 }, 6406);
            this.field8924.method993((byte) 96, false);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8925[0] + (arg0 != null ? field8925[1] : field8925[2]) + ',' + (arg1 != null ? field8925[1] : field8925[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4583(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 71);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4584(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 70;
                    break;
                case 1:
                    var10005 = 69;
                    break;
                case 2:
                    var10005 = 3;
                    break;
                case 3:
                    var10005 = 26;
                    break;
                default:
                    var10005 = 71;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
