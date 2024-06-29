import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 {

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "[I")
    private int[] field9;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "[I")
    public static int[] field11 = new int[1];

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "Lig;")
    public static class206 field13 = new class206(88, -2);

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "F")
    public static float field15;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "Lwh;")
    public static class129 field14;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
    public static void method6(int arg0) {
        int var1 = -5 % ((63 - arg0) / 42);
        field11 = null;
        field14 = null;
        field13 = null;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)Z")
    public static final boolean method7(int arg0, int arg1, int arg2) {
        field12++;
        if (arg1 != -28843) {
            method7(-26, -19, 1);
        }
        return class299.method1993(arg0, (byte) 93, arg2) | (arg0 & 0x70000) != 0 || class430.method2681(arg0, arg2, 98);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZ)I")
    public final int method8(int arg0, boolean arg1) {
        if (arg1) {
            field11 = null;
        }
        field10++;
        int var3 = (this.field9.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field9[var4 - (-var4 - 1)];
            if (var5 == -1) {
                return -1;
            }
            if (this.field9[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "([I)V")
    public class2(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field9 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field9[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field9[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field9[var5 + var5] = arg0[var4];
            this.field9[var5 + var5 + 1] = var4++;
        }
    }
}
