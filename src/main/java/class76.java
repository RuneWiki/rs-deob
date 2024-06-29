import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public abstract class class76 {

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1174 = "";

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)Lsb;")
    public abstract class239 method595(int arg0);

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public static void method596(byte arg0) {
        if (arg0 == 63) {
            field1174 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)I")
    public abstract int method597(int arg0, int arg1);

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)V")
    public static final void method598(byte arg0) {
        class229.field3640.method1172((byte) 120);
        field1171++;
        int var1 = -43 / ((arg0 - 55) / 44);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZI)V")
    public abstract void method599(boolean arg0, int arg1);

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(ZI)[B")
    public abstract byte[] method600(boolean arg0, int arg1);

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(II)I")
    public static final int method601(int arg0, int arg1) {
        if (arg0 > -46) {
            field1174 = null;
        }
        field1172++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIB)V")
    public static final void method602(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != -41) {
            method601(73, 96);
        }
        if (arg0 > arg2) {
            class173.method1240((byte) -90, arg0, class55.field872[arg1], arg3, arg2);
        } else {
            class173.method1240((byte) -68, arg2, class55.field872[arg1], arg3, arg0);
        }
        field1175++;
    }
}
