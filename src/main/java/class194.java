import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class194 {

    @OriginalMember(owner = "client!se", name = "d", descriptor = "[I")
    private int[] field3392;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field3389 = -1;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "Lsc;")
    public static class181 field3396 = class149.method967(255, "sl_arrows");

    @OriginalMember(owner = "client!se", name = "c", descriptor = "Ljd;")
    public static class265 field3391 = new class265(5);

    @OriginalMember(owner = "client!se", name = "i", descriptor = "Z")
    public static boolean field3397 = true;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Lvb;")
    public static class247 field3398 = new class247();

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field3399 = 0;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Lej;")
    public static class142 field3393;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)I")
    public final int method1327(int arg0, int arg1) {
        field3390++;
        int var3 = -112 / ((33 - arg0) / 44);
        int var4 = (this.field3392.length >> 1) - 1;
        int var5 = var4 & arg1;
        while (true) {
            int var6 = this.field3392[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field3392[var5 + var5] == arg1) {
                return var6;
            }
            var5 = var4 & var5 + 1;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static void method1328(int arg0) {
        field3396 = null;
        field3391 = null;
        if (arg0 == 0) {
            field3393 = null;
            field3398 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "([I)V")
    public class194(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field3392 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field3392[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field3392[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field3392[var5 + var5] = arg0[var4];
            this.field3392[var5 + var5 + 1] = var4++;
        }
    }
}
