import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class192 {

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "Lgk;")
    public static class331 field2803 = new class331("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "Lgk;")
    public static class331 field2804 = new class331("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "Lfs;")
    public static class387 field2806;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILcw;)V", line = 5)
    public static final void method1346(int arg0, class120 arg1) {
        arg1.method945(-934);
        field2801++;
        int var2 = class396.field5815;
        class364 var3 = class435.field6375 = class384.field5647[var2] = new class364();
        var3.field1716 = var2;
        int var4 = arg1.method952(-115, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 0x3FFF;
        var3.field1777[0] = var6 - class340.field4713;
        int var7 = var4 & 0x3FFF;
        var3.field6335 = (var3.field1777[0] << 7) + (var3.method963((byte) 127) << 6);
        var3.field1778[0] = var7 - class476.field7013;
        var3.field6334 = (var3.field1778[0] << 7) + (var3.method963((byte) 127) << 6);
        class525.field7714 = var3.field6328 = var5;
        if (class72.field921[var2] != null) {
            var3.method2168(class72.field921[var2], Integer.MIN_VALUE);
        }
        class75.field1027 = 0;
        class334.field4634[class75.field1027++] = var2;
        class135.field1949[var2] = 0;
        class64.field753 = 0;
        if (arg0 > -63) {
            return;
        }
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method952(-79, 18);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class241 var13 = class133.field1940[var8] = new class241();
                var13.field3568 = (var10 << 28) + (var11 << 14) + var12;
                var13.field3565 = 0;
                var13.field3564 = -1;
                var13.field3563 = false;
                class310.field4419[class64.field753++] = var8;
                class135.field1949[var8] = 0;
            }
        }
        arg1.method944((byte) -98);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V", line = 75)
    public static final void method1347(int arg0) {
        field2805++;
        class368.field5478 = 0;
        int var1 = (class435.field6375.field6335 >> 7) + class340.field4713;
        int var2 = (class435.field6375.field6334 >> 7) + class476.field7013;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class368.field5478 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class368.field5478 = 1;
        }
        if (class368.field5478 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class368.field5478 = 0;
        }
        if (arg0 != 8714) {
            method1347(-44);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZII)Z", line = 99)
    public static final boolean method1348(boolean arg0, int arg1, int arg2) {
        field2802++;
        if (!arg0) {
            field2803 = null;
        }
        return class457.method2754(arg2, 119, arg1) || class219.method1500(arg2, arg1, (byte) 59);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V", line = 114)
    public static void method1349(byte arg0) {
        if (arg0 >= 28) {
            field2803 = null;
            field2804 = null;
            field2806 = null;
        }
    }
}
