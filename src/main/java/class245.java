import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class245 {

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "Lku;")
    private class232 field3642 = new class232(64);

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "Lb;")
    private class201 field3644;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "Ldk;")
    public static class326 field3637 = new class326("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public static final void method1539(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 3188) {
            method1542(122);
        }
        field3641++;
        class145 var5 = class441.method2598((byte) -127, arg4, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field1929 != null) {
            class202 var6 = new class202();
            var6.field2975 = arg0;
            var6.field2977 = arg1;
            var6.field2976 = var5;
            var6.field2971 = var5.field1929;
            class290.method1818(var6);
        }
        boolean var7 = true;
        if (var5.field2062 != 0) {
            var7 = class334.method2114(var5, (byte) 67);
        }
        if (!var7 || !client.method1122(var5).method2318(-1, arg1 - 1)) {
            return;
        }
        if (arg1 == 1) {
            class15.method110(class187.field2804, -125);
            class45.field644++;
            class262.method1623(arg2, arg4, (byte) 106, var5.field2016);
        }
        if (arg1 == 2) {
            class15.method110(class411.field5769, -127);
            class465.field6497++;
            class262.method1623(arg2, arg4, (byte) 106, var5.field2016);
        }
        if (arg1 == 3) {
            class470.field6612++;
            class15.method110(class53.field719, -126);
            class262.method1623(arg2, arg4, (byte) 106, var5.field2016);
        }
        if (arg1 == 4) {
            class15.method110(class359.field5173, arg3 - 3315);
            class170.field2479++;
            class262.method1623(arg2, arg4, (byte) 106, var5.field2016);
        }
        if (arg1 == 5) {
            class353.field5100++;
            class15.method110(class28.field373, -126);
            class262.method1623(arg2, arg4, (byte) 106, var5.field2016);
        }
        if (arg1 == 6) {
            class15.method110(class359.field5172, -127);
            class289.field4206++;
            class262.method1623(arg2, arg4, (byte) 106, var5.field2016);
        }
        if (arg1 == 7) {
            class44.field632++;
            class15.method110(class19.field234, -125);
            class262.method1623(arg2, arg4, (byte) 106, var5.field2016);
        }
        if (arg1 == 8) {
            class15.method110(class478.field6710, -125);
            class179.field2583++;
            class262.method1623(arg2, arg4, (byte) 106, var5.field2016);
        }
        if (arg1 == 9) {
            class15.method110(class473.field6654, arg3 ^ 0xFFFFF3F4);
            class222.field3365++;
            class262.method1623(arg2, arg4, (byte) 106, var5.field2016);
        }
        if (arg1 == 10) {
            class15.method110(class426.field5965, -126);
            class199.field2904++;
            class262.method1623(arg2, arg4, (byte) 106, var5.field2016);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)V")
    public final void method1540(boolean arg0) {
        class232 var2 = this.field3642;
        synchronized (this.field3642) {
            this.field3642.method1478((byte) -84);
            if (!arg0) {
                method1542(-97);
            }
        }
        field3645++;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)Lhn;")
    public final class467 method1541(int arg0, int arg1) {
        field3643++;
        class232 var3 = this.field3642;
        class467 var4;
        synchronized (this.field3642) {
            var4 = (class467) this.field3642.method1479(0, (long) arg1);
            if (arg0 > -21) {
                this.field3644 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3644.method1257(arg1, 11, 24558);
        class467 var6 = new class467();
        if (var5 != null) {
            var6.method2751(40, new class276(var5));
        }
        class232 var7 = this.field3642;
        synchronized (this.field3642) {
            this.field3642.method1473(var6, (long) arg1, 113);
            return var6;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
    public static void method1542(int arg0) {
        if (arg0 == 3) {
            field3637 = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IB)V")
    public final void method1543(int arg0, byte arg1) {
        class232 var3 = this.field3642;
        synchronized (this.field3642) {
            if (arg1 != 63) {
                return;
            }
            this.field3642.method1486(438127120, arg0);
        }
        field3638++;
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lea;ILb;)V")
    public class245(class353 arg0, int arg1, class201 arg2) {
        this.field3644 = arg2;
        if (this.field3644 != null) {
            this.field3644.method1235(0, 11);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILhg;II)V")
    public static final void method1544(int arg0, class450 arg1, int arg2, int arg3) {
        field3639++;
        class286.field4169[arg0][arg3] = arg1;
        if (arg2 != -3) {
            field3646 = 82;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
    public final void method1545(byte arg0) {
        field3640++;
        class232 var2 = this.field3642;
        synchronized (this.field3642) {
            this.field3642.method1475(0);
        }
        if (arg0 > -68) {
            this.method1541(-9, 37);
        }
    }
}
