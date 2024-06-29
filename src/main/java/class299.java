import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class299 {

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "[I")
    private int[] field5147;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "Z")
    public static boolean field5146 = false;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "Lna;")
    public static class26 field5152 = class69.method505("Titelbild geladen)3", (byte) -128);

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "Lve;")
    public static class266 field5151;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "Len;")
    public static class41 field5144;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)I", line = 4)
    public final int method2107(int arg0, int arg1) {
        if (arg1 != 1) {
            return -68;
        }
        field5150++;
        int var3 = (this.field5147.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field5147[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field5147[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)[Lek;", line = 33)
    public static final class183[] method2108(int arg0) {
        class183[] var1 = new class183[class313.field5350];
        field5145++;
        for (int var2 = arg0; var2 < class313.field5350; var2++) {
            var1[var2] = new class183(class88.field1445, class37.field607, class58.field936[var2], class82.field1281[var2], class141.field2149[var2], class98.field1596[var2], class205.field3203[var2], class190.field2975);
        }
        class160.method1088((byte) 116);
        return var1;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBIII)V", line = 72)
    public static final void method2109(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        int var6 = 58 / ((56 - arg1) / 49);
        while (class66.field1041 > var5) {
            if (arg0 < class53.field827[var5] + class27.field457[var5] && arg0 + arg4 > class53.field827[var5] && (class159.field2475[var5] + class241.field3931[var5]) > arg2 && class159.field2475[var5] < (arg2 + arg3)) {
                class139.field2123[var5] = true;
            }
            var5++;
        }
        field5149++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V", line = 98)
    public static void method2110(byte arg0) {
        field5151 = null;
        field5144 = null;
        field5152 = null;
        int var1 = -9 / ((arg0 - 64) / 53);
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "([I)V", line = 118)
    public class299(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field5147 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field5147[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field5147[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field5147[var5 + var5] = arg0[var4];
            this.field5147[var5 + var5 + 1] = var4++;
        }
    }
}
