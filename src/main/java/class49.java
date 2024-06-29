import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class49 extends class200 {

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "Ldj;")
    private static class44 field910 = class89.method650(255, "This computers address has been blocked");

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "Ldj;")
    public static class44 field914 = class89.method650(255, " GMT");

    @OriginalMember(owner = "client!ed", name = "V", descriptor = "Ldj;")
    public static class44 field915 = field910;

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "Ldj;")
    public static class44 field905 = class89.method650(255, "sl_flags");

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "[Lbc;")
    public static class15[] field913 = new class15[24];

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "[S")
    public static short[] field908 = new short[] { 11, 2, 29, 4, 51, 48, 36, 13 };

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
    public int field907;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "I")
    public int field916;

    @OriginalMember(owner = "client!ed", name = "X", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!ed", name = "Y", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!ed", name = "Z", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "[I")
    public static int[] field912;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILfj;)V")
    public final void method357(int arg0, class66 arg1) {
        if (arg0 > -24) {
            method361((byte) -92);
        }
        while (true) {
            int var3 = arg1.method506(255);
            if (var3 == 0) {
                field904++;
                return;
            }
            this.method363(arg1, (byte) -121, var3);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIII)V")
    public static final void method358(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg1; var6 <= arg1 + arg3; var6++) {
            for (int var11 = arg4; var11 <= arg4 + arg0; var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class156.field2706[arg2][var11][var6] = 127;
                }
            }
        }
        if (arg5 != 104) {
            field913 = null;
        }
        field909++;
        for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
            for (int var10 = arg4; var10 < arg0 + arg4; var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class211.field3771[arg2][var10][var7] = arg2 > 0 ? class211.field3771[arg2 - 1][var10][var7] : 0;
                }
            }
        }
        if (arg4 > 0 && arg4 < 104) {
            for (int var8 = arg1 + 1; var8 < arg1 + arg3; var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class211.field3771[arg2][arg4][var8] = class211.field3771[arg2][arg4 - 1][var8];
                }
            }
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var9 = arg4 + 1; var9 < arg0 + arg4; var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class211.field3771[arg2][var9][arg1] = class211.field3771[arg2][var9][arg1 - 1];
                }
            }
        }
        if (arg4 < 0 || arg1 < 0 || arg4 >= 104 || arg1 >= 104) {
            return;
        }
        if (arg2 != 0) {
            if (arg4 > 0 && class211.field3771[arg2 - 1][arg4 - 1][arg1] != class211.field3771[arg2][arg4 - 1][arg1]) {
                class211.field3771[arg2][arg4][arg1] = class211.field3771[arg2][arg4 - 1][arg1];
                return;
            }
            if (arg1 > 0 && class211.field3771[arg2 - 1][arg4][arg1 - 1] != class211.field3771[arg2][arg4][arg1 - 1]) {
                class211.field3771[arg2][arg4][arg1] = class211.field3771[arg2][arg4][arg1 - 1];
                return;
            }
            if (arg4 > 0 && arg1 > 0 && class211.field3771[arg2 - 1][arg4 - 1][arg1 - 1] != class211.field3771[arg2][arg4 - 1][arg1 - 1]) {
                class211.field3771[arg2][arg4][arg1] = class211.field3771[arg2][arg4 - 1][arg1 - 1];
                return;
            }
            return;
        }
        if (arg4 > 0 && class211.field3771[arg2][arg4 - 1][arg1] != 0) {
            class211.field3771[arg2][arg4][arg1] = class211.field3771[arg2][arg4 - 1][arg1];
            return;
        }
        if (arg1 > 0 && class211.field3771[arg2][arg4][arg1 - 1] != 0) {
            class211.field3771[arg2][arg4][arg1] = class211.field3771[arg2][arg4][arg1 - 1];
            return;
        }
        if (arg4 > 0 && arg1 > 0 && class211.field3771[arg2][arg4 - 1][arg1 - 1] != 0) {
            class211.field3771[arg2][arg4][arg1] = class211.field3771[arg2][arg4 - 1][arg1 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method359(Component arg0, byte arg1) {
        field911++;
        int var2 = 112 / ((3 - arg1) / 47);
        arg0.addMouseListener(class119.field2117);
        arg0.addMouseMotionListener(class119.field2117);
        arg0.addFocusListener(class119.field2117);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZILdj;)V")
    public static final void method360(boolean arg0, int arg1, class44 arg2) {
        field919++;
        class44 var3 = arg2.method312(65);
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = arg1; var6 < class170.field2950; var6++) {
            class214 var9 = class192.method1227(-31700, var6);
            if ((!arg0 || var9.field3871) && var9.field3864 == -1 && var9.field3866 == -1 && var9.field3837.method312(arg1 ^ 0x41).method297(88, var3) != -1) {
                if (var5 >= 250) {
                    class151.field2638 = -1;
                    class2.field25 = null;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class2.field25 = var4;
        class145.field2558 = 0;
        class151.field2638 = var5;
        class44[] var7 = new class44[class151.field2638];
        for (int var8 = 0; var8 < class151.field2638; var8++) {
            var7[var8] = class192.method1227(arg1 - 31700, var4[var8]).field3837;
        }
        class208.method1355(var7, class2.field25, (byte) 97);
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)V")
    public static void method361(byte arg0) {
        field913 = null;
        field910 = null;
        field912 = null;
        field914 = null;
        field908 = null;
        if (arg0 != 16) {
            field910 = null;
        }
        field915 = null;
        field905 = null;
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)I")
    public static final int method362(byte arg0) {
        field918++;
        int var1 = 102 / ((-arg0 - 14) / 41);
        return class30.field535;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lfj;BI)V")
    private final void method363(class66 arg0, byte arg1, int arg2) {
        field917++;
        if (arg2 == 1) {
            this.field907 = arg0.method500(51);
            this.field906 = arg0.method506(255);
            this.field916 = arg0.method506(255);
        }
        int var4 = -41 / ((-arg1 - 57) / 63);
    }
}
