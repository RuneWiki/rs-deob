import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class334 {

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "Lwe;")
    public static class24 field4527 = new class24();

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "[I")
    public static int[] field4528 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    public static int field4533 = 0;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "Lhc;")
    public static class368 field4531 = new class368("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "Lij;")
    public static class316 field4529;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "[I")
    public static int[] field4530;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "[I")
    public static int[] field4532;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method2036(int arg0, String arg1, boolean arg2) {
        String var3 = arg1.toLowerCase();
        field4525++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg2 ? 32768 : 0;
        int var7 = var6 + (arg2 ? class323.field4390 : class354.field4761);
        for (int var8 = var6; var8 < var7; var8++) {
            class107 var11 = class128.method967(var8, arg0 - 1979350135);
            if (var11.field1510 && var11.method820(0).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class149.field2172 = null;
                    class448.field6353 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class149.field2172 = var4;
        class366.field5084 = 0;
        class448.field6353 = var5;
        String[] var9 = new String[class448.field6353];
        for (int var10 = 0; var10 < class448.field6353; var10++) {
            var9[var10] = class128.method967(var4[var10], -1979350136).method820(0);
        }
        class204.method1393(var9, arg0, class149.field2172);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
    public static void method2037(byte arg0) {
        field4531 = null;
        field4532 = null;
        field4528 = null;
        field4529 = null;
        int var1 = 2 % ((19 - arg0) / 55);
        field4530 = null;
        field4527 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIB)V")
    public static final void method2038(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class13.field113 = arg0;
        class42.field547 = arg2;
        if (arg4 == 112) {
            class95.field1313 = arg3;
            field4524++;
            class290.field3939 = arg1;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIBII)I")
    public static final int method2039(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 <= 38) {
            return -33;
        } else {
            field4526++;
            int var5 = 65536 - class136.field2020[arg1 * 8192 / arg4] >> 1;
            return ((65536 - var5) * arg0 >> 16) + (arg3 * var5 >> 16);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)I")
    public static final int method2040(int arg0) {
        if (arg0 != 0) {
            field4530 = null;
        }
        field4523++;
        class58 var1 = class354.field4765;
        boolean var2 = false;
        if (class22.field284 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class58.method452(var3, (class76) null, 0, (byte) 54, 0, (class202) null);
            var2 = true;
        }
        long var4 = class199.method1372(30938);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method260(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class199.method1372(30938) - var4);
        var1.method461(100, -16777216, 100, arg0 - 91, 0, 0);
        if (var2) {
            var1.method449((byte) -74);
        }
        return var7;
    }
}
