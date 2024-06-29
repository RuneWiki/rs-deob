import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public abstract class class68 {

    @OriginalMember(owner = "client!er", name = "a", descriptor = "Lri;")
    public static class73 field1036 = new class73(44, 2);

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    public static int field1040 = 0;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "I")
    public static int field1039 = 0;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "I")
    public static int field1037 = -1;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "[[S")
    public static short[][] field1041;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(I)Z")
    public abstract boolean method18(int arg0);

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(B)V")
    public abstract void method13(byte arg0);

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IILqa;B)Z")
    public abstract boolean method8(int arg0, int arg1, class162 arg2, byte arg3);

    @OriginalMember(owner = "client!er", name = "e", descriptor = "(B)V")
    public static void method402(byte arg0) {
        field1041 = null;
        if (arg0 < 93) {
            field1038 = 94;
        }
        field1036 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BLqa;)V")
    public abstract void method10(byte arg0, class162 arg1);

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(ILqa;)Lnf;")
    public abstract class405 method12(int arg0, class162 arg1);

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ZIILer;Lqa;IB)V")
    public abstract void method19(boolean arg0, int arg1, int arg2, class68 arg3, class162 arg4, int arg5, byte arg6);
}
