import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class76 {

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "[B")
    public static byte[] field1296 = new byte[32896];

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Lr;")
    public static class63 field1303;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)I")
    public static final int method595(int arg0) {
        if (arg0 == 0) {
            field1301++;
            return class275.field4134;
        } else {
            return -63;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public static final void method596(byte arg0) {
        field1298++;
        for (int var1 = 0; var1 < class221.field3296.length; var1++) {
            for (int var2 = 0; var2 < class221.field3296[var1].length; var2++) {
                class221.field3296[var1][var2] = class211.field3146;
            }
        }
        if (arg0 < 62) {
            method599(-124);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZLjava/lang/String;Ldp;)Ld;")
    public static final class378 method597(int arg0, boolean arg1, String arg2, class174 arg3) {
        field1295++;
        int var4 = arg3.method1359(arg0 ^ 0x4A, arg2);
        if (var4 == -1) {
            return new class378(0);
        }
        int[] var5 = arg3.method1349(var4, (byte) 71);
        class378 var6 = new class378(var5.length);
        int var7 = arg0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field5374) {
                class37 var9 = new class37(arg3.method1355(var5[var8++], -12607, var4));
                int var10 = var9.method278(arg0 ^ 0x48);
                int var11 = var9.method320((byte) -87);
                int var12 = var9.method271((byte) 124);
                if (!arg1 && var12 == 1) {
                    var6.field5374--;
                } else {
                    var6.field5373[var7] = var10;
                    var6.field5372[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V")
    public static final void method598(int arg0, int arg1) {
        class345.field4870 = new int[arg1];
        class91.field1443 = new int[arg1];
        if (arg0 <= 121) {
            method600(58);
        }
        class326.field4699 = new int[arg1];
        class372.field5286 = new int[arg1];
        class202.field2940 = new int[arg1];
        field1300++;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
    public static void method599(int arg0) {
        field1303 = null;
        if (arg0 == -1439612562) {
            field1296 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)Ljo;")
    public static final class218 method600(int arg0) {
        class287.field4295 = arg0;
        field1302++;
        return class450.method2804(true);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILnc;)V")
    public static final void method601(int arg0, class126 arg1) {
        class50.field816[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIBLkq;I)V")
    public static final void method602(int arg0, int arg1, byte arg2, class89 arg3, int arg4) {
        field1299++;
        long var5 = (long) (arg4 | arg0 << 14 | arg1 << 28);
        class110 var7 = (class110) class186.field2728.method1219(var5, arg2 - 68);
        if (var7 == null) {
            class110 var8 = new class110();
            class186.field2728.method1217(1, var5, var8);
            var8.field1799.method148((byte) 104, arg3);
            return;
        }
        class124 var9 = class206.method1561(-80, arg3.field1416);
        int var10 = var9.field1987;
        if (var9.field2032 == 1) {
            var10 = (arg3.field1413 + 1) * var10;
        }
        for (class89 var11 = (class89) var7.field1799.method157((byte) -125); var11 != null; var11 = (class89) var7.field1799.method145(1)) {
            class124 var12 = class206.method1561(101, var11.field1416);
            int var13 = var12.field1987;
            if (var12.field2032 == 1) {
                var13 = (var11.field1413 + 1) * var13;
            }
            if (var13 < var10) {
                class286.method2020(var11, arg3, (byte) -110);
                return;
            }
        }
        if (arg2 != -40) {
            field1296 = null;
        }
        var7.field1799.method148((byte) 113, arg3);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field1296[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }
}
