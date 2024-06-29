import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class39 {

    @OriginalMember(owner = "client!e", name = "k", descriptor = "[I")
    private int[] field934;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "[I")
    public static int[] field928 = new int[5];

    @OriginalMember(owner = "client!e", name = "d", descriptor = "Z")
    public static boolean field927 = false;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Lgg;")
    private static class63 field929 = class116.method911(43, "Please enter your username)3");

    @OriginalMember(owner = "client!e", name = "i", descriptor = "Lgg;")
    public static class63 field932 = field929;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "[Lwb;")
    public static class200[] field930;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([BI)[B")
    public static final byte[] method361(byte[] arg0, int arg1) {
        if (arg1 < 59) {
            return null;
        }
        field925++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class102.method847(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)I")
    public final int method362(int arg0, int arg1) {
        int var3 = 91 % ((-arg0 - 42) / 62);
        int var4 = (this.field934.length >> 1) - 1;
        field931++;
        int var5 = arg1 & var4;
        while (true) {
            int var6 = this.field934[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field934[var5 + var5] == arg1) {
                return var6;
            }
            var5 = var5 + 1 & var4;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public static void method363(byte arg0) {
        field930 = null;
        field932 = null;
        int var1 = -25 / ((arg0 - 79) / 45);
        field928 = null;
        field929 = null;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "([I)V")
    public class39(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field934 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field934[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field934[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field934[var5 + var5] = arg0[var4];
            this.field934[var5 + var5 + 1] = var4++;
        }
    }
}
