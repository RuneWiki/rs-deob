import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class27 {

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Lob;")
    public static class521 field327 = new class521(32, 4);

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Lob;")
    public static class521 field329 = new class521(82, 12);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method186(int arg0) {
        field327 = null;
        field329 = null;
        if (arg0 != 12) {
            method186(51);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg9 != 0) {
            field329 = null;
        }
        if (class327.field4931 <= arg7 && arg7 <= class184.field2777 && class327.field4931 <= arg2 && class184.field2777 >= arg2 && arg4 >= class327.field4931 && class184.field2777 >= arg4 && arg8 >= class327.field4931 && arg8 <= class184.field2777 && class404.field5987 <= arg0 && class433.field6414 >= arg0 && class404.field5987 <= arg6 && arg6 <= class433.field6414 && arg5 >= class404.field5987 && class433.field6414 >= arg5 && arg1 >= class404.field5987 && arg1 <= class433.field6414) {
            class454.method2762(104, arg3, arg6, arg2, arg0, arg7, arg1, arg4, arg8, arg5);
        } else {
            class501.method2967(arg7, arg0, arg2, arg1, (byte) 81, arg4, arg3, arg5, arg8, arg6);
        }
        field325++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIB)V")
    public static final void method188(int arg0, int arg1, byte arg2) {
        int var3 = -25 / ((arg2 - 22) / 54);
        field328++;
        class211 var4 = class452.method2749(6, 127, arg0);
        var4.method1463(0);
        var4.field3441 = arg1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)[B")
    public static final synchronized byte[] method189(int arg0, boolean arg1) {
        field326++;
        if (arg0 == 100 && class177.field2643 > 0) {
            byte[] var2 = class113.field1575[--class177.field2643];
            class113.field1575[class177.field2643] = null;
            return var2;
        } else if (arg0 == 5000 && class128.field1878 > 0) {
            byte[] var3 = class500.field7183[--class128.field1878];
            class500.field7183[class128.field1878] = null;
            return var3;
        } else if (arg0 == 30000 && class52.field640 > 0) {
            byte[] var4 = class274.field4191[--class52.field640];
            class274.field4191[class52.field640] = null;
            return var4;
        } else if (arg1) {
            return new byte[arg0];
        } else {
            return null;
        }
    }
}
