import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class174 {

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "Lre;")
    public static class388 field2090 = new class388();

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Lpn;")
    public static class72 field2092 = new class72(18, 2);

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "[Lpe;")
    public static class424[] field2093 = new class424[4];

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field2094 = -1;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field2095 = 0;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "[I")
    public static int[] field2096;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(CI)Z")
    public static final boolean method857(char arg0, int arg1) {
        field2091++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class168.method822(arg0, 65)) {
            return true;
        } else {
            if (arg1 != 18) {
                method858((byte) -6);
            }
            char[] var2 = class440.field6297;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class478.field6765;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V")
    public static void method858(byte arg0) {
        field2092 = null;
        field2096 = null;
        field2093 = null;
        field2090 = null;
        if (arg0 > -28) {
            method857('\u007f', -28);
        }
    }
}
