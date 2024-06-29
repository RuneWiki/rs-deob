import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class254 {

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "[I")
    private int[] field3999;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field3995 = 0;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field3994 = 0;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3997 = null;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "[Lib;")
    public static class313[] field3989 = new class313[32768];

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "[Lqh;")
    public static class33[] field3992 = new class33[2048];

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "[Lkh;")
    public static class166[] field3998 = new class166[2048];

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field3990;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)I", line = 5)
    public final int method1749(int arg0, int arg1) {
        if (arg1 != 0) {
            return -80;
        }
        field3991++;
        int var3 = (this.field3999.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field3999[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3999[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V", line = 35)
    public static void method1750(byte arg0) {
        field3992 = null;
        field3990 = null;
        field3997 = null;
        field3989 = null;
        if (arg0 <= -9) {
            field3998 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 51)
    public static final void method1751(int arg0) {
        if (class141.field2180 != null) {
            class307 var1 = class141.field2180;
            synchronized (class141.field2180) {
                class141.field2180 = null;
            }
        }
        int var3 = -78 / ((-arg0 - 68) / 50);
        field3993++;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "([I)V", line = 92)
    public class254(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field3999 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3999[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field3999[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field3999[var5 + var5] = arg0[var4];
            this.field3999[var5 + var5 + 1] = var4++;
        }
    }
}
