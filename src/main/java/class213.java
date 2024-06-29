import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class213 extends class177 {

    @OriginalMember(owner = "client!fl", name = "R", descriptor = "Lbe;")
    public static class283 field3617 = class153.method941(125, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!fl", name = "X", descriptor = "I")
    public static int field3623 = 0;

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "Lbe;")
    public static class283 field3616 = class153.method941(127, "");

    @OriginalMember(owner = "client!fl", name = "W", descriptor = "I")
    public static int field3622 = -1;

    @OriginalMember(owner = "client!fl", name = "ab", descriptor = "Lbe;")
    public static class283 field3626 = field3616;

    @OriginalMember(owner = "client!fl", name = "S", descriptor = "Lbe;")
    public static class283 field3618 = class153.method941(127, "headicons_prayer");

    @OriginalMember(owner = "client!fl", name = "bb", descriptor = "Lbe;")
    public static class283 field3627 = class153.method941(2, "leuchten2:");

    @OriginalMember(owner = "client!fl", name = "U", descriptor = "Lbe;")
    public static class283 field3620 = field3616;

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!fl", name = "T", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!fl", name = "Z", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!fl", name = "eb", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!fl", name = "fb", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!fl", name = "Y", descriptor = "Lea;")
    public static class191 field3624;

    @OriginalMember(owner = "client!fl", name = "V", descriptor = "Lt;")
    private class239 field3621;

    @OriginalMember(owner = "client!fl", name = "db", descriptor = "[Lqb;")
    public static class95[] field3629;

    @OriginalMember(owner = "client!fl", name = "cb", descriptor = "[S")
    public static short[] field3628;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V", line = 10)
    public static final void method1407(byte arg0) {
        class126.field2084++;
        class228.field3831.method621(103, 8);
        field3615++;
        if (arg0 == -110) {
            class228.field3831.method1510((byte) 28, class245.field4173);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILfe;I)V", line = 30)
    private final void method1408(int arg0, class229 arg1, int arg2) {
        if (arg0 == 249) {
            int var4 = arg1.method1535((byte) 75);
            if (this.field3621 == null) {
                int var5 = class53.method336(-1753429918, var4);
                this.field3621 = new class239(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method1535((byte) 127) == 1;
                int var8 = arg1.method1551(33);
                class86 var9;
                if (var7) {
                    var9 = new class236(arg1.method1549(true));
                } else {
                    var9 = new class119(arg1.method1528(true));
                }
                this.field3621.method1611(var9, -1, (long) var8);
            }
        }
        int var10 = 48 % ((-arg2 - 87) / 35);
        field3625++;
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(B)V", line = 75)
    public static void method1409(byte arg0) {
        field3626 = null;
        field3616 = null;
        field3624 = null;
        field3618 = null;
        field3620 = null;
        field3628 = null;
        if (arg0 != 114) {
            field3628 = (short[]) null;
        }
        field3627 = null;
        field3617 = null;
        field3629 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZII)I", line = 96)
    public final int method1410(boolean arg0, int arg1, int arg2) {
        field3619++;
        if (this.field3621 == null) {
            return arg1;
        }
        if (arg0) {
            method1409((byte) -14);
        }
        class119 var4 = (class119) this.field3621.method1612((long) arg2, 123);
        return var4 == null ? arg1 : var4.field1998;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBLbe;)Lbe;", line = 116)
    public final class283 method1411(int arg0, byte arg1, class283 arg2) {
        field3630++;
        if (this.field3621 == null) {
            return arg2;
        }
        if (arg1 > -50) {
            field3624 = (class191) null;
        }
        class236 var4 = (class236) this.field3621.method1612((long) arg0, 126);
        return var4 == null ? arg2 : var4.field3955;
    }

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "(I)V", line = 137)
    public static final void method1412(int arg0) {
        class254.field4295 = arg0;
        for (int var1 = 0; var1 < class246.field4176; var1++) {
            for (int var2 = 0; var2 < class76.field1325; var2++) {
                if (class86.field1459[arg0][var1][var2] == null) {
                    class86.field1459[arg0][var1][var2] = new class160(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZLfe;)V", line = 189)
    public final void method1413(boolean arg0, class229 arg1) {
        if (!arg0) {
            return;
        }
        field3631++;
        while (true) {
            int var3 = arg1.method1535((byte) 96);
            if (var3 == 0) {
                return;
            }
            this.method1408(var3, arg1, -125);
        }
    }
}
