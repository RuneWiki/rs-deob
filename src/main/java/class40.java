import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class40 {

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field908 = 0;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "Lkh;")
    public static class117 field913 = class224.method1450((byte) 12, "(U");

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Lkh;")
    private static class117 field909 = class224.method1450((byte) -79, "Sorry invited players only)3");

    @OriginalMember(owner = "client!df", name = "b", descriptor = "[I")
    public static int[] field907 = new int[500];

    @OriginalMember(owner = "client!df", name = "l", descriptor = "[I")
    public static int[] field917 = new int[5];

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Lkh;")
    public static class117 field906 = field909;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "Lkh;")
    public static class117 field918 = class224.method1450((byte) 112, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field916 = 0;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "Lkh;")
    private static class117 field924 = class224.method1450((byte) 115, "Loading sprites )2 ");

    @OriginalMember(owner = "client!df", name = "r", descriptor = "Lkh;")
    public static class117 field923 = field924;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Lnc;")
    public static class145 field910;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "Lnc;")
    public static class145 field920;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "[I")
    public static int[] field912;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIB)I")
    public static final int method349(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field921++;
        int var5 = -4 / ((arg4 + 56) / 44);
        int var6 = 65536 - class89.field1646[arg3 * 1024 / arg2] >> 1;
        return ((65536 - var6) * arg0 >> 16) + (arg1 * var6 >> 16);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public static void method350(byte arg0) {
        field913 = null;
        int var1 = 55 / ((arg0 + 17) / 45);
        field918 = null;
        field924 = null;
        field907 = null;
        field912 = null;
        field920 = null;
        field917 = null;
        field906 = null;
        field910 = null;
        field923 = null;
        field909 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B[B)V")
    public static final void method351(byte arg0, byte[] arg1) {
        field922++;
        class145 var2 = new class145(arg1);
        int var3 = var2.method1049((byte) 104);
        for (int var4 = 0; var4 < var3; var4++) {
            class72 var6 = new class72();
            class117 var7 = var2.method1038(64);
            var6.field1381 = var2.method1049((byte) 102);
            var6.field1384 = var2.method1049((byte) 95);
            var6.field1378 = var2.method998(111);
            var6.field1388 = var7.method797(47, 32, 5996);
            var6.field1386 = var7.method791((byte) -68, 47);
            class41.field931.method325(120, var6);
        }
        int var5 = 11 % ((70 - arg0) / 53);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)I")
    public static int method352(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII)I")
    public static final int method353(int arg0, int arg1, int arg2, int arg3) {
        field915++;
        if ((class233.field4200[arg1][arg2][arg0] & 0x8) != 0) {
            return 0;
        } else if (arg3 >= -52) {
            return 67;
        } else if (arg1 <= 0 || (class233.field4200[1][arg2][arg0] & 0x2) == 0) {
            return arg1;
        } else {
            return arg1 - 1;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IZIIIII)V")
    public static final void method354(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field919++;
        int var7 = arg3 + arg5;
        int var8 = arg4 - arg3;
        if (!arg1) {
            field918 = null;
        }
        int var9 = arg6 - arg3;
        int var10 = arg0 + arg3;
        for (int var11 = arg5; var11 < var7; var11++) {
            class114.method762(arg0, 99, arg6, arg2, class167.field3030[var11]);
        }
        for (int var12 = arg4; var12 > var8; var12--) {
            class114.method762(arg0, 113, arg6, arg2, class167.field3030[var12]);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class167.field3030[var13];
            class114.method762(arg0, 86, var10, arg2, var14);
            class114.method762(var9, 122, arg6, arg2, var14);
        }
    }
}
