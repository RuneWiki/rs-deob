import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class133 {

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Lof;")
    public static class446 field1788 = new class446("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Lgh;")
    public static class390 field1790 = new class390();

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method904(String arg0, int arg1) {
        field1789++;
        long var2 = 0L;
        int var4 = arg0.length();
        int var5 = 0;
        if (arg1 != 37) {
            return -120L;
        }
        while (var5 < var4) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
            var5++;
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static void method905(int arg0) {
        field1788 = null;
        field1790 = null;
        if (arg0 != 31931) {
            field1788 = null;
        }
    }
}
