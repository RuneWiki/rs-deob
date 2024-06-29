import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class67 {

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field1400 = 0;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Lqf;")
    public static class117 field1403 = class72.method514(99, "Handel)4Duell");

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field1399 = 0;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Lqf;")
    public static class117 field1405 = class72.method514(101, "Wen m-Ochten Sie hinzuf-Ugen?");

    @OriginalMember(owner = "client!je", name = "h", descriptor = "[I")
    public static int[] field1402 = new int[5];

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Lqf;")
    public static class117 field1395 = class72.method514(121, "Entfernen");

    @OriginalMember(owner = "client!je", name = "l", descriptor = "Lqf;")
    public static class117 field1406 = class72.method514(102, "overlay_multiway");

    @OriginalMember(owner = "client!je", name = "g", descriptor = "[Lqf;")
    public static class117[] field1401 = new class117[200];

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field1396 = 0;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "Lqf;")
    public static class117 field1409 = class72.method514(104, "Mem:");

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "Ljb;")
    public static class64 field1404;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "[Lma;")
    public static class84[] field1397;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lqf;ILqf;Ljb;)Lr;")
    public static final class118 method475(class117 arg0, int arg1, class117 arg2, class64 arg3) {
        field1407++;
        int var4 = arg3.method447((byte) 8, arg2);
        int var5 = arg3.method449(true, var4, arg0);
        if (arg1 != -4236) {
            method476((byte) -94);
        }
        return client.method171(var4, arg3, var5, false);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static void method476(byte arg0) {
        field1402 = null;
        field1395 = null;
        field1403 = null;
        field1405 = null;
        field1404 = null;
        if (arg0 != 15) {
            method476((byte) 127);
        }
        field1406 = null;
        field1397 = null;
        field1401 = null;
        field1409 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
    public static final void method477(int arg0, int arg1, int arg2) {
        field1408++;
        if (arg0 != 1) {
            field1399 = -98;
        }
        class5 var3 = class43.field858[class140.field3344][arg2][arg1];
        if (var3 == null) {
            class19.field311.method872(class140.field3344, arg2, arg1);
            return;
        }
        int var4 = -99999999;
        class3 var5 = null;
        for (class3 var6 = (class3) var3.method27(18823); var6 != null; var6 = (class3) var3.method25((byte) -126)) {
            class72 var11 = class27.method206(var6.field60, (byte) 90);
            int var12 = var11.field1568;
            if (var11.field1590 == 1) {
                var12 = (var6.field61 + 1) * var12;
            }
            if (var12 > var4) {
                var4 = var12;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class19.field311.method872(class140.field3344, arg2, arg1);
            return;
        }
        var3.method20(var5, 0);
        class3 var7 = (class3) var3.method27(18823);
        class3 var8 = null;
        class3 var9 = null;
        while (var7 != null) {
            if (var5.field60 != var7.field60) {
                if (var9 == null) {
                    var9 = var7;
                }
                if (var7.field60 != var9.field60 && var8 == null) {
                    var8 = var7;
                }
            }
            var7 = (class3) var3.method25((byte) -127);
        }
        int var10 = (arg1 << 7) + arg2 + 1610612736;
        class19.field311.method874(class140.field3344, arg2, arg1, class80.method626(arg2 * 128 + 64, class140.field3344, arg1 * 128 + 64, arg0 + -14), var5, var10, var9, var8);
    }
}
