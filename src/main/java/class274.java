import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class274 extends class189 {

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "Llc;")
    public static class143 field4871 = class66.method374("", -1);

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public static int field4876 = 0;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public static int field4877 = 0;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field4870 = 1;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "Llc;")
    private static class143 field4880 = class66.method374("Please wait)3)3)3", -1);

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "Llc;")
    public static class143 field4874 = field4880;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "Lvh;")
    public static class43 field4875;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lld;IIIZB)V")
    public static final void method1805(class104 arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        field4872++;
        if (class187.field3388 >= 50 || arg0.field1844 == null || arg1 >= arg0.field1844.length || arg0.field1844[arg1] == null || arg5 != -66) {
            return;
        }
        int var6 = arg0.field1844[arg1][0];
        int var7 = var6 >> 8;
        int var8 = (var6 & 0x75) >> 4;
        if (arg0.field1844[arg1].length > 1) {
            int var9 = (int) (Math.random() * (double) arg0.field1844[arg1].length);
            if (var9 > 0) {
                var7 = arg0.field1844[arg1][var9];
            }
        }
        int var10 = var6 & 0xF;
        if (var10 == 0) {
            if (arg4) {
                class190.method1273(var7, (byte) 103, 0, var8);
            }
        } else if (class58.field1117 != 0) {
            int var11 = (arg2 - 64) / 128;
            int var12 = (arg3 - 64) / 128;
            class190.field3489[class187.field3388] = var7;
            class89.field1615[class187.field3388] = var8;
            class56.field1084[class187.field3388] = 0;
            class75.field1403[class187.field3388] = null;
            class149.field2741[class187.field3388] = (var11 << 8) + (var12 << 16) + var10;
            class187.field3388++;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)Llc;")
    public static final class143 method1806(int arg0, boolean arg1) {
        if (!arg1) {
            field4875 = null;
        }
        field4873++;
        return class37.method246((byte) 43, 10, false, arg0);
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
    public static void method1807(int arg0) {
        field4874 = null;
        field4880 = null;
        if (arg0 != 0) {
            method1805((class104) null, 102, 109, -120, true, (byte) -54);
        }
        field4871 = null;
        field4875 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1808(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class166 var5 = class262.method1746(-70, arg2, 8);
        field4878++;
        var5.method1097((byte) -74);
        if (arg4) {
            method1808(21, -13, -45, 29, true);
        }
        var5.field2978 = arg0;
        var5.field2976 = arg1;
        var5.field2979 = arg3;
    }
}
