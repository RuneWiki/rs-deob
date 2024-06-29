import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class64 {

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "Lbv;")
    public static class567 field892 = new class567("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "I")
    public static int field893 = 0;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(BI)V", line = 3)
    public static final void method505(byte arg0, int arg1) {
        field891++;
        if (arg0 == -26) {
            class142.field2216.method2397(arg1, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V", line = 16)
    public static void method506(byte arg0) {
        if (arg0 == -115) {
            field892 = null;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIB)I", line = 32)
    public static final int method507(int arg0, int arg1, byte arg2) {
        field889++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg1 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg2 != 82) {
            method506((byte) 6);
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }
}
