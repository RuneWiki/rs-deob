import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class44 {

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lbf;")
    public final class290 field894;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public final int field898;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Llc;")
    public static class143 field893 = class66.method374("Cache:", -1);

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Z")
    public static boolean field896 = true;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Llc;")
    public static class143 field895 = class66.method374("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", -1);

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "B")
    public static byte field897;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "[Z")
    public static boolean[] field900;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static void method275(byte arg0) {
        field893 = null;
        field900 = null;
        field895 = null;
        if (arg0 != 65) {
            field897 = -100;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static final void method276(int arg0) {
        class257.field4625 = 0;
        class177.field3170 = 0;
        class126.field2239 = 0;
        class70.field1341 = -1;
        class42.field708 = 0;
        class139.field2415 = false;
        class53.field1038 = -1;
        class285.field5010.field3487 = 0;
        class95.field1754 = -1;
        if (arg0 != 18990) {
            field893 = null;
        }
        class88.field1605 = 0;
        class161.field2902.field3487 = 0;
        class167.field2988 = -1;
        class155.field2794 = 0;
        for (int var1 = 0; var1 < class6.field97.length; var1++) {
            if (class6.field97[var1] != null) {
                class6.field97[var1].field4182 = -1;
            }
        }
        field899++;
        for (int var2 = 0; var2 < class259.field4648.length; var2++) {
            if (class259.field4648[var2] != null) {
                class259.field4648[var2].field4182 = -1;
            }
        }
        class210.method1469(124);
        class21.field349 = 1;
        class43.method271(30, -96);
        for (int var3 = 0; var3 < 100; var3++) {
            class69.field1323[var3] = true;
        }
        class239.method1601(false);
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(II)V")
    public class44(int arg0, int arg1) {
        this.field894 = class255.method1687(arg0, (byte) -77);
        this.field898 = arg1;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lbf;I)V")
    public class44(class290 arg0, int arg1) {
        this.field898 = arg1;
        this.field894 = arg0;
    }
}
