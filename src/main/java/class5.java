import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!c")
public class class5 {

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "[[B")
    private static byte[][] field29 = new byte[50][];

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "I")
    private static int field31 = 0;

    @OriginalMember(owner = "mapview!c", name = "d", descriptor = "Loa;")
    public static class27 field32 = null;

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "Lw;")
    private static class38 field30 = class35.method219("Bank", true);

    @OriginalMember(owner = "mapview!c", name = "e", descriptor = "I")
    public static int field33 = 0;

    @OriginalMember(owner = "mapview!c", name = "h", descriptor = "Lw;")
    private static class38 field36 = class35.method219("Anvil", true);

    @OriginalMember(owner = "mapview!c", name = "f", descriptor = "Lu;")
    public static class36 field34;

    @OriginalMember(owner = "mapview!c", name = "g", descriptor = "Z")
    public static boolean field35;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;", line = 4)
    public static final Object method18(boolean arg0, byte[] arg1, int arg2) {
        if (arg2 <= 43) {
            field32 = null;
        }
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class33.field422) {
            try {
                class32 var3 = (class32) Class.forName("f").getDeclaredConstructor().newInstance();
                var3.method196((byte) 124, arg1);
                return var3;
            } catch (Throwable var5) {
                class33.field422 = true;
            }
        }
        return arg0 ? class16.method87(arg1, false) : arg1;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(I[Lw;)V", line = 37)
    public static final void method19(int arg0, class38[] arg1) {
        if (arg0 == 100) {
            class34.method206(0, arg1, arg1.length, (byte) 123);
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(I)V", line = 53)
    public static void method20(int arg0) {
        field29 = null;
        field36 = null;
        if (arg0 != -5001) {
            field35 = false;
        }
        field34 = null;
        field30 = null;
    }

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "(I)[Lw;", line = 88)
    public static final class38[] method21(int arg0) {
        if (arg0 != 0) {
            field35 = true;
        }
        class38[] var10000 = new class38[] { class10.field82, class9.field75, class36.field487, class6.field46, class12.field104, field30, class16.field140, class1.field1, class25.field355, class26.field364, field36, class25.field353, class1.field5, class34.field440, class38.field510, class11.field93, class36.field489, class1.field7, class38.field501, class1.field9, class8.field59, class26.field373, class19.field189, class27.field381, class32.field415, class19.field193, class12.field101, class34.field468, class32.field413, class19.field196, class24.field345, class6.field42, class9.field73, class26.field358, class33.field423, class37.field496, class24.field335, class6.field43, class38.field508, class33.field419, class9.field71, class11.field92, class8.field55, class8.field57, class27.field380, class13.field129, class4.field23, class26.field368, class6.field48, class16.field141, class3.field15, class19.field192, class19.field204, class24.field342, class27.field376, class38.field504, mapview.field279, class25.field349, class16.field143, class26.field371, class8.field61, class13.field124, class8.field60, class13.field109, class8.field60, class9.field74, class8.field60, class12.field99, class13.field130, class8.field60, class1.field8, class34.field452, class8.field60, class34.field467, class8.field60, class8.field60 };
        if (class27.field384) {
        }
        return var10000;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(BI)[B", line = 116)
    public static final synchronized byte[] method22(byte arg0, int arg1) {
        if (arg0 != 23) {
            method20(116);
        }
        if (arg1 == 100 && field31 > 0) {
            byte[] var2 = class9.field72[--field31];
            class9.field72[field31] = null;
            return var2;
        } else if (arg1 == 5000 && class26.field369 > 0) {
            byte[] var3 = class6.field49[--class26.field369];
            class6.field49[class26.field369] = null;
            return var3;
        } else if (arg1 == 30000 && class23.field244 > 0) {
            byte[] var4 = field29[--class23.field244];
            field29[class23.field244] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}
