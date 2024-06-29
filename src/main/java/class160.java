import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class160 extends class450 {

    @OriginalMember(owner = "client!mr", name = "B", descriptor = "I")
    public static int field2556 = -1;

    @OriginalMember(owner = "client!mr", name = "G", descriptor = "[Lok;")
    public static class172[] field2561 = new class172[30];

    @OriginalMember(owner = "client!mr", name = "F", descriptor = "Lnk;")
    public static class326 field2560 = new class326(64, -1);

    @OriginalMember(owner = "client!mr", name = "J", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!mr", name = "C", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!mr", name = "D", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!mr", name = "E", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!mr", name = "H", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!mr", name = "I", descriptor = "Lhw;")
    public static class205 field2563;

    @OriginalMember(owner = "client!mr", name = "K", descriptor = "[I")
    public static int[] field2565;

    static {
        new class306("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field2564 = 0;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(FB)V", line = 5)
    public final void method1109(float arg0, byte arg1) {
        if (arg1 != -118) {
            this.method1109(0.54800534F, (byte) 91);
        }
        super.field6713 = arg0;
        ++field2558;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IB)I", line = 16)
    public static final int method1110(int arg0, byte arg1) {
        ++field2559;
        int var2 = -9 / ((34 - arg1) / 34);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(IIIIIF)V", line = 27)
    public class160(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IBII)V", line = 36)
    public final void method1111(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 >= -94) {
            field2561 = null;
        }
        ++field2562;
        super.field6712 = arg0;
        super.field6703 = arg2;
        super.field6706 = arg3;
    }

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "(Z)V", line = 58)
    public static void method1112(boolean arg0) {
        field2563 = null;
        field2565 = null;
        if (arg0) {
            field2561 = null;
            field2560 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "(I)V", line = 72)
    public static final void method1113(int arg0) {
        ++field2557;
        int var1 = class510.field7403.method1187((byte) -117, class511.field7485);
        if (arg0 == var1) {
            class53.field858 = null;
            class230.method1590((byte) 71, 0);
        } else if (var1 == 1) {
            class204.method1343(0, (byte) 0);
            class230.method1590((byte) 71, 512);
            if (class192.field2982 != null) {
                class516.method3055(arg0);
            }
        } else {
            class204.method1343(arg0, (byte) (class536.field7878 - 4 & 255));
            class230.method1590((byte) 71, 2);
        }
        class127.field2189 = class93.field1556;
    }
}
