import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class50 extends class137 {

    @OriginalMember(owner = "client!a", name = "p", descriptor = "Lad;")
    public static class275 field727 = new class275(30);

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public static volatile int field730 = 0;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field731 = new CRC32();

    @OriginalMember(owner = "client!a", name = "k", descriptor = "B")
    public byte field722;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public int field724;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "Ljava/lang/String;")
    public String field728;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Ljava/lang/String;")
    public String field733;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "[Lrk;")
    public static class292[] field732;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)I")
    public static final int method320(int arg0) {
        field723++;
        int var1 = 19 / ((5 - arg0) / 41);
        return 14;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
    public static final void method321(boolean arg0) {
        for (int var1 = 0; var1 < class266.field4324; var1++) {
            class171 var2 = class173.method1234(28008, var1);
            if (var2 != null && var2.field2797 == 0) {
                class310.field5022[var1] = 0;
                class68.field1090[var1] = 0;
            }
        }
        if (arg0) {
            field732 = null;
        }
        class265.field4318 = new class58(16);
        field725++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
    public static final void method322(int arg0, int arg1) {
        if (class225.field3536 == null || class225.field3536.length < arg0) {
            class225.field3536 = new int[arg0];
        }
        field726++;
        if (arg1 > -45) {
            method321(true);
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V")
    public static final void method323(byte arg0) {
        class242.field3836.method1873(-7401);
        class297.field4852.method1873(-7401);
        class104.field1633.method1873(-7401);
        if (arg0 <= -106) {
            field729++;
            class302.field4941.method1873(-7401);
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
    public static void method324(int arg0) {
        if (arg0 == 0) {
            field732 = null;
            field731 = null;
            field727 = null;
        }
    }
}
