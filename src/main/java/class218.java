import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class218 {

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Lnf;")
    public static class162 field3329 = new class162(64);

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Z")
    public static boolean field3334 = false;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Z")
    public static boolean field3335 = true;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3332 = null;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method1500(int arg0) {
        field3329 = null;
        int var1 = -86 / ((arg0 + 30) / 43);
        field3332 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)Lqk;")
    public static final class219 method1501(boolean arg0, int arg1) {
        if (arg0) {
            method1500(-86);
        }
        field3331++;
        class219 var2 = (class219) class179.field2813.method1361((byte) -95, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class114.field1750.method721((byte) -117, arg1, 0);
        if (var3 == null) {
            return null;
        }
        class219 var4 = new class219();
        class31 var5 = new class31(var3);
        var5.field541 = var5.field560.length - 2;
        int var6 = var5.method260((byte) -67);
        int var7 = var5.field560.length - var6 - 2 - 12;
        var5.field541 = var7;
        int var8 = var5.method300((byte) -30);
        var4.field3346 = var5.method260((byte) -67);
        var4.field3345 = var5.method260((byte) -67);
        var4.field3338 = var5.method260((byte) -67);
        var4.field3336 = var5.method260((byte) -67);
        int var9 = var5.method265(-92);
        if (var9 > 0) {
            var4.field3339 = new class305[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method260((byte) -67);
                class305 var12 = new class305(class126.method945(var11, true));
                var4.field3339[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method300((byte) -30);
                    int var14 = var5.method300((byte) -30);
                    var12.method2046(new class283(var14), -63, (long) var13);
                }
            }
        }
        var5.field541 = 0;
        var4.field3348 = var5.method314(-1);
        var4.field3347 = new int[var8];
        var4.field3344 = new int[var8];
        var4.field3341 = new String[var8];
        int var15 = 0;
        while (var5.field541 < var7) {
            int var16 = var5.method260((byte) -67);
            if (var16 == 3) {
                var4.field3341[var15] = var5.method262(11386).intern();
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field3347[var15] = var5.method265(-108);
            } else {
                var4.field3347[var15] = var5.method300((byte) -30);
            }
            var4.field3344[var15++] = var16;
        }
        class179.field2813.method1365((long) arg1, (byte) 13, var4);
        return var4;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BC)Z")
    public static final boolean method1502(byte arg0, char arg1) {
        field3330++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg0 >= -74) {
            return false;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }
}
