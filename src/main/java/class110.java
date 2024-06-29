import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class110 {

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "[I")
    public static int[] field1352 = new int[500];

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "[I")
    public static int[] field1357;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "Lfj;")
    public static class572 field1354;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public int field1350;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public int field1351;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public int field1353;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "Lkea;")
    public static class203 field1356;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Z")
    public boolean field1347;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public static final void method681(byte arg0) {
        field1349++;
        class393 var1 = null;
        try {
            class175 var2 = class20.field197.method3161(false, true, "2");
            while (var2.field2138 == 0) {
                class646.method3696(1, 1L);
            }
            if (var2.field2138 == 1) {
                var1 = (class393) var2.field2140;
                class194 var3 = new class194((class313.field4578 * 6) + 3);
                var3.method1205((byte) -69, 1);
                var3.method1229(class313.field4578, 30364);
                for (int var4 = 0; var4 < class285.field3942.length; var4++) {
                    if (class144.field1760[var4]) {
                        var3.method1229(var4, 30364);
                        var3.method1223(true, class285.field3942[var4]);
                    }
                }
                var1.method2529(var3.field2610, var3.field2622, 0, true);
            }
            int var5 = 85 / ((arg0 - 34) / 45);
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2528((byte) 91);
            }
        } catch (Exception var6) {
        }
        class145.field1789 = class84.method550((byte) -100);
        class95.field1125 = false;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static void method682(int arg0) {
        if (arg0 <= 73) {
            method682(97);
        }
        field1356 = null;
        field1357 = null;
        field1354 = null;
        field1352 = null;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)V")
    public static final void method683(byte arg0) {
        field1348++;
        if (arg0 != -114) {
            method682(-20);
        }
        if (class63.method444(class133.field1673, (byte) -121) || class10.method56(class133.field1673, arg0 ^ 0xFFFFF24F)) {
            class259.method1727(5000, class337.field4821 >> 12, class207.field2781 >> 12, (byte) -95);
        } else {
            int var1 = class439.field6548.field2515[0] >> 3;
            int var2 = class439.field6548.field2524[0] >> 3;
            if (var1 >= 0 && var1 < class90.field1032 >> 3 && var2 >= 0 && var2 < class30.field349 >> 3) {
                class259.method1727(5000, var1, var2, (byte) -95);
            } else {
                class259.method1727(0, class90.field1032 >> 4, class30.field349 >> 4, (byte) -95);
            }
        }
        class452.method2795((byte) -7);
        class112.method690(arg0 ^ 0xFFFFFF8C);
        class511.method3040(0);
        class100.method618(-31317);
    }

    static {
        new class474("Select", "Auswählen", "Sélectionner", "Selecionar");
        field1355 = 1337;
        field1357 = new int[4096];
        field1354 = new class572("", 10);
    }
}
