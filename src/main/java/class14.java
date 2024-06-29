import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public abstract class class14 implements class212 {

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "Z")
    private boolean field228 = false;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    public int field223;

    @OriginalMember(owner = "client!kv", name = "q", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client!kv", name = "v", descriptor = "Lbv;")
    public class282 field241;

    @OriginalMember(owner = "client!kv", name = "u", descriptor = "I")
    public int field240;

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "Z")
    private boolean field232;

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "I")
    public int field230;

    @OriginalMember(owner = "client!kv", name = "p", descriptor = "Lpg;")
    public static class492 field235 = new class492(20, -1);

    @OriginalMember(owner = "client!kv", name = "w", descriptor = "Ler;")
    public static class157 field242 = new class157(200);

    @OriginalMember(owner = "client!kv", name = "y", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!kv", name = "n", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!kv", name = "o", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!kv", name = "r", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!kv", name = "s", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!kv", name = "x", descriptor = "I")
    public static int field243;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kv", name = "z", descriptor = "Ljava/lang/Class;")
    public static Class field245;

    @OriginalMember(owner = "client!kv", name = "t", descriptor = "Ljava/lang/String;")
    public static String field239;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)I")
    public final int method115(int arg0) {
        if (arg0 == -6216) {
            field233++;
            return this.field230;
        } else {
            return 13;
        }
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(I)V")
    public static void method116(int arg0) {
        if (arg0 < 40) {
            field243 = -112;
        }
        field235 = null;
        field242 = null;
        field239 = null;
    }

    @OriginalMember(owner = "client!kv", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method121((byte) -57);
        field237++;
        super.finalize();
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZI)Z")
    public static final boolean method117(boolean arg0, int arg1) {
        class427.field6353 = arg1 + 1 & 0xFFFF;
        class340.field5371 = arg0;
        field234++;
        return true;
    }

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "(I)V")
    private final void method118(int arg0) {
        field229++;
        this.field241.method1787(this, (byte) 121);
        if (this.field228) {
            OpenGL.glTexParameteri(this.field240, 10241, this.field232 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field240, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field240, 10241, this.field232 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field240, 10240, 9728);
        }
        int var2 = -102 % ((arg0 - 31) / 46);
    }

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "(I)I")
    private final int method119(int arg0) {
        int var2 = -109 % ((-arg0 - 34) / 45);
        field224++;
        int var3 = this.field241.method1800(this.field223, false) * this.field236;
        return this.field232 ? var3 * 4 / 3 : var3;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIBIILqa;II)V")
    public static final void method120(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class496 arg6, int arg7, int arg8) {
        field231++;
        class196 var9 = (class196) class456.method2743(arg0, arg2, arg7);
        if (var9 != null) {
            class130 var10 = class56.field755.method2031(arg3 + 80, var9.method50(25707));
            int var11 = var9.method66(-7234) & 0x3;
            int var12 = var9.method63((byte) 63);
            if (var10.field1838 == -1) {
                int var13 = arg1;
                if (var10.field1886 > 0) {
                    var13 = arg4;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg6.method2949(var13, (byte) -83, 4, arg5, arg8);
                    } else if (var11 == 1) {
                        arg6.method2947(arg8, var13, arg5, (byte) 118, 4);
                    } else if (var11 == 2) {
                        arg6.method2949(var13, (byte) -83, 4, arg5, arg8 + 3);
                    } else if (var11 == 3) {
                        arg6.method2947(arg8, var13, arg5 + 3, (byte) 124, 4);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg6.method2952(1, 1, arg8, var13, (byte) -53, arg5);
                    } else if (var11 == 1) {
                        arg6.method2952(1, 1, arg8 + 3, var13, (byte) -53, arg5);
                    } else if (var11 == 2) {
                        arg6.method2952(1, 1, arg8 + 3, var13, (byte) -53, arg5 + 3);
                    } else if (var11 == 3) {
                        arg6.method2952(1, 1, arg8, var13, (byte) -53, arg5 + 3);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg6.method2947(arg8, var13, arg5, (byte) 99, 4);
                    } else if (var11 == 1) {
                        arg6.method2949(var13, (byte) -83, 4, arg5, arg8 + 3);
                    } else if (var11 == 2) {
                        arg6.method2947(arg8, var13, arg5 + 3, (byte) 122, 4);
                    } else if (var11 == 3) {
                        arg6.method2949(var13, (byte) -83, 4, arg5, arg8);
                    }
                }
            } else {
                class85.method553(var11, arg8, var10, true, arg6, arg5);
            }
        }
        class196 var14 = (class196) class432.method2587(arg0, arg2, arg7, field245 == null ? (field245 = method128("ou")) : field245);
        if (var14 != null) {
            class130 var15 = class56.field755.method2031(114, var14.method50(25707));
            int var16 = var14.method66(-7234) & 0x3;
            int var17 = var14.method63((byte) 63);
            if (var15.field1838 != -1) {
                class85.method553(var16, arg8, var15, true, arg6, arg5);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field1886 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg6.method2953(var18, arg8, arg5 + 3, arg5, arg8 + 3, arg3 + 191);
                } else {
                    arg6.method2953(var18, arg8, arg5, arg5 + 3, arg8 + 3, arg3 ^ 0xFFFFFFD1);
                }
            }
        }
        class196 var19 = (class196) class380.method2357(arg0, arg2, arg7);
        if (arg3 != -119) {
            field243 = -52;
        }
        if (var19 == null) {
            return;
        }
        class130 var20 = class56.field755.method2031(arg3 + 17, var19.method50(arg3 + 25826));
        int var21 = var19.method66(arg3 - 7115) & 0x3;
        if (var20.field1838 != -1) {
            class85.method553(var21, arg8, var20, true, arg6, arg5);
            return;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V")
    public final void method121(byte arg0) {
        field222++;
        if (arg0 != -57) {
            this.field230 = -12;
        }
        if (this.field230 > 0) {
            this.field241.method1770(-7936, this.field230, this.method119(-94));
            this.field230 = 0;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)V")
    private final void method122(int arg0, int arg1) {
        this.field241.field4095 -= arg0;
        if (arg1 != -23323) {
            method120(82, -82, 42, (byte) -73, -99, -56, null, 35, 91);
        }
        field226++;
        this.field241.field4095 += this.method119(107);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZZ)V")
    public final void method123(boolean arg0, boolean arg1) {
        if (arg0) {
            return;
        }
        field225++;
        if (this.field228 != arg1) {
            this.field228 = arg1;
            this.method118(-103);
        }
    }

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "(I)Z")
    public final boolean method124(int arg0) {
        if (arg0 < 119) {
            return false;
        }
        field220++;
        if (!this.field241.field4159) {
            return false;
        }
        int var2 = this.method119(33);
        this.field241.method1787(this, (byte) 121);
        OpenGL.glGenerateMipmapEXT(this.field240);
        this.field232 = true;
        this.method118(85);
        this.method122(var2, -23323);
        return true;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method125(int arg0, char arg1, String arg2) {
        field221++;
        if (arg0 <= 6) {
            field242 = null;
        }
        int var3 = class252.method1648(-27917, arg1, arg2);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2.charAt(var8) != arg1; var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZB)V")
    public final void method126(boolean arg0, byte arg1) {
        field227++;
        if (this.field232 != arg0) {
            int var3 = this.method119(59);
            this.field232 = true;
            this.method118(77);
            this.method122(var3, -23323);
        }
        int var4 = -77 % ((-arg1 - 16) / 33);
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lbv;IIIZ)V")
    public class14(class282 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field223 = arg2;
        this.field236 = arg3;
        this.field241 = arg0;
        this.field240 = arg1;
        this.field232 = arg4;
        OpenGL.glGenTextures(1, class24.field398, 0);
        this.field230 = class24.field398[0];
        this.method122(0, -23323);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)V")
    public abstract void method127(boolean arg0);

    // $FF: synthetic method
    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method128(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class375(null, "Dieses System darf nicht missbraucht werden!", null, null);
        field244 = -1;
    }
}
