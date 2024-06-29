import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class731 extends class766 {

    @OriginalMember(owner = "client!za", name = "n", descriptor = "I")
    public static int field10173;

    @OriginalMember(owner = "client!za", name = "o", descriptor = "I")
    public static int field10174;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIIILha;)V")
    public static final void method4054(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class475 arg7) {
        field10173++;
        class390.field5440 = arg7;
        class276.field3994 = class390.field5440.method463();
        class193.field2894 = class390.field5440.method463();
        class775.field10665 = class390.field5440.method463();
        class36.field432 = arg3;
        class388.field5420 = 1;
        class657.field9274 = arg4;
        class172.field2590 = arg5;
        if (arg1 < 100) {
            method4055(null, null, (byte) -90);
        }
        class300.field4327 = arg0;
        class29.field313 = null;
        class754.field10490 = 0;
        class359.field5087 = 0;
        class747.method4115(arg6, arg2, -5321);
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Luf;Lha;B)V")
    public static final void method4055(class519 arg0, class475 arg1, byte arg2) {
        field10174++;
        boolean var3 = class422.field5873.method2942(arg0.field7194, arg0.field7137, arg1, arg2 - 241, arg0.field7290 | 0xFF000000, arg0.field7132, arg0.field7279 ? class719.field10041.field207 : null, arg0.field7129) == null;
        if (var3) {
            class39.field454.method3728((byte) 117, new class474(arg0.field7129, arg0.field7132, arg0.field7137, arg0.field7290 | 0xFF000000, arg0.field7194, arg0.field7279));
            class172.method1268(arg0, arg2 ^ 0xFFFFFFA2);
        }
        if (arg2 != 113) {
            method4055(null, null, (byte) 13);
        }
    }
}
