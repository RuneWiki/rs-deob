import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class81 extends class517 {

    @OriginalMember(owner = "client!u", name = "G", descriptor = "I")
    private int field914;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field925 = new String[] { method707(method706("gZFw")), method707(method706("gZBw")), method707(method706("gZGw")), method707(method706("gZEw")), method707(method706("|\u0001h3")), method707(method706("gZ86v{\u0000:w")), method707(method706("iZ*qe")) };

    @OriginalMember(owner = "client!u", name = "A", descriptor = "Lwia;")
    public static class790 field915 = new class790(62, -1);

    @OriginalMember(owner = "client!u", name = "D", descriptor = "[S")
    private static short[] field918 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!u", name = "K", descriptor = "[S")
    private static short[] field920 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!u", name = "F", descriptor = "[S")
    private static short[] field923 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!u", name = "C", descriptor = "[S")
    private static short[] field921 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!u", name = "B", descriptor = "[[S")
    public static short[][] field919 = new short[][] { field918, field920, field921, field923 };

    @OriginalMember(owner = "client!u", name = "z", descriptor = "F")
    public static float field916;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "Lmj;")
    public static class680 field924;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "[B")
    public static byte[] field912;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "[I")
    public static int[] field922;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIII)Lec;", line = 8)
    public static final class247 method702(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field917;
            class96 var4 = class734.field10683[arg1][arg3][arg2];
            if (var4 == null) {
                return null;
            } else {
                class247 var5 = null;
                int var6 = -1;
                for (class681 var7 = var4.field1085; var7 != null; var7 = var7.field9865) {
                    class343 var8 = var7.field9867;
                    if (var8 instanceof class247) {
                        class247 var9 = (class247) var8;
                        int var10 = -4 + 256 * var9.method2101(31463);
                        int var11 = var9.field6197 - var10 >> 9;
                        int var12 = var9.field6211 - var10 >> 9;
                        int var13 = var9.field6197 - -var10 >> 9;
                        int var14 = var9.field6211 + var10 >> 9;
                        if (~var11 >= ~arg3 && var12 <= arg2 && var13 >= arg3 && ~var14 <= ~arg2) {
                            int var15 = (var13 + 1 + -arg3) * (var14 + 1 + -arg2);
                            if (var15 > var6) {
                                var6 = var15;
                                var5 = var9;
                            }
                        }
                    }
                }
                if (arg0 >= -35) {
                    method702(-90, -114, -13, 59);
                }
                return var5;
            }
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field925[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZZ)V", line = 72)
    public final void method703(boolean arg0, boolean arg1) {
        try {
            super.field7474.method1733(this, 17237);
            ++field913;
            if (arg1) {
                field923 = null;
            }
            OpenGL.glTexParameteri(super.field7473, 10242, !arg0 ? 33071 : 10497);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field925[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V", line = 84)
    public static void method704(int arg0) {
        try {
            if (arg0 != 10242) {
                field923 = null;
            }
            field923 = null;
            field924 = null;
            field921 = null;
            field918 = null;
            field920 = null;
            field922 = null;
            field919 = null;
            field912 = null;
            field915 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field925[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lffa;II[BI)V", line = 102)
    public class81(class197 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        try {
            this.field914 = arg2;
            super.field7474.method1733(this, 17237);
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glTexImage1Dub(super.field7473, 0, super.field7464, this.field914, 0, arg4, 5121, arg3, 0);
            OpenGL.glPixelStorei(3317, 4);
            this.method3923(25768, true);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field925[5] + (arg0 != null ? field925[6] : field925[4]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field925[6] : field925[4]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 116)
    public final void method705(int arg0) {
        try {
            if (arg0 < -115) {
                ++field911;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field925[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!u", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method706(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 24);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!u", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method707(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 18;
                    break;
                case 1:
                    var10005 = 116;
                    break;
                case 2:
                    var10005 = 4;
                    break;
                case 3:
                    var10005 = 95;
                    break;
                default:
                    var10005 = 24;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
