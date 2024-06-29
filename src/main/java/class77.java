import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class77 {

    @OriginalMember(owner = "client!um", name = "b", descriptor = "Lgp;")
    public static class430 field1088 = new class430("stellardawn", 1);

    @OriginalMember(owner = "client!um", name = "d", descriptor = "Lsl;")
    public static class422 field1090;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)V")
    public static void method651(boolean arg0) {
        field1088 = null;
        field1090 = null;
        if (!arg0) {
            method651(false);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IBLbg;II)V")
    public static final void method652(int arg0, byte arg1, class257 arg2, int arg3, int arg4) {
        field1087++;
        if (arg0 != 15) {
            field1089 = -1;
        }
        int var5 = arg2.field4675[0];
        int var6 = arg2.field4674[0];
        if (var5 < 0 || class379.field5642 <= var5 || var6 < 0 || class456.field6477 <= var6 || arg3 < 0 || arg3 >= class379.field5642 || arg4 < 0 || class456.field6477 <= arg4) {
            return;
        }
        int var7 = class403.method2408(0, arg2.method1705((byte) 65), var5, class302.field4494, 0, class183.field2717[arg2.field4545], arg4, class4.field87, arg3, (byte) -60, 0, var6, -4, true, 0);
        if (var7 >= 1) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg2.method1697(2, class4.field87[var8], class302.field4494[var8], arg1);
            }
        }
    }

    static {
        new class332("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        field1090 = new class422("", 15);
    }
}
