import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class70 extends class166 {

    @OriginalMember(owner = "client!af", name = "r", descriptor = "J")
    public long field1120;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "Z")
    public static boolean field1121 = false;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public static int field1119 = 0;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1122 = "Loaded sprites";

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V")
    public static final void method504(int arg0, int arg1) {
        field1123++;
        class28.field389.method1897(true, arg0);
        if (arg1 != 0) {
            method505((byte) 40);
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(B)Lai;")
    public static final class88 method505(byte arg0) {
        field1124++;
        class88 var1 = new class88(34);
        var1.method654((byte) -120, 11);
        var1.method654((byte) -117, class50.field740);
        var1.method654((byte) -98, class218.field3365 ? 1 : 0);
        var1.method654((byte) -118, class132.field2070 ? 1 : 0);
        var1.method654((byte) -106, class132.field2072 ? 1 : 0);
        var1.method654((byte) -109, class210.field3264 ? 1 : 0);
        var1.method654((byte) -109, class77.field1260 ? 1 : 0);
        var1.method654((byte) -113, class147.field2331 ? 1 : 0);
        var1.method654((byte) -122, class170.field2648 ? 1 : 0);
        var1.method654((byte) -114, class19.field291 ? 1 : 0);
        var1.method654((byte) -102, class190.field2948);
        var1.method654((byte) -113, class197.field3116 ? 1 : 0);
        var1.method654((byte) -110, class293.field4622 ? 1 : 0);
        var1.method654((byte) -103, class179.field2790 ? 1 : 0);
        var1.method654((byte) -115, class158.field2461);
        var1.method654((byte) -116, class155.field2407 ? 1 : 0);
        var1.method654((byte) -94, class18.field272);
        var1.method654((byte) -123, class294.field4633);
        var1.method654((byte) -108, class86.field1445);
        var1.method634(class135.field2101, 48);
        var1.method634(class86.field1456, 81);
        var1.method654((byte) -127, class67.method494());
        var1.method639(class112.field1839, (byte) -115);
        var1.method654((byte) -105, class181.field2829);
        var1.method654((byte) -118, class82.field1385 ? 1 : 0);
        var1.method654((byte) -99, class109.field1782 ? 1 : 0);
        if (arg0 < 101) {
            return null;
        } else {
            var1.method654((byte) -116, class106.field1754);
            var1.method654((byte) -94, class105.field1751 ? 1 : 0);
            var1.method654((byte) -118, class10.field171 ? 1 : 0);
            return var1;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIILji;IJZ)Z")
    public static final boolean method506(int arg0, int arg1, int arg2, int arg3, int arg4, class43 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class60.method454(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class70() {
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(J)V")
    public class70(long arg0) {
        this.field1120 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(B)V")
    public static void method507(byte arg0) {
        if (arg0 != 33) {
            method507((byte) -127);
        }
        field1122 = null;
    }
}
