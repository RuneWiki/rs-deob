import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class26 extends class158 {

    @OriginalMember(owner = "client!wb", name = "lb", descriptor = "I")
    public static int field537 = 0;

    @OriginalMember(owner = "client!wb", name = "nb", descriptor = "[I")
    public static int[] field539 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!wb", name = "ob", descriptor = "Lqk;")
    public static class207 field540 = class24.method212(255, ")2");

    @OriginalMember(owner = "client!wb", name = "kb", descriptor = "Lqk;")
    public static class207 field536 = class24.method212(255, "");

    @OriginalMember(owner = "client!wb", name = "rb", descriptor = "I")
    public static int field543 = 1;

    @OriginalMember(owner = "client!wb", name = "jb", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!wb", name = "mb", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!wb", name = "pb", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!wb", name = "qb", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method32(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field541;
            int[][] var3 = super.field3002.method427(arg0, 239);
            if (super.field3002.field1077 && this.method1154((byte) 122)) {
                int[] var4 = var3[1];
                int[] var5 = var3[0];
                int[] var6 = var3[2];
                int var7 = arg0 % super.field2803 * super.field2803;
                for (int var8 = 0; var8 < class88.field1595; ++var8) {
                    int var9 = super.field2793[var7 - -(var8 % super.field2801)];
                    var6[var8] = class121.method860(var9 << 4, 4080);
                    var4[var8] = class121.method860(var9 >> 4, 4080);
                    var5[var8] = class121.method860(var9 >> 12, 4080);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Lfl;")
    public static final class240 method216(int arg0, int arg1) {
        ++field542;
        class240 var2 = (class240) class108.field1917.method1387((long) arg1, arg0 + 117);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class120.field2090.method705(arg0, arg1, -1);
            class240 var4 = new class240();
            if (var3 != null) {
                var4.method1699(arg1, (byte) 9, new class149(var3));
            }
            class108.field1917.method1385((long) arg1, var4, (byte) -114);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "(I)V")
    public static void method217(int arg0) {
        field539 = null;
        if (arg0 != 1) {
            field543 = 90;
        }
        field536 = null;
        field540 = null;
    }
}
