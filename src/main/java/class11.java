import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class11 extends class46 {

    @OriginalMember(owner = "client!bc", name = "bb", descriptor = "I")
    public int field179 = 0;

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
    public static int field175 = 7759444;

    @OriginalMember(owner = "client!bc", name = "cb", descriptor = "Lsc;")
    public static class128 field180 = class129.method1017(false, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!bc", name = "gb", descriptor = "[S")
    public static short[] field184 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!bc", name = "jb", descriptor = "Lsc;")
    public static class128 field187 = class129.method1017(false, "Hier wechseln");

    @OriginalMember(owner = "client!bc", name = "fb", descriptor = "Lsc;")
    private static class128 field183 = class129.method1017(false, "button near the top of that page)3");

    @OriginalMember(owner = "client!bc", name = "ab", descriptor = "Lsc;")
    public static class128 field178 = field183;

    @OriginalMember(owner = "client!bc", name = "hb", descriptor = "Lrb;")
    public static class120 field185 = new class120(30);

    @OriginalMember(owner = "client!bc", name = "kb", descriptor = "[I")
    public static int[] field188 = new int[200];

    @OriginalMember(owner = "client!bc", name = "nb", descriptor = "Lsc;")
    public static class128 field191 = class129.method1017(false, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!bc", name = "mb", descriptor = "Lsc;")
    public static class128 field190 = class129.method1017(false, "mn");

    @OriginalMember(owner = "client!bc", name = "lb", descriptor = "Lrb;")
    public static class120 field189 = new class120(100);

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!bc", name = "Y", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!bc", name = "Z", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!bc", name = "eb", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!bc", name = "ib", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!bc", name = "db", descriptor = "Lae;")
    public static class6 field181;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILmc;)V")
    public final void method87(int arg0, class86 arg1) {
        if (arg0 != 30) {
            field188 = null;
        }
        while (true) {
            int var3 = arg1.method646(-15447);
            if (var3 == 0) {
                field186++;
                return;
            }
            this.method89(var3, arg1, (byte) 63);
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)Lpd;")
    public static final class108 method88(int arg0, int arg1) {
        if (arg0 != 127) {
            method90(true, 38);
        }
        class108 var2 = (class108) field189.method917((long) arg1, arg0 ^ 0xFFFFFF80);
        field177++;
        if (var2 != null) {
            return var2;
        }
        class108 var3 = class46.method340(class79.field1772, arg0 ^ 0x16, arg1, class6.field84, false);
        if (var3 != null) {
            field189.method913((long) arg1, var3, (byte) -19);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILmc;B)V")
    private final void method89(int arg0, class86 arg1, byte arg2) {
        if (arg2 != 63) {
            field178 = null;
        }
        field174++;
        if (arg0 == 2) {
            this.field179 = arg1.method632((byte) -80);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)V")
    public static final void method90(boolean arg0, int arg1) {
        field176++;
        int var2 = class134.field3151;
        if (class151.field3473.field975 >> 7 == class66.field1490 && class151.field3473.field987 >> 7 == class18.field312) {
            class66.field1490 = 0;
        }
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class53 var4;
            int var5;
            if (arg0) {
                var4 = class151.field3473;
                var5 = 33538048;
            } else {
                var5 = class65.field1441[var3] << 14;
                var4 = class106.field2421[class65.field1441[var3]];
            }
            if (var4 != null && var4.method391(-30036)) {
                var4.field1059 = false;
                if ((class110.field2487 && class134.field3151 > 50 || class134.field3151 > 200) && !arg0 && var4.field958 == var4.field1009) {
                    var4.field1059 = true;
                }
                int var6 = var4.field975 >> 7;
                int var7 = var4.field987 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field1061 == null || class29.field554 < var4.field1047 || class29.field554 >= var4.field1074) {
                        if ((var4.field975 & 0x7F) == 64 && (var4.field987 & 0x7F) == 64) {
                            if (class51.field1032[var6][var7] == class58.field1251) {
                                continue;
                            }
                            class51.field1032[var6][var7] = class58.field1251;
                        }
                        var4.field1055 = class97.method755(var4.field987, class29.field553, var4.field975, 256);
                        class154.field3553.method106(class29.field553, var4.field975, var4.field987, var4.field1055, 60, var4, var4.field1012, var5, var4.field984);
                    } else {
                        var4.field1059 = false;
                        var4.field1055 = class97.method755(var4.field987, class29.field553, var4.field975, 256);
                        class154.field3553.method129(class29.field553, var4.field975, var4.field987, var4.field1055, 60, var4, var4.field1012, var5, var4.field1054, var4.field1042, var4.field1039, var4.field1057);
                    }
                }
            }
        }
        if (arg1 != 1643) {
            method88(24, 3);
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
    public static void method91(int arg0) {
        field188 = null;
        field183 = null;
        field189 = null;
        field184 = null;
        field191 = null;
        if (arg0 != 2) {
            field181 = null;
        }
        field181 = null;
        field190 = null;
        field180 = null;
        field185 = null;
        field187 = null;
        field178 = null;
    }
}
