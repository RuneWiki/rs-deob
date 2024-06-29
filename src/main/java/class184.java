import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class184 {

    @OriginalMember(owner = "client!el", name = "f", descriptor = "Lad;")
    private class19 field2064 = new class19(64);

    @OriginalMember(owner = "client!el", name = "l", descriptor = "Lad;")
    public class19 field2070 = new class19(64);

    @OriginalMember(owner = "client!el", name = "e", descriptor = "Ltf;")
    public class701 field2063;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "Ltf;")
    private class701 field2059;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field2065 = -1;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field2062 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V", line = 3)
    public final void method1113(boolean arg0) {
        field2060++;
        if (arg0) {
            return;
        }
        class19 var2 = this.field2064;
        synchronized (this.field2064) {
            this.field2064.method88(79);
        }
        class19 var3 = this.field2070;
        synchronized (this.field2070) {
            this.field2070.method88(86);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)Lgw;", line = 23)
    public final class145 method1114(int arg0, int arg1) {
        field2068++;
        class19 var3 = this.field2064;
        class145 var4;
        synchronized (this.field2064) {
            var4 = (class145) this.field2064.method78(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class701 var5 = this.field2059;
        byte[] var6;
        synchronized (this.field2059) {
            if (arg0 != -1) {
                this.field2059 = null;
            }
            var6 = this.field2059.method3854((byte) 77, 34, arg1);
        }
        class145 var7 = new class145();
        var7.field1599 = this;
        if (var6 != null) {
            var7.method796(new class115(var6), -21187);
        }
        class19 var8 = this.field2064;
        synchronized (this.field2064) {
            this.field2064.method92(1, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 57)
    public static final void method1115(int arg0, String arg1, int arg2) {
        class154.field1703++;
        field2069++;
        class653 var3 = class699.method3845((byte) 45, class39.field395, class156.field1749);
        var3.field9158.method658(arg0 + class72.method382(2018672392, arg1), (byte) 73);
        var3.field9158.method633((byte) -79, arg2);
        var3.field9158.method672((byte) -116, arg1);
        class568.method3220(var3, (byte) 9);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 81)
    public final void method1116(int arg0) {
        if (arg0 != 3940) {
            this.field2070 = null;
        }
        field2067++;
        class19 var2 = this.field2064;
        synchronized (this.field2064) {
            this.field2064.method80((byte) -89);
        }
        class19 var3 = this.field2070;
        synchronized (this.field2070) {
            this.field2070.method80((byte) -83);
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V", line = 97)
    public static void method1117(int arg0) {
        if (arg0 < 87) {
            method1115(51, null, -81);
        }
        field2062 = null;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(II)V", line = 112)
    public final void method1118(int arg0, int arg1) {
        field2061++;
        class19 var3 = this.field2064;
        synchronized (this.field2064) {
            this.field2064.method83((byte) -2, arg0);
        }
        class19 var4 = this.field2070;
        synchronized (this.field2070) {
            this.field2070.method83((byte) -2, arg0);
            if (arg1 <= 68) {
                this.method1118(-115, -64);
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IBI)V", line = 128)
    public final void method1119(int arg0, byte arg1, int arg2) {
        if (arg1 < -59) {
            this.field2064 = new class19(arg2);
            field2066++;
            this.field2070 = new class19(arg0);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lla;)V", line = 140)
    public static final void method1120(class413 arg0) {
        class653.field9162 = arg0;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lqh;ILtf;Ltf;)V", line = 161)
    public class184(class320 arg0, int arg1, class701 arg2, class701 arg3) {
        this.field2063 = arg3;
        this.field2059 = arg2;
        this.field2059.method3883(34, 0);
    }
}
