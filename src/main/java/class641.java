import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class641 extends class299 {

    @OriginalMember(owner = "client!te", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9201 = new String[] { method4648(method4647("\u0011\u0004U,\u0003")), method4648(method4647("\u0011\u0004U-\u0003")), method4648(method4647("\u001eOU@V")), method4648(method4647("\u000b\u0014\u0017\u0002")), method4648(method4647("\u0011\u0004U*\u0003")), method4648(method4647("\u0011\u0004U'\u0003")), method4648(method4647("6\t\u001a\nN\u0017A\u0017\u0007E\u000e\b\u0015\t\u000b\u0003\u0000\u0012\u0002N\u0001[")), method4648(method4647("\u0011\u0004U(\u0003")), method4648(method4647("\u0011\u0004U)\u0003")), method4648(method4647("\u0011\u0004U$\u0003")), method4648(method4647("\u0011\u0004U+\u0003")), method4648(method4647("\u0011\u0004U&\u0003")), method4648(method4647("\u0011\u0004U/\u0003")) };

    @OriginalMember(owner = "client!te", name = "i", descriptor = "D")
    public static double field9199;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field9188;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field9189;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field9190;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    public static int field9191;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field9193;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field9194;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field9197;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public static int field9198;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public static int field9200;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "Lin;")
    public static class96 field9192;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "[I")
    public static int[] field9195;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "[I")
    public static int[] field9196;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V", line = 7)
    public static void method4641(int arg0) {
        try {
            field9195 = null;
            field9192 = null;
            if (arg0 == 65400) {
                field9196 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9201[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([[BILpj;)V", line = 19)
    public static final void method4642(byte[][] arg0, int arg1, class154 arg2) {
        try {
            ++field9194;
            int[] var3 = new int[] { -1, 0, arg1, 0, 0 };
            int var4 = arg0.length;
            for (int var5 = 0; ~var5 > ~var4; ++var5) {
                byte[] var6 = arg0[var5];
                if (var6 != null) {
                    class176 var7 = new class176(var6);
                    int var8 = class543.field7995[var5] >> 8;
                    int var9 = class543.field7995[var5] & 255;
                    int var10 = var8 * 64 + -class397.field6289;
                    int var11 = var9 * 64 - class141.field2011;
                    class672.method4864(arg1 ^ 108);
                    arg2.method5306(class297.field4841, var11, var7, (byte) -79, class141.field2011, class397.field6289, var10);
                    arg2.method1398(var10, var7, var3, class662.field9437, (byte) 91, var11);
                    if (!arg2.field10721 && ~(class586.field8499 / 8) == ~var8 && class608.field8762 / 8 == var9 && ~var3[0] != 0) {
                        field9192 = class716.field10360.method4314(var3[0], class653.field9349, arg1 + -17494, var3[1], var3[2], var3[3]);
                        class652.field9338 = var3[4];
                    }
                }
            }
            for (int var12 = 0; var4 > var12; ++var12) {
                int var13 = (class543.field7995[var12] >> 8) * 64 + -class397.field6289;
                int var14 = (class543.field7995[var12] & 255) * 64 + -class141.field2011;
                byte[] var15 = arg0[var12];
                if (var15 == null && class608.field8762 < 800) {
                    class672.method4864(117);
                    arg2.method5312(64, var13, 64, var14, 3);
                }
            }
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field9201[4] + (arg0 != null ? field9201[2] : field9201[3]) + ',' + arg1 + ',' + (arg2 != null ? field9201[2] : field9201[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)I", line = 93)
    public final int method852(int arg0, int arg1) {
        try {
            if (arg0 != 1) {
                field9196 = null;
            }
            ++field9190;
            return 1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9201[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)I", line = 104)
    public final int method4643(boolean arg0) {
        try {
            ++field9188;
            return !arg0 ? 77 : super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9201[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(ILes;)V", line = 117)
    public class641(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ)V", line = 123)
    public final void method846(int arg0, boolean arg1) {
        try {
            ++field9189;
            if (!arg1) {
                super.field4849 = arg0;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9201[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ltia;[Ltaa;B)Lqs;", line = 134)
    public static final class630 method4644(class278 arg0, class431[] arg1, byte arg2) {
        try {
            ++field9191;
            for (int var3 = 0; ~var3 > ~arg1.length; ++var3) {
                if (arg1[var3] == null || arg1[var3].field6772 <= 0L) {
                    return null;
                }
            }
            long var4 = OpenGL.glCreateProgramObjectARB();
            for (int var6 = 0; ~arg1.length < ~var6; ++var6) {
                OpenGL.glAttachObjectARB(var4, arg1[var6].field6772);
            }
            OpenGL.glLinkProgramARB(var4);
            if (arg2 <= 37) {
                field9199 = 2.882757309275916D;
            }
            OpenGL.glGetObjectParameterivARB(var4, 35714, class109.field1555, 0);
            if (class109.field1555[0] == 0) {
                if (class109.field1555[0] == 0) {
                    System.out.println(field9201[6]);
                }
                OpenGL.glGetObjectParameterivARB(var4, 35716, class109.field1555, 1);
                if (class109.field1555[1] > 1) {
                    byte[] var7 = new byte[class109.field1555[1]];
                    OpenGL.glGetInfoLogARB(var4, class109.field1555[1], class109.field1555, 0, var7, 0);
                    System.out.println(new String(var7));
                }
                if (class109.field1555[0] == 0) {
                    for (int var8 = 0; var8 < arg1.length; ++var8) {
                        OpenGL.glDetachObjectARB(var4, arg1[var8].field6772);
                    }
                    OpenGL.glDeleteObjectARB(var4);
                    return null;
                }
            }
            return new class630(arg0, var4, arg1);
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field9201[5] + (arg0 != null ? field9201[2] : field9201[3]) + ',' + (arg1 != null ? field9201[2] : field9201[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Les;)V", line = 205)
    public class641(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(II)Ljava/lang/String;", line = 210)
    public static final String method4645(int arg0, int arg1) {
        try {
            if (arg1 > -3) {
                method4644((class278) null, (class431[]) null, (byte) -4);
            }
            ++field9197;
            return (255 & arg0 >> 24) + "." + (arg0 >> 16 & 255) + "." + ((arg0 & 65400) >> 8) + "." + (255 & arg0);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9201[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)Ljava/lang/String;", line = 221)
    public static final String method4646(int arg0) {
        try {
            ++field9193;
            if (arg0 != 0) {
                method4645(1, 31);
            }
            return !class16.field177 && class750.field11049 != null ? class750.field11049.field764 : "";
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9201[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)I", line = 236)
    public final int method847(int arg0) {
        try {
            if (arg0 != 0) {
                field9195 = null;
            }
            ++field9198;
            return 1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9201[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V", line = 247)
    public final void method848(int arg0) {
        try {
            if (arg0 == -20456) {
                ++field9200;
                if (super.field4849 != 1 && super.field4849 != 0) {
                    super.field4849 = this.method847(0);
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9201[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!te", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4647(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 43);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!te", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4648(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 101;
                    break;
                case 1:
                    var10005 = 97;
                    break;
                case 2:
                    var10005 = 123;
                    break;
                case 3:
                    var10005 = 110;
                    break;
                default:
                    var10005 = 43;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
