import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class182 {

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Lbv;")
    public static class567 field2629 = new class567("Loading JAGDX - ", "Lade JAGDX - ", "Chargement JAGDX - ", "Carregando JAGDX - ");

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method1223(int arg0) {
        if (arg0 == 1) {
            field2629 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method1224(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg5 != -122) {
            method1226((byte) -107, -21, -26);
        }
        class466.field6719 = arg4;
        field2631++;
        class349.field4999 = arg0;
        class183.field2644 = arg6;
        class64.field894 = arg2;
        class81.field1445 = arg1;
        class262.field3830 = arg3;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLjava/lang/String;I)I")
    public static final int method1225(byte arg0, String arg1, int arg2) {
        field2627++;
        int var3 = -102 % ((arg0 - 19) / 56);
        return class362.method2188(arg1, 56, true, arg2);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BII)I")
    public static final int method1226(byte arg0, int arg1, int arg2) {
        field2628++;
        if (arg0 >= -6) {
            field2629 = null;
        }
        int var3 = class144.method1059(true, arg2 - 1, arg1 + -1) + class144.method1059(true, arg2 + 1, arg1 + -1) - (-class144.method1059(true, arg2 + -1, arg1 + 1) - class144.method1059(true, arg2 + 1, arg1 + 1));
        int var4 = class144.method1059(true, arg2 - 1, arg1) + class144.method1059(true, arg2 + 1, arg1) + class144.method1059(true, arg2, arg1 + -1) + class144.method1059(true, arg2, arg1 + 1);
        int var5 = class144.method1059(true, arg2, arg1);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V")
    public static final void method1227(int arg0, int arg1) {
        field2626++;
        if (arg0 > -93) {
            field2629 = null;
        }
        class293.field4226 = arg1;
        class258.field3753.method2406(-117);
    }
}
