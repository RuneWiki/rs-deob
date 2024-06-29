import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class316 extends class344 {

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "Lpia;")
    private class100 field5135;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "Lqaa;")
    private class26 field5140;

    @OriginalMember(owner = "client!mu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5146 = new String[] { method2694(method2693("#s\u000e\n\"")), method2694(method2693(" sL ")), method2694(method2693("#s\u000e\t\"")), method2694(method2693("5(\u000ebw")), method2694(method2693("#s\u000e\u000b\"")), method2694(method2693("#s\u000epc oTr\"")), method2694(method2693("#s\u000e\u000f\"")), method2694(method2693("#s\u000e\r\"")), method2694(method2693("#s\u000e\u0004\"")), method2694(method2693("#s\u000e\u000e\"")) };

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "I")
    public static int field5133 = 0;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "Z")
    public static boolean field5141 = false;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "S")
    public static short field5144 = 256;

    @OriginalMember(owner = "client!mu", name = "s", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!mu", name = "t", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!mu", name = "q", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!mu", name = "u", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!mu", name = "r", descriptor = "Lfga;")
    private class266 field5145;

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lvf;Lpia;)V")
    public class316(class159 arg0, class100 arg1) {
        super(arg0);
        try {
            this.field5135 = arg1;
            this.method2692(110);
            this.field5140 = new class26(super.field5595, 6406, 2, new byte[] { 0, -1 }, 6406);
            this.field5140.method278(0, false);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5146[5] + (arg0 != null ? field5146[3] : field5146[1]) + ',' + (arg1 != null ? field5146[3] : field5146[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
    public final void method833(int arg0) {
        try {
            ++field5132;
            this.field5145.method2307(-1, '\u0001');
            if (~super.field5595.field2515 < -1) {
                super.field5595.method1432((byte) 3, 1);
                super.field5595.method1497((class224) null, true);
                super.field5595.method1436(0.0F, 1.0F, 29936);
                super.field5595.method1432((byte) 3, 0);
            }
            super.field5595.method1492(8448, 8448, (byte) 17);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            if (arg0 > 38) {
                OpenGL.glMatrixMode(5888);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5146[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(III)V")
    public final void method835(int arg0, int arg1, int arg2) {
        try {
            if ((1 & arg0) != 1) {
                if (this.field5135.field1469) {
                    super.field5595.method1497(this.field5135.field1471, true);
                    class417.field6592[0] = 0.0F;
                    class417.field6592[1] = 0.0F;
                    class417.field6592[3] = 0.0F;
                    class417.field6592[2] = 0.0F;
                    OpenGL.glTexGenfv(8194, 9473, class417.field6592, 0);
                } else {
                    super.field5595.method1497(this.field5135.field1466[0], true);
                }
            } else if (!this.field5135.field1469) {
                int var4 = super.field5595.field2394 % 4000 * 16 / 4000;
                super.field5595.method1497(this.field5135.field1466[var4], true);
            } else {
                super.field5595.method1497(this.field5135.field1471, true);
                class417.field6592[1] = 0.0F;
                class417.field6592[3] = (float) (super.field5595.field2394 % 4000) / 4000.0F;
                class417.field6592[2] = 0.0F;
                class417.field6592[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class417.field6592, 0);
            }
            if (arg1 != 16) {
                field5137 = -65;
            }
            ++field5131;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field5146[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V")
    private final void method2692(int arg0) {
        try {
            ++field5136;
            this.field5145 = new class266(super.field5595, 2);
            this.field5145.method2303(0, 8334);
            super.field5595.method1432((byte) 3, 1);
            super.field5595.method1492(260, 7681, (byte) 17);
            super.field5595.method1456((byte) -101, 768, 34168, 0);
            OpenGL.glTexGeni(8192, 9472, 9216);
            OpenGL.glEnable(3168);
            super.field5595.method1432((byte) 3, 0);
            OpenGL.glTexEnvf(8960, 34163, 2.0F);
            if (arg0 >= 16) {
                if (this.field5135.field1469) {
                    OpenGL.glTexGeni(8194, 9472, 9217);
                    OpenGL.glTexGeni(8195, 9472, 9217);
                    OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
                    OpenGL.glEnable(3170);
                    OpenGL.glEnable(3171);
                }
                this.field5145.method2304(false);
                this.field5145.method2303(1, 8334);
                super.field5595.method1432((byte) 3, 1);
                super.field5595.method1492(8448, 8448, (byte) 17);
                super.field5595.method1456((byte) -101, 768, 5890, 0);
                OpenGL.glDisable(3168);
                super.field5595.method1432((byte) 3, 0);
                OpenGL.glTexEnvf(8960, 34163, 1.0F);
                if (this.field5135.field1469) {
                    OpenGL.glDisable(3170);
                    OpenGL.glDisable(3171);
                }
                this.field5145.method2304(false);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5146[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IZ)V")
    public final void method834(int arg0, boolean arg1) {
        try {
            ++field5143;
            if (arg0 != 16) {
                this.field5140 = null;
            }
            if (super.field5595.field2515 > 0) {
                float var3 = -0.5F / (float) super.field5595.field2515;
                super.field5595.method1432((byte) 3, 1);
                class417.field6592[1] = 0.0F;
                class417.field6592[0] = 0.0F;
                class417.field6592[2] = var3;
                class417.field6592[3] = super.field5595.field2530 * var3 + 0.25F;
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glTexGenfv(8192, 9474, class417.field6592, 0);
                OpenGL.glPopMatrix();
                super.field5595.method1436((float) super.field5595.field2515, 0.5F, arg0 ^ 29920);
                super.field5595.method1497(this.field5140, true);
                super.field5595.method1432((byte) 3, 0);
            }
            this.field5145.method2307(-1, '\u0000');
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(0.25F, 0.25F, 1.0F);
            OpenGL.glMatrixMode(5888);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5146[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lgb;II)V")
    public final void method836(class224 arg0, int arg1, int arg2) {
        try {
            if (arg2 != 16) {
                this.field5135 = null;
            }
            ++field5142;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5146[2] + (arg0 != null ? field5146[3] : field5146[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BZ)V")
    public final void method837(byte arg0, boolean arg1) {
        try {
            ++field5138;
            super.field5595.method1492(8448, 260, (byte) 17);
            if (arg0 > -64) {
                this.field5140 = null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5146[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)Z")
    public final boolean method831(boolean arg0) {
        try {
            ++field5134;
            if (arg0) {
                this.method2692(85);
            }
            return true;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5146[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2693(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 10);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2694(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 78;
                    break;
                case 1:
                    var10005 = 6;
                    break;
                case 2:
                    var10005 = 32;
                    break;
                case 3:
                    var10005 = 76;
                    break;
                default:
                    var10005 = 10;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
