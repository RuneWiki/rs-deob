import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class299 {

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "Z")
    public static boolean field3998 = false;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "[I")
    public static int[] field3999 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "Lnn;")
    public static class446 field3996 = new class446(6, 16);

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "F")
    public static float field4000 = 1.0F;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method1782(int arg0, int arg1) {
        field3997++;
        if (~arg0 == arg1 && class330.field4836 > 0) {
            byte[] var2 = class172.field2151[--class330.field4836];
            class172.field2151[class330.field4836] = null;
            return var2;
        } else if (arg0 == 5000 && class394.field5650 > 0) {
            byte[] var3 = class33.field319[--class394.field5650];
            class33.field319[class394.field5650] = null;
            return var3;
        } else if (arg0 == 30000 && class514.field7006 > 0) {
            byte[] var4 = class120.field1536[--class514.field7006];
            class120.field1536[class514.field7006] = null;
            return var4;
        } else {
            if (class401.field5698 != null) {
                for (int var5 = 0; var5 < class331.field4846.length; var5++) {
                    if (class331.field4846[var5] == arg0 && class314.field4522[var5] > 0) {
                        byte[] var6 = class401.field5698[var5][--class314.field4522[var5]];
                        class401.field5698[var5][class314.field4522[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
    public static void method1783(int arg0) {
        if (arg0 != 0) {
            field3996 = null;
        }
        field3996 = null;
        field3999 = null;
    }
}
