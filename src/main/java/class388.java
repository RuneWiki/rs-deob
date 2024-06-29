import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class388 {

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public int field5629;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public int field5630;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public int field5628;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    public int field5633;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "Ljc;")
    public static class305 field5631 = new class305("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2352(byte arg0) {
        class452.field6760 = 0;
        class53.field614 = 0;
        class336.field4454 = 0;
        class415.field5972 = 0;
        field5632++;
        if (arg0 >= -16) {
            method2356(-29, -88, (byte) 22, null);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)Lnl;", line = 14)
    public final class388 method2353(byte arg0, int arg1) {
        if (arg0 >= -50) {
            this.field5629 = -22;
        }
        field5634++;
        return new class388(this.field5630, arg1, this.field5633, this.field5629);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 30)
    public static void method2354(int arg0) {
        field5631 = null;
        if (arg0 <= 62) {
            method2355(-87, true);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZ)V", line = 40)
    public static final void method2355(int arg0, boolean arg1) {
        field5626++;
        if (arg1) {
            field5631 = null;
        }
        if (class532.field7840 == null || class532.field7840.length < arg0) {
            class532.field7840 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIBLlr;)V", line = 60)
    public static final void method2356(int arg0, int arg1, byte arg2, class531 arg3) {
        if (arg3.field1196 == arg1 && arg1 != -1) {
            class260 var4 = class7.field97.method2951(arg1, -13765);
            int var5 = var4.field3475;
            if (var5 == 1) {
                arg3.field1203 = 0;
                arg3.field1233 = 0;
                arg3.field1152 = arg0;
                arg3.field1182 = 1;
                arg3.field1197 = 0;
                class276.method1678(var4, arg3.field3695, arg3.field3704, (byte) 88, arg3.field3694, class96.field1170 == arg3, arg3.field1233);
            }
            if (var5 == 2) {
                arg3.field1203 = 0;
            }
        } else if (arg1 == -1 || arg3.field1196 == -1 || class7.field97.method2951(arg1, -13765).field3478 >= class7.field97.method2951(arg3.field1196, -13765).field3478) {
            arg3.field1196 = arg1;
            arg3.field1152 = arg0;
            arg3.field1182 = 1;
            arg3.field1257 = arg3.field1254;
            arg3.field1233 = 0;
            arg3.field1203 = 0;
            arg3.field1197 = 0;
            if (arg3.field1196 != -1) {
                class276.method1678(class7.field97.method2951(arg3.field1196, -13765), arg3.field3695, arg3.field3704, (byte) 93, arg3.field3694, class96.field1170 == arg3, arg3.field1233);
            }
        }
        field5627++;
        int var6 = -61 / ((-arg2 - 14) / 38);
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(IIII)V", line = 110)
    public class388(int arg0, int arg1, int arg2, int arg3) {
        this.field5629 = arg3;
        this.field5630 = arg0;
        this.field5628 = arg1;
        this.field5633 = arg2;
    }
}
