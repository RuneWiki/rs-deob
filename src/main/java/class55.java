import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class55 {

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "Ljava/lang/String;")
    public static String field714 = "wave2:";

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "Z")
    public static boolean field711;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "Z")
    public static boolean field715;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "[[[B")
    public static byte[][][] field710;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)Lve;", line = 20)
    public static final class231 method420(int arg0, int arg1, int arg2) {
        class119 var3 = class345.field5367[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class231 var4 = var3.field1552;
            var3.field1552 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)V", line = 33)
    public static final void method421(int arg0, int arg1) {
        field713++;
        class41.method301(class41.field514, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        if (arg1 <= -32) {
            class41.method294(-50.0F, -60.0F, -50.0F);
            class41.method300(class41.field516, 0, false);
            class41.method296();
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V", line = 47)
    public static void method422(int arg0) {
        if (arg0 != -3237) {
            method421(63, 109);
        }
        field710 = (byte[][][]) null;
        field714 = null;
    }
}
