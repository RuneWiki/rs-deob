import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class128 {

    @OriginalMember(owner = "client!m", name = "f", descriptor = "[I")
    public static int[] field1702 = new int[4096];

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Lap;")
    public static class335 field1699 = new class335("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Lni;")
    public static class363 field1703 = new class363("LOCAL", 4);

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Ldq;")
    public static class493 field1704 = new class493(29, 8);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
    public static final void method905(int arg0, int arg1) {
        if (arg1 <= 94) {
            return;
        }
        class225.field2871 = new int[arg0];
        class159.field2025 = new int[arg0];
        class175.field2278 = new int[arg0];
        class184.field2414 = new int[arg0];
        field1697++;
        class129.field1712 = new int[arg0];
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public static void method906(byte arg0) {
        field1703 = null;
        field1699 = null;
        field1704 = null;
        if (arg0 == -127) {
            field1702 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B[B)Lpi;")
    public static final class346 method907(byte arg0, byte[] arg1) {
        field1698++;
        class346 var2 = new class346();
        class463 var3 = new class463(arg1);
        var3.field6631 = var3.field6618.length - 2;
        int var4 = var3.method2758((byte) 80);
        int var5 = var3.field6618.length - var4 - 12 - 2;
        var3.field6631 = var5;
        int var6 = var3.method2727(-73);
        var2.field4437 = var3.method2758((byte) 119);
        var2.field4438 = var3.method2758((byte) 110);
        var2.field4434 = var3.method2758((byte) 113);
        var2.field4435 = var3.method2758((byte) 99);
        int var7 = var3.method2737(false);
        if (var7 > 0) {
            var2.field4443 = new class352[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method2758((byte) 93);
                class352 var10 = new class352(class60.method550(120, var9));
                var2.field4443[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method2727(-80);
                    int var12 = var3.method2727(-89);
                    var10.method2019((byte) -100, new class101(var12), (long) var11);
                }
            }
        }
        var3.field6631 = 0;
        var2.field4440 = var3.method2762((byte) -128);
        var2.field4442 = new String[var6];
        var2.field4448 = new int[var6];
        var2.field4444 = new int[var6];
        if (arg0 > -103) {
            method907((byte) 32, null);
        }
        int var13 = 0;
        while (var3.field6631 < var5) {
            int var14 = var3.method2758((byte) 94);
            if (var14 == 3) {
                var2.field4442[var13] = var3.method2768((byte) 104).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field4448[var13] = var3.method2737(false);
            } else {
                var2.field4448[var13] = var3.method2727(-86);
            }
            var2.field4444[var13++] = var14;
        }
        return var2;
    }
}
