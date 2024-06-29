import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class633 {

    @OriginalMember(owner = "client!re", name = "c", descriptor = "Lla;")
    public class409 field8762 = null;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Laga;")
    public class658 field8761 = null;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field8760;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field8763;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIB)Z", line = 3)
    public static final boolean method3509(int arg0, int arg1, byte arg2) {
        if (arg2 != -17) {
            method3509(-108, -101, (byte) -48);
        }
        field8760++;
        return (arg1 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjava/lang/String;)J", line = 18)
    public static final long method3510(int arg0, String arg1) {
        int var2 = 13 % ((27 - arg0) / 39);
        field8763++;
        long var3 = 0L;
        int var5 = arg1.length();
        for (int var6 = 0; var6 < var5; var6++) {
            var3 *= 37L;
            char var7 = arg1.charAt(var6);
            if (var7 >= 'A' && var7 <= 'Z') {
                var3 += (1 - (65 - var7));
            } else if (var7 >= 'a' && var7 <= 'z') {
                var3 += (var7 + 1 - 97);
            } else if (var7 >= '0' && var7 <= '9') {
                var3 += (var7 + 27 - 48);
            }
            if (var3 >= 177917621779460413L) {
                break;
            }
        }
        while (var3 % 37L == 0L && var3 != 0L) {
            var3 /= 37L;
        }
        return var3;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lla;)V", line = 70)
    public class633(class409 arg0) {
        this.field8762 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lla;Laga;)V", line = 77)
    public class633(class409 arg0, class658 arg1) {
        this.field8762 = arg0;
        this.field8761 = arg1;
    }
}
