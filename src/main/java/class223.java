import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class223 {

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3424 = new String[] { method1939(method1938("&X-\u0013O")), method1939(method1938("&X-\u0012O")), method1939(method1938("-\\o<")), method1939(method1938("\u0010Ab4\u00021\to9\t(@m7G%Hj<\u0002'\u0013")), method1939(method1938("8\u0007-~\u001a")), method1939(method1938("&X-\u0014O")), method1939(method1938("&X-\u0011O")), method1939(method1938("&X-\u0015O")), method1939(method1938("\u0006[q?\u0015y\t")), method1939(method1938("f\u0019b")) };

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "J")
    public static long field3420 = 0L;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
    public static int field3422 = 0;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "[I")
    public static int[] field3421 = new int[14];

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "([Lhu;ZLrda;)Lbga;")
    public static final class375 method1932(class143[] arg0, boolean arg1, class690 arg2) {
        try {
            field3423++;
            for (int var3 = 0; var3 < arg0.length; var3++) {
                if (arg0[var3] == null || arg0[var3].field1720 <= 0L) {
                    return null;
                }
            }
            long var4 = OpenGL.glCreateProgramObjectARB();
            for (int var6 = 0; var6 < arg0.length; var6++) {
                OpenGL.glAttachObjectARB(var4, arg0[var6].field1720);
            }
            OpenGL.glLinkProgramARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35714, class536.field7839, 0);
            if (!arg1) {
                field3422 = -7;
            }
            if (class536.field7839[0] == 0) {
                if (class536.field7839[0] == 0) {
                    System.out.println(field3424[3]);
                }
                OpenGL.glGetObjectParameterivARB(var4, 35716, class536.field7839, 1);
                if (class536.field7839[1] > 1) {
                    byte[] var7 = new byte[class536.field7839[1]];
                    OpenGL.glGetInfoLogARB(var4, class536.field7839[1], class536.field7839, 0, var7, 0);
                    System.out.println(new String(var7));
                }
                if (class536.field7839[0] == 0) {
                    for (int var8 = 0; var8 < arg0.length; var8++) {
                        OpenGL.glDetachObjectARB(var4, arg0[var8].field1720);
                    }
                    OpenGL.glDeleteObjectARB(var4);
                    return null;
                }
            }
            return new class375(arg2, var4, arg0);
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field3424[1] + (arg0 == null ? field3424[2] : field3424[4]) + ',' + arg1 + ',' + (arg2 == null ? field3424[2] : field3424[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIBIIII)V")
    public static final void method1933(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            int var7 = 38 / ((arg2 - 36) / 63);
            if (arg3 >= class200.field3119 && class676.field9797 >= arg1 && class676.field9807 <= arg6 && arg0 <= class381.field5786) {
                if (arg4 == 1) {
                    class113.method995(arg1, arg6, arg3, arg5, (byte) 21, arg0);
                } else {
                    class173.method1533(arg5, arg6, arg1, (byte) 72, arg4, arg0, arg3);
                }
            } else if (arg4 == 1) {
                class475.method3606(arg1, arg6, arg0, arg3, (byte) 7, arg5);
            } else {
                class435.method3326(arg0, arg6, arg5, arg1, -41, arg3, arg4);
            }
            field3418++;
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field3424[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
    public static final void method1934(int arg0) {
        try {
            class582.field8619 = 0;
            class153.field1893 = -1;
            class12.field142 = -1;
            if (arg0 != 1380) {
                field3421 = null;
            }
            field3419++;
            class492.field7065 = -1;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3424[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V")
    public static void method1935(byte arg0) {
        try {
            field3421 = null;
            if (arg0 != 40) {
                method1936(null, 28);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3424[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1936(String arg0, int arg1) {
        field3416++;
        System.out.println(field3424[8] + class217.method1895(arg0, field3424[9], "\n", (byte) 14));
        if (arg1 != -2) {
            field3420 = -43L;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZIZ)V")
    public static final void method1937(boolean arg0, int arg1, boolean arg2) {
        try {
            field3417++;
            if (arg0) {
                class634.field9241--;
                if (class634.field9241 == 0) {
                    class172.field2403 = null;
                }
            }
            if (arg1 != -9743) {
                field3422 = 3;
            }
            if (arg2) {
                class766.field11075--;
                if (class766.field11075 == 0) {
                    class151.field1862 = null;
                    return;
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3424[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1938(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x67);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1939(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 67;
                    break;
                case 1:
                    var10005 = 41;
                    break;
                case 2:
                    var10005 = 3;
                    break;
                case 3:
                    var10005 = 80;
                    break;
                default:
                    var10005 = 103;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
