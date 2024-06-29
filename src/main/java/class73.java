import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class73 {

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "[I")
    public static int[] field988 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field992 = -1;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field994 = "Cancel";

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "Lwe;")
    public static class24 field989 = new class24(64);

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lvp;I)V")
    public static final void method452(class194 arg0, int arg1) {
        field995++;
        if (class10.field97 >= 400 || class100.field1350 == arg0) {
            return;
        }
        String var2;
        if (arg0.field2763 == 0) {
            boolean var3 = true;
            if (class100.field1350.field2757 != -1 && arg0.field2757 != -1) {
                int var4 = class100.field1350.field2780 > arg0.field2780 ? class100.field1350.field2780 : arg0.field2780;
                int var5 = class100.field1350.field2757 >= arg0.field2757 ? arg0.field2757 : class100.field1350.field2757;
                int var6 = var4 * 10 / 100 + var5 + 5;
                int var7 = class100.field1350.field2780 - arg0.field2780;
                if (var7 < 0) {
                    var7 = -var7;
                }
                if (var6 < var7) {
                    var3 = false;
                }
            }
            String var8 = class126.field1679 == 1 ? class97.field1330 : class433.field6391;
            if (arg0.field2780 < arg0.field2787) {
                var2 = arg0.method1220(true, true) + (var3 ? class16.method109((byte) 51, arg0.field2780, class100.field1350.field2780) : "<col=ffffff>") + " (" + var8 + arg0.field2780 + "+" + (arg0.field2787 - arg0.field2780) + ")";
            } else {
                var2 = arg0.method1220(true, true) + (var3 ? class16.method109((byte) 51, arg0.field2780, class100.field1350.field2780) : "<col=ffffff>") + " (" + var8 + arg0.field2780 + ")";
            }
        } else {
            var2 = arg0.method1220(true, true) + " (" + class314.field4506 + arg0.field2763 + ")";
        }
        if (class394.field5921 == 1) {
            class17.field200++;
            class169.method1048(class274.field4033, (long) arg0.field249, class238.field3341, -1, 0, class66.field939 + " -> <col=ffffff>" + var2, 0, 9);
        } else if (!class95.field1307) {
            for (int var9 = 7; var9 >= 0; var9--) {
                if (class276.field4053[var9] != null) {
                    short var10 = 0;
                    if (class126.field1679 == 0 && class276.field4053[var9].equalsIgnoreCase(class143.field1893)) {
                        if (arg0.field2780 > class100.field1350.field2780) {
                            var10 = 2000;
                        }
                        if (class100.field1350.field2795 != 0 && arg0.field2795 != 0) {
                            if (class100.field1350.field2795 == arg0.field2795) {
                                var10 = 2000;
                            } else {
                                var10 = 0;
                            }
                        }
                    } else if (class175.field2288[var9]) {
                        var10 = 2000;
                    }
                    short var11 = (short) (class252.field3654[var9] + var10);
                    int var12 = class347.field5151[var9] == -1 ? class358.field5245 : class347.field5151[var9];
                    class384.field5734++;
                    class169.method1048(var12, (long) arg0.field249, class276.field4053[var9], arg1 - 2224, 0, "<col=ffffff>" + var2, 0, var11);
                }
            }
        } else if ((class168.field2212 & 0x8) != 0) {
            class169.method1048(class369.field5488, (long) arg0.field249, class191.field2667, -1, 0, class333.field4927 + " -> <col=ffffff>" + var2, 0, 25);
            class184.field2486++;
        }
        class259 var13 = (class259) class373.field5574.method2649(arg1 - 2223);
        if (arg1 != 2223) {
            field989 = null;
        }
        while (var13 != null) {
            if (var13.field3777 == 57) {
                var13.field3780 = "<col=ffffff>" + var2;
                return;
            }
            var13 = (class259) class373.field5574.method2656(0);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIC)I")
    public static final int method453(int arg0, int arg1, char arg2) {
        field993++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg0 == 1) {
            if (arg2 == 'ñ' && arg1 == 0) {
                var3 = 1762;
            }
            return var3;
        } else {
            return -114;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
    public static void method454(byte arg0) {
        field989 = null;
        field994 = null;
        if (arg0 != 112) {
            method452((class194) null, -76);
        }
        field988 = null;
    }
}
