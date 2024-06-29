import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class163 {

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "[I")
    private int[] field3030;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Lb;")
    public static class48 field3029 = new class48();

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Lsg;")
    private static class30 field3032 = class167.method1221((byte) 33, "Use");

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "Lsg;")
    public static class30 field3031 = field3032;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "Lsg;")
    public static class30 field3035 = class167.method1221((byte) 33, "lila:");

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "Llk;")
    public static class232 field3033 = new class232(5);

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Lsg;")
    public static class30 field3037 = class167.method1221((byte) 33, "");

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public static int field3041 = 0;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "Lsg;")
    public static class30 field3040 = class167.method1221((byte) 33, "::replacecanvas");

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "[Lna;")
    public static class22[] field3038;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)I")
    public final int method1210(boolean arg0, int arg1) {
        if (!arg0) {
            return 89;
        }
        field3036++;
        int var3 = (this.field3030.length >> 1) - 1;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field3030[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3030[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "([I)V")
    public class163(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field3030 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field3030[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3030[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field3030[var5 + var5] = arg0[var4];
            this.field3030[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static void method1211(int arg0) {
        field3033 = null;
        field3035 = null;
        field3031 = null;
        field3037 = null;
        field3040 = null;
        field3029 = null;
        field3038 = null;
        if (arg0 == 0) {
            field3032 = null;
        }
    }
}
