import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class520 extends class452 {

    @OriginalMember(owner = "client!au", name = "D", descriptor = "[I")
    public static int[] field7618 = new int[2];

    @OriginalMember(owner = "client!au", name = "v", descriptor = "Lak;")
    public static class234 field7610 = new class234("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!au", name = "w", descriptor = "I")
    public static int field7611;

    @OriginalMember(owner = "client!au", name = "x", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!au", name = "y", descriptor = "I")
    public static int field7613;

    @OriginalMember(owner = "client!au", name = "z", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!au", name = "B", descriptor = "I")
    public static int field7616;

    @OriginalMember(owner = "client!au", name = "C", descriptor = "I")
    public static int field7617;

    @OriginalMember(owner = "client!au", name = "E", descriptor = "I")
    public static int field7619;

    @OriginalMember(owner = "client!au", name = "F", descriptor = "I")
    public static int field7620;

    @OriginalMember(owner = "client!au", name = "G", descriptor = "I")
    public static int field7621;

    @OriginalMember(owner = "client!au", name = "A", descriptor = "Lgu;")
    private class412 field7615;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IB)Z", line = 5)
    public static final boolean method3092(int arg0, byte arg1) {
        field7621++;
        int var2 = -43 / ((-arg1 - 63) / 53);
        return arg0 >= 12 && arg0 <= 17;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ILhp;I)V", line = 17)
    private final void method3093(int arg0, class217 arg1, int arg2) {
        field7613++;
        if (arg0 <= 100) {
            method3096(33, 92, (byte) 1, 40, 62, -90);
        }
        if (arg2 != 249) {
            return;
        }
        int var4 = arg1.method1515((byte) 123);
        if (this.field7615 == null) {
            int var5 = class396.method2493((byte) 66, var4);
            this.field7615 = new class412(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg1.method1515((byte) 122) == 1;
            int var8 = arg1.method1548(31529);
            class431 var9;
            if (var7) {
                var9 = new class46(arg1.method1550((byte) 28));
            } else {
                var9 = new class308(arg1.method1556(125));
            }
            this.field7615.method2591((long) var8, var9, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(BILjava/lang/String;)Ljava/lang/String;", line = 64)
    public final String method3094(byte arg0, int arg1, String arg2) {
        field7614++;
        if (arg0 != -28) {
            return null;
        } else if (this.field7615 == null) {
            return arg2;
        } else {
            class46 var4 = (class46) this.field7615.method2585((byte) 114, (long) arg1);
            return var4 == null ? arg2 : var4.field593;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)V", line = 84)
    public static void method3095(boolean arg0) {
        field7618 = null;
        if (arg0) {
            field7610 = null;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIBIII)V", line = 95)
    public static final void method3096(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 > -121) {
            return;
        }
        if (class327.field4931 <= arg4 && arg1 <= class184.field2777 && class404.field5987 <= arg0 && class433.field6414 >= arg3) {
            class280.method1825(arg1, 112, arg5, arg0, arg3, arg4);
        } else {
            class219.method1570(arg4, arg5, 80, arg0, arg3, arg1);
        }
        field7619++;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V", line = 112)
    public static final void method3097(byte arg0) {
        class457.field6653.method2087((byte) 115);
        field7620++;
        class62.field760.method916(0);
        class436.field6440.method818(53);
        class510.field7458.method2978(-113);
        class175.field2605.method2784(1);
        class390.field5847.method464(118);
        class242.field3846.method2242(-106);
        class123.field1839.method1484((byte) 119);
        class125.field1856.method1443(-31680);
        class314.field4740.method2367(18);
        class138.field2094.method2807(false);
        class59.field711.method1063((byte) -50);
        class107.field1502.method3073(4);
        class327.field4930.method145((byte) -107);
        class474.field6839.method3059(-119);
        class517.field7530.method1232(false);
        class138.field2098.method838((byte) 29);
        class52.field639.method1705((byte) -94);
        class347.field5134.method1612((byte) 25);
        if (arg0 < 22) {
            field7610 = null;
        }
        class280.field4227.method3022((byte) 101);
        class313.method1997((byte) 86);
        class415.method2606(0);
        class331.method2098(3);
        class258.method1720(103);
        class406.field6011.method88(89);
        class152.field2261.method88(83);
        class485.field6972.method88(105);
        class398.field5949.method88(94);
        class192.field3255.method88(114);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(BLul;I)Llm;", line = 152)
    public static final class348 method3098(byte arg0, class406 arg1, int arg2) {
        field7617++;
        if (arg0 <= 3) {
            field7618 = null;
        }
        byte[] var3 = arg1.method2558(arg2, 90);
        return var3 == null ? null : new class348(var3);
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(III)I", line = 170)
    public final int method3099(int arg0, int arg1, int arg2) {
        field7612++;
        int var4 = 34 % ((arg0 - 15) / 39);
        if (this.field7615 == null) {
            return arg1;
        } else {
            class308 var5 = (class308) this.field7615.method2585((byte) 114, (long) arg2);
            return var5 == null ? arg1 : var5.field4638;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ILhp;)V", line = 188)
    public final void method3100(int arg0, class217 arg1) {
        if (arg0 != 18709) {
            field7610 = null;
        }
        field7616++;
        while (true) {
            int var3 = arg1.method1515((byte) 127);
            if (var3 == 0) {
                return;
            }
            this.method3093(112, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Luq;III)V", line = 218)
    public static final void method3101(class114 arg0, int arg1, int arg2, int arg3) {
        field7611++;
        if (arg0 == null) {
            return;
        }
        if (arg0.field1619 != null) {
            class405 var4 = new class405();
            var4.field6008 = arg0.field1619;
            var4.field6004 = arg0;
            class192.method1356(var4);
        }
        class366.field5390 = arg3;
        class424.field6317 = arg0.field1598;
        class245.field3859 = true;
        class371.field5524 = arg0.field1644;
        class287.field4348 = arg0.field1718;
        if (arg2 > -54) {
            field7610 = null;
        }
        class358.field5318 = arg0.field1630;
        class71.field1028 = arg0.field1670;
        class108.field1514 = arg1;
        class262.method1747(20556, arg0);
    }
}
