import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class179 {

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "Z")
    public boolean field2394;

    @OriginalMember(owner = "client!vda", name = "j", descriptor = "[I")
    public static int[] field2402 = new int[2048];

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "I")
    public static int field2399 = 1;

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "I")
    public static int field2397 = 0;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!vda", name = "f", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!vda", name = "k", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "Lgfa;")
    public class749 field2395;

    @OriginalMember(owner = "client!vda", name = "i", descriptor = "Lgfa;")
    public class749 field2401;

    @OriginalMember(owner = "client!vda", name = "h", descriptor = "Z")
    public boolean field2400;

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "[I")
    public static int[] field2396;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)V", line = 5)
    public static void method1131(byte arg0) {
        if (arg0 > -45) {
            field2397 = -127;
        }
        field2396 = null;
        field2402 = null;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V", line = 16)
    public final void method1132(int arg0) {
        int var2 = -25 % ((arg0 + 61) / 50);
        if (this.field2401 != null) {
            this.field2401.method1059(5342);
        }
        field2398++;
        this.field2400 = false;
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)Z", line = 30)
    public final boolean method1133(int arg0) {
        if (arg0 == 3816) {
            field2393++;
            return this.field2400 && !this.field2394;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IZBI)Ljava/lang/String;", line = 48)
    public static final String method1134(int arg0, boolean arg1, byte arg2, int arg3) {
        field2403++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (arg1 && arg0 >= 0) {
            int var4 = 2;
            int var5 = arg0 / arg3;
            if (arg2 != 41) {
                return null;
            }
            while (var5 != 0) {
                var5 /= arg3;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg0;
                arg0 /= arg3;
                int var9 = var8 - arg0 * arg3;
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Z)V", line = 102)
    public class179(boolean arg0) {
        this.field2394 = arg0;
    }
}
