import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class455 extends class344 {

    @OriginalMember(owner = "client!mea", name = "t", descriptor = "Lpia;")
    private class100 field7021;

    @OriginalMember(owner = "client!mea", name = "o", descriptor = "Lfga;")
    private class266 field7026;

    @OriginalMember(owner = "client!mea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7035 = new String[] { method3536(method3535("^o`Mq\u001b")), method3536(method3535("^o`Mw\u001b")), method3536(method3535("^o`M\u000fZdh\u0017\r\u001b")), method3536(method3535("]\u007fm\u000f")), method3536(method3535("H$/MN")), method3536(method3535("^o`Mu\u001b")), method3536(method3535("^o`Mp\u001b")), method3536(method3535("^o`M{\u001b")), method3536(method3535("^o`Mz\u001b")), method3536(method3535("^o`Mt\u001b")), method3536(method3535("^o`Mv\u001b")), method3536(method3535("^o`Mr\u001b")) };

    @OriginalMember(owner = "client!mea", name = "h", descriptor = "I")
    public static int field7020 = 0;

    @OriginalMember(owner = "client!mea", name = "n", descriptor = "Lvn;")
    public static class330 field7022 = new class330(16, 8);

    @OriginalMember(owner = "client!mea", name = "m", descriptor = "Lhl;")
    public static class556 field7032 = new class556(35, 6);

    @OriginalMember(owner = "client!mea", name = "k", descriptor = "I")
    public static int field7034 = 0;

    @OriginalMember(owner = "client!mea", name = "s", descriptor = "D")
    public static double field7033;

    @OriginalMember(owner = "client!mea", name = "j", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!mea", name = "i", descriptor = "I")
    public static int field7024;

    @OriginalMember(owner = "client!mea", name = "u", descriptor = "I")
    public static int field7025;

    @OriginalMember(owner = "client!mea", name = "g", descriptor = "I")
    public static int field7027;

    @OriginalMember(owner = "client!mea", name = "l", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!mea", name = "r", descriptor = "I")
    public static int field7029;

    @OriginalMember(owner = "client!mea", name = "p", descriptor = "I")
    public static int field7030;

    @OriginalMember(owner = "client!mea", name = "q", descriptor = "I")
    public static int field7031;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)V")
    public final void method833(int arg0) {
        try {
            if (arg0 > 38) {
                ++field7023;
                this.field7026.method2307(-1, '\u0001');
                super.field5595.method1432((byte) 3, 1);
                super.field5595.method1497((class224) null, true);
                super.field5595.method1432((byte) 3, 0);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7035[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lvf;Lpia;)V")
    public class455(class159 arg0, class100 arg1) {
        super(arg0);
        try {
            this.field7021 = arg1;
            this.field7026 = new class266(arg0, 2);
            this.field7026.method2303(0, 8334);
            super.field5595.method1432((byte) 3, 1);
            if (this.field7021.field1469) {
                OpenGL.glTexGeni(8194, 9472, 9217);
                OpenGL.glEnable(3170);
            }
            OpenGL.glTexGeni(8192, 9472, 9216);
            OpenGL.glTexGeni(8193, 9472, 9216);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            super.field5595.method1432((byte) 3, 0);
            this.field7026.method2304(false);
            this.field7026.method2303(1, 8334);
            super.field5595.method1432((byte) 3, 1);
            if (this.field7021.field1469) {
                OpenGL.glDisable(3170);
            }
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            super.field5595.method1432((byte) 3, 0);
            this.field7026.method2304(false);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7035[2] + (arg0 != null ? field7035[4] : field7035[3]) + ',' + (arg1 != null ? field7035[4] : field7035[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(BII)Z")
    public static final boolean method3532(byte arg0, int arg1, int arg2) {
        try {
            if (arg0 <= 35) {
                field7022 = null;
            }
            ++field7028;
            return (1024 & arg1) != 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7035[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lgb;II)V")
    public final void method836(class224 arg0, int arg1, int arg2) {
        try {
            if (arg2 != 16) {
                field7020 = 99;
            }
            super.field5595.method1497(arg0, true);
            ++field7027;
            super.field5595.method1425((byte) 35, arg1);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7035[10] + (arg0 != null ? field7035[4] : field7035[3]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(III)V")
    public final void method835(int arg0, int arg1, int arg2) {
        try {
            if (arg1 != 16) {
                this.method836((class224) null, 30, 119);
            }
            ++field7024;
            float var4 = (float) ((3 & arg0) + 1) * -5.0E-4F;
            float var5 = (float) (((24 & arg0) >> 3) + 1) * 5.0E-4F;
            float var6 = (arg0 & 64) == 0 ? 4.8828125E-4F : 9.765625E-4F;
            boolean var7 = ~(128 & arg0) != -1;
            super.field5595.method1432((byte) 3, 1);
            if (var7) {
                class787.field11505[2] = 0.0F;
                class787.field11505[3] = 0.0F;
                class787.field11505[1] = 0.0F;
                class787.field11505[0] = var6;
            } else {
                class787.field11505[1] = 0.0F;
                class787.field11505[3] = 0.0F;
                class787.field11505[0] = 0.0F;
                class787.field11505[2] = var6;
            }
            OpenGL.glTexGenfv(8192, 9474, class787.field11505, 0);
            class787.field11505[3] = (float) super.field5595.field2394 * var4 % 1.0F;
            class787.field11505[0] = 0.0F;
            class787.field11505[1] = var6;
            class787.field11505[2] = 0.0F;
            OpenGL.glTexGenfv(8193, 9474, class787.field11505, 0);
            if (!this.field7021.field1469) {
                int var8 = (int) ((float) super.field5595.field2394 * var5 * 16.0F);
                super.field5595.method1497(this.field7021.field1470[var8 % 16], true);
            } else {
                class787.field11505[2] = 0.0F;
                class787.field11505[0] = 0.0F;
                class787.field11505[3] = (float) super.field5595.field2394 * var5 % 1.0F;
                class787.field11505[1] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class787.field11505, 0);
            }
            super.field5595.method1432((byte) 3, 0);
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field7035[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(I)V")
    public static void method3533(int arg0) {
        try {
            if (arg0 < 47) {
                method3534((byte) -122);
            }
            field7032 = null;
            field7022 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7035[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)Z")
    public final boolean method831(boolean arg0) {
        try {
            ++field7025;
            return arg0 ? true : true;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7035[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IZ)V")
    public final void method834(int arg0, boolean arg1) {
        try {
            ++field7031;
            this.field7026.method2307(-1, '\u0000');
            if (arg0 != 16) {
                this.method833(-25);
            }
            if (this.field7021.field1469) {
                super.field5595.method1432((byte) 3, 1);
                super.field5595.method1497(this.field7021.field1468, true);
                super.field5595.method1432((byte) 3, 0);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7035[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(BZ)V")
    public final void method837(byte arg0, boolean arg1) {
        try {
            if (arg0 > -64) {
                this.method837((byte) 54, true);
            }
            ++field7029;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7035[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(B)V")
    public static final void method3534(byte arg0) {
        try {
            ++field7030;
            if (arg0 > -66) {
                field7034 = -118;
            }
            int var1 = 0;
            for (int var2 = 0; ~var2 > ~class126.field1823; ++var2) {
                for (int var3 = 0; ~class169.field2725 < ~var3; ++var3) {
                    if (class680.method4957(class85.field1280, var2, var1, var3, true, 512)) {
                        ++var1;
                    }
                    if (var1 >= 512) {
                        return;
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7035[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3535(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 51);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3536(char[] arg0) {
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
                    var10005 = 10;
                    break;
                case 2:
                    var10005 = 1;
                    break;
                case 3:
                    var10005 = 99;
                    break;
                default:
                    var10005 = 51;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
