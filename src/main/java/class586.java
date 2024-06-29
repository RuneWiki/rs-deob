import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lja")
public class class586 extends class96 {

    @OriginalMember(owner = "client!lja", name = "m", descriptor = "Lau;")
    private class113 field8462;

    @OriginalMember(owner = "client!lja", name = "q", descriptor = "Lkca;")
    private class13 field8464;

    @OriginalMember(owner = "client!lja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8468 = new String[] { method4337(method4336("]FG3")), method4337(method4336("H\u001d\u0005q\u000f")), method4337(method4336("_YJqNZ]B+L\u001b")), method4337(method4336("_YJq1\u001b")), method4337(method4336("_YJq5\u001b")), method4337(method4336("_YJq4\u001b")), method4337(method4336("_YJq:\u001b")), method4337(method4336("_YJq3\u001b")), method4337(method4336("_YJq0\u001b")), method4337(method4336("_YJq7\u001b")), method4337(method4336("_YJq6\u001b")) };

    @OriginalMember(owner = "client!lja", name = "o", descriptor = "I")
    public static int field8459 = 0;

    @OriginalMember(owner = "client!lja", name = "p", descriptor = "I")
    public static int field8456;

    @OriginalMember(owner = "client!lja", name = "l", descriptor = "I")
    public static int field8457;

    @OriginalMember(owner = "client!lja", name = "i", descriptor = "I")
    public static int field8458;

    @OriginalMember(owner = "client!lja", name = "g", descriptor = "I")
    public static int field8460;

    @OriginalMember(owner = "client!lja", name = "h", descriptor = "I")
    public static int field8461;

    @OriginalMember(owner = "client!lja", name = "r", descriptor = "I")
    public static int field8463;

    @OriginalMember(owner = "client!lja", name = "n", descriptor = "I")
    public static int field8465;

    @OriginalMember(owner = "client!lja", name = "k", descriptor = "I")
    public static int field8466;

    @OriginalMember(owner = "client!lja", name = "j", descriptor = "I")
    public static int field8467;

    @OriginalMember(owner = "client!lja", name = "<init>", descriptor = "(Lml;Lau;)V")
    public class586(class194 arg0, class113 arg1) {
        super(arg0);
        try {
            this.field8462 = arg1;
            this.field8464 = new class13(arg0, 2);
            this.field8464.method90(0, (byte) 72);
            super.field1301.method1619(1, (byte) 125);
            if (this.field8462.field1463) {
                OpenGL.glTexGeni(8194, 9472, 9217);
                OpenGL.glEnable(3170);
            }
            OpenGL.glTexGeni(8192, 9472, 9216);
            OpenGL.glTexGeni(8193, 9472, 9216);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            super.field1301.method1619(0, (byte) 125);
            this.field8464.method87((byte) 103);
            this.field8464.method90(1, (byte) 100);
            super.field1301.method1619(1, (byte) 125);
            if (this.field8462.field1463) {
                OpenGL.glDisable(3170);
            }
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            super.field1301.method1619(0, (byte) 125);
            this.field8464.method87((byte) 103);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8468[2] + (arg0 != null ? field8468[1] : field8468[0]) + ',' + (arg1 != null ? field8468[1] : field8468[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!lja", name = "c", descriptor = "(I)V")
    public static final void method4334(int arg0) {
        try {
            class341.field4966 = class60.field911;
            ++field8465;
            class139.field1812 = -1;
            class398.field5797 = 1;
            String var1 = null;
            if (class482.field7094 != null) {
                class711 var2 = new class711(class482.field7094);
                var1 = class626.method4599((byte) -104, var2.method5147((byte) 115));
                class35.field430 = var2.method5147((byte) 122);
            }
            if (var1 == null) {
                class345.method2766((byte) 109, 35);
            } else if (arg0 == 13421) {
                class157.method1317(true, var1, 0, "", false);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8468[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(IZLica;)V")
    public final void method679(int arg0, boolean arg1, class469 arg2) {
        try {
            super.field1301.method1618((byte) -115, arg2);
            if (arg1) {
                this.method679(53, false, (class469) null);
            }
            ++field8457;
            super.field1301.method1631(arg0, 7681);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8468[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8468[1] : field8468[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(I)V")
    public final void method675(int arg0) {
        try {
            this.field8464.method88('\u0001', (byte) -112);
            ++field8460;
            if (arg0 != -16265) {
                this.method673(true, 50);
            }
            super.field1301.method1619(1, (byte) 125);
            super.field1301.method1618((byte) -86, (class469) null);
            super.field1301.method1619(0, (byte) 125);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8468[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(ZI)V")
    public final void method673(boolean arg0, int arg1) {
        try {
            this.field8464.method88('\u0000', (byte) -112);
            ++field8466;
            if (this.field8462.field1463) {
                super.field1301.method1619(1, (byte) 125);
                super.field1301.method1618((byte) 30, this.field8462.field1457);
                super.field1301.method1619(0, (byte) 125);
            }
            int var3 = 81 % ((36 - arg1) / 55);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8468[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(Z)Z")
    public final boolean method677(boolean arg0) {
        try {
            if (!arg0) {
                this.field8462 = null;
            }
            ++field8456;
            return true;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8468[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lja", name = "b", descriptor = "(B)Z")
    public static final boolean method4335(byte arg0) {
        try {
            ++field8463;
            if (class559.field8139 != 3) {
                return false;
            } else {
                if (arg0 <= 115) {
                    method4334(59);
                }
                return ~class561.field8167 == -1 && ~class189.field2516 == -1;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8468[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(ZII)V")
    public final void method681(boolean arg0, int arg1, int arg2) {
        try {
            ++field8467;
            float var4 = (float) ((3 & arg1) + 1) * -5.0E-4F;
            float var5 = (float) (((arg1 & 24) >> 3) + 1) * 5.0E-4F;
            float var6 = ~(64 & arg1) != -1 ? 9.765625E-4F : 4.8828125E-4F;
            super.field1301.method1619(1, (byte) 125);
            boolean var7 = ~(128 & arg1) != -1;
            if (var7) {
                class648.field9216[1] = 0.0F;
                class648.field9216[3] = 0.0F;
                class648.field9216[0] = var6;
                class648.field9216[2] = 0.0F;
            } else {
                class648.field9216[0] = 0.0F;
                class648.field9216[3] = 0.0F;
                class648.field9216[1] = 0.0F;
                class648.field9216[2] = var6;
            }
            OpenGL.glTexGenfv(8192, 9474, class648.field9216, 0);
            class648.field9216[1] = var6;
            class648.field9216[3] = (float) super.field1301.field2763 * var4 % 1.0F;
            class648.field9216[0] = 0.0F;
            if (arg0) {
                field8459 = -32;
            }
            class648.field9216[2] = 0.0F;
            OpenGL.glTexGenfv(8193, 9474, class648.field9216, 0);
            if (!this.field8462.field1463) {
                int var8 = (int) ((float) super.field1301.field2763 * var5 * 16.0F);
                super.field1301.method1618((byte) 126, this.field8462.field1465[var8 % 16]);
            } else {
                class648.field9216[0] = 0.0F;
                class648.field9216[1] = 0.0F;
                class648.field9216[3] = (float) super.field1301.field2763 * var5 % 1.0F;
                class648.field9216[2] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class648.field9216, 0);
            }
            super.field1301.method1619(0, (byte) 125);
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field8468[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(ZB)V")
    public final void method683(boolean arg0, byte arg1) {
        try {
            if (arg1 != -54) {
                this.field8462 = null;
            }
            ++field8458;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8468[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4336(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 114);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4337(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 51;
                    break;
                case 1:
                    var10005 = 51;
                    break;
                case 2:
                    var10005 = 43;
                    break;
                case 3:
                    var10005 = 95;
                    break;
                default:
                    var10005 = 114;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
