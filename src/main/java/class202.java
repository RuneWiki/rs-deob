import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class202 {

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "Lmb;")
    private static class96 field3498 = class243.method1708("skill: ", (byte) 100);

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Lmb;")
    public static class96 field3497 = class243.method1708("mapfunction", (byte) 94);

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Lmb;")
    public static class96 field3494 = class243.method1708(")3", (byte) 92);

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Lmb;")
    public static class96 field3500 = class243.method1708("Spieler kann nicht gefunden werden: ", (byte) 100);

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "Lmb;")
    public static class96 field3501 = field3498;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "Lmb;")
    public static class96 field3495 = class243.method1708("Ablegen", (byte) 110);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Lmb;")
    public static class96 field3493 = class243.method1708("Eingabeprozedur geladen)3", (byte) 118);

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static void method1411(int arg0) {
        field3494 = null;
        field3497 = null;
        field3501 = null;
        if (arg0 != 1) {
            method1411(48);
        }
        field3495 = null;
        field3500 = null;
        field3493 = null;
        field3498 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZI)V")
    public static final void method1412(int arg0, boolean arg1, int arg2) {
        field3502++;
        if (!arg1) {
            return;
        }
        for (int var3 = 0; var3 < class268.field4660; var3++) {
            class193 var4 = class248.method1734(var3, -120);
            if (var4 != null) {
                int var5 = var4.field3328;
                if (var5 >= 0 && !class240.field4167.method895(var5, 1)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field3331 >= 0) {
                    int var10 = var4.field3331;
                    int var11 = (var10 & 0x7F) + arg0;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg2 + var10 & 0xFC00) + var11 + (var10 & 0x380);
                    var9 = class240.field4166[class234.method1589(96, 117, var12)];
                } else if (var5 >= 0) {
                    var9 = class240.field4166[class234.method1589(96, 96, class240.field4167.method896(var5, 0))];
                } else if (var4.field3326 == -1) {
                    var9 = -1;
                } else {
                    int var6 = var4.field3326;
                    int var7 = (var6 & 0x7F) + arg0;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
                    var9 = class240.field4166[class234.method1589(96, 90, var8)];
                }
                class247.field4280[var3 + 1] = var9;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)V")
    public static final void method1413(int arg0, int arg1, int arg2) {
        class43 var3 = class270.method1847(arg1, arg2 - 10278, arg2);
        var3.method333(arg2 - 125);
        var3.field740 = arg0;
        field3503++;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    public static final void method1414(int arg0) {
        field3499++;
        if (arg0 != 5951) {
            field3496 = 93;
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class176.field3059[var1] = true;
        }
    }
}
