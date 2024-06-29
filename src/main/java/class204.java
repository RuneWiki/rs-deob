import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class204 extends class69 {

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "[I")
    public int[] field3274 = new int[1];

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "[I")
    public int[] field3276 = new int[] { -1 };

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field3273 = 0;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public static int field3275 = 0;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field3270 = 0;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)I")
    public static int method1369(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIILjj;)Lwe;")
    public static final class43 method1370(int arg0, int arg1, int arg2, class134 arg3) {
        field3272++;
        if (class227.method1499((byte) -2, arg3, arg2, arg1)) {
            if (arg0 >= -40) {
                method1370(126, -103, 36, (class134) null);
            }
            return class117.method834(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)V")
    public static final void method1371(int arg0, int arg1) {
        field3271++;
        if (!class280.method1870(122, arg1)) {
            return;
        }
        int var2 = 46 / ((37 - arg0) / 48);
        class103[] var3 = class133.field2204[arg1];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class103 var5 = var3[var4];
            if (var5 != null) {
                var5.field1594 = 0;
                var5.field1633 = 0;
                var5.field1712 = 1;
            }
        }
    }
}
