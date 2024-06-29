import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class249 {

    @OriginalMember(owner = "client!g", name = "b", descriptor = "[I")
    private int[] field4227;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lsk;")
    public static class199 field4226 = new class199(64);

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Z")
    public static boolean field4231 = false;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field4232 = -1;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)I", line = 6)
    public final int method1731(int arg0, int arg1) {
        int var3 = (this.field4227.length >> 1) - 1;
        if (arg0 >= -37) {
            return -39;
        }
        field4228++;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field4227[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4227[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIII)I", line = 40)
    public static final int method1732(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4230++;
        if (arg1 != 134070497) {
            field4232 = -66;
        }
        int var5 = 65536 - class23.field254[arg4 * 1024 / arg2] >> 1;
        return ((65536 - var5) * arg3 >> 16) + (arg0 * var5 >> 16);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)Lqd;", line = 55)
    public static final class170 method1733(int arg0, int arg1) {
        field4229++;
        class170 var2 = (class170) class69.field1058.method1396(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 < 22) {
            field4231 = true;
        }
        class170 var3 = class135.method1025(arg1, false, true, class8.field89, class246.field4190);
        if (var3 != null) {
            class69.field1058.method1397((long) arg1, var3, true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 77)
    public static void method1734(int arg0) {
        int var1 = 69 / ((arg0 + 32) / 51);
        field4226 = null;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "([I)V", line = 83)
    public class249(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field4227 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field4227[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field4227[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field4227[var5 + var5] = arg0[var4];
            this.field4227[var5 - (-var5 - 1)] = var4++;
        }
    }
}
