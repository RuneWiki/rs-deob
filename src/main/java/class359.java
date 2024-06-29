import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class359 extends class366 {

    @OriginalMember(owner = "client!re", name = "C", descriptor = "Lwn;")
    public class431 field5180;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "I")
    public static int field5181 = 0;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "Z")
    public static boolean field5185 = false;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "I")
    public static int field5186 = 0;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "Lpm;")
    public static class349 field5182 = new class349("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!re", name = "B", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(Z)V")
    public static void method2336(boolean arg0) {
        if (arg0) {
            field5182 = null;
        }
        field5182 = null;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lwn;)V")
    public class359(class431 arg0) {
        this.field5180 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIII)Lro;")
    public static final class1 method2337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5184++;
        long var7 = (long) arg0 * 32147369L ^ (long) arg4 * 986053L ^ (long) arg3 * 97549L ^ (long) arg6 * 67481L ^ (long) arg2 * 475427L ^ (long) arg1 * 76724863L;
        class1 var9 = (class1) class450.field6447.method99(true, var7);
        if (var9 == null) {
            class1 var10 = class390.field5490.method1014(arg6, arg3, arg2, arg4, arg0, arg1);
            class450.field6447.method90(var10, var7, arg5 ^ arg5);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)Z")
    public static final boolean method2338(int arg0, int arg1) {
        class306.field4472 = arg1 + 1 & 0xFFFF;
        field5179++;
        if (arg0 > -116) {
            field5185 = false;
        }
        class299.field4338 = true;
        return true;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)Lso;")
    public static final class276 method2339(int arg0) {
        field5183++;
        if (arg0 != -14763) {
            method2338(109, -31);
        }
        class276 var1 = (class276) class233.field3444.method1053(100);
        if (var1 != null) {
            var1.method2660((byte) 126);
            var1.method2365(true);
            return var1;
        }
        class276 var2;
        do {
            var2 = (class276) class196.field2816.method1053(52);
            if (var2 == null) {
                return null;
            }
            if (var2.method1875(82) > class18.method107(-16145)) {
                return null;
            }
            var2.method2660((byte) 113);
            var2.method2365(true);
        } while ((var2.field5232 & Long.MIN_VALUE) == 0L);
        return var2;
    }
}
