import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class137 extends class3 {

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "Lok;")
    private static class41 field2046 = method956("Take", 45);

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
    public static int field2041 = 1;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "Lok;")
    public static class41 field2051 = method956("Untersuchen", 45);

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "Lok;")
    public static class41 field2050 = field2046;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "[Lok;")
    public static class41[] field2045 = new class41[1000];

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
    public int field2042;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "I")
    public int field2044;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    public int field2052;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
    public int field2054;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "Lok;")
    public class41 field2056;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "[I")
    public int[] field2043;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "[I")
    public int[] field2047;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "[Lok;")
    public class41[] field2049;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "[Lfl;")
    public class86[] field2055;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V", line = 9)
    public static void method955(int arg0) {
        field2050 = null;
        field2046 = null;
        field2051 = null;
        if (arg0 != 1) {
            field2051 = (class41) null;
        }
        field2045 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;I)Lok;", line = 25)
    public static final class41 method956(String arg0, int arg1) {
        field2048++;
        byte[] var2 = arg0.getBytes();
        int var3 = 0;
        int var4 = var2.length;
        class41 var5 = new class41();
        var5.field660 = new byte[var4];
        if (arg1 != 45) {
            method955(-87);
        }
        while (var3 < var4) {
            int var6 = var2[var3++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 >= var4) {
                    break;
                }
                int var7 = var2[var3++] & 0xFF;
                var5.field660[var5.field617++] = (byte) (var6 * 43 + var7 - 1720 - 48);
            } else if (var6 != 0) {
                var5.field660[var5.field617++] = (byte) var6;
            }
        }
        var5.method271((byte) -102);
        return var5.method298(arg1 ^ 0xFFFFD331);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V", line = 99)
    public static final void method957(int arg0, int arg1) {
        class245.field3909 = -1;
        if (arg0 == 15398) {
            class296.field4788 = -1;
            class45.field707 = arg1;
            field2053++;
            class317.method2188(arg0 - 15399);
        }
    }
}
