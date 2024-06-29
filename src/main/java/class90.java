import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class90 {

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "Llh;")
    public static class320 field1264 = new class320(5000);

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field1265 = 0;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "[I")
    public static int[] field1267 = new int[100];

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1269 = "M";

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V", line = 4)
    public static void method687(int arg0) {
        field1267 = null;
        field1269 = null;
        field1264 = null;
        int var1 = -42 / ((arg0 - 62) / 56);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BII)V", line = 15)
    public static final void method688(byte arg0, int arg1, int arg2) {
        field1266++;
        class210.field3044 = class56.field765 + class42.field481 - arg2 - 1;
        int var3 = 79 % ((71 - arg0) / 39);
        class126.field1721 = arg1 - class174.field2374;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V", line = 29)
    public static final void method689(int arg0) {
        class8.field84.method724(0);
        if (arg0 != -25591) {
            method690(48, (byte) -20);
        }
        field1261++;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)V", line = 44)
    public static final void method690(int arg0, byte arg1) {
        if (arg1 != -76) {
            field1269 = (String) null;
        }
        field1262++;
        class1.field14.method720(arg0, 1088);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIILdn;IJ)Z", line = 75)
    public static final boolean method691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class132 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class189.method1321(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }
}
