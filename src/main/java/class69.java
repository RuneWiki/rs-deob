import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class69 extends class171 {

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "[I")
    public int[] field941 = new int[] { -1 };

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "[I")
    public int[] field942 = new int[1];

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "F")
    public static float field935 = 0.0F;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "Llc;")
    public static class86 field936 = new class86(200);

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "Lhc;")
    public static class235 field938;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "[I")
    public static int[] field940;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)J")
    public static final long method431(int arg0, int arg1, int arg2) {
        class89 var3 = class194.field2682[arg0][arg1][arg2];
        return var3 == null || var3.field1237 == null ? 0L : var3.field1237.field322;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method432(String arg0, int arg1) {
        field937++;
        if (arg1 < 10) {
            field938 = null;
        }
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
    public static void method433(byte arg0) {
        field940 = null;
        field938 = null;
        field936 = null;
        int var1 = 28 / ((-arg0 - 31) / 55);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IC)C")
    public static final char method434(int arg0, char arg1) {
        if (arg0 != 69) {
            field938 = null;
        }
        field939++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }
}
