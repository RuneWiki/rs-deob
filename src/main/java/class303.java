import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class303 {

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "[I")
    private int[] field5118;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field5117 = 0;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "Ltf;")
    public static class242 field5120 = new class242(50);

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "Lbe;")
    public static class283 field5121 = class153.method941(-97, "logo");

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Lbe;")
    public static class283 field5123 = class153.method941(-60, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "Lbe;")
    public static class283 field5122 = class153.method941(126, ")3");

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field5124 = 0;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "Lkc;")
    public static class33 field5116;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 5)
    public static void method2049(int arg0) {
        field5120 = null;
        field5123 = null;
        if (arg0 != -213277759) {
            field5124 = 67;
        }
        field5121 = null;
        field5116 = null;
        field5122 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)I", line = 20)
    public final int method2050(int arg0, int arg1) {
        field5119++;
        int var3 = (this.field5118.length >> 1) - 1;
        if (arg0 != 0) {
            return -28;
        }
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field5118[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field5118[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "([I)V", line = 82)
    public class303(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field5118 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field5118[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field5118[var5 - (-var5 - 1)] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field5118[var5 + var5] = arg0[var4];
            this.field5118[var5 + var5 + 1] = var4++;
        }
    }
}
