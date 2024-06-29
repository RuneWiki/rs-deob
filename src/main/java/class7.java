import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class7 {

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field97 = 0;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "[I")
    public static int[] field96;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)Lch;")
    public static final class93 method40(int arg0) {
        if (arg0 != 0) {
            method43((byte) -60);
        }
        field100++;
        try {
            return (class93) Class.forName("bf").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)I")
    public static final int method41(boolean arg0, int arg1) {
        if (arg0) {
            field97 = -107;
        }
        field99++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static final void method42(int arg0) {
        field98++;
        for (int var1 = 0; var1 < 5; var1++) {
            class229.field3259[var1] = false;
        }
        class150.field2177 = arg0;
        class32.field381 = -1;
        class202.field2866 = -1;
        class4.field61 = 5;
        class212.field2972 = 0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public static void method43(byte arg0) {
        field96 = null;
        if (arg0 < 99) {
            field97 = -92;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class7() {
        new class167();
    }
}
