import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class480 {

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "Ljk;")
    private class449 field7016 = new class449(64);

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "Lqn;")
    private class47 field7024;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "Lqn;")
    private class47 field7022;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field7023 = -1;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field7017;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field7020;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)V")
    public static final void method2927(int arg0, byte arg1) {
        class9.field144 = -1;
        if (arg1 == -49) {
            class179.field2366 = -1;
            class175.field2277 = arg0;
            field7019++;
            class95.method729(0);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V")
    public static final void method2928(boolean arg0) {
        field7021++;
        if (class446.field6394 != null) {
            class446.field6394.method275((byte) -126);
            class183.field2401 = null;
            class446.field6394 = null;
        }
        if (arg0) {
            field7023 = 90;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZI)Lol;")
    public final class188 method2929(boolean arg0, int arg1) {
        field7018++;
        class188 var3 = (class188) this.field7016.method2647(-124, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = this.field7022.method481(0, arg1 & 0x7FFF, -63);
        } else {
            var4 = this.field7024.method481(0, arg1, -116);
        }
        class188 var5 = new class188();
        if (var4 != null) {
            var5.method1175(-2014, new class463(var4));
        }
        if (arg1 >= 32768) {
            var5.method1177(88);
        }
        if (arg0) {
            method2928(false);
        }
        this.field7016.method2635((long) arg1, -26591, var5);
        return var5;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIILya;Lub;)V")
    public static final void method2930(int arg0, int arg1, int arg2, class38 arg3, class18 arg4) {
        class490.field7145.method154(7491);
        field7015++;
        if (class85.field1074) {
            return;
        }
        for (class160 var5 = (class160) arg4.method153(arg0); var5 != null; var5 = (class160) arg4.method161(-46)) {
            class36 var6 = class241.field3097.method1620(var5.field2035, 36);
            if (class500.method3011(var6, false)) {
                boolean var7 = class267.method1590(arg2, var5, (byte) 86, arg3, arg1, var6);
                if (var7) {
                    class111.method813(var6, arg3, var5, 65);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(IB)Z")
    public static final boolean method2931(int arg0, byte arg1) {
        if (arg1 != -84) {
            field7023 = 127;
        }
        field7017++;
        return arg0 == 9 || arg0 == 10 || arg0 == 11;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(ILqn;Lqn;)V")
    public class480(int arg0, class47 arg1, class47 arg2) {
        this.field7024 = arg1;
        this.field7022 = arg2;
        if (this.field7024 != null) {
            this.field7024.method469(30322, 0);
        }
        if (this.field7022 != null) {
            this.field7022.method469(30322, 0);
        }
    }
}
