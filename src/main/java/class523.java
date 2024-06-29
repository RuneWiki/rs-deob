import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class523 {

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "Z")
    public static boolean field7651 = false;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIILku;Lqa;)V")
    public static final void method3107(int arg0, int arg1, int arg2, int arg3, class261 arg4, class167 arg5) {
        field7652++;
        class368 var6 = class389.field5528.method2881(arg4.field3879, (byte) -52);
        if (var6.field5314 == -1) {
            return;
        }
        if (arg3 != -14008) {
            method3107(21, -9, 54, -87, null, null);
        }
        int var7;
        if (arg4.field3910) {
            int var8 = arg4.field3893 + arg1;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class343 var9 = var6.method2257(var7, arg5, arg3 ^ 0xFFFFFF4B, arg4.field3881);
        if (var9 == null) {
            return;
        }
        int var10 = arg4.field3864;
        int var11 = arg4.field3859;
        if ((var7 & 0x1) == 1) {
            var10 = arg4.field3859;
            var11 = arg4.field3864;
        }
        int var12 = var9.method376();
        int var13 = var9.method374();
        if (var6.field5318) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field5315 == 0) {
            var9.method2169(arg0, arg2 + 4 - (var11 * 4), var12, var13);
        } else {
            var9.method372(arg0, arg2 - ((var11 - 1) * 4), var12, var13, 0, var6.field5315 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V")
    public static final void method3108(byte arg0) {
        class375.field5394.method535((byte) -117);
        field7650++;
        if (arg0 != -62) {
            method3107(-31, -120, -128, -15, null, null);
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class327.field4813[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class245.field3673[var2] = 0L;
        }
        class96.field1524 = 0;
    }
}
