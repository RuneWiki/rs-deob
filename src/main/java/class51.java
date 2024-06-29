import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class51 extends class171 {

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
    public static int field918 = 0;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "Lok;")
    public static class146 field924 = class235.method1724(-12908, "Nehmen");

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "Lok;")
    public static class146 field916 = class235.method1724(-12908, "M");

    @OriginalMember(owner = "client!bj", name = "E", descriptor = "I")
    public static int field920 = -1;

    @OriginalMember(owner = "client!bj", name = "Q", descriptor = "[S")
    public static short[] field932 = new short[] { 3, 59, 26, 43, 45, 6, 9, 37 };

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "I")
    public int field914;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "I")
    public int field915;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "I")
    public int field917;

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "I")
    public int field921;

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "I")
    public int field922;

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "I")
    public int field929;

    @OriginalMember(owner = "client!bj", name = "O", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!bj", name = "P", descriptor = "I")
    public int field931;

    @OriginalMember(owner = "client!bj", name = "R", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!bj", name = "S", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "client!bj", name = "T", descriptor = "I")
    public int field935;

    @OriginalMember(owner = "client!bj", name = "U", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!bj", name = "V", descriptor = "I")
    public int field937;

    @OriginalMember(owner = "client!bj", name = "W", descriptor = "I")
    public int field938;

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "Lge;")
    public class149 field923;

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "Lrl;")
    public class189 field928;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "Lid;")
    public class253 field912;

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "Lr;")
    public static class264 field927;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "Lrg;")
    public class92 field926;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BLok;)Z", line = 31)
    public static final boolean method414(byte arg0, class146 arg1) {
        if (arg0 != 111) {
            method416(65);
        }
        field933++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class226.field3772; var2++) {
            if (arg1.method1106(class303.field5198[var2], arg0 - 24)) {
                return true;
            }
        }
        if (arg1.method1106(class102.field1639.field3891, arg0 ^ 0x1B)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(II)I", line = 67)
    public static final int method415(int arg0, int arg1) {
        field906++;
        int var2 = arg1 & 0x3F;
        int var3 = arg1 >> 6 & 0x3;
        if (arg0 == var2) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)[F", line = 116)
    public static final float[] method416(int arg0) {
        field936++;
        float var1 = class231.method1698() + class231.method1695();
        int var2 = class231.method1694();
        class36.field660[3] = 1.0F;
        int var3 = -74 % ((arg0 + 54) / 56);
        float var4 = (float) (var2 & 0xFF) / 255.0F;
        float var5 = (float) (var2 >> 16 & 0xFF) / 255.0F;
        float var6 = (float) ((var2 & 0xFF99) >> 8) / 255.0F;
        float var7 = 0.58823526F;
        class36.field660[0] = class118.field1892[0] * var5 * var7 * var1;
        class36.field660[2] = class118.field1892[2] * var4 * var7 * var1;
        class36.field660[1] = class118.field1892[1] * var6 * var7 * var1;
        return class36.field660;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V", line = 153)
    public static void method417(byte arg0) {
        field927 = null;
        field932 = null;
        field924 = null;
        if (arg0 == -112) {
            field916 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIIIIII)V", line = 181)
    public static final void method418(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field930++;
        class185 var10 = (class185) class225.field3751.method1251(100);
        class185 var11 = null;
        while (var10 != null) {
            if (var10.field3075 == arg2 && var10.field3095 == arg5 && var10.field3087 == arg8 && var10.field3085 == arg3) {
                var11 = var10;
                break;
            }
            var10 = (class185) class225.field3751.method1253(59);
        }
        if (var11 == null) {
            var11 = new class185();
            var11.field3095 = arg5;
            var11.field3075 = arg2;
            var11.field3085 = arg3;
            var11.field3087 = arg8;
            class52.method421(Integer.MAX_VALUE, var11);
            class225.field3751.method1258(0, var11);
        }
        var11.field3090 = arg1;
        var11.field3089 = arg7;
        if (arg6 == 128) {
            var11.field3078 = arg9;
            var11.field3077 = arg4;
            var11.field3096 = arg0;
        }
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)V", line = 226)
    public final void method419(int arg0) {
        if (arg0 != 25988) {
            field927 = (class264) null;
        }
        this.field928 = null;
        this.field926 = null;
        this.field912 = null;
        this.field923 = null;
        field907++;
    }
}
