import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class57 extends class136 {

    @OriginalMember(owner = "client!gv", name = "E", descriptor = "I")
    private int field663 = 4096;

    @OriginalMember(owner = "client!gv", name = "H", descriptor = "I")
    private int field666 = 0;

    @OriginalMember(owner = "client!gv", name = "C", descriptor = "Lgk;")
    public static class331 field661 = new class331(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!gv", name = "G", descriptor = "Lib;")
    public static class106 field665 = new class106(8);

    @OriginalMember(owner = "client!gv", name = "D", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!gv", name = "F", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!gv", name = "I", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!gv", name = "J", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "()V")
    public class57() {
        super(1, true);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IILiv;)V")
    public final void method268(int arg0, int arg1, class65 arg2) {
        ++field662;
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field663 = arg2.method623((byte) -125);
            }
        } else {
            this.field666 = arg2.method623((byte) -45);
        }
        if (arg0 != 4) {
            this.method268(-128, -105, (class65) null);
        }
    }

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "(B)V")
    public static void method528(byte arg0) {
        field665 = null;
        if (arg0 != -72) {
            field661 = null;
        }
        field661 = null;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(BLfs;)V")
    public static final void method529(byte arg0, class387 arg1) {
        ++field664;
        class65.field814 = arg1.method2358("p11_full", (byte) 86);
        class398.field5888 = arg1.method2358("p12_full", (byte) -85);
        class486.field7139 = arg1.method2358("b12_full", (byte) 57);
        class235.field3448 = arg1.method2358("hitmarks", (byte) 113);
        class231.field3403 = arg1.method2358("hitbar_default", (byte) 62);
        class490.field7192 = arg1.method2358("timerbar_default", (byte) -96);
        if (arg0 <= 61) {
            field665 = null;
        }
        class26.field313 = arg1.method2358("headicons_pk", (byte) -96);
        class486.field7135 = arg1.method2358("headicons_prayer", (byte) 72);
        class208.field3017 = arg1.method2358("hint_headicons", (byte) -83);
        class252.field3712 = arg1.method2358("hint_mapmarkers", (byte) -88);
        class318.field4513 = arg1.method2358("mapflag", (byte) -111);
        class364.field5090 = arg1.method2358("cross", (byte) 113);
        class269.field3961 = arg1.method2358("mapdots", (byte) -124);
        class471.field6960 = arg1.method2358("scrollbar", (byte) 97);
        class13.field154 = arg1.method2358("name_icons", (byte) -109);
        class12.field143 = arg1.method2358("floorshadows", (byte) -113);
        class425.field6278 = arg1.method2358("compass", (byte) 94);
        class112.field1576 = arg1.method2358("otherlevel", (byte) -101);
        class455.field6695 = arg1.method2358("hint_mapedge", (byte) -127);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)[I")
    public final int[] method82(int arg0, int arg1) {
        ++field667;
        int var3 = 35 % ((67 - arg0) / 50);
        int[] var4 = super.field1957.method2887((byte) -112, arg1);
        if (super.field1957.field7031) {
            int[] var5 = this.method1033(arg1, 0, 0);
            for (int var6 = 0; ~class467.field6889 < ~var6; ++var6) {
                int var7 = var5[var6];
                var4[var6] = ~this.field666 >= ~var7 && this.field663 >= var7 ? 4096 : 0;
            }
        }
        return var4;
    }

    static {
        new class331("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
    }
}
