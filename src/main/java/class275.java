import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class275 {

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Z")
    public static boolean field4507 = false;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Lok;")
    public static class41 field4504 = class137.method956("Fallen lassen", 45);

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field4508 = 0;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "Lji;")
    public static class154 field4506;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V", line = 5)
    public static final void method1952(int arg0, byte arg1) {
        class46 var2 = class195.method1396(5, arg0, false);
        var2.method336(true);
        field4505++;
        if (arg1 != 71) {
            field4506 = (class154) null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIILok;)V", line = 30)
    public static final void method1953(int arg0, int arg1, int arg2, int arg3, class41 arg4) {
        class302 var5 = class79.method567(-120, arg2, arg3);
        field4510++;
        if (var5 == null) {
            return;
        }
        if (var5.field5008 != null) {
            class73 var6 = new class73();
            var6.field1079 = var5;
            var6.field1083 = var5.field5008;
            var6.field1086 = arg4;
            var6.field1082 = arg1;
            class161.method1141(var6, true);
        }
        boolean var7 = true;
        if (var5.field4924 > 0) {
            var7 = class189.method1355(var5, -31196);
        }
        if (!var7 || !class271.method1917(43, client.method2119(var5), arg1 - 1)) {
            return;
        }
        if (arg1 == 1) {
            class33.field487++;
            class285.field4642.method844(-4, 162);
            class285.field4642.method787(853918096, arg2);
            class285.field4642.method778(arg3, (byte) -4);
        }
        if (arg1 == 2) {
            class311.field5257++;
            class285.field4642.method844(-4, 140);
            class285.field4642.method787(853918096, arg2);
            class285.field4642.method778(arg3, (byte) -4);
        }
        if (arg1 == 3) {
            class285.field4642.method844(-4, 34);
            class8.field110++;
            class285.field4642.method787(853918096, arg2);
            class285.field4642.method778(arg3, (byte) -4);
        }
        if (arg1 == 4) {
            class285.field4642.method844(-4, 144);
            class285.field4642.method787(853918096, arg2);
            class285.field4642.method778(arg3, (byte) -4);
            class273.field4452++;
        }
        if (arg1 == 5) {
            class107.field1501++;
            class285.field4642.method844(-4, 225);
            class285.field4642.method787(853918096, arg2);
            class285.field4642.method778(arg3, (byte) -4);
        }
        if (arg1 == 6) {
            class285.field4642.method844(-4, 178);
            class228.field3633++;
            class285.field4642.method787(853918096, arg2);
            class285.field4642.method778(arg3, (byte) -4);
        }
        if (arg1 == 7) {
            class285.field4642.method844(-4, 58);
            class285.field4642.method787(853918096, arg2);
            class285.field4642.method778(arg3, (byte) -4);
            class295.field4775++;
        }
        if (arg0 < 88) {
            method1953(-20, 106, 36, 90, (class41) null);
        }
        if (arg1 == 8) {
            class134.field2007++;
            class285.field4642.method844(-4, 102);
            class285.field4642.method787(853918096, arg2);
            class285.field4642.method778(arg3, (byte) -4);
        }
        if (arg1 == 9) {
            class186.field3035++;
            class285.field4642.method844(-4, 127);
            class285.field4642.method787(853918096, arg2);
            class285.field4642.method778(arg3, (byte) -4);
        }
        if (arg1 == 10) {
            class13.field161++;
            class285.field4642.method844(-4, 221);
            class285.field4642.method787(853918096, arg2);
            class285.field4642.method778(arg3, (byte) -4);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V", line = 163)
    public static void method1954(byte arg0) {
        field4506 = null;
        field4504 = null;
        if (arg0 <= 55) {
            field4504 = (class41) null;
        }
    }
}
