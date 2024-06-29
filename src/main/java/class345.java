import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public abstract class class345 extends class147 {

    @OriginalMember(owner = "client!wt", name = "s", descriptor = "Lab;")
    public static class256 field4934;

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!wt", name = "q", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!wt", name = "r", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!wt", name = "t", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!wt", name = "u", descriptor = "I")
    public static int field4936;

    static {
        new class40("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field4934 = null;
        new class40("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIII)V", line = 3)
    public static final void method2091(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 23436) {
            return;
        }
        field4932++;
        class89 var4 = class146.method695(11, arg2, (byte) -111);
        var4.method449(true);
        var4.field1106 = arg3;
        var4.field1100 = arg1;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIZ)I", line = 26)
    public static final int method2092(int arg0, int arg1, int arg2, boolean arg3) {
        field4931++;
        class458 var4 = class230.method1272((byte) -127, arg3, arg1);
        if (var4 == null) {
            return -1;
        } else if (arg2 >= 0 && var4.field6447.length > arg2) {
            int var5 = -12 / ((arg0 - 71) / 53);
            return var4.field6447[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)V", line = 48)
    public static void method2093(int arg0) {
        if (arg0 >= -83) {
            field4935 = -107;
        }
        field4934 = null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(BLg;)I", line = 71)
    public static final int method2094(byte arg0, class470 arg1) {
        field4930++;
        int var2 = 0;
        if (arg0 != -19) {
            field4933 = -117;
        }
        if (arg1.method2758(class432.field6255, arg0 + 18)) {
            var2++;
        }
        if (arg1.method2758(class66.field834, -1)) {
            var2++;
        }
        if (arg1.method2758(class10.field106, -1)) {
            var2++;
        }
        if (arg1.method2758(class463.field6524, arg0 ^ 0x12)) {
            var2++;
        }
        if (arg1.method2758(class457.field6443, arg0 + 18)) {
            var2++;
        }
        if (arg1.method2758(class175.field2104, -1)) {
            var2++;
        }
        if (arg1.method2758(class147.field1786, -1)) {
            var2++;
        }
        if (arg1.method2758(class382.field5429, -1)) {
            var2++;
        }
        if (arg1.method2758(class99.field1214, -1)) {
            var2++;
        }
        if (arg1.method2758(class178.field2154, -1)) {
            var2++;
        }
        if (arg1.method2758(class96.field1190, arg0 + 18)) {
            var2++;
        }
        if (arg1.method2758(class236.field3267, -1)) {
            var2++;
        }
        if (arg1.method2758(class162.field1941, -1)) {
            var2++;
        }
        if (arg1.method2758(class479.field6772, -1)) {
            var2++;
        }
        if (arg1.method2758(class15.field204, arg0 + 18)) {
            var2++;
        }
        if (arg1.method2758(class301.field4476, -1)) {
            var2++;
        }
        return var2;
    }
}
