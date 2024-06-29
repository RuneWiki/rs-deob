import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public abstract class class10 {

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "Lsc;")
    public static class250 field153;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "[[Z")
    public static boolean[][] field155;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 8)
    public static void method107(int arg0) {
        field155 = null;
        if (arg0 >= -71) {
            field155 = null;
        }
        field153 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)V")
    public abstract void method106(byte arg0, int arg1);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)[B")
    public abstract byte[] method108(int arg0, byte arg1);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)I")
    public abstract int method109(int arg0, int arg1);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)Lms;")
    public abstract class76 method110(byte arg0);
}
