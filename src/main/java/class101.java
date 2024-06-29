import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class101 extends class151 {

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "[I")
    public int[] field1847 = new int[] { -1 };

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "[I")
    public int[] field1849 = new int[] { 0 };

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "Lbd;")
    public static class162 field1846 = class17.method142(0, "Hidden)2use");

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "Lbd;")
    public static class162 field1851 = class17.method142(0, "(U (X");

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "[[B")
    public static byte[][] field1848;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 17)
    public static void method835(int arg0) {
        if (arg0 == 0) {
            field1848 = (byte[][]) null;
            field1851 = null;
            field1846 = null;
        }
    }
}
