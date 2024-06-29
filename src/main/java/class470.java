import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class470 {

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "Ljw;")
    public static class581 field6509 = new class581(124, 3);

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)[Lpia;")
    public static final class103[] method2770(byte arg0) {
        int var1 = 56 % ((-arg0 - 17) / 60);
        if (class29.field423 == null) {
            class103[] var2 = class722.method4027(-122, class730.field10124);
            class103[] var3 = new class103[var2.length];
            int var4 = 0;
            int var5 = class712.field9959.field1293.method1488(77);
            label70: for (int var6 = 0; var6 < var2.length; var6++) {
                class103 var10 = var2[var6];
                if ((var10.field1418 <= 0 || var10.field1418 >= 24) && var10.field1420 >= 800 && var10.field1419 >= 600 && (var5 != 2 || var10.field1420 <= 800 && var10.field1419 <= 600) && (var5 != 1 || var10.field1420 <= 1024 && var10.field1419 <= 768)) {
                    for (int var11 = 0; var11 < var4; var11++) {
                        class103 var12 = var3[var11];
                        if (var10.field1420 == var12.field1420 && var10.field1419 == var12.field1419) {
                            if (var10.field1418 > var12.field1418) {
                                var3[var11] = var10;
                            }
                            continue label70;
                        }
                    }
                    var3[var4] = var10;
                    var4++;
                }
            }
            class29.field423 = new class103[var4];
            class278.method1799(var3, 0, class29.field423, 0, var4);
            int[] var7 = new int[class29.field423.length];
            for (int var8 = 0; var8 < class29.field423.length; var8++) {
                class103 var9 = class29.field423[var8];
                var7[var8] = var9.field1420 * var9.field1419;
            }
            class617.method3391((byte) 66, var7, class29.field423);
        }
        field6508++;
        return class29.field423;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
    public static void method2771(int arg0) {
        if (arg0 > 24) {
            field6509 = null;
        }
    }
}
