import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class361 extends class15 {

    @OriginalMember(owner = "client!ol", name = "E", descriptor = "I")
    public int field5200 = 0;

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "Lvf;")
    public static class166 field5198 = new class166();

    @OriginalMember(owner = "client!ol", name = "F", descriptor = "Lsd;")
    public static class74 field5201 = new class74(27, 8);

    @OriginalMember(owner = "client!ol", name = "G", descriptor = "Lec;")
    public static class40 field5202 = new class40("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

    @OriginalMember(owner = "client!ol", name = "H", descriptor = "I")
    public static int field5203 = 0;

    @OriginalMember(owner = "client!ol", name = "K", descriptor = "I")
    public static int field5206 = 0;

    @OriginalMember(owner = "client!ol", name = "I", descriptor = "Lsd;")
    public static class74 field5204 = new class74(60, -1);

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!ol", name = "J", descriptor = "Loc;")
    public static class100 field5205;

    @OriginalMember(owner = "client!ol", name = "L", descriptor = "Lrg;")
    public static class395 field5207;

    @OriginalMember(owner = "client!ol", name = "M", descriptor = "[Lmi;")
    public static class443[] field5208;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "(B)V", line = 4)
    public static void method2198(byte arg0) {
        field5208 = null;
        field5204 = null;
        field5205 = null;
        field5201 = null;
        field5207 = null;
        field5198 = null;
        if (arg0 <= 25) {
            method2200((byte) -19);
        }
        field5202 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZLvt;)V", line = 20)
    public final void method2199(boolean arg0, class179 arg1) {
        field5197++;
        while (true) {
            int var3 = arg1.method895((byte) -76);
            if (var3 == 0) {
                if (arg0) {
                    return;
                } else {
                    field5208 = null;
                    return;
                }
            }
            this.method2201(var3, arg1, -94);
        }
    }

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "(B)I", line = 41)
    public static final int method2200(byte arg0) {
        if (arg0 < 11) {
            field5204 = null;
        }
        field5195++;
        return 6;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILvt;I)V", line = 55)
    private final void method2201(int arg0, class179 arg1, int arg2) {
        int var4 = -103 % ((-arg2 - 13) / 61);
        if (arg0 == 2) {
            this.field5200 = arg1.method916(21933);
        }
        field5199++;
    }
}
