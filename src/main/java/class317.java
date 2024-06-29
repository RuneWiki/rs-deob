import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class317 extends class338 {

    @OriginalMember(owner = "client!un", name = "t", descriptor = "I")
    public int field4231;

    @OriginalMember(owner = "client!un", name = "p", descriptor = "I")
    public int field4227;

    @OriginalMember(owner = "client!un", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4229 = "M";

    @OriginalMember(owner = "client!un", name = "s", descriptor = "[I")
    public static int[] field4230 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!un", name = "m", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!un", name = "q", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "[I")
    public static int[] field4226;

    @OriginalMember(owner = "client!un", name = "n", descriptor = "[Z")
    public static boolean[] field4225;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILjava/lang/String;)J", line = 3)
    public static final long method1829(int arg0, String arg1) {
        field4224++;
        long var2 = 0L;
        int var4 = -18 / ((arg0 - 77) / 42);
        int var5 = arg1.length();
        for (int var6 = 0; var6 < var5; var6++) {
            var2 *= 37L;
            char var7 = arg1.charAt(var6);
            if (var7 >= 'A' && var7 <= 'Z') {
                var2 += (long) (var7 + 1 - 65);
            } else if (var7 >= 'a' && var7 <= 'z') {
                var2 += (long) (var7 + 1 - 97);
            } else if (var7 >= '0' && var7 <= '9') {
                var2 += (long) (var7 - 21);
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

    @OriginalMember(owner = "client!un", name = "d", descriptor = "(I)V", line = 54)
    public static final void method1830(int arg0) {
        field4228++;
        class114 var1 = client.field3456;
        synchronized (client.field3456) {
            client.field3456.method606((byte) 88);
            if (arg0 != 3391) {
                field4226 = null;
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)V", line = 68)
    public static void method1831(boolean arg0) {
        field4229 = null;
        if (arg0) {
            field4226 = null;
            field4225 = null;
            field4230 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(II)V", line = 87)
    public class317(int arg0, int arg1) {
        this.field4231 = arg1;
        this.field4227 = arg0;
    }
}
