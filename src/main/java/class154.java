import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class154 {

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "[I")
    private int[] field2853;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Lvf;")
    public static class265 field2852 = class87.method582(-46, "blinken1:");

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Lvf;")
    public static class265 field2850 = class87.method582(-46, "Poser");

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "[I")
    public static int[] field2854 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Lvf;")
    public static class265 field2858 = class87.method582(-46, "http:)4)4");

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)I")
    public final int method1049(byte arg0, int arg1) {
        field2857++;
        int var3 = -46 % ((arg0 - 10) / 35);
        int var4 = (this.field2853.length >> 1) - 1;
        int var5 = arg1 & var4;
        while (true) {
            int var6 = this.field2853[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field2853[var5 + var5] == arg1) {
                return var6;
            }
            var5 = var4 & var5 + 1;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1050(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2851++;
        int var9 = arg2 - arg1;
        int var10 = arg0 - arg5;
        int var11 = (arg8 - arg4 << 16) / var10;
        if (arg6 >= 69) {
            int var12 = (arg7 - arg3 << 16) / var9;
            class273.method1872(arg5, var11, arg3, arg0, 0, arg2, arg4, var12, 17548, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([I)V")
    public class154(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field2853 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field2853[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field2853[var5 - (-var5 - 1)] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field2853[var5 + var5] = arg0[var4];
            this.field2853[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method1051(int arg0) {
        field2858 = null;
        if (arg0 != 1) {
            method1051(-30);
        }
        field2854 = null;
        field2852 = null;
        field2850 = null;
    }
}
