import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class133 {

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "[I")
    private int[] field2123;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field2124 = -1;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Laf;")
    public static class68 field2122 = new class68(50);

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field2129 = 0;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "F")
    public static float field2126;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Lqh;")
    public static class201 field2121;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Z")
    public static boolean field2127;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Z")
    public static boolean field2128;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method936(int arg0, String arg1) {
        field2120++;
        if (arg1 == null) {
            return false;
        } else if (arg0 == 2513) {
            for (int var2 = 0; var2 < class239.field3875; var2++) {
                if (arg1.equalsIgnoreCase(class86.field1379[var2])) {
                    return true;
                }
            }
            return arg1.equalsIgnoreCase(class167.field2655.field525);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)I")
    public final int method937(int arg0, int arg1) {
        field2125++;
        int var3 = -120 / ((-arg0 - 48) / 50);
        int var4 = (this.field2123.length >> 1) - 1;
        int var5 = var4 & arg1;
        while (true) {
            int var6 = this.field2123[var5 - (-var5 - 1)];
            if (var6 == -1) {
                return -1;
            }
            if (this.field2123[var5 + var5] == arg1) {
                return var6;
            }
            var5 = var4 & var5 + 1;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static void method938(int arg0) {
        field2121 = null;
        if (arg0 != -29390) {
            method938(72);
        }
        field2122 = null;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "([I)V")
    public class133(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field2123 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2123[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2123[var5 - (-var5 - 1)] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field2123[var5 + var5] = arg0[var4];
            this.field2123[var5 + var5 + 1] = var4++;
        }
    }
}
