import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class442 {

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public int field6177 = 2048;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public int field6178 = 2048;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public int field6181 = 0;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public int field6187 = 0;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "Lmt;")
    public static class276 field6179 = new class276(12, 0, 1, 0);

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "Leh;")
    public static class246 field6185;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field6186;

    static {
        new class530("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field6185 = new class246(16, -2);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lir;Z)V", line = 6)
    public static final void method2588(class22 arg0, boolean arg1) {
        if (!arg1) {
            method2588(null, true);
        }
        field6180++;
        class136 var2 = (class136) class542.field7922.method2405((long) arg0.field3289, -98);
        if (var2 == null) {
            class138.method863(0, arg0.field3368[0], null, arg0.field3378[0], arg0.field1904, arg0, -9518, null);
        } else {
            var2.method856((byte) -111);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V", line = 25)
    public static void method2589(int arg0) {
        if (arg0 != 0) {
            field6185 = null;
        }
        field6179 = null;
        field6185 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lwm;I)V", line = 41)
    public final void method2590(class403 arg0, int arg1) {
        field6186++;
        while (true) {
            int var3 = arg0.method2357((byte) 115);
            if (var3 == 0) {
                if (arg1 == 26936) {
                    return;
                } else {
                    method2589(-115);
                    return;
                }
            }
            this.method2591(arg0, false, var3);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lwm;ZI)V", line = 66)
    private final void method2591(class403 arg0, boolean arg1, int arg2) {
        if (arg1) {
            method2593(36, true, (byte) 36, 14, -27);
        }
        if (arg2 == 1) {
            this.field6181 = arg0.method2357((byte) 104);
        } else if (arg2 == 2) {
            this.field6177 = arg0.method2338(0);
        } else if (arg2 == 3) {
            this.field6178 = arg0.method2338(0);
        } else if (arg2 == 4) {
            this.field6187 = arg0.method2371(7162);
        }
        field6182++;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V", line = 95)
    public static final void method2592(int arg0) {
        if (arg0 != 18859) {
            return;
        }
        field6183++;
        if (class515.field7593 != -1) {
            method2593(class515.field7593, false, (byte) -119, -1, -1);
            class515.field7593 = -1;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZBII)V", line = 112)
    public static final void method2593(int arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        field6184++;
        if (arg2 >= -24) {
            field6185 = null;
        }
        if (class405.field5737 == 0) {
            class315.method1896(false, 64);
        } else {
            class86.field1072 = class405.field5737;
            class192.method1221((byte) -87, 0);
        }
        class453.field6358 = arg1;
        class214.field3084 = arg3;
        class15.field196 = arg4;
        class245.method1554(arg0);
    }
}
