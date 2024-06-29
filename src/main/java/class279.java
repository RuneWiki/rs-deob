import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class279 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4473 = "Walk here";

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field4474 = 0;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "[I")
    public static int[] field4478 = new int[200];

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILdk;Ldk;)I")
    public static final int method1876(int arg0, class251 arg1, class251 arg2) {
        field4480++;
        int var3 = arg0;
        if (arg2.method1698((byte) 77, class49.field815)) {
            var3 = arg0 + 1;
        }
        if (arg2.method1698((byte) 62, class257.field4159)) {
            var3++;
        }
        if (arg2.method1698((byte) 88, class255.field4135)) {
            var3++;
        }
        if (arg1.method1698((byte) 93, class49.field815)) {
            var3++;
        }
        if (arg1.method1698((byte) 112, class257.field4159)) {
            var3++;
        }
        if (arg1.method1698((byte) 117, class255.field4135)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static void method1877(byte arg0) {
        field4473 = null;
        field4478 = null;
        if (arg0 != 109) {
            field4474 = 36;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lwd;Ljava/lang/String;B)I")
    public static final int method1878(class162 arg0, String arg1, byte arg2) {
        field4475++;
        int var3 = arg0.field2568;
        byte[] var4 = class187.method1341(382, arg1);
        arg0.method1167(var4.length, (byte) -113);
        arg0.field2568 += class46.field774.method849(60, arg0.field2568, var4.length, arg0.field2573, var4, 0);
        if (arg2 < 72) {
            method1876(-93, (class251) null, (class251) null);
        }
        return arg0.field2568 - var3;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V")
    public static final void method1879(int arg0, int arg1) {
        class68.field1132 = -1;
        field4476++;
        class68.field1132 = -1;
        int var2 = 92 % ((arg0 + 66) / 51);
        class129.field2029 = arg1;
        class132.method934(0);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
    public static final void method1880(boolean arg0) {
        field4477++;
        class115.field1845.method1255(-113);
        class49.field811.method1255(-106);
        if (arg0) {
            method1881(true, 73, 18, -125, 24, 31, 90, -25, -79, -14);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZIIIIIIIII)V")
    public static final void method1881(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (!arg0) {
            method1881(true, -69, -48, -42, -87, -63, 100, 54, 24, -48);
        }
        if (class82.field1374 <= arg4 && class259.field4188 >= arg4 && class82.field1374 <= arg7 && arg7 <= class259.field4188 && arg8 >= class82.field1374 && arg8 <= class259.field4188 && arg2 >= class82.field1374 && arg2 <= class259.field4188 && arg1 >= class85.field1409 && class234.field3774 >= arg1 && class85.field1409 <= arg9 && class234.field3774 >= arg9 && arg6 >= class85.field1409 && arg6 <= class234.field3774 && arg3 >= class85.field1409 && arg3 <= class234.field3774) {
            class162.method1129(arg3, (byte) -50, arg4, arg2, arg7, arg5, arg6, arg1, arg8, arg9);
        } else {
            class269.method1806(arg8, (byte) 52, arg9, arg1, arg6, arg5, arg3, arg7, arg4, arg2);
        }
        field4479++;
    }
}
