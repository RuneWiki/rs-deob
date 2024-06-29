import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class396 {

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "[[Z")
    public static boolean[][] field5852 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "Lpu;")
    public static class179 field5849 = new class179("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "Li;")
    public class200 field5850;

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "Le;")
    public class289 field5853;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V", line = 6)
    public static final void method2501(int arg0) {
        field5854++;
        if (arg0 != -28916) {
            field5852 = null;
        }
        for (class376 var1 = (class376) class154.field2370.method295((byte) 111); var1 != null; var1 = (class376) class154.field2370.method296(true)) {
            if (class294.method1965((byte) -54, var1.field5546)) {
                class492.method2962(var1, (byte) 113);
            }
        }
        if (class540.field7909 == 1) {
            class173.method1238(arg0 ^ 0xFFFF8F06);
            return;
        }
        class252.method1795(class162.field2451, class404.field5975, class354.field5246, class304.field4657, false);
        int var2 = class447.field6643.method174(class23.field267.method1265(class345.field5141, arg0 + 28810), (byte) -103);
        for (class376 var3 = (class376) class154.field2370.method295((byte) 109); var3 != null; var3 = (class376) class154.field2370.method296(true)) {
            int var4 = class92.method788(var3, -98);
            if (var4 > var2) {
                var2 = var4;
            }
        }
        class304.field4657 = var2 + 8;
        class162.field2451 = class540.field7909 * 16 + (class86.field1411 ? 26 : 22);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(III)Z", line = 55)
    public static final boolean method2502(int arg0, int arg1, int arg2) {
        int var3 = -68 / ((arg2 - 45) / 43);
        field5848++;
        return class269.method1862(-24050, arg0, arg1) || class229.method1555(arg1, arg0, (byte) 114);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V", line = 67)
    public static void method2503(byte arg0) {
        field5849 = null;
        field5852 = null;
        if (arg0 > -1) {
            field5849 = null;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIZI)V", line = 85)
    public static final void method2504(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field5851++;
        if (class337.field5072 != null && (arg5 != 3 || class40.field667.field4188 != arg1 || class40.field667.field4191 != arg0)) {
            class234.method1587(class122.field1844, 11, class337.field5072);
            class337.field5072 = null;
        }
        if (arg5 == 3 && class337.field5072 == null) {
            class337.field5072 = class65.method443(class122.field1844, 0, arg1, (byte) -78, 0, arg0);
            if (class337.field5072 != null) {
                class40.field667.field4188 = arg1;
                class40.field667.field4191 = arg0;
                class40.field667.method422(class122.field1844, 1);
            }
        }
        if (arg5 == 3 && class337.field5072 == null) {
            method2504(-1, -1, arg2, -119, true, class40.field667.field4208);
            return;
        }
        Container var6;
        if (class337.field5072 != null) {
            class228.field3453 = arg0;
            class100.field1538 = arg1;
            var6 = class337.field5072;
        } else if (class237.field3564 == null) {
            var6 = class122.field1844.field1062;
            class100.field1538 = var6.getSize().width;
            class228.field3453 = var6.getSize().height;
        } else {
            Insets var7 = class237.field3564.getInsets();
            int var10001 = -var7.right;
            class100.field1538 = class237.field3564.getSize().width + var10001 - var7.left;
            int var12 = -var7.top;
            class228.field3453 = class237.field3564.getSize().height + var12 - var7.bottom;
            var6 = class237.field3564;
        }
        if (arg5 == 1) {
            class169.field2570 = class182.field2785;
            class338.field5079 = (class100.field1538 - class182.field2785) / 2;
            class360.field5313 = class155.field2387;
            class525.field7700 = 0;
        } else if (class360.field5314 < 96 && class108.field1631 == 0) {
            int var8 = class100.field1538 > 1024 ? 1024 : class100.field1538;
            int var9 = class228.field3453 > 768 ? 768 : class228.field3453;
            class169.field2570 = var8;
            class338.field5079 = (class100.field1538 - var8) / 2;
            class525.field7700 = 0;
            class360.field5313 = var9;
        } else {
            class338.field5079 = 0;
            class169.field2570 = class100.field1538;
            class360.field5313 = class228.field3453;
            class525.field7700 = 0;
        }
        if (class62.field991 != class287.field4471) {
            boolean var10000;
            if (class169.field2570 < 1024 && class360.field5313 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg4) {
            class361.method2290(-18613);
        } else {
            class342.field5114.setSize(class169.field2570, class360.field5313);
            class376.field5542.method518(class342.field5114);
            if (class237.field3564 == var6) {
                Insets var10 = class237.field3564.getInsets();
                class342.field5114.setLocation(class338.field5079 + var10.left, class525.field7700 + var10.top);
            } else {
                class342.field5114.setLocation(class338.field5079, class525.field7700);
            }
        }
        if (arg5 < 2) {
            class368.field5419 = false;
        } else {
            class368.field5419 = true;
        }
        if (class134.field2010 != -1) {
            class179.method1264(120, true);
        }
        if (class541.field7922 != null && class434.method2698(true, class460.field6813)) {
            class537.method3162((byte) -55);
        }
        int var11 = 0;
        if (arg3 > -106) {
            method2504(61, 115, -54, 94, false, -23);
        }
        while (var11 < 100) {
            class434.field6439[var11] = true;
            var11++;
        }
        class144.field2124 = true;
    }
}
