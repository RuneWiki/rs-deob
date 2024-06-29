import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class260 extends class508 {

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "I")
    public int field3302;

    @OriginalMember(owner = "client!kr", name = "D", descriptor = "I")
    public int field3305;

    @OriginalMember(owner = "client!kr", name = "x", descriptor = "Ljava/util/Random;")
    public static Random field3300;

    @OriginalMember(owner = "client!kr", name = "B", descriptor = "Lpi;")
    public static class340 field3303;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!kr", name = "u", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!kr", name = "v", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!kr", name = "w", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!kr", name = "y", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!kr", name = "C", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(B)V")
    public static final void method1623(byte arg0) {
        field3304++;
        class502 var1 = (class502) class103.field1421.method49(-2);
        int var2 = 61 % ((arg0 + 8) / 43);
        while (var1 != null) {
            if (method1630(var1.field7390, 46)) {
                class301.method1808(var1, 29581);
            }
            var1 = (class502) class103.field1421.method46((byte) 63);
        }
        if (class271.field3433 == 1) {
            class450.field6267 = false;
            class475.method2855(class129.field1756, class44.field642, class115.field1574, 0, class98.field1374);
            return;
        }
        class475.method2855(class129.field1756, class44.field642, class115.field1574, 0, class98.field1374);
        int var3 = class157.field2070.method1704((byte) 115, class457.field6383.method1127(class379.field4920, false));
        for (class502 var4 = (class502) class103.field1421.method49(-108); var4 != null; var4 = (class502) class103.field1421.method46((byte) 127)) {
            int var5 = class388.method2314(-1405, var4);
            if (var3 < var5) {
                var3 = var5;
            }
        }
        class98.field1374 = var3 + 8;
        class129.field1756 = class271.field3433 * 16 + (class419.field5575 ? 26 : 22);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
    public static void method1624(int arg0) {
        field3303 = null;
        if (arg0 >= -114) {
            field3303 = null;
        }
        field3300 = null;
    }

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)I")
    public final int method1625(int arg0) {
        field3301++;
        if (arg0 != -28283) {
            field3303 = null;
        }
        return this.field3305 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(ZI)Z")
    public final boolean method1626(boolean arg0, int arg1) {
        field3293++;
        if (!arg0) {
            method1630(-80, -70);
        }
        return (this.field3305 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "(I)Z")
    public final boolean method1627(int arg0) {
        field3298++;
        if (arg0 == -28246) {
            return (this.field3305 >> 21 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "(B)I")
    public final int method1628(byte arg0) {
        field3296++;
        if (arg0 > -109) {
            method1623((byte) 81);
        }
        return class282.method1726(1, this.field3305);
    }

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "(I)Z")
    public final boolean method1629(int arg0) {
        if (arg0 != 17131) {
            this.field3302 = 65;
        }
        field3292++;
        return (this.field3305 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)Z")
    private static final boolean method1630(int arg0, int arg1) {
        if (arg1 == 46) {
            field3295++;
            return arg0 == 18 || arg0 == 46 || arg0 == 1008 || arg0 == 45 || arg0 == 3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "(I)Z")
    public final boolean method1631(int arg0) {
        int var2 = -84 % ((arg0 - 60) / 39);
        field3299++;
        return (this.field3305 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lnh;")
    public static final class512 method1632(Throwable arg0, String arg1) {
        field3294++;
        class512 var2;
        if (arg0 instanceof class512) {
            var2 = (class512) arg0;
            var2.field7539 = var2.field7539 + ' ' + arg1;
        } else {
            var2 = new class512(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(II)V")
    public class260(int arg0, int arg1) {
        this.field3302 = arg1;
        this.field3305 = arg0;
    }

    static {
        new class169("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field3300 = new Random();
        field3303 = new class340(65, -2);
    }
}
