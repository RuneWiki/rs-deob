import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public abstract class class10 {

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Lbd;")
    private static class162 field118 = class17.method142(0, " is already on your ignore list)3");

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Lbd;")
    public static class162 field116 = field118;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "Lli;")
    public static class18 field123 = new class18();

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "Lbd;")
    public static class162 field124 = class17.method142(0, "::errortest");

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "Lbd;")
    public static class162 field125 = class17.method142(0, "(U5");

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "Lbd;")
    public static class162 field126 = class17.method142(0, ":allyreq:");

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "[I")
    public static int[] field120;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)V", line = 33)
    public static final void method60(byte arg0, int arg1) {
        field121++;
        if (class201.field3421 == null) {
            class201.field3421 = new byte[4][104][104];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class201.field3421[var2][var3][var4] = arg0;
                }
            }
        }
        int var5 = -27 % ((arg1 + 46) / 39);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 80)
    public static final void method61(int arg0) {
        field117++;
        int var1 = class204.field3455.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class204.field3455[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class235.field3938; var4++) {
                    if (class262.field4375[var4] == class123.field2230[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class262.field4375[class235.field3938] = class123.field2230[var2];
                    var3 = class235.field3938++;
                }
                class94 var5 = new class94(class204.field3455[var2]);
                int var6 = 0;
                while (var5.field1653 < class204.field3455[var2].length && var6 < 511) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method761((byte) 108);
                    int var9 = var8 >> 14;
                    int var10 = var8 & 0x3F;
                    int var11 = var8 >> 7 & 0x3F;
                    int var12 = (class123.field2230[var2] >> 8) * 64 + var11 - class178.field3052;
                    int var13 = (class123.field2230[var2] & 0xFF) * 64 + var10 - class258.field4294;
                    class83 var14 = class223.method1613(var5.method761((byte) 108), false);
                    if (class204.field3446[var7] == null && (var14.field1480 & 0x1) > 0 && class245.field4080 == var9 && var12 >= 0 && var14.field1485 + var12 < 104 && var13 >= 0 && var13 + var14.field1485 < 104) {
                        class204.field3446[var7] = new class60();
                        class60 var15 = class204.field3446[var7];
                        class278.field4674[class31.field520++] = var7;
                        var15.field5051 = class90.field1598;
                        var15.field926 = var14;
                        var15.method2051(var15.field926.field1485, 7);
                        var15.field5042 = var15.field926.field1477;
                        var15.field5068 = var15.field926.field1444;
                        var15.field5072 = var15.field926.field1457;
                        var15.field5043 = var15.field926.field1466;
                        var15.field5037 = var15.field926.field1437;
                        var15.field5053 = var15.field926.field1452;
                        var15.field5066 = var15.field926.field1481;
                        var15.field5030 = var15.field926.field1474;
                        if (var15.field5030 == 0) {
                            var15.field5018 = 0;
                        }
                        var15.method2049(var15.method293((byte) 25), var12, true, (byte) 127, var13);
                    }
                }
            }
        }
        if (arg0 <= 63) {
            method62((byte) 109);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V", line = 186)
    public static void method62(byte arg0) {
        field126 = null;
        field125 = null;
        field123 = null;
        int var1 = 126 % ((arg0 + 69) / 50);
        field118 = null;
        field120 = null;
        field124 = null;
        field116 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLci;)Lci;")
    public abstract class72 method59(byte arg0, class72 arg1);
}
