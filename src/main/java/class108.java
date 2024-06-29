import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class108 {

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "[I")
    public static int[] field1925 = new int[2000];

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Lak;")
    public static class135 field1923 = new class135(4);

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field1926 = 0;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "Lpj;")
    public static class237 field1930 = class33.method353("Opened titlescreen)3", 87);

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "Lpj;")
    private static class237 field1929 = class33.method353("", 67);

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "Lpj;")
    public static class237 field1931 = field1929;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "Lfa;")
    public static class239 field1928;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
    public static void method803(byte arg0) {
        field1929 = null;
        field1930 = null;
        field1931 = null;
        field1925 = null;
        field1928 = null;
        field1923 = null;
        if (arg0 <= 35) {
            method804(-11, -26, 84);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)Lmc;")
    public static final class191 method804(int arg0, int arg1, int arg2) {
        class35 var3 = class274.field4775[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field759; var4++) {
            class191 var5 = var3.field755[var4];
            if ((var5.field3314 >> 29 & 0x3L) == 2L && var5.field3316 == arg1 && var5.field3315 == arg2) {
                class96.method717(var5);
                return var5;
            }
        }
        return null;
    }
}
