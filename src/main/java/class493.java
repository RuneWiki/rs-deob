import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class493 {

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "[Lsb;")
    public static class193[] field7217;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field7220;

    static {
        new class305("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field7219 = 0;
        field7217 = new class193[30];
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method2980(int arg0, int arg1, int arg2) {
        field7218++;
        if (arg0 != 30) {
            field7219 = 49;
        }
        return ((arg2 & 0x2000) != 0 | class151.method905(arg1, arg2, 32210) | class389.method2357(false, arg2, arg1)) & class299.method1787(arg1, arg0 ^ 0x67, arg2);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 25)
    public static final void method2981(int arg0) {
        field7220++;
        if (arg0 < 14 || !class188.field2430) {
            return;
        }
        while (true) {
            while (class55.field637.length > class99.field1353) {
                class54 var1 = class55.field637[class99.field1353];
                if (var1 != null && var1.field628 == -1) {
                    if (class463.field6903 == null) {
                        class463.field6903 = class143.field1912.method2346(var1.field629, 2014692412);
                    }
                    int var2 = class463.field6903.field2716;
                    if (var2 == -1) {
                        return;
                    }
                    class463.field6903 = null;
                    class99.field1353++;
                    var1.field628 = var2;
                } else {
                    class99.field1353++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(III)V", line = 68)
    public static final void method2982(int arg0, int arg1, int arg2) {
        class498 var3 = class186.field2421[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field7259 != null) {
            var3.field7259 = null;
        }
        if (var3.field7271 != null) {
            var3.field7271 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V", line = 81)
    public static void method2983(boolean arg0) {
        field7217 = null;
        if (arg0) {
            method2980(-86, 40, -54);
        }
    }
}
