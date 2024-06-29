import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public abstract class class115 {

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1613 = "glow1:";

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field1616 = 0;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "[I")
    public static int[] field1617 = new int[4096];

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)Llr;")
    public abstract class105 method926(int arg0);

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
    public static void method927(int arg0) {
        if (arg0 == 30209) {
            field1617 = null;
            field1613 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZ)[B")
    public abstract byte[] method928(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V")
    public static final void method929(int arg0) {
        class356.field4841 = null;
        class269.field3628 = null;
        if (arg0 != 19131) {
            method929(118);
        }
        class95.field1381 = null;
        class262.field3517 = null;
        class360.field4893 = null;
        class118.field1645 = null;
        class215.field2984 = null;
        class90.field1336 = null;
        field1612++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I")
    public abstract int method930(int arg0, int arg1);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)V")
    public abstract void method931(int arg0, byte arg1);

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1617[var0] = class83.method751(false, var0);
        }
    }
}
