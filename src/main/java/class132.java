import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class132 {

    @OriginalMember(owner = "client!st", name = "a", descriptor = "I")
    public int field2125 = -1;

    @OriginalMember(owner = "client!st", name = "i", descriptor = "S")
    public static short field2133 = 205;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "Lbv;")
    public static class567 field2126 = new class567("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "Lah;")
    public class240 field2128;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "[I")
    public int[] field2131;

    @OriginalMember(owner = "client!st", name = "h", descriptor = "[Ljava/lang/String;")
    public String[] field2132;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method1021(int arg0, int arg1, int arg2) {
        field2127++;
        boolean var3 = (arg2 & 0x37) == 0 ? class155.method1097((byte) -103, arg2, arg1) : class252.method1592(0, arg2, arg1);
        int var4 = 23 % ((-arg0 - 35) / 46);
        return var3 | class471.method2740(arg1, (byte) -122, arg2) | (arg1 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V", line = 15)
    public static void method1022(int arg0) {
        if (arg0 != -1) {
            field2133 = -5;
        }
        field2126 = null;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lae;ZZLjava/lang/String;I)V", line = 25)
    public static final void method1023(class40 arg0, boolean arg1, boolean arg2, String arg3, int arg4) {
        field2129++;
        if (arg4 != -6116) {
            method1023(null, false, false, null, 106);
        }
        if (!arg1) {
            class377.method2292(arg3, arg0, 3, (byte) 105);
            return;
        }
        if (class40.field564.startsWith("win") && class40.field554 != 3) {
            String var5 = null;
            if (arg0.field549 != null) {
                var5 = arg0.field549.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class329 var6 = class377.method2292(arg3, arg0, 0, (byte) 39);
                class350.field5010 = arg3;
                class25.field348 = var6;
                class537.field7493 = arg0;
                return;
            }
        }
        if (class40.field564.startsWith("mac")) {
            String var7 = null;
            if (arg0.field549 != null) {
                var7 = arg0.field549.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg2) {
                class377.method2292(arg3, arg0, 1, (byte) 57);
                return;
            }
        }
        class377.method2292(arg3, arg0, 2, (byte) 98);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIZ)Lhe;", line = 90)
    public static final class217 method1024(int arg0, int arg1, boolean arg2) {
        field2130++;
        if (arg1 == 0) {
            long var3 = (long) (arg0 | (arg2 ? Integer.MIN_VALUE : 0));
            return (class217) class117.field1898.method740(arg1, var3);
        } else {
            return null;
        }
    }
}
