import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class746 {

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public static int field10326 = 0;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "Lfh;")
    public static class652 field10327 = new class652("WTWIP", 3);

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "Z")
    public static boolean field10331 = true;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "Lwq;")
    public static class169 field10332 = new class169(4);

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field10328;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public static int field10329;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public static int field10330;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    public static int field10333;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "Lmi;")
    public static class496 field10334;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(FFFFIFBF)F", line = 3)
    public static final float method4160(float arg0, float arg1, float arg2, float arg3, int arg4, float arg5, byte arg6, float arg7) {
        field10329++;
        float var8 = 0.0F;
        float var9 = arg1 - arg5;
        float var10 = arg7 - arg0;
        float var11 = arg3 - arg2;
        if (arg6 < 99) {
            method4163(-13, -42, false);
        }
        float var12 = 0.0F;
        float var13 = 0.0F;
        float var14 = 0.0F;
        while (var8 < 1.1F) {
            float var15 = var8 * var9 + arg5;
            float var16 = var8 * var10 + arg0;
            float var17 = var8 * var11 + arg2;
            int var18 = (int) var15 >> 9;
            int var19 = (int) var17 >> 9;
            if (var18 > 0 && var19 > 0 && var18 < class376.field5325 && class175.field2711 > var19) {
                int var20 = class58.field1147.field5926;
                if (var20 < 3 && (class607.field8331[1][var18][var19] & 0x2) != 0) {
                    var20++;
                }
                int var21 = class465.field6517[var20].method1853((int) var15, (int) var17, (byte) 109);
                if (var16 > (float) var21) {
                    if (arg4 < 2) {
                        return var8;
                    }
                    return var8 + method4160(var13, var15, var14, var17, arg4 - 1, var12, (byte) 122, var16) * 0.1F - 0.1F;
                }
            }
            var12 = var15;
            var13 = var16;
            var8 += 0.1F;
            var14 = var17;
        }
        return -1.0F;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V", line = 72)
    public static void method4161(byte arg0) {
        field10327 = null;
        if (arg0 < 111) {
            method4161((byte) 17);
        }
        field10332 = null;
        field10334 = null;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V", line = 89)
    public static final void method4162(int arg0) {
        field10330++;
        for (class715 var1 = (class715) class28.field757.method1269(4); var1 != null; var1 = (class715) class28.field757.method1264((byte) 55)) {
            class238 var2 = var1.field9745;
            if (var2.field3464) {
                var1.method2314((byte) 76);
                var2.method1656(false);
            } else if (var2.field3468 <= class641.field8810) {
                var2.method1660(class322.field4464, (byte) -16);
                if (var2.field3464) {
                    var1.method2314((byte) 42);
                } else {
                    class625.method3565(var2, true);
                }
            }
        }
        if (arg0 != -4) {
            field10331 = false;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIZ)V", line = 130)
    public static final void method4163(int arg0, int arg1, boolean arg2) {
        field10328++;
        class387 var3 = class168.field2643[arg0][arg1];
        if (var3 != null) {
            class447.field6331 = var3.field5604;
            class569.field7822 = var3.field5607;
            class51.field1074 = var3.field5617;
        }
        class535.method3085(arg2);
    }
}
