import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class433 extends class431 {

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "Loe;")
    public class137 field6407 = new class137();

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "Lak;")
    public static class234 field6411 = new class234("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
    public static int field6414 = 100;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZLhp;)V", line = 3)
    public static final void method2684(boolean arg0, class217 arg1) {
        field6410++;
        for (int var2 = 0; var2 < class422.field6295; var2++) {
            int var3 = arg1.method1510(-129);
            int var4 = arg1.method1511(118);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class282.field4291[var3] != null) {
                class282.field4291[var3].field4343 = var4;
            }
        }
        if (!arg0) {
            method2688(-104);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljs;I[[B)V", line = 34)
    public static final void method2685(class219 arg0, int arg1, byte[][] arg2) {
        field6408++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg0.field3959; var4++) {
            class92.method746(arg1 ^ 0x3A6B208D);
            for (int var5 = 0; var5 < class69.field976 >> 3; var5++) {
                for (int var6 = 0; var6 < (class285.field4328 >> 3); var6++) {
                    boolean var7 = false;
                    int var8 = class294.field4484[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x3FA6E8D) >> 24;
                        if (!arg0.field3957 || var9 == 0) {
                            int var10 = (var8 & 0x7) >> 1;
                            int var11 = (var8 & 0xFFF128) >> 14;
                            int var12 = (var8 & 0x3FFF) >> 3;
                            int var13 = (var11 / 8 << 8) + (var12 / 8);
                            for (int var14 = 0; var14 < class505.field7380.length; var14++) {
                                if (class505.field7380[var14] == var13 && arg2[var14] != null) {
                                    class217 var15 = new class217(arg2[var14]);
                                    arg0.method1723(var9, class184.field2758, var12, var15, var5 * 8, var11, (byte) -95, var6 * 8, var10, var4);
                                    arg0.method1574(var4, var9, -112, var15, var11, var5 * 8, var3[0] == -1 ? var3 : null, class377.field5692, var10, var12, var6 * 8);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        arg0.method1732(8, 8, var5 * 8, var6 * 8, 119, var4);
                    }
                }
            }
        }
        if (arg1 != 1) {
            method2685(null, 113, null);
        }
        if (var3[0] != -1) {
            class32.field377 = class517.field7530.method1234(class138.field2098, var3[3], 903, var3[2], var3[1], var3[0]);
            class134.field2049 = var3[4];
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BLjava/lang/String;)V", line = 126)
    public static final void method2686(byte arg0, String arg1) {
        field6413++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class38.method286(arg1, true);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (arg0 != -103) {
            field6411 = null;
        }
        while (class64.field785 > var3) {
            String var4 = class221.field3622[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class38.method286(var4, true);
            if (var5 != null && var5.equals(var2)) {
                class64.field785--;
                for (int var6 = var3; var6 < class64.field785; var6++) {
                    class221.field3622[var6] = class221.field3622[var6 + 1];
                    class501.field7207[var6] = class501.field7207[var6 + 1];
                    class240.field3837[var6] = class240.field3837[var6 + 1];
                    class465.field6734[var6] = class465.field6734[var6 + 1];
                    class46.field598[var6] = class46.field598[var6 + 1];
                    class135.field2055[var6] = class135.field2055[var6 + 1];
                }
                class534.field7856 = class152.field2263;
                class263.field4046++;
                class74.method640(-29627, class497.field7145);
                class71.field1020.method1545(class4.method10(arg1, 97), -80);
                class71.field1020.method1534(arg1, false);
                return;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V", line = 188)
    public static final void method2687(int arg0, int arg1, int arg2) {
        field6406++;
        class211 var3 = class452.method2749(arg0, arg0 + 111, 0);
        var3.method1463(arg0 - 15);
        var3.field3441 = arg1;
        var3.field3440 = arg2;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V", line = 200)
    public static void method2688(int arg0) {
        field6411 = null;
        if (arg0 <= 33) {
            field6411 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BI)Lhf;", line = 210)
    public static final class273 method2689(byte arg0, int arg1) {
        if (arg0 > -122) {
            field6409 = -105;
        }
        field6412++;
        class273 var2 = (class273) class415.field6196.method87((long) arg1, -2062335807);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class20.field250.method2536(1, 0, arg1);
        class273 var4 = new class273();
        var4.field4185 = arg1;
        if (var3 != null) {
            var4.method1800((byte) -43, new class217(var3));
        }
        var4.method1801(-3);
        if (var4.field4178 == 2 && class338.field5039.method2585((byte) 114, (long) arg1) == null) {
            class338.field5039.method2591((long) arg1, new class308(class242.field3848), (byte) 85);
            class232.field3751[class242.field3848++] = var4;
        }
        class415.field6196.method84((long) arg1, var4, (byte) 27);
        return var4;
    }
}
