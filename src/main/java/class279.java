import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class279 {

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "J")
    public long field4353;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "Ltt;")
    private class249 field4352;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "Ljp;")
    public static class55 field4350 = new class55(89, -1);

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "[I")
    public static int[] field4354 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!ds", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field4352.method1750(this.field4353, 0);
        field4351++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
    public static void method1890(byte arg0) {
        field4354 = null;
        if (arg0 != 3) {
            field4354 = null;
        }
        field4350 = null;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method1891(int arg0, String arg1) {
        field4349++;
        long var2 = 0L;
        int var4 = -73 % ((arg0 - 55) / 55);
        int var5 = arg1.length();
        for (int var6 = 0; var6 < var5; var6++) {
            var2 *= 37L;
            char var7 = arg1.charAt(var6);
            if (var7 >= 'A' && var7 <= 'Z') {
                var2 += (var7 + 1 - 65);
            } else if (var7 >= 'a' && var7 <= 'z') {
                var2 += (var7 - 96);
            } else if (var7 >= '0' && var7 <= '9') {
                var2 += (var7 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Ltt;JI)V")
    public class279(class249 arg0, long arg1, int arg2) {
        this.field4353 = arg1;
        this.field4352 = arg0;
    }
}
