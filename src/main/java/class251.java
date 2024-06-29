import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class251 {

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Leb;")
    public static class230 field4498 = class68.method589(0, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Z")
    public static boolean field4502 = false;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "Leb;")
    public static class230 field4504 = class68.method589(0, ":");

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Z")
    public static boolean field4501 = false;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Leb;")
    public static class230 field4496 = class68.method589(0, "1");

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field4497 = 0;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field4500 = 0;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Z")
    public static boolean field4506 = true;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "Lkf;")
    public static class175 field4499;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Lkk;")
    public static class223 field4494;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public static void method1774(byte arg0) {
        field4498 = null;
        field4494 = null;
        field4504 = null;
        field4499 = null;
        field4496 = null;
        if (arg0 != 75) {
            method1777(-106, 42, false);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)V")
    public static final void method1775(int arg0, int arg1, int arg2) {
        if (class1.field3 > 0) {
            class78.method647(class1.field3, 128);
            class1.field3 = 0;
        }
        field4505++;
        int var3 = 0;
        short var4 = 256;
        int var5 = class87.field1523 * arg1;
        int var6 = 0;
        if (arg0 != 16823) {
            field4494 = null;
        }
        for (int var7 = 1; var7 < var4 - 1; var7++) {
            int var8 = (var4 - var7) * class209.field3659[var7] / var4;
            if (var8 < 0) {
                var8 = 0;
            }
            var3 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class209.field3655[var3++];
                int var12 = class87.field1516[arg2 + var5++];
                if (var11 == 0) {
                    class182.field3165.field165[var6++] = var12;
                } else {
                    int var13 = 256 - var11 - 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = var11 + 18;
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    int var15 = class178.field3137[var11];
                    class182.field3165.field165[var6++] = class189.method1350(var14 * class189.method1350(65280, var15) + (var13 * class189.method1350(var12, 65280)), 16711680) + class189.method1350(var14 * class189.method1350(var15, 16711935) + (var13 * class189.method1350(16711935, var12)), -16711936) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class182.field3165.field165[var6++] = class87.field1516[arg2 + (var5++)];
            }
            var5 += class87.field1523 - 128;
        }
        class182.field3165.method112(arg2, arg1);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Lbf;")
    public static final class194 method1776(int arg0, int arg1) {
        if (arg1 != 65280) {
            return null;
        }
        field4493++;
        class194 var2 = (class194) class135.field2433.method1125((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class269.field4765.method1546(class81.method660(arg0, false), (byte) -100, class271.method1852(arg0, true));
        class194 var4 = new class194();
        var4.field3480 = arg0;
        if (var3 != null) {
            var4.method1389((byte) -10, new class14(var3));
        }
        var4.method1377(43);
        if (!class114.field2038 && var4.field3459) {
            var4.field3477 = null;
        }
        if (var4.field3448) {
            var4.field3461 = 0;
            var4.field3435 = false;
        }
        class135.field2433.method1129((long) arg0, true, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1777(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return false;
        }
        if (arg1 == 11) {
            arg1 = 10;
        }
        field4495++;
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        class194 var3 = method1776(arg0, 65280);
        return var3.method1384(768, arg1);
    }
}
