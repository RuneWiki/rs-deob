import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class115 {

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lac;")
    public static class153 field1674 = new class153(8);

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1678 = 0;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static final void method760(int arg0) {
        field1679++;
        class81.field1234 = 0;
        class140.field2016 = 0;
        class107.method716(32);
        class200.method1389((byte) 89);
        class284.method1948((byte) -113);
        if (arg0 != -30015) {
            field1674 = null;
        }
        class291.method1979((byte) -92);
        for (int var1 = 0; var1 < class81.field1234; var1++) {
            int var3 = class111.field1607[var1];
            if (class311.field4996 != class35.field409[var3].field3931) {
                if (class35.field409[var3].field11 > 0) {
                    class142.method928(class35.field409[var3], (byte) -128);
                }
                class35.field409[var3] = null;
            }
        }
        if (class262.field4252 != class175.field2763.field2676) {
            throw new RuntimeException("gpp1 pos:" + class175.field2763.field2676 + " psize:" + class262.field4252);
        }
        for (int var2 = 0; var2 < class272.field4432; var2++) {
            if (class35.field409[class52.field745[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class272.field4432);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Z")
    public static final boolean method761(int arg0, int arg1) {
        class262.field4256 = true;
        field1677++;
        class233.field3770 = arg1 + 1 & 0xFFFF;
        int var2 = 91 / ((arg0 + 41) / 37);
        return true;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static final void method762(byte arg0) {
        class284.field4603 = null;
        if (arg0 > -5) {
            method761(16, -112);
        }
        field1675++;
        class64.field924 = null;
        class229.field3539 = null;
        class190.field2959 = null;
        class277.field4480 = null;
        class166.field2569 = null;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    public static final void method763(int arg0) {
        class62.field904 = arg0;
        for (int var1 = 0; var1 < class231.field3748; var1++) {
            for (int var2 = 0; var2 < class175.field2759; var2++) {
                if (class184.field2892[arg0][var1][var2] == null) {
                    class184.field2892[arg0][var1][var2] = new class113(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
    public static void method764(int arg0) {
        field1674 = null;
        if (arg0 != -10774) {
            method760(-71);
        }
    }
}
