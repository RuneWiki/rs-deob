import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class155 {

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "Luv;")
    public static class2 field2346 = new class2(25, -1);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIII)V", line = 5)
    public static final void method1114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class355 var7 = new class355();
        var7.field5447 = arg1 >> class9.field75;
        var7.field5441 = arg2 >> class9.field75;
        var7.field5456 = arg3 >> class9.field75;
        var7.field5438 = arg4 >> class9.field75;
        var7.field5453 = arg0;
        var7.field5442 = arg1;
        var7.field5452 = arg2;
        var7.field5449 = arg3;
        var7.field5457 = arg4;
        var7.field5460 = arg5;
        var7.field5439 = arg6;
        class426.field6353[class146.field2190++] = var7;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ldr;I)V", line = 20)
    public static final void method1115(class293 arg0, int arg1) {
        for (int var2 = 0; var2 < class491.field7321; var2++) {
            int var3 = class488.field7283[var2];
            class480 var4 = class83.field1327[var3];
            int var5 = arg0.method2765(52);
            if ((var5 & 0x40) != 0) {
                var5 += arg0.method2765(80) << 8;
            }
            if ((var5 & 0x200) != 0) {
                var5 += arg0.method2765(74) << 16;
            }
            class265.method1658(var3, (byte) -1, var5, var4, arg0);
        }
        field2344++;
        if (arg1 != 2143) {
            field2346 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 52)
    public static void method1116(int arg0) {
        if (arg0 > -102) {
            field2347 = -111;
        }
        field2346 = null;
    }
}
