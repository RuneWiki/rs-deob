import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dka")
public class class12 extends class224 {

    @OriginalMember(owner = "client!dka", name = "v", descriptor = "I")
    private int field140 = -1;

    @OriginalMember(owner = "client!dka", name = "u", descriptor = "I")
    private int field142 = -1;

    @OriginalMember(owner = "client!dka", name = "B", descriptor = "I")
    public int field141;

    @OriginalMember(owner = "client!dka", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field145 = new String[] { method90(method89("ePf5")), method90(method89("p\u000b$wF")), method90(method89("oNkw\u0007bKc-\u0005#")), method90(method89("oNkwy#")), method90(method89("oNkwx#")), method90(method89("oNkwz#")), method90(method89("oNkw}#")) };

    @OriginalMember(owner = "client!dka", name = "z", descriptor = "Liha;")
    public static class29 field137 = new class29(5);

    @OriginalMember(owner = "client!dka", name = "y", descriptor = "[I")
    public static int[] field138 = new int[1];

    @OriginalMember(owner = "client!dka", name = "t", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!dka", name = "s", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!dka", name = "x", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!dka", name = "w", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!dka", name = "<init>", descriptor = "(Lvf;II)V", line = 3)
    public class12(class159 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        try {
            this.field141 = arg2;
            super.field3517.method1497(this, true);
            for (int var4 = 0; ~var4 > -7; ++var4) {
                OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field3516, arg2, arg2, 0, class126.method1215(13522, super.field3516), 5121, (byte[]) null, 0);
            }
            this.method1967(-119, true);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field145[2] + (arg0 != null ? field145[1] : field145[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "e", descriptor = "(I)V", line = 21)
    public static void method85(int arg0) {
        try {
            if (arg0 != 5366) {
                method87((byte) 122, 54, 101, (String[]) null);
            }
            field138 = null;
            field137 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field145[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(I)V", line = 32)
    public final void method86(int arg0) {
        try {
            ++field136;
            OpenGL.glFramebufferTexture2DEXT(this.field140, this.field142, 3553, arg0, 0);
            this.field140 = -1;
            this.field142 = -1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field145[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(BII[Ljava/lang/String;)Ljava/lang/String;", line = 43)
    public static final String method87(byte arg0, int arg1, int arg2, String[] arg3) {
        try {
            ++field144;
            if (arg1 == 0) {
                return "";
            } else if (~arg1 == -2) {
                String var4 = arg3[arg2];
                return var4 == null ? field145[0] : var4.toString();
            } else {
                int var5 = arg1 + arg2;
                int var6 = 0;
                for (int var7 = arg2; var5 > var7; ++var7) {
                    String var8 = arg3[var7];
                    if (var8 == null) {
                        var6 += 4;
                    } else {
                        var6 += var8.length();
                    }
                }
                if (arg0 != 39) {
                    method87((byte) -74, -2, 115, (String[]) null);
                }
                StringBuffer var9 = new StringBuffer(var6);
                for (int var10 = arg2; var5 > var10; ++var10) {
                    String var11 = arg3[var10];
                    if (var11 != null) {
                        var9.append(var11);
                    } else {
                        var9.append(field145[0]);
                    }
                }
                return var9.toString();
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field145[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field145[1] : field145[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "<init>", descriptor = "(Lvf;IIZ[[I)V", line = 109)
    public class12(class159 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        try {
            this.field141 = arg2;
            super.field3517.method1497(this, true);
            if (!arg3) {
                for (int var6 = 0; ~var6 > -7; ++var6) {
                    OpenGL.glTexImage2Di(34069 - -var6, 0, super.field3516, arg2, arg2, 0, 32993, super.field3517.field2490, arg4[var6], 0);
                }
            } else {
                for (int var7 = 0; ~var7 > -7; ++var7) {
                    class78.method818(arg2, arg4[var7], 32993, var7 + 34069, super.field3517.field2490, super.field3516, arg2, false);
                }
            }
            this.method1967(-123, true);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field145[2] + (arg0 != null ? field145[1] : field145[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field145[1] : field145[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "<init>", descriptor = "(Lvf;IIZ[[BI)V", line = 148)
    public class12(class159 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        try {
            this.field141 = arg2;
            super.field3517.method1497(this, true);
            for (int var7 = 0; ~var7 > -7; ++var7) {
                OpenGL.glTexImage2Dub(34069 - -var7, 0, super.field3516, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
            }
            this.method1967(-123, true);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field145[2] + (arg0 != null ? field145[1] : field145[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field145[1] : field145[0]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(IBIII)V", line = 171)
    public final void method88(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        try {
            ++field139;
            OpenGL.glFramebufferTexture2DEXT(arg3, arg2, arg4, super.field3515, arg0);
            this.field142 = arg2;
            this.field140 = arg3;
            if (arg1 != -22) {
                this.field142 = -13;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field145[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!dka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method89(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 59);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method90(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 11;
                    break;
                case 1:
                    var10005 = 37;
                    break;
                case 2:
                    var10005 = 10;
                    break;
                case 3:
                    var10005 = 89;
                    break;
                default:
                    var10005 = 59;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
