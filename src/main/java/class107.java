import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class107 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Z")
    public static boolean field1498 = false;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "Lch;")
    public static class151 field1499 = new class151("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "[B")
    public static byte[] field1503 = new byte[520];

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Lld;")
    public static class73 field1502;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 7)
    public static void method852(int arg0) {
        int var1 = 16 % ((arg0 - 70) / 37);
        field1499 = null;
        field1503 = null;
        field1502 = null;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)[Lvt;", line = 19)
    public static final class473[] method853(int arg0) {
        field1500++;
        if (class186.field2792 == null) {
            class473[] var1 = class175.method1267(2, class436.field6206);
            class473[] var2 = new class473[var1.length];
            int var3 = 0;
            label67: for (int var4 = 0; var4 < var1.length; var4++) {
                class473 var8 = var1[var4];
                if ((var8.field6654 <= 0 || var8.field6654 >= 24) && var8.field6661 >= 800 && var8.field6656 >= 600 && (class364.field5008 >= 96 || class377.field5192 != 0 || var8.field6661 <= 1024 && var8.field6656 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class473 var10 = var2[var9];
                        if (var8.field6661 == var10.field6661 && var8.field6656 == var10.field6656) {
                            if (var8.field6654 > var10.field6654) {
                                var2[var9] = var8;
                            }
                            continue label67;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class186.field2792 = new class473[var3];
            class214.method1448(var2, 0, class186.field2792, 0, var3);
            int[] var5 = new int[class186.field2792.length];
            for (int var6 = 0; var6 < class186.field2792.length; var6++) {
                class473 var7 = class186.field2792[var6];
                var5[var6] = var7.field6661 * var7.field6656;
            }
            class145.method1036(class186.field2792, var5, (byte) 91);
        }
        if (arg0 != -1829) {
            field1503 = null;
        }
        return class186.field2792;
    }
}
