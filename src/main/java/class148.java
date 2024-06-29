import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class148 {

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "[[[B")
    public static byte[][][] field2722 = new byte[4][104][104];

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Lmb;")
    private static class132 field2723 = class166.method1092("Drop", 119);

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field2724 = 0;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "Lmb;")
    public static class132 field2727 = class166.method1092("sch-Utteln:", 115);

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "Lmb;")
    public static class132 field2726 = field2723;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Lmb;")
    public static class132 field2729 = class166.method1092("Die Adresse dieses Computers wurde gesperrt)1", 124);

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field2728 = 0;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "Z")
    public static boolean field2730 = false;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static final void method985(int arg0) {
        class220.field4003 = 0;
        class43.field770 = 0;
        class21.method143(false);
        class173.method1127((byte) 29);
        field2725++;
        class16.method83(-1);
        if (arg0 >= -126) {
            field2722 = null;
        }
        for (int var1 = 0; var1 < class43.field770; var1++) {
            int var3 = class122.field2291[var1];
            if (class30.field460 != class11.field145[var3].field669) {
                class11.field145[var3].field1072 = null;
                class11.field145[var3] = null;
            }
        }
        if (class39.field630 != class118.field2241.field2133) {
            throw new RuntimeException("gnp1 pos:" + class118.field2241.field2133 + " psize:" + class39.field630);
        }
        for (int var2 = 0; var2 < class131.field2423; var2++) {
            if (class11.field145[class226.field4098[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class131.field2423);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
    public static void method986(int arg0) {
        field2729 = null;
        field2726 = null;
        field2723 = null;
        field2727 = null;
        field2722 = null;
        if (arg0 != 24347) {
            field2730 = true;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)Lud;")
    public static final class218 method987(int arg0, byte arg1) {
        field2731++;
        class218 var2 = (class218) class27.field432.method777(-1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        class218 var3 = class219.method1367(class119.field2262, 0, false, arg0, class139.field2608);
        if (var3 != null) {
            class27.field432.method774((long) arg0, var3, 0);
        }
        int var4 = 4 % ((arg1 - 34) / 47);
        return var3;
    }
}
