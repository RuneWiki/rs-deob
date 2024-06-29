import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class7 {

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "J")
    public long field73 = 0L;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "Lqj;")
    private static class196 field58 = class80.method502("Loaded wordpack", -48);

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "Lqj;")
    public static class196 field72 = field58;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "Lqj;")
    public static class196 field57 = class80.method502("<col=ff9040>", -48);

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "Lqj;")
    public static class196 field64 = class80.method502("Texturen geladen)3", -48);

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public int field62;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public int field65;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public int field66;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public int field67;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public int field68;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public int field69;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public int field74;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "Lpe;")
    public class258 field59;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "Lpe;")
    public class258 field63;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    public static final void method26(byte arg0) {
        field61++;
        class96.field1413 = 0;
        class148.field2336 = 0;
        class246.method1679((byte) 112);
        class57.method370((byte) 81);
        if (arg0 != 36) {
            return;
        }
        class72.method460(41);
        class231.method1548(false);
        for (int var1 = 0; var1 < class96.field1413; var1++) {
            int var3 = class232.field4128[var1];
            if (class171.field2879 != class247.field4397[var3].field2055) {
                if (class247.field4397[var3].field1910 > 0) {
                    class73.method468(arg0 + 4060, class247.field4397[var3]);
                }
                class247.field4397[var3] = null;
            }
        }
        if (class76.field1096 != class229.field4077.field699) {
            throw new RuntimeException("gpp1 pos:" + class229.field4077.field699 + " psize:" + class76.field1096);
        }
        for (int var2 = 0; var2 < class252.field4451; var2++) {
            if (class247.field4397[class14.field153[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class252.field4451);
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static final void method27(int arg0) {
        class182.field3209.method1529(382);
        field70++;
        if (arg0 != 0) {
            field57 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)Z")
    public static final boolean method28(byte arg0, int arg1) {
        field71++;
        if (arg0 <= 10) {
            return true;
        } else if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)V")
    public static void method29(byte arg0) {
        field57 = null;
        field72 = null;
        field64 = null;
        field58 = null;
        if (arg0 >= -67) {
            field57 = null;
        }
    }
}
