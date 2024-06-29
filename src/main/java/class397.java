import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class397 extends class47 {

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    public int field5454 = 0;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "Lha;")
    public static class294 field5453 = new class294("LIVE", 0);

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "Lrc;")
    public static class108 field5455;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    public static int field5452;

    static {
        new class151("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field5455 = new class108(25, 2);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BILkk;)V", line = 4)
    private final void method2389(byte arg0, int arg1, class161 arg2) {
        field5451++;
        if (arg1 == 2) {
            this.field5454 = arg2.method1134(-16848);
        }
        if (arg0 < 109) {
            method2392(115);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lkk;I)V", line = 20)
    public final void method2390(class161 arg0, int arg1) {
        field5452++;
        while (true) {
            int var3 = arg0.method1172((byte) -117);
            if (var3 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    this.method2390((class161) null, -48);
                    return;
                }
            }
            this.method2389((byte) 113, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZLgf;I)V", line = 42)
    public static final void method2391(boolean arg0, class39 arg1, int arg2) {
        if (arg2 != 44) {
            return;
        }
        field5450++;
        if (class303.field4310 >= 400 || class262.field3781 == arg1) {
            return;
        }
        String var3;
        if (arg1.field487 == 0) {
            boolean var4 = true;
            if (class262.field3781.field505 != -1 && arg1.field505 != -1) {
                int var5 = class262.field3781.field522 > arg1.field522 ? class262.field3781.field522 : arg1.field522;
                int var6 = arg1.field505 <= class262.field3781.field505 ? arg1.field505 : class262.field3781.field505;
                int var7 = var5 * 10 / 100 + var6 + 5;
                int var8 = class262.field3781.field522 - arg1.field522;
                if (var8 < 0) {
                    var8 = -var8;
                }
                if (var8 > var7) {
                    var4 = false;
                }
            }
            String var9 = class350.field4825 == class35.field378 ? class284.field4064.method1078(class66.field967, 100) : class390.field5394.method1078(class66.field967, 100);
            if (arg1.field480 <= arg1.field522) {
                var3 = arg1.method250(true, 4675) + (var4 ? class332.method2092(arg1.field522, class262.field3781.field522, (byte) -110) : "<col=ffffff>") + " (" + var9 + arg1.field522 + ")";
            } else {
                var3 = arg1.method250(true, 4675) + (var4 ? class332.method2092(arg1.field522, class262.field3781.field522, (byte) -87) : "<col=ffffff>") + " (" + var9 + arg1.field522 + "+" + (arg1.field480 - arg1.field522) + ")";
            }
        } else {
            var3 = arg1.method250(true, 4675) + " (" + class107.field1499.method1078(class66.field967, 100) + arg1.field487 + ")";
        }
        if (class450.field6405) {
            if (!arg0 && (class182.field2751 & 0x8) != 0) {
                class106.field1487++;
                class19.method140(false, (byte) 113, class352.field4842 + " -> <col=ffffff>" + var3, true, class347.field4784, 0, (long) arg1.field5751, 44, 0, -1, class95.field1336);
            }
        } else if (arg0) {
            class19.method140(true, (byte) -33, "", false, "<col=cccccc>" + var3, 0, 0L, -1, 0, 0, -1);
        } else {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (class106.field1494[var10] != null) {
                    short var11 = 0;
                    if (class6.field42 == class35.field378 && class106.field1494[var10].equalsIgnoreCase(class404.field5533.method1078(class66.field967, 100))) {
                        if (class262.field3781.field522 < arg1.field522) {
                            var11 = 2000;
                        }
                        if (class262.field3781.field482 != 0 && arg1.field482 != 0) {
                            if (class262.field3781.field482 == arg1.field482) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (class48.field730[var10]) {
                        var11 = 2000;
                    }
                    short var12 = (short) (class409.field5604[var10] + var11);
                    int var13 = class168.field2437[var10] == -1 ? class161.field2332 : class168.field2437[var10];
                    class19.method140(false, (byte) 118, "<col=ffffff>" + var3, true, class106.field1494[var10], 0, (long) arg1.field5751, var12, 0, -1, var13);
                    class172.field2588++;
                }
            }
        }
        if (arg0) {
            return;
        }
        for (class73 var14 = (class73) class6.field38.method775(1); var14 != null; var14 = (class73) class6.field38.method763(arg2 ^ 0x2C)) {
            if (var14.field1048 == 60) {
                var14.field1045 = "<col=ffffff>" + var3;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V", line = 179)
    public static void method2392(int arg0) {
        field5455 = null;
        if (arg0 == -1) {
            field5453 = null;
        }
    }
}
