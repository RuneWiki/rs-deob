import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class330 {

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "Lhi;")
    public static class131 field4939 = new class131(9, 0, 4, 1);

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "[Lwr;")
    public static class303[] field4945 = new class303[4];

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "[I")
    public static int[] field4944 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field4948 = 0;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "Lig;")
    public static class154 field4946;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "[B")
    public byte[] field4942;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "[S")
    public short[] field4940;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "[S")
    public short[] field4943;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "[S")
    public short[] field4947;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lia;I)V")
    public static final void method2049(class399 arg0, int arg1) {
        field4941++;
        if (arg1 != -21566) {
            method2051(-17);
        }
        for (int var2 = 0; var2 < class287.field4352; var2++) {
            int var3 = class341.field5098[var2];
            class47 var4 = class224.field3450[var3];
            int var5 = arg0.method257((byte) 67);
            if ((var5 & 0x80) != 0) {
                var5 += arg0.method257((byte) 103) << 8;
            }
            if ((var5 & 0x2000) != 0) {
                var5 += arg0.method257((byte) 75) << 16;
            }
            class282.method1721(var5, arg0, arg1 + 21669, var3, var4);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)I")
    public static int method2050(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
    public static void method2051(int arg0) {
        if (arg0 != 36064) {
            method2051(58);
        }
        field4946 = null;
        field4944 = null;
        field4939 = null;
        field4945 = null;
    }
}
