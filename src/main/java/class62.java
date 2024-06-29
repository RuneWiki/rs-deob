import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class62 {

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Lni;")
    public static class367 field888;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Lni;")
    public static class367 field890;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public int field884;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public int field886;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public int field887;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)I")
    public static final int method441(int arg0, int arg1) {
        return class374.field5693 == null ? 0 : class374.field5693[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II[Lga;)V")
    public static final void method442(int arg0, int arg1, class282[] arg2) {
        field885++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class282 var4 = arg2[var3];
            if (var4 != null && var4.field4122 == arg0 && !client.method1330(var4)) {
                if (var4.field4103 == 0) {
                    method442(var4.field4029, -121, arg2);
                    if (var4.field4108 != null) {
                        method442(var4.field4029, -123, var4.field4108);
                    }
                    class436 var5 = (class436) class312.field4570.method1747((long) var4.field4029, false);
                    if (var5 != null) {
                        class536.method3167(false, var5.field6598);
                    }
                }
                if (var4.field4103 == 6 && var4.field4061 != -1) {
                    class91 var6 = class201.field2707.method489(45, var4.field4061);
                    if (var6 != null) {
                        var4.field4135 += class205.field2728;
                        while (var6.field1313[var4.field4015] < var4.field4135) {
                            var4.field4135 -= var6.field1313[var4.field4015];
                            var4.field4015++;
                            if (var4.field4015 >= var6.field1315.length) {
                                var4.field4015 -= var6.field1325;
                                if (var4.field4015 < 0 || var4.field4015 >= var6.field1315.length) {
                                    var4.field4015 = 0;
                                }
                            }
                            var4.field4050 = var4.field4015 + 1;
                            if (var4.field4050 >= var6.field1315.length) {
                                var4.field4050 -= var6.field1325;
                                if (var4.field4050 < 0 || var6.field1315.length <= var4.field4050) {
                                    var4.field4050 = -1;
                                }
                            }
                            class206.method1385(2, var4);
                        }
                    }
                }
            }
        }
        if (arg1 > -118) {
            field888 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public static void method443(byte arg0) {
        field888 = null;
        field890 = null;
        if (arg0 != 73) {
            method444(-57, null);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method444(int arg0, String arg1) {
        field882++;
        class71.method494(0, "", 0, (byte) 112, "", arg1);
        if (arg0 <= 62) {
            method444(-127, null);
        }
    }

    static {
        new class446("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field883 = 0;
        field888 = new class367(49, 2);
        field890 = new class367(42, 4);
    }
}
